/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mzt.impl;

import java.util.Collection;

import mzt.IntentionalElement;
import mzt.Relationship;
import mzt.SR;
import mzt.WebRequirementsMetamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mzt.impl.SRImpl#getIRelationships <em>IRelationships</em>}</li>
 *   <li>{@link mzt.impl.SRImpl#getIElement <em>IElement</em>}</li>
 *   <li>{@link mzt.impl.SRImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SRImpl extends EObjectImpl implements SR {
	/**
	 * The cached value of the '{@link #getIRelationships() <em>IRelationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> iRelationships;

	/**
	 * The cached value of the '{@link #getIElement() <em>IElement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIElement()
	 * @generated
	 * @ordered
	 */
	protected EList<IntentionalElement> iElement;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebRequirementsMetamodelPackage.Literals.SR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getIRelationships() {
		if (iRelationships == null) {
			iRelationships = new EObjectContainmentEList<Relationship>(Relationship.class, this, WebRequirementsMetamodelPackage.SR__IRELATIONSHIPS);
		}
		return iRelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntentionalElement> getIElement() {
		if (iElement == null) {
			iElement = new EObjectContainmentEList<IntentionalElement>(IntentionalElement.class, this, WebRequirementsMetamodelPackage.SR__IELEMENT);
		}
		return iElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebRequirementsMetamodelPackage.SR__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebRequirementsMetamodelPackage.SR__IRELATIONSHIPS:
				return ((InternalEList<?>)getIRelationships()).basicRemove(otherEnd, msgs);
			case WebRequirementsMetamodelPackage.SR__IELEMENT:
				return ((InternalEList<?>)getIElement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebRequirementsMetamodelPackage.SR__IRELATIONSHIPS:
				return getIRelationships();
			case WebRequirementsMetamodelPackage.SR__IELEMENT:
				return getIElement();
			case WebRequirementsMetamodelPackage.SR__DESCRIPTION:
				return getDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebRequirementsMetamodelPackage.SR__IRELATIONSHIPS:
				getIRelationships().clear();
				getIRelationships().addAll((Collection<? extends Relationship>)newValue);
				return;
			case WebRequirementsMetamodelPackage.SR__IELEMENT:
				getIElement().clear();
				getIElement().addAll((Collection<? extends IntentionalElement>)newValue);
				return;
			case WebRequirementsMetamodelPackage.SR__DESCRIPTION:
				setDescription((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WebRequirementsMetamodelPackage.SR__IRELATIONSHIPS:
				getIRelationships().clear();
				return;
			case WebRequirementsMetamodelPackage.SR__IELEMENT:
				getIElement().clear();
				return;
			case WebRequirementsMetamodelPackage.SR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WebRequirementsMetamodelPackage.SR__IRELATIONSHIPS:
				return iRelationships != null && !iRelationships.isEmpty();
			case WebRequirementsMetamodelPackage.SR__IELEMENT:
				return iElement != null && !iElement.isEmpty();
			case WebRequirementsMetamodelPackage.SR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //SRImpl
