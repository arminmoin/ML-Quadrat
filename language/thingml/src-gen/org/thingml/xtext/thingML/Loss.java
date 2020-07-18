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
 * A representation of the literals of the enumeration '<em><b>Loss</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.thingml.xtext.thingML.ThingMLPackage#getLoss()
 * @model
 * @generated
 */
public enum Loss implements Enumerator
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
	 * The '<em><b>SPARSE CATEGORICAL CROSSENTROPY</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #SPARSE_CATEGORICAL_CROSSENTROPY_VALUE
	 * @generated
	 * @ordered
	 */
  SPARSE_CATEGORICAL_CROSSENTROPY(1, "SPARSE_CATEGORICAL_CROSSENTROPY", "sparse_categorical_crossentropy"),

  /**
	 * The '<em><b>CATEGORICAL CROSSENTROPY</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #CATEGORICAL_CROSSENTROPY_VALUE
	 * @generated
	 * @ordered
	 */
  CATEGORICAL_CROSSENTROPY(2, "CATEGORICAL_CROSSENTROPY", "categorical_crossentropy"),

  /**
	 * The '<em><b>MSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #MSE_VALUE
	 * @generated
	 * @ordered
	 */
  MSE(3, "MSE", "MSE");

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
	 * The '<em><b>SPARSE CATEGORICAL CROSSENTROPY</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SPARSE CATEGORICAL CROSSENTROPY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #SPARSE_CATEGORICAL_CROSSENTROPY
	 * @model literal="sparse_categorical_crossentropy"
	 * @generated
	 * @ordered
	 */
  public static final int SPARSE_CATEGORICAL_CROSSENTROPY_VALUE = 1;

  /**
	 * The '<em><b>CATEGORICAL CROSSENTROPY</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CATEGORICAL CROSSENTROPY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #CATEGORICAL_CROSSENTROPY
	 * @model literal="categorical_crossentropy"
	 * @generated
	 * @ordered
	 */
  public static final int CATEGORICAL_CROSSENTROPY_VALUE = 2;

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
  public static final int MSE_VALUE = 3;

  /**
	 * An array of all the '<em><b>Loss</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final Loss[] VALUES_ARRAY =
    new Loss[] {
			NO_IDEA,
			SPARSE_CATEGORICAL_CROSSENTROPY,
			CATEGORICAL_CROSSENTROPY,
			MSE,
		};

  /**
	 * A public read-only list of all the '<em><b>Loss</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<Loss> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Loss</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static Loss get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Loss result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Loss</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static Loss getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Loss result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Loss</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static Loss get(int value)
  {
		switch (value) {
			case NO_IDEA_VALUE: return NO_IDEA;
			case SPARSE_CATEGORICAL_CROSSENTROPY_VALUE: return SPARSE_CATEGORICAL_CROSSENTROPY;
			case CATEGORICAL_CROSSENTROPY_VALUE: return CATEGORICAL_CROSSENTROPY;
			case MSE_VALUE: return MSE;
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
  private Loss(int value, String name, String literal)
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
  
} //Loss
