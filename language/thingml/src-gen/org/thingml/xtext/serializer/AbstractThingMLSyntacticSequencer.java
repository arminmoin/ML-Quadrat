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
	protected AbstractElementAlias match_DecisionTree_CommaKeyword_4_q;
	protected AbstractElementAlias match_Message_SemicolonKeyword_6_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_10_q;
	protected AbstractElementAlias match_NN_MultilayerPerceptron_CommaKeyword_12_q;
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
		match_Message_SemicolonKeyword_6_q = new TokenAlias(false, true, grammarAccess.getMessageAccess().getSemicolonKeyword_6());
		match_NN_MultilayerPerceptron_CommaKeyword_10_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_10());
		match_NN_MultilayerPerceptron_CommaKeyword_12_q = new TokenAlias(false, true, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_12());
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
			else if (match_Message_SemicolonKeyword_6_q.equals(syntax))
				emit_Message_SemicolonKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_10_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_10_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NN_MultilayerPerceptron_CommaKeyword_12_q.equals(syntax))
				emit_NN_MultilayerPerceptron_CommaKeyword_12_q(semanticObject, getLastNavigableState(), syntaxNodes);
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
	 *     decisionTreeCriterion=DecisionTreeCriterion (ambiguity) ')' (rule end)
	 *     decisionTreeCriterion=DecisionTreeCriterion (ambiguity) 'min_samples_split' min_samples_split=Min_samples_split_type
	 *     name=ID '(' (ambiguity) ')' (rule end)
	 *     name=ID '(' (ambiguity) 'min_samples_split' min_samples_split=Min_samples_split_type
	 */
	protected void emit_DecisionTree_CommaKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     activation=Activation ','? ','? (ambiguity) ','? ')' (rule end)
	 *     activation=Activation ','? ','? (ambiguity) ','? 'batch_size' batch_size=INT
	 *     activation=Activation ','? ','? (ambiguity) 'epochs' epochs=INT
	 *     loss=Loss (ambiguity) ','? ')' (rule end)
	 *     loss=Loss (ambiguity) ','? 'batch_size' batch_size=INT
	 *     loss=Loss (ambiguity) 'epochs' epochs=INT
	 *     name=ID '(' ','? ','? ','? (ambiguity) ','? ')' (rule end)
	 *     name=ID '(' ','? ','? ','? (ambiguity) ','? 'batch_size' batch_size=INT
	 *     name=ID '(' ','? ','? ','? (ambiguity) 'epochs' epochs=INT
	 *     no_hidden_layers=INT ','? ','? ','? (ambiguity) ','? ')' (rule end)
	 *     no_hidden_layers=INT ','? ','? ','? (ambiguity) ','? 'batch_size' batch_size=INT
	 *     no_hidden_layers=INT ','? ','? ','? (ambiguity) 'epochs' epochs=INT
	 *     optimizer=Optimizer ','? (ambiguity) ','? ')' (rule end)
	 *     optimizer=Optimizer ','? (ambiguity) ','? 'batch_size' batch_size=INT
	 *     optimizer=Optimizer ','? (ambiguity) 'epochs' epochs=INT
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_10_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     activation=Activation ','? ','? ','? (ambiguity) ')' (rule end)
	 *     activation=Activation ','? ','? ','? (ambiguity) 'batch_size' batch_size=INT
	 *     epochs=INT (ambiguity) ')' (rule end)
	 *     epochs=INT (ambiguity) 'batch_size' batch_size=INT
	 *     loss=Loss ','? (ambiguity) ')' (rule end)
	 *     loss=Loss ','? (ambiguity) 'batch_size' batch_size=INT
	 *     name=ID '(' ','? ','? ','? ','? (ambiguity) ')' (rule end)
	 *     name=ID '(' ','? ','? ','? ','? (ambiguity) 'batch_size' batch_size=INT
	 *     no_hidden_layers=INT ','? ','? ','? ','? (ambiguity) ')' (rule end)
	 *     no_hidden_layers=INT ','? ','? ','? ','? (ambiguity) 'batch_size' batch_size=INT
	 *     optimizer=Optimizer ','? ','? (ambiguity) ')' (rule end)
	 *     optimizer=Optimizer ','? ','? (ambiguity) 'batch_size' batch_size=INT
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_12_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID '(' (ambiguity) ','? ','? ','? ','? ')' (rule end)
	 *     name=ID '(' (ambiguity) ','? ','? ','? ','? 'batch_size' batch_size=INT
	 *     name=ID '(' (ambiguity) ','? ','? ','? 'epochs' epochs=INT
	 *     name=ID '(' (ambiguity) ','? ','? 'loss' loss=Loss
	 *     name=ID '(' (ambiguity) ','? 'optimizer' optimizer=Optimizer
	 *     name=ID '(' (ambiguity) 'activation' activation=Activation
	 *     no_hidden_layers=INT (ambiguity) ','? ','? ','? ','? ')' (rule end)
	 *     no_hidden_layers=INT (ambiguity) ','? ','? ','? ','? 'batch_size' batch_size=INT
	 *     no_hidden_layers=INT (ambiguity) ','? ','? ','? 'epochs' epochs=INT
	 *     no_hidden_layers=INT (ambiguity) ','? ','? 'loss' loss=Loss
	 *     no_hidden_layers=INT (ambiguity) ','? 'optimizer' optimizer=Optimizer
	 *     no_hidden_layers=INT (ambiguity) 'activation' activation=Activation
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     activation=Activation (ambiguity) ','? ','? ','? ')' (rule end)
	 *     activation=Activation (ambiguity) ','? ','? ','? 'batch_size' batch_size=INT
	 *     activation=Activation (ambiguity) ','? ','? 'epochs' epochs=INT
	 *     activation=Activation (ambiguity) ','? 'loss' loss=Loss
	 *     activation=Activation (ambiguity) 'optimizer' optimizer=Optimizer
	 *     name=ID '(' ','? (ambiguity) ','? ','? ','? ')' (rule end)
	 *     name=ID '(' ','? (ambiguity) ','? ','? ','? 'batch_size' batch_size=INT
	 *     name=ID '(' ','? (ambiguity) ','? ','? 'epochs' epochs=INT
	 *     name=ID '(' ','? (ambiguity) ','? 'loss' loss=Loss
	 *     name=ID '(' ','? (ambiguity) 'optimizer' optimizer=Optimizer
	 *     no_hidden_layers=INT ','? (ambiguity) ','? ','? ','? ')' (rule end)
	 *     no_hidden_layers=INT ','? (ambiguity) ','? ','? ','? 'batch_size' batch_size=INT
	 *     no_hidden_layers=INT ','? (ambiguity) ','? ','? 'epochs' epochs=INT
	 *     no_hidden_layers=INT ','? (ambiguity) ','? 'loss' loss=Loss
	 *     no_hidden_layers=INT ','? (ambiguity) 'optimizer' optimizer=Optimizer
	 */
	protected void emit_NN_MultilayerPerceptron_CommaKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     activation=Activation ','? (ambiguity) ','? ','? ')' (rule end)
	 *     activation=Activation ','? (ambiguity) ','? ','? 'batch_size' batch_size=INT
	 *     activation=Activation ','? (ambiguity) ','? 'epochs' epochs=INT
	 *     activation=Activation ','? (ambiguity) 'loss' loss=Loss
	 *     name=ID '(' ','? ','? (ambiguity) ','? ','? ')' (rule end)
	 *     name=ID '(' ','? ','? (ambiguity) ','? ','? 'batch_size' batch_size=INT
	 *     name=ID '(' ','? ','? (ambiguity) ','? 'epochs' epochs=INT
	 *     name=ID '(' ','? ','? (ambiguity) 'loss' loss=Loss
	 *     no_hidden_layers=INT ','? ','? (ambiguity) ','? ','? ')' (rule end)
	 *     no_hidden_layers=INT ','? ','? (ambiguity) ','? ','? 'batch_size' batch_size=INT
	 *     no_hidden_layers=INT ','? ','? (ambiguity) ','? 'epochs' epochs=INT
	 *     no_hidden_layers=INT ','? ','? (ambiguity) 'loss' loss=Loss
	 *     optimizer=Optimizer (ambiguity) ','? ','? ')' (rule end)
	 *     optimizer=Optimizer (ambiguity) ','? ','? 'batch_size' batch_size=INT
	 *     optimizer=Optimizer (ambiguity) ','? 'epochs' epochs=INT
	 *     optimizer=Optimizer (ambiguity) 'loss' loss=Loss
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
	 *     name=ID '(' (ambiguity) ')' (rule end)
	 *     name=ID '(' (ambiguity) 'min_samples_split' min_samples_split=Min_samples_split_type
	 *     randomForestCriterion=RandomForestCriterion (ambiguity) ')' (rule end)
	 *     randomForestCriterion=RandomForestCriterion (ambiguity) 'min_samples_split' min_samples_split=Min_samples_split_type
	 */
	protected void emit_RandomForest_CommaKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
