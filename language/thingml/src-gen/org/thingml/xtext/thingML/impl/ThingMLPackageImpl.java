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
package org.thingml.xtext.thingML.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.thingml.xtext.thingML.AbstractConnector;
import org.thingml.xtext.thingML.Action;
import org.thingml.xtext.thingML.ActionBlock;
import org.thingml.xtext.thingML.AndExpression;
import org.thingml.xtext.thingML.AnnotatedElement;
import org.thingml.xtext.thingML.ArrayIndex;
import org.thingml.xtext.thingML.ArrayInit;
import org.thingml.xtext.thingML.BooleanLiteral;
import org.thingml.xtext.thingML.ByteLiteral;
import org.thingml.xtext.thingML.CastExpression;
import org.thingml.xtext.thingML.CharLiteral;
import org.thingml.xtext.thingML.CombinatorialOptimization;
import org.thingml.xtext.thingML.CompositeState;
import org.thingml.xtext.thingML.ConditionalAction;
import org.thingml.xtext.thingML.ConfigPropertyAssign;
import org.thingml.xtext.thingML.Configuration;
import org.thingml.xtext.thingML.Connector;
import org.thingml.xtext.thingML.DAPredictAction;
import org.thingml.xtext.thingML.DAPreprocessAction;
import org.thingml.xtext.thingML.DASaveAction;
import org.thingml.xtext.thingML.DATrainAction;
import org.thingml.xtext.thingML.DataAnalytics;
import org.thingml.xtext.thingML.DataAnalyticsModelAlgorithm;
import org.thingml.xtext.thingML.DecisionTree;
import org.thingml.xtext.thingML.Decrement;
import org.thingml.xtext.thingML.DenoisingAutoencoders;
import org.thingml.xtext.thingML.DivExpression;
import org.thingml.xtext.thingML.DoubleLiteral;
import org.thingml.xtext.thingML.EnumLiteralRef;
import org.thingml.xtext.thingML.Enumeration;
import org.thingml.xtext.thingML.EnumerationLiteral;
import org.thingml.xtext.thingML.EqualsExpression;
import org.thingml.xtext.thingML.ErrorAction;
import org.thingml.xtext.thingML.Event;
import org.thingml.xtext.thingML.EventReference;
import org.thingml.xtext.thingML.Expression;
import org.thingml.xtext.thingML.ExpressionGroup;
import org.thingml.xtext.thingML.ExternExpression;
import org.thingml.xtext.thingML.ExternStatement;
import org.thingml.xtext.thingML.ExternalConnector;
import org.thingml.xtext.thingML.FactorialHiddenMarkovModel;
import org.thingml.xtext.thingML.FinalState;
import org.thingml.xtext.thingML.ForAction;
import org.thingml.xtext.thingML.Function;
import org.thingml.xtext.thingML.FunctionCallExpression;
import org.thingml.xtext.thingML.FunctionCallStatement;
import org.thingml.xtext.thingML.GatedRecurrentUnits;
import org.thingml.xtext.thingML.GreaterExpression;
import org.thingml.xtext.thingML.GreaterOrEqualExpression;
import org.thingml.xtext.thingML.Handler;
import org.thingml.xtext.thingML.Import;
import org.thingml.xtext.thingML.Increment;
import org.thingml.xtext.thingML.Instance;
import org.thingml.xtext.thingML.IntegerLiteral;
import org.thingml.xtext.thingML.InternalPort;
import org.thingml.xtext.thingML.InternalTransition;
import org.thingml.xtext.thingML.Labels;
import org.thingml.xtext.thingML.Literal;
import org.thingml.xtext.thingML.LocalVariable;
import org.thingml.xtext.thingML.LongShortTermMemory;
import org.thingml.xtext.thingML.LoopAction;
import org.thingml.xtext.thingML.LossFunction;
import org.thingml.xtext.thingML.LowerExpression;
import org.thingml.xtext.thingML.LowerOrEqualExpression;
import org.thingml.xtext.thingML.ML2_ModelAlgorithm;
import org.thingml.xtext.thingML.Message;
import org.thingml.xtext.thingML.MessageParameter;
import org.thingml.xtext.thingML.MinSamplesSplit;
import org.thingml.xtext.thingML.MinusExpression;
import org.thingml.xtext.thingML.ModExpression;
import org.thingml.xtext.thingML.NN_MultilayerPerceptron;
import org.thingml.xtext.thingML.NamedElement;
import org.thingml.xtext.thingML.NotEqualsExpression;
import org.thingml.xtext.thingML.NotExpression;
import org.thingml.xtext.thingML.ObjectType;
import org.thingml.xtext.thingML.Optimizer;
import org.thingml.xtext.thingML.OrExpression;
import org.thingml.xtext.thingML.PFA_ModelAlgorithm;
import org.thingml.xtext.thingML.PMML_ModelAlgorithm;
import org.thingml.xtext.thingML.Parameter;
import org.thingml.xtext.thingML.PlatformAnnotation;
import org.thingml.xtext.thingML.PlusExpression;
import org.thingml.xtext.thingML.Port;
import org.thingml.xtext.thingML.PrimitiveType;
import org.thingml.xtext.thingML.PrintAction;
import org.thingml.xtext.thingML.Property;
import org.thingml.xtext.thingML.PropertyAssign;
import org.thingml.xtext.thingML.PropertyReference;
import org.thingml.xtext.thingML.Protocol;
import org.thingml.xtext.thingML.ProvidedPort;
import org.thingml.xtext.thingML.RandomForest;
import org.thingml.xtext.thingML.ReceiveMessage;
import org.thingml.xtext.thingML.Region;
import org.thingml.xtext.thingML.RequiredPort;
import org.thingml.xtext.thingML.ReturnAction;
import org.thingml.xtext.thingML.SendAction;
import org.thingml.xtext.thingML.Sequential;
import org.thingml.xtext.thingML.Session;
import org.thingml.xtext.thingML.StartSession;
import org.thingml.xtext.thingML.State;
import org.thingml.xtext.thingML.StateContainer;
import org.thingml.xtext.thingML.StringLiteral;
import org.thingml.xtext.thingML.Thing;
import org.thingml.xtext.thingML.ThingMLFactory;
import org.thingml.xtext.thingML.ThingMLModel;
import org.thingml.xtext.thingML.ThingMLPackage;
import org.thingml.xtext.thingML.TimesExpression;
import org.thingml.xtext.thingML.Timestamps;
import org.thingml.xtext.thingML.Transition;
import org.thingml.xtext.thingML.Type;
import org.thingml.xtext.thingML.TypeRef;
import org.thingml.xtext.thingML.UnaryMinus;
import org.thingml.xtext.thingML.Variable;
import org.thingml.xtext.thingML.VariableAssignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThingMLPackageImpl extends EPackageImpl implements ThingMLPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass thingMLModelEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass importEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass platformAnnotationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass namedElementEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass annotatedElementEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass variableEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass typeRefEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass typeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass primitiveTypeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass objectTypeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass enumerationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass enumerationLiteralEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass thingEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass propertyAssignEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass protocolEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass functionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass propertyEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass messageEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass parameterEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass portEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass requiredPortEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass providedPortEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass internalPortEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass stateEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass handlerEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass transitionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass internalTransitionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass compositeStateEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass sessionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass regionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass finalStateEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass stateContainerEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass messageParameterEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass dataAnalyticsEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass dataAnalyticsModelAlgorithmEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass pmmL_ModelAlgorithmEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass pfA_ModelAlgorithmEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass ml2_ModelAlgorithmEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass decisionTreeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass randomForestEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass gatedRecurrentUnitsEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass longShortTermMemoryEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass nN_MultilayerPerceptronEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass denoisingAutoencodersEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass factorialHiddenMarkovModelEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass combinatorialOptimizationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass minSamplesSplitEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass eventEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass receiveMessageEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass actionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass actionBlockEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass externStatementEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass localVariableEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass sendActionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass variableAssignmentEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass incrementEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass decrementEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass forActionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass loopActionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass conditionalActionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass returnActionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass printActionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass errorActionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass startSessionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass functionCallStatementEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass daSaveActionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass daPreprocessActionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass daTrainActionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass daPredictActionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass expressionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass externExpressionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass literalEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass arrayInitEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass enumLiteralRefEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass byteLiteralEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass charLiteralEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass integerLiteralEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass booleanLiteralEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass stringLiteralEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass doubleLiteralEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass propertyReferenceEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass eventReferenceEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass functionCallExpressionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass configurationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass instanceEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass configPropertyAssignEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractConnectorEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass connectorEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass externalConnectorEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass orExpressionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass andExpressionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass equalsExpressionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass notEqualsExpressionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass greaterExpressionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass lowerExpressionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass greaterOrEqualExpressionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass lowerOrEqualExpressionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass plusExpressionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass minusExpressionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass timesExpressionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass divExpressionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass modExpressionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass castExpressionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass expressionGroupEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass notExpressionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass unaryMinusEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass arrayIndexEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum sequentialEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum timestampsEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum labelsEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum optimizerEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum lossFunctionEEnum = null;

  /**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.thingml.xtext.thingML.ThingMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private ThingMLPackageImpl()
  {
		super(eNS_URI, ThingMLFactory.eINSTANCE);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static boolean isInited = false;

  /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ThingMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static ThingMLPackage init()
  {
		if (isInited) return (ThingMLPackage)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredThingMLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ThingMLPackageImpl theThingMLPackage = registeredThingMLPackage instanceof ThingMLPackageImpl ? (ThingMLPackageImpl)registeredThingMLPackage : new ThingMLPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theThingMLPackage.createPackageContents();

		// Initialize created meta-data
		theThingMLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theThingMLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ThingMLPackage.eNS_URI, theThingMLPackage);
		return theThingMLPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getThingMLModel()
  {
		return thingMLModelEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getThingMLModel_Imports()
  {
		return (EReference)thingMLModelEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getThingMLModel_Types()
  {
		return (EReference)thingMLModelEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getThingMLModel_Protocols()
  {
		return (EReference)thingMLModelEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getThingMLModel_Configs()
  {
		return (EReference)thingMLModelEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getImport()
  {
		return importEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getImport_ImportURI()
  {
		return (EAttribute)importEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getImport_From()
  {
		return (EAttribute)importEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getPlatformAnnotation()
  {
		return platformAnnotationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getPlatformAnnotation_Name()
  {
		return (EAttribute)platformAnnotationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getPlatformAnnotation_Value()
  {
		return (EAttribute)platformAnnotationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getNamedElement()
  {
		return namedElementEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getNamedElement_Name()
  {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getAnnotatedElement()
  {
		return annotatedElementEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getAnnotatedElement_Annotations()
  {
		return (EReference)annotatedElementEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getVariable()
  {
		return variableEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getVariable_TypeRef()
  {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getTypeRef()
  {
		return typeRefEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getTypeRef_Type()
  {
		return (EReference)typeRefEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getTypeRef_IsArray()
  {
		return (EAttribute)typeRefEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getTypeRef_Cardinality()
  {
		return (EReference)typeRefEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getType()
  {
		return typeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getPrimitiveType()
  {
		return primitiveTypeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getPrimitiveType_ByteSize()
  {
		return (EAttribute)primitiveTypeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getObjectType()
  {
		return objectTypeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getEnumeration()
  {
		return enumerationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getEnumeration_TypeRef()
  {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getEnumeration_Literals()
  {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getEnumerationLiteral()
  {
		return enumerationLiteralEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getEnumerationLiteral_Init()
  {
		return (EReference)enumerationLiteralEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getThing()
  {
		return thingEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getThing_Fragment()
  {
		return (EAttribute)thingEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getThing_Includes()
  {
		return (EReference)thingEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getThing_Messages()
  {
		return (EReference)thingEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getThing_Ports()
  {
		return (EReference)thingEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getThing_Properties()
  {
		return (EReference)thingEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getThing_Functions()
  {
		return (EReference)thingEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getThing_Assign()
  {
		return (EReference)thingEClass.getEStructuralFeatures().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getThing_DataAnalytics()
  {
		return (EReference)thingEClass.getEStructuralFeatures().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getThing_Behaviour()
  {
		return (EReference)thingEClass.getEStructuralFeatures().get(8);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getPropertyAssign()
  {
		return propertyAssignEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getPropertyAssign_Property()
  {
		return (EReference)propertyAssignEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getPropertyAssign_Index()
  {
		return (EReference)propertyAssignEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getPropertyAssign_Init()
  {
		return (EReference)propertyAssignEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getProtocol()
  {
		return protocolEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getFunction()
  {
		return functionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getFunction_Parameters()
  {
		return (EReference)functionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getFunction_TypeRef()
  {
		return (EReference)functionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getFunction_Body()
  {
		return (EReference)functionEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getFunction_Abstract()
  {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getProperty()
  {
		return propertyEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getProperty_Readonly()
  {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getProperty_Init()
  {
		return (EReference)propertyEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getMessage()
  {
		return messageEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getMessage_Parameters()
  {
		return (EReference)messageEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getParameter()
  {
		return parameterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getPort()
  {
		return portEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getPort_Sends()
  {
		return (EReference)portEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getPort_Receives()
  {
		return (EReference)portEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getRequiredPort()
  {
		return requiredPortEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getRequiredPort_Optional()
  {
		return (EAttribute)requiredPortEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getProvidedPort()
  {
		return providedPortEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getInternalPort()
  {
		return internalPortEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getState()
  {
		return stateEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getState_Properties()
  {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getState_Entry()
  {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getState_Exit()
  {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getState_Internal()
  {
		return (EReference)stateEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getState_Outgoing()
  {
		return (EReference)stateEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getHandler()
  {
		return handlerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getHandler_Event()
  {
		return (EReference)handlerEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getHandler_Guard()
  {
		return (EReference)handlerEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getHandler_Action()
  {
		return (EReference)handlerEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getTransition()
  {
		return transitionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getTransition_Target()
  {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getInternalTransition()
  {
		return internalTransitionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getCompositeState()
  {
		return compositeStateEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getCompositeState_Region()
  {
		return (EReference)compositeStateEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getCompositeState_Session()
  {
		return (EReference)compositeStateEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getSession()
  {
		return sessionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getSession_MaxInstances()
  {
		return (EReference)sessionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getRegion()
  {
		return regionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getFinalState()
  {
		return finalStateEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getStateContainer()
  {
		return stateContainerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getStateContainer_Initial()
  {
		return (EReference)stateContainerEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getStateContainer_History()
  {
		return (EAttribute)stateContainerEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getStateContainer_Substate()
  {
		return (EReference)stateContainerEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getMessageParameter()
  {
		return messageParameterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getDataAnalytics()
  {
		return dataAnalyticsEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getDataAnalytics_Dataset()
  {
		return (EAttribute)dataAnalyticsEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getDataAnalytics_Sequential()
  {
		return (EAttribute)dataAnalyticsEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getDataAnalytics_Timestamps()
  {
		return (EAttribute)dataAnalyticsEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getDataAnalytics_Labels()
  {
		return (EAttribute)dataAnalyticsEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDataAnalytics_Features()
  {
		return (EReference)dataAnalyticsEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDataAnalytics_ModelAlgorithm()
  {
		return (EReference)dataAnalyticsEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getDataAnalytics_TrainingResults()
  {
		return (EAttribute)dataAnalyticsEClass.getEStructuralFeatures().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDataAnalytics_PredictionResults()
  {
		return (EReference)dataAnalyticsEClass.getEStructuralFeatures().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getDataAnalyticsModelAlgorithm()
  {
		return dataAnalyticsModelAlgorithmEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getDataAnalyticsModelAlgorithm_Name()
  {
		return (EAttribute)dataAnalyticsModelAlgorithmEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getPMML_ModelAlgorithm()
  {
		return pmmL_ModelAlgorithmEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getPMML_ModelAlgorithm_Pmml_path()
  {
		return (EAttribute)pmmL_ModelAlgorithmEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getPFA_ModelAlgorithm()
  {
		return pfA_ModelAlgorithmEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getPFA_ModelAlgorithm_Pfa_path()
  {
		return (EAttribute)pfA_ModelAlgorithmEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getML2_ModelAlgorithm()
  {
		return ml2_ModelAlgorithmEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getDecisionTree()
  {
		return decisionTreeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getDecisionTree_LossFunction()
  {
		return (EAttribute)decisionTreeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDecisionTree_Min_samples_split()
  {
		return (EReference)decisionTreeEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getRandomForest()
  {
		return randomForestEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getRandomForest_LossFunction()
  {
		return (EAttribute)randomForestEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getRandomForest_Min_samples_split()
  {
		return (EReference)randomForestEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getGatedRecurrentUnits()
  {
		return gatedRecurrentUnitsEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getGatedRecurrentUnits_Loss_function()
  {
		return (EAttribute)gatedRecurrentUnitsEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getGatedRecurrentUnits_Optimizer()
  {
		return (EAttribute)gatedRecurrentUnitsEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getGatedRecurrentUnits_Learning_rate()
  {
		return (EAttribute)gatedRecurrentUnitsEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getLongShortTermMemory()
  {
		return longShortTermMemoryEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getLongShortTermMemory_Loss_function()
  {
		return (EAttribute)longShortTermMemoryEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getLongShortTermMemory_Optimizer()
  {
		return (EAttribute)longShortTermMemoryEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getLongShortTermMemory_Learning_rate()
  {
		return (EAttribute)longShortTermMemoryEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getNN_MultilayerPerceptron()
  {
		return nN_MultilayerPerceptronEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getNN_MultilayerPerceptron_Loss_function()
  {
		return (EAttribute)nN_MultilayerPerceptronEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getNN_MultilayerPerceptron_Optimizer()
  {
		return (EAttribute)nN_MultilayerPerceptronEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getNN_MultilayerPerceptron_Learning_rate()
  {
		return (EAttribute)nN_MultilayerPerceptronEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getNN_MultilayerPerceptron_No_layers()
  {
		return (EAttribute)nN_MultilayerPerceptronEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getNN_MultilayerPerceptron_Dropout_probability()
  {
		return (EAttribute)nN_MultilayerPerceptronEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getDenoisingAutoencoders()
  {
		return denoisingAutoencodersEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getDenoisingAutoencoders_Loss_function()
  {
		return (EAttribute)denoisingAutoencodersEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getDenoisingAutoencoders_Optimizer()
  {
		return (EAttribute)denoisingAutoencodersEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getDenoisingAutoencoders_Learning_rate()
  {
		return (EAttribute)denoisingAutoencodersEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getDenoisingAutoencoders_Sequence_length()
  {
		return (EAttribute)denoisingAutoencodersEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getFactorialHiddenMarkovModel()
  {
		return factorialHiddenMarkovModelEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getCombinatorialOptimization()
  {
		return combinatorialOptimizationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getMinSamplesSplit()
  {
		return minSamplesSplitEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getEvent()
  {
		return eventEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getReceiveMessage()
  {
		return receiveMessageEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getReceiveMessage_Port()
  {
		return (EReference)receiveMessageEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getReceiveMessage_Message()
  {
		return (EReference)receiveMessageEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getAction()
  {
		return actionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getActionBlock()
  {
		return actionBlockEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getActionBlock_Actions()
  {
		return (EReference)actionBlockEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getExternStatement()
  {
		return externStatementEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getExternStatement_Statement()
  {
		return (EAttribute)externStatementEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getExternStatement_Segments()
  {
		return (EReference)externStatementEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getLocalVariable()
  {
		return localVariableEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getLocalVariable_Readonly()
  {
		return (EAttribute)localVariableEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getLocalVariable_Init()
  {
		return (EReference)localVariableEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getSendAction()
  {
		return sendActionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getSendAction_Port()
  {
		return (EReference)sendActionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getSendAction_Message()
  {
		return (EReference)sendActionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getSendAction_Parameters()
  {
		return (EReference)sendActionEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getVariableAssignment()
  {
		return variableAssignmentEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getVariableAssignment_Property()
  {
		return (EReference)variableAssignmentEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getVariableAssignment_Index()
  {
		return (EReference)variableAssignmentEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getVariableAssignment_Expression()
  {
		return (EReference)variableAssignmentEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getIncrement()
  {
		return incrementEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getIncrement_Var()
  {
		return (EReference)incrementEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getDecrement()
  {
		return decrementEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDecrement_Var()
  {
		return (EReference)decrementEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getForAction()
  {
		return forActionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getForAction_Variable()
  {
		return (EReference)forActionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getForAction_Index()
  {
		return (EReference)forActionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getForAction_Array()
  {
		return (EReference)forActionEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getForAction_Action()
  {
		return (EReference)forActionEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getLoopAction()
  {
		return loopActionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getLoopAction_Condition()
  {
		return (EReference)loopActionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getLoopAction_Action()
  {
		return (EReference)loopActionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getConditionalAction()
  {
		return conditionalActionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getConditionalAction_Condition()
  {
		return (EReference)conditionalActionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getConditionalAction_Action()
  {
		return (EReference)conditionalActionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getConditionalAction_ElseAction()
  {
		return (EReference)conditionalActionEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getReturnAction()
  {
		return returnActionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getReturnAction_Exp()
  {
		return (EReference)returnActionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getPrintAction()
  {
		return printActionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getPrintAction_Line()
  {
		return (EAttribute)printActionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getPrintAction_Msg()
  {
		return (EReference)printActionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getErrorAction()
  {
		return errorActionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getErrorAction_Line()
  {
		return (EAttribute)errorActionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getErrorAction_Msg()
  {
		return (EReference)errorActionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getStartSession()
  {
		return startSessionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getStartSession_Session()
  {
		return (EReference)startSessionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getFunctionCallStatement()
  {
		return functionCallStatementEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getFunctionCallStatement_Function()
  {
		return (EReference)functionCallStatementEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getFunctionCallStatement_Parameters()
  {
		return (EReference)functionCallStatementEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getDASaveAction()
  {
		return daSaveActionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDASaveAction_DataAnalytics()
  {
		return (EReference)daSaveActionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getDAPreprocessAction()
  {
		return daPreprocessActionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDAPreprocessAction_DataAnalytics()
  {
		return (EReference)daPreprocessActionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getDATrainAction()
  {
		return daTrainActionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDATrainAction_DataAnalytics()
  {
		return (EReference)daTrainActionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getDAPredictAction()
  {
		return daPredictActionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDAPredictAction_DataAnalytics()
  {
		return (EReference)daPredictActionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDAPredictAction_Features()
  {
		return (EReference)daPredictActionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getExpression()
  {
		return expressionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getExternExpression()
  {
		return externExpressionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getExternExpression_Expression()
  {
		return (EAttribute)externExpressionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getExternExpression_Segments()
  {
		return (EReference)externExpressionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getLiteral()
  {
		return literalEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getArrayInit()
  {
		return arrayInitEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getArrayInit_Values()
  {
		return (EReference)arrayInitEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getEnumLiteralRef()
  {
		return enumLiteralRefEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getEnumLiteralRef_Enum()
  {
		return (EReference)enumLiteralRefEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getEnumLiteralRef_Literal()
  {
		return (EReference)enumLiteralRefEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getByteLiteral()
  {
		return byteLiteralEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getByteLiteral_ByteValue()
  {
		return (EAttribute)byteLiteralEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getCharLiteral()
  {
		return charLiteralEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getCharLiteral_CharValue()
  {
		return (EAttribute)charLiteralEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getIntegerLiteral()
  {
		return integerLiteralEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getIntegerLiteral_IntValue()
  {
		return (EAttribute)integerLiteralEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getBooleanLiteral()
  {
		return booleanLiteralEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getBooleanLiteral_BoolValue()
  {
		return (EAttribute)booleanLiteralEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getStringLiteral()
  {
		return stringLiteralEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getStringLiteral_StringValue()
  {
		return (EAttribute)stringLiteralEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getDoubleLiteral()
  {
		return doubleLiteralEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getDoubleLiteral_DoubleValue()
  {
		return (EAttribute)doubleLiteralEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getPropertyReference()
  {
		return propertyReferenceEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getPropertyReference_Property()
  {
		return (EReference)propertyReferenceEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getEventReference()
  {
		return eventReferenceEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getEventReference_ReceiveMsg()
  {
		return (EReference)eventReferenceEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getEventReference_Parameter()
  {
		return (EReference)eventReferenceEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getFunctionCallExpression()
  {
		return functionCallExpressionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getFunctionCallExpression_Function()
  {
		return (EReference)functionCallExpressionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getFunctionCallExpression_Parameters()
  {
		return (EReference)functionCallExpressionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getConfiguration()
  {
		return configurationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getConfiguration_Instances()
  {
		return (EReference)configurationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getConfiguration_Connectors()
  {
		return (EReference)configurationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getConfiguration_Propassigns()
  {
		return (EReference)configurationEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getInstance()
  {
		return instanceEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getInstance_Type()
  {
		return (EReference)instanceEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getConfigPropertyAssign()
  {
		return configPropertyAssignEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getConfigPropertyAssign_Instance()
  {
		return (EReference)configPropertyAssignEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getConfigPropertyAssign_Property()
  {
		return (EReference)configPropertyAssignEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getConfigPropertyAssign_Index()
  {
		return (EReference)configPropertyAssignEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getConfigPropertyAssign_Init()
  {
		return (EReference)configPropertyAssignEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getConfigPropertyAssign_Annotations()
  {
		return (EReference)configPropertyAssignEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getAbstractConnector()
  {
		return abstractConnectorEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getConnector()
  {
		return connectorEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getConnector_Cli()
  {
		return (EReference)connectorEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getConnector_Required()
  {
		return (EReference)connectorEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getConnector_Srv()
  {
		return (EReference)connectorEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getConnector_Provided()
  {
		return (EReference)connectorEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getExternalConnector()
  {
		return externalConnectorEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getExternalConnector_Inst()
  {
		return (EReference)externalConnectorEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getExternalConnector_Port()
  {
		return (EReference)externalConnectorEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getExternalConnector_Protocol()
  {
		return (EReference)externalConnectorEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getOrExpression()
  {
		return orExpressionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getOrExpression_Lhs()
  {
		return (EReference)orExpressionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getOrExpression_Rhs()
  {
		return (EReference)orExpressionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getAndExpression()
  {
		return andExpressionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getAndExpression_Lhs()
  {
		return (EReference)andExpressionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getAndExpression_Rhs()
  {
		return (EReference)andExpressionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getEqualsExpression()
  {
		return equalsExpressionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getEqualsExpression_Lhs()
  {
		return (EReference)equalsExpressionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getEqualsExpression_Rhs()
  {
		return (EReference)equalsExpressionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getNotEqualsExpression()
  {
		return notEqualsExpressionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getNotEqualsExpression_Lhs()
  {
		return (EReference)notEqualsExpressionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getNotEqualsExpression_Rhs()
  {
		return (EReference)notEqualsExpressionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getGreaterExpression()
  {
		return greaterExpressionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getGreaterExpression_Lhs()
  {
		return (EReference)greaterExpressionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getGreaterExpression_Rhs()
  {
		return (EReference)greaterExpressionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getLowerExpression()
  {
		return lowerExpressionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getLowerExpression_Lhs()
  {
		return (EReference)lowerExpressionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getLowerExpression_Rhs()
  {
		return (EReference)lowerExpressionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getGreaterOrEqualExpression()
  {
		return greaterOrEqualExpressionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getGreaterOrEqualExpression_Lhs()
  {
		return (EReference)greaterOrEqualExpressionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getGreaterOrEqualExpression_Rhs()
  {
		return (EReference)greaterOrEqualExpressionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getLowerOrEqualExpression()
  {
		return lowerOrEqualExpressionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getLowerOrEqualExpression_Lhs()
  {
		return (EReference)lowerOrEqualExpressionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getLowerOrEqualExpression_Rhs()
  {
		return (EReference)lowerOrEqualExpressionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getPlusExpression()
  {
		return plusExpressionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getPlusExpression_Lhs()
  {
		return (EReference)plusExpressionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getPlusExpression_Rhs()
  {
		return (EReference)plusExpressionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getMinusExpression()
  {
		return minusExpressionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getMinusExpression_Lhs()
  {
		return (EReference)minusExpressionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getMinusExpression_Rhs()
  {
		return (EReference)minusExpressionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getTimesExpression()
  {
		return timesExpressionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getTimesExpression_Lhs()
  {
		return (EReference)timesExpressionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getTimesExpression_Rhs()
  {
		return (EReference)timesExpressionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getDivExpression()
  {
		return divExpressionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDivExpression_Lhs()
  {
		return (EReference)divExpressionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getDivExpression_Rhs()
  {
		return (EReference)divExpressionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getModExpression()
  {
		return modExpressionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getModExpression_Lhs()
  {
		return (EReference)modExpressionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getModExpression_Rhs()
  {
		return (EReference)modExpressionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getCastExpression()
  {
		return castExpressionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getCastExpression_Term()
  {
		return (EReference)castExpressionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getCastExpression_Type()
  {
		return (EReference)castExpressionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EAttribute getCastExpression_IsArray()
  {
		return (EAttribute)castExpressionEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getExpressionGroup()
  {
		return expressionGroupEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getExpressionGroup_Term()
  {
		return (EReference)expressionGroupEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getNotExpression()
  {
		return notExpressionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getNotExpression_Term()
  {
		return (EReference)notExpressionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getUnaryMinus()
  {
		return unaryMinusEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getUnaryMinus_Term()
  {
		return (EReference)unaryMinusEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EClass getArrayIndex()
  {
		return arrayIndexEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getArrayIndex_Array()
  {
		return (EReference)arrayIndexEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EReference getArrayIndex_Index()
  {
		return (EReference)arrayIndexEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EEnum getSequential()
  {
		return sequentialEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EEnum getTimestamps()
  {
		return timestampsEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EEnum getLabels()
  {
		return labelsEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EEnum getOptimizer()
  {
		return optimizerEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EEnum getLossFunction()
  {
		return lossFunctionEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ThingMLFactory getThingMLFactory()
  {
		return (ThingMLFactory)getEFactoryInstance();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isCreated = false;

  /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		thingMLModelEClass = createEClass(THING_ML_MODEL);
		createEReference(thingMLModelEClass, THING_ML_MODEL__IMPORTS);
		createEReference(thingMLModelEClass, THING_ML_MODEL__TYPES);
		createEReference(thingMLModelEClass, THING_ML_MODEL__PROTOCOLS);
		createEReference(thingMLModelEClass, THING_ML_MODEL__CONFIGS);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__IMPORT_URI);
		createEAttribute(importEClass, IMPORT__FROM);

		platformAnnotationEClass = createEClass(PLATFORM_ANNOTATION);
		createEAttribute(platformAnnotationEClass, PLATFORM_ANNOTATION__NAME);
		createEAttribute(platformAnnotationEClass, PLATFORM_ANNOTATION__VALUE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		annotatedElementEClass = createEClass(ANNOTATED_ELEMENT);
		createEReference(annotatedElementEClass, ANNOTATED_ELEMENT__ANNOTATIONS);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__TYPE_REF);

		typeRefEClass = createEClass(TYPE_REF);
		createEReference(typeRefEClass, TYPE_REF__TYPE);
		createEAttribute(typeRefEClass, TYPE_REF__IS_ARRAY);
		createEReference(typeRefEClass, TYPE_REF__CARDINALITY);

		typeEClass = createEClass(TYPE);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);
		createEAttribute(primitiveTypeEClass, PRIMITIVE_TYPE__BYTE_SIZE);

		objectTypeEClass = createEClass(OBJECT_TYPE);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__TYPE_REF);
		createEReference(enumerationEClass, ENUMERATION__LITERALS);

		enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);
		createEReference(enumerationLiteralEClass, ENUMERATION_LITERAL__INIT);

		thingEClass = createEClass(THING);
		createEAttribute(thingEClass, THING__FRAGMENT);
		createEReference(thingEClass, THING__INCLUDES);
		createEReference(thingEClass, THING__MESSAGES);
		createEReference(thingEClass, THING__PORTS);
		createEReference(thingEClass, THING__PROPERTIES);
		createEReference(thingEClass, THING__FUNCTIONS);
		createEReference(thingEClass, THING__ASSIGN);
		createEReference(thingEClass, THING__DATA_ANALYTICS);
		createEReference(thingEClass, THING__BEHAVIOUR);

		propertyAssignEClass = createEClass(PROPERTY_ASSIGN);
		createEReference(propertyAssignEClass, PROPERTY_ASSIGN__PROPERTY);
		createEReference(propertyAssignEClass, PROPERTY_ASSIGN__INDEX);
		createEReference(propertyAssignEClass, PROPERTY_ASSIGN__INIT);

		protocolEClass = createEClass(PROTOCOL);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__PARAMETERS);
		createEReference(functionEClass, FUNCTION__TYPE_REF);
		createEReference(functionEClass, FUNCTION__BODY);
		createEAttribute(functionEClass, FUNCTION__ABSTRACT);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__READONLY);
		createEReference(propertyEClass, PROPERTY__INIT);

		messageEClass = createEClass(MESSAGE);
		createEReference(messageEClass, MESSAGE__PARAMETERS);

		parameterEClass = createEClass(PARAMETER);

		portEClass = createEClass(PORT);
		createEReference(portEClass, PORT__SENDS);
		createEReference(portEClass, PORT__RECEIVES);

		requiredPortEClass = createEClass(REQUIRED_PORT);
		createEAttribute(requiredPortEClass, REQUIRED_PORT__OPTIONAL);

		providedPortEClass = createEClass(PROVIDED_PORT);

		internalPortEClass = createEClass(INTERNAL_PORT);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__PROPERTIES);
		createEReference(stateEClass, STATE__ENTRY);
		createEReference(stateEClass, STATE__EXIT);
		createEReference(stateEClass, STATE__INTERNAL);
		createEReference(stateEClass, STATE__OUTGOING);

		handlerEClass = createEClass(HANDLER);
		createEReference(handlerEClass, HANDLER__EVENT);
		createEReference(handlerEClass, HANDLER__GUARD);
		createEReference(handlerEClass, HANDLER__ACTION);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__TARGET);

		internalTransitionEClass = createEClass(INTERNAL_TRANSITION);

		compositeStateEClass = createEClass(COMPOSITE_STATE);
		createEReference(compositeStateEClass, COMPOSITE_STATE__REGION);
		createEReference(compositeStateEClass, COMPOSITE_STATE__SESSION);

		sessionEClass = createEClass(SESSION);
		createEReference(sessionEClass, SESSION__MAX_INSTANCES);

		regionEClass = createEClass(REGION);

		finalStateEClass = createEClass(FINAL_STATE);

		stateContainerEClass = createEClass(STATE_CONTAINER);
		createEReference(stateContainerEClass, STATE_CONTAINER__INITIAL);
		createEAttribute(stateContainerEClass, STATE_CONTAINER__HISTORY);
		createEReference(stateContainerEClass, STATE_CONTAINER__SUBSTATE);

		messageParameterEClass = createEClass(MESSAGE_PARAMETER);

		dataAnalyticsEClass = createEClass(DATA_ANALYTICS);
		createEAttribute(dataAnalyticsEClass, DATA_ANALYTICS__DATASET);
		createEAttribute(dataAnalyticsEClass, DATA_ANALYTICS__SEQUENTIAL);
		createEAttribute(dataAnalyticsEClass, DATA_ANALYTICS__TIMESTAMPS);
		createEAttribute(dataAnalyticsEClass, DATA_ANALYTICS__LABELS);
		createEReference(dataAnalyticsEClass, DATA_ANALYTICS__FEATURES);
		createEReference(dataAnalyticsEClass, DATA_ANALYTICS__MODEL_ALGORITHM);
		createEAttribute(dataAnalyticsEClass, DATA_ANALYTICS__TRAINING_RESULTS);
		createEReference(dataAnalyticsEClass, DATA_ANALYTICS__PREDICTION_RESULTS);

		dataAnalyticsModelAlgorithmEClass = createEClass(DATA_ANALYTICS_MODEL_ALGORITHM);
		createEAttribute(dataAnalyticsModelAlgorithmEClass, DATA_ANALYTICS_MODEL_ALGORITHM__NAME);

		pmmL_ModelAlgorithmEClass = createEClass(PMML_MODEL_ALGORITHM);
		createEAttribute(pmmL_ModelAlgorithmEClass, PMML_MODEL_ALGORITHM__PMML_PATH);

		pfA_ModelAlgorithmEClass = createEClass(PFA_MODEL_ALGORITHM);
		createEAttribute(pfA_ModelAlgorithmEClass, PFA_MODEL_ALGORITHM__PFA_PATH);

		ml2_ModelAlgorithmEClass = createEClass(ML2_MODEL_ALGORITHM);

		decisionTreeEClass = createEClass(DECISION_TREE);
		createEAttribute(decisionTreeEClass, DECISION_TREE__LOSS_FUNCTION);
		createEReference(decisionTreeEClass, DECISION_TREE__MIN_SAMPLES_SPLIT);

		randomForestEClass = createEClass(RANDOM_FOREST);
		createEAttribute(randomForestEClass, RANDOM_FOREST__LOSS_FUNCTION);
		createEReference(randomForestEClass, RANDOM_FOREST__MIN_SAMPLES_SPLIT);

		gatedRecurrentUnitsEClass = createEClass(GATED_RECURRENT_UNITS);
		createEAttribute(gatedRecurrentUnitsEClass, GATED_RECURRENT_UNITS__LOSS_FUNCTION);
		createEAttribute(gatedRecurrentUnitsEClass, GATED_RECURRENT_UNITS__OPTIMIZER);
		createEAttribute(gatedRecurrentUnitsEClass, GATED_RECURRENT_UNITS__LEARNING_RATE);

		longShortTermMemoryEClass = createEClass(LONG_SHORT_TERM_MEMORY);
		createEAttribute(longShortTermMemoryEClass, LONG_SHORT_TERM_MEMORY__LOSS_FUNCTION);
		createEAttribute(longShortTermMemoryEClass, LONG_SHORT_TERM_MEMORY__OPTIMIZER);
		createEAttribute(longShortTermMemoryEClass, LONG_SHORT_TERM_MEMORY__LEARNING_RATE);

		nN_MultilayerPerceptronEClass = createEClass(NN_MULTILAYER_PERCEPTRON);
		createEAttribute(nN_MultilayerPerceptronEClass, NN_MULTILAYER_PERCEPTRON__LOSS_FUNCTION);
		createEAttribute(nN_MultilayerPerceptronEClass, NN_MULTILAYER_PERCEPTRON__OPTIMIZER);
		createEAttribute(nN_MultilayerPerceptronEClass, NN_MULTILAYER_PERCEPTRON__LEARNING_RATE);
		createEAttribute(nN_MultilayerPerceptronEClass, NN_MULTILAYER_PERCEPTRON__NO_LAYERS);
		createEAttribute(nN_MultilayerPerceptronEClass, NN_MULTILAYER_PERCEPTRON__DROPOUT_PROBABILITY);

		denoisingAutoencodersEClass = createEClass(DENOISING_AUTOENCODERS);
		createEAttribute(denoisingAutoencodersEClass, DENOISING_AUTOENCODERS__LOSS_FUNCTION);
		createEAttribute(denoisingAutoencodersEClass, DENOISING_AUTOENCODERS__OPTIMIZER);
		createEAttribute(denoisingAutoencodersEClass, DENOISING_AUTOENCODERS__LEARNING_RATE);
		createEAttribute(denoisingAutoencodersEClass, DENOISING_AUTOENCODERS__SEQUENCE_LENGTH);

		factorialHiddenMarkovModelEClass = createEClass(FACTORIAL_HIDDEN_MARKOV_MODEL);

		combinatorialOptimizationEClass = createEClass(COMBINATORIAL_OPTIMIZATION);

		minSamplesSplitEClass = createEClass(MIN_SAMPLES_SPLIT);

		eventEClass = createEClass(EVENT);

		receiveMessageEClass = createEClass(RECEIVE_MESSAGE);
		createEReference(receiveMessageEClass, RECEIVE_MESSAGE__PORT);
		createEReference(receiveMessageEClass, RECEIVE_MESSAGE__MESSAGE);

		actionEClass = createEClass(ACTION);

		actionBlockEClass = createEClass(ACTION_BLOCK);
		createEReference(actionBlockEClass, ACTION_BLOCK__ACTIONS);

		externStatementEClass = createEClass(EXTERN_STATEMENT);
		createEAttribute(externStatementEClass, EXTERN_STATEMENT__STATEMENT);
		createEReference(externStatementEClass, EXTERN_STATEMENT__SEGMENTS);

		localVariableEClass = createEClass(LOCAL_VARIABLE);
		createEAttribute(localVariableEClass, LOCAL_VARIABLE__READONLY);
		createEReference(localVariableEClass, LOCAL_VARIABLE__INIT);

		sendActionEClass = createEClass(SEND_ACTION);
		createEReference(sendActionEClass, SEND_ACTION__PORT);
		createEReference(sendActionEClass, SEND_ACTION__MESSAGE);
		createEReference(sendActionEClass, SEND_ACTION__PARAMETERS);

		variableAssignmentEClass = createEClass(VARIABLE_ASSIGNMENT);
		createEReference(variableAssignmentEClass, VARIABLE_ASSIGNMENT__PROPERTY);
		createEReference(variableAssignmentEClass, VARIABLE_ASSIGNMENT__INDEX);
		createEReference(variableAssignmentEClass, VARIABLE_ASSIGNMENT__EXPRESSION);

		incrementEClass = createEClass(INCREMENT);
		createEReference(incrementEClass, INCREMENT__VAR);

		decrementEClass = createEClass(DECREMENT);
		createEReference(decrementEClass, DECREMENT__VAR);

		forActionEClass = createEClass(FOR_ACTION);
		createEReference(forActionEClass, FOR_ACTION__VARIABLE);
		createEReference(forActionEClass, FOR_ACTION__INDEX);
		createEReference(forActionEClass, FOR_ACTION__ARRAY);
		createEReference(forActionEClass, FOR_ACTION__ACTION);

		loopActionEClass = createEClass(LOOP_ACTION);
		createEReference(loopActionEClass, LOOP_ACTION__CONDITION);
		createEReference(loopActionEClass, LOOP_ACTION__ACTION);

		conditionalActionEClass = createEClass(CONDITIONAL_ACTION);
		createEReference(conditionalActionEClass, CONDITIONAL_ACTION__CONDITION);
		createEReference(conditionalActionEClass, CONDITIONAL_ACTION__ACTION);
		createEReference(conditionalActionEClass, CONDITIONAL_ACTION__ELSE_ACTION);

		returnActionEClass = createEClass(RETURN_ACTION);
		createEReference(returnActionEClass, RETURN_ACTION__EXP);

		printActionEClass = createEClass(PRINT_ACTION);
		createEAttribute(printActionEClass, PRINT_ACTION__LINE);
		createEReference(printActionEClass, PRINT_ACTION__MSG);

		errorActionEClass = createEClass(ERROR_ACTION);
		createEAttribute(errorActionEClass, ERROR_ACTION__LINE);
		createEReference(errorActionEClass, ERROR_ACTION__MSG);

		startSessionEClass = createEClass(START_SESSION);
		createEReference(startSessionEClass, START_SESSION__SESSION);

		functionCallStatementEClass = createEClass(FUNCTION_CALL_STATEMENT);
		createEReference(functionCallStatementEClass, FUNCTION_CALL_STATEMENT__FUNCTION);
		createEReference(functionCallStatementEClass, FUNCTION_CALL_STATEMENT__PARAMETERS);

		daSaveActionEClass = createEClass(DA_SAVE_ACTION);
		createEReference(daSaveActionEClass, DA_SAVE_ACTION__DATA_ANALYTICS);

		daPreprocessActionEClass = createEClass(DA_PREPROCESS_ACTION);
		createEReference(daPreprocessActionEClass, DA_PREPROCESS_ACTION__DATA_ANALYTICS);

		daTrainActionEClass = createEClass(DA_TRAIN_ACTION);
		createEReference(daTrainActionEClass, DA_TRAIN_ACTION__DATA_ANALYTICS);

		daPredictActionEClass = createEClass(DA_PREDICT_ACTION);
		createEReference(daPredictActionEClass, DA_PREDICT_ACTION__DATA_ANALYTICS);
		createEReference(daPredictActionEClass, DA_PREDICT_ACTION__FEATURES);

		expressionEClass = createEClass(EXPRESSION);

		externExpressionEClass = createEClass(EXTERN_EXPRESSION);
		createEAttribute(externExpressionEClass, EXTERN_EXPRESSION__EXPRESSION);
		createEReference(externExpressionEClass, EXTERN_EXPRESSION__SEGMENTS);

		literalEClass = createEClass(LITERAL);

		arrayInitEClass = createEClass(ARRAY_INIT);
		createEReference(arrayInitEClass, ARRAY_INIT__VALUES);

		enumLiteralRefEClass = createEClass(ENUM_LITERAL_REF);
		createEReference(enumLiteralRefEClass, ENUM_LITERAL_REF__ENUM);
		createEReference(enumLiteralRefEClass, ENUM_LITERAL_REF__LITERAL);

		byteLiteralEClass = createEClass(BYTE_LITERAL);
		createEAttribute(byteLiteralEClass, BYTE_LITERAL__BYTE_VALUE);

		charLiteralEClass = createEClass(CHAR_LITERAL);
		createEAttribute(charLiteralEClass, CHAR_LITERAL__CHAR_VALUE);

		integerLiteralEClass = createEClass(INTEGER_LITERAL);
		createEAttribute(integerLiteralEClass, INTEGER_LITERAL__INT_VALUE);

		booleanLiteralEClass = createEClass(BOOLEAN_LITERAL);
		createEAttribute(booleanLiteralEClass, BOOLEAN_LITERAL__BOOL_VALUE);

		stringLiteralEClass = createEClass(STRING_LITERAL);
		createEAttribute(stringLiteralEClass, STRING_LITERAL__STRING_VALUE);

		doubleLiteralEClass = createEClass(DOUBLE_LITERAL);
		createEAttribute(doubleLiteralEClass, DOUBLE_LITERAL__DOUBLE_VALUE);

		propertyReferenceEClass = createEClass(PROPERTY_REFERENCE);
		createEReference(propertyReferenceEClass, PROPERTY_REFERENCE__PROPERTY);

		eventReferenceEClass = createEClass(EVENT_REFERENCE);
		createEReference(eventReferenceEClass, EVENT_REFERENCE__RECEIVE_MSG);
		createEReference(eventReferenceEClass, EVENT_REFERENCE__PARAMETER);

		functionCallExpressionEClass = createEClass(FUNCTION_CALL_EXPRESSION);
		createEReference(functionCallExpressionEClass, FUNCTION_CALL_EXPRESSION__FUNCTION);
		createEReference(functionCallExpressionEClass, FUNCTION_CALL_EXPRESSION__PARAMETERS);

		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__INSTANCES);
		createEReference(configurationEClass, CONFIGURATION__CONNECTORS);
		createEReference(configurationEClass, CONFIGURATION__PROPASSIGNS);

		instanceEClass = createEClass(INSTANCE);
		createEReference(instanceEClass, INSTANCE__TYPE);

		configPropertyAssignEClass = createEClass(CONFIG_PROPERTY_ASSIGN);
		createEReference(configPropertyAssignEClass, CONFIG_PROPERTY_ASSIGN__INSTANCE);
		createEReference(configPropertyAssignEClass, CONFIG_PROPERTY_ASSIGN__PROPERTY);
		createEReference(configPropertyAssignEClass, CONFIG_PROPERTY_ASSIGN__INDEX);
		createEReference(configPropertyAssignEClass, CONFIG_PROPERTY_ASSIGN__INIT);
		createEReference(configPropertyAssignEClass, CONFIG_PROPERTY_ASSIGN__ANNOTATIONS);

		abstractConnectorEClass = createEClass(ABSTRACT_CONNECTOR);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__CLI);
		createEReference(connectorEClass, CONNECTOR__REQUIRED);
		createEReference(connectorEClass, CONNECTOR__SRV);
		createEReference(connectorEClass, CONNECTOR__PROVIDED);

		externalConnectorEClass = createEClass(EXTERNAL_CONNECTOR);
		createEReference(externalConnectorEClass, EXTERNAL_CONNECTOR__INST);
		createEReference(externalConnectorEClass, EXTERNAL_CONNECTOR__PORT);
		createEReference(externalConnectorEClass, EXTERNAL_CONNECTOR__PROTOCOL);

		orExpressionEClass = createEClass(OR_EXPRESSION);
		createEReference(orExpressionEClass, OR_EXPRESSION__LHS);
		createEReference(orExpressionEClass, OR_EXPRESSION__RHS);

		andExpressionEClass = createEClass(AND_EXPRESSION);
		createEReference(andExpressionEClass, AND_EXPRESSION__LHS);
		createEReference(andExpressionEClass, AND_EXPRESSION__RHS);

		equalsExpressionEClass = createEClass(EQUALS_EXPRESSION);
		createEReference(equalsExpressionEClass, EQUALS_EXPRESSION__LHS);
		createEReference(equalsExpressionEClass, EQUALS_EXPRESSION__RHS);

		notEqualsExpressionEClass = createEClass(NOT_EQUALS_EXPRESSION);
		createEReference(notEqualsExpressionEClass, NOT_EQUALS_EXPRESSION__LHS);
		createEReference(notEqualsExpressionEClass, NOT_EQUALS_EXPRESSION__RHS);

		greaterExpressionEClass = createEClass(GREATER_EXPRESSION);
		createEReference(greaterExpressionEClass, GREATER_EXPRESSION__LHS);
		createEReference(greaterExpressionEClass, GREATER_EXPRESSION__RHS);

		lowerExpressionEClass = createEClass(LOWER_EXPRESSION);
		createEReference(lowerExpressionEClass, LOWER_EXPRESSION__LHS);
		createEReference(lowerExpressionEClass, LOWER_EXPRESSION__RHS);

		greaterOrEqualExpressionEClass = createEClass(GREATER_OR_EQUAL_EXPRESSION);
		createEReference(greaterOrEqualExpressionEClass, GREATER_OR_EQUAL_EXPRESSION__LHS);
		createEReference(greaterOrEqualExpressionEClass, GREATER_OR_EQUAL_EXPRESSION__RHS);

		lowerOrEqualExpressionEClass = createEClass(LOWER_OR_EQUAL_EXPRESSION);
		createEReference(lowerOrEqualExpressionEClass, LOWER_OR_EQUAL_EXPRESSION__LHS);
		createEReference(lowerOrEqualExpressionEClass, LOWER_OR_EQUAL_EXPRESSION__RHS);

		plusExpressionEClass = createEClass(PLUS_EXPRESSION);
		createEReference(plusExpressionEClass, PLUS_EXPRESSION__LHS);
		createEReference(plusExpressionEClass, PLUS_EXPRESSION__RHS);

		minusExpressionEClass = createEClass(MINUS_EXPRESSION);
		createEReference(minusExpressionEClass, MINUS_EXPRESSION__LHS);
		createEReference(minusExpressionEClass, MINUS_EXPRESSION__RHS);

		timesExpressionEClass = createEClass(TIMES_EXPRESSION);
		createEReference(timesExpressionEClass, TIMES_EXPRESSION__LHS);
		createEReference(timesExpressionEClass, TIMES_EXPRESSION__RHS);

		divExpressionEClass = createEClass(DIV_EXPRESSION);
		createEReference(divExpressionEClass, DIV_EXPRESSION__LHS);
		createEReference(divExpressionEClass, DIV_EXPRESSION__RHS);

		modExpressionEClass = createEClass(MOD_EXPRESSION);
		createEReference(modExpressionEClass, MOD_EXPRESSION__LHS);
		createEReference(modExpressionEClass, MOD_EXPRESSION__RHS);

		castExpressionEClass = createEClass(CAST_EXPRESSION);
		createEReference(castExpressionEClass, CAST_EXPRESSION__TERM);
		createEReference(castExpressionEClass, CAST_EXPRESSION__TYPE);
		createEAttribute(castExpressionEClass, CAST_EXPRESSION__IS_ARRAY);

		expressionGroupEClass = createEClass(EXPRESSION_GROUP);
		createEReference(expressionGroupEClass, EXPRESSION_GROUP__TERM);

		notExpressionEClass = createEClass(NOT_EXPRESSION);
		createEReference(notExpressionEClass, NOT_EXPRESSION__TERM);

		unaryMinusEClass = createEClass(UNARY_MINUS);
		createEReference(unaryMinusEClass, UNARY_MINUS__TERM);

		arrayIndexEClass = createEClass(ARRAY_INDEX);
		createEReference(arrayIndexEClass, ARRAY_INDEX__ARRAY);
		createEReference(arrayIndexEClass, ARRAY_INDEX__INDEX);

		// Create enums
		sequentialEEnum = createEEnum(SEQUENTIAL);
		timestampsEEnum = createEEnum(TIMESTAMPS);
		labelsEEnum = createEEnum(LABELS);
		optimizerEEnum = createEEnum(OPTIMIZER);
		lossFunctionEEnum = createEEnum(LOSS_FUNCTION);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isInitialized = false;

  /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		variableEClass.getESuperTypes().add(this.getNamedElement());
		variableEClass.getESuperTypes().add(this.getAnnotatedElement());
		typeEClass.getESuperTypes().add(this.getNamedElement());
		typeEClass.getESuperTypes().add(this.getAnnotatedElement());
		primitiveTypeEClass.getESuperTypes().add(this.getType());
		objectTypeEClass.getESuperTypes().add(this.getType());
		enumerationEClass.getESuperTypes().add(this.getType());
		enumerationLiteralEClass.getESuperTypes().add(this.getNamedElement());
		enumerationLiteralEClass.getESuperTypes().add(this.getAnnotatedElement());
		thingEClass.getESuperTypes().add(this.getType());
		propertyAssignEClass.getESuperTypes().add(this.getAnnotatedElement());
		protocolEClass.getESuperTypes().add(this.getNamedElement());
		protocolEClass.getESuperTypes().add(this.getAnnotatedElement());
		functionEClass.getESuperTypes().add(this.getNamedElement());
		functionEClass.getESuperTypes().add(this.getAnnotatedElement());
		propertyEClass.getESuperTypes().add(this.getVariable());
		messageEClass.getESuperTypes().add(this.getNamedElement());
		messageEClass.getESuperTypes().add(this.getAnnotatedElement());
		messageEClass.getESuperTypes().add(this.getMessageParameter());
		parameterEClass.getESuperTypes().add(this.getNamedElement());
		parameterEClass.getESuperTypes().add(this.getAnnotatedElement());
		parameterEClass.getESuperTypes().add(this.getVariable());
		parameterEClass.getESuperTypes().add(this.getMessageParameter());
		portEClass.getESuperTypes().add(this.getNamedElement());
		portEClass.getESuperTypes().add(this.getAnnotatedElement());
		requiredPortEClass.getESuperTypes().add(this.getPort());
		providedPortEClass.getESuperTypes().add(this.getPort());
		internalPortEClass.getESuperTypes().add(this.getPort());
		stateEClass.getESuperTypes().add(this.getNamedElement());
		stateEClass.getESuperTypes().add(this.getAnnotatedElement());
		handlerEClass.getESuperTypes().add(this.getNamedElement());
		handlerEClass.getESuperTypes().add(this.getAnnotatedElement());
		transitionEClass.getESuperTypes().add(this.getHandler());
		internalTransitionEClass.getESuperTypes().add(this.getHandler());
		compositeStateEClass.getESuperTypes().add(this.getState());
		compositeStateEClass.getESuperTypes().add(this.getStateContainer());
		sessionEClass.getESuperTypes().add(this.getStateContainer());
		regionEClass.getESuperTypes().add(this.getStateContainer());
		finalStateEClass.getESuperTypes().add(this.getState());
		stateContainerEClass.getESuperTypes().add(this.getNamedElement());
		stateContainerEClass.getESuperTypes().add(this.getAnnotatedElement());
		dataAnalyticsEClass.getESuperTypes().add(this.getNamedElement());
		dataAnalyticsEClass.getESuperTypes().add(this.getAnnotatedElement());
		pmmL_ModelAlgorithmEClass.getESuperTypes().add(this.getDataAnalyticsModelAlgorithm());
		pfA_ModelAlgorithmEClass.getESuperTypes().add(this.getDataAnalyticsModelAlgorithm());
		ml2_ModelAlgorithmEClass.getESuperTypes().add(this.getDataAnalyticsModelAlgorithm());
		decisionTreeEClass.getESuperTypes().add(this.getML2_ModelAlgorithm());
		randomForestEClass.getESuperTypes().add(this.getML2_ModelAlgorithm());
		gatedRecurrentUnitsEClass.getESuperTypes().add(this.getML2_ModelAlgorithm());
		longShortTermMemoryEClass.getESuperTypes().add(this.getML2_ModelAlgorithm());
		nN_MultilayerPerceptronEClass.getESuperTypes().add(this.getML2_ModelAlgorithm());
		denoisingAutoencodersEClass.getESuperTypes().add(this.getML2_ModelAlgorithm());
		factorialHiddenMarkovModelEClass.getESuperTypes().add(this.getML2_ModelAlgorithm());
		combinatorialOptimizationEClass.getESuperTypes().add(this.getML2_ModelAlgorithm());
		eventEClass.getESuperTypes().add(this.getNamedElement());
		receiveMessageEClass.getESuperTypes().add(this.getEvent());
		actionBlockEClass.getESuperTypes().add(this.getAction());
		externStatementEClass.getESuperTypes().add(this.getAction());
		localVariableEClass.getESuperTypes().add(this.getVariable());
		localVariableEClass.getESuperTypes().add(this.getAction());
		sendActionEClass.getESuperTypes().add(this.getAction());
		variableAssignmentEClass.getESuperTypes().add(this.getAction());
		incrementEClass.getESuperTypes().add(this.getAction());
		decrementEClass.getESuperTypes().add(this.getAction());
		forActionEClass.getESuperTypes().add(this.getAction());
		loopActionEClass.getESuperTypes().add(this.getAction());
		conditionalActionEClass.getESuperTypes().add(this.getAction());
		returnActionEClass.getESuperTypes().add(this.getAction());
		printActionEClass.getESuperTypes().add(this.getAction());
		errorActionEClass.getESuperTypes().add(this.getAction());
		startSessionEClass.getESuperTypes().add(this.getAction());
		functionCallStatementEClass.getESuperTypes().add(this.getAction());
		daSaveActionEClass.getESuperTypes().add(this.getAction());
		daPreprocessActionEClass.getESuperTypes().add(this.getAction());
		daTrainActionEClass.getESuperTypes().add(this.getAction());
		daPredictActionEClass.getESuperTypes().add(this.getAction());
		externExpressionEClass.getESuperTypes().add(this.getExpression());
		literalEClass.getESuperTypes().add(this.getExpression());
		arrayInitEClass.getESuperTypes().add(this.getExpression());
		enumLiteralRefEClass.getESuperTypes().add(this.getLiteral());
		byteLiteralEClass.getESuperTypes().add(this.getLiteral());
		charLiteralEClass.getESuperTypes().add(this.getLiteral());
		integerLiteralEClass.getESuperTypes().add(this.getLiteral());
		booleanLiteralEClass.getESuperTypes().add(this.getLiteral());
		stringLiteralEClass.getESuperTypes().add(this.getLiteral());
		doubleLiteralEClass.getESuperTypes().add(this.getLiteral());
		propertyReferenceEClass.getESuperTypes().add(this.getExpression());
		eventReferenceEClass.getESuperTypes().add(this.getExpression());
		functionCallExpressionEClass.getESuperTypes().add(this.getExpression());
		configurationEClass.getESuperTypes().add(this.getNamedElement());
		configurationEClass.getESuperTypes().add(this.getAnnotatedElement());
		instanceEClass.getESuperTypes().add(this.getNamedElement());
		instanceEClass.getESuperTypes().add(this.getAnnotatedElement());
		abstractConnectorEClass.getESuperTypes().add(this.getNamedElement());
		abstractConnectorEClass.getESuperTypes().add(this.getAnnotatedElement());
		connectorEClass.getESuperTypes().add(this.getAbstractConnector());
		externalConnectorEClass.getESuperTypes().add(this.getAbstractConnector());
		orExpressionEClass.getESuperTypes().add(this.getExpression());
		andExpressionEClass.getESuperTypes().add(this.getExpression());
		equalsExpressionEClass.getESuperTypes().add(this.getExpression());
		notEqualsExpressionEClass.getESuperTypes().add(this.getExpression());
		greaterExpressionEClass.getESuperTypes().add(this.getExpression());
		lowerExpressionEClass.getESuperTypes().add(this.getExpression());
		greaterOrEqualExpressionEClass.getESuperTypes().add(this.getExpression());
		lowerOrEqualExpressionEClass.getESuperTypes().add(this.getExpression());
		plusExpressionEClass.getESuperTypes().add(this.getExpression());
		minusExpressionEClass.getESuperTypes().add(this.getExpression());
		timesExpressionEClass.getESuperTypes().add(this.getExpression());
		divExpressionEClass.getESuperTypes().add(this.getExpression());
		modExpressionEClass.getESuperTypes().add(this.getExpression());
		castExpressionEClass.getESuperTypes().add(this.getExpression());
		expressionGroupEClass.getESuperTypes().add(this.getExpression());
		notExpressionEClass.getESuperTypes().add(this.getExpression());
		unaryMinusEClass.getESuperTypes().add(this.getExpression());
		arrayIndexEClass.getESuperTypes().add(this.getExpression());

		// Initialize classes and features; add operations and parameters
		initEClass(thingMLModelEClass, ThingMLModel.class, "ThingMLModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThingMLModel_Imports(), this.getImport(), null, "imports", null, 0, -1, ThingMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThingMLModel_Types(), this.getType(), null, "types", null, 0, -1, ThingMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThingMLModel_Protocols(), this.getProtocol(), null, "protocols", null, 0, -1, ThingMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThingMLModel_Configs(), this.getConfiguration(), null, "configs", null, 0, -1, ThingMLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImport_From(), ecorePackage.getEString(), "from", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(platformAnnotationEClass, PlatformAnnotation.class, "PlatformAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlatformAnnotation_Name(), ecorePackage.getEString(), "name", null, 0, 1, PlatformAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlatformAnnotation_Value(), ecorePackage.getEString(), "value", null, 0, 1, PlatformAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotatedElementEClass, AnnotatedElement.class, "AnnotatedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotatedElement_Annotations(), this.getPlatformAnnotation(), null, "annotations", null, 0, -1, AnnotatedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_TypeRef(), this.getTypeRef(), null, "typeRef", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeRefEClass, TypeRef.class, "TypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeRef_Type(), this.getType(), null, "type", null, 0, 1, TypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeRef_IsArray(), ecorePackage.getEBoolean(), "isArray", null, 0, 1, TypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeRef_Cardinality(), this.getExpression(), null, "cardinality", null, 0, 1, TypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveType_ByteSize(), ecorePackage.getELong(), "ByteSize", null, 0, 1, PrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectTypeEClass, ObjectType.class, "ObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_TypeRef(), this.getTypeRef(), null, "typeRef", null, 0, 1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumeration_Literals(), this.getEnumerationLiteral(), null, "literals", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationLiteral_Init(), this.getLiteral(), null, "init", null, 0, 1, EnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thingEClass, Thing.class, "Thing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThing_Fragment(), ecorePackage.getEBoolean(), "fragment", null, 0, 1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_Includes(), this.getThing(), null, "includes", null, 0, -1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_Messages(), this.getMessage(), null, "messages", null, 0, -1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_Ports(), this.getPort(), null, "ports", null, 0, -1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_Properties(), this.getProperty(), null, "properties", null, 0, -1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_Functions(), this.getFunction(), null, "functions", null, 0, -1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_Assign(), this.getPropertyAssign(), null, "assign", null, 0, -1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_DataAnalytics(), this.getDataAnalytics(), null, "dataAnalytics", null, 0, -1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThing_Behaviour(), this.getCompositeState(), null, "behaviour", null, 0, 1, Thing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyAssignEClass, PropertyAssign.class, "PropertyAssign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyAssign_Property(), this.getProperty(), null, "property", null, 0, 1, PropertyAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyAssign_Index(), this.getExpression(), null, "index", null, 0, 1, PropertyAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyAssign_Init(), this.getExpression(), null, "init", null, 0, 1, PropertyAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protocolEClass, Protocol.class, "Protocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_TypeRef(), this.getTypeRef(), null, "typeRef", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Body(), this.getAction(), null, "body", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunction_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Readonly(), ecorePackage.getEBoolean(), "readonly", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Init(), this.getExpression(), null, "init", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessage_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Sends(), this.getMessage(), null, "sends", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_Receives(), this.getMessage(), null, "receives", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredPortEClass, RequiredPort.class, "RequiredPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequiredPort_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1, RequiredPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedPortEClass, ProvidedPort.class, "ProvidedPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(internalPortEClass, InternalPort.class, "InternalPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_Properties(), this.getProperty(), null, "properties", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Entry(), this.getAction(), null, "entry", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Exit(), this.getAction(), null, "exit", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Internal(), this.getInternalTransition(), null, "internal", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Outgoing(), this.getTransition(), null, "outgoing", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(handlerEClass, Handler.class, "Handler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHandler_Event(), this.getEvent(), null, "event", null, 0, 1, Handler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHandler_Guard(), this.getExpression(), null, "guard", null, 0, 1, Handler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHandler_Action(), this.getAction(), null, "action", null, 0, 1, Handler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Target(), this.getState(), null, "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalTransitionEClass, InternalTransition.class, "InternalTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeStateEClass, CompositeState.class, "CompositeState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeState_Region(), this.getRegion(), null, "region", null, 0, -1, CompositeState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeState_Session(), this.getSession(), null, "session", null, 0, -1, CompositeState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sessionEClass, Session.class, "Session", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSession_MaxInstances(), this.getExpression(), null, "maxInstances", null, 0, 1, Session.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionEClass, Region.class, "Region", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateContainerEClass, StateContainer.class, "StateContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateContainer_Initial(), this.getState(), null, "initial", null, 0, 1, StateContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateContainer_History(), ecorePackage.getEBoolean(), "history", null, 0, 1, StateContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateContainer_Substate(), this.getState(), null, "substate", null, 0, -1, StateContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageParameterEClass, MessageParameter.class, "MessageParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataAnalyticsEClass, DataAnalytics.class, "DataAnalytics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataAnalytics_Dataset(), ecorePackage.getEString(), "dataset", null, 0, 1, DataAnalytics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataAnalytics_Sequential(), this.getSequential(), "sequential", null, 0, 1, DataAnalytics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataAnalytics_Timestamps(), this.getTimestamps(), "timestamps", null, 0, 1, DataAnalytics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataAnalytics_Labels(), this.getLabels(), "labels", null, 0, 1, DataAnalytics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAnalytics_Features(), this.getProperty(), null, "features", null, 0, -1, DataAnalytics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAnalytics_ModelAlgorithm(), this.getDataAnalyticsModelAlgorithm(), null, "modelAlgorithm", null, 0, 1, DataAnalytics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataAnalytics_TrainingResults(), ecorePackage.getEString(), "trainingResults", null, 0, 1, DataAnalytics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAnalytics_PredictionResults(), this.getProperty(), null, "predictionResults", null, 0, -1, DataAnalytics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAnalyticsModelAlgorithmEClass, DataAnalyticsModelAlgorithm.class, "DataAnalyticsModelAlgorithm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataAnalyticsModelAlgorithm_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataAnalyticsModelAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pmmL_ModelAlgorithmEClass, PMML_ModelAlgorithm.class, "PMML_ModelAlgorithm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPMML_ModelAlgorithm_Pmml_path(), ecorePackage.getEString(), "pmml_path", null, 0, 1, PMML_ModelAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pfA_ModelAlgorithmEClass, PFA_ModelAlgorithm.class, "PFA_ModelAlgorithm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPFA_ModelAlgorithm_Pfa_path(), ecorePackage.getEString(), "pfa_path", null, 0, 1, PFA_ModelAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ml2_ModelAlgorithmEClass, ML2_ModelAlgorithm.class, "ML2_ModelAlgorithm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decisionTreeEClass, DecisionTree.class, "DecisionTree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecisionTree_LossFunction(), this.getLossFunction(), "lossFunction", null, 0, 1, DecisionTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecisionTree_Min_samples_split(), this.getMinSamplesSplit(), null, "min_samples_split", null, 0, 1, DecisionTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(randomForestEClass, RandomForest.class, "RandomForest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRandomForest_LossFunction(), this.getLossFunction(), "lossFunction", null, 0, 1, RandomForest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRandomForest_Min_samples_split(), this.getMinSamplesSplit(), null, "min_samples_split", null, 0, 1, RandomForest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gatedRecurrentUnitsEClass, GatedRecurrentUnits.class, "GatedRecurrentUnits", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGatedRecurrentUnits_Loss_function(), this.getLossFunction(), "loss_function", null, 0, 1, GatedRecurrentUnits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatedRecurrentUnits_Optimizer(), this.getOptimizer(), "optimizer", null, 0, 1, GatedRecurrentUnits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGatedRecurrentUnits_Learning_rate(), ecorePackage.getEDouble(), "learning_rate", null, 0, 1, GatedRecurrentUnits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(longShortTermMemoryEClass, LongShortTermMemory.class, "LongShortTermMemory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLongShortTermMemory_Loss_function(), this.getLossFunction(), "loss_function", null, 0, 1, LongShortTermMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongShortTermMemory_Optimizer(), this.getOptimizer(), "optimizer", null, 0, 1, LongShortTermMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongShortTermMemory_Learning_rate(), ecorePackage.getEDouble(), "learning_rate", null, 0, 1, LongShortTermMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nN_MultilayerPerceptronEClass, NN_MultilayerPerceptron.class, "NN_MultilayerPerceptron", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNN_MultilayerPerceptron_Loss_function(), this.getLossFunction(), "loss_function", null, 0, 1, NN_MultilayerPerceptron.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNN_MultilayerPerceptron_Optimizer(), this.getOptimizer(), "optimizer", null, 0, 1, NN_MultilayerPerceptron.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNN_MultilayerPerceptron_Learning_rate(), ecorePackage.getEDouble(), "learning_rate", null, 0, 1, NN_MultilayerPerceptron.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNN_MultilayerPerceptron_No_layers(), ecorePackage.getELong(), "no_layers", null, 0, 1, NN_MultilayerPerceptron.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNN_MultilayerPerceptron_Dropout_probability(), ecorePackage.getEDouble(), "dropout_probability", null, 0, 1, NN_MultilayerPerceptron.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(denoisingAutoencodersEClass, DenoisingAutoencoders.class, "DenoisingAutoencoders", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDenoisingAutoencoders_Loss_function(), this.getLossFunction(), "loss_function", null, 0, 1, DenoisingAutoencoders.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDenoisingAutoencoders_Optimizer(), this.getOptimizer(), "optimizer", null, 0, 1, DenoisingAutoencoders.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDenoisingAutoencoders_Learning_rate(), ecorePackage.getEDouble(), "learning_rate", null, 0, 1, DenoisingAutoencoders.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDenoisingAutoencoders_Sequence_length(), ecorePackage.getELong(), "sequence_length", null, 0, 1, DenoisingAutoencoders.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(factorialHiddenMarkovModelEClass, FactorialHiddenMarkovModel.class, "FactorialHiddenMarkovModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(combinatorialOptimizationEClass, CombinatorialOptimization.class, "CombinatorialOptimization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minSamplesSplitEClass, MinSamplesSplit.class, "MinSamplesSplit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(receiveMessageEClass, ReceiveMessage.class, "ReceiveMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReceiveMessage_Port(), this.getPort(), null, "port", null, 0, 1, ReceiveMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReceiveMessage_Message(), this.getMessage(), null, "message", null, 0, 1, ReceiveMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionBlockEClass, ActionBlock.class, "ActionBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionBlock_Actions(), this.getAction(), null, "actions", null, 0, -1, ActionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externStatementEClass, ExternStatement.class, "ExternStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternStatement_Statement(), ecorePackage.getEString(), "statement", null, 0, 1, ExternStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternStatement_Segments(), this.getExpression(), null, "segments", null, 0, -1, ExternStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localVariableEClass, LocalVariable.class, "LocalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalVariable_Readonly(), ecorePackage.getEBoolean(), "readonly", null, 0, 1, LocalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocalVariable_Init(), this.getExpression(), null, "init", null, 0, 1, LocalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendActionEClass, SendAction.class, "SendAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendAction_Port(), this.getPort(), null, "port", null, 0, 1, SendAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSendAction_Message(), this.getMessage(), null, "message", null, 0, 1, SendAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSendAction_Parameters(), this.getExpression(), null, "parameters", null, 0, -1, SendAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableAssignmentEClass, VariableAssignment.class, "VariableAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableAssignment_Property(), this.getVariable(), null, "property", null, 0, 1, VariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableAssignment_Index(), this.getExpression(), null, "index", null, 0, 1, VariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableAssignment_Expression(), this.getExpression(), null, "expression", null, 0, 1, VariableAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(incrementEClass, Increment.class, "Increment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIncrement_Var(), this.getVariable(), null, "var", null, 0, 1, Increment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decrementEClass, Decrement.class, "Decrement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecrement_Var(), this.getVariable(), null, "var", null, 0, 1, Decrement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forActionEClass, ForAction.class, "ForAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForAction_Variable(), this.getParameter(), null, "variable", null, 0, 1, ForAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForAction_Index(), this.getParameter(), null, "index", null, 0, 1, ForAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForAction_Array(), this.getPropertyReference(), null, "array", null, 0, 1, ForAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForAction_Action(), this.getAction(), null, "action", null, 0, 1, ForAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loopActionEClass, LoopAction.class, "LoopAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoopAction_Condition(), this.getExpression(), null, "condition", null, 0, 1, LoopAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoopAction_Action(), this.getAction(), null, "action", null, 0, 1, LoopAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalActionEClass, ConditionalAction.class, "ConditionalAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalAction_Condition(), this.getExpression(), null, "condition", null, 0, 1, ConditionalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalAction_Action(), this.getAction(), null, "action", null, 0, 1, ConditionalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalAction_ElseAction(), this.getAction(), null, "elseAction", null, 0, 1, ConditionalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnActionEClass, ReturnAction.class, "ReturnAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnAction_Exp(), this.getExpression(), null, "exp", null, 0, 1, ReturnAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(printActionEClass, PrintAction.class, "PrintAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrintAction_Line(), ecorePackage.getEBoolean(), "line", null, 0, 1, PrintAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrintAction_Msg(), this.getExpression(), null, "msg", null, 0, -1, PrintAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorActionEClass, ErrorAction.class, "ErrorAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErrorAction_Line(), ecorePackage.getEBoolean(), "line", null, 0, 1, ErrorAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorAction_Msg(), this.getExpression(), null, "msg", null, 0, -1, ErrorAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startSessionEClass, StartSession.class, "StartSession", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartSession_Session(), this.getSession(), null, "session", null, 0, 1, StartSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionCallStatementEClass, FunctionCallStatement.class, "FunctionCallStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionCallStatement_Function(), this.getFunction(), null, "function", null, 0, 1, FunctionCallStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionCallStatement_Parameters(), this.getExpression(), null, "parameters", null, 0, -1, FunctionCallStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(daSaveActionEClass, DASaveAction.class, "DASaveAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDASaveAction_DataAnalytics(), this.getDataAnalytics(), null, "dataAnalytics", null, 0, 1, DASaveAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(daPreprocessActionEClass, DAPreprocessAction.class, "DAPreprocessAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDAPreprocessAction_DataAnalytics(), this.getDataAnalytics(), null, "dataAnalytics", null, 0, 1, DAPreprocessAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(daTrainActionEClass, DATrainAction.class, "DATrainAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDATrainAction_DataAnalytics(), this.getDataAnalytics(), null, "dataAnalytics", null, 0, 1, DATrainAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(daPredictActionEClass, DAPredictAction.class, "DAPredictAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDAPredictAction_DataAnalytics(), this.getDataAnalytics(), null, "dataAnalytics", null, 0, 1, DAPredictAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDAPredictAction_Features(), this.getProperty(), null, "features", null, 0, -1, DAPredictAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externExpressionEClass, ExternExpression.class, "ExternExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternExpression_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, ExternExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternExpression_Segments(), this.getExpression(), null, "segments", null, 0, -1, ExternExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arrayInitEClass, ArrayInit.class, "ArrayInit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayInit_Values(), this.getExpression(), null, "values", null, 0, -1, ArrayInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumLiteralRefEClass, EnumLiteralRef.class, "EnumLiteralRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumLiteralRef_Enum(), this.getEnumeration(), null, "enum", null, 0, 1, EnumLiteralRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumLiteralRef_Literal(), this.getEnumerationLiteral(), null, "literal", null, 0, 1, EnumLiteralRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(byteLiteralEClass, ByteLiteral.class, "ByteLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getByteLiteral_ByteValue(), ecorePackage.getEByte(), "byteValue", null, 0, 1, ByteLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(charLiteralEClass, CharLiteral.class, "CharLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharLiteral_CharValue(), ecorePackage.getEByte(), "charValue", null, 0, 1, CharLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerLiteralEClass, IntegerLiteral.class, "IntegerLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerLiteral_IntValue(), ecorePackage.getELong(), "intValue", null, 0, 1, IntegerLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanLiteral_BoolValue(), ecorePackage.getEBoolean(), "boolValue", null, 0, 1, BooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringLiteral_StringValue(), ecorePackage.getEString(), "stringValue", null, 0, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleLiteralEClass, DoubleLiteral.class, "DoubleLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoubleLiteral_DoubleValue(), ecorePackage.getEDouble(), "doubleValue", null, 0, 1, DoubleLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyReferenceEClass, PropertyReference.class, "PropertyReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyReference_Property(), this.getVariable(), null, "property", null, 0, 1, PropertyReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventReferenceEClass, EventReference.class, "EventReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventReference_ReceiveMsg(), this.getEvent(), null, "receiveMsg", null, 0, 1, EventReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventReference_Parameter(), this.getParameter(), null, "parameter", null, 0, 1, EventReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionCallExpressionEClass, FunctionCallExpression.class, "FunctionCallExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionCallExpression_Function(), this.getFunction(), null, "function", null, 0, 1, FunctionCallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionCallExpression_Parameters(), this.getExpression(), null, "parameters", null, 0, -1, FunctionCallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_Instances(), this.getInstance(), null, "instances", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Connectors(), this.getAbstractConnector(), null, "connectors", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Propassigns(), this.getConfigPropertyAssign(), null, "propassigns", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceEClass, Instance.class, "Instance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstance_Type(), this.getThing(), null, "type", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configPropertyAssignEClass, ConfigPropertyAssign.class, "ConfigPropertyAssign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigPropertyAssign_Instance(), this.getInstance(), null, "instance", null, 0, 1, ConfigPropertyAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigPropertyAssign_Property(), this.getProperty(), null, "property", null, 0, 1, ConfigPropertyAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigPropertyAssign_Index(), this.getExpression(), null, "index", null, 0, 1, ConfigPropertyAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigPropertyAssign_Init(), this.getExpression(), null, "init", null, 0, 1, ConfigPropertyAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigPropertyAssign_Annotations(), this.getPlatformAnnotation(), null, "annotations", null, 0, -1, ConfigPropertyAssign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractConnectorEClass, AbstractConnector.class, "AbstractConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnector_Cli(), this.getInstance(), null, "cli", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Required(), this.getRequiredPort(), null, "required", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Srv(), this.getInstance(), null, "srv", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Provided(), this.getProvidedPort(), null, "provided", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalConnectorEClass, ExternalConnector.class, "ExternalConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalConnector_Inst(), this.getInstance(), null, "inst", null, 0, 1, ExternalConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalConnector_Port(), this.getPort(), null, "port", null, 0, 1, ExternalConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalConnector_Protocol(), this.getProtocol(), null, "protocol", null, 0, 1, ExternalConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orExpressionEClass, OrExpression.class, "OrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrExpression_Lhs(), this.getExpression(), null, "lhs", null, 0, 1, OrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrExpression_Rhs(), this.getExpression(), null, "rhs", null, 0, 1, OrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andExpressionEClass, AndExpression.class, "AndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAndExpression_Lhs(), this.getExpression(), null, "lhs", null, 0, 1, AndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAndExpression_Rhs(), this.getExpression(), null, "rhs", null, 0, 1, AndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(equalsExpressionEClass, EqualsExpression.class, "EqualsExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEqualsExpression_Lhs(), this.getExpression(), null, "lhs", null, 0, 1, EqualsExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEqualsExpression_Rhs(), this.getExpression(), null, "rhs", null, 0, 1, EqualsExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notEqualsExpressionEClass, NotEqualsExpression.class, "NotEqualsExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotEqualsExpression_Lhs(), this.getExpression(), null, "lhs", null, 0, 1, NotEqualsExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNotEqualsExpression_Rhs(), this.getExpression(), null, "rhs", null, 0, 1, NotEqualsExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(greaterExpressionEClass, GreaterExpression.class, "GreaterExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGreaterExpression_Lhs(), this.getExpression(), null, "lhs", null, 0, 1, GreaterExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGreaterExpression_Rhs(), this.getExpression(), null, "rhs", null, 0, 1, GreaterExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lowerExpressionEClass, LowerExpression.class, "LowerExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLowerExpression_Lhs(), this.getExpression(), null, "lhs", null, 0, 1, LowerExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLowerExpression_Rhs(), this.getExpression(), null, "rhs", null, 0, 1, LowerExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(greaterOrEqualExpressionEClass, GreaterOrEqualExpression.class, "GreaterOrEqualExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGreaterOrEqualExpression_Lhs(), this.getExpression(), null, "lhs", null, 0, 1, GreaterOrEqualExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGreaterOrEqualExpression_Rhs(), this.getExpression(), null, "rhs", null, 0, 1, GreaterOrEqualExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lowerOrEqualExpressionEClass, LowerOrEqualExpression.class, "LowerOrEqualExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLowerOrEqualExpression_Lhs(), this.getExpression(), null, "lhs", null, 0, 1, LowerOrEqualExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLowerOrEqualExpression_Rhs(), this.getExpression(), null, "rhs", null, 0, 1, LowerOrEqualExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plusExpressionEClass, PlusExpression.class, "PlusExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlusExpression_Lhs(), this.getExpression(), null, "lhs", null, 0, 1, PlusExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlusExpression_Rhs(), this.getExpression(), null, "rhs", null, 0, 1, PlusExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(minusExpressionEClass, MinusExpression.class, "MinusExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMinusExpression_Lhs(), this.getExpression(), null, "lhs", null, 0, 1, MinusExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMinusExpression_Rhs(), this.getExpression(), null, "rhs", null, 0, 1, MinusExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timesExpressionEClass, TimesExpression.class, "TimesExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimesExpression_Lhs(), this.getExpression(), null, "lhs", null, 0, 1, TimesExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimesExpression_Rhs(), this.getExpression(), null, "rhs", null, 0, 1, TimesExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(divExpressionEClass, DivExpression.class, "DivExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDivExpression_Lhs(), this.getExpression(), null, "lhs", null, 0, 1, DivExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDivExpression_Rhs(), this.getExpression(), null, "rhs", null, 0, 1, DivExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modExpressionEClass, ModExpression.class, "ModExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModExpression_Lhs(), this.getExpression(), null, "lhs", null, 0, 1, ModExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModExpression_Rhs(), this.getExpression(), null, "rhs", null, 0, 1, ModExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(castExpressionEClass, CastExpression.class, "CastExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCastExpression_Term(), this.getExpression(), null, "term", null, 0, 1, CastExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCastExpression_Type(), this.getType(), null, "type", null, 0, 1, CastExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCastExpression_IsArray(), ecorePackage.getEBoolean(), "isArray", null, 0, 1, CastExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionGroupEClass, ExpressionGroup.class, "ExpressionGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionGroup_Term(), this.getExpression(), null, "term", null, 0, 1, ExpressionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notExpressionEClass, NotExpression.class, "NotExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotExpression_Term(), this.getExpression(), null, "term", null, 0, 1, NotExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryMinusEClass, UnaryMinus.class, "UnaryMinus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryMinus_Term(), this.getExpression(), null, "term", null, 0, 1, UnaryMinus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayIndexEClass, ArrayIndex.class, "ArrayIndex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayIndex_Array(), this.getExpression(), null, "array", null, 0, 1, ArrayIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArrayIndex_Index(), this.getExpression(), null, "index", null, 0, 1, ArrayIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(sequentialEEnum, Sequential.class, "Sequential");
		addEEnumLiteral(sequentialEEnum, Sequential.TRUE);
		addEEnumLiteral(sequentialEEnum, Sequential.FALSE);

		initEEnum(timestampsEEnum, Timestamps.class, "Timestamps");
		addEEnumLiteral(timestampsEEnum, Timestamps.ON);
		addEEnumLiteral(timestampsEEnum, Timestamps.OFF);

		initEEnum(labelsEEnum, Labels.class, "Labels");
		addEEnumLiteral(labelsEEnum, Labels.ON);
		addEEnumLiteral(labelsEEnum, Labels.OFF);

		initEEnum(optimizerEEnum, Optimizer.class, "Optimizer");
		addEEnumLiteral(optimizerEEnum, Optimizer.ADAM);
		addEEnumLiteral(optimizerEEnum, Optimizer.NADAM);
		addEEnumLiteral(optimizerEEnum, Optimizer.RMSPROP);

		initEEnum(lossFunctionEEnum, LossFunction.class, "LossFunction");
		addEEnumLiteral(lossFunctionEEnum, LossFunction.MSE);
		addEEnumLiteral(lossFunctionEEnum, LossFunction.FRIEDMAN_MSE);
		addEEnumLiteral(lossFunctionEEnum, LossFunction.MAE);

		// Create resource
		createResource(eNS_URI);
	}

} //ThingMLPackageImpl
