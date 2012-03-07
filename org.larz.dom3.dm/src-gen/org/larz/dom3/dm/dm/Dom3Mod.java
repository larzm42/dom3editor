/**
 * <copyright>
 * </copyright>
 *
 */
package org.larz.dom3.dm.dm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dom3 Mod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.larz.dom3.dm.dm.Dom3Mod#getModname <em>Modname</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.Dom3Mod#getDesc <em>Desc</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.Dom3Mod#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.Dom3Mod#getVersion <em>Version</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.Dom3Mod#getDomversion <em>Domversion</em>}</li>
 *   <li>{@link org.larz.dom3.dm.dm.Dom3Mod#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.larz.dom3.dm.dm.DmPackage#getDom3Mod()
 * @model
 * @generated
 */
public interface Dom3Mod extends EObject
{
  /**
   * Returns the value of the '<em><b>Modname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modname</em>' attribute.
   * @see #setModname(String)
   * @see org.larz.dom3.dm.dm.DmPackage#getDom3Mod_Modname()
   * @model
   * @generated
   */
  String getModname();

  /**
   * Sets the value of the '{@link org.larz.dom3.dm.dm.Dom3Mod#getModname <em>Modname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modname</em>' attribute.
   * @see #getModname()
   * @generated
   */
  void setModname(String value);

  /**
   * Returns the value of the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Desc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Desc</em>' attribute.
   * @see #setDesc(String)
   * @see org.larz.dom3.dm.dm.DmPackage#getDom3Mod_Desc()
   * @model
   * @generated
   */
  String getDesc();

  /**
   * Sets the value of the '{@link org.larz.dom3.dm.dm.Dom3Mod#getDesc <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Desc</em>' attribute.
   * @see #getDesc()
   * @generated
   */
  void setDesc(String value);

  /**
   * Returns the value of the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Icon</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Icon</em>' attribute.
   * @see #setIcon(String)
   * @see org.larz.dom3.dm.dm.DmPackage#getDom3Mod_Icon()
   * @model
   * @generated
   */
  String getIcon();

  /**
   * Sets the value of the '{@link org.larz.dom3.dm.dm.Dom3Mod#getIcon <em>Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Icon</em>' attribute.
   * @see #getIcon()
   * @generated
   */
  void setIcon(String value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see org.larz.dom3.dm.dm.DmPackage#getDom3Mod_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link org.larz.dom3.dm.dm.Dom3Mod#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Domversion</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domversion</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domversion</em>' attribute.
   * @see #setDomversion(String)
   * @see org.larz.dom3.dm.dm.DmPackage#getDom3Mod_Domversion()
   * @model
   * @generated
   */
  String getDomversion();

  /**
   * Sets the value of the '{@link org.larz.dom3.dm.dm.Dom3Mod#getDomversion <em>Domversion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Domversion</em>' attribute.
   * @see #getDomversion()
   * @generated
   */
  void setDomversion(String value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.larz.dom3.dm.dm.AbstractElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.larz.dom3.dm.dm.DmPackage#getDom3Mod_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElements();

} // Dom3Mod
