/**
 * <copyright>
 * </copyright>
 *

 */
package org.larz.dom3.dm.dm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.larz.dom3.dm.dm.ArmorInst2;
import org.larz.dom3.dm.dm.DmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Armor Inst2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.impl.ArmorInst2Impl#getValue <em>Value</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.ArmorInst2Impl#isType <em>Type</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.ArmorInst2Impl#isProt <em>Prot</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.ArmorInst2Impl#isDef <em>Def</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.ArmorInst2Impl#isEnc <em>Enc</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.ArmorInst2Impl#isRcost <em>Rcost</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArmorInst2Impl extends ArmorPattern2Impl implements ArmorInst2
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
   * The default value of the '{@link #isType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isType()
   * @generated
   * @ordered
   */
  protected static final boolean TYPE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isType()
   * @generated
   * @ordered
   */
  protected boolean type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isProt() <em>Prot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isProt()
   * @generated
   * @ordered
   */
  protected static final boolean PROT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isProt() <em>Prot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isProt()
   * @generated
   * @ordered
   */
  protected boolean prot = PROT_EDEFAULT;

  /**
   * The default value of the '{@link #isDef() <em>Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDef()
   * @generated
   * @ordered
   */
  protected static final boolean DEF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDef() <em>Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDef()
   * @generated
   * @ordered
   */
  protected boolean def = DEF_EDEFAULT;

  /**
   * The default value of the '{@link #isEnc() <em>Enc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnc()
   * @generated
   * @ordered
   */
  protected static final boolean ENC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEnc() <em>Enc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnc()
   * @generated
   * @ordered
   */
  protected boolean enc = ENC_EDEFAULT;

  /**
   * The default value of the '{@link #isRcost() <em>Rcost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRcost()
   * @generated
   * @ordered
   */
  protected static final boolean RCOST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRcost() <em>Rcost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRcost()
   * @generated
   * @ordered
   */
  protected boolean rcost = RCOST_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArmorInst2Impl()
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
    return DmPackage.eINSTANCE.getArmorInst2();
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ARMOR_INST2__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(boolean newType)
  {
    boolean oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ARMOR_INST2__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isProt()
  {
    return prot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProt(boolean newProt)
  {
    boolean oldProt = prot;
    prot = newProt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ARMOR_INST2__PROT, oldProt, prot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDef()
  {
    return def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDef(boolean newDef)
  {
    boolean oldDef = def;
    def = newDef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ARMOR_INST2__DEF, oldDef, def));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEnc()
  {
    return enc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnc(boolean newEnc)
  {
    boolean oldEnc = enc;
    enc = newEnc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ARMOR_INST2__ENC, oldEnc, enc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRcost()
  {
    return rcost;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRcost(boolean newRcost)
  {
    boolean oldRcost = rcost;
    rcost = newRcost;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ARMOR_INST2__RCOST, oldRcost, rcost));
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
      case DmPackage.ARMOR_INST2__VALUE:
        return getValue();
      case DmPackage.ARMOR_INST2__TYPE:
        return isType();
      case DmPackage.ARMOR_INST2__PROT:
        return isProt();
      case DmPackage.ARMOR_INST2__DEF:
        return isDef();
      case DmPackage.ARMOR_INST2__ENC:
        return isEnc();
      case DmPackage.ARMOR_INST2__RCOST:
        return isRcost();
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
      case DmPackage.ARMOR_INST2__VALUE:
        setValue((Integer)newValue);
        return;
      case DmPackage.ARMOR_INST2__TYPE:
        setType((Boolean)newValue);
        return;
      case DmPackage.ARMOR_INST2__PROT:
        setProt((Boolean)newValue);
        return;
      case DmPackage.ARMOR_INST2__DEF:
        setDef((Boolean)newValue);
        return;
      case DmPackage.ARMOR_INST2__ENC:
        setEnc((Boolean)newValue);
        return;
      case DmPackage.ARMOR_INST2__RCOST:
        setRcost((Boolean)newValue);
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
      case DmPackage.ARMOR_INST2__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case DmPackage.ARMOR_INST2__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case DmPackage.ARMOR_INST2__PROT:
        setProt(PROT_EDEFAULT);
        return;
      case DmPackage.ARMOR_INST2__DEF:
        setDef(DEF_EDEFAULT);
        return;
      case DmPackage.ARMOR_INST2__ENC:
        setEnc(ENC_EDEFAULT);
        return;
      case DmPackage.ARMOR_INST2__RCOST:
        setRcost(RCOST_EDEFAULT);
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
      case DmPackage.ARMOR_INST2__VALUE:
        return value != VALUE_EDEFAULT;
      case DmPackage.ARMOR_INST2__TYPE:
        return type != TYPE_EDEFAULT;
      case DmPackage.ARMOR_INST2__PROT:
        return prot != PROT_EDEFAULT;
      case DmPackage.ARMOR_INST2__DEF:
        return def != DEF_EDEFAULT;
      case DmPackage.ARMOR_INST2__ENC:
        return enc != ENC_EDEFAULT;
      case DmPackage.ARMOR_INST2__RCOST:
        return rcost != RCOST_EDEFAULT;
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
    result.append(", type: ");
    result.append(type);
    result.append(", prot: ");
    result.append(prot);
    result.append(", def: ");
    result.append(def);
    result.append(", enc: ");
    result.append(enc);
    result.append(", rcost: ");
    result.append(rcost);
    result.append(')');
    return result.toString();
  }

} //ArmorInst2Impl
