/*
 * generated by Xtext 2.10.0
 */
package org.thingml.xtext.scoping

/**
 * Extended by Armin Moin, moin@in.tum.de, moin@arminmoin.de
 */

import java.util.ArrayList
import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.thingml.xtext.constraints.ThingMLHelpers
import org.thingml.xtext.helpers.ConfigurationHelper
import org.thingml.xtext.helpers.ThingMLElementHelper
import org.thingml.xtext.thingML.CompositeState
import org.thingml.xtext.thingML.ConfigPropertyAssign
import org.thingml.xtext.thingML.Configuration
import org.thingml.xtext.thingML.Connector
import org.thingml.xtext.thingML.Decrement
import org.thingml.xtext.thingML.EnumLiteralRef
import org.thingml.xtext.thingML.EventReference
import org.thingml.xtext.thingML.ExternalConnector
import org.thingml.xtext.thingML.Increment
import org.thingml.xtext.thingML.Instance
import org.thingml.xtext.thingML.Port
import org.thingml.xtext.thingML.PropertyAssign
import org.thingml.xtext.thingML.PropertyReference
import org.thingml.xtext.thingML.ReceiveMessage
import org.thingml.xtext.thingML.Region
import org.thingml.xtext.thingML.SendAction
import org.thingml.xtext.thingML.Session
import org.thingml.xtext.thingML.StartSession
import org.thingml.xtext.thingML.State
import org.thingml.xtext.thingML.Thing
import org.thingml.xtext.thingML.ThingMLPackage
import org.thingml.xtext.thingML.Transition
import org.thingml.xtext.thingML.VariableAssignment
import org.thingml.xtext.thingML.StateContainer
import java.util.Arrays
import java.util.List
import java.util.Collections
import org.thingml.xtext.thingML.DataAnalytics
import org.thingml.xtext.thingML.Message
import com.google.common.collect.Iterables
import org.thingml.xtext.thingML.DAPreprocessAction
import org.thingml.xtext.thingML.DATrainAction
import org.thingml.xtext.thingML.DAPredictAction
import org.thingml.xtext.services.ThingMLGrammarAccess.DASaveActionElements
import org.thingml.xtext.thingML.DASaveAction
import org.thingml.xtext.thingML.Action
import org.thingml.xtext.thingML.DAPreTrainedPredictAction

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class ThingMLScopeProvider extends AbstractThingMLScopeProvider {

	private val p = ThingMLPackage.eINSTANCE;

	override getScope(EObject context, EReference reference) {
		
		if (reference == p.port_Receives || reference == p.port_Sends) {
			return scopeForPort_SendsReceives(context as Port);
		}
		else if (reference == p.sendAction_Port) {
			return scopeForSendAction_Port(context as SendAction);
		}
		else if (reference == p.sendAction_Message) {
			return scopeForSendAction_Message(context as SendAction);
		}
		else if (reference == p.configPropertyAssign_Property) {
			return scopeForConfigPropertyAssign_Property(context as ConfigPropertyAssign);
		}
		else if (reference == p.connector_Cli || reference == p.connector_Srv) {
			return scopeForConnector_CliSrV(context as Connector);
		}
		else if (reference == p.connector_Provided) {
			return scopeForConnector_Provided(context as Connector);
		}
		else if (reference == p.connector_Required) {
			return scopeForConnector_Required(context as Connector);
		}
		else if (reference == p.decrement_Var) {
			return scopeForDecrement_Var(context as Decrement);
		}
		else if (reference == p.enumLiteralRef_Enum) {
			return scopeForEnumLiteralRef_Enum(context as EnumLiteralRef);
		}
		else if (reference == p.enumLiteralRef_Literal) {
			return scopeForEnumLiteralRef_Literal(context as EnumLiteralRef);
		}
		else if (reference == p.externalConnector_Port) {
			return scopeForExternalConnector_Port(context as ExternalConnector);
		}
		else if (reference == p.externalConnector_Protocol) {
			return scopeForExternalConnector_Protocol(context as ExternalConnector);
		}
		else if (reference == p.functionCallExpression_Function || reference == p.functionCallStatement_Function ) {
			return scopeForFunctionCallExpressionFunctionCallStatement_Function(context);
		}
		else if (reference == p.increment_Var) {
			return scopeForIncrement_Var(context as Increment);
		}
		else if (reference == p.instance_Type) {
			return scopeForInstance_Type(context as Instance);
		}
		else if (reference == p.propertyAssign_Property) {
			return scopeForPropertyAssign_Property(context as PropertyAssign);
		}
		else if (reference == p.propertyReference_Property) {
			return scopeForPropertyReference_Property(context as PropertyReference);
		}
		else if (reference == p.receiveMessage_Port) {
			return scopeForReceiveMessage_Port(context as ReceiveMessage);
		}
		else if (reference == p.receiveMessage_Message) {
			return scopeForReceiveMessage_Message(context as ReceiveMessage);
		}
		else if (reference == p.startSession_Session) {
			return scopeForStartSession_Session(context as StartSession);
		}
		else if (reference == p.thing_Includes) {
			return scopeForThing_Includes(context as Thing);
		}
		
		else if (reference == p.transition_Target) {
			return scopeForTransition_Target(context as Transition);
		}
		else if (reference == p.typeRef_Type) {
			return scopeForTypeRef_Type(context);
		}
		else if (reference == p.castExpression_Type) {
			return scopeForCastExpression_Type(context);
		}
		else if (reference == p.variableAssignment_Property) {
			return scopeForVariableAssignment_Property(context as VariableAssignment);
		}
		else if (reference == p.stateContainer_Initial) {
			return scopeForStateContainer_Initial(context as StateContainer);
		}
		else if (reference == p.eventReference_ReceiveMsg) {
			return scopeForEventReference_ReceiveMsg(context as EventReference);
		}
		else if (reference == p.eventReference_Parameter) {
			return scopeForEventReference_Parameter(context as EventReference);
		}
		else if (reference == p.startSession_Session) {
			return scopeForStartSession_Session(context as StartSession);
		}
		else if (reference == p.configPropertyAssign_Instance || reference == p.connector_Cli || reference == p.connector_Srv || reference == p.externalConnector_Inst) {
			return scopeForConfigurationInstances(ThingMLElementHelper.findContainingConfiguration(context));
		}
		else if (reference == p.DASaveAction_DataAnalytics) { //ML2
			return scopeForDataAnalyticsSaveAction(context as DASaveAction)
		}
		else if (reference == p.DAPreprocessAction_DataAnalytics) { //ML2
			return scopeForDataAnalyticsPreprocessAction(context as DAPreprocessAction)
		}
		else if (reference == p.DATrainAction_DataAnalytics) { //ML2
			return scopeForDataAnalyticsTrainAction(context as DATrainAction)
		}
		else if (reference == p.DAPredictAction_DataAnalytics) { //ML2
			return scopeForDataAnalyticsPredictAction(context as DAPredictAction)
		}
		else if (reference == p.DAPredictAction_Features) { //ML2
			return scopeForDataAnalyticsPredictActionFeatures(context as DAPredictAction)
		}
		else if (reference == p.dataAnalytics_Features) { //ML2
			return scopeForDataAnalyticsFeatures(context as DataAnalytics)
		}
		else if (reference == p.dataAnalytics_PredictionResults) { //ML2
			return scopeForDataAnalyticsPredictionResults(context as DataAnalytics)
		}
		else if (reference == p.DAPreTrainedPredictAction_DataAnalytics) { //ML2
			return scopeForDataAnalyticsPreTrainedPredictAction(context as DAPreTrainedPredictAction)
		}
		else if (reference == p.DAPreTrainedPredictAction_Features) { //ML2
			return scopeForDataAnalyticsPreTrainedPredictActionFeatures(context as DAPreTrainedPredictAction)
		}
		else {
			System.out.println("INFO: Resolving reference : " + reference.name + " in Class " + (reference.eContainer as ENamedElement).getName);
		}

		// return super.getScope(context, reference)
		return Scopes.scopeFor( EMPTY ); // USING that to make sure nothing is resolved randomly

	}
	
	protected List EMPTY = Collections.EMPTY_LIST;
		
	def protected IScope scopeForStateContainer_Initial(StateContainer context) {
		Scopes.scopeFor(context.substate);
	}
	
	def protected IScope scopeForConfigurationInstances(Configuration context) {
		Scopes.scopeFor(ConfigurationHelper.allInstances(context));
	}
	
	def protected IScope scopeForSession_Initial(Session context) {
		Scopes.scopeFor( context.substate );
	}
	
	def protected IScope scopeForEventReference_ReceiveMsg(EventReference context) {
		var h = ThingMLHelpers.findContainingHandler(context)
		if (h==null) {
			Scopes.scopeFor( EMPTY );
		}
		else {
			Scopes.scopeFor(Arrays.asList(h.event))
		}
	}
	
	def protected IScope scopeForEventReference_Parameter(EventReference context) {
		
		if (context.receiveMsg != null && context.receiveMsg instanceof ReceiveMessage) {
			Scopes.scopeFor( (context.receiveMsg as ReceiveMessage).message.parameters ); 
		}
		else {
			Scopes.scopeFor( EMPTY );
		}
	}
	def protected IScope scopeForDataAnalyticsSaveAction(DASaveAction context) { //ML2
		Scopes.scopeFor(ThingMLHelpers.allDataAnalytics( ThingMLHelpers.findContainingThing(context)) )
	}
	def protected IScope scopeForDataAnalyticsPreprocessAction(DAPreprocessAction context) { //ML2
		Scopes.scopeFor( ThingMLHelpers.allDataAnalytics(ThingMLHelpers.findContainingThing(context)) );		
	}
	def protected IScope scopeForDataAnalyticsTrainAction(DATrainAction context) { //ML2
		Scopes.scopeFor( ThingMLHelpers.allDataAnalytics(ThingMLHelpers.findContainingThing(context)) );
	}
	def protected IScope scopeForDataAnalyticsPredictAction(DAPredictAction context) { //ML2
		Scopes.scopeFor( ThingMLHelpers.allDataAnalytics(ThingMLHelpers.findContainingThing(context)) );
	}
	def protected IScope scopeForDataAnalyticsPredictActionFeatures(DAPredictAction context) { //ML2
		Scopes.scopeFor( ThingMLHelpers.allProperties(ThingMLHelpers.findContainingThing(context)) );
	}	
	def protected IScope scopeForDataAnalyticsFeatures(DataAnalytics context) { //ML2
		Scopes.scopeFor( ThingMLHelpers.allProperties(context.eContainer as Thing) )
	}
	def protected IScope scopeForDataAnalyticsPredictionResults(DataAnalytics context) { //ML2
		Scopes.scopeFor( ThingMLHelpers.allProperties(context.eContainer as Thing) )
	}
	def protected IScope scopeForDataAnalyticsPreTrainedPredictAction(DAPreTrainedPredictAction context) { //ML2
		Scopes.scopeFor( ThingMLHelpers.allDataAnalytics(ThingMLHelpers.findContainingThing(context)) );
	}
	def protected IScope scopeForDataAnalyticsPreTrainedPredictActionFeatures(DAPreTrainedPredictAction context) { //ML2
		Scopes.scopeFor( ThingMLHelpers.allProperties(ThingMLHelpers.findContainingThing(context)) );
	}
	def protected IScope scopeForPort_SendsReceives(Port context) {
		Scopes.scopeFor( ThingMLHelpers.allMessages(context.eContainer as Thing) );
	}
	
	def protected IScope scopeForSendAction_Port(SendAction context) {
		Scopes.scopeFor( ThingMLHelpers.allPorts(ThingMLHelpers.findContainingThing(context)) );
	}
	
	def protected IScope scopeForSendAction_Message(SendAction context) {
		Scopes.scopeFor( context.port.sends );
	}
	
	def protected IScope scopeForConfigPropertyAssign_Property(ConfigPropertyAssign context) {
		Scopes.scopeFor( ThingMLHelpers.allProperties(context.instance.type) );
	}
	
	def protected IScope scopeForConnector_CliSrV(Connector context) {
		Scopes.scopeFor( ConfigurationHelper.allInstances(context.eContainer as Configuration) );
	}
	
	def protected IScope scopeForConnector_Provided(Connector context) {
		Scopes.scopeFor( ThingMLHelpers.allProvidedPorts(context.srv.type) ); 
	}
	
	def protected IScope scopeForConnector_Required(Connector context) {
		Scopes.scopeFor( ThingMLHelpers.allRequiredPorts(context.cli.type) ); 
	}
	
	def protected IScope scopeForDecrement_Var(Decrement context) {
		
		Scopes.scopeFor( ThingMLHelpers.allVisibleVariables(context) ); 
	}
	
	def protected IScope scopeForEnumLiteralRef_Enum(EnumLiteralRef context) {
		Scopes.scopeFor( ThingMLHelpers.allEnumerations(ThingMLHelpers.findContainingModel(context)) ); 
	}
	
	def protected IScope scopeForEnumLiteralRef_Literal(EnumLiteralRef context) {
		Scopes.scopeFor( context.enum.literals ); 
	}
	
	def protected IScope scopeForExternalConnector_Port(ExternalConnector context) {
		
		Scopes.scopeFor( ThingMLHelpers.allPorts(context.inst.type) );
	}
	
	def protected IScope scopeForExternalConnector_Protocol(ExternalConnector context) {
		Scopes.scopeFor( ThingMLHelpers.allProtocols(ThingMLHelpers.findContainingModel(context)) ); 
	}
	
	def protected IScope scopeForFunctionCallExpressionFunctionCallStatement_Function(EObject context) {
		Scopes.scopeFor( ThingMLHelpers.allFunctions(ThingMLHelpers.findContainingThing(context)) ); 
	}
	
	
	def protected IScope scopeForIncrement_Var(Increment context) {
		Scopes.scopeFor( ThingMLHelpers.allVisibleVariables(context) ); 
	}
	
	def protected IScope scopeForInstance_Type(Instance context) {
		Scopes.scopeFor( ThingMLHelpers.allThings(ThingMLHelpers.findContainingModel(context)) ); 
	}
	
	
	def protected IScope scopeForPropertyAssign_Property(PropertyAssign context) {
		
		val t = ThingMLHelpers.findContainingThing(context)
		if (t != null) return Scopes.scopeFor( ThingMLHelpers.allProperties(t) );
		
		val i = ThingMLHelpers.findContainingInstance(context)
		if (i != null) return Scopes.scopeFor( ThingMLHelpers.allProperties(i.type) );
		
		Scopes.scopeFor( EMPTY ); // Will not happen as long as there are no new usages of PropertyAssign
	}
	
	def protected IScope scopeForPropertyReference_Property(PropertyReference context) {
		Scopes.scopeFor( ThingMLHelpers.allVisibleVariables(context) ); 
	}
	
	def protected IScope scopeForReceiveMessage_Port(ReceiveMessage context) {
		Scopes.scopeFor( ThingMLHelpers.allPorts(ThingMLHelpers.findContainingThing(context)) );
	}
	
	def protected IScope scopeForReceiveMessage_Message(ReceiveMessage context) {
		Scopes.scopeFor( context.port.receives );		
	}
	
	def protected IScope scopeForReference_Reference(EObject context) {
		Scopes.scopeFor( EMPTY ); // TODO What is this ???
	}
	
	def protected IScope scopeForStartSession_Session(StartSession context) {
		Scopes.scopeFor( ThingMLHelpers.allVisibleSessions(context) ); 
	}
	
	def protected IScope scopeForThing_Includes(Thing context) {
		Scopes.scopeFor( ThingMLHelpers.allThings(ThingMLHelpers.findContainingModel(context)) ); 
	}
	

	def protected IScope scopeForTransition_Target(Transition context) {
		Scopes.scopeFor( ThingMLHelpers.allValidTargetStates(context.eContainer as State) ); 
	}
	
	def protected IScope scopeForTypeRef_Type(EObject context) {
		Scopes.scopeFor( ThingMLHelpers.allTypes(ThingMLHelpers.findContainingModel(context)) ); 
	}
	
	def protected IScope scopeForCastExpression_Type(EObject context) {
		Scopes.scopeFor( ThingMLHelpers.allTypes(ThingMLHelpers.findContainingModel(context)) ); 
	}
	
	
	def protected IScope scopeForVariableAssignment_Property(VariableAssignment context) {
		Scopes.scopeFor( ThingMLHelpers.allVisibleVariables(context) );
	}

}
 