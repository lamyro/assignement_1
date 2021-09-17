/**
 */
package a1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link a1.Team#getName <em>Name</em>}</li>
 *   <li>{@link a1.Team#getCity_Name <em>City Name</em>}</li>
 *   <li>{@link a1.Team#getStadium <em>Stadium</em>}</li>
 *   <li>{@link a1.Team#getConference <em>Conference</em>}</li>
 *   <li>{@link a1.Team#getPlayers <em>Players</em>}</li>
 *   <li>{@link a1.Team#getCoach <em>Coach</em>}</li>
 *   <li>{@link a1.Team#getNumber_of_victories <em>Number of victories</em>}</li>
 *   <li>{@link a1.Team#getNumber_of_Loses <em>Number of Loses</em>}</li>
 *   <li>{@link a1.Team#getRank <em>Rank</em>}</li>
 *   <li>{@link a1.Team#getStats <em>Stats</em>}</li>
 * </ul>
 *
 * @see a1.A1Package#getTeam()
 * @model
 * @generated
 */
public interface Team extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see a1.A1Package#getTeam_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link a1.Team#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>City Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City Name</em>' attribute.
	 * @see #setCity_Name(String)
	 * @see a1.A1Package#getTeam_City_Name()
	 * @model
	 * @generated
	 */
	String getCity_Name();

	/**
	 * Sets the value of the '{@link a1.Team#getCity_Name <em>City Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City Name</em>' attribute.
	 * @see #getCity_Name()
	 * @generated
	 */
	void setCity_Name(String value);

	/**
	 * Returns the value of the '<em><b>Stadium</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stadium</em>' containment reference.
	 * @see #setStadium(Stadium)
	 * @see a1.A1Package#getTeam_Stadium()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Stadium getStadium();

	/**
	 * Sets the value of the '{@link a1.Team#getStadium <em>Stadium</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stadium</em>' containment reference.
	 * @see #getStadium()
	 * @generated
	 */
	void setStadium(Stadium value);

	/**
	 * Returns the value of the '<em><b>Conference</b></em>' attribute.
	 * The literals are from the enumeration {@link a1.Conference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conference</em>' attribute.
	 * @see a1.Conference
	 * @see #setConference(Conference)
	 * @see a1.A1Package#getTeam_Conference()
	 * @model
	 * @generated
	 */
	Conference getConference();

	/**
	 * Sets the value of the '{@link a1.Team#getConference <em>Conference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conference</em>' attribute.
	 * @see a1.Conference
	 * @see #getConference()
	 * @generated
	 */
	void setConference(Conference value);

	/**
	 * Returns the value of the '<em><b>Players</b></em>' containment reference list.
	 * The list contents are of type {@link a1.Player}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' containment reference list.
	 * @see a1.A1Package#getTeam_Players()
	 * @model containment="true" lower="5"
	 * @generated
	 */
	EList<Player> getPlayers();

	/**
	 * Returns the value of the '<em><b>Coach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coach</em>' containment reference.
	 * @see #setCoach(Coach)
	 * @see a1.A1Package#getTeam_Coach()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coach getCoach();

	/**
	 * Sets the value of the '{@link a1.Team#getCoach <em>Coach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coach</em>' containment reference.
	 * @see #getCoach()
	 * @generated
	 */
	void setCoach(Coach value);

	/**
	 * Returns the value of the '<em><b>Number of victories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number of victories</em>' attribute.
	 * @see #setNumber_of_victories(int)
	 * @see a1.A1Package#getTeam_Number_of_victories()
	 * @model
	 * @generated
	 */
	int getNumber_of_victories();

	/**
	 * Sets the value of the '{@link a1.Team#getNumber_of_victories <em>Number of victories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number of victories</em>' attribute.
	 * @see #getNumber_of_victories()
	 * @generated
	 */
	void setNumber_of_victories(int value);

	/**
	 * Returns the value of the '<em><b>Number of Loses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number of Loses</em>' attribute.
	 * @see #setNumber_of_Loses(int)
	 * @see a1.A1Package#getTeam_Number_of_Loses()
	 * @model
	 * @generated
	 */
	int getNumber_of_Loses();

	/**
	 * Sets the value of the '{@link a1.Team#getNumber_of_Loses <em>Number of Loses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number of Loses</em>' attribute.
	 * @see #getNumber_of_Loses()
	 * @generated
	 */
	void setNumber_of_Loses(int value);

	/**
	 * Returns the value of the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank</em>' attribute.
	 * @see #setRank(int)
	 * @see a1.A1Package#getTeam_Rank()
	 * @model
	 * @generated
	 */
	int getRank();

	/**
	 * Sets the value of the '{@link a1.Team#getRank <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank</em>' attribute.
	 * @see #getRank()
	 * @generated
	 */
	void setRank(int value);

	/**
	 * Returns the value of the '<em><b>Stats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stats</em>' containment reference.
	 * @see #setStats(Stats)
	 * @see a1.A1Package#getTeam_Stats()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Stats getStats();

	/**
	 * Sets the value of the '{@link a1.Team#getStats <em>Stats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stats</em>' containment reference.
	 * @see #getStats()
	 * @generated
	 */
	void setStats(Stats value);

} // Team
