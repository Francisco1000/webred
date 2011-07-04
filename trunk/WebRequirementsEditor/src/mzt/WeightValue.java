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
 * A representation of the literals of the enumeration '<em><b>Weight Value</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see mzt.WebRequirementsMetamodelPackage#getWeightValue()
 * @model
 * @generated
 */
public enum WeightValue implements Enumerator {
	/**
	 * The '<em><b>No</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_VALUE
	 * @generated
	 * @ordered
	 */
	NO(0, "no", "no"),

	/**
	 * The '<em><b>Help</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HELP_VALUE
	 * @generated
	 * @ordered
	 */
	HELP(1, "help", "help"),

	/**
	 * The '<em><b>Hurt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HURT_VALUE
	 * @generated
	 * @ordered
	 */
	HURT(-1, "hurt", "hurt"),

	/**
	 * The '<em><b>Some Positive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOME_POSITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	SOME_POSITIVE(2, "somePositive", "somePositive"),

	/**
	 * The '<em><b>Some Negative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOME_NEGATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	SOME_NEGATIVE(-2, "someNegative", "someNegative"),

	/**
	 * The '<em><b>Break</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BREAK_VALUE
	 * @generated
	 * @ordered
	 */
	BREAK(-4, "break", "break"),

	/**
	 * The '<em><b>Make</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAKE_VALUE
	 * @generated
	 * @ordered
	 */
	MAKE(4, "make", "make");

	/**
	 * The '<em><b>No</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO
	 * @model name="no"
	 * @generated
	 * @ordered
	 */
	public static final int NO_VALUE = 0;

	/**
	 * The '<em><b>Help</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Help</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HELP
	 * @model name="help"
	 * @generated
	 * @ordered
	 */
	public static final int HELP_VALUE = 1;

	/**
	 * The '<em><b>Hurt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hurt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HURT
	 * @model name="hurt"
	 * @generated
	 * @ordered
	 */
	public static final int HURT_VALUE = -1;

	/**
	 * The '<em><b>Some Positive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Some Positive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOME_POSITIVE
	 * @model name="somePositive"
	 * @generated
	 * @ordered
	 */
	public static final int SOME_POSITIVE_VALUE = 2;

	/**
	 * The '<em><b>Some Negative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Some Negative</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOME_NEGATIVE
	 * @model name="someNegative"
	 * @generated
	 * @ordered
	 */
	public static final int SOME_NEGATIVE_VALUE = -2;

	/**
	 * The '<em><b>Break</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Break</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BREAK
	 * @model name="break"
	 * @generated
	 * @ordered
	 */
	public static final int BREAK_VALUE = -4;

	/**
	 * The '<em><b>Make</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Make</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAKE
	 * @model name="make"
	 * @generated
	 * @ordered
	 */
	public static final int MAKE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Weight Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WeightValue[] VALUES_ARRAY =
		new WeightValue[] {
			NO,
			HELP,
			HURT,
			SOME_POSITIVE,
			SOME_NEGATIVE,
			BREAK,
			MAKE,
		};

	/**
	 * A public read-only list of all the '<em><b>Weight Value</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WeightValue> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Weight Value</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WeightValue get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WeightValue result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Weight Value</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WeightValue getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WeightValue result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Weight Value</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WeightValue get(int value) {
		switch (value) {
			case NO_VALUE: return NO;
			case HELP_VALUE: return HELP;
			case HURT_VALUE: return HURT;
			case SOME_POSITIVE_VALUE: return SOME_POSITIVE;
			case SOME_NEGATIVE_VALUE: return SOME_NEGATIVE;
			case BREAK_VALUE: return BREAK;
			case MAKE_VALUE: return MAKE;
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
	private WeightValue(int value, String name, String literal) {
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
	
} //WeightValue
