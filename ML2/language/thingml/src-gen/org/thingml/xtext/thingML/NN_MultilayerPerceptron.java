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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NN Multilayer Perceptron</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getHidden_layer_sizes <em>Hidden layer sizes</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getHidden_layers <em>Hidden layers</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getActivation <em>Activation</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getOptimizer <em>Optimizer</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getBatch_size <em>Batch size</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getLearning_rate_mode <em>Learning rate mode</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getLearning_rate_init <em>Learning rate init</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getPower_t <em>Power t</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getMax_iter <em>Max iter</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getShuffle <em>Shuffle</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getRandom_state <em>Random state</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getTol <em>Tol</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getVerbose <em>Verbose</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getWarm_start <em>Warm start</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getMomentum <em>Momentum</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getNesterovs_momentum <em>Nesterovs momentum</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getEarly_stopping <em>Early stopping</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getValidation_fraction <em>Validation fraction</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getBeta_1 <em>Beta 1</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getBeta_2 <em>Beta 2</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getEpsilon <em>Epsilon</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getN_iter_no_change <em>Niter no change</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getMax_fun <em>Max fun</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getLoss <em>Loss</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getEpochs <em>Epochs</em>}</li>
 * </ul>
 *
 * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron()
 * @model
 * @generated
 */
public interface NN_MultilayerPerceptron extends ML2_ModelAlgorithm
{
  /**
   * Returns the value of the '<em><b>Hidden layer sizes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hidden layer sizes</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hidden layer sizes</em>' attribute.
   * @see #setHidden_layer_sizes(String)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_Hidden_layer_sizes()
   * @model
   * @generated
   */
  String getHidden_layer_sizes();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getHidden_layer_sizes <em>Hidden layer sizes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hidden layer sizes</em>' attribute.
   * @see #getHidden_layer_sizes()
   * @generated
   */
  void setHidden_layer_sizes(String value);

  /**
   * Returns the value of the '<em><b>Hidden layers</b></em>' containment reference list.
   * The list contents are of type {@link org.thingml.xtext.thingML.IntegerLiteral}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hidden layers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hidden layers</em>' containment reference list.
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_Hidden_layers()
   * @model containment="true"
   * @generated
   */
  EList<IntegerLiteral> getHidden_layers();

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
   * Returns the value of the '<em><b>Alpha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alpha</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alpha</em>' containment reference.
   * @see #setAlpha(DoubleLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_Alpha()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getAlpha();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getAlpha <em>Alpha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alpha</em>' containment reference.
   * @see #getAlpha()
   * @generated
   */
  void setAlpha(DoubleLiteral value);

  /**
   * Returns the value of the '<em><b>Batch size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Batch size</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Batch size</em>' containment reference.
   * @see #setBatch_size(IntegerLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_Batch_size()
   * @model containment="true"
   * @generated
   */
  IntegerLiteral getBatch_size();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getBatch_size <em>Batch size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Batch size</em>' containment reference.
   * @see #getBatch_size()
   * @generated
   */
  void setBatch_size(IntegerLiteral value);

  /**
   * Returns the value of the '<em><b>Learning rate mode</b></em>' attribute.
   * The literals are from the enumeration {@link org.thingml.xtext.thingML.Learning_rate_mode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Learning rate mode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Learning rate mode</em>' attribute.
   * @see org.thingml.xtext.thingML.Learning_rate_mode
   * @see #setLearning_rate_mode(Learning_rate_mode)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_Learning_rate_mode()
   * @model
   * @generated
   */
  Learning_rate_mode getLearning_rate_mode();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getLearning_rate_mode <em>Learning rate mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Learning rate mode</em>' attribute.
   * @see org.thingml.xtext.thingML.Learning_rate_mode
   * @see #getLearning_rate_mode()
   * @generated
   */
  void setLearning_rate_mode(Learning_rate_mode value);

  /**
   * Returns the value of the '<em><b>Learning rate init</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Learning rate init</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Learning rate init</em>' attribute.
   * @see #setLearning_rate_init(String)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_Learning_rate_init()
   * @model
   * @generated
   */
  String getLearning_rate_init();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getLearning_rate_init <em>Learning rate init</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Learning rate init</em>' attribute.
   * @see #getLearning_rate_init()
   * @generated
   */
  void setLearning_rate_init(String value);

  /**
   * Returns the value of the '<em><b>Power t</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Power t</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Power t</em>' containment reference.
   * @see #setPower_t(DoubleLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_Power_t()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getPower_t();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getPower_t <em>Power t</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Power t</em>' containment reference.
   * @see #getPower_t()
   * @generated
   */
  void setPower_t(DoubleLiteral value);

  /**
   * Returns the value of the '<em><b>Max iter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max iter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max iter</em>' containment reference.
   * @see #setMax_iter(IntegerLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_Max_iter()
   * @model containment="true"
   * @generated
   */
  IntegerLiteral getMax_iter();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getMax_iter <em>Max iter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max iter</em>' containment reference.
   * @see #getMax_iter()
   * @generated
   */
  void setMax_iter(IntegerLiteral value);

  /**
   * Returns the value of the '<em><b>Shuffle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shuffle</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shuffle</em>' containment reference.
   * @see #setShuffle(BooleanLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_Shuffle()
   * @model containment="true"
   * @generated
   */
  BooleanLiteral getShuffle();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getShuffle <em>Shuffle</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shuffle</em>' containment reference.
   * @see #getShuffle()
   * @generated
   */
  void setShuffle(BooleanLiteral value);

  /**
   * Returns the value of the '<em><b>Random state</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Random state</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Random state</em>' containment reference.
   * @see #setRandom_state(IntegerLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_Random_state()
   * @model containment="true"
   * @generated
   */
  IntegerLiteral getRandom_state();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getRandom_state <em>Random state</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Random state</em>' containment reference.
   * @see #getRandom_state()
   * @generated
   */
  void setRandom_state(IntegerLiteral value);

  /**
   * Returns the value of the '<em><b>Tol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tol</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tol</em>' containment reference.
   * @see #setTol(DoubleLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_Tol()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getTol();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getTol <em>Tol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tol</em>' containment reference.
   * @see #getTol()
   * @generated
   */
  void setTol(DoubleLiteral value);

  /**
   * Returns the value of the '<em><b>Verbose</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Verbose</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Verbose</em>' containment reference.
   * @see #setVerbose(BooleanLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_Verbose()
   * @model containment="true"
   * @generated
   */
  BooleanLiteral getVerbose();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getVerbose <em>Verbose</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Verbose</em>' containment reference.
   * @see #getVerbose()
   * @generated
   */
  void setVerbose(BooleanLiteral value);

  /**
   * Returns the value of the '<em><b>Warm start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Warm start</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Warm start</em>' containment reference.
   * @see #setWarm_start(BooleanLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_Warm_start()
   * @model containment="true"
   * @generated
   */
  BooleanLiteral getWarm_start();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getWarm_start <em>Warm start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Warm start</em>' containment reference.
   * @see #getWarm_start()
   * @generated
   */
  void setWarm_start(BooleanLiteral value);

  /**
   * Returns the value of the '<em><b>Momentum</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Momentum</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Momentum</em>' containment reference.
   * @see #setMomentum(DoubleLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_Momentum()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getMomentum();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getMomentum <em>Momentum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Momentum</em>' containment reference.
   * @see #getMomentum()
   * @generated
   */
  void setMomentum(DoubleLiteral value);

  /**
   * Returns the value of the '<em><b>Nesterovs momentum</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nesterovs momentum</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nesterovs momentum</em>' containment reference.
   * @see #setNesterovs_momentum(BooleanLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_Nesterovs_momentum()
   * @model containment="true"
   * @generated
   */
  BooleanLiteral getNesterovs_momentum();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getNesterovs_momentum <em>Nesterovs momentum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nesterovs momentum</em>' containment reference.
   * @see #getNesterovs_momentum()
   * @generated
   */
  void setNesterovs_momentum(BooleanLiteral value);

  /**
   * Returns the value of the '<em><b>Early stopping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Early stopping</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Early stopping</em>' containment reference.
   * @see #setEarly_stopping(BooleanLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_Early_stopping()
   * @model containment="true"
   * @generated
   */
  BooleanLiteral getEarly_stopping();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getEarly_stopping <em>Early stopping</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Early stopping</em>' containment reference.
   * @see #getEarly_stopping()
   * @generated
   */
  void setEarly_stopping(BooleanLiteral value);

  /**
   * Returns the value of the '<em><b>Validation fraction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Validation fraction</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Validation fraction</em>' containment reference.
   * @see #setValidation_fraction(DoubleLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_Validation_fraction()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getValidation_fraction();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getValidation_fraction <em>Validation fraction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Validation fraction</em>' containment reference.
   * @see #getValidation_fraction()
   * @generated
   */
  void setValidation_fraction(DoubleLiteral value);

  /**
   * Returns the value of the '<em><b>Beta 1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Beta 1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Beta 1</em>' containment reference.
   * @see #setBeta_1(DoubleLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_Beta_1()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getBeta_1();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getBeta_1 <em>Beta 1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Beta 1</em>' containment reference.
   * @see #getBeta_1()
   * @generated
   */
  void setBeta_1(DoubleLiteral value);

  /**
   * Returns the value of the '<em><b>Beta 2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Beta 2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Beta 2</em>' containment reference.
   * @see #setBeta_2(DoubleLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_Beta_2()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getBeta_2();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getBeta_2 <em>Beta 2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Beta 2</em>' containment reference.
   * @see #getBeta_2()
   * @generated
   */
  void setBeta_2(DoubleLiteral value);

  /**
   * Returns the value of the '<em><b>Epsilon</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Epsilon</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Epsilon</em>' containment reference.
   * @see #setEpsilon(DoubleLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_Epsilon()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getEpsilon();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getEpsilon <em>Epsilon</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Epsilon</em>' containment reference.
   * @see #getEpsilon()
   * @generated
   */
  void setEpsilon(DoubleLiteral value);

  /**
   * Returns the value of the '<em><b>Niter no change</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Niter no change</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Niter no change</em>' containment reference.
   * @see #setN_iter_no_change(IntegerLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_N_iter_no_change()
   * @model containment="true"
   * @generated
   */
  IntegerLiteral getN_iter_no_change();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getN_iter_no_change <em>Niter no change</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Niter no change</em>' containment reference.
   * @see #getN_iter_no_change()
   * @generated
   */
  void setN_iter_no_change(IntegerLiteral value);

  /**
   * Returns the value of the '<em><b>Max fun</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max fun</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max fun</em>' containment reference.
   * @see #setMax_fun(IntegerLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_Max_fun()
   * @model containment="true"
   * @generated
   */
  IntegerLiteral getMax_fun();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getMax_fun <em>Max fun</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max fun</em>' containment reference.
   * @see #getMax_fun()
   * @generated
   */
  void setMax_fun(IntegerLiteral value);

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
   * Returns the value of the '<em><b>Epochs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Epochs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Epochs</em>' containment reference.
   * @see #setEpochs(IntegerLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNN_MultilayerPerceptron_Epochs()
   * @model containment="true"
   * @generated
   */
  IntegerLiteral getEpochs();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NN_MultilayerPerceptron#getEpochs <em>Epochs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Epochs</em>' containment reference.
   * @see #getEpochs()
   * @generated
   */
  void setEpochs(IntegerLiteral value);

} // NN_MultilayerPerceptron
