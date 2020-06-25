/**
 */
package POUEX;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Efectos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link POUEX.Efectos#getModifica <em>Modifica</em>}</li>
 *   <li>{@link POUEX.Efectos#getNombre <em>Nombre</em>}</li>
 *   <li>{@link POUEX.Efectos#getValorModifica <em>Valor Modifica</em>}</li>
 *   <li>{@link POUEX.Efectos#getCausada <em>Causada</em>}</li>
 * </ul>
 * </p>
 *
 * @see POUEX.POUEXPackage#getEfectos()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SiempreNombre SiempreValorModifica'"
 *        annotation="gmf.link source='causada' target='modifica' width='2' color='255,0,150' label='valorModifica'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot SiempreNombre='self.nombre<>\'\'' SiempreValorModifica='self.valorModifica->notEmpty()'"
 * @generated
 */
public interface Efectos extends EObject
{
  /**
   * Returns the value of the '<em><b>Modifica</b></em>' reference.
   * It is bidirectional and its opposite is '{@link POUEX.Caracteristicas#getModificada <em>Modificada</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifica</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifica</em>' reference.
   * @see #setModifica(Caracteristicas)
   * @see POUEX.POUEXPackage#getEfectos_Modifica()
   * @see POUEX.Caracteristicas#getModificada
   * @model opposite="modificada" required="true"
   * @generated
   */
  Caracteristicas getModifica();

  /**
   * Sets the value of the '{@link POUEX.Efectos#getModifica <em>Modifica</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifica</em>' reference.
   * @see #getModifica()
   * @generated
   */
  void setModifica(Caracteristicas value);

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
   * @see POUEX.POUEXPackage#getEfectos_Nombre()
   * @model
   * @generated
   */
  String getNombre();

  /**
   * Sets the value of the '{@link POUEX.Efectos#getNombre <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre</em>' attribute.
   * @see #getNombre()
   * @generated
   */
  void setNombre(String value);

  /**
   * Returns the value of the '<em><b>Valor Modifica</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valor Modifica</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valor Modifica</em>' attribute.
   * @see #setValorModifica(int)
   * @see POUEX.POUEXPackage#getEfectos_ValorModifica()
   * @model
   * @generated
   */
  int getValorModifica();

  /**
   * Sets the value of the '{@link POUEX.Efectos#getValorModifica <em>Valor Modifica</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valor Modifica</em>' attribute.
   * @see #getValorModifica()
   * @generated
   */
  void setValorModifica(int value);

  /**
   * Returns the value of the '<em><b>Causada</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link POUEX.Acciones#getCausa <em>Causa</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Causada</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Causada</em>' container reference.
   * @see #setCausada(Acciones)
   * @see POUEX.POUEXPackage#getEfectos_Causada()
   * @see POUEX.Acciones#getCausa
   * @model opposite="causa" required="true" transient="false"
   * @generated
   */
  Acciones getCausada();

  /**
   * Sets the value of the '{@link POUEX.Efectos#getCausada <em>Causada</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Causada</em>' container reference.
   * @see #getCausada()
   * @generated
   */
  void setCausada(Acciones value);

} // Efectos
