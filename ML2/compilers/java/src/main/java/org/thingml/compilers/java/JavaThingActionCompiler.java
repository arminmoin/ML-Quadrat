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
import java.lang.reflect.AnnotatedElement;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
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
import org.thingml.xtext.thingML.Activation;
import org.thingml.xtext.thingML.ArrayInit;
import org.thingml.xtext.thingML.AutoML;
import org.thingml.xtext.thingML.DAPredictAction;
import org.thingml.xtext.thingML.DAPreprocessAction;
import org.thingml.xtext.thingML.DASaveAction;
import org.thingml.xtext.thingML.DATrainAction;
import org.thingml.xtext.thingML.DataAnalyticsModelAlgorithm;
import org.thingml.xtext.thingML.DecisionTreeClassifier;
import org.thingml.xtext.thingML.DecisionTreeClassifierCriterion;
import org.thingml.xtext.thingML.DecisionTreeRegressor;
import org.thingml.xtext.thingML.DecisionTreeRegressorCriterion;
import org.thingml.xtext.thingML.DecisionTreeSplitter;
import org.thingml.xtext.thingML.RandomForestClassifier;
import org.thingml.xtext.thingML.RandomForestClassifierCriterion;
import org.thingml.xtext.thingML.RandomForestRegressor;
import org.thingml.xtext.thingML.RandomForestRegressorCriterion;
import org.thingml.xtext.thingML.NN_MultilayerPerceptron;
import org.thingml.xtext.thingML.NaiveBayesBernoulli;
import org.thingml.xtext.thingML.NaiveBayesCategorical;
import org.thingml.xtext.thingML.NaiveBayesComplement;
import org.thingml.xtext.thingML.NaiveBayesGaussian;
import org.thingml.xtext.thingML.NaiveBayesMultinomial;
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
import org.thingml.xtext.thingML.Learning_rate_mode;
import org.thingml.xtext.thingML.LinearClassifierLogisticRegression;
import org.thingml.xtext.thingML.LinearRegression;
import org.thingml.xtext.thingML.LocalVariable;
import org.thingml.xtext.thingML.Loss;
import org.thingml.xtext.thingML.ML2_ModelAlgorithm;
import org.thingml.xtext.thingML.Max_features_enum;
import org.thingml.xtext.thingML.Multi_class;
import org.thingml.xtext.thingML.NotEqualsExpression;
import org.thingml.xtext.thingML.Optimizer;
import org.thingml.xtext.thingML.Parameter;
import org.thingml.xtext.thingML.Penalty;
import org.thingml.xtext.thingML.Preprocess_feature_scaling;
import org.thingml.xtext.thingML.PrimitiveType;
import org.thingml.xtext.thingML.PrintAction;
import org.thingml.xtext.thingML.Property;
import org.thingml.xtext.thingML.PropertyReference;
import org.thingml.xtext.thingML.ReceiveMessage;
import org.thingml.xtext.thingML.SendAction;
import org.thingml.xtext.thingML.Sequential;
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
		builder.append(
				JavaHelper.getJavaType(action.getTypeRef().getType(), action.getTypeRef().isIsArray(), ctx));
		builder.append(" ");

		builder.append(ctx.getVariableName(action));

		// Define the initial value for that variable
		if (action.getInit() != null) {
			builder.append(" = ");
			cast(action.getTypeRef().getType(), action.getTypeRef().isIsArray(), action.getInit(), builder, ctx);
			builder.append(";\n");
		} else {
			if (action.getTypeRef().getCardinality() != null) {
				builder.append(" = new " + JavaHelper.getJavaType(action.getTypeRef().getType(), false, ctx)
						+ "[(int)(");
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
		if (((Enumeration) lit.eContainer()).getTypeRef() != null) {
			generate(lit.getInit(), builder, ctx);
		} else {
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
		for (Expression e : expression.getValues()) {
			if (expression.getValues().indexOf(e) > 0)
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
		builder.append("for(" + t + " " + ctx.getVariableName(fa.getVariable()) + " : "
				+ ctx.getVariableName(fa.getArray().getProperty()) + ") {\n");
		generate(fa.getAction(), builder, ctx);
		if (fa.getIndex() != null) {
			builder.append(ctx.getVariableName(fa.getIndex()) + "++;\n");
		}
		builder.append("}\n");
		if (fa.getIndex() != null) {
			builder.append("}\n");
		}
	}
	
	//ML2 Helper String first to upper-case (capitalize first letter)
	private String first_to_upper(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
	
	// ML2: da_save
	@Override
	public void generate(DASaveAction action, StringBuilder builder, Context ctx) { // ML2
		// builder.append("\n//********* ML2 *********\n");
		builder.append("File dataDir = new File(\"data\");\n");
		builder.append("if(!dataDir.exists())\n");
		builder.append("dataDir.mkdirs();\n");
		builder.append("File datasetFile = new File(\"" + action.getDataAnalytics().getDataset() + "\");\n");
		builder.append("FileWriter fr = null;\n");
		builder.append("BufferedWriter br = null;\n");
		builder.append("try{\n");
		builder.append("	fr = new FileWriter(datasetFile, true);\n");
		builder.append("	br = new BufferedWriter(fr);\n");

		// Writing the timestamp to the CSV file
		String str0 = "";
		if (action.getDataAnalytics().getTimestamps().equals(Timestamps.ON)) {
			str0 = "LocalDateTime.now().format(DateTimeFormatter.ofPattern(\"dd-MM-yyyy HH:mm:ss\")).toString()";
			builder.append("	br.write(" + str0 + " + \",\");\n");
		}

		// Writing the attribute value of the feature to the CSV file
		String str1 = "";
		for (int i = 0; i < action.getDataAnalytics().getFeatures().size() - 1; i++) {
			if (!(action.getDataAnalytics().getFeatures().get(i).getTypeRef().getType() instanceof Enumeration)) {
				if (AnnotatedElementHelper.hasAnnotation(
						action.getDataAnalytics().getFeatures().get(i).getTypeRef().getType(), "java_type")) { // Java
																												// Type
					if (!action.getDataAnalytics().getFeatures().get(i).getTypeRef().isIsArray()) { // This feature is
																									// not an array
						str1 = str1 + "String.valueOf("
								+ ctx.getVariableName(action.getDataAnalytics().getFeatures().get(i)) + ")"
								+ " + \",\"";
						builder.append("	br.write(" + str1 + ");\n");
					} else { // This feature is an array
						builder.append("	String array_var_val_str1 = \"[\";\n");
						builder.append("	boolean flag1 = false;\n");
						builder.append("	for(int i = 0; i < "
								+ ctx.getVariableName(action.getDataAnalytics().getFeatures().get(i))
								+ ".length; i++) {\n");
						builder.append("		if(!flag1) {\n");
						builder.append("			array_var_val_str1 = array_var_val_str1 + String.valueOf("
								+ ctx.getVariableName(action.getDataAnalytics().getFeatures().get(i)) + "[i]);\n");
						builder.append("			flag1 = true;\n");
						builder.append("		} else {\n");
						builder.append("			array_var_val_str1 = array_var_val_str1 + \" \" + String.valueOf("
								+ ctx.getVariableName(action.getDataAnalytics().getFeatures().get(i)) + "[i]);\n");
						builder.append("		}\n");
						builder.append("	}\n");
						builder.append("	array_var_val_str1 = array_var_val_str1 + \"]\";\n");
						builder.append("	br.write(" + "array_var_val_str1 + \",\");\n");
					}
				} else { // Not a Java Type
					System.err.println("ERROR: Property " + action.getDataAnalytics().getFeatures().get(i).getName()
							+ " has type "
							+ action.getDataAnalytics().getFeatures().get(i).getTypeRef().getType().getName()
							+ ", which is not registered as a Java type. Please add the proper annotation: @java_type... ");
				}
			}
		}

		// Writing the prediction results to the CSV file
		String str2 = "";
		if (!(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().getType() instanceof Enumeration)) {
			if (AnnotatedElementHelper.hasAnnotation(
					action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().getType(), "java_type")) { // Java
																													// type
				if (!action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().isIsArray()) { // We are not
																											// predicting
																											// an array
					str2 = "String.valueOf("
							+ ctx.getVariableName(action.getDataAnalytics().getPredictionResults().get(0)) + ")";
					builder.append("	br.write(" + str2 + "+ \"\\n\");\n");
				} else { // We are predicting an array
					builder.append("	String array_var_val_str2 = \"[\";\n");
					builder.append("	boolean flag2 = false;\n");
					builder.append("	for(int i = 0; i < "
							+ ctx.getVariableName(action.getDataAnalytics().getPredictionResults().get(0))
							+ ".length; i++) {\n");
					builder.append("		if(!flag2) {\n");
					builder.append("			array_var_val_str2 = array_var_val_str2 + String.valueOf("
							+ ctx.getVariableName(action.getDataAnalytics().getPredictionResults().get(0)) + "[i]);\n");
					builder.append("			flag2 = true;\n");
					builder.append("		} else {\n");
					builder.append("			array_var_val_str2 = array_var_val_str2 + \" \" + String.valueOf("
							+ ctx.getVariableName(action.getDataAnalytics().getPredictionResults().get(0)) + "[i]);\n");
					builder.append("		}\n");
					builder.append("	}\n");
					builder.append("	array_var_val_str2 = array_var_val_str2 + \"]\";\n");
					// Write the prediction to the CSV file
					builder.append("	br.write(" + "array_var_val_str2 + \"\\n\");\n");
				}
			} else { // Not a Java Type
				System.err.println("ERROR: Property "
						+ action.getDataAnalytics().getPredictionResults().get(0).getName() + " has type "
						+ action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().getType().getName()
						+ ", which is not registered as a Java type. Please add the proper annotation: @java_type... ");
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
		// builder.append("//********* ML2 *********\n\n");
	}

	// ML2: da_preprocess
	@Override
	public void generate(DAPreprocessAction action, StringBuilder builder, Context ctx) {
		Path path = null;
		path = Paths.get(new File(ctx.getOutputDirectory().getAbsolutePath().toString()).toURI());
		
		String dataset = path.toString() + "tmp_dataset.csv";
		if(action.getDataAnalytics().getDataset() != null) {
			dataset = action.getDataAnalytics().getDataset();
		} else {
			System.err.println("WARNING: No dataset specified in the data analytics section! Using tmp_dataset.csv as the default...\n");
		}
		
		// AutoML is by default off
		if(action.getDataAnalytics().getAutoML().getValue() == AutoML.NOT_SET_VALUE) {
			System.err.println("WARNING: Parameter automl not specified in the data analytics section. Thus, the default value off is assumed...\n");
			action.getDataAnalytics().setAutoML(AutoML.OFF);
		}

		String sequential = "";
		if(action.getDataAnalytics().getSequential().getValue() == Sequential.NOT_SET_VALUE) {
			if(action.getDataAnalytics().getAutoML().getValue() == AutoML.ON_VALUE) {
					if(action.getDataAnalytics().getTimestamps().getValue() == Timestamps.ON_VALUE) {
						System.err.println("WARNING: Parameter sequential not specified in the data analytics section! Since AutoML is on, and the timestamps parameter is also set to on, the boolean value TRUE will be assumed for parameter sequential...\n");
						action.getDataAnalytics().setSequential(Sequential.TRUE);
					} else if(action.getDataAnalytics().getTimestamps().getValue() == Timestamps.OFF_VALUE) {
						System.err.println("WARNING: Parameter sequential not specified in the data analytics section! Since AutoML is on, and the timestamps parameter is set to off, the boolean value FALSE will be assumed for parameter sequential...\n");
						action.getDataAnalytics().setSequential(Sequential.FALSE);
				} else {
					System.err.println("WARNING: Parameter sequential not specified in the data analytics section! Using FALSE as the default value...\n");
					action.getDataAnalytics().setSequential(Sequential.FALSE);
				}
			} else {
				System.err.println("WARNING: Parameter sequential not specified in the data analytics section! Using FALSE as the default value...\n");
				action.getDataAnalytics().setSequential(Sequential.FALSE);
			}
		}
		sequential = action.getDataAnalytics().getSequential().getName();
		
		String timestamps = "";
		if(action.getDataAnalytics().getTimestamps().getValue() == Timestamps.NOT_SET_VALUE) {
			if(action.getDataAnalytics().getAutoML().getValue() == AutoML.ON_VALUE) {
				if(action.getDataAnalytics().getSequential().getValue() == Sequential.TRUE_VALUE) {
					System.err.println("WARNING: Parameter timestamps not specified in the data analytics section! Since AutoML is on, and the sequential parameter is set to TRUE, the value ON will be assumed for parameter timestamps...\n");
					action.getDataAnalytics().setTimestamps(Timestamps.ON);
				} else if(action.getDataAnalytics().getSequential().getValue() == Sequential.FALSE_VALUE) {
					System.err.println("WARNING: Parameter timestamps not specified in the data analytics section! Since AutoML is on, and the sequential parameter is set to FALSE, the value OFF will be assumed for parameter timestamps...\n");
					action.getDataAnalytics().setTimestamps(Timestamps.OFF);
				} else {
					System.err.println("WARNING: Parameter timestamps not specified in the data analytics section! Using OFF as the default value...\n");
					action.getDataAnalytics().setTimestamps(Timestamps.OFF);
				}
			} else {
				System.err.println("WARNING: Parameter timestamps not specified in the data analytics section! Using OFF as the default value...\n");
				action.getDataAnalytics().setTimestamps(Timestamps.OFF);
			}
		}
		timestamps = action.getDataAnalytics().getTimestamps().getName();
		
		String labels = action.getDataAnalytics().getLabels().getName();
		
		EList<Property> features = action.getDataAnalytics().getFeatures();
		List<String> feature_types = new ArrayList<String>();
		for (int i = 0; i < features.size(); i++) {
			if (action.getDataAnalytics().getFeatures().get(i).getTypeRef().isIsArray()) {
				feature_types
						.add(action.getDataAnalytics().getFeatures().get(i).getTypeRef().getType().getName() + "[]");
			} else {
				feature_types.add(action.getDataAnalytics().getFeatures().get(i).getTypeRef().getType().getName());
			}

		}
		
		// builder.append("\n//********* ML2 *********\n");
		generatePythonDAPreprocessingScript(path.toString() + "/src", action);
		
		builder.append("File dataDir = new File(\"data\");\n");
		builder.append("if(!dataDir.exists()) {\n");
		builder.append("	dataDir.mkdirs();\n");
		builder.append("}\n");
		builder.append("File picklesDir = new File(\"" + path.toString() + "/src/python-scripts/pickles/" + "\");\n");
		builder.append("if(!picklesDir.exists()) {\n");
		builder.append("	picklesDir.mkdirs();\n");
		builder.append("}\n");

		// Make the generated Python script executable
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
		for (int i = 0; i < features.size(); i++) {
			features_str += features.get(i).getName();
			feature_types_str += feature_types.get(i);
			if (i < features.size() - 1) {
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
		// builder.append("//********* ML2 *********\n\n");
	}

	// ML2: Code generator for the data analytics preprocessing Python script,
	// preprocess.py
	public void generatePythonDAPreprocessingScript(String path_str, DAPreprocessAction action) {
		String dalib = "auto";
		if (AnnotatedElementHelper.hasAnnotation(action.getDataAnalytics(), "dalib")) {
			if (action.getDataAnalytics().getAnnotations().get(0).getValue().equals("scikit-learn")
					|| action.getDataAnalytics().getAnnotations().get(0).getValue().equals("keras-tensorflow")
					|| action.getDataAnalytics().getAnnotations().get(0).getValue().equals("pytorch")) {
				dalib = action.getDataAnalytics().getAnnotations().get(0).getValue();
			} else if (action.getDataAnalytics().getAnnotations().get(0).getValue().equals("weka")) {
				System.err.println(
						"ERROR: This compiler/code generator generates Java AND Python code. The data analytics / machine learning part should be generated in Python. However, weka is chosen as the library for data analytics / machine learning in the annotations of the model. Please either change the annotation @dalib to a Python library, e.g., scikit-learn or use the pure Java compiler/code generator!");
			} else {
				dalib = "auto";
			}
		}
		
		StringBuilder pythonScriptStringBuilder = new StringBuilder();
		// pythonScriptStringBuilder.append("#********* ML2 *********\n\n");
		pythonScriptStringBuilder.append("import sys\n");
		pythonScriptStringBuilder.append("import pickle\n");
		pythonScriptStringBuilder.append("import time, datetime\n");
		pythonScriptStringBuilder.append("import pandas as pd\n");
		pythonScriptStringBuilder.append("import numpy as np\n");

		if (dalib.equals("auto") || dalib.equals("scikit-learn")) {
			pythonScriptStringBuilder.append("from sklearn.preprocessing import LabelEncoder\n\n");
		} else if (dalib.equals("keras-tensorflow")) {
			pythonScriptStringBuilder.append("import logging, os, sys\n");
			pythonScriptStringBuilder.append("logging.disable(logging.WARNING)\n");
			pythonScriptStringBuilder.append("os.environ[\"TF_CPP_MIN_LOG_LEVEL\"] = \"3\"\n");
			pythonScriptStringBuilder.append("stderr = sys.stderr\n");
			pythonScriptStringBuilder.append("sys.stderr = open(os.devnull, 'w')\n");
			pythonScriptStringBuilder.append("from keras.utils import to_categorical\n\n");
		} else {
			System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
					+ "You may try @dalib=\"auto\" instead.\n");
		}	

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
		pythonScriptStringBuilder
				.append("df = pd.read_csv(dataset, lineterminator='\\n', names=col_names, header=None)\n");
		pythonScriptStringBuilder.append("original_df = df.copy(deep=True)\n");
		pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/"
				+ "preprocess_original_df.pickle', 'wb') as pickle_file:\n");
		pythonScriptStringBuilder.append("    pickle.dump(original_df, pickle_file)\n\n");
		pythonScriptStringBuilder.append("feature_cols = []\n");
		pythonScriptStringBuilder.append("if(timestamps.lower() == 'on'):\n");
		pythonScriptStringBuilder.append("	feature_cols.append('timestamp')\n");
		pythonScriptStringBuilder.append("	timeformat = \"%d-%m-%Y %H:%M:%S\"\n");
		pythonScriptStringBuilder.append("	with open('" + path_str + "/python-scripts/pickles/"
				+ "preprocess_timeformat.pickle', 'wb') as pickle_file:\n");
		pythonScriptStringBuilder.append("		pickle.dump(timeformat, pickle_file)\n");
		pythonScriptStringBuilder
				.append("	df.timestamp = df.timestamp.apply(lambda x: datetime.datetime.strptime(x, timeformat))\n");
		pythonScriptStringBuilder.append("	base_time = df.timestamp.min()\n");
		pythonScriptStringBuilder.append("	with open('" + path_str + "/python-scripts/pickles/"
				+ "preprocess_base_time.pickle', 'wb') as pickle_file:\n");
		pythonScriptStringBuilder.append("		pickle.dump(base_time, pickle_file)\n");
		pythonScriptStringBuilder.append("	df.timestamp = (df.timestamp - base_time)\n");
		pythonScriptStringBuilder.append("	df.timestamp = df.timestamp.apply(lambda x: x.seconds)\n\n");
		pythonScriptStringBuilder.append(
				"categorical_features_indexes = list(filter(lambda x: feature_types[x] == 'String', range(len(feature_types))))\n\n");
		pythonScriptStringBuilder.append("for i in range(len(features)):\n");
		pythonScriptStringBuilder.append("	if i in categorical_features_indexes:\n");

		if (dalib.equals("auto") || dalib.equals("scikit-learn")) {
			pythonScriptStringBuilder.append("		le = LabelEncoder()\n");
			pythonScriptStringBuilder.append("		le.fit(df[features[i]])\n");
			pythonScriptStringBuilder
					.append("		df[features[i]] = df[features[i]].apply(lambda x: le.transform([x]))\n");
		} else if (dalib.equals("keras-tensorflow")) {
			pythonScriptStringBuilder.append("		mapping = {}\n");
			pythonScriptStringBuilder.append("		for x in range(len(df[features[i]])):\n");
			pythonScriptStringBuilder.append("			mapping[df[features[i]][x]] = x\n");
			pythonScriptStringBuilder.append("		for x in range(len(df[features[i]])):\n");
			pythonScriptStringBuilder.append("			df[features[i]][x] = mapping[df[features[i]][x]]\n");
		} else {
			System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
					+ "You may try @dalib=\"auto\" instead.\n");
		}
		
		// Possible feature scaling: Normalization / Standardization
		if(action.getDataAnalytics().getPreprocess_feature_scaling().getValue() == Preprocess_feature_scaling.NOT_SET_VALUE) {
			if(action.getDataAnalytics().getAutoML().getValue() == AutoML.ON_VALUE) {
				System.err.println("WARNING: Parameter preprocess_feature_scaling not specified in the data analytics section! Since AutoML is on, preprocess_feature_scaling is automatically set to Z-Score Normalization (i.e., Standardization)...\n");
				action.getDataAnalytics().setPreprocess_feature_scaling(Preprocess_feature_scaling.STANDARDIZATION_ZSCORE_NORMALIZATION);
			} else {
				System.err.println("WARNING: Parameter preprocess_feature_scaling not specified in the data analytics section! Since AutoML is off, preprocess_feature_scaling is also set to off (i.e., disabled)...\n");
				action.getDataAnalytics().setPreprocess_feature_scaling(Preprocess_feature_scaling.OFF);
			}
		}
		if(action.getDataAnalytics().getPreprocess_feature_scaling().getValue() != Preprocess_feature_scaling.OFF_VALUE) {
			// STANDARDIZATION_Z_SCORE_NORMALIZATION
			if(action.getDataAnalytics().getPreprocess_feature_scaling().getValue() == Preprocess_feature_scaling.STANDARDIZATION_ZSCORE_NORMALIZATION_VALUE) {
				pythonScriptStringBuilder.append("	else:\n");
				pythonScriptStringBuilder.append("		if(not((labels.lower() == 'on') and (i == len(features)-1))):\n");
				pythonScriptStringBuilder
				.append("			df[features[i]] = df[features[i]].apply(lambda x: (x-df[features[i]].mean())/df[features[i]].std())\n");
			}
			
			// MIN_MAX_NORMALIZATION
			else if(action.getDataAnalytics().getPreprocess_feature_scaling().getValue() == Preprocess_feature_scaling.MIN_MAX_NORMALIZATION_VALUE) {
				pythonScriptStringBuilder.append("	else:\n");
				pythonScriptStringBuilder.append("		if(not((labels.lower() == 'on') and (i == len(features)-1))):\n");
				pythonScriptStringBuilder
				.append("			df[features[i]] = df[features[i]].apply(lambda x: (x-df[features[i]].min())/(df[features[i]].max()-df[features[i]].min()))\n");
			}
			
			// MEAN_NORMALIZATION MIN-MAX
			else if(action.getDataAnalytics().getPreprocess_feature_scaling().getValue() == Preprocess_feature_scaling.MEAN_NORMALIZATION_MIN_MAX_VALUE) {
				pythonScriptStringBuilder.append("	else:\n");
				pythonScriptStringBuilder.append("		if(not((labels.lower() == 'on') and (i == len(features)-1))):\n");
				pythonScriptStringBuilder
				.append("			df[features[i]] = df[features[i]].apply(lambda x: (x-df[features[i]].mean())/(df[features[i]].max()-df[features[i]].min()))\n");
			}
			
			// MEAN_NORMALIZATION L2-NORM
			else if(action.getDataAnalytics().getPreprocess_feature_scaling().getValue() == Preprocess_feature_scaling.MEAN_NORMALIZATION_L2_NORM_VALUE) {
				pythonScriptStringBuilder.append("	else:\n");
				pythonScriptStringBuilder.append("		if(not((labels.lower() == 'on') and (i == len(features)-1))):\n");
				pythonScriptStringBuilder
				.append("			df[features[i]] = df[features[i]].apply(lambda x: (x-df[features[i]].mean())/(np.linalg.norm(df[features[i]].to_numpy())))\n");
			}
			
			// UNIT_LENGTH_SCALING
			else if(action.getDataAnalytics().getPreprocess_feature_scaling().getValue() == Preprocess_feature_scaling.UNIT_LENGTH_SCALING_VALUE) {
				pythonScriptStringBuilder.append("	else:\n");
				pythonScriptStringBuilder.append("		if(not((labels.lower() == 'on') and (i == len(features)-1))):\n");
				pythonScriptStringBuilder
				.append("			df[features[i]] = df[features[i]].apply(lambda x: x/(np.linalg.norm(df[features[i]].to_numpy())))\n");
			}
						
		}
		
		
		pythonScriptStringBuilder.append("	feature_cols.append(features[i])\n\n");
		pythonScriptStringBuilder.append("if(len(categorical_features_indexes) != 0):\n");

		if (dalib.equals("auto") || dalib.equals("scikit-learn")) {
			pythonScriptStringBuilder.append("	with open('" + path_str + "/python-scripts/pickles/"
					+ "preprocess_label_encoder.pickle', 'wb') as pickle_file:\n");
			pythonScriptStringBuilder.append("		pickle.dump(le, pickle_file)\n\n");
		} else if (dalib.equals("keras-tensorflow")) {
			pythonScriptStringBuilder.append("	with open('" + path_str + "/python-scripts/pickles/"
					+ "preprocess_mapping.pickle', 'wb') as pickle_file:\n");
			pythonScriptStringBuilder.append("		pickle.dump(mapping, pickle_file)\n\n");
		} else {
			System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
					+ "You may try @dalib=\"auto\" instead.\n");
		}

		pythonScriptStringBuilder.append("if(labels.lower() == 'on'):\n");
		pythonScriptStringBuilder.append("	X_train =  df.loc[:,feature_cols[:-1]]\n");
		pythonScriptStringBuilder.append("	y_train = df[features[-1]]\n");
		pythonScriptStringBuilder.append("else:\n");
		pythonScriptStringBuilder.append("	X_train =  df.loc[:,feature_cols]\n");
		pythonScriptStringBuilder.append("	y_train = []\n\n");
		// Handling features, which have the array type
		pythonScriptStringBuilder.append(
				"array_features_indexes = list(filter(lambda x: '[' in feature_types[x], range(len(feature_types))))\n");
		pythonScriptStringBuilder.append("for index in array_features_indexes[:-1]:\n");
		pythonScriptStringBuilder.append("	col = '' + features[array_features_indexes[index]]\n");
		pythonScriptStringBuilder.append("	tmp_df_1 = X_train.loc[:, X_train.columns != col]\n");
		pythonScriptStringBuilder.append(
				"	tmp_df_2 = pd.DataFrame(X_train[col].apply(lambda x: x[1:-1]).str.split(' ', expand=True).values).rename(columns=lambda x : col + '_' + str(x))\n");
		pythonScriptStringBuilder.append("	X_train = pd.concat([tmp_df_1,tmp_df_2],axis=1)\n\n");
		pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/"
				+ "preprocess_X_train.pickle', 'wb') as pickle_file:\n");
		pythonScriptStringBuilder.append("	pickle.dump(X_train, pickle_file)\n");
		pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/"
				+ "preprocess_y_train.pickle', 'wb') as pickle_file:\n");
		pythonScriptStringBuilder.append("	pickle.dump(y_train, pickle_file)\n");
		// pythonScriptStringBuilder.append("#********* ML2 *********\n\n");
		File pythonScriptsDir = new File(path_str + "/python-scripts");
		if (!pythonScriptsDir.exists()) {
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

	// ML2: da_train
	@Override
	public void generate(DATrainAction action, StringBuilder builder, Context ctx) {
		Path path = null;
		path = Paths.get(new File(ctx.getOutputDirectory().getAbsolutePath().toString()).toURI());
		// builder.append("\n//********* ML2 *********\n");
		generatePythonDATrainScript(path.toString() + "/src", action);
		
		builder.append("File X_train_pickle = new File(\"" + path.toString()
				+ "/src/python-scripts/pickles/preprocess_X_train.pickle" + "\");\n");
		builder.append("File y_train_pickle = new File(\"" + path.toString()
				+ "/src/python-scripts/pickles/preprocess_y_train.pickle" + "\");\n");
		builder.append("if(!X_train_pickle.exists() || !y_train_pickle.exists())\n");
		builder.append("	return;\n");

		// Make the generated Python script executable
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

		// Save the timestamp of training in the training_results text file
		builder.append("File dataDir = new File(\"data\");\n");
		builder.append("if(!dataDir.exists())\n");
		builder.append("dataDir.mkdirs();\n");
		builder.append(
				"File training_results_file = new File(\"" + action.getDataAnalytics().getTrainingResults() + "\");\n");
		builder.append("FileWriter fr = null;\n");
		builder.append("BufferedWriter br = null;\n");
		builder.append("try{\n");
		builder.append("	fr = new FileWriter(training_results_file, true);\n");
		builder.append("	br = new BufferedWriter(fr);\n");
		String str0 = "LocalDateTime.now().format(DateTimeFormatter.ofPattern(\"dd-MM-yyyy HH:mm:ss\")).toString()";
		String str1 = action.getDataAnalytics().getModelAlgorithm().getName();
		builder.append("	br.write(" + "\"INFO: \" + " + str0 + "+ \", \" + \"" + str1 + "\" + \", training done\" + \"\\n\");\n");
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
		// builder.append("//********* ML2 *********\n\n");
	}

	// ML2: Code generator for the data analytics training Python script, train.py
	public void generatePythonDATrainScript(String path_str, DATrainAction action) {
		DataAnalyticsModelAlgorithm dataAnalyticsModelAlgorithm = action.getDataAnalytics().getModelAlgorithm();

		String dalib = "auto";
		if (AnnotatedElementHelper.hasAnnotation(action.getDataAnalytics(), "dalib")) {
			if (action.getDataAnalytics().getAnnotations().get(0).getValue().equals("scikit-learn")
					|| action.getDataAnalytics().getAnnotations().get(0).getValue().equals("keras-tensorflow")
					|| action.getDataAnalytics().getAnnotations().get(0).getValue().equals("pytorch")) {
				dalib = action.getDataAnalytics().getAnnotations().get(0).getValue();
			} else if (action.getDataAnalytics().getAnnotations().get(0).getValue().equals("weka")) {
				System.err.println(
						"ERROR: This compiler/code generator generates Java AND Python code. The data analytics / machine learning part should be generated in Python. However, weka is chosen as the library for data analytics / machine learning in the annotations of the model. Please either change the annotation @dalib to a Python library, e.g., scikit-learn or use the pure Java compiler/code generator!");
			} else {
				dalib = "auto";
			}
		}

		StringBuilder pythonScriptStringBuilder = new StringBuilder();
		// pythonScriptStringBuilder.append("#********* ML2 *********\n\n");
		pythonScriptStringBuilder.append("import pickle\n\n");
		pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/"
				+ "preprocess_X_train.pickle', 'rb') as pickle_file:\n");
		pythonScriptStringBuilder.append("    X_train = pickle.load(pickle_file)\n");
		pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/"
				+ "preprocess_y_train.pickle', 'rb') as pickle_file:\n");
		pythonScriptStringBuilder.append("    y_train = pickle.load(pickle_file)\n\n");

		if (action.getDataAnalytics().getLabels() == Labels.ON) {
			// Supervised ML
			
			if (dataAnalyticsModelAlgorithm instanceof LinearClassifierLogisticRegression ||
					dataAnalyticsModelAlgorithm instanceof LinearRegression) { // Linear Model
				if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
					// Linear Regression
					if(dataAnalyticsModelAlgorithm instanceof LinearClassifierLogisticRegression) {
						System.err.println("ERROR: The prediction data type is numeric. Therefore, please use the linear regression model for regression, instead of the logistic regression classifier.\n");
					}
					if (dalib.equals("auto") || dalib.equals("scikit-learn")) { // scikit-learn v0.24.1
					pythonScriptStringBuilder.append("from sklearn.linear_model import LinearRegression\n");
					
					String fit_intercept_str = "";
					String normalize_str = "";
					String copy_X_str = "";
					String n_jobs_str = "";
					String positive_str = "";					
					String params = "";
					boolean flag = false;
					
					if(((LinearRegression) (action.getDataAnalytics().getModelAlgorithm())).getFit_intercept() != null) {						
						fit_intercept_str = first_to_upper(String.valueOf(((LinearRegression) (action.getDataAnalytics().getModelAlgorithm())).getFit_intercept().isBoolValue()));
						params += ("fit_intercept=" + fit_intercept_str);
						flag = true;
					}					
					if(((LinearRegression) (action.getDataAnalytics().getModelAlgorithm())).getNormalize() != null) {						
						normalize_str = first_to_upper(String.valueOf(((LinearRegression) (action.getDataAnalytics().getModelAlgorithm())).getNormalize().isBoolValue()));
						if(action.getDataAnalytics().getPreprocess_feature_scaling().getValue() != Preprocess_feature_scaling.OFF_VALUE &&
								((LinearRegression) (action.getDataAnalytics().getModelAlgorithm())).getNormalize().isBoolValue()) {
							System.err.println("WARNING: In the linear regression model, parameter normalize is set to true. This will normalize by subtracting the mean and dividing by the l2-norm (i.e., equivalent to \"MEAN_NORMALIZATION_L2_NORM\").\n However, the data analytics section of the model also includes the preprocess_feature_scaling parameter. You need to make sure that they are consistent and in accordance with what is desired!\n");
						}
						if((!(((LinearRegression) (action.getDataAnalytics().getModelAlgorithm())).getFit_intercept().isBoolValue())) &&
								(((LinearRegression) (action.getDataAnalytics().getModelAlgorithm())).getNormalize().isBoolValue())) {
							System.err.println("WARNING: In the linear regression model, parameter normalize will be ignored, since parameter fit_intercept is set to false.\n Please refer to the API documentation for more information: https://scikit-learn.org/stable/modules/generated/sklearn.linear_model.LinearRegression.html\n");
						}
						if(flag) 
							params += ",";
						params += ("normalize=" + normalize_str);
						flag = true;
					}					
					if(((LinearRegression) (action.getDataAnalytics().getModelAlgorithm())).getCopy_X() != null) {
						copy_X_str = first_to_upper(String.valueOf(((LinearRegression) (action.getDataAnalytics().getModelAlgorithm())).getCopy_X().isBoolValue()));
						if(flag) 
							params += ",";
						params += ("copy_X=" + copy_X_str);
						flag = true;
					}					
					if(((LinearRegression) (action.getDataAnalytics().getModelAlgorithm())).getN_jobs() != null) {
						n_jobs_str = String.valueOf(((LinearRegression) (action.getDataAnalytics().getModelAlgorithm())).getN_jobs().getIntValue());
						if(flag) 
							params += ",";
						params += ("n_jobs=" + n_jobs_str);
						flag = true;
					}					
					if(((LinearRegression) (action.getDataAnalytics().getModelAlgorithm())).getPositive() != null) {
						positive_str = first_to_upper(String.valueOf(((LinearRegression) (action.getDataAnalytics().getModelAlgorithm())).getPositive().isBoolValue()));
						if(flag) 
							params += ",";
						params += ("positive=" + positive_str);
						flag = true;
					}					
					pythonScriptStringBuilder.append("lin_reg = LinearRegression(" + params + ")\n");

					pythonScriptStringBuilder.append("lin_reg = lin_reg.fit(X_train,y_train)\n");
					pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/"
							+ "train_model_lin_reg.pickle', 'wb') as pickle_file:\n");
					pythonScriptStringBuilder.append("    pickle.dump(lin_reg, pickle_file)\n\n");
					} else if(dalib.equals("keras-tensorflow")) {
						System.err.println("ERROR: " + dalib + " is specified as the library for DA/ML. However, it does not support the chosen model/algorithm for DA/ML: " + "linear regression.\n"
					+ "You may try @dalib=\"auto\" instead.\n");
					} else {
						System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
					+ "You may try @dalib=\"auto\" instead.\n");
					}
				} else {
					// Linear Classification through Logistic Regression
					if(dataAnalyticsModelAlgorithm instanceof LinearRegression) {
						System.err.println("ERROR: The prediction data type is categorical. Therefore, please use the logistic regression classifier, instead of the linear regression model.\n");
					}
					if (dalib.equals("auto") || dalib.equals("scikit-learn")) { // scikit-learn v0.24.1
					pythonScriptStringBuilder.append("from sklearn.linear_model import LogisticRegression\n");
					
					String penalty_str = "";
					String dual_str = "";
					String tol_str = "";
					String c_str = "";
					String fit_intercept_str = "";
					String intercept_scaling_str = "";
					String class_weight_str = "";
					String random_state_str = "";
					String solver_str = "";
					String max_iter_str = "";
					String multi_class_str = "";
					String verbose_str = "";
					String warm_start_str = "";
					String n_jobs_str = "";
					String l1_ratio_str = "";
					String params = "";
					String params_without_dual = "";
					String params_without_solver = "";
					String params_without_dual_solver = "";
					boolean flag = false;
					
					// Checking the solver & penalty compatibility...
					// See the API doc: https://scikit-learn.org/stable/modules/generated/sklearn.linear_model.LogisticRegression.html
					boolean penalty_solver_incompatible = false;
					if(
							((((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() == Optimizer.NEWTON_CG_VALUE ||
							((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() == Optimizer.SAG_VALUE ||
							((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() == Optimizer.LBFGS_VALUE) &&
							(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getPenalty().getValue() == Penalty.L1_VALUE ||
							((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getPenalty().getValue() == Penalty.ELASTICNET_VALUE)
							) ||
							(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getPenalty().getValue() == Penalty.ELASTICNET_VALUE &&
							(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() == Optimizer.NEWTON_CG_VALUE ||
							((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() == Optimizer.LBFGS_VALUE ||
							((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() == Optimizer.LIBLINEAR_VALUE ||
							((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() == Optimizer.SAG_VALUE
							)) ||
							(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getPenalty().getValue() == Penalty.NONE_VALUE &&
							((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() == Optimizer.LIBLINEAR_VALUE)
							) {
						penalty_solver_incompatible = true;						
					}
					
					// Checking the dual compatibility...
					// See the API doc: https://scikit-learn.org/stable/modules/generated/sklearn.linear_model.LogisticRegression.html
					boolean ignore_dual = true; // By default true
					pythonScriptStringBuilder.append("dual_is_true = False\n");
					if(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getPenalty().getValue() == Penalty.L2_VALUE &&
							((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() == Optimizer.LIBLINEAR_VALUE) {
								ignore_dual = false;								
							} else if(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getDual() != null) {
								System.err.println("WARNING: In the linear classification (logictic regression) model, dual is only implemented for l2 penalty with liblinear solver. Hence, it is ignored here.\n Please refer to the API documentation of Scikit-Learn for more information: https://scikit-learn.org/stable/modules/generated/sklearn.linear_model.LogisticRegression.html\n");
							}					
					if(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getDual() != null &&
							((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getDual().isBoolValue()) {
						pythonScriptStringBuilder.append("dual_is_true = True\n");
						System.err.println("WARNING: In the linear classification (logictic regression) model, the boolean parameter dual is set to true. However, if n_samples > n_features, this will be ignored, and automatically set to false.\n Please refer to the API documentation of Scikit-Learn for more information: https://scikit-learn.org/stable/modules/generated/sklearn.linear_model.LogisticRegression.html\n");
						}
				
					if(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getPenalty().getValue() != Penalty.NOT_SET_VALUE) {
						if(penalty_solver_incompatible) {
							System.err.println("WARNING: In the linear classification (logictic regression) model, parameter penalty is ignored, since the chosen penalty and solver are incompatible.\n Please refer to the API documentation of Scikit-Learn for more information: https://scikit-learn.org/stable/modules/generated/sklearn.linear_model.LogisticRegression.html\n");
						} else {
							penalty_str = ((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getPenalty().getLiteral();
							params += ("penalty=" + penalty_str);
							params_without_dual += ("penalty=" + penalty_str);
							flag = true;
						}
					}
					if(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getDual() != null &&
							!ignore_dual) {						
						dual_str = first_to_upper(String.valueOf(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getDual().isBoolValue()));
						if(flag) {
							params += ",";
							}
						params += ("dual=" + dual_str);
						flag = true;
					}
					if(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getTol() != null) {						
						tol_str = String.valueOf(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getTol().getDoubleValue());
						if(flag) {
							params += ","; 
							params_without_dual += ",";
							}
						params += ("tol=" + tol_str);
						params_without_dual += ("tol=" + tol_str);
						flag = true;
					}
					if(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getC() != null) {
						if(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getC().getDoubleValue() <= 0) {
							System.err.println("WARNING: In the linear classification (logictic regression) model, parameter C must be a positive float. However, this is currently not the case. Thus, it will be ignored.\n Please see the API documentation for more indormation on this: https://scikit-learn.org/stable/modules/generated/sklearn.linear_model.LogisticRegression.html\n");
						} else {						
							c_str = String.valueOf(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getC().getDoubleValue());
							if(flag) {
								params += ","; 
								params_without_dual += ",";
								}						
							params += ("C=" + c_str);
							params_without_dual += ("C=" + c_str);
							flag = true;
						}
					}
					if(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getFit_intercept() != null) {						
						fit_intercept_str = first_to_upper(String.valueOf(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getFit_intercept().isBoolValue()));
						if(flag) {
							params += ","; 
							params_without_dual += ",";
						}
						params += ("fit_intercept=" + fit_intercept_str);
						params_without_dual += ("fit_intercept=" + fit_intercept_str);
						flag = true;
					}
					if(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getIntercept_scaling() != null) {
						if(!(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getFit_intercept().isBoolValue() &&
								((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() == Optimizer.LIBLINEAR_VALUE)) {
							System.err.println("WARNING: In the linear classification (logictic regression) model, parameter intercept_scaling is useful only when the liblinear solver is used and fit_intercept is set to True. However, this is currently not the case. Thus, it will be ignored.\n Please see the API documentation for more indormation on this: https://scikit-learn.org/stable/modules/generated/sklearn.linear_model.LogisticRegression.html\n");
						} else {
							intercept_scaling_str = String.valueOf(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getIntercept_scaling().getDoubleValue());
							if(flag) {
								params += ",";
								params_without_dual += ",";
							}
							params += ("intercept_scaling=" + intercept_scaling_str);
							params_without_dual += ("intercept_scaling=" + intercept_scaling_str);
							flag = true;
						} 
					}
					if(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getClass_weight() != null) {						
						class_weight_str = ((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getClass_weight().toString();
						if(flag) {
							params += ","; 
							params_without_dual += ",";
							}
						params += ("class_weight=" + class_weight_str);
						params_without_dual += ("class_weight=" + class_weight_str);
						flag = true;
					}
					if(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getRandom_state() != null) {
						if(!(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() == Optimizer.LIBLINEAR_VALUE ||
								((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() == Optimizer.SAG_VALUE ||
								((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() == Optimizer.SAGA_VALUE)) {
							System.err.println("WARNING: In the linear classification (logictic regression) model, parameter random_state may only be used when one of the following solvers is employed: sag, saga or liblinear. However, this is currently not the case. Thus, it will be ignored.\n Please see the API documentation for more indormation on this: https://scikit-learn.org/stable/modules/generated/sklearn.linear_model.LogisticRegression.html\n");
						} else {
							random_state_str = String.valueOf(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getRandom_state().getIntValue());
							if(flag) {
								params += ",";
								params_without_dual += ",";
							}
							params += ("random_state=" + random_state_str);		
							params_without_dual += ("random_state=" + random_state_str);
							flag = true;
						}
					}
					
					params_without_solver = params;
					params_without_dual_solver = params_without_dual;
					
					if(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.NOT_SET_VALUE) {
						if(penalty_solver_incompatible || !(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() == Optimizer.NEWTON_CG_VALUE ||
								((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() == Optimizer.LBFGS_VALUE ||
								((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() == Optimizer.LIBLINEAR_VALUE ||
								((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() == Optimizer.SAG_VALUE ||
										((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() == Optimizer.SAGA_VALUE
								)) {
							if(penalty_solver_incompatible) {
								System.err.println("WARNING: In the linear classification (logictic regression) model, parameter solver is ignored, since the chosen penalty and solver are incompatible.\n Please refer to the API documentation of Scikit-Learn for more information: https://scikit-learn.org/stable/modules/generated/sklearn.linear_model.LogisticRegression.html\n");
							} else {
								System.err.println("WARNING: In the linear classification (logictic regression) model, parameter solver is ignored, since the given solver (optimizer) is not among the supported ones: newton-cg, lbfgs, liblinear, sag and saga.\n Please refer to the API documentation of Scikit-Learn for more information: https://scikit-learn.org/stable/modules/generated/sklearn.linear_model.LogisticRegression.html\n");
							}
						} else {
							
							if((((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() == Optimizer.SAG_VALUE ||
									((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() == Optimizer.SAGA_VALUE) &&
									(action.getDataAnalytics().getPreprocess_feature_scaling().getValue() == Preprocess_feature_scaling.OFF_VALUE)) {
								System.err.println("WARNING: In the linear classification (logictic regression) model, the SAG and SAGA solvers fast convergence is only guaranteed on features with approximately the same scale. However, normalization/standardization is turned off (check parameter preprocess_feature_scaling).\n Please refer to the API documentation of Scikit-Learn for more information: https://scikit-learn.org/stable/modules/generated/sklearn.linear_model.LogisticRegression.html\n");
							}								
							
							solver_str = "\'" + ((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getLiteral() + "\'";
							if(flag) {
								params += ",";
								params_without_dual += ",";	
							}
							params += ("solver=" + solver_str);
							params_without_dual += ("solver=" + solver_str);
							flag = true;
						}
					}
					if(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getMax_iter() != null) {						
						max_iter_str = String.valueOf(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getMax_iter().getIntValue());
						if(flag) {
							params += ",";
							params_without_dual += ",";
							params_without_solver += ",";
							params_without_dual_solver += ",";
						}
						params += ("max_iter=" + max_iter_str);
						params_without_dual += ("max_iter=" + max_iter_str);
						params_without_solver += ("max_iter=" + max_iter_str);
						params_without_dual_solver += ("max_iter=" + max_iter_str);
						flag = true;
					}
					if(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getMulti_class().getValue() != Multi_class.NOT_SET_VALUE) {
						multi_class_str = ((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getMulti_class().getLiteral();
						if(flag) {
							params += ",";
							params_without_dual += ",";
							params_without_solver += ",";
							params_without_dual_solver += ",";
						}
						params += ("multi_class=" + multi_class_str);
						params_without_dual += ("multi_class=" + multi_class_str);
						params_without_solver += ("multi_class=" + multi_class_str);
						params_without_dual_solver += ("multi_class=" + multi_class_str);
						flag = true;
					}
					if(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getVerbose() != null) {						
						verbose_str = String.valueOf(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getVerbose().getIntValue());
						if(flag) {
							params += ",";
							params_without_dual += ",";
							params_without_solver += ",";
							params_without_dual_solver += ",";
						}
						params += ("verbose=" + verbose_str);
						params_without_dual += ("verbose=" + verbose_str);
						params_without_solver += ("verbose=" + verbose_str);
						params_without_dual_solver += ("verbose=" + verbose_str);
						flag = true;
					}
					if(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getWarm_start() != null) {						
						warm_start_str = first_to_upper(String.valueOf(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getWarm_start().isBoolValue()));
						if(flag) {
							params += ",";
							params_without_dual += ",";
							params_without_solver += ",";
							params_without_dual_solver += ",";
						}
						params += ("warm_start=" + warm_start_str);		
						params_without_dual += ("warm_start=" + warm_start_str);
						params_without_solver += ("warm_start=" + warm_start_str);
						params_without_dual_solver += ("warm_start=" + warm_start_str);
						flag = true;
					}
					if(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getN_jobs() != null) {						
						n_jobs_str = String.valueOf(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getN_jobs().getIntValue());
						if(flag) {
							params += ",";
							params_without_dual += ",";
							params_without_solver += ",";
							params_without_dual_solver += ",";
						}
						params += ("n_jobs=" + n_jobs_str);			
						params_without_dual += ("n_jobs=" + n_jobs_str);
						params_without_solver += ("n_jobs=" + n_jobs_str);
						params_without_dual_solver += ("n_jobs=" + n_jobs_str);
						flag = true;
					}
					if(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getL1_ratio() != null) {						
						l1_ratio_str = String.valueOf(((LinearClassifierLogisticRegression) (action.getDataAnalytics().getModelAlgorithm())).getL1_ratio().getDoubleValue());
						if(flag) {
							params += ",";
							params_without_dual += ",";
							params_without_solver += ",";
							params_without_dual_solver += ",";
						}
						params += ("l1_ratio=" + l1_ratio_str);		
						params_without_dual += ("l1_ratio=" + l1_ratio_str);
						params_without_solver += ("l1_ratio=" + l1_ratio_str);
						params_without_dual_solver += ("l1_ratio=" + l1_ratio_str);
						flag = true;
					}
					
					pythonScriptStringBuilder.append("lin_cl_log_reg = None\n");
					
					//AutoML
					if(action.getDataAnalytics().getAutoML().getValue() == AutoML.ON_VALUE &&
							action.getDataAnalytics().getPreprocess_feature_scaling().getValue() != Preprocess_feature_scaling.OFF_VALUE) {
						//SAGA requires scaling the numeric values. See the API doc: https://scikit-learn.org/stable/modules/generated/sklearn.linear_model.LogisticRegression.html
						System.out.println("INFO: The AutoML mode is on and the data are normalized/standardized/scaled. Hence, depending on the data, the selected solver/optimizer might be ignored and set to a more optimal choice.\n");
						// See the API doc: https://scikit-learn.org/stable/modules/generated/sklearn.linear_model.LogisticRegression.html
						// For small datasets, ‘liblinear’ is a good choice, whereas ‘sag’ and ‘saga’ are faster for large ones.
						pythonScriptStringBuilder.append("if(X_train.shape[0]<1000):\n"); // "small" dataset
						pythonScriptStringBuilder.append("	if(dual_is_true and X_train.shape[0]>X_train.shape[1]):\n");
						pythonScriptStringBuilder.append("		lin_cl_log_reg = LogisticRegression(" + params_without_dual_solver + ",solver=\'" + Optimizer.LIBLINEAR + "\')\n");		
						pythonScriptStringBuilder.append("	else:\n");
						pythonScriptStringBuilder.append("		lin_cl_log_reg = LogisticRegression(" + params_without_solver + ",solver=\'" + Optimizer.LIBLINEAR + "\')\n");
						pythonScriptStringBuilder.append("else:\n"); // "large" or "very large" dataset
						pythonScriptStringBuilder.append("	if(dual_is_true and X_train.shape[0]>X_train.shape[1]):\n");
						pythonScriptStringBuilder.append("		lin_cl_log_reg = LogisticRegression(" + params_without_dual_solver + ",solver=\'" + Optimizer.SAGA + "\')\n");		
						pythonScriptStringBuilder.append("	else:\n");
						pythonScriptStringBuilder.append("		lin_cl_log_reg = LogisticRegression(" + params_without_solver + ",solver=\'" + Optimizer.SAGA + "\')\n");
						
					
					} else {
						pythonScriptStringBuilder.append("if(dual_is_true and X_train.shape[0]>X_train.shape[1]):\n");
						pythonScriptStringBuilder.append("	lin_cl_log_reg = LogisticRegression(" + params_without_dual + ")\n");		
						pythonScriptStringBuilder.append("else:\n");
						pythonScriptStringBuilder.append("	lin_cl_log_reg = LogisticRegression(" + params + ")\n");					
					}
					pythonScriptStringBuilder.append("lin_cl_log_reg = lin_cl_log_reg.fit(X_train,y_train)\n");
					pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/"
							+ "train_model_lin_cl_log_reg.pickle', 'wb') as pickle_file:\n");
					pythonScriptStringBuilder.append("    pickle.dump(lin_cl_log_reg, pickle_file)\n\n");
					} else if(dalib.equals("keras-tensorflow")) {
						System.err.println("ERROR:" + dalib + " is specified as the library for DA/ML. However, it does not support the chosen model/algorithm for DA/ML: " + "logistic regression.\n"
					+ "You may try @dalib=\"auto\" instead.\n");
					} else {
						System.err.println("ERROR:" + dalib + " not supported as the library for DA/ML.\n"
					+ "You may try @dalib=\"auto\" instead.\n");
					}
				}
			} else if(dataAnalyticsModelAlgorithm instanceof NaiveBayesGaussian) { // Gaussian Naive Bayes (NB)
				if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
					System.err.println("ERROR: " + dataAnalyticsModelAlgorithm.getName() + " is a not a regression ML algorithm, but a classification ML algorithm. However, it is used with a numerical type for the prediction results.\n");
				} else { // Classification
					if (dalib.equals("auto") || dalib.equals("scikit-learn")) { // scikit-learn v0.24.1
						pythonScriptStringBuilder.append("from sklearn.naive_bayes import GaussianNB\n");
						
						String priors_str = "";
						String var_smoothing_str = "";
						String params = "";
						boolean flag = false;
						
						if(((NaiveBayesGaussian) (action.getDataAnalytics().getModelAlgorithm())).getPriors() != null) {						
							priors_str = ((NaiveBayesGaussian) (action.getDataAnalytics().getModelAlgorithm())).getPriors().toString();
							params += ("priors=" + priors_str);
							flag = true;
						}
						if(((NaiveBayesGaussian) (action.getDataAnalytics().getModelAlgorithm())).getVar_smoothing() != null) {						
							var_smoothing_str = String.valueOf(((NaiveBayesGaussian) (action.getDataAnalytics().getModelAlgorithm())).getVar_smoothing().getDoubleValue());
							if(flag)
								params += ",";
							params += ("var_smoothing=" + var_smoothing_str);
							flag = true;
						}
					
						pythonScriptStringBuilder.append("gnb = GaussianNB(" + params + ")\n");					
						
						pythonScriptStringBuilder.append("gnb = gnb.fit(X_train,y_train)\n");
						pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/"
								+ "train_model_gnb.pickle', 'wb') as pickle_file:\n");
						pythonScriptStringBuilder.append("    pickle.dump(gnb, pickle_file)\n\n");
						
					} else if(dalib.equals("keras-tensorflow")) {
						System.err.println("ERROR: " + dalib + " is specified as the library for DA/ML. However, it does not support the chosen model/algorithm for DA/ML: " + "naive bayes.\n"
					+ "You may try @dalib=\"auto\" instead.\n");
					} else {
						System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
					+ "You may try @dalib=\"auto\" instead.\n");
					} 
				}
				
			} else if(dataAnalyticsModelAlgorithm instanceof NaiveBayesMultinomial) { // Multinomial NB
				if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
					System.err.println("ERROR: " + dataAnalyticsModelAlgorithm.getName() + " is a not a regression ML algorithm, but a classification ML algorithm. However, it is used with a numerical type for the prediction results.\n");
				} else { // Classification
					if (dalib.equals("auto") || dalib.equals("scikit-learn")) { // scikit-learn v0.24.1
						pythonScriptStringBuilder.append("from sklearn.naive_bayes import MultinomialNB\n");
						
						String alpha_str = "";
						String fit_prior_str = "";
						String class_prior_str = "";
						String params = "";
						boolean flag = false;
						
						if(((NaiveBayesMultinomial) (action.getDataAnalytics().getModelAlgorithm())).getAlpha() != null) {						
							alpha_str = String.valueOf(((NaiveBayesMultinomial) (action.getDataAnalytics().getModelAlgorithm())).getAlpha().getDoubleValue());
							params += ("alpha=" + alpha_str);
							flag = true;
						}
						if(((NaiveBayesMultinomial) (action.getDataAnalytics().getModelAlgorithm())).getFit_prior() != null) {						
							fit_prior_str = first_to_upper(String.valueOf(((NaiveBayesMultinomial) (action.getDataAnalytics().getModelAlgorithm())).getFit_prior().isBoolValue()));
							if(flag)
								params += ",";
							params += ("fit_prior=" + fit_prior_str);
							flag = true;
						}
						if(((NaiveBayesMultinomial) (action.getDataAnalytics().getModelAlgorithm())).getClass_prior() != null) {						
							class_prior_str = ((NaiveBayesMultinomial) (action.getDataAnalytics().getModelAlgorithm())).getClass_prior().toString();
							if(flag)
								params += ",";
							params += ("class_prior=" + class_prior_str);
							flag = true;
						}
					
						pythonScriptStringBuilder.append("mnb = MultinomialNB(" + params + ")\n");					
						
						pythonScriptStringBuilder.append("mnb = mnb.fit(X_train,y_train)\n");
						pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/"
								+ "train_model_mnb.pickle', 'wb') as pickle_file:\n");
						pythonScriptStringBuilder.append("    pickle.dump(mnb, pickle_file)\n\n");
					} else if(dalib.equals("keras-tensorflow")) {
						System.err.println("ERROR: " + dalib + " is specified as the library for DA/ML. However, it does not support the chosen model/algorithm for DA/ML: " + "naive bayes.\n"
					+ "You may try @dalib=\"auto\" instead.\n");
					} else {
						System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
					+ "You may try @dalib=\"auto\" instead.\n");
					} 
				}
				
			} else if(dataAnalyticsModelAlgorithm instanceof NaiveBayesComplement) { // Complement NB
				if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
					System.err.println("ERROR: " + dataAnalyticsModelAlgorithm.getName() + " is a not a regression ML algorithm, but a classification ML algorithm. However, it is used with a numerical type for the prediction results.\n");
				} else { // Classification
					if (dalib.equals("auto") || dalib.equals("scikit-learn")) { // scikit-learn v0.24.1
						pythonScriptStringBuilder.append("from sklearn.naive_bayes import ComplementNB\n");
						
						String alpha_str = "";
						String fit_prior_str = "";
						String class_prior_str = "";
						String norm_str = "";
						String params = "";
						boolean flag = false; 
						
						if(((NaiveBayesComplement) (action.getDataAnalytics().getModelAlgorithm())).getAlpha() != null) {						
							alpha_str = String.valueOf(((NaiveBayesComplement) (action.getDataAnalytics().getModelAlgorithm())).getAlpha().getDoubleValue());
							params += ("alpha=" + alpha_str);
							flag = true;
						}
						if(((NaiveBayesComplement) (action.getDataAnalytics().getModelAlgorithm())).getFit_prior() != null) {						
							fit_prior_str = first_to_upper(String.valueOf(((NaiveBayesComplement) (action.getDataAnalytics().getModelAlgorithm())).getFit_prior().isBoolValue()));
							if(flag)
								params += ",";
							params += ("fit_prior=" + fit_prior_str);
							flag = true;
						}
						if(((NaiveBayesComplement) (action.getDataAnalytics().getModelAlgorithm())).getClass_prior() != null) {						
							class_prior_str = ((NaiveBayesComplement) (action.getDataAnalytics().getModelAlgorithm())).getClass_prior().toString();
							if(flag)
								params += ",";
							params += ("class_prior=" + class_prior_str);
							flag = true;
						}
						if(((NaiveBayesComplement) (action.getDataAnalytics().getModelAlgorithm())).getNorm() != null) {						
							norm_str = first_to_upper(String.valueOf(((NaiveBayesComplement) (action.getDataAnalytics().getModelAlgorithm())).getNorm().isBoolValue()));
							if(flag)
								params += ",";
							params += ("norm=" + norm_str);
							flag = true;
						}					
						pythonScriptStringBuilder.append("cnb = ComplementNB(" + params + ")\n");					
						
						pythonScriptStringBuilder.append("cnb = cnb.fit(X_train,y_train)\n");
						pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/"
								+ "train_model_cnb.pickle', 'wb') as pickle_file:\n");
						pythonScriptStringBuilder.append("    pickle.dump(cnb, pickle_file)\n\n");
					} else if(dalib.equals("keras-tensorflow")) {
						System.err.println("ERROR: " + dalib + " is specified as the library for DA/ML. However, it does not support the chosen model/algorithm for DA/ML: " + "naive bayes.\n"
					+ "You may try @dalib=\"auto\" instead.\n");
					} else {
						System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
					+ "You may try @dalib=\"auto\" instead.\n");
					} 
				}
				
			} else if(dataAnalyticsModelAlgorithm instanceof NaiveBayesBernoulli) { // Bernoulli NB
				if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
					System.err.println("ERROR: " + dataAnalyticsModelAlgorithm.getName() + " is a not a regression ML algorithm, but a classification ML algorithm. However, it is used with a numerical type for the prediction results.\n");
				} else { // Classification
					if (dalib.equals("auto") || dalib.equals("scikit-learn")) { // scikit-learn v0.24.1
						pythonScriptStringBuilder.append("from sklearn.naive_bayes import BernoulliNB\n");
						
						String alpha_str = "";
						String binarize_str = "";
						String fit_prior_str = "";
						String class_prior_str = "";
						String params = "";
						boolean flag = false;
						
						if(((NaiveBayesBernoulli) (action.getDataAnalytics().getModelAlgorithm())).getAlpha() != null) {						
							alpha_str = String.valueOf(((NaiveBayesBernoulli) (action.getDataAnalytics().getModelAlgorithm())).getAlpha().getDoubleValue());
							params += ("alpha=" + alpha_str);
							flag = true;
						}
						if(((NaiveBayesBernoulli) (action.getDataAnalytics().getModelAlgorithm())).getBinarize() != null) {						
							binarize_str = String.valueOf(((NaiveBayesBernoulli) (action.getDataAnalytics().getModelAlgorithm())).getBinarize().getDoubleValue());
							if(flag)
								params += ",";
							params += ("binarize=" + binarize_str);
							flag = true;
						}
						if(((NaiveBayesBernoulli) (action.getDataAnalytics().getModelAlgorithm())).getFit_prior() != null) {						
							fit_prior_str = first_to_upper(String.valueOf(((NaiveBayesBernoulli) (action.getDataAnalytics().getModelAlgorithm())).getFit_prior().isBoolValue()));
							if(flag)
								params += ",";
							params += ("fit_prior=" + fit_prior_str);
							flag = true;
						}
						if(((NaiveBayesBernoulli) (action.getDataAnalytics().getModelAlgorithm())).getClass_prior() != null) {						
							class_prior_str = ((NaiveBayesBernoulli) (action.getDataAnalytics().getModelAlgorithm())).getClass_prior().toString();
							if(flag)
								params += ",";
							params += ("class_prior=" + class_prior_str);
							flag = true;
						}					
						pythonScriptStringBuilder.append("bnb = BernoulliNB(" + params + ")\n");					
						
						pythonScriptStringBuilder.append("bnb = bnb.fit(X_train,y_train)\n");
						pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/"
								+ "train_model_bnb.pickle', 'wb') as pickle_file:\n");
						pythonScriptStringBuilder.append("    pickle.dump(bnb, pickle_file)\n\n");
					} else if(dalib.equals("keras-tensorflow")) {
						System.err.println("ERROR: " + dalib + " is specified as the library for DA/ML. However, it does not support the chosen model/algorithm for DA/ML: " + "naive bayes.\n"
					+ "You may try @dalib=\"auto\" instead.\n");
					} else {
						System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
					+ "You may try @dalib=\"auto\" instead.\n");
					} 
				}
				
			} else if(dataAnalyticsModelAlgorithm instanceof NaiveBayesCategorical) { // Categorical NB
				if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
					System.err.println("ERROR: " + dataAnalyticsModelAlgorithm.getName() + " is a not a regression ML algorithm, but a classification ML algorithm. However, it is used with a numerical type for the prediction results.\n");
				} else { // Classification
					if (dalib.equals("auto") || dalib.equals("scikit-learn")) { // scikit-learn v0.24.1
						pythonScriptStringBuilder.append("from sklearn.naive_bayes import CategoricalNB\n");
						
						String alpha_str = "";
						String fit_prior_str = "";
						String class_prior_str = "";
						String min_categories_str = "";
						String params = "";
						boolean flag = false;
						
						if(((NaiveBayesCategorical) (action.getDataAnalytics().getModelAlgorithm())).getAlpha() != null) {						
							alpha_str = String.valueOf(((NaiveBayesCategorical) (action.getDataAnalytics().getModelAlgorithm())).getAlpha().getDoubleValue());
							params += ("alpha=" + alpha_str);
							flag = true;
						}
						if(((NaiveBayesCategorical) (action.getDataAnalytics().getModelAlgorithm())).getFit_prior() != null) {						
							fit_prior_str = first_to_upper(String.valueOf(((NaiveBayesCategorical) (action.getDataAnalytics().getModelAlgorithm())).getFit_prior().isBoolValue()));
							if(flag)
								params += ",";
							params += ("fit_prior=" + fit_prior_str);
							flag = true;
						}
						if(((NaiveBayesCategorical) (action.getDataAnalytics().getModelAlgorithm())).getClass_prior() != null) {						
							class_prior_str = ((NaiveBayesCategorical) (action.getDataAnalytics().getModelAlgorithm())).getClass_prior().toString();
							if(flag)
								params += ",";
							params += ("class_prior=" + class_prior_str);
							flag = true;
						}
						if(((NaiveBayesCategorical) (action.getDataAnalytics().getModelAlgorithm())).getMin_categories() != null) {						
							min_categories_str = ((NaiveBayesCategorical) (action.getDataAnalytics().getModelAlgorithm())).getMin_categories().toString();
							if(flag)
								params += ",";
							params += ("min_categories=" + min_categories_str);
							flag = true;
						}					
						pythonScriptStringBuilder.append("cat_nb = CategoricalNB(" + params + ")\n");					
						
						pythonScriptStringBuilder.append("cat_nb = cat_nb.fit(X_train,y_train)\n");
						pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/"
								+ "train_model_cat_nb.pickle', 'wb') as pickle_file:\n");
						pythonScriptStringBuilder.append("    pickle.dump(cat_nb, pickle_file)\n\n");
					} else if(dalib.equals("keras-tensorflow")) {
						System.err.println("ERROR: " + dalib + " is specified as the library for DA/ML. However, it does not support the chosen model/algorithm for DA/ML: " + "naive bayes.\n"
					+ "You may try @dalib=\"auto\" instead.\n");
					} else {
						System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
					+ "You may try @dalib=\"auto\" instead.\n");
					} 
				}
				
			} else if (dataAnalyticsModelAlgorithm instanceof DecisionTreeRegressor) { // Decision Tree (DT) Regression
				if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
					if (dalib.equals("auto") || dalib.equals("scikit-learn")) { // scikit-learn v0.24.1
					pythonScriptStringBuilder.append("from sklearn.tree import DecisionTreeRegressor\n");
					
					String criterion_str = "";
					String splitter_str = "";
					String max_depth_str = "";
					String min_samples_split_str = "";
					String min_samples_leaf_str = "";
					String min_weight_fraction_leaf_str = "";
					String max_features_str = "";
					String random_state_str = "";
					String max_leaf_nodes_str = "";
					String min_impurity_decrease_str = "";
					String min_impurity_split_str = "";
					String ccp_alpha_str = "";
					String params = "";
					boolean flag = false;
					
					if(((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getDecisionTreeRegressorCriterion().getValue() != DecisionTreeRegressorCriterion.NOT_SET_VALUE) {						
						criterion_str = ((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getDecisionTreeRegressorCriterion().getLiteral();
						params += ("criterion=" + criterion_str);
						flag = true;
					}
					if(((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getDecisionTreeSplitter().getValue() != DecisionTreeSplitter.NOT_SET_VALUE) {						
						splitter_str = ((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getDecisionTreeSplitter().getLiteral();
						if(flag)
							params += ",";
						params += ("splitter=" + splitter_str);
						flag = true;
					}
					if(((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMax_depth() != null) {						
						max_depth_str = String.valueOf(((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMax_depth().getIntValue());
						if(flag)
							params += ",";
						params += ("max_depth=" + max_depth_str);
						flag = true;
					}
					if(((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMin_samples_split() != null) {						
						min_samples_split_str = String.valueOf(((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMin_samples_split().getDoubleValue());
						if(flag)
							params += ",";
						params += ("min_samples_split=" + min_samples_split_str);
						flag = true;
					}
					if(((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMin_samples_leaf() != null) {						
						min_samples_leaf_str = String.valueOf(((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMin_samples_leaf().getDoubleValue());
						if(flag)
							params += ",";
						params += ("min_samples_leaf=" + min_samples_leaf_str);
						flag = true;
					}
					if(((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMin_weight_fraction_leaf() != null) {						
						min_weight_fraction_leaf_str = String.valueOf(((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMin_weight_fraction_leaf().getDoubleValue());
						if(flag)
							params += ",";
						params += ("min_weight_fraction_leaf=" + min_weight_fraction_leaf_str);
						flag = true;
					}
					if(((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMax_features_numeric() != null ||
							((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMax_features_enum().getValue() != Max_features_enum.NOT_SET_VALUE) {						
						
						if(((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMax_features_numeric() != null) {
							max_features_str = String.valueOf(((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMax_features_numeric().getDoubleValue());
							if(flag)
								params += ",";
							params += ("max_features=" + max_features_str);
							flag = true;
						} else {
							max_features_str = ((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMax_features_enum().getLiteral();
							if(flag)
								params += ",";
							params += ("max_features=" + max_features_str);
							flag = true;
						}
					}
					if(((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getRandom_state() != null) {						
						random_state_str = String.valueOf(((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getRandom_state().getIntValue());
						if(flag)
							params += ",";
						params += ("random_state=" + random_state_str);
						flag = true;
					}
					if(((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMax_leaf_nodes() != null) {						
						max_leaf_nodes_str = String.valueOf(((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMax_leaf_nodes().getIntValue());
						if(flag)
							params += ",";
						params += ("max_leaf_nodes=" + max_leaf_nodes_str);
						flag = true;
					}
					if(((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMin_impurity_decrease() != null) {						
						min_impurity_decrease_str = String.valueOf(((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMin_impurity_decrease().getDoubleValue());
						if(flag)
							params += ",";
						params += ("min_impurity_decrease=" + min_impurity_decrease_str);
						flag = true;
					}
					if(((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMin_impurity_split() != null) {						
						System.err.println("WARNING: In the decision tree regressor, parameter min_impurity_split is present. However, this has been deprecated. Use min_impurity_decrease instead.\n See the API documentation for more information: https://scikit-learn.org/stable/modules/generated/sklearn.tree.DecisionTreeRegressor.html\n");
						min_impurity_split_str = String.valueOf(((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMin_impurity_split().getDoubleValue());
						if(flag)
							params += ",";
						params += ("min_impurity_split=" + min_impurity_split_str);
						flag = true;
					}
					if(((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getCcp_alpha() != null) {
						if(((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getCcp_alpha().getDoubleValue() < 0) { // See the API documentation: https://scikit-learn.org/stable/modules/generated/sklearn.tree.DecisionTreeRegressor.html						
							System.err.println("ERROR: In the decision tree regressor, parameter ccp_alpha is not allowed to be negative.\n See the API documentation for more information: https://scikit-learn.org/stable/modules/generated/sklearn.tree.DecisionTreeRegressor.html\n");
						} else {
							ccp_alpha_str = String.valueOf(((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getCcp_alpha().getDoubleValue());
							if(flag)
								params += ",";
							params += ("ccp_alpha=" + ccp_alpha_str);
							flag = true;
						}
					}
					pythonScriptStringBuilder.append("dtr = DecisionTreeRegressor(" + params + ")\n");
					pythonScriptStringBuilder.append("dtr = dtr.fit(X_train,y_train)\n");
					pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/"
							+ "train_model_dtr.pickle', 'wb') as pickle_file:\n");
					pythonScriptStringBuilder.append("    pickle.dump(dtr, pickle_file)\n\n");
					} else if(dalib.equals("keras-tensorflow")) {
						System.err.println("ERROR: " + dalib + " is specified as the library for DA/ML. However, it does not support the chosen model/algorithm for DA/ML: " + dataAnalyticsModelAlgorithm.getName() + ".\n"
					+ "You may try @dalib=\"auto\" instead.\n");
					} else {
						System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
					+ "You may try @dalib=\"auto\" instead.\n");
					}
				} else {
					System.err.println("ERROR: " + dataAnalyticsModelAlgorithm.getName() + " is a not a classification ML algorithm, but a regression ML algorithm. However, it is used with a categorical type for the prediction results.\n");
				}
			} else if (dataAnalyticsModelAlgorithm instanceof DecisionTreeClassifier) { // Decision Tree (DT) Classification
				if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
					System.err.println("ERROR: " + dataAnalyticsModelAlgorithm.getName() + " is a not a regression ML algorithm, but a classification ML algorithm. However, it is used with a numerical type for the prediction results.\n");
				} else {
					if (dalib.equals("auto") || dalib.equals("scikit-learn")) { // scikit-learn v0.24.1
					pythonScriptStringBuilder.append("from sklearn.tree import DecisionTreeClassifier\n");
					
					String criterion_str = "";
					String splitter_str = "";
					String max_depth_str = "";
					String min_samples_split_str = "";
					String min_samples_leaf_str = "";
					String min_weight_fraction_leaf_str = "";
					String max_features_str = "";
					String random_state_str = "";
					String max_leaf_nodes_str = "";
					String min_impurity_decrease_str = "";
					String min_impurity_split_str = "";
					String class_weight_str = "";
					String ccp_alpha_str = "";
					String params = "";
					boolean flag = false;
					
					if(((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getDecisionTreeClassifierCriterion().getValue() != DecisionTreeClassifierCriterion.NOT_SET_VALUE) {						
						criterion_str = ((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getDecisionTreeClassifierCriterion().getLiteral();
						params += ("criterion=" + criterion_str);
						flag = true;
					}
					if(((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getDecisionTreeSplitter().getValue() != DecisionTreeSplitter.NOT_SET_VALUE) {						
						splitter_str = ((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getDecisionTreeSplitter().getLiteral();
						if(flag)
							params += ",";
						params += ("splitter=" + splitter_str);
						flag = true;
					}
					if(((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMax_depth() != null) {						
						max_depth_str = String.valueOf(((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMax_depth().getIntValue());
						if(flag)
							params += ",";
						params += ("max_depth=" + max_depth_str);
						flag = true;
					}
					if(((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMin_samples_split() != null) {						
						min_samples_split_str = String.valueOf(((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMin_samples_split().getDoubleValue());
						if(flag)
							params += ",";
						params += ("min_samples_split=" + min_samples_split_str);
						flag = true;
					}
					if(((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMin_samples_leaf() != null) {						
						min_samples_leaf_str = String.valueOf(((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMin_samples_leaf().getDoubleValue());
						if(flag)
							params += ",";
						params += ("min_samples_leaf=" + min_samples_leaf_str);
						flag = true;
					}
					if(((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMin_weight_fraction_leaf() != null) {						
						min_weight_fraction_leaf_str = String.valueOf(((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMin_weight_fraction_leaf().getDoubleValue());
						if(flag)
							params += ",";
						params += ("min_weight_fraction_leaf=" + min_weight_fraction_leaf_str);
						flag = true;
					}
					if(((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMax_features_numeric() != null ||
							((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMax_features_enum().getValue() != Max_features_enum.NOT_SET_VALUE) {						
						
						if(((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMax_features_numeric() != null) {
							max_features_str = String.valueOf(((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMax_features_numeric().getDoubleValue());
							if(flag)
								params += ",";
							params += ("max_features=" + max_features_str);
							flag = true;
						} else {
							max_features_str = ((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMax_features_enum().getLiteral();
							if(flag)
								params += ",";
							params += ("max_features=" + max_features_str);
							flag = true;
						}
					}
					if(((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getRandom_state() != null) {						
						random_state_str = String.valueOf(((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getRandom_state().getIntValue());
						if(flag)
							params += ",";
						params += ("random_state=" + random_state_str);
						flag = true;
					}
					if(((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMax_leaf_nodes() != null) {						
						max_leaf_nodes_str = String.valueOf(((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMax_leaf_nodes().getIntValue());
						if(flag)
							params += ",";
						params += ("max_leaf_nodes=" + max_leaf_nodes_str);
						flag = true;
					}
					if(((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMin_impurity_decrease() != null) {						
						min_impurity_decrease_str = String.valueOf(((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMin_impurity_decrease().getDoubleValue());
						if(flag)
							params += ",";
						params += ("min_impurity_decrease=" + min_impurity_decrease_str);
						flag = true;
					}
					if(((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMin_impurity_split() != null) {						
						System.err.println("WARNING: In the decision tree classifier, parameter min_impurity_split is present. However, this has been deprecated. Use min_impurity_decrease instead.\n See the API documentation for more information: https://scikit-learn.org/stable/modules/generated/sklearn.tree.DecisionTreeClassifier.html\n");
						min_impurity_split_str = String.valueOf(((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMin_impurity_split().getDoubleValue());
						if(flag)
							params += ",";
						params += ("min_impurity_split=" + min_impurity_split_str);
						flag = true;
					}
					if(((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getClass_weight() != null) {						
						class_weight_str = ((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getClass_weight().toString();
						if(flag)
							params += ",";
						params += ("class_weight=" + class_weight_str);
						flag = true;
					}
					if(((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getCcp_alpha() != null) {
						if(((DecisionTreeRegressor) (action.getDataAnalytics().getModelAlgorithm())).getCcp_alpha().getDoubleValue() < 0) { // See the API documentation: https://scikit-learn.org/stable/modules/generated/sklearn.tree.DecisionTreeClassifier.html					
							System.err.println("ERROR: In the decision tree classifier, parameter ccp_alpha is not allowed to be negative.\n See the API documentation for more information: https://scikit-learn.org/stable/modules/generated/sklearn.tree.DecisionTreeClassifier.html\n");
						} else {
							ccp_alpha_str = String.valueOf(((DecisionTreeClassifier) (action.getDataAnalytics().getModelAlgorithm())).getCcp_alpha().getDoubleValue());
							if(flag)
								params += ",";
							params += ("ccp_alpha=" + ccp_alpha_str);
							flag = true;
						}
					}
					pythonScriptStringBuilder.append("dtc = DecisionTreeClassifier(" + params + ")\n");
					pythonScriptStringBuilder.append("dtc = dtc.fit(X_train,y_train)\n");
					pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/"
							+ "train_model_dtc.pickle', 'wb') as pickle_file:\n");
					pythonScriptStringBuilder.append("    pickle.dump(dtc, pickle_file)\n\n");
					} else if(dalib.equals("keras-tensorflow")) {
						System.err.println("ERROR: " + dalib + " is specified as the library for DA/ML. However, it does not support the chosen model/algorithm for DA/ML: " + dataAnalyticsModelAlgorithm.getName() + ".\n"
					+ "You may try @dalib=\"auto\" instead.\n");
					} else {
						System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
					+ "You may try @dalib=\"auto\" instead.\n");
					}
				}
			} else if (dataAnalyticsModelAlgorithm instanceof RandomForestRegressor) { // Random Forest (RF) Regression
				if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
					if (dalib.equals("auto") || dalib.equals("scikit-learn")) { // scikit-learn v0.24.1
					pythonScriptStringBuilder.append("from sklearn.ensemble import RandomForestRegressor\n");
					
					String n_estimators_str = "";
					String criterion_str = "";
					String max_depth_str = "";
					String min_samples_split_str = "";
					String min_samples_leaf_str = "";
					String min_weight_fraction_leaf_str = "";
					String max_features_str = "";
					String max_leaf_nodes_str = "";
					String min_impurity_decrease_str = "";
					String min_impurity_split_str = "";
					String bootstrap_str = "";					
					String oob_score_str = "";
					String n_jobs_str = "";					
					String random_state_str = "";
					String verbose_str = "";
					String warm_start_str = "";
					String ccp_alpha_str = "";
					String max_samples_str = "";
					String params = "";
					boolean flag = false;
					
					if(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getN_estimators() != null) {						
						n_estimators_str = String.valueOf(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getN_estimators().getIntValue());
						params += ("n_estimators=" + n_estimators_str);
						flag = true;
					}
					if(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getRandomForestRegressorCriterion().getValue() != RandomForestRegressorCriterion.NOT_SET_VALUE) {						
						criterion_str = ((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getRandomForestRegressorCriterion().getLiteral();
						if(flag)
							params += ",";
						params += ("criterion=" + criterion_str);
						flag = true;
					}
					if(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMax_depth() != null) {						
						max_depth_str = String.valueOf(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMax_depth().getIntValue());
						if(flag)
							params += ",";
						params += ("max_depth=" + max_depth_str);
						flag = true;
					}
					if(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMin_samples_split() != null) {						
						min_samples_split_str = String.valueOf(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMin_samples_split().getDoubleValue());
						if(flag)
							params += ",";
						params += ("min_samples_split=" + min_samples_split_str);
						flag = true;
					}
					if(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMin_samples_leaf() != null) {						
						min_samples_leaf_str = String.valueOf(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMin_samples_leaf().getDoubleValue());
						if(flag)
							params += ",";
						params += ("min_samples_leaf=" + min_samples_leaf_str);
						flag = true;
					}
					if(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMin_weight_fraction_leaf() != null) {						
						min_weight_fraction_leaf_str = String.valueOf(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMin_weight_fraction_leaf().getDoubleValue());
						if(flag)
							params += ",";
						params += ("min_weight_fraction_leaf=" + min_weight_fraction_leaf_str);
						flag = true;
					}
					if(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMax_features_numeric() != null ||
							((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMax_features_enum().getValue() != Max_features_enum.NOT_SET_VALUE) {						
						
						if(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMax_features_numeric() != null) {
							max_features_str = String.valueOf(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMax_features_numeric().getDoubleValue());
							if(flag)
								params += ",";
							params += ("max_features=" + max_features_str);
							flag = true;
						} else {
							max_features_str = ((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMax_features_enum().getLiteral();
							if(flag)
								params += ",";
							params += ("max_features=" + max_features_str);
							flag = true;
						}
					}
					if(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMax_leaf_nodes() != null) {						
						max_leaf_nodes_str = String.valueOf(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMax_leaf_nodes().getIntValue());
						if(flag)
							params += ",";
						params += ("max_leaf_nodes=" + max_leaf_nodes_str);
						flag = true;
					}
					if(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMin_impurity_decrease() != null) {						
						min_impurity_decrease_str = String.valueOf(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMin_impurity_decrease().getDoubleValue());
						if(flag)
							params += ",";
						params += ("min_impurity_decrease=" + min_impurity_decrease_str);
						flag = true;
					}
					if(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMin_impurity_split() != null) {						
						System.err.println("WARNING: In the random forest regressor, parameter min_impurity_split is present. However, this has been deprecated. Use min_impurity_decrease instead.\n See the API documentation for more information: https://scikit-learn.org/stable/modules/generated/sklearn.ensemble.RandomForestRegressor.html\n");
						min_impurity_split_str = String.valueOf(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMin_impurity_split().getDoubleValue());
						if(flag)
							params += ",";
						params += ("min_impurity_split=" + min_impurity_split_str);
						flag = true;
					}
					if(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getBootstrap() != null) {						
						bootstrap_str = first_to_upper(String.valueOf(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getBootstrap().isBoolValue()));
						if(flag)
							params += ",";
						params += ("bootstrap=" + bootstrap_str);
						flag = true;
					}
					if(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getOob_score() != null) {						
						oob_score_str = first_to_upper(String.valueOf(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getOob_score().isBoolValue()));
						if(flag)
							params += ",";
						params += ("oob_score=" + oob_score_str);
						flag = true;
					}
					if(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getN_jobs() != null) {						
						n_jobs_str = String.valueOf(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getN_jobs().getIntValue());
						if(flag)
							params += ",";
						params += ("n_jobs=" + n_jobs_str);
						flag = true;
					}
					if(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getRandom_state() != null) {						
						random_state_str = String.valueOf(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getRandom_state().getIntValue());
						if(flag)
							params += ",";
						params += ("random_state=" + random_state_str);
						flag = true;
					}
					if(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getVerbose() != null) {						
						verbose_str = String.valueOf(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getVerbose().getIntValue());
						if(flag)
							params += ",";
						params += ("verbose=" + verbose_str);
						flag = true;
					}
					if(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getWarm_start() != null) {						
						warm_start_str = first_to_upper(String.valueOf(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getWarm_start().isBoolValue()));
						if(flag)
							params += ",";
						params += ("warm_start=" + warm_start_str);
						flag = true;
					}
					if(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getCcp_alpha() != null) {
						if(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getCcp_alpha().getDoubleValue() < 0) { // See the API documentation: https://scikit-learn.org/stable/modules/generated/sklearn.ensemble.RandomForestRegressor.html						
							System.err.println("ERROR: In the random forest regressor, parameter ccp_alpha is not allowed to be negative.\n See the API documentation for more information: https://scikit-learn.org/stable/modules/generated/sklearn.ensemble.RandomForestRegressor.html\n");
						} else {
							ccp_alpha_str = String.valueOf(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getCcp_alpha().getDoubleValue());
							if(flag)
								params += ",";
							params += ("ccp_alpha=" + ccp_alpha_str);
							flag = true;
						}
					}
					if(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMax_samples() != null) {						
						max_samples_str = String.valueOf(((RandomForestRegressor) (action.getDataAnalytics().getModelAlgorithm())).getMax_samples().getDoubleValue());
						if(flag)
							params += ",";
						params += ("max_samples=" + max_samples_str);
						flag = true;
					}
					pythonScriptStringBuilder.append("rfr = RandomForestRegressor(" + params + ")\n");
					pythonScriptStringBuilder.append("rfr = rfr.fit(X_train,y_train)\n");
					pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/"
							+ "train_model_rfr.pickle', 'wb') as pickle_file:\n");
					pythonScriptStringBuilder.append("    pickle.dump(rfr, pickle_file)\n\n");
					} else if(dalib.equals("keras-tensorflow")) {
						System.err.println("ERROR: " + dalib + " is specified as the library for DA/ML. However, it does not support the chosen model/algorithm for DA/ML: " + dataAnalyticsModelAlgorithm.getName() + ".\n"
					+ "You may try @dalib=\"auto\" instead.\n");
					} else {
						System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
					+ "You may try @dalib=\"auto\" instead.\n");
					}
				} else {
					System.err.println("ERROR: " + dataAnalyticsModelAlgorithm.getName() + " is a not a classification ML algorithm, but a regression ML algorithm. However, it is used with a categorical type for the prediction results.\n");
				}
			} else if (dataAnalyticsModelAlgorithm instanceof RandomForestClassifier) { // Random Forest (RF) Classification
				if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
					System.err.println("ERROR: " + dataAnalyticsModelAlgorithm.getName() + " is a not a regression ML algorithm, but a classification ML algorithm. However, it is used with a numerical type for the prediction results.\n");
				} else {
					if (dalib.equals("auto") || dalib.equals("scikit-learn")) { // scikit-learn v0.24.1
					pythonScriptStringBuilder.append("from sklearn.ensemble import RandomForestClassifier\n");
					
					String n_estimators_str = "";
					String criterion_str = "";
					String max_depth_str = "";
					String min_samples_split_str = "";
					String min_samples_leaf_str = "";
					String min_weight_fraction_leaf_str = "";
					String max_features_str = "";
					String max_leaf_nodes_str = "";
					String min_impurity_decrease_str = "";
					String min_impurity_split_str = "";
					String bootstrap_str = "";					
					String oob_score_str = "";
					String n_jobs_str = "";					
					String random_state_str = "";
					String verbose_str = "";
					String warm_start_str = "";
					String class_weight_str = "";
					String ccp_alpha_str = "";
					String max_samples_str = "";
					String params = "";
					boolean flag = false;
					
					if(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getN_estimators() != null) {						
						n_estimators_str = String.valueOf(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getN_estimators().getIntValue());
						params += ("n_estimators=" + n_estimators_str);
						flag = true;
					}
					if(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getRandomForestClassifierCriterion().getValue() != RandomForestClassifierCriterion.NOT_SET_VALUE) {						
						criterion_str = ((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getRandomForestClassifierCriterion().getLiteral();
						if(flag)
							params += ",";
						params += ("criterion=" + criterion_str);
						flag = true;
					}
					if(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMax_depth() != null) {						
						max_depth_str = String.valueOf(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMax_depth().getIntValue());
						if(flag)
							params += ",";
						params += ("max_depth=" + max_depth_str);
						flag = true;
					}
					if(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMin_samples_split() != null) {						
						min_samples_split_str = String.valueOf(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMin_samples_split().getDoubleValue());
						if(flag)
							params += ",";
						params += ("min_samples_split=" + min_samples_split_str);
						flag = true;
					}
					if(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMin_samples_leaf() != null) {						
						min_samples_leaf_str = String.valueOf(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMin_samples_leaf().getDoubleValue());
						if(flag)
							params += ",";
						params += ("min_samples_leaf=" + min_samples_leaf_str);
						flag = true;
					}
					if(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMin_weight_fraction_leaf() != null) {						
						min_weight_fraction_leaf_str = String.valueOf(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMin_weight_fraction_leaf().getDoubleValue());
						if(flag)
							params += ",";
						params += ("min_weight_fraction_leaf=" + min_weight_fraction_leaf_str);
						flag = true;
					}
					if(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMax_features_numeric() != null ||
							((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMax_features_enum().getValue() != Max_features_enum.NOT_SET_VALUE) {						
						
						if(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMax_features_numeric() != null) {
							max_features_str = String.valueOf(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMax_features_numeric().getDoubleValue());
							if(flag)
								params += ",";
							params += ("max_features=" + max_features_str);
							flag = true;
						} else {
							max_features_str = ((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMax_features_enum().getLiteral();
							if(flag)
								params += ",";
							params += ("max_features=" + max_features_str);
							flag = true;
						}
					}
					if(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMax_leaf_nodes() != null) {						
						max_leaf_nodes_str = String.valueOf(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMax_leaf_nodes().getIntValue());
						if(flag)
							params += ",";
						params += ("max_leaf_nodes=" + max_leaf_nodes_str);
						flag = true;
					}
					if(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMin_impurity_decrease() != null) {						
						min_impurity_decrease_str = String.valueOf(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMin_impurity_decrease().getDoubleValue());
						if(flag)
							params += ",";
						params += ("min_impurity_decrease=" + min_impurity_decrease_str);
						flag = true;
					}
					if(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMin_impurity_split() != null) {						
						System.err.println("WARNING: In the random forest classifier, parameter min_impurity_split is present. However, this has been deprecated. Use min_impurity_decrease instead.\n See the API documentation for more information: https://scikit-learn.org/stable/modules/generated/sklearn.ensemble.RandomForestClassifier.html\n");
						min_impurity_split_str = String.valueOf(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMin_impurity_split().getDoubleValue());
						if(flag)
							params += ",";
						params += ("min_impurity_split=" + min_impurity_split_str);
						flag = true;
					}
					if(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getBootstrap() != null) {						
						bootstrap_str = first_to_upper(String.valueOf(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getBootstrap().isBoolValue()));
						if(flag)
							params += ",";
						params += ("bootstrap=" + bootstrap_str);
						flag = true;
					}
					if(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getOob_score() != null) {						
						oob_score_str = first_to_upper(String.valueOf(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getOob_score().isBoolValue()));
						if(flag)
							params += ",";
						params += ("oob_score=" + oob_score_str);
						flag = true;
					}
					if(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getN_jobs() != null) {						
						n_jobs_str = String.valueOf(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getN_jobs().getIntValue());
						if(flag)
							params += ",";
						params += ("n_jobs=" + n_jobs_str);
						flag = true;
					}
					if(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getRandom_state() != null) {						
						random_state_str = String.valueOf(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getRandom_state().getIntValue());
						if(flag)
							params += ",";
						params += ("random_state=" + random_state_str);
						flag = true;
					}
					if(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getVerbose() != null) {						
						verbose_str = String.valueOf(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getVerbose().getIntValue());
						if(flag)
							params += ",";
						params += ("verbose=" + verbose_str);
						flag = true;
					}
					if(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getWarm_start() != null) {						
						warm_start_str = first_to_upper(String.valueOf(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getWarm_start().isBoolValue()));
						if(flag)
							params += ",";
						params += ("warm_start=" + warm_start_str);
						flag = true;
					}
					if(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getClass_weight() != null) {						
						class_weight_str = ((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getClass_weight().toString();
						if(flag)
							params += ",";
						params += ("class_weight=" + class_weight_str);
						flag = true;
					}
					if(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getCcp_alpha() != null) {
					if(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getCcp_alpha().getDoubleValue() < 0) { // See the API documentation: https://scikit-learn.org/stable/modules/generated/sklearn.ensemble.RandomForestClassifier.html
						System.err.println("ERROR: In the random forest classifier, parameter ccp_alpha is not allowed to be negative.\n See the API documentation for more information: https://scikit-learn.org/stable/modules/generated/sklearn.ensemble.RandomForestClassifier.html\n");
					} else {													
						ccp_alpha_str = String.valueOf(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getCcp_alpha().getDoubleValue());
						if(flag)
							params += ",";
						params += ("ccp_alpha=" + ccp_alpha_str);
						flag = true;
					}
					}
					if(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMax_samples() != null) {						
						max_samples_str = String.valueOf(((RandomForestClassifier) (action.getDataAnalytics().getModelAlgorithm())).getMax_samples().getDoubleValue());
						if(flag)
							params += ",";
						params += ("max_samples=" + max_samples_str);
						flag = true;
					}
					pythonScriptStringBuilder.append("rfc = RandomForestClassifier(" + params + ")\n");
					pythonScriptStringBuilder.append("rfc = rfc.fit(X_train,y_train)\n");
					pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/"
							+ "train_model_rfc.pickle', 'wb') as pickle_file:\n");
					pythonScriptStringBuilder.append("    pickle.dump(rfc, pickle_file)\n\n");
					} else if(dalib.equals("keras-tensorflow")) {
						System.err.println("ERROR: " + dalib + " is specified as the library for DA/ML. However, it does not support the chosen model/algorithm for DA/ML: " + dataAnalyticsModelAlgorithm.getName() + ".\n"
								+ "You may try @dalib=\"auto\" instead.\n");
					} else {
						System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
								+ "You may try @dalib=\"auto\" instead.\n");
					}
				}
			} else if (dataAnalyticsModelAlgorithm instanceof NN_MultilayerPerceptron) { // NN Multi-Layer Perceptron (MLP)
				
				if(action.getDataAnalytics().getPreprocess_feature_scaling().getValue() == Preprocess_feature_scaling.OFF_VALUE) {
					System.err.println("WARNING: For the Neural Network (Multi-Layer Perceptron) model, normalization/standardization of the numerical features is highly recommneded.\n If you have any numerical features, try using the preprocess_feature_scaling parameter in the data analytics section of your model, e.g., preprocess_feature_scaling STANDARDIZATION_Z_SCORE_NORMALIZATION or you may set automl to ON: automl ON. AuoML will take care of that automatically.\n");
				}				
				
				if (dalib.equals("scikit-learn")) { // scikit-learn v0.24.1
					if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
						// NN Multi-Layer Perceptron (MLP) Regression					
						pythonScriptStringBuilder.append("from sklearn.neural_network import MLPRegressor\n");
					} else {
						// NN Multi-Layer Perceptron (MLP) Classification
						pythonScriptStringBuilder.append("from sklearn.neural_network import MLPClassifier\n");
					}	
					
					String hidden_layer_sizes_str = "";
					String activation_str = "";
					String optimizer_str = ""; // i.e., "solver" in scikit-learn
					String alpha_str = "";
					String batch_size_str = "";
					String learning_rate_mode_str = ""; // i.e., "learnig rate" in scikit-learn
					String learning_rate_init_str = "";
					String power_t_str = "";
					String max_iter_str = "";
					String shuffle_str = "";
					String random_state_str = "";
					String tol_str = "";
					String verbose_str = "";
					String warm_start_str = "";
					String momentum_str = "";
					String nesterovs_momentum_str = "";
					String early_stopping_str = "";
					String validation_fraction_str = "";
					String beta_1_str= "";
					String beta_2_str= "";
					String epsilon_str = "";
					String n_iter_no_change_str = "";
					String max_fun_str = "";
					String params = "";
					String params_without_optimizer = "";
					boolean flag = false;
					boolean set_optimizer_automatically = false;
					
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getHidden_layer_sizes() != null) {						
						hidden_layer_sizes_str = ((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getHidden_layer_sizes().toString();
						params += ("hidden_layer_sizes=" + hidden_layer_sizes_str);
						params_without_optimizer += ("hidden_layer_sizes=" + hidden_layer_sizes_str);
						flag = true;
					}
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getActivation().getValue() != Activation.NOT_SET_VALUE) {
						if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getActivation().getValue() != Activation.IDENTITY_VALUE ||
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getActivation().getValue() != Activation.LOGISTIC_VALUE ||
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getActivation().getValue() != Activation.TANH_VALUE ||
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getActivation().getValue() != Activation.RELU_VALUE) {
							System.err.println("ERROR: Since the chosen DA/ML library is scikit-learn, in the neural network multi-layer perceptron model, parameter activation may only be one of the following: identity, logisitc, tanh or relu.\n See the API documentation for more information: https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html or https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPClassifier.html\n");
						} else {
							activation_str = "\'" + ((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getActivation().getLiteral() + "\'";
							if(flag) {
								params += ",";
								params_without_optimizer += ",";
							}
							params += ("activation=" + activation_str);
							params_without_optimizer += ("activation=" + activation_str);
							flag = true;
						}
					}
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.NOT_SET_VALUE) {						
						if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.SGD_VALUE ||
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.ADAM_VALUE ||
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.LBFGS_VALUE) {
							System.err.println("ERROR: Since the chosen DA/ML library is scikit-learn, in the neural network multi-layer perceptron model, parameter optimizer/solver may only be one of the following: lbfgs, sgd or adam.\n See the API documentation for more information: https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html or https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPClassifier.html\n");
						} else {
							optimizer_str = "\'" + ((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getLiteral() + "\'";
							if(flag)
								params += ",";
							params += ("solver=" + optimizer_str); // In scikit-learn, optimizer is called "solver".
							flag = true;
					}
					} else {
						if(action.getDataAnalytics().getAutoML().getValue() == AutoML.ON_VALUE) {
							System.out.println("INFO: In the neural network multilayer perceptron model, no optimizer/solver is specified. Since AutoML is on, depending on the size of the dataset, either lbfgs or adam will be automatically chosen.\n If no_of_samples < 1000 (\"small\" dataset), lbfgs will be chosen as that shall converge faster and perform better. However, for larger datasets, adam will be set, since that works pretty well in terms of both training time and validation score.\n See the API documentation for more information: https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPClassifier.html or https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html.\n");
							set_optimizer_automatically = true;
						}
					}
					
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getAlpha() != null) {						
						alpha_str = String.valueOf(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getAlpha().getDoubleValue());
						if(flag) {
							params += ",";
							params_without_optimizer += ",";	
						}
						params += ("alpha=" + alpha_str);
						params_without_optimizer += ("alpha=" + alpha_str);
						flag = true;
					}
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getBatch_size() != null) {
						if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() == Optimizer.LBFGS_VALUE) {
							System.err.println("WARNING: In the neural network multilayer perceptron model, parameter batch_size is specified. However, since the optimizer/solver is set to lbfgs, the batch size parameter will be ignored. You may use another optimizer/solver.\n Please see the API doc for more information: https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPClassifier.html or https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html.\n");
						} else {						
							batch_size_str = String.valueOf(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getBatch_size().getIntValue());
							if(flag) {
								params += ",";
								params_without_optimizer += ",";	
							}
							params += ("batch_size=" + batch_size_str);
							params_without_optimizer += ("batch_size=" + batch_size_str);
							flag = true;
						}
					}
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getLearning_rate_mode().getValue() != Learning_rate_mode.NOT_SET_VALUE) {
						if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getLearning_rate_mode().getValue() != Learning_rate_mode.CONSTANT_VALUE &&
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getLearning_rate_mode().getValue() != Learning_rate_mode.INVSCALING_VALUE &&
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getLearning_rate_mode().getValue() != Learning_rate_mode.ADAPTIVE_VALUE) {
							System.err.println("WARNING: In the neural network multilayer perceptron model, parameter learning_rate_mode is present, which may specify the learning rate schedule for weight updates. However, the chosen library for DA/ML (i.e., scikit-learn) only allowes constant, invscaling or adaptive.\n The chosen one is not supported. Thus, it will be ignored.\n Please see the API doc for more information: https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPClassifier.html or https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html.\n");
						} else if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.SGD_VALUE) {
							System.err.println("WARNING: In the neural network multilayer perceptron model, parameter learning_rate_mode is present, which may specify the learning rate schedule for weight updates. However, this is only supported for the SGD optimizer/solver in the chosen library for DA/ML (i.e., scikit-learn). Thus, it will be ignored.\n Please see the API doc for more information: https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPClassifier.html or https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html.\n");
						} else {						
							learning_rate_mode_str = ((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getLearning_rate_mode().getLiteral();
							if(flag) {
								params += ",";
								params_without_optimizer += ",";
							}
							params += ("learning_rate=" + learning_rate_mode_str); // In scikit-learn, learning_rate_mode is called "learning_rate".
							params_without_optimizer += ("learning_rate=" + learning_rate_mode_str); // In scikit-learn, learning_rate_mode is called "learning_rate".
							flag = true;
						}
					}
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getLearning_rate_init() != null) {						
						if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.SGD_VALUE &&
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.ADAM_VALUE) {
							System.err.println("WARNING: In the neural network multilayer perceptron model, parameter learning_rate_init is present, which may specify the initial learning rate. However, this is only supported for the SGD or adam optimizer/solver in the chosen library for DA/ML (i.e., scikit-learn). Thus, it will be ignored.\n Please see the API doc for more information: https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPClassifier.html or https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html.\n");
						} else {
							learning_rate_init_str = ((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getLearning_rate_init().toString();
							if(flag) {
								params += ",";
								params_without_optimizer += ",";	
							}
							params += ("learning_rate_init=" + learning_rate_init_str);
							params_without_optimizer += ("learning_rate_init=" + learning_rate_init_str);
							flag = true;
						}
					}
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getPower_t() != null) {						
						if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.SGD_VALUE) {
							System.err.println("WARNING: In the neural network multilayer perceptron model, parameter power_t is present. However, this is only supported for the SGD optimizer/solver in the chosen library for DA/ML (i.e., scikit-learn). Thus, it will be ignored.\n Please see the API doc for more information: https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPClassifier.html or https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html.\n");
						} else if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getLearning_rate_mode().getValue() != Learning_rate_mode.INVSCALING_VALUE) {
							System.err.println("WARNING: In the neural network multilayer perceptron model, parameter power_t is present. However, this is only supported if the learning_rate_mode is set to the invscaling schedule. Thus, it will be ignored.\n Please see the API doc for more information: https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPClassifier.html or https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html.\n");
						} else {
							power_t_str = String.valueOf(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getPower_t().getDoubleValue());
							if(flag) {
								params += ",";
								params_without_optimizer += ",";	
							}
							params += ("power_t=" + power_t_str);
							params_without_optimizer += ("power_t=" + power_t_str);
							flag = true;
						}
					}
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getMax_iter() != null) {						
						max_iter_str = String.valueOf(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getMax_iter().getIntValue());
						if(flag) {
							params += ",";
							params_without_optimizer += ",";	
						}
						params += ("max_iter=" + max_iter_str);
						params_without_optimizer += ("max_iter=" + max_iter_str);
						flag = true;
					}
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getShuffle() != null) {
						if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getShuffle().isBoolValue() &&
								action.getDataAnalytics().getSequential().getValue() == Sequential.TRUE_VALUE) {
							System.err.println("WARNING: In the neural network multilayer perceptron model, parameter shuffle is set to true. However, in the data analytics section of the model, it is mentioned that the data are sequential (i.e., sequential is set to true).\n It is not allowed to shuffle time series or any kind of sequential data, since the order of samples does matter! Thus, the shuffle parameter will be ignored.\n");
						} else if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.SGD_VALUE &&
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.ADAM_VALUE) {
							System.err.println("WARNING: In the neural network multilayer perceptron model, parameter shuffle is present. However, in the chosen DA/ML library, i.e., scikit-learn, this is only supported for the SGD or adam solver/optimizer. Thus, it will be ignored.\n See the API doc for more information: https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPClassifier.html or https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html.\n");
						} else {						
							shuffle_str = first_to_upper(String.valueOf(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getShuffle().isBoolValue()));
							if(flag) {
								params += ",";
								params_without_optimizer += ",";	
							}
							params += ("shuffle=" + shuffle_str);
							params_without_optimizer += ("shuffle=" + shuffle_str);
							flag = true;
						}
					}
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getRandom_state() != null) {						
						random_state_str = String.valueOf(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getRandom_state().getIntValue());
						if(flag) {
							params += ",";
							params_without_optimizer += ",";	
						}
						params += ("random_state=" + random_state_str);
						params_without_optimizer += ("random_state=" + random_state_str);
						flag = true;
					} else {
						System.err.println("WARNING: In the neural network multilayer perceptron model, no parameter random_state is provided. Pass an integer for reproducible results across multiple function calls!\n See the API doc for more information: https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html or https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPClassifier.html.\n");
					}
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getTol() != null) {						
						tol_str = String.valueOf(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getTol().getDoubleValue());
						if(flag) {
							params += ",";
							params_without_optimizer += ",";	
						}
						params += ("tol=" + tol_str);
						params_without_optimizer += ("tol=" + tol_str);
						flag = true;
					}
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getVerbose() != null) {						
						verbose_str = first_to_upper(String.valueOf(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getVerbose().isBoolValue()));
						if(flag) {
							params += ",";
							params_without_optimizer += ",";	
						}
						params += ("verbose=" + verbose_str);
						params_without_optimizer += ("verbose=" + verbose_str);
						flag = true;
					}
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getWarm_start() != null) {						
						warm_start_str = first_to_upper(String.valueOf(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getWarm_start().isBoolValue()));
						if(flag) {
							params += ",";
							params_without_optimizer += ",";
						}
						params += ("warm_start=" + warm_start_str);
						params_without_optimizer += ("warm_start=" + warm_start_str);
						flag = true;
					}
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getMomentum() != null) {						
						if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.SGD_VALUE) {
							System.err.println("WARNING: In the neural network multilayer perceptron model, parameter momentum is present. However, that is only supported for the SGD optimizer/solver in the chosen library for DA/ML, i.e., scikit-learn. Thus, it will be ignored.\n See the API doc for more information: https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html or https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPClassifier.html.\n");
						} else if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getMomentum().getDoubleValue() < 0 ||
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getMomentum().getDoubleValue() > 1) {
							System.err.println("WARNING: In the neural network multilayer perceptron model, parameter momentum is present. However, its value may only be between 0 and 1. This is currently not the case. Thus, it will be ignored.\n See the API doc for more information: https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html or https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPClassifier.html.\n");
						} else {						
							momentum_str = String.valueOf(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getMomentum().getDoubleValue());
							if(flag) {
								params += ",";
								params_without_optimizer += ",";	
							}
							params += ("momentum=" + momentum_str);
							params_without_optimizer += ("momentum=" + momentum_str);
							flag = true;
						}
					}
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getNesterovs_momentum() != null) {						
						if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.SGD_VALUE) {
							System.err.println("WARNING: In the neural network multilayer perceptron model, parameter nesterovs_momentum is present. However, that is only supported for the SGD optimizer/solver in the chosen library for DA/ML, i.e., scikit-learn. Thus, it will be ignored.\n See the API doc for more information: https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html or https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPClassifier.html.\n");	
						} else if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getMomentum() == null ||
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getMomentum().getDoubleValue() <= 0) {
							System.err.println("WARNING: In the neural network multilayer perceptron model, parameter nesterovs_momentum is present. However, that is only supported if the momentum parameter is given and has a value above 0. Thus, it will be ignored.\n See the API doc for more information: https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html or https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPClassifier.html.\n");
						} else {					
							nesterovs_momentum_str = first_to_upper(String.valueOf(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getNesterovs_momentum().isBoolValue()));
							if(flag) {
								params += ",";
								params_without_optimizer += ",";
							}
							params += ("nesterovs_momentum=" + nesterovs_momentum_str);
							params_without_optimizer += ("nesterovs_momentum=" + nesterovs_momentum_str);
							flag = true;
						}
					}
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getEarly_stopping() != null) {						
						if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.SGD_VALUE &&
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.ADAM_VALUE) {
							System.err.println("WARNING: In the neural network multilayer perceptron model, parameter early_stopping is only supported for the SGD or adam optimizer/solver in the chosen library for DA/ML (i.e., scikit-learn). Thus, it will be ignored.\n Please see the API doc for more information: https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPClassifier.html or https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html.\n");
						} else {						
							early_stopping_str = first_to_upper(String.valueOf(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getEarly_stopping().isBoolValue()));
							if(flag) {
								params += ",";
								params_without_optimizer += ",";	
							}
							params += ("early_stopping=" + early_stopping_str);
							params_without_optimizer += ("early_stopping=" + early_stopping_str);
							flag = true;
						}
					}
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getValidation_fraction() != null) {
						if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getEarly_stopping() == null) {
							System.err.println("WARNING: In the neural network multilayer perceptron model, parameter validation_fraction is present. However, this is only supported if early_stopping is present and is set to true. Thus, it will be ignored.\n Please see the API doc for more information: https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPClassifier.html or https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html.\n");
						} else if(!((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getEarly_stopping().isBoolValue()) {
							System.err.println("WARNING: In the neural network multilayer perceptron model, parameter validation_fraction is present. However, this is only supported if early_stopping is set to true. This is currently not the case. Thus, it will be ignored.\n Please see the API doc for more information: https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPClassifier.html or https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html.\n");
						} else if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getValidation_fraction().getDoubleValue() < 0 ||
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getValidation_fraction().getDoubleValue() > 1 ) {
							System.err.println("WARNING: In the neural network multilayer perceptron model, parameter validation_fraction is present. However, its provided value is not between 0 and 1! Thus, it will be ignored.\n Please see the API doc for more information: https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPClassifier.html or https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html.\n");	
						} else {
							validation_fraction_str = String.valueOf(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getValidation_fraction().getDoubleValue());
							if(flag) {
								params += ",";
								params_without_optimizer += ",";	
							}
							params += ("validation_fraction=" + validation_fraction_str);
							params_without_optimizer += ("validation_fraction=" + validation_fraction_str);
							flag = true;
						}
					}
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getBeta_1() != null) {
						if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.ADAM_VALUE) {
							System.err.println("WARNING: In the neural network multilayer perceptron model, parameter beta_1 is only supported for the adam optimizer/solver in the chosen library for DA/ML (i.e., scikit-learn). Thus, it will be ignored.\n Please see the API doc for more information: https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPClassifier.html or https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html.\n");
						} else if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getBeta_1().getDoubleValue() < 0 ||
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getBeta_1().getDoubleValue() >=1 ) {
							System.err.println("WARNING: In the neural network multilayer perceptron model, parameter beta_1 is present. However, its provided value is not in [0, 1)! Thus, it will be ignored.\n Please see the API doc for more information: https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPClassifier.html or https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html.\n");	
						} else {
							beta_1_str = String.valueOf(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getBeta_1().getDoubleValue());
							if(flag) {
								params += ",";
								params_without_optimizer += ",";
							}
							params += ("beta_1=" + beta_1_str);
							params_without_optimizer += ("beta_1=" + beta_1_str);
							flag = true;
						}
					}
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getBeta_2() != null) {
						if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.ADAM_VALUE) {
							System.err.println("WARNING: In the neural network multilayer perceptron model, parameter beta_2 is only supported for the adam optimizer/solver in the chosen library for DA/ML (i.e., scikit-learn). Thus, it will be ignored.\n Please see the API doc for more information: https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPClassifier.html or https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html.\n");
						} else if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getBeta_2().getDoubleValue() < 0 ||
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getBeta_2().getDoubleValue() >=1 ) {
							System.err.println("WARNING: In the neural network multilayer perceptron model, parameter beta_2 is present. However, its provided value is not in [0, 1)! Thus, it will be ignored.\n Please see the API doc for more information: https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPClassifier.html or https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html.\n");	
						} else {
							beta_2_str = String.valueOf(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getBeta_2().getDoubleValue());
							if(flag) {
								params += ",";
								params_without_optimizer += ",";	
							}
							params += ("beta_2=" + beta_2_str);
							params_without_optimizer += ("beta_2=" + beta_2_str);
							flag = true;
						}
					}
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getEpsilon() != null) {
						if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.ADAM_VALUE) {
							System.err.println("WARNING: In the neural network multilayer perceptron model, parameter epsilon is only supported for the adam optimizer/solver in the chosen library for DA/ML (i.e., scikit-learn). Thus, it will be ignored.\n Please see the API doc for more information: https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPClassifier.html or https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html.\n");
						} else {
							epsilon_str = String.valueOf(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getEpsilon().getDoubleValue());
							if(flag) {
								params += ",";
								params_without_optimizer += ",";	
							}
							params += ("epsilon=" + epsilon_str);
							params_without_optimizer += ("epsilon=" + epsilon_str);
							flag = true;
						}
					}
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getN_iter_no_change() != null) {
						if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.ADAM_VALUE &&
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.SGD_VALUE) {
							System.err.println("WARNING: In the neural network multilayer perceptron model, parameter n_iter_no_change is only supported for the SGD or the adam optimizer/solver in the chosen library for DA/ML (i.e., scikit-learn). Thus, it will be ignored.\n Please see the API doc for more information: https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPClassifier.html or https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html.\n");
						} else {
							n_iter_no_change_str = String.valueOf(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getN_iter_no_change().getIntValue());
							if(flag) {
								params += ",";
								params_without_optimizer += ",";	
							}						
							params += ("n_iter_no_change=" + n_iter_no_change_str);
							params_without_optimizer += ("n_iter_no_change=" + n_iter_no_change_str);
							flag = true;
						}
					}
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getMax_fun() != null) {
						if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.LBFGS_VALUE) {
							System.err.println("WARNING: In the neural network multilayer perceptron model, parameter max_fun is only supported for the lbfgs optimizer/solver in the chosen library for DA/ML (i.e., scikit-learn). Thus, it will be ignored.\n Please see the API doc for more information: https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPClassifier.html or https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html.\n");
						} else {
							max_fun_str = String.valueOf(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getMax_fun().getIntValue());
							if(flag) {
								params += ",";
								params_without_optimizer += ",";	
							}
							params += ("max_fun=" + max_fun_str);
							params_without_optimizer += ("max_fun=" + max_fun_str);
							flag = true;
						}
					}
					
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getLoss().getValue() != Loss.NOT_SET_VALUE) {
						System.err.println("ERROR: In the Neural Network (Multilayer Perceptron) model, parameter loss is present. However, the chosen library for DA/ML, i.e., scikit-learn does not accept this parameter, since its implemnetation of multilayer perceptron optimizes the log-loss function using LBFGS or stochastic gradient descent.\n Either remove it or try using another library, e.g., @dalib \"keras-tensorflow\".\n");
					}
					
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getEpochs() != null) {
						System.err.println("ERROR: In the Neural Network (Multilayer Perceptron) model, parameter epochs is present. However, the chosen library for DA/ML, i.e., scikit-learn does not accept this parameter.\n Please use the max_iter parameter instead. See the API doc for more information: https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPRegressor.html or https://scikit-learn.org/stable/modules/generated/sklearn.neural_network.MLPClassifier.html.\n");
					}
					
					if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
						// NN Multi-Layer Perceptron (MLP) Regression
						if(set_optimizer_automatically) {
							pythonScriptStringBuilder.append("if(X_train.shape[0]<1000):\n"); // "small" dataset
							pythonScriptStringBuilder.append("	nn_mlp_r = MLPRegressor(" + params_without_optimizer + ",solver=\'" + Optimizer.LBFGS_VALUE + "\')\n");
							pythonScriptStringBuilder.append("else:\n");
							pythonScriptStringBuilder.append("	nn_mlp_r = MLPRegressor(" + params_without_optimizer + ",solver=\'" + Optimizer.ADAM + "\')\n");
							
						} else {
							pythonScriptStringBuilder.append("nn_mlp_r = MLPRegressor(" + params + ")\n");
						}
						pythonScriptStringBuilder.append("nn_mlp_r = nn_mlp_r.fit(X_train,y_train)\n");
						pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/"
								+ "train_model_nn_mlp_r.pickle', 'wb') as pickle_file:\n");
						pythonScriptStringBuilder.append("    pickle.dump(nn_mlp_r, pickle_file)\n\n");
					} else {
						// NN Multi-Layer Perceptron (MLP) Classification
						if(set_optimizer_automatically) {
							pythonScriptStringBuilder.append("if(X_train.shape[0]<1000):\n"); // "small" dataset
							pythonScriptStringBuilder.append("	nn_mlp_c = MLPClassifier(" + params_without_optimizer + ",solver=\'" + Optimizer.LBFGS_VALUE + "\')\n");
							pythonScriptStringBuilder.append("else:\n");
							pythonScriptStringBuilder.append("	nn_mlp_c = MLPClassifier(" + params_without_optimizer + ",solver=\'" + Optimizer.ADAM + "\')\n");
						} else {
							pythonScriptStringBuilder.append("nn_mlp_c = MLPClassifier(" + params + ")\n");
						}
						
						pythonScriptStringBuilder.append("nn_mlp_c = nn_mlp_c.fit(X_train,y_train)\n");
						pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/"
								+ "train_model_nn_mlp_c.pickle', 'wb') as pickle_file:\n");
						pythonScriptStringBuilder.append("    pickle.dump(nn_mlp_c, pickle_file)\n\n");
					}
				} else if(dalib.equals("auto") || dalib.equals("keras-tensorflow")) {
					
					int no_hidden_layers = 0;
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getHidden_layer_sizes() == null) {
						//TODO
						System.err.println("WARNING: In the neural network multilayer perceptron model, parameter hidden_layer_sizes, which may specify the number of hidden layers and the size of each hidden layer through a tuple, where the ith element represents the number of neurons in the ith hidden layer, is not present.\n Thus, only one hidden layer with a random size will be considered.\n");
						no_hidden_layers = 1;
						pythonScriptStringBuilder.append("hidden_layers_size_not_given = True\n");
					} else {						
						pythonScriptStringBuilder.append("hidden_layers_size_not_given = False\n");
						no_hidden_layers = ((NN_MultilayerPerceptron) action.getDataAnalytics().getModelAlgorithm()).getHidden_layers().size();
					}
					
					String activation_function = "";
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getActivation().getValue() != Activation.NOT_SET_VALUE) {
						if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getActivation().getValue() != Activation.RELU_VALUE ||
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getActivation().getValue() != Activation.SIGMOID_VALUE ||
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getActivation().getValue() != Activation.SOFTMAX_VALUE ||
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getActivation().getValue() != Activation.SOFTPLUS_VALUE ||
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getActivation().getValue() != Activation.SOFTSIGN_VALUE ||
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getActivation().getValue() != Activation.TANH_VALUE ||
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getActivation().getValue() != Activation.SELU_VALUE ||
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getActivation().getValue() != Activation.ELU_VALUE ||
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getActivation().getValue() != Activation.EXPONENTIAL_VALUE) {
						
							System.err.println("WARNING: In the neural network multilayer perceptron model, parameter activation does not specify a valid activation function for the selected DA/ML library (keras-tensorflow).\n Thus, the default relu activation function will be used. See the API documentation for more information: https://keras.io/api/layers/activations/. \n");
							activation_function = Activation.RELU.getLiteral();
						} else {
							activation_function = ((NN_MultilayerPerceptron) (action.getDataAnalytics()
									.getModelAlgorithm())).getActivation().getLiteral();
						}
					} else {
						System.err.println("WARNING: In the neural network multilayer perceptron model, parameter activation is not present. Thus, the default relu activation function will be used.\n");
						activation_function = Activation.RELU.getLiteral();
					}
					
					String optimizer = "";
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.NOT_SET_VALUE) {
						if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.SGD_VALUE ||
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.RMSPROP_VALUE ||
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.ADAM_VALUE ||
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.ADADELTA_VALUE ||
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.ADAGRAD_VALUE ||
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.ADAMAX_VALUE ||
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.NADAM_VALUE ||
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() != Optimizer.FTRL_VALUE) {
						
							System.err.println("WARNING: In the neural network multilayer perceptron model, parameter optimizer does not specify a valid optimizer for the selected DA/ML library (keras-tensorflow).\n Thus, the default adam optimizer will be used. See the API documentation for more information: https://keras.io/api/optimizers/. \n");
							optimizer = first_to_upper(Optimizer.ADAM.getLiteral());
						} else {
							if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() == Optimizer.SGD_VALUE) {
								optimizer = Optimizer.SGD.getLiteral().toUpperCase();
							} else if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getOptimizer().getValue() == Optimizer.ADAM_VALUE) {
								optimizer = first_to_upper(Optimizer.ADAM.getLiteral());
							} else {
								optimizer = ((NN_MultilayerPerceptron) (action.getDataAnalytics()
										.getModelAlgorithm())).getOptimizer().getLiteral();
							}
						}
					} else {
						System.err.println("WARNING: In the neural network multilayer perceptron model, parameter optimizer is not present. Thus, the default adam optimizer will be used.\n");
						optimizer = first_to_upper(Optimizer.ADAM.getLiteral());
					}
					
					double alpha = 0;
					boolean alpha_given = false;
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getAlpha() != null) {
						alpha = ((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getAlpha().getDoubleValue();
						alpha_given = true;
					}
					
					int batch_size = 0;
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getBatch_size() != null) {
						pythonScriptStringBuilder.append("batch_size_not_given = False\n");
						batch_size = (int) ((NN_MultilayerPerceptron) (action.getDataAnalytics()
								.getModelAlgorithm())).getBatch_size().getIntValue();
					} else {
						pythonScriptStringBuilder.append("batch_size_not_given = True\n");
						//TODO
						System.err.println("WARNING: In the neural network multilayer perceptron model, parameter batch_size is not present. Thus, the default value min(200, no_of_samples) will be used.\n");
					}
					
					String learning_rate_mode = "";
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getLearning_rate_mode().getValue() != Learning_rate_mode.NOT_SET_VALUE) {
						if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getLearning_rate_mode().getValue() != Learning_rate_mode.EXPONENTIAL_DECAY_VALUE &&
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getLearning_rate_mode().getValue() != Learning_rate_mode.PIECEWISE_CONSTANT_DECAY_VALUE &&
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getLearning_rate_mode().getValue() != Learning_rate_mode.POLYNOMIAL_DECAY_VALUE &&
								((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getLearning_rate_mode().getValue() != Learning_rate_mode.INVERSE_TIME_DECAY_VALUE) {
							System.err.println("WARNING: The chosen library for DA/ML, i.e., keras-tensorflow, only acceptes one of the following choices for the learning_rate_mode (lr_schedule): ExponentialDecay, PiecewiseConstantDecay, PolynomialDecay or InverseTimeDecay.\n However, the chosen one is not supported. Please see the API doc for more information on this: https://keras.io/api/optimizers/learning_rate_schedules/.\n");
						}
						learning_rate_mode = ((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getLearning_rate_mode().getLiteral();
					}
					
					String learning_rate_init = "";
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getLearning_rate_init() != null) {
						learning_rate_init = ((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getLearning_rate_init().toString();
					}
					
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getPower_t() != null) {
						System.err.println("WARNING: The chosen library for DA/ML, i.e., keras-tensorflow, does not accept parameter power_t. Either remove it or try using another library, e.g., @dalib \"scikit-learn\".\n");
					}
					
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getMax_iter() != null) {
						System.err.println("WARNING: The chosen library for DA/ML, i.e., keras-tensorflow, does not accept parameter max_iter. Use epochs instead. See the API doc for more information: https://keras.io/api/models/sequential/\n");
					}
					
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getShuffle() != null) {
						System.err.println("WARNING: The chosen library for DA/ML, i.e., keras-tensorflow, does not accept parameter shuffle. Either remove it or try using another library, e.g., @dalib \"scikit-learn\".\n");
					}
					
					int random_state = 0;
					boolean random_state_given = false;
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getRandom_state() != null) {
						random_state = (int)((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getRandom_state().getIntValue();
						random_state_given = true;
					}
					
					if(((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getTol() != null) {
						System.err.println("WARNING: The chosen library for DA/ML, i.e., keras-tensorflow, does not accept parameter shuffle. Either remove it or try using another library, e.g., @dalib \"scikit-learn\".\n");
					}
					
					if(random_state_given) {
						pythonScriptStringBuilder.append("from numpy.random import seed\n");
						pythonScriptStringBuilder.append("seed(" + String.valueOf(random_state) + ")\n");
						pythonScriptStringBuilder.append("from tensorflow import set_random_seed\n");
						pythonScriptStringBuilder.append("set_random_seed(" + String.valueOf(random_state) + ")\n");
					}
					pythonScriptStringBuilder.append("import pandas as pd\n");
					pythonScriptStringBuilder.append("import numpy as np\n");
					pythonScriptStringBuilder.append("from sklearn.preprocessing import LabelEncoder\n");//TODO
					pythonScriptStringBuilder.append("import re\n\n");
					
					pythonScriptStringBuilder.append("import logging, os, sys\n");
					pythonScriptStringBuilder.append("logging.disable(logging.WARNING)\n");
					pythonScriptStringBuilder.append("os.environ[\"TF_CPP_MIN_LOG_LEVEL\"] = \"3\"\n");
					pythonScriptStringBuilder.append("stderr = sys.stderr\n");
					pythonScriptStringBuilder.append("sys.stderr = open(os.devnull, 'w')\n");
					pythonScriptStringBuilder.append("from keras.models import Sequential\n");
					pythonScriptStringBuilder.append("from keras.layers.core import Dense, Activation, Dropout\n");
					pythonScriptStringBuilder.append("sys.stderr = stderr\n\n"); //TODO
										
					pythonScriptStringBuilder
							.append("#Setting the correct data type, i.e., float32 for numerical features\n");
					pythonScriptStringBuilder.append("p1 = re.compile(r'\\d+(\\.\\d+)?$')\n");
					pythonScriptStringBuilder.append(
							"tmp = X_train.iloc[:,1:].apply(lambda x: True if re.match(p1,str(x[0]))!=None else False)\n");
					pythonScriptStringBuilder.append("numeric_features_list = tmp.index[tmp]\n");
					pythonScriptStringBuilder.append(
							"X_train[numeric_features_list] = X_train[numeric_features_list].astype(\'float32\')\n\n");
					pythonScriptStringBuilder.append("#Preparing the class labels\n");
					pythonScriptStringBuilder.append("le = LabelEncoder()\n");
					pythonScriptStringBuilder.append("le.fit(y_train)\n");
					pythonScriptStringBuilder.append("p2 = re.compile(r'[\\d+(\\.\\d+)]')\n");
					pythonScriptStringBuilder.append("p3 = re.compile(r'\\d+(\\.\\d+)')\n");
					pythonScriptStringBuilder.append("if(re.match(p2,str(y_train[0:1]))!=None):\n");
					pythonScriptStringBuilder.append("	y_train = y_train.apply(lambda x: le.transform([x]))\n");
					pythonScriptStringBuilder.append("if(re.match(p3,str(y_train[0:1]))!=None):\n");
					pythonScriptStringBuilder.append("	y_train = y_train.apply(lambda x: le.transform(x))\n");
					pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/"
							+ "y_train_le.pickle', 'wb') as pickle_file:\n");
					pythonScriptStringBuilder.append("    pickle.dump(le, pickle_file)\n");
					pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/"
							+ "y_train_categorical.pickle', 'wb') as pickle_file:\n");
					pythonScriptStringBuilder.append("    pickle.dump(y_train, pickle_file)\n\n");

					pythonScriptStringBuilder.append("#Standardization/Normalization of numerical features\n");
					pythonScriptStringBuilder.append("if(len(numeric_features_list)>1):\n");
					pythonScriptStringBuilder.append("	mean = (X_train[numeric_features_list]).values.mean()\n");
					pythonScriptStringBuilder.append("	X_train[numeric_features_list] -= mean\n");
					pythonScriptStringBuilder.append("	std = (X_train[numeric_features_list]).values.std()\n");
					pythonScriptStringBuilder.append("	if(std!=0):\n");
					pythonScriptStringBuilder.append("		X_train[numeric_features_list] /= std\n");
					pythonScriptStringBuilder.append("	else:\n");
					pythonScriptStringBuilder.append("		max = (X_train[numeric_features_list]).values.max()\n");
					pythonScriptStringBuilder.append("		if(max!=0):\n");
					pythonScriptStringBuilder.append("			X_train[numeric_features_list] /= max\n\n");

					pythonScriptStringBuilder.append("#Creating the model\n");
					//TODO if(alpha_given) {from keras.regularizers import l2; params += ", kernel_regularizer=l2(alpha)";}
					
					pythonScriptStringBuilder.append("no_neurons_hidden_layers = None\n");
					pythonScriptStringBuilder.append("if(hidden_layers_size_not_given == True):\n");
					pythonScriptStringBuilder.append("	import random\n");
					pythonScriptStringBuilder.append(
							"	no_neurons_hidden_layers=random.randint(max(1,(2//3))*min(X_train.shape[1],len(y_train)),max(X_train.shape[1],len(y_train)))\n");

					pythonScriptStringBuilder.append("model = Sequential([\n");
					pythonScriptStringBuilder.append("  Dense(no_neurons_hidden_layers, activation='"
							+ activation_function + "', input_shape=(X_train.shape[1],)),\n");
					for (int i = 0; i < no_hidden_layers; i++) {
						pythonScriptStringBuilder.append("  Dense(no_neurons_hidden_layers, activation='"
								+ activation_function + "'),\n");
					}
					pythonScriptStringBuilder
							.append("  Dense(len(y_train), activation='" + activation_function + "'),\n");
					pythonScriptStringBuilder.append("])\n\n");



					String loss_function = "";
					if (((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getLoss()
							.getValue() == Loss.NOT_SET_VALUE) {
						loss_function = Loss.SPARSE_CATEGORICAL_CROSSENTROPY.getLiteral();
					} else {
						loss_function = ((NN_MultilayerPerceptron) (action.getDataAnalytics()
								.getModelAlgorithm())).getLoss().getLiteral();
					}

					pythonScriptStringBuilder.append("#Compiling the model\n");
					pythonScriptStringBuilder.append("model.compile(\n");
					pythonScriptStringBuilder.append("  optimizer='" + optimizer + "',\n");
					pythonScriptStringBuilder.append("  loss='" + loss_function + "',\n");
					pythonScriptStringBuilder.append("  metrics=['accuracy'],\n");
					pythonScriptStringBuilder.append(")\n\n");

					int no_epochs = 0;
					if (((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getEpochs() == null) {
						no_epochs = 5;
					} else {
						no_epochs = (int) ((NN_MultilayerPerceptron) (action.getDataAnalytics()
								.getModelAlgorithm())).getEpochs().getIntValue();
					}

					

					pythonScriptStringBuilder.append("#Training the model\n");
					pythonScriptStringBuilder.append("model.fit(\n");
					pythonScriptStringBuilder.append("  X_train,\n");
					pythonScriptStringBuilder.append("  y_train,\n");
					pythonScriptStringBuilder.append("  epochs=" + no_epochs + ",\n");
					pythonScriptStringBuilder.append("  batch_size=" + batch_size + ",\n");
					pythonScriptStringBuilder.append("  verbose=0,\n");
					pythonScriptStringBuilder.append(")\n\n");

					pythonScriptStringBuilder.append("model.save_weights('" + path_str + "/python-scripts/pickles/"
							+ "train_model_nn_mlp_weights.h5')\n\n");
				} else {
					System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
							+ "You may try @dalib=\"auto\" instead.\n");
				}
			}
			else {
				System.err.println("ERROR: " + dataAnalyticsModelAlgorithm.getName() + " is currently not a supported algorithm for supervised ML (classification).\n");
			}

		} else {
			// Unsupervised ML / Clustering
			// TODO
		}

		// pythonScriptStringBuilder.append("#********* ML2 *********\n\n");
		File pythonScriptsDir = new File(path_str + "/python-scripts");
		if (!pythonScriptsDir.exists()) {
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

	// ML2: da_predict
	@Override
	public void generate(DAPredictAction action, StringBuilder builder, Context ctx) {
		
		String dalib = "auto";
		if (AnnotatedElementHelper.hasAnnotation(action.getDataAnalytics(), "dalib")) {
			if (action.getDataAnalytics().getAnnotations().get(0).getValue().equals("scikit-learn")
					|| action.getDataAnalytics().getAnnotations().get(0).getValue().equals("keras-tensorflow")
					|| action.getDataAnalytics().getAnnotations().get(0).getValue().equals("pytorch")) {
				dalib = action.getDataAnalytics().getAnnotations().get(0).getValue();
			} else if (action.getDataAnalytics().getAnnotations().get(0).getValue().equals("weka")) {
				System.err.println(
						"ERROR: This compiler/code generator generates Java AND Python code. The data analytics / machine learning part should be generated in Python. However, weka is chosen as the library for data analytics / machine learning in the annotations of the model. Please either change the annotation @dalib to a Python library, e.g., scikit-learn or use the pure Java compiler/code generator!");
			} else {
				dalib = "auto";
			}
		}
		
		Path path = null;
		path = Paths.get(new File(ctx.getOutputDirectory().getAbsolutePath().toString()).toURI());
//		builder.append("\n//********* ML2 *********\n");
		builder.append("String prediction_timestamp = \"\";\n");
		if (action.getDataAnalytics().getTimestamps().equals(Timestamps.ON)) {
			builder.append("File preprocess_timeformat_pickle = new File(\"" + path.toString()
					+ "/src/python-scripts/pickles/preprocess_timeformat.pickle" + "\");\n");
			builder.append("File preprocess_base_time_pickle = new File(\"" + path.toString()
					+ "/src/python-scripts/pickles/preprocess_base_time.pickle" + "\");\n");
			builder.append("if(!preprocess_timeformat_pickle.exists() || !preprocess_base_time_pickle.exists())\n");
			builder.append("	return;\n");
			builder.append(
					"prediction_timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern(\"dd-MM-yyyy HH:mm:ss\")).toString();\n");
		}
		String timestamps = action.getDataAnalytics().getTimestamps().getName();
		EList<Property> features = action.getFeatures();
		List<String> feature_types = new ArrayList<String>();
		for (int i = 0; i < features.size(); i++) {
			if (action.getFeatures().get(i).getTypeRef().isIsArray()) {
				feature_types.add(action.getFeatures().get(i).getTypeRef().getType().getName() + "[]");
			} else {
				feature_types.add(action.getFeatures().get(i).getTypeRef().getType().getName());
			}

		}
		EList<Property> feature_values_for_prediction = action.getFeatures();

		DataAnalyticsModelAlgorithm dataAnalyticsModelAlgorithm = action.getDataAnalytics().getModelAlgorithm();
		generatePythonDAPredictScript(path.toString() + "/src", action);
		
		builder.append("File preprocess_original_df_pickle = new File(\"" + path.toString()
				+ "/src/python-scripts/pickles/preprocess_original_df.pickle" + "\");\n");
		builder.append("File preprocess_label_encoder_pickle = new File(\"" + path.toString()
				+ "/src/python-scripts/pickles/preprocess_label_encoder.pickle" + "\");\n");
		builder.append("if(!preprocess_original_df_pickle.exists())\n");
		builder.append("	return;\n");

		if (dataAnalyticsModelAlgorithm instanceof ML2_ModelAlgorithm) {
			if (action.getDataAnalytics().getLabels() == Labels.ON) {
				// Supervised ML
				
				if (dataAnalyticsModelAlgorithm instanceof LinearRegression) { // Linear Regression
					if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
						builder.append("File train_model_lin_reg_pickle = new File(\"" + path.toString()
								+ "/src/python-scripts/pickles/train_model_lin_reg.pickle" + "\");\n");
						builder.append("if(!train_model_lin_reg_pickle.exists())\n");
						builder.append("	return;\n");
					} else {
						System.err.println("ERROR: The prediction data type is categorical. Therefore, please use the logistic regression classifier, instead of the linear regression model.\n");
					}
				} else if (dataAnalyticsModelAlgorithm instanceof LinearClassifierLogisticRegression) { // Linear Classifier: Logistic Regression
					if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
						System.err.println("ERROR: The prediction data type is numerical. Therefore, please use the linear regression model, instead of the logistic regression classifier.\n");
					} else {
						builder.append("File train_model_lin_cl_log_reg_pickle = new File(\"" + path.toString()
						+ "/src/python-scripts/pickles/train_model_lin_cl_log_reg.pickle" + "\");\n");
				builder.append("if(!train_model_lin_cl_log_reg_pickle.exists())\n");
				builder.append("	return;\n");						
					}
				} else if (dataAnalyticsModelAlgorithm instanceof NaiveBayesGaussian) { // Gaussian Naive Bayes (NB)
					if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
						System.err.println("ERROR: The prediction data type is numerical. Therefore, please use a regression model, instead of a classifier.\n");
					} else {
						builder.append("File train_model_gnb_pickle = new File(\"" + path.toString()
						+ "/src/python-scripts/pickles/train_model_gnb.pickle" + "\");\n");
				builder.append("if(!train_model_gnb_pickle.exists())\n");
				builder.append("	return;\n");						
					}
				} else if (dataAnalyticsModelAlgorithm instanceof NaiveBayesMultinomial) { // Multinomial Naive Bayes (NB)
					if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
						System.err.println("ERROR: The prediction data type is numerical. Therefore, please use a regression model, instead of a classifier.\n");
					} else {
						builder.append("File train_model_mnb_pickle = new File(\"" + path.toString()
						+ "/src/python-scripts/pickles/train_model_mnb.pickle" + "\");\n");
				builder.append("if(!train_model_mnb_pickle.exists())\n");
				builder.append("	return;\n");						
					}
				} else if (dataAnalyticsModelAlgorithm instanceof NaiveBayesComplement) { // Complement Naive Bayes (NB)
					if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
						System.err.println("ERROR: The prediction data type is numerical. Therefore, please use a regression model, instead of a classifier.\n");
					} else {
						builder.append("File train_model_cnb_pickle = new File(\"" + path.toString()
						+ "/src/python-scripts/pickles/train_model_cnb.pickle" + "\");\n");
				builder.append("if(!train_model_cnb_pickle.exists())\n");
				builder.append("	return;\n");						
					}
				} else if (dataAnalyticsModelAlgorithm instanceof NaiveBayesBernoulli) { // Bernoulli Naive Bayes (NB)
					if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
						System.err.println("ERROR: The prediction data type is numerical. Therefore, please use a regression model, instead of a classifier.\n");
					} else {
						builder.append("File train_model_bnb_pickle = new File(\"" + path.toString()
						+ "/src/python-scripts/pickles/train_model_bnb.pickle" + "\");\n");
				builder.append("if(!train_model_bnb_pickle.exists())\n");
				builder.append("	return;\n");						
					}
				} else if (dataAnalyticsModelAlgorithm instanceof NaiveBayesCategorical) { // Categorical Naive Bayes (NB)
					if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
						System.err.println("ERROR: The prediction data type is numerical. Therefore, please use a regression model, instead of a classifier.\n");
					} else {
						builder.append("File train_model_cat_nb_pickle = new File(\"" + path.toString()
						+ "/src/python-scripts/pickles/train_model_cat_nb.pickle" + "\");\n");
				builder.append("if(!train_model_cat_nb_pickle.exists())\n");
				builder.append("	return;\n");						
					}
				} else if (dataAnalyticsModelAlgorithm instanceof DecisionTreeRegressor) {// Decision Tree (DT) Regression
					if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
						builder.append("File train_model_dtr_pickle = new File(\"" + path.toString()
								+ "/src/python-scripts/pickles/train_model_dtr.pickle" + "\");\n");
						builder.append("if(!train_model_dtr_pickle.exists())\n");
						builder.append("	return;\n");
					} else {
						System.err.println("ERROR: The prediction data type is categorical. Therefore, please use a classifier, instead of a regression model.\n");
					}
				} else if (dataAnalyticsModelAlgorithm instanceof DecisionTreeClassifier) {// Decision Tree (DT) Classification
					if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
						System.err.println("ERROR: The prediction data type is numerical. Therefore, please use a regression model, instead of a classifier.\n");
					} else {
						builder.append("File train_model_dtc_pickle = new File(\"" + path.toString()
						+ "/src/python-scripts/pickles/train_model_dtc.pickle" + "\");\n");
				builder.append("if(!train_model_dtc_pickle.exists())\n");
				builder.append("	return;\n");						
					}
				} else if (dataAnalyticsModelAlgorithm instanceof RandomForestRegressor) { // Random Forest (RF) Regression
					if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
						builder.append("File train_model_rfr_pickle = new File(\"" + path.toString()
								+ "/src/python-scripts/pickles/train_model_rfr.pickle" + "\");\n");
						builder.append("if(!train_model_rfr_pickle.exists())\n");
						builder.append("	return;\n");
					} else {
						System.err.println("ERROR: The prediction data type is categorical. Therefore, please use a classifier, instead of a regression model.\n");
					}
				} else if (dataAnalyticsModelAlgorithm instanceof RandomForestClassifier) { // Random Forest (RF) Classification
					if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
						System.err.println("ERROR: The prediction data type is numerical. Therefore, please use a regression model, instead of a classifier.\n");
					} else {
						builder.append("File train_model_rfc_pickle = new File(\"" + path.toString()
						+ "/src/python-scripts/pickles/train_model_rfc.pickle" + "\");\n");
				builder.append("if(!train_model_rfc_pickle.exists())\n");
				builder.append("	return;\n");						
					}
				} else if (dataAnalyticsModelAlgorithm instanceof NN_MultilayerPerceptron) { // NN Multi-Layer Perceptron (MLP)
					
					if (dalib.equals("scikit-learn")) { // scikit-learn v0.24.1
						if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
							// NN Multi-Layer Perceptron (MLP) Regression					
							builder.append("File train_model_nn_mlp_r_pickle = new File(\"" + path.toString()
							+ "/src/python-scripts/pickles/train_model_nn_mlp_r.pickle" + "\");\n");
					builder.append("if(!train_model_nn_mlp_r_pickle.exists())\n");
					builder.append("	return;\n");
						} else {
							// NN Multi-Layer Perceptron (MLP) Classification
							builder.append("File train_model_nn_mlp_c_pickle = new File(\"" + path.toString()
							+ "/src/python-scripts/pickles/train_model_nn_mlp_c.pickle" + "\");\n");
					builder.append("if(!train_model_nn_mlp_c_pickle.exists())\n");
					builder.append("	return;\n");
						}
					} else if(dalib.equals("auto") || dalib.equals("keras-tensorflow")) {
						builder.append("File train_model_nn_mlp_weights = new File(\"" + path.toString()
								+ "/src/python-scripts/pickles/train_model_nn_mlp_weights.h5" + "\");\n");
						builder.append("if(!train_model_nn_mlp_weights.exists())\n");
						builder.append("	return;\n");
					} else {
						System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
									+ "You may try @dalib=\"auto\" instead.\n");
					}
				}

			} else {
				// Unsupervised ML / Clustering
				// TODO
			}
		}

		// Make the generated Python script executable
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
		for (int i = 0; i < features.size(); i++) {
			features_str += features.get(i).getName();
			feature_types_str += feature_types.get(i);
			if (i < features.size() - 1) {
				features_str += ",";
				feature_types_str += ",";
			}
		}
		builder.append("list.add(\"" + features_str + "\");\n");
		builder.append("list.add(\"" + feature_types_str + "\");\n");

		builder.append("list.add(");
		String feature_values_for_prediction_str = "";
		for (int i = 0; i < feature_values_for_prediction.size(); i++) {
			if (feature_values_for_prediction.get(i).getTypeRef().isIsArray()) {
				builder.append("\"\'\" + Arrays.toString(" + ctx.getVariableName(feature_values_for_prediction.get(i))
						+ ").replaceAll(\",\",\"\") + \"\'\"");
			} else {
				builder.append(ctx.getVariableName(feature_values_for_prediction.get(i)).toString() + "+\"\"");
			}

			if (i < feature_values_for_prediction.size() - 1) {
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
		builder.append(
				"	BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));\n");
		builder.append("	String s = null;\n");
		builder.append("	while ((s = stdInput.readLine()) != null) {\n");
		builder.append("		output_string_builder.append(s);\n");
		builder.append("	}\n");
		builder.append("} catch(Exception e){System.out.println(e);}\n");

		if (!(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().getType() instanceof Enumeration)) {
			if (AnnotatedElementHelper.hasAnnotation(
					action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().getType(), "java_type")) {
				if (!action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().isIsArray()) {
					
					if(AnnotatedElementHelper.annotation(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().getType(), "java_type").equals("boolean")) {
						//boolean
						builder.append(
						ctx.getVariableName(action.getDataAnalytics().getPredictionResults().get(0)).toString()
								+ "= Boolean.parseBoolean("
						+ "(output_string_builder.toString());\n");
						
					} else if(AnnotatedElementHelper.annotation(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().getType(), "java_type").equals("char")) {
						//char
						builder.append(
						ctx.getVariableName(action.getDataAnalytics().getPredictionResults().get(0)).toString()
								+ "= "
						+ "output_string_builder.toString();\n");
						
					} else if(AnnotatedElementHelper.annotation(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().getType(), "java_type").equals("String")) {
						//String
						builder.append(
						ctx.getVariableName(action.getDataAnalytics().getPredictionResults().get(0)).toString()
								+ "= "
						+ "output_string_builder.toString();\n");
						
					} else if(AnnotatedElementHelper.annotation(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().getType(), "java_type").equals("double")) {
						//double
						builder.append(
						ctx.getVariableName(action.getDataAnalytics().getPredictionResults().get(0)).toString()
								+ "= Double.valueOf("
						+ "output_string_builder.toString());\n");
						
					} else if(AnnotatedElementHelper.annotation(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().getType(), "java_type").equals("byte")) {
						//byte
						builder.append(
						ctx.getVariableName(action.getDataAnalytics().getPredictionResults().get(0)).toString()
								+ "= Byte.valueOf((int) Math.round(Double.valueOf("
						+ "output_string_builder.toString())));\n");
						
					} else if(AnnotatedElementHelper.annotation(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().getType(), "java_type").equals("short")) {
						//short
						builder.append(
						ctx.getVariableName(action.getDataAnalytics().getPredictionResults().get(0)).toString()
								+ "= Short.valueOf((int) Math.round(Double.valueOf("
						+ "output_string_builder.toString())));\n");
						
					} else if(AnnotatedElementHelper.annotation(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().getType(), "java_type").equals("int")) {
						//int
						builder.append(
						ctx.getVariableName(action.getDataAnalytics().getPredictionResults().get(0)).toString()
								+ "= Integer.valueOf((int) Math.round(Double.valueOf("
						+ "output_string_builder.toString())));\n");
						
					}else if(AnnotatedElementHelper.annotation(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().getType(), "java_type").equals("long")) {
						//long
						builder.append(
						ctx.getVariableName(action.getDataAnalytics().getPredictionResults().get(0)).toString()
								+ "= Long.valueOf((int) Math.round(Double.valueOf("
						+ "output_string_builder.toString())));\n");
						
					}
					
				} else {
					builder.append(
							"String[] arrString = output_string_builder.toString().substring(1,output_string_builder.toString().length()-1).split(\" \");\n");
					builder.append(AnnotatedElementHelper
							.annotation(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().getType(),
									"java_type")
							.toArray()[0] + "[] ");
					builder.append("arr = new ");
					builder.append(AnnotatedElementHelper
							.annotation(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().getType(),
									"java_type")
							.toArray()[0]);
					builder.append("[arrString.length];\n");
					builder.append("for(int i=0; i<arrString.length; i++) {\n");
					builder.append(
							"	arr[i] = "
									+ ctx.firstToUpper(AnnotatedElementHelper
											.annotation(action.getDataAnalytics().getPredictionResults().get(0)
													.getTypeRef().getType(), "java_type")
											.toArray()[0].toString())
									+ ".parse"
									+ ctx.firstToUpper(AnnotatedElementHelper.annotation(action.getDataAnalytics()
											.getPredictionResults().get(0).getTypeRef().getType(), "java_type")
											.toArray()[0].toString())
									+ "(arrString[i]);\n");
					builder.append("}\n");
					builder.append(
							ctx.getVariableName(action.getDataAnalytics().getPredictionResults().get(0)).toString()
									+ "=arr;\n");
				}
			} else {
				if (!action.getDataAnalytics().getPredictionResults().get(0).getTypeRef().isIsArray()) {
					// TODO
					builder.append("(Object) (output_string_builder.toString());\n");
				} else {
					// TODO
					builder.append("(Object[]) (output_string_builder.toString());\n");
				}
			}
		}

//		builder.append("//********* ML2 *********\n\n");
	}

	// ML2: Code generator for the data analytics predicting Python script,
	// predict.py
	public void generatePythonDAPredictScript(String path_str, DAPredictAction action) {
		DataAnalyticsModelAlgorithm dataAnalyticsModelAlgorithm = action.getDataAnalytics().getModelAlgorithm();
		
		String dalib = "auto";
		if (AnnotatedElementHelper.hasAnnotation(action.getDataAnalytics(), "dalib")) {
			if (action.getDataAnalytics().getAnnotations().get(0).getValue().equals("scikit-learn")
					|| action.getDataAnalytics().getAnnotations().get(0).getValue().equals("keras-tensorflow")
					|| action.getDataAnalytics().getAnnotations().get(0).getValue().equals("pytorch")) {
				dalib = action.getDataAnalytics().getAnnotations().get(0).getValue();
			} else if (action.getDataAnalytics().getAnnotations().get(0).getValue().equals("weka")) {
				System.err.println(
						"ERROR: This compiler/code generator generates Java AND Python code. The data analytics / machine learning part should be generated in Python. However, weka is chosen as the library for data analytics / machine learning in the annotations of the model. Please either change the annotation @dalib to a Python library, e.g., scikit-learn or use the pure Java compiler/code generator!");
			} else {
				dalib = "auto";
			}
		}
		
		StringBuilder pythonScriptStringBuilder = new StringBuilder();
//		pythonScriptStringBuilder.append("#********* ML2 *********\n\n");
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

		pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/"
				+ "preprocess_original_df.pickle', 'rb') as pickle_file:\n");
		pythonScriptStringBuilder.append("	original_df = pickle.load(pickle_file)\n");
		pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/"
				+ "preprocess_X_train.pickle', 'rb') as pickle_file:\n");
		pythonScriptStringBuilder.append("	X_train = pickle.load(pickle_file)\n");
		pythonScriptStringBuilder.append("with open('" + path_str + "/python-scripts/pickles/"
				+ "preprocess_y_train.pickle', 'rb') as pickle_file:\n");
		pythonScriptStringBuilder.append("	y_train = pickle.load(pickle_file)\n");

		pythonScriptStringBuilder.append(
				"array_features_indexes = list(filter(lambda x: '[' in feature_types[x], range(len(feature_types))))\n");
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

		pythonScriptStringBuilder.append(
				"categorical_features_indexes = list(filter(lambda x: feature_types[x] == 'String', range(len(feature_types))))\n\n");

		pythonScriptStringBuilder.append("if(len(categorical_features_indexes)!=0):\n");
		
		if (dalib.equals("auto") || dalib.equals("scikit-learn")) {
			pythonScriptStringBuilder.append("	from sklearn.preprocessing import LabelEncoder\n");
			pythonScriptStringBuilder.append("	with open('" + path_str + "/python-scripts/pickles/"
					+ "preprocess_label_encoder.pickle', 'rb') as pickle_file:\n");
			pythonScriptStringBuilder.append("		le = pickle.load(pickle_file)\n\n");
		} else if (dalib.equals("keras-tensorflow")) {
			pythonScriptStringBuilder.append("from keras.utils import to_categorical\n\n");
			pythonScriptStringBuilder.append("	with open('" + path_str + "/python-scripts/pickles/"
					+ "preprocess_mapping.pickle', 'rb') as pickle_file:\n");
			pythonScriptStringBuilder.append("		mapping = pickle.load(pickle_file)\n\n");
		} else {
			System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
		+ "You may try @dalib=\"auto\" instead.\n");
		}

		pythonScriptStringBuilder.append("flag = False\n");
		pythonScriptStringBuilder.append("for i in range(len(features)):\n");
		pythonScriptStringBuilder.append("	if i in categorical_features_indexes:\n");
		pythonScriptStringBuilder.append(
				"		if not np.isin([feature_values_for_prediction[i]],original_df[features[i]]).item(0):\n");
		pythonScriptStringBuilder.append("			flag = True\n");
		pythonScriptStringBuilder.append("			break\n\n");

		pythonScriptStringBuilder.append("if(flag):\n");
		pythonScriptStringBuilder.append("	print (False)\n");
		pythonScriptStringBuilder.append("else:\n");

		if (dataAnalyticsModelAlgorithm instanceof ML2_ModelAlgorithm) {
			if (action.getDataAnalytics().getLabels() == Labels.ON) {
				// Supervised ML
				
				if (dataAnalyticsModelAlgorithm instanceof LinearRegression ||
						dataAnalyticsModelAlgorithm instanceof LinearClassifierLogisticRegression) { // Linear Model 
					if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
						// Linear Regression
						if(dataAnalyticsModelAlgorithm instanceof LinearClassifierLogisticRegression) {
							System.err.println("ERROR: The prediction data type is numeric. Therefore, please use the linear regression model for regression, instead of the logistic regression classifier.\n");
						}
						if (dalib.equals("auto") || dalib.equals("scikit-learn")) { // scikit-learn v0.24.1
						pythonScriptStringBuilder.append("	from sklearn.linear_model import LinearRegression\n");
						pythonScriptStringBuilder.append("	with open('" + path_str + "/python-scripts/pickles/"
								+ "train_model_lin_reg.pickle', 'rb') as pickle_file:\n");
						pythonScriptStringBuilder.append("		model = pickle.load(pickle_file)\n\n");
						}  else if(dalib.equals("keras-tensorflow")) {
							System.err.println("ERROR: " + dalib + " is specified as the library for DA/ML. However, it does not support the chosen model/algorithm for DA/ML: " + dataAnalyticsModelAlgorithm.getName() + ".\n"
									+ "You may try @dalib=\"auto\" instead.\n");
						} else {
							System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
									+ "You may try @dalib=\"auto\" instead.\n");
							}
					} else {
						// Linear Classification through Logistic Regression
						if(dataAnalyticsModelAlgorithm instanceof LinearRegression) {
							System.err.println("ERROR: The prediction data type is categorical. Therefore, please use the logistic regression classifier, instead of the linear regression model.\n");
						}
						if (dalib.equals("auto") || dalib.equals("scikit-learn")) { // scikit-learn v0.24.1
						pythonScriptStringBuilder.append("	from sklearn.linear_model import LogisticRegression\n");
						pythonScriptStringBuilder.append("	with open('" + path_str + "/python-scripts/pickles/"
								+ "train_model_lin_cl_log_reg.pickle', 'rb') as pickle_file:\n");
						pythonScriptStringBuilder.append("		model = pickle.load(pickle_file)\n\n");
						} else if(dalib.equals("keras-tensorflow")) {
							System.err.println("ERROR: " + dalib + " is specified as the library for DA/ML. However, it does not support the chosen model/algorithm for DA/ML: " + dataAnalyticsModelAlgorithm.getName() + ".\n"
									+ "You may try @dalib=\"auto\" instead.\n");
						} else {
							System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
									+ "You may try @dalib=\"auto\" instead.\n");
						}
					}
				} else if(dataAnalyticsModelAlgorithm instanceof NaiveBayesGaussian) { // Gaussian Naive Bayes (NB)
					if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
						System.err.println("ERROR: " + dataAnalyticsModelAlgorithm.getName() + " is a not a regression ML algorithm, but a classification ML algorithm. However, it is used with a numerical type for the prediction results.\n");
					} else { // Classification
						if (dalib.equals("auto") || dalib.equals("scikit-learn")) { // scikit-learn v0.24.1
						pythonScriptStringBuilder.append("	from sklearn.naive_bayes import GaussianNB\n");
						pythonScriptStringBuilder.append("	with open('" + path_str + "/python-scripts/pickles/"
								+ "train_model_gnb.pickle', 'rb') as pickle_file:\n");
						pythonScriptStringBuilder.append("		model = pickle.load(pickle_file)\n\n");
						} else if(dalib.equals("keras-tensorflow")) {
							System.err.println("ERROR: " + dalib + " is specified as the library for DA/ML. However, it does not support the chosen model/algorithm for DA/ML: " + dataAnalyticsModelAlgorithm.getName() + ".\n"
									+ "You may try @dalib=\"auto\" instead.\n");
						} else {
							System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
									+ "You may try @dalib=\"auto\" instead.\n");
						}						
					}
				} else if(dataAnalyticsModelAlgorithm instanceof NaiveBayesMultinomial) { // Multinomial Naive Bayes (NB)
					if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
						System.err.println("ERROR: " + dataAnalyticsModelAlgorithm.getName() + " is a not a regression ML algorithm, but a classification ML algorithm. However, it is used with a numerical type for the prediction results.\n");
					} else { // Classification
						if (dalib.equals("auto") || dalib.equals("scikit-learn")) { // scikit-learn v0.24.1
						pythonScriptStringBuilder.append("	from sklearn.naive_bayes import MultinomialNB\n");
						pythonScriptStringBuilder.append("	with open('" + path_str + "/python-scripts/pickles/"
								+ "train_model_mnb.pickle', 'rb') as pickle_file:\n");
						pythonScriptStringBuilder.append("		model = pickle.load(pickle_file)\n\n");
						} else if(dalib.equals("keras-tensorflow")) {
							System.err.println("ERROR: " + dalib + " is specified as the library for DA/ML. However, it does not support the chosen model/algorithm for DA/ML: " + dataAnalyticsModelAlgorithm.getName() + ".\n"
									+ "You may try @dalib=\"auto\" instead.\n");
						} else {
							System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
									+ "You may try @dalib=\"auto\" instead.\n");
						}						
					}
				} else if(dataAnalyticsModelAlgorithm instanceof NaiveBayesComplement) { // Complement Naive Bayes (NB)
					if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
						System.err.println("ERROR: " + dataAnalyticsModelAlgorithm.getName() + " is a not a regression ML algorithm, but a classification ML algorithm. However, it is used with a numerical type for the prediction results.\n");
					} else { // Classification
						if (dalib.equals("auto") || dalib.equals("scikit-learn")) { // scikit-learn v0.24.1
						pythonScriptStringBuilder.append("	from sklearn.naive_bayes import ComplementNB\n");
						pythonScriptStringBuilder.append("	with open('" + path_str + "/python-scripts/pickles/"
								+ "train_model_cnb.pickle', 'rb') as pickle_file:\n");
						pythonScriptStringBuilder.append("		model = pickle.load(pickle_file)\n\n");
						} else if(dalib.equals("keras-tensorflow")) {
							System.err.println("ERROR: " + dalib + " is specified as the library for DA/ML. However, it does not support the chosen model/algorithm for DA/ML: " + dataAnalyticsModelAlgorithm.getName() + ".\n"
									+ "You may try @dalib=\"auto\" instead.\n");
						} else {
							System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
									+ "You may try @dalib=\"auto\" instead.\n");
						}						
					}
				} else if(dataAnalyticsModelAlgorithm instanceof NaiveBayesBernoulli) { // Bernoulli Naive Bayes (NB)
					if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
						System.err.println("ERROR: " + dataAnalyticsModelAlgorithm.getName() + " is a not a regression ML algorithm, but a classification ML algorithm. However, it is used with a numerical type for the prediction results.\n");
					} else { // Classification
						if (dalib.equals("auto") || dalib.equals("scikit-learn")) { // scikit-learn v0.24.1
						pythonScriptStringBuilder.append("	from sklearn.naive_bayes import BernoulliNB\n");
						pythonScriptStringBuilder.append("	with open('" + path_str + "/python-scripts/pickles/"
								+ "train_model_bnb.pickle', 'rb') as pickle_file:\n");
						pythonScriptStringBuilder.append("		model = pickle.load(pickle_file)\n\n");
						} else if(dalib.equals("keras-tensorflow")) {
							System.err.println("ERROR: " + dalib + " is specified as the library for DA/ML. However, it does not support the chosen model/algorithm for DA/ML: " + dataAnalyticsModelAlgorithm.getName() + ".\n"
									+ "You may try @dalib=\"auto\" instead.\n");
						} else {
							System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
									+ "You may try @dalib=\"auto\" instead.\n");
						}						
					}
				} else if(dataAnalyticsModelAlgorithm instanceof NaiveBayesCategorical) { // Categorical Naive Bayes (NB)
					if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
						System.err.println("ERROR: " + dataAnalyticsModelAlgorithm.getName() + " is a not a regression ML algorithm, but a classification ML algorithm. However, it is used with a numerical type for the prediction results.\n");
					} else { // Classification
						if (dalib.equals("auto") || dalib.equals("scikit-learn")) { // scikit-learn v0.24.1
						pythonScriptStringBuilder.append("	from sklearn.naive_bayes import CategoricalNB\n");
						pythonScriptStringBuilder.append("	with open('" + path_str + "/python-scripts/pickles/"
								+ "train_model_cat_nb.pickle', 'rb') as pickle_file:\n");
						pythonScriptStringBuilder.append("		model = pickle.load(pickle_file)\n\n");
						} else if(dalib.equals("keras-tensorflow")) {
							System.err.println("ERROR: " + dalib + " is specified as the library for DA/ML. However, it does not support the chosen model/algorithm for DA/ML: " + dataAnalyticsModelAlgorithm.getName() + ".\n"
									+ "You may try @dalib=\"auto\" instead.\n");
						} else {
							System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
									+ "You may try @dalib=\"auto\" instead.\n");
						}						
					}
				} else if (dataAnalyticsModelAlgorithm instanceof DecisionTreeRegressor) { // Decision Tree (DT) Regression
					if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
						if (dalib.equals("auto") || dalib.equals("scikit-learn")) {
						pythonScriptStringBuilder.append("	from sklearn.tree import DecisionTreeRegressor\n");
						pythonScriptStringBuilder.append("	with open('" + path_str + "/python-scripts/pickles/"
								+ "train_model_dtr.pickle', 'rb') as pickle_file:\n");
						pythonScriptStringBuilder.append("		model = pickle.load(pickle_file)\n\n");
						}  else if(dalib.equals("keras-tensorflow")) {
							System.err.println("ERROR: " + dalib + " is specified as the library for DA/ML. However, it does not support the chosen model/algorithm for DA/ML: " + dataAnalyticsModelAlgorithm.getName() + ".\n"
									+ "You may try @dalib=\"auto\" instead.\n");
						} else {
							System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
									+ "You may try @dalib=\"auto\" instead.\n");
							}
					} else {
						System.err.println("ERROR: The prediction data type is categorical. Therefore, please use a classifier, instead of a regression model.\n");
					}
				} else if (dataAnalyticsModelAlgorithm instanceof DecisionTreeClassifier) { // Decision Tree (DT) Classification
					if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
						System.err.println("ERROR: The prediction data type is numerical. Therefore, please use a regression model, instead of a classifier.\n");
					} else {
						if (dalib.equals("auto") || dalib.equals("scikit-learn")) {
						pythonScriptStringBuilder.append("	from sklearn.tree import DecisionTreeClassifier\n");
						pythonScriptStringBuilder.append("	with open('" + path_str + "/python-scripts/pickles/"
								+ "train_model_dtc.pickle', 'rb') as pickle_file:\n");
						pythonScriptStringBuilder.append("		model = pickle.load(pickle_file)\n\n");
						} else if(dalib.equals("keras-tensorflow")) {
							System.err.println("ERROR: " + dalib + " is specified as the library for DA/ML. However, it does not support the chosen model/algorithm for DA/ML: " + dataAnalyticsModelAlgorithm.getName() + ".\n"
									+ "You may try @dalib=\"auto\" instead.\n");
						} else {
							System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
									+ "You may try @dalib=\"auto\" instead.\n");
						}
					}
				} else if (dataAnalyticsModelAlgorithm instanceof RandomForestRegressor) { // Random Forest (RF) Regression
					if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
						if (dalib.equals("auto") || dalib.equals("scikit-learn")) {
						pythonScriptStringBuilder.append("	from sklearn.ensemble import RandomForestRegressor\n");
						pythonScriptStringBuilder.append("	with open('" + path_str + "/python-scripts/pickles/"
								+ "train_model_rfr.pickle', 'rb') as pickle_file:\n");
						pythonScriptStringBuilder.append("		model = pickle.load(pickle_file)\n\n");
						}  else if(dalib.equals("keras-tensorflow")) {
							System.err.println("ERROR: " + dalib + " is specified as the library for DA/ML. However, it does not support the chosen model/algorithm for DA/ML: " + dataAnalyticsModelAlgorithm.getName() + ".\n"
									+ "You may try @dalib=\"auto\" instead.\n");
						} else {
							System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
									+ "You may try @dalib=\"auto\" instead.\n");
							}
					} else {
						System.err.println("ERROR: The prediction data type is categorical. Therefore, please use a classifier, instead of a regression model.\n");
					}
				} else if (dataAnalyticsModelAlgorithm instanceof RandomForestClassifier) { // Random Forest (RF) Classification
					if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
						System.err.println("ERROR: The prediction data type is numerical. Therefore, please use a regression model, instead of a classifier.\n");
					} else {
						if (dalib.equals("auto") || dalib.equals("scikit-learn")) {
						pythonScriptStringBuilder.append("	from sklearn.ensemble import RandomForestClassifier\n");
						pythonScriptStringBuilder.append("	with open('" + path_str + "/python-scripts/pickles/"
								+ "train_model_rfc.pickle', 'rb') as pickle_file:\n");
						pythonScriptStringBuilder.append("		model = pickle.load(pickle_file)\n\n");
						} else if(dalib.equals("keras-tensorflow")) {
							System.err.println("ERROR: " + dalib + " is specified as the library for DA/ML. However, it does not support the chosen model/algorithm for DA/ML: " + dataAnalyticsModelAlgorithm.getName() + ".\n"
									+ "You may try @dalib=\"auto\" instead.\n");
						} else {
							System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
									+ "You may try @dalib=\"auto\" instead.\n");
						}
					}
				} else if (dataAnalyticsModelAlgorithm instanceof NN_MultilayerPerceptron) { // NN Multi-Layer Perceptron (MLP)
					
					if (dalib.equals("scikit-learn")) { // scikit-learn v0.24.1
						if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
							// NN Multi-Layer Perceptron (MLP) Regression	
							pythonScriptStringBuilder.append("	from sklearn.neural_network import MLPRegressor\n");
							pythonScriptStringBuilder.append("	with open('" + path_str + "/python-scripts/pickles/"
									+ "train_model_nn_mlp_r.pickle', 'rb') as pickle_file:\n");
							pythonScriptStringBuilder.append("		model = pickle.load(pickle_file)\n\n");
						} else {
							// NN Multi-Layer Perceptron (MLP) Classification
							pythonScriptStringBuilder.append("	from sklearn.neural_network import MLPClassifier\n");
							pythonScriptStringBuilder.append("	with open('" + path_str + "/python-scripts/pickles/"
									+ "train_model_nn_mlp_c.pickle', 'rb') as pickle_file:\n");
							pythonScriptStringBuilder.append("		model = pickle.load(pickle_file)\n\n");
						}
					} else if(dalib.equals("auto") || dalib.equals("keras-tensorflow")) {
						//TODO
					} else {
						System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
								+ "You may try @dalib=\"auto\" instead.\n");
					}
					
					
					
//					if (TyperHelper.isNumeric(action.getDataAnalytics().getPredictionResults().get(0).getTypeRef())) {
//						// NN MLP Regression
//						if (dalib.equals("auto") || dalib.equals("scikit-learn")) {
//							
//						} else if(dalib.equals("keras-tensorflow")) {
//							
//						} else {
//							throw new Exception(dalib + " not supported as the library for DA/ML.\n"
//						+ "You may try @dalib=\"auto\" instead.\n");
//						}
//					} else {
//						// NN MLP Classification
//						if (dalib.equals("auto") || dalib.equals("scikit-learn")) {
//							
//						} else if(dalib.equals("keras-tensorflow")) {
//							pythonScriptStringBuilder.append(
//									"	with open('/home/am/Projects/ML2/GeneratedDemo3/src/python-scripts/pickles/y_train_le.pickle', 'rb') as pickle_file:\n");
//							pythonScriptStringBuilder.append("		y_train_le = pickle.load(pickle_file)\n");
//							pythonScriptStringBuilder.append(
//									"	with open('/home/am/Projects/ML2/GeneratedDemo3/src/python-scripts/pickles/y_train_categorical.pickle', 'rb') as pickle_file:\n");
//							pythonScriptStringBuilder.append("		y_train_categorical = pickle.load(pickle_file)\n\n");
//
//							pythonScriptStringBuilder.append("	import logging, os, sys\n");
//							pythonScriptStringBuilder.append("	logging.disable(logging.WARNING)\n");
//							pythonScriptStringBuilder.append("	os.environ[\"TF_CPP_MIN_LOG_LEVEL\"] = \"3\"\n");
//							pythonScriptStringBuilder.append("	stderr = sys.stderr\n");
//							pythonScriptStringBuilder.append("	sys.stderr = open(os.devnull, 'w')\n");
//							pythonScriptStringBuilder.append("	from keras.models import Sequential\n");
//							pythonScriptStringBuilder
//									.append("	from keras.layers.core import Dense, Activation, Dropout\n");
//							pythonScriptStringBuilder.append("	sys.stderr = stderr\n\n");
//
//							pythonScriptStringBuilder.append("	#Rebuilding the model\n");
//							String activation_function = "";
//							if (((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm())).getActivation()
//									.getValue() == Activation.NO_IDEA_VALUE) {
//								activation_function = Activation.RELU.getLiteral();
//							} else {
//								activation_function = ((NN_MultilayerPerceptron) (action.getDataAnalytics()
//										.getModelAlgorithm())).getActivation().getLiteral();
//							}
//
//							int no_hidden_layers = 0;
//							if (((NN_MultilayerPerceptron) (action.getDataAnalytics().getModelAlgorithm()))
//									.getNo_hidden_layers().getIntValue() == 0) {
//								no_hidden_layers = 1;
//							} else {
//								no_hidden_layers = (int) ((NN_MultilayerPerceptron) (action.getDataAnalytics()
//										.getModelAlgorithm())).getNo_hidden_layers().getIntValue();
//							}
//
//							pythonScriptStringBuilder.append("	import random\n");
//							pythonScriptStringBuilder.append(
//									"	no_neurons_hidden_layers=random.randint(max(1,(2//3))*min(X_train.shape[1],len(y_train)),max(X_train.shape[1],len(y_train)))\n");
//
//							pythonScriptStringBuilder.append("	model = Sequential([\n");
//							pythonScriptStringBuilder.append("		Dense(no_neurons_hidden_layers, activation='"
//									+ activation_function + "', input_shape=(X_train.shape[1],)),\n");
//							for (int i = 0; i < no_hidden_layers; i++) {
//								pythonScriptStringBuilder.append("		Dense(no_neurons_hidden_layers, activation='"
//										+ activation_function + "'),\n");
//							}
//							pythonScriptStringBuilder.append(
//									"		Dense(len(y_train), activation='" + selected_activation_function + "'),\n");
//							pythonScriptStringBuilder.append("	])\n\n");
//
//							pythonScriptStringBuilder.append("	model.load_weights('" + path_str
//									+ "/python-scripts/pickles/" + "train_model_nn_mlp_weights.h5')\n\n");
//						} else {
//							throw new Exception(dalib + " not supported as the library for DA/ML.\n"
//						+ "You may try @dalib=\"auto\" instead.\n");
//						}
//					}
				} else {
					System.err.println("ERROR: " + dataAnalyticsModelAlgorithm.getName() + " is currently not a supported algorithm for supervised ML (classification).\n");
				}
			} else {
				// Unsupervised ML / Clustering
				// TODO
			}
		}

		pythonScriptStringBuilder.append("	df = pd.DataFrame(data={}, columns=[])\n");
		pythonScriptStringBuilder.append("	for i in range(len(feature_values_for_prediction)):\n");
		pythonScriptStringBuilder.append("		if i in categorical_features_indexes:\n");
		pythonScriptStringBuilder.append(
				"			df.insert(i,features[i], pd.Series([le.transform([feature_values_for_prediction[i]])]))\n");
		pythonScriptStringBuilder.append("		else:\n");
		pythonScriptStringBuilder
				.append("			df.insert(i,features[i], pd.Series(feature_values_for_prediction[i]))\n\n");

		pythonScriptStringBuilder.append("	if(timestamps.lower() == 'on'):\n");
		pythonScriptStringBuilder.append("		with open('" + path_str + "/python-scripts/pickles/"
				+ "preprocess_timeformat.pickle', 'rb') as pickle_file:\n");
		pythonScriptStringBuilder.append("			timeformat = pickle.load(pickle_file)\n");
		pythonScriptStringBuilder.append("		with open('" + path_str + "/python-scripts/pickles/"
				+ "preprocess_base_time.pickle', 'rb') as pickle_file:\n");
		pythonScriptStringBuilder.append("			base_time = pickle.load(pickle_file)\n\n");

		pythonScriptStringBuilder.append(
				"	df.insert(0,'timestamp', [(datetime.datetime.strptime(timestamp_for_prediction[1:-1], timeformat)-base_time).seconds])\n\n");
		
		// The actual prediction of the DA/ML model
		if (dalib.equals("auto") || dalib.equals("scikit-learn")) {
			pythonScriptStringBuilder.append("	print (model.predict(df).item(0))\n\n");
		} else if(dalib.equals("keras-tensorflow")) {
			pythonScriptStringBuilder
			.append("	print(y_train_le.inverse_transform([int(model.predict(df))]).item(0))\n\n");
		} else {
			System.err.println("ERROR: " + dalib + " not supported as the library for DA/ML.\n"
					+ "You may try @dalib=\"auto\" instead.\n");
		}

//		pythonScriptStringBuilder.append("#********* ML2 *********\n\n");
		File pythonScriptsDir = new File(path_str + "/python-scripts");
		if (!pythonScriptsDir.exists()) {
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
