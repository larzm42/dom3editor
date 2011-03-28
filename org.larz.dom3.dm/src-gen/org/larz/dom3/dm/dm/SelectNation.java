/**
 * <copyright>
 * </copyright>
 *

 */
package org.larz.dom3.dm.dm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Nation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.SelectNation#getValue <em>Value</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.SelectNation#getMods <em>Mods</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.larz.dom3.dm.dm.DmPackage#getSelectNation()
 * @model
 * @generated
 */
public interface SelectNation extends Nation
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see org.larz.dom3.dm.dm.DmPackage#getSelectNation_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.larz.dom3.dm.dm.SelectNation#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Mods</b></em>' containment reference list.
   * The list contents are of type {@link org.larz.dom3.dm.dm.NationMods}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mods</em>' containment reference list.
   * @see org.larz.dom3.dm.dm.DmPackage#getSelectNation_Mods()
   * @model containment="true"
   * @generated
   */
  EList<NationMods> getMods();

} // SelectNation
