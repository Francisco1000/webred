/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WebRequirementsMetamodel.impl;

import WebRequirementsMetamodel.Dependable;
import WebRequirementsMetamodel.IDependency;
import WebRequirementsMetamodel.WebRequirementsMetamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WebRequirementsMetamodel.impl.DependableImpl#getDependencyFrom <em>Dependency From</em>}</li>
 *   <li>{@link WebRequirementsMetamodel.impl.DependableImpl#getDependencyTo <em>Dependency To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DependableImpl extends EObjectImpl implements Dependable {
	/**
	 * The cached value of the '{@link #getDependencyFrom() <em>Dependency From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyFrom()
	 * @generated
	 * @ordered
	 */
	protected IDependency dependencyFrom;

	/**
	 * The cached value of the '{@link #getDependencyTo() <em>Dependency To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyTo()
	 * @generated
	 * @ordered
	 */
	protected IDependency dependencyTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebRequirementsMetamodelPackage.Literals.DEPENDABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDependency getDependencyFrom() {
		if (dependencyFrom != null && dependencyFrom.eIsProxy()) {
			InternalEObject oldDependencyFrom = (InternalEObject)dependencyFrom;
			dependencyFrom = (IDependency)eResolveProxy(oldDependencyFrom);
			if (dependencyFrom != oldDependencyFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebRequirementsMetamodelPackage.DEPENDABLE__DEPENDENCY_FROM, oldDependencyFrom, dependencyFrom));
			}
		}
		return dependencyFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDependency basicGetDependencyFrom() {
		return dependencyFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependencyFrom(IDependency newDependencyFrom, NotificationChain msgs) {
		IDependency oldDependencyFrom = dependencyFrom;
		dependencyFrom = newDependencyFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebRequirementsMetamodelPackage.DEPENDABLE__DEPENDENCY_FROM, oldDependencyFrom, newDependencyFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependencyFrom(IDependency newDependencyFrom) {
		if (newDependencyFrom != dependencyFrom) {
			NotificationChain msgs = null;
			if (dependencyFrom != null)
				msgs = ((InternalEObject)dependencyFrom).eInverseRemove(this, WebRequirementsMetamodelPackage.IDEPENDENCY__DEPENDENCY_TO, IDependency.class, msgs);
			if (newDependencyFrom != null)
				msgs = ((InternalEObject)newDependencyFrom).eInverseAdd(this, WebRequirementsMetamodelPackage.IDEPENDENCY__DEPENDENCY_TO, IDependency.class, msgs);
			msgs = basicSetDependencyFrom(newDependencyFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebRequirementsMetamodelPackage.DEPENDABLE__DEPENDENCY_FROM, newDependencyFrom, newDependencyFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDependency getDependencyTo() {
		if (dependencyTo != null && dependencyTo.eIsProxy()) {
			InternalEObject oldDependencyTo = (InternalEObject)dependencyTo;
			dependencyTo = (IDependency)eResolveProxy(oldDependencyTo);
			if (dependencyTo != oldDependencyTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebRequirementsMetamodelPackage.DEPENDABLE__DEPENDENCY_TO, oldDependencyTo, dependencyTo));
			}
		}
		return dependencyTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDependency basicGetDependencyTo() {
		return dependencyTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependencyTo(IDependency newDependencyTo, NotificationChain msgs) {
		IDependency oldDependencyTo = dependencyTo;
		dependencyTo = newDependencyTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebRequirementsMetamodelPackage.DEPENDABLE__DEPENDENCY_TO, oldDependencyTo, newDependencyTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependencyTo(IDependency newDependencyTo) {
		if (newDependencyTo != dependencyTo) {
			NotificationChain msgs = null;
			if (dependencyTo != null)
				msgs = ((InternalEObject)dependencyTo).eInverseRemove(this, WebRequirementsMetamodelPackage.IDEPENDENCY__DEPENDENCY_FROM, IDependency.class, msgs);
			if (newDependencyTo != null)
				msgs = ((InternalEObject)newDependencyTo).eInverseAdd(this, WebRequirementsMetamodelPackage.IDEPENDENCY__DEPENDENCY_FROM, IDependency.class, msgs);
			msgs = basicSetDependencyTo(newDependencyTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebRequirementsMetamodelPackage.DEPENDABLE__DEPENDENCY_TO, newDependencyTo, newDependencyTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebRequirementsMetamodelPackage.DEPENDABLE__DEPENDENCY_FROM:
				if (dependencyFrom != null)
					msgs = ((InternalEObject)dependencyFrom).eInverseRemove(this, WebRequirementsMetamodelPackage.IDEPENDENCY__DEPENDENCY_TO, IDependency.class, msgs);
				return basicSetDependencyFrom((IDependency)otherEnd, msgs);
			case WebRequirementsMetamodelPackage.DEPENDABLE__DEPENDENCY_TO:
				if (dependencyTo != null)
					msgs = ((InternalEObject)dependencyTo).eInverseRemove(this, WebRequirementsMetamodelPackage.IDEPENDENCY__DEPENDENCY_FROM, IDependency.class, msgs);
				return basicSetDependencyTo((IDependency)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebRequirementsMetamodelPackage.DEPENDABLE__DEPENDENCY_FROM:
				return basicSetDependencyFrom(null, msgs);
			case WebRequirementsMetamodelPackage.DEPENDABLE__DEPENDENCY_TO:
				return basicSetDependencyTo(null, msgs);
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
			case WebRequirementsMetamodelPackage.DEPENDABLE__DEPENDENCY_FROM:
				if (resolve) return getDependencyFrom();
				return basicGetDependencyFrom();
			case WebRequirementsMetamodelPackage.DEPENDABLE__DEPENDENCY_TO:
				if (resolve) return getDependencyTo();
				return basicGetDependencyTo();
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
			case WebRequirementsMetamodelPackage.DEPENDABLE__DEPENDENCY_FROM:
				setDependencyFrom((IDependency)newValue);
				return;
			case WebRequirementsMetamodelPackage.DEPENDABLE__DEPENDENCY_TO:
				setDependencyTo((IDependency)newValue);
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
			case WebRequirementsMetamodelPackage.DEPENDABLE__DEPENDENCY_FROM:
				setDependencyFrom((IDependency)null);
				return;
			case WebRequirementsMetamodelPackage.DEPENDABLE__DEPENDENCY_TO:
				setDependencyTo((IDependency)null);
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
			case WebRequirementsMetamodelPackage.DEPENDABLE__DEPENDENCY_FROM:
				return dependencyFrom != null;
			case WebRequirementsMetamodelPackage.DEPENDABLE__DEPENDENCY_TO:
				return dependencyTo != null;
		}
		return super.eIsSet(featureID);
	}

} //DependableImpl
