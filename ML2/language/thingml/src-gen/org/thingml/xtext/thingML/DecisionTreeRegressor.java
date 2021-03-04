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
 * A representation of the model object '<em><b>Decision Tree Regressor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getDecisionTreeRegressorCriterion <em>Decision Tree Regressor Criterion</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getDecisionTreeSplitter <em>Decision Tree Splitter</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getMax_depth <em>Max depth</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getMin_samples_split <em>Min samples split</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getMin_samples_leaf <em>Min samples leaf</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getMin_weight_fraction_leaf <em>Min weight fraction leaf</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getMax_features_numeric <em>Max features numeric</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getMax_features_enum <em>Max features enum</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getRandom_state <em>Random state</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getMax_leaf_nodes <em>Max leaf nodes</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getMin_impurity_decrease <em>Min impurity decrease</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getMin_impurity_split <em>Min impurity split</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getCcp_alpha <em>Ccp alpha</em>}</li>
 * </ul>
 *
 * @see org.thingml.xtext.thingML.ThingMLPackage#getDecisionTreeRegressor()
 * @model
 * @generated
 */
public interface DecisionTreeRegressor extends ML2_ModelAlgorithm
{
  /**
   * Returns the value of the '<em><b>Decision Tree Regressor Criterion</b></em>' attribute.
   * The literals are from the enumeration {@link org.thingml.xtext.thingML.DecisionTreeRegressorCriterion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decision Tree Regressor Criterion</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decision Tree Regressor Criterion</em>' attribute.
   * @see org.thingml.xtext.thingML.DecisionTreeRegressorCriterion
   * @see #setDecisionTreeRegressorCriterion(DecisionTreeRegressorCriterion)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getDecisionTreeRegressor_DecisionTreeRegressorCriterion()
   * @model
   * @generated
   */
  DecisionTreeRegressorCriterion getDecisionTreeRegressorCriterion();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getDecisionTreeRegressorCriterion <em>Decision Tree Regressor Criterion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decision Tree Regressor Criterion</em>' attribute.
   * @see org.thingml.xtext.thingML.DecisionTreeRegressorCriterion
   * @see #getDecisionTreeRegressorCriterion()
   * @generated
   */
  void setDecisionTreeRegressorCriterion(DecisionTreeRegressorCriterion value);

  /**
   * Returns the value of the '<em><b>Decision Tree Splitter</b></em>' attribute.
   * The literals are from the enumeration {@link org.thingml.xtext.thingML.DecisionTreeSplitter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decision Tree Splitter</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decision Tree Splitter</em>' attribute.
   * @see org.thingml.xtext.thingML.DecisionTreeSplitter
   * @see #setDecisionTreeSplitter(DecisionTreeSplitter)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getDecisionTreeRegressor_DecisionTreeSplitter()
   * @model
   * @generated
   */
  DecisionTreeSplitter getDecisionTreeSplitter();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getDecisionTreeSplitter <em>Decision Tree Splitter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decision Tree Splitter</em>' attribute.
   * @see org.thingml.xtext.thingML.DecisionTreeSplitter
   * @see #getDecisionTreeSplitter()
   * @generated
   */
  void setDecisionTreeSplitter(DecisionTreeSplitter value);

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
   * @see org.thingml.xtext.thingML.ThingMLPackage#getDecisionTreeRegressor_Max_depth()
   * @model containment="true"
   * @generated
   */
  IntegerLiteral getMax_depth();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getMax_depth <em>Max depth</em>}' containment reference.
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
   * @see org.thingml.xtext.thingML.ThingMLPackage#getDecisionTreeRegressor_Min_samples_split()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getMin_samples_split();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getMin_samples_split <em>Min samples split</em>}' containment reference.
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
   * @see org.thingml.xtext.thingML.ThingMLPackage#getDecisionTreeRegressor_Min_samples_leaf()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getMin_samples_leaf();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getMin_samples_leaf <em>Min samples leaf</em>}' containment reference.
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
   * @see org.thingml.xtext.thingML.ThingMLPackage#getDecisionTreeRegressor_Min_weight_fraction_leaf()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getMin_weight_fraction_leaf();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getMin_weight_fraction_leaf <em>Min weight fraction leaf</em>}' containment reference.
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
   * @see org.thingml.xtext.thingML.ThingMLPackage#getDecisionTreeRegressor_Max_features_numeric()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getMax_features_numeric();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getMax_features_numeric <em>Max features numeric</em>}' containment reference.
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
   * @see org.thingml.xtext.thingML.ThingMLPackage#getDecisionTreeRegressor_Max_features_enum()
   * @model
   * @generated
   */
  Max_features_enum getMax_features_enum();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getMax_features_enum <em>Max features enum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max features enum</em>' attribute.
   * @see org.thingml.xtext.thingML.Max_features_enum
   * @see #getMax_features_enum()
   * @generated
   */
  void setMax_features_enum(Max_features_enum value);

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
   * @see org.thingml.xtext.thingML.ThingMLPackage#getDecisionTreeRegressor_Random_state()
   * @model containment="true"
   * @generated
   */
  IntegerLiteral getRandom_state();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getRandom_state <em>Random state</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Random state</em>' containment reference.
   * @see #getRandom_state()
   * @generated
   */
  void setRandom_state(IntegerLiteral value);

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
   * @see org.thingml.xtext.thingML.ThingMLPackage#getDecisionTreeRegressor_Max_leaf_nodes()
   * @model containment="true"
   * @generated
   */
  IntegerLiteral getMax_leaf_nodes();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getMax_leaf_nodes <em>Max leaf nodes</em>}' containment reference.
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
   * @see org.thingml.xtext.thingML.ThingMLPackage#getDecisionTreeRegressor_Min_impurity_decrease()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getMin_impurity_decrease();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getMin_impurity_decrease <em>Min impurity decrease</em>}' containment reference.
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
   * @see org.thingml.xtext.thingML.ThingMLPackage#getDecisionTreeRegressor_Min_impurity_split()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getMin_impurity_split();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getMin_impurity_split <em>Min impurity split</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min impurity split</em>' containment reference.
   * @see #getMin_impurity_split()
   * @generated
   */
  void setMin_impurity_split(DoubleLiteral value);

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
   * @see org.thingml.xtext.thingML.ThingMLPackage#getDecisionTreeRegressor_Ccp_alpha()
   * @model containment="true"
   * @generated
   */
  DoubleLiteral getCcp_alpha();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.DecisionTreeRegressor#getCcp_alpha <em>Ccp alpha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ccp alpha</em>' containment reference.
   * @see #getCcp_alpha()
   * @generated
   */
  void setCcp_alpha(DoubleLiteral value);

} // DecisionTreeRegressor
