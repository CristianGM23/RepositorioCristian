/**
 */
package bpmn.provider;

import bpmn.BPMNFactory;
import bpmn.BPMNPackage;
import bpmn.Lane;

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
 * This is the item provider adapter for a {@link bpmn.Lane} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LaneItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaneItemProvider(AdapterFactory adapterFactory) {
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

			addNameLanePropertyDescriptor(object);
			addPoolrelationlanePropertyDescriptor(object);
			addLaneincludefigurePropertyDescriptor(object);
			addLanerelationswimlinePropertyDescriptor(object);
			addCreationDatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name Lane feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNameLanePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Lane_nameLane_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Lane_nameLane_feature", "_UI_Lane_type"),
						BPMNPackage.Literals.LANE__NAME_LANE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Poolrelationlane feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPoolrelationlanePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Lane_poolrelationlane_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Lane_poolrelationlane_feature",
								"_UI_Lane_type"),
						BPMNPackage.Literals.LANE__POOLRELATIONLANE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Laneincludefigure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLaneincludefigurePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Lane_laneincludefigure_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Lane_laneincludefigure_feature",
								"_UI_Lane_type"),
						BPMNPackage.Literals.LANE__LANEINCLUDEFIGURE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Lanerelationswimline feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLanerelationswimlinePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Lane_lanerelationswimline_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Lane_lanerelationswimline_feature",
								"_UI_Lane_type"),
						BPMNPackage.Literals.LANE__LANERELATIONSWIMLINE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Creation Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreationDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Lane_creationDate_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Lane_creationDate_feature",
								"_UI_Lane_type"),
						BPMNPackage.Literals.LANE__CREATION_DATE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(BPMNPackage.Literals.LANE__FIGURE);
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
	 * This returns Lane.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Lane"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Lane) object).getNameLane();
		return label == null || label.length() == 0 ? getString("_UI_Lane_type")
				: getString("_UI_Lane_type") + " " + label;
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

		switch (notification.getFeatureID(Lane.class)) {
		case BPMNPackage.LANE__NAME_LANE:
		case BPMNPackage.LANE__CREATION_DATE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case BPMNPackage.LANE__FIGURE:
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

		newChildDescriptors
				.add(createChildParameter(BPMNPackage.Literals.LANE__FIGURE, BPMNFactory.eINSTANCE.createActivity()));

		newChildDescriptors
				.add(createChildParameter(BPMNPackage.Literals.LANE__FIGURE, BPMNFactory.eINSTANCE.createGateway()));

		newChildDescriptors
				.add(createChildParameter(BPMNPackage.Literals.LANE__FIGURE, BPMNFactory.eINSTANCE.createData()));

		newChildDescriptors
				.add(createChildParameter(BPMNPackage.Literals.LANE__FIGURE, BPMNFactory.eINSTANCE.createFinal()));

		newChildDescriptors
				.add(createChildParameter(BPMNPackage.Literals.LANE__FIGURE, BPMNFactory.eINSTANCE.createHighLevel()));

		newChildDescriptors
				.add(createChildParameter(BPMNPackage.Literals.LANE__FIGURE, BPMNFactory.eINSTANCE.createSubprocess()));

		newChildDescriptors.add(createChildParameter(BPMNPackage.Literals.LANE__FIGURE,
				BPMNFactory.eINSTANCE.createSubprocessNonInterrupt()));

		newChildDescriptors
				.add(createChildParameter(BPMNPackage.Literals.LANE__FIGURE, BPMNFactory.eINSTANCE.createCatch()));

		newChildDescriptors
				.add(createChildParameter(BPMNPackage.Literals.LANE__FIGURE, BPMNFactory.eINSTANCE.createBoundary()));

		newChildDescriptors.add(createChildParameter(BPMNPackage.Literals.LANE__FIGURE,
				BPMNFactory.eINSTANCE.createBoundaryNonInterrupt()));

		newChildDescriptors
				.add(createChildParameter(BPMNPackage.Literals.LANE__FIGURE, BPMNFactory.eINSTANCE.createThrow()));

		newChildDescriptors
				.add(createChildParameter(BPMNPackage.Literals.LANE__FIGURE, BPMNFactory.eINSTANCE.createGroup()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BPMNEditPlugin.INSTANCE;
	}

}
