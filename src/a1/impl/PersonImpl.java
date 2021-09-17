/**
 */
package a1.impl;

import a1.A1Package;
import a1.Person;
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
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link a1.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link a1.impl.PersonImpl#getSurname <em>Surname</em>}</li>
 *   <li>{@link a1.impl.PersonImpl#getBirthdate <em>Birthdate</em>}</li>
 *   <li>{@link a1.impl.PersonImpl#getAge <em>Age</em>}</li>
 *   <li>{@link a1.impl.PersonImpl#getActual_Team <em>Actual Team</em>}</li>
 *   <li>{@link a1.impl.PersonImpl#getPast_Team <em>Past Team</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PersonImpl extends MinimalEObjectImpl.Container implements Person {
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
	 * The default value of the '{@link #getSurname() <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected static final String SURNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurname() <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected String surname = SURNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBirthdate() <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthdate()
	 * @generated
	 * @ordered
	 */
	protected static final LocalDate BIRTHDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBirthdate() <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthdate()
	 * @generated
	 * @ordered
	 */
	protected LocalDate birthdate = BIRTHDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActual_Team() <em>Actual Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActual_Team()
	 * @generated
	 * @ordered
	 */
	protected Team actual_Team;

	/**
	 * The cached value of the '{@link #getPast_Team() <em>Past Team</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPast_Team()
	 * @generated
	 * @ordered
	 */
	protected EList<Team> past_Team;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A1Package.Literals.PERSON;
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
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurname(String newSurname) {
		String oldSurname = surname;
		surname = newSurname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.PERSON__SURNAME, oldSurname, surname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalDate getBirthdate() {
		return birthdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthdate(LocalDate newBirthdate) {
		LocalDate oldBirthdate = birthdate;
		birthdate = newBirthdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.PERSON__BIRTHDATE, oldBirthdate, birthdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.PERSON__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getActual_Team() {
		if (actual_Team != null && actual_Team.eIsProxy()) {
			InternalEObject oldActual_Team = (InternalEObject)actual_Team;
			actual_Team = (Team)eResolveProxy(oldActual_Team);
			if (actual_Team != oldActual_Team) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, A1Package.PERSON__ACTUAL_TEAM, oldActual_Team, actual_Team));
			}
		}
		return actual_Team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetActual_Team() {
		return actual_Team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActual_Team(Team newActual_Team) {
		Team oldActual_Team = actual_Team;
		actual_Team = newActual_Team;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.PERSON__ACTUAL_TEAM, oldActual_Team, actual_Team));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Team> getPast_Team() {
		if (past_Team == null) {
			past_Team = new EObjectResolvingEList<Team>(Team.class, this, A1Package.PERSON__PAST_TEAM);
		}
		return past_Team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case A1Package.PERSON__NAME:
				return getName();
			case A1Package.PERSON__SURNAME:
				return getSurname();
			case A1Package.PERSON__BIRTHDATE:
				return getBirthdate();
			case A1Package.PERSON__AGE:
				return getAge();
			case A1Package.PERSON__ACTUAL_TEAM:
				if (resolve) return getActual_Team();
				return basicGetActual_Team();
			case A1Package.PERSON__PAST_TEAM:
				return getPast_Team();
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
			case A1Package.PERSON__NAME:
				setName((String)newValue);
				return;
			case A1Package.PERSON__SURNAME:
				setSurname((String)newValue);
				return;
			case A1Package.PERSON__BIRTHDATE:
				setBirthdate((LocalDate)newValue);
				return;
			case A1Package.PERSON__AGE:
				setAge((Integer)newValue);
				return;
			case A1Package.PERSON__ACTUAL_TEAM:
				setActual_Team((Team)newValue);
				return;
			case A1Package.PERSON__PAST_TEAM:
				getPast_Team().clear();
				getPast_Team().addAll((Collection<? extends Team>)newValue);
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
			case A1Package.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case A1Package.PERSON__SURNAME:
				setSurname(SURNAME_EDEFAULT);
				return;
			case A1Package.PERSON__BIRTHDATE:
				setBirthdate(BIRTHDATE_EDEFAULT);
				return;
			case A1Package.PERSON__AGE:
				setAge(AGE_EDEFAULT);
				return;
			case A1Package.PERSON__ACTUAL_TEAM:
				setActual_Team((Team)null);
				return;
			case A1Package.PERSON__PAST_TEAM:
				getPast_Team().clear();
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
			case A1Package.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case A1Package.PERSON__SURNAME:
				return SURNAME_EDEFAULT == null ? surname != null : !SURNAME_EDEFAULT.equals(surname);
			case A1Package.PERSON__BIRTHDATE:
				return BIRTHDATE_EDEFAULT == null ? birthdate != null : !BIRTHDATE_EDEFAULT.equals(birthdate);
			case A1Package.PERSON__AGE:
				return age != AGE_EDEFAULT;
			case A1Package.PERSON__ACTUAL_TEAM:
				return actual_Team != null;
			case A1Package.PERSON__PAST_TEAM:
				return past_Team != null && !past_Team.isEmpty();
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
		result.append(", Surname: ");
		result.append(surname);
		result.append(", Birthdate: ");
		result.append(birthdate);
		result.append(", Age: ");
		result.append(age);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
