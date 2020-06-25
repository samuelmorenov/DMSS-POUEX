/**
 */
package POUEX.util;

import POUEX.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see POUEX.POUEXPackage
 * @generated
 */
public class POUEXAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static POUEXPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public POUEXAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = POUEXPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected POUEXSwitch<Adapter> modelSwitch =
    new POUEXSwitch<Adapter>()
    {
      @Override
      public Adapter caseMascota(Mascota object)
      {
        return createMascotaAdapter();
      }
      @Override
      public Adapter caseCaracteristicas(Caracteristicas object)
      {
        return createCaracteristicasAdapter();
      }
      @Override
      public Adapter caseAcciones(Acciones object)
      {
        return createAccionesAdapter();
      }
      @Override
      public Adapter caseEfectos(Efectos object)
      {
        return createEfectosAdapter();
      }
      @Override
      public Adapter caseEstados(Estados object)
      {
        return createEstadosAdapter();
      }
      @Override
      public Adapter caseTransiciones(Transiciones object)
      {
        return createTransicionesAdapter();
      }
      @Override
      public Adapter caseFisicas(Fisicas object)
      {
        return createFisicasAdapter();
      }
      @Override
      public Adapter caseEmocionales(Emocionales object)
      {
        return createEmocionalesAdapter();
      }
      @Override
      public Adapter caseNormales(Normales object)
      {
        return createNormalesAdapter();
      }
      @Override
      public Adapter caseCriticos(Criticos object)
      {
        return createCriticosAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link POUEX.Mascota <em>Mascota</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see POUEX.Mascota
   * @generated
   */
  public Adapter createMascotaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link POUEX.Caracteristicas <em>Caracteristicas</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see POUEX.Caracteristicas
   * @generated
   */
  public Adapter createCaracteristicasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link POUEX.Acciones <em>Acciones</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see POUEX.Acciones
   * @generated
   */
  public Adapter createAccionesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link POUEX.Efectos <em>Efectos</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see POUEX.Efectos
   * @generated
   */
  public Adapter createEfectosAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link POUEX.Estados <em>Estados</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see POUEX.Estados
   * @generated
   */
  public Adapter createEstadosAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link POUEX.Transiciones <em>Transiciones</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see POUEX.Transiciones
   * @generated
   */
  public Adapter createTransicionesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link POUEX.Fisicas <em>Fisicas</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see POUEX.Fisicas
   * @generated
   */
  public Adapter createFisicasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link POUEX.Emocionales <em>Emocionales</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see POUEX.Emocionales
   * @generated
   */
  public Adapter createEmocionalesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link POUEX.Normales <em>Normales</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see POUEX.Normales
   * @generated
   */
  public Adapter createNormalesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link POUEX.Criticos <em>Criticos</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see POUEX.Criticos
   * @generated
   */
  public Adapter createCriticosAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //POUEXAdapterFactory
