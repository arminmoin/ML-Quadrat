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
package org.thingml.xtext.ui;

import java.util.HashSet;
import java.util.regex.Pattern;

import org.eclipse.xtext.ide.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.thingml.xtext.ide.contentassist.antlr.internal.InternalThingMLLexer;


public class ThingMLAntlrTokenToAttributeIdMapper extends AbstractAntlrTokenToAttributeIdMapper {


	HashSet<String> typesAndMessages = new HashSet<String>(java.util.Arrays.asList(new String[]
					{"'thing'", "'fragment'", "'readonly'", "'includes'", "'datatype'", "'object'", "'enumeration'"
							, "'sends'", "'receives'", "'port'", "'provided'", "'required'", "'protocol'"
							, "'optional'", "'message'", "'property'"}));
	
	HashSet<String> statemachine = new HashSet<String>(java.util.Arrays.asList(new String[]
			{"'function'", "'abstract'", "'state'", "'final'", "'composite'", "'statechart'", "'event'", "'guard'"
					, "'action'", "'on'", "'entry'", "'exit'", "'region'"
					, "'init'", "'keeps'", "'history'", "'exit'", "'->'"
					, "'session'", "'internal'", "'transition'", "'?'"}));
	
	HashSet<String> action = new HashSet<String>(java.util.Arrays.asList(new String[]
			{"'var'", "'return'", "'do'", "'end'", "'if'", "'else'", "'while'", "'for'", "'in'"
					, "'print'", "'println'", "'error'", "'errorln'", "'not'", "'and'", "'or'"
					, "'init'", "'keeps'", "'history'", "'exit'", "'->'"
					, "'fork'", "'set'", "'as'", "'!'"
					, "'da_save'", "'da_preprocess'", "'da_train'", "'da_predict'", "'input_features'" //ML2
			}));
	
	HashSet<String> configuration = new HashSet<String>(java.util.Arrays.asList(new String[]
			{"'configuration'", "'instance'", "'connector'", "'over'", "'=>'"}));

	HashSet<String> data_analytics = new HashSet<String>(java.util.Arrays.asList(new String[] //ML2
			{"'data_analytics'", "'dataset'", "'sequential'", "'timestamps'", "'labels'", "'features'", "'preprocess_feature_scaling'", "'model_algorithm'", "'automl'"
					, "'training_results'", "'prediction_results'"
					, "'NOT_SET'", "'ON'", "'OFF'", "'TRUE'", "'FALSE'", "'true'", "'false'"
					, "'pretrained'", "'pmml'", "'pfa'", "'path'"
					, "'STANDARDIZATION_Z_SCORE_NORMALIZATION'", "'MIN_MAX_NORMALIZATION'", "'MEAN_NORMALIZATION_MIN_MAX'", "'MEAN_NORMALIZATION_L2_NORM'", "'UNIT_LENGTH_SCALING'"
					, "'linear_classifier_logistic_regression'", "'penalty'", "'dual'", "'tol'", "'C'", "'fit_intercept'", "'intercept_scaling'", "'class_weight'", "'random_state'", "'solver'", "'max_iter'", "'multi_class'", "'verbose'", "'warm_start'", "'n_jobs'", "'l1_ratio'"
					, "'linear_regression'", "'normalize'", "'copy_X'", "'positive'"
					, "'naive_bayes_gaussian'", "'priors'", "'var_smoothing'"
					, "'naive_bayes_multinomial'", "'alpha'", "'fit_prior'", "'class_prior'"
					, "'naive_bayes_complement'", "'norm'"
					, "'naive_bayes_bernoulli'", "'binarize'"
					, "'naive_bayes_categorical'", "'min_categories'"
					, "'decision_tree_regressor'", "'criterion'", "'splitter'", "'max_depth'", "'min_samples_split'", "'min_samples_leaf'", "'min_weight_fraction_leaf'", "'max_features'", "'random_state'", "'max_leaf_nodes'", "'min_impurity_decrease'", "'min_impurity_split'", "'ccp_alpha'"
					, "'decision_tree_classifier'", "'class_weight'"
					, "'random_forest_regressor'", "'n_estimators'", "'criterion'", "'max_depth'", "'min_samples_split'", "'min_samples_leaf'", "'min_weight_fraction_leaf'", "'max_features'", "'max_leaf_nodes'", "'min_impurity_decrease'", "'min_impurity_split'", "'bootstrap'", "'oob_score'", "'n_jobs'", "'random_state'", "'verbose'", "'warm_start'", "'ccp_alpha'", "'max_samples'"
					, "'random_forest_classifier'", "'class_weight'"
					, "'nn_multilayer_perceptron'", "'hidden_layer_sizes'", "'activation'", "'hidden_layers_activation_functions'" , "'optimizer'", "'alpha'", "'batch_size'", "'learning_rate_mode'", "'learning_rate_init'", "'power'", "'power_t'", "'max_iter'", "'shuffle'", "'random_state'", "'tol'", "'verbose'", "'warm_start'", "'momentum'", "'nesterovs_momentum'", "'early_stopping'", "'validation_fraction'", "'beta_1'", "'beta_2'", "'epsilon'", "'n_iter_no_change'", "'max_fun'", "'loss'", "'epochs'"
					, "''l1''", "''l2''", "''elasticnet''", "''none''"
					, "'newton-cg'", "'lbfgs'", "'liblinear'", "'sag'", "'saga'"
					, "'sgd'", "'adam'"
					, "'RMSprop'", "'Adadelta'", "'Adagrad'", "'Adamax'", "'Nadam'", "'Ftrl'"
					, "''auto''", "''ovr''", "''multinomial''"
					, "''mse''", "''friedman_mse''", "''mae''", "''poisson''"
					, "''gini''", "''entropy''"
					, "''best''", "''random''"
					, "''sqrt''", "''log2''"
					, "'relu'", "'sigmoid'", "'softmax'", "'softplus'", "'softsign'", "'tanh'", "'selu'", "'elu'", "'exponential'", "'identity'", "'logistic'"
					, "''constant''", "''invscaling''", "''adaptive''", "'ExponentialDecay'", "'PiecewiseConstantDecay'", "'PolynomialDecay'", "'InverseTimeDecay'"
					, "'SparseCategoricalCrossentropy'", "'CategoricalCrossentropy'", "'MeanSquaredError'"
			}));

	
	@Override
	protected String calculateId(String tokenName, int tokenType) {
		
		switch(tokenType) {
		case InternalThingMLLexer.RULE_ANNOTATION_ID:
			return ThingMLHighlightingConfiguration.ANNOTATIONS_ID;
		case InternalThingMLLexer.RULE_FLOAT:
		case InternalThingMLLexer.RULE_INT:
		case InternalThingMLLexer.RULE_CHAR:
		case InternalThingMLLexer.RULE_BYTE:
		case InternalThingMLLexer.RULE_STRING:
			return ThingMLHighlightingConfiguration.DEFAULT_LITERAL_ID;
		case InternalThingMLLexer.RULE_ML_COMMENT:
		case InternalThingMLLexer.RULE_SL_COMMENT:
			return ThingMLHighlightingConfiguration.COMMENTS_ID;
		case InternalThingMLLexer.RULE_EXTERN:
			return ThingMLHighlightingConfiguration.EXTERN_ID;
		case InternalThingMLLexer.RULE_ANY_OTHER: 
			return ThingMLHighlightingConfiguration.DEFAULT_TEXT_ID;
		default:
			break;
		}
			
		if (typesAndMessages.contains(tokenName)) 
			return ThingMLHighlightingConfiguration.TYPES_AND_MESSAGES_ID;
		
		if (statemachine.contains(tokenName)) 
			return ThingMLHighlightingConfiguration.STATEMACHINE_ID;
		
		if (action.contains(tokenName)) 
			return ThingMLHighlightingConfiguration.ACTIONS_ID;
		
		if (configuration.contains(tokenName)) 
			return ThingMLHighlightingConfiguration.CONFIGURATION_ID;
		
		if (data_analytics.contains(tokenName)) //ML2
			return ThingMLHighlightingConfiguration.DATA_ANALYTICS_ID;
		
		return ThingMLHighlightingConfiguration.DEFAULT_TEXT_ID;
	}

}
