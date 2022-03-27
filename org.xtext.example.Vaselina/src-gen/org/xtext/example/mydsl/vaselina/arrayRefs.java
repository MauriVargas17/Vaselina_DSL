/**
 * generated by Xtext 2.27.0-SNAPSHOT
 */
package org.xtext.example.mydsl.vaselina;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>array Refs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.vaselina.arrayRefs#getDim <em>Dim</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.vaselina.VaselinaPackage#getarrayRefs()
 * @model
 * @generated
 */
public interface arrayRefs extends Variable
{
  /**
   * Returns the value of the '<em><b>Dim</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.vaselina.arrayDimension}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dim</em>' containment reference list.
   * @see org.xtext.example.mydsl.vaselina.VaselinaPackage#getarrayRefs_Dim()
   * @model containment="true"
   * @generated
   */
  EList<arrayDimension> getDim();

} // arrayRefs