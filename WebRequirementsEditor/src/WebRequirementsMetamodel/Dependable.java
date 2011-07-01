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
 * A representation of the model object '<em><b>Dependable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WebRequirementsMetamodel.Dependable#getDependencyFrom <em>Dependency From</em>}</li>
 *   <li>{@link WebRequirementsMetamodel.Dependable#getDependencyTo <em>Dependency To</em>}</li>
 * </ul>
 * </p>
 *
 * @see WebRequirementsMetamodel.WebRequirementsMetamodelPackage#getDependable()
 * @model abstract="true"
 * @generated
 */
public interface Dependable extends EObject {
	/**
	 * Returns the value of the '<em><b>Dependency From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link WebRequirementsMetamodel.IDependency#getDependencyTo <em>Dependency To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency From</em>' reference.
	 * @see #setDependencyFrom(IDependency)
	 * @see WebRequirementsMetamodel.WebRequirementsMetamodelPackage#getDependable_DependencyFrom()
	 * @see WebRequirementsMetamodel.IDependency#getDependencyTo
	 * @model opposite="DependencyTo"
	 * @generated
	 */
	IDependency getDependencyFrom();

	/**
	 * Sets the value of the '{@link WebRequirementsMetamodel.Dependable#getDependencyFrom <em>Dependency From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency From</em>' reference.
	 * @see #getDependencyFrom()
	 * @generated
	 */
	void setDependencyFrom(IDependency value);

	/**
	 * Returns the value of the '<em><b>Dependency To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link WebRequirementsMetamodel.IDependency#getDependencyFrom <em>Dependency From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency To</em>' reference.
	 * @see #setDependencyTo(IDependency)
	 * @see WebRequirementsMetamodel.WebRequirementsMetamodelPackage#getDependable_DependencyTo()
	 * @see WebRequirementsMetamodel.IDependency#getDependencyFrom
	 * @model opposite="DependencyFrom"
	 * @generated
	 */
	IDependency getDependencyTo();

	/**
	 * Sets the value of the '{@link WebRequirementsMetamodel.Dependable#getDependencyTo <em>Dependency To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency To</em>' reference.
	 * @see #getDependencyTo()
	 * @generated
	 */
	void setDependencyTo(IDependency value);

} // Dependable
