/**
 * <copyright>
 * </copyright>
 *

 */
package org.larz.dom3.dm.dm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.larz.dom3.dm.dm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.larz.dom3.dm.dm.DmPackage
 * @generated
 */
public class DmAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DmPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DmAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DmPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DmSwitch<Adapter> modelSwitch =
    new DmSwitch<Adapter>()
    {
      @Override
      public Adapter caseDom3Mod(Dom3Mod object)
      {
        return createDom3ModAdapter();
      }
      @Override
      public Adapter caseAbstractElement(AbstractElement object)
      {
        return createAbstractElementAdapter();
      }
      @Override
      public Adapter caseArmor(Armor object)
      {
        return createArmorAdapter();
      }
      @Override
      public Adapter caseSelectArmorById(SelectArmorById object)
      {
        return createSelectArmorByIdAdapter();
      }
      @Override
      public Adapter caseSelectArmorByName(SelectArmorByName object)
      {
        return createSelectArmorByNameAdapter();
      }
      @Override
      public Adapter caseNewArmor(NewArmor object)
      {
        return createNewArmorAdapter();
      }
      @Override
      public Adapter caseArmorMods(ArmorMods object)
      {
        return createArmorModsAdapter();
      }
      @Override
      public Adapter caseArmorPattern1(ArmorPattern1 object)
      {
        return createArmorPattern1Adapter();
      }
      @Override
      public Adapter caseArmorPattern2(ArmorPattern2 object)
      {
        return createArmorPattern2Adapter();
      }
      @Override
      public Adapter caseArmorInst1(ArmorInst1 object)
      {
        return createArmorInst1Adapter();
      }
      @Override
      public Adapter caseArmorInst2(ArmorInst2 object)
      {
        return createArmorInst2Adapter();
      }
      @Override
      public Adapter caseWeapon(Weapon object)
      {
        return createWeaponAdapter();
      }
      @Override
      public Adapter caseSelectWeaponById(SelectWeaponById object)
      {
        return createSelectWeaponByIdAdapter();
      }
      @Override
      public Adapter caseSelectWeaponByName(SelectWeaponByName object)
      {
        return createSelectWeaponByNameAdapter();
      }
      @Override
      public Adapter caseNewWeapon(NewWeapon object)
      {
        return createNewWeaponAdapter();
      }
      @Override
      public Adapter caseWeaponMods(WeaponMods object)
      {
        return createWeaponModsAdapter();
      }
      @Override
      public Adapter caseWeaponPattern1(WeaponPattern1 object)
      {
        return createWeaponPattern1Adapter();
      }
      @Override
      public Adapter caseWeaponPattern2(WeaponPattern2 object)
      {
        return createWeaponPattern2Adapter();
      }
      @Override
      public Adapter caseWeaponPattern3(WeaponPattern3 object)
      {
        return createWeaponPattern3Adapter();
      }
      @Override
      public Adapter caseWeaponPattern4(WeaponPattern4 object)
      {
        return createWeaponPattern4Adapter();
      }
      @Override
      public Adapter caseWeaponInst1(WeaponInst1 object)
      {
        return createWeaponInst1Adapter();
      }
      @Override
      public Adapter caseWeaponInst2(WeaponInst2 object)
      {
        return createWeaponInst2Adapter();
      }
      @Override
      public Adapter caseWeaponInst3(WeaponInst3 object)
      {
        return createWeaponInst3Adapter();
      }
      @Override
      public Adapter caseWeaponInst4(WeaponInst4 object)
      {
        return createWeaponInst4Adapter();
      }
      @Override
      public Adapter caseMonster(Monster object)
      {
        return createMonsterAdapter();
      }
      @Override
      public Adapter caseSelectMonsterById(SelectMonsterById object)
      {
        return createSelectMonsterByIdAdapter();
      }
      @Override
      public Adapter caseSelectMonsterByName(SelectMonsterByName object)
      {
        return createSelectMonsterByNameAdapter();
      }
      @Override
      public Adapter caseNewMonster(NewMonster object)
      {
        return createNewMonsterAdapter();
      }
      @Override
      public Adapter caseMonsterMods(MonsterMods object)
      {
        return createMonsterModsAdapter();
      }
      @Override
      public Adapter caseMonsterPattern1(MonsterPattern1 object)
      {
        return createMonsterPattern1Adapter();
      }
      @Override
      public Adapter caseMonsterPattern2(MonsterPattern2 object)
      {
        return createMonsterPattern2Adapter();
      }
      @Override
      public Adapter caseMonsterPattern3(MonsterPattern3 object)
      {
        return createMonsterPattern3Adapter();
      }
      @Override
      public Adapter caseMonsterPattern4(MonsterPattern4 object)
      {
        return createMonsterPattern4Adapter();
      }
      @Override
      public Adapter caseMonsterPattern5(MonsterPattern5 object)
      {
        return createMonsterPattern5Adapter();
      }
      @Override
      public Adapter caseMonsterInst1(MonsterInst1 object)
      {
        return createMonsterInst1Adapter();
      }
      @Override
      public Adapter caseMonsterInst2(MonsterInst2 object)
      {
        return createMonsterInst2Adapter();
      }
      @Override
      public Adapter caseMonsterInst3(MonsterInst3 object)
      {
        return createMonsterInst3Adapter();
      }
      @Override
      public Adapter caseMonsterInst4(MonsterInst4 object)
      {
        return createMonsterInst4Adapter();
      }
      @Override
      public Adapter caseMonsterInst5(MonsterInst5 object)
      {
        return createMonsterInst5Adapter();
      }
      @Override
      public Adapter caseSpell(Spell object)
      {
        return createSpellAdapter();
      }
      @Override
      public Adapter caseSelectSpellById(SelectSpellById object)
      {
        return createSelectSpellByIdAdapter();
      }
      @Override
      public Adapter caseSelectSpellByName(SelectSpellByName object)
      {
        return createSelectSpellByNameAdapter();
      }
      @Override
      public Adapter caseNewSpell(NewSpell object)
      {
        return createNewSpellAdapter();
      }
      @Override
      public Adapter caseSpellMods(SpellMods object)
      {
        return createSpellModsAdapter();
      }
      @Override
      public Adapter caseSpellPattern1(SpellPattern1 object)
      {
        return createSpellPattern1Adapter();
      }
      @Override
      public Adapter caseSpellPattern2(SpellPattern2 object)
      {
        return createSpellPattern2Adapter();
      }
      @Override
      public Adapter caseSpellPattern3(SpellPattern3 object)
      {
        return createSpellPattern3Adapter();
      }
      @Override
      public Adapter caseSpellPattern4(SpellPattern4 object)
      {
        return createSpellPattern4Adapter();
      }
      @Override
      public Adapter caseSpellPattern5(SpellPattern5 object)
      {
        return createSpellPattern5Adapter();
      }
      @Override
      public Adapter caseSpellInst1(SpellInst1 object)
      {
        return createSpellInst1Adapter();
      }
      @Override
      public Adapter caseSpellInst2(SpellInst2 object)
      {
        return createSpellInst2Adapter();
      }
      @Override
      public Adapter caseSpellInst3(SpellInst3 object)
      {
        return createSpellInst3Adapter();
      }
      @Override
      public Adapter caseSpellInst4(SpellInst4 object)
      {
        return createSpellInst4Adapter();
      }
      @Override
      public Adapter caseSpellInst5(SpellInst5 object)
      {
        return createSpellInst5Adapter();
      }
      @Override
      public Adapter caseItem(Item object)
      {
        return createItemAdapter();
      }
      @Override
      public Adapter caseSelectItemById(SelectItemById object)
      {
        return createSelectItemByIdAdapter();
      }
      @Override
      public Adapter caseSelectItemByName(SelectItemByName object)
      {
        return createSelectItemByNameAdapter();
      }
      @Override
      public Adapter caseNewItem(NewItem object)
      {
        return createNewItemAdapter();
      }
      @Override
      public Adapter caseItemMods(ItemMods object)
      {
        return createItemModsAdapter();
      }
      @Override
      public Adapter caseItemPattern1(ItemPattern1 object)
      {
        return createItemPattern1Adapter();
      }
      @Override
      public Adapter caseItemPattern2(ItemPattern2 object)
      {
        return createItemPattern2Adapter();
      }
      @Override
      public Adapter caseItemInst1(ItemInst1 object)
      {
        return createItemInst1Adapter();
      }
      @Override
      public Adapter caseItemInst2(ItemInst2 object)
      {
        return createItemInst2Adapter();
      }
      @Override
      public Adapter caseName(Name object)
      {
        return createNameAdapter();
      }
      @Override
      public Adapter caseSelectName(SelectName object)
      {
        return createSelectNameAdapter();
      }
      @Override
      public Adapter caseNameMods(NameMods object)
      {
        return createNameModsAdapter();
      }
      @Override
      public Adapter caseNamePattern1(NamePattern1 object)
      {
        return createNamePattern1Adapter();
      }
      @Override
      public Adapter caseNamePattern2(NamePattern2 object)
      {
        return createNamePattern2Adapter();
      }
      @Override
      public Adapter caseNameInst1(NameInst1 object)
      {
        return createNameInst1Adapter();
      }
      @Override
      public Adapter caseNameInst2(NameInst2 object)
      {
        return createNameInst2Adapter();
      }
      @Override
      public Adapter caseSite(Site object)
      {
        return createSiteAdapter();
      }
      @Override
      public Adapter caseSelectSiteById(SelectSiteById object)
      {
        return createSelectSiteByIdAdapter();
      }
      @Override
      public Adapter caseSelectSiteByName(SelectSiteByName object)
      {
        return createSelectSiteByNameAdapter();
      }
      @Override
      public Adapter caseNewSite(NewSite object)
      {
        return createNewSiteAdapter();
      }
      @Override
      public Adapter caseSiteMods(SiteMods object)
      {
        return createSiteModsAdapter();
      }
      @Override
      public Adapter caseSitePattern1(SitePattern1 object)
      {
        return createSitePattern1Adapter();
      }
      @Override
      public Adapter caseSitePattern2(SitePattern2 object)
      {
        return createSitePattern2Adapter();
      }
      @Override
      public Adapter caseSitePattern3(SitePattern3 object)
      {
        return createSitePattern3Adapter();
      }
      @Override
      public Adapter caseSitePattern4(SitePattern4 object)
      {
        return createSitePattern4Adapter();
      }
      @Override
      public Adapter caseSiteInst1(SiteInst1 object)
      {
        return createSiteInst1Adapter();
      }
      @Override
      public Adapter caseSiteInst2(SiteInst2 object)
      {
        return createSiteInst2Adapter();
      }
      @Override
      public Adapter caseSiteInst3(SiteInst3 object)
      {
        return createSiteInst3Adapter();
      }
      @Override
      public Adapter caseSiteInst4(SiteInst4 object)
      {
        return createSiteInst4Adapter();
      }
      @Override
      public Adapter caseNation(Nation object)
      {
        return createNationAdapter();
      }
      @Override
      public Adapter caseSelectNation(SelectNation object)
      {
        return createSelectNationAdapter();
      }
      @Override
      public Adapter caseIndepFlag(IndepFlag object)
      {
        return createIndepFlagAdapter();
      }
      @Override
      public Adapter caseNationMods(NationMods object)
      {
        return createNationModsAdapter();
      }
      @Override
      public Adapter caseNationPattern1(NationPattern1 object)
      {
        return createNationPattern1Adapter();
      }
      @Override
      public Adapter caseNationPattern2(NationPattern2 object)
      {
        return createNationPattern2Adapter();
      }
      @Override
      public Adapter caseNationPattern3(NationPattern3 object)
      {
        return createNationPattern3Adapter();
      }
      @Override
      public Adapter caseNationPattern4(NationPattern4 object)
      {
        return createNationPattern4Adapter();
      }
      @Override
      public Adapter caseNationPattern5(NationPattern5 object)
      {
        return createNationPattern5Adapter();
      }
      @Override
      public Adapter caseNationInst1(NationInst1 object)
      {
        return createNationInst1Adapter();
      }
      @Override
      public Adapter caseNationInst2(NationInst2 object)
      {
        return createNationInst2Adapter();
      }
      @Override
      public Adapter caseNationInst3(NationInst3 object)
      {
        return createNationInst3Adapter();
      }
      @Override
      public Adapter caseNationInst4(NationInst4 object)
      {
        return createNationInst4Adapter();
      }
      @Override
      public Adapter caseNationInst5(NationInst5 object)
      {
        return createNationInst5Adapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.Dom3Mod <em>Dom3 Mod</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.Dom3Mod
   * @generated
   */
  public Adapter createDom3ModAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.AbstractElement
   * @generated
   */
  public Adapter createAbstractElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.Armor <em>Armor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.Armor
   * @generated
   */
  public Adapter createArmorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SelectArmorById <em>Select Armor By Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SelectArmorById
   * @generated
   */
  public Adapter createSelectArmorByIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SelectArmorByName <em>Select Armor By Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SelectArmorByName
   * @generated
   */
  public Adapter createSelectArmorByNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.NewArmor <em>New Armor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.NewArmor
   * @generated
   */
  public Adapter createNewArmorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.ArmorMods <em>Armor Mods</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.ArmorMods
   * @generated
   */
  public Adapter createArmorModsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.ArmorPattern1 <em>Armor Pattern1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.ArmorPattern1
   * @generated
   */
  public Adapter createArmorPattern1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.ArmorPattern2 <em>Armor Pattern2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.ArmorPattern2
   * @generated
   */
  public Adapter createArmorPattern2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.ArmorInst1 <em>Armor Inst1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.ArmorInst1
   * @generated
   */
  public Adapter createArmorInst1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.ArmorInst2 <em>Armor Inst2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.ArmorInst2
   * @generated
   */
  public Adapter createArmorInst2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.Weapon <em>Weapon</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.Weapon
   * @generated
   */
  public Adapter createWeaponAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SelectWeaponById <em>Select Weapon By Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SelectWeaponById
   * @generated
   */
  public Adapter createSelectWeaponByIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SelectWeaponByName <em>Select Weapon By Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SelectWeaponByName
   * @generated
   */
  public Adapter createSelectWeaponByNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.NewWeapon <em>New Weapon</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.NewWeapon
   * @generated
   */
  public Adapter createNewWeaponAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.WeaponMods <em>Weapon Mods</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.WeaponMods
   * @generated
   */
  public Adapter createWeaponModsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.WeaponPattern1 <em>Weapon Pattern1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.WeaponPattern1
   * @generated
   */
  public Adapter createWeaponPattern1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.WeaponPattern2 <em>Weapon Pattern2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.WeaponPattern2
   * @generated
   */
  public Adapter createWeaponPattern2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.WeaponPattern3 <em>Weapon Pattern3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.WeaponPattern3
   * @generated
   */
  public Adapter createWeaponPattern3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.WeaponPattern4 <em>Weapon Pattern4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.WeaponPattern4
   * @generated
   */
  public Adapter createWeaponPattern4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.WeaponInst1 <em>Weapon Inst1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.WeaponInst1
   * @generated
   */
  public Adapter createWeaponInst1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.WeaponInst2 <em>Weapon Inst2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.WeaponInst2
   * @generated
   */
  public Adapter createWeaponInst2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.WeaponInst3 <em>Weapon Inst3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.WeaponInst3
   * @generated
   */
  public Adapter createWeaponInst3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.WeaponInst4 <em>Weapon Inst4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.WeaponInst4
   * @generated
   */
  public Adapter createWeaponInst4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.Monster <em>Monster</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.Monster
   * @generated
   */
  public Adapter createMonsterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SelectMonsterById <em>Select Monster By Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SelectMonsterById
   * @generated
   */
  public Adapter createSelectMonsterByIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SelectMonsterByName <em>Select Monster By Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SelectMonsterByName
   * @generated
   */
  public Adapter createSelectMonsterByNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.NewMonster <em>New Monster</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.NewMonster
   * @generated
   */
  public Adapter createNewMonsterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.MonsterMods <em>Monster Mods</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.MonsterMods
   * @generated
   */
  public Adapter createMonsterModsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.MonsterPattern1 <em>Monster Pattern1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.MonsterPattern1
   * @generated
   */
  public Adapter createMonsterPattern1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.MonsterPattern2 <em>Monster Pattern2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.MonsterPattern2
   * @generated
   */
  public Adapter createMonsterPattern2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.MonsterPattern3 <em>Monster Pattern3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.MonsterPattern3
   * @generated
   */
  public Adapter createMonsterPattern3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.MonsterPattern4 <em>Monster Pattern4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.MonsterPattern4
   * @generated
   */
  public Adapter createMonsterPattern4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.MonsterPattern5 <em>Monster Pattern5</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.MonsterPattern5
   * @generated
   */
  public Adapter createMonsterPattern5Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.MonsterInst1 <em>Monster Inst1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.MonsterInst1
   * @generated
   */
  public Adapter createMonsterInst1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.MonsterInst2 <em>Monster Inst2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.MonsterInst2
   * @generated
   */
  public Adapter createMonsterInst2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.MonsterInst3 <em>Monster Inst3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.MonsterInst3
   * @generated
   */
  public Adapter createMonsterInst3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.MonsterInst4 <em>Monster Inst4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.MonsterInst4
   * @generated
   */
  public Adapter createMonsterInst4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.MonsterInst5 <em>Monster Inst5</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.MonsterInst5
   * @generated
   */
  public Adapter createMonsterInst5Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.Spell <em>Spell</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.Spell
   * @generated
   */
  public Adapter createSpellAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SelectSpellById <em>Select Spell By Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SelectSpellById
   * @generated
   */
  public Adapter createSelectSpellByIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SelectSpellByName <em>Select Spell By Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SelectSpellByName
   * @generated
   */
  public Adapter createSelectSpellByNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.NewSpell <em>New Spell</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.NewSpell
   * @generated
   */
  public Adapter createNewSpellAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SpellMods <em>Spell Mods</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SpellMods
   * @generated
   */
  public Adapter createSpellModsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SpellPattern1 <em>Spell Pattern1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SpellPattern1
   * @generated
   */
  public Adapter createSpellPattern1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SpellPattern2 <em>Spell Pattern2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SpellPattern2
   * @generated
   */
  public Adapter createSpellPattern2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SpellPattern3 <em>Spell Pattern3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SpellPattern3
   * @generated
   */
  public Adapter createSpellPattern3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SpellPattern4 <em>Spell Pattern4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SpellPattern4
   * @generated
   */
  public Adapter createSpellPattern4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SpellPattern5 <em>Spell Pattern5</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SpellPattern5
   * @generated
   */
  public Adapter createSpellPattern5Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SpellInst1 <em>Spell Inst1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SpellInst1
   * @generated
   */
  public Adapter createSpellInst1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SpellInst2 <em>Spell Inst2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SpellInst2
   * @generated
   */
  public Adapter createSpellInst2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SpellInst3 <em>Spell Inst3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SpellInst3
   * @generated
   */
  public Adapter createSpellInst3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SpellInst4 <em>Spell Inst4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SpellInst4
   * @generated
   */
  public Adapter createSpellInst4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SpellInst5 <em>Spell Inst5</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SpellInst5
   * @generated
   */
  public Adapter createSpellInst5Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.Item <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.Item
   * @generated
   */
  public Adapter createItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SelectItemById <em>Select Item By Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SelectItemById
   * @generated
   */
  public Adapter createSelectItemByIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SelectItemByName <em>Select Item By Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SelectItemByName
   * @generated
   */
  public Adapter createSelectItemByNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.NewItem <em>New Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.NewItem
   * @generated
   */
  public Adapter createNewItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.ItemMods <em>Item Mods</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.ItemMods
   * @generated
   */
  public Adapter createItemModsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.ItemPattern1 <em>Item Pattern1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.ItemPattern1
   * @generated
   */
  public Adapter createItemPattern1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.ItemPattern2 <em>Item Pattern2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.ItemPattern2
   * @generated
   */
  public Adapter createItemPattern2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.ItemInst1 <em>Item Inst1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.ItemInst1
   * @generated
   */
  public Adapter createItemInst1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.ItemInst2 <em>Item Inst2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.ItemInst2
   * @generated
   */
  public Adapter createItemInst2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.Name
   * @generated
   */
  public Adapter createNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SelectName <em>Select Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SelectName
   * @generated
   */
  public Adapter createSelectNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.NameMods <em>Name Mods</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.NameMods
   * @generated
   */
  public Adapter createNameModsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.NamePattern1 <em>Name Pattern1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.NamePattern1
   * @generated
   */
  public Adapter createNamePattern1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.NamePattern2 <em>Name Pattern2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.NamePattern2
   * @generated
   */
  public Adapter createNamePattern2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.NameInst1 <em>Name Inst1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.NameInst1
   * @generated
   */
  public Adapter createNameInst1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.NameInst2 <em>Name Inst2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.NameInst2
   * @generated
   */
  public Adapter createNameInst2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.Site <em>Site</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.Site
   * @generated
   */
  public Adapter createSiteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SelectSiteById <em>Select Site By Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SelectSiteById
   * @generated
   */
  public Adapter createSelectSiteByIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SelectSiteByName <em>Select Site By Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SelectSiteByName
   * @generated
   */
  public Adapter createSelectSiteByNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.NewSite <em>New Site</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.NewSite
   * @generated
   */
  public Adapter createNewSiteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SiteMods <em>Site Mods</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SiteMods
   * @generated
   */
  public Adapter createSiteModsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SitePattern1 <em>Site Pattern1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SitePattern1
   * @generated
   */
  public Adapter createSitePattern1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SitePattern2 <em>Site Pattern2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SitePattern2
   * @generated
   */
  public Adapter createSitePattern2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SitePattern3 <em>Site Pattern3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SitePattern3
   * @generated
   */
  public Adapter createSitePattern3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SitePattern4 <em>Site Pattern4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SitePattern4
   * @generated
   */
  public Adapter createSitePattern4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SiteInst1 <em>Site Inst1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SiteInst1
   * @generated
   */
  public Adapter createSiteInst1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SiteInst2 <em>Site Inst2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SiteInst2
   * @generated
   */
  public Adapter createSiteInst2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SiteInst3 <em>Site Inst3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SiteInst3
   * @generated
   */
  public Adapter createSiteInst3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SiteInst4 <em>Site Inst4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SiteInst4
   * @generated
   */
  public Adapter createSiteInst4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.Nation <em>Nation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.Nation
   * @generated
   */
  public Adapter createNationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.SelectNation <em>Select Nation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.SelectNation
   * @generated
   */
  public Adapter createSelectNationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.IndepFlag <em>Indep Flag</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.IndepFlag
   * @generated
   */
  public Adapter createIndepFlagAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.NationMods <em>Nation Mods</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.NationMods
   * @generated
   */
  public Adapter createNationModsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.NationPattern1 <em>Nation Pattern1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.NationPattern1
   * @generated
   */
  public Adapter createNationPattern1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.NationPattern2 <em>Nation Pattern2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.NationPattern2
   * @generated
   */
  public Adapter createNationPattern2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.NationPattern3 <em>Nation Pattern3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.NationPattern3
   * @generated
   */
  public Adapter createNationPattern3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.NationPattern4 <em>Nation Pattern4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.NationPattern4
   * @generated
   */
  public Adapter createNationPattern4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.NationPattern5 <em>Nation Pattern5</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.NationPattern5
   * @generated
   */
  public Adapter createNationPattern5Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.NationInst1 <em>Nation Inst1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.NationInst1
   * @generated
   */
  public Adapter createNationInst1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.NationInst2 <em>Nation Inst2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.NationInst2
   * @generated
   */
  public Adapter createNationInst2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.NationInst3 <em>Nation Inst3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.NationInst3
   * @generated
   */
  public Adapter createNationInst3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.NationInst4 <em>Nation Inst4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.NationInst4
   * @generated
   */
  public Adapter createNationInst4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.larz.dom3.dm.dm.NationInst5 <em>Nation Inst5</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.larz.dom3.dm.dm.NationInst5
   * @generated
   */
  public Adapter createNationInst5Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DmAdapterFactory
