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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.thingml.xtext.thingML.BooleanLiteral;
import org.thingml.xtext.thingML.DoubleLiteral;
import org.thingml.xtext.thingML.IntegerLiteral;
import org.thingml.xtext.thingML.LinearClassifierLogisticRegression;
import org.thingml.xtext.thingML.Multi_class;
import org.thingml.xtext.thingML.Optimizer;
import org.thingml.xtext.thingML.Penalty;
import org.thingml.xtext.thingML.ThingMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linear Classifier Logistic Regression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.impl.LinearClassifierLogisticRegressionImpl#getPenalty <em>Penalty</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.LinearClassifierLogisticRegressionImpl#getDual <em>Dual</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.LinearClassifierLogisticRegressionImpl#getTol <em>Tol</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.LinearClassifierLogisticRegressionImpl#getC <em>C</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.LinearClassifierLogisticRegressionImpl#getFit_intercept <em>Fit intercept</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.LinearClassifierLogisticRegressionImpl#getIntercept_scaling <em>Intercept scaling</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.LinearClassifierLogisticRegressionImpl#getClass_weight <em>Class weight</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.LinearClassifierLogisticRegressionImpl#getRandom_state <em>Random state</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.LinearClassifierLogisticRegressionImpl#getOptimizer <em>Optimizer</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.LinearClassifierLogisticRegressionImpl#getMax_iter <em>Max iter</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.LinearClassifierLogisticRegressionImpl#getMulti_class <em>Multi class</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.LinearClassifierLogisticRegressionImpl#getVerbose <em>Verbose</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.LinearClassifierLogisticRegressionImpl#getWarm_start <em>Warm start</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.LinearClassifierLogisticRegressionImpl#getN_jobs <em>Njobs</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.LinearClassifierLogisticRegressionImpl#getL1_ratio <em>L1 ratio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinearClassifierLogisticRegressionImpl extends ML2_ModelAlgorithmImpl implements LinearClassifierLogisticRegression
{
  /**
   * The default value of the '{@link #getPenalty() <em>Penalty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPenalty()
   * @generated
   * @ordered
   */
  protected static final Penalty PENALTY_EDEFAULT = Penalty.NOT_SET;

  /**
   * The cached value of the '{@link #getPenalty() <em>Penalty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPenalty()
   * @generated
   * @ordered
   */
  protected Penalty penalty = PENALTY_EDEFAULT;

  /**
   * The cached value of the '{@link #getDual() <em>Dual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDual()
   * @generated
   * @ordered
   */
  protected BooleanLiteral dual;

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
   * The cached value of the '{@link #getC() <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC()
   * @generated
   * @ordered
   */
  protected DoubleLiteral c;

  /**
   * The cached value of the '{@link #getFit_intercept() <em>Fit intercept</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFit_intercept()
   * @generated
   * @ordered
   */
  protected BooleanLiteral fit_intercept;

  /**
   * The cached value of the '{@link #getIntercept_scaling() <em>Intercept scaling</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntercept_scaling()
   * @generated
   * @ordered
   */
  protected DoubleLiteral intercept_scaling;

  /**
   * The default value of the '{@link #getClass_weight() <em>Class weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_weight()
   * @generated
   * @ordered
   */
  protected static final String CLASS_WEIGHT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClass_weight() <em>Class weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_weight()
   * @generated
   * @ordered
   */
  protected String class_weight = CLASS_WEIGHT_EDEFAULT;

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
   * The cached value of the '{@link #getMax_iter() <em>Max iter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax_iter()
   * @generated
   * @ordered
   */
  protected IntegerLiteral max_iter;

  /**
   * The default value of the '{@link #getMulti_class() <em>Multi class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMulti_class()
   * @generated
   * @ordered
   */
  protected static final Multi_class MULTI_CLASS_EDEFAULT = Multi_class.NOT_SET;

  /**
   * The cached value of the '{@link #getMulti_class() <em>Multi class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMulti_class()
   * @generated
   * @ordered
   */
  protected Multi_class multi_class = MULTI_CLASS_EDEFAULT;

  /**
   * The cached value of the '{@link #getVerbose() <em>Verbose</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerbose()
   * @generated
   * @ordered
   */
  protected IntegerLiteral verbose;

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
   * The cached value of the '{@link #getN_jobs() <em>Njobs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN_jobs()
   * @generated
   * @ordered
   */
  protected IntegerLiteral n_jobs;

  /**
   * The cached value of the '{@link #getL1_ratio() <em>L1 ratio</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL1_ratio()
   * @generated
   * @ordered
   */
  protected DoubleLiteral l1_ratio;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinearClassifierLogisticRegressionImpl()
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
    return ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Penalty getPenalty()
  {
    return penalty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPenalty(Penalty newPenalty)
  {
    Penalty oldPenalty = penalty;
    penalty = newPenalty == null ? PENALTY_EDEFAULT : newPenalty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__PENALTY, oldPenalty, penalty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral getDual()
  {
    return dual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDual(BooleanLiteral newDual, NotificationChain msgs)
  {
    BooleanLiteral oldDual = dual;
    dual = newDual;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__DUAL, oldDual, newDual);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDual(BooleanLiteral newDual)
  {
    if (newDual != dual)
    {
      NotificationChain msgs = null;
      if (dual != null)
        msgs = ((InternalEObject)dual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__DUAL, null, msgs);
      if (newDual != null)
        msgs = ((InternalEObject)newDual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__DUAL, null, msgs);
      msgs = basicSetDual(newDual, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__DUAL, newDual, newDual));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__TOL, oldTol, newTol);
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
        msgs = ((InternalEObject)tol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__TOL, null, msgs);
      if (newTol != null)
        msgs = ((InternalEObject)newTol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__TOL, null, msgs);
      msgs = basicSetTol(newTol, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__TOL, newTol, newTol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleLiteral getC()
  {
    return c;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC(DoubleLiteral newC, NotificationChain msgs)
  {
    DoubleLiteral oldC = c;
    c = newC;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__C, oldC, newC);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC(DoubleLiteral newC)
  {
    if (newC != c)
    {
      NotificationChain msgs = null;
      if (c != null)
        msgs = ((InternalEObject)c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__C, null, msgs);
      if (newC != null)
        msgs = ((InternalEObject)newC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__C, null, msgs);
      msgs = basicSetC(newC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__C, newC, newC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral getFit_intercept()
  {
    return fit_intercept;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFit_intercept(BooleanLiteral newFit_intercept, NotificationChain msgs)
  {
    BooleanLiteral oldFit_intercept = fit_intercept;
    fit_intercept = newFit_intercept;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__FIT_INTERCEPT, oldFit_intercept, newFit_intercept);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFit_intercept(BooleanLiteral newFit_intercept)
  {
    if (newFit_intercept != fit_intercept)
    {
      NotificationChain msgs = null;
      if (fit_intercept != null)
        msgs = ((InternalEObject)fit_intercept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__FIT_INTERCEPT, null, msgs);
      if (newFit_intercept != null)
        msgs = ((InternalEObject)newFit_intercept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__FIT_INTERCEPT, null, msgs);
      msgs = basicSetFit_intercept(newFit_intercept, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__FIT_INTERCEPT, newFit_intercept, newFit_intercept));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleLiteral getIntercept_scaling()
  {
    return intercept_scaling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIntercept_scaling(DoubleLiteral newIntercept_scaling, NotificationChain msgs)
  {
    DoubleLiteral oldIntercept_scaling = intercept_scaling;
    intercept_scaling = newIntercept_scaling;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__INTERCEPT_SCALING, oldIntercept_scaling, newIntercept_scaling);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntercept_scaling(DoubleLiteral newIntercept_scaling)
  {
    if (newIntercept_scaling != intercept_scaling)
    {
      NotificationChain msgs = null;
      if (intercept_scaling != null)
        msgs = ((InternalEObject)intercept_scaling).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__INTERCEPT_SCALING, null, msgs);
      if (newIntercept_scaling != null)
        msgs = ((InternalEObject)newIntercept_scaling).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__INTERCEPT_SCALING, null, msgs);
      msgs = basicSetIntercept_scaling(newIntercept_scaling, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__INTERCEPT_SCALING, newIntercept_scaling, newIntercept_scaling));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClass_weight()
  {
    return class_weight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass_weight(String newClass_weight)
  {
    String oldClass_weight = class_weight;
    class_weight = newClass_weight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__CLASS_WEIGHT, oldClass_weight, class_weight));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__RANDOM_STATE, oldRandom_state, newRandom_state);
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
        msgs = ((InternalEObject)random_state).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__RANDOM_STATE, null, msgs);
      if (newRandom_state != null)
        msgs = ((InternalEObject)newRandom_state).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__RANDOM_STATE, null, msgs);
      msgs = basicSetRandom_state(newRandom_state, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__RANDOM_STATE, newRandom_state, newRandom_state));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__OPTIMIZER, oldOptimizer, optimizer));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__MAX_ITER, oldMax_iter, newMax_iter);
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
        msgs = ((InternalEObject)max_iter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__MAX_ITER, null, msgs);
      if (newMax_iter != null)
        msgs = ((InternalEObject)newMax_iter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__MAX_ITER, null, msgs);
      msgs = basicSetMax_iter(newMax_iter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__MAX_ITER, newMax_iter, newMax_iter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multi_class getMulti_class()
  {
    return multi_class;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMulti_class(Multi_class newMulti_class)
  {
    Multi_class oldMulti_class = multi_class;
    multi_class = newMulti_class == null ? MULTI_CLASS_EDEFAULT : newMulti_class;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__MULTI_CLASS, oldMulti_class, multi_class));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral getVerbose()
  {
    return verbose;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVerbose(IntegerLiteral newVerbose, NotificationChain msgs)
  {
    IntegerLiteral oldVerbose = verbose;
    verbose = newVerbose;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__VERBOSE, oldVerbose, newVerbose);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVerbose(IntegerLiteral newVerbose)
  {
    if (newVerbose != verbose)
    {
      NotificationChain msgs = null;
      if (verbose != null)
        msgs = ((InternalEObject)verbose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__VERBOSE, null, msgs);
      if (newVerbose != null)
        msgs = ((InternalEObject)newVerbose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__VERBOSE, null, msgs);
      msgs = basicSetVerbose(newVerbose, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__VERBOSE, newVerbose, newVerbose));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__WARM_START, oldWarm_start, newWarm_start);
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
        msgs = ((InternalEObject)warm_start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__WARM_START, null, msgs);
      if (newWarm_start != null)
        msgs = ((InternalEObject)newWarm_start).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__WARM_START, null, msgs);
      msgs = basicSetWarm_start(newWarm_start, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__WARM_START, newWarm_start, newWarm_start));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral getN_jobs()
  {
    return n_jobs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetN_jobs(IntegerLiteral newN_jobs, NotificationChain msgs)
  {
    IntegerLiteral oldN_jobs = n_jobs;
    n_jobs = newN_jobs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__NJOBS, oldN_jobs, newN_jobs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setN_jobs(IntegerLiteral newN_jobs)
  {
    if (newN_jobs != n_jobs)
    {
      NotificationChain msgs = null;
      if (n_jobs != null)
        msgs = ((InternalEObject)n_jobs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__NJOBS, null, msgs);
      if (newN_jobs != null)
        msgs = ((InternalEObject)newN_jobs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__NJOBS, null, msgs);
      msgs = basicSetN_jobs(newN_jobs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__NJOBS, newN_jobs, newN_jobs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleLiteral getL1_ratio()
  {
    return l1_ratio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetL1_ratio(DoubleLiteral newL1_ratio, NotificationChain msgs)
  {
    DoubleLiteral oldL1_ratio = l1_ratio;
    l1_ratio = newL1_ratio;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__L1_RATIO, oldL1_ratio, newL1_ratio);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setL1_ratio(DoubleLiteral newL1_ratio)
  {
    if (newL1_ratio != l1_ratio)
    {
      NotificationChain msgs = null;
      if (l1_ratio != null)
        msgs = ((InternalEObject)l1_ratio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__L1_RATIO, null, msgs);
      if (newL1_ratio != null)
        msgs = ((InternalEObject)newL1_ratio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__L1_RATIO, null, msgs);
      msgs = basicSetL1_ratio(newL1_ratio, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__L1_RATIO, newL1_ratio, newL1_ratio));
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
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__DUAL:
        return basicSetDual(null, msgs);
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__TOL:
        return basicSetTol(null, msgs);
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__C:
        return basicSetC(null, msgs);
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__FIT_INTERCEPT:
        return basicSetFit_intercept(null, msgs);
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__INTERCEPT_SCALING:
        return basicSetIntercept_scaling(null, msgs);
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__RANDOM_STATE:
        return basicSetRandom_state(null, msgs);
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__MAX_ITER:
        return basicSetMax_iter(null, msgs);
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__VERBOSE:
        return basicSetVerbose(null, msgs);
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__WARM_START:
        return basicSetWarm_start(null, msgs);
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__NJOBS:
        return basicSetN_jobs(null, msgs);
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__L1_RATIO:
        return basicSetL1_ratio(null, msgs);
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
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__PENALTY:
        return getPenalty();
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__DUAL:
        return getDual();
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__TOL:
        return getTol();
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__C:
        return getC();
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__FIT_INTERCEPT:
        return getFit_intercept();
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__INTERCEPT_SCALING:
        return getIntercept_scaling();
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__CLASS_WEIGHT:
        return getClass_weight();
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__RANDOM_STATE:
        return getRandom_state();
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__OPTIMIZER:
        return getOptimizer();
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__MAX_ITER:
        return getMax_iter();
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__MULTI_CLASS:
        return getMulti_class();
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__VERBOSE:
        return getVerbose();
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__WARM_START:
        return getWarm_start();
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__NJOBS:
        return getN_jobs();
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__L1_RATIO:
        return getL1_ratio();
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
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__PENALTY:
        setPenalty((Penalty)newValue);
        return;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__DUAL:
        setDual((BooleanLiteral)newValue);
        return;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__TOL:
        setTol((DoubleLiteral)newValue);
        return;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__C:
        setC((DoubleLiteral)newValue);
        return;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__FIT_INTERCEPT:
        setFit_intercept((BooleanLiteral)newValue);
        return;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__INTERCEPT_SCALING:
        setIntercept_scaling((DoubleLiteral)newValue);
        return;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__CLASS_WEIGHT:
        setClass_weight((String)newValue);
        return;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__RANDOM_STATE:
        setRandom_state((IntegerLiteral)newValue);
        return;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__OPTIMIZER:
        setOptimizer((Optimizer)newValue);
        return;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__MAX_ITER:
        setMax_iter((IntegerLiteral)newValue);
        return;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__MULTI_CLASS:
        setMulti_class((Multi_class)newValue);
        return;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__VERBOSE:
        setVerbose((IntegerLiteral)newValue);
        return;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__WARM_START:
        setWarm_start((BooleanLiteral)newValue);
        return;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__NJOBS:
        setN_jobs((IntegerLiteral)newValue);
        return;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__L1_RATIO:
        setL1_ratio((DoubleLiteral)newValue);
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
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__PENALTY:
        setPenalty(PENALTY_EDEFAULT);
        return;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__DUAL:
        setDual((BooleanLiteral)null);
        return;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__TOL:
        setTol((DoubleLiteral)null);
        return;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__C:
        setC((DoubleLiteral)null);
        return;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__FIT_INTERCEPT:
        setFit_intercept((BooleanLiteral)null);
        return;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__INTERCEPT_SCALING:
        setIntercept_scaling((DoubleLiteral)null);
        return;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__CLASS_WEIGHT:
        setClass_weight(CLASS_WEIGHT_EDEFAULT);
        return;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__RANDOM_STATE:
        setRandom_state((IntegerLiteral)null);
        return;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__OPTIMIZER:
        setOptimizer(OPTIMIZER_EDEFAULT);
        return;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__MAX_ITER:
        setMax_iter((IntegerLiteral)null);
        return;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__MULTI_CLASS:
        setMulti_class(MULTI_CLASS_EDEFAULT);
        return;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__VERBOSE:
        setVerbose((IntegerLiteral)null);
        return;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__WARM_START:
        setWarm_start((BooleanLiteral)null);
        return;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__NJOBS:
        setN_jobs((IntegerLiteral)null);
        return;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__L1_RATIO:
        setL1_ratio((DoubleLiteral)null);
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
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__PENALTY:
        return penalty != PENALTY_EDEFAULT;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__DUAL:
        return dual != null;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__TOL:
        return tol != null;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__C:
        return c != null;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__FIT_INTERCEPT:
        return fit_intercept != null;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__INTERCEPT_SCALING:
        return intercept_scaling != null;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__CLASS_WEIGHT:
        return CLASS_WEIGHT_EDEFAULT == null ? class_weight != null : !CLASS_WEIGHT_EDEFAULT.equals(class_weight);
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__RANDOM_STATE:
        return random_state != null;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__OPTIMIZER:
        return optimizer != OPTIMIZER_EDEFAULT;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__MAX_ITER:
        return max_iter != null;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__MULTI_CLASS:
        return multi_class != MULTI_CLASS_EDEFAULT;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__VERBOSE:
        return verbose != null;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__WARM_START:
        return warm_start != null;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__NJOBS:
        return n_jobs != null;
      case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__L1_RATIO:
        return l1_ratio != null;
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
    result.append(" (penalty: ");
    result.append(penalty);
    result.append(", class_weight: ");
    result.append(class_weight);
    result.append(", optimizer: ");
    result.append(optimizer);
    result.append(", multi_class: ");
    result.append(multi_class);
    result.append(')');
    return result.toString();
  }

} //LinearClassifierLogisticRegressionImpl
