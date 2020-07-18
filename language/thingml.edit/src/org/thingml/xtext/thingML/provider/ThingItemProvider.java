/**
 * *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *  *
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

import org.thingml.xtext.thingML.Thing;
import org.thingml.xtext.thingML.ThingMLFactory;
import org.thingml.xtext.thingML.ThingMLPackage;

/**
 * This is the item provider adapter for a {@link org.thingml.xtext.thingML.Thing} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ThingItemProvider extends TypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThingItemProvider(AdapterFactory adapterFactory) {
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

			addFragmentPropertyDescriptor(object);
			addIncludesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Fragment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFragmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Thing_fragment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Thing_fragment_feature", "_UI_Thing_type"),
				 ThingMLPackage.Literals.THING__FRAGMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Includes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncludesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Thing_includes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Thing_includes_feature", "_UI_Thing_type"),
				 ThingMLPackage.Literals.THING__INCLUDES,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(ThingMLPackage.Literals.THING__MESSAGES);
			childrenFeatures.add(ThingMLPackage.Literals.THING__PORTS);
			childrenFeatures.add(ThingMLPackage.Literals.THING__PROPERTIES);
			childrenFeatures.add(ThingMLPackage.Literals.THING__FUNCTIONS);
			childrenFeatures.add(ThingMLPackage.Literals.THING__ASSIGN);
			childrenFeatures.add(ThingMLPackage.Literals.THING__DATA_ANALYTICS);
			childrenFeatures.add(ThingMLPackage.Literals.THING__BEHAVIOUR);
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
	 * This returns Thing.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Thing"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Thing)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Thing_type") :
			getString("_UI_Thing_type") + " " + label;
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

		switch (notification.getFeatureID(Thing.class)) {
			case ThingMLPackage.THING__FRAGMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ThingMLPackage.THING__MESSAGES:
			case ThingMLPackage.THING__PORTS:
			case ThingMLPackage.THING__PROPERTIES:
			case ThingMLPackage.THING__FUNCTIONS:
			case ThingMLPackage.THING__ASSIGN:
			case ThingMLPackage.THING__DATA_ANALYTICS:
			case ThingMLPackage.THING__BEHAVIOUR:
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
				(ThingMLPackage.Literals.THING__MESSAGES,
				 ThingMLFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.THING__PORTS,
				 ThingMLFactory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.THING__PORTS,
				 ThingMLFactory.eINSTANCE.createRequiredPort()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.THING__PORTS,
				 ThingMLFactory.eINSTANCE.createProvidedPort()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.THING__PORTS,
				 ThingMLFactory.eINSTANCE.createInternalPort()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.THING__PROPERTIES,
				 ThingMLFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.THING__FUNCTIONS,
				 ThingMLFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.THING__ASSIGN,
				 ThingMLFactory.eINSTANCE.createPropertyAssign()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.THING__DATA_ANALYTICS,
				 ThingMLFactory.eINSTANCE.createDataAnalytics()));

		newChildDescriptors.add
			(createChildParameter
				(ThingMLPackage.Literals.THING__BEHAVIOUR,
				 ThingMLFactory.eINSTANCE.createCompositeState()));
	}

}
