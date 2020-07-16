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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Analytics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.DataAnalytics#getDataset <em>Dataset</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.DataAnalytics#getSequential <em>Sequential</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.DataAnalytics#getTimestamps <em>Timestamps</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.DataAnalytics#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.DataAnalytics#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.DataAnalytics#getModelAlgorithm <em>Model Algorithm</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.DataAnalytics#getTrainingResults <em>Training Results</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.DataAnalytics#getPredictionResults <em>Prediction Results</em>}</li>
 * </ul>
 *
 * @see org.thingml.xtext.thingML.ThingMLPackage#getDataAnalytics()
 * @model
 * @generated
 */
public interface DataAnalytics extends NamedElement, AnnotatedElement
{
  /**
	 * Returns the value of the '<em><b>Dataset</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dataset</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset</em>' attribute.
	 * @see #setDataset(String)
	 * @see org.thingml.xtext.thingML.ThingMLPackage#getDataAnalytics_Dataset()
	 * @model
	 * @generated
	 */
  String getDataset();

  /**
	 * Sets the value of the '{@link org.thingml.xtext.thingML.DataAnalytics#getDataset <em>Dataset</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataset</em>' attribute.
	 * @see #getDataset()
	 * @generated
	 */
  void setDataset(String value);

  /**
	 * Returns the value of the '<em><b>Sequential</b></em>' attribute.
	 * The literals are from the enumeration {@link org.thingml.xtext.thingML.Sequential}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sequential</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequential</em>' attribute.
	 * @see org.thingml.xtext.thingML.Sequential
	 * @see #setSequential(Sequential)
	 * @see org.thingml.xtext.thingML.ThingMLPackage#getDataAnalytics_Sequential()
	 * @model
	 * @generated
	 */
  Sequential getSequential();

  /**
	 * Sets the value of the '{@link org.thingml.xtext.thingML.DataAnalytics#getSequential <em>Sequential</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequential</em>' attribute.
	 * @see org.thingml.xtext.thingML.Sequential
	 * @see #getSequential()
	 * @generated
	 */
  void setSequential(Sequential value);

  /**
	 * Returns the value of the '<em><b>Timestamps</b></em>' attribute.
	 * The literals are from the enumeration {@link org.thingml.xtext.thingML.Timestamps}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Timestamps</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamps</em>' attribute.
	 * @see org.thingml.xtext.thingML.Timestamps
	 * @see #setTimestamps(Timestamps)
	 * @see org.thingml.xtext.thingML.ThingMLPackage#getDataAnalytics_Timestamps()
	 * @model
	 * @generated
	 */
  Timestamps getTimestamps();

  /**
	 * Sets the value of the '{@link org.thingml.xtext.thingML.DataAnalytics#getTimestamps <em>Timestamps</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamps</em>' attribute.
	 * @see org.thingml.xtext.thingML.Timestamps
	 * @see #getTimestamps()
	 * @generated
	 */
  void setTimestamps(Timestamps value);

  /**
	 * Returns the value of the '<em><b>Labels</b></em>' attribute.
	 * The literals are from the enumeration {@link org.thingml.xtext.thingML.Labels}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Labels</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' attribute.
	 * @see org.thingml.xtext.thingML.Labels
	 * @see #setLabels(Labels)
	 * @see org.thingml.xtext.thingML.ThingMLPackage#getDataAnalytics_Labels()
	 * @model
	 * @generated
	 */
  Labels getLabels();

  /**
	 * Sets the value of the '{@link org.thingml.xtext.thingML.DataAnalytics#getLabels <em>Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labels</em>' attribute.
	 * @see org.thingml.xtext.thingML.Labels
	 * @see #getLabels()
	 * @generated
	 */
  void setLabels(Labels value);

  /**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link org.thingml.xtext.thingML.Property}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see org.thingml.xtext.thingML.ThingMLPackage#getDataAnalytics_Features()
	 * @model
	 * @generated
	 */
  EList<Property> getFeatures();

  /**
	 * Returns the value of the '<em><b>Model Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Algorithm</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Algorithm</em>' containment reference.
	 * @see #setModelAlgorithm(DataAnalyticsModelAlgorithm)
	 * @see org.thingml.xtext.thingML.ThingMLPackage#getDataAnalytics_ModelAlgorithm()
	 * @model containment="true"
	 * @generated
	 */
  DataAnalyticsModelAlgorithm getModelAlgorithm();

  /**
	 * Sets the value of the '{@link org.thingml.xtext.thingML.DataAnalytics#getModelAlgorithm <em>Model Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Algorithm</em>' containment reference.
	 * @see #getModelAlgorithm()
	 * @generated
	 */
  void setModelAlgorithm(DataAnalyticsModelAlgorithm value);

  /**
	 * Returns the value of the '<em><b>Training Results</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Training Results</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Training Results</em>' attribute.
	 * @see #setTrainingResults(String)
	 * @see org.thingml.xtext.thingML.ThingMLPackage#getDataAnalytics_TrainingResults()
	 * @model
	 * @generated
	 */
  String getTrainingResults();

  /**
	 * Sets the value of the '{@link org.thingml.xtext.thingML.DataAnalytics#getTrainingResults <em>Training Results</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Training Results</em>' attribute.
	 * @see #getTrainingResults()
	 * @generated
	 */
  void setTrainingResults(String value);

  /**
	 * Returns the value of the '<em><b>Prediction Results</b></em>' reference list.
	 * The list contents are of type {@link org.thingml.xtext.thingML.Property}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prediction Results</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Prediction Results</em>' reference list.
	 * @see org.thingml.xtext.thingML.ThingMLPackage#getDataAnalytics_PredictionResults()
	 * @model
	 * @generated
	 */
  EList<Property> getPredictionResults();

} // DataAnalytics
