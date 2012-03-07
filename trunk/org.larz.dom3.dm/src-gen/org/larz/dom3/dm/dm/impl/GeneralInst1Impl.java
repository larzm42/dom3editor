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
import org.larz.dom3.dm.dm.GeneralInst1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Inst1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.impl.GeneralInst1Impl#getValue <em>Value</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.GeneralInst1Impl#isPoppergold <em>Poppergold</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.GeneralInst1Impl#isResourcemult <em>Resourcemult</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.GeneralInst1Impl#isSupplymult <em>Supplymult</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.GeneralInst1Impl#isUnresthalfinc <em>Unresthalfinc</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.GeneralInst1Impl#isUnresthalfres <em>Unresthalfres</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.GeneralInst1Impl#isEventisrare <em>Eventisrare</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.GeneralInst1Impl#isTurmoilincome <em>Turmoilincome</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.GeneralInst1Impl#isTurmoilevents <em>Turmoilevents</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.GeneralInst1Impl#isDeathincome <em>Deathincome</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.GeneralInst1Impl#isDeathsupply <em>Deathsupply</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.GeneralInst1Impl#isDeathdeath <em>Deathdeath</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.GeneralInst1Impl#isSlothincome <em>Slothincome</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.GeneralInst1Impl#isSlothresources <em>Slothresources</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.GeneralInst1Impl#isColdincome <em>Coldincome</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.GeneralInst1Impl#isColdsupply <em>Coldsupply</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.GeneralInst1Impl#isMisfortune <em>Misfortune</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.GeneralInst1Impl#isLuckevents <em>Luckevents</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.GeneralInst1Impl#isResearchscale <em>Researchscale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralInst1Impl extends GeneralPattern1Impl implements GeneralInst1
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
   * The default value of the '{@link #isPoppergold() <em>Poppergold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPoppergold()
   * @generated
   * @ordered
   */
  protected static final boolean POPPERGOLD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPoppergold() <em>Poppergold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPoppergold()
   * @generated
   * @ordered
   */
  protected boolean poppergold = POPPERGOLD_EDEFAULT;

  /**
   * The default value of the '{@link #isResourcemult() <em>Resourcemult</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResourcemult()
   * @generated
   * @ordered
   */
  protected static final boolean RESOURCEMULT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isResourcemult() <em>Resourcemult</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResourcemult()
   * @generated
   * @ordered
   */
  protected boolean resourcemult = RESOURCEMULT_EDEFAULT;

  /**
   * The default value of the '{@link #isSupplymult() <em>Supplymult</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSupplymult()
   * @generated
   * @ordered
   */
  protected static final boolean SUPPLYMULT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSupplymult() <em>Supplymult</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSupplymult()
   * @generated
   * @ordered
   */
  protected boolean supplymult = SUPPLYMULT_EDEFAULT;

  /**
   * The default value of the '{@link #isUnresthalfinc() <em>Unresthalfinc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnresthalfinc()
   * @generated
   * @ordered
   */
  protected static final boolean UNRESTHALFINC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUnresthalfinc() <em>Unresthalfinc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnresthalfinc()
   * @generated
   * @ordered
   */
  protected boolean unresthalfinc = UNRESTHALFINC_EDEFAULT;

  /**
   * The default value of the '{@link #isUnresthalfres() <em>Unresthalfres</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnresthalfres()
   * @generated
   * @ordered
   */
  protected static final boolean UNRESTHALFRES_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUnresthalfres() <em>Unresthalfres</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnresthalfres()
   * @generated
   * @ordered
   */
  protected boolean unresthalfres = UNRESTHALFRES_EDEFAULT;

  /**
   * The default value of the '{@link #isEventisrare() <em>Eventisrare</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEventisrare()
   * @generated
   * @ordered
   */
  protected static final boolean EVENTISRARE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEventisrare() <em>Eventisrare</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEventisrare()
   * @generated
   * @ordered
   */
  protected boolean eventisrare = EVENTISRARE_EDEFAULT;

  /**
   * The default value of the '{@link #isTurmoilincome() <em>Turmoilincome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTurmoilincome()
   * @generated
   * @ordered
   */
  protected static final boolean TURMOILINCOME_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTurmoilincome() <em>Turmoilincome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTurmoilincome()
   * @generated
   * @ordered
   */
  protected boolean turmoilincome = TURMOILINCOME_EDEFAULT;

  /**
   * The default value of the '{@link #isTurmoilevents() <em>Turmoilevents</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTurmoilevents()
   * @generated
   * @ordered
   */
  protected static final boolean TURMOILEVENTS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTurmoilevents() <em>Turmoilevents</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTurmoilevents()
   * @generated
   * @ordered
   */
  protected boolean turmoilevents = TURMOILEVENTS_EDEFAULT;

  /**
   * The default value of the '{@link #isDeathincome() <em>Deathincome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDeathincome()
   * @generated
   * @ordered
   */
  protected static final boolean DEATHINCOME_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDeathincome() <em>Deathincome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDeathincome()
   * @generated
   * @ordered
   */
  protected boolean deathincome = DEATHINCOME_EDEFAULT;

  /**
   * The default value of the '{@link #isDeathsupply() <em>Deathsupply</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDeathsupply()
   * @generated
   * @ordered
   */
  protected static final boolean DEATHSUPPLY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDeathsupply() <em>Deathsupply</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDeathsupply()
   * @generated
   * @ordered
   */
  protected boolean deathsupply = DEATHSUPPLY_EDEFAULT;

  /**
   * The default value of the '{@link #isDeathdeath() <em>Deathdeath</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDeathdeath()
   * @generated
   * @ordered
   */
  protected static final boolean DEATHDEATH_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDeathdeath() <em>Deathdeath</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDeathdeath()
   * @generated
   * @ordered
   */
  protected boolean deathdeath = DEATHDEATH_EDEFAULT;

  /**
   * The default value of the '{@link #isSlothincome() <em>Slothincome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSlothincome()
   * @generated
   * @ordered
   */
  protected static final boolean SLOTHINCOME_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSlothincome() <em>Slothincome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSlothincome()
   * @generated
   * @ordered
   */
  protected boolean slothincome = SLOTHINCOME_EDEFAULT;

  /**
   * The default value of the '{@link #isSlothresources() <em>Slothresources</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSlothresources()
   * @generated
   * @ordered
   */
  protected static final boolean SLOTHRESOURCES_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSlothresources() <em>Slothresources</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSlothresources()
   * @generated
   * @ordered
   */
  protected boolean slothresources = SLOTHRESOURCES_EDEFAULT;

  /**
   * The default value of the '{@link #isColdincome() <em>Coldincome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isColdincome()
   * @generated
   * @ordered
   */
  protected static final boolean COLDINCOME_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isColdincome() <em>Coldincome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isColdincome()
   * @generated
   * @ordered
   */
  protected boolean coldincome = COLDINCOME_EDEFAULT;

  /**
   * The default value of the '{@link #isColdsupply() <em>Coldsupply</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isColdsupply()
   * @generated
   * @ordered
   */
  protected static final boolean COLDSUPPLY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isColdsupply() <em>Coldsupply</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isColdsupply()
   * @generated
   * @ordered
   */
  protected boolean coldsupply = COLDSUPPLY_EDEFAULT;

  /**
   * The default value of the '{@link #isMisfortune() <em>Misfortune</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMisfortune()
   * @generated
   * @ordered
   */
  protected static final boolean MISFORTUNE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMisfortune() <em>Misfortune</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMisfortune()
   * @generated
   * @ordered
   */
  protected boolean misfortune = MISFORTUNE_EDEFAULT;

  /**
   * The default value of the '{@link #isLuckevents() <em>Luckevents</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLuckevents()
   * @generated
   * @ordered
   */
  protected static final boolean LUCKEVENTS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLuckevents() <em>Luckevents</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLuckevents()
   * @generated
   * @ordered
   */
  protected boolean luckevents = LUCKEVENTS_EDEFAULT;

  /**
   * The default value of the '{@link #isResearchscale() <em>Researchscale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResearchscale()
   * @generated
   * @ordered
   */
  protected static final boolean RESEARCHSCALE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isResearchscale() <em>Researchscale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResearchscale()
   * @generated
   * @ordered
   */
  protected boolean researchscale = RESEARCHSCALE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GeneralInst1Impl()
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
    return DmPackage.eINSTANCE.getGeneralInst1();
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.GENERAL_INST1__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPoppergold()
  {
    return poppergold;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPoppergold(boolean newPoppergold)
  {
    boolean oldPoppergold = poppergold;
    poppergold = newPoppergold;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.GENERAL_INST1__POPPERGOLD, oldPoppergold, poppergold));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isResourcemult()
  {
    return resourcemult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResourcemult(boolean newResourcemult)
  {
    boolean oldResourcemult = resourcemult;
    resourcemult = newResourcemult;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.GENERAL_INST1__RESOURCEMULT, oldResourcemult, resourcemult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSupplymult()
  {
    return supplymult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSupplymult(boolean newSupplymult)
  {
    boolean oldSupplymult = supplymult;
    supplymult = newSupplymult;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.GENERAL_INST1__SUPPLYMULT, oldSupplymult, supplymult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUnresthalfinc()
  {
    return unresthalfinc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnresthalfinc(boolean newUnresthalfinc)
  {
    boolean oldUnresthalfinc = unresthalfinc;
    unresthalfinc = newUnresthalfinc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.GENERAL_INST1__UNRESTHALFINC, oldUnresthalfinc, unresthalfinc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUnresthalfres()
  {
    return unresthalfres;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnresthalfres(boolean newUnresthalfres)
  {
    boolean oldUnresthalfres = unresthalfres;
    unresthalfres = newUnresthalfres;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.GENERAL_INST1__UNRESTHALFRES, oldUnresthalfres, unresthalfres));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEventisrare()
  {
    return eventisrare;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEventisrare(boolean newEventisrare)
  {
    boolean oldEventisrare = eventisrare;
    eventisrare = newEventisrare;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.GENERAL_INST1__EVENTISRARE, oldEventisrare, eventisrare));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTurmoilincome()
  {
    return turmoilincome;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTurmoilincome(boolean newTurmoilincome)
  {
    boolean oldTurmoilincome = turmoilincome;
    turmoilincome = newTurmoilincome;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.GENERAL_INST1__TURMOILINCOME, oldTurmoilincome, turmoilincome));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTurmoilevents()
  {
    return turmoilevents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTurmoilevents(boolean newTurmoilevents)
  {
    boolean oldTurmoilevents = turmoilevents;
    turmoilevents = newTurmoilevents;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.GENERAL_INST1__TURMOILEVENTS, oldTurmoilevents, turmoilevents));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDeathincome()
  {
    return deathincome;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeathincome(boolean newDeathincome)
  {
    boolean oldDeathincome = deathincome;
    deathincome = newDeathincome;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.GENERAL_INST1__DEATHINCOME, oldDeathincome, deathincome));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDeathsupply()
  {
    return deathsupply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeathsupply(boolean newDeathsupply)
  {
    boolean oldDeathsupply = deathsupply;
    deathsupply = newDeathsupply;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.GENERAL_INST1__DEATHSUPPLY, oldDeathsupply, deathsupply));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDeathdeath()
  {
    return deathdeath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeathdeath(boolean newDeathdeath)
  {
    boolean oldDeathdeath = deathdeath;
    deathdeath = newDeathdeath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.GENERAL_INST1__DEATHDEATH, oldDeathdeath, deathdeath));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSlothincome()
  {
    return slothincome;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSlothincome(boolean newSlothincome)
  {
    boolean oldSlothincome = slothincome;
    slothincome = newSlothincome;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.GENERAL_INST1__SLOTHINCOME, oldSlothincome, slothincome));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSlothresources()
  {
    return slothresources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSlothresources(boolean newSlothresources)
  {
    boolean oldSlothresources = slothresources;
    slothresources = newSlothresources;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.GENERAL_INST1__SLOTHRESOURCES, oldSlothresources, slothresources));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isColdincome()
  {
    return coldincome;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColdincome(boolean newColdincome)
  {
    boolean oldColdincome = coldincome;
    coldincome = newColdincome;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.GENERAL_INST1__COLDINCOME, oldColdincome, coldincome));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isColdsupply()
  {
    return coldsupply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColdsupply(boolean newColdsupply)
  {
    boolean oldColdsupply = coldsupply;
    coldsupply = newColdsupply;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.GENERAL_INST1__COLDSUPPLY, oldColdsupply, coldsupply));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMisfortune()
  {
    return misfortune;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMisfortune(boolean newMisfortune)
  {
    boolean oldMisfortune = misfortune;
    misfortune = newMisfortune;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.GENERAL_INST1__MISFORTUNE, oldMisfortune, misfortune));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLuckevents()
  {
    return luckevents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLuckevents(boolean newLuckevents)
  {
    boolean oldLuckevents = luckevents;
    luckevents = newLuckevents;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.GENERAL_INST1__LUCKEVENTS, oldLuckevents, luckevents));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isResearchscale()
  {
    return researchscale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResearchscale(boolean newResearchscale)
  {
    boolean oldResearchscale = researchscale;
    researchscale = newResearchscale;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.GENERAL_INST1__RESEARCHSCALE, oldResearchscale, researchscale));
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
      case DmPackage.GENERAL_INST1__VALUE:
        return getValue();
      case DmPackage.GENERAL_INST1__POPPERGOLD:
        return isPoppergold();
      case DmPackage.GENERAL_INST1__RESOURCEMULT:
        return isResourcemult();
      case DmPackage.GENERAL_INST1__SUPPLYMULT:
        return isSupplymult();
      case DmPackage.GENERAL_INST1__UNRESTHALFINC:
        return isUnresthalfinc();
      case DmPackage.GENERAL_INST1__UNRESTHALFRES:
        return isUnresthalfres();
      case DmPackage.GENERAL_INST1__EVENTISRARE:
        return isEventisrare();
      case DmPackage.GENERAL_INST1__TURMOILINCOME:
        return isTurmoilincome();
      case DmPackage.GENERAL_INST1__TURMOILEVENTS:
        return isTurmoilevents();
      case DmPackage.GENERAL_INST1__DEATHINCOME:
        return isDeathincome();
      case DmPackage.GENERAL_INST1__DEATHSUPPLY:
        return isDeathsupply();
      case DmPackage.GENERAL_INST1__DEATHDEATH:
        return isDeathdeath();
      case DmPackage.GENERAL_INST1__SLOTHINCOME:
        return isSlothincome();
      case DmPackage.GENERAL_INST1__SLOTHRESOURCES:
        return isSlothresources();
      case DmPackage.GENERAL_INST1__COLDINCOME:
        return isColdincome();
      case DmPackage.GENERAL_INST1__COLDSUPPLY:
        return isColdsupply();
      case DmPackage.GENERAL_INST1__MISFORTUNE:
        return isMisfortune();
      case DmPackage.GENERAL_INST1__LUCKEVENTS:
        return isLuckevents();
      case DmPackage.GENERAL_INST1__RESEARCHSCALE:
        return isResearchscale();
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
      case DmPackage.GENERAL_INST1__VALUE:
        setValue((Integer)newValue);
        return;
      case DmPackage.GENERAL_INST1__POPPERGOLD:
        setPoppergold((Boolean)newValue);
        return;
      case DmPackage.GENERAL_INST1__RESOURCEMULT:
        setResourcemult((Boolean)newValue);
        return;
      case DmPackage.GENERAL_INST1__SUPPLYMULT:
        setSupplymult((Boolean)newValue);
        return;
      case DmPackage.GENERAL_INST1__UNRESTHALFINC:
        setUnresthalfinc((Boolean)newValue);
        return;
      case DmPackage.GENERAL_INST1__UNRESTHALFRES:
        setUnresthalfres((Boolean)newValue);
        return;
      case DmPackage.GENERAL_INST1__EVENTISRARE:
        setEventisrare((Boolean)newValue);
        return;
      case DmPackage.GENERAL_INST1__TURMOILINCOME:
        setTurmoilincome((Boolean)newValue);
        return;
      case DmPackage.GENERAL_INST1__TURMOILEVENTS:
        setTurmoilevents((Boolean)newValue);
        return;
      case DmPackage.GENERAL_INST1__DEATHINCOME:
        setDeathincome((Boolean)newValue);
        return;
      case DmPackage.GENERAL_INST1__DEATHSUPPLY:
        setDeathsupply((Boolean)newValue);
        return;
      case DmPackage.GENERAL_INST1__DEATHDEATH:
        setDeathdeath((Boolean)newValue);
        return;
      case DmPackage.GENERAL_INST1__SLOTHINCOME:
        setSlothincome((Boolean)newValue);
        return;
      case DmPackage.GENERAL_INST1__SLOTHRESOURCES:
        setSlothresources((Boolean)newValue);
        return;
      case DmPackage.GENERAL_INST1__COLDINCOME:
        setColdincome((Boolean)newValue);
        return;
      case DmPackage.GENERAL_INST1__COLDSUPPLY:
        setColdsupply((Boolean)newValue);
        return;
      case DmPackage.GENERAL_INST1__MISFORTUNE:
        setMisfortune((Boolean)newValue);
        return;
      case DmPackage.GENERAL_INST1__LUCKEVENTS:
        setLuckevents((Boolean)newValue);
        return;
      case DmPackage.GENERAL_INST1__RESEARCHSCALE:
        setResearchscale((Boolean)newValue);
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
      case DmPackage.GENERAL_INST1__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case DmPackage.GENERAL_INST1__POPPERGOLD:
        setPoppergold(POPPERGOLD_EDEFAULT);
        return;
      case DmPackage.GENERAL_INST1__RESOURCEMULT:
        setResourcemult(RESOURCEMULT_EDEFAULT);
        return;
      case DmPackage.GENERAL_INST1__SUPPLYMULT:
        setSupplymult(SUPPLYMULT_EDEFAULT);
        return;
      case DmPackage.GENERAL_INST1__UNRESTHALFINC:
        setUnresthalfinc(UNRESTHALFINC_EDEFAULT);
        return;
      case DmPackage.GENERAL_INST1__UNRESTHALFRES:
        setUnresthalfres(UNRESTHALFRES_EDEFAULT);
        return;
      case DmPackage.GENERAL_INST1__EVENTISRARE:
        setEventisrare(EVENTISRARE_EDEFAULT);
        return;
      case DmPackage.GENERAL_INST1__TURMOILINCOME:
        setTurmoilincome(TURMOILINCOME_EDEFAULT);
        return;
      case DmPackage.GENERAL_INST1__TURMOILEVENTS:
        setTurmoilevents(TURMOILEVENTS_EDEFAULT);
        return;
      case DmPackage.GENERAL_INST1__DEATHINCOME:
        setDeathincome(DEATHINCOME_EDEFAULT);
        return;
      case DmPackage.GENERAL_INST1__DEATHSUPPLY:
        setDeathsupply(DEATHSUPPLY_EDEFAULT);
        return;
      case DmPackage.GENERAL_INST1__DEATHDEATH:
        setDeathdeath(DEATHDEATH_EDEFAULT);
        return;
      case DmPackage.GENERAL_INST1__SLOTHINCOME:
        setSlothincome(SLOTHINCOME_EDEFAULT);
        return;
      case DmPackage.GENERAL_INST1__SLOTHRESOURCES:
        setSlothresources(SLOTHRESOURCES_EDEFAULT);
        return;
      case DmPackage.GENERAL_INST1__COLDINCOME:
        setColdincome(COLDINCOME_EDEFAULT);
        return;
      case DmPackage.GENERAL_INST1__COLDSUPPLY:
        setColdsupply(COLDSUPPLY_EDEFAULT);
        return;
      case DmPackage.GENERAL_INST1__MISFORTUNE:
        setMisfortune(MISFORTUNE_EDEFAULT);
        return;
      case DmPackage.GENERAL_INST1__LUCKEVENTS:
        setLuckevents(LUCKEVENTS_EDEFAULT);
        return;
      case DmPackage.GENERAL_INST1__RESEARCHSCALE:
        setResearchscale(RESEARCHSCALE_EDEFAULT);
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
      case DmPackage.GENERAL_INST1__VALUE:
        return value != VALUE_EDEFAULT;
      case DmPackage.GENERAL_INST1__POPPERGOLD:
        return poppergold != POPPERGOLD_EDEFAULT;
      case DmPackage.GENERAL_INST1__RESOURCEMULT:
        return resourcemult != RESOURCEMULT_EDEFAULT;
      case DmPackage.GENERAL_INST1__SUPPLYMULT:
        return supplymult != SUPPLYMULT_EDEFAULT;
      case DmPackage.GENERAL_INST1__UNRESTHALFINC:
        return unresthalfinc != UNRESTHALFINC_EDEFAULT;
      case DmPackage.GENERAL_INST1__UNRESTHALFRES:
        return unresthalfres != UNRESTHALFRES_EDEFAULT;
      case DmPackage.GENERAL_INST1__EVENTISRARE:
        return eventisrare != EVENTISRARE_EDEFAULT;
      case DmPackage.GENERAL_INST1__TURMOILINCOME:
        return turmoilincome != TURMOILINCOME_EDEFAULT;
      case DmPackage.GENERAL_INST1__TURMOILEVENTS:
        return turmoilevents != TURMOILEVENTS_EDEFAULT;
      case DmPackage.GENERAL_INST1__DEATHINCOME:
        return deathincome != DEATHINCOME_EDEFAULT;
      case DmPackage.GENERAL_INST1__DEATHSUPPLY:
        return deathsupply != DEATHSUPPLY_EDEFAULT;
      case DmPackage.GENERAL_INST1__DEATHDEATH:
        return deathdeath != DEATHDEATH_EDEFAULT;
      case DmPackage.GENERAL_INST1__SLOTHINCOME:
        return slothincome != SLOTHINCOME_EDEFAULT;
      case DmPackage.GENERAL_INST1__SLOTHRESOURCES:
        return slothresources != SLOTHRESOURCES_EDEFAULT;
      case DmPackage.GENERAL_INST1__COLDINCOME:
        return coldincome != COLDINCOME_EDEFAULT;
      case DmPackage.GENERAL_INST1__COLDSUPPLY:
        return coldsupply != COLDSUPPLY_EDEFAULT;
      case DmPackage.GENERAL_INST1__MISFORTUNE:
        return misfortune != MISFORTUNE_EDEFAULT;
      case DmPackage.GENERAL_INST1__LUCKEVENTS:
        return luckevents != LUCKEVENTS_EDEFAULT;
      case DmPackage.GENERAL_INST1__RESEARCHSCALE:
        return researchscale != RESEARCHSCALE_EDEFAULT;
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

} //GeneralInst1Impl
