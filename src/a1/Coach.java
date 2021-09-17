/**
 */
package a1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coach</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link a1.Coach#getExperience <em>Experience</em>}</li>
 * </ul>
 *
 * @see a1.A1Package#getCoach()
 * @model
 * @generated
 */
public interface Coach extends Person {
	/**
	 * Returns the value of the '<em><b>Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experience</em>' attribute.
	 * @see #setExperience(int)
	 * @see a1.A1Package#getCoach_Experience()
	 * @model
	 * @generated
	 */
	int getExperience();

	/**
	 * Sets the value of the '{@link a1.Coach#getExperience <em>Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experience</em>' attribute.
	 * @see #getExperience()
	 * @generated
	 */
	void setExperience(int value);

} // Coach
