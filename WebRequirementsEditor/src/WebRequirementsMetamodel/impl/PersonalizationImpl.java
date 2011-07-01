/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WebRequirementsMetamodel.impl;

import WebRequirementsMetamodel.InitialStatus;
import WebRequirementsMetamodel.Personalization;
import WebRequirementsMetamodel.RichInternetApplication;
import WebRequirementsMetamodel.WebRequirements;
import WebRequirementsMetamodel.WebRequirementsMetamodelPackage;
import WebRequirementsMetamodel.stakeholders;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Personalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WebRequirementsMetamodel.impl.PersonalizationImpl#getInitialStatus <em>Initial Status</em>}</li>
 *   <li>{@link WebRequirementsMetamodel.impl.PersonalizationImpl#getSolicitedBy <em>Solicited By</em>}</li>
 *   <li>{@link WebRequirementsMetamodel.impl.PersonalizationImpl#getImplementedIn <em>Implemented In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonalizationImpl extends TaskImpl implements Personalization {
	/**
	 * The default value of the '{@link #getInitialStatus() <em>Initial Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialStatus()
	 * @generated
	 * @ordered
	 */
	protected static final InitialStatus INITIAL_STATUS_EDEFAULT = InitialStatus.IMPLEMENTED;

	/**
	 * The cached value of the '{@link #getInitialStatus() <em>Initial Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialStatus()
	 * @generated
	 * @ordered
	 */
	protected InitialStatus initialStatus = INITIAL_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolicitedBy() <em>Solicited By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolicitedBy()
	 * @generated
	 * @ordered
	 */
	protected static final stakeholders SOLICITED_BY_EDEFAULT = stakeholders.CLIENT;

	/**
	 * The cached value of the '{@link #getSolicitedBy() <em>Solicited By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolicitedBy()
	 * @generated
	 * @ordered
	 */
	protected stakeholders solicitedBy = SOLICITED_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplementedIn() <em>Implemented In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedIn()
	 * @generated
	 * @ordered
	 */
	protected static final RichInternetApplication IMPLEMENTED_IN_EDEFAULT = RichInternetApplication.SERVER_SIDE;

	/**
	 * The cached value of the '{@link #getImplementedIn() <em>Implemented In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedIn()
	 * @generated
	 * @ordered
	 */
	protected RichInternetApplication implementedIn = IMPLEMENTED_IN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonalizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebRequirementsMetamodelPackage.Literals.PERSONALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialStatus getInitialStatus() {
		return initialStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialStatus(InitialStatus newInitialStatus) {
		InitialStatus oldInitialStatus = initialStatus;
		initialStatus = newInitialStatus == null ? INITIAL_STATUS_EDEFAULT : newInitialStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebRequirementsMetamodelPackage.PERSONALIZATION__INITIAL_STATUS, oldInitialStatus, initialStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public stakeholders getSolicitedBy() {
		return solicitedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolicitedBy(stakeholders newSolicitedBy) {
		stakeholders oldSolicitedBy = solicitedBy;
		solicitedBy = newSolicitedBy == null ? SOLICITED_BY_EDEFAULT : newSolicitedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebRequirementsMetamodelPackage.PERSONALIZATION__SOLICITED_BY, oldSolicitedBy, solicitedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichInternetApplication getImplementedIn() {
		return implementedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementedIn(RichInternetApplication newImplementedIn) {
		RichInternetApplication oldImplementedIn = implementedIn;
		implementedIn = newImplementedIn == null ? IMPLEMENTED_IN_EDEFAULT : newImplementedIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebRequirementsMetamodelPackage.PERSONALIZATION__IMPLEMENTED_IN, oldImplementedIn, implementedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebRequirementsMetamodelPackage.PERSONALIZATION__INITIAL_STATUS:
				return getInitialStatus();
			case WebRequirementsMetamodelPackage.PERSONALIZATION__SOLICITED_BY:
				return getSolicitedBy();
			case WebRequirementsMetamodelPackage.PERSONALIZATION__IMPLEMENTED_IN:
				return getImplementedIn();
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
			case WebRequirementsMetamodelPackage.PERSONALIZATION__INITIAL_STATUS:
				setInitialStatus((InitialStatus)newValue);
				return;
			case WebRequirementsMetamodelPackage.PERSONALIZATION__SOLICITED_BY:
				setSolicitedBy((stakeholders)newValue);
				return;
			case WebRequirementsMetamodelPackage.PERSONALIZATION__IMPLEMENTED_IN:
				setImplementedIn((RichInternetApplication)newValue);
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
			case WebRequirementsMetamodelPackage.PERSONALIZATION__INITIAL_STATUS:
				setInitialStatus(INITIAL_STATUS_EDEFAULT);
				return;
			case WebRequirementsMetamodelPackage.PERSONALIZATION__SOLICITED_BY:
				setSolicitedBy(SOLICITED_BY_EDEFAULT);
				return;
			case WebRequirementsMetamodelPackage.PERSONALIZATION__IMPLEMENTED_IN:
				setImplementedIn(IMPLEMENTED_IN_EDEFAULT);
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
			case WebRequirementsMetamodelPackage.PERSONALIZATION__INITIAL_STATUS:
				return initialStatus != INITIAL_STATUS_EDEFAULT;
			case WebRequirementsMetamodelPackage.PERSONALIZATION__SOLICITED_BY:
				return solicitedBy != SOLICITED_BY_EDEFAULT;
			case WebRequirementsMetamodelPackage.PERSONALIZATION__IMPLEMENTED_IN:
				return implementedIn != IMPLEMENTED_IN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == WebRequirements.class) {
			switch (derivedFeatureID) {
				case WebRequirementsMetamodelPackage.PERSONALIZATION__INITIAL_STATUS: return WebRequirementsMetamodelPackage.WEB_REQUIREMENTS__INITIAL_STATUS;
				case WebRequirementsMetamodelPackage.PERSONALIZATION__SOLICITED_BY: return WebRequirementsMetamodelPackage.WEB_REQUIREMENTS__SOLICITED_BY;
				case WebRequirementsMetamodelPackage.PERSONALIZATION__IMPLEMENTED_IN: return WebRequirementsMetamodelPackage.WEB_REQUIREMENTS__IMPLEMENTED_IN;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == WebRequirements.class) {
			switch (baseFeatureID) {
				case WebRequirementsMetamodelPackage.WEB_REQUIREMENTS__INITIAL_STATUS: return WebRequirementsMetamodelPackage.PERSONALIZATION__INITIAL_STATUS;
				case WebRequirementsMetamodelPackage.WEB_REQUIREMENTS__SOLICITED_BY: return WebRequirementsMetamodelPackage.PERSONALIZATION__SOLICITED_BY;
				case WebRequirementsMetamodelPackage.WEB_REQUIREMENTS__IMPLEMENTED_IN: return WebRequirementsMetamodelPackage.PERSONALIZATION__IMPLEMENTED_IN;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (InitialStatus: ");
		result.append(initialStatus);
		result.append(", SolicitedBy: ");
		result.append(solicitedBy);
		result.append(", ImplementedIn: ");
		result.append(implementedIn);
		result.append(')');
		return result.toString();
	}

} //PersonalizationImpl
