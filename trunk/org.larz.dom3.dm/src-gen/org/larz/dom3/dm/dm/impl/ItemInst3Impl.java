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
import org.larz.dom3.dm.dm.ItemInst3;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Inst3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.impl.ItemInst3Impl#getValue1 <em>Value1</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.ItemInst3Impl#getValue2 <em>Value2</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.ItemInst3Impl#isCopyspr <em>Copyspr</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.ItemInst3Impl#isWeapon <em>Weapon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemInst3Impl extends ItemPattern3Impl implements ItemInst3
{
  /**
   * The default value of the '{@link #getValue1() <em>Value1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue1()
   * @generated
   * @ordered
   */
  protected static final String VALUE1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue1() <em>Value1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue1()
   * @generated
   * @ordered
   */
  protected String value1 = VALUE1_EDEFAULT;

  /**
   * The default value of the '{@link #getValue2() <em>Value2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue2()
   * @generated
   * @ordered
   */
  protected static final int VALUE2_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValue2() <em>Value2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue2()
   * @generated
   * @ordered
   */
  protected int value2 = VALUE2_EDEFAULT;

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
   * The default value of the '{@link #isWeapon() <em>Weapon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWeapon()
   * @generated
   * @ordered
   */
  protected static final boolean WEAPON_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isWeapon() <em>Weapon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWeapon()
   * @generated
   * @ordered
   */
  protected boolean weapon = WEAPON_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ItemInst3Impl()
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
    return DmPackage.eINSTANCE.getItemInst3();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue1()
  {
    return value1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue1(String newValue1)
  {
    String oldValue1 = value1;
    value1 = newValue1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ITEM_INST3__VALUE1, oldValue1, value1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue2()
  {
    return value2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue2(int newValue2)
  {
    int oldValue2 = value2;
    value2 = newValue2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ITEM_INST3__VALUE2, oldValue2, value2));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ITEM_INST3__COPYSPR, oldCopyspr, copyspr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isWeapon()
  {
    return weapon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeapon(boolean newWeapon)
  {
    boolean oldWeapon = weapon;
    weapon = newWeapon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ITEM_INST3__WEAPON, oldWeapon, weapon));
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
      case DmPackage.ITEM_INST3__VALUE1:
        return getValue1();
      case DmPackage.ITEM_INST3__VALUE2:
        return getValue2();
      case DmPackage.ITEM_INST3__COPYSPR:
        return isCopyspr();
      case DmPackage.ITEM_INST3__WEAPON:
        return isWeapon();
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
      case DmPackage.ITEM_INST3__VALUE1:
        setValue1((String)newValue);
        return;
      case DmPackage.ITEM_INST3__VALUE2:
        setValue2((Integer)newValue);
        return;
      case DmPackage.ITEM_INST3__COPYSPR:
        setCopyspr((Boolean)newValue);
        return;
      case DmPackage.ITEM_INST3__WEAPON:
        setWeapon((Boolean)newValue);
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
      case DmPackage.ITEM_INST3__VALUE1:
        setValue1(VALUE1_EDEFAULT);
        return;
      case DmPackage.ITEM_INST3__VALUE2:
        setValue2(VALUE2_EDEFAULT);
        return;
      case DmPackage.ITEM_INST3__COPYSPR:
        setCopyspr(COPYSPR_EDEFAULT);
        return;
      case DmPackage.ITEM_INST3__WEAPON:
        setWeapon(WEAPON_EDEFAULT);
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
      case DmPackage.ITEM_INST3__VALUE1:
        return VALUE1_EDEFAULT == null ? value1 != null : !VALUE1_EDEFAULT.equals(value1);
      case DmPackage.ITEM_INST3__VALUE2:
        return value2 != VALUE2_EDEFAULT;
      case DmPackage.ITEM_INST3__COPYSPR:
        return copyspr != COPYSPR_EDEFAULT;
      case DmPackage.ITEM_INST3__WEAPON:
        return weapon != WEAPON_EDEFAULT;
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
    result.append(" (value1: ");
    result.append(value1);
    result.append(", value2: ");
    result.append(value2);
    result.append(", copyspr: ");
    result.append(copyspr);
    result.append(", weapon: ");
    result.append(weapon);
    result.append(')');
    return result.toString();
  }

} //ItemInst3Impl
