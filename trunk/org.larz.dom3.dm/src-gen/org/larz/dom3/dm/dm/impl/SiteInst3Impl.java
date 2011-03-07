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
import org.larz.dom3.dm.dm.SiteInst3;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Site Inst3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SiteInst3Impl#getValue1 <em>Value1</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SiteInst3Impl#getValue2 <em>Value2</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SiteInst3Impl#isGems <em>Gems</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SiteInst3Impl extends SitePattern3Impl implements SiteInst3
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
   * The default value of the '{@link #isGems() <em>Gems</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGems()
   * @generated
   * @ordered
   */
  protected static final boolean GEMS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isGems() <em>Gems</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGems()
   * @generated
   * @ordered
   */
  protected boolean gems = GEMS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SiteInst3Impl()
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
    return DmPackage.eINSTANCE.getSiteInst3();
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SITE_INST3__VALUE1, oldValue1, value1));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SITE_INST3__VALUE2, oldValue2, value2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isGems()
  {
    return gems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGems(boolean newGems)
  {
    boolean oldGems = gems;
    gems = newGems;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SITE_INST3__GEMS, oldGems, gems));
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
      case DmPackage.SITE_INST3__VALUE1:
        return getValue1();
      case DmPackage.SITE_INST3__VALUE2:
        return getValue2();
      case DmPackage.SITE_INST3__GEMS:
        return isGems();
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
      case DmPackage.SITE_INST3__VALUE1:
        setValue1((Integer)newValue);
        return;
      case DmPackage.SITE_INST3__VALUE2:
        setValue2((Integer)newValue);
        return;
      case DmPackage.SITE_INST3__GEMS:
        setGems((Boolean)newValue);
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
      case DmPackage.SITE_INST3__VALUE1:
        setValue1(VALUE1_EDEFAULT);
        return;
      case DmPackage.SITE_INST3__VALUE2:
        setValue2(VALUE2_EDEFAULT);
        return;
      case DmPackage.SITE_INST3__GEMS:
        setGems(GEMS_EDEFAULT);
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
      case DmPackage.SITE_INST3__VALUE1:
        return value1 != VALUE1_EDEFAULT;
      case DmPackage.SITE_INST3__VALUE2:
        return value2 != VALUE2_EDEFAULT;
      case DmPackage.SITE_INST3__GEMS:
        return gems != GEMS_EDEFAULT;
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
    result.append(", gems: ");
    result.append(gems);
    result.append(')');
    return result.toString();
  }

} //SiteInst3Impl
