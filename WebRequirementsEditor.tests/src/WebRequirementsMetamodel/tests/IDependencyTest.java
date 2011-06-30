/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WebRequirementsMetamodel.tests;

import WebRequirementsMetamodel.IDependency;
import WebRequirementsMetamodel.WebRequirementsMetamodelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>IDependency</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IDependencyTest extends RelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IDependencyTest.class);
	}

	/**
	 * Constructs a new IDependency test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDependencyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this IDependency test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IDependency getFixture() {
		return (IDependency)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WebRequirementsMetamodelFactory.eINSTANCE.createIDependency());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //IDependencyTest
