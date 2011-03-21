/**
 * <copyright>
 * </copyright>
 *
 */
package org.larz.dom3.dm.dm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.larz.dom3.dm.dm.DmPackage;
import org.larz.dom3.dm.dm.WeaponInst4;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weapon Inst4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl#isTwohanded <em>Twohanded</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl#isArmorpiercing <em>Armorpiercing</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl#isArmornegating <em>Armornegating</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl#isMagic <em>Magic</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl#isDt_normal <em>Dt normal</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl#isDt_stun <em>Dt stun</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl#isDt_paralyze <em>Dt paralyze</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl#isDt_poison <em>Dt poison</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl#isDt_cap <em>Dt cap</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl#isDt_demon <em>Dt demon</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl#isDt_demononly <em>Dt demononly</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl#isDt_holy <em>Dt holy</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl#isDt_magic <em>Dt magic</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl#isDt_small <em>Dt small</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl#isDt_large <em>Dt large</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl#isDt_constructonly <em>Dt constructonly</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl#isDt_raise <em>Dt raise</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl#isMind <em>Mind</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl#isCold <em>Cold</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl#isFire <em>Fire</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl#isShock <em>Shock</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl#isPoison <em>Poison</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl#isBonus <em>Bonus</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl#isCharge <em>Charge</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl#isFlail <em>Flail</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl#isNostr <em>Nostr</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl#isMrnegates <em>Mrnegates</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl#isMrnegateseasily <em>Mrnegateseasily</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WeaponInst4Impl extends WeaponPattern4Impl implements WeaponInst4
{
  /**
   * The default value of the '{@link #isTwohanded() <em>Twohanded</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTwohanded()
   * @generated
   * @ordered
   */
  protected static final boolean TWOHANDED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTwohanded() <em>Twohanded</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTwohanded()
   * @generated
   * @ordered
   */
  protected boolean twohanded = TWOHANDED_EDEFAULT;

  /**
   * The default value of the '{@link #isArmorpiercing() <em>Armorpiercing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isArmorpiercing()
   * @generated
   * @ordered
   */
  protected static final boolean ARMORPIERCING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isArmorpiercing() <em>Armorpiercing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isArmorpiercing()
   * @generated
   * @ordered
   */
  protected boolean armorpiercing = ARMORPIERCING_EDEFAULT;

  /**
   * The default value of the '{@link #isArmornegating() <em>Armornegating</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isArmornegating()
   * @generated
   * @ordered
   */
  protected static final boolean ARMORNEGATING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isArmornegating() <em>Armornegating</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isArmornegating()
   * @generated
   * @ordered
   */
  protected boolean armornegating = ARMORNEGATING_EDEFAULT;

  /**
   * The default value of the '{@link #isMagic() <em>Magic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMagic()
   * @generated
   * @ordered
   */
  protected static final boolean MAGIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMagic() <em>Magic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMagic()
   * @generated
   * @ordered
   */
  protected boolean magic = MAGIC_EDEFAULT;

  /**
   * The default value of the '{@link #isDt_normal() <em>Dt normal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDt_normal()
   * @generated
   * @ordered
   */
  protected static final boolean DT_NORMAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDt_normal() <em>Dt normal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDt_normal()
   * @generated
   * @ordered
   */
  protected boolean dt_normal = DT_NORMAL_EDEFAULT;

  /**
   * The default value of the '{@link #isDt_stun() <em>Dt stun</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDt_stun()
   * @generated
   * @ordered
   */
  protected static final boolean DT_STUN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDt_stun() <em>Dt stun</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDt_stun()
   * @generated
   * @ordered
   */
  protected boolean dt_stun = DT_STUN_EDEFAULT;

  /**
   * The default value of the '{@link #isDt_paralyze() <em>Dt paralyze</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDt_paralyze()
   * @generated
   * @ordered
   */
  protected static final boolean DT_PARALYZE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDt_paralyze() <em>Dt paralyze</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDt_paralyze()
   * @generated
   * @ordered
   */
  protected boolean dt_paralyze = DT_PARALYZE_EDEFAULT;

  /**
   * The default value of the '{@link #isDt_poison() <em>Dt poison</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDt_poison()
   * @generated
   * @ordered
   */
  protected static final boolean DT_POISON_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDt_poison() <em>Dt poison</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDt_poison()
   * @generated
   * @ordered
   */
  protected boolean dt_poison = DT_POISON_EDEFAULT;

  /**
   * The default value of the '{@link #isDt_cap() <em>Dt cap</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDt_cap()
   * @generated
   * @ordered
   */
  protected static final boolean DT_CAP_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDt_cap() <em>Dt cap</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDt_cap()
   * @generated
   * @ordered
   */
  protected boolean dt_cap = DT_CAP_EDEFAULT;

  /**
   * The default value of the '{@link #isDt_demon() <em>Dt demon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDt_demon()
   * @generated
   * @ordered
   */
  protected static final boolean DT_DEMON_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDt_demon() <em>Dt demon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDt_demon()
   * @generated
   * @ordered
   */
  protected boolean dt_demon = DT_DEMON_EDEFAULT;

  /**
   * The default value of the '{@link #isDt_demononly() <em>Dt demononly</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDt_demononly()
   * @generated
   * @ordered
   */
  protected static final boolean DT_DEMONONLY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDt_demononly() <em>Dt demononly</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDt_demononly()
   * @generated
   * @ordered
   */
  protected boolean dt_demononly = DT_DEMONONLY_EDEFAULT;

  /**
   * The default value of the '{@link #isDt_holy() <em>Dt holy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDt_holy()
   * @generated
   * @ordered
   */
  protected static final boolean DT_HOLY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDt_holy() <em>Dt holy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDt_holy()
   * @generated
   * @ordered
   */
  protected boolean dt_holy = DT_HOLY_EDEFAULT;

  /**
   * The default value of the '{@link #isDt_magic() <em>Dt magic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDt_magic()
   * @generated
   * @ordered
   */
  protected static final boolean DT_MAGIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDt_magic() <em>Dt magic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDt_magic()
   * @generated
   * @ordered
   */
  protected boolean dt_magic = DT_MAGIC_EDEFAULT;

  /**
   * The default value of the '{@link #isDt_small() <em>Dt small</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDt_small()
   * @generated
   * @ordered
   */
  protected static final boolean DT_SMALL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDt_small() <em>Dt small</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDt_small()
   * @generated
   * @ordered
   */
  protected boolean dt_small = DT_SMALL_EDEFAULT;

  /**
   * The default value of the '{@link #isDt_large() <em>Dt large</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDt_large()
   * @generated
   * @ordered
   */
  protected static final boolean DT_LARGE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDt_large() <em>Dt large</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDt_large()
   * @generated
   * @ordered
   */
  protected boolean dt_large = DT_LARGE_EDEFAULT;

  /**
   * The default value of the '{@link #isDt_constructonly() <em>Dt constructonly</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDt_constructonly()
   * @generated
   * @ordered
   */
  protected static final boolean DT_CONSTRUCTONLY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDt_constructonly() <em>Dt constructonly</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDt_constructonly()
   * @generated
   * @ordered
   */
  protected boolean dt_constructonly = DT_CONSTRUCTONLY_EDEFAULT;

  /**
   * The default value of the '{@link #isDt_raise() <em>Dt raise</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDt_raise()
   * @generated
   * @ordered
   */
  protected static final boolean DT_RAISE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDt_raise() <em>Dt raise</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDt_raise()
   * @generated
   * @ordered
   */
  protected boolean dt_raise = DT_RAISE_EDEFAULT;

  /**
   * The default value of the '{@link #isMind() <em>Mind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMind()
   * @generated
   * @ordered
   */
  protected static final boolean MIND_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMind() <em>Mind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMind()
   * @generated
   * @ordered
   */
  protected boolean mind = MIND_EDEFAULT;

  /**
   * The default value of the '{@link #isCold() <em>Cold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCold()
   * @generated
   * @ordered
   */
  protected static final boolean COLD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCold() <em>Cold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCold()
   * @generated
   * @ordered
   */
  protected boolean cold = COLD_EDEFAULT;

  /**
   * The default value of the '{@link #isFire() <em>Fire</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFire()
   * @generated
   * @ordered
   */
  protected static final boolean FIRE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFire() <em>Fire</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFire()
   * @generated
   * @ordered
   */
  protected boolean fire = FIRE_EDEFAULT;

  /**
   * The default value of the '{@link #isShock() <em>Shock</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isShock()
   * @generated
   * @ordered
   */
  protected static final boolean SHOCK_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isShock() <em>Shock</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isShock()
   * @generated
   * @ordered
   */
  protected boolean shock = SHOCK_EDEFAULT;

  /**
   * The default value of the '{@link #isPoison() <em>Poison</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPoison()
   * @generated
   * @ordered
   */
  protected static final boolean POISON_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPoison() <em>Poison</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPoison()
   * @generated
   * @ordered
   */
  protected boolean poison = POISON_EDEFAULT;

  /**
   * The default value of the '{@link #isBonus() <em>Bonus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBonus()
   * @generated
   * @ordered
   */
  protected static final boolean BONUS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBonus() <em>Bonus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBonus()
   * @generated
   * @ordered
   */
  protected boolean bonus = BONUS_EDEFAULT;

  /**
   * The default value of the '{@link #isCharge() <em>Charge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCharge()
   * @generated
   * @ordered
   */
  protected static final boolean CHARGE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCharge() <em>Charge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCharge()
   * @generated
   * @ordered
   */
  protected boolean charge = CHARGE_EDEFAULT;

  /**
   * The default value of the '{@link #isFlail() <em>Flail</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFlail()
   * @generated
   * @ordered
   */
  protected static final boolean FLAIL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFlail() <em>Flail</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFlail()
   * @generated
   * @ordered
   */
  protected boolean flail = FLAIL_EDEFAULT;

  /**
   * The default value of the '{@link #isNostr() <em>Nostr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNostr()
   * @generated
   * @ordered
   */
  protected static final boolean NOSTR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNostr() <em>Nostr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNostr()
   * @generated
   * @ordered
   */
  protected boolean nostr = NOSTR_EDEFAULT;

  /**
   * The default value of the '{@link #isMrnegates() <em>Mrnegates</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMrnegates()
   * @generated
   * @ordered
   */
  protected static final boolean MRNEGATES_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMrnegates() <em>Mrnegates</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMrnegates()
   * @generated
   * @ordered
   */
  protected boolean mrnegates = MRNEGATES_EDEFAULT;

  /**
   * The default value of the '{@link #isMrnegateseasily() <em>Mrnegateseasily</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMrnegateseasily()
   * @generated
   * @ordered
   */
  protected static final boolean MRNEGATESEASILY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMrnegateseasily() <em>Mrnegateseasily</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMrnegateseasily()
   * @generated
   * @ordered
   */
  protected boolean mrnegateseasily = MRNEGATESEASILY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WeaponInst4Impl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DmPackage.eINSTANCE.getWeaponInst4();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTwohanded()
  {
    return twohanded;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwohanded(boolean newTwohanded)
  {
    boolean oldTwohanded = twohanded;
    twohanded = newTwohanded;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST4__TWOHANDED, oldTwohanded, twohanded));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isArmorpiercing()
  {
    return armorpiercing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArmorpiercing(boolean newArmorpiercing)
  {
    boolean oldArmorpiercing = armorpiercing;
    armorpiercing = newArmorpiercing;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST4__ARMORPIERCING, oldArmorpiercing, armorpiercing));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isArmornegating()
  {
    return armornegating;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArmornegating(boolean newArmornegating)
  {
    boolean oldArmornegating = armornegating;
    armornegating = newArmornegating;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST4__ARMORNEGATING, oldArmornegating, armornegating));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMagic()
  {
    return magic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMagic(boolean newMagic)
  {
    boolean oldMagic = magic;
    magic = newMagic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST4__MAGIC, oldMagic, magic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDt_normal()
  {
    return dt_normal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDt_normal(boolean newDt_normal)
  {
    boolean oldDt_normal = dt_normal;
    dt_normal = newDt_normal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST4__DT_NORMAL, oldDt_normal, dt_normal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDt_stun()
  {
    return dt_stun;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDt_stun(boolean newDt_stun)
  {
    boolean oldDt_stun = dt_stun;
    dt_stun = newDt_stun;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST4__DT_STUN, oldDt_stun, dt_stun));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDt_paralyze()
  {
    return dt_paralyze;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDt_paralyze(boolean newDt_paralyze)
  {
    boolean oldDt_paralyze = dt_paralyze;
    dt_paralyze = newDt_paralyze;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST4__DT_PARALYZE, oldDt_paralyze, dt_paralyze));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDt_poison()
  {
    return dt_poison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDt_poison(boolean newDt_poison)
  {
    boolean oldDt_poison = dt_poison;
    dt_poison = newDt_poison;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST4__DT_POISON, oldDt_poison, dt_poison));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDt_cap()
  {
    return dt_cap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDt_cap(boolean newDt_cap)
  {
    boolean oldDt_cap = dt_cap;
    dt_cap = newDt_cap;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST4__DT_CAP, oldDt_cap, dt_cap));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDt_demon()
  {
    return dt_demon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDt_demon(boolean newDt_demon)
  {
    boolean oldDt_demon = dt_demon;
    dt_demon = newDt_demon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST4__DT_DEMON, oldDt_demon, dt_demon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDt_demononly()
  {
    return dt_demononly;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDt_demononly(boolean newDt_demononly)
  {
    boolean oldDt_demononly = dt_demononly;
    dt_demononly = newDt_demononly;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST4__DT_DEMONONLY, oldDt_demononly, dt_demononly));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDt_holy()
  {
    return dt_holy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDt_holy(boolean newDt_holy)
  {
    boolean oldDt_holy = dt_holy;
    dt_holy = newDt_holy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST4__DT_HOLY, oldDt_holy, dt_holy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDt_magic()
  {
    return dt_magic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDt_magic(boolean newDt_magic)
  {
    boolean oldDt_magic = dt_magic;
    dt_magic = newDt_magic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST4__DT_MAGIC, oldDt_magic, dt_magic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDt_small()
  {
    return dt_small;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDt_small(boolean newDt_small)
  {
    boolean oldDt_small = dt_small;
    dt_small = newDt_small;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST4__DT_SMALL, oldDt_small, dt_small));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDt_large()
  {
    return dt_large;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDt_large(boolean newDt_large)
  {
    boolean oldDt_large = dt_large;
    dt_large = newDt_large;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST4__DT_LARGE, oldDt_large, dt_large));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDt_constructonly()
  {
    return dt_constructonly;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDt_constructonly(boolean newDt_constructonly)
  {
    boolean oldDt_constructonly = dt_constructonly;
    dt_constructonly = newDt_constructonly;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST4__DT_CONSTRUCTONLY, oldDt_constructonly, dt_constructonly));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDt_raise()
  {
    return dt_raise;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDt_raise(boolean newDt_raise)
  {
    boolean oldDt_raise = dt_raise;
    dt_raise = newDt_raise;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST4__DT_RAISE, oldDt_raise, dt_raise));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMind()
  {
    return mind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMind(boolean newMind)
  {
    boolean oldMind = mind;
    mind = newMind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST4__MIND, oldMind, mind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCold()
  {
    return cold;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCold(boolean newCold)
  {
    boolean oldCold = cold;
    cold = newCold;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST4__COLD, oldCold, cold));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFire()
  {
    return fire;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFire(boolean newFire)
  {
    boolean oldFire = fire;
    fire = newFire;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST4__FIRE, oldFire, fire));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isShock()
  {
    return shock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShock(boolean newShock)
  {
    boolean oldShock = shock;
    shock = newShock;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST4__SHOCK, oldShock, shock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPoison()
  {
    return poison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPoison(boolean newPoison)
  {
    boolean oldPoison = poison;
    poison = newPoison;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST4__POISON, oldPoison, poison));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBonus()
  {
    return bonus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBonus(boolean newBonus)
  {
    boolean oldBonus = bonus;
    bonus = newBonus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST4__BONUS, oldBonus, bonus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCharge()
  {
    return charge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCharge(boolean newCharge)
  {
    boolean oldCharge = charge;
    charge = newCharge;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST4__CHARGE, oldCharge, charge));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFlail()
  {
    return flail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFlail(boolean newFlail)
  {
    boolean oldFlail = flail;
    flail = newFlail;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST4__FLAIL, oldFlail, flail));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNostr()
  {
    return nostr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNostr(boolean newNostr)
  {
    boolean oldNostr = nostr;
    nostr = newNostr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST4__NOSTR, oldNostr, nostr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMrnegates()
  {
    return mrnegates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMrnegates(boolean newMrnegates)
  {
    boolean oldMrnegates = mrnegates;
    mrnegates = newMrnegates;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST4__MRNEGATES, oldMrnegates, mrnegates));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMrnegateseasily()
  {
    return mrnegateseasily;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMrnegateseasily(boolean newMrnegateseasily)
  {
    boolean oldMrnegateseasily = mrnegateseasily;
    mrnegateseasily = newMrnegateseasily;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST4__MRNEGATESEASILY, oldMrnegateseasily, mrnegateseasily));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DmPackage.WEAPON_INST4__TWOHANDED:
        return isTwohanded();
      case DmPackage.WEAPON_INST4__ARMORPIERCING:
        return isArmorpiercing();
      case DmPackage.WEAPON_INST4__ARMORNEGATING:
        return isArmornegating();
      case DmPackage.WEAPON_INST4__MAGIC:
        return isMagic();
      case DmPackage.WEAPON_INST4__DT_NORMAL:
        return isDt_normal();
      case DmPackage.WEAPON_INST4__DT_STUN:
        return isDt_stun();
      case DmPackage.WEAPON_INST4__DT_PARALYZE:
        return isDt_paralyze();
      case DmPackage.WEAPON_INST4__DT_POISON:
        return isDt_poison();
      case DmPackage.WEAPON_INST4__DT_CAP:
        return isDt_cap();
      case DmPackage.WEAPON_INST4__DT_DEMON:
        return isDt_demon();
      case DmPackage.WEAPON_INST4__DT_DEMONONLY:
        return isDt_demononly();
      case DmPackage.WEAPON_INST4__DT_HOLY:
        return isDt_holy();
      case DmPackage.WEAPON_INST4__DT_MAGIC:
        return isDt_magic();
      case DmPackage.WEAPON_INST4__DT_SMALL:
        return isDt_small();
      case DmPackage.WEAPON_INST4__DT_LARGE:
        return isDt_large();
      case DmPackage.WEAPON_INST4__DT_CONSTRUCTONLY:
        return isDt_constructonly();
      case DmPackage.WEAPON_INST4__DT_RAISE:
        return isDt_raise();
      case DmPackage.WEAPON_INST4__MIND:
        return isMind();
      case DmPackage.WEAPON_INST4__COLD:
        return isCold();
      case DmPackage.WEAPON_INST4__FIRE:
        return isFire();
      case DmPackage.WEAPON_INST4__SHOCK:
        return isShock();
      case DmPackage.WEAPON_INST4__POISON:
        return isPoison();
      case DmPackage.WEAPON_INST4__BONUS:
        return isBonus();
      case DmPackage.WEAPON_INST4__CHARGE:
        return isCharge();
      case DmPackage.WEAPON_INST4__FLAIL:
        return isFlail();
      case DmPackage.WEAPON_INST4__NOSTR:
        return isNostr();
      case DmPackage.WEAPON_INST4__MRNEGATES:
        return isMrnegates();
      case DmPackage.WEAPON_INST4__MRNEGATESEASILY:
        return isMrnegateseasily();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DmPackage.WEAPON_INST4__TWOHANDED:
        setTwohanded((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST4__ARMORPIERCING:
        setArmorpiercing((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST4__ARMORNEGATING:
        setArmornegating((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST4__MAGIC:
        setMagic((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST4__DT_NORMAL:
        setDt_normal((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST4__DT_STUN:
        setDt_stun((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST4__DT_PARALYZE:
        setDt_paralyze((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST4__DT_POISON:
        setDt_poison((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST4__DT_CAP:
        setDt_cap((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST4__DT_DEMON:
        setDt_demon((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST4__DT_DEMONONLY:
        setDt_demononly((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST4__DT_HOLY:
        setDt_holy((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST4__DT_MAGIC:
        setDt_magic((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST4__DT_SMALL:
        setDt_small((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST4__DT_LARGE:
        setDt_large((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST4__DT_CONSTRUCTONLY:
        setDt_constructonly((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST4__DT_RAISE:
        setDt_raise((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST4__MIND:
        setMind((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST4__COLD:
        setCold((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST4__FIRE:
        setFire((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST4__SHOCK:
        setShock((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST4__POISON:
        setPoison((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST4__BONUS:
        setBonus((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST4__CHARGE:
        setCharge((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST4__FLAIL:
        setFlail((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST4__NOSTR:
        setNostr((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST4__MRNEGATES:
        setMrnegates((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST4__MRNEGATESEASILY:
        setMrnegateseasily((Boolean)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DmPackage.WEAPON_INST4__TWOHANDED:
        setTwohanded(TWOHANDED_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST4__ARMORPIERCING:
        setArmorpiercing(ARMORPIERCING_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST4__ARMORNEGATING:
        setArmornegating(ARMORNEGATING_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST4__MAGIC:
        setMagic(MAGIC_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST4__DT_NORMAL:
        setDt_normal(DT_NORMAL_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST4__DT_STUN:
        setDt_stun(DT_STUN_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST4__DT_PARALYZE:
        setDt_paralyze(DT_PARALYZE_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST4__DT_POISON:
        setDt_poison(DT_POISON_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST4__DT_CAP:
        setDt_cap(DT_CAP_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST4__DT_DEMON:
        setDt_demon(DT_DEMON_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST4__DT_DEMONONLY:
        setDt_demononly(DT_DEMONONLY_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST4__DT_HOLY:
        setDt_holy(DT_HOLY_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST4__DT_MAGIC:
        setDt_magic(DT_MAGIC_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST4__DT_SMALL:
        setDt_small(DT_SMALL_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST4__DT_LARGE:
        setDt_large(DT_LARGE_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST4__DT_CONSTRUCTONLY:
        setDt_constructonly(DT_CONSTRUCTONLY_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST4__DT_RAISE:
        setDt_raise(DT_RAISE_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST4__MIND:
        setMind(MIND_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST4__COLD:
        setCold(COLD_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST4__FIRE:
        setFire(FIRE_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST4__SHOCK:
        setShock(SHOCK_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST4__POISON:
        setPoison(POISON_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST4__BONUS:
        setBonus(BONUS_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST4__CHARGE:
        setCharge(CHARGE_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST4__FLAIL:
        setFlail(FLAIL_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST4__NOSTR:
        setNostr(NOSTR_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST4__MRNEGATES:
        setMrnegates(MRNEGATES_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST4__MRNEGATESEASILY:
        setMrnegateseasily(MRNEGATESEASILY_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DmPackage.WEAPON_INST4__TWOHANDED:
        return twohanded != TWOHANDED_EDEFAULT;
      case DmPackage.WEAPON_INST4__ARMORPIERCING:
        return armorpiercing != ARMORPIERCING_EDEFAULT;
      case DmPackage.WEAPON_INST4__ARMORNEGATING:
        return armornegating != ARMORNEGATING_EDEFAULT;
      case DmPackage.WEAPON_INST4__MAGIC:
        return magic != MAGIC_EDEFAULT;
      case DmPackage.WEAPON_INST4__DT_NORMAL:
        return dt_normal != DT_NORMAL_EDEFAULT;
      case DmPackage.WEAPON_INST4__DT_STUN:
        return dt_stun != DT_STUN_EDEFAULT;
      case DmPackage.WEAPON_INST4__DT_PARALYZE:
        return dt_paralyze != DT_PARALYZE_EDEFAULT;
      case DmPackage.WEAPON_INST4__DT_POISON:
        return dt_poison != DT_POISON_EDEFAULT;
      case DmPackage.WEAPON_INST4__DT_CAP:
        return dt_cap != DT_CAP_EDEFAULT;
      case DmPackage.WEAPON_INST4__DT_DEMON:
        return dt_demon != DT_DEMON_EDEFAULT;
      case DmPackage.WEAPON_INST4__DT_DEMONONLY:
        return dt_demononly != DT_DEMONONLY_EDEFAULT;
      case DmPackage.WEAPON_INST4__DT_HOLY:
        return dt_holy != DT_HOLY_EDEFAULT;
      case DmPackage.WEAPON_INST4__DT_MAGIC:
        return dt_magic != DT_MAGIC_EDEFAULT;
      case DmPackage.WEAPON_INST4__DT_SMALL:
        return dt_small != DT_SMALL_EDEFAULT;
      case DmPackage.WEAPON_INST4__DT_LARGE:
        return dt_large != DT_LARGE_EDEFAULT;
      case DmPackage.WEAPON_INST4__DT_CONSTRUCTONLY:
        return dt_constructonly != DT_CONSTRUCTONLY_EDEFAULT;
      case DmPackage.WEAPON_INST4__DT_RAISE:
        return dt_raise != DT_RAISE_EDEFAULT;
      case DmPackage.WEAPON_INST4__MIND:
        return mind != MIND_EDEFAULT;
      case DmPackage.WEAPON_INST4__COLD:
        return cold != COLD_EDEFAULT;
      case DmPackage.WEAPON_INST4__FIRE:
        return fire != FIRE_EDEFAULT;
      case DmPackage.WEAPON_INST4__SHOCK:
        return shock != SHOCK_EDEFAULT;
      case DmPackage.WEAPON_INST4__POISON:
        return poison != POISON_EDEFAULT;
      case DmPackage.WEAPON_INST4__BONUS:
        return bonus != BONUS_EDEFAULT;
      case DmPackage.WEAPON_INST4__CHARGE:
        return charge != CHARGE_EDEFAULT;
      case DmPackage.WEAPON_INST4__FLAIL:
        return flail != FLAIL_EDEFAULT;
      case DmPackage.WEAPON_INST4__NOSTR:
        return nostr != NOSTR_EDEFAULT;
      case DmPackage.WEAPON_INST4__MRNEGATES:
        return mrnegates != MRNEGATES_EDEFAULT;
      case DmPackage.WEAPON_INST4__MRNEGATESEASILY:
        return mrnegateseasily != MRNEGATESEASILY_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (twohanded: ");
    result.append(twohanded);
    result.append(", armorpiercing: ");
    result.append(armorpiercing);
    result.append(", armornegating: ");
    result.append(armornegating);
    result.append(", magic: ");
    result.append(magic);
    result.append(", dt_normal: ");
    result.append(dt_normal);
    result.append(", dt_stun: ");
    result.append(dt_stun);
    result.append(", dt_paralyze: ");
    result.append(dt_paralyze);
    result.append(", dt_poison: ");
    result.append(dt_poison);
    result.append(", dt_cap: ");
    result.append(dt_cap);
    result.append(", dt_demon: ");
    result.append(dt_demon);
    result.append(", dt_demononly: ");
    result.append(dt_demononly);
    result.append(", dt_holy: ");
    result.append(dt_holy);
    result.append(", dt_magic: ");
    result.append(dt_magic);
    result.append(", dt_small: ");
    result.append(dt_small);
    result.append(", dt_large: ");
    result.append(dt_large);
    result.append(", dt_constructonly: ");
    result.append(dt_constructonly);
    result.append(", dt_raise: ");
    result.append(dt_raise);
    result.append(", mind: ");
    result.append(mind);
    result.append(", cold: ");
    result.append(cold);
    result.append(", fire: ");
    result.append(fire);
    result.append(", shock: ");
    result.append(shock);
    result.append(", poison: ");
    result.append(poison);
    result.append(", bonus: ");
    result.append(bonus);
    result.append(", charge: ");
    result.append(charge);
    result.append(", flail: ");
    result.append(flail);
    result.append(", nostr: ");
    result.append(nostr);
    result.append(", mrnegates: ");
    result.append(mrnegates);
    result.append(", mrnegateseasily: ");
    result.append(mrnegateseasily);
    result.append(')');
    return result.toString();
  }

} //WeaponInst4Impl
