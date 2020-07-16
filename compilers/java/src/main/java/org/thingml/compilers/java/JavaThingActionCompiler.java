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
package org.thingml.compilers.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.thingml.compilers.Context;
import org.thingml.compilers.thing.common.CommonThingActionCompiler;
import org.thingml.xtext.constraints.ThingMLHelpers;
import org.thingml.xtext.constraints.Types;
import org.thingml.xtext.helpers.AnnotatedElementHelper;
import org.thingml.xtext.helpers.ConfigurationHelper;
import org.thingml.xtext.helpers.ThingHelper;
import org.thingml.xtext.helpers.TyperHelper;
import org.thingml.xtext.thingML.ArrayInit;
import org.thingml.xtext.thingML.DAPredictAction;
import org.thingml.xtext.thingML.DAPreprocessAction;
import org.thingml.xtext.thingML.DASaveAction;
import org.thingml.xtext.thingML.DATrainAction;
import org.thingml.xtext.thingML.DataAnalyticsModelAlgorithm;
import org.thingml.xtext.thingML.DecisionTree;
import org.thingml.xtext.thingML.Decrement;
import org.thingml.xtext.thingML.EnumLiteralRef;
import org.thingml.xtext.thingML.Enumeration;
import org.thingml.xtext.thingML.EnumerationLiteral;
import org.thingml.xtext.thingML.EqualsExpression;
import org.thingml.xtext.thingML.ErrorAction;
import org.thingml.xtext.thingML.EventReference;
import org.thingml.xtext.thingML.Expression;
import org.thingml.xtext.thingML.ExternExpression;
import org.thingml.xtext.thingML.ForAction;
import org.thingml.xtext.thingML.FunctionCallExpression;
import org.thingml.xtext.thingML.FunctionCallStatement;
import org.thingml.xtext.thingML.Increment;
import org.thingml.xtext.thingML.IntegerLiteral;
import org.thingml.xtext.thingML.Labels;
import org.thingml.xtext.thingML.LocalVariable;
import org.thingml.xtext.thingML.ML2_ModelAlgorithm;
import org.thingml.xtext.thingML.NotEqualsExpression;
import org.thingml.xtext.thingML.Parameter;
import org.thingml.xtext.thingML.PrimitiveType;
import org.thingml.xtext.thingML.PrintAction;
import org.thingml.xtext.thingML.Property;
import org.thingml.xtext.thingML.PropertyReference;
import org.thingml.xtext.thingML.ReceiveMessage;
import org.thingml.xtext.thingML.SendAction;
import org.thingml.xtext.thingML.StartSession;
import org.thingml.xtext.thingML.Thing;
import org.thingml.xtext.thingML.ThingMLPackage;
import org.thingml.xtext.thingML.Timestamps;
import org.thingml.xtext.thingML.Type;
import org.thingml.xtext.thingML.TypeRef;
import org.thingml.xtext.validation.TypeChecker;

/**
 * Created by bmori on 01.12.2014.
 */
public class JavaThingActionCompiler extends CommonThingActionCompiler {

	@Override
	public void generate(Increment action, StringBuilder builder, Context ctx) {
		if (action.getVar() instanceof Property) {
			builder.append("set" + ctx.firstToUpper(ctx.getVariableName(action.getVar())) + "(");
			builder.append("(" + JavaHelper.getJavaType(action.getVar().getTypeRef().getType(),
					action.getVar().getTypeRef().getCardinality() != null, ctx) + ")");
			builder.append("(get" + ctx.firstToUpper(ctx.getVariableName(action.getVar())) + "()");
			builder.append(" + 1));\n");
		} else {
			super.generate(action, builder, ctx);
		}
	}

	@Override
	public void generate(Decrement action, StringBuilder builder, Context ctx) {
		if (action.getVar() instanceof Property) {
			builder.append("set" + ctx.firstToUpper(ctx.getVariableName(action.getVar())) + "(");
			builder.append("(" + JavaHelper.getJavaType(action.getVar().getTypeRef().getType(),
					action.getVar().getTypeRef().getCardinality() != null, ctx) + ")");
			builder.append("(get" + ctx.firstToUpper(ctx.getVariableName(action.getVar())) + "()");
			builder.append(" - 1));\n");
		} else {
			super.generate(action, builder, ctx);
		}
	}

	@Override
	public void generate(EqualsExpression expression, StringBuilder builder, Context ctx) {
		final TypeRef leftType = TypeChecker.computeTypeOf(expression.getLhs());
		final TypeRef rightType = TypeChecker.computeTypeOf(expression.getRhs());		
		if (TyperHelper.isA(leftType, Types.OBJECT_TYPEREF) && TyperHelper.isA(rightType, Types.OBJECT_TYPEREF)) {
			if (expression.getLhs() instanceof ExternExpression) {
				final ExternExpression extL = (ExternExpression) expression.getLhs();				
				if (extL.getExpression().trim().equals("null")) {// we check for null pointer, should use ==
					super.generate(expression, builder, ctx);
					return;
				}
			}
			if (expression.getRhs() instanceof ExternExpression) {
				final ExternExpression extR = (ExternExpression) expression.getRhs();
				if (extR.getExpression().trim().equals("null")) {// we check for null pointer, should use ==
					super.generate(expression, builder, ctx);
					return;
				}
			}
			generate(expression.getLhs(), builder, ctx);
			builder.append(".equals(");
			generate(expression.getRhs(), builder, ctx);
			builder.append(")");
		} else {
			super.generate(expression, builder, ctx);
		}
	}

	@Override
	public void generate(NotEqualsExpression expression, StringBuilder builder, Context ctx) { 
		final TypeRef leftType = TypeChecker.computeTypeOf(expression.getLhs());
		final TypeRef rightType = TypeChecker.computeTypeOf(expression.getRhs());		
		if (TyperHelper.isA(leftType, Types.OBJECT_TYPEREF) || TyperHelper.isA(rightType, Types.OBJECT_TYPEREF)) {
			if (expression.getLhs() instanceof ExternExpression) {
				final ExternExpression extL = (ExternExpression) expression.getLhs();
				if (extL.getExpression().trim().equals("null")) {// we check for null pointer, should use ==
					super.generate(expression, builder, ctx);
					return;
				}
			}
			if (expression.getRhs() instanceof ExternExpression) {
				final ExternExpression extR = (ExternExpression) expression.getRhs();
				if (extR.getExpression().trim().equals("null")) {// we check for null pointer, should use ==
					super.generate(expression, builder, ctx);
					return;
				}
			}
			builder.append("!(");
			generate(expression.getLhs(), builder, ctx);
			builder.append(".equals(");
			generate(expression.getRhs(), builder, ctx);
			builder.append("))");
		} else {
			super.generate(expression, builder, ctx);
		}
	}

	@Override
	public void generate(SendAction action, StringBuilder builder, Context ctx) {
		builder.append(
				"send" + ctx.firstToUpper(action.getMessage().getName()) + "_via_" + action.getPort().getName() + "(");
		int i = 0;
		for (Expression p : action.getParameters()) {
			if (i > 0)
				builder.append(", ");
			int j = 0;
			for (Parameter fp : action.getMessage().getParameters()) {
				if (i == j) {// parameter p corresponds to formal parameter fp
					cast(fp.getTypeRef().getType(), fp.getTypeRef().isIsArray(), p, builder, ctx);
					break;
				}
				j++;
			}
			i++;
		}
		builder.append(");\n");
	}

	@Override
	public void generate(StartSession action, StringBuilder builder, Context ctx) {
		builder.append("final Component " + action.getSession().getName() + " = new "
				+ ctx.firstToUpper(ThingMLHelpers.findContainingThing(action.getSession()).getName()) + "()");
		for (Property p : ThingHelper.allPropertiesInDepth(ThingMLHelpers.findContainingThing(action.getSession()))) {
			builder.append(".init" + ctx.firstToUpper(ctx.getVariableName(p)) + "(");
			if (p.getTypeRef().isIsArray() || p.getTypeRef().getCardinality() != null) {
				builder.append("Arrays.copyOf("
						+ ctx.firstToUpper(ThingMLHelpers.findContainingThing(action.getSession()).getName()) + ".this."
						+ ctx.getVariableName(p) + ", "
						+ ctx.firstToUpper(ThingMLHelpers.findContainingThing(action.getSession()).getName()) + ".this."
						+ ctx.getVariableName(p) + ".length)");
			} else {
				builder.append(ctx.firstToUpper(ThingMLHelpers.findContainingThing(action.getSession()).getName())
						+ ".this." + ctx.getVariableName(p));
			}
			builder.append(")");
		}
		builder.append(".buildBehavior(\"" + action.getSession().getName() + "\", "
				+ ctx.firstToUpper(ThingMLHelpers.findContainingThing(action.getSession()).getName()) + ".this);\n");
		builder.append("final Component root = ("
				+ ctx.firstToUpper(ThingMLHelpers.findContainingThing(action.getSession()).getName())
				+ ".this.root == null)? "
				+ ctx.firstToUpper(ThingMLHelpers.findContainingThing(action.getSession()).getName()) + ".this : "
				+ ctx.firstToUpper(ThingMLHelpers.findContainingThing(action.getSession()).getName())
				+ ".this.root;\n");
		builder.append("root.addSession(" + action.getSession().getName() + ");\n");
	}

	@Override
	public void generate(FunctionCallStatement action, StringBuilder builder, Context ctx) {
		if (AnnotatedElementHelper.isDefined(action.getFunction(), "fork_thread", "true")
				&& action.getFunction().getTypeRef() != null) {
			System.err.println("function " + action.getFunction().getName()
					+ "cannot be called with @fork_thread, as its return type ("
					+ action.getFunction().getTypeRef().getType().getName() + ") is not void");
			throw new UnsupportedOperationException("function " + action.getFunction().getName()
					+ "cannot be called with @fork_thread, as its return type ("
					+ action.getFunction().getTypeRef().getType().getName() + ") is not void");
		}

		if (AnnotatedElementHelper.isDefined(action.getFunction(), "fork_thread", "true")) {
			builder.append("new Thread(new Runnable(){public void run() {\n");
		}

		builder.append(action.getFunction().getName() + "(");
		int i = 0;
		for (Expression p : action.getParameters()) {
			if (i > 0)
				builder.append(", ");
			int j = 0;
			for (Parameter fp : action.getFunction().getParameters()) {
				if (i == j) {// parameter p corresponds to formal parameter fp
					cast(fp.getTypeRef().getType(), fp.getTypeRef().isIsArray(), p, builder, ctx);
					break;
				}
				j++;
			}
			i++;
		}
		builder.append(");\n");

		if (AnnotatedElementHelper.isDefined(action.getFunction(), "fork_thread", "true")) {
			builder.append("}}).start();\n");
		}
	}

	@Override
	public void generate(LocalVariable action, StringBuilder builder, Context ctx) {
		if (action.isReadonly()) {
			builder.append("final ");
		}

		// Define the type of the variable
		builder.append(JavaHelper.getJavaType(action.getTypeRef().getType(), action.getTypeRef().isIsArray(), ctx));
		builder.append(" ");

		builder.append(ctx.getVariableName(action));

		// Define the initial value for that variable
		if (action.getInit() != null) {
			builder.append(" = ");
			cast(action.getTypeRef().getType(), action.getTypeRef().isIsArray(), action.getInit(), builder, ctx);
			builder.append(";\n");
		} else {
			if (action.getTypeRef().getCardinality() != null) {
				builder.append(" = new " + JavaHelper.getJavaType(action.getTypeRef().getType(), false, ctx) + "[(int)(");
				generate(action.getTypeRef().getCardinality(), builder, ctx);
				builder.append(")];");
			} else {
				if (action.getTypeRef().getType() instanceof PrimitiveType) {
					builder.append(" = " + JavaHelper.getDefaultValue(action.getTypeRef().getType()) + ";");
				} else {
					builder.append(" = null;");
				}
			}
		}
		builder.append("\n");
	}

	@Override
	public void generate(ErrorAction action, StringBuilder builder, Context ctx) {
		final Thing t = ThingMLHelpers.findContainingThing(action);
		if (AnnotatedElementHelper.isDefined(t, "stdout_sync", "true")) {
			builder.append("synchronized(System.err) {\n");
		}		
		if (action.isLine())
			builder.append("System.err.println(\"\"");
		else
			builder.append("System.err.print(\"\"");
		for (Expression msg : action.getMsg()) {
			builder.append("+(");
			generate(msg, builder, ctx);
			builder.append(")");
		}
		builder.append(");\n");
		if (AnnotatedElementHelper.isDefined(t, "stdout_sync", "true")) {
			builder.append("}\n");
		}
	}

	@Override
	public void generate(PrintAction action, StringBuilder builder, Context ctx) {
		final Thing t = ThingMLHelpers.findContainingThing(action);
		if (AnnotatedElementHelper.isDefined(t, "stdout_sync", "true")) {
			builder.append("synchronized(System.out) {\n");
		}		
		if (action.isLine())
			builder.append("System.out.println(\"\"");
		else
			builder.append("System.out.print(\"\"");
		for (Expression msg : action.getMsg()) {
			builder.append("+(");
			generate(msg, builder, ctx);
			builder.append(")");
		}
		builder.append(");\n");
		if (AnnotatedElementHelper.isDefined(t, "stdout_sync", "true")) {
			builder.append("}\n");
		}
	}

	@Override
	public void generate(PropertyReference expression, StringBuilder builder, Context ctx) {
		if (!ctx.getAtInitTimeLock()) {
			if (expression.getProperty() instanceof Property
					&& ((Property) expression.getProperty()).getTypeRef().getCardinality() == null)
				builder.append("get" + ctx.firstToUpper(ctx.getVariableName(expression.getProperty())) + "()");
			else
				builder.append(ctx.getVariableName(expression.getProperty()));
		} else {
			Property p = (Property) expression.getProperty();
			if (!p.isReadonly()) {
				System.out.println(
						"Error: non Read-only property (" + p.getName() + ") used in array cardinality definition.");
			}
			Expression e = ConfigurationHelper.initExpressions(ctx.getCurrentConfiguration(), ctx.currentInstance, p)
					.get(0);
			generate(e, builder, ctx);
		}
	}

	@Override
	public void generate(EnumLiteralRef expression, StringBuilder builder, Context ctx) {
		final EnumerationLiteral lit = expression.getLiteral();
		if (((Enumeration)lit.eContainer()).getTypeRef() != null) {
			generate(lit.getInit(), builder, ctx);
		}
		else {
			if (AnnotatedElementHelper.hasAnnotation(lit, "enum_val")) {
				final String value = AnnotatedElementHelper.annotation(lit, "enum_val").get(0);
				try {
					Double.parseDouble(value);
					builder.append(AnnotatedElementHelper.annotation(lit, "enum_val").get(0));
				} catch (NumberFormatException nfe) {
					builder.append("\"" + AnnotatedElementHelper.annotation(lit, "enum_val").get(0) + "\"");
				}
			} else {
				builder.append(ctx.firstToUpper(expression.getEnum().getName()) + "_ENUM."
						+ ((Enumeration) expression.getLiteral().eContainer()).getName().toUpperCase() + "_"
						+ expression.getLiteral().getName().toUpperCase());
			}
		}
	}

	@Override
	public void generate(FunctionCallExpression expression, StringBuilder builder, Context ctx) {
		if (ctx.currentInstance != null)
			builder.append(ctx.getInstanceName(ctx.currentInstance) + ".");
		builder.append(expression.getFunction().getName() + "(");

		int i = 0;
		for (Expression p : expression.getParameters()) {

			if (i > 0)
				builder.append(", ");
			int j = 0;
			for (Parameter fp : expression.getFunction().getParameters()) {
				if (i == j) {// parameter p corresponds to formal parameter fp
					cast(fp.getTypeRef().getType(), fp.getTypeRef().isIsArray(), p, builder, ctx);
					break;
				}
				j++;
			}
			i++;
		}
		builder.append(")");
	}
	
	@Override
	protected String castArrayIndex(String builder) {
		return "(int)(" + builder + ")";
	}

	@Override
	public void cast(Type type, boolean isArray, Expression exp, StringBuilder builder, Context ctx) {
		if (!(type instanceof Enumeration)) {
			if (AnnotatedElementHelper.hasAnnotation(type, "java_type")) {
				if (!isArray)
					builder.append("(" + AnnotatedElementHelper.annotation(type, "java_type").toArray()[0] + ") ");
				else
					builder.append("(" + AnnotatedElementHelper.annotation(type, "java_type").toArray()[0] + "[]) ");
			} else {
				if (!isArray)
					builder.append("(Object) ");
				else
					builder.append("(Object[]) ");
			}
		}
		builder.append("(");
		generate(exp, builder, ctx);
		builder.append(")");
	}

	@Override
	public void generate(EventReference expression, StringBuilder builder, Context ctx) {
		builder.append((((ReceiveMessage) expression.getReceiveMsg()).getMessage().getName()) + "."
				+ expression.getParameter().getName());
	}

	@Override
	public void generate(IntegerLiteral expression, StringBuilder builder, Context ctx) {
		super.generate(expression, builder, ctx);
		if (expression.getIntValue() > 2147483647 || expression.getIntValue() < -2147483647)
			builder.append("L");
	}
	
	@Override
	public void generate(ArrayInit expression, StringBuilder builder, Context ctx) {
		final EObject container = expression.eContainer();
		final TypeRef typeref = (TypeRef) container.eGet(ThingMLPackage.eINSTANCE.getVariable_TypeRef());				
		final Type t = typeref.getType();		
		builder.append("new " + JavaHelper.getJavaType(t, false, ctx) + "[]");
		builder.append("{");
		for(Expression e : expression.getValues()) {
			if (expression.getValues().indexOf(e)>0)
				builder.append(", ");
			generate(e, builder, ctx);
		}
		builder.append("}");
	}

	@Override
	public void generate(ForAction fa, StringBuilder builder, Context ctx) {
		if (fa.getIndex() != null) {
			builder.append("{\n");
			final String t = JavaHelper.getJavaType(fa.getIndex().getTypeRef().getType(), false, ctx);
			builder.append(t + " " + ctx.getVariableName(fa.getIndex()) + " = 0;\n");
		}
		final String t = JavaHelper.getJavaType(fa.getVariable().getTypeRef().getType(), false, ctx);
		builder.append("for(" + t + " " + ctx.getVariableName(fa.getVariable()) + " : " + ctx.getVariableName(fa.getArray().getProperty()) + ") {\n");
		generate(fa.getAction(), builder, ctx);
		if (fa.getIndex() != null) {
			builder.append(ctx.getVariableName(fa.getIndex()) + "++;\n");
		}
		builder.append("}\n");
		if (fa.getIndex() != null) {
			builder.append("}\n");
		}
	}
	
	//ML2: da_save
	@Override
	public void generate(DASaveAction action, StringBuilder builder, Context ctx) { //ML2
		builder.append("\n//********* ML2 *********\n");
		builder.append("File dataDir = new File(\"data\");\n");
		builder.append("if(!dataDir.exists())\n");
		builder.append("dataDir.mkdirs();\n");		
		builder.append("File datasetFile = new File(\"" + action.getDataAnalytics().getDataset() + "\");\n");
		builder.append("FileWriter fr = null;\n");
		builder.append("BufferedWriter br = null;\n");
		builder.append("try{\n");
		builder.append("	fr = new FileWriter(datasetFile, true);\n");
		builder.append("	br = new BufferedWriter(fr);\n");
		
		String str0 = "";
		if(action.getDataAnalytics().getTimestamps().equals(Timestamps.ON)) {
			str0 = "LocalDateTime.now().format(DateTimeFormatter.ofPattern(\"dd-MM-yyyy HH:mm:ss\")).toString()";			
			// Write the timestamp to the CSV file
			builder.append("	br.write(" +  str0 + " + \",\");\n");
		}		
		
		String str1 = "";
		for(int i=0; i<action.getDataAnalytics().getFeatures().size()-1; i++) {
			if (!(action.getDataAnalytics().getFeatures().get(i).getTypeRef().getType() instanceof Enumeration)) {
				if (AnnotatedElementHelper.hasAnnotation(action.getDataAnalytics().getFeatures().get(i).getTypeRef().getType(), "java_type")) { // Java Type
					if (!action.getDataAnalytics().getFeatures().get(i).getTypeRef().isIsArray()) { // This feature is not an array
						str1 = str1 + "String.valueOf(" +  ctx.getVariableName(action.getDataAnalytics().getFeatures().get(i)) + ")" + " + \",\"";
						// Write the feature to the CSV file
						builder.append("	br.write(" +  str1 + ");\n");
					} else { // This feature is an array
						builder.append("	String array_var_val_str1 = \"[\";\n");					
						builder.append("	boolean flag1 = false;\n");
						builder.append("	for(int i = 0; i < " + ctx.getVariableName(action.getDataAnalytics().getFeatures().get(i)) + ".length; i++) {\n");
						builder.append("		if(!flag1) {\n");
						builder.append("			array_var_val_str1 = array_var_val_str1 + String.valueOf(" + ctx.getVariableName(action.getDataAnalytics().getFeatures().get(i)) + "[i]);\n");
						builder.append("			flag1 = true;\n");
						builder.append("		} else {\n");
						builder.append("			array_var_val_str1 = array_var_val_str1 + \" \" + String.valueOf(" + ctx.getVariableName(action.getDataAnalytics().getFeatures().get(i)) + "[i]);\n");
						builder.append("		}\n");
						builder.append("	}\n");
						builder.append("	array_var_val_str1 = array_var_val_str1 + \"]\";\n");
						// Write the feature (array) to the CSV file
						builder.append("	br.write(" + "array_var_val_str1 + \",\");\n");
					}					
				} else { // Not a Java Type
					if (!action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().isIsArray()) { // This feature is not an array			
						//TODO

					}
					else { // This feature is an array
						//TODO

					}
				}
			}			
		}
		
		
		
		String str2 = "";
		if (!(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().getType() instanceof Enumeration)) {
			if (AnnotatedElementHelper.hasAnnotation(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().getType(), "java_type")) { // Java type
				if (!action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().isIsArray()) { // We are not predicting an array					
					str2 = "String.valueOf(" +  ctx.getVariableName(action.getDataAnalytics().getPredictionResults().get(0)) + ")";	
					// Write the prediction to the CSV file
					builder.append("	br.write(" +  str2 + "+ \"\\n\");\n");
				} else { // We are predicting an array
					builder.append("	String array_var_val_str2 = \"[\";\n");					
					builder.append("	boolean flag2 = false;\n");
					builder.append("	for(int i = 0; i < " + ctx.getVariableName(action.getDataAnalytics().getPredictionResults().get(0)) + ".length; i++) {\n");
					builder.append("		if(!flag2) {\n");
					builder.append("			array_var_val_str2 = array_var_val_str2 + String.valueOf(" + ctx.getVariableName(action.getDataAnalytics().getPredictionResults().get(0)) + "[i]);\n");
					builder.append("			flag2 = true;\n");
					builder.append("		} else {\n");
					builder.append("			array_var_val_str2 = array_var_val_str2 + \" \" + String.valueOf(" + ctx.getVariableName(action.getDataAnalytics().getPredictionResults().get(0)) + "[i]);\n");
					builder.append("		}\n");
					builder.append("	}\n");
					builder.append("	array_var_val_str2 = array_var_val_str2 + \"]\";\n");
					// Write the prediction to the CSV file
					builder.append("	br.write(" + "array_var_val_str2 + \"\\n\");\n");
				}					
			} else { // Not a Java Type
				if (!action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().isIsArray()) { // We are not predicting an array			
					//TODO
 
				}
				else {  // We are predicting an array
					//TODO

				}
			}
		}		
		
		builder.append("	br.close();\n");
		builder.append("	fr.close();\n");
		builder.append("}  catch (IOException e1) {\n");
		builder.append("	e1.printStackTrace();\n");
		builder.append("} finally {\n");
		builder.append("		try {\n");
		builder.append("			br.close();\n");
		builder.append("			fr.close();\n");
		builder.append("		} catch (IOException e2) {\n");
		builder.append("			e2.printStackTrace();\n");
		builder.append("		}\n");
		builder.append("}\n");
		builder.append("//********* ML2 *********\n\n");
	}

	//ML2: da_preprocess
	@Override
	public void generate(DAPreprocessAction action, StringBuilder builder, Context ctx) {
		Path path = null;
		path = Paths.get(new File(ctx.getOutputDirectory().getAbsolutePath().toString()).toURI());
		String dataset = action.getDataAnalytics().getDataset();
		String sequential = action.getDataAnalytics().getSequential().getName();
		String timestamps = action.getDataAnalytics().getTimestamps().getName();
		EList<Property> features = action.getDataAnalytics().getFeatures();
		List<String> feature_types = new ArrayList<String>();
		for(int i=0; i<features.size(); i++) {
			if(action.getDataAnalytics().getFeatures().get(i).getTypeRef().isIsArray()) {
				feature_types.add(action.getDataAnalytics().getFeatures().get(i).getTypeRef().getType().getName() + "[]");
			} else {
				feature_types.add(action.getDataAnalytics().getFeatures().get(i).getTypeRef().getType().getName());
			}
			
		}
		String labels = action.getDataAnalytics().getLabels().getName();
		builder.append("\n//********* ML2 *********\n");
		generatePythonDAPreprocessingScript(path.toString() + "/src");
		builder.append("File dataDir = new File(\"data\");\n");
		builder.append("if(!dataDir.exists()) {\n");
		builder.append("	dataDir.mkdirs();\n");
		builder.append("}\n");
		builder.append("File picklesDir = new File(\"" + path.toString() + "/src/python-scripts/pickles/" + "\");\n");
		builder.append("if(!picklesDir.exists()) {\n");
		builder.append("	picklesDir.mkdirs();\n");
		builder.append("}\n");
		
		//Make the generated Python script executable
		builder.append("List<String> list0 = new ArrayList<String>();\n");
		builder.append("list0.add(\"chmod\");\n");
		builder.append("list0.add(\"u+x\");\n");
		builder.append("list0.add(\"" + path.toString() + "/src/python-scripts/preprocess.py\");\n");
		builder.append("try{\n");
		builder.append("	ProcessBuilder pb0 = new ProcessBuilder(list0);\n");
		builder.append("	Process p0 = pb0.start();\n");
		builder.append("} catch(Exception e){System.out.println(e);}\n");
		
		builder.append("List<String> list = new ArrayList<String>();\n");
		builder.append("list.add(\"python\");\n");
		builder.append("list.add(\"" + path.toString() + "/src/python-scripts/preprocess.py\");\n");
		builder.append("list.add(\"" + dataset + "\");\n");
		builder.append("list.add(\"" + sequential + "\");\n");
		builder.append("list.add(\"" + timestamps + "\");\n");
		String features_str = "";
		String feature_types_str = "";
		for(int i=0; i<features.size(); i++) {
			features_str += features.get(i).getName();
			feature_types_str += feature_types.get(i);
			if(i<features.size()-1) {
				features_str += ",";
				feature_types_str += ",";
			}
			
		}
		builder.append("list.add(\"" + features_str + "\");\n");
		builder.append("list.add(\"" + feature_types_str + "\");\n");		
		builder.append("list.add(\"" + labels + "\");\n");		
		builder.append("try{\n");
		builder.append("	ProcessBuilder pb = new ProcessBuilder(list);\n");
		builder.append("	Process p = pb.start();\n");
		builder.append("	p.waitFor();\n");
		builder.append("} catch(Exception e){System.out.println(e);}\n\n");
		builder.append("//********* ML2 *********\n\n");
	}
	
	//ML2: Code generator for the data analytics preprocessing Python script, preprocess.py 
	public void generatePythonDAPreprocessingScript(String path_str) {
		StringBuilder pythonScriptStringBuilder = new StringBuilder();
		pythonScriptStringBuilder.append("#********* ML2 *********\n\n");
		pythonScriptStringBuilder.append("import sys\n");
		pythonScriptStringBuilder.append("import pickle\n");
		pythonScriptStringBuilder.append("import time, datetime\n");
		pythonScriptStringBuilder.append("import pandas as pd\n");
		pythonScriptStringBuilder.append("import numpy as np\n");
		pythonScriptStringBuilder.append("from sklearn.preprocessing import LabelEncoder\n\n");
		pythonScriptStringBuilder.append("dataset = sys.argv[1]\n");
		pythonScriptStringBuilder.append("sequential = sys.argv[2]\n");
		pythonScriptStringBuilder.append("timestamps = sys.argv[3]\n");
		pythonScriptStringBuilder.append("features = sys.argv[4].split(',')\n");
		pythonScriptStringBuilder.append("feature_types = sys.argv[5].split(',')\n");
		pythonScriptStringBuilder.append("labels = sys.argv[6]\n\n");
		pythonScriptStringBuilder.append("col_names = []\n");
		pythonScriptStringBuilder.append("if(timestamps.lower() == 'on'):\n");
		pythonScriptStringBuilder.append("    col_names.append('timestamp')\n");
		pythonScriptStringBuilder.append("for feature in features:\n");
		pythonScriptStringBuilder.append("    col_names.append(feature)\n\n");
		pythonScriptStringBuilder.append("df = pd.read_csv(dataset, lineterminator='\\n', names=col_names, header=None)\n");
		pythonScriptStringBuilder.append("original_df = df.copy(deep=True)\n");
		pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/" + "preprocess_original_df.pickle', 'wb') as pickle_file:\n");
		pythonScriptStringBuilder.append("    pickle.dump(original_df, pickle_file)\n\n");
		pythonScriptStringBuilder.append("feature_cols = []\n");
		pythonScriptStringBuilder.append("if(timestamps.lower() == 'on'):\n");
		pythonScriptStringBuilder.append("    feature_cols.append('timestamp')\n");
		pythonScriptStringBuilder.append("    timeformat = \"%d-%m-%Y %H:%M:%S\"\n");
		pythonScriptStringBuilder.append("    with open('" + path_str + "/python-scripts/pickles/" + "preprocess_timeformat.pickle', 'wb') as pickle_file:\n");
		pythonScriptStringBuilder.append("        pickle.dump(timeformat, pickle_file)\n");
		pythonScriptStringBuilder.append("    df.timestamp = df.timestamp.apply(lambda x: datetime.datetime.strptime(x, timeformat))\n");
		pythonScriptStringBuilder.append("    base_time = df.timestamp.min()\n");
		pythonScriptStringBuilder.append("    with open('" + path_str + "/python-scripts/pickles/" + "preprocess_base_time.pickle', 'wb') as pickle_file:\n");
		pythonScriptStringBuilder.append("        pickle.dump(base_time, pickle_file)\n");
		pythonScriptStringBuilder.append("    df.timestamp = (df.timestamp - base_time)\n");
		pythonScriptStringBuilder.append("    df.timestamp = df.timestamp.apply(lambda x: x.seconds)\n\n");
		pythonScriptStringBuilder.append("categorical_features_indexes = list(filter(lambda x: feature_types[x] == 'String', range(len(feature_types))))\n\n");
		pythonScriptStringBuilder.append("for i in range(len(features)):\n");
		pythonScriptStringBuilder.append("    if i in categorical_features_indexes:\n");
		pythonScriptStringBuilder.append("        le = LabelEncoder()\n");
		pythonScriptStringBuilder.append("        le.fit(df[features[i]])\n");
		pythonScriptStringBuilder.append("        df[features[i]] = df[features[i]].apply(lambda x: le.transform([x]))\n");
		pythonScriptStringBuilder.append("    feature_cols.append(features[i])\n\n");
		pythonScriptStringBuilder.append("if(len(categorical_features_indexes) != 0):\n");
		pythonScriptStringBuilder.append("	with open('" + path_str + "/python-scripts/pickles/" + "preprocess_label_encoder.pickle', 'wb') as pickle_file:\n");
		pythonScriptStringBuilder.append("		pickle.dump(le, pickle_file)\n\n");
		pythonScriptStringBuilder.append("if(labels.lower() == 'on'):\n");
		pythonScriptStringBuilder.append("    X_train =  df.loc[:,feature_cols[:-1]]\n");
		pythonScriptStringBuilder.append("    y_train = df[features[-1]]\n");
		pythonScriptStringBuilder.append("else:\n");
		pythonScriptStringBuilder.append("    X_train =  df.loc[:,feature_cols]\n");
		pythonScriptStringBuilder.append("    y_train = []\n\n");
		//Handling features, which have array type
		pythonScriptStringBuilder.append("array_features_indexes = list(filter(lambda x: '[' in feature_types[x], range(len(feature_types))))\n");
		pythonScriptStringBuilder.append("for index in array_features_indexes[:-1]:\n");
		pythonScriptStringBuilder.append("    col = '' + features[array_features_indexes[index]]\n");
		pythonScriptStringBuilder.append("    tmp_df_1 = X_train.loc[:, X_train.columns != col]\n");
		pythonScriptStringBuilder.append("    tmp_df_2 = pd.DataFrame(X_train[col].apply(lambda x: x[1:-1]).str.split(' ', expand=True).values).rename(columns=lambda x : col + '_' + str(x))\n");
		pythonScriptStringBuilder.append("    X_train = pd.concat([tmp_df_1,tmp_df_2],axis=1)\n\n");		
		pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/" + "preprocess_X_train.pickle', 'wb') as pickle_file:\n");
		pythonScriptStringBuilder.append("    pickle.dump(X_train, pickle_file)\n");
		pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/" + "preprocess_y_train.pickle', 'wb') as pickle_file:\n");
		pythonScriptStringBuilder.append("    pickle.dump(y_train, pickle_file)\n");
		pythonScriptStringBuilder.append("#********* ML2 *********\n\n");
		File pythonScriptsDir = new File(path_str + "/python-scripts");
		if(!pythonScriptsDir.exists()) {
			pythonScriptsDir.mkdirs();
		}
		File scriptFile = new File(path_str + "/python-scripts/preprocess.py");
		try {
			Files.deleteIfExists(Paths.get(scriptFile.toURI()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileWriter fr = null;
		BufferedWriter br = null;
		try {
			fr = new FileWriter(scriptFile, true);
			br = new BufferedWriter(fr);
			br.append(pythonScriptStringBuilder);
			br.close();
			fr.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
	
	//ML2: da_train
	@Override
	public void generate(DATrainAction action, StringBuilder builder, Context ctx) {
		Path path = null;
		path = Paths.get(new File(ctx.getOutputDirectory().getAbsolutePath().toString()).toURI());
		builder.append("\n//********* ML2 *********\n");
		generatePythonDATrainScript(path.toString() + "/src", action);
		builder.append("File X_train_pickle = new File(\"" + path.toString() + "/src/python-scripts/pickles/preprocess_X_train.pickle" + "\");\n");
		builder.append("File y_train_pickle = new File(\"" + path.toString() + "/src/python-scripts/pickles/preprocess_y_train.pickle" + "\");\n");
		builder.append("if(!X_train_pickle.exists() || !y_train_pickle.exists())\n");
		builder.append("	return;\n");
		
		//Make the generated Python script executable
		builder.append("List<String> list0 = new ArrayList<String>();\n");
		builder.append("list0.add(\"chmod\");\n");
		builder.append("list0.add(\"u+x\");\n");
		builder.append("list0.add(\"" + path.toString() + "/src/python-scripts/train.py\");\n");
		builder.append("try{\n");
		builder.append("	ProcessBuilder pb0 = new ProcessBuilder(list0);\n");
		builder.append("	Process p0 = pb0.start();\n");
		builder.append("} catch(Exception e){System.out.println(e);}\n");
		
		builder.append("List<String> list = new ArrayList<String>();\n");
		builder.append("list.add(\"python\");\n");
		builder.append("list.add(\"" + path.toString() + "/src/python-scripts/train.py\");\n");
		builder.append("try{\n");
		builder.append("	ProcessBuilder pb = new ProcessBuilder(list);\n");
		builder.append("	Process p = pb.start();\n");
		builder.append("	p.waitFor();\n");
		builder.append("} catch(Exception e){System.out.println(e);}\n\n");
		
		//Save the timestamp of training in the training_results text file
		builder.append("File dataDir = new File(\"data\");\n");
		builder.append("if(!dataDir.exists())\n");
		builder.append("dataDir.mkdirs();\n");		
		builder.append("File training_results_file = new File(\"" + action.getDataAnalytics().getTrainingResults() + "\");\n");
		builder.append("FileWriter fr = null;\n");
		builder.append("BufferedWriter br = null;\n");
		builder.append("try{\n");
		builder.append("	fr = new FileWriter(training_results_file, true);\n");
		builder.append("	br = new BufferedWriter(fr);\n");
		String str0 = "LocalDateTime.now().format(DateTimeFormatter.ofPattern(\"dd-MM-yyyy HH:mm:ss\")).toString()";			
		String str1 = action.getDataAnalytics().getModelAlgorithm().getName();
		builder.append("	br.write(" +  str0 + "+ \",\" + \"" + str1 + "\" + \"\\n\");\n");
		builder.append("	br.close();\n");
		builder.append("	fr.close();\n");
		builder.append("}  catch (IOException e1) {\n");
		builder.append("	e1.printStackTrace();\n");
		builder.append("} finally {\n");
		builder.append("		try {\n");
		builder.append("			br.close();\n");
		builder.append("			fr.close();\n");
		builder.append("		} catch (IOException e2) {\n");
		builder.append("			e2.printStackTrace();\n");
		builder.append("		}\n");
		builder.append("}\n");		
		builder.append("//********* ML2 *********\n\n");
	}
	
	//ML2: Code generator for the data analytics training Python script, train.py 
	public void generatePythonDATrainScript(String path_str, DATrainAction action) {
		DataAnalyticsModelAlgorithm dataAnalyticsModelAlgorithm = action.getDataAnalytics().getModelAlgorithm();
		StringBuilder pythonScriptStringBuilder = new StringBuilder();
		pythonScriptStringBuilder.append("#********* ML2 *********\n\n");
		pythonScriptStringBuilder.append("import pickle\n\n");
		pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/" + "preprocess_X_train.pickle', 'rb') as pickle_file:\n");
		pythonScriptStringBuilder.append("    X_train = pickle.load(pickle_file)\n");
		pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/" + "preprocess_y_train.pickle', 'rb') as pickle_file:\n");
		pythonScriptStringBuilder.append("    y_train = pickle.load(pickle_file)\n\n");
				
		if(dataAnalyticsModelAlgorithm instanceof ML2_ModelAlgorithm) {
			if(action.getDataAnalytics().getLabels()==Labels.ON) {
				//Supervised ML
				if(dataAnalyticsModelAlgorithm instanceof DecisionTree) {
					if(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef()==Types.REAL_TYPEREF
							|| action.getDataAnalytics().getPredictionResults().get(0).getTypeRef()==Types.ARRAY_REAL_TYPEREF) {
						//Regression
						pythonScriptStringBuilder.append("from sklearn.tree import DecisionTreeRegressor\n");
						pythonScriptStringBuilder.append("dtr = DecisionTreeRegressor()\n");
						pythonScriptStringBuilder.append("dtr = dtr.fit(X_train,y_train)\n");
						pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/" + "train_model_dtr.pickle', 'wb') as pickle_file:\n");
						pythonScriptStringBuilder.append("    pickle.dump(dtr, pickle_file)\n\n");
					} else {
						//Classification				
						pythonScriptStringBuilder.append("from sklearn.tree import DecisionTreeClassifier\n");
						pythonScriptStringBuilder.append("dtc = DecisionTreeClassifier()\n");
						pythonScriptStringBuilder.append("dtc = dtc.fit(X_train,y_train)\n");
						pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/" + "train_model_dtc.pickle', 'wb') as pickle_file:\n");
						pythonScriptStringBuilder.append("    pickle.dump(dtc, pickle_file)\n\n");
					}
				}
			} else {
				// Unsupervised ML / Clustering
			}
		}
		
		pythonScriptStringBuilder.append("#********* ML2 *********\n\n");
		File pythonScriptsDir = new File(path_str + "/python-scripts");
		if(!pythonScriptsDir.exists()) {
			pythonScriptsDir.mkdirs();
		}
		File scriptFile = new File(path_str + "/python-scripts/train.py");
		try {
			Files.deleteIfExists(Paths.get(scriptFile.toURI()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileWriter fr = null;
		BufferedWriter br = null;
		try {
			fr = new FileWriter(scriptFile, true);
			br = new BufferedWriter(fr);
			br.append(pythonScriptStringBuilder);
			br.close();
			fr.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}

	//ML2: da_predict
	@Override
	public void generate(DAPredictAction action, StringBuilder builder, Context ctx) {
		Path path = null;
		path = Paths.get(new File(ctx.getOutputDirectory().getAbsolutePath().toString()).toURI());
		builder.append("\n//********* ML2 *********\n");
		builder.append("String prediction_timestamp = \"\";\n");
		if(action.getDataAnalytics().getTimestamps().equals(Timestamps.ON)) {
			builder.append("File preprocess_timeformat_pickle = new File(\"" + path.toString() + "/src/python-scripts/pickles/preprocess_timeformat.pickle" + "\");\n");
			builder.append("File preprocess_base_time_pickle = new File(\"" + path.toString() + "/src/python-scripts/pickles/preprocess_base_time.pickle" + "\");\n");
			builder.append("if(!preprocess_timeformat_pickle.exists() || !preprocess_base_time_pickle.exists())\n");
			builder.append("	return;\n");
			builder.append("prediction_timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern(\"dd-MM-yyyy HH:mm:ss\")).toString();\n");			
		}
		String timestamps = action.getDataAnalytics().getTimestamps().getName();
		EList<Property> features = action.getFeatures();
		List<String> feature_types = new ArrayList<String>();
		for(int i=0; i<features.size(); i++) {
			if(action.getFeatures().get(i).getTypeRef().isIsArray()) {
				feature_types.add(action.getFeatures().get(i).getTypeRef().getType().getName() + "[]");
			} else {
				feature_types.add(action.getFeatures().get(i).getTypeRef().getType().getName());
			}
			
		}
		EList<Property> feature_values_for_prediction = action.getFeatures();
		
		DataAnalyticsModelAlgorithm dataAnalyticsModelAlgorithm = action.getDataAnalytics().getModelAlgorithm();
		generatePythonDAPredictScript(path.toString() + "/src", action);
		builder.append("File preprocess_original_df_pickle = new File(\"" + path.toString() + "/src/python-scripts/pickles/preprocess_original_df.pickle" + "\");\n");
		builder.append("File preprocess_label_encoder_pickle = new File(\"" + path.toString() + "/src/python-scripts/pickles/preprocess_label_encoder.pickle" + "\");\n");
		builder.append("if(!preprocess_original_df_pickle.exists())\n");
		builder.append("	return;\n");
		
		if(dataAnalyticsModelAlgorithm instanceof ML2_ModelAlgorithm) {
			if(action.getDataAnalytics().getLabels()==Labels.ON) {
				//Supervised ML
				if(dataAnalyticsModelAlgorithm instanceof DecisionTree) {
					if(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef()==Types.REAL_TYPEREF
							|| action.getDataAnalytics().getPredictionResults().get(0).getTypeRef()==Types.ARRAY_REAL_TYPEREF) {
						//Regression
						builder.append("File train_model_dtr_pickle = new File(\"" + path.toString() + "/src/python-scripts/pickles/train_model_dtr.pickle" + "\");\n");
						builder.append("if(!train_model_dtr_pickle.exists())\n");
						builder.append("	return;\n");
					} else {
						//Classification				
						builder.append("File train_model_dtc_pickle = new File(\"" + path.toString() + "/src/python-scripts/pickles/train_model_dtc.pickle" + "\");\n");
						builder.append("if(!train_model_dtc_pickle.exists())\n");
						builder.append("	return;\n");
					}
				}
			} else {
				// Unsupervised ML / Clustering
			}
		}
		
		//Make the generated Python script executable
		builder.append("List<String> list0 = new ArrayList<String>();\n");
		builder.append("list0.add(\"chmod\");\n");
		builder.append("list0.add(\"u+x\");\n");
		builder.append("list0.add(\"" + path.toString() + "/src/python-scripts/predict.py\");\n");
		builder.append("try{\n");
		builder.append("	ProcessBuilder pb0 = new ProcessBuilder(list0);\n");
		builder.append("	Process p0 = pb0.start();\n");
		builder.append("} catch(Exception e){System.out.println(e);}\n");
		
		builder.append("List<String> list = new ArrayList<String>();\n");
		builder.append("list.add(\"python\");\n");
		builder.append("list.add(\"" + path.toString() + "/src/python-scripts/predict.py\");\n");
		
		builder.append("list.add(\"" + timestamps + "\");\n");
		String features_str = "";
		String feature_types_str = "";
		for(int i=0; i<features.size(); i++) {
			features_str += features.get(i).getName();
			feature_types_str += feature_types.get(i);
			if(i<features.size()-1) {
				features_str += ",";
				feature_types_str += ",";
			}			
		}
		builder.append("list.add(\"" + features_str + "\");\n");
		builder.append("list.add(\"" + feature_types_str + "\");\n");
		
		builder.append("list.add(");
		String feature_values_for_prediction_str = "";
		for(int i=0; i<feature_values_for_prediction.size(); i++) {
			if(feature_values_for_prediction.get(i).getTypeRef().isIsArray()) {
				builder.append("\"\'\" + Arrays.toString(" + ctx.getVariableName(feature_values_for_prediction.get(i)) + ").replaceAll(\",\",\"\") + \"\'\"");
			} else {
				builder.append(ctx.getVariableName(feature_values_for_prediction.get(i)).toString()+"+\"\"");				
			}
			
			if(i<feature_values_for_prediction.size()-1) {
				builder.append(",");
			}
		}
		builder.append(");\n");
		
		builder.append("list.add(\"\'\" + prediction_timestamp + \"\'\");\n");	
		
		builder.append("StringBuilder output_string_builder = new StringBuilder();\n");
		builder.append("try{\n");
		builder.append("	ProcessBuilder pb = new ProcessBuilder(list);\n");
		builder.append("	Process p = pb.start();\n");
		builder.append("	p.waitFor();\n");
		builder.append("	BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));\n");
		builder.append("	String s = null;\n");
		builder.append("	while ((s = stdInput.readLine()) != null) {\n");
		builder.append("		output_string_builder.append(s);\n");
		builder.append("	}\n");
		builder.append("} catch(Exception e){System.out.println(e);}\n");
		
		if (!(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().getType() instanceof Enumeration)) {
			if (AnnotatedElementHelper.hasAnnotation(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().getType(), "java_type")) {
				if (!action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().isIsArray()) {
					builder.append(ctx.getVariableName(action.getDataAnalytics().getPredictionResults().get(0)).toString() + "=");
					builder.append(ctx.firstToUpper(AnnotatedElementHelper.annotation(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().getType(), "java_type").toArray()[0].toString())+".parse"+ctx.firstToUpper(AnnotatedElementHelper.annotation(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().getType(), "java_type").toArray()[0].toString())+"(output_string_builder.toString());\n");
				} else {
					builder.append("String[] arrString = output_string_builder.toString().substring(1,output_string_builder.toString().length()-1).split(\" \");\n");
					builder.append(AnnotatedElementHelper.annotation(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().getType(), "java_type").toArray()[0] + "[] ");
					builder.append("arr = new ");
					builder.append(AnnotatedElementHelper.annotation(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().getType(), "java_type").toArray()[0]);
					builder.append("[arrString.length];\n");
					builder.append("for(int i=0; i<arrString.length; i++) {\n");
					builder.append("	arr[i] = " + ctx.firstToUpper(AnnotatedElementHelper.annotation(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().getType(), "java_type").toArray()[0].toString())+".parse"+ctx.firstToUpper(AnnotatedElementHelper.annotation(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().getType(), "java_type").toArray()[0].toString())+ "(arrString[i]);\n");
					builder.append("}\n");
					builder.append(ctx.getVariableName(action.getDataAnalytics().getPredictionResults().get(0)).toString() + "=arr;\n");
				}					
			} else {
				if (!action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().isIsArray()) {				
					//TODO
					builder.append("(Object) (output_string_builder.toString());\n"); 
				}
				else {
					//TODO
					builder.append("(Object[]) (output_string_builder.toString());\n");
				}
			}
		}		
		
		builder.append("//********* ML2 *********\n\n");
	}
	
	//ML2: Code generator for the data analytics predicting Python script, predict.py 
	public void generatePythonDAPredictScript(String path_str, DAPredictAction action) {
		DataAnalyticsModelAlgorithm dataAnalyticsModelAlgorithm = action.getDataAnalytics().getModelAlgorithm();
		StringBuilder pythonScriptStringBuilder = new StringBuilder();
		pythonScriptStringBuilder.append("#********* ML2 *********\n\n");
		pythonScriptStringBuilder.append("import sys\n");
		pythonScriptStringBuilder.append("import time, datetime\n");
		pythonScriptStringBuilder.append("import pandas as pd\n");
		pythonScriptStringBuilder.append("import numpy as np\n");
		pythonScriptStringBuilder.append("import pickle\n\n");
		
		pythonScriptStringBuilder.append("timestamps = sys.argv[1]\n");
		pythonScriptStringBuilder.append("features = sys.argv[2].split(',')\n");
		pythonScriptStringBuilder.append("feature_types = sys.argv[3].split(',')\n");
		pythonScriptStringBuilder.append("feature_values_for_prediction = sys.argv[4].split(',')\n");
		pythonScriptStringBuilder.append("timestamp_for_prediction = sys.argv[5]\n\n");
		
		pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/" + "preprocess_original_df.pickle', 'rb') as pickle_file:\n");
		pythonScriptStringBuilder.append("	original_df = pickle.load(pickle_file)\n\n");
		
		pythonScriptStringBuilder.append("array_features_indexes = list(filter(lambda x: '[' in feature_types[x], range(len(feature_types))))\n");
		pythonScriptStringBuilder.append("new_feature_values_for_prediction = []\n");
		pythonScriptStringBuilder.append("for index in array_features_indexes:\n");
		pythonScriptStringBuilder.append("	for item in feature_values_for_prediction[index][2:-2].split(' '):\n");
		pythonScriptStringBuilder.append("		new_feature_values_for_prediction.append(item)\n");
		pythonScriptStringBuilder.append("	feature_values_for_prediction.pop(index)\n");
		pythonScriptStringBuilder.append("	feature_values_for_prediction.append(new_feature_values_for_prediction)\n");
		pythonScriptStringBuilder.append("	feature_name = features[index]\n");
		pythonScriptStringBuilder.append("	features.pop(index)\n");
		pythonScriptStringBuilder.append("	i=index\n");
		pythonScriptStringBuilder.append("	for item in range(len(new_feature_values_for_prediction)):\n");
		pythonScriptStringBuilder.append("		features.insert(i,feature_name+'_'+str(item))\n");
		pythonScriptStringBuilder.append("		i=i+1\n");
		pythonScriptStringBuilder.append("if(len(array_features_indexes)!=0):\n");
		pythonScriptStringBuilder.append("		feature_values_for_prediction = feature_values_for_prediction[0]\n\n");		
		
		pythonScriptStringBuilder.append("categorical_features_indexes = list(filter(lambda x: feature_types[x] == 'String', range(len(feature_types))))\n\n");
		
		pythonScriptStringBuilder.append("if(len(categorical_features_indexes)!=0):\n");
		pythonScriptStringBuilder.append("	from sklearn.preprocessing import LabelEncoder\n");		
		pythonScriptStringBuilder.append("	with open('" + path_str + "/python-scripts/pickles/" + "preprocess_label_encoder.pickle', 'rb') as pickle_file:\n");
		pythonScriptStringBuilder.append("		le = pickle.load(pickle_file)\n\n");
		
		pythonScriptStringBuilder.append("flag = False\n");
		pythonScriptStringBuilder.append("for i in range(len(features)):\n");
		pythonScriptStringBuilder.append("	if i in categorical_features_indexes:\n");
		pythonScriptStringBuilder.append("		if not np.isin([feature_values_for_prediction[i]],original_df[features[i]]).item(0):\n");
		pythonScriptStringBuilder.append("			flag = True\n");
		pythonScriptStringBuilder.append("			break\n\n");
		
		pythonScriptStringBuilder.append("if(flag):\n");
		pythonScriptStringBuilder.append("	print (False)\n");
		pythonScriptStringBuilder.append("else:\n");

		if(dataAnalyticsModelAlgorithm instanceof ML2_ModelAlgorithm) {
			if(action.getDataAnalytics().getLabels()==Labels.ON) {
				//Supervised ML
				if(dataAnalyticsModelAlgorithm instanceof DecisionTree) {
					if(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef()==Types.REAL_TYPEREF
							|| action.getDataAnalytics().getPredictionResults().get(0).getTypeRef()==Types.ARRAY_REAL_TYPEREF) {
						//Regression
						pythonScriptStringBuilder.append("	from sklearn.tree import DecisionTreeRegressor\n");
						pythonScriptStringBuilder.append("	with open('" + path_str + "/python-scripts/pickles/" + "train_model_dtr.pickle', 'rb') as pickle_file:\n");
						pythonScriptStringBuilder.append("		model = pickle.load(pickle_file)\n\n");
					} else {
						//Classification				
						pythonScriptStringBuilder.append("	from sklearn.tree import DecisionTreeClassifier\n");
						pythonScriptStringBuilder.append("	with open('" + path_str + "/python-scripts/pickles/" + "train_model_dtc.pickle', 'rb') as pickle_file:\n");
						pythonScriptStringBuilder.append("		model = pickle.load(pickle_file)\n\n");
					}
				}
			} else {
				// Unsupervised ML / Clustering
			}
		}		
		
		pythonScriptStringBuilder.append("	df = pd.DataFrame(data={}, columns=[])\n");
		pythonScriptStringBuilder.append("	for i in range(len(feature_values_for_prediction)):\n");
		pythonScriptStringBuilder.append("		if i in categorical_features_indexes:\n");
		pythonScriptStringBuilder.append("			df.insert(i,features[i], pd.Series([le.transform([feature_values_for_prediction[i]])]))\n");
		pythonScriptStringBuilder.append("		else:\n");
		pythonScriptStringBuilder.append("			df.insert(i,features[i], pd.Series(feature_values_for_prediction[i]))\n\n");
		
		pythonScriptStringBuilder.append("	if(timestamps.lower() == 'on'):\n");
		pythonScriptStringBuilder.append("		with open('" + path_str + "/python-scripts/pickles/" + "preprocess_timeformat.pickle', 'rb') as pickle_file:\n");
		pythonScriptStringBuilder.append("			timeformat = pickle.load(pickle_file)\n");
		pythonScriptStringBuilder.append("		with open('" + path_str + "/python-scripts/pickles/" + "preprocess_base_time.pickle', 'rb') as pickle_file:\n");
		pythonScriptStringBuilder.append("			base_time = pickle.load(pickle_file)\n\n");
		
		pythonScriptStringBuilder.append("	df.insert(0,'timestamp', [(datetime.datetime.strptime(timestamp_for_prediction[1:-1], timeformat)-base_time).seconds])\n\n");
		
		pythonScriptStringBuilder.append("	print (model.predict(df).item(0))\n\n");		
		
		pythonScriptStringBuilder.append("#********* ML2 *********\n\n");
		File pythonScriptsDir = new File(path_str + "/python-scripts");
		if(!pythonScriptsDir.exists()) {
			pythonScriptsDir.mkdirs();
		}
		File scriptFile = new File(path_str + "/python-scripts/predict.py");
		try {
			Files.deleteIfExists(Paths.get(scriptFile.toURI()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileWriter fr = null;
		BufferedWriter br = null;
		try {
			fr = new FileWriter(scriptFile, true);
			br = new BufferedWriter(fr);
			br.append(pythonScriptStringBuilder);
			br.close();
			fr.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}

}
