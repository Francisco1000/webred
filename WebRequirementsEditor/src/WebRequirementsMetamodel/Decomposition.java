/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WebRequirementsMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decomposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WebRequirementsMetamodel.Decomposition#getElement <em>Element</em>}</li>
 *   <li>{@link WebRequirementsMetamodel.Decomposition#getSubElement <em>Sub Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see WebRequirementsMetamodel.WebRequirementsMetamodelPackage#getDecomposition()
 * @model
 * @generated
 */
public interface Decomposition extends Relationship {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(IntentionalElement)
	 * @see WebRequirementsMetamodel.WebRequirementsMetamodelPackage#getDecomposition_Element()
	 * @model required="true"
	 * @generated
	 */
	IntentionalElement getElement();

	/**
	 * Sets the value of the '{@link WebRequirementsMetamodel.Decomposition#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(IntentionalElement value);

	/**
	 * Returns the value of the '<em><b>Sub Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Element</em>' reference.
	 * @see #setSubElement(IntentionalElement)
	 * @see WebRequirementsMetamodel.WebRequirementsMetamodelPackage#getDecomposition_SubElement()
	 * @model required="true"
	 * @generated
	 */
	IntentionalElement getSubElement();

	/**
	 * Sets the value of the '{@link WebRequirementsMetamodel.Decomposition#getSubElement <em>Sub Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Element</em>' reference.
	 * @see #getSubElement()
	 * @generated
	 */
	void setSubElement(IntentionalElement value);

} // Decomposition
