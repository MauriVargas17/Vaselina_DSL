/**
 * generated by Xtext 2.27.0-SNAPSHOT
 */
package org.xtext.example.mydsl.vaselina.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.vaselina.VaselinaPackage
 * @generated
 */
public class VaselinaAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VaselinaPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VaselinaAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = VaselinaPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VaselinaSwitch<Adapter> modelSwitch =
    new VaselinaSwitch<Adapter>()
    {
      @Override
      public Adapter caseVaselinaProgram(VaselinaProgram object)
      {
        return createVaselinaProgramAdapter();
      }
      @Override
      public Adapter casemainDeclared(mainDeclared object)
      {
        return createmainDeclaredAdapter();
      }
      @Override
      public Adapter caseBodyStatement(BodyStatement object)
      {
        return createBodyStatementAdapter();
      }
      @Override
      public Adapter casevarReturn(varReturn object)
      {
        return createvarReturnAdapter();
      }
      @Override
      public Adapter casevarDeclared(varDeclared object)
      {
        return createvarDeclaredAdapter();
      }
      @Override
      public Adapter casevarAssignment(varAssignment object)
      {
        return createvarAssignmentAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter casevarSymbol(varSymbol object)
      {
        return createvarSymbolAdapter();
      }
      @Override
      public Adapter casearrayDimension(arrayDimension object)
      {
        return createarrayDimensionAdapter();
      }
      @Override
      public Adapter caseFuncCall(FuncCall object)
      {
        return createFuncCallAdapter();
      }
      @Override
      public Adapter caseFuncParameter(FuncParameter object)
      {
        return createFuncParameterAdapter();
      }
      @Override
      public Adapter caseFuncDefinition(FuncDefinition object)
      {
        return createFuncDefinitionAdapter();
      }
      @Override
      public Adapter caseAbstractMethodCall(AbstractMethodCall object)
      {
        return createAbstractMethodCallAdapter();
      }
      @Override
      public Adapter caseStdFunction(StdFunction object)
      {
        return createStdFunctionAdapter();
      }
      @Override
      public Adapter caseIfExpression(IfExpression object)
      {
        return createIfExpressionAdapter();
      }
      @Override
      public Adapter caseDoWhileExpression(DoWhileExpression object)
      {
        return createDoWhileExpressionAdapter();
      }
      @Override
      public Adapter caseBrkStr(BrkStr object)
      {
        return createBrkStrAdapter();
      }
      @Override
      public Adapter caseReturnDeclaration(ReturnDeclaration object)
      {
        return createReturnDeclarationAdapter();
      }
      @Override
      public Adapter caseDOUBLE(DOUBLE object)
      {
        return createDOUBLEAdapter();
      }
      @Override
      public Adapter casevarExpression(varExpression object)
      {
        return createvarExpressionAdapter();
      }
      @Override
      public Adapter casearrayRefs(arrayRefs object)
      {
        return createarrayRefsAdapter();
      }
      @Override
      public Adapter casevarRefs(varRefs object)
      {
        return createvarRefsAdapter();
      }
      @Override
      public Adapter caseOr(Or object)
      {
        return createOrAdapter();
      }
      @Override
      public Adapter caseAnd(And object)
      {
        return createAndAdapter();
      }
      @Override
      public Adapter caseEquality(Equality object)
      {
        return createEqualityAdapter();
      }
      @Override
      public Adapter caseComparison(Comparison object)
      {
        return createComparisonAdapter();
      }
      @Override
      public Adapter casePlusOrMinus(PlusOrMinus object)
      {
        return createPlusOrMinusAdapter();
      }
      @Override
      public Adapter caseMulOrDiv(MulOrDiv object)
      {
        return createMulOrDivAdapter();
      }
      @Override
      public Adapter caseModule(org.xtext.example.mydsl.vaselina.Module object)
      {
        return createModuleAdapter();
      }
      @Override
      public Adapter caseInside(Inside object)
      {
        return createInsideAdapter();
      }
      @Override
      public Adapter caseNot(Not object)
      {
        return createNotAdapter();
      }
      @Override
      public Adapter caseStringRef(StringRef object)
      {
        return createStringRefAdapter();
      }
      @Override
      public Adapter casenumRef(numRef object)
      {
        return createnumRefAdapter();
      }
      @Override
      public Adapter casedoubleRef(doubleRef object)
      {
        return createdoubleRefAdapter();
      }
      @Override
      public Adapter caseboolRef(boolRef object)
      {
        return createboolRefAdapter();
      }
      @Override
      public Adapter casevarRef(varRef object)
      {
        return createvarRefAdapter();
      }
      @Override
      public Adapter casearrayRef(arrayRef object)
      {
        return createarrayRefAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.VaselinaProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.VaselinaProgram
   * @generated
   */
  public Adapter createVaselinaProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.mainDeclared <em>main Declared</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.mainDeclared
   * @generated
   */
  public Adapter createmainDeclaredAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.BodyStatement <em>Body Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.BodyStatement
   * @generated
   */
  public Adapter createBodyStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.varReturn <em>var Return</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.varReturn
   * @generated
   */
  public Adapter createvarReturnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.varDeclared <em>var Declared</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.varDeclared
   * @generated
   */
  public Adapter createvarDeclaredAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.varAssignment <em>var Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.varAssignment
   * @generated
   */
  public Adapter createvarAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.varSymbol <em>var Symbol</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.varSymbol
   * @generated
   */
  public Adapter createvarSymbolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.arrayDimension <em>array Dimension</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.arrayDimension
   * @generated
   */
  public Adapter createarrayDimensionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.FuncCall <em>Func Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.FuncCall
   * @generated
   */
  public Adapter createFuncCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.FuncParameter <em>Func Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.FuncParameter
   * @generated
   */
  public Adapter createFuncParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.FuncDefinition <em>Func Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.FuncDefinition
   * @generated
   */
  public Adapter createFuncDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.AbstractMethodCall <em>Abstract Method Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.AbstractMethodCall
   * @generated
   */
  public Adapter createAbstractMethodCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.StdFunction <em>Std Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.StdFunction
   * @generated
   */
  public Adapter createStdFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.IfExpression <em>If Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.IfExpression
   * @generated
   */
  public Adapter createIfExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.DoWhileExpression <em>Do While Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.DoWhileExpression
   * @generated
   */
  public Adapter createDoWhileExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.BrkStr <em>Brk Str</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.BrkStr
   * @generated
   */
  public Adapter createBrkStrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.ReturnDeclaration <em>Return Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.ReturnDeclaration
   * @generated
   */
  public Adapter createReturnDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.DOUBLE <em>DOUBLE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.DOUBLE
   * @generated
   */
  public Adapter createDOUBLEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.varExpression <em>var Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.varExpression
   * @generated
   */
  public Adapter createvarExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.arrayRefs <em>array Refs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.arrayRefs
   * @generated
   */
  public Adapter createarrayRefsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.varRefs <em>var Refs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.varRefs
   * @generated
   */
  public Adapter createvarRefsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.Or
   * @generated
   */
  public Adapter createOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.And
   * @generated
   */
  public Adapter createAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.Equality <em>Equality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.Equality
   * @generated
   */
  public Adapter createEqualityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.Comparison <em>Comparison</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.Comparison
   * @generated
   */
  public Adapter createComparisonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.PlusOrMinus <em>Plus Or Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.PlusOrMinus
   * @generated
   */
  public Adapter createPlusOrMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.MulOrDiv <em>Mul Or Div</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.MulOrDiv
   * @generated
   */
  public Adapter createMulOrDivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.Module
   * @generated
   */
  public Adapter createModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.Inside <em>Inside</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.Inside
   * @generated
   */
  public Adapter createInsideAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.Not <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.Not
   * @generated
   */
  public Adapter createNotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.StringRef <em>String Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.StringRef
   * @generated
   */
  public Adapter createStringRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.numRef <em>num Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.numRef
   * @generated
   */
  public Adapter createnumRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.doubleRef <em>double Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.doubleRef
   * @generated
   */
  public Adapter createdoubleRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.boolRef <em>bool Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.boolRef
   * @generated
   */
  public Adapter createboolRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.varRef <em>var Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.varRef
   * @generated
   */
  public Adapter createvarRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.vaselina.arrayRef <em>array Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.vaselina.arrayRef
   * @generated
   */
  public Adapter createarrayRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //VaselinaAdapterFactory
