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
import org.larz.dom3.dm.dm.SpellInst4;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spell Inst4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SpellInst4Impl#isClear <em>Clear</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpellInst4Impl extends SpellPattern4Impl implements SpellInst4
{
  /**
   * The default value of the '{@link #isClear() <em>Clear</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isClear()
   * @generated
   * @ordered
   */
  protected static final boolean CLEAR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isClear() <em>Clear</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isClear()
   * @generated
   * @ordered
   */
  protected boolean clear = CLEAR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpellInst4Impl()
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
    return DmPackage.eINSTANCE.getSpellInst4();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isClear()
  {
    return clear;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClear(boolean newClear)
  {
    boolean oldClear = clear;
    clear = newClear;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SPELL_INST4__CLEAR, oldClear, clear));
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
      case DmPackage.SPELL_INST4__CLEAR:
        return isClear();
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
      case DmPackage.SPELL_INST4__CLEAR:
        setClear((Boolean)newValue);
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
      case DmPackage.SPELL_INST4__CLEAR:
        setClear(CLEAR_EDEFAULT);
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
      case DmPackage.SPELL_INST4__CLEAR:
        return clear != CLEAR_EDEFAULT;
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
    result.append(" (clear: ");
    result.append(clear);
    result.append(')');
    return result.toString();
  }

} //SpellInst4Impl
