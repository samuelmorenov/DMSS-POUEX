/**
 */
package POUEX.util;

import POUEX.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see POUEX.POUEXPackage
 * @generated
 */
public class POUEXValidator extends EObjectValidator
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final POUEXValidator INSTANCE = new POUEXValidator();

  /**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
  public static final String DIAGNOSTIC_SOURCE = "POUEX";

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public POUEXValidator()
  {
    super();
  }

  /**
   * Returns the package of this validator switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EPackage getEPackage()
  {
    return POUEXPackage.eINSTANCE;
  }

  /**
   * Calls <code>validateXXX</code> for the corresponding classifier of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    switch (classifierID)
    {
      case POUEXPackage.MASCOTA:
        return validateMascota((Mascota)value, diagnostics, context);
      case POUEXPackage.CARACTERISTICAS:
        return validateCaracteristicas((Caracteristicas)value, diagnostics, context);
      case POUEXPackage.ACCIONES:
        return validateAcciones((Acciones)value, diagnostics, context);
      case POUEXPackage.EFECTOS:
        return validateEfectos((Efectos)value, diagnostics, context);
      case POUEXPackage.ESTADOS:
        return validateEstados((Estados)value, diagnostics, context);
      case POUEXPackage.TRANSICIONES:
        return validateTransiciones((Transiciones)value, diagnostics, context);
      case POUEXPackage.FISICAS:
        return validateFisicas((Fisicas)value, diagnostics, context);
      case POUEXPackage.EMOCIONALES:
        return validateEmocionales((Emocionales)value, diagnostics, context);
      case POUEXPackage.NORMALES:
        return validateNormales((Normales)value, diagnostics, context);
      case POUEXPackage.CRITICOS:
        return validateCriticos((Criticos)value, diagnostics, context);
      default:
        return true;
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMascota(Mascota mascota, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(mascota, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(mascota, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mascota, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mascota, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mascota, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(mascota, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(mascota, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(mascota, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mascota, diagnostics, context);
    if (result || diagnostics != null) result &= validateMascota_SiempreNombre(mascota, diagnostics, context);
    return result;
  }

  /**
   * The cached validation expression for the SiempreNombre constraint of '<em>Mascota</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String MASCOTA__SIEMPRE_NOMBRE__EEXPRESSION = "self.nombre<>''";

  /**
   * Validates the SiempreNombre constraint of '<em>Mascota</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMascota_SiempreNombre(Mascota mascota, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (POUEXPackage.Literals.MASCOTA,
         mascota,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "SiempreNombre",
         MASCOTA__SIEMPRE_NOMBRE__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCaracteristicas(Caracteristicas caracteristicas, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(caracteristicas, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(caracteristicas, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(caracteristicas, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(caracteristicas, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(caracteristicas, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(caracteristicas, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(caracteristicas, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(caracteristicas, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(caracteristicas, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaracteristicas_valorInicial(caracteristicas, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaracteristicas_valorMaxNotEmpty(caracteristicas, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaracteristicas_valorIniMenorMax(caracteristicas, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaracteristicas_SiempreNombre(caracteristicas, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaracteristicas_valorMayorCero(caracteristicas, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaracteristicas_valorMaxMayorCero(caracteristicas, diagnostics, context);
    return result;
  }

  /**
   * The cached validation expression for the valorInicial constraint of '<em>Caracteristicas</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String CARACTERISTICAS__VALOR_INICIAL__EEXPRESSION = "self.valor->notEmpty()";

  /**
   * Validates the valorInicial constraint of '<em>Caracteristicas</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCaracteristicas_valorInicial(Caracteristicas caracteristicas, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (POUEXPackage.Literals.CARACTERISTICAS,
         caracteristicas,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "valorInicial",
         CARACTERISTICAS__VALOR_INICIAL__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * The cached validation expression for the valorMaxNotEmpty constraint of '<em>Caracteristicas</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String CARACTERISTICAS__VALOR_MAX_NOT_EMPTY__EEXPRESSION = "self.valorMax->notEmpty()";

  /**
   * Validates the valorMaxNotEmpty constraint of '<em>Caracteristicas</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCaracteristicas_valorMaxNotEmpty(Caracteristicas caracteristicas, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (POUEXPackage.Literals.CARACTERISTICAS,
         caracteristicas,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "valorMaxNotEmpty",
         CARACTERISTICAS__VALOR_MAX_NOT_EMPTY__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * The cached validation expression for the valorIniMenorMax constraint of '<em>Caracteristicas</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String CARACTERISTICAS__VALOR_INI_MENOR_MAX__EEXPRESSION = "self.valor < self.valorMax";

  /**
   * Validates the valorIniMenorMax constraint of '<em>Caracteristicas</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCaracteristicas_valorIniMenorMax(Caracteristicas caracteristicas, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (POUEXPackage.Literals.CARACTERISTICAS,
         caracteristicas,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "valorIniMenorMax",
         CARACTERISTICAS__VALOR_INI_MENOR_MAX__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * The cached validation expression for the SiempreNombre constraint of '<em>Caracteristicas</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String CARACTERISTICAS__SIEMPRE_NOMBRE__EEXPRESSION = "self.nombre<>''";

  /**
   * Validates the SiempreNombre constraint of '<em>Caracteristicas</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCaracteristicas_SiempreNombre(Caracteristicas caracteristicas, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (POUEXPackage.Literals.CARACTERISTICAS,
         caracteristicas,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "SiempreNombre",
         CARACTERISTICAS__SIEMPRE_NOMBRE__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * The cached validation expression for the valorMayorCero constraint of '<em>Caracteristicas</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String CARACTERISTICAS__VALOR_MAYOR_CERO__EEXPRESSION = "self.valor>=0";

  /**
   * Validates the valorMayorCero constraint of '<em>Caracteristicas</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCaracteristicas_valorMayorCero(Caracteristicas caracteristicas, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (POUEXPackage.Literals.CARACTERISTICAS,
         caracteristicas,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "valorMayorCero",
         CARACTERISTICAS__VALOR_MAYOR_CERO__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * The cached validation expression for the valorMaxMayorCero constraint of '<em>Caracteristicas</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String CARACTERISTICAS__VALOR_MAX_MAYOR_CERO__EEXPRESSION = "self.valorMax>=0";

  /**
   * Validates the valorMaxMayorCero constraint of '<em>Caracteristicas</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCaracteristicas_valorMaxMayorCero(Caracteristicas caracteristicas, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (POUEXPackage.Literals.CARACTERISTICAS,
         caracteristicas,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "valorMaxMayorCero",
         CARACTERISTICAS__VALOR_MAX_MAYOR_CERO__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAcciones(Acciones acciones, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(acciones, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(acciones, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acciones, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acciones, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(acciones, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(acciones, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(acciones, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(acciones, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(acciones, diagnostics, context);
    if (result || diagnostics != null) result &= validateAcciones_dosEfectosNoAfectanMismaCaract(acciones, diagnostics, context);
    if (result || diagnostics != null) result &= validateAcciones_SiempreNombre(acciones, diagnostics, context);
    return result;
  }

  /**
   * The cached validation expression for the dosEfectosNoAfectanMismaCaract constraint of '<em>Acciones</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String ACCIONES__DOS_EFECTOS_NO_AFECTAN_MISMA_CARACT__EEXPRESSION = "self.causa.modifica->isUnique(nombre)";

  /**
   * Validates the dosEfectosNoAfectanMismaCaract constraint of '<em>Acciones</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAcciones_dosEfectosNoAfectanMismaCaract(Acciones acciones, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (POUEXPackage.Literals.ACCIONES,
         acciones,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "dosEfectosNoAfectanMismaCaract",
         ACCIONES__DOS_EFECTOS_NO_AFECTAN_MISMA_CARACT__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * The cached validation expression for the SiempreNombre constraint of '<em>Acciones</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String ACCIONES__SIEMPRE_NOMBRE__EEXPRESSION = "self.nombre<>''";

  /**
   * Validates the SiempreNombre constraint of '<em>Acciones</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAcciones_SiempreNombre(Acciones acciones, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (POUEXPackage.Literals.ACCIONES,
         acciones,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "SiempreNombre",
         ACCIONES__SIEMPRE_NOMBRE__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEfectos(Efectos efectos, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(efectos, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(efectos, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(efectos, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(efectos, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(efectos, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(efectos, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(efectos, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(efectos, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(efectos, diagnostics, context);
    if (result || diagnostics != null) result &= validateEfectos_SiempreNombre(efectos, diagnostics, context);
    if (result || diagnostics != null) result &= validateEfectos_SiempreValorModifica(efectos, diagnostics, context);
    return result;
  }

  /**
   * The cached validation expression for the SiempreNombre constraint of '<em>Efectos</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String EFECTOS__SIEMPRE_NOMBRE__EEXPRESSION = "self.nombre<>''";

  /**
   * Validates the SiempreNombre constraint of '<em>Efectos</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEfectos_SiempreNombre(Efectos efectos, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (POUEXPackage.Literals.EFECTOS,
         efectos,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "SiempreNombre",
         EFECTOS__SIEMPRE_NOMBRE__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * The cached validation expression for the SiempreValorModifica constraint of '<em>Efectos</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String EFECTOS__SIEMPRE_VALOR_MODIFICA__EEXPRESSION = "self.valorModifica->notEmpty()";

  /**
   * Validates the SiempreValorModifica constraint of '<em>Efectos</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEfectos_SiempreValorModifica(Efectos efectos, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (POUEXPackage.Literals.EFECTOS,
         efectos,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "SiempreValorModifica",
         EFECTOS__SIEMPRE_VALOR_MODIFICA__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEstados(Estados estados, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(estados, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(estados, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(estados, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(estados, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(estados, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(estados, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(estados, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(estados, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(estados, diagnostics, context);
    if (result || diagnostics != null) result &= validateEstados_SiempreNombre(estados, diagnostics, context);
    return result;
  }

  /**
   * The cached validation expression for the SiempreNombre constraint of '<em>Estados</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String ESTADOS__SIEMPRE_NOMBRE__EEXPRESSION = "self.nombre<>''";

  /**
   * Validates the SiempreNombre constraint of '<em>Estados</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEstados_SiempreNombre(Estados estados, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (POUEXPackage.Literals.ESTADOS,
         estados,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "SiempreNombre",
         ESTADOS__SIEMPRE_NOMBRE__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTransiciones(Transiciones transiciones, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(transiciones, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(transiciones, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transiciones, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transiciones, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(transiciones, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(transiciones, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(transiciones, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(transiciones, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transiciones, diagnostics, context);
    if (result || diagnostics != null) result &= validateTransiciones_valorCambioNotEmpty(transiciones, diagnostics, context);
    if (result || diagnostics != null) result &= validateTransiciones_SiempreNombre(transiciones, diagnostics, context);
    if (result || diagnostics != null) result &= validateTransiciones_valorCambio(transiciones, diagnostics, context);
    if (result || diagnostics != null) result &= validateTransiciones_valorCambioNoIgualOMayorValMaximoCaracteristica(transiciones, diagnostics, context);
    return result;
  }

  /**
   * The cached validation expression for the valorCambioNotEmpty constraint of '<em>Transiciones</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String TRANSICIONES__VALOR_CAMBIO_NOT_EMPTY__EEXPRESSION = "self.valorCambio->notEmpty()";

  /**
   * Validates the valorCambioNotEmpty constraint of '<em>Transiciones</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTransiciones_valorCambioNotEmpty(Transiciones transiciones, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (POUEXPackage.Literals.TRANSICIONES,
         transiciones,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "valorCambioNotEmpty",
         TRANSICIONES__VALOR_CAMBIO_NOT_EMPTY__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * The cached validation expression for the SiempreNombre constraint of '<em>Transiciones</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String TRANSICIONES__SIEMPRE_NOMBRE__EEXPRESSION = "self.nombre<>''";

  /**
   * Validates the SiempreNombre constraint of '<em>Transiciones</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTransiciones_SiempreNombre(Transiciones transiciones, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (POUEXPackage.Literals.TRANSICIONES,
         transiciones,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "SiempreNombre",
         TRANSICIONES__SIEMPRE_NOMBRE__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * The cached validation expression for the valorCambio constraint of '<em>Transiciones</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String TRANSICIONES__VALOR_CAMBIO__EEXPRESSION = "self.valorCambio>=0";

  /**
   * Validates the valorCambio constraint of '<em>Transiciones</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTransiciones_valorCambio(Transiciones transiciones, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (POUEXPackage.Literals.TRANSICIONES,
         transiciones,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "valorCambio",
         TRANSICIONES__VALOR_CAMBIO__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * The cached validation expression for the valorCambioNoIgualOMayorValMaximoCaracteristica constraint of '<em>Transiciones</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String TRANSICIONES__VALOR_CAMBIO_NO_IGUAL_OMAYOR_VAL_MAXIMO_CARACTERISTICA__EEXPRESSION = "self.valorCambio < self.producida.valorMax";

  /**
   * Validates the valorCambioNoIgualOMayorValMaximoCaracteristica constraint of '<em>Transiciones</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTransiciones_valorCambioNoIgualOMayorValMaximoCaracteristica(Transiciones transiciones, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (POUEXPackage.Literals.TRANSICIONES,
         transiciones,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "valorCambioNoIgualOMayorValMaximoCaracteristica",
         TRANSICIONES__VALOR_CAMBIO_NO_IGUAL_OMAYOR_VAL_MAXIMO_CARACTERISTICA__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFisicas(Fisicas fisicas, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(fisicas, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(fisicas, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fisicas, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fisicas, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fisicas, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(fisicas, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(fisicas, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(fisicas, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fisicas, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaracteristicas_valorInicial(fisicas, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaracteristicas_valorMaxNotEmpty(fisicas, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaracteristicas_valorIniMenorMax(fisicas, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaracteristicas_SiempreNombre(fisicas, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaracteristicas_valorMayorCero(fisicas, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaracteristicas_valorMaxMayorCero(fisicas, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEmocionales(Emocionales emocionales, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(emocionales, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(emocionales, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(emocionales, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(emocionales, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(emocionales, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(emocionales, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(emocionales, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(emocionales, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(emocionales, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaracteristicas_valorInicial(emocionales, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaracteristicas_valorMaxNotEmpty(emocionales, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaracteristicas_valorIniMenorMax(emocionales, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaracteristicas_SiempreNombre(emocionales, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaracteristicas_valorMayorCero(emocionales, diagnostics, context);
    if (result || diagnostics != null) result &= validateCaracteristicas_valorMaxMayorCero(emocionales, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNormales(Normales normales, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(normales, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(normales, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(normales, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(normales, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(normales, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(normales, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(normales, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(normales, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(normales, diagnostics, context);
    if (result || diagnostics != null) result &= validateEstados_SiempreNombre(normales, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCriticos(Criticos criticos, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(criticos, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(criticos, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(criticos, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(criticos, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(criticos, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(criticos, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(criticos, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(criticos, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(criticos, diagnostics, context);
    if (result || diagnostics != null) result &= validateEstados_SiempreNombre(criticos, diagnostics, context);
    return result;
  }

  /**
   * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator()
  {
    // TODO
    // Specialize this to return a resource locator for messages specific to this validator.
    // Ensure that you remove @generated or mark it @generated NOT
    return super.getResourceLocator();
  }

} //POUEXValidator
