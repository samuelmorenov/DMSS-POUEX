/**
 */
package POUEX.impl;

import POUEX.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class POUEXFactoryImpl extends EFactoryImpl implements POUEXFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static POUEXFactory init()
  {
    try
    {
      POUEXFactory thePOUEXFactory = (POUEXFactory)EPackage.Registry.INSTANCE.getEFactory(POUEXPackage.eNS_URI);
      if (thePOUEXFactory != null)
      {
        return thePOUEXFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new POUEXFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public POUEXFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case POUEXPackage.MASCOTA: return createMascota();
      case POUEXPackage.CARACTERISTICAS: return createCaracteristicas();
      case POUEXPackage.ACCIONES: return createAcciones();
      case POUEXPackage.EFECTOS: return createEfectos();
      case POUEXPackage.ESTADOS: return createEstados();
      case POUEXPackage.TRANSICIONES: return createTransiciones();
      case POUEXPackage.FISICAS: return createFisicas();
      case POUEXPackage.EMOCIONALES: return createEmocionales();
      case POUEXPackage.NORMALES: return createNormales();
      case POUEXPackage.CRITICOS: return createCriticos();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mascota createMascota()
  {
    MascotaImpl mascota = new MascotaImpl();
    return mascota;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Caracteristicas createCaracteristicas()
  {
    CaracteristicasImpl caracteristicas = new CaracteristicasImpl();
    return caracteristicas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Acciones createAcciones()
  {
    AccionesImpl acciones = new AccionesImpl();
    return acciones;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Efectos createEfectos()
  {
    EfectosImpl efectos = new EfectosImpl();
    return efectos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Estados createEstados()
  {
    EstadosImpl estados = new EstadosImpl();
    return estados;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transiciones createTransiciones()
  {
    TransicionesImpl transiciones = new TransicionesImpl();
    return transiciones;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fisicas createFisicas()
  {
    FisicasImpl fisicas = new FisicasImpl();
    return fisicas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Emocionales createEmocionales()
  {
    EmocionalesImpl emocionales = new EmocionalesImpl();
    return emocionales;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Normales createNormales()
  {
    NormalesImpl normales = new NormalesImpl();
    return normales;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Criticos createCriticos()
  {
    CriticosImpl criticos = new CriticosImpl();
    return criticos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public POUEXPackage getPOUEXPackage()
  {
    return (POUEXPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static POUEXPackage getPackage()
  {
    return POUEXPackage.eINSTANCE;
  }

} //POUEXFactoryImpl
