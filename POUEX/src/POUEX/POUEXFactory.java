/**
 */
package POUEX;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see POUEX.POUEXPackage
 * @generated
 */
public interface POUEXFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  POUEXFactory eINSTANCE = POUEX.impl.POUEXFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Mascota</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mascota</em>'.
   * @generated
   */
  Mascota createMascota();

  /**
   * Returns a new object of class '<em>Caracteristicas</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Caracteristicas</em>'.
   * @generated
   */
  Caracteristicas createCaracteristicas();

  /**
   * Returns a new object of class '<em>Acciones</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Acciones</em>'.
   * @generated
   */
  Acciones createAcciones();

  /**
   * Returns a new object of class '<em>Efectos</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Efectos</em>'.
   * @generated
   */
  Efectos createEfectos();

  /**
   * Returns a new object of class '<em>Estados</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Estados</em>'.
   * @generated
   */
  Estados createEstados();

  /**
   * Returns a new object of class '<em>Transiciones</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transiciones</em>'.
   * @generated
   */
  Transiciones createTransiciones();

  /**
   * Returns a new object of class '<em>Fisicas</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fisicas</em>'.
   * @generated
   */
  Fisicas createFisicas();

  /**
   * Returns a new object of class '<em>Emocionales</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Emocionales</em>'.
   * @generated
   */
  Emocionales createEmocionales();

  /**
   * Returns a new object of class '<em>Normales</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Normales</em>'.
   * @generated
   */
  Normales createNormales();

  /**
   * Returns a new object of class '<em>Criticos</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Criticos</em>'.
   * @generated
   */
  Criticos createCriticos();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  POUEXPackage getPOUEXPackage();

} //POUEXFactory
