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
import org.larz.dom3.dm.dm.NationInst1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nation Inst1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.impl.NationInst1Impl#getValue <em>Value</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.NationInst1Impl#isName <em>Name</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.NationInst1Impl#isEpithet <em>Epithet</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.NationInst1Impl#isDescr <em>Descr</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.NationInst1Impl#isSummary <em>Summary</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.NationInst1Impl#isBrief <em>Brief</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.NationInst1Impl#isFlag <em>Flag</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.NationInst1Impl#isMapbackground <em>Mapbackground</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.NationInst1Impl#isStartsite <em>Startsite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NationInst1Impl extends NationPattern1Impl implements NationInst1
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
   * The default value of the '{@link #isEpithet() <em>Epithet</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEpithet()
   * @generated
   * @ordered
   */
  protected static final boolean EPITHET_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEpithet() <em>Epithet</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEpithet()
   * @generated
   * @ordered
   */
  protected boolean epithet = EPITHET_EDEFAULT;

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
   * The default value of the '{@link #isSummary() <em>Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSummary()
   * @generated
   * @ordered
   */
  protected static final boolean SUMMARY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSummary() <em>Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSummary()
   * @generated
   * @ordered
   */
  protected boolean summary = SUMMARY_EDEFAULT;

  /**
   * The default value of the '{@link #isBrief() <em>Brief</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBrief()
   * @generated
   * @ordered
   */
  protected static final boolean BRIEF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBrief() <em>Brief</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBrief()
   * @generated
   * @ordered
   */
  protected boolean brief = BRIEF_EDEFAULT;

  /**
   * The default value of the '{@link #isFlag() <em>Flag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFlag()
   * @generated
   * @ordered
   */
  protected static final boolean FLAG_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFlag() <em>Flag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFlag()
   * @generated
   * @ordered
   */
  protected boolean flag = FLAG_EDEFAULT;

  /**
   * The default value of the '{@link #isMapbackground() <em>Mapbackground</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMapbackground()
   * @generated
   * @ordered
   */
  protected static final boolean MAPBACKGROUND_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMapbackground() <em>Mapbackground</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMapbackground()
   * @generated
   * @ordered
   */
  protected boolean mapbackground = MAPBACKGROUND_EDEFAULT;

  /**
   * The default value of the '{@link #isStartsite() <em>Startsite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStartsite()
   * @generated
   * @ordered
   */
  protected static final boolean STARTSITE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStartsite() <em>Startsite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStartsite()
   * @generated
   * @ordered
   */
  protected boolean startsite = STARTSITE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NationInst1Impl()
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
    return DmPackage.eINSTANCE.getNationInst1();
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.NATION_INST1__VALUE, oldValue, value));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.NATION_INST1__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEpithet()
  {
    return epithet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEpithet(boolean newEpithet)
  {
    boolean oldEpithet = epithet;
    epithet = newEpithet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.NATION_INST1__EPITHET, oldEpithet, epithet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.NATION_INST1__DESCR, oldDescr, descr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSummary()
  {
    return summary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSummary(boolean newSummary)
  {
    boolean oldSummary = summary;
    summary = newSummary;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.NATION_INST1__SUMMARY, oldSummary, summary));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBrief()
  {
    return brief;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBrief(boolean newBrief)
  {
    boolean oldBrief = brief;
    brief = newBrief;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.NATION_INST1__BRIEF, oldBrief, brief));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFlag()
  {
    return flag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFlag(boolean newFlag)
  {
    boolean oldFlag = flag;
    flag = newFlag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.NATION_INST1__FLAG, oldFlag, flag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMapbackground()
  {
    return mapbackground;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMapbackground(boolean newMapbackground)
  {
    boolean oldMapbackground = mapbackground;
    mapbackground = newMapbackground;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.NATION_INST1__MAPBACKGROUND, oldMapbackground, mapbackground));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStartsite()
  {
    return startsite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartsite(boolean newStartsite)
  {
    boolean oldStartsite = startsite;
    startsite = newStartsite;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.NATION_INST1__STARTSITE, oldStartsite, startsite));
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
      case DmPackage.NATION_INST1__VALUE:
        return getValue();
      case DmPackage.NATION_INST1__NAME:
        return isName();
      case DmPackage.NATION_INST1__EPITHET:
        return isEpithet();
      case DmPackage.NATION_INST1__DESCR:
        return isDescr();
      case DmPackage.NATION_INST1__SUMMARY:
        return isSummary();
      case DmPackage.NATION_INST1__BRIEF:
        return isBrief();
      case DmPackage.NATION_INST1__FLAG:
        return isFlag();
      case DmPackage.NATION_INST1__MAPBACKGROUND:
        return isMapbackground();
      case DmPackage.NATION_INST1__STARTSITE:
        return isStartsite();
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
      case DmPackage.NATION_INST1__VALUE:
        setValue((String)newValue);
        return;
      case DmPackage.NATION_INST1__NAME:
        setName((Boolean)newValue);
        return;
      case DmPackage.NATION_INST1__EPITHET:
        setEpithet((Boolean)newValue);
        return;
      case DmPackage.NATION_INST1__DESCR:
        setDescr((Boolean)newValue);
        return;
      case DmPackage.NATION_INST1__SUMMARY:
        setSummary((Boolean)newValue);
        return;
      case DmPackage.NATION_INST1__BRIEF:
        setBrief((Boolean)newValue);
        return;
      case DmPackage.NATION_INST1__FLAG:
        setFlag((Boolean)newValue);
        return;
      case DmPackage.NATION_INST1__MAPBACKGROUND:
        setMapbackground((Boolean)newValue);
        return;
      case DmPackage.NATION_INST1__STARTSITE:
        setStartsite((Boolean)newValue);
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
      case DmPackage.NATION_INST1__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case DmPackage.NATION_INST1__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DmPackage.NATION_INST1__EPITHET:
        setEpithet(EPITHET_EDEFAULT);
        return;
      case DmPackage.NATION_INST1__DESCR:
        setDescr(DESCR_EDEFAULT);
        return;
      case DmPackage.NATION_INST1__SUMMARY:
        setSummary(SUMMARY_EDEFAULT);
        return;
      case DmPackage.NATION_INST1__BRIEF:
        setBrief(BRIEF_EDEFAULT);
        return;
      case DmPackage.NATION_INST1__FLAG:
        setFlag(FLAG_EDEFAULT);
        return;
      case DmPackage.NATION_INST1__MAPBACKGROUND:
        setMapbackground(MAPBACKGROUND_EDEFAULT);
        return;
      case DmPackage.NATION_INST1__STARTSITE:
        setStartsite(STARTSITE_EDEFAULT);
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
      case DmPackage.NATION_INST1__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case DmPackage.NATION_INST1__NAME:
        return name != NAME_EDEFAULT;
      case DmPackage.NATION_INST1__EPITHET:
        return epithet != EPITHET_EDEFAULT;
      case DmPackage.NATION_INST1__DESCR:
        return descr != DESCR_EDEFAULT;
      case DmPackage.NATION_INST1__SUMMARY:
        return summary != SUMMARY_EDEFAULT;
      case DmPackage.NATION_INST1__BRIEF:
        return brief != BRIEF_EDEFAULT;
      case DmPackage.NATION_INST1__FLAG:
        return flag != FLAG_EDEFAULT;
      case DmPackage.NATION_INST1__MAPBACKGROUND:
        return mapbackground != MAPBACKGROUND_EDEFAULT;
      case DmPackage.NATION_INST1__STARTSITE:
        return startsite != STARTSITE_EDEFAULT;
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
    result.append(", epithet: ");
    result.append(epithet);
    result.append(", descr: ");
    result.append(descr);
    result.append(", summary: ");
    result.append(summary);
    result.append(", brief: ");
    result.append(brief);
    result.append(", flag: ");
    result.append(flag);
    result.append(", mapbackground: ");
    result.append(mapbackground);
    result.append(", startsite: ");
    result.append(startsite);
    result.append(')');
    return result.toString();
  }

} //NationInst1Impl
