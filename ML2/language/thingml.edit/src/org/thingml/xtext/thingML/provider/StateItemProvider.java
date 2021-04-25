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

import org.thingml.xtext.thingML.State;
import org.thingml.xtext.thingML.ThingMLFactory;
import org.thingml.xtext.thingML.ThingMLPackage;

/**
 * This is the item provider adapter for a {@link org.thingml.xtext.thingML.State} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StateItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getAnnotatedElement_Annotations());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getState_Properties());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getState_Entry());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getState_Exit());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getState_Internal());
			childrenFeatures.add(ThingMLPackage.eINSTANCE.getState_Outgoing());
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
	 * This returns State.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/State"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((State)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_State_type") :
			getString("_UI_State_type") + " " + label;
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

		switch (notification.getFeatureID(State.class)) {
			case ThingMLPackage.STATE__ANNOTATIONS:
			case ThingMLPackage.STATE__PROPERTIES:
			case ThingMLPackage.STATE__ENTRY:
			case ThingMLPackage.STATE__EXIT:
			case ThingMLPackage.STATE__INTERNAL:
			case ThingMLPackage.STATE__OUTGOING:
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
				(ThingMLPackage.eINSTANCE.getState_Properties(),
				 ThingMLFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Entry(),
				 ThingMLFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Entry(),
				 ThingMLFactory.eINSTANCE.createActionBlock()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Entry(),
				 ThingMLFactory.eINSTANCE.createExternStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Entry(),
				 ThingMLFactory.eINSTANCE.createLocalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Entry(),
				 ThingMLFactory.eINSTANCE.createSendAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Entry(),
				 ThingMLFactory.eINSTANCE.createVariableAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Entry(),
				 ThingMLFactory.eINSTANCE.createIncrement()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Entry(),
				 ThingMLFactory.eINSTANCE.createDecrement()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Entry(),
				 ThingMLFactory.eINSTANCE.createForAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Entry(),
				 ThingMLFactory.eINSTANCE.createLoopAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Entry(),
				 ThingMLFactory.eINSTANCE.createConditionalAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Entry(),
				 ThingMLFactory.eINSTANCE.createReturnAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Entry(),
				 ThingMLFactory.eINSTANCE.createPrintAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Entry(),
				 ThingMLFactory.eINSTANCE.createErrorAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Entry(),
				 ThingMLFactory.eINSTANCE.createStartSession()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Entry(),
				 ThingMLFactory.eINSTANCE.createFunctionCallStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Entry(),
				 ThingMLFactory.eINSTANCE.createDASaveAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Entry(),
				 ThingMLFactory.eINSTANCE.createDAPreprocessAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Entry(),
				 ThingMLFactory.eINSTANCE.createDATrainAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Entry(),
				 ThingMLFactory.eINSTANCE.createDAPredictAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Entry(),
				 ThingMLFactory.eINSTANCE.createDAPreTrainedPredictAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Exit(),
				 ThingMLFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Exit(),
				 ThingMLFactory.eINSTANCE.createActionBlock()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Exit(),
				 ThingMLFactory.eINSTANCE.createExternStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Exit(),
				 ThingMLFactory.eINSTANCE.createLocalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Exit(),
				 ThingMLFactory.eINSTANCE.createSendAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Exit(),
				 ThingMLFactory.eINSTANCE.createVariableAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Exit(),
				 ThingMLFactory.eINSTANCE.createIncrement()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Exit(),
				 ThingMLFactory.eINSTANCE.createDecrement()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Exit(),
				 ThingMLFactory.eINSTANCE.createForAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Exit(),
				 ThingMLFactory.eINSTANCE.createLoopAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Exit(),
				 ThingMLFactory.eINSTANCE.createConditionalAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Exit(),
				 ThingMLFactory.eINSTANCE.createReturnAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Exit(),
				 ThingMLFactory.eINSTANCE.createPrintAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Exit(),
				 ThingMLFactory.eINSTANCE.createErrorAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Exit(),
				 ThingMLFactory.eINSTANCE.createStartSession()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Exit(),
				 ThingMLFactory.eINSTANCE.createFunctionCallStatement()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Exit(),
				 ThingMLFactory.eINSTANCE.createDASaveAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Exit(),
				 ThingMLFactory.eINSTANCE.createDAPreprocessAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Exit(),
				 ThingMLFactory.eINSTANCE.createDATrainAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Exit(),
				 ThingMLFactory.eINSTANCE.createDAPredictAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Exit(),
				 ThingMLFactory.eINSTANCE.createDAPreTrainedPredictAction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Internal(),
				 ThingMLFactory.eINSTANCE.createInternalTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.eINSTANCE.getState_Outgoing(),
				 ThingMLFactory.eINSTANCE.createTransition()));
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
			childFeature == ThingMLPackage.eINSTANCE.getState_Entry() ||
			childFeature == ThingMLPackage.eINSTANCE.getState_Exit();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
