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

import org.thingml.xtext.thingML.BooleanLiteral;
import org.thingml.xtext.thingML.DoubleLiteral;
import org.thingml.xtext.thingML.IntegerLiteral;
import org.thingml.xtext.thingML.Max_features_enum;
import org.thingml.xtext.thingML.RandomForestClassifier;
import org.thingml.xtext.thingML.RandomForestClassifierCriterion;
import org.thingml.xtext.thingML.ThingMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Random Forest Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.impl.RandomForestClassifierImpl#getN_estimators <em>Nestimators</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.RandomForestClassifierImpl#getRandomForestClassifierCriterion <em>Random Forest Classifier Criterion</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.RandomForestClassifierImpl#getMax_depth <em>Max depth</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.RandomForestClassifierImpl#getMin_samples_split <em>Min samples split</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.RandomForestClassifierImpl#getMin_samples_leaf <em>Min samples leaf</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.RandomForestClassifierImpl#getMin_weight_fraction_leaf <em>Min weight fraction leaf</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.RandomForestClassifierImpl#getMax_features_numeric <em>Max features numeric</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.RandomForestClassifierImpl#getMax_features_enum <em>Max features enum</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.RandomForestClassifierImpl#getMax_leaf_nodes <em>Max leaf nodes</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.RandomForestClassifierImpl#getMin_impurity_decrease <em>Min impurity decrease</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.RandomForestClassifierImpl#getMin_impurity_split <em>Min impurity split</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.RandomForestClassifierImpl#getBootstrap <em>Bootstrap</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.RandomForestClassifierImpl#getOob_score <em>Oob score</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.RandomForestClassifierImpl#getN_jobs <em>Njobs</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.RandomForestClassifierImpl#getRandom_state <em>Random state</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.RandomForestClassifierImpl#getVerbose <em>Verbose</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.RandomForestClassifierImpl#getWarm_start <em>Warm start</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.RandomForestClassifierImpl#getClass_weight <em>Class weight</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.RandomForestClassifierImpl#getCcp_alpha <em>Ccp alpha</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.RandomForestClassifierImpl#getMax_samples <em>Max samples</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RandomForestClassifierImpl extends ML2_ModelAlgorithmImpl implements RandomForestClassifier
{
  /**
   * The cached value of the '{@link #getN_estimators() <em>Nestimators</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN_estimators()
   * @generated
   * @ordered
   */
  protected IntegerLiteral n_estimators;

  /**
   * The default value of the '{@link #getRandomForestClassifierCriterion() <em>Random Forest Classifier Criterion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRandomForestClassifierCriterion()
   * @generated
   * @ordered
   */
  protected static final RandomForestClassifierCriterion RANDOM_FOREST_CLASSIFIER_CRITERION_EDEFAULT = RandomForestClassifierCriterion.NOT_SET;

  /**
   * The cached value of the '{@link #getRandomForestClassifierCriterion() <em>Random Forest Classifier Criterion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRandomForestClassifierCriterion()
   * @generated
   * @ordered
   */
  protected RandomForestClassifierCriterion randomForestClassifierCriterion = RANDOM_FOREST_CLASSIFIER_CRITERION_EDEFAULT;

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
   * The cached value of the '{@link #getBootstrap() <em>Bootstrap</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBootstrap()
   * @generated
   * @ordered
   */
  protected BooleanLiteral bootstrap;

  /**
   * The cached value of the '{@link #getOob_score() <em>Oob score</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOob_score()
   * @generated
   * @ordered
   */
  protected BooleanLiteral oob_score;

  /**
   * The cached value of the '{@link #getN_jobs() <em>Njobs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN_jobs()
   * @generated
   * @ordered
   */
  protected IntegerLiteral n_jobs;

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
   * The cached value of the '{@link #getVerbose() <em>Verbose</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerbose()
   * @generated
   * @ordered
   */
  protected IntegerLiteral verbose;

  /**
   * The cached value of the '{@link #getWarm_start() <em>Warm start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWarm_start()
   * @generated
   * @ordered
   */
  protected BooleanLiteral warm_start;

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
   * The cached value of the '{@link #getMax_samples() <em>Max samples</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax_samples()
   * @generated
   * @ordered
   */
  protected DoubleLiteral max_samples;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RandomForestClassifierImpl()
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
    return ThingMLPackage.eINSTANCE.getRandomForestClassifier();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral getN_estimators()
  {
    return n_estimators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetN_estimators(IntegerLiteral newN_estimators, NotificationChain msgs)
  {
    IntegerLiteral oldN_estimators = n_estimators;
    n_estimators = newN_estimators;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__NESTIMATORS, oldN_estimators, newN_estimators);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setN_estimators(IntegerLiteral newN_estimators)
  {
    if (newN_estimators != n_estimators)
    {
      NotificationChain msgs = null;
      if (n_estimators != null)
        msgs = ((InternalEObject)n_estimators).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__NESTIMATORS, null, msgs);
      if (newN_estimators != null)
        msgs = ((InternalEObject)newN_estimators).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__NESTIMATORS, null, msgs);
      msgs = basicSetN_estimators(newN_estimators, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__NESTIMATORS, newN_estimators, newN_estimators));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RandomForestClassifierCriterion getRandomForestClassifierCriterion()
  {
    return randomForestClassifierCriterion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRandomForestClassifierCriterion(RandomForestClassifierCriterion newRandomForestClassifierCriterion)
  {
    RandomForestClassifierCriterion oldRandomForestClassifierCriterion = randomForestClassifierCriterion;
    randomForestClassifierCriterion = newRandomForestClassifierCriterion == null ? RANDOM_FOREST_CLASSIFIER_CRITERION_EDEFAULT : newRandomForestClassifierCriterion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__RANDOM_FOREST_CLASSIFIER_CRITERION, oldRandomForestClassifierCriterion, randomForestClassifierCriterion));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_DEPTH, oldMax_depth, newMax_depth);
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
        msgs = ((InternalEObject)max_depth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_DEPTH, null, msgs);
      if (newMax_depth != null)
        msgs = ((InternalEObject)newMax_depth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_DEPTH, null, msgs);
      msgs = basicSetMax_depth(newMax_depth, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_DEPTH, newMax_depth, newMax_depth));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_SPLIT, oldMin_samples_split, newMin_samples_split);
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
        msgs = ((InternalEObject)min_samples_split).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_SPLIT, null, msgs);
      if (newMin_samples_split != null)
        msgs = ((InternalEObject)newMin_samples_split).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_SPLIT, null, msgs);
      msgs = basicSetMin_samples_split(newMin_samples_split, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_SPLIT, newMin_samples_split, newMin_samples_split));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_LEAF, oldMin_samples_leaf, newMin_samples_leaf);
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
        msgs = ((InternalEObject)min_samples_leaf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_LEAF, null, msgs);
      if (newMin_samples_leaf != null)
        msgs = ((InternalEObject)newMin_samples_leaf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_LEAF, null, msgs);
      msgs = basicSetMin_samples_leaf(newMin_samples_leaf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_LEAF, newMin_samples_leaf, newMin_samples_leaf));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF, oldMin_weight_fraction_leaf, newMin_weight_fraction_leaf);
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
        msgs = ((InternalEObject)min_weight_fraction_leaf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF, null, msgs);
      if (newMin_weight_fraction_leaf != null)
        msgs = ((InternalEObject)newMin_weight_fraction_leaf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF, null, msgs);
      msgs = basicSetMin_weight_fraction_leaf(newMin_weight_fraction_leaf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF, newMin_weight_fraction_leaf, newMin_weight_fraction_leaf));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_FEATURES_NUMERIC, oldMax_features_numeric, newMax_features_numeric);
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
        msgs = ((InternalEObject)max_features_numeric).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_FEATURES_NUMERIC, null, msgs);
      if (newMax_features_numeric != null)
        msgs = ((InternalEObject)newMax_features_numeric).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_FEATURES_NUMERIC, null, msgs);
      msgs = basicSetMax_features_numeric(newMax_features_numeric, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_FEATURES_NUMERIC, newMax_features_numeric, newMax_features_numeric));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_FEATURES_ENUM, oldMax_features_enum, max_features_enum));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_LEAF_NODES, oldMax_leaf_nodes, newMax_leaf_nodes);
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
        msgs = ((InternalEObject)max_leaf_nodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_LEAF_NODES, null, msgs);
      if (newMax_leaf_nodes != null)
        msgs = ((InternalEObject)newMax_leaf_nodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_LEAF_NODES, null, msgs);
      msgs = basicSetMax_leaf_nodes(newMax_leaf_nodes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_LEAF_NODES, newMax_leaf_nodes, newMax_leaf_nodes));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_IMPURITY_DECREASE, oldMin_impurity_decrease, newMin_impurity_decrease);
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
        msgs = ((InternalEObject)min_impurity_decrease).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_IMPURITY_DECREASE, null, msgs);
      if (newMin_impurity_decrease != null)
        msgs = ((InternalEObject)newMin_impurity_decrease).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_IMPURITY_DECREASE, null, msgs);
      msgs = basicSetMin_impurity_decrease(newMin_impurity_decrease, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_IMPURITY_DECREASE, newMin_impurity_decrease, newMin_impurity_decrease));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_IMPURITY_SPLIT, oldMin_impurity_split, newMin_impurity_split);
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
        msgs = ((InternalEObject)min_impurity_split).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_IMPURITY_SPLIT, null, msgs);
      if (newMin_impurity_split != null)
        msgs = ((InternalEObject)newMin_impurity_split).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_IMPURITY_SPLIT, null, msgs);
      msgs = basicSetMin_impurity_split(newMin_impurity_split, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_IMPURITY_SPLIT, newMin_impurity_split, newMin_impurity_split));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral getBootstrap()
  {
    return bootstrap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBootstrap(BooleanLiteral newBootstrap, NotificationChain msgs)
  {
    BooleanLiteral oldBootstrap = bootstrap;
    bootstrap = newBootstrap;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__BOOTSTRAP, oldBootstrap, newBootstrap);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBootstrap(BooleanLiteral newBootstrap)
  {
    if (newBootstrap != bootstrap)
    {
      NotificationChain msgs = null;
      if (bootstrap != null)
        msgs = ((InternalEObject)bootstrap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__BOOTSTRAP, null, msgs);
      if (newBootstrap != null)
        msgs = ((InternalEObject)newBootstrap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__BOOTSTRAP, null, msgs);
      msgs = basicSetBootstrap(newBootstrap, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__BOOTSTRAP, newBootstrap, newBootstrap));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral getOob_score()
  {
    return oob_score;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOob_score(BooleanLiteral newOob_score, NotificationChain msgs)
  {
    BooleanLiteral oldOob_score = oob_score;
    oob_score = newOob_score;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__OOB_SCORE, oldOob_score, newOob_score);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOob_score(BooleanLiteral newOob_score)
  {
    if (newOob_score != oob_score)
    {
      NotificationChain msgs = null;
      if (oob_score != null)
        msgs = ((InternalEObject)oob_score).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__OOB_SCORE, null, msgs);
      if (newOob_score != null)
        msgs = ((InternalEObject)newOob_score).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__OOB_SCORE, null, msgs);
      msgs = basicSetOob_score(newOob_score, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__OOB_SCORE, newOob_score, newOob_score));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral getN_jobs()
  {
    return n_jobs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetN_jobs(IntegerLiteral newN_jobs, NotificationChain msgs)
  {
    IntegerLiteral oldN_jobs = n_jobs;
    n_jobs = newN_jobs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__NJOBS, oldN_jobs, newN_jobs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setN_jobs(IntegerLiteral newN_jobs)
  {
    if (newN_jobs != n_jobs)
    {
      NotificationChain msgs = null;
      if (n_jobs != null)
        msgs = ((InternalEObject)n_jobs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__NJOBS, null, msgs);
      if (newN_jobs != null)
        msgs = ((InternalEObject)newN_jobs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__NJOBS, null, msgs);
      msgs = basicSetN_jobs(newN_jobs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__NJOBS, newN_jobs, newN_jobs));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__RANDOM_STATE, oldRandom_state, newRandom_state);
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
        msgs = ((InternalEObject)random_state).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__RANDOM_STATE, null, msgs);
      if (newRandom_state != null)
        msgs = ((InternalEObject)newRandom_state).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__RANDOM_STATE, null, msgs);
      msgs = basicSetRandom_state(newRandom_state, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__RANDOM_STATE, newRandom_state, newRandom_state));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral getVerbose()
  {
    return verbose;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVerbose(IntegerLiteral newVerbose, NotificationChain msgs)
  {
    IntegerLiteral oldVerbose = verbose;
    verbose = newVerbose;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__VERBOSE, oldVerbose, newVerbose);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVerbose(IntegerLiteral newVerbose)
  {
    if (newVerbose != verbose)
    {
      NotificationChain msgs = null;
      if (verbose != null)
        msgs = ((InternalEObject)verbose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__VERBOSE, null, msgs);
      if (newVerbose != null)
        msgs = ((InternalEObject)newVerbose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__VERBOSE, null, msgs);
      msgs = basicSetVerbose(newVerbose, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__VERBOSE, newVerbose, newVerbose));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral getWarm_start()
  {
    return warm_start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWarm_start(BooleanLiteral newWarm_start, NotificationChain msgs)
  {
    BooleanLiteral oldWarm_start = warm_start;
    warm_start = newWarm_start;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__WARM_START, oldWarm_start, newWarm_start);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWarm_start(BooleanLiteral newWarm_start)
  {
    if (newWarm_start != warm_start)
    {
      NotificationChain msgs = null;
      if (warm_start != null)
        msgs = ((InternalEObject)warm_start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__WARM_START, null, msgs);
      if (newWarm_start != null)
        msgs = ((InternalEObject)newWarm_start).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__WARM_START, null, msgs);
      msgs = basicSetWarm_start(newWarm_start, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__WARM_START, newWarm_start, newWarm_start));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__CLASS_WEIGHT, oldClass_weight, class_weight));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__CCP_ALPHA, oldCcp_alpha, newCcp_alpha);
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
        msgs = ((InternalEObject)ccp_alpha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__CCP_ALPHA, null, msgs);
      if (newCcp_alpha != null)
        msgs = ((InternalEObject)newCcp_alpha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__CCP_ALPHA, null, msgs);
      msgs = basicSetCcp_alpha(newCcp_alpha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__CCP_ALPHA, newCcp_alpha, newCcp_alpha));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleLiteral getMax_samples()
  {
    return max_samples;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMax_samples(DoubleLiteral newMax_samples, NotificationChain msgs)
  {
    DoubleLiteral oldMax_samples = max_samples;
    max_samples = newMax_samples;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_SAMPLES, oldMax_samples, newMax_samples);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMax_samples(DoubleLiteral newMax_samples)
  {
    if (newMax_samples != max_samples)
    {
      NotificationChain msgs = null;
      if (max_samples != null)
        msgs = ((InternalEObject)max_samples).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_SAMPLES, null, msgs);
      if (newMax_samples != null)
        msgs = ((InternalEObject)newMax_samples).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_SAMPLES, null, msgs);
      msgs = basicSetMax_samples(newMax_samples, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_SAMPLES, newMax_samples, newMax_samples));
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
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__NESTIMATORS:
        return basicSetN_estimators(null, msgs);
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_DEPTH:
        return basicSetMax_depth(null, msgs);
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_SPLIT:
        return basicSetMin_samples_split(null, msgs);
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_LEAF:
        return basicSetMin_samples_leaf(null, msgs);
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF:
        return basicSetMin_weight_fraction_leaf(null, msgs);
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_FEATURES_NUMERIC:
        return basicSetMax_features_numeric(null, msgs);
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_LEAF_NODES:
        return basicSetMax_leaf_nodes(null, msgs);
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_IMPURITY_DECREASE:
        return basicSetMin_impurity_decrease(null, msgs);
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_IMPURITY_SPLIT:
        return basicSetMin_impurity_split(null, msgs);
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__BOOTSTRAP:
        return basicSetBootstrap(null, msgs);
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__OOB_SCORE:
        return basicSetOob_score(null, msgs);
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__NJOBS:
        return basicSetN_jobs(null, msgs);
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__RANDOM_STATE:
        return basicSetRandom_state(null, msgs);
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__VERBOSE:
        return basicSetVerbose(null, msgs);
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__WARM_START:
        return basicSetWarm_start(null, msgs);
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__CCP_ALPHA:
        return basicSetCcp_alpha(null, msgs);
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_SAMPLES:
        return basicSetMax_samples(null, msgs);
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
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__NESTIMATORS:
        return getN_estimators();
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__RANDOM_FOREST_CLASSIFIER_CRITERION:
        return getRandomForestClassifierCriterion();
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_DEPTH:
        return getMax_depth();
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_SPLIT:
        return getMin_samples_split();
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_LEAF:
        return getMin_samples_leaf();
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF:
        return getMin_weight_fraction_leaf();
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_FEATURES_NUMERIC:
        return getMax_features_numeric();
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_FEATURES_ENUM:
        return getMax_features_enum();
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_LEAF_NODES:
        return getMax_leaf_nodes();
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_IMPURITY_DECREASE:
        return getMin_impurity_decrease();
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_IMPURITY_SPLIT:
        return getMin_impurity_split();
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__BOOTSTRAP:
        return getBootstrap();
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__OOB_SCORE:
        return getOob_score();
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__NJOBS:
        return getN_jobs();
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__RANDOM_STATE:
        return getRandom_state();
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__VERBOSE:
        return getVerbose();
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__WARM_START:
        return getWarm_start();
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__CLASS_WEIGHT:
        return getClass_weight();
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__CCP_ALPHA:
        return getCcp_alpha();
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_SAMPLES:
        return getMax_samples();
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
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__NESTIMATORS:
        setN_estimators((IntegerLiteral)newValue);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__RANDOM_FOREST_CLASSIFIER_CRITERION:
        setRandomForestClassifierCriterion((RandomForestClassifierCriterion)newValue);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_DEPTH:
        setMax_depth((IntegerLiteral)newValue);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_SPLIT:
        setMin_samples_split((DoubleLiteral)newValue);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_LEAF:
        setMin_samples_leaf((DoubleLiteral)newValue);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF:
        setMin_weight_fraction_leaf((DoubleLiteral)newValue);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_FEATURES_NUMERIC:
        setMax_features_numeric((DoubleLiteral)newValue);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_FEATURES_ENUM:
        setMax_features_enum((Max_features_enum)newValue);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_LEAF_NODES:
        setMax_leaf_nodes((IntegerLiteral)newValue);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_IMPURITY_DECREASE:
        setMin_impurity_decrease((DoubleLiteral)newValue);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_IMPURITY_SPLIT:
        setMin_impurity_split((DoubleLiteral)newValue);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__BOOTSTRAP:
        setBootstrap((BooleanLiteral)newValue);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__OOB_SCORE:
        setOob_score((BooleanLiteral)newValue);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__NJOBS:
        setN_jobs((IntegerLiteral)newValue);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__RANDOM_STATE:
        setRandom_state((IntegerLiteral)newValue);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__VERBOSE:
        setVerbose((IntegerLiteral)newValue);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__WARM_START:
        setWarm_start((BooleanLiteral)newValue);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__CLASS_WEIGHT:
        setClass_weight((String)newValue);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__CCP_ALPHA:
        setCcp_alpha((DoubleLiteral)newValue);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_SAMPLES:
        setMax_samples((DoubleLiteral)newValue);
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
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__NESTIMATORS:
        setN_estimators((IntegerLiteral)null);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__RANDOM_FOREST_CLASSIFIER_CRITERION:
        setRandomForestClassifierCriterion(RANDOM_FOREST_CLASSIFIER_CRITERION_EDEFAULT);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_DEPTH:
        setMax_depth((IntegerLiteral)null);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_SPLIT:
        setMin_samples_split((DoubleLiteral)null);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_LEAF:
        setMin_samples_leaf((DoubleLiteral)null);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF:
        setMin_weight_fraction_leaf((DoubleLiteral)null);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_FEATURES_NUMERIC:
        setMax_features_numeric((DoubleLiteral)null);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_FEATURES_ENUM:
        setMax_features_enum(MAX_FEATURES_ENUM_EDEFAULT);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_LEAF_NODES:
        setMax_leaf_nodes((IntegerLiteral)null);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_IMPURITY_DECREASE:
        setMin_impurity_decrease((DoubleLiteral)null);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_IMPURITY_SPLIT:
        setMin_impurity_split((DoubleLiteral)null);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__BOOTSTRAP:
        setBootstrap((BooleanLiteral)null);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__OOB_SCORE:
        setOob_score((BooleanLiteral)null);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__NJOBS:
        setN_jobs((IntegerLiteral)null);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__RANDOM_STATE:
        setRandom_state((IntegerLiteral)null);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__VERBOSE:
        setVerbose((IntegerLiteral)null);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__WARM_START:
        setWarm_start((BooleanLiteral)null);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__CLASS_WEIGHT:
        setClass_weight(CLASS_WEIGHT_EDEFAULT);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__CCP_ALPHA:
        setCcp_alpha((DoubleLiteral)null);
        return;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_SAMPLES:
        setMax_samples((DoubleLiteral)null);
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
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__NESTIMATORS:
        return n_estimators != null;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__RANDOM_FOREST_CLASSIFIER_CRITERION:
        return randomForestClassifierCriterion != RANDOM_FOREST_CLASSIFIER_CRITERION_EDEFAULT;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_DEPTH:
        return max_depth != null;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_SPLIT:
        return min_samples_split != null;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_LEAF:
        return min_samples_leaf != null;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF:
        return min_weight_fraction_leaf != null;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_FEATURES_NUMERIC:
        return max_features_numeric != null;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_FEATURES_ENUM:
        return max_features_enum != MAX_FEATURES_ENUM_EDEFAULT;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_LEAF_NODES:
        return max_leaf_nodes != null;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_IMPURITY_DECREASE:
        return min_impurity_decrease != null;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_IMPURITY_SPLIT:
        return min_impurity_split != null;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__BOOTSTRAP:
        return bootstrap != null;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__OOB_SCORE:
        return oob_score != null;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__NJOBS:
        return n_jobs != null;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__RANDOM_STATE:
        return random_state != null;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__VERBOSE:
        return verbose != null;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__WARM_START:
        return warm_start != null;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__CLASS_WEIGHT:
        return CLASS_WEIGHT_EDEFAULT == null ? class_weight != null : !CLASS_WEIGHT_EDEFAULT.equals(class_weight);
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__CCP_ALPHA:
        return ccp_alpha != null;
      case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_SAMPLES:
        return max_samples != null;
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
    result.append(" (randomForestClassifierCriterion: ");
    result.append(randomForestClassifierCriterion);
    result.append(", max_features_enum: ");
    result.append(max_features_enum);
    result.append(", class_weight: ");
    result.append(class_weight);
    result.append(')');
    return result.toString();
  }

} //RandomForestClassifierImpl
