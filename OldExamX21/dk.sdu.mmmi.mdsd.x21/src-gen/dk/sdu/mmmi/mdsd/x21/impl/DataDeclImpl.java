/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.x21.impl;

import dk.sdu.mmmi.mdsd.x21.DataDecl;
import dk.sdu.mmmi.mdsd.x21.X21Package;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.x21.impl.DataDeclImpl#getDeclNames <em>Decl Names</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.x21.impl.DataDeclImpl#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataDeclImpl extends DeclarationImpl implements DataDecl
{
  /**
   * The cached value of the '{@link #getDeclNames() <em>Decl Names</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclNames()
   * @generated
   * @ordered
   */
  protected EList<String> declNames;

  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected EList<String> types;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataDeclImpl()
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
    return X21Package.Literals.DATA_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getDeclNames()
  {
    if (declNames == null)
    {
      declNames = new EDataTypeEList<String>(String.class, this, X21Package.DATA_DECL__DECL_NAMES);
    }
    return declNames;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getTypes()
  {
    if (types == null)
    {
      types = new EDataTypeEList<String>(String.class, this, X21Package.DATA_DECL__TYPES);
    }
    return types;
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
      case X21Package.DATA_DECL__DECL_NAMES:
        return getDeclNames();
      case X21Package.DATA_DECL__TYPES:
        return getTypes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case X21Package.DATA_DECL__DECL_NAMES:
        getDeclNames().clear();
        getDeclNames().addAll((Collection<? extends String>)newValue);
        return;
      case X21Package.DATA_DECL__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends String>)newValue);
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
      case X21Package.DATA_DECL__DECL_NAMES:
        getDeclNames().clear();
        return;
      case X21Package.DATA_DECL__TYPES:
        getTypes().clear();
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
      case X21Package.DATA_DECL__DECL_NAMES:
        return declNames != null && !declNames.isEmpty();
      case X21Package.DATA_DECL__TYPES:
        return types != null && !types.isEmpty();
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
    result.append(" (declNames: ");
    result.append(declNames);
    result.append(", types: ");
    result.append(types);
    result.append(')');
    return result.toString();
  }

} //DataDeclImpl
