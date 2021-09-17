/**
 */
package a1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see a1.A1Factory
 * @model kind="package"
 * @generated
 */
public interface A1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "a1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "a1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "a1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	A1Package eINSTANCE = a1.impl.A1PackageImpl.init();

	/**
	 * The meta object id for the '{@link a1.impl.TeamImpl <em>Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see a1.impl.TeamImpl
	 * @see a1.impl.A1PackageImpl#getTeam()
	 * @generated
	 */
	int TEAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>City Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__CITY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Stadium</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__STADIUM = 2;

	/**
	 * The feature id for the '<em><b>Conference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__CONFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Players</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__PLAYERS = 4;

	/**
	 * The feature id for the '<em><b>Coach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__COACH = 5;

	/**
	 * The feature id for the '<em><b>Number of victories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__NUMBER_OF_VICTORIES = 6;

	/**
	 * The feature id for the '<em><b>Number of Loses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__NUMBER_OF_LOSES = 7;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__RANK = 8;

	/**
	 * The feature id for the '<em><b>Stats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__STATS = 9;

	/**
	 * The number of structural features of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link a1.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see a1.impl.PersonImpl
	 * @see a1.impl.A1PackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__SURNAME = 1;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BIRTHDATE = 2;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__AGE = 3;

	/**
	 * The feature id for the '<em><b>Actual Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ACTUAL_TEAM = 4;

	/**
	 * The feature id for the '<em><b>Past Team</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PAST_TEAM = 5;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link a1.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see a1.impl.PlayerImpl
	 * @see a1.impl.A1PackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__SURNAME = PERSON__SURNAME;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__BIRTHDATE = PERSON__BIRTHDATE;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__AGE = PERSON__AGE;

	/**
	 * The feature id for the '<em><b>Actual Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__ACTUAL_TEAM = PERSON__ACTUAL_TEAM;

	/**
	 * The feature id for the '<em><b>Past Team</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__PAST_TEAM = PERSON__PAST_TEAM;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__POSITION = PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NUMBER = PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__HEIGHT = PERSON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__WEIGHT = PERSON_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Stats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__STATS = PERSON_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = PERSON_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link a1.impl.CoachImpl <em>Coach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see a1.impl.CoachImpl
	 * @see a1.impl.A1PackageImpl#getCoach()
	 * @generated
	 */
	int COACH = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH__NAME = PERSON__NAME;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH__SURNAME = PERSON__SURNAME;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH__BIRTHDATE = PERSON__BIRTHDATE;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH__AGE = PERSON__AGE;

	/**
	 * The feature id for the '<em><b>Actual Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH__ACTUAL_TEAM = PERSON__ACTUAL_TEAM;

	/**
	 * The feature id for the '<em><b>Past Team</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH__PAST_TEAM = PERSON__PAST_TEAM;

	/**
	 * The feature id for the '<em><b>Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH__EXPERIENCE = PERSON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH_FEATURE_COUNT = PERSON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Coach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COACH_OPERATION_COUNT = PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link a1.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see a1.impl.MatchImpl
	 * @see a1.impl.A1PackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 4;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__DATE = 0;

	/**
	 * The feature id for the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__HOUR = 1;

	/**
	 * The feature id for the '<em><b>Stadium</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__STADIUM = 2;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__TEAM = 3;

	/**
	 * The feature id for the '<em><b>Winner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__WINNER = 4;

	/**
	 * The feature id for the '<em><b>Looser</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__LOOSER = 5;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link a1.impl.StatsImpl <em>Stats</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see a1.impl.StatsImpl
	 * @see a1.impl.A1PackageImpl#getStats()
	 * @generated
	 */
	int STATS = 5;

	/**
	 * The feature id for the '<em><b>Points Per Game</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS__POINTS_PER_GAME = 0;

	/**
	 * The feature id for the '<em><b>Rebounds Per Game</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS__REBOUNDS_PER_GAME = 1;

	/**
	 * The feature id for the '<em><b>Assists Per Game</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS__ASSISTS_PER_GAME = 2;

	/**
	 * The feature id for the '<em><b>Blocks Per Game</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS__BLOCKS_PER_GAME = 3;

	/**
	 * The feature id for the '<em><b>Steals Per Game</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS__STEALS_PER_GAME = 4;

	/**
	 * The feature id for the '<em><b>Filed Goal Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS__FILED_GOAL_PERCENTAGE = 5;

	/**
	 * The feature id for the '<em><b>Three Pointers Made</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS__THREE_POINTERS_MADE = 6;

	/**
	 * The feature id for the '<em><b>Three Point Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS__THREE_POINT_PERCENTAGE = 7;

	/**
	 * The number of structural features of the '<em>Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link a1.impl.ChampionshipImpl <em>Championship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see a1.impl.ChampionshipImpl
	 * @see a1.impl.A1PackageImpl#getChampionship()
	 * @generated
	 */
	int CHAMPIONSHIP = 6;

	/**
	 * The feature id for the '<em><b>Season Years</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMPIONSHIP__SEASON_YEARS = 0;

	/**
	 * The feature id for the '<em><b>Team</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMPIONSHIP__TEAM = 1;

	/**
	 * The feature id for the '<em><b>Matchs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMPIONSHIP__MATCHS = 2;

	/**
	 * The number of structural features of the '<em>Championship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMPIONSHIP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Championship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAMPIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link a1.impl.StadiumImpl <em>Stadium</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see a1.impl.StadiumImpl
	 * @see a1.impl.A1PackageImpl#getStadium()
	 * @generated
	 */
	int STADIUM = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADIUM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADIUM__CAPACITY = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADIUM__ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADIUM__TEAM = 3;

	/**
	 * The number of structural features of the '<em>Stadium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADIUM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Stadium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STADIUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link a1.Position <em>Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see a1.Position
	 * @see a1.impl.A1PackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 8;

	/**
	 * The meta object id for the '{@link a1.Conference <em>Conference</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see a1.Conference
	 * @see a1.impl.A1PackageImpl#getConference()
	 * @generated
	 */
	int CONFERENCE = 9;

	/**
	 * The meta object id for the '<em>Local Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.LocalDate
	 * @see a1.impl.A1PackageImpl#getLocalDate()
	 * @generated
	 */
	int LOCAL_DATE = 10;


	/**
	 * Returns the meta object for class '{@link a1.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team</em>'.
	 * @see a1.Team
	 * @generated
	 */
	EClass getTeam();

	/**
	 * Returns the meta object for the attribute '{@link a1.Team#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see a1.Team#getName()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Name();

	/**
	 * Returns the meta object for the attribute '{@link a1.Team#getCity_Name <em>City Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City Name</em>'.
	 * @see a1.Team#getCity_Name()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_City_Name();

	/**
	 * Returns the meta object for the containment reference '{@link a1.Team#getStadium <em>Stadium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stadium</em>'.
	 * @see a1.Team#getStadium()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Stadium();

	/**
	 * Returns the meta object for the attribute '{@link a1.Team#getConference <em>Conference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conference</em>'.
	 * @see a1.Team#getConference()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Conference();

	/**
	 * Returns the meta object for the containment reference list '{@link a1.Team#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Players</em>'.
	 * @see a1.Team#getPlayers()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Players();

	/**
	 * Returns the meta object for the containment reference '{@link a1.Team#getCoach <em>Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coach</em>'.
	 * @see a1.Team#getCoach()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Coach();

	/**
	 * Returns the meta object for the attribute '{@link a1.Team#getNumber_of_victories <em>Number of victories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number of victories</em>'.
	 * @see a1.Team#getNumber_of_victories()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Number_of_victories();

	/**
	 * Returns the meta object for the attribute '{@link a1.Team#getNumber_of_Loses <em>Number of Loses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number of Loses</em>'.
	 * @see a1.Team#getNumber_of_Loses()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Number_of_Loses();

	/**
	 * Returns the meta object for the attribute '{@link a1.Team#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see a1.Team#getRank()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Rank();

	/**
	 * Returns the meta object for the containment reference '{@link a1.Team#getStats <em>Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stats</em>'.
	 * @see a1.Team#getStats()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Stats();

	/**
	 * Returns the meta object for class '{@link a1.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see a1.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link a1.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see a1.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link a1.Person#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surname</em>'.
	 * @see a1.Person#getSurname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Surname();

	/**
	 * Returns the meta object for the attribute '{@link a1.Person#getBirthdate <em>Birthdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birthdate</em>'.
	 * @see a1.Person#getBirthdate()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Birthdate();

	/**
	 * Returns the meta object for the attribute '{@link a1.Person#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see a1.Person#getAge()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Age();

	/**
	 * Returns the meta object for the reference '{@link a1.Person#getActual_Team <em>Actual Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actual Team</em>'.
	 * @see a1.Person#getActual_Team()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Actual_Team();

	/**
	 * Returns the meta object for the reference list '{@link a1.Person#getPast_Team <em>Past Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Past Team</em>'.
	 * @see a1.Person#getPast_Team()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Past_Team();

	/**
	 * Returns the meta object for class '{@link a1.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see a1.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the attribute '{@link a1.Player#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see a1.Player#getPosition()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Position();

	/**
	 * Returns the meta object for the attribute '{@link a1.Player#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see a1.Player#getNumber()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Number();

	/**
	 * Returns the meta object for the attribute '{@link a1.Player#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see a1.Player#getHeight()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Height();

	/**
	 * Returns the meta object for the attribute '{@link a1.Player#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see a1.Player#getWeight()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Weight();

	/**
	 * Returns the meta object for the containment reference '{@link a1.Player#getStats <em>Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stats</em>'.
	 * @see a1.Player#getStats()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Stats();

	/**
	 * Returns the meta object for class '{@link a1.Coach <em>Coach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coach</em>'.
	 * @see a1.Coach
	 * @generated
	 */
	EClass getCoach();

	/**
	 * Returns the meta object for the attribute '{@link a1.Coach#getExperience <em>Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Experience</em>'.
	 * @see a1.Coach#getExperience()
	 * @see #getCoach()
	 * @generated
	 */
	EAttribute getCoach_Experience();

	/**
	 * Returns the meta object for class '{@link a1.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see a1.Match
	 * @generated
	 */
	EClass getMatch();

	/**
	 * Returns the meta object for the attribute '{@link a1.Match#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see a1.Match#getDate()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Date();

	/**
	 * Returns the meta object for the attribute '{@link a1.Match#getHour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hour</em>'.
	 * @see a1.Match#getHour()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Hour();

	/**
	 * Returns the meta object for the attribute '{@link a1.Match#getStadium <em>Stadium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stadium</em>'.
	 * @see a1.Match#getStadium()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Stadium();

	/**
	 * Returns the meta object for the reference list '{@link a1.Match#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Team</em>'.
	 * @see a1.Match#getTeam()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Team();

	/**
	 * Returns the meta object for the reference '{@link a1.Match#getWinner <em>Winner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Winner</em>'.
	 * @see a1.Match#getWinner()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Winner();

	/**
	 * Returns the meta object for the reference '{@link a1.Match#getLooser <em>Looser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Looser</em>'.
	 * @see a1.Match#getLooser()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Looser();

	/**
	 * Returns the meta object for class '{@link a1.Stats <em>Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stats</em>'.
	 * @see a1.Stats
	 * @generated
	 */
	EClass getStats();

	/**
	 * Returns the meta object for the attribute '{@link a1.Stats#getPoints_Per_Game <em>Points Per Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points Per Game</em>'.
	 * @see a1.Stats#getPoints_Per_Game()
	 * @see #getStats()
	 * @generated
	 */
	EAttribute getStats_Points_Per_Game();

	/**
	 * Returns the meta object for the attribute '{@link a1.Stats#getRebounds_Per_Game <em>Rebounds Per Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rebounds Per Game</em>'.
	 * @see a1.Stats#getRebounds_Per_Game()
	 * @see #getStats()
	 * @generated
	 */
	EAttribute getStats_Rebounds_Per_Game();

	/**
	 * Returns the meta object for the attribute '{@link a1.Stats#getAssists_Per_Game <em>Assists Per Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assists Per Game</em>'.
	 * @see a1.Stats#getAssists_Per_Game()
	 * @see #getStats()
	 * @generated
	 */
	EAttribute getStats_Assists_Per_Game();

	/**
	 * Returns the meta object for the attribute '{@link a1.Stats#getBlocks_Per_Game <em>Blocks Per Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocks Per Game</em>'.
	 * @see a1.Stats#getBlocks_Per_Game()
	 * @see #getStats()
	 * @generated
	 */
	EAttribute getStats_Blocks_Per_Game();

	/**
	 * Returns the meta object for the attribute '{@link a1.Stats#getSteals_Per_Game <em>Steals Per Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Steals Per Game</em>'.
	 * @see a1.Stats#getSteals_Per_Game()
	 * @see #getStats()
	 * @generated
	 */
	EAttribute getStats_Steals_Per_Game();

	/**
	 * Returns the meta object for the attribute '{@link a1.Stats#getFiled_Goal_Percentage <em>Filed Goal Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filed Goal Percentage</em>'.
	 * @see a1.Stats#getFiled_Goal_Percentage()
	 * @see #getStats()
	 * @generated
	 */
	EAttribute getStats_Filed_Goal_Percentage();

	/**
	 * Returns the meta object for the attribute '{@link a1.Stats#getThree_Pointers_Made <em>Three Pointers Made</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Three Pointers Made</em>'.
	 * @see a1.Stats#getThree_Pointers_Made()
	 * @see #getStats()
	 * @generated
	 */
	EAttribute getStats_Three_Pointers_Made();

	/**
	 * Returns the meta object for the attribute '{@link a1.Stats#getThree_Point_Percentage <em>Three Point Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Three Point Percentage</em>'.
	 * @see a1.Stats#getThree_Point_Percentage()
	 * @see #getStats()
	 * @generated
	 */
	EAttribute getStats_Three_Point_Percentage();

	/**
	 * Returns the meta object for class '{@link a1.Championship <em>Championship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Championship</em>'.
	 * @see a1.Championship
	 * @generated
	 */
	EClass getChampionship();

	/**
	 * Returns the meta object for the attribute '{@link a1.Championship#getSeason_Years <em>Season Years</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Season Years</em>'.
	 * @see a1.Championship#getSeason_Years()
	 * @see #getChampionship()
	 * @generated
	 */
	EAttribute getChampionship_Season_Years();

	/**
	 * Returns the meta object for the containment reference list '{@link a1.Championship#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Team</em>'.
	 * @see a1.Championship#getTeam()
	 * @see #getChampionship()
	 * @generated
	 */
	EReference getChampionship_Team();

	/**
	 * Returns the meta object for the containment reference list '{@link a1.Championship#getMatchs <em>Matchs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matchs</em>'.
	 * @see a1.Championship#getMatchs()
	 * @see #getChampionship()
	 * @generated
	 */
	EReference getChampionship_Matchs();

	/**
	 * Returns the meta object for class '{@link a1.Stadium <em>Stadium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stadium</em>'.
	 * @see a1.Stadium
	 * @generated
	 */
	EClass getStadium();

	/**
	 * Returns the meta object for the attribute '{@link a1.Stadium#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see a1.Stadium#getName()
	 * @see #getStadium()
	 * @generated
	 */
	EAttribute getStadium_Name();

	/**
	 * Returns the meta object for the attribute '{@link a1.Stadium#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see a1.Stadium#getCapacity()
	 * @see #getStadium()
	 * @generated
	 */
	EAttribute getStadium_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link a1.Stadium#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see a1.Stadium#getAddress()
	 * @see #getStadium()
	 * @generated
	 */
	EAttribute getStadium_Address();

	/**
	 * Returns the meta object for the reference '{@link a1.Stadium#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Team</em>'.
	 * @see a1.Stadium#getTeam()
	 * @see #getStadium()
	 * @generated
	 */
	EReference getStadium_Team();

	/**
	 * Returns the meta object for enum '{@link a1.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Position</em>'.
	 * @see a1.Position
	 * @generated
	 */
	EEnum getPosition();

	/**
	 * Returns the meta object for enum '{@link a1.Conference <em>Conference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conference</em>'.
	 * @see a1.Conference
	 * @generated
	 */
	EEnum getConference();

	/**
	 * Returns the meta object for data type '{@link java.time.LocalDate <em>Local Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Local Date</em>'.
	 * @see java.time.LocalDate
	 * @model instanceClass="java.time.LocalDate"
	 * @generated
	 */
	EDataType getLocalDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	A1Factory getA1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link a1.impl.TeamImpl <em>Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see a1.impl.TeamImpl
		 * @see a1.impl.A1PackageImpl#getTeam()
		 * @generated
		 */
		EClass TEAM = eINSTANCE.getTeam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__NAME = eINSTANCE.getTeam_Name();

		/**
		 * The meta object literal for the '<em><b>City Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__CITY_NAME = eINSTANCE.getTeam_City_Name();

		/**
		 * The meta object literal for the '<em><b>Stadium</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__STADIUM = eINSTANCE.getTeam_Stadium();

		/**
		 * The meta object literal for the '<em><b>Conference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__CONFERENCE = eINSTANCE.getTeam_Conference();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__PLAYERS = eINSTANCE.getTeam_Players();

		/**
		 * The meta object literal for the '<em><b>Coach</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__COACH = eINSTANCE.getTeam_Coach();

		/**
		 * The meta object literal for the '<em><b>Number of victories</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__NUMBER_OF_VICTORIES = eINSTANCE.getTeam_Number_of_victories();

		/**
		 * The meta object literal for the '<em><b>Number of Loses</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__NUMBER_OF_LOSES = eINSTANCE.getTeam_Number_of_Loses();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__RANK = eINSTANCE.getTeam_Rank();

		/**
		 * The meta object literal for the '<em><b>Stats</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__STATS = eINSTANCE.getTeam_Stats();

		/**
		 * The meta object literal for the '{@link a1.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see a1.impl.PersonImpl
		 * @see a1.impl.A1PackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Surname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__SURNAME = eINSTANCE.getPerson_Surname();

		/**
		 * The meta object literal for the '<em><b>Birthdate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__BIRTHDATE = eINSTANCE.getPerson_Birthdate();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__AGE = eINSTANCE.getPerson_Age();

		/**
		 * The meta object literal for the '<em><b>Actual Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ACTUAL_TEAM = eINSTANCE.getPerson_Actual_Team();

		/**
		 * The meta object literal for the '<em><b>Past Team</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__PAST_TEAM = eINSTANCE.getPerson_Past_Team();

		/**
		 * The meta object literal for the '{@link a1.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see a1.impl.PlayerImpl
		 * @see a1.impl.A1PackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__POSITION = eINSTANCE.getPlayer_Position();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__NUMBER = eINSTANCE.getPlayer_Number();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__HEIGHT = eINSTANCE.getPlayer_Height();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__WEIGHT = eINSTANCE.getPlayer_Weight();

		/**
		 * The meta object literal for the '<em><b>Stats</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__STATS = eINSTANCE.getPlayer_Stats();

		/**
		 * The meta object literal for the '{@link a1.impl.CoachImpl <em>Coach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see a1.impl.CoachImpl
		 * @see a1.impl.A1PackageImpl#getCoach()
		 * @generated
		 */
		EClass COACH = eINSTANCE.getCoach();

		/**
		 * The meta object literal for the '<em><b>Experience</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COACH__EXPERIENCE = eINSTANCE.getCoach_Experience();

		/**
		 * The meta object literal for the '{@link a1.impl.MatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see a1.impl.MatchImpl
		 * @see a1.impl.A1PackageImpl#getMatch()
		 * @generated
		 */
		EClass MATCH = eINSTANCE.getMatch();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__DATE = eINSTANCE.getMatch_Date();

		/**
		 * The meta object literal for the '<em><b>Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__HOUR = eINSTANCE.getMatch_Hour();

		/**
		 * The meta object literal for the '<em><b>Stadium</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__STADIUM = eINSTANCE.getMatch_Stadium();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__TEAM = eINSTANCE.getMatch_Team();

		/**
		 * The meta object literal for the '<em><b>Winner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__WINNER = eINSTANCE.getMatch_Winner();

		/**
		 * The meta object literal for the '<em><b>Looser</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__LOOSER = eINSTANCE.getMatch_Looser();

		/**
		 * The meta object literal for the '{@link a1.impl.StatsImpl <em>Stats</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see a1.impl.StatsImpl
		 * @see a1.impl.A1PackageImpl#getStats()
		 * @generated
		 */
		EClass STATS = eINSTANCE.getStats();

		/**
		 * The meta object literal for the '<em><b>Points Per Game</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATS__POINTS_PER_GAME = eINSTANCE.getStats_Points_Per_Game();

		/**
		 * The meta object literal for the '<em><b>Rebounds Per Game</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATS__REBOUNDS_PER_GAME = eINSTANCE.getStats_Rebounds_Per_Game();

		/**
		 * The meta object literal for the '<em><b>Assists Per Game</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATS__ASSISTS_PER_GAME = eINSTANCE.getStats_Assists_Per_Game();

		/**
		 * The meta object literal for the '<em><b>Blocks Per Game</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATS__BLOCKS_PER_GAME = eINSTANCE.getStats_Blocks_Per_Game();

		/**
		 * The meta object literal for the '<em><b>Steals Per Game</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATS__STEALS_PER_GAME = eINSTANCE.getStats_Steals_Per_Game();

		/**
		 * The meta object literal for the '<em><b>Filed Goal Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATS__FILED_GOAL_PERCENTAGE = eINSTANCE.getStats_Filed_Goal_Percentage();

		/**
		 * The meta object literal for the '<em><b>Three Pointers Made</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATS__THREE_POINTERS_MADE = eINSTANCE.getStats_Three_Pointers_Made();

		/**
		 * The meta object literal for the '<em><b>Three Point Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATS__THREE_POINT_PERCENTAGE = eINSTANCE.getStats_Three_Point_Percentage();

		/**
		 * The meta object literal for the '{@link a1.impl.ChampionshipImpl <em>Championship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see a1.impl.ChampionshipImpl
		 * @see a1.impl.A1PackageImpl#getChampionship()
		 * @generated
		 */
		EClass CHAMPIONSHIP = eINSTANCE.getChampionship();

		/**
		 * The meta object literal for the '<em><b>Season Years</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAMPIONSHIP__SEASON_YEARS = eINSTANCE.getChampionship_Season_Years();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAMPIONSHIP__TEAM = eINSTANCE.getChampionship_Team();

		/**
		 * The meta object literal for the '<em><b>Matchs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAMPIONSHIP__MATCHS = eINSTANCE.getChampionship_Matchs();

		/**
		 * The meta object literal for the '{@link a1.impl.StadiumImpl <em>Stadium</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see a1.impl.StadiumImpl
		 * @see a1.impl.A1PackageImpl#getStadium()
		 * @generated
		 */
		EClass STADIUM = eINSTANCE.getStadium();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STADIUM__NAME = eINSTANCE.getStadium_Name();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STADIUM__CAPACITY = eINSTANCE.getStadium_Capacity();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STADIUM__ADDRESS = eINSTANCE.getStadium_Address();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STADIUM__TEAM = eINSTANCE.getStadium_Team();

		/**
		 * The meta object literal for the '{@link a1.Position <em>Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see a1.Position
		 * @see a1.impl.A1PackageImpl#getPosition()
		 * @generated
		 */
		EEnum POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '{@link a1.Conference <em>Conference</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see a1.Conference
		 * @see a1.impl.A1PackageImpl#getConference()
		 * @generated
		 */
		EEnum CONFERENCE = eINSTANCE.getConference();

		/**
		 * The meta object literal for the '<em>Local Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.LocalDate
		 * @see a1.impl.A1PackageImpl#getLocalDate()
		 * @generated
		 */
		EDataType LOCAL_DATE = eINSTANCE.getLocalDate();

	}

} //A1Package
