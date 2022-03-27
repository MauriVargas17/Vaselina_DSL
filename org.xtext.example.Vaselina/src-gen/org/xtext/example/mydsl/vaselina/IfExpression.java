/**
 * generated by Xtext 2.27.0-SNAPSHOT
 */
package org.xtext.example.mydsl.vaselina;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.vaselina.IfExpression#getIfconditon <em>Ifconditon</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.vaselina.IfExpression#getThen <em>Then</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.vaselina.IfExpression#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.vaselina.VaselinaPackage#getIfExpression()
 * @model
 * @generated
 */
public interface IfExpression extends BodyStatement
{
  /**
   * Returns the value of the '<em><b>Ifconditon</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ifconditon</em>' containment reference.
   * @see #setIfconditon(varExpression)
   * @see org.xtext.example.mydsl.vaselina.VaselinaPackage#getIfExpression_Ifconditon()
   * @model containment="true"
   * @generated
   */
  varExpression getIfconditon();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.vaselina.IfExpression#getIfconditon <em>Ifconditon</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ifconditon</em>' containment reference.
   * @see #getIfconditon()
   * @generated
   */
  void setIfconditon(varExpression value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.vaselina.BodyStatement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference list.
   * @see org.xtext.example.mydsl.vaselina.VaselinaPackage#getIfExpression_Then()
   * @model containment="true"
   * @generated
   */
  EList<BodyStatement> getThen();

  /**
   * Returns the value of the '<em><b>Else</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.vaselina.BodyStatement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else</em>' containment reference list.
   * @see org.xtext.example.mydsl.vaselina.VaselinaPackage#getIfExpression_Else()
   * @model containment="true"
   * @generated
   */
  EList<BodyStatement> getElse();

} // IfExpression