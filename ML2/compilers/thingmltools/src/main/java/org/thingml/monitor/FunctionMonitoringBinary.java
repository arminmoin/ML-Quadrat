/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 */
package org.thingml.monitor;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.thingml.xtext.helpers.ActionHelper;
import org.thingml.xtext.helpers.AnnotatedElementHelper;
import org.thingml.xtext.thingML.Action;
import org.thingml.xtext.thingML.ActionBlock;
import org.thingml.xtext.thingML.Function;
import org.thingml.xtext.thingML.IntegerLiteral;
import org.thingml.xtext.thingML.LocalVariable;
import org.thingml.xtext.thingML.Message;
import org.thingml.xtext.thingML.Parameter;
import org.thingml.xtext.thingML.Port;
import org.thingml.xtext.thingML.PrimitiveType;
import org.thingml.xtext.thingML.Property;
import org.thingml.xtext.thingML.PropertyReference;
import org.thingml.xtext.thingML.ReturnAction;
import org.thingml.xtext.thingML.SendAction;
import org.thingml.xtext.thingML.Thing;
import org.thingml.xtext.thingML.ThingMLFactory;
import org.thingml.xtext.thingML.TypeRef;

public class FunctionMonitoringBinary implements MonitoringAspect {
		
	final Thing thing;
	final Property id;
	final Port monitoringPort;
	final Message onFunctionCalled;
	final TypeRef byteTypeRef;
	
	public FunctionMonitoringBinary(Thing thing, Property id, Port monitoringPort, Message msg, TypeRef byteTypeRef) {
		this.thing = thing;
		this.id = id;
		this.monitoringPort = monitoringPort;
		this.onFunctionCalled = msg;
		this.byteTypeRef = byteTypeRef;
	}
	
	protected int funcSize(Function f) {
		int size = 3; //b[0]=instance, b[1]=function, b[2]=return type
		if (f.getTypeRef() != null) {
			size += ((PrimitiveType)f.getTypeRef().getType()).getByteSize();
		}
		for(Parameter p : f.getParameters()) {
			size += ((PrimitiveType)p.getTypeRef().getType()).getByteSize();
		}
		return size;
	}
	
	protected void setArray(LocalVariable va, Function f) {
		//TODO: set all values except serialized return value
	}

	@Override
	public void monitor() {  
		
    	for(Function f : thing.getFunctions()) {//FIXME: need one array per function
    		if (f.isAbstract()) continue;
    		if (AnnotatedElementHelper.isDefined(f, "monitor", "not")) continue;
    		
    		//Create the byte array containing log info for that function
    		final LocalVariable va = ThingMLFactory.eINSTANCE.createLocalVariable();
    		va.setReadonly(true);
    		va.setName(f.getName() + "_log");
    		final TypeRef tr = EcoreUtil.copy(byteTypeRef);
    		final IntegerLiteral il = ThingMLFactory.eINSTANCE.createIntegerLiteral();
    		il.setIntValue(funcSize(f));
    		tr.setCardinality(il);
    		va.setTypeRef(byteTypeRef);
    		
    		    		        	
        	//Send monitoring message before each return statement (or as the first statement in the function)
        	if (f.getTypeRef() == null) {
        		ActionBlock block;
        		if (f.getBody() instanceof ActionBlock) {
        			block = (ActionBlock) f.getBody();
        		} else {
        			block = ThingMLFactory.eINSTANCE.createActionBlock();
        			block.getActions().add(f.getBody());
        		}
   
        		block.getActions().add(0, va);
        		setArray(va, f);
        		final Action send = buildSendAction(f, va);        		
        		block.getActions().add(0, send);
        	} else {
        		for(ReturnAction ra : ActionHelper.getAllActions(f, ReturnAction.class)) {
        			ActionBlock block;
        			if (ra.eContainer() instanceof ActionBlock) {
        				block = (ActionBlock) ra.eContainer();
        			} else {
            			block = ThingMLFactory.eINSTANCE.createActionBlock();            			
            			final Object parent = ra.eContainer().eGet(ra.eContainingFeature());
            			if (parent instanceof EList) {
            				EList list = (EList) parent;
            				final int index = list.indexOf(ra);
            				list.add(index, block);
            				list.remove(ra);
            			} else {
            				final EObject o = ra.eContainer();
            				o.eSet(ra.eContainingFeature(), block);
            			}
            			block.getActions().add(ra);
        			}
        			
        			//Assign return expression to a readonly local variable
        			final LocalVariable var_return = ThingMLFactory.eINSTANCE.createLocalVariable();
        			var_return.setName("return_" + ra.eContainer().eContents().indexOf(ra));
        			var_return.setReadonly(true);
        			var_return.setTypeRef(EcoreUtil.copy(f.getTypeRef()));
        			var_return.setInit(EcoreUtil.copy(ra.getExp()));
        			
        			final PropertyReference ref_var = ThingMLFactory.eINSTANCE.createPropertyReference();
                	ref_var.setProperty(var_return);
                	ra.setExp(ref_var);
        			block.getActions().add(block.getActions().indexOf(ra), var_return);
        				        			     			
            		
                	setArray(va, f);
                	//TODO: Set serialized return value into array 
        			final Action send = buildSendAction(f, va);        		
            		block.getActions().add(block.getActions().indexOf(ra), send);    		            		
        		}
        		
        	}
    	}
    }


	private Action buildSendAction(Function f, LocalVariable va) {
		final SendAction send = ThingMLFactory.eINSTANCE.createSendAction();
		send.setMessage(onFunctionCalled);
		send.setPort(monitoringPort);
		final PropertyReference va_ref = ThingMLFactory.eINSTANCE.createPropertyReference();
		va_ref.setProperty(va);
		send.getParameters().add(va_ref);
		return send;
		
		//TODO: refactor code below into setArray method
		/*final StringLiteral name_exp = ThingMLFactory.eINSTANCE.createStringLiteral();
		name_exp.setStringValue(f.getName());        	
		send.getParameters().add(name_exp);
		if (f.getTypeRef() == null) {
			send.getParameters().add(EcoreUtil.copy(void_));
			send.getParameters().add(EcoreUtil.copy(empty));
		} else {
			final StringLiteral type_exp = ThingMLFactory.eINSTANCE.createStringLiteral();
    		type_exp.setStringValue(f.getTypeRef().getType().getName());
			send.getParameters().add(type_exp);
			send.getParameters().add(ref_var);
		}
		
		if (f.getParameters().isEmpty()) {
			send.getParameters().add(EcoreUtil.copy(empty));
			return send;
		} else {//FIXME: this will only work for target languages where we can + strings (all except posix/arduino as of now)
			final LocalVariable lv = ThingMLFactory.eINSTANCE.createLocalVariable();
			lv.setName("params");
			lv.setTypeRef(EcoreUtil.copy(stringTypeRef));
			lv.setReadonly(true);
			Expression init = EcoreUtil.copy(empty);
			final ActionBlock block = ThingMLFactory.eINSTANCE.createActionBlock();
    		block.getActions().add(lv);
			for(Parameter param : f.getParameters()) {
				final PlusExpression concat = ThingMLFactory.eINSTANCE.createPlusExpression();	
				final ExpressionGroup group_name = ThingMLFactory.eINSTANCE.createExpressionGroup();
				final ExpressionGroup group = ThingMLFactory.eINSTANCE.createExpressionGroup();
				final PlusExpression plus_comma = ThingMLFactory.eINSTANCE.createPlusExpression();
				final PlusExpression plus_name = ThingMLFactory.eINSTANCE.createPlusExpression();
				final StringLiteral name = ThingMLFactory.eINSTANCE.createStringLiteral();
				name.setStringValue(param.getName() + "=");
				final CastExpression asString = ThingMLFactory.eINSTANCE.createCastExpression();
				final PropertyReference r_ref = ThingMLFactory.eINSTANCE.createPropertyReference();
				r_ref.setProperty(param);
				asString.setTerm(r_ref);
				asString.setType(stringTypeRef.getType());
				plus_comma.setLhs(asString);
				plus_comma.setRhs(EcoreUtil.copy(comma));
				group.setTerm(plus_comma);
				plus_name.setLhs(name);
				plus_name.setRhs(group);
				group_name.setTerm(plus_name);
				concat.setLhs(init);
				concat.setRhs(group_name);
				init = concat;
			}
			lv.setInit(init);
			block.getActions().add(lv);
		
			final PropertyReference lv_ref = ThingMLFactory.eINSTANCE.createPropertyReference();
			lv_ref.setProperty(lv);
			send.getParameters().add(lv_ref);      		    	
    		block.getActions().add(send);
    		return block;
		}*/
	}
	
}
