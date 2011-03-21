/**
 * <copyright>
 * </copyright>
 *
 */
package org.larz.dom3.dm.dm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.larz.dom3.dm.dm.AbstractElement;
import org.larz.dom3.dm.dm.DmPackage;
import org.larz.dom3.dm.dm.Dom3Mod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dom3 Mod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.impl.Dom3ModImpl#getModname <em>Modname</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.Dom3ModImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.Dom3ModImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.Dom3ModImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.Dom3ModImpl#getDomversion <em>Domversion</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.Dom3ModImpl#getPoppergold <em>Poppergold</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.Dom3ModImpl#getResourcemult <em>Resourcemult</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.Dom3ModImpl#getSupplymult <em>Supplymult</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.Dom3ModImpl#getUnresthalfinc <em>Unresthalfinc</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.Dom3ModImpl#getUnresthalfres <em>Unresthalfres</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.Dom3ModImpl#getEventisrare <em>Eventisrare</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.Dom3ModImpl#getTurmoilincome <em>Turmoilincome</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.Dom3ModImpl#getTurmoilevents <em>Turmoilevents</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.Dom3ModImpl#getDeathincome <em>Deathincome</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.Dom3ModImpl#getDeathsupply <em>Deathsupply</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.Dom3ModImpl#getDeathdeath <em>Deathdeath</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.Dom3ModImpl#getSlothincome <em>Slothincome</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.Dom3ModImpl#getSlothresources <em>Slothresources</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.Dom3ModImpl#getColdincome <em>Coldincome</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.Dom3ModImpl#getColdsupply <em>Coldsupply</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.Dom3ModImpl#getMisfortune <em>Misfortune</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.Dom3ModImpl#getLuckevents <em>Luckevents</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.Dom3ModImpl#getResearchscale <em>Researchscale</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.Dom3ModImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Dom3ModImpl extends MinimalEObjectImpl.Container implements Dom3Mod
{
  /**
   * The default value of the '{@link #getModname() <em>Modname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModname()
   * @generated
   * @ordered
   */
  protected static final String MODNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModname() <em>Modname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModname()
   * @generated
   * @ordered
   */
  protected String modname = MODNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDesc() <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesc()
   * @generated
   * @ordered
   */
  protected static final String DESC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDesc() <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesc()
   * @generated
   * @ordered
   */
  protected String desc = DESC_EDEFAULT;

  /**
   * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcon()
   * @generated
   * @ordered
   */
  protected static final String ICON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcon()
   * @generated
   * @ordered
   */
  protected String icon = ICON_EDEFAULT;

  /**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final String VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected String version = VERSION_EDEFAULT;

  /**
   * The default value of the '{@link #getDomversion() <em>Domversion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomversion()
   * @generated
   * @ordered
   */
  protected static final String DOMVERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDomversion() <em>Domversion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomversion()
   * @generated
   * @ordered
   */
  protected String domversion = DOMVERSION_EDEFAULT;

  /**
   * The default value of the '{@link #getPoppergold() <em>Poppergold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPoppergold()
   * @generated
   * @ordered
   */
  protected static final int POPPERGOLD_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPoppergold() <em>Poppergold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPoppergold()
   * @generated
   * @ordered
   */
  protected int poppergold = POPPERGOLD_EDEFAULT;

  /**
   * The default value of the '{@link #getResourcemult() <em>Resourcemult</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourcemult()
   * @generated
   * @ordered
   */
  protected static final int RESOURCEMULT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getResourcemult() <em>Resourcemult</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourcemult()
   * @generated
   * @ordered
   */
  protected int resourcemult = RESOURCEMULT_EDEFAULT;

  /**
   * The default value of the '{@link #getSupplymult() <em>Supplymult</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupplymult()
   * @generated
   * @ordered
   */
  protected static final int SUPPLYMULT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSupplymult() <em>Supplymult</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupplymult()
   * @generated
   * @ordered
   */
  protected int supplymult = SUPPLYMULT_EDEFAULT;

  /**
   * The default value of the '{@link #getUnresthalfinc() <em>Unresthalfinc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnresthalfinc()
   * @generated
   * @ordered
   */
  protected static final int UNRESTHALFINC_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getUnresthalfinc() <em>Unresthalfinc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnresthalfinc()
   * @generated
   * @ordered
   */
  protected int unresthalfinc = UNRESTHALFINC_EDEFAULT;

  /**
   * The default value of the '{@link #getUnresthalfres() <em>Unresthalfres</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnresthalfres()
   * @generated
   * @ordered
   */
  protected static final int UNRESTHALFRES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getUnresthalfres() <em>Unresthalfres</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnresthalfres()
   * @generated
   * @ordered
   */
  protected int unresthalfres = UNRESTHALFRES_EDEFAULT;

  /**
   * The default value of the '{@link #getEventisrare() <em>Eventisrare</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventisrare()
   * @generated
   * @ordered
   */
  protected static final int EVENTISRARE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getEventisrare() <em>Eventisrare</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventisrare()
   * @generated
   * @ordered
   */
  protected int eventisrare = EVENTISRARE_EDEFAULT;

  /**
   * The default value of the '{@link #getTurmoilincome() <em>Turmoilincome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTurmoilincome()
   * @generated
   * @ordered
   */
  protected static final int TURMOILINCOME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTurmoilincome() <em>Turmoilincome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTurmoilincome()
   * @generated
   * @ordered
   */
  protected int turmoilincome = TURMOILINCOME_EDEFAULT;

  /**
   * The default value of the '{@link #getTurmoilevents() <em>Turmoilevents</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTurmoilevents()
   * @generated
   * @ordered
   */
  protected static final int TURMOILEVENTS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTurmoilevents() <em>Turmoilevents</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTurmoilevents()
   * @generated
   * @ordered
   */
  protected int turmoilevents = TURMOILEVENTS_EDEFAULT;

  /**
   * The default value of the '{@link #getDeathincome() <em>Deathincome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeathincome()
   * @generated
   * @ordered
   */
  protected static final int DEATHINCOME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDeathincome() <em>Deathincome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeathincome()
   * @generated
   * @ordered
   */
  protected int deathincome = DEATHINCOME_EDEFAULT;

  /**
   * The default value of the '{@link #getDeathsupply() <em>Deathsupply</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeathsupply()
   * @generated
   * @ordered
   */
  protected static final int DEATHSUPPLY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDeathsupply() <em>Deathsupply</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeathsupply()
   * @generated
   * @ordered
   */
  protected int deathsupply = DEATHSUPPLY_EDEFAULT;

  /**
   * The default value of the '{@link #getDeathdeath() <em>Deathdeath</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeathdeath()
   * @generated
   * @ordered
   */
  protected static final int DEATHDEATH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDeathdeath() <em>Deathdeath</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeathdeath()
   * @generated
   * @ordered
   */
  protected int deathdeath = DEATHDEATH_EDEFAULT;

  /**
   * The default value of the '{@link #getSlothincome() <em>Slothincome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSlothincome()
   * @generated
   * @ordered
   */
  protected static final int SLOTHINCOME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSlothincome() <em>Slothincome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSlothincome()
   * @generated
   * @ordered
   */
  protected int slothincome = SLOTHINCOME_EDEFAULT;

  /**
   * The default value of the '{@link #getSlothresources() <em>Slothresources</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSlothresources()
   * @generated
   * @ordered
   */
  protected static final int SLOTHRESOURCES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSlothresources() <em>Slothresources</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSlothresources()
   * @generated
   * @ordered
   */
  protected int slothresources = SLOTHRESOURCES_EDEFAULT;

  /**
   * The default value of the '{@link #getColdincome() <em>Coldincome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColdincome()
   * @generated
   * @ordered
   */
  protected static final int COLDINCOME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getColdincome() <em>Coldincome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColdincome()
   * @generated
   * @ordered
   */
  protected int coldincome = COLDINCOME_EDEFAULT;

  /**
   * The default value of the '{@link #getColdsupply() <em>Coldsupply</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColdsupply()
   * @generated
   * @ordered
   */
  protected static final int COLDSUPPLY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getColdsupply() <em>Coldsupply</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColdsupply()
   * @generated
   * @ordered
   */
  protected int coldsupply = COLDSUPPLY_EDEFAULT;

  /**
   * The default value of the '{@link #getMisfortune() <em>Misfortune</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMisfortune()
   * @generated
   * @ordered
   */
  protected static final int MISFORTUNE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMisfortune() <em>Misfortune</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMisfortune()
   * @generated
   * @ordered
   */
  protected int misfortune = MISFORTUNE_EDEFAULT;

  /**
   * The default value of the '{@link #getLuckevents() <em>Luckevents</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLuckevents()
   * @generated
   * @ordered
   */
  protected static final int LUCKEVENTS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLuckevents() <em>Luckevents</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLuckevents()
   * @generated
   * @ordered
   */
  protected int luckevents = LUCKEVENTS_EDEFAULT;

  /**
   * The default value of the '{@link #getResearchscale() <em>Researchscale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResearchscale()
   * @generated
   * @ordered
   */
  protected static final int RESEARCHSCALE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getResearchscale() <em>Researchscale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResearchscale()
   * @generated
   * @ordered
   */
  protected int researchscale = RESEARCHSCALE_EDEFAULT;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<AbstractElement> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Dom3ModImpl()
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
    return DmPackage.eINSTANCE.getDom3Mod();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModname()
  {
    return modname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModname(String newModname)
  {
    String oldModname = modname;
    modname = newModname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.DOM3_MOD__MODNAME, oldModname, modname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDesc()
  {
    return desc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDesc(String newDesc)
  {
    String oldDesc = desc;
    desc = newDesc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.DOM3_MOD__DESC, oldDesc, desc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIcon()
  {
    return icon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIcon(String newIcon)
  {
    String oldIcon = icon;
    icon = newIcon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.DOM3_MOD__ICON, oldIcon, icon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(String newVersion)
  {
    String oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.DOM3_MOD__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDomversion()
  {
    return domversion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDomversion(String newDomversion)
  {
    String oldDomversion = domversion;
    domversion = newDomversion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.DOM3_MOD__DOMVERSION, oldDomversion, domversion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPoppergold()
  {
    return poppergold;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPoppergold(int newPoppergold)
  {
    int oldPoppergold = poppergold;
    poppergold = newPoppergold;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.DOM3_MOD__POPPERGOLD, oldPoppergold, poppergold));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getResourcemult()
  {
    return resourcemult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResourcemult(int newResourcemult)
  {
    int oldResourcemult = resourcemult;
    resourcemult = newResourcemult;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.DOM3_MOD__RESOURCEMULT, oldResourcemult, resourcemult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSupplymult()
  {
    return supplymult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSupplymult(int newSupplymult)
  {
    int oldSupplymult = supplymult;
    supplymult = newSupplymult;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.DOM3_MOD__SUPPLYMULT, oldSupplymult, supplymult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getUnresthalfinc()
  {
    return unresthalfinc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnresthalfinc(int newUnresthalfinc)
  {
    int oldUnresthalfinc = unresthalfinc;
    unresthalfinc = newUnresthalfinc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.DOM3_MOD__UNRESTHALFINC, oldUnresthalfinc, unresthalfinc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getUnresthalfres()
  {
    return unresthalfres;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnresthalfres(int newUnresthalfres)
  {
    int oldUnresthalfres = unresthalfres;
    unresthalfres = newUnresthalfres;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.DOM3_MOD__UNRESTHALFRES, oldUnresthalfres, unresthalfres));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getEventisrare()
  {
    return eventisrare;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEventisrare(int newEventisrare)
  {
    int oldEventisrare = eventisrare;
    eventisrare = newEventisrare;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.DOM3_MOD__EVENTISRARE, oldEventisrare, eventisrare));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTurmoilincome()
  {
    return turmoilincome;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTurmoilincome(int newTurmoilincome)
  {
    int oldTurmoilincome = turmoilincome;
    turmoilincome = newTurmoilincome;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.DOM3_MOD__TURMOILINCOME, oldTurmoilincome, turmoilincome));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTurmoilevents()
  {
    return turmoilevents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTurmoilevents(int newTurmoilevents)
  {
    int oldTurmoilevents = turmoilevents;
    turmoilevents = newTurmoilevents;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.DOM3_MOD__TURMOILEVENTS, oldTurmoilevents, turmoilevents));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDeathincome()
  {
    return deathincome;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeathincome(int newDeathincome)
  {
    int oldDeathincome = deathincome;
    deathincome = newDeathincome;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.DOM3_MOD__DEATHINCOME, oldDeathincome, deathincome));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDeathsupply()
  {
    return deathsupply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeathsupply(int newDeathsupply)
  {
    int oldDeathsupply = deathsupply;
    deathsupply = newDeathsupply;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.DOM3_MOD__DEATHSUPPLY, oldDeathsupply, deathsupply));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDeathdeath()
  {
    return deathdeath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeathdeath(int newDeathdeath)
  {
    int oldDeathdeath = deathdeath;
    deathdeath = newDeathdeath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.DOM3_MOD__DEATHDEATH, oldDeathdeath, deathdeath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSlothincome()
  {
    return slothincome;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSlothincome(int newSlothincome)
  {
    int oldSlothincome = slothincome;
    slothincome = newSlothincome;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.DOM3_MOD__SLOTHINCOME, oldSlothincome, slothincome));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSlothresources()
  {
    return slothresources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSlothresources(int newSlothresources)
  {
    int oldSlothresources = slothresources;
    slothresources = newSlothresources;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.DOM3_MOD__SLOTHRESOURCES, oldSlothresources, slothresources));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getColdincome()
  {
    return coldincome;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColdincome(int newColdincome)
  {
    int oldColdincome = coldincome;
    coldincome = newColdincome;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.DOM3_MOD__COLDINCOME, oldColdincome, coldincome));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getColdsupply()
  {
    return coldsupply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColdsupply(int newColdsupply)
  {
    int oldColdsupply = coldsupply;
    coldsupply = newColdsupply;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.DOM3_MOD__COLDSUPPLY, oldColdsupply, coldsupply));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMisfortune()
  {
    return misfortune;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMisfortune(int newMisfortune)
  {
    int oldMisfortune = misfortune;
    misfortune = newMisfortune;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.DOM3_MOD__MISFORTUNE, oldMisfortune, misfortune));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLuckevents()
  {
    return luckevents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLuckevents(int newLuckevents)
  {
    int oldLuckevents = luckevents;
    luckevents = newLuckevents;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.DOM3_MOD__LUCKEVENTS, oldLuckevents, luckevents));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getResearchscale()
  {
    return researchscale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResearchscale(int newResearchscale)
  {
    int oldResearchscale = researchscale;
    researchscale = newResearchscale;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.DOM3_MOD__RESEARCHSCALE, oldResearchscale, researchscale));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractElement> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<AbstractElement>(AbstractElement.class, this, DmPackage.DOM3_MOD__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DmPackage.DOM3_MOD__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DmPackage.DOM3_MOD__MODNAME:
        return getModname();
      case DmPackage.DOM3_MOD__DESC:
        return getDesc();
      case DmPackage.DOM3_MOD__ICON:
        return getIcon();
      case DmPackage.DOM3_MOD__VERSION:
        return getVersion();
      case DmPackage.DOM3_MOD__DOMVERSION:
        return getDomversion();
      case DmPackage.DOM3_MOD__POPPERGOLD:
        return getPoppergold();
      case DmPackage.DOM3_MOD__RESOURCEMULT:
        return getResourcemult();
      case DmPackage.DOM3_MOD__SUPPLYMULT:
        return getSupplymult();
      case DmPackage.DOM3_MOD__UNRESTHALFINC:
        return getUnresthalfinc();
      case DmPackage.DOM3_MOD__UNRESTHALFRES:
        return getUnresthalfres();
      case DmPackage.DOM3_MOD__EVENTISRARE:
        return getEventisrare();
      case DmPackage.DOM3_MOD__TURMOILINCOME:
        return getTurmoilincome();
      case DmPackage.DOM3_MOD__TURMOILEVENTS:
        return getTurmoilevents();
      case DmPackage.DOM3_MOD__DEATHINCOME:
        return getDeathincome();
      case DmPackage.DOM3_MOD__DEATHSUPPLY:
        return getDeathsupply();
      case DmPackage.DOM3_MOD__DEATHDEATH:
        return getDeathdeath();
      case DmPackage.DOM3_MOD__SLOTHINCOME:
        return getSlothincome();
      case DmPackage.DOM3_MOD__SLOTHRESOURCES:
        return getSlothresources();
      case DmPackage.DOM3_MOD__COLDINCOME:
        return getColdincome();
      case DmPackage.DOM3_MOD__COLDSUPPLY:
        return getColdsupply();
      case DmPackage.DOM3_MOD__MISFORTUNE:
        return getMisfortune();
      case DmPackage.DOM3_MOD__LUCKEVENTS:
        return getLuckevents();
      case DmPackage.DOM3_MOD__RESEARCHSCALE:
        return getResearchscale();
      case DmPackage.DOM3_MOD__ELEMENTS:
        return getElements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DmPackage.DOM3_MOD__MODNAME:
        setModname((String)newValue);
        return;
      case DmPackage.DOM3_MOD__DESC:
        setDesc((String)newValue);
        return;
      case DmPackage.DOM3_MOD__ICON:
        setIcon((String)newValue);
        return;
      case DmPackage.DOM3_MOD__VERSION:
        setVersion((String)newValue);
        return;
      case DmPackage.DOM3_MOD__DOMVERSION:
        setDomversion((String)newValue);
        return;
      case DmPackage.DOM3_MOD__POPPERGOLD:
        setPoppergold((Integer)newValue);
        return;
      case DmPackage.DOM3_MOD__RESOURCEMULT:
        setResourcemult((Integer)newValue);
        return;
      case DmPackage.DOM3_MOD__SUPPLYMULT:
        setSupplymult((Integer)newValue);
        return;
      case DmPackage.DOM3_MOD__UNRESTHALFINC:
        setUnresthalfinc((Integer)newValue);
        return;
      case DmPackage.DOM3_MOD__UNRESTHALFRES:
        setUnresthalfres((Integer)newValue);
        return;
      case DmPackage.DOM3_MOD__EVENTISRARE:
        setEventisrare((Integer)newValue);
        return;
      case DmPackage.DOM3_MOD__TURMOILINCOME:
        setTurmoilincome((Integer)newValue);
        return;
      case DmPackage.DOM3_MOD__TURMOILEVENTS:
        setTurmoilevents((Integer)newValue);
        return;
      case DmPackage.DOM3_MOD__DEATHINCOME:
        setDeathincome((Integer)newValue);
        return;
      case DmPackage.DOM3_MOD__DEATHSUPPLY:
        setDeathsupply((Integer)newValue);
        return;
      case DmPackage.DOM3_MOD__DEATHDEATH:
        setDeathdeath((Integer)newValue);
        return;
      case DmPackage.DOM3_MOD__SLOTHINCOME:
        setSlothincome((Integer)newValue);
        return;
      case DmPackage.DOM3_MOD__SLOTHRESOURCES:
        setSlothresources((Integer)newValue);
        return;
      case DmPackage.DOM3_MOD__COLDINCOME:
        setColdincome((Integer)newValue);
        return;
      case DmPackage.DOM3_MOD__COLDSUPPLY:
        setColdsupply((Integer)newValue);
        return;
      case DmPackage.DOM3_MOD__MISFORTUNE:
        setMisfortune((Integer)newValue);
        return;
      case DmPackage.DOM3_MOD__LUCKEVENTS:
        setLuckevents((Integer)newValue);
        return;
      case DmPackage.DOM3_MOD__RESEARCHSCALE:
        setResearchscale((Integer)newValue);
        return;
      case DmPackage.DOM3_MOD__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends AbstractElement>)newValue);
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
      case DmPackage.DOM3_MOD__MODNAME:
        setModname(MODNAME_EDEFAULT);
        return;
      case DmPackage.DOM3_MOD__DESC:
        setDesc(DESC_EDEFAULT);
        return;
      case DmPackage.DOM3_MOD__ICON:
        setIcon(ICON_EDEFAULT);
        return;
      case DmPackage.DOM3_MOD__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case DmPackage.DOM3_MOD__DOMVERSION:
        setDomversion(DOMVERSION_EDEFAULT);
        return;
      case DmPackage.DOM3_MOD__POPPERGOLD:
        setPoppergold(POPPERGOLD_EDEFAULT);
        return;
      case DmPackage.DOM3_MOD__RESOURCEMULT:
        setResourcemult(RESOURCEMULT_EDEFAULT);
        return;
      case DmPackage.DOM3_MOD__SUPPLYMULT:
        setSupplymult(SUPPLYMULT_EDEFAULT);
        return;
      case DmPackage.DOM3_MOD__UNRESTHALFINC:
        setUnresthalfinc(UNRESTHALFINC_EDEFAULT);
        return;
      case DmPackage.DOM3_MOD__UNRESTHALFRES:
        setUnresthalfres(UNRESTHALFRES_EDEFAULT);
        return;
      case DmPackage.DOM3_MOD__EVENTISRARE:
        setEventisrare(EVENTISRARE_EDEFAULT);
        return;
      case DmPackage.DOM3_MOD__TURMOILINCOME:
        setTurmoilincome(TURMOILINCOME_EDEFAULT);
        return;
      case DmPackage.DOM3_MOD__TURMOILEVENTS:
        setTurmoilevents(TURMOILEVENTS_EDEFAULT);
        return;
      case DmPackage.DOM3_MOD__DEATHINCOME:
        setDeathincome(DEATHINCOME_EDEFAULT);
        return;
      case DmPackage.DOM3_MOD__DEATHSUPPLY:
        setDeathsupply(DEATHSUPPLY_EDEFAULT);
        return;
      case DmPackage.DOM3_MOD__DEATHDEATH:
        setDeathdeath(DEATHDEATH_EDEFAULT);
        return;
      case DmPackage.DOM3_MOD__SLOTHINCOME:
        setSlothincome(SLOTHINCOME_EDEFAULT);
        return;
      case DmPackage.DOM3_MOD__SLOTHRESOURCES:
        setSlothresources(SLOTHRESOURCES_EDEFAULT);
        return;
      case DmPackage.DOM3_MOD__COLDINCOME:
        setColdincome(COLDINCOME_EDEFAULT);
        return;
      case DmPackage.DOM3_MOD__COLDSUPPLY:
        setColdsupply(COLDSUPPLY_EDEFAULT);
        return;
      case DmPackage.DOM3_MOD__MISFORTUNE:
        setMisfortune(MISFORTUNE_EDEFAULT);
        return;
      case DmPackage.DOM3_MOD__LUCKEVENTS:
        setLuckevents(LUCKEVENTS_EDEFAULT);
        return;
      case DmPackage.DOM3_MOD__RESEARCHSCALE:
        setResearchscale(RESEARCHSCALE_EDEFAULT);
        return;
      case DmPackage.DOM3_MOD__ELEMENTS:
        getElements().clear();
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
      case DmPackage.DOM3_MOD__MODNAME:
        return MODNAME_EDEFAULT == null ? modname != null : !MODNAME_EDEFAULT.equals(modname);
      case DmPackage.DOM3_MOD__DESC:
        return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
      case DmPackage.DOM3_MOD__ICON:
        return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
      case DmPackage.DOM3_MOD__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case DmPackage.DOM3_MOD__DOMVERSION:
        return DOMVERSION_EDEFAULT == null ? domversion != null : !DOMVERSION_EDEFAULT.equals(domversion);
      case DmPackage.DOM3_MOD__POPPERGOLD:
        return poppergold != POPPERGOLD_EDEFAULT;
      case DmPackage.DOM3_MOD__RESOURCEMULT:
        return resourcemult != RESOURCEMULT_EDEFAULT;
      case DmPackage.DOM3_MOD__SUPPLYMULT:
        return supplymult != SUPPLYMULT_EDEFAULT;
      case DmPackage.DOM3_MOD__UNRESTHALFINC:
        return unresthalfinc != UNRESTHALFINC_EDEFAULT;
      case DmPackage.DOM3_MOD__UNRESTHALFRES:
        return unresthalfres != UNRESTHALFRES_EDEFAULT;
      case DmPackage.DOM3_MOD__EVENTISRARE:
        return eventisrare != EVENTISRARE_EDEFAULT;
      case DmPackage.DOM3_MOD__TURMOILINCOME:
        return turmoilincome != TURMOILINCOME_EDEFAULT;
      case DmPackage.DOM3_MOD__TURMOILEVENTS:
        return turmoilevents != TURMOILEVENTS_EDEFAULT;
      case DmPackage.DOM3_MOD__DEATHINCOME:
        return deathincome != DEATHINCOME_EDEFAULT;
      case DmPackage.DOM3_MOD__DEATHSUPPLY:
        return deathsupply != DEATHSUPPLY_EDEFAULT;
      case DmPackage.DOM3_MOD__DEATHDEATH:
        return deathdeath != DEATHDEATH_EDEFAULT;
      case DmPackage.DOM3_MOD__SLOTHINCOME:
        return slothincome != SLOTHINCOME_EDEFAULT;
      case DmPackage.DOM3_MOD__SLOTHRESOURCES:
        return slothresources != SLOTHRESOURCES_EDEFAULT;
      case DmPackage.DOM3_MOD__COLDINCOME:
        return coldincome != COLDINCOME_EDEFAULT;
      case DmPackage.DOM3_MOD__COLDSUPPLY:
        return coldsupply != COLDSUPPLY_EDEFAULT;
      case DmPackage.DOM3_MOD__MISFORTUNE:
        return misfortune != MISFORTUNE_EDEFAULT;
      case DmPackage.DOM3_MOD__LUCKEVENTS:
        return luckevents != LUCKEVENTS_EDEFAULT;
      case DmPackage.DOM3_MOD__RESEARCHSCALE:
        return researchscale != RESEARCHSCALE_EDEFAULT;
      case DmPackage.DOM3_MOD__ELEMENTS:
        return elements != null && !elements.isEmpty();
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
    result.append(" (modname: ");
    result.append(modname);
    result.append(", desc: ");
    result.append(desc);
    result.append(", icon: ");
    result.append(icon);
    result.append(", version: ");
    result.append(version);
    result.append(", domversion: ");
    result.append(domversion);
    result.append(", poppergold: ");
    result.append(poppergold);
    result.append(", resourcemult: ");
    result.append(resourcemult);
    result.append(", supplymult: ");
    result.append(supplymult);
    result.append(", unresthalfinc: ");
    result.append(unresthalfinc);
    result.append(", unresthalfres: ");
    result.append(unresthalfres);
    result.append(", eventisrare: ");
    result.append(eventisrare);
    result.append(", turmoilincome: ");
    result.append(turmoilincome);
    result.append(", turmoilevents: ");
    result.append(turmoilevents);
    result.append(", deathincome: ");
    result.append(deathincome);
    result.append(", deathsupply: ");
    result.append(deathsupply);
    result.append(", deathdeath: ");
    result.append(deathdeath);
    result.append(", slothincome: ");
    result.append(slothincome);
    result.append(", slothresources: ");
    result.append(slothresources);
    result.append(", coldincome: ");
    result.append(coldincome);
    result.append(", coldsupply: ");
    result.append(coldsupply);
    result.append(", misfortune: ");
    result.append(misfortune);
    result.append(", luckevents: ");
    result.append(luckevents);
    result.append(", researchscale: ");
    result.append(researchscale);
    result.append(')');
    return result.toString();
  }

} //Dom3ModImpl
