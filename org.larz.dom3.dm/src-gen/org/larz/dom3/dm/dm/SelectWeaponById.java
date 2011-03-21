/**
 * <copyright>
 * </copyright>
 *
 */
package org.larz.dom3.dm.dm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Weapon By Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.SelectWeaponById#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.larz.dom3.dm.dm.DmPackage#getSelectWeaponById()
 * @model
 * @generated
 */
public interface SelectWeaponById extends Weapon
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
   * @see org.larz.dom3.dm.dm.DmPackage#getSelectWeaponById_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.larz.dom3.dm.dm.SelectWeaponById#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // SelectWeaponById
