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
import org.larz.dom3.dm.dm.SpellInst2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spell Inst2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SpellInst2Impl#getValue <em>Value</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SpellInst2Impl#isSchool <em>School</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SpellInst2Impl#isResearchlevel <em>Researchlevel</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SpellInst2Impl#isAoe <em>Aoe</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SpellInst2Impl#isDamage <em>Damage</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SpellInst2Impl#isEffect <em>Effect</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SpellInst2Impl#isFatiguecost <em>Fatiguecost</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SpellInst2Impl#isFlightspr <em>Flightspr</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SpellInst2Impl#isExplspr <em>Explspr</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SpellInst2Impl#isNreff <em>Nreff</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SpellInst2Impl#isRange <em>Range</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SpellInst2Impl#isPrecision <em>Precision</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SpellInst2Impl#isSound <em>Sound</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SpellInst2Impl#isSpec <em>Spec</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SpellInst2Impl#isRestricted <em>Restricted</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpellInst2Impl extends SpellPattern2Impl implements SpellInst2
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
   * The default value of the '{@link #isSchool() <em>School</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSchool()
   * @generated
   * @ordered
   */
  protected static final boolean SCHOOL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSchool() <em>School</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSchool()
   * @generated
   * @ordered
   */
  protected boolean school = SCHOOL_EDEFAULT;

  /**
   * The default value of the '{@link #isResearchlevel() <em>Researchlevel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResearchlevel()
   * @generated
   * @ordered
   */
  protected static final boolean RESEARCHLEVEL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isResearchlevel() <em>Researchlevel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isResearchlevel()
   * @generated
   * @ordered
   */
  protected boolean researchlevel = RESEARCHLEVEL_EDEFAULT;

  /**
   * The default value of the '{@link #isAoe() <em>Aoe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAoe()
   * @generated
   * @ordered
   */
  protected static final boolean AOE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAoe() <em>Aoe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAoe()
   * @generated
   * @ordered
   */
  protected boolean aoe = AOE_EDEFAULT;

  /**
   * The default value of the '{@link #isDamage() <em>Damage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDamage()
   * @generated
   * @ordered
   */
  protected static final boolean DAMAGE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDamage() <em>Damage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDamage()
   * @generated
   * @ordered
   */
  protected boolean damage = DAMAGE_EDEFAULT;

  /**
   * The default value of the '{@link #isEffect() <em>Effect</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEffect()
   * @generated
   * @ordered
   */
  protected static final boolean EFFECT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEffect() <em>Effect</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEffect()
   * @generated
   * @ordered
   */
  protected boolean effect = EFFECT_EDEFAULT;

  /**
   * The default value of the '{@link #isFatiguecost() <em>Fatiguecost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFatiguecost()
   * @generated
   * @ordered
   */
  protected static final boolean FATIGUECOST_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFatiguecost() <em>Fatiguecost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFatiguecost()
   * @generated
   * @ordered
   */
  protected boolean fatiguecost = FATIGUECOST_EDEFAULT;

  /**
   * The default value of the '{@link #isFlightspr() <em>Flightspr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFlightspr()
   * @generated
   * @ordered
   */
  protected static final boolean FLIGHTSPR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFlightspr() <em>Flightspr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFlightspr()
   * @generated
   * @ordered
   */
  protected boolean flightspr = FLIGHTSPR_EDEFAULT;

  /**
   * The default value of the '{@link #isExplspr() <em>Explspr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExplspr()
   * @generated
   * @ordered
   */
  protected static final boolean EXPLSPR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExplspr() <em>Explspr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExplspr()
   * @generated
   * @ordered
   */
  protected boolean explspr = EXPLSPR_EDEFAULT;

  /**
   * The default value of the '{@link #isNreff() <em>Nreff</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNreff()
   * @generated
   * @ordered
   */
  protected static final boolean NREFF_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNreff() <em>Nreff</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNreff()
   * @generated
   * @ordered
   */
  protected boolean nreff = NREFF_EDEFAULT;

  /**
   * The default value of the '{@link #isRange() <em>Range</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRange()
   * @generated
   * @ordered
   */
  protected static final boolean RANGE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRange() <em>Range</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRange()
   * @generated
   * @ordered
   */
  protected boolean range = RANGE_EDEFAULT;

  /**
   * The default value of the '{@link #isPrecision() <em>Precision</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPrecision()
   * @generated
   * @ordered
   */
  protected static final boolean PRECISION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPrecision() <em>Precision</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPrecision()
   * @generated
   * @ordered
   */
  protected boolean precision = PRECISION_EDEFAULT;

  /**
   * The default value of the '{@link #isSound() <em>Sound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSound()
   * @generated
   * @ordered
   */
  protected static final boolean SOUND_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSound() <em>Sound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSound()
   * @generated
   * @ordered
   */
  protected boolean sound = SOUND_EDEFAULT;

  /**
   * The default value of the '{@link #isSpec() <em>Spec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSpec()
   * @generated
   * @ordered
   */
  protected static final boolean SPEC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSpec() <em>Spec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSpec()
   * @generated
   * @ordered
   */
  protected boolean spec = SPEC_EDEFAULT;

  /**
   * The default value of the '{@link #isRestricted() <em>Restricted</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRestricted()
   * @generated
   * @ordered
   */
  protected static final boolean RESTRICTED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRestricted() <em>Restricted</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRestricted()
   * @generated
   * @ordered
   */
  protected boolean restricted = RESTRICTED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpellInst2Impl()
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
    return DmPackage.eINSTANCE.getSpellInst2();
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SPELL_INST2__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSchool()
  {
    return school;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSchool(boolean newSchool)
  {
    boolean oldSchool = school;
    school = newSchool;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SPELL_INST2__SCHOOL, oldSchool, school));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isResearchlevel()
  {
    return researchlevel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResearchlevel(boolean newResearchlevel)
  {
    boolean oldResearchlevel = researchlevel;
    researchlevel = newResearchlevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SPELL_INST2__RESEARCHLEVEL, oldResearchlevel, researchlevel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAoe()
  {
    return aoe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAoe(boolean newAoe)
  {
    boolean oldAoe = aoe;
    aoe = newAoe;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SPELL_INST2__AOE, oldAoe, aoe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDamage()
  {
    return damage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDamage(boolean newDamage)
  {
    boolean oldDamage = damage;
    damage = newDamage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SPELL_INST2__DAMAGE, oldDamage, damage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEffect()
  {
    return effect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEffect(boolean newEffect)
  {
    boolean oldEffect = effect;
    effect = newEffect;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SPELL_INST2__EFFECT, oldEffect, effect));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFatiguecost()
  {
    return fatiguecost;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFatiguecost(boolean newFatiguecost)
  {
    boolean oldFatiguecost = fatiguecost;
    fatiguecost = newFatiguecost;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SPELL_INST2__FATIGUECOST, oldFatiguecost, fatiguecost));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFlightspr()
  {
    return flightspr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFlightspr(boolean newFlightspr)
  {
    boolean oldFlightspr = flightspr;
    flightspr = newFlightspr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SPELL_INST2__FLIGHTSPR, oldFlightspr, flightspr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExplspr()
  {
    return explspr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExplspr(boolean newExplspr)
  {
    boolean oldExplspr = explspr;
    explspr = newExplspr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SPELL_INST2__EXPLSPR, oldExplspr, explspr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNreff()
  {
    return nreff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNreff(boolean newNreff)
  {
    boolean oldNreff = nreff;
    nreff = newNreff;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SPELL_INST2__NREFF, oldNreff, nreff));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRange()
  {
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRange(boolean newRange)
  {
    boolean oldRange = range;
    range = newRange;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SPELL_INST2__RANGE, oldRange, range));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPrecision()
  {
    return precision;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrecision(boolean newPrecision)
  {
    boolean oldPrecision = precision;
    precision = newPrecision;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SPELL_INST2__PRECISION, oldPrecision, precision));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSound()
  {
    return sound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSound(boolean newSound)
  {
    boolean oldSound = sound;
    sound = newSound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SPELL_INST2__SOUND, oldSound, sound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSpec()
  {
    return spec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpec(boolean newSpec)
  {
    boolean oldSpec = spec;
    spec = newSpec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SPELL_INST2__SPEC, oldSpec, spec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRestricted()
  {
    return restricted;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRestricted(boolean newRestricted)
  {
    boolean oldRestricted = restricted;
    restricted = newRestricted;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.SPELL_INST2__RESTRICTED, oldRestricted, restricted));
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
      case DmPackage.SPELL_INST2__VALUE:
        return getValue();
      case DmPackage.SPELL_INST2__SCHOOL:
        return isSchool();
      case DmPackage.SPELL_INST2__RESEARCHLEVEL:
        return isResearchlevel();
      case DmPackage.SPELL_INST2__AOE:
        return isAoe();
      case DmPackage.SPELL_INST2__DAMAGE:
        return isDamage();
      case DmPackage.SPELL_INST2__EFFECT:
        return isEffect();
      case DmPackage.SPELL_INST2__FATIGUECOST:
        return isFatiguecost();
      case DmPackage.SPELL_INST2__FLIGHTSPR:
        return isFlightspr();
      case DmPackage.SPELL_INST2__EXPLSPR:
        return isExplspr();
      case DmPackage.SPELL_INST2__NREFF:
        return isNreff();
      case DmPackage.SPELL_INST2__RANGE:
        return isRange();
      case DmPackage.SPELL_INST2__PRECISION:
        return isPrecision();
      case DmPackage.SPELL_INST2__SOUND:
        return isSound();
      case DmPackage.SPELL_INST2__SPEC:
        return isSpec();
      case DmPackage.SPELL_INST2__RESTRICTED:
        return isRestricted();
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
      case DmPackage.SPELL_INST2__VALUE:
        setValue((Integer)newValue);
        return;
      case DmPackage.SPELL_INST2__SCHOOL:
        setSchool((Boolean)newValue);
        return;
      case DmPackage.SPELL_INST2__RESEARCHLEVEL:
        setResearchlevel((Boolean)newValue);
        return;
      case DmPackage.SPELL_INST2__AOE:
        setAoe((Boolean)newValue);
        return;
      case DmPackage.SPELL_INST2__DAMAGE:
        setDamage((Boolean)newValue);
        return;
      case DmPackage.SPELL_INST2__EFFECT:
        setEffect((Boolean)newValue);
        return;
      case DmPackage.SPELL_INST2__FATIGUECOST:
        setFatiguecost((Boolean)newValue);
        return;
      case DmPackage.SPELL_INST2__FLIGHTSPR:
        setFlightspr((Boolean)newValue);
        return;
      case DmPackage.SPELL_INST2__EXPLSPR:
        setExplspr((Boolean)newValue);
        return;
      case DmPackage.SPELL_INST2__NREFF:
        setNreff((Boolean)newValue);
        return;
      case DmPackage.SPELL_INST2__RANGE:
        setRange((Boolean)newValue);
        return;
      case DmPackage.SPELL_INST2__PRECISION:
        setPrecision((Boolean)newValue);
        return;
      case DmPackage.SPELL_INST2__SOUND:
        setSound((Boolean)newValue);
        return;
      case DmPackage.SPELL_INST2__SPEC:
        setSpec((Boolean)newValue);
        return;
      case DmPackage.SPELL_INST2__RESTRICTED:
        setRestricted((Boolean)newValue);
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
      case DmPackage.SPELL_INST2__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case DmPackage.SPELL_INST2__SCHOOL:
        setSchool(SCHOOL_EDEFAULT);
        return;
      case DmPackage.SPELL_INST2__RESEARCHLEVEL:
        setResearchlevel(RESEARCHLEVEL_EDEFAULT);
        return;
      case DmPackage.SPELL_INST2__AOE:
        setAoe(AOE_EDEFAULT);
        return;
      case DmPackage.SPELL_INST2__DAMAGE:
        setDamage(DAMAGE_EDEFAULT);
        return;
      case DmPackage.SPELL_INST2__EFFECT:
        setEffect(EFFECT_EDEFAULT);
        return;
      case DmPackage.SPELL_INST2__FATIGUECOST:
        setFatiguecost(FATIGUECOST_EDEFAULT);
        return;
      case DmPackage.SPELL_INST2__FLIGHTSPR:
        setFlightspr(FLIGHTSPR_EDEFAULT);
        return;
      case DmPackage.SPELL_INST2__EXPLSPR:
        setExplspr(EXPLSPR_EDEFAULT);
        return;
      case DmPackage.SPELL_INST2__NREFF:
        setNreff(NREFF_EDEFAULT);
        return;
      case DmPackage.SPELL_INST2__RANGE:
        setRange(RANGE_EDEFAULT);
        return;
      case DmPackage.SPELL_INST2__PRECISION:
        setPrecision(PRECISION_EDEFAULT);
        return;
      case DmPackage.SPELL_INST2__SOUND:
        setSound(SOUND_EDEFAULT);
        return;
      case DmPackage.SPELL_INST2__SPEC:
        setSpec(SPEC_EDEFAULT);
        return;
      case DmPackage.SPELL_INST2__RESTRICTED:
        setRestricted(RESTRICTED_EDEFAULT);
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
      case DmPackage.SPELL_INST2__VALUE:
        return value != VALUE_EDEFAULT;
      case DmPackage.SPELL_INST2__SCHOOL:
        return school != SCHOOL_EDEFAULT;
      case DmPackage.SPELL_INST2__RESEARCHLEVEL:
        return researchlevel != RESEARCHLEVEL_EDEFAULT;
      case DmPackage.SPELL_INST2__AOE:
        return aoe != AOE_EDEFAULT;
      case DmPackage.SPELL_INST2__DAMAGE:
        return damage != DAMAGE_EDEFAULT;
      case DmPackage.SPELL_INST2__EFFECT:
        return effect != EFFECT_EDEFAULT;
      case DmPackage.SPELL_INST2__FATIGUECOST:
        return fatiguecost != FATIGUECOST_EDEFAULT;
      case DmPackage.SPELL_INST2__FLIGHTSPR:
        return flightspr != FLIGHTSPR_EDEFAULT;
      case DmPackage.SPELL_INST2__EXPLSPR:
        return explspr != EXPLSPR_EDEFAULT;
      case DmPackage.SPELL_INST2__NREFF:
        return nreff != NREFF_EDEFAULT;
      case DmPackage.SPELL_INST2__RANGE:
        return range != RANGE_EDEFAULT;
      case DmPackage.SPELL_INST2__PRECISION:
        return precision != PRECISION_EDEFAULT;
      case DmPackage.SPELL_INST2__SOUND:
        return sound != SOUND_EDEFAULT;
      case DmPackage.SPELL_INST2__SPEC:
        return spec != SPEC_EDEFAULT;
      case DmPackage.SPELL_INST2__RESTRICTED:
        return restricted != RESTRICTED_EDEFAULT;
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
    result.append(", school: ");
    result.append(school);
    result.append(", researchlevel: ");
    result.append(researchlevel);
    result.append(", aoe: ");
    result.append(aoe);
    result.append(", damage: ");
    result.append(damage);
    result.append(", effect: ");
    result.append(effect);
    result.append(", fatiguecost: ");
    result.append(fatiguecost);
    result.append(", flightspr: ");
    result.append(flightspr);
    result.append(", explspr: ");
    result.append(explspr);
    result.append(", nreff: ");
    result.append(nreff);
    result.append(", range: ");
    result.append(range);
    result.append(", precision: ");
    result.append(precision);
    result.append(", sound: ");
    result.append(sound);
    result.append(", spec: ");
    result.append(spec);
    result.append(", restricted: ");
    result.append(restricted);
    result.append(')');
    return result.toString();
  }

} //SpellInst2Impl
