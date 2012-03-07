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
import org.larz.dom3.dm.dm.ItemInst2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Inst2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.impl.ItemInst2Impl#getValue <em>Value</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.ItemInst2Impl#isConstlevel <em>Constlevel</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.ItemInst2Impl#isMainpath <em>Mainpath</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.ItemInst2Impl#isMainlevel <em>Mainlevel</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.ItemInst2Impl#isSecondarypath <em>Secondarypath</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.ItemInst2Impl#isSecondarylevel <em>Secondarylevel</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.ItemInst2Impl#isType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemInst2Impl extends ItemPattern2Impl implements ItemInst2
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
   * The default value of the '{@link #isConstlevel() <em>Constlevel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConstlevel()
   * @generated
   * @ordered
   */
  protected static final boolean CONSTLEVEL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isConstlevel() <em>Constlevel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConstlevel()
   * @generated
   * @ordered
   */
  protected boolean constlevel = CONSTLEVEL_EDEFAULT;

  /**
   * The default value of the '{@link #isMainpath() <em>Mainpath</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMainpath()
   * @generated
   * @ordered
   */
  protected static final boolean MAINPATH_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMainpath() <em>Mainpath</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMainpath()
   * @generated
   * @ordered
   */
  protected boolean mainpath = MAINPATH_EDEFAULT;

  /**
   * The default value of the '{@link #isMainlevel() <em>Mainlevel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMainlevel()
   * @generated
   * @ordered
   */
  protected static final boolean MAINLEVEL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMainlevel() <em>Mainlevel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMainlevel()
   * @generated
   * @ordered
   */
  protected boolean mainlevel = MAINLEVEL_EDEFAULT;

  /**
   * The default value of the '{@link #isSecondarypath() <em>Secondarypath</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSecondarypath()
   * @generated
   * @ordered
   */
  protected static final boolean SECONDARYPATH_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSecondarypath() <em>Secondarypath</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSecondarypath()
   * @generated
   * @ordered
   */
  protected boolean secondarypath = SECONDARYPATH_EDEFAULT;

  /**
   * The default value of the '{@link #isSecondarylevel() <em>Secondarylevel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSecondarylevel()
   * @generated
   * @ordered
   */
  protected static final boolean SECONDARYLEVEL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSecondarylevel() <em>Secondarylevel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSecondarylevel()
   * @generated
   * @ordered
   */
  protected boolean secondarylevel = SECONDARYLEVEL_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ItemInst2Impl()
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
    return DmPackage.eINSTANCE.getItemInst2();
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ITEM_INST2__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isConstlevel()
  {
    return constlevel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstlevel(boolean newConstlevel)
  {
    boolean oldConstlevel = constlevel;
    constlevel = newConstlevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ITEM_INST2__CONSTLEVEL, oldConstlevel, constlevel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMainpath()
  {
    return mainpath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMainpath(boolean newMainpath)
  {
    boolean oldMainpath = mainpath;
    mainpath = newMainpath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ITEM_INST2__MAINPATH, oldMainpath, mainpath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMainlevel()
  {
    return mainlevel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMainlevel(boolean newMainlevel)
  {
    boolean oldMainlevel = mainlevel;
    mainlevel = newMainlevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ITEM_INST2__MAINLEVEL, oldMainlevel, mainlevel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSecondarypath()
  {
    return secondarypath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecondarypath(boolean newSecondarypath)
  {
    boolean oldSecondarypath = secondarypath;
    secondarypath = newSecondarypath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ITEM_INST2__SECONDARYPATH, oldSecondarypath, secondarypath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSecondarylevel()
  {
    return secondarylevel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSecondarylevel(boolean newSecondarylevel)
  {
    boolean oldSecondarylevel = secondarylevel;
    secondarylevel = newSecondarylevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ITEM_INST2__SECONDARYLEVEL, oldSecondarylevel, secondarylevel));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ITEM_INST2__TYPE, oldType, type));
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
      case DmPackage.ITEM_INST2__VALUE:
        return getValue();
      case DmPackage.ITEM_INST2__CONSTLEVEL:
        return isConstlevel();
      case DmPackage.ITEM_INST2__MAINPATH:
        return isMainpath();
      case DmPackage.ITEM_INST2__MAINLEVEL:
        return isMainlevel();
      case DmPackage.ITEM_INST2__SECONDARYPATH:
        return isSecondarypath();
      case DmPackage.ITEM_INST2__SECONDARYLEVEL:
        return isSecondarylevel();
      case DmPackage.ITEM_INST2__TYPE:
        return isType();
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
      case DmPackage.ITEM_INST2__VALUE:
        setValue((Integer)newValue);
        return;
      case DmPackage.ITEM_INST2__CONSTLEVEL:
        setConstlevel((Boolean)newValue);
        return;
      case DmPackage.ITEM_INST2__MAINPATH:
        setMainpath((Boolean)newValue);
        return;
      case DmPackage.ITEM_INST2__MAINLEVEL:
        setMainlevel((Boolean)newValue);
        return;
      case DmPackage.ITEM_INST2__SECONDARYPATH:
        setSecondarypath((Boolean)newValue);
        return;
      case DmPackage.ITEM_INST2__SECONDARYLEVEL:
        setSecondarylevel((Boolean)newValue);
        return;
      case DmPackage.ITEM_INST2__TYPE:
        setType((Boolean)newValue);
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
      case DmPackage.ITEM_INST2__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case DmPackage.ITEM_INST2__CONSTLEVEL:
        setConstlevel(CONSTLEVEL_EDEFAULT);
        return;
      case DmPackage.ITEM_INST2__MAINPATH:
        setMainpath(MAINPATH_EDEFAULT);
        return;
      case DmPackage.ITEM_INST2__MAINLEVEL:
        setMainlevel(MAINLEVEL_EDEFAULT);
        return;
      case DmPackage.ITEM_INST2__SECONDARYPATH:
        setSecondarypath(SECONDARYPATH_EDEFAULT);
        return;
      case DmPackage.ITEM_INST2__SECONDARYLEVEL:
        setSecondarylevel(SECONDARYLEVEL_EDEFAULT);
        return;
      case DmPackage.ITEM_INST2__TYPE:
        setType(TYPE_EDEFAULT);
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
      case DmPackage.ITEM_INST2__VALUE:
        return value != VALUE_EDEFAULT;
      case DmPackage.ITEM_INST2__CONSTLEVEL:
        return constlevel != CONSTLEVEL_EDEFAULT;
      case DmPackage.ITEM_INST2__MAINPATH:
        return mainpath != MAINPATH_EDEFAULT;
      case DmPackage.ITEM_INST2__MAINLEVEL:
        return mainlevel != MAINLEVEL_EDEFAULT;
      case DmPackage.ITEM_INST2__SECONDARYPATH:
        return secondarypath != SECONDARYPATH_EDEFAULT;
      case DmPackage.ITEM_INST2__SECONDARYLEVEL:
        return secondarylevel != SECONDARYLEVEL_EDEFAULT;
      case DmPackage.ITEM_INST2__TYPE:
        return type != TYPE_EDEFAULT;
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
    result.append(", constlevel: ");
    result.append(constlevel);
    result.append(", mainpath: ");
    result.append(mainpath);
    result.append(", mainlevel: ");
    result.append(mainlevel);
    result.append(", secondarypath: ");
    result.append(secondarypath);
    result.append(", secondarylevel: ");
    result.append(secondarylevel);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //ItemInst2Impl
