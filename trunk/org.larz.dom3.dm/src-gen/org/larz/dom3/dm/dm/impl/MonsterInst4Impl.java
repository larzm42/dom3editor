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
import org.larz.dom3.dm.dm.MonsterInst4;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monster Inst4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isClear <em>Clear</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isClearweapons <em>Clearweapons</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isCleararmor <em>Cleararmor</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isClearmagic <em>Clearmagic</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isClearspec <em>Clearspec</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isFemale <em>Female</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isMounted <em>Mounted</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isHoly <em>Holy</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isAnimal <em>Animal</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isUndead <em>Undead</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isDemon <em>Demon</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isMagicbeing <em>Magicbeing</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isStonebeing <em>Stonebeing</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isInanimate <em>Inanimate</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isColdblood <em>Coldblood</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isImmortal <em>Immortal</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isBlind <em>Blind</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isImmobile <em>Immobile</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isAquatic <em>Aquatic</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isAmphibian <em>Amphibian</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isPooramphibian <em>Pooramphibian</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isFlying <em>Flying</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isStormimmune <em>Stormimmune</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isSailing <em>Sailing</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isForestsurvival <em>Forestsurvival</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isMountainsurvival <em>Mountainsurvival</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isSwampsurvival <em>Swampsurvival</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isWastesurvival <em>Wastesurvival</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isIllusion <em>Illusion</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isSpy <em>Spy</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isAssassin <em>Assassin</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isHeal <em>Heal</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isNoheal <em>Noheal</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isNeednoteat <em>Neednoteat</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isEthereal <em>Ethereal</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isTrample <em>Trample</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isEntangle <em>Entangle</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isEyeloss <em>Eyeloss</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isHorrormark <em>Horrormark</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isPoisonarmor <em>Poisonarmor</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isInquisitor <em>Inquisitor</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isNoitem <em>Noitem</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isDrainimmune <em>Drainimmune</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isNoleader <em>Noleader</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isPoorleader <em>Poorleader</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isOkleader <em>Okleader</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isGoodleader <em>Goodleader</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isExpertleader <em>Expertleader</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isSuperiorleader <em>Superiorleader</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isNomagicleader <em>Nomagicleader</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isPoormagicleader <em>Poormagicleader</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isOkmagicleader <em>Okmagicleader</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isGoodmagicleader <em>Goodmagicleader</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isExpertmagicleader <em>Expertmagicleader</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isSuperiormagicleader <em>Superiormagicleader</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isNoundeadleader <em>Noundeadleader</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isPoorundeadleader <em>Poorundeadleader</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isOkundeadleader <em>Okundeadleader</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isGoodundeadleader <em>Goodundeadleader</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isExpertundeadleader <em>Expertundeadleader</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl#isSuperiorundeadleader <em>Superiorundeadleader</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MonsterInst4Impl extends MonsterPattern4Impl implements MonsterInst4
{
  /**
   * The default value of the '{@link #isClear() <em>Clear</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isClear()
   * @generated
   * @ordered
   */
  protected static final boolean CLEAR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isClear() <em>Clear</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isClear()
   * @generated
   * @ordered
   */
  protected boolean clear = CLEAR_EDEFAULT;

  /**
   * The default value of the '{@link #isClearweapons() <em>Clearweapons</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isClearweapons()
   * @generated
   * @ordered
   */
  protected static final boolean CLEARWEAPONS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isClearweapons() <em>Clearweapons</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isClearweapons()
   * @generated
   * @ordered
   */
  protected boolean clearweapons = CLEARWEAPONS_EDEFAULT;

  /**
   * The default value of the '{@link #isCleararmor() <em>Cleararmor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCleararmor()
   * @generated
   * @ordered
   */
  protected static final boolean CLEARARMOR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCleararmor() <em>Cleararmor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCleararmor()
   * @generated
   * @ordered
   */
  protected boolean cleararmor = CLEARARMOR_EDEFAULT;

  /**
   * The default value of the '{@link #isClearmagic() <em>Clearmagic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isClearmagic()
   * @generated
   * @ordered
   */
  protected static final boolean CLEARMAGIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isClearmagic() <em>Clearmagic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isClearmagic()
   * @generated
   * @ordered
   */
  protected boolean clearmagic = CLEARMAGIC_EDEFAULT;

  /**
   * The default value of the '{@link #isClearspec() <em>Clearspec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isClearspec()
   * @generated
   * @ordered
   */
  protected static final boolean CLEARSPEC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isClearspec() <em>Clearspec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isClearspec()
   * @generated
   * @ordered
   */
  protected boolean clearspec = CLEARSPEC_EDEFAULT;

  /**
   * The default value of the '{@link #isFemale() <em>Female</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFemale()
   * @generated
   * @ordered
   */
  protected static final boolean FEMALE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFemale() <em>Female</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFemale()
   * @generated
   * @ordered
   */
  protected boolean female = FEMALE_EDEFAULT;

  /**
   * The default value of the '{@link #isMounted() <em>Mounted</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMounted()
   * @generated
   * @ordered
   */
  protected static final boolean MOUNTED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMounted() <em>Mounted</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMounted()
   * @generated
   * @ordered
   */
  protected boolean mounted = MOUNTED_EDEFAULT;

  /**
   * The default value of the '{@link #isHoly() <em>Holy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHoly()
   * @generated
   * @ordered
   */
  protected static final boolean HOLY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHoly() <em>Holy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHoly()
   * @generated
   * @ordered
   */
  protected boolean holy = HOLY_EDEFAULT;

  /**
   * The default value of the '{@link #isAnimal() <em>Animal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAnimal()
   * @generated
   * @ordered
   */
  protected static final boolean ANIMAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAnimal() <em>Animal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAnimal()
   * @generated
   * @ordered
   */
  protected boolean animal = ANIMAL_EDEFAULT;

  /**
   * The default value of the '{@link #isUndead() <em>Undead</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUndead()
   * @generated
   * @ordered
   */
  protected static final boolean UNDEAD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUndead() <em>Undead</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUndead()
   * @generated
   * @ordered
   */
  protected boolean undead = UNDEAD_EDEFAULT;

  /**
   * The default value of the '{@link #isDemon() <em>Demon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDemon()
   * @generated
   * @ordered
   */
  protected static final boolean DEMON_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDemon() <em>Demon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDemon()
   * @generated
   * @ordered
   */
  protected boolean demon = DEMON_EDEFAULT;

  /**
   * The default value of the '{@link #isMagicbeing() <em>Magicbeing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMagicbeing()
   * @generated
   * @ordered
   */
  protected static final boolean MAGICBEING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMagicbeing() <em>Magicbeing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMagicbeing()
   * @generated
   * @ordered
   */
  protected boolean magicbeing = MAGICBEING_EDEFAULT;

  /**
   * The default value of the '{@link #isStonebeing() <em>Stonebeing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStonebeing()
   * @generated
   * @ordered
   */
  protected static final boolean STONEBEING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStonebeing() <em>Stonebeing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStonebeing()
   * @generated
   * @ordered
   */
  protected boolean stonebeing = STONEBEING_EDEFAULT;

  /**
   * The default value of the '{@link #isInanimate() <em>Inanimate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInanimate()
   * @generated
   * @ordered
   */
  protected static final boolean INANIMATE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInanimate() <em>Inanimate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInanimate()
   * @generated
   * @ordered
   */
  protected boolean inanimate = INANIMATE_EDEFAULT;

  /**
   * The default value of the '{@link #isColdblood() <em>Coldblood</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isColdblood()
   * @generated
   * @ordered
   */
  protected static final boolean COLDBLOOD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isColdblood() <em>Coldblood</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isColdblood()
   * @generated
   * @ordered
   */
  protected boolean coldblood = COLDBLOOD_EDEFAULT;

  /**
   * The default value of the '{@link #isImmortal() <em>Immortal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isImmortal()
   * @generated
   * @ordered
   */
  protected static final boolean IMMORTAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isImmortal() <em>Immortal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isImmortal()
   * @generated
   * @ordered
   */
  protected boolean immortal = IMMORTAL_EDEFAULT;

  /**
   * The default value of the '{@link #isBlind() <em>Blind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBlind()
   * @generated
   * @ordered
   */
  protected static final boolean BLIND_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBlind() <em>Blind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBlind()
   * @generated
   * @ordered
   */
  protected boolean blind = BLIND_EDEFAULT;

  /**
   * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnique()
   * @generated
   * @ordered
   */
  protected static final boolean UNIQUE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnique()
   * @generated
   * @ordered
   */
  protected boolean unique = UNIQUE_EDEFAULT;

  /**
   * The default value of the '{@link #isImmobile() <em>Immobile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isImmobile()
   * @generated
   * @ordered
   */
  protected static final boolean IMMOBILE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isImmobile() <em>Immobile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isImmobile()
   * @generated
   * @ordered
   */
  protected boolean immobile = IMMOBILE_EDEFAULT;

  /**
   * The default value of the '{@link #isAquatic() <em>Aquatic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAquatic()
   * @generated
   * @ordered
   */
  protected static final boolean AQUATIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAquatic() <em>Aquatic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAquatic()
   * @generated
   * @ordered
   */
  protected boolean aquatic = AQUATIC_EDEFAULT;

  /**
   * The default value of the '{@link #isAmphibian() <em>Amphibian</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAmphibian()
   * @generated
   * @ordered
   */
  protected static final boolean AMPHIBIAN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAmphibian() <em>Amphibian</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAmphibian()
   * @generated
   * @ordered
   */
  protected boolean amphibian = AMPHIBIAN_EDEFAULT;

  /**
   * The default value of the '{@link #isPooramphibian() <em>Pooramphibian</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPooramphibian()
   * @generated
   * @ordered
   */
  protected static final boolean POORAMPHIBIAN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPooramphibian() <em>Pooramphibian</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPooramphibian()
   * @generated
   * @ordered
   */
  protected boolean pooramphibian = POORAMPHIBIAN_EDEFAULT;

  /**
   * The default value of the '{@link #isFlying() <em>Flying</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFlying()
   * @generated
   * @ordered
   */
  protected static final boolean FLYING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFlying() <em>Flying</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFlying()
   * @generated
   * @ordered
   */
  protected boolean flying = FLYING_EDEFAULT;

  /**
   * The default value of the '{@link #isStormimmune() <em>Stormimmune</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStormimmune()
   * @generated
   * @ordered
   */
  protected static final boolean STORMIMMUNE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStormimmune() <em>Stormimmune</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStormimmune()
   * @generated
   * @ordered
   */
  protected boolean stormimmune = STORMIMMUNE_EDEFAULT;

  /**
   * The default value of the '{@link #isSailing() <em>Sailing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSailing()
   * @generated
   * @ordered
   */
  protected static final boolean SAILING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSailing() <em>Sailing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSailing()
   * @generated
   * @ordered
   */
  protected boolean sailing = SAILING_EDEFAULT;

  /**
   * The default value of the '{@link #isForestsurvival() <em>Forestsurvival</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isForestsurvival()
   * @generated
   * @ordered
   */
  protected static final boolean FORESTSURVIVAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isForestsurvival() <em>Forestsurvival</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isForestsurvival()
   * @generated
   * @ordered
   */
  protected boolean forestsurvival = FORESTSURVIVAL_EDEFAULT;

  /**
   * The default value of the '{@link #isMountainsurvival() <em>Mountainsurvival</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMountainsurvival()
   * @generated
   * @ordered
   */
  protected static final boolean MOUNTAINSURVIVAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMountainsurvival() <em>Mountainsurvival</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMountainsurvival()
   * @generated
   * @ordered
   */
  protected boolean mountainsurvival = MOUNTAINSURVIVAL_EDEFAULT;

  /**
   * The default value of the '{@link #isSwampsurvival() <em>Swampsurvival</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSwampsurvival()
   * @generated
   * @ordered
   */
  protected static final boolean SWAMPSURVIVAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSwampsurvival() <em>Swampsurvival</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSwampsurvival()
   * @generated
   * @ordered
   */
  protected boolean swampsurvival = SWAMPSURVIVAL_EDEFAULT;

  /**
   * The default value of the '{@link #isWastesurvival() <em>Wastesurvival</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWastesurvival()
   * @generated
   * @ordered
   */
  protected static final boolean WASTESURVIVAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isWastesurvival() <em>Wastesurvival</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWastesurvival()
   * @generated
   * @ordered
   */
  protected boolean wastesurvival = WASTESURVIVAL_EDEFAULT;

  /**
   * The default value of the '{@link #isIllusion() <em>Illusion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIllusion()
   * @generated
   * @ordered
   */
  protected static final boolean ILLUSION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIllusion() <em>Illusion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIllusion()
   * @generated
   * @ordered
   */
  protected boolean illusion = ILLUSION_EDEFAULT;

  /**
   * The default value of the '{@link #isSpy() <em>Spy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSpy()
   * @generated
   * @ordered
   */
  protected static final boolean SPY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSpy() <em>Spy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSpy()
   * @generated
   * @ordered
   */
  protected boolean spy = SPY_EDEFAULT;

  /**
   * The default value of the '{@link #isAssassin() <em>Assassin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAssassin()
   * @generated
   * @ordered
   */
  protected static final boolean ASSASSIN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAssassin() <em>Assassin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAssassin()
   * @generated
   * @ordered
   */
  protected boolean assassin = ASSASSIN_EDEFAULT;

  /**
   * The default value of the '{@link #isHeal() <em>Heal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHeal()
   * @generated
   * @ordered
   */
  protected static final boolean HEAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHeal() <em>Heal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHeal()
   * @generated
   * @ordered
   */
  protected boolean heal = HEAL_EDEFAULT;

  /**
   * The default value of the '{@link #isNoheal() <em>Noheal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNoheal()
   * @generated
   * @ordered
   */
  protected static final boolean NOHEAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNoheal() <em>Noheal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNoheal()
   * @generated
   * @ordered
   */
  protected boolean noheal = NOHEAL_EDEFAULT;

  /**
   * The default value of the '{@link #isNeednoteat() <em>Neednoteat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNeednoteat()
   * @generated
   * @ordered
   */
  protected static final boolean NEEDNOTEAT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNeednoteat() <em>Neednoteat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNeednoteat()
   * @generated
   * @ordered
   */
  protected boolean neednoteat = NEEDNOTEAT_EDEFAULT;

  /**
   * The default value of the '{@link #isEthereal() <em>Ethereal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEthereal()
   * @generated
   * @ordered
   */
  protected static final boolean ETHEREAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEthereal() <em>Ethereal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEthereal()
   * @generated
   * @ordered
   */
  protected boolean ethereal = ETHEREAL_EDEFAULT;

  /**
   * The default value of the '{@link #isTrample() <em>Trample</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTrample()
   * @generated
   * @ordered
   */
  protected static final boolean TRAMPLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTrample() <em>Trample</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTrample()
   * @generated
   * @ordered
   */
  protected boolean trample = TRAMPLE_EDEFAULT;

  /**
   * The default value of the '{@link #isEntangle() <em>Entangle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEntangle()
   * @generated
   * @ordered
   */
  protected static final boolean ENTANGLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEntangle() <em>Entangle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEntangle()
   * @generated
   * @ordered
   */
  protected boolean entangle = ENTANGLE_EDEFAULT;

  /**
   * The default value of the '{@link #isEyeloss() <em>Eyeloss</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEyeloss()
   * @generated
   * @ordered
   */
  protected static final boolean EYELOSS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEyeloss() <em>Eyeloss</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEyeloss()
   * @generated
   * @ordered
   */
  protected boolean eyeloss = EYELOSS_EDEFAULT;

  /**
   * The default value of the '{@link #isHorrormark() <em>Horrormark</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHorrormark()
   * @generated
   * @ordered
   */
  protected static final boolean HORRORMARK_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHorrormark() <em>Horrormark</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHorrormark()
   * @generated
   * @ordered
   */
  protected boolean horrormark = HORRORMARK_EDEFAULT;

  /**
   * The default value of the '{@link #isPoisonarmor() <em>Poisonarmor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPoisonarmor()
   * @generated
   * @ordered
   */
  protected static final boolean POISONARMOR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPoisonarmor() <em>Poisonarmor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPoisonarmor()
   * @generated
   * @ordered
   */
  protected boolean poisonarmor = POISONARMOR_EDEFAULT;

  /**
   * The default value of the '{@link #isInquisitor() <em>Inquisitor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInquisitor()
   * @generated
   * @ordered
   */
  protected static final boolean INQUISITOR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInquisitor() <em>Inquisitor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInquisitor()
   * @generated
   * @ordered
   */
  protected boolean inquisitor = INQUISITOR_EDEFAULT;

  /**
   * The default value of the '{@link #isNoitem() <em>Noitem</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNoitem()
   * @generated
   * @ordered
   */
  protected static final boolean NOITEM_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNoitem() <em>Noitem</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNoitem()
   * @generated
   * @ordered
   */
  protected boolean noitem = NOITEM_EDEFAULT;

  /**
   * The default value of the '{@link #isDrainimmune() <em>Drainimmune</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDrainimmune()
   * @generated
   * @ordered
   */
  protected static final boolean DRAINIMMUNE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDrainimmune() <em>Drainimmune</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDrainimmune()
   * @generated
   * @ordered
   */
  protected boolean drainimmune = DRAINIMMUNE_EDEFAULT;

  /**
   * The default value of the '{@link #isNoleader() <em>Noleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNoleader()
   * @generated
   * @ordered
   */
  protected static final boolean NOLEADER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNoleader() <em>Noleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNoleader()
   * @generated
   * @ordered
   */
  protected boolean noleader = NOLEADER_EDEFAULT;

  /**
   * The default value of the '{@link #isPoorleader() <em>Poorleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPoorleader()
   * @generated
   * @ordered
   */
  protected static final boolean POORLEADER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPoorleader() <em>Poorleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPoorleader()
   * @generated
   * @ordered
   */
  protected boolean poorleader = POORLEADER_EDEFAULT;

  /**
   * The default value of the '{@link #isOkleader() <em>Okleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOkleader()
   * @generated
   * @ordered
   */
  protected static final boolean OKLEADER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOkleader() <em>Okleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOkleader()
   * @generated
   * @ordered
   */
  protected boolean okleader = OKLEADER_EDEFAULT;

  /**
   * The default value of the '{@link #isGoodleader() <em>Goodleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGoodleader()
   * @generated
   * @ordered
   */
  protected static final boolean GOODLEADER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isGoodleader() <em>Goodleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGoodleader()
   * @generated
   * @ordered
   */
  protected boolean goodleader = GOODLEADER_EDEFAULT;

  /**
   * The default value of the '{@link #isExpertleader() <em>Expertleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExpertleader()
   * @generated
   * @ordered
   */
  protected static final boolean EXPERTLEADER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExpertleader() <em>Expertleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExpertleader()
   * @generated
   * @ordered
   */
  protected boolean expertleader = EXPERTLEADER_EDEFAULT;

  /**
   * The default value of the '{@link #isSuperiorleader() <em>Superiorleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSuperiorleader()
   * @generated
   * @ordered
   */
  protected static final boolean SUPERIORLEADER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSuperiorleader() <em>Superiorleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSuperiorleader()
   * @generated
   * @ordered
   */
  protected boolean superiorleader = SUPERIORLEADER_EDEFAULT;

  /**
   * The default value of the '{@link #isNomagicleader() <em>Nomagicleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNomagicleader()
   * @generated
   * @ordered
   */
  protected static final boolean NOMAGICLEADER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNomagicleader() <em>Nomagicleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNomagicleader()
   * @generated
   * @ordered
   */
  protected boolean nomagicleader = NOMAGICLEADER_EDEFAULT;

  /**
   * The default value of the '{@link #isPoormagicleader() <em>Poormagicleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPoormagicleader()
   * @generated
   * @ordered
   */
  protected static final boolean POORMAGICLEADER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPoormagicleader() <em>Poormagicleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPoormagicleader()
   * @generated
   * @ordered
   */
  protected boolean poormagicleader = POORMAGICLEADER_EDEFAULT;

  /**
   * The default value of the '{@link #isOkmagicleader() <em>Okmagicleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOkmagicleader()
   * @generated
   * @ordered
   */
  protected static final boolean OKMAGICLEADER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOkmagicleader() <em>Okmagicleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOkmagicleader()
   * @generated
   * @ordered
   */
  protected boolean okmagicleader = OKMAGICLEADER_EDEFAULT;

  /**
   * The default value of the '{@link #isGoodmagicleader() <em>Goodmagicleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGoodmagicleader()
   * @generated
   * @ordered
   */
  protected static final boolean GOODMAGICLEADER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isGoodmagicleader() <em>Goodmagicleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGoodmagicleader()
   * @generated
   * @ordered
   */
  protected boolean goodmagicleader = GOODMAGICLEADER_EDEFAULT;

  /**
   * The default value of the '{@link #isExpertmagicleader() <em>Expertmagicleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExpertmagicleader()
   * @generated
   * @ordered
   */
  protected static final boolean EXPERTMAGICLEADER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExpertmagicleader() <em>Expertmagicleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExpertmagicleader()
   * @generated
   * @ordered
   */
  protected boolean expertmagicleader = EXPERTMAGICLEADER_EDEFAULT;

  /**
   * The default value of the '{@link #isSuperiormagicleader() <em>Superiormagicleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSuperiormagicleader()
   * @generated
   * @ordered
   */
  protected static final boolean SUPERIORMAGICLEADER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSuperiormagicleader() <em>Superiormagicleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSuperiormagicleader()
   * @generated
   * @ordered
   */
  protected boolean superiormagicleader = SUPERIORMAGICLEADER_EDEFAULT;

  /**
   * The default value of the '{@link #isNoundeadleader() <em>Noundeadleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNoundeadleader()
   * @generated
   * @ordered
   */
  protected static final boolean NOUNDEADLEADER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNoundeadleader() <em>Noundeadleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNoundeadleader()
   * @generated
   * @ordered
   */
  protected boolean noundeadleader = NOUNDEADLEADER_EDEFAULT;

  /**
   * The default value of the '{@link #isPoorundeadleader() <em>Poorundeadleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPoorundeadleader()
   * @generated
   * @ordered
   */
  protected static final boolean POORUNDEADLEADER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPoorundeadleader() <em>Poorundeadleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPoorundeadleader()
   * @generated
   * @ordered
   */
  protected boolean poorundeadleader = POORUNDEADLEADER_EDEFAULT;

  /**
   * The default value of the '{@link #isOkundeadleader() <em>Okundeadleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOkundeadleader()
   * @generated
   * @ordered
   */
  protected static final boolean OKUNDEADLEADER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOkundeadleader() <em>Okundeadleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOkundeadleader()
   * @generated
   * @ordered
   */
  protected boolean okundeadleader = OKUNDEADLEADER_EDEFAULT;

  /**
   * The default value of the '{@link #isGoodundeadleader() <em>Goodundeadleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGoodundeadleader()
   * @generated
   * @ordered
   */
  protected static final boolean GOODUNDEADLEADER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isGoodundeadleader() <em>Goodundeadleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGoodundeadleader()
   * @generated
   * @ordered
   */
  protected boolean goodundeadleader = GOODUNDEADLEADER_EDEFAULT;

  /**
   * The default value of the '{@link #isExpertundeadleader() <em>Expertundeadleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExpertundeadleader()
   * @generated
   * @ordered
   */
  protected static final boolean EXPERTUNDEADLEADER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExpertundeadleader() <em>Expertundeadleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExpertundeadleader()
   * @generated
   * @ordered
   */
  protected boolean expertundeadleader = EXPERTUNDEADLEADER_EDEFAULT;

  /**
   * The default value of the '{@link #isSuperiorundeadleader() <em>Superiorundeadleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSuperiorundeadleader()
   * @generated
   * @ordered
   */
  protected static final boolean SUPERIORUNDEADLEADER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSuperiorundeadleader() <em>Superiorundeadleader</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSuperiorundeadleader()
   * @generated
   * @ordered
   */
  protected boolean superiorundeadleader = SUPERIORUNDEADLEADER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MonsterInst4Impl()
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
    return DmPackage.eINSTANCE.getMonsterInst4();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isClear()
  {
    return clear;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClear(boolean newClear)
  {
    boolean oldClear = clear;
    clear = newClear;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__CLEAR, oldClear, clear));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isClearweapons()
  {
    return clearweapons;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClearweapons(boolean newClearweapons)
  {
    boolean oldClearweapons = clearweapons;
    clearweapons = newClearweapons;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__CLEARWEAPONS, oldClearweapons, clearweapons));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCleararmor()
  {
    return cleararmor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCleararmor(boolean newCleararmor)
  {
    boolean oldCleararmor = cleararmor;
    cleararmor = newCleararmor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__CLEARARMOR, oldCleararmor, cleararmor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isClearmagic()
  {
    return clearmagic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClearmagic(boolean newClearmagic)
  {
    boolean oldClearmagic = clearmagic;
    clearmagic = newClearmagic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__CLEARMAGIC, oldClearmagic, clearmagic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isClearspec()
  {
    return clearspec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClearspec(boolean newClearspec)
  {
    boolean oldClearspec = clearspec;
    clearspec = newClearspec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__CLEARSPEC, oldClearspec, clearspec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFemale()
  {
    return female;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFemale(boolean newFemale)
  {
    boolean oldFemale = female;
    female = newFemale;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__FEMALE, oldFemale, female));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMounted()
  {
    return mounted;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMounted(boolean newMounted)
  {
    boolean oldMounted = mounted;
    mounted = newMounted;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__MOUNTED, oldMounted, mounted));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHoly()
  {
    return holy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHoly(boolean newHoly)
  {
    boolean oldHoly = holy;
    holy = newHoly;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__HOLY, oldHoly, holy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAnimal()
  {
    return animal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnimal(boolean newAnimal)
  {
    boolean oldAnimal = animal;
    animal = newAnimal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__ANIMAL, oldAnimal, animal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUndead()
  {
    return undead;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUndead(boolean newUndead)
  {
    boolean oldUndead = undead;
    undead = newUndead;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__UNDEAD, oldUndead, undead));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDemon()
  {
    return demon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDemon(boolean newDemon)
  {
    boolean oldDemon = demon;
    demon = newDemon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__DEMON, oldDemon, demon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMagicbeing()
  {
    return magicbeing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMagicbeing(boolean newMagicbeing)
  {
    boolean oldMagicbeing = magicbeing;
    magicbeing = newMagicbeing;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__MAGICBEING, oldMagicbeing, magicbeing));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStonebeing()
  {
    return stonebeing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStonebeing(boolean newStonebeing)
  {
    boolean oldStonebeing = stonebeing;
    stonebeing = newStonebeing;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__STONEBEING, oldStonebeing, stonebeing));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInanimate()
  {
    return inanimate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInanimate(boolean newInanimate)
  {
    boolean oldInanimate = inanimate;
    inanimate = newInanimate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__INANIMATE, oldInanimate, inanimate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isColdblood()
  {
    return coldblood;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColdblood(boolean newColdblood)
  {
    boolean oldColdblood = coldblood;
    coldblood = newColdblood;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__COLDBLOOD, oldColdblood, coldblood));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isImmortal()
  {
    return immortal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImmortal(boolean newImmortal)
  {
    boolean oldImmortal = immortal;
    immortal = newImmortal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__IMMORTAL, oldImmortal, immortal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBlind()
  {
    return blind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlind(boolean newBlind)
  {
    boolean oldBlind = blind;
    blind = newBlind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__BLIND, oldBlind, blind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUnique()
  {
    return unique;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnique(boolean newUnique)
  {
    boolean oldUnique = unique;
    unique = newUnique;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__UNIQUE, oldUnique, unique));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isImmobile()
  {
    return immobile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImmobile(boolean newImmobile)
  {
    boolean oldImmobile = immobile;
    immobile = newImmobile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__IMMOBILE, oldImmobile, immobile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAquatic()
  {
    return aquatic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAquatic(boolean newAquatic)
  {
    boolean oldAquatic = aquatic;
    aquatic = newAquatic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__AQUATIC, oldAquatic, aquatic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAmphibian()
  {
    return amphibian;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAmphibian(boolean newAmphibian)
  {
    boolean oldAmphibian = amphibian;
    amphibian = newAmphibian;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__AMPHIBIAN, oldAmphibian, amphibian));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPooramphibian()
  {
    return pooramphibian;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPooramphibian(boolean newPooramphibian)
  {
    boolean oldPooramphibian = pooramphibian;
    pooramphibian = newPooramphibian;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__POORAMPHIBIAN, oldPooramphibian, pooramphibian));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFlying()
  {
    return flying;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFlying(boolean newFlying)
  {
    boolean oldFlying = flying;
    flying = newFlying;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__FLYING, oldFlying, flying));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStormimmune()
  {
    return stormimmune;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStormimmune(boolean newStormimmune)
  {
    boolean oldStormimmune = stormimmune;
    stormimmune = newStormimmune;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__STORMIMMUNE, oldStormimmune, stormimmune));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSailing()
  {
    return sailing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSailing(boolean newSailing)
  {
    boolean oldSailing = sailing;
    sailing = newSailing;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__SAILING, oldSailing, sailing));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isForestsurvival()
  {
    return forestsurvival;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForestsurvival(boolean newForestsurvival)
  {
    boolean oldForestsurvival = forestsurvival;
    forestsurvival = newForestsurvival;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__FORESTSURVIVAL, oldForestsurvival, forestsurvival));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMountainsurvival()
  {
    return mountainsurvival;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMountainsurvival(boolean newMountainsurvival)
  {
    boolean oldMountainsurvival = mountainsurvival;
    mountainsurvival = newMountainsurvival;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__MOUNTAINSURVIVAL, oldMountainsurvival, mountainsurvival));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSwampsurvival()
  {
    return swampsurvival;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSwampsurvival(boolean newSwampsurvival)
  {
    boolean oldSwampsurvival = swampsurvival;
    swampsurvival = newSwampsurvival;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__SWAMPSURVIVAL, oldSwampsurvival, swampsurvival));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isWastesurvival()
  {
    return wastesurvival;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWastesurvival(boolean newWastesurvival)
  {
    boolean oldWastesurvival = wastesurvival;
    wastesurvival = newWastesurvival;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__WASTESURVIVAL, oldWastesurvival, wastesurvival));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIllusion()
  {
    return illusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIllusion(boolean newIllusion)
  {
    boolean oldIllusion = illusion;
    illusion = newIllusion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__ILLUSION, oldIllusion, illusion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSpy()
  {
    return spy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpy(boolean newSpy)
  {
    boolean oldSpy = spy;
    spy = newSpy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__SPY, oldSpy, spy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAssassin()
  {
    return assassin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssassin(boolean newAssassin)
  {
    boolean oldAssassin = assassin;
    assassin = newAssassin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__ASSASSIN, oldAssassin, assassin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHeal()
  {
    return heal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeal(boolean newHeal)
  {
    boolean oldHeal = heal;
    heal = newHeal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__HEAL, oldHeal, heal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNoheal()
  {
    return noheal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNoheal(boolean newNoheal)
  {
    boolean oldNoheal = noheal;
    noheal = newNoheal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__NOHEAL, oldNoheal, noheal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNeednoteat()
  {
    return neednoteat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNeednoteat(boolean newNeednoteat)
  {
    boolean oldNeednoteat = neednoteat;
    neednoteat = newNeednoteat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__NEEDNOTEAT, oldNeednoteat, neednoteat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEthereal()
  {
    return ethereal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEthereal(boolean newEthereal)
  {
    boolean oldEthereal = ethereal;
    ethereal = newEthereal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__ETHEREAL, oldEthereal, ethereal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTrample()
  {
    return trample;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrample(boolean newTrample)
  {
    boolean oldTrample = trample;
    trample = newTrample;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__TRAMPLE, oldTrample, trample));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEntangle()
  {
    return entangle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntangle(boolean newEntangle)
  {
    boolean oldEntangle = entangle;
    entangle = newEntangle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__ENTANGLE, oldEntangle, entangle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEyeloss()
  {
    return eyeloss;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEyeloss(boolean newEyeloss)
  {
    boolean oldEyeloss = eyeloss;
    eyeloss = newEyeloss;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__EYELOSS, oldEyeloss, eyeloss));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHorrormark()
  {
    return horrormark;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHorrormark(boolean newHorrormark)
  {
    boolean oldHorrormark = horrormark;
    horrormark = newHorrormark;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__HORRORMARK, oldHorrormark, horrormark));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPoisonarmor()
  {
    return poisonarmor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPoisonarmor(boolean newPoisonarmor)
  {
    boolean oldPoisonarmor = poisonarmor;
    poisonarmor = newPoisonarmor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__POISONARMOR, oldPoisonarmor, poisonarmor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInquisitor()
  {
    return inquisitor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInquisitor(boolean newInquisitor)
  {
    boolean oldInquisitor = inquisitor;
    inquisitor = newInquisitor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__INQUISITOR, oldInquisitor, inquisitor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNoitem()
  {
    return noitem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNoitem(boolean newNoitem)
  {
    boolean oldNoitem = noitem;
    noitem = newNoitem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__NOITEM, oldNoitem, noitem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDrainimmune()
  {
    return drainimmune;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDrainimmune(boolean newDrainimmune)
  {
    boolean oldDrainimmune = drainimmune;
    drainimmune = newDrainimmune;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__DRAINIMMUNE, oldDrainimmune, drainimmune));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNoleader()
  {
    return noleader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNoleader(boolean newNoleader)
  {
    boolean oldNoleader = noleader;
    noleader = newNoleader;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__NOLEADER, oldNoleader, noleader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPoorleader()
  {
    return poorleader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPoorleader(boolean newPoorleader)
  {
    boolean oldPoorleader = poorleader;
    poorleader = newPoorleader;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__POORLEADER, oldPoorleader, poorleader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOkleader()
  {
    return okleader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOkleader(boolean newOkleader)
  {
    boolean oldOkleader = okleader;
    okleader = newOkleader;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__OKLEADER, oldOkleader, okleader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isGoodleader()
  {
    return goodleader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGoodleader(boolean newGoodleader)
  {
    boolean oldGoodleader = goodleader;
    goodleader = newGoodleader;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__GOODLEADER, oldGoodleader, goodleader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExpertleader()
  {
    return expertleader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpertleader(boolean newExpertleader)
  {
    boolean oldExpertleader = expertleader;
    expertleader = newExpertleader;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__EXPERTLEADER, oldExpertleader, expertleader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSuperiorleader()
  {
    return superiorleader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperiorleader(boolean newSuperiorleader)
  {
    boolean oldSuperiorleader = superiorleader;
    superiorleader = newSuperiorleader;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__SUPERIORLEADER, oldSuperiorleader, superiorleader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNomagicleader()
  {
    return nomagicleader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNomagicleader(boolean newNomagicleader)
  {
    boolean oldNomagicleader = nomagicleader;
    nomagicleader = newNomagicleader;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__NOMAGICLEADER, oldNomagicleader, nomagicleader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPoormagicleader()
  {
    return poormagicleader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPoormagicleader(boolean newPoormagicleader)
  {
    boolean oldPoormagicleader = poormagicleader;
    poormagicleader = newPoormagicleader;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__POORMAGICLEADER, oldPoormagicleader, poormagicleader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOkmagicleader()
  {
    return okmagicleader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOkmagicleader(boolean newOkmagicleader)
  {
    boolean oldOkmagicleader = okmagicleader;
    okmagicleader = newOkmagicleader;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__OKMAGICLEADER, oldOkmagicleader, okmagicleader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isGoodmagicleader()
  {
    return goodmagicleader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGoodmagicleader(boolean newGoodmagicleader)
  {
    boolean oldGoodmagicleader = goodmagicleader;
    goodmagicleader = newGoodmagicleader;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__GOODMAGICLEADER, oldGoodmagicleader, goodmagicleader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExpertmagicleader()
  {
    return expertmagicleader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpertmagicleader(boolean newExpertmagicleader)
  {
    boolean oldExpertmagicleader = expertmagicleader;
    expertmagicleader = newExpertmagicleader;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__EXPERTMAGICLEADER, oldExpertmagicleader, expertmagicleader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSuperiormagicleader()
  {
    return superiormagicleader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperiormagicleader(boolean newSuperiormagicleader)
  {
    boolean oldSuperiormagicleader = superiormagicleader;
    superiormagicleader = newSuperiormagicleader;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__SUPERIORMAGICLEADER, oldSuperiormagicleader, superiormagicleader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNoundeadleader()
  {
    return noundeadleader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNoundeadleader(boolean newNoundeadleader)
  {
    boolean oldNoundeadleader = noundeadleader;
    noundeadleader = newNoundeadleader;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__NOUNDEADLEADER, oldNoundeadleader, noundeadleader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPoorundeadleader()
  {
    return poorundeadleader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPoorundeadleader(boolean newPoorundeadleader)
  {
    boolean oldPoorundeadleader = poorundeadleader;
    poorundeadleader = newPoorundeadleader;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__POORUNDEADLEADER, oldPoorundeadleader, poorundeadleader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOkundeadleader()
  {
    return okundeadleader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOkundeadleader(boolean newOkundeadleader)
  {
    boolean oldOkundeadleader = okundeadleader;
    okundeadleader = newOkundeadleader;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__OKUNDEADLEADER, oldOkundeadleader, okundeadleader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isGoodundeadleader()
  {
    return goodundeadleader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGoodundeadleader(boolean newGoodundeadleader)
  {
    boolean oldGoodundeadleader = goodundeadleader;
    goodundeadleader = newGoodundeadleader;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__GOODUNDEADLEADER, oldGoodundeadleader, goodundeadleader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExpertundeadleader()
  {
    return expertundeadleader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpertundeadleader(boolean newExpertundeadleader)
  {
    boolean oldExpertundeadleader = expertundeadleader;
    expertundeadleader = newExpertundeadleader;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__EXPERTUNDEADLEADER, oldExpertundeadleader, expertundeadleader));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSuperiorundeadleader()
  {
    return superiorundeadleader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperiorundeadleader(boolean newSuperiorundeadleader)
  {
    boolean oldSuperiorundeadleader = superiorundeadleader;
    superiorundeadleader = newSuperiorundeadleader;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST4__SUPERIORUNDEADLEADER, oldSuperiorundeadleader, superiorundeadleader));
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
      case DmPackage.MONSTER_INST4__CLEAR:
        return isClear();
      case DmPackage.MONSTER_INST4__CLEARWEAPONS:
        return isClearweapons();
      case DmPackage.MONSTER_INST4__CLEARARMOR:
        return isCleararmor();
      case DmPackage.MONSTER_INST4__CLEARMAGIC:
        return isClearmagic();
      case DmPackage.MONSTER_INST4__CLEARSPEC:
        return isClearspec();
      case DmPackage.MONSTER_INST4__FEMALE:
        return isFemale();
      case DmPackage.MONSTER_INST4__MOUNTED:
        return isMounted();
      case DmPackage.MONSTER_INST4__HOLY:
        return isHoly();
      case DmPackage.MONSTER_INST4__ANIMAL:
        return isAnimal();
      case DmPackage.MONSTER_INST4__UNDEAD:
        return isUndead();
      case DmPackage.MONSTER_INST4__DEMON:
        return isDemon();
      case DmPackage.MONSTER_INST4__MAGICBEING:
        return isMagicbeing();
      case DmPackage.MONSTER_INST4__STONEBEING:
        return isStonebeing();
      case DmPackage.MONSTER_INST4__INANIMATE:
        return isInanimate();
      case DmPackage.MONSTER_INST4__COLDBLOOD:
        return isColdblood();
      case DmPackage.MONSTER_INST4__IMMORTAL:
        return isImmortal();
      case DmPackage.MONSTER_INST4__BLIND:
        return isBlind();
      case DmPackage.MONSTER_INST4__UNIQUE:
        return isUnique();
      case DmPackage.MONSTER_INST4__IMMOBILE:
        return isImmobile();
      case DmPackage.MONSTER_INST4__AQUATIC:
        return isAquatic();
      case DmPackage.MONSTER_INST4__AMPHIBIAN:
        return isAmphibian();
      case DmPackage.MONSTER_INST4__POORAMPHIBIAN:
        return isPooramphibian();
      case DmPackage.MONSTER_INST4__FLYING:
        return isFlying();
      case DmPackage.MONSTER_INST4__STORMIMMUNE:
        return isStormimmune();
      case DmPackage.MONSTER_INST4__SAILING:
        return isSailing();
      case DmPackage.MONSTER_INST4__FORESTSURVIVAL:
        return isForestsurvival();
      case DmPackage.MONSTER_INST4__MOUNTAINSURVIVAL:
        return isMountainsurvival();
      case DmPackage.MONSTER_INST4__SWAMPSURVIVAL:
        return isSwampsurvival();
      case DmPackage.MONSTER_INST4__WASTESURVIVAL:
        return isWastesurvival();
      case DmPackage.MONSTER_INST4__ILLUSION:
        return isIllusion();
      case DmPackage.MONSTER_INST4__SPY:
        return isSpy();
      case DmPackage.MONSTER_INST4__ASSASSIN:
        return isAssassin();
      case DmPackage.MONSTER_INST4__HEAL:
        return isHeal();
      case DmPackage.MONSTER_INST4__NOHEAL:
        return isNoheal();
      case DmPackage.MONSTER_INST4__NEEDNOTEAT:
        return isNeednoteat();
      case DmPackage.MONSTER_INST4__ETHEREAL:
        return isEthereal();
      case DmPackage.MONSTER_INST4__TRAMPLE:
        return isTrample();
      case DmPackage.MONSTER_INST4__ENTANGLE:
        return isEntangle();
      case DmPackage.MONSTER_INST4__EYELOSS:
        return isEyeloss();
      case DmPackage.MONSTER_INST4__HORRORMARK:
        return isHorrormark();
      case DmPackage.MONSTER_INST4__POISONARMOR:
        return isPoisonarmor();
      case DmPackage.MONSTER_INST4__INQUISITOR:
        return isInquisitor();
      case DmPackage.MONSTER_INST4__NOITEM:
        return isNoitem();
      case DmPackage.MONSTER_INST4__DRAINIMMUNE:
        return isDrainimmune();
      case DmPackage.MONSTER_INST4__NOLEADER:
        return isNoleader();
      case DmPackage.MONSTER_INST4__POORLEADER:
        return isPoorleader();
      case DmPackage.MONSTER_INST4__OKLEADER:
        return isOkleader();
      case DmPackage.MONSTER_INST4__GOODLEADER:
        return isGoodleader();
      case DmPackage.MONSTER_INST4__EXPERTLEADER:
        return isExpertleader();
      case DmPackage.MONSTER_INST4__SUPERIORLEADER:
        return isSuperiorleader();
      case DmPackage.MONSTER_INST4__NOMAGICLEADER:
        return isNomagicleader();
      case DmPackage.MONSTER_INST4__POORMAGICLEADER:
        return isPoormagicleader();
      case DmPackage.MONSTER_INST4__OKMAGICLEADER:
        return isOkmagicleader();
      case DmPackage.MONSTER_INST4__GOODMAGICLEADER:
        return isGoodmagicleader();
      case DmPackage.MONSTER_INST4__EXPERTMAGICLEADER:
        return isExpertmagicleader();
      case DmPackage.MONSTER_INST4__SUPERIORMAGICLEADER:
        return isSuperiormagicleader();
      case DmPackage.MONSTER_INST4__NOUNDEADLEADER:
        return isNoundeadleader();
      case DmPackage.MONSTER_INST4__POORUNDEADLEADER:
        return isPoorundeadleader();
      case DmPackage.MONSTER_INST4__OKUNDEADLEADER:
        return isOkundeadleader();
      case DmPackage.MONSTER_INST4__GOODUNDEADLEADER:
        return isGoodundeadleader();
      case DmPackage.MONSTER_INST4__EXPERTUNDEADLEADER:
        return isExpertundeadleader();
      case DmPackage.MONSTER_INST4__SUPERIORUNDEADLEADER:
        return isSuperiorundeadleader();
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
      case DmPackage.MONSTER_INST4__CLEAR:
        setClear((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__CLEARWEAPONS:
        setClearweapons((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__CLEARARMOR:
        setCleararmor((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__CLEARMAGIC:
        setClearmagic((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__CLEARSPEC:
        setClearspec((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__FEMALE:
        setFemale((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__MOUNTED:
        setMounted((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__HOLY:
        setHoly((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__ANIMAL:
        setAnimal((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__UNDEAD:
        setUndead((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__DEMON:
        setDemon((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__MAGICBEING:
        setMagicbeing((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__STONEBEING:
        setStonebeing((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__INANIMATE:
        setInanimate((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__COLDBLOOD:
        setColdblood((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__IMMORTAL:
        setImmortal((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__BLIND:
        setBlind((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__UNIQUE:
        setUnique((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__IMMOBILE:
        setImmobile((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__AQUATIC:
        setAquatic((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__AMPHIBIAN:
        setAmphibian((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__POORAMPHIBIAN:
        setPooramphibian((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__FLYING:
        setFlying((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__STORMIMMUNE:
        setStormimmune((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__SAILING:
        setSailing((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__FORESTSURVIVAL:
        setForestsurvival((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__MOUNTAINSURVIVAL:
        setMountainsurvival((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__SWAMPSURVIVAL:
        setSwampsurvival((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__WASTESURVIVAL:
        setWastesurvival((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__ILLUSION:
        setIllusion((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__SPY:
        setSpy((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__ASSASSIN:
        setAssassin((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__HEAL:
        setHeal((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__NOHEAL:
        setNoheal((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__NEEDNOTEAT:
        setNeednoteat((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__ETHEREAL:
        setEthereal((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__TRAMPLE:
        setTrample((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__ENTANGLE:
        setEntangle((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__EYELOSS:
        setEyeloss((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__HORRORMARK:
        setHorrormark((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__POISONARMOR:
        setPoisonarmor((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__INQUISITOR:
        setInquisitor((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__NOITEM:
        setNoitem((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__DRAINIMMUNE:
        setDrainimmune((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__NOLEADER:
        setNoleader((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__POORLEADER:
        setPoorleader((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__OKLEADER:
        setOkleader((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__GOODLEADER:
        setGoodleader((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__EXPERTLEADER:
        setExpertleader((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__SUPERIORLEADER:
        setSuperiorleader((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__NOMAGICLEADER:
        setNomagicleader((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__POORMAGICLEADER:
        setPoormagicleader((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__OKMAGICLEADER:
        setOkmagicleader((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__GOODMAGICLEADER:
        setGoodmagicleader((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__EXPERTMAGICLEADER:
        setExpertmagicleader((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__SUPERIORMAGICLEADER:
        setSuperiormagicleader((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__NOUNDEADLEADER:
        setNoundeadleader((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__POORUNDEADLEADER:
        setPoorundeadleader((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__OKUNDEADLEADER:
        setOkundeadleader((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__GOODUNDEADLEADER:
        setGoodundeadleader((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__EXPERTUNDEADLEADER:
        setExpertundeadleader((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST4__SUPERIORUNDEADLEADER:
        setSuperiorundeadleader((Boolean)newValue);
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
      case DmPackage.MONSTER_INST4__CLEAR:
        setClear(CLEAR_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__CLEARWEAPONS:
        setClearweapons(CLEARWEAPONS_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__CLEARARMOR:
        setCleararmor(CLEARARMOR_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__CLEARMAGIC:
        setClearmagic(CLEARMAGIC_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__CLEARSPEC:
        setClearspec(CLEARSPEC_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__FEMALE:
        setFemale(FEMALE_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__MOUNTED:
        setMounted(MOUNTED_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__HOLY:
        setHoly(HOLY_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__ANIMAL:
        setAnimal(ANIMAL_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__UNDEAD:
        setUndead(UNDEAD_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__DEMON:
        setDemon(DEMON_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__MAGICBEING:
        setMagicbeing(MAGICBEING_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__STONEBEING:
        setStonebeing(STONEBEING_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__INANIMATE:
        setInanimate(INANIMATE_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__COLDBLOOD:
        setColdblood(COLDBLOOD_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__IMMORTAL:
        setImmortal(IMMORTAL_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__BLIND:
        setBlind(BLIND_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__UNIQUE:
        setUnique(UNIQUE_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__IMMOBILE:
        setImmobile(IMMOBILE_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__AQUATIC:
        setAquatic(AQUATIC_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__AMPHIBIAN:
        setAmphibian(AMPHIBIAN_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__POORAMPHIBIAN:
        setPooramphibian(POORAMPHIBIAN_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__FLYING:
        setFlying(FLYING_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__STORMIMMUNE:
        setStormimmune(STORMIMMUNE_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__SAILING:
        setSailing(SAILING_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__FORESTSURVIVAL:
        setForestsurvival(FORESTSURVIVAL_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__MOUNTAINSURVIVAL:
        setMountainsurvival(MOUNTAINSURVIVAL_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__SWAMPSURVIVAL:
        setSwampsurvival(SWAMPSURVIVAL_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__WASTESURVIVAL:
        setWastesurvival(WASTESURVIVAL_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__ILLUSION:
        setIllusion(ILLUSION_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__SPY:
        setSpy(SPY_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__ASSASSIN:
        setAssassin(ASSASSIN_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__HEAL:
        setHeal(HEAL_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__NOHEAL:
        setNoheal(NOHEAL_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__NEEDNOTEAT:
        setNeednoteat(NEEDNOTEAT_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__ETHEREAL:
        setEthereal(ETHEREAL_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__TRAMPLE:
        setTrample(TRAMPLE_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__ENTANGLE:
        setEntangle(ENTANGLE_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__EYELOSS:
        setEyeloss(EYELOSS_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__HORRORMARK:
        setHorrormark(HORRORMARK_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__POISONARMOR:
        setPoisonarmor(POISONARMOR_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__INQUISITOR:
        setInquisitor(INQUISITOR_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__NOITEM:
        setNoitem(NOITEM_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__DRAINIMMUNE:
        setDrainimmune(DRAINIMMUNE_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__NOLEADER:
        setNoleader(NOLEADER_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__POORLEADER:
        setPoorleader(POORLEADER_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__OKLEADER:
        setOkleader(OKLEADER_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__GOODLEADER:
        setGoodleader(GOODLEADER_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__EXPERTLEADER:
        setExpertleader(EXPERTLEADER_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__SUPERIORLEADER:
        setSuperiorleader(SUPERIORLEADER_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__NOMAGICLEADER:
        setNomagicleader(NOMAGICLEADER_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__POORMAGICLEADER:
        setPoormagicleader(POORMAGICLEADER_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__OKMAGICLEADER:
        setOkmagicleader(OKMAGICLEADER_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__GOODMAGICLEADER:
        setGoodmagicleader(GOODMAGICLEADER_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__EXPERTMAGICLEADER:
        setExpertmagicleader(EXPERTMAGICLEADER_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__SUPERIORMAGICLEADER:
        setSuperiormagicleader(SUPERIORMAGICLEADER_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__NOUNDEADLEADER:
        setNoundeadleader(NOUNDEADLEADER_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__POORUNDEADLEADER:
        setPoorundeadleader(POORUNDEADLEADER_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__OKUNDEADLEADER:
        setOkundeadleader(OKUNDEADLEADER_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__GOODUNDEADLEADER:
        setGoodundeadleader(GOODUNDEADLEADER_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__EXPERTUNDEADLEADER:
        setExpertundeadleader(EXPERTUNDEADLEADER_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST4__SUPERIORUNDEADLEADER:
        setSuperiorundeadleader(SUPERIORUNDEADLEADER_EDEFAULT);
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
      case DmPackage.MONSTER_INST4__CLEAR:
        return clear != CLEAR_EDEFAULT;
      case DmPackage.MONSTER_INST4__CLEARWEAPONS:
        return clearweapons != CLEARWEAPONS_EDEFAULT;
      case DmPackage.MONSTER_INST4__CLEARARMOR:
        return cleararmor != CLEARARMOR_EDEFAULT;
      case DmPackage.MONSTER_INST4__CLEARMAGIC:
        return clearmagic != CLEARMAGIC_EDEFAULT;
      case DmPackage.MONSTER_INST4__CLEARSPEC:
        return clearspec != CLEARSPEC_EDEFAULT;
      case DmPackage.MONSTER_INST4__FEMALE:
        return female != FEMALE_EDEFAULT;
      case DmPackage.MONSTER_INST4__MOUNTED:
        return mounted != MOUNTED_EDEFAULT;
      case DmPackage.MONSTER_INST4__HOLY:
        return holy != HOLY_EDEFAULT;
      case DmPackage.MONSTER_INST4__ANIMAL:
        return animal != ANIMAL_EDEFAULT;
      case DmPackage.MONSTER_INST4__UNDEAD:
        return undead != UNDEAD_EDEFAULT;
      case DmPackage.MONSTER_INST4__DEMON:
        return demon != DEMON_EDEFAULT;
      case DmPackage.MONSTER_INST4__MAGICBEING:
        return magicbeing != MAGICBEING_EDEFAULT;
      case DmPackage.MONSTER_INST4__STONEBEING:
        return stonebeing != STONEBEING_EDEFAULT;
      case DmPackage.MONSTER_INST4__INANIMATE:
        return inanimate != INANIMATE_EDEFAULT;
      case DmPackage.MONSTER_INST4__COLDBLOOD:
        return coldblood != COLDBLOOD_EDEFAULT;
      case DmPackage.MONSTER_INST4__IMMORTAL:
        return immortal != IMMORTAL_EDEFAULT;
      case DmPackage.MONSTER_INST4__BLIND:
        return blind != BLIND_EDEFAULT;
      case DmPackage.MONSTER_INST4__UNIQUE:
        return unique != UNIQUE_EDEFAULT;
      case DmPackage.MONSTER_INST4__IMMOBILE:
        return immobile != IMMOBILE_EDEFAULT;
      case DmPackage.MONSTER_INST4__AQUATIC:
        return aquatic != AQUATIC_EDEFAULT;
      case DmPackage.MONSTER_INST4__AMPHIBIAN:
        return amphibian != AMPHIBIAN_EDEFAULT;
      case DmPackage.MONSTER_INST4__POORAMPHIBIAN:
        return pooramphibian != POORAMPHIBIAN_EDEFAULT;
      case DmPackage.MONSTER_INST4__FLYING:
        return flying != FLYING_EDEFAULT;
      case DmPackage.MONSTER_INST4__STORMIMMUNE:
        return stormimmune != STORMIMMUNE_EDEFAULT;
      case DmPackage.MONSTER_INST4__SAILING:
        return sailing != SAILING_EDEFAULT;
      case DmPackage.MONSTER_INST4__FORESTSURVIVAL:
        return forestsurvival != FORESTSURVIVAL_EDEFAULT;
      case DmPackage.MONSTER_INST4__MOUNTAINSURVIVAL:
        return mountainsurvival != MOUNTAINSURVIVAL_EDEFAULT;
      case DmPackage.MONSTER_INST4__SWAMPSURVIVAL:
        return swampsurvival != SWAMPSURVIVAL_EDEFAULT;
      case DmPackage.MONSTER_INST4__WASTESURVIVAL:
        return wastesurvival != WASTESURVIVAL_EDEFAULT;
      case DmPackage.MONSTER_INST4__ILLUSION:
        return illusion != ILLUSION_EDEFAULT;
      case DmPackage.MONSTER_INST4__SPY:
        return spy != SPY_EDEFAULT;
      case DmPackage.MONSTER_INST4__ASSASSIN:
        return assassin != ASSASSIN_EDEFAULT;
      case DmPackage.MONSTER_INST4__HEAL:
        return heal != HEAL_EDEFAULT;
      case DmPackage.MONSTER_INST4__NOHEAL:
        return noheal != NOHEAL_EDEFAULT;
      case DmPackage.MONSTER_INST4__NEEDNOTEAT:
        return neednoteat != NEEDNOTEAT_EDEFAULT;
      case DmPackage.MONSTER_INST4__ETHEREAL:
        return ethereal != ETHEREAL_EDEFAULT;
      case DmPackage.MONSTER_INST4__TRAMPLE:
        return trample != TRAMPLE_EDEFAULT;
      case DmPackage.MONSTER_INST4__ENTANGLE:
        return entangle != ENTANGLE_EDEFAULT;
      case DmPackage.MONSTER_INST4__EYELOSS:
        return eyeloss != EYELOSS_EDEFAULT;
      case DmPackage.MONSTER_INST4__HORRORMARK:
        return horrormark != HORRORMARK_EDEFAULT;
      case DmPackage.MONSTER_INST4__POISONARMOR:
        return poisonarmor != POISONARMOR_EDEFAULT;
      case DmPackage.MONSTER_INST4__INQUISITOR:
        return inquisitor != INQUISITOR_EDEFAULT;
      case DmPackage.MONSTER_INST4__NOITEM:
        return noitem != NOITEM_EDEFAULT;
      case DmPackage.MONSTER_INST4__DRAINIMMUNE:
        return drainimmune != DRAINIMMUNE_EDEFAULT;
      case DmPackage.MONSTER_INST4__NOLEADER:
        return noleader != NOLEADER_EDEFAULT;
      case DmPackage.MONSTER_INST4__POORLEADER:
        return poorleader != POORLEADER_EDEFAULT;
      case DmPackage.MONSTER_INST4__OKLEADER:
        return okleader != OKLEADER_EDEFAULT;
      case DmPackage.MONSTER_INST4__GOODLEADER:
        return goodleader != GOODLEADER_EDEFAULT;
      case DmPackage.MONSTER_INST4__EXPERTLEADER:
        return expertleader != EXPERTLEADER_EDEFAULT;
      case DmPackage.MONSTER_INST4__SUPERIORLEADER:
        return superiorleader != SUPERIORLEADER_EDEFAULT;
      case DmPackage.MONSTER_INST4__NOMAGICLEADER:
        return nomagicleader != NOMAGICLEADER_EDEFAULT;
      case DmPackage.MONSTER_INST4__POORMAGICLEADER:
        return poormagicleader != POORMAGICLEADER_EDEFAULT;
      case DmPackage.MONSTER_INST4__OKMAGICLEADER:
        return okmagicleader != OKMAGICLEADER_EDEFAULT;
      case DmPackage.MONSTER_INST4__GOODMAGICLEADER:
        return goodmagicleader != GOODMAGICLEADER_EDEFAULT;
      case DmPackage.MONSTER_INST4__EXPERTMAGICLEADER:
        return expertmagicleader != EXPERTMAGICLEADER_EDEFAULT;
      case DmPackage.MONSTER_INST4__SUPERIORMAGICLEADER:
        return superiormagicleader != SUPERIORMAGICLEADER_EDEFAULT;
      case DmPackage.MONSTER_INST4__NOUNDEADLEADER:
        return noundeadleader != NOUNDEADLEADER_EDEFAULT;
      case DmPackage.MONSTER_INST4__POORUNDEADLEADER:
        return poorundeadleader != POORUNDEADLEADER_EDEFAULT;
      case DmPackage.MONSTER_INST4__OKUNDEADLEADER:
        return okundeadleader != OKUNDEADLEADER_EDEFAULT;
      case DmPackage.MONSTER_INST4__GOODUNDEADLEADER:
        return goodundeadleader != GOODUNDEADLEADER_EDEFAULT;
      case DmPackage.MONSTER_INST4__EXPERTUNDEADLEADER:
        return expertundeadleader != EXPERTUNDEADLEADER_EDEFAULT;
      case DmPackage.MONSTER_INST4__SUPERIORUNDEADLEADER:
        return superiorundeadleader != SUPERIORUNDEADLEADER_EDEFAULT;
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
    result.append(" (clear: ");
    result.append(clear);
    result.append(", clearweapons: ");
    result.append(clearweapons);
    result.append(", cleararmor: ");
    result.append(cleararmor);
    result.append(", clearmagic: ");
    result.append(clearmagic);
    result.append(", clearspec: ");
    result.append(clearspec);
    result.append(", female: ");
    result.append(female);
    result.append(", mounted: ");
    result.append(mounted);
    result.append(", holy: ");
    result.append(holy);
    result.append(", animal: ");
    result.append(animal);
    result.append(", undead: ");
    result.append(undead);
    result.append(", demon: ");
    result.append(demon);
    result.append(", magicbeing: ");
    result.append(magicbeing);
    result.append(", stonebeing: ");
    result.append(stonebeing);
    result.append(", inanimate: ");
    result.append(inanimate);
    result.append(", coldblood: ");
    result.append(coldblood);
    result.append(", immortal: ");
    result.append(immortal);
    result.append(", blind: ");
    result.append(blind);
    result.append(", unique: ");
    result.append(unique);
    result.append(", immobile: ");
    result.append(immobile);
    result.append(", aquatic: ");
    result.append(aquatic);
    result.append(", amphibian: ");
    result.append(amphibian);
    result.append(", pooramphibian: ");
    result.append(pooramphibian);
    result.append(", flying: ");
    result.append(flying);
    result.append(", stormimmune: ");
    result.append(stormimmune);
    result.append(", sailing: ");
    result.append(sailing);
    result.append(", forestsurvival: ");
    result.append(forestsurvival);
    result.append(", mountainsurvival: ");
    result.append(mountainsurvival);
    result.append(", swampsurvival: ");
    result.append(swampsurvival);
    result.append(", wastesurvival: ");
    result.append(wastesurvival);
    result.append(", illusion: ");
    result.append(illusion);
    result.append(", spy: ");
    result.append(spy);
    result.append(", assassin: ");
    result.append(assassin);
    result.append(", heal: ");
    result.append(heal);
    result.append(", noheal: ");
    result.append(noheal);
    result.append(", neednoteat: ");
    result.append(neednoteat);
    result.append(", ethereal: ");
    result.append(ethereal);
    result.append(", trample: ");
    result.append(trample);
    result.append(", entangle: ");
    result.append(entangle);
    result.append(", eyeloss: ");
    result.append(eyeloss);
    result.append(", horrormark: ");
    result.append(horrormark);
    result.append(", poisonarmor: ");
    result.append(poisonarmor);
    result.append(", inquisitor: ");
    result.append(inquisitor);
    result.append(", noitem: ");
    result.append(noitem);
    result.append(", drainimmune: ");
    result.append(drainimmune);
    result.append(", noleader: ");
    result.append(noleader);
    result.append(", poorleader: ");
    result.append(poorleader);
    result.append(", okleader: ");
    result.append(okleader);
    result.append(", goodleader: ");
    result.append(goodleader);
    result.append(", expertleader: ");
    result.append(expertleader);
    result.append(", superiorleader: ");
    result.append(superiorleader);
    result.append(", nomagicleader: ");
    result.append(nomagicleader);
    result.append(", poormagicleader: ");
    result.append(poormagicleader);
    result.append(", okmagicleader: ");
    result.append(okmagicleader);
    result.append(", goodmagicleader: ");
    result.append(goodmagicleader);
    result.append(", expertmagicleader: ");
    result.append(expertmagicleader);
    result.append(", superiormagicleader: ");
    result.append(superiormagicleader);
    result.append(", noundeadleader: ");
    result.append(noundeadleader);
    result.append(", poorundeadleader: ");
    result.append(poorundeadleader);
    result.append(", okundeadleader: ");
    result.append(okundeadleader);
    result.append(", goodundeadleader: ");
    result.append(goodundeadleader);
    result.append(", expertundeadleader: ");
    result.append(expertundeadleader);
    result.append(", superiorundeadleader: ");
    result.append(superiorundeadleader);
    result.append(')');
    return result.toString();
  }

} //MonsterInst4Impl
