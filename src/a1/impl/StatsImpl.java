/**
 */
package a1.impl;

import a1.A1Package;
import a1.Stats;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link a1.impl.StatsImpl#getPoints_Per_Game <em>Points Per Game</em>}</li>
 *   <li>{@link a1.impl.StatsImpl#getRebounds_Per_Game <em>Rebounds Per Game</em>}</li>
 *   <li>{@link a1.impl.StatsImpl#getAssists_Per_Game <em>Assists Per Game</em>}</li>
 *   <li>{@link a1.impl.StatsImpl#getBlocks_Per_Game <em>Blocks Per Game</em>}</li>
 *   <li>{@link a1.impl.StatsImpl#getSteals_Per_Game <em>Steals Per Game</em>}</li>
 *   <li>{@link a1.impl.StatsImpl#getFiled_Goal_Percentage <em>Filed Goal Percentage</em>}</li>
 *   <li>{@link a1.impl.StatsImpl#getThree_Pointers_Made <em>Three Pointers Made</em>}</li>
 *   <li>{@link a1.impl.StatsImpl#getThree_Point_Percentage <em>Three Point Percentage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatsImpl extends MinimalEObjectImpl.Container implements Stats {
	/**
	 * The default value of the '{@link #getPoints_Per_Game() <em>Points Per Game</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints_Per_Game()
	 * @generated
	 * @ordered
	 */
	protected static final float POINTS_PER_GAME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPoints_Per_Game() <em>Points Per Game</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints_Per_Game()
	 * @generated
	 * @ordered
	 */
	protected float points_Per_Game = POINTS_PER_GAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRebounds_Per_Game() <em>Rebounds Per Game</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRebounds_Per_Game()
	 * @generated
	 * @ordered
	 */
	protected static final float REBOUNDS_PER_GAME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRebounds_Per_Game() <em>Rebounds Per Game</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRebounds_Per_Game()
	 * @generated
	 * @ordered
	 */
	protected float rebounds_Per_Game = REBOUNDS_PER_GAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssists_Per_Game() <em>Assists Per Game</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssists_Per_Game()
	 * @generated
	 * @ordered
	 */
	protected static final float ASSISTS_PER_GAME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAssists_Per_Game() <em>Assists Per Game</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssists_Per_Game()
	 * @generated
	 * @ordered
	 */
	protected float assists_Per_Game = ASSISTS_PER_GAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlocks_Per_Game() <em>Blocks Per Game</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocks_Per_Game()
	 * @generated
	 * @ordered
	 */
	protected static final float BLOCKS_PER_GAME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBlocks_Per_Game() <em>Blocks Per Game</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocks_Per_Game()
	 * @generated
	 * @ordered
	 */
	protected float blocks_Per_Game = BLOCKS_PER_GAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSteals_Per_Game() <em>Steals Per Game</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteals_Per_Game()
	 * @generated
	 * @ordered
	 */
	protected static final float STEALS_PER_GAME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSteals_Per_Game() <em>Steals Per Game</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteals_Per_Game()
	 * @generated
	 * @ordered
	 */
	protected float steals_Per_Game = STEALS_PER_GAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFiled_Goal_Percentage() <em>Filed Goal Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiled_Goal_Percentage()
	 * @generated
	 * @ordered
	 */
	protected static final float FILED_GOAL_PERCENTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFiled_Goal_Percentage() <em>Filed Goal Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiled_Goal_Percentage()
	 * @generated
	 * @ordered
	 */
	protected float filed_Goal_Percentage = FILED_GOAL_PERCENTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThree_Pointers_Made() <em>Three Pointers Made</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThree_Pointers_Made()
	 * @generated
	 * @ordered
	 */
	protected static final int THREE_POINTERS_MADE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getThree_Pointers_Made() <em>Three Pointers Made</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThree_Pointers_Made()
	 * @generated
	 * @ordered
	 */
	protected int three_Pointers_Made = THREE_POINTERS_MADE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThree_Point_Percentage() <em>Three Point Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThree_Point_Percentage()
	 * @generated
	 * @ordered
	 */
	protected static final float THREE_POINT_PERCENTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getThree_Point_Percentage() <em>Three Point Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThree_Point_Percentage()
	 * @generated
	 * @ordered
	 */
	protected float three_Point_Percentage = THREE_POINT_PERCENTAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return A1Package.Literals.STATS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPoints_Per_Game() {
		return points_Per_Game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoints_Per_Game(float newPoints_Per_Game) {
		float oldPoints_Per_Game = points_Per_Game;
		points_Per_Game = newPoints_Per_Game;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.STATS__POINTS_PER_GAME, oldPoints_Per_Game, points_Per_Game));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRebounds_Per_Game() {
		return rebounds_Per_Game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRebounds_Per_Game(float newRebounds_Per_Game) {
		float oldRebounds_Per_Game = rebounds_Per_Game;
		rebounds_Per_Game = newRebounds_Per_Game;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.STATS__REBOUNDS_PER_GAME, oldRebounds_Per_Game, rebounds_Per_Game));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAssists_Per_Game() {
		return assists_Per_Game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssists_Per_Game(float newAssists_Per_Game) {
		float oldAssists_Per_Game = assists_Per_Game;
		assists_Per_Game = newAssists_Per_Game;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.STATS__ASSISTS_PER_GAME, oldAssists_Per_Game, assists_Per_Game));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBlocks_Per_Game() {
		return blocks_Per_Game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlocks_Per_Game(float newBlocks_Per_Game) {
		float oldBlocks_Per_Game = blocks_Per_Game;
		blocks_Per_Game = newBlocks_Per_Game;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.STATS__BLOCKS_PER_GAME, oldBlocks_Per_Game, blocks_Per_Game));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSteals_Per_Game() {
		return steals_Per_Game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSteals_Per_Game(float newSteals_Per_Game) {
		float oldSteals_Per_Game = steals_Per_Game;
		steals_Per_Game = newSteals_Per_Game;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.STATS__STEALS_PER_GAME, oldSteals_Per_Game, steals_Per_Game));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFiled_Goal_Percentage() {
		return filed_Goal_Percentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiled_Goal_Percentage(float newFiled_Goal_Percentage) {
		float oldFiled_Goal_Percentage = filed_Goal_Percentage;
		filed_Goal_Percentage = newFiled_Goal_Percentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.STATS__FILED_GOAL_PERCENTAGE, oldFiled_Goal_Percentage, filed_Goal_Percentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getThree_Pointers_Made() {
		return three_Pointers_Made;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThree_Pointers_Made(int newThree_Pointers_Made) {
		int oldThree_Pointers_Made = three_Pointers_Made;
		three_Pointers_Made = newThree_Pointers_Made;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.STATS__THREE_POINTERS_MADE, oldThree_Pointers_Made, three_Pointers_Made));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getThree_Point_Percentage() {
		return three_Point_Percentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThree_Point_Percentage(float newThree_Point_Percentage) {
		float oldThree_Point_Percentage = three_Point_Percentage;
		three_Point_Percentage = newThree_Point_Percentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, A1Package.STATS__THREE_POINT_PERCENTAGE, oldThree_Point_Percentage, three_Point_Percentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case A1Package.STATS__POINTS_PER_GAME:
				return getPoints_Per_Game();
			case A1Package.STATS__REBOUNDS_PER_GAME:
				return getRebounds_Per_Game();
			case A1Package.STATS__ASSISTS_PER_GAME:
				return getAssists_Per_Game();
			case A1Package.STATS__BLOCKS_PER_GAME:
				return getBlocks_Per_Game();
			case A1Package.STATS__STEALS_PER_GAME:
				return getSteals_Per_Game();
			case A1Package.STATS__FILED_GOAL_PERCENTAGE:
				return getFiled_Goal_Percentage();
			case A1Package.STATS__THREE_POINTERS_MADE:
				return getThree_Pointers_Made();
			case A1Package.STATS__THREE_POINT_PERCENTAGE:
				return getThree_Point_Percentage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case A1Package.STATS__POINTS_PER_GAME:
				setPoints_Per_Game((Float)newValue);
				return;
			case A1Package.STATS__REBOUNDS_PER_GAME:
				setRebounds_Per_Game((Float)newValue);
				return;
			case A1Package.STATS__ASSISTS_PER_GAME:
				setAssists_Per_Game((Float)newValue);
				return;
			case A1Package.STATS__BLOCKS_PER_GAME:
				setBlocks_Per_Game((Float)newValue);
				return;
			case A1Package.STATS__STEALS_PER_GAME:
				setSteals_Per_Game((Float)newValue);
				return;
			case A1Package.STATS__FILED_GOAL_PERCENTAGE:
				setFiled_Goal_Percentage((Float)newValue);
				return;
			case A1Package.STATS__THREE_POINTERS_MADE:
				setThree_Pointers_Made((Integer)newValue);
				return;
			case A1Package.STATS__THREE_POINT_PERCENTAGE:
				setThree_Point_Percentage((Float)newValue);
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
			case A1Package.STATS__POINTS_PER_GAME:
				setPoints_Per_Game(POINTS_PER_GAME_EDEFAULT);
				return;
			case A1Package.STATS__REBOUNDS_PER_GAME:
				setRebounds_Per_Game(REBOUNDS_PER_GAME_EDEFAULT);
				return;
			case A1Package.STATS__ASSISTS_PER_GAME:
				setAssists_Per_Game(ASSISTS_PER_GAME_EDEFAULT);
				return;
			case A1Package.STATS__BLOCKS_PER_GAME:
				setBlocks_Per_Game(BLOCKS_PER_GAME_EDEFAULT);
				return;
			case A1Package.STATS__STEALS_PER_GAME:
				setSteals_Per_Game(STEALS_PER_GAME_EDEFAULT);
				return;
			case A1Package.STATS__FILED_GOAL_PERCENTAGE:
				setFiled_Goal_Percentage(FILED_GOAL_PERCENTAGE_EDEFAULT);
				return;
			case A1Package.STATS__THREE_POINTERS_MADE:
				setThree_Pointers_Made(THREE_POINTERS_MADE_EDEFAULT);
				return;
			case A1Package.STATS__THREE_POINT_PERCENTAGE:
				setThree_Point_Percentage(THREE_POINT_PERCENTAGE_EDEFAULT);
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
			case A1Package.STATS__POINTS_PER_GAME:
				return points_Per_Game != POINTS_PER_GAME_EDEFAULT;
			case A1Package.STATS__REBOUNDS_PER_GAME:
				return rebounds_Per_Game != REBOUNDS_PER_GAME_EDEFAULT;
			case A1Package.STATS__ASSISTS_PER_GAME:
				return assists_Per_Game != ASSISTS_PER_GAME_EDEFAULT;
			case A1Package.STATS__BLOCKS_PER_GAME:
				return blocks_Per_Game != BLOCKS_PER_GAME_EDEFAULT;
			case A1Package.STATS__STEALS_PER_GAME:
				return steals_Per_Game != STEALS_PER_GAME_EDEFAULT;
			case A1Package.STATS__FILED_GOAL_PERCENTAGE:
				return filed_Goal_Percentage != FILED_GOAL_PERCENTAGE_EDEFAULT;
			case A1Package.STATS__THREE_POINTERS_MADE:
				return three_Pointers_Made != THREE_POINTERS_MADE_EDEFAULT;
			case A1Package.STATS__THREE_POINT_PERCENTAGE:
				return three_Point_Percentage != THREE_POINT_PERCENTAGE_EDEFAULT;
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
		result.append(" (Points_Per_Game: ");
		result.append(points_Per_Game);
		result.append(", Rebounds_Per_Game: ");
		result.append(rebounds_Per_Game);
		result.append(", Assists_Per_Game: ");
		result.append(assists_Per_Game);
		result.append(", Blocks_Per_Game: ");
		result.append(blocks_Per_Game);
		result.append(", Steals_Per_Game: ");
		result.append(steals_Per_Game);
		result.append(", Filed_Goal_Percentage: ");
		result.append(filed_Goal_Percentage);
		result.append(", Three_Pointers_Made: ");
		result.append(three_Pointers_Made);
		result.append(", Three_Point_Percentage: ");
		result.append(three_Point_Percentage);
		result.append(')');
		return result.toString();
	}

} //StatsImpl
