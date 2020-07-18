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
 * A representation of the literals of the enumeration '<em><b>Random Forest Criterion</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.thingml.xtext.thingML.ThingMLPackage#getRandomForestCriterion()
 * @model
 * @generated
 */
public enum RandomForestCriterion implements Enumerator
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
	 * The '<em><b>MAE</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #MAE_VALUE
	 * @generated
	 * @ordered
	 */
  MAE(2, "MAE", "MAE"),

  /**
	 * The '<em><b>GINI</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #GINI_VALUE
	 * @generated
	 * @ordered
	 */
  GINI(3, "GINI", "GINI"),

  /**
	 * The '<em><b>ENTROPY</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #ENTROPY_VALUE
	 * @generated
	 * @ordered
	 */
  ENTROPY(4, "ENTROPY", "ENTROPY");

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
  public static final int MAE_VALUE = 2;

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
  public static final int GINI_VALUE = 3;

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
  public static final int ENTROPY_VALUE = 4;

  /**
	 * An array of all the '<em><b>Random Forest Criterion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final RandomForestCriterion[] VALUES_ARRAY =
    new RandomForestCriterion[] {
			NO_IDEA,
			MSE,
			MAE,
			GINI,
			ENTROPY,
		};

  /**
	 * A public read-only list of all the '<em><b>Random Forest Criterion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<RandomForestCriterion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Random Forest Criterion</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static RandomForestCriterion get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RandomForestCriterion result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Random Forest Criterion</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static RandomForestCriterion getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RandomForestCriterion result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Random Forest Criterion</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static RandomForestCriterion get(int value)
  {
		switch (value) {
			case NO_IDEA_VALUE: return NO_IDEA;
			case MSE_VALUE: return MSE;
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
  private RandomForestCriterion(int value, String name, String literal)
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
  @Override
		public int getValue()
  {
	  return value;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public String getName()
  {
	  return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
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
  
} //RandomForestCriterion