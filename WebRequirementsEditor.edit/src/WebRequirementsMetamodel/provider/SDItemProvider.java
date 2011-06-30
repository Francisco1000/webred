/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WebRequirementsMetamodel.provider;


import WebRequirementsMetamodel.SD;
import WebRequirementsMetamodel.WebRequirementsMetamodelFactory;
import WebRequirementsMetamodel.WebRequirementsMetamodelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link WebRequirementsMetamodel.SD} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SDItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addCreationDatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SD_Name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SD_Name_feature", "_UI_SD_type"),
				 WebRequirementsMetamodelPackage.Literals.SD__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SD_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SD_Description_feature", "_UI_SD_type"),
				 WebRequirementsMetamodelPackage.Literals.SD__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Creation Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreationDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SD_creationDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SD_creationDate_feature", "_UI_SD_type"),
				 WebRequirementsMetamodelPackage.Literals.SD__CREATION_DATE,
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
			childrenFeatures.add(WebRequirementsMetamodelPackage.Literals.SD__DEPENDENCIES);
			childrenFeatures.add(WebRequirementsMetamodelPackage.Literals.SD__ACTORS);
			childrenFeatures.add(WebRequirementsMetamodelPackage.Literals.SD__STRATEGIC_DEPENDENCIES);
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
	 * This returns SD.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SD"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SD)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SD_type") :
			getString("_UI_SD_type") + " " + label;
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

		switch (notification.getFeatureID(SD.class)) {
			case WebRequirementsMetamodelPackage.SD__NAME:
			case WebRequirementsMetamodelPackage.SD__DESCRIPTION:
			case WebRequirementsMetamodelPackage.SD__CREATION_DATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case WebRequirementsMetamodelPackage.SD__DEPENDENCIES:
			case WebRequirementsMetamodelPackage.SD__ACTORS:
			case WebRequirementsMetamodelPackage.SD__STRATEGIC_DEPENDENCIES:
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
				(WebRequirementsMetamodelPackage.Literals.SD__DEPENDENCIES,
				 WebRequirementsMetamodelFactory.eINSTANCE.createIDependency()));

		newChildDescriptors.add
			(createChildParameter
				(WebRequirementsMetamodelPackage.Literals.SD__ACTORS,
				 WebRequirementsMetamodelFactory.eINSTANCE.createActor()));

		newChildDescriptors.add
			(createChildParameter
				(WebRequirementsMetamodelPackage.Literals.SD__STRATEGIC_DEPENDENCIES,
				 WebRequirementsMetamodelFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(WebRequirementsMetamodelPackage.Literals.SD__STRATEGIC_DEPENDENCIES,
				 WebRequirementsMetamodelFactory.eINSTANCE.createSoftgoal()));

		newChildDescriptors.add
			(createChildParameter
				(WebRequirementsMetamodelPackage.Literals.SD__STRATEGIC_DEPENDENCIES,
				 WebRequirementsMetamodelFactory.eINSTANCE.createContent()));

		newChildDescriptors.add
			(createChildParameter
				(WebRequirementsMetamodelPackage.Literals.SD__STRATEGIC_DEPENDENCIES,
				 WebRequirementsMetamodelFactory.eINSTANCE.createNavigational()));

		newChildDescriptors.add
			(createChildParameter
				(WebRequirementsMetamodelPackage.Literals.SD__STRATEGIC_DEPENDENCIES,
				 WebRequirementsMetamodelFactory.eINSTANCE.createService()));

		newChildDescriptors.add
			(createChildParameter
				(WebRequirementsMetamodelPackage.Literals.SD__STRATEGIC_DEPENDENCIES,
				 WebRequirementsMetamodelFactory.eINSTANCE.createPersonalization()));

		newChildDescriptors.add
			(createChildParameter
				(WebRequirementsMetamodelPackage.Literals.SD__STRATEGIC_DEPENDENCIES,
				 WebRequirementsMetamodelFactory.eINSTANCE.createLayout()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return WebRequirementsMetamodelEditPlugin.INSTANCE;
	}

}
