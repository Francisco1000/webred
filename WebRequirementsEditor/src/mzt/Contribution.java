/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mzt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mzt.Contribution#getContributor <em>Contributor</em>}</li>
 *   <li>{@link mzt.Contribution#getContributed <em>Contributed</em>}</li>
 *   <li>{@link mzt.Contribution#getType <em>Type</em>}</li>
 *   <li>{@link mzt.Contribution#getWeightOnClient <em>Weight On Client</em>}</li>
 *   <li>{@link mzt.Contribution#getWeightOnServer <em>Weight On Server</em>}</li>
 * </ul>
 * </p>
 *
 * @see mzt.WebRequirementsMetamodelPackage#getContribution()
 * @model
 * @generated
 */
public interface Contribution extends Relationship {
	/**
	 * Returns the value of the '<em><b>Contributor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributor</em>' reference.
	 * @see #setContributor(IntentionalElement)
	 * @see mzt.WebRequirementsMetamodelPackage#getContribution_Contributor()
	 * @model required="true"
	 * @generated
	 */
	IntentionalElement getContributor();

	/**
	 * Sets the value of the '{@link mzt.Contribution#getContributor <em>Contributor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contributor</em>' reference.
	 * @see #getContributor()
	 * @generated
	 */
	void setContributor(IntentionalElement value);

	/**
	 * Returns the value of the '<em><b>Contributed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributed</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributed</em>' reference.
	 * @see #setContributed(IntentionalElement)
	 * @see mzt.WebRequirementsMetamodelPackage#getContribution_Contributed()
	 * @model required="true"
	 * @generated
	 */
	IntentionalElement getContributed();

	/**
	 * Sets the value of the '{@link mzt.Contribution#getContributed <em>Contributed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contributed</em>' reference.
	 * @see #getContributed()
	 * @generated
	 */
	void setContributed(IntentionalElement value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mzt.ContributionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mzt.ContributionType
	 * @see #setType(ContributionType)
	 * @see mzt.WebRequirementsMetamodelPackage#getContribution_Type()
	 * @model
	 * @generated
	 */
	ContributionType getType();

	/**
	 * Sets the value of the '{@link mzt.Contribution#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mzt.ContributionType
	 * @see #getType()
	 * @generated
	 */
	void setType(ContributionType value);

	/**
	 * Returns the value of the '<em><b>Weight On Client</b></em>' attribute.
	 * The literals are from the enumeration {@link mzt.WeightValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight On Client</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight On Client</em>' attribute.
	 * @see mzt.WeightValue
	 * @see #setWeightOnClient(WeightValue)
	 * @see mzt.WebRequirementsMetamodelPackage#getContribution_WeightOnClient()
	 * @model required="true"
	 * @generated
	 */
	WeightValue getWeightOnClient();

	/**
	 * Sets the value of the '{@link mzt.Contribution#getWeightOnClient <em>Weight On Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight On Client</em>' attribute.
	 * @see mzt.WeightValue
	 * @see #getWeightOnClient()
	 * @generated
	 */
	void setWeightOnClient(WeightValue value);

	/**
	 * Returns the value of the '<em><b>Weight On Server</b></em>' attribute.
	 * The literals are from the enumeration {@link mzt.WeightValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight On Server</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight On Server</em>' attribute.
	 * @see mzt.WeightValue
	 * @see #setWeightOnServer(WeightValue)
	 * @see mzt.WebRequirementsMetamodelPackage#getContribution_WeightOnServer()
	 * @model required="true"
	 * @generated
	 */
	WeightValue getWeightOnServer();

	/**
	 * Sets the value of the '{@link mzt.Contribution#getWeightOnServer <em>Weight On Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight On Server</em>' attribute.
	 * @see mzt.WeightValue
	 * @see #getWeightOnServer()
	 * @generated
	 */
	void setWeightOnServer(WeightValue value);

} // Contribution
