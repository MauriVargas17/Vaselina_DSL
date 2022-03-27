/**
 * generated by Xtext 2.27.0-SNAPSHOT
 */
package org.xtext.example.mydsl.vaselina.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.vaselina.VaselinaPackage;
import org.xtext.example.mydsl.vaselina.arrayDimension;
import org.xtext.example.mydsl.vaselina.varSymbol;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>array Dimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.vaselina.impl.arrayDimensionImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.vaselina.impl.arrayDimensionImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class arrayDimensionImpl extends MinimalEObjectImpl.Container implements arrayDimension
{
  /**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected varSymbol index;

  /**
   * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected static final int SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected int size = SIZE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected arrayDimensionImpl()
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
    return VaselinaPackage.Literals.ARRAY_DIMENSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public varSymbol getIndex()
  {
    if (index != null && index.eIsProxy())
    {
      InternalEObject oldIndex = (InternalEObject)index;
      index = (varSymbol)eResolveProxy(oldIndex);
      if (index != oldIndex)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, VaselinaPackage.ARRAY_DIMENSION__INDEX, oldIndex, index));
      }
    }
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public varSymbol basicGetIndex()
  {
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIndex(varSymbol newIndex)
  {
    varSymbol oldIndex = index;
    index = newIndex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VaselinaPackage.ARRAY_DIMENSION__INDEX, oldIndex, index));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSize(int newSize)
  {
    int oldSize = size;
    size = newSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VaselinaPackage.ARRAY_DIMENSION__SIZE, oldSize, size));
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
      case VaselinaPackage.ARRAY_DIMENSION__INDEX:
        if (resolve) return getIndex();
        return basicGetIndex();
      case VaselinaPackage.ARRAY_DIMENSION__SIZE:
        return getSize();
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
      case VaselinaPackage.ARRAY_DIMENSION__INDEX:
        setIndex((varSymbol)newValue);
        return;
      case VaselinaPackage.ARRAY_DIMENSION__SIZE:
        setSize((Integer)newValue);
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
      case VaselinaPackage.ARRAY_DIMENSION__INDEX:
        setIndex((varSymbol)null);
        return;
      case VaselinaPackage.ARRAY_DIMENSION__SIZE:
        setSize(SIZE_EDEFAULT);
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
      case VaselinaPackage.ARRAY_DIMENSION__INDEX:
        return index != null;
      case VaselinaPackage.ARRAY_DIMENSION__SIZE:
        return size != SIZE_EDEFAULT;
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
    result.append(" (size: ");
    result.append(size);
    result.append(')');
    return result.toString();
  }

} //arrayDimensionImpl