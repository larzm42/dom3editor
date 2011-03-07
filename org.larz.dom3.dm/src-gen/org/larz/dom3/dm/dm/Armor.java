/**
 * <copyright>
 * </copyright>
 *

 */
package org.larz.dom3.dm.dm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Armor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.Armor#getMods <em>Mods</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.larz.dom3.dm.dm.DmPackage#getArmor()
 * @model
 * @generated
 */
public interface Armor extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Mods</b></em>' containment reference list.
   * The list contents are of type {@link org.larz.dom3.dm.dm.ArmorMods}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mods</em>' containment reference list.
   * @see org.larz.dom3.dm.dm.DmPackage#getArmor_Mods()
   * @model containment="true"
   * @generated
   */
  EList<ArmorMods> getMods();

} // Armor
