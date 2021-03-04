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

import org.thingml.xtext.thingML.DecisionTreeClassifier;
import org.thingml.xtext.thingML.DecisionTreeClassifierCriterion;
import org.thingml.xtext.thingML.DecisionTreeSplitter;
import org.thingml.xtext.thingML.DoubleLiteral;
import org.thingml.xtext.thingML.IntegerLiteral;
import org.thingml.xtext.thingML.Max_features_enum;
import org.thingml.xtext.thingML.ThingMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Tree Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.impl.DecisionTreeClassifierImpl#getDecisionTreeClassifierCriterion <em>Decision Tree Classifier Criterion</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.DecisionTreeClassifierImpl#getDecisionTreeSplitter <em>Decision Tree Splitter</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.DecisionTreeClassifierImpl#getMax_depth <em>Max depth</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.DecisionTreeClassifierImpl#getMin_samples_split <em>Min samples split</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.DecisionTreeClassifierImpl#getMin_samples_leaf <em>Min samples leaf</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.DecisionTreeClassifierImpl#getMin_weight_fraction_leaf <em>Min weight fraction leaf</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.DecisionTreeClassifierImpl#getMax_features_numeric <em>Max features numeric</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.DecisionTreeClassifierImpl#getMax_features_enum <em>Max features enum</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.DecisionTreeClassifierImpl#getRandom_state <em>Random state</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.DecisionTreeClassifierImpl#getMax_leaf_nodes <em>Max leaf nodes</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.DecisionTreeClassifierImpl#getMin_impurity_decrease <em>Min impurity decrease</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.DecisionTreeClassifierImpl#getMin_impurity_split <em>Min impurity split</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.DecisionTreeClassifierImpl#getClass_weight <em>Class weight</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.DecisionTreeClassifierImpl#getCcp_alpha <em>Ccp alpha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionTreeClassifierImpl extends ML2_ModelAlgorithmImpl implements DecisionTreeClassifier
{
  /**
   * The default value of the '{@link #getDecisionTreeClassifierCriterion() <em>Decision Tree Classifier Criterion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecisionTreeClassifierCriterion()
   * @generated
   * @ordered
   */
  protected static final DecisionTreeClassifierCriterion DECISION_TREE_CLASSIFIER_CRITERION_EDEFAULT = DecisionTreeClassifierCriterion.NOT_SET;

  /**
   * The cached value of the '{@link #getDecisionTreeClassifierCriterion() <em>Decision Tree Classifier Criterion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecisionTreeClassifierCriterion()
   * @generated
   * @ordered
   */
  protected DecisionTreeClassifierCriterion decisionTreeClassifierCriterion = DECISION_TREE_CLASSIFIER_CRITERION_EDEFAULT;

  /**
   * The default value of the '{@link #getDecisionTreeSplitter() <em>Decision Tree Splitter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecisionTreeSplitter()
   * @generated
   * @ordered
   */
  protected static final DecisionTreeSplitter DECISION_TREE_SPLITTER_EDEFAULT = DecisionTreeSplitter.NOT_SET;

  /**
   * The cached value of the '{@link #getDecisionTreeSplitter() <em>Decision Tree Splitter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecisionTreeSplitter()
   * @generated
   * @ordered
   */
  protected DecisionTreeSplitter decisionTreeSplitter = DECISION_TREE_SPLITTER_EDEFAULT;

  /**
   * The cached value of the '{@link #getMax_depth() <em>Max depth</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax_depth()
   * @generated
   * @ordered
   */
  protected IntegerLiteral max_depth;

  /**
   * The cached value of the '{@link #getMin_samples_split() <em>Min samples split</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin_samples_split()
   * @generated
   * @ordered
   */
  protected DoubleLiteral min_samples_split;

  /**
   * The cached value of the '{@link #getMin_samples_leaf() <em>Min samples leaf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin_samples_leaf()
   * @generated
   * @ordered
   */
  protected DoubleLiteral min_samples_leaf;

  /**
   * The cached value of the '{@link #getMin_weight_fraction_leaf() <em>Min weight fraction leaf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin_weight_fraction_leaf()
   * @generated
   * @ordered
   */
  protected DoubleLiteral min_weight_fraction_leaf;

  /**
   * The cached value of the '{@link #getMax_features_numeric() <em>Max features numeric</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax_features_numeric()
   * @generated
   * @ordered
   */
  protected DoubleLiteral max_features_numeric;

  /**
   * The default value of the '{@link #getMax_features_enum() <em>Max features enum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax_features_enum()
   * @generated
   * @ordered
   */
  protected static final Max_features_enum MAX_FEATURES_ENUM_EDEFAULT = Max_features_enum.NOT_SET;

  /**
   * The cached value of the '{@link #getMax_features_enum() <em>Max features enum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax_features_enum()
   * @generated
   * @ordered
   */
  protected Max_features_enum max_features_enum = MAX_FEATURES_ENUM_EDEFAULT;

  /**
   * The cached value of the '{@link #getRandom_state() <em>Random state</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRandom_state()
   * @generated
   * @ordered
   */
  protected IntegerLiteral random_state;

  /**
   * The cached value of the '{@link #getMax_leaf_nodes() <em>Max leaf nodes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax_leaf_nodes()
   * @generated
   * @ordered
   */
  protected IntegerLiteral max_leaf_nodes;

  /**
   * The cached value of the '{@link #getMin_impurity_decrease() <em>Min impurity decrease</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin_impurity_decrease()
   * @generated
   * @ordered
   */
  protected DoubleLiteral min_impurity_decrease;

  /**
   * The cached value of the '{@link #getMin_impurity_split() <em>Min impurity split</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin_impurity_split()
   * @generated
   * @ordered
   */
  protected DoubleLiteral min_impurity_split;

  /**
   * The default value of the '{@link #getClass_weight() <em>Class weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_weight()
   * @generated
   * @ordered
   */
  protected static final String CLASS_WEIGHT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClass_weight() <em>Class weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_weight()
   * @generated
   * @ordered
   */
  protected String class_weight = CLASS_WEIGHT_EDEFAULT;

  /**
   * The cached value of the '{@link #getCcp_alpha() <em>Ccp alpha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCcp_alpha()
   * @generated
   * @ordered
   */
  protected DoubleLiteral ccp_alpha;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DecisionTreeClassifierImpl()
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
    return ThingMLPackage.eINSTANCE.getDecisionTreeClassifier();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecisionTreeClassifierCriterion getDecisionTreeClassifierCriterion()
  {
    return decisionTreeClassifierCriterion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecisionTreeClassifierCriterion(DecisionTreeClassifierCriterion newDecisionTreeClassifierCriterion)
  {
    DecisionTreeClassifierCriterion oldDecisionTreeClassifierCriterion = decisionTreeClassifierCriterion;
    decisionTreeClassifierCriterion = newDecisionTreeClassifierCriterion == null ? DECISION_TREE_CLASSIFIER_CRITERION_EDEFAULT : newDecisionTreeClassifierCriterion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE_CLASSIFIER__DECISION_TREE_CLASSIFIER_CRITERION, oldDecisionTreeClassifierCriterion, decisionTreeClassifierCriterion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecisionTreeSplitter getDecisionTreeSplitter()
  {
    return decisionTreeSplitter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecisionTreeSplitter(DecisionTreeSplitter newDecisionTreeSplitter)
  {
    DecisionTreeSplitter oldDecisionTreeSplitter = decisionTreeSplitter;
    decisionTreeSplitter = newDecisionTreeSplitter == null ? DECISION_TREE_SPLITTER_EDEFAULT : newDecisionTreeSplitter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE_CLASSIFIER__DECISION_TREE_SPLITTER, oldDecisionTreeSplitter, decisionTreeSplitter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral getMax_depth()
  {
    return max_depth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMax_depth(IntegerLiteral newMax_depth, NotificationChain msgs)
  {
    IntegerLiteral oldMax_depth = max_depth;
    max_depth = newMax_depth;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_DEPTH, oldMax_depth, newMax_depth);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMax_depth(IntegerLiteral newMax_depth)
  {
    if (newMax_depth != max_depth)
    {
      NotificationChain msgs = null;
      if (max_depth != null)
        msgs = ((InternalEObject)max_depth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_DEPTH, null, msgs);
      if (newMax_depth != null)
        msgs = ((InternalEObject)newMax_depth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_DEPTH, null, msgs);
      msgs = basicSetMax_depth(newMax_depth, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_DEPTH, newMax_depth, newMax_depth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleLiteral getMin_samples_split()
  {
    return min_samples_split;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMin_samples_split(DoubleLiteral newMin_samples_split, NotificationChain msgs)
  {
    DoubleLiteral oldMin_samples_split = min_samples_split;
    min_samples_split = newMin_samples_split;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_SPLIT, oldMin_samples_split, newMin_samples_split);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMin_samples_split(DoubleLiteral newMin_samples_split)
  {
    if (newMin_samples_split != min_samples_split)
    {
      NotificationChain msgs = null;
      if (min_samples_split != null)
        msgs = ((InternalEObject)min_samples_split).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_SPLIT, null, msgs);
      if (newMin_samples_split != null)
        msgs = ((InternalEObject)newMin_samples_split).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_SPLIT, null, msgs);
      msgs = basicSetMin_samples_split(newMin_samples_split, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_SPLIT, newMin_samples_split, newMin_samples_split));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleLiteral getMin_samples_leaf()
  {
    return min_samples_leaf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMin_samples_leaf(DoubleLiteral newMin_samples_leaf, NotificationChain msgs)
  {
    DoubleLiteral oldMin_samples_leaf = min_samples_leaf;
    min_samples_leaf = newMin_samples_leaf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_LEAF, oldMin_samples_leaf, newMin_samples_leaf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMin_samples_leaf(DoubleLiteral newMin_samples_leaf)
  {
    if (newMin_samples_leaf != min_samples_leaf)
    {
      NotificationChain msgs = null;
      if (min_samples_leaf != null)
        msgs = ((InternalEObject)min_samples_leaf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_LEAF, null, msgs);
      if (newMin_samples_leaf != null)
        msgs = ((InternalEObject)newMin_samples_leaf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_LEAF, null, msgs);
      msgs = basicSetMin_samples_leaf(newMin_samples_leaf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_LEAF, newMin_samples_leaf, newMin_samples_leaf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleLiteral getMin_weight_fraction_leaf()
  {
    return min_weight_fraction_leaf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMin_weight_fraction_leaf(DoubleLiteral newMin_weight_fraction_leaf, NotificationChain msgs)
  {
    DoubleLiteral oldMin_weight_fraction_leaf = min_weight_fraction_leaf;
    min_weight_fraction_leaf = newMin_weight_fraction_leaf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF, oldMin_weight_fraction_leaf, newMin_weight_fraction_leaf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMin_weight_fraction_leaf(DoubleLiteral newMin_weight_fraction_leaf)
  {
    if (newMin_weight_fraction_leaf != min_weight_fraction_leaf)
    {
      NotificationChain msgs = null;
      if (min_weight_fraction_leaf != null)
        msgs = ((InternalEObject)min_weight_fraction_leaf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF, null, msgs);
      if (newMin_weight_fraction_leaf != null)
        msgs = ((InternalEObject)newMin_weight_fraction_leaf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF, null, msgs);
      msgs = basicSetMin_weight_fraction_leaf(newMin_weight_fraction_leaf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF, newMin_weight_fraction_leaf, newMin_weight_fraction_leaf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleLiteral getMax_features_numeric()
  {
    return max_features_numeric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMax_features_numeric(DoubleLiteral newMax_features_numeric, NotificationChain msgs)
  {
    DoubleLiteral oldMax_features_numeric = max_features_numeric;
    max_features_numeric = newMax_features_numeric;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_FEATURES_NUMERIC, oldMax_features_numeric, newMax_features_numeric);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMax_features_numeric(DoubleLiteral newMax_features_numeric)
  {
    if (newMax_features_numeric != max_features_numeric)
    {
      NotificationChain msgs = null;
      if (max_features_numeric != null)
        msgs = ((InternalEObject)max_features_numeric).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_FEATURES_NUMERIC, null, msgs);
      if (newMax_features_numeric != null)
        msgs = ((InternalEObject)newMax_features_numeric).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_FEATURES_NUMERIC, null, msgs);
      msgs = basicSetMax_features_numeric(newMax_features_numeric, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_FEATURES_NUMERIC, newMax_features_numeric, newMax_features_numeric));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Max_features_enum getMax_features_enum()
  {
    return max_features_enum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMax_features_enum(Max_features_enum newMax_features_enum)
  {
    Max_features_enum oldMax_features_enum = max_features_enum;
    max_features_enum = newMax_features_enum == null ? MAX_FEATURES_ENUM_EDEFAULT : newMax_features_enum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_FEATURES_ENUM, oldMax_features_enum, max_features_enum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral getRandom_state()
  {
    return random_state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRandom_state(IntegerLiteral newRandom_state, NotificationChain msgs)
  {
    IntegerLiteral oldRandom_state = random_state;
    random_state = newRandom_state;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE_CLASSIFIER__RANDOM_STATE, oldRandom_state, newRandom_state);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRandom_state(IntegerLiteral newRandom_state)
  {
    if (newRandom_state != random_state)
    {
      NotificationChain msgs = null;
      if (random_state != null)
        msgs = ((InternalEObject)random_state).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.DECISION_TREE_CLASSIFIER__RANDOM_STATE, null, msgs);
      if (newRandom_state != null)
        msgs = ((InternalEObject)newRandom_state).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.DECISION_TREE_CLASSIFIER__RANDOM_STATE, null, msgs);
      msgs = basicSetRandom_state(newRandom_state, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE_CLASSIFIER__RANDOM_STATE, newRandom_state, newRandom_state));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral getMax_leaf_nodes()
  {
    return max_leaf_nodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMax_leaf_nodes(IntegerLiteral newMax_leaf_nodes, NotificationChain msgs)
  {
    IntegerLiteral oldMax_leaf_nodes = max_leaf_nodes;
    max_leaf_nodes = newMax_leaf_nodes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_LEAF_NODES, oldMax_leaf_nodes, newMax_leaf_nodes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMax_leaf_nodes(IntegerLiteral newMax_leaf_nodes)
  {
    if (newMax_leaf_nodes != max_leaf_nodes)
    {
      NotificationChain msgs = null;
      if (max_leaf_nodes != null)
        msgs = ((InternalEObject)max_leaf_nodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_LEAF_NODES, null, msgs);
      if (newMax_leaf_nodes != null)
        msgs = ((InternalEObject)newMax_leaf_nodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_LEAF_NODES, null, msgs);
      msgs = basicSetMax_leaf_nodes(newMax_leaf_nodes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_LEAF_NODES, newMax_leaf_nodes, newMax_leaf_nodes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleLiteral getMin_impurity_decrease()
  {
    return min_impurity_decrease;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMin_impurity_decrease(DoubleLiteral newMin_impurity_decrease, NotificationChain msgs)
  {
    DoubleLiteral oldMin_impurity_decrease = min_impurity_decrease;
    min_impurity_decrease = newMin_impurity_decrease;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_IMPURITY_DECREASE, oldMin_impurity_decrease, newMin_impurity_decrease);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMin_impurity_decrease(DoubleLiteral newMin_impurity_decrease)
  {
    if (newMin_impurity_decrease != min_impurity_decrease)
    {
      NotificationChain msgs = null;
      if (min_impurity_decrease != null)
        msgs = ((InternalEObject)min_impurity_decrease).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_IMPURITY_DECREASE, null, msgs);
      if (newMin_impurity_decrease != null)
        msgs = ((InternalEObject)newMin_impurity_decrease).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_IMPURITY_DECREASE, null, msgs);
      msgs = basicSetMin_impurity_decrease(newMin_impurity_decrease, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_IMPURITY_DECREASE, newMin_impurity_decrease, newMin_impurity_decrease));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleLiteral getMin_impurity_split()
  {
    return min_impurity_split;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMin_impurity_split(DoubleLiteral newMin_impurity_split, NotificationChain msgs)
  {
    DoubleLiteral oldMin_impurity_split = min_impurity_split;
    min_impurity_split = newMin_impurity_split;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_IMPURITY_SPLIT, oldMin_impurity_split, newMin_impurity_split);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMin_impurity_split(DoubleLiteral newMin_impurity_split)
  {
    if (newMin_impurity_split != min_impurity_split)
    {
      NotificationChain msgs = null;
      if (min_impurity_split != null)
        msgs = ((InternalEObject)min_impurity_split).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_IMPURITY_SPLIT, null, msgs);
      if (newMin_impurity_split != null)
        msgs = ((InternalEObject)newMin_impurity_split).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_IMPURITY_SPLIT, null, msgs);
      msgs = basicSetMin_impurity_split(newMin_impurity_split, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_IMPURITY_SPLIT, newMin_impurity_split, newMin_impurity_split));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClass_weight()
  {
    return class_weight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass_weight(String newClass_weight)
  {
    String oldClass_weight = class_weight;
    class_weight = newClass_weight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE_CLASSIFIER__CLASS_WEIGHT, oldClass_weight, class_weight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleLiteral getCcp_alpha()
  {
    return ccp_alpha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCcp_alpha(DoubleLiteral newCcp_alpha, NotificationChain msgs)
  {
    DoubleLiteral oldCcp_alpha = ccp_alpha;
    ccp_alpha = newCcp_alpha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE_CLASSIFIER__CCP_ALPHA, oldCcp_alpha, newCcp_alpha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCcp_alpha(DoubleLiteral newCcp_alpha)
  {
    if (newCcp_alpha != ccp_alpha)
    {
      NotificationChain msgs = null;
      if (ccp_alpha != null)
        msgs = ((InternalEObject)ccp_alpha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.DECISION_TREE_CLASSIFIER__CCP_ALPHA, null, msgs);
      if (newCcp_alpha != null)
        msgs = ((InternalEObject)newCcp_alpha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.DECISION_TREE_CLASSIFIER__CCP_ALPHA, null, msgs);
      msgs = basicSetCcp_alpha(newCcp_alpha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DECISION_TREE_CLASSIFIER__CCP_ALPHA, newCcp_alpha, newCcp_alpha));
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
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_DEPTH:
        return basicSetMax_depth(null, msgs);
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_SPLIT:
        return basicSetMin_samples_split(null, msgs);
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_LEAF:
        return basicSetMin_samples_leaf(null, msgs);
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF:
        return basicSetMin_weight_fraction_leaf(null, msgs);
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_FEATURES_NUMERIC:
        return basicSetMax_features_numeric(null, msgs);
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__RANDOM_STATE:
        return basicSetRandom_state(null, msgs);
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_LEAF_NODES:
        return basicSetMax_leaf_nodes(null, msgs);
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_IMPURITY_DECREASE:
        return basicSetMin_impurity_decrease(null, msgs);
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_IMPURITY_SPLIT:
        return basicSetMin_impurity_split(null, msgs);
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__CCP_ALPHA:
        return basicSetCcp_alpha(null, msgs);
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
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__DECISION_TREE_CLASSIFIER_CRITERION:
        return getDecisionTreeClassifierCriterion();
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__DECISION_TREE_SPLITTER:
        return getDecisionTreeSplitter();
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_DEPTH:
        return getMax_depth();
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_SPLIT:
        return getMin_samples_split();
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_LEAF:
        return getMin_samples_leaf();
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF:
        return getMin_weight_fraction_leaf();
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_FEATURES_NUMERIC:
        return getMax_features_numeric();
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_FEATURES_ENUM:
        return getMax_features_enum();
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__RANDOM_STATE:
        return getRandom_state();
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_LEAF_NODES:
        return getMax_leaf_nodes();
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_IMPURITY_DECREASE:
        return getMin_impurity_decrease();
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_IMPURITY_SPLIT:
        return getMin_impurity_split();
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__CLASS_WEIGHT:
        return getClass_weight();
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__CCP_ALPHA:
        return getCcp_alpha();
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
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__DECISION_TREE_CLASSIFIER_CRITERION:
        setDecisionTreeClassifierCriterion((DecisionTreeClassifierCriterion)newValue);
        return;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__DECISION_TREE_SPLITTER:
        setDecisionTreeSplitter((DecisionTreeSplitter)newValue);
        return;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_DEPTH:
        setMax_depth((IntegerLiteral)newValue);
        return;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_SPLIT:
        setMin_samples_split((DoubleLiteral)newValue);
        return;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_LEAF:
        setMin_samples_leaf((DoubleLiteral)newValue);
        return;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF:
        setMin_weight_fraction_leaf((DoubleLiteral)newValue);
        return;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_FEATURES_NUMERIC:
        setMax_features_numeric((DoubleLiteral)newValue);
        return;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_FEATURES_ENUM:
        setMax_features_enum((Max_features_enum)newValue);
        return;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__RANDOM_STATE:
        setRandom_state((IntegerLiteral)newValue);
        return;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_LEAF_NODES:
        setMax_leaf_nodes((IntegerLiteral)newValue);
        return;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_IMPURITY_DECREASE:
        setMin_impurity_decrease((DoubleLiteral)newValue);
        return;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_IMPURITY_SPLIT:
        setMin_impurity_split((DoubleLiteral)newValue);
        return;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__CLASS_WEIGHT:
        setClass_weight((String)newValue);
        return;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__CCP_ALPHA:
        setCcp_alpha((DoubleLiteral)newValue);
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
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__DECISION_TREE_CLASSIFIER_CRITERION:
        setDecisionTreeClassifierCriterion(DECISION_TREE_CLASSIFIER_CRITERION_EDEFAULT);
        return;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__DECISION_TREE_SPLITTER:
        setDecisionTreeSplitter(DECISION_TREE_SPLITTER_EDEFAULT);
        return;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_DEPTH:
        setMax_depth((IntegerLiteral)null);
        return;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_SPLIT:
        setMin_samples_split((DoubleLiteral)null);
        return;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_LEAF:
        setMin_samples_leaf((DoubleLiteral)null);
        return;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF:
        setMin_weight_fraction_leaf((DoubleLiteral)null);
        return;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_FEATURES_NUMERIC:
        setMax_features_numeric((DoubleLiteral)null);
        return;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_FEATURES_ENUM:
        setMax_features_enum(MAX_FEATURES_ENUM_EDEFAULT);
        return;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__RANDOM_STATE:
        setRandom_state((IntegerLiteral)null);
        return;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_LEAF_NODES:
        setMax_leaf_nodes((IntegerLiteral)null);
        return;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_IMPURITY_DECREASE:
        setMin_impurity_decrease((DoubleLiteral)null);
        return;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_IMPURITY_SPLIT:
        setMin_impurity_split((DoubleLiteral)null);
        return;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__CLASS_WEIGHT:
        setClass_weight(CLASS_WEIGHT_EDEFAULT);
        return;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__CCP_ALPHA:
        setCcp_alpha((DoubleLiteral)null);
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
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__DECISION_TREE_CLASSIFIER_CRITERION:
        return decisionTreeClassifierCriterion != DECISION_TREE_CLASSIFIER_CRITERION_EDEFAULT;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__DECISION_TREE_SPLITTER:
        return decisionTreeSplitter != DECISION_TREE_SPLITTER_EDEFAULT;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_DEPTH:
        return max_depth != null;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_SPLIT:
        return min_samples_split != null;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_SAMPLES_LEAF:
        return min_samples_leaf != null;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF:
        return min_weight_fraction_leaf != null;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_FEATURES_NUMERIC:
        return max_features_numeric != null;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_FEATURES_ENUM:
        return max_features_enum != MAX_FEATURES_ENUM_EDEFAULT;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__RANDOM_STATE:
        return random_state != null;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MAX_LEAF_NODES:
        return max_leaf_nodes != null;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_IMPURITY_DECREASE:
        return min_impurity_decrease != null;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__MIN_IMPURITY_SPLIT:
        return min_impurity_split != null;
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__CLASS_WEIGHT:
        return CLASS_WEIGHT_EDEFAULT == null ? class_weight != null : !CLASS_WEIGHT_EDEFAULT.equals(class_weight);
      case ThingMLPackage.DECISION_TREE_CLASSIFIER__CCP_ALPHA:
        return ccp_alpha != null;
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
    result.append(" (decisionTreeClassifierCriterion: ");
    result.append(decisionTreeClassifierCriterion);
    result.append(", decisionTreeSplitter: ");
    result.append(decisionTreeSplitter);
    result.append(", max_features_enum: ");
    result.append(max_features_enum);
    result.append(", class_weight: ");
    result.append(class_weight);
    result.append(')');
    return result.toString();
  }

} //DecisionTreeClassifierImpl
