/**
 * generated by Xtext 2.12.0
 */
package de.rdspp.editor.rdsPP.impl;

import de.rdspp.editor.rdsPP.CommonAssignment;
import de.rdspp.editor.rdsPP.ConnectionIdentification;
import de.rdspp.editor.rdsPP.Declaration;
import de.rdspp.editor.rdsPP.DocumentIdentification;
import de.rdspp.editor.rdsPP.FunctionalAssignment;
import de.rdspp.editor.rdsPP.FunctionalDesignation;
import de.rdspp.editor.rdsPP.InstallationLocationDescription;
import de.rdspp.editor.rdsPP.LocationDescription;
import de.rdspp.editor.rdsPP.Model;
import de.rdspp.editor.rdsPP.ProductDescription;
import de.rdspp.editor.rdsPP.RDSPPComponent;
import de.rdspp.editor.rdsPP.RDSPPMarking;
import de.rdspp.editor.rdsPP.RdsPPFactory;
import de.rdspp.editor.rdsPP.RdsPPPackage;
import de.rdspp.editor.rdsPP.SignalIdentification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RdsPPPackageImpl extends EPackageImpl implements RdsPPPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rdsppMarkingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rdsppComponentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signalIdentificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass documentIdentificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionalAssignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionalDesignationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass installationLocationDescriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass locationDescriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass connectionIdentificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commonAssignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass productDescriptionEClass = null;

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
   * @see de.rdspp.editor.rdsPP.RdsPPPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RdsPPPackageImpl()
  {
    super(eNS_URI, RdsPPFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link RdsPPPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static RdsPPPackage init()
  {
    if (isInited) return (RdsPPPackage)EPackage.Registry.INSTANCE.getEPackage(RdsPPPackage.eNS_URI);

    // Obtain or create and register package
    RdsPPPackageImpl theRdsPPPackage = (RdsPPPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RdsPPPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RdsPPPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theRdsPPPackage.createPackageContents();

    // Initialize created meta-data
    theRdsPPPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRdsPPPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RdsPPPackage.eNS_URI, theRdsPPPackage);
    return theRdsPPPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Declarations()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclaration()
  {
    return declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRDSPPMarking()
  {
    return rdsppMarkingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRDSPPMarking_GemeinsameZuordnung()
  {
    return (EReference)rdsppMarkingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRDSPPMarking_FunktionsbezogeneKennzeichnung()
  {
    return (EReference)rdsppMarkingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRDSPPMarking_FunktionaleZuordnung()
  {
    return (EReference)rdsppMarkingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRDSPPMarking_Einbauortkennzeichnung()
  {
    return (EReference)rdsppMarkingEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRDSPPMarking_Aufstellungsortkennzeichnung()
  {
    return (EReference)rdsppMarkingEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRDSPPMarking_Produktbezogenekennzeichnung()
  {
    return (EReference)rdsppMarkingEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRDSPPMarking_Anschlusskennzeichnung()
  {
    return (EReference)rdsppMarkingEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRDSPPMarking_Signalkennzeichnung()
  {
    return (EReference)rdsppMarkingEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRDSPPMarking_Dokumentenkennzeichnung()
  {
    return (EReference)rdsppMarkingEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRDSPPComponent()
  {
    return rdsppComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRDSPPComponent_Name()
  {
    return (EAttribute)rdsppComponentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRDSPPComponent_Description()
  {
    return (EAttribute)rdsppComponentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSignalIdentification()
  {
    return signalIdentificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocumentIdentification()
  {
    return documentIdentificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionalAssignment()
  {
    return functionalAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionalDesignation()
  {
    return functionalDesignationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstallationLocationDescription()
  {
    return installationLocationDescriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocationDescription()
  {
    return locationDescriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConnectionIdentification()
  {
    return connectionIdentificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommonAssignment()
  {
    return commonAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProductDescription()
  {
    return productDescriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RdsPPFactory getRdsPPFactory()
  {
    return (RdsPPFactory)getEFactoryInstance();
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
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__DECLARATIONS);

    declarationEClass = createEClass(DECLARATION);

    rdsppMarkingEClass = createEClass(RDSPP_MARKING);
    createEReference(rdsppMarkingEClass, RDSPP_MARKING__GEMEINSAME_ZUORDNUNG);
    createEReference(rdsppMarkingEClass, RDSPP_MARKING__FUNKTIONSBEZOGENE_KENNZEICHNUNG);
    createEReference(rdsppMarkingEClass, RDSPP_MARKING__FUNKTIONALE_ZUORDNUNG);
    createEReference(rdsppMarkingEClass, RDSPP_MARKING__EINBAUORTKENNZEICHNUNG);
    createEReference(rdsppMarkingEClass, RDSPP_MARKING__AUFSTELLUNGSORTKENNZEICHNUNG);
    createEReference(rdsppMarkingEClass, RDSPP_MARKING__PRODUKTBEZOGENEKENNZEICHNUNG);
    createEReference(rdsppMarkingEClass, RDSPP_MARKING__ANSCHLUSSKENNZEICHNUNG);
    createEReference(rdsppMarkingEClass, RDSPP_MARKING__SIGNALKENNZEICHNUNG);
    createEReference(rdsppMarkingEClass, RDSPP_MARKING__DOKUMENTENKENNZEICHNUNG);

    rdsppComponentEClass = createEClass(RDSPP_COMPONENT);
    createEAttribute(rdsppComponentEClass, RDSPP_COMPONENT__NAME);
    createEAttribute(rdsppComponentEClass, RDSPP_COMPONENT__DESCRIPTION);

    signalIdentificationEClass = createEClass(SIGNAL_IDENTIFICATION);

    documentIdentificationEClass = createEClass(DOCUMENT_IDENTIFICATION);

    functionalAssignmentEClass = createEClass(FUNCTIONAL_ASSIGNMENT);

    functionalDesignationEClass = createEClass(FUNCTIONAL_DESIGNATION);

    installationLocationDescriptionEClass = createEClass(INSTALLATION_LOCATION_DESCRIPTION);

    locationDescriptionEClass = createEClass(LOCATION_DESCRIPTION);

    connectionIdentificationEClass = createEClass(CONNECTION_IDENTIFICATION);

    commonAssignmentEClass = createEClass(COMMON_ASSIGNMENT);

    productDescriptionEClass = createEClass(PRODUCT_DESCRIPTION);
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
    rdsppMarkingEClass.getESuperTypes().add(this.getDeclaration());
    rdsppComponentEClass.getESuperTypes().add(this.getDeclaration());
    signalIdentificationEClass.getESuperTypes().add(this.getRDSPPComponent());
    documentIdentificationEClass.getESuperTypes().add(this.getRDSPPComponent());
    functionalAssignmentEClass.getESuperTypes().add(this.getRDSPPComponent());
    functionalDesignationEClass.getESuperTypes().add(this.getRDSPPComponent());
    installationLocationDescriptionEClass.getESuperTypes().add(this.getRDSPPComponent());
    locationDescriptionEClass.getESuperTypes().add(this.getRDSPPComponent());
    connectionIdentificationEClass.getESuperTypes().add(this.getRDSPPComponent());
    commonAssignmentEClass.getESuperTypes().add(this.getRDSPPComponent());
    productDescriptionEClass.getESuperTypes().add(this.getRDSPPComponent());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declarationEClass, Declaration.class, "Declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rdsppMarkingEClass, RDSPPMarking.class, "RDSPPMarking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRDSPPMarking_GemeinsameZuordnung(), this.getCommonAssignment(), null, "gemeinsameZuordnung", null, 0, 1, RDSPPMarking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRDSPPMarking_FunktionsbezogeneKennzeichnung(), this.getFunctionalDesignation(), null, "funktionsbezogeneKennzeichnung", null, 0, 1, RDSPPMarking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRDSPPMarking_FunktionaleZuordnung(), this.getFunctionalAssignment(), null, "funktionaleZuordnung", null, 0, 1, RDSPPMarking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRDSPPMarking_Einbauortkennzeichnung(), this.getInstallationLocationDescription(), null, "einbauortkennzeichnung", null, 0, 1, RDSPPMarking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRDSPPMarking_Aufstellungsortkennzeichnung(), this.getLocationDescription(), null, "aufstellungsortkennzeichnung", null, 0, 1, RDSPPMarking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRDSPPMarking_Produktbezogenekennzeichnung(), this.getProductDescription(), null, "produktbezogenekennzeichnung", null, 0, 1, RDSPPMarking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRDSPPMarking_Anschlusskennzeichnung(), this.getConnectionIdentification(), null, "anschlusskennzeichnung", null, 0, 1, RDSPPMarking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRDSPPMarking_Signalkennzeichnung(), this.getSignalIdentification(), null, "signalkennzeichnung", null, 0, 1, RDSPPMarking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRDSPPMarking_Dokumentenkennzeichnung(), this.getDocumentIdentification(), null, "dokumentenkennzeichnung", null, 0, 1, RDSPPMarking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rdsppComponentEClass, RDSPPComponent.class, "RDSPPComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRDSPPComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, RDSPPComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRDSPPComponent_Description(), ecorePackage.getEString(), "description", null, 0, 1, RDSPPComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(signalIdentificationEClass, SignalIdentification.class, "SignalIdentification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(documentIdentificationEClass, DocumentIdentification.class, "DocumentIdentification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(functionalAssignmentEClass, FunctionalAssignment.class, "FunctionalAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(functionalDesignationEClass, FunctionalDesignation.class, "FunctionalDesignation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(installationLocationDescriptionEClass, InstallationLocationDescription.class, "InstallationLocationDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(locationDescriptionEClass, LocationDescription.class, "LocationDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(connectionIdentificationEClass, ConnectionIdentification.class, "ConnectionIdentification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(commonAssignmentEClass, CommonAssignment.class, "CommonAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(productDescriptionEClass, ProductDescription.class, "ProductDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //RdsPPPackageImpl
