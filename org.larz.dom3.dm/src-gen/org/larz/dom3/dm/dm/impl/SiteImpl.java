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
import org.larz.dom3.dm.dm.Site;
import org.larz.dom3.dm.dm.SiteMods;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.impl.SiteImpl#getMods <em>Mods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SiteImpl extends AbstractElementImpl implements Site
{
  /**
   * The cached value of the '{@link #getMods() <em>Mods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMods()
   * @generated
   * @ordered
   */
  protected EList<SiteMods> mods;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SiteImpl()
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
    return DmPackage.eINSTANCE.getSite();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SiteMods> getMods()
  {
    if (mods == null)
    {
      mods = new EObjectContainmentEList<SiteMods>(SiteMods.class, this, DmPackage.SITE__MODS);
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
      case DmPackage.SITE__MODS:
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
      case DmPackage.SITE__MODS:
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
      case DmPackage.SITE__MODS:
        getMods().clear();
        getMods().addAll((Collection<? extends SiteMods>)newValue);
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
      case DmPackage.SITE__MODS:
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
      case DmPackage.SITE__MODS:
        return mods != null && !mods.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SiteImpl
