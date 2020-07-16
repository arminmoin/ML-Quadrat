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
 *   <li>{@link org.thingml.xtext.thingML.RandomForest#getLossFunction <em>Loss Function</em>}</li>
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
	 * Returns the value of the '<em><b>Loss Function</b></em>' attribute.
	 * The literals are from the enumeration {@link org.thingml.xtext.thingML.LossFunction}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Loss Function</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Loss Function</em>' attribute.
	 * @see org.thingml.xtext.thingML.LossFunction
	 * @see #setLossFunction(LossFunction)
	 * @see org.thingml.xtext.thingML.ThingMLPackage#getRandomForest_LossFunction()
	 * @model
	 * @generated
	 */
  LossFunction getLossFunction();

  /**
	 * Sets the value of the '{@link org.thingml.xtext.thingML.RandomForest#getLossFunction <em>Loss Function</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loss Function</em>' attribute.
	 * @see org.thingml.xtext.thingML.LossFunction
	 * @see #getLossFunction()
	 * @generated
	 */
  void setLossFunction(LossFunction value);

  /**
	 * Returns the value of the '<em><b>Min samples split</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min samples split</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Min samples split</em>' containment reference.
	 * @see #setMin_samples_split(MinSamplesSplit)
	 * @see org.thingml.xtext.thingML.ThingMLPackage#getRandomForest_Min_samples_split()
	 * @model containment="true"
	 * @generated
	 */
  MinSamplesSplit getMin_samples_split();

  /**
	 * Sets the value of the '{@link org.thingml.xtext.thingML.RandomForest#getMin_samples_split <em>Min samples split</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min samples split</em>' containment reference.
	 * @see #getMin_samples_split()
	 * @generated
	 */
  void setMin_samples_split(MinSamplesSplit value);

} // RandomForest
