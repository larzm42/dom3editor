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
import org.larz.dom3.dm.dm.MonsterInst6;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monster Inst6</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst6Impl#getValue <em>Value</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst6Impl#isStealthy <em>Stealthy</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst6Impl#isHeat <em>Heat</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.MonsterInst6Impl#isCold <em>Cold</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MonsterInst6Impl extends MonsterPattern6Impl implements MonsterInst6
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
   * The default value of the '{@link #isStealthy() <em>Stealthy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStealthy()
   * @generated
   * @ordered
   */
  protected static final boolean STEALTHY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStealthy() <em>Stealthy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStealthy()
   * @generated
   * @ordered
   */
  protected boolean stealthy = STEALTHY_EDEFAULT;

  /**
   * The default value of the '{@link #isHeat() <em>Heat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHeat()
   * @generated
   * @ordered
   */
  protected static final boolean HEAT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHeat() <em>Heat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHeat()
   * @generated
   * @ordered
   */
  protected boolean heat = HEAT_EDEFAULT;

  /**
   * The default value of the '{@link #isCold() <em>Cold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCold()
   * @generated
   * @ordered
   */
  protected static final boolean COLD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCold() <em>Cold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCold()
   * @generated
   * @ordered
   */
  protected boolean cold = COLD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MonsterInst6Impl()
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
    return DmPackage.eINSTANCE.getMonsterInst6();
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST6__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStealthy()
  {
    return stealthy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStealthy(boolean newStealthy)
  {
    boolean oldStealthy = stealthy;
    stealthy = newStealthy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST6__STEALTHY, oldStealthy, stealthy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHeat()
  {
    return heat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeat(boolean newHeat)
  {
    boolean oldHeat = heat;
    heat = newHeat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST6__HEAT, oldHeat, heat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCold()
  {
    return cold;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCold(boolean newCold)
  {
    boolean oldCold = cold;
    cold = newCold;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.MONSTER_INST6__COLD, oldCold, cold));
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
      case DmPackage.MONSTER_INST6__VALUE:
        return getValue();
      case DmPackage.MONSTER_INST6__STEALTHY:
        return isStealthy();
      case DmPackage.MONSTER_INST6__HEAT:
        return isHeat();
      case DmPackage.MONSTER_INST6__COLD:
        return isCold();
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
      case DmPackage.MONSTER_INST6__VALUE:
        setValue((Integer)newValue);
        return;
      case DmPackage.MONSTER_INST6__STEALTHY:
        setStealthy((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST6__HEAT:
        setHeat((Boolean)newValue);
        return;
      case DmPackage.MONSTER_INST6__COLD:
        setCold((Boolean)newValue);
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
      case DmPackage.MONSTER_INST6__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST6__STEALTHY:
        setStealthy(STEALTHY_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST6__HEAT:
        setHeat(HEAT_EDEFAULT);
        return;
      case DmPackage.MONSTER_INST6__COLD:
        setCold(COLD_EDEFAULT);
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
      case DmPackage.MONSTER_INST6__VALUE:
        return value != VALUE_EDEFAULT;
      case DmPackage.MONSTER_INST6__STEALTHY:
        return stealthy != STEALTHY_EDEFAULT;
      case DmPackage.MONSTER_INST6__HEAT:
        return heat != HEAT_EDEFAULT;
      case DmPackage.MONSTER_INST6__COLD:
        return cold != COLD_EDEFAULT;
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
    result.append(", stealthy: ");
    result.append(stealthy);
    result.append(", heat: ");
    result.append(heat);
    result.append(", cold: ");
    result.append(cold);
    result.append(')');
    return result.toString();
  }

} //MonsterInst6Impl
