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

import org.thingml.xtext.thingML.LinearClassifierLogisticRegression;
import org.thingml.xtext.thingML.ThingMLFactory;
import org.thingml.xtext.thingML.ThingMLPackage;

/**
 * This is the item provider adapter for a {@link org.thingml.xtext.thingML.LinearClassifierLogisticRegression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LinearClassifierLogisticRegressionItemProvider extends ML2_ModelAlgorithmItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearClassifierLogisticRegressionItemProvider(AdapterFactory adapterFactory) {
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

			addPenaltyPropertyDescriptor(object);
			addClass_weightPropertyDescriptor(object);
			addOptimizerPropertyDescriptor(object);
			addMulti_classPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Penalty feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPenaltyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LinearClassifierLogisticRegression_penalty_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LinearClassifierLogisticRegression_penalty_feature", "_UI_LinearClassifierLogisticRegression_type"),
				 ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_Penalty(),
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
				 getString("_UI_LinearClassifierLogisticRegression_class_weight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LinearClassifierLogisticRegression_class_weight_feature", "_UI_LinearClassifierLogisticRegression_type"),
				 ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_Class_weight(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Optimizer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOptimizerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LinearClassifierLogisticRegression_optimizer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LinearClassifierLogisticRegression_optimizer_feature", "_UI_LinearClassifierLogisticRegression_type"),
				 ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_Optimizer(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Multi class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMulti_classPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LinearClassifierLogisticRegression_multi_class_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LinearClassifierLogisticRegression_multi_class_feature", "_UI_LinearClassifierLogisticRegression_type"),
				 ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_Multi_class(),
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
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_Dual());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_Tol());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_C());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_Fit_intercept());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_Intercept_scaling());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_Random_state());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_Max_iter());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_Verbose());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_Warm_start());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_N_jobs());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_L1_ratio());
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
	 * This returns LinearClassifierLogisticRegression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LinearClassifierLogisticRegression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LinearClassifierLogisticRegression)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_LinearClassifierLogisticRegression_type") :
			getString("_UI_LinearClassifierLogisticRegression_type") + " " + label;
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

		switch (notification.getFeatureID(LinearClassifierLogisticRegression.class)) {
			case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__PENALTY:
			case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__CLASS_WEIGHT:
			case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__OPTIMIZER:
			case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__MULTI_CLASS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__DUAL:
			case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__TOL:
			case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__C:
			case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__FIT_INTERCEPT:
			case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__INTERCEPT_SCALING:
			case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__RANDOM_STATE:
			case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__MAX_ITER:
			case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__VERBOSE:
			case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__WARM_START:
			case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__NJOBS:
			case ThingMLPackage.LINEAR_CLASSIFIER_LOGISTIC_REGRESSION__L1_RATIO:
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
				(ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_Dual(),
				 ThingMLFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_Tol(),
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_C(),
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_Fit_intercept(),
				 ThingMLFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_Intercept_scaling(),
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_Random_state(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_Max_iter(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_Verbose(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_Warm_start(),
				 ThingMLFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_N_jobs(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_L1_ratio(),
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
			childFeature == ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_Dual() ||
			childFeature == ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_Fit_intercept() ||
			childFeature == ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_Warm_start() ||
			childFeature == ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_Tol() ||
			childFeature == ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_C() ||
			childFeature == ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_Intercept_scaling() ||
			childFeature == ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_L1_ratio() ||
			childFeature == ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_Random_state() ||
			childFeature == ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_Max_iter() ||
			childFeature == ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_Verbose() ||
			childFeature == ThingMLPackage.eINSTANCE.getLinearClassifierLogisticRegression_N_jobs();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
