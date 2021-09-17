/**
 */
package a1.impl;

import a1.A1Package;
import a1.Championship;
import a1.Match;
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
 * An implementation of the model object '<em><b>Championship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link a1.impl.ChampionshipImpl#getSeason_Years <em>Season Years</em>}</li>
 *   <li>{@link a1.impl.ChampionshipImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link a1.impl.ChampionshipImpl#getMatchs <em>Matchs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChampionshipImpl extends MinimalEObjectImpl.Container implements Championship {
	/**
	 * The default value of the '{@link #getSeason_Years() <em>Season Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason_Years()
	 * @generated
	 * @ordered
	 */
	protected static final String SEASON_YEARS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeason_Years() <em>Season Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason_Years()
	 * @generated
	 * @ordered
	 */
	protected String season_Years = SEASON_YEARS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTeam() <em>Team</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeam()
	 * @generated
	 * @ordered
	 */
	protected EList<Team> team;

	/**
	 * The cached value of the '{@link #getMatchs() <em>Matchs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchs()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> matchs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChampionshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A1Package.Literals.CHAMPIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeason_Years() {
		return season_Years;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeason_Years(String newSeason_Years) {
		String oldSeason_Years = season_Years;
		season_Years = newSeason_Years;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.CHAMPIONSHIP__SEASON_YEARS, oldSeason_Years, season_Years));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Team> getTeam() {
		if (team == null) {
			team = new EObjectContainmentEList<Team>(Team.class, this, A1Package.CHAMPIONSHIP__TEAM);
		}
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Match> getMatchs() {
		if (matchs == null) {
			matchs = new EObjectContainmentEList<Match>(Match.class, this, A1Package.CHAMPIONSHIP__MATCHS);
		}
		return matchs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case A1Package.CHAMPIONSHIP__TEAM:
				return ((InternalEList<?>)getTeam()).basicRemove(otherEnd, msgs);
			case A1Package.CHAMPIONSHIP__MATCHS:
				return ((InternalEList<?>)getMatchs()).basicRemove(otherEnd, msgs);
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
			case A1Package.CHAMPIONSHIP__SEASON_YEARS:
				return getSeason_Years();
			case A1Package.CHAMPIONSHIP__TEAM:
				return getTeam();
			case A1Package.CHAMPIONSHIP__MATCHS:
				return getMatchs();
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
			case A1Package.CHAMPIONSHIP__SEASON_YEARS:
				setSeason_Years((String)newValue);
				return;
			case A1Package.CHAMPIONSHIP__TEAM:
				getTeam().clear();
				getTeam().addAll((Collection<? extends Team>)newValue);
				return;
			case A1Package.CHAMPIONSHIP__MATCHS:
				getMatchs().clear();
				getMatchs().addAll((Collection<? extends Match>)newValue);
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
			case A1Package.CHAMPIONSHIP__SEASON_YEARS:
				setSeason_Years(SEASON_YEARS_EDEFAULT);
				return;
			case A1Package.CHAMPIONSHIP__TEAM:
				getTeam().clear();
				return;
			case A1Package.CHAMPIONSHIP__MATCHS:
				getMatchs().clear();
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
			case A1Package.CHAMPIONSHIP__SEASON_YEARS:
				return SEASON_YEARS_EDEFAULT == null ? season_Years != null : !SEASON_YEARS_EDEFAULT.equals(season_Years);
			case A1Package.CHAMPIONSHIP__TEAM:
				return team != null && !team.isEmpty();
			case A1Package.CHAMPIONSHIP__MATCHS:
				return matchs != null && !matchs.isEmpty();
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
		result.append(" (Season_Years: ");
		result.append(season_Years);
		result.append(')');
		return result.toString();
	}

} //ChampionshipImpl
