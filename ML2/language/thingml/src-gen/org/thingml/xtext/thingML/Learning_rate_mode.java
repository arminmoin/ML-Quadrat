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
 * A representation of the literals of the enumeration '<em><b>Learning rate mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.thingml.xtext.thingML.ThingMLPackage#getLearning_rate_mode()
 * @model
 * @generated
 */
public enum Learning_rate_mode implements Enumerator
{
  /**
   * The '<em><b>NOT SET</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOT_SET_VALUE
   * @generated
   * @ordered
   */
  NOT_SET(0, "NOT_SET", "NOT_SET"),

  /**
   * The '<em><b>CONSTANT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONSTANT_VALUE
   * @generated
   * @ordered
   */
  CONSTANT(1, "CONSTANT", "\'constant\'"),

  /**
   * The '<em><b>INVSCALING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INVSCALING_VALUE
   * @generated
   * @ordered
   */
  INVSCALING(2, "INVSCALING", "\'invscaling\'"),

  /**
   * The '<em><b>ADAPTIVE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ADAPTIVE_VALUE
   * @generated
   * @ordered
   */
  ADAPTIVE(3, "ADAPTIVE", "\'adaptive\'"),

  /**
   * The '<em><b>EXPONENTIAL DECAY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EXPONENTIAL_DECAY_VALUE
   * @generated
   * @ordered
   */
  EXPONENTIAL_DECAY(4, "EXPONENTIAL_DECAY", "ExponentialDecay"),

  /**
   * The '<em><b>PIECEWISE CONSTANT DECAY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PIECEWISE_CONSTANT_DECAY_VALUE
   * @generated
   * @ordered
   */
  PIECEWISE_CONSTANT_DECAY(5, "PIECEWISE_CONSTANT_DECAY", "PiecewiseConstantDecay"),

  /**
   * The '<em><b>POLYNOMIAL DECAY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #POLYNOMIAL_DECAY_VALUE
   * @generated
   * @ordered
   */
  POLYNOMIAL_DECAY(6, "POLYNOMIAL_DECAY", "PolynomialDecay"),

  /**
   * The '<em><b>INVERSE TIME DECAY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INVERSE_TIME_DECAY_VALUE
   * @generated
   * @ordered
   */
  INVERSE_TIME_DECAY(7, "INVERSE_TIME_DECAY", "InverseTimeDecay");

  /**
   * The '<em><b>NOT SET</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NOT SET</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NOT_SET
   * @model
   * @generated
   * @ordered
   */
  public static final int NOT_SET_VALUE = 0;

  /**
   * The '<em><b>CONSTANT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CONSTANT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONSTANT
   * @model literal="\'constant\'"
   * @generated
   * @ordered
   */
  public static final int CONSTANT_VALUE = 1;

  /**
   * The '<em><b>INVSCALING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INVSCALING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INVSCALING
   * @model literal="\'invscaling\'"
   * @generated
   * @ordered
   */
  public static final int INVSCALING_VALUE = 2;

  /**
   * The '<em><b>ADAPTIVE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ADAPTIVE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ADAPTIVE
   * @model literal="\'adaptive\'"
   * @generated
   * @ordered
   */
  public static final int ADAPTIVE_VALUE = 3;

  /**
   * The '<em><b>EXPONENTIAL DECAY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EXPONENTIAL DECAY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EXPONENTIAL_DECAY
   * @model literal="ExponentialDecay"
   * @generated
   * @ordered
   */
  public static final int EXPONENTIAL_DECAY_VALUE = 4;

  /**
   * The '<em><b>PIECEWISE CONSTANT DECAY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PIECEWISE CONSTANT DECAY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PIECEWISE_CONSTANT_DECAY
   * @model literal="PiecewiseConstantDecay"
   * @generated
   * @ordered
   */
  public static final int PIECEWISE_CONSTANT_DECAY_VALUE = 5;

  /**
   * The '<em><b>POLYNOMIAL DECAY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>POLYNOMIAL DECAY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #POLYNOMIAL_DECAY
   * @model literal="PolynomialDecay"
   * @generated
   * @ordered
   */
  public static final int POLYNOMIAL_DECAY_VALUE = 6;

  /**
   * The '<em><b>INVERSE TIME DECAY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INVERSE TIME DECAY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INVERSE_TIME_DECAY
   * @model literal="InverseTimeDecay"
   * @generated
   * @ordered
   */
  public static final int INVERSE_TIME_DECAY_VALUE = 7;

  /**
   * An array of all the '<em><b>Learning rate mode</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Learning_rate_mode[] VALUES_ARRAY =
    new Learning_rate_mode[]
    {
      NOT_SET,
      CONSTANT,
      INVSCALING,
      ADAPTIVE,
      EXPONENTIAL_DECAY,
      PIECEWISE_CONSTANT_DECAY,
      POLYNOMIAL_DECAY,
      INVERSE_TIME_DECAY,
    };

  /**
   * A public read-only list of all the '<em><b>Learning rate mode</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Learning_rate_mode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Learning rate mode</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Learning_rate_mode get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Learning_rate_mode result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Learning rate mode</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Learning_rate_mode getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Learning_rate_mode result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Learning rate mode</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Learning_rate_mode get(int value)
  {
    switch (value)
    {
      case NOT_SET_VALUE: return NOT_SET;
      case CONSTANT_VALUE: return CONSTANT;
      case INVSCALING_VALUE: return INVSCALING;
      case ADAPTIVE_VALUE: return ADAPTIVE;
      case EXPONENTIAL_DECAY_VALUE: return EXPONENTIAL_DECAY;
      case PIECEWISE_CONSTANT_DECAY_VALUE: return PIECEWISE_CONSTANT_DECAY;
      case POLYNOMIAL_DECAY_VALUE: return POLYNOMIAL_DECAY;
      case INVERSE_TIME_DECAY_VALUE: return INVERSE_TIME_DECAY;
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
  private Learning_rate_mode(int value, String name, String literal)
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
  
} //Learning_rate_mode
