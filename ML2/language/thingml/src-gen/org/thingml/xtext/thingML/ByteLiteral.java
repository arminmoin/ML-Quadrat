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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Byte Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.ByteLiteral#getByteValue <em>Byte Value</em>}</li>
 * </ul>
 *
 * @see org.thingml.xtext.thingML.ThingMLPackage#getByteLiteral()
 * @model
 * @generated
 */
public interface ByteLiteral extends Literal
{
  /**
   * Returns the value of the '<em><b>Byte Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Byte Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Byte Value</em>' attribute.
   * @see #setByteValue(byte)
   * @see org.thingml.xtext.thingML.ThingMLPackage#getByteLiteral_ByteValue()
   * @model
   * @generated
   */
  byte getByteValue();

  /**
   * Sets the value of the '{@link org.thingml.xtext.thingML.ByteLiteral#getByteValue <em>Byte Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Byte Value</em>' attribute.
   * @see #getByteValue()
   * @generated
   */
  void setByteValue(byte value);

} // ByteLiteral
