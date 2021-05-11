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

import org.thingml.xtext.thingML.SelfTrainingClassifier;
import org.thingml.xtext.thingML.ThingMLFactory;
import org.thingml.xtext.thingML.ThingMLPackage;

/**
 * This is the item provider adapter for a {@link org.thingml.xtext.thingML.SelfTrainingClassifier} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SelfTrainingClassifierItemProvider extends ML2_ModelAlgorithmItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfTrainingClassifierItemProvider(AdapterFactory adapterFactory) {
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

			addCriterionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Criterion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCriterionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SelfTrainingClassifier_criterion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SelfTrainingClassifier_criterion_feature", "_UI_SelfTrainingClassifier_type"),
				 ThingMLPackage.eINSTANCE.getSelfTrainingClassifier_Criterion(),
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
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getSelfTrainingClassifier_Base_estimator());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getSelfTrainingClassifier_Threshold());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getSelfTrainingClassifier_K_best());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getSelfTrainingClassifier_Max_iter());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getSelfTrainingClassifier_Verbose());
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
	 * This returns SelfTrainingClassifier.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SelfTrainingClassifier"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SelfTrainingClassifier)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SelfTrainingClassifier_type") :
			getString("_UI_SelfTrainingClassifier_type") + " " + label;
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

		switch (notification.getFeatureID(SelfTrainingClassifier.class)) {
			case ThingMLPackage.SELF_TRAINING_CLASSIFIER__CRITERION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ThingMLPackage.SELF_TRAINING_CLASSIFIER__BASE_ESTIMATOR:
			case ThingMLPackage.SELF_TRAINING_CLASSIFIER__THRESHOLD:
			case ThingMLPackage.SELF_TRAINING_CLASSIFIER__KBEST:
			case ThingMLPackage.SELF_TRAINING_CLASSIFIER__MAX_ITER:
			case ThingMLPackage.SELF_TRAINING_CLASSIFIER__VERBOSE:
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
				(ThingMLPackage.eINSTANCE.getSelfTrainingClassifier_Base_estimator(),
				 ThingMLFactory.eINSTANCE.createClassifierWithPredictionCertaintyProbabilities()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getSelfTrainingClassifier_Base_estimator(),
				 ThingMLFactory.eINSTANCE.createLinearClassifierLogisticRegression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getSelfTrainingClassifier_Base_estimator(),
				 ThingMLFactory.eINSTANCE.createNaiveBayesGaussian()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getSelfTrainingClassifier_Base_estimator(),
				 ThingMLFactory.eINSTANCE.createNaiveBayesMultinomial()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getSelfTrainingClassifier_Base_estimator(),
				 ThingMLFactory.eINSTANCE.createNaiveBayesComplement()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getSelfTrainingClassifier_Base_estimator(),
				 ThingMLFactory.eINSTANCE.createNaiveBayesBernoulli()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getSelfTrainingClassifier_Base_estimator(),
				 ThingMLFactory.eINSTANCE.createNaiveBayesCategorical()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getSelfTrainingClassifier_Base_estimator(),
				 ThingMLFactory.eINSTANCE.createDecisionTreeClassifier()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getSelfTrainingClassifier_Base_estimator(),
				 ThingMLFactory.eINSTANCE.createNN_MultilayerPerceptron()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getSelfTrainingClassifier_Threshold(),
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getSelfTrainingClassifier_K_best(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getSelfTrainingClassifier_Max_iter(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getSelfTrainingClassifier_Verbose(),
				 ThingMLFactory.eINSTANCE.createBooleanLiteral()));
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
			childFeature == ThingMLPackage.eINSTANCE.getSelfTrainingClassifier_K_best() ||
			childFeature == ThingMLPackage.eINSTANCE.getSelfTrainingClassifier_Max_iter();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
