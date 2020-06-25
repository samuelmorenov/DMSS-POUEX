/**
 */
package POUEX;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see POUEX.POUEXFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface POUEXPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "POUEX";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://POUEX/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "POUEX";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  POUEXPackage eINSTANCE = POUEX.impl.POUEXPackageImpl.init();

  /**
   * The meta object id for the '{@link POUEX.impl.MascotaImpl <em>Mascota</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see POUEX.impl.MascotaImpl
   * @see POUEX.impl.POUEXPackageImpl#getMascota()
   * @generated
   */
  int MASCOTA = 0;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MASCOTA__NOMBRE = 0;

  /**
   * The feature id for the '<em><b>Realizar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MASCOTA__REALIZAR = 1;

  /**
   * The feature id for the '<em><b>Poseer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MASCOTA__POSEER = 2;

  /**
   * The feature id for the '<em><b>Estar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MASCOTA__ESTAR = 3;

  /**
   * The number of structural features of the '<em>Mascota</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MASCOTA_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link POUEX.impl.CaracteristicasImpl <em>Caracteristicas</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see POUEX.impl.CaracteristicasImpl
   * @see POUEX.impl.POUEXPackageImpl#getCaracteristicas()
   * @generated
   */
  int CARACTERISTICAS = 1;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARACTERISTICAS__NOMBRE = 0;

  /**
   * The feature id for the '<em><b>Valor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARACTERISTICAS__VALOR = 1;

  /**
   * The feature id for the '<em><b>Valor Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARACTERISTICAS__VALOR_MAX = 2;

  /**
   * The feature id for the '<em><b>Modificada</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARACTERISTICAS__MODIFICADA = 3;

  /**
   * The feature id for the '<em><b>Causar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARACTERISTICAS__CAUSAR = 4;

  /**
   * The feature id for the '<em><b>Beneficioso</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARACTERISTICAS__BENEFICIOSO = 5;

  /**
   * The number of structural features of the '<em>Caracteristicas</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARACTERISTICAS_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link POUEX.impl.AccionesImpl <em>Acciones</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see POUEX.impl.AccionesImpl
   * @see POUEX.impl.POUEXPackageImpl#getAcciones()
   * @generated
   */
  int ACCIONES = 2;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCIONES__NOMBRE = 0;

  /**
   * The feature id for the '<em><b>Causa</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCIONES__CAUSA = 1;

  /**
   * The number of structural features of the '<em>Acciones</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCIONES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link POUEX.impl.EfectosImpl <em>Efectos</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see POUEX.impl.EfectosImpl
   * @see POUEX.impl.POUEXPackageImpl#getEfectos()
   * @generated
   */
  int EFECTOS = 3;

  /**
   * The feature id for the '<em><b>Modifica</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFECTOS__MODIFICA = 0;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFECTOS__NOMBRE = 1;

  /**
   * The feature id for the '<em><b>Valor Modifica</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFECTOS__VALOR_MODIFICA = 2;

  /**
   * The feature id for the '<em><b>Causada</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFECTOS__CAUSADA = 3;

  /**
   * The number of structural features of the '<em>Efectos</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFECTOS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link POUEX.impl.EstadosImpl <em>Estados</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see POUEX.impl.EstadosImpl
   * @see POUEX.impl.POUEXPackageImpl#getEstados()
   * @generated
   */
  int ESTADOS = 4;

  /**
   * The feature id for the '<em><b>Estado</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTADOS__ESTADO = 0;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTADOS__NOMBRE = 1;

  /**
   * The feature id for the '<em><b>Beneficioso</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTADOS__BENEFICIOSO = 2;

  /**
   * The feature id for the '<em><b>Modificado</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTADOS__MODIFICADO = 3;

  /**
   * The number of structural features of the '<em>Estados</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTADOS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link POUEX.impl.TransicionesImpl <em>Transiciones</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see POUEX.impl.TransicionesImpl
   * @see POUEX.impl.POUEXPackageImpl#getTransiciones()
   * @generated
   */
  int TRANSICIONES = 5;

  /**
   * The feature id for the '<em><b>Modificar</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSICIONES__MODIFICAR = 0;

  /**
   * The feature id for the '<em><b>Valor Cambio</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSICIONES__VALOR_CAMBIO = 1;

  /**
   * The feature id for the '<em><b>Producida</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSICIONES__PRODUCIDA = 2;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSICIONES__NOMBRE = 3;

  /**
   * The number of structural features of the '<em>Transiciones</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSICIONES_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link POUEX.impl.FisicasImpl <em>Fisicas</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see POUEX.impl.FisicasImpl
   * @see POUEX.impl.POUEXPackageImpl#getFisicas()
   * @generated
   */
  int FISICAS = 6;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FISICAS__NOMBRE = CARACTERISTICAS__NOMBRE;

  /**
   * The feature id for the '<em><b>Valor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FISICAS__VALOR = CARACTERISTICAS__VALOR;

  /**
   * The feature id for the '<em><b>Valor Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FISICAS__VALOR_MAX = CARACTERISTICAS__VALOR_MAX;

  /**
   * The feature id for the '<em><b>Modificada</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FISICAS__MODIFICADA = CARACTERISTICAS__MODIFICADA;

  /**
   * The feature id for the '<em><b>Causar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FISICAS__CAUSAR = CARACTERISTICAS__CAUSAR;

  /**
   * The feature id for the '<em><b>Beneficioso</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FISICAS__BENEFICIOSO = CARACTERISTICAS__BENEFICIOSO;

  /**
   * The number of structural features of the '<em>Fisicas</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FISICAS_FEATURE_COUNT = CARACTERISTICAS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link POUEX.impl.EmocionalesImpl <em>Emocionales</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see POUEX.impl.EmocionalesImpl
   * @see POUEX.impl.POUEXPackageImpl#getEmocionales()
   * @generated
   */
  int EMOCIONALES = 7;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMOCIONALES__NOMBRE = CARACTERISTICAS__NOMBRE;

  /**
   * The feature id for the '<em><b>Valor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMOCIONALES__VALOR = CARACTERISTICAS__VALOR;

  /**
   * The feature id for the '<em><b>Valor Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMOCIONALES__VALOR_MAX = CARACTERISTICAS__VALOR_MAX;

  /**
   * The feature id for the '<em><b>Modificada</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMOCIONALES__MODIFICADA = CARACTERISTICAS__MODIFICADA;

  /**
   * The feature id for the '<em><b>Causar</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMOCIONALES__CAUSAR = CARACTERISTICAS__CAUSAR;

  /**
   * The feature id for the '<em><b>Beneficioso</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMOCIONALES__BENEFICIOSO = CARACTERISTICAS__BENEFICIOSO;

  /**
   * The number of structural features of the '<em>Emocionales</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMOCIONALES_FEATURE_COUNT = CARACTERISTICAS_FEATURE_COUNT + 0;


  /**
   * The meta object id for the '{@link POUEX.impl.NormalesImpl <em>Normales</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see POUEX.impl.NormalesImpl
   * @see POUEX.impl.POUEXPackageImpl#getNormales()
   * @generated
   */
  int NORMALES = 8;

  /**
   * The feature id for the '<em><b>Estado</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMALES__ESTADO = ESTADOS__ESTADO;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMALES__NOMBRE = ESTADOS__NOMBRE;

  /**
   * The feature id for the '<em><b>Beneficioso</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMALES__BENEFICIOSO = ESTADOS__BENEFICIOSO;

  /**
   * The feature id for the '<em><b>Modificado</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMALES__MODIFICADO = ESTADOS__MODIFICADO;

  /**
   * The number of structural features of the '<em>Normales</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMALES_FEATURE_COUNT = ESTADOS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link POUEX.impl.CriticosImpl <em>Criticos</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see POUEX.impl.CriticosImpl
   * @see POUEX.impl.POUEXPackageImpl#getCriticos()
   * @generated
   */
  int CRITICOS = 9;

  /**
   * The feature id for the '<em><b>Estado</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITICOS__ESTADO = ESTADOS__ESTADO;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITICOS__NOMBRE = ESTADOS__NOMBRE;

  /**
   * The feature id for the '<em><b>Beneficioso</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITICOS__BENEFICIOSO = ESTADOS__BENEFICIOSO;

  /**
   * The feature id for the '<em><b>Modificado</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITICOS__MODIFICADO = ESTADOS__MODIFICADO;

  /**
   * The number of structural features of the '<em>Criticos</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CRITICOS_FEATURE_COUNT = ESTADOS_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link POUEX.Mascota <em>Mascota</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mascota</em>'.
   * @see POUEX.Mascota
   * @generated
   */
  EClass getMascota();

  /**
   * Returns the meta object for the attribute '{@link POUEX.Mascota#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre</em>'.
   * @see POUEX.Mascota#getNombre()
   * @see #getMascota()
   * @generated
   */
  EAttribute getMascota_Nombre();

  /**
   * Returns the meta object for the containment reference list '{@link POUEX.Mascota#getRealizar <em>Realizar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Realizar</em>'.
   * @see POUEX.Mascota#getRealizar()
   * @see #getMascota()
   * @generated
   */
  EReference getMascota_Realizar();

  /**
   * Returns the meta object for the containment reference list '{@link POUEX.Mascota#getPoseer <em>Poseer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Poseer</em>'.
   * @see POUEX.Mascota#getPoseer()
   * @see #getMascota()
   * @generated
   */
  EReference getMascota_Poseer();

  /**
   * Returns the meta object for the containment reference list '{@link POUEX.Mascota#getEstar <em>Estar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Estar</em>'.
   * @see POUEX.Mascota#getEstar()
   * @see #getMascota()
   * @generated
   */
  EReference getMascota_Estar();

  /**
   * Returns the meta object for class '{@link POUEX.Caracteristicas <em>Caracteristicas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Caracteristicas</em>'.
   * @see POUEX.Caracteristicas
   * @generated
   */
  EClass getCaracteristicas();

  /**
   * Returns the meta object for the containment reference list '{@link POUEX.Caracteristicas#getCausar <em>Causar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Causar</em>'.
   * @see POUEX.Caracteristicas#getCausar()
   * @see #getCaracteristicas()
   * @generated
   */
  EReference getCaracteristicas_Causar();

  /**
   * Returns the meta object for the attribute '{@link POUEX.Caracteristicas#isBeneficioso <em>Beneficioso</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Beneficioso</em>'.
   * @see POUEX.Caracteristicas#isBeneficioso()
   * @see #getCaracteristicas()
   * @generated
   */
  EAttribute getCaracteristicas_Beneficioso();

  /**
   * Returns the meta object for the attribute '{@link POUEX.Caracteristicas#getValor <em>Valor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valor</em>'.
   * @see POUEX.Caracteristicas#getValor()
   * @see #getCaracteristicas()
   * @generated
   */
  EAttribute getCaracteristicas_Valor();

  /**
   * Returns the meta object for the attribute '{@link POUEX.Caracteristicas#getValorMax <em>Valor Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valor Max</em>'.
   * @see POUEX.Caracteristicas#getValorMax()
   * @see #getCaracteristicas()
   * @generated
   */
  EAttribute getCaracteristicas_ValorMax();

  /**
   * Returns the meta object for the reference list '{@link POUEX.Caracteristicas#getModificada <em>Modificada</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Modificada</em>'.
   * @see POUEX.Caracteristicas#getModificada()
   * @see #getCaracteristicas()
   * @generated
   */
  EReference getCaracteristicas_Modificada();

  /**
   * Returns the meta object for the attribute '{@link POUEX.Caracteristicas#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre</em>'.
   * @see POUEX.Caracteristicas#getNombre()
   * @see #getCaracteristicas()
   * @generated
   */
  EAttribute getCaracteristicas_Nombre();

  /**
   * Returns the meta object for class '{@link POUEX.Acciones <em>Acciones</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Acciones</em>'.
   * @see POUEX.Acciones
   * @generated
   */
  EClass getAcciones();

  /**
   * Returns the meta object for the containment reference list '{@link POUEX.Acciones#getCausa <em>Causa</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Causa</em>'.
   * @see POUEX.Acciones#getCausa()
   * @see #getAcciones()
   * @generated
   */
  EReference getAcciones_Causa();

  /**
   * Returns the meta object for the attribute '{@link POUEX.Acciones#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre</em>'.
   * @see POUEX.Acciones#getNombre()
   * @see #getAcciones()
   * @generated
   */
  EAttribute getAcciones_Nombre();

  /**
   * Returns the meta object for class '{@link POUEX.Efectos <em>Efectos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Efectos</em>'.
   * @see POUEX.Efectos
   * @generated
   */
  EClass getEfectos();

  /**
   * Returns the meta object for the reference '{@link POUEX.Efectos#getModifica <em>Modifica</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Modifica</em>'.
   * @see POUEX.Efectos#getModifica()
   * @see #getEfectos()
   * @generated
   */
  EReference getEfectos_Modifica();

  /**
   * Returns the meta object for the attribute '{@link POUEX.Efectos#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre</em>'.
   * @see POUEX.Efectos#getNombre()
   * @see #getEfectos()
   * @generated
   */
  EAttribute getEfectos_Nombre();

  /**
   * Returns the meta object for the attribute '{@link POUEX.Efectos#getValorModifica <em>Valor Modifica</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valor Modifica</em>'.
   * @see POUEX.Efectos#getValorModifica()
   * @see #getEfectos()
   * @generated
   */
  EAttribute getEfectos_ValorModifica();

  /**
   * Returns the meta object for the container reference '{@link POUEX.Efectos#getCausada <em>Causada</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Causada</em>'.
   * @see POUEX.Efectos#getCausada()
   * @see #getEfectos()
   * @generated
   */
  EReference getEfectos_Causada();

  /**
   * Returns the meta object for class '{@link POUEX.Estados <em>Estados</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Estados</em>'.
   * @see POUEX.Estados
   * @generated
   */
  EClass getEstados();

  /**
   * Returns the meta object for the attribute '{@link POUEX.Estados#isEstado <em>Estado</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Estado</em>'.
   * @see POUEX.Estados#isEstado()
   * @see #getEstados()
   * @generated
   */
  EAttribute getEstados_Estado();

  /**
   * Returns the meta object for the attribute '{@link POUEX.Estados#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre</em>'.
   * @see POUEX.Estados#getNombre()
   * @see #getEstados()
   * @generated
   */
  EAttribute getEstados_Nombre();

  /**
   * Returns the meta object for the attribute '{@link POUEX.Estados#isBeneficioso <em>Beneficioso</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Beneficioso</em>'.
   * @see POUEX.Estados#isBeneficioso()
   * @see #getEstados()
   * @generated
   */
  EAttribute getEstados_Beneficioso();

  /**
   * Returns the meta object for the reference list '{@link POUEX.Estados#getModificado <em>Modificado</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Modificado</em>'.
   * @see POUEX.Estados#getModificado()
   * @see #getEstados()
   * @generated
   */
  EReference getEstados_Modificado();

  /**
   * Returns the meta object for class '{@link POUEX.Transiciones <em>Transiciones</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transiciones</em>'.
   * @see POUEX.Transiciones
   * @generated
   */
  EClass getTransiciones();

  /**
   * Returns the meta object for the reference '{@link POUEX.Transiciones#getModificar <em>Modificar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Modificar</em>'.
   * @see POUEX.Transiciones#getModificar()
   * @see #getTransiciones()
   * @generated
   */
  EReference getTransiciones_Modificar();

  /**
   * Returns the meta object for the attribute '{@link POUEX.Transiciones#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre</em>'.
   * @see POUEX.Transiciones#getNombre()
   * @see #getTransiciones()
   * @generated
   */
  EAttribute getTransiciones_Nombre();

  /**
   * Returns the meta object for the attribute '{@link POUEX.Transiciones#getValorCambio <em>Valor Cambio</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Valor Cambio</em>'.
   * @see POUEX.Transiciones#getValorCambio()
   * @see #getTransiciones()
   * @generated
   */
  EAttribute getTransiciones_ValorCambio();

  /**
   * Returns the meta object for the container reference '{@link POUEX.Transiciones#getProducida <em>Producida</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Producida</em>'.
   * @see POUEX.Transiciones#getProducida()
   * @see #getTransiciones()
   * @generated
   */
  EReference getTransiciones_Producida();

  /**
   * Returns the meta object for class '{@link POUEX.Fisicas <em>Fisicas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fisicas</em>'.
   * @see POUEX.Fisicas
   * @generated
   */
  EClass getFisicas();

  /**
   * Returns the meta object for class '{@link POUEX.Emocionales <em>Emocionales</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Emocionales</em>'.
   * @see POUEX.Emocionales
   * @generated
   */
  EClass getEmocionales();

  /**
   * Returns the meta object for class '{@link POUEX.Normales <em>Normales</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Normales</em>'.
   * @see POUEX.Normales
   * @generated
   */
  EClass getNormales();

  /**
   * Returns the meta object for class '{@link POUEX.Criticos <em>Criticos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Criticos</em>'.
   * @see POUEX.Criticos
   * @generated
   */
  EClass getCriticos();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  POUEXFactory getPOUEXFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link POUEX.impl.MascotaImpl <em>Mascota</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see POUEX.impl.MascotaImpl
     * @see POUEX.impl.POUEXPackageImpl#getMascota()
     * @generated
     */
    EClass MASCOTA = eINSTANCE.getMascota();

    /**
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MASCOTA__NOMBRE = eINSTANCE.getMascota_Nombre();

    /**
     * The meta object literal for the '<em><b>Realizar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MASCOTA__REALIZAR = eINSTANCE.getMascota_Realizar();

    /**
     * The meta object literal for the '<em><b>Poseer</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MASCOTA__POSEER = eINSTANCE.getMascota_Poseer();

    /**
     * The meta object literal for the '<em><b>Estar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MASCOTA__ESTAR = eINSTANCE.getMascota_Estar();

    /**
     * The meta object literal for the '{@link POUEX.impl.CaracteristicasImpl <em>Caracteristicas</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see POUEX.impl.CaracteristicasImpl
     * @see POUEX.impl.POUEXPackageImpl#getCaracteristicas()
     * @generated
     */
    EClass CARACTERISTICAS = eINSTANCE.getCaracteristicas();

    /**
     * The meta object literal for the '<em><b>Causar</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CARACTERISTICAS__CAUSAR = eINSTANCE.getCaracteristicas_Causar();

    /**
     * The meta object literal for the '<em><b>Beneficioso</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CARACTERISTICAS__BENEFICIOSO = eINSTANCE.getCaracteristicas_Beneficioso();

    /**
     * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CARACTERISTICAS__VALOR = eINSTANCE.getCaracteristicas_Valor();

    /**
     * The meta object literal for the '<em><b>Valor Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CARACTERISTICAS__VALOR_MAX = eINSTANCE.getCaracteristicas_ValorMax();

    /**
     * The meta object literal for the '<em><b>Modificada</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CARACTERISTICAS__MODIFICADA = eINSTANCE.getCaracteristicas_Modificada();

    /**
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CARACTERISTICAS__NOMBRE = eINSTANCE.getCaracteristicas_Nombre();

    /**
     * The meta object literal for the '{@link POUEX.impl.AccionesImpl <em>Acciones</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see POUEX.impl.AccionesImpl
     * @see POUEX.impl.POUEXPackageImpl#getAcciones()
     * @generated
     */
    EClass ACCIONES = eINSTANCE.getAcciones();

    /**
     * The meta object literal for the '<em><b>Causa</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCIONES__CAUSA = eINSTANCE.getAcciones_Causa();

    /**
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACCIONES__NOMBRE = eINSTANCE.getAcciones_Nombre();

    /**
     * The meta object literal for the '{@link POUEX.impl.EfectosImpl <em>Efectos</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see POUEX.impl.EfectosImpl
     * @see POUEX.impl.POUEXPackageImpl#getEfectos()
     * @generated
     */
    EClass EFECTOS = eINSTANCE.getEfectos();

    /**
     * The meta object literal for the '<em><b>Modifica</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EFECTOS__MODIFICA = eINSTANCE.getEfectos_Modifica();

    /**
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EFECTOS__NOMBRE = eINSTANCE.getEfectos_Nombre();

    /**
     * The meta object literal for the '<em><b>Valor Modifica</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EFECTOS__VALOR_MODIFICA = eINSTANCE.getEfectos_ValorModifica();

    /**
     * The meta object literal for the '<em><b>Causada</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EFECTOS__CAUSADA = eINSTANCE.getEfectos_Causada();

    /**
     * The meta object literal for the '{@link POUEX.impl.EstadosImpl <em>Estados</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see POUEX.impl.EstadosImpl
     * @see POUEX.impl.POUEXPackageImpl#getEstados()
     * @generated
     */
    EClass ESTADOS = eINSTANCE.getEstados();

    /**
     * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESTADOS__ESTADO = eINSTANCE.getEstados_Estado();

    /**
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESTADOS__NOMBRE = eINSTANCE.getEstados_Nombre();

    /**
     * The meta object literal for the '<em><b>Beneficioso</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESTADOS__BENEFICIOSO = eINSTANCE.getEstados_Beneficioso();

    /**
     * The meta object literal for the '<em><b>Modificado</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ESTADOS__MODIFICADO = eINSTANCE.getEstados_Modificado();

    /**
     * The meta object literal for the '{@link POUEX.impl.TransicionesImpl <em>Transiciones</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see POUEX.impl.TransicionesImpl
     * @see POUEX.impl.POUEXPackageImpl#getTransiciones()
     * @generated
     */
    EClass TRANSICIONES = eINSTANCE.getTransiciones();

    /**
     * The meta object literal for the '<em><b>Modificar</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSICIONES__MODIFICAR = eINSTANCE.getTransiciones_Modificar();

    /**
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSICIONES__NOMBRE = eINSTANCE.getTransiciones_Nombre();

    /**
     * The meta object literal for the '<em><b>Valor Cambio</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSICIONES__VALOR_CAMBIO = eINSTANCE.getTransiciones_ValorCambio();

    /**
     * The meta object literal for the '<em><b>Producida</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSICIONES__PRODUCIDA = eINSTANCE.getTransiciones_Producida();

    /**
     * The meta object literal for the '{@link POUEX.impl.FisicasImpl <em>Fisicas</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see POUEX.impl.FisicasImpl
     * @see POUEX.impl.POUEXPackageImpl#getFisicas()
     * @generated
     */
    EClass FISICAS = eINSTANCE.getFisicas();

    /**
     * The meta object literal for the '{@link POUEX.impl.EmocionalesImpl <em>Emocionales</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see POUEX.impl.EmocionalesImpl
     * @see POUEX.impl.POUEXPackageImpl#getEmocionales()
     * @generated
     */
    EClass EMOCIONALES = eINSTANCE.getEmocionales();

    /**
     * The meta object literal for the '{@link POUEX.impl.NormalesImpl <em>Normales</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see POUEX.impl.NormalesImpl
     * @see POUEX.impl.POUEXPackageImpl#getNormales()
     * @generated
     */
    EClass NORMALES = eINSTANCE.getNormales();

    /**
     * The meta object literal for the '{@link POUEX.impl.CriticosImpl <em>Criticos</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see POUEX.impl.CriticosImpl
     * @see POUEX.impl.POUEXPackageImpl#getCriticos()
     * @generated
     */
    EClass CRITICOS = eINSTANCE.getCriticos();

  }

} //POUEXPackage
