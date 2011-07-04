/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mzt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argumentable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mzt.Argumentable#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link mzt.Argumentable#getEvaluation <em>Evaluation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mzt.WebRequirementsMetamodelPackage#getArgumentable()
 * @model abstract="true"
 * @generated
 */
public interface Argumentable extends IntentionalElement, Dependable {
	/**
	 * Returns the value of the '<em><b>Criticality</b></em>' attribute.
	 * The literals are from the enumeration {@link mzt.Criticality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criticality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criticality</em>' attribute.
	 * @see mzt.Criticality
	 * @see #setCriticality(Criticality)
	 * @see mzt.WebRequirementsMetamodelPackage#getArgumentable_Criticality()
	 * @model
	 * @generated
	 */
	Criticality getCriticality();

	/**
	 * Sets the value of the '{@link mzt.Argumentable#getCriticality <em>Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criticality</em>' attribute.
	 * @see mzt.Criticality
	 * @see #getCriticality()
	 * @generated
	 */
	void setCriticality(Criticality value);

	/**
	 * Returns the value of the '<em><b>Evaluation</b></em>' attribute.
	 * The literals are from the enumeration {@link mzt.Evaluation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation</em>' attribute.
	 * @see mzt.Evaluation
	 * @see #setEvaluation(Evaluation)
	 * @see mzt.WebRequirementsMetamodelPackage#getArgumentable_Evaluation()
	 * @model
	 * @generated
	 */
	Evaluation getEvaluation();

	/**
	 * Sets the value of the '{@link mzt.Argumentable#getEvaluation <em>Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation</em>' attribute.
	 * @see mzt.Evaluation
	 * @see #getEvaluation()
	 * @generated
	 */
	void setEvaluation(Evaluation value);

} // Argumentable
