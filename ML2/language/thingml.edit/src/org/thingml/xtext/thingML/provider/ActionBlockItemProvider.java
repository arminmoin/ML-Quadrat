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

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.thingml.xtext.thingML.ActionBlock;
import org.thingml.xtext.thingML.ThingMLFactory;
import org.thingml.xtext.thingML.ThingMLPackage;

/**
 * This is the item provider adapter for a {@link org.thingml.xtext.thingML.ActionBlock} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionBlockItemProvider extends ActionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionBlockItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getActionBlock_Actions());
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
	 * This returns ActionBlock.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ActionBlock"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ActionBlock_type");
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

		switch (notification.getFeatureID(ActionBlock.class)) {
			case ThingMLPackage.ACTION_BLOCK__ACTIONS:
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
				(ThingMLPackage.eINSTANCE.getActionBlock_Actions(),
				 ThingMLFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getActionBlock_Actions(),
				 ThingMLFactory.eINSTANCE.createActionBlock()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getActionBlock_Actions(),
				 ThingMLFactory.eINSTANCE.createExternStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getActionBlock_Actions(),
				 ThingMLFactory.eINSTANCE.createLocalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getActionBlock_Actions(),
				 ThingMLFactory.eINSTANCE.createSendAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getActionBlock_Actions(),
				 ThingMLFactory.eINSTANCE.createVariableAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getActionBlock_Actions(),
				 ThingMLFactory.eINSTANCE.createIncrement()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getActionBlock_Actions(),
				 ThingMLFactory.eINSTANCE.createDecrement()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getActionBlock_Actions(),
				 ThingMLFactory.eINSTANCE.createForAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getActionBlock_Actions(),
				 ThingMLFactory.eINSTANCE.createLoopAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getActionBlock_Actions(),
				 ThingMLFactory.eINSTANCE.createConditionalAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getActionBlock_Actions(),
				 ThingMLFactory.eINSTANCE.createReturnAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getActionBlock_Actions(),
				 ThingMLFactory.eINSTANCE.createPrintAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getActionBlock_Actions(),
				 ThingMLFactory.eINSTANCE.createErrorAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getActionBlock_Actions(),
				 ThingMLFactory.eINSTANCE.createStartSession()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getActionBlock_Actions(),
				 ThingMLFactory.eINSTANCE.createFunctionCallStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getActionBlock_Actions(),
				 ThingMLFactory.eINSTANCE.createDASaveAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getActionBlock_Actions(),
				 ThingMLFactory.eINSTANCE.createDAPreprocessAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getActionBlock_Actions(),
				 ThingMLFactory.eINSTANCE.createDATrainAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getActionBlock_Actions(),
				 ThingMLFactory.eINSTANCE.createDAPredictAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getActionBlock_Actions(),
				 ThingMLFactory.eINSTANCE.createDAPreTrainedPredictAction()));
	}

}
