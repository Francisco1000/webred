/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mzt.impl;

import java.util.Collection;

import mzt.Actor;
import mzt.Belief;
import mzt.SR;
import mzt.WebRequirementsMetamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mzt.impl.ActorImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mzt.impl.ActorImpl#getIBeliefs <em>IBeliefs</em>}</li>
 *   <li>{@link mzt.impl.ActorImpl#getName <em>Name</em>}</li>
 *   <li>{@link mzt.impl.ActorImpl#getStrategicRelationships <em>Strategic Relationships</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorImpl extends DependableImpl implements Actor {
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
	 * The cached value of the '{@link #getIBeliefs() <em>IBeliefs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIBeliefs()
	 * @generated
	 * @ordered
	 */
	protected EList<Belief> iBeliefs;

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
	 * The cached value of the '{@link #getStrategicRelationships() <em>Strategic Relationships</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategicRelationships()
	 * @generated
	 * @ordered
	 */
	protected SR strategicRelationships;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebRequirementsMetamodelPackage.Literals.ACTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebRequirementsMetamodelPackage.ACTOR__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Belief> getIBeliefs() {
		if (iBeliefs == null) {
			iBeliefs = new EObjectContainmentEList<Belief>(Belief.class, this, WebRequirementsMetamodelPackage.ACTOR__IBELIEFS);
		}
		return iBeliefs;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WebRequirementsMetamodelPackage.ACTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SR getStrategicRelationships() {
		return strategicRelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrategicRelationships(SR newStrategicRelationships, NotificationChain msgs) {
		SR oldStrategicRelationships = strategicRelationships;
		strategicRelationships = newStrategicRelationships;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WebRequirementsMetamodelPackage.ACTOR__STRATEGIC_RELATIONSHIPS, oldStrategicRelationships, newStrategicRelationships);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategicRelationships(SR newStrategicRelationships) {
		if (newStrategicRelationships != strategicRelationships) {
			NotificationChain msgs = null;
			if (strategicRelationships != null)
				msgs = ((InternalEObject)strategicRelationships).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WebRequirementsMetamodelPackage.ACTOR__STRATEGIC_RELATIONSHIPS, null, msgs);
			if (newStrategicRelationships != null)
				msgs = ((InternalEObject)newStrategicRelationships).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WebRequirementsMetamodelPackage.ACTOR__STRATEGIC_RELATIONSHIPS, null, msgs);
			msgs = basicSetStrategicRelationships(newStrategicRelationships, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebRequirementsMetamodelPackage.ACTOR__STRATEGIC_RELATIONSHIPS, newStrategicRelationships, newStrategicRelationships));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebRequirementsMetamodelPackage.ACTOR__IBELIEFS:
				return ((InternalEList<?>)getIBeliefs()).basicRemove(otherEnd, msgs);
			case WebRequirementsMetamodelPackage.ACTOR__STRATEGIC_RELATIONSHIPS:
				return basicSetStrategicRelationships(null, msgs);
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
			case WebRequirementsMetamodelPackage.ACTOR__DESCRIPTION:
				return getDescription();
			case WebRequirementsMetamodelPackage.ACTOR__IBELIEFS:
				return getIBeliefs();
			case WebRequirementsMetamodelPackage.ACTOR__NAME:
				return getName();
			case WebRequirementsMetamodelPackage.ACTOR__STRATEGIC_RELATIONSHIPS:
				return getStrategicRelationships();
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
			case WebRequirementsMetamodelPackage.ACTOR__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WebRequirementsMetamodelPackage.ACTOR__IBELIEFS:
				getIBeliefs().clear();
				getIBeliefs().addAll((Collection<? extends Belief>)newValue);
				return;
			case WebRequirementsMetamodelPackage.ACTOR__NAME:
				setName((String)newValue);
				return;
			case WebRequirementsMetamodelPackage.ACTOR__STRATEGIC_RELATIONSHIPS:
				setStrategicRelationships((SR)newValue);
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
			case WebRequirementsMetamodelPackage.ACTOR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WebRequirementsMetamodelPackage.ACTOR__IBELIEFS:
				getIBeliefs().clear();
				return;
			case WebRequirementsMetamodelPackage.ACTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WebRequirementsMetamodelPackage.ACTOR__STRATEGIC_RELATIONSHIPS:
				setStrategicRelationships((SR)null);
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
			case WebRequirementsMetamodelPackage.ACTOR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WebRequirementsMetamodelPackage.ACTOR__IBELIEFS:
				return iBeliefs != null && !iBeliefs.isEmpty();
			case WebRequirementsMetamodelPackage.ACTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WebRequirementsMetamodelPackage.ACTOR__STRATEGIC_RELATIONSHIPS:
				return strategicRelationships != null;
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ActorImpl
