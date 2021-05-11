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

import org.thingml.xtext.thingML.MiniBatchKMeans;
import org.thingml.xtext.thingML.ThingMLFactory;
import org.thingml.xtext.thingML.ThingMLPackage;

/**
 * This is the item provider adapter for a {@link org.thingml.xtext.thingML.MiniBatchKMeans} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MiniBatchKMeansItemProvider extends ML2_ModelAlgorithmItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiniBatchKMeansItemProvider(AdapterFactory adapterFactory) {
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

			addInit_enumPropertyDescriptor(object);
			addInit_strPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Init enum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInit_enumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MiniBatchKMeans_init_enum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MiniBatchKMeans_init_enum_feature", "_UI_MiniBatchKMeans_type"),
				 ThingMLPackage.eINSTANCE.getMiniBatchKMeans_Init_enum(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Init str feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInit_strPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MiniBatchKMeans_init_str_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MiniBatchKMeans_init_str_feature", "_UI_MiniBatchKMeans_type"),
				 ThingMLPackage.eINSTANCE.getMiniBatchKMeans_Init_str(),
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
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getMiniBatchKMeans_N_clusters());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getMiniBatchKMeans_Max_iter());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getMiniBatchKMeans_Batch_size());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getMiniBatchKMeans_Verbose());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getMiniBatchKMeans_Compute_labels());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getMiniBatchKMeans_Random_state());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getMiniBatchKMeans_Tol());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getMiniBatchKMeans_Max_no_improvement());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getMiniBatchKMeans_Init_size());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getMiniBatchKMeans_N_init());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getMiniBatchKMeans_Reassignment_ratio());
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
	 * This returns MiniBatchKMeans.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MiniBatchKMeans"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MiniBatchKMeans)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MiniBatchKMeans_type") :
			getString("_UI_MiniBatchKMeans_type") + " " + label;
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

		switch (notification.getFeatureID(MiniBatchKMeans.class)) {
			case ThingMLPackage.MINI_BATCH_KMEANS__INIT_ENUM:
			case ThingMLPackage.MINI_BATCH_KMEANS__INIT_STR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ThingMLPackage.MINI_BATCH_KMEANS__NCLUSTERS:
			case ThingMLPackage.MINI_BATCH_KMEANS__MAX_ITER:
			case ThingMLPackage.MINI_BATCH_KMEANS__BATCH_SIZE:
			case ThingMLPackage.MINI_BATCH_KMEANS__VERBOSE:
			case ThingMLPackage.MINI_BATCH_KMEANS__COMPUTE_LABELS:
			case ThingMLPackage.MINI_BATCH_KMEANS__RANDOM_STATE:
			case ThingMLPackage.MINI_BATCH_KMEANS__TOL:
			case ThingMLPackage.MINI_BATCH_KMEANS__MAX_NO_IMPROVEMENT:
			case ThingMLPackage.MINI_BATCH_KMEANS__INIT_SIZE:
			case ThingMLPackage.MINI_BATCH_KMEANS__NINIT:
			case ThingMLPackage.MINI_BATCH_KMEANS__REASSIGNMENT_RATIO:
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
				(ThingMLPackage.eINSTANCE.getMiniBatchKMeans_N_clusters(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getMiniBatchKMeans_Max_iter(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getMiniBatchKMeans_Batch_size(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getMiniBatchKMeans_Verbose(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getMiniBatchKMeans_Compute_labels(),
				 ThingMLFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getMiniBatchKMeans_Random_state(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getMiniBatchKMeans_Tol(),
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getMiniBatchKMeans_Max_no_improvement(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getMiniBatchKMeans_Init_size(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getMiniBatchKMeans_N_init(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getMiniBatchKMeans_Reassignment_ratio(),
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
			childFeature == ThingMLPackage.eINSTANCE.getMiniBatchKMeans_N_clusters() ||
			childFeature == ThingMLPackage.eINSTANCE.getMiniBatchKMeans_Max_iter() ||
			childFeature == ThingMLPackage.eINSTANCE.getMiniBatchKMeans_Batch_size() ||
			childFeature == ThingMLPackage.eINSTANCE.getMiniBatchKMeans_Verbose() ||
			childFeature == ThingMLPackage.eINSTANCE.getMiniBatchKMeans_Random_state() ||
			childFeature == ThingMLPackage.eINSTANCE.getMiniBatchKMeans_Max_no_improvement() ||
			childFeature == ThingMLPackage.eINSTANCE.getMiniBatchKMeans_Init_size() ||
			childFeature == ThingMLPackage.eINSTANCE.getMiniBatchKMeans_N_init() ||
			childFeature == ThingMLPackage.eINSTANCE.getMiniBatchKMeans_Tol() ||
			childFeature == ThingMLPackage.eINSTANCE.getMiniBatchKMeans_Reassignment_ratio();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
