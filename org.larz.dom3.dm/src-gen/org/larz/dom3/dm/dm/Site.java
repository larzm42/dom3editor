/**
 * <copyright>
 * </copyright>
 *

 */
package org.larz.dom3.dm.dm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.Site#getMods <em>Mods</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.larz.dom3.dm.dm.DmPackage#getSite()
 * @model
 * @generated
 */
public interface Site extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Mods</b></em>' containment reference list.
   * The list contents are of type {@link org.larz.dom3.dm.dm.SiteMods}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mods</em>' containment reference list.
   * @see org.larz.dom3.dm.dm.DmPackage#getSite_Mods()
   * @model containment="true"
   * @generated
   */
  EList<SiteMods> getMods();

} // Site
