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
   * The '<em><b>NOT SET</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOT_SET_VALUE
   * @generated
   * @ordered
   */
  NOT_SET(0, "NOT_SET", "NOT_SET"),

  /**
   * The '<em><b>NEWTON CG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NEWTON_CG_VALUE
   * @generated
   * @ordered
   */
  NEWTON_CG(1, "NEWTON_CG", "newton-cg"),

  /**
   * The '<em><b>LBFGS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LBFGS_VALUE
   * @generated
   * @ordered
   */
  LBFGS(2, "LBFGS", "lbfgs"),

  /**
   * The '<em><b>LIBLINEAR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LIBLINEAR_VALUE
   * @generated
   * @ordered
   */
  LIBLINEAR(3, "LIBLINEAR", "liblinear"),

  /**
   * The '<em><b>SAG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SAG_VALUE
   * @generated
   * @ordered
   */
  SAG(4, "SAG", "sag"),

  /**
   * The '<em><b>SAGA</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SAGA_VALUE
   * @generated
   * @ordered
   */
  SAGA(5, "SAGA", "saga"),

  /**
   * The '<em><b>SGD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SGD_VALUE
   * @generated
   * @ordered
   */
  SGD(6, "SGD", "sgd"),

  /**
   * The '<em><b>ADAM</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ADAM_VALUE
   * @generated
   * @ordered
   */
  ADAM(7, "ADAM", "adam"),

  /**
   * The '<em><b>RMSPROP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RMSPROP_VALUE
   * @generated
   * @ordered
   */
  RMSPROP(8, "RMSPROP", "RMSprop"),

  /**
   * The '<em><b>ADADELTA</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ADADELTA_VALUE
   * @generated
   * @ordered
   */
  ADADELTA(9, "ADADELTA", "Adadelta"),

  /**
   * The '<em><b>ADAGRAD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ADAGRAD_VALUE
   * @generated
   * @ordered
   */
  ADAGRAD(10, "ADAGRAD", "Adagrad"),

  /**
   * The '<em><b>ADAMAX</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ADAMAX_VALUE
   * @generated
   * @ordered
   */
  ADAMAX(11, "ADAMAX", "Adamax"),

  /**
   * The '<em><b>NADAM</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NADAM_VALUE
   * @generated
   * @ordered
   */
  NADAM(12, "NADAM", "Nadam"),

  /**
   * The '<em><b>FTRL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FTRL_VALUE
   * @generated
   * @ordered
   */
  FTRL(13, "FTRL", "Ftrl");

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
   * The '<em><b>NEWTON CG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NEWTON CG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NEWTON_CG
   * @model literal="newton-cg"
   * @generated
   * @ordered
   */
  public static final int NEWTON_CG_VALUE = 1;

  /**
   * The '<em><b>LBFGS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LBFGS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LBFGS
   * @model literal="lbfgs"
   * @generated
   * @ordered
   */
  public static final int LBFGS_VALUE = 2;

  /**
   * The '<em><b>LIBLINEAR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LIBLINEAR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LIBLINEAR
   * @model literal="liblinear"
   * @generated
   * @ordered
   */
  public static final int LIBLINEAR_VALUE = 3;

  /**
   * The '<em><b>SAG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SAG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SAG
   * @model literal="sag"
   * @generated
   * @ordered
   */
  public static final int SAG_VALUE = 4;

  /**
   * The '<em><b>SAGA</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SAGA</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SAGA
   * @model literal="saga"
   * @generated
   * @ordered
   */
  public static final int SAGA_VALUE = 5;

  /**
   * The '<em><b>SGD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SGD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SGD
   * @model literal="sgd"
   * @generated
   * @ordered
   */
  public static final int SGD_VALUE = 6;

  /**
   * The '<em><b>ADAM</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ADAM</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ADAM
   * @model literal="adam"
   * @generated
   * @ordered
   */
  public static final int ADAM_VALUE = 7;

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
  public static final int RMSPROP_VALUE = 8;

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
  public static final int ADADELTA_VALUE = 9;

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
  public static final int ADAGRAD_VALUE = 10;

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
  public static final int ADAMAX_VALUE = 11;

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
  public static final int NADAM_VALUE = 12;

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
  public static final int FTRL_VALUE = 13;

  /**
   * An array of all the '<em><b>Optimizer</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Optimizer[] VALUES_ARRAY =
    new Optimizer[]
    {
      NOT_SET,
      NEWTON_CG,
      LBFGS,
      LIBLINEAR,
      SAG,
      SAGA,
      SGD,
      ADAM,
      RMSPROP,
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
      case NOT_SET_VALUE: return NOT_SET;
      case NEWTON_CG_VALUE: return NEWTON_CG;
      case LBFGS_VALUE: return LBFGS;
      case LIBLINEAR_VALUE: return LIBLINEAR;
      case SAG_VALUE: return SAG;
      case SAGA_VALUE: return SAGA;
      case SGD_VALUE: return SGD;
      case ADAM_VALUE: return ADAM;
      case RMSPROP_VALUE: return RMSPROP;
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
