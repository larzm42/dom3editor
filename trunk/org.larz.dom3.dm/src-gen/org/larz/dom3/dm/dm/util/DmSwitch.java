/**
 * <copyright>
 * </copyright>
 *
 */
package org.larz.dom3.dm.dm.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.larz.dom3.dm.dm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.larz.dom3.dm.dm.DmPackage
 * @generated
 */
public class DmSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DmPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DmSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DmPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DmPackage.DOM3_MOD:
      {
        Dom3Mod dom3Mod = (Dom3Mod)theEObject;
        T result = caseDom3Mod(dom3Mod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.ABSTRACT_ELEMENT:
      {
        AbstractElement abstractElement = (AbstractElement)theEObject;
        T result = caseAbstractElement(abstractElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.GENERAL:
      {
        General general = (General)theEObject;
        T result = caseGeneral(general);
        if (result == null) result = caseAbstractElement(general);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.GENERAL_PATTERN1:
      {
        GeneralPattern1 generalPattern1 = (GeneralPattern1)theEObject;
        T result = caseGeneralPattern1(generalPattern1);
        if (result == null) result = caseGeneral(generalPattern1);
        if (result == null) result = caseAbstractElement(generalPattern1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.GENERAL_INST1:
      {
        GeneralInst1 generalInst1 = (GeneralInst1)theEObject;
        T result = caseGeneralInst1(generalInst1);
        if (result == null) result = caseGeneralPattern1(generalInst1);
        if (result == null) result = caseGeneral(generalInst1);
        if (result == null) result = caseAbstractElement(generalInst1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.ARMOR:
      {
        Armor armor = (Armor)theEObject;
        T result = caseArmor(armor);
        if (result == null) result = caseAbstractElement(armor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SELECT_ARMOR_BY_ID:
      {
        SelectArmorById selectArmorById = (SelectArmorById)theEObject;
        T result = caseSelectArmorById(selectArmorById);
        if (result == null) result = caseArmor(selectArmorById);
        if (result == null) result = caseAbstractElement(selectArmorById);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SELECT_ARMOR_BY_NAME:
      {
        SelectArmorByName selectArmorByName = (SelectArmorByName)theEObject;
        T result = caseSelectArmorByName(selectArmorByName);
        if (result == null) result = caseArmor(selectArmorByName);
        if (result == null) result = caseAbstractElement(selectArmorByName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.NEW_ARMOR:
      {
        NewArmor newArmor = (NewArmor)theEObject;
        T result = caseNewArmor(newArmor);
        if (result == null) result = caseArmor(newArmor);
        if (result == null) result = caseAbstractElement(newArmor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.ARMOR_MODS:
      {
        ArmorMods armorMods = (ArmorMods)theEObject;
        T result = caseArmorMods(armorMods);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.ARMOR_PATTERN1:
      {
        ArmorPattern1 armorPattern1 = (ArmorPattern1)theEObject;
        T result = caseArmorPattern1(armorPattern1);
        if (result == null) result = caseArmorMods(armorPattern1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.ARMOR_PATTERN2:
      {
        ArmorPattern2 armorPattern2 = (ArmorPattern2)theEObject;
        T result = caseArmorPattern2(armorPattern2);
        if (result == null) result = caseArmorMods(armorPattern2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.ARMOR_INST1:
      {
        ArmorInst1 armorInst1 = (ArmorInst1)theEObject;
        T result = caseArmorInst1(armorInst1);
        if (result == null) result = caseArmorPattern1(armorInst1);
        if (result == null) result = caseArmorMods(armorInst1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.ARMOR_INST2:
      {
        ArmorInst2 armorInst2 = (ArmorInst2)theEObject;
        T result = caseArmorInst2(armorInst2);
        if (result == null) result = caseArmorPattern2(armorInst2);
        if (result == null) result = caseArmorMods(armorInst2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.WEAPON:
      {
        Weapon weapon = (Weapon)theEObject;
        T result = caseWeapon(weapon);
        if (result == null) result = caseAbstractElement(weapon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SELECT_WEAPON_BY_ID:
      {
        SelectWeaponById selectWeaponById = (SelectWeaponById)theEObject;
        T result = caseSelectWeaponById(selectWeaponById);
        if (result == null) result = caseWeapon(selectWeaponById);
        if (result == null) result = caseAbstractElement(selectWeaponById);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SELECT_WEAPON_BY_NAME:
      {
        SelectWeaponByName selectWeaponByName = (SelectWeaponByName)theEObject;
        T result = caseSelectWeaponByName(selectWeaponByName);
        if (result == null) result = caseWeapon(selectWeaponByName);
        if (result == null) result = caseAbstractElement(selectWeaponByName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.NEW_WEAPON:
      {
        NewWeapon newWeapon = (NewWeapon)theEObject;
        T result = caseNewWeapon(newWeapon);
        if (result == null) result = caseWeapon(newWeapon);
        if (result == null) result = caseAbstractElement(newWeapon);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.WEAPON_MODS:
      {
        WeaponMods weaponMods = (WeaponMods)theEObject;
        T result = caseWeaponMods(weaponMods);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.WEAPON_PATTERN1:
      {
        WeaponPattern1 weaponPattern1 = (WeaponPattern1)theEObject;
        T result = caseWeaponPattern1(weaponPattern1);
        if (result == null) result = caseWeaponMods(weaponPattern1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.WEAPON_PATTERN2:
      {
        WeaponPattern2 weaponPattern2 = (WeaponPattern2)theEObject;
        T result = caseWeaponPattern2(weaponPattern2);
        if (result == null) result = caseWeaponMods(weaponPattern2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.WEAPON_PATTERN3:
      {
        WeaponPattern3 weaponPattern3 = (WeaponPattern3)theEObject;
        T result = caseWeaponPattern3(weaponPattern3);
        if (result == null) result = caseWeaponMods(weaponPattern3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.WEAPON_PATTERN4:
      {
        WeaponPattern4 weaponPattern4 = (WeaponPattern4)theEObject;
        T result = caseWeaponPattern4(weaponPattern4);
        if (result == null) result = caseWeaponMods(weaponPattern4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.WEAPON_INST1:
      {
        WeaponInst1 weaponInst1 = (WeaponInst1)theEObject;
        T result = caseWeaponInst1(weaponInst1);
        if (result == null) result = caseWeaponPattern1(weaponInst1);
        if (result == null) result = caseWeaponMods(weaponInst1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.WEAPON_INST2:
      {
        WeaponInst2 weaponInst2 = (WeaponInst2)theEObject;
        T result = caseWeaponInst2(weaponInst2);
        if (result == null) result = caseWeaponPattern2(weaponInst2);
        if (result == null) result = caseWeaponMods(weaponInst2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.WEAPON_INST3:
      {
        WeaponInst3 weaponInst3 = (WeaponInst3)theEObject;
        T result = caseWeaponInst3(weaponInst3);
        if (result == null) result = caseWeaponPattern3(weaponInst3);
        if (result == null) result = caseWeaponMods(weaponInst3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.WEAPON_INST4:
      {
        WeaponInst4 weaponInst4 = (WeaponInst4)theEObject;
        T result = caseWeaponInst4(weaponInst4);
        if (result == null) result = caseWeaponPattern4(weaponInst4);
        if (result == null) result = caseWeaponMods(weaponInst4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.MONSTER:
      {
        Monster monster = (Monster)theEObject;
        T result = caseMonster(monster);
        if (result == null) result = caseAbstractElement(monster);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SELECT_MONSTER_BY_ID:
      {
        SelectMonsterById selectMonsterById = (SelectMonsterById)theEObject;
        T result = caseSelectMonsterById(selectMonsterById);
        if (result == null) result = caseMonster(selectMonsterById);
        if (result == null) result = caseAbstractElement(selectMonsterById);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SELECT_MONSTER_BY_NAME:
      {
        SelectMonsterByName selectMonsterByName = (SelectMonsterByName)theEObject;
        T result = caseSelectMonsterByName(selectMonsterByName);
        if (result == null) result = caseMonster(selectMonsterByName);
        if (result == null) result = caseAbstractElement(selectMonsterByName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.NEW_MONSTER:
      {
        NewMonster newMonster = (NewMonster)theEObject;
        T result = caseNewMonster(newMonster);
        if (result == null) result = caseMonster(newMonster);
        if (result == null) result = caseAbstractElement(newMonster);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.MONSTER_MODS:
      {
        MonsterMods monsterMods = (MonsterMods)theEObject;
        T result = caseMonsterMods(monsterMods);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.MONSTER_PATTERN1:
      {
        MonsterPattern1 monsterPattern1 = (MonsterPattern1)theEObject;
        T result = caseMonsterPattern1(monsterPattern1);
        if (result == null) result = caseMonsterMods(monsterPattern1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.MONSTER_PATTERN2:
      {
        MonsterPattern2 monsterPattern2 = (MonsterPattern2)theEObject;
        T result = caseMonsterPattern2(monsterPattern2);
        if (result == null) result = caseMonsterMods(monsterPattern2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.MONSTER_PATTERN3:
      {
        MonsterPattern3 monsterPattern3 = (MonsterPattern3)theEObject;
        T result = caseMonsterPattern3(monsterPattern3);
        if (result == null) result = caseMonsterMods(monsterPattern3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.MONSTER_PATTERN4:
      {
        MonsterPattern4 monsterPattern4 = (MonsterPattern4)theEObject;
        T result = caseMonsterPattern4(monsterPattern4);
        if (result == null) result = caseMonsterMods(monsterPattern4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.MONSTER_PATTERN5:
      {
        MonsterPattern5 monsterPattern5 = (MonsterPattern5)theEObject;
        T result = caseMonsterPattern5(monsterPattern5);
        if (result == null) result = caseMonsterMods(monsterPattern5);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.MONSTER_PATTERN6:
      {
        MonsterPattern6 monsterPattern6 = (MonsterPattern6)theEObject;
        T result = caseMonsterPattern6(monsterPattern6);
        if (result == null) result = caseMonsterMods(monsterPattern6);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.MONSTER_INST1:
      {
        MonsterInst1 monsterInst1 = (MonsterInst1)theEObject;
        T result = caseMonsterInst1(monsterInst1);
        if (result == null) result = caseMonsterPattern1(monsterInst1);
        if (result == null) result = caseMonsterMods(monsterInst1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.MONSTER_INST2:
      {
        MonsterInst2 monsterInst2 = (MonsterInst2)theEObject;
        T result = caseMonsterInst2(monsterInst2);
        if (result == null) result = caseMonsterPattern2(monsterInst2);
        if (result == null) result = caseMonsterMods(monsterInst2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.MONSTER_INST3:
      {
        MonsterInst3 monsterInst3 = (MonsterInst3)theEObject;
        T result = caseMonsterInst3(monsterInst3);
        if (result == null) result = caseMonsterPattern3(monsterInst3);
        if (result == null) result = caseMonsterMods(monsterInst3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.MONSTER_INST4:
      {
        MonsterInst4 monsterInst4 = (MonsterInst4)theEObject;
        T result = caseMonsterInst4(monsterInst4);
        if (result == null) result = caseMonsterPattern4(monsterInst4);
        if (result == null) result = caseMonsterMods(monsterInst4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.MONSTER_INST5:
      {
        MonsterInst5 monsterInst5 = (MonsterInst5)theEObject;
        T result = caseMonsterInst5(monsterInst5);
        if (result == null) result = caseMonsterPattern5(monsterInst5);
        if (result == null) result = caseMonsterMods(monsterInst5);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.MONSTER_INST6:
      {
        MonsterInst6 monsterInst6 = (MonsterInst6)theEObject;
        T result = caseMonsterInst6(monsterInst6);
        if (result == null) result = caseMonsterPattern6(monsterInst6);
        if (result == null) result = caseMonsterMods(monsterInst6);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SPELL:
      {
        Spell spell = (Spell)theEObject;
        T result = caseSpell(spell);
        if (result == null) result = caseAbstractElement(spell);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SELECT_SPELL_BY_ID:
      {
        SelectSpellById selectSpellById = (SelectSpellById)theEObject;
        T result = caseSelectSpellById(selectSpellById);
        if (result == null) result = caseSpell(selectSpellById);
        if (result == null) result = caseAbstractElement(selectSpellById);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SELECT_SPELL_BY_NAME:
      {
        SelectSpellByName selectSpellByName = (SelectSpellByName)theEObject;
        T result = caseSelectSpellByName(selectSpellByName);
        if (result == null) result = caseSpell(selectSpellByName);
        if (result == null) result = caseAbstractElement(selectSpellByName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.NEW_SPELL:
      {
        NewSpell newSpell = (NewSpell)theEObject;
        T result = caseNewSpell(newSpell);
        if (result == null) result = caseSpell(newSpell);
        if (result == null) result = caseAbstractElement(newSpell);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SPELL_MODS:
      {
        SpellMods spellMods = (SpellMods)theEObject;
        T result = caseSpellMods(spellMods);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SPELL_PATTERN1:
      {
        SpellPattern1 spellPattern1 = (SpellPattern1)theEObject;
        T result = caseSpellPattern1(spellPattern1);
        if (result == null) result = caseSpellMods(spellPattern1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SPELL_PATTERN2:
      {
        SpellPattern2 spellPattern2 = (SpellPattern2)theEObject;
        T result = caseSpellPattern2(spellPattern2);
        if (result == null) result = caseSpellMods(spellPattern2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SPELL_PATTERN3:
      {
        SpellPattern3 spellPattern3 = (SpellPattern3)theEObject;
        T result = caseSpellPattern3(spellPattern3);
        if (result == null) result = caseSpellMods(spellPattern3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SPELL_PATTERN4:
      {
        SpellPattern4 spellPattern4 = (SpellPattern4)theEObject;
        T result = caseSpellPattern4(spellPattern4);
        if (result == null) result = caseSpellMods(spellPattern4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SPELL_PATTERN5:
      {
        SpellPattern5 spellPattern5 = (SpellPattern5)theEObject;
        T result = caseSpellPattern5(spellPattern5);
        if (result == null) result = caseSpellMods(spellPattern5);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SPELL_INST1:
      {
        SpellInst1 spellInst1 = (SpellInst1)theEObject;
        T result = caseSpellInst1(spellInst1);
        if (result == null) result = caseSpellPattern1(spellInst1);
        if (result == null) result = caseSpellMods(spellInst1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SPELL_INST2:
      {
        SpellInst2 spellInst2 = (SpellInst2)theEObject;
        T result = caseSpellInst2(spellInst2);
        if (result == null) result = caseSpellPattern2(spellInst2);
        if (result == null) result = caseSpellMods(spellInst2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SPELL_INST3:
      {
        SpellInst3 spellInst3 = (SpellInst3)theEObject;
        T result = caseSpellInst3(spellInst3);
        if (result == null) result = caseSpellPattern3(spellInst3);
        if (result == null) result = caseSpellMods(spellInst3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SPELL_INST4:
      {
        SpellInst4 spellInst4 = (SpellInst4)theEObject;
        T result = caseSpellInst4(spellInst4);
        if (result == null) result = caseSpellPattern4(spellInst4);
        if (result == null) result = caseSpellMods(spellInst4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SPELL_INST5:
      {
        SpellInst5 spellInst5 = (SpellInst5)theEObject;
        T result = caseSpellInst5(spellInst5);
        if (result == null) result = caseSpellPattern5(spellInst5);
        if (result == null) result = caseSpellMods(spellInst5);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.ITEM:
      {
        Item item = (Item)theEObject;
        T result = caseItem(item);
        if (result == null) result = caseAbstractElement(item);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SELECT_ITEM_BY_ID:
      {
        SelectItemById selectItemById = (SelectItemById)theEObject;
        T result = caseSelectItemById(selectItemById);
        if (result == null) result = caseItem(selectItemById);
        if (result == null) result = caseAbstractElement(selectItemById);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SELECT_ITEM_BY_NAME:
      {
        SelectItemByName selectItemByName = (SelectItemByName)theEObject;
        T result = caseSelectItemByName(selectItemByName);
        if (result == null) result = caseItem(selectItemByName);
        if (result == null) result = caseAbstractElement(selectItemByName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.NEW_ITEM:
      {
        NewItem newItem = (NewItem)theEObject;
        T result = caseNewItem(newItem);
        if (result == null) result = caseItem(newItem);
        if (result == null) result = caseAbstractElement(newItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.ITEM_MODS:
      {
        ItemMods itemMods = (ItemMods)theEObject;
        T result = caseItemMods(itemMods);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.ITEM_PATTERN1:
      {
        ItemPattern1 itemPattern1 = (ItemPattern1)theEObject;
        T result = caseItemPattern1(itemPattern1);
        if (result == null) result = caseItemMods(itemPattern1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.ITEM_PATTERN2:
      {
        ItemPattern2 itemPattern2 = (ItemPattern2)theEObject;
        T result = caseItemPattern2(itemPattern2);
        if (result == null) result = caseItemMods(itemPattern2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.ITEM_PATTERN3:
      {
        ItemPattern3 itemPattern3 = (ItemPattern3)theEObject;
        T result = caseItemPattern3(itemPattern3);
        if (result == null) result = caseItemMods(itemPattern3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.ITEM_INST1:
      {
        ItemInst1 itemInst1 = (ItemInst1)theEObject;
        T result = caseItemInst1(itemInst1);
        if (result == null) result = caseItemPattern1(itemInst1);
        if (result == null) result = caseItemMods(itemInst1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.ITEM_INST2:
      {
        ItemInst2 itemInst2 = (ItemInst2)theEObject;
        T result = caseItemInst2(itemInst2);
        if (result == null) result = caseItemPattern2(itemInst2);
        if (result == null) result = caseItemMods(itemInst2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.ITEM_INST3:
      {
        ItemInst3 itemInst3 = (ItemInst3)theEObject;
        T result = caseItemInst3(itemInst3);
        if (result == null) result = caseItemPattern3(itemInst3);
        if (result == null) result = caseItemMods(itemInst3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.NAME:
      {
        Name name = (Name)theEObject;
        T result = caseName(name);
        if (result == null) result = caseAbstractElement(name);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SELECT_NAME:
      {
        SelectName selectName = (SelectName)theEObject;
        T result = caseSelectName(selectName);
        if (result == null) result = caseName(selectName);
        if (result == null) result = caseAbstractElement(selectName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.NAME_MODS:
      {
        NameMods nameMods = (NameMods)theEObject;
        T result = caseNameMods(nameMods);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.NAME_PATTERN1:
      {
        NamePattern1 namePattern1 = (NamePattern1)theEObject;
        T result = caseNamePattern1(namePattern1);
        if (result == null) result = caseNameMods(namePattern1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.NAME_PATTERN2:
      {
        NamePattern2 namePattern2 = (NamePattern2)theEObject;
        T result = caseNamePattern2(namePattern2);
        if (result == null) result = caseNameMods(namePattern2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.NAME_INST1:
      {
        NameInst1 nameInst1 = (NameInst1)theEObject;
        T result = caseNameInst1(nameInst1);
        if (result == null) result = caseNamePattern1(nameInst1);
        if (result == null) result = caseNameMods(nameInst1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.NAME_INST2:
      {
        NameInst2 nameInst2 = (NameInst2)theEObject;
        T result = caseNameInst2(nameInst2);
        if (result == null) result = caseNamePattern2(nameInst2);
        if (result == null) result = caseNameMods(nameInst2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SITE:
      {
        Site site = (Site)theEObject;
        T result = caseSite(site);
        if (result == null) result = caseAbstractElement(site);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SELECT_SITE_BY_ID:
      {
        SelectSiteById selectSiteById = (SelectSiteById)theEObject;
        T result = caseSelectSiteById(selectSiteById);
        if (result == null) result = caseSite(selectSiteById);
        if (result == null) result = caseAbstractElement(selectSiteById);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SELECT_SITE_BY_NAME:
      {
        SelectSiteByName selectSiteByName = (SelectSiteByName)theEObject;
        T result = caseSelectSiteByName(selectSiteByName);
        if (result == null) result = caseSite(selectSiteByName);
        if (result == null) result = caseAbstractElement(selectSiteByName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.NEW_SITE:
      {
        NewSite newSite = (NewSite)theEObject;
        T result = caseNewSite(newSite);
        if (result == null) result = caseSite(newSite);
        if (result == null) result = caseAbstractElement(newSite);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SITE_MODS:
      {
        SiteMods siteMods = (SiteMods)theEObject;
        T result = caseSiteMods(siteMods);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SITE_PATTERN1:
      {
        SitePattern1 sitePattern1 = (SitePattern1)theEObject;
        T result = caseSitePattern1(sitePattern1);
        if (result == null) result = caseSiteMods(sitePattern1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SITE_PATTERN2:
      {
        SitePattern2 sitePattern2 = (SitePattern2)theEObject;
        T result = caseSitePattern2(sitePattern2);
        if (result == null) result = caseSiteMods(sitePattern2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SITE_PATTERN3:
      {
        SitePattern3 sitePattern3 = (SitePattern3)theEObject;
        T result = caseSitePattern3(sitePattern3);
        if (result == null) result = caseSiteMods(sitePattern3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SITE_PATTERN4:
      {
        SitePattern4 sitePattern4 = (SitePattern4)theEObject;
        T result = caseSitePattern4(sitePattern4);
        if (result == null) result = caseSiteMods(sitePattern4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SITE_INST1:
      {
        SiteInst1 siteInst1 = (SiteInst1)theEObject;
        T result = caseSiteInst1(siteInst1);
        if (result == null) result = caseSitePattern1(siteInst1);
        if (result == null) result = caseSiteMods(siteInst1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SITE_INST2:
      {
        SiteInst2 siteInst2 = (SiteInst2)theEObject;
        T result = caseSiteInst2(siteInst2);
        if (result == null) result = caseSitePattern2(siteInst2);
        if (result == null) result = caseSiteMods(siteInst2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SITE_INST3:
      {
        SiteInst3 siteInst3 = (SiteInst3)theEObject;
        T result = caseSiteInst3(siteInst3);
        if (result == null) result = caseSitePattern3(siteInst3);
        if (result == null) result = caseSiteMods(siteInst3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SITE_INST4:
      {
        SiteInst4 siteInst4 = (SiteInst4)theEObject;
        T result = caseSiteInst4(siteInst4);
        if (result == null) result = caseSitePattern4(siteInst4);
        if (result == null) result = caseSiteMods(siteInst4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.NATION:
      {
        Nation nation = (Nation)theEObject;
        T result = caseNation(nation);
        if (result == null) result = caseAbstractElement(nation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.SELECT_NATION:
      {
        SelectNation selectNation = (SelectNation)theEObject;
        T result = caseSelectNation(selectNation);
        if (result == null) result = caseNation(selectNation);
        if (result == null) result = caseAbstractElement(selectNation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.INDEP_FLAG:
      {
        IndepFlag indepFlag = (IndepFlag)theEObject;
        T result = caseIndepFlag(indepFlag);
        if (result == null) result = caseNation(indepFlag);
        if (result == null) result = caseAbstractElement(indepFlag);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.NATION_MODS:
      {
        NationMods nationMods = (NationMods)theEObject;
        T result = caseNationMods(nationMods);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.NATION_PATTERN1:
      {
        NationPattern1 nationPattern1 = (NationPattern1)theEObject;
        T result = caseNationPattern1(nationPattern1);
        if (result == null) result = caseNationMods(nationPattern1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.NATION_PATTERN2:
      {
        NationPattern2 nationPattern2 = (NationPattern2)theEObject;
        T result = caseNationPattern2(nationPattern2);
        if (result == null) result = caseNationMods(nationPattern2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.NATION_PATTERN3:
      {
        NationPattern3 nationPattern3 = (NationPattern3)theEObject;
        T result = caseNationPattern3(nationPattern3);
        if (result == null) result = caseNationMods(nationPattern3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.NATION_PATTERN4:
      {
        NationPattern4 nationPattern4 = (NationPattern4)theEObject;
        T result = caseNationPattern4(nationPattern4);
        if (result == null) result = caseNationMods(nationPattern4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.NATION_PATTERN5:
      {
        NationPattern5 nationPattern5 = (NationPattern5)theEObject;
        T result = caseNationPattern5(nationPattern5);
        if (result == null) result = caseNationMods(nationPattern5);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.NATION_INST1:
      {
        NationInst1 nationInst1 = (NationInst1)theEObject;
        T result = caseNationInst1(nationInst1);
        if (result == null) result = caseNationPattern1(nationInst1);
        if (result == null) result = caseNationMods(nationInst1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.NATION_INST2:
      {
        NationInst2 nationInst2 = (NationInst2)theEObject;
        T result = caseNationInst2(nationInst2);
        if (result == null) result = caseNationPattern2(nationInst2);
        if (result == null) result = caseNationMods(nationInst2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.NATION_INST3:
      {
        NationInst3 nationInst3 = (NationInst3)theEObject;
        T result = caseNationInst3(nationInst3);
        if (result == null) result = caseNationPattern3(nationInst3);
        if (result == null) result = caseNationMods(nationInst3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.NATION_INST4:
      {
        NationInst4 nationInst4 = (NationInst4)theEObject;
        T result = caseNationInst4(nationInst4);
        if (result == null) result = caseNationPattern4(nationInst4);
        if (result == null) result = caseNationMods(nationInst4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmPackage.NATION_INST5:
      {
        NationInst5 nationInst5 = (NationInst5)theEObject;
        T result = caseNationInst5(nationInst5);
        if (result == null) result = caseNationPattern5(nationInst5);
        if (result == null) result = caseNationMods(nationInst5);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dom3 Mod</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dom3 Mod</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDom3Mod(Dom3Mod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractElement(AbstractElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>General</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>General</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeneral(General object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>General Pattern1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>General Pattern1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeneralPattern1(GeneralPattern1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>General Inst1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>General Inst1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeneralInst1(GeneralInst1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Armor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Armor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArmor(Armor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Armor By Id</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Armor By Id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectArmorById(SelectArmorById object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Armor By Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Armor By Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectArmorByName(SelectArmorByName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>New Armor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New Armor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNewArmor(NewArmor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Armor Mods</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Armor Mods</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArmorMods(ArmorMods object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Armor Pattern1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Armor Pattern1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArmorPattern1(ArmorPattern1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Armor Pattern2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Armor Pattern2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArmorPattern2(ArmorPattern2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Armor Inst1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Armor Inst1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArmorInst1(ArmorInst1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Armor Inst2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Armor Inst2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArmorInst2(ArmorInst2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Weapon</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Weapon</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWeapon(Weapon object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Weapon By Id</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Weapon By Id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectWeaponById(SelectWeaponById object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Weapon By Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Weapon By Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectWeaponByName(SelectWeaponByName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>New Weapon</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New Weapon</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNewWeapon(NewWeapon object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Weapon Mods</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Weapon Mods</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWeaponMods(WeaponMods object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Weapon Pattern1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Weapon Pattern1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWeaponPattern1(WeaponPattern1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Weapon Pattern2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Weapon Pattern2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWeaponPattern2(WeaponPattern2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Weapon Pattern3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Weapon Pattern3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWeaponPattern3(WeaponPattern3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Weapon Pattern4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Weapon Pattern4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWeaponPattern4(WeaponPattern4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Weapon Inst1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Weapon Inst1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWeaponInst1(WeaponInst1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Weapon Inst2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Weapon Inst2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWeaponInst2(WeaponInst2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Weapon Inst3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Weapon Inst3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWeaponInst3(WeaponInst3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Weapon Inst4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Weapon Inst4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWeaponInst4(WeaponInst4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Monster</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Monster</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonster(Monster object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Monster By Id</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Monster By Id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectMonsterById(SelectMonsterById object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Monster By Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Monster By Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectMonsterByName(SelectMonsterByName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>New Monster</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New Monster</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNewMonster(NewMonster object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Monster Mods</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Monster Mods</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonsterMods(MonsterMods object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Monster Pattern1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Monster Pattern1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonsterPattern1(MonsterPattern1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Monster Pattern2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Monster Pattern2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonsterPattern2(MonsterPattern2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Monster Pattern3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Monster Pattern3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonsterPattern3(MonsterPattern3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Monster Pattern4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Monster Pattern4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonsterPattern4(MonsterPattern4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Monster Pattern5</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Monster Pattern5</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonsterPattern5(MonsterPattern5 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Monster Pattern6</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Monster Pattern6</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonsterPattern6(MonsterPattern6 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Monster Inst1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Monster Inst1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonsterInst1(MonsterInst1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Monster Inst2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Monster Inst2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonsterInst2(MonsterInst2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Monster Inst3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Monster Inst3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonsterInst3(MonsterInst3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Monster Inst4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Monster Inst4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonsterInst4(MonsterInst4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Monster Inst5</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Monster Inst5</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonsterInst5(MonsterInst5 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Monster Inst6</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Monster Inst6</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonsterInst6(MonsterInst6 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spell</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spell</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpell(Spell object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Spell By Id</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Spell By Id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectSpellById(SelectSpellById object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Spell By Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Spell By Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectSpellByName(SelectSpellByName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>New Spell</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New Spell</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNewSpell(NewSpell object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spell Mods</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spell Mods</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpellMods(SpellMods object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spell Pattern1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spell Pattern1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpellPattern1(SpellPattern1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spell Pattern2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spell Pattern2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpellPattern2(SpellPattern2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spell Pattern3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spell Pattern3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpellPattern3(SpellPattern3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spell Pattern4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spell Pattern4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpellPattern4(SpellPattern4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spell Pattern5</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spell Pattern5</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpellPattern5(SpellPattern5 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spell Inst1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spell Inst1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpellInst1(SpellInst1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spell Inst2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spell Inst2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpellInst2(SpellInst2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spell Inst3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spell Inst3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpellInst3(SpellInst3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spell Inst4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spell Inst4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpellInst4(SpellInst4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spell Inst5</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spell Inst5</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpellInst5(SpellInst5 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItem(Item object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Item By Id</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Item By Id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectItemById(SelectItemById object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Item By Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Item By Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectItemByName(SelectItemByName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>New Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNewItem(NewItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item Mods</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item Mods</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItemMods(ItemMods object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item Pattern1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item Pattern1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItemPattern1(ItemPattern1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item Pattern2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item Pattern2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItemPattern2(ItemPattern2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item Pattern3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item Pattern3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItemPattern3(ItemPattern3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item Inst1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item Inst1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItemInst1(ItemInst1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item Inst2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item Inst2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItemInst2(ItemInst2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item Inst3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item Inst3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItemInst3(ItemInst3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseName(Name object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectName(SelectName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name Mods</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Mods</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNameMods(NameMods object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name Pattern1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Pattern1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamePattern1(NamePattern1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name Pattern2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Pattern2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamePattern2(NamePattern2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name Inst1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Inst1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNameInst1(NameInst1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name Inst2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Inst2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNameInst2(NameInst2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Site</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Site</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSite(Site object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Site By Id</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Site By Id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectSiteById(SelectSiteById object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Site By Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Site By Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectSiteByName(SelectSiteByName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>New Site</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New Site</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNewSite(NewSite object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Site Mods</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Site Mods</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSiteMods(SiteMods object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Site Pattern1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Site Pattern1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSitePattern1(SitePattern1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Site Pattern2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Site Pattern2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSitePattern2(SitePattern2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Site Pattern3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Site Pattern3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSitePattern3(SitePattern3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Site Pattern4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Site Pattern4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSitePattern4(SitePattern4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Site Inst1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Site Inst1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSiteInst1(SiteInst1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Site Inst2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Site Inst2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSiteInst2(SiteInst2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Site Inst3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Site Inst3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSiteInst3(SiteInst3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Site Inst4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Site Inst4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSiteInst4(SiteInst4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNation(Nation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select Nation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select Nation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectNation(SelectNation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Indep Flag</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Indep Flag</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndepFlag(IndepFlag object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nation Mods</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nation Mods</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNationMods(NationMods object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nation Pattern1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nation Pattern1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNationPattern1(NationPattern1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nation Pattern2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nation Pattern2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNationPattern2(NationPattern2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nation Pattern3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nation Pattern3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNationPattern3(NationPattern3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nation Pattern4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nation Pattern4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNationPattern4(NationPattern4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nation Pattern5</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nation Pattern5</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNationPattern5(NationPattern5 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nation Inst1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nation Inst1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNationInst1(NationInst1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nation Inst2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nation Inst2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNationInst2(NationInst2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nation Inst3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nation Inst3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNationInst3(NationInst3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nation Inst4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nation Inst4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNationInst4(NationInst4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nation Inst5</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nation Inst5</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNationInst5(NationInst5 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DmSwitch
