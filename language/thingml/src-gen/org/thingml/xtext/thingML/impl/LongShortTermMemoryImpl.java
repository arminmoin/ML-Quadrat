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

import org.thingml.xtext.thingML.LongShortTermMemory;
import org.thingml.xtext.thingML.LossFunction;
import org.thingml.xtext.thingML.Optimizer;
import org.thingml.xtext.thingML.ThingMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Long Short Term Memory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.impl.LongShortTermMemoryImpl#getLoss_function <em>Loss function</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.LongShortTermMemoryImpl#getOptimizer <em>Optimizer</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.LongShortTermMemoryImpl#getLearning_rate <em>Learning rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LongShortTermMemoryImpl extends ML2_ModelAlgorithmImpl implements LongShortTermMemory
{
  /**
	 * The default value of the '{@link #getLoss_function() <em>Loss function</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLoss_function()
	 * @generated
	 * @ordered
	 */
  protected static final LossFunction LOSS_FUNCTION_EDEFAULT = LossFunction.MSE;

  /**
	 * The cached value of the '{@link #getLoss_function() <em>Loss function</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLoss_function()
	 * @generated
	 * @ordered
	 */
  protected LossFunction loss_function = LOSS_FUNCTION_EDEFAULT;

  /**
	 * The default value of the '{@link #getOptimizer() <em>Optimizer</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOptimizer()
	 * @generated
	 * @ordered
	 */
  protected static final Optimizer OPTIMIZER_EDEFAULT = Optimizer.ADAM;

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
	 * The default value of the '{@link #getLearning_rate() <em>Learning rate</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLearning_rate()
	 * @generated
	 * @ordered
	 */
  protected static final double LEARNING_RATE_EDEFAULT = 0.0;

  /**
	 * The cached value of the '{@link #getLearning_rate() <em>Learning rate</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLearning_rate()
	 * @generated
	 * @ordered
	 */
  protected double learning_rate = LEARNING_RATE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected LongShortTermMemoryImpl()
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
		return ThingMLPackage.Literals.LONG_SHORT_TERM_MEMORY;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public LossFunction getLoss_function()
  {
		return loss_function;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setLoss_function(LossFunction newLoss_function)
  {
		LossFunction oldLoss_function = loss_function;
		loss_function = newLoss_function == null ? LOSS_FUNCTION_EDEFAULT : newLoss_function;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.LONG_SHORT_TERM_MEMORY__LOSS_FUNCTION, oldLoss_function, loss_function));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Optimizer getOptimizer()
  {
		return optimizer;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setOptimizer(Optimizer newOptimizer)
  {
		Optimizer oldOptimizer = optimizer;
		optimizer = newOptimizer == null ? OPTIMIZER_EDEFAULT : newOptimizer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.LONG_SHORT_TERM_MEMORY__OPTIMIZER, oldOptimizer, optimizer));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public double getLearning_rate()
  {
		return learning_rate;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setLearning_rate(double newLearning_rate)
  {
		double oldLearning_rate = learning_rate;
		learning_rate = newLearning_rate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.LONG_SHORT_TERM_MEMORY__LEARNING_RATE, oldLearning_rate, learning_rate));
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
			case ThingMLPackage.LONG_SHORT_TERM_MEMORY__LOSS_FUNCTION:
				return getLoss_function();
			case ThingMLPackage.LONG_SHORT_TERM_MEMORY__OPTIMIZER:
				return getOptimizer();
			case ThingMLPackage.LONG_SHORT_TERM_MEMORY__LEARNING_RATE:
				return getLearning_rate();
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
			case ThingMLPackage.LONG_SHORT_TERM_MEMORY__LOSS_FUNCTION:
				setLoss_function((LossFunction)newValue);
				return;
			case ThingMLPackage.LONG_SHORT_TERM_MEMORY__OPTIMIZER:
				setOptimizer((Optimizer)newValue);
				return;
			case ThingMLPackage.LONG_SHORT_TERM_MEMORY__LEARNING_RATE:
				setLearning_rate((Double)newValue);
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
			case ThingMLPackage.LONG_SHORT_TERM_MEMORY__LOSS_FUNCTION:
				setLoss_function(LOSS_FUNCTION_EDEFAULT);
				return;
			case ThingMLPackage.LONG_SHORT_TERM_MEMORY__OPTIMIZER:
				setOptimizer(OPTIMIZER_EDEFAULT);
				return;
			case ThingMLPackage.LONG_SHORT_TERM_MEMORY__LEARNING_RATE:
				setLearning_rate(LEARNING_RATE_EDEFAULT);
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
			case ThingMLPackage.LONG_SHORT_TERM_MEMORY__LOSS_FUNCTION:
				return loss_function != LOSS_FUNCTION_EDEFAULT;
			case ThingMLPackage.LONG_SHORT_TERM_MEMORY__OPTIMIZER:
				return optimizer != OPTIMIZER_EDEFAULT;
			case ThingMLPackage.LONG_SHORT_TERM_MEMORY__LEARNING_RATE:
				return learning_rate != LEARNING_RATE_EDEFAULT;
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
		result.append(" (loss_function: ");
		result.append(loss_function);
		result.append(", optimizer: ");
		result.append(optimizer);
		result.append(", learning_rate: ");
		result.append(learning_rate);
		result.append(')');
		return result.toString();
	}

} //LongShortTermMemoryImpl
