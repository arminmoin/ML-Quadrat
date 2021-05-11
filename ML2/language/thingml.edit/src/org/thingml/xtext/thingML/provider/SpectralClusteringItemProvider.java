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

import org.thingml.xtext.thingML.SpectralClustering;
import org.thingml.xtext.thingML.ThingMLFactory;
import org.thingml.xtext.thingML.ThingMLPackage;

/**
 * This is the item provider adapter for a {@link org.thingml.xtext.thingML.SpectralClustering} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SpectralClusteringItemProvider extends ML2_ModelAlgorithmItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpectralClusteringItemProvider(AdapterFactory adapterFactory) {
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

			addEigen_solverPropertyDescriptor(object);
			addAffinityPropertyDescriptor(object);
			addAssign_labelsPropertyDescriptor(object);
			addKernel_paramsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Eigen solver feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEigen_solverPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpectralClustering_eigen_solver_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpectralClustering_eigen_solver_feature", "_UI_SpectralClustering_type"),
				 ThingMLPackage.eINSTANCE.getSpectralClustering_Eigen_solver(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Affinity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAffinityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpectralClustering_affinity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpectralClustering_affinity_feature", "_UI_SpectralClustering_type"),
				 ThingMLPackage.eINSTANCE.getSpectralClustering_Affinity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Assign labels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssign_labelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpectralClustering_assign_labels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpectralClustering_assign_labels_feature", "_UI_SpectralClustering_type"),
				 ThingMLPackage.eINSTANCE.getSpectralClustering_Assign_labels(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Kernel params feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKernel_paramsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpectralClustering_kernel_params_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpectralClustering_kernel_params_feature", "_UI_SpectralClustering_type"),
				 ThingMLPackage.eINSTANCE.getSpectralClustering_Kernel_params(),
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
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getSpectralClustering_N_clusters());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getSpectralClustering_N_components());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getSpectralClustering_Random_state());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getSpectralClustering_N_init());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getSpectralClustering_Gamma());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getSpectralClustering_N_neighbors());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getSpectralClustering_Eigen_tol());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getSpectralClustering_Degree());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getSpectralClustering_Coef0());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getSpectralClustering_N_jobs());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getSpectralClustering_Verbose());
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
	 * This returns SpectralClustering.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SpectralClustering"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SpectralClustering)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SpectralClustering_type") :
			getString("_UI_SpectralClustering_type") + " " + label;
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

		switch (notification.getFeatureID(SpectralClustering.class)) {
			case ThingMLPackage.SPECTRAL_CLUSTERING__EIGEN_SOLVER:
			case ThingMLPackage.SPECTRAL_CLUSTERING__AFFINITY:
			case ThingMLPackage.SPECTRAL_CLUSTERING__ASSIGN_LABELS:
			case ThingMLPackage.SPECTRAL_CLUSTERING__KERNEL_PARAMS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ThingMLPackage.SPECTRAL_CLUSTERING__NCLUSTERS:
			case ThingMLPackage.SPECTRAL_CLUSTERING__NCOMPONENTS:
			case ThingMLPackage.SPECTRAL_CLUSTERING__RANDOM_STATE:
			case ThingMLPackage.SPECTRAL_CLUSTERING__NINIT:
			case ThingMLPackage.SPECTRAL_CLUSTERING__GAMMA:
			case ThingMLPackage.SPECTRAL_CLUSTERING__NNEIGHBORS:
			case ThingMLPackage.SPECTRAL_CLUSTERING__EIGEN_TOL:
			case ThingMLPackage.SPECTRAL_CLUSTERING__DEGREE:
			case ThingMLPackage.SPECTRAL_CLUSTERING__COEF0:
			case ThingMLPackage.SPECTRAL_CLUSTERING__NJOBS:
			case ThingMLPackage.SPECTRAL_CLUSTERING__VERBOSE:
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
				(ThingMLPackage.eINSTANCE.getSpectralClustering_N_clusters(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getSpectralClustering_N_components(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getSpectralClustering_Random_state(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getSpectralClustering_N_init(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getSpectralClustering_Gamma(),
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getSpectralClustering_N_neighbors(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getSpectralClustering_Eigen_tol(),
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getSpectralClustering_Degree(),
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getSpectralClustering_Coef0(),
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getSpectralClustering_N_jobs(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getSpectralClustering_Verbose(),
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
			childFeature == ThingMLPackage.eINSTANCE.getSpectralClustering_N_clusters() ||
			childFeature == ThingMLPackage.eINSTANCE.getSpectralClustering_N_components() ||
			childFeature == ThingMLPackage.eINSTANCE.getSpectralClustering_Random_state() ||
			childFeature == ThingMLPackage.eINSTANCE.getSpectralClustering_N_init() ||
			childFeature == ThingMLPackage.eINSTANCE.getSpectralClustering_N_neighbors() ||
			childFeature == ThingMLPackage.eINSTANCE.getSpectralClustering_N_jobs() ||
			childFeature == ThingMLPackage.eINSTANCE.getSpectralClustering_Gamma() ||
			childFeature == ThingMLPackage.eINSTANCE.getSpectralClustering_Eigen_tol() ||
			childFeature == ThingMLPackage.eINSTANCE.getSpectralClustering_Degree() ||
			childFeature == ThingMLPackage.eINSTANCE.getSpectralClustering_Coef0();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
