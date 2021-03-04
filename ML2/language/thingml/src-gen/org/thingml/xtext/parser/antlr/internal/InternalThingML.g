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
grammar InternalThingML;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.thingml.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.thingml.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.thingml.xtext.services.ThingMLGrammarAccess;

}

@parser::members {

 	private ThingMLGrammarAccess grammarAccess;

    public InternalThingMLParser(TokenStream input, ThingMLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "ThingMLModel";
   	}

   	@Override
   	protected ThingMLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleThingMLModel
entryRuleThingMLModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getThingMLModelRule()); }
	iv_ruleThingMLModel=ruleThingMLModel
	{ $current=$iv_ruleThingMLModel.current; }
	EOF;

// Rule ThingMLModel
ruleThingMLModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getThingMLModelAccess().getImportsImportParserRuleCall_0_0());
				}
				lv_imports_0_0=ruleImport
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getThingMLModelRule());
					}
					add(
						$current,
						"imports",
						lv_imports_0_0,
						"org.thingml.xtext.ThingML.Import");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getThingMLModelAccess().getTypesTypeParserRuleCall_1_0_0());
					}
					lv_types_1_0=ruleType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getThingMLModelRule());
						}
						add(
							$current,
							"types",
							lv_types_1_0,
							"org.thingml.xtext.ThingML.Type");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getThingMLModelAccess().getProtocolsProtocolParserRuleCall_1_1_0());
					}
					lv_protocols_2_0=ruleProtocol
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getThingMLModelRule());
						}
						add(
							$current,
							"protocols",
							lv_protocols_2_0,
							"org.thingml.xtext.ThingML.Protocol");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getThingMLModelAccess().getConfigsConfigurationParserRuleCall_1_2_0());
					}
					lv_configs_3_0=ruleConfiguration
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getThingMLModelRule());
						}
						add(
							$current,
							"configs",
							lv_configs_3_0,
							"org.thingml.xtext.ThingML.Configuration");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	iv_ruleImport=ruleImport
	{ $current=$iv_ruleImport.current; }
	EOF;

// Rule Import
ruleImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='import'
		{
			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
		}
		(
			(
				lv_importURI_1_0=RULE_STRING
				{
					newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getImportRule());
					}
					setWithLastConsumed(
						$current,
						"importURI",
						lv_importURI_1_0,
						"org.thingml.xtext.ThingML.STRING");
				}
			)
		)
		(
			otherlv_2='from'
			{
				newLeafNode(otherlv_2, grammarAccess.getImportAccess().getFromKeyword_2_0());
			}
			(
				(
					lv_from_3_0=RULE_ID
					{
						newLeafNode(lv_from_3_0, grammarAccess.getImportAccess().getFromIDTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getImportRule());
						}
						setWithLastConsumed(
							$current,
							"from",
							lv_from_3_0,
							"org.thingml.xtext.ThingML.ID");
					}
				)
			)
		)?
	)
;

// Entry rule entryRulePlatformAnnotation
entryRulePlatformAnnotation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPlatformAnnotationRule()); }
	iv_rulePlatformAnnotation=rulePlatformAnnotation
	{ $current=$iv_rulePlatformAnnotation.current; }
	EOF;

// Rule PlatformAnnotation
rulePlatformAnnotation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ANNOTATION_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getPlatformAnnotationAccess().getNameANNOTATION_IDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPlatformAnnotationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.thingml.xtext.ThingML.ANNOTATION_ID");
				}
			)
		)
		(
			(
				(
					lv_value_1_0=RULE_EXTERN
					{
						newLeafNode(lv_value_1_0, grammarAccess.getPlatformAnnotationAccess().getValueEXTERNTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPlatformAnnotationRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_1_0,
							"org.thingml.xtext.ThingML.EXTERN");
					}
				)
			)
			    |
			(
				(
					lv_value_2_0=RULE_STRING
					{
						newLeafNode(lv_value_2_0, grammarAccess.getPlatformAnnotationAccess().getValueSTRINGTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPlatformAnnotationRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_2_0,
							"org.thingml.xtext.ThingML.STRING");
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	iv_ruleVariable=ruleVariable
	{ $current=$iv_ruleVariable.current; }
	EOF;

// Rule Variable
ruleVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='var'
			{
				newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVarKeyword_0_0());
			}
			(
				(
					lv_name_1_0=RULE_ID
					{
						newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVariableRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_1_0,
							"org.thingml.xtext.ThingML.ID");
					}
				)
			)
			otherlv_2=':'
			{
				newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getColonKeyword_0_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVariableAccess().getTypeRefTypeRefParserRuleCall_0_3_0());
					}
					lv_typeRef_3_0=ruleTypeRef
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVariableRule());
						}
						set(
							$current,
							"typeRef",
							lv_typeRef_3_0,
							"org.thingml.xtext.ThingML.TypeRef");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		{
			newCompositeNode(grammarAccess.getVariableAccess().getLocalVariableParserRuleCall_1());
		}
		this_LocalVariable_4=ruleLocalVariable
		{
			$current = $this_LocalVariable_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getVariableAccess().getPropertyParserRuleCall_2());
		}
		this_Property_5=ruleProperty
		{
			$current = $this_Property_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getVariableAccess().getParameterParserRuleCall_3());
		}
		this_Parameter_6=ruleParameter
		{
			$current = $this_Parameter_6.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTypeRef
entryRuleTypeRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRefRule()); }
	iv_ruleTypeRef=ruleTypeRef
	{ $current=$iv_ruleTypeRef.current; }
	EOF;

// Rule TypeRef
ruleTypeRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTypeRefRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getTypeRefAccess().getTypeTypeCrossReference_0_0());
				}
			)
		)
		(
			(
				(
					lv_isArray_1_0='['
					{
						newLeafNode(lv_isArray_1_0, grammarAccess.getTypeRefAccess().getIsArrayLeftSquareBracketKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTypeRefRule());
						}
						setWithLastConsumed($current, "isArray", true, "[");
					}
				)
			)
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getTypeRefAccess().getCardinalityIntegerLiteralParserRuleCall_1_1_0_0());
						}
						lv_cardinality_2_1=ruleIntegerLiteral
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTypeRefRule());
							}
							set(
								$current,
								"cardinality",
								lv_cardinality_2_1,
								"org.thingml.xtext.ThingML.IntegerLiteral");
							afterParserOrEnumRuleCall();
						}
						    |
						{
							newCompositeNode(grammarAccess.getTypeRefAccess().getCardinalityPropertyReferenceParserRuleCall_1_1_0_1());
						}
						lv_cardinality_2_2=rulePropertyReference
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTypeRefRule());
							}
							set(
								$current,
								"cardinality",
								lv_cardinality_2_2,
								"org.thingml.xtext.ThingML.PropertyReference");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)?
			otherlv_3=']'
			{
				newLeafNode(otherlv_3, grammarAccess.getTypeRefAccess().getRightSquareBracketKeyword_1_2());
			}
		)?
	)
;

// Entry rule entryRuleType
entryRuleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current; }
	EOF;

// Rule Type
ruleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0());
		}
		this_PrimitiveType_0=rulePrimitiveType
		{
			$current = $this_PrimitiveType_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getObjectTypeParserRuleCall_1());
		}
		this_ObjectType_1=ruleObjectType
		{
			$current = $this_ObjectType_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_2());
		}
		this_Enumeration_2=ruleEnumeration
		{
			$current = $this_Enumeration_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getThingParserRuleCall_3());
		}
		this_Thing_3=ruleThing
		{
			$current = $this_Thing_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePrimitiveType
entryRulePrimitiveType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimitiveTypeRule()); }
	iv_rulePrimitiveType=rulePrimitiveType
	{ $current=$iv_rulePrimitiveType.current; }
	EOF;

// Rule PrimitiveType
rulePrimitiveType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='datatype'
		{
			newLeafNode(otherlv_0, grammarAccess.getPrimitiveTypeAccess().getDatatypeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPrimitiveTypeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPrimitiveTypeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		(
			('<')=>
			otherlv_2='<'
			{
				newLeafNode(otherlv_2, grammarAccess.getPrimitiveTypeAccess().getLessThanSignKeyword_2());
			}
		)
		(
			(
				lv_ByteSize_3_0=RULE_INT
				{
					newLeafNode(lv_ByteSize_3_0, grammarAccess.getPrimitiveTypeAccess().getByteSizeINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPrimitiveTypeRule());
					}
					setWithLastConsumed(
						$current,
						"ByteSize",
						lv_ByteSize_3_0,
						"org.thingml.xtext.ThingML.INT");
				}
			)
		)
		otherlv_4='>'
		{
			newLeafNode(otherlv_4, grammarAccess.getPrimitiveTypeAccess().getGreaterThanSignKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
				}
				lv_annotations_5_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPrimitiveTypeRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_5_0,
						"org.thingml.xtext.ThingML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			otherlv_6=';'
			{
				newLeafNode(otherlv_6, grammarAccess.getPrimitiveTypeAccess().getSemicolonKeyword_6());
			}
		)?
	)
;

// Entry rule entryRuleObjectType
entryRuleObjectType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObjectTypeRule()); }
	iv_ruleObjectType=ruleObjectType
	{ $current=$iv_ruleObjectType.current; }
	EOF;

// Rule ObjectType
ruleObjectType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='object'
		{
			newLeafNode(otherlv_0, grammarAccess.getObjectTypeAccess().getObjectKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getObjectTypeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObjectTypeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getObjectTypeAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0());
				}
				lv_annotations_2_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getObjectTypeRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_2_0,
						"org.thingml.xtext.ThingML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getObjectTypeAccess().getSemicolonKeyword_3());
			}
		)?
	)
;

// Entry rule entryRuleEnumeration
entryRuleEnumeration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnumerationRule()); }
	iv_ruleEnumeration=ruleEnumeration
	{ $current=$iv_ruleEnumeration.current; }
	EOF;

// Rule Enumeration
ruleEnumeration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='enumeration'
		{
			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumerationKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEnumerationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		(
			(
				('as')=>
				otherlv_2='as'
				{
					newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getAsKeyword_2_0());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getEnumerationAccess().getTypeRefTypeRefParserRuleCall_2_1_0());
					}
					lv_typeRef_3_0=ruleTypeRef
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEnumerationRule());
						}
						set(
							$current,
							"typeRef",
							lv_typeRef_3_0,
							"org.thingml.xtext.ThingML.TypeRef");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getEnumerationAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0());
				}
				lv_annotations_4_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEnumerationRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_4_0,
						"org.thingml.xtext.ThingML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='{'
		{
			newLeafNode(otherlv_5, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_5_0());
				}
				lv_literals_6_0=ruleEnumerationLiteral
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEnumerationRule());
					}
					add(
						$current,
						"literals",
						lv_literals_6_0,
						"org.thingml.xtext.ThingML.EnumerationLiteral");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleEnumerationLiteral
entryRuleEnumerationLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnumerationLiteralRule()); }
	iv_ruleEnumerationLiteral=ruleEnumerationLiteral
	{ $current=$iv_ruleEnumerationLiteral.current; }
	EOF;

// Rule EnumerationLiteral
ruleEnumerationLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEnumerationLiteralRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		(
			otherlv_1='='
			{
				newLeafNode(otherlv_1, grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEnumerationLiteralAccess().getInitLiteralParserRuleCall_1_1_0());
					}
					lv_init_2_0=ruleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEnumerationLiteralRule());
						}
						set(
							$current,
							"init",
							lv_init_2_0,
							"org.thingml.xtext.ThingML.Literal");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getEnumerationLiteralAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0());
				}
				lv_annotations_3_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEnumerationLiteralRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_3_0,
						"org.thingml.xtext.ThingML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleThing
entryRuleThing returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getThingRule()); }
	iv_ruleThing=ruleThing
	{ $current=$iv_ruleThing.current; }
	EOF;

// Rule Thing
ruleThing returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='thing'
		{
			newLeafNode(otherlv_0, grammarAccess.getThingAccess().getThingKeyword_0());
		}
		(
			(
				lv_fragment_1_0='fragment'
				{
					newLeafNode(lv_fragment_1_0, grammarAccess.getThingAccess().getFragmentFragmentKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getThingRule());
					}
					setWithLastConsumed($current, "fragment", true, "fragment");
				}
			)
		)?
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getThingAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getThingRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		(
			otherlv_3='includes'
			{
				newLeafNode(otherlv_3, grammarAccess.getThingAccess().getIncludesKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getThingRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getThingAccess().getIncludesThingCrossReference_3_1_0());
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getThingAccess().getCommaKeyword_3_2_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getThingRule());
							}
						}
						otherlv_6=RULE_ID
						{
							newLeafNode(otherlv_6, grammarAccess.getThingAccess().getIncludesThingCrossReference_3_2_1_0());
						}
					)
				)
			)*
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getThingAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0());
				}
				lv_annotations_7_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getThingRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_7_0,
						"org.thingml.xtext.ThingML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_8='{'
		{
			newLeafNode(otherlv_8, grammarAccess.getThingAccess().getLeftCurlyBracketKeyword_5());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getThingAccess().getMessagesMessageParserRuleCall_6_0_0());
					}
					lv_messages_9_0=ruleMessage
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getThingRule());
						}
						add(
							$current,
							"messages",
							lv_messages_9_0,
							"org.thingml.xtext.ThingML.Message");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getThingAccess().getPortsPortParserRuleCall_6_1_0());
					}
					lv_ports_10_0=rulePort
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getThingRule());
						}
						add(
							$current,
							"ports",
							lv_ports_10_0,
							"org.thingml.xtext.ThingML.Port");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getThingAccess().getPropertiesPropertyParserRuleCall_6_2_0());
					}
					lv_properties_11_0=ruleProperty
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getThingRule());
						}
						add(
							$current,
							"properties",
							lv_properties_11_0,
							"org.thingml.xtext.ThingML.Property");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getThingAccess().getFunctionsFunctionParserRuleCall_6_3_0());
					}
					lv_functions_12_0=ruleFunction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getThingRule());
						}
						add(
							$current,
							"functions",
							lv_functions_12_0,
							"org.thingml.xtext.ThingML.Function");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getThingAccess().getAssignPropertyAssignParserRuleCall_6_4_0());
					}
					lv_assign_13_0=rulePropertyAssign
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getThingRule());
						}
						add(
							$current,
							"assign",
							lv_assign_13_0,
							"org.thingml.xtext.ThingML.PropertyAssign");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getThingAccess().getDataAnalyticsDataAnalyticsParserRuleCall_7_0());
				}
				lv_dataAnalytics_14_0=ruleDataAnalytics
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getThingRule());
					}
					add(
						$current,
						"dataAnalytics",
						lv_dataAnalytics_14_0,
						"org.thingml.xtext.ThingML.DataAnalytics");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getThingAccess().getBehaviourStateMachineParserRuleCall_8_0());
				}
				lv_behaviour_15_0=ruleStateMachine
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getThingRule());
					}
					set(
						$current,
						"behaviour",
						lv_behaviour_15_0,
						"org.thingml.xtext.ThingML.StateMachine");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_16='}'
		{
			newLeafNode(otherlv_16, grammarAccess.getThingAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRulePropertyAssign
entryRulePropertyAssign returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyAssignRule()); }
	iv_rulePropertyAssign=rulePropertyAssign
	{ $current=$iv_rulePropertyAssign.current; }
	EOF;

// Rule PropertyAssign
rulePropertyAssign returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='set'
		{
			newLeafNode(otherlv_0, grammarAccess.getPropertyAssignAccess().getSetKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyAssignRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getPropertyAssignAccess().getPropertyPropertyCrossReference_1_0());
				}
			)
		)
		(
			(
				('[')=>
				otherlv_2='['
				{
					newLeafNode(otherlv_2, grammarAccess.getPropertyAssignAccess().getLeftSquareBracketKeyword_2_0());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getPropertyAssignAccess().getIndexExpressionParserRuleCall_2_1_0());
					}
					lv_index_3_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPropertyAssignRule());
						}
						set(
							$current,
							"index",
							lv_index_3_0,
							"org.thingml.xtext.ThingML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_4=']'
			{
				newLeafNode(otherlv_4, grammarAccess.getPropertyAssignAccess().getRightSquareBracketKeyword_2_2());
			}
		)?
		otherlv_5='='
		{
			newLeafNode(otherlv_5, grammarAccess.getPropertyAssignAccess().getEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPropertyAssignAccess().getInitExpressionParserRuleCall_4_0());
				}
				lv_init_6_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertyAssignRule());
					}
					set(
						$current,
						"init",
						lv_init_6_0,
						"org.thingml.xtext.ThingML.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPropertyAssignAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
				}
				lv_annotations_7_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertyAssignRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_7_0,
						"org.thingml.xtext.ThingML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleProtocol
entryRuleProtocol returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProtocolRule()); }
	iv_ruleProtocol=ruleProtocol
	{ $current=$iv_ruleProtocol.current; }
	EOF;

// Rule Protocol
ruleProtocol returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='protocol'
		{
			newLeafNode(otherlv_0, grammarAccess.getProtocolAccess().getProtocolKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getProtocolAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProtocolRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProtocolAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0());
				}
				lv_annotations_2_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProtocolRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_2_0,
						"org.thingml.xtext.ThingML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getProtocolAccess().getSemicolonKeyword_3());
			}
		)?
	)
;

// Entry rule entryRuleFunction
entryRuleFunction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionRule()); }
	iv_ruleFunction=ruleFunction
	{ $current=$iv_ruleFunction.current; }
	EOF;

// Rule Function
ruleFunction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='function'
			{
				newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0_0());
			}
			(
				(
					lv_name_1_0=RULE_ID
					{
						newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFunctionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_1_0,
							"org.thingml.xtext.ThingML.ID");
					}
				)
			)
			otherlv_2='('
			{
				newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_0_2());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_0_3_0_0());
						}
						lv_parameters_3_0=ruleParameter
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFunctionRule());
							}
							add(
								$current,
								"parameters",
								lv_parameters_3_0,
								"org.thingml.xtext.ThingML.Parameter");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_4=','
					{
						newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getCommaKeyword_0_3_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_0_3_1_1_0());
							}
							lv_parameters_5_0=ruleParameter
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getFunctionRule());
								}
								add(
									$current,
									"parameters",
									lv_parameters_5_0,
									"org.thingml.xtext.ThingML.Parameter");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
			)?
			otherlv_6=')'
			{
				newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_0_4());
			}
			(
				otherlv_7=':'
				{
					newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getColonKeyword_0_5_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getFunctionAccess().getTypeRefTypeRefParserRuleCall_0_5_1_0());
						}
						lv_typeRef_8_0=ruleTypeRef
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFunctionRule());
							}
							set(
								$current,
								"typeRef",
								lv_typeRef_8_0,
								"org.thingml.xtext.ThingML.TypeRef");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)?
			(
				(
					{
						newCompositeNode(grammarAccess.getFunctionAccess().getAnnotationsPlatformAnnotationParserRuleCall_0_6_0());
					}
					lv_annotations_9_0=rulePlatformAnnotation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunctionRule());
						}
						add(
							$current,
							"annotations",
							lv_annotations_9_0,
							"org.thingml.xtext.ThingML.PlatformAnnotation");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			(
				(
					{
						newCompositeNode(grammarAccess.getFunctionAccess().getBodyActionParserRuleCall_0_7_0());
					}
					lv_body_10_0=ruleAction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunctionRule());
						}
						set(
							$current,
							"body",
							lv_body_10_0,
							"org.thingml.xtext.ThingML.Action");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		{
			newCompositeNode(grammarAccess.getFunctionAccess().getAbstractFunctionParserRuleCall_1());
		}
		this_AbstractFunction_11=ruleAbstractFunction
		{
			$current = $this_AbstractFunction_11.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAbstractFunction
entryRuleAbstractFunction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractFunctionRule()); }
	iv_ruleAbstractFunction=ruleAbstractFunction
	{ $current=$iv_ruleAbstractFunction.current; }
	EOF;

// Rule AbstractFunction
ruleAbstractFunction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_abstract_0_0='abstract'
				{
					newLeafNode(lv_abstract_0_0, grammarAccess.getAbstractFunctionAccess().getAbstractAbstractKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAbstractFunctionRule());
					}
					setWithLastConsumed($current, "abstract", true, "abstract");
				}
			)
		)
		otherlv_1='function'
		{
			newLeafNode(otherlv_1, grammarAccess.getAbstractFunctionAccess().getFunctionKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getAbstractFunctionAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAbstractFunctionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		otherlv_3='('
		{
			newLeafNode(otherlv_3, grammarAccess.getAbstractFunctionAccess().getLeftParenthesisKeyword_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getAbstractFunctionAccess().getParametersParameterParserRuleCall_4_0_0());
					}
					lv_parameters_4_0=ruleParameter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAbstractFunctionRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_4_0,
							"org.thingml.xtext.ThingML.Parameter");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getAbstractFunctionAccess().getCommaKeyword_4_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getAbstractFunctionAccess().getParametersParameterParserRuleCall_4_1_1_0());
						}
						lv_parameters_6_0=ruleParameter
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAbstractFunctionRule());
							}
							add(
								$current,
								"parameters",
								lv_parameters_6_0,
								"org.thingml.xtext.ThingML.Parameter");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_7=')'
		{
			newLeafNode(otherlv_7, grammarAccess.getAbstractFunctionAccess().getRightParenthesisKeyword_5());
		}
		(
			otherlv_8=':'
			{
				newLeafNode(otherlv_8, grammarAccess.getAbstractFunctionAccess().getColonKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAbstractFunctionAccess().getTypeRefTypeRefParserRuleCall_6_1_0());
					}
					lv_typeRef_9_0=ruleTypeRef
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAbstractFunctionRule());
						}
						set(
							$current,
							"typeRef",
							lv_typeRef_9_0,
							"org.thingml.xtext.ThingML.TypeRef");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getAbstractFunctionAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0());
				}
				lv_annotations_10_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAbstractFunctionRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_10_0,
						"org.thingml.xtext.ThingML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleProperty
entryRuleProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyRule()); }
	iv_ruleProperty=ruleProperty
	{ $current=$iv_ruleProperty.current; }
	EOF;

// Rule Property
ruleProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_readonly_0_0='readonly'
				{
					newLeafNode(lv_readonly_0_0, grammarAccess.getPropertyAccess().getReadonlyReadonlyKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyRule());
					}
					setWithLastConsumed($current, "readonly", true, "readonly");
				}
			)
		)?
		otherlv_1='property'
		{
			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getPropertyKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getColonKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPropertyAccess().getTypeRefTypeRefParserRuleCall_4_0());
				}
				lv_typeRef_4_0=ruleTypeRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertyRule());
					}
					set(
						$current,
						"typeRef",
						lv_typeRef_4_0,
						"org.thingml.xtext.ThingML.TypeRef");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5='='
			{
				newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getEqualsSignKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPropertyAccess().getInitExpressionParserRuleCall_5_1_0());
					}
					lv_init_6_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPropertyRule());
						}
						set(
							$current,
							"init",
							lv_init_6_0,
							"org.thingml.xtext.ThingML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getPropertyAccess().getAnnotationsPlatformAnnotationParserRuleCall_6_0());
				}
				lv_annotations_7_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertyRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_7_0,
						"org.thingml.xtext.ThingML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleMessage
entryRuleMessage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMessageRule()); }
	iv_ruleMessage=ruleMessage
	{ $current=$iv_ruleMessage.current; }
	EOF;

// Rule Message
ruleMessage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='message'
		{
			newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getMessageKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMessageRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getMessageAccess().getParametersParameterParserRuleCall_3_0_0());
					}
					lv_parameters_3_0=ruleParameter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMessageRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_3_0,
							"org.thingml.xtext.ThingML.Parameter");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMessageAccess().getParametersParameterParserRuleCall_3_1_1_0());
						}
						lv_parameters_5_0=ruleParameter
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMessageRule());
							}
							add(
								$current,
								"parameters",
								lv_parameters_5_0,
								"org.thingml.xtext.ThingML.Parameter");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getRightParenthesisKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMessageAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
				}
				lv_annotations_7_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMessageRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_7_0,
						"org.thingml.xtext.ThingML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			otherlv_8=';'
			{
				newLeafNode(otherlv_8, grammarAccess.getMessageAccess().getSemicolonKeyword_6());
			}
		)?
	)
;

// Entry rule entryRuleParameter
entryRuleParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParameterRule()); }
	iv_ruleParameter=ruleParameter
	{ $current=$iv_ruleParameter.current; }
	EOF;

// Rule Parameter
ruleParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParameterRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParameterAccess().getTypeRefTypeRefParserRuleCall_2_0());
				}
				lv_typeRef_2_0=ruleTypeRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParameterRule());
					}
					set(
						$current,
						"typeRef",
						lv_typeRef_2_0,
						"org.thingml.xtext.ThingML.TypeRef");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getParameterAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0());
				}
				lv_annotations_3_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParameterRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_3_0,
						"org.thingml.xtext.ThingML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRulePort
entryRulePort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPortRule()); }
	iv_rulePort=rulePort
	{ $current=$iv_rulePort.current; }
	EOF;

// Rule Port
rulePort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPortAccess().getRequiredPortParserRuleCall_0());
		}
		this_RequiredPort_0=ruleRequiredPort
		{
			$current = $this_RequiredPort_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPortAccess().getProvidedPortParserRuleCall_1());
		}
		this_ProvidedPort_1=ruleProvidedPort
		{
			$current = $this_ProvidedPort_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPortAccess().getInternalPortParserRuleCall_2());
		}
		this_InternalPort_2=ruleInternalPort
		{
			$current = $this_InternalPort_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleRequiredPort
entryRuleRequiredPort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRequiredPortRule()); }
	iv_ruleRequiredPort=ruleRequiredPort
	{ $current=$iv_ruleRequiredPort.current; }
	EOF;

// Rule RequiredPort
ruleRequiredPort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_optional_0_0='optional'
				{
					newLeafNode(lv_optional_0_0, grammarAccess.getRequiredPortAccess().getOptionalOptionalKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRequiredPortRule());
					}
					setWithLastConsumed($current, "optional", true, "optional");
				}
			)
		)?
		otherlv_1='required'
		{
			newLeafNode(otherlv_1, grammarAccess.getRequiredPortAccess().getRequiredKeyword_1());
		}
		otherlv_2='port'
		{
			newLeafNode(otherlv_2, grammarAccess.getRequiredPortAccess().getPortKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getRequiredPortAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRequiredPortRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRequiredPortAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0());
				}
				lv_annotations_4_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRequiredPortRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_4_0,
						"org.thingml.xtext.ThingML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='{'
		{
			newLeafNode(otherlv_5, grammarAccess.getRequiredPortAccess().getLeftCurlyBracketKeyword_5());
		}
		(
			(
				otherlv_6='sends'
				{
					newLeafNode(otherlv_6, grammarAccess.getRequiredPortAccess().getSendsKeyword_6_0_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getRequiredPortRule());
							}
						}
						otherlv_7=RULE_ID
						{
							newLeafNode(otherlv_7, grammarAccess.getRequiredPortAccess().getSendsMessageCrossReference_6_0_1_0());
						}
					)
				)
				(
					otherlv_8=','
					{
						newLeafNode(otherlv_8, grammarAccess.getRequiredPortAccess().getCommaKeyword_6_0_2_0());
					}
					(
						(
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getRequiredPortRule());
								}
							}
							otherlv_9=RULE_ID
							{
								newLeafNode(otherlv_9, grammarAccess.getRequiredPortAccess().getSendsMessageCrossReference_6_0_2_1_0());
							}
						)
					)
				)*
			)
			    |
			(
				otherlv_10='receives'
				{
					newLeafNode(otherlv_10, grammarAccess.getRequiredPortAccess().getReceivesKeyword_6_1_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getRequiredPortRule());
							}
						}
						otherlv_11=RULE_ID
						{
							newLeafNode(otherlv_11, grammarAccess.getRequiredPortAccess().getReceivesMessageCrossReference_6_1_1_0());
						}
					)
				)
				(
					otherlv_12=','
					{
						newLeafNode(otherlv_12, grammarAccess.getRequiredPortAccess().getCommaKeyword_6_1_2_0());
					}
					(
						(
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getRequiredPortRule());
								}
							}
							otherlv_13=RULE_ID
							{
								newLeafNode(otherlv_13, grammarAccess.getRequiredPortAccess().getReceivesMessageCrossReference_6_1_2_1_0());
							}
						)
					)
				)*
			)
		)*
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getRequiredPortAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleProvidedPort
entryRuleProvidedPort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProvidedPortRule()); }
	iv_ruleProvidedPort=ruleProvidedPort
	{ $current=$iv_ruleProvidedPort.current; }
	EOF;

// Rule ProvidedPort
ruleProvidedPort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='provided'
		{
			newLeafNode(otherlv_0, grammarAccess.getProvidedPortAccess().getProvidedKeyword_0());
		}
		otherlv_1='port'
		{
			newLeafNode(otherlv_1, grammarAccess.getProvidedPortAccess().getPortKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getProvidedPortAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProvidedPortRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProvidedPortAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0());
				}
				lv_annotations_3_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProvidedPortRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_3_0,
						"org.thingml.xtext.ThingML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getProvidedPortAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				otherlv_5='sends'
				{
					newLeafNode(otherlv_5, grammarAccess.getProvidedPortAccess().getSendsKeyword_5_0_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getProvidedPortRule());
							}
						}
						otherlv_6=RULE_ID
						{
							newLeafNode(otherlv_6, grammarAccess.getProvidedPortAccess().getSendsMessageCrossReference_5_0_1_0());
						}
					)
				)
				(
					otherlv_7=','
					{
						newLeafNode(otherlv_7, grammarAccess.getProvidedPortAccess().getCommaKeyword_5_0_2_0());
					}
					(
						(
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getProvidedPortRule());
								}
							}
							otherlv_8=RULE_ID
							{
								newLeafNode(otherlv_8, grammarAccess.getProvidedPortAccess().getSendsMessageCrossReference_5_0_2_1_0());
							}
						)
					)
				)*
			)
			    |
			(
				otherlv_9='receives'
				{
					newLeafNode(otherlv_9, grammarAccess.getProvidedPortAccess().getReceivesKeyword_5_1_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getProvidedPortRule());
							}
						}
						otherlv_10=RULE_ID
						{
							newLeafNode(otherlv_10, grammarAccess.getProvidedPortAccess().getReceivesMessageCrossReference_5_1_1_0());
						}
					)
				)
				(
					otherlv_11=','
					{
						newLeafNode(otherlv_11, grammarAccess.getProvidedPortAccess().getCommaKeyword_5_1_2_0());
					}
					(
						(
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getProvidedPortRule());
								}
							}
							otherlv_12=RULE_ID
							{
								newLeafNode(otherlv_12, grammarAccess.getProvidedPortAccess().getReceivesMessageCrossReference_5_1_2_1_0());
							}
						)
					)
				)*
			)
		)*
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getProvidedPortAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleInternalPort
entryRuleInternalPort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInternalPortRule()); }
	iv_ruleInternalPort=ruleInternalPort
	{ $current=$iv_ruleInternalPort.current; }
	EOF;

// Rule InternalPort
ruleInternalPort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='internal'
		{
			newLeafNode(otherlv_0, grammarAccess.getInternalPortAccess().getInternalKeyword_0());
		}
		otherlv_1='port'
		{
			newLeafNode(otherlv_1, grammarAccess.getInternalPortAccess().getPortKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getInternalPortAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInternalPortRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getInternalPortAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0());
				}
				lv_annotations_3_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInternalPortRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_3_0,
						"org.thingml.xtext.ThingML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getInternalPortAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				otherlv_5='sends'
				{
					newLeafNode(otherlv_5, grammarAccess.getInternalPortAccess().getSendsKeyword_5_0_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getInternalPortRule());
							}
						}
						otherlv_6=RULE_ID
						{
							newLeafNode(otherlv_6, grammarAccess.getInternalPortAccess().getSendsMessageCrossReference_5_0_1_0());
						}
					)
				)
				(
					otherlv_7=','
					{
						newLeafNode(otherlv_7, grammarAccess.getInternalPortAccess().getCommaKeyword_5_0_2_0());
					}
					(
						(
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getInternalPortRule());
								}
							}
							otherlv_8=RULE_ID
							{
								newLeafNode(otherlv_8, grammarAccess.getInternalPortAccess().getSendsMessageCrossReference_5_0_2_1_0());
							}
						)
					)
				)*
			)
			    |
			(
				otherlv_9='receives'
				{
					newLeafNode(otherlv_9, grammarAccess.getInternalPortAccess().getReceivesKeyword_5_1_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getInternalPortRule());
							}
						}
						otherlv_10=RULE_ID
						{
							newLeafNode(otherlv_10, grammarAccess.getInternalPortAccess().getReceivesMessageCrossReference_5_1_1_0());
						}
					)
				)
				(
					otherlv_11=','
					{
						newLeafNode(otherlv_11, grammarAccess.getInternalPortAccess().getCommaKeyword_5_1_2_0());
					}
					(
						(
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getInternalPortRule());
								}
							}
							otherlv_12=RULE_ID
							{
								newLeafNode(otherlv_12, grammarAccess.getInternalPortAccess().getReceivesMessageCrossReference_5_1_2_1_0());
							}
						)
					)
				)*
			)
		)*
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getInternalPortAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleState
entryRuleState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current; }
	EOF;

// Rule State
ruleState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStateAccess().getStateMachineParserRuleCall_0());
		}
		this_StateMachine_0=ruleStateMachine
		{
			$current = $this_StateMachine_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStateAccess().getFinalStateParserRuleCall_1());
		}
		this_FinalState_1=ruleFinalState
		{
			$current = $this_FinalState_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStateAccess().getCompositeStateParserRuleCall_2());
		}
		this_CompositeState_2=ruleCompositeState
		{
			$current = $this_CompositeState_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			otherlv_3='state'
			{
				newLeafNode(otherlv_3, grammarAccess.getStateAccess().getStateKeyword_3_0());
			}
			(
				(
					lv_name_4_0=RULE_ID
					{
						newLeafNode(lv_name_4_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStateRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_4_0,
							"org.thingml.xtext.ThingML.ID");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getStateAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_2_0());
					}
					lv_annotations_5_0=rulePlatformAnnotation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStateRule());
						}
						add(
							$current,
							"annotations",
							lv_annotations_5_0,
							"org.thingml.xtext.ThingML.PlatformAnnotation");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_6='{'
			{
				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStateAccess().getPropertiesPropertyParserRuleCall_3_4_0());
					}
					lv_properties_7_0=ruleProperty
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStateRule());
						}
						add(
							$current,
							"properties",
							lv_properties_7_0,
							"org.thingml.xtext.ThingML.Property");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			(
				(
					{ 
					  getUnorderedGroupHelper().enter(grammarAccess.getStateAccess().getUnorderedGroup_3_5());
					}
					(
						(
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 0)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 0);
						}
									({true}?=>(otherlv_9='on'
									{
										newLeafNode(otherlv_9, grammarAccess.getStateAccess().getOnKeyword_3_5_0_0());
									}
									otherlv_10='entry'
									{
										newLeafNode(otherlv_10, grammarAccess.getStateAccess().getEntryKeyword_3_5_0_1());
									}
									(
										(
											{
												newCompositeNode(grammarAccess.getStateAccess().getEntryActionParserRuleCall_3_5_0_2_0());
											}
											lv_entry_11_0=ruleAction
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getStateRule());
												}
												set(
													$current,
													"entry",
													lv_entry_11_0,
													"org.thingml.xtext.ThingML.Action");
												afterParserOrEnumRuleCall();
											}
										)
									)
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateAccess().getUnorderedGroup_3_5());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 1)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 1);
						}
									({true}?=>(otherlv_12='on'
									{
										newLeafNode(otherlv_12, grammarAccess.getStateAccess().getOnKeyword_3_5_1_0());
									}
									otherlv_13='exit'
									{
										newLeafNode(otherlv_13, grammarAccess.getStateAccess().getExitKeyword_3_5_1_1());
									}
									(
										(
											{
												newCompositeNode(grammarAccess.getStateAccess().getExitActionParserRuleCall_3_5_1_2_0());
											}
											lv_exit_14_0=ruleAction
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getStateRule());
												}
												set(
													$current,
													"exit",
													lv_exit_14_0,
													"org.thingml.xtext.ThingML.Action");
												afterParserOrEnumRuleCall();
											}
										)
									)
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateAccess().getUnorderedGroup_3_5());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 2)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 2);
						}
									({true}?=>((
										(
											{
												newCompositeNode(grammarAccess.getStateAccess().getPropertiesPropertyParserRuleCall_3_5_2_0_0());
											}
											lv_properties_15_0=ruleProperty
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getStateRule());
												}
												add(
													$current,
													"properties",
													lv_properties_15_0,
													"org.thingml.xtext.ThingML.Property");
												afterParserOrEnumRuleCall();
											}
										)
									)
									    |
									(
										(
											{
												newCompositeNode(grammarAccess.getStateAccess().getInternalInternalTransitionParserRuleCall_3_5_2_1_0());
											}
											lv_internal_16_0=ruleInternalTransition
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getStateRule());
												}
												add(
													$current,
													"internal",
													lv_internal_16_0,
													"org.thingml.xtext.ThingML.InternalTransition");
												afterParserOrEnumRuleCall();
											}
										)
									)
									    |
									(
										(
											{
												newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionParserRuleCall_3_5_2_2_0());
											}
											lv_outgoing_17_0=ruleTransition
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getStateRule());
												}
												add(
													$current,
													"outgoing",
													lv_outgoing_17_0,
													"org.thingml.xtext.ThingML.Transition");
												afterParserOrEnumRuleCall();
											}
										)
									)
									))+
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateAccess().getUnorderedGroup_3_5());
						}
					)
				)
						)*
					)
				)
					{ 
					  getUnorderedGroupHelper().leave(grammarAccess.getStateAccess().getUnorderedGroup_3_5());
					}
			)
			otherlv_18='}'
			{
				newLeafNode(otherlv_18, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_6());
			}
		)
	)
;

// Entry rule entryRuleHandler
entryRuleHandler returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHandlerRule()); }
	iv_ruleHandler=ruleHandler
	{ $current=$iv_ruleHandler.current; }
	EOF;

// Rule Handler
ruleHandler returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getHandlerAccess().getTransitionParserRuleCall_0());
		}
		this_Transition_0=ruleTransition
		{
			$current = $this_Transition_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getHandlerAccess().getInternalTransitionParserRuleCall_1());
		}
		this_InternalTransition_1=ruleInternalTransition
		{
			$current = $this_InternalTransition_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	iv_ruleTransition=ruleTransition
	{ $current=$iv_ruleTransition.current; }
	EOF;

// Rule Transition
ruleTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='transition'
		{
			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)?
		otherlv_2='->'
		{
			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getTargetStateCrossReference_3_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTransitionAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0());
				}
				lv_annotations_4_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTransitionRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_4_0,
						"org.thingml.xtext.ThingML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			otherlv_5='event'
			{
				newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getEventKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTransitionAccess().getEventEventParserRuleCall_5_1_0());
					}
					lv_event_6_0=ruleEvent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTransitionRule());
						}
						set(
							$current,
							"event",
							lv_event_6_0,
							"org.thingml.xtext.ThingML.Event");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_7='guard'
			{
				newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getGuardKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTransitionAccess().getGuardExpressionParserRuleCall_6_1_0());
					}
					lv_guard_8_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTransitionRule());
						}
						set(
							$current,
							"guard",
							lv_guard_8_0,
							"org.thingml.xtext.ThingML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_9='action'
			{
				newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getActionKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTransitionAccess().getActionActionParserRuleCall_7_1_0());
					}
					lv_action_10_0=ruleAction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTransitionRule());
						}
						set(
							$current,
							"action",
							lv_action_10_0,
							"org.thingml.xtext.ThingML.Action");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleInternalTransition
entryRuleInternalTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInternalTransitionRule()); }
	iv_ruleInternalTransition=ruleInternalTransition
	{ $current=$iv_ruleInternalTransition.current; }
	EOF;

// Rule InternalTransition
ruleInternalTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getInternalTransitionAccess().getInternalTransitionAction_0(),
					$current);
			}
		)
		otherlv_1='internal'
		{
			newLeafNode(otherlv_1, grammarAccess.getInternalTransitionAccess().getInternalKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getInternalTransitionAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInternalTransitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getInternalTransitionAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0());
				}
				lv_annotations_3_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInternalTransitionRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_3_0,
						"org.thingml.xtext.ThingML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			otherlv_4='event'
			{
				newLeafNode(otherlv_4, grammarAccess.getInternalTransitionAccess().getEventKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getInternalTransitionAccess().getEventEventParserRuleCall_4_1_0());
					}
					lv_event_5_0=ruleEvent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInternalTransitionRule());
						}
						set(
							$current,
							"event",
							lv_event_5_0,
							"org.thingml.xtext.ThingML.Event");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_6='guard'
			{
				newLeafNode(otherlv_6, grammarAccess.getInternalTransitionAccess().getGuardKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getInternalTransitionAccess().getGuardExpressionParserRuleCall_5_1_0());
					}
					lv_guard_7_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInternalTransitionRule());
						}
						set(
							$current,
							"guard",
							lv_guard_7_0,
							"org.thingml.xtext.ThingML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_8='action'
			{
				newLeafNode(otherlv_8, grammarAccess.getInternalTransitionAccess().getActionKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getInternalTransitionAccess().getActionActionParserRuleCall_6_1_0());
					}
					lv_action_9_0=ruleAction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInternalTransitionRule());
						}
						set(
							$current,
							"action",
							lv_action_9_0,
							"org.thingml.xtext.ThingML.Action");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleCompositeState
entryRuleCompositeState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCompositeStateRule()); }
	iv_ruleCompositeState=ruleCompositeState
	{ $current=$iv_ruleCompositeState.current; }
	EOF;

// Rule CompositeState
ruleCompositeState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='composite'
		{
			newLeafNode(otherlv_0, grammarAccess.getCompositeStateAccess().getCompositeKeyword_0());
		}
		otherlv_1='state'
		{
			newLeafNode(otherlv_1, grammarAccess.getCompositeStateAccess().getStateKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getCompositeStateAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCompositeStateRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		otherlv_3='init'
		{
			newLeafNode(otherlv_3, grammarAccess.getCompositeStateAccess().getInitKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCompositeStateRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getCompositeStateAccess().getInitialStateCrossReference_4_0());
				}
			)
		)
		(
			otherlv_5='keeps'
			{
				newLeafNode(otherlv_5, grammarAccess.getCompositeStateAccess().getKeepsKeyword_5_0());
			}
			(
				(
					lv_history_6_0='history'
					{
						newLeafNode(lv_history_6_0, grammarAccess.getCompositeStateAccess().getHistoryHistoryKeyword_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCompositeStateRule());
						}
						setWithLastConsumed($current, "history", true, "history");
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getCompositeStateAccess().getAnnotationsPlatformAnnotationParserRuleCall_6_0());
				}
				lv_annotations_7_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompositeStateRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_7_0,
						"org.thingml.xtext.ThingML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_8='{'
		{
			newLeafNode(otherlv_8, grammarAccess.getCompositeStateAccess().getLeftCurlyBracketKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCompositeStateAccess().getPropertiesPropertyParserRuleCall_8_0());
				}
				lv_properties_9_0=ruleProperty
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompositeStateRule());
					}
					add(
						$current,
						"properties",
						lv_properties_9_0,
						"org.thingml.xtext.ThingML.Property");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 0);
					}
								({true}?=>(otherlv_11='on'
								{
									newLeafNode(otherlv_11, grammarAccess.getCompositeStateAccess().getOnKeyword_9_0_0());
								}
								otherlv_12='entry'
								{
									newLeafNode(otherlv_12, grammarAccess.getCompositeStateAccess().getEntryKeyword_9_0_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getCompositeStateAccess().getEntryActionParserRuleCall_9_0_2_0());
										}
										lv_entry_13_0=ruleAction
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getCompositeStateRule());
											}
											set(
												$current,
												"entry",
												lv_entry_13_0,
												"org.thingml.xtext.ThingML.Action");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 1);
					}
								({true}?=>(otherlv_14='on'
								{
									newLeafNode(otherlv_14, grammarAccess.getCompositeStateAccess().getOnKeyword_9_1_0());
								}
								otherlv_15='exit'
								{
									newLeafNode(otherlv_15, grammarAccess.getCompositeStateAccess().getExitKeyword_9_1_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getCompositeStateAccess().getExitActionParserRuleCall_9_1_2_0());
										}
										lv_exit_16_0=ruleAction
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getCompositeStateRule());
											}
											set(
												$current,
												"exit",
												lv_exit_16_0,
												"org.thingml.xtext.ThingML.Action");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 2);
					}
								({true}?=>((
									(
										{
											newCompositeNode(grammarAccess.getCompositeStateAccess().getPropertiesPropertyParserRuleCall_9_2_0_0());
										}
										lv_properties_17_0=ruleProperty
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getCompositeStateRule());
											}
											add(
												$current,
												"properties",
												lv_properties_17_0,
												"org.thingml.xtext.ThingML.Property");
											afterParserOrEnumRuleCall();
										}
									)
								)
								    |
								(
									(
										{
											newCompositeNode(grammarAccess.getCompositeStateAccess().getSubstateStateParserRuleCall_9_2_1_0());
										}
										lv_substate_18_0=ruleState
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getCompositeStateRule());
											}
											add(
												$current,
												"substate",
												lv_substate_18_0,
												"org.thingml.xtext.ThingML.State");
											afterParserOrEnumRuleCall();
										}
									)
								)
								    |
								(
									(
										{
											newCompositeNode(grammarAccess.getCompositeStateAccess().getInternalInternalTransitionParserRuleCall_9_2_2_0());
										}
										lv_internal_19_0=ruleInternalTransition
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getCompositeStateRule());
											}
											add(
												$current,
												"internal",
												lv_internal_19_0,
												"org.thingml.xtext.ThingML.InternalTransition");
											afterParserOrEnumRuleCall();
										}
									)
								)
								    |
								(
									(
										{
											newCompositeNode(grammarAccess.getCompositeStateAccess().getOutgoingTransitionParserRuleCall_9_2_3_0());
										}
										lv_outgoing_20_0=ruleTransition
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getCompositeStateRule());
											}
											add(
												$current,
												"outgoing",
												lv_outgoing_20_0,
												"org.thingml.xtext.ThingML.Transition");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))+
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9());
					}
				)
			)
					)*
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9());
				}
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getCompositeStateAccess().getRegionRegionParserRuleCall_10_0_0());
					}
					lv_region_21_0=ruleRegion
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCompositeStateRule());
						}
						add(
							$current,
							"region",
							lv_region_21_0,
							"org.thingml.xtext.ThingML.Region");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getCompositeStateAccess().getSessionSessionParserRuleCall_10_1_0());
					}
					lv_session_22_0=ruleSession
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCompositeStateRule());
						}
						add(
							$current,
							"session",
							lv_session_22_0,
							"org.thingml.xtext.ThingML.Session");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_23='}'
		{
			newLeafNode(otherlv_23, grammarAccess.getCompositeStateAccess().getRightCurlyBracketKeyword_11());
		}
	)
;

// Entry rule entryRuleStateMachine
entryRuleStateMachine returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateMachineRule()); }
	iv_ruleStateMachine=ruleStateMachine
	{ $current=$iv_ruleStateMachine.current; }
	EOF;

// Rule StateMachine
ruleStateMachine returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='statechart'
		{
			newLeafNode(otherlv_0, grammarAccess.getStateMachineAccess().getStatechartKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateMachineRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)?
		otherlv_2='init'
		{
			newLeafNode(otherlv_2, grammarAccess.getStateMachineAccess().getInitKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateMachineRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getStateMachineAccess().getInitialStateCrossReference_3_0());
				}
			)
		)
		(
			otherlv_4='keeps'
			{
				newLeafNode(otherlv_4, grammarAccess.getStateMachineAccess().getKeepsKeyword_4_0());
			}
			(
				(
					lv_history_5_0='history'
					{
						newLeafNode(lv_history_5_0, grammarAccess.getStateMachineAccess().getHistoryHistoryKeyword_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStateMachineRule());
						}
						setWithLastConsumed($current, "history", true, "history");
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getStateMachineAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
				}
				lv_annotations_6_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateMachineRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_6_0,
						"org.thingml.xtext.ThingML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_7='{'
		{
			newLeafNode(otherlv_7, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStateMachineAccess().getPropertiesPropertyParserRuleCall_7_0());
				}
				lv_properties_8_0=ruleProperty
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateMachineRule());
					}
					add(
						$current,
						"properties",
						lv_properties_8_0,
						"org.thingml.xtext.ThingML.Property");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getStateMachineAccess().getUnorderedGroup_8());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 0);
					}
								({true}?=>(otherlv_10='on'
								{
									newLeafNode(otherlv_10, grammarAccess.getStateMachineAccess().getOnKeyword_8_0_0());
								}
								otherlv_11='entry'
								{
									newLeafNode(otherlv_11, grammarAccess.getStateMachineAccess().getEntryKeyword_8_0_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getStateMachineAccess().getEntryActionParserRuleCall_8_0_2_0());
										}
										lv_entry_12_0=ruleAction
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getStateMachineRule());
											}
											set(
												$current,
												"entry",
												lv_entry_12_0,
												"org.thingml.xtext.ThingML.Action");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateMachineAccess().getUnorderedGroup_8());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 1);
					}
								({true}?=>(otherlv_13='on'
								{
									newLeafNode(otherlv_13, grammarAccess.getStateMachineAccess().getOnKeyword_8_1_0());
								}
								otherlv_14='exit'
								{
									newLeafNode(otherlv_14, grammarAccess.getStateMachineAccess().getExitKeyword_8_1_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getStateMachineAccess().getExitActionParserRuleCall_8_1_2_0());
										}
										lv_exit_15_0=ruleAction
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getStateMachineRule());
											}
											set(
												$current,
												"exit",
												lv_exit_15_0,
												"org.thingml.xtext.ThingML.Action");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateMachineAccess().getUnorderedGroup_8());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 2);
					}
								({true}?=>((
									(
										{
											newCompositeNode(grammarAccess.getStateMachineAccess().getPropertiesPropertyParserRuleCall_8_2_0_0());
										}
										lv_properties_16_0=ruleProperty
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getStateMachineRule());
											}
											add(
												$current,
												"properties",
												lv_properties_16_0,
												"org.thingml.xtext.ThingML.Property");
											afterParserOrEnumRuleCall();
										}
									)
								)
								    |
								(
									(
										{
											newCompositeNode(grammarAccess.getStateMachineAccess().getSubstateStateParserRuleCall_8_2_1_0());
										}
										lv_substate_17_0=ruleState
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getStateMachineRule());
											}
											add(
												$current,
												"substate",
												lv_substate_17_0,
												"org.thingml.xtext.ThingML.State");
											afterParserOrEnumRuleCall();
										}
									)
								)
								    |
								(
									(
										{
											newCompositeNode(grammarAccess.getStateMachineAccess().getInternalInternalTransitionParserRuleCall_8_2_2_0());
										}
										lv_internal_18_0=ruleInternalTransition
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getStateMachineRule());
											}
											add(
												$current,
												"internal",
												lv_internal_18_0,
												"org.thingml.xtext.ThingML.InternalTransition");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))+
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateMachineAccess().getUnorderedGroup_8());
					}
				)
			)
					)*
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getStateMachineAccess().getUnorderedGroup_8());
				}
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getStateMachineAccess().getRegionRegionParserRuleCall_9_0_0());
					}
					lv_region_19_0=ruleRegion
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStateMachineRule());
						}
						add(
							$current,
							"region",
							lv_region_19_0,
							"org.thingml.xtext.ThingML.Region");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getStateMachineAccess().getSessionSessionParserRuleCall_9_1_0());
					}
					lv_session_20_0=ruleSession
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStateMachineRule());
						}
						add(
							$current,
							"session",
							lv_session_20_0,
							"org.thingml.xtext.ThingML.Session");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_21='}'
		{
			newLeafNode(otherlv_21, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_10());
		}
	)
;

// Entry rule entryRuleSession
entryRuleSession returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSessionRule()); }
	iv_ruleSession=ruleSession
	{ $current=$iv_ruleSession.current; }
	EOF;

// Rule Session
ruleSession returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='session'
		{
			newLeafNode(otherlv_0, grammarAccess.getSessionAccess().getSessionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSessionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSessionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		(
			otherlv_2='<'
			{
				newLeafNode(otherlv_2, grammarAccess.getSessionAccess().getLessThanSignKeyword_2_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getSessionAccess().getMaxInstancesIntegerLiteralParserRuleCall_2_1_0_0());
						}
						lv_maxInstances_3_1=ruleIntegerLiteral
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSessionRule());
							}
							set(
								$current,
								"maxInstances",
								lv_maxInstances_3_1,
								"org.thingml.xtext.ThingML.IntegerLiteral");
							afterParserOrEnumRuleCall();
						}
						    |
						{
							newCompositeNode(grammarAccess.getSessionAccess().getMaxInstancesPropertyReferenceParserRuleCall_2_1_0_1());
						}
						lv_maxInstances_3_2=rulePropertyReference
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSessionRule());
							}
							set(
								$current,
								"maxInstances",
								lv_maxInstances_3_2,
								"org.thingml.xtext.ThingML.PropertyReference");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			otherlv_4='>'
			{
				newLeafNode(otherlv_4, grammarAccess.getSessionAccess().getGreaterThanSignKeyword_2_2());
			}
		)?
		otherlv_5='init'
		{
			newLeafNode(otherlv_5, grammarAccess.getSessionAccess().getInitKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSessionRule());
					}
				}
				otherlv_6=RULE_ID
				{
					newLeafNode(otherlv_6, grammarAccess.getSessionAccess().getInitialStateCrossReference_4_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSessionAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
				}
				lv_annotations_7_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSessionRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_7_0,
						"org.thingml.xtext.ThingML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_8='{'
		{
			newLeafNode(otherlv_8, grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSessionAccess().getSubstateStateParserRuleCall_7_0());
				}
				lv_substate_9_0=ruleState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSessionRule());
					}
					add(
						$current,
						"substate",
						lv_substate_9_0,
						"org.thingml.xtext.ThingML.State");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getSessionAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleRegion
entryRuleRegion returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRegionRule()); }
	iv_ruleRegion=ruleRegion
	{ $current=$iv_ruleRegion.current; }
	EOF;

// Rule Region
ruleRegion returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='region'
		{
			newLeafNode(otherlv_0, grammarAccess.getRegionAccess().getRegionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getRegionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRegionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)?
		otherlv_2='init'
		{
			newLeafNode(otherlv_2, grammarAccess.getRegionAccess().getInitKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRegionRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getRegionAccess().getInitialStateCrossReference_3_0());
				}
			)
		)
		(
			otherlv_4='keeps'
			{
				newLeafNode(otherlv_4, grammarAccess.getRegionAccess().getKeepsKeyword_4_0());
			}
			(
				(
					lv_history_5_0='history'
					{
						newLeafNode(lv_history_5_0, grammarAccess.getRegionAccess().getHistoryHistoryKeyword_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRegionRule());
						}
						setWithLastConsumed($current, "history", true, "history");
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getRegionAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
				}
				lv_annotations_6_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRegionRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_6_0,
						"org.thingml.xtext.ThingML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_7='{'
		{
			newLeafNode(otherlv_7, grammarAccess.getRegionAccess().getLeftCurlyBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRegionAccess().getSubstateStateParserRuleCall_7_0());
				}
				lv_substate_8_0=ruleState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRegionRule());
					}
					add(
						$current,
						"substate",
						lv_substate_8_0,
						"org.thingml.xtext.ThingML.State");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getRegionAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleFinalState
entryRuleFinalState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFinalStateRule()); }
	iv_ruleFinalState=ruleFinalState
	{ $current=$iv_ruleFinalState.current; }
	EOF;

// Rule FinalState
ruleFinalState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='final'
		{
			newLeafNode(otherlv_0, grammarAccess.getFinalStateAccess().getFinalKeyword_0());
		}
		otherlv_1='state'
		{
			newLeafNode(otherlv_1, grammarAccess.getFinalStateAccess().getStateKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getFinalStateAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFinalStateRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFinalStateAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0());
				}
				lv_annotations_3_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFinalStateRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_3_0,
						"org.thingml.xtext.ThingML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getFinalStateAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			otherlv_5='on'
			{
				newLeafNode(otherlv_5, grammarAccess.getFinalStateAccess().getOnKeyword_5_0());
			}
			otherlv_6='entry'
			{
				newLeafNode(otherlv_6, grammarAccess.getFinalStateAccess().getEntryKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFinalStateAccess().getEntryActionParserRuleCall_5_2_0());
					}
					lv_entry_7_0=ruleAction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFinalStateRule());
						}
						set(
							$current,
							"entry",
							lv_entry_7_0,
							"org.thingml.xtext.ThingML.Action");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getFinalStateAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleStateContainer
entryRuleStateContainer returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateContainerRule()); }
	iv_ruleStateContainer=ruleStateContainer
	{ $current=$iv_ruleStateContainer.current; }
	EOF;

// Rule StateContainer
ruleStateContainer returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStateContainerAccess().getCompositeStateParserRuleCall_0());
		}
		this_CompositeState_0=ruleCompositeState
		{
			$current = $this_CompositeState_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStateContainerAccess().getRegionParserRuleCall_1());
		}
		this_Region_1=ruleRegion
		{
			$current = $this_Region_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStateContainerAccess().getSessionParserRuleCall_2());
		}
		this_Session_2=ruleSession
		{
			$current = $this_Session_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			otherlv_3='keeps'
			{
				newLeafNode(otherlv_3, grammarAccess.getStateContainerAccess().getKeepsKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStateContainerRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getStateContainerAccess().getInitialStateCrossReference_3_1_0());
					}
				)
			)
			(
				otherlv_5='keeps'
				{
					newLeafNode(otherlv_5, grammarAccess.getStateContainerAccess().getKeepsKeyword_3_2_0());
				}
				(
					(
						lv_history_6_0='history'
						{
							newLeafNode(lv_history_6_0, grammarAccess.getStateContainerAccess().getHistoryHistoryKeyword_3_2_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getStateContainerRule());
							}
							setWithLastConsumed($current, "history", true, "history");
						}
					)
				)
			)?
			otherlv_7='{'
			{
				newLeafNode(otherlv_7, grammarAccess.getStateContainerAccess().getLeftCurlyBracketKeyword_3_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStateContainerAccess().getSubstateStateParserRuleCall_3_4_0());
					}
					lv_substate_8_0=ruleState
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStateContainerRule());
						}
						add(
							$current,
							"substate",
							lv_substate_8_0,
							"org.thingml.xtext.ThingML.State");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_9='}'
			{
				newLeafNode(otherlv_9, grammarAccess.getStateContainerAccess().getRightCurlyBracketKeyword_3_5());
			}
		)
	)
;

// Entry rule entryRuleDataAnalytics
entryRuleDataAnalytics returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataAnalyticsRule()); }
	iv_ruleDataAnalytics=ruleDataAnalytics
	{ $current=$iv_ruleDataAnalytics.current; }
	EOF;

// Rule DataAnalytics
ruleDataAnalytics returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='data_analytics'
		{
			newLeafNode(otherlv_0, grammarAccess.getDataAnalyticsAccess().getData_analyticsKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDataAnalyticsAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataAnalyticsRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDataAnalyticsAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0());
				}
				lv_annotations_2_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDataAnalyticsRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_2_0,
						"org.thingml.xtext.ThingML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getDataAnalyticsAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='dataset'
			{
				newLeafNode(otherlv_4, grammarAccess.getDataAnalyticsAccess().getDatasetKeyword_4_0());
			}
			(
				(
					lv_dataset_5_0=RULE_STRING
					{
						newLeafNode(lv_dataset_5_0, grammarAccess.getDataAnalyticsAccess().getDatasetSTRINGTerminalRuleCall_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDataAnalyticsRule());
						}
						setWithLastConsumed(
							$current,
							"dataset",
							lv_dataset_5_0,
							"org.thingml.xtext.ThingML.STRING");
					}
				)
			)
		)?
		(
			otherlv_6='automl'
			{
				newLeafNode(otherlv_6, grammarAccess.getDataAnalyticsAccess().getAutomlKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDataAnalyticsAccess().getAutoMLAutoMLEnumRuleCall_5_1_0());
					}
					lv_autoML_7_0=ruleAutoML
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDataAnalyticsRule());
						}
						set(
							$current,
							"autoML",
							lv_autoML_7_0,
							"org.thingml.xtext.ThingML.AutoML");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_8='sequential'
			{
				newLeafNode(otherlv_8, grammarAccess.getDataAnalyticsAccess().getSequentialKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDataAnalyticsAccess().getSequentialSequentialEnumRuleCall_6_1_0());
					}
					lv_sequential_9_0=ruleSequential
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDataAnalyticsRule());
						}
						set(
							$current,
							"sequential",
							lv_sequential_9_0,
							"org.thingml.xtext.ThingML.Sequential");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_10='timestamps'
			{
				newLeafNode(otherlv_10, grammarAccess.getDataAnalyticsAccess().getTimestampsKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDataAnalyticsAccess().getTimestampsTimestampsEnumRuleCall_7_1_0());
					}
					lv_timestamps_11_0=ruleTimestamps
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDataAnalyticsRule());
						}
						set(
							$current,
							"timestamps",
							lv_timestamps_11_0,
							"org.thingml.xtext.ThingML.Timestamps");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_12='labels'
			{
				newLeafNode(otherlv_12, grammarAccess.getDataAnalyticsAccess().getLabelsKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDataAnalyticsAccess().getLabelsLabelsEnumRuleCall_8_1_0());
					}
					lv_labels_13_0=ruleLabels
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDataAnalyticsRule());
						}
						set(
							$current,
							"labels",
							lv_labels_13_0,
							"org.thingml.xtext.ThingML.Labels");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			otherlv_14='features'
			{
				newLeafNode(otherlv_14, grammarAccess.getDataAnalyticsAccess().getFeaturesKeyword_9_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDataAnalyticsRule());
						}
					}
					otherlv_15=RULE_ID
					{
						newLeafNode(otherlv_15, grammarAccess.getDataAnalyticsAccess().getFeaturesPropertyCrossReference_9_1_0());
					}
				)
			)
			(
				otherlv_16=','
				{
					newLeafNode(otherlv_16, grammarAccess.getDataAnalyticsAccess().getCommaKeyword_9_2_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getDataAnalyticsRule());
							}
						}
						otherlv_17=RULE_ID
						{
							newLeafNode(otherlv_17, grammarAccess.getDataAnalyticsAccess().getFeaturesPropertyCrossReference_9_2_1_0());
						}
					)
				)
			)*
		)
		(
			otherlv_18='preprocess_feature_scaling'
			{
				newLeafNode(otherlv_18, grammarAccess.getDataAnalyticsAccess().getPreprocess_feature_scalingKeyword_10_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDataAnalyticsAccess().getPreprocess_feature_scalingPreprocess_feature_scalingEnumRuleCall_10_1_0());
					}
					lv_preprocess_feature_scaling_19_0=rulePreprocess_feature_scaling
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDataAnalyticsRule());
						}
						set(
							$current,
							"preprocess_feature_scaling",
							lv_preprocess_feature_scaling_19_0,
							"org.thingml.xtext.ThingML.Preprocess_feature_scaling");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_20='model_algorithm'
			{
				newLeafNode(otherlv_20, grammarAccess.getDataAnalyticsAccess().getModel_algorithmKeyword_11_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDataAnalyticsAccess().getModelAlgorithmDataAnalyticsModelAlgorithmParserRuleCall_11_1_0());
					}
					lv_modelAlgorithm_21_0=ruleDataAnalyticsModelAlgorithm
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDataAnalyticsRule());
						}
						set(
							$current,
							"modelAlgorithm",
							lv_modelAlgorithm_21_0,
							"org.thingml.xtext.ThingML.DataAnalyticsModelAlgorithm");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_22='training_results'
			{
				newLeafNode(otherlv_22, grammarAccess.getDataAnalyticsAccess().getTraining_resultsKeyword_12_0());
			}
			(
				(
					lv_trainingResults_23_0=RULE_STRING
					{
						newLeafNode(lv_trainingResults_23_0, grammarAccess.getDataAnalyticsAccess().getTrainingResultsSTRINGTerminalRuleCall_12_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDataAnalyticsRule());
						}
						setWithLastConsumed(
							$current,
							"trainingResults",
							lv_trainingResults_23_0,
							"org.thingml.xtext.ThingML.STRING");
					}
				)
			)
		)?
		(
			otherlv_24='prediction_results'
			{
				newLeafNode(otherlv_24, grammarAccess.getDataAnalyticsAccess().getPrediction_resultsKeyword_13_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDataAnalyticsRule());
						}
					}
					otherlv_25=RULE_ID
					{
						newLeafNode(otherlv_25, grammarAccess.getDataAnalyticsAccess().getPredictionResultsPropertyCrossReference_13_1_0());
					}
				)
			)
			(
				otherlv_26=','
				{
					newLeafNode(otherlv_26, grammarAccess.getDataAnalyticsAccess().getCommaKeyword_13_2_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getDataAnalyticsRule());
							}
						}
						otherlv_27=RULE_ID
						{
							newLeafNode(otherlv_27, grammarAccess.getDataAnalyticsAccess().getPredictionResultsPropertyCrossReference_13_2_1_0());
						}
					)
				)
			)*
		)?
		otherlv_28='}'
		{
			newLeafNode(otherlv_28, grammarAccess.getDataAnalyticsAccess().getRightCurlyBracketKeyword_14());
		}
	)
;

// Entry rule entryRuleDataAnalyticsModelAlgorithm
entryRuleDataAnalyticsModelAlgorithm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataAnalyticsModelAlgorithmRule()); }
	iv_ruleDataAnalyticsModelAlgorithm=ruleDataAnalyticsModelAlgorithm
	{ $current=$iv_ruleDataAnalyticsModelAlgorithm.current; }
	EOF;

// Rule DataAnalyticsModelAlgorithm
ruleDataAnalyticsModelAlgorithm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDataAnalyticsModelAlgorithmAccess().getML2_ModelAlgorithmParserRuleCall_0());
		}
		this_ML2_ModelAlgorithm_0=ruleML2_ModelAlgorithm
		{
			$current = $this_ML2_ModelAlgorithm_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDataAnalyticsModelAlgorithmAccess().getPretrained_ML_ModelParserRuleCall_1());
		}
		this_Pretrained_ML_Model_1=rulePretrained_ML_Model
		{
			$current = $this_Pretrained_ML_Model_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDataAnalyticsModelAlgorithmAccess().getPMML_ModelAlgorithmParserRuleCall_2());
		}
		this_PMML_ModelAlgorithm_2=rulePMML_ModelAlgorithm
		{
			$current = $this_PMML_ModelAlgorithm_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDataAnalyticsModelAlgorithmAccess().getPFA_ModelAlgorithmParserRuleCall_3());
		}
		this_PFA_ModelAlgorithm_3=rulePFA_ModelAlgorithm
		{
			$current = $this_PFA_ModelAlgorithm_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleML2_ModelAlgorithm
entryRuleML2_ModelAlgorithm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getML2_ModelAlgorithmRule()); }
	iv_ruleML2_ModelAlgorithm=ruleML2_ModelAlgorithm
	{ $current=$iv_ruleML2_ModelAlgorithm.current; }
	EOF;

// Rule ML2_ModelAlgorithm
ruleML2_ModelAlgorithm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getML2_ModelAlgorithmAccess().getLinearClassifierLogisticRegressionParserRuleCall_0());
		}
		this_LinearClassifierLogisticRegression_0=ruleLinearClassifierLogisticRegression
		{
			$current = $this_LinearClassifierLogisticRegression_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getML2_ModelAlgorithmAccess().getLinearRegressionParserRuleCall_1());
		}
		this_LinearRegression_1=ruleLinearRegression
		{
			$current = $this_LinearRegression_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getML2_ModelAlgorithmAccess().getNaiveBayesGaussianParserRuleCall_2());
		}
		this_NaiveBayesGaussian_2=ruleNaiveBayesGaussian
		{
			$current = $this_NaiveBayesGaussian_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getML2_ModelAlgorithmAccess().getNaiveBayesMultinomialParserRuleCall_3());
		}
		this_NaiveBayesMultinomial_3=ruleNaiveBayesMultinomial
		{
			$current = $this_NaiveBayesMultinomial_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getML2_ModelAlgorithmAccess().getNaiveBayesComplementParserRuleCall_4());
		}
		this_NaiveBayesComplement_4=ruleNaiveBayesComplement
		{
			$current = $this_NaiveBayesComplement_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getML2_ModelAlgorithmAccess().getNaiveBayesBernoulliParserRuleCall_5());
		}
		this_NaiveBayesBernoulli_5=ruleNaiveBayesBernoulli
		{
			$current = $this_NaiveBayesBernoulli_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getML2_ModelAlgorithmAccess().getNaiveBayesCategoricalParserRuleCall_6());
		}
		this_NaiveBayesCategorical_6=ruleNaiveBayesCategorical
		{
			$current = $this_NaiveBayesCategorical_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getML2_ModelAlgorithmAccess().getDecisionTreeRegressorParserRuleCall_7());
		}
		this_DecisionTreeRegressor_7=ruleDecisionTreeRegressor
		{
			$current = $this_DecisionTreeRegressor_7.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getML2_ModelAlgorithmAccess().getDecisionTreeClassifierParserRuleCall_8());
		}
		this_DecisionTreeClassifier_8=ruleDecisionTreeClassifier
		{
			$current = $this_DecisionTreeClassifier_8.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getML2_ModelAlgorithmAccess().getRandomForestRegressorParserRuleCall_9());
		}
		this_RandomForestRegressor_9=ruleRandomForestRegressor
		{
			$current = $this_RandomForestRegressor_9.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getML2_ModelAlgorithmAccess().getRandomForestClassifierParserRuleCall_10());
		}
		this_RandomForestClassifier_10=ruleRandomForestClassifier
		{
			$current = $this_RandomForestClassifier_10.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getML2_ModelAlgorithmAccess().getNN_MultilayerPerceptronParserRuleCall_11());
		}
		this_NN_MultilayerPerceptron_11=ruleNN_MultilayerPerceptron
		{
			$current = $this_NN_MultilayerPerceptron_11.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePretrained_ML_Model
entryRulePretrained_ML_Model returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPretrained_ML_ModelRule()); }
	iv_rulePretrained_ML_Model=rulePretrained_ML_Model
	{ $current=$iv_rulePretrained_ML_Model.current; }
	EOF;

// Rule Pretrained_ML_Model
rulePretrained_ML_Model returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='pretrained'
		{
			newLeafNode(otherlv_0, grammarAccess.getPretrained_ML_ModelAccess().getPretrainedKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPretrained_ML_ModelAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPretrained_ML_ModelRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getPretrained_ML_ModelAccess().getLeftParenthesisKeyword_2());
		}
		(
			otherlv_3='path'
			{
				newLeafNode(otherlv_3, grammarAccess.getPretrained_ML_ModelAccess().getPathKeyword_3_0());
			}
			(
				(
					lv_pretrained_path_4_0=RULE_STRING
					{
						newLeafNode(lv_pretrained_path_4_0, grammarAccess.getPretrained_ML_ModelAccess().getPretrained_pathSTRINGTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPretrained_ML_ModelRule());
						}
						setWithLastConsumed(
							$current,
							"pretrained_path",
							lv_pretrained_path_4_0,
							"org.thingml.xtext.ThingML.STRING");
					}
				)
			)
		)
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getPretrained_ML_ModelAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRulePMML_ModelAlgorithm
entryRulePMML_ModelAlgorithm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPMML_ModelAlgorithmRule()); }
	iv_rulePMML_ModelAlgorithm=rulePMML_ModelAlgorithm
	{ $current=$iv_rulePMML_ModelAlgorithm.current; }
	EOF;

// Rule PMML_ModelAlgorithm
rulePMML_ModelAlgorithm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='pmml'
		{
			newLeafNode(otherlv_0, grammarAccess.getPMML_ModelAlgorithmAccess().getPmmlKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPMML_ModelAlgorithmAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPMML_ModelAlgorithmRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getPMML_ModelAlgorithmAccess().getLeftParenthesisKeyword_2());
		}
		(
			otherlv_3='path'
			{
				newLeafNode(otherlv_3, grammarAccess.getPMML_ModelAlgorithmAccess().getPathKeyword_3_0());
			}
			(
				(
					lv_pmml_path_4_0=RULE_STRING
					{
						newLeafNode(lv_pmml_path_4_0, grammarAccess.getPMML_ModelAlgorithmAccess().getPmml_pathSTRINGTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPMML_ModelAlgorithmRule());
						}
						setWithLastConsumed(
							$current,
							"pmml_path",
							lv_pmml_path_4_0,
							"org.thingml.xtext.ThingML.STRING");
					}
				)
			)
		)
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getPMML_ModelAlgorithmAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRulePFA_ModelAlgorithm
entryRulePFA_ModelAlgorithm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPFA_ModelAlgorithmRule()); }
	iv_rulePFA_ModelAlgorithm=rulePFA_ModelAlgorithm
	{ $current=$iv_rulePFA_ModelAlgorithm.current; }
	EOF;

// Rule PFA_ModelAlgorithm
rulePFA_ModelAlgorithm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='pfa'
		{
			newLeafNode(otherlv_0, grammarAccess.getPFA_ModelAlgorithmAccess().getPfaKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPFA_ModelAlgorithmAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPFA_ModelAlgorithmRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getPFA_ModelAlgorithmAccess().getLeftParenthesisKeyword_2());
		}
		(
			otherlv_3='path'
			{
				newLeafNode(otherlv_3, grammarAccess.getPFA_ModelAlgorithmAccess().getPathKeyword_3_0());
			}
			(
				(
					lv_pfa_path_4_0=RULE_STRING
					{
						newLeafNode(lv_pfa_path_4_0, grammarAccess.getPFA_ModelAlgorithmAccess().getPfa_pathSTRINGTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPFA_ModelAlgorithmRule());
						}
						setWithLastConsumed(
							$current,
							"pfa_path",
							lv_pfa_path_4_0,
							"org.thingml.xtext.ThingML.STRING");
					}
				)
			)
		)
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getPFA_ModelAlgorithmAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleLinearRegression
entryRuleLinearRegression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLinearRegressionRule()); }
	iv_ruleLinearRegression=ruleLinearRegression
	{ $current=$iv_ruleLinearRegression.current; }
	EOF;

// Rule LinearRegression
ruleLinearRegression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='linear_regression'
		{
			newLeafNode(otherlv_0, grammarAccess.getLinearRegressionAccess().getLinear_regressionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getLinearRegressionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLinearRegressionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getLinearRegressionAccess().getLeftParenthesisKeyword_2());
		}
		(
			otherlv_3='fit_intercept'
			{
				newLeafNode(otherlv_3, grammarAccess.getLinearRegressionAccess().getFit_interceptKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLinearRegressionAccess().getFit_interceptBooleanLiteralParserRuleCall_3_1_0());
					}
					lv_fit_intercept_4_0=ruleBooleanLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLinearRegressionRule());
						}
						set(
							$current,
							"fit_intercept",
							lv_fit_intercept_4_0,
							"org.thingml.xtext.ThingML.BooleanLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getLinearRegressionAccess().getCommaKeyword_3_2());
				}
			)?
		)?
		(
			otherlv_6='normalize'
			{
				newLeafNode(otherlv_6, grammarAccess.getLinearRegressionAccess().getNormalizeKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLinearRegressionAccess().getNormalizeBooleanLiteralParserRuleCall_4_1_0());
					}
					lv_normalize_7_0=ruleBooleanLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLinearRegressionRule());
						}
						set(
							$current,
							"normalize",
							lv_normalize_7_0,
							"org.thingml.xtext.ThingML.BooleanLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getLinearRegressionAccess().getCommaKeyword_4_2());
				}
			)?
		)?
		(
			otherlv_9='copy_X'
			{
				newLeafNode(otherlv_9, grammarAccess.getLinearRegressionAccess().getCopy_XKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLinearRegressionAccess().getCopy_XBooleanLiteralParserRuleCall_5_1_0());
					}
					lv_copy_X_10_0=ruleBooleanLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLinearRegressionRule());
						}
						set(
							$current,
							"copy_X",
							lv_copy_X_10_0,
							"org.thingml.xtext.ThingML.BooleanLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_11=','
				{
					newLeafNode(otherlv_11, grammarAccess.getLinearRegressionAccess().getCommaKeyword_5_2());
				}
			)?
		)?
		(
			otherlv_12='n_jobs'
			{
				newLeafNode(otherlv_12, grammarAccess.getLinearRegressionAccess().getN_jobsKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLinearRegressionAccess().getN_jobsIntegerLiteralParserRuleCall_6_1_0());
					}
					lv_n_jobs_13_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLinearRegressionRule());
						}
						set(
							$current,
							"n_jobs",
							lv_n_jobs_13_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_14=','
				{
					newLeafNode(otherlv_14, grammarAccess.getLinearRegressionAccess().getCommaKeyword_6_2());
				}
			)?
		)?
		(
			otherlv_15='positive'
			{
				newLeafNode(otherlv_15, grammarAccess.getLinearRegressionAccess().getPositiveKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLinearRegressionAccess().getPositiveBooleanLiteralParserRuleCall_7_1_0());
					}
					lv_positive_16_0=ruleBooleanLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLinearRegressionRule());
						}
						set(
							$current,
							"positive",
							lv_positive_16_0,
							"org.thingml.xtext.ThingML.BooleanLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_17=','
				{
					newLeafNode(otherlv_17, grammarAccess.getLinearRegressionAccess().getCommaKeyword_7_2());
				}
			)?
		)?
		otherlv_18=')'
		{
			newLeafNode(otherlv_18, grammarAccess.getLinearRegressionAccess().getRightParenthesisKeyword_8());
		}
	)
;

// Entry rule entryRuleLinearClassifierLogisticRegression
entryRuleLinearClassifierLogisticRegression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLinearClassifierLogisticRegressionRule()); }
	iv_ruleLinearClassifierLogisticRegression=ruleLinearClassifierLogisticRegression
	{ $current=$iv_ruleLinearClassifierLogisticRegression.current; }
	EOF;

// Rule LinearClassifierLogisticRegression
ruleLinearClassifierLogisticRegression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='linear_classifier_logistic_regression'
		{
			newLeafNode(otherlv_0, grammarAccess.getLinearClassifierLogisticRegressionAccess().getLinear_classifier_logistic_regressionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getLinearClassifierLogisticRegressionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLinearClassifierLogisticRegressionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getLinearClassifierLogisticRegressionAccess().getLeftParenthesisKeyword_2());
		}
		(
			otherlv_3='penalty'
			{
				newLeafNode(otherlv_3, grammarAccess.getLinearClassifierLogisticRegressionAccess().getPenaltyKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLinearClassifierLogisticRegressionAccess().getPenaltyPenaltyEnumRuleCall_3_1_0());
					}
					lv_penalty_4_0=rulePenalty
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLinearClassifierLogisticRegressionRule());
						}
						set(
							$current,
							"penalty",
							lv_penalty_4_0,
							"org.thingml.xtext.ThingML.Penalty");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_3_2());
				}
			)?
		)?
		(
			otherlv_6='dual'
			{
				newLeafNode(otherlv_6, grammarAccess.getLinearClassifierLogisticRegressionAccess().getDualKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLinearClassifierLogisticRegressionAccess().getDualBooleanLiteralParserRuleCall_4_1_0());
					}
					lv_dual_7_0=ruleBooleanLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLinearClassifierLogisticRegressionRule());
						}
						set(
							$current,
							"dual",
							lv_dual_7_0,
							"org.thingml.xtext.ThingML.BooleanLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_4_2());
				}
			)?
		)?
		(
			otherlv_9='tol'
			{
				newLeafNode(otherlv_9, grammarAccess.getLinearClassifierLogisticRegressionAccess().getTolKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLinearClassifierLogisticRegressionAccess().getTolDoubleLiteralParserRuleCall_5_1_0());
					}
					lv_tol_10_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLinearClassifierLogisticRegressionRule());
						}
						set(
							$current,
							"tol",
							lv_tol_10_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_11=','
				{
					newLeafNode(otherlv_11, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_5_2());
				}
			)?
		)?
		(
			otherlv_12='C'
			{
				newLeafNode(otherlv_12, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLinearClassifierLogisticRegressionAccess().getCDoubleLiteralParserRuleCall_6_1_0());
					}
					lv_c_13_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLinearClassifierLogisticRegressionRule());
						}
						set(
							$current,
							"c",
							lv_c_13_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_14=','
				{
					newLeafNode(otherlv_14, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_6_2());
				}
			)?
		)?
		(
			otherlv_15='fit_intercept'
			{
				newLeafNode(otherlv_15, grammarAccess.getLinearClassifierLogisticRegressionAccess().getFit_interceptKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLinearClassifierLogisticRegressionAccess().getFit_interceptBooleanLiteralParserRuleCall_7_1_0());
					}
					lv_fit_intercept_16_0=ruleBooleanLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLinearClassifierLogisticRegressionRule());
						}
						set(
							$current,
							"fit_intercept",
							lv_fit_intercept_16_0,
							"org.thingml.xtext.ThingML.BooleanLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_17=','
				{
					newLeafNode(otherlv_17, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_7_2());
				}
			)?
		)?
		(
			otherlv_18='intercept_scaling'
			{
				newLeafNode(otherlv_18, grammarAccess.getLinearClassifierLogisticRegressionAccess().getIntercept_scalingKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLinearClassifierLogisticRegressionAccess().getIntercept_scalingDoubleLiteralParserRuleCall_8_1_0());
					}
					lv_intercept_scaling_19_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLinearClassifierLogisticRegressionRule());
						}
						set(
							$current,
							"intercept_scaling",
							lv_intercept_scaling_19_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_20=','
				{
					newLeafNode(otherlv_20, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_8_2());
				}
			)?
		)?
		(
			otherlv_21='class_weight'
			{
				newLeafNode(otherlv_21, grammarAccess.getLinearClassifierLogisticRegressionAccess().getClass_weightKeyword_9_0());
			}
			(
				(
					lv_class_weight_22_0=RULE_STRING
					{
						newLeafNode(lv_class_weight_22_0, grammarAccess.getLinearClassifierLogisticRegressionAccess().getClass_weightSTRINGTerminalRuleCall_9_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getLinearClassifierLogisticRegressionRule());
						}
						setWithLastConsumed(
							$current,
							"class_weight",
							lv_class_weight_22_0,
							"org.thingml.xtext.ThingML.STRING");
					}
				)
			)
			(
				otherlv_23=','
				{
					newLeafNode(otherlv_23, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_9_2());
				}
			)?
		)?
		(
			otherlv_24='random_state'
			{
				newLeafNode(otherlv_24, grammarAccess.getLinearClassifierLogisticRegressionAccess().getRandom_stateKeyword_10_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLinearClassifierLogisticRegressionAccess().getRandom_stateIntegerLiteralParserRuleCall_10_1_0());
					}
					lv_random_state_25_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLinearClassifierLogisticRegressionRule());
						}
						set(
							$current,
							"random_state",
							lv_random_state_25_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_26=','
				{
					newLeafNode(otherlv_26, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_10_2());
				}
			)?
		)?
		(
			otherlv_27='solver'
			{
				newLeafNode(otherlv_27, grammarAccess.getLinearClassifierLogisticRegressionAccess().getSolverKeyword_11_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLinearClassifierLogisticRegressionAccess().getOptimizerOptimizerEnumRuleCall_11_1_0());
					}
					lv_optimizer_28_0=ruleOptimizer
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLinearClassifierLogisticRegressionRule());
						}
						set(
							$current,
							"optimizer",
							lv_optimizer_28_0,
							"org.thingml.xtext.ThingML.Optimizer");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_29=','
				{
					newLeafNode(otherlv_29, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_11_2());
				}
			)?
		)?
		(
			otherlv_30='max_iter'
			{
				newLeafNode(otherlv_30, grammarAccess.getLinearClassifierLogisticRegressionAccess().getMax_iterKeyword_12_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLinearClassifierLogisticRegressionAccess().getMax_iterIntegerLiteralParserRuleCall_12_1_0());
					}
					lv_max_iter_31_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLinearClassifierLogisticRegressionRule());
						}
						set(
							$current,
							"max_iter",
							lv_max_iter_31_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_32=','
				{
					newLeafNode(otherlv_32, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_12_2());
				}
			)?
		)?
		(
			otherlv_33='multi_class'
			{
				newLeafNode(otherlv_33, grammarAccess.getLinearClassifierLogisticRegressionAccess().getMulti_classKeyword_13_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLinearClassifierLogisticRegressionAccess().getMulti_classMulti_classEnumRuleCall_13_1_0());
					}
					lv_multi_class_34_0=ruleMulti_class
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLinearClassifierLogisticRegressionRule());
						}
						set(
							$current,
							"multi_class",
							lv_multi_class_34_0,
							"org.thingml.xtext.ThingML.Multi_class");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_35=','
				{
					newLeafNode(otherlv_35, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_13_2());
				}
			)?
		)?
		(
			otherlv_36='verbose'
			{
				newLeafNode(otherlv_36, grammarAccess.getLinearClassifierLogisticRegressionAccess().getVerboseKeyword_14_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLinearClassifierLogisticRegressionAccess().getVerboseIntegerLiteralParserRuleCall_14_1_0());
					}
					lv_verbose_37_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLinearClassifierLogisticRegressionRule());
						}
						set(
							$current,
							"verbose",
							lv_verbose_37_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_38=','
				{
					newLeafNode(otherlv_38, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_14_2());
				}
			)?
		)?
		(
			otherlv_39='warm_start'
			{
				newLeafNode(otherlv_39, grammarAccess.getLinearClassifierLogisticRegressionAccess().getWarm_startKeyword_15_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLinearClassifierLogisticRegressionAccess().getWarm_startBooleanLiteralParserRuleCall_15_1_0());
					}
					lv_warm_start_40_0=ruleBooleanLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLinearClassifierLogisticRegressionRule());
						}
						set(
							$current,
							"warm_start",
							lv_warm_start_40_0,
							"org.thingml.xtext.ThingML.BooleanLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_41=','
				{
					newLeafNode(otherlv_41, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_15_2());
				}
			)?
		)?
		(
			otherlv_42='n_jobs'
			{
				newLeafNode(otherlv_42, grammarAccess.getLinearClassifierLogisticRegressionAccess().getN_jobsKeyword_16_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLinearClassifierLogisticRegressionAccess().getN_jobsIntegerLiteralParserRuleCall_16_1_0());
					}
					lv_n_jobs_43_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLinearClassifierLogisticRegressionRule());
						}
						set(
							$current,
							"n_jobs",
							lv_n_jobs_43_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_44=','
				{
					newLeafNode(otherlv_44, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_16_2());
				}
			)?
		)?
		(
			otherlv_45='l1_ratio'
			{
				newLeafNode(otherlv_45, grammarAccess.getLinearClassifierLogisticRegressionAccess().getL1_ratioKeyword_17_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLinearClassifierLogisticRegressionAccess().getL1_ratioDoubleLiteralParserRuleCall_17_1_0());
					}
					lv_l1_ratio_46_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLinearClassifierLogisticRegressionRule());
						}
						set(
							$current,
							"l1_ratio",
							lv_l1_ratio_46_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_47=','
				{
					newLeafNode(otherlv_47, grammarAccess.getLinearClassifierLogisticRegressionAccess().getCommaKeyword_17_2());
				}
			)?
		)?
		otherlv_48=')'
		{
			newLeafNode(otherlv_48, grammarAccess.getLinearClassifierLogisticRegressionAccess().getRightParenthesisKeyword_18());
		}
	)
;

// Entry rule entryRuleNaiveBayesGaussian
entryRuleNaiveBayesGaussian returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNaiveBayesGaussianRule()); }
	iv_ruleNaiveBayesGaussian=ruleNaiveBayesGaussian
	{ $current=$iv_ruleNaiveBayesGaussian.current; }
	EOF;

// Rule NaiveBayesGaussian
ruleNaiveBayesGaussian returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='naive_bayes_gaussian'
		{
			newLeafNode(otherlv_0, grammarAccess.getNaiveBayesGaussianAccess().getNaive_bayes_gaussianKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getNaiveBayesGaussianAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNaiveBayesGaussianRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getNaiveBayesGaussianAccess().getLeftParenthesisKeyword_2());
		}
		(
			otherlv_3='priors'
			{
				newLeafNode(otherlv_3, grammarAccess.getNaiveBayesGaussianAccess().getPriorsKeyword_3_0());
			}
			(
				(
					lv_priors_4_0=RULE_STRING
					{
						newLeafNode(lv_priors_4_0, grammarAccess.getNaiveBayesGaussianAccess().getPriorsSTRINGTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNaiveBayesGaussianRule());
						}
						setWithLastConsumed(
							$current,
							"priors",
							lv_priors_4_0,
							"org.thingml.xtext.ThingML.STRING");
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getNaiveBayesGaussianAccess().getCommaKeyword_3_2());
				}
			)?
		)?
		(
			otherlv_6='var_smoothing'
			{
				newLeafNode(otherlv_6, grammarAccess.getNaiveBayesGaussianAccess().getVar_smoothingKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNaiveBayesGaussianAccess().getVar_smoothingDoubleLiteralParserRuleCall_4_1_0());
					}
					lv_var_smoothing_7_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNaiveBayesGaussianRule());
						}
						set(
							$current,
							"var_smoothing",
							lv_var_smoothing_7_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getNaiveBayesGaussianAccess().getCommaKeyword_4_2());
				}
			)?
		)?
		otherlv_9=')'
		{
			newLeafNode(otherlv_9, grammarAccess.getNaiveBayesGaussianAccess().getRightParenthesisKeyword_5());
		}
	)
;

// Entry rule entryRuleNaiveBayesMultinomial
entryRuleNaiveBayesMultinomial returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNaiveBayesMultinomialRule()); }
	iv_ruleNaiveBayesMultinomial=ruleNaiveBayesMultinomial
	{ $current=$iv_ruleNaiveBayesMultinomial.current; }
	EOF;

// Rule NaiveBayesMultinomial
ruleNaiveBayesMultinomial returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='naive_bayes_multinomial'
		{
			newLeafNode(otherlv_0, grammarAccess.getNaiveBayesMultinomialAccess().getNaive_bayes_multinomialKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getNaiveBayesMultinomialAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNaiveBayesMultinomialRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getNaiveBayesMultinomialAccess().getLeftParenthesisKeyword_2());
		}
		(
			otherlv_3='alpha'
			{
				newLeafNode(otherlv_3, grammarAccess.getNaiveBayesMultinomialAccess().getAlphaKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNaiveBayesMultinomialAccess().getAlphaDoubleLiteralParserRuleCall_3_1_0());
					}
					lv_alpha_4_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNaiveBayesMultinomialRule());
						}
						set(
							$current,
							"alpha",
							lv_alpha_4_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getNaiveBayesMultinomialAccess().getCommaKeyword_3_2());
				}
			)?
		)?
		(
			otherlv_6='fit_prior'
			{
				newLeafNode(otherlv_6, grammarAccess.getNaiveBayesMultinomialAccess().getFit_priorKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNaiveBayesMultinomialAccess().getFit_priorBooleanLiteralParserRuleCall_4_1_0());
					}
					lv_fit_prior_7_0=ruleBooleanLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNaiveBayesMultinomialRule());
						}
						set(
							$current,
							"fit_prior",
							lv_fit_prior_7_0,
							"org.thingml.xtext.ThingML.BooleanLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getNaiveBayesMultinomialAccess().getCommaKeyword_4_2());
				}
			)?
		)?
		(
			otherlv_9='class_prior'
			{
				newLeafNode(otherlv_9, grammarAccess.getNaiveBayesMultinomialAccess().getClass_priorKeyword_5_0());
			}
			(
				(
					lv_class_prior_10_0=RULE_STRING
					{
						newLeafNode(lv_class_prior_10_0, grammarAccess.getNaiveBayesMultinomialAccess().getClass_priorSTRINGTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNaiveBayesMultinomialRule());
						}
						setWithLastConsumed(
							$current,
							"class_prior",
							lv_class_prior_10_0,
							"org.thingml.xtext.ThingML.STRING");
					}
				)
			)
			(
				otherlv_11=','
				{
					newLeafNode(otherlv_11, grammarAccess.getNaiveBayesMultinomialAccess().getCommaKeyword_5_2());
				}
			)?
		)?
		otherlv_12=')'
		{
			newLeafNode(otherlv_12, grammarAccess.getNaiveBayesMultinomialAccess().getRightParenthesisKeyword_6());
		}
	)
;

// Entry rule entryRuleNaiveBayesComplement
entryRuleNaiveBayesComplement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNaiveBayesComplementRule()); }
	iv_ruleNaiveBayesComplement=ruleNaiveBayesComplement
	{ $current=$iv_ruleNaiveBayesComplement.current; }
	EOF;

// Rule NaiveBayesComplement
ruleNaiveBayesComplement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='naive_bayes_complement'
		{
			newLeafNode(otherlv_0, grammarAccess.getNaiveBayesComplementAccess().getNaive_bayes_complementKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getNaiveBayesComplementAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNaiveBayesComplementRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getNaiveBayesComplementAccess().getLeftParenthesisKeyword_2());
		}
		(
			otherlv_3='alpha'
			{
				newLeafNode(otherlv_3, grammarAccess.getNaiveBayesComplementAccess().getAlphaKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNaiveBayesComplementAccess().getAlphaDoubleLiteralParserRuleCall_3_1_0());
					}
					lv_alpha_4_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNaiveBayesComplementRule());
						}
						set(
							$current,
							"alpha",
							lv_alpha_4_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getNaiveBayesComplementAccess().getCommaKeyword_3_2());
				}
			)?
		)?
		(
			otherlv_6='fit_prior'
			{
				newLeafNode(otherlv_6, grammarAccess.getNaiveBayesComplementAccess().getFit_priorKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNaiveBayesComplementAccess().getFit_priorBooleanLiteralParserRuleCall_4_1_0());
					}
					lv_fit_prior_7_0=ruleBooleanLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNaiveBayesComplementRule());
						}
						set(
							$current,
							"fit_prior",
							lv_fit_prior_7_0,
							"org.thingml.xtext.ThingML.BooleanLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getNaiveBayesComplementAccess().getCommaKeyword_4_2());
				}
			)?
		)?
		(
			otherlv_9='class_prior'
			{
				newLeafNode(otherlv_9, grammarAccess.getNaiveBayesComplementAccess().getClass_priorKeyword_5_0());
			}
			(
				(
					lv_class_prior_10_0=RULE_STRING
					{
						newLeafNode(lv_class_prior_10_0, grammarAccess.getNaiveBayesComplementAccess().getClass_priorSTRINGTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNaiveBayesComplementRule());
						}
						setWithLastConsumed(
							$current,
							"class_prior",
							lv_class_prior_10_0,
							"org.thingml.xtext.ThingML.STRING");
					}
				)
			)
			(
				otherlv_11=','
				{
					newLeafNode(otherlv_11, grammarAccess.getNaiveBayesComplementAccess().getCommaKeyword_5_2());
				}
			)?
		)?
		(
			otherlv_12='norm'
			{
				newLeafNode(otherlv_12, grammarAccess.getNaiveBayesComplementAccess().getNormKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNaiveBayesComplementAccess().getNormBooleanLiteralParserRuleCall_6_1_0());
					}
					lv_norm_13_0=ruleBooleanLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNaiveBayesComplementRule());
						}
						set(
							$current,
							"norm",
							lv_norm_13_0,
							"org.thingml.xtext.ThingML.BooleanLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_14=','
				{
					newLeafNode(otherlv_14, grammarAccess.getNaiveBayesComplementAccess().getCommaKeyword_6_2());
				}
			)?
		)?
		otherlv_15=')'
		{
			newLeafNode(otherlv_15, grammarAccess.getNaiveBayesComplementAccess().getRightParenthesisKeyword_7());
		}
	)
;

// Entry rule entryRuleNaiveBayesBernoulli
entryRuleNaiveBayesBernoulli returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNaiveBayesBernoulliRule()); }
	iv_ruleNaiveBayesBernoulli=ruleNaiveBayesBernoulli
	{ $current=$iv_ruleNaiveBayesBernoulli.current; }
	EOF;

// Rule NaiveBayesBernoulli
ruleNaiveBayesBernoulli returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='naive_bayes_bernoulli'
		{
			newLeafNode(otherlv_0, grammarAccess.getNaiveBayesBernoulliAccess().getNaive_bayes_bernoulliKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getNaiveBayesBernoulliAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNaiveBayesBernoulliRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getNaiveBayesBernoulliAccess().getLeftParenthesisKeyword_2());
		}
		(
			otherlv_3='alpha'
			{
				newLeafNode(otherlv_3, grammarAccess.getNaiveBayesBernoulliAccess().getAlphaKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNaiveBayesBernoulliAccess().getAlphaDoubleLiteralParserRuleCall_3_1_0());
					}
					lv_alpha_4_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNaiveBayesBernoulliRule());
						}
						set(
							$current,
							"alpha",
							lv_alpha_4_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getNaiveBayesBernoulliAccess().getCommaKeyword_3_2());
				}
			)?
		)?
		(
			otherlv_6='binarize'
			{
				newLeafNode(otherlv_6, grammarAccess.getNaiveBayesBernoulliAccess().getBinarizeKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNaiveBayesBernoulliAccess().getBinarizeDoubleLiteralParserRuleCall_4_1_0());
					}
					lv_binarize_7_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNaiveBayesBernoulliRule());
						}
						set(
							$current,
							"binarize",
							lv_binarize_7_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getNaiveBayesBernoulliAccess().getCommaKeyword_4_2());
				}
			)?
		)?
		(
			otherlv_9='fit_prior'
			{
				newLeafNode(otherlv_9, grammarAccess.getNaiveBayesBernoulliAccess().getFit_priorKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNaiveBayesBernoulliAccess().getFit_priorBooleanLiteralParserRuleCall_5_1_0());
					}
					lv_fit_prior_10_0=ruleBooleanLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNaiveBayesBernoulliRule());
						}
						set(
							$current,
							"fit_prior",
							lv_fit_prior_10_0,
							"org.thingml.xtext.ThingML.BooleanLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_11=','
				{
					newLeafNode(otherlv_11, grammarAccess.getNaiveBayesBernoulliAccess().getCommaKeyword_5_2());
				}
			)?
		)?
		(
			otherlv_12='class_prior'
			{
				newLeafNode(otherlv_12, grammarAccess.getNaiveBayesBernoulliAccess().getClass_priorKeyword_6_0());
			}
			(
				(
					lv_class_prior_13_0=RULE_STRING
					{
						newLeafNode(lv_class_prior_13_0, grammarAccess.getNaiveBayesBernoulliAccess().getClass_priorSTRINGTerminalRuleCall_6_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNaiveBayesBernoulliRule());
						}
						setWithLastConsumed(
							$current,
							"class_prior",
							lv_class_prior_13_0,
							"org.thingml.xtext.ThingML.STRING");
					}
				)
			)
			(
				otherlv_14=','
				{
					newLeafNode(otherlv_14, grammarAccess.getNaiveBayesBernoulliAccess().getCommaKeyword_6_2());
				}
			)?
		)?
		otherlv_15=')'
		{
			newLeafNode(otherlv_15, grammarAccess.getNaiveBayesBernoulliAccess().getRightParenthesisKeyword_7());
		}
	)
;

// Entry rule entryRuleNaiveBayesCategorical
entryRuleNaiveBayesCategorical returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNaiveBayesCategoricalRule()); }
	iv_ruleNaiveBayesCategorical=ruleNaiveBayesCategorical
	{ $current=$iv_ruleNaiveBayesCategorical.current; }
	EOF;

// Rule NaiveBayesCategorical
ruleNaiveBayesCategorical returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='naive_bayes_categorical'
		{
			newLeafNode(otherlv_0, grammarAccess.getNaiveBayesCategoricalAccess().getNaive_bayes_categoricalKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getNaiveBayesCategoricalAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNaiveBayesCategoricalRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getNaiveBayesCategoricalAccess().getLeftParenthesisKeyword_2());
		}
		(
			otherlv_3='alpha'
			{
				newLeafNode(otherlv_3, grammarAccess.getNaiveBayesCategoricalAccess().getAlphaKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNaiveBayesCategoricalAccess().getAlphaDoubleLiteralParserRuleCall_3_1_0());
					}
					lv_alpha_4_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNaiveBayesCategoricalRule());
						}
						set(
							$current,
							"alpha",
							lv_alpha_4_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getNaiveBayesCategoricalAccess().getCommaKeyword_3_2());
				}
			)?
		)?
		(
			otherlv_6='fit_prior'
			{
				newLeafNode(otherlv_6, grammarAccess.getNaiveBayesCategoricalAccess().getFit_priorKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNaiveBayesCategoricalAccess().getFit_priorBooleanLiteralParserRuleCall_4_1_0());
					}
					lv_fit_prior_7_0=ruleBooleanLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNaiveBayesCategoricalRule());
						}
						set(
							$current,
							"fit_prior",
							lv_fit_prior_7_0,
							"org.thingml.xtext.ThingML.BooleanLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getNaiveBayesCategoricalAccess().getCommaKeyword_4_2());
				}
			)?
		)?
		(
			otherlv_9='class_prior'
			{
				newLeafNode(otherlv_9, grammarAccess.getNaiveBayesCategoricalAccess().getClass_priorKeyword_5_0());
			}
			(
				(
					lv_class_prior_10_0=RULE_STRING
					{
						newLeafNode(lv_class_prior_10_0, grammarAccess.getNaiveBayesCategoricalAccess().getClass_priorSTRINGTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNaiveBayesCategoricalRule());
						}
						setWithLastConsumed(
							$current,
							"class_prior",
							lv_class_prior_10_0,
							"org.thingml.xtext.ThingML.STRING");
					}
				)
			)
			(
				otherlv_11=','
				{
					newLeafNode(otherlv_11, grammarAccess.getNaiveBayesCategoricalAccess().getCommaKeyword_5_2());
				}
			)?
		)?
		(
			otherlv_12='min_categories'
			{
				newLeafNode(otherlv_12, grammarAccess.getNaiveBayesCategoricalAccess().getMin_categoriesKeyword_6_0());
			}
			(
				(
					lv_min_categories_13_0=RULE_STRING
					{
						newLeafNode(lv_min_categories_13_0, grammarAccess.getNaiveBayesCategoricalAccess().getMin_categoriesSTRINGTerminalRuleCall_6_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNaiveBayesCategoricalRule());
						}
						setWithLastConsumed(
							$current,
							"min_categories",
							lv_min_categories_13_0,
							"org.thingml.xtext.ThingML.STRING");
					}
				)
			)
			(
				otherlv_14=','
				{
					newLeafNode(otherlv_14, grammarAccess.getNaiveBayesCategoricalAccess().getCommaKeyword_6_2());
				}
			)?
		)?
		otherlv_15=')'
		{
			newLeafNode(otherlv_15, grammarAccess.getNaiveBayesCategoricalAccess().getRightParenthesisKeyword_7());
		}
	)
;

// Entry rule entryRuleDecisionTreeRegressor
entryRuleDecisionTreeRegressor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDecisionTreeRegressorRule()); }
	iv_ruleDecisionTreeRegressor=ruleDecisionTreeRegressor
	{ $current=$iv_ruleDecisionTreeRegressor.current; }
	EOF;

// Rule DecisionTreeRegressor
ruleDecisionTreeRegressor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='decision_tree_regressor'
		{
			newLeafNode(otherlv_0, grammarAccess.getDecisionTreeRegressorAccess().getDecision_tree_regressorKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDecisionTreeRegressorAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDecisionTreeRegressorRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getDecisionTreeRegressorAccess().getLeftParenthesisKeyword_2());
		}
		(
			otherlv_3='criterion'
			{
				newLeafNode(otherlv_3, grammarAccess.getDecisionTreeRegressorAccess().getCriterionKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDecisionTreeRegressorAccess().getDecisionTreeRegressorCriterionDecisionTreeRegressorCriterionEnumRuleCall_3_1_0());
					}
					lv_decisionTreeRegressorCriterion_4_0=ruleDecisionTreeRegressorCriterion
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDecisionTreeRegressorRule());
						}
						set(
							$current,
							"decisionTreeRegressorCriterion",
							lv_decisionTreeRegressorCriterion_4_0,
							"org.thingml.xtext.ThingML.DecisionTreeRegressorCriterion");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getDecisionTreeRegressorAccess().getCommaKeyword_3_2());
				}
			)?
		)?
		(
			otherlv_6='splitter'
			{
				newLeafNode(otherlv_6, grammarAccess.getDecisionTreeRegressorAccess().getSplitterKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDecisionTreeRegressorAccess().getDecisionTreeSplitterDecisionTreeSplitterEnumRuleCall_4_1_0());
					}
					lv_decisionTreeSplitter_7_0=ruleDecisionTreeSplitter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDecisionTreeRegressorRule());
						}
						set(
							$current,
							"decisionTreeSplitter",
							lv_decisionTreeSplitter_7_0,
							"org.thingml.xtext.ThingML.DecisionTreeSplitter");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getDecisionTreeRegressorAccess().getCommaKeyword_4_2());
				}
			)?
		)?
		(
			otherlv_9='max_depth'
			{
				newLeafNode(otherlv_9, grammarAccess.getDecisionTreeRegressorAccess().getMax_depthKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDecisionTreeRegressorAccess().getMax_depthIntegerLiteralParserRuleCall_5_1_0());
					}
					lv_max_depth_10_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDecisionTreeRegressorRule());
						}
						set(
							$current,
							"max_depth",
							lv_max_depth_10_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_11=','
				{
					newLeafNode(otherlv_11, grammarAccess.getDecisionTreeRegressorAccess().getCommaKeyword_5_2());
				}
			)?
		)?
		(
			otherlv_12='min_samples_split'
			{
				newLeafNode(otherlv_12, grammarAccess.getDecisionTreeRegressorAccess().getMin_samples_splitKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDecisionTreeRegressorAccess().getMin_samples_splitDoubleLiteralParserRuleCall_6_1_0());
					}
					lv_min_samples_split_13_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDecisionTreeRegressorRule());
						}
						set(
							$current,
							"min_samples_split",
							lv_min_samples_split_13_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_14=','
				{
					newLeafNode(otherlv_14, grammarAccess.getDecisionTreeRegressorAccess().getCommaKeyword_6_2());
				}
			)?
		)?
		(
			otherlv_15='min_samples_leaf'
			{
				newLeafNode(otherlv_15, grammarAccess.getDecisionTreeRegressorAccess().getMin_samples_leafKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDecisionTreeRegressorAccess().getMin_samples_leafDoubleLiteralParserRuleCall_7_1_0());
					}
					lv_min_samples_leaf_16_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDecisionTreeRegressorRule());
						}
						set(
							$current,
							"min_samples_leaf",
							lv_min_samples_leaf_16_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_17=','
				{
					newLeafNode(otherlv_17, grammarAccess.getDecisionTreeRegressorAccess().getCommaKeyword_7_2());
				}
			)?
		)?
		(
			otherlv_18='min_weight_fraction_leaf'
			{
				newLeafNode(otherlv_18, grammarAccess.getDecisionTreeRegressorAccess().getMin_weight_fraction_leafKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDecisionTreeRegressorAccess().getMin_weight_fraction_leafDoubleLiteralParserRuleCall_8_1_0());
					}
					lv_min_weight_fraction_leaf_19_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDecisionTreeRegressorRule());
						}
						set(
							$current,
							"min_weight_fraction_leaf",
							lv_min_weight_fraction_leaf_19_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_20=','
				{
					newLeafNode(otherlv_20, grammarAccess.getDecisionTreeRegressorAccess().getCommaKeyword_8_2());
				}
			)?
		)?
		(
			(
				otherlv_21='max_features'
				{
					newLeafNode(otherlv_21, grammarAccess.getDecisionTreeRegressorAccess().getMax_featuresKeyword_9_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getDecisionTreeRegressorAccess().getMax_features_numericDoubleLiteralParserRuleCall_9_0_1_0());
						}
						lv_max_features_numeric_22_0=ruleDoubleLiteral
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getDecisionTreeRegressorRule());
							}
							set(
								$current,
								"max_features_numeric",
								lv_max_features_numeric_22_0,
								"org.thingml.xtext.ThingML.DoubleLiteral");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					otherlv_23='max_features'
					{
						newLeafNode(otherlv_23, grammarAccess.getDecisionTreeRegressorAccess().getMax_featuresKeyword_9_1_0_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getDecisionTreeRegressorAccess().getMax_features_enumMax_features_enumEnumRuleCall_9_1_0_1_0());
							}
							lv_max_features_enum_24_0=ruleMax_features_enum
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getDecisionTreeRegressorRule());
								}
								set(
									$current,
									"max_features_enum",
									lv_max_features_enum_24_0,
									"org.thingml.xtext.ThingML.Max_features_enum");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)
				(
					otherlv_25=','
					{
						newLeafNode(otherlv_25, grammarAccess.getDecisionTreeRegressorAccess().getCommaKeyword_9_1_1());
					}
				)?
			)
		)?
		(
			otherlv_26='random_state'
			{
				newLeafNode(otherlv_26, grammarAccess.getDecisionTreeRegressorAccess().getRandom_stateKeyword_10_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDecisionTreeRegressorAccess().getRandom_stateIntegerLiteralParserRuleCall_10_1_0());
					}
					lv_random_state_27_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDecisionTreeRegressorRule());
						}
						set(
							$current,
							"random_state",
							lv_random_state_27_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_28=','
				{
					newLeafNode(otherlv_28, grammarAccess.getDecisionTreeRegressorAccess().getCommaKeyword_10_2());
				}
			)?
		)?
		(
			otherlv_29='max_leaf_nodes'
			{
				newLeafNode(otherlv_29, grammarAccess.getDecisionTreeRegressorAccess().getMax_leaf_nodesKeyword_11_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDecisionTreeRegressorAccess().getMax_leaf_nodesIntegerLiteralParserRuleCall_11_1_0());
					}
					lv_max_leaf_nodes_30_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDecisionTreeRegressorRule());
						}
						set(
							$current,
							"max_leaf_nodes",
							lv_max_leaf_nodes_30_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_31=','
				{
					newLeafNode(otherlv_31, grammarAccess.getDecisionTreeRegressorAccess().getCommaKeyword_11_2());
				}
			)?
		)?
		(
			otherlv_32='min_impurity_decrease'
			{
				newLeafNode(otherlv_32, grammarAccess.getDecisionTreeRegressorAccess().getMin_impurity_decreaseKeyword_12_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDecisionTreeRegressorAccess().getMin_impurity_decreaseDoubleLiteralParserRuleCall_12_1_0());
					}
					lv_min_impurity_decrease_33_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDecisionTreeRegressorRule());
						}
						set(
							$current,
							"min_impurity_decrease",
							lv_min_impurity_decrease_33_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_34=','
				{
					newLeafNode(otherlv_34, grammarAccess.getDecisionTreeRegressorAccess().getCommaKeyword_12_2());
				}
			)?
		)?
		(
			otherlv_35='min_impurity_split'
			{
				newLeafNode(otherlv_35, grammarAccess.getDecisionTreeRegressorAccess().getMin_impurity_splitKeyword_13_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDecisionTreeRegressorAccess().getMin_impurity_splitDoubleLiteralParserRuleCall_13_1_0());
					}
					lv_min_impurity_split_36_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDecisionTreeRegressorRule());
						}
						set(
							$current,
							"min_impurity_split",
							lv_min_impurity_split_36_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_37=','
				{
					newLeafNode(otherlv_37, grammarAccess.getDecisionTreeRegressorAccess().getCommaKeyword_13_2());
				}
			)?
		)?
		(
			otherlv_38='ccp_alpha'
			{
				newLeafNode(otherlv_38, grammarAccess.getDecisionTreeRegressorAccess().getCcp_alphaKeyword_14_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDecisionTreeRegressorAccess().getCcp_alphaDoubleLiteralParserRuleCall_14_1_0());
					}
					lv_ccp_alpha_39_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDecisionTreeRegressorRule());
						}
						set(
							$current,
							"ccp_alpha",
							lv_ccp_alpha_39_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_40=','
				{
					newLeafNode(otherlv_40, grammarAccess.getDecisionTreeRegressorAccess().getCommaKeyword_14_2());
				}
			)?
		)?
		otherlv_41=')'
		{
			newLeafNode(otherlv_41, grammarAccess.getDecisionTreeRegressorAccess().getRightParenthesisKeyword_15());
		}
	)
;

// Entry rule entryRuleDecisionTreeClassifier
entryRuleDecisionTreeClassifier returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDecisionTreeClassifierRule()); }
	iv_ruleDecisionTreeClassifier=ruleDecisionTreeClassifier
	{ $current=$iv_ruleDecisionTreeClassifier.current; }
	EOF;

// Rule DecisionTreeClassifier
ruleDecisionTreeClassifier returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='decision_tree_classifier'
		{
			newLeafNode(otherlv_0, grammarAccess.getDecisionTreeClassifierAccess().getDecision_tree_classifierKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDecisionTreeClassifierAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDecisionTreeClassifierRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getDecisionTreeClassifierAccess().getLeftParenthesisKeyword_2());
		}
		(
			otherlv_3='criterion'
			{
				newLeafNode(otherlv_3, grammarAccess.getDecisionTreeClassifierAccess().getCriterionKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDecisionTreeClassifierAccess().getDecisionTreeClassifierCriterionDecisionTreeClassifierCriterionEnumRuleCall_3_1_0());
					}
					lv_decisionTreeClassifierCriterion_4_0=ruleDecisionTreeClassifierCriterion
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDecisionTreeClassifierRule());
						}
						set(
							$current,
							"decisionTreeClassifierCriterion",
							lv_decisionTreeClassifierCriterion_4_0,
							"org.thingml.xtext.ThingML.DecisionTreeClassifierCriterion");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getDecisionTreeClassifierAccess().getCommaKeyword_3_2());
				}
			)?
		)?
		(
			otherlv_6='splitter'
			{
				newLeafNode(otherlv_6, grammarAccess.getDecisionTreeClassifierAccess().getSplitterKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDecisionTreeClassifierAccess().getDecisionTreeSplitterDecisionTreeSplitterEnumRuleCall_4_1_0());
					}
					lv_decisionTreeSplitter_7_0=ruleDecisionTreeSplitter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDecisionTreeClassifierRule());
						}
						set(
							$current,
							"decisionTreeSplitter",
							lv_decisionTreeSplitter_7_0,
							"org.thingml.xtext.ThingML.DecisionTreeSplitter");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getDecisionTreeClassifierAccess().getCommaKeyword_4_2());
				}
			)?
		)?
		(
			otherlv_9='max_depth'
			{
				newLeafNode(otherlv_9, grammarAccess.getDecisionTreeClassifierAccess().getMax_depthKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDecisionTreeClassifierAccess().getMax_depthIntegerLiteralParserRuleCall_5_1_0());
					}
					lv_max_depth_10_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDecisionTreeClassifierRule());
						}
						set(
							$current,
							"max_depth",
							lv_max_depth_10_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_11=','
				{
					newLeafNode(otherlv_11, grammarAccess.getDecisionTreeClassifierAccess().getCommaKeyword_5_2());
				}
			)?
		)?
		(
			otherlv_12='min_samples_split'
			{
				newLeafNode(otherlv_12, grammarAccess.getDecisionTreeClassifierAccess().getMin_samples_splitKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDecisionTreeClassifierAccess().getMin_samples_splitDoubleLiteralParserRuleCall_6_1_0());
					}
					lv_min_samples_split_13_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDecisionTreeClassifierRule());
						}
						set(
							$current,
							"min_samples_split",
							lv_min_samples_split_13_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_14=','
				{
					newLeafNode(otherlv_14, grammarAccess.getDecisionTreeClassifierAccess().getCommaKeyword_6_2());
				}
			)?
		)?
		(
			otherlv_15='min_samples_leaf'
			{
				newLeafNode(otherlv_15, grammarAccess.getDecisionTreeClassifierAccess().getMin_samples_leafKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDecisionTreeClassifierAccess().getMin_samples_leafDoubleLiteralParserRuleCall_7_1_0());
					}
					lv_min_samples_leaf_16_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDecisionTreeClassifierRule());
						}
						set(
							$current,
							"min_samples_leaf",
							lv_min_samples_leaf_16_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_17=','
				{
					newLeafNode(otherlv_17, grammarAccess.getDecisionTreeClassifierAccess().getCommaKeyword_7_2());
				}
			)?
		)?
		(
			otherlv_18='min_weight_fraction_leaf'
			{
				newLeafNode(otherlv_18, grammarAccess.getDecisionTreeClassifierAccess().getMin_weight_fraction_leafKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDecisionTreeClassifierAccess().getMin_weight_fraction_leafDoubleLiteralParserRuleCall_8_1_0());
					}
					lv_min_weight_fraction_leaf_19_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDecisionTreeClassifierRule());
						}
						set(
							$current,
							"min_weight_fraction_leaf",
							lv_min_weight_fraction_leaf_19_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_20=','
				{
					newLeafNode(otherlv_20, grammarAccess.getDecisionTreeClassifierAccess().getCommaKeyword_8_2());
				}
			)?
		)?
		(
			(
				otherlv_21='max_features'
				{
					newLeafNode(otherlv_21, grammarAccess.getDecisionTreeClassifierAccess().getMax_featuresKeyword_9_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getDecisionTreeClassifierAccess().getMax_features_numericDoubleLiteralParserRuleCall_9_0_1_0());
						}
						lv_max_features_numeric_22_0=ruleDoubleLiteral
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getDecisionTreeClassifierRule());
							}
							set(
								$current,
								"max_features_numeric",
								lv_max_features_numeric_22_0,
								"org.thingml.xtext.ThingML.DoubleLiteral");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					otherlv_23='max_features'
					{
						newLeafNode(otherlv_23, grammarAccess.getDecisionTreeClassifierAccess().getMax_featuresKeyword_9_1_0_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getDecisionTreeClassifierAccess().getMax_features_enumMax_features_enumEnumRuleCall_9_1_0_1_0());
							}
							lv_max_features_enum_24_0=ruleMax_features_enum
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getDecisionTreeClassifierRule());
								}
								set(
									$current,
									"max_features_enum",
									lv_max_features_enum_24_0,
									"org.thingml.xtext.ThingML.Max_features_enum");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)
				(
					otherlv_25=','
					{
						newLeafNode(otherlv_25, grammarAccess.getDecisionTreeClassifierAccess().getCommaKeyword_9_1_1());
					}
				)?
			)
		)?
		(
			otherlv_26='random_state'
			{
				newLeafNode(otherlv_26, grammarAccess.getDecisionTreeClassifierAccess().getRandom_stateKeyword_10_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDecisionTreeClassifierAccess().getRandom_stateIntegerLiteralParserRuleCall_10_1_0());
					}
					lv_random_state_27_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDecisionTreeClassifierRule());
						}
						set(
							$current,
							"random_state",
							lv_random_state_27_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_28=','
				{
					newLeafNode(otherlv_28, grammarAccess.getDecisionTreeClassifierAccess().getCommaKeyword_10_2());
				}
			)?
		)?
		(
			otherlv_29='max_leaf_nodes'
			{
				newLeafNode(otherlv_29, grammarAccess.getDecisionTreeClassifierAccess().getMax_leaf_nodesKeyword_11_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDecisionTreeClassifierAccess().getMax_leaf_nodesIntegerLiteralParserRuleCall_11_1_0());
					}
					lv_max_leaf_nodes_30_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDecisionTreeClassifierRule());
						}
						set(
							$current,
							"max_leaf_nodes",
							lv_max_leaf_nodes_30_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_31=','
				{
					newLeafNode(otherlv_31, grammarAccess.getDecisionTreeClassifierAccess().getCommaKeyword_11_2());
				}
			)?
		)?
		(
			otherlv_32='min_impurity_decrease'
			{
				newLeafNode(otherlv_32, grammarAccess.getDecisionTreeClassifierAccess().getMin_impurity_decreaseKeyword_12_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDecisionTreeClassifierAccess().getMin_impurity_decreaseDoubleLiteralParserRuleCall_12_1_0());
					}
					lv_min_impurity_decrease_33_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDecisionTreeClassifierRule());
						}
						set(
							$current,
							"min_impurity_decrease",
							lv_min_impurity_decrease_33_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_34=','
				{
					newLeafNode(otherlv_34, grammarAccess.getDecisionTreeClassifierAccess().getCommaKeyword_12_2());
				}
			)?
		)?
		(
			otherlv_35='min_impurity_split'
			{
				newLeafNode(otherlv_35, grammarAccess.getDecisionTreeClassifierAccess().getMin_impurity_splitKeyword_13_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDecisionTreeClassifierAccess().getMin_impurity_splitDoubleLiteralParserRuleCall_13_1_0());
					}
					lv_min_impurity_split_36_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDecisionTreeClassifierRule());
						}
						set(
							$current,
							"min_impurity_split",
							lv_min_impurity_split_36_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_37=','
				{
					newLeafNode(otherlv_37, grammarAccess.getDecisionTreeClassifierAccess().getCommaKeyword_13_2());
				}
			)?
		)?
		(
			otherlv_38='class_weight'
			{
				newLeafNode(otherlv_38, grammarAccess.getDecisionTreeClassifierAccess().getClass_weightKeyword_14_0());
			}
			(
				(
					lv_class_weight_39_0=RULE_STRING
					{
						newLeafNode(lv_class_weight_39_0, grammarAccess.getDecisionTreeClassifierAccess().getClass_weightSTRINGTerminalRuleCall_14_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDecisionTreeClassifierRule());
						}
						setWithLastConsumed(
							$current,
							"class_weight",
							lv_class_weight_39_0,
							"org.thingml.xtext.ThingML.STRING");
					}
				)
			)
			(
				otherlv_40=','
				{
					newLeafNode(otherlv_40, grammarAccess.getDecisionTreeClassifierAccess().getCommaKeyword_14_2());
				}
			)?
		)?
		(
			otherlv_41='ccp_alpha'
			{
				newLeafNode(otherlv_41, grammarAccess.getDecisionTreeClassifierAccess().getCcp_alphaKeyword_15_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDecisionTreeClassifierAccess().getCcp_alphaDoubleLiteralParserRuleCall_15_1_0());
					}
					lv_ccp_alpha_42_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDecisionTreeClassifierRule());
						}
						set(
							$current,
							"ccp_alpha",
							lv_ccp_alpha_42_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_43=','
				{
					newLeafNode(otherlv_43, grammarAccess.getDecisionTreeClassifierAccess().getCommaKeyword_15_2());
				}
			)?
		)?
		otherlv_44=')'
		{
			newLeafNode(otherlv_44, grammarAccess.getDecisionTreeClassifierAccess().getRightParenthesisKeyword_16());
		}
	)
;

// Entry rule entryRuleRandomForestRegressor
entryRuleRandomForestRegressor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRandomForestRegressorRule()); }
	iv_ruleRandomForestRegressor=ruleRandomForestRegressor
	{ $current=$iv_ruleRandomForestRegressor.current; }
	EOF;

// Rule RandomForestRegressor
ruleRandomForestRegressor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='random_forest_regressor'
		{
			newLeafNode(otherlv_0, grammarAccess.getRandomForestRegressorAccess().getRandom_forest_regressorKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getRandomForestRegressorAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRandomForestRegressorRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getRandomForestRegressorAccess().getLeftParenthesisKeyword_2());
		}
		(
			otherlv_3='n_estimators'
			{
				newLeafNode(otherlv_3, grammarAccess.getRandomForestRegressorAccess().getN_estimatorsKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestRegressorAccess().getN_estimatorsIntegerLiteralParserRuleCall_3_1_0());
					}
					lv_n_estimators_4_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestRegressorRule());
						}
						set(
							$current,
							"n_estimators",
							lv_n_estimators_4_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_3_2());
				}
			)?
		)?
		(
			otherlv_6='criterion'
			{
				newLeafNode(otherlv_6, grammarAccess.getRandomForestRegressorAccess().getCriterionKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestRegressorAccess().getRandomForestRegressorCriterionRandomForestRegressorCriterionEnumRuleCall_4_1_0());
					}
					lv_randomForestRegressorCriterion_7_0=ruleRandomForestRegressorCriterion
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestRegressorRule());
						}
						set(
							$current,
							"randomForestRegressorCriterion",
							lv_randomForestRegressorCriterion_7_0,
							"org.thingml.xtext.ThingML.RandomForestRegressorCriterion");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_4_2());
				}
			)?
		)?
		(
			otherlv_9='max_depth'
			{
				newLeafNode(otherlv_9, grammarAccess.getRandomForestRegressorAccess().getMax_depthKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestRegressorAccess().getMax_depthIntegerLiteralParserRuleCall_5_1_0());
					}
					lv_max_depth_10_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestRegressorRule());
						}
						set(
							$current,
							"max_depth",
							lv_max_depth_10_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_11=','
				{
					newLeafNode(otherlv_11, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_5_2());
				}
			)?
		)?
		(
			otherlv_12='min_samples_split'
			{
				newLeafNode(otherlv_12, grammarAccess.getRandomForestRegressorAccess().getMin_samples_splitKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestRegressorAccess().getMin_samples_splitDoubleLiteralParserRuleCall_6_1_0());
					}
					lv_min_samples_split_13_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestRegressorRule());
						}
						set(
							$current,
							"min_samples_split",
							lv_min_samples_split_13_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_14=','
				{
					newLeafNode(otherlv_14, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_6_2());
				}
			)?
		)?
		(
			otherlv_15='min_samples_leaf'
			{
				newLeafNode(otherlv_15, grammarAccess.getRandomForestRegressorAccess().getMin_samples_leafKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestRegressorAccess().getMin_samples_leafDoubleLiteralParserRuleCall_7_1_0());
					}
					lv_min_samples_leaf_16_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestRegressorRule());
						}
						set(
							$current,
							"min_samples_leaf",
							lv_min_samples_leaf_16_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_17=','
				{
					newLeafNode(otherlv_17, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_7_2());
				}
			)?
		)?
		(
			otherlv_18='min_weight_fraction_leaf'
			{
				newLeafNode(otherlv_18, grammarAccess.getRandomForestRegressorAccess().getMin_weight_fraction_leafKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestRegressorAccess().getMin_weight_fraction_leafDoubleLiteralParserRuleCall_8_1_0());
					}
					lv_min_weight_fraction_leaf_19_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestRegressorRule());
						}
						set(
							$current,
							"min_weight_fraction_leaf",
							lv_min_weight_fraction_leaf_19_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_20=','
				{
					newLeafNode(otherlv_20, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_8_2());
				}
			)?
		)?
		(
			(
				otherlv_21='max_features'
				{
					newLeafNode(otherlv_21, grammarAccess.getRandomForestRegressorAccess().getMax_featuresKeyword_9_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRandomForestRegressorAccess().getMax_features_numericDoubleLiteralParserRuleCall_9_0_1_0());
						}
						lv_max_features_numeric_22_0=ruleDoubleLiteral
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRandomForestRegressorRule());
							}
							set(
								$current,
								"max_features_numeric",
								lv_max_features_numeric_22_0,
								"org.thingml.xtext.ThingML.DoubleLiteral");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					otherlv_23='max_features'
					{
						newLeafNode(otherlv_23, grammarAccess.getRandomForestRegressorAccess().getMax_featuresKeyword_9_1_0_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getRandomForestRegressorAccess().getMax_features_enumMax_features_enumEnumRuleCall_9_1_0_1_0());
							}
							lv_max_features_enum_24_0=ruleMax_features_enum
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getRandomForestRegressorRule());
								}
								set(
									$current,
									"max_features_enum",
									lv_max_features_enum_24_0,
									"org.thingml.xtext.ThingML.Max_features_enum");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)
				(
					otherlv_25=','
					{
						newLeafNode(otherlv_25, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_9_1_1());
					}
				)?
			)
		)?
		(
			otherlv_26='max_leaf_nodes'
			{
				newLeafNode(otherlv_26, grammarAccess.getRandomForestRegressorAccess().getMax_leaf_nodesKeyword_10_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestRegressorAccess().getMax_leaf_nodesIntegerLiteralParserRuleCall_10_1_0());
					}
					lv_max_leaf_nodes_27_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestRegressorRule());
						}
						set(
							$current,
							"max_leaf_nodes",
							lv_max_leaf_nodes_27_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_28=','
				{
					newLeafNode(otherlv_28, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_10_2());
				}
			)?
		)?
		(
			otherlv_29='min_impurity_decrease'
			{
				newLeafNode(otherlv_29, grammarAccess.getRandomForestRegressorAccess().getMin_impurity_decreaseKeyword_11_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestRegressorAccess().getMin_impurity_decreaseDoubleLiteralParserRuleCall_11_1_0());
					}
					lv_min_impurity_decrease_30_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestRegressorRule());
						}
						set(
							$current,
							"min_impurity_decrease",
							lv_min_impurity_decrease_30_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_31=','
				{
					newLeafNode(otherlv_31, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_11_2());
				}
			)?
		)?
		(
			otherlv_32='min_impurity_split'
			{
				newLeafNode(otherlv_32, grammarAccess.getRandomForestRegressorAccess().getMin_impurity_splitKeyword_12_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestRegressorAccess().getMin_impurity_splitDoubleLiteralParserRuleCall_12_1_0());
					}
					lv_min_impurity_split_33_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestRegressorRule());
						}
						set(
							$current,
							"min_impurity_split",
							lv_min_impurity_split_33_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_34=','
				{
					newLeafNode(otherlv_34, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_12_2());
				}
			)?
		)?
		(
			otherlv_35='bootstrap'
			{
				newLeafNode(otherlv_35, grammarAccess.getRandomForestRegressorAccess().getBootstrapKeyword_13_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestRegressorAccess().getBootstrapBooleanLiteralParserRuleCall_13_1_0());
					}
					lv_bootstrap_36_0=ruleBooleanLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestRegressorRule());
						}
						set(
							$current,
							"bootstrap",
							lv_bootstrap_36_0,
							"org.thingml.xtext.ThingML.BooleanLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_37=','
				{
					newLeafNode(otherlv_37, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_13_2());
				}
			)?
		)?
		(
			otherlv_38='oob_score'
			{
				newLeafNode(otherlv_38, grammarAccess.getRandomForestRegressorAccess().getOob_scoreKeyword_14_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestRegressorAccess().getOob_scoreBooleanLiteralParserRuleCall_14_1_0());
					}
					lv_oob_score_39_0=ruleBooleanLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestRegressorRule());
						}
						set(
							$current,
							"oob_score",
							lv_oob_score_39_0,
							"org.thingml.xtext.ThingML.BooleanLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_40=','
				{
					newLeafNode(otherlv_40, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_14_2());
				}
			)?
		)?
		(
			otherlv_41='n_jobs'
			{
				newLeafNode(otherlv_41, grammarAccess.getRandomForestRegressorAccess().getN_jobsKeyword_15_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestRegressorAccess().getN_jobsIntegerLiteralParserRuleCall_15_1_0());
					}
					lv_n_jobs_42_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestRegressorRule());
						}
						set(
							$current,
							"n_jobs",
							lv_n_jobs_42_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_43=','
				{
					newLeafNode(otherlv_43, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_15_2());
				}
			)?
		)?
		(
			otherlv_44='random_state'
			{
				newLeafNode(otherlv_44, grammarAccess.getRandomForestRegressorAccess().getRandom_stateKeyword_16_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestRegressorAccess().getRandom_stateIntegerLiteralParserRuleCall_16_1_0());
					}
					lv_random_state_45_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestRegressorRule());
						}
						set(
							$current,
							"random_state",
							lv_random_state_45_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_46=','
				{
					newLeafNode(otherlv_46, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_16_2());
				}
			)?
		)?
		(
			otherlv_47='verbose'
			{
				newLeafNode(otherlv_47, grammarAccess.getRandomForestRegressorAccess().getVerboseKeyword_17_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestRegressorAccess().getVerboseIntegerLiteralParserRuleCall_17_1_0());
					}
					lv_verbose_48_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestRegressorRule());
						}
						set(
							$current,
							"verbose",
							lv_verbose_48_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_49=','
				{
					newLeafNode(otherlv_49, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_17_2());
				}
			)?
		)?
		(
			otherlv_50='warm_start'
			{
				newLeafNode(otherlv_50, grammarAccess.getRandomForestRegressorAccess().getWarm_startKeyword_18_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestRegressorAccess().getWarm_startBooleanLiteralParserRuleCall_18_1_0());
					}
					lv_warm_start_51_0=ruleBooleanLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestRegressorRule());
						}
						set(
							$current,
							"warm_start",
							lv_warm_start_51_0,
							"org.thingml.xtext.ThingML.BooleanLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_52=','
				{
					newLeafNode(otherlv_52, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_18_2());
				}
			)?
		)?
		(
			otherlv_53='ccp_alpha'
			{
				newLeafNode(otherlv_53, grammarAccess.getRandomForestRegressorAccess().getCcp_alphaKeyword_19_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestRegressorAccess().getCcp_alphaDoubleLiteralParserRuleCall_19_1_0());
					}
					lv_ccp_alpha_54_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestRegressorRule());
						}
						set(
							$current,
							"ccp_alpha",
							lv_ccp_alpha_54_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_55=','
				{
					newLeafNode(otherlv_55, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_19_2());
				}
			)?
		)?
		(
			otherlv_56='max_samples'
			{
				newLeafNode(otherlv_56, grammarAccess.getRandomForestRegressorAccess().getMax_samplesKeyword_20_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestRegressorAccess().getMax_samplesDoubleLiteralParserRuleCall_20_1_0());
					}
					lv_max_samples_57_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestRegressorRule());
						}
						set(
							$current,
							"max_samples",
							lv_max_samples_57_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_58=','
				{
					newLeafNode(otherlv_58, grammarAccess.getRandomForestRegressorAccess().getCommaKeyword_20_2());
				}
			)?
		)?
		otherlv_59=')'
		{
			newLeafNode(otherlv_59, grammarAccess.getRandomForestRegressorAccess().getRightParenthesisKeyword_21());
		}
	)
;

// Entry rule entryRuleRandomForestClassifier
entryRuleRandomForestClassifier returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRandomForestClassifierRule()); }
	iv_ruleRandomForestClassifier=ruleRandomForestClassifier
	{ $current=$iv_ruleRandomForestClassifier.current; }
	EOF;

// Rule RandomForestClassifier
ruleRandomForestClassifier returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='random_forest_classifier'
		{
			newLeafNode(otherlv_0, grammarAccess.getRandomForestClassifierAccess().getRandom_forest_classifierKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getRandomForestClassifierAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRandomForestClassifierRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getRandomForestClassifierAccess().getLeftParenthesisKeyword_2());
		}
		(
			otherlv_3='n_estimators'
			{
				newLeafNode(otherlv_3, grammarAccess.getRandomForestClassifierAccess().getN_estimatorsKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestClassifierAccess().getN_estimatorsIntegerLiteralParserRuleCall_3_1_0());
					}
					lv_n_estimators_4_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestClassifierRule());
						}
						set(
							$current,
							"n_estimators",
							lv_n_estimators_4_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_3_2());
				}
			)?
		)?
		(
			otherlv_6='criterion'
			{
				newLeafNode(otherlv_6, grammarAccess.getRandomForestClassifierAccess().getCriterionKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestClassifierAccess().getRandomForestClassifierCriterionRandomForestClassifierCriterionEnumRuleCall_4_1_0());
					}
					lv_randomForestClassifierCriterion_7_0=ruleRandomForestClassifierCriterion
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestClassifierRule());
						}
						set(
							$current,
							"randomForestClassifierCriterion",
							lv_randomForestClassifierCriterion_7_0,
							"org.thingml.xtext.ThingML.RandomForestClassifierCriterion");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_4_2());
				}
			)?
		)?
		(
			otherlv_9='max_depth'
			{
				newLeafNode(otherlv_9, grammarAccess.getRandomForestClassifierAccess().getMax_depthKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestClassifierAccess().getMax_depthIntegerLiteralParserRuleCall_5_1_0());
					}
					lv_max_depth_10_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestClassifierRule());
						}
						set(
							$current,
							"max_depth",
							lv_max_depth_10_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_11=','
				{
					newLeafNode(otherlv_11, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_5_2());
				}
			)?
		)?
		(
			otherlv_12='min_samples_split'
			{
				newLeafNode(otherlv_12, grammarAccess.getRandomForestClassifierAccess().getMin_samples_splitKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestClassifierAccess().getMin_samples_splitDoubleLiteralParserRuleCall_6_1_0());
					}
					lv_min_samples_split_13_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestClassifierRule());
						}
						set(
							$current,
							"min_samples_split",
							lv_min_samples_split_13_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_14=','
				{
					newLeafNode(otherlv_14, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_6_2());
				}
			)?
		)?
		(
			otherlv_15='min_samples_leaf'
			{
				newLeafNode(otherlv_15, grammarAccess.getRandomForestClassifierAccess().getMin_samples_leafKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestClassifierAccess().getMin_samples_leafDoubleLiteralParserRuleCall_7_1_0());
					}
					lv_min_samples_leaf_16_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestClassifierRule());
						}
						set(
							$current,
							"min_samples_leaf",
							lv_min_samples_leaf_16_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_17=','
				{
					newLeafNode(otherlv_17, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_7_2());
				}
			)?
		)?
		(
			otherlv_18='min_weight_fraction_leaf'
			{
				newLeafNode(otherlv_18, grammarAccess.getRandomForestClassifierAccess().getMin_weight_fraction_leafKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestClassifierAccess().getMin_weight_fraction_leafDoubleLiteralParserRuleCall_8_1_0());
					}
					lv_min_weight_fraction_leaf_19_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestClassifierRule());
						}
						set(
							$current,
							"min_weight_fraction_leaf",
							lv_min_weight_fraction_leaf_19_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_20=','
				{
					newLeafNode(otherlv_20, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_8_2());
				}
			)?
		)?
		(
			(
				otherlv_21='max_features'
				{
					newLeafNode(otherlv_21, grammarAccess.getRandomForestClassifierAccess().getMax_featuresKeyword_9_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRandomForestClassifierAccess().getMax_features_numericDoubleLiteralParserRuleCall_9_0_1_0());
						}
						lv_max_features_numeric_22_0=ruleDoubleLiteral
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRandomForestClassifierRule());
							}
							set(
								$current,
								"max_features_numeric",
								lv_max_features_numeric_22_0,
								"org.thingml.xtext.ThingML.DoubleLiteral");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					otherlv_23='max_features'
					{
						newLeafNode(otherlv_23, grammarAccess.getRandomForestClassifierAccess().getMax_featuresKeyword_9_1_0_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getRandomForestClassifierAccess().getMax_features_enumMax_features_enumEnumRuleCall_9_1_0_1_0());
							}
							lv_max_features_enum_24_0=ruleMax_features_enum
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getRandomForestClassifierRule());
								}
								set(
									$current,
									"max_features_enum",
									lv_max_features_enum_24_0,
									"org.thingml.xtext.ThingML.Max_features_enum");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)
				(
					otherlv_25=','
					{
						newLeafNode(otherlv_25, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_9_1_1());
					}
				)?
			)
		)?
		(
			otherlv_26='max_leaf_nodes'
			{
				newLeafNode(otherlv_26, grammarAccess.getRandomForestClassifierAccess().getMax_leaf_nodesKeyword_10_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestClassifierAccess().getMax_leaf_nodesIntegerLiteralParserRuleCall_10_1_0());
					}
					lv_max_leaf_nodes_27_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestClassifierRule());
						}
						set(
							$current,
							"max_leaf_nodes",
							lv_max_leaf_nodes_27_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_28=','
				{
					newLeafNode(otherlv_28, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_10_2());
				}
			)?
		)?
		(
			otherlv_29='min_impurity_decrease'
			{
				newLeafNode(otherlv_29, grammarAccess.getRandomForestClassifierAccess().getMin_impurity_decreaseKeyword_11_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestClassifierAccess().getMin_impurity_decreaseDoubleLiteralParserRuleCall_11_1_0());
					}
					lv_min_impurity_decrease_30_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestClassifierRule());
						}
						set(
							$current,
							"min_impurity_decrease",
							lv_min_impurity_decrease_30_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_31=','
				{
					newLeafNode(otherlv_31, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_11_2());
				}
			)?
		)?
		(
			otherlv_32='min_impurity_split'
			{
				newLeafNode(otherlv_32, grammarAccess.getRandomForestClassifierAccess().getMin_impurity_splitKeyword_12_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestClassifierAccess().getMin_impurity_splitDoubleLiteralParserRuleCall_12_1_0());
					}
					lv_min_impurity_split_33_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestClassifierRule());
						}
						set(
							$current,
							"min_impurity_split",
							lv_min_impurity_split_33_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_34=','
				{
					newLeafNode(otherlv_34, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_12_2());
				}
			)?
		)?
		(
			otherlv_35='bootstrap'
			{
				newLeafNode(otherlv_35, grammarAccess.getRandomForestClassifierAccess().getBootstrapKeyword_13_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestClassifierAccess().getBootstrapBooleanLiteralParserRuleCall_13_1_0());
					}
					lv_bootstrap_36_0=ruleBooleanLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestClassifierRule());
						}
						set(
							$current,
							"bootstrap",
							lv_bootstrap_36_0,
							"org.thingml.xtext.ThingML.BooleanLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_37=','
				{
					newLeafNode(otherlv_37, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_13_2());
				}
			)?
		)?
		(
			otherlv_38='oob_score'
			{
				newLeafNode(otherlv_38, grammarAccess.getRandomForestClassifierAccess().getOob_scoreKeyword_14_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestClassifierAccess().getOob_scoreBooleanLiteralParserRuleCall_14_1_0());
					}
					lv_oob_score_39_0=ruleBooleanLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestClassifierRule());
						}
						set(
							$current,
							"oob_score",
							lv_oob_score_39_0,
							"org.thingml.xtext.ThingML.BooleanLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_40=','
				{
					newLeafNode(otherlv_40, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_14_2());
				}
			)?
		)?
		(
			otherlv_41='n_jobs'
			{
				newLeafNode(otherlv_41, grammarAccess.getRandomForestClassifierAccess().getN_jobsKeyword_15_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestClassifierAccess().getN_jobsIntegerLiteralParserRuleCall_15_1_0());
					}
					lv_n_jobs_42_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestClassifierRule());
						}
						set(
							$current,
							"n_jobs",
							lv_n_jobs_42_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_43=','
				{
					newLeafNode(otherlv_43, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_15_2());
				}
			)?
		)?
		(
			otherlv_44='random_state'
			{
				newLeafNode(otherlv_44, grammarAccess.getRandomForestClassifierAccess().getRandom_stateKeyword_16_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestClassifierAccess().getRandom_stateIntegerLiteralParserRuleCall_16_1_0());
					}
					lv_random_state_45_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestClassifierRule());
						}
						set(
							$current,
							"random_state",
							lv_random_state_45_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_46=','
				{
					newLeafNode(otherlv_46, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_16_2());
				}
			)?
		)?
		(
			otherlv_47='verbose'
			{
				newLeafNode(otherlv_47, grammarAccess.getRandomForestClassifierAccess().getVerboseKeyword_17_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestClassifierAccess().getVerboseIntegerLiteralParserRuleCall_17_1_0());
					}
					lv_verbose_48_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestClassifierRule());
						}
						set(
							$current,
							"verbose",
							lv_verbose_48_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_49=','
				{
					newLeafNode(otherlv_49, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_17_2());
				}
			)?
		)?
		(
			otherlv_50='warm_start'
			{
				newLeafNode(otherlv_50, grammarAccess.getRandomForestClassifierAccess().getWarm_startKeyword_18_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestClassifierAccess().getWarm_startBooleanLiteralParserRuleCall_18_1_0());
					}
					lv_warm_start_51_0=ruleBooleanLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestClassifierRule());
						}
						set(
							$current,
							"warm_start",
							lv_warm_start_51_0,
							"org.thingml.xtext.ThingML.BooleanLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_52=','
				{
					newLeafNode(otherlv_52, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_18_2());
				}
			)?
		)?
		(
			otherlv_53='class_weight'
			{
				newLeafNode(otherlv_53, grammarAccess.getRandomForestClassifierAccess().getClass_weightKeyword_19_0());
			}
			(
				(
					lv_class_weight_54_0=RULE_STRING
					{
						newLeafNode(lv_class_weight_54_0, grammarAccess.getRandomForestClassifierAccess().getClass_weightSTRINGTerminalRuleCall_19_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRandomForestClassifierRule());
						}
						setWithLastConsumed(
							$current,
							"class_weight",
							lv_class_weight_54_0,
							"org.thingml.xtext.ThingML.STRING");
					}
				)
			)
			(
				otherlv_55=','
				{
					newLeafNode(otherlv_55, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_19_2());
				}
			)?
		)?
		(
			otherlv_56='ccp_alpha'
			{
				newLeafNode(otherlv_56, grammarAccess.getRandomForestClassifierAccess().getCcp_alphaKeyword_20_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestClassifierAccess().getCcp_alphaDoubleLiteralParserRuleCall_20_1_0());
					}
					lv_ccp_alpha_57_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestClassifierRule());
						}
						set(
							$current,
							"ccp_alpha",
							lv_ccp_alpha_57_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_58=','
				{
					newLeafNode(otherlv_58, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_20_2());
				}
			)?
		)?
		(
			otherlv_59='max_samples'
			{
				newLeafNode(otherlv_59, grammarAccess.getRandomForestClassifierAccess().getMax_samplesKeyword_21_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestClassifierAccess().getMax_samplesDoubleLiteralParserRuleCall_21_1_0());
					}
					lv_max_samples_60_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestClassifierRule());
						}
						set(
							$current,
							"max_samples",
							lv_max_samples_60_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_61=','
				{
					newLeafNode(otherlv_61, grammarAccess.getRandomForestClassifierAccess().getCommaKeyword_21_2());
				}
			)?
		)?
		otherlv_62=')'
		{
			newLeafNode(otherlv_62, grammarAccess.getRandomForestClassifierAccess().getRightParenthesisKeyword_22());
		}
	)
;

// Entry rule entryRuleNN_MultilayerPerceptron
entryRuleNN_MultilayerPerceptron returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNN_MultilayerPerceptronRule()); }
	iv_ruleNN_MultilayerPerceptron=ruleNN_MultilayerPerceptron
	{ $current=$iv_ruleNN_MultilayerPerceptron.current; }
	EOF;

// Rule NN_MultilayerPerceptron
ruleNN_MultilayerPerceptron returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='nn_multilayer_perceptron'
		{
			newLeafNode(otherlv_0, grammarAccess.getNN_MultilayerPerceptronAccess().getNn_multilayer_perceptronKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getNN_MultilayerPerceptronAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNN_MultilayerPerceptronRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getNN_MultilayerPerceptronAccess().getLeftParenthesisKeyword_2());
		}
		(
			otherlv_3='hidden_layer_sizes'
			{
				newLeafNode(otherlv_3, grammarAccess.getNN_MultilayerPerceptronAccess().getHidden_layer_sizesKeyword_3_0());
			}
			(
				(
					lv_hidden_layer_sizes_4_0='('
					{
						newLeafNode(lv_hidden_layer_sizes_4_0, grammarAccess.getNN_MultilayerPerceptronAccess().getHidden_layer_sizesLeftParenthesisKeyword_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						setWithLastConsumed($current, "hidden_layer_sizes", lv_hidden_layer_sizes_4_0, "(");
					}
				)
			)
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getNN_MultilayerPerceptronAccess().getHidden_layersIntegerLiteralParserRuleCall_3_2_0_0());
						}
						lv_hidden_layers_5_0=ruleIntegerLiteral
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getNN_MultilayerPerceptronRule());
							}
							add(
								$current,
								"hidden_layers",
								lv_hidden_layers_5_0,
								"org.thingml.xtext.ThingML.IntegerLiteral");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_6=','
					{
						newLeafNode(otherlv_6, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_3_2_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getNN_MultilayerPerceptronAccess().getHidden_layersIntegerLiteralParserRuleCall_3_2_1_1_0());
							}
							lv_hidden_layers_7_0=ruleIntegerLiteral
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getNN_MultilayerPerceptronRule());
								}
								add(
									$current,
									"hidden_layers",
									lv_hidden_layers_7_0,
									"org.thingml.xtext.ThingML.IntegerLiteral");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
			)?
			otherlv_8=')'
			{
				newLeafNode(otherlv_8, grammarAccess.getNN_MultilayerPerceptronAccess().getRightParenthesisKeyword_3_3());
			}
			(
				otherlv_9=','
				{
					newLeafNode(otherlv_9, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_3_4());
				}
			)?
		)?
		(
			otherlv_10='activation'
			{
				newLeafNode(otherlv_10, grammarAccess.getNN_MultilayerPerceptronAccess().getActivationKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNN_MultilayerPerceptronAccess().getActivationActivationEnumRuleCall_4_1_0());
					}
					lv_activation_11_0=ruleActivation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						set(
							$current,
							"activation",
							lv_activation_11_0,
							"org.thingml.xtext.ThingML.Activation");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_12=','
				{
					newLeafNode(otherlv_12, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_4_2());
				}
			)?
		)?
		(
			otherlv_13='optimizer'
			{
				newLeafNode(otherlv_13, grammarAccess.getNN_MultilayerPerceptronAccess().getOptimizerKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNN_MultilayerPerceptronAccess().getOptimizerOptimizerEnumRuleCall_5_1_0());
					}
					lv_optimizer_14_0=ruleOptimizer
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						set(
							$current,
							"optimizer",
							lv_optimizer_14_0,
							"org.thingml.xtext.ThingML.Optimizer");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_15=','
				{
					newLeafNode(otherlv_15, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_5_2());
				}
			)?
		)?
		(
			otherlv_16='alpha'
			{
				newLeafNode(otherlv_16, grammarAccess.getNN_MultilayerPerceptronAccess().getAlphaKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNN_MultilayerPerceptronAccess().getAlphaDoubleLiteralParserRuleCall_6_1_0());
					}
					lv_alpha_17_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						set(
							$current,
							"alpha",
							lv_alpha_17_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_18=','
				{
					newLeafNode(otherlv_18, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_6_2());
				}
			)?
		)?
		(
			otherlv_19='batch_size'
			{
				newLeafNode(otherlv_19, grammarAccess.getNN_MultilayerPerceptronAccess().getBatch_sizeKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNN_MultilayerPerceptronAccess().getBatch_sizeIntegerLiteralParserRuleCall_7_1_0());
					}
					lv_batch_size_20_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						set(
							$current,
							"batch_size",
							lv_batch_size_20_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_21=','
				{
					newLeafNode(otherlv_21, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_7_2());
				}
			)?
		)?
		(
			otherlv_22='learning_rate_mode'
			{
				newLeafNode(otherlv_22, grammarAccess.getNN_MultilayerPerceptronAccess().getLearning_rate_modeKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNN_MultilayerPerceptronAccess().getLearning_rate_modeLearning_rate_modeEnumRuleCall_8_1_0());
					}
					lv_learning_rate_mode_23_0=ruleLearning_rate_mode
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						set(
							$current,
							"learning_rate_mode",
							lv_learning_rate_mode_23_0,
							"org.thingml.xtext.ThingML.Learning_rate_mode");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_24=','
				{
					newLeafNode(otherlv_24, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_8_2());
				}
			)?
		)?
		(
			otherlv_25='learning_rate_init'
			{
				newLeafNode(otherlv_25, grammarAccess.getNN_MultilayerPerceptronAccess().getLearning_rate_initKeyword_9_0());
			}
			(
				(
					lv_learning_rate_init_26_0=RULE_STRING
					{
						newLeafNode(lv_learning_rate_init_26_0, grammarAccess.getNN_MultilayerPerceptronAccess().getLearning_rate_initSTRINGTerminalRuleCall_9_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						setWithLastConsumed(
							$current,
							"learning_rate_init",
							lv_learning_rate_init_26_0,
							"org.thingml.xtext.ThingML.STRING");
					}
				)
			)
			(
				otherlv_27=','
				{
					newLeafNode(otherlv_27, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_9_2());
				}
			)?
		)?
		(
			otherlv_28='power_t'
			{
				newLeafNode(otherlv_28, grammarAccess.getNN_MultilayerPerceptronAccess().getPower_tKeyword_10_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNN_MultilayerPerceptronAccess().getPower_tDoubleLiteralParserRuleCall_10_1_0());
					}
					lv_power_t_29_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						set(
							$current,
							"power_t",
							lv_power_t_29_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_30=','
				{
					newLeafNode(otherlv_30, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_10_2());
				}
			)?
		)?
		(
			otherlv_31='max_iter'
			{
				newLeafNode(otherlv_31, grammarAccess.getNN_MultilayerPerceptronAccess().getMax_iterKeyword_11_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNN_MultilayerPerceptronAccess().getMax_iterIntegerLiteralParserRuleCall_11_1_0());
					}
					lv_max_iter_32_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						set(
							$current,
							"max_iter",
							lv_max_iter_32_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_33=','
				{
					newLeafNode(otherlv_33, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_11_2());
				}
			)?
		)?
		(
			otherlv_34='shuffle'
			{
				newLeafNode(otherlv_34, grammarAccess.getNN_MultilayerPerceptronAccess().getShuffleKeyword_12_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNN_MultilayerPerceptronAccess().getShuffleBooleanLiteralParserRuleCall_12_1_0());
					}
					lv_shuffle_35_0=ruleBooleanLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						set(
							$current,
							"shuffle",
							lv_shuffle_35_0,
							"org.thingml.xtext.ThingML.BooleanLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_36=','
				{
					newLeafNode(otherlv_36, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_12_2());
				}
			)?
		)?
		(
			otherlv_37='random_state'
			{
				newLeafNode(otherlv_37, grammarAccess.getNN_MultilayerPerceptronAccess().getRandom_stateKeyword_13_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNN_MultilayerPerceptronAccess().getRandom_stateIntegerLiteralParserRuleCall_13_1_0());
					}
					lv_random_state_38_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						set(
							$current,
							"random_state",
							lv_random_state_38_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_39=','
				{
					newLeafNode(otherlv_39, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_13_2());
				}
			)?
		)?
		(
			otherlv_40='tol'
			{
				newLeafNode(otherlv_40, grammarAccess.getNN_MultilayerPerceptronAccess().getTolKeyword_14_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNN_MultilayerPerceptronAccess().getTolDoubleLiteralParserRuleCall_14_1_0());
					}
					lv_tol_41_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						set(
							$current,
							"tol",
							lv_tol_41_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_42=','
				{
					newLeafNode(otherlv_42, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_14_2());
				}
			)?
		)?
		(
			otherlv_43='verbose'
			{
				newLeafNode(otherlv_43, grammarAccess.getNN_MultilayerPerceptronAccess().getVerboseKeyword_15_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNN_MultilayerPerceptronAccess().getVerboseBooleanLiteralParserRuleCall_15_1_0());
					}
					lv_verbose_44_0=ruleBooleanLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						set(
							$current,
							"verbose",
							lv_verbose_44_0,
							"org.thingml.xtext.ThingML.BooleanLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_45=','
				{
					newLeafNode(otherlv_45, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_15_2());
				}
			)?
		)?
		(
			otherlv_46='warm_start'
			{
				newLeafNode(otherlv_46, grammarAccess.getNN_MultilayerPerceptronAccess().getWarm_startKeyword_16_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNN_MultilayerPerceptronAccess().getWarm_startBooleanLiteralParserRuleCall_16_1_0());
					}
					lv_warm_start_47_0=ruleBooleanLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						set(
							$current,
							"warm_start",
							lv_warm_start_47_0,
							"org.thingml.xtext.ThingML.BooleanLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_48=','
				{
					newLeafNode(otherlv_48, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_16_2());
				}
			)?
		)?
		(
			otherlv_49='momentum'
			{
				newLeafNode(otherlv_49, grammarAccess.getNN_MultilayerPerceptronAccess().getMomentumKeyword_17_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNN_MultilayerPerceptronAccess().getMomentumDoubleLiteralParserRuleCall_17_1_0());
					}
					lv_momentum_50_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						set(
							$current,
							"momentum",
							lv_momentum_50_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_51=','
				{
					newLeafNode(otherlv_51, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_17_2());
				}
			)?
		)?
		(
			otherlv_52='nesterovs_momentum'
			{
				newLeafNode(otherlv_52, grammarAccess.getNN_MultilayerPerceptronAccess().getNesterovs_momentumKeyword_18_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNN_MultilayerPerceptronAccess().getNesterovs_momentumBooleanLiteralParserRuleCall_18_1_0());
					}
					lv_nesterovs_momentum_53_0=ruleBooleanLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						set(
							$current,
							"nesterovs_momentum",
							lv_nesterovs_momentum_53_0,
							"org.thingml.xtext.ThingML.BooleanLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_54=','
				{
					newLeafNode(otherlv_54, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_18_2());
				}
			)?
		)?
		(
			otherlv_55='early_stopping'
			{
				newLeafNode(otherlv_55, grammarAccess.getNN_MultilayerPerceptronAccess().getEarly_stoppingKeyword_19_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNN_MultilayerPerceptronAccess().getEarly_stoppingBooleanLiteralParserRuleCall_19_1_0());
					}
					lv_early_stopping_56_0=ruleBooleanLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						set(
							$current,
							"early_stopping",
							lv_early_stopping_56_0,
							"org.thingml.xtext.ThingML.BooleanLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_57=','
				{
					newLeafNode(otherlv_57, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_19_2());
				}
			)?
		)?
		(
			otherlv_58='validation_fraction'
			{
				newLeafNode(otherlv_58, grammarAccess.getNN_MultilayerPerceptronAccess().getValidation_fractionKeyword_20_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNN_MultilayerPerceptronAccess().getValidation_fractionDoubleLiteralParserRuleCall_20_1_0());
					}
					lv_validation_fraction_59_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						set(
							$current,
							"validation_fraction",
							lv_validation_fraction_59_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_60=','
				{
					newLeafNode(otherlv_60, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_20_2());
				}
			)?
		)?
		(
			otherlv_61='beta_1'
			{
				newLeafNode(otherlv_61, grammarAccess.getNN_MultilayerPerceptronAccess().getBeta_1Keyword_21_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNN_MultilayerPerceptronAccess().getBeta_1DoubleLiteralParserRuleCall_21_1_0());
					}
					lv_beta_1_62_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						set(
							$current,
							"beta_1",
							lv_beta_1_62_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_63=','
				{
					newLeafNode(otherlv_63, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_21_2());
				}
			)?
		)?
		(
			otherlv_64='beta_2'
			{
				newLeafNode(otherlv_64, grammarAccess.getNN_MultilayerPerceptronAccess().getBeta_2Keyword_22_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNN_MultilayerPerceptronAccess().getBeta_2DoubleLiteralParserRuleCall_22_1_0());
					}
					lv_beta_2_65_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						set(
							$current,
							"beta_2",
							lv_beta_2_65_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_66=','
				{
					newLeafNode(otherlv_66, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_22_2());
				}
			)?
		)?
		(
			otherlv_67='epsilon'
			{
				newLeafNode(otherlv_67, grammarAccess.getNN_MultilayerPerceptronAccess().getEpsilonKeyword_23_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNN_MultilayerPerceptronAccess().getEpsilonDoubleLiteralParserRuleCall_23_1_0());
					}
					lv_epsilon_68_0=ruleDoubleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						set(
							$current,
							"epsilon",
							lv_epsilon_68_0,
							"org.thingml.xtext.ThingML.DoubleLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_69=','
				{
					newLeafNode(otherlv_69, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_23_2());
				}
			)?
		)?
		(
			otherlv_70='n_iter_no_change'
			{
				newLeafNode(otherlv_70, grammarAccess.getNN_MultilayerPerceptronAccess().getN_iter_no_changeKeyword_24_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNN_MultilayerPerceptronAccess().getN_iter_no_changeIntegerLiteralParserRuleCall_24_1_0());
					}
					lv_n_iter_no_change_71_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						set(
							$current,
							"n_iter_no_change",
							lv_n_iter_no_change_71_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_72=','
				{
					newLeafNode(otherlv_72, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_24_2());
				}
			)?
		)?
		(
			otherlv_73='max_fun'
			{
				newLeafNode(otherlv_73, grammarAccess.getNN_MultilayerPerceptronAccess().getMax_funKeyword_25_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNN_MultilayerPerceptronAccess().getMax_funIntegerLiteralParserRuleCall_25_1_0());
					}
					lv_max_fun_74_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						set(
							$current,
							"max_fun",
							lv_max_fun_74_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_75=','
				{
					newLeafNode(otherlv_75, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_25_2());
				}
			)?
		)?
		(
			otherlv_76='loss'
			{
				newLeafNode(otherlv_76, grammarAccess.getNN_MultilayerPerceptronAccess().getLossKeyword_26_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNN_MultilayerPerceptronAccess().getLossLossEnumRuleCall_26_1_0());
					}
					lv_loss_77_0=ruleLoss
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						set(
							$current,
							"loss",
							lv_loss_77_0,
							"org.thingml.xtext.ThingML.Loss");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_78=','
				{
					newLeafNode(otherlv_78, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_26_2());
				}
			)?
		)?
		(
			otherlv_79='epochs'
			{
				newLeafNode(otherlv_79, grammarAccess.getNN_MultilayerPerceptronAccess().getEpochsKeyword_27_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNN_MultilayerPerceptronAccess().getEpochsIntegerLiteralParserRuleCall_27_1_0());
					}
					lv_epochs_80_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						set(
							$current,
							"epochs",
							lv_epochs_80_0,
							"org.thingml.xtext.ThingML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_81=','
				{
					newLeafNode(otherlv_81, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_27_2());
				}
			)?
		)?
		otherlv_82=')'
		{
			newLeafNode(otherlv_82, grammarAccess.getNN_MultilayerPerceptronAccess().getRightParenthesisKeyword_28());
		}
	)
;

// Entry rule entryRuleEvent
entryRuleEvent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEventRule()); }
	iv_ruleEvent=ruleEvent
	{ $current=$iv_ruleEvent.current; }
	EOF;

// Rule Event
ruleEvent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getEventAccess().getReceiveMessageParserRuleCall());
	}
	this_ReceiveMessage_0=ruleReceiveMessage
	{
		$current = $this_ReceiveMessage_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleReceiveMessage
entryRuleReceiveMessage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReceiveMessageRule()); }
	iv_ruleReceiveMessage=ruleReceiveMessage
	{ $current=$iv_ruleReceiveMessage.current; }
	EOF;

// Rule ReceiveMessage
ruleReceiveMessage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_name_0_0=RULE_ID
					{
						newLeafNode(lv_name_0_0, grammarAccess.getReceiveMessageAccess().getNameIDTerminalRuleCall_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getReceiveMessageRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_0_0,
							"org.thingml.xtext.ThingML.ID");
					}
				)
			)
			otherlv_1=':'
			{
				newLeafNode(otherlv_1, grammarAccess.getReceiveMessageAccess().getColonKeyword_0_1());
			}
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReceiveMessageRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getReceiveMessageAccess().getPortPortCrossReference_1_0());
				}
			)
		)
		otherlv_3='?'
		{
			newLeafNode(otherlv_3, grammarAccess.getReceiveMessageAccess().getQuestionMarkKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReceiveMessageRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getReceiveMessageAccess().getMessageMessageCrossReference_3_0());
				}
			)
		)
	)
;

// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	iv_ruleAction=ruleAction
	{ $current=$iv_ruleAction.current; }
	EOF;

// Rule Action
ruleAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getActionAccess().getActionBlockParserRuleCall_0());
		}
		this_ActionBlock_0=ruleActionBlock
		{
			$current = $this_ActionBlock_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getExternStatementParserRuleCall_1());
		}
		this_ExternStatement_1=ruleExternStatement
		{
			$current = $this_ExternStatement_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getSendActionParserRuleCall_2());
		}
		this_SendAction_2=ruleSendAction
		{
			$current = $this_SendAction_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getVariableAssignmentParserRuleCall_3());
		}
		this_VariableAssignment_3=ruleVariableAssignment
		{
			$current = $this_VariableAssignment_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getIncrementParserRuleCall_4());
		}
		this_Increment_4=ruleIncrement
		{
			$current = $this_Increment_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getDecrementParserRuleCall_5());
		}
		this_Decrement_5=ruleDecrement
		{
			$current = $this_Decrement_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getLoopActionParserRuleCall_6());
		}
		this_LoopAction_6=ruleLoopAction
		{
			$current = $this_LoopAction_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getForActionParserRuleCall_7());
		}
		this_ForAction_7=ruleForAction
		{
			$current = $this_ForAction_7.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getConditionalActionParserRuleCall_8());
		}
		this_ConditionalAction_8=ruleConditionalAction
		{
			$current = $this_ConditionalAction_8.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getReturnActionParserRuleCall_9());
		}
		this_ReturnAction_9=ruleReturnAction
		{
			$current = $this_ReturnAction_9.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getPrintActionParserRuleCall_10());
		}
		this_PrintAction_10=rulePrintAction
		{
			$current = $this_PrintAction_10.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getErrorActionParserRuleCall_11());
		}
		this_ErrorAction_11=ruleErrorAction
		{
			$current = $this_ErrorAction_11.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getStartSessionParserRuleCall_12());
		}
		this_StartSession_12=ruleStartSession
		{
			$current = $this_StartSession_12.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getFunctionCallStatementParserRuleCall_13());
		}
		this_FunctionCallStatement_13=ruleFunctionCallStatement
		{
			$current = $this_FunctionCallStatement_13.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getLocalVariableParserRuleCall_14());
		}
		this_LocalVariable_14=ruleLocalVariable
		{
			$current = $this_LocalVariable_14.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getDASaveActionParserRuleCall_15());
		}
		this_DASaveAction_15=ruleDASaveAction
		{
			$current = $this_DASaveAction_15.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getDAPreprocessActionParserRuleCall_16());
		}
		this_DAPreprocessAction_16=ruleDAPreprocessAction
		{
			$current = $this_DAPreprocessAction_16.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getDATrainActionParserRuleCall_17());
		}
		this_DATrainAction_17=ruleDATrainAction
		{
			$current = $this_DATrainAction_17.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getDAPredictActionParserRuleCall_18());
		}
		this_DAPredictAction_18=ruleDAPredictAction
		{
			$current = $this_DAPredictAction_18.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleActionBlock
entryRuleActionBlock returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionBlockRule()); }
	iv_ruleActionBlock=ruleActionBlock
	{ $current=$iv_ruleActionBlock.current; }
	EOF;

// Rule ActionBlock
ruleActionBlock returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getActionBlockAccess().getActionBlockAction_0(),
					$current);
			}
		)
		otherlv_1='do'
		{
			newLeafNode(otherlv_1, grammarAccess.getActionBlockAccess().getDoKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getActionBlockAccess().getActionsActionParserRuleCall_2_0());
				}
				lv_actions_2_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActionBlockRule());
					}
					add(
						$current,
						"actions",
						lv_actions_2_0,
						"org.thingml.xtext.ThingML.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='end'
		{
			newLeafNode(otherlv_3, grammarAccess.getActionBlockAccess().getEndKeyword_3());
		}
	)
;

// Entry rule entryRuleExternStatement
entryRuleExternStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExternStatementRule()); }
	iv_ruleExternStatement=ruleExternStatement
	{ $current=$iv_ruleExternStatement.current; }
	EOF;

// Rule ExternStatement
ruleExternStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_statement_0_0=RULE_EXTERN
				{
					newLeafNode(lv_statement_0_0, grammarAccess.getExternStatementAccess().getStatementEXTERNTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExternStatementRule());
					}
					setWithLastConsumed(
						$current,
						"statement",
						lv_statement_0_0,
						"org.thingml.xtext.ThingML.EXTERN");
				}
			)
		)
		(
			otherlv_1='&'
			{
				newLeafNode(otherlv_1, grammarAccess.getExternStatementAccess().getAmpersandKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExternStatementAccess().getSegmentsExpressionParserRuleCall_1_1_0());
					}
					lv_segments_2_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExternStatementRule());
						}
						add(
							$current,
							"segments",
							lv_segments_2_0,
							"org.thingml.xtext.ThingML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleLocalVariable
entryRuleLocalVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLocalVariableRule()); }
	iv_ruleLocalVariable=ruleLocalVariable
	{ $current=$iv_ruleLocalVariable.current; }
	EOF;

// Rule LocalVariable
ruleLocalVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_readonly_0_0='readonly'
				{
					newLeafNode(lv_readonly_0_0, grammarAccess.getLocalVariableAccess().getReadonlyReadonlyKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLocalVariableRule());
					}
					setWithLastConsumed($current, "readonly", true, "readonly");
				}
			)
		)?
		otherlv_1='var'
		{
			newLeafNode(otherlv_1, grammarAccess.getLocalVariableAccess().getVarKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getLocalVariableAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLocalVariableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getLocalVariableAccess().getColonKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLocalVariableAccess().getTypeRefTypeRefParserRuleCall_4_0());
				}
				lv_typeRef_4_0=ruleTypeRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLocalVariableRule());
					}
					set(
						$current,
						"typeRef",
						lv_typeRef_4_0,
						"org.thingml.xtext.ThingML.TypeRef");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5='='
			{
				newLeafNode(otherlv_5, grammarAccess.getLocalVariableAccess().getEqualsSignKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLocalVariableAccess().getInitExpressionParserRuleCall_5_1_0());
					}
					lv_init_6_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLocalVariableRule());
						}
						set(
							$current,
							"init",
							lv_init_6_0,
							"org.thingml.xtext.ThingML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getLocalVariableAccess().getAnnotationsPlatformAnnotationParserRuleCall_6_0());
				}
				lv_annotations_7_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLocalVariableRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_7_0,
						"org.thingml.xtext.ThingML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleSendAction
entryRuleSendAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSendActionRule()); }
	iv_ruleSendAction=ruleSendAction
	{ $current=$iv_ruleSendAction.current; }
	EOF;

// Rule SendAction
ruleSendAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSendActionRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getSendActionAccess().getPortPortCrossReference_0_0());
				}
			)
		)
		otherlv_1='!'
		{
			newLeafNode(otherlv_1, grammarAccess.getSendActionAccess().getExclamationMarkKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSendActionRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getSendActionAccess().getMessageMessageCrossReference_2_0());
				}
			)
		)
		otherlv_3='('
		{
			newLeafNode(otherlv_3, grammarAccess.getSendActionAccess().getLeftParenthesisKeyword_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getSendActionAccess().getParametersExpressionParserRuleCall_4_0_0());
					}
					lv_parameters_4_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSendActionRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_4_0,
							"org.thingml.xtext.ThingML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getSendActionAccess().getCommaKeyword_4_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSendActionAccess().getParametersExpressionParserRuleCall_4_1_1_0());
						}
						lv_parameters_6_0=ruleExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSendActionRule());
							}
							add(
								$current,
								"parameters",
								lv_parameters_6_0,
								"org.thingml.xtext.ThingML.Expression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_7=')'
		{
			newLeafNode(otherlv_7, grammarAccess.getSendActionAccess().getRightParenthesisKeyword_5());
		}
	)
;

// Entry rule entryRuleVariableAssignment
entryRuleVariableAssignment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableAssignmentRule()); }
	iv_ruleVariableAssignment=ruleVariableAssignment
	{ $current=$iv_ruleVariableAssignment.current; }
	EOF;

// Rule VariableAssignment
ruleVariableAssignment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableAssignmentRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getVariableAssignmentAccess().getPropertyVariableCrossReference_0_0());
				}
			)
		)
		(
			(
				('[')=>
				otherlv_1='['
				{
					newLeafNode(otherlv_1, grammarAccess.getVariableAssignmentAccess().getLeftSquareBracketKeyword_1_0());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getVariableAssignmentAccess().getIndexExpressionParserRuleCall_1_1_0());
					}
					lv_index_2_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVariableAssignmentRule());
						}
						set(
							$current,
							"index",
							lv_index_2_0,
							"org.thingml.xtext.ThingML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3=']'
			{
				newLeafNode(otherlv_3, grammarAccess.getVariableAssignmentAccess().getRightSquareBracketKeyword_1_2());
			}
		)?
		otherlv_4='='
		{
			newLeafNode(otherlv_4, grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVariableAssignmentAccess().getExpressionExpressionParserRuleCall_3_0());
				}
				lv_expression_5_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariableAssignmentRule());
					}
					set(
						$current,
						"expression",
						lv_expression_5_0,
						"org.thingml.xtext.ThingML.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleIncrement
entryRuleIncrement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIncrementRule()); }
	iv_ruleIncrement=ruleIncrement
	{ $current=$iv_ruleIncrement.current; }
	EOF;

// Rule Increment
ruleIncrement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIncrementRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getIncrementAccess().getVarVariableCrossReference_0_0());
				}
			)
		)
		otherlv_1='++'
		{
			newLeafNode(otherlv_1, grammarAccess.getIncrementAccess().getPlusSignPlusSignKeyword_1());
		}
	)
;

// Entry rule entryRuleDecrement
entryRuleDecrement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDecrementRule()); }
	iv_ruleDecrement=ruleDecrement
	{ $current=$iv_ruleDecrement.current; }
	EOF;

// Rule Decrement
ruleDecrement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDecrementRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getDecrementAccess().getVarVariableCrossReference_0_0());
				}
			)
		)
		otherlv_1='--'
		{
			newLeafNode(otherlv_1, grammarAccess.getDecrementAccess().getHyphenMinusHyphenMinusKeyword_1());
		}
	)
;

// Entry rule entryRuleForAction
entryRuleForAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getForActionRule()); }
	iv_ruleForAction=ruleForAction
	{ $current=$iv_ruleForAction.current; }
	EOF;

// Rule ForAction
ruleForAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='for'
		{
			newLeafNode(otherlv_0, grammarAccess.getForActionAccess().getForKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getForActionAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForActionAccess().getVariableParameterParserRuleCall_2_0());
				}
				lv_variable_2_0=ruleParameter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForActionRule());
					}
					set(
						$current,
						"variable",
						lv_variable_2_0,
						"org.thingml.xtext.ThingML.Parameter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getForActionAccess().getCommaKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getForActionAccess().getIndexParameterParserRuleCall_3_1_0());
					}
					lv_index_4_0=ruleParameter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getForActionRule());
						}
						set(
							$current,
							"index",
							lv_index_4_0,
							"org.thingml.xtext.ThingML.Parameter");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_5='in'
		{
			newLeafNode(otherlv_5, grammarAccess.getForActionAccess().getInKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForActionAccess().getArrayPropertyReferenceParserRuleCall_5_0());
				}
				lv_array_6_0=rulePropertyReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForActionRule());
					}
					set(
						$current,
						"array",
						lv_array_6_0,
						"org.thingml.xtext.ThingML.PropertyReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7=')'
		{
			newLeafNode(otherlv_7, grammarAccess.getForActionAccess().getRightParenthesisKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForActionAccess().getActionActionParserRuleCall_7_0());
				}
				lv_action_8_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForActionRule());
					}
					set(
						$current,
						"action",
						lv_action_8_0,
						"org.thingml.xtext.ThingML.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleLoopAction
entryRuleLoopAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLoopActionRule()); }
	iv_ruleLoopAction=ruleLoopAction
	{ $current=$iv_ruleLoopAction.current; }
	EOF;

// Rule LoopAction
ruleLoopAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='while'
		{
			newLeafNode(otherlv_0, grammarAccess.getLoopActionAccess().getWhileKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getLoopActionAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLoopActionAccess().getConditionExpressionParserRuleCall_2_0());
				}
				lv_condition_2_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLoopActionRule());
					}
					set(
						$current,
						"condition",
						lv_condition_2_0,
						"org.thingml.xtext.ThingML.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getLoopActionAccess().getRightParenthesisKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLoopActionAccess().getActionActionParserRuleCall_4_0());
				}
				lv_action_4_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLoopActionRule());
					}
					set(
						$current,
						"action",
						lv_action_4_0,
						"org.thingml.xtext.ThingML.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleConditionalAction
entryRuleConditionalAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionalActionRule()); }
	iv_ruleConditionalAction=ruleConditionalAction
	{ $current=$iv_ruleConditionalAction.current; }
	EOF;

// Rule ConditionalAction
ruleConditionalAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='if'
		{
			newLeafNode(otherlv_0, grammarAccess.getConditionalActionAccess().getIfKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getConditionalActionAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConditionalActionAccess().getConditionExpressionParserRuleCall_2_0());
				}
				lv_condition_2_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConditionalActionRule());
					}
					set(
						$current,
						"condition",
						lv_condition_2_0,
						"org.thingml.xtext.ThingML.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getConditionalActionAccess().getRightParenthesisKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConditionalActionAccess().getActionActionParserRuleCall_4_0());
				}
				lv_action_4_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConditionalActionRule());
					}
					set(
						$current,
						"action",
						lv_action_4_0,
						"org.thingml.xtext.ThingML.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				('else')=>
				otherlv_5='else'
				{
					newLeafNode(otherlv_5, grammarAccess.getConditionalActionAccess().getElseKeyword_5_0());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getConditionalActionAccess().getElseActionActionParserRuleCall_5_1_0());
					}
					lv_elseAction_6_0=ruleAction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConditionalActionRule());
						}
						set(
							$current,
							"elseAction",
							lv_elseAction_6_0,
							"org.thingml.xtext.ThingML.Action");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleReturnAction
entryRuleReturnAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReturnActionRule()); }
	iv_ruleReturnAction=ruleReturnAction
	{ $current=$iv_ruleReturnAction.current; }
	EOF;

// Rule ReturnAction
ruleReturnAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getReturnActionAccess().getReturnActionAction_0(),
					$current);
			}
		)
		otherlv_1='return'
		{
			newLeafNode(otherlv_1, grammarAccess.getReturnActionAccess().getReturnKeyword_1());
		}
		(
			((
				ruleExpression
			)
			)=>
			(
				{
					newCompositeNode(grammarAccess.getReturnActionAccess().getExpExpressionParserRuleCall_2_0());
				}
				lv_exp_2_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReturnActionRule());
					}
					set(
						$current,
						"exp",
						lv_exp_2_0,
						"org.thingml.xtext.ThingML.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRulePrintAction
entryRulePrintAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrintActionRule()); }
	iv_rulePrintAction=rulePrintAction
	{ $current=$iv_rulePrintAction.current; }
	EOF;

// Rule PrintAction
rulePrintAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='print'
			{
				newLeafNode(otherlv_0, grammarAccess.getPrintActionAccess().getPrintKeyword_0_0());
			}
			    |
			(
				(
					lv_line_1_0='println'
					{
						newLeafNode(lv_line_1_0, grammarAccess.getPrintActionAccess().getLinePrintlnKeyword_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPrintActionRule());
						}
						setWithLastConsumed($current, "line", true, "println");
					}
				)
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPrintActionAccess().getMsgExpressionParserRuleCall_1_0());
				}
				lv_msg_2_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPrintActionRule());
					}
					add(
						$current,
						"msg",
						lv_msg_2_0,
						"org.thingml.xtext.ThingML.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getPrintActionAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPrintActionAccess().getMsgExpressionParserRuleCall_2_1_0());
					}
					lv_msg_4_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPrintActionRule());
						}
						add(
							$current,
							"msg",
							lv_msg_4_0,
							"org.thingml.xtext.ThingML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleErrorAction
entryRuleErrorAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getErrorActionRule()); }
	iv_ruleErrorAction=ruleErrorAction
	{ $current=$iv_ruleErrorAction.current; }
	EOF;

// Rule ErrorAction
ruleErrorAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='error'
			{
				newLeafNode(otherlv_0, grammarAccess.getErrorActionAccess().getErrorKeyword_0_0());
			}
			    |
			(
				(
					lv_line_1_0='errorln'
					{
						newLeafNode(lv_line_1_0, grammarAccess.getErrorActionAccess().getLineErrorlnKeyword_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getErrorActionRule());
						}
						setWithLastConsumed($current, "line", true, "errorln");
					}
				)
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getErrorActionAccess().getMsgExpressionParserRuleCall_1_0());
				}
				lv_msg_2_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getErrorActionRule());
					}
					add(
						$current,
						"msg",
						lv_msg_2_0,
						"org.thingml.xtext.ThingML.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getErrorActionAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getErrorActionAccess().getMsgExpressionParserRuleCall_2_1_0());
					}
					lv_msg_4_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getErrorActionRule());
						}
						add(
							$current,
							"msg",
							lv_msg_4_0,
							"org.thingml.xtext.ThingML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleStartSession
entryRuleStartSession returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStartSessionRule()); }
	iv_ruleStartSession=ruleStartSession
	{ $current=$iv_ruleStartSession.current; }
	EOF;

// Rule StartSession
ruleStartSession returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='fork'
		{
			newLeafNode(otherlv_0, grammarAccess.getStartSessionAccess().getForkKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStartSessionRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getStartSessionAccess().getSessionSessionCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRuleFunctionCallStatement
entryRuleFunctionCallStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionCallStatementRule()); }
	iv_ruleFunctionCallStatement=ruleFunctionCallStatement
	{ $current=$iv_ruleFunctionCallStatement.current; }
	EOF;

// Rule FunctionCallStatement
ruleFunctionCallStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunctionCallStatementRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getFunctionCallStatementAccess().getFunctionFunctionCrossReference_0_0());
				}
			)
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getFunctionCallStatementAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getFunctionCallStatementAccess().getParametersExpressionParserRuleCall_2_0_0());
					}
					lv_parameters_2_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunctionCallStatementRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_2_0,
							"org.thingml.xtext.ThingML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=','
				{
					newLeafNode(otherlv_3, grammarAccess.getFunctionCallStatementAccess().getCommaKeyword_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getFunctionCallStatementAccess().getParametersExpressionParserRuleCall_2_1_1_0());
						}
						lv_parameters_4_0=ruleExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFunctionCallStatementRule());
							}
							add(
								$current,
								"parameters",
								lv_parameters_4_0,
								"org.thingml.xtext.ThingML.Expression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getFunctionCallStatementAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleDASaveAction
entryRuleDASaveAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDASaveActionRule()); }
	iv_ruleDASaveAction=ruleDASaveAction
	{ $current=$iv_ruleDASaveAction.current; }
	EOF;

// Rule DASaveAction
ruleDASaveAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='da_save'
		{
			newLeafNode(otherlv_0, grammarAccess.getDASaveActionAccess().getDa_saveKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDASaveActionRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getDASaveActionAccess().getDataAnalyticsDataAnalyticsCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRuleDAPreprocessAction
entryRuleDAPreprocessAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDAPreprocessActionRule()); }
	iv_ruleDAPreprocessAction=ruleDAPreprocessAction
	{ $current=$iv_ruleDAPreprocessAction.current; }
	EOF;

// Rule DAPreprocessAction
ruleDAPreprocessAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='da_preprocess'
		{
			newLeafNode(otherlv_0, grammarAccess.getDAPreprocessActionAccess().getDa_preprocessKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDAPreprocessActionRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getDAPreprocessActionAccess().getDataAnalyticsDataAnalyticsCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRuleDATrainAction
entryRuleDATrainAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDATrainActionRule()); }
	iv_ruleDATrainAction=ruleDATrainAction
	{ $current=$iv_ruleDATrainAction.current; }
	EOF;

// Rule DATrainAction
ruleDATrainAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='da_train'
		{
			newLeafNode(otherlv_0, grammarAccess.getDATrainActionAccess().getDa_trainKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDATrainActionRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getDATrainActionAccess().getDataAnalyticsDataAnalyticsCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRuleDAPredictAction
entryRuleDAPredictAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDAPredictActionRule()); }
	iv_ruleDAPredictAction=ruleDAPredictAction
	{ $current=$iv_ruleDAPredictAction.current; }
	EOF;

// Rule DAPredictAction
ruleDAPredictAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='da_predict'
		{
			newLeafNode(otherlv_0, grammarAccess.getDAPredictActionAccess().getDa_predictKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDAPredictActionRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getDAPredictActionAccess().getDataAnalyticsDataAnalyticsCrossReference_1_0());
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getDAPredictActionAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDAPredictActionRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getDAPredictActionAccess().getFeaturesPropertyCrossReference_3_0());
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getDAPredictActionAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDAPredictActionRule());
						}
					}
					otherlv_5=RULE_ID
					{
						newLeafNode(otherlv_5, grammarAccess.getDAPredictActionAccess().getFeaturesPropertyCrossReference_4_1_0());
					}
				)
			)
		)*
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getDAPredictActionAccess().getRightParenthesisKeyword_5());
		}
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall());
	}
	this_OrExpression_0=ruleOrExpression
	{
		$current = $this_OrExpression_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleOrExpression
entryRuleOrExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOrExpressionRule()); }
	iv_ruleOrExpression=ruleOrExpression
	{ $current=$iv_ruleOrExpression.current; }
	EOF;

// Rule OrExpression
ruleOrExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
		}
		this_AndExpression_0=ruleAndExpression
		{
			$current = $this_AndExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getOrExpressionAccess().getOrExpressionLhsAction_1_0(),
						$current);
				}
			)
			otherlv_2='or'
			{
				newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getOrKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOrExpressionAccess().getRhsAndExpressionParserRuleCall_1_2_0());
					}
					lv_rhs_3_0=ruleAndExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOrExpressionRule());
						}
						set(
							$current,
							"rhs",
							lv_rhs_3_0,
							"org.thingml.xtext.ThingML.AndExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAndExpression
entryRuleAndExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAndExpressionRule()); }
	iv_ruleAndExpression=ruleAndExpression
	{ $current=$iv_ruleAndExpression.current; }
	EOF;

// Rule AndExpression
ruleAndExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityParserRuleCall_0());
		}
		this_Equality_0=ruleEquality
		{
			$current = $this_Equality_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAndExpressionAccess().getAndExpressionLhsAction_1_0(),
						$current);
				}
			)
			otherlv_2='and'
			{
				newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAndKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAndExpressionAccess().getRhsEqualityParserRuleCall_1_2_0());
					}
					lv_rhs_3_0=ruleEquality
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAndExpressionRule());
						}
						set(
							$current,
							"rhs",
							lv_rhs_3_0,
							"org.thingml.xtext.ThingML.Equality");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleEquality
entryRuleEquality returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEqualityRule()); }
	iv_ruleEquality=ruleEquality
	{ $current=$iv_ruleEquality.current; }
	EOF;

// Rule Equality
ruleEquality returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getEqualityAccess().getComparaisonParserRuleCall_0());
		}
		this_Comparaison_0=ruleComparaison
		{
			$current = $this_Comparaison_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getEqualityAccess().getEqualsExpressionLhsAction_1_0_0(),
							$current);
					}
				)
				otherlv_2='=='
				{
					newLeafNode(otherlv_2, grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getEqualityAccess().getRhsComparaisonParserRuleCall_1_0_2_0());
						}
						lv_rhs_3_0=ruleComparaison
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getEqualityRule());
							}
							set(
								$current,
								"rhs",
								lv_rhs_3_0,
								"org.thingml.xtext.ThingML.Comparaison");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getEqualityAccess().getNotEqualsExpressionLhsAction_1_1_0(),
							$current);
					}
				)
				otherlv_5='!='
				{
					newLeafNode(otherlv_5, grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_1_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getEqualityAccess().getRhsComparaisonParserRuleCall_1_1_2_0());
						}
						lv_rhs_6_0=ruleComparaison
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getEqualityRule());
							}
							set(
								$current,
								"rhs",
								lv_rhs_6_0,
								"org.thingml.xtext.ThingML.Comparaison");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)*
	)
;

// Entry rule entryRuleComparaison
entryRuleComparaison returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComparaisonRule()); }
	iv_ruleComparaison=ruleComparaison
	{ $current=$iv_ruleComparaison.current; }
	EOF;

// Rule Comparaison
ruleComparaison returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getComparaisonAccess().getAdditionParserRuleCall_0());
		}
		this_Addition_0=ruleAddition
		{
			$current = $this_Addition_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getComparaisonAccess().getGreaterExpressionLhsAction_1_0_0(),
							$current);
					}
				)
				otherlv_2='>'
				{
					newLeafNode(otherlv_2, grammarAccess.getComparaisonAccess().getGreaterThanSignKeyword_1_0_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getComparaisonAccess().getRhsAdditionParserRuleCall_1_0_2_0());
						}
						lv_rhs_3_0=ruleAddition
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getComparaisonRule());
							}
							set(
								$current,
								"rhs",
								lv_rhs_3_0,
								"org.thingml.xtext.ThingML.Addition");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getComparaisonAccess().getLowerExpressionLhsAction_1_1_0(),
							$current);
					}
				)
				otherlv_5='<'
				{
					newLeafNode(otherlv_5, grammarAccess.getComparaisonAccess().getLessThanSignKeyword_1_1_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getComparaisonAccess().getRhsAdditionParserRuleCall_1_1_2_0());
						}
						lv_rhs_6_0=ruleAddition
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getComparaisonRule());
							}
							set(
								$current,
								"rhs",
								lv_rhs_6_0,
								"org.thingml.xtext.ThingML.Addition");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getComparaisonAccess().getGreaterOrEqualExpressionLhsAction_1_2_0(),
							$current);
					}
				)
				otherlv_8='>='
				{
					newLeafNode(otherlv_8, grammarAccess.getComparaisonAccess().getGreaterThanSignEqualsSignKeyword_1_2_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getComparaisonAccess().getRhsAdditionParserRuleCall_1_2_2_0());
						}
						lv_rhs_9_0=ruleAddition
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getComparaisonRule());
							}
							set(
								$current,
								"rhs",
								lv_rhs_9_0,
								"org.thingml.xtext.ThingML.Addition");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getComparaisonAccess().getLowerOrEqualExpressionLhsAction_1_3_0(),
							$current);
					}
				)
				otherlv_11='<='
				{
					newLeafNode(otherlv_11, grammarAccess.getComparaisonAccess().getLessThanSignEqualsSignKeyword_1_3_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getComparaisonAccess().getRhsAdditionParserRuleCall_1_3_2_0());
						}
						lv_rhs_12_0=ruleAddition
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getComparaisonRule());
							}
							set(
								$current,
								"rhs",
								lv_rhs_12_0,
								"org.thingml.xtext.ThingML.Addition");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)*
	)
;

// Entry rule entryRuleAddition
entryRuleAddition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAdditionRule()); }
	iv_ruleAddition=ruleAddition
	{ $current=$iv_ruleAddition.current; }
	EOF;

// Rule Addition
ruleAddition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
		}
		this_Multiplication_0=ruleMultiplication
		{
			$current = $this_Multiplication_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getAdditionAccess().getPlusExpressionLhsAction_1_0_0(),
							$current);
					}
				)
				otherlv_2='+'
				{
					newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getAdditionAccess().getRhsMultiplicationParserRuleCall_1_0_2_0());
						}
						lv_rhs_3_0=ruleMultiplication
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAdditionRule());
							}
							set(
								$current,
								"rhs",
								lv_rhs_3_0,
								"org.thingml.xtext.ThingML.Multiplication");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getAdditionAccess().getMinusExpressionLhsAction_1_1_0(),
							$current);
					}
				)
				otherlv_5='-'
				{
					newLeafNode(otherlv_5, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_1_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getAdditionAccess().getRhsMultiplicationParserRuleCall_1_1_2_0());
						}
						lv_rhs_6_0=ruleMultiplication
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAdditionRule());
							}
							set(
								$current,
								"rhs",
								lv_rhs_6_0,
								"org.thingml.xtext.ThingML.Multiplication");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)*
	)
;

// Entry rule entryRuleMultiplication
entryRuleMultiplication returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiplicationRule()); }
	iv_ruleMultiplication=ruleMultiplication
	{ $current=$iv_ruleMultiplication.current; }
	EOF;

// Rule Multiplication
ruleMultiplication returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMultiplicationAccess().getCastExpressionParserRuleCall_0());
		}
		this_CastExpression_0=ruleCastExpression
		{
			$current = $this_CastExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getMultiplicationAccess().getTimesExpressionLhsAction_1_0_0(),
							$current);
					}
				)
				otherlv_2='*'
				{
					newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMultiplicationAccess().getRhsCastExpressionParserRuleCall_1_0_2_0());
						}
						lv_rhs_3_0=ruleCastExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMultiplicationRule());
							}
							set(
								$current,
								"rhs",
								lv_rhs_3_0,
								"org.thingml.xtext.ThingML.CastExpression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getMultiplicationAccess().getDivExpressionLhsAction_1_1_0(),
							$current);
					}
				)
				otherlv_5='/'
				{
					newLeafNode(otherlv_5, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_1_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMultiplicationAccess().getRhsCastExpressionParserRuleCall_1_1_2_0());
						}
						lv_rhs_6_0=ruleCastExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMultiplicationRule());
							}
							set(
								$current,
								"rhs",
								lv_rhs_6_0,
								"org.thingml.xtext.ThingML.CastExpression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getMultiplicationAccess().getModExpressionLhsAction_1_2_0(),
							$current);
					}
				)
				otherlv_8='%'
				{
					newLeafNode(otherlv_8, grammarAccess.getMultiplicationAccess().getPercentSignKeyword_1_2_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMultiplicationAccess().getRhsCastExpressionParserRuleCall_1_2_2_0());
						}
						lv_rhs_9_0=ruleCastExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMultiplicationRule());
							}
							set(
								$current,
								"rhs",
								lv_rhs_9_0,
								"org.thingml.xtext.ThingML.CastExpression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)*
	)
;

// Entry rule entryRuleCastExpression
entryRuleCastExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCastExpressionRule()); }
	iv_ruleCastExpression=ruleCastExpression
	{ $current=$iv_ruleCastExpression.current; }
	EOF;

// Rule CastExpression
ruleCastExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getCastExpressionAccess().getPrimaryParserRuleCall_0());
		}
		this_Primary_0=rulePrimary
		{
			$current = $this_Primary_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getCastExpressionAccess().getCastExpressionTermAction_1_0(),
						$current);
				}
			)
			otherlv_2='as'
			{
				newLeafNode(otherlv_2, grammarAccess.getCastExpressionAccess().getAsKeyword_1_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCastExpressionRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getCastExpressionAccess().getTypeTypeCrossReference_1_2_0());
					}
				)
			)
			(
				(
					(
						lv_isArray_4_0='['
						{
							newLeafNode(lv_isArray_4_0, grammarAccess.getCastExpressionAccess().getIsArrayLeftSquareBracketKeyword_1_3_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getCastExpressionRule());
							}
							setWithLastConsumed($current, "isArray", true, "[");
						}
					)
				)
				otherlv_5=']'
				{
					newLeafNode(otherlv_5, grammarAccess.getCastExpressionAccess().getRightSquareBracketKeyword_1_3_1());
				}
			)?
		)?
	)
;

// Entry rule entryRulePrimary
entryRulePrimary returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryRule()); }
	iv_rulePrimary=rulePrimary
	{ $current=$iv_rulePrimary.current; }
	EOF;

// Rule Primary
rulePrimary returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryAccess().getExpressionGroupAction_0_0(),
						$current);
				}
			)
			otherlv_1='('
			{
				newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPrimaryAccess().getTermExpressionParserRuleCall_0_2_0());
					}
					lv_term_2_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPrimaryRule());
						}
						set(
							$current,
							"term",
							lv_term_2_0,
							"org.thingml.xtext.ThingML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3=')'
			{
				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_3());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryAccess().getNotExpressionAction_1_0(),
						$current);
				}
			)
			otherlv_5='not'
			{
				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getNotKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPrimaryAccess().getTermPrimaryParserRuleCall_1_2_0());
					}
					lv_term_6_0=rulePrimary
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPrimaryRule());
						}
						set(
							$current,
							"term",
							lv_term_6_0,
							"org.thingml.xtext.ThingML.Primary");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryAccess().getUnaryMinusAction_2_0(),
						$current);
				}
			)
			otherlv_8='-'
			{
				newLeafNode(otherlv_8, grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPrimaryAccess().getTermPrimaryParserRuleCall_2_2_0());
					}
					lv_term_9_0=rulePrimary
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPrimaryRule());
						}
						set(
							$current,
							"term",
							lv_term_9_0,
							"org.thingml.xtext.ThingML.Primary");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getArrayIndexPostfixParserRuleCall_3());
		}
		this_ArrayIndexPostfix_10=ruleArrayIndexPostfix
		{
			$current = $this_ArrayIndexPostfix_10.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleArrayIndexPostfix
entryRuleArrayIndexPostfix returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArrayIndexPostfixRule()); }
	iv_ruleArrayIndexPostfix=ruleArrayIndexPostfix
	{ $current=$iv_ruleArrayIndexPostfix.current; }
	EOF;

// Rule ArrayIndexPostfix
ruleArrayIndexPostfix returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getArrayIndexPostfixAccess().getAtomicExpressionParserRuleCall_0());
		}
		this_AtomicExpression_0=ruleAtomicExpression
		{
			$current = $this_AtomicExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getArrayIndexPostfixAccess().getArrayIndexArrayAction_1_0(),
						$current);
				}
			)
			otherlv_2='['
			{
				newLeafNode(otherlv_2, grammarAccess.getArrayIndexPostfixAccess().getLeftSquareBracketKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getArrayIndexPostfixAccess().getIndexExpressionParserRuleCall_1_2_0());
					}
					lv_index_3_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getArrayIndexPostfixRule());
						}
						set(
							$current,
							"index",
							lv_index_3_0,
							"org.thingml.xtext.ThingML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_4=']'
			{
				newLeafNode(otherlv_4, grammarAccess.getArrayIndexPostfixAccess().getRightSquareBracketKeyword_1_3());
			}
		)?
	)
;

// Entry rule entryRuleAtomicExpression
entryRuleAtomicExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAtomicExpressionRule()); }
	iv_ruleAtomicExpression=ruleAtomicExpression
	{ $current=$iv_ruleAtomicExpression.current; }
	EOF;

// Rule AtomicExpression
ruleAtomicExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getExternExpressionParserRuleCall_0());
		}
		this_ExternExpression_0=ruleExternExpression
		{
			$current = $this_ExternExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getLiteralParserRuleCall_1());
		}
		this_Literal_1=ruleLiteral
		{
			$current = $this_Literal_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getArrayInitParserRuleCall_2());
		}
		this_ArrayInit_2=ruleArrayInit
		{
			$current = $this_ArrayInit_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getPropertyReferenceParserRuleCall_3());
		}
		this_PropertyReference_3=rulePropertyReference
		{
			$current = $this_PropertyReference_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getFunctionCallExpressionParserRuleCall_4());
		}
		this_FunctionCallExpression_4=ruleFunctionCallExpression
		{
			$current = $this_FunctionCallExpression_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getEventReferenceParserRuleCall_5());
		}
		this_EventReference_5=ruleEventReference
		{
			$current = $this_EventReference_5.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleExternExpression
entryRuleExternExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExternExpressionRule()); }
	iv_ruleExternExpression=ruleExternExpression
	{ $current=$iv_ruleExternExpression.current; }
	EOF;

// Rule ExternExpression
ruleExternExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_expression_0_0=RULE_EXTERN
				{
					newLeafNode(lv_expression_0_0, grammarAccess.getExternExpressionAccess().getExpressionEXTERNTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExternExpressionRule());
					}
					setWithLastConsumed(
						$current,
						"expression",
						lv_expression_0_0,
						"org.thingml.xtext.ThingML.EXTERN");
				}
			)
		)
		(
			otherlv_1='&'
			{
				newLeafNode(otherlv_1, grammarAccess.getExternExpressionAccess().getAmpersandKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExternExpressionAccess().getSegmentsExpressionParserRuleCall_1_1_0());
					}
					lv_segments_2_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExternExpressionRule());
						}
						add(
							$current,
							"segments",
							lv_segments_2_0,
							"org.thingml.xtext.ThingML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleLiteral
entryRuleLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLiteralRule()); }
	iv_ruleLiteral=ruleLiteral
	{ $current=$iv_ruleLiteral.current; }
	EOF;

// Rule Literal
ruleLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getEnumLiteralRefParserRuleCall_0());
		}
		this_EnumLiteralRef_0=ruleEnumLiteralRef
		{
			$current = $this_EnumLiteralRef_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getByteLiteralParserRuleCall_1());
		}
		this_ByteLiteral_1=ruleByteLiteral
		{
			$current = $this_ByteLiteral_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getCharLiteralParserRuleCall_2());
		}
		this_CharLiteral_2=ruleCharLiteral
		{
			$current = $this_CharLiteral_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_3());
		}
		this_IntegerLiteral_3=ruleIntegerLiteral
		{
			$current = $this_IntegerLiteral_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_4());
		}
		this_BooleanLiteral_4=ruleBooleanLiteral
		{
			$current = $this_BooleanLiteral_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_5());
		}
		this_StringLiteral_5=ruleStringLiteral
		{
			$current = $this_StringLiteral_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getDoubleLiteralParserRuleCall_6());
		}
		this_DoubleLiteral_6=ruleDoubleLiteral
		{
			$current = $this_DoubleLiteral_6.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleArrayInit
entryRuleArrayInit returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArrayInitRule()); }
	iv_ruleArrayInit=ruleArrayInit
	{ $current=$iv_ruleArrayInit.current; }
	EOF;

// Rule ArrayInit
ruleArrayInit returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='{'
		{
			newLeafNode(otherlv_0, grammarAccess.getArrayInitAccess().getLeftCurlyBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getArrayInitAccess().getValuesExpressionParserRuleCall_1_0());
				}
				lv_values_1_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getArrayInitRule());
					}
					add(
						$current,
						"values",
						lv_values_1_0,
						"org.thingml.xtext.ThingML.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getArrayInitAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getArrayInitAccess().getValuesExpressionParserRuleCall_2_1_0());
					}
					lv_values_3_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getArrayInitRule());
						}
						add(
							$current,
							"values",
							lv_values_3_0,
							"org.thingml.xtext.ThingML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getArrayInitAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleEnumLiteralRef
entryRuleEnumLiteralRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnumLiteralRefRule()); }
	iv_ruleEnumLiteralRef=ruleEnumLiteralRef
	{ $current=$iv_ruleEnumLiteralRef.current; }
	EOF;

// Rule EnumLiteralRef
ruleEnumLiteralRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEnumLiteralRefRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getEnumLiteralRefAccess().getEnumEnumerationCrossReference_0_0());
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getEnumLiteralRefAccess().getColonKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEnumLiteralRefRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getEnumLiteralRefAccess().getLiteralEnumerationLiteralCrossReference_2_0());
				}
			)
		)
	)
;

// Entry rule entryRuleByteLiteral
entryRuleByteLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getByteLiteralRule()); }
	iv_ruleByteLiteral=ruleByteLiteral
	{ $current=$iv_ruleByteLiteral.current; }
	EOF;

// Rule ByteLiteral
ruleByteLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_byteValue_0_0=RULE_BYTE
			{
				newLeafNode(lv_byteValue_0_0, grammarAccess.getByteLiteralAccess().getByteValueBYTETerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getByteLiteralRule());
				}
				setWithLastConsumed(
					$current,
					"byteValue",
					lv_byteValue_0_0,
					"org.thingml.xtext.ThingML.BYTE");
			}
		)
	)
;

// Entry rule entryRuleCharLiteral
entryRuleCharLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCharLiteralRule()); }
	iv_ruleCharLiteral=ruleCharLiteral
	{ $current=$iv_ruleCharLiteral.current; }
	EOF;

// Rule CharLiteral
ruleCharLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_charValue_0_0=RULE_CHAR
			{
				newLeafNode(lv_charValue_0_0, grammarAccess.getCharLiteralAccess().getCharValueCHARTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getCharLiteralRule());
				}
				setWithLastConsumed(
					$current,
					"charValue",
					lv_charValue_0_0,
					"org.thingml.xtext.ThingML.CHAR");
			}
		)
	)
;

// Entry rule entryRuleIntegerLiteral
entryRuleIntegerLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntegerLiteralRule()); }
	iv_ruleIntegerLiteral=ruleIntegerLiteral
	{ $current=$iv_ruleIntegerLiteral.current; }
	EOF;

// Rule IntegerLiteral
ruleIntegerLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_intValue_0_0=RULE_INT
			{
				newLeafNode(lv_intValue_0_0, grammarAccess.getIntegerLiteralAccess().getIntValueINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getIntegerLiteralRule());
				}
				setWithLastConsumed(
					$current,
					"intValue",
					lv_intValue_0_0,
					"org.thingml.xtext.ThingML.INT");
			}
		)
	)
;

// Entry rule entryRuleBooleanLiteral
entryRuleBooleanLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBooleanLiteralRule()); }
	iv_ruleBooleanLiteral=ruleBooleanLiteral
	{ $current=$iv_ruleBooleanLiteral.current; }
	EOF;

// Rule BooleanLiteral
ruleBooleanLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_boolValue_0_0='true'
				{
					newLeafNode(lv_boolValue_0_0, grammarAccess.getBooleanLiteralAccess().getBoolValueTrueKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBooleanLiteralRule());
					}
					setWithLastConsumed($current, "boolValue", true, "true");
				}
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_1_0(),
						$current);
				}
			)
			otherlv_2='false'
			{
				newLeafNode(otherlv_2, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleStringLiteral
entryRuleStringLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStringLiteralRule()); }
	iv_ruleStringLiteral=ruleStringLiteral
	{ $current=$iv_ruleStringLiteral.current; }
	EOF;

// Rule StringLiteral
ruleStringLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_stringValue_0_0=RULE_STRING
			{
				newLeafNode(lv_stringValue_0_0, grammarAccess.getStringLiteralAccess().getStringValueSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getStringLiteralRule());
				}
				setWithLastConsumed(
					$current,
					"stringValue",
					lv_stringValue_0_0,
					"org.thingml.xtext.ThingML.STRING");
			}
		)
	)
;

// Entry rule entryRuleDoubleLiteral
entryRuleDoubleLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDoubleLiteralRule()); }
	iv_ruleDoubleLiteral=ruleDoubleLiteral
	{ $current=$iv_ruleDoubleLiteral.current; }
	EOF;

// Rule DoubleLiteral
ruleDoubleLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_doubleValue_0_0=RULE_FLOAT
			{
				newLeafNode(lv_doubleValue_0_0, grammarAccess.getDoubleLiteralAccess().getDoubleValueFLOATTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getDoubleLiteralRule());
				}
				setWithLastConsumed(
					$current,
					"doubleValue",
					lv_doubleValue_0_0,
					"org.thingml.xtext.ThingML.FLOAT");
			}
		)
	)
;

// Entry rule entryRulePropertyReference
entryRulePropertyReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyReferenceRule()); }
	iv_rulePropertyReference=rulePropertyReference
	{ $current=$iv_rulePropertyReference.current; }
	EOF;

// Rule PropertyReference
rulePropertyReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getPropertyReferenceRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getPropertyReferenceAccess().getPropertyVariableCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleEventReference
entryRuleEventReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEventReferenceRule()); }
	iv_ruleEventReference=ruleEventReference
	{ $current=$iv_ruleEventReference.current; }
	EOF;

// Rule EventReference
ruleEventReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEventReferenceRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getEventReferenceAccess().getReceiveMsgEventCrossReference_0_0());
				}
			)
		)
		otherlv_1='.'
		{
			newLeafNode(otherlv_1, grammarAccess.getEventReferenceAccess().getFullStopKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEventReferenceRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getEventReferenceAccess().getParameterParameterCrossReference_2_0());
				}
			)
		)
	)
;

// Entry rule entryRuleFunctionCallExpression
entryRuleFunctionCallExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionCallExpressionRule()); }
	iv_ruleFunctionCallExpression=ruleFunctionCallExpression
	{ $current=$iv_ruleFunctionCallExpression.current; }
	EOF;

// Rule FunctionCallExpression
ruleFunctionCallExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunctionCallExpressionRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getFunctionCallExpressionAccess().getFunctionFunctionCrossReference_0_0());
				}
			)
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getFunctionCallExpressionAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getFunctionCallExpressionAccess().getParametersExpressionParserRuleCall_2_0_0());
					}
					lv_parameters_2_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunctionCallExpressionRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_2_0,
							"org.thingml.xtext.ThingML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=','
				{
					newLeafNode(otherlv_3, grammarAccess.getFunctionCallExpressionAccess().getCommaKeyword_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getFunctionCallExpressionAccess().getParametersExpressionParserRuleCall_2_1_1_0());
						}
						lv_parameters_4_0=ruleExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFunctionCallExpressionRule());
							}
							add(
								$current,
								"parameters",
								lv_parameters_4_0,
								"org.thingml.xtext.ThingML.Expression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getFunctionCallExpressionAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleConfiguration
entryRuleConfiguration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConfigurationRule()); }
	iv_ruleConfiguration=ruleConfiguration
	{ $current=$iv_ruleConfiguration.current; }
	EOF;

// Rule Configuration
ruleConfiguration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='configuration'
		{
			newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getConfigurationKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getConfigurationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConfigurationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigurationAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0());
				}
				lv_annotations_2_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigurationRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_2_0,
						"org.thingml.xtext.ThingML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getConfigurationAccess().getInstancesInstanceParserRuleCall_4_0_0());
					}
					lv_instances_4_0=ruleInstance
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConfigurationRule());
						}
						add(
							$current,
							"instances",
							lv_instances_4_0,
							"org.thingml.xtext.ThingML.Instance");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getConfigurationAccess().getConnectorsAbstractConnectorParserRuleCall_4_1_0());
					}
					lv_connectors_5_0=ruleAbstractConnector
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConfigurationRule());
						}
						add(
							$current,
							"connectors",
							lv_connectors_5_0,
							"org.thingml.xtext.ThingML.AbstractConnector");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getConfigurationAccess().getPropassignsConfigPropertyAssignParserRuleCall_4_2_0());
					}
					lv_propassigns_6_0=ruleConfigPropertyAssign
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConfigurationRule());
						}
						add(
							$current,
							"propassigns",
							lv_propassigns_6_0,
							"org.thingml.xtext.ThingML.ConfigPropertyAssign");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleInstance
entryRuleInstance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstanceRule()); }
	iv_ruleInstance=ruleInstance
	{ $current=$iv_ruleInstance.current; }
	EOF;

// Rule Instance
ruleInstance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='instance'
		{
			newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getInstanceKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInstanceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getInstanceAccess().getColonKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInstanceRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getInstanceAccess().getTypeThingCrossReference_3_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getInstanceAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0());
				}
				lv_annotations_4_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstanceRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_4_0,
						"org.thingml.xtext.ThingML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleConfigPropertyAssign
entryRuleConfigPropertyAssign returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConfigPropertyAssignRule()); }
	iv_ruleConfigPropertyAssign=ruleConfigPropertyAssign
	{ $current=$iv_ruleConfigPropertyAssign.current; }
	EOF;

// Rule ConfigPropertyAssign
ruleConfigPropertyAssign returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='set'
		{
			newLeafNode(otherlv_0, grammarAccess.getConfigPropertyAssignAccess().getSetKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConfigPropertyAssignRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getConfigPropertyAssignAccess().getInstanceInstanceCrossReference_1_0());
				}
			)
		)
		otherlv_2='.'
		{
			newLeafNode(otherlv_2, grammarAccess.getConfigPropertyAssignAccess().getFullStopKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConfigPropertyAssignRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getConfigPropertyAssignAccess().getPropertyPropertyCrossReference_3_0());
				}
			)
		)
		(
			(
				('[')=>
				otherlv_4='['
				{
					newLeafNode(otherlv_4, grammarAccess.getConfigPropertyAssignAccess().getLeftSquareBracketKeyword_4_0());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getConfigPropertyAssignAccess().getIndexExpressionParserRuleCall_4_1_0());
					}
					lv_index_5_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConfigPropertyAssignRule());
						}
						set(
							$current,
							"index",
							lv_index_5_0,
							"org.thingml.xtext.ThingML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_6=']'
			{
				newLeafNode(otherlv_6, grammarAccess.getConfigPropertyAssignAccess().getRightSquareBracketKeyword_4_2());
			}
		)?
		otherlv_7='='
		{
			newLeafNode(otherlv_7, grammarAccess.getConfigPropertyAssignAccess().getEqualsSignKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigPropertyAssignAccess().getInitExpressionParserRuleCall_6_0());
				}
				lv_init_8_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigPropertyAssignRule());
					}
					set(
						$current,
						"init",
						lv_init_8_0,
						"org.thingml.xtext.ThingML.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigPropertyAssignAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0());
				}
				lv_annotations_9_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigPropertyAssignRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_9_0,
						"org.thingml.xtext.ThingML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleAbstractConnector
entryRuleAbstractConnector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractConnectorRule()); }
	iv_ruleAbstractConnector=ruleAbstractConnector
	{ $current=$iv_ruleAbstractConnector.current; }
	EOF;

// Rule AbstractConnector
ruleAbstractConnector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractConnectorAccess().getConnectorParserRuleCall_0());
		}
		this_Connector_0=ruleConnector
		{
			$current = $this_Connector_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractConnectorAccess().getExternalConnectorParserRuleCall_1());
		}
		this_ExternalConnector_1=ruleExternalConnector
		{
			$current = $this_ExternalConnector_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleConnector
entryRuleConnector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConnectorRule()); }
	iv_ruleConnector=ruleConnector
	{ $current=$iv_ruleConnector.current; }
	EOF;

// Rule Connector
ruleConnector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='connector'
		{
			newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectorKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConnectorRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConnectorRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getConnectorAccess().getCliInstanceCrossReference_2_0());
				}
			)
		)
		otherlv_3='.'
		{
			newLeafNode(otherlv_3, grammarAccess.getConnectorAccess().getFullStopKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConnectorRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getConnectorAccess().getRequiredRequiredPortCrossReference_4_0());
				}
			)
		)
		otherlv_5='=>'
		{
			newLeafNode(otherlv_5, grammarAccess.getConnectorAccess().getEqualsSignGreaterThanSignKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConnectorRule());
					}
				}
				otherlv_6=RULE_ID
				{
					newLeafNode(otherlv_6, grammarAccess.getConnectorAccess().getSrvInstanceCrossReference_6_0());
				}
			)
		)
		otherlv_7='.'
		{
			newLeafNode(otherlv_7, grammarAccess.getConnectorAccess().getFullStopKeyword_7());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConnectorRule());
					}
				}
				otherlv_8=RULE_ID
				{
					newLeafNode(otherlv_8, grammarAccess.getConnectorAccess().getProvidedProvidedPortCrossReference_8_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getConnectorAccess().getAnnotationsPlatformAnnotationParserRuleCall_9_0());
				}
				lv_annotations_9_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConnectorRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_9_0,
						"org.thingml.xtext.ThingML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleExternalConnector
entryRuleExternalConnector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExternalConnectorRule()); }
	iv_ruleExternalConnector=ruleExternalConnector
	{ $current=$iv_ruleExternalConnector.current; }
	EOF;

// Rule ExternalConnector
ruleExternalConnector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='connector'
		{
			newLeafNode(otherlv_0, grammarAccess.getExternalConnectorAccess().getConnectorKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getExternalConnectorAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExternalConnectorRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.thingml.xtext.ThingML.ID");
				}
			)
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExternalConnectorRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getExternalConnectorAccess().getInstInstanceCrossReference_2_0());
				}
			)
		)
		otherlv_3='.'
		{
			newLeafNode(otherlv_3, grammarAccess.getExternalConnectorAccess().getFullStopKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExternalConnectorRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getExternalConnectorAccess().getPortPortCrossReference_4_0());
				}
			)
		)
		otherlv_5='over'
		{
			newLeafNode(otherlv_5, grammarAccess.getExternalConnectorAccess().getOverKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExternalConnectorRule());
					}
				}
				otherlv_6=RULE_ID
				{
					newLeafNode(otherlv_6, grammarAccess.getExternalConnectorAccess().getProtocolProtocolCrossReference_6_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getExternalConnectorAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0());
				}
				lv_annotations_7_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExternalConnectorRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_7_0,
						"org.thingml.xtext.ThingML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Rule AutoML
ruleAutoML returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='NOT_SET'
			{
				$current = grammarAccess.getAutoMLAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getAutoMLAccess().getNOT_SETEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='OFF'
			{
				$current = grammarAccess.getAutoMLAccess().getOFFEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getAutoMLAccess().getOFFEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='ON'
			{
				$current = grammarAccess.getAutoMLAccess().getONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getAutoMLAccess().getONEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule Sequential
ruleSequential returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='NOT_SET'
			{
				$current = grammarAccess.getSequentialAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getSequentialAccess().getNOT_SETEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='FALSE'
			{
				$current = grammarAccess.getSequentialAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getSequentialAccess().getFALSEEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='TRUE'
			{
				$current = grammarAccess.getSequentialAccess().getTRUEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getSequentialAccess().getTRUEEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule Timestamps
ruleTimestamps returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='NOT_SET'
			{
				$current = grammarAccess.getTimestampsAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTimestampsAccess().getNOT_SETEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='OFF'
			{
				$current = grammarAccess.getTimestampsAccess().getOFFEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTimestampsAccess().getOFFEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='ON'
			{
				$current = grammarAccess.getTimestampsAccess().getONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTimestampsAccess().getONEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule Labels
ruleLabels returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='NOT_SET'
			{
				$current = grammarAccess.getLabelsAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getLabelsAccess().getNOT_SETEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='OFF'
			{
				$current = grammarAccess.getLabelsAccess().getOFFEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getLabelsAccess().getOFFEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='ON'
			{
				$current = grammarAccess.getLabelsAccess().getONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getLabelsAccess().getONEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule Preprocess_feature_scaling
rulePreprocess_feature_scaling returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='NOT_SET'
			{
				$current = grammarAccess.getPreprocess_feature_scalingAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getPreprocess_feature_scalingAccess().getNOT_SETEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='OFF'
			{
				$current = grammarAccess.getPreprocess_feature_scalingAccess().getOFFEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getPreprocess_feature_scalingAccess().getOFFEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='STANDARDIZATION_Z_SCORE_NORMALIZATION'
			{
				$current = grammarAccess.getPreprocess_feature_scalingAccess().getSTANDARDIZATION_Z_SCORE_NORMALIZATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getPreprocess_feature_scalingAccess().getSTANDARDIZATION_Z_SCORE_NORMALIZATIONEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='MIN_MAX_NORMALIZATION'
			{
				$current = grammarAccess.getPreprocess_feature_scalingAccess().getMIN_MAX_NORMALIZATIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getPreprocess_feature_scalingAccess().getMIN_MAX_NORMALIZATIONEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='MEAN_NORMALIZATION_MIN_MAX'
			{
				$current = grammarAccess.getPreprocess_feature_scalingAccess().getMEAN_NORMALIZATION_MIN_MAXEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getPreprocess_feature_scalingAccess().getMEAN_NORMALIZATION_MIN_MAXEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='MEAN_NORMALIZATION_L2_NORM'
			{
				$current = grammarAccess.getPreprocess_feature_scalingAccess().getMEAN_NORMALIZATION_L2_NORMEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getPreprocess_feature_scalingAccess().getMEAN_NORMALIZATION_L2_NORMEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='UNIT_LENGTH_SCALING'
			{
				$current = grammarAccess.getPreprocess_feature_scalingAccess().getUNIT_LENGTH_SCALINGEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getPreprocess_feature_scalingAccess().getUNIT_LENGTH_SCALINGEnumLiteralDeclaration_6());
			}
		)
	)
;

// Rule Penalty
rulePenalty returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='NOT_SET'
			{
				$current = grammarAccess.getPenaltyAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getPenaltyAccess().getNOT_SETEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='\'l1\''
			{
				$current = grammarAccess.getPenaltyAccess().getL1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getPenaltyAccess().getL1EnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='\'l2\''
			{
				$current = grammarAccess.getPenaltyAccess().getL2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getPenaltyAccess().getL2EnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='\'elasticnet\''
			{
				$current = grammarAccess.getPenaltyAccess().getELASTICNETEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getPenaltyAccess().getELASTICNETEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='\'none\''
			{
				$current = grammarAccess.getPenaltyAccess().getNONEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getPenaltyAccess().getNONEEnumLiteralDeclaration_4());
			}
		)
	)
;

// Rule Optimizer
ruleOptimizer returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='NOT_SET'
			{
				$current = grammarAccess.getOptimizerAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getOptimizerAccess().getNOT_SETEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='newton-cg'
			{
				$current = grammarAccess.getOptimizerAccess().getNEWTON_CGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getOptimizerAccess().getNEWTON_CGEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='lbfgs'
			{
				$current = grammarAccess.getOptimizerAccess().getLBFGSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getOptimizerAccess().getLBFGSEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='liblinear'
			{
				$current = grammarAccess.getOptimizerAccess().getLIBLINEAREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getOptimizerAccess().getLIBLINEAREnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='sag'
			{
				$current = grammarAccess.getOptimizerAccess().getSAGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getOptimizerAccess().getSAGEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='saga'
			{
				$current = grammarAccess.getOptimizerAccess().getSAGAEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getOptimizerAccess().getSAGAEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='sgd'
			{
				$current = grammarAccess.getOptimizerAccess().getSGDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getOptimizerAccess().getSGDEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='adam'
			{
				$current = grammarAccess.getOptimizerAccess().getADAMEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getOptimizerAccess().getADAMEnumLiteralDeclaration_7());
			}
		)
		    |
		(
			enumLiteral_8='RMSprop'
			{
				$current = grammarAccess.getOptimizerAccess().getRMSPROPEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_8, grammarAccess.getOptimizerAccess().getRMSPROPEnumLiteralDeclaration_8());
			}
		)
		    |
		(
			enumLiteral_9='Adadelta'
			{
				$current = grammarAccess.getOptimizerAccess().getADADELTAEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_9, grammarAccess.getOptimizerAccess().getADADELTAEnumLiteralDeclaration_9());
			}
		)
		    |
		(
			enumLiteral_10='Adagrad'
			{
				$current = grammarAccess.getOptimizerAccess().getADAGRADEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_10, grammarAccess.getOptimizerAccess().getADAGRADEnumLiteralDeclaration_10());
			}
		)
		    |
		(
			enumLiteral_11='Adamax'
			{
				$current = grammarAccess.getOptimizerAccess().getADAMAXEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_11, grammarAccess.getOptimizerAccess().getADAMAXEnumLiteralDeclaration_11());
			}
		)
		    |
		(
			enumLiteral_12='Nadam'
			{
				$current = grammarAccess.getOptimizerAccess().getNADAMEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_12, grammarAccess.getOptimizerAccess().getNADAMEnumLiteralDeclaration_12());
			}
		)
		    |
		(
			enumLiteral_13='Ftrl'
			{
				$current = grammarAccess.getOptimizerAccess().getFTRLEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_13, grammarAccess.getOptimizerAccess().getFTRLEnumLiteralDeclaration_13());
			}
		)
	)
;

// Rule Multi_class
ruleMulti_class returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='NOT_SET'
			{
				$current = grammarAccess.getMulti_classAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getMulti_classAccess().getNOT_SETEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='\'auto\''
			{
				$current = grammarAccess.getMulti_classAccess().getAUTOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getMulti_classAccess().getAUTOEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='\'ovr\''
			{
				$current = grammarAccess.getMulti_classAccess().getOVREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getMulti_classAccess().getOVREnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='\'multinomial\''
			{
				$current = grammarAccess.getMulti_classAccess().getMULTINOMIALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getMulti_classAccess().getMULTINOMIALEnumLiteralDeclaration_3());
			}
		)
	)
;

// Rule DecisionTreeRegressorCriterion
ruleDecisionTreeRegressorCriterion returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='NOT_SET'
			{
				$current = grammarAccess.getDecisionTreeRegressorCriterionAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDecisionTreeRegressorCriterionAccess().getNOT_SETEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='\'mse\''
			{
				$current = grammarAccess.getDecisionTreeRegressorCriterionAccess().getMSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDecisionTreeRegressorCriterionAccess().getMSEEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='\'friedman_mse\''
			{
				$current = grammarAccess.getDecisionTreeRegressorCriterionAccess().getFRIEDMAN_MSEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getDecisionTreeRegressorCriterionAccess().getFRIEDMAN_MSEEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='\'mae\''
			{
				$current = grammarAccess.getDecisionTreeRegressorCriterionAccess().getMAEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getDecisionTreeRegressorCriterionAccess().getMAEEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='\'poisson\''
			{
				$current = grammarAccess.getDecisionTreeRegressorCriterionAccess().getPOISSONEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getDecisionTreeRegressorCriterionAccess().getPOISSONEnumLiteralDeclaration_4());
			}
		)
	)
;

// Rule DecisionTreeClassifierCriterion
ruleDecisionTreeClassifierCriterion returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='NOT_SET'
			{
				$current = grammarAccess.getDecisionTreeClassifierCriterionAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDecisionTreeClassifierCriterionAccess().getNOT_SETEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='\'gini\''
			{
				$current = grammarAccess.getDecisionTreeClassifierCriterionAccess().getGINIEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDecisionTreeClassifierCriterionAccess().getGINIEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='\'entropy\''
			{
				$current = grammarAccess.getDecisionTreeClassifierCriterionAccess().getENTROPYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getDecisionTreeClassifierCriterionAccess().getENTROPYEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule DecisionTreeSplitter
ruleDecisionTreeSplitter returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='NOT_SET'
			{
				$current = grammarAccess.getDecisionTreeSplitterAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDecisionTreeSplitterAccess().getNOT_SETEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='\'best\''
			{
				$current = grammarAccess.getDecisionTreeSplitterAccess().getBESTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDecisionTreeSplitterAccess().getBESTEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='\'random\''
			{
				$current = grammarAccess.getDecisionTreeSplitterAccess().getRANDOMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getDecisionTreeSplitterAccess().getRANDOMEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule Max_features_enum
ruleMax_features_enum returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='NOT_SET'
			{
				$current = grammarAccess.getMax_features_enumAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getMax_features_enumAccess().getNOT_SETEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='\'auto\''
			{
				$current = grammarAccess.getMax_features_enumAccess().getAUTOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getMax_features_enumAccess().getAUTOEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='\'sqrt\''
			{
				$current = grammarAccess.getMax_features_enumAccess().getSQRTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getMax_features_enumAccess().getSQRTEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='\'log2\''
			{
				$current = grammarAccess.getMax_features_enumAccess().getLOG2EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getMax_features_enumAccess().getLOG2EnumLiteralDeclaration_3());
			}
		)
	)
;

// Rule RandomForestRegressorCriterion
ruleRandomForestRegressorCriterion returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='NOT_SET'
			{
				$current = grammarAccess.getRandomForestRegressorCriterionAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getRandomForestRegressorCriterionAccess().getNOT_SETEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='\'mse\''
			{
				$current = grammarAccess.getRandomForestRegressorCriterionAccess().getMSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getRandomForestRegressorCriterionAccess().getMSEEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='\'mae\''
			{
				$current = grammarAccess.getRandomForestRegressorCriterionAccess().getMAEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getRandomForestRegressorCriterionAccess().getMAEEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule RandomForestClassifierCriterion
ruleRandomForestClassifierCriterion returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='NOT_SET'
			{
				$current = grammarAccess.getRandomForestClassifierCriterionAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getRandomForestClassifierCriterionAccess().getNOT_SETEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='\'gini\''
			{
				$current = grammarAccess.getRandomForestClassifierCriterionAccess().getGINIEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getRandomForestClassifierCriterionAccess().getGINIEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='\'entropy\''
			{
				$current = grammarAccess.getRandomForestClassifierCriterionAccess().getENTROPYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getRandomForestClassifierCriterionAccess().getENTROPYEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule Activation
ruleActivation returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='NOT_SET'
			{
				$current = grammarAccess.getActivationAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getActivationAccess().getNOT_SETEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='relu'
			{
				$current = grammarAccess.getActivationAccess().getRELUEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getActivationAccess().getRELUEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='sigmoid'
			{
				$current = grammarAccess.getActivationAccess().getSIGMOIDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getActivationAccess().getSIGMOIDEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='softmax'
			{
				$current = grammarAccess.getActivationAccess().getSOFTMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getActivationAccess().getSOFTMAXEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='softplus'
			{
				$current = grammarAccess.getActivationAccess().getSOFTPLUSEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getActivationAccess().getSOFTPLUSEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='softsign'
			{
				$current = grammarAccess.getActivationAccess().getSOFTSIGNEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getActivationAccess().getSOFTSIGNEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='tanh'
			{
				$current = grammarAccess.getActivationAccess().getTANHEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getActivationAccess().getTANHEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='selu'
			{
				$current = grammarAccess.getActivationAccess().getSELUEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getActivationAccess().getSELUEnumLiteralDeclaration_7());
			}
		)
		    |
		(
			enumLiteral_8='elu'
			{
				$current = grammarAccess.getActivationAccess().getELUEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_8, grammarAccess.getActivationAccess().getELUEnumLiteralDeclaration_8());
			}
		)
		    |
		(
			enumLiteral_9='exponential'
			{
				$current = grammarAccess.getActivationAccess().getEXPONENTIALEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_9, grammarAccess.getActivationAccess().getEXPONENTIALEnumLiteralDeclaration_9());
			}
		)
		    |
		(
			enumLiteral_10='identity'
			{
				$current = grammarAccess.getActivationAccess().getIDENTITYEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_10, grammarAccess.getActivationAccess().getIDENTITYEnumLiteralDeclaration_10());
			}
		)
		    |
		(
			enumLiteral_11='logistic'
			{
				$current = grammarAccess.getActivationAccess().getLOGISTICEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_11, grammarAccess.getActivationAccess().getLOGISTICEnumLiteralDeclaration_11());
			}
		)
	)
;

// Rule Learning_rate_mode
ruleLearning_rate_mode returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='NOT_SET'
			{
				$current = grammarAccess.getLearning_rate_modeAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getLearning_rate_modeAccess().getNOT_SETEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='\'constant\''
			{
				$current = grammarAccess.getLearning_rate_modeAccess().getCONSTANTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getLearning_rate_modeAccess().getCONSTANTEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='\'invscaling\''
			{
				$current = grammarAccess.getLearning_rate_modeAccess().getINVSCALINGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getLearning_rate_modeAccess().getINVSCALINGEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='\'adaptive\''
			{
				$current = grammarAccess.getLearning_rate_modeAccess().getADAPTIVEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getLearning_rate_modeAccess().getADAPTIVEEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='ExponentialDecay'
			{
				$current = grammarAccess.getLearning_rate_modeAccess().getEXPONENTIAL_DECAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getLearning_rate_modeAccess().getEXPONENTIAL_DECAYEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='PiecewiseConstantDecay'
			{
				$current = grammarAccess.getLearning_rate_modeAccess().getPIECEWISE_CONSTANT_DECAYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getLearning_rate_modeAccess().getPIECEWISE_CONSTANT_DECAYEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='PolynomialDecay'
			{
				$current = grammarAccess.getLearning_rate_modeAccess().getPOLYNOMIAL_DECAYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getLearning_rate_modeAccess().getPOLYNOMIAL_DECAYEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='InverseTimeDecay'
			{
				$current = grammarAccess.getLearning_rate_modeAccess().getINVERSE_TIME_DECAYEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getLearning_rate_modeAccess().getINVERSE_TIME_DECAYEnumLiteralDeclaration_7());
			}
		)
	)
;

// Rule Loss
ruleLoss returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='NOT_SET'
			{
				$current = grammarAccess.getLossAccess().getNOT_SETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getLossAccess().getNOT_SETEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='SparseCategoricalCrossentropy'
			{
				$current = grammarAccess.getLossAccess().getSPARSE_CATEGORICAL_CROSSENTROPYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getLossAccess().getSPARSE_CATEGORICAL_CROSSENTROPYEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='CategoricalCrossentropy'
			{
				$current = grammarAccess.getLossAccess().getCATEGORICAL_CROSSENTROPYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getLossAccess().getCATEGORICAL_CROSSENTROPYEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='MeanSquaredError'
			{
				$current = grammarAccess.getLossAccess().getMEAN_SQUARED_ERROREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getLossAccess().getMEAN_SQUARED_ERROREnumLiteralDeclaration_3());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_BYTE : '0x' ('0'..'9'|'a'..'f'|'A'..'F') ('0'..'9'|'a'..'f'|'A'..'F');

RULE_CHAR : '\'' ('\\0'|'\\t'|'\\n'|'\\r'|' '..'&'|'\\\''|'('..'['|'\\\\'|']'..'~') '\'';

RULE_INT : ('0'..'9')+;

RULE_FLOAT : (('0'..'9')+ '.' ('0'..'9')* (('e'|'E') ('+'|'-')? ('0'..'9')+)?|'.' ('0'..'9')+ (('e'|'E') ('+'|'-')? ('0'..'9')+)?|('0'..'9')+ ('e'|'E') ('+'|'-')? ('0'..'9')+);

RULE_ANNOTATION_ID : '@' ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_STRING : '"' ('\\' .|~(('\\'|'"')))* '"';

RULE_EXTERN : '`' ('\\' .|~(('\\'|'`')))* '`';

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
