/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WebRequirementsMetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correlation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WebRequirementsMetamodel.Correlation#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see WebRequirementsMetamodel.WebRequirementsMetamodelPackage#getCorrelation()
 * @model
 * @generated
 */
public interface Correlation extends Relationship {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link WebRequirementsMetamodel.CorrelationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see WebRequirementsMetamodel.CorrelationType
	 * @see #setType(CorrelationType)
	 * @see WebRequirementsMetamodel.WebRequirementsMetamodelPackage#getCorrelation_Type()
	 * @model
	 * @generated
	 */
	CorrelationType getType();

	/**
	 * Sets the value of the '{@link WebRequirementsMetamodel.Correlation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see WebRequirementsMetamodel.CorrelationType
	 * @see #getType()
	 * @generated
	 */
	void setType(CorrelationType value);

} // Correlation
