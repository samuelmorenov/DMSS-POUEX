/**
 */
package POUEX;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acciones</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link POUEX.Acciones#getNombre <em>Nombre</em>}</li>
 *   <li>{@link POUEX.Acciones#getCausa <em>Causa</em>}</li>
 * </ul>
 * </p>
 *
 * @see POUEX.POUEXPackage#getAcciones()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='dosEfectosNoAfectanMismaCaract SiempreNombre'"
 *        annotation="gmf.node figure='rectangle' color='0,255,0' border.color='16,16,131' label='nombre'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot dosEfectosNoAfectanMismaCaract='self.causa.modifica->isUnique(nombre)' SiempreNombre='self.nombre<>\'\''"
 * @generated
 */
public interface Acciones extends EObject
{
  /**
   * Returns the value of the '<em><b>Causa</b></em>' containment reference list.
   * The list contents are of type {@link POUEX.Efectos}.
   * It is bidirectional and its opposite is '{@link POUEX.Efectos#getCausada <em>Causada</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Causa</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Causa</em>' containment reference list.
   * @see POUEX.POUEXPackage#getAcciones_Causa()
   * @see POUEX.Efectos#getCausada
   * @model opposite="causada" containment="true" required="true"
   * @generated
   */
  EList<Efectos> getCausa();

  /**
   * Returns the value of the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nombre</em>' attribute.
   * @see #setNombre(String)
   * @see POUEX.POUEXPackage#getAcciones_Nombre()
   * @model
   * @generated
   */
  String getNombre();

  /**
   * Sets the value of the '{@link POUEX.Acciones#getNombre <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre</em>' attribute.
   * @see #getNombre()
   * @generated
   */
  void setNombre(String value);

} // Acciones
