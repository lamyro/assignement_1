/**
 */
package a1.impl;

import a1.A1Package;
import a1.Coach;
import a1.Conference;
import a1.Player;
import a1.Stadium;
import a1.Stats;
import a1.Team;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link a1.impl.TeamImpl#getName <em>Name</em>}</li>
 *   <li>{@link a1.impl.TeamImpl#getCity_Name <em>City Name</em>}</li>
 *   <li>{@link a1.impl.TeamImpl#getStadium <em>Stadium</em>}</li>
 *   <li>{@link a1.impl.TeamImpl#getConference <em>Conference</em>}</li>
 *   <li>{@link a1.impl.TeamImpl#getPlayers <em>Players</em>}</li>
 *   <li>{@link a1.impl.TeamImpl#getCoach <em>Coach</em>}</li>
 *   <li>{@link a1.impl.TeamImpl#getNumber_of_victories <em>Number of victories</em>}</li>
 *   <li>{@link a1.impl.TeamImpl#getNumber_of_Loses <em>Number of Loses</em>}</li>
 *   <li>{@link a1.impl.TeamImpl#getRank <em>Rank</em>}</li>
 *   <li>{@link a1.impl.TeamImpl#getStats <em>Stats</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeamImpl extends MinimalEObjectImpl.Container implements Team {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity_Name() <em>City Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity_Name()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity_Name() <em>City Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity_Name()
	 * @generated
	 * @ordered
	 */
	protected String city_Name = CITY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStadium() <em>Stadium</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStadium()
	 * @generated
	 * @ordered
	 */
	protected Stadium stadium;

	/**
	 * The default value of the '{@link #getConference() <em>Conference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConference()
	 * @generated
	 * @ordered
	 */
	protected static final Conference CONFERENCE_EDEFAULT = Conference.WEST;

	/**
	 * The cached value of the '{@link #getConference() <em>Conference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConference()
	 * @generated
	 * @ordered
	 */
	protected Conference conference = CONFERENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlayers() <em>Players</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> players;

	/**
	 * The cached value of the '{@link #getCoach() <em>Coach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoach()
	 * @generated
	 * @ordered
	 */
	protected Coach coach;

	/**
	 * The default value of the '{@link #getNumber_of_victories() <em>Number of victories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber_of_victories()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_VICTORIES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber_of_victories() <em>Number of victories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber_of_victories()
	 * @generated
	 * @ordered
	 */
	protected int number_of_victories = NUMBER_OF_VICTORIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber_of_Loses() <em>Number of Loses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber_of_Loses()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_LOSES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber_of_Loses() <em>Number of Loses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber_of_Loses()
	 * @generated
	 * @ordered
	 */
	protected int number_of_Loses = NUMBER_OF_LOSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected static final int RANK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected int rank = RANK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStats() <em>Stats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStats()
	 * @generated
	 * @ordered
	 */
	protected Stats stats;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A1Package.Literals.TEAM;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.TEAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity_Name() {
		return city_Name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity_Name(String newCity_Name) {
		String oldCity_Name = city_Name;
		city_Name = newCity_Name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.TEAM__CITY_NAME, oldCity_Name, city_Name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stadium getStadium() {
		return stadium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStadium(Stadium newStadium, NotificationChain msgs) {
		Stadium oldStadium = stadium;
		stadium = newStadium;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, A1Package.TEAM__STADIUM, oldStadium, newStadium);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStadium(Stadium newStadium) {
		if (newStadium != stadium) {
			NotificationChain msgs = null;
			if (stadium != null)
				msgs = ((InternalEObject)stadium).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - A1Package.TEAM__STADIUM, null, msgs);
			if (newStadium != null)
				msgs = ((InternalEObject)newStadium).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - A1Package.TEAM__STADIUM, null, msgs);
			msgs = basicSetStadium(newStadium, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.TEAM__STADIUM, newStadium, newStadium));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conference getConference() {
		return conference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConference(Conference newConference) {
		Conference oldConference = conference;
		conference = newConference == null ? CONFERENCE_EDEFAULT : newConference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.TEAM__CONFERENCE, oldConference, conference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Player> getPlayers() {
		if (players == null) {
			players = new EObjectContainmentEList<Player>(Player.class, this, A1Package.TEAM__PLAYERS);
		}
		return players;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coach getCoach() {
		return coach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoach(Coach newCoach, NotificationChain msgs) {
		Coach oldCoach = coach;
		coach = newCoach;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, A1Package.TEAM__COACH, oldCoach, newCoach);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoach(Coach newCoach) {
		if (newCoach != coach) {
			NotificationChain msgs = null;
			if (coach != null)
				msgs = ((InternalEObject)coach).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - A1Package.TEAM__COACH, null, msgs);
			if (newCoach != null)
				msgs = ((InternalEObject)newCoach).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - A1Package.TEAM__COACH, null, msgs);
			msgs = basicSetCoach(newCoach, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.TEAM__COACH, newCoach, newCoach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber_of_victories() {
		return number_of_victories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber_of_victories(int newNumber_of_victories) {
		int oldNumber_of_victories = number_of_victories;
		number_of_victories = newNumber_of_victories;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.TEAM__NUMBER_OF_VICTORIES, oldNumber_of_victories, number_of_victories));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber_of_Loses() {
		return number_of_Loses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber_of_Loses(int newNumber_of_Loses) {
		int oldNumber_of_Loses = number_of_Loses;
		number_of_Loses = newNumber_of_Loses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.TEAM__NUMBER_OF_LOSES, oldNumber_of_Loses, number_of_Loses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRank(int newRank) {
		int oldRank = rank;
		rank = newRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.TEAM__RANK, oldRank, rank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStats(Stats newStats, NotificationChain msgs) {
		Stats oldStats = stats;
		stats = newStats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, A1Package.TEAM__STATS, oldStats, newStats);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStats(Stats newStats) {
		if (newStats != stats) {
			NotificationChain msgs = null;
			if (stats != null)
				msgs = ((InternalEObject)stats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - A1Package.TEAM__STATS, null, msgs);
			if (newStats != null)
				msgs = ((InternalEObject)newStats).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - A1Package.TEAM__STATS, null, msgs);
			msgs = basicSetStats(newStats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.TEAM__STATS, newStats, newStats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A1Package.TEAM__STADIUM:
				return basicSetStadium(null, msgs);
			case A1Package.TEAM__PLAYERS:
				return ((InternalEList<?>)getPlayers()).basicRemove(otherEnd, msgs);
			case A1Package.TEAM__COACH:
				return basicSetCoach(null, msgs);
			case A1Package.TEAM__STATS:
				return basicSetStats(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case A1Package.TEAM__NAME:
				return getName();
			case A1Package.TEAM__CITY_NAME:
				return getCity_Name();
			case A1Package.TEAM__STADIUM:
				return getStadium();
			case A1Package.TEAM__CONFERENCE:
				return getConference();
			case A1Package.TEAM__PLAYERS:
				return getPlayers();
			case A1Package.TEAM__COACH:
				return getCoach();
			case A1Package.TEAM__NUMBER_OF_VICTORIES:
				return getNumber_of_victories();
			case A1Package.TEAM__NUMBER_OF_LOSES:
				return getNumber_of_Loses();
			case A1Package.TEAM__RANK:
				return getRank();
			case A1Package.TEAM__STATS:
				return getStats();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case A1Package.TEAM__NAME:
				setName((String)newValue);
				return;
			case A1Package.TEAM__CITY_NAME:
				setCity_Name((String)newValue);
				return;
			case A1Package.TEAM__STADIUM:
				setStadium((Stadium)newValue);
				return;
			case A1Package.TEAM__CONFERENCE:
				setConference((Conference)newValue);
				return;
			case A1Package.TEAM__PLAYERS:
				getPlayers().clear();
				getPlayers().addAll((Collection<? extends Player>)newValue);
				return;
			case A1Package.TEAM__COACH:
				setCoach((Coach)newValue);
				return;
			case A1Package.TEAM__NUMBER_OF_VICTORIES:
				setNumber_of_victories((Integer)newValue);
				return;
			case A1Package.TEAM__NUMBER_OF_LOSES:
				setNumber_of_Loses((Integer)newValue);
				return;
			case A1Package.TEAM__RANK:
				setRank((Integer)newValue);
				return;
			case A1Package.TEAM__STATS:
				setStats((Stats)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case A1Package.TEAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case A1Package.TEAM__CITY_NAME:
				setCity_Name(CITY_NAME_EDEFAULT);
				return;
			case A1Package.TEAM__STADIUM:
				setStadium((Stadium)null);
				return;
			case A1Package.TEAM__CONFERENCE:
				setConference(CONFERENCE_EDEFAULT);
				return;
			case A1Package.TEAM__PLAYERS:
				getPlayers().clear();
				return;
			case A1Package.TEAM__COACH:
				setCoach((Coach)null);
				return;
			case A1Package.TEAM__NUMBER_OF_VICTORIES:
				setNumber_of_victories(NUMBER_OF_VICTORIES_EDEFAULT);
				return;
			case A1Package.TEAM__NUMBER_OF_LOSES:
				setNumber_of_Loses(NUMBER_OF_LOSES_EDEFAULT);
				return;
			case A1Package.TEAM__RANK:
				setRank(RANK_EDEFAULT);
				return;
			case A1Package.TEAM__STATS:
				setStats((Stats)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case A1Package.TEAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case A1Package.TEAM__CITY_NAME:
				return CITY_NAME_EDEFAULT == null ? city_Name != null : !CITY_NAME_EDEFAULT.equals(city_Name);
			case A1Package.TEAM__STADIUM:
				return stadium != null;
			case A1Package.TEAM__CONFERENCE:
				return conference != CONFERENCE_EDEFAULT;
			case A1Package.TEAM__PLAYERS:
				return players != null && !players.isEmpty();
			case A1Package.TEAM__COACH:
				return coach != null;
			case A1Package.TEAM__NUMBER_OF_VICTORIES:
				return number_of_victories != NUMBER_OF_VICTORIES_EDEFAULT;
			case A1Package.TEAM__NUMBER_OF_LOSES:
				return number_of_Loses != NUMBER_OF_LOSES_EDEFAULT;
			case A1Package.TEAM__RANK:
				return rank != RANK_EDEFAULT;
			case A1Package.TEAM__STATS:
				return stats != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", City_Name: ");
		result.append(city_Name);
		result.append(", Conference: ");
		result.append(conference);
		result.append(", Number_of_victories: ");
		result.append(number_of_victories);
		result.append(", Number_of_Loses: ");
		result.append(number_of_Loses);
		result.append(", Rank: ");
		result.append(rank);
		result.append(')');
		return result.toString();
	}

} //TeamImpl
