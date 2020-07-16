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
 * A representation of the model object '<em><b>Gated Recurrent Units</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.GatedRecurrentUnits#getLoss_function <em>Loss function</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.GatedRecurrentUnits#getOptimizer <em>Optimizer</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.GatedRecurrentUnits#getLearning_rate <em>Learning rate</em>}</li>
 * </ul>
 *
 * @see org.thingml.xtext.thingML.ThingMLPackage#getGatedRecurrentUnits()
 * @model
 * @generated
 */
public interface GatedRecurrentUnits extends ML2_ModelAlgorithm
{
  /**
	 * Returns the value of the '<em><b>Loss function</b></em>' attribute.
	 * The literals are from the enumeration {@link org.thingml.xtext.thingML.LossFunction}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Loss function</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Loss function</em>' attribute.
	 * @see org.thingml.xtext.thingML.LossFunction
	 * @see #setLoss_function(LossFunction)
	 * @see org.thingml.xtext.thingML.ThingMLPackage#getGatedRecurrentUnits_Loss_function()
	 * @model
	 * @generated
	 */
  LossFunction getLoss_function();

  /**
	 * Sets the value of the '{@link org.thingml.xtext.thingML.GatedRecurrentUnits#getLoss_function <em>Loss function</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loss function</em>' attribute.
	 * @see org.thingml.xtext.thingML.LossFunction
	 * @see #getLoss_function()
	 * @generated
	 */
  void setLoss_function(LossFunction value);

  /**
	 * Returns the value of the '<em><b>Optimizer</b></em>' attribute.
	 * The literals are from the enumeration {@link org.thingml.xtext.thingML.Optimizer}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optimizer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimizer</em>' attribute.
	 * @see org.thingml.xtext.thingML.Optimizer
	 * @see #setOptimizer(Optimizer)
	 * @see org.thingml.xtext.thingML.ThingMLPackage#getGatedRecurrentUnits_Optimizer()
	 * @model
	 * @generated
	 */
  Optimizer getOptimizer();

  /**
	 * Sets the value of the '{@link org.thingml.xtext.thingML.GatedRecurrentUnits#getOptimizer <em>Optimizer</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimizer</em>' attribute.
	 * @see org.thingml.xtext.thingML.Optimizer
	 * @see #getOptimizer()
	 * @generated
	 */
  void setOptimizer(Optimizer value);

  /**
	 * Returns the value of the '<em><b>Learning rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Learning rate</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Learning rate</em>' attribute.
	 * @see #setLearning_rate(double)
	 * @see org.thingml.xtext.thingML.ThingMLPackage#getGatedRecurrentUnits_Learning_rate()
	 * @model
	 * @generated
	 */
  double getLearning_rate();

  /**
	 * Sets the value of the '{@link org.thingml.xtext.thingML.GatedRecurrentUnits#getLearning_rate <em>Learning rate</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Learning rate</em>' attribute.
	 * @see #getLearning_rate()
	 * @generated
	 */
  void setLearning_rate(double value);

} // GatedRecurrentUnits
