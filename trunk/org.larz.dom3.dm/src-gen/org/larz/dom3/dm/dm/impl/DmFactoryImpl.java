/**
 * <copyright>
 * </copyright>
 *
 */
package org.larz.dom3.dm.dm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.larz.dom3.dm.dm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DmFactoryImpl extends EFactoryImpl implements DmFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DmFactory init()
  {
    try
    {
      DmFactory theDmFactory = (DmFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.larz.org/dom3/dm/Dm"); 
      if (theDmFactory != null)
      {
        return theDmFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DmFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DmFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DmPackage.DOM3_MOD: return createDom3Mod();
      case DmPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case DmPackage.ARMOR: return createArmor();
      case DmPackage.SELECT_ARMOR_BY_ID: return createSelectArmorById();
      case DmPackage.SELECT_ARMOR_BY_NAME: return createSelectArmorByName();
      case DmPackage.NEW_ARMOR: return createNewArmor();
      case DmPackage.ARMOR_MODS: return createArmorMods();
      case DmPackage.ARMOR_PATTERN1: return createArmorPattern1();
      case DmPackage.ARMOR_PATTERN2: return createArmorPattern2();
      case DmPackage.ARMOR_INST1: return createArmorInst1();
      case DmPackage.ARMOR_INST2: return createArmorInst2();
      case DmPackage.WEAPON: return createWeapon();
      case DmPackage.SELECT_WEAPON_BY_ID: return createSelectWeaponById();
      case DmPackage.SELECT_WEAPON_BY_NAME: return createSelectWeaponByName();
      case DmPackage.NEW_WEAPON: return createNewWeapon();
      case DmPackage.WEAPON_MODS: return createWeaponMods();
      case DmPackage.WEAPON_PATTERN1: return createWeaponPattern1();
      case DmPackage.WEAPON_PATTERN2: return createWeaponPattern2();
      case DmPackage.WEAPON_PATTERN3: return createWeaponPattern3();
      case DmPackage.WEAPON_PATTERN4: return createWeaponPattern4();
      case DmPackage.WEAPON_INST1: return createWeaponInst1();
      case DmPackage.WEAPON_INST2: return createWeaponInst2();
      case DmPackage.WEAPON_INST3: return createWeaponInst3();
      case DmPackage.WEAPON_INST4: return createWeaponInst4();
      case DmPackage.MONSTER: return createMonster();
      case DmPackage.SELECT_MONSTER_BY_ID: return createSelectMonsterById();
      case DmPackage.SELECT_MONSTER_BY_NAME: return createSelectMonsterByName();
      case DmPackage.NEW_MONSTER: return createNewMonster();
      case DmPackage.MONSTER_MODS: return createMonsterMods();
      case DmPackage.MONSTER_PATTERN1: return createMonsterPattern1();
      case DmPackage.MONSTER_PATTERN2: return createMonsterPattern2();
      case DmPackage.MONSTER_PATTERN3: return createMonsterPattern3();
      case DmPackage.MONSTER_PATTERN4: return createMonsterPattern4();
      case DmPackage.MONSTER_PATTERN5: return createMonsterPattern5();
      case DmPackage.MONSTER_PATTERN6: return createMonsterPattern6();
      case DmPackage.MONSTER_INST1: return createMonsterInst1();
      case DmPackage.MONSTER_INST2: return createMonsterInst2();
      case DmPackage.MONSTER_INST3: return createMonsterInst3();
      case DmPackage.MONSTER_INST4: return createMonsterInst4();
      case DmPackage.MONSTER_INST5: return createMonsterInst5();
      case DmPackage.MONSTER_INST6: return createMonsterInst6();
      case DmPackage.SPELL: return createSpell();
      case DmPackage.SELECT_SPELL_BY_ID: return createSelectSpellById();
      case DmPackage.SELECT_SPELL_BY_NAME: return createSelectSpellByName();
      case DmPackage.NEW_SPELL: return createNewSpell();
      case DmPackage.SPELL_MODS: return createSpellMods();
      case DmPackage.SPELL_PATTERN1: return createSpellPattern1();
      case DmPackage.SPELL_PATTERN2: return createSpellPattern2();
      case DmPackage.SPELL_PATTERN3: return createSpellPattern3();
      case DmPackage.SPELL_PATTERN4: return createSpellPattern4();
      case DmPackage.SPELL_PATTERN5: return createSpellPattern5();
      case DmPackage.SPELL_INST1: return createSpellInst1();
      case DmPackage.SPELL_INST2: return createSpellInst2();
      case DmPackage.SPELL_INST3: return createSpellInst3();
      case DmPackage.SPELL_INST4: return createSpellInst4();
      case DmPackage.SPELL_INST5: return createSpellInst5();
      case DmPackage.ITEM: return createItem();
      case DmPackage.SELECT_ITEM_BY_ID: return createSelectItemById();
      case DmPackage.SELECT_ITEM_BY_NAME: return createSelectItemByName();
      case DmPackage.NEW_ITEM: return createNewItem();
      case DmPackage.ITEM_MODS: return createItemMods();
      case DmPackage.ITEM_PATTERN1: return createItemPattern1();
      case DmPackage.ITEM_PATTERN2: return createItemPattern2();
      case DmPackage.ITEM_INST1: return createItemInst1();
      case DmPackage.ITEM_INST2: return createItemInst2();
      case DmPackage.NAME: return createName();
      case DmPackage.SELECT_NAME: return createSelectName();
      case DmPackage.NAME_MODS: return createNameMods();
      case DmPackage.NAME_PATTERN1: return createNamePattern1();
      case DmPackage.NAME_PATTERN2: return createNamePattern2();
      case DmPackage.NAME_INST1: return createNameInst1();
      case DmPackage.NAME_INST2: return createNameInst2();
      case DmPackage.SITE: return createSite();
      case DmPackage.SELECT_SITE_BY_ID: return createSelectSiteById();
      case DmPackage.SELECT_SITE_BY_NAME: return createSelectSiteByName();
      case DmPackage.NEW_SITE: return createNewSite();
      case DmPackage.SITE_MODS: return createSiteMods();
      case DmPackage.SITE_PATTERN1: return createSitePattern1();
      case DmPackage.SITE_PATTERN2: return createSitePattern2();
      case DmPackage.SITE_PATTERN3: return createSitePattern3();
      case DmPackage.SITE_PATTERN4: return createSitePattern4();
      case DmPackage.SITE_INST1: return createSiteInst1();
      case DmPackage.SITE_INST2: return createSiteInst2();
      case DmPackage.SITE_INST3: return createSiteInst3();
      case DmPackage.SITE_INST4: return createSiteInst4();
      case DmPackage.NATION: return createNation();
      case DmPackage.SELECT_NATION: return createSelectNation();
      case DmPackage.INDEP_FLAG: return createIndepFlag();
      case DmPackage.NATION_MODS: return createNationMods();
      case DmPackage.NATION_PATTERN1: return createNationPattern1();
      case DmPackage.NATION_PATTERN2: return createNationPattern2();
      case DmPackage.NATION_PATTERN3: return createNationPattern3();
      case DmPackage.NATION_PATTERN4: return createNationPattern4();
      case DmPackage.NATION_PATTERN5: return createNationPattern5();
      case DmPackage.NATION_INST1: return createNationInst1();
      case DmPackage.NATION_INST2: return createNationInst2();
      case DmPackage.NATION_INST3: return createNationInst3();
      case DmPackage.NATION_INST4: return createNationInst4();
      case DmPackage.NATION_INST5: return createNationInst5();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dom3Mod createDom3Mod()
  {
    Dom3ModImpl dom3Mod = new Dom3ModImpl();
    return dom3Mod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Armor createArmor()
  {
    ArmorImpl armor = new ArmorImpl();
    return armor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectArmorById createSelectArmorById()
  {
    SelectArmorByIdImpl selectArmorById = new SelectArmorByIdImpl();
    return selectArmorById;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectArmorByName createSelectArmorByName()
  {
    SelectArmorByNameImpl selectArmorByName = new SelectArmorByNameImpl();
    return selectArmorByName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewArmor createNewArmor()
  {
    NewArmorImpl newArmor = new NewArmorImpl();
    return newArmor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArmorMods createArmorMods()
  {
    ArmorModsImpl armorMods = new ArmorModsImpl();
    return armorMods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArmorPattern1 createArmorPattern1()
  {
    ArmorPattern1Impl armorPattern1 = new ArmorPattern1Impl();
    return armorPattern1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArmorPattern2 createArmorPattern2()
  {
    ArmorPattern2Impl armorPattern2 = new ArmorPattern2Impl();
    return armorPattern2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArmorInst1 createArmorInst1()
  {
    ArmorInst1Impl armorInst1 = new ArmorInst1Impl();
    return armorInst1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArmorInst2 createArmorInst2()
  {
    ArmorInst2Impl armorInst2 = new ArmorInst2Impl();
    return armorInst2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Weapon createWeapon()
  {
    WeaponImpl weapon = new WeaponImpl();
    return weapon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectWeaponById createSelectWeaponById()
  {
    SelectWeaponByIdImpl selectWeaponById = new SelectWeaponByIdImpl();
    return selectWeaponById;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectWeaponByName createSelectWeaponByName()
  {
    SelectWeaponByNameImpl selectWeaponByName = new SelectWeaponByNameImpl();
    return selectWeaponByName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewWeapon createNewWeapon()
  {
    NewWeaponImpl newWeapon = new NewWeaponImpl();
    return newWeapon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeaponMods createWeaponMods()
  {
    WeaponModsImpl weaponMods = new WeaponModsImpl();
    return weaponMods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeaponPattern1 createWeaponPattern1()
  {
    WeaponPattern1Impl weaponPattern1 = new WeaponPattern1Impl();
    return weaponPattern1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeaponPattern2 createWeaponPattern2()
  {
    WeaponPattern2Impl weaponPattern2 = new WeaponPattern2Impl();
    return weaponPattern2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeaponPattern3 createWeaponPattern3()
  {
    WeaponPattern3Impl weaponPattern3 = new WeaponPattern3Impl();
    return weaponPattern3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeaponPattern4 createWeaponPattern4()
  {
    WeaponPattern4Impl weaponPattern4 = new WeaponPattern4Impl();
    return weaponPattern4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeaponInst1 createWeaponInst1()
  {
    WeaponInst1Impl weaponInst1 = new WeaponInst1Impl();
    return weaponInst1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeaponInst2 createWeaponInst2()
  {
    WeaponInst2Impl weaponInst2 = new WeaponInst2Impl();
    return weaponInst2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeaponInst3 createWeaponInst3()
  {
    WeaponInst3Impl weaponInst3 = new WeaponInst3Impl();
    return weaponInst3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeaponInst4 createWeaponInst4()
  {
    WeaponInst4Impl weaponInst4 = new WeaponInst4Impl();
    return weaponInst4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Monster createMonster()
  {
    MonsterImpl monster = new MonsterImpl();
    return monster;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectMonsterById createSelectMonsterById()
  {
    SelectMonsterByIdImpl selectMonsterById = new SelectMonsterByIdImpl();
    return selectMonsterById;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectMonsterByName createSelectMonsterByName()
  {
    SelectMonsterByNameImpl selectMonsterByName = new SelectMonsterByNameImpl();
    return selectMonsterByName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewMonster createNewMonster()
  {
    NewMonsterImpl newMonster = new NewMonsterImpl();
    return newMonster;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonsterMods createMonsterMods()
  {
    MonsterModsImpl monsterMods = new MonsterModsImpl();
    return monsterMods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonsterPattern1 createMonsterPattern1()
  {
    MonsterPattern1Impl monsterPattern1 = new MonsterPattern1Impl();
    return monsterPattern1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonsterPattern2 createMonsterPattern2()
  {
    MonsterPattern2Impl monsterPattern2 = new MonsterPattern2Impl();
    return monsterPattern2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonsterPattern3 createMonsterPattern3()
  {
    MonsterPattern3Impl monsterPattern3 = new MonsterPattern3Impl();
    return monsterPattern3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonsterPattern4 createMonsterPattern4()
  {
    MonsterPattern4Impl monsterPattern4 = new MonsterPattern4Impl();
    return monsterPattern4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonsterPattern5 createMonsterPattern5()
  {
    MonsterPattern5Impl monsterPattern5 = new MonsterPattern5Impl();
    return monsterPattern5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonsterPattern6 createMonsterPattern6()
  {
    MonsterPattern6Impl monsterPattern6 = new MonsterPattern6Impl();
    return monsterPattern6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonsterInst1 createMonsterInst1()
  {
    MonsterInst1Impl monsterInst1 = new MonsterInst1Impl();
    return monsterInst1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonsterInst2 createMonsterInst2()
  {
    MonsterInst2Impl monsterInst2 = new MonsterInst2Impl();
    return monsterInst2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonsterInst3 createMonsterInst3()
  {
    MonsterInst3Impl monsterInst3 = new MonsterInst3Impl();
    return monsterInst3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonsterInst4 createMonsterInst4()
  {
    MonsterInst4Impl monsterInst4 = new MonsterInst4Impl();
    return monsterInst4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonsterInst5 createMonsterInst5()
  {
    MonsterInst5Impl monsterInst5 = new MonsterInst5Impl();
    return monsterInst5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonsterInst6 createMonsterInst6()
  {
    MonsterInst6Impl monsterInst6 = new MonsterInst6Impl();
    return monsterInst6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Spell createSpell()
  {
    SpellImpl spell = new SpellImpl();
    return spell;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectSpellById createSelectSpellById()
  {
    SelectSpellByIdImpl selectSpellById = new SelectSpellByIdImpl();
    return selectSpellById;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectSpellByName createSelectSpellByName()
  {
    SelectSpellByNameImpl selectSpellByName = new SelectSpellByNameImpl();
    return selectSpellByName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewSpell createNewSpell()
  {
    NewSpellImpl newSpell = new NewSpellImpl();
    return newSpell;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpellMods createSpellMods()
  {
    SpellModsImpl spellMods = new SpellModsImpl();
    return spellMods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpellPattern1 createSpellPattern1()
  {
    SpellPattern1Impl spellPattern1 = new SpellPattern1Impl();
    return spellPattern1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpellPattern2 createSpellPattern2()
  {
    SpellPattern2Impl spellPattern2 = new SpellPattern2Impl();
    return spellPattern2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpellPattern3 createSpellPattern3()
  {
    SpellPattern3Impl spellPattern3 = new SpellPattern3Impl();
    return spellPattern3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpellPattern4 createSpellPattern4()
  {
    SpellPattern4Impl spellPattern4 = new SpellPattern4Impl();
    return spellPattern4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpellPattern5 createSpellPattern5()
  {
    SpellPattern5Impl spellPattern5 = new SpellPattern5Impl();
    return spellPattern5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpellInst1 createSpellInst1()
  {
    SpellInst1Impl spellInst1 = new SpellInst1Impl();
    return spellInst1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpellInst2 createSpellInst2()
  {
    SpellInst2Impl spellInst2 = new SpellInst2Impl();
    return spellInst2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpellInst3 createSpellInst3()
  {
    SpellInst3Impl spellInst3 = new SpellInst3Impl();
    return spellInst3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpellInst4 createSpellInst4()
  {
    SpellInst4Impl spellInst4 = new SpellInst4Impl();
    return spellInst4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpellInst5 createSpellInst5()
  {
    SpellInst5Impl spellInst5 = new SpellInst5Impl();
    return spellInst5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Item createItem()
  {
    ItemImpl item = new ItemImpl();
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectItemById createSelectItemById()
  {
    SelectItemByIdImpl selectItemById = new SelectItemByIdImpl();
    return selectItemById;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectItemByName createSelectItemByName()
  {
    SelectItemByNameImpl selectItemByName = new SelectItemByNameImpl();
    return selectItemByName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewItem createNewItem()
  {
    NewItemImpl newItem = new NewItemImpl();
    return newItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemMods createItemMods()
  {
    ItemModsImpl itemMods = new ItemModsImpl();
    return itemMods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemPattern1 createItemPattern1()
  {
    ItemPattern1Impl itemPattern1 = new ItemPattern1Impl();
    return itemPattern1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemPattern2 createItemPattern2()
  {
    ItemPattern2Impl itemPattern2 = new ItemPattern2Impl();
    return itemPattern2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemInst1 createItemInst1()
  {
    ItemInst1Impl itemInst1 = new ItemInst1Impl();
    return itemInst1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemInst2 createItemInst2()
  {
    ItemInst2Impl itemInst2 = new ItemInst2Impl();
    return itemInst2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name createName()
  {
    NameImpl name = new NameImpl();
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectName createSelectName()
  {
    SelectNameImpl selectName = new SelectNameImpl();
    return selectName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameMods createNameMods()
  {
    NameModsImpl nameMods = new NameModsImpl();
    return nameMods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamePattern1 createNamePattern1()
  {
    NamePattern1Impl namePattern1 = new NamePattern1Impl();
    return namePattern1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamePattern2 createNamePattern2()
  {
    NamePattern2Impl namePattern2 = new NamePattern2Impl();
    return namePattern2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameInst1 createNameInst1()
  {
    NameInst1Impl nameInst1 = new NameInst1Impl();
    return nameInst1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameInst2 createNameInst2()
  {
    NameInst2Impl nameInst2 = new NameInst2Impl();
    return nameInst2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Site createSite()
  {
    SiteImpl site = new SiteImpl();
    return site;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectSiteById createSelectSiteById()
  {
    SelectSiteByIdImpl selectSiteById = new SelectSiteByIdImpl();
    return selectSiteById;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectSiteByName createSelectSiteByName()
  {
    SelectSiteByNameImpl selectSiteByName = new SelectSiteByNameImpl();
    return selectSiteByName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewSite createNewSite()
  {
    NewSiteImpl newSite = new NewSiteImpl();
    return newSite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SiteMods createSiteMods()
  {
    SiteModsImpl siteMods = new SiteModsImpl();
    return siteMods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SitePattern1 createSitePattern1()
  {
    SitePattern1Impl sitePattern1 = new SitePattern1Impl();
    return sitePattern1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SitePattern2 createSitePattern2()
  {
    SitePattern2Impl sitePattern2 = new SitePattern2Impl();
    return sitePattern2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SitePattern3 createSitePattern3()
  {
    SitePattern3Impl sitePattern3 = new SitePattern3Impl();
    return sitePattern3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SitePattern4 createSitePattern4()
  {
    SitePattern4Impl sitePattern4 = new SitePattern4Impl();
    return sitePattern4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SiteInst1 createSiteInst1()
  {
    SiteInst1Impl siteInst1 = new SiteInst1Impl();
    return siteInst1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SiteInst2 createSiteInst2()
  {
    SiteInst2Impl siteInst2 = new SiteInst2Impl();
    return siteInst2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SiteInst3 createSiteInst3()
  {
    SiteInst3Impl siteInst3 = new SiteInst3Impl();
    return siteInst3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SiteInst4 createSiteInst4()
  {
    SiteInst4Impl siteInst4 = new SiteInst4Impl();
    return siteInst4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Nation createNation()
  {
    NationImpl nation = new NationImpl();
    return nation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectNation createSelectNation()
  {
    SelectNationImpl selectNation = new SelectNationImpl();
    return selectNation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndepFlag createIndepFlag()
  {
    IndepFlagImpl indepFlag = new IndepFlagImpl();
    return indepFlag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NationMods createNationMods()
  {
    NationModsImpl nationMods = new NationModsImpl();
    return nationMods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NationPattern1 createNationPattern1()
  {
    NationPattern1Impl nationPattern1 = new NationPattern1Impl();
    return nationPattern1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NationPattern2 createNationPattern2()
  {
    NationPattern2Impl nationPattern2 = new NationPattern2Impl();
    return nationPattern2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NationPattern3 createNationPattern3()
  {
    NationPattern3Impl nationPattern3 = new NationPattern3Impl();
    return nationPattern3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NationPattern4 createNationPattern4()
  {
    NationPattern4Impl nationPattern4 = new NationPattern4Impl();
    return nationPattern4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NationPattern5 createNationPattern5()
  {
    NationPattern5Impl nationPattern5 = new NationPattern5Impl();
    return nationPattern5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NationInst1 createNationInst1()
  {
    NationInst1Impl nationInst1 = new NationInst1Impl();
    return nationInst1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NationInst2 createNationInst2()
  {
    NationInst2Impl nationInst2 = new NationInst2Impl();
    return nationInst2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NationInst3 createNationInst3()
  {
    NationInst3Impl nationInst3 = new NationInst3Impl();
    return nationInst3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NationInst4 createNationInst4()
  {
    NationInst4Impl nationInst4 = new NationInst4Impl();
    return nationInst4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NationInst5 createNationInst5()
  {
    NationInst5Impl nationInst5 = new NationInst5Impl();
    return nationInst5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DmPackage getDmPackage()
  {
    return (DmPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DmPackage getPackage()
  {
    return DmPackage.eINSTANCE;
  }

} //DmFactoryImpl
