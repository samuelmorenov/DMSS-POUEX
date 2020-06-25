/**
 */
package POUEX.impl;

import POUEX.Acciones;
import POUEX.Caracteristicas;
import POUEX.Criticos;
import POUEX.Efectos;
import POUEX.Emocionales;
import POUEX.Estados;
import POUEX.Fisicas;
import POUEX.Mascota;
import POUEX.Normales;
import POUEX.POUEXFactory;
import POUEX.POUEXPackage;
import POUEX.Transiciones;

import POUEX.util.POUEXValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class POUEXPackageImpl extends EPackageImpl implements POUEXPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mascotaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caracteristicasEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass accionesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass efectosEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass estadosEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transicionesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fisicasEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emocionalesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass normalesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass criticosEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see POUEX.POUEXPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private POUEXPackageImpl()
  {
    super(eNS_URI, POUEXFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link POUEXPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static POUEXPackage init()
  {
    if (isInited) return (POUEXPackage)EPackage.Registry.INSTANCE.getEPackage(POUEXPackage.eNS_URI);

    // Obtain or create and register package
    POUEXPackageImpl thePOUEXPackage = (POUEXPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof POUEXPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new POUEXPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePOUEXPackage.createPackageContents();

    // Initialize created meta-data
    thePOUEXPackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (thePOUEXPackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return POUEXValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    thePOUEXPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(POUEXPackage.eNS_URI, thePOUEXPackage);
    return thePOUEXPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMascota()
  {
    return mascotaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMascota_Nombre()
  {
    return (EAttribute)mascotaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMascota_Realizar()
  {
    return (EReference)mascotaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMascota_Poseer()
  {
    return (EReference)mascotaEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMascota_Estar()
  {
    return (EReference)mascotaEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCaracteristicas()
  {
    return caracteristicasEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaracteristicas_Causar()
  {
    return (EReference)caracteristicasEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCaracteristicas_Beneficioso()
  {
    return (EAttribute)caracteristicasEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCaracteristicas_Valor()
  {
    return (EAttribute)caracteristicasEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCaracteristicas_ValorMax()
  {
    return (EAttribute)caracteristicasEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaracteristicas_Modificada()
  {
    return (EReference)caracteristicasEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCaracteristicas_Nombre()
  {
    return (EAttribute)caracteristicasEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAcciones()
  {
    return accionesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAcciones_Causa()
  {
    return (EReference)accionesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAcciones_Nombre()
  {
    return (EAttribute)accionesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEfectos()
  {
    return efectosEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEfectos_Modifica()
  {
    return (EReference)efectosEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEfectos_Nombre()
  {
    return (EAttribute)efectosEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEfectos_ValorModifica()
  {
    return (EAttribute)efectosEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEfectos_Causada()
  {
    return (EReference)efectosEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEstados()
  {
    return estadosEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEstados_Estado()
  {
    return (EAttribute)estadosEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEstados_Nombre()
  {
    return (EAttribute)estadosEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEstados_Beneficioso()
  {
    return (EAttribute)estadosEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEstados_Modificado()
  {
    return (EReference)estadosEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransiciones()
  {
    return transicionesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransiciones_Modificar()
  {
    return (EReference)transicionesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransiciones_Nombre()
  {
    return (EAttribute)transicionesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransiciones_ValorCambio()
  {
    return (EAttribute)transicionesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransiciones_Producida()
  {
    return (EReference)transicionesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFisicas()
  {
    return fisicasEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmocionales()
  {
    return emocionalesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNormales()
  {
    return normalesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCriticos()
  {
    return criticosEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public POUEXFactory getPOUEXFactory()
  {
    return (POUEXFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    mascotaEClass = createEClass(MASCOTA);
    createEAttribute(mascotaEClass, MASCOTA__NOMBRE);
    createEReference(mascotaEClass, MASCOTA__REALIZAR);
    createEReference(mascotaEClass, MASCOTA__POSEER);
    createEReference(mascotaEClass, MASCOTA__ESTAR);

    caracteristicasEClass = createEClass(CARACTERISTICAS);
    createEAttribute(caracteristicasEClass, CARACTERISTICAS__NOMBRE);
    createEAttribute(caracteristicasEClass, CARACTERISTICAS__VALOR);
    createEAttribute(caracteristicasEClass, CARACTERISTICAS__VALOR_MAX);
    createEReference(caracteristicasEClass, CARACTERISTICAS__MODIFICADA);
    createEReference(caracteristicasEClass, CARACTERISTICAS__CAUSAR);
    createEAttribute(caracteristicasEClass, CARACTERISTICAS__BENEFICIOSO);

    accionesEClass = createEClass(ACCIONES);
    createEAttribute(accionesEClass, ACCIONES__NOMBRE);
    createEReference(accionesEClass, ACCIONES__CAUSA);

    efectosEClass = createEClass(EFECTOS);
    createEReference(efectosEClass, EFECTOS__MODIFICA);
    createEAttribute(efectosEClass, EFECTOS__NOMBRE);
    createEAttribute(efectosEClass, EFECTOS__VALOR_MODIFICA);
    createEReference(efectosEClass, EFECTOS__CAUSADA);

    estadosEClass = createEClass(ESTADOS);
    createEAttribute(estadosEClass, ESTADOS__ESTADO);
    createEAttribute(estadosEClass, ESTADOS__NOMBRE);
    createEAttribute(estadosEClass, ESTADOS__BENEFICIOSO);
    createEReference(estadosEClass, ESTADOS__MODIFICADO);

    transicionesEClass = createEClass(TRANSICIONES);
    createEReference(transicionesEClass, TRANSICIONES__MODIFICAR);
    createEAttribute(transicionesEClass, TRANSICIONES__VALOR_CAMBIO);
    createEReference(transicionesEClass, TRANSICIONES__PRODUCIDA);
    createEAttribute(transicionesEClass, TRANSICIONES__NOMBRE);

    fisicasEClass = createEClass(FISICAS);

    emocionalesEClass = createEClass(EMOCIONALES);

    normalesEClass = createEClass(NORMALES);

    criticosEClass = createEClass(CRITICOS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    fisicasEClass.getESuperTypes().add(this.getCaracteristicas());
    emocionalesEClass.getESuperTypes().add(this.getCaracteristicas());
    normalesEClass.getESuperTypes().add(this.getEstados());
    criticosEClass.getESuperTypes().add(this.getEstados());

    // Initialize classes and features; add operations and parameters
    initEClass(mascotaEClass, Mascota.class, "Mascota", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMascota_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Mascota.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMascota_Realizar(), this.getAcciones(), null, "realizar", null, 1, -1, Mascota.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMascota_Poseer(), this.getCaracteristicas(), null, "poseer", null, 1, -1, Mascota.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMascota_Estar(), this.getEstados(), null, "estar", null, 1, -1, Mascota.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(caracteristicasEClass, Caracteristicas.class, "Caracteristicas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCaracteristicas_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Caracteristicas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCaracteristicas_Valor(), ecorePackage.getEInt(), "valor", null, 0, 1, Caracteristicas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCaracteristicas_ValorMax(), ecorePackage.getEInt(), "valorMax", null, 0, 1, Caracteristicas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCaracteristicas_Modificada(), this.getEfectos(), this.getEfectos_Modifica(), "modificada", null, 1, -1, Caracteristicas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCaracteristicas_Causar(), this.getTransiciones(), this.getTransiciones_Producida(), "causar", null, 1, -1, Caracteristicas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCaracteristicas_Beneficioso(), ecorePackage.getEBoolean(), "beneficioso", null, 0, 1, Caracteristicas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(accionesEClass, Acciones.class, "Acciones", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAcciones_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Acciones.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAcciones_Causa(), this.getEfectos(), this.getEfectos_Causada(), "causa", null, 1, -1, Acciones.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(efectosEClass, Efectos.class, "Efectos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEfectos_Modifica(), this.getCaracteristicas(), this.getCaracteristicas_Modificada(), "modifica", null, 1, 1, Efectos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEfectos_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Efectos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEfectos_ValorModifica(), ecorePackage.getEInt(), "valorModifica", null, 0, 1, Efectos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEfectos_Causada(), this.getAcciones(), this.getAcciones_Causa(), "causada", null, 1, 1, Efectos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(estadosEClass, Estados.class, "Estados", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEstados_Estado(), ecorePackage.getEBoolean(), "estado", null, 0, 1, Estados.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEstados_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Estados.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEstados_Beneficioso(), ecorePackage.getEBoolean(), "beneficioso", null, 0, 1, Estados.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEstados_Modificado(), this.getTransiciones(), this.getTransiciones_Modificar(), "modificado", null, 1, -1, Estados.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transicionesEClass, Transiciones.class, "Transiciones", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransiciones_Modificar(), this.getEstados(), this.getEstados_Modificado(), "modificar", null, 1, 1, Transiciones.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransiciones_ValorCambio(), ecorePackage.getEInt(), "valorCambio", null, 0, 1, Transiciones.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransiciones_Producida(), this.getCaracteristicas(), this.getCaracteristicas_Causar(), "producida", null, 1, 1, Transiciones.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransiciones_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Transiciones.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fisicasEClass, Fisicas.class, "Fisicas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(emocionalesEClass, Emocionales.class, "Emocionales", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(normalesEClass, Normales.class, "Normales", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(criticosEClass, Criticos.class, "Criticos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http://www.eclipse.org/OCL/Import
    createImportAnnotations();
    // http://www.eclipse.org/emf/2002/Ecore
    createEcoreAnnotations();
    // gmf.diagram
    createGmfAnnotations();
    // http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
    createPivotAnnotations();
    // gmf.node
    createGmf_1Annotations();
    // gmf.link
    createGmf_2Annotations();
  }

  /**
   * Initializes the annotations for <b>gmf.diagram</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmfAnnotations()
  {
    String source = "gmf.diagram";				
    addAnnotation
      (mascotaEClass, 
       source, 
       new String[] 
       {
       });																					
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createImportAnnotations()
  {
    String source = "http://www.eclipse.org/OCL/Import";		
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "ecore", "http://www.eclipse.org/emf/2002/Ecore#/"
       });																							
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEcoreAnnotations()
  {
    String source = "http://www.eclipse.org/emf/2002/Ecore";			
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
       "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
       "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
       });			
    addAnnotation
      (mascotaEClass, 
       source, 
       new String[] 
       {
       "constraints", "SiempreNombre"
       });			
    addAnnotation
      (caracteristicasEClass, 
       source, 
       new String[] 
       {
       "constraints", "valorInicial valorMaxNotEmpty valorIniMenorMax SiempreNombre valorMayorCero valorMaxMayorCero"
       });				
    addAnnotation
      (accionesEClass, 
       source, 
       new String[] 
       {
       "constraints", "dosEfectosNoAfectanMismaCaract SiempreNombre"
       });				
    addAnnotation
      (efectosEClass, 
       source, 
       new String[] 
       {
       "constraints", "SiempreNombre SiempreValorModifica"
       });				
    addAnnotation
      (estadosEClass, 
       source, 
       new String[] 
       {
       "constraints", "SiempreNombre"
       });				
    addAnnotation
      (transicionesEClass, 
       source, 
       new String[] 
       {
       "constraints", "valorCambioNotEmpty SiempreNombre valorCambio valorCambioNoIgualOMayorValMaximoCaracteristica"
       });						
  }

  /**
   * Initializes the annotations for <b>gmf.node</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_1Annotations()
  {
    String source = "gmf.node";								
    addAnnotation
      (caracteristicasEClass, 
       source, 
       new String[] 
       {
       "figure", "rectangle",
       "color", "255,0,0",
       "border.color", "16,16,131",
       "label", "nombre"
       });				
    addAnnotation
      (accionesEClass, 
       source, 
       new String[] 
       {
       "figure", "rectangle",
       "color", "0,255,0",
       "border.color", "16,16,131",
       "label", "nombre"
       });							
    addAnnotation
      (estadosEClass, 
       source, 
       new String[] 
       {
       "figure", "rectangle",
       "color", "0,0,255",
       "border.color", "16,16,131",
       "label", "nombre"
       });						
    addAnnotation
      (fisicasEClass, 
       source, 
       new String[] 
       {
       "figure", "rectangle",
       "color", "247,168,81",
       "border.color", "16,16,131",
       "label", "nombre"
       });		
    addAnnotation
      (emocionalesEClass, 
       source, 
       new String[] 
       {
       "figure", "rectangle",
       "color", "244,224,83",
       "border.color", "16,16,131",
       "label", "nombre"
       });		
    addAnnotation
      (normalesEClass, 
       source, 
       new String[] 
       {
       "figure", "rectangle",
       "color", "112,112,216",
       "border.color", "16,16,131",
       "label", "nombre"
       });		
    addAnnotation
      (criticosEClass, 
       source, 
       new String[] 
       {
       "figure", "rectangle",
       "color", "190,142,185",
       "border.color", "16,16,131",
       "label", "nombre"
       });
  }

  /**
   * Initializes the annotations for <b>gmf.link</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_2Annotations()
  {
    String source = "gmf.link";														
    addAnnotation
      (efectosEClass, 
       source, 
       new String[] 
       {
       "source", "causada",
       "target", "modifica",
       "width", "2",
       "color", "255,0,150",
       "label", "valorModifica"
       });							
    addAnnotation
      (transicionesEClass, 
       source, 
       new String[] 
       {
       "source", "producida",
       "target", "modificar",
       "width", "2",
       "color", "0,255,100",
       "label", "valorCambio"
       });					
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createPivotAnnotations()
  {
    String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";						
    addAnnotation
      (mascotaEClass, 
       source, 
       new String[] 
       {
       "SiempreNombre", "self.nombre<>\'\'"
       });				
    addAnnotation
      (caracteristicasEClass, 
       source, 
       new String[] 
       {
       "valorInicial", "self.valor->notEmpty()",
       "valorMaxNotEmpty", "self.valorMax->notEmpty()",
       "valorIniMenorMax", "self.valor < self.valorMax",
       "SiempreNombre", "self.nombre<>\'\'",
       "valorMayorCero", "self.valor>=0",
       "valorMaxMayorCero", "self.valorMax>=0"
       });				
    addAnnotation
      (accionesEClass, 
       source, 
       new String[] 
       {
       "dosEfectosNoAfectanMismaCaract", "self.causa.modifica->isUnique(nombre)",
       "SiempreNombre", "self.nombre<>\'\'"
       });				
    addAnnotation
      (efectosEClass, 
       source, 
       new String[] 
       {
       "SiempreNombre", "self.nombre<>\'\'",
       "SiempreValorModifica", "self.valorModifica->notEmpty()"
       });				
    addAnnotation
      (estadosEClass, 
       source, 
       new String[] 
       {
       "SiempreNombre", "self.nombre<>\'\'"
       });				
    addAnnotation
      (transicionesEClass, 
       source, 
       new String[] 
       {
       "valorCambioNotEmpty", "self.valorCambio->notEmpty()",
       "SiempreNombre", "self.nombre<>\'\'",
       "valorCambio", "self.valorCambio>=0",
       "valorCambioNoIgualOMayorValMaximoCaracteristica", "self.valorCambio < self.producida.valorMax"
       });				
  }

} //POUEXPackageImpl
