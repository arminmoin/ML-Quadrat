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

import org.thingml.xtext.thingML.PrintAction;
import org.thingml.xtext.thingML.ThingMLFactory;
import org.thingml.xtext.thingML.ThingMLPackage;

/**
 * This is the item provider adapter for a {@link org.thingml.xtext.thingML.PrintAction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PrintActionItemProvider extends ActionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintActionItemProvider(AdapterFactory adapterFactory) {
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

			addLinePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Line feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PrintAction_line_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PrintAction_line_feature", "_UI_PrintAction_type"),
				 ThingMLPackage.Literals.PRINT_ACTION__LINE,
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
			childrenFeatures.add(ThingMLPackage.Literals.PRINT_ACTION__MSG);
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
	 * This returns PrintAction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PrintAction"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		PrintAction printAction = (PrintAction)object;
		return getString("_UI_PrintAction_type") + " " + printAction.isLine();
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

		switch (notification.getFeatureID(PrintAction.class)) {
			case ThingMLPackage.PRINT_ACTION__LINE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ThingMLPackage.PRINT_ACTION__MSG:
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
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createExternExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createArrayInit()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createEnumLiteralRef()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createByteLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createCharLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createPropertyReference()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createEventReference()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createFunctionCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createEqualsExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createNotEqualsExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createGreaterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createLowerExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createGreaterOrEqualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createLowerOrEqualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createPlusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createMinusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createTimesExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createDivExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createModExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createCastExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createExpressionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createNotExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createUnaryMinus()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.PRINT_ACTION__MSG,
				 ThingMLFactory.eINSTANCE.createArrayIndex()));
	}

}
