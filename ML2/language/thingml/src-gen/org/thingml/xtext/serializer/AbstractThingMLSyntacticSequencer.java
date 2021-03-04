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
package org.thingml.xtext.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.thingml.xtext.services.ThingMLGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractThingMLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ThingMLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DecisionTreeClassifier_CommaKeyword_10_2_q;
	protected AbstractElementAlias match_DecisionTreeClassifier_CommaKeyword_11_2_q;
	protected AbstractElementAlias match_DecisionTreeClassifier_CommaKeyword_12_2_q;
	protected AbstractElementAlias match_DecisionTreeClassifier_CommaKeyword_13_2_q;
	protected AbstractElementAlias match_DecisionTreeClassifier_CommaKeyword_14_2_q;
	protected AbstractElementAlias match_DecisionTreeClassifier_CommaKeyword_15_2_q;
	protected AbstractElementAlias match_DecisionTreeClassifier_CommaKeyword_3_2_q;
	protected AbstractElementAlias match_DecisionTreeClassifier_CommaKeyword_4_2_q;
	protected AbstractElementAlias match_DecisionTreeClassifier_CommaKeyword_5_2_q;
	protected AbstractElementAlias match_DecisionTreeClassifier_CommaKeyword_6_2_q;
	protected AbstractElementAlias match_DecisionTreeClassifier_CommaKeyword_7_2_q;
	protected AbstractElementAlias match_DecisionTreeClassifier_CommaKeyword_8_2_q;
	protected AbstractElementAlias match_DecisionTreeClassifier_CommaKeyword_9_1_1_q;
	protected AbstractElementAlias match_DecisionTreeRegressor_CommaKeyword_10_2_q;
	protected AbstractElementAlias match_DecisionTreeRegressor_CommaKeyword_11_2_q;
	protected AbstractElementAlias match_DecisionTreeRegressor_CommaKeyword_12_2_q;
	protected AbstractElementAlias match_DecisionTreeRegressor_CommaKeyword_13_2_q;
	protected AbstractElementAlias match_DecisionTreeRegressor_CommaKeyword_14_2_q;
	protected AbstractElementAlias match_DecisionTreeRegressor_CommaKeyword_3_2_q;
	protected AbstractElementAlias match_DecisionTreeRegressor_CommaKeyword_4_2_q;
	protected AbstractElementAlias match_DecisionTreeRegressor_CommaKeyword_5_2_q;
	protected AbstractElementAlias match_DecisionTreeRegressor_CommaKeyword_6_2_q;
	protected AbstractElementAlias match_DecisionTreeRegressor_CommaKeyword_7_2_q;
	protected AbstractElementAlias match_DecisionTreeRegressor_CommaKeyword_8_2_q;
	protected AbstractElementAlias match_DecisionTreeRegressor_CommaKeyword_9_1_1_q;
	protected AbstractElementAlias match_LinearClassifierLogisticRegression_CommaKeyword_10_2_q;
	protected AbstractElementAlias match_LinearClassifierLogisticRegression_CommaKeyword_11_2_q;
	protected AbstractElementAlias match_LinearClassifierLogisticRegression_CommaKeyword_12_2_q;
	protected AbstractElementAlias match_LinearClassifierLogisticRegression_CommaKeyword_13_2_q;
	protected AbstractElementAlias match_LinearClassifierLogisticRegression_CommaKeyword_14_2_q;
	protected AbstractElementAlias match_LinearClassifierLogisticRegression_CommaKeyword_15_2_q;
	protected AbstractElementAlias match_LinearClassifierLogisticRegression_CommaKeyword_16_2_q;
	protected AbstractElementAlias match_LinearClassifierLogisticRegression_CommaKeyword_17_2_q;
	protected AbstractElementAlias match_LinearClassifierLogisticRegression_CommaKeyword_3_2_q;
	protected AbstractElementAlias match_LinearClassifierLogisticRegression_CommaKeyword_4_2_q;
	protected AbstractElementAlias match_LinearClassifierLogisticRegression_CommaKeyword_5_2_q;
	protected AbstractElementAlias match_LinearClassifierLogisticRegression_CommaKeyword_6_2_q;
	protected AbstractElementAlias match_LinearClassifierLogisticRegression_CommaKeyword_7_2_q;
	protected AbstractElementAlias match_LinearClassifierLogisticRegression_CommaKeyword_8_2_q;
	protected AbstractElementAlias match_LinearClassifierLogisticRegression_CommaKeyword_9_2_q;
	protected AbstractElementAlias match_LinearRegression_CommaKeyword_3_2_q;
	protected AbstractElementAlias match_LinearRegression_CommaKeyword_4_2_q;
	protected AbstractElementAlias match_LinearRegression_CommaKeyword_5_2_q;
	protected AbstractElementAlias match_LinearRegression_CommaKeyword_6_2_q;
	protected AbstractElementAlias match_LinearRegression_CommaKeyword_7_2_q;
	protected AbstractElementAlias match_Message_SemicolonKeyword_6_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_10_2_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_11_2_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_12_2_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_13_2_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_14_2_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_15_2_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_16_2_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_17_2_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_18_2_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_19_2_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_20_2_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_21_2_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_22_2_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_23_2_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_24_2_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_25_2_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_26_2_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_27_2_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_3_4_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_4_2_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_5_2_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_6_2_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_7_2_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_8_2_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_9_2_q;
	protected AbstractElementAlias match_NaiveBayesBernoulli_CommaKeyword_3_2_q;
	protected AbstractElementAlias match_NaiveBayesBernoulli_CommaKeyword_4_2_q;
	protected AbstractElementAlias match_NaiveBayesBernoulli_CommaKeyword_5_2_q;
	protected AbstractElementAlias match_NaiveBayesBernoulli_CommaKeyword_6_2_q;
	protected AbstractElementAlias match_NaiveBayesCategorical_CommaKeyword_3_2_q;
	protected AbstractElementAlias match_NaiveBayesCategorical_CommaKeyword_4_2_q;
	protected AbstractElementAlias match_NaiveBayesCategorical_CommaKeyword_5_2_q;
	protected AbstractElementAlias match_NaiveBayesCategorical_CommaKeyword_6_2_q;
	protected AbstractElementAlias match_NaiveBayesComplement_CommaKeyword_3_2_q;
	protected AbstractElementAlias match_NaiveBayesComplement_CommaKeyword_4_2_q;
	protected AbstractElementAlias match_NaiveBayesComplement_CommaKeyword_5_2_q;
	protected AbstractElementAlias match_NaiveBayesComplement_CommaKeyword_6_2_q;
	protected AbstractElementAlias match_NaiveBayesGaussian_CommaKeyword_3_2_q;
	protected AbstractElementAlias match_NaiveBayesGaussian_CommaKeyword_4_2_q;
	protected AbstractElementAlias match_NaiveBayesMultinomial_CommaKeyword_3_2_q;
	protected AbstractElementAlias match_NaiveBayesMultinomial_CommaKeyword_4_2_q;
	protected AbstractElementAlias match_NaiveBayesMultinomial_CommaKeyword_5_2_q;
	protected AbstractElementAlias match_ObjectType_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_PrimitiveType_SemicolonKeyword_6_q;
	protected AbstractElementAlias match_Protocol_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_RandomForestClassifier_CommaKeyword_10_2_q;
	protected AbstractElementAlias match_RandomForestClassifier_CommaKeyword_11_2_q;
	protected AbstractElementAlias match_RandomForestClassifier_CommaKeyword_12_2_q;
	protected AbstractElementAlias match_RandomForestClassifier_CommaKeyword_13_2_q;
	protected AbstractElementAlias match_RandomForestClassifier_CommaKeyword_14_2_q;
	protected AbstractElementAlias match_RandomForestClassifier_CommaKeyword_15_2_q;
	protected AbstractElementAlias match_RandomForestClassifier_CommaKeyword_16_2_q;
	protected AbstractElementAlias match_RandomForestClassifier_CommaKeyword_17_2_q;
	protected AbstractElementAlias match_RandomForestClassifier_CommaKeyword_18_2_q;
	protected AbstractElementAlias match_RandomForestClassifier_CommaKeyword_19_2_q;
	protected AbstractElementAlias match_RandomForestClassifier_CommaKeyword_20_2_q;
	protected AbstractElementAlias match_RandomForestClassifier_CommaKeyword_21_2_q;
	protected AbstractElementAlias match_RandomForestClassifier_CommaKeyword_3_2_q;
	protected AbstractElementAlias match_RandomForestClassifier_CommaKeyword_4_2_q;
	protected AbstractElementAlias match_RandomForestClassifier_CommaKeyword_5_2_q;
	protected AbstractElementAlias match_RandomForestClassifier_CommaKeyword_6_2_q;
	protected AbstractElementAlias match_RandomForestClassifier_CommaKeyword_7_2_q;
	protected AbstractElementAlias match_RandomForestClassifier_CommaKeyword_8_2_q;
	protected AbstractElementAlias match_RandomForestClassifier_CommaKeyword_9_1_1_q;
	protected AbstractElementAlias match_RandomForestRegressor_CommaKeyword_10_2_q;
	protected AbstractElementAlias match_RandomForestRegressor_CommaKeyword_11_2_q;
	protected AbstractElementAlias match_RandomForestRegressor_CommaKeyword_12_2_q;
	protected AbstractElementAlias match_RandomForestRegressor_CommaKeyword_13_2_q;
	protected AbstractElementAlias match_RandomForestRegressor_CommaKeyword_14_2_q;
	protected AbstractElementAlias match_RandomForestRegressor_CommaKeyword_15_2_q;
	protected AbstractElementAlias match_RandomForestRegressor_CommaKeyword_16_2_q;
	protected AbstractElementAlias match_RandomForestRegressor_CommaKeyword_17_2_q;
	protected AbstractElementAlias match_RandomForestRegressor_CommaKeyword_18_2_q;
	protected AbstractElementAlias match_RandomForestRegressor_CommaKeyword_19_2_q;
	protected AbstractElementAlias match_RandomForestRegressor_CommaKeyword_20_2_q;
	protected AbstractElementAlias match_RandomForestRegressor_CommaKeyword_3_2_q;
	protected AbstractElementAlias match_RandomForestRegressor_CommaKeyword_4_2_q;
	protected AbstractElementAlias match_RandomForestRegressor_CommaKeyword_5_2_q;
	protected AbstractElementAlias match_RandomForestRegressor_CommaKeyword_6_2_q;
	protected AbstractElementAlias match_RandomForestRegressor_CommaKeyword_7_2_q;
	protected AbstractElementAlias match_RandomForestRegressor_CommaKeyword_8_2_q;
	protected AbstractElementAlias match_RandomForestRegressor_CommaKeyword_9_1_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ThingMLGrammarAccess) access;
		match_DecisionTreeClassifier_CommaKeyword_10_2_q = new TokenAlias(false, true, grammarAccess.getDecisionTreeClassifierAccess().getCommaKeyword_10_2());
		match_DecisionTreeClassifier_CommaKeyword_11_2_q = new TokenAlias(false, true, grammarAccess.getDecisionTreeClassifierAccess().getCommaKeyword_11_2());
		match_DecisionTreeClassifier_CommaKeyword_12_2_q = new TokenAlias(false, true, grammarAccess.getDecisionTreeClassifierAccess().getCommaKeyword_12_2());
		match_DecisionTreeClassifier_CommaKeyword_13_2_q = new TokenAlias(false, true, grammarAccess.getDecisionTreeClassifierAccess().getCommaKeyword_13_2());
		match_DecisionTreeClassifier_CommaKeyword_14_2_q = new TokenAlias(false, true, grammarAccess.getDecisionTreeClassifierAccess().getCommaKeyword_14_2());
		match_DecisionTreeClassifier_CommaKeyword_15_2_q = new TokenAlias(false, true, grammarAccess.getDecisionTreeClassifierAccess().getCommaKeyword_15_2());
		match_DecisionTreeClassifier_CommaKeyword_3_2_q = new TokenAlias(false, true, grammarAccess.getDecisionTreeClassifierAccess().getCommaKeyword_3_2());
		match_DecisionTreeClassifier_CommaKeyword_4_2_q = new TokenAlias(false, true, grammarAccess.getDecisionTreeClassifierAccess().getCommaKeyword_4_2());
		match_DecisionTreeClassifier_CommaKeyword_5_2_q = new TokenAlias(false, true, grammarAccess.getDecisionTreeClassifierAccess().getCommaKeyword_5_2());
		match_DecisionTreeClassifier_CommaKeyword_6_2_q = new TokenAlias(false, true, grammarAccess.getDecisionTreeClassifierAccess().getCommaKeyword_6_2());
		match_DecisionTreeClassifier_CommaKeyword_7_2_q = new TokenAlias(false, true, grammarAccess.getDecisionTreeClassifierAccess().getCommaKeyword_7_2());
		match_DecisionTreeClassifier_CommaKeyword_8_2_q = new TokenAlias(false, true, grammarAccess.getDecisionTreeClassifierAccess().getCommaKeyword_8_2());
		match_DecisionTreeClassifier_CommaKeyword_9_1_1_q = new TokenAlias(false, true, grammarAccess.getDecisionTreeClassifierAccess().getCommaKeyword_9_1_1());
		match_DecisionTreeRegressor_CommaKeyword_10_2_q = new TokenAlias(false, true, grammarAccess.getDecisionTreeRegressorAccess().getCommaKeyword_10_2());
		match_DecisionTreeRegressor_CommaKeyword_11_2_q = new TokenAlias(false, true, grammarAccess.getDecisionTreeRegressorAccess().getCommaKeyword_11_2());
		match_DecisionTreeRegressor_CommaKeyword_12_2_q = new TokenAlias(false, true, grammarAccess.getDecisionTreeRegressorAccess().getCommaKeyword_12_2());
		match_DecisionTreeRegressor_CommaKeyword_13_2_q = new TokenAlias(false, true, grammarAccess.getDecisionTreeRegressorAccess().getCommaKeyword_13_2());
		match_DecisionTreeRegressor_CommaKeyword_14_2_q = new TokenAlias(false, true, grammarAccess.getDecisionTreeRegressorAccess().getCommaKeyword_14_2());
		match_DecisionTreeRegressor_CommaKeyword_3_2_q = new TokenAlias(false, true, grammarAccess.getDecisionTreeRegressorAccess().getCommaKeyword_3_2());
		match_DecisionTreeRegressor_CommaKeyword_4_2_q = new TokenAlias(false, true, grammarAccess.getDecisionTreeRegressorAccess().getCommaKeyword_4_2());
		match_DecisionTreeRegressor_CommaKeyword_5_2_q = new TokenAlias(false, true, grammarAccess.getDecisionTreeRegressorAccess().getCommaKeyword_5_2());
		match_DecisionTreeRegressor_CommaKeyword_6_2_q = new TokenAlias(false, true, grammarAccess.getDecisionTreeRegressorAccess().getCommaKeyword_6_2());
		match_DecisionTreeRegressor_CommaKeyword_7_2_q = new TokenAlias(false, true, grammarAccess.getDecisionTreeRegressorAccess().getCommaKeyword_7_2());
		match_DecisionTreeRegressor_CommaKeyword_8_2_q = new TokenAlias(false, true, grammarAccess.getDecisionTreeRegressorAccess().getCommaKeyword_8_2());
		match_DecisionTreeRegressor_CommaKeyword_9_1_1_q = new TokenAlias(false, true, grammarAccess.getDecisionTreeRegressorAccess().getCommaKeyword_9_1_1());
		match_LinearClassifierLogisticRegression_CommaKeyword_10_2_q = new TokenAlias(false, true, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_10_2());
		match_LinearClassifierLogisticRegression_CommaKeyword_11_2_q = new TokenAlias(false, true, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_11_2());
		match_LinearClassifierLogisticRegression_CommaKeyword_12_2_q = new TokenAlias(false, true, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_12_2());
		match_LinearClassifierLogisticRegression_CommaKeyword_13_2_q = new TokenAlias(false, true, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_13_2());
		match_LinearClassifierLogisticRegression_CommaKeyword_14_2_q = new TokenAlias(false, true, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_14_2());
		match_LinearClassifierLogisticRegression_CommaKeyword_15_2_q = new TokenAlias(false, true, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_15_2());
		match_LinearClassifierLogisticRegression_CommaKeyword_16_2_q = new TokenAlias(false, true, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_16_2());
		match_LinearClassifierLogisticRegression_CommaKeyword_17_2_q = new TokenAlias(false, true, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_17_2());
		match_LinearClassifierLogisticRegression_CommaKeyword_3_2_q = new TokenAlias(false, true, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_3_2());
		match_LinearClassifierLogisticRegression_CommaKeyword_4_2_q = new TokenAlias(false, true, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_4_2());
		match_LinearClassifierLogisticRegression_CommaKeyword_5_2_q = new TokenAlias(false, true, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_5_2());
		match_LinearClassifierLogisticRegression_CommaKeyword_6_2_q = new TokenAlias(false, true, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_6_2());
		match_LinearClassifierLogisticRegression_CommaKeyword_7_2_q = new TokenAlias(false, true, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_7_2());
		match_LinearClassifierLogisticRegression_CommaKeyword_8_2_q = new TokenAlias(false, true, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_8_2());
		match_LinearClassifierLogisticRegression_CommaKeyword_9_2_q = new TokenAlias(false, true, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_9_2());
		match_LinearRegression_CommaKeyword_3_2_q = new TokenAlias(false, true, grammarAccess.getLinearRegressionAccess().getCommaKeyword_3_2());
		match_LinearRegression_CommaKeyword_4_2_q = new TokenAlias(false, true, grammarAccess.getLinearRegressionAccess().getCommaKeyword_4_2());
		match_LinearRegression_CommaKeyword_5_2_q = new TokenAlias(false, true, grammarAccess.getLinearRegressionAccess().getCommaKeyword_5_2());
		match_LinearRegression_CommaKeyword_6_2_q = new TokenAlias(false, true, grammarAccess.getLinearRegressionAccess().getCommaKeyword_6_2());
		match_LinearRegression_CommaKeyword_7_2_q = new TokenAlias(false, true, grammarAccess.getLinearRegressionAccess().getCommaKeyword_7_2());
		match_Message_SemicolonKeyword_6_q = new TokenAlias(false, true, grammarAccess.getMessageAccess().getSemicolonKeyword_6());
		match_NN_MultilayerPerceptron_CommaKeyword_10_2_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_10_2());
		match_NN_MultilayerPerceptron_CommaKeyword_11_2_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_11_2());
		match_NN_MultilayerPerceptron_CommaKeyword_12_2_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_12_2());
		match_NN_MultilayerPerceptron_CommaKeyword_13_2_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_13_2());
		match_NN_MultilayerPerceptron_CommaKeyword_14_2_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_14_2());
		match_NN_MultilayerPerceptron_CommaKeyword_15_2_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_15_2());
		match_NN_MultilayerPerceptron_CommaKeyword_16_2_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_16_2());
		match_NN_MultilayerPerceptron_CommaKeyword_17_2_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_17_2());
		match_NN_MultilayerPerceptron_CommaKeyword_18_2_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_18_2());
		match_NN_MultilayerPerceptron_CommaKeyword_19_2_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_19_2());
		match_NN_MultilayerPerceptron_CommaKeyword_20_2_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_20_2());
		match_NN_MultilayerPerceptron_CommaKeyword_21_2_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_21_2());
		match_NN_MultilayerPerceptron_CommaKeyword_22_2_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_22_2());
		match_NN_MultilayerPerceptron_CommaKeyword_23_2_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_23_2());
		match_NN_MultilayerPerceptron_CommaKeyword_24_2_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_24_2());
		match_NN_MultilayerPerceptron_CommaKeyword_25_2_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_25_2());
		match_NN_MultilayerPerceptron_CommaKeyword_26_2_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_26_2());
		match_NN_MultilayerPerceptron_CommaKeyword_27_2_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_27_2());
		match_NN_MultilayerPerceptron_CommaKeyword_3_4_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_3_4());
		match_NN_MultilayerPerceptron_CommaKeyword_4_2_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_4_2());
		match_NN_MultilayerPerceptron_CommaKeyword_5_2_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_5_2());
		match_NN_MultilayerPerceptron_CommaKeyword_6_2_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_6_2());
		match_NN_MultilayerPerceptron_CommaKeyword_7_2_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_7_2());
		match_NN_MultilayerPerceptron_CommaKeyword_8_2_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_8_2());
		match_NN_MultilayerPerceptron_CommaKeyword_9_2_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_9_2());
		match_NaiveBayesBernoulli_CommaKeyword_3_2_q = new TokenAlias(false, true, grammarAccess.getNaiveBayesBernoulliAccess().getCommaKeyword_3_2());
		match_NaiveBayesBernoulli_CommaKeyword_4_2_q = new TokenAlias(false, true, grammarAccess.getNaiveBayesBernoulliAccess().getCommaKeyword_4_2());
		match_NaiveBayesBernoulli_CommaKeyword_5_2_q = new TokenAlias(false, true, grammarAccess.getNaiveBayesBernoulliAccess().getCommaKeyword_5_2());
		match_NaiveBayesBernoulli_CommaKeyword_6_2_q = new TokenAlias(false, true, grammarAccess.getNaiveBayesBernoulliAccess().getCommaKeyword_6_2());
		match_NaiveBayesCategorical_CommaKeyword_3_2_q = new TokenAlias(false, true, grammarAccess.getNaiveBayesCategoricalAccess().getCommaKeyword_3_2());
		match_NaiveBayesCategorical_CommaKeyword_4_2_q = new TokenAlias(false, true, grammarAccess.getNaiveBayesCategoricalAccess().getCommaKeyword_4_2());
		match_NaiveBayesCategorical_CommaKeyword_5_2_q = new TokenAlias(false, true, grammarAccess.getNaiveBayesCategoricalAccess().getCommaKeyword_5_2());
		match_NaiveBayesCategorical_CommaKeyword_6_2_q = new TokenAlias(false, true, grammarAccess.getNaiveBayesCategoricalAccess().getCommaKeyword_6_2());
		match_NaiveBayesComplement_CommaKeyword_3_2_q = new TokenAlias(false, true, grammarAccess.getNaiveBayesComplementAccess().getCommaKeyword_3_2());
		match_NaiveBayesComplement_CommaKeyword_4_2_q = new TokenAlias(false, true, grammarAccess.getNaiveBayesComplementAccess().getCommaKeyword_4_2());
		match_NaiveBayesComplement_CommaKeyword_5_2_q = new TokenAlias(false, true, grammarAccess.getNaiveBayesComplementAccess().getCommaKeyword_5_2());
		match_NaiveBayesComplement_CommaKeyword_6_2_q = new TokenAlias(false, true, grammarAccess.getNaiveBayesComplementAccess().getCommaKeyword_6_2());
		match_NaiveBayesGaussian_CommaKeyword_3_2_q = new TokenAlias(false, true, grammarAccess.getNaiveBayesGaussianAccess().getCommaKeyword_3_2());
		match_NaiveBayesGaussian_CommaKeyword_4_2_q = new TokenAlias(false, true, grammarAccess.getNaiveBayesGaussianAccess().getCommaKeyword_4_2());
		match_NaiveBayesMultinomial_CommaKeyword_3_2_q = new TokenAlias(false, true, grammarAccess.getNaiveBayesMultinomialAccess().getCommaKeyword_3_2());
		match_NaiveBayesMultinomial_CommaKeyword_4_2_q = new TokenAlias(false, true, grammarAccess.getNaiveBayesMultinomialAccess().getCommaKeyword_4_2());
		match_NaiveBayesMultinomial_CommaKeyword_5_2_q = new TokenAlias(false, true, grammarAccess.getNaiveBayesMultinomialAccess().getCommaKeyword_5_2());
		match_ObjectType_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getObjectTypeAccess().getSemicolonKeyword_3());
		match_PrimitiveType_SemicolonKeyword_6_q = new TokenAlias(false, true, grammarAccess.getPrimitiveTypeAccess().getSemicolonKeyword_6());
		match_Protocol_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getProtocolAccess().getSemicolonKeyword_3());
		match_RandomForestClassifier_CommaKeyword_10_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_10_2());
		match_RandomForestClassifier_CommaKeyword_11_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_11_2());
		match_RandomForestClassifier_CommaKeyword_12_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_12_2());
		match_RandomForestClassifier_CommaKeyword_13_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_13_2());
		match_RandomForestClassifier_CommaKeyword_14_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_14_2());
		match_RandomForestClassifier_CommaKeyword_15_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_15_2());
		match_RandomForestClassifier_CommaKeyword_16_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_16_2());
		match_RandomForestClassifier_CommaKeyword_17_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_17_2());
		match_RandomForestClassifier_CommaKeyword_18_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_18_2());
		match_RandomForestClassifier_CommaKeyword_19_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_19_2());
		match_RandomForestClassifier_CommaKeyword_20_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_20_2());
		match_RandomForestClassifier_CommaKeyword_21_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_21_2());
		match_RandomForestClassifier_CommaKeyword_3_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_3_2());
		match_RandomForestClassifier_CommaKeyword_4_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_4_2());
		match_RandomForestClassifier_CommaKeyword_5_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_5_2());
		match_RandomForestClassifier_CommaKeyword_6_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_6_2());
		match_RandomForestClassifier_CommaKeyword_7_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_7_2());
		match_RandomForestClassifier_CommaKeyword_8_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_8_2());
		match_RandomForestClassifier_CommaKeyword_9_1_1_q = new TokenAlias(false, true, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_9_1_1());
		match_RandomForestRegressor_CommaKeyword_10_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_10_2());
		match_RandomForestRegressor_CommaKeyword_11_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_11_2());
		match_RandomForestRegressor_CommaKeyword_12_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_12_2());
		match_RandomForestRegressor_CommaKeyword_13_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_13_2());
		match_RandomForestRegressor_CommaKeyword_14_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_14_2());
		match_RandomForestRegressor_CommaKeyword_15_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_15_2());
		match_RandomForestRegressor_CommaKeyword_16_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_16_2());
		match_RandomForestRegressor_CommaKeyword_17_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_17_2());
		match_RandomForestRegressor_CommaKeyword_18_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_18_2());
		match_RandomForestRegressor_CommaKeyword_19_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_19_2());
		match_RandomForestRegressor_CommaKeyword_20_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_20_2());
		match_RandomForestRegressor_CommaKeyword_3_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_3_2());
		match_RandomForestRegressor_CommaKeyword_4_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_4_2());
		match_RandomForestRegressor_CommaKeyword_5_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_5_2());
		match_RandomForestRegressor_CommaKeyword_6_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_6_2());
		match_RandomForestRegressor_CommaKeyword_7_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_7_2());
		match_RandomForestRegressor_CommaKeyword_8_2_q = new TokenAlias(false, true, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_8_2());
		match_RandomForestRegressor_CommaKeyword_9_1_1_q = new TokenAlias(false, true, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_9_1_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_DecisionTreeClassifier_CommaKeyword_10_2_q.equals(syntax))
				emit_DecisionTreeClassifier_CommaKeyword_10_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DecisionTreeClassifier_CommaKeyword_11_2_q.equals(syntax))
				emit_DecisionTreeClassifier_CommaKeyword_11_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DecisionTreeClassifier_CommaKeyword_12_2_q.equals(syntax))
				emit_DecisionTreeClassifier_CommaKeyword_12_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DecisionTreeClassifier_CommaKeyword_13_2_q.equals(syntax))
				emit_DecisionTreeClassifier_CommaKeyword_13_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DecisionTreeClassifier_CommaKeyword_14_2_q.equals(syntax))
				emit_DecisionTreeClassifier_CommaKeyword_14_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DecisionTreeClassifier_CommaKeyword_15_2_q.equals(syntax))
				emit_DecisionTreeClassifier_CommaKeyword_15_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DecisionTreeClassifier_CommaKeyword_3_2_q.equals(syntax))
				emit_DecisionTreeClassifier_CommaKeyword_3_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DecisionTreeClassifier_CommaKeyword_4_2_q.equals(syntax))
				emit_DecisionTreeClassifier_CommaKeyword_4_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DecisionTreeClassifier_CommaKeyword_5_2_q.equals(syntax))
				emit_DecisionTreeClassifier_CommaKeyword_5_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DecisionTreeClassifier_CommaKeyword_6_2_q.equals(syntax))
				emit_DecisionTreeClassifier_CommaKeyword_6_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DecisionTreeClassifier_CommaKeyword_7_2_q.equals(syntax))
				emit_DecisionTreeClassifier_CommaKeyword_7_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DecisionTreeClassifier_CommaKeyword_8_2_q.equals(syntax))
				emit_DecisionTreeClassifier_CommaKeyword_8_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DecisionTreeClassifier_CommaKeyword_9_1_1_q.equals(syntax))
				emit_DecisionTreeClassifier_CommaKeyword_9_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DecisionTreeRegressor_CommaKeyword_10_2_q.equals(syntax))
				emit_DecisionTreeRegressor_CommaKeyword_10_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DecisionTreeRegressor_CommaKeyword_11_2_q.equals(syntax))
				emit_DecisionTreeRegressor_CommaKeyword_11_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DecisionTreeRegressor_CommaKeyword_12_2_q.equals(syntax))
				emit_DecisionTreeRegressor_CommaKeyword_12_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DecisionTreeRegressor_CommaKeyword_13_2_q.equals(syntax))
				emit_DecisionTreeRegressor_CommaKeyword_13_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DecisionTreeRegressor_CommaKeyword_14_2_q.equals(syntax))
				emit_DecisionTreeRegressor_CommaKeyword_14_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DecisionTreeRegressor_CommaKeyword_3_2_q.equals(syntax))
				emit_DecisionTreeRegressor_CommaKeyword_3_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DecisionTreeRegressor_CommaKeyword_4_2_q.equals(syntax))
				emit_DecisionTreeRegressor_CommaKeyword_4_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DecisionTreeRegressor_CommaKeyword_5_2_q.equals(syntax))
				emit_DecisionTreeRegressor_CommaKeyword_5_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DecisionTreeRegressor_CommaKeyword_6_2_q.equals(syntax))
				emit_DecisionTreeRegressor_CommaKeyword_6_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DecisionTreeRegressor_CommaKeyword_7_2_q.equals(syntax))
				emit_DecisionTreeRegressor_CommaKeyword_7_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DecisionTreeRegressor_CommaKeyword_8_2_q.equals(syntax))
				emit_DecisionTreeRegressor_CommaKeyword_8_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DecisionTreeRegressor_CommaKeyword_9_1_1_q.equals(syntax))
				emit_DecisionTreeRegressor_CommaKeyword_9_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LinearClassifierLogisticRegression_CommaKeyword_10_2_q.equals(syntax))
				emit_LinearClassifierLogisticRegression_CommaKeyword_10_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LinearClassifierLogisticRegression_CommaKeyword_11_2_q.equals(syntax))
				emit_LinearClassifierLogisticRegression_CommaKeyword_11_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LinearClassifierLogisticRegression_CommaKeyword_12_2_q.equals(syntax))
				emit_LinearClassifierLogisticRegression_CommaKeyword_12_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LinearClassifierLogisticRegression_CommaKeyword_13_2_q.equals(syntax))
				emit_LinearClassifierLogisticRegression_CommaKeyword_13_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LinearClassifierLogisticRegression_CommaKeyword_14_2_q.equals(syntax))
				emit_LinearClassifierLogisticRegression_CommaKeyword_14_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LinearClassifierLogisticRegression_CommaKeyword_15_2_q.equals(syntax))
				emit_LinearClassifierLogisticRegression_CommaKeyword_15_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LinearClassifierLogisticRegression_CommaKeyword_16_2_q.equals(syntax))
				emit_LinearClassifierLogisticRegression_CommaKeyword_16_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LinearClassifierLogisticRegression_CommaKeyword_17_2_q.equals(syntax))
				emit_LinearClassifierLogisticRegression_CommaKeyword_17_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LinearClassifierLogisticRegression_CommaKeyword_3_2_q.equals(syntax))
				emit_LinearClassifierLogisticRegression_CommaKeyword_3_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LinearClassifierLogisticRegression_CommaKeyword_4_2_q.equals(syntax))
				emit_LinearClassifierLogisticRegression_CommaKeyword_4_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LinearClassifierLogisticRegression_CommaKeyword_5_2_q.equals(syntax))
				emit_LinearClassifierLogisticRegression_CommaKeyword_5_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LinearClassifierLogisticRegression_CommaKeyword_6_2_q.equals(syntax))
				emit_LinearClassifierLogisticRegression_CommaKeyword_6_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LinearClassifierLogisticRegression_CommaKeyword_7_2_q.equals(syntax))
				emit_LinearClassifierLogisticRegression_CommaKeyword_7_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LinearClassifierLogisticRegression_CommaKeyword_8_2_q.equals(syntax))
				emit_LinearClassifierLogisticRegression_CommaKeyword_8_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LinearClassifierLogisticRegression_CommaKeyword_9_2_q.equals(syntax))
				emit_LinearClassifierLogisticRegression_CommaKeyword_9_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LinearRegression_CommaKeyword_3_2_q.equals(syntax))
				emit_LinearRegression_CommaKeyword_3_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LinearRegression_CommaKeyword_4_2_q.equals(syntax))
				emit_LinearRegression_CommaKeyword_4_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LinearRegression_CommaKeyword_5_2_q.equals(syntax))
				emit_LinearRegression_CommaKeyword_5_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LinearRegression_CommaKeyword_6_2_q.equals(syntax))
				emit_LinearRegression_CommaKeyword_6_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LinearRegression_CommaKeyword_7_2_q.equals(syntax))
				emit_LinearRegression_CommaKeyword_7_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Message_SemicolonKeyword_6_q.equals(syntax))
				emit_Message_SemicolonKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_10_2_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_10_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_11_2_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_11_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_12_2_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_12_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_13_2_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_13_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_14_2_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_14_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_15_2_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_15_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_16_2_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_16_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_17_2_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_17_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_18_2_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_18_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_19_2_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_19_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_20_2_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_20_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_21_2_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_21_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_22_2_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_22_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_23_2_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_23_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_24_2_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_24_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_25_2_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_25_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_26_2_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_26_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_27_2_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_27_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_3_4_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_3_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_4_2_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_4_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_5_2_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_5_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_6_2_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_6_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_7_2_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_7_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_8_2_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_8_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_9_2_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_9_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NaiveBayesBernoulli_CommaKeyword_3_2_q.equals(syntax))
				emit_NaiveBayesBernoulli_CommaKeyword_3_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NaiveBayesBernoulli_CommaKeyword_4_2_q.equals(syntax))
				emit_NaiveBayesBernoulli_CommaKeyword_4_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NaiveBayesBernoulli_CommaKeyword_5_2_q.equals(syntax))
				emit_NaiveBayesBernoulli_CommaKeyword_5_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NaiveBayesBernoulli_CommaKeyword_6_2_q.equals(syntax))
				emit_NaiveBayesBernoulli_CommaKeyword_6_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NaiveBayesCategorical_CommaKeyword_3_2_q.equals(syntax))
				emit_NaiveBayesCategorical_CommaKeyword_3_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NaiveBayesCategorical_CommaKeyword_4_2_q.equals(syntax))
				emit_NaiveBayesCategorical_CommaKeyword_4_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NaiveBayesCategorical_CommaKeyword_5_2_q.equals(syntax))
				emit_NaiveBayesCategorical_CommaKeyword_5_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NaiveBayesCategorical_CommaKeyword_6_2_q.equals(syntax))
				emit_NaiveBayesCategorical_CommaKeyword_6_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NaiveBayesComplement_CommaKeyword_3_2_q.equals(syntax))
				emit_NaiveBayesComplement_CommaKeyword_3_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NaiveBayesComplement_CommaKeyword_4_2_q.equals(syntax))
				emit_NaiveBayesComplement_CommaKeyword_4_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NaiveBayesComplement_CommaKeyword_5_2_q.equals(syntax))
				emit_NaiveBayesComplement_CommaKeyword_5_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NaiveBayesComplement_CommaKeyword_6_2_q.equals(syntax))
				emit_NaiveBayesComplement_CommaKeyword_6_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NaiveBayesGaussian_CommaKeyword_3_2_q.equals(syntax))
				emit_NaiveBayesGaussian_CommaKeyword_3_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NaiveBayesGaussian_CommaKeyword_4_2_q.equals(syntax))
				emit_NaiveBayesGaussian_CommaKeyword_4_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NaiveBayesMultinomial_CommaKeyword_3_2_q.equals(syntax))
				emit_NaiveBayesMultinomial_CommaKeyword_3_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NaiveBayesMultinomial_CommaKeyword_4_2_q.equals(syntax))
				emit_NaiveBayesMultinomial_CommaKeyword_4_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NaiveBayesMultinomial_CommaKeyword_5_2_q.equals(syntax))
				emit_NaiveBayesMultinomial_CommaKeyword_5_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ObjectType_SemicolonKeyword_3_q.equals(syntax))
				emit_ObjectType_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimitiveType_SemicolonKeyword_6_q.equals(syntax))
				emit_PrimitiveType_SemicolonKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Protocol_SemicolonKeyword_3_q.equals(syntax))
				emit_Protocol_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestClassifier_CommaKeyword_10_2_q.equals(syntax))
				emit_RandomForestClassifier_CommaKeyword_10_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestClassifier_CommaKeyword_11_2_q.equals(syntax))
				emit_RandomForestClassifier_CommaKeyword_11_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestClassifier_CommaKeyword_12_2_q.equals(syntax))
				emit_RandomForestClassifier_CommaKeyword_12_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestClassifier_CommaKeyword_13_2_q.equals(syntax))
				emit_RandomForestClassifier_CommaKeyword_13_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestClassifier_CommaKeyword_14_2_q.equals(syntax))
				emit_RandomForestClassifier_CommaKeyword_14_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestClassifier_CommaKeyword_15_2_q.equals(syntax))
				emit_RandomForestClassifier_CommaKeyword_15_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestClassifier_CommaKeyword_16_2_q.equals(syntax))
				emit_RandomForestClassifier_CommaKeyword_16_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestClassifier_CommaKeyword_17_2_q.equals(syntax))
				emit_RandomForestClassifier_CommaKeyword_17_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestClassifier_CommaKeyword_18_2_q.equals(syntax))
				emit_RandomForestClassifier_CommaKeyword_18_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestClassifier_CommaKeyword_19_2_q.equals(syntax))
				emit_RandomForestClassifier_CommaKeyword_19_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestClassifier_CommaKeyword_20_2_q.equals(syntax))
				emit_RandomForestClassifier_CommaKeyword_20_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestClassifier_CommaKeyword_21_2_q.equals(syntax))
				emit_RandomForestClassifier_CommaKeyword_21_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestClassifier_CommaKeyword_3_2_q.equals(syntax))
				emit_RandomForestClassifier_CommaKeyword_3_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestClassifier_CommaKeyword_4_2_q.equals(syntax))
				emit_RandomForestClassifier_CommaKeyword_4_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestClassifier_CommaKeyword_5_2_q.equals(syntax))
				emit_RandomForestClassifier_CommaKeyword_5_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestClassifier_CommaKeyword_6_2_q.equals(syntax))
				emit_RandomForestClassifier_CommaKeyword_6_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestClassifier_CommaKeyword_7_2_q.equals(syntax))
				emit_RandomForestClassifier_CommaKeyword_7_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestClassifier_CommaKeyword_8_2_q.equals(syntax))
				emit_RandomForestClassifier_CommaKeyword_8_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestClassifier_CommaKeyword_9_1_1_q.equals(syntax))
				emit_RandomForestClassifier_CommaKeyword_9_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestRegressor_CommaKeyword_10_2_q.equals(syntax))
				emit_RandomForestRegressor_CommaKeyword_10_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestRegressor_CommaKeyword_11_2_q.equals(syntax))
				emit_RandomForestRegressor_CommaKeyword_11_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestRegressor_CommaKeyword_12_2_q.equals(syntax))
				emit_RandomForestRegressor_CommaKeyword_12_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestRegressor_CommaKeyword_13_2_q.equals(syntax))
				emit_RandomForestRegressor_CommaKeyword_13_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestRegressor_CommaKeyword_14_2_q.equals(syntax))
				emit_RandomForestRegressor_CommaKeyword_14_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestRegressor_CommaKeyword_15_2_q.equals(syntax))
				emit_RandomForestRegressor_CommaKeyword_15_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestRegressor_CommaKeyword_16_2_q.equals(syntax))
				emit_RandomForestRegressor_CommaKeyword_16_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestRegressor_CommaKeyword_17_2_q.equals(syntax))
				emit_RandomForestRegressor_CommaKeyword_17_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestRegressor_CommaKeyword_18_2_q.equals(syntax))
				emit_RandomForestRegressor_CommaKeyword_18_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestRegressor_CommaKeyword_19_2_q.equals(syntax))
				emit_RandomForestRegressor_CommaKeyword_19_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestRegressor_CommaKeyword_20_2_q.equals(syntax))
				emit_RandomForestRegressor_CommaKeyword_20_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestRegressor_CommaKeyword_3_2_q.equals(syntax))
				emit_RandomForestRegressor_CommaKeyword_3_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestRegressor_CommaKeyword_4_2_q.equals(syntax))
				emit_RandomForestRegressor_CommaKeyword_4_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestRegressor_CommaKeyword_5_2_q.equals(syntax))
				emit_RandomForestRegressor_CommaKeyword_5_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestRegressor_CommaKeyword_6_2_q.equals(syntax))
				emit_RandomForestRegressor_CommaKeyword_6_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestRegressor_CommaKeyword_7_2_q.equals(syntax))
				emit_RandomForestRegressor_CommaKeyword_7_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestRegressor_CommaKeyword_8_2_q.equals(syntax))
				emit_RandomForestRegressor_CommaKeyword_8_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForestRegressor_CommaKeyword_9_1_1_q.equals(syntax))
				emit_RandomForestRegressor_CommaKeyword_9_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     random_state=IntegerLiteral (ambiguity) ')' (rule end)
	 *     random_state=IntegerLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     random_state=IntegerLiteral (ambiguity) 'class_weight' class_weight=STRING
	 *     random_state=IntegerLiteral (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     random_state=IntegerLiteral (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     random_state=IntegerLiteral (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 */
	protected void emit_DecisionTreeClassifier_CommaKeyword_10_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) ')' (rule end)
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) 'class_weight' class_weight=STRING
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 */
	protected void emit_DecisionTreeClassifier_CommaKeyword_11_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     min_impurity_decrease=DoubleLiteral (ambiguity) ')' (rule end)
	 *     min_impurity_decrease=DoubleLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     min_impurity_decrease=DoubleLiteral (ambiguity) 'class_weight' class_weight=STRING
	 *     min_impurity_decrease=DoubleLiteral (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 */
	protected void emit_DecisionTreeClassifier_CommaKeyword_12_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     min_impurity_split=DoubleLiteral (ambiguity) ')' (rule end)
	 *     min_impurity_split=DoubleLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     min_impurity_split=DoubleLiteral (ambiguity) 'class_weight' class_weight=STRING
	 */
	protected void emit_DecisionTreeClassifier_CommaKeyword_13_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     class_weight=STRING (ambiguity) ')' (rule end)
	 *     class_weight=STRING (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 */
	protected void emit_DecisionTreeClassifier_CommaKeyword_14_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     ccp_alpha=DoubleLiteral (ambiguity) ')' (rule end)
	 */
	protected void emit_DecisionTreeClassifier_CommaKeyword_15_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     decisionTreeClassifierCriterion=DecisionTreeClassifierCriterion (ambiguity) ')' (rule end)
	 *     decisionTreeClassifierCriterion=DecisionTreeClassifierCriterion (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     decisionTreeClassifierCriterion=DecisionTreeClassifierCriterion (ambiguity) 'class_weight' class_weight=STRING
	 *     decisionTreeClassifierCriterion=DecisionTreeClassifierCriterion (ambiguity) 'max_depth' max_depth=IntegerLiteral
	 *     decisionTreeClassifierCriterion=DecisionTreeClassifierCriterion (ambiguity) 'max_features' max_features_enum=Max_features_enum
	 *     decisionTreeClassifierCriterion=DecisionTreeClassifierCriterion (ambiguity) 'max_features' max_features_numeric=DoubleLiteral
	 *     decisionTreeClassifierCriterion=DecisionTreeClassifierCriterion (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     decisionTreeClassifierCriterion=DecisionTreeClassifierCriterion (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     decisionTreeClassifierCriterion=DecisionTreeClassifierCriterion (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     decisionTreeClassifierCriterion=DecisionTreeClassifierCriterion (ambiguity) 'min_samples_leaf' min_samples_leaf=DoubleLiteral
	 *     decisionTreeClassifierCriterion=DecisionTreeClassifierCriterion (ambiguity) 'min_samples_split' min_samples_split=DoubleLiteral
	 *     decisionTreeClassifierCriterion=DecisionTreeClassifierCriterion (ambiguity) 'min_weight_fraction_leaf' min_weight_fraction_leaf=DoubleLiteral
	 *     decisionTreeClassifierCriterion=DecisionTreeClassifierCriterion (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     decisionTreeClassifierCriterion=DecisionTreeClassifierCriterion (ambiguity) 'splitter' decisionTreeSplitter=DecisionTreeSplitter
	 */
	protected void emit_DecisionTreeClassifier_CommaKeyword_3_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     decisionTreeSplitter=DecisionTreeSplitter (ambiguity) ')' (rule end)
	 *     decisionTreeSplitter=DecisionTreeSplitter (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     decisionTreeSplitter=DecisionTreeSplitter (ambiguity) 'class_weight' class_weight=STRING
	 *     decisionTreeSplitter=DecisionTreeSplitter (ambiguity) 'max_depth' max_depth=IntegerLiteral
	 *     decisionTreeSplitter=DecisionTreeSplitter (ambiguity) 'max_features' max_features_enum=Max_features_enum
	 *     decisionTreeSplitter=DecisionTreeSplitter (ambiguity) 'max_features' max_features_numeric=DoubleLiteral
	 *     decisionTreeSplitter=DecisionTreeSplitter (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     decisionTreeSplitter=DecisionTreeSplitter (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     decisionTreeSplitter=DecisionTreeSplitter (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     decisionTreeSplitter=DecisionTreeSplitter (ambiguity) 'min_samples_leaf' min_samples_leaf=DoubleLiteral
	 *     decisionTreeSplitter=DecisionTreeSplitter (ambiguity) 'min_samples_split' min_samples_split=DoubleLiteral
	 *     decisionTreeSplitter=DecisionTreeSplitter (ambiguity) 'min_weight_fraction_leaf' min_weight_fraction_leaf=DoubleLiteral
	 *     decisionTreeSplitter=DecisionTreeSplitter (ambiguity) 'random_state' random_state=IntegerLiteral
	 */
	protected void emit_DecisionTreeClassifier_CommaKeyword_4_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     max_depth=IntegerLiteral (ambiguity) ')' (rule end)
	 *     max_depth=IntegerLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'class_weight' class_weight=STRING
	 *     max_depth=IntegerLiteral (ambiguity) 'max_features' max_features_enum=Max_features_enum
	 *     max_depth=IntegerLiteral (ambiguity) 'max_features' max_features_numeric=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'min_samples_leaf' min_samples_leaf=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'min_samples_split' min_samples_split=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'min_weight_fraction_leaf' min_weight_fraction_leaf=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 */
	protected void emit_DecisionTreeClassifier_CommaKeyword_5_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     min_samples_split=DoubleLiteral (ambiguity) ')' (rule end)
	 *     min_samples_split=DoubleLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'class_weight' class_weight=STRING
	 *     min_samples_split=DoubleLiteral (ambiguity) 'max_features' max_features_enum=Max_features_enum
	 *     min_samples_split=DoubleLiteral (ambiguity) 'max_features' max_features_numeric=DoubleLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'min_samples_leaf' min_samples_leaf=DoubleLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'min_weight_fraction_leaf' min_weight_fraction_leaf=DoubleLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 */
	protected void emit_DecisionTreeClassifier_CommaKeyword_6_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     min_samples_leaf=DoubleLiteral (ambiguity) ')' (rule end)
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'class_weight' class_weight=STRING
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'max_features' max_features_enum=Max_features_enum
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'max_features' max_features_numeric=DoubleLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'min_weight_fraction_leaf' min_weight_fraction_leaf=DoubleLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 */
	protected void emit_DecisionTreeClassifier_CommaKeyword_7_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) ')' (rule end)
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'class_weight' class_weight=STRING
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'max_features' max_features_enum=Max_features_enum
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'max_features' max_features_numeric=DoubleLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 */
	protected void emit_DecisionTreeClassifier_CommaKeyword_8_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     max_features_enum=Max_features_enum (ambiguity) ')' (rule end)
	 *     max_features_enum=Max_features_enum (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     max_features_enum=Max_features_enum (ambiguity) 'class_weight' class_weight=STRING
	 *     max_features_enum=Max_features_enum (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     max_features_enum=Max_features_enum (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     max_features_enum=Max_features_enum (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     max_features_enum=Max_features_enum (ambiguity) 'random_state' random_state=IntegerLiteral
	 */
	protected void emit_DecisionTreeClassifier_CommaKeyword_9_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     random_state=IntegerLiteral (ambiguity) ')' (rule end)
	 *     random_state=IntegerLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     random_state=IntegerLiteral (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     random_state=IntegerLiteral (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     random_state=IntegerLiteral (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 */
	protected void emit_DecisionTreeRegressor_CommaKeyword_10_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) ')' (rule end)
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 */
	protected void emit_DecisionTreeRegressor_CommaKeyword_11_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     min_impurity_decrease=DoubleLiteral (ambiguity) ')' (rule end)
	 *     min_impurity_decrease=DoubleLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     min_impurity_decrease=DoubleLiteral (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 */
	protected void emit_DecisionTreeRegressor_CommaKeyword_12_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     min_impurity_split=DoubleLiteral (ambiguity) ')' (rule end)
	 *     min_impurity_split=DoubleLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 */
	protected void emit_DecisionTreeRegressor_CommaKeyword_13_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     ccp_alpha=DoubleLiteral (ambiguity) ')' (rule end)
	 */
	protected void emit_DecisionTreeRegressor_CommaKeyword_14_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     decisionTreeRegressorCriterion=DecisionTreeRegressorCriterion (ambiguity) ')' (rule end)
	 *     decisionTreeRegressorCriterion=DecisionTreeRegressorCriterion (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     decisionTreeRegressorCriterion=DecisionTreeRegressorCriterion (ambiguity) 'max_depth' max_depth=IntegerLiteral
	 *     decisionTreeRegressorCriterion=DecisionTreeRegressorCriterion (ambiguity) 'max_features' max_features_enum=Max_features_enum
	 *     decisionTreeRegressorCriterion=DecisionTreeRegressorCriterion (ambiguity) 'max_features' max_features_numeric=DoubleLiteral
	 *     decisionTreeRegressorCriterion=DecisionTreeRegressorCriterion (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     decisionTreeRegressorCriterion=DecisionTreeRegressorCriterion (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     decisionTreeRegressorCriterion=DecisionTreeRegressorCriterion (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     decisionTreeRegressorCriterion=DecisionTreeRegressorCriterion (ambiguity) 'min_samples_leaf' min_samples_leaf=DoubleLiteral
	 *     decisionTreeRegressorCriterion=DecisionTreeRegressorCriterion (ambiguity) 'min_samples_split' min_samples_split=DoubleLiteral
	 *     decisionTreeRegressorCriterion=DecisionTreeRegressorCriterion (ambiguity) 'min_weight_fraction_leaf' min_weight_fraction_leaf=DoubleLiteral
	 *     decisionTreeRegressorCriterion=DecisionTreeRegressorCriterion (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     decisionTreeRegressorCriterion=DecisionTreeRegressorCriterion (ambiguity) 'splitter' decisionTreeSplitter=DecisionTreeSplitter
	 */
	protected void emit_DecisionTreeRegressor_CommaKeyword_3_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     decisionTreeSplitter=DecisionTreeSplitter (ambiguity) ')' (rule end)
	 *     decisionTreeSplitter=DecisionTreeSplitter (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     decisionTreeSplitter=DecisionTreeSplitter (ambiguity) 'max_depth' max_depth=IntegerLiteral
	 *     decisionTreeSplitter=DecisionTreeSplitter (ambiguity) 'max_features' max_features_enum=Max_features_enum
	 *     decisionTreeSplitter=DecisionTreeSplitter (ambiguity) 'max_features' max_features_numeric=DoubleLiteral
	 *     decisionTreeSplitter=DecisionTreeSplitter (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     decisionTreeSplitter=DecisionTreeSplitter (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     decisionTreeSplitter=DecisionTreeSplitter (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     decisionTreeSplitter=DecisionTreeSplitter (ambiguity) 'min_samples_leaf' min_samples_leaf=DoubleLiteral
	 *     decisionTreeSplitter=DecisionTreeSplitter (ambiguity) 'min_samples_split' min_samples_split=DoubleLiteral
	 *     decisionTreeSplitter=DecisionTreeSplitter (ambiguity) 'min_weight_fraction_leaf' min_weight_fraction_leaf=DoubleLiteral
	 *     decisionTreeSplitter=DecisionTreeSplitter (ambiguity) 'random_state' random_state=IntegerLiteral
	 */
	protected void emit_DecisionTreeRegressor_CommaKeyword_4_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     max_depth=IntegerLiteral (ambiguity) ')' (rule end)
	 *     max_depth=IntegerLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'max_features' max_features_enum=Max_features_enum
	 *     max_depth=IntegerLiteral (ambiguity) 'max_features' max_features_numeric=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'min_samples_leaf' min_samples_leaf=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'min_samples_split' min_samples_split=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'min_weight_fraction_leaf' min_weight_fraction_leaf=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 */
	protected void emit_DecisionTreeRegressor_CommaKeyword_5_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     min_samples_split=DoubleLiteral (ambiguity) ')' (rule end)
	 *     min_samples_split=DoubleLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'max_features' max_features_enum=Max_features_enum
	 *     min_samples_split=DoubleLiteral (ambiguity) 'max_features' max_features_numeric=DoubleLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'min_samples_leaf' min_samples_leaf=DoubleLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'min_weight_fraction_leaf' min_weight_fraction_leaf=DoubleLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 */
	protected void emit_DecisionTreeRegressor_CommaKeyword_6_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     min_samples_leaf=DoubleLiteral (ambiguity) ')' (rule end)
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'max_features' max_features_enum=Max_features_enum
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'max_features' max_features_numeric=DoubleLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'min_weight_fraction_leaf' min_weight_fraction_leaf=DoubleLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 */
	protected void emit_DecisionTreeRegressor_CommaKeyword_7_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) ')' (rule end)
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'max_features' max_features_enum=Max_features_enum
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'max_features' max_features_numeric=DoubleLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 */
	protected void emit_DecisionTreeRegressor_CommaKeyword_8_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     max_features_enum=Max_features_enum (ambiguity) ')' (rule end)
	 *     max_features_enum=Max_features_enum (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     max_features_enum=Max_features_enum (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     max_features_enum=Max_features_enum (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     max_features_enum=Max_features_enum (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     max_features_enum=Max_features_enum (ambiguity) 'random_state' random_state=IntegerLiteral
	 */
	protected void emit_DecisionTreeRegressor_CommaKeyword_9_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     random_state=IntegerLiteral (ambiguity) ')' (rule end)
	 *     random_state=IntegerLiteral (ambiguity) 'l1_ratio' l1_ratio=DoubleLiteral
	 *     random_state=IntegerLiteral (ambiguity) 'max_iter' max_iter=IntegerLiteral
	 *     random_state=IntegerLiteral (ambiguity) 'multi_class' multi_class=Multi_class
	 *     random_state=IntegerLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     random_state=IntegerLiteral (ambiguity) 'solver' optimizer=Optimizer
	 *     random_state=IntegerLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     random_state=IntegerLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_LinearClassifierLogisticRegression_CommaKeyword_10_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     optimizer=Optimizer (ambiguity) ')' (rule end)
	 *     optimizer=Optimizer (ambiguity) 'l1_ratio' l1_ratio=DoubleLiteral
	 *     optimizer=Optimizer (ambiguity) 'max_iter' max_iter=IntegerLiteral
	 *     optimizer=Optimizer (ambiguity) 'multi_class' multi_class=Multi_class
	 *     optimizer=Optimizer (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     optimizer=Optimizer (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     optimizer=Optimizer (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_LinearClassifierLogisticRegression_CommaKeyword_11_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     max_iter=IntegerLiteral (ambiguity) ')' (rule end)
	 *     max_iter=IntegerLiteral (ambiguity) 'l1_ratio' l1_ratio=DoubleLiteral
	 *     max_iter=IntegerLiteral (ambiguity) 'multi_class' multi_class=Multi_class
	 *     max_iter=IntegerLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     max_iter=IntegerLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     max_iter=IntegerLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_LinearClassifierLogisticRegression_CommaKeyword_12_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     multi_class=Multi_class (ambiguity) ')' (rule end)
	 *     multi_class=Multi_class (ambiguity) 'l1_ratio' l1_ratio=DoubleLiteral
	 *     multi_class=Multi_class (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     multi_class=Multi_class (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     multi_class=Multi_class (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_LinearClassifierLogisticRegression_CommaKeyword_13_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     verbose=IntegerLiteral (ambiguity) ')' (rule end)
	 *     verbose=IntegerLiteral (ambiguity) 'l1_ratio' l1_ratio=DoubleLiteral
	 *     verbose=IntegerLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     verbose=IntegerLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_LinearClassifierLogisticRegression_CommaKeyword_14_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     warm_start=BooleanLiteral (ambiguity) ')' (rule end)
	 *     warm_start=BooleanLiteral (ambiguity) 'l1_ratio' l1_ratio=DoubleLiteral
	 *     warm_start=BooleanLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 */
	protected void emit_LinearClassifierLogisticRegression_CommaKeyword_15_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     n_jobs=IntegerLiteral (ambiguity) ')' (rule end)
	 *     n_jobs=IntegerLiteral (ambiguity) 'l1_ratio' l1_ratio=DoubleLiteral
	 */
	protected void emit_LinearClassifierLogisticRegression_CommaKeyword_16_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     l1_ratio=DoubleLiteral (ambiguity) ')' (rule end)
	 */
	protected void emit_LinearClassifierLogisticRegression_CommaKeyword_17_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     penalty=Penalty (ambiguity) ')' (rule end)
	 *     penalty=Penalty (ambiguity) 'C' c=DoubleLiteral
	 *     penalty=Penalty (ambiguity) 'class_weight' class_weight=STRING
	 *     penalty=Penalty (ambiguity) 'dual' dual=BooleanLiteral
	 *     penalty=Penalty (ambiguity) 'fit_intercept' fit_intercept=BooleanLiteral
	 *     penalty=Penalty (ambiguity) 'intercept_scaling' intercept_scaling=DoubleLiteral
	 *     penalty=Penalty (ambiguity) 'l1_ratio' l1_ratio=DoubleLiteral
	 *     penalty=Penalty (ambiguity) 'max_iter' max_iter=IntegerLiteral
	 *     penalty=Penalty (ambiguity) 'multi_class' multi_class=Multi_class
	 *     penalty=Penalty (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     penalty=Penalty (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     penalty=Penalty (ambiguity) 'solver' optimizer=Optimizer
	 *     penalty=Penalty (ambiguity) 'tol' tol=DoubleLiteral
	 *     penalty=Penalty (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     penalty=Penalty (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_LinearClassifierLogisticRegression_CommaKeyword_3_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     dual=BooleanLiteral (ambiguity) ')' (rule end)
	 *     dual=BooleanLiteral (ambiguity) 'C' c=DoubleLiteral
	 *     dual=BooleanLiteral (ambiguity) 'class_weight' class_weight=STRING
	 *     dual=BooleanLiteral (ambiguity) 'fit_intercept' fit_intercept=BooleanLiteral
	 *     dual=BooleanLiteral (ambiguity) 'intercept_scaling' intercept_scaling=DoubleLiteral
	 *     dual=BooleanLiteral (ambiguity) 'l1_ratio' l1_ratio=DoubleLiteral
	 *     dual=BooleanLiteral (ambiguity) 'max_iter' max_iter=IntegerLiteral
	 *     dual=BooleanLiteral (ambiguity) 'multi_class' multi_class=Multi_class
	 *     dual=BooleanLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     dual=BooleanLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     dual=BooleanLiteral (ambiguity) 'solver' optimizer=Optimizer
	 *     dual=BooleanLiteral (ambiguity) 'tol' tol=DoubleLiteral
	 *     dual=BooleanLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     dual=BooleanLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_LinearClassifierLogisticRegression_CommaKeyword_4_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     tol=DoubleLiteral (ambiguity) ')' (rule end)
	 *     tol=DoubleLiteral (ambiguity) 'C' c=DoubleLiteral
	 *     tol=DoubleLiteral (ambiguity) 'class_weight' class_weight=STRING
	 *     tol=DoubleLiteral (ambiguity) 'fit_intercept' fit_intercept=BooleanLiteral
	 *     tol=DoubleLiteral (ambiguity) 'intercept_scaling' intercept_scaling=DoubleLiteral
	 *     tol=DoubleLiteral (ambiguity) 'l1_ratio' l1_ratio=DoubleLiteral
	 *     tol=DoubleLiteral (ambiguity) 'max_iter' max_iter=IntegerLiteral
	 *     tol=DoubleLiteral (ambiguity) 'multi_class' multi_class=Multi_class
	 *     tol=DoubleLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     tol=DoubleLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     tol=DoubleLiteral (ambiguity) 'solver' optimizer=Optimizer
	 *     tol=DoubleLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     tol=DoubleLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_LinearClassifierLogisticRegression_CommaKeyword_5_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     c=DoubleLiteral (ambiguity) ')' (rule end)
	 *     c=DoubleLiteral (ambiguity) 'class_weight' class_weight=STRING
	 *     c=DoubleLiteral (ambiguity) 'fit_intercept' fit_intercept=BooleanLiteral
	 *     c=DoubleLiteral (ambiguity) 'intercept_scaling' intercept_scaling=DoubleLiteral
	 *     c=DoubleLiteral (ambiguity) 'l1_ratio' l1_ratio=DoubleLiteral
	 *     c=DoubleLiteral (ambiguity) 'max_iter' max_iter=IntegerLiteral
	 *     c=DoubleLiteral (ambiguity) 'multi_class' multi_class=Multi_class
	 *     c=DoubleLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     c=DoubleLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     c=DoubleLiteral (ambiguity) 'solver' optimizer=Optimizer
	 *     c=DoubleLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     c=DoubleLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_LinearClassifierLogisticRegression_CommaKeyword_6_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     fit_intercept=BooleanLiteral (ambiguity) ')' (rule end)
	 *     fit_intercept=BooleanLiteral (ambiguity) 'class_weight' class_weight=STRING
	 *     fit_intercept=BooleanLiteral (ambiguity) 'intercept_scaling' intercept_scaling=DoubleLiteral
	 *     fit_intercept=BooleanLiteral (ambiguity) 'l1_ratio' l1_ratio=DoubleLiteral
	 *     fit_intercept=BooleanLiteral (ambiguity) 'max_iter' max_iter=IntegerLiteral
	 *     fit_intercept=BooleanLiteral (ambiguity) 'multi_class' multi_class=Multi_class
	 *     fit_intercept=BooleanLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     fit_intercept=BooleanLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     fit_intercept=BooleanLiteral (ambiguity) 'solver' optimizer=Optimizer
	 *     fit_intercept=BooleanLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     fit_intercept=BooleanLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_LinearClassifierLogisticRegression_CommaKeyword_7_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     intercept_scaling=DoubleLiteral (ambiguity) ')' (rule end)
	 *     intercept_scaling=DoubleLiteral (ambiguity) 'class_weight' class_weight=STRING
	 *     intercept_scaling=DoubleLiteral (ambiguity) 'l1_ratio' l1_ratio=DoubleLiteral
	 *     intercept_scaling=DoubleLiteral (ambiguity) 'max_iter' max_iter=IntegerLiteral
	 *     intercept_scaling=DoubleLiteral (ambiguity) 'multi_class' multi_class=Multi_class
	 *     intercept_scaling=DoubleLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     intercept_scaling=DoubleLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     intercept_scaling=DoubleLiteral (ambiguity) 'solver' optimizer=Optimizer
	 *     intercept_scaling=DoubleLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     intercept_scaling=DoubleLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_LinearClassifierLogisticRegression_CommaKeyword_8_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     class_weight=STRING (ambiguity) ')' (rule end)
	 *     class_weight=STRING (ambiguity) 'l1_ratio' l1_ratio=DoubleLiteral
	 *     class_weight=STRING (ambiguity) 'max_iter' max_iter=IntegerLiteral
	 *     class_weight=STRING (ambiguity) 'multi_class' multi_class=Multi_class
	 *     class_weight=STRING (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     class_weight=STRING (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     class_weight=STRING (ambiguity) 'solver' optimizer=Optimizer
	 *     class_weight=STRING (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     class_weight=STRING (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_LinearClassifierLogisticRegression_CommaKeyword_9_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     fit_intercept=BooleanLiteral (ambiguity) ')' (rule end)
	 *     fit_intercept=BooleanLiteral (ambiguity) 'copy_X' copy_X=BooleanLiteral
	 *     fit_intercept=BooleanLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     fit_intercept=BooleanLiteral (ambiguity) 'normalize' normalize=BooleanLiteral
	 *     fit_intercept=BooleanLiteral (ambiguity) 'positive' positive=BooleanLiteral
	 */
	protected void emit_LinearRegression_CommaKeyword_3_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     normalize=BooleanLiteral (ambiguity) ')' (rule end)
	 *     normalize=BooleanLiteral (ambiguity) 'copy_X' copy_X=BooleanLiteral
	 *     normalize=BooleanLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     normalize=BooleanLiteral (ambiguity) 'positive' positive=BooleanLiteral
	 */
	protected void emit_LinearRegression_CommaKeyword_4_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     copy_X=BooleanLiteral (ambiguity) ')' (rule end)
	 *     copy_X=BooleanLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     copy_X=BooleanLiteral (ambiguity) 'positive' positive=BooleanLiteral
	 */
	protected void emit_LinearRegression_CommaKeyword_5_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     n_jobs=IntegerLiteral (ambiguity) ')' (rule end)
	 *     n_jobs=IntegerLiteral (ambiguity) 'positive' positive=BooleanLiteral
	 */
	protected void emit_LinearRegression_CommaKeyword_6_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     positive=BooleanLiteral (ambiguity) ')' (rule end)
	 */
	protected void emit_LinearRegression_CommaKeyword_7_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     annotations+=PlatformAnnotation (ambiguity) (rule end)
	 *     name=ID '(' ')' (ambiguity) (rule end)
	 *     parameters+=Parameter ')' (ambiguity) (rule end)
	 */
	protected void emit_Message_SemicolonKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     power_t=DoubleLiteral (ambiguity) ')' (rule end)
	 *     power_t=DoubleLiteral (ambiguity) 'beta_1' beta_1=DoubleLiteral
	 *     power_t=DoubleLiteral (ambiguity) 'beta_2' beta_2=DoubleLiteral
	 *     power_t=DoubleLiteral (ambiguity) 'early_stopping' early_stopping=BooleanLiteral
	 *     power_t=DoubleLiteral (ambiguity) 'epochs' epochs=IntegerLiteral
	 *     power_t=DoubleLiteral (ambiguity) 'epsilon' epsilon=DoubleLiteral
	 *     power_t=DoubleLiteral (ambiguity) 'loss' loss=Loss
	 *     power_t=DoubleLiteral (ambiguity) 'max_fun' max_fun=IntegerLiteral
	 *     power_t=DoubleLiteral (ambiguity) 'max_iter' max_iter=IntegerLiteral
	 *     power_t=DoubleLiteral (ambiguity) 'momentum' momentum=DoubleLiteral
	 *     power_t=DoubleLiteral (ambiguity) 'n_iter_no_change' n_iter_no_change=IntegerLiteral
	 *     power_t=DoubleLiteral (ambiguity) 'nesterovs_momentum' nesterovs_momentum=BooleanLiteral
	 *     power_t=DoubleLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     power_t=DoubleLiteral (ambiguity) 'shuffle' shuffle=BooleanLiteral
	 *     power_t=DoubleLiteral (ambiguity) 'tol' tol=DoubleLiteral
	 *     power_t=DoubleLiteral (ambiguity) 'validation_fraction' validation_fraction=DoubleLiteral
	 *     power_t=DoubleLiteral (ambiguity) 'verbose' verbose=BooleanLiteral
	 *     power_t=DoubleLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_10_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     max_iter=IntegerLiteral (ambiguity) ')' (rule end)
	 *     max_iter=IntegerLiteral (ambiguity) 'beta_1' beta_1=DoubleLiteral
	 *     max_iter=IntegerLiteral (ambiguity) 'beta_2' beta_2=DoubleLiteral
	 *     max_iter=IntegerLiteral (ambiguity) 'early_stopping' early_stopping=BooleanLiteral
	 *     max_iter=IntegerLiteral (ambiguity) 'epochs' epochs=IntegerLiteral
	 *     max_iter=IntegerLiteral (ambiguity) 'epsilon' epsilon=DoubleLiteral
	 *     max_iter=IntegerLiteral (ambiguity) 'loss' loss=Loss
	 *     max_iter=IntegerLiteral (ambiguity) 'max_fun' max_fun=IntegerLiteral
	 *     max_iter=IntegerLiteral (ambiguity) 'momentum' momentum=DoubleLiteral
	 *     max_iter=IntegerLiteral (ambiguity) 'n_iter_no_change' n_iter_no_change=IntegerLiteral
	 *     max_iter=IntegerLiteral (ambiguity) 'nesterovs_momentum' nesterovs_momentum=BooleanLiteral
	 *     max_iter=IntegerLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     max_iter=IntegerLiteral (ambiguity) 'shuffle' shuffle=BooleanLiteral
	 *     max_iter=IntegerLiteral (ambiguity) 'tol' tol=DoubleLiteral
	 *     max_iter=IntegerLiteral (ambiguity) 'validation_fraction' validation_fraction=DoubleLiteral
	 *     max_iter=IntegerLiteral (ambiguity) 'verbose' verbose=BooleanLiteral
	 *     max_iter=IntegerLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_11_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     shuffle=BooleanLiteral (ambiguity) ')' (rule end)
	 *     shuffle=BooleanLiteral (ambiguity) 'beta_1' beta_1=DoubleLiteral
	 *     shuffle=BooleanLiteral (ambiguity) 'beta_2' beta_2=DoubleLiteral
	 *     shuffle=BooleanLiteral (ambiguity) 'early_stopping' early_stopping=BooleanLiteral
	 *     shuffle=BooleanLiteral (ambiguity) 'epochs' epochs=IntegerLiteral
	 *     shuffle=BooleanLiteral (ambiguity) 'epsilon' epsilon=DoubleLiteral
	 *     shuffle=BooleanLiteral (ambiguity) 'loss' loss=Loss
	 *     shuffle=BooleanLiteral (ambiguity) 'max_fun' max_fun=IntegerLiteral
	 *     shuffle=BooleanLiteral (ambiguity) 'momentum' momentum=DoubleLiteral
	 *     shuffle=BooleanLiteral (ambiguity) 'n_iter_no_change' n_iter_no_change=IntegerLiteral
	 *     shuffle=BooleanLiteral (ambiguity) 'nesterovs_momentum' nesterovs_momentum=BooleanLiteral
	 *     shuffle=BooleanLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     shuffle=BooleanLiteral (ambiguity) 'tol' tol=DoubleLiteral
	 *     shuffle=BooleanLiteral (ambiguity) 'validation_fraction' validation_fraction=DoubleLiteral
	 *     shuffle=BooleanLiteral (ambiguity) 'verbose' verbose=BooleanLiteral
	 *     shuffle=BooleanLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_12_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     random_state=IntegerLiteral (ambiguity) ')' (rule end)
	 *     random_state=IntegerLiteral (ambiguity) 'beta_1' beta_1=DoubleLiteral
	 *     random_state=IntegerLiteral (ambiguity) 'beta_2' beta_2=DoubleLiteral
	 *     random_state=IntegerLiteral (ambiguity) 'early_stopping' early_stopping=BooleanLiteral
	 *     random_state=IntegerLiteral (ambiguity) 'epochs' epochs=IntegerLiteral
	 *     random_state=IntegerLiteral (ambiguity) 'epsilon' epsilon=DoubleLiteral
	 *     random_state=IntegerLiteral (ambiguity) 'loss' loss=Loss
	 *     random_state=IntegerLiteral (ambiguity) 'max_fun' max_fun=IntegerLiteral
	 *     random_state=IntegerLiteral (ambiguity) 'momentum' momentum=DoubleLiteral
	 *     random_state=IntegerLiteral (ambiguity) 'n_iter_no_change' n_iter_no_change=IntegerLiteral
	 *     random_state=IntegerLiteral (ambiguity) 'nesterovs_momentum' nesterovs_momentum=BooleanLiteral
	 *     random_state=IntegerLiteral (ambiguity) 'tol' tol=DoubleLiteral
	 *     random_state=IntegerLiteral (ambiguity) 'validation_fraction' validation_fraction=DoubleLiteral
	 *     random_state=IntegerLiteral (ambiguity) 'verbose' verbose=BooleanLiteral
	 *     random_state=IntegerLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_13_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     tol=DoubleLiteral (ambiguity) ')' (rule end)
	 *     tol=DoubleLiteral (ambiguity) 'beta_1' beta_1=DoubleLiteral
	 *     tol=DoubleLiteral (ambiguity) 'beta_2' beta_2=DoubleLiteral
	 *     tol=DoubleLiteral (ambiguity) 'early_stopping' early_stopping=BooleanLiteral
	 *     tol=DoubleLiteral (ambiguity) 'epochs' epochs=IntegerLiteral
	 *     tol=DoubleLiteral (ambiguity) 'epsilon' epsilon=DoubleLiteral
	 *     tol=DoubleLiteral (ambiguity) 'loss' loss=Loss
	 *     tol=DoubleLiteral (ambiguity) 'max_fun' max_fun=IntegerLiteral
	 *     tol=DoubleLiteral (ambiguity) 'momentum' momentum=DoubleLiteral
	 *     tol=DoubleLiteral (ambiguity) 'n_iter_no_change' n_iter_no_change=IntegerLiteral
	 *     tol=DoubleLiteral (ambiguity) 'nesterovs_momentum' nesterovs_momentum=BooleanLiteral
	 *     tol=DoubleLiteral (ambiguity) 'validation_fraction' validation_fraction=DoubleLiteral
	 *     tol=DoubleLiteral (ambiguity) 'verbose' verbose=BooleanLiteral
	 *     tol=DoubleLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_14_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     verbose=BooleanLiteral (ambiguity) ')' (rule end)
	 *     verbose=BooleanLiteral (ambiguity) 'beta_1' beta_1=DoubleLiteral
	 *     verbose=BooleanLiteral (ambiguity) 'beta_2' beta_2=DoubleLiteral
	 *     verbose=BooleanLiteral (ambiguity) 'early_stopping' early_stopping=BooleanLiteral
	 *     verbose=BooleanLiteral (ambiguity) 'epochs' epochs=IntegerLiteral
	 *     verbose=BooleanLiteral (ambiguity) 'epsilon' epsilon=DoubleLiteral
	 *     verbose=BooleanLiteral (ambiguity) 'loss' loss=Loss
	 *     verbose=BooleanLiteral (ambiguity) 'max_fun' max_fun=IntegerLiteral
	 *     verbose=BooleanLiteral (ambiguity) 'momentum' momentum=DoubleLiteral
	 *     verbose=BooleanLiteral (ambiguity) 'n_iter_no_change' n_iter_no_change=IntegerLiteral
	 *     verbose=BooleanLiteral (ambiguity) 'nesterovs_momentum' nesterovs_momentum=BooleanLiteral
	 *     verbose=BooleanLiteral (ambiguity) 'validation_fraction' validation_fraction=DoubleLiteral
	 *     verbose=BooleanLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_15_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     warm_start=BooleanLiteral (ambiguity) ')' (rule end)
	 *     warm_start=BooleanLiteral (ambiguity) 'beta_1' beta_1=DoubleLiteral
	 *     warm_start=BooleanLiteral (ambiguity) 'beta_2' beta_2=DoubleLiteral
	 *     warm_start=BooleanLiteral (ambiguity) 'early_stopping' early_stopping=BooleanLiteral
	 *     warm_start=BooleanLiteral (ambiguity) 'epochs' epochs=IntegerLiteral
	 *     warm_start=BooleanLiteral (ambiguity) 'epsilon' epsilon=DoubleLiteral
	 *     warm_start=BooleanLiteral (ambiguity) 'loss' loss=Loss
	 *     warm_start=BooleanLiteral (ambiguity) 'max_fun' max_fun=IntegerLiteral
	 *     warm_start=BooleanLiteral (ambiguity) 'momentum' momentum=DoubleLiteral
	 *     warm_start=BooleanLiteral (ambiguity) 'n_iter_no_change' n_iter_no_change=IntegerLiteral
	 *     warm_start=BooleanLiteral (ambiguity) 'nesterovs_momentum' nesterovs_momentum=BooleanLiteral
	 *     warm_start=BooleanLiteral (ambiguity) 'validation_fraction' validation_fraction=DoubleLiteral
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_16_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     momentum=DoubleLiteral (ambiguity) ')' (rule end)
	 *     momentum=DoubleLiteral (ambiguity) 'beta_1' beta_1=DoubleLiteral
	 *     momentum=DoubleLiteral (ambiguity) 'beta_2' beta_2=DoubleLiteral
	 *     momentum=DoubleLiteral (ambiguity) 'early_stopping' early_stopping=BooleanLiteral
	 *     momentum=DoubleLiteral (ambiguity) 'epochs' epochs=IntegerLiteral
	 *     momentum=DoubleLiteral (ambiguity) 'epsilon' epsilon=DoubleLiteral
	 *     momentum=DoubleLiteral (ambiguity) 'loss' loss=Loss
	 *     momentum=DoubleLiteral (ambiguity) 'max_fun' max_fun=IntegerLiteral
	 *     momentum=DoubleLiteral (ambiguity) 'n_iter_no_change' n_iter_no_change=IntegerLiteral
	 *     momentum=DoubleLiteral (ambiguity) 'nesterovs_momentum' nesterovs_momentum=BooleanLiteral
	 *     momentum=DoubleLiteral (ambiguity) 'validation_fraction' validation_fraction=DoubleLiteral
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_17_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     nesterovs_momentum=BooleanLiteral (ambiguity) ')' (rule end)
	 *     nesterovs_momentum=BooleanLiteral (ambiguity) 'beta_1' beta_1=DoubleLiteral
	 *     nesterovs_momentum=BooleanLiteral (ambiguity) 'beta_2' beta_2=DoubleLiteral
	 *     nesterovs_momentum=BooleanLiteral (ambiguity) 'early_stopping' early_stopping=BooleanLiteral
	 *     nesterovs_momentum=BooleanLiteral (ambiguity) 'epochs' epochs=IntegerLiteral
	 *     nesterovs_momentum=BooleanLiteral (ambiguity) 'epsilon' epsilon=DoubleLiteral
	 *     nesterovs_momentum=BooleanLiteral (ambiguity) 'loss' loss=Loss
	 *     nesterovs_momentum=BooleanLiteral (ambiguity) 'max_fun' max_fun=IntegerLiteral
	 *     nesterovs_momentum=BooleanLiteral (ambiguity) 'n_iter_no_change' n_iter_no_change=IntegerLiteral
	 *     nesterovs_momentum=BooleanLiteral (ambiguity) 'validation_fraction' validation_fraction=DoubleLiteral
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_18_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     early_stopping=BooleanLiteral (ambiguity) ')' (rule end)
	 *     early_stopping=BooleanLiteral (ambiguity) 'beta_1' beta_1=DoubleLiteral
	 *     early_stopping=BooleanLiteral (ambiguity) 'beta_2' beta_2=DoubleLiteral
	 *     early_stopping=BooleanLiteral (ambiguity) 'epochs' epochs=IntegerLiteral
	 *     early_stopping=BooleanLiteral (ambiguity) 'epsilon' epsilon=DoubleLiteral
	 *     early_stopping=BooleanLiteral (ambiguity) 'loss' loss=Loss
	 *     early_stopping=BooleanLiteral (ambiguity) 'max_fun' max_fun=IntegerLiteral
	 *     early_stopping=BooleanLiteral (ambiguity) 'n_iter_no_change' n_iter_no_change=IntegerLiteral
	 *     early_stopping=BooleanLiteral (ambiguity) 'validation_fraction' validation_fraction=DoubleLiteral
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_19_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     validation_fraction=DoubleLiteral (ambiguity) ')' (rule end)
	 *     validation_fraction=DoubleLiteral (ambiguity) 'beta_1' beta_1=DoubleLiteral
	 *     validation_fraction=DoubleLiteral (ambiguity) 'beta_2' beta_2=DoubleLiteral
	 *     validation_fraction=DoubleLiteral (ambiguity) 'epochs' epochs=IntegerLiteral
	 *     validation_fraction=DoubleLiteral (ambiguity) 'epsilon' epsilon=DoubleLiteral
	 *     validation_fraction=DoubleLiteral (ambiguity) 'loss' loss=Loss
	 *     validation_fraction=DoubleLiteral (ambiguity) 'max_fun' max_fun=IntegerLiteral
	 *     validation_fraction=DoubleLiteral (ambiguity) 'n_iter_no_change' n_iter_no_change=IntegerLiteral
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_20_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     beta_1=DoubleLiteral (ambiguity) ')' (rule end)
	 *     beta_1=DoubleLiteral (ambiguity) 'beta_2' beta_2=DoubleLiteral
	 *     beta_1=DoubleLiteral (ambiguity) 'epochs' epochs=IntegerLiteral
	 *     beta_1=DoubleLiteral (ambiguity) 'epsilon' epsilon=DoubleLiteral
	 *     beta_1=DoubleLiteral (ambiguity) 'loss' loss=Loss
	 *     beta_1=DoubleLiteral (ambiguity) 'max_fun' max_fun=IntegerLiteral
	 *     beta_1=DoubleLiteral (ambiguity) 'n_iter_no_change' n_iter_no_change=IntegerLiteral
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_21_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     beta_2=DoubleLiteral (ambiguity) ')' (rule end)
	 *     beta_2=DoubleLiteral (ambiguity) 'epochs' epochs=IntegerLiteral
	 *     beta_2=DoubleLiteral (ambiguity) 'epsilon' epsilon=DoubleLiteral
	 *     beta_2=DoubleLiteral (ambiguity) 'loss' loss=Loss
	 *     beta_2=DoubleLiteral (ambiguity) 'max_fun' max_fun=IntegerLiteral
	 *     beta_2=DoubleLiteral (ambiguity) 'n_iter_no_change' n_iter_no_change=IntegerLiteral
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_22_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     epsilon=DoubleLiteral (ambiguity) ')' (rule end)
	 *     epsilon=DoubleLiteral (ambiguity) 'epochs' epochs=IntegerLiteral
	 *     epsilon=DoubleLiteral (ambiguity) 'loss' loss=Loss
	 *     epsilon=DoubleLiteral (ambiguity) 'max_fun' max_fun=IntegerLiteral
	 *     epsilon=DoubleLiteral (ambiguity) 'n_iter_no_change' n_iter_no_change=IntegerLiteral
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_23_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     n_iter_no_change=IntegerLiteral (ambiguity) ')' (rule end)
	 *     n_iter_no_change=IntegerLiteral (ambiguity) 'epochs' epochs=IntegerLiteral
	 *     n_iter_no_change=IntegerLiteral (ambiguity) 'loss' loss=Loss
	 *     n_iter_no_change=IntegerLiteral (ambiguity) 'max_fun' max_fun=IntegerLiteral
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_24_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     max_fun=IntegerLiteral (ambiguity) ')' (rule end)
	 *     max_fun=IntegerLiteral (ambiguity) 'epochs' epochs=IntegerLiteral
	 *     max_fun=IntegerLiteral (ambiguity) 'loss' loss=Loss
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_25_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     loss=Loss (ambiguity) ')' (rule end)
	 *     loss=Loss (ambiguity) 'epochs' epochs=IntegerLiteral
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_26_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     epochs=IntegerLiteral (ambiguity) ')' (rule end)
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_27_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     hidden_layer_sizes='(' ')' (ambiguity) ')' (rule end)
	 *     hidden_layer_sizes='(' ')' (ambiguity) 'activation' activation=Activation
	 *     hidden_layer_sizes='(' ')' (ambiguity) 'alpha' alpha=DoubleLiteral
	 *     hidden_layer_sizes='(' ')' (ambiguity) 'batch_size' batch_size=IntegerLiteral
	 *     hidden_layer_sizes='(' ')' (ambiguity) 'beta_1' beta_1=DoubleLiteral
	 *     hidden_layer_sizes='(' ')' (ambiguity) 'beta_2' beta_2=DoubleLiteral
	 *     hidden_layer_sizes='(' ')' (ambiguity) 'early_stopping' early_stopping=BooleanLiteral
	 *     hidden_layer_sizes='(' ')' (ambiguity) 'epochs' epochs=IntegerLiteral
	 *     hidden_layer_sizes='(' ')' (ambiguity) 'epsilon' epsilon=DoubleLiteral
	 *     hidden_layer_sizes='(' ')' (ambiguity) 'learning_rate_init' learning_rate_init=STRING
	 *     hidden_layer_sizes='(' ')' (ambiguity) 'learning_rate_mode' learning_rate_mode=Learning_rate_mode
	 *     hidden_layer_sizes='(' ')' (ambiguity) 'loss' loss=Loss
	 *     hidden_layer_sizes='(' ')' (ambiguity) 'max_fun' max_fun=IntegerLiteral
	 *     hidden_layer_sizes='(' ')' (ambiguity) 'max_iter' max_iter=IntegerLiteral
	 *     hidden_layer_sizes='(' ')' (ambiguity) 'momentum' momentum=DoubleLiteral
	 *     hidden_layer_sizes='(' ')' (ambiguity) 'n_iter_no_change' n_iter_no_change=IntegerLiteral
	 *     hidden_layer_sizes='(' ')' (ambiguity) 'nesterovs_momentum' nesterovs_momentum=BooleanLiteral
	 *     hidden_layer_sizes='(' ')' (ambiguity) 'optimizer' optimizer=Optimizer
	 *     hidden_layer_sizes='(' ')' (ambiguity) 'power_t' power_t=DoubleLiteral
	 *     hidden_layer_sizes='(' ')' (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     hidden_layer_sizes='(' ')' (ambiguity) 'shuffle' shuffle=BooleanLiteral
	 *     hidden_layer_sizes='(' ')' (ambiguity) 'tol' tol=DoubleLiteral
	 *     hidden_layer_sizes='(' ')' (ambiguity) 'validation_fraction' validation_fraction=DoubleLiteral
	 *     hidden_layer_sizes='(' ')' (ambiguity) 'verbose' verbose=BooleanLiteral
	 *     hidden_layer_sizes='(' ')' (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 *     hidden_layers+=IntegerLiteral ')' (ambiguity) ')' (rule end)
	 *     hidden_layers+=IntegerLiteral ')' (ambiguity) 'activation' activation=Activation
	 *     hidden_layers+=IntegerLiteral ')' (ambiguity) 'alpha' alpha=DoubleLiteral
	 *     hidden_layers+=IntegerLiteral ')' (ambiguity) 'batch_size' batch_size=IntegerLiteral
	 *     hidden_layers+=IntegerLiteral ')' (ambiguity) 'beta_1' beta_1=DoubleLiteral
	 *     hidden_layers+=IntegerLiteral ')' (ambiguity) 'beta_2' beta_2=DoubleLiteral
	 *     hidden_layers+=IntegerLiteral ')' (ambiguity) 'early_stopping' early_stopping=BooleanLiteral
	 *     hidden_layers+=IntegerLiteral ')' (ambiguity) 'epochs' epochs=IntegerLiteral
	 *     hidden_layers+=IntegerLiteral ')' (ambiguity) 'epsilon' epsilon=DoubleLiteral
	 *     hidden_layers+=IntegerLiteral ')' (ambiguity) 'learning_rate_init' learning_rate_init=STRING
	 *     hidden_layers+=IntegerLiteral ')' (ambiguity) 'learning_rate_mode' learning_rate_mode=Learning_rate_mode
	 *     hidden_layers+=IntegerLiteral ')' (ambiguity) 'loss' loss=Loss
	 *     hidden_layers+=IntegerLiteral ')' (ambiguity) 'max_fun' max_fun=IntegerLiteral
	 *     hidden_layers+=IntegerLiteral ')' (ambiguity) 'max_iter' max_iter=IntegerLiteral
	 *     hidden_layers+=IntegerLiteral ')' (ambiguity) 'momentum' momentum=DoubleLiteral
	 *     hidden_layers+=IntegerLiteral ')' (ambiguity) 'n_iter_no_change' n_iter_no_change=IntegerLiteral
	 *     hidden_layers+=IntegerLiteral ')' (ambiguity) 'nesterovs_momentum' nesterovs_momentum=BooleanLiteral
	 *     hidden_layers+=IntegerLiteral ')' (ambiguity) 'optimizer' optimizer=Optimizer
	 *     hidden_layers+=IntegerLiteral ')' (ambiguity) 'power_t' power_t=DoubleLiteral
	 *     hidden_layers+=IntegerLiteral ')' (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     hidden_layers+=IntegerLiteral ')' (ambiguity) 'shuffle' shuffle=BooleanLiteral
	 *     hidden_layers+=IntegerLiteral ')' (ambiguity) 'tol' tol=DoubleLiteral
	 *     hidden_layers+=IntegerLiteral ')' (ambiguity) 'validation_fraction' validation_fraction=DoubleLiteral
	 *     hidden_layers+=IntegerLiteral ')' (ambiguity) 'verbose' verbose=BooleanLiteral
	 *     hidden_layers+=IntegerLiteral ')' (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_3_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     activation=Activation (ambiguity) ')' (rule end)
	 *     activation=Activation (ambiguity) 'alpha' alpha=DoubleLiteral
	 *     activation=Activation (ambiguity) 'batch_size' batch_size=IntegerLiteral
	 *     activation=Activation (ambiguity) 'beta_1' beta_1=DoubleLiteral
	 *     activation=Activation (ambiguity) 'beta_2' beta_2=DoubleLiteral
	 *     activation=Activation (ambiguity) 'early_stopping' early_stopping=BooleanLiteral
	 *     activation=Activation (ambiguity) 'epochs' epochs=IntegerLiteral
	 *     activation=Activation (ambiguity) 'epsilon' epsilon=DoubleLiteral
	 *     activation=Activation (ambiguity) 'learning_rate_init' learning_rate_init=STRING
	 *     activation=Activation (ambiguity) 'learning_rate_mode' learning_rate_mode=Learning_rate_mode
	 *     activation=Activation (ambiguity) 'loss' loss=Loss
	 *     activation=Activation (ambiguity) 'max_fun' max_fun=IntegerLiteral
	 *     activation=Activation (ambiguity) 'max_iter' max_iter=IntegerLiteral
	 *     activation=Activation (ambiguity) 'momentum' momentum=DoubleLiteral
	 *     activation=Activation (ambiguity) 'n_iter_no_change' n_iter_no_change=IntegerLiteral
	 *     activation=Activation (ambiguity) 'nesterovs_momentum' nesterovs_momentum=BooleanLiteral
	 *     activation=Activation (ambiguity) 'optimizer' optimizer=Optimizer
	 *     activation=Activation (ambiguity) 'power_t' power_t=DoubleLiteral
	 *     activation=Activation (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     activation=Activation (ambiguity) 'shuffle' shuffle=BooleanLiteral
	 *     activation=Activation (ambiguity) 'tol' tol=DoubleLiteral
	 *     activation=Activation (ambiguity) 'validation_fraction' validation_fraction=DoubleLiteral
	 *     activation=Activation (ambiguity) 'verbose' verbose=BooleanLiteral
	 *     activation=Activation (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_4_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     optimizer=Optimizer (ambiguity) ')' (rule end)
	 *     optimizer=Optimizer (ambiguity) 'alpha' alpha=DoubleLiteral
	 *     optimizer=Optimizer (ambiguity) 'batch_size' batch_size=IntegerLiteral
	 *     optimizer=Optimizer (ambiguity) 'beta_1' beta_1=DoubleLiteral
	 *     optimizer=Optimizer (ambiguity) 'beta_2' beta_2=DoubleLiteral
	 *     optimizer=Optimizer (ambiguity) 'early_stopping' early_stopping=BooleanLiteral
	 *     optimizer=Optimizer (ambiguity) 'epochs' epochs=IntegerLiteral
	 *     optimizer=Optimizer (ambiguity) 'epsilon' epsilon=DoubleLiteral
	 *     optimizer=Optimizer (ambiguity) 'learning_rate_init' learning_rate_init=STRING
	 *     optimizer=Optimizer (ambiguity) 'learning_rate_mode' learning_rate_mode=Learning_rate_mode
	 *     optimizer=Optimizer (ambiguity) 'loss' loss=Loss
	 *     optimizer=Optimizer (ambiguity) 'max_fun' max_fun=IntegerLiteral
	 *     optimizer=Optimizer (ambiguity) 'max_iter' max_iter=IntegerLiteral
	 *     optimizer=Optimizer (ambiguity) 'momentum' momentum=DoubleLiteral
	 *     optimizer=Optimizer (ambiguity) 'n_iter_no_change' n_iter_no_change=IntegerLiteral
	 *     optimizer=Optimizer (ambiguity) 'nesterovs_momentum' nesterovs_momentum=BooleanLiteral
	 *     optimizer=Optimizer (ambiguity) 'power_t' power_t=DoubleLiteral
	 *     optimizer=Optimizer (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     optimizer=Optimizer (ambiguity) 'shuffle' shuffle=BooleanLiteral
	 *     optimizer=Optimizer (ambiguity) 'tol' tol=DoubleLiteral
	 *     optimizer=Optimizer (ambiguity) 'validation_fraction' validation_fraction=DoubleLiteral
	 *     optimizer=Optimizer (ambiguity) 'verbose' verbose=BooleanLiteral
	 *     optimizer=Optimizer (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_5_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     alpha=DoubleLiteral (ambiguity) ')' (rule end)
	 *     alpha=DoubleLiteral (ambiguity) 'batch_size' batch_size=IntegerLiteral
	 *     alpha=DoubleLiteral (ambiguity) 'beta_1' beta_1=DoubleLiteral
	 *     alpha=DoubleLiteral (ambiguity) 'beta_2' beta_2=DoubleLiteral
	 *     alpha=DoubleLiteral (ambiguity) 'early_stopping' early_stopping=BooleanLiteral
	 *     alpha=DoubleLiteral (ambiguity) 'epochs' epochs=IntegerLiteral
	 *     alpha=DoubleLiteral (ambiguity) 'epsilon' epsilon=DoubleLiteral
	 *     alpha=DoubleLiteral (ambiguity) 'learning_rate_init' learning_rate_init=STRING
	 *     alpha=DoubleLiteral (ambiguity) 'learning_rate_mode' learning_rate_mode=Learning_rate_mode
	 *     alpha=DoubleLiteral (ambiguity) 'loss' loss=Loss
	 *     alpha=DoubleLiteral (ambiguity) 'max_fun' max_fun=IntegerLiteral
	 *     alpha=DoubleLiteral (ambiguity) 'max_iter' max_iter=IntegerLiteral
	 *     alpha=DoubleLiteral (ambiguity) 'momentum' momentum=DoubleLiteral
	 *     alpha=DoubleLiteral (ambiguity) 'n_iter_no_change' n_iter_no_change=IntegerLiteral
	 *     alpha=DoubleLiteral (ambiguity) 'nesterovs_momentum' nesterovs_momentum=BooleanLiteral
	 *     alpha=DoubleLiteral (ambiguity) 'power_t' power_t=DoubleLiteral
	 *     alpha=DoubleLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     alpha=DoubleLiteral (ambiguity) 'shuffle' shuffle=BooleanLiteral
	 *     alpha=DoubleLiteral (ambiguity) 'tol' tol=DoubleLiteral
	 *     alpha=DoubleLiteral (ambiguity) 'validation_fraction' validation_fraction=DoubleLiteral
	 *     alpha=DoubleLiteral (ambiguity) 'verbose' verbose=BooleanLiteral
	 *     alpha=DoubleLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_6_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     batch_size=IntegerLiteral (ambiguity) ')' (rule end)
	 *     batch_size=IntegerLiteral (ambiguity) 'beta_1' beta_1=DoubleLiteral
	 *     batch_size=IntegerLiteral (ambiguity) 'beta_2' beta_2=DoubleLiteral
	 *     batch_size=IntegerLiteral (ambiguity) 'early_stopping' early_stopping=BooleanLiteral
	 *     batch_size=IntegerLiteral (ambiguity) 'epochs' epochs=IntegerLiteral
	 *     batch_size=IntegerLiteral (ambiguity) 'epsilon' epsilon=DoubleLiteral
	 *     batch_size=IntegerLiteral (ambiguity) 'learning_rate_init' learning_rate_init=STRING
	 *     batch_size=IntegerLiteral (ambiguity) 'learning_rate_mode' learning_rate_mode=Learning_rate_mode
	 *     batch_size=IntegerLiteral (ambiguity) 'loss' loss=Loss
	 *     batch_size=IntegerLiteral (ambiguity) 'max_fun' max_fun=IntegerLiteral
	 *     batch_size=IntegerLiteral (ambiguity) 'max_iter' max_iter=IntegerLiteral
	 *     batch_size=IntegerLiteral (ambiguity) 'momentum' momentum=DoubleLiteral
	 *     batch_size=IntegerLiteral (ambiguity) 'n_iter_no_change' n_iter_no_change=IntegerLiteral
	 *     batch_size=IntegerLiteral (ambiguity) 'nesterovs_momentum' nesterovs_momentum=BooleanLiteral
	 *     batch_size=IntegerLiteral (ambiguity) 'power_t' power_t=DoubleLiteral
	 *     batch_size=IntegerLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     batch_size=IntegerLiteral (ambiguity) 'shuffle' shuffle=BooleanLiteral
	 *     batch_size=IntegerLiteral (ambiguity) 'tol' tol=DoubleLiteral
	 *     batch_size=IntegerLiteral (ambiguity) 'validation_fraction' validation_fraction=DoubleLiteral
	 *     batch_size=IntegerLiteral (ambiguity) 'verbose' verbose=BooleanLiteral
	 *     batch_size=IntegerLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_7_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     learning_rate_mode=Learning_rate_mode (ambiguity) ')' (rule end)
	 *     learning_rate_mode=Learning_rate_mode (ambiguity) 'beta_1' beta_1=DoubleLiteral
	 *     learning_rate_mode=Learning_rate_mode (ambiguity) 'beta_2' beta_2=DoubleLiteral
	 *     learning_rate_mode=Learning_rate_mode (ambiguity) 'early_stopping' early_stopping=BooleanLiteral
	 *     learning_rate_mode=Learning_rate_mode (ambiguity) 'epochs' epochs=IntegerLiteral
	 *     learning_rate_mode=Learning_rate_mode (ambiguity) 'epsilon' epsilon=DoubleLiteral
	 *     learning_rate_mode=Learning_rate_mode (ambiguity) 'learning_rate_init' learning_rate_init=STRING
	 *     learning_rate_mode=Learning_rate_mode (ambiguity) 'loss' loss=Loss
	 *     learning_rate_mode=Learning_rate_mode (ambiguity) 'max_fun' max_fun=IntegerLiteral
	 *     learning_rate_mode=Learning_rate_mode (ambiguity) 'max_iter' max_iter=IntegerLiteral
	 *     learning_rate_mode=Learning_rate_mode (ambiguity) 'momentum' momentum=DoubleLiteral
	 *     learning_rate_mode=Learning_rate_mode (ambiguity) 'n_iter_no_change' n_iter_no_change=IntegerLiteral
	 *     learning_rate_mode=Learning_rate_mode (ambiguity) 'nesterovs_momentum' nesterovs_momentum=BooleanLiteral
	 *     learning_rate_mode=Learning_rate_mode (ambiguity) 'power_t' power_t=DoubleLiteral
	 *     learning_rate_mode=Learning_rate_mode (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     learning_rate_mode=Learning_rate_mode (ambiguity) 'shuffle' shuffle=BooleanLiteral
	 *     learning_rate_mode=Learning_rate_mode (ambiguity) 'tol' tol=DoubleLiteral
	 *     learning_rate_mode=Learning_rate_mode (ambiguity) 'validation_fraction' validation_fraction=DoubleLiteral
	 *     learning_rate_mode=Learning_rate_mode (ambiguity) 'verbose' verbose=BooleanLiteral
	 *     learning_rate_mode=Learning_rate_mode (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_8_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     learning_rate_init=STRING (ambiguity) ')' (rule end)
	 *     learning_rate_init=STRING (ambiguity) 'beta_1' beta_1=DoubleLiteral
	 *     learning_rate_init=STRING (ambiguity) 'beta_2' beta_2=DoubleLiteral
	 *     learning_rate_init=STRING (ambiguity) 'early_stopping' early_stopping=BooleanLiteral
	 *     learning_rate_init=STRING (ambiguity) 'epochs' epochs=IntegerLiteral
	 *     learning_rate_init=STRING (ambiguity) 'epsilon' epsilon=DoubleLiteral
	 *     learning_rate_init=STRING (ambiguity) 'loss' loss=Loss
	 *     learning_rate_init=STRING (ambiguity) 'max_fun' max_fun=IntegerLiteral
	 *     learning_rate_init=STRING (ambiguity) 'max_iter' max_iter=IntegerLiteral
	 *     learning_rate_init=STRING (ambiguity) 'momentum' momentum=DoubleLiteral
	 *     learning_rate_init=STRING (ambiguity) 'n_iter_no_change' n_iter_no_change=IntegerLiteral
	 *     learning_rate_init=STRING (ambiguity) 'nesterovs_momentum' nesterovs_momentum=BooleanLiteral
	 *     learning_rate_init=STRING (ambiguity) 'power_t' power_t=DoubleLiteral
	 *     learning_rate_init=STRING (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     learning_rate_init=STRING (ambiguity) 'shuffle' shuffle=BooleanLiteral
	 *     learning_rate_init=STRING (ambiguity) 'tol' tol=DoubleLiteral
	 *     learning_rate_init=STRING (ambiguity) 'validation_fraction' validation_fraction=DoubleLiteral
	 *     learning_rate_init=STRING (ambiguity) 'verbose' verbose=BooleanLiteral
	 *     learning_rate_init=STRING (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_9_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     alpha=DoubleLiteral (ambiguity) ')' (rule end)
	 *     alpha=DoubleLiteral (ambiguity) 'binarize' binarize=DoubleLiteral
	 *     alpha=DoubleLiteral (ambiguity) 'class_prior' class_prior=STRING
	 *     alpha=DoubleLiteral (ambiguity) 'fit_prior' fit_prior=BooleanLiteral
	 */
	protected void emit_NaiveBayesBernoulli_CommaKeyword_3_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     binarize=DoubleLiteral (ambiguity) ')' (rule end)
	 *     binarize=DoubleLiteral (ambiguity) 'class_prior' class_prior=STRING
	 *     binarize=DoubleLiteral (ambiguity) 'fit_prior' fit_prior=BooleanLiteral
	 */
	protected void emit_NaiveBayesBernoulli_CommaKeyword_4_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     fit_prior=BooleanLiteral (ambiguity) ')' (rule end)
	 *     fit_prior=BooleanLiteral (ambiguity) 'class_prior' class_prior=STRING
	 */
	protected void emit_NaiveBayesBernoulli_CommaKeyword_5_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     class_prior=STRING (ambiguity) ')' (rule end)
	 */
	protected void emit_NaiveBayesBernoulli_CommaKeyword_6_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     alpha=DoubleLiteral (ambiguity) ')' (rule end)
	 *     alpha=DoubleLiteral (ambiguity) 'class_prior' class_prior=STRING
	 *     alpha=DoubleLiteral (ambiguity) 'fit_prior' fit_prior=BooleanLiteral
	 *     alpha=DoubleLiteral (ambiguity) 'min_categories' min_categories=STRING
	 */
	protected void emit_NaiveBayesCategorical_CommaKeyword_3_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     fit_prior=BooleanLiteral (ambiguity) ')' (rule end)
	 *     fit_prior=BooleanLiteral (ambiguity) 'class_prior' class_prior=STRING
	 *     fit_prior=BooleanLiteral (ambiguity) 'min_categories' min_categories=STRING
	 */
	protected void emit_NaiveBayesCategorical_CommaKeyword_4_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     class_prior=STRING (ambiguity) ')' (rule end)
	 *     class_prior=STRING (ambiguity) 'min_categories' min_categories=STRING
	 */
	protected void emit_NaiveBayesCategorical_CommaKeyword_5_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     min_categories=STRING (ambiguity) ')' (rule end)
	 */
	protected void emit_NaiveBayesCategorical_CommaKeyword_6_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     alpha=DoubleLiteral (ambiguity) ')' (rule end)
	 *     alpha=DoubleLiteral (ambiguity) 'class_prior' class_prior=STRING
	 *     alpha=DoubleLiteral (ambiguity) 'fit_prior' fit_prior=BooleanLiteral
	 *     alpha=DoubleLiteral (ambiguity) 'norm' norm=BooleanLiteral
	 */
	protected void emit_NaiveBayesComplement_CommaKeyword_3_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     fit_prior=BooleanLiteral (ambiguity) ')' (rule end)
	 *     fit_prior=BooleanLiteral (ambiguity) 'class_prior' class_prior=STRING
	 *     fit_prior=BooleanLiteral (ambiguity) 'norm' norm=BooleanLiteral
	 */
	protected void emit_NaiveBayesComplement_CommaKeyword_4_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     class_prior=STRING (ambiguity) ')' (rule end)
	 *     class_prior=STRING (ambiguity) 'norm' norm=BooleanLiteral
	 */
	protected void emit_NaiveBayesComplement_CommaKeyword_5_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     norm=BooleanLiteral (ambiguity) ')' (rule end)
	 */
	protected void emit_NaiveBayesComplement_CommaKeyword_6_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     priors=STRING (ambiguity) ')' (rule end)
	 *     priors=STRING (ambiguity) 'var_smoothing' var_smoothing=DoubleLiteral
	 */
	protected void emit_NaiveBayesGaussian_CommaKeyword_3_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     var_smoothing=DoubleLiteral (ambiguity) ')' (rule end)
	 */
	protected void emit_NaiveBayesGaussian_CommaKeyword_4_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     alpha=DoubleLiteral (ambiguity) ')' (rule end)
	 *     alpha=DoubleLiteral (ambiguity) 'class_prior' class_prior=STRING
	 *     alpha=DoubleLiteral (ambiguity) 'fit_prior' fit_prior=BooleanLiteral
	 */
	protected void emit_NaiveBayesMultinomial_CommaKeyword_3_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     fit_prior=BooleanLiteral (ambiguity) ')' (rule end)
	 *     fit_prior=BooleanLiteral (ambiguity) 'class_prior' class_prior=STRING
	 */
	protected void emit_NaiveBayesMultinomial_CommaKeyword_4_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     class_prior=STRING (ambiguity) ')' (rule end)
	 */
	protected void emit_NaiveBayesMultinomial_CommaKeyword_5_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     annotations+=PlatformAnnotation (ambiguity) (rule end)
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_ObjectType_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     ByteSize=INT '>' (ambiguity) (rule end)
	 *     annotations+=PlatformAnnotation (ambiguity) (rule end)
	 */
	protected void emit_PrimitiveType_SemicolonKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     annotations+=PlatformAnnotation (ambiguity) (rule end)
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_Protocol_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) ')' (rule end)
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) 'bootstrap' bootstrap=BooleanLiteral
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) 'class_weight' class_weight=STRING
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) 'oob_score' oob_score=BooleanLiteral
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestClassifier_CommaKeyword_10_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     min_impurity_decrease=DoubleLiteral (ambiguity) ')' (rule end)
	 *     min_impurity_decrease=DoubleLiteral (ambiguity) 'bootstrap' bootstrap=BooleanLiteral
	 *     min_impurity_decrease=DoubleLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     min_impurity_decrease=DoubleLiteral (ambiguity) 'class_weight' class_weight=STRING
	 *     min_impurity_decrease=DoubleLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     min_impurity_decrease=DoubleLiteral (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     min_impurity_decrease=DoubleLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     min_impurity_decrease=DoubleLiteral (ambiguity) 'oob_score' oob_score=BooleanLiteral
	 *     min_impurity_decrease=DoubleLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     min_impurity_decrease=DoubleLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     min_impurity_decrease=DoubleLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestClassifier_CommaKeyword_11_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     min_impurity_split=DoubleLiteral (ambiguity) ')' (rule end)
	 *     min_impurity_split=DoubleLiteral (ambiguity) 'bootstrap' bootstrap=BooleanLiteral
	 *     min_impurity_split=DoubleLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     min_impurity_split=DoubleLiteral (ambiguity) 'class_weight' class_weight=STRING
	 *     min_impurity_split=DoubleLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     min_impurity_split=DoubleLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     min_impurity_split=DoubleLiteral (ambiguity) 'oob_score' oob_score=BooleanLiteral
	 *     min_impurity_split=DoubleLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     min_impurity_split=DoubleLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     min_impurity_split=DoubleLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestClassifier_CommaKeyword_12_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     bootstrap=BooleanLiteral (ambiguity) ')' (rule end)
	 *     bootstrap=BooleanLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     bootstrap=BooleanLiteral (ambiguity) 'class_weight' class_weight=STRING
	 *     bootstrap=BooleanLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     bootstrap=BooleanLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     bootstrap=BooleanLiteral (ambiguity) 'oob_score' oob_score=BooleanLiteral
	 *     bootstrap=BooleanLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     bootstrap=BooleanLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     bootstrap=BooleanLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestClassifier_CommaKeyword_13_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     oob_score=BooleanLiteral (ambiguity) ')' (rule end)
	 *     oob_score=BooleanLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     oob_score=BooleanLiteral (ambiguity) 'class_weight' class_weight=STRING
	 *     oob_score=BooleanLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     oob_score=BooleanLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     oob_score=BooleanLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     oob_score=BooleanLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     oob_score=BooleanLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestClassifier_CommaKeyword_14_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     n_jobs=IntegerLiteral (ambiguity) ')' (rule end)
	 *     n_jobs=IntegerLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     n_jobs=IntegerLiteral (ambiguity) 'class_weight' class_weight=STRING
	 *     n_jobs=IntegerLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     n_jobs=IntegerLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     n_jobs=IntegerLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     n_jobs=IntegerLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestClassifier_CommaKeyword_15_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     random_state=IntegerLiteral (ambiguity) ')' (rule end)
	 *     random_state=IntegerLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     random_state=IntegerLiteral (ambiguity) 'class_weight' class_weight=STRING
	 *     random_state=IntegerLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     random_state=IntegerLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     random_state=IntegerLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestClassifier_CommaKeyword_16_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     verbose=IntegerLiteral (ambiguity) ')' (rule end)
	 *     verbose=IntegerLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     verbose=IntegerLiteral (ambiguity) 'class_weight' class_weight=STRING
	 *     verbose=IntegerLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     verbose=IntegerLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestClassifier_CommaKeyword_17_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     warm_start=BooleanLiteral (ambiguity) ')' (rule end)
	 *     warm_start=BooleanLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     warm_start=BooleanLiteral (ambiguity) 'class_weight' class_weight=STRING
	 *     warm_start=BooleanLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 */
	protected void emit_RandomForestClassifier_CommaKeyword_18_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     class_weight=STRING (ambiguity) ')' (rule end)
	 *     class_weight=STRING (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     class_weight=STRING (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 */
	protected void emit_RandomForestClassifier_CommaKeyword_19_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     ccp_alpha=DoubleLiteral (ambiguity) ')' (rule end)
	 *     ccp_alpha=DoubleLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 */
	protected void emit_RandomForestClassifier_CommaKeyword_20_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     max_samples=DoubleLiteral (ambiguity) ')' (rule end)
	 */
	protected void emit_RandomForestClassifier_CommaKeyword_21_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     n_estimators=IntegerLiteral (ambiguity) ')' (rule end)
	 *     n_estimators=IntegerLiteral (ambiguity) 'bootstrap' bootstrap=BooleanLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'class_weight' class_weight=STRING
	 *     n_estimators=IntegerLiteral (ambiguity) 'criterion' randomForestClassifierCriterion=RandomForestClassifierCriterion
	 *     n_estimators=IntegerLiteral (ambiguity) 'max_depth' max_depth=IntegerLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'max_features' max_features_enum=Max_features_enum
	 *     n_estimators=IntegerLiteral (ambiguity) 'max_features' max_features_numeric=DoubleLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'min_samples_leaf' min_samples_leaf=DoubleLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'min_samples_split' min_samples_split=DoubleLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'min_weight_fraction_leaf' min_weight_fraction_leaf=DoubleLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'oob_score' oob_score=BooleanLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestClassifier_CommaKeyword_3_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     randomForestClassifierCriterion=RandomForestClassifierCriterion (ambiguity) ')' (rule end)
	 *     randomForestClassifierCriterion=RandomForestClassifierCriterion (ambiguity) 'bootstrap' bootstrap=BooleanLiteral
	 *     randomForestClassifierCriterion=RandomForestClassifierCriterion (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     randomForestClassifierCriterion=RandomForestClassifierCriterion (ambiguity) 'class_weight' class_weight=STRING
	 *     randomForestClassifierCriterion=RandomForestClassifierCriterion (ambiguity) 'max_depth' max_depth=IntegerLiteral
	 *     randomForestClassifierCriterion=RandomForestClassifierCriterion (ambiguity) 'max_features' max_features_enum=Max_features_enum
	 *     randomForestClassifierCriterion=RandomForestClassifierCriterion (ambiguity) 'max_features' max_features_numeric=DoubleLiteral
	 *     randomForestClassifierCriterion=RandomForestClassifierCriterion (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     randomForestClassifierCriterion=RandomForestClassifierCriterion (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     randomForestClassifierCriterion=RandomForestClassifierCriterion (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     randomForestClassifierCriterion=RandomForestClassifierCriterion (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     randomForestClassifierCriterion=RandomForestClassifierCriterion (ambiguity) 'min_samples_leaf' min_samples_leaf=DoubleLiteral
	 *     randomForestClassifierCriterion=RandomForestClassifierCriterion (ambiguity) 'min_samples_split' min_samples_split=DoubleLiteral
	 *     randomForestClassifierCriterion=RandomForestClassifierCriterion (ambiguity) 'min_weight_fraction_leaf' min_weight_fraction_leaf=DoubleLiteral
	 *     randomForestClassifierCriterion=RandomForestClassifierCriterion (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     randomForestClassifierCriterion=RandomForestClassifierCriterion (ambiguity) 'oob_score' oob_score=BooleanLiteral
	 *     randomForestClassifierCriterion=RandomForestClassifierCriterion (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     randomForestClassifierCriterion=RandomForestClassifierCriterion (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     randomForestClassifierCriterion=RandomForestClassifierCriterion (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestClassifier_CommaKeyword_4_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     max_depth=IntegerLiteral (ambiguity) ')' (rule end)
	 *     max_depth=IntegerLiteral (ambiguity) 'bootstrap' bootstrap=BooleanLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'class_weight' class_weight=STRING
	 *     max_depth=IntegerLiteral (ambiguity) 'max_features' max_features_enum=Max_features_enum
	 *     max_depth=IntegerLiteral (ambiguity) 'max_features' max_features_numeric=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'min_samples_leaf' min_samples_leaf=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'min_samples_split' min_samples_split=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'min_weight_fraction_leaf' min_weight_fraction_leaf=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'oob_score' oob_score=BooleanLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestClassifier_CommaKeyword_5_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     min_samples_split=DoubleLiteral (ambiguity) ')' (rule end)
	 *     min_samples_split=DoubleLiteral (ambiguity) 'bootstrap' bootstrap=BooleanLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'class_weight' class_weight=STRING
	 *     min_samples_split=DoubleLiteral (ambiguity) 'max_features' max_features_enum=Max_features_enum
	 *     min_samples_split=DoubleLiteral (ambiguity) 'max_features' max_features_numeric=DoubleLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'min_samples_leaf' min_samples_leaf=DoubleLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'min_weight_fraction_leaf' min_weight_fraction_leaf=DoubleLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'oob_score' oob_score=BooleanLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestClassifier_CommaKeyword_6_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     min_samples_leaf=DoubleLiteral (ambiguity) ')' (rule end)
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'bootstrap' bootstrap=BooleanLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'class_weight' class_weight=STRING
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'max_features' max_features_enum=Max_features_enum
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'max_features' max_features_numeric=DoubleLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'min_weight_fraction_leaf' min_weight_fraction_leaf=DoubleLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'oob_score' oob_score=BooleanLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestClassifier_CommaKeyword_7_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) ')' (rule end)
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'bootstrap' bootstrap=BooleanLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'class_weight' class_weight=STRING
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'max_features' max_features_enum=Max_features_enum
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'max_features' max_features_numeric=DoubleLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'oob_score' oob_score=BooleanLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestClassifier_CommaKeyword_8_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     max_features_enum=Max_features_enum (ambiguity) ')' (rule end)
	 *     max_features_enum=Max_features_enum (ambiguity) 'bootstrap' bootstrap=BooleanLiteral
	 *     max_features_enum=Max_features_enum (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     max_features_enum=Max_features_enum (ambiguity) 'class_weight' class_weight=STRING
	 *     max_features_enum=Max_features_enum (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     max_features_enum=Max_features_enum (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     max_features_enum=Max_features_enum (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     max_features_enum=Max_features_enum (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     max_features_enum=Max_features_enum (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     max_features_enum=Max_features_enum (ambiguity) 'oob_score' oob_score=BooleanLiteral
	 *     max_features_enum=Max_features_enum (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     max_features_enum=Max_features_enum (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     max_features_enum=Max_features_enum (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestClassifier_CommaKeyword_9_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) ')' (rule end)
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) 'bootstrap' bootstrap=BooleanLiteral
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) 'oob_score' oob_score=BooleanLiteral
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     max_leaf_nodes=IntegerLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestRegressor_CommaKeyword_10_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     min_impurity_decrease=DoubleLiteral (ambiguity) ')' (rule end)
	 *     min_impurity_decrease=DoubleLiteral (ambiguity) 'bootstrap' bootstrap=BooleanLiteral
	 *     min_impurity_decrease=DoubleLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     min_impurity_decrease=DoubleLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     min_impurity_decrease=DoubleLiteral (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     min_impurity_decrease=DoubleLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     min_impurity_decrease=DoubleLiteral (ambiguity) 'oob_score' oob_score=BooleanLiteral
	 *     min_impurity_decrease=DoubleLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     min_impurity_decrease=DoubleLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     min_impurity_decrease=DoubleLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestRegressor_CommaKeyword_11_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     min_impurity_split=DoubleLiteral (ambiguity) ')' (rule end)
	 *     min_impurity_split=DoubleLiteral (ambiguity) 'bootstrap' bootstrap=BooleanLiteral
	 *     min_impurity_split=DoubleLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     min_impurity_split=DoubleLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     min_impurity_split=DoubleLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     min_impurity_split=DoubleLiteral (ambiguity) 'oob_score' oob_score=BooleanLiteral
	 *     min_impurity_split=DoubleLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     min_impurity_split=DoubleLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     min_impurity_split=DoubleLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestRegressor_CommaKeyword_12_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     bootstrap=BooleanLiteral (ambiguity) ')' (rule end)
	 *     bootstrap=BooleanLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     bootstrap=BooleanLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     bootstrap=BooleanLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     bootstrap=BooleanLiteral (ambiguity) 'oob_score' oob_score=BooleanLiteral
	 *     bootstrap=BooleanLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     bootstrap=BooleanLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     bootstrap=BooleanLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestRegressor_CommaKeyword_13_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     oob_score=BooleanLiteral (ambiguity) ')' (rule end)
	 *     oob_score=BooleanLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     oob_score=BooleanLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     oob_score=BooleanLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     oob_score=BooleanLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     oob_score=BooleanLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     oob_score=BooleanLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestRegressor_CommaKeyword_14_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     n_jobs=IntegerLiteral (ambiguity) ')' (rule end)
	 *     n_jobs=IntegerLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     n_jobs=IntegerLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     n_jobs=IntegerLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     n_jobs=IntegerLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     n_jobs=IntegerLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestRegressor_CommaKeyword_15_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     random_state=IntegerLiteral (ambiguity) ')' (rule end)
	 *     random_state=IntegerLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     random_state=IntegerLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     random_state=IntegerLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     random_state=IntegerLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestRegressor_CommaKeyword_16_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     verbose=IntegerLiteral (ambiguity) ')' (rule end)
	 *     verbose=IntegerLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     verbose=IntegerLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     verbose=IntegerLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestRegressor_CommaKeyword_17_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     warm_start=BooleanLiteral (ambiguity) ')' (rule end)
	 *     warm_start=BooleanLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     warm_start=BooleanLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 */
	protected void emit_RandomForestRegressor_CommaKeyword_18_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     ccp_alpha=DoubleLiteral (ambiguity) ')' (rule end)
	 *     ccp_alpha=DoubleLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 */
	protected void emit_RandomForestRegressor_CommaKeyword_19_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     max_samples=DoubleLiteral (ambiguity) ')' (rule end)
	 */
	protected void emit_RandomForestRegressor_CommaKeyword_20_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     n_estimators=IntegerLiteral (ambiguity) ')' (rule end)
	 *     n_estimators=IntegerLiteral (ambiguity) 'bootstrap' bootstrap=BooleanLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'criterion' randomForestRegressorCriterion=RandomForestRegressorCriterion
	 *     n_estimators=IntegerLiteral (ambiguity) 'max_depth' max_depth=IntegerLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'max_features' max_features_enum=Max_features_enum
	 *     n_estimators=IntegerLiteral (ambiguity) 'max_features' max_features_numeric=DoubleLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'min_samples_leaf' min_samples_leaf=DoubleLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'min_samples_split' min_samples_split=DoubleLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'min_weight_fraction_leaf' min_weight_fraction_leaf=DoubleLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'oob_score' oob_score=BooleanLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     n_estimators=IntegerLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestRegressor_CommaKeyword_3_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     randomForestRegressorCriterion=RandomForestRegressorCriterion (ambiguity) ')' (rule end)
	 *     randomForestRegressorCriterion=RandomForestRegressorCriterion (ambiguity) 'bootstrap' bootstrap=BooleanLiteral
	 *     randomForestRegressorCriterion=RandomForestRegressorCriterion (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     randomForestRegressorCriterion=RandomForestRegressorCriterion (ambiguity) 'max_depth' max_depth=IntegerLiteral
	 *     randomForestRegressorCriterion=RandomForestRegressorCriterion (ambiguity) 'max_features' max_features_enum=Max_features_enum
	 *     randomForestRegressorCriterion=RandomForestRegressorCriterion (ambiguity) 'max_features' max_features_numeric=DoubleLiteral
	 *     randomForestRegressorCriterion=RandomForestRegressorCriterion (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     randomForestRegressorCriterion=RandomForestRegressorCriterion (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     randomForestRegressorCriterion=RandomForestRegressorCriterion (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     randomForestRegressorCriterion=RandomForestRegressorCriterion (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     randomForestRegressorCriterion=RandomForestRegressorCriterion (ambiguity) 'min_samples_leaf' min_samples_leaf=DoubleLiteral
	 *     randomForestRegressorCriterion=RandomForestRegressorCriterion (ambiguity) 'min_samples_split' min_samples_split=DoubleLiteral
	 *     randomForestRegressorCriterion=RandomForestRegressorCriterion (ambiguity) 'min_weight_fraction_leaf' min_weight_fraction_leaf=DoubleLiteral
	 *     randomForestRegressorCriterion=RandomForestRegressorCriterion (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     randomForestRegressorCriterion=RandomForestRegressorCriterion (ambiguity) 'oob_score' oob_score=BooleanLiteral
	 *     randomForestRegressorCriterion=RandomForestRegressorCriterion (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     randomForestRegressorCriterion=RandomForestRegressorCriterion (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     randomForestRegressorCriterion=RandomForestRegressorCriterion (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestRegressor_CommaKeyword_4_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     max_depth=IntegerLiteral (ambiguity) ')' (rule end)
	 *     max_depth=IntegerLiteral (ambiguity) 'bootstrap' bootstrap=BooleanLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'max_features' max_features_enum=Max_features_enum
	 *     max_depth=IntegerLiteral (ambiguity) 'max_features' max_features_numeric=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'min_samples_leaf' min_samples_leaf=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'min_samples_split' min_samples_split=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'min_weight_fraction_leaf' min_weight_fraction_leaf=DoubleLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'oob_score' oob_score=BooleanLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     max_depth=IntegerLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestRegressor_CommaKeyword_5_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     min_samples_split=DoubleLiteral (ambiguity) ')' (rule end)
	 *     min_samples_split=DoubleLiteral (ambiguity) 'bootstrap' bootstrap=BooleanLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'max_features' max_features_enum=Max_features_enum
	 *     min_samples_split=DoubleLiteral (ambiguity) 'max_features' max_features_numeric=DoubleLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'min_samples_leaf' min_samples_leaf=DoubleLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'min_weight_fraction_leaf' min_weight_fraction_leaf=DoubleLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'oob_score' oob_score=BooleanLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     min_samples_split=DoubleLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestRegressor_CommaKeyword_6_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     min_samples_leaf=DoubleLiteral (ambiguity) ')' (rule end)
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'bootstrap' bootstrap=BooleanLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'max_features' max_features_enum=Max_features_enum
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'max_features' max_features_numeric=DoubleLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'min_weight_fraction_leaf' min_weight_fraction_leaf=DoubleLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'oob_score' oob_score=BooleanLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     min_samples_leaf=DoubleLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestRegressor_CommaKeyword_7_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) ')' (rule end)
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'bootstrap' bootstrap=BooleanLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'max_features' max_features_enum=Max_features_enum
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'max_features' max_features_numeric=DoubleLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'oob_score' oob_score=BooleanLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     min_weight_fraction_leaf=DoubleLiteral (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestRegressor_CommaKeyword_8_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     max_features_enum=Max_features_enum (ambiguity) ')' (rule end)
	 *     max_features_enum=Max_features_enum (ambiguity) 'bootstrap' bootstrap=BooleanLiteral
	 *     max_features_enum=Max_features_enum (ambiguity) 'ccp_alpha' ccp_alpha=DoubleLiteral
	 *     max_features_enum=Max_features_enum (ambiguity) 'max_leaf_nodes' max_leaf_nodes=IntegerLiteral
	 *     max_features_enum=Max_features_enum (ambiguity) 'max_samples' max_samples=DoubleLiteral
	 *     max_features_enum=Max_features_enum (ambiguity) 'min_impurity_decrease' min_impurity_decrease=DoubleLiteral
	 *     max_features_enum=Max_features_enum (ambiguity) 'min_impurity_split' min_impurity_split=DoubleLiteral
	 *     max_features_enum=Max_features_enum (ambiguity) 'n_jobs' n_jobs=IntegerLiteral
	 *     max_features_enum=Max_features_enum (ambiguity) 'oob_score' oob_score=BooleanLiteral
	 *     max_features_enum=Max_features_enum (ambiguity) 'random_state' random_state=IntegerLiteral
	 *     max_features_enum=Max_features_enum (ambiguity) 'verbose' verbose=IntegerLiteral
	 *     max_features_enum=Max_features_enum (ambiguity) 'warm_start' warm_start=BooleanLiteral
	 */
	protected void emit_RandomForestRegressor_CommaKeyword_9_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
