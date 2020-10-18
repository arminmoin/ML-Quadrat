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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Random Forest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.RandomForest#getRandomForestCriterion <em>Random Forest Criterion</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.RandomForest#getMin_samples_split <em>Min samples split</em>}</li>
 * </ul>
 *
 * @see org.thingml.xtext.thingML.ThingMLPackage#getRandomForest()
 * @model
 * @generated
 */
public interface RandomForest extends ML2_ModelAlgorithm
{
  /**
   * Returns the value of the '<em><b>Random Forest Criterion</b></em>' attribute.
   * The literals are from the enumeration {@link org.thingml.xtext.thingML.RandomForestCriterion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Random Forest Criterion</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Random Forest Criterion</em>' attribute.
   * @see org.thingml.xtext.thingML.RandomForestCriterion
   * @see #setRandomForestCriterion(RandomForestCriterion)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getRandomForest_RandomForestCriterion()
   * @model
   * @generated
   */
  RandomForestCriterion getRandomForestCriterion();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.RandomForest#getRandomForestCriterion <em>Random Forest Criterion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Random Forest Criterion</em>' attribute.
   * @see org.thingml.xtext.thingML.RandomForestCriterion
   * @see #getRandomForestCriterion()
   * @generated
   */
  void setRandomForestCriterion(RandomForestCriterion value);

  /**
   * Returns the value of the '<em><b>Min samples split</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min samples split</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min samples split</em>' attribute.
   * @see #setMin_samples_split(String)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getRandomForest_Min_samples_split()
   * @model
   * @generated
   */
  String getMin_samples_split();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.RandomForest#getMin_samples_split <em>Min samples split</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min samples split</em>' attribute.
   * @see #getMin_samples_split()
   * @generated
   */
  void setMin_samples_split(String value);

} // RandomForest
