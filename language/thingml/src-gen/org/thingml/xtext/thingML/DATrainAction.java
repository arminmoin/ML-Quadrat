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
 * A representation of the model object '<em><b>DA Train Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.DATrainAction#getDataAnalytics <em>Data Analytics</em>}</li>
 * </ul>
 *
 * @see org.thingml.xtext.thingML.ThingMLPackage#getDATrainAction()
 * @model
 * @generated
 */
public interface DATrainAction extends Action
{
  /**
	 * Returns the value of the '<em><b>Data Analytics</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Analytics</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Analytics</em>' reference.
	 * @see #setDataAnalytics(DataAnalytics)
	 * @see org.thingml.xtext.thingML.ThingMLPackage#getDATrainAction_DataAnalytics()
	 * @model
	 * @generated
	 */
  DataAnalytics getDataAnalytics();

  /**
	 * Sets the value of the '{@link org.thingml.xtext.thingML.DATrainAction#getDataAnalytics <em>Data Analytics</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Analytics</em>' reference.
	 * @see #getDataAnalytics()
	 * @generated
	 */
  void setDataAnalytics(DataAnalytics value);

} // DATrainAction
