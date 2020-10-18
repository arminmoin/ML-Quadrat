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

import org.thingml.xtext.thingML.Activation;
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
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getNo_hidden_layers <em>No hidden layers</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getActivation <em>Activation</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getOptimizer <em>Optimizer</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getLoss <em>Loss</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getEpochs <em>Epochs</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NN_MultilayerPerceptronImpl#getBatch_size <em>Batch size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NN_MultilayerPerceptronImpl extends ML2_ModelAlgorithmImpl implements NN_MultilayerPerceptron
{
  /**
   * The default value of the '{@link #getNo_hidden_layers() <em>No hidden layers</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNo_hidden_layers()
   * @generated
   * @ordered
   */
  protected static final long NO_HIDDEN_LAYERS_EDEFAULT = 0L;

  /**
   * The cached value of the '{@link #getNo_hidden_layers() <em>No hidden layers</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNo_hidden_layers()
   * @generated
   * @ordered
   */
  protected long no_hidden_layers = NO_HIDDEN_LAYERS_EDEFAULT;

  /**
   * The default value of the '{@link #getActivation() <em>Activation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActivation()
   * @generated
   * @ordered
   */
  protected static final Activation ACTIVATION_EDEFAULT = Activation.NO_IDEA;

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
  protected static final Optimizer OPTIMIZER_EDEFAULT = Optimizer.NO_IDEA;

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
   * The default value of the '{@link #getLoss() <em>Loss</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoss()
   * @generated
   * @ordered
   */
  protected static final Loss LOSS_EDEFAULT = Loss.NO_IDEA;

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
   * The default value of the '{@link #getEpochs() <em>Epochs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEpochs()
   * @generated
   * @ordered
   */
  protected static final long EPOCHS_EDEFAULT = 0L;

  /**
   * The cached value of the '{@link #getEpochs() <em>Epochs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEpochs()
   * @generated
   * @ordered
   */
  protected long epochs = EPOCHS_EDEFAULT;

  /**
   * The default value of the '{@link #getBatch_size() <em>Batch size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBatch_size()
   * @generated
   * @ordered
   */
  protected static final long BATCH_SIZE_EDEFAULT = 0L;

  /**
   * The cached value of the '{@link #getBatch_size() <em>Batch size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBatch_size()
   * @generated
   * @ordered
   */
  protected long batch_size = BATCH_SIZE_EDEFAULT;

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
    return ThingMLPackage.Literals.NN_MULTILAYER_PERCEPTRON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public long getNo_hidden_layers()
  {
    return no_hidden_layers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNo_hidden_layers(long newNo_hidden_layers)
  {
    long oldNo_hidden_layers = no_hidden_layers;
    no_hidden_layers = newNo_hidden_layers;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__NO_HIDDEN_LAYERS, oldNo_hidden_layers, no_hidden_layers));
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
  public long getEpochs()
  {
    return epochs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEpochs(long newEpochs)
  {
    long oldEpochs = epochs;
    epochs = newEpochs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EPOCHS, oldEpochs, epochs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public long getBatch_size()
  {
    return batch_size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBatch_size(long newBatch_size)
  {
    long oldBatch_size = batch_size;
    batch_size = newBatch_size;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BATCH_SIZE, oldBatch_size, batch_size));
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
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__NO_HIDDEN_LAYERS:
        return getNo_hidden_layers();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__ACTIVATION:
        return getActivation();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__OPTIMIZER:
        return getOptimizer();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__LOSS:
        return getLoss();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EPOCHS:
        return getEpochs();
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BATCH_SIZE:
        return getBatch_size();
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
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__NO_HIDDEN_LAYERS:
        setNo_hidden_layers((Long)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__ACTIVATION:
        setActivation((Activation)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__OPTIMIZER:
        setOptimizer((Optimizer)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__LOSS:
        setLoss((Loss)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EPOCHS:
        setEpochs((Long)newValue);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BATCH_SIZE:
        setBatch_size((Long)newValue);
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
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__NO_HIDDEN_LAYERS:
        setNo_hidden_layers(NO_HIDDEN_LAYERS_EDEFAULT);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__ACTIVATION:
        setActivation(ACTIVATION_EDEFAULT);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__OPTIMIZER:
        setOptimizer(OPTIMIZER_EDEFAULT);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__LOSS:
        setLoss(LOSS_EDEFAULT);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EPOCHS:
        setEpochs(EPOCHS_EDEFAULT);
        return;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BATCH_SIZE:
        setBatch_size(BATCH_SIZE_EDEFAULT);
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
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__NO_HIDDEN_LAYERS:
        return no_hidden_layers != NO_HIDDEN_LAYERS_EDEFAULT;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__ACTIVATION:
        return activation != ACTIVATION_EDEFAULT;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__OPTIMIZER:
        return optimizer != OPTIMIZER_EDEFAULT;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__LOSS:
        return loss != LOSS_EDEFAULT;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EPOCHS:
        return epochs != EPOCHS_EDEFAULT;
      case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BATCH_SIZE:
        return batch_size != BATCH_SIZE_EDEFAULT;
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
    result.append(" (no_hidden_layers: ");
    result.append(no_hidden_layers);
    result.append(", activation: ");
    result.append(activation);
    result.append(", optimizer: ");
    result.append(optimizer);
    result.append(", loss: ");
    result.append(loss);
    result.append(", epochs: ");
    result.append(epochs);
    result.append(", batch_size: ");
    result.append(batch_size);
    result.append(')');
    return result.toString();
  }

} //NN_MultilayerPerceptronImpl
