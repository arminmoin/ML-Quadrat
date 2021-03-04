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

import org.thingml.xtext.thingML.Pretrained_ML_Model;
import org.thingml.xtext.thingML.ThingMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pretrained ML Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.impl.Pretrained_ML_ModelImpl#getPretrained_path <em>Pretrained path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pretrained_ML_ModelImpl extends DataAnalyticsModelAlgorithmImpl implements Pretrained_ML_Model
{
  /**
   * The default value of the '{@link #getPretrained_path() <em>Pretrained path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPretrained_path()
   * @generated
   * @ordered
   */
  protected static final String PRETRAINED_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPretrained_path() <em>Pretrained path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPretrained_path()
   * @generated
   * @ordered
   */
  protected String pretrained_path = PRETRAINED_PATH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Pretrained_ML_ModelImpl()
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
    return ThingMLPackage.eINSTANCE.getPretrained_ML_Model();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPretrained_path()
  {
    return pretrained_path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPretrained_path(String newPretrained_path)
  {
    String oldPretrained_path = pretrained_path;
    pretrained_path = newPretrained_path;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.PRETRAINED_ML_MODEL__PRETRAINED_PATH, oldPretrained_path, pretrained_path));
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
      case ThingMLPackage.PRETRAINED_ML_MODEL__PRETRAINED_PATH:
        return getPretrained_path();
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
      case ThingMLPackage.PRETRAINED_ML_MODEL__PRETRAINED_PATH:
        setPretrained_path((String)newValue);
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
      case ThingMLPackage.PRETRAINED_ML_MODEL__PRETRAINED_PATH:
        setPretrained_path(PRETRAINED_PATH_EDEFAULT);
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
      case ThingMLPackage.PRETRAINED_ML_MODEL__PRETRAINED_PATH:
        return PRETRAINED_PATH_EDEFAULT == null ? pretrained_path != null : !PRETRAINED_PATH_EDEFAULT.equals(pretrained_path);
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
    result.append(" (pretrained_path: ");
    result.append(pretrained_path);
    result.append(')');
    return result.toString();
  }

} //Pretrained_ML_ModelImpl
