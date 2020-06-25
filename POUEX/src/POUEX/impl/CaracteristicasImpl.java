/**
 */
package POUEX.impl;

import POUEX.Caracteristicas;
import POUEX.Efectos;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Caracteristicas</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link POUEX.impl.CaracteristicasImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link POUEX.impl.CaracteristicasImpl#getValor <em>Valor</em>}</li>
 *   <li>{@link POUEX.impl.CaracteristicasImpl#getValorMax <em>Valor Max</em>}</li>
 *   <li>{@link POUEX.impl.CaracteristicasImpl#getModificada <em>Modificada</em>}</li>
 *   <li>{@link POUEX.impl.CaracteristicasImpl#getCausar <em>Causar</em>}</li>
 *   <li>{@link POUEX.impl.CaracteristicasImpl#isBeneficioso <em>Beneficioso</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CaracteristicasImpl extends EObjectImpl implements Caracteristicas
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
   * The default value of the '{@link #getValor() <em>Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValor()
   * @generated
   * @ordered
   */
  protected static final int VALOR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValor() <em>Valor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValor()
   * @generated
   * @ordered
   */
  protected int valor = VALOR_EDEFAULT;

  /**
   * The default value of the '{@link #getValorMax() <em>Valor Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValorMax()
   * @generated
   * @ordered
   */
  protected static final int VALOR_MAX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValorMax() <em>Valor Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValorMax()
   * @generated
   * @ordered
   */
  protected int valorMax = VALOR_MAX_EDEFAULT;

  /**
   * The cached value of the '{@link #getModificada() <em>Modificada</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModificada()
   * @generated
   * @ordered
   */
  protected EList<Efectos> modificada;

  /**
   * The cached value of the '{@link #getCausar() <em>Causar</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCausar()
   * @generated
   * @ordered
   */
  protected EList<Transiciones> causar;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CaracteristicasImpl()
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
    return POUEXPackage.Literals.CARACTERISTICAS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transiciones> getCausar()
  {
    if (causar == null)
    {
      causar = new EObjectContainmentWithInverseEList<Transiciones>(Transiciones.class, this, POUEXPackage.CARACTERISTICAS__CAUSAR, POUEXPackage.TRANSICIONES__PRODUCIDA);
    }
    return causar;
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
      eNotify(new ENotificationImpl(this, Notification.SET, POUEXPackage.CARACTERISTICAS__BENEFICIOSO, oldBeneficioso, beneficioso));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValor()
  {
    return valor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValor(int newValor)
  {
    int oldValor = valor;
    valor = newValor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, POUEXPackage.CARACTERISTICAS__VALOR, oldValor, valor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValorMax()
  {
    return valorMax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValorMax(int newValorMax)
  {
    int oldValorMax = valorMax;
    valorMax = newValorMax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, POUEXPackage.CARACTERISTICAS__VALOR_MAX, oldValorMax, valorMax));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Efectos> getModificada()
  {
    if (modificada == null)
    {
      modificada = new EObjectWithInverseResolvingEList<Efectos>(Efectos.class, this, POUEXPackage.CARACTERISTICAS__MODIFICADA, POUEXPackage.EFECTOS__MODIFICA);
    }
    return modificada;
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
      case POUEXPackage.CARACTERISTICAS__MODIFICADA:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getModificada()).basicAdd(otherEnd, msgs);
      case POUEXPackage.CARACTERISTICAS__CAUSAR:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getCausar()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      eNotify(new ENotificationImpl(this, Notification.SET, POUEXPackage.CARACTERISTICAS__NOMBRE, oldNombre, nombre));
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
      case POUEXPackage.CARACTERISTICAS__MODIFICADA:
        return ((InternalEList<?>)getModificada()).basicRemove(otherEnd, msgs);
      case POUEXPackage.CARACTERISTICAS__CAUSAR:
        return ((InternalEList<?>)getCausar()).basicRemove(otherEnd, msgs);
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
      case POUEXPackage.CARACTERISTICAS__NOMBRE:
        return getNombre();
      case POUEXPackage.CARACTERISTICAS__VALOR:
        return getValor();
      case POUEXPackage.CARACTERISTICAS__VALOR_MAX:
        return getValorMax();
      case POUEXPackage.CARACTERISTICAS__MODIFICADA:
        return getModificada();
      case POUEXPackage.CARACTERISTICAS__CAUSAR:
        return getCausar();
      case POUEXPackage.CARACTERISTICAS__BENEFICIOSO:
        return isBeneficioso();
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
      case POUEXPackage.CARACTERISTICAS__NOMBRE:
        setNombre((String)newValue);
        return;
      case POUEXPackage.CARACTERISTICAS__VALOR:
        setValor((Integer)newValue);
        return;
      case POUEXPackage.CARACTERISTICAS__VALOR_MAX:
        setValorMax((Integer)newValue);
        return;
      case POUEXPackage.CARACTERISTICAS__MODIFICADA:
        getModificada().clear();
        getModificada().addAll((Collection<? extends Efectos>)newValue);
        return;
      case POUEXPackage.CARACTERISTICAS__CAUSAR:
        getCausar().clear();
        getCausar().addAll((Collection<? extends Transiciones>)newValue);
        return;
      case POUEXPackage.CARACTERISTICAS__BENEFICIOSO:
        setBeneficioso((Boolean)newValue);
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
      case POUEXPackage.CARACTERISTICAS__NOMBRE:
        setNombre(NOMBRE_EDEFAULT);
        return;
      case POUEXPackage.CARACTERISTICAS__VALOR:
        setValor(VALOR_EDEFAULT);
        return;
      case POUEXPackage.CARACTERISTICAS__VALOR_MAX:
        setValorMax(VALOR_MAX_EDEFAULT);
        return;
      case POUEXPackage.CARACTERISTICAS__MODIFICADA:
        getModificada().clear();
        return;
      case POUEXPackage.CARACTERISTICAS__CAUSAR:
        getCausar().clear();
        return;
      case POUEXPackage.CARACTERISTICAS__BENEFICIOSO:
        setBeneficioso(BENEFICIOSO_EDEFAULT);
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
      case POUEXPackage.CARACTERISTICAS__NOMBRE:
        return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
      case POUEXPackage.CARACTERISTICAS__VALOR:
        return valor != VALOR_EDEFAULT;
      case POUEXPackage.CARACTERISTICAS__VALOR_MAX:
        return valorMax != VALOR_MAX_EDEFAULT;
      case POUEXPackage.CARACTERISTICAS__MODIFICADA:
        return modificada != null && !modificada.isEmpty();
      case POUEXPackage.CARACTERISTICAS__CAUSAR:
        return causar != null && !causar.isEmpty();
      case POUEXPackage.CARACTERISTICAS__BENEFICIOSO:
        return beneficioso != BENEFICIOSO_EDEFAULT;
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
    result.append(", valor: ");
    result.append(valor);
    result.append(", valorMax: ");
    result.append(valorMax);
    result.append(", beneficioso: ");
    result.append(beneficioso);
    result.append(')');
    return result.toString();
  }

} //CaracteristicasImpl
