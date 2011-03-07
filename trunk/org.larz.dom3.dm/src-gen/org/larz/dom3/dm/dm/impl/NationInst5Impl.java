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
import org.larz.dom3.dm.dm.NationInst5;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nation Inst5</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.impl.NationInst5Impl#getValue1 <em>Value1</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.NationInst5Impl#getValue2 <em>Value2</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.NationInst5Impl#getValue3 <em>Value3</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.NationInst5Impl#isColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NationInst5Impl extends NationPattern5Impl implements NationInst5
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
  protected static final String VALUE2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue2() <em>Value2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue2()
   * @generated
   * @ordered
   */
  protected String value2 = VALUE2_EDEFAULT;

  /**
   * The default value of the '{@link #getValue3() <em>Value3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue3()
   * @generated
   * @ordered
   */
  protected static final String VALUE3_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue3() <em>Value3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue3()
   * @generated
   * @ordered
   */
  protected String value3 = VALUE3_EDEFAULT;

  /**
   * The default value of the '{@link #isColor() <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isColor()
   * @generated
   * @ordered
   */
  protected static final boolean COLOR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isColor() <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isColor()
   * @generated
   * @ordered
   */
  protected boolean color = COLOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NationInst5Impl()
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
    return DmPackage.eINSTANCE.getNationInst5();
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.NATION_INST5__VALUE1, oldValue1, value1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue2()
  {
    return value2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue2(String newValue2)
  {
    String oldValue2 = value2;
    value2 = newValue2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.NATION_INST5__VALUE2, oldValue2, value2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue3()
  {
    return value3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue3(String newValue3)
  {
    String oldValue3 = value3;
    value3 = newValue3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.NATION_INST5__VALUE3, oldValue3, value3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isColor()
  {
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColor(boolean newColor)
  {
    boolean oldColor = color;
    color = newColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.NATION_INST5__COLOR, oldColor, color));
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
      case DmPackage.NATION_INST5__VALUE1:
        return getValue1();
      case DmPackage.NATION_INST5__VALUE2:
        return getValue2();
      case DmPackage.NATION_INST5__VALUE3:
        return getValue3();
      case DmPackage.NATION_INST5__COLOR:
        return isColor();
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
      case DmPackage.NATION_INST5__VALUE1:
        setValue1((String)newValue);
        return;
      case DmPackage.NATION_INST5__VALUE2:
        setValue2((String)newValue);
        return;
      case DmPackage.NATION_INST5__VALUE3:
        setValue3((String)newValue);
        return;
      case DmPackage.NATION_INST5__COLOR:
        setColor((Boolean)newValue);
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
      case DmPackage.NATION_INST5__VALUE1:
        setValue1(VALUE1_EDEFAULT);
        return;
      case DmPackage.NATION_INST5__VALUE2:
        setValue2(VALUE2_EDEFAULT);
        return;
      case DmPackage.NATION_INST5__VALUE3:
        setValue3(VALUE3_EDEFAULT);
        return;
      case DmPackage.NATION_INST5__COLOR:
        setColor(COLOR_EDEFAULT);
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
      case DmPackage.NATION_INST5__VALUE1:
        return VALUE1_EDEFAULT == null ? value1 != null : !VALUE1_EDEFAULT.equals(value1);
      case DmPackage.NATION_INST5__VALUE2:
        return VALUE2_EDEFAULT == null ? value2 != null : !VALUE2_EDEFAULT.equals(value2);
      case DmPackage.NATION_INST5__VALUE3:
        return VALUE3_EDEFAULT == null ? value3 != null : !VALUE3_EDEFAULT.equals(value3);
      case DmPackage.NATION_INST5__COLOR:
        return color != COLOR_EDEFAULT;
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
    result.append(", value3: ");
    result.append(value3);
    result.append(", color: ");
    result.append(color);
    result.append(')');
    return result.toString();
  }

} //NationInst5Impl
