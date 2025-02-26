/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mzt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Initial Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mzt.WebRequirementsMetamodelPackage#getInitialStatus()
 * @model
 * @generated
 */
public enum InitialStatus implements Enumerator {
	/**
	 * The '<em><b>Implemented</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENTED_VALUE
	 * @generated
	 * @ordered
	 */
	IMPLEMENTED(0, "implemented", "implemented"),

	/**
	 * The '<em><b>No implemented</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_IMPLEMENTED_VALUE
	 * @generated
	 * @ordered
	 */
	NO_IMPLEMENTED(1, "no_implemented", "no_implemented");

	/**
	 * The '<em><b>Implemented</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Implemented</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENTED
	 * @model name="implemented"
	 * @generated
	 * @ordered
	 */
	public static final int IMPLEMENTED_VALUE = 0;

	/**
	 * The '<em><b>No implemented</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No implemented</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_IMPLEMENTED
	 * @model name="no_implemented"
	 * @generated
	 * @ordered
	 */
	public static final int NO_IMPLEMENTED_VALUE = 1;

	/**
	 * An array of all the '<em><b>Initial Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InitialStatus[] VALUES_ARRAY =
		new InitialStatus[] {
			IMPLEMENTED,
			NO_IMPLEMENTED,
		};

	/**
	 * A public read-only list of all the '<em><b>Initial Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InitialStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Initial Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InitialStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InitialStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Initial Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InitialStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InitialStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Initial Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InitialStatus get(int value) {
		switch (value) {
			case IMPLEMENTED_VALUE: return IMPLEMENTED;
			case NO_IMPLEMENTED_VALUE: return NO_IMPLEMENTED;
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
	private InitialStatus(int value, String name, String literal) {
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
	
} //InitialStatus
