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

import org.thingml.xtext.thingML.RandomForestClassifier;
import org.thingml.xtext.thingML.ThingMLFactory;
import org.thingml.xtext.thingML.ThingMLPackage;

/**
 * This is the item provider adapter for a {@link org.thingml.xtext.thingML.RandomForestClassifier} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RandomForestClassifierItemProvider extends ML2_ModelAlgorithmItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RandomForestClassifierItemProvider(AdapterFactory adapterFactory) {
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

			addRandomForestClassifierCriterionPropertyDescriptor(object);
			addMax_features_enumPropertyDescriptor(object);
			addClass_weightPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Random Forest Classifier Criterion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRandomForestClassifierCriterionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RandomForestClassifier_randomForestClassifierCriterion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RandomForestClassifier_randomForestClassifierCriterion_feature", "_UI_RandomForestClassifier_type"),
				 ThingMLPackage.eINSTANCE.getRandomForestClassifier_RandomForestClassifierCriterion(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max features enum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMax_features_enumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RandomForestClassifier_max_features_enum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RandomForestClassifier_max_features_enum_feature", "_UI_RandomForestClassifier_type"),
				 ThingMLPackage.eINSTANCE.getRandomForestClassifier_Max_features_enum(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Class weight feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClass_weightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RandomForestClassifier_class_weight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RandomForestClassifier_class_weight_feature", "_UI_RandomForestClassifier_type"),
				 ThingMLPackage.eINSTANCE.getRandomForestClassifier_Class_weight(),
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
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getRandomForestClassifier_N_estimators());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Max_depth());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Min_samples_split());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Min_samples_leaf());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Min_weight_fraction_leaf());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Max_features_numeric());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Max_leaf_nodes());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Min_impurity_decrease());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Min_impurity_split());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Bootstrap());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Oob_score());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getRandomForestClassifier_N_jobs());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Random_state());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Verbose());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Warm_start());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Ccp_alpha());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Max_samples());
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
	 * This returns RandomForestClassifier.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RandomForestClassifier"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RandomForestClassifier)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_RandomForestClassifier_type") :
			getString("_UI_RandomForestClassifier_type") + " " + label;
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

		switch (notification.getFeatureID(RandomForestClassifier.class)) {
			case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__RANDOM_FOREST_CLASSIFIER_CRITERION:
			case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_FEATURES_ENUM:
			case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__CLASS_WEIGHT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__NESTIMATORS:
			case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_DEPTH:
			case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_SPLIT:
			case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_SAMPLES_LEAF:
			case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_WEIGHT_FRACTION_LEAF:
			case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_FEATURES_NUMERIC:
			case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_LEAF_NODES:
			case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_IMPURITY_DECREASE:
			case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MIN_IMPURITY_SPLIT:
			case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__BOOTSTRAP:
			case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__OOB_SCORE:
			case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__NJOBS:
			case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__RANDOM_STATE:
			case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__VERBOSE:
			case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__WARM_START:
			case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__CCP_ALPHA:
			case ThingMLPackage.RANDOM_FOREST_CLASSIFIER__MAX_SAMPLES:
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
				(ThingMLPackage.eINSTANCE.getRandomForestClassifier_N_estimators(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Max_depth(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Min_samples_split(),
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Min_samples_leaf(),
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Min_weight_fraction_leaf(),
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Max_features_numeric(),
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Max_leaf_nodes(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Min_impurity_decrease(),
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Min_impurity_split(),
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Bootstrap(),
				 ThingMLFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Oob_score(),
				 ThingMLFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getRandomForestClassifier_N_jobs(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Random_state(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Verbose(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Warm_start(),
				 ThingMLFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Ccp_alpha(),
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getRandomForestClassifier_Max_samples(),
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ThingMLPackage.eINSTANCE.getRandomForestClassifier_N_estimators() ||
			childFeature == ThingMLPackage.eINSTANCE.getRandomForestClassifier_Max_depth() ||
			childFeature == ThingMLPackage.eINSTANCE.getRandomForestClassifier_Max_leaf_nodes() ||
			childFeature == ThingMLPackage.eINSTANCE.getRandomForestClassifier_N_jobs() ||
			childFeature == ThingMLPackage.eINSTANCE.getRandomForestClassifier_Random_state() ||
			childFeature == ThingMLPackage.eINSTANCE.getRandomForestClassifier_Verbose() ||
			childFeature == ThingMLPackage.eINSTANCE.getRandomForestClassifier_Min_samples_split() ||
			childFeature == ThingMLPackage.eINSTANCE.getRandomForestClassifier_Min_samples_leaf() ||
			childFeature == ThingMLPackage.eINSTANCE.getRandomForestClassifier_Min_weight_fraction_leaf() ||
			childFeature == ThingMLPackage.eINSTANCE.getRandomForestClassifier_Max_features_numeric() ||
			childFeature == ThingMLPackage.eINSTANCE.getRandomForestClassifier_Min_impurity_decrease() ||
			childFeature == ThingMLPackage.eINSTANCE.getRandomForestClassifier_Min_impurity_split() ||
			childFeature == ThingMLPackage.eINSTANCE.getRandomForestClassifier_Ccp_alpha() ||
			childFeature == ThingMLPackage.eINSTANCE.getRandomForestClassifier_Max_samples() ||
			childFeature == ThingMLPackage.eINSTANCE.getRandomForestClassifier_Bootstrap() ||
			childFeature == ThingMLPackage.eINSTANCE.getRandomForestClassifier_Oob_score() ||
			childFeature == ThingMLPackage.eINSTANCE.getRandomForestClassifier_Warm_start();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
