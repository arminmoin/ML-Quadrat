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
 * A representation of the model object '<em><b>Random Forest Regressor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.RandomForestRegressor#getN_estimators <em>Nestimators</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.RandomForestRegressor#getRandomForestRegressorCriterion <em>Random Forest Regressor Criterion</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.RandomForestRegressor#getMax_depth <em>Max depth</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.RandomForestRegressor#getMin_samples_split <em>Min samples split</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.RandomForestRegressor#getMin_samples_leaf <em>Min samples leaf</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.RandomForestRegressor#getMin_weight_fraction_leaf <em>Min weight fraction leaf</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.RandomForestRegressor#getMax_features_numeric <em>Max features numeric</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.RandomForestRegressor#getMax_features_enum <em>Max features enum</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.RandomForestRegressor#getMax_leaf_nodes <em>Max leaf nodes</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.RandomForestRegressor#getMin_impurity_decrease <em>Min impurity decrease</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.RandomForestRegressor#getMin_impurity_split <em>Min impurity split</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.RandomForestRegressor#getBootstrap <em>Bootstrap</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.RandomForestRegressor#getOob_score <em>Oob score</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.RandomForestRegressor#getN_jobs <em>Njobs</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.RandomForestRegressor#getRandom_state <em>Random state</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.RandomForestRegressor#getVerbose <em>Verbose</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.RandomForestRegressor#getWarm_start <em>Warm start</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.RandomForestRegressor#getCcp_alpha <em>Ccp alpha</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.RandomForestRegressor#getMax_samples <em>Max samples</em>}</li>
 * </ul>
 *
 * @see org.thingml.xtext.thingML.ThingMLPackage#getRandomForestRegressor()
 * @model
 * @generated
 */
public interface RandomForestRegressor extends ML2_ModelAlgorithm
{
  /**
   * Returns the value of the '<em><b>Nestimators</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nestimators</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nestimators</em>' containment reference.
   * @see #setN_estimators(IntegerLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getRandomForestRegressor_N_estimators()
   * @model containment="true"
   * @generated
   */
  IntegerLiteral getN_estimators();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.RandomForestRegressor#getN_estimators <em>Nestimators</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nestimators</em>' containment reference.
   * @see #getN_estimators()
   * @generated
   */
  void setN_estimators(IntegerLiteral value);

  /**
   * Returns the value of the '<em><b>Random Forest Regressor Criterion</b></em>' attribute.
   * The literals are from the enumeration {@link org.thingml.xtext.thingML.RandomForestRegressorCriterion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Random Forest Regressor Criterion</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Random Forest Regressor Criterion</em>' attribute.
   * @see org.thingml.xtext.thingML.RandomForestRegressorCriterion
   * @see #setRandomForestRegressorCriterion(RandomForestRegressorCriterion)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getRandomForestRegressor_RandomForestRegressorCriterion()
   * @model
   * @generated
   */
  RandomForestRegressorCriterion getRandomForestRegressorCriterion();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.RandomForestRegressor#getRandomForestRegressorCriterion <em>Random Forest Regressor Criterion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Random Forest Regressor Criterion</em>' attribute.
   * @see org.thingml.xtext.thingML.RandomForestRegressorCriterion
   * @see #getRandomForestRegressorCriterion()
   * @generated
   */
  void setRandomForestRegressorCriterion(RandomForestRegressorCriterion value);

  /**
   * Returns the value of the '<em><b>Max depth</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max depth</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max depth</em>' containment reference.
   * @see #setMax_depth(IntegerLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getRandomForestRegressor_Max_depth()
   * @model containment="true"
   * @generated
   */
  IntegerLiteral getMax_depth();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.RandomForestRegressor#getMax_depth <em>Max depth</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max depth</em>' containment reference.
   * @see #getMax_depth()
   * @generated
   */
  void setMax_depth(IntegerLiteral value);

  /**
   * Returns the value of the '<em><b>Min samples split</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min samples split</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min samples split</em>' containment reference.
   * @see #setMin_samples_split(DoubleLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getRandomForestRegressor_Min_samples_split()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getMin_samples_split();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.RandomForestRegressor#getMin_samples_split <em>Min samples split</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min samples split</em>' containment reference.
   * @see #getMin_samples_split()
   * @generated
   */
  void setMin_samples_split(DoubleLiteral value);

  /**
   * Returns the value of the '<em><b>Min samples leaf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min samples leaf</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min samples leaf</em>' containment reference.
   * @see #setMin_samples_leaf(DoubleLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getRandomForestRegressor_Min_samples_leaf()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getMin_samples_leaf();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.RandomForestRegressor#getMin_samples_leaf <em>Min samples leaf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min samples leaf</em>' containment reference.
   * @see #getMin_samples_leaf()
   * @generated
   */
  void setMin_samples_leaf(DoubleLiteral value);

  /**
   * Returns the value of the '<em><b>Min weight fraction leaf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min weight fraction leaf</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min weight fraction leaf</em>' containment reference.
   * @see #setMin_weight_fraction_leaf(DoubleLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getRandomForestRegressor_Min_weight_fraction_leaf()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getMin_weight_fraction_leaf();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.RandomForestRegressor#getMin_weight_fraction_leaf <em>Min weight fraction leaf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min weight fraction leaf</em>' containment reference.
   * @see #getMin_weight_fraction_leaf()
   * @generated
   */
  void setMin_weight_fraction_leaf(DoubleLiteral value);

  /**
   * Returns the value of the '<em><b>Max features numeric</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max features numeric</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max features numeric</em>' containment reference.
   * @see #setMax_features_numeric(DoubleLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getRandomForestRegressor_Max_features_numeric()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getMax_features_numeric();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.RandomForestRegressor#getMax_features_numeric <em>Max features numeric</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max features numeric</em>' containment reference.
   * @see #getMax_features_numeric()
   * @generated
   */
  void setMax_features_numeric(DoubleLiteral value);

  /**
   * Returns the value of the '<em><b>Max features enum</b></em>' attribute.
   * The literals are from the enumeration {@link org.thingml.xtext.thingML.Max_features_enum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max features enum</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max features enum</em>' attribute.
   * @see org.thingml.xtext.thingML.Max_features_enum
   * @see #setMax_features_enum(Max_features_enum)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getRandomForestRegressor_Max_features_enum()
   * @model
   * @generated
   */
  Max_features_enum getMax_features_enum();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.RandomForestRegressor#getMax_features_enum <em>Max features enum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max features enum</em>' attribute.
   * @see org.thingml.xtext.thingML.Max_features_enum
   * @see #getMax_features_enum()
   * @generated
   */
  void setMax_features_enum(Max_features_enum value);

  /**
   * Returns the value of the '<em><b>Max leaf nodes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max leaf nodes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max leaf nodes</em>' containment reference.
   * @see #setMax_leaf_nodes(IntegerLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getRandomForestRegressor_Max_leaf_nodes()
   * @model containment="true"
   * @generated
   */
  IntegerLiteral getMax_leaf_nodes();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.RandomForestRegressor#getMax_leaf_nodes <em>Max leaf nodes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max leaf nodes</em>' containment reference.
   * @see #getMax_leaf_nodes()
   * @generated
   */
  void setMax_leaf_nodes(IntegerLiteral value);

  /**
   * Returns the value of the '<em><b>Min impurity decrease</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min impurity decrease</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min impurity decrease</em>' containment reference.
   * @see #setMin_impurity_decrease(DoubleLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getRandomForestRegressor_Min_impurity_decrease()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getMin_impurity_decrease();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.RandomForestRegressor#getMin_impurity_decrease <em>Min impurity decrease</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min impurity decrease</em>' containment reference.
   * @see #getMin_impurity_decrease()
   * @generated
   */
  void setMin_impurity_decrease(DoubleLiteral value);

  /**
   * Returns the value of the '<em><b>Min impurity split</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min impurity split</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min impurity split</em>' containment reference.
   * @see #setMin_impurity_split(DoubleLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getRandomForestRegressor_Min_impurity_split()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getMin_impurity_split();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.RandomForestRegressor#getMin_impurity_split <em>Min impurity split</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min impurity split</em>' containment reference.
   * @see #getMin_impurity_split()
   * @generated
   */
  void setMin_impurity_split(DoubleLiteral value);

  /**
   * Returns the value of the '<em><b>Bootstrap</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bootstrap</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bootstrap</em>' containment reference.
   * @see #setBootstrap(BooleanLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getRandomForestRegressor_Bootstrap()
   * @model containment="true"
   * @generated
   */
  BooleanLiteral getBootstrap();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.RandomForestRegressor#getBootstrap <em>Bootstrap</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bootstrap</em>' containment reference.
   * @see #getBootstrap()
   * @generated
   */
  void setBootstrap(BooleanLiteral value);

  /**
   * Returns the value of the '<em><b>Oob score</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Oob score</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Oob score</em>' containment reference.
   * @see #setOob_score(BooleanLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getRandomForestRegressor_Oob_score()
   * @model containment="true"
   * @generated
   */
  BooleanLiteral getOob_score();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.RandomForestRegressor#getOob_score <em>Oob score</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Oob score</em>' containment reference.
   * @see #getOob_score()
   * @generated
   */
  void setOob_score(BooleanLiteral value);

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
   * @see org.thingml.xtext.thingML.ThingMLPackage#getRandomForestRegressor_N_jobs()
   * @model containment="true"
   * @generated
   */
  IntegerLiteral getN_jobs();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.RandomForestRegressor#getN_jobs <em>Njobs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Njobs</em>' containment reference.
   * @see #getN_jobs()
   * @generated
   */
  void setN_jobs(IntegerLiteral value);

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
   * @see org.thingml.xtext.thingML.ThingMLPackage#getRandomForestRegressor_Random_state()
   * @model containment="true"
   * @generated
   */
  IntegerLiteral getRandom_state();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.RandomForestRegressor#getRandom_state <em>Random state</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Random state</em>' containment reference.
   * @see #getRandom_state()
   * @generated
   */
  void setRandom_state(IntegerLiteral value);

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
   * @see org.thingml.xtext.thingML.ThingMLPackage#getRandomForestRegressor_Verbose()
   * @model containment="true"
   * @generated
   */
  IntegerLiteral getVerbose();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.RandomForestRegressor#getVerbose <em>Verbose</em>}' containment reference.
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
   * @see org.thingml.xtext.thingML.ThingMLPackage#getRandomForestRegressor_Warm_start()
   * @model containment="true"
   * @generated
   */
  BooleanLiteral getWarm_start();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.RandomForestRegressor#getWarm_start <em>Warm start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Warm start</em>' containment reference.
   * @see #getWarm_start()
   * @generated
   */
  void setWarm_start(BooleanLiteral value);

  /**
   * Returns the value of the '<em><b>Ccp alpha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ccp alpha</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ccp alpha</em>' containment reference.
   * @see #setCcp_alpha(DoubleLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getRandomForestRegressor_Ccp_alpha()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getCcp_alpha();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.RandomForestRegressor#getCcp_alpha <em>Ccp alpha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ccp alpha</em>' containment reference.
   * @see #getCcp_alpha()
   * @generated
   */
  void setCcp_alpha(DoubleLiteral value);

  /**
   * Returns the value of the '<em><b>Max samples</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max samples</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max samples</em>' containment reference.
   * @see #setMax_samples(DoubleLiteral)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getRandomForestRegressor_Max_samples()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getMax_samples();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.RandomForestRegressor#getMax_samples <em>Max samples</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max samples</em>' containment reference.
   * @see #getMax_samples()
   * @generated
   */
  void setMax_samples(DoubleLiteral value);

} // RandomForestRegressor
