/**
 */
package POUEX;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mascota</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link POUEX.Mascota#getNombre <em>Nombre</em>}</li>
 *   <li>{@link POUEX.Mascota#getRealizar <em>Realizar</em>}</li>
 *   <li>{@link POUEX.Mascota#getPoseer <em>Poseer</em>}</li>
 *   <li>{@link POUEX.Mascota#getEstar <em>Estar</em>}</li>
 * </ul>
 * </p>
 *
 * @see POUEX.POUEXPackage#getMascota()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SiempreNombre'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SiempreNombre='self.nombre<>\'\''"
 * @generated
 */
public interface Mascota extends EObject
{
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
   * @see POUEX.POUEXPackage#getMascota_Nombre()
   * @model
   * @generated
   */
  String getNombre();

  /**
   * Sets the value of the '{@link POUEX.Mascota#getNombre <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre</em>' attribute.
   * @see #getNombre()
   * @generated
   */
  void setNombre(String value);

  /**
   * Returns the value of the '<em><b>Realizar</b></em>' containment reference list.
   * The list contents are of type {@link POUEX.Acciones}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Realizar</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Realizar</em>' containment reference list.
   * @see POUEX.POUEXPackage#getMascota_Realizar()
   * @model containment="true" required="true"
   * @generated
   */
  EList<Acciones> getRealizar();

  /**
   * Returns the value of the '<em><b>Poseer</b></em>' containment reference list.
   * The list contents are of type {@link POUEX.Caracteristicas}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Poseer</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Poseer</em>' containment reference list.
   * @see POUEX.POUEXPackage#getMascota_Poseer()
   * @model containment="true" required="true"
   * @generated
   */
  EList<Caracteristicas> getPoseer();

  /**
   * Returns the value of the '<em><b>Estar</b></em>' containment reference list.
   * The list contents are of type {@link POUEX.Estados}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Estar</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Estar</em>' containment reference list.
   * @see POUEX.POUEXPackage#getMascota_Estar()
   * @model containment="true" required="true"
   * @generated
   */
  EList<Estados> getEstar();

} // Mascota
