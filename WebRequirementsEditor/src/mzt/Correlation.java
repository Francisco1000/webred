/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mzt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correlation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mzt.Correlation#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mzt.WebRequirementsMetamodelPackage#getCorrelation()
 * @model
 * @generated
 */
public interface Correlation extends Relationship {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mzt.CorrelationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mzt.CorrelationType
	 * @see #setType(CorrelationType)
	 * @see mzt.WebRequirementsMetamodelPackage#getCorrelation_Type()
	 * @model
	 * @generated
	 */
	CorrelationType getType();

	/**
	 * Sets the value of the '{@link mzt.Correlation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mzt.CorrelationType
	 * @see #getType()
	 * @generated
	 */
	void setType(CorrelationType value);

} // Correlation
