/**
 * generated by Xtext 2.12.0
 */
package de.rdspp.editor.rdsPP.impl;

import de.rdspp.editor.rdsPP.CommonAssignment;
import de.rdspp.editor.rdsPP.ConnectionIdentification;
import de.rdspp.editor.rdsPP.DocumentIdentification;
import de.rdspp.editor.rdsPP.FunctionalAssignment;
import de.rdspp.editor.rdsPP.FunctionalDesignation;
import de.rdspp.editor.rdsPP.InstallationLocationDescription;
import de.rdspp.editor.rdsPP.LocationDescription;
import de.rdspp.editor.rdsPP.ProductDescription;
import de.rdspp.editor.rdsPP.RDSPPMarking;
import de.rdspp.editor.rdsPP.RdsPPPackage;
import de.rdspp.editor.rdsPP.SignalIdentification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDSPP Marking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.rdspp.editor.rdsPP.impl.RDSPPMarkingImpl#getGemeinsameZuordnung <em>Gemeinsame Zuordnung</em>}</li>
 *   <li>{@link de.rdspp.editor.rdsPP.impl.RDSPPMarkingImpl#getFunktionsbezogeneKennzeichnung <em>Funktionsbezogene Kennzeichnung</em>}</li>
 *   <li>{@link de.rdspp.editor.rdsPP.impl.RDSPPMarkingImpl#getFunktionaleZuordnung <em>Funktionale Zuordnung</em>}</li>
 *   <li>{@link de.rdspp.editor.rdsPP.impl.RDSPPMarkingImpl#getEinbauortkennzeichnung <em>Einbauortkennzeichnung</em>}</li>
 *   <li>{@link de.rdspp.editor.rdsPP.impl.RDSPPMarkingImpl#getAufstellungsortkennzeichnung <em>Aufstellungsortkennzeichnung</em>}</li>
 *   <li>{@link de.rdspp.editor.rdsPP.impl.RDSPPMarkingImpl#getProduktbezogenekennzeichnung <em>Produktbezogenekennzeichnung</em>}</li>
 *   <li>{@link de.rdspp.editor.rdsPP.impl.RDSPPMarkingImpl#getAnschlusskennzeichnung <em>Anschlusskennzeichnung</em>}</li>
 *   <li>{@link de.rdspp.editor.rdsPP.impl.RDSPPMarkingImpl#getSignalkennzeichnung <em>Signalkennzeichnung</em>}</li>
 *   <li>{@link de.rdspp.editor.rdsPP.impl.RDSPPMarkingImpl#getDokumentenkennzeichnung <em>Dokumentenkennzeichnung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RDSPPMarkingImpl extends DeclarationImpl implements RDSPPMarking
{
  /**
   * The cached value of the '{@link #getGemeinsameZuordnung() <em>Gemeinsame Zuordnung</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGemeinsameZuordnung()
   * @generated
   * @ordered
   */
  protected CommonAssignment gemeinsameZuordnung;

  /**
   * The cached value of the '{@link #getFunktionsbezogeneKennzeichnung() <em>Funktionsbezogene Kennzeichnung</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunktionsbezogeneKennzeichnung()
   * @generated
   * @ordered
   */
  protected FunctionalDesignation funktionsbezogeneKennzeichnung;

  /**
   * The cached value of the '{@link #getFunktionaleZuordnung() <em>Funktionale Zuordnung</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunktionaleZuordnung()
   * @generated
   * @ordered
   */
  protected FunctionalAssignment funktionaleZuordnung;

  /**
   * The cached value of the '{@link #getEinbauortkennzeichnung() <em>Einbauortkennzeichnung</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEinbauortkennzeichnung()
   * @generated
   * @ordered
   */
  protected InstallationLocationDescription einbauortkennzeichnung;

  /**
   * The cached value of the '{@link #getAufstellungsortkennzeichnung() <em>Aufstellungsortkennzeichnung</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAufstellungsortkennzeichnung()
   * @generated
   * @ordered
   */
  protected LocationDescription aufstellungsortkennzeichnung;

  /**
   * The cached value of the '{@link #getProduktbezogenekennzeichnung() <em>Produktbezogenekennzeichnung</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProduktbezogenekennzeichnung()
   * @generated
   * @ordered
   */
  protected ProductDescription produktbezogenekennzeichnung;

  /**
   * The cached value of the '{@link #getAnschlusskennzeichnung() <em>Anschlusskennzeichnung</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnschlusskennzeichnung()
   * @generated
   * @ordered
   */
  protected ConnectionIdentification anschlusskennzeichnung;

  /**
   * The cached value of the '{@link #getSignalkennzeichnung() <em>Signalkennzeichnung</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignalkennzeichnung()
   * @generated
   * @ordered
   */
  protected SignalIdentification signalkennzeichnung;

  /**
   * The cached value of the '{@link #getDokumentenkennzeichnung() <em>Dokumentenkennzeichnung</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDokumentenkennzeichnung()
   * @generated
   * @ordered
   */
  protected DocumentIdentification dokumentenkennzeichnung;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RDSPPMarkingImpl()
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
    return RdsPPPackage.Literals.RDSPP_MARKING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommonAssignment getGemeinsameZuordnung()
  {
    if (gemeinsameZuordnung != null && gemeinsameZuordnung.eIsProxy())
    {
      InternalEObject oldGemeinsameZuordnung = (InternalEObject)gemeinsameZuordnung;
      gemeinsameZuordnung = (CommonAssignment)eResolveProxy(oldGemeinsameZuordnung);
      if (gemeinsameZuordnung != oldGemeinsameZuordnung)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdsPPPackage.RDSPP_MARKING__GEMEINSAME_ZUORDNUNG, oldGemeinsameZuordnung, gemeinsameZuordnung));
      }
    }
    return gemeinsameZuordnung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommonAssignment basicGetGemeinsameZuordnung()
  {
    return gemeinsameZuordnung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGemeinsameZuordnung(CommonAssignment newGemeinsameZuordnung)
  {
    CommonAssignment oldGemeinsameZuordnung = gemeinsameZuordnung;
    gemeinsameZuordnung = newGemeinsameZuordnung;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdsPPPackage.RDSPP_MARKING__GEMEINSAME_ZUORDNUNG, oldGemeinsameZuordnung, gemeinsameZuordnung));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionalDesignation getFunktionsbezogeneKennzeichnung()
  {
    if (funktionsbezogeneKennzeichnung != null && funktionsbezogeneKennzeichnung.eIsProxy())
    {
      InternalEObject oldFunktionsbezogeneKennzeichnung = (InternalEObject)funktionsbezogeneKennzeichnung;
      funktionsbezogeneKennzeichnung = (FunctionalDesignation)eResolveProxy(oldFunktionsbezogeneKennzeichnung);
      if (funktionsbezogeneKennzeichnung != oldFunktionsbezogeneKennzeichnung)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdsPPPackage.RDSPP_MARKING__FUNKTIONSBEZOGENE_KENNZEICHNUNG, oldFunktionsbezogeneKennzeichnung, funktionsbezogeneKennzeichnung));
      }
    }
    return funktionsbezogeneKennzeichnung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionalDesignation basicGetFunktionsbezogeneKennzeichnung()
  {
    return funktionsbezogeneKennzeichnung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunktionsbezogeneKennzeichnung(FunctionalDesignation newFunktionsbezogeneKennzeichnung)
  {
    FunctionalDesignation oldFunktionsbezogeneKennzeichnung = funktionsbezogeneKennzeichnung;
    funktionsbezogeneKennzeichnung = newFunktionsbezogeneKennzeichnung;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdsPPPackage.RDSPP_MARKING__FUNKTIONSBEZOGENE_KENNZEICHNUNG, oldFunktionsbezogeneKennzeichnung, funktionsbezogeneKennzeichnung));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionalAssignment getFunktionaleZuordnung()
  {
    if (funktionaleZuordnung != null && funktionaleZuordnung.eIsProxy())
    {
      InternalEObject oldFunktionaleZuordnung = (InternalEObject)funktionaleZuordnung;
      funktionaleZuordnung = (FunctionalAssignment)eResolveProxy(oldFunktionaleZuordnung);
      if (funktionaleZuordnung != oldFunktionaleZuordnung)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdsPPPackage.RDSPP_MARKING__FUNKTIONALE_ZUORDNUNG, oldFunktionaleZuordnung, funktionaleZuordnung));
      }
    }
    return funktionaleZuordnung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionalAssignment basicGetFunktionaleZuordnung()
  {
    return funktionaleZuordnung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunktionaleZuordnung(FunctionalAssignment newFunktionaleZuordnung)
  {
    FunctionalAssignment oldFunktionaleZuordnung = funktionaleZuordnung;
    funktionaleZuordnung = newFunktionaleZuordnung;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdsPPPackage.RDSPP_MARKING__FUNKTIONALE_ZUORDNUNG, oldFunktionaleZuordnung, funktionaleZuordnung));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstallationLocationDescription getEinbauortkennzeichnung()
  {
    if (einbauortkennzeichnung != null && einbauortkennzeichnung.eIsProxy())
    {
      InternalEObject oldEinbauortkennzeichnung = (InternalEObject)einbauortkennzeichnung;
      einbauortkennzeichnung = (InstallationLocationDescription)eResolveProxy(oldEinbauortkennzeichnung);
      if (einbauortkennzeichnung != oldEinbauortkennzeichnung)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdsPPPackage.RDSPP_MARKING__EINBAUORTKENNZEICHNUNG, oldEinbauortkennzeichnung, einbauortkennzeichnung));
      }
    }
    return einbauortkennzeichnung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstallationLocationDescription basicGetEinbauortkennzeichnung()
  {
    return einbauortkennzeichnung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEinbauortkennzeichnung(InstallationLocationDescription newEinbauortkennzeichnung)
  {
    InstallationLocationDescription oldEinbauortkennzeichnung = einbauortkennzeichnung;
    einbauortkennzeichnung = newEinbauortkennzeichnung;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdsPPPackage.RDSPP_MARKING__EINBAUORTKENNZEICHNUNG, oldEinbauortkennzeichnung, einbauortkennzeichnung));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocationDescription getAufstellungsortkennzeichnung()
  {
    if (aufstellungsortkennzeichnung != null && aufstellungsortkennzeichnung.eIsProxy())
    {
      InternalEObject oldAufstellungsortkennzeichnung = (InternalEObject)aufstellungsortkennzeichnung;
      aufstellungsortkennzeichnung = (LocationDescription)eResolveProxy(oldAufstellungsortkennzeichnung);
      if (aufstellungsortkennzeichnung != oldAufstellungsortkennzeichnung)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdsPPPackage.RDSPP_MARKING__AUFSTELLUNGSORTKENNZEICHNUNG, oldAufstellungsortkennzeichnung, aufstellungsortkennzeichnung));
      }
    }
    return aufstellungsortkennzeichnung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocationDescription basicGetAufstellungsortkennzeichnung()
  {
    return aufstellungsortkennzeichnung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAufstellungsortkennzeichnung(LocationDescription newAufstellungsortkennzeichnung)
  {
    LocationDescription oldAufstellungsortkennzeichnung = aufstellungsortkennzeichnung;
    aufstellungsortkennzeichnung = newAufstellungsortkennzeichnung;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdsPPPackage.RDSPP_MARKING__AUFSTELLUNGSORTKENNZEICHNUNG, oldAufstellungsortkennzeichnung, aufstellungsortkennzeichnung));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProductDescription getProduktbezogenekennzeichnung()
  {
    if (produktbezogenekennzeichnung != null && produktbezogenekennzeichnung.eIsProxy())
    {
      InternalEObject oldProduktbezogenekennzeichnung = (InternalEObject)produktbezogenekennzeichnung;
      produktbezogenekennzeichnung = (ProductDescription)eResolveProxy(oldProduktbezogenekennzeichnung);
      if (produktbezogenekennzeichnung != oldProduktbezogenekennzeichnung)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdsPPPackage.RDSPP_MARKING__PRODUKTBEZOGENEKENNZEICHNUNG, oldProduktbezogenekennzeichnung, produktbezogenekennzeichnung));
      }
    }
    return produktbezogenekennzeichnung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProductDescription basicGetProduktbezogenekennzeichnung()
  {
    return produktbezogenekennzeichnung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProduktbezogenekennzeichnung(ProductDescription newProduktbezogenekennzeichnung)
  {
    ProductDescription oldProduktbezogenekennzeichnung = produktbezogenekennzeichnung;
    produktbezogenekennzeichnung = newProduktbezogenekennzeichnung;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdsPPPackage.RDSPP_MARKING__PRODUKTBEZOGENEKENNZEICHNUNG, oldProduktbezogenekennzeichnung, produktbezogenekennzeichnung));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectionIdentification getAnschlusskennzeichnung()
  {
    if (anschlusskennzeichnung != null && anschlusskennzeichnung.eIsProxy())
    {
      InternalEObject oldAnschlusskennzeichnung = (InternalEObject)anschlusskennzeichnung;
      anschlusskennzeichnung = (ConnectionIdentification)eResolveProxy(oldAnschlusskennzeichnung);
      if (anschlusskennzeichnung != oldAnschlusskennzeichnung)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdsPPPackage.RDSPP_MARKING__ANSCHLUSSKENNZEICHNUNG, oldAnschlusskennzeichnung, anschlusskennzeichnung));
      }
    }
    return anschlusskennzeichnung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectionIdentification basicGetAnschlusskennzeichnung()
  {
    return anschlusskennzeichnung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnschlusskennzeichnung(ConnectionIdentification newAnschlusskennzeichnung)
  {
    ConnectionIdentification oldAnschlusskennzeichnung = anschlusskennzeichnung;
    anschlusskennzeichnung = newAnschlusskennzeichnung;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdsPPPackage.RDSPP_MARKING__ANSCHLUSSKENNZEICHNUNG, oldAnschlusskennzeichnung, anschlusskennzeichnung));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignalIdentification getSignalkennzeichnung()
  {
    if (signalkennzeichnung != null && signalkennzeichnung.eIsProxy())
    {
      InternalEObject oldSignalkennzeichnung = (InternalEObject)signalkennzeichnung;
      signalkennzeichnung = (SignalIdentification)eResolveProxy(oldSignalkennzeichnung);
      if (signalkennzeichnung != oldSignalkennzeichnung)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdsPPPackage.RDSPP_MARKING__SIGNALKENNZEICHNUNG, oldSignalkennzeichnung, signalkennzeichnung));
      }
    }
    return signalkennzeichnung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignalIdentification basicGetSignalkennzeichnung()
  {
    return signalkennzeichnung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSignalkennzeichnung(SignalIdentification newSignalkennzeichnung)
  {
    SignalIdentification oldSignalkennzeichnung = signalkennzeichnung;
    signalkennzeichnung = newSignalkennzeichnung;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdsPPPackage.RDSPP_MARKING__SIGNALKENNZEICHNUNG, oldSignalkennzeichnung, signalkennzeichnung));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentIdentification getDokumentenkennzeichnung()
  {
    if (dokumentenkennzeichnung != null && dokumentenkennzeichnung.eIsProxy())
    {
      InternalEObject oldDokumentenkennzeichnung = (InternalEObject)dokumentenkennzeichnung;
      dokumentenkennzeichnung = (DocumentIdentification)eResolveProxy(oldDokumentenkennzeichnung);
      if (dokumentenkennzeichnung != oldDokumentenkennzeichnung)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdsPPPackage.RDSPP_MARKING__DOKUMENTENKENNZEICHNUNG, oldDokumentenkennzeichnung, dokumentenkennzeichnung));
      }
    }
    return dokumentenkennzeichnung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentIdentification basicGetDokumentenkennzeichnung()
  {
    return dokumentenkennzeichnung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDokumentenkennzeichnung(DocumentIdentification newDokumentenkennzeichnung)
  {
    DocumentIdentification oldDokumentenkennzeichnung = dokumentenkennzeichnung;
    dokumentenkennzeichnung = newDokumentenkennzeichnung;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RdsPPPackage.RDSPP_MARKING__DOKUMENTENKENNZEICHNUNG, oldDokumentenkennzeichnung, dokumentenkennzeichnung));
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
      case RdsPPPackage.RDSPP_MARKING__GEMEINSAME_ZUORDNUNG:
        if (resolve) return getGemeinsameZuordnung();
        return basicGetGemeinsameZuordnung();
      case RdsPPPackage.RDSPP_MARKING__FUNKTIONSBEZOGENE_KENNZEICHNUNG:
        if (resolve) return getFunktionsbezogeneKennzeichnung();
        return basicGetFunktionsbezogeneKennzeichnung();
      case RdsPPPackage.RDSPP_MARKING__FUNKTIONALE_ZUORDNUNG:
        if (resolve) return getFunktionaleZuordnung();
        return basicGetFunktionaleZuordnung();
      case RdsPPPackage.RDSPP_MARKING__EINBAUORTKENNZEICHNUNG:
        if (resolve) return getEinbauortkennzeichnung();
        return basicGetEinbauortkennzeichnung();
      case RdsPPPackage.RDSPP_MARKING__AUFSTELLUNGSORTKENNZEICHNUNG:
        if (resolve) return getAufstellungsortkennzeichnung();
        return basicGetAufstellungsortkennzeichnung();
      case RdsPPPackage.RDSPP_MARKING__PRODUKTBEZOGENEKENNZEICHNUNG:
        if (resolve) return getProduktbezogenekennzeichnung();
        return basicGetProduktbezogenekennzeichnung();
      case RdsPPPackage.RDSPP_MARKING__ANSCHLUSSKENNZEICHNUNG:
        if (resolve) return getAnschlusskennzeichnung();
        return basicGetAnschlusskennzeichnung();
      case RdsPPPackage.RDSPP_MARKING__SIGNALKENNZEICHNUNG:
        if (resolve) return getSignalkennzeichnung();
        return basicGetSignalkennzeichnung();
      case RdsPPPackage.RDSPP_MARKING__DOKUMENTENKENNZEICHNUNG:
        if (resolve) return getDokumentenkennzeichnung();
        return basicGetDokumentenkennzeichnung();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RdsPPPackage.RDSPP_MARKING__GEMEINSAME_ZUORDNUNG:
        setGemeinsameZuordnung((CommonAssignment)newValue);
        return;
      case RdsPPPackage.RDSPP_MARKING__FUNKTIONSBEZOGENE_KENNZEICHNUNG:
        setFunktionsbezogeneKennzeichnung((FunctionalDesignation)newValue);
        return;
      case RdsPPPackage.RDSPP_MARKING__FUNKTIONALE_ZUORDNUNG:
        setFunktionaleZuordnung((FunctionalAssignment)newValue);
        return;
      case RdsPPPackage.RDSPP_MARKING__EINBAUORTKENNZEICHNUNG:
        setEinbauortkennzeichnung((InstallationLocationDescription)newValue);
        return;
      case RdsPPPackage.RDSPP_MARKING__AUFSTELLUNGSORTKENNZEICHNUNG:
        setAufstellungsortkennzeichnung((LocationDescription)newValue);
        return;
      case RdsPPPackage.RDSPP_MARKING__PRODUKTBEZOGENEKENNZEICHNUNG:
        setProduktbezogenekennzeichnung((ProductDescription)newValue);
        return;
      case RdsPPPackage.RDSPP_MARKING__ANSCHLUSSKENNZEICHNUNG:
        setAnschlusskennzeichnung((ConnectionIdentification)newValue);
        return;
      case RdsPPPackage.RDSPP_MARKING__SIGNALKENNZEICHNUNG:
        setSignalkennzeichnung((SignalIdentification)newValue);
        return;
      case RdsPPPackage.RDSPP_MARKING__DOKUMENTENKENNZEICHNUNG:
        setDokumentenkennzeichnung((DocumentIdentification)newValue);
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
      case RdsPPPackage.RDSPP_MARKING__GEMEINSAME_ZUORDNUNG:
        setGemeinsameZuordnung((CommonAssignment)null);
        return;
      case RdsPPPackage.RDSPP_MARKING__FUNKTIONSBEZOGENE_KENNZEICHNUNG:
        setFunktionsbezogeneKennzeichnung((FunctionalDesignation)null);
        return;
      case RdsPPPackage.RDSPP_MARKING__FUNKTIONALE_ZUORDNUNG:
        setFunktionaleZuordnung((FunctionalAssignment)null);
        return;
      case RdsPPPackage.RDSPP_MARKING__EINBAUORTKENNZEICHNUNG:
        setEinbauortkennzeichnung((InstallationLocationDescription)null);
        return;
      case RdsPPPackage.RDSPP_MARKING__AUFSTELLUNGSORTKENNZEICHNUNG:
        setAufstellungsortkennzeichnung((LocationDescription)null);
        return;
      case RdsPPPackage.RDSPP_MARKING__PRODUKTBEZOGENEKENNZEICHNUNG:
        setProduktbezogenekennzeichnung((ProductDescription)null);
        return;
      case RdsPPPackage.RDSPP_MARKING__ANSCHLUSSKENNZEICHNUNG:
        setAnschlusskennzeichnung((ConnectionIdentification)null);
        return;
      case RdsPPPackage.RDSPP_MARKING__SIGNALKENNZEICHNUNG:
        setSignalkennzeichnung((SignalIdentification)null);
        return;
      case RdsPPPackage.RDSPP_MARKING__DOKUMENTENKENNZEICHNUNG:
        setDokumentenkennzeichnung((DocumentIdentification)null);
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
      case RdsPPPackage.RDSPP_MARKING__GEMEINSAME_ZUORDNUNG:
        return gemeinsameZuordnung != null;
      case RdsPPPackage.RDSPP_MARKING__FUNKTIONSBEZOGENE_KENNZEICHNUNG:
        return funktionsbezogeneKennzeichnung != null;
      case RdsPPPackage.RDSPP_MARKING__FUNKTIONALE_ZUORDNUNG:
        return funktionaleZuordnung != null;
      case RdsPPPackage.RDSPP_MARKING__EINBAUORTKENNZEICHNUNG:
        return einbauortkennzeichnung != null;
      case RdsPPPackage.RDSPP_MARKING__AUFSTELLUNGSORTKENNZEICHNUNG:
        return aufstellungsortkennzeichnung != null;
      case RdsPPPackage.RDSPP_MARKING__PRODUKTBEZOGENEKENNZEICHNUNG:
        return produktbezogenekennzeichnung != null;
      case RdsPPPackage.RDSPP_MARKING__ANSCHLUSSKENNZEICHNUNG:
        return anschlusskennzeichnung != null;
      case RdsPPPackage.RDSPP_MARKING__SIGNALKENNZEICHNUNG:
        return signalkennzeichnung != null;
      case RdsPPPackage.RDSPP_MARKING__DOKUMENTENKENNZEICHNUNG:
        return dokumentenkennzeichnung != null;
    }
    return super.eIsSet(featureID);
  }

} //RDSPPMarkingImpl
