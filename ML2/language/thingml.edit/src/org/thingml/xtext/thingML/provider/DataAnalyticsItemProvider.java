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
package org.thingml.xtext.thingML.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.thingml.xtext.thingML.DataAnalytics;
import org.thingml.xtext.thingML.ThingMLFactory;
import org.thingml.xtext.thingML.ThingMLPackage;

/**
 * This is the item provider adapter for a {@link org.thingml.xtext.thingML.DataAnalytics} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataAnalyticsItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAnalyticsItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addLabelsPropertyDescriptor(object);
			addFeaturesPropertyDescriptor(object);
			addPredictionResultsPropertyDescriptor(object);
			addDatasetPropertyDescriptor(object);
			addAutoMLPropertyDescriptor(object);
			addSequentialPropertyDescriptor(object);
			addTimestampsPropertyDescriptor(object);
			addPreprocess_feature_scalerPropertyDescriptor(object);
			addPreprocess_sample_normalizerPropertyDescriptor(object);
			addTrainingResultsPropertyDescriptor(object);
			addBlackbox_ml_modelPropertyDescriptor(object);
			addBlackbox_import_algorithmPropertyDescriptor(object);
			addBlackbox_label_encoderPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Labels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataAnalytics_labels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataAnalytics_labels_feature", "_UI_DataAnalytics_type"),
				 ThingMLPackage.eINSTANCE.getDataAnalytics_Labels(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Features feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeaturesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataAnalytics_features_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataAnalytics_features_feature", "_UI_DataAnalytics_type"),
				 ThingMLPackage.eINSTANCE.getDataAnalytics_Features(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Prediction Results feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPredictionResultsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataAnalytics_predictionResults_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataAnalytics_predictionResults_feature", "_UI_DataAnalytics_type"),
				 ThingMLPackage.eINSTANCE.getDataAnalytics_PredictionResults(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dataset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatasetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataAnalytics_dataset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataAnalytics_dataset_feature", "_UI_DataAnalytics_type"),
				 ThingMLPackage.eINSTANCE.getDataAnalytics_Dataset(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auto ML feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoMLPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataAnalytics_autoML_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataAnalytics_autoML_feature", "_UI_DataAnalytics_type"),
				 ThingMLPackage.eINSTANCE.getDataAnalytics_AutoML(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sequential feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSequentialPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataAnalytics_sequential_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataAnalytics_sequential_feature", "_UI_DataAnalytics_type"),
				 ThingMLPackage.eINSTANCE.getDataAnalytics_Sequential(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timestamps feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimestampsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataAnalytics_timestamps_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataAnalytics_timestamps_feature", "_UI_DataAnalytics_type"),
				 ThingMLPackage.eINSTANCE.getDataAnalytics_Timestamps(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Preprocess feature scaler feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreprocess_feature_scalerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataAnalytics_preprocess_feature_scaler_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataAnalytics_preprocess_feature_scaler_feature", "_UI_DataAnalytics_type"),
				 ThingMLPackage.eINSTANCE.getDataAnalytics_Preprocess_feature_scaler(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Preprocess sample normalizer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreprocess_sample_normalizerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataAnalytics_preprocess_sample_normalizer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataAnalytics_preprocess_sample_normalizer_feature", "_UI_DataAnalytics_type"),
				 ThingMLPackage.eINSTANCE.getDataAnalytics_Preprocess_sample_normalizer(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Training Results feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrainingResultsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataAnalytics_trainingResults_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataAnalytics_trainingResults_feature", "_UI_DataAnalytics_type"),
				 ThingMLPackage.eINSTANCE.getDataAnalytics_TrainingResults(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Blackbox ml model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlackbox_ml_modelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataAnalytics_blackbox_ml_model_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataAnalytics_blackbox_ml_model_feature", "_UI_DataAnalytics_type"),
				 ThingMLPackage.eINSTANCE.getDataAnalytics_Blackbox_ml_model(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Blackbox import algorithm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlackbox_import_algorithmPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataAnalytics_blackbox_import_algorithm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataAnalytics_blackbox_import_algorithm_feature", "_UI_DataAnalytics_type"),
				 ThingMLPackage.eINSTANCE.getDataAnalytics_Blackbox_import_algorithm(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Blackbox label encoder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlackbox_label_encoderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataAnalytics_blackbox_label_encoder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataAnalytics_blackbox_label_encoder_feature", "_UI_DataAnalytics_type"),
				 ThingMLPackage.eINSTANCE.getDataAnalytics_Blackbox_label_encoder(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getAnnotatedElement_Annotations());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getDataAnalytics_ModelAlgorithm());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getDataAnalytics_Blackbox_ml());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DataAnalytics.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataAnalytics"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DataAnalytics)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DataAnalytics_type") :
			getString("_UI_DataAnalytics_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DataAnalytics.class)) {
			case ThingMLPackage.DATA_ANALYTICS__LABELS:
			case ThingMLPackage.DATA_ANALYTICS__DATASET:
			case ThingMLPackage.DATA_ANALYTICS__AUTO_ML:
			case ThingMLPackage.DATA_ANALYTICS__SEQUENTIAL:
			case ThingMLPackage.DATA_ANALYTICS__TIMESTAMPS:
			case ThingMLPackage.DATA_ANALYTICS__PREPROCESS_FEATURE_SCALER:
			case ThingMLPackage.DATA_ANALYTICS__PREPROCESS_SAMPLE_NORMALIZER:
			case ThingMLPackage.DATA_ANALYTICS__TRAINING_RESULTS:
			case ThingMLPackage.DATA_ANALYTICS__BLACKBOX_ML_MODEL:
			case ThingMLPackage.DATA_ANALYTICS__BLACKBOX_IMPORT_ALGORITHM:
			case ThingMLPackage.DATA_ANALYTICS__BLACKBOX_LABEL_ENCODER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ThingMLPackage.DATA_ANALYTICS__ANNOTATIONS:
			case ThingMLPackage.DATA_ANALYTICS__MODEL_ALGORITHM:
			case ThingMLPackage.DATA_ANALYTICS__BLACKBOX_ML:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getAnnotatedElement_Annotations(),
				 ThingMLFactory.eINSTANCE.createPlatformAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getDataAnalytics_ModelAlgorithm(),
				 ThingMLFactory.eINSTANCE.createDataAnalyticsModelAlgorithm()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getDataAnalytics_ModelAlgorithm(),
				 ThingMLFactory.eINSTANCE.createML2_ModelAlgorithm()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getDataAnalytics_ModelAlgorithm(),
				 ThingMLFactory.eINSTANCE.createPMML_ModelAlgorithm()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getDataAnalytics_ModelAlgorithm(),
				 ThingMLFactory.eINSTANCE.createPFA_ModelAlgorithm()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getDataAnalytics_ModelAlgorithm(),
				 ThingMLFactory.eINSTANCE.createLinearRegression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getDataAnalytics_ModelAlgorithm(),
				 ThingMLFactory.eINSTANCE.createLinearClassifierLogisticRegression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getDataAnalytics_ModelAlgorithm(),
				 ThingMLFactory.eINSTANCE.createNaiveBayesGaussian()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getDataAnalytics_ModelAlgorithm(),
				 ThingMLFactory.eINSTANCE.createNaiveBayesMultinomial()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getDataAnalytics_ModelAlgorithm(),
				 ThingMLFactory.eINSTANCE.createNaiveBayesComplement()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getDataAnalytics_ModelAlgorithm(),
				 ThingMLFactory.eINSTANCE.createNaiveBayesBernoulli()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getDataAnalytics_ModelAlgorithm(),
				 ThingMLFactory.eINSTANCE.createNaiveBayesCategorical()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getDataAnalytics_ModelAlgorithm(),
				 ThingMLFactory.eINSTANCE.createDecisionTreeRegressor()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getDataAnalytics_ModelAlgorithm(),
				 ThingMLFactory.eINSTANCE.createDecisionTreeClassifier()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getDataAnalytics_ModelAlgorithm(),
				 ThingMLFactory.eINSTANCE.createRandomForestRegressor()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getDataAnalytics_ModelAlgorithm(),
				 ThingMLFactory.eINSTANCE.createRandomForestClassifier()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getDataAnalytics_ModelAlgorithm(),
				 ThingMLFactory.eINSTANCE.createNN_MultilayerPerceptron()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getDataAnalytics_ModelAlgorithm(),
				 ThingMLFactory.eINSTANCE.createKMeans()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getDataAnalytics_ModelAlgorithm(),
				 ThingMLFactory.eINSTANCE.createMiniBatchKMeans()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getDataAnalytics_ModelAlgorithm(),
				 ThingMLFactory.eINSTANCE.createDBSCAN()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getDataAnalytics_ModelAlgorithm(),
				 ThingMLFactory.eINSTANCE.createSpectralClustering()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getDataAnalytics_ModelAlgorithm(),
				 ThingMLFactory.eINSTANCE.createGaussianMixture()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getDataAnalytics_ModelAlgorithm(),
				 ThingMLFactory.eINSTANCE.createSelfTrainingClassifier()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getDataAnalytics_ModelAlgorithm(),
				 ThingMLFactory.eINSTANCE.createLabelPropagation()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getDataAnalytics_ModelAlgorithm(),
				 ThingMLFactory.eINSTANCE.createLabelSpreading()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getDataAnalytics_Blackbox_ml(),
				 ThingMLFactory.eINSTANCE.createBooleanLiteral()));
	}

}
