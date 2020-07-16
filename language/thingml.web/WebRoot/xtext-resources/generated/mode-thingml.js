define(["ace/lib/oop", "ace/mode/text", "ace/mode/text_highlight_rules"], function(oop, mText, mTextHighlightRules) {
	var HighlightRules = function() {
		var keywords = "Adam|FALSE|FRIEDMAN_MSE|MAE|MSE|Nadam|OFF|ON|RMSprop|TRUE|abstract|action|and|as|combinatorial_optimization|composite|configuration|connector|da_predict|da_preprocess|da_save|da_train|data_analytics|dataset|datatype|decision_tree|denoising_autoencoders|do|dropout_probability|else|end|entry|enumeration|error|errorln|event|exit|factorial_hidden_markov_model|false|features|final|for|fork|fragment|from|function|gated_recurrent_units|guard|history|if|import|in|includes|init|instance|internal|keeps|labels|learning_rate|long_short_term_memory|loss_function|message|min_samples_split|model_algorithm|nn_multilayer_perceptron|no_layers|not|object|on|optimizer|optional|or|over|path|pfa|pmml|port|prediction_results|print|println|property|protocol|provided|random_forest|readonly|receives|region|required|return|sends|sequence_length|sequential|session|set|state|statechart|thing|timestamps|training_results|transition|true|var|while";
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
