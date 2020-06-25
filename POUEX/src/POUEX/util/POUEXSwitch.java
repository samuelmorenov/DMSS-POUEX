/**
 */
package POUEX.util;

import POUEX.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see POUEX.POUEXPackage
 * @generated
 */
public class POUEXSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static POUEXPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public POUEXSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = POUEXPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case POUEXPackage.MASCOTA:
      {
        Mascota mascota = (Mascota)theEObject;
        T result = caseMascota(mascota);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case POUEXPackage.CARACTERISTICAS:
      {
        Caracteristicas caracteristicas = (Caracteristicas)theEObject;
        T result = caseCaracteristicas(caracteristicas);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case POUEXPackage.ACCIONES:
      {
        Acciones acciones = (Acciones)theEObject;
        T result = caseAcciones(acciones);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case POUEXPackage.EFECTOS:
      {
        Efectos efectos = (Efectos)theEObject;
        T result = caseEfectos(efectos);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case POUEXPackage.ESTADOS:
      {
        Estados estados = (Estados)theEObject;
        T result = caseEstados(estados);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case POUEXPackage.TRANSICIONES:
      {
        Transiciones transiciones = (Transiciones)theEObject;
        T result = caseTransiciones(transiciones);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case POUEXPackage.FISICAS:
      {
        Fisicas fisicas = (Fisicas)theEObject;
        T result = caseFisicas(fisicas);
        if (result == null) result = caseCaracteristicas(fisicas);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case POUEXPackage.EMOCIONALES:
      {
        Emocionales emocionales = (Emocionales)theEObject;
        T result = caseEmocionales(emocionales);
        if (result == null) result = caseCaracteristicas(emocionales);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case POUEXPackage.NORMALES:
      {
        Normales normales = (Normales)theEObject;
        T result = caseNormales(normales);
        if (result == null) result = caseEstados(normales);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case POUEXPackage.CRITICOS:
      {
        Criticos criticos = (Criticos)theEObject;
        T result = caseCriticos(criticos);
        if (result == null) result = caseEstados(criticos);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mascota</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mascota</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMascota(Mascota object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Caracteristicas</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Caracteristicas</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCaracteristicas(Caracteristicas object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Acciones</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acciones</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAcciones(Acciones object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Efectos</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Efectos</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEfectos(Efectos object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Estados</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Estados</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEstados(Estados object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transiciones</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transiciones</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransiciones(Transiciones object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fisicas</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fisicas</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFisicas(Fisicas object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Emocionales</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Emocionales</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmocionales(Emocionales object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Normales</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Normales</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNormales(Normales object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Criticos</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Criticos</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCriticos(Criticos object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //POUEXSwitch
