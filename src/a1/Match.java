/**
 */
package a1;

import java.time.LocalDate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link a1.Match#getDate <em>Date</em>}</li>
 *   <li>{@link a1.Match#getHour <em>Hour</em>}</li>
 *   <li>{@link a1.Match#getStadium <em>Stadium</em>}</li>
 *   <li>{@link a1.Match#getTeam <em>Team</em>}</li>
 *   <li>{@link a1.Match#getWinner <em>Winner</em>}</li>
 *   <li>{@link a1.Match#getLooser <em>Looser</em>}</li>
 * </ul>
 *
 * @see a1.A1Package#getMatch()
 * @model
 * @generated
 */
public interface Match extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(LocalDate)
	 * @see a1.A1Package#getMatch_Date()
	 * @model dataType="a1.LocalDate"
	 * @generated
	 */
	LocalDate getDate();

	/**
	 * Sets the value of the '{@link a1.Match#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(LocalDate value);

	/**
	 * Returns the value of the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hour</em>' attribute.
	 * @see #setHour(String)
	 * @see a1.A1Package#getMatch_Hour()
	 * @model
	 * @generated
	 */
	String getHour();

	/**
	 * Sets the value of the '{@link a1.Match#getHour <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hour</em>' attribute.
	 * @see #getHour()
	 * @generated
	 */
	void setHour(String value);

	/**
	 * Returns the value of the '<em><b>Stadium</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stadium</em>' attribute.
	 * @see #setStadium(String)
	 * @see a1.A1Package#getMatch_Stadium()
	 * @model
	 * @generated
	 */
	String getStadium();

	/**
	 * Sets the value of the '{@link a1.Match#getStadium <em>Stadium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stadium</em>' attribute.
	 * @see #getStadium()
	 * @generated
	 */
	void setStadium(String value);

	/**
	 * Returns the value of the '<em><b>Team</b></em>' reference list.
	 * The list contents are of type {@link a1.Team}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' reference list.
	 * @see a1.A1Package#getMatch_Team()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<Team> getTeam();

	/**
	 * Returns the value of the '<em><b>Winner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winner</em>' reference.
	 * @see #setWinner(Team)
	 * @see a1.A1Package#getMatch_Winner()
	 * @model required="true"
	 * @generated
	 */
	Team getWinner();

	/**
	 * Sets the value of the '{@link a1.Match#getWinner <em>Winner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Winner</em>' reference.
	 * @see #getWinner()
	 * @generated
	 */
	void setWinner(Team value);

	/**
	 * Returns the value of the '<em><b>Looser</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Looser</em>' reference.
	 * @see #setLooser(Team)
	 * @see a1.A1Package#getMatch_Looser()
	 * @model required="true"
	 * @generated
	 */
	Team getLooser();

	/**
	 * Sets the value of the '{@link a1.Match#getLooser <em>Looser</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Looser</em>' reference.
	 * @see #getLooser()
	 * @generated
	 */
	void setLooser(Team value);

} // Match
