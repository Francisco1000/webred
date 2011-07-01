/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WebRequirementsMetamodel.impl;

import WebRequirementsMetamodel.Decomposition;
import WebRequirementsMetamodel.IntentionalElement;
import WebRequirementsMetamodel.WebRequirementsMetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decomposition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WebRequirementsMetamodel.impl.DecompositionImpl#getElement <em>Element</em>}</li>
 *   <li>{@link WebRequirementsMetamodel.impl.DecompositionImpl#getSubElement <em>Sub Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecompositionImpl extends RelationshipImpl implements Decomposition {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected IntentionalElement element;

	/**
	 * The cached value of the '{@link #getSubElement() <em>Sub Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubElement()
	 * @generated
	 * @ordered
	 */
	protected IntentionalElement subElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecompositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebRequirementsMetamodelPackage.Literals.DECOMPOSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentionalElement getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = (IntentionalElement)eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebRequirementsMetamodelPackage.DECOMPOSITION__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentionalElement basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(IntentionalElement newElement) {
		IntentionalElement oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebRequirementsMetamodelPackage.DECOMPOSITION__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentionalElement getSubElement() {
		if (subElement != null && subElement.eIsProxy()) {
			InternalEObject oldSubElement = (InternalEObject)subElement;
			subElement = (IntentionalElement)eResolveProxy(oldSubElement);
			if (subElement != oldSubElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebRequirementsMetamodelPackage.DECOMPOSITION__SUB_ELEMENT, oldSubElement, subElement));
			}
		}
		return subElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentionalElement basicGetSubElement() {
		return subElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubElement(IntentionalElement newSubElement) {
		IntentionalElement oldSubElement = subElement;
		subElement = newSubElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebRequirementsMetamodelPackage.DECOMPOSITION__SUB_ELEMENT, oldSubElement, subElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebRequirementsMetamodelPackage.DECOMPOSITION__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case WebRequirementsMetamodelPackage.DECOMPOSITION__SUB_ELEMENT:
				if (resolve) return getSubElement();
				return basicGetSubElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WebRequirementsMetamodelPackage.DECOMPOSITION__ELEMENT:
				setElement((IntentionalElement)newValue);
				return;
			case WebRequirementsMetamodelPackage.DECOMPOSITION__SUB_ELEMENT:
				setSubElement((IntentionalElement)newValue);
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
			case WebRequirementsMetamodelPackage.DECOMPOSITION__ELEMENT:
				setElement((IntentionalElement)null);
				return;
			case WebRequirementsMetamodelPackage.DECOMPOSITION__SUB_ELEMENT:
				setSubElement((IntentionalElement)null);
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
			case WebRequirementsMetamodelPackage.DECOMPOSITION__ELEMENT:
				return element != null;
			case WebRequirementsMetamodelPackage.DECOMPOSITION__SUB_ELEMENT:
				return subElement != null;
		}
		return super.eIsSet(featureID);
	}

} //DecompositionImpl
