/**
 * generated by Xtext 2.27.0-SNAPSHOT
 */
package org.xtext.example.mydsl.vaselina;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>var Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.vaselina.varAssignment#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.vaselina.varAssignment#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.vaselina.VaselinaPackage#getvarAssignment()
 * @model
 * @generated
 */
public interface varAssignment extends BodyStatement
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(Variable)
   * @see org.xtext.example.mydsl.vaselina.VaselinaPackage#getvarAssignment_Variable()
   * @model containment="true"
   * @generated
   */
  Variable getVariable();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.vaselina.varAssignment#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variable value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(varExpression)
   * @see org.xtext.example.mydsl.vaselina.VaselinaPackage#getvarAssignment_Expr()
   * @model containment="true"
   * @generated
   */
  varExpression getExpr();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.vaselina.varAssignment#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(varExpression value);

} // varAssignment
