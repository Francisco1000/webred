/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mzt.impl;

import java.util.Collection;

import mzt.Dependable;
import mzt.IDependency;
import mzt.WebRequirementsMetamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IDependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mzt.impl.IDependencyImpl#getDependencyTo <em>Dependency To</em>}</li>
 *   <li>{@link mzt.impl.IDependencyImpl#getDependencyFrom <em>Dependency From</em>}</li>
 *   <li>{@link mzt.impl.IDependencyImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IDependencyImpl extends RelationshipImpl implements IDependency {
	/**
	 * The cached value of the '{@link #getDependencyTo() <em>Dependency To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependable> dependencyTo;

	/**
	 * The cached value of the '{@link #getDependencyFrom() <em>Dependency From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependable> dependencyFrom;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebRequirementsMetamodelPackage.Literals.IDEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependable> getDependencyTo() {
		if (dependencyTo == null) {
			dependencyTo = new EObjectWithInverseResolvingEList<Dependable>(Dependable.class, this, WebRequirementsMetamodelPackage.IDEPENDENCY__DEPENDENCY_TO, WebRequirementsMetamodelPackage.DEPENDABLE__DEPENDENCY_FROM);
		}
		return dependencyTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependable> getDependencyFrom() {
		if (dependencyFrom == null) {
			dependencyFrom = new EObjectWithInverseResolvingEList<Dependable>(Dependable.class, this, WebRequirementsMetamodelPackage.IDEPENDENCY__DEPENDENCY_FROM, WebRequirementsMetamodelPackage.DEPENDABLE__DEPENDENCY_TO);
		}
		return dependencyFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebRequirementsMetamodelPackage.IDEPENDENCY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebRequirementsMetamodelPackage.IDEPENDENCY__DEPENDENCY_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDependencyTo()).basicAdd(otherEnd, msgs);
			case WebRequirementsMetamodelPackage.IDEPENDENCY__DEPENDENCY_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDependencyFrom()).basicAdd(otherEnd, msgs);
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
			case WebRequirementsMetamodelPackage.IDEPENDENCY__DEPENDENCY_TO:
				return ((InternalEList<?>)getDependencyTo()).basicRemove(otherEnd, msgs);
			case WebRequirementsMetamodelPackage.IDEPENDENCY__DEPENDENCY_FROM:
				return ((InternalEList<?>)getDependencyFrom()).basicRemove(otherEnd, msgs);
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
			case WebRequirementsMetamodelPackage.IDEPENDENCY__DEPENDENCY_TO:
				return getDependencyTo();
			case WebRequirementsMetamodelPackage.IDEPENDENCY__DEPENDENCY_FROM:
				return getDependencyFrom();
			case WebRequirementsMetamodelPackage.IDEPENDENCY__NAME:
				return getName();
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
			case WebRequirementsMetamodelPackage.IDEPENDENCY__DEPENDENCY_TO:
				getDependencyTo().clear();
				getDependencyTo().addAll((Collection<? extends Dependable>)newValue);
				return;
			case WebRequirementsMetamodelPackage.IDEPENDENCY__DEPENDENCY_FROM:
				getDependencyFrom().clear();
				getDependencyFrom().addAll((Collection<? extends Dependable>)newValue);
				return;
			case WebRequirementsMetamodelPackage.IDEPENDENCY__NAME:
				setName((String)newValue);
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
			case WebRequirementsMetamodelPackage.IDEPENDENCY__DEPENDENCY_TO:
				getDependencyTo().clear();
				return;
			case WebRequirementsMetamodelPackage.IDEPENDENCY__DEPENDENCY_FROM:
				getDependencyFrom().clear();
				return;
			case WebRequirementsMetamodelPackage.IDEPENDENCY__NAME:
				setName(NAME_EDEFAULT);
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
			case WebRequirementsMetamodelPackage.IDEPENDENCY__DEPENDENCY_TO:
				return dependencyTo != null && !dependencyTo.isEmpty();
			case WebRequirementsMetamodelPackage.IDEPENDENCY__DEPENDENCY_FROM:
				return dependencyFrom != null && !dependencyFrom.isEmpty();
			case WebRequirementsMetamodelPackage.IDEPENDENCY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //IDependencyImpl
