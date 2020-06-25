/**
 */
package POUEX;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Estados</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link POUEX.Estados#isEstado <em>Estado</em>}</li>
 *   <li>{@link POUEX.Estados#getNombre <em>Nombre</em>}</li>
 *   <li>{@link POUEX.Estados#isBeneficioso <em>Beneficioso</em>}</li>
 *   <li>{@link POUEX.Estados#getModificado <em>Modificado</em>}</li>
 * </ul>
 * </p>
 *
 * @see POUEX.POUEXPackage#getEstados()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SiempreNombre'"
 *        annotation="gmf.node figure='rectangle' color='0,0,255' border.color='16,16,131' label='nombre'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SiempreNombre='self.nombre<>\'\''"
 * @generated
 */
public interface Estados extends EObject
{
  /**
   * Returns the value of the '<em><b>Estado</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Estado</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Estado</em>' attribute.
   * @see #setEstado(boolean)
   * @see POUEX.POUEXPackage#getEstados_Estado()
   * @model
   * @generated
   */
  boolean isEstado();

  /**
   * Sets the value of the '{@link POUEX.Estados#isEstado <em>Estado</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Estado</em>' attribute.
   * @see #isEstado()
   * @generated
   */
  void setEstado(boolean value);

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
   * @see POUEX.POUEXPackage#getEstados_Nombre()
   * @model
   * @generated
   */
  String getNombre();

  /**
   * Sets the value of the '{@link POUEX.Estados#getNombre <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre</em>' attribute.
   * @see #getNombre()
   * @generated
   */
  void setNombre(String value);

  /**
   * Returns the value of the '<em><b>Beneficioso</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Beneficioso</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Beneficioso</em>' attribute.
   * @see #setBeneficioso(boolean)
   * @see POUEX.POUEXPackage#getEstados_Beneficioso()
   * @model
   * @generated
   */
  boolean isBeneficioso();

  /**
   * Sets the value of the '{@link POUEX.Estados#isBeneficioso <em>Beneficioso</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Beneficioso</em>' attribute.
   * @see #isBeneficioso()
   * @generated
   */
  void setBeneficioso(boolean value);

  /**
   * Returns the value of the '<em><b>Modificado</b></em>' reference list.
   * The list contents are of type {@link POUEX.Transiciones}.
   * It is bidirectional and its opposite is '{@link POUEX.Transiciones#getModificar <em>Modificar</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modificado</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modificado</em>' reference list.
   * @see POUEX.POUEXPackage#getEstados_Modificado()
   * @see POUEX.Transiciones#getModificar
   * @model opposite="modificar" required="true"
   * @generated
   */
  EList<Transiciones> getModificado();

} // Estados
