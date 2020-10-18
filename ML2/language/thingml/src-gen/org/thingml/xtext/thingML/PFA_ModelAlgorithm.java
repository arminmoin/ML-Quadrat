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
 * A representation of the model object '<em><b>PFA Model Algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.PFA_ModelAlgorithm#getPfa_path <em>Pfa path</em>}</li>
 * </ul>
 *
 * @see org.thingml.xtext.thingML.ThingMLPackage#getPFA_ModelAlgorithm()
 * @model
 * @generated
 */
public interface PFA_ModelAlgorithm extends DataAnalyticsModelAlgorithm
{
  /**
   * Returns the value of the '<em><b>Pfa path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pfa path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pfa path</em>' attribute.
   * @see #setPfa_path(String)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getPFA_ModelAlgorithm_Pfa_path()
   * @model
   * @generated
   */
  String getPfa_path();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.PFA_ModelAlgorithm#getPfa_path <em>Pfa path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pfa path</em>' attribute.
   * @see #getPfa_path()
   * @generated
   */
  void setPfa_path(String value);

} // PFA_ModelAlgorithm
