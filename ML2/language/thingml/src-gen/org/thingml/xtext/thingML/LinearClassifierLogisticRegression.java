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
 * A representation of the model object '<em><b>Linear Classifier Logistic Regression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getPenalty <em>Penalty</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getDual <em>Dual</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getTol <em>Tol</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getC <em>C</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getFit_intercept <em>Fit intercept</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getIntercept_scaling <em>Intercept scaling</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getClass_weight <em>Class weight</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getRandom_state <em>Random state</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getOptimizer <em>Optimizer</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getMax_iter <em>Max iter</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getMulti_class <em>Multi class</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getVerbose <em>Verbose</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getWarm_start <em>Warm start</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getN_jobs <em>Njobs</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getL1_ratio <em>L1 ratio</em>}</li>
 * </ul>
 *
 * @see org.thingml.xtext.thingML.ThingMLPackage#getLinearClassifierLogisticRegression()
 * @model
 * @generated
 */
public interface LinearClassifierLogisticRegression extends ML2_ModelAlgorithm
{
  /**
   * Returns the value of the '<em><b>Penalty</b></em>' attribute.
   * The literals are from the enumeration {@link org.thingml.xtext.thingML.Penalty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Penalty</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Penalty</em>' attribute.
   * @see org.thingml.xtext.thingML.Penalty
   * @see #setPenalty(Penalty)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getLinearClassifierLogisticRegression_Penalty()
   * @model
   * @generated
   */
  Penalty getPenalty();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getPenalty <em>Penalty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Penalty</em>' attribute.
   * @see org.thingml.xtext.thingML.Penalty
   * @see #getPenalty()
   * @generated
   */
  void setPenalty(Penalty value);

  /**
   * Returns the value of the '<em><b>Dual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dual</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dual</em>' containment reference.
   * @see #setDual(BooleanLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getLinearClassifierLogisticRegression_Dual()
   * @model containment="true"
   * @generated
   */
  BooleanLiteral getDual();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getDual <em>Dual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dual</em>' containment reference.
   * @see #getDual()
   * @generated
   */
  void setDual(BooleanLiteral value);

  /**
   * Returns the value of the '<em><b>Tol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tol</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tol</em>' containment reference.
   * @see #setTol(DoubleLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getLinearClassifierLogisticRegression_Tol()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getTol();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getTol <em>Tol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tol</em>' containment reference.
   * @see #getTol()
   * @generated
   */
  void setTol(DoubleLiteral value);

  /**
   * Returns the value of the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' containment reference.
   * @see #setC(DoubleLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getLinearClassifierLogisticRegression_C()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getC();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getC <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' containment reference.
   * @see #getC()
   * @generated
   */
  void setC(DoubleLiteral value);

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
   * @see org.thingml.xtext.thingML.ThingMLPackage#getLinearClassifierLogisticRegression_Fit_intercept()
   * @model containment="true"
   * @generated
   */
  BooleanLiteral getFit_intercept();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getFit_intercept <em>Fit intercept</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fit intercept</em>' containment reference.
   * @see #getFit_intercept()
   * @generated
   */
  void setFit_intercept(BooleanLiteral value);

  /**
   * Returns the value of the '<em><b>Intercept scaling</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Intercept scaling</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Intercept scaling</em>' containment reference.
   * @see #setIntercept_scaling(DoubleLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getLinearClassifierLogisticRegression_Intercept_scaling()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getIntercept_scaling();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getIntercept_scaling <em>Intercept scaling</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Intercept scaling</em>' containment reference.
   * @see #getIntercept_scaling()
   * @generated
   */
  void setIntercept_scaling(DoubleLiteral value);

  /**
   * Returns the value of the '<em><b>Class weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class weight</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class weight</em>' attribute.
   * @see #setClass_weight(String)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getLinearClassifierLogisticRegression_Class_weight()
   * @model
   * @generated
   */
  String getClass_weight();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getClass_weight <em>Class weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class weight</em>' attribute.
   * @see #getClass_weight()
   * @generated
   */
  void setClass_weight(String value);

  /**
   * Returns the value of the '<em><b>Random state</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Random state</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Random state</em>' containment reference.
   * @see #setRandom_state(IntegerLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getLinearClassifierLogisticRegression_Random_state()
   * @model containment="true"
   * @generated
   */
  IntegerLiteral getRandom_state();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getRandom_state <em>Random state</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Random state</em>' containment reference.
   * @see #getRandom_state()
   * @generated
   */
  void setRandom_state(IntegerLiteral value);

  /**
   * Returns the value of the '<em><b>Optimizer</b></em>' attribute.
   * The literals are from the enumeration {@link org.thingml.xtext.thingML.Optimizer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optimizer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optimizer</em>' attribute.
   * @see org.thingml.xtext.thingML.Optimizer
   * @see #setOptimizer(Optimizer)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getLinearClassifierLogisticRegression_Optimizer()
   * @model
   * @generated
   */
  Optimizer getOptimizer();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getOptimizer <em>Optimizer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Optimizer</em>' attribute.
   * @see org.thingml.xtext.thingML.Optimizer
   * @see #getOptimizer()
   * @generated
   */
  void setOptimizer(Optimizer value);

  /**
   * Returns the value of the '<em><b>Max iter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max iter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max iter</em>' containment reference.
   * @see #setMax_iter(IntegerLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getLinearClassifierLogisticRegression_Max_iter()
   * @model containment="true"
   * @generated
   */
  IntegerLiteral getMax_iter();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getMax_iter <em>Max iter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max iter</em>' containment reference.
   * @see #getMax_iter()
   * @generated
   */
  void setMax_iter(IntegerLiteral value);

  /**
   * Returns the value of the '<em><b>Multi class</b></em>' attribute.
   * The literals are from the enumeration {@link org.thingml.xtext.thingML.Multi_class}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multi class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multi class</em>' attribute.
   * @see org.thingml.xtext.thingML.Multi_class
   * @see #setMulti_class(Multi_class)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getLinearClassifierLogisticRegression_Multi_class()
   * @model
   * @generated
   */
  Multi_class getMulti_class();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getMulti_class <em>Multi class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multi class</em>' attribute.
   * @see org.thingml.xtext.thingML.Multi_class
   * @see #getMulti_class()
   * @generated
   */
  void setMulti_class(Multi_class value);

  /**
   * Returns the value of the '<em><b>Verbose</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Verbose</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Verbose</em>' containment reference.
   * @see #setVerbose(IntegerLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getLinearClassifierLogisticRegression_Verbose()
   * @model containment="true"
   * @generated
   */
  IntegerLiteral getVerbose();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getVerbose <em>Verbose</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Verbose</em>' containment reference.
   * @see #getVerbose()
   * @generated
   */
  void setVerbose(IntegerLiteral value);

  /**
   * Returns the value of the '<em><b>Warm start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Warm start</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Warm start</em>' containment reference.
   * @see #setWarm_start(BooleanLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getLinearClassifierLogisticRegression_Warm_start()
   * @model containment="true"
   * @generated
   */
  BooleanLiteral getWarm_start();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getWarm_start <em>Warm start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Warm start</em>' containment reference.
   * @see #getWarm_start()
   * @generated
   */
  void setWarm_start(BooleanLiteral value);

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
   * @see org.thingml.xtext.thingML.ThingMLPackage#getLinearClassifierLogisticRegression_N_jobs()
   * @model containment="true"
   * @generated
   */
  IntegerLiteral getN_jobs();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getN_jobs <em>Njobs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Njobs</em>' containment reference.
   * @see #getN_jobs()
   * @generated
   */
  void setN_jobs(IntegerLiteral value);

  /**
   * Returns the value of the '<em><b>L1 ratio</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>L1 ratio</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>L1 ratio</em>' containment reference.
   * @see #setL1_ratio(DoubleLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getLinearClassifierLogisticRegression_L1_ratio()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getL1_ratio();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression#getL1_ratio <em>L1 ratio</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>L1 ratio</em>' containment reference.
   * @see #getL1_ratio()
   * @generated
   */
  void setL1_ratio(DoubleLiteral value);

} // LinearClassifierLogisticRegression
