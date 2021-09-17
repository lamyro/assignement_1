/**
 */
package a1.impl;

import a1.A1Package;
import a1.Match;
import a1.Team;

import java.time.LocalDate;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link a1.impl.MatchImpl#getDate <em>Date</em>}</li>
 *   <li>{@link a1.impl.MatchImpl#getHour <em>Hour</em>}</li>
 *   <li>{@link a1.impl.MatchImpl#getStadium <em>Stadium</em>}</li>
 *   <li>{@link a1.impl.MatchImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link a1.impl.MatchImpl#getWinner <em>Winner</em>}</li>
 *   <li>{@link a1.impl.MatchImpl#getLooser <em>Looser</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchImpl extends MinimalEObjectImpl.Container implements Match {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final LocalDate DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected LocalDate date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected static final String HOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected String hour = HOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getStadium() <em>Stadium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStadium()
	 * @generated
	 * @ordered
	 */
	protected static final String STADIUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStadium() <em>Stadium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStadium()
	 * @generated
	 * @ordered
	 */
	protected String stadium = STADIUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTeam() <em>Team</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeam()
	 * @generated
	 * @ordered
	 */
	protected EList<Team> team;

	/**
	 * The cached value of the '{@link #getWinner() <em>Winner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinner()
	 * @generated
	 * @ordered
	 */
	protected Team winner;

	/**
	 * The cached value of the '{@link #getLooser() <em>Looser</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLooser()
	 * @generated
	 * @ordered
	 */
	protected Team looser;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A1Package.Literals.MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(LocalDate newDate) {
		LocalDate oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.MATCH__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHour() {
		return hour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHour(String newHour) {
		String oldHour = hour;
		hour = newHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.MATCH__HOUR, oldHour, hour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStadium() {
		return stadium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStadium(String newStadium) {
		String oldStadium = stadium;
		stadium = newStadium;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.MATCH__STADIUM, oldStadium, stadium));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Team> getTeam() {
		if (team == null) {
			team = new EObjectResolvingEList<Team>(Team.class, this, A1Package.MATCH__TEAM);
		}
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getWinner() {
		if (winner != null && winner.eIsProxy()) {
			InternalEObject oldWinner = (InternalEObject)winner;
			winner = (Team)eResolveProxy(oldWinner);
			if (winner != oldWinner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, A1Package.MATCH__WINNER, oldWinner, winner));
			}
		}
		return winner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetWinner() {
		return winner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWinner(Team newWinner) {
		Team oldWinner = winner;
		winner = newWinner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.MATCH__WINNER, oldWinner, winner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getLooser() {
		if (looser != null && looser.eIsProxy()) {
			InternalEObject oldLooser = (InternalEObject)looser;
			looser = (Team)eResolveProxy(oldLooser);
			if (looser != oldLooser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, A1Package.MATCH__LOOSER, oldLooser, looser));
			}
		}
		return looser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetLooser() {
		return looser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLooser(Team newLooser) {
		Team oldLooser = looser;
		looser = newLooser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.MATCH__LOOSER, oldLooser, looser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case A1Package.MATCH__DATE:
				return getDate();
			case A1Package.MATCH__HOUR:
				return getHour();
			case A1Package.MATCH__STADIUM:
				return getStadium();
			case A1Package.MATCH__TEAM:
				return getTeam();
			case A1Package.MATCH__WINNER:
				if (resolve) return getWinner();
				return basicGetWinner();
			case A1Package.MATCH__LOOSER:
				if (resolve) return getLooser();
				return basicGetLooser();
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
			case A1Package.MATCH__DATE:
				setDate((LocalDate)newValue);
				return;
			case A1Package.MATCH__HOUR:
				setHour((String)newValue);
				return;
			case A1Package.MATCH__STADIUM:
				setStadium((String)newValue);
				return;
			case A1Package.MATCH__TEAM:
				getTeam().clear();
				getTeam().addAll((Collection<? extends Team>)newValue);
				return;
			case A1Package.MATCH__WINNER:
				setWinner((Team)newValue);
				return;
			case A1Package.MATCH__LOOSER:
				setLooser((Team)newValue);
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
			case A1Package.MATCH__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case A1Package.MATCH__HOUR:
				setHour(HOUR_EDEFAULT);
				return;
			case A1Package.MATCH__STADIUM:
				setStadium(STADIUM_EDEFAULT);
				return;
			case A1Package.MATCH__TEAM:
				getTeam().clear();
				return;
			case A1Package.MATCH__WINNER:
				setWinner((Team)null);
				return;
			case A1Package.MATCH__LOOSER:
				setLooser((Team)null);
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
			case A1Package.MATCH__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case A1Package.MATCH__HOUR:
				return HOUR_EDEFAULT == null ? hour != null : !HOUR_EDEFAULT.equals(hour);
			case A1Package.MATCH__STADIUM:
				return STADIUM_EDEFAULT == null ? stadium != null : !STADIUM_EDEFAULT.equals(stadium);
			case A1Package.MATCH__TEAM:
				return team != null && !team.isEmpty();
			case A1Package.MATCH__WINNER:
				return winner != null;
			case A1Package.MATCH__LOOSER:
				return looser != null;
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
		result.append(" (Date: ");
		result.append(date);
		result.append(", Hour: ");
		result.append(hour);
		result.append(", Stadium: ");
		result.append(stadium);
		result.append(')');
		return result.toString();
	}

} //MatchImpl
