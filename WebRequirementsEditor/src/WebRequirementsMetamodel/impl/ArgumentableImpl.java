/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WebRequirementsMetamodel.impl;

import WebRequirementsMetamodel.Argumentable;
import WebRequirementsMetamodel.Criticality;
import WebRequirementsMetamodel.Dependable;
import WebRequirementsMetamodel.Evaluation;
import WebRequirementsMetamodel.IDependency;
import WebRequirementsMetamodel.WebRequirementsMetamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argumentable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WebRequirementsMetamodel.impl.ArgumentableImpl#getDependencyFrom <em>Dependency From</em>}</li>
 *   <li>{@link WebRequirementsMetamodel.impl.ArgumentableImpl#getDependencyTo <em>Dependency To</em>}</li>
 *   <li>{@link WebRequirementsMetamodel.impl.ArgumentableImpl#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link WebRequirementsMetamodel.impl.ArgumentableImpl#getEvaluation <em>Evaluation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ArgumentableImpl extends IntentionalElementImpl implements Argumentable {
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
	 * The default value of the '{@link #getCriticality() <em>Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticality()
	 * @generated
	 * @ordered
	 */
	protected static final Criticality CRITICALITY_EDEFAULT = Criticality.OPEN;

	/**
	 * The cached value of the '{@link #getCriticality() <em>Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticality()
	 * @generated
	 * @ordered
	 */
	protected Criticality criticality = CRITICALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEvaluation() <em>Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluation()
	 * @generated
	 * @ordered
	 */
	protected static final Evaluation EVALUATION_EDEFAULT = Evaluation.SATISFACIED;

	/**
	 * The cached value of the '{@link #getEvaluation() <em>Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluation()
	 * @generated
	 * @ordered
	 */
	protected Evaluation evaluation = EVALUATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebRequirementsMetamodelPackage.Literals.ARGUMENTABLE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebRequirementsMetamodelPackage.ARGUMENTABLE__DEPENDENCY_FROM, oldDependencyFrom, dependencyFrom));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebRequirementsMetamodelPackage.ARGUMENTABLE__DEPENDENCY_FROM, oldDependencyFrom, newDependencyFrom);
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebRequirementsMetamodelPackage.ARGUMENTABLE__DEPENDENCY_FROM, newDependencyFrom, newDependencyFrom));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebRequirementsMetamodelPackage.ARGUMENTABLE__DEPENDENCY_TO, oldDependencyTo, dependencyTo));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebRequirementsMetamodelPackage.ARGUMENTABLE__DEPENDENCY_TO, oldDependencyTo, newDependencyTo);
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebRequirementsMetamodelPackage.ARGUMENTABLE__DEPENDENCY_TO, newDependencyTo, newDependencyTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Criticality getCriticality() {
		return criticality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriticality(Criticality newCriticality) {
		Criticality oldCriticality = criticality;
		criticality = newCriticality == null ? CRITICALITY_EDEFAULT : newCriticality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebRequirementsMetamodelPackage.ARGUMENTABLE__CRITICALITY, oldCriticality, criticality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evaluation getEvaluation() {
		return evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluation(Evaluation newEvaluation) {
		Evaluation oldEvaluation = evaluation;
		evaluation = newEvaluation == null ? EVALUATION_EDEFAULT : newEvaluation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebRequirementsMetamodelPackage.ARGUMENTABLE__EVALUATION, oldEvaluation, evaluation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebRequirementsMetamodelPackage.ARGUMENTABLE__DEPENDENCY_FROM:
				if (dependencyFrom != null)
					msgs = ((InternalEObject)dependencyFrom).eInverseRemove(this, WebRequirementsMetamodelPackage.IDEPENDENCY__DEPENDENCY_TO, IDependency.class, msgs);
				return basicSetDependencyFrom((IDependency)otherEnd, msgs);
			case WebRequirementsMetamodelPackage.ARGUMENTABLE__DEPENDENCY_TO:
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
			case WebRequirementsMetamodelPackage.ARGUMENTABLE__DEPENDENCY_FROM:
				return basicSetDependencyFrom(null, msgs);
			case WebRequirementsMetamodelPackage.ARGUMENTABLE__DEPENDENCY_TO:
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
			case WebRequirementsMetamodelPackage.ARGUMENTABLE__DEPENDENCY_FROM:
				if (resolve) return getDependencyFrom();
				return basicGetDependencyFrom();
			case WebRequirementsMetamodelPackage.ARGUMENTABLE__DEPENDENCY_TO:
				if (resolve) return getDependencyTo();
				return basicGetDependencyTo();
			case WebRequirementsMetamodelPackage.ARGUMENTABLE__CRITICALITY:
				return getCriticality();
			case WebRequirementsMetamodelPackage.ARGUMENTABLE__EVALUATION:
				return getEvaluation();
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
			case WebRequirementsMetamodelPackage.ARGUMENTABLE__DEPENDENCY_FROM:
				setDependencyFrom((IDependency)newValue);
				return;
			case WebRequirementsMetamodelPackage.ARGUMENTABLE__DEPENDENCY_TO:
				setDependencyTo((IDependency)newValue);
				return;
			case WebRequirementsMetamodelPackage.ARGUMENTABLE__CRITICALITY:
				setCriticality((Criticality)newValue);
				return;
			case WebRequirementsMetamodelPackage.ARGUMENTABLE__EVALUATION:
				setEvaluation((Evaluation)newValue);
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
			case WebRequirementsMetamodelPackage.ARGUMENTABLE__DEPENDENCY_FROM:
				setDependencyFrom((IDependency)null);
				return;
			case WebRequirementsMetamodelPackage.ARGUMENTABLE__DEPENDENCY_TO:
				setDependencyTo((IDependency)null);
				return;
			case WebRequirementsMetamodelPackage.ARGUMENTABLE__CRITICALITY:
				setCriticality(CRITICALITY_EDEFAULT);
				return;
			case WebRequirementsMetamodelPackage.ARGUMENTABLE__EVALUATION:
				setEvaluation(EVALUATION_EDEFAULT);
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
			case WebRequirementsMetamodelPackage.ARGUMENTABLE__DEPENDENCY_FROM:
				return dependencyFrom != null;
			case WebRequirementsMetamodelPackage.ARGUMENTABLE__DEPENDENCY_TO:
				return dependencyTo != null;
			case WebRequirementsMetamodelPackage.ARGUMENTABLE__CRITICALITY:
				return criticality != CRITICALITY_EDEFAULT;
			case WebRequirementsMetamodelPackage.ARGUMENTABLE__EVALUATION:
				return evaluation != EVALUATION_EDEFAULT;
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
		if (baseClass == Dependable.class) {
			switch (derivedFeatureID) {
				case WebRequirementsMetamodelPackage.ARGUMENTABLE__DEPENDENCY_FROM: return WebRequirementsMetamodelPackage.DEPENDABLE__DEPENDENCY_FROM;
				case WebRequirementsMetamodelPackage.ARGUMENTABLE__DEPENDENCY_TO: return WebRequirementsMetamodelPackage.DEPENDABLE__DEPENDENCY_TO;
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
		if (baseClass == Dependable.class) {
			switch (baseFeatureID) {
				case WebRequirementsMetamodelPackage.DEPENDABLE__DEPENDENCY_FROM: return WebRequirementsMetamodelPackage.ARGUMENTABLE__DEPENDENCY_FROM;
				case WebRequirementsMetamodelPackage.DEPENDABLE__DEPENDENCY_TO: return WebRequirementsMetamodelPackage.ARGUMENTABLE__DEPENDENCY_TO;
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
		result.append(" (criticality: ");
		result.append(criticality);
		result.append(", evaluation: ");
		result.append(evaluation);
		result.append(')');
		return result.toString();
	}

} //ArgumentableImpl
