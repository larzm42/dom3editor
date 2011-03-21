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
import org.larz.dom3.dm.dm.SpellInst3;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spell Inst3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SpellInst3Impl#getValue1 <em>Value1</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SpellInst3Impl#getValue2 <em>Value2</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SpellInst3Impl#isPath <em>Path</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SpellInst3Impl#isPathlevel <em>Pathlevel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpellInst3Impl extends SpellPattern3Impl implements SpellInst3
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
   * The default value of the '{@link #isPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPath()
   * @generated
   * @ordered
   */
  protected static final boolean PATH_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPath()
   * @generated
   * @ordered
   */
  protected boolean path = PATH_EDEFAULT;

  /**
   * The default value of the '{@link #isPathlevel() <em>Pathlevel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPathlevel()
   * @generated
   * @ordered
   */
  protected static final boolean PATHLEVEL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPathlevel() <em>Pathlevel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPathlevel()
   * @generated
   * @ordered
   */
  protected boolean pathlevel = PATHLEVEL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpellInst3Impl()
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
    return DmPackage.eINSTANCE.getSpellInst3();
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SPELL_INST3__VALUE1, oldValue1, value1));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SPELL_INST3__VALUE2, oldValue2, value2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPath(boolean newPath)
  {
    boolean oldPath = path;
    path = newPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SPELL_INST3__PATH, oldPath, path));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPathlevel()
  {
    return pathlevel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPathlevel(boolean newPathlevel)
  {
    boolean oldPathlevel = pathlevel;
    pathlevel = newPathlevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SPELL_INST3__PATHLEVEL, oldPathlevel, pathlevel));
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
      case DmPackage.SPELL_INST3__VALUE1:
        return getValue1();
      case DmPackage.SPELL_INST3__VALUE2:
        return getValue2();
      case DmPackage.SPELL_INST3__PATH:
        return isPath();
      case DmPackage.SPELL_INST3__PATHLEVEL:
        return isPathlevel();
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
      case DmPackage.SPELL_INST3__VALUE1:
        setValue1((Integer)newValue);
        return;
      case DmPackage.SPELL_INST3__VALUE2:
        setValue2((Integer)newValue);
        return;
      case DmPackage.SPELL_INST3__PATH:
        setPath((Boolean)newValue);
        return;
      case DmPackage.SPELL_INST3__PATHLEVEL:
        setPathlevel((Boolean)newValue);
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
      case DmPackage.SPELL_INST3__VALUE1:
        setValue1(VALUE1_EDEFAULT);
        return;
      case DmPackage.SPELL_INST3__VALUE2:
        setValue2(VALUE2_EDEFAULT);
        return;
      case DmPackage.SPELL_INST3__PATH:
        setPath(PATH_EDEFAULT);
        return;
      case DmPackage.SPELL_INST3__PATHLEVEL:
        setPathlevel(PATHLEVEL_EDEFAULT);
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
      case DmPackage.SPELL_INST3__VALUE1:
        return value1 != VALUE1_EDEFAULT;
      case DmPackage.SPELL_INST3__VALUE2:
        return value2 != VALUE2_EDEFAULT;
      case DmPackage.SPELL_INST3__PATH:
        return path != PATH_EDEFAULT;
      case DmPackage.SPELL_INST3__PATHLEVEL:
        return pathlevel != PATHLEVEL_EDEFAULT;
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
    result.append(", path: ");
    result.append(path);
    result.append(", pathlevel: ");
    result.append(pathlevel);
    result.append(')');
    return result.toString();
  }

} //SpellInst3Impl
