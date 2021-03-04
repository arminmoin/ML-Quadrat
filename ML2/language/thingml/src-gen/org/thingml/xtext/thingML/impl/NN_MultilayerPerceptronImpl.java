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

import org.thingml.xtext.thingML.Activation;
import org.thingml.xtext.thingML.BooleanLiteral;
import org.thingml.xtext.thingML.DoubleLiteral;
import org.thingml.xtext.thingML.IntegerLiteral;
import org.thingml.xtext.thingML.Learning_rate_mode;
import org.thingml.xtext.thingML.Loss;
import org.thingml.xtext.thingML.NN_MultilayerPerceptron;
import org.thingml.xtext.thingML.Optimizer;
import org.thingml.xtext.thingML.ThingMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NN Multilayer Perceptron</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getHidden_layer_sizes <em>Hidden layer sizes</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getHidden_layers <em>Hidden layers</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getActivation <em>Activation</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getOptimizer <em>Optimizer</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getBatch_size <em>Batch size</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getLearning_rate_mode <em>Learning rate mode</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getLearning_rate_init <em>Learning rate init</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getPower_t <em>Power t</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getMax_iter <em>Max iter</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getShuffle <em>Shuffle</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getRandom_state <em>Random state</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getTol <em>Tol</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getVerbose <em>Verbose</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getWarm_start <em>Warm start</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getMomentum <em>Momentum</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getNesterovs_momentum <em>Nesterovs momentum</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getEarly_stopping <em>Early stopping</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getValidation_fraction <em>Validation fraction</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getBeta_1 <em>Beta 1</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getBeta_2 <em>Beta 2</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getEpsilon <em>Epsilon</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getN_iter_no_change <em>Niter no change</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getMax_fun <em>Max fun</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getLoss <em>Loss</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getEpochs <em>Epochs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NN_MultilayerPerceptronImpl extends ML2_ModelAlgorithmImpl implements NN_MultilayerPerceptron
{
  /**
   * The default value of the '{@link #getHidden_layer_sizes() <em>Hidden layer sizes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHidden_layer_sizes()
   * @generated
   * @ordered
   */
  protected static final String HIDDEN_LAYER_SIZES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHidden_layer_sizes() <em>Hidden layer sizes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHidden_layer_sizes()
   * @generated
   * @ordered
   */
  protected String hidden_layer_sizes = HIDDEN_LAYER_SIZES_EDEFAULT;

  /**
   * The cached value of the '{@link #getHidden_layers() <em>Hidden layers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHidden_layers()
   * @generated
   * @ordered
   */
  protected EList<IntegerLiteral> hidden_layers;

  /**
   * The default value of the '{@link #getActivation() <em>Activation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivation()
   * @generated
   * @ordered
   */
  protected static final Activation ACTIVATION_EDEFAULT = Activation.NOT_SET;

  /**
   * The cached value of the '{@link #getActivation() <em>Activation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivation()
   * @generated
   * @ordered
   */
  protected Activation activation = ACTIVATION_EDEFAULT;

  /**
   * The default value of the '{@link #getOptimizer() <em>Optimizer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptimizer()
   * @generated
   * @ordered
   */
  protected static final Optimizer OPTIMIZER_EDEFAULT = Optimizer.NOT_SET;

  /**
   * The cached value of the '{@link #getOptimizer() <em>Optimizer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptimizer()
   * @generated
   * @ordered
   */
  protected Optimizer optimizer = OPTIMIZER_EDEFAULT;

  /**
   * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlpha()
   * @generated
   * @ordered
   */
  protected DoubleLiteral alpha;

  /**
   * The cached value of the '{@link #getBatch_size() <em>Batch size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBatch_size()
   * @generated
   * @ordered
   */
  protected IntegerLiteral batch_size;

  /**
   * The default value of the '{@link #getLearning_rate_mode() <em>Learning rate mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLearning_rate_mode()
   * @generated
   * @ordered
   */
  protected static final Learning_rate_mode LEARNING_RATE_MODE_EDEFAULT = Learning_rate_mode.NOT_SET;

  /**
   * The cached value of the '{@link #getLearning_rate_mode() <em>Learning rate mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLearning_rate_mode()
   * @generated
   * @ordered
   */
  protected Learning_rate_mode learning_rate_mode = LEARNING_RATE_MODE_EDEFAULT;

  /**
   * The default value of the '{@link #getLearning_rate_init() <em>Learning rate init</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLearning_rate_init()
   * @generated
   * @ordered
   */
  protected static final String LEARNING_RATE_INIT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLearning_rate_init() <em>Learning rate init</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLearning_rate_init()
   * @generated
   * @ordered
   */
  protected String learning_rate_init = LEARNING_RATE_INIT_EDEFAULT;

  /**
   * The cached value of the '{@link #getPower_t() <em>Power t</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPower_t()
   * @generated
   * @ordered
   */
  protected DoubleLiteral power_t;

  /**
   * The cached value of the '{@link #getMax_iter() <em>Max iter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax_iter()
   * @generated
   * @ordered
   */
  protected IntegerLiteral max_iter;

  /**
   * The cached value of the '{@link #getShuffle() <em>Shuffle</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShuffle()
   * @generated
   * @ordered
   */
  protected BooleanLiteral shuffle;

  /**
   * The cached value of the '{@link #getRandom_state() <em>Random state</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRandom_state()
   * @generated
   * @ordered
   */
  protected IntegerLiteral random_state;

  /**
   * The cached value of the '{@link #getTol() <em>Tol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTol()
   * @generated
   * @ordered
   */
  protected DoubleLiteral tol;

  /**
   * The cached value of the '{@link #getVerbose() <em>Verbose</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerbose()
   * @generated
   * @ordered
   */
  protected BooleanLiteral verbose;

  /**
   * The cached value of the '{@link #getWarm_start() <em>Warm start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWarm_start()
   * @generated
   * @ordered
   */
  protected BooleanLiteral warm_start;

  /**
   * The cached value of the '{@link #getMomentum() <em>Momentum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMomentum()
   * @generated
   * @ordered
   */
  protected DoubleLiteral momentum;

  /**
   * The cached value of the '{@link #getNesterovs_momentum() <em>Nesterovs momentum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNesterovs_momentum()
   * @generated
   * @ordered
   */
  protected BooleanLiteral nesterovs_momentum;

  /**
   * The cached value of the '{@link #getEarly_stopping() <em>Early stopping</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEarly_stopping()
   * @generated
   * @ordered
   */
  protected BooleanLiteral early_stopping;

  /**
   * The cached value of the '{@link #getValidation_fraction() <em>Validation fraction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValidation_fraction()
   * @generated
   * @ordered
   */
  protected DoubleLiteral validation_fraction;

  /**
   * The cached value of the '{@link #getBeta_1() <em>Beta 1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBeta_1()
   * @generated
   * @ordered
   */
  protected DoubleLiteral beta_1;

  /**
   * The cached value of the '{@link #getBeta_2() <em>Beta 2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBeta_2()
   * @generated
   * @ordered
   */
  protected DoubleLiteral beta_2;

  /**
   * The cached value of the '{@link #getEpsilon() <em>Epsilon</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEpsilon()
   * @generated
   * @ordered
   */
  protected DoubleLiteral epsilon;

  /**
   * The cached value of the '{@link #getN_iter_no_change() <em>Niter no change</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN_iter_no_change()
   * @generated
   * @ordered
   */
  protected IntegerLiteral n_iter_no_change;

  /**
   * The cached value of the '{@link #getMax_fun() <em>Max fun</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax_fun()
   * @generated
   * @ordered
   */
  protected IntegerLiteral max_fun;

  /**
   * The default value of the '{@link #getLoss() <em>Loss</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoss()
   * @generated
   * @ordered
   */
  protected static final Loss LOSS_EDEFAULT = Loss.NOT_SET;

  /**
   * The cached value of the '{@link #getLoss() <em>Loss</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoss()
   * @generated
   * @ordered
   */
  protected Loss loss = LOSS_EDEFAULT;

  /**
   * The cached value of the '{@link #getEpochs() <em>Epochs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEpochs()
   * @generated
   * @ordered
   */
  protected IntegerLiteral epochs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NN_MultilayerPerceptronImpl()
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
    return ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHidden_layer_sizes()
  {
    return hidden_layer_sizes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHidden_layer_sizes(String newHidden_layer_sizes)
  {
    String oldHidden_layer_sizes = hidden_layer_sizes;
    hidden_layer_sizes = newHidden_layer_sizes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__HIDDEN_LAYER_SIZES, oldHidden_layer_sizes, hidden_layer_sizes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IntegerLiteral> getHidden_layers()
  {
    if (hidden_layers == null)
    {
      hidden_layers = new EObjectContainmentEList<IntegerLiteral>(IntegerLiteral.class, this, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__HIDDEN_LAYERS);
    }
    return hidden_layers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Activation getActivation()
  {
    return activation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActivation(Activation newActivation)
  {
    Activation oldActivation = activation;
    activation = newActivation == null ? ACTIVATION_EDEFAULT : newActivation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__ACTIVATION, oldActivation, activation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Optimizer getOptimizer()
  {
    return optimizer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptimizer(Optimizer newOptimizer)
  {
    Optimizer oldOptimizer = optimizer;
    optimizer = newOptimizer == null ? OPTIMIZER_EDEFAULT : newOptimizer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__OPTIMIZER, oldOptimizer, optimizer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleLiteral getAlpha()
  {
    return alpha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlpha(DoubleLiteral newAlpha, NotificationChain msgs)
  {
    DoubleLiteral oldAlpha = alpha;
    alpha = newAlpha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__ALPHA, oldAlpha, newAlpha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlpha(DoubleLiteral newAlpha)
  {
    if (newAlpha != alpha)
    {
      NotificationChain msgs = null;
      if (alpha != null)
        msgs = ((InternalEObject)alpha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__ALPHA, null, msgs);
      if (newAlpha != null)
        msgs = ((InternalEObject)newAlpha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__ALPHA, null, msgs);
      msgs = basicSetAlpha(newAlpha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__ALPHA, newAlpha, newAlpha));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral getBatch_size()
  {
    return batch_size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBatch_size(IntegerLiteral newBatch_size, NotificationChain msgs)
  {
    IntegerLiteral oldBatch_size = batch_size;
    batch_size = newBatch_size;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BATCH_SIZE, oldBatch_size, newBatch_size);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBatch_size(IntegerLiteral newBatch_size)
  {
    if (newBatch_size != batch_size)
    {
      NotificationChain msgs = null;
      if (batch_size != null)
        msgs = ((InternalEObject)batch_size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BATCH_SIZE, null, msgs);
      if (newBatch_size != null)
        msgs = ((InternalEObject)newBatch_size).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BATCH_SIZE, null, msgs);
      msgs = basicSetBatch_size(newBatch_size, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BATCH_SIZE, newBatch_size, newBatch_size));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Learning_rate_mode getLearning_rate_mode()
  {
    return learning_rate_mode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLearning_rate_mode(Learning_rate_mode newLearning_rate_mode)
  {
    Learning_rate_mode oldLearning_rate_mode = learning_rate_mode;
    learning_rate_mode = newLearning_rate_mode == null ? LEARNING_RATE_MODE_EDEFAULT : newLearning_rate_mode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__LEARNING_RATE_MODE, oldLearning_rate_mode, learning_rate_mode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLearning_rate_init()
  {
    return learning_rate_init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLearning_rate_init(String newLearning_rate_init)
  {
    String oldLearning_rate_init = learning_rate_init;
    learning_rate_init = newLearning_rate_init;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__LEARNING_RATE_INIT, oldLearning_rate_init, learning_rate_init));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleLiteral getPower_t()
  {
    return power_t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPower_t(DoubleLiteral newPower_t, NotificationChain msgs)
  {
    DoubleLiteral oldPower_t = power_t;
    power_t = newPower_t;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__POWER_T, oldPower_t, newPower_t);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPower_t(DoubleLiteral newPower_t)
  {
    if (newPower_t != power_t)
    {
      NotificationChain msgs = null;
      if (power_t != null)
        msgs = ((InternalEObject)power_t).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__POWER_T, null, msgs);
      if (newPower_t != null)
        msgs = ((InternalEObject)newPower_t).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__POWER_T, null, msgs);
      msgs = basicSetPower_t(newPower_t, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__POWER_T, newPower_t, newPower_t));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral getMax_iter()
  {
    return max_iter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMax_iter(IntegerLiteral newMax_iter, NotificationChain msgs)
  {
    IntegerLiteral oldMax_iter = max_iter;
    max_iter = newMax_iter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MAX_ITER, oldMax_iter, newMax_iter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMax_iter(IntegerLiteral newMax_iter)
  {
    if (newMax_iter != max_iter)
    {
      NotificationChain msgs = null;
      if (max_iter != null)
        msgs = ((InternalEObject)max_iter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MAX_ITER, null, msgs);
      if (newMax_iter != null)
        msgs = ((InternalEObject)newMax_iter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MAX_ITER, null, msgs);
      msgs = basicSetMax_iter(newMax_iter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MAX_ITER, newMax_iter, newMax_iter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral getShuffle()
  {
    return shuffle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetShuffle(BooleanLiteral newShuffle, NotificationChain msgs)
  {
    BooleanLiteral oldShuffle = shuffle;
    shuffle = newShuffle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__SHUFFLE, oldShuffle, newShuffle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShuffle(BooleanLiteral newShuffle)
  {
    if (newShuffle != shuffle)
    {
      NotificationChain msgs = null;
      if (shuffle != null)
        msgs = ((InternalEObject)shuffle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__SHUFFLE, null, msgs);
      if (newShuffle != null)
        msgs = ((InternalEObject)newShuffle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__SHUFFLE, null, msgs);
      msgs = basicSetShuffle(newShuffle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__SHUFFLE, newShuffle, newShuffle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral getRandom_state()
  {
    return random_state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRandom_state(IntegerLiteral newRandom_state, NotificationChain msgs)
  {
    IntegerLiteral oldRandom_state = random_state;
    random_state = newRandom_state;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__RANDOM_STATE, oldRandom_state, newRandom_state);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRandom_state(IntegerLiteral newRandom_state)
  {
    if (newRandom_state != random_state)
    {
      NotificationChain msgs = null;
      if (random_state != null)
        msgs = ((InternalEObject)random_state).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__RANDOM_STATE, null, msgs);
      if (newRandom_state != null)
        msgs = ((InternalEObject)newRandom_state).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__RANDOM_STATE, null, msgs);
      msgs = basicSetRandom_state(newRandom_state, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__RANDOM_STATE, newRandom_state, newRandom_state));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleLiteral getTol()
  {
    return tol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTol(DoubleLiteral newTol, NotificationChain msgs)
  {
    DoubleLiteral oldTol = tol;
    tol = newTol;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__TOL, oldTol, newTol);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTol(DoubleLiteral newTol)
  {
    if (newTol != tol)
    {
      NotificationChain msgs = null;
      if (tol != null)
        msgs = ((InternalEObject)tol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__TOL, null, msgs);
      if (newTol != null)
        msgs = ((InternalEObject)newTol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__TOL, null, msgs);
      msgs = basicSetTol(newTol, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__TOL, newTol, newTol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral getVerbose()
  {
    return verbose;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVerbose(BooleanLiteral newVerbose, NotificationChain msgs)
  {
    BooleanLiteral oldVerbose = verbose;
    verbose = newVerbose;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__VERBOSE, oldVerbose, newVerbose);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVerbose(BooleanLiteral newVerbose)
  {
    if (newVerbose != verbose)
    {
      NotificationChain msgs = null;
      if (verbose != null)
        msgs = ((InternalEObject)verbose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__VERBOSE, null, msgs);
      if (newVerbose != null)
        msgs = ((InternalEObject)newVerbose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__VERBOSE, null, msgs);
      msgs = basicSetVerbose(newVerbose, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__VERBOSE, newVerbose, newVerbose));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral getWarm_start()
  {
    return warm_start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWarm_start(BooleanLiteral newWarm_start, NotificationChain msgs)
  {
    BooleanLiteral oldWarm_start = warm_start;
    warm_start = newWarm_start;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__WARM_START, oldWarm_start, newWarm_start);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWarm_start(BooleanLiteral newWarm_start)
  {
    if (newWarm_start != warm_start)
    {
      NotificationChain msgs = null;
      if (warm_start != null)
        msgs = ((InternalEObject)warm_start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__WARM_START, null, msgs);
      if (newWarm_start != null)
        msgs = ((InternalEObject)newWarm_start).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__WARM_START, null, msgs);
      msgs = basicSetWarm_start(newWarm_start, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__WARM_START, newWarm_start, newWarm_start));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleLiteral getMomentum()
  {
    return momentum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMomentum(DoubleLiteral newMomentum, NotificationChain msgs)
  {
    DoubleLiteral oldMomentum = momentum;
    momentum = newMomentum;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MOMENTUM, oldMomentum, newMomentum);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMomentum(DoubleLiteral newMomentum)
  {
    if (newMomentum != momentum)
    {
      NotificationChain msgs = null;
      if (momentum != null)
        msgs = ((InternalEObject)momentum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MOMENTUM, null, msgs);
      if (newMomentum != null)
        msgs = ((InternalEObject)newMomentum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MOMENTUM, null, msgs);
      msgs = basicSetMomentum(newMomentum, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MOMENTUM, newMomentum, newMomentum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral getNesterovs_momentum()
  {
    return nesterovs_momentum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNesterovs_momentum(BooleanLiteral newNesterovs_momentum, NotificationChain msgs)
  {
    BooleanLiteral oldNesterovs_momentum = nesterovs_momentum;
    nesterovs_momentum = newNesterovs_momentum;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__NESTEROVS_MOMENTUM, oldNesterovs_momentum, newNesterovs_momentum);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNesterovs_momentum(BooleanLiteral newNesterovs_momentum)
  {
    if (newNesterovs_momentum != nesterovs_momentum)
    {
      NotificationChain msgs = null;
      if (nesterovs_momentum != null)
        msgs = ((InternalEObject)nesterovs_momentum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__NESTEROVS_MOMENTUM, null, msgs);
      if (newNesterovs_momentum != null)
        msgs = ((InternalEObject)newNesterovs_momentum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__NESTEROVS_MOMENTUM, null, msgs);
      msgs = basicSetNesterovs_momentum(newNesterovs_momentum, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__NESTEROVS_MOMENTUM, newNesterovs_momentum, newNesterovs_momentum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral getEarly_stopping()
  {
    return early_stopping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEarly_stopping(BooleanLiteral newEarly_stopping, NotificationChain msgs)
  {
    BooleanLiteral oldEarly_stopping = early_stopping;
    early_stopping = newEarly_stopping;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EARLY_STOPPING, oldEarly_stopping, newEarly_stopping);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEarly_stopping(BooleanLiteral newEarly_stopping)
  {
    if (newEarly_stopping != early_stopping)
    {
      NotificationChain msgs = null;
      if (early_stopping != null)
        msgs = ((InternalEObject)early_stopping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EARLY_STOPPING, null, msgs);
      if (newEarly_stopping != null)
        msgs = ((InternalEObject)newEarly_stopping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EARLY_STOPPING, null, msgs);
      msgs = basicSetEarly_stopping(newEarly_stopping, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EARLY_STOPPING, newEarly_stopping, newEarly_stopping));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleLiteral getValidation_fraction()
  {
    return validation_fraction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValidation_fraction(DoubleLiteral newValidation_fraction, NotificationChain msgs)
  {
    DoubleLiteral oldValidation_fraction = validation_fraction;
    validation_fraction = newValidation_fraction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__VALIDATION_FRACTION, oldValidation_fraction, newValidation_fraction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValidation_fraction(DoubleLiteral newValidation_fraction)
  {
    if (newValidation_fraction != validation_fraction)
    {
      NotificationChain msgs = null;
      if (validation_fraction != null)
        msgs = ((InternalEObject)validation_fraction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__VALIDATION_FRACTION, null, msgs);
      if (newValidation_fraction != null)
        msgs = ((InternalEObject)newValidation_fraction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__VALIDATION_FRACTION, null, msgs);
      msgs = basicSetValidation_fraction(newValidation_fraction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__VALIDATION_FRACTION, newValidation_fraction, newValidation_fraction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleLiteral getBeta_1()
  {
    return beta_1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBeta_1(DoubleLiteral newBeta_1, NotificationChain msgs)
  {
    DoubleLiteral oldBeta_1 = beta_1;
    beta_1 = newBeta_1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BETA_1, oldBeta_1, newBeta_1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBeta_1(DoubleLiteral newBeta_1)
  {
    if (newBeta_1 != beta_1)
    {
      NotificationChain msgs = null;
      if (beta_1 != null)
        msgs = ((InternalEObject)beta_1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BETA_1, null, msgs);
      if (newBeta_1 != null)
        msgs = ((InternalEObject)newBeta_1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BETA_1, null, msgs);
      msgs = basicSetBeta_1(newBeta_1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BETA_1, newBeta_1, newBeta_1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleLiteral getBeta_2()
  {
    return beta_2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBeta_2(DoubleLiteral newBeta_2, NotificationChain msgs)
  {
    DoubleLiteral oldBeta_2 = beta_2;
    beta_2 = newBeta_2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BETA_2, oldBeta_2, newBeta_2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBeta_2(DoubleLiteral newBeta_2)
  {
    if (newBeta_2 != beta_2)
    {
      NotificationChain msgs = null;
      if (beta_2 != null)
        msgs = ((InternalEObject)beta_2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BETA_2, null, msgs);
      if (newBeta_2 != null)
        msgs = ((InternalEObject)newBeta_2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BETA_2, null, msgs);
      msgs = basicSetBeta_2(newBeta_2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BETA_2, newBeta_2, newBeta_2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleLiteral getEpsilon()
  {
    return epsilon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEpsilon(DoubleLiteral newEpsilon, NotificationChain msgs)
  {
    DoubleLiteral oldEpsilon = epsilon;
    epsilon = newEpsilon;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EPSILON, oldEpsilon, newEpsilon);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEpsilon(DoubleLiteral newEpsilon)
  {
    if (newEpsilon != epsilon)
    {
      NotificationChain msgs = null;
      if (epsilon != null)
        msgs = ((InternalEObject)epsilon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EPSILON, null, msgs);
      if (newEpsilon != null)
        msgs = ((InternalEObject)newEpsilon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EPSILON, null, msgs);
      msgs = basicSetEpsilon(newEpsilon, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EPSILON, newEpsilon, newEpsilon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral getN_iter_no_change()
  {
    return n_iter_no_change;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetN_iter_no_change(IntegerLiteral newN_iter_no_change, NotificationChain msgs)
  {
    IntegerLiteral oldN_iter_no_change = n_iter_no_change;
    n_iter_no_change = newN_iter_no_change;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__NITER_NO_CHANGE, oldN_iter_no_change, newN_iter_no_change);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setN_iter_no_change(IntegerLiteral newN_iter_no_change)
  {
    if (newN_iter_no_change != n_iter_no_change)
    {
      NotificationChain msgs = null;
      if (n_iter_no_change != null)
        msgs = ((InternalEObject)n_iter_no_change).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__NITER_NO_CHANGE, null, msgs);
      if (newN_iter_no_change != null)
        msgs = ((InternalEObject)newN_iter_no_change).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__NITER_NO_CHANGE, null, msgs);
      msgs = basicSetN_iter_no_change(newN_iter_no_change, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__NITER_NO_CHANGE, newN_iter_no_change, newN_iter_no_change));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral getMax_fun()
  {
    return max_fun;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMax_fun(IntegerLiteral newMax_fun, NotificationChain msgs)
  {
    IntegerLiteral oldMax_fun = max_fun;
    max_fun = newMax_fun;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MAX_FUN, oldMax_fun, newMax_fun);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMax_fun(IntegerLiteral newMax_fun)
  {
    if (newMax_fun != max_fun)
    {
      NotificationChain msgs = null;
      if (max_fun != null)
        msgs = ((InternalEObject)max_fun).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MAX_FUN, null, msgs);
      if (newMax_fun != null)
        msgs = ((InternalEObject)newMax_fun).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MAX_FUN, null, msgs);
      msgs = basicSetMax_fun(newMax_fun, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MAX_FUN, newMax_fun, newMax_fun));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Loss getLoss()
  {
    return loss;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLoss(Loss newLoss)
  {
    Loss oldLoss = loss;
    loss = newLoss == null ? LOSS_EDEFAULT : newLoss;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__LOSS, oldLoss, loss));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral getEpochs()
  {
    return epochs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEpochs(IntegerLiteral newEpochs, NotificationChain msgs)
  {
    IntegerLiteral oldEpochs = epochs;
    epochs = newEpochs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EPOCHS, oldEpochs, newEpochs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEpochs(IntegerLiteral newEpochs)
  {
    if (newEpochs != epochs)
    {
      NotificationChain msgs = null;
      if (epochs != null)
        msgs = ((InternalEObject)epochs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EPOCHS, null, msgs);
      if (newEpochs != null)
        msgs = ((InternalEObject)newEpochs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EPOCHS, null, msgs);
      msgs = basicSetEpochs(newEpochs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EPOCHS, newEpochs, newEpochs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__HIDDEN_LAYERS:
        return ((InternalEList<?>)getHidden_layers()).basicRemove(otherEnd, msgs);
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__ALPHA:
        return basicSetAlpha(null, msgs);
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BATCH_SIZE:
        return basicSetBatch_size(null, msgs);
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__POWER_T:
        return basicSetPower_t(null, msgs);
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MAX_ITER:
        return basicSetMax_iter(null, msgs);
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__SHUFFLE:
        return basicSetShuffle(null, msgs);
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__RANDOM_STATE:
        return basicSetRandom_state(null, msgs);
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__TOL:
        return basicSetTol(null, msgs);
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__VERBOSE:
        return basicSetVerbose(null, msgs);
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__WARM_START:
        return basicSetWarm_start(null, msgs);
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MOMENTUM:
        return basicSetMomentum(null, msgs);
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__NESTEROVS_MOMENTUM:
        return basicSetNesterovs_momentum(null, msgs);
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EARLY_STOPPING:
        return basicSetEarly_stopping(null, msgs);
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__VALIDATION_FRACTION:
        return basicSetValidation_fraction(null, msgs);
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BETA_1:
        return basicSetBeta_1(null, msgs);
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BETA_2:
        return basicSetBeta_2(null, msgs);
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EPSILON:
        return basicSetEpsilon(null, msgs);
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__NITER_NO_CHANGE:
        return basicSetN_iter_no_change(null, msgs);
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MAX_FUN:
        return basicSetMax_fun(null, msgs);
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EPOCHS:
        return basicSetEpochs(null, msgs);
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
    switch (featureID)
    {
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__HIDDEN_LAYER_SIZES:
        return getHidden_layer_sizes();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__HIDDEN_LAYERS:
        return getHidden_layers();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__ACTIVATION:
        return getActivation();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__OPTIMIZER:
        return getOptimizer();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__ALPHA:
        return getAlpha();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BATCH_SIZE:
        return getBatch_size();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__LEARNING_RATE_MODE:
        return getLearning_rate_mode();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__LEARNING_RATE_INIT:
        return getLearning_rate_init();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__POWER_T:
        return getPower_t();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MAX_ITER:
        return getMax_iter();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__SHUFFLE:
        return getShuffle();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__RANDOM_STATE:
        return getRandom_state();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__TOL:
        return getTol();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__VERBOSE:
        return getVerbose();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__WARM_START:
        return getWarm_start();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MOMENTUM:
        return getMomentum();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__NESTEROVS_MOMENTUM:
        return getNesterovs_momentum();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EARLY_STOPPING:
        return getEarly_stopping();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__VALIDATION_FRACTION:
        return getValidation_fraction();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BETA_1:
        return getBeta_1();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BETA_2:
        return getBeta_2();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EPSILON:
        return getEpsilon();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__NITER_NO_CHANGE:
        return getN_iter_no_change();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MAX_FUN:
        return getMax_fun();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__LOSS:
        return getLoss();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EPOCHS:
        return getEpochs();
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
    switch (featureID)
    {
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__HIDDEN_LAYER_SIZES:
        setHidden_layer_sizes((String)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__HIDDEN_LAYERS:
        getHidden_layers().clear();
        getHidden_layers().addAll((Collection<? extends IntegerLiteral>)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__ACTIVATION:
        setActivation((Activation)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__OPTIMIZER:
        setOptimizer((Optimizer)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__ALPHA:
        setAlpha((DoubleLiteral)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BATCH_SIZE:
        setBatch_size((IntegerLiteral)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__LEARNING_RATE_MODE:
        setLearning_rate_mode((Learning_rate_mode)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__LEARNING_RATE_INIT:
        setLearning_rate_init((String)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__POWER_T:
        setPower_t((DoubleLiteral)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MAX_ITER:
        setMax_iter((IntegerLiteral)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__SHUFFLE:
        setShuffle((BooleanLiteral)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__RANDOM_STATE:
        setRandom_state((IntegerLiteral)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__TOL:
        setTol((DoubleLiteral)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__VERBOSE:
        setVerbose((BooleanLiteral)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__WARM_START:
        setWarm_start((BooleanLiteral)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MOMENTUM:
        setMomentum((DoubleLiteral)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__NESTEROVS_MOMENTUM:
        setNesterovs_momentum((BooleanLiteral)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EARLY_STOPPING:
        setEarly_stopping((BooleanLiteral)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__VALIDATION_FRACTION:
        setValidation_fraction((DoubleLiteral)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BETA_1:
        setBeta_1((DoubleLiteral)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BETA_2:
        setBeta_2((DoubleLiteral)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EPSILON:
        setEpsilon((DoubleLiteral)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__NITER_NO_CHANGE:
        setN_iter_no_change((IntegerLiteral)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MAX_FUN:
        setMax_fun((IntegerLiteral)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__LOSS:
        setLoss((Loss)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EPOCHS:
        setEpochs((IntegerLiteral)newValue);
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
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__HIDDEN_LAYER_SIZES:
        setHidden_layer_sizes(HIDDEN_LAYER_SIZES_EDEFAULT);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__HIDDEN_LAYERS:
        getHidden_layers().clear();
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__ACTIVATION:
        setActivation(ACTIVATION_EDEFAULT);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__OPTIMIZER:
        setOptimizer(OPTIMIZER_EDEFAULT);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__ALPHA:
        setAlpha((DoubleLiteral)null);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BATCH_SIZE:
        setBatch_size((IntegerLiteral)null);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__LEARNING_RATE_MODE:
        setLearning_rate_mode(LEARNING_RATE_MODE_EDEFAULT);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__LEARNING_RATE_INIT:
        setLearning_rate_init(LEARNING_RATE_INIT_EDEFAULT);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__POWER_T:
        setPower_t((DoubleLiteral)null);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MAX_ITER:
        setMax_iter((IntegerLiteral)null);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__SHUFFLE:
        setShuffle((BooleanLiteral)null);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__RANDOM_STATE:
        setRandom_state((IntegerLiteral)null);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__TOL:
        setTol((DoubleLiteral)null);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__VERBOSE:
        setVerbose((BooleanLiteral)null);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__WARM_START:
        setWarm_start((BooleanLiteral)null);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MOMENTUM:
        setMomentum((DoubleLiteral)null);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__NESTEROVS_MOMENTUM:
        setNesterovs_momentum((BooleanLiteral)null);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EARLY_STOPPING:
        setEarly_stopping((BooleanLiteral)null);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__VALIDATION_FRACTION:
        setValidation_fraction((DoubleLiteral)null);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BETA_1:
        setBeta_1((DoubleLiteral)null);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BETA_2:
        setBeta_2((DoubleLiteral)null);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EPSILON:
        setEpsilon((DoubleLiteral)null);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__NITER_NO_CHANGE:
        setN_iter_no_change((IntegerLiteral)null);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MAX_FUN:
        setMax_fun((IntegerLiteral)null);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__LOSS:
        setLoss(LOSS_EDEFAULT);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EPOCHS:
        setEpochs((IntegerLiteral)null);
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
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__HIDDEN_LAYER_SIZES:
        return HIDDEN_LAYER_SIZES_EDEFAULT == null ? hidden_layer_sizes != null : !HIDDEN_LAYER_SIZES_EDEFAULT.equals(hidden_layer_sizes);
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__HIDDEN_LAYERS:
        return hidden_layers != null && !hidden_layers.isEmpty();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__ACTIVATION:
        return activation != ACTIVATION_EDEFAULT;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__OPTIMIZER:
        return optimizer != OPTIMIZER_EDEFAULT;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__ALPHA:
        return alpha != null;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BATCH_SIZE:
        return batch_size != null;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__LEARNING_RATE_MODE:
        return learning_rate_mode != LEARNING_RATE_MODE_EDEFAULT;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__LEARNING_RATE_INIT:
        return LEARNING_RATE_INIT_EDEFAULT == null ? learning_rate_init != null : !LEARNING_RATE_INIT_EDEFAULT.equals(learning_rate_init);
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__POWER_T:
        return power_t != null;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MAX_ITER:
        return max_iter != null;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__SHUFFLE:
        return shuffle != null;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__RANDOM_STATE:
        return random_state != null;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__TOL:
        return tol != null;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__VERBOSE:
        return verbose != null;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__WARM_START:
        return warm_start != null;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MOMENTUM:
        return momentum != null;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__NESTEROVS_MOMENTUM:
        return nesterovs_momentum != null;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EARLY_STOPPING:
        return early_stopping != null;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__VALIDATION_FRACTION:
        return validation_fraction != null;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BETA_1:
        return beta_1 != null;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BETA_2:
        return beta_2 != null;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EPSILON:
        return epsilon != null;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__NITER_NO_CHANGE:
        return n_iter_no_change != null;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MAX_FUN:
        return max_fun != null;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__LOSS:
        return loss != LOSS_EDEFAULT;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EPOCHS:
        return epochs != null;
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
    result.append(" (hidden_layer_sizes: ");
    result.append(hidden_layer_sizes);
    result.append(", activation: ");
    result.append(activation);
    result.append(", optimizer: ");
    result.append(optimizer);
    result.append(", learning_rate_mode: ");
    result.append(learning_rate_mode);
    result.append(", learning_rate_init: ");
    result.append(learning_rate_init);
    result.append(", loss: ");
    result.append(loss);
    result.append(')');
    return result.toString();
  }

} //NN_MultilayerPerceptronImpl
