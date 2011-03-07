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
import org.larz.dom3.dm.dm.WeaponInst2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weapon Inst2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst2Impl#getValue <em>Value</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst2Impl#isDmg <em>Dmg</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst2Impl#isNratt <em>Nratt</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst2Impl#isAtt <em>Att</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst2Impl#isDef <em>Def</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst2Impl#isLen <em>Len</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst2Impl#isRange <em>Range</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst2Impl#isAmmo <em>Ammo</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst2Impl#isRcost <em>Rcost</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst2Impl#isSound <em>Sound</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst2Impl#isAoe <em>Aoe</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst2Impl#isSecondaryeffect <em>Secondaryeffect</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst2Impl#isSecondaryeffectalways <em>Secondaryeffectalways</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.WeaponInst2Impl#isExplspr <em>Explspr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WeaponInst2Impl extends WeaponPattern2Impl implements WeaponInst2
{
  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final int VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected int value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isDmg() <em>Dmg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDmg()
   * @generated
   * @ordered
   */
  protected static final boolean DMG_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDmg() <em>Dmg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDmg()
   * @generated
   * @ordered
   */
  protected boolean dmg = DMG_EDEFAULT;

  /**
   * The default value of the '{@link #isNratt() <em>Nratt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNratt()
   * @generated
   * @ordered
   */
  protected static final boolean NRATT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNratt() <em>Nratt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNratt()
   * @generated
   * @ordered
   */
  protected boolean nratt = NRATT_EDEFAULT;

  /**
   * The default value of the '{@link #isAtt() <em>Att</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAtt()
   * @generated
   * @ordered
   */
  protected static final boolean ATT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAtt() <em>Att</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAtt()
   * @generated
   * @ordered
   */
  protected boolean att = ATT_EDEFAULT;

  /**
   * The default value of the '{@link #isDef() <em>Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDef()
   * @generated
   * @ordered
   */
  protected static final boolean DEF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDef() <em>Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDef()
   * @generated
   * @ordered
   */
  protected boolean def = DEF_EDEFAULT;

  /**
   * The default value of the '{@link #isLen() <em>Len</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLen()
   * @generated
   * @ordered
   */
  protected static final boolean LEN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLen() <em>Len</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLen()
   * @generated
   * @ordered
   */
  protected boolean len = LEN_EDEFAULT;

  /**
   * The default value of the '{@link #isRange() <em>Range</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRange()
   * @generated
   * @ordered
   */
  protected static final boolean RANGE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRange() <em>Range</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRange()
   * @generated
   * @ordered
   */
  protected boolean range = RANGE_EDEFAULT;

  /**
   * The default value of the '{@link #isAmmo() <em>Ammo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAmmo()
   * @generated
   * @ordered
   */
  protected static final boolean AMMO_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAmmo() <em>Ammo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAmmo()
   * @generated
   * @ordered
   */
  protected boolean ammo = AMMO_EDEFAULT;

  /**
   * The default value of the '{@link #isRcost() <em>Rcost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRcost()
   * @generated
   * @ordered
   */
  protected static final boolean RCOST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRcost() <em>Rcost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRcost()
   * @generated
   * @ordered
   */
  protected boolean rcost = RCOST_EDEFAULT;

  /**
   * The default value of the '{@link #isSound() <em>Sound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSound()
   * @generated
   * @ordered
   */
  protected static final boolean SOUND_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSound() <em>Sound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSound()
   * @generated
   * @ordered
   */
  protected boolean sound = SOUND_EDEFAULT;

  /**
   * The default value of the '{@link #isAoe() <em>Aoe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAoe()
   * @generated
   * @ordered
   */
  protected static final boolean AOE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAoe() <em>Aoe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAoe()
   * @generated
   * @ordered
   */
  protected boolean aoe = AOE_EDEFAULT;

  /**
   * The default value of the '{@link #isSecondaryeffect() <em>Secondaryeffect</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSecondaryeffect()
   * @generated
   * @ordered
   */
  protected static final boolean SECONDARYEFFECT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSecondaryeffect() <em>Secondaryeffect</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSecondaryeffect()
   * @generated
   * @ordered
   */
  protected boolean secondaryeffect = SECONDARYEFFECT_EDEFAULT;

  /**
   * The default value of the '{@link #isSecondaryeffectalways() <em>Secondaryeffectalways</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSecondaryeffectalways()
   * @generated
   * @ordered
   */
  protected static final boolean SECONDARYEFFECTALWAYS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSecondaryeffectalways() <em>Secondaryeffectalways</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSecondaryeffectalways()
   * @generated
   * @ordered
   */
  protected boolean secondaryeffectalways = SECONDARYEFFECTALWAYS_EDEFAULT;

  /**
   * The default value of the '{@link #isExplspr() <em>Explspr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExplspr()
   * @generated
   * @ordered
   */
  protected static final boolean EXPLSPR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExplspr() <em>Explspr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExplspr()
   * @generated
   * @ordered
   */
  protected boolean explspr = EXPLSPR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WeaponInst2Impl()
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
    return DmPackage.eINSTANCE.getWeaponInst2();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(int newValue)
  {
    int oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST2__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDmg()
  {
    return dmg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDmg(boolean newDmg)
  {
    boolean oldDmg = dmg;
    dmg = newDmg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST2__DMG, oldDmg, dmg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNratt()
  {
    return nratt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNratt(boolean newNratt)
  {
    boolean oldNratt = nratt;
    nratt = newNratt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST2__NRATT, oldNratt, nratt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAtt()
  {
    return att;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtt(boolean newAtt)
  {
    boolean oldAtt = att;
    att = newAtt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST2__ATT, oldAtt, att));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDef()
  {
    return def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDef(boolean newDef)
  {
    boolean oldDef = def;
    def = newDef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST2__DEF, oldDef, def));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLen()
  {
    return len;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLen(boolean newLen)
  {
    boolean oldLen = len;
    len = newLen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST2__LEN, oldLen, len));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRange()
  {
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRange(boolean newRange)
  {
    boolean oldRange = range;
    range = newRange;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST2__RANGE, oldRange, range));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAmmo()
  {
    return ammo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAmmo(boolean newAmmo)
  {
    boolean oldAmmo = ammo;
    ammo = newAmmo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST2__AMMO, oldAmmo, ammo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRcost()
  {
    return rcost;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRcost(boolean newRcost)
  {
    boolean oldRcost = rcost;
    rcost = newRcost;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST2__RCOST, oldRcost, rcost));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSound()
  {
    return sound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSound(boolean newSound)
  {
    boolean oldSound = sound;
    sound = newSound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST2__SOUND, oldSound, sound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAoe()
  {
    return aoe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAoe(boolean newAoe)
  {
    boolean oldAoe = aoe;
    aoe = newAoe;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST2__AOE, oldAoe, aoe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSecondaryeffect()
  {
    return secondaryeffect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecondaryeffect(boolean newSecondaryeffect)
  {
    boolean oldSecondaryeffect = secondaryeffect;
    secondaryeffect = newSecondaryeffect;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST2__SECONDARYEFFECT, oldSecondaryeffect, secondaryeffect));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSecondaryeffectalways()
  {
    return secondaryeffectalways;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecondaryeffectalways(boolean newSecondaryeffectalways)
  {
    boolean oldSecondaryeffectalways = secondaryeffectalways;
    secondaryeffectalways = newSecondaryeffectalways;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST2__SECONDARYEFFECTALWAYS, oldSecondaryeffectalways, secondaryeffectalways));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExplspr()
  {
    return explspr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExplspr(boolean newExplspr)
  {
    boolean oldExplspr = explspr;
    explspr = newExplspr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.WEAPON_INST2__EXPLSPR, oldExplspr, explspr));
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
      case DmPackage.WEAPON_INST2__VALUE:
        return getValue();
      case DmPackage.WEAPON_INST2__DMG:
        return isDmg();
      case DmPackage.WEAPON_INST2__NRATT:
        return isNratt();
      case DmPackage.WEAPON_INST2__ATT:
        return isAtt();
      case DmPackage.WEAPON_INST2__DEF:
        return isDef();
      case DmPackage.WEAPON_INST2__LEN:
        return isLen();
      case DmPackage.WEAPON_INST2__RANGE:
        return isRange();
      case DmPackage.WEAPON_INST2__AMMO:
        return isAmmo();
      case DmPackage.WEAPON_INST2__RCOST:
        return isRcost();
      case DmPackage.WEAPON_INST2__SOUND:
        return isSound();
      case DmPackage.WEAPON_INST2__AOE:
        return isAoe();
      case DmPackage.WEAPON_INST2__SECONDARYEFFECT:
        return isSecondaryeffect();
      case DmPackage.WEAPON_INST2__SECONDARYEFFECTALWAYS:
        return isSecondaryeffectalways();
      case DmPackage.WEAPON_INST2__EXPLSPR:
        return isExplspr();
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
      case DmPackage.WEAPON_INST2__VALUE:
        setValue((Integer)newValue);
        return;
      case DmPackage.WEAPON_INST2__DMG:
        setDmg((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST2__NRATT:
        setNratt((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST2__ATT:
        setAtt((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST2__DEF:
        setDef((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST2__LEN:
        setLen((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST2__RANGE:
        setRange((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST2__AMMO:
        setAmmo((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST2__RCOST:
        setRcost((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST2__SOUND:
        setSound((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST2__AOE:
        setAoe((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST2__SECONDARYEFFECT:
        setSecondaryeffect((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST2__SECONDARYEFFECTALWAYS:
        setSecondaryeffectalways((Boolean)newValue);
        return;
      case DmPackage.WEAPON_INST2__EXPLSPR:
        setExplspr((Boolean)newValue);
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
      case DmPackage.WEAPON_INST2__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST2__DMG:
        setDmg(DMG_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST2__NRATT:
        setNratt(NRATT_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST2__ATT:
        setAtt(ATT_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST2__DEF:
        setDef(DEF_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST2__LEN:
        setLen(LEN_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST2__RANGE:
        setRange(RANGE_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST2__AMMO:
        setAmmo(AMMO_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST2__RCOST:
        setRcost(RCOST_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST2__SOUND:
        setSound(SOUND_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST2__AOE:
        setAoe(AOE_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST2__SECONDARYEFFECT:
        setSecondaryeffect(SECONDARYEFFECT_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST2__SECONDARYEFFECTALWAYS:
        setSecondaryeffectalways(SECONDARYEFFECTALWAYS_EDEFAULT);
        return;
      case DmPackage.WEAPON_INST2__EXPLSPR:
        setExplspr(EXPLSPR_EDEFAULT);
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
      case DmPackage.WEAPON_INST2__VALUE:
        return value != VALUE_EDEFAULT;
      case DmPackage.WEAPON_INST2__DMG:
        return dmg != DMG_EDEFAULT;
      case DmPackage.WEAPON_INST2__NRATT:
        return nratt != NRATT_EDEFAULT;
      case DmPackage.WEAPON_INST2__ATT:
        return att != ATT_EDEFAULT;
      case DmPackage.WEAPON_INST2__DEF:
        return def != DEF_EDEFAULT;
      case DmPackage.WEAPON_INST2__LEN:
        return len != LEN_EDEFAULT;
      case DmPackage.WEAPON_INST2__RANGE:
        return range != RANGE_EDEFAULT;
      case DmPackage.WEAPON_INST2__AMMO:
        return ammo != AMMO_EDEFAULT;
      case DmPackage.WEAPON_INST2__RCOST:
        return rcost != RCOST_EDEFAULT;
      case DmPackage.WEAPON_INST2__SOUND:
        return sound != SOUND_EDEFAULT;
      case DmPackage.WEAPON_INST2__AOE:
        return aoe != AOE_EDEFAULT;
      case DmPackage.WEAPON_INST2__SECONDARYEFFECT:
        return secondaryeffect != SECONDARYEFFECT_EDEFAULT;
      case DmPackage.WEAPON_INST2__SECONDARYEFFECTALWAYS:
        return secondaryeffectalways != SECONDARYEFFECTALWAYS_EDEFAULT;
      case DmPackage.WEAPON_INST2__EXPLSPR:
        return explspr != EXPLSPR_EDEFAULT;
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
    result.append(" (value: ");
    result.append(value);
    result.append(", dmg: ");
    result.append(dmg);
    result.append(", nratt: ");
    result.append(nratt);
    result.append(", att: ");
    result.append(att);
    result.append(", def: ");
    result.append(def);
    result.append(", len: ");
    result.append(len);
    result.append(", range: ");
    result.append(range);
    result.append(", ammo: ");
    result.append(ammo);
    result.append(", rcost: ");
    result.append(rcost);
    result.append(", sound: ");
    result.append(sound);
    result.append(", aoe: ");
    result.append(aoe);
    result.append(", secondaryeffect: ");
    result.append(secondaryeffect);
    result.append(", secondaryeffectalways: ");
    result.append(secondaryeffectalways);
    result.append(", explspr: ");
    result.append(explspr);
    result.append(')');
    return result.toString();
  }

} //WeaponInst2Impl
