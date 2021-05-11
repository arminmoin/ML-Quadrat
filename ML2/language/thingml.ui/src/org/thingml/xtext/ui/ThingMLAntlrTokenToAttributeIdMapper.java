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

/**
 * Extended by Armin Moin, moin@in.tum.de, moin@arminmoin.de
 */

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
					, "'da_save'", "'da_preprocess'", "'da_train'", "'da_predict'", "'da_pre_trained_predict'" //ML2
			}));
	
	HashSet<String> configuration = new HashSet<String>(java.util.Arrays.asList(new String[]
			{"'configuration'", "'instance'", "'connector'", "'over'", "'=>'"}));

	HashSet<String> data_analytics = new HashSet<String>(java.util.Arrays.asList(new String[] //ML2
			{"'data_analytics'", "'blackbox_ml'", "'blackbox_ml_model'", "'blackbox_import_algorithm'", "'blackbox_label_encoder'"
					, "'dataset'", "'sequential'", "'timestamps'", "'labels'", "'features'", "'preprocess_feature_scaler'",  "'preprocess_sample_normalizer'", "'model_algorithm'", "'automl'"
					, "'training_results'", "'prediction_results'"
					, "'NOT_SET'", "'ON'", "'OFF'", "'SEMI'", "'TRUE'", "'FALSE'", "'true'", "'false'", "'True'", "'False'"
					, "'pretrained'", "'pmml'", "'pfa'", "'path'"
					, "'StandardScaler'", "'MinMaxScaler'", "'RobustScaler'"
					, "'NORMALIZER_L2_NORM'", "'NORMALIZER_L1_NORM'", "'NORMALIZER_MAX_NORM'"
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
					, "'k_means'", "'n_clusters'", "'init'", "'n_init'", "'max_iter'", "'tol'", "'precompute_distances'", "'verbose'", "'random_state'", "'copy_x'", "'n_jobs'", "'algorithm'", "'full'", "'elkan'"
					, "'k-means++'", "'random'"
					, "'mini_batch_k_means'", "'n_clusters'", "'init'", "'max_iter'", "'batch_size'", "'verbose'", "'compute_labels'", "'random_state'", "'tol'", "'max_no_improvement'", "'init_size'", "'n_init'", "'reassignment_ratio'"
					, "'ball_tree'", "'kd_tree'", "'brute'"
					, "'dbscan'", "'eps'", "'min_samples'", "'metric'", "'metric_params'", "'algorithm'", "'leaf_size'", "'p'", "'n_jobs'"
					, "'spectral_clustering'", "'n_clusters'", "'eigen_solver'", "'n_components'", "'random_state'", "'n_init'", "'gamma'", "'affinity'", "'n_neighbors'", "'eigen_tol'", "'assign_labels'", "'degree'", "'coef0'", "'kernel_params'", "'n_jobs'", "'verbose'"
					, "'arpack'", "'lobpcg'", "'amg'"
					, "'gaussian_mixture'", "'n_components'", "'covariance_type'", "'tol'", "'reg_covar'", "'max_iter'", "'n_init'", "'init_params'", "'weights_init'", "'means_init'", "'precisions_init'", "'random_state'", "'warm_start'", "'verbose'", "'verbose_interval'"
					, "'kmeans'", "'discretize'",  "'random'", "'threshold'", "'k_best'", "'full'", "'tied'", "'diag'", "'spherical'"
					, "'self_training_classifier'", "'base_estimator'", "'threshold'", "'criterion'", "'k_best'", "'max_iter'", "'verbose'"
					, "'knn'", "'rbf'"
					, "'label_propagation'", "'kernel'", "'gamma'", "'n_neighbors'", "'max_iter'", "'tol'", "'n_jobs'"
					, "'label_spreading'", "'alpha'"					
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
