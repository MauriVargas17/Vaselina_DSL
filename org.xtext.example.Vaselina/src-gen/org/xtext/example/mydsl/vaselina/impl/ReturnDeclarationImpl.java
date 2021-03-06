/**
 * generated by Xtext 2.27.0-SNAPSHOT
 */
package org.xtext.example.mydsl.vaselina.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.vaselina.ReturnDeclaration;
import org.xtext.example.mydsl.vaselina.VaselinaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.vaselina.impl.ReturnDeclarationImpl#getRtnType <em>Rtn Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnDeclarationImpl extends BodyStatementImpl implements ReturnDeclaration
{
  /**
   * The default value of the '{@link #getRtnType() <em>Rtn Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRtnType()
   * @generated
   * @ordered
   */
  protected static final String RTN_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRtnType() <em>Rtn Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRtnType()
   * @generated
   * @ordered
   */
  protected String rtnType = RTN_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReturnDeclarationImpl()
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
    return VaselinaPackage.Literals.RETURN_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRtnType()
  {
    return rtnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRtnType(String newRtnType)
  {
    String oldRtnType = rtnType;
    rtnType = newRtnType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VaselinaPackage.RETURN_DECLARATION__RTN_TYPE, oldRtnType, rtnType));
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
      case VaselinaPackage.RETURN_DECLARATION__RTN_TYPE:
        return getRtnType();
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
      case VaselinaPackage.RETURN_DECLARATION__RTN_TYPE:
        setRtnType((String)newValue);
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
      case VaselinaPackage.RETURN_DECLARATION__RTN_TYPE:
        setRtnType(RTN_TYPE_EDEFAULT);
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
      case VaselinaPackage.RETURN_DECLARATION__RTN_TYPE:
        return RTN_TYPE_EDEFAULT == null ? rtnType != null : !RTN_TYPE_EDEFAULT.equals(rtnType);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (rtnType: ");
    result.append(rtnType);
    result.append(')');
    return result.toString();
  }

} //ReturnDeclarationImpl
