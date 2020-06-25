/**
 */
package POUEX.impl;

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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Estados</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link POUEX.impl.EstadosImpl#isEstado <em>Estado</em>}</li>
 *   <li>{@link POUEX.impl.EstadosImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link POUEX.impl.EstadosImpl#isBeneficioso <em>Beneficioso</em>}</li>
 *   <li>{@link POUEX.impl.EstadosImpl#getModificado <em>Modificado</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EstadosImpl extends EObjectImpl implements Estados
{
  /**
   * The default value of the '{@link #isEstado() <em>Estado</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEstado()
   * @generated
   * @ordered
   */
  protected static final boolean ESTADO_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEstado() <em>Estado</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEstado()
   * @generated
   * @ordered
   */
  protected boolean estado = ESTADO_EDEFAULT;

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
   * The default value of the '{@link #isBeneficioso() <em>Beneficioso</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBeneficioso()
   * @generated
   * @ordered
   */
  protected static final boolean BENEFICIOSO_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBeneficioso() <em>Beneficioso</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBeneficioso()
   * @generated
   * @ordered
   */
  protected boolean beneficioso = BENEFICIOSO_EDEFAULT;

  /**
   * The cached value of the '{@link #getModificado() <em>Modificado</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModificado()
   * @generated
   * @ordered
   */
  protected EList<Transiciones> modificado;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EstadosImpl()
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
    return POUEXPackage.Literals.ESTADOS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEstado()
  {
    return estado;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEstado(boolean newEstado)
  {
    boolean oldEstado = estado;
    estado = newEstado;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, POUEXPackage.ESTADOS__ESTADO, oldEstado, estado));
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
      eNotify(new ENotificationImpl(this, Notification.SET, POUEXPackage.ESTADOS__NOMBRE, oldNombre, nombre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBeneficioso()
  {
    return beneficioso;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBeneficioso(boolean newBeneficioso)
  {
    boolean oldBeneficioso = beneficioso;
    beneficioso = newBeneficioso;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, POUEXPackage.ESTADOS__BENEFICIOSO, oldBeneficioso, beneficioso));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transiciones> getModificado()
  {
    if (modificado == null)
    {
      modificado = new EObjectWithInverseResolvingEList<Transiciones>(Transiciones.class, this, POUEXPackage.ESTADOS__MODIFICADO, POUEXPackage.TRANSICIONES__MODIFICAR);
    }
    return modificado;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case POUEXPackage.ESTADOS__MODIFICADO:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getModificado()).basicAdd(otherEnd, msgs);
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
      case POUEXPackage.ESTADOS__MODIFICADO:
        return ((InternalEList<?>)getModificado()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case POUEXPackage.ESTADOS__ESTADO:
        return isEstado();
      case POUEXPackage.ESTADOS__NOMBRE:
        return getNombre();
      case POUEXPackage.ESTADOS__BENEFICIOSO:
        return isBeneficioso();
      case POUEXPackage.ESTADOS__MODIFICADO:
        return getModificado();
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
      case POUEXPackage.ESTADOS__ESTADO:
        setEstado((Boolean)newValue);
        return;
      case POUEXPackage.ESTADOS__NOMBRE:
        setNombre((String)newValue);
        return;
      case POUEXPackage.ESTADOS__BENEFICIOSO:
        setBeneficioso((Boolean)newValue);
        return;
      case POUEXPackage.ESTADOS__MODIFICADO:
        getModificado().clear();
        getModificado().addAll((Collection<? extends Transiciones>)newValue);
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
      case POUEXPackage.ESTADOS__ESTADO:
        setEstado(ESTADO_EDEFAULT);
        return;
      case POUEXPackage.ESTADOS__NOMBRE:
        setNombre(NOMBRE_EDEFAULT);
        return;
      case POUEXPackage.ESTADOS__BENEFICIOSO:
        setBeneficioso(BENEFICIOSO_EDEFAULT);
        return;
      case POUEXPackage.ESTADOS__MODIFICADO:
        getModificado().clear();
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
      case POUEXPackage.ESTADOS__ESTADO:
        return estado != ESTADO_EDEFAULT;
      case POUEXPackage.ESTADOS__NOMBRE:
        return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
      case POUEXPackage.ESTADOS__BENEFICIOSO:
        return beneficioso != BENEFICIOSO_EDEFAULT;
      case POUEXPackage.ESTADOS__MODIFICADO:
        return modificado != null && !modificado.isEmpty();
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
    result.append(" (estado: ");
    result.append(estado);
    result.append(", nombre: ");
    result.append(nombre);
    result.append(", beneficioso: ");
    result.append(beneficioso);
    result.append(')');
    return result.toString();
  }

} //EstadosImpl
