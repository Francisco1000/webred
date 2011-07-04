/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mzt.impl;

import mzt.Contribution;
import mzt.ContributionType;
import mzt.IntentionalElement;
import mzt.WebRequirementsMetamodelPackage;
import mzt.WeightValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mzt.impl.ContributionImpl#getContributor <em>Contributor</em>}</li>
 *   <li>{@link mzt.impl.ContributionImpl#getContributed <em>Contributed</em>}</li>
 *   <li>{@link mzt.impl.ContributionImpl#getType <em>Type</em>}</li>
 *   <li>{@link mzt.impl.ContributionImpl#getWeightOnClient <em>Weight On Client</em>}</li>
 *   <li>{@link mzt.impl.ContributionImpl#getWeightOnServer <em>Weight On Server</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContributionImpl extends RelationshipImpl implements Contribution {
	/**
	 * The cached value of the '{@link #getContributor() <em>Contributor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributor()
	 * @generated
	 * @ordered
	 */
	protected IntentionalElement contributor;

	/**
	 * The cached value of the '{@link #getContributed() <em>Contributed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributed()
	 * @generated
	 * @ordered
	 */
	protected IntentionalElement contributed;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ContributionType TYPE_EDEFAULT = ContributionType.AND;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ContributionType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeightOnClient() <em>Weight On Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightOnClient()
	 * @generated
	 * @ordered
	 */
	protected static final WeightValue WEIGHT_ON_CLIENT_EDEFAULT = WeightValue.NO;

	/**
	 * The cached value of the '{@link #getWeightOnClient() <em>Weight On Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightOnClient()
	 * @generated
	 * @ordered
	 */
	protected WeightValue weightOnClient = WEIGHT_ON_CLIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeightOnServer() <em>Weight On Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightOnServer()
	 * @generated
	 * @ordered
	 */
	protected static final WeightValue WEIGHT_ON_SERVER_EDEFAULT = WeightValue.NO;

	/**
	 * The cached value of the '{@link #getWeightOnServer() <em>Weight On Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightOnServer()
	 * @generated
	 * @ordered
	 */
	protected WeightValue weightOnServer = WEIGHT_ON_SERVER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebRequirementsMetamodelPackage.Literals.CONTRIBUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentionalElement getContributor() {
		if (contributor != null && contributor.eIsProxy()) {
			InternalEObject oldContributor = (InternalEObject)contributor;
			contributor = (IntentionalElement)eResolveProxy(oldContributor);
			if (contributor != oldContributor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebRequirementsMetamodelPackage.CONTRIBUTION__CONTRIBUTOR, oldContributor, contributor));
			}
		}
		return contributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentionalElement basicGetContributor() {
		return contributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContributor(IntentionalElement newContributor) {
		IntentionalElement oldContributor = contributor;
		contributor = newContributor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebRequirementsMetamodelPackage.CONTRIBUTION__CONTRIBUTOR, oldContributor, contributor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentionalElement getContributed() {
		if (contributed != null && contributed.eIsProxy()) {
			InternalEObject oldContributed = (InternalEObject)contributed;
			contributed = (IntentionalElement)eResolveProxy(oldContributed);
			if (contributed != oldContributed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebRequirementsMetamodelPackage.CONTRIBUTION__CONTRIBUTED, oldContributed, contributed));
			}
		}
		return contributed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentionalElement basicGetContributed() {
		return contributed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContributed(IntentionalElement newContributed) {
		IntentionalElement oldContributed = contributed;
		contributed = newContributed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebRequirementsMetamodelPackage.CONTRIBUTION__CONTRIBUTED, oldContributed, contributed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ContributionType newType) {
		ContributionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebRequirementsMetamodelPackage.CONTRIBUTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeightValue getWeightOnClient() {
		return weightOnClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeightOnClient(WeightValue newWeightOnClient) {
		WeightValue oldWeightOnClient = weightOnClient;
		weightOnClient = newWeightOnClient == null ? WEIGHT_ON_CLIENT_EDEFAULT : newWeightOnClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebRequirementsMetamodelPackage.CONTRIBUTION__WEIGHT_ON_CLIENT, oldWeightOnClient, weightOnClient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeightValue getWeightOnServer() {
		return weightOnServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeightOnServer(WeightValue newWeightOnServer) {
		WeightValue oldWeightOnServer = weightOnServer;
		weightOnServer = newWeightOnServer == null ? WEIGHT_ON_SERVER_EDEFAULT : newWeightOnServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebRequirementsMetamodelPackage.CONTRIBUTION__WEIGHT_ON_SERVER, oldWeightOnServer, weightOnServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebRequirementsMetamodelPackage.CONTRIBUTION__CONTRIBUTOR:
				if (resolve) return getContributor();
				return basicGetContributor();
			case WebRequirementsMetamodelPackage.CONTRIBUTION__CONTRIBUTED:
				if (resolve) return getContributed();
				return basicGetContributed();
			case WebRequirementsMetamodelPackage.CONTRIBUTION__TYPE:
				return getType();
			case WebRequirementsMetamodelPackage.CONTRIBUTION__WEIGHT_ON_CLIENT:
				return getWeightOnClient();
			case WebRequirementsMetamodelPackage.CONTRIBUTION__WEIGHT_ON_SERVER:
				return getWeightOnServer();
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
			case WebRequirementsMetamodelPackage.CONTRIBUTION__CONTRIBUTOR:
				setContributor((IntentionalElement)newValue);
				return;
			case WebRequirementsMetamodelPackage.CONTRIBUTION__CONTRIBUTED:
				setContributed((IntentionalElement)newValue);
				return;
			case WebRequirementsMetamodelPackage.CONTRIBUTION__TYPE:
				setType((ContributionType)newValue);
				return;
			case WebRequirementsMetamodelPackage.CONTRIBUTION__WEIGHT_ON_CLIENT:
				setWeightOnClient((WeightValue)newValue);
				return;
			case WebRequirementsMetamodelPackage.CONTRIBUTION__WEIGHT_ON_SERVER:
				setWeightOnServer((WeightValue)newValue);
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
			case WebRequirementsMetamodelPackage.CONTRIBUTION__CONTRIBUTOR:
				setContributor((IntentionalElement)null);
				return;
			case WebRequirementsMetamodelPackage.CONTRIBUTION__CONTRIBUTED:
				setContributed((IntentionalElement)null);
				return;
			case WebRequirementsMetamodelPackage.CONTRIBUTION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case WebRequirementsMetamodelPackage.CONTRIBUTION__WEIGHT_ON_CLIENT:
				setWeightOnClient(WEIGHT_ON_CLIENT_EDEFAULT);
				return;
			case WebRequirementsMetamodelPackage.CONTRIBUTION__WEIGHT_ON_SERVER:
				setWeightOnServer(WEIGHT_ON_SERVER_EDEFAULT);
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
			case WebRequirementsMetamodelPackage.CONTRIBUTION__CONTRIBUTOR:
				return contributor != null;
			case WebRequirementsMetamodelPackage.CONTRIBUTION__CONTRIBUTED:
				return contributed != null;
			case WebRequirementsMetamodelPackage.CONTRIBUTION__TYPE:
				return type != TYPE_EDEFAULT;
			case WebRequirementsMetamodelPackage.CONTRIBUTION__WEIGHT_ON_CLIENT:
				return weightOnClient != WEIGHT_ON_CLIENT_EDEFAULT;
			case WebRequirementsMetamodelPackage.CONTRIBUTION__WEIGHT_ON_SERVER:
				return weightOnServer != WEIGHT_ON_SERVER_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", WeightOnClient: ");
		result.append(weightOnClient);
		result.append(", WeightOnServer: ");
		result.append(weightOnServer);
		result.append(')');
		return result.toString();
	}

} //ContributionImpl
