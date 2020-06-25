/**
 */
package POUEX.impl;

import POUEX.Acciones;
import POUEX.Caracteristicas;
import POUEX.Efectos;
import POUEX.POUEXPackage;

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
 * An implementation of the model object '<em><b>Efectos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link POUEX.impl.EfectosImpl#getModifica <em>Modifica</em>}</li>
 *   <li>{@link POUEX.impl.EfectosImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link POUEX.impl.EfectosImpl#getValorModifica <em>Valor Modifica</em>}</li>
 *   <li>{@link POUEX.impl.EfectosImpl#getCausada <em>Causada</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EfectosImpl extends EObjectImpl implements Efectos
{
  /**
   * The cached value of the '{@link #getModifica() <em>Modifica</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModifica()
   * @generated
   * @ordered
   */
  protected Caracteristicas modifica;

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
   * The default value of the '{@link #getValorModifica() <em>Valor Modifica</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValorModifica()
   * @generated
   * @ordered
   */
  protected static final int VALOR_MODIFICA_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValorModifica() <em>Valor Modifica</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValorModifica()
   * @generated
   * @ordered
   */
  protected int valorModifica = VALOR_MODIFICA_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EfectosImpl()
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
    return POUEXPackage.Literals.EFECTOS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Caracteristicas getModifica()
  {
    if (modifica != null && modifica.eIsProxy())
    {
      InternalEObject oldModifica = (InternalEObject)modifica;
      modifica = (Caracteristicas)eResolveProxy(oldModifica);
      if (modifica != oldModifica)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, POUEXPackage.EFECTOS__MODIFICA, oldModifica, modifica));
      }
    }
    return modifica;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Caracteristicas basicGetModifica()
  {
    return modifica;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModifica(Caracteristicas newModifica, NotificationChain msgs)
  {
    Caracteristicas oldModifica = modifica;
    modifica = newModifica;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, POUEXPackage.EFECTOS__MODIFICA, oldModifica, newModifica);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModifica(Caracteristicas newModifica)
  {
    if (newModifica != modifica)
    {
      NotificationChain msgs = null;
      if (modifica != null)
        msgs = ((InternalEObject)modifica).eInverseRemove(this, POUEXPackage.CARACTERISTICAS__MODIFICADA, Caracteristicas.class, msgs);
      if (newModifica != null)
        msgs = ((InternalEObject)newModifica).eInverseAdd(this, POUEXPackage.CARACTERISTICAS__MODIFICADA, Caracteristicas.class, msgs);
      msgs = basicSetModifica(newModifica, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, POUEXPackage.EFECTOS__MODIFICA, newModifica, newModifica));
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
      eNotify(new ENotificationImpl(this, Notification.SET, POUEXPackage.EFECTOS__NOMBRE, oldNombre, nombre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValorModifica()
  {
    return valorModifica;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValorModifica(int newValorModifica)
  {
    int oldValorModifica = valorModifica;
    valorModifica = newValorModifica;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, POUEXPackage.EFECTOS__VALOR_MODIFICA, oldValorModifica, valorModifica));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Acciones getCausada()
  {
    if (eContainerFeatureID() != POUEXPackage.EFECTOS__CAUSADA) return null;
    return (Acciones)eInternalContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCausada(Acciones newCausada, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newCausada, POUEXPackage.EFECTOS__CAUSADA, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCausada(Acciones newCausada)
  {
    if (newCausada != eInternalContainer() || (eContainerFeatureID() != POUEXPackage.EFECTOS__CAUSADA && newCausada != null))
    {
      if (EcoreUtil.isAncestor(this, newCausada))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newCausada != null)
        msgs = ((InternalEObject)newCausada).eInverseAdd(this, POUEXPackage.ACCIONES__CAUSA, Acciones.class, msgs);
      msgs = basicSetCausada(newCausada, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, POUEXPackage.EFECTOS__CAUSADA, newCausada, newCausada));
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
      case POUEXPackage.EFECTOS__MODIFICA:
        if (modifica != null)
          msgs = ((InternalEObject)modifica).eInverseRemove(this, POUEXPackage.CARACTERISTICAS__MODIFICADA, Caracteristicas.class, msgs);
        return basicSetModifica((Caracteristicas)otherEnd, msgs);
      case POUEXPackage.EFECTOS__CAUSADA:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetCausada((Acciones)otherEnd, msgs);
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
      case POUEXPackage.EFECTOS__MODIFICA:
        return basicSetModifica(null, msgs);
      case POUEXPackage.EFECTOS__CAUSADA:
        return basicSetCausada(null, msgs);
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
      case POUEXPackage.EFECTOS__CAUSADA:
        return eInternalContainer().eInverseRemove(this, POUEXPackage.ACCIONES__CAUSA, Acciones.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case POUEXPackage.EFECTOS__MODIFICA:
        if (resolve) return getModifica();
        return basicGetModifica();
      case POUEXPackage.EFECTOS__NOMBRE:
        return getNombre();
      case POUEXPackage.EFECTOS__VALOR_MODIFICA:
        return getValorModifica();
      case POUEXPackage.EFECTOS__CAUSADA:
        return getCausada();
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
      case POUEXPackage.EFECTOS__MODIFICA:
        setModifica((Caracteristicas)newValue);
        return;
      case POUEXPackage.EFECTOS__NOMBRE:
        setNombre((String)newValue);
        return;
      case POUEXPackage.EFECTOS__VALOR_MODIFICA:
        setValorModifica((Integer)newValue);
        return;
      case POUEXPackage.EFECTOS__CAUSADA:
        setCausada((Acciones)newValue);
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
      case POUEXPackage.EFECTOS__MODIFICA:
        setModifica((Caracteristicas)null);
        return;
      case POUEXPackage.EFECTOS__NOMBRE:
        setNombre(NOMBRE_EDEFAULT);
        return;
      case POUEXPackage.EFECTOS__VALOR_MODIFICA:
        setValorModifica(VALOR_MODIFICA_EDEFAULT);
        return;
      case POUEXPackage.EFECTOS__CAUSADA:
        setCausada((Acciones)null);
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
      case POUEXPackage.EFECTOS__MODIFICA:
        return modifica != null;
      case POUEXPackage.EFECTOS__NOMBRE:
        return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
      case POUEXPackage.EFECTOS__VALOR_MODIFICA:
        return valorModifica != VALOR_MODIFICA_EDEFAULT;
      case POUEXPackage.EFECTOS__CAUSADA:
        return getCausada() != null;
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
    result.append(" (nombre: ");
    result.append(nombre);
    result.append(", valorModifica: ");
    result.append(valorModifica);
    result.append(')');
    return result.toString();
  }

} //EfectosImpl
