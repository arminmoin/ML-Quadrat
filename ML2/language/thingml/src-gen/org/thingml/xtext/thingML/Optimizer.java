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
 * A representation of the literals of the enumeration '<em><b>Optimizer</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.thingml.xtext.thingML.ThingMLPackage#getOptimizer()
 * @model
 * @generated
 */
public enum Optimizer implements Enumerator
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
   * The '<em><b>SGD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SGD_VALUE
   * @generated
   * @ordered
   */
  SGD(1, "SGD", "SGD"),

  /**
   * The '<em><b>RMSPROP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RMSPROP_VALUE
   * @generated
   * @ordered
   */
  RMSPROP(2, "RMSPROP", "RMSprop"),

  /**
   * The '<em><b>ADAM</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ADAM_VALUE
   * @generated
   * @ordered
   */
  ADAM(3, "ADAM", "Adam"),

  /**
   * The '<em><b>ADADELTA</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ADADELTA_VALUE
   * @generated
   * @ordered
   */
  ADADELTA(4, "ADADELTA", "Adadelta"),

  /**
   * The '<em><b>ADAGRAD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ADAGRAD_VALUE
   * @generated
   * @ordered
   */
  ADAGRAD(5, "ADAGRAD", "Adagrad"),

  /**
   * The '<em><b>ADAMAX</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ADAMAX_VALUE
   * @generated
   * @ordered
   */
  ADAMAX(6, "ADAMAX", "Adamax"),

  /**
   * The '<em><b>NADAM</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NADAM_VALUE
   * @generated
   * @ordered
   */
  NADAM(7, "NADAM", "Nadam"),

  /**
   * The '<em><b>FTRL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FTRL_VALUE
   * @generated
   * @ordered
   */
  FTRL(8, "FTRL", "Ftrl");

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
   * The '<em><b>SGD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SGD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SGD
   * @model
   * @generated
   * @ordered
   */
  public static final int SGD_VALUE = 1;

  /**
   * The '<em><b>RMSPROP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RMSPROP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RMSPROP
   * @model literal="RMSprop"
   * @generated
   * @ordered
   */
  public static final int RMSPROP_VALUE = 2;

  /**
   * The '<em><b>ADAM</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ADAM</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ADAM
   * @model literal="Adam"
   * @generated
   * @ordered
   */
  public static final int ADAM_VALUE = 3;

  /**
   * The '<em><b>ADADELTA</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ADADELTA</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ADADELTA
   * @model literal="Adadelta"
   * @generated
   * @ordered
   */
  public static final int ADADELTA_VALUE = 4;

  /**
   * The '<em><b>ADAGRAD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ADAGRAD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ADAGRAD
   * @model literal="Adagrad"
   * @generated
   * @ordered
   */
  public static final int ADAGRAD_VALUE = 5;

  /**
   * The '<em><b>ADAMAX</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ADAMAX</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ADAMAX
   * @model literal="Adamax"
   * @generated
   * @ordered
   */
  public static final int ADAMAX_VALUE = 6;

  /**
   * The '<em><b>NADAM</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NADAM</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NADAM
   * @model literal="Nadam"
   * @generated
   * @ordered
   */
  public static final int NADAM_VALUE = 7;

  /**
   * The '<em><b>FTRL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FTRL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FTRL
   * @model literal="Ftrl"
   * @generated
   * @ordered
   */
  public static final int FTRL_VALUE = 8;

  /**
   * An array of all the '<em><b>Optimizer</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Optimizer[] VALUES_ARRAY =
    new Optimizer[]
    {
      NO_IDEA,
      SGD,
      RMSPROP,
      ADAM,
      ADADELTA,
      ADAGRAD,
      ADAMAX,
      NADAM,
      FTRL,
    };

  /**
   * A public read-only list of all the '<em><b>Optimizer</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Optimizer> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Optimizer</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Optimizer get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Optimizer result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Optimizer</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Optimizer getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Optimizer result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Optimizer</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Optimizer get(int value)
  {
    switch (value)
    {
      case NO_IDEA_VALUE: return NO_IDEA;
      case SGD_VALUE: return SGD;
      case RMSPROP_VALUE: return RMSPROP;
      case ADAM_VALUE: return ADAM;
      case ADADELTA_VALUE: return ADADELTA;
      case ADAGRAD_VALUE: return ADAGRAD;
      case ADAMAX_VALUE: return ADAMAX;
      case NADAM_VALUE: return NADAM;
      case FTRL_VALUE: return FTRL;
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
  private Optimizer(int value, String name, String literal)
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
  
} //Optimizer
