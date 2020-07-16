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
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.thingml.xtext.services.ThingMLGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractThingMLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ThingMLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DecisionTree_CommaKeyword_4_q;
	protected AbstractElementAlias match_DenoisingAutoencoders_CommaKeyword_4_q;
	protected AbstractElementAlias match_DenoisingAutoencoders_CommaKeyword_6_q;
	protected AbstractElementAlias match_DenoisingAutoencoders_CommaKeyword_8_q;
	protected AbstractElementAlias match_GatedRecurrentUnits_CommaKeyword_4_q;
	protected AbstractElementAlias match_GatedRecurrentUnits_CommaKeyword_6_q;
	protected AbstractElementAlias match_LongShortTermMemory_CommaKeyword_4_q;
	protected AbstractElementAlias match_LongShortTermMemory_CommaKeyword_6_q;
	protected AbstractElementAlias match_Message_SemicolonKeyword_6_q;
	protected AbstractElementAlias match_MinSamplesSplit_FLOATTerminalRuleCall_1_or_INTTerminalRuleCall_0;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_10_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_4_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_6_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_8_q;
	protected AbstractElementAlias match_ObjectType_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_PrimitiveType_SemicolonKeyword_6_q;
	protected AbstractElementAlias match_Protocol_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_RandomForest_CommaKeyword_4_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ThingMLGrammarAccess) access;
		match_DecisionTree_CommaKeyword_4_q = new TokenAlias(false, true, grammarAccess.getDecisionTreeAccess().getCommaKeyword_4());
		match_DenoisingAutoencoders_CommaKeyword_4_q = new TokenAlias(false, true, grammarAccess.getDenoisingAutoencodersAccess().getCommaKeyword_4());
		match_DenoisingAutoencoders_CommaKeyword_6_q = new TokenAlias(false, true, grammarAccess.getDenoisingAutoencodersAccess().getCommaKeyword_6());
		match_DenoisingAutoencoders_CommaKeyword_8_q = new TokenAlias(false, true, grammarAccess.getDenoisingAutoencodersAccess().getCommaKeyword_8());
		match_GatedRecurrentUnits_CommaKeyword_4_q = new TokenAlias(false, true, grammarAccess.getGatedRecurrentUnitsAccess().getCommaKeyword_4());
		match_GatedRecurrentUnits_CommaKeyword_6_q = new TokenAlias(false, true, grammarAccess.getGatedRecurrentUnitsAccess().getCommaKeyword_6());
		match_LongShortTermMemory_CommaKeyword_4_q = new TokenAlias(false, true, grammarAccess.getLongShortTermMemoryAccess().getCommaKeyword_4());
		match_LongShortTermMemory_CommaKeyword_6_q = new TokenAlias(false, true, grammarAccess.getLongShortTermMemoryAccess().getCommaKeyword_6());
		match_Message_SemicolonKeyword_6_q = new TokenAlias(false, true, grammarAccess.getMessageAccess().getSemicolonKeyword_6());
		match_MinSamplesSplit_FLOATTerminalRuleCall_1_or_INTTerminalRuleCall_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getMinSamplesSplitAccess().getFLOATTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getMinSamplesSplitAccess().getINTTerminalRuleCall_0()));
		match_NN_MultilayerPerceptron_CommaKeyword_10_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_10());
		match_NN_MultilayerPerceptron_CommaKeyword_4_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_4());
		match_NN_MultilayerPerceptron_CommaKeyword_6_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_6());
		match_NN_MultilayerPerceptron_CommaKeyword_8_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_8());
		match_ObjectType_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getObjectTypeAccess().getSemicolonKeyword_3());
		match_PrimitiveType_SemicolonKeyword_6_q = new TokenAlias(false, true, grammarAccess.getPrimitiveTypeAccess().getSemicolonKeyword_6());
		match_Protocol_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getProtocolAccess().getSemicolonKeyword_3());
		match_RandomForest_CommaKeyword_4_q = new TokenAlias(false, true, grammarAccess.getRandomForestAccess().getCommaKeyword_4());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getFLOATRule())
			return getFLOATToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal FLOAT returns ecore::EDouble :
	 * ('0'..'9')+ '.' ('0'..'9')* (('e'|'E') ('+' | '-')? ('0'..'9')+)?
	 * | '.' ('0'..'9')+ (('e'|'E') ('+' | '-')? ('0'..'9')+)?
	 * | ('0'..'9')+ ('e'|'E') ('+' | '-')? ('0'..'9')+;
	 */
	protected String getFLOATToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	
	/**
	 * terminal INT returns ecore::ELong: ('0'..'9')+;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_DecisionTree_CommaKeyword_4_q.equals(syntax))
				emit_DecisionTree_CommaKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DenoisingAutoencoders_CommaKeyword_4_q.equals(syntax))
				emit_DenoisingAutoencoders_CommaKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DenoisingAutoencoders_CommaKeyword_6_q.equals(syntax))
				emit_DenoisingAutoencoders_CommaKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DenoisingAutoencoders_CommaKeyword_8_q.equals(syntax))
				emit_DenoisingAutoencoders_CommaKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_GatedRecurrentUnits_CommaKeyword_4_q.equals(syntax))
				emit_GatedRecurrentUnits_CommaKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_GatedRecurrentUnits_CommaKeyword_6_q.equals(syntax))
				emit_GatedRecurrentUnits_CommaKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LongShortTermMemory_CommaKeyword_4_q.equals(syntax))
				emit_LongShortTermMemory_CommaKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_LongShortTermMemory_CommaKeyword_6_q.equals(syntax))
				emit_LongShortTermMemory_CommaKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Message_SemicolonKeyword_6_q.equals(syntax))
				emit_Message_SemicolonKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MinSamplesSplit_FLOATTerminalRuleCall_1_or_INTTerminalRuleCall_0.equals(syntax))
				emit_MinSamplesSplit_FLOATTerminalRuleCall_1_or_INTTerminalRuleCall_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_10_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_10_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_4_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_6_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_8_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ObjectType_SemicolonKeyword_3_q.equals(syntax))
				emit_ObjectType_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimitiveType_SemicolonKeyword_6_q.equals(syntax))
				emit_PrimitiveType_SemicolonKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Protocol_SemicolonKeyword_3_q.equals(syntax))
				emit_Protocol_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RandomForest_CommaKeyword_4_q.equals(syntax))
				emit_RandomForest_CommaKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     lossFunction=LossFunction (ambiguity) ')' (rule end)
	 *     lossFunction=LossFunction (ambiguity) 'min_samples_split' min_samples_split=MinSamplesSplit
	 *     name=ID '(' (ambiguity) ')' (rule end)
	 *     name=ID '(' (ambiguity) 'min_samples_split' min_samples_split=MinSamplesSplit
	 */
	protected void emit_DecisionTree_CommaKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     loss_function=LossFunction (ambiguity) ','? ','? ')' (rule end)
	 *     loss_function=LossFunction (ambiguity) ','? ','? 'sequence_length' sequence_length=INT
	 *     loss_function=LossFunction (ambiguity) ','? 'learning_rate' learning_rate=FLOAT
	 *     loss_function=LossFunction (ambiguity) 'optimizer' optimizer=Optimizer
	 *     name=ID '(' (ambiguity) ','? ','? ')' (rule end)
	 *     name=ID '(' (ambiguity) ','? ','? 'sequence_length' sequence_length=INT
	 *     name=ID '(' (ambiguity) ','? 'learning_rate' learning_rate=FLOAT
	 *     name=ID '(' (ambiguity) 'optimizer' optimizer=Optimizer
	 */
	protected void emit_DenoisingAutoencoders_CommaKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     loss_function=LossFunction ','? (ambiguity) ','? ')' (rule end)
	 *     loss_function=LossFunction ','? (ambiguity) ','? 'sequence_length' sequence_length=INT
	 *     loss_function=LossFunction ','? (ambiguity) 'learning_rate' learning_rate=FLOAT
	 *     name=ID '(' ','? (ambiguity) ','? ')' (rule end)
	 *     name=ID '(' ','? (ambiguity) ','? 'sequence_length' sequence_length=INT
	 *     name=ID '(' ','? (ambiguity) 'learning_rate' learning_rate=FLOAT
	 *     optimizer=Optimizer (ambiguity) ','? ')' (rule end)
	 *     optimizer=Optimizer (ambiguity) ','? 'sequence_length' sequence_length=INT
	 *     optimizer=Optimizer (ambiguity) 'learning_rate' learning_rate=FLOAT
	 */
	protected void emit_DenoisingAutoencoders_CommaKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     learning_rate=FLOAT (ambiguity) ')' (rule end)
	 *     learning_rate=FLOAT (ambiguity) 'sequence_length' sequence_length=INT
	 *     loss_function=LossFunction ','? ','? (ambiguity) ')' (rule end)
	 *     loss_function=LossFunction ','? ','? (ambiguity) 'sequence_length' sequence_length=INT
	 *     name=ID '(' ','? ','? (ambiguity) ')' (rule end)
	 *     name=ID '(' ','? ','? (ambiguity) 'sequence_length' sequence_length=INT
	 *     optimizer=Optimizer ','? (ambiguity) ')' (rule end)
	 *     optimizer=Optimizer ','? (ambiguity) 'sequence_length' sequence_length=INT
	 */
	protected void emit_DenoisingAutoencoders_CommaKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     loss_function=LossFunction (ambiguity) ','? ')' (rule end)
	 *     loss_function=LossFunction (ambiguity) ','? 'learning_rate' learning_rate=FLOAT
	 *     loss_function=LossFunction (ambiguity) 'optimizer' optimizer=Optimizer
	 *     name=ID '(' (ambiguity) ','? ')' (rule end)
	 *     name=ID '(' (ambiguity) ','? 'learning_rate' learning_rate=FLOAT
	 *     name=ID '(' (ambiguity) 'optimizer' optimizer=Optimizer
	 */
	protected void emit_GatedRecurrentUnits_CommaKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     loss_function=LossFunction ','? (ambiguity) ')' (rule end)
	 *     loss_function=LossFunction ','? (ambiguity) 'learning_rate' learning_rate=FLOAT
	 *     name=ID '(' ','? (ambiguity) ')' (rule end)
	 *     name=ID '(' ','? (ambiguity) 'learning_rate' learning_rate=FLOAT
	 *     optimizer=Optimizer (ambiguity) ')' (rule end)
	 *     optimizer=Optimizer (ambiguity) 'learning_rate' learning_rate=FLOAT
	 */
	protected void emit_GatedRecurrentUnits_CommaKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     loss_function=LossFunction (ambiguity) ','? ')' (rule end)
	 *     loss_function=LossFunction (ambiguity) ','? 'learning_rate' learning_rate=FLOAT
	 *     loss_function=LossFunction (ambiguity) 'optimizer' optimizer=Optimizer
	 *     name=ID '(' (ambiguity) ','? ')' (rule end)
	 *     name=ID '(' (ambiguity) ','? 'learning_rate' learning_rate=FLOAT
	 *     name=ID '(' (ambiguity) 'optimizer' optimizer=Optimizer
	 */
	protected void emit_LongShortTermMemory_CommaKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     loss_function=LossFunction ','? (ambiguity) ')' (rule end)
	 *     loss_function=LossFunction ','? (ambiguity) 'learning_rate' learning_rate=FLOAT
	 *     name=ID '(' ','? (ambiguity) ')' (rule end)
	 *     name=ID '(' ','? (ambiguity) 'learning_rate' learning_rate=FLOAT
	 *     optimizer=Optimizer (ambiguity) ')' (rule end)
	 *     optimizer=Optimizer (ambiguity) 'learning_rate' learning_rate=FLOAT
	 */
	protected void emit_LongShortTermMemory_CommaKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     INT | FLOAT
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_MinSamplesSplit_FLOATTerminalRuleCall_1_or_INTTerminalRuleCall_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     learning_rate=FLOAT ','? (ambiguity) ')' (rule end)
	 *     learning_rate=FLOAT ','? (ambiguity) 'dropout_probability' dropout_probability=FLOAT
	 *     loss_function=LossFunction ','? ','? ','? (ambiguity) ')' (rule end)
	 *     loss_function=LossFunction ','? ','? ','? (ambiguity) 'dropout_probability' dropout_probability=FLOAT
	 *     name=ID '(' ','? ','? ','? (ambiguity) ')' (rule end)
	 *     name=ID '(' ','? ','? ','? (ambiguity) 'dropout_probability' dropout_probability=FLOAT
	 *     no_layers=INT (ambiguity) ')' (rule end)
	 *     no_layers=INT (ambiguity) 'dropout_probability' dropout_probability=FLOAT
	 *     optimizer=Optimizer ','? ','? (ambiguity) ')' (rule end)
	 *     optimizer=Optimizer ','? ','? (ambiguity) 'dropout_probability' dropout_probability=FLOAT
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_10_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     loss_function=LossFunction (ambiguity) ','? ','? ','? ')' (rule end)
	 *     loss_function=LossFunction (ambiguity) ','? ','? ','? 'dropout_probability' dropout_probability=FLOAT
	 *     loss_function=LossFunction (ambiguity) ','? ','? 'no_layers' no_layers=INT
	 *     loss_function=LossFunction (ambiguity) ','? 'learning_rate' learning_rate=FLOAT
	 *     loss_function=LossFunction (ambiguity) 'optimizer' optimizer=Optimizer
	 *     name=ID '(' (ambiguity) ','? ','? ','? ')' (rule end)
	 *     name=ID '(' (ambiguity) ','? ','? ','? 'dropout_probability' dropout_probability=FLOAT
	 *     name=ID '(' (ambiguity) ','? ','? 'no_layers' no_layers=INT
	 *     name=ID '(' (ambiguity) ','? 'learning_rate' learning_rate=FLOAT
	 *     name=ID '(' (ambiguity) 'optimizer' optimizer=Optimizer
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     loss_function=LossFunction ','? (ambiguity) ','? ','? ')' (rule end)
	 *     loss_function=LossFunction ','? (ambiguity) ','? ','? 'dropout_probability' dropout_probability=FLOAT
	 *     loss_function=LossFunction ','? (ambiguity) ','? 'no_layers' no_layers=INT
	 *     loss_function=LossFunction ','? (ambiguity) 'learning_rate' learning_rate=FLOAT
	 *     name=ID '(' ','? (ambiguity) ','? ','? ')' (rule end)
	 *     name=ID '(' ','? (ambiguity) ','? ','? 'dropout_probability' dropout_probability=FLOAT
	 *     name=ID '(' ','? (ambiguity) ','? 'no_layers' no_layers=INT
	 *     name=ID '(' ','? (ambiguity) 'learning_rate' learning_rate=FLOAT
	 *     optimizer=Optimizer (ambiguity) ','? ','? ')' (rule end)
	 *     optimizer=Optimizer (ambiguity) ','? ','? 'dropout_probability' dropout_probability=FLOAT
	 *     optimizer=Optimizer (ambiguity) ','? 'no_layers' no_layers=INT
	 *     optimizer=Optimizer (ambiguity) 'learning_rate' learning_rate=FLOAT
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     learning_rate=FLOAT (ambiguity) ','? ')' (rule end)
	 *     learning_rate=FLOAT (ambiguity) ','? 'dropout_probability' dropout_probability=FLOAT
	 *     learning_rate=FLOAT (ambiguity) 'no_layers' no_layers=INT
	 *     loss_function=LossFunction ','? ','? (ambiguity) ','? ')' (rule end)
	 *     loss_function=LossFunction ','? ','? (ambiguity) ','? 'dropout_probability' dropout_probability=FLOAT
	 *     loss_function=LossFunction ','? ','? (ambiguity) 'no_layers' no_layers=INT
	 *     name=ID '(' ','? ','? (ambiguity) ','? ')' (rule end)
	 *     name=ID '(' ','? ','? (ambiguity) ','? 'dropout_probability' dropout_probability=FLOAT
	 *     name=ID '(' ','? ','? (ambiguity) 'no_layers' no_layers=INT
	 *     optimizer=Optimizer ','? (ambiguity) ','? ')' (rule end)
	 *     optimizer=Optimizer ','? (ambiguity) ','? 'dropout_probability' dropout_probability=FLOAT
	 *     optimizer=Optimizer ','? (ambiguity) 'no_layers' no_layers=INT
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     lossFunction=LossFunction (ambiguity) ')' (rule end)
	 *     lossFunction=LossFunction (ambiguity) 'min_samples_split' min_samples_split=MinSamplesSplit
	 *     name=ID '(' (ambiguity) ')' (rule end)
	 *     name=ID '(' (ambiguity) 'min_samples_split' min_samples_split=MinSamplesSplit
	 */
	protected void emit_RandomForest_CommaKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
