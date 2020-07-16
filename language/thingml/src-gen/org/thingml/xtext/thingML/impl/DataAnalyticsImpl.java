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
package org.thingml.xtext.thingML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.thingml.xtext.thingML.AnnotatedElement;
import org.thingml.xtext.thingML.DataAnalytics;
import org.thingml.xtext.thingML.DataAnalyticsModelAlgorithm;
import org.thingml.xtext.thingML.Labels;
import org.thingml.xtext.thingML.PlatformAnnotation;
import org.thingml.xtext.thingML.Property;
import org.thingml.xtext.thingML.Sequential;
import org.thingml.xtext.thingML.ThingMLPackage;
import org.thingml.xtext.thingML.Timestamps;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Analytics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.impl.DataAnalyticsImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.DataAnalyticsImpl#getDataset <em>Dataset</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.DataAnalyticsImpl#getSequential <em>Sequential</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.DataAnalyticsImpl#getTimestamps <em>Timestamps</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.DataAnalyticsImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.DataAnalyticsImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.DataAnalyticsImpl#getModelAlgorithm <em>Model Algorithm</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.DataAnalyticsImpl#getTrainingResults <em>Training Results</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.DataAnalyticsImpl#getPredictionResults <em>Prediction Results</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataAnalyticsImpl extends NamedElementImpl implements DataAnalytics
{
  /**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
  protected EList<PlatformAnnotation> annotations;

  /**
	 * The default value of the '{@link #getDataset() <em>Dataset</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDataset()
	 * @generated
	 * @ordered
	 */
  protected static final String DATASET_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getDataset() <em>Dataset</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDataset()
	 * @generated
	 * @ordered
	 */
  protected String dataset = DATASET_EDEFAULT;

  /**
	 * The default value of the '{@link #getSequential() <em>Sequential</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSequential()
	 * @generated
	 * @ordered
	 */
  protected static final Sequential SEQUENTIAL_EDEFAULT = Sequential.TRUE;

  /**
	 * The cached value of the '{@link #getSequential() <em>Sequential</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSequential()
	 * @generated
	 * @ordered
	 */
  protected Sequential sequential = SEQUENTIAL_EDEFAULT;

  /**
	 * The default value of the '{@link #getTimestamps() <em>Timestamps</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTimestamps()
	 * @generated
	 * @ordered
	 */
  protected static final Timestamps TIMESTAMPS_EDEFAULT = Timestamps.ON;

  /**
	 * The cached value of the '{@link #getTimestamps() <em>Timestamps</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTimestamps()
	 * @generated
	 * @ordered
	 */
  protected Timestamps timestamps = TIMESTAMPS_EDEFAULT;

  /**
	 * The default value of the '{@link #getLabels() <em>Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
  protected static final Labels LABELS_EDEFAULT = Labels.ON;

  /**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
  protected Labels labels = LABELS_EDEFAULT;

  /**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
  protected EList<Property> features;

  /**
	 * The cached value of the '{@link #getModelAlgorithm() <em>Model Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getModelAlgorithm()
	 * @generated
	 * @ordered
	 */
  protected DataAnalyticsModelAlgorithm modelAlgorithm;

  /**
	 * The default value of the '{@link #getTrainingResults() <em>Training Results</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTrainingResults()
	 * @generated
	 * @ordered
	 */
  protected static final String TRAINING_RESULTS_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getTrainingResults() <em>Training Results</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTrainingResults()
	 * @generated
	 * @ordered
	 */
  protected String trainingResults = TRAINING_RESULTS_EDEFAULT;

  /**
	 * The cached value of the '{@link #getPredictionResults() <em>Prediction Results</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPredictionResults()
	 * @generated
	 * @ordered
	 */
  protected EList<Property> predictionResults;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DataAnalyticsImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return ThingMLPackage.Literals.DATA_ANALYTICS;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EList<PlatformAnnotation> getAnnotations()
  {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<PlatformAnnotation>(PlatformAnnotation.class, this, ThingMLPackage.DATA_ANALYTICS__ANNOTATIONS);
		}
		return annotations;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public String getDataset()
  {
		return dataset;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setDataset(String newDataset)
  {
		String oldDataset = dataset;
		dataset = newDataset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DATA_ANALYTICS__DATASET, oldDataset, dataset));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Sequential getSequential()
  {
		return sequential;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setSequential(Sequential newSequential)
  {
		Sequential oldSequential = sequential;
		sequential = newSequential == null ? SEQUENTIAL_EDEFAULT : newSequential;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DATA_ANALYTICS__SEQUENTIAL, oldSequential, sequential));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Timestamps getTimestamps()
  {
		return timestamps;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setTimestamps(Timestamps newTimestamps)
  {
		Timestamps oldTimestamps = timestamps;
		timestamps = newTimestamps == null ? TIMESTAMPS_EDEFAULT : newTimestamps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DATA_ANALYTICS__TIMESTAMPS, oldTimestamps, timestamps));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public Labels getLabels()
  {
		return labels;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setLabels(Labels newLabels)
  {
		Labels oldLabels = labels;
		labels = newLabels == null ? LABELS_EDEFAULT : newLabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DATA_ANALYTICS__LABELS, oldLabels, labels));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EList<Property> getFeatures()
  {
		if (features == null) {
			features = new EObjectResolvingEList<Property>(Property.class, this, ThingMLPackage.DATA_ANALYTICS__FEATURES);
		}
		return features;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public DataAnalyticsModelAlgorithm getModelAlgorithm()
  {
		return modelAlgorithm;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetModelAlgorithm(DataAnalyticsModelAlgorithm newModelAlgorithm, NotificationChain msgs)
  {
		DataAnalyticsModelAlgorithm oldModelAlgorithm = modelAlgorithm;
		modelAlgorithm = newModelAlgorithm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.DATA_ANALYTICS__MODEL_ALGORITHM, oldModelAlgorithm, newModelAlgorithm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setModelAlgorithm(DataAnalyticsModelAlgorithm newModelAlgorithm)
  {
		if (newModelAlgorithm != modelAlgorithm) {
			NotificationChain msgs = null;
			if (modelAlgorithm != null)
				msgs = ((InternalEObject)modelAlgorithm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.DATA_ANALYTICS__MODEL_ALGORITHM, null, msgs);
			if (newModelAlgorithm != null)
				msgs = ((InternalEObject)newModelAlgorithm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.DATA_ANALYTICS__MODEL_ALGORITHM, null, msgs);
			msgs = basicSetModelAlgorithm(newModelAlgorithm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DATA_ANALYTICS__MODEL_ALGORITHM, newModelAlgorithm, newModelAlgorithm));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public String getTrainingResults()
  {
		return trainingResults;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public void setTrainingResults(String newTrainingResults)
  {
		String oldTrainingResults = trainingResults;
		trainingResults = newTrainingResults;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.DATA_ANALYTICS__TRAINING_RESULTS, oldTrainingResults, trainingResults));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		public EList<Property> getPredictionResults()
  {
		if (predictionResults == null) {
			predictionResults = new EObjectResolvingEList<Property>(Property.class, this, ThingMLPackage.DATA_ANALYTICS__PREDICTION_RESULTS);
		}
		return predictionResults;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case ThingMLPackage.DATA_ANALYTICS__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case ThingMLPackage.DATA_ANALYTICS__MODEL_ALGORITHM:
				return basicSetModelAlgorithm(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case ThingMLPackage.DATA_ANALYTICS__ANNOTATIONS:
				return getAnnotations();
			case ThingMLPackage.DATA_ANALYTICS__DATASET:
				return getDataset();
			case ThingMLPackage.DATA_ANALYTICS__SEQUENTIAL:
				return getSequential();
			case ThingMLPackage.DATA_ANALYTICS__TIMESTAMPS:
				return getTimestamps();
			case ThingMLPackage.DATA_ANALYTICS__LABELS:
				return getLabels();
			case ThingMLPackage.DATA_ANALYTICS__FEATURES:
				return getFeatures();
			case ThingMLPackage.DATA_ANALYTICS__MODEL_ALGORITHM:
				return getModelAlgorithm();
			case ThingMLPackage.DATA_ANALYTICS__TRAINING_RESULTS:
				return getTrainingResults();
			case ThingMLPackage.DATA_ANALYTICS__PREDICTION_RESULTS:
				return getPredictionResults();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ThingMLPackage.DATA_ANALYTICS__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends PlatformAnnotation>)newValue);
				return;
			case ThingMLPackage.DATA_ANALYTICS__DATASET:
				setDataset((String)newValue);
				return;
			case ThingMLPackage.DATA_ANALYTICS__SEQUENTIAL:
				setSequential((Sequential)newValue);
				return;
			case ThingMLPackage.DATA_ANALYTICS__TIMESTAMPS:
				setTimestamps((Timestamps)newValue);
				return;
			case ThingMLPackage.DATA_ANALYTICS__LABELS:
				setLabels((Labels)newValue);
				return;
			case ThingMLPackage.DATA_ANALYTICS__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Property>)newValue);
				return;
			case ThingMLPackage.DATA_ANALYTICS__MODEL_ALGORITHM:
				setModelAlgorithm((DataAnalyticsModelAlgorithm)newValue);
				return;
			case ThingMLPackage.DATA_ANALYTICS__TRAINING_RESULTS:
				setTrainingResults((String)newValue);
				return;
			case ThingMLPackage.DATA_ANALYTICS__PREDICTION_RESULTS:
				getPredictionResults().clear();
				getPredictionResults().addAll((Collection<? extends Property>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case ThingMLPackage.DATA_ANALYTICS__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case ThingMLPackage.DATA_ANALYTICS__DATASET:
				setDataset(DATASET_EDEFAULT);
				return;
			case ThingMLPackage.DATA_ANALYTICS__SEQUENTIAL:
				setSequential(SEQUENTIAL_EDEFAULT);
				return;
			case ThingMLPackage.DATA_ANALYTICS__TIMESTAMPS:
				setTimestamps(TIMESTAMPS_EDEFAULT);
				return;
			case ThingMLPackage.DATA_ANALYTICS__LABELS:
				setLabels(LABELS_EDEFAULT);
				return;
			case ThingMLPackage.DATA_ANALYTICS__FEATURES:
				getFeatures().clear();
				return;
			case ThingMLPackage.DATA_ANALYTICS__MODEL_ALGORITHM:
				setModelAlgorithm((DataAnalyticsModelAlgorithm)null);
				return;
			case ThingMLPackage.DATA_ANALYTICS__TRAINING_RESULTS:
				setTrainingResults(TRAINING_RESULTS_EDEFAULT);
				return;
			case ThingMLPackage.DATA_ANALYTICS__PREDICTION_RESULTS:
				getPredictionResults().clear();
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case ThingMLPackage.DATA_ANALYTICS__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case ThingMLPackage.DATA_ANALYTICS__DATASET:
				return DATASET_EDEFAULT == null ? dataset != null : !DATASET_EDEFAULT.equals(dataset);
			case ThingMLPackage.DATA_ANALYTICS__SEQUENTIAL:
				return sequential != SEQUENTIAL_EDEFAULT;
			case ThingMLPackage.DATA_ANALYTICS__TIMESTAMPS:
				return timestamps != TIMESTAMPS_EDEFAULT;
			case ThingMLPackage.DATA_ANALYTICS__LABELS:
				return labels != LABELS_EDEFAULT;
			case ThingMLPackage.DATA_ANALYTICS__FEATURES:
				return features != null && !features.isEmpty();
			case ThingMLPackage.DATA_ANALYTICS__MODEL_ALGORITHM:
				return modelAlgorithm != null;
			case ThingMLPackage.DATA_ANALYTICS__TRAINING_RESULTS:
				return TRAINING_RESULTS_EDEFAULT == null ? trainingResults != null : !TRAINING_RESULTS_EDEFAULT.equals(trainingResults);
			case ThingMLPackage.DATA_ANALYTICS__PREDICTION_RESULTS:
				return predictionResults != null && !predictionResults.isEmpty();
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
		if (baseClass == AnnotatedElement.class) {
			switch (derivedFeatureID) {
				case ThingMLPackage.DATA_ANALYTICS__ANNOTATIONS: return ThingMLPackage.ANNOTATED_ELEMENT__ANNOTATIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
		if (baseClass == AnnotatedElement.class) {
			switch (baseFeatureID) {
				case ThingMLPackage.ANNOTATED_ELEMENT__ANNOTATIONS: return ThingMLPackage.DATA_ANALYTICS__ANNOTATIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (dataset: ");
		result.append(dataset);
		result.append(", sequential: ");
		result.append(sequential);
		result.append(", timestamps: ");
		result.append(timestamps);
		result.append(", labels: ");
		result.append(labels);
		result.append(", trainingResults: ");
		result.append(trainingResults);
		result.append(')');
		return result.toString();
	}

} //DataAnalyticsImpl
