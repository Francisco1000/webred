/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package WebRequirementsMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>stakeholders</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see WebRequirementsMetamodel.WebRequirementsMetamodelPackage#getstakeholders()
 * @model
 * @generated
 */
public enum stakeholders implements Enumerator {
	/**
	 * The '<em><b>Client</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIENT_VALUE
	 * @generated
	 * @ordered
	 */
	CLIENT(0, "client", "client"),

	/**
	 * The '<em><b>Developer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVELOPER_VALUE
	 * @generated
	 * @ordered
	 */
	DEVELOPER(1, "developer", "developer"),

	/**
	 * The '<em><b>End user</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #END_USER_VALUE
	 * @generated
	 * @ordered
	 */
	END_USER(2, "end_user", "end_user");

	/**
	 * The '<em><b>Client</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Client</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLIENT
	 * @model name="client"
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_VALUE = 0;

	/**
	 * The '<em><b>Developer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Developer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEVELOPER
	 * @model name="developer"
	 * @generated
	 * @ordered
	 */
	public static final int DEVELOPER_VALUE = 1;

	/**
	 * The '<em><b>End user</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>End user</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #END_USER
	 * @model name="end_user"
	 * @generated
	 * @ordered
	 */
	public static final int END_USER_VALUE = 2;

	/**
	 * An array of all the '<em><b>stakeholders</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final stakeholders[] VALUES_ARRAY =
		new stakeholders[] {
			CLIENT,
			DEVELOPER,
			END_USER,
		};

	/**
	 * A public read-only list of all the '<em><b>stakeholders</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<stakeholders> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>stakeholders</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static stakeholders get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			stakeholders result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>stakeholders</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static stakeholders getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			stakeholders result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>stakeholders</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static stakeholders get(int value) {
		switch (value) {
			case CLIENT_VALUE: return CLIENT;
			case DEVELOPER_VALUE: return DEVELOPER;
			case END_USER_VALUE: return END_USER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private stakeholders(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //stakeholders
