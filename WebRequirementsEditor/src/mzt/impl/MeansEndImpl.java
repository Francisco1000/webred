/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mzt.impl;

import mzt.IntentionalElement;
import mzt.MeansEnd;
import mzt.WebRequirementsMetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Means End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mzt.impl.MeansEndImpl#getMeans <em>Means</em>}</li>
 *   <li>{@link mzt.impl.MeansEndImpl#getEnds <em>Ends</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeansEndImpl extends RelationshipImpl implements MeansEnd {
	/**
	 * The cached value of the '{@link #getMeans() <em>Means</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeans()
	 * @generated
	 * @ordered
	 */
	protected IntentionalElement means;

	/**
	 * The cached value of the '{@link #getEnds() <em>Ends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnds()
	 * @generated
	 * @ordered
	 */
	protected IntentionalElement ends;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeansEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebRequirementsMetamodelPackage.Literals.MEANS_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentionalElement getMeans() {
		if (means != null && means.eIsProxy()) {
			InternalEObject oldMeans = (InternalEObject)means;
			means = (IntentionalElement)eResolveProxy(oldMeans);
			if (means != oldMeans) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebRequirementsMetamodelPackage.MEANS_END__MEANS, oldMeans, means));
			}
		}
		return means;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentionalElement basicGetMeans() {
		return means;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeans(IntentionalElement newMeans) {
		IntentionalElement oldMeans = means;
		means = newMeans;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebRequirementsMetamodelPackage.MEANS_END__MEANS, oldMeans, means));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentionalElement getEnds() {
		if (ends != null && ends.eIsProxy()) {
			InternalEObject oldEnds = (InternalEObject)ends;
			ends = (IntentionalElement)eResolveProxy(oldEnds);
			if (ends != oldEnds) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebRequirementsMetamodelPackage.MEANS_END__ENDS, oldEnds, ends));
			}
		}
		return ends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentionalElement basicGetEnds() {
		return ends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnds(IntentionalElement newEnds) {
		IntentionalElement oldEnds = ends;
		ends = newEnds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebRequirementsMetamodelPackage.MEANS_END__ENDS, oldEnds, ends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WebRequirementsMetamodelPackage.MEANS_END__MEANS:
				if (resolve) return getMeans();
				return basicGetMeans();
			case WebRequirementsMetamodelPackage.MEANS_END__ENDS:
				if (resolve) return getEnds();
				return basicGetEnds();
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
			case WebRequirementsMetamodelPackage.MEANS_END__MEANS:
				setMeans((IntentionalElement)newValue);
				return;
			case WebRequirementsMetamodelPackage.MEANS_END__ENDS:
				setEnds((IntentionalElement)newValue);
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
			case WebRequirementsMetamodelPackage.MEANS_END__MEANS:
				setMeans((IntentionalElement)null);
				return;
			case WebRequirementsMetamodelPackage.MEANS_END__ENDS:
				setEnds((IntentionalElement)null);
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
			case WebRequirementsMetamodelPackage.MEANS_END__MEANS:
				return means != null;
			case WebRequirementsMetamodelPackage.MEANS_END__ENDS:
				return ends != null;
		}
		return super.eIsSet(featureID);
	}

} //MeansEndImpl
