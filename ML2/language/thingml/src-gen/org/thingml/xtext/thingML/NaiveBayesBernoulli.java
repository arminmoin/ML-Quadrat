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
 * A representation of the model object '<em><b>Naive Bayes Bernoulli</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.NaiveBayesBernoulli#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NaiveBayesBernoulli#getBinarize <em>Binarize</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NaiveBayesBernoulli#getFit_prior <em>Fit prior</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.NaiveBayesBernoulli#getClass_prior <em>Class prior</em>}</li>
 * </ul>
 *
 * @see org.thingml.xtext.thingML.ThingMLPackage#getNaiveBayesBernoulli()
 * @model
 * @generated
 */
public interface NaiveBayesBernoulli extends ML2_ModelAlgorithm
{
  /**
   * Returns the value of the '<em><b>Alpha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alpha</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alpha</em>' containment reference.
   * @see #setAlpha(DoubleLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNaiveBayesBernoulli_Alpha()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getAlpha();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NaiveBayesBernoulli#getAlpha <em>Alpha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alpha</em>' containment reference.
   * @see #getAlpha()
   * @generated
   */
  void setAlpha(DoubleLiteral value);

  /**
   * Returns the value of the '<em><b>Binarize</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binarize</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binarize</em>' containment reference.
   * @see #setBinarize(DoubleLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNaiveBayesBernoulli_Binarize()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getBinarize();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NaiveBayesBernoulli#getBinarize <em>Binarize</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Binarize</em>' containment reference.
   * @see #getBinarize()
   * @generated
   */
  void setBinarize(DoubleLiteral value);

  /**
   * Returns the value of the '<em><b>Fit prior</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fit prior</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fit prior</em>' containment reference.
   * @see #setFit_prior(BooleanLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNaiveBayesBernoulli_Fit_prior()
   * @model containment="true"
   * @generated
   */
  BooleanLiteral getFit_prior();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NaiveBayesBernoulli#getFit_prior <em>Fit prior</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fit prior</em>' containment reference.
   * @see #getFit_prior()
   * @generated
   */
  void setFit_prior(BooleanLiteral value);

  /**
   * Returns the value of the '<em><b>Class prior</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class prior</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class prior</em>' attribute.
   * @see #setClass_prior(String)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getNaiveBayesBernoulli_Class_prior()
   * @model
   * @generated
   */
  String getClass_prior();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.NaiveBayesBernoulli#getClass_prior <em>Class prior</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class prior</em>' attribute.
   * @see #getClass_prior()
   * @generated
   */
  void setClass_prior(String value);

} // NaiveBayesBernoulli
