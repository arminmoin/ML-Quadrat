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
package org.thingml.xtext.thingML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.thingml.xtext.thingML.ThingMLFactory
 * @model kind="package"
 * @generated
 */
public interface ThingMLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "thingML";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.thingml.org/xtext/ThingML";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "thingML";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ThingMLPackage eINSTANCE = org.thingml.xtext.thingML.impl.ThingMLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.ThingMLModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.ThingMLModelImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getThingMLModel()
   * @generated
   */
  int THING_ML_MODEL = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING_ML_MODEL__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING_ML_MODEL__TYPES = 1;

  /**
   * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING_ML_MODEL__PROTOCOLS = 2;

  /**
   * The feature id for the '<em><b>Configs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING_ML_MODEL__CONFIGS = 3;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING_ML_MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.ImportImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_URI = 0;

  /**
   * The feature id for the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__FROM = 1;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.PlatformAnnotationImpl <em>Platform Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.PlatformAnnotationImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getPlatformAnnotation()
   * @generated
   */
  int PLATFORM_ANNOTATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLATFORM_ANNOTATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLATFORM_ANNOTATION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Platform Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLATFORM_ANNOTATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.NamedElementImpl <em>Named Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.NamedElementImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getNamedElement()
   * @generated
   */
  int NAMED_ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Named Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.AnnotatedElementImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getAnnotatedElement()
   * @generated
   */
  int ANNOTATED_ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATED_ELEMENT__ANNOTATIONS = 0;

  /**
   * The number of structural features of the '<em>Annotated Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATED_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.VariableImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__TYPE_REF = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.TypeRefImpl <em>Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.TypeRefImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getTypeRef()
   * @generated
   */
  int TYPE_REF = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REF__TYPE = 0;

  /**
   * The feature id for the '<em><b>Is Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REF__IS_ARRAY = 1;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REF__CARDINALITY = 2;

  /**
   * The number of structural features of the '<em>Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.TypeImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getType()
   * @generated
   */
  int TYPE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.PrimitiveTypeImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getPrimitiveType()
   * @generated
   */
  int PRIMITIVE_TYPE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE__ANNOTATIONS = TYPE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Byte Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE__BYTE_SIZE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Primitive Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.ObjectTypeImpl <em>Object Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.ObjectTypeImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getObjectType()
   * @generated
   */
  int OBJECT_TYPE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TYPE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TYPE__ANNOTATIONS = TYPE__ANNOTATIONS;

  /**
   * The number of structural features of the '<em>Object Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.EnumerationImpl <em>Enumeration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.EnumerationImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getEnumeration()
   * @generated
   */
  int ENUMERATION = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__ANNOTATIONS = TYPE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__TYPE_REF = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Literals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__LITERALS = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enumeration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.EnumerationLiteralImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getEnumerationLiteral()
   * @generated
   */
  int ENUMERATION_LITERAL = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL__INIT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enumeration Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.ThingImpl <em>Thing</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.ThingImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getThing()
   * @generated
   */
  int THING = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING__ANNOTATIONS = TYPE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Fragment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING__FRAGMENT = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Includes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING__INCLUDES = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Messages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING__MESSAGES = TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING__PORTS = TYPE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING__PROPERTIES = TYPE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING__FUNCTIONS = TYPE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING__ASSIGN = TYPE_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Data Analytics</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING__DATA_ANALYTICS = TYPE_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Behaviour</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING__BEHAVIOUR = TYPE_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Thing</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING_FEATURE_COUNT = TYPE_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.PropertyAssignImpl <em>Property Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.PropertyAssignImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getPropertyAssign()
   * @generated
   */
  int PROPERTY_ASSIGN = 13;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ASSIGN__ANNOTATIONS = ANNOTATED_ELEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ASSIGN__PROPERTY = ANNOTATED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ASSIGN__INDEX = ANNOTATED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ASSIGN__INIT = ANNOTATED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Property Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ASSIGN_FEATURE_COUNT = ANNOTATED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.ProtocolImpl <em>Protocol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.ProtocolImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getProtocol()
   * @generated
   */
  int PROTOCOL = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Protocol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.FunctionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__TYPE_REF = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__BODY = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__ABSTRACT = NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.PropertyImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = VARIABLE__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__ANNOTATIONS = VARIABLE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__TYPE_REF = VARIABLE__TYPE_REF;

  /**
   * The feature id for the '<em><b>Readonly</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__READONLY = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__INIT = VARIABLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.MessageImpl <em>Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.MessageImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getMessage()
   * @generated
   */
  int MESSAGE = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.ParameterImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE_REF = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.PortImpl <em>Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.PortImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getPort()
   * @generated
   */
  int PORT = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sends</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__SENDS = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Receives</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__RECEIVES = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.RequiredPortImpl <em>Required Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.RequiredPortImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getRequiredPort()
   * @generated
   */
  int REQUIRED_PORT = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_PORT__NAME = PORT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_PORT__ANNOTATIONS = PORT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Sends</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_PORT__SENDS = PORT__SENDS;

  /**
   * The feature id for the '<em><b>Receives</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_PORT__RECEIVES = PORT__RECEIVES;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_PORT__OPTIONAL = PORT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Required Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.ProvidedPortImpl <em>Provided Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.ProvidedPortImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getProvidedPort()
   * @generated
   */
  int PROVIDED_PORT = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_PORT__NAME = PORT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_PORT__ANNOTATIONS = PORT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Sends</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_PORT__SENDS = PORT__SENDS;

  /**
   * The feature id for the '<em><b>Receives</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_PORT__RECEIVES = PORT__RECEIVES;

  /**
   * The number of structural features of the '<em>Provided Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.InternalPortImpl <em>Internal Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.InternalPortImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getInternalPort()
   * @generated
   */
  int INTERNAL_PORT = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_PORT__NAME = PORT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_PORT__ANNOTATIONS = PORT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Sends</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_PORT__SENDS = PORT__SENDS;

  /**
   * The feature id for the '<em><b>Receives</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_PORT__RECEIVES = PORT__RECEIVES;

  /**
   * The number of structural features of the '<em>Internal Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.StateImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getState()
   * @generated
   */
  int STATE = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__PROPERTIES = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Entry</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__ENTRY = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Exit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__EXIT = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Internal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__INTERNAL = NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__OUTGOING = NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.HandlerImpl <em>Handler</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.HandlerImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getHandler()
   * @generated
   */
  int HANDLER = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER__EVENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER__GUARD = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER__ACTION = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Handler</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.TransitionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__NAME = HANDLER__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__ANNOTATIONS = HANDLER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__EVENT = HANDLER__EVENT;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__GUARD = HANDLER__GUARD;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__ACTION = HANDLER__ACTION;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TARGET = HANDLER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = HANDLER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.InternalTransitionImpl <em>Internal Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.InternalTransitionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getInternalTransition()
   * @generated
   */
  int INTERNAL_TRANSITION = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_TRANSITION__NAME = HANDLER__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_TRANSITION__ANNOTATIONS = HANDLER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_TRANSITION__EVENT = HANDLER__EVENT;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_TRANSITION__GUARD = HANDLER__GUARD;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_TRANSITION__ACTION = HANDLER__ACTION;

  /**
   * The number of structural features of the '<em>Internal Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_TRANSITION_FEATURE_COUNT = HANDLER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.CompositeStateImpl <em>Composite State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.CompositeStateImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getCompositeState()
   * @generated
   */
  int COMPOSITE_STATE = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__NAME = STATE__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__ANNOTATIONS = STATE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__PROPERTIES = STATE__PROPERTIES;

  /**
   * The feature id for the '<em><b>Entry</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__ENTRY = STATE__ENTRY;

  /**
   * The feature id for the '<em><b>Exit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__EXIT = STATE__EXIT;

  /**
   * The feature id for the '<em><b>Internal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__INTERNAL = STATE__INTERNAL;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__OUTGOING = STATE__OUTGOING;

  /**
   * The feature id for the '<em><b>Initial</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__INITIAL = STATE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>History</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__HISTORY = STATE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Substate</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__SUBSTATE = STATE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Region</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__REGION = STATE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Session</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__SESSION = STATE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Composite State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.StateContainerImpl <em>State Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.StateContainerImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getStateContainer()
   * @generated
   */
  int STATE_CONTAINER = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTAINER__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTAINER__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Initial</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTAINER__INITIAL = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>History</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTAINER__HISTORY = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Substate</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTAINER__SUBSTATE = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>State Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTAINER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.SessionImpl <em>Session</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.SessionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getSession()
   * @generated
   */
  int SESSION = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION__NAME = STATE_CONTAINER__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION__ANNOTATIONS = STATE_CONTAINER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Initial</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION__INITIAL = STATE_CONTAINER__INITIAL;

  /**
   * The feature id for the '<em><b>History</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION__HISTORY = STATE_CONTAINER__HISTORY;

  /**
   * The feature id for the '<em><b>Substate</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION__SUBSTATE = STATE_CONTAINER__SUBSTATE;

  /**
   * The feature id for the '<em><b>Max Instances</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION__MAX_INSTANCES = STATE_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Session</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION_FEATURE_COUNT = STATE_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.RegionImpl <em>Region</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.RegionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getRegion()
   * @generated
   */
  int REGION = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION__NAME = STATE_CONTAINER__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION__ANNOTATIONS = STATE_CONTAINER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Initial</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION__INITIAL = STATE_CONTAINER__INITIAL;

  /**
   * The feature id for the '<em><b>History</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION__HISTORY = STATE_CONTAINER__HISTORY;

  /**
   * The feature id for the '<em><b>Substate</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION__SUBSTATE = STATE_CONTAINER__SUBSTATE;

  /**
   * The number of structural features of the '<em>Region</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION_FEATURE_COUNT = STATE_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.FinalStateImpl <em>Final State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.FinalStateImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getFinalState()
   * @generated
   */
  int FINAL_STATE = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_STATE__NAME = STATE__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_STATE__ANNOTATIONS = STATE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_STATE__PROPERTIES = STATE__PROPERTIES;

  /**
   * The feature id for the '<em><b>Entry</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_STATE__ENTRY = STATE__ENTRY;

  /**
   * The feature id for the '<em><b>Exit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_STATE__EXIT = STATE__EXIT;

  /**
   * The feature id for the '<em><b>Internal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_STATE__INTERNAL = STATE__INTERNAL;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_STATE__OUTGOING = STATE__OUTGOING;

  /**
   * The number of structural features of the '<em>Final State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.MessageParameterImpl <em>Message Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.MessageParameterImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getMessageParameter()
   * @generated
   */
  int MESSAGE_PARAMETER = 32;

  /**
   * The number of structural features of the '<em>Message Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_PARAMETER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.DataAnalyticsImpl <em>Data Analytics</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.DataAnalyticsImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getDataAnalytics()
   * @generated
   */
  int DATA_ANALYTICS = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ANALYTICS__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ANALYTICS__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dataset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ANALYTICS__DATASET = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Auto ML</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ANALYTICS__AUTO_ML = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Sequential</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ANALYTICS__SEQUENTIAL = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Timestamps</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ANALYTICS__TIMESTAMPS = NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Labels</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ANALYTICS__LABELS = NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ANALYTICS__FEATURES = NAMED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Preprocess feature scaling</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ANALYTICS__PREPROCESS_FEATURE_SCALING = NAMED_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Model Algorithm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ANALYTICS__MODEL_ALGORITHM = NAMED_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Training Results</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ANALYTICS__TRAINING_RESULTS = NAMED_ELEMENT_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Prediction Results</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ANALYTICS__PREDICTION_RESULTS = NAMED_ELEMENT_FEATURE_COUNT + 10;

  /**
   * The number of structural features of the '<em>Data Analytics</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ANALYTICS_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 11;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.DataAnalyticsModelAlgorithmImpl <em>Data Analytics Model Algorithm</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.DataAnalyticsModelAlgorithmImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getDataAnalyticsModelAlgorithm()
   * @generated
   */
  int DATA_ANALYTICS_MODEL_ALGORITHM = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ANALYTICS_MODEL_ALGORITHM__NAME = 0;

  /**
   * The number of structural features of the '<em>Data Analytics Model Algorithm</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ANALYTICS_MODEL_ALGORITHM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.ML2_ModelAlgorithmImpl <em>ML2 Model Algorithm</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.ML2_ModelAlgorithmImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getML2_ModelAlgorithm()
   * @generated
   */
  int ML2_MODEL_ALGORITHM = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ML2_MODEL_ALGORITHM__NAME = DATA_ANALYTICS_MODEL_ALGORITHM__NAME;

  /**
   * The number of structural features of the '<em>ML2 Model Algorithm</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ML2_MODEL_ALGORITHM_FEATURE_COUNT = DATA_ANALYTICS_MODEL_ALGORITHM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.Pretrained_ML_ModelImpl <em>Pretrained ML Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.Pretrained_ML_ModelImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getPretrained_ML_Model()
   * @generated
   */
  int PRETRAINED_ML_MODEL = 36;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRETRAINED_ML_MODEL__NAME = DATA_ANALYTICS_MODEL_ALGORITHM__NAME;

  /**
   * The feature id for the '<em><b>Pretrained path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRETRAINED_ML_MODEL__PRETRAINED_PATH = DATA_ANALYTICS_MODEL_ALGORITHM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pretrained ML Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRETRAINED_ML_MODEL_FEATURE_COUNT = DATA_ANALYTICS_MODEL_ALGORITHM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.PMML_ModelAlgorithmImpl <em>PMML Model Algorithm</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.PMML_ModelAlgorithmImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getPMML_ModelAlgorithm()
   * @generated
   */
  int PMML_MODEL_ALGORITHM = 37;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PMML_MODEL_ALGORITHM__NAME = DATA_ANALYTICS_MODEL_ALGORITHM__NAME;

  /**
   * The feature id for the '<em><b>Pmml path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PMML_MODEL_ALGORITHM__PMML_PATH = DATA_ANALYTICS_MODEL_ALGORITHM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>PMML Model Algorithm</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PMML_MODEL_ALGORITHM_FEATURE_COUNT = DATA_ANALYTICS_MODEL_ALGORITHM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.PFA_ModelAlgorithmImpl <em>PFA Model Algorithm</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.PFA_ModelAlgorithmImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getPFA_ModelAlgorithm()
   * @generated
   */
  int PFA_MODEL_ALGORITHM = 38;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PFA_MODEL_ALGORITHM__NAME = DATA_ANALYTICS_MODEL_ALGORITHM__NAME;

  /**
   * The feature id for the '<em><b>Pfa path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PFA_MODEL_ALGORITHM__PFA_PATH = DATA_ANALYTICS_MODEL_ALGORITHM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>PFA Model Algorithm</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PFA_MODEL_ALGORITHM_FEATURE_COUNT = DATA_ANALYTICS_MODEL_ALGORITHM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.LinearRegressionImpl <em>Linear Regression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.LinearRegressionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getLinearRegression()
   * @generated
   */
  int LINEAR_REGRESSION = 39;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_REGRESSION__NAME = ML2_MODEL_ALGORITHM__NAME;

  /**
   * The feature id for the '<em><b>Fit intercept</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_REGRESSION__FIT_INTERCEPT = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Normalize</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_REGRESSION__NORMALIZE = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Copy X</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_REGRESSION__COPY_X = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Njobs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_REGRESSION__NJOBS = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Positive</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_REGRESSION__POSITIVE = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Linear Regression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_REGRESSION_FEATURE_COUNT = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.LinearClassifierLogisticRegressionImpl <em>Linear Classifier Logistic Regression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.LinearClassifierLogisticRegressionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getLinearClassifierLogisticRegression()
   * @generated
   */
  int LINEAR_CLASSIFIER_LOGISTIC_REGRESSION = 40;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__NAME = ML2_MODEL_ALGORITHM__NAME;

  /**
   * The feature id for the '<em><b>Penalty</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__PENALTY = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__DUAL = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__TOL = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__C = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Fit intercept</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__FIT_INTERCEPT = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Intercept scaling</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__INTERCEPT_SCALING = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Class weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__CLASS_WEIGHT = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Random state</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__RANDOM_STATE = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Optimizer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__OPTIMIZER = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Max iter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__MAX_ITER = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Multi class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__MULTI_CLASS = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Verbose</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__VERBOSE = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Warm start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__WARM_START = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Njobs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__NJOBS = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>L1 ratio</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__L1_RATIO = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 14;

  /**
   * The number of structural features of the '<em>Linear Classifier Logistic Regression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_CLASSIFIER_LOGISTIC_REGRESSION_FEATURE_COUNT = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 15;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.NaiveBayesGaussianImpl <em>Naive Bayes Gaussian</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.NaiveBayesGaussianImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getNaiveBayesGaussian()
   * @generated
   */
  int NAIVE_BAYES_GAUSSIAN = 41;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAIVE_BAYES_GAUSSIAN__NAME = ML2_MODEL_ALGORITHM__NAME;

  /**
   * The feature id for the '<em><b>Priors</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAIVE_BAYES_GAUSSIAN__PRIORS = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Var smoothing</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAIVE_BAYES_GAUSSIAN__VAR_SMOOTHING = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Naive Bayes Gaussian</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAIVE_BAYES_GAUSSIAN_FEATURE_COUNT = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.NaiveBayesMultinomialImpl <em>Naive Bayes Multinomial</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.NaiveBayesMultinomialImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getNaiveBayesMultinomial()
   * @generated
   */
  int NAIVE_BAYES_MULTINOMIAL = 42;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAIVE_BAYES_MULTINOMIAL__NAME = ML2_MODEL_ALGORITHM__NAME;

  /**
   * The feature id for the '<em><b>Alpha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAIVE_BAYES_MULTINOMIAL__ALPHA = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fit prior</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAIVE_BAYES_MULTINOMIAL__FIT_PRIOR = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Class prior</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAIVE_BAYES_MULTINOMIAL__CLASS_PRIOR = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Naive Bayes Multinomial</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAIVE_BAYES_MULTINOMIAL_FEATURE_COUNT = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.NaiveBayesComplementImpl <em>Naive Bayes Complement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.NaiveBayesComplementImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getNaiveBayesComplement()
   * @generated
   */
  int NAIVE_BAYES_COMPLEMENT = 43;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAIVE_BAYES_COMPLEMENT__NAME = ML2_MODEL_ALGORITHM__NAME;

  /**
   * The feature id for the '<em><b>Alpha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAIVE_BAYES_COMPLEMENT__ALPHA = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fit prior</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAIVE_BAYES_COMPLEMENT__FIT_PRIOR = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Class prior</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAIVE_BAYES_COMPLEMENT__CLASS_PRIOR = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Norm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAIVE_BAYES_COMPLEMENT__NORM = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Naive Bayes Complement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAIVE_BAYES_COMPLEMENT_FEATURE_COUNT = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.NaiveBayesBernoulliImpl <em>Naive Bayes Bernoulli</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.NaiveBayesBernoulliImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getNaiveBayesBernoulli()
   * @generated
   */
  int NAIVE_BAYES_BERNOULLI = 44;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAIVE_BAYES_BERNOULLI__NAME = ML2_MODEL_ALGORITHM__NAME;

  /**
   * The feature id for the '<em><b>Alpha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAIVE_BAYES_BERNOULLI__ALPHA = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Binarize</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAIVE_BAYES_BERNOULLI__BINARIZE = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Fit prior</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAIVE_BAYES_BERNOULLI__FIT_PRIOR = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Class prior</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAIVE_BAYES_BERNOULLI__CLASS_PRIOR = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Naive Bayes Bernoulli</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAIVE_BAYES_BERNOULLI_FEATURE_COUNT = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.NaiveBayesCategoricalImpl <em>Naive Bayes Categorical</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.NaiveBayesCategoricalImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getNaiveBayesCategorical()
   * @generated
   */
  int NAIVE_BAYES_CATEGORICAL = 45;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAIVE_BAYES_CATEGORICAL__NAME = ML2_MODEL_ALGORITHM__NAME;

  /**
   * The feature id for the '<em><b>Alpha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAIVE_BAYES_CATEGORICAL__ALPHA = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fit prior</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAIVE_BAYES_CATEGORICAL__FIT_PRIOR = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Class prior</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAIVE_BAYES_CATEGORICAL__CLASS_PRIOR = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Min categories</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAIVE_BAYES_CATEGORICAL__MIN_CATEGORIES = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Naive Bayes Categorical</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAIVE_BAYES_CATEGORICAL_FEATURE_COUNT = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.DecisionTreeRegressorImpl <em>Decision Tree Regressor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.DecisionTreeRegressorImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getDecisionTreeRegressor()
   * @generated
   */
  int DECISION_TREE_REGRESSOR = 46;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_REGRESSOR__NAME = ML2_MODEL_ALGORITHM__NAME;

  /**
   * The feature id for the '<em><b>Decision Tree Regressor Criterion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_REGRESSOR__DECISION_TREE_REGRESSOR_CRITERION = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Decision Tree Splitter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_REGRESSOR__DECISION_TREE_SPLITTER = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Max depth</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_REGRESSOR__MAX_DEPTH = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Min samples split</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_REGRESSOR__MIN_SAMPLES_SPLIT = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Min samples leaf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_REGRESSOR__MIN_SAMPLES_LEAF = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Min weight fraction leaf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_REGRESSOR__MIN_WEIGHT_FRACTION_LEAF = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Max features numeric</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_REGRESSOR__MAX_FEATURES_NUMERIC = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Max features enum</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_REGRESSOR__MAX_FEATURES_ENUM = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Random state</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_REGRESSOR__RANDOM_STATE = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Max leaf nodes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_REGRESSOR__MAX_LEAF_NODES = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Min impurity decrease</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_REGRESSOR__MIN_IMPURITY_DECREASE = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Min impurity split</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_REGRESSOR__MIN_IMPURITY_SPLIT = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Ccp alpha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_REGRESSOR__CCP_ALPHA = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 12;

  /**
   * The number of structural features of the '<em>Decision Tree Regressor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_REGRESSOR_FEATURE_COUNT = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 13;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.DecisionTreeClassifierImpl <em>Decision Tree Classifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.DecisionTreeClassifierImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getDecisionTreeClassifier()
   * @generated
   */
  int DECISION_TREE_CLASSIFIER = 47;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_CLASSIFIER__NAME = ML2_MODEL_ALGORITHM__NAME;

  /**
   * The feature id for the '<em><b>Decision Tree Classifier Criterion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_CLASSIFIER__DECISION_TREE_CLASSIFIER_CRITERION = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Decision Tree Splitter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_CLASSIFIER__DECISION_TREE_SPLITTER = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Max depth</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_CLASSIFIER__MAX_DEPTH = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Min samples split</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_CLASSIFIER__MIN_SAMPLES_SPLIT = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Min samples leaf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_CLASSIFIER__MIN_SAMPLES_LEAF = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Min weight fraction leaf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Max features numeric</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_CLASSIFIER__MAX_FEATURES_NUMERIC = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Max features enum</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_CLASSIFIER__MAX_FEATURES_ENUM = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Random state</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_CLASSIFIER__RANDOM_STATE = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Max leaf nodes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_CLASSIFIER__MAX_LEAF_NODES = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Min impurity decrease</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_CLASSIFIER__MIN_IMPURITY_DECREASE = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Min impurity split</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_CLASSIFIER__MIN_IMPURITY_SPLIT = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Class weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_CLASSIFIER__CLASS_WEIGHT = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Ccp alpha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_CLASSIFIER__CCP_ALPHA = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 13;

  /**
   * The number of structural features of the '<em>Decision Tree Classifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECISION_TREE_CLASSIFIER_FEATURE_COUNT = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 14;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.RandomForestRegressorImpl <em>Random Forest Regressor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.RandomForestRegressorImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getRandomForestRegressor()
   * @generated
   */
  int RANDOM_FOREST_REGRESSOR = 48;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_REGRESSOR__NAME = ML2_MODEL_ALGORITHM__NAME;

  /**
   * The feature id for the '<em><b>Nestimators</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_REGRESSOR__NESTIMATORS = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Random Forest Regressor Criterion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_REGRESSOR__RANDOM_FOREST_REGRESSOR_CRITERION = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Max depth</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_REGRESSOR__MAX_DEPTH = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Min samples split</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_REGRESSOR__MIN_SAMPLES_SPLIT = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Min samples leaf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_REGRESSOR__MIN_SAMPLES_LEAF = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Min weight fraction leaf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_REGRESSOR__MIN_WEIGHT_FRACTION_LEAF = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Max features numeric</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_REGRESSOR__MAX_FEATURES_NUMERIC = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Max features enum</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_REGRESSOR__MAX_FEATURES_ENUM = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Max leaf nodes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_REGRESSOR__MAX_LEAF_NODES = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Min impurity decrease</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_REGRESSOR__MIN_IMPURITY_DECREASE = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Min impurity split</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_REGRESSOR__MIN_IMPURITY_SPLIT = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Bootstrap</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_REGRESSOR__BOOTSTRAP = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Oob score</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_REGRESSOR__OOB_SCORE = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Njobs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_REGRESSOR__NJOBS = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Random state</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_REGRESSOR__RANDOM_STATE = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Verbose</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_REGRESSOR__VERBOSE = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Warm start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_REGRESSOR__WARM_START = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Ccp alpha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_REGRESSOR__CCP_ALPHA = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Max samples</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_REGRESSOR__MAX_SAMPLES = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 18;

  /**
   * The number of structural features of the '<em>Random Forest Regressor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_REGRESSOR_FEATURE_COUNT = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 19;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.RandomForestClassifierImpl <em>Random Forest Classifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.RandomForestClassifierImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getRandomForestClassifier()
   * @generated
   */
  int RANDOM_FOREST_CLASSIFIER = 49;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_CLASSIFIER__NAME = ML2_MODEL_ALGORITHM__NAME;

  /**
   * The feature id for the '<em><b>Nestimators</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_CLASSIFIER__NESTIMATORS = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Random Forest Classifier Criterion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_CLASSIFIER__RANDOM_FOREST_CLASSIFIER_CRITERION = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Max depth</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_CLASSIFIER__MAX_DEPTH = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Min samples split</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_SPLIT = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Min samples leaf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_LEAF = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Min weight fraction leaf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Max features numeric</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_CLASSIFIER__MAX_FEATURES_NUMERIC = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Max features enum</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_CLASSIFIER__MAX_FEATURES_ENUM = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Max leaf nodes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_CLASSIFIER__MAX_LEAF_NODES = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Min impurity decrease</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_CLASSIFIER__MIN_IMPURITY_DECREASE = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Min impurity split</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_CLASSIFIER__MIN_IMPURITY_SPLIT = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Bootstrap</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_CLASSIFIER__BOOTSTRAP = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Oob score</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_CLASSIFIER__OOB_SCORE = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Njobs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_CLASSIFIER__NJOBS = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Random state</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_CLASSIFIER__RANDOM_STATE = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Verbose</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_CLASSIFIER__VERBOSE = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Warm start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_CLASSIFIER__WARM_START = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Class weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_CLASSIFIER__CLASS_WEIGHT = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Ccp alpha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_CLASSIFIER__CCP_ALPHA = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 18;

  /**
   * The feature id for the '<em><b>Max samples</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_CLASSIFIER__MAX_SAMPLES = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 19;

  /**
   * The number of structural features of the '<em>Random Forest Classifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANDOM_FOREST_CLASSIFIER_FEATURE_COUNT = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 20;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl <em>NN Multilayer Perceptron</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getNN_MultilayerPerceptron()
   * @generated
   */
  int NN_MULTILAYER_PERCEPTRON = 50;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_MULTILAYER_PERCEPTRON__NAME = ML2_MODEL_ALGORITHM__NAME;

  /**
   * The feature id for the '<em><b>Hidden layer sizes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_MULTILAYER_PERCEPTRON__HIDDEN_LAYER_SIZES = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Hidden layers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_MULTILAYER_PERCEPTRON__HIDDEN_LAYERS = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Activation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_MULTILAYER_PERCEPTRON__ACTIVATION = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Optimizer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_MULTILAYER_PERCEPTRON__OPTIMIZER = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Alpha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_MULTILAYER_PERCEPTRON__ALPHA = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Batch size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_MULTILAYER_PERCEPTRON__BATCH_SIZE = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Learning rate mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_MULTILAYER_PERCEPTRON__LEARNING_RATE_MODE = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Learning rate init</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_MULTILAYER_PERCEPTRON__LEARNING_RATE_INIT = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Power t</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_MULTILAYER_PERCEPTRON__POWER_T = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Max iter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_MULTILAYER_PERCEPTRON__MAX_ITER = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Shuffle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_MULTILAYER_PERCEPTRON__SHUFFLE = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Random state</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_MULTILAYER_PERCEPTRON__RANDOM_STATE = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Tol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_MULTILAYER_PERCEPTRON__TOL = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Verbose</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_MULTILAYER_PERCEPTRON__VERBOSE = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Warm start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_MULTILAYER_PERCEPTRON__WARM_START = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Momentum</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_MULTILAYER_PERCEPTRON__MOMENTUM = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Nesterovs momentum</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_MULTILAYER_PERCEPTRON__NESTEROVS_MOMENTUM = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Early stopping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_MULTILAYER_PERCEPTRON__EARLY_STOPPING = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Validation fraction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_MULTILAYER_PERCEPTRON__VALIDATION_FRACTION = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 18;

  /**
   * The feature id for the '<em><b>Beta 1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_MULTILAYER_PERCEPTRON__BETA_1 = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 19;

  /**
   * The feature id for the '<em><b>Beta 2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_MULTILAYER_PERCEPTRON__BETA_2 = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 20;

  /**
   * The feature id for the '<em><b>Epsilon</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_MULTILAYER_PERCEPTRON__EPSILON = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 21;

  /**
   * The feature id for the '<em><b>Niter no change</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_MULTILAYER_PERCEPTRON__NITER_NO_CHANGE = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 22;

  /**
   * The feature id for the '<em><b>Max fun</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_MULTILAYER_PERCEPTRON__MAX_FUN = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 23;

  /**
   * The feature id for the '<em><b>Loss</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_MULTILAYER_PERCEPTRON__LOSS = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 24;

  /**
   * The feature id for the '<em><b>Epochs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_MULTILAYER_PERCEPTRON__EPOCHS = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 25;

  /**
   * The number of structural features of the '<em>NN Multilayer Perceptron</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NN_MULTILAYER_PERCEPTRON_FEATURE_COUNT = ML2_MODEL_ALGORITHM_FEATURE_COUNT + 26;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.EventImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 51;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = NAMED_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.ReceiveMessageImpl <em>Receive Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.ReceiveMessageImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getReceiveMessage()
   * @generated
   */
  int RECEIVE_MESSAGE = 52;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECEIVE_MESSAGE__NAME = EVENT__NAME;

  /**
   * The feature id for the '<em><b>Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECEIVE_MESSAGE__PORT = EVENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Message</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECEIVE_MESSAGE__MESSAGE = EVENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Receive Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECEIVE_MESSAGE_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.ActionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getAction()
   * @generated
   */
  int ACTION = 53;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.ActionBlockImpl <em>Action Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.ActionBlockImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getActionBlock()
   * @generated
   */
  int ACTION_BLOCK = 54;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_BLOCK__ACTIONS = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Action Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_BLOCK_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.ExternStatementImpl <em>Extern Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.ExternStatementImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getExternStatement()
   * @generated
   */
  int EXTERN_STATEMENT = 55;

  /**
   * The feature id for the '<em><b>Statement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_STATEMENT__STATEMENT = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Segments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_STATEMENT__SEGMENTS = ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Extern Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_STATEMENT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.LocalVariableImpl <em>Local Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.LocalVariableImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getLocalVariable()
   * @generated
   */
  int LOCAL_VARIABLE = 56;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE__NAME = VARIABLE__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE__ANNOTATIONS = VARIABLE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE__TYPE_REF = VARIABLE__TYPE_REF;

  /**
   * The feature id for the '<em><b>Readonly</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE__READONLY = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE__INIT = VARIABLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Local Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.SendActionImpl <em>Send Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.SendActionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getSendAction()
   * @generated
   */
  int SEND_ACTION = 57;

  /**
   * The feature id for the '<em><b>Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEND_ACTION__PORT = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Message</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEND_ACTION__MESSAGE = ACTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEND_ACTION__PARAMETERS = ACTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Send Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEND_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.VariableAssignmentImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getVariableAssignment()
   * @generated
   */
  int VARIABLE_ASSIGNMENT = 58;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGNMENT__PROPERTY = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGNMENT__INDEX = ACTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGNMENT__EXPRESSION = ACTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Variable Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGNMENT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.IncrementImpl <em>Increment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.IncrementImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getIncrement()
   * @generated
   */
  int INCREMENT = 59;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCREMENT__VAR = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Increment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCREMENT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.DecrementImpl <em>Decrement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.DecrementImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getDecrement()
   * @generated
   */
  int DECREMENT = 60;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECREMENT__VAR = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Decrement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECREMENT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.ForActionImpl <em>For Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.ForActionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getForAction()
   * @generated
   */
  int FOR_ACTION = 61;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ACTION__VARIABLE = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ACTION__INDEX = ACTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ACTION__ARRAY = ACTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ACTION__ACTION = ACTION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>For Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.LoopActionImpl <em>Loop Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.LoopActionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getLoopAction()
   * @generated
   */
  int LOOP_ACTION = 62;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_ACTION__CONDITION = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_ACTION__ACTION = ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Loop Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.ConditionalActionImpl <em>Conditional Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.ConditionalActionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getConditionalAction()
   * @generated
   */
  int CONDITIONAL_ACTION = 63;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_ACTION__CONDITION = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_ACTION__ACTION = ACTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_ACTION__ELSE_ACTION = ACTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Conditional Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.ReturnActionImpl <em>Return Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.ReturnActionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getReturnAction()
   * @generated
   */
  int RETURN_ACTION = 64;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_ACTION__EXP = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Return Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.PrintActionImpl <em>Print Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.PrintActionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getPrintAction()
   * @generated
   */
  int PRINT_ACTION = 65;

  /**
   * The feature id for the '<em><b>Line</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT_ACTION__LINE = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Msg</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT_ACTION__MSG = ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Print Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.ErrorActionImpl <em>Error Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.ErrorActionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getErrorAction()
   * @generated
   */
  int ERROR_ACTION = 66;

  /**
   * The feature id for the '<em><b>Line</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_ACTION__LINE = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Msg</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_ACTION__MSG = ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Error Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.StartSessionImpl <em>Start Session</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.StartSessionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getStartSession()
   * @generated
   */
  int START_SESSION = 67;

  /**
   * The feature id for the '<em><b>Session</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_SESSION__SESSION = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Start Session</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_SESSION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.FunctionCallStatementImpl <em>Function Call Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.FunctionCallStatementImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getFunctionCallStatement()
   * @generated
   */
  int FUNCTION_CALL_STATEMENT = 68;

  /**
   * The feature id for the '<em><b>Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_STATEMENT__FUNCTION = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_STATEMENT__PARAMETERS = ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Call Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_STATEMENT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.DASaveActionImpl <em>DA Save Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.DASaveActionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getDASaveAction()
   * @generated
   */
  int DA_SAVE_ACTION = 69;

  /**
   * The feature id for the '<em><b>Data Analytics</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DA_SAVE_ACTION__DATA_ANALYTICS = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>DA Save Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DA_SAVE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.DAPreprocessActionImpl <em>DA Preprocess Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.DAPreprocessActionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getDAPreprocessAction()
   * @generated
   */
  int DA_PREPROCESS_ACTION = 70;

  /**
   * The feature id for the '<em><b>Data Analytics</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DA_PREPROCESS_ACTION__DATA_ANALYTICS = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>DA Preprocess Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DA_PREPROCESS_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.DATrainActionImpl <em>DA Train Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.DATrainActionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getDATrainAction()
   * @generated
   */
  int DA_TRAIN_ACTION = 71;

  /**
   * The feature id for the '<em><b>Data Analytics</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DA_TRAIN_ACTION__DATA_ANALYTICS = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>DA Train Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DA_TRAIN_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.DAPredictActionImpl <em>DA Predict Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.DAPredictActionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getDAPredictAction()
   * @generated
   */
  int DA_PREDICT_ACTION = 72;

  /**
   * The feature id for the '<em><b>Data Analytics</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DA_PREDICT_ACTION__DATA_ANALYTICS = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DA_PREDICT_ACTION__FEATURES = ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>DA Predict Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DA_PREDICT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.ExpressionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 73;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.ExternExpressionImpl <em>Extern Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.ExternExpressionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getExternExpression()
   * @generated
   */
  int EXTERN_EXPRESSION = 74;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Segments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_EXPRESSION__SEGMENTS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Extern Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.LiteralImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 75;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.ArrayInitImpl <em>Array Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.ArrayInitImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getArrayInit()
   * @generated
   */
  int ARRAY_INIT = 76;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INIT__VALUES = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INIT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.EnumLiteralRefImpl <em>Enum Literal Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.EnumLiteralRefImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getEnumLiteralRef()
   * @generated
   */
  int ENUM_LITERAL_REF = 77;

  /**
   * The feature id for the '<em><b>Enum</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LITERAL_REF__ENUM = LITERAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Literal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LITERAL_REF__LITERAL = LITERAL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enum Literal Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LITERAL_REF_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.ByteLiteralImpl <em>Byte Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.ByteLiteralImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getByteLiteral()
   * @generated
   */
  int BYTE_LITERAL = 78;

  /**
   * The feature id for the '<em><b>Byte Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYTE_LITERAL__BYTE_VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Byte Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYTE_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.CharLiteralImpl <em>Char Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.CharLiteralImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getCharLiteral()
   * @generated
   */
  int CHAR_LITERAL = 79;

  /**
   * The feature id for the '<em><b>Char Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_LITERAL__CHAR_VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Char Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.IntegerLiteralImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getIntegerLiteral()
   * @generated
   */
  int INTEGER_LITERAL = 80;

  /**
   * The feature id for the '<em><b>Int Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__INT_VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.BooleanLiteralImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 81;

  /**
   * The feature id for the '<em><b>Bool Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__BOOL_VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.StringLiteralImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 82;

  /**
   * The feature id for the '<em><b>String Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__STRING_VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.DoubleLiteralImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getDoubleLiteral()
   * @generated
   */
  int DOUBLE_LITERAL = 83;

  /**
   * The feature id for the '<em><b>Double Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_LITERAL__DOUBLE_VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Double Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.PropertyReferenceImpl <em>Property Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.PropertyReferenceImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getPropertyReference()
   * @generated
   */
  int PROPERTY_REFERENCE = 84;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_REFERENCE__PROPERTY = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Property Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.EventReferenceImpl <em>Event Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.EventReferenceImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getEventReference()
   * @generated
   */
  int EVENT_REFERENCE = 85;

  /**
   * The feature id for the '<em><b>Receive Msg</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_REFERENCE__RECEIVE_MSG = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_REFERENCE__PARAMETER = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Event Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.FunctionCallExpressionImpl <em>Function Call Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.FunctionCallExpressionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getFunctionCallExpression()
   * @generated
   */
  int FUNCTION_CALL_EXPRESSION = 86;

  /**
   * The feature id for the '<em><b>Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_EXPRESSION__FUNCTION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_EXPRESSION__PARAMETERS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Call Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.ConfigurationImpl <em>Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.ConfigurationImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getConfiguration()
   * @generated
   */
  int CONFIGURATION = 87;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__INSTANCES = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__CONNECTORS = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Propassigns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__PROPASSIGNS = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.InstanceImpl <em>Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.InstanceImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getInstance()
   * @generated
   */
  int INSTANCE = 88;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.ConfigPropertyAssignImpl <em>Config Property Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.ConfigPropertyAssignImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getConfigPropertyAssign()
   * @generated
   */
  int CONFIG_PROPERTY_ASSIGN = 89;

  /**
   * The feature id for the '<em><b>Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_PROPERTY_ASSIGN__INSTANCE = 0;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_PROPERTY_ASSIGN__PROPERTY = 1;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_PROPERTY_ASSIGN__INDEX = 2;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_PROPERTY_ASSIGN__INIT = 3;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_PROPERTY_ASSIGN__ANNOTATIONS = 4;

  /**
   * The number of structural features of the '<em>Config Property Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_PROPERTY_ASSIGN_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.AbstractConnectorImpl <em>Abstract Connector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.AbstractConnectorImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getAbstractConnector()
   * @generated
   */
  int ABSTRACT_CONNECTOR = 90;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_CONNECTOR__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_CONNECTOR__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Abstract Connector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_CONNECTOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.ConnectorImpl <em>Connector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.ConnectorImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getConnector()
   * @generated
   */
  int CONNECTOR = 91;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__NAME = ABSTRACT_CONNECTOR__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__ANNOTATIONS = ABSTRACT_CONNECTOR__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Cli</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__CLI = ABSTRACT_CONNECTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Required</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__REQUIRED = ABSTRACT_CONNECTOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Srv</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__SRV = ABSTRACT_CONNECTOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Provided</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__PROVIDED = ABSTRACT_CONNECTOR_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Connector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_FEATURE_COUNT = ABSTRACT_CONNECTOR_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.ExternalConnectorImpl <em>External Connector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.ExternalConnectorImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getExternalConnector()
   * @generated
   */
  int EXTERNAL_CONNECTOR = 92;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CONNECTOR__NAME = ABSTRACT_CONNECTOR__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CONNECTOR__ANNOTATIONS = ABSTRACT_CONNECTOR__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Inst</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CONNECTOR__INST = ABSTRACT_CONNECTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CONNECTOR__PORT = ABSTRACT_CONNECTOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Protocol</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CONNECTOR__PROTOCOL = ABSTRACT_CONNECTOR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>External Connector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CONNECTOR_FEATURE_COUNT = ABSTRACT_CONNECTOR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.OrExpressionImpl <em>Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.OrExpressionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getOrExpression()
   * @generated
   */
  int OR_EXPRESSION = 93;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.AndExpressionImpl <em>And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.AndExpressionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getAndExpression()
   * @generated
   */
  int AND_EXPRESSION = 94;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.EqualsExpressionImpl <em>Equals Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.EqualsExpressionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getEqualsExpression()
   * @generated
   */
  int EQUALS_EXPRESSION = 95;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Equals Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.NotEqualsExpressionImpl <em>Not Equals Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.NotEqualsExpressionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getNotEqualsExpression()
   * @generated
   */
  int NOT_EQUALS_EXPRESSION = 96;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EQUALS_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EQUALS_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Not Equals Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EQUALS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.GreaterExpressionImpl <em>Greater Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.GreaterExpressionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getGreaterExpression()
   * @generated
   */
  int GREATER_EXPRESSION = 97;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Greater Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.LowerExpressionImpl <em>Lower Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.LowerExpressionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getLowerExpression()
   * @generated
   */
  int LOWER_EXPRESSION = 98;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOWER_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOWER_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Lower Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOWER_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.GreaterOrEqualExpressionImpl <em>Greater Or Equal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.GreaterOrEqualExpressionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getGreaterOrEqualExpression()
   * @generated
   */
  int GREATER_OR_EQUAL_EXPRESSION = 99;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_OR_EQUAL_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_OR_EQUAL_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Greater Or Equal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_OR_EQUAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.LowerOrEqualExpressionImpl <em>Lower Or Equal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.LowerOrEqualExpressionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getLowerOrEqualExpression()
   * @generated
   */
  int LOWER_OR_EQUAL_EXPRESSION = 100;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOWER_OR_EQUAL_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOWER_OR_EQUAL_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Lower Or Equal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOWER_OR_EQUAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.PlusExpressionImpl <em>Plus Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.PlusExpressionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getPlusExpression()
   * @generated
   */
  int PLUS_EXPRESSION = 101;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plus Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.MinusExpressionImpl <em>Minus Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.MinusExpressionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getMinusExpression()
   * @generated
   */
  int MINUS_EXPRESSION = 102;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Minus Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.TimesExpressionImpl <em>Times Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.TimesExpressionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getTimesExpression()
   * @generated
   */
  int TIMES_EXPRESSION = 103;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMES_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMES_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Times Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMES_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.DivExpressionImpl <em>Div Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.DivExpressionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getDivExpression()
   * @generated
   */
  int DIV_EXPRESSION = 104;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Div Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.ModExpressionImpl <em>Mod Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.ModExpressionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getModExpression()
   * @generated
   */
  int MOD_EXPRESSION = 105;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Mod Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.CastExpressionImpl <em>Cast Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.CastExpressionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getCastExpression()
   * @generated
   */
  int CAST_EXPRESSION = 106;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__TERM = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__TYPE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Is Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__IS_ARRAY = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Cast Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.ExpressionGroupImpl <em>Expression Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.ExpressionGroupImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getExpressionGroup()
   * @generated
   */
  int EXPRESSION_GROUP = 107;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_GROUP__TERM = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_GROUP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.NotExpressionImpl <em>Not Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.NotExpressionImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getNotExpression()
   * @generated
   */
  int NOT_EXPRESSION = 108;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EXPRESSION__TERM = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Not Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.UnaryMinusImpl <em>Unary Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.UnaryMinusImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getUnaryMinus()
   * @generated
   */
  int UNARY_MINUS = 109;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_MINUS__TERM = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Unary Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.impl.ArrayIndexImpl <em>Array Index</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.impl.ArrayIndexImpl
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getArrayIndex()
   * @generated
   */
  int ARRAY_INDEX = 110;

  /**
   * The feature id for the '<em><b>Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INDEX__ARRAY = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INDEX__INDEX = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Array Index</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INDEX_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.AutoML <em>Auto ML</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.AutoML
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getAutoML()
   * @generated
   */
  int AUTO_ML = 111;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.Sequential <em>Sequential</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.Sequential
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getSequential()
   * @generated
   */
  int SEQUENTIAL = 112;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.Timestamps <em>Timestamps</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.Timestamps
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getTimestamps()
   * @generated
   */
  int TIMESTAMPS = 113;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.Labels <em>Labels</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.Labels
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getLabels()
   * @generated
   */
  int LABELS = 114;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.Preprocess_feature_scaling <em>Preprocess feature scaling</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.Preprocess_feature_scaling
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getPreprocess_feature_scaling()
   * @generated
   */
  int PREPROCESS_FEATURE_SCALING = 115;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.Penalty <em>Penalty</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.Penalty
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getPenalty()
   * @generated
   */
  int PENALTY = 116;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.Optimizer <em>Optimizer</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.Optimizer
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getOptimizer()
   * @generated
   */
  int OPTIMIZER = 117;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.Multi_class <em>Multi class</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.Multi_class
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getMulti_class()
   * @generated
   */
  int MULTI_CLASS = 118;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.DecisionTreeRegressorCriterion <em>Decision Tree Regressor Criterion</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.DecisionTreeRegressorCriterion
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getDecisionTreeRegressorCriterion()
   * @generated
   */
  int DECISION_TREE_REGRESSOR_CRITERION = 119;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.DecisionTreeClassifierCriterion <em>Decision Tree Classifier Criterion</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.DecisionTreeClassifierCriterion
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getDecisionTreeClassifierCriterion()
   * @generated
   */
  int DECISION_TREE_CLASSIFIER_CRITERION = 120;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.DecisionTreeSplitter <em>Decision Tree Splitter</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.DecisionTreeSplitter
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getDecisionTreeSplitter()
   * @generated
   */
  int DECISION_TREE_SPLITTER = 121;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.Max_features_enum <em>Max features enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.Max_features_enum
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getMax_features_enum()
   * @generated
   */
  int MAX_FEATURES_ENUM = 122;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.RandomForestRegressorCriterion <em>Random Forest Regressor Criterion</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.RandomForestRegressorCriterion
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getRandomForestRegressorCriterion()
   * @generated
   */
  int RANDOM_FOREST_REGRESSOR_CRITERION = 123;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.RandomForestClassifierCriterion <em>Random Forest Classifier Criterion</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.RandomForestClassifierCriterion
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getRandomForestClassifierCriterion()
   * @generated
   */
  int RANDOM_FOREST_CLASSIFIER_CRITERION = 124;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.Activation <em>Activation</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.Activation
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getActivation()
   * @generated
   */
  int ACTIVATION = 125;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.Learning_rate_mode <em>Learning rate mode</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.Learning_rate_mode
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getLearning_rate_mode()
   * @generated
   */
  int LEARNING_RATE_MODE = 126;

  /**
   * The meta object id for the '{@link org.thingml.xtext.thingML.Loss <em>Loss</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.thingml.xtext.thingML.Loss
   * @see org.thingml.xtext.thingML.impl.ThingMLPackageImpl#getLoss()
   * @generated
   */
  int LOSS = 127;


  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.ThingMLModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.thingml.xtext.thingML.ThingMLModel
   * @generated
   */
  EClass getThingMLModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.ThingMLModel#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.thingml.xtext.thingML.ThingMLModel#getImports()
   * @see #getThingMLModel()
   * @generated
   */
  EReference getThingMLModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.ThingMLModel#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.thingml.xtext.thingML.ThingMLModel#getTypes()
   * @see #getThingMLModel()
   * @generated
   */
  EReference getThingMLModel_Types();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.ThingMLModel#getProtocols <em>Protocols</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Protocols</em>'.
   * @see org.thingml.xtext.thingML.ThingMLModel#getProtocols()
   * @see #getThingMLModel()
   * @generated
   */
  EReference getThingMLModel_Protocols();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.ThingMLModel#getConfigs <em>Configs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Configs</em>'.
   * @see org.thingml.xtext.thingML.ThingMLModel#getConfigs()
   * @see #getThingMLModel()
   * @generated
   */
  EReference getThingMLModel_Configs();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.thingml.xtext.thingML.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see org.thingml.xtext.thingML.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportURI();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.Import#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>From</em>'.
   * @see org.thingml.xtext.thingML.Import#getFrom()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_From();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.PlatformAnnotation <em>Platform Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Platform Annotation</em>'.
   * @see org.thingml.xtext.thingML.PlatformAnnotation
   * @generated
   */
  EClass getPlatformAnnotation();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.PlatformAnnotation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.thingml.xtext.thingML.PlatformAnnotation#getName()
   * @see #getPlatformAnnotation()
   * @generated
   */
  EAttribute getPlatformAnnotation_Name();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.PlatformAnnotation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.thingml.xtext.thingML.PlatformAnnotation#getValue()
   * @see #getPlatformAnnotation()
   * @generated
   */
  EAttribute getPlatformAnnotation_Value();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Element</em>'.
   * @see org.thingml.xtext.thingML.NamedElement
   * @generated
   */
  EClass getNamedElement();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.NamedElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.thingml.xtext.thingML.NamedElement#getName()
   * @see #getNamedElement()
   * @generated
   */
  EAttribute getNamedElement_Name();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.AnnotatedElement <em>Annotated Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotated Element</em>'.
   * @see org.thingml.xtext.thingML.AnnotatedElement
   * @generated
   */
  EClass getAnnotatedElement();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.AnnotatedElement#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see org.thingml.xtext.thingML.AnnotatedElement#getAnnotations()
   * @see #getAnnotatedElement()
   * @generated
   */
  EReference getAnnotatedElement_Annotations();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see org.thingml.xtext.thingML.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.Variable#getTypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Ref</em>'.
   * @see org.thingml.xtext.thingML.Variable#getTypeRef()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_TypeRef();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.TypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Ref</em>'.
   * @see org.thingml.xtext.thingML.TypeRef
   * @generated
   */
  EClass getTypeRef();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.TypeRef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.thingml.xtext.thingML.TypeRef#getType()
   * @see #getTypeRef()
   * @generated
   */
  EReference getTypeRef_Type();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.TypeRef#isIsArray <em>Is Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Array</em>'.
   * @see org.thingml.xtext.thingML.TypeRef#isIsArray()
   * @see #getTypeRef()
   * @generated
   */
  EAttribute getTypeRef_IsArray();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.TypeRef#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cardinality</em>'.
   * @see org.thingml.xtext.thingML.TypeRef#getCardinality()
   * @see #getTypeRef()
   * @generated
   */
  EReference getTypeRef_Cardinality();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.thingml.xtext.thingML.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.PrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Type</em>'.
   * @see org.thingml.xtext.thingML.PrimitiveType
   * @generated
   */
  EClass getPrimitiveType();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.PrimitiveType#getByteSize <em>Byte Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Byte Size</em>'.
   * @see org.thingml.xtext.thingML.PrimitiveType#getByteSize()
   * @see #getPrimitiveType()
   * @generated
   */
  EAttribute getPrimitiveType_ByteSize();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.ObjectType <em>Object Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Type</em>'.
   * @see org.thingml.xtext.thingML.ObjectType
   * @generated
   */
  EClass getObjectType();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration</em>'.
   * @see org.thingml.xtext.thingML.Enumeration
   * @generated
   */
  EClass getEnumeration();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.Enumeration#getTypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Ref</em>'.
   * @see org.thingml.xtext.thingML.Enumeration#getTypeRef()
   * @see #getEnumeration()
   * @generated
   */
  EReference getEnumeration_TypeRef();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.Enumeration#getLiterals <em>Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Literals</em>'.
   * @see org.thingml.xtext.thingML.Enumeration#getLiterals()
   * @see #getEnumeration()
   * @generated
   */
  EReference getEnumeration_Literals();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.EnumerationLiteral <em>Enumeration Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration Literal</em>'.
   * @see org.thingml.xtext.thingML.EnumerationLiteral
   * @generated
   */
  EClass getEnumerationLiteral();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.EnumerationLiteral#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see org.thingml.xtext.thingML.EnumerationLiteral#getInit()
   * @see #getEnumerationLiteral()
   * @generated
   */
  EReference getEnumerationLiteral_Init();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.Thing <em>Thing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Thing</em>'.
   * @see org.thingml.xtext.thingML.Thing
   * @generated
   */
  EClass getThing();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.Thing#isFragment <em>Fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fragment</em>'.
   * @see org.thingml.xtext.thingML.Thing#isFragment()
   * @see #getThing()
   * @generated
   */
  EAttribute getThing_Fragment();

  /**
   * Returns the meta object for the reference list '{@link org.thingml.xtext.thingML.Thing#getIncludes <em>Includes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Includes</em>'.
   * @see org.thingml.xtext.thingML.Thing#getIncludes()
   * @see #getThing()
   * @generated
   */
  EReference getThing_Includes();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.Thing#getMessages <em>Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Messages</em>'.
   * @see org.thingml.xtext.thingML.Thing#getMessages()
   * @see #getThing()
   * @generated
   */
  EReference getThing_Messages();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.Thing#getPorts <em>Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ports</em>'.
   * @see org.thingml.xtext.thingML.Thing#getPorts()
   * @see #getThing()
   * @generated
   */
  EReference getThing_Ports();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.Thing#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.thingml.xtext.thingML.Thing#getProperties()
   * @see #getThing()
   * @generated
   */
  EReference getThing_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.Thing#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see org.thingml.xtext.thingML.Thing#getFunctions()
   * @see #getThing()
   * @generated
   */
  EReference getThing_Functions();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.Thing#getAssign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assign</em>'.
   * @see org.thingml.xtext.thingML.Thing#getAssign()
   * @see #getThing()
   * @generated
   */
  EReference getThing_Assign();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.Thing#getDataAnalytics <em>Data Analytics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Analytics</em>'.
   * @see org.thingml.xtext.thingML.Thing#getDataAnalytics()
   * @see #getThing()
   * @generated
   */
  EReference getThing_DataAnalytics();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.Thing#getBehaviour <em>Behaviour</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Behaviour</em>'.
   * @see org.thingml.xtext.thingML.Thing#getBehaviour()
   * @see #getThing()
   * @generated
   */
  EReference getThing_Behaviour();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.PropertyAssign <em>Property Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Assign</em>'.
   * @see org.thingml.xtext.thingML.PropertyAssign
   * @generated
   */
  EClass getPropertyAssign();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.PropertyAssign#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see org.thingml.xtext.thingML.PropertyAssign#getProperty()
   * @see #getPropertyAssign()
   * @generated
   */
  EReference getPropertyAssign_Property();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.PropertyAssign#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see org.thingml.xtext.thingML.PropertyAssign#getIndex()
   * @see #getPropertyAssign()
   * @generated
   */
  EReference getPropertyAssign_Index();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.PropertyAssign#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see org.thingml.xtext.thingML.PropertyAssign#getInit()
   * @see #getPropertyAssign()
   * @generated
   */
  EReference getPropertyAssign_Init();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.Protocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Protocol</em>'.
   * @see org.thingml.xtext.thingML.Protocol
   * @generated
   */
  EClass getProtocol();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.thingml.xtext.thingML.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.Function#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.thingml.xtext.thingML.Function#getParameters()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.Function#getTypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Ref</em>'.
   * @see org.thingml.xtext.thingML.Function#getTypeRef()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_TypeRef();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.Function#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.thingml.xtext.thingML.Function#getBody()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Body();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.Function#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see org.thingml.xtext.thingML.Function#isAbstract()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Abstract();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.thingml.xtext.thingML.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.Property#isReadonly <em>Readonly</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Readonly</em>'.
   * @see org.thingml.xtext.thingML.Property#isReadonly()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Readonly();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.Property#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see org.thingml.xtext.thingML.Property#getInit()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Init();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.Message <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message</em>'.
   * @see org.thingml.xtext.thingML.Message
   * @generated
   */
  EClass getMessage();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.Message#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.thingml.xtext.thingML.Message#getParameters()
   * @see #getMessage()
   * @generated
   */
  EReference getMessage_Parameters();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.thingml.xtext.thingML.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Port</em>'.
   * @see org.thingml.xtext.thingML.Port
   * @generated
   */
  EClass getPort();

  /**
   * Returns the meta object for the reference list '{@link org.thingml.xtext.thingML.Port#getSends <em>Sends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Sends</em>'.
   * @see org.thingml.xtext.thingML.Port#getSends()
   * @see #getPort()
   * @generated
   */
  EReference getPort_Sends();

  /**
   * Returns the meta object for the reference list '{@link org.thingml.xtext.thingML.Port#getReceives <em>Receives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Receives</em>'.
   * @see org.thingml.xtext.thingML.Port#getReceives()
   * @see #getPort()
   * @generated
   */
  EReference getPort_Receives();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.RequiredPort <em>Required Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Required Port</em>'.
   * @see org.thingml.xtext.thingML.RequiredPort
   * @generated
   */
  EClass getRequiredPort();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.RequiredPort#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see org.thingml.xtext.thingML.RequiredPort#isOptional()
   * @see #getRequiredPort()
   * @generated
   */
  EAttribute getRequiredPort_Optional();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.ProvidedPort <em>Provided Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provided Port</em>'.
   * @see org.thingml.xtext.thingML.ProvidedPort
   * @generated
   */
  EClass getProvidedPort();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.InternalPort <em>Internal Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Internal Port</em>'.
   * @see org.thingml.xtext.thingML.InternalPort
   * @generated
   */
  EClass getInternalPort();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see org.thingml.xtext.thingML.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.State#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.thingml.xtext.thingML.State#getProperties()
   * @see #getState()
   * @generated
   */
  EReference getState_Properties();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.State#getEntry <em>Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entry</em>'.
   * @see org.thingml.xtext.thingML.State#getEntry()
   * @see #getState()
   * @generated
   */
  EReference getState_Entry();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.State#getExit <em>Exit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exit</em>'.
   * @see org.thingml.xtext.thingML.State#getExit()
   * @see #getState()
   * @generated
   */
  EReference getState_Exit();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.State#getInternal <em>Internal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Internal</em>'.
   * @see org.thingml.xtext.thingML.State#getInternal()
   * @see #getState()
   * @generated
   */
  EReference getState_Internal();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.State#getOutgoing <em>Outgoing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outgoing</em>'.
   * @see org.thingml.xtext.thingML.State#getOutgoing()
   * @see #getState()
   * @generated
   */
  EReference getState_Outgoing();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.Handler <em>Handler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Handler</em>'.
   * @see org.thingml.xtext.thingML.Handler
   * @generated
   */
  EClass getHandler();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.Handler#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event</em>'.
   * @see org.thingml.xtext.thingML.Handler#getEvent()
   * @see #getHandler()
   * @generated
   */
  EReference getHandler_Event();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.Handler#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard</em>'.
   * @see org.thingml.xtext.thingML.Handler#getGuard()
   * @see #getHandler()
   * @generated
   */
  EReference getHandler_Guard();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.Handler#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.thingml.xtext.thingML.Handler#getAction()
   * @see #getHandler()
   * @generated
   */
  EReference getHandler_Action();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see org.thingml.xtext.thingML.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.Transition#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.thingml.xtext.thingML.Transition#getTarget()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Target();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.InternalTransition <em>Internal Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Internal Transition</em>'.
   * @see org.thingml.xtext.thingML.InternalTransition
   * @generated
   */
  EClass getInternalTransition();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.CompositeState <em>Composite State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite State</em>'.
   * @see org.thingml.xtext.thingML.CompositeState
   * @generated
   */
  EClass getCompositeState();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.CompositeState#getRegion <em>Region</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Region</em>'.
   * @see org.thingml.xtext.thingML.CompositeState#getRegion()
   * @see #getCompositeState()
   * @generated
   */
  EReference getCompositeState_Region();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.CompositeState#getSession <em>Session</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Session</em>'.
   * @see org.thingml.xtext.thingML.CompositeState#getSession()
   * @see #getCompositeState()
   * @generated
   */
  EReference getCompositeState_Session();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.Session <em>Session</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Session</em>'.
   * @see org.thingml.xtext.thingML.Session
   * @generated
   */
  EClass getSession();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.Session#getMaxInstances <em>Max Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max Instances</em>'.
   * @see org.thingml.xtext.thingML.Session#getMaxInstances()
   * @see #getSession()
   * @generated
   */
  EReference getSession_MaxInstances();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.Region <em>Region</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Region</em>'.
   * @see org.thingml.xtext.thingML.Region
   * @generated
   */
  EClass getRegion();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.FinalState <em>Final State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Final State</em>'.
   * @see org.thingml.xtext.thingML.FinalState
   * @generated
   */
  EClass getFinalState();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.StateContainer <em>State Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Container</em>'.
   * @see org.thingml.xtext.thingML.StateContainer
   * @generated
   */
  EClass getStateContainer();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.StateContainer#getInitial <em>Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Initial</em>'.
   * @see org.thingml.xtext.thingML.StateContainer#getInitial()
   * @see #getStateContainer()
   * @generated
   */
  EReference getStateContainer_Initial();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.StateContainer#isHistory <em>History</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>History</em>'.
   * @see org.thingml.xtext.thingML.StateContainer#isHistory()
   * @see #getStateContainer()
   * @generated
   */
  EAttribute getStateContainer_History();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.StateContainer#getSubstate <em>Substate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Substate</em>'.
   * @see org.thingml.xtext.thingML.StateContainer#getSubstate()
   * @see #getStateContainer()
   * @generated
   */
  EReference getStateContainer_Substate();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.MessageParameter <em>Message Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message Parameter</em>'.
   * @see org.thingml.xtext.thingML.MessageParameter
   * @generated
   */
  EClass getMessageParameter();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.DataAnalytics <em>Data Analytics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Analytics</em>'.
   * @see org.thingml.xtext.thingML.DataAnalytics
   * @generated
   */
  EClass getDataAnalytics();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.DataAnalytics#getDataset <em>Dataset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dataset</em>'.
   * @see org.thingml.xtext.thingML.DataAnalytics#getDataset()
   * @see #getDataAnalytics()
   * @generated
   */
  EAttribute getDataAnalytics_Dataset();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.DataAnalytics#getAutoML <em>Auto ML</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Auto ML</em>'.
   * @see org.thingml.xtext.thingML.DataAnalytics#getAutoML()
   * @see #getDataAnalytics()
   * @generated
   */
  EAttribute getDataAnalytics_AutoML();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.DataAnalytics#getSequential <em>Sequential</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sequential</em>'.
   * @see org.thingml.xtext.thingML.DataAnalytics#getSequential()
   * @see #getDataAnalytics()
   * @generated
   */
  EAttribute getDataAnalytics_Sequential();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.DataAnalytics#getTimestamps <em>Timestamps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timestamps</em>'.
   * @see org.thingml.xtext.thingML.DataAnalytics#getTimestamps()
   * @see #getDataAnalytics()
   * @generated
   */
  EAttribute getDataAnalytics_Timestamps();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.DataAnalytics#getLabels <em>Labels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Labels</em>'.
   * @see org.thingml.xtext.thingML.DataAnalytics#getLabels()
   * @see #getDataAnalytics()
   * @generated
   */
  EAttribute getDataAnalytics_Labels();

  /**
   * Returns the meta object for the reference list '{@link org.thingml.xtext.thingML.DataAnalytics#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Features</em>'.
   * @see org.thingml.xtext.thingML.DataAnalytics#getFeatures()
   * @see #getDataAnalytics()
   * @generated
   */
  EReference getDataAnalytics_Features();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.DataAnalytics#getPreprocess_feature_scaling <em>Preprocess feature scaling</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Preprocess feature scaling</em>'.
   * @see org.thingml.xtext.thingML.DataAnalytics#getPreprocess_feature_scaling()
   * @see #getDataAnalytics()
   * @generated
   */
  EAttribute getDataAnalytics_Preprocess_feature_scaling();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.DataAnalytics#getModelAlgorithm <em>Model Algorithm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Model Algorithm</em>'.
   * @see org.thingml.xtext.thingML.DataAnalytics#getModelAlgorithm()
   * @see #getDataAnalytics()
   * @generated
   */
  EReference getDataAnalytics_ModelAlgorithm();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.DataAnalytics#getTrainingResults <em>Training Results</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Training Results</em>'.
   * @see org.thingml.xtext.thingML.DataAnalytics#getTrainingResults()
   * @see #getDataAnalytics()
   * @generated
   */
  EAttribute getDataAnalytics_TrainingResults();

  /**
   * Returns the meta object for the reference list '{@link org.thingml.xtext.thingML.DataAnalytics#getPredictionResults <em>Prediction Results</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Prediction Results</em>'.
   * @see org.thingml.xtext.thingML.DataAnalytics#getPredictionResults()
   * @see #getDataAnalytics()
   * @generated
   */
  EReference getDataAnalytics_PredictionResults();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.DataAnalyticsModelAlgorithm <em>Data Analytics Model Algorithm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Analytics Model Algorithm</em>'.
   * @see org.thingml.xtext.thingML.DataAnalyticsModelAlgorithm
   * @generated
   */
  EClass getDataAnalyticsModelAlgorithm();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.DataAnalyticsModelAlgorithm#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.thingml.xtext.thingML.DataAnalyticsModelAlgorithm#getName()
   * @see #getDataAnalyticsModelAlgorithm()
   * @generated
   */
  EAttribute getDataAnalyticsModelAlgorithm_Name();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.ML2_ModelAlgorithm <em>ML2 Model Algorithm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ML2 Model Algorithm</em>'.
   * @see org.thingml.xtext.thingML.ML2_ModelAlgorithm
   * @generated
   */
  EClass getML2_ModelAlgorithm();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.Pretrained_ML_Model <em>Pretrained ML Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pretrained ML Model</em>'.
   * @see org.thingml.xtext.thingML.Pretrained_ML_Model
   * @generated
   */
  EClass getPretrained_ML_Model();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.Pretrained_ML_Model#getPretrained_path <em>Pretrained path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pretrained path</em>'.
   * @see org.thingml.xtext.thingML.Pretrained_ML_Model#getPretrained_path()
   * @see #getPretrained_ML_Model()
   * @generated
   */
  EAttribute getPretrained_ML_Model_Pretrained_path();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.PMML_ModelAlgorithm <em>PMML Model Algorithm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PMML Model Algorithm</em>'.
   * @see org.thingml.xtext.thingML.PMML_ModelAlgorithm
   * @generated
   */
  EClass getPMML_ModelAlgorithm();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.PMML_ModelAlgorithm#getPmml_path <em>Pmml path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pmml path</em>'.
   * @see org.thingml.xtext.thingML.PMML_ModelAlgorithm#getPmml_path()
   * @see #getPMML_ModelAlgorithm()
   * @generated
   */
  EAttribute getPMML_ModelAlgorithm_Pmml_path();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.PFA_ModelAlgorithm <em>PFA Model Algorithm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PFA Model Algorithm</em>'.
   * @see org.thingml.xtext.thingML.PFA_ModelAlgorithm
   * @generated
   */
  EClass getPFA_ModelAlgorithm();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.PFA_ModelAlgorithm#getPfa_path <em>Pfa path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pfa path</em>'.
   * @see org.thingml.xtext.thingML.PFA_ModelAlgorithm#getPfa_path()
   * @see #getPFA_ModelAlgorithm()
   * @generated
   */
  EAttribute getPFA_ModelAlgorithm_Pfa_path();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.LinearRegression <em>Linear Regression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Linear Regression</em>'.
   * @see org.thingml.xtext.thingML.LinearRegression
   * @generated
   */
  EClass getLinearRegression();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.LinearRegression#getFit_intercept <em>Fit intercept</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fit intercept</em>'.
   * @see org.thingml.xtext.thingML.LinearRegression#getFit_intercept()
   * @see #getLinearRegression()
   * @generated
   */
  EReference getLinearRegression_Fit_intercept();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.LinearRegression#getNormalize <em>Normalize</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Normalize</em>'.
   * @see org.thingml.xtext.thingML.LinearRegression#getNormalize()
   * @see #getLinearRegression()
   * @generated
   */
  EReference getLinearRegression_Normalize();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.LinearRegression#getCopy_X <em>Copy X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Copy X</em>'.
   * @see org.thingml.xtext.thingML.LinearRegression#getCopy_X()
   * @see #getLinearRegression()
   * @generated
   */
  EReference getLinearRegression_Copy_X();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.LinearRegression#getN_jobs <em>Njobs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Njobs</em>'.
   * @see org.thingml.xtext.thingML.LinearRegression#getN_jobs()
   * @see #getLinearRegression()
   * @generated
   */
  EReference getLinearRegression_N_jobs();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.LinearRegression#getPositive <em>Positive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Positive</em>'.
   * @see org.thingml.xtext.thingML.LinearRegression#getPositive()
   * @see #getLinearRegression()
   * @generated
   */
  EReference getLinearRegression_Positive();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression <em>Linear Classifier Logistic Regression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Linear Classifier Logistic Regression</em>'.
   * @see org.thingml.xtext.thingML.LinearClassifierLogisticRegression
   * @generated
   */
  EClass getLinearClassifierLogisticRegression();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getPenalty <em>Penalty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Penalty</em>'.
   * @see org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getPenalty()
   * @see #getLinearClassifierLogisticRegression()
   * @generated
   */
  EAttribute getLinearClassifierLogisticRegression_Penalty();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getDual <em>Dual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dual</em>'.
   * @see org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getDual()
   * @see #getLinearClassifierLogisticRegression()
   * @generated
   */
  EReference getLinearClassifierLogisticRegression_Dual();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getTol <em>Tol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tol</em>'.
   * @see org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getTol()
   * @see #getLinearClassifierLogisticRegression()
   * @generated
   */
  EReference getLinearClassifierLogisticRegression_Tol();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C</em>'.
   * @see org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getC()
   * @see #getLinearClassifierLogisticRegression()
   * @generated
   */
  EReference getLinearClassifierLogisticRegression_C();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getFit_intercept <em>Fit intercept</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fit intercept</em>'.
   * @see org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getFit_intercept()
   * @see #getLinearClassifierLogisticRegression()
   * @generated
   */
  EReference getLinearClassifierLogisticRegression_Fit_intercept();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getIntercept_scaling <em>Intercept scaling</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Intercept scaling</em>'.
   * @see org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getIntercept_scaling()
   * @see #getLinearClassifierLogisticRegression()
   * @generated
   */
  EReference getLinearClassifierLogisticRegression_Intercept_scaling();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getClass_weight <em>Class weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class weight</em>'.
   * @see org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getClass_weight()
   * @see #getLinearClassifierLogisticRegression()
   * @generated
   */
  EAttribute getLinearClassifierLogisticRegression_Class_weight();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getRandom_state <em>Random state</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Random state</em>'.
   * @see org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getRandom_state()
   * @see #getLinearClassifierLogisticRegression()
   * @generated
   */
  EReference getLinearClassifierLogisticRegression_Random_state();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getOptimizer <em>Optimizer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optimizer</em>'.
   * @see org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getOptimizer()
   * @see #getLinearClassifierLogisticRegression()
   * @generated
   */
  EAttribute getLinearClassifierLogisticRegression_Optimizer();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getMax_iter <em>Max iter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max iter</em>'.
   * @see org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getMax_iter()
   * @see #getLinearClassifierLogisticRegression()
   * @generated
   */
  EReference getLinearClassifierLogisticRegression_Max_iter();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getMulti_class <em>Multi class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multi class</em>'.
   * @see org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getMulti_class()
   * @see #getLinearClassifierLogisticRegression()
   * @generated
   */
  EAttribute getLinearClassifierLogisticRegression_Multi_class();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getVerbose <em>Verbose</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Verbose</em>'.
   * @see org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getVerbose()
   * @see #getLinearClassifierLogisticRegression()
   * @generated
   */
  EReference getLinearClassifierLogisticRegression_Verbose();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getWarm_start <em>Warm start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Warm start</em>'.
   * @see org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getWarm_start()
   * @see #getLinearClassifierLogisticRegression()
   * @generated
   */
  EReference getLinearClassifierLogisticRegression_Warm_start();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getN_jobs <em>Njobs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Njobs</em>'.
   * @see org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getN_jobs()
   * @see #getLinearClassifierLogisticRegression()
   * @generated
   */
  EReference getLinearClassifierLogisticRegression_N_jobs();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getL1_ratio <em>L1 ratio</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>L1 ratio</em>'.
   * @see org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getL1_ratio()
   * @see #getLinearClassifierLogisticRegression()
   * @generated
   */
  EReference getLinearClassifierLogisticRegression_L1_ratio();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.NaiveBayesGaussian <em>Naive Bayes Gaussian</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Naive Bayes Gaussian</em>'.
   * @see org.thingml.xtext.thingML.NaiveBayesGaussian
   * @generated
   */
  EClass getNaiveBayesGaussian();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.NaiveBayesGaussian#getPriors <em>Priors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priors</em>'.
   * @see org.thingml.xtext.thingML.NaiveBayesGaussian#getPriors()
   * @see #getNaiveBayesGaussian()
   * @generated
   */
  EAttribute getNaiveBayesGaussian_Priors();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NaiveBayesGaussian#getVar_smoothing <em>Var smoothing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var smoothing</em>'.
   * @see org.thingml.xtext.thingML.NaiveBayesGaussian#getVar_smoothing()
   * @see #getNaiveBayesGaussian()
   * @generated
   */
  EReference getNaiveBayesGaussian_Var_smoothing();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.NaiveBayesMultinomial <em>Naive Bayes Multinomial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Naive Bayes Multinomial</em>'.
   * @see org.thingml.xtext.thingML.NaiveBayesMultinomial
   * @generated
   */
  EClass getNaiveBayesMultinomial();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NaiveBayesMultinomial#getAlpha <em>Alpha</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alpha</em>'.
   * @see org.thingml.xtext.thingML.NaiveBayesMultinomial#getAlpha()
   * @see #getNaiveBayesMultinomial()
   * @generated
   */
  EReference getNaiveBayesMultinomial_Alpha();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NaiveBayesMultinomial#getFit_prior <em>Fit prior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fit prior</em>'.
   * @see org.thingml.xtext.thingML.NaiveBayesMultinomial#getFit_prior()
   * @see #getNaiveBayesMultinomial()
   * @generated
   */
  EReference getNaiveBayesMultinomial_Fit_prior();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.NaiveBayesMultinomial#getClass_prior <em>Class prior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class prior</em>'.
   * @see org.thingml.xtext.thingML.NaiveBayesMultinomial#getClass_prior()
   * @see #getNaiveBayesMultinomial()
   * @generated
   */
  EAttribute getNaiveBayesMultinomial_Class_prior();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.NaiveBayesComplement <em>Naive Bayes Complement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Naive Bayes Complement</em>'.
   * @see org.thingml.xtext.thingML.NaiveBayesComplement
   * @generated
   */
  EClass getNaiveBayesComplement();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NaiveBayesComplement#getAlpha <em>Alpha</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alpha</em>'.
   * @see org.thingml.xtext.thingML.NaiveBayesComplement#getAlpha()
   * @see #getNaiveBayesComplement()
   * @generated
   */
  EReference getNaiveBayesComplement_Alpha();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NaiveBayesComplement#getFit_prior <em>Fit prior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fit prior</em>'.
   * @see org.thingml.xtext.thingML.NaiveBayesComplement#getFit_prior()
   * @see #getNaiveBayesComplement()
   * @generated
   */
  EReference getNaiveBayesComplement_Fit_prior();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.NaiveBayesComplement#getClass_prior <em>Class prior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class prior</em>'.
   * @see org.thingml.xtext.thingML.NaiveBayesComplement#getClass_prior()
   * @see #getNaiveBayesComplement()
   * @generated
   */
  EAttribute getNaiveBayesComplement_Class_prior();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NaiveBayesComplement#getNorm <em>Norm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Norm</em>'.
   * @see org.thingml.xtext.thingML.NaiveBayesComplement#getNorm()
   * @see #getNaiveBayesComplement()
   * @generated
   */
  EReference getNaiveBayesComplement_Norm();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.NaiveBayesBernoulli <em>Naive Bayes Bernoulli</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Naive Bayes Bernoulli</em>'.
   * @see org.thingml.xtext.thingML.NaiveBayesBernoulli
   * @generated
   */
  EClass getNaiveBayesBernoulli();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NaiveBayesBernoulli#getAlpha <em>Alpha</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alpha</em>'.
   * @see org.thingml.xtext.thingML.NaiveBayesBernoulli#getAlpha()
   * @see #getNaiveBayesBernoulli()
   * @generated
   */
  EReference getNaiveBayesBernoulli_Alpha();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NaiveBayesBernoulli#getBinarize <em>Binarize</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Binarize</em>'.
   * @see org.thingml.xtext.thingML.NaiveBayesBernoulli#getBinarize()
   * @see #getNaiveBayesBernoulli()
   * @generated
   */
  EReference getNaiveBayesBernoulli_Binarize();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NaiveBayesBernoulli#getFit_prior <em>Fit prior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fit prior</em>'.
   * @see org.thingml.xtext.thingML.NaiveBayesBernoulli#getFit_prior()
   * @see #getNaiveBayesBernoulli()
   * @generated
   */
  EReference getNaiveBayesBernoulli_Fit_prior();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.NaiveBayesBernoulli#getClass_prior <em>Class prior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class prior</em>'.
   * @see org.thingml.xtext.thingML.NaiveBayesBernoulli#getClass_prior()
   * @see #getNaiveBayesBernoulli()
   * @generated
   */
  EAttribute getNaiveBayesBernoulli_Class_prior();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.NaiveBayesCategorical <em>Naive Bayes Categorical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Naive Bayes Categorical</em>'.
   * @see org.thingml.xtext.thingML.NaiveBayesCategorical
   * @generated
   */
  EClass getNaiveBayesCategorical();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NaiveBayesCategorical#getAlpha <em>Alpha</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alpha</em>'.
   * @see org.thingml.xtext.thingML.NaiveBayesCategorical#getAlpha()
   * @see #getNaiveBayesCategorical()
   * @generated
   */
  EReference getNaiveBayesCategorical_Alpha();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NaiveBayesCategorical#getFit_prior <em>Fit prior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fit prior</em>'.
   * @see org.thingml.xtext.thingML.NaiveBayesCategorical#getFit_prior()
   * @see #getNaiveBayesCategorical()
   * @generated
   */
  EReference getNaiveBayesCategorical_Fit_prior();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.NaiveBayesCategorical#getClass_prior <em>Class prior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class prior</em>'.
   * @see org.thingml.xtext.thingML.NaiveBayesCategorical#getClass_prior()
   * @see #getNaiveBayesCategorical()
   * @generated
   */
  EAttribute getNaiveBayesCategorical_Class_prior();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.NaiveBayesCategorical#getMin_categories <em>Min categories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min categories</em>'.
   * @see org.thingml.xtext.thingML.NaiveBayesCategorical#getMin_categories()
   * @see #getNaiveBayesCategorical()
   * @generated
   */
  EAttribute getNaiveBayesCategorical_Min_categories();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.DecisionTreeRegressor <em>Decision Tree Regressor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decision Tree Regressor</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeRegressor
   * @generated
   */
  EClass getDecisionTreeRegressor();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getDecisionTreeRegressorCriterion <em>Decision Tree Regressor Criterion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Decision Tree Regressor Criterion</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeRegressor#getDecisionTreeRegressorCriterion()
   * @see #getDecisionTreeRegressor()
   * @generated
   */
  EAttribute getDecisionTreeRegressor_DecisionTreeRegressorCriterion();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getDecisionTreeSplitter <em>Decision Tree Splitter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Decision Tree Splitter</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeRegressor#getDecisionTreeSplitter()
   * @see #getDecisionTreeRegressor()
   * @generated
   */
  EAttribute getDecisionTreeRegressor_DecisionTreeSplitter();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getMax_depth <em>Max depth</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max depth</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeRegressor#getMax_depth()
   * @see #getDecisionTreeRegressor()
   * @generated
   */
  EReference getDecisionTreeRegressor_Max_depth();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getMin_samples_split <em>Min samples split</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min samples split</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeRegressor#getMin_samples_split()
   * @see #getDecisionTreeRegressor()
   * @generated
   */
  EReference getDecisionTreeRegressor_Min_samples_split();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getMin_samples_leaf <em>Min samples leaf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min samples leaf</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeRegressor#getMin_samples_leaf()
   * @see #getDecisionTreeRegressor()
   * @generated
   */
  EReference getDecisionTreeRegressor_Min_samples_leaf();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getMin_weight_fraction_leaf <em>Min weight fraction leaf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min weight fraction leaf</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeRegressor#getMin_weight_fraction_leaf()
   * @see #getDecisionTreeRegressor()
   * @generated
   */
  EReference getDecisionTreeRegressor_Min_weight_fraction_leaf();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getMax_features_numeric <em>Max features numeric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max features numeric</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeRegressor#getMax_features_numeric()
   * @see #getDecisionTreeRegressor()
   * @generated
   */
  EReference getDecisionTreeRegressor_Max_features_numeric();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getMax_features_enum <em>Max features enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max features enum</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeRegressor#getMax_features_enum()
   * @see #getDecisionTreeRegressor()
   * @generated
   */
  EAttribute getDecisionTreeRegressor_Max_features_enum();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getRandom_state <em>Random state</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Random state</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeRegressor#getRandom_state()
   * @see #getDecisionTreeRegressor()
   * @generated
   */
  EReference getDecisionTreeRegressor_Random_state();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getMax_leaf_nodes <em>Max leaf nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max leaf nodes</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeRegressor#getMax_leaf_nodes()
   * @see #getDecisionTreeRegressor()
   * @generated
   */
  EReference getDecisionTreeRegressor_Max_leaf_nodes();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getMin_impurity_decrease <em>Min impurity decrease</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min impurity decrease</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeRegressor#getMin_impurity_decrease()
   * @see #getDecisionTreeRegressor()
   * @generated
   */
  EReference getDecisionTreeRegressor_Min_impurity_decrease();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getMin_impurity_split <em>Min impurity split</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min impurity split</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeRegressor#getMin_impurity_split()
   * @see #getDecisionTreeRegressor()
   * @generated
   */
  EReference getDecisionTreeRegressor_Min_impurity_split();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getCcp_alpha <em>Ccp alpha</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ccp alpha</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeRegressor#getCcp_alpha()
   * @see #getDecisionTreeRegressor()
   * @generated
   */
  EReference getDecisionTreeRegressor_Ccp_alpha();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.DecisionTreeClassifier <em>Decision Tree Classifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decision Tree Classifier</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeClassifier
   * @generated
   */
  EClass getDecisionTreeClassifier();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.DecisionTreeClassifier#getDecisionTreeClassifierCriterion <em>Decision Tree Classifier Criterion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Decision Tree Classifier Criterion</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeClassifier#getDecisionTreeClassifierCriterion()
   * @see #getDecisionTreeClassifier()
   * @generated
   */
  EAttribute getDecisionTreeClassifier_DecisionTreeClassifierCriterion();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.DecisionTreeClassifier#getDecisionTreeSplitter <em>Decision Tree Splitter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Decision Tree Splitter</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeClassifier#getDecisionTreeSplitter()
   * @see #getDecisionTreeClassifier()
   * @generated
   */
  EAttribute getDecisionTreeClassifier_DecisionTreeSplitter();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.DecisionTreeClassifier#getMax_depth <em>Max depth</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max depth</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeClassifier#getMax_depth()
   * @see #getDecisionTreeClassifier()
   * @generated
   */
  EReference getDecisionTreeClassifier_Max_depth();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.DecisionTreeClassifier#getMin_samples_split <em>Min samples split</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min samples split</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeClassifier#getMin_samples_split()
   * @see #getDecisionTreeClassifier()
   * @generated
   */
  EReference getDecisionTreeClassifier_Min_samples_split();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.DecisionTreeClassifier#getMin_samples_leaf <em>Min samples leaf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min samples leaf</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeClassifier#getMin_samples_leaf()
   * @see #getDecisionTreeClassifier()
   * @generated
   */
  EReference getDecisionTreeClassifier_Min_samples_leaf();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.DecisionTreeClassifier#getMin_weight_fraction_leaf <em>Min weight fraction leaf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min weight fraction leaf</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeClassifier#getMin_weight_fraction_leaf()
   * @see #getDecisionTreeClassifier()
   * @generated
   */
  EReference getDecisionTreeClassifier_Min_weight_fraction_leaf();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.DecisionTreeClassifier#getMax_features_numeric <em>Max features numeric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max features numeric</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeClassifier#getMax_features_numeric()
   * @see #getDecisionTreeClassifier()
   * @generated
   */
  EReference getDecisionTreeClassifier_Max_features_numeric();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.DecisionTreeClassifier#getMax_features_enum <em>Max features enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max features enum</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeClassifier#getMax_features_enum()
   * @see #getDecisionTreeClassifier()
   * @generated
   */
  EAttribute getDecisionTreeClassifier_Max_features_enum();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.DecisionTreeClassifier#getRandom_state <em>Random state</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Random state</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeClassifier#getRandom_state()
   * @see #getDecisionTreeClassifier()
   * @generated
   */
  EReference getDecisionTreeClassifier_Random_state();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.DecisionTreeClassifier#getMax_leaf_nodes <em>Max leaf nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max leaf nodes</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeClassifier#getMax_leaf_nodes()
   * @see #getDecisionTreeClassifier()
   * @generated
   */
  EReference getDecisionTreeClassifier_Max_leaf_nodes();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.DecisionTreeClassifier#getMin_impurity_decrease <em>Min impurity decrease</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min impurity decrease</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeClassifier#getMin_impurity_decrease()
   * @see #getDecisionTreeClassifier()
   * @generated
   */
  EReference getDecisionTreeClassifier_Min_impurity_decrease();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.DecisionTreeClassifier#getMin_impurity_split <em>Min impurity split</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min impurity split</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeClassifier#getMin_impurity_split()
   * @see #getDecisionTreeClassifier()
   * @generated
   */
  EReference getDecisionTreeClassifier_Min_impurity_split();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.DecisionTreeClassifier#getClass_weight <em>Class weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class weight</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeClassifier#getClass_weight()
   * @see #getDecisionTreeClassifier()
   * @generated
   */
  EAttribute getDecisionTreeClassifier_Class_weight();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.DecisionTreeClassifier#getCcp_alpha <em>Ccp alpha</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ccp alpha</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeClassifier#getCcp_alpha()
   * @see #getDecisionTreeClassifier()
   * @generated
   */
  EReference getDecisionTreeClassifier_Ccp_alpha();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.RandomForestRegressor <em>Random Forest Regressor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Random Forest Regressor</em>'.
   * @see org.thingml.xtext.thingML.RandomForestRegressor
   * @generated
   */
  EClass getRandomForestRegressor();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestRegressor#getN_estimators <em>Nestimators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nestimators</em>'.
   * @see org.thingml.xtext.thingML.RandomForestRegressor#getN_estimators()
   * @see #getRandomForestRegressor()
   * @generated
   */
  EReference getRandomForestRegressor_N_estimators();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.RandomForestRegressor#getRandomForestRegressorCriterion <em>Random Forest Regressor Criterion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Random Forest Regressor Criterion</em>'.
   * @see org.thingml.xtext.thingML.RandomForestRegressor#getRandomForestRegressorCriterion()
   * @see #getRandomForestRegressor()
   * @generated
   */
  EAttribute getRandomForestRegressor_RandomForestRegressorCriterion();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestRegressor#getMax_depth <em>Max depth</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max depth</em>'.
   * @see org.thingml.xtext.thingML.RandomForestRegressor#getMax_depth()
   * @see #getRandomForestRegressor()
   * @generated
   */
  EReference getRandomForestRegressor_Max_depth();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestRegressor#getMin_samples_split <em>Min samples split</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min samples split</em>'.
   * @see org.thingml.xtext.thingML.RandomForestRegressor#getMin_samples_split()
   * @see #getRandomForestRegressor()
   * @generated
   */
  EReference getRandomForestRegressor_Min_samples_split();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestRegressor#getMin_samples_leaf <em>Min samples leaf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min samples leaf</em>'.
   * @see org.thingml.xtext.thingML.RandomForestRegressor#getMin_samples_leaf()
   * @see #getRandomForestRegressor()
   * @generated
   */
  EReference getRandomForestRegressor_Min_samples_leaf();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestRegressor#getMin_weight_fraction_leaf <em>Min weight fraction leaf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min weight fraction leaf</em>'.
   * @see org.thingml.xtext.thingML.RandomForestRegressor#getMin_weight_fraction_leaf()
   * @see #getRandomForestRegressor()
   * @generated
   */
  EReference getRandomForestRegressor_Min_weight_fraction_leaf();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestRegressor#getMax_features_numeric <em>Max features numeric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max features numeric</em>'.
   * @see org.thingml.xtext.thingML.RandomForestRegressor#getMax_features_numeric()
   * @see #getRandomForestRegressor()
   * @generated
   */
  EReference getRandomForestRegressor_Max_features_numeric();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.RandomForestRegressor#getMax_features_enum <em>Max features enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max features enum</em>'.
   * @see org.thingml.xtext.thingML.RandomForestRegressor#getMax_features_enum()
   * @see #getRandomForestRegressor()
   * @generated
   */
  EAttribute getRandomForestRegressor_Max_features_enum();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestRegressor#getMax_leaf_nodes <em>Max leaf nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max leaf nodes</em>'.
   * @see org.thingml.xtext.thingML.RandomForestRegressor#getMax_leaf_nodes()
   * @see #getRandomForestRegressor()
   * @generated
   */
  EReference getRandomForestRegressor_Max_leaf_nodes();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestRegressor#getMin_impurity_decrease <em>Min impurity decrease</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min impurity decrease</em>'.
   * @see org.thingml.xtext.thingML.RandomForestRegressor#getMin_impurity_decrease()
   * @see #getRandomForestRegressor()
   * @generated
   */
  EReference getRandomForestRegressor_Min_impurity_decrease();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestRegressor#getMin_impurity_split <em>Min impurity split</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min impurity split</em>'.
   * @see org.thingml.xtext.thingML.RandomForestRegressor#getMin_impurity_split()
   * @see #getRandomForestRegressor()
   * @generated
   */
  EReference getRandomForestRegressor_Min_impurity_split();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestRegressor#getBootstrap <em>Bootstrap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bootstrap</em>'.
   * @see org.thingml.xtext.thingML.RandomForestRegressor#getBootstrap()
   * @see #getRandomForestRegressor()
   * @generated
   */
  EReference getRandomForestRegressor_Bootstrap();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestRegressor#getOob_score <em>Oob score</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Oob score</em>'.
   * @see org.thingml.xtext.thingML.RandomForestRegressor#getOob_score()
   * @see #getRandomForestRegressor()
   * @generated
   */
  EReference getRandomForestRegressor_Oob_score();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestRegressor#getN_jobs <em>Njobs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Njobs</em>'.
   * @see org.thingml.xtext.thingML.RandomForestRegressor#getN_jobs()
   * @see #getRandomForestRegressor()
   * @generated
   */
  EReference getRandomForestRegressor_N_jobs();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestRegressor#getRandom_state <em>Random state</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Random state</em>'.
   * @see org.thingml.xtext.thingML.RandomForestRegressor#getRandom_state()
   * @see #getRandomForestRegressor()
   * @generated
   */
  EReference getRandomForestRegressor_Random_state();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestRegressor#getVerbose <em>Verbose</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Verbose</em>'.
   * @see org.thingml.xtext.thingML.RandomForestRegressor#getVerbose()
   * @see #getRandomForestRegressor()
   * @generated
   */
  EReference getRandomForestRegressor_Verbose();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestRegressor#getWarm_start <em>Warm start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Warm start</em>'.
   * @see org.thingml.xtext.thingML.RandomForestRegressor#getWarm_start()
   * @see #getRandomForestRegressor()
   * @generated
   */
  EReference getRandomForestRegressor_Warm_start();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestRegressor#getCcp_alpha <em>Ccp alpha</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ccp alpha</em>'.
   * @see org.thingml.xtext.thingML.RandomForestRegressor#getCcp_alpha()
   * @see #getRandomForestRegressor()
   * @generated
   */
  EReference getRandomForestRegressor_Ccp_alpha();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestRegressor#getMax_samples <em>Max samples</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max samples</em>'.
   * @see org.thingml.xtext.thingML.RandomForestRegressor#getMax_samples()
   * @see #getRandomForestRegressor()
   * @generated
   */
  EReference getRandomForestRegressor_Max_samples();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.RandomForestClassifier <em>Random Forest Classifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Random Forest Classifier</em>'.
   * @see org.thingml.xtext.thingML.RandomForestClassifier
   * @generated
   */
  EClass getRandomForestClassifier();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestClassifier#getN_estimators <em>Nestimators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nestimators</em>'.
   * @see org.thingml.xtext.thingML.RandomForestClassifier#getN_estimators()
   * @see #getRandomForestClassifier()
   * @generated
   */
  EReference getRandomForestClassifier_N_estimators();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.RandomForestClassifier#getRandomForestClassifierCriterion <em>Random Forest Classifier Criterion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Random Forest Classifier Criterion</em>'.
   * @see org.thingml.xtext.thingML.RandomForestClassifier#getRandomForestClassifierCriterion()
   * @see #getRandomForestClassifier()
   * @generated
   */
  EAttribute getRandomForestClassifier_RandomForestClassifierCriterion();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestClassifier#getMax_depth <em>Max depth</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max depth</em>'.
   * @see org.thingml.xtext.thingML.RandomForestClassifier#getMax_depth()
   * @see #getRandomForestClassifier()
   * @generated
   */
  EReference getRandomForestClassifier_Max_depth();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestClassifier#getMin_samples_split <em>Min samples split</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min samples split</em>'.
   * @see org.thingml.xtext.thingML.RandomForestClassifier#getMin_samples_split()
   * @see #getRandomForestClassifier()
   * @generated
   */
  EReference getRandomForestClassifier_Min_samples_split();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestClassifier#getMin_samples_leaf <em>Min samples leaf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min samples leaf</em>'.
   * @see org.thingml.xtext.thingML.RandomForestClassifier#getMin_samples_leaf()
   * @see #getRandomForestClassifier()
   * @generated
   */
  EReference getRandomForestClassifier_Min_samples_leaf();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestClassifier#getMin_weight_fraction_leaf <em>Min weight fraction leaf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min weight fraction leaf</em>'.
   * @see org.thingml.xtext.thingML.RandomForestClassifier#getMin_weight_fraction_leaf()
   * @see #getRandomForestClassifier()
   * @generated
   */
  EReference getRandomForestClassifier_Min_weight_fraction_leaf();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestClassifier#getMax_features_numeric <em>Max features numeric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max features numeric</em>'.
   * @see org.thingml.xtext.thingML.RandomForestClassifier#getMax_features_numeric()
   * @see #getRandomForestClassifier()
   * @generated
   */
  EReference getRandomForestClassifier_Max_features_numeric();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.RandomForestClassifier#getMax_features_enum <em>Max features enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max features enum</em>'.
   * @see org.thingml.xtext.thingML.RandomForestClassifier#getMax_features_enum()
   * @see #getRandomForestClassifier()
   * @generated
   */
  EAttribute getRandomForestClassifier_Max_features_enum();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestClassifier#getMax_leaf_nodes <em>Max leaf nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max leaf nodes</em>'.
   * @see org.thingml.xtext.thingML.RandomForestClassifier#getMax_leaf_nodes()
   * @see #getRandomForestClassifier()
   * @generated
   */
  EReference getRandomForestClassifier_Max_leaf_nodes();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestClassifier#getMin_impurity_decrease <em>Min impurity decrease</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min impurity decrease</em>'.
   * @see org.thingml.xtext.thingML.RandomForestClassifier#getMin_impurity_decrease()
   * @see #getRandomForestClassifier()
   * @generated
   */
  EReference getRandomForestClassifier_Min_impurity_decrease();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestClassifier#getMin_impurity_split <em>Min impurity split</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min impurity split</em>'.
   * @see org.thingml.xtext.thingML.RandomForestClassifier#getMin_impurity_split()
   * @see #getRandomForestClassifier()
   * @generated
   */
  EReference getRandomForestClassifier_Min_impurity_split();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestClassifier#getBootstrap <em>Bootstrap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bootstrap</em>'.
   * @see org.thingml.xtext.thingML.RandomForestClassifier#getBootstrap()
   * @see #getRandomForestClassifier()
   * @generated
   */
  EReference getRandomForestClassifier_Bootstrap();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestClassifier#getOob_score <em>Oob score</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Oob score</em>'.
   * @see org.thingml.xtext.thingML.RandomForestClassifier#getOob_score()
   * @see #getRandomForestClassifier()
   * @generated
   */
  EReference getRandomForestClassifier_Oob_score();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestClassifier#getN_jobs <em>Njobs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Njobs</em>'.
   * @see org.thingml.xtext.thingML.RandomForestClassifier#getN_jobs()
   * @see #getRandomForestClassifier()
   * @generated
   */
  EReference getRandomForestClassifier_N_jobs();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestClassifier#getRandom_state <em>Random state</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Random state</em>'.
   * @see org.thingml.xtext.thingML.RandomForestClassifier#getRandom_state()
   * @see #getRandomForestClassifier()
   * @generated
   */
  EReference getRandomForestClassifier_Random_state();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestClassifier#getVerbose <em>Verbose</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Verbose</em>'.
   * @see org.thingml.xtext.thingML.RandomForestClassifier#getVerbose()
   * @see #getRandomForestClassifier()
   * @generated
   */
  EReference getRandomForestClassifier_Verbose();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestClassifier#getWarm_start <em>Warm start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Warm start</em>'.
   * @see org.thingml.xtext.thingML.RandomForestClassifier#getWarm_start()
   * @see #getRandomForestClassifier()
   * @generated
   */
  EReference getRandomForestClassifier_Warm_start();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.RandomForestClassifier#getClass_weight <em>Class weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class weight</em>'.
   * @see org.thingml.xtext.thingML.RandomForestClassifier#getClass_weight()
   * @see #getRandomForestClassifier()
   * @generated
   */
  EAttribute getRandomForestClassifier_Class_weight();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestClassifier#getCcp_alpha <em>Ccp alpha</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ccp alpha</em>'.
   * @see org.thingml.xtext.thingML.RandomForestClassifier#getCcp_alpha()
   * @see #getRandomForestClassifier()
   * @generated
   */
  EReference getRandomForestClassifier_Ccp_alpha();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.RandomForestClassifier#getMax_samples <em>Max samples</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max samples</em>'.
   * @see org.thingml.xtext.thingML.RandomForestClassifier#getMax_samples()
   * @see #getRandomForestClassifier()
   * @generated
   */
  EReference getRandomForestClassifier_Max_samples();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron <em>NN Multilayer Perceptron</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NN Multilayer Perceptron</em>'.
   * @see org.thingml.xtext.thingML.NN_MultilayerPerceptron
   * @generated
   */
  EClass getNN_MultilayerPerceptron();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getHidden_layer_sizes <em>Hidden layer sizes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hidden layer sizes</em>'.
   * @see org.thingml.xtext.thingML.NN_MultilayerPerceptron#getHidden_layer_sizes()
   * @see #getNN_MultilayerPerceptron()
   * @generated
   */
  EAttribute getNN_MultilayerPerceptron_Hidden_layer_sizes();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getHidden_layers <em>Hidden layers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hidden layers</em>'.
   * @see org.thingml.xtext.thingML.NN_MultilayerPerceptron#getHidden_layers()
   * @see #getNN_MultilayerPerceptron()
   * @generated
   */
  EReference getNN_MultilayerPerceptron_Hidden_layers();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getActivation <em>Activation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Activation</em>'.
   * @see org.thingml.xtext.thingML.NN_MultilayerPerceptron#getActivation()
   * @see #getNN_MultilayerPerceptron()
   * @generated
   */
  EAttribute getNN_MultilayerPerceptron_Activation();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getOptimizer <em>Optimizer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optimizer</em>'.
   * @see org.thingml.xtext.thingML.NN_MultilayerPerceptron#getOptimizer()
   * @see #getNN_MultilayerPerceptron()
   * @generated
   */
  EAttribute getNN_MultilayerPerceptron_Optimizer();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getAlpha <em>Alpha</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alpha</em>'.
   * @see org.thingml.xtext.thingML.NN_MultilayerPerceptron#getAlpha()
   * @see #getNN_MultilayerPerceptron()
   * @generated
   */
  EReference getNN_MultilayerPerceptron_Alpha();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getBatch_size <em>Batch size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Batch size</em>'.
   * @see org.thingml.xtext.thingML.NN_MultilayerPerceptron#getBatch_size()
   * @see #getNN_MultilayerPerceptron()
   * @generated
   */
  EReference getNN_MultilayerPerceptron_Batch_size();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getLearning_rate_mode <em>Learning rate mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Learning rate mode</em>'.
   * @see org.thingml.xtext.thingML.NN_MultilayerPerceptron#getLearning_rate_mode()
   * @see #getNN_MultilayerPerceptron()
   * @generated
   */
  EAttribute getNN_MultilayerPerceptron_Learning_rate_mode();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getLearning_rate_init <em>Learning rate init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Learning rate init</em>'.
   * @see org.thingml.xtext.thingML.NN_MultilayerPerceptron#getLearning_rate_init()
   * @see #getNN_MultilayerPerceptron()
   * @generated
   */
  EAttribute getNN_MultilayerPerceptron_Learning_rate_init();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getPower_t <em>Power t</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Power t</em>'.
   * @see org.thingml.xtext.thingML.NN_MultilayerPerceptron#getPower_t()
   * @see #getNN_MultilayerPerceptron()
   * @generated
   */
  EReference getNN_MultilayerPerceptron_Power_t();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getMax_iter <em>Max iter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max iter</em>'.
   * @see org.thingml.xtext.thingML.NN_MultilayerPerceptron#getMax_iter()
   * @see #getNN_MultilayerPerceptron()
   * @generated
   */
  EReference getNN_MultilayerPerceptron_Max_iter();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getShuffle <em>Shuffle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Shuffle</em>'.
   * @see org.thingml.xtext.thingML.NN_MultilayerPerceptron#getShuffle()
   * @see #getNN_MultilayerPerceptron()
   * @generated
   */
  EReference getNN_MultilayerPerceptron_Shuffle();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getRandom_state <em>Random state</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Random state</em>'.
   * @see org.thingml.xtext.thingML.NN_MultilayerPerceptron#getRandom_state()
   * @see #getNN_MultilayerPerceptron()
   * @generated
   */
  EReference getNN_MultilayerPerceptron_Random_state();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getTol <em>Tol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tol</em>'.
   * @see org.thingml.xtext.thingML.NN_MultilayerPerceptron#getTol()
   * @see #getNN_MultilayerPerceptron()
   * @generated
   */
  EReference getNN_MultilayerPerceptron_Tol();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getVerbose <em>Verbose</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Verbose</em>'.
   * @see org.thingml.xtext.thingML.NN_MultilayerPerceptron#getVerbose()
   * @see #getNN_MultilayerPerceptron()
   * @generated
   */
  EReference getNN_MultilayerPerceptron_Verbose();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getWarm_start <em>Warm start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Warm start</em>'.
   * @see org.thingml.xtext.thingML.NN_MultilayerPerceptron#getWarm_start()
   * @see #getNN_MultilayerPerceptron()
   * @generated
   */
  EReference getNN_MultilayerPerceptron_Warm_start();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getMomentum <em>Momentum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Momentum</em>'.
   * @see org.thingml.xtext.thingML.NN_MultilayerPerceptron#getMomentum()
   * @see #getNN_MultilayerPerceptron()
   * @generated
   */
  EReference getNN_MultilayerPerceptron_Momentum();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getNesterovs_momentum <em>Nesterovs momentum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nesterovs momentum</em>'.
   * @see org.thingml.xtext.thingML.NN_MultilayerPerceptron#getNesterovs_momentum()
   * @see #getNN_MultilayerPerceptron()
   * @generated
   */
  EReference getNN_MultilayerPerceptron_Nesterovs_momentum();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getEarly_stopping <em>Early stopping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Early stopping</em>'.
   * @see org.thingml.xtext.thingML.NN_MultilayerPerceptron#getEarly_stopping()
   * @see #getNN_MultilayerPerceptron()
   * @generated
   */
  EReference getNN_MultilayerPerceptron_Early_stopping();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getValidation_fraction <em>Validation fraction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Validation fraction</em>'.
   * @see org.thingml.xtext.thingML.NN_MultilayerPerceptron#getValidation_fraction()
   * @see #getNN_MultilayerPerceptron()
   * @generated
   */
  EReference getNN_MultilayerPerceptron_Validation_fraction();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getBeta_1 <em>Beta 1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Beta 1</em>'.
   * @see org.thingml.xtext.thingML.NN_MultilayerPerceptron#getBeta_1()
   * @see #getNN_MultilayerPerceptron()
   * @generated
   */
  EReference getNN_MultilayerPerceptron_Beta_1();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getBeta_2 <em>Beta 2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Beta 2</em>'.
   * @see org.thingml.xtext.thingML.NN_MultilayerPerceptron#getBeta_2()
   * @see #getNN_MultilayerPerceptron()
   * @generated
   */
  EReference getNN_MultilayerPerceptron_Beta_2();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getEpsilon <em>Epsilon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Epsilon</em>'.
   * @see org.thingml.xtext.thingML.NN_MultilayerPerceptron#getEpsilon()
   * @see #getNN_MultilayerPerceptron()
   * @generated
   */
  EReference getNN_MultilayerPerceptron_Epsilon();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getN_iter_no_change <em>Niter no change</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Niter no change</em>'.
   * @see org.thingml.xtext.thingML.NN_MultilayerPerceptron#getN_iter_no_change()
   * @see #getNN_MultilayerPerceptron()
   * @generated
   */
  EReference getNN_MultilayerPerceptron_N_iter_no_change();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getMax_fun <em>Max fun</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max fun</em>'.
   * @see org.thingml.xtext.thingML.NN_MultilayerPerceptron#getMax_fun()
   * @see #getNN_MultilayerPerceptron()
   * @generated
   */
  EReference getNN_MultilayerPerceptron_Max_fun();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getLoss <em>Loss</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Loss</em>'.
   * @see org.thingml.xtext.thingML.NN_MultilayerPerceptron#getLoss()
   * @see #getNN_MultilayerPerceptron()
   * @generated
   */
  EAttribute getNN_MultilayerPerceptron_Loss();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getEpochs <em>Epochs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Epochs</em>'.
   * @see org.thingml.xtext.thingML.NN_MultilayerPerceptron#getEpochs()
   * @see #getNN_MultilayerPerceptron()
   * @generated
   */
  EReference getNN_MultilayerPerceptron_Epochs();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see org.thingml.xtext.thingML.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.ReceiveMessage <em>Receive Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Receive Message</em>'.
   * @see org.thingml.xtext.thingML.ReceiveMessage
   * @generated
   */
  EClass getReceiveMessage();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.ReceiveMessage#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Port</em>'.
   * @see org.thingml.xtext.thingML.ReceiveMessage#getPort()
   * @see #getReceiveMessage()
   * @generated
   */
  EReference getReceiveMessage_Port();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.ReceiveMessage#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Message</em>'.
   * @see org.thingml.xtext.thingML.ReceiveMessage#getMessage()
   * @see #getReceiveMessage()
   * @generated
   */
  EReference getReceiveMessage_Message();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see org.thingml.xtext.thingML.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.ActionBlock <em>Action Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Block</em>'.
   * @see org.thingml.xtext.thingML.ActionBlock
   * @generated
   */
  EClass getActionBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.ActionBlock#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.thingml.xtext.thingML.ActionBlock#getActions()
   * @see #getActionBlock()
   * @generated
   */
  EReference getActionBlock_Actions();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.ExternStatement <em>Extern Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extern Statement</em>'.
   * @see org.thingml.xtext.thingML.ExternStatement
   * @generated
   */
  EClass getExternStatement();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.ExternStatement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Statement</em>'.
   * @see org.thingml.xtext.thingML.ExternStatement#getStatement()
   * @see #getExternStatement()
   * @generated
   */
  EAttribute getExternStatement_Statement();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.ExternStatement#getSegments <em>Segments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Segments</em>'.
   * @see org.thingml.xtext.thingML.ExternStatement#getSegments()
   * @see #getExternStatement()
   * @generated
   */
  EReference getExternStatement_Segments();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.LocalVariable <em>Local Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Variable</em>'.
   * @see org.thingml.xtext.thingML.LocalVariable
   * @generated
   */
  EClass getLocalVariable();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.LocalVariable#isReadonly <em>Readonly</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Readonly</em>'.
   * @see org.thingml.xtext.thingML.LocalVariable#isReadonly()
   * @see #getLocalVariable()
   * @generated
   */
  EAttribute getLocalVariable_Readonly();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.LocalVariable#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see org.thingml.xtext.thingML.LocalVariable#getInit()
   * @see #getLocalVariable()
   * @generated
   */
  EReference getLocalVariable_Init();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.SendAction <em>Send Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Send Action</em>'.
   * @see org.thingml.xtext.thingML.SendAction
   * @generated
   */
  EClass getSendAction();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.SendAction#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Port</em>'.
   * @see org.thingml.xtext.thingML.SendAction#getPort()
   * @see #getSendAction()
   * @generated
   */
  EReference getSendAction_Port();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.SendAction#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Message</em>'.
   * @see org.thingml.xtext.thingML.SendAction#getMessage()
   * @see #getSendAction()
   * @generated
   */
  EReference getSendAction_Message();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.SendAction#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.thingml.xtext.thingML.SendAction#getParameters()
   * @see #getSendAction()
   * @generated
   */
  EReference getSendAction_Parameters();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.VariableAssignment <em>Variable Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Assignment</em>'.
   * @see org.thingml.xtext.thingML.VariableAssignment
   * @generated
   */
  EClass getVariableAssignment();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.VariableAssignment#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see org.thingml.xtext.thingML.VariableAssignment#getProperty()
   * @see #getVariableAssignment()
   * @generated
   */
  EReference getVariableAssignment_Property();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.VariableAssignment#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see org.thingml.xtext.thingML.VariableAssignment#getIndex()
   * @see #getVariableAssignment()
   * @generated
   */
  EReference getVariableAssignment_Index();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.VariableAssignment#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.thingml.xtext.thingML.VariableAssignment#getExpression()
   * @see #getVariableAssignment()
   * @generated
   */
  EReference getVariableAssignment_Expression();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.Increment <em>Increment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Increment</em>'.
   * @see org.thingml.xtext.thingML.Increment
   * @generated
   */
  EClass getIncrement();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.Increment#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see org.thingml.xtext.thingML.Increment#getVar()
   * @see #getIncrement()
   * @generated
   */
  EReference getIncrement_Var();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.Decrement <em>Decrement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decrement</em>'.
   * @see org.thingml.xtext.thingML.Decrement
   * @generated
   */
  EClass getDecrement();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.Decrement#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see org.thingml.xtext.thingML.Decrement#getVar()
   * @see #getDecrement()
   * @generated
   */
  EReference getDecrement_Var();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.ForAction <em>For Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Action</em>'.
   * @see org.thingml.xtext.thingML.ForAction
   * @generated
   */
  EClass getForAction();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.ForAction#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see org.thingml.xtext.thingML.ForAction#getVariable()
   * @see #getForAction()
   * @generated
   */
  EReference getForAction_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.ForAction#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see org.thingml.xtext.thingML.ForAction#getIndex()
   * @see #getForAction()
   * @generated
   */
  EReference getForAction_Index();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.ForAction#getArray <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array</em>'.
   * @see org.thingml.xtext.thingML.ForAction#getArray()
   * @see #getForAction()
   * @generated
   */
  EReference getForAction_Array();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.ForAction#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.thingml.xtext.thingML.ForAction#getAction()
   * @see #getForAction()
   * @generated
   */
  EReference getForAction_Action();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.LoopAction <em>Loop Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop Action</em>'.
   * @see org.thingml.xtext.thingML.LoopAction
   * @generated
   */
  EClass getLoopAction();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.LoopAction#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.thingml.xtext.thingML.LoopAction#getCondition()
   * @see #getLoopAction()
   * @generated
   */
  EReference getLoopAction_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.LoopAction#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.thingml.xtext.thingML.LoopAction#getAction()
   * @see #getLoopAction()
   * @generated
   */
  EReference getLoopAction_Action();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.ConditionalAction <em>Conditional Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Action</em>'.
   * @see org.thingml.xtext.thingML.ConditionalAction
   * @generated
   */
  EClass getConditionalAction();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.ConditionalAction#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.thingml.xtext.thingML.ConditionalAction#getCondition()
   * @see #getConditionalAction()
   * @generated
   */
  EReference getConditionalAction_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.ConditionalAction#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.thingml.xtext.thingML.ConditionalAction#getAction()
   * @see #getConditionalAction()
   * @generated
   */
  EReference getConditionalAction_Action();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.ConditionalAction#getElseAction <em>Else Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Action</em>'.
   * @see org.thingml.xtext.thingML.ConditionalAction#getElseAction()
   * @see #getConditionalAction()
   * @generated
   */
  EReference getConditionalAction_ElseAction();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.ReturnAction <em>Return Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Action</em>'.
   * @see org.thingml.xtext.thingML.ReturnAction
   * @generated
   */
  EClass getReturnAction();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.ReturnAction#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.thingml.xtext.thingML.ReturnAction#getExp()
   * @see #getReturnAction()
   * @generated
   */
  EReference getReturnAction_Exp();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.PrintAction <em>Print Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Print Action</em>'.
   * @see org.thingml.xtext.thingML.PrintAction
   * @generated
   */
  EClass getPrintAction();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.PrintAction#isLine <em>Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Line</em>'.
   * @see org.thingml.xtext.thingML.PrintAction#isLine()
   * @see #getPrintAction()
   * @generated
   */
  EAttribute getPrintAction_Line();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.PrintAction#getMsg <em>Msg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Msg</em>'.
   * @see org.thingml.xtext.thingML.PrintAction#getMsg()
   * @see #getPrintAction()
   * @generated
   */
  EReference getPrintAction_Msg();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.ErrorAction <em>Error Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error Action</em>'.
   * @see org.thingml.xtext.thingML.ErrorAction
   * @generated
   */
  EClass getErrorAction();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.ErrorAction#isLine <em>Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Line</em>'.
   * @see org.thingml.xtext.thingML.ErrorAction#isLine()
   * @see #getErrorAction()
   * @generated
   */
  EAttribute getErrorAction_Line();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.ErrorAction#getMsg <em>Msg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Msg</em>'.
   * @see org.thingml.xtext.thingML.ErrorAction#getMsg()
   * @see #getErrorAction()
   * @generated
   */
  EReference getErrorAction_Msg();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.StartSession <em>Start Session</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Start Session</em>'.
   * @see org.thingml.xtext.thingML.StartSession
   * @generated
   */
  EClass getStartSession();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.StartSession#getSession <em>Session</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Session</em>'.
   * @see org.thingml.xtext.thingML.StartSession#getSession()
   * @see #getStartSession()
   * @generated
   */
  EReference getStartSession_Session();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.FunctionCallStatement <em>Function Call Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Call Statement</em>'.
   * @see org.thingml.xtext.thingML.FunctionCallStatement
   * @generated
   */
  EClass getFunctionCallStatement();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.FunctionCallStatement#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Function</em>'.
   * @see org.thingml.xtext.thingML.FunctionCallStatement#getFunction()
   * @see #getFunctionCallStatement()
   * @generated
   */
  EReference getFunctionCallStatement_Function();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.FunctionCallStatement#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.thingml.xtext.thingML.FunctionCallStatement#getParameters()
   * @see #getFunctionCallStatement()
   * @generated
   */
  EReference getFunctionCallStatement_Parameters();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.DASaveAction <em>DA Save Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DA Save Action</em>'.
   * @see org.thingml.xtext.thingML.DASaveAction
   * @generated
   */
  EClass getDASaveAction();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.DASaveAction#getDataAnalytics <em>Data Analytics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Data Analytics</em>'.
   * @see org.thingml.xtext.thingML.DASaveAction#getDataAnalytics()
   * @see #getDASaveAction()
   * @generated
   */
  EReference getDASaveAction_DataAnalytics();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.DAPreprocessAction <em>DA Preprocess Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DA Preprocess Action</em>'.
   * @see org.thingml.xtext.thingML.DAPreprocessAction
   * @generated
   */
  EClass getDAPreprocessAction();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.DAPreprocessAction#getDataAnalytics <em>Data Analytics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Data Analytics</em>'.
   * @see org.thingml.xtext.thingML.DAPreprocessAction#getDataAnalytics()
   * @see #getDAPreprocessAction()
   * @generated
   */
  EReference getDAPreprocessAction_DataAnalytics();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.DATrainAction <em>DA Train Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DA Train Action</em>'.
   * @see org.thingml.xtext.thingML.DATrainAction
   * @generated
   */
  EClass getDATrainAction();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.DATrainAction#getDataAnalytics <em>Data Analytics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Data Analytics</em>'.
   * @see org.thingml.xtext.thingML.DATrainAction#getDataAnalytics()
   * @see #getDATrainAction()
   * @generated
   */
  EReference getDATrainAction_DataAnalytics();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.DAPredictAction <em>DA Predict Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DA Predict Action</em>'.
   * @see org.thingml.xtext.thingML.DAPredictAction
   * @generated
   */
  EClass getDAPredictAction();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.DAPredictAction#getDataAnalytics <em>Data Analytics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Data Analytics</em>'.
   * @see org.thingml.xtext.thingML.DAPredictAction#getDataAnalytics()
   * @see #getDAPredictAction()
   * @generated
   */
  EReference getDAPredictAction_DataAnalytics();

  /**
   * Returns the meta object for the reference list '{@link org.thingml.xtext.thingML.DAPredictAction#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Features</em>'.
   * @see org.thingml.xtext.thingML.DAPredictAction#getFeatures()
   * @see #getDAPredictAction()
   * @generated
   */
  EReference getDAPredictAction_Features();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.thingml.xtext.thingML.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.ExternExpression <em>Extern Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extern Expression</em>'.
   * @see org.thingml.xtext.thingML.ExternExpression
   * @generated
   */
  EClass getExternExpression();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.ExternExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see org.thingml.xtext.thingML.ExternExpression#getExpression()
   * @see #getExternExpression()
   * @generated
   */
  EAttribute getExternExpression_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.ExternExpression#getSegments <em>Segments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Segments</em>'.
   * @see org.thingml.xtext.thingML.ExternExpression#getSegments()
   * @see #getExternExpression()
   * @generated
   */
  EReference getExternExpression_Segments();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see org.thingml.xtext.thingML.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.ArrayInit <em>Array Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Init</em>'.
   * @see org.thingml.xtext.thingML.ArrayInit
   * @generated
   */
  EClass getArrayInit();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.ArrayInit#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see org.thingml.xtext.thingML.ArrayInit#getValues()
   * @see #getArrayInit()
   * @generated
   */
  EReference getArrayInit_Values();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.EnumLiteralRef <em>Enum Literal Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Literal Ref</em>'.
   * @see org.thingml.xtext.thingML.EnumLiteralRef
   * @generated
   */
  EClass getEnumLiteralRef();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.EnumLiteralRef#getEnum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Enum</em>'.
   * @see org.thingml.xtext.thingML.EnumLiteralRef#getEnum()
   * @see #getEnumLiteralRef()
   * @generated
   */
  EReference getEnumLiteralRef_Enum();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.EnumLiteralRef#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Literal</em>'.
   * @see org.thingml.xtext.thingML.EnumLiteralRef#getLiteral()
   * @see #getEnumLiteralRef()
   * @generated
   */
  EReference getEnumLiteralRef_Literal();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.ByteLiteral <em>Byte Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Byte Literal</em>'.
   * @see org.thingml.xtext.thingML.ByteLiteral
   * @generated
   */
  EClass getByteLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.ByteLiteral#getByteValue <em>Byte Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Byte Value</em>'.
   * @see org.thingml.xtext.thingML.ByteLiteral#getByteValue()
   * @see #getByteLiteral()
   * @generated
   */
  EAttribute getByteLiteral_ByteValue();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.CharLiteral <em>Char Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Char Literal</em>'.
   * @see org.thingml.xtext.thingML.CharLiteral
   * @generated
   */
  EClass getCharLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.CharLiteral#getCharValue <em>Char Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Char Value</em>'.
   * @see org.thingml.xtext.thingML.CharLiteral#getCharValue()
   * @see #getCharLiteral()
   * @generated
   */
  EAttribute getCharLiteral_CharValue();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.IntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Literal</em>'.
   * @see org.thingml.xtext.thingML.IntegerLiteral
   * @generated
   */
  EClass getIntegerLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.IntegerLiteral#getIntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int Value</em>'.
   * @see org.thingml.xtext.thingML.IntegerLiteral#getIntValue()
   * @see #getIntegerLiteral()
   * @generated
   */
  EAttribute getIntegerLiteral_IntValue();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see org.thingml.xtext.thingML.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.BooleanLiteral#isBoolValue <em>Bool Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bool Value</em>'.
   * @see org.thingml.xtext.thingML.BooleanLiteral#isBoolValue()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_BoolValue();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see org.thingml.xtext.thingML.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.StringLiteral#getStringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String Value</em>'.
   * @see org.thingml.xtext.thingML.StringLiteral#getStringValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_StringValue();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.DoubleLiteral <em>Double Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Literal</em>'.
   * @see org.thingml.xtext.thingML.DoubleLiteral
   * @generated
   */
  EClass getDoubleLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.DoubleLiteral#getDoubleValue <em>Double Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Double Value</em>'.
   * @see org.thingml.xtext.thingML.DoubleLiteral#getDoubleValue()
   * @see #getDoubleLiteral()
   * @generated
   */
  EAttribute getDoubleLiteral_DoubleValue();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.PropertyReference <em>Property Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Reference</em>'.
   * @see org.thingml.xtext.thingML.PropertyReference
   * @generated
   */
  EClass getPropertyReference();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.PropertyReference#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see org.thingml.xtext.thingML.PropertyReference#getProperty()
   * @see #getPropertyReference()
   * @generated
   */
  EReference getPropertyReference_Property();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.EventReference <em>Event Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Reference</em>'.
   * @see org.thingml.xtext.thingML.EventReference
   * @generated
   */
  EClass getEventReference();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.EventReference#getReceiveMsg <em>Receive Msg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Receive Msg</em>'.
   * @see org.thingml.xtext.thingML.EventReference#getReceiveMsg()
   * @see #getEventReference()
   * @generated
   */
  EReference getEventReference_ReceiveMsg();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.EventReference#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parameter</em>'.
   * @see org.thingml.xtext.thingML.EventReference#getParameter()
   * @see #getEventReference()
   * @generated
   */
  EReference getEventReference_Parameter();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.FunctionCallExpression <em>Function Call Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Call Expression</em>'.
   * @see org.thingml.xtext.thingML.FunctionCallExpression
   * @generated
   */
  EClass getFunctionCallExpression();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.FunctionCallExpression#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Function</em>'.
   * @see org.thingml.xtext.thingML.FunctionCallExpression#getFunction()
   * @see #getFunctionCallExpression()
   * @generated
   */
  EReference getFunctionCallExpression_Function();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.FunctionCallExpression#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.thingml.xtext.thingML.FunctionCallExpression#getParameters()
   * @see #getFunctionCallExpression()
   * @generated
   */
  EReference getFunctionCallExpression_Parameters();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.Configuration <em>Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Configuration</em>'.
   * @see org.thingml.xtext.thingML.Configuration
   * @generated
   */
  EClass getConfiguration();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.Configuration#getInstances <em>Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instances</em>'.
   * @see org.thingml.xtext.thingML.Configuration#getInstances()
   * @see #getConfiguration()
   * @generated
   */
  EReference getConfiguration_Instances();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.Configuration#getConnectors <em>Connectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Connectors</em>'.
   * @see org.thingml.xtext.thingML.Configuration#getConnectors()
   * @see #getConfiguration()
   * @generated
   */
  EReference getConfiguration_Connectors();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.Configuration#getPropassigns <em>Propassigns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Propassigns</em>'.
   * @see org.thingml.xtext.thingML.Configuration#getPropassigns()
   * @see #getConfiguration()
   * @generated
   */
  EReference getConfiguration_Propassigns();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.Instance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance</em>'.
   * @see org.thingml.xtext.thingML.Instance
   * @generated
   */
  EClass getInstance();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.Instance#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.thingml.xtext.thingML.Instance#getType()
   * @see #getInstance()
   * @generated
   */
  EReference getInstance_Type();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.ConfigPropertyAssign <em>Config Property Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Config Property Assign</em>'.
   * @see org.thingml.xtext.thingML.ConfigPropertyAssign
   * @generated
   */
  EClass getConfigPropertyAssign();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.ConfigPropertyAssign#getInstance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Instance</em>'.
   * @see org.thingml.xtext.thingML.ConfigPropertyAssign#getInstance()
   * @see #getConfigPropertyAssign()
   * @generated
   */
  EReference getConfigPropertyAssign_Instance();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.ConfigPropertyAssign#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see org.thingml.xtext.thingML.ConfigPropertyAssign#getProperty()
   * @see #getConfigPropertyAssign()
   * @generated
   */
  EReference getConfigPropertyAssign_Property();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.ConfigPropertyAssign#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see org.thingml.xtext.thingML.ConfigPropertyAssign#getIndex()
   * @see #getConfigPropertyAssign()
   * @generated
   */
  EReference getConfigPropertyAssign_Index();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.ConfigPropertyAssign#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see org.thingml.xtext.thingML.ConfigPropertyAssign#getInit()
   * @see #getConfigPropertyAssign()
   * @generated
   */
  EReference getConfigPropertyAssign_Init();

  /**
   * Returns the meta object for the containment reference list '{@link org.thingml.xtext.thingML.ConfigPropertyAssign#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see org.thingml.xtext.thingML.ConfigPropertyAssign#getAnnotations()
   * @see #getConfigPropertyAssign()
   * @generated
   */
  EReference getConfigPropertyAssign_Annotations();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.AbstractConnector <em>Abstract Connector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Connector</em>'.
   * @see org.thingml.xtext.thingML.AbstractConnector
   * @generated
   */
  EClass getAbstractConnector();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.Connector <em>Connector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connector</em>'.
   * @see org.thingml.xtext.thingML.Connector
   * @generated
   */
  EClass getConnector();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.Connector#getCli <em>Cli</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Cli</em>'.
   * @see org.thingml.xtext.thingML.Connector#getCli()
   * @see #getConnector()
   * @generated
   */
  EReference getConnector_Cli();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.Connector#getRequired <em>Required</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Required</em>'.
   * @see org.thingml.xtext.thingML.Connector#getRequired()
   * @see #getConnector()
   * @generated
   */
  EReference getConnector_Required();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.Connector#getSrv <em>Srv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Srv</em>'.
   * @see org.thingml.xtext.thingML.Connector#getSrv()
   * @see #getConnector()
   * @generated
   */
  EReference getConnector_Srv();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.Connector#getProvided <em>Provided</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Provided</em>'.
   * @see org.thingml.xtext.thingML.Connector#getProvided()
   * @see #getConnector()
   * @generated
   */
  EReference getConnector_Provided();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.ExternalConnector <em>External Connector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Connector</em>'.
   * @see org.thingml.xtext.thingML.ExternalConnector
   * @generated
   */
  EClass getExternalConnector();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.ExternalConnector#getInst <em>Inst</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Inst</em>'.
   * @see org.thingml.xtext.thingML.ExternalConnector#getInst()
   * @see #getExternalConnector()
   * @generated
   */
  EReference getExternalConnector_Inst();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.ExternalConnector#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Port</em>'.
   * @see org.thingml.xtext.thingML.ExternalConnector#getPort()
   * @see #getExternalConnector()
   * @generated
   */
  EReference getExternalConnector_Port();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.ExternalConnector#getProtocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Protocol</em>'.
   * @see org.thingml.xtext.thingML.ExternalConnector#getProtocol()
   * @see #getExternalConnector()
   * @generated
   */
  EReference getExternalConnector_Protocol();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Expression</em>'.
   * @see org.thingml.xtext.thingML.OrExpression
   * @generated
   */
  EClass getOrExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.OrExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.thingml.xtext.thingML.OrExpression#getLhs()
   * @see #getOrExpression()
   * @generated
   */
  EReference getOrExpression_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.OrExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see org.thingml.xtext.thingML.OrExpression#getRhs()
   * @see #getOrExpression()
   * @generated
   */
  EReference getOrExpression_Rhs();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expression</em>'.
   * @see org.thingml.xtext.thingML.AndExpression
   * @generated
   */
  EClass getAndExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.AndExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.thingml.xtext.thingML.AndExpression#getLhs()
   * @see #getAndExpression()
   * @generated
   */
  EReference getAndExpression_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.AndExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see org.thingml.xtext.thingML.AndExpression#getRhs()
   * @see #getAndExpression()
   * @generated
   */
  EReference getAndExpression_Rhs();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.EqualsExpression <em>Equals Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equals Expression</em>'.
   * @see org.thingml.xtext.thingML.EqualsExpression
   * @generated
   */
  EClass getEqualsExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.EqualsExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.thingml.xtext.thingML.EqualsExpression#getLhs()
   * @see #getEqualsExpression()
   * @generated
   */
  EReference getEqualsExpression_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.EqualsExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see org.thingml.xtext.thingML.EqualsExpression#getRhs()
   * @see #getEqualsExpression()
   * @generated
   */
  EReference getEqualsExpression_Rhs();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.NotEqualsExpression <em>Not Equals Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Equals Expression</em>'.
   * @see org.thingml.xtext.thingML.NotEqualsExpression
   * @generated
   */
  EClass getNotEqualsExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NotEqualsExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.thingml.xtext.thingML.NotEqualsExpression#getLhs()
   * @see #getNotEqualsExpression()
   * @generated
   */
  EReference getNotEqualsExpression_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NotEqualsExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see org.thingml.xtext.thingML.NotEqualsExpression#getRhs()
   * @see #getNotEqualsExpression()
   * @generated
   */
  EReference getNotEqualsExpression_Rhs();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.GreaterExpression <em>Greater Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greater Expression</em>'.
   * @see org.thingml.xtext.thingML.GreaterExpression
   * @generated
   */
  EClass getGreaterExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.GreaterExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.thingml.xtext.thingML.GreaterExpression#getLhs()
   * @see #getGreaterExpression()
   * @generated
   */
  EReference getGreaterExpression_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.GreaterExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see org.thingml.xtext.thingML.GreaterExpression#getRhs()
   * @see #getGreaterExpression()
   * @generated
   */
  EReference getGreaterExpression_Rhs();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.LowerExpression <em>Lower Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lower Expression</em>'.
   * @see org.thingml.xtext.thingML.LowerExpression
   * @generated
   */
  EClass getLowerExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.LowerExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.thingml.xtext.thingML.LowerExpression#getLhs()
   * @see #getLowerExpression()
   * @generated
   */
  EReference getLowerExpression_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.LowerExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see org.thingml.xtext.thingML.LowerExpression#getRhs()
   * @see #getLowerExpression()
   * @generated
   */
  EReference getLowerExpression_Rhs();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.GreaterOrEqualExpression <em>Greater Or Equal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greater Or Equal Expression</em>'.
   * @see org.thingml.xtext.thingML.GreaterOrEqualExpression
   * @generated
   */
  EClass getGreaterOrEqualExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.GreaterOrEqualExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.thingml.xtext.thingML.GreaterOrEqualExpression#getLhs()
   * @see #getGreaterOrEqualExpression()
   * @generated
   */
  EReference getGreaterOrEqualExpression_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.GreaterOrEqualExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see org.thingml.xtext.thingML.GreaterOrEqualExpression#getRhs()
   * @see #getGreaterOrEqualExpression()
   * @generated
   */
  EReference getGreaterOrEqualExpression_Rhs();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.LowerOrEqualExpression <em>Lower Or Equal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lower Or Equal Expression</em>'.
   * @see org.thingml.xtext.thingML.LowerOrEqualExpression
   * @generated
   */
  EClass getLowerOrEqualExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.LowerOrEqualExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.thingml.xtext.thingML.LowerOrEqualExpression#getLhs()
   * @see #getLowerOrEqualExpression()
   * @generated
   */
  EReference getLowerOrEqualExpression_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.LowerOrEqualExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see org.thingml.xtext.thingML.LowerOrEqualExpression#getRhs()
   * @see #getLowerOrEqualExpression()
   * @generated
   */
  EReference getLowerOrEqualExpression_Rhs();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.PlusExpression <em>Plus Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus Expression</em>'.
   * @see org.thingml.xtext.thingML.PlusExpression
   * @generated
   */
  EClass getPlusExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.PlusExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.thingml.xtext.thingML.PlusExpression#getLhs()
   * @see #getPlusExpression()
   * @generated
   */
  EReference getPlusExpression_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.PlusExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see org.thingml.xtext.thingML.PlusExpression#getRhs()
   * @see #getPlusExpression()
   * @generated
   */
  EReference getPlusExpression_Rhs();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.MinusExpression <em>Minus Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus Expression</em>'.
   * @see org.thingml.xtext.thingML.MinusExpression
   * @generated
   */
  EClass getMinusExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.MinusExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.thingml.xtext.thingML.MinusExpression#getLhs()
   * @see #getMinusExpression()
   * @generated
   */
  EReference getMinusExpression_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.MinusExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see org.thingml.xtext.thingML.MinusExpression#getRhs()
   * @see #getMinusExpression()
   * @generated
   */
  EReference getMinusExpression_Rhs();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.TimesExpression <em>Times Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Times Expression</em>'.
   * @see org.thingml.xtext.thingML.TimesExpression
   * @generated
   */
  EClass getTimesExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.TimesExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.thingml.xtext.thingML.TimesExpression#getLhs()
   * @see #getTimesExpression()
   * @generated
   */
  EReference getTimesExpression_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.TimesExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see org.thingml.xtext.thingML.TimesExpression#getRhs()
   * @see #getTimesExpression()
   * @generated
   */
  EReference getTimesExpression_Rhs();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.DivExpression <em>Div Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div Expression</em>'.
   * @see org.thingml.xtext.thingML.DivExpression
   * @generated
   */
  EClass getDivExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.DivExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.thingml.xtext.thingML.DivExpression#getLhs()
   * @see #getDivExpression()
   * @generated
   */
  EReference getDivExpression_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.DivExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see org.thingml.xtext.thingML.DivExpression#getRhs()
   * @see #getDivExpression()
   * @generated
   */
  EReference getDivExpression_Rhs();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.ModExpression <em>Mod Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mod Expression</em>'.
   * @see org.thingml.xtext.thingML.ModExpression
   * @generated
   */
  EClass getModExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.ModExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.thingml.xtext.thingML.ModExpression#getLhs()
   * @see #getModExpression()
   * @generated
   */
  EReference getModExpression_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.ModExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see org.thingml.xtext.thingML.ModExpression#getRhs()
   * @see #getModExpression()
   * @generated
   */
  EReference getModExpression_Rhs();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.CastExpression <em>Cast Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cast Expression</em>'.
   * @see org.thingml.xtext.thingML.CastExpression
   * @generated
   */
  EClass getCastExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.CastExpression#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term</em>'.
   * @see org.thingml.xtext.thingML.CastExpression#getTerm()
   * @see #getCastExpression()
   * @generated
   */
  EReference getCastExpression_Term();

  /**
   * Returns the meta object for the reference '{@link org.thingml.xtext.thingML.CastExpression#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.thingml.xtext.thingML.CastExpression#getType()
   * @see #getCastExpression()
   * @generated
   */
  EReference getCastExpression_Type();

  /**
   * Returns the meta object for the attribute '{@link org.thingml.xtext.thingML.CastExpression#isIsArray <em>Is Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Array</em>'.
   * @see org.thingml.xtext.thingML.CastExpression#isIsArray()
   * @see #getCastExpression()
   * @generated
   */
  EAttribute getCastExpression_IsArray();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.ExpressionGroup <em>Expression Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Group</em>'.
   * @see org.thingml.xtext.thingML.ExpressionGroup
   * @generated
   */
  EClass getExpressionGroup();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.ExpressionGroup#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term</em>'.
   * @see org.thingml.xtext.thingML.ExpressionGroup#getTerm()
   * @see #getExpressionGroup()
   * @generated
   */
  EReference getExpressionGroup_Term();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.NotExpression <em>Not Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Expression</em>'.
   * @see org.thingml.xtext.thingML.NotExpression
   * @generated
   */
  EClass getNotExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.NotExpression#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term</em>'.
   * @see org.thingml.xtext.thingML.NotExpression#getTerm()
   * @see #getNotExpression()
   * @generated
   */
  EReference getNotExpression_Term();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.UnaryMinus <em>Unary Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Minus</em>'.
   * @see org.thingml.xtext.thingML.UnaryMinus
   * @generated
   */
  EClass getUnaryMinus();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.UnaryMinus#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term</em>'.
   * @see org.thingml.xtext.thingML.UnaryMinus#getTerm()
   * @see #getUnaryMinus()
   * @generated
   */
  EReference getUnaryMinus_Term();

  /**
   * Returns the meta object for class '{@link org.thingml.xtext.thingML.ArrayIndex <em>Array Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Index</em>'.
   * @see org.thingml.xtext.thingML.ArrayIndex
   * @generated
   */
  EClass getArrayIndex();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.ArrayIndex#getArray <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array</em>'.
   * @see org.thingml.xtext.thingML.ArrayIndex#getArray()
   * @see #getArrayIndex()
   * @generated
   */
  EReference getArrayIndex_Array();

  /**
   * Returns the meta object for the containment reference '{@link org.thingml.xtext.thingML.ArrayIndex#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see org.thingml.xtext.thingML.ArrayIndex#getIndex()
   * @see #getArrayIndex()
   * @generated
   */
  EReference getArrayIndex_Index();

  /**
   * Returns the meta object for enum '{@link org.thingml.xtext.thingML.AutoML <em>Auto ML</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Auto ML</em>'.
   * @see org.thingml.xtext.thingML.AutoML
   * @generated
   */
  EEnum getAutoML();

  /**
   * Returns the meta object for enum '{@link org.thingml.xtext.thingML.Sequential <em>Sequential</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Sequential</em>'.
   * @see org.thingml.xtext.thingML.Sequential
   * @generated
   */
  EEnum getSequential();

  /**
   * Returns the meta object for enum '{@link org.thingml.xtext.thingML.Timestamps <em>Timestamps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Timestamps</em>'.
   * @see org.thingml.xtext.thingML.Timestamps
   * @generated
   */
  EEnum getTimestamps();

  /**
   * Returns the meta object for enum '{@link org.thingml.xtext.thingML.Labels <em>Labels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Labels</em>'.
   * @see org.thingml.xtext.thingML.Labels
   * @generated
   */
  EEnum getLabels();

  /**
   * Returns the meta object for enum '{@link org.thingml.xtext.thingML.Preprocess_feature_scaling <em>Preprocess feature scaling</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Preprocess feature scaling</em>'.
   * @see org.thingml.xtext.thingML.Preprocess_feature_scaling
   * @generated
   */
  EEnum getPreprocess_feature_scaling();

  /**
   * Returns the meta object for enum '{@link org.thingml.xtext.thingML.Penalty <em>Penalty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Penalty</em>'.
   * @see org.thingml.xtext.thingML.Penalty
   * @generated
   */
  EEnum getPenalty();

  /**
   * Returns the meta object for enum '{@link org.thingml.xtext.thingML.Optimizer <em>Optimizer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Optimizer</em>'.
   * @see org.thingml.xtext.thingML.Optimizer
   * @generated
   */
  EEnum getOptimizer();

  /**
   * Returns the meta object for enum '{@link org.thingml.xtext.thingML.Multi_class <em>Multi class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Multi class</em>'.
   * @see org.thingml.xtext.thingML.Multi_class
   * @generated
   */
  EEnum getMulti_class();

  /**
   * Returns the meta object for enum '{@link org.thingml.xtext.thingML.DecisionTreeRegressorCriterion <em>Decision Tree Regressor Criterion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Decision Tree Regressor Criterion</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeRegressorCriterion
   * @generated
   */
  EEnum getDecisionTreeRegressorCriterion();

  /**
   * Returns the meta object for enum '{@link org.thingml.xtext.thingML.DecisionTreeClassifierCriterion <em>Decision Tree Classifier Criterion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Decision Tree Classifier Criterion</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeClassifierCriterion
   * @generated
   */
  EEnum getDecisionTreeClassifierCriterion();

  /**
   * Returns the meta object for enum '{@link org.thingml.xtext.thingML.DecisionTreeSplitter <em>Decision Tree Splitter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Decision Tree Splitter</em>'.
   * @see org.thingml.xtext.thingML.DecisionTreeSplitter
   * @generated
   */
  EEnum getDecisionTreeSplitter();

  /**
   * Returns the meta object for enum '{@link org.thingml.xtext.thingML.Max_features_enum <em>Max features enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Max features enum</em>'.
   * @see org.thingml.xtext.thingML.Max_features_enum
   * @generated
   */
  EEnum getMax_features_enum();

  /**
   * Returns the meta object for enum '{@link org.thingml.xtext.thingML.RandomForestRegressorCriterion <em>Random Forest Regressor Criterion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Random Forest Regressor Criterion</em>'.
   * @see org.thingml.xtext.thingML.RandomForestRegressorCriterion
   * @generated
   */
  EEnum getRandomForestRegressorCriterion();

  /**
   * Returns the meta object for enum '{@link org.thingml.xtext.thingML.RandomForestClassifierCriterion <em>Random Forest Classifier Criterion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Random Forest Classifier Criterion</em>'.
   * @see org.thingml.xtext.thingML.RandomForestClassifierCriterion
   * @generated
   */
  EEnum getRandomForestClassifierCriterion();

  /**
   * Returns the meta object for enum '{@link org.thingml.xtext.thingML.Activation <em>Activation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Activation</em>'.
   * @see org.thingml.xtext.thingML.Activation
   * @generated
   */
  EEnum getActivation();

  /**
   * Returns the meta object for enum '{@link org.thingml.xtext.thingML.Learning_rate_mode <em>Learning rate mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Learning rate mode</em>'.
   * @see org.thingml.xtext.thingML.Learning_rate_mode
   * @generated
   */
  EEnum getLearning_rate_mode();

  /**
   * Returns the meta object for enum '{@link org.thingml.xtext.thingML.Loss <em>Loss</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Loss</em>'.
   * @see org.thingml.xtext.thingML.Loss
   * @generated
   */
  EEnum getLoss();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ThingMLFactory getThingMLFactory();

} //ThingMLPackage
