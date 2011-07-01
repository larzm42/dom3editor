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
import org.larz.dom3.dm.dm.MonsterInst2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monster Inst2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#getValue <em>Value</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isSpeciallook <em>Speciallook</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isAp <em>Ap</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isMapmove <em>Mapmove</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isHp <em>Hp</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isProt <em>Prot</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isSize <em>Size</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isRessize <em>Ressize</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isStr <em>Str</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isEnc <em>Enc</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isAtt <em>Att</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isDef <em>Def</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isPrec <em>Prec</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isMr <em>Mr</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isMor <em>Mor</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isGcost <em>Gcost</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isRcost <em>Rcost</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isPathcost <em>Pathcost</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isStartdom <em>Startdom</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isEyes <em>Eyes</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isCopystats <em>Copystats</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isCopyspr <em>Copyspr</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isRestrictedgod <em>Restrictedgod</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isShatteredsoul <em>Shatteredsoul</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isColdres <em>Coldres</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isFireres <em>Fireres</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isPoisonres <em>Poisonres</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isShockres <em>Shockres</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isDarkvision <em>Darkvision</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isSeduce <em>Seduce</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isSuccubus <em>Succubus</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isBeckon <em>Beckon</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isStartage <em>Startage</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isMaxage <em>Maxage</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isOlder <em>Older</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isHealer <em>Healer</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isStartaff <em>Startaff</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isSupplybonus <em>Supplybonus</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isUwdamage <em>Uwdamage</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isHomesick <em>Homesick</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isColdpower <em>Coldpower</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isFirepower <em>Firepower</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isStormpower <em>Stormpower</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isDarkpower <em>Darkpower</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isSpringpower <em>Springpower</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isSummerpower <em>Summerpower</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isFallpower <em>Fallpower</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isWinterpower <em>Winterpower</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isAmbidextrous <em>Ambidextrous</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isBanefireshield <em>Banefireshield</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isBerserk <em>Berserk</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isStandard <em>Standard</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isAnimalawe <em>Animalawe</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isAwe <em>Awe</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isFear <em>Fear</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isRegeneration <em>Regeneration</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isReinvigoration <em>Reinvigoration</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isFireshield <em>Fireshield</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isIceprot <em>Iceprot</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isPoisoncloud <em>Poisoncloud</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isDiseasecloud <em>Diseasecloud</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isBloodvengeance <em>Bloodvengeance</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isCastledef <em>Castledef</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isSiegebonus <em>Siegebonus</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isPatrolbonus <em>Patrolbonus</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isPillagebonus <em>Pillagebonus</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isResearchbonus <em>Researchbonus</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isForgebonus <em>Forgebonus</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isDouse <em>Douse</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isNobadevents <em>Nobadevents</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isIncunrest <em>Incunrest</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isSpreaddom <em>Spreaddom</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isLeper <em>Leper</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isPopkill <em>Popkill</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isHeretic <em>Heretic</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isItemslots <em>Itemslots</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl#isNametype <em>Nametype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MonsterInst2Impl extends MonsterPattern2Impl implements MonsterInst2
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
   * The default value of the '{@link #isSpeciallook() <em>Speciallook</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSpeciallook()
   * @generated
   * @ordered
   */
  protected static final boolean SPECIALLOOK_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSpeciallook() <em>Speciallook</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSpeciallook()
   * @generated
   * @ordered
   */
  protected boolean speciallook = SPECIALLOOK_EDEFAULT;

  /**
   * The default value of the '{@link #isAp() <em>Ap</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAp()
   * @generated
   * @ordered
   */
  protected static final boolean AP_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAp() <em>Ap</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAp()
   * @generated
   * @ordered
   */
  protected boolean ap = AP_EDEFAULT;

  /**
   * The default value of the '{@link #isMapmove() <em>Mapmove</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMapmove()
   * @generated
   * @ordered
   */
  protected static final boolean MAPMOVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMapmove() <em>Mapmove</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMapmove()
   * @generated
   * @ordered
   */
  protected boolean mapmove = MAPMOVE_EDEFAULT;

  /**
   * The default value of the '{@link #isHp() <em>Hp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHp()
   * @generated
   * @ordered
   */
  protected static final boolean HP_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHp() <em>Hp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHp()
   * @generated
   * @ordered
   */
  protected boolean hp = HP_EDEFAULT;

  /**
   * The default value of the '{@link #isProt() <em>Prot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isProt()
   * @generated
   * @ordered
   */
  protected static final boolean PROT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isProt() <em>Prot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isProt()
   * @generated
   * @ordered
   */
  protected boolean prot = PROT_EDEFAULT;

  /**
   * The default value of the '{@link #isSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSize()
   * @generated
   * @ordered
   */
  protected static final boolean SIZE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSize()
   * @generated
   * @ordered
   */
  protected boolean size = SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #isRessize() <em>Ressize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRessize()
   * @generated
   * @ordered
   */
  protected static final boolean RESSIZE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRessize() <em>Ressize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRessize()
   * @generated
   * @ordered
   */
  protected boolean ressize = RESSIZE_EDEFAULT;

  /**
   * The default value of the '{@link #isStr() <em>Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStr()
   * @generated
   * @ordered
   */
  protected static final boolean STR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStr() <em>Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStr()
   * @generated
   * @ordered
   */
  protected boolean str = STR_EDEFAULT;

  /**
   * The default value of the '{@link #isEnc() <em>Enc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnc()
   * @generated
   * @ordered
   */
  protected static final boolean ENC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEnc() <em>Enc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnc()
   * @generated
   * @ordered
   */
  protected boolean enc = ENC_EDEFAULT;

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
   * The default value of the '{@link #isPrec() <em>Prec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPrec()
   * @generated
   * @ordered
   */
  protected static final boolean PREC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPrec() <em>Prec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPrec()
   * @generated
   * @ordered
   */
  protected boolean prec = PREC_EDEFAULT;

  /**
   * The default value of the '{@link #isMr() <em>Mr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMr()
   * @generated
   * @ordered
   */
  protected static final boolean MR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMr() <em>Mr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMr()
   * @generated
   * @ordered
   */
  protected boolean mr = MR_EDEFAULT;

  /**
   * The default value of the '{@link #isMor() <em>Mor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMor()
   * @generated
   * @ordered
   */
  protected static final boolean MOR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMor() <em>Mor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMor()
   * @generated
   * @ordered
   */
  protected boolean mor = MOR_EDEFAULT;

  /**
   * The default value of the '{@link #isGcost() <em>Gcost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGcost()
   * @generated
   * @ordered
   */
  protected static final boolean GCOST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isGcost() <em>Gcost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGcost()
   * @generated
   * @ordered
   */
  protected boolean gcost = GCOST_EDEFAULT;

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
   * The default value of the '{@link #isPathcost() <em>Pathcost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPathcost()
   * @generated
   * @ordered
   */
  protected static final boolean PATHCOST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPathcost() <em>Pathcost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPathcost()
   * @generated
   * @ordered
   */
  protected boolean pathcost = PATHCOST_EDEFAULT;

  /**
   * The default value of the '{@link #isStartdom() <em>Startdom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStartdom()
   * @generated
   * @ordered
   */
  protected static final boolean STARTDOM_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStartdom() <em>Startdom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStartdom()
   * @generated
   * @ordered
   */
  protected boolean startdom = STARTDOM_EDEFAULT;

  /**
   * The default value of the '{@link #isEyes() <em>Eyes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEyes()
   * @generated
   * @ordered
   */
  protected static final boolean EYES_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEyes() <em>Eyes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEyes()
   * @generated
   * @ordered
   */
  protected boolean eyes = EYES_EDEFAULT;

  /**
   * The default value of the '{@link #isCopystats() <em>Copystats</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCopystats()
   * @generated
   * @ordered
   */
  protected static final boolean COPYSTATS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCopystats() <em>Copystats</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCopystats()
   * @generated
   * @ordered
   */
  protected boolean copystats = COPYSTATS_EDEFAULT;

  /**
   * The default value of the '{@link #isCopyspr() <em>Copyspr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCopyspr()
   * @generated
   * @ordered
   */
  protected static final boolean COPYSPR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCopyspr() <em>Copyspr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCopyspr()
   * @generated
   * @ordered
   */
  protected boolean copyspr = COPYSPR_EDEFAULT;

  /**
   * The default value of the '{@link #isRestrictedgod() <em>Restrictedgod</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRestrictedgod()
   * @generated
   * @ordered
   */
  protected static final boolean RESTRICTEDGOD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRestrictedgod() <em>Restrictedgod</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRestrictedgod()
   * @generated
   * @ordered
   */
  protected boolean restrictedgod = RESTRICTEDGOD_EDEFAULT;

  /**
   * The default value of the '{@link #isShatteredsoul() <em>Shatteredsoul</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isShatteredsoul()
   * @generated
   * @ordered
   */
  protected static final boolean SHATTEREDSOUL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isShatteredsoul() <em>Shatteredsoul</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isShatteredsoul()
   * @generated
   * @ordered
   */
  protected boolean shatteredsoul = SHATTEREDSOUL_EDEFAULT;

  /**
   * The default value of the '{@link #isColdres() <em>Coldres</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isColdres()
   * @generated
   * @ordered
   */
  protected static final boolean COLDRES_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isColdres() <em>Coldres</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isColdres()
   * @generated
   * @ordered
   */
  protected boolean coldres = COLDRES_EDEFAULT;

  /**
   * The default value of the '{@link #isFireres() <em>Fireres</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFireres()
   * @generated
   * @ordered
   */
  protected static final boolean FIRERES_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFireres() <em>Fireres</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFireres()
   * @generated
   * @ordered
   */
  protected boolean fireres = FIRERES_EDEFAULT;

  /**
   * The default value of the '{@link #isPoisonres() <em>Poisonres</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPoisonres()
   * @generated
   * @ordered
   */
  protected static final boolean POISONRES_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPoisonres() <em>Poisonres</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPoisonres()
   * @generated
   * @ordered
   */
  protected boolean poisonres = POISONRES_EDEFAULT;

  /**
   * The default value of the '{@link #isShockres() <em>Shockres</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isShockres()
   * @generated
   * @ordered
   */
  protected static final boolean SHOCKRES_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isShockres() <em>Shockres</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isShockres()
   * @generated
   * @ordered
   */
  protected boolean shockres = SHOCKRES_EDEFAULT;

  /**
   * The default value of the '{@link #isDarkvision() <em>Darkvision</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDarkvision()
   * @generated
   * @ordered
   */
  protected static final boolean DARKVISION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDarkvision() <em>Darkvision</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDarkvision()
   * @generated
   * @ordered
   */
  protected boolean darkvision = DARKVISION_EDEFAULT;

  /**
   * The default value of the '{@link #isSeduce() <em>Seduce</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSeduce()
   * @generated
   * @ordered
   */
  protected static final boolean SEDUCE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSeduce() <em>Seduce</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSeduce()
   * @generated
   * @ordered
   */
  protected boolean seduce = SEDUCE_EDEFAULT;

  /**
   * The default value of the '{@link #isSuccubus() <em>Succubus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSuccubus()
   * @generated
   * @ordered
   */
  protected static final boolean SUCCUBUS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSuccubus() <em>Succubus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSuccubus()
   * @generated
   * @ordered
   */
  protected boolean succubus = SUCCUBUS_EDEFAULT;

  /**
   * The default value of the '{@link #isBeckon() <em>Beckon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBeckon()
   * @generated
   * @ordered
   */
  protected static final boolean BECKON_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBeckon() <em>Beckon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBeckon()
   * @generated
   * @ordered
   */
  protected boolean beckon = BECKON_EDEFAULT;

  /**
   * The default value of the '{@link #isStartage() <em>Startage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStartage()
   * @generated
   * @ordered
   */
  protected static final boolean STARTAGE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStartage() <em>Startage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStartage()
   * @generated
   * @ordered
   */
  protected boolean startage = STARTAGE_EDEFAULT;

  /**
   * The default value of the '{@link #isMaxage() <em>Maxage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMaxage()
   * @generated
   * @ordered
   */
  protected static final boolean MAXAGE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMaxage() <em>Maxage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMaxage()
   * @generated
   * @ordered
   */
  protected boolean maxage = MAXAGE_EDEFAULT;

  /**
   * The default value of the '{@link #isOlder() <em>Older</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOlder()
   * @generated
   * @ordered
   */
  protected static final boolean OLDER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOlder() <em>Older</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOlder()
   * @generated
   * @ordered
   */
  protected boolean older = OLDER_EDEFAULT;

  /**
   * The default value of the '{@link #isHealer() <em>Healer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHealer()
   * @generated
   * @ordered
   */
  protected static final boolean HEALER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHealer() <em>Healer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHealer()
   * @generated
   * @ordered
   */
  protected boolean healer = HEALER_EDEFAULT;

  /**
   * The default value of the '{@link #isStartaff() <em>Startaff</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStartaff()
   * @generated
   * @ordered
   */
  protected static final boolean STARTAFF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStartaff() <em>Startaff</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStartaff()
   * @generated
   * @ordered
   */
  protected boolean startaff = STARTAFF_EDEFAULT;

  /**
   * The default value of the '{@link #isSupplybonus() <em>Supplybonus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSupplybonus()
   * @generated
   * @ordered
   */
  protected static final boolean SUPPLYBONUS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSupplybonus() <em>Supplybonus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSupplybonus()
   * @generated
   * @ordered
   */
  protected boolean supplybonus = SUPPLYBONUS_EDEFAULT;

  /**
   * The default value of the '{@link #isUwdamage() <em>Uwdamage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUwdamage()
   * @generated
   * @ordered
   */
  protected static final boolean UWDAMAGE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUwdamage() <em>Uwdamage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUwdamage()
   * @generated
   * @ordered
   */
  protected boolean uwdamage = UWDAMAGE_EDEFAULT;

  /**
   * The default value of the '{@link #isHomesick() <em>Homesick</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHomesick()
   * @generated
   * @ordered
   */
  protected static final boolean HOMESICK_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHomesick() <em>Homesick</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHomesick()
   * @generated
   * @ordered
   */
  protected boolean homesick = HOMESICK_EDEFAULT;

  /**
   * The default value of the '{@link #isColdpower() <em>Coldpower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isColdpower()
   * @generated
   * @ordered
   */
  protected static final boolean COLDPOWER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isColdpower() <em>Coldpower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isColdpower()
   * @generated
   * @ordered
   */
  protected boolean coldpower = COLDPOWER_EDEFAULT;

  /**
   * The default value of the '{@link #isFirepower() <em>Firepower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFirepower()
   * @generated
   * @ordered
   */
  protected static final boolean FIREPOWER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFirepower() <em>Firepower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFirepower()
   * @generated
   * @ordered
   */
  protected boolean firepower = FIREPOWER_EDEFAULT;

  /**
   * The default value of the '{@link #isStormpower() <em>Stormpower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStormpower()
   * @generated
   * @ordered
   */
  protected static final boolean STORMPOWER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStormpower() <em>Stormpower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStormpower()
   * @generated
   * @ordered
   */
  protected boolean stormpower = STORMPOWER_EDEFAULT;

  /**
   * The default value of the '{@link #isDarkpower() <em>Darkpower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDarkpower()
   * @generated
   * @ordered
   */
  protected static final boolean DARKPOWER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDarkpower() <em>Darkpower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDarkpower()
   * @generated
   * @ordered
   */
  protected boolean darkpower = DARKPOWER_EDEFAULT;

  /**
   * The default value of the '{@link #isSpringpower() <em>Springpower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSpringpower()
   * @generated
   * @ordered
   */
  protected static final boolean SPRINGPOWER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSpringpower() <em>Springpower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSpringpower()
   * @generated
   * @ordered
   */
  protected boolean springpower = SPRINGPOWER_EDEFAULT;

  /**
   * The default value of the '{@link #isSummerpower() <em>Summerpower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSummerpower()
   * @generated
   * @ordered
   */
  protected static final boolean SUMMERPOWER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSummerpower() <em>Summerpower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSummerpower()
   * @generated
   * @ordered
   */
  protected boolean summerpower = SUMMERPOWER_EDEFAULT;

  /**
   * The default value of the '{@link #isFallpower() <em>Fallpower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFallpower()
   * @generated
   * @ordered
   */
  protected static final boolean FALLPOWER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFallpower() <em>Fallpower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFallpower()
   * @generated
   * @ordered
   */
  protected boolean fallpower = FALLPOWER_EDEFAULT;

  /**
   * The default value of the '{@link #isWinterpower() <em>Winterpower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWinterpower()
   * @generated
   * @ordered
   */
  protected static final boolean WINTERPOWER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isWinterpower() <em>Winterpower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWinterpower()
   * @generated
   * @ordered
   */
  protected boolean winterpower = WINTERPOWER_EDEFAULT;

  /**
   * The default value of the '{@link #isAmbidextrous() <em>Ambidextrous</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAmbidextrous()
   * @generated
   * @ordered
   */
  protected static final boolean AMBIDEXTROUS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAmbidextrous() <em>Ambidextrous</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAmbidextrous()
   * @generated
   * @ordered
   */
  protected boolean ambidextrous = AMBIDEXTROUS_EDEFAULT;

  /**
   * The default value of the '{@link #isBanefireshield() <em>Banefireshield</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBanefireshield()
   * @generated
   * @ordered
   */
  protected static final boolean BANEFIRESHIELD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBanefireshield() <em>Banefireshield</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBanefireshield()
   * @generated
   * @ordered
   */
  protected boolean banefireshield = BANEFIRESHIELD_EDEFAULT;

  /**
   * The default value of the '{@link #isBerserk() <em>Berserk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBerserk()
   * @generated
   * @ordered
   */
  protected static final boolean BERSERK_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBerserk() <em>Berserk</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBerserk()
   * @generated
   * @ordered
   */
  protected boolean berserk = BERSERK_EDEFAULT;

  /**
   * The default value of the '{@link #isStandard() <em>Standard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStandard()
   * @generated
   * @ordered
   */
  protected static final boolean STANDARD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStandard() <em>Standard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStandard()
   * @generated
   * @ordered
   */
  protected boolean standard = STANDARD_EDEFAULT;

  /**
   * The default value of the '{@link #isAnimalawe() <em>Animalawe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAnimalawe()
   * @generated
   * @ordered
   */
  protected static final boolean ANIMALAWE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAnimalawe() <em>Animalawe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAnimalawe()
   * @generated
   * @ordered
   */
  protected boolean animalawe = ANIMALAWE_EDEFAULT;

  /**
   * The default value of the '{@link #isAwe() <em>Awe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAwe()
   * @generated
   * @ordered
   */
  protected static final boolean AWE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAwe() <em>Awe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAwe()
   * @generated
   * @ordered
   */
  protected boolean awe = AWE_EDEFAULT;

  /**
   * The default value of the '{@link #isFear() <em>Fear</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFear()
   * @generated
   * @ordered
   */
  protected static final boolean FEAR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFear() <em>Fear</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFear()
   * @generated
   * @ordered
   */
  protected boolean fear = FEAR_EDEFAULT;

  /**
   * The default value of the '{@link #isRegeneration() <em>Regeneration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRegeneration()
   * @generated
   * @ordered
   */
  protected static final boolean REGENERATION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRegeneration() <em>Regeneration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRegeneration()
   * @generated
   * @ordered
   */
  protected boolean regeneration = REGENERATION_EDEFAULT;

  /**
   * The default value of the '{@link #isReinvigoration() <em>Reinvigoration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReinvigoration()
   * @generated
   * @ordered
   */
  protected static final boolean REINVIGORATION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isReinvigoration() <em>Reinvigoration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReinvigoration()
   * @generated
   * @ordered
   */
  protected boolean reinvigoration = REINVIGORATION_EDEFAULT;

  /**
   * The default value of the '{@link #isFireshield() <em>Fireshield</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFireshield()
   * @generated
   * @ordered
   */
  protected static final boolean FIRESHIELD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFireshield() <em>Fireshield</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFireshield()
   * @generated
   * @ordered
   */
  protected boolean fireshield = FIRESHIELD_EDEFAULT;

  /**
   * The default value of the '{@link #isIceprot() <em>Iceprot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIceprot()
   * @generated
   * @ordered
   */
  protected static final boolean ICEPROT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIceprot() <em>Iceprot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIceprot()
   * @generated
   * @ordered
   */
  protected boolean iceprot = ICEPROT_EDEFAULT;

  /**
   * The default value of the '{@link #isPoisoncloud() <em>Poisoncloud</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPoisoncloud()
   * @generated
   * @ordered
   */
  protected static final boolean POISONCLOUD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPoisoncloud() <em>Poisoncloud</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPoisoncloud()
   * @generated
   * @ordered
   */
  protected boolean poisoncloud = POISONCLOUD_EDEFAULT;

  /**
   * The default value of the '{@link #isDiseasecloud() <em>Diseasecloud</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDiseasecloud()
   * @generated
   * @ordered
   */
  protected static final boolean DISEASECLOUD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDiseasecloud() <em>Diseasecloud</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDiseasecloud()
   * @generated
   * @ordered
   */
  protected boolean diseasecloud = DISEASECLOUD_EDEFAULT;

  /**
   * The default value of the '{@link #isBloodvengeance() <em>Bloodvengeance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBloodvengeance()
   * @generated
   * @ordered
   */
  protected static final boolean BLOODVENGEANCE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBloodvengeance() <em>Bloodvengeance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBloodvengeance()
   * @generated
   * @ordered
   */
  protected boolean bloodvengeance = BLOODVENGEANCE_EDEFAULT;

  /**
   * The default value of the '{@link #isCastledef() <em>Castledef</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCastledef()
   * @generated
   * @ordered
   */
  protected static final boolean CASTLEDEF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCastledef() <em>Castledef</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCastledef()
   * @generated
   * @ordered
   */
  protected boolean castledef = CASTLEDEF_EDEFAULT;

  /**
   * The default value of the '{@link #isSiegebonus() <em>Siegebonus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSiegebonus()
   * @generated
   * @ordered
   */
  protected static final boolean SIEGEBONUS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSiegebonus() <em>Siegebonus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSiegebonus()
   * @generated
   * @ordered
   */
  protected boolean siegebonus = SIEGEBONUS_EDEFAULT;

  /**
   * The default value of the '{@link #isPatrolbonus() <em>Patrolbonus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPatrolbonus()
   * @generated
   * @ordered
   */
  protected static final boolean PATROLBONUS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPatrolbonus() <em>Patrolbonus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPatrolbonus()
   * @generated
   * @ordered
   */
  protected boolean patrolbonus = PATROLBONUS_EDEFAULT;

  /**
   * The default value of the '{@link #isPillagebonus() <em>Pillagebonus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPillagebonus()
   * @generated
   * @ordered
   */
  protected static final boolean PILLAGEBONUS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPillagebonus() <em>Pillagebonus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPillagebonus()
   * @generated
   * @ordered
   */
  protected boolean pillagebonus = PILLAGEBONUS_EDEFAULT;

  /**
   * The default value of the '{@link #isResearchbonus() <em>Researchbonus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResearchbonus()
   * @generated
   * @ordered
   */
  protected static final boolean RESEARCHBONUS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isResearchbonus() <em>Researchbonus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResearchbonus()
   * @generated
   * @ordered
   */
  protected boolean researchbonus = RESEARCHBONUS_EDEFAULT;

  /**
   * The default value of the '{@link #isForgebonus() <em>Forgebonus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isForgebonus()
   * @generated
   * @ordered
   */
  protected static final boolean FORGEBONUS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isForgebonus() <em>Forgebonus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isForgebonus()
   * @generated
   * @ordered
   */
  protected boolean forgebonus = FORGEBONUS_EDEFAULT;

  /**
   * The default value of the '{@link #isDouse() <em>Douse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDouse()
   * @generated
   * @ordered
   */
  protected static final boolean DOUSE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDouse() <em>Douse</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDouse()
   * @generated
   * @ordered
   */
  protected boolean douse = DOUSE_EDEFAULT;

  /**
   * The default value of the '{@link #isNobadevents() <em>Nobadevents</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNobadevents()
   * @generated
   * @ordered
   */
  protected static final boolean NOBADEVENTS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNobadevents() <em>Nobadevents</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNobadevents()
   * @generated
   * @ordered
   */
  protected boolean nobadevents = NOBADEVENTS_EDEFAULT;

  /**
   * The default value of the '{@link #isIncunrest() <em>Incunrest</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIncunrest()
   * @generated
   * @ordered
   */
  protected static final boolean INCUNREST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIncunrest() <em>Incunrest</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIncunrest()
   * @generated
   * @ordered
   */
  protected boolean incunrest = INCUNREST_EDEFAULT;

  /**
   * The default value of the '{@link #isSpreaddom() <em>Spreaddom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSpreaddom()
   * @generated
   * @ordered
   */
  protected static final boolean SPREADDOM_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSpreaddom() <em>Spreaddom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSpreaddom()
   * @generated
   * @ordered
   */
  protected boolean spreaddom = SPREADDOM_EDEFAULT;

  /**
   * The default value of the '{@link #isLeper() <em>Leper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLeper()
   * @generated
   * @ordered
   */
  protected static final boolean LEPER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLeper() <em>Leper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLeper()
   * @generated
   * @ordered
   */
  protected boolean leper = LEPER_EDEFAULT;

  /**
   * The default value of the '{@link #isPopkill() <em>Popkill</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPopkill()
   * @generated
   * @ordered
   */
  protected static final boolean POPKILL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPopkill() <em>Popkill</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPopkill()
   * @generated
   * @ordered
   */
  protected boolean popkill = POPKILL_EDEFAULT;

  /**
   * The default value of the '{@link #isHeretic() <em>Heretic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHeretic()
   * @generated
   * @ordered
   */
  protected static final boolean HERETIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHeretic() <em>Heretic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHeretic()
   * @generated
   * @ordered
   */
  protected boolean heretic = HERETIC_EDEFAULT;

  /**
   * The default value of the '{@link #isItemslots() <em>Itemslots</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isItemslots()
   * @generated
   * @ordered
   */
  protected static final boolean ITEMSLOTS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isItemslots() <em>Itemslots</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isItemslots()
   * @generated
   * @ordered
   */
  protected boolean itemslots = ITEMSLOTS_EDEFAULT;

  /**
   * The default value of the '{@link #isNametype() <em>Nametype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNametype()
   * @generated
   * @ordered
   */
  protected static final boolean NAMETYPE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNametype() <em>Nametype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNametype()
   * @generated
   * @ordered
   */
  protected boolean nametype = NAMETYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MonsterInst2Impl()
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
    return DmPackage.eINSTANCE.getMonsterInst2();
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSpeciallook()
  {
    return speciallook;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpeciallook(boolean newSpeciallook)
  {
    boolean oldSpeciallook = speciallook;
    speciallook = newSpeciallook;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__SPECIALLOOK, oldSpeciallook, speciallook));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAp()
  {
    return ap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAp(boolean newAp)
  {
    boolean oldAp = ap;
    ap = newAp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__AP, oldAp, ap));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMapmove()
  {
    return mapmove;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMapmove(boolean newMapmove)
  {
    boolean oldMapmove = mapmove;
    mapmove = newMapmove;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__MAPMOVE, oldMapmove, mapmove));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHp()
  {
    return hp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHp(boolean newHp)
  {
    boolean oldHp = hp;
    hp = newHp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__HP, oldHp, hp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isProt()
  {
    return prot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProt(boolean newProt)
  {
    boolean oldProt = prot;
    prot = newProt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__PROT, oldProt, prot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(boolean newSize)
  {
    boolean oldSize = size;
    size = newSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__SIZE, oldSize, size));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRessize()
  {
    return ressize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRessize(boolean newRessize)
  {
    boolean oldRessize = ressize;
    ressize = newRessize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__RESSIZE, oldRessize, ressize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStr()
  {
    return str;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStr(boolean newStr)
  {
    boolean oldStr = str;
    str = newStr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__STR, oldStr, str));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEnc()
  {
    return enc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnc(boolean newEnc)
  {
    boolean oldEnc = enc;
    enc = newEnc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__ENC, oldEnc, enc));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__ATT, oldAtt, att));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__DEF, oldDef, def));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPrec()
  {
    return prec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrec(boolean newPrec)
  {
    boolean oldPrec = prec;
    prec = newPrec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__PREC, oldPrec, prec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMr()
  {
    return mr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMr(boolean newMr)
  {
    boolean oldMr = mr;
    mr = newMr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__MR, oldMr, mr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMor()
  {
    return mor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMor(boolean newMor)
  {
    boolean oldMor = mor;
    mor = newMor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__MOR, oldMor, mor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isGcost()
  {
    return gcost;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGcost(boolean newGcost)
  {
    boolean oldGcost = gcost;
    gcost = newGcost;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__GCOST, oldGcost, gcost));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__RCOST, oldRcost, rcost));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPathcost()
  {
    return pathcost;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPathcost(boolean newPathcost)
  {
    boolean oldPathcost = pathcost;
    pathcost = newPathcost;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__PATHCOST, oldPathcost, pathcost));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStartdom()
  {
    return startdom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartdom(boolean newStartdom)
  {
    boolean oldStartdom = startdom;
    startdom = newStartdom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__STARTDOM, oldStartdom, startdom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEyes()
  {
    return eyes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEyes(boolean newEyes)
  {
    boolean oldEyes = eyes;
    eyes = newEyes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__EYES, oldEyes, eyes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCopystats()
  {
    return copystats;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCopystats(boolean newCopystats)
  {
    boolean oldCopystats = copystats;
    copystats = newCopystats;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__COPYSTATS, oldCopystats, copystats));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCopyspr()
  {
    return copyspr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCopyspr(boolean newCopyspr)
  {
    boolean oldCopyspr = copyspr;
    copyspr = newCopyspr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__COPYSPR, oldCopyspr, copyspr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRestrictedgod()
  {
    return restrictedgod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRestrictedgod(boolean newRestrictedgod)
  {
    boolean oldRestrictedgod = restrictedgod;
    restrictedgod = newRestrictedgod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__RESTRICTEDGOD, oldRestrictedgod, restrictedgod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isShatteredsoul()
  {
    return shatteredsoul;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShatteredsoul(boolean newShatteredsoul)
  {
    boolean oldShatteredsoul = shatteredsoul;
    shatteredsoul = newShatteredsoul;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__SHATTEREDSOUL, oldShatteredsoul, shatteredsoul));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isColdres()
  {
    return coldres;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColdres(boolean newColdres)
  {
    boolean oldColdres = coldres;
    coldres = newColdres;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__COLDRES, oldColdres, coldres));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFireres()
  {
    return fireres;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFireres(boolean newFireres)
  {
    boolean oldFireres = fireres;
    fireres = newFireres;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__FIRERES, oldFireres, fireres));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPoisonres()
  {
    return poisonres;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPoisonres(boolean newPoisonres)
  {
    boolean oldPoisonres = poisonres;
    poisonres = newPoisonres;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__POISONRES, oldPoisonres, poisonres));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isShockres()
  {
    return shockres;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShockres(boolean newShockres)
  {
    boolean oldShockres = shockres;
    shockres = newShockres;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__SHOCKRES, oldShockres, shockres));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDarkvision()
  {
    return darkvision;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDarkvision(boolean newDarkvision)
  {
    boolean oldDarkvision = darkvision;
    darkvision = newDarkvision;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__DARKVISION, oldDarkvision, darkvision));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSeduce()
  {
    return seduce;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSeduce(boolean newSeduce)
  {
    boolean oldSeduce = seduce;
    seduce = newSeduce;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__SEDUCE, oldSeduce, seduce));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSuccubus()
  {
    return succubus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuccubus(boolean newSuccubus)
  {
    boolean oldSuccubus = succubus;
    succubus = newSuccubus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__SUCCUBUS, oldSuccubus, succubus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBeckon()
  {
    return beckon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBeckon(boolean newBeckon)
  {
    boolean oldBeckon = beckon;
    beckon = newBeckon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__BECKON, oldBeckon, beckon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStartage()
  {
    return startage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartage(boolean newStartage)
  {
    boolean oldStartage = startage;
    startage = newStartage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__STARTAGE, oldStartage, startage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMaxage()
  {
    return maxage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxage(boolean newMaxage)
  {
    boolean oldMaxage = maxage;
    maxage = newMaxage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__MAXAGE, oldMaxage, maxage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOlder()
  {
    return older;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOlder(boolean newOlder)
  {
    boolean oldOlder = older;
    older = newOlder;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__OLDER, oldOlder, older));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHealer()
  {
    return healer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHealer(boolean newHealer)
  {
    boolean oldHealer = healer;
    healer = newHealer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__HEALER, oldHealer, healer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStartaff()
  {
    return startaff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartaff(boolean newStartaff)
  {
    boolean oldStartaff = startaff;
    startaff = newStartaff;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__STARTAFF, oldStartaff, startaff));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSupplybonus()
  {
    return supplybonus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSupplybonus(boolean newSupplybonus)
  {
    boolean oldSupplybonus = supplybonus;
    supplybonus = newSupplybonus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__SUPPLYBONUS, oldSupplybonus, supplybonus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUwdamage()
  {
    return uwdamage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUwdamage(boolean newUwdamage)
  {
    boolean oldUwdamage = uwdamage;
    uwdamage = newUwdamage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__UWDAMAGE, oldUwdamage, uwdamage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHomesick()
  {
    return homesick;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHomesick(boolean newHomesick)
  {
    boolean oldHomesick = homesick;
    homesick = newHomesick;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__HOMESICK, oldHomesick, homesick));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isColdpower()
  {
    return coldpower;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColdpower(boolean newColdpower)
  {
    boolean oldColdpower = coldpower;
    coldpower = newColdpower;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__COLDPOWER, oldColdpower, coldpower));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFirepower()
  {
    return firepower;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirepower(boolean newFirepower)
  {
    boolean oldFirepower = firepower;
    firepower = newFirepower;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__FIREPOWER, oldFirepower, firepower));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStormpower()
  {
    return stormpower;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStormpower(boolean newStormpower)
  {
    boolean oldStormpower = stormpower;
    stormpower = newStormpower;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__STORMPOWER, oldStormpower, stormpower));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDarkpower()
  {
    return darkpower;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDarkpower(boolean newDarkpower)
  {
    boolean oldDarkpower = darkpower;
    darkpower = newDarkpower;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__DARKPOWER, oldDarkpower, darkpower));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSpringpower()
  {
    return springpower;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpringpower(boolean newSpringpower)
  {
    boolean oldSpringpower = springpower;
    springpower = newSpringpower;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__SPRINGPOWER, oldSpringpower, springpower));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSummerpower()
  {
    return summerpower;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSummerpower(boolean newSummerpower)
  {
    boolean oldSummerpower = summerpower;
    summerpower = newSummerpower;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__SUMMERPOWER, oldSummerpower, summerpower));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFallpower()
  {
    return fallpower;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFallpower(boolean newFallpower)
  {
    boolean oldFallpower = fallpower;
    fallpower = newFallpower;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__FALLPOWER, oldFallpower, fallpower));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isWinterpower()
  {
    return winterpower;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWinterpower(boolean newWinterpower)
  {
    boolean oldWinterpower = winterpower;
    winterpower = newWinterpower;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__WINTERPOWER, oldWinterpower, winterpower));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAmbidextrous()
  {
    return ambidextrous;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAmbidextrous(boolean newAmbidextrous)
  {
    boolean oldAmbidextrous = ambidextrous;
    ambidextrous = newAmbidextrous;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__AMBIDEXTROUS, oldAmbidextrous, ambidextrous));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBanefireshield()
  {
    return banefireshield;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBanefireshield(boolean newBanefireshield)
  {
    boolean oldBanefireshield = banefireshield;
    banefireshield = newBanefireshield;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__BANEFIRESHIELD, oldBanefireshield, banefireshield));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBerserk()
  {
    return berserk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBerserk(boolean newBerserk)
  {
    boolean oldBerserk = berserk;
    berserk = newBerserk;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__BERSERK, oldBerserk, berserk));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStandard()
  {
    return standard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStandard(boolean newStandard)
  {
    boolean oldStandard = standard;
    standard = newStandard;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__STANDARD, oldStandard, standard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAnimalawe()
  {
    return animalawe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnimalawe(boolean newAnimalawe)
  {
    boolean oldAnimalawe = animalawe;
    animalawe = newAnimalawe;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__ANIMALAWE, oldAnimalawe, animalawe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAwe()
  {
    return awe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAwe(boolean newAwe)
  {
    boolean oldAwe = awe;
    awe = newAwe;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__AWE, oldAwe, awe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFear()
  {
    return fear;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFear(boolean newFear)
  {
    boolean oldFear = fear;
    fear = newFear;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__FEAR, oldFear, fear));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRegeneration()
  {
    return regeneration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRegeneration(boolean newRegeneration)
  {
    boolean oldRegeneration = regeneration;
    regeneration = newRegeneration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__REGENERATION, oldRegeneration, regeneration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isReinvigoration()
  {
    return reinvigoration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReinvigoration(boolean newReinvigoration)
  {
    boolean oldReinvigoration = reinvigoration;
    reinvigoration = newReinvigoration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__REINVIGORATION, oldReinvigoration, reinvigoration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFireshield()
  {
    return fireshield;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFireshield(boolean newFireshield)
  {
    boolean oldFireshield = fireshield;
    fireshield = newFireshield;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__FIRESHIELD, oldFireshield, fireshield));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIceprot()
  {
    return iceprot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIceprot(boolean newIceprot)
  {
    boolean oldIceprot = iceprot;
    iceprot = newIceprot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__ICEPROT, oldIceprot, iceprot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPoisoncloud()
  {
    return poisoncloud;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPoisoncloud(boolean newPoisoncloud)
  {
    boolean oldPoisoncloud = poisoncloud;
    poisoncloud = newPoisoncloud;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__POISONCLOUD, oldPoisoncloud, poisoncloud));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDiseasecloud()
  {
    return diseasecloud;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDiseasecloud(boolean newDiseasecloud)
  {
    boolean oldDiseasecloud = diseasecloud;
    diseasecloud = newDiseasecloud;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__DISEASECLOUD, oldDiseasecloud, diseasecloud));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBloodvengeance()
  {
    return bloodvengeance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBloodvengeance(boolean newBloodvengeance)
  {
    boolean oldBloodvengeance = bloodvengeance;
    bloodvengeance = newBloodvengeance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__BLOODVENGEANCE, oldBloodvengeance, bloodvengeance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCastledef()
  {
    return castledef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCastledef(boolean newCastledef)
  {
    boolean oldCastledef = castledef;
    castledef = newCastledef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__CASTLEDEF, oldCastledef, castledef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSiegebonus()
  {
    return siegebonus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSiegebonus(boolean newSiegebonus)
  {
    boolean oldSiegebonus = siegebonus;
    siegebonus = newSiegebonus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__SIEGEBONUS, oldSiegebonus, siegebonus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPatrolbonus()
  {
    return patrolbonus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPatrolbonus(boolean newPatrolbonus)
  {
    boolean oldPatrolbonus = patrolbonus;
    patrolbonus = newPatrolbonus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__PATROLBONUS, oldPatrolbonus, patrolbonus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPillagebonus()
  {
    return pillagebonus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPillagebonus(boolean newPillagebonus)
  {
    boolean oldPillagebonus = pillagebonus;
    pillagebonus = newPillagebonus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__PILLAGEBONUS, oldPillagebonus, pillagebonus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isResearchbonus()
  {
    return researchbonus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResearchbonus(boolean newResearchbonus)
  {
    boolean oldResearchbonus = researchbonus;
    researchbonus = newResearchbonus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__RESEARCHBONUS, oldResearchbonus, researchbonus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isForgebonus()
  {
    return forgebonus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForgebonus(boolean newForgebonus)
  {
    boolean oldForgebonus = forgebonus;
    forgebonus = newForgebonus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__FORGEBONUS, oldForgebonus, forgebonus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDouse()
  {
    return douse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDouse(boolean newDouse)
  {
    boolean oldDouse = douse;
    douse = newDouse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__DOUSE, oldDouse, douse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNobadevents()
  {
    return nobadevents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNobadevents(boolean newNobadevents)
  {
    boolean oldNobadevents = nobadevents;
    nobadevents = newNobadevents;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__NOBADEVENTS, oldNobadevents, nobadevents));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIncunrest()
  {
    return incunrest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncunrest(boolean newIncunrest)
  {
    boolean oldIncunrest = incunrest;
    incunrest = newIncunrest;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__INCUNREST, oldIncunrest, incunrest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSpreaddom()
  {
    return spreaddom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpreaddom(boolean newSpreaddom)
  {
    boolean oldSpreaddom = spreaddom;
    spreaddom = newSpreaddom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__SPREADDOM, oldSpreaddom, spreaddom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLeper()
  {
    return leper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeper(boolean newLeper)
  {
    boolean oldLeper = leper;
    leper = newLeper;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__LEPER, oldLeper, leper));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPopkill()
  {
    return popkill;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPopkill(boolean newPopkill)
  {
    boolean oldPopkill = popkill;
    popkill = newPopkill;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__POPKILL, oldPopkill, popkill));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHeretic()
  {
    return heretic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeretic(boolean newHeretic)
  {
    boolean oldHeretic = heretic;
    heretic = newHeretic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__HERETIC, oldHeretic, heretic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isItemslots()
  {
    return itemslots;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setItemslots(boolean newItemslots)
  {
    boolean oldItemslots = itemslots;
    itemslots = newItemslots;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__ITEMSLOTS, oldItemslots, itemslots));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNametype()
  {
    return nametype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNametype(boolean newNametype)
  {
    boolean oldNametype = nametype;
    nametype = newNametype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST2__NAMETYPE, oldNametype, nametype));
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
      case DmPackage.MONSTER_INST2__VALUE:
        return getValue();
      case DmPackage.MONSTER_INST2__SPECIALLOOK:
        return isSpeciallook();
      case DmPackage.MONSTER_INST2__AP:
        return isAp();
      case DmPackage.MONSTER_INST2__MAPMOVE:
        return isMapmove();
      case DmPackage.MONSTER_INST2__HP:
        return isHp();
      case DmPackage.MONSTER_INST2__PROT:
        return isProt();
      case DmPackage.MONSTER_INST2__SIZE:
        return isSize();
      case DmPackage.MONSTER_INST2__RESSIZE:
        return isRessize();
      case DmPackage.MONSTER_INST2__STR:
        return isStr();
      case DmPackage.MONSTER_INST2__ENC:
        return isEnc();
      case DmPackage.MONSTER_INST2__ATT:
        return isAtt();
      case DmPackage.MONSTER_INST2__DEF:
        return isDef();
      case DmPackage.MONSTER_INST2__PREC:
        return isPrec();
      case DmPackage.MONSTER_INST2__MR:
        return isMr();
      case DmPackage.MONSTER_INST2__MOR:
        return isMor();
      case DmPackage.MONSTER_INST2__GCOST:
        return isGcost();
      case DmPackage.MONSTER_INST2__RCOST:
        return isRcost();
      case DmPackage.MONSTER_INST2__PATHCOST:
        return isPathcost();
      case DmPackage.MONSTER_INST2__STARTDOM:
        return isStartdom();
      case DmPackage.MONSTER_INST2__EYES:
        return isEyes();
      case DmPackage.MONSTER_INST2__COPYSTATS:
        return isCopystats();
      case DmPackage.MONSTER_INST2__COPYSPR:
        return isCopyspr();
      case DmPackage.MONSTER_INST2__RESTRICTEDGOD:
        return isRestrictedgod();
      case DmPackage.MONSTER_INST2__SHATTEREDSOUL:
        return isShatteredsoul();
      case DmPackage.MONSTER_INST2__COLDRES:
        return isColdres();
      case DmPackage.MONSTER_INST2__FIRERES:
        return isFireres();
      case DmPackage.MONSTER_INST2__POISONRES:
        return isPoisonres();
      case DmPackage.MONSTER_INST2__SHOCKRES:
        return isShockres();
      case DmPackage.MONSTER_INST2__DARKVISION:
        return isDarkvision();
      case DmPackage.MONSTER_INST2__SEDUCE:
        return isSeduce();
      case DmPackage.MONSTER_INST2__SUCCUBUS:
        return isSuccubus();
      case DmPackage.MONSTER_INST2__BECKON:
        return isBeckon();
      case DmPackage.MONSTER_INST2__STARTAGE:
        return isStartage();
      case DmPackage.MONSTER_INST2__MAXAGE:
        return isMaxage();
      case DmPackage.MONSTER_INST2__OLDER:
        return isOlder();
      case DmPackage.MONSTER_INST2__HEALER:
        return isHealer();
      case DmPackage.MONSTER_INST2__STARTAFF:
        return isStartaff();
      case DmPackage.MONSTER_INST2__SUPPLYBONUS:
        return isSupplybonus();
      case DmPackage.MONSTER_INST2__UWDAMAGE:
        return isUwdamage();
      case DmPackage.MONSTER_INST2__HOMESICK:
        return isHomesick();
      case DmPackage.MONSTER_INST2__COLDPOWER:
        return isColdpower();
      case DmPackage.MONSTER_INST2__FIREPOWER:
        return isFirepower();
      case DmPackage.MONSTER_INST2__STORMPOWER:
        return isStormpower();
      case DmPackage.MONSTER_INST2__DARKPOWER:
        return isDarkpower();
      case DmPackage.MONSTER_INST2__SPRINGPOWER:
        return isSpringpower();
      case DmPackage.MONSTER_INST2__SUMMERPOWER:
        return isSummerpower();
      case DmPackage.MONSTER_INST2__FALLPOWER:
        return isFallpower();
      case DmPackage.MONSTER_INST2__WINTERPOWER:
        return isWinterpower();
      case DmPackage.MONSTER_INST2__AMBIDEXTROUS:
        return isAmbidextrous();
      case DmPackage.MONSTER_INST2__BANEFIRESHIELD:
        return isBanefireshield();
      case DmPackage.MONSTER_INST2__BERSERK:
        return isBerserk();
      case DmPackage.MONSTER_INST2__STANDARD:
        return isStandard();
      case DmPackage.MONSTER_INST2__ANIMALAWE:
        return isAnimalawe();
      case DmPackage.MONSTER_INST2__AWE:
        return isAwe();
      case DmPackage.MONSTER_INST2__FEAR:
        return isFear();
      case DmPackage.MONSTER_INST2__REGENERATION:
        return isRegeneration();
      case DmPackage.MONSTER_INST2__REINVIGORATION:
        return isReinvigoration();
      case DmPackage.MONSTER_INST2__FIRESHIELD:
        return isFireshield();
      case DmPackage.MONSTER_INST2__ICEPROT:
        return isIceprot();
      case DmPackage.MONSTER_INST2__POISONCLOUD:
        return isPoisoncloud();
      case DmPackage.MONSTER_INST2__DISEASECLOUD:
        return isDiseasecloud();
      case DmPackage.MONSTER_INST2__BLOODVENGEANCE:
        return isBloodvengeance();
      case DmPackage.MONSTER_INST2__CASTLEDEF:
        return isCastledef();
      case DmPackage.MONSTER_INST2__SIEGEBONUS:
        return isSiegebonus();
      case DmPackage.MONSTER_INST2__PATROLBONUS:
        return isPatrolbonus();
      case DmPackage.MONSTER_INST2__PILLAGEBONUS:
        return isPillagebonus();
      case DmPackage.MONSTER_INST2__RESEARCHBONUS:
        return isResearchbonus();
      case DmPackage.MONSTER_INST2__FORGEBONUS:
        return isForgebonus();
      case DmPackage.MONSTER_INST2__DOUSE:
        return isDouse();
      case DmPackage.MONSTER_INST2__NOBADEVENTS:
        return isNobadevents();
      case DmPackage.MONSTER_INST2__INCUNREST:
        return isIncunrest();
      case DmPackage.MONSTER_INST2__SPREADDOM:
        return isSpreaddom();
      case DmPackage.MONSTER_INST2__LEPER:
        return isLeper();
      case DmPackage.MONSTER_INST2__POPKILL:
        return isPopkill();
      case DmPackage.MONSTER_INST2__HERETIC:
        return isHeretic();
      case DmPackage.MONSTER_INST2__ITEMSLOTS:
        return isItemslots();
      case DmPackage.MONSTER_INST2__NAMETYPE:
        return isNametype();
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
      case DmPackage.MONSTER_INST2__VALUE:
        setValue((Integer)newValue);
        return;
      case DmPackage.MONSTER_INST2__SPECIALLOOK:
        setSpeciallook((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__AP:
        setAp((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__MAPMOVE:
        setMapmove((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__HP:
        setHp((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__PROT:
        setProt((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__SIZE:
        setSize((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__RESSIZE:
        setRessize((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__STR:
        setStr((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__ENC:
        setEnc((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__ATT:
        setAtt((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__DEF:
        setDef((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__PREC:
        setPrec((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__MR:
        setMr((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__MOR:
        setMor((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__GCOST:
        setGcost((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__RCOST:
        setRcost((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__PATHCOST:
        setPathcost((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__STARTDOM:
        setStartdom((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__EYES:
        setEyes((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__COPYSTATS:
        setCopystats((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__COPYSPR:
        setCopyspr((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__RESTRICTEDGOD:
        setRestrictedgod((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__SHATTEREDSOUL:
        setShatteredsoul((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__COLDRES:
        setColdres((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__FIRERES:
        setFireres((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__POISONRES:
        setPoisonres((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__SHOCKRES:
        setShockres((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__DARKVISION:
        setDarkvision((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__SEDUCE:
        setSeduce((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__SUCCUBUS:
        setSuccubus((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__BECKON:
        setBeckon((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__STARTAGE:
        setStartage((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__MAXAGE:
        setMaxage((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__OLDER:
        setOlder((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__HEALER:
        setHealer((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__STARTAFF:
        setStartaff((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__SUPPLYBONUS:
        setSupplybonus((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__UWDAMAGE:
        setUwdamage((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__HOMESICK:
        setHomesick((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__COLDPOWER:
        setColdpower((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__FIREPOWER:
        setFirepower((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__STORMPOWER:
        setStormpower((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__DARKPOWER:
        setDarkpower((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__SPRINGPOWER:
        setSpringpower((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__SUMMERPOWER:
        setSummerpower((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__FALLPOWER:
        setFallpower((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__WINTERPOWER:
        setWinterpower((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__AMBIDEXTROUS:
        setAmbidextrous((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__BANEFIRESHIELD:
        setBanefireshield((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__BERSERK:
        setBerserk((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__STANDARD:
        setStandard((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__ANIMALAWE:
        setAnimalawe((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__AWE:
        setAwe((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__FEAR:
        setFear((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__REGENERATION:
        setRegeneration((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__REINVIGORATION:
        setReinvigoration((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__FIRESHIELD:
        setFireshield((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__ICEPROT:
        setIceprot((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__POISONCLOUD:
        setPoisoncloud((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__DISEASECLOUD:
        setDiseasecloud((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__BLOODVENGEANCE:
        setBloodvengeance((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__CASTLEDEF:
        setCastledef((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__SIEGEBONUS:
        setSiegebonus((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__PATROLBONUS:
        setPatrolbonus((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__PILLAGEBONUS:
        setPillagebonus((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__RESEARCHBONUS:
        setResearchbonus((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__FORGEBONUS:
        setForgebonus((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__DOUSE:
        setDouse((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__NOBADEVENTS:
        setNobadevents((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__INCUNREST:
        setIncunrest((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__SPREADDOM:
        setSpreaddom((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__LEPER:
        setLeper((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__POPKILL:
        setPopkill((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__HERETIC:
        setHeretic((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__ITEMSLOTS:
        setItemslots((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST2__NAMETYPE:
        setNametype((Boolean)newValue);
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
      case DmPackage.MONSTER_INST2__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__SPECIALLOOK:
        setSpeciallook(SPECIALLOOK_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__AP:
        setAp(AP_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__MAPMOVE:
        setMapmove(MAPMOVE_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__HP:
        setHp(HP_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__PROT:
        setProt(PROT_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__SIZE:
        setSize(SIZE_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__RESSIZE:
        setRessize(RESSIZE_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__STR:
        setStr(STR_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__ENC:
        setEnc(ENC_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__ATT:
        setAtt(ATT_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__DEF:
        setDef(DEF_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__PREC:
        setPrec(PREC_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__MR:
        setMr(MR_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__MOR:
        setMor(MOR_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__GCOST:
        setGcost(GCOST_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__RCOST:
        setRcost(RCOST_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__PATHCOST:
        setPathcost(PATHCOST_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__STARTDOM:
        setStartdom(STARTDOM_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__EYES:
        setEyes(EYES_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__COPYSTATS:
        setCopystats(COPYSTATS_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__COPYSPR:
        setCopyspr(COPYSPR_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__RESTRICTEDGOD:
        setRestrictedgod(RESTRICTEDGOD_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__SHATTEREDSOUL:
        setShatteredsoul(SHATTEREDSOUL_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__COLDRES:
        setColdres(COLDRES_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__FIRERES:
        setFireres(FIRERES_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__POISONRES:
        setPoisonres(POISONRES_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__SHOCKRES:
        setShockres(SHOCKRES_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__DARKVISION:
        setDarkvision(DARKVISION_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__SEDUCE:
        setSeduce(SEDUCE_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__SUCCUBUS:
        setSuccubus(SUCCUBUS_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__BECKON:
        setBeckon(BECKON_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__STARTAGE:
        setStartage(STARTAGE_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__MAXAGE:
        setMaxage(MAXAGE_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__OLDER:
        setOlder(OLDER_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__HEALER:
        setHealer(HEALER_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__STARTAFF:
        setStartaff(STARTAFF_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__SUPPLYBONUS:
        setSupplybonus(SUPPLYBONUS_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__UWDAMAGE:
        setUwdamage(UWDAMAGE_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__HOMESICK:
        setHomesick(HOMESICK_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__COLDPOWER:
        setColdpower(COLDPOWER_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__FIREPOWER:
        setFirepower(FIREPOWER_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__STORMPOWER:
        setStormpower(STORMPOWER_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__DARKPOWER:
        setDarkpower(DARKPOWER_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__SPRINGPOWER:
        setSpringpower(SPRINGPOWER_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__SUMMERPOWER:
        setSummerpower(SUMMERPOWER_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__FALLPOWER:
        setFallpower(FALLPOWER_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__WINTERPOWER:
        setWinterpower(WINTERPOWER_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__AMBIDEXTROUS:
        setAmbidextrous(AMBIDEXTROUS_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__BANEFIRESHIELD:
        setBanefireshield(BANEFIRESHIELD_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__BERSERK:
        setBerserk(BERSERK_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__STANDARD:
        setStandard(STANDARD_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__ANIMALAWE:
        setAnimalawe(ANIMALAWE_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__AWE:
        setAwe(AWE_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__FEAR:
        setFear(FEAR_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__REGENERATION:
        setRegeneration(REGENERATION_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__REINVIGORATION:
        setReinvigoration(REINVIGORATION_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__FIRESHIELD:
        setFireshield(FIRESHIELD_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__ICEPROT:
        setIceprot(ICEPROT_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__POISONCLOUD:
        setPoisoncloud(POISONCLOUD_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__DISEASECLOUD:
        setDiseasecloud(DISEASECLOUD_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__BLOODVENGEANCE:
        setBloodvengeance(BLOODVENGEANCE_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__CASTLEDEF:
        setCastledef(CASTLEDEF_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__SIEGEBONUS:
        setSiegebonus(SIEGEBONUS_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__PATROLBONUS:
        setPatrolbonus(PATROLBONUS_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__PILLAGEBONUS:
        setPillagebonus(PILLAGEBONUS_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__RESEARCHBONUS:
        setResearchbonus(RESEARCHBONUS_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__FORGEBONUS:
        setForgebonus(FORGEBONUS_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__DOUSE:
        setDouse(DOUSE_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__NOBADEVENTS:
        setNobadevents(NOBADEVENTS_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__INCUNREST:
        setIncunrest(INCUNREST_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__SPREADDOM:
        setSpreaddom(SPREADDOM_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__LEPER:
        setLeper(LEPER_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__POPKILL:
        setPopkill(POPKILL_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__HERETIC:
        setHeretic(HERETIC_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__ITEMSLOTS:
        setItemslots(ITEMSLOTS_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST2__NAMETYPE:
        setNametype(NAMETYPE_EDEFAULT);
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
      case DmPackage.MONSTER_INST2__VALUE:
        return value != VALUE_EDEFAULT;
      case DmPackage.MONSTER_INST2__SPECIALLOOK:
        return speciallook != SPECIALLOOK_EDEFAULT;
      case DmPackage.MONSTER_INST2__AP:
        return ap != AP_EDEFAULT;
      case DmPackage.MONSTER_INST2__MAPMOVE:
        return mapmove != MAPMOVE_EDEFAULT;
      case DmPackage.MONSTER_INST2__HP:
        return hp != HP_EDEFAULT;
      case DmPackage.MONSTER_INST2__PROT:
        return prot != PROT_EDEFAULT;
      case DmPackage.MONSTER_INST2__SIZE:
        return size != SIZE_EDEFAULT;
      case DmPackage.MONSTER_INST2__RESSIZE:
        return ressize != RESSIZE_EDEFAULT;
      case DmPackage.MONSTER_INST2__STR:
        return str != STR_EDEFAULT;
      case DmPackage.MONSTER_INST2__ENC:
        return enc != ENC_EDEFAULT;
      case DmPackage.MONSTER_INST2__ATT:
        return att != ATT_EDEFAULT;
      case DmPackage.MONSTER_INST2__DEF:
        return def != DEF_EDEFAULT;
      case DmPackage.MONSTER_INST2__PREC:
        return prec != PREC_EDEFAULT;
      case DmPackage.MONSTER_INST2__MR:
        return mr != MR_EDEFAULT;
      case DmPackage.MONSTER_INST2__MOR:
        return mor != MOR_EDEFAULT;
      case DmPackage.MONSTER_INST2__GCOST:
        return gcost != GCOST_EDEFAULT;
      case DmPackage.MONSTER_INST2__RCOST:
        return rcost != RCOST_EDEFAULT;
      case DmPackage.MONSTER_INST2__PATHCOST:
        return pathcost != PATHCOST_EDEFAULT;
      case DmPackage.MONSTER_INST2__STARTDOM:
        return startdom != STARTDOM_EDEFAULT;
      case DmPackage.MONSTER_INST2__EYES:
        return eyes != EYES_EDEFAULT;
      case DmPackage.MONSTER_INST2__COPYSTATS:
        return copystats != COPYSTATS_EDEFAULT;
      case DmPackage.MONSTER_INST2__COPYSPR:
        return copyspr != COPYSPR_EDEFAULT;
      case DmPackage.MONSTER_INST2__RESTRICTEDGOD:
        return restrictedgod != RESTRICTEDGOD_EDEFAULT;
      case DmPackage.MONSTER_INST2__SHATTEREDSOUL:
        return shatteredsoul != SHATTEREDSOUL_EDEFAULT;
      case DmPackage.MONSTER_INST2__COLDRES:
        return coldres != COLDRES_EDEFAULT;
      case DmPackage.MONSTER_INST2__FIRERES:
        return fireres != FIRERES_EDEFAULT;
      case DmPackage.MONSTER_INST2__POISONRES:
        return poisonres != POISONRES_EDEFAULT;
      case DmPackage.MONSTER_INST2__SHOCKRES:
        return shockres != SHOCKRES_EDEFAULT;
      case DmPackage.MONSTER_INST2__DARKVISION:
        return darkvision != DARKVISION_EDEFAULT;
      case DmPackage.MONSTER_INST2__SEDUCE:
        return seduce != SEDUCE_EDEFAULT;
      case DmPackage.MONSTER_INST2__SUCCUBUS:
        return succubus != SUCCUBUS_EDEFAULT;
      case DmPackage.MONSTER_INST2__BECKON:
        return beckon != BECKON_EDEFAULT;
      case DmPackage.MONSTER_INST2__STARTAGE:
        return startage != STARTAGE_EDEFAULT;
      case DmPackage.MONSTER_INST2__MAXAGE:
        return maxage != MAXAGE_EDEFAULT;
      case DmPackage.MONSTER_INST2__OLDER:
        return older != OLDER_EDEFAULT;
      case DmPackage.MONSTER_INST2__HEALER:
        return healer != HEALER_EDEFAULT;
      case DmPackage.MONSTER_INST2__STARTAFF:
        return startaff != STARTAFF_EDEFAULT;
      case DmPackage.MONSTER_INST2__SUPPLYBONUS:
        return supplybonus != SUPPLYBONUS_EDEFAULT;
      case DmPackage.MONSTER_INST2__UWDAMAGE:
        return uwdamage != UWDAMAGE_EDEFAULT;
      case DmPackage.MONSTER_INST2__HOMESICK:
        return homesick != HOMESICK_EDEFAULT;
      case DmPackage.MONSTER_INST2__COLDPOWER:
        return coldpower != COLDPOWER_EDEFAULT;
      case DmPackage.MONSTER_INST2__FIREPOWER:
        return firepower != FIREPOWER_EDEFAULT;
      case DmPackage.MONSTER_INST2__STORMPOWER:
        return stormpower != STORMPOWER_EDEFAULT;
      case DmPackage.MONSTER_INST2__DARKPOWER:
        return darkpower != DARKPOWER_EDEFAULT;
      case DmPackage.MONSTER_INST2__SPRINGPOWER:
        return springpower != SPRINGPOWER_EDEFAULT;
      case DmPackage.MONSTER_INST2__SUMMERPOWER:
        return summerpower != SUMMERPOWER_EDEFAULT;
      case DmPackage.MONSTER_INST2__FALLPOWER:
        return fallpower != FALLPOWER_EDEFAULT;
      case DmPackage.MONSTER_INST2__WINTERPOWER:
        return winterpower != WINTERPOWER_EDEFAULT;
      case DmPackage.MONSTER_INST2__AMBIDEXTROUS:
        return ambidextrous != AMBIDEXTROUS_EDEFAULT;
      case DmPackage.MONSTER_INST2__BANEFIRESHIELD:
        return banefireshield != BANEFIRESHIELD_EDEFAULT;
      case DmPackage.MONSTER_INST2__BERSERK:
        return berserk != BERSERK_EDEFAULT;
      case DmPackage.MONSTER_INST2__STANDARD:
        return standard != STANDARD_EDEFAULT;
      case DmPackage.MONSTER_INST2__ANIMALAWE:
        return animalawe != ANIMALAWE_EDEFAULT;
      case DmPackage.MONSTER_INST2__AWE:
        return awe != AWE_EDEFAULT;
      case DmPackage.MONSTER_INST2__FEAR:
        return fear != FEAR_EDEFAULT;
      case DmPackage.MONSTER_INST2__REGENERATION:
        return regeneration != REGENERATION_EDEFAULT;
      case DmPackage.MONSTER_INST2__REINVIGORATION:
        return reinvigoration != REINVIGORATION_EDEFAULT;
      case DmPackage.MONSTER_INST2__FIRESHIELD:
        return fireshield != FIRESHIELD_EDEFAULT;
      case DmPackage.MONSTER_INST2__ICEPROT:
        return iceprot != ICEPROT_EDEFAULT;
      case DmPackage.MONSTER_INST2__POISONCLOUD:
        return poisoncloud != POISONCLOUD_EDEFAULT;
      case DmPackage.MONSTER_INST2__DISEASECLOUD:
        return diseasecloud != DISEASECLOUD_EDEFAULT;
      case DmPackage.MONSTER_INST2__BLOODVENGEANCE:
        return bloodvengeance != BLOODVENGEANCE_EDEFAULT;
      case DmPackage.MONSTER_INST2__CASTLEDEF:
        return castledef != CASTLEDEF_EDEFAULT;
      case DmPackage.MONSTER_INST2__SIEGEBONUS:
        return siegebonus != SIEGEBONUS_EDEFAULT;
      case DmPackage.MONSTER_INST2__PATROLBONUS:
        return patrolbonus != PATROLBONUS_EDEFAULT;
      case DmPackage.MONSTER_INST2__PILLAGEBONUS:
        return pillagebonus != PILLAGEBONUS_EDEFAULT;
      case DmPackage.MONSTER_INST2__RESEARCHBONUS:
        return researchbonus != RESEARCHBONUS_EDEFAULT;
      case DmPackage.MONSTER_INST2__FORGEBONUS:
        return forgebonus != FORGEBONUS_EDEFAULT;
      case DmPackage.MONSTER_INST2__DOUSE:
        return douse != DOUSE_EDEFAULT;
      case DmPackage.MONSTER_INST2__NOBADEVENTS:
        return nobadevents != NOBADEVENTS_EDEFAULT;
      case DmPackage.MONSTER_INST2__INCUNREST:
        return incunrest != INCUNREST_EDEFAULT;
      case DmPackage.MONSTER_INST2__SPREADDOM:
        return spreaddom != SPREADDOM_EDEFAULT;
      case DmPackage.MONSTER_INST2__LEPER:
        return leper != LEPER_EDEFAULT;
      case DmPackage.MONSTER_INST2__POPKILL:
        return popkill != POPKILL_EDEFAULT;
      case DmPackage.MONSTER_INST2__HERETIC:
        return heretic != HERETIC_EDEFAULT;
      case DmPackage.MONSTER_INST2__ITEMSLOTS:
        return itemslots != ITEMSLOTS_EDEFAULT;
      case DmPackage.MONSTER_INST2__NAMETYPE:
        return nametype != NAMETYPE_EDEFAULT;
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
    result.append(", speciallook: ");
    result.append(speciallook);
    result.append(", ap: ");
    result.append(ap);
    result.append(", mapmove: ");
    result.append(mapmove);
    result.append(", hp: ");
    result.append(hp);
    result.append(", prot: ");
    result.append(prot);
    result.append(", size: ");
    result.append(size);
    result.append(", ressize: ");
    result.append(ressize);
    result.append(", str: ");
    result.append(str);
    result.append(", enc: ");
    result.append(enc);
    result.append(", att: ");
    result.append(att);
    result.append(", def: ");
    result.append(def);
    result.append(", prec: ");
    result.append(prec);
    result.append(", mr: ");
    result.append(mr);
    result.append(", mor: ");
    result.append(mor);
    result.append(", gcost: ");
    result.append(gcost);
    result.append(", rcost: ");
    result.append(rcost);
    result.append(", pathcost: ");
    result.append(pathcost);
    result.append(", startdom: ");
    result.append(startdom);
    result.append(", eyes: ");
    result.append(eyes);
    result.append(", copystats: ");
    result.append(copystats);
    result.append(", copyspr: ");
    result.append(copyspr);
    result.append(", restrictedgod: ");
    result.append(restrictedgod);
    result.append(", shatteredsoul: ");
    result.append(shatteredsoul);
    result.append(", coldres: ");
    result.append(coldres);
    result.append(", fireres: ");
    result.append(fireres);
    result.append(", poisonres: ");
    result.append(poisonres);
    result.append(", shockres: ");
    result.append(shockres);
    result.append(", darkvision: ");
    result.append(darkvision);
    result.append(", seduce: ");
    result.append(seduce);
    result.append(", succubus: ");
    result.append(succubus);
    result.append(", beckon: ");
    result.append(beckon);
    result.append(", startage: ");
    result.append(startage);
    result.append(", maxage: ");
    result.append(maxage);
    result.append(", older: ");
    result.append(older);
    result.append(", healer: ");
    result.append(healer);
    result.append(", startaff: ");
    result.append(startaff);
    result.append(", supplybonus: ");
    result.append(supplybonus);
    result.append(", uwdamage: ");
    result.append(uwdamage);
    result.append(", homesick: ");
    result.append(homesick);
    result.append(", coldpower: ");
    result.append(coldpower);
    result.append(", firepower: ");
    result.append(firepower);
    result.append(", stormpower: ");
    result.append(stormpower);
    result.append(", darkpower: ");
    result.append(darkpower);
    result.append(", springpower: ");
    result.append(springpower);
    result.append(", summerpower: ");
    result.append(summerpower);
    result.append(", fallpower: ");
    result.append(fallpower);
    result.append(", winterpower: ");
    result.append(winterpower);
    result.append(", ambidextrous: ");
    result.append(ambidextrous);
    result.append(", banefireshield: ");
    result.append(banefireshield);
    result.append(", berserk: ");
    result.append(berserk);
    result.append(", standard: ");
    result.append(standard);
    result.append(", animalawe: ");
    result.append(animalawe);
    result.append(", awe: ");
    result.append(awe);
    result.append(", fear: ");
    result.append(fear);
    result.append(", regeneration: ");
    result.append(regeneration);
    result.append(", reinvigoration: ");
    result.append(reinvigoration);
    result.append(", fireshield: ");
    result.append(fireshield);
    result.append(", iceprot: ");
    result.append(iceprot);
    result.append(", poisoncloud: ");
    result.append(poisoncloud);
    result.append(", diseasecloud: ");
    result.append(diseasecloud);
    result.append(", bloodvengeance: ");
    result.append(bloodvengeance);
    result.append(", castledef: ");
    result.append(castledef);
    result.append(", siegebonus: ");
    result.append(siegebonus);
    result.append(", patrolbonus: ");
    result.append(patrolbonus);
    result.append(", pillagebonus: ");
    result.append(pillagebonus);
    result.append(", researchbonus: ");
    result.append(researchbonus);
    result.append(", forgebonus: ");
    result.append(forgebonus);
    result.append(", douse: ");
    result.append(douse);
    result.append(", nobadevents: ");
    result.append(nobadevents);
    result.append(", incunrest: ");
    result.append(incunrest);
    result.append(", spreaddom: ");
    result.append(spreaddom);
    result.append(", leper: ");
    result.append(leper);
    result.append(", popkill: ");
    result.append(popkill);
    result.append(", heretic: ");
    result.append(heretic);
    result.append(", itemslots: ");
    result.append(itemslots);
    result.append(", nametype: ");
    result.append(nametype);
    result.append(')');
    return result.toString();
  }

} //MonsterInst2Impl
