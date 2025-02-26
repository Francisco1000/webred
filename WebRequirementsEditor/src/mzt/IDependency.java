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
 * A representation of the model object '<em><b>IDependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mzt.IDependency#getDependencyTo <em>Dependency To</em>}</li>
 *   <li>{@link mzt.IDependency#getDependencyFrom <em>Dependency From</em>}</li>
 *   <li>{@link mzt.IDependency#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see mzt.WebRequirementsMetamodelPackage#getIDependency()
 * @model
 * @generated
 */
public interface IDependency extends Relationship {
	/**
	 * Returns the value of the '<em><b>Dependency To</b></em>' reference list.
	 * The list contents are of type {@link mzt.Dependable}.
	 * It is bidirectional and its opposite is '{@link mzt.Dependable#getDependencyFrom <em>Dependency From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency To</em>' reference list.
	 * @see mzt.WebRequirementsMetamodelPackage#getIDependency_DependencyTo()
	 * @see mzt.Dependable#getDependencyFrom
	 * @model opposite="DependencyFrom"
	 * @generated
	 */
	EList<Dependable> getDependencyTo();

	/**
	 * Returns the value of the '<em><b>Dependency From</b></em>' reference list.
	 * The list contents are of type {@link mzt.Dependable}.
	 * It is bidirectional and its opposite is '{@link mzt.Dependable#getDependencyTo <em>Dependency To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency From</em>' reference list.
	 * @see mzt.WebRequirementsMetamodelPackage#getIDependency_DependencyFrom()
	 * @see mzt.Dependable#getDependencyTo
	 * @model opposite="DependencyTo"
	 * @generated
	 */
	EList<Dependable> getDependencyFrom();

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
	 * @see mzt.WebRequirementsMetamodelPackage#getIDependency_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mzt.IDependency#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // IDependency
