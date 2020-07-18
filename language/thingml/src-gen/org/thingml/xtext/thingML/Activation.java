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
 * A representation of the literals of the enumeration '<em><b>Activation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.thingml.xtext.thingML.ThingMLPackage#getActivation()
 * @model
 * @generated
 */
public enum Activation implements Enumerator
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
	 * The '<em><b>RELU</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #RELU_VALUE
	 * @generated
	 * @ordered
	 */
  RELU(1, "RELU", "relu"),

  /**
	 * The '<em><b>SIGMOID</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #SIGMOID_VALUE
	 * @generated
	 * @ordered
	 */
  SIGMOID(2, "SIGMOID", "sigmoid"),

  /**
	 * The '<em><b>SOFTMAX</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #SOFTMAX_VALUE
	 * @generated
	 * @ordered
	 */
  SOFTMAX(3, "SOFTMAX", "softmax"),

  /**
	 * The '<em><b>SOFTPLUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #SOFTPLUS_VALUE
	 * @generated
	 * @ordered
	 */
  SOFTPLUS(4, "SOFTPLUS", "softplus"),

  /**
	 * The '<em><b>SOFTSIGN</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #SOFTSIGN_VALUE
	 * @generated
	 * @ordered
	 */
  SOFTSIGN(5, "SOFTSIGN", "softsign"),

  /**
	 * The '<em><b>TANH</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #TANH_VALUE
	 * @generated
	 * @ordered
	 */
  TANH(6, "TANH", "tanh"),

  /**
	 * The '<em><b>SELU</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #SELU_VALUE
	 * @generated
	 * @ordered
	 */
  SELU(7, "SELU", "selu"),

  /**
	 * The '<em><b>ELU</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #ELU_VALUE
	 * @generated
	 * @ordered
	 */
  ELU(8, "ELU", "elu"),

  /**
	 * The '<em><b>EXPONENTIAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #EXPONENTIAL_VALUE
	 * @generated
	 * @ordered
	 */
  EXPONENTIAL(9, "EXPONENTIAL", "exponential");

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
	 * The '<em><b>RELU</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RELU</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #RELU
	 * @model literal="relu"
	 * @generated
	 * @ordered
	 */
  public static final int RELU_VALUE = 1;

  /**
	 * The '<em><b>SIGMOID</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SIGMOID</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #SIGMOID
	 * @model literal="sigmoid"
	 * @generated
	 * @ordered
	 */
  public static final int SIGMOID_VALUE = 2;

  /**
	 * The '<em><b>SOFTMAX</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SOFTMAX</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #SOFTMAX
	 * @model literal="softmax"
	 * @generated
	 * @ordered
	 */
  public static final int SOFTMAX_VALUE = 3;

  /**
	 * The '<em><b>SOFTPLUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SOFTPLUS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #SOFTPLUS
	 * @model literal="softplus"
	 * @generated
	 * @ordered
	 */
  public static final int SOFTPLUS_VALUE = 4;

  /**
	 * The '<em><b>SOFTSIGN</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SOFTSIGN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #SOFTSIGN
	 * @model literal="softsign"
	 * @generated
	 * @ordered
	 */
  public static final int SOFTSIGN_VALUE = 5;

  /**
	 * The '<em><b>TANH</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TANH</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #TANH
	 * @model literal="tanh"
	 * @generated
	 * @ordered
	 */
  public static final int TANH_VALUE = 6;

  /**
	 * The '<em><b>SELU</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SELU</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #SELU
	 * @model literal="selu"
	 * @generated
	 * @ordered
	 */
  public static final int SELU_VALUE = 7;

  /**
	 * The '<em><b>ELU</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ELU</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #ELU
	 * @model literal="elu"
	 * @generated
	 * @ordered
	 */
  public static final int ELU_VALUE = 8;

  /**
	 * The '<em><b>EXPONENTIAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EXPONENTIAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #EXPONENTIAL
	 * @model literal="exponential"
	 * @generated
	 * @ordered
	 */
  public static final int EXPONENTIAL_VALUE = 9;

  /**
	 * An array of all the '<em><b>Activation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final Activation[] VALUES_ARRAY =
    new Activation[] {
			NO_IDEA,
			RELU,
			SIGMOID,
			SOFTMAX,
			SOFTPLUS,
			SOFTSIGN,
			TANH,
			SELU,
			ELU,
			EXPONENTIAL,
		};

  /**
	 * A public read-only list of all the '<em><b>Activation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<Activation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Activation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static Activation get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Activation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Activation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static Activation getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Activation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Activation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
  public static Activation get(int value)
  {
		switch (value) {
			case NO_IDEA_VALUE: return NO_IDEA;
			case RELU_VALUE: return RELU;
			case SIGMOID_VALUE: return SIGMOID;
			case SOFTMAX_VALUE: return SOFTMAX;
			case SOFTPLUS_VALUE: return SOFTPLUS;
			case SOFTSIGN_VALUE: return SOFTSIGN;
			case TANH_VALUE: return TANH;
			case SELU_VALUE: return SELU;
			case ELU_VALUE: return ELU;
			case EXPONENTIAL_VALUE: return EXPONENTIAL;
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
  private Activation(int value, String name, String literal)
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
  
} //Activation
