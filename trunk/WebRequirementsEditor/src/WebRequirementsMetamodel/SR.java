/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WebRequirementsMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WebRequirementsMetamodel.SR#getIRelationships <em>IRelationships</em>}</li>
 *   <li>{@link WebRequirementsMetamodel.SR#getIElement <em>IElement</em>}</li>
 *   <li>{@link WebRequirementsMetamodel.SR#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see WebRequirementsMetamodel.WebRequirementsMetamodelPackage#getSR()
 * @model
 * @generated
 */
public interface SR extends EObject {
	/**
	 * Returns the value of the '<em><b>IRelationships</b></em>' containment reference list.
	 * The list contents are of type {@link WebRequirementsMetamodel.Relationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IRelationships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IRelationships</em>' containment reference list.
	 * @see WebRequirementsMetamodel.WebRequirementsMetamodelPackage#getSR_IRelationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relationship> getIRelationships();

	/**
	 * Returns the value of the '<em><b>IElement</b></em>' containment reference list.
	 * The list contents are of type {@link WebRequirementsMetamodel.IntentionalElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IElement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IElement</em>' containment reference list.
	 * @see WebRequirementsMetamodel.WebRequirementsMetamodelPackage#getSR_IElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntentionalElement> getIElement();

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
	 * @see WebRequirementsMetamodel.WebRequirementsMetamodelPackage#getSR_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link WebRequirementsMetamodel.SR#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // SR
