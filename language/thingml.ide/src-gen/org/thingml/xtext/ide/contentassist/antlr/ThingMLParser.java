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
package org.thingml.xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.thingml.xtext.ide.contentassist.antlr.internal.InternalThingMLParser;
import org.thingml.xtext.services.ThingMLGrammarAccess;

public class ThingMLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ThingMLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ThingMLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getThingMLModelAccess().getAlternatives_1(), "rule__ThingMLModel__Alternatives_1");
			builder.put(grammarAccess.getPlatformAnnotationAccess().getAlternatives_1(), "rule__PlatformAnnotation__Alternatives_1");
			builder.put(grammarAccess.getNamedElementAccess().getAlternatives(), "rule__NamedElement__Alternatives");
			builder.put(grammarAccess.getAnnotatedElementAccess().getAlternatives(), "rule__AnnotatedElement__Alternatives");
			builder.put(grammarAccess.getVariableAccess().getAlternatives(), "rule__Variable__Alternatives");
			builder.put(grammarAccess.getTypeRefAccess().getCardinalityAlternatives_1_1_0(), "rule__TypeRef__CardinalityAlternatives_1_1_0");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getThingAccess().getAlternatives_6(), "rule__Thing__Alternatives_6");
			builder.put(grammarAccess.getFunctionAccess().getAlternatives(), "rule__Function__Alternatives");
			builder.put(grammarAccess.getPortAccess().getAlternatives(), "rule__Port__Alternatives");
			builder.put(grammarAccess.getRequiredPortAccess().getAlternatives_6(), "rule__RequiredPort__Alternatives_6");
			builder.put(grammarAccess.getProvidedPortAccess().getAlternatives_5(), "rule__ProvidedPort__Alternatives_5");
			builder.put(grammarAccess.getInternalPortAccess().getAlternatives_5(), "rule__InternalPort__Alternatives_5");
			builder.put(grammarAccess.getStateAccess().getAlternatives(), "rule__State__Alternatives");
			builder.put(grammarAccess.getStateAccess().getAlternatives_3_5_2(), "rule__State__Alternatives_3_5_2");
			builder.put(grammarAccess.getHandlerAccess().getAlternatives(), "rule__Handler__Alternatives");
			builder.put(grammarAccess.getCompositeStateAccess().getAlternatives_9_2(), "rule__CompositeState__Alternatives_9_2");
			builder.put(grammarAccess.getCompositeStateAccess().getAlternatives_10(), "rule__CompositeState__Alternatives_10");
			builder.put(grammarAccess.getStateMachineAccess().getAlternatives_8_2(), "rule__StateMachine__Alternatives_8_2");
			builder.put(grammarAccess.getStateMachineAccess().getAlternatives_9(), "rule__StateMachine__Alternatives_9");
			builder.put(grammarAccess.getSessionAccess().getMaxInstancesAlternatives_2_1_0(), "rule__Session__MaxInstancesAlternatives_2_1_0");
			builder.put(grammarAccess.getStateContainerAccess().getAlternatives(), "rule__StateContainer__Alternatives");
			builder.put(grammarAccess.getMessageParameterAccess().getAlternatives(), "rule__MessageParameter__Alternatives");
			builder.put(grammarAccess.getDataAnalyticsModelAlgorithmAccess().getAlternatives(), "rule__DataAnalyticsModelAlgorithm__Alternatives");
			builder.put(grammarAccess.getML2_ModelAlgorithmAccess().getAlternatives(), "rule__ML2_ModelAlgorithm__Alternatives");
			builder.put(grammarAccess.getMinSamplesSplitAccess().getAlternatives(), "rule__MinSamplesSplit__Alternatives");
			builder.put(grammarAccess.getActionAccess().getAlternatives(), "rule__Action__Alternatives");
			builder.put(grammarAccess.getPrintActionAccess().getAlternatives_0(), "rule__PrintAction__Alternatives_0");
			builder.put(grammarAccess.getErrorActionAccess().getAlternatives_0(), "rule__ErrorAction__Alternatives_0");
			builder.put(grammarAccess.getEqualityAccess().getAlternatives_1(), "rule__Equality__Alternatives_1");
			builder.put(grammarAccess.getComparaisonAccess().getAlternatives_1(), "rule__Comparaison__Alternatives_1");
			builder.put(grammarAccess.getAdditionAccess().getAlternatives_1(), "rule__Addition__Alternatives_1");
			builder.put(grammarAccess.getMultiplicationAccess().getAlternatives_1(), "rule__Multiplication__Alternatives_1");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getAtomicExpressionAccess().getAlternatives(), "rule__AtomicExpression__Alternatives");
			builder.put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
			builder.put(grammarAccess.getBooleanLiteralAccess().getAlternatives(), "rule__BooleanLiteral__Alternatives");
			builder.put(grammarAccess.getConfigurationAccess().getAlternatives_4(), "rule__Configuration__Alternatives_4");
			builder.put(grammarAccess.getAbstractConnectorAccess().getAlternatives(), "rule__AbstractConnector__Alternatives");
			builder.put(grammarAccess.getSequentialAccess().getAlternatives(), "rule__Sequential__Alternatives");
			builder.put(grammarAccess.getTimestampsAccess().getAlternatives(), "rule__Timestamps__Alternatives");
			builder.put(grammarAccess.getLabelsAccess().getAlternatives(), "rule__Labels__Alternatives");
			builder.put(grammarAccess.getOptimizerAccess().getAlternatives(), "rule__Optimizer__Alternatives");
			builder.put(grammarAccess.getLossFunctionAccess().getAlternatives(), "rule__LossFunction__Alternatives");
			builder.put(grammarAccess.getThingMLModelAccess().getGroup(), "rule__ThingMLModel__Group__0");
			builder.put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
			builder.put(grammarAccess.getImportAccess().getGroup_2(), "rule__Import__Group_2__0");
			builder.put(grammarAccess.getPlatformAnnotationAccess().getGroup(), "rule__PlatformAnnotation__Group__0");
			builder.put(grammarAccess.getNamedElementAccess().getGroup_16(), "rule__NamedElement__Group_16__0");
			builder.put(grammarAccess.getAnnotatedElementAccess().getGroup_16(), "rule__AnnotatedElement__Group_16__0");
			builder.put(grammarAccess.getVariableAccess().getGroup_0(), "rule__Variable__Group_0__0");
			builder.put(grammarAccess.getTypeRefAccess().getGroup(), "rule__TypeRef__Group__0");
			builder.put(grammarAccess.getTypeRefAccess().getGroup_1(), "rule__TypeRef__Group_1__0");
			builder.put(grammarAccess.getPrimitiveTypeAccess().getGroup(), "rule__PrimitiveType__Group__0");
			builder.put(grammarAccess.getObjectTypeAccess().getGroup(), "rule__ObjectType__Group__0");
			builder.put(grammarAccess.getEnumerationAccess().getGroup(), "rule__Enumeration__Group__0");
			builder.put(grammarAccess.getEnumerationAccess().getGroup_2(), "rule__Enumeration__Group_2__0");
			builder.put(grammarAccess.getEnumerationLiteralAccess().getGroup(), "rule__EnumerationLiteral__Group__0");
			builder.put(grammarAccess.getEnumerationLiteralAccess().getGroup_1(), "rule__EnumerationLiteral__Group_1__0");
			builder.put(grammarAccess.getThingAccess().getGroup(), "rule__Thing__Group__0");
			builder.put(grammarAccess.getThingAccess().getGroup_3(), "rule__Thing__Group_3__0");
			builder.put(grammarAccess.getThingAccess().getGroup_3_2(), "rule__Thing__Group_3_2__0");
			builder.put(grammarAccess.getPropertyAssignAccess().getGroup(), "rule__PropertyAssign__Group__0");
			builder.put(grammarAccess.getPropertyAssignAccess().getGroup_2(), "rule__PropertyAssign__Group_2__0");
			builder.put(grammarAccess.getProtocolAccess().getGroup(), "rule__Protocol__Group__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup_0(), "rule__Function__Group_0__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup_0_3(), "rule__Function__Group_0_3__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup_0_3_1(), "rule__Function__Group_0_3_1__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup_0_5(), "rule__Function__Group_0_5__0");
			builder.put(grammarAccess.getAbstractFunctionAccess().getGroup(), "rule__AbstractFunction__Group__0");
			builder.put(grammarAccess.getAbstractFunctionAccess().getGroup_4(), "rule__AbstractFunction__Group_4__0");
			builder.put(grammarAccess.getAbstractFunctionAccess().getGroup_4_1(), "rule__AbstractFunction__Group_4_1__0");
			builder.put(grammarAccess.getAbstractFunctionAccess().getGroup_6(), "rule__AbstractFunction__Group_6__0");
			builder.put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
			builder.put(grammarAccess.getPropertyAccess().getGroup_5(), "rule__Property__Group_5__0");
			builder.put(grammarAccess.getMessageAccess().getGroup(), "rule__Message__Group__0");
			builder.put(grammarAccess.getMessageAccess().getGroup_3(), "rule__Message__Group_3__0");
			builder.put(grammarAccess.getMessageAccess().getGroup_3_1(), "rule__Message__Group_3_1__0");
			builder.put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
			builder.put(grammarAccess.getRequiredPortAccess().getGroup(), "rule__RequiredPort__Group__0");
			builder.put(grammarAccess.getRequiredPortAccess().getGroup_6_0(), "rule__RequiredPort__Group_6_0__0");
			builder.put(grammarAccess.getRequiredPortAccess().getGroup_6_0_2(), "rule__RequiredPort__Group_6_0_2__0");
			builder.put(grammarAccess.getRequiredPortAccess().getGroup_6_1(), "rule__RequiredPort__Group_6_1__0");
			builder.put(grammarAccess.getRequiredPortAccess().getGroup_6_1_2(), "rule__RequiredPort__Group_6_1_2__0");
			builder.put(grammarAccess.getProvidedPortAccess().getGroup(), "rule__ProvidedPort__Group__0");
			builder.put(grammarAccess.getProvidedPortAccess().getGroup_5_0(), "rule__ProvidedPort__Group_5_0__0");
			builder.put(grammarAccess.getProvidedPortAccess().getGroup_5_0_2(), "rule__ProvidedPort__Group_5_0_2__0");
			builder.put(grammarAccess.getProvidedPortAccess().getGroup_5_1(), "rule__ProvidedPort__Group_5_1__0");
			builder.put(grammarAccess.getProvidedPortAccess().getGroup_5_1_2(), "rule__ProvidedPort__Group_5_1_2__0");
			builder.put(grammarAccess.getInternalPortAccess().getGroup(), "rule__InternalPort__Group__0");
			builder.put(grammarAccess.getInternalPortAccess().getGroup_5_0(), "rule__InternalPort__Group_5_0__0");
			builder.put(grammarAccess.getInternalPortAccess().getGroup_5_0_2(), "rule__InternalPort__Group_5_0_2__0");
			builder.put(grammarAccess.getInternalPortAccess().getGroup_5_1(), "rule__InternalPort__Group_5_1__0");
			builder.put(grammarAccess.getInternalPortAccess().getGroup_5_1_2(), "rule__InternalPort__Group_5_1_2__0");
			builder.put(grammarAccess.getStateAccess().getGroup_3(), "rule__State__Group_3__0");
			builder.put(grammarAccess.getStateAccess().getGroup_3_5_0(), "rule__State__Group_3_5_0__0");
			builder.put(grammarAccess.getStateAccess().getGroup_3_5_1(), "rule__State__Group_3_5_1__0");
			builder.put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
			builder.put(grammarAccess.getTransitionAccess().getGroup_5(), "rule__Transition__Group_5__0");
			builder.put(grammarAccess.getTransitionAccess().getGroup_6(), "rule__Transition__Group_6__0");
			builder.put(grammarAccess.getTransitionAccess().getGroup_7(), "rule__Transition__Group_7__0");
			builder.put(grammarAccess.getInternalTransitionAccess().getGroup(), "rule__InternalTransition__Group__0");
			builder.put(grammarAccess.getInternalTransitionAccess().getGroup_4(), "rule__InternalTransition__Group_4__0");
			builder.put(grammarAccess.getInternalTransitionAccess().getGroup_5(), "rule__InternalTransition__Group_5__0");
			builder.put(grammarAccess.getInternalTransitionAccess().getGroup_6(), "rule__InternalTransition__Group_6__0");
			builder.put(grammarAccess.getCompositeStateAccess().getGroup(), "rule__CompositeState__Group__0");
			builder.put(grammarAccess.getCompositeStateAccess().getGroup_5(), "rule__CompositeState__Group_5__0");
			builder.put(grammarAccess.getCompositeStateAccess().getGroup_9_0(), "rule__CompositeState__Group_9_0__0");
			builder.put(grammarAccess.getCompositeStateAccess().getGroup_9_1(), "rule__CompositeState__Group_9_1__0");
			builder.put(grammarAccess.getStateMachineAccess().getGroup(), "rule__StateMachine__Group__0");
			builder.put(grammarAccess.getStateMachineAccess().getGroup_4(), "rule__StateMachine__Group_4__0");
			builder.put(grammarAccess.getStateMachineAccess().getGroup_8_0(), "rule__StateMachine__Group_8_0__0");
			builder.put(grammarAccess.getStateMachineAccess().getGroup_8_1(), "rule__StateMachine__Group_8_1__0");
			builder.put(grammarAccess.getSessionAccess().getGroup(), "rule__Session__Group__0");
			builder.put(grammarAccess.getSessionAccess().getGroup_2(), "rule__Session__Group_2__0");
			builder.put(grammarAccess.getRegionAccess().getGroup(), "rule__Region__Group__0");
			builder.put(grammarAccess.getRegionAccess().getGroup_4(), "rule__Region__Group_4__0");
			builder.put(grammarAccess.getFinalStateAccess().getGroup(), "rule__FinalState__Group__0");
			builder.put(grammarAccess.getFinalStateAccess().getGroup_5(), "rule__FinalState__Group_5__0");
			builder.put(grammarAccess.getStateContainerAccess().getGroup_3(), "rule__StateContainer__Group_3__0");
			builder.put(grammarAccess.getStateContainerAccess().getGroup_3_2(), "rule__StateContainer__Group_3_2__0");
			builder.put(grammarAccess.getDataAnalyticsAccess().getGroup(), "rule__DataAnalytics__Group__0");
			builder.put(grammarAccess.getDataAnalyticsAccess().getGroup_4(), "rule__DataAnalytics__Group_4__0");
			builder.put(grammarAccess.getDataAnalyticsAccess().getGroup_5(), "rule__DataAnalytics__Group_5__0");
			builder.put(grammarAccess.getDataAnalyticsAccess().getGroup_6(), "rule__DataAnalytics__Group_6__0");
			builder.put(grammarAccess.getDataAnalyticsAccess().getGroup_7(), "rule__DataAnalytics__Group_7__0");
			builder.put(grammarAccess.getDataAnalyticsAccess().getGroup_8(), "rule__DataAnalytics__Group_8__0");
			builder.put(grammarAccess.getDataAnalyticsAccess().getGroup_8_2(), "rule__DataAnalytics__Group_8_2__0");
			builder.put(grammarAccess.getDataAnalyticsAccess().getGroup_9(), "rule__DataAnalytics__Group_9__0");
			builder.put(grammarAccess.getDataAnalyticsAccess().getGroup_10(), "rule__DataAnalytics__Group_10__0");
			builder.put(grammarAccess.getDataAnalyticsAccess().getGroup_11(), "rule__DataAnalytics__Group_11__0");
			builder.put(grammarAccess.getDataAnalyticsAccess().getGroup_11_2(), "rule__DataAnalytics__Group_11_2__0");
			builder.put(grammarAccess.getPMML_ModelAlgorithmAccess().getGroup(), "rule__PMML_ModelAlgorithm__Group__0");
			builder.put(grammarAccess.getPMML_ModelAlgorithmAccess().getGroup_3(), "rule__PMML_ModelAlgorithm__Group_3__0");
			builder.put(grammarAccess.getPFA_ModelAlgorithmAccess().getGroup(), "rule__PFA_ModelAlgorithm__Group__0");
			builder.put(grammarAccess.getPFA_ModelAlgorithmAccess().getGroup_3(), "rule__PFA_ModelAlgorithm__Group_3__0");
			builder.put(grammarAccess.getDecisionTreeAccess().getGroup(), "rule__DecisionTree__Group__0");
			builder.put(grammarAccess.getDecisionTreeAccess().getGroup_3(), "rule__DecisionTree__Group_3__0");
			builder.put(grammarAccess.getDecisionTreeAccess().getGroup_5(), "rule__DecisionTree__Group_5__0");
			builder.put(grammarAccess.getRandomForestAccess().getGroup(), "rule__RandomForest__Group__0");
			builder.put(grammarAccess.getRandomForestAccess().getGroup_3(), "rule__RandomForest__Group_3__0");
			builder.put(grammarAccess.getRandomForestAccess().getGroup_5(), "rule__RandomForest__Group_5__0");
			builder.put(grammarAccess.getGatedRecurrentUnitsAccess().getGroup(), "rule__GatedRecurrentUnits__Group__0");
			builder.put(grammarAccess.getGatedRecurrentUnitsAccess().getGroup_3(), "rule__GatedRecurrentUnits__Group_3__0");
			builder.put(grammarAccess.getGatedRecurrentUnitsAccess().getGroup_5(), "rule__GatedRecurrentUnits__Group_5__0");
			builder.put(grammarAccess.getGatedRecurrentUnitsAccess().getGroup_7(), "rule__GatedRecurrentUnits__Group_7__0");
			builder.put(grammarAccess.getLongShortTermMemoryAccess().getGroup(), "rule__LongShortTermMemory__Group__0");
			builder.put(grammarAccess.getLongShortTermMemoryAccess().getGroup_3(), "rule__LongShortTermMemory__Group_3__0");
			builder.put(grammarAccess.getLongShortTermMemoryAccess().getGroup_5(), "rule__LongShortTermMemory__Group_5__0");
			builder.put(grammarAccess.getLongShortTermMemoryAccess().getGroup_7(), "rule__LongShortTermMemory__Group_7__0");
			builder.put(grammarAccess.getNN_MultilayerPerceptronAccess().getGroup(), "rule__NN_MultilayerPerceptron__Group__0");
			builder.put(grammarAccess.getNN_MultilayerPerceptronAccess().getGroup_3(), "rule__NN_MultilayerPerceptron__Group_3__0");
			builder.put(grammarAccess.getNN_MultilayerPerceptronAccess().getGroup_5(), "rule__NN_MultilayerPerceptron__Group_5__0");
			builder.put(grammarAccess.getNN_MultilayerPerceptronAccess().getGroup_7(), "rule__NN_MultilayerPerceptron__Group_7__0");
			builder.put(grammarAccess.getNN_MultilayerPerceptronAccess().getGroup_9(), "rule__NN_MultilayerPerceptron__Group_9__0");
			builder.put(grammarAccess.getNN_MultilayerPerceptronAccess().getGroup_11(), "rule__NN_MultilayerPerceptron__Group_11__0");
			builder.put(grammarAccess.getDenoisingAutoencodersAccess().getGroup(), "rule__DenoisingAutoencoders__Group__0");
			builder.put(grammarAccess.getDenoisingAutoencodersAccess().getGroup_3(), "rule__DenoisingAutoencoders__Group_3__0");
			builder.put(grammarAccess.getDenoisingAutoencodersAccess().getGroup_5(), "rule__DenoisingAutoencoders__Group_5__0");
			builder.put(grammarAccess.getDenoisingAutoencodersAccess().getGroup_7(), "rule__DenoisingAutoencoders__Group_7__0");
			builder.put(grammarAccess.getDenoisingAutoencodersAccess().getGroup_9(), "rule__DenoisingAutoencoders__Group_9__0");
			builder.put(grammarAccess.getFactorialHiddenMarkovModelAccess().getGroup(), "rule__FactorialHiddenMarkovModel__Group__0");
			builder.put(grammarAccess.getCombinatorialOptimizationAccess().getGroup(), "rule__CombinatorialOptimization__Group__0");
			builder.put(grammarAccess.getReceiveMessageAccess().getGroup(), "rule__ReceiveMessage__Group__0");
			builder.put(grammarAccess.getReceiveMessageAccess().getGroup_0(), "rule__ReceiveMessage__Group_0__0");
			builder.put(grammarAccess.getActionBlockAccess().getGroup(), "rule__ActionBlock__Group__0");
			builder.put(grammarAccess.getExternStatementAccess().getGroup(), "rule__ExternStatement__Group__0");
			builder.put(grammarAccess.getExternStatementAccess().getGroup_1(), "rule__ExternStatement__Group_1__0");
			builder.put(grammarAccess.getLocalVariableAccess().getGroup(), "rule__LocalVariable__Group__0");
			builder.put(grammarAccess.getLocalVariableAccess().getGroup_5(), "rule__LocalVariable__Group_5__0");
			builder.put(grammarAccess.getSendActionAccess().getGroup(), "rule__SendAction__Group__0");
			builder.put(grammarAccess.getSendActionAccess().getGroup_4(), "rule__SendAction__Group_4__0");
			builder.put(grammarAccess.getSendActionAccess().getGroup_4_1(), "rule__SendAction__Group_4_1__0");
			builder.put(grammarAccess.getVariableAssignmentAccess().getGroup(), "rule__VariableAssignment__Group__0");
			builder.put(grammarAccess.getVariableAssignmentAccess().getGroup_1(), "rule__VariableAssignment__Group_1__0");
			builder.put(grammarAccess.getIncrementAccess().getGroup(), "rule__Increment__Group__0");
			builder.put(grammarAccess.getDecrementAccess().getGroup(), "rule__Decrement__Group__0");
			builder.put(grammarAccess.getForActionAccess().getGroup(), "rule__ForAction__Group__0");
			builder.put(grammarAccess.getForActionAccess().getGroup_3(), "rule__ForAction__Group_3__0");
			builder.put(grammarAccess.getLoopActionAccess().getGroup(), "rule__LoopAction__Group__0");
			builder.put(grammarAccess.getConditionalActionAccess().getGroup(), "rule__ConditionalAction__Group__0");
			builder.put(grammarAccess.getConditionalActionAccess().getGroup_5(), "rule__ConditionalAction__Group_5__0");
			builder.put(grammarAccess.getReturnActionAccess().getGroup(), "rule__ReturnAction__Group__0");
			builder.put(grammarAccess.getPrintActionAccess().getGroup(), "rule__PrintAction__Group__0");
			builder.put(grammarAccess.getPrintActionAccess().getGroup_2(), "rule__PrintAction__Group_2__0");
			builder.put(grammarAccess.getErrorActionAccess().getGroup(), "rule__ErrorAction__Group__0");
			builder.put(grammarAccess.getErrorActionAccess().getGroup_2(), "rule__ErrorAction__Group_2__0");
			builder.put(grammarAccess.getStartSessionAccess().getGroup(), "rule__StartSession__Group__0");
			builder.put(grammarAccess.getFunctionCallStatementAccess().getGroup(), "rule__FunctionCallStatement__Group__0");
			builder.put(grammarAccess.getFunctionCallStatementAccess().getGroup_2(), "rule__FunctionCallStatement__Group_2__0");
			builder.put(grammarAccess.getFunctionCallStatementAccess().getGroup_2_1(), "rule__FunctionCallStatement__Group_2_1__0");
			builder.put(grammarAccess.getDASaveActionAccess().getGroup(), "rule__DASaveAction__Group__0");
			builder.put(grammarAccess.getDAPreprocessActionAccess().getGroup(), "rule__DAPreprocessAction__Group__0");
			builder.put(grammarAccess.getDATrainActionAccess().getGroup(), "rule__DATrainAction__Group__0");
			builder.put(grammarAccess.getDAPredictActionAccess().getGroup(), "rule__DAPredictAction__Group__0");
			builder.put(grammarAccess.getDAPredictActionAccess().getGroup_4(), "rule__DAPredictAction__Group_4__0");
			builder.put(grammarAccess.getOrExpressionAccess().getGroup(), "rule__OrExpression__Group__0");
			builder.put(grammarAccess.getOrExpressionAccess().getGroup_1(), "rule__OrExpression__Group_1__0");
			builder.put(grammarAccess.getAndExpressionAccess().getGroup(), "rule__AndExpression__Group__0");
			builder.put(grammarAccess.getAndExpressionAccess().getGroup_1(), "rule__AndExpression__Group_1__0");
			builder.put(grammarAccess.getEqualityAccess().getGroup(), "rule__Equality__Group__0");
			builder.put(grammarAccess.getEqualityAccess().getGroup_1_0(), "rule__Equality__Group_1_0__0");
			builder.put(grammarAccess.getEqualityAccess().getGroup_1_1(), "rule__Equality__Group_1_1__0");
			builder.put(grammarAccess.getComparaisonAccess().getGroup(), "rule__Comparaison__Group__0");
			builder.put(grammarAccess.getComparaisonAccess().getGroup_1_0(), "rule__Comparaison__Group_1_0__0");
			builder.put(grammarAccess.getComparaisonAccess().getGroup_1_1(), "rule__Comparaison__Group_1_1__0");
			builder.put(grammarAccess.getComparaisonAccess().getGroup_1_2(), "rule__Comparaison__Group_1_2__0");
			builder.put(grammarAccess.getComparaisonAccess().getGroup_1_3(), "rule__Comparaison__Group_1_3__0");
			builder.put(grammarAccess.getAdditionAccess().getGroup(), "rule__Addition__Group__0");
			builder.put(grammarAccess.getAdditionAccess().getGroup_1_0(), "rule__Addition__Group_1_0__0");
			builder.put(grammarAccess.getAdditionAccess().getGroup_1_1(), "rule__Addition__Group_1_1__0");
			builder.put(grammarAccess.getMultiplicationAccess().getGroup(), "rule__Multiplication__Group__0");
			builder.put(grammarAccess.getMultiplicationAccess().getGroup_1_0(), "rule__Multiplication__Group_1_0__0");
			builder.put(grammarAccess.getMultiplicationAccess().getGroup_1_1(), "rule__Multiplication__Group_1_1__0");
			builder.put(grammarAccess.getMultiplicationAccess().getGroup_1_2(), "rule__Multiplication__Group_1_2__0");
			builder.put(grammarAccess.getCastExpressionAccess().getGroup(), "rule__CastExpression__Group__0");
			builder.put(grammarAccess.getCastExpressionAccess().getGroup_1(), "rule__CastExpression__Group_1__0");
			builder.put(grammarAccess.getCastExpressionAccess().getGroup_1_3(), "rule__CastExpression__Group_1_3__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_0(), "rule__Primary__Group_0__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_1(), "rule__Primary__Group_1__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_2(), "rule__Primary__Group_2__0");
			builder.put(grammarAccess.getArrayIndexPostfixAccess().getGroup(), "rule__ArrayIndexPostfix__Group__0");
			builder.put(grammarAccess.getArrayIndexPostfixAccess().getGroup_1(), "rule__ArrayIndexPostfix__Group_1__0");
			builder.put(grammarAccess.getExternExpressionAccess().getGroup(), "rule__ExternExpression__Group__0");
			builder.put(grammarAccess.getExternExpressionAccess().getGroup_1(), "rule__ExternExpression__Group_1__0");
			builder.put(grammarAccess.getArrayInitAccess().getGroup(), "rule__ArrayInit__Group__0");
			builder.put(grammarAccess.getArrayInitAccess().getGroup_2(), "rule__ArrayInit__Group_2__0");
			builder.put(grammarAccess.getEnumLiteralRefAccess().getGroup(), "rule__EnumLiteralRef__Group__0");
			builder.put(grammarAccess.getBooleanLiteralAccess().getGroup_1(), "rule__BooleanLiteral__Group_1__0");
			builder.put(grammarAccess.getEventReferenceAccess().getGroup(), "rule__EventReference__Group__0");
			builder.put(grammarAccess.getFunctionCallExpressionAccess().getGroup(), "rule__FunctionCallExpression__Group__0");
			builder.put(grammarAccess.getFunctionCallExpressionAccess().getGroup_2(), "rule__FunctionCallExpression__Group_2__0");
			builder.put(grammarAccess.getFunctionCallExpressionAccess().getGroup_2_1(), "rule__FunctionCallExpression__Group_2_1__0");
			builder.put(grammarAccess.getConfigurationAccess().getGroup(), "rule__Configuration__Group__0");
			builder.put(grammarAccess.getInstanceAccess().getGroup(), "rule__Instance__Group__0");
			builder.put(grammarAccess.getConfigPropertyAssignAccess().getGroup(), "rule__ConfigPropertyAssign__Group__0");
			builder.put(grammarAccess.getConfigPropertyAssignAccess().getGroup_4(), "rule__ConfigPropertyAssign__Group_4__0");
			builder.put(grammarAccess.getConnectorAccess().getGroup(), "rule__Connector__Group__0");
			builder.put(grammarAccess.getExternalConnectorAccess().getGroup(), "rule__ExternalConnector__Group__0");
			builder.put(grammarAccess.getThingMLModelAccess().getImportsAssignment_0(), "rule__ThingMLModel__ImportsAssignment_0");
			builder.put(grammarAccess.getThingMLModelAccess().getTypesAssignment_1_0(), "rule__ThingMLModel__TypesAssignment_1_0");
			builder.put(grammarAccess.getThingMLModelAccess().getProtocolsAssignment_1_1(), "rule__ThingMLModel__ProtocolsAssignment_1_1");
			builder.put(grammarAccess.getThingMLModelAccess().getConfigsAssignment_1_2(), "rule__ThingMLModel__ConfigsAssignment_1_2");
			builder.put(grammarAccess.getImportAccess().getImportURIAssignment_1(), "rule__Import__ImportURIAssignment_1");
			builder.put(grammarAccess.getImportAccess().getFromAssignment_2_1(), "rule__Import__FromAssignment_2_1");
			builder.put(grammarAccess.getPlatformAnnotationAccess().getNameAssignment_0(), "rule__PlatformAnnotation__NameAssignment_0");
			builder.put(grammarAccess.getPlatformAnnotationAccess().getValueAssignment_1_0(), "rule__PlatformAnnotation__ValueAssignment_1_0");
			builder.put(grammarAccess.getPlatformAnnotationAccess().getValueAssignment_1_1(), "rule__PlatformAnnotation__ValueAssignment_1_1");
			builder.put(grammarAccess.getNamedElementAccess().getNameAssignment_16_1(), "rule__NamedElement__NameAssignment_16_1");
			builder.put(grammarAccess.getAnnotatedElementAccess().getAnnotationsAssignment_16_1(), "rule__AnnotatedElement__AnnotationsAssignment_16_1");
			builder.put(grammarAccess.getVariableAccess().getNameAssignment_0_1(), "rule__Variable__NameAssignment_0_1");
			builder.put(grammarAccess.getVariableAccess().getTypeRefAssignment_0_3(), "rule__Variable__TypeRefAssignment_0_3");
			builder.put(grammarAccess.getTypeRefAccess().getTypeAssignment_0(), "rule__TypeRef__TypeAssignment_0");
			builder.put(grammarAccess.getTypeRefAccess().getIsArrayAssignment_1_0(), "rule__TypeRef__IsArrayAssignment_1_0");
			builder.put(grammarAccess.getTypeRefAccess().getCardinalityAssignment_1_1(), "rule__TypeRef__CardinalityAssignment_1_1");
			builder.put(grammarAccess.getPrimitiveTypeAccess().getNameAssignment_1(), "rule__PrimitiveType__NameAssignment_1");
			builder.put(grammarAccess.getPrimitiveTypeAccess().getByteSizeAssignment_3(), "rule__PrimitiveType__ByteSizeAssignment_3");
			builder.put(grammarAccess.getPrimitiveTypeAccess().getAnnotationsAssignment_5(), "rule__PrimitiveType__AnnotationsAssignment_5");
			builder.put(grammarAccess.getObjectTypeAccess().getNameAssignment_1(), "rule__ObjectType__NameAssignment_1");
			builder.put(grammarAccess.getObjectTypeAccess().getAnnotationsAssignment_2(), "rule__ObjectType__AnnotationsAssignment_2");
			builder.put(grammarAccess.getEnumerationAccess().getNameAssignment_1(), "rule__Enumeration__NameAssignment_1");
			builder.put(grammarAccess.getEnumerationAccess().getTypeRefAssignment_2_1(), "rule__Enumeration__TypeRefAssignment_2_1");
			builder.put(grammarAccess.getEnumerationAccess().getAnnotationsAssignment_3(), "rule__Enumeration__AnnotationsAssignment_3");
			builder.put(grammarAccess.getEnumerationAccess().getLiteralsAssignment_5(), "rule__Enumeration__LiteralsAssignment_5");
			builder.put(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0(), "rule__EnumerationLiteral__NameAssignment_0");
			builder.put(grammarAccess.getEnumerationLiteralAccess().getInitAssignment_1_1(), "rule__EnumerationLiteral__InitAssignment_1_1");
			builder.put(grammarAccess.getEnumerationLiteralAccess().getAnnotationsAssignment_2(), "rule__EnumerationLiteral__AnnotationsAssignment_2");
			builder.put(grammarAccess.getThingAccess().getFragmentAssignment_1(), "rule__Thing__FragmentAssignment_1");
			builder.put(grammarAccess.getThingAccess().getNameAssignment_2(), "rule__Thing__NameAssignment_2");
			builder.put(grammarAccess.getThingAccess().getIncludesAssignment_3_1(), "rule__Thing__IncludesAssignment_3_1");
			builder.put(grammarAccess.getThingAccess().getIncludesAssignment_3_2_1(), "rule__Thing__IncludesAssignment_3_2_1");
			builder.put(grammarAccess.getThingAccess().getAnnotationsAssignment_4(), "rule__Thing__AnnotationsAssignment_4");
			builder.put(grammarAccess.getThingAccess().getMessagesAssignment_6_0(), "rule__Thing__MessagesAssignment_6_0");
			builder.put(grammarAccess.getThingAccess().getPortsAssignment_6_1(), "rule__Thing__PortsAssignment_6_1");
			builder.put(grammarAccess.getThingAccess().getPropertiesAssignment_6_2(), "rule__Thing__PropertiesAssignment_6_2");
			builder.put(grammarAccess.getThingAccess().getFunctionsAssignment_6_3(), "rule__Thing__FunctionsAssignment_6_3");
			builder.put(grammarAccess.getThingAccess().getAssignAssignment_6_4(), "rule__Thing__AssignAssignment_6_4");
			builder.put(grammarAccess.getThingAccess().getDataAnalyticsAssignment_7(), "rule__Thing__DataAnalyticsAssignment_7");
			builder.put(grammarAccess.getThingAccess().getBehaviourAssignment_8(), "rule__Thing__BehaviourAssignment_8");
			builder.put(grammarAccess.getPropertyAssignAccess().getPropertyAssignment_1(), "rule__PropertyAssign__PropertyAssignment_1");
			builder.put(grammarAccess.getPropertyAssignAccess().getIndexAssignment_2_1(), "rule__PropertyAssign__IndexAssignment_2_1");
			builder.put(grammarAccess.getPropertyAssignAccess().getInitAssignment_4(), "rule__PropertyAssign__InitAssignment_4");
			builder.put(grammarAccess.getPropertyAssignAccess().getAnnotationsAssignment_5(), "rule__PropertyAssign__AnnotationsAssignment_5");
			builder.put(grammarAccess.getProtocolAccess().getNameAssignment_1(), "rule__Protocol__NameAssignment_1");
			builder.put(grammarAccess.getProtocolAccess().getAnnotationsAssignment_2(), "rule__Protocol__AnnotationsAssignment_2");
			builder.put(grammarAccess.getFunctionAccess().getNameAssignment_0_1(), "rule__Function__NameAssignment_0_1");
			builder.put(grammarAccess.getFunctionAccess().getParametersAssignment_0_3_0(), "rule__Function__ParametersAssignment_0_3_0");
			builder.put(grammarAccess.getFunctionAccess().getParametersAssignment_0_3_1_1(), "rule__Function__ParametersAssignment_0_3_1_1");
			builder.put(grammarAccess.getFunctionAccess().getTypeRefAssignment_0_5_1(), "rule__Function__TypeRefAssignment_0_5_1");
			builder.put(grammarAccess.getFunctionAccess().getAnnotationsAssignment_0_6(), "rule__Function__AnnotationsAssignment_0_6");
			builder.put(grammarAccess.getFunctionAccess().getBodyAssignment_0_7(), "rule__Function__BodyAssignment_0_7");
			builder.put(grammarAccess.getAbstractFunctionAccess().getAbstractAssignment_0(), "rule__AbstractFunction__AbstractAssignment_0");
			builder.put(grammarAccess.getAbstractFunctionAccess().getNameAssignment_2(), "rule__AbstractFunction__NameAssignment_2");
			builder.put(grammarAccess.getAbstractFunctionAccess().getParametersAssignment_4_0(), "rule__AbstractFunction__ParametersAssignment_4_0");
			builder.put(grammarAccess.getAbstractFunctionAccess().getParametersAssignment_4_1_1(), "rule__AbstractFunction__ParametersAssignment_4_1_1");
			builder.put(grammarAccess.getAbstractFunctionAccess().getTypeRefAssignment_6_1(), "rule__AbstractFunction__TypeRefAssignment_6_1");
			builder.put(grammarAccess.getAbstractFunctionAccess().getAnnotationsAssignment_7(), "rule__AbstractFunction__AnnotationsAssignment_7");
			builder.put(grammarAccess.getPropertyAccess().getReadonlyAssignment_0(), "rule__Property__ReadonlyAssignment_0");
			builder.put(grammarAccess.getPropertyAccess().getNameAssignment_2(), "rule__Property__NameAssignment_2");
			builder.put(grammarAccess.getPropertyAccess().getTypeRefAssignment_4(), "rule__Property__TypeRefAssignment_4");
			builder.put(grammarAccess.getPropertyAccess().getInitAssignment_5_1(), "rule__Property__InitAssignment_5_1");
			builder.put(grammarAccess.getPropertyAccess().getAnnotationsAssignment_6(), "rule__Property__AnnotationsAssignment_6");
			builder.put(grammarAccess.getMessageAccess().getNameAssignment_1(), "rule__Message__NameAssignment_1");
			builder.put(grammarAccess.getMessageAccess().getParametersAssignment_3_0(), "rule__Message__ParametersAssignment_3_0");
			builder.put(grammarAccess.getMessageAccess().getParametersAssignment_3_1_1(), "rule__Message__ParametersAssignment_3_1_1");
			builder.put(grammarAccess.getMessageAccess().getAnnotationsAssignment_5(), "rule__Message__AnnotationsAssignment_5");
			builder.put(grammarAccess.getParameterAccess().getNameAssignment_0(), "rule__Parameter__NameAssignment_0");
			builder.put(grammarAccess.getParameterAccess().getTypeRefAssignment_2(), "rule__Parameter__TypeRefAssignment_2");
			builder.put(grammarAccess.getParameterAccess().getAnnotationsAssignment_3(), "rule__Parameter__AnnotationsAssignment_3");
			builder.put(grammarAccess.getRequiredPortAccess().getOptionalAssignment_0(), "rule__RequiredPort__OptionalAssignment_0");
			builder.put(grammarAccess.getRequiredPortAccess().getNameAssignment_3(), "rule__RequiredPort__NameAssignment_3");
			builder.put(grammarAccess.getRequiredPortAccess().getAnnotationsAssignment_4(), "rule__RequiredPort__AnnotationsAssignment_4");
			builder.put(grammarAccess.getRequiredPortAccess().getSendsAssignment_6_0_1(), "rule__RequiredPort__SendsAssignment_6_0_1");
			builder.put(grammarAccess.getRequiredPortAccess().getSendsAssignment_6_0_2_1(), "rule__RequiredPort__SendsAssignment_6_0_2_1");
			builder.put(grammarAccess.getRequiredPortAccess().getReceivesAssignment_6_1_1(), "rule__RequiredPort__ReceivesAssignment_6_1_1");
			builder.put(grammarAccess.getRequiredPortAccess().getReceivesAssignment_6_1_2_1(), "rule__RequiredPort__ReceivesAssignment_6_1_2_1");
			builder.put(grammarAccess.getProvidedPortAccess().getNameAssignment_2(), "rule__ProvidedPort__NameAssignment_2");
			builder.put(grammarAccess.getProvidedPortAccess().getAnnotationsAssignment_3(), "rule__ProvidedPort__AnnotationsAssignment_3");
			builder.put(grammarAccess.getProvidedPortAccess().getSendsAssignment_5_0_1(), "rule__ProvidedPort__SendsAssignment_5_0_1");
			builder.put(grammarAccess.getProvidedPortAccess().getSendsAssignment_5_0_2_1(), "rule__ProvidedPort__SendsAssignment_5_0_2_1");
			builder.put(grammarAccess.getProvidedPortAccess().getReceivesAssignment_5_1_1(), "rule__ProvidedPort__ReceivesAssignment_5_1_1");
			builder.put(grammarAccess.getProvidedPortAccess().getReceivesAssignment_5_1_2_1(), "rule__ProvidedPort__ReceivesAssignment_5_1_2_1");
			builder.put(grammarAccess.getInternalPortAccess().getNameAssignment_2(), "rule__InternalPort__NameAssignment_2");
			builder.put(grammarAccess.getInternalPortAccess().getAnnotationsAssignment_3(), "rule__InternalPort__AnnotationsAssignment_3");
			builder.put(grammarAccess.getInternalPortAccess().getSendsAssignment_5_0_1(), "rule__InternalPort__SendsAssignment_5_0_1");
			builder.put(grammarAccess.getInternalPortAccess().getSendsAssignment_5_0_2_1(), "rule__InternalPort__SendsAssignment_5_0_2_1");
			builder.put(grammarAccess.getInternalPortAccess().getReceivesAssignment_5_1_1(), "rule__InternalPort__ReceivesAssignment_5_1_1");
			builder.put(grammarAccess.getInternalPortAccess().getReceivesAssignment_5_1_2_1(), "rule__InternalPort__ReceivesAssignment_5_1_2_1");
			builder.put(grammarAccess.getStateAccess().getNameAssignment_3_1(), "rule__State__NameAssignment_3_1");
			builder.put(grammarAccess.getStateAccess().getAnnotationsAssignment_3_2(), "rule__State__AnnotationsAssignment_3_2");
			builder.put(grammarAccess.getStateAccess().getPropertiesAssignment_3_4(), "rule__State__PropertiesAssignment_3_4");
			builder.put(grammarAccess.getStateAccess().getEntryAssignment_3_5_0_2(), "rule__State__EntryAssignment_3_5_0_2");
			builder.put(grammarAccess.getStateAccess().getExitAssignment_3_5_1_2(), "rule__State__ExitAssignment_3_5_1_2");
			builder.put(grammarAccess.getStateAccess().getPropertiesAssignment_3_5_2_0(), "rule__State__PropertiesAssignment_3_5_2_0");
			builder.put(grammarAccess.getStateAccess().getInternalAssignment_3_5_2_1(), "rule__State__InternalAssignment_3_5_2_1");
			builder.put(grammarAccess.getStateAccess().getOutgoingAssignment_3_5_2_2(), "rule__State__OutgoingAssignment_3_5_2_2");
			builder.put(grammarAccess.getTransitionAccess().getNameAssignment_1(), "rule__Transition__NameAssignment_1");
			builder.put(grammarAccess.getTransitionAccess().getTargetAssignment_3(), "rule__Transition__TargetAssignment_3");
			builder.put(grammarAccess.getTransitionAccess().getAnnotationsAssignment_4(), "rule__Transition__AnnotationsAssignment_4");
			builder.put(grammarAccess.getTransitionAccess().getEventAssignment_5_1(), "rule__Transition__EventAssignment_5_1");
			builder.put(grammarAccess.getTransitionAccess().getGuardAssignment_6_1(), "rule__Transition__GuardAssignment_6_1");
			builder.put(grammarAccess.getTransitionAccess().getActionAssignment_7_1(), "rule__Transition__ActionAssignment_7_1");
			builder.put(grammarAccess.getInternalTransitionAccess().getNameAssignment_2(), "rule__InternalTransition__NameAssignment_2");
			builder.put(grammarAccess.getInternalTransitionAccess().getAnnotationsAssignment_3(), "rule__InternalTransition__AnnotationsAssignment_3");
			builder.put(grammarAccess.getInternalTransitionAccess().getEventAssignment_4_1(), "rule__InternalTransition__EventAssignment_4_1");
			builder.put(grammarAccess.getInternalTransitionAccess().getGuardAssignment_5_1(), "rule__InternalTransition__GuardAssignment_5_1");
			builder.put(grammarAccess.getInternalTransitionAccess().getActionAssignment_6_1(), "rule__InternalTransition__ActionAssignment_6_1");
			builder.put(grammarAccess.getCompositeStateAccess().getNameAssignment_2(), "rule__CompositeState__NameAssignment_2");
			builder.put(grammarAccess.getCompositeStateAccess().getInitialAssignment_4(), "rule__CompositeState__InitialAssignment_4");
			builder.put(grammarAccess.getCompositeStateAccess().getHistoryAssignment_5_1(), "rule__CompositeState__HistoryAssignment_5_1");
			builder.put(grammarAccess.getCompositeStateAccess().getAnnotationsAssignment_6(), "rule__CompositeState__AnnotationsAssignment_6");
			builder.put(grammarAccess.getCompositeStateAccess().getPropertiesAssignment_8(), "rule__CompositeState__PropertiesAssignment_8");
			builder.put(grammarAccess.getCompositeStateAccess().getEntryAssignment_9_0_2(), "rule__CompositeState__EntryAssignment_9_0_2");
			builder.put(grammarAccess.getCompositeStateAccess().getExitAssignment_9_1_2(), "rule__CompositeState__ExitAssignment_9_1_2");
			builder.put(grammarAccess.getCompositeStateAccess().getPropertiesAssignment_9_2_0(), "rule__CompositeState__PropertiesAssignment_9_2_0");
			builder.put(grammarAccess.getCompositeStateAccess().getSubstateAssignment_9_2_1(), "rule__CompositeState__SubstateAssignment_9_2_1");
			builder.put(grammarAccess.getCompositeStateAccess().getInternalAssignment_9_2_2(), "rule__CompositeState__InternalAssignment_9_2_2");
			builder.put(grammarAccess.getCompositeStateAccess().getOutgoingAssignment_9_2_3(), "rule__CompositeState__OutgoingAssignment_9_2_3");
			builder.put(grammarAccess.getCompositeStateAccess().getRegionAssignment_10_0(), "rule__CompositeState__RegionAssignment_10_0");
			builder.put(grammarAccess.getCompositeStateAccess().getSessionAssignment_10_1(), "rule__CompositeState__SessionAssignment_10_1");
			builder.put(grammarAccess.getStateMachineAccess().getNameAssignment_1(), "rule__StateMachine__NameAssignment_1");
			builder.put(grammarAccess.getStateMachineAccess().getInitialAssignment_3(), "rule__StateMachine__InitialAssignment_3");
			builder.put(grammarAccess.getStateMachineAccess().getHistoryAssignment_4_1(), "rule__StateMachine__HistoryAssignment_4_1");
			builder.put(grammarAccess.getStateMachineAccess().getAnnotationsAssignment_5(), "rule__StateMachine__AnnotationsAssignment_5");
			builder.put(grammarAccess.getStateMachineAccess().getPropertiesAssignment_7(), "rule__StateMachine__PropertiesAssignment_7");
			builder.put(grammarAccess.getStateMachineAccess().getEntryAssignment_8_0_2(), "rule__StateMachine__EntryAssignment_8_0_2");
			builder.put(grammarAccess.getStateMachineAccess().getExitAssignment_8_1_2(), "rule__StateMachine__ExitAssignment_8_1_2");
			builder.put(grammarAccess.getStateMachineAccess().getPropertiesAssignment_8_2_0(), "rule__StateMachine__PropertiesAssignment_8_2_0");
			builder.put(grammarAccess.getStateMachineAccess().getSubstateAssignment_8_2_1(), "rule__StateMachine__SubstateAssignment_8_2_1");
			builder.put(grammarAccess.getStateMachineAccess().getInternalAssignment_8_2_2(), "rule__StateMachine__InternalAssignment_8_2_2");
			builder.put(grammarAccess.getStateMachineAccess().getRegionAssignment_9_0(), "rule__StateMachine__RegionAssignment_9_0");
			builder.put(grammarAccess.getStateMachineAccess().getSessionAssignment_9_1(), "rule__StateMachine__SessionAssignment_9_1");
			builder.put(grammarAccess.getSessionAccess().getNameAssignment_1(), "rule__Session__NameAssignment_1");
			builder.put(grammarAccess.getSessionAccess().getMaxInstancesAssignment_2_1(), "rule__Session__MaxInstancesAssignment_2_1");
			builder.put(grammarAccess.getSessionAccess().getInitialAssignment_4(), "rule__Session__InitialAssignment_4");
			builder.put(grammarAccess.getSessionAccess().getAnnotationsAssignment_5(), "rule__Session__AnnotationsAssignment_5");
			builder.put(grammarAccess.getSessionAccess().getSubstateAssignment_7(), "rule__Session__SubstateAssignment_7");
			builder.put(grammarAccess.getRegionAccess().getNameAssignment_1(), "rule__Region__NameAssignment_1");
			builder.put(grammarAccess.getRegionAccess().getInitialAssignment_3(), "rule__Region__InitialAssignment_3");
			builder.put(grammarAccess.getRegionAccess().getHistoryAssignment_4_1(), "rule__Region__HistoryAssignment_4_1");
			builder.put(grammarAccess.getRegionAccess().getAnnotationsAssignment_5(), "rule__Region__AnnotationsAssignment_5");
			builder.put(grammarAccess.getRegionAccess().getSubstateAssignment_7(), "rule__Region__SubstateAssignment_7");
			builder.put(grammarAccess.getFinalStateAccess().getNameAssignment_2(), "rule__FinalState__NameAssignment_2");
			builder.put(grammarAccess.getFinalStateAccess().getAnnotationsAssignment_3(), "rule__FinalState__AnnotationsAssignment_3");
			builder.put(grammarAccess.getFinalStateAccess().getEntryAssignment_5_2(), "rule__FinalState__EntryAssignment_5_2");
			builder.put(grammarAccess.getStateContainerAccess().getInitialAssignment_3_1(), "rule__StateContainer__InitialAssignment_3_1");
			builder.put(grammarAccess.getStateContainerAccess().getHistoryAssignment_3_2_1(), "rule__StateContainer__HistoryAssignment_3_2_1");
			builder.put(grammarAccess.getStateContainerAccess().getSubstateAssignment_3_4(), "rule__StateContainer__SubstateAssignment_3_4");
			builder.put(grammarAccess.getDataAnalyticsAccess().getNameAssignment_1(), "rule__DataAnalytics__NameAssignment_1");
			builder.put(grammarAccess.getDataAnalyticsAccess().getAnnotationsAssignment_2(), "rule__DataAnalytics__AnnotationsAssignment_2");
			builder.put(grammarAccess.getDataAnalyticsAccess().getDatasetAssignment_4_1(), "rule__DataAnalytics__DatasetAssignment_4_1");
			builder.put(grammarAccess.getDataAnalyticsAccess().getSequentialAssignment_5_1(), "rule__DataAnalytics__SequentialAssignment_5_1");
			builder.put(grammarAccess.getDataAnalyticsAccess().getTimestampsAssignment_6_1(), "rule__DataAnalytics__TimestampsAssignment_6_1");
			builder.put(grammarAccess.getDataAnalyticsAccess().getLabelsAssignment_7_1(), "rule__DataAnalytics__LabelsAssignment_7_1");
			builder.put(grammarAccess.getDataAnalyticsAccess().getFeaturesAssignment_8_1(), "rule__DataAnalytics__FeaturesAssignment_8_1");
			builder.put(grammarAccess.getDataAnalyticsAccess().getFeaturesAssignment_8_2_1(), "rule__DataAnalytics__FeaturesAssignment_8_2_1");
			builder.put(grammarAccess.getDataAnalyticsAccess().getModelAlgorithmAssignment_9_1(), "rule__DataAnalytics__ModelAlgorithmAssignment_9_1");
			builder.put(grammarAccess.getDataAnalyticsAccess().getTrainingResultsAssignment_10_1(), "rule__DataAnalytics__TrainingResultsAssignment_10_1");
			builder.put(grammarAccess.getDataAnalyticsAccess().getPredictionResultsAssignment_11_1(), "rule__DataAnalytics__PredictionResultsAssignment_11_1");
			builder.put(grammarAccess.getDataAnalyticsAccess().getPredictionResultsAssignment_11_2_1(), "rule__DataAnalytics__PredictionResultsAssignment_11_2_1");
			builder.put(grammarAccess.getPMML_ModelAlgorithmAccess().getNameAssignment_1(), "rule__PMML_ModelAlgorithm__NameAssignment_1");
			builder.put(grammarAccess.getPMML_ModelAlgorithmAccess().getPmml_pathAssignment_3_1(), "rule__PMML_ModelAlgorithm__Pmml_pathAssignment_3_1");
			builder.put(grammarAccess.getPFA_ModelAlgorithmAccess().getNameAssignment_1(), "rule__PFA_ModelAlgorithm__NameAssignment_1");
			builder.put(grammarAccess.getPFA_ModelAlgorithmAccess().getPfa_pathAssignment_3_1(), "rule__PFA_ModelAlgorithm__Pfa_pathAssignment_3_1");
			builder.put(grammarAccess.getDecisionTreeAccess().getNameAssignment_1(), "rule__DecisionTree__NameAssignment_1");
			builder.put(grammarAccess.getDecisionTreeAccess().getLossFunctionAssignment_3_1(), "rule__DecisionTree__LossFunctionAssignment_3_1");
			builder.put(grammarAccess.getDecisionTreeAccess().getMin_samples_splitAssignment_5_1(), "rule__DecisionTree__Min_samples_splitAssignment_5_1");
			builder.put(grammarAccess.getRandomForestAccess().getNameAssignment_1(), "rule__RandomForest__NameAssignment_1");
			builder.put(grammarAccess.getRandomForestAccess().getLossFunctionAssignment_3_1(), "rule__RandomForest__LossFunctionAssignment_3_1");
			builder.put(grammarAccess.getRandomForestAccess().getMin_samples_splitAssignment_5_1(), "rule__RandomForest__Min_samples_splitAssignment_5_1");
			builder.put(grammarAccess.getGatedRecurrentUnitsAccess().getNameAssignment_1(), "rule__GatedRecurrentUnits__NameAssignment_1");
			builder.put(grammarAccess.getGatedRecurrentUnitsAccess().getLoss_functionAssignment_3_1(), "rule__GatedRecurrentUnits__Loss_functionAssignment_3_1");
			builder.put(grammarAccess.getGatedRecurrentUnitsAccess().getOptimizerAssignment_5_1(), "rule__GatedRecurrentUnits__OptimizerAssignment_5_1");
			builder.put(grammarAccess.getGatedRecurrentUnitsAccess().getLearning_rateAssignment_7_1(), "rule__GatedRecurrentUnits__Learning_rateAssignment_7_1");
			builder.put(grammarAccess.getLongShortTermMemoryAccess().getNameAssignment_1(), "rule__LongShortTermMemory__NameAssignment_1");
			builder.put(grammarAccess.getLongShortTermMemoryAccess().getLoss_functionAssignment_3_1(), "rule__LongShortTermMemory__Loss_functionAssignment_3_1");
			builder.put(grammarAccess.getLongShortTermMemoryAccess().getOptimizerAssignment_5_1(), "rule__LongShortTermMemory__OptimizerAssignment_5_1");
			builder.put(grammarAccess.getLongShortTermMemoryAccess().getLearning_rateAssignment_7_1(), "rule__LongShortTermMemory__Learning_rateAssignment_7_1");
			builder.put(grammarAccess.getNN_MultilayerPerceptronAccess().getNameAssignment_1(), "rule__NN_MultilayerPerceptron__NameAssignment_1");
			builder.put(grammarAccess.getNN_MultilayerPerceptronAccess().getLoss_functionAssignment_3_1(), "rule__NN_MultilayerPerceptron__Loss_functionAssignment_3_1");
			builder.put(grammarAccess.getNN_MultilayerPerceptronAccess().getOptimizerAssignment_5_1(), "rule__NN_MultilayerPerceptron__OptimizerAssignment_5_1");
			builder.put(grammarAccess.getNN_MultilayerPerceptronAccess().getLearning_rateAssignment_7_1(), "rule__NN_MultilayerPerceptron__Learning_rateAssignment_7_1");
			builder.put(grammarAccess.getNN_MultilayerPerceptronAccess().getNo_layersAssignment_9_1(), "rule__NN_MultilayerPerceptron__No_layersAssignment_9_1");
			builder.put(grammarAccess.getNN_MultilayerPerceptronAccess().getDropout_probabilityAssignment_11_1(), "rule__NN_MultilayerPerceptron__Dropout_probabilityAssignment_11_1");
			builder.put(grammarAccess.getDenoisingAutoencodersAccess().getNameAssignment_1(), "rule__DenoisingAutoencoders__NameAssignment_1");
			builder.put(grammarAccess.getDenoisingAutoencodersAccess().getLoss_functionAssignment_3_1(), "rule__DenoisingAutoencoders__Loss_functionAssignment_3_1");
			builder.put(grammarAccess.getDenoisingAutoencodersAccess().getOptimizerAssignment_5_1(), "rule__DenoisingAutoencoders__OptimizerAssignment_5_1");
			builder.put(grammarAccess.getDenoisingAutoencodersAccess().getLearning_rateAssignment_7_1(), "rule__DenoisingAutoencoders__Learning_rateAssignment_7_1");
			builder.put(grammarAccess.getDenoisingAutoencodersAccess().getSequence_lengthAssignment_9_1(), "rule__DenoisingAutoencoders__Sequence_lengthAssignment_9_1");
			builder.put(grammarAccess.getFactorialHiddenMarkovModelAccess().getNameAssignment_1(), "rule__FactorialHiddenMarkovModel__NameAssignment_1");
			builder.put(grammarAccess.getCombinatorialOptimizationAccess().getNameAssignment_1(), "rule__CombinatorialOptimization__NameAssignment_1");
			builder.put(grammarAccess.getReceiveMessageAccess().getNameAssignment_0_0(), "rule__ReceiveMessage__NameAssignment_0_0");
			builder.put(grammarAccess.getReceiveMessageAccess().getPortAssignment_1(), "rule__ReceiveMessage__PortAssignment_1");
			builder.put(grammarAccess.getReceiveMessageAccess().getMessageAssignment_3(), "rule__ReceiveMessage__MessageAssignment_3");
			builder.put(grammarAccess.getActionBlockAccess().getActionsAssignment_2(), "rule__ActionBlock__ActionsAssignment_2");
			builder.put(grammarAccess.getExternStatementAccess().getStatementAssignment_0(), "rule__ExternStatement__StatementAssignment_0");
			builder.put(grammarAccess.getExternStatementAccess().getSegmentsAssignment_1_1(), "rule__ExternStatement__SegmentsAssignment_1_1");
			builder.put(grammarAccess.getLocalVariableAccess().getReadonlyAssignment_0(), "rule__LocalVariable__ReadonlyAssignment_0");
			builder.put(grammarAccess.getLocalVariableAccess().getNameAssignment_2(), "rule__LocalVariable__NameAssignment_2");
			builder.put(grammarAccess.getLocalVariableAccess().getTypeRefAssignment_4(), "rule__LocalVariable__TypeRefAssignment_4");
			builder.put(grammarAccess.getLocalVariableAccess().getInitAssignment_5_1(), "rule__LocalVariable__InitAssignment_5_1");
			builder.put(grammarAccess.getLocalVariableAccess().getAnnotationsAssignment_6(), "rule__LocalVariable__AnnotationsAssignment_6");
			builder.put(grammarAccess.getSendActionAccess().getPortAssignment_0(), "rule__SendAction__PortAssignment_0");
			builder.put(grammarAccess.getSendActionAccess().getMessageAssignment_2(), "rule__SendAction__MessageAssignment_2");
			builder.put(grammarAccess.getSendActionAccess().getParametersAssignment_4_0(), "rule__SendAction__ParametersAssignment_4_0");
			builder.put(grammarAccess.getSendActionAccess().getParametersAssignment_4_1_1(), "rule__SendAction__ParametersAssignment_4_1_1");
			builder.put(grammarAccess.getVariableAssignmentAccess().getPropertyAssignment_0(), "rule__VariableAssignment__PropertyAssignment_0");
			builder.put(grammarAccess.getVariableAssignmentAccess().getIndexAssignment_1_1(), "rule__VariableAssignment__IndexAssignment_1_1");
			builder.put(grammarAccess.getVariableAssignmentAccess().getExpressionAssignment_3(), "rule__VariableAssignment__ExpressionAssignment_3");
			builder.put(grammarAccess.getIncrementAccess().getVarAssignment_0(), "rule__Increment__VarAssignment_0");
			builder.put(grammarAccess.getDecrementAccess().getVarAssignment_0(), "rule__Decrement__VarAssignment_0");
			builder.put(grammarAccess.getForActionAccess().getVariableAssignment_2(), "rule__ForAction__VariableAssignment_2");
			builder.put(grammarAccess.getForActionAccess().getIndexAssignment_3_1(), "rule__ForAction__IndexAssignment_3_1");
			builder.put(grammarAccess.getForActionAccess().getArrayAssignment_5(), "rule__ForAction__ArrayAssignment_5");
			builder.put(grammarAccess.getForActionAccess().getActionAssignment_7(), "rule__ForAction__ActionAssignment_7");
			builder.put(grammarAccess.getLoopActionAccess().getConditionAssignment_2(), "rule__LoopAction__ConditionAssignment_2");
			builder.put(grammarAccess.getLoopActionAccess().getActionAssignment_4(), "rule__LoopAction__ActionAssignment_4");
			builder.put(grammarAccess.getConditionalActionAccess().getConditionAssignment_2(), "rule__ConditionalAction__ConditionAssignment_2");
			builder.put(grammarAccess.getConditionalActionAccess().getActionAssignment_4(), "rule__ConditionalAction__ActionAssignment_4");
			builder.put(grammarAccess.getConditionalActionAccess().getElseActionAssignment_5_1(), "rule__ConditionalAction__ElseActionAssignment_5_1");
			builder.put(grammarAccess.getReturnActionAccess().getExpAssignment_2(), "rule__ReturnAction__ExpAssignment_2");
			builder.put(grammarAccess.getPrintActionAccess().getLineAssignment_0_1(), "rule__PrintAction__LineAssignment_0_1");
			builder.put(grammarAccess.getPrintActionAccess().getMsgAssignment_1(), "rule__PrintAction__MsgAssignment_1");
			builder.put(grammarAccess.getPrintActionAccess().getMsgAssignment_2_1(), "rule__PrintAction__MsgAssignment_2_1");
			builder.put(grammarAccess.getErrorActionAccess().getLineAssignment_0_1(), "rule__ErrorAction__LineAssignment_0_1");
			builder.put(grammarAccess.getErrorActionAccess().getMsgAssignment_1(), "rule__ErrorAction__MsgAssignment_1");
			builder.put(grammarAccess.getErrorActionAccess().getMsgAssignment_2_1(), "rule__ErrorAction__MsgAssignment_2_1");
			builder.put(grammarAccess.getStartSessionAccess().getSessionAssignment_1(), "rule__StartSession__SessionAssignment_1");
			builder.put(grammarAccess.getFunctionCallStatementAccess().getFunctionAssignment_0(), "rule__FunctionCallStatement__FunctionAssignment_0");
			builder.put(grammarAccess.getFunctionCallStatementAccess().getParametersAssignment_2_0(), "rule__FunctionCallStatement__ParametersAssignment_2_0");
			builder.put(grammarAccess.getFunctionCallStatementAccess().getParametersAssignment_2_1_1(), "rule__FunctionCallStatement__ParametersAssignment_2_1_1");
			builder.put(grammarAccess.getDASaveActionAccess().getDataAnalyticsAssignment_1(), "rule__DASaveAction__DataAnalyticsAssignment_1");
			builder.put(grammarAccess.getDAPreprocessActionAccess().getDataAnalyticsAssignment_1(), "rule__DAPreprocessAction__DataAnalyticsAssignment_1");
			builder.put(grammarAccess.getDATrainActionAccess().getDataAnalyticsAssignment_1(), "rule__DATrainAction__DataAnalyticsAssignment_1");
			builder.put(grammarAccess.getDAPredictActionAccess().getDataAnalyticsAssignment_1(), "rule__DAPredictAction__DataAnalyticsAssignment_1");
			builder.put(grammarAccess.getDAPredictActionAccess().getFeaturesAssignment_3(), "rule__DAPredictAction__FeaturesAssignment_3");
			builder.put(grammarAccess.getDAPredictActionAccess().getFeaturesAssignment_4_1(), "rule__DAPredictAction__FeaturesAssignment_4_1");
			builder.put(grammarAccess.getOrExpressionAccess().getRhsAssignment_1_2(), "rule__OrExpression__RhsAssignment_1_2");
			builder.put(grammarAccess.getAndExpressionAccess().getRhsAssignment_1_2(), "rule__AndExpression__RhsAssignment_1_2");
			builder.put(grammarAccess.getEqualityAccess().getRhsAssignment_1_0_2(), "rule__Equality__RhsAssignment_1_0_2");
			builder.put(grammarAccess.getEqualityAccess().getRhsAssignment_1_1_2(), "rule__Equality__RhsAssignment_1_1_2");
			builder.put(grammarAccess.getComparaisonAccess().getRhsAssignment_1_0_2(), "rule__Comparaison__RhsAssignment_1_0_2");
			builder.put(grammarAccess.getComparaisonAccess().getRhsAssignment_1_1_2(), "rule__Comparaison__RhsAssignment_1_1_2");
			builder.put(grammarAccess.getComparaisonAccess().getRhsAssignment_1_2_2(), "rule__Comparaison__RhsAssignment_1_2_2");
			builder.put(grammarAccess.getComparaisonAccess().getRhsAssignment_1_3_2(), "rule__Comparaison__RhsAssignment_1_3_2");
			builder.put(grammarAccess.getAdditionAccess().getRhsAssignment_1_0_2(), "rule__Addition__RhsAssignment_1_0_2");
			builder.put(grammarAccess.getAdditionAccess().getRhsAssignment_1_1_2(), "rule__Addition__RhsAssignment_1_1_2");
			builder.put(grammarAccess.getMultiplicationAccess().getRhsAssignment_1_0_2(), "rule__Multiplication__RhsAssignment_1_0_2");
			builder.put(grammarAccess.getMultiplicationAccess().getRhsAssignment_1_1_2(), "rule__Multiplication__RhsAssignment_1_1_2");
			builder.put(grammarAccess.getMultiplicationAccess().getRhsAssignment_1_2_2(), "rule__Multiplication__RhsAssignment_1_2_2");
			builder.put(grammarAccess.getCastExpressionAccess().getTypeAssignment_1_2(), "rule__CastExpression__TypeAssignment_1_2");
			builder.put(grammarAccess.getCastExpressionAccess().getIsArrayAssignment_1_3_0(), "rule__CastExpression__IsArrayAssignment_1_3_0");
			builder.put(grammarAccess.getPrimaryAccess().getTermAssignment_0_2(), "rule__Primary__TermAssignment_0_2");
			builder.put(grammarAccess.getPrimaryAccess().getTermAssignment_1_2(), "rule__Primary__TermAssignment_1_2");
			builder.put(grammarAccess.getPrimaryAccess().getTermAssignment_2_2(), "rule__Primary__TermAssignment_2_2");
			builder.put(grammarAccess.getArrayIndexPostfixAccess().getIndexAssignment_1_2(), "rule__ArrayIndexPostfix__IndexAssignment_1_2");
			builder.put(grammarAccess.getExternExpressionAccess().getExpressionAssignment_0(), "rule__ExternExpression__ExpressionAssignment_0");
			builder.put(grammarAccess.getExternExpressionAccess().getSegmentsAssignment_1_1(), "rule__ExternExpression__SegmentsAssignment_1_1");
			builder.put(grammarAccess.getArrayInitAccess().getValuesAssignment_1(), "rule__ArrayInit__ValuesAssignment_1");
			builder.put(grammarAccess.getArrayInitAccess().getValuesAssignment_2_1(), "rule__ArrayInit__ValuesAssignment_2_1");
			builder.put(grammarAccess.getEnumLiteralRefAccess().getEnumAssignment_0(), "rule__EnumLiteralRef__EnumAssignment_0");
			builder.put(grammarAccess.getEnumLiteralRefAccess().getLiteralAssignment_2(), "rule__EnumLiteralRef__LiteralAssignment_2");
			builder.put(grammarAccess.getByteLiteralAccess().getByteValueAssignment(), "rule__ByteLiteral__ByteValueAssignment");
			builder.put(grammarAccess.getCharLiteralAccess().getCharValueAssignment(), "rule__CharLiteral__CharValueAssignment");
			builder.put(grammarAccess.getIntegerLiteralAccess().getIntValueAssignment(), "rule__IntegerLiteral__IntValueAssignment");
			builder.put(grammarAccess.getBooleanLiteralAccess().getBoolValueAssignment_0(), "rule__BooleanLiteral__BoolValueAssignment_0");
			builder.put(grammarAccess.getStringLiteralAccess().getStringValueAssignment(), "rule__StringLiteral__StringValueAssignment");
			builder.put(grammarAccess.getDoubleLiteralAccess().getDoubleValueAssignment(), "rule__DoubleLiteral__DoubleValueAssignment");
			builder.put(grammarAccess.getPropertyReferenceAccess().getPropertyAssignment(), "rule__PropertyReference__PropertyAssignment");
			builder.put(grammarAccess.getEventReferenceAccess().getReceiveMsgAssignment_0(), "rule__EventReference__ReceiveMsgAssignment_0");
			builder.put(grammarAccess.getEventReferenceAccess().getParameterAssignment_2(), "rule__EventReference__ParameterAssignment_2");
			builder.put(grammarAccess.getFunctionCallExpressionAccess().getFunctionAssignment_0(), "rule__FunctionCallExpression__FunctionAssignment_0");
			builder.put(grammarAccess.getFunctionCallExpressionAccess().getParametersAssignment_2_0(), "rule__FunctionCallExpression__ParametersAssignment_2_0");
			builder.put(grammarAccess.getFunctionCallExpressionAccess().getParametersAssignment_2_1_1(), "rule__FunctionCallExpression__ParametersAssignment_2_1_1");
			builder.put(grammarAccess.getConfigurationAccess().getNameAssignment_1(), "rule__Configuration__NameAssignment_1");
			builder.put(grammarAccess.getConfigurationAccess().getAnnotationsAssignment_2(), "rule__Configuration__AnnotationsAssignment_2");
			builder.put(grammarAccess.getConfigurationAccess().getInstancesAssignment_4_0(), "rule__Configuration__InstancesAssignment_4_0");
			builder.put(grammarAccess.getConfigurationAccess().getConnectorsAssignment_4_1(), "rule__Configuration__ConnectorsAssignment_4_1");
			builder.put(grammarAccess.getConfigurationAccess().getPropassignsAssignment_4_2(), "rule__Configuration__PropassignsAssignment_4_2");
			builder.put(grammarAccess.getInstanceAccess().getNameAssignment_1(), "rule__Instance__NameAssignment_1");
			builder.put(grammarAccess.getInstanceAccess().getTypeAssignment_3(), "rule__Instance__TypeAssignment_3");
			builder.put(grammarAccess.getInstanceAccess().getAnnotationsAssignment_4(), "rule__Instance__AnnotationsAssignment_4");
			builder.put(grammarAccess.getConfigPropertyAssignAccess().getInstanceAssignment_1(), "rule__ConfigPropertyAssign__InstanceAssignment_1");
			builder.put(grammarAccess.getConfigPropertyAssignAccess().getPropertyAssignment_3(), "rule__ConfigPropertyAssign__PropertyAssignment_3");
			builder.put(grammarAccess.getConfigPropertyAssignAccess().getIndexAssignment_4_1(), "rule__ConfigPropertyAssign__IndexAssignment_4_1");
			builder.put(grammarAccess.getConfigPropertyAssignAccess().getInitAssignment_6(), "rule__ConfigPropertyAssign__InitAssignment_6");
			builder.put(grammarAccess.getConfigPropertyAssignAccess().getAnnotationsAssignment_7(), "rule__ConfigPropertyAssign__AnnotationsAssignment_7");
			builder.put(grammarAccess.getConnectorAccess().getNameAssignment_1(), "rule__Connector__NameAssignment_1");
			builder.put(grammarAccess.getConnectorAccess().getCliAssignment_2(), "rule__Connector__CliAssignment_2");
			builder.put(grammarAccess.getConnectorAccess().getRequiredAssignment_4(), "rule__Connector__RequiredAssignment_4");
			builder.put(grammarAccess.getConnectorAccess().getSrvAssignment_6(), "rule__Connector__SrvAssignment_6");
			builder.put(grammarAccess.getConnectorAccess().getProvidedAssignment_8(), "rule__Connector__ProvidedAssignment_8");
			builder.put(grammarAccess.getConnectorAccess().getAnnotationsAssignment_9(), "rule__Connector__AnnotationsAssignment_9");
			builder.put(grammarAccess.getExternalConnectorAccess().getNameAssignment_1(), "rule__ExternalConnector__NameAssignment_1");
			builder.put(grammarAccess.getExternalConnectorAccess().getInstAssignment_2(), "rule__ExternalConnector__InstAssignment_2");
			builder.put(grammarAccess.getExternalConnectorAccess().getPortAssignment_4(), "rule__ExternalConnector__PortAssignment_4");
			builder.put(grammarAccess.getExternalConnectorAccess().getProtocolAssignment_6(), "rule__ExternalConnector__ProtocolAssignment_6");
			builder.put(grammarAccess.getExternalConnectorAccess().getAnnotationsAssignment_7(), "rule__ExternalConnector__AnnotationsAssignment_7");
			builder.put(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), "rule__State__UnorderedGroup_3_5");
			builder.put(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), "rule__CompositeState__UnorderedGroup_9");
			builder.put(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), "rule__StateMachine__UnorderedGroup_8");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ThingMLGrammarAccess grammarAccess;

	@Override
	protected InternalThingMLParser createParser() {
		InternalThingMLParser result = new InternalThingMLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ThingMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ThingMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
