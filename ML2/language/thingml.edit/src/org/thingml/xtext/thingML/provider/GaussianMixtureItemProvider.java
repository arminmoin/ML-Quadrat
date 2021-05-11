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

import org.thingml.xtext.thingML.GaussianMixture;
import org.thingml.xtext.thingML.ThingMLFactory;
import org.thingml.xtext.thingML.ThingMLPackage;

/**
 * This is the item provider adapter for a {@link org.thingml.xtext.thingML.GaussianMixture} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GaussianMixtureItemProvider extends ML2_ModelAlgorithmItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaussianMixtureItemProvider(AdapterFactory adapterFactory) {
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

			addCovariance_typePropertyDescriptor(object);
			addInit_paramsPropertyDescriptor(object);
			addWeights_initPropertyDescriptor(object);
			addMeans_initPropertyDescriptor(object);
			addPrecisions_initPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Covariance type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCovariance_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GaussianMixture_covariance_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GaussianMixture_covariance_type_feature", "_UI_GaussianMixture_type"),
				 ThingMLPackage.eINSTANCE.getGaussianMixture_Covariance_type(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Init params feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInit_paramsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GaussianMixture_init_params_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GaussianMixture_init_params_feature", "_UI_GaussianMixture_type"),
				 ThingMLPackage.eINSTANCE.getGaussianMixture_Init_params(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Weights init feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWeights_initPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GaussianMixture_weights_init_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GaussianMixture_weights_init_feature", "_UI_GaussianMixture_type"),
				 ThingMLPackage.eINSTANCE.getGaussianMixture_Weights_init(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Means init feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeans_initPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GaussianMixture_means_init_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GaussianMixture_means_init_feature", "_UI_GaussianMixture_type"),
				 ThingMLPackage.eINSTANCE.getGaussianMixture_Means_init(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Precisions init feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrecisions_initPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GaussianMixture_precisions_init_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GaussianMixture_precisions_init_feature", "_UI_GaussianMixture_type"),
				 ThingMLPackage.eINSTANCE.getGaussianMixture_Precisions_init(),
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
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getGaussianMixture_N_components());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getGaussianMixture_Tol());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getGaussianMixture_Reg_covar());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getGaussianMixture_Max_iter());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getGaussianMixture_N_init());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getGaussianMixture_Random_state());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getGaussianMixture_Warm_start());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getGaussianMixture_Verbose());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getGaussianMixture_Verbose_interval());
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
	 * This returns GaussianMixture.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GaussianMixture"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GaussianMixture)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GaussianMixture_type") :
			getString("_UI_GaussianMixture_type") + " " + label;
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

		switch (notification.getFeatureID(GaussianMixture.class)) {
			case ThingMLPackage.GAUSSIAN_MIXTURE__COVARIANCE_TYPE:
			case ThingMLPackage.GAUSSIAN_MIXTURE__INIT_PARAMS:
			case ThingMLPackage.GAUSSIAN_MIXTURE__WEIGHTS_INIT:
			case ThingMLPackage.GAUSSIAN_MIXTURE__MEANS_INIT:
			case ThingMLPackage.GAUSSIAN_MIXTURE__PRECISIONS_INIT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ThingMLPackage.GAUSSIAN_MIXTURE__NCOMPONENTS:
			case ThingMLPackage.GAUSSIAN_MIXTURE__TOL:
			case ThingMLPackage.GAUSSIAN_MIXTURE__REG_COVAR:
			case ThingMLPackage.GAUSSIAN_MIXTURE__MAX_ITER:
			case ThingMLPackage.GAUSSIAN_MIXTURE__NINIT:
			case ThingMLPackage.GAUSSIAN_MIXTURE__RANDOM_STATE:
			case ThingMLPackage.GAUSSIAN_MIXTURE__WARM_START:
			case ThingMLPackage.GAUSSIAN_MIXTURE__VERBOSE:
			case ThingMLPackage.GAUSSIAN_MIXTURE__VERBOSE_INTERVAL:
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
				(ThingMLPackage.eINSTANCE.getGaussianMixture_N_components(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getGaussianMixture_Tol(),
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getGaussianMixture_Reg_covar(),
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getGaussianMixture_Max_iter(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getGaussianMixture_N_init(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getGaussianMixture_Random_state(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getGaussianMixture_Warm_start(),
				 ThingMLFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getGaussianMixture_Verbose(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getGaussianMixture_Verbose_interval(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));
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
			childFeature == ThingMLPackage.eINSTANCE.getGaussianMixture_N_components() ||
			childFeature == ThingMLPackage.eINSTANCE.getGaussianMixture_Max_iter() ||
			childFeature == ThingMLPackage.eINSTANCE.getGaussianMixture_N_init() ||
			childFeature == ThingMLPackage.eINSTANCE.getGaussianMixture_Random_state() ||
			childFeature == ThingMLPackage.eINSTANCE.getGaussianMixture_Verbose() ||
			childFeature == ThingMLPackage.eINSTANCE.getGaussianMixture_Verbose_interval() ||
			childFeature == ThingMLPackage.eINSTANCE.getGaussianMixture_Tol() ||
			childFeature == ThingMLPackage.eINSTANCE.getGaussianMixture_Reg_covar();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
