/**
 * <copyright>
 * </copyright>
 *

 */
package org.larz.dom3.dm.dm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.Spell#getMods <em>Mods</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.larz.dom3.dm.dm.DmPackage#getSpell()
 * @model
 * @generated
 */
public interface Spell extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Mods</b></em>' containment reference list.
   * The list contents are of type {@link org.larz.dom3.dm.dm.SpellMods}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mods</em>' containment reference list.
   * @see org.larz.dom3.dm.dm.DmPackage#getSpell_Mods()
   * @model containment="true"
   * @generated
   */
  EList<SpellMods> getMods();

} // Spell
