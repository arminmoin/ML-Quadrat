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
 * A representation of the model object '<em><b>Linear Regression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.LinearRegression#getFit_intercept <em>Fit intercept</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.LinearRegression#getNormalize <em>Normalize</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.LinearRegression#getCopy_X <em>Copy X</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.LinearRegression#getN_jobs <em>Njobs</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.LinearRegression#getPositive <em>Positive</em>}</li>
 * </ul>
 *
 * @see org.thingml.xtext.thingML.ThingMLPackage#getLinearRegression()
 * @model
 * @generated
 */
public interface LinearRegression extends ML2_ModelAlgorithm
{
  /**
   * Returns the value of the '<em><b>Fit intercept</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fit intercept</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fit intercept</em>' containment reference.
   * @see #setFit_intercept(BooleanLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getLinearRegression_Fit_intercept()
   * @model containment="true"
   * @generated
   */
  BooleanLiteral getFit_intercept();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.LinearRegression#getFit_intercept <em>Fit intercept</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fit intercept</em>' containment reference.
   * @see #getFit_intercept()
   * @generated
   */
  void setFit_intercept(BooleanLiteral value);

  /**
   * Returns the value of the '<em><b>Normalize</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Normalize</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Normalize</em>' containment reference.
   * @see #setNormalize(BooleanLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getLinearRegression_Normalize()
   * @model containment="true"
   * @generated
   */
  BooleanLiteral getNormalize();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.LinearRegression#getNormalize <em>Normalize</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Normalize</em>' containment reference.
   * @see #getNormalize()
   * @generated
   */
  void setNormalize(BooleanLiteral value);

  /**
   * Returns the value of the '<em><b>Copy X</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Copy X</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Copy X</em>' containment reference.
   * @see #setCopy_X(BooleanLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getLinearRegression_Copy_X()
   * @model containment="true"
   * @generated
   */
  BooleanLiteral getCopy_X();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.LinearRegression#getCopy_X <em>Copy X</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Copy X</em>' containment reference.
   * @see #getCopy_X()
   * @generated
   */
  void setCopy_X(BooleanLiteral value);

  /**
   * Returns the value of the '<em><b>Njobs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Njobs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Njobs</em>' containment reference.
   * @see #setN_jobs(IntegerLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getLinearRegression_N_jobs()
   * @model containment="true"
   * @generated
   */
  IntegerLiteral getN_jobs();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.LinearRegression#getN_jobs <em>Njobs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Njobs</em>' containment reference.
   * @see #getN_jobs()
   * @generated
   */
  void setN_jobs(IntegerLiteral value);

  /**
   * Returns the value of the '<em><b>Positive</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Positive</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Positive</em>' containment reference.
   * @see #setPositive(BooleanLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getLinearRegression_Positive()
   * @model containment="true"
   * @generated
   */
  BooleanLiteral getPositive();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.LinearRegression#getPositive <em>Positive</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Positive</em>' containment reference.
   * @see #getPositive()
   * @generated
   */
  void setPositive(BooleanLiteral value);

} // LinearRegression
