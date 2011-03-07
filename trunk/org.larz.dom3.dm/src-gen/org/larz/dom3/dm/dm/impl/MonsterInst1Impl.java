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
import org.larz.dom3.dm.dm.MonsterInst1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monster Inst1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst1Impl#getValue <em>Value</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst1Impl#isName <em>Name</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst1Impl#isSpr1 <em>Spr1</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst1Impl#isSpr2 <em>Spr2</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst1Impl#isDescr <em>Descr</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst1Impl#isArmor <em>Armor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MonsterInst1Impl extends MonsterPattern1Impl implements MonsterInst1
{
  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isName()
   * @generated
   * @ordered
   */
  protected static final boolean NAME_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isName()
   * @generated
   * @ordered
   */
  protected boolean name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isSpr1() <em>Spr1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSpr1()
   * @generated
   * @ordered
   */
  protected static final boolean SPR1_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSpr1() <em>Spr1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSpr1()
   * @generated
   * @ordered
   */
  protected boolean spr1 = SPR1_EDEFAULT;

  /**
   * The default value of the '{@link #isSpr2() <em>Spr2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSpr2()
   * @generated
   * @ordered
   */
  protected static final boolean SPR2_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSpr2() <em>Spr2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSpr2()
   * @generated
   * @ordered
   */
  protected boolean spr2 = SPR2_EDEFAULT;

  /**
   * The default value of the '{@link #isDescr() <em>Descr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDescr()
   * @generated
   * @ordered
   */
  protected static final boolean DESCR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDescr() <em>Descr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDescr()
   * @generated
   * @ordered
   */
  protected boolean descr = DESCR_EDEFAULT;

  /**
   * The default value of the '{@link #isArmor() <em>Armor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isArmor()
   * @generated
   * @ordered
   */
  protected static final boolean ARMOR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isArmor() <em>Armor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isArmor()
   * @generated
   * @ordered
   */
  protected boolean armor = ARMOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MonsterInst1Impl()
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
    return DmPackage.eINSTANCE.getMonsterInst1();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST1__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(boolean newName)
  {
    boolean oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST1__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSpr1()
  {
    return spr1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpr1(boolean newSpr1)
  {
    boolean oldSpr1 = spr1;
    spr1 = newSpr1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST1__SPR1, oldSpr1, spr1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSpr2()
  {
    return spr2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpr2(boolean newSpr2)
  {
    boolean oldSpr2 = spr2;
    spr2 = newSpr2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST1__SPR2, oldSpr2, spr2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDescr()
  {
    return descr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescr(boolean newDescr)
  {
    boolean oldDescr = descr;
    descr = newDescr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST1__DESCR, oldDescr, descr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isArmor()
  {
    return armor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArmor(boolean newArmor)
  {
    boolean oldArmor = armor;
    armor = newArmor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST1__ARMOR, oldArmor, armor));
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
      case DmPackage.MONSTER_INST1__VALUE:
        return getValue();
      case DmPackage.MONSTER_INST1__NAME:
        return isName();
      case DmPackage.MONSTER_INST1__SPR1:
        return isSpr1();
      case DmPackage.MONSTER_INST1__SPR2:
        return isSpr2();
      case DmPackage.MONSTER_INST1__DESCR:
        return isDescr();
      case DmPackage.MONSTER_INST1__ARMOR:
        return isArmor();
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
      case DmPackage.MONSTER_INST1__VALUE:
        setValue((String)newValue);
        return;
      case DmPackage.MONSTER_INST1__NAME:
        setName((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST1__SPR1:
        setSpr1((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST1__SPR2:
        setSpr2((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST1__DESCR:
        setDescr((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST1__ARMOR:
        setArmor((Boolean)newValue);
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
      case DmPackage.MONSTER_INST1__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST1__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST1__SPR1:
        setSpr1(SPR1_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST1__SPR2:
        setSpr2(SPR2_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST1__DESCR:
        setDescr(DESCR_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST1__ARMOR:
        setArmor(ARMOR_EDEFAULT);
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
      case DmPackage.MONSTER_INST1__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case DmPackage.MONSTER_INST1__NAME:
        return name != NAME_EDEFAULT;
      case DmPackage.MONSTER_INST1__SPR1:
        return spr1 != SPR1_EDEFAULT;
      case DmPackage.MONSTER_INST1__SPR2:
        return spr2 != SPR2_EDEFAULT;
      case DmPackage.MONSTER_INST1__DESCR:
        return descr != DESCR_EDEFAULT;
      case DmPackage.MONSTER_INST1__ARMOR:
        return armor != ARMOR_EDEFAULT;
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
    result.append(", name: ");
    result.append(name);
    result.append(", spr1: ");
    result.append(spr1);
    result.append(", spr2: ");
    result.append(spr2);
    result.append(", descr: ");
    result.append(descr);
    result.append(", armor: ");
    result.append(armor);
    result.append(')');
    return result.toString();
  }

} //MonsterInst1Impl
