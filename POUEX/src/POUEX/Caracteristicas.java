/**
 */
package POUEX;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Caracteristicas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link POUEX.Caracteristicas#getNombre <em>Nombre</em>}</li>
 *   <li>{@link POUEX.Caracteristicas#getValor <em>Valor</em>}</li>
 *   <li>{@link POUEX.Caracteristicas#getValorMax <em>Valor Max</em>}</li>
 *   <li>{@link POUEX.Caracteristicas#getModificada <em>Modificada</em>}</li>
 *   <li>{@link POUEX.Caracteristicas#getCausar <em>Causar</em>}</li>
 *   <li>{@link POUEX.Caracteristicas#isBeneficioso <em>Beneficioso</em>}</li>
 * </ul>
 * </p>
 *
 * @see POUEX.POUEXPackage#getCaracteristicas()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='valorInicial valorMaxNotEmpty valorIniMenorMax SiempreNombre valorMayorCero valorMaxMayorCero'"
 *        annotation="gmf.node figure='rectangle' color='255,0,0' border.color='16,16,131' label='nombre'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot valorInicial='self.valor->notEmpty()' valorMaxNotEmpty='self.valorMax->notEmpty()' valorIniMenorMax='self.valor < self.valorMax' SiempreNombre='self.nombre<>\'\'' valorMayorCero='self.valor>=0' valorMaxMayorCero='self.valorMax>=0'"
 * @generated
 */
public interface Caracteristicas extends EObject
{
  /**
   * Returns the value of the '<em><b>Causar</b></em>' containment reference list.
   * The list contents are of type {@link POUEX.Transiciones}.
   * It is bidirectional and its opposite is '{@link POUEX.Transiciones#getProducida <em>Producida</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Causar</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Causar</em>' containment reference list.
   * @see POUEX.POUEXPackage#getCaracteristicas_Causar()
   * @see POUEX.Transiciones#getProducida
   * @model opposite="producida" containment="true" required="true"
   * @generated
   */
  EList<Transiciones> getCausar();

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
   * @see POUEX.POUEXPackage#getCaracteristicas_Beneficioso()
   * @model
   * @generated
   */
  boolean isBeneficioso();

  /**
   * Sets the value of the '{@link POUEX.Caracteristicas#isBeneficioso <em>Beneficioso</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Beneficioso</em>' attribute.
   * @see #isBeneficioso()
   * @generated
   */
  void setBeneficioso(boolean value);

  /**
   * Returns the value of the '<em><b>Valor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valor</em>' attribute.
   * @see #setValor(int)
   * @see POUEX.POUEXPackage#getCaracteristicas_Valor()
   * @model
   * @generated
   */
  int getValor();

  /**
   * Sets the value of the '{@link POUEX.Caracteristicas#getValor <em>Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valor</em>' attribute.
   * @see #getValor()
   * @generated
   */
  void setValor(int value);

  /**
   * Returns the value of the '<em><b>Valor Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valor Max</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valor Max</em>' attribute.
   * @see #setValorMax(int)
   * @see POUEX.POUEXPackage#getCaracteristicas_ValorMax()
   * @model
   * @generated
   */
  int getValorMax();

  /**
   * Sets the value of the '{@link POUEX.Caracteristicas#getValorMax <em>Valor Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valor Max</em>' attribute.
   * @see #getValorMax()
   * @generated
   */
  void setValorMax(int value);

  /**
   * Returns the value of the '<em><b>Modificada</b></em>' reference list.
   * The list contents are of type {@link POUEX.Efectos}.
   * It is bidirectional and its opposite is '{@link POUEX.Efectos#getModifica <em>Modifica</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modificada</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modificada</em>' reference list.
   * @see POUEX.POUEXPackage#getCaracteristicas_Modificada()
   * @see POUEX.Efectos#getModifica
   * @model opposite="modifica" required="true"
   * @generated
   */
  EList<Efectos> getModificada();

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
   * @see POUEX.POUEXPackage#getCaracteristicas_Nombre()
   * @model
   * @generated
   */
  String getNombre();

  /**
   * Sets the value of the '{@link POUEX.Caracteristicas#getNombre <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre</em>' attribute.
   * @see #getNombre()
   * @generated
   */
  void setNombre(String value);

} // Caracteristicas
