/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mzt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Means End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mzt.MeansEnd#getMeans <em>Means</em>}</li>
 *   <li>{@link mzt.MeansEnd#getEnds <em>Ends</em>}</li>
 * </ul>
 * </p>
 *
 * @see mzt.WebRequirementsMetamodelPackage#getMeansEnd()
 * @model
 * @generated
 */
public interface MeansEnd extends Relationship {
	/**
	 * Returns the value of the '<em><b>Means</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Means</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Means</em>' reference.
	 * @see #setMeans(IntentionalElement)
	 * @see mzt.WebRequirementsMetamodelPackage#getMeansEnd_Means()
	 * @model required="true"
	 * @generated
	 */
	IntentionalElement getMeans();

	/**
	 * Sets the value of the '{@link mzt.MeansEnd#getMeans <em>Means</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Means</em>' reference.
	 * @see #getMeans()
	 * @generated
	 */
	void setMeans(IntentionalElement value);

	/**
	 * Returns the value of the '<em><b>Ends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ends</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ends</em>' reference.
	 * @see #setEnds(IntentionalElement)
	 * @see mzt.WebRequirementsMetamodelPackage#getMeansEnd_Ends()
	 * @model required="true"
	 * @generated
	 */
	IntentionalElement getEnds();

	/**
	 * Sets the value of the '{@link mzt.MeansEnd#getEnds <em>Ends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ends</em>' reference.
	 * @see #getEnds()
	 * @generated
	 */
	void setEnds(IntentionalElement value);

} // MeansEnd
