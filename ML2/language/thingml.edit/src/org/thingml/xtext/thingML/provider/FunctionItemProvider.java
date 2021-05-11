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

import org.thingml.xtext.thingML.Function;
import org.thingml.xtext.thingML.ThingMLFactory;
import org.thingml.xtext.thingML.ThingMLPackage;

/**
 * This is the item provider adapter for a {@link org.thingml.xtext.thingML.Function} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionItemProvider(AdapterFactory adapterFactory) {
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

			addAbstractPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Function_abstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Function_abstract_feature", "_UI_Function_type"),
				 ThingMLPackage.eINSTANCE.getFunction_Abstract(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getFunction_Parameters());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getFunction_TypeRef());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getFunction_Body());
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
	 * This returns Function.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Function"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Function)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Function_type") :
			getString("_UI_Function_type") + " " + label;
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

		switch (notification.getFeatureID(Function.class)) {
			case ThingMLPackage.FUNCTION__ABSTRACT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ThingMLPackage.FUNCTION__ANNOTATIONS:
			case ThingMLPackage.FUNCTION__PARAMETERS:
			case ThingMLPackage.FUNCTION__TYPE_REF:
			case ThingMLPackage.FUNCTION__BODY:
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
				(ThingMLPackage.eINSTANCE.getFunction_Parameters(),
				 ThingMLFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getFunction_TypeRef(),
				 ThingMLFactory.eINSTANCE.createTypeRef()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getFunction_Body(),
				 ThingMLFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getFunction_Body(),
				 ThingMLFactory.eINSTANCE.createActionBlock()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getFunction_Body(),
				 ThingMLFactory.eINSTANCE.createExternStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getFunction_Body(),
				 ThingMLFactory.eINSTANCE.createLocalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getFunction_Body(),
				 ThingMLFactory.eINSTANCE.createSendAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getFunction_Body(),
				 ThingMLFactory.eINSTANCE.createVariableAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getFunction_Body(),
				 ThingMLFactory.eINSTANCE.createIncrement()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getFunction_Body(),
				 ThingMLFactory.eINSTANCE.createDecrement()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getFunction_Body(),
				 ThingMLFactory.eINSTANCE.createForAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getFunction_Body(),
				 ThingMLFactory.eINSTANCE.createLoopAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getFunction_Body(),
				 ThingMLFactory.eINSTANCE.createConditionalAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getFunction_Body(),
				 ThingMLFactory.eINSTANCE.createReturnAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getFunction_Body(),
				 ThingMLFactory.eINSTANCE.createPrintAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getFunction_Body(),
				 ThingMLFactory.eINSTANCE.createErrorAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getFunction_Body(),
				 ThingMLFactory.eINSTANCE.createStartSession()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getFunction_Body(),
				 ThingMLFactory.eINSTANCE.createFunctionCallStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getFunction_Body(),
				 ThingMLFactory.eINSTANCE.createDASaveAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getFunction_Body(),
				 ThingMLFactory.eINSTANCE.createDAPreprocessAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getFunction_Body(),
				 ThingMLFactory.eINSTANCE.createDATrainAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getFunction_Body(),
				 ThingMLFactory.eINSTANCE.createDAPredictAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getFunction_Body(),
				 ThingMLFactory.eINSTANCE.createDAPreTrainedPredictAction()));
	}

}
