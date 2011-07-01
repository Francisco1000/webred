/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WebRequirementsMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WebRequirementsMetamodel.WebRequirements#getInitialStatus <em>Initial Status</em>}</li>
 *   <li>{@link WebRequirementsMetamodel.WebRequirements#getSolicitedBy <em>Solicited By</em>}</li>
 *   <li>{@link WebRequirementsMetamodel.WebRequirements#getImplementedIn <em>Implemented In</em>}</li>
 * </ul>
 * </p>
 *
 * @see WebRequirementsMetamodel.WebRequirementsMetamodelPackage#getWebRequirements()
 * @model
 * @generated
 */
public interface WebRequirements extends EObject {
	/**
	 * Returns the value of the '<em><b>Initial Status</b></em>' attribute.
	 * The literals are from the enumeration {@link WebRequirementsMetamodel.InitialStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Status</em>' attribute.
	 * @see WebRequirementsMetamodel.InitialStatus
	 * @see #setInitialStatus(InitialStatus)
	 * @see WebRequirementsMetamodel.WebRequirementsMetamodelPackage#getWebRequirements_InitialStatus()
	 * @model
	 * @generated
	 */
	InitialStatus getInitialStatus();

	/**
	 * Sets the value of the '{@link WebRequirementsMetamodel.WebRequirements#getInitialStatus <em>Initial Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Status</em>' attribute.
	 * @see WebRequirementsMetamodel.InitialStatus
	 * @see #getInitialStatus()
	 * @generated
	 */
	void setInitialStatus(InitialStatus value);

	/**
	 * Returns the value of the '<em><b>Solicited By</b></em>' attribute.
	 * The literals are from the enumeration {@link WebRequirementsMetamodel.stakeholders}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solicited By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solicited By</em>' attribute.
	 * @see WebRequirementsMetamodel.stakeholders
	 * @see #setSolicitedBy(stakeholders)
	 * @see WebRequirementsMetamodel.WebRequirementsMetamodelPackage#getWebRequirements_SolicitedBy()
	 * @model
	 * @generated
	 */
	stakeholders getSolicitedBy();

	/**
	 * Sets the value of the '{@link WebRequirementsMetamodel.WebRequirements#getSolicitedBy <em>Solicited By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solicited By</em>' attribute.
	 * @see WebRequirementsMetamodel.stakeholders
	 * @see #getSolicitedBy()
	 * @generated
	 */
	void setSolicitedBy(stakeholders value);

	/**
	 * Returns the value of the '<em><b>Implemented In</b></em>' attribute.
	 * The literals are from the enumeration {@link WebRequirementsMetamodel.RichInternetApplication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implemented In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implemented In</em>' attribute.
	 * @see WebRequirementsMetamodel.RichInternetApplication
	 * @see #setImplementedIn(RichInternetApplication)
	 * @see WebRequirementsMetamodel.WebRequirementsMetamodelPackage#getWebRequirements_ImplementedIn()
	 * @model required="true"
	 * @generated
	 */
	RichInternetApplication getImplementedIn();

	/**
	 * Sets the value of the '{@link WebRequirementsMetamodel.WebRequirements#getImplementedIn <em>Implemented In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implemented In</em>' attribute.
	 * @see WebRequirementsMetamodel.RichInternetApplication
	 * @see #getImplementedIn()
	 * @generated
	 */
	void setImplementedIn(RichInternetApplication value);

} // WebRequirements
