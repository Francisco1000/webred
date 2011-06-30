/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WebRequirementsMetamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see WebRequirementsMetamodel.WebRequirementsMetamodelPackage
 * @generated
 */
public interface WebRequirementsMetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebRequirementsMetamodelFactory eINSTANCE = WebRequirementsMetamodel.impl.WebRequirementsMetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>SD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SD</em>'.
	 * @generated
	 */
	SD createSD();

	/**
	 * Returns a new object of class '<em>SR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SR</em>'.
	 * @generated
	 */
	SR createSR();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns a new object of class '<em>Belief</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Belief</em>'.
	 * @generated
	 */
	Belief createBelief();

	/**
	 * Returns a new object of class '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal</em>'.
	 * @generated
	 */
	Goal createGoal();

	/**
	 * Returns a new object of class '<em>Softgoal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Softgoal</em>'.
	 * @generated
	 */
	Softgoal createSoftgoal();

	/**
	 * Returns a new object of class '<em>Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content</em>'.
	 * @generated
	 */
	Content createContent();

	/**
	 * Returns a new object of class '<em>Web Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web Requirements</em>'.
	 * @generated
	 */
	WebRequirements createWebRequirements();

	/**
	 * Returns a new object of class '<em>Navigational</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navigational</em>'.
	 * @generated
	 */
	Navigational createNavigational();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Personalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Personalization</em>'.
	 * @generated
	 */
	Personalization createPersonalization();

	/**
	 * Returns a new object of class '<em>Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layout</em>'.
	 * @generated
	 */
	Layout createLayout();

	/**
	 * Returns a new object of class '<em>Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decomposition</em>'.
	 * @generated
	 */
	Decomposition createDecomposition();

	/**
	 * Returns a new object of class '<em>Means End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Means End</em>'.
	 * @generated
	 */
	MeansEnd createMeansEnd();

	/**
	 * Returns a new object of class '<em>Contribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contribution</em>'.
	 * @generated
	 */
	Contribution createContribution();

	/**
	 * Returns a new object of class '<em>IDependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IDependency</em>'.
	 * @generated
	 */
	IDependency createIDependency();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WebRequirementsMetamodelPackage getWebRequirementsMetamodelPackage();

} //WebRequirementsMetamodelFactory
