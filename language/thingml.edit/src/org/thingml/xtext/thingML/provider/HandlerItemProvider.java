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

import org.thingml.xtext.thingML.Handler;
import org.thingml.xtext.thingML.ThingMLFactory;
import org.thingml.xtext.thingML.ThingMLPackage;

/**
 * This is the item provider adapter for a {@link org.thingml.xtext.thingML.Handler} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HandlerItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandlerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ThingMLPackage.Literals.ANNOTATED_ELEMENT__ANNOTATIONS);
			childrenFeatures.add(ThingMLPackage.Literals.HANDLER__EVENT);
			childrenFeatures.add(ThingMLPackage.Literals.HANDLER__GUARD);
			childrenFeatures.add(ThingMLPackage.Literals.HANDLER__ACTION);
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
	 * This returns Handler.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Handler"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Handler)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Handler_type") :
			getString("_UI_Handler_type") + " " + label;
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

		switch (notification.getFeatureID(Handler.class)) {
			case ThingMLPackage.HANDLER__ANNOTATIONS:
			case ThingMLPackage.HANDLER__EVENT:
			case ThingMLPackage.HANDLER__GUARD:
			case ThingMLPackage.HANDLER__ACTION:
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
				(ThingMLPackage.Literals.ANNOTATED_ELEMENT__ANNOTATIONS,
				 ThingMLFactory.eINSTANCE.createPlatformAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__EVENT,
				 ThingMLFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__EVENT,
				 ThingMLFactory.eINSTANCE.createReceiveMessage()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createExternExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createArrayInit()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createEnumLiteralRef()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createByteLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createCharLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createPropertyReference()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createEventReference()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createFunctionCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createEqualsExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createNotEqualsExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createGreaterExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createLowerExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createGreaterOrEqualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createLowerOrEqualExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createPlusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createMinusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createTimesExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createDivExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createModExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createCastExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createExpressionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createNotExpression()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createUnaryMinus()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__GUARD,
				 ThingMLFactory.eINSTANCE.createArrayIndex()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__ACTION,
				 ThingMLFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__ACTION,
				 ThingMLFactory.eINSTANCE.createActionBlock()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__ACTION,
				 ThingMLFactory.eINSTANCE.createExternStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__ACTION,
				 ThingMLFactory.eINSTANCE.createLocalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__ACTION,
				 ThingMLFactory.eINSTANCE.createSendAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__ACTION,
				 ThingMLFactory.eINSTANCE.createVariableAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__ACTION,
				 ThingMLFactory.eINSTANCE.createIncrement()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__ACTION,
				 ThingMLFactory.eINSTANCE.createDecrement()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__ACTION,
				 ThingMLFactory.eINSTANCE.createForAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__ACTION,
				 ThingMLFactory.eINSTANCE.createLoopAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__ACTION,
				 ThingMLFactory.eINSTANCE.createConditionalAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__ACTION,
				 ThingMLFactory.eINSTANCE.createReturnAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__ACTION,
				 ThingMLFactory.eINSTANCE.createPrintAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__ACTION,
				 ThingMLFactory.eINSTANCE.createErrorAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__ACTION,
				 ThingMLFactory.eINSTANCE.createStartSession()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__ACTION,
				 ThingMLFactory.eINSTANCE.createFunctionCallStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__ACTION,
				 ThingMLFactory.eINSTANCE.createDASaveAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__ACTION,
				 ThingMLFactory.eINSTANCE.createDAPreprocessAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__ACTION,
				 ThingMLFactory.eINSTANCE.createDATrainAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.HANDLER__ACTION,
				 ThingMLFactory.eINSTANCE.createDAPredictAction()));
	}

}
