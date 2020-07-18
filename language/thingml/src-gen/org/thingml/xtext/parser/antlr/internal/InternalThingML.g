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
		)
		(
			otherlv_6='sequential'
			{
				newLeafNode(otherlv_6, grammarAccess.getDataAnalyticsAccess().getSequentialKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDataAnalyticsAccess().getSequentialSequentialEnumRuleCall_5_1_0());
					}
					lv_sequential_7_0=ruleSequential
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDataAnalyticsRule());
						}
						set(
							$current,
							"sequential",
							lv_sequential_7_0,
							"org.thingml.xtext.ThingML.Sequential");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			otherlv_8='timestamps'
			{
				newLeafNode(otherlv_8, grammarAccess.getDataAnalyticsAccess().getTimestampsKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDataAnalyticsAccess().getTimestampsTimestampsEnumRuleCall_6_1_0());
					}
					lv_timestamps_9_0=ruleTimestamps
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDataAnalyticsRule());
						}
						set(
							$current,
							"timestamps",
							lv_timestamps_9_0,
							"org.thingml.xtext.ThingML.Timestamps");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			otherlv_10='labels'
			{
				newLeafNode(otherlv_10, grammarAccess.getDataAnalyticsAccess().getLabelsKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDataAnalyticsAccess().getLabelsLabelsEnumRuleCall_7_1_0());
					}
					lv_labels_11_0=ruleLabels
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDataAnalyticsRule());
						}
						set(
							$current,
							"labels",
							lv_labels_11_0,
							"org.thingml.xtext.ThingML.Labels");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			otherlv_12='features'
			{
				newLeafNode(otherlv_12, grammarAccess.getDataAnalyticsAccess().getFeaturesKeyword_8_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDataAnalyticsRule());
						}
					}
					otherlv_13=RULE_ID
					{
						newLeafNode(otherlv_13, grammarAccess.getDataAnalyticsAccess().getFeaturesPropertyCrossReference_8_1_0());
					}
				)
			)
			(
				otherlv_14=','
				{
					newLeafNode(otherlv_14, grammarAccess.getDataAnalyticsAccess().getCommaKeyword_8_2_0());
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
							newLeafNode(otherlv_15, grammarAccess.getDataAnalyticsAccess().getFeaturesPropertyCrossReference_8_2_1_0());
						}
					)
				)
			)*
		)
		(
			otherlv_16='model_algorithm'
			{
				newLeafNode(otherlv_16, grammarAccess.getDataAnalyticsAccess().getModel_algorithmKeyword_9_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDataAnalyticsAccess().getModelAlgorithmDataAnalyticsModelAlgorithmParserRuleCall_9_1_0());
					}
					lv_modelAlgorithm_17_0=ruleDataAnalyticsModelAlgorithm
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDataAnalyticsRule());
						}
						set(
							$current,
							"modelAlgorithm",
							lv_modelAlgorithm_17_0,
							"org.thingml.xtext.ThingML.DataAnalyticsModelAlgorithm");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			otherlv_18='training_results'
			{
				newLeafNode(otherlv_18, grammarAccess.getDataAnalyticsAccess().getTraining_resultsKeyword_10_0());
			}
			(
				(
					lv_trainingResults_19_0=RULE_STRING
					{
						newLeafNode(lv_trainingResults_19_0, grammarAccess.getDataAnalyticsAccess().getTrainingResultsSTRINGTerminalRuleCall_10_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDataAnalyticsRule());
						}
						setWithLastConsumed(
							$current,
							"trainingResults",
							lv_trainingResults_19_0,
							"org.thingml.xtext.ThingML.STRING");
					}
				)
			)
		)
		(
			otherlv_20='prediction_results'
			{
				newLeafNode(otherlv_20, grammarAccess.getDataAnalyticsAccess().getPrediction_resultsKeyword_11_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDataAnalyticsRule());
						}
					}
					otherlv_21=RULE_ID
					{
						newLeafNode(otherlv_21, grammarAccess.getDataAnalyticsAccess().getPredictionResultsPropertyCrossReference_11_1_0());
					}
				)
			)
			(
				otherlv_22=','
				{
					newLeafNode(otherlv_22, grammarAccess.getDataAnalyticsAccess().getCommaKeyword_11_2_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getDataAnalyticsRule());
							}
						}
						otherlv_23=RULE_ID
						{
							newLeafNode(otherlv_23, grammarAccess.getDataAnalyticsAccess().getPredictionResultsPropertyCrossReference_11_2_1_0());
						}
					)
				)
			)*
		)
		otherlv_24='}'
		{
			newLeafNode(otherlv_24, grammarAccess.getDataAnalyticsAccess().getRightCurlyBracketKeyword_12());
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
			newCompositeNode(grammarAccess.getDataAnalyticsModelAlgorithmAccess().getPMML_ModelAlgorithmParserRuleCall_0());
		}
		this_PMML_ModelAlgorithm_0=rulePMML_ModelAlgorithm
		{
			$current = $this_PMML_ModelAlgorithm_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDataAnalyticsModelAlgorithmAccess().getPFA_ModelAlgorithmParserRuleCall_1());
		}
		this_PFA_ModelAlgorithm_1=rulePFA_ModelAlgorithm
		{
			$current = $this_PFA_ModelAlgorithm_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDataAnalyticsModelAlgorithmAccess().getML2_ModelAlgorithmParserRuleCall_2());
		}
		this_ML2_ModelAlgorithm_2=ruleML2_ModelAlgorithm
		{
			$current = $this_ML2_ModelAlgorithm_2.current;
			afterParserOrEnumRuleCall();
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
			newCompositeNode(grammarAccess.getML2_ModelAlgorithmAccess().getDecisionTreeParserRuleCall_0());
		}
		this_DecisionTree_0=ruleDecisionTree
		{
			$current = $this_DecisionTree_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getML2_ModelAlgorithmAccess().getRandomForestParserRuleCall_1());
		}
		this_RandomForest_1=ruleRandomForest
		{
			$current = $this_RandomForest_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getML2_ModelAlgorithmAccess().getNN_MultilayerPerceptronParserRuleCall_2());
		}
		this_NN_MultilayerPerceptron_2=ruleNN_MultilayerPerceptron
		{
			$current = $this_NN_MultilayerPerceptron_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDecisionTree
entryRuleDecisionTree returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDecisionTreeRule()); }
	iv_ruleDecisionTree=ruleDecisionTree
	{ $current=$iv_ruleDecisionTree.current; }
	EOF;

// Rule DecisionTree
ruleDecisionTree returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='decision_tree'
		{
			newLeafNode(otherlv_0, grammarAccess.getDecisionTreeAccess().getDecision_treeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDecisionTreeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDecisionTreeRule());
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
			newLeafNode(otherlv_2, grammarAccess.getDecisionTreeAccess().getLeftParenthesisKeyword_2());
		}
		(
			otherlv_3='criterion'
			{
				newLeafNode(otherlv_3, grammarAccess.getDecisionTreeAccess().getCriterionKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDecisionTreeAccess().getDecisionTreeCriterionDecisionTreeCriterionEnumRuleCall_3_1_0());
					}
					lv_decisionTreeCriterion_4_0=ruleDecisionTreeCriterion
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDecisionTreeRule());
						}
						set(
							$current,
							"decisionTreeCriterion",
							lv_decisionTreeCriterion_4_0,
							"org.thingml.xtext.ThingML.DecisionTreeCriterion");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getDecisionTreeAccess().getCommaKeyword_4());
			}
		)?
		(
			otherlv_6='min_samples_split'
			{
				newLeafNode(otherlv_6, grammarAccess.getDecisionTreeAccess().getMin_samples_splitKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDecisionTreeAccess().getMin_samples_splitMin_samples_split_typeParserRuleCall_5_1_0());
					}
					lv_min_samples_split_7_0=ruleMin_samples_split_type
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDecisionTreeRule());
						}
						set(
							$current,
							"min_samples_split",
							lv_min_samples_split_7_0,
							"org.thingml.xtext.ThingML.Min_samples_split_type");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_8=')'
		{
			newLeafNode(otherlv_8, grammarAccess.getDecisionTreeAccess().getRightParenthesisKeyword_6());
		}
	)
;

// Entry rule entryRuleRandomForest
entryRuleRandomForest returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRandomForestRule()); }
	iv_ruleRandomForest=ruleRandomForest
	{ $current=$iv_ruleRandomForest.current; }
	EOF;

// Rule RandomForest
ruleRandomForest returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='random_forest'
		{
			newLeafNode(otherlv_0, grammarAccess.getRandomForestAccess().getRandom_forestKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getRandomForestAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRandomForestRule());
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
			newLeafNode(otherlv_2, grammarAccess.getRandomForestAccess().getLeftParenthesisKeyword_2());
		}
		(
			otherlv_3='criterion'
			{
				newLeafNode(otherlv_3, grammarAccess.getRandomForestAccess().getCriterionKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestAccess().getRandomForestCriterionRandomForestCriterionEnumRuleCall_3_1_0());
					}
					lv_randomForestCriterion_4_0=ruleRandomForestCriterion
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestRule());
						}
						set(
							$current,
							"randomForestCriterion",
							lv_randomForestCriterion_4_0,
							"org.thingml.xtext.ThingML.RandomForestCriterion");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getRandomForestAccess().getCommaKeyword_4());
			}
		)?
		(
			otherlv_6='min_samples_split'
			{
				newLeafNode(otherlv_6, grammarAccess.getRandomForestAccess().getMin_samples_splitKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRandomForestAccess().getMin_samples_splitMin_samples_split_typeParserRuleCall_5_1_0());
					}
					lv_min_samples_split_7_0=ruleMin_samples_split_type
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRandomForestRule());
						}
						set(
							$current,
							"min_samples_split",
							lv_min_samples_split_7_0,
							"org.thingml.xtext.ThingML.Min_samples_split_type");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_8=')'
		{
			newLeafNode(otherlv_8, grammarAccess.getRandomForestAccess().getRightParenthesisKeyword_6());
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
			otherlv_3='no_hidden_layers'
			{
				newLeafNode(otherlv_3, grammarAccess.getNN_MultilayerPerceptronAccess().getNo_hidden_layersKeyword_3_0());
			}
			(
				(
					lv_no_hidden_layers_4_0=RULE_INT
					{
						newLeafNode(lv_no_hidden_layers_4_0, grammarAccess.getNN_MultilayerPerceptronAccess().getNo_hidden_layersINTTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						setWithLastConsumed(
							$current,
							"no_hidden_layers",
							lv_no_hidden_layers_4_0,
							"org.thingml.xtext.ThingML.INT");
					}
				)
			)
		)?
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_4());
			}
		)?
		(
			otherlv_6='activation'
			{
				newLeafNode(otherlv_6, grammarAccess.getNN_MultilayerPerceptronAccess().getActivationKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNN_MultilayerPerceptronAccess().getActivationActivationEnumRuleCall_5_1_0());
					}
					lv_activation_7_0=ruleActivation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						set(
							$current,
							"activation",
							lv_activation_7_0,
							"org.thingml.xtext.ThingML.Activation");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_8=','
			{
				newLeafNode(otherlv_8, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_6());
			}
		)?
		(
			otherlv_9='optimizer'
			{
				newLeafNode(otherlv_9, grammarAccess.getNN_MultilayerPerceptronAccess().getOptimizerKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNN_MultilayerPerceptronAccess().getOptimizerOptimizerEnumRuleCall_7_1_0());
					}
					lv_optimizer_10_0=ruleOptimizer
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						set(
							$current,
							"optimizer",
							lv_optimizer_10_0,
							"org.thingml.xtext.ThingML.Optimizer");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_11=','
			{
				newLeafNode(otherlv_11, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_8());
			}
		)?
		(
			otherlv_12='loss'
			{
				newLeafNode(otherlv_12, grammarAccess.getNN_MultilayerPerceptronAccess().getLossKeyword_9_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNN_MultilayerPerceptronAccess().getLossLossEnumRuleCall_9_1_0());
					}
					lv_loss_13_0=ruleLoss
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						set(
							$current,
							"loss",
							lv_loss_13_0,
							"org.thingml.xtext.ThingML.Loss");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_14=','
			{
				newLeafNode(otherlv_14, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_10());
			}
		)?
		(
			otherlv_15='epochs'
			{
				newLeafNode(otherlv_15, grammarAccess.getNN_MultilayerPerceptronAccess().getEpochsKeyword_11_0());
			}
			(
				(
					lv_epochs_16_0=RULE_INT
					{
						newLeafNode(lv_epochs_16_0, grammarAccess.getNN_MultilayerPerceptronAccess().getEpochsINTTerminalRuleCall_11_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						setWithLastConsumed(
							$current,
							"epochs",
							lv_epochs_16_0,
							"org.thingml.xtext.ThingML.INT");
					}
				)
			)
		)?
		(
			otherlv_17=','
			{
				newLeafNode(otherlv_17, grammarAccess.getNN_MultilayerPerceptronAccess().getCommaKeyword_12());
			}
		)?
		(
			otherlv_18='batch_size'
			{
				newLeafNode(otherlv_18, grammarAccess.getNN_MultilayerPerceptronAccess().getBatch_sizeKeyword_13_0());
			}
			(
				(
					lv_batch_size_19_0=RULE_INT
					{
						newLeafNode(lv_batch_size_19_0, grammarAccess.getNN_MultilayerPerceptronAccess().getBatch_sizeINTTerminalRuleCall_13_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getNN_MultilayerPerceptronRule());
						}
						setWithLastConsumed(
							$current,
							"batch_size",
							lv_batch_size_19_0,
							"org.thingml.xtext.ThingML.INT");
					}
				)
			)
		)?
		otherlv_20=')'
		{
			newLeafNode(otherlv_20, grammarAccess.getNN_MultilayerPerceptronAccess().getRightParenthesisKeyword_14());
		}
	)
;

// Entry rule entryRuleMin_samples_split_type
entryRuleMin_samples_split_type returns [String current=null]:
	{ newCompositeNode(grammarAccess.getMin_samples_split_typeRule()); }
	iv_ruleMin_samples_split_type=ruleMin_samples_split_type
	{ $current=$iv_ruleMin_samples_split_type.current.getText(); }
	EOF;

// Rule Min_samples_split_type
ruleMin_samples_split_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getMin_samples_split_typeAccess().getINTTerminalRuleCall_0());
		}
		    |
		this_FLOAT_1=RULE_FLOAT
		{
			$current.merge(this_FLOAT_1);
		}
		{
			newLeafNode(this_FLOAT_1, grammarAccess.getMin_samples_split_typeAccess().getFLOATTerminalRuleCall_1());
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
			enumLiteral_0='TRUE'
			{
				$current = grammarAccess.getSequentialAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getSequentialAccess().getTRUEEnumLiteralDeclaration_0());
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
			enumLiteral_0='ON'
			{
				$current = grammarAccess.getTimestampsAccess().getONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTimestampsAccess().getONEnumLiteralDeclaration_0());
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
			enumLiteral_0='ON'
			{
				$current = grammarAccess.getLabelsAccess().getONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getLabelsAccess().getONEnumLiteralDeclaration_0());
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
	)
;

// Rule DecisionTreeCriterion
ruleDecisionTreeCriterion returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='NO_IDEA'
			{
				$current = grammarAccess.getDecisionTreeCriterionAccess().getNO_IDEAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDecisionTreeCriterionAccess().getNO_IDEAEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='MSE'
			{
				$current = grammarAccess.getDecisionTreeCriterionAccess().getMSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDecisionTreeCriterionAccess().getMSEEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='FRIEDMAN_MSE'
			{
				$current = grammarAccess.getDecisionTreeCriterionAccess().getFRIEDMAN_MSEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getDecisionTreeCriterionAccess().getFRIEDMAN_MSEEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='MAE'
			{
				$current = grammarAccess.getDecisionTreeCriterionAccess().getMAEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getDecisionTreeCriterionAccess().getMAEEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='GINI'
			{
				$current = grammarAccess.getDecisionTreeCriterionAccess().getGINIEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getDecisionTreeCriterionAccess().getGINIEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='ENTROPY'
			{
				$current = grammarAccess.getDecisionTreeCriterionAccess().getENTROPYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getDecisionTreeCriterionAccess().getENTROPYEnumLiteralDeclaration_5());
			}
		)
	)
;

// Rule RandomForestCriterion
ruleRandomForestCriterion returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='NO_IDEA'
			{
				$current = grammarAccess.getRandomForestCriterionAccess().getNO_IDEAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getRandomForestCriterionAccess().getNO_IDEAEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='MSE'
			{
				$current = grammarAccess.getRandomForestCriterionAccess().getMSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getRandomForestCriterionAccess().getMSEEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='MAE'
			{
				$current = grammarAccess.getRandomForestCriterionAccess().getMAEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getRandomForestCriterionAccess().getMAEEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='GINI'
			{
				$current = grammarAccess.getRandomForestCriterionAccess().getGINIEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getRandomForestCriterionAccess().getGINIEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='ENTROPY'
			{
				$current = grammarAccess.getRandomForestCriterionAccess().getENTROPYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getRandomForestCriterionAccess().getENTROPYEnumLiteralDeclaration_4());
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
			enumLiteral_0='NO_IDEA'
			{
				$current = grammarAccess.getActivationAccess().getNO_IDEAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getActivationAccess().getNO_IDEAEnumLiteralDeclaration_0());
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
			enumLiteral_0='NO_IDEA'
			{
				$current = grammarAccess.getOptimizerAccess().getNO_IDEAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getOptimizerAccess().getNO_IDEAEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='SGD'
			{
				$current = grammarAccess.getOptimizerAccess().getSGDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getOptimizerAccess().getSGDEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='RMSprop'
			{
				$current = grammarAccess.getOptimizerAccess().getRMSPROPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getOptimizerAccess().getRMSPROPEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='Adam'
			{
				$current = grammarAccess.getOptimizerAccess().getADAMEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getOptimizerAccess().getADAMEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='Adadelta'
			{
				$current = grammarAccess.getOptimizerAccess().getADADELTAEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getOptimizerAccess().getADADELTAEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='Adagrad'
			{
				$current = grammarAccess.getOptimizerAccess().getADAGRADEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getOptimizerAccess().getADAGRADEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='Adamax'
			{
				$current = grammarAccess.getOptimizerAccess().getADAMAXEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getOptimizerAccess().getADAMAXEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='Nadam'
			{
				$current = grammarAccess.getOptimizerAccess().getNADAMEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getOptimizerAccess().getNADAMEnumLiteralDeclaration_7());
			}
		)
		    |
		(
			enumLiteral_8='Ftrl'
			{
				$current = grammarAccess.getOptimizerAccess().getFTRLEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_8, grammarAccess.getOptimizerAccess().getFTRLEnumLiteralDeclaration_8());
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
			enumLiteral_0='NO_IDEA'
			{
				$current = grammarAccess.getLossAccess().getNO_IDEAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getLossAccess().getNO_IDEAEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='sparse_categorical_crossentropy'
			{
				$current = grammarAccess.getLossAccess().getSPARSE_CATEGORICAL_CROSSENTROPYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getLossAccess().getSPARSE_CATEGORICAL_CROSSENTROPYEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='categorical_crossentropy'
			{
				$current = grammarAccess.getLossAccess().getCATEGORICAL_CROSSENTROPYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getLossAccess().getCATEGORICAL_CROSSENTROPYEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='MSE'
			{
				$current = grammarAccess.getLossAccess().getMSEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getLossAccess().getMSEEnumLiteralDeclaration_3());
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
