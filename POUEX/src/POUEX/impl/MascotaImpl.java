/**
 */
package POUEX.impl;

import POUEX.Acciones;
import POUEX.Caracteristicas;
import POUEX.Estados;
import POUEX.Mascota;
import POUEX.POUEXPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mascota</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link POUEX.impl.MascotaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link POUEX.impl.MascotaImpl#getRealizar <em>Realizar</em>}</li>
 *   <li>{@link POUEX.impl.MascotaImpl#getPoseer <em>Poseer</em>}</li>
 *   <li>{@link POUEX.impl.MascotaImpl#getEstar <em>Estar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MascotaImpl extends EObjectImpl implements Mascota
{
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
   * The cached value of the '{@link #getRealizar() <em>Realizar</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRealizar()
   * @generated
   * @ordered
   */
  protected EList<Acciones> realizar;

  /**
   * The cached value of the '{@link #getPoseer() <em>Poseer</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPoseer()
   * @generated
   * @ordered
   */
  protected EList<Caracteristicas> poseer;

  /**
   * The cached value of the '{@link #getEstar() <em>Estar</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEstar()
   * @generated
   * @ordered
   */
  protected EList<Estados> estar;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MascotaImpl()
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
    return POUEXPackage.Literals.MASCOTA;
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
      eNotify(new ENotificationImpl(this, Notification.SET, POUEXPackage.MASCOTA__NOMBRE, oldNombre, nombre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Acciones> getRealizar()
  {
    if (realizar == null)
    {
      realizar = new EObjectContainmentEList<Acciones>(Acciones.class, this, POUEXPackage.MASCOTA__REALIZAR);
    }
    return realizar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Caracteristicas> getPoseer()
  {
    if (poseer == null)
    {
      poseer = new EObjectContainmentEList<Caracteristicas>(Caracteristicas.class, this, POUEXPackage.MASCOTA__POSEER);
    }
    return poseer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Estados> getEstar()
  {
    if (estar == null)
    {
      estar = new EObjectContainmentEList<Estados>(Estados.class, this, POUEXPackage.MASCOTA__ESTAR);
    }
    return estar;
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
      case POUEXPackage.MASCOTA__REALIZAR:
        return ((InternalEList<?>)getRealizar()).basicRemove(otherEnd, msgs);
      case POUEXPackage.MASCOTA__POSEER:
        return ((InternalEList<?>)getPoseer()).basicRemove(otherEnd, msgs);
      case POUEXPackage.MASCOTA__ESTAR:
        return ((InternalEList<?>)getEstar()).basicRemove(otherEnd, msgs);
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
      case POUEXPackage.MASCOTA__NOMBRE:
        return getNombre();
      case POUEXPackage.MASCOTA__REALIZAR:
        return getRealizar();
      case POUEXPackage.MASCOTA__POSEER:
        return getPoseer();
      case POUEXPackage.MASCOTA__ESTAR:
        return getEstar();
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
      case POUEXPackage.MASCOTA__NOMBRE:
        setNombre((String)newValue);
        return;
      case POUEXPackage.MASCOTA__REALIZAR:
        getRealizar().clear();
        getRealizar().addAll((Collection<? extends Acciones>)newValue);
        return;
      case POUEXPackage.MASCOTA__POSEER:
        getPoseer().clear();
        getPoseer().addAll((Collection<? extends Caracteristicas>)newValue);
        return;
      case POUEXPackage.MASCOTA__ESTAR:
        getEstar().clear();
        getEstar().addAll((Collection<? extends Estados>)newValue);
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
      case POUEXPackage.MASCOTA__NOMBRE:
        setNombre(NOMBRE_EDEFAULT);
        return;
      case POUEXPackage.MASCOTA__REALIZAR:
        getRealizar().clear();
        return;
      case POUEXPackage.MASCOTA__POSEER:
        getPoseer().clear();
        return;
      case POUEXPackage.MASCOTA__ESTAR:
        getEstar().clear();
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
      case POUEXPackage.MASCOTA__NOMBRE:
        return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
      case POUEXPackage.MASCOTA__REALIZAR:
        return realizar != null && !realizar.isEmpty();
      case POUEXPackage.MASCOTA__POSEER:
        return poseer != null && !poseer.isEmpty();
      case POUEXPackage.MASCOTA__ESTAR:
        return estar != null && !estar.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //MascotaImpl
