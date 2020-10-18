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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Decision Tree Criterion</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.thingml.xtext.thingML.ThingMLPackage#getDecisionTreeCriterion()
 * @model
 * @generated
 */
public enum DecisionTreeCriterion implements Enumerator
{
  /**
   * The '<em><b>NO IDEA</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NO_IDEA_VALUE
   * @generated
   * @ordered
   */
  NO_IDEA(0, "NO_IDEA", "NO_IDEA"),

  /**
   * The '<em><b>MSE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MSE_VALUE
   * @generated
   * @ordered
   */
  MSE(1, "MSE", "MSE"),

  /**
   * The '<em><b>FRIEDMAN MSE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FRIEDMAN_MSE_VALUE
   * @generated
   * @ordered
   */
  FRIEDMAN_MSE(2, "FRIEDMAN_MSE", "FRIEDMAN_MSE"),

  /**
   * The '<em><b>MAE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAE_VALUE
   * @generated
   * @ordered
   */
  MAE(3, "MAE", "MAE"),

  /**
   * The '<em><b>GINI</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GINI_VALUE
   * @generated
   * @ordered
   */
  GINI(4, "GINI", "GINI"),

  /**
   * The '<em><b>ENTROPY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENTROPY_VALUE
   * @generated
   * @ordered
   */
  ENTROPY(5, "ENTROPY", "ENTROPY");

  /**
   * The '<em><b>NO IDEA</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NO IDEA</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NO_IDEA
   * @model
   * @generated
   * @ordered
   */
  public static final int NO_IDEA_VALUE = 0;

  /**
   * The '<em><b>MSE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MSE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MSE
   * @model
   * @generated
   * @ordered
   */
  public static final int MSE_VALUE = 1;

  /**
   * The '<em><b>FRIEDMAN MSE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FRIEDMAN MSE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FRIEDMAN_MSE
   * @model
   * @generated
   * @ordered
   */
  public static final int FRIEDMAN_MSE_VALUE = 2;

  /**
   * The '<em><b>MAE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MAE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MAE
   * @model
   * @generated
   * @ordered
   */
  public static final int MAE_VALUE = 3;

  /**
   * The '<em><b>GINI</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>GINI</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GINI
   * @model
   * @generated
   * @ordered
   */
  public static final int GINI_VALUE = 4;

  /**
   * The '<em><b>ENTROPY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ENTROPY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENTROPY
   * @model
   * @generated
   * @ordered
   */
  public static final int ENTROPY_VALUE = 5;

  /**
   * An array of all the '<em><b>Decision Tree Criterion</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DecisionTreeCriterion[] VALUES_ARRAY =
    new DecisionTreeCriterion[]
    {
      NO_IDEA,
      MSE,
      FRIEDMAN_MSE,
      MAE,
      GINI,
      ENTROPY,
    };

  /**
   * A public read-only list of all the '<em><b>Decision Tree Criterion</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<DecisionTreeCriterion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Decision Tree Criterion</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DecisionTreeCriterion get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DecisionTreeCriterion result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Decision Tree Criterion</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DecisionTreeCriterion getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DecisionTreeCriterion result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Decision Tree Criterion</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DecisionTreeCriterion get(int value)
  {
    switch (value)
    {
      case NO_IDEA_VALUE: return NO_IDEA;
      case MSE_VALUE: return MSE;
      case FRIEDMAN_MSE_VALUE: return FRIEDMAN_MSE;
      case MAE_VALUE: return MAE;
      case GINI_VALUE: return GINI;
      case ENTROPY_VALUE: return ENTROPY;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private DecisionTreeCriterion(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //DecisionTreeCriterion
