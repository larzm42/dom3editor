/**
 * <copyright>
 * </copyright>
 *
 */
package org.larz.dom3.dm.dm.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.larz.dom3.dm.dm.DmFactory;
import org.larz.dom3.dm.dm.DmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DmPackageImpl extends EPackageImpl implements DmPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected String packageFilename = "dm.ecore";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dom3ModEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass armorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectArmorByIdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectArmorByNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newArmorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass armorModsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass armorPattern1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass armorPattern2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass armorInst1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass armorInst2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass weaponEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectWeaponByIdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectWeaponByNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newWeaponEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass weaponModsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass weaponPattern1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass weaponPattern2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass weaponPattern3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass weaponPattern4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass weaponInst1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass weaponInst2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass weaponInst3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass weaponInst4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass monsterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectMonsterByIdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectMonsterByNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newMonsterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass monsterModsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass monsterPattern1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass monsterPattern2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass monsterPattern3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass monsterPattern4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass monsterPattern5EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass monsterPattern6EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass monsterInst1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass monsterInst2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass monsterInst3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass monsterInst4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass monsterInst5EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass monsterInst6EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spellEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectSpellByIdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectSpellByNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newSpellEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spellModsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spellPattern1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spellPattern2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spellPattern3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spellPattern4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spellPattern5EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spellInst1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spellInst2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spellInst3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spellInst4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spellInst5EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectItemByIdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectItemByNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemModsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemPattern1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemPattern2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemInst1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemInst2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameModsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namePattern1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namePattern2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameInst1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameInst2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass siteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectSiteByIdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectSiteByNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass newSiteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass siteModsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sitePattern1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sitePattern2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sitePattern3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sitePattern4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass siteInst1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass siteInst2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass siteInst3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass siteInst4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectNationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indepFlagEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nationModsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nationPattern1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nationPattern2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nationPattern3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nationPattern4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nationPattern5EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nationInst1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nationInst2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nationInst3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nationInst4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nationInst5EClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.larz.dom3.dm.dm.DmPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DmPackageImpl()
  {
    super(eNS_URI, DmFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link DmPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @generated
   */
  public static DmPackage init()
  {
    if (isInited) return (DmPackage)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI);

    // Obtain or create and register package
    DmPackageImpl theDmPackage = (DmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DmPackageImpl());

    isInited = true;

    // Load packages
    theDmPackage.loadPackage();

    // Fix loaded packages
    theDmPackage.fixPackageContents();

    // Mark meta-data to indicate it can't be changed
    theDmPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DmPackage.eNS_URI, theDmPackage);
    return theDmPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDom3Mod()
  {
    if (dom3ModEClass == null)
    {
      dom3ModEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(0);
    }
    return dom3ModEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDom3Mod_Modname()
  {
        return (EAttribute)getDom3Mod().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDom3Mod_Desc()
  {
        return (EAttribute)getDom3Mod().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDom3Mod_Icon()
  {
        return (EAttribute)getDom3Mod().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDom3Mod_Version()
  {
        return (EAttribute)getDom3Mod().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDom3Mod_Domversion()
  {
        return (EAttribute)getDom3Mod().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDom3Mod_Poppergold()
  {
        return (EAttribute)getDom3Mod().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDom3Mod_Resourcemult()
  {
        return (EAttribute)getDom3Mod().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDom3Mod_Supplymult()
  {
        return (EAttribute)getDom3Mod().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDom3Mod_Unresthalfinc()
  {
        return (EAttribute)getDom3Mod().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDom3Mod_Unresthalfres()
  {
        return (EAttribute)getDom3Mod().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDom3Mod_Eventisrare()
  {
        return (EAttribute)getDom3Mod().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDom3Mod_Turmoilincome()
  {
        return (EAttribute)getDom3Mod().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDom3Mod_Turmoilevents()
  {
        return (EAttribute)getDom3Mod().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDom3Mod_Deathincome()
  {
        return (EAttribute)getDom3Mod().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDom3Mod_Deathsupply()
  {
        return (EAttribute)getDom3Mod().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDom3Mod_Deathdeath()
  {
        return (EAttribute)getDom3Mod().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDom3Mod_Slothincome()
  {
        return (EAttribute)getDom3Mod().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDom3Mod_Slothresources()
  {
        return (EAttribute)getDom3Mod().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDom3Mod_Coldincome()
  {
        return (EAttribute)getDom3Mod().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDom3Mod_Coldsupply()
  {
        return (EAttribute)getDom3Mod().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDom3Mod_Misfortune()
  {
        return (EAttribute)getDom3Mod().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDom3Mod_Luckevents()
  {
        return (EAttribute)getDom3Mod().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDom3Mod_Researchscale()
  {
        return (EAttribute)getDom3Mod().getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDom3Mod_Elements()
  {
        return (EReference)getDom3Mod().getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractElement()
  {
    if (abstractElementEClass == null)
    {
      abstractElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(1);
    }
    return abstractElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArmor()
  {
    if (armorEClass == null)
    {
      armorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(2);
    }
    return armorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArmor_Mods()
  {
        return (EReference)getArmor().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectArmorById()
  {
    if (selectArmorByIdEClass == null)
    {
      selectArmorByIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(3);
    }
    return selectArmorByIdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectArmorById_Value()
  {
        return (EAttribute)getSelectArmorById().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectArmorByName()
  {
    if (selectArmorByNameEClass == null)
    {
      selectArmorByNameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(4);
    }
    return selectArmorByNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectArmorByName_Value()
  {
        return (EAttribute)getSelectArmorByName().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNewArmor()
  {
    if (newArmorEClass == null)
    {
      newArmorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(5);
    }
    return newArmorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNewArmor_Value()
  {
        return (EAttribute)getNewArmor().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArmorMods()
  {
    if (armorModsEClass == null)
    {
      armorModsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(6);
    }
    return armorModsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArmorPattern1()
  {
    if (armorPattern1EClass == null)
    {
      armorPattern1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(7);
    }
    return armorPattern1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArmorPattern2()
  {
    if (armorPattern2EClass == null)
    {
      armorPattern2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(8);
    }
    return armorPattern2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArmorInst1()
  {
    if (armorInst1EClass == null)
    {
      armorInst1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(9);
    }
    return armorInst1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArmorInst1_Value()
  {
        return (EAttribute)getArmorInst1().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArmorInst1_Name()
  {
        return (EAttribute)getArmorInst1().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArmorInst2()
  {
    if (armorInst2EClass == null)
    {
      armorInst2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(10);
    }
    return armorInst2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArmorInst2_Value()
  {
        return (EAttribute)getArmorInst2().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArmorInst2_Type()
  {
        return (EAttribute)getArmorInst2().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArmorInst2_Prot()
  {
        return (EAttribute)getArmorInst2().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArmorInst2_Def()
  {
        return (EAttribute)getArmorInst2().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArmorInst2_Enc()
  {
        return (EAttribute)getArmorInst2().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArmorInst2_Rcost()
  {
        return (EAttribute)getArmorInst2().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWeapon()
  {
    if (weaponEClass == null)
    {
      weaponEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(11);
    }
    return weaponEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWeapon_Mods()
  {
        return (EReference)getWeapon().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectWeaponById()
  {
    if (selectWeaponByIdEClass == null)
    {
      selectWeaponByIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(12);
    }
    return selectWeaponByIdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectWeaponById_Value()
  {
        return (EAttribute)getSelectWeaponById().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectWeaponByName()
  {
    if (selectWeaponByNameEClass == null)
    {
      selectWeaponByNameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(13);
    }
    return selectWeaponByNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectWeaponByName_Value()
  {
        return (EAttribute)getSelectWeaponByName().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNewWeapon()
  {
    if (newWeaponEClass == null)
    {
      newWeaponEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(14);
    }
    return newWeaponEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNewWeapon_Value()
  {
        return (EAttribute)getNewWeapon().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWeaponMods()
  {
    if (weaponModsEClass == null)
    {
      weaponModsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(15);
    }
    return weaponModsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWeaponPattern1()
  {
    if (weaponPattern1EClass == null)
    {
      weaponPattern1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(16);
    }
    return weaponPattern1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWeaponPattern2()
  {
    if (weaponPattern2EClass == null)
    {
      weaponPattern2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(17);
    }
    return weaponPattern2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWeaponPattern3()
  {
    if (weaponPattern3EClass == null)
    {
      weaponPattern3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(18);
    }
    return weaponPattern3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWeaponPattern4()
  {
    if (weaponPattern4EClass == null)
    {
      weaponPattern4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(19);
    }
    return weaponPattern4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWeaponInst1()
  {
    if (weaponInst1EClass == null)
    {
      weaponInst1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(20);
    }
    return weaponInst1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst1_Value()
  {
        return (EAttribute)getWeaponInst1().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst1_Name()
  {
        return (EAttribute)getWeaponInst1().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWeaponInst2()
  {
    if (weaponInst2EClass == null)
    {
      weaponInst2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(21);
    }
    return weaponInst2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst2_Value()
  {
        return (EAttribute)getWeaponInst2().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst2_Dmg()
  {
        return (EAttribute)getWeaponInst2().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst2_Nratt()
  {
        return (EAttribute)getWeaponInst2().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst2_Att()
  {
        return (EAttribute)getWeaponInst2().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst2_Def()
  {
        return (EAttribute)getWeaponInst2().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst2_Len()
  {
        return (EAttribute)getWeaponInst2().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst2_Range()
  {
        return (EAttribute)getWeaponInst2().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst2_Ammo()
  {
        return (EAttribute)getWeaponInst2().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst2_Rcost()
  {
        return (EAttribute)getWeaponInst2().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst2_Sound()
  {
        return (EAttribute)getWeaponInst2().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst2_Aoe()
  {
        return (EAttribute)getWeaponInst2().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst2_Secondaryeffect()
  {
        return (EAttribute)getWeaponInst2().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst2_Secondaryeffectalways()
  {
        return (EAttribute)getWeaponInst2().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst2_Explspr()
  {
        return (EAttribute)getWeaponInst2().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWeaponInst3()
  {
    if (weaponInst3EClass == null)
    {
      weaponInst3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(22);
    }
    return weaponInst3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst3_Value1()
  {
        return (EAttribute)getWeaponInst3().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst3_Value2()
  {
        return (EAttribute)getWeaponInst3().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst3_Flyspr()
  {
        return (EAttribute)getWeaponInst3().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWeaponInst4()
  {
    if (weaponInst4EClass == null)
    {
      weaponInst4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(23);
    }
    return weaponInst4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst4_Twohanded()
  {
        return (EAttribute)getWeaponInst4().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst4_Armorpiercing()
  {
        return (EAttribute)getWeaponInst4().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst4_Armornegating()
  {
        return (EAttribute)getWeaponInst4().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst4_Magic()
  {
        return (EAttribute)getWeaponInst4().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst4_Dt_normal()
  {
        return (EAttribute)getWeaponInst4().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst4_Dt_stun()
  {
        return (EAttribute)getWeaponInst4().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst4_Dt_paralyze()
  {
        return (EAttribute)getWeaponInst4().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst4_Dt_poison()
  {
        return (EAttribute)getWeaponInst4().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst4_Dt_cap()
  {
        return (EAttribute)getWeaponInst4().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst4_Dt_demon()
  {
        return (EAttribute)getWeaponInst4().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst4_Dt_demononly()
  {
        return (EAttribute)getWeaponInst4().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst4_Dt_holy()
  {
        return (EAttribute)getWeaponInst4().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst4_Dt_magic()
  {
        return (EAttribute)getWeaponInst4().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst4_Dt_small()
  {
        return (EAttribute)getWeaponInst4().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst4_Dt_large()
  {
        return (EAttribute)getWeaponInst4().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst4_Dt_constructonly()
  {
        return (EAttribute)getWeaponInst4().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst4_Dt_raise()
  {
        return (EAttribute)getWeaponInst4().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst4_Mind()
  {
        return (EAttribute)getWeaponInst4().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst4_Cold()
  {
        return (EAttribute)getWeaponInst4().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst4_Fire()
  {
        return (EAttribute)getWeaponInst4().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst4_Shock()
  {
        return (EAttribute)getWeaponInst4().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst4_Poison()
  {
        return (EAttribute)getWeaponInst4().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst4_Bonus()
  {
        return (EAttribute)getWeaponInst4().getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst4_Charge()
  {
        return (EAttribute)getWeaponInst4().getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst4_Flail()
  {
        return (EAttribute)getWeaponInst4().getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst4_Nostr()
  {
        return (EAttribute)getWeaponInst4().getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst4_Mrnegates()
  {
        return (EAttribute)getWeaponInst4().getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeaponInst4_Mrnegateseasily()
  {
        return (EAttribute)getWeaponInst4().getEStructuralFeatures().get(27);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMonster()
  {
    if (monsterEClass == null)
    {
      monsterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(24);
    }
    return monsterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMonster_Mods()
  {
        return (EReference)getMonster().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectMonsterById()
  {
    if (selectMonsterByIdEClass == null)
    {
      selectMonsterByIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(25);
    }
    return selectMonsterByIdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectMonsterById_Value()
  {
        return (EAttribute)getSelectMonsterById().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectMonsterByName()
  {
    if (selectMonsterByNameEClass == null)
    {
      selectMonsterByNameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(26);
    }
    return selectMonsterByNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectMonsterByName_Value()
  {
        return (EAttribute)getSelectMonsterByName().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNewMonster()
  {
    if (newMonsterEClass == null)
    {
      newMonsterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(27);
    }
    return newMonsterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNewMonster_Value()
  {
        return (EAttribute)getNewMonster().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMonsterMods()
  {
    if (monsterModsEClass == null)
    {
      monsterModsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(28);
    }
    return monsterModsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMonsterPattern1()
  {
    if (monsterPattern1EClass == null)
    {
      monsterPattern1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(29);
    }
    return monsterPattern1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMonsterPattern2()
  {
    if (monsterPattern2EClass == null)
    {
      monsterPattern2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(30);
    }
    return monsterPattern2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMonsterPattern3()
  {
    if (monsterPattern3EClass == null)
    {
      monsterPattern3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(31);
    }
    return monsterPattern3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMonsterPattern4()
  {
    if (monsterPattern4EClass == null)
    {
      monsterPattern4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(32);
    }
    return monsterPattern4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMonsterPattern5()
  {
    if (monsterPattern5EClass == null)
    {
      monsterPattern5EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(33);
    }
    return monsterPattern5EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMonsterPattern6()
  {
    if (monsterPattern6EClass == null)
    {
      monsterPattern6EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(34);
    }
    return monsterPattern6EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMonsterInst1()
  {
    if (monsterInst1EClass == null)
    {
      monsterInst1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(35);
    }
    return monsterInst1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst1_Value()
  {
        return (EAttribute)getMonsterInst1().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst1_Name()
  {
        return (EAttribute)getMonsterInst1().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst1_Spr1()
  {
        return (EAttribute)getMonsterInst1().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst1_Spr2()
  {
        return (EAttribute)getMonsterInst1().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst1_Descr()
  {
        return (EAttribute)getMonsterInst1().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst1_Armor()
  {
        return (EAttribute)getMonsterInst1().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMonsterInst2()
  {
    if (monsterInst2EClass == null)
    {
      monsterInst2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(36);
    }
    return monsterInst2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Value()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Speciallook()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Ap()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Mapmove()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Hp()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Prot()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Size()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Ressize()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Str()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Enc()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Att()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Def()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Prec()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Mr()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Mor()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Gcost()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Rcost()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Pathcost()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Startdom()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Eyes()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Copystats()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Copyspr()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Restrictedgod()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Shatteredsoul()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Coldres()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Fireres()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Poisonres()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Shockres()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(27);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Darkvision()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(28);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Stealthy()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(29);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Seduce()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(30);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Succubus()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(31);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Beckon()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(32);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Startage()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(33);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Maxage()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(34);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Older()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(35);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Healer()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(36);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Startaff()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(37);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Supplybonus()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(38);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Uwdamage()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(39);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Coldpower()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(40);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Firepower()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(41);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Stormpower()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(42);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Darkpower()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(43);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Springpower()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(44);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Summerpower()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(45);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Fallpower()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(46);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Winterpower()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(47);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Ambidextrous()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(48);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Banefireshield()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(49);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Berserk()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(50);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Standard()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(51);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Animalawe()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(52);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Awe()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(53);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Fear()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(54);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Regeneration()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(55);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Reinvigoration()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(56);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Fireshield()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(57);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Iceprot()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(58);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Poisoncloud()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(59);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Diseasecloud()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(60);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Bloodvengeance()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(61);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Castledef()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(62);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Siegebonus()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(63);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Patrolbonus()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(64);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Pillagebonus()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(65);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Researchbonus()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(66);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Forgebonus()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(67);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Douse()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(68);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Nobadevents()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(69);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Incunrest()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(70);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Spreaddom()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(71);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Leper()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(72);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Popkill()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(73);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Heretic()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(74);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Itemslots()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(75);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst2_Nametype()
  {
        return (EAttribute)getMonsterInst2().getEStructuralFeatures().get(76);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMonsterInst3()
  {
    if (monsterInst3EClass == null)
    {
      monsterInst3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(37);
    }
    return monsterInst3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst3_Value1()
  {
        return (EAttribute)getMonsterInst3().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst3_Value2()
  {
        return (EAttribute)getMonsterInst3().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst3_Magicskill()
  {
        return (EAttribute)getMonsterInst3().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst3_Custommagic()
  {
        return (EAttribute)getMonsterInst3().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst3_Magicboost()
  {
        return (EAttribute)getMonsterInst3().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst3_Gemprod()
  {
        return (EAttribute)getMonsterInst3().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMonsterInst4()
  {
    if (monsterInst4EClass == null)
    {
      monsterInst4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(38);
    }
    return monsterInst4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Clear()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Clearmagic()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Clearspec()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Female()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Mounted()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Holy()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Animal()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Undead()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Demon()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Magicbeing()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Stonebeing()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Inanimate()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Coldblood()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Immortal()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Blind()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Unique()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Immobile()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Aquatic()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Amphibian()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Pooramphibian()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Flying()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Stormimmune()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Sailing()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Forestsurvival()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Mountainsurvival()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Swampsurvival()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Wastesurvival()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Illusion()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(27);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Spy()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(28);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Assassin()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(29);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Heal()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(30);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Noheal()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(31);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Neednoteat()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(32);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Ethereal()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(33);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Trample()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(34);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Entangle()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(35);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Eyeloss()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(36);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Horrormark()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(37);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Poisonarmor()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(38);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Inquisitor()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(39);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Noitem()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(40);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Noleader()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(41);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Poorleader()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(42);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Okleader()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(43);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Goodleader()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(44);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Expertleader()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(45);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Superiorleader()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(46);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Nomagicleader()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(47);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Poormagicleader()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(48);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Okmagicleader()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(49);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Goodmagicleader()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(50);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Expertmagicleader()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(51);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Superiormagicleader()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(52);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Noundeadleader()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(53);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Poorundeadleader()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(54);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Okundeadleader()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(55);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Goodundeadleader()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(56);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Expertundeadleader()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(57);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst4_Superiorundeadleader()
  {
        return (EAttribute)getMonsterInst4().getEStructuralFeatures().get(58);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMonsterInst5()
  {
    if (monsterInst5EClass == null)
    {
      monsterInst5EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(39);
    }
    return monsterInst5EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst5_Value1()
  {
        return (EAttribute)getMonsterInst5().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst5_Value2()
  {
        return (EAttribute)getMonsterInst5().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst5_Weapon()
  {
        return (EAttribute)getMonsterInst5().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst5_Onebattlespell()
  {
        return (EAttribute)getMonsterInst5().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst5_Firstshape()
  {
        return (EAttribute)getMonsterInst5().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst5_Secondshape()
  {
        return (EAttribute)getMonsterInst5().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst5_Secondtmpshape()
  {
        return (EAttribute)getMonsterInst5().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst5_Shapechange()
  {
        return (EAttribute)getMonsterInst5().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst5_Landshape()
  {
        return (EAttribute)getMonsterInst5().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst5_Watershape()
  {
        return (EAttribute)getMonsterInst5().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst5_Forestshape()
  {
        return (EAttribute)getMonsterInst5().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst5_Plainshape()
  {
        return (EAttribute)getMonsterInst5().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst5_Domsummon()
  {
        return (EAttribute)getMonsterInst5().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst5_Domsummon2()
  {
        return (EAttribute)getMonsterInst5().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst5_Domsummon20()
  {
        return (EAttribute)getMonsterInst5().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst5_Makemonster1()
  {
        return (EAttribute)getMonsterInst5().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst5_Makemonster2()
  {
        return (EAttribute)getMonsterInst5().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst5_Makemonster3()
  {
        return (EAttribute)getMonsterInst5().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst5_Makemonster4()
  {
        return (EAttribute)getMonsterInst5().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst5_Makemonster5()
  {
        return (EAttribute)getMonsterInst5().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst5_Summon1()
  {
        return (EAttribute)getMonsterInst5().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst5_Summon5()
  {
        return (EAttribute)getMonsterInst5().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMonsterInst6()
  {
    if (monsterInst6EClass == null)
    {
      monsterInst6EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(40);
    }
    return monsterInst6EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst6_Value()
  {
        return (EAttribute)getMonsterInst6().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst6_Heat()
  {
        return (EAttribute)getMonsterInst6().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonsterInst6_Cold()
  {
        return (EAttribute)getMonsterInst6().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpell()
  {
    if (spellEClass == null)
    {
      spellEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(41);
    }
    return spellEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpell_Mods()
  {
        return (EReference)getSpell().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectSpellById()
  {
    if (selectSpellByIdEClass == null)
    {
      selectSpellByIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(42);
    }
    return selectSpellByIdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectSpellById_Value()
  {
        return (EAttribute)getSelectSpellById().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectSpellByName()
  {
    if (selectSpellByNameEClass == null)
    {
      selectSpellByNameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(43);
    }
    return selectSpellByNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectSpellByName_Value()
  {
        return (EAttribute)getSelectSpellByName().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNewSpell()
  {
    if (newSpellEClass == null)
    {
      newSpellEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(44);
    }
    return newSpellEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpellMods()
  {
    if (spellModsEClass == null)
    {
      spellModsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(45);
    }
    return spellModsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpellPattern1()
  {
    if (spellPattern1EClass == null)
    {
      spellPattern1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(46);
    }
    return spellPattern1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpellPattern2()
  {
    if (spellPattern2EClass == null)
    {
      spellPattern2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(47);
    }
    return spellPattern2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpellPattern3()
  {
    if (spellPattern3EClass == null)
    {
      spellPattern3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(48);
    }
    return spellPattern3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpellPattern4()
  {
    if (spellPattern4EClass == null)
    {
      spellPattern4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(49);
    }
    return spellPattern4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpellPattern5()
  {
    if (spellPattern5EClass == null)
    {
      spellPattern5EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(50);
    }
    return spellPattern5EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpellInst1()
  {
    if (spellInst1EClass == null)
    {
      spellInst1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(51);
    }
    return spellInst1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpellInst1_Value()
  {
        return (EAttribute)getSpellInst1().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpellInst1_Name()
  {
        return (EAttribute)getSpellInst1().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpellInst1_Descr()
  {
        return (EAttribute)getSpellInst1().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpellInst2()
  {
    if (spellInst2EClass == null)
    {
      spellInst2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(52);
    }
    return spellInst2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpellInst2_Value()
  {
        return (EAttribute)getSpellInst2().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpellInst2_School()
  {
        return (EAttribute)getSpellInst2().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpellInst2_Researchlevel()
  {
        return (EAttribute)getSpellInst2().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpellInst2_Aoe()
  {
        return (EAttribute)getSpellInst2().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpellInst2_Damage()
  {
        return (EAttribute)getSpellInst2().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpellInst2_Effect()
  {
        return (EAttribute)getSpellInst2().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpellInst2_Fatiguecost()
  {
        return (EAttribute)getSpellInst2().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpellInst2_Flightspr()
  {
        return (EAttribute)getSpellInst2().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpellInst2_Explspr()
  {
        return (EAttribute)getSpellInst2().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpellInst2_Nreff()
  {
        return (EAttribute)getSpellInst2().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpellInst2_Range()
  {
        return (EAttribute)getSpellInst2().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpellInst2_Precision()
  {
        return (EAttribute)getSpellInst2().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpellInst2_Sound()
  {
        return (EAttribute)getSpellInst2().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpellInst2_Spec()
  {
        return (EAttribute)getSpellInst2().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpellInst2_Restricted()
  {
        return (EAttribute)getSpellInst2().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpellInst3()
  {
    if (spellInst3EClass == null)
    {
      spellInst3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(53);
    }
    return spellInst3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpellInst3_Value1()
  {
        return (EAttribute)getSpellInst3().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpellInst3_Value2()
  {
        return (EAttribute)getSpellInst3().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpellInst3_Path()
  {
        return (EAttribute)getSpellInst3().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpellInst3_Pathlevel()
  {
        return (EAttribute)getSpellInst3().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpellInst4()
  {
    if (spellInst4EClass == null)
    {
      spellInst4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(54);
    }
    return spellInst4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpellInst4_Clear()
  {
        return (EAttribute)getSpellInst4().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpellInst5()
  {
    if (spellInst5EClass == null)
    {
      spellInst5EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(55);
    }
    return spellInst5EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpellInst5_Value1()
  {
        return (EAttribute)getSpellInst5().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpellInst5_Value2()
  {
        return (EAttribute)getSpellInst5().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpellInst5_Copyspell()
  {
        return (EAttribute)getSpellInst5().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpellInst5_Nextspell()
  {
        return (EAttribute)getSpellInst5().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItem()
  {
    if (itemEClass == null)
    {
      itemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(56);
    }
    return itemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItem_Mods()
  {
        return (EReference)getItem().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectItemById()
  {
    if (selectItemByIdEClass == null)
    {
      selectItemByIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(57);
    }
    return selectItemByIdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectItemById_Value()
  {
        return (EAttribute)getSelectItemById().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectItemByName()
  {
    if (selectItemByNameEClass == null)
    {
      selectItemByNameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(58);
    }
    return selectItemByNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectItemByName_Value()
  {
        return (EAttribute)getSelectItemByName().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNewItem()
  {
    if (newItemEClass == null)
    {
      newItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(59);
    }
    return newItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItemMods()
  {
    if (itemModsEClass == null)
    {
      itemModsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(60);
    }
    return itemModsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItemPattern1()
  {
    if (itemPattern1EClass == null)
    {
      itemPattern1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(61);
    }
    return itemPattern1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItemPattern2()
  {
    if (itemPattern2EClass == null)
    {
      itemPattern2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(62);
    }
    return itemPattern2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItemInst1()
  {
    if (itemInst1EClass == null)
    {
      itemInst1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(63);
    }
    return itemInst1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItemInst1_Value()
  {
        return (EAttribute)getItemInst1().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItemInst1_Name()
  {
        return (EAttribute)getItemInst1().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItemInst1_Descr()
  {
        return (EAttribute)getItemInst1().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItemInst1_Armor()
  {
        return (EAttribute)getItemInst1().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItemInst2()
  {
    if (itemInst2EClass == null)
    {
      itemInst2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(64);
    }
    return itemInst2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItemInst2_Value()
  {
        return (EAttribute)getItemInst2().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItemInst2_Constlevel()
  {
        return (EAttribute)getItemInst2().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItemInst2_Mainpath()
  {
        return (EAttribute)getItemInst2().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItemInst2_Mainlevel()
  {
        return (EAttribute)getItemInst2().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItemInst2_Secondarypath()
  {
        return (EAttribute)getItemInst2().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItemInst2_Secondarylevel()
  {
        return (EAttribute)getItemInst2().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItemInst2_Copyspr()
  {
        return (EAttribute)getItemInst2().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItemInst2_Type()
  {
        return (EAttribute)getItemInst2().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItemInst2_Weapon()
  {
        return (EAttribute)getItemInst2().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getName_()
  {
    if (nameEClass == null)
    {
      nameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(65);
    }
    return nameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectName()
  {
    if (selectNameEClass == null)
    {
      selectNameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(66);
    }
    return selectNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectName_Value()
  {
        return (EAttribute)getSelectName().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectName_Mods()
  {
        return (EReference)getSelectName().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNameMods()
  {
    if (nameModsEClass == null)
    {
      nameModsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(67);
    }
    return nameModsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamePattern1()
  {
    if (namePattern1EClass == null)
    {
      namePattern1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(68);
    }
    return namePattern1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamePattern2()
  {
    if (namePattern2EClass == null)
    {
      namePattern2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(69);
    }
    return namePattern2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNameInst1()
  {
    if (nameInst1EClass == null)
    {
      nameInst1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(70);
    }
    return nameInst1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNameInst1_Value()
  {
        return (EAttribute)getNameInst1().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNameInst1_Name()
  {
        return (EAttribute)getNameInst1().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNameInst2()
  {
    if (nameInst2EClass == null)
    {
      nameInst2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(71);
    }
    return nameInst2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNameInst2_Clear()
  {
        return (EAttribute)getNameInst2().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSite()
  {
    if (siteEClass == null)
    {
      siteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(72);
    }
    return siteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSite_Mods()
  {
        return (EReference)getSite().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectSiteById()
  {
    if (selectSiteByIdEClass == null)
    {
      selectSiteByIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(73);
    }
    return selectSiteByIdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectSiteById_Value()
  {
        return (EAttribute)getSelectSiteById().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectSiteByName()
  {
    if (selectSiteByNameEClass == null)
    {
      selectSiteByNameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(74);
    }
    return selectSiteByNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectSiteByName_Value()
  {
        return (EAttribute)getSelectSiteByName().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNewSite()
  {
    if (newSiteEClass == null)
    {
      newSiteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(75);
    }
    return newSiteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNewSite_Value()
  {
        return (EAttribute)getNewSite().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSiteMods()
  {
    if (siteModsEClass == null)
    {
      siteModsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(76);
    }
    return siteModsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSitePattern1()
  {
    if (sitePattern1EClass == null)
    {
      sitePattern1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(77);
    }
    return sitePattern1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSitePattern2()
  {
    if (sitePattern2EClass == null)
    {
      sitePattern2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(78);
    }
    return sitePattern2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSitePattern3()
  {
    if (sitePattern3EClass == null)
    {
      sitePattern3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(79);
    }
    return sitePattern3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSitePattern4()
  {
    if (sitePattern4EClass == null)
    {
      sitePattern4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(80);
    }
    return sitePattern4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSiteInst1()
  {
    if (siteInst1EClass == null)
    {
      siteInst1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(81);
    }
    return siteInst1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSiteInst1_Value()
  {
        return (EAttribute)getSiteInst1().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSiteInst1_Name()
  {
        return (EAttribute)getSiteInst1().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSiteInst2()
  {
    if (siteInst2EClass == null)
    {
      siteInst2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(82);
    }
    return siteInst2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSiteInst2_Value()
  {
        return (EAttribute)getSiteInst2().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSiteInst2_Path()
  {
        return (EAttribute)getSiteInst2().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSiteInst2_Level()
  {
        return (EAttribute)getSiteInst2().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSiteInst2_Rarity()
  {
        return (EAttribute)getSiteInst2().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSiteInst2_Loc()
  {
        return (EAttribute)getSiteInst2().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSiteInst2_Homemon()
  {
        return (EAttribute)getSiteInst2().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSiteInst2_Homecom()
  {
        return (EAttribute)getSiteInst2().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSiteInst2_Mon()
  {
        return (EAttribute)getSiteInst2().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSiteInst2_Com()
  {
        return (EAttribute)getSiteInst2().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSiteInst2_Gold()
  {
        return (EAttribute)getSiteInst2().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSiteInst2_Res()
  {
        return (EAttribute)getSiteInst2().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSiteInst2_Incscale()
  {
        return (EAttribute)getSiteInst2().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSiteInst2_Decscale()
  {
        return (EAttribute)getSiteInst2().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSiteInst3()
  {
    if (siteInst3EClass == null)
    {
      siteInst3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(83);
    }
    return siteInst3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSiteInst3_Value1()
  {
        return (EAttribute)getSiteInst3().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSiteInst3_Value2()
  {
        return (EAttribute)getSiteInst3().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSiteInst3_Gems()
  {
        return (EAttribute)getSiteInst3().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSiteInst4()
  {
    if (siteInst4EClass == null)
    {
      siteInst4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(84);
    }
    return siteInst4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSiteInst4_Clear()
  {
        return (EAttribute)getSiteInst4().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNation()
  {
    if (nationEClass == null)
    {
      nationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(85);
    }
    return nationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelectNation()
  {
    if (selectNationEClass == null)
    {
      selectNationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(86);
    }
    return selectNationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelectNation_Value()
  {
        return (EAttribute)getSelectNation().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelectNation_Mods()
  {
        return (EReference)getSelectNation().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndepFlag()
  {
    if (indepFlagEClass == null)
    {
      indepFlagEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(87);
    }
    return indepFlagEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIndepFlag_Value()
  {
        return (EAttribute)getIndepFlag().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNationMods()
  {
    if (nationModsEClass == null)
    {
      nationModsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(88);
    }
    return nationModsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNationPattern1()
  {
    if (nationPattern1EClass == null)
    {
      nationPattern1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(89);
    }
    return nationPattern1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNationPattern2()
  {
    if (nationPattern2EClass == null)
    {
      nationPattern2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(90);
    }
    return nationPattern2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNationPattern3()
  {
    if (nationPattern3EClass == null)
    {
      nationPattern3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(91);
    }
    return nationPattern3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNationPattern4()
  {
    if (nationPattern4EClass == null)
    {
      nationPattern4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(92);
    }
    return nationPattern4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNationPattern5()
  {
    if (nationPattern5EClass == null)
    {
      nationPattern5EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(93);
    }
    return nationPattern5EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNationInst1()
  {
    if (nationInst1EClass == null)
    {
      nationInst1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(94);
    }
    return nationInst1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst1_Value()
  {
        return (EAttribute)getNationInst1().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst1_Name()
  {
        return (EAttribute)getNationInst1().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst1_Epithet()
  {
        return (EAttribute)getNationInst1().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst1_Descr()
  {
        return (EAttribute)getNationInst1().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst1_Summary()
  {
        return (EAttribute)getNationInst1().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst1_Brief()
  {
        return (EAttribute)getNationInst1().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst1_Flag()
  {
        return (EAttribute)getNationInst1().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst1_Mapbackground()
  {
        return (EAttribute)getNationInst1().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst1_Startsite()
  {
        return (EAttribute)getNationInst1().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNationInst2()
  {
    if (nationInst2EClass == null)
    {
      nationInst2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(95);
    }
    return nationInst2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Value()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Era()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Labcost()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Templecost()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Templepic()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Startunitnbrs1()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Startunitnbrs2()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Hero1()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Hero2()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Hero3()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Hero4()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Hero5()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Hero6()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Multihero1()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Multihero2()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Defmult1()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Defmult1b()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Defmult2()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Defmult2b()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Idealcold()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Castleprod()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Domkill()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Domunrest()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Startfort()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Defaultfort()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Farmfort()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Mountainfort()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Forestfort()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(27);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Swampfort()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(28);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Uwfort()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(29);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst2_Deepfort()
  {
        return (EAttribute)getNationInst2().getEStructuralFeatures().get(30);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNationInst3()
  {
    if (nationInst3EClass == null)
    {
      nationInst3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(96);
    }
    return nationInst3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst3_Clearnation()
  {
        return (EAttribute)getNationInst3().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst3_Clearrec()
  {
        return (EAttribute)getNationInst3().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst3_Clearsites()
  {
        return (EAttribute)getNationInst3().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst3_Uwnation()
  {
        return (EAttribute)getNationInst3().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst3_Bloodnation()
  {
        return (EAttribute)getNationInst3().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst3_Nopreach()
  {
        return (EAttribute)getNationInst3().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst3_Dyingdom()
  {
        return (EAttribute)getNationInst3().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst3_Sacrificedom()
  {
        return (EAttribute)getNationInst3().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst3_Nodeathsupply()
  {
        return (EAttribute)getNationInst3().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst3_Autoundead()
  {
        return (EAttribute)getNationInst3().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst3_Zombiereanim()
  {
        return (EAttribute)getNationInst3().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst3_Horsereanim()
  {
        return (EAttribute)getNationInst3().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst3_Wightreanim()
  {
        return (EAttribute)getNationInst3().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst3_Manikinreanim()
  {
        return (EAttribute)getNationInst3().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst3_Tombwyrmreanim()
  {
        return (EAttribute)getNationInst3().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNationInst4()
  {
    if (nationInst4EClass == null)
    {
      nationInst4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(97);
    }
    return nationInst4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst4_Value1()
  {
        return (EAttribute)getNationInst4().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst4_Value2()
  {
        return (EAttribute)getNationInst4().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst4_Startcom()
  {
        return (EAttribute)getNationInst4().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst4_Startscout()
  {
        return (EAttribute)getNationInst4().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst4_Startunittype1()
  {
        return (EAttribute)getNationInst4().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst4_Startunittype2()
  {
        return (EAttribute)getNationInst4().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst4_Addrecunit()
  {
        return (EAttribute)getNationInst4().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst4_Addreccom()
  {
        return (EAttribute)getNationInst4().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst4_Uwunit1()
  {
        return (EAttribute)getNationInst4().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst4_Uwunit2()
  {
        return (EAttribute)getNationInst4().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst4_Uwunit3()
  {
        return (EAttribute)getNationInst4().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst4_Uwunit4()
  {
        return (EAttribute)getNationInst4().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst4_Uwunit5()
  {
        return (EAttribute)getNationInst4().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst4_Uwcom1()
  {
        return (EAttribute)getNationInst4().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst4_Uwcom2()
  {
        return (EAttribute)getNationInst4().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst4_Uwcom3()
  {
        return (EAttribute)getNationInst4().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst4_Uwcom4()
  {
        return (EAttribute)getNationInst4().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst4_Uwcom5()
  {
        return (EAttribute)getNationInst4().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst4_Defcom1()
  {
        return (EAttribute)getNationInst4().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst4_Defcom2()
  {
        return (EAttribute)getNationInst4().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst4_Defunit1()
  {
        return (EAttribute)getNationInst4().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst4_Defunit1b()
  {
        return (EAttribute)getNationInst4().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst4_Defunit2()
  {
        return (EAttribute)getNationInst4().getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst4_Defunit2b()
  {
        return (EAttribute)getNationInst4().getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNationInst5()
  {
    if (nationInst5EClass == null)
    {
      nationInst5EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI).getEClassifiers().get(98);
    }
    return nationInst5EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst5_Value1()
  {
        return (EAttribute)getNationInst5().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst5_Value2()
  {
        return (EAttribute)getNationInst5().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst5_Value3()
  {
        return (EAttribute)getNationInst5().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNationInst5_Color()
  {
        return (EAttribute)getNationInst5().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DmFactory getDmFactory()
  {
    return (DmFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isLoaded = false;

  /**
   * Laods the package and any sub-packages from their serialized form.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void loadPackage()
  {
    if (isLoaded) return;
    isLoaded = true;

    URL url = getClass().getResource(packageFilename);
    if (url == null)
    {
      throw new RuntimeException("Missing serialized package: " + packageFilename);
    }
    URI uri = URI.createURI(url.toString());
    Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
    try
    {
      resource.load(null);
    }
    catch (IOException exception)
    {
      throw new WrappedException(exception);
    }
    initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
    createResource(eNS_URI);
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isFixed = false;

  /**
   * Fixes up the loaded package, to make it appear as if it had been programmatically built.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void fixPackageContents()
  {
    if (isFixed) return;
    isFixed = true;
    fixEClassifiers();
  }

  /**
   * Sets the instance class on the given classifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void fixInstanceClass(EClassifier eClassifier)
  {
    if (eClassifier.getInstanceClassName() == null)
    {
      eClassifier.setInstanceClassName("org.larz.dom3.dm.dm." + eClassifier.getName());
      setGeneratedClassName(eClassifier);
    }
  }

} //DmPackageImpl
