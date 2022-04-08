/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.math;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.Program#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.Program#getExternals <em>Externals</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.Program#getMathExps <em>Math Exps</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.math.MathPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getProgram_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.math.Program#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Externals</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.mdsd.math.External}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Externals</em>' containment reference list.
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getProgram_Externals()
   * @model containment="true"
   * @generated
   */
  EList<External> getExternals();

  /**
   * Returns the value of the '<em><b>Math Exps</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.mdsd.math.MathExp}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Math Exps</em>' containment reference list.
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getProgram_MathExps()
   * @model containment="true"
   * @generated
   */
  EList<MathExp> getMathExps();

} // Program
