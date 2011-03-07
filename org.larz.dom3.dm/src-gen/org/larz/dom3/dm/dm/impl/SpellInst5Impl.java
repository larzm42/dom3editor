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
import org.larz.dom3.dm.dm.SpellInst5;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spell Inst5</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SpellInst5Impl#getValue1 <em>Value1</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SpellInst5Impl#getValue2 <em>Value2</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SpellInst5Impl#isCopyspell <em>Copyspell</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SpellInst5Impl#isNextspell <em>Nextspell</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpellInst5Impl extends SpellPattern5Impl implements SpellInst5
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
   * The default value of the '{@link #isCopyspell() <em>Copyspell</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCopyspell()
   * @generated
   * @ordered
   */
  protected static final boolean COPYSPELL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCopyspell() <em>Copyspell</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCopyspell()
   * @generated
   * @ordered
   */
  protected boolean copyspell = COPYSPELL_EDEFAULT;

  /**
   * The default value of the '{@link #isNextspell() <em>Nextspell</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNextspell()
   * @generated
   * @ordered
   */
  protected static final boolean NEXTSPELL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNextspell() <em>Nextspell</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNextspell()
   * @generated
   * @ordered
   */
  protected boolean nextspell = NEXTSPELL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpellInst5Impl()
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
    return DmPackage.eINSTANCE.getSpellInst5();
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SPELL_INST5__VALUE1, oldValue1, value1));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SPELL_INST5__VALUE2, oldValue2, value2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCopyspell()
  {
    return copyspell;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCopyspell(boolean newCopyspell)
  {
    boolean oldCopyspell = copyspell;
    copyspell = newCopyspell;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SPELL_INST5__COPYSPELL, oldCopyspell, copyspell));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNextspell()
  {
    return nextspell;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNextspell(boolean newNextspell)
  {
    boolean oldNextspell = nextspell;
    nextspell = newNextspell;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SPELL_INST5__NEXTSPELL, oldNextspell, nextspell));
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
      case DmPackage.SPELL_INST5__VALUE1:
        return getValue1();
      case DmPackage.SPELL_INST5__VALUE2:
        return getValue2();
      case DmPackage.SPELL_INST5__COPYSPELL:
        return isCopyspell();
      case DmPackage.SPELL_INST5__NEXTSPELL:
        return isNextspell();
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
      case DmPackage.SPELL_INST5__VALUE1:
        setValue1((String)newValue);
        return;
      case DmPackage.SPELL_INST5__VALUE2:
        setValue2((Integer)newValue);
        return;
      case DmPackage.SPELL_INST5__COPYSPELL:
        setCopyspell((Boolean)newValue);
        return;
      case DmPackage.SPELL_INST5__NEXTSPELL:
        setNextspell((Boolean)newValue);
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
      case DmPackage.SPELL_INST5__VALUE1:
        setValue1(VALUE1_EDEFAULT);
        return;
      case DmPackage.SPELL_INST5__VALUE2:
        setValue2(VALUE2_EDEFAULT);
        return;
      case DmPackage.SPELL_INST5__COPYSPELL:
        setCopyspell(COPYSPELL_EDEFAULT);
        return;
      case DmPackage.SPELL_INST5__NEXTSPELL:
        setNextspell(NEXTSPELL_EDEFAULT);
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
      case DmPackage.SPELL_INST5__VALUE1:
        return VALUE1_EDEFAULT == null ? value1 != null : !VALUE1_EDEFAULT.equals(value1);
      case DmPackage.SPELL_INST5__VALUE2:
        return value2 != VALUE2_EDEFAULT;
      case DmPackage.SPELL_INST5__COPYSPELL:
        return copyspell != COPYSPELL_EDEFAULT;
      case DmPackage.SPELL_INST5__NEXTSPELL:
        return nextspell != NEXTSPELL_EDEFAULT;
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
    result.append(", copyspell: ");
    result.append(copyspell);
    result.append(", nextspell: ");
    result.append(nextspell);
    result.append(')');
    return result.toString();
  }

} //SpellInst5Impl
