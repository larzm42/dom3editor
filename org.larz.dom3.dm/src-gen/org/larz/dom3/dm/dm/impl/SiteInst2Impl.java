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
import org.larz.dom3.dm.dm.SiteInst2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Site Inst2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SiteInst2Impl#getValue <em>Value</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SiteInst2Impl#isPath <em>Path</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SiteInst2Impl#isLevel <em>Level</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SiteInst2Impl#isRarity <em>Rarity</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SiteInst2Impl#isLoc <em>Loc</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SiteInst2Impl#isHomemon <em>Homemon</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SiteInst2Impl#isHomecom <em>Homecom</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SiteInst2Impl#isMon <em>Mon</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SiteInst2Impl#isCom <em>Com</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SiteInst2Impl#isGold <em>Gold</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SiteInst2Impl#isRes <em>Res</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SiteInst2Impl#isIncscale <em>Incscale</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SiteInst2Impl#isDecscale <em>Decscale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SiteInst2Impl extends SitePattern2Impl implements SiteInst2
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
   * The default value of the '{@link #isPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPath()
   * @generated
   * @ordered
   */
  protected static final boolean PATH_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPath()
   * @generated
   * @ordered
   */
  protected boolean path = PATH_EDEFAULT;

  /**
   * The default value of the '{@link #isLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLevel()
   * @generated
   * @ordered
   */
  protected static final boolean LEVEL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLevel()
   * @generated
   * @ordered
   */
  protected boolean level = LEVEL_EDEFAULT;

  /**
   * The default value of the '{@link #isRarity() <em>Rarity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRarity()
   * @generated
   * @ordered
   */
  protected static final boolean RARITY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRarity() <em>Rarity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRarity()
   * @generated
   * @ordered
   */
  protected boolean rarity = RARITY_EDEFAULT;

  /**
   * The default value of the '{@link #isLoc() <em>Loc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLoc()
   * @generated
   * @ordered
   */
  protected static final boolean LOC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLoc() <em>Loc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLoc()
   * @generated
   * @ordered
   */
  protected boolean loc = LOC_EDEFAULT;

  /**
   * The default value of the '{@link #isHomemon() <em>Homemon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHomemon()
   * @generated
   * @ordered
   */
  protected static final boolean HOMEMON_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHomemon() <em>Homemon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHomemon()
   * @generated
   * @ordered
   */
  protected boolean homemon = HOMEMON_EDEFAULT;

  /**
   * The default value of the '{@link #isHomecom() <em>Homecom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHomecom()
   * @generated
   * @ordered
   */
  protected static final boolean HOMECOM_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHomecom() <em>Homecom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHomecom()
   * @generated
   * @ordered
   */
  protected boolean homecom = HOMECOM_EDEFAULT;

  /**
   * The default value of the '{@link #isMon() <em>Mon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMon()
   * @generated
   * @ordered
   */
  protected static final boolean MON_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMon() <em>Mon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMon()
   * @generated
   * @ordered
   */
  protected boolean mon = MON_EDEFAULT;

  /**
   * The default value of the '{@link #isCom() <em>Com</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCom()
   * @generated
   * @ordered
   */
  protected static final boolean COM_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCom() <em>Com</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCom()
   * @generated
   * @ordered
   */
  protected boolean com = COM_EDEFAULT;

  /**
   * The default value of the '{@link #isGold() <em>Gold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGold()
   * @generated
   * @ordered
   */
  protected static final boolean GOLD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isGold() <em>Gold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGold()
   * @generated
   * @ordered
   */
  protected boolean gold = GOLD_EDEFAULT;

  /**
   * The default value of the '{@link #isRes() <em>Res</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRes()
   * @generated
   * @ordered
   */
  protected static final boolean RES_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRes() <em>Res</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRes()
   * @generated
   * @ordered
   */
  protected boolean res = RES_EDEFAULT;

  /**
   * The default value of the '{@link #isIncscale() <em>Incscale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIncscale()
   * @generated
   * @ordered
   */
  protected static final boolean INCSCALE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIncscale() <em>Incscale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIncscale()
   * @generated
   * @ordered
   */
  protected boolean incscale = INCSCALE_EDEFAULT;

  /**
   * The default value of the '{@link #isDecscale() <em>Decscale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDecscale()
   * @generated
   * @ordered
   */
  protected static final boolean DECSCALE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDecscale() <em>Decscale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDecscale()
   * @generated
   * @ordered
   */
  protected boolean decscale = DECSCALE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SiteInst2Impl()
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
    return DmPackage.eINSTANCE.getSiteInst2();
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SITE_INST2__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPath(boolean newPath)
  {
    boolean oldPath = path;
    path = newPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SITE_INST2__PATH, oldPath, path));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLevel()
  {
    return level;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLevel(boolean newLevel)
  {
    boolean oldLevel = level;
    level = newLevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SITE_INST2__LEVEL, oldLevel, level));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRarity()
  {
    return rarity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRarity(boolean newRarity)
  {
    boolean oldRarity = rarity;
    rarity = newRarity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SITE_INST2__RARITY, oldRarity, rarity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLoc()
  {
    return loc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLoc(boolean newLoc)
  {
    boolean oldLoc = loc;
    loc = newLoc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SITE_INST2__LOC, oldLoc, loc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHomemon()
  {
    return homemon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHomemon(boolean newHomemon)
  {
    boolean oldHomemon = homemon;
    homemon = newHomemon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SITE_INST2__HOMEMON, oldHomemon, homemon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHomecom()
  {
    return homecom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHomecom(boolean newHomecom)
  {
    boolean oldHomecom = homecom;
    homecom = newHomecom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SITE_INST2__HOMECOM, oldHomecom, homecom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMon()
  {
    return mon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMon(boolean newMon)
  {
    boolean oldMon = mon;
    mon = newMon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SITE_INST2__MON, oldMon, mon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCom()
  {
    return com;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCom(boolean newCom)
  {
    boolean oldCom = com;
    com = newCom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SITE_INST2__COM, oldCom, com));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isGold()
  {
    return gold;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGold(boolean newGold)
  {
    boolean oldGold = gold;
    gold = newGold;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SITE_INST2__GOLD, oldGold, gold));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRes()
  {
    return res;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRes(boolean newRes)
  {
    boolean oldRes = res;
    res = newRes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SITE_INST2__RES, oldRes, res));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIncscale()
  {
    return incscale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncscale(boolean newIncscale)
  {
    boolean oldIncscale = incscale;
    incscale = newIncscale;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SITE_INST2__INCSCALE, oldIncscale, incscale));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDecscale()
  {
    return decscale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecscale(boolean newDecscale)
  {
    boolean oldDecscale = decscale;
    decscale = newDecscale;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SITE_INST2__DECSCALE, oldDecscale, decscale));
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
      case DmPackage.SITE_INST2__VALUE:
        return getValue();
      case DmPackage.SITE_INST2__PATH:
        return isPath();
      case DmPackage.SITE_INST2__LEVEL:
        return isLevel();
      case DmPackage.SITE_INST2__RARITY:
        return isRarity();
      case DmPackage.SITE_INST2__LOC:
        return isLoc();
      case DmPackage.SITE_INST2__HOMEMON:
        return isHomemon();
      case DmPackage.SITE_INST2__HOMECOM:
        return isHomecom();
      case DmPackage.SITE_INST2__MON:
        return isMon();
      case DmPackage.SITE_INST2__COM:
        return isCom();
      case DmPackage.SITE_INST2__GOLD:
        return isGold();
      case DmPackage.SITE_INST2__RES:
        return isRes();
      case DmPackage.SITE_INST2__INCSCALE:
        return isIncscale();
      case DmPackage.SITE_INST2__DECSCALE:
        return isDecscale();
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
      case DmPackage.SITE_INST2__VALUE:
        setValue((Integer)newValue);
        return;
      case DmPackage.SITE_INST2__PATH:
        setPath((Boolean)newValue);
        return;
      case DmPackage.SITE_INST2__LEVEL:
        setLevel((Boolean)newValue);
        return;
      case DmPackage.SITE_INST2__RARITY:
        setRarity((Boolean)newValue);
        return;
      case DmPackage.SITE_INST2__LOC:
        setLoc((Boolean)newValue);
        return;
      case DmPackage.SITE_INST2__HOMEMON:
        setHomemon((Boolean)newValue);
        return;
      case DmPackage.SITE_INST2__HOMECOM:
        setHomecom((Boolean)newValue);
        return;
      case DmPackage.SITE_INST2__MON:
        setMon((Boolean)newValue);
        return;
      case DmPackage.SITE_INST2__COM:
        setCom((Boolean)newValue);
        return;
      case DmPackage.SITE_INST2__GOLD:
        setGold((Boolean)newValue);
        return;
      case DmPackage.SITE_INST2__RES:
        setRes((Boolean)newValue);
        return;
      case DmPackage.SITE_INST2__INCSCALE:
        setIncscale((Boolean)newValue);
        return;
      case DmPackage.SITE_INST2__DECSCALE:
        setDecscale((Boolean)newValue);
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
      case DmPackage.SITE_INST2__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case DmPackage.SITE_INST2__PATH:
        setPath(PATH_EDEFAULT);
        return;
      case DmPackage.SITE_INST2__LEVEL:
        setLevel(LEVEL_EDEFAULT);
        return;
      case DmPackage.SITE_INST2__RARITY:
        setRarity(RARITY_EDEFAULT);
        return;
      case DmPackage.SITE_INST2__LOC:
        setLoc(LOC_EDEFAULT);
        return;
      case DmPackage.SITE_INST2__HOMEMON:
        setHomemon(HOMEMON_EDEFAULT);
        return;
      case DmPackage.SITE_INST2__HOMECOM:
        setHomecom(HOMECOM_EDEFAULT);
        return;
      case DmPackage.SITE_INST2__MON:
        setMon(MON_EDEFAULT);
        return;
      case DmPackage.SITE_INST2__COM:
        setCom(COM_EDEFAULT);
        return;
      case DmPackage.SITE_INST2__GOLD:
        setGold(GOLD_EDEFAULT);
        return;
      case DmPackage.SITE_INST2__RES:
        setRes(RES_EDEFAULT);
        return;
      case DmPackage.SITE_INST2__INCSCALE:
        setIncscale(INCSCALE_EDEFAULT);
        return;
      case DmPackage.SITE_INST2__DECSCALE:
        setDecscale(DECSCALE_EDEFAULT);
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
      case DmPackage.SITE_INST2__VALUE:
        return value != VALUE_EDEFAULT;
      case DmPackage.SITE_INST2__PATH:
        return path != PATH_EDEFAULT;
      case DmPackage.SITE_INST2__LEVEL:
        return level != LEVEL_EDEFAULT;
      case DmPackage.SITE_INST2__RARITY:
        return rarity != RARITY_EDEFAULT;
      case DmPackage.SITE_INST2__LOC:
        return loc != LOC_EDEFAULT;
      case DmPackage.SITE_INST2__HOMEMON:
        return homemon != HOMEMON_EDEFAULT;
      case DmPackage.SITE_INST2__HOMECOM:
        return homecom != HOMECOM_EDEFAULT;
      case DmPackage.SITE_INST2__MON:
        return mon != MON_EDEFAULT;
      case DmPackage.SITE_INST2__COM:
        return com != COM_EDEFAULT;
      case DmPackage.SITE_INST2__GOLD:
        return gold != GOLD_EDEFAULT;
      case DmPackage.SITE_INST2__RES:
        return res != RES_EDEFAULT;
      case DmPackage.SITE_INST2__INCSCALE:
        return incscale != INCSCALE_EDEFAULT;
      case DmPackage.SITE_INST2__DECSCALE:
        return decscale != DECSCALE_EDEFAULT;
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
    result.append(", path: ");
    result.append(path);
    result.append(", level: ");
    result.append(level);
    result.append(", rarity: ");
    result.append(rarity);
    result.append(", loc: ");
    result.append(loc);
    result.append(", homemon: ");
    result.append(homemon);
    result.append(", homecom: ");
    result.append(homecom);
    result.append(", mon: ");
    result.append(mon);
    result.append(", com: ");
    result.append(com);
    result.append(", gold: ");
    result.append(gold);
    result.append(", res: ");
    result.append(res);
    result.append(", incscale: ");
    result.append(incscale);
    result.append(", decscale: ");
    result.append(decscale);
    result.append(')');
    return result.toString();
  }

} //SiteInst2Impl
