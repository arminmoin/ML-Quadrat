/*
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
define(["ace/lib/oop", "ace/mode/text", "ace/mode/text_highlight_rules"], function(oop, mText, mTextHighlightRules) {
	var HighlightRules = function() {
		var keywords = "Adadelta|Adagrad|Adam|Adamax|ENTROPY|FALSE|FRIEDMAN_MSE|Ftrl|GINI|MAE|MSE|NO_IDEA|Nadam|OFF|ON|RMSprop|SGD|TRUE|abstract|action|activation|and|as|batch_size|categorical_crossentropy|composite|configuration|connector|criterion|da_predict|da_preprocess|da_save|da_train|data_analytics|dataset|datatype|decision_tree|do|else|elu|end|entry|enumeration|epochs|error|errorln|event|exit|exponential|false|features|final|for|fork|fragment|from|function|guard|history|if|import|in|includes|init|instance|internal|keeps|labels|loss|message|min_samples_split|model_algorithm|nn_multilayer_perceptron|no_hidden_layers|not|object|on|optimizer|optional|or|over|path|pfa|pmml|port|prediction_results|print|println|property|protocol|provided|random_forest|readonly|receives|region|relu|required|return|selu|sends|sequential|session|set|sigmoid|softmax|softplus|softsign|sparse_categorical_crossentropy|state|statechart|tanh|thing|timestamps|training_results|transition|true|var|while";
		this.$rules = {
			"start": [
				{token: "lparen", regex: "[\\[({]"},
				{token: "rparen", regex: "[\\])}]"},
				{token: "keyword", regex: "\\b(?:" + keywords + ")\\b"}
			]
		};
	};
	oop.inherits(HighlightRules, mTextHighlightRules.TextHighlightRules);
	
	var Mode = function() {
		this.HighlightRules = HighlightRules;
	};
	oop.inherits(Mode, mText.Mode);
	Mode.prototype.$id = "xtext/thingml";
	Mode.prototype.getCompletions = function(state, session, pos, prefix) {
		return [];
	}
	
	return {
		Mode: Mode
	};
});
