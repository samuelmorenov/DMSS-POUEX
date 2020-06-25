/**
 */
package POUEX.impl;

import POUEX.Caracteristicas;
import POUEX.Estados;
import POUEX.POUEXPackage;
import POUEX.Transiciones;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transiciones</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link POUEX.impl.TransicionesImpl#getModificar <em>Modificar</em>}</li>
 *   <li>{@link POUEX.impl.TransicionesImpl#getValorCambio <em>Valor Cambio</em>}</li>
 *   <li>{@link POUEX.impl.TransicionesImpl#getProducida <em>Producida</em>}</li>
 *   <li>{@link POUEX.impl.TransicionesImpl#getNombre <em>Nombre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransicionesImpl extends EObjectImpl implements Transiciones
{
  /**
   * The cached value of the '{@link #getModificar() <em>Modificar</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModificar()
   * @generated
   * @ordered
   */
  protected Estados modificar;

  /**
   * The default value of the '{@link #getValorCambio() <em>Valor Cambio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValorCambio()
   * @generated
   * @ordered
   */
  protected static final int VALOR_CAMBIO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValorCambio() <em>Valor Cambio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValorCambio()
   * @generated
   * @ordered
   */
  protected int valorCambio = VALOR_CAMBIO_EDEFAULT;

  /**
   * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombre()
   * @generated
   * @ordered
   */
  protected static final String NOMBRE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombre()
   * @generated
   * @ordered
   */
  protected String nombre = NOMBRE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransicionesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return POUEXPackage.Literals.TRANSICIONES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Estados getModificar()
  {
    if (modificar != null && modificar.eIsProxy())
    {
      InternalEObject oldModificar = (InternalEObject)modificar;
      modificar = (Estados)eResolveProxy(oldModificar);
      if (modificar != oldModificar)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, POUEXPackage.TRANSICIONES__MODIFICAR, oldModificar, modificar));
      }
    }
    return modificar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Estados basicGetModificar()
  {
    return modificar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModificar(Estados newModificar, NotificationChain msgs)
  {
    Estados oldModificar = modificar;
    modificar = newModificar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, POUEXPackage.TRANSICIONES__MODIFICAR, oldModificar, newModificar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModificar(Estados newModificar)
  {
    if (newModificar != modificar)
    {
      NotificationChain msgs = null;
      if (modificar != null)
        msgs = ((InternalEObject)modificar).eInverseRemove(this, POUEXPackage.ESTADOS__MODIFICADO, Estados.class, msgs);
      if (newModificar != null)
        msgs = ((InternalEObject)newModificar).eInverseAdd(this, POUEXPackage.ESTADOS__MODIFICADO, Estados.class, msgs);
      msgs = basicSetModificar(newModificar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, POUEXPackage.TRANSICIONES__MODIFICAR, newModificar, newModificar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNombre()
  {
    return nombre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNombre(String newNombre)
  {
    String oldNombre = nombre;
    nombre = newNombre;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, POUEXPackage.TRANSICIONES__NOMBRE, oldNombre, nombre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case POUEXPackage.TRANSICIONES__MODIFICAR:
        if (modificar != null)
          msgs = ((InternalEObject)modificar).eInverseRemove(this, POUEXPackage.ESTADOS__MODIFICADO, Estados.class, msgs);
        return basicSetModificar((Estados)otherEnd, msgs);
      case POUEXPackage.TRANSICIONES__PRODUCIDA:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetProducida((Caracteristicas)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case POUEXPackage.TRANSICIONES__MODIFICAR:
        return basicSetModificar(null, msgs);
      case POUEXPackage.TRANSICIONES__PRODUCIDA:
        return basicSetProducida(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case POUEXPackage.TRANSICIONES__PRODUCIDA:
        return eInternalContainer().eInverseRemove(this, POUEXPackage.CARACTERISTICAS__CAUSAR, Caracteristicas.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValorCambio()
  {
    return valorCambio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValorCambio(int newValorCambio)
  {
    int oldValorCambio = valorCambio;
    valorCambio = newValorCambio;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, POUEXPackage.TRANSICIONES__VALOR_CAMBIO, oldValorCambio, valorCambio));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Caracteristicas getProducida()
  {
    if (eContainerFeatureID() != POUEXPackage.TRANSICIONES__PRODUCIDA) return null;
    return (Caracteristicas)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProducida(Caracteristicas newProducida, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newProducida, POUEXPackage.TRANSICIONES__PRODUCIDA, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProducida(Caracteristicas newProducida)
  {
    if (newProducida != eInternalContainer() || (eContainerFeatureID() != POUEXPackage.TRANSICIONES__PRODUCIDA && newProducida != null))
    {
      if (EcoreUtil.isAncestor(this, newProducida))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newProducida != null)
        msgs = ((InternalEObject)newProducida).eInverseAdd(this, POUEXPackage.CARACTERISTICAS__CAUSAR, Caracteristicas.class, msgs);
      msgs = basicSetProducida(newProducida, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, POUEXPackage.TRANSICIONES__PRODUCIDA, newProducida, newProducida));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case POUEXPackage.TRANSICIONES__MODIFICAR:
        if (resolve) return getModificar();
        return basicGetModificar();
      case POUEXPackage.TRANSICIONES__VALOR_CAMBIO:
        return getValorCambio();
      case POUEXPackage.TRANSICIONES__PRODUCIDA:
        return getProducida();
      case POUEXPackage.TRANSICIONES__NOMBRE:
        return getNombre();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case POUEXPackage.TRANSICIONES__MODIFICAR:
        setModificar((Estados)newValue);
        return;
      case POUEXPackage.TRANSICIONES__VALOR_CAMBIO:
        setValorCambio((Integer)newValue);
        return;
      case POUEXPackage.TRANSICIONES__PRODUCIDA:
        setProducida((Caracteristicas)newValue);
        return;
      case POUEXPackage.TRANSICIONES__NOMBRE:
        setNombre((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case POUEXPackage.TRANSICIONES__MODIFICAR:
        setModificar((Estados)null);
        return;
      case POUEXPackage.TRANSICIONES__VALOR_CAMBIO:
        setValorCambio(VALOR_CAMBIO_EDEFAULT);
        return;
      case POUEXPackage.TRANSICIONES__PRODUCIDA:
        setProducida((Caracteristicas)null);
        return;
      case POUEXPackage.TRANSICIONES__NOMBRE:
        setNombre(NOMBRE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case POUEXPackage.TRANSICIONES__MODIFICAR:
        return modificar != null;
      case POUEXPackage.TRANSICIONES__VALOR_CAMBIO:
        return valorCambio != VALOR_CAMBIO_EDEFAULT;
      case POUEXPackage.TRANSICIONES__PRODUCIDA:
        return getProducida() != null;
      case POUEXPackage.TRANSICIONES__NOMBRE:
        return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (valorCambio: ");
    result.append(valorCambio);
    result.append(", nombre: ");
    result.append(nombre);
    result.append(')');
    return result.toString();
  }

} //TransicionesImpl
