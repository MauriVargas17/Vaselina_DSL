/**
 * generated by Xtext 2.27.0-SNAPSHOT
 */
package org.xtext.example.mydsl.vaselina.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.vaselina.Variable;
import org.xtext.example.mydsl.vaselina.VaselinaPackage;
import org.xtext.example.mydsl.vaselina.varSymbol;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.vaselina.impl.VariableImpl#getVarRefs <em>Var Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableImpl extends MinimalEObjectImpl.Container implements Variable
{
  /**
   * The cached value of the '{@link #getVarRefs() <em>Var Refs</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarRefs()
   * @generated
   * @ordered
   */
  protected varSymbol varRefs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return VaselinaPackage.Literals.VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public varSymbol getVarRefs()
  {
    if (varRefs != null && varRefs.eIsProxy())
    {
      InternalEObject oldVarRefs = (InternalEObject)varRefs;
      varRefs = (varSymbol)eResolveProxy(oldVarRefs);
      if (varRefs != oldVarRefs)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VaselinaPackage.VARIABLE__VAR_REFS, oldVarRefs, varRefs));
      }
    }
    return varRefs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public varSymbol basicGetVarRefs()
  {
    return varRefs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVarRefs(varSymbol newVarRefs)
  {
    varSymbol oldVarRefs = varRefs;
    varRefs = newVarRefs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VaselinaPackage.VARIABLE__VAR_REFS, oldVarRefs, varRefs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case VaselinaPackage.VARIABLE__VAR_REFS:
        if (resolve) return getVarRefs();
        return basicGetVarRefs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case VaselinaPackage.VARIABLE__VAR_REFS:
        setVarRefs((varSymbol)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case VaselinaPackage.VARIABLE__VAR_REFS:
        setVarRefs((varSymbol)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case VaselinaPackage.VARIABLE__VAR_REFS:
        return varRefs != null;
    }
    return super.eIsSet(featureID);
  }

} //VariableImpl
