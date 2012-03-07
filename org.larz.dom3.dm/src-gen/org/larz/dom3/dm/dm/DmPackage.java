/**
 * <copyright>
 * </copyright>
 *
 */
package org.larz.dom3.dm.dm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.larz.dom3.dm.dm.DmFactory
 * @model kind="package"
 * @generated
 */
public interface DmPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dm";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.larz.org/dom3/dm/Dm";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dm";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DmPackage eINSTANCE = org.larz.dom3.dm.dm.impl.DmPackageImpl.init();

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.Dom3ModImpl <em>Dom3 Mod</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.Dom3ModImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getDom3Mod()
   * @generated
   */
  int DOM3_MOD = 0;

  /**
   * The feature id for the '<em><b>Modname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM3_MOD__MODNAME = 0;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM3_MOD__DESC = 1;

  /**
   * The feature id for the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM3_MOD__ICON = 2;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM3_MOD__VERSION = 3;

  /**
   * The feature id for the '<em><b>Domversion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM3_MOD__DOMVERSION = 4;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM3_MOD__ELEMENTS = 5;

  /**
   * The number of structural features of the '<em>Dom3 Mod</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM3_MOD_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.AbstractElementImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getAbstractElement()
   * @generated
   */
  int ABSTRACT_ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Abstract Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.GeneralImpl <em>General</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.GeneralImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getGeneral()
   * @generated
   */
  int GENERAL = 2;

  /**
   * The number of structural features of the '<em>General</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.GeneralPattern1Impl <em>General Pattern1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.GeneralPattern1Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getGeneralPattern1()
   * @generated
   */
  int GENERAL_PATTERN1 = 3;

  /**
   * The number of structural features of the '<em>General Pattern1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_PATTERN1_FEATURE_COUNT = GENERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.GeneralInst1Impl <em>General Inst1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.GeneralInst1Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getGeneralInst1()
   * @generated
   */
  int GENERAL_INST1 = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_INST1__VALUE = GENERAL_PATTERN1_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Poppergold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_INST1__POPPERGOLD = GENERAL_PATTERN1_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Resourcemult</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_INST1__RESOURCEMULT = GENERAL_PATTERN1_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Supplymult</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_INST1__SUPPLYMULT = GENERAL_PATTERN1_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Unresthalfinc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_INST1__UNRESTHALFINC = GENERAL_PATTERN1_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Unresthalfres</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_INST1__UNRESTHALFRES = GENERAL_PATTERN1_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Eventisrare</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_INST1__EVENTISRARE = GENERAL_PATTERN1_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Turmoilincome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_INST1__TURMOILINCOME = GENERAL_PATTERN1_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Turmoilevents</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_INST1__TURMOILEVENTS = GENERAL_PATTERN1_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Deathincome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_INST1__DEATHINCOME = GENERAL_PATTERN1_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Deathsupply</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_INST1__DEATHSUPPLY = GENERAL_PATTERN1_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Deathdeath</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_INST1__DEATHDEATH = GENERAL_PATTERN1_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Slothincome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_INST1__SLOTHINCOME = GENERAL_PATTERN1_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Slothresources</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_INST1__SLOTHRESOURCES = GENERAL_PATTERN1_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Coldincome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_INST1__COLDINCOME = GENERAL_PATTERN1_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Coldsupply</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_INST1__COLDSUPPLY = GENERAL_PATTERN1_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Misfortune</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_INST1__MISFORTUNE = GENERAL_PATTERN1_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Luckevents</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_INST1__LUCKEVENTS = GENERAL_PATTERN1_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Researchscale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_INST1__RESEARCHSCALE = GENERAL_PATTERN1_FEATURE_COUNT + 18;

  /**
   * The number of structural features of the '<em>General Inst1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERAL_INST1_FEATURE_COUNT = GENERAL_PATTERN1_FEATURE_COUNT + 19;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.ArmorImpl <em>Armor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.ArmorImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getArmor()
   * @generated
   */
  int ARMOR = 5;

  /**
   * The feature id for the '<em><b>Mods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARMOR__MODS = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Armor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARMOR_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SelectArmorByIdImpl <em>Select Armor By Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SelectArmorByIdImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSelectArmorById()
   * @generated
   */
  int SELECT_ARMOR_BY_ID = 6;

  /**
   * The feature id for the '<em><b>Mods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_ARMOR_BY_ID__MODS = ARMOR__MODS;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_ARMOR_BY_ID__VALUE = ARMOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Select Armor By Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_ARMOR_BY_ID_FEATURE_COUNT = ARMOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SelectArmorByNameImpl <em>Select Armor By Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SelectArmorByNameImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSelectArmorByName()
   * @generated
   */
  int SELECT_ARMOR_BY_NAME = 7;

  /**
   * The feature id for the '<em><b>Mods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_ARMOR_BY_NAME__MODS = ARMOR__MODS;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_ARMOR_BY_NAME__VALUE = ARMOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Select Armor By Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_ARMOR_BY_NAME_FEATURE_COUNT = ARMOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.NewArmorImpl <em>New Armor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.NewArmorImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getNewArmor()
   * @generated
   */
  int NEW_ARMOR = 8;

  /**
   * The feature id for the '<em><b>Mods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_ARMOR__MODS = ARMOR__MODS;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_ARMOR__VALUE = ARMOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>New Armor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_ARMOR_FEATURE_COUNT = ARMOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.ArmorModsImpl <em>Armor Mods</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.ArmorModsImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getArmorMods()
   * @generated
   */
  int ARMOR_MODS = 9;

  /**
   * The number of structural features of the '<em>Armor Mods</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARMOR_MODS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.ArmorPattern1Impl <em>Armor Pattern1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.ArmorPattern1Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getArmorPattern1()
   * @generated
   */
  int ARMOR_PATTERN1 = 10;

  /**
   * The number of structural features of the '<em>Armor Pattern1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARMOR_PATTERN1_FEATURE_COUNT = ARMOR_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.ArmorPattern2Impl <em>Armor Pattern2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.ArmorPattern2Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getArmorPattern2()
   * @generated
   */
  int ARMOR_PATTERN2 = 11;

  /**
   * The number of structural features of the '<em>Armor Pattern2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARMOR_PATTERN2_FEATURE_COUNT = ARMOR_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.ArmorInst1Impl <em>Armor Inst1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.ArmorInst1Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getArmorInst1()
   * @generated
   */
  int ARMOR_INST1 = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARMOR_INST1__VALUE = ARMOR_PATTERN1_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARMOR_INST1__NAME = ARMOR_PATTERN1_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Armor Inst1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARMOR_INST1_FEATURE_COUNT = ARMOR_PATTERN1_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.ArmorInst2Impl <em>Armor Inst2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.ArmorInst2Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getArmorInst2()
   * @generated
   */
  int ARMOR_INST2 = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARMOR_INST2__VALUE = ARMOR_PATTERN2_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARMOR_INST2__TYPE = ARMOR_PATTERN2_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Prot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARMOR_INST2__PROT = ARMOR_PATTERN2_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Def</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARMOR_INST2__DEF = ARMOR_PATTERN2_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Enc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARMOR_INST2__ENC = ARMOR_PATTERN2_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Rcost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARMOR_INST2__RCOST = ARMOR_PATTERN2_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Armor Inst2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARMOR_INST2_FEATURE_COUNT = ARMOR_PATTERN2_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.WeaponImpl <em>Weapon</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.WeaponImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getWeapon()
   * @generated
   */
  int WEAPON = 14;

  /**
   * The feature id for the '<em><b>Mods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON__MODS = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Weapon</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SelectWeaponByIdImpl <em>Select Weapon By Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SelectWeaponByIdImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSelectWeaponById()
   * @generated
   */
  int SELECT_WEAPON_BY_ID = 15;

  /**
   * The feature id for the '<em><b>Mods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_WEAPON_BY_ID__MODS = WEAPON__MODS;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_WEAPON_BY_ID__VALUE = WEAPON_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Select Weapon By Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_WEAPON_BY_ID_FEATURE_COUNT = WEAPON_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SelectWeaponByNameImpl <em>Select Weapon By Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SelectWeaponByNameImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSelectWeaponByName()
   * @generated
   */
  int SELECT_WEAPON_BY_NAME = 16;

  /**
   * The feature id for the '<em><b>Mods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_WEAPON_BY_NAME__MODS = WEAPON__MODS;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_WEAPON_BY_NAME__VALUE = WEAPON_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Select Weapon By Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_WEAPON_BY_NAME_FEATURE_COUNT = WEAPON_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.NewWeaponImpl <em>New Weapon</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.NewWeaponImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getNewWeapon()
   * @generated
   */
  int NEW_WEAPON = 17;

  /**
   * The feature id for the '<em><b>Mods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_WEAPON__MODS = WEAPON__MODS;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_WEAPON__VALUE = WEAPON_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>New Weapon</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_WEAPON_FEATURE_COUNT = WEAPON_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.WeaponModsImpl <em>Weapon Mods</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.WeaponModsImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getWeaponMods()
   * @generated
   */
  int WEAPON_MODS = 18;

  /**
   * The number of structural features of the '<em>Weapon Mods</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_MODS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.WeaponPattern1Impl <em>Weapon Pattern1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.WeaponPattern1Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getWeaponPattern1()
   * @generated
   */
  int WEAPON_PATTERN1 = 19;

  /**
   * The number of structural features of the '<em>Weapon Pattern1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_PATTERN1_FEATURE_COUNT = WEAPON_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.WeaponPattern2Impl <em>Weapon Pattern2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.WeaponPattern2Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getWeaponPattern2()
   * @generated
   */
  int WEAPON_PATTERN2 = 20;

  /**
   * The number of structural features of the '<em>Weapon Pattern2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_PATTERN2_FEATURE_COUNT = WEAPON_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.WeaponPattern3Impl <em>Weapon Pattern3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.WeaponPattern3Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getWeaponPattern3()
   * @generated
   */
  int WEAPON_PATTERN3 = 21;

  /**
   * The number of structural features of the '<em>Weapon Pattern3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_PATTERN3_FEATURE_COUNT = WEAPON_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.WeaponPattern4Impl <em>Weapon Pattern4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.WeaponPattern4Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getWeaponPattern4()
   * @generated
   */
  int WEAPON_PATTERN4 = 22;

  /**
   * The number of structural features of the '<em>Weapon Pattern4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_PATTERN4_FEATURE_COUNT = WEAPON_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.WeaponInst1Impl <em>Weapon Inst1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.WeaponInst1Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getWeaponInst1()
   * @generated
   */
  int WEAPON_INST1 = 23;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST1__VALUE = WEAPON_PATTERN1_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST1__NAME = WEAPON_PATTERN1_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Weapon Inst1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST1_FEATURE_COUNT = WEAPON_PATTERN1_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.WeaponInst2Impl <em>Weapon Inst2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.WeaponInst2Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getWeaponInst2()
   * @generated
   */
  int WEAPON_INST2 = 24;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST2__VALUE = WEAPON_PATTERN2_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dmg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST2__DMG = WEAPON_PATTERN2_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Nratt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST2__NRATT = WEAPON_PATTERN2_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Att</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST2__ATT = WEAPON_PATTERN2_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Def</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST2__DEF = WEAPON_PATTERN2_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Len</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST2__LEN = WEAPON_PATTERN2_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Range</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST2__RANGE = WEAPON_PATTERN2_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Ammo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST2__AMMO = WEAPON_PATTERN2_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Rcost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST2__RCOST = WEAPON_PATTERN2_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Sound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST2__SOUND = WEAPON_PATTERN2_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Aoe</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST2__AOE = WEAPON_PATTERN2_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Secondaryeffect</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST2__SECONDARYEFFECT = WEAPON_PATTERN2_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Secondaryeffectalways</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST2__SECONDARYEFFECTALWAYS = WEAPON_PATTERN2_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Explspr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST2__EXPLSPR = WEAPON_PATTERN2_FEATURE_COUNT + 13;

  /**
   * The number of structural features of the '<em>Weapon Inst2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST2_FEATURE_COUNT = WEAPON_PATTERN2_FEATURE_COUNT + 14;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.WeaponInst3Impl <em>Weapon Inst3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.WeaponInst3Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getWeaponInst3()
   * @generated
   */
  int WEAPON_INST3 = 25;

  /**
   * The feature id for the '<em><b>Value1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST3__VALUE1 = WEAPON_PATTERN3_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST3__VALUE2 = WEAPON_PATTERN3_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Flyspr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST3__FLYSPR = WEAPON_PATTERN3_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Weapon Inst3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST3_FEATURE_COUNT = WEAPON_PATTERN3_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.WeaponInst4Impl <em>Weapon Inst4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.WeaponInst4Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getWeaponInst4()
   * @generated
   */
  int WEAPON_INST4 = 26;

  /**
   * The feature id for the '<em><b>Twohanded</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4__TWOHANDED = WEAPON_PATTERN4_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Armorpiercing</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4__ARMORPIERCING = WEAPON_PATTERN4_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Armornegating</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4__ARMORNEGATING = WEAPON_PATTERN4_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Magic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4__MAGIC = WEAPON_PATTERN4_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Dt normal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4__DT_NORMAL = WEAPON_PATTERN4_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Dt stun</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4__DT_STUN = WEAPON_PATTERN4_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Dt paralyze</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4__DT_PARALYZE = WEAPON_PATTERN4_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Dt poison</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4__DT_POISON = WEAPON_PATTERN4_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Dt cap</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4__DT_CAP = WEAPON_PATTERN4_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Dt demon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4__DT_DEMON = WEAPON_PATTERN4_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Dt demononly</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4__DT_DEMONONLY = WEAPON_PATTERN4_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Dt holy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4__DT_HOLY = WEAPON_PATTERN4_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Dt magic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4__DT_MAGIC = WEAPON_PATTERN4_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Dt small</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4__DT_SMALL = WEAPON_PATTERN4_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Dt large</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4__DT_LARGE = WEAPON_PATTERN4_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Dt constructonly</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4__DT_CONSTRUCTONLY = WEAPON_PATTERN4_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Dt raise</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4__DT_RAISE = WEAPON_PATTERN4_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Mind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4__MIND = WEAPON_PATTERN4_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Cold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4__COLD = WEAPON_PATTERN4_FEATURE_COUNT + 18;

  /**
   * The feature id for the '<em><b>Fire</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4__FIRE = WEAPON_PATTERN4_FEATURE_COUNT + 19;

  /**
   * The feature id for the '<em><b>Shock</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4__SHOCK = WEAPON_PATTERN4_FEATURE_COUNT + 20;

  /**
   * The feature id for the '<em><b>Poison</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4__POISON = WEAPON_PATTERN4_FEATURE_COUNT + 21;

  /**
   * The feature id for the '<em><b>Bonus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4__BONUS = WEAPON_PATTERN4_FEATURE_COUNT + 22;

  /**
   * The feature id for the '<em><b>Charge</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4__CHARGE = WEAPON_PATTERN4_FEATURE_COUNT + 23;

  /**
   * The feature id for the '<em><b>Flail</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4__FLAIL = WEAPON_PATTERN4_FEATURE_COUNT + 24;

  /**
   * The feature id for the '<em><b>Nostr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4__NOSTR = WEAPON_PATTERN4_FEATURE_COUNT + 25;

  /**
   * The feature id for the '<em><b>Mrnegates</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4__MRNEGATES = WEAPON_PATTERN4_FEATURE_COUNT + 26;

  /**
   * The feature id for the '<em><b>Mrnegateseasily</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4__MRNEGATESEASILY = WEAPON_PATTERN4_FEATURE_COUNT + 27;

  /**
   * The number of structural features of the '<em>Weapon Inst4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEAPON_INST4_FEATURE_COUNT = WEAPON_PATTERN4_FEATURE_COUNT + 28;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.MonsterImpl <em>Monster</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.MonsterImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getMonster()
   * @generated
   */
  int MONSTER = 27;

  /**
   * The feature id for the '<em><b>Mods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER__MODS = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Monster</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SelectMonsterByIdImpl <em>Select Monster By Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SelectMonsterByIdImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSelectMonsterById()
   * @generated
   */
  int SELECT_MONSTER_BY_ID = 28;

  /**
   * The feature id for the '<em><b>Mods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_MONSTER_BY_ID__MODS = MONSTER__MODS;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_MONSTER_BY_ID__VALUE = MONSTER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Select Monster By Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_MONSTER_BY_ID_FEATURE_COUNT = MONSTER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SelectMonsterByNameImpl <em>Select Monster By Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SelectMonsterByNameImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSelectMonsterByName()
   * @generated
   */
  int SELECT_MONSTER_BY_NAME = 29;

  /**
   * The feature id for the '<em><b>Mods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_MONSTER_BY_NAME__MODS = MONSTER__MODS;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_MONSTER_BY_NAME__VALUE = MONSTER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Select Monster By Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_MONSTER_BY_NAME_FEATURE_COUNT = MONSTER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.NewMonsterImpl <em>New Monster</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.NewMonsterImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getNewMonster()
   * @generated
   */
  int NEW_MONSTER = 30;

  /**
   * The feature id for the '<em><b>Mods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_MONSTER__MODS = MONSTER__MODS;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_MONSTER__VALUE = MONSTER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>New Monster</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_MONSTER_FEATURE_COUNT = MONSTER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.MonsterModsImpl <em>Monster Mods</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.MonsterModsImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getMonsterMods()
   * @generated
   */
  int MONSTER_MODS = 31;

  /**
   * The number of structural features of the '<em>Monster Mods</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_MODS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.MonsterPattern1Impl <em>Monster Pattern1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.MonsterPattern1Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getMonsterPattern1()
   * @generated
   */
  int MONSTER_PATTERN1 = 32;

  /**
   * The number of structural features of the '<em>Monster Pattern1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_PATTERN1_FEATURE_COUNT = MONSTER_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.MonsterPattern2Impl <em>Monster Pattern2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.MonsterPattern2Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getMonsterPattern2()
   * @generated
   */
  int MONSTER_PATTERN2 = 33;

  /**
   * The number of structural features of the '<em>Monster Pattern2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_PATTERN2_FEATURE_COUNT = MONSTER_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.MonsterPattern3Impl <em>Monster Pattern3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.MonsterPattern3Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getMonsterPattern3()
   * @generated
   */
  int MONSTER_PATTERN3 = 34;

  /**
   * The number of structural features of the '<em>Monster Pattern3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_PATTERN3_FEATURE_COUNT = MONSTER_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.MonsterPattern4Impl <em>Monster Pattern4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.MonsterPattern4Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getMonsterPattern4()
   * @generated
   */
  int MONSTER_PATTERN4 = 35;

  /**
   * The number of structural features of the '<em>Monster Pattern4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_PATTERN4_FEATURE_COUNT = MONSTER_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.MonsterPattern5Impl <em>Monster Pattern5</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.MonsterPattern5Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getMonsterPattern5()
   * @generated
   */
  int MONSTER_PATTERN5 = 36;

  /**
   * The number of structural features of the '<em>Monster Pattern5</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_PATTERN5_FEATURE_COUNT = MONSTER_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.MonsterPattern6Impl <em>Monster Pattern6</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.MonsterPattern6Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getMonsterPattern6()
   * @generated
   */
  int MONSTER_PATTERN6 = 37;

  /**
   * The number of structural features of the '<em>Monster Pattern6</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_PATTERN6_FEATURE_COUNT = MONSTER_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.MonsterInst1Impl <em>Monster Inst1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.MonsterInst1Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getMonsterInst1()
   * @generated
   */
  int MONSTER_INST1 = 38;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST1__VALUE = MONSTER_PATTERN1_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST1__NAME = MONSTER_PATTERN1_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Spr1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST1__SPR1 = MONSTER_PATTERN1_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Spr2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST1__SPR2 = MONSTER_PATTERN1_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Descr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST1__DESCR = MONSTER_PATTERN1_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Monster Inst1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST1_FEATURE_COUNT = MONSTER_PATTERN1_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.MonsterInst2Impl <em>Monster Inst2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.MonsterInst2Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getMonsterInst2()
   * @generated
   */
  int MONSTER_INST2 = 39;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__VALUE = MONSTER_PATTERN2_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Speciallook</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__SPECIALLOOK = MONSTER_PATTERN2_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Ap</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__AP = MONSTER_PATTERN2_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Mapmove</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__MAPMOVE = MONSTER_PATTERN2_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Hp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__HP = MONSTER_PATTERN2_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Prot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__PROT = MONSTER_PATTERN2_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__SIZE = MONSTER_PATTERN2_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Ressize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__RESSIZE = MONSTER_PATTERN2_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Str</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__STR = MONSTER_PATTERN2_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Enc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__ENC = MONSTER_PATTERN2_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Att</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__ATT = MONSTER_PATTERN2_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Def</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__DEF = MONSTER_PATTERN2_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Prec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__PREC = MONSTER_PATTERN2_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Mr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__MR = MONSTER_PATTERN2_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Mor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__MOR = MONSTER_PATTERN2_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Gcost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__GCOST = MONSTER_PATTERN2_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Rcost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__RCOST = MONSTER_PATTERN2_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Pathcost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__PATHCOST = MONSTER_PATTERN2_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Startdom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__STARTDOM = MONSTER_PATTERN2_FEATURE_COUNT + 18;

  /**
   * The feature id for the '<em><b>Eyes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__EYES = MONSTER_PATTERN2_FEATURE_COUNT + 19;

  /**
   * The feature id for the '<em><b>Copystats</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__COPYSTATS = MONSTER_PATTERN2_FEATURE_COUNT + 20;

  /**
   * The feature id for the '<em><b>Copyspr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__COPYSPR = MONSTER_PATTERN2_FEATURE_COUNT + 21;

  /**
   * The feature id for the '<em><b>Restrictedgod</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__RESTRICTEDGOD = MONSTER_PATTERN2_FEATURE_COUNT + 22;

  /**
   * The feature id for the '<em><b>Shatteredsoul</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__SHATTEREDSOUL = MONSTER_PATTERN2_FEATURE_COUNT + 23;

  /**
   * The feature id for the '<em><b>Coldres</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__COLDRES = MONSTER_PATTERN2_FEATURE_COUNT + 24;

  /**
   * The feature id for the '<em><b>Fireres</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__FIRERES = MONSTER_PATTERN2_FEATURE_COUNT + 25;

  /**
   * The feature id for the '<em><b>Poisonres</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__POISONRES = MONSTER_PATTERN2_FEATURE_COUNT + 26;

  /**
   * The feature id for the '<em><b>Shockres</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__SHOCKRES = MONSTER_PATTERN2_FEATURE_COUNT + 27;

  /**
   * The feature id for the '<em><b>Darkvision</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__DARKVISION = MONSTER_PATTERN2_FEATURE_COUNT + 28;

  /**
   * The feature id for the '<em><b>Seduce</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__SEDUCE = MONSTER_PATTERN2_FEATURE_COUNT + 29;

  /**
   * The feature id for the '<em><b>Succubus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__SUCCUBUS = MONSTER_PATTERN2_FEATURE_COUNT + 30;

  /**
   * The feature id for the '<em><b>Beckon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__BECKON = MONSTER_PATTERN2_FEATURE_COUNT + 31;

  /**
   * The feature id for the '<em><b>Startage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__STARTAGE = MONSTER_PATTERN2_FEATURE_COUNT + 32;

  /**
   * The feature id for the '<em><b>Maxage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__MAXAGE = MONSTER_PATTERN2_FEATURE_COUNT + 33;

  /**
   * The feature id for the '<em><b>Older</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__OLDER = MONSTER_PATTERN2_FEATURE_COUNT + 34;

  /**
   * The feature id for the '<em><b>Healer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__HEALER = MONSTER_PATTERN2_FEATURE_COUNT + 35;

  /**
   * The feature id for the '<em><b>Startaff</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__STARTAFF = MONSTER_PATTERN2_FEATURE_COUNT + 36;

  /**
   * The feature id for the '<em><b>Supplybonus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__SUPPLYBONUS = MONSTER_PATTERN2_FEATURE_COUNT + 37;

  /**
   * The feature id for the '<em><b>Uwdamage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__UWDAMAGE = MONSTER_PATTERN2_FEATURE_COUNT + 38;

  /**
   * The feature id for the '<em><b>Homesick</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__HOMESICK = MONSTER_PATTERN2_FEATURE_COUNT + 39;

  /**
   * The feature id for the '<em><b>Coldpower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__COLDPOWER = MONSTER_PATTERN2_FEATURE_COUNT + 40;

  /**
   * The feature id for the '<em><b>Firepower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__FIREPOWER = MONSTER_PATTERN2_FEATURE_COUNT + 41;

  /**
   * The feature id for the '<em><b>Stormpower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__STORMPOWER = MONSTER_PATTERN2_FEATURE_COUNT + 42;

  /**
   * The feature id for the '<em><b>Darkpower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__DARKPOWER = MONSTER_PATTERN2_FEATURE_COUNT + 43;

  /**
   * The feature id for the '<em><b>Springpower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__SPRINGPOWER = MONSTER_PATTERN2_FEATURE_COUNT + 44;

  /**
   * The feature id for the '<em><b>Summerpower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__SUMMERPOWER = MONSTER_PATTERN2_FEATURE_COUNT + 45;

  /**
   * The feature id for the '<em><b>Fallpower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__FALLPOWER = MONSTER_PATTERN2_FEATURE_COUNT + 46;

  /**
   * The feature id for the '<em><b>Winterpower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__WINTERPOWER = MONSTER_PATTERN2_FEATURE_COUNT + 47;

  /**
   * The feature id for the '<em><b>Ambidextrous</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__AMBIDEXTROUS = MONSTER_PATTERN2_FEATURE_COUNT + 48;

  /**
   * The feature id for the '<em><b>Banefireshield</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__BANEFIRESHIELD = MONSTER_PATTERN2_FEATURE_COUNT + 49;

  /**
   * The feature id for the '<em><b>Berserk</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__BERSERK = MONSTER_PATTERN2_FEATURE_COUNT + 50;

  /**
   * The feature id for the '<em><b>Standard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__STANDARD = MONSTER_PATTERN2_FEATURE_COUNT + 51;

  /**
   * The feature id for the '<em><b>Animalawe</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__ANIMALAWE = MONSTER_PATTERN2_FEATURE_COUNT + 52;

  /**
   * The feature id for the '<em><b>Awe</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__AWE = MONSTER_PATTERN2_FEATURE_COUNT + 53;

  /**
   * The feature id for the '<em><b>Fear</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__FEAR = MONSTER_PATTERN2_FEATURE_COUNT + 54;

  /**
   * The feature id for the '<em><b>Regeneration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__REGENERATION = MONSTER_PATTERN2_FEATURE_COUNT + 55;

  /**
   * The feature id for the '<em><b>Reinvigoration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__REINVIGORATION = MONSTER_PATTERN2_FEATURE_COUNT + 56;

  /**
   * The feature id for the '<em><b>Fireshield</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__FIRESHIELD = MONSTER_PATTERN2_FEATURE_COUNT + 57;

  /**
   * The feature id for the '<em><b>Iceprot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__ICEPROT = MONSTER_PATTERN2_FEATURE_COUNT + 58;

  /**
   * The feature id for the '<em><b>Poisoncloud</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__POISONCLOUD = MONSTER_PATTERN2_FEATURE_COUNT + 59;

  /**
   * The feature id for the '<em><b>Diseasecloud</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__DISEASECLOUD = MONSTER_PATTERN2_FEATURE_COUNT + 60;

  /**
   * The feature id for the '<em><b>Bloodvengeance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__BLOODVENGEANCE = MONSTER_PATTERN2_FEATURE_COUNT + 61;

  /**
   * The feature id for the '<em><b>Castledef</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__CASTLEDEF = MONSTER_PATTERN2_FEATURE_COUNT + 62;

  /**
   * The feature id for the '<em><b>Siegebonus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__SIEGEBONUS = MONSTER_PATTERN2_FEATURE_COUNT + 63;

  /**
   * The feature id for the '<em><b>Patrolbonus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__PATROLBONUS = MONSTER_PATTERN2_FEATURE_COUNT + 64;

  /**
   * The feature id for the '<em><b>Pillagebonus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__PILLAGEBONUS = MONSTER_PATTERN2_FEATURE_COUNT + 65;

  /**
   * The feature id for the '<em><b>Researchbonus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__RESEARCHBONUS = MONSTER_PATTERN2_FEATURE_COUNT + 66;

  /**
   * The feature id for the '<em><b>Forgebonus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__FORGEBONUS = MONSTER_PATTERN2_FEATURE_COUNT + 67;

  /**
   * The feature id for the '<em><b>Douse</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__DOUSE = MONSTER_PATTERN2_FEATURE_COUNT + 68;

  /**
   * The feature id for the '<em><b>Nobadevents</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__NOBADEVENTS = MONSTER_PATTERN2_FEATURE_COUNT + 69;

  /**
   * The feature id for the '<em><b>Incunrest</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__INCUNREST = MONSTER_PATTERN2_FEATURE_COUNT + 70;

  /**
   * The feature id for the '<em><b>Spreaddom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__SPREADDOM = MONSTER_PATTERN2_FEATURE_COUNT + 71;

  /**
   * The feature id for the '<em><b>Leper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__LEPER = MONSTER_PATTERN2_FEATURE_COUNT + 72;

  /**
   * The feature id for the '<em><b>Popkill</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__POPKILL = MONSTER_PATTERN2_FEATURE_COUNT + 73;

  /**
   * The feature id for the '<em><b>Heretic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__HERETIC = MONSTER_PATTERN2_FEATURE_COUNT + 74;

  /**
   * The feature id for the '<em><b>Itemslots</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__ITEMSLOTS = MONSTER_PATTERN2_FEATURE_COUNT + 75;

  /**
   * The feature id for the '<em><b>Nametype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2__NAMETYPE = MONSTER_PATTERN2_FEATURE_COUNT + 76;

  /**
   * The number of structural features of the '<em>Monster Inst2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST2_FEATURE_COUNT = MONSTER_PATTERN2_FEATURE_COUNT + 77;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.MonsterInst3Impl <em>Monster Inst3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.MonsterInst3Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getMonsterInst3()
   * @generated
   */
  int MONSTER_INST3 = 40;

  /**
   * The feature id for the '<em><b>Value1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST3__VALUE1 = MONSTER_PATTERN3_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST3__VALUE2 = MONSTER_PATTERN3_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Magicskill</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST3__MAGICSKILL = MONSTER_PATTERN3_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Custommagic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST3__CUSTOMMAGIC = MONSTER_PATTERN3_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Magicboost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST3__MAGICBOOST = MONSTER_PATTERN3_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Gemprod</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST3__GEMPROD = MONSTER_PATTERN3_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Monster Inst3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST3_FEATURE_COUNT = MONSTER_PATTERN3_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.MonsterInst4Impl <em>Monster Inst4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.MonsterInst4Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getMonsterInst4()
   * @generated
   */
  int MONSTER_INST4 = 41;

  /**
   * The feature id for the '<em><b>Clear</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__CLEAR = MONSTER_PATTERN4_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Clearweapons</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__CLEARWEAPONS = MONSTER_PATTERN4_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Cleararmor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__CLEARARMOR = MONSTER_PATTERN4_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Clearmagic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__CLEARMAGIC = MONSTER_PATTERN4_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Clearspec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__CLEARSPEC = MONSTER_PATTERN4_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Female</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__FEMALE = MONSTER_PATTERN4_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Mounted</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__MOUNTED = MONSTER_PATTERN4_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Holy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__HOLY = MONSTER_PATTERN4_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Animal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__ANIMAL = MONSTER_PATTERN4_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Undead</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__UNDEAD = MONSTER_PATTERN4_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Demon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__DEMON = MONSTER_PATTERN4_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Magicbeing</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__MAGICBEING = MONSTER_PATTERN4_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Stonebeing</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__STONEBEING = MONSTER_PATTERN4_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Inanimate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__INANIMATE = MONSTER_PATTERN4_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Coldblood</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__COLDBLOOD = MONSTER_PATTERN4_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Immortal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__IMMORTAL = MONSTER_PATTERN4_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Blind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__BLIND = MONSTER_PATTERN4_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__UNIQUE = MONSTER_PATTERN4_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Immobile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__IMMOBILE = MONSTER_PATTERN4_FEATURE_COUNT + 18;

  /**
   * The feature id for the '<em><b>Aquatic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__AQUATIC = MONSTER_PATTERN4_FEATURE_COUNT + 19;

  /**
   * The feature id for the '<em><b>Amphibian</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__AMPHIBIAN = MONSTER_PATTERN4_FEATURE_COUNT + 20;

  /**
   * The feature id for the '<em><b>Pooramphibian</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__POORAMPHIBIAN = MONSTER_PATTERN4_FEATURE_COUNT + 21;

  /**
   * The feature id for the '<em><b>Flying</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__FLYING = MONSTER_PATTERN4_FEATURE_COUNT + 22;

  /**
   * The feature id for the '<em><b>Stormimmune</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__STORMIMMUNE = MONSTER_PATTERN4_FEATURE_COUNT + 23;

  /**
   * The feature id for the '<em><b>Sailing</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__SAILING = MONSTER_PATTERN4_FEATURE_COUNT + 24;

  /**
   * The feature id for the '<em><b>Forestsurvival</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__FORESTSURVIVAL = MONSTER_PATTERN4_FEATURE_COUNT + 25;

  /**
   * The feature id for the '<em><b>Mountainsurvival</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__MOUNTAINSURVIVAL = MONSTER_PATTERN4_FEATURE_COUNT + 26;

  /**
   * The feature id for the '<em><b>Swampsurvival</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__SWAMPSURVIVAL = MONSTER_PATTERN4_FEATURE_COUNT + 27;

  /**
   * The feature id for the '<em><b>Wastesurvival</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__WASTESURVIVAL = MONSTER_PATTERN4_FEATURE_COUNT + 28;

  /**
   * The feature id for the '<em><b>Illusion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__ILLUSION = MONSTER_PATTERN4_FEATURE_COUNT + 29;

  /**
   * The feature id for the '<em><b>Spy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__SPY = MONSTER_PATTERN4_FEATURE_COUNT + 30;

  /**
   * The feature id for the '<em><b>Assassin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__ASSASSIN = MONSTER_PATTERN4_FEATURE_COUNT + 31;

  /**
   * The feature id for the '<em><b>Heal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__HEAL = MONSTER_PATTERN4_FEATURE_COUNT + 32;

  /**
   * The feature id for the '<em><b>Noheal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__NOHEAL = MONSTER_PATTERN4_FEATURE_COUNT + 33;

  /**
   * The feature id for the '<em><b>Neednoteat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__NEEDNOTEAT = MONSTER_PATTERN4_FEATURE_COUNT + 34;

  /**
   * The feature id for the '<em><b>Ethereal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__ETHEREAL = MONSTER_PATTERN4_FEATURE_COUNT + 35;

  /**
   * The feature id for the '<em><b>Trample</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__TRAMPLE = MONSTER_PATTERN4_FEATURE_COUNT + 36;

  /**
   * The feature id for the '<em><b>Entangle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__ENTANGLE = MONSTER_PATTERN4_FEATURE_COUNT + 37;

  /**
   * The feature id for the '<em><b>Eyeloss</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__EYELOSS = MONSTER_PATTERN4_FEATURE_COUNT + 38;

  /**
   * The feature id for the '<em><b>Horrormark</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__HORRORMARK = MONSTER_PATTERN4_FEATURE_COUNT + 39;

  /**
   * The feature id for the '<em><b>Poisonarmor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__POISONARMOR = MONSTER_PATTERN4_FEATURE_COUNT + 40;

  /**
   * The feature id for the '<em><b>Inquisitor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__INQUISITOR = MONSTER_PATTERN4_FEATURE_COUNT + 41;

  /**
   * The feature id for the '<em><b>Noitem</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__NOITEM = MONSTER_PATTERN4_FEATURE_COUNT + 42;

  /**
   * The feature id for the '<em><b>Drainimmune</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__DRAINIMMUNE = MONSTER_PATTERN4_FEATURE_COUNT + 43;

  /**
   * The feature id for the '<em><b>Noleader</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__NOLEADER = MONSTER_PATTERN4_FEATURE_COUNT + 44;

  /**
   * The feature id for the '<em><b>Poorleader</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__POORLEADER = MONSTER_PATTERN4_FEATURE_COUNT + 45;

  /**
   * The feature id for the '<em><b>Okleader</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__OKLEADER = MONSTER_PATTERN4_FEATURE_COUNT + 46;

  /**
   * The feature id for the '<em><b>Goodleader</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__GOODLEADER = MONSTER_PATTERN4_FEATURE_COUNT + 47;

  /**
   * The feature id for the '<em><b>Expertleader</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__EXPERTLEADER = MONSTER_PATTERN4_FEATURE_COUNT + 48;

  /**
   * The feature id for the '<em><b>Superiorleader</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__SUPERIORLEADER = MONSTER_PATTERN4_FEATURE_COUNT + 49;

  /**
   * The feature id for the '<em><b>Nomagicleader</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__NOMAGICLEADER = MONSTER_PATTERN4_FEATURE_COUNT + 50;

  /**
   * The feature id for the '<em><b>Poormagicleader</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__POORMAGICLEADER = MONSTER_PATTERN4_FEATURE_COUNT + 51;

  /**
   * The feature id for the '<em><b>Okmagicleader</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__OKMAGICLEADER = MONSTER_PATTERN4_FEATURE_COUNT + 52;

  /**
   * The feature id for the '<em><b>Goodmagicleader</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__GOODMAGICLEADER = MONSTER_PATTERN4_FEATURE_COUNT + 53;

  /**
   * The feature id for the '<em><b>Expertmagicleader</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__EXPERTMAGICLEADER = MONSTER_PATTERN4_FEATURE_COUNT + 54;

  /**
   * The feature id for the '<em><b>Superiormagicleader</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__SUPERIORMAGICLEADER = MONSTER_PATTERN4_FEATURE_COUNT + 55;

  /**
   * The feature id for the '<em><b>Noundeadleader</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__NOUNDEADLEADER = MONSTER_PATTERN4_FEATURE_COUNT + 56;

  /**
   * The feature id for the '<em><b>Poorundeadleader</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__POORUNDEADLEADER = MONSTER_PATTERN4_FEATURE_COUNT + 57;

  /**
   * The feature id for the '<em><b>Okundeadleader</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__OKUNDEADLEADER = MONSTER_PATTERN4_FEATURE_COUNT + 58;

  /**
   * The feature id for the '<em><b>Goodundeadleader</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__GOODUNDEADLEADER = MONSTER_PATTERN4_FEATURE_COUNT + 59;

  /**
   * The feature id for the '<em><b>Expertundeadleader</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__EXPERTUNDEADLEADER = MONSTER_PATTERN4_FEATURE_COUNT + 60;

  /**
   * The feature id for the '<em><b>Superiorundeadleader</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4__SUPERIORUNDEADLEADER = MONSTER_PATTERN4_FEATURE_COUNT + 61;

  /**
   * The number of structural features of the '<em>Monster Inst4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST4_FEATURE_COUNT = MONSTER_PATTERN4_FEATURE_COUNT + 62;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.MonsterInst5Impl <em>Monster Inst5</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.MonsterInst5Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getMonsterInst5()
   * @generated
   */
  int MONSTER_INST5 = 42;

  /**
   * The feature id for the '<em><b>Value1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST5__VALUE1 = MONSTER_PATTERN5_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST5__VALUE2 = MONSTER_PATTERN5_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Weapon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST5__WEAPON = MONSTER_PATTERN5_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Armor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST5__ARMOR = MONSTER_PATTERN5_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Onebattlespell</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST5__ONEBATTLESPELL = MONSTER_PATTERN5_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Firstshape</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST5__FIRSTSHAPE = MONSTER_PATTERN5_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Secondshape</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST5__SECONDSHAPE = MONSTER_PATTERN5_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Secondtmpshape</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST5__SECONDTMPSHAPE = MONSTER_PATTERN5_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Shapechange</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST5__SHAPECHANGE = MONSTER_PATTERN5_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Landshape</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST5__LANDSHAPE = MONSTER_PATTERN5_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Watershape</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST5__WATERSHAPE = MONSTER_PATTERN5_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Forestshape</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST5__FORESTSHAPE = MONSTER_PATTERN5_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Plainshape</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST5__PLAINSHAPE = MONSTER_PATTERN5_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Domsummon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST5__DOMSUMMON = MONSTER_PATTERN5_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Domsummon2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST5__DOMSUMMON2 = MONSTER_PATTERN5_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Domsummon20</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST5__DOMSUMMON20 = MONSTER_PATTERN5_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Makemonster1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST5__MAKEMONSTER1 = MONSTER_PATTERN5_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Makemonster2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST5__MAKEMONSTER2 = MONSTER_PATTERN5_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Makemonster3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST5__MAKEMONSTER3 = MONSTER_PATTERN5_FEATURE_COUNT + 18;

  /**
   * The feature id for the '<em><b>Makemonster4</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST5__MAKEMONSTER4 = MONSTER_PATTERN5_FEATURE_COUNT + 19;

  /**
   * The feature id for the '<em><b>Makemonster5</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST5__MAKEMONSTER5 = MONSTER_PATTERN5_FEATURE_COUNT + 20;

  /**
   * The feature id for the '<em><b>Summon1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST5__SUMMON1 = MONSTER_PATTERN5_FEATURE_COUNT + 21;

  /**
   * The feature id for the '<em><b>Summon5</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST5__SUMMON5 = MONSTER_PATTERN5_FEATURE_COUNT + 22;

  /**
   * The number of structural features of the '<em>Monster Inst5</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST5_FEATURE_COUNT = MONSTER_PATTERN5_FEATURE_COUNT + 23;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.MonsterInst6Impl <em>Monster Inst6</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.MonsterInst6Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getMonsterInst6()
   * @generated
   */
  int MONSTER_INST6 = 43;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST6__VALUE = MONSTER_PATTERN6_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Stealthy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST6__STEALTHY = MONSTER_PATTERN6_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Heat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST6__HEAT = MONSTER_PATTERN6_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Cold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST6__COLD = MONSTER_PATTERN6_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Monster Inst6</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONSTER_INST6_FEATURE_COUNT = MONSTER_PATTERN6_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SpellImpl <em>Spell</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SpellImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSpell()
   * @generated
   */
  int SPELL = 44;

  /**
   * The feature id for the '<em><b>Mods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL__MODS = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Spell</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SelectSpellByIdImpl <em>Select Spell By Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SelectSpellByIdImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSelectSpellById()
   * @generated
   */
  int SELECT_SPELL_BY_ID = 45;

  /**
   * The feature id for the '<em><b>Mods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_SPELL_BY_ID__MODS = SPELL__MODS;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_SPELL_BY_ID__VALUE = SPELL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Select Spell By Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_SPELL_BY_ID_FEATURE_COUNT = SPELL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SelectSpellByNameImpl <em>Select Spell By Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SelectSpellByNameImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSelectSpellByName()
   * @generated
   */
  int SELECT_SPELL_BY_NAME = 46;

  /**
   * The feature id for the '<em><b>Mods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_SPELL_BY_NAME__MODS = SPELL__MODS;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_SPELL_BY_NAME__VALUE = SPELL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Select Spell By Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_SPELL_BY_NAME_FEATURE_COUNT = SPELL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.NewSpellImpl <em>New Spell</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.NewSpellImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getNewSpell()
   * @generated
   */
  int NEW_SPELL = 47;

  /**
   * The feature id for the '<em><b>Mods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_SPELL__MODS = SPELL__MODS;

  /**
   * The number of structural features of the '<em>New Spell</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_SPELL_FEATURE_COUNT = SPELL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SpellModsImpl <em>Spell Mods</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SpellModsImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSpellMods()
   * @generated
   */
  int SPELL_MODS = 48;

  /**
   * The number of structural features of the '<em>Spell Mods</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_MODS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SpellPattern1Impl <em>Spell Pattern1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SpellPattern1Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSpellPattern1()
   * @generated
   */
  int SPELL_PATTERN1 = 49;

  /**
   * The number of structural features of the '<em>Spell Pattern1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_PATTERN1_FEATURE_COUNT = SPELL_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SpellPattern2Impl <em>Spell Pattern2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SpellPattern2Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSpellPattern2()
   * @generated
   */
  int SPELL_PATTERN2 = 50;

  /**
   * The number of structural features of the '<em>Spell Pattern2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_PATTERN2_FEATURE_COUNT = SPELL_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SpellPattern3Impl <em>Spell Pattern3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SpellPattern3Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSpellPattern3()
   * @generated
   */
  int SPELL_PATTERN3 = 51;

  /**
   * The number of structural features of the '<em>Spell Pattern3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_PATTERN3_FEATURE_COUNT = SPELL_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SpellPattern4Impl <em>Spell Pattern4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SpellPattern4Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSpellPattern4()
   * @generated
   */
  int SPELL_PATTERN4 = 52;

  /**
   * The number of structural features of the '<em>Spell Pattern4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_PATTERN4_FEATURE_COUNT = SPELL_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SpellPattern5Impl <em>Spell Pattern5</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SpellPattern5Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSpellPattern5()
   * @generated
   */
  int SPELL_PATTERN5 = 53;

  /**
   * The number of structural features of the '<em>Spell Pattern5</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_PATTERN5_FEATURE_COUNT = SPELL_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SpellInst1Impl <em>Spell Inst1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SpellInst1Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSpellInst1()
   * @generated
   */
  int SPELL_INST1 = 54;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST1__VALUE = SPELL_PATTERN1_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST1__NAME = SPELL_PATTERN1_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Descr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST1__DESCR = SPELL_PATTERN1_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Spell Inst1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST1_FEATURE_COUNT = SPELL_PATTERN1_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SpellInst2Impl <em>Spell Inst2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SpellInst2Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSpellInst2()
   * @generated
   */
  int SPELL_INST2 = 55;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST2__VALUE = SPELL_PATTERN2_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>School</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST2__SCHOOL = SPELL_PATTERN2_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Researchlevel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST2__RESEARCHLEVEL = SPELL_PATTERN2_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Aoe</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST2__AOE = SPELL_PATTERN2_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Damage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST2__DAMAGE = SPELL_PATTERN2_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Effect</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST2__EFFECT = SPELL_PATTERN2_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Fatiguecost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST2__FATIGUECOST = SPELL_PATTERN2_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Flightspr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST2__FLIGHTSPR = SPELL_PATTERN2_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Explspr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST2__EXPLSPR = SPELL_PATTERN2_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Nreff</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST2__NREFF = SPELL_PATTERN2_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Range</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST2__RANGE = SPELL_PATTERN2_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Precision</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST2__PRECISION = SPELL_PATTERN2_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Sound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST2__SOUND = SPELL_PATTERN2_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Spec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST2__SPEC = SPELL_PATTERN2_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Restricted</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST2__RESTRICTED = SPELL_PATTERN2_FEATURE_COUNT + 14;

  /**
   * The number of structural features of the '<em>Spell Inst2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST2_FEATURE_COUNT = SPELL_PATTERN2_FEATURE_COUNT + 15;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SpellInst3Impl <em>Spell Inst3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SpellInst3Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSpellInst3()
   * @generated
   */
  int SPELL_INST3 = 56;

  /**
   * The feature id for the '<em><b>Value1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST3__VALUE1 = SPELL_PATTERN3_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST3__VALUE2 = SPELL_PATTERN3_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST3__PATH = SPELL_PATTERN3_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Pathlevel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST3__PATHLEVEL = SPELL_PATTERN3_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Spell Inst3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST3_FEATURE_COUNT = SPELL_PATTERN3_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SpellInst4Impl <em>Spell Inst4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SpellInst4Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSpellInst4()
   * @generated
   */
  int SPELL_INST4 = 57;

  /**
   * The feature id for the '<em><b>Clear</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST4__CLEAR = SPELL_PATTERN4_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Spell Inst4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST4_FEATURE_COUNT = SPELL_PATTERN4_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SpellInst5Impl <em>Spell Inst5</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SpellInst5Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSpellInst5()
   * @generated
   */
  int SPELL_INST5 = 58;

  /**
   * The feature id for the '<em><b>Value1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST5__VALUE1 = SPELL_PATTERN5_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST5__VALUE2 = SPELL_PATTERN5_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Copyspell</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST5__COPYSPELL = SPELL_PATTERN5_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Nextspell</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST5__NEXTSPELL = SPELL_PATTERN5_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Spell Inst5</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_INST5_FEATURE_COUNT = SPELL_PATTERN5_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.ItemImpl <em>Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.ItemImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getItem()
   * @generated
   */
  int ITEM = 59;

  /**
   * The feature id for the '<em><b>Mods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__MODS = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SelectItemByIdImpl <em>Select Item By Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SelectItemByIdImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSelectItemById()
   * @generated
   */
  int SELECT_ITEM_BY_ID = 60;

  /**
   * The feature id for the '<em><b>Mods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_ITEM_BY_ID__MODS = ITEM__MODS;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_ITEM_BY_ID__VALUE = ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Select Item By Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_ITEM_BY_ID_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SelectItemByNameImpl <em>Select Item By Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SelectItemByNameImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSelectItemByName()
   * @generated
   */
  int SELECT_ITEM_BY_NAME = 61;

  /**
   * The feature id for the '<em><b>Mods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_ITEM_BY_NAME__MODS = ITEM__MODS;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_ITEM_BY_NAME__VALUE = ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Select Item By Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_ITEM_BY_NAME_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.NewItemImpl <em>New Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.NewItemImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getNewItem()
   * @generated
   */
  int NEW_ITEM = 62;

  /**
   * The feature id for the '<em><b>Mods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_ITEM__MODS = ITEM__MODS;

  /**
   * The number of structural features of the '<em>New Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.ItemModsImpl <em>Item Mods</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.ItemModsImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getItemMods()
   * @generated
   */
  int ITEM_MODS = 63;

  /**
   * The number of structural features of the '<em>Item Mods</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_MODS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.ItemPattern1Impl <em>Item Pattern1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.ItemPattern1Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getItemPattern1()
   * @generated
   */
  int ITEM_PATTERN1 = 64;

  /**
   * The number of structural features of the '<em>Item Pattern1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_PATTERN1_FEATURE_COUNT = ITEM_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.ItemPattern2Impl <em>Item Pattern2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.ItemPattern2Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getItemPattern2()
   * @generated
   */
  int ITEM_PATTERN2 = 65;

  /**
   * The number of structural features of the '<em>Item Pattern2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_PATTERN2_FEATURE_COUNT = ITEM_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.ItemPattern3Impl <em>Item Pattern3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.ItemPattern3Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getItemPattern3()
   * @generated
   */
  int ITEM_PATTERN3 = 66;

  /**
   * The number of structural features of the '<em>Item Pattern3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_PATTERN3_FEATURE_COUNT = ITEM_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.ItemInst1Impl <em>Item Inst1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.ItemInst1Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getItemInst1()
   * @generated
   */
  int ITEM_INST1 = 67;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_INST1__VALUE = ITEM_PATTERN1_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_INST1__NAME = ITEM_PATTERN1_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Descr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_INST1__DESCR = ITEM_PATTERN1_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Armor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_INST1__ARMOR = ITEM_PATTERN1_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Item Inst1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_INST1_FEATURE_COUNT = ITEM_PATTERN1_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.ItemInst2Impl <em>Item Inst2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.ItemInst2Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getItemInst2()
   * @generated
   */
  int ITEM_INST2 = 68;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_INST2__VALUE = ITEM_PATTERN2_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Constlevel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_INST2__CONSTLEVEL = ITEM_PATTERN2_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Mainpath</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_INST2__MAINPATH = ITEM_PATTERN2_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Mainlevel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_INST2__MAINLEVEL = ITEM_PATTERN2_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Secondarypath</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_INST2__SECONDARYPATH = ITEM_PATTERN2_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Secondarylevel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_INST2__SECONDARYLEVEL = ITEM_PATTERN2_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_INST2__TYPE = ITEM_PATTERN2_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Item Inst2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_INST2_FEATURE_COUNT = ITEM_PATTERN2_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.ItemInst3Impl <em>Item Inst3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.ItemInst3Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getItemInst3()
   * @generated
   */
  int ITEM_INST3 = 69;

  /**
   * The feature id for the '<em><b>Value1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_INST3__VALUE1 = ITEM_PATTERN3_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_INST3__VALUE2 = ITEM_PATTERN3_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Copyspr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_INST3__COPYSPR = ITEM_PATTERN3_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Weapon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_INST3__WEAPON = ITEM_PATTERN3_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Item Inst3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_INST3_FEATURE_COUNT = ITEM_PATTERN3_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.NameImpl <em>Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.NameImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getName_()
   * @generated
   */
  int NAME = 70;

  /**
   * The number of structural features of the '<em>Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SelectNameImpl <em>Select Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SelectNameImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSelectName()
   * @generated
   */
  int SELECT_NAME = 71;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_NAME__VALUE = NAME_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_NAME__MODS = NAME_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Select Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_NAME_FEATURE_COUNT = NAME_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.NameModsImpl <em>Name Mods</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.NameModsImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getNameMods()
   * @generated
   */
  int NAME_MODS = 72;

  /**
   * The number of structural features of the '<em>Name Mods</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_MODS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.NamePattern1Impl <em>Name Pattern1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.NamePattern1Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getNamePattern1()
   * @generated
   */
  int NAME_PATTERN1 = 73;

  /**
   * The number of structural features of the '<em>Name Pattern1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_PATTERN1_FEATURE_COUNT = NAME_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.NamePattern2Impl <em>Name Pattern2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.NamePattern2Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getNamePattern2()
   * @generated
   */
  int NAME_PATTERN2 = 74;

  /**
   * The number of structural features of the '<em>Name Pattern2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_PATTERN2_FEATURE_COUNT = NAME_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.NameInst1Impl <em>Name Inst1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.NameInst1Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getNameInst1()
   * @generated
   */
  int NAME_INST1 = 75;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_INST1__VALUE = NAME_PATTERN1_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_INST1__NAME = NAME_PATTERN1_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Name Inst1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_INST1_FEATURE_COUNT = NAME_PATTERN1_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.NameInst2Impl <em>Name Inst2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.NameInst2Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getNameInst2()
   * @generated
   */
  int NAME_INST2 = 76;

  /**
   * The feature id for the '<em><b>Clear</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_INST2__CLEAR = NAME_PATTERN2_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Name Inst2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_INST2_FEATURE_COUNT = NAME_PATTERN2_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SiteImpl <em>Site</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SiteImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSite()
   * @generated
   */
  int SITE = 77;

  /**
   * The feature id for the '<em><b>Mods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE__MODS = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Site</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SelectSiteByIdImpl <em>Select Site By Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SelectSiteByIdImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSelectSiteById()
   * @generated
   */
  int SELECT_SITE_BY_ID = 78;

  /**
   * The feature id for the '<em><b>Mods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_SITE_BY_ID__MODS = SITE__MODS;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_SITE_BY_ID__VALUE = SITE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Select Site By Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_SITE_BY_ID_FEATURE_COUNT = SITE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SelectSiteByNameImpl <em>Select Site By Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SelectSiteByNameImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSelectSiteByName()
   * @generated
   */
  int SELECT_SITE_BY_NAME = 79;

  /**
   * The feature id for the '<em><b>Mods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_SITE_BY_NAME__MODS = SITE__MODS;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_SITE_BY_NAME__VALUE = SITE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Select Site By Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_SITE_BY_NAME_FEATURE_COUNT = SITE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.NewSiteImpl <em>New Site</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.NewSiteImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getNewSite()
   * @generated
   */
  int NEW_SITE = 80;

  /**
   * The feature id for the '<em><b>Mods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_SITE__MODS = SITE__MODS;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_SITE__VALUE = SITE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>New Site</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_SITE_FEATURE_COUNT = SITE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SiteModsImpl <em>Site Mods</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SiteModsImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSiteMods()
   * @generated
   */
  int SITE_MODS = 81;

  /**
   * The number of structural features of the '<em>Site Mods</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_MODS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SitePattern1Impl <em>Site Pattern1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SitePattern1Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSitePattern1()
   * @generated
   */
  int SITE_PATTERN1 = 82;

  /**
   * The number of structural features of the '<em>Site Pattern1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_PATTERN1_FEATURE_COUNT = SITE_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SitePattern2Impl <em>Site Pattern2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SitePattern2Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSitePattern2()
   * @generated
   */
  int SITE_PATTERN2 = 83;

  /**
   * The number of structural features of the '<em>Site Pattern2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_PATTERN2_FEATURE_COUNT = SITE_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SitePattern3Impl <em>Site Pattern3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SitePattern3Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSitePattern3()
   * @generated
   */
  int SITE_PATTERN3 = 84;

  /**
   * The number of structural features of the '<em>Site Pattern3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_PATTERN3_FEATURE_COUNT = SITE_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SitePattern4Impl <em>Site Pattern4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SitePattern4Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSitePattern4()
   * @generated
   */
  int SITE_PATTERN4 = 85;

  /**
   * The number of structural features of the '<em>Site Pattern4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_PATTERN4_FEATURE_COUNT = SITE_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SiteInst1Impl <em>Site Inst1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SiteInst1Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSiteInst1()
   * @generated
   */
  int SITE_INST1 = 86;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST1__VALUE = SITE_PATTERN1_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST1__NAME = SITE_PATTERN1_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Site Inst1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST1_FEATURE_COUNT = SITE_PATTERN1_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SiteInst2Impl <em>Site Inst2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SiteInst2Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSiteInst2()
   * @generated
   */
  int SITE_INST2 = 87;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST2__VALUE = SITE_PATTERN2_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST2__PATH = SITE_PATTERN2_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST2__LEVEL = SITE_PATTERN2_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Rarity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST2__RARITY = SITE_PATTERN2_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Loc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST2__LOC = SITE_PATTERN2_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Homemon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST2__HOMEMON = SITE_PATTERN2_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Homecom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST2__HOMECOM = SITE_PATTERN2_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Mon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST2__MON = SITE_PATTERN2_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Com</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST2__COM = SITE_PATTERN2_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Gold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST2__GOLD = SITE_PATTERN2_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Res</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST2__RES = SITE_PATTERN2_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Incscale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST2__INCSCALE = SITE_PATTERN2_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Decscale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST2__DECSCALE = SITE_PATTERN2_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Heal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST2__HEAL = SITE_PATTERN2_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Curse</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST2__CURSE = SITE_PATTERN2_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Disease</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST2__DISEASE = SITE_PATTERN2_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Horrormark</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST2__HORRORMARK = SITE_PATTERN2_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Holyfire</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST2__HOLYFIRE = SITE_PATTERN2_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Holypower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST2__HOLYPOWER = SITE_PATTERN2_FEATURE_COUNT + 18;

  /**
   * The feature id for the '<em><b>Conjcost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST2__CONJCOST = SITE_PATTERN2_FEATURE_COUNT + 19;

  /**
   * The feature id for the '<em><b>Altcost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST2__ALTCOST = SITE_PATTERN2_FEATURE_COUNT + 20;

  /**
   * The feature id for the '<em><b>Evocost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST2__EVOCOST = SITE_PATTERN2_FEATURE_COUNT + 21;

  /**
   * The feature id for the '<em><b>Constcost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST2__CONSTCOST = SITE_PATTERN2_FEATURE_COUNT + 22;

  /**
   * The feature id for the '<em><b>Enchcost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST2__ENCHCOST = SITE_PATTERN2_FEATURE_COUNT + 23;

  /**
   * The feature id for the '<em><b>Thaucost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST2__THAUCOST = SITE_PATTERN2_FEATURE_COUNT + 24;

  /**
   * The feature id for the '<em><b>Bloodcost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST2__BLOODCOST = SITE_PATTERN2_FEATURE_COUNT + 25;

  /**
   * The number of structural features of the '<em>Site Inst2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST2_FEATURE_COUNT = SITE_PATTERN2_FEATURE_COUNT + 26;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SiteInst3Impl <em>Site Inst3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SiteInst3Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSiteInst3()
   * @generated
   */
  int SITE_INST3 = 88;

  /**
   * The feature id for the '<em><b>Value1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST3__VALUE1 = SITE_PATTERN3_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST3__VALUE2 = SITE_PATTERN3_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Gems</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST3__GEMS = SITE_PATTERN3_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Site Inst3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST3_FEATURE_COUNT = SITE_PATTERN3_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SiteInst4Impl <em>Site Inst4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SiteInst4Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSiteInst4()
   * @generated
   */
  int SITE_INST4 = 89;

  /**
   * The feature id for the '<em><b>Clear</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST4__CLEAR = SITE_PATTERN4_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Lab</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST4__LAB = SITE_PATTERN4_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Site Inst4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITE_INST4_FEATURE_COUNT = SITE_PATTERN4_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.NationImpl <em>Nation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.NationImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getNation()
   * @generated
   */
  int NATION = 90;

  /**
   * The number of structural features of the '<em>Nation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.SelectNationImpl <em>Select Nation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.SelectNationImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getSelectNation()
   * @generated
   */
  int SELECT_NATION = 91;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_NATION__VALUE = NATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_NATION__MODS = NATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Select Nation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_NATION_FEATURE_COUNT = NATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.IndepFlagImpl <em>Indep Flag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.IndepFlagImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getIndepFlag()
   * @generated
   */
  int INDEP_FLAG = 92;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEP_FLAG__VALUE = NATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Indep Flag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEP_FLAG_FEATURE_COUNT = NATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.NationModsImpl <em>Nation Mods</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.NationModsImpl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getNationMods()
   * @generated
   */
  int NATION_MODS = 93;

  /**
   * The number of structural features of the '<em>Nation Mods</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_MODS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.NationPattern1Impl <em>Nation Pattern1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.NationPattern1Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getNationPattern1()
   * @generated
   */
  int NATION_PATTERN1 = 94;

  /**
   * The number of structural features of the '<em>Nation Pattern1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_PATTERN1_FEATURE_COUNT = NATION_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.NationPattern2Impl <em>Nation Pattern2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.NationPattern2Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getNationPattern2()
   * @generated
   */
  int NATION_PATTERN2 = 95;

  /**
   * The number of structural features of the '<em>Nation Pattern2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_PATTERN2_FEATURE_COUNT = NATION_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.NationPattern3Impl <em>Nation Pattern3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.NationPattern3Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getNationPattern3()
   * @generated
   */
  int NATION_PATTERN3 = 96;

  /**
   * The number of structural features of the '<em>Nation Pattern3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_PATTERN3_FEATURE_COUNT = NATION_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.NationPattern4Impl <em>Nation Pattern4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.NationPattern4Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getNationPattern4()
   * @generated
   */
  int NATION_PATTERN4 = 97;

  /**
   * The number of structural features of the '<em>Nation Pattern4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_PATTERN4_FEATURE_COUNT = NATION_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.NationPattern5Impl <em>Nation Pattern5</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.NationPattern5Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getNationPattern5()
   * @generated
   */
  int NATION_PATTERN5 = 98;

  /**
   * The number of structural features of the '<em>Nation Pattern5</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_PATTERN5_FEATURE_COUNT = NATION_MODS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.NationInst1Impl <em>Nation Inst1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.NationInst1Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getNationInst1()
   * @generated
   */
  int NATION_INST1 = 99;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST1__VALUE = NATION_PATTERN1_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST1__NAME = NATION_PATTERN1_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Epithet</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST1__EPITHET = NATION_PATTERN1_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Descr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST1__DESCR = NATION_PATTERN1_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Summary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST1__SUMMARY = NATION_PATTERN1_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Brief</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST1__BRIEF = NATION_PATTERN1_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Flag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST1__FLAG = NATION_PATTERN1_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Mapbackground</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST1__MAPBACKGROUND = NATION_PATTERN1_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Startsite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST1__STARTSITE = NATION_PATTERN1_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Nation Inst1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST1_FEATURE_COUNT = NATION_PATTERN1_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.NationInst2Impl <em>Nation Inst2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.NationInst2Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getNationInst2()
   * @generated
   */
  int NATION_INST2 = 100;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__VALUE = NATION_PATTERN2_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Era</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__ERA = NATION_PATTERN2_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Labcost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__LABCOST = NATION_PATTERN2_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Templecost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__TEMPLECOST = NATION_PATTERN2_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Templepic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__TEMPLEPIC = NATION_PATTERN2_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Startunitnbrs1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__STARTUNITNBRS1 = NATION_PATTERN2_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Startunitnbrs2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__STARTUNITNBRS2 = NATION_PATTERN2_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Hero1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__HERO1 = NATION_PATTERN2_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Hero2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__HERO2 = NATION_PATTERN2_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Hero3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__HERO3 = NATION_PATTERN2_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Hero4</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__HERO4 = NATION_PATTERN2_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Hero5</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__HERO5 = NATION_PATTERN2_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Hero6</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__HERO6 = NATION_PATTERN2_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Multihero1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__MULTIHERO1 = NATION_PATTERN2_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Multihero2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__MULTIHERO2 = NATION_PATTERN2_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Defmult1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__DEFMULT1 = NATION_PATTERN2_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Defmult1b</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__DEFMULT1B = NATION_PATTERN2_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Defmult2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__DEFMULT2 = NATION_PATTERN2_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Defmult2b</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__DEFMULT2B = NATION_PATTERN2_FEATURE_COUNT + 18;

  /**
   * The feature id for the '<em><b>Idealcold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__IDEALCOLD = NATION_PATTERN2_FEATURE_COUNT + 19;

  /**
   * The feature id for the '<em><b>Castleprod</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__CASTLEPROD = NATION_PATTERN2_FEATURE_COUNT + 20;

  /**
   * The feature id for the '<em><b>Domkill</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__DOMKILL = NATION_PATTERN2_FEATURE_COUNT + 21;

  /**
   * The feature id for the '<em><b>Domunrest</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__DOMUNREST = NATION_PATTERN2_FEATURE_COUNT + 22;

  /**
   * The feature id for the '<em><b>Startfort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__STARTFORT = NATION_PATTERN2_FEATURE_COUNT + 23;

  /**
   * The feature id for the '<em><b>Defaultfort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__DEFAULTFORT = NATION_PATTERN2_FEATURE_COUNT + 24;

  /**
   * The feature id for the '<em><b>Farmfort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__FARMFORT = NATION_PATTERN2_FEATURE_COUNT + 25;

  /**
   * The feature id for the '<em><b>Mountainfort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__MOUNTAINFORT = NATION_PATTERN2_FEATURE_COUNT + 26;

  /**
   * The feature id for the '<em><b>Forestfort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__FORESTFORT = NATION_PATTERN2_FEATURE_COUNT + 27;

  /**
   * The feature id for the '<em><b>Swampfort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__SWAMPFORT = NATION_PATTERN2_FEATURE_COUNT + 28;

  /**
   * The feature id for the '<em><b>Uwfort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__UWFORT = NATION_PATTERN2_FEATURE_COUNT + 29;

  /**
   * The feature id for the '<em><b>Deepfort</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2__DEEPFORT = NATION_PATTERN2_FEATURE_COUNT + 30;

  /**
   * The number of structural features of the '<em>Nation Inst2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST2_FEATURE_COUNT = NATION_PATTERN2_FEATURE_COUNT + 31;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.NationInst3Impl <em>Nation Inst3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.NationInst3Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getNationInst3()
   * @generated
   */
  int NATION_INST3 = 101;

  /**
   * The feature id for the '<em><b>Clearnation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST3__CLEARNATION = NATION_PATTERN3_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Clearrec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST3__CLEARREC = NATION_PATTERN3_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Clearsites</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST3__CLEARSITES = NATION_PATTERN3_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Uwnation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST3__UWNATION = NATION_PATTERN3_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Bloodnation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST3__BLOODNATION = NATION_PATTERN3_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Nopreach</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST3__NOPREACH = NATION_PATTERN3_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Dyingdom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST3__DYINGDOM = NATION_PATTERN3_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Sacrificedom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST3__SACRIFICEDOM = NATION_PATTERN3_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Nodeathsupply</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST3__NODEATHSUPPLY = NATION_PATTERN3_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Autoundead</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST3__AUTOUNDEAD = NATION_PATTERN3_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Zombiereanim</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST3__ZOMBIEREANIM = NATION_PATTERN3_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Horsereanim</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST3__HORSEREANIM = NATION_PATTERN3_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Wightreanim</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST3__WIGHTREANIM = NATION_PATTERN3_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Manikinreanim</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST3__MANIKINREANIM = NATION_PATTERN3_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Tombwyrmreanim</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST3__TOMBWYRMREANIM = NATION_PATTERN3_FEATURE_COUNT + 14;

  /**
   * The number of structural features of the '<em>Nation Inst3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST3_FEATURE_COUNT = NATION_PATTERN3_FEATURE_COUNT + 15;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.NationInst4Impl <em>Nation Inst4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.NationInst4Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getNationInst4()
   * @generated
   */
  int NATION_INST4 = 102;

  /**
   * The feature id for the '<em><b>Value1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST4__VALUE1 = NATION_PATTERN4_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST4__VALUE2 = NATION_PATTERN4_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Startcom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST4__STARTCOM = NATION_PATTERN4_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Startscout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST4__STARTSCOUT = NATION_PATTERN4_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Startunittype1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST4__STARTUNITTYPE1 = NATION_PATTERN4_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Startunittype2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST4__STARTUNITTYPE2 = NATION_PATTERN4_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Addrecunit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST4__ADDRECUNIT = NATION_PATTERN4_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Addreccom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST4__ADDRECCOM = NATION_PATTERN4_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Uwunit1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST4__UWUNIT1 = NATION_PATTERN4_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Uwunit2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST4__UWUNIT2 = NATION_PATTERN4_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Uwunit3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST4__UWUNIT3 = NATION_PATTERN4_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Uwunit4</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST4__UWUNIT4 = NATION_PATTERN4_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Uwunit5</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST4__UWUNIT5 = NATION_PATTERN4_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Uwcom1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST4__UWCOM1 = NATION_PATTERN4_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Uwcom2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST4__UWCOM2 = NATION_PATTERN4_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Uwcom3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST4__UWCOM3 = NATION_PATTERN4_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Uwcom4</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST4__UWCOM4 = NATION_PATTERN4_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Uwcom5</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST4__UWCOM5 = NATION_PATTERN4_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Defcom1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST4__DEFCOM1 = NATION_PATTERN4_FEATURE_COUNT + 18;

  /**
   * The feature id for the '<em><b>Defcom2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST4__DEFCOM2 = NATION_PATTERN4_FEATURE_COUNT + 19;

  /**
   * The feature id for the '<em><b>Defunit1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST4__DEFUNIT1 = NATION_PATTERN4_FEATURE_COUNT + 20;

  /**
   * The feature id for the '<em><b>Defunit1b</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST4__DEFUNIT1B = NATION_PATTERN4_FEATURE_COUNT + 21;

  /**
   * The feature id for the '<em><b>Defunit2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST4__DEFUNIT2 = NATION_PATTERN4_FEATURE_COUNT + 22;

  /**
   * The feature id for the '<em><b>Defunit2b</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST4__DEFUNIT2B = NATION_PATTERN4_FEATURE_COUNT + 23;

  /**
   * The number of structural features of the '<em>Nation Inst4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST4_FEATURE_COUNT = NATION_PATTERN4_FEATURE_COUNT + 24;

  /**
   * The meta object id for the '{@link org.larz.dom3.dm.dm.impl.NationInst5Impl <em>Nation Inst5</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.larz.dom3.dm.dm.impl.NationInst5Impl
   * @see org.larz.dom3.dm.dm.impl.DmPackageImpl#getNationInst5()
   * @generated
   */
  int NATION_INST5 = 103;

  /**
   * The feature id for the '<em><b>Value1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST5__VALUE1 = NATION_PATTERN5_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST5__VALUE2 = NATION_PATTERN5_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value3</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST5__VALUE3 = NATION_PATTERN5_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST5__COLOR = NATION_PATTERN5_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Nation Inst5</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATION_INST5_FEATURE_COUNT = NATION_PATTERN5_FEATURE_COUNT + 4;


  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.Dom3Mod <em>Dom3 Mod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dom3 Mod</em>'.
   * @see org.larz.dom3.dm.dm.Dom3Mod
   * @generated
   */
  EClass getDom3Mod();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.Dom3Mod#getModname <em>Modname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modname</em>'.
   * @see org.larz.dom3.dm.dm.Dom3Mod#getModname()
   * @see #getDom3Mod()
   * @generated
   */
  EAttribute getDom3Mod_Modname();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.Dom3Mod#getDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Desc</em>'.
   * @see org.larz.dom3.dm.dm.Dom3Mod#getDesc()
   * @see #getDom3Mod()
   * @generated
   */
  EAttribute getDom3Mod_Desc();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.Dom3Mod#getIcon <em>Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Icon</em>'.
   * @see org.larz.dom3.dm.dm.Dom3Mod#getIcon()
   * @see #getDom3Mod()
   * @generated
   */
  EAttribute getDom3Mod_Icon();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.Dom3Mod#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.larz.dom3.dm.dm.Dom3Mod#getVersion()
   * @see #getDom3Mod()
   * @generated
   */
  EAttribute getDom3Mod_Version();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.Dom3Mod#getDomversion <em>Domversion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Domversion</em>'.
   * @see org.larz.dom3.dm.dm.Dom3Mod#getDomversion()
   * @see #getDom3Mod()
   * @generated
   */
  EAttribute getDom3Mod_Domversion();

  /**
   * Returns the meta object for the containment reference list '{@link org.larz.dom3.dm.dm.Dom3Mod#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.larz.dom3.dm.dm.Dom3Mod#getElements()
   * @see #getDom3Mod()
   * @generated
   */
  EReference getDom3Mod_Elements();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Element</em>'.
   * @see org.larz.dom3.dm.dm.AbstractElement
   * @generated
   */
  EClass getAbstractElement();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.General <em>General</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>General</em>'.
   * @see org.larz.dom3.dm.dm.General
   * @generated
   */
  EClass getGeneral();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.GeneralPattern1 <em>General Pattern1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>General Pattern1</em>'.
   * @see org.larz.dom3.dm.dm.GeneralPattern1
   * @generated
   */
  EClass getGeneralPattern1();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.GeneralInst1 <em>General Inst1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>General Inst1</em>'.
   * @see org.larz.dom3.dm.dm.GeneralInst1
   * @generated
   */
  EClass getGeneralInst1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.GeneralInst1#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.GeneralInst1#getValue()
   * @see #getGeneralInst1()
   * @generated
   */
  EAttribute getGeneralInst1_Value();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.GeneralInst1#isPoppergold <em>Poppergold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Poppergold</em>'.
   * @see org.larz.dom3.dm.dm.GeneralInst1#isPoppergold()
   * @see #getGeneralInst1()
   * @generated
   */
  EAttribute getGeneralInst1_Poppergold();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.GeneralInst1#isResourcemult <em>Resourcemult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Resourcemult</em>'.
   * @see org.larz.dom3.dm.dm.GeneralInst1#isResourcemult()
   * @see #getGeneralInst1()
   * @generated
   */
  EAttribute getGeneralInst1_Resourcemult();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.GeneralInst1#isSupplymult <em>Supplymult</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supplymult</em>'.
   * @see org.larz.dom3.dm.dm.GeneralInst1#isSupplymult()
   * @see #getGeneralInst1()
   * @generated
   */
  EAttribute getGeneralInst1_Supplymult();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.GeneralInst1#isUnresthalfinc <em>Unresthalfinc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unresthalfinc</em>'.
   * @see org.larz.dom3.dm.dm.GeneralInst1#isUnresthalfinc()
   * @see #getGeneralInst1()
   * @generated
   */
  EAttribute getGeneralInst1_Unresthalfinc();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.GeneralInst1#isUnresthalfres <em>Unresthalfres</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unresthalfres</em>'.
   * @see org.larz.dom3.dm.dm.GeneralInst1#isUnresthalfres()
   * @see #getGeneralInst1()
   * @generated
   */
  EAttribute getGeneralInst1_Unresthalfres();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.GeneralInst1#isEventisrare <em>Eventisrare</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Eventisrare</em>'.
   * @see org.larz.dom3.dm.dm.GeneralInst1#isEventisrare()
   * @see #getGeneralInst1()
   * @generated
   */
  EAttribute getGeneralInst1_Eventisrare();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.GeneralInst1#isTurmoilincome <em>Turmoilincome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Turmoilincome</em>'.
   * @see org.larz.dom3.dm.dm.GeneralInst1#isTurmoilincome()
   * @see #getGeneralInst1()
   * @generated
   */
  EAttribute getGeneralInst1_Turmoilincome();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.GeneralInst1#isTurmoilevents <em>Turmoilevents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Turmoilevents</em>'.
   * @see org.larz.dom3.dm.dm.GeneralInst1#isTurmoilevents()
   * @see #getGeneralInst1()
   * @generated
   */
  EAttribute getGeneralInst1_Turmoilevents();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.GeneralInst1#isDeathincome <em>Deathincome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deathincome</em>'.
   * @see org.larz.dom3.dm.dm.GeneralInst1#isDeathincome()
   * @see #getGeneralInst1()
   * @generated
   */
  EAttribute getGeneralInst1_Deathincome();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.GeneralInst1#isDeathsupply <em>Deathsupply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deathsupply</em>'.
   * @see org.larz.dom3.dm.dm.GeneralInst1#isDeathsupply()
   * @see #getGeneralInst1()
   * @generated
   */
  EAttribute getGeneralInst1_Deathsupply();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.GeneralInst1#isDeathdeath <em>Deathdeath</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deathdeath</em>'.
   * @see org.larz.dom3.dm.dm.GeneralInst1#isDeathdeath()
   * @see #getGeneralInst1()
   * @generated
   */
  EAttribute getGeneralInst1_Deathdeath();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.GeneralInst1#isSlothincome <em>Slothincome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Slothincome</em>'.
   * @see org.larz.dom3.dm.dm.GeneralInst1#isSlothincome()
   * @see #getGeneralInst1()
   * @generated
   */
  EAttribute getGeneralInst1_Slothincome();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.GeneralInst1#isSlothresources <em>Slothresources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Slothresources</em>'.
   * @see org.larz.dom3.dm.dm.GeneralInst1#isSlothresources()
   * @see #getGeneralInst1()
   * @generated
   */
  EAttribute getGeneralInst1_Slothresources();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.GeneralInst1#isColdincome <em>Coldincome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Coldincome</em>'.
   * @see org.larz.dom3.dm.dm.GeneralInst1#isColdincome()
   * @see #getGeneralInst1()
   * @generated
   */
  EAttribute getGeneralInst1_Coldincome();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.GeneralInst1#isColdsupply <em>Coldsupply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Coldsupply</em>'.
   * @see org.larz.dom3.dm.dm.GeneralInst1#isColdsupply()
   * @see #getGeneralInst1()
   * @generated
   */
  EAttribute getGeneralInst1_Coldsupply();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.GeneralInst1#isMisfortune <em>Misfortune</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Misfortune</em>'.
   * @see org.larz.dom3.dm.dm.GeneralInst1#isMisfortune()
   * @see #getGeneralInst1()
   * @generated
   */
  EAttribute getGeneralInst1_Misfortune();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.GeneralInst1#isLuckevents <em>Luckevents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Luckevents</em>'.
   * @see org.larz.dom3.dm.dm.GeneralInst1#isLuckevents()
   * @see #getGeneralInst1()
   * @generated
   */
  EAttribute getGeneralInst1_Luckevents();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.GeneralInst1#isResearchscale <em>Researchscale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Researchscale</em>'.
   * @see org.larz.dom3.dm.dm.GeneralInst1#isResearchscale()
   * @see #getGeneralInst1()
   * @generated
   */
  EAttribute getGeneralInst1_Researchscale();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.Armor <em>Armor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Armor</em>'.
   * @see org.larz.dom3.dm.dm.Armor
   * @generated
   */
  EClass getArmor();

  /**
   * Returns the meta object for the containment reference list '{@link org.larz.dom3.dm.dm.Armor#getMods <em>Mods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mods</em>'.
   * @see org.larz.dom3.dm.dm.Armor#getMods()
   * @see #getArmor()
   * @generated
   */
  EReference getArmor_Mods();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SelectArmorById <em>Select Armor By Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Armor By Id</em>'.
   * @see org.larz.dom3.dm.dm.SelectArmorById
   * @generated
   */
  EClass getSelectArmorById();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SelectArmorById#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.SelectArmorById#getValue()
   * @see #getSelectArmorById()
   * @generated
   */
  EAttribute getSelectArmorById_Value();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SelectArmorByName <em>Select Armor By Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Armor By Name</em>'.
   * @see org.larz.dom3.dm.dm.SelectArmorByName
   * @generated
   */
  EClass getSelectArmorByName();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SelectArmorByName#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.SelectArmorByName#getValue()
   * @see #getSelectArmorByName()
   * @generated
   */
  EAttribute getSelectArmorByName_Value();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.NewArmor <em>New Armor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Armor</em>'.
   * @see org.larz.dom3.dm.dm.NewArmor
   * @generated
   */
  EClass getNewArmor();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NewArmor#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.NewArmor#getValue()
   * @see #getNewArmor()
   * @generated
   */
  EAttribute getNewArmor_Value();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.ArmorMods <em>Armor Mods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Armor Mods</em>'.
   * @see org.larz.dom3.dm.dm.ArmorMods
   * @generated
   */
  EClass getArmorMods();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.ArmorPattern1 <em>Armor Pattern1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Armor Pattern1</em>'.
   * @see org.larz.dom3.dm.dm.ArmorPattern1
   * @generated
   */
  EClass getArmorPattern1();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.ArmorPattern2 <em>Armor Pattern2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Armor Pattern2</em>'.
   * @see org.larz.dom3.dm.dm.ArmorPattern2
   * @generated
   */
  EClass getArmorPattern2();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.ArmorInst1 <em>Armor Inst1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Armor Inst1</em>'.
   * @see org.larz.dom3.dm.dm.ArmorInst1
   * @generated
   */
  EClass getArmorInst1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.ArmorInst1#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.ArmorInst1#getValue()
   * @see #getArmorInst1()
   * @generated
   */
  EAttribute getArmorInst1_Value();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.ArmorInst1#isName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.larz.dom3.dm.dm.ArmorInst1#isName()
   * @see #getArmorInst1()
   * @generated
   */
  EAttribute getArmorInst1_Name();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.ArmorInst2 <em>Armor Inst2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Armor Inst2</em>'.
   * @see org.larz.dom3.dm.dm.ArmorInst2
   * @generated
   */
  EClass getArmorInst2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.ArmorInst2#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.ArmorInst2#getValue()
   * @see #getArmorInst2()
   * @generated
   */
  EAttribute getArmorInst2_Value();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.ArmorInst2#isType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.larz.dom3.dm.dm.ArmorInst2#isType()
   * @see #getArmorInst2()
   * @generated
   */
  EAttribute getArmorInst2_Type();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.ArmorInst2#isProt <em>Prot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prot</em>'.
   * @see org.larz.dom3.dm.dm.ArmorInst2#isProt()
   * @see #getArmorInst2()
   * @generated
   */
  EAttribute getArmorInst2_Prot();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.ArmorInst2#isDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Def</em>'.
   * @see org.larz.dom3.dm.dm.ArmorInst2#isDef()
   * @see #getArmorInst2()
   * @generated
   */
  EAttribute getArmorInst2_Def();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.ArmorInst2#isEnc <em>Enc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enc</em>'.
   * @see org.larz.dom3.dm.dm.ArmorInst2#isEnc()
   * @see #getArmorInst2()
   * @generated
   */
  EAttribute getArmorInst2_Enc();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.ArmorInst2#isRcost <em>Rcost</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rcost</em>'.
   * @see org.larz.dom3.dm.dm.ArmorInst2#isRcost()
   * @see #getArmorInst2()
   * @generated
   */
  EAttribute getArmorInst2_Rcost();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.Weapon <em>Weapon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weapon</em>'.
   * @see org.larz.dom3.dm.dm.Weapon
   * @generated
   */
  EClass getWeapon();

  /**
   * Returns the meta object for the containment reference list '{@link org.larz.dom3.dm.dm.Weapon#getMods <em>Mods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mods</em>'.
   * @see org.larz.dom3.dm.dm.Weapon#getMods()
   * @see #getWeapon()
   * @generated
   */
  EReference getWeapon_Mods();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SelectWeaponById <em>Select Weapon By Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Weapon By Id</em>'.
   * @see org.larz.dom3.dm.dm.SelectWeaponById
   * @generated
   */
  EClass getSelectWeaponById();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SelectWeaponById#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.SelectWeaponById#getValue()
   * @see #getSelectWeaponById()
   * @generated
   */
  EAttribute getSelectWeaponById_Value();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SelectWeaponByName <em>Select Weapon By Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Weapon By Name</em>'.
   * @see org.larz.dom3.dm.dm.SelectWeaponByName
   * @generated
   */
  EClass getSelectWeaponByName();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SelectWeaponByName#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.SelectWeaponByName#getValue()
   * @see #getSelectWeaponByName()
   * @generated
   */
  EAttribute getSelectWeaponByName_Value();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.NewWeapon <em>New Weapon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Weapon</em>'.
   * @see org.larz.dom3.dm.dm.NewWeapon
   * @generated
   */
  EClass getNewWeapon();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NewWeapon#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.NewWeapon#getValue()
   * @see #getNewWeapon()
   * @generated
   */
  EAttribute getNewWeapon_Value();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.WeaponMods <em>Weapon Mods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weapon Mods</em>'.
   * @see org.larz.dom3.dm.dm.WeaponMods
   * @generated
   */
  EClass getWeaponMods();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.WeaponPattern1 <em>Weapon Pattern1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weapon Pattern1</em>'.
   * @see org.larz.dom3.dm.dm.WeaponPattern1
   * @generated
   */
  EClass getWeaponPattern1();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.WeaponPattern2 <em>Weapon Pattern2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weapon Pattern2</em>'.
   * @see org.larz.dom3.dm.dm.WeaponPattern2
   * @generated
   */
  EClass getWeaponPattern2();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.WeaponPattern3 <em>Weapon Pattern3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weapon Pattern3</em>'.
   * @see org.larz.dom3.dm.dm.WeaponPattern3
   * @generated
   */
  EClass getWeaponPattern3();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.WeaponPattern4 <em>Weapon Pattern4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weapon Pattern4</em>'.
   * @see org.larz.dom3.dm.dm.WeaponPattern4
   * @generated
   */
  EClass getWeaponPattern4();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.WeaponInst1 <em>Weapon Inst1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weapon Inst1</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst1
   * @generated
   */
  EClass getWeaponInst1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst1#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst1#getValue()
   * @see #getWeaponInst1()
   * @generated
   */
  EAttribute getWeaponInst1_Value();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst1#isName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst1#isName()
   * @see #getWeaponInst1()
   * @generated
   */
  EAttribute getWeaponInst1_Name();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.WeaponInst2 <em>Weapon Inst2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weapon Inst2</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst2
   * @generated
   */
  EClass getWeaponInst2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst2#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst2#getValue()
   * @see #getWeaponInst2()
   * @generated
   */
  EAttribute getWeaponInst2_Value();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst2#isDmg <em>Dmg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dmg</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst2#isDmg()
   * @see #getWeaponInst2()
   * @generated
   */
  EAttribute getWeaponInst2_Dmg();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst2#isNratt <em>Nratt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nratt</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst2#isNratt()
   * @see #getWeaponInst2()
   * @generated
   */
  EAttribute getWeaponInst2_Nratt();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst2#isAtt <em>Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Att</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst2#isAtt()
   * @see #getWeaponInst2()
   * @generated
   */
  EAttribute getWeaponInst2_Att();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst2#isDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Def</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst2#isDef()
   * @see #getWeaponInst2()
   * @generated
   */
  EAttribute getWeaponInst2_Def();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst2#isLen <em>Len</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Len</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst2#isLen()
   * @see #getWeaponInst2()
   * @generated
   */
  EAttribute getWeaponInst2_Len();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst2#isRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Range</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst2#isRange()
   * @see #getWeaponInst2()
   * @generated
   */
  EAttribute getWeaponInst2_Range();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst2#isAmmo <em>Ammo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ammo</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst2#isAmmo()
   * @see #getWeaponInst2()
   * @generated
   */
  EAttribute getWeaponInst2_Ammo();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst2#isRcost <em>Rcost</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rcost</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst2#isRcost()
   * @see #getWeaponInst2()
   * @generated
   */
  EAttribute getWeaponInst2_Rcost();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst2#isSound <em>Sound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sound</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst2#isSound()
   * @see #getWeaponInst2()
   * @generated
   */
  EAttribute getWeaponInst2_Sound();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst2#isAoe <em>Aoe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Aoe</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst2#isAoe()
   * @see #getWeaponInst2()
   * @generated
   */
  EAttribute getWeaponInst2_Aoe();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst2#isSecondaryeffect <em>Secondaryeffect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Secondaryeffect</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst2#isSecondaryeffect()
   * @see #getWeaponInst2()
   * @generated
   */
  EAttribute getWeaponInst2_Secondaryeffect();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst2#isSecondaryeffectalways <em>Secondaryeffectalways</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Secondaryeffectalways</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst2#isSecondaryeffectalways()
   * @see #getWeaponInst2()
   * @generated
   */
  EAttribute getWeaponInst2_Secondaryeffectalways();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst2#isExplspr <em>Explspr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Explspr</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst2#isExplspr()
   * @see #getWeaponInst2()
   * @generated
   */
  EAttribute getWeaponInst2_Explspr();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.WeaponInst3 <em>Weapon Inst3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weapon Inst3</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst3
   * @generated
   */
  EClass getWeaponInst3();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst3#getValue1 <em>Value1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value1</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst3#getValue1()
   * @see #getWeaponInst3()
   * @generated
   */
  EAttribute getWeaponInst3_Value1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst3#getValue2 <em>Value2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value2</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst3#getValue2()
   * @see #getWeaponInst3()
   * @generated
   */
  EAttribute getWeaponInst3_Value2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst3#isFlyspr <em>Flyspr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Flyspr</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst3#isFlyspr()
   * @see #getWeaponInst3()
   * @generated
   */
  EAttribute getWeaponInst3_Flyspr();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.WeaponInst4 <em>Weapon Inst4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weapon Inst4</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4
   * @generated
   */
  EClass getWeaponInst4();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst4#isTwohanded <em>Twohanded</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Twohanded</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4#isTwohanded()
   * @see #getWeaponInst4()
   * @generated
   */
  EAttribute getWeaponInst4_Twohanded();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst4#isArmorpiercing <em>Armorpiercing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Armorpiercing</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4#isArmorpiercing()
   * @see #getWeaponInst4()
   * @generated
   */
  EAttribute getWeaponInst4_Armorpiercing();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst4#isArmornegating <em>Armornegating</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Armornegating</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4#isArmornegating()
   * @see #getWeaponInst4()
   * @generated
   */
  EAttribute getWeaponInst4_Armornegating();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst4#isMagic <em>Magic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Magic</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4#isMagic()
   * @see #getWeaponInst4()
   * @generated
   */
  EAttribute getWeaponInst4_Magic();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst4#isDt_normal <em>Dt normal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dt normal</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4#isDt_normal()
   * @see #getWeaponInst4()
   * @generated
   */
  EAttribute getWeaponInst4_Dt_normal();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst4#isDt_stun <em>Dt stun</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dt stun</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4#isDt_stun()
   * @see #getWeaponInst4()
   * @generated
   */
  EAttribute getWeaponInst4_Dt_stun();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst4#isDt_paralyze <em>Dt paralyze</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dt paralyze</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4#isDt_paralyze()
   * @see #getWeaponInst4()
   * @generated
   */
  EAttribute getWeaponInst4_Dt_paralyze();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst4#isDt_poison <em>Dt poison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dt poison</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4#isDt_poison()
   * @see #getWeaponInst4()
   * @generated
   */
  EAttribute getWeaponInst4_Dt_poison();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst4#isDt_cap <em>Dt cap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dt cap</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4#isDt_cap()
   * @see #getWeaponInst4()
   * @generated
   */
  EAttribute getWeaponInst4_Dt_cap();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst4#isDt_demon <em>Dt demon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dt demon</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4#isDt_demon()
   * @see #getWeaponInst4()
   * @generated
   */
  EAttribute getWeaponInst4_Dt_demon();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst4#isDt_demononly <em>Dt demononly</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dt demononly</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4#isDt_demononly()
   * @see #getWeaponInst4()
   * @generated
   */
  EAttribute getWeaponInst4_Dt_demononly();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst4#isDt_holy <em>Dt holy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dt holy</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4#isDt_holy()
   * @see #getWeaponInst4()
   * @generated
   */
  EAttribute getWeaponInst4_Dt_holy();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst4#isDt_magic <em>Dt magic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dt magic</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4#isDt_magic()
   * @see #getWeaponInst4()
   * @generated
   */
  EAttribute getWeaponInst4_Dt_magic();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst4#isDt_small <em>Dt small</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dt small</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4#isDt_small()
   * @see #getWeaponInst4()
   * @generated
   */
  EAttribute getWeaponInst4_Dt_small();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst4#isDt_large <em>Dt large</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dt large</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4#isDt_large()
   * @see #getWeaponInst4()
   * @generated
   */
  EAttribute getWeaponInst4_Dt_large();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst4#isDt_constructonly <em>Dt constructonly</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dt constructonly</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4#isDt_constructonly()
   * @see #getWeaponInst4()
   * @generated
   */
  EAttribute getWeaponInst4_Dt_constructonly();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst4#isDt_raise <em>Dt raise</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dt raise</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4#isDt_raise()
   * @see #getWeaponInst4()
   * @generated
   */
  EAttribute getWeaponInst4_Dt_raise();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst4#isMind <em>Mind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mind</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4#isMind()
   * @see #getWeaponInst4()
   * @generated
   */
  EAttribute getWeaponInst4_Mind();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst4#isCold <em>Cold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cold</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4#isCold()
   * @see #getWeaponInst4()
   * @generated
   */
  EAttribute getWeaponInst4_Cold();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst4#isFire <em>Fire</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fire</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4#isFire()
   * @see #getWeaponInst4()
   * @generated
   */
  EAttribute getWeaponInst4_Fire();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst4#isShock <em>Shock</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Shock</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4#isShock()
   * @see #getWeaponInst4()
   * @generated
   */
  EAttribute getWeaponInst4_Shock();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst4#isPoison <em>Poison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Poison</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4#isPoison()
   * @see #getWeaponInst4()
   * @generated
   */
  EAttribute getWeaponInst4_Poison();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst4#isBonus <em>Bonus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bonus</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4#isBonus()
   * @see #getWeaponInst4()
   * @generated
   */
  EAttribute getWeaponInst4_Bonus();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst4#isCharge <em>Charge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Charge</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4#isCharge()
   * @see #getWeaponInst4()
   * @generated
   */
  EAttribute getWeaponInst4_Charge();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst4#isFlail <em>Flail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Flail</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4#isFlail()
   * @see #getWeaponInst4()
   * @generated
   */
  EAttribute getWeaponInst4_Flail();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst4#isNostr <em>Nostr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nostr</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4#isNostr()
   * @see #getWeaponInst4()
   * @generated
   */
  EAttribute getWeaponInst4_Nostr();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst4#isMrnegates <em>Mrnegates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mrnegates</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4#isMrnegates()
   * @see #getWeaponInst4()
   * @generated
   */
  EAttribute getWeaponInst4_Mrnegates();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.WeaponInst4#isMrnegateseasily <em>Mrnegateseasily</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mrnegateseasily</em>'.
   * @see org.larz.dom3.dm.dm.WeaponInst4#isMrnegateseasily()
   * @see #getWeaponInst4()
   * @generated
   */
  EAttribute getWeaponInst4_Mrnegateseasily();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.Monster <em>Monster</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Monster</em>'.
   * @see org.larz.dom3.dm.dm.Monster
   * @generated
   */
  EClass getMonster();

  /**
   * Returns the meta object for the containment reference list '{@link org.larz.dom3.dm.dm.Monster#getMods <em>Mods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mods</em>'.
   * @see org.larz.dom3.dm.dm.Monster#getMods()
   * @see #getMonster()
   * @generated
   */
  EReference getMonster_Mods();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SelectMonsterById <em>Select Monster By Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Monster By Id</em>'.
   * @see org.larz.dom3.dm.dm.SelectMonsterById
   * @generated
   */
  EClass getSelectMonsterById();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SelectMonsterById#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.SelectMonsterById#getValue()
   * @see #getSelectMonsterById()
   * @generated
   */
  EAttribute getSelectMonsterById_Value();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SelectMonsterByName <em>Select Monster By Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Monster By Name</em>'.
   * @see org.larz.dom3.dm.dm.SelectMonsterByName
   * @generated
   */
  EClass getSelectMonsterByName();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SelectMonsterByName#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.SelectMonsterByName#getValue()
   * @see #getSelectMonsterByName()
   * @generated
   */
  EAttribute getSelectMonsterByName_Value();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.NewMonster <em>New Monster</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Monster</em>'.
   * @see org.larz.dom3.dm.dm.NewMonster
   * @generated
   */
  EClass getNewMonster();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NewMonster#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.NewMonster#getValue()
   * @see #getNewMonster()
   * @generated
   */
  EAttribute getNewMonster_Value();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.MonsterMods <em>Monster Mods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Monster Mods</em>'.
   * @see org.larz.dom3.dm.dm.MonsterMods
   * @generated
   */
  EClass getMonsterMods();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.MonsterPattern1 <em>Monster Pattern1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Monster Pattern1</em>'.
   * @see org.larz.dom3.dm.dm.MonsterPattern1
   * @generated
   */
  EClass getMonsterPattern1();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.MonsterPattern2 <em>Monster Pattern2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Monster Pattern2</em>'.
   * @see org.larz.dom3.dm.dm.MonsterPattern2
   * @generated
   */
  EClass getMonsterPattern2();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.MonsterPattern3 <em>Monster Pattern3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Monster Pattern3</em>'.
   * @see org.larz.dom3.dm.dm.MonsterPattern3
   * @generated
   */
  EClass getMonsterPattern3();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.MonsterPattern4 <em>Monster Pattern4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Monster Pattern4</em>'.
   * @see org.larz.dom3.dm.dm.MonsterPattern4
   * @generated
   */
  EClass getMonsterPattern4();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.MonsterPattern5 <em>Monster Pattern5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Monster Pattern5</em>'.
   * @see org.larz.dom3.dm.dm.MonsterPattern5
   * @generated
   */
  EClass getMonsterPattern5();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.MonsterPattern6 <em>Monster Pattern6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Monster Pattern6</em>'.
   * @see org.larz.dom3.dm.dm.MonsterPattern6
   * @generated
   */
  EClass getMonsterPattern6();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.MonsterInst1 <em>Monster Inst1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Monster Inst1</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst1
   * @generated
   */
  EClass getMonsterInst1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst1#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst1#getValue()
   * @see #getMonsterInst1()
   * @generated
   */
  EAttribute getMonsterInst1_Value();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst1#isName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst1#isName()
   * @see #getMonsterInst1()
   * @generated
   */
  EAttribute getMonsterInst1_Name();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst1#isSpr1 <em>Spr1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Spr1</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst1#isSpr1()
   * @see #getMonsterInst1()
   * @generated
   */
  EAttribute getMonsterInst1_Spr1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst1#isSpr2 <em>Spr2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Spr2</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst1#isSpr2()
   * @see #getMonsterInst1()
   * @generated
   */
  EAttribute getMonsterInst1_Spr2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst1#isDescr <em>Descr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Descr</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst1#isDescr()
   * @see #getMonsterInst1()
   * @generated
   */
  EAttribute getMonsterInst1_Descr();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.MonsterInst2 <em>Monster Inst2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Monster Inst2</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2
   * @generated
   */
  EClass getMonsterInst2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#getValue()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Value();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isSpeciallook <em>Speciallook</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Speciallook</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isSpeciallook()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Speciallook();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isAp <em>Ap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ap</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isAp()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Ap();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isMapmove <em>Mapmove</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mapmove</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isMapmove()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Mapmove();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isHp <em>Hp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hp</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isHp()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Hp();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isProt <em>Prot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prot</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isProt()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Prot();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isSize()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Size();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isRessize <em>Ressize</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ressize</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isRessize()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Ressize();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isStr <em>Str</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Str</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isStr()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Str();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isEnc <em>Enc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enc</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isEnc()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Enc();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isAtt <em>Att</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Att</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isAtt()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Att();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Def</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isDef()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Def();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isPrec <em>Prec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prec</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isPrec()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Prec();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isMr <em>Mr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mr</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isMr()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Mr();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isMor <em>Mor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mor</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isMor()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Mor();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isGcost <em>Gcost</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gcost</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isGcost()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Gcost();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isRcost <em>Rcost</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rcost</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isRcost()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Rcost();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isPathcost <em>Pathcost</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pathcost</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isPathcost()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Pathcost();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isStartdom <em>Startdom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Startdom</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isStartdom()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Startdom();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isEyes <em>Eyes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Eyes</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isEyes()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Eyes();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isCopystats <em>Copystats</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Copystats</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isCopystats()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Copystats();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isCopyspr <em>Copyspr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Copyspr</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isCopyspr()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Copyspr();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isRestrictedgod <em>Restrictedgod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Restrictedgod</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isRestrictedgod()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Restrictedgod();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isShatteredsoul <em>Shatteredsoul</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Shatteredsoul</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isShatteredsoul()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Shatteredsoul();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isColdres <em>Coldres</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Coldres</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isColdres()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Coldres();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isFireres <em>Fireres</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fireres</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isFireres()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Fireres();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isPoisonres <em>Poisonres</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Poisonres</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isPoisonres()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Poisonres();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isShockres <em>Shockres</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Shockres</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isShockres()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Shockres();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isDarkvision <em>Darkvision</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Darkvision</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isDarkvision()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Darkvision();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isSeduce <em>Seduce</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Seduce</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isSeduce()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Seduce();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isSuccubus <em>Succubus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Succubus</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isSuccubus()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Succubus();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isBeckon <em>Beckon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Beckon</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isBeckon()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Beckon();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isStartage <em>Startage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Startage</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isStartage()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Startage();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isMaxage <em>Maxage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Maxage</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isMaxage()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Maxage();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isOlder <em>Older</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Older</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isOlder()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Older();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isHealer <em>Healer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Healer</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isHealer()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Healer();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isStartaff <em>Startaff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Startaff</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isStartaff()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Startaff();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isSupplybonus <em>Supplybonus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Supplybonus</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isSupplybonus()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Supplybonus();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isUwdamage <em>Uwdamage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uwdamage</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isUwdamage()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Uwdamage();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isHomesick <em>Homesick</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Homesick</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isHomesick()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Homesick();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isColdpower <em>Coldpower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Coldpower</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isColdpower()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Coldpower();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isFirepower <em>Firepower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Firepower</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isFirepower()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Firepower();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isStormpower <em>Stormpower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stormpower</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isStormpower()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Stormpower();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isDarkpower <em>Darkpower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Darkpower</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isDarkpower()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Darkpower();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isSpringpower <em>Springpower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Springpower</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isSpringpower()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Springpower();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isSummerpower <em>Summerpower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Summerpower</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isSummerpower()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Summerpower();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isFallpower <em>Fallpower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fallpower</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isFallpower()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Fallpower();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isWinterpower <em>Winterpower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Winterpower</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isWinterpower()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Winterpower();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isAmbidextrous <em>Ambidextrous</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ambidextrous</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isAmbidextrous()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Ambidextrous();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isBanefireshield <em>Banefireshield</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Banefireshield</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isBanefireshield()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Banefireshield();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isBerserk <em>Berserk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Berserk</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isBerserk()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Berserk();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isStandard <em>Standard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Standard</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isStandard()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Standard();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isAnimalawe <em>Animalawe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Animalawe</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isAnimalawe()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Animalawe();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isAwe <em>Awe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Awe</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isAwe()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Awe();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isFear <em>Fear</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fear</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isFear()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Fear();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isRegeneration <em>Regeneration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Regeneration</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isRegeneration()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Regeneration();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isReinvigoration <em>Reinvigoration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reinvigoration</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isReinvigoration()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Reinvigoration();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isFireshield <em>Fireshield</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fireshield</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isFireshield()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Fireshield();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isIceprot <em>Iceprot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Iceprot</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isIceprot()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Iceprot();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isPoisoncloud <em>Poisoncloud</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Poisoncloud</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isPoisoncloud()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Poisoncloud();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isDiseasecloud <em>Diseasecloud</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Diseasecloud</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isDiseasecloud()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Diseasecloud();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isBloodvengeance <em>Bloodvengeance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bloodvengeance</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isBloodvengeance()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Bloodvengeance();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isCastledef <em>Castledef</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Castledef</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isCastledef()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Castledef();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isSiegebonus <em>Siegebonus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Siegebonus</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isSiegebonus()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Siegebonus();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isPatrolbonus <em>Patrolbonus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Patrolbonus</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isPatrolbonus()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Patrolbonus();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isPillagebonus <em>Pillagebonus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pillagebonus</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isPillagebonus()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Pillagebonus();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isResearchbonus <em>Researchbonus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Researchbonus</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isResearchbonus()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Researchbonus();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isForgebonus <em>Forgebonus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Forgebonus</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isForgebonus()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Forgebonus();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isDouse <em>Douse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Douse</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isDouse()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Douse();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isNobadevents <em>Nobadevents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nobadevents</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isNobadevents()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Nobadevents();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isIncunrest <em>Incunrest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Incunrest</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isIncunrest()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Incunrest();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isSpreaddom <em>Spreaddom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Spreaddom</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isSpreaddom()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Spreaddom();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isLeper <em>Leper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Leper</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isLeper()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Leper();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isPopkill <em>Popkill</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Popkill</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isPopkill()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Popkill();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isHeretic <em>Heretic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Heretic</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isHeretic()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Heretic();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isItemslots <em>Itemslots</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Itemslots</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isItemslots()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Itemslots();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst2#isNametype <em>Nametype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nametype</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst2#isNametype()
   * @see #getMonsterInst2()
   * @generated
   */
  EAttribute getMonsterInst2_Nametype();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.MonsterInst3 <em>Monster Inst3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Monster Inst3</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst3
   * @generated
   */
  EClass getMonsterInst3();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst3#getValue1 <em>Value1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value1</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst3#getValue1()
   * @see #getMonsterInst3()
   * @generated
   */
  EAttribute getMonsterInst3_Value1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst3#getValue2 <em>Value2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value2</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst3#getValue2()
   * @see #getMonsterInst3()
   * @generated
   */
  EAttribute getMonsterInst3_Value2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst3#isMagicskill <em>Magicskill</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Magicskill</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst3#isMagicskill()
   * @see #getMonsterInst3()
   * @generated
   */
  EAttribute getMonsterInst3_Magicskill();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst3#isCustommagic <em>Custommagic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Custommagic</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst3#isCustommagic()
   * @see #getMonsterInst3()
   * @generated
   */
  EAttribute getMonsterInst3_Custommagic();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst3#isMagicboost <em>Magicboost</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Magicboost</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst3#isMagicboost()
   * @see #getMonsterInst3()
   * @generated
   */
  EAttribute getMonsterInst3_Magicboost();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst3#isGemprod <em>Gemprod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gemprod</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst3#isGemprod()
   * @see #getMonsterInst3()
   * @generated
   */
  EAttribute getMonsterInst3_Gemprod();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.MonsterInst4 <em>Monster Inst4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Monster Inst4</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4
   * @generated
   */
  EClass getMonsterInst4();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isClear <em>Clear</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Clear</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isClear()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Clear();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isClearweapons <em>Clearweapons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Clearweapons</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isClearweapons()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Clearweapons();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isCleararmor <em>Cleararmor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cleararmor</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isCleararmor()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Cleararmor();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isClearmagic <em>Clearmagic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Clearmagic</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isClearmagic()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Clearmagic();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isClearspec <em>Clearspec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Clearspec</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isClearspec()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Clearspec();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isFemale <em>Female</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Female</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isFemale()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Female();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isMounted <em>Mounted</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mounted</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isMounted()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Mounted();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isHoly <em>Holy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Holy</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isHoly()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Holy();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isAnimal <em>Animal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Animal</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isAnimal()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Animal();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isUndead <em>Undead</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Undead</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isUndead()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Undead();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isDemon <em>Demon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Demon</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isDemon()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Demon();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isMagicbeing <em>Magicbeing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Magicbeing</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isMagicbeing()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Magicbeing();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isStonebeing <em>Stonebeing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stonebeing</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isStonebeing()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Stonebeing();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isInanimate <em>Inanimate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inanimate</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isInanimate()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Inanimate();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isColdblood <em>Coldblood</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Coldblood</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isColdblood()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Coldblood();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isImmortal <em>Immortal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Immortal</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isImmortal()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Immortal();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isBlind <em>Blind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Blind</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isBlind()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Blind();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isUnique <em>Unique</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isUnique()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Unique();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isImmobile <em>Immobile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Immobile</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isImmobile()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Immobile();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isAquatic <em>Aquatic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Aquatic</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isAquatic()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Aquatic();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isAmphibian <em>Amphibian</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Amphibian</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isAmphibian()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Amphibian();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isPooramphibian <em>Pooramphibian</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pooramphibian</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isPooramphibian()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Pooramphibian();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isFlying <em>Flying</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Flying</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isFlying()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Flying();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isStormimmune <em>Stormimmune</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stormimmune</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isStormimmune()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Stormimmune();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isSailing <em>Sailing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sailing</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isSailing()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Sailing();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isForestsurvival <em>Forestsurvival</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Forestsurvival</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isForestsurvival()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Forestsurvival();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isMountainsurvival <em>Mountainsurvival</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mountainsurvival</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isMountainsurvival()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Mountainsurvival();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isSwampsurvival <em>Swampsurvival</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Swampsurvival</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isSwampsurvival()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Swampsurvival();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isWastesurvival <em>Wastesurvival</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wastesurvival</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isWastesurvival()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Wastesurvival();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isIllusion <em>Illusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Illusion</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isIllusion()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Illusion();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isSpy <em>Spy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Spy</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isSpy()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Spy();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isAssassin <em>Assassin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Assassin</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isAssassin()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Assassin();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isHeal <em>Heal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Heal</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isHeal()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Heal();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isNoheal <em>Noheal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Noheal</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isNoheal()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Noheal();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isNeednoteat <em>Neednoteat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Neednoteat</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isNeednoteat()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Neednoteat();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isEthereal <em>Ethereal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ethereal</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isEthereal()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Ethereal();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isTrample <em>Trample</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Trample</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isTrample()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Trample();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isEntangle <em>Entangle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Entangle</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isEntangle()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Entangle();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isEyeloss <em>Eyeloss</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Eyeloss</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isEyeloss()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Eyeloss();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isHorrormark <em>Horrormark</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Horrormark</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isHorrormark()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Horrormark();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isPoisonarmor <em>Poisonarmor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Poisonarmor</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isPoisonarmor()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Poisonarmor();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isInquisitor <em>Inquisitor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inquisitor</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isInquisitor()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Inquisitor();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isNoitem <em>Noitem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Noitem</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isNoitem()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Noitem();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isDrainimmune <em>Drainimmune</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Drainimmune</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isDrainimmune()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Drainimmune();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isNoleader <em>Noleader</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Noleader</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isNoleader()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Noleader();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isPoorleader <em>Poorleader</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Poorleader</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isPoorleader()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Poorleader();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isOkleader <em>Okleader</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Okleader</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isOkleader()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Okleader();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isGoodleader <em>Goodleader</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Goodleader</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isGoodleader()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Goodleader();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isExpertleader <em>Expertleader</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expertleader</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isExpertleader()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Expertleader();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isSuperiorleader <em>Superiorleader</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Superiorleader</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isSuperiorleader()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Superiorleader();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isNomagicleader <em>Nomagicleader</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nomagicleader</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isNomagicleader()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Nomagicleader();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isPoormagicleader <em>Poormagicleader</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Poormagicleader</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isPoormagicleader()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Poormagicleader();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isOkmagicleader <em>Okmagicleader</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Okmagicleader</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isOkmagicleader()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Okmagicleader();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isGoodmagicleader <em>Goodmagicleader</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Goodmagicleader</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isGoodmagicleader()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Goodmagicleader();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isExpertmagicleader <em>Expertmagicleader</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expertmagicleader</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isExpertmagicleader()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Expertmagicleader();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isSuperiormagicleader <em>Superiormagicleader</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Superiormagicleader</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isSuperiormagicleader()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Superiormagicleader();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isNoundeadleader <em>Noundeadleader</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Noundeadleader</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isNoundeadleader()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Noundeadleader();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isPoorundeadleader <em>Poorundeadleader</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Poorundeadleader</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isPoorundeadleader()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Poorundeadleader();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isOkundeadleader <em>Okundeadleader</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Okundeadleader</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isOkundeadleader()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Okundeadleader();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isGoodundeadleader <em>Goodundeadleader</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Goodundeadleader</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isGoodundeadleader()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Goodundeadleader();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isExpertundeadleader <em>Expertundeadleader</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expertundeadleader</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isExpertundeadleader()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Expertundeadleader();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst4#isSuperiorundeadleader <em>Superiorundeadleader</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Superiorundeadleader</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst4#isSuperiorundeadleader()
   * @see #getMonsterInst4()
   * @generated
   */
  EAttribute getMonsterInst4_Superiorundeadleader();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.MonsterInst5 <em>Monster Inst5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Monster Inst5</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst5
   * @generated
   */
  EClass getMonsterInst5();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst5#getValue1 <em>Value1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value1</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst5#getValue1()
   * @see #getMonsterInst5()
   * @generated
   */
  EAttribute getMonsterInst5_Value1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst5#getValue2 <em>Value2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value2</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst5#getValue2()
   * @see #getMonsterInst5()
   * @generated
   */
  EAttribute getMonsterInst5_Value2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst5#isWeapon <em>Weapon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weapon</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst5#isWeapon()
   * @see #getMonsterInst5()
   * @generated
   */
  EAttribute getMonsterInst5_Weapon();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst5#isArmor <em>Armor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Armor</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst5#isArmor()
   * @see #getMonsterInst5()
   * @generated
   */
  EAttribute getMonsterInst5_Armor();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst5#isOnebattlespell <em>Onebattlespell</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Onebattlespell</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst5#isOnebattlespell()
   * @see #getMonsterInst5()
   * @generated
   */
  EAttribute getMonsterInst5_Onebattlespell();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst5#isFirstshape <em>Firstshape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Firstshape</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst5#isFirstshape()
   * @see #getMonsterInst5()
   * @generated
   */
  EAttribute getMonsterInst5_Firstshape();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst5#isSecondshape <em>Secondshape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Secondshape</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst5#isSecondshape()
   * @see #getMonsterInst5()
   * @generated
   */
  EAttribute getMonsterInst5_Secondshape();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst5#isSecondtmpshape <em>Secondtmpshape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Secondtmpshape</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst5#isSecondtmpshape()
   * @see #getMonsterInst5()
   * @generated
   */
  EAttribute getMonsterInst5_Secondtmpshape();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst5#isShapechange <em>Shapechange</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Shapechange</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst5#isShapechange()
   * @see #getMonsterInst5()
   * @generated
   */
  EAttribute getMonsterInst5_Shapechange();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst5#isLandshape <em>Landshape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Landshape</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst5#isLandshape()
   * @see #getMonsterInst5()
   * @generated
   */
  EAttribute getMonsterInst5_Landshape();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst5#isWatershape <em>Watershape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Watershape</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst5#isWatershape()
   * @see #getMonsterInst5()
   * @generated
   */
  EAttribute getMonsterInst5_Watershape();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst5#isForestshape <em>Forestshape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Forestshape</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst5#isForestshape()
   * @see #getMonsterInst5()
   * @generated
   */
  EAttribute getMonsterInst5_Forestshape();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst5#isPlainshape <em>Plainshape</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Plainshape</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst5#isPlainshape()
   * @see #getMonsterInst5()
   * @generated
   */
  EAttribute getMonsterInst5_Plainshape();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst5#isDomsummon <em>Domsummon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Domsummon</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst5#isDomsummon()
   * @see #getMonsterInst5()
   * @generated
   */
  EAttribute getMonsterInst5_Domsummon();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst5#isDomsummon2 <em>Domsummon2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Domsummon2</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst5#isDomsummon2()
   * @see #getMonsterInst5()
   * @generated
   */
  EAttribute getMonsterInst5_Domsummon2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst5#isDomsummon20 <em>Domsummon20</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Domsummon20</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst5#isDomsummon20()
   * @see #getMonsterInst5()
   * @generated
   */
  EAttribute getMonsterInst5_Domsummon20();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst5#isMakemonster1 <em>Makemonster1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Makemonster1</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst5#isMakemonster1()
   * @see #getMonsterInst5()
   * @generated
   */
  EAttribute getMonsterInst5_Makemonster1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst5#isMakemonster2 <em>Makemonster2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Makemonster2</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst5#isMakemonster2()
   * @see #getMonsterInst5()
   * @generated
   */
  EAttribute getMonsterInst5_Makemonster2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst5#isMakemonster3 <em>Makemonster3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Makemonster3</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst5#isMakemonster3()
   * @see #getMonsterInst5()
   * @generated
   */
  EAttribute getMonsterInst5_Makemonster3();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst5#isMakemonster4 <em>Makemonster4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Makemonster4</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst5#isMakemonster4()
   * @see #getMonsterInst5()
   * @generated
   */
  EAttribute getMonsterInst5_Makemonster4();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst5#isMakemonster5 <em>Makemonster5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Makemonster5</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst5#isMakemonster5()
   * @see #getMonsterInst5()
   * @generated
   */
  EAttribute getMonsterInst5_Makemonster5();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst5#isSummon1 <em>Summon1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Summon1</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst5#isSummon1()
   * @see #getMonsterInst5()
   * @generated
   */
  EAttribute getMonsterInst5_Summon1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst5#isSummon5 <em>Summon5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Summon5</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst5#isSummon5()
   * @see #getMonsterInst5()
   * @generated
   */
  EAttribute getMonsterInst5_Summon5();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.MonsterInst6 <em>Monster Inst6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Monster Inst6</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst6
   * @generated
   */
  EClass getMonsterInst6();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst6#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst6#getValue()
   * @see #getMonsterInst6()
   * @generated
   */
  EAttribute getMonsterInst6_Value();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst6#isStealthy <em>Stealthy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Stealthy</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst6#isStealthy()
   * @see #getMonsterInst6()
   * @generated
   */
  EAttribute getMonsterInst6_Stealthy();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst6#isHeat <em>Heat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Heat</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst6#isHeat()
   * @see #getMonsterInst6()
   * @generated
   */
  EAttribute getMonsterInst6_Heat();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.MonsterInst6#isCold <em>Cold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cold</em>'.
   * @see org.larz.dom3.dm.dm.MonsterInst6#isCold()
   * @see #getMonsterInst6()
   * @generated
   */
  EAttribute getMonsterInst6_Cold();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.Spell <em>Spell</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spell</em>'.
   * @see org.larz.dom3.dm.dm.Spell
   * @generated
   */
  EClass getSpell();

  /**
   * Returns the meta object for the containment reference list '{@link org.larz.dom3.dm.dm.Spell#getMods <em>Mods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mods</em>'.
   * @see org.larz.dom3.dm.dm.Spell#getMods()
   * @see #getSpell()
   * @generated
   */
  EReference getSpell_Mods();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SelectSpellById <em>Select Spell By Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Spell By Id</em>'.
   * @see org.larz.dom3.dm.dm.SelectSpellById
   * @generated
   */
  EClass getSelectSpellById();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SelectSpellById#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.SelectSpellById#getValue()
   * @see #getSelectSpellById()
   * @generated
   */
  EAttribute getSelectSpellById_Value();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SelectSpellByName <em>Select Spell By Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Spell By Name</em>'.
   * @see org.larz.dom3.dm.dm.SelectSpellByName
   * @generated
   */
  EClass getSelectSpellByName();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SelectSpellByName#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.SelectSpellByName#getValue()
   * @see #getSelectSpellByName()
   * @generated
   */
  EAttribute getSelectSpellByName_Value();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.NewSpell <em>New Spell</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Spell</em>'.
   * @see org.larz.dom3.dm.dm.NewSpell
   * @generated
   */
  EClass getNewSpell();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SpellMods <em>Spell Mods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spell Mods</em>'.
   * @see org.larz.dom3.dm.dm.SpellMods
   * @generated
   */
  EClass getSpellMods();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SpellPattern1 <em>Spell Pattern1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spell Pattern1</em>'.
   * @see org.larz.dom3.dm.dm.SpellPattern1
   * @generated
   */
  EClass getSpellPattern1();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SpellPattern2 <em>Spell Pattern2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spell Pattern2</em>'.
   * @see org.larz.dom3.dm.dm.SpellPattern2
   * @generated
   */
  EClass getSpellPattern2();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SpellPattern3 <em>Spell Pattern3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spell Pattern3</em>'.
   * @see org.larz.dom3.dm.dm.SpellPattern3
   * @generated
   */
  EClass getSpellPattern3();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SpellPattern4 <em>Spell Pattern4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spell Pattern4</em>'.
   * @see org.larz.dom3.dm.dm.SpellPattern4
   * @generated
   */
  EClass getSpellPattern4();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SpellPattern5 <em>Spell Pattern5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spell Pattern5</em>'.
   * @see org.larz.dom3.dm.dm.SpellPattern5
   * @generated
   */
  EClass getSpellPattern5();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SpellInst1 <em>Spell Inst1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spell Inst1</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst1
   * @generated
   */
  EClass getSpellInst1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SpellInst1#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst1#getValue()
   * @see #getSpellInst1()
   * @generated
   */
  EAttribute getSpellInst1_Value();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SpellInst1#isName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst1#isName()
   * @see #getSpellInst1()
   * @generated
   */
  EAttribute getSpellInst1_Name();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SpellInst1#isDescr <em>Descr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Descr</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst1#isDescr()
   * @see #getSpellInst1()
   * @generated
   */
  EAttribute getSpellInst1_Descr();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SpellInst2 <em>Spell Inst2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spell Inst2</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst2
   * @generated
   */
  EClass getSpellInst2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SpellInst2#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst2#getValue()
   * @see #getSpellInst2()
   * @generated
   */
  EAttribute getSpellInst2_Value();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SpellInst2#isSchool <em>School</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>School</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst2#isSchool()
   * @see #getSpellInst2()
   * @generated
   */
  EAttribute getSpellInst2_School();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SpellInst2#isResearchlevel <em>Researchlevel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Researchlevel</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst2#isResearchlevel()
   * @see #getSpellInst2()
   * @generated
   */
  EAttribute getSpellInst2_Researchlevel();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SpellInst2#isAoe <em>Aoe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Aoe</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst2#isAoe()
   * @see #getSpellInst2()
   * @generated
   */
  EAttribute getSpellInst2_Aoe();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SpellInst2#isDamage <em>Damage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Damage</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst2#isDamage()
   * @see #getSpellInst2()
   * @generated
   */
  EAttribute getSpellInst2_Damage();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SpellInst2#isEffect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Effect</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst2#isEffect()
   * @see #getSpellInst2()
   * @generated
   */
  EAttribute getSpellInst2_Effect();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SpellInst2#isFatiguecost <em>Fatiguecost</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fatiguecost</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst2#isFatiguecost()
   * @see #getSpellInst2()
   * @generated
   */
  EAttribute getSpellInst2_Fatiguecost();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SpellInst2#isFlightspr <em>Flightspr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Flightspr</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst2#isFlightspr()
   * @see #getSpellInst2()
   * @generated
   */
  EAttribute getSpellInst2_Flightspr();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SpellInst2#isExplspr <em>Explspr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Explspr</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst2#isExplspr()
   * @see #getSpellInst2()
   * @generated
   */
  EAttribute getSpellInst2_Explspr();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SpellInst2#isNreff <em>Nreff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nreff</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst2#isNreff()
   * @see #getSpellInst2()
   * @generated
   */
  EAttribute getSpellInst2_Nreff();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SpellInst2#isRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Range</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst2#isRange()
   * @see #getSpellInst2()
   * @generated
   */
  EAttribute getSpellInst2_Range();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SpellInst2#isPrecision <em>Precision</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Precision</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst2#isPrecision()
   * @see #getSpellInst2()
   * @generated
   */
  EAttribute getSpellInst2_Precision();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SpellInst2#isSound <em>Sound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sound</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst2#isSound()
   * @see #getSpellInst2()
   * @generated
   */
  EAttribute getSpellInst2_Sound();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SpellInst2#isSpec <em>Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Spec</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst2#isSpec()
   * @see #getSpellInst2()
   * @generated
   */
  EAttribute getSpellInst2_Spec();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SpellInst2#isRestricted <em>Restricted</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Restricted</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst2#isRestricted()
   * @see #getSpellInst2()
   * @generated
   */
  EAttribute getSpellInst2_Restricted();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SpellInst3 <em>Spell Inst3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spell Inst3</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst3
   * @generated
   */
  EClass getSpellInst3();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SpellInst3#getValue1 <em>Value1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value1</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst3#getValue1()
   * @see #getSpellInst3()
   * @generated
   */
  EAttribute getSpellInst3_Value1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SpellInst3#getValue2 <em>Value2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value2</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst3#getValue2()
   * @see #getSpellInst3()
   * @generated
   */
  EAttribute getSpellInst3_Value2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SpellInst3#isPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst3#isPath()
   * @see #getSpellInst3()
   * @generated
   */
  EAttribute getSpellInst3_Path();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SpellInst3#isPathlevel <em>Pathlevel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pathlevel</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst3#isPathlevel()
   * @see #getSpellInst3()
   * @generated
   */
  EAttribute getSpellInst3_Pathlevel();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SpellInst4 <em>Spell Inst4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spell Inst4</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst4
   * @generated
   */
  EClass getSpellInst4();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SpellInst4#isClear <em>Clear</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Clear</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst4#isClear()
   * @see #getSpellInst4()
   * @generated
   */
  EAttribute getSpellInst4_Clear();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SpellInst5 <em>Spell Inst5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spell Inst5</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst5
   * @generated
   */
  EClass getSpellInst5();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SpellInst5#getValue1 <em>Value1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value1</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst5#getValue1()
   * @see #getSpellInst5()
   * @generated
   */
  EAttribute getSpellInst5_Value1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SpellInst5#getValue2 <em>Value2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value2</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst5#getValue2()
   * @see #getSpellInst5()
   * @generated
   */
  EAttribute getSpellInst5_Value2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SpellInst5#isCopyspell <em>Copyspell</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Copyspell</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst5#isCopyspell()
   * @see #getSpellInst5()
   * @generated
   */
  EAttribute getSpellInst5_Copyspell();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SpellInst5#isNextspell <em>Nextspell</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nextspell</em>'.
   * @see org.larz.dom3.dm.dm.SpellInst5#isNextspell()
   * @see #getSpellInst5()
   * @generated
   */
  EAttribute getSpellInst5_Nextspell();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.Item <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item</em>'.
   * @see org.larz.dom3.dm.dm.Item
   * @generated
   */
  EClass getItem();

  /**
   * Returns the meta object for the containment reference list '{@link org.larz.dom3.dm.dm.Item#getMods <em>Mods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mods</em>'.
   * @see org.larz.dom3.dm.dm.Item#getMods()
   * @see #getItem()
   * @generated
   */
  EReference getItem_Mods();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SelectItemById <em>Select Item By Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Item By Id</em>'.
   * @see org.larz.dom3.dm.dm.SelectItemById
   * @generated
   */
  EClass getSelectItemById();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SelectItemById#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.SelectItemById#getValue()
   * @see #getSelectItemById()
   * @generated
   */
  EAttribute getSelectItemById_Value();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SelectItemByName <em>Select Item By Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Item By Name</em>'.
   * @see org.larz.dom3.dm.dm.SelectItemByName
   * @generated
   */
  EClass getSelectItemByName();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SelectItemByName#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.SelectItemByName#getValue()
   * @see #getSelectItemByName()
   * @generated
   */
  EAttribute getSelectItemByName_Value();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.NewItem <em>New Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Item</em>'.
   * @see org.larz.dom3.dm.dm.NewItem
   * @generated
   */
  EClass getNewItem();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.ItemMods <em>Item Mods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item Mods</em>'.
   * @see org.larz.dom3.dm.dm.ItemMods
   * @generated
   */
  EClass getItemMods();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.ItemPattern1 <em>Item Pattern1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item Pattern1</em>'.
   * @see org.larz.dom3.dm.dm.ItemPattern1
   * @generated
   */
  EClass getItemPattern1();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.ItemPattern2 <em>Item Pattern2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item Pattern2</em>'.
   * @see org.larz.dom3.dm.dm.ItemPattern2
   * @generated
   */
  EClass getItemPattern2();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.ItemPattern3 <em>Item Pattern3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item Pattern3</em>'.
   * @see org.larz.dom3.dm.dm.ItemPattern3
   * @generated
   */
  EClass getItemPattern3();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.ItemInst1 <em>Item Inst1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item Inst1</em>'.
   * @see org.larz.dom3.dm.dm.ItemInst1
   * @generated
   */
  EClass getItemInst1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.ItemInst1#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.ItemInst1#getValue()
   * @see #getItemInst1()
   * @generated
   */
  EAttribute getItemInst1_Value();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.ItemInst1#isName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.larz.dom3.dm.dm.ItemInst1#isName()
   * @see #getItemInst1()
   * @generated
   */
  EAttribute getItemInst1_Name();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.ItemInst1#isDescr <em>Descr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Descr</em>'.
   * @see org.larz.dom3.dm.dm.ItemInst1#isDescr()
   * @see #getItemInst1()
   * @generated
   */
  EAttribute getItemInst1_Descr();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.ItemInst1#isArmor <em>Armor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Armor</em>'.
   * @see org.larz.dom3.dm.dm.ItemInst1#isArmor()
   * @see #getItemInst1()
   * @generated
   */
  EAttribute getItemInst1_Armor();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.ItemInst2 <em>Item Inst2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item Inst2</em>'.
   * @see org.larz.dom3.dm.dm.ItemInst2
   * @generated
   */
  EClass getItemInst2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.ItemInst2#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.ItemInst2#getValue()
   * @see #getItemInst2()
   * @generated
   */
  EAttribute getItemInst2_Value();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.ItemInst2#isConstlevel <em>Constlevel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constlevel</em>'.
   * @see org.larz.dom3.dm.dm.ItemInst2#isConstlevel()
   * @see #getItemInst2()
   * @generated
   */
  EAttribute getItemInst2_Constlevel();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.ItemInst2#isMainpath <em>Mainpath</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mainpath</em>'.
   * @see org.larz.dom3.dm.dm.ItemInst2#isMainpath()
   * @see #getItemInst2()
   * @generated
   */
  EAttribute getItemInst2_Mainpath();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.ItemInst2#isMainlevel <em>Mainlevel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mainlevel</em>'.
   * @see org.larz.dom3.dm.dm.ItemInst2#isMainlevel()
   * @see #getItemInst2()
   * @generated
   */
  EAttribute getItemInst2_Mainlevel();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.ItemInst2#isSecondarypath <em>Secondarypath</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Secondarypath</em>'.
   * @see org.larz.dom3.dm.dm.ItemInst2#isSecondarypath()
   * @see #getItemInst2()
   * @generated
   */
  EAttribute getItemInst2_Secondarypath();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.ItemInst2#isSecondarylevel <em>Secondarylevel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Secondarylevel</em>'.
   * @see org.larz.dom3.dm.dm.ItemInst2#isSecondarylevel()
   * @see #getItemInst2()
   * @generated
   */
  EAttribute getItemInst2_Secondarylevel();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.ItemInst2#isType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.larz.dom3.dm.dm.ItemInst2#isType()
   * @see #getItemInst2()
   * @generated
   */
  EAttribute getItemInst2_Type();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.ItemInst3 <em>Item Inst3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item Inst3</em>'.
   * @see org.larz.dom3.dm.dm.ItemInst3
   * @generated
   */
  EClass getItemInst3();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.ItemInst3#getValue1 <em>Value1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value1</em>'.
   * @see org.larz.dom3.dm.dm.ItemInst3#getValue1()
   * @see #getItemInst3()
   * @generated
   */
  EAttribute getItemInst3_Value1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.ItemInst3#getValue2 <em>Value2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value2</em>'.
   * @see org.larz.dom3.dm.dm.ItemInst3#getValue2()
   * @see #getItemInst3()
   * @generated
   */
  EAttribute getItemInst3_Value2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.ItemInst3#isCopyspr <em>Copyspr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Copyspr</em>'.
   * @see org.larz.dom3.dm.dm.ItemInst3#isCopyspr()
   * @see #getItemInst3()
   * @generated
   */
  EAttribute getItemInst3_Copyspr();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.ItemInst3#isWeapon <em>Weapon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weapon</em>'.
   * @see org.larz.dom3.dm.dm.ItemInst3#isWeapon()
   * @see #getItemInst3()
   * @generated
   */
  EAttribute getItemInst3_Weapon();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name</em>'.
   * @see org.larz.dom3.dm.dm.Name
   * @generated
   */
  EClass getName_();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SelectName <em>Select Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Name</em>'.
   * @see org.larz.dom3.dm.dm.SelectName
   * @generated
   */
  EClass getSelectName();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SelectName#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.SelectName#getValue()
   * @see #getSelectName()
   * @generated
   */
  EAttribute getSelectName_Value();

  /**
   * Returns the meta object for the containment reference list '{@link org.larz.dom3.dm.dm.SelectName#getMods <em>Mods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mods</em>'.
   * @see org.larz.dom3.dm.dm.SelectName#getMods()
   * @see #getSelectName()
   * @generated
   */
  EReference getSelectName_Mods();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.NameMods <em>Name Mods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Mods</em>'.
   * @see org.larz.dom3.dm.dm.NameMods
   * @generated
   */
  EClass getNameMods();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.NamePattern1 <em>Name Pattern1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Pattern1</em>'.
   * @see org.larz.dom3.dm.dm.NamePattern1
   * @generated
   */
  EClass getNamePattern1();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.NamePattern2 <em>Name Pattern2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Pattern2</em>'.
   * @see org.larz.dom3.dm.dm.NamePattern2
   * @generated
   */
  EClass getNamePattern2();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.NameInst1 <em>Name Inst1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Inst1</em>'.
   * @see org.larz.dom3.dm.dm.NameInst1
   * @generated
   */
  EClass getNameInst1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NameInst1#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.NameInst1#getValue()
   * @see #getNameInst1()
   * @generated
   */
  EAttribute getNameInst1_Value();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NameInst1#isName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.larz.dom3.dm.dm.NameInst1#isName()
   * @see #getNameInst1()
   * @generated
   */
  EAttribute getNameInst1_Name();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.NameInst2 <em>Name Inst2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Inst2</em>'.
   * @see org.larz.dom3.dm.dm.NameInst2
   * @generated
   */
  EClass getNameInst2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NameInst2#isClear <em>Clear</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Clear</em>'.
   * @see org.larz.dom3.dm.dm.NameInst2#isClear()
   * @see #getNameInst2()
   * @generated
   */
  EAttribute getNameInst2_Clear();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.Site <em>Site</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Site</em>'.
   * @see org.larz.dom3.dm.dm.Site
   * @generated
   */
  EClass getSite();

  /**
   * Returns the meta object for the containment reference list '{@link org.larz.dom3.dm.dm.Site#getMods <em>Mods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mods</em>'.
   * @see org.larz.dom3.dm.dm.Site#getMods()
   * @see #getSite()
   * @generated
   */
  EReference getSite_Mods();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SelectSiteById <em>Select Site By Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Site By Id</em>'.
   * @see org.larz.dom3.dm.dm.SelectSiteById
   * @generated
   */
  EClass getSelectSiteById();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SelectSiteById#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.SelectSiteById#getValue()
   * @see #getSelectSiteById()
   * @generated
   */
  EAttribute getSelectSiteById_Value();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SelectSiteByName <em>Select Site By Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Site By Name</em>'.
   * @see org.larz.dom3.dm.dm.SelectSiteByName
   * @generated
   */
  EClass getSelectSiteByName();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SelectSiteByName#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.SelectSiteByName#getValue()
   * @see #getSelectSiteByName()
   * @generated
   */
  EAttribute getSelectSiteByName_Value();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.NewSite <em>New Site</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Site</em>'.
   * @see org.larz.dom3.dm.dm.NewSite
   * @generated
   */
  EClass getNewSite();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NewSite#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.NewSite#getValue()
   * @see #getNewSite()
   * @generated
   */
  EAttribute getNewSite_Value();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SiteMods <em>Site Mods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Site Mods</em>'.
   * @see org.larz.dom3.dm.dm.SiteMods
   * @generated
   */
  EClass getSiteMods();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SitePattern1 <em>Site Pattern1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Site Pattern1</em>'.
   * @see org.larz.dom3.dm.dm.SitePattern1
   * @generated
   */
  EClass getSitePattern1();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SitePattern2 <em>Site Pattern2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Site Pattern2</em>'.
   * @see org.larz.dom3.dm.dm.SitePattern2
   * @generated
   */
  EClass getSitePattern2();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SitePattern3 <em>Site Pattern3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Site Pattern3</em>'.
   * @see org.larz.dom3.dm.dm.SitePattern3
   * @generated
   */
  EClass getSitePattern3();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SitePattern4 <em>Site Pattern4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Site Pattern4</em>'.
   * @see org.larz.dom3.dm.dm.SitePattern4
   * @generated
   */
  EClass getSitePattern4();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SiteInst1 <em>Site Inst1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Site Inst1</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst1
   * @generated
   */
  EClass getSiteInst1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst1#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst1#getValue()
   * @see #getSiteInst1()
   * @generated
   */
  EAttribute getSiteInst1_Value();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst1#isName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst1#isName()
   * @see #getSiteInst1()
   * @generated
   */
  EAttribute getSiteInst1_Name();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SiteInst2 <em>Site Inst2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Site Inst2</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst2
   * @generated
   */
  EClass getSiteInst2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst2#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst2#getValue()
   * @see #getSiteInst2()
   * @generated
   */
  EAttribute getSiteInst2_Value();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst2#isPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst2#isPath()
   * @see #getSiteInst2()
   * @generated
   */
  EAttribute getSiteInst2_Path();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst2#isLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst2#isLevel()
   * @see #getSiteInst2()
   * @generated
   */
  EAttribute getSiteInst2_Level();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst2#isRarity <em>Rarity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rarity</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst2#isRarity()
   * @see #getSiteInst2()
   * @generated
   */
  EAttribute getSiteInst2_Rarity();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst2#isLoc <em>Loc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Loc</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst2#isLoc()
   * @see #getSiteInst2()
   * @generated
   */
  EAttribute getSiteInst2_Loc();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst2#isHomemon <em>Homemon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Homemon</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst2#isHomemon()
   * @see #getSiteInst2()
   * @generated
   */
  EAttribute getSiteInst2_Homemon();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst2#isHomecom <em>Homecom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Homecom</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst2#isHomecom()
   * @see #getSiteInst2()
   * @generated
   */
  EAttribute getSiteInst2_Homecom();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst2#isMon <em>Mon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mon</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst2#isMon()
   * @see #getSiteInst2()
   * @generated
   */
  EAttribute getSiteInst2_Mon();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst2#isCom <em>Com</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Com</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst2#isCom()
   * @see #getSiteInst2()
   * @generated
   */
  EAttribute getSiteInst2_Com();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst2#isGold <em>Gold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gold</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst2#isGold()
   * @see #getSiteInst2()
   * @generated
   */
  EAttribute getSiteInst2_Gold();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst2#isRes <em>Res</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Res</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst2#isRes()
   * @see #getSiteInst2()
   * @generated
   */
  EAttribute getSiteInst2_Res();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst2#isIncscale <em>Incscale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Incscale</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst2#isIncscale()
   * @see #getSiteInst2()
   * @generated
   */
  EAttribute getSiteInst2_Incscale();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst2#isDecscale <em>Decscale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Decscale</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst2#isDecscale()
   * @see #getSiteInst2()
   * @generated
   */
  EAttribute getSiteInst2_Decscale();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst2#isHeal <em>Heal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Heal</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst2#isHeal()
   * @see #getSiteInst2()
   * @generated
   */
  EAttribute getSiteInst2_Heal();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst2#isCurse <em>Curse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Curse</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst2#isCurse()
   * @see #getSiteInst2()
   * @generated
   */
  EAttribute getSiteInst2_Curse();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst2#isDisease <em>Disease</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Disease</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst2#isDisease()
   * @see #getSiteInst2()
   * @generated
   */
  EAttribute getSiteInst2_Disease();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst2#isHorrormark <em>Horrormark</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Horrormark</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst2#isHorrormark()
   * @see #getSiteInst2()
   * @generated
   */
  EAttribute getSiteInst2_Horrormark();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst2#isHolyfire <em>Holyfire</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Holyfire</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst2#isHolyfire()
   * @see #getSiteInst2()
   * @generated
   */
  EAttribute getSiteInst2_Holyfire();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst2#isHolypower <em>Holypower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Holypower</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst2#isHolypower()
   * @see #getSiteInst2()
   * @generated
   */
  EAttribute getSiteInst2_Holypower();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst2#isConjcost <em>Conjcost</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Conjcost</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst2#isConjcost()
   * @see #getSiteInst2()
   * @generated
   */
  EAttribute getSiteInst2_Conjcost();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst2#isAltcost <em>Altcost</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Altcost</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst2#isAltcost()
   * @see #getSiteInst2()
   * @generated
   */
  EAttribute getSiteInst2_Altcost();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst2#isEvocost <em>Evocost</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Evocost</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst2#isEvocost()
   * @see #getSiteInst2()
   * @generated
   */
  EAttribute getSiteInst2_Evocost();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst2#isConstcost <em>Constcost</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constcost</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst2#isConstcost()
   * @see #getSiteInst2()
   * @generated
   */
  EAttribute getSiteInst2_Constcost();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst2#isEnchcost <em>Enchcost</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enchcost</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst2#isEnchcost()
   * @see #getSiteInst2()
   * @generated
   */
  EAttribute getSiteInst2_Enchcost();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst2#isThaucost <em>Thaucost</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Thaucost</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst2#isThaucost()
   * @see #getSiteInst2()
   * @generated
   */
  EAttribute getSiteInst2_Thaucost();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst2#isBloodcost <em>Bloodcost</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bloodcost</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst2#isBloodcost()
   * @see #getSiteInst2()
   * @generated
   */
  EAttribute getSiteInst2_Bloodcost();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SiteInst3 <em>Site Inst3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Site Inst3</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst3
   * @generated
   */
  EClass getSiteInst3();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst3#getValue1 <em>Value1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value1</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst3#getValue1()
   * @see #getSiteInst3()
   * @generated
   */
  EAttribute getSiteInst3_Value1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst3#getValue2 <em>Value2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value2</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst3#getValue2()
   * @see #getSiteInst3()
   * @generated
   */
  EAttribute getSiteInst3_Value2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst3#isGems <em>Gems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gems</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst3#isGems()
   * @see #getSiteInst3()
   * @generated
   */
  EAttribute getSiteInst3_Gems();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SiteInst4 <em>Site Inst4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Site Inst4</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst4
   * @generated
   */
  EClass getSiteInst4();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst4#isClear <em>Clear</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Clear</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst4#isClear()
   * @see #getSiteInst4()
   * @generated
   */
  EAttribute getSiteInst4_Clear();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SiteInst4#isLab <em>Lab</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lab</em>'.
   * @see org.larz.dom3.dm.dm.SiteInst4#isLab()
   * @see #getSiteInst4()
   * @generated
   */
  EAttribute getSiteInst4_Lab();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.Nation <em>Nation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nation</em>'.
   * @see org.larz.dom3.dm.dm.Nation
   * @generated
   */
  EClass getNation();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.SelectNation <em>Select Nation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Nation</em>'.
   * @see org.larz.dom3.dm.dm.SelectNation
   * @generated
   */
  EClass getSelectNation();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.SelectNation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.SelectNation#getValue()
   * @see #getSelectNation()
   * @generated
   */
  EAttribute getSelectNation_Value();

  /**
   * Returns the meta object for the containment reference list '{@link org.larz.dom3.dm.dm.SelectNation#getMods <em>Mods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mods</em>'.
   * @see org.larz.dom3.dm.dm.SelectNation#getMods()
   * @see #getSelectNation()
   * @generated
   */
  EReference getSelectNation_Mods();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.IndepFlag <em>Indep Flag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Indep Flag</em>'.
   * @see org.larz.dom3.dm.dm.IndepFlag
   * @generated
   */
  EClass getIndepFlag();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.IndepFlag#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.IndepFlag#getValue()
   * @see #getIndepFlag()
   * @generated
   */
  EAttribute getIndepFlag_Value();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.NationMods <em>Nation Mods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nation Mods</em>'.
   * @see org.larz.dom3.dm.dm.NationMods
   * @generated
   */
  EClass getNationMods();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.NationPattern1 <em>Nation Pattern1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nation Pattern1</em>'.
   * @see org.larz.dom3.dm.dm.NationPattern1
   * @generated
   */
  EClass getNationPattern1();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.NationPattern2 <em>Nation Pattern2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nation Pattern2</em>'.
   * @see org.larz.dom3.dm.dm.NationPattern2
   * @generated
   */
  EClass getNationPattern2();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.NationPattern3 <em>Nation Pattern3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nation Pattern3</em>'.
   * @see org.larz.dom3.dm.dm.NationPattern3
   * @generated
   */
  EClass getNationPattern3();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.NationPattern4 <em>Nation Pattern4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nation Pattern4</em>'.
   * @see org.larz.dom3.dm.dm.NationPattern4
   * @generated
   */
  EClass getNationPattern4();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.NationPattern5 <em>Nation Pattern5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nation Pattern5</em>'.
   * @see org.larz.dom3.dm.dm.NationPattern5
   * @generated
   */
  EClass getNationPattern5();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.NationInst1 <em>Nation Inst1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nation Inst1</em>'.
   * @see org.larz.dom3.dm.dm.NationInst1
   * @generated
   */
  EClass getNationInst1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst1#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.NationInst1#getValue()
   * @see #getNationInst1()
   * @generated
   */
  EAttribute getNationInst1_Value();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst1#isName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.larz.dom3.dm.dm.NationInst1#isName()
   * @see #getNationInst1()
   * @generated
   */
  EAttribute getNationInst1_Name();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst1#isEpithet <em>Epithet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Epithet</em>'.
   * @see org.larz.dom3.dm.dm.NationInst1#isEpithet()
   * @see #getNationInst1()
   * @generated
   */
  EAttribute getNationInst1_Epithet();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst1#isDescr <em>Descr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Descr</em>'.
   * @see org.larz.dom3.dm.dm.NationInst1#isDescr()
   * @see #getNationInst1()
   * @generated
   */
  EAttribute getNationInst1_Descr();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst1#isSummary <em>Summary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Summary</em>'.
   * @see org.larz.dom3.dm.dm.NationInst1#isSummary()
   * @see #getNationInst1()
   * @generated
   */
  EAttribute getNationInst1_Summary();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst1#isBrief <em>Brief</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Brief</em>'.
   * @see org.larz.dom3.dm.dm.NationInst1#isBrief()
   * @see #getNationInst1()
   * @generated
   */
  EAttribute getNationInst1_Brief();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst1#isFlag <em>Flag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Flag</em>'.
   * @see org.larz.dom3.dm.dm.NationInst1#isFlag()
   * @see #getNationInst1()
   * @generated
   */
  EAttribute getNationInst1_Flag();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst1#isMapbackground <em>Mapbackground</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mapbackground</em>'.
   * @see org.larz.dom3.dm.dm.NationInst1#isMapbackground()
   * @see #getNationInst1()
   * @generated
   */
  EAttribute getNationInst1_Mapbackground();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst1#isStartsite <em>Startsite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Startsite</em>'.
   * @see org.larz.dom3.dm.dm.NationInst1#isStartsite()
   * @see #getNationInst1()
   * @generated
   */
  EAttribute getNationInst1_Startsite();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.NationInst2 <em>Nation Inst2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nation Inst2</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2
   * @generated
   */
  EClass getNationInst2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#getValue()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Value();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isEra <em>Era</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Era</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isEra()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Era();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isLabcost <em>Labcost</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Labcost</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isLabcost()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Labcost();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isTemplecost <em>Templecost</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Templecost</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isTemplecost()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Templecost();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isTemplepic <em>Templepic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Templepic</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isTemplepic()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Templepic();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isStartunitnbrs1 <em>Startunitnbrs1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Startunitnbrs1</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isStartunitnbrs1()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Startunitnbrs1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isStartunitnbrs2 <em>Startunitnbrs2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Startunitnbrs2</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isStartunitnbrs2()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Startunitnbrs2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isHero1 <em>Hero1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hero1</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isHero1()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Hero1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isHero2 <em>Hero2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hero2</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isHero2()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Hero2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isHero3 <em>Hero3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hero3</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isHero3()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Hero3();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isHero4 <em>Hero4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hero4</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isHero4()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Hero4();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isHero5 <em>Hero5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hero5</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isHero5()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Hero5();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isHero6 <em>Hero6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hero6</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isHero6()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Hero6();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isMultihero1 <em>Multihero1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multihero1</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isMultihero1()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Multihero1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isMultihero2 <em>Multihero2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multihero2</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isMultihero2()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Multihero2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isDefmult1 <em>Defmult1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Defmult1</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isDefmult1()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Defmult1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isDefmult1b <em>Defmult1b</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Defmult1b</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isDefmult1b()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Defmult1b();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isDefmult2 <em>Defmult2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Defmult2</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isDefmult2()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Defmult2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isDefmult2b <em>Defmult2b</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Defmult2b</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isDefmult2b()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Defmult2b();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isIdealcold <em>Idealcold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Idealcold</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isIdealcold()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Idealcold();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isCastleprod <em>Castleprod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Castleprod</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isCastleprod()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Castleprod();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isDomkill <em>Domkill</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Domkill</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isDomkill()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Domkill();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isDomunrest <em>Domunrest</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Domunrest</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isDomunrest()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Domunrest();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isStartfort <em>Startfort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Startfort</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isStartfort()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Startfort();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isDefaultfort <em>Defaultfort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Defaultfort</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isDefaultfort()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Defaultfort();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isFarmfort <em>Farmfort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Farmfort</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isFarmfort()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Farmfort();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isMountainfort <em>Mountainfort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mountainfort</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isMountainfort()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Mountainfort();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isForestfort <em>Forestfort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Forestfort</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isForestfort()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Forestfort();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isSwampfort <em>Swampfort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Swampfort</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isSwampfort()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Swampfort();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isUwfort <em>Uwfort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uwfort</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isUwfort()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Uwfort();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst2#isDeepfort <em>Deepfort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deepfort</em>'.
   * @see org.larz.dom3.dm.dm.NationInst2#isDeepfort()
   * @see #getNationInst2()
   * @generated
   */
  EAttribute getNationInst2_Deepfort();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.NationInst3 <em>Nation Inst3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nation Inst3</em>'.
   * @see org.larz.dom3.dm.dm.NationInst3
   * @generated
   */
  EClass getNationInst3();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst3#isClearnation <em>Clearnation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Clearnation</em>'.
   * @see org.larz.dom3.dm.dm.NationInst3#isClearnation()
   * @see #getNationInst3()
   * @generated
   */
  EAttribute getNationInst3_Clearnation();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst3#isClearrec <em>Clearrec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Clearrec</em>'.
   * @see org.larz.dom3.dm.dm.NationInst3#isClearrec()
   * @see #getNationInst3()
   * @generated
   */
  EAttribute getNationInst3_Clearrec();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst3#isClearsites <em>Clearsites</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Clearsites</em>'.
   * @see org.larz.dom3.dm.dm.NationInst3#isClearsites()
   * @see #getNationInst3()
   * @generated
   */
  EAttribute getNationInst3_Clearsites();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst3#isUwnation <em>Uwnation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uwnation</em>'.
   * @see org.larz.dom3.dm.dm.NationInst3#isUwnation()
   * @see #getNationInst3()
   * @generated
   */
  EAttribute getNationInst3_Uwnation();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst3#isBloodnation <em>Bloodnation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bloodnation</em>'.
   * @see org.larz.dom3.dm.dm.NationInst3#isBloodnation()
   * @see #getNationInst3()
   * @generated
   */
  EAttribute getNationInst3_Bloodnation();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst3#isNopreach <em>Nopreach</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nopreach</em>'.
   * @see org.larz.dom3.dm.dm.NationInst3#isNopreach()
   * @see #getNationInst3()
   * @generated
   */
  EAttribute getNationInst3_Nopreach();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst3#isDyingdom <em>Dyingdom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dyingdom</em>'.
   * @see org.larz.dom3.dm.dm.NationInst3#isDyingdom()
   * @see #getNationInst3()
   * @generated
   */
  EAttribute getNationInst3_Dyingdom();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst3#isSacrificedom <em>Sacrificedom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sacrificedom</em>'.
   * @see org.larz.dom3.dm.dm.NationInst3#isSacrificedom()
   * @see #getNationInst3()
   * @generated
   */
  EAttribute getNationInst3_Sacrificedom();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst3#isNodeathsupply <em>Nodeathsupply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nodeathsupply</em>'.
   * @see org.larz.dom3.dm.dm.NationInst3#isNodeathsupply()
   * @see #getNationInst3()
   * @generated
   */
  EAttribute getNationInst3_Nodeathsupply();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst3#isAutoundead <em>Autoundead</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Autoundead</em>'.
   * @see org.larz.dom3.dm.dm.NationInst3#isAutoundead()
   * @see #getNationInst3()
   * @generated
   */
  EAttribute getNationInst3_Autoundead();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst3#isZombiereanim <em>Zombiereanim</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Zombiereanim</em>'.
   * @see org.larz.dom3.dm.dm.NationInst3#isZombiereanim()
   * @see #getNationInst3()
   * @generated
   */
  EAttribute getNationInst3_Zombiereanim();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst3#isHorsereanim <em>Horsereanim</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Horsereanim</em>'.
   * @see org.larz.dom3.dm.dm.NationInst3#isHorsereanim()
   * @see #getNationInst3()
   * @generated
   */
  EAttribute getNationInst3_Horsereanim();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst3#isWightreanim <em>Wightreanim</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wightreanim</em>'.
   * @see org.larz.dom3.dm.dm.NationInst3#isWightreanim()
   * @see #getNationInst3()
   * @generated
   */
  EAttribute getNationInst3_Wightreanim();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst3#isManikinreanim <em>Manikinreanim</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Manikinreanim</em>'.
   * @see org.larz.dom3.dm.dm.NationInst3#isManikinreanim()
   * @see #getNationInst3()
   * @generated
   */
  EAttribute getNationInst3_Manikinreanim();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst3#isTombwyrmreanim <em>Tombwyrmreanim</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tombwyrmreanim</em>'.
   * @see org.larz.dom3.dm.dm.NationInst3#isTombwyrmreanim()
   * @see #getNationInst3()
   * @generated
   */
  EAttribute getNationInst3_Tombwyrmreanim();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.NationInst4 <em>Nation Inst4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nation Inst4</em>'.
   * @see org.larz.dom3.dm.dm.NationInst4
   * @generated
   */
  EClass getNationInst4();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst4#getValue1 <em>Value1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value1</em>'.
   * @see org.larz.dom3.dm.dm.NationInst4#getValue1()
   * @see #getNationInst4()
   * @generated
   */
  EAttribute getNationInst4_Value1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst4#getValue2 <em>Value2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value2</em>'.
   * @see org.larz.dom3.dm.dm.NationInst4#getValue2()
   * @see #getNationInst4()
   * @generated
   */
  EAttribute getNationInst4_Value2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst4#isStartcom <em>Startcom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Startcom</em>'.
   * @see org.larz.dom3.dm.dm.NationInst4#isStartcom()
   * @see #getNationInst4()
   * @generated
   */
  EAttribute getNationInst4_Startcom();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst4#isStartscout <em>Startscout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Startscout</em>'.
   * @see org.larz.dom3.dm.dm.NationInst4#isStartscout()
   * @see #getNationInst4()
   * @generated
   */
  EAttribute getNationInst4_Startscout();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst4#isStartunittype1 <em>Startunittype1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Startunittype1</em>'.
   * @see org.larz.dom3.dm.dm.NationInst4#isStartunittype1()
   * @see #getNationInst4()
   * @generated
   */
  EAttribute getNationInst4_Startunittype1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst4#isStartunittype2 <em>Startunittype2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Startunittype2</em>'.
   * @see org.larz.dom3.dm.dm.NationInst4#isStartunittype2()
   * @see #getNationInst4()
   * @generated
   */
  EAttribute getNationInst4_Startunittype2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst4#isAddrecunit <em>Addrecunit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Addrecunit</em>'.
   * @see org.larz.dom3.dm.dm.NationInst4#isAddrecunit()
   * @see #getNationInst4()
   * @generated
   */
  EAttribute getNationInst4_Addrecunit();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst4#isAddreccom <em>Addreccom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Addreccom</em>'.
   * @see org.larz.dom3.dm.dm.NationInst4#isAddreccom()
   * @see #getNationInst4()
   * @generated
   */
  EAttribute getNationInst4_Addreccom();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst4#isUwunit1 <em>Uwunit1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uwunit1</em>'.
   * @see org.larz.dom3.dm.dm.NationInst4#isUwunit1()
   * @see #getNationInst4()
   * @generated
   */
  EAttribute getNationInst4_Uwunit1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst4#isUwunit2 <em>Uwunit2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uwunit2</em>'.
   * @see org.larz.dom3.dm.dm.NationInst4#isUwunit2()
   * @see #getNationInst4()
   * @generated
   */
  EAttribute getNationInst4_Uwunit2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst4#isUwunit3 <em>Uwunit3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uwunit3</em>'.
   * @see org.larz.dom3.dm.dm.NationInst4#isUwunit3()
   * @see #getNationInst4()
   * @generated
   */
  EAttribute getNationInst4_Uwunit3();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst4#isUwunit4 <em>Uwunit4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uwunit4</em>'.
   * @see org.larz.dom3.dm.dm.NationInst4#isUwunit4()
   * @see #getNationInst4()
   * @generated
   */
  EAttribute getNationInst4_Uwunit4();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst4#isUwunit5 <em>Uwunit5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uwunit5</em>'.
   * @see org.larz.dom3.dm.dm.NationInst4#isUwunit5()
   * @see #getNationInst4()
   * @generated
   */
  EAttribute getNationInst4_Uwunit5();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst4#isUwcom1 <em>Uwcom1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uwcom1</em>'.
   * @see org.larz.dom3.dm.dm.NationInst4#isUwcom1()
   * @see #getNationInst4()
   * @generated
   */
  EAttribute getNationInst4_Uwcom1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst4#isUwcom2 <em>Uwcom2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uwcom2</em>'.
   * @see org.larz.dom3.dm.dm.NationInst4#isUwcom2()
   * @see #getNationInst4()
   * @generated
   */
  EAttribute getNationInst4_Uwcom2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst4#isUwcom3 <em>Uwcom3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uwcom3</em>'.
   * @see org.larz.dom3.dm.dm.NationInst4#isUwcom3()
   * @see #getNationInst4()
   * @generated
   */
  EAttribute getNationInst4_Uwcom3();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst4#isUwcom4 <em>Uwcom4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uwcom4</em>'.
   * @see org.larz.dom3.dm.dm.NationInst4#isUwcom4()
   * @see #getNationInst4()
   * @generated
   */
  EAttribute getNationInst4_Uwcom4();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst4#isUwcom5 <em>Uwcom5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uwcom5</em>'.
   * @see org.larz.dom3.dm.dm.NationInst4#isUwcom5()
   * @see #getNationInst4()
   * @generated
   */
  EAttribute getNationInst4_Uwcom5();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst4#isDefcom1 <em>Defcom1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Defcom1</em>'.
   * @see org.larz.dom3.dm.dm.NationInst4#isDefcom1()
   * @see #getNationInst4()
   * @generated
   */
  EAttribute getNationInst4_Defcom1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst4#isDefcom2 <em>Defcom2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Defcom2</em>'.
   * @see org.larz.dom3.dm.dm.NationInst4#isDefcom2()
   * @see #getNationInst4()
   * @generated
   */
  EAttribute getNationInst4_Defcom2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst4#isDefunit1 <em>Defunit1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Defunit1</em>'.
   * @see org.larz.dom3.dm.dm.NationInst4#isDefunit1()
   * @see #getNationInst4()
   * @generated
   */
  EAttribute getNationInst4_Defunit1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst4#isDefunit1b <em>Defunit1b</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Defunit1b</em>'.
   * @see org.larz.dom3.dm.dm.NationInst4#isDefunit1b()
   * @see #getNationInst4()
   * @generated
   */
  EAttribute getNationInst4_Defunit1b();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst4#isDefunit2 <em>Defunit2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Defunit2</em>'.
   * @see org.larz.dom3.dm.dm.NationInst4#isDefunit2()
   * @see #getNationInst4()
   * @generated
   */
  EAttribute getNationInst4_Defunit2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst4#isDefunit2b <em>Defunit2b</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Defunit2b</em>'.
   * @see org.larz.dom3.dm.dm.NationInst4#isDefunit2b()
   * @see #getNationInst4()
   * @generated
   */
  EAttribute getNationInst4_Defunit2b();

  /**
   * Returns the meta object for class '{@link org.larz.dom3.dm.dm.NationInst5 <em>Nation Inst5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nation Inst5</em>'.
   * @see org.larz.dom3.dm.dm.NationInst5
   * @generated
   */
  EClass getNationInst5();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst5#getValue1 <em>Value1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value1</em>'.
   * @see org.larz.dom3.dm.dm.NationInst5#getValue1()
   * @see #getNationInst5()
   * @generated
   */
  EAttribute getNationInst5_Value1();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst5#getValue2 <em>Value2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value2</em>'.
   * @see org.larz.dom3.dm.dm.NationInst5#getValue2()
   * @see #getNationInst5()
   * @generated
   */
  EAttribute getNationInst5_Value2();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst5#getValue3 <em>Value3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value3</em>'.
   * @see org.larz.dom3.dm.dm.NationInst5#getValue3()
   * @see #getNationInst5()
   * @generated
   */
  EAttribute getNationInst5_Value3();

  /**
   * Returns the meta object for the attribute '{@link org.larz.dom3.dm.dm.NationInst5#isColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see org.larz.dom3.dm.dm.NationInst5#isColor()
   * @see #getNationInst5()
   * @generated
   */
  EAttribute getNationInst5_Color();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DmFactory getDmFactory();

} //DmPackage
