/**
 * generated by Xtext 2.27.0-SNAPSHOT
 */
package org.xtext.example.mydsl.vaselina.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.vaselina.AbstractMethodCall;
import org.xtext.example.mydsl.vaselina.And;
import org.xtext.example.mydsl.vaselina.BodyStatement;
import org.xtext.example.mydsl.vaselina.BrkStr;
import org.xtext.example.mydsl.vaselina.Comparison;
import org.xtext.example.mydsl.vaselina.DOUBLE;
import org.xtext.example.mydsl.vaselina.DoWhileExpression;
import org.xtext.example.mydsl.vaselina.Equality;
import org.xtext.example.mydsl.vaselina.FuncCall;
import org.xtext.example.mydsl.vaselina.FuncDefinition;
import org.xtext.example.mydsl.vaselina.FuncParameter;
import org.xtext.example.mydsl.vaselina.IfExpression;
import org.xtext.example.mydsl.vaselina.Inside;
import org.xtext.example.mydsl.vaselina.MulOrDiv;
import org.xtext.example.mydsl.vaselina.Not;
import org.xtext.example.mydsl.vaselina.Or;
import org.xtext.example.mydsl.vaselina.PlusOrMinus;
import org.xtext.example.mydsl.vaselina.ReturnDeclaration;
import org.xtext.example.mydsl.vaselina.StdFunction;
import org.xtext.example.mydsl.vaselina.StringRef;
import org.xtext.example.mydsl.vaselina.Variable;
import org.xtext.example.mydsl.vaselina.VaselinaPackage;
import org.xtext.example.mydsl.vaselina.VaselinaProgram;
import org.xtext.example.mydsl.vaselina.arrayDimension;
import org.xtext.example.mydsl.vaselina.arrayRef;
import org.xtext.example.mydsl.vaselina.arrayRefs;
import org.xtext.example.mydsl.vaselina.boolRef;
import org.xtext.example.mydsl.vaselina.doubleRef;
import org.xtext.example.mydsl.vaselina.mainDeclared;
import org.xtext.example.mydsl.vaselina.numRef;
import org.xtext.example.mydsl.vaselina.varAssignment;
import org.xtext.example.mydsl.vaselina.varDeclared;
import org.xtext.example.mydsl.vaselina.varExpression;
import org.xtext.example.mydsl.vaselina.varRef;
import org.xtext.example.mydsl.vaselina.varRefs;
import org.xtext.example.mydsl.vaselina.varReturn;
import org.xtext.example.mydsl.vaselina.varSymbol;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.vaselina.VaselinaPackage
 * @generated
 */
public class VaselinaSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VaselinaPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VaselinaSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = VaselinaPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case VaselinaPackage.VASELINA_PROGRAM:
      {
        VaselinaProgram vaselinaProgram = (VaselinaProgram)theEObject;
        T result = caseVaselinaProgram(vaselinaProgram);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.MAIN_DECLARED:
      {
        mainDeclared mainDeclared = (mainDeclared)theEObject;
        T result = casemainDeclared(mainDeclared);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.BODY_STATEMENT:
      {
        BodyStatement bodyStatement = (BodyStatement)theEObject;
        T result = caseBodyStatement(bodyStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.VAR_RETURN:
      {
        varReturn varReturn = (varReturn)theEObject;
        T result = casevarReturn(varReturn);
        if (result == null) result = caseBodyStatement(varReturn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.VAR_DECLARED:
      {
        varDeclared varDeclared = (varDeclared)theEObject;
        T result = casevarDeclared(varDeclared);
        if (result == null) result = caseBodyStatement(varDeclared);
        if (result == null) result = casevarSymbol(varDeclared);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.VAR_ASSIGNMENT:
      {
        varAssignment varAssignment = (varAssignment)theEObject;
        T result = casevarAssignment(varAssignment);
        if (result == null) result = caseBodyStatement(varAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.ARRAY_REFS:
      {
        arrayRefs arrayRefs = (arrayRefs)theEObject;
        T result = casearrayRefs(arrayRefs);
        if (result == null) result = caseVariable(arrayRefs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.VAR_REFS:
      {
        varRefs varRefs = (varRefs)theEObject;
        T result = casevarRefs(varRefs);
        if (result == null) result = caseVariable(varRefs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.VAR_SYMBOL:
      {
        varSymbol varSymbol = (varSymbol)theEObject;
        T result = casevarSymbol(varSymbol);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.ARRAY_DIMENSION:
      {
        arrayDimension arrayDimension = (arrayDimension)theEObject;
        T result = casearrayDimension(arrayDimension);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.FUNC_CALL:
      {
        FuncCall funcCall = (FuncCall)theEObject;
        T result = caseFuncCall(funcCall);
        if (result == null) result = caseAbstractMethodCall(funcCall);
        if (result == null) result = caseBodyStatement(funcCall);
        if (result == null) result = casevarExpression(funcCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.FUNC_PARAMETER:
      {
        FuncParameter funcParameter = (FuncParameter)theEObject;
        T result = caseFuncParameter(funcParameter);
        if (result == null) result = casevarSymbol(funcParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.FUNC_DEFINITION:
      {
        FuncDefinition funcDefinition = (FuncDefinition)theEObject;
        T result = caseFuncDefinition(funcDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.ABSTRACT_METHOD_CALL:
      {
        AbstractMethodCall abstractMethodCall = (AbstractMethodCall)theEObject;
        T result = caseAbstractMethodCall(abstractMethodCall);
        if (result == null) result = caseBodyStatement(abstractMethodCall);
        if (result == null) result = casevarExpression(abstractMethodCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.STD_FUNCTION:
      {
        StdFunction stdFunction = (StdFunction)theEObject;
        T result = caseStdFunction(stdFunction);
        if (result == null) result = caseAbstractMethodCall(stdFunction);
        if (result == null) result = caseBodyStatement(stdFunction);
        if (result == null) result = casevarExpression(stdFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.IF_EXPRESSION:
      {
        IfExpression ifExpression = (IfExpression)theEObject;
        T result = caseIfExpression(ifExpression);
        if (result == null) result = caseBodyStatement(ifExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.DO_WHILE_EXPRESSION:
      {
        DoWhileExpression doWhileExpression = (DoWhileExpression)theEObject;
        T result = caseDoWhileExpression(doWhileExpression);
        if (result == null) result = caseBodyStatement(doWhileExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.BRK_STR:
      {
        BrkStr brkStr = (BrkStr)theEObject;
        T result = caseBrkStr(brkStr);
        if (result == null) result = caseBodyStatement(brkStr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.RETURN_DECLARATION:
      {
        ReturnDeclaration returnDeclaration = (ReturnDeclaration)theEObject;
        T result = caseReturnDeclaration(returnDeclaration);
        if (result == null) result = caseBodyStatement(returnDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.DOUBLE:
      {
        DOUBLE double_ = (DOUBLE)theEObject;
        T result = caseDOUBLE(double_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.VAR_EXPRESSION:
      {
        varExpression varExpression = (varExpression)theEObject;
        T result = casevarExpression(varExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.OR:
      {
        Or or = (Or)theEObject;
        T result = caseOr(or);
        if (result == null) result = casevarExpression(or);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.AND:
      {
        And and = (And)theEObject;
        T result = caseAnd(and);
        if (result == null) result = casevarExpression(and);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.EQUALITY:
      {
        Equality equality = (Equality)theEObject;
        T result = caseEquality(equality);
        if (result == null) result = casevarExpression(equality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.COMPARISON:
      {
        Comparison comparison = (Comparison)theEObject;
        T result = caseComparison(comparison);
        if (result == null) result = casevarExpression(comparison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.PLUS_OR_MINUS:
      {
        PlusOrMinus plusOrMinus = (PlusOrMinus)theEObject;
        T result = casePlusOrMinus(plusOrMinus);
        if (result == null) result = casevarExpression(plusOrMinus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.MUL_OR_DIV:
      {
        MulOrDiv mulOrDiv = (MulOrDiv)theEObject;
        T result = caseMulOrDiv(mulOrDiv);
        if (result == null) result = casevarExpression(mulOrDiv);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.MODULE:
      {
        org.xtext.example.mydsl.vaselina.Module module = (org.xtext.example.mydsl.vaselina.Module)theEObject;
        T result = caseModule(module);
        if (result == null) result = casevarExpression(module);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.INSIDE:
      {
        Inside inside = (Inside)theEObject;
        T result = caseInside(inside);
        if (result == null) result = casevarExpression(inside);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.NOT:
      {
        Not not = (Not)theEObject;
        T result = caseNot(not);
        if (result == null) result = casevarExpression(not);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.STRING_REF:
      {
        StringRef stringRef = (StringRef)theEObject;
        T result = caseStringRef(stringRef);
        if (result == null) result = casevarExpression(stringRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.NUM_REF:
      {
        numRef numRef = (numRef)theEObject;
        T result = casenumRef(numRef);
        if (result == null) result = casevarExpression(numRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.DOUBLE_REF:
      {
        doubleRef doubleRef = (doubleRef)theEObject;
        T result = casedoubleRef(doubleRef);
        if (result == null) result = casevarExpression(doubleRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.BOOL_REF:
      {
        boolRef boolRef = (boolRef)theEObject;
        T result = caseboolRef(boolRef);
        if (result == null) result = casevarExpression(boolRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.VAR_REF:
      {
        varRef varRef = (varRef)theEObject;
        T result = casevarRef(varRef);
        if (result == null) result = casevarExpression(varRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VaselinaPackage.ARRAY_REF:
      {
        arrayRef arrayRef = (arrayRef)theEObject;
        T result = casearrayRef(arrayRef);
        if (result == null) result = casevarExpression(arrayRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVaselinaProgram(VaselinaProgram object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>main Declared</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>main Declared</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemainDeclared(mainDeclared object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Body Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Body Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBodyStatement(BodyStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>var Return</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>var Return</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevarReturn(varReturn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>var Declared</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>var Declared</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevarDeclared(varDeclared object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>var Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>var Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevarAssignment(varAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>array Refs</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>array Refs</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casearrayRefs(arrayRefs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>var Refs</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>var Refs</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevarRefs(varRefs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>var Symbol</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>var Symbol</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevarSymbol(varSymbol object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>array Dimension</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>array Dimension</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casearrayDimension(arrayDimension object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Func Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Func Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFuncCall(FuncCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Func Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Func Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFuncParameter(FuncParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Func Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Func Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFuncDefinition(FuncDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Method Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Method Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractMethodCall(AbstractMethodCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Std Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Std Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStdFunction(StdFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfExpression(IfExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Do While Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Do While Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoWhileExpression(DoWhileExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Brk Str</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Brk Str</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBrkStr(BrkStr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Return Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturnDeclaration(ReturnDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DOUBLE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DOUBLE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDOUBLE(DOUBLE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>var Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>var Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevarExpression(varExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOr(Or object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnd(And object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEquality(Equality object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComparison(Comparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plus Or Minus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plus Or Minus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlusOrMinus(PlusOrMinus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mul Or Div</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mul Or Div</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMulOrDiv(MulOrDiv object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModule(org.xtext.example.mydsl.vaselina.Module object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inside</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inside</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInside(Inside object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNot(Not object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringRef(StringRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>num Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>num Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenumRef(numRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>double Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>double Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedoubleRef(doubleRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bool Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bool Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseboolRef(boolRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>var Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>var Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevarRef(varRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>array Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>array Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casearrayRef(arrayRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //VaselinaSwitch
