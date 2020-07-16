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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.thingml.xtext.thingML.DecisionTree;
import org.thingml.xtext.thingML.LossFunction;
import org.thingml.xtext.thingML.MinSamplesSplit;
import org.thingml.xtext.thingML.ThingMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Tree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.impl.DecisionTreeImpl#getLossFunction <em>Loss Function</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.DecisionTreeImpl#getMin_samples_split <em>Min samples split</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionTreeImpl extends ML2_ModelAlgorithmImpl implements DecisionTree
{
  /**
	 * The default value of the '{@link #getLossFunction() <em>Loss Function</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLossFunction()
	 * @generated
	 * @ordered
	 */
  protected static final LossFunction LOSS_FUNCTION_EDEFAULT = LossFunction.MSE;

  /**
	 * The cached value of the '{@link #getLossFunction() <em>Loss Function</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLossFunction()
	 * @generated
	 * @ordered
	 */
  protected LossFunction lossFunction = LOSS_FUNCTION_EDEFAULT;

  /**
	 * The cached value of the '{@link #getMin_samples_split() <em>Min samples split</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMin_samples_split()
	 * @generated
	 * @ordered
	 */
  protected MinSamplesSplit min_samples_split;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DecisionTreeImpl()
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
		return ThingMLPackage.Literals.DECISION_TREE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public LossFunction getLossFunction()
  {
		return lossFunction;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setLossFunction(LossFunction newLossFunction)
  {
		LossFunction oldLossFunction = lossFunction;
		lossFunction = newLossFunction == null ? LOSS_FUNCTION_EDEFAULT : newLossFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE__LOSS_FUNCTION, oldLossFunction, lossFunction));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public MinSamplesSplit getMin_samples_split()
  {
		return min_samples_split;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetMin_samples_split(MinSamplesSplit newMin_samples_split, NotificationChain msgs)
  {
		MinSamplesSplit oldMin_samples_split = min_samples_split;
		min_samples_split = newMin_samples_split;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE__MIN_SAMPLES_SPLIT, oldMin_samples_split, newMin_samples_split);
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
		public void setMin_samples_split(MinSamplesSplit newMin_samples_split)
  {
		if (newMin_samples_split != min_samples_split) {
			NotificationChain msgs = null;
			if (min_samples_split != null)
				msgs = ((InternalEObject)min_samples_split).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.DECISION_TREE__MIN_SAMPLES_SPLIT, null, msgs);
			if (newMin_samples_split != null)
				msgs = ((InternalEObject)newMin_samples_split).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.DECISION_TREE__MIN_SAMPLES_SPLIT, null, msgs);
			msgs = basicSetMin_samples_split(newMin_samples_split, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE__MIN_SAMPLES_SPLIT, newMin_samples_split, newMin_samples_split));
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
			case ThingMLPackage.DECISION_TREE__MIN_SAMPLES_SPLIT:
				return basicSetMin_samples_split(null, msgs);
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
			case ThingMLPackage.DECISION_TREE__LOSS_FUNCTION:
				return getLossFunction();
			case ThingMLPackage.DECISION_TREE__MIN_SAMPLES_SPLIT:
				return getMin_samples_split();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ThingMLPackage.DECISION_TREE__LOSS_FUNCTION:
				setLossFunction((LossFunction)newValue);
				return;
			case ThingMLPackage.DECISION_TREE__MIN_SAMPLES_SPLIT:
				setMin_samples_split((MinSamplesSplit)newValue);
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
			case ThingMLPackage.DECISION_TREE__LOSS_FUNCTION:
				setLossFunction(LOSS_FUNCTION_EDEFAULT);
				return;
			case ThingMLPackage.DECISION_TREE__MIN_SAMPLES_SPLIT:
				setMin_samples_split((MinSamplesSplit)null);
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
			case ThingMLPackage.DECISION_TREE__LOSS_FUNCTION:
				return lossFunction != LOSS_FUNCTION_EDEFAULT;
			case ThingMLPackage.DECISION_TREE__MIN_SAMPLES_SPLIT:
				return min_samples_split != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (lossFunction: ");
		result.append(lossFunction);
		result.append(')');
		return result.toString();
	}

} //DecisionTreeImpl
