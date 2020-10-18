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

import org.thingml.xtext.thingML.RandomForest;
import org.thingml.xtext.thingML.RandomForestCriterion;
import org.thingml.xtext.thingML.ThingMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Random Forest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.impl.RandomForestImpl#getRandomForestCriterion <em>Random Forest Criterion</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.RandomForestImpl#getMin_samples_split <em>Min samples split</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RandomForestImpl extends ML2_ModelAlgorithmImpl implements RandomForest
{
  /**
   * The default value of the '{@link #getRandomForestCriterion() <em>Random Forest Criterion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRandomForestCriterion()
   * @generated
   * @ordered
   */
  protected static final RandomForestCriterion RANDOM_FOREST_CRITERION_EDEFAULT = RandomForestCriterion.NO_IDEA;

  /**
   * The cached value of the '{@link #getRandomForestCriterion() <em>Random Forest Criterion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRandomForestCriterion()
   * @generated
   * @ordered
   */
  protected RandomForestCriterion randomForestCriterion = RANDOM_FOREST_CRITERION_EDEFAULT;

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
  protected RandomForestImpl()
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
    return ThingMLPackage.Literals.RANDOM_FOREST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RandomForestCriterion getRandomForestCriterion()
  {
    return randomForestCriterion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRandomForestCriterion(RandomForestCriterion newRandomForestCriterion)
  {
    RandomForestCriterion oldRandomForestCriterion = randomForestCriterion;
    randomForestCriterion = newRandomForestCriterion == null ? RANDOM_FOREST_CRITERION_EDEFAULT : newRandomForestCriterion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST__RANDOM_FOREST_CRITERION, oldRandomForestCriterion, randomForestCriterion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMin_samples_split()
  {
    return min_samples_split;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMin_samples_split(String newMin_samples_split)
  {
    String oldMin_samples_split = min_samples_split;
    min_samples_split = newMin_samples_split;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST__MIN_SAMPLES_SPLIT, oldMin_samples_split, min_samples_split));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ThingMLPackage.RANDOM_FOREST__RANDOM_FOREST_CRITERION:
        return getRandomForestCriterion();
      case ThingMLPackage.RANDOM_FOREST__MIN_SAMPLES_SPLIT:
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
    switch (featureID)
    {
      case ThingMLPackage.RANDOM_FOREST__RANDOM_FOREST_CRITERION:
        setRandomForestCriterion((RandomForestCriterion)newValue);
        return;
      case ThingMLPackage.RANDOM_FOREST__MIN_SAMPLES_SPLIT:
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
    switch (featureID)
    {
      case ThingMLPackage.RANDOM_FOREST__RANDOM_FOREST_CRITERION:
        setRandomForestCriterion(RANDOM_FOREST_CRITERION_EDEFAULT);
        return;
      case ThingMLPackage.RANDOM_FOREST__MIN_SAMPLES_SPLIT:
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
    switch (featureID)
    {
      case ThingMLPackage.RANDOM_FOREST__RANDOM_FOREST_CRITERION:
        return randomForestCriterion != RANDOM_FOREST_CRITERION_EDEFAULT;
      case ThingMLPackage.RANDOM_FOREST__MIN_SAMPLES_SPLIT:
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (randomForestCriterion: ");
    result.append(randomForestCriterion);
    result.append(", min_samples_split: ");
    result.append(min_samples_split);
    result.append(')');
    return result.toString();
  }

} //RandomForestImpl
