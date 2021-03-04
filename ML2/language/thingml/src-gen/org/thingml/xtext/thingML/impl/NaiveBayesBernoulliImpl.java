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
import org.thingml.xtext.thingML.NaiveBayesBernoulli;
import org.thingml.xtext.thingML.ThingMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Naive Bayes Bernoulli</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.impl.NaiveBayesBernoulliImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NaiveBayesBernoulliImpl#getBinarize <em>Binarize</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NaiveBayesBernoulliImpl#getFit_prior <em>Fit prior</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.NaiveBayesBernoulliImpl#getClass_prior <em>Class prior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NaiveBayesBernoulliImpl extends ML2_ModelAlgorithmImpl implements NaiveBayesBernoulli
{
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
   * The cached value of the '{@link #getBinarize() <em>Binarize</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBinarize()
   * @generated
   * @ordered
   */
  protected DoubleLiteral binarize;

  /**
   * The cached value of the '{@link #getFit_prior() <em>Fit prior</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFit_prior()
   * @generated
   * @ordered
   */
  protected BooleanLiteral fit_prior;

  /**
   * The default value of the '{@link #getClass_prior() <em>Class prior</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_prior()
   * @generated
   * @ordered
   */
  protected static final String CLASS_PRIOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClass_prior() <em>Class prior</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_prior()
   * @generated
   * @ordered
   */
  protected String class_prior = CLASS_PRIOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NaiveBayesBernoulliImpl()
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
    return ThingMLPackage.eINSTANCE.getNaiveBayesBernoulli();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.NAIVE_BAYES_BERNOULLI__ALPHA, oldAlpha, newAlpha);
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
        msgs = ((InternalEObject)alpha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NAIVE_BAYES_BERNOULLI__ALPHA, null, msgs);
      if (newAlpha != null)
        msgs = ((InternalEObject)newAlpha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NAIVE_BAYES_BERNOULLI__ALPHA, null, msgs);
      msgs = basicSetAlpha(newAlpha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NAIVE_BAYES_BERNOULLI__ALPHA, newAlpha, newAlpha));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleLiteral getBinarize()
  {
    return binarize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBinarize(DoubleLiteral newBinarize, NotificationChain msgs)
  {
    DoubleLiteral oldBinarize = binarize;
    binarize = newBinarize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.NAIVE_BAYES_BERNOULLI__BINARIZE, oldBinarize, newBinarize);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBinarize(DoubleLiteral newBinarize)
  {
    if (newBinarize != binarize)
    {
      NotificationChain msgs = null;
      if (binarize != null)
        msgs = ((InternalEObject)binarize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NAIVE_BAYES_BERNOULLI__BINARIZE, null, msgs);
      if (newBinarize != null)
        msgs = ((InternalEObject)newBinarize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NAIVE_BAYES_BERNOULLI__BINARIZE, null, msgs);
      msgs = basicSetBinarize(newBinarize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NAIVE_BAYES_BERNOULLI__BINARIZE, newBinarize, newBinarize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral getFit_prior()
  {
    return fit_prior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFit_prior(BooleanLiteral newFit_prior, NotificationChain msgs)
  {
    BooleanLiteral oldFit_prior = fit_prior;
    fit_prior = newFit_prior;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.NAIVE_BAYES_BERNOULLI__FIT_PRIOR, oldFit_prior, newFit_prior);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFit_prior(BooleanLiteral newFit_prior)
  {
    if (newFit_prior != fit_prior)
    {
      NotificationChain msgs = null;
      if (fit_prior != null)
        msgs = ((InternalEObject)fit_prior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NAIVE_BAYES_BERNOULLI__FIT_PRIOR, null, msgs);
      if (newFit_prior != null)
        msgs = ((InternalEObject)newFit_prior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.NAIVE_BAYES_BERNOULLI__FIT_PRIOR, null, msgs);
      msgs = basicSetFit_prior(newFit_prior, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NAIVE_BAYES_BERNOULLI__FIT_PRIOR, newFit_prior, newFit_prior));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClass_prior()
  {
    return class_prior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass_prior(String newClass_prior)
  {
    String oldClass_prior = class_prior;
    class_prior = newClass_prior;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.NAIVE_BAYES_BERNOULLI__CLASS_PRIOR, oldClass_prior, class_prior));
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
      case ThingMLPackage.NAIVE_BAYES_BERNOULLI__ALPHA:
        return basicSetAlpha(null, msgs);
      case ThingMLPackage.NAIVE_BAYES_BERNOULLI__BINARIZE:
        return basicSetBinarize(null, msgs);
      case ThingMLPackage.NAIVE_BAYES_BERNOULLI__FIT_PRIOR:
        return basicSetFit_prior(null, msgs);
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
      case ThingMLPackage.NAIVE_BAYES_BERNOULLI__ALPHA:
        return getAlpha();
      case ThingMLPackage.NAIVE_BAYES_BERNOULLI__BINARIZE:
        return getBinarize();
      case ThingMLPackage.NAIVE_BAYES_BERNOULLI__FIT_PRIOR:
        return getFit_prior();
      case ThingMLPackage.NAIVE_BAYES_BERNOULLI__CLASS_PRIOR:
        return getClass_prior();
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
      case ThingMLPackage.NAIVE_BAYES_BERNOULLI__ALPHA:
        setAlpha((DoubleLiteral)newValue);
        return;
      case ThingMLPackage.NAIVE_BAYES_BERNOULLI__BINARIZE:
        setBinarize((DoubleLiteral)newValue);
        return;
      case ThingMLPackage.NAIVE_BAYES_BERNOULLI__FIT_PRIOR:
        setFit_prior((BooleanLiteral)newValue);
        return;
      case ThingMLPackage.NAIVE_BAYES_BERNOULLI__CLASS_PRIOR:
        setClass_prior((String)newValue);
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
      case ThingMLPackage.NAIVE_BAYES_BERNOULLI__ALPHA:
        setAlpha((DoubleLiteral)null);
        return;
      case ThingMLPackage.NAIVE_BAYES_BERNOULLI__BINARIZE:
        setBinarize((DoubleLiteral)null);
        return;
      case ThingMLPackage.NAIVE_BAYES_BERNOULLI__FIT_PRIOR:
        setFit_prior((BooleanLiteral)null);
        return;
      case ThingMLPackage.NAIVE_BAYES_BERNOULLI__CLASS_PRIOR:
        setClass_prior(CLASS_PRIOR_EDEFAULT);
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
      case ThingMLPackage.NAIVE_BAYES_BERNOULLI__ALPHA:
        return alpha != null;
      case ThingMLPackage.NAIVE_BAYES_BERNOULLI__BINARIZE:
        return binarize != null;
      case ThingMLPackage.NAIVE_BAYES_BERNOULLI__FIT_PRIOR:
        return fit_prior != null;
      case ThingMLPackage.NAIVE_BAYES_BERNOULLI__CLASS_PRIOR:
        return CLASS_PRIOR_EDEFAULT == null ? class_prior != null : !CLASS_PRIOR_EDEFAULT.equals(class_prior);
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
    result.append(" (class_prior: ");
    result.append(class_prior);
    result.append(')');
    return result.toString();
  }

} //NaiveBayesBernoulliImpl
