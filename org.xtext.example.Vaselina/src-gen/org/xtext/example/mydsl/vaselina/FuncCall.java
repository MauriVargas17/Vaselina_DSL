/**
 * generated by Xtext 2.27.0-SNAPSHOT
 */
package org.xtext.example.mydsl.vaselina;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Func Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.vaselina.FuncCall#getFunc <em>Func</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.vaselina.VaselinaPackage#getFuncCall()
 * @model
 * @generated
 */
public interface FuncCall extends AbstractMethodCall
{
  /**
   * Returns the value of the '<em><b>Func</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func</em>' reference.
   * @see #setFunc(FuncDefinition)
   * @see org.xtext.example.mydsl.vaselina.VaselinaPackage#getFuncCall_Func()
   * @model
   * @generated
   */
  FuncDefinition getFunc();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.vaselina.FuncCall#getFunc <em>Func</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Func</em>' reference.
   * @see #getFunc()
   * @generated
   */
  void setFunc(FuncDefinition value);

} // FuncCall
