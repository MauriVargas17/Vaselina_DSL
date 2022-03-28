/**
 * generated by Xtext 2.27.0-SNAPSHOT
 */
package org.xtext.example.mydsl.vaselina;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.vaselina.VaselinaPackage
 * @generated
 */
public interface VaselinaFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VaselinaFactory eINSTANCE = org.xtext.example.mydsl.vaselina.impl.VaselinaFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program</em>'.
   * @generated
   */
  VaselinaProgram createVaselinaProgram();

  /**
   * Returns a new object of class '<em>main Declared</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>main Declared</em>'.
   * @generated
   */
  mainDeclared createmainDeclared();

  /**
   * Returns a new object of class '<em>Body Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Body Statement</em>'.
   * @generated
   */
  BodyStatement createBodyStatement();

  /**
   * Returns a new object of class '<em>var Return</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>var Return</em>'.
   * @generated
   */
  varReturn createvarReturn();

  /**
   * Returns a new object of class '<em>var Declared</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>var Declared</em>'.
   * @generated
   */
  varDeclared createvarDeclared();

  /**
   * Returns a new object of class '<em>var Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>var Assignment</em>'.
   * @generated
   */
  varAssignment createvarAssignment();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>array Refs</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>array Refs</em>'.
   * @generated
   */
  arrayRefs createarrayRefs();

  /**
   * Returns a new object of class '<em>var Refs</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>var Refs</em>'.
   * @generated
   */
  varRefs createvarRefs();

  /**
   * Returns a new object of class '<em>var Symbol</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>var Symbol</em>'.
   * @generated
   */
  varSymbol createvarSymbol();

  /**
   * Returns a new object of class '<em>array Dimension</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>array Dimension</em>'.
   * @generated
   */
  arrayDimension createarrayDimension();

  /**
   * Returns a new object of class '<em>Func Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Func Call</em>'.
   * @generated
   */
  FuncCall createFuncCall();

  /**
   * Returns a new object of class '<em>Func Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Func Parameter</em>'.
   * @generated
   */
  FuncParameter createFuncParameter();

  /**
   * Returns a new object of class '<em>Func Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Func Definition</em>'.
   * @generated
   */
  FuncDefinition createFuncDefinition();

  /**
   * Returns a new object of class '<em>Abstract Method Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Method Call</em>'.
   * @generated
   */
  AbstractMethodCall createAbstractMethodCall();

  /**
   * Returns a new object of class '<em>Std Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Std Function</em>'.
   * @generated
   */
  StdFunction createStdFunction();

  /**
   * Returns a new object of class '<em>If Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Expression</em>'.
   * @generated
   */
  IfExpression createIfExpression();

  /**
   * Returns a new object of class '<em>Do While Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Do While Expression</em>'.
   * @generated
   */
  DoWhileExpression createDoWhileExpression();

  /**
   * Returns a new object of class '<em>Brk Str</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Brk Str</em>'.
   * @generated
   */
  BrkStr createBrkStr();

  /**
   * Returns a new object of class '<em>Return Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return Declaration</em>'.
   * @generated
   */
  ReturnDeclaration createReturnDeclaration();

  /**
   * Returns a new object of class '<em>DOUBLE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DOUBLE</em>'.
   * @generated
   */
  DOUBLE createDOUBLE();

  /**
   * Returns a new object of class '<em>var Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>var Expression</em>'.
   * @generated
   */
  varExpression createvarExpression();

  /**
   * Returns a new object of class '<em>Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or</em>'.
   * @generated
   */
  Or createOr();

  /**
   * Returns a new object of class '<em>And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And</em>'.
   * @generated
   */
  And createAnd();

  /**
   * Returns a new object of class '<em>Equality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equality</em>'.
   * @generated
   */
  Equality createEquality();

  /**
   * Returns a new object of class '<em>Comparison</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comparison</em>'.
   * @generated
   */
  Comparison createComparison();

  /**
   * Returns a new object of class '<em>Plus Or Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plus Or Minus</em>'.
   * @generated
   */
  PlusOrMinus createPlusOrMinus();

  /**
   * Returns a new object of class '<em>Mul Or Div</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mul Or Div</em>'.
   * @generated
   */
  MulOrDiv createMulOrDiv();

  /**
   * Returns a new object of class '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module</em>'.
   * @generated
   */
  Module createModule();

  /**
   * Returns a new object of class '<em>Inside</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inside</em>'.
   * @generated
   */
  Inside createInside();

  /**
   * Returns a new object of class '<em>Not</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not</em>'.
   * @generated
   */
  Not createNot();

  /**
   * Returns a new object of class '<em>String Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Ref</em>'.
   * @generated
   */
  StringRef createStringRef();

  /**
   * Returns a new object of class '<em>num Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>num Ref</em>'.
   * @generated
   */
  numRef createnumRef();

  /**
   * Returns a new object of class '<em>double Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>double Ref</em>'.
   * @generated
   */
  doubleRef createdoubleRef();

  /**
   * Returns a new object of class '<em>bool Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>bool Ref</em>'.
   * @generated
   */
  boolRef createboolRef();

  /**
   * Returns a new object of class '<em>var Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>var Ref</em>'.
   * @generated
   */
  varRef createvarRef();

  /**
   * Returns a new object of class '<em>array Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>array Ref</em>'.
   * @generated
   */
  arrayRef createarrayRef();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  VaselinaPackage getVaselinaPackage();

} //VaselinaFactory
