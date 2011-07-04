/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mzt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mzt.Actor#getDescription <em>Description</em>}</li>
 *   <li>{@link mzt.Actor#getIBeliefs <em>IBeliefs</em>}</li>
 *   <li>{@link mzt.Actor#getName <em>Name</em>}</li>
 *   <li>{@link mzt.Actor#getStrategicRelationships <em>Strategic Relationships</em>}</li>
 * </ul>
 * </p>
 *
 * @see mzt.WebRequirementsMetamodelPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends Dependable {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mzt.WebRequirementsMetamodelPackage#getActor_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mzt.Actor#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>IBeliefs</b></em>' containment reference list.
	 * The list contents are of type {@link mzt.Belief}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IBeliefs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IBeliefs</em>' containment reference list.
	 * @see mzt.WebRequirementsMetamodelPackage#getActor_IBeliefs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Belief> getIBeliefs();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mzt.WebRequirementsMetamodelPackage#getActor_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mzt.Actor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Strategic Relationships</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategic Relationships</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategic Relationships</em>' containment reference.
	 * @see #setStrategicRelationships(SR)
	 * @see mzt.WebRequirementsMetamodelPackage#getActor_StrategicRelationships()
	 * @model containment="true"
	 * @generated
	 */
	SR getStrategicRelationships();

	/**
	 * Sets the value of the '{@link mzt.Actor#getStrategicRelationships <em>Strategic Relationships</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategic Relationships</em>' containment reference.
	 * @see #getStrategicRelationships()
	 * @generated
	 */
	void setStrategicRelationships(SR value);

} // Actor
