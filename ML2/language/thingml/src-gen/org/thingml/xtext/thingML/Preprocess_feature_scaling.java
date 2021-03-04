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
 * A representation of the literals of the enumeration '<em><b>Preprocess feature scaling</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.thingml.xtext.thingML.ThingMLPackage#getPreprocess_feature_scaling()
 * @model
 * @generated
 */
public enum Preprocess_feature_scaling implements Enumerator
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
   * The '<em><b>OFF</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OFF_VALUE
   * @generated
   * @ordered
   */
  OFF(1, "OFF", "OFF"),

  /**
   * The '<em><b>STANDARDIZATION ZSCORE NORMALIZATION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STANDARDIZATION_ZSCORE_NORMALIZATION_VALUE
   * @generated
   * @ordered
   */
  STANDARDIZATION_ZSCORE_NORMALIZATION(2, "STANDARDIZATION_Z_SCORE_NORMALIZATION", "STANDARDIZATION_Z_SCORE_NORMALIZATION"),

  /**
   * The '<em><b>MIN MAX NORMALIZATION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MIN_MAX_NORMALIZATION_VALUE
   * @generated
   * @ordered
   */
  MIN_MAX_NORMALIZATION(3, "MIN_MAX_NORMALIZATION", "MIN_MAX_NORMALIZATION"),

  /**
   * The '<em><b>MEAN NORMALIZATION MIN MAX</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MEAN_NORMALIZATION_MIN_MAX_VALUE
   * @generated
   * @ordered
   */
  MEAN_NORMALIZATION_MIN_MAX(4, "MEAN_NORMALIZATION_MIN_MAX", "MEAN_NORMALIZATION_MIN_MAX"),

  /**
   * The '<em><b>MEAN NORMALIZATION L2 NORM</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MEAN_NORMALIZATION_L2_NORM_VALUE
   * @generated
   * @ordered
   */
  MEAN_NORMALIZATION_L2_NORM(5, "MEAN_NORMALIZATION_L2_NORM", "MEAN_NORMALIZATION_L2_NORM"),

  /**
   * The '<em><b>UNIT LENGTH SCALING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNIT_LENGTH_SCALING_VALUE
   * @generated
   * @ordered
   */
  UNIT_LENGTH_SCALING(6, "UNIT_LENGTH_SCALING", "UNIT_LENGTH_SCALING");

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
   * The '<em><b>OFF</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>OFF</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OFF
   * @model
   * @generated
   * @ordered
   */
  public static final int OFF_VALUE = 1;

  /**
   * The '<em><b>STANDARDIZATION ZSCORE NORMALIZATION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>STANDARDIZATION ZSCORE NORMALIZATION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STANDARDIZATION_ZSCORE_NORMALIZATION
   * @model name="STANDARDIZATION_Z_SCORE_NORMALIZATION"
   * @generated
   * @ordered
   */
  public static final int STANDARDIZATION_ZSCORE_NORMALIZATION_VALUE = 2;

  /**
   * The '<em><b>MIN MAX NORMALIZATION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MIN MAX NORMALIZATION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MIN_MAX_NORMALIZATION
   * @model
   * @generated
   * @ordered
   */
  public static final int MIN_MAX_NORMALIZATION_VALUE = 3;

  /**
   * The '<em><b>MEAN NORMALIZATION MIN MAX</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MEAN NORMALIZATION MIN MAX</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MEAN_NORMALIZATION_MIN_MAX
   * @model
   * @generated
   * @ordered
   */
  public static final int MEAN_NORMALIZATION_MIN_MAX_VALUE = 4;

  /**
   * The '<em><b>MEAN NORMALIZATION L2 NORM</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MEAN NORMALIZATION L2 NORM</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MEAN_NORMALIZATION_L2_NORM
   * @model
   * @generated
   * @ordered
   */
  public static final int MEAN_NORMALIZATION_L2_NORM_VALUE = 5;

  /**
   * The '<em><b>UNIT LENGTH SCALING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>UNIT LENGTH SCALING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNIT_LENGTH_SCALING
   * @model
   * @generated
   * @ordered
   */
  public static final int UNIT_LENGTH_SCALING_VALUE = 6;

  /**
   * An array of all the '<em><b>Preprocess feature scaling</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Preprocess_feature_scaling[] VALUES_ARRAY =
    new Preprocess_feature_scaling[]
    {
      NOT_SET,
      OFF,
      STANDARDIZATION_ZSCORE_NORMALIZATION,
      MIN_MAX_NORMALIZATION,
      MEAN_NORMALIZATION_MIN_MAX,
      MEAN_NORMALIZATION_L2_NORM,
      UNIT_LENGTH_SCALING,
    };

  /**
   * A public read-only list of all the '<em><b>Preprocess feature scaling</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Preprocess_feature_scaling> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Preprocess feature scaling</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Preprocess_feature_scaling get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Preprocess_feature_scaling result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Preprocess feature scaling</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Preprocess_feature_scaling getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Preprocess_feature_scaling result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Preprocess feature scaling</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Preprocess_feature_scaling get(int value)
  {
    switch (value)
    {
      case NOT_SET_VALUE: return NOT_SET;
      case OFF_VALUE: return OFF;
      case STANDARDIZATION_ZSCORE_NORMALIZATION_VALUE: return STANDARDIZATION_ZSCORE_NORMALIZATION;
      case MIN_MAX_NORMALIZATION_VALUE: return MIN_MAX_NORMALIZATION;
      case MEAN_NORMALIZATION_MIN_MAX_VALUE: return MEAN_NORMALIZATION_MIN_MAX;
      case MEAN_NORMALIZATION_L2_NORM_VALUE: return MEAN_NORMALIZATION_L2_NORM;
      case UNIT_LENGTH_SCALING_VALUE: return UNIT_LENGTH_SCALING;
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
  private Preprocess_feature_scaling(int value, String name, String literal)
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
  
} //Preprocess_feature_scaling
