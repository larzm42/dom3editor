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
import org.larz.dom3.dm.dm.MonsterInst3;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monster Inst3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst3Impl#getValue1 <em>Value1</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst3Impl#getValue2 <em>Value2</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst3Impl#isMagicskill <em>Magicskill</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst3Impl#isCustommagic <em>Custommagic</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst3Impl#isMagicboost <em>Magicboost</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst3Impl#isGemprod <em>Gemprod</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MonsterInst3Impl extends MonsterPattern3Impl implements MonsterInst3
{
  /**
   * The default value of the '{@link #getValue1() <em>Value1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue1()
   * @generated
   * @ordered
   */
  protected static final int VALUE1_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValue1() <em>Value1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue1()
   * @generated
   * @ordered
   */
  protected int value1 = VALUE1_EDEFAULT;

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
   * The default value of the '{@link #isMagicskill() <em>Magicskill</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMagicskill()
   * @generated
   * @ordered
   */
  protected static final boolean MAGICSKILL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMagicskill() <em>Magicskill</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMagicskill()
   * @generated
   * @ordered
   */
  protected boolean magicskill = MAGICSKILL_EDEFAULT;

  /**
   * The default value of the '{@link #isCustommagic() <em>Custommagic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCustommagic()
   * @generated
   * @ordered
   */
  protected static final boolean CUSTOMMAGIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCustommagic() <em>Custommagic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCustommagic()
   * @generated
   * @ordered
   */
  protected boolean custommagic = CUSTOMMAGIC_EDEFAULT;

  /**
   * The default value of the '{@link #isMagicboost() <em>Magicboost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMagicboost()
   * @generated
   * @ordered
   */
  protected static final boolean MAGICBOOST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMagicboost() <em>Magicboost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMagicboost()
   * @generated
   * @ordered
   */
  protected boolean magicboost = MAGICBOOST_EDEFAULT;

  /**
   * The default value of the '{@link #isGemprod() <em>Gemprod</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGemprod()
   * @generated
   * @ordered
   */
  protected static final boolean GEMPROD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isGemprod() <em>Gemprod</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGemprod()
   * @generated
   * @ordered
   */
  protected boolean gemprod = GEMPROD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MonsterInst3Impl()
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
    return DmPackage.eINSTANCE.getMonsterInst3();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue1()
  {
    return value1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue1(int newValue1)
  {
    int oldValue1 = value1;
    value1 = newValue1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST3__VALUE1, oldValue1, value1));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST3__VALUE2, oldValue2, value2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMagicskill()
  {
    return magicskill;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMagicskill(boolean newMagicskill)
  {
    boolean oldMagicskill = magicskill;
    magicskill = newMagicskill;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST3__MAGICSKILL, oldMagicskill, magicskill));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCustommagic()
  {
    return custommagic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCustommagic(boolean newCustommagic)
  {
    boolean oldCustommagic = custommagic;
    custommagic = newCustommagic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST3__CUSTOMMAGIC, oldCustommagic, custommagic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMagicboost()
  {
    return magicboost;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMagicboost(boolean newMagicboost)
  {
    boolean oldMagicboost = magicboost;
    magicboost = newMagicboost;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST3__MAGICBOOST, oldMagicboost, magicboost));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isGemprod()
  {
    return gemprod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGemprod(boolean newGemprod)
  {
    boolean oldGemprod = gemprod;
    gemprod = newGemprod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST3__GEMPROD, oldGemprod, gemprod));
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
      case DmPackage.MONSTER_INST3__VALUE1:
        return getValue1();
      case DmPackage.MONSTER_INST3__VALUE2:
        return getValue2();
      case DmPackage.MONSTER_INST3__MAGICSKILL:
        return isMagicskill();
      case DmPackage.MONSTER_INST3__CUSTOMMAGIC:
        return isCustommagic();
      case DmPackage.MONSTER_INST3__MAGICBOOST:
        return isMagicboost();
      case DmPackage.MONSTER_INST3__GEMPROD:
        return isGemprod();
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
      case DmPackage.MONSTER_INST3__VALUE1:
        setValue1((Integer)newValue);
        return;
      case DmPackage.MONSTER_INST3__VALUE2:
        setValue2((Integer)newValue);
        return;
      case DmPackage.MONSTER_INST3__MAGICSKILL:
        setMagicskill((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST3__CUSTOMMAGIC:
        setCustommagic((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST3__MAGICBOOST:
        setMagicboost((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST3__GEMPROD:
        setGemprod((Boolean)newValue);
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
      case DmPackage.MONSTER_INST3__VALUE1:
        setValue1(VALUE1_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST3__VALUE2:
        setValue2(VALUE2_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST3__MAGICSKILL:
        setMagicskill(MAGICSKILL_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST3__CUSTOMMAGIC:
        setCustommagic(CUSTOMMAGIC_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST3__MAGICBOOST:
        setMagicboost(MAGICBOOST_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST3__GEMPROD:
        setGemprod(GEMPROD_EDEFAULT);
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
      case DmPackage.MONSTER_INST3__VALUE1:
        return value1 != VALUE1_EDEFAULT;
      case DmPackage.MONSTER_INST3__VALUE2:
        return value2 != VALUE2_EDEFAULT;
      case DmPackage.MONSTER_INST3__MAGICSKILL:
        return magicskill != MAGICSKILL_EDEFAULT;
      case DmPackage.MONSTER_INST3__CUSTOMMAGIC:
        return custommagic != CUSTOMMAGIC_EDEFAULT;
      case DmPackage.MONSTER_INST3__MAGICBOOST:
        return magicboost != MAGICBOOST_EDEFAULT;
      case DmPackage.MONSTER_INST3__GEMPROD:
        return gemprod != GEMPROD_EDEFAULT;
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
    result.append(", magicskill: ");
    result.append(magicskill);
    result.append(", custommagic: ");
    result.append(custommagic);
    result.append(", magicboost: ");
    result.append(magicboost);
    result.append(", gemprod: ");
    result.append(gemprod);
    result.append(')');
    return result.toString();
  }

} //MonsterInst3Impl
