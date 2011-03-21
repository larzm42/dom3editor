/**
 * <copyright>
 * </copyright>
 *
 */
package org.larz.dom3.dm.dm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.larz.dom3.dm.dm.DmPackage;
import org.larz.dom3.dm.dm.Spell;
import org.larz.dom3.dm.dm.SpellMods;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SpellImpl#getMods <em>Mods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpellImpl extends AbstractElementImpl implements Spell
{
  /**
   * The cached value of the '{@link #getMods() <em>Mods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMods()
   * @generated
   * @ordered
   */
  protected EList<SpellMods> mods;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpellImpl()
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
    return DmPackage.eINSTANCE.getSpell();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SpellMods> getMods()
  {
    if (mods == null)
    {
      mods = new EObjectContainmentEList<SpellMods>(SpellMods.class, this, DmPackage.SPELL__MODS);
    }
    return mods;
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
      case DmPackage.SPELL__MODS:
        return ((InternalEList<?>)getMods()).basicRemove(otherEnd, msgs);
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
      case DmPackage.SPELL__MODS:
        return getMods();
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
      case DmPackage.SPELL__MODS:
        getMods().clear();
        getMods().addAll((Collection<? extends SpellMods>)newValue);
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
      case DmPackage.SPELL__MODS:
        getMods().clear();
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
      case DmPackage.SPELL__MODS:
        return mods != null && !mods.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SpellImpl
