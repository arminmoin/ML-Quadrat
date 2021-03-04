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

import org.thingml.xtext.thingML.NN_MultilayerPerceptron;
import org.thingml.xtext.thingML.ThingMLFactory;
import org.thingml.xtext.thingML.ThingMLPackage;

/**
 * This is the item provider adapter for a {@link org.thingml.xtext.thingML.NN_MultilayerPerceptron} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NN_MultilayerPerceptronItemProvider extends ML2_ModelAlgorithmItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NN_MultilayerPerceptronItemProvider(AdapterFactory adapterFactory) {
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

			addHidden_layer_sizesPropertyDescriptor(object);
			addActivationPropertyDescriptor(object);
			addOptimizerPropertyDescriptor(object);
			addLearning_rate_modePropertyDescriptor(object);
			addLearning_rate_initPropertyDescriptor(object);
			addLossPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Hidden layer sizes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHidden_layer_sizesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NN_MultilayerPerceptron_hidden_layer_sizes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NN_MultilayerPerceptron_hidden_layer_sizes_feature", "_UI_NN_MultilayerPerceptron_type"),
				 ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Hidden_layer_sizes(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Activation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NN_MultilayerPerceptron_activation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NN_MultilayerPerceptron_activation_feature", "_UI_NN_MultilayerPerceptron_type"),
				 ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Activation(),
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
				 getString("_UI_NN_MultilayerPerceptron_optimizer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NN_MultilayerPerceptron_optimizer_feature", "_UI_NN_MultilayerPerceptron_type"),
				 ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Optimizer(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Learning rate mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLearning_rate_modePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NN_MultilayerPerceptron_learning_rate_mode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NN_MultilayerPerceptron_learning_rate_mode_feature", "_UI_NN_MultilayerPerceptron_type"),
				 ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Learning_rate_mode(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Learning rate init feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLearning_rate_initPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NN_MultilayerPerceptron_learning_rate_init_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NN_MultilayerPerceptron_learning_rate_init_feature", "_UI_NN_MultilayerPerceptron_type"),
				 ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Learning_rate_init(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Loss feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLossPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NN_MultilayerPerceptron_loss_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NN_MultilayerPerceptron_loss_feature", "_UI_NN_MultilayerPerceptron_type"),
				 ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Loss(),
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
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Hidden_layers());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Alpha());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Batch_size());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Power_t());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Max_iter());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Shuffle());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Random_state());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Tol());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Verbose());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Warm_start());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Momentum());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Nesterovs_momentum());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Early_stopping());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Validation_fraction());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Beta_1());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Beta_2());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Epsilon());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_N_iter_no_change());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Max_fun());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Epochs());
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
	 * This returns NN_MultilayerPerceptron.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NN_MultilayerPerceptron"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NN_MultilayerPerceptron)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_NN_MultilayerPerceptron_type") :
			getString("_UI_NN_MultilayerPerceptron_type") + " " + label;
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

		switch (notification.getFeatureID(NN_MultilayerPerceptron.class)) {
			case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__HIDDEN_LAYER_SIZES:
			case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__ACTIVATION:
			case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__OPTIMIZER:
			case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__LEARNING_RATE_MODE:
			case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__LEARNING_RATE_INIT:
			case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__LOSS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__HIDDEN_LAYERS:
			case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__ALPHA:
			case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BATCH_SIZE:
			case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__POWER_T:
			case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MAX_ITER:
			case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__SHUFFLE:
			case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__RANDOM_STATE:
			case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__TOL:
			case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__VERBOSE:
			case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__WARM_START:
			case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MOMENTUM:
			case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__NESTEROVS_MOMENTUM:
			case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EARLY_STOPPING:
			case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__VALIDATION_FRACTION:
			case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BETA_1:
			case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__BETA_2:
			case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EPSILON:
			case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__NITER_NO_CHANGE:
			case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__MAX_FUN:
			case ThingMLPackage.NN_MULTILAYER_PERCEPTRON__EPOCHS:
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
				(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Hidden_layers(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Alpha(),
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Batch_size(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Power_t(),
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Max_iter(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Shuffle(),
				 ThingMLFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Random_state(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Tol(),
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Verbose(),
				 ThingMLFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Warm_start(),
				 ThingMLFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Momentum(),
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Nesterovs_momentum(),
				 ThingMLFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Early_stopping(),
				 ThingMLFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Validation_fraction(),
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Beta_1(),
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Beta_2(),
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Epsilon(),
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_N_iter_no_change(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Max_fun(),
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Epochs(),
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
			childFeature == ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Hidden_layers() ||
			childFeature == ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Batch_size() ||
			childFeature == ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Max_iter() ||
			childFeature == ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Random_state() ||
			childFeature == ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_N_iter_no_change() ||
			childFeature == ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Max_fun() ||
			childFeature == ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Epochs() ||
			childFeature == ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Alpha() ||
			childFeature == ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Power_t() ||
			childFeature == ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Tol() ||
			childFeature == ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Momentum() ||
			childFeature == ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Validation_fraction() ||
			childFeature == ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Beta_1() ||
			childFeature == ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Beta_2() ||
			childFeature == ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Epsilon() ||
			childFeature == ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Shuffle() ||
			childFeature == ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Verbose() ||
			childFeature == ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Warm_start() ||
			childFeature == ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Nesterovs_momentum() ||
			childFeature == ThingMLPackage.eINSTANCE.getNN_MultilayerPerceptron_Early_stopping();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
