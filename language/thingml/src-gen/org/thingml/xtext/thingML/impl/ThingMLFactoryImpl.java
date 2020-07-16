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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.thingml.xtext.thingML.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThingMLFactoryImpl extends EFactoryImpl implements ThingMLFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ThingMLFactory init()
  {
		try {
			ThingMLFactory theThingMLFactory = (ThingMLFactory)EPackage.Registry.INSTANCE.getEFactory(ThingMLPackage.eNS_URI);
			if (theThingMLFactory != null) {
				return theThingMLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ThingMLFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ThingMLFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case ThingMLPackage.THING_ML_MODEL: return createThingMLModel();
			case ThingMLPackage.IMPORT: return createImport();
			case ThingMLPackage.PLATFORM_ANNOTATION: return createPlatformAnnotation();
			case ThingMLPackage.NAMED_ELEMENT: return createNamedElement();
			case ThingMLPackage.ANNOTATED_ELEMENT: return createAnnotatedElement();
			case ThingMLPackage.VARIABLE: return createVariable();
			case ThingMLPackage.TYPE_REF: return createTypeRef();
			case ThingMLPackage.TYPE: return createType();
			case ThingMLPackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case ThingMLPackage.OBJECT_TYPE: return createObjectType();
			case ThingMLPackage.ENUMERATION: return createEnumeration();
			case ThingMLPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
			case ThingMLPackage.THING: return createThing();
			case ThingMLPackage.PROPERTY_ASSIGN: return createPropertyAssign();
			case ThingMLPackage.PROTOCOL: return createProtocol();
			case ThingMLPackage.FUNCTION: return createFunction();
			case ThingMLPackage.PROPERTY: return createProperty();
			case ThingMLPackage.MESSAGE: return createMessage();
			case ThingMLPackage.PARAMETER: return createParameter();
			case ThingMLPackage.PORT: return createPort();
			case ThingMLPackage.REQUIRED_PORT: return createRequiredPort();
			case ThingMLPackage.PROVIDED_PORT: return createProvidedPort();
			case ThingMLPackage.INTERNAL_PORT: return createInternalPort();
			case ThingMLPackage.STATE: return createState();
			case ThingMLPackage.HANDLER: return createHandler();
			case ThingMLPackage.TRANSITION: return createTransition();
			case ThingMLPackage.INTERNAL_TRANSITION: return createInternalTransition();
			case ThingMLPackage.COMPOSITE_STATE: return createCompositeState();
			case ThingMLPackage.SESSION: return createSession();
			case ThingMLPackage.REGION: return createRegion();
			case ThingMLPackage.FINAL_STATE: return createFinalState();
			case ThingMLPackage.STATE_CONTAINER: return createStateContainer();
			case ThingMLPackage.MESSAGE_PARAMETER: return createMessageParameter();
			case ThingMLPackage.DATA_ANALYTICS: return createDataAnalytics();
			case ThingMLPackage.DATA_ANALYTICS_MODEL_ALGORITHM: return createDataAnalyticsModelAlgorithm();
			case ThingMLPackage.PMML_MODEL_ALGORITHM: return createPMML_ModelAlgorithm();
			case ThingMLPackage.PFA_MODEL_ALGORITHM: return createPFA_ModelAlgorithm();
			case ThingMLPackage.ML2_MODEL_ALGORITHM: return createML2_ModelAlgorithm();
			case ThingMLPackage.DECISION_TREE: return createDecisionTree();
			case ThingMLPackage.RANDOM_FOREST: return createRandomForest();
			case ThingMLPackage.GATED_RECURRENT_UNITS: return createGatedRecurrentUnits();
			case ThingMLPackage.LONG_SHORT_TERM_MEMORY: return createLongShortTermMemory();
			case ThingMLPackage.NN_MULTILAYER_PERCEPTRON: return createNN_MultilayerPerceptron();
			case ThingMLPackage.DENOISING_AUTOENCODERS: return createDenoisingAutoencoders();
			case ThingMLPackage.FACTORIAL_HIDDEN_MARKOV_MODEL: return createFactorialHiddenMarkovModel();
			case ThingMLPackage.COMBINATORIAL_OPTIMIZATION: return createCombinatorialOptimization();
			case ThingMLPackage.MIN_SAMPLES_SPLIT: return createMinSamplesSplit();
			case ThingMLPackage.EVENT: return createEvent();
			case ThingMLPackage.RECEIVE_MESSAGE: return createReceiveMessage();
			case ThingMLPackage.ACTION: return createAction();
			case ThingMLPackage.ACTION_BLOCK: return createActionBlock();
			case ThingMLPackage.EXTERN_STATEMENT: return createExternStatement();
			case ThingMLPackage.LOCAL_VARIABLE: return createLocalVariable();
			case ThingMLPackage.SEND_ACTION: return createSendAction();
			case ThingMLPackage.VARIABLE_ASSIGNMENT: return createVariableAssignment();
			case ThingMLPackage.INCREMENT: return createIncrement();
			case ThingMLPackage.DECREMENT: return createDecrement();
			case ThingMLPackage.FOR_ACTION: return createForAction();
			case ThingMLPackage.LOOP_ACTION: return createLoopAction();
			case ThingMLPackage.CONDITIONAL_ACTION: return createConditionalAction();
			case ThingMLPackage.RETURN_ACTION: return createReturnAction();
			case ThingMLPackage.PRINT_ACTION: return createPrintAction();
			case ThingMLPackage.ERROR_ACTION: return createErrorAction();
			case ThingMLPackage.START_SESSION: return createStartSession();
			case ThingMLPackage.FUNCTION_CALL_STATEMENT: return createFunctionCallStatement();
			case ThingMLPackage.DA_SAVE_ACTION: return createDASaveAction();
			case ThingMLPackage.DA_PREPROCESS_ACTION: return createDAPreprocessAction();
			case ThingMLPackage.DA_TRAIN_ACTION: return createDATrainAction();
			case ThingMLPackage.DA_PREDICT_ACTION: return createDAPredictAction();
			case ThingMLPackage.EXPRESSION: return createExpression();
			case ThingMLPackage.EXTERN_EXPRESSION: return createExternExpression();
			case ThingMLPackage.LITERAL: return createLiteral();
			case ThingMLPackage.ARRAY_INIT: return createArrayInit();
			case ThingMLPackage.ENUM_LITERAL_REF: return createEnumLiteralRef();
			case ThingMLPackage.BYTE_LITERAL: return createByteLiteral();
			case ThingMLPackage.CHAR_LITERAL: return createCharLiteral();
			case ThingMLPackage.INTEGER_LITERAL: return createIntegerLiteral();
			case ThingMLPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
			case ThingMLPackage.STRING_LITERAL: return createStringLiteral();
			case ThingMLPackage.DOUBLE_LITERAL: return createDoubleLiteral();
			case ThingMLPackage.PROPERTY_REFERENCE: return createPropertyReference();
			case ThingMLPackage.EVENT_REFERENCE: return createEventReference();
			case ThingMLPackage.FUNCTION_CALL_EXPRESSION: return createFunctionCallExpression();
			case ThingMLPackage.CONFIGURATION: return createConfiguration();
			case ThingMLPackage.INSTANCE: return createInstance();
			case ThingMLPackage.CONFIG_PROPERTY_ASSIGN: return createConfigPropertyAssign();
			case ThingMLPackage.ABSTRACT_CONNECTOR: return createAbstractConnector();
			case ThingMLPackage.CONNECTOR: return createConnector();
			case ThingMLPackage.EXTERNAL_CONNECTOR: return createExternalConnector();
			case ThingMLPackage.OR_EXPRESSION: return createOrExpression();
			case ThingMLPackage.AND_EXPRESSION: return createAndExpression();
			case ThingMLPackage.EQUALS_EXPRESSION: return createEqualsExpression();
			case ThingMLPackage.NOT_EQUALS_EXPRESSION: return createNotEqualsExpression();
			case ThingMLPackage.GREATER_EXPRESSION: return createGreaterExpression();
			case ThingMLPackage.LOWER_EXPRESSION: return createLowerExpression();
			case ThingMLPackage.GREATER_OR_EQUAL_EXPRESSION: return createGreaterOrEqualExpression();
			case ThingMLPackage.LOWER_OR_EQUAL_EXPRESSION: return createLowerOrEqualExpression();
			case ThingMLPackage.PLUS_EXPRESSION: return createPlusExpression();
			case ThingMLPackage.MINUS_EXPRESSION: return createMinusExpression();
			case ThingMLPackage.TIMES_EXPRESSION: return createTimesExpression();
			case ThingMLPackage.DIV_EXPRESSION: return createDivExpression();
			case ThingMLPackage.MOD_EXPRESSION: return createModExpression();
			case ThingMLPackage.CAST_EXPRESSION: return createCastExpression();
			case ThingMLPackage.EXPRESSION_GROUP: return createExpressionGroup();
			case ThingMLPackage.NOT_EXPRESSION: return createNotExpression();
			case ThingMLPackage.UNARY_MINUS: return createUnaryMinus();
			case ThingMLPackage.ARRAY_INDEX: return createArrayIndex();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
		switch (eDataType.getClassifierID()) {
			case ThingMLPackage.SEQUENTIAL:
				return createSequentialFromString(eDataType, initialValue);
			case ThingMLPackage.TIMESTAMPS:
				return createTimestampsFromString(eDataType, initialValue);
			case ThingMLPackage.LABELS:
				return createLabelsFromString(eDataType, initialValue);
			case ThingMLPackage.OPTIMIZER:
				return createOptimizerFromString(eDataType, initialValue);
			case ThingMLPackage.LOSS_FUNCTION:
				return createLossFunctionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
		switch (eDataType.getClassifierID()) {
			case ThingMLPackage.SEQUENTIAL:
				return convertSequentialToString(eDataType, instanceValue);
			case ThingMLPackage.TIMESTAMPS:
				return convertTimestampsToString(eDataType, instanceValue);
			case ThingMLPackage.LABELS:
				return convertLabelsToString(eDataType, instanceValue);
			case ThingMLPackage.OPTIMIZER:
				return convertOptimizerToString(eDataType, instanceValue);
			case ThingMLPackage.LOSS_FUNCTION:
				return convertLossFunctionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ThingMLModel createThingMLModel()
  {
		ThingMLModelImpl thingMLModel = new ThingMLModelImpl();
		return thingMLModel;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Import createImport()
  {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public PlatformAnnotation createPlatformAnnotation()
  {
		PlatformAnnotationImpl platformAnnotation = new PlatformAnnotationImpl();
		return platformAnnotation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public NamedElement createNamedElement()
  {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public AnnotatedElement createAnnotatedElement()
  {
		AnnotatedElementImpl annotatedElement = new AnnotatedElementImpl();
		return annotatedElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Variable createVariable()
  {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public TypeRef createTypeRef()
  {
		TypeRefImpl typeRef = new TypeRefImpl();
		return typeRef;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Type createType()
  {
		TypeImpl type = new TypeImpl();
		return type;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public PrimitiveType createPrimitiveType()
  {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ObjectType createObjectType()
  {
		ObjectTypeImpl objectType = new ObjectTypeImpl();
		return objectType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Enumeration createEnumeration()
  {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EnumerationLiteral createEnumerationLiteral()
  {
		EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
		return enumerationLiteral;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Thing createThing()
  {
		ThingImpl thing = new ThingImpl();
		return thing;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public PropertyAssign createPropertyAssign()
  {
		PropertyAssignImpl propertyAssign = new PropertyAssignImpl();
		return propertyAssign;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Protocol createProtocol()
  {
		ProtocolImpl protocol = new ProtocolImpl();
		return protocol;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Function createFunction()
  {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Property createProperty()
  {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Message createMessage()
  {
		MessageImpl message = new MessageImpl();
		return message;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Parameter createParameter()
  {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Port createPort()
  {
		PortImpl port = new PortImpl();
		return port;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public RequiredPort createRequiredPort()
  {
		RequiredPortImpl requiredPort = new RequiredPortImpl();
		return requiredPort;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ProvidedPort createProvidedPort()
  {
		ProvidedPortImpl providedPort = new ProvidedPortImpl();
		return providedPort;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public InternalPort createInternalPort()
  {
		InternalPortImpl internalPort = new InternalPortImpl();
		return internalPort;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public State createState()
  {
		StateImpl state = new StateImpl();
		return state;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Handler createHandler()
  {
		HandlerImpl handler = new HandlerImpl();
		return handler;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Transition createTransition()
  {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public InternalTransition createInternalTransition()
  {
		InternalTransitionImpl internalTransition = new InternalTransitionImpl();
		return internalTransition;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public CompositeState createCompositeState()
  {
		CompositeStateImpl compositeState = new CompositeStateImpl();
		return compositeState;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Session createSession()
  {
		SessionImpl session = new SessionImpl();
		return session;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Region createRegion()
  {
		RegionImpl region = new RegionImpl();
		return region;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public FinalState createFinalState()
  {
		FinalStateImpl finalState = new FinalStateImpl();
		return finalState;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public StateContainer createStateContainer()
  {
		StateContainerImpl stateContainer = new StateContainerImpl();
		return stateContainer;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public MessageParameter createMessageParameter()
  {
		MessageParameterImpl messageParameter = new MessageParameterImpl();
		return messageParameter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public DataAnalytics createDataAnalytics()
  {
		DataAnalyticsImpl dataAnalytics = new DataAnalyticsImpl();
		return dataAnalytics;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public DataAnalyticsModelAlgorithm createDataAnalyticsModelAlgorithm()
  {
		DataAnalyticsModelAlgorithmImpl dataAnalyticsModelAlgorithm = new DataAnalyticsModelAlgorithmImpl();
		return dataAnalyticsModelAlgorithm;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public PMML_ModelAlgorithm createPMML_ModelAlgorithm()
  {
		PMML_ModelAlgorithmImpl pmmL_ModelAlgorithm = new PMML_ModelAlgorithmImpl();
		return pmmL_ModelAlgorithm;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public PFA_ModelAlgorithm createPFA_ModelAlgorithm()
  {
		PFA_ModelAlgorithmImpl pfA_ModelAlgorithm = new PFA_ModelAlgorithmImpl();
		return pfA_ModelAlgorithm;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ML2_ModelAlgorithm createML2_ModelAlgorithm()
  {
		ML2_ModelAlgorithmImpl ml2_ModelAlgorithm = new ML2_ModelAlgorithmImpl();
		return ml2_ModelAlgorithm;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public DecisionTree createDecisionTree()
  {
		DecisionTreeImpl decisionTree = new DecisionTreeImpl();
		return decisionTree;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public RandomForest createRandomForest()
  {
		RandomForestImpl randomForest = new RandomForestImpl();
		return randomForest;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public GatedRecurrentUnits createGatedRecurrentUnits()
  {
		GatedRecurrentUnitsImpl gatedRecurrentUnits = new GatedRecurrentUnitsImpl();
		return gatedRecurrentUnits;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public LongShortTermMemory createLongShortTermMemory()
  {
		LongShortTermMemoryImpl longShortTermMemory = new LongShortTermMemoryImpl();
		return longShortTermMemory;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public NN_MultilayerPerceptron createNN_MultilayerPerceptron()
  {
		NN_MultilayerPerceptronImpl nN_MultilayerPerceptron = new NN_MultilayerPerceptronImpl();
		return nN_MultilayerPerceptron;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public DenoisingAutoencoders createDenoisingAutoencoders()
  {
		DenoisingAutoencodersImpl denoisingAutoencoders = new DenoisingAutoencodersImpl();
		return denoisingAutoencoders;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public FactorialHiddenMarkovModel createFactorialHiddenMarkovModel()
  {
		FactorialHiddenMarkovModelImpl factorialHiddenMarkovModel = new FactorialHiddenMarkovModelImpl();
		return factorialHiddenMarkovModel;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public CombinatorialOptimization createCombinatorialOptimization()
  {
		CombinatorialOptimizationImpl combinatorialOptimization = new CombinatorialOptimizationImpl();
		return combinatorialOptimization;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public MinSamplesSplit createMinSamplesSplit()
  {
		MinSamplesSplitImpl minSamplesSplit = new MinSamplesSplitImpl();
		return minSamplesSplit;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Event createEvent()
  {
		EventImpl event = new EventImpl();
		return event;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ReceiveMessage createReceiveMessage()
  {
		ReceiveMessageImpl receiveMessage = new ReceiveMessageImpl();
		return receiveMessage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Action createAction()
  {
		ActionImpl action = new ActionImpl();
		return action;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ActionBlock createActionBlock()
  {
		ActionBlockImpl actionBlock = new ActionBlockImpl();
		return actionBlock;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ExternStatement createExternStatement()
  {
		ExternStatementImpl externStatement = new ExternStatementImpl();
		return externStatement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public LocalVariable createLocalVariable()
  {
		LocalVariableImpl localVariable = new LocalVariableImpl();
		return localVariable;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public SendAction createSendAction()
  {
		SendActionImpl sendAction = new SendActionImpl();
		return sendAction;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public VariableAssignment createVariableAssignment()
  {
		VariableAssignmentImpl variableAssignment = new VariableAssignmentImpl();
		return variableAssignment;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Increment createIncrement()
  {
		IncrementImpl increment = new IncrementImpl();
		return increment;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Decrement createDecrement()
  {
		DecrementImpl decrement = new DecrementImpl();
		return decrement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ForAction createForAction()
  {
		ForActionImpl forAction = new ForActionImpl();
		return forAction;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public LoopAction createLoopAction()
  {
		LoopActionImpl loopAction = new LoopActionImpl();
		return loopAction;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ConditionalAction createConditionalAction()
  {
		ConditionalActionImpl conditionalAction = new ConditionalActionImpl();
		return conditionalAction;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ReturnAction createReturnAction()
  {
		ReturnActionImpl returnAction = new ReturnActionImpl();
		return returnAction;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public PrintAction createPrintAction()
  {
		PrintActionImpl printAction = new PrintActionImpl();
		return printAction;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ErrorAction createErrorAction()
  {
		ErrorActionImpl errorAction = new ErrorActionImpl();
		return errorAction;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public StartSession createStartSession()
  {
		StartSessionImpl startSession = new StartSessionImpl();
		return startSession;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public FunctionCallStatement createFunctionCallStatement()
  {
		FunctionCallStatementImpl functionCallStatement = new FunctionCallStatementImpl();
		return functionCallStatement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public DASaveAction createDASaveAction()
  {
		DASaveActionImpl daSaveAction = new DASaveActionImpl();
		return daSaveAction;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public DAPreprocessAction createDAPreprocessAction()
  {
		DAPreprocessActionImpl daPreprocessAction = new DAPreprocessActionImpl();
		return daPreprocessAction;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public DATrainAction createDATrainAction()
  {
		DATrainActionImpl daTrainAction = new DATrainActionImpl();
		return daTrainAction;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public DAPredictAction createDAPredictAction()
  {
		DAPredictActionImpl daPredictAction = new DAPredictActionImpl();
		return daPredictAction;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Expression createExpression()
  {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ExternExpression createExternExpression()
  {
		ExternExpressionImpl externExpression = new ExternExpressionImpl();
		return externExpression;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Literal createLiteral()
  {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ArrayInit createArrayInit()
  {
		ArrayInitImpl arrayInit = new ArrayInitImpl();
		return arrayInit;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EnumLiteralRef createEnumLiteralRef()
  {
		EnumLiteralRefImpl enumLiteralRef = new EnumLiteralRefImpl();
		return enumLiteralRef;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ByteLiteral createByteLiteral()
  {
		ByteLiteralImpl byteLiteral = new ByteLiteralImpl();
		return byteLiteral;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public CharLiteral createCharLiteral()
  {
		CharLiteralImpl charLiteral = new CharLiteralImpl();
		return charLiteral;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public IntegerLiteral createIntegerLiteral()
  {
		IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
		return integerLiteral;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public BooleanLiteral createBooleanLiteral()
  {
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public StringLiteral createStringLiteral()
  {
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public DoubleLiteral createDoubleLiteral()
  {
		DoubleLiteralImpl doubleLiteral = new DoubleLiteralImpl();
		return doubleLiteral;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public PropertyReference createPropertyReference()
  {
		PropertyReferenceImpl propertyReference = new PropertyReferenceImpl();
		return propertyReference;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EventReference createEventReference()
  {
		EventReferenceImpl eventReference = new EventReferenceImpl();
		return eventReference;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public FunctionCallExpression createFunctionCallExpression()
  {
		FunctionCallExpressionImpl functionCallExpression = new FunctionCallExpressionImpl();
		return functionCallExpression;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Configuration createConfiguration()
  {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Instance createInstance()
  {
		InstanceImpl instance = new InstanceImpl();
		return instance;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ConfigPropertyAssign createConfigPropertyAssign()
  {
		ConfigPropertyAssignImpl configPropertyAssign = new ConfigPropertyAssignImpl();
		return configPropertyAssign;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public AbstractConnector createAbstractConnector()
  {
		AbstractConnectorImpl abstractConnector = new AbstractConnectorImpl();
		return abstractConnector;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Connector createConnector()
  {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ExternalConnector createExternalConnector()
  {
		ExternalConnectorImpl externalConnector = new ExternalConnectorImpl();
		return externalConnector;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public OrExpression createOrExpression()
  {
		OrExpressionImpl orExpression = new OrExpressionImpl();
		return orExpression;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public AndExpression createAndExpression()
  {
		AndExpressionImpl andExpression = new AndExpressionImpl();
		return andExpression;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EqualsExpression createEqualsExpression()
  {
		EqualsExpressionImpl equalsExpression = new EqualsExpressionImpl();
		return equalsExpression;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public NotEqualsExpression createNotEqualsExpression()
  {
		NotEqualsExpressionImpl notEqualsExpression = new NotEqualsExpressionImpl();
		return notEqualsExpression;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public GreaterExpression createGreaterExpression()
  {
		GreaterExpressionImpl greaterExpression = new GreaterExpressionImpl();
		return greaterExpression;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public LowerExpression createLowerExpression()
  {
		LowerExpressionImpl lowerExpression = new LowerExpressionImpl();
		return lowerExpression;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public GreaterOrEqualExpression createGreaterOrEqualExpression()
  {
		GreaterOrEqualExpressionImpl greaterOrEqualExpression = new GreaterOrEqualExpressionImpl();
		return greaterOrEqualExpression;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public LowerOrEqualExpression createLowerOrEqualExpression()
  {
		LowerOrEqualExpressionImpl lowerOrEqualExpression = new LowerOrEqualExpressionImpl();
		return lowerOrEqualExpression;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public PlusExpression createPlusExpression()
  {
		PlusExpressionImpl plusExpression = new PlusExpressionImpl();
		return plusExpression;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public MinusExpression createMinusExpression()
  {
		MinusExpressionImpl minusExpression = new MinusExpressionImpl();
		return minusExpression;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public TimesExpression createTimesExpression()
  {
		TimesExpressionImpl timesExpression = new TimesExpressionImpl();
		return timesExpression;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public DivExpression createDivExpression()
  {
		DivExpressionImpl divExpression = new DivExpressionImpl();
		return divExpression;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ModExpression createModExpression()
  {
		ModExpressionImpl modExpression = new ModExpressionImpl();
		return modExpression;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public CastExpression createCastExpression()
  {
		CastExpressionImpl castExpression = new CastExpressionImpl();
		return castExpression;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ExpressionGroup createExpressionGroup()
  {
		ExpressionGroupImpl expressionGroup = new ExpressionGroupImpl();
		return expressionGroup;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public NotExpression createNotExpression()
  {
		NotExpressionImpl notExpression = new NotExpressionImpl();
		return notExpression;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public UnaryMinus createUnaryMinus()
  {
		UnaryMinusImpl unaryMinus = new UnaryMinusImpl();
		return unaryMinus;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ArrayIndex createArrayIndex()
  {
		ArrayIndexImpl arrayIndex = new ArrayIndexImpl();
		return arrayIndex;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Sequential createSequentialFromString(EDataType eDataType, String initialValue)
  {
		Sequential result = Sequential.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertSequentialToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Timestamps createTimestampsFromString(EDataType eDataType, String initialValue)
  {
		Timestamps result = Timestamps.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertTimestampsToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Labels createLabelsFromString(EDataType eDataType, String initialValue)
  {
		Labels result = Labels.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertLabelsToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Optimizer createOptimizerFromString(EDataType eDataType, String initialValue)
  {
		Optimizer result = Optimizer.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertOptimizerToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LossFunction createLossFunctionFromString(EDataType eDataType, String initialValue)
  {
		LossFunction result = LossFunction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertLossFunctionToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public ThingMLPackage getThingMLPackage()
  {
		return (ThingMLPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ThingMLPackage getPackage()
  {
		return ThingMLPackage.eINSTANCE;
	}

} //ThingMLFactoryImpl
