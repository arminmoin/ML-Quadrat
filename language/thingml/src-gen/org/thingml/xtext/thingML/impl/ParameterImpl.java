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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.thingml.xtext.thingML.AnnotatedElement;
import org.thingml.xtext.thingML.MessageParameter;
import org.thingml.xtext.thingML.Parameter;
import org.thingml.xtext.thingML.PlatformAnnotation;
import org.thingml.xtext.thingML.ThingMLPackage;
import org.thingml.xtext.thingML.TypeRef;
import org.thingml.xtext.thingML.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.impl.ParameterImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.ParameterImpl#getTypeRef <em>Type Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends NamedElementImpl implements Parameter
{
  /**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
  protected EList<PlatformAnnotation> annotations;

  /**
	 * The cached value of the '{@link #getTypeRef() <em>Type Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTypeRef()
	 * @generated
	 * @ordered
	 */
  protected TypeRef typeRef;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ParameterImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return ThingMLPackage.Literals.PARAMETER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EList<PlatformAnnotation> getAnnotations()
  {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<PlatformAnnotation>(PlatformAnnotation.class, this, ThingMLPackage.PARAMETER__ANNOTATIONS);
		}
		return annotations;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public TypeRef getTypeRef()
  {
		return typeRef;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetTypeRef(TypeRef newTypeRef, NotificationChain msgs)
  {
		TypeRef oldTypeRef = typeRef;
		typeRef = newTypeRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.PARAMETER__TYPE_REF, oldTypeRef, newTypeRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setTypeRef(TypeRef newTypeRef)
  {
		if (newTypeRef != typeRef) {
			NotificationChain msgs = null;
			if (typeRef != null)
				msgs = ((InternalEObject)typeRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.PARAMETER__TYPE_REF, null, msgs);
			if (newTypeRef != null)
				msgs = ((InternalEObject)newTypeRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.PARAMETER__TYPE_REF, null, msgs);
			msgs = basicSetTypeRef(newTypeRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.PARAMETER__TYPE_REF, newTypeRef, newTypeRef));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case ThingMLPackage.PARAMETER__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case ThingMLPackage.PARAMETER__TYPE_REF:
				return basicSetTypeRef(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case ThingMLPackage.PARAMETER__ANNOTATIONS:
				return getAnnotations();
			case ThingMLPackage.PARAMETER__TYPE_REF:
				return getTypeRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ThingMLPackage.PARAMETER__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends PlatformAnnotation>)newValue);
				return;
			case ThingMLPackage.PARAMETER__TYPE_REF:
				setTypeRef((TypeRef)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case ThingMLPackage.PARAMETER__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case ThingMLPackage.PARAMETER__TYPE_REF:
				setTypeRef((TypeRef)null);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case ThingMLPackage.PARAMETER__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case ThingMLPackage.PARAMETER__TYPE_REF:
				return typeRef != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
		if (baseClass == AnnotatedElement.class) {
			switch (derivedFeatureID) {
				case ThingMLPackage.PARAMETER__ANNOTATIONS: return ThingMLPackage.ANNOTATED_ELEMENT__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == Variable.class) {
			switch (derivedFeatureID) {
				case ThingMLPackage.PARAMETER__TYPE_REF: return ThingMLPackage.VARIABLE__TYPE_REF;
				default: return -1;
			}
		}
		if (baseClass == MessageParameter.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
		if (baseClass == AnnotatedElement.class) {
			switch (baseFeatureID) {
				case ThingMLPackage.ANNOTATED_ELEMENT__ANNOTATIONS: return ThingMLPackage.PARAMETER__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == Variable.class) {
			switch (baseFeatureID) {
				case ThingMLPackage.VARIABLE__TYPE_REF: return ThingMLPackage.PARAMETER__TYPE_REF;
				default: return -1;
			}
		}
		if (baseClass == MessageParameter.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ParameterImpl
