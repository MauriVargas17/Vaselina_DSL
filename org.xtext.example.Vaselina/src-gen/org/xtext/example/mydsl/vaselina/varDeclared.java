/**
 * generated by Xtext 2.27.0-SNAPSHOT
 */
package org.xtext.example.mydsl.vaselina;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>var Declared</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.vaselina.varDeclared#getScope <em>Scope</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.vaselina.varDeclared#getDim <em>Dim</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.vaselina.VaselinaPackage#getvarDeclared()
 * @model
 * @generated
 */
public interface varDeclared extends BodyStatement, varSymbol
{
  /**
   * Returns the value of the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scope</em>' attribute.
   * @see #setScope(String)
   * @see org.xtext.example.mydsl.vaselina.VaselinaPackage#getvarDeclared_Scope()
   * @model
   * @generated
   */
  String getScope();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.vaselina.varDeclared#getScope <em>Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scope</em>' attribute.
   * @see #getScope()
   * @generated
   */
  void setScope(String value);

  /**
   * Returns the value of the '<em><b>Dim</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.vaselina.arrayDimension}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dim</em>' containment reference list.
   * @see org.xtext.example.mydsl.vaselina.VaselinaPackage#getvarDeclared_Dim()
   * @model containment="true"
   * @generated
   */
  EList<arrayDimension> getDim();

} // varDeclared
