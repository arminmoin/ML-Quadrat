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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.thingml.xtext.thingML.DecisionTree;
import org.thingml.xtext.thingML.DecisionTreeCriterion;
import org.thingml.xtext.thingML.ThingMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Tree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.impl.DecisionTreeImpl#getDecisionTreeCriterion <em>Decision Tree Criterion</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.DecisionTreeImpl#getMin_samples_split <em>Min samples split</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionTreeImpl extends ML2_ModelAlgorithmImpl implements DecisionTree
{
  /**
	 * The default value of the '{@link #getDecisionTreeCriterion() <em>Decision Tree Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDecisionTreeCriterion()
	 * @generated
	 * @ordered
	 */
  protected static final DecisionTreeCriterion DECISION_TREE_CRITERION_EDEFAULT = DecisionTreeCriterion.NO_IDEA;

  /**
	 * The cached value of the '{@link #getDecisionTreeCriterion() <em>Decision Tree Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDecisionTreeCriterion()
	 * @generated
	 * @ordered
	 */
  protected DecisionTreeCriterion decisionTreeCriterion = DECISION_TREE_CRITERION_EDEFAULT;

  /**
	 * The default value of the '{@link #getMin_samples_split() <em>Min samples split</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMin_samples_split()
	 * @generated
	 * @ordered
	 */
  protected static final String MIN_SAMPLES_SPLIT_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getMin_samples_split() <em>Min samples split</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMin_samples_split()
	 * @generated
	 * @ordered
	 */
  protected String min_samples_split = MIN_SAMPLES_SPLIT_EDEFAULT;

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
		public DecisionTreeCriterion getDecisionTreeCriterion()
  {
		return decisionTreeCriterion;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setDecisionTreeCriterion(DecisionTreeCriterion newDecisionTreeCriterion)
  {
		DecisionTreeCriterion oldDecisionTreeCriterion = decisionTreeCriterion;
		decisionTreeCriterion = newDecisionTreeCriterion == null ? DECISION_TREE_CRITERION_EDEFAULT : newDecisionTreeCriterion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE__DECISION_TREE_CRITERION, oldDecisionTreeCriterion, decisionTreeCriterion));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public String getMin_samples_split()
  {
		return min_samples_split;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setMin_samples_split(String newMin_samples_split)
  {
		String oldMin_samples_split = min_samples_split;
		min_samples_split = newMin_samples_split;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE__MIN_SAMPLES_SPLIT, oldMin_samples_split, min_samples_split));
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
			case ThingMLPackage.DECISION_TREE__DECISION_TREE_CRITERION:
				return getDecisionTreeCriterion();
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
			case ThingMLPackage.DECISION_TREE__DECISION_TREE_CRITERION:
				setDecisionTreeCriterion((DecisionTreeCriterion)newValue);
				return;
			case ThingMLPackage.DECISION_TREE__MIN_SAMPLES_SPLIT:
				setMin_samples_split((String)newValue);
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
			case ThingMLPackage.DECISION_TREE__DECISION_TREE_CRITERION:
				setDecisionTreeCriterion(DECISION_TREE_CRITERION_EDEFAULT);
				return;
			case ThingMLPackage.DECISION_TREE__MIN_SAMPLES_SPLIT:
				setMin_samples_split(MIN_SAMPLES_SPLIT_EDEFAULT);
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
			case ThingMLPackage.DECISION_TREE__DECISION_TREE_CRITERION:
				return decisionTreeCriterion != DECISION_TREE_CRITERION_EDEFAULT;
			case ThingMLPackage.DECISION_TREE__MIN_SAMPLES_SPLIT:
				return MIN_SAMPLES_SPLIT_EDEFAULT == null ? min_samples_split != null : !MIN_SAMPLES_SPLIT_EDEFAULT.equals(min_samples_split);
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
		result.append(" (decisionTreeCriterion: ");
		result.append(decisionTreeCriterion);
		result.append(", min_samples_split: ");
		result.append(min_samples_split);
		result.append(')');
		return result.toString();
	}

} //DecisionTreeImpl
