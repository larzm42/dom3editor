/**
 * <copyright>
 * </copyright>
 *
 */
package org.larz.dom3.dm.dm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Monster By Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.SelectMonsterById#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.larz.dom3.dm.dm.DmPackage#getSelectMonsterById()
 * @model
 * @generated
 */
public interface SelectMonsterById extends Monster
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
   * @see org.larz.dom3.dm.dm.DmPackage#getSelectMonsterById_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.larz.dom3.dm.dm.SelectMonsterById#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // SelectMonsterById
