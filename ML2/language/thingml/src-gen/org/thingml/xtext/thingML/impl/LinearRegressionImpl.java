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
import org.thingml.xtext.thingML.IntegerLiteral;
import org.thingml.xtext.thingML.LinearRegression;
import org.thingml.xtext.thingML.ThingMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linear Regression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.impl.LinearRegressionImpl#getFit_intercept <em>Fit intercept</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.LinearRegressionImpl#getNormalize <em>Normalize</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.LinearRegressionImpl#getCopy_X <em>Copy X</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.LinearRegressionImpl#getN_jobs <em>Njobs</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.LinearRegressionImpl#getPositive <em>Positive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinearRegressionImpl extends ML2_ModelAlgorithmImpl implements LinearRegression
{
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
   * The cached value of the '{@link #getNormalize() <em>Normalize</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNormalize()
   * @generated
   * @ordered
   */
  protected BooleanLiteral normalize;

  /**
   * The cached value of the '{@link #getCopy_X() <em>Copy X</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCopy_X()
   * @generated
   * @ordered
   */
  protected BooleanLiteral copy_X;

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
   * The cached value of the '{@link #getPositive() <em>Positive</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPositive()
   * @generated
   * @ordered
   */
  protected BooleanLiteral positive;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinearRegressionImpl()
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
    return ThingMLPackage.eINSTANCE.getLinearRegression();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_REGRESSION__FIT_INTERCEPT, oldFit_intercept, newFit_intercept);
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
        msgs = ((InternalEObject)fit_intercept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_REGRESSION__FIT_INTERCEPT, null, msgs);
      if (newFit_intercept != null)
        msgs = ((InternalEObject)newFit_intercept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_REGRESSION__FIT_INTERCEPT, null, msgs);
      msgs = basicSetFit_intercept(newFit_intercept, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_REGRESSION__FIT_INTERCEPT, newFit_intercept, newFit_intercept));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral getNormalize()
  {
    return normalize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNormalize(BooleanLiteral newNormalize, NotificationChain msgs)
  {
    BooleanLiteral oldNormalize = normalize;
    normalize = newNormalize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_REGRESSION__NORMALIZE, oldNormalize, newNormalize);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNormalize(BooleanLiteral newNormalize)
  {
    if (newNormalize != normalize)
    {
      NotificationChain msgs = null;
      if (normalize != null)
        msgs = ((InternalEObject)normalize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_REGRESSION__NORMALIZE, null, msgs);
      if (newNormalize != null)
        msgs = ((InternalEObject)newNormalize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_REGRESSION__NORMALIZE, null, msgs);
      msgs = basicSetNormalize(newNormalize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_REGRESSION__NORMALIZE, newNormalize, newNormalize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral getCopy_X()
  {
    return copy_X;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCopy_X(BooleanLiteral newCopy_X, NotificationChain msgs)
  {
    BooleanLiteral oldCopy_X = copy_X;
    copy_X = newCopy_X;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_REGRESSION__COPY_X, oldCopy_X, newCopy_X);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCopy_X(BooleanLiteral newCopy_X)
  {
    if (newCopy_X != copy_X)
    {
      NotificationChain msgs = null;
      if (copy_X != null)
        msgs = ((InternalEObject)copy_X).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_REGRESSION__COPY_X, null, msgs);
      if (newCopy_X != null)
        msgs = ((InternalEObject)newCopy_X).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_REGRESSION__COPY_X, null, msgs);
      msgs = basicSetCopy_X(newCopy_X, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_REGRESSION__COPY_X, newCopy_X, newCopy_X));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_REGRESSION__NJOBS, oldN_jobs, newN_jobs);
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
        msgs = ((InternalEObject)n_jobs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_REGRESSION__NJOBS, null, msgs);
      if (newN_jobs != null)
        msgs = ((InternalEObject)newN_jobs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_REGRESSION__NJOBS, null, msgs);
      msgs = basicSetN_jobs(newN_jobs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_REGRESSION__NJOBS, newN_jobs, newN_jobs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral getPositive()
  {
    return positive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPositive(BooleanLiteral newPositive, NotificationChain msgs)
  {
    BooleanLiteral oldPositive = positive;
    positive = newPositive;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_REGRESSION__POSITIVE, oldPositive, newPositive);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPositive(BooleanLiteral newPositive)
  {
    if (newPositive != positive)
    {
      NotificationChain msgs = null;
      if (positive != null)
        msgs = ((InternalEObject)positive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_REGRESSION__POSITIVE, null, msgs);
      if (newPositive != null)
        msgs = ((InternalEObject)newPositive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.LINEAR_REGRESSION__POSITIVE, null, msgs);
      msgs = basicSetPositive(newPositive, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.LINEAR_REGRESSION__POSITIVE, newPositive, newPositive));
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
      case ThingMLPackage.LINEAR_REGRESSION__FIT_INTERCEPT:
        return basicSetFit_intercept(null, msgs);
      case ThingMLPackage.LINEAR_REGRESSION__NORMALIZE:
        return basicSetNormalize(null, msgs);
      case ThingMLPackage.LINEAR_REGRESSION__COPY_X:
        return basicSetCopy_X(null, msgs);
      case ThingMLPackage.LINEAR_REGRESSION__NJOBS:
        return basicSetN_jobs(null, msgs);
      case ThingMLPackage.LINEAR_REGRESSION__POSITIVE:
        return basicSetPositive(null, msgs);
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
      case ThingMLPackage.LINEAR_REGRESSION__FIT_INTERCEPT:
        return getFit_intercept();
      case ThingMLPackage.LINEAR_REGRESSION__NORMALIZE:
        return getNormalize();
      case ThingMLPackage.LINEAR_REGRESSION__COPY_X:
        return getCopy_X();
      case ThingMLPackage.LINEAR_REGRESSION__NJOBS:
        return getN_jobs();
      case ThingMLPackage.LINEAR_REGRESSION__POSITIVE:
        return getPositive();
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
      case ThingMLPackage.LINEAR_REGRESSION__FIT_INTERCEPT:
        setFit_intercept((BooleanLiteral)newValue);
        return;
      case ThingMLPackage.LINEAR_REGRESSION__NORMALIZE:
        setNormalize((BooleanLiteral)newValue);
        return;
      case ThingMLPackage.LINEAR_REGRESSION__COPY_X:
        setCopy_X((BooleanLiteral)newValue);
        return;
      case ThingMLPackage.LINEAR_REGRESSION__NJOBS:
        setN_jobs((IntegerLiteral)newValue);
        return;
      case ThingMLPackage.LINEAR_REGRESSION__POSITIVE:
        setPositive((BooleanLiteral)newValue);
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
      case ThingMLPackage.LINEAR_REGRESSION__FIT_INTERCEPT:
        setFit_intercept((BooleanLiteral)null);
        return;
      case ThingMLPackage.LINEAR_REGRESSION__NORMALIZE:
        setNormalize((BooleanLiteral)null);
        return;
      case ThingMLPackage.LINEAR_REGRESSION__COPY_X:
        setCopy_X((BooleanLiteral)null);
        return;
      case ThingMLPackage.LINEAR_REGRESSION__NJOBS:
        setN_jobs((IntegerLiteral)null);
        return;
      case ThingMLPackage.LINEAR_REGRESSION__POSITIVE:
        setPositive((BooleanLiteral)null);
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
      case ThingMLPackage.LINEAR_REGRESSION__FIT_INTERCEPT:
        return fit_intercept != null;
      case ThingMLPackage.LINEAR_REGRESSION__NORMALIZE:
        return normalize != null;
      case ThingMLPackage.LINEAR_REGRESSION__COPY_X:
        return copy_X != null;
      case ThingMLPackage.LINEAR_REGRESSION__NJOBS:
        return n_jobs != null;
      case ThingMLPackage.LINEAR_REGRESSION__POSITIVE:
        return positive != null;
    }
    return super.eIsSet(featureID);
  }

} //LinearRegressionImpl
