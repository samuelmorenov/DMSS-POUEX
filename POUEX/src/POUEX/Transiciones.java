/**
 */
package POUEX;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transiciones</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link POUEX.Transiciones#getModificar <em>Modificar</em>}</li>
 *   <li>{@link POUEX.Transiciones#getValorCambio <em>Valor Cambio</em>}</li>
 *   <li>{@link POUEX.Transiciones#getProducida <em>Producida</em>}</li>
 *   <li>{@link POUEX.Transiciones#getNombre <em>Nombre</em>}</li>
 * </ul>
 * </p>
 *
 * @see POUEX.POUEXPackage#getTransiciones()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='valorCambioNotEmpty SiempreNombre valorCambio valorCambioNoIgualOMayorValMaximoCaracteristica'"
 *        annotation="gmf.link source='producida' target='modificar' width='2' color='0,255,100' label='valorCambio'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot valorCambioNotEmpty='self.valorCambio->notEmpty()' SiempreNombre='self.nombre<>\'\'' valorCambio='self.valorCambio>=0' valorCambioNoIgualOMayorValMaximoCaracteristica='self.valorCambio < self.producida.valorMax'"
 * @generated
 */
public interface Transiciones extends EObject
{
  /**
   * Returns the value of the '<em><b>Modificar</b></em>' reference.
   * It is bidirectional and its opposite is '{@link POUEX.Estados#getModificado <em>Modificado</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modificar</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modificar</em>' reference.
   * @see #setModificar(Estados)
   * @see POUEX.POUEXPackage#getTransiciones_Modificar()
   * @see POUEX.Estados#getModificado
   * @model opposite="modificado" required="true"
   * @generated
   */
  Estados getModificar();

  /**
   * Sets the value of the '{@link POUEX.Transiciones#getModificar <em>Modificar</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modificar</em>' reference.
   * @see #getModificar()
   * @generated
   */
  void setModificar(Estados value);

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
   * @see POUEX.POUEXPackage#getTransiciones_Nombre()
   * @model
   * @generated
   */
  String getNombre();

  /**
   * Sets the value of the '{@link POUEX.Transiciones#getNombre <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre</em>' attribute.
   * @see #getNombre()
   * @generated
   */
  void setNombre(String value);

  /**
   * Returns the value of the '<em><b>Valor Cambio</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valor Cambio</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valor Cambio</em>' attribute.
   * @see #setValorCambio(int)
   * @see POUEX.POUEXPackage#getTransiciones_ValorCambio()
   * @model
   * @generated
   */
  int getValorCambio();

  /**
   * Sets the value of the '{@link POUEX.Transiciones#getValorCambio <em>Valor Cambio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valor Cambio</em>' attribute.
   * @see #getValorCambio()
   * @generated
   */
  void setValorCambio(int value);

  /**
   * Returns the value of the '<em><b>Producida</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link POUEX.Caracteristicas#getCausar <em>Causar</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Producida</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Producida</em>' container reference.
   * @see #setProducida(Caracteristicas)
   * @see POUEX.POUEXPackage#getTransiciones_Producida()
   * @see POUEX.Caracteristicas#getCausar
   * @model opposite="causar" required="true" transient="false"
   * @generated
   */
  Caracteristicas getProducida();

  /**
   * Sets the value of the '{@link POUEX.Transiciones#getProducida <em>Producida</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Producida</em>' container reference.
   * @see #getProducida()
   * @generated
   */
  void setProducida(Caracteristicas value);

} // Transiciones
