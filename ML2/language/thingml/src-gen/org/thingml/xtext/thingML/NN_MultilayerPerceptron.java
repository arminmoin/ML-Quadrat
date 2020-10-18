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
 * A representation of the model object '<em><b>NN Multilayer Perceptron</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getNo_hidden_layers <em>No hidden layers</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getActivation <em>Activation</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getOptimizer <em>Optimizer</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getLoss <em>Loss</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getEpochs <em>Epochs</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getBatch_size <em>Batch size</em>}</li>
 * </ul>
 *
 * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron()
 * @model
 * @generated
 */
public interface NN_MultilayerPerceptron extends ML2_ModelAlgorithm
{
  /**
   * Returns the value of the '<em><b>No hidden layers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>No hidden layers</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>No hidden layers</em>' attribute.
   * @see #setNo_hidden_layers(long)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_No_hidden_layers()
   * @model
   * @generated
   */
  long getNo_hidden_layers();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getNo_hidden_layers <em>No hidden layers</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>No hidden layers</em>' attribute.
   * @see #getNo_hidden_layers()
   * @generated
   */
  void setNo_hidden_layers(long value);

  /**
   * Returns the value of the '<em><b>Activation</b></em>' attribute.
   * The literals are from the enumeration {@link org.thingml.xtext.thingML.Activation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Activation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Activation</em>' attribute.
   * @see org.thingml.xtext.thingML.Activation
   * @see #setActivation(Activation)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_Activation()
   * @model
   * @generated
   */
  Activation getActivation();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getActivation <em>Activation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Activation</em>' attribute.
   * @see org.thingml.xtext.thingML.Activation
   * @see #getActivation()
   * @generated
   */
  void setActivation(Activation value);

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
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_Optimizer()
   * @model
   * @generated
   */
  Optimizer getOptimizer();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getOptimizer <em>Optimizer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Optimizer</em>' attribute.
   * @see org.thingml.xtext.thingML.Optimizer
   * @see #getOptimizer()
   * @generated
   */
  void setOptimizer(Optimizer value);

  /**
   * Returns the value of the '<em><b>Loss</b></em>' attribute.
   * The literals are from the enumeration {@link org.thingml.xtext.thingML.Loss}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Loss</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loss</em>' attribute.
   * @see org.thingml.xtext.thingML.Loss
   * @see #setLoss(Loss)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_Loss()
   * @model
   * @generated
   */
  Loss getLoss();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getLoss <em>Loss</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loss</em>' attribute.
   * @see org.thingml.xtext.thingML.Loss
   * @see #getLoss()
   * @generated
   */
  void setLoss(Loss value);

  /**
   * Returns the value of the '<em><b>Epochs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Epochs</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Epochs</em>' attribute.
   * @see #setEpochs(long)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_Epochs()
   * @model
   * @generated
   */
  long getEpochs();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getEpochs <em>Epochs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Epochs</em>' attribute.
   * @see #getEpochs()
   * @generated
   */
  void setEpochs(long value);

  /**
   * Returns the value of the '<em><b>Batch size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Batch size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Batch size</em>' attribute.
   * @see #setBatch_size(long)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_Batch_size()
   * @model
   * @generated
   */
  long getBatch_size();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getBatch_size <em>Batch size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Batch size</em>' attribute.
   * @see #getBatch_size()
   * @generated
   */
  void setBatch_size(long value);

} // NN_MultilayerPerceptron
