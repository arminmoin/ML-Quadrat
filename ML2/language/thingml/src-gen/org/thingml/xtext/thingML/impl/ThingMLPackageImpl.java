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

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.thingml.xtext.thingML.ThingMLFactory;
import org.thingml.xtext.thingML.ThingMLPackage;

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
  protected String packageFilename = "thingML.loadinitialization_ecore";

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
  private EClass ml2_ModelAlgorithmEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pretrained_ML_ModelEClass = null;

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
  private EClass linearRegressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linearClassifierLogisticRegressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass naiveBayesGaussianEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass naiveBayesMultinomialEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass naiveBayesComplementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass naiveBayesBernoulliEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass naiveBayesCategoricalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass decisionTreeRegressorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass decisionTreeClassifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass randomForestRegressorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass randomForestClassifierEClass = null;

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
  private EEnum autoMLEEnum = null;

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
  private EEnum preprocess_feature_scalingEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum penaltyEEnum = null;

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
  private EEnum multi_classEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum decisionTreeRegressorCriterionEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum decisionTreeClassifierCriterionEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum decisionTreeSplitterEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum max_features_enumEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum randomForestRegressorCriterionEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum randomForestClassifierCriterionEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum activationEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum learning_rate_modeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum lossEEnum = null;

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
   * @generated
   */
  public static ThingMLPackage init()
  {
    if (isInited) return (ThingMLPackage)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI);

    // Obtain or create and register package
    ThingMLPackageImpl theThingMLPackage = (ThingMLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ThingMLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ThingMLPackageImpl());

    isInited = true;

    // Load packages
    theThingMLPackage.loadPackage();

    // Fix loaded packages
    theThingMLPackage.fixPackageContents();

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
  public EClass getThingMLModel()
  {
    if (thingMLModelEClass == null)
    {
      thingMLModelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(0);
    }
    return thingMLModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThingMLModel_Imports()
  {
        return (EReference)getThingMLModel().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThingMLModel_Types()
  {
        return (EReference)getThingMLModel().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThingMLModel_Protocols()
  {
        return (EReference)getThingMLModel().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThingMLModel_Configs()
  {
        return (EReference)getThingMLModel().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    if (importEClass == null)
    {
      importEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(1);
    }
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportURI()
  {
        return (EAttribute)getImport().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_From()
  {
        return (EAttribute)getImport().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlatformAnnotation()
  {
    if (platformAnnotationEClass == null)
    {
      platformAnnotationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(2);
    }
    return platformAnnotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlatformAnnotation_Name()
  {
        return (EAttribute)getPlatformAnnotation().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlatformAnnotation_Value()
  {
        return (EAttribute)getPlatformAnnotation().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedElement()
  {
    if (namedElementEClass == null)
    {
      namedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(3);
    }
    return namedElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamedElement_Name()
  {
        return (EAttribute)getNamedElement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotatedElement()
  {
    if (annotatedElementEClass == null)
    {
      annotatedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(4);
    }
    return annotatedElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotatedElement_Annotations()
  {
        return (EReference)getAnnotatedElement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable()
  {
    if (variableEClass == null)
    {
      variableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(5);
    }
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable_TypeRef()
  {
        return (EReference)getVariable().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeRef()
  {
    if (typeRefEClass == null)
    {
      typeRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(6);
    }
    return typeRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeRef_Type()
  {
        return (EReference)getTypeRef().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeRef_IsArray()
  {
        return (EAttribute)getTypeRef().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeRef_Cardinality()
  {
        return (EReference)getTypeRef().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    if (typeEClass == null)
    {
      typeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(7);
    }
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimitiveType()
  {
    if (primitiveTypeEClass == null)
    {
      primitiveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(8);
    }
    return primitiveTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimitiveType_ByteSize()
  {
        return (EAttribute)getPrimitiveType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectType()
  {
    if (objectTypeEClass == null)
    {
      objectTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(9);
    }
    return objectTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumeration()
  {
    if (enumerationEClass == null)
    {
      enumerationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(10);
    }
    return enumerationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumeration_TypeRef()
  {
        return (EReference)getEnumeration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumeration_Literals()
  {
        return (EReference)getEnumeration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumerationLiteral()
  {
    if (enumerationLiteralEClass == null)
    {
      enumerationLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(11);
    }
    return enumerationLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumerationLiteral_Init()
  {
        return (EReference)getEnumerationLiteral().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getThing()
  {
    if (thingEClass == null)
    {
      thingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(12);
    }
    return thingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getThing_Fragment()
  {
        return (EAttribute)getThing().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThing_Includes()
  {
        return (EReference)getThing().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThing_Messages()
  {
        return (EReference)getThing().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThing_Ports()
  {
        return (EReference)getThing().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThing_Properties()
  {
        return (EReference)getThing().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThing_Functions()
  {
        return (EReference)getThing().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThing_Assign()
  {
        return (EReference)getThing().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThing_DataAnalytics()
  {
        return (EReference)getThing().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getThing_Behaviour()
  {
        return (EReference)getThing().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyAssign()
  {
    if (propertyAssignEClass == null)
    {
      propertyAssignEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(13);
    }
    return propertyAssignEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyAssign_Property()
  {
        return (EReference)getPropertyAssign().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyAssign_Index()
  {
        return (EReference)getPropertyAssign().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyAssign_Init()
  {
        return (EReference)getPropertyAssign().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProtocol()
  {
    if (protocolEClass == null)
    {
      protocolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(14);
    }
    return protocolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunction()
  {
    if (functionEClass == null)
    {
      functionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(15);
    }
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_Parameters()
  {
        return (EReference)getFunction().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_TypeRef()
  {
        return (EReference)getFunction().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunction_Body()
  {
        return (EReference)getFunction().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunction_Abstract()
  {
        return (EAttribute)getFunction().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperty()
  {
    if (propertyEClass == null)
    {
      propertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(16);
    }
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Readonly()
  {
        return (EAttribute)getProperty().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_Init()
  {
        return (EReference)getProperty().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMessage()
  {
    if (messageEClass == null)
    {
      messageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(17);
    }
    return messageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessage_Parameters()
  {
        return (EReference)getMessage().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    if (parameterEClass == null)
    {
      parameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(18);
    }
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPort()
  {
    if (portEClass == null)
    {
      portEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(19);
    }
    return portEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPort_Sends()
  {
        return (EReference)getPort().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPort_Receives()
  {
        return (EReference)getPort().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequiredPort()
  {
    if (requiredPortEClass == null)
    {
      requiredPortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(20);
    }
    return requiredPortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequiredPort_Optional()
  {
        return (EAttribute)getRequiredPort().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProvidedPort()
  {
    if (providedPortEClass == null)
    {
      providedPortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(21);
    }
    return providedPortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInternalPort()
  {
    if (internalPortEClass == null)
    {
      internalPortEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(22);
    }
    return internalPortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getState()
  {
    if (stateEClass == null)
    {
      stateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(23);
    }
    return stateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_Properties()
  {
        return (EReference)getState().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_Entry()
  {
        return (EReference)getState().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_Exit()
  {
        return (EReference)getState().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_Internal()
  {
        return (EReference)getState().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_Outgoing()
  {
        return (EReference)getState().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHandler()
  {
    if (handlerEClass == null)
    {
      handlerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(24);
    }
    return handlerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHandler_Event()
  {
        return (EReference)getHandler().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHandler_Guard()
  {
        return (EReference)getHandler().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHandler_Action()
  {
        return (EReference)getHandler().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransition()
  {
    if (transitionEClass == null)
    {
      transitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(25);
    }
    return transitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransition_Target()
  {
        return (EReference)getTransition().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInternalTransition()
  {
    if (internalTransitionEClass == null)
    {
      internalTransitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(26);
    }
    return internalTransitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompositeState()
  {
    if (compositeStateEClass == null)
    {
      compositeStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(27);
    }
    return compositeStateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompositeState_Region()
  {
        return (EReference)getCompositeState().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompositeState_Session()
  {
        return (EReference)getCompositeState().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSession()
  {
    if (sessionEClass == null)
    {
      sessionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(28);
    }
    return sessionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSession_MaxInstances()
  {
        return (EReference)getSession().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRegion()
  {
    if (regionEClass == null)
    {
      regionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(29);
    }
    return regionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFinalState()
  {
    if (finalStateEClass == null)
    {
      finalStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(30);
    }
    return finalStateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateContainer()
  {
    if (stateContainerEClass == null)
    {
      stateContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(31);
    }
    return stateContainerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateContainer_Initial()
  {
        return (EReference)getStateContainer().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateContainer_History()
  {
        return (EAttribute)getStateContainer().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateContainer_Substate()
  {
        return (EReference)getStateContainer().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMessageParameter()
  {
    if (messageParameterEClass == null)
    {
      messageParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(32);
    }
    return messageParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataAnalytics()
  {
    if (dataAnalyticsEClass == null)
    {
      dataAnalyticsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(33);
    }
    return dataAnalyticsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataAnalytics_Dataset()
  {
        return (EAttribute)getDataAnalytics().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataAnalytics_AutoML()
  {
        return (EAttribute)getDataAnalytics().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataAnalytics_Sequential()
  {
        return (EAttribute)getDataAnalytics().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataAnalytics_Timestamps()
  {
        return (EAttribute)getDataAnalytics().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataAnalytics_Labels()
  {
        return (EAttribute)getDataAnalytics().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataAnalytics_Features()
  {
        return (EReference)getDataAnalytics().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataAnalytics_Preprocess_feature_scaling()
  {
        return (EAttribute)getDataAnalytics().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataAnalytics_ModelAlgorithm()
  {
        return (EReference)getDataAnalytics().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataAnalytics_TrainingResults()
  {
        return (EAttribute)getDataAnalytics().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataAnalytics_PredictionResults()
  {
        return (EReference)getDataAnalytics().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataAnalyticsModelAlgorithm()
  {
    if (dataAnalyticsModelAlgorithmEClass == null)
    {
      dataAnalyticsModelAlgorithmEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(39);
    }
    return dataAnalyticsModelAlgorithmEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataAnalyticsModelAlgorithm_Name()
  {
        return (EAttribute)getDataAnalyticsModelAlgorithm().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getML2_ModelAlgorithm()
  {
    if (ml2_ModelAlgorithmEClass == null)
    {
      ml2_ModelAlgorithmEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(40);
    }
    return ml2_ModelAlgorithmEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPretrained_ML_Model()
  {
    if (pretrained_ML_ModelEClass == null)
    {
      pretrained_ML_ModelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(41);
    }
    return pretrained_ML_ModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPretrained_ML_Model_Pretrained_path()
  {
        return (EAttribute)getPretrained_ML_Model().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPMML_ModelAlgorithm()
  {
    if (pmmL_ModelAlgorithmEClass == null)
    {
      pmmL_ModelAlgorithmEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(42);
    }
    return pmmL_ModelAlgorithmEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPMML_ModelAlgorithm_Pmml_path()
  {
        return (EAttribute)getPMML_ModelAlgorithm().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPFA_ModelAlgorithm()
  {
    if (pfA_ModelAlgorithmEClass == null)
    {
      pfA_ModelAlgorithmEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(43);
    }
    return pfA_ModelAlgorithmEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPFA_ModelAlgorithm_Pfa_path()
  {
        return (EAttribute)getPFA_ModelAlgorithm().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinearRegression()
  {
    if (linearRegressionEClass == null)
    {
      linearRegressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(44);
    }
    return linearRegressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinearRegression_Fit_intercept()
  {
        return (EReference)getLinearRegression().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinearRegression_Normalize()
  {
        return (EReference)getLinearRegression().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinearRegression_Copy_X()
  {
        return (EReference)getLinearRegression().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinearRegression_N_jobs()
  {
        return (EReference)getLinearRegression().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinearRegression_Positive()
  {
        return (EReference)getLinearRegression().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinearClassifierLogisticRegression()
  {
    if (linearClassifierLogisticRegressionEClass == null)
    {
      linearClassifierLogisticRegressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(45);
    }
    return linearClassifierLogisticRegressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinearClassifierLogisticRegression_Penalty()
  {
        return (EAttribute)getLinearClassifierLogisticRegression().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinearClassifierLogisticRegression_Dual()
  {
        return (EReference)getLinearClassifierLogisticRegression().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinearClassifierLogisticRegression_Tol()
  {
        return (EReference)getLinearClassifierLogisticRegression().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinearClassifierLogisticRegression_C()
  {
        return (EReference)getLinearClassifierLogisticRegression().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinearClassifierLogisticRegression_Fit_intercept()
  {
        return (EReference)getLinearClassifierLogisticRegression().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinearClassifierLogisticRegression_Intercept_scaling()
  {
        return (EReference)getLinearClassifierLogisticRegression().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinearClassifierLogisticRegression_Class_weight()
  {
        return (EAttribute)getLinearClassifierLogisticRegression().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinearClassifierLogisticRegression_Random_state()
  {
        return (EReference)getLinearClassifierLogisticRegression().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinearClassifierLogisticRegression_Optimizer()
  {
        return (EAttribute)getLinearClassifierLogisticRegression().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinearClassifierLogisticRegression_Max_iter()
  {
        return (EReference)getLinearClassifierLogisticRegression().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinearClassifierLogisticRegression_Multi_class()
  {
        return (EAttribute)getLinearClassifierLogisticRegression().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinearClassifierLogisticRegression_Verbose()
  {
        return (EReference)getLinearClassifierLogisticRegression().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinearClassifierLogisticRegression_Warm_start()
  {
        return (EReference)getLinearClassifierLogisticRegression().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinearClassifierLogisticRegression_N_jobs()
  {
        return (EReference)getLinearClassifierLogisticRegression().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinearClassifierLogisticRegression_L1_ratio()
  {
        return (EReference)getLinearClassifierLogisticRegression().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNaiveBayesGaussian()
  {
    if (naiveBayesGaussianEClass == null)
    {
      naiveBayesGaussianEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(46);
    }
    return naiveBayesGaussianEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNaiveBayesGaussian_Priors()
  {
        return (EAttribute)getNaiveBayesGaussian().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaiveBayesGaussian_Var_smoothing()
  {
        return (EReference)getNaiveBayesGaussian().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNaiveBayesMultinomial()
  {
    if (naiveBayesMultinomialEClass == null)
    {
      naiveBayesMultinomialEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(47);
    }
    return naiveBayesMultinomialEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaiveBayesMultinomial_Alpha()
  {
        return (EReference)getNaiveBayesMultinomial().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaiveBayesMultinomial_Fit_prior()
  {
        return (EReference)getNaiveBayesMultinomial().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNaiveBayesMultinomial_Class_prior()
  {
        return (EAttribute)getNaiveBayesMultinomial().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNaiveBayesComplement()
  {
    if (naiveBayesComplementEClass == null)
    {
      naiveBayesComplementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(48);
    }
    return naiveBayesComplementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaiveBayesComplement_Alpha()
  {
        return (EReference)getNaiveBayesComplement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaiveBayesComplement_Fit_prior()
  {
        return (EReference)getNaiveBayesComplement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNaiveBayesComplement_Class_prior()
  {
        return (EAttribute)getNaiveBayesComplement().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaiveBayesComplement_Norm()
  {
        return (EReference)getNaiveBayesComplement().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNaiveBayesBernoulli()
  {
    if (naiveBayesBernoulliEClass == null)
    {
      naiveBayesBernoulliEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(49);
    }
    return naiveBayesBernoulliEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaiveBayesBernoulli_Alpha()
  {
        return (EReference)getNaiveBayesBernoulli().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaiveBayesBernoulli_Binarize()
  {
        return (EReference)getNaiveBayesBernoulli().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaiveBayesBernoulli_Fit_prior()
  {
        return (EReference)getNaiveBayesBernoulli().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNaiveBayesBernoulli_Class_prior()
  {
        return (EAttribute)getNaiveBayesBernoulli().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNaiveBayesCategorical()
  {
    if (naiveBayesCategoricalEClass == null)
    {
      naiveBayesCategoricalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(50);
    }
    return naiveBayesCategoricalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaiveBayesCategorical_Alpha()
  {
        return (EReference)getNaiveBayesCategorical().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNaiveBayesCategorical_Fit_prior()
  {
        return (EReference)getNaiveBayesCategorical().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNaiveBayesCategorical_Class_prior()
  {
        return (EAttribute)getNaiveBayesCategorical().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNaiveBayesCategorical_Min_categories()
  {
        return (EAttribute)getNaiveBayesCategorical().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDecisionTreeRegressor()
  {
    if (decisionTreeRegressorEClass == null)
    {
      decisionTreeRegressorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(51);
    }
    return decisionTreeRegressorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDecisionTreeRegressor_DecisionTreeRegressorCriterion()
  {
        return (EAttribute)getDecisionTreeRegressor().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDecisionTreeRegressor_DecisionTreeSplitter()
  {
        return (EAttribute)getDecisionTreeRegressor().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecisionTreeRegressor_Max_depth()
  {
        return (EReference)getDecisionTreeRegressor().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecisionTreeRegressor_Min_samples_split()
  {
        return (EReference)getDecisionTreeRegressor().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecisionTreeRegressor_Min_samples_leaf()
  {
        return (EReference)getDecisionTreeRegressor().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecisionTreeRegressor_Min_weight_fraction_leaf()
  {
        return (EReference)getDecisionTreeRegressor().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecisionTreeRegressor_Max_features_numeric()
  {
        return (EReference)getDecisionTreeRegressor().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDecisionTreeRegressor_Max_features_enum()
  {
        return (EAttribute)getDecisionTreeRegressor().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecisionTreeRegressor_Random_state()
  {
        return (EReference)getDecisionTreeRegressor().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecisionTreeRegressor_Max_leaf_nodes()
  {
        return (EReference)getDecisionTreeRegressor().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecisionTreeRegressor_Min_impurity_decrease()
  {
        return (EReference)getDecisionTreeRegressor().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecisionTreeRegressor_Min_impurity_split()
  {
        return (EReference)getDecisionTreeRegressor().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecisionTreeRegressor_Ccp_alpha()
  {
        return (EReference)getDecisionTreeRegressor().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDecisionTreeClassifier()
  {
    if (decisionTreeClassifierEClass == null)
    {
      decisionTreeClassifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(52);
    }
    return decisionTreeClassifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDecisionTreeClassifier_DecisionTreeClassifierCriterion()
  {
        return (EAttribute)getDecisionTreeClassifier().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDecisionTreeClassifier_DecisionTreeSplitter()
  {
        return (EAttribute)getDecisionTreeClassifier().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecisionTreeClassifier_Max_depth()
  {
        return (EReference)getDecisionTreeClassifier().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecisionTreeClassifier_Min_samples_split()
  {
        return (EReference)getDecisionTreeClassifier().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecisionTreeClassifier_Min_samples_leaf()
  {
        return (EReference)getDecisionTreeClassifier().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecisionTreeClassifier_Min_weight_fraction_leaf()
  {
        return (EReference)getDecisionTreeClassifier().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecisionTreeClassifier_Max_features_numeric()
  {
        return (EReference)getDecisionTreeClassifier().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDecisionTreeClassifier_Max_features_enum()
  {
        return (EAttribute)getDecisionTreeClassifier().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecisionTreeClassifier_Random_state()
  {
        return (EReference)getDecisionTreeClassifier().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecisionTreeClassifier_Max_leaf_nodes()
  {
        return (EReference)getDecisionTreeClassifier().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecisionTreeClassifier_Min_impurity_decrease()
  {
        return (EReference)getDecisionTreeClassifier().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecisionTreeClassifier_Min_impurity_split()
  {
        return (EReference)getDecisionTreeClassifier().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDecisionTreeClassifier_Class_weight()
  {
        return (EAttribute)getDecisionTreeClassifier().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecisionTreeClassifier_Ccp_alpha()
  {
        return (EReference)getDecisionTreeClassifier().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRandomForestRegressor()
  {
    if (randomForestRegressorEClass == null)
    {
      randomForestRegressorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(53);
    }
    return randomForestRegressorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestRegressor_N_estimators()
  {
        return (EReference)getRandomForestRegressor().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRandomForestRegressor_RandomForestRegressorCriterion()
  {
        return (EAttribute)getRandomForestRegressor().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestRegressor_Max_depth()
  {
        return (EReference)getRandomForestRegressor().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestRegressor_Min_samples_split()
  {
        return (EReference)getRandomForestRegressor().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestRegressor_Min_samples_leaf()
  {
        return (EReference)getRandomForestRegressor().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestRegressor_Min_weight_fraction_leaf()
  {
        return (EReference)getRandomForestRegressor().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestRegressor_Max_features_numeric()
  {
        return (EReference)getRandomForestRegressor().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRandomForestRegressor_Max_features_enum()
  {
        return (EAttribute)getRandomForestRegressor().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestRegressor_Max_leaf_nodes()
  {
        return (EReference)getRandomForestRegressor().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestRegressor_Min_impurity_decrease()
  {
        return (EReference)getRandomForestRegressor().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestRegressor_Min_impurity_split()
  {
        return (EReference)getRandomForestRegressor().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestRegressor_Bootstrap()
  {
        return (EReference)getRandomForestRegressor().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestRegressor_Oob_score()
  {
        return (EReference)getRandomForestRegressor().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestRegressor_N_jobs()
  {
        return (EReference)getRandomForestRegressor().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestRegressor_Random_state()
  {
        return (EReference)getRandomForestRegressor().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestRegressor_Verbose()
  {
        return (EReference)getRandomForestRegressor().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestRegressor_Warm_start()
  {
        return (EReference)getRandomForestRegressor().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestRegressor_Ccp_alpha()
  {
        return (EReference)getRandomForestRegressor().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestRegressor_Max_samples()
  {
        return (EReference)getRandomForestRegressor().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRandomForestClassifier()
  {
    if (randomForestClassifierEClass == null)
    {
      randomForestClassifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(54);
    }
    return randomForestClassifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestClassifier_N_estimators()
  {
        return (EReference)getRandomForestClassifier().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRandomForestClassifier_RandomForestClassifierCriterion()
  {
        return (EAttribute)getRandomForestClassifier().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestClassifier_Max_depth()
  {
        return (EReference)getRandomForestClassifier().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestClassifier_Min_samples_split()
  {
        return (EReference)getRandomForestClassifier().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestClassifier_Min_samples_leaf()
  {
        return (EReference)getRandomForestClassifier().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestClassifier_Min_weight_fraction_leaf()
  {
        return (EReference)getRandomForestClassifier().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestClassifier_Max_features_numeric()
  {
        return (EReference)getRandomForestClassifier().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRandomForestClassifier_Max_features_enum()
  {
        return (EAttribute)getRandomForestClassifier().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestClassifier_Max_leaf_nodes()
  {
        return (EReference)getRandomForestClassifier().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestClassifier_Min_impurity_decrease()
  {
        return (EReference)getRandomForestClassifier().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestClassifier_Min_impurity_split()
  {
        return (EReference)getRandomForestClassifier().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestClassifier_Bootstrap()
  {
        return (EReference)getRandomForestClassifier().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestClassifier_Oob_score()
  {
        return (EReference)getRandomForestClassifier().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestClassifier_N_jobs()
  {
        return (EReference)getRandomForestClassifier().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestClassifier_Random_state()
  {
        return (EReference)getRandomForestClassifier().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestClassifier_Verbose()
  {
        return (EReference)getRandomForestClassifier().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestClassifier_Warm_start()
  {
        return (EReference)getRandomForestClassifier().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRandomForestClassifier_Class_weight()
  {
        return (EAttribute)getRandomForestClassifier().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestClassifier_Ccp_alpha()
  {
        return (EReference)getRandomForestClassifier().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRandomForestClassifier_Max_samples()
  {
        return (EReference)getRandomForestClassifier().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNN_MultilayerPerceptron()
  {
    if (nN_MultilayerPerceptronEClass == null)
    {
      nN_MultilayerPerceptronEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(55);
    }
    return nN_MultilayerPerceptronEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNN_MultilayerPerceptron_Hidden_layer_sizes()
  {
        return (EAttribute)getNN_MultilayerPerceptron().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNN_MultilayerPerceptron_Hidden_layers()
  {
        return (EReference)getNN_MultilayerPerceptron().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNN_MultilayerPerceptron_Activation()
  {
        return (EAttribute)getNN_MultilayerPerceptron().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNN_MultilayerPerceptron_Optimizer()
  {
        return (EAttribute)getNN_MultilayerPerceptron().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNN_MultilayerPerceptron_Alpha()
  {
        return (EReference)getNN_MultilayerPerceptron().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNN_MultilayerPerceptron_Batch_size()
  {
        return (EReference)getNN_MultilayerPerceptron().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNN_MultilayerPerceptron_Learning_rate_mode()
  {
        return (EAttribute)getNN_MultilayerPerceptron().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNN_MultilayerPerceptron_Learning_rate_init()
  {
        return (EAttribute)getNN_MultilayerPerceptron().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNN_MultilayerPerceptron_Power_t()
  {
        return (EReference)getNN_MultilayerPerceptron().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNN_MultilayerPerceptron_Max_iter()
  {
        return (EReference)getNN_MultilayerPerceptron().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNN_MultilayerPerceptron_Shuffle()
  {
        return (EReference)getNN_MultilayerPerceptron().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNN_MultilayerPerceptron_Random_state()
  {
        return (EReference)getNN_MultilayerPerceptron().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNN_MultilayerPerceptron_Tol()
  {
        return (EReference)getNN_MultilayerPerceptron().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNN_MultilayerPerceptron_Verbose()
  {
        return (EReference)getNN_MultilayerPerceptron().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNN_MultilayerPerceptron_Warm_start()
  {
        return (EReference)getNN_MultilayerPerceptron().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNN_MultilayerPerceptron_Momentum()
  {
        return (EReference)getNN_MultilayerPerceptron().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNN_MultilayerPerceptron_Nesterovs_momentum()
  {
        return (EReference)getNN_MultilayerPerceptron().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNN_MultilayerPerceptron_Early_stopping()
  {
        return (EReference)getNN_MultilayerPerceptron().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNN_MultilayerPerceptron_Validation_fraction()
  {
        return (EReference)getNN_MultilayerPerceptron().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNN_MultilayerPerceptron_Beta_1()
  {
        return (EReference)getNN_MultilayerPerceptron().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNN_MultilayerPerceptron_Beta_2()
  {
        return (EReference)getNN_MultilayerPerceptron().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNN_MultilayerPerceptron_Epsilon()
  {
        return (EReference)getNN_MultilayerPerceptron().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNN_MultilayerPerceptron_N_iter_no_change()
  {
        return (EReference)getNN_MultilayerPerceptron().getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNN_MultilayerPerceptron_Max_fun()
  {
        return (EReference)getNN_MultilayerPerceptron().getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNN_MultilayerPerceptron_Loss()
  {
        return (EAttribute)getNN_MultilayerPerceptron().getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNN_MultilayerPerceptron_Epochs()
  {
        return (EReference)getNN_MultilayerPerceptron().getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvent()
  {
    if (eventEClass == null)
    {
      eventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(68);
    }
    return eventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReceiveMessage()
  {
    if (receiveMessageEClass == null)
    {
      receiveMessageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(69);
    }
    return receiveMessageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReceiveMessage_Port()
  {
        return (EReference)getReceiveMessage().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReceiveMessage_Message()
  {
        return (EReference)getReceiveMessage().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAction()
  {
    if (actionEClass == null)
    {
      actionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(70);
    }
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionBlock()
  {
    if (actionBlockEClass == null)
    {
      actionBlockEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(71);
    }
    return actionBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionBlock_Actions()
  {
        return (EReference)getActionBlock().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternStatement()
  {
    if (externStatementEClass == null)
    {
      externStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(72);
    }
    return externStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExternStatement_Statement()
  {
        return (EAttribute)getExternStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternStatement_Segments()
  {
        return (EReference)getExternStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalVariable()
  {
    if (localVariableEClass == null)
    {
      localVariableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(73);
    }
    return localVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocalVariable_Readonly()
  {
        return (EAttribute)getLocalVariable().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalVariable_Init()
  {
        return (EReference)getLocalVariable().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSendAction()
  {
    if (sendActionEClass == null)
    {
      sendActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(74);
    }
    return sendActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSendAction_Port()
  {
        return (EReference)getSendAction().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSendAction_Message()
  {
        return (EReference)getSendAction().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSendAction_Parameters()
  {
        return (EReference)getSendAction().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableAssignment()
  {
    if (variableAssignmentEClass == null)
    {
      variableAssignmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(75);
    }
    return variableAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableAssignment_Property()
  {
        return (EReference)getVariableAssignment().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableAssignment_Index()
  {
        return (EReference)getVariableAssignment().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableAssignment_Expression()
  {
        return (EReference)getVariableAssignment().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIncrement()
  {
    if (incrementEClass == null)
    {
      incrementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(76);
    }
    return incrementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIncrement_Var()
  {
        return (EReference)getIncrement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDecrement()
  {
    if (decrementEClass == null)
    {
      decrementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(77);
    }
    return decrementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecrement_Var()
  {
        return (EReference)getDecrement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForAction()
  {
    if (forActionEClass == null)
    {
      forActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(78);
    }
    return forActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForAction_Variable()
  {
        return (EReference)getForAction().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForAction_Index()
  {
        return (EReference)getForAction().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForAction_Array()
  {
        return (EReference)getForAction().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForAction_Action()
  {
        return (EReference)getForAction().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoopAction()
  {
    if (loopActionEClass == null)
    {
      loopActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(79);
    }
    return loopActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoopAction_Condition()
  {
        return (EReference)getLoopAction().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoopAction_Action()
  {
        return (EReference)getLoopAction().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionalAction()
  {
    if (conditionalActionEClass == null)
    {
      conditionalActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(80);
    }
    return conditionalActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionalAction_Condition()
  {
        return (EReference)getConditionalAction().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionalAction_Action()
  {
        return (EReference)getConditionalAction().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionalAction_ElseAction()
  {
        return (EReference)getConditionalAction().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReturnAction()
  {
    if (returnActionEClass == null)
    {
      returnActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(81);
    }
    return returnActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReturnAction_Exp()
  {
        return (EReference)getReturnAction().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrintAction()
  {
    if (printActionEClass == null)
    {
      printActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(82);
    }
    return printActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrintAction_Line()
  {
        return (EAttribute)getPrintAction().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrintAction_Msg()
  {
        return (EReference)getPrintAction().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getErrorAction()
  {
    if (errorActionEClass == null)
    {
      errorActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(83);
    }
    return errorActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getErrorAction_Line()
  {
        return (EAttribute)getErrorAction().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getErrorAction_Msg()
  {
        return (EReference)getErrorAction().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStartSession()
  {
    if (startSessionEClass == null)
    {
      startSessionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(84);
    }
    return startSessionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStartSession_Session()
  {
        return (EReference)getStartSession().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionCallStatement()
  {
    if (functionCallStatementEClass == null)
    {
      functionCallStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(85);
    }
    return functionCallStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionCallStatement_Function()
  {
        return (EReference)getFunctionCallStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionCallStatement_Parameters()
  {
        return (EReference)getFunctionCallStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDASaveAction()
  {
    if (daSaveActionEClass == null)
    {
      daSaveActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(86);
    }
    return daSaveActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDASaveAction_DataAnalytics()
  {
        return (EReference)getDASaveAction().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDAPreprocessAction()
  {
    if (daPreprocessActionEClass == null)
    {
      daPreprocessActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(87);
    }
    return daPreprocessActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDAPreprocessAction_DataAnalytics()
  {
        return (EReference)getDAPreprocessAction().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDATrainAction()
  {
    if (daTrainActionEClass == null)
    {
      daTrainActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(88);
    }
    return daTrainActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDATrainAction_DataAnalytics()
  {
        return (EReference)getDATrainAction().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDAPredictAction()
  {
    if (daPredictActionEClass == null)
    {
      daPredictActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(89);
    }
    return daPredictActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDAPredictAction_DataAnalytics()
  {
        return (EReference)getDAPredictAction().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDAPredictAction_Features()
  {
        return (EReference)getDAPredictAction().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    if (expressionEClass == null)
    {
      expressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(90);
    }
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternExpression()
  {
    if (externExpressionEClass == null)
    {
      externExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(91);
    }
    return externExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExternExpression_Expression()
  {
        return (EAttribute)getExternExpression().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternExpression_Segments()
  {
        return (EReference)getExternExpression().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteral()
  {
    if (literalEClass == null)
    {
      literalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(92);
    }
    return literalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayInit()
  {
    if (arrayInitEClass == null)
    {
      arrayInitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(93);
    }
    return arrayInitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayInit_Values()
  {
        return (EReference)getArrayInit().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumLiteralRef()
  {
    if (enumLiteralRefEClass == null)
    {
      enumLiteralRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(94);
    }
    return enumLiteralRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumLiteralRef_Enum()
  {
        return (EReference)getEnumLiteralRef().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumLiteralRef_Literal()
  {
        return (EReference)getEnumLiteralRef().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getByteLiteral()
  {
    if (byteLiteralEClass == null)
    {
      byteLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(95);
    }
    return byteLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getByteLiteral_ByteValue()
  {
        return (EAttribute)getByteLiteral().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCharLiteral()
  {
    if (charLiteralEClass == null)
    {
      charLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(96);
    }
    return charLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCharLiteral_CharValue()
  {
        return (EAttribute)getCharLiteral().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerLiteral()
  {
    if (integerLiteralEClass == null)
    {
      integerLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(97);
    }
    return integerLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerLiteral_IntValue()
  {
        return (EAttribute)getIntegerLiteral().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanLiteral()
  {
    if (booleanLiteralEClass == null)
    {
      booleanLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(98);
    }
    return booleanLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanLiteral_BoolValue()
  {
        return (EAttribute)getBooleanLiteral().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringLiteral()
  {
    if (stringLiteralEClass == null)
    {
      stringLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(99);
    }
    return stringLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringLiteral_StringValue()
  {
        return (EAttribute)getStringLiteral().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoubleLiteral()
  {
    if (doubleLiteralEClass == null)
    {
      doubleLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(100);
    }
    return doubleLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDoubleLiteral_DoubleValue()
  {
        return (EAttribute)getDoubleLiteral().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyReference()
  {
    if (propertyReferenceEClass == null)
    {
      propertyReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(101);
    }
    return propertyReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyReference_Property()
  {
        return (EReference)getPropertyReference().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventReference()
  {
    if (eventReferenceEClass == null)
    {
      eventReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(102);
    }
    return eventReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventReference_ReceiveMsg()
  {
        return (EReference)getEventReference().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventReference_Parameter()
  {
        return (EReference)getEventReference().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionCallExpression()
  {
    if (functionCallExpressionEClass == null)
    {
      functionCallExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(103);
    }
    return functionCallExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionCallExpression_Function()
  {
        return (EReference)getFunctionCallExpression().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionCallExpression_Parameters()
  {
        return (EReference)getFunctionCallExpression().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConfiguration()
  {
    if (configurationEClass == null)
    {
      configurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(104);
    }
    return configurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfiguration_Instances()
  {
        return (EReference)getConfiguration().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfiguration_Connectors()
  {
        return (EReference)getConfiguration().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfiguration_Propassigns()
  {
        return (EReference)getConfiguration().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstance()
  {
    if (instanceEClass == null)
    {
      instanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(105);
    }
    return instanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstance_Type()
  {
        return (EReference)getInstance().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConfigPropertyAssign()
  {
    if (configPropertyAssignEClass == null)
    {
      configPropertyAssignEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(106);
    }
    return configPropertyAssignEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfigPropertyAssign_Instance()
  {
        return (EReference)getConfigPropertyAssign().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfigPropertyAssign_Property()
  {
        return (EReference)getConfigPropertyAssign().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfigPropertyAssign_Index()
  {
        return (EReference)getConfigPropertyAssign().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfigPropertyAssign_Init()
  {
        return (EReference)getConfigPropertyAssign().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfigPropertyAssign_Annotations()
  {
        return (EReference)getConfigPropertyAssign().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractConnector()
  {
    if (abstractConnectorEClass == null)
    {
      abstractConnectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(107);
    }
    return abstractConnectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConnector()
  {
    if (connectorEClass == null)
    {
      connectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(108);
    }
    return connectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConnector_Cli()
  {
        return (EReference)getConnector().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConnector_Required()
  {
        return (EReference)getConnector().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConnector_Srv()
  {
        return (EReference)getConnector().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConnector_Provided()
  {
        return (EReference)getConnector().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternalConnector()
  {
    if (externalConnectorEClass == null)
    {
      externalConnectorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(109);
    }
    return externalConnectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalConnector_Inst()
  {
        return (EReference)getExternalConnector().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalConnector_Port()
  {
        return (EReference)getExternalConnector().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalConnector_Protocol()
  {
        return (EReference)getExternalConnector().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrExpression()
  {
    if (orExpressionEClass == null)
    {
      orExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(110);
    }
    return orExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrExpression_Lhs()
  {
        return (EReference)getOrExpression().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrExpression_Rhs()
  {
        return (EReference)getOrExpression().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndExpression()
  {
    if (andExpressionEClass == null)
    {
      andExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(111);
    }
    return andExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndExpression_Lhs()
  {
        return (EReference)getAndExpression().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndExpression_Rhs()
  {
        return (EReference)getAndExpression().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEqualsExpression()
  {
    if (equalsExpressionEClass == null)
    {
      equalsExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(112);
    }
    return equalsExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEqualsExpression_Lhs()
  {
        return (EReference)getEqualsExpression().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEqualsExpression_Rhs()
  {
        return (EReference)getEqualsExpression().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotEqualsExpression()
  {
    if (notEqualsExpressionEClass == null)
    {
      notEqualsExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(113);
    }
    return notEqualsExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNotEqualsExpression_Lhs()
  {
        return (EReference)getNotEqualsExpression().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNotEqualsExpression_Rhs()
  {
        return (EReference)getNotEqualsExpression().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGreaterExpression()
  {
    if (greaterExpressionEClass == null)
    {
      greaterExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(114);
    }
    return greaterExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGreaterExpression_Lhs()
  {
        return (EReference)getGreaterExpression().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGreaterExpression_Rhs()
  {
        return (EReference)getGreaterExpression().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLowerExpression()
  {
    if (lowerExpressionEClass == null)
    {
      lowerExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(115);
    }
    return lowerExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLowerExpression_Lhs()
  {
        return (EReference)getLowerExpression().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLowerExpression_Rhs()
  {
        return (EReference)getLowerExpression().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGreaterOrEqualExpression()
  {
    if (greaterOrEqualExpressionEClass == null)
    {
      greaterOrEqualExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(116);
    }
    return greaterOrEqualExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGreaterOrEqualExpression_Lhs()
  {
        return (EReference)getGreaterOrEqualExpression().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGreaterOrEqualExpression_Rhs()
  {
        return (EReference)getGreaterOrEqualExpression().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLowerOrEqualExpression()
  {
    if (lowerOrEqualExpressionEClass == null)
    {
      lowerOrEqualExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(117);
    }
    return lowerOrEqualExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLowerOrEqualExpression_Lhs()
  {
        return (EReference)getLowerOrEqualExpression().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLowerOrEqualExpression_Rhs()
  {
        return (EReference)getLowerOrEqualExpression().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlusExpression()
  {
    if (plusExpressionEClass == null)
    {
      plusExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(118);
    }
    return plusExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlusExpression_Lhs()
  {
        return (EReference)getPlusExpression().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlusExpression_Rhs()
  {
        return (EReference)getPlusExpression().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMinusExpression()
  {
    if (minusExpressionEClass == null)
    {
      minusExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(119);
    }
    return minusExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMinusExpression_Lhs()
  {
        return (EReference)getMinusExpression().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMinusExpression_Rhs()
  {
        return (EReference)getMinusExpression().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimesExpression()
  {
    if (timesExpressionEClass == null)
    {
      timesExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(120);
    }
    return timesExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTimesExpression_Lhs()
  {
        return (EReference)getTimesExpression().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTimesExpression_Rhs()
  {
        return (EReference)getTimesExpression().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDivExpression()
  {
    if (divExpressionEClass == null)
    {
      divExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(121);
    }
    return divExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDivExpression_Lhs()
  {
        return (EReference)getDivExpression().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDivExpression_Rhs()
  {
        return (EReference)getDivExpression().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModExpression()
  {
    if (modExpressionEClass == null)
    {
      modExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(122);
    }
    return modExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModExpression_Lhs()
  {
        return (EReference)getModExpression().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModExpression_Rhs()
  {
        return (EReference)getModExpression().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCastExpression()
  {
    if (castExpressionEClass == null)
    {
      castExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(123);
    }
    return castExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCastExpression_Term()
  {
        return (EReference)getCastExpression().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCastExpression_Type()
  {
        return (EReference)getCastExpression().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCastExpression_IsArray()
  {
        return (EAttribute)getCastExpression().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionGroup()
  {
    if (expressionGroupEClass == null)
    {
      expressionGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(124);
    }
    return expressionGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionGroup_Term()
  {
        return (EReference)getExpressionGroup().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotExpression()
  {
    if (notExpressionEClass == null)
    {
      notExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(125);
    }
    return notExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNotExpression_Term()
  {
        return (EReference)getNotExpression().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnaryMinus()
  {
    if (unaryMinusEClass == null)
    {
      unaryMinusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(126);
    }
    return unaryMinusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryMinus_Term()
  {
        return (EReference)getUnaryMinus().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayIndex()
  {
    if (arrayIndexEClass == null)
    {
      arrayIndexEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(127);
    }
    return arrayIndexEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayIndex_Array()
  {
        return (EReference)getArrayIndex().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayIndex_Index()
  {
        return (EReference)getArrayIndex().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAutoML()
  {
    if (autoMLEEnum == null)
    {
      autoMLEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(34);
    }
    return autoMLEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSequential()
  {
    if (sequentialEEnum == null)
    {
      sequentialEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(35);
    }
    return sequentialEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTimestamps()
  {
    if (timestampsEEnum == null)
    {
      timestampsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(36);
    }
    return timestampsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLabels()
  {
    if (labelsEEnum == null)
    {
      labelsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(37);
    }
    return labelsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPreprocess_feature_scaling()
  {
    if (preprocess_feature_scalingEEnum == null)
    {
      preprocess_feature_scalingEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(38);
    }
    return preprocess_feature_scalingEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPenalty()
  {
    if (penaltyEEnum == null)
    {
      penaltyEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(56);
    }
    return penaltyEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOptimizer()
  {
    if (optimizerEEnum == null)
    {
      optimizerEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(57);
    }
    return optimizerEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMulti_class()
  {
    if (multi_classEEnum == null)
    {
      multi_classEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(58);
    }
    return multi_classEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDecisionTreeRegressorCriterion()
  {
    if (decisionTreeRegressorCriterionEEnum == null)
    {
      decisionTreeRegressorCriterionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(59);
    }
    return decisionTreeRegressorCriterionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDecisionTreeClassifierCriterion()
  {
    if (decisionTreeClassifierCriterionEEnum == null)
    {
      decisionTreeClassifierCriterionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(60);
    }
    return decisionTreeClassifierCriterionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDecisionTreeSplitter()
  {
    if (decisionTreeSplitterEEnum == null)
    {
      decisionTreeSplitterEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(61);
    }
    return decisionTreeSplitterEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMax_features_enum()
  {
    if (max_features_enumEEnum == null)
    {
      max_features_enumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(62);
    }
    return max_features_enumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getRandomForestRegressorCriterion()
  {
    if (randomForestRegressorCriterionEEnum == null)
    {
      randomForestRegressorCriterionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(63);
    }
    return randomForestRegressorCriterionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getRandomForestClassifierCriterion()
  {
    if (randomForestClassifierCriterionEEnum == null)
    {
      randomForestClassifierCriterionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(64);
    }
    return randomForestClassifierCriterionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getActivation()
  {
    if (activationEEnum == null)
    {
      activationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(65);
    }
    return activationEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLearning_rate_mode()
  {
    if (learning_rate_modeEEnum == null)
    {
      learning_rate_modeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(66);
    }
    return learning_rate_modeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLoss()
  {
    if (lossEEnum == null)
    {
      lossEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ThingMLPackage.eNS_URI).getEClassifiers().get(67);
    }
    return lossEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThingMLFactory getThingMLFactory()
  {
    return (ThingMLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isLoaded = false;

  /**
   * Laods the package and any sub-packages from their serialized form.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void loadPackage()
  {
    if (isLoaded) return;
    isLoaded = true;

    URL url = getClass().getResource(packageFilename);
    if (url == null)
    {
      throw new RuntimeException("Missing serialized package: " + packageFilename);
    }
    URI uri = URI.createURI(url.toString());
    Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
    try
    {
      resource.load(null);
    }
    catch (IOException exception)
    {
      throw new WrappedException(exception);
    }
    initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
    createResource(eNS_URI);
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isFixed = false;

  /**
   * Fixes up the loaded package, to make it appear as if it had been programmatically built.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void fixPackageContents()
  {
    if (isFixed) return;
    isFixed = true;
    fixEClassifiers();
  }

  /**
   * Sets the instance class on the given classifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void fixInstanceClass(EClassifier eClassifier)
  {
    if (eClassifier.getInstanceClassName() == null)
    {
      eClassifier.setInstanceClassName("org.thingml.xtext.thingML." + eClassifier.getName());
      setGeneratedClassName(eClassifier);
    }
  }

} //ThingMLPackageImpl
