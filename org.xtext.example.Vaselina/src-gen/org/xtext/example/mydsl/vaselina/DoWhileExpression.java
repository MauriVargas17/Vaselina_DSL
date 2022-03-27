/**
 * generated by Xtext 2.27.0-SNAPSHOT
 */
package org.xtext.example.mydsl.vaselina;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Do While Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.vaselina.DoWhileExpression#getLoopConditon <em>Loop Conditon</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.vaselina.DoWhileExpression#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.vaselina.VaselinaPackage#getDoWhileExpression()
 * @model
 * @generated
 */
public interface DoWhileExpression extends BodyStatement
{
  /**
   * Returns the value of the '<em><b>Loop Conditon</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loop Conditon</em>' containment reference.
   * @see #setLoopConditon(varExpression)
   * @see org.xtext.example.mydsl.vaselina.VaselinaPackage#getDoWhileExpression_LoopConditon()
   * @model containment="true"
   * @generated
   */
  varExpression getLoopConditon();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.vaselina.DoWhileExpression#getLoopConditon <em>Loop Conditon</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loop Conditon</em>' containment reference.
   * @see #getLoopConditon()
   * @generated
   */
  void setLoopConditon(varExpression value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.vaselina.BodyStatement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference list.
   * @see org.xtext.example.mydsl.vaselina.VaselinaPackage#getDoWhileExpression_Body()
   * @model containment="true"
   * @generated
   */
  EList<BodyStatement> getBody();

} // DoWhileExpression