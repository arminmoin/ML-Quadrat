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
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.thingml.xtext.thingML.DASaveAction;
import org.thingml.xtext.thingML.DataAnalytics;
import org.thingml.xtext.thingML.ThingMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DA Save Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.impl.DASaveActionImpl#getDataAnalytics <em>Data Analytics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DASaveActionImpl extends ActionImpl implements DASaveAction
{
  /**
   * The cached value of the '{@link #getDataAnalytics() <em>Data Analytics</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataAnalytics()
   * @generated
   * @ordered
   */
  protected DataAnalytics dataAnalytics;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DASaveActionImpl()
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
    return ThingMLPackage.Literals.DA_SAVE_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataAnalytics getDataAnalytics()
  {
    if (dataAnalytics != null && dataAnalytics.eIsProxy())
    {
      InternalEObject oldDataAnalytics = (InternalEObject)dataAnalytics;
      dataAnalytics = (DataAnalytics)eResolveProxy(oldDataAnalytics);
      if (dataAnalytics != oldDataAnalytics)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ThingMLPackage.DA_SAVE_ACTION__DATA_ANALYTICS, oldDataAnalytics, dataAnalytics));
      }
    }
    return dataAnalytics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataAnalytics basicGetDataAnalytics()
  {
    return dataAnalytics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataAnalytics(DataAnalytics newDataAnalytics)
  {
    DataAnalytics oldDataAnalytics = dataAnalytics;
    dataAnalytics = newDataAnalytics;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DA_SAVE_ACTION__DATA_ANALYTICS, oldDataAnalytics, dataAnalytics));
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
      case ThingMLPackage.DA_SAVE_ACTION__DATA_ANALYTICS:
        if (resolve) return getDataAnalytics();
        return basicGetDataAnalytics();
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
      case ThingMLPackage.DA_SAVE_ACTION__DATA_ANALYTICS:
        setDataAnalytics((DataAnalytics)newValue);
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
      case ThingMLPackage.DA_SAVE_ACTION__DATA_ANALYTICS:
        setDataAnalytics((DataAnalytics)null);
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
      case ThingMLPackage.DA_SAVE_ACTION__DATA_ANALYTICS:
        return dataAnalytics != null;
    }
    return super.eIsSet(featureID);
  }

} //DASaveActionImpl
