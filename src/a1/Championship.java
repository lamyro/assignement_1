/**
 */
package a1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Championship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link a1.Championship#getSeason_Years <em>Season Years</em>}</li>
 *   <li>{@link a1.Championship#getTeam <em>Team</em>}</li>
 *   <li>{@link a1.Championship#getMatchs <em>Matchs</em>}</li>
 * </ul>
 *
 * @see a1.A1Package#getChampionship()
 * @model
 * @generated
 */
public interface Championship extends EObject {
	/**
	 * Returns the value of the '<em><b>Season Years</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season Years</em>' attribute.
	 * @see #setSeason_Years(String)
	 * @see a1.A1Package#getChampionship_Season_Years()
	 * @model
	 * @generated
	 */
	String getSeason_Years();

	/**
	 * Sets the value of the '{@link a1.Championship#getSeason_Years <em>Season Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season Years</em>' attribute.
	 * @see #getSeason_Years()
	 * @generated
	 */
	void setSeason_Years(String value);

	/**
	 * Returns the value of the '<em><b>Team</b></em>' containment reference list.
	 * The list contents are of type {@link a1.Team}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' containment reference list.
	 * @see a1.A1Package#getChampionship_Team()
	 * @model containment="true" lower="4" upper="30"
	 * @generated
	 */
	EList<Team> getTeam();

	/**
	 * Returns the value of the '<em><b>Matchs</b></em>' containment reference list.
	 * The list contents are of type {@link a1.Match}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchs</em>' containment reference list.
	 * @see a1.A1Package#getChampionship_Matchs()
	 * @model containment="true" upper="70"
	 * @generated
	 */
	EList<Match> getMatchs();

} // Championship
