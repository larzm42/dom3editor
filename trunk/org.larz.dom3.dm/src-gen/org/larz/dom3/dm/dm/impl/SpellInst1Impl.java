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
import org.larz.dom3.dm.dm.SpellInst1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spell Inst1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SpellInst1Impl#getValue <em>Value</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SpellInst1Impl#isName <em>Name</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SpellInst1Impl#isDescr <em>Descr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpellInst1Impl extends SpellPattern1Impl implements SpellInst1
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpellInst1Impl()
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
    return DmPackage.eINSTANCE.getSpellInst1();
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SPELL_INST1__VALUE, oldValue, value));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SPELL_INST1__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SPELL_INST1__DESCR, oldDescr, descr));
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
      case DmPackage.SPELL_INST1__VALUE:
        return getValue();
      case DmPackage.SPELL_INST1__NAME:
        return isName();
      case DmPackage.SPELL_INST1__DESCR:
        return isDescr();
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
      case DmPackage.SPELL_INST1__VALUE:
        setValue((String)newValue);
        return;
      case DmPackage.SPELL_INST1__NAME:
        setName((Boolean)newValue);
        return;
      case DmPackage.SPELL_INST1__DESCR:
        setDescr((Boolean)newValue);
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
      case DmPackage.SPELL_INST1__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case DmPackage.SPELL_INST1__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DmPackage.SPELL_INST1__DESCR:
        setDescr(DESCR_EDEFAULT);
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
      case DmPackage.SPELL_INST1__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case DmPackage.SPELL_INST1__NAME:
        return name != NAME_EDEFAULT;
      case DmPackage.SPELL_INST1__DESCR:
        return descr != DESCR_EDEFAULT;
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
    result.append(", descr: ");
    result.append(descr);
    result.append(')');
    return result.toString();
  }

} //SpellInst1Impl
