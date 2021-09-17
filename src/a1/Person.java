/**
 */
package a1;

import java.time.LocalDate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link a1.Person#getName <em>Name</em>}</li>
 *   <li>{@link a1.Person#getSurname <em>Surname</em>}</li>
 *   <li>{@link a1.Person#getBirthdate <em>Birthdate</em>}</li>
 *   <li>{@link a1.Person#getAge <em>Age</em>}</li>
 *   <li>{@link a1.Person#getActual_Team <em>Actual Team</em>}</li>
 *   <li>{@link a1.Person#getPast_Team <em>Past Team</em>}</li>
 * </ul>
 *
 * @see a1.A1Package#getPerson()
 * @model abstract="true"
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see a1.A1Package#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link a1.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surname</em>' attribute.
	 * @see #setSurname(String)
	 * @see a1.A1Package#getPerson_Surname()
	 * @model
	 * @generated
	 */
	String getSurname();

	/**
	 * Sets the value of the '{@link a1.Person#getSurname <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surname</em>' attribute.
	 * @see #getSurname()
	 * @generated
	 */
	void setSurname(String value);

	/**
	 * Returns the value of the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birthdate</em>' attribute.
	 * @see #setBirthdate(LocalDate)
	 * @see a1.A1Package#getPerson_Birthdate()
	 * @model dataType="a1.LocalDate"
	 * @generated
	 */
	LocalDate getBirthdate();

	/**
	 * Sets the value of the '{@link a1.Person#getBirthdate <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birthdate</em>' attribute.
	 * @see #getBirthdate()
	 * @generated
	 */
	void setBirthdate(LocalDate value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see a1.A1Package#getPerson_Age()
	 * @model
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link a1.Person#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Actual Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Team</em>' reference.
	 * @see #setActual_Team(Team)
	 * @see a1.A1Package#getPerson_Actual_Team()
	 * @model required="true"
	 * @generated
	 */
	Team getActual_Team();

	/**
	 * Sets the value of the '{@link a1.Person#getActual_Team <em>Actual Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Team</em>' reference.
	 * @see #getActual_Team()
	 * @generated
	 */
	void setActual_Team(Team value);

	/**
	 * Returns the value of the '<em><b>Past Team</b></em>' reference list.
	 * The list contents are of type {@link a1.Team}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Past Team</em>' reference list.
	 * @see a1.A1Package#getPerson_Past_Team()
	 * @model
	 * @generated
	 */
	EList<Team> getPast_Team();

} // Person
