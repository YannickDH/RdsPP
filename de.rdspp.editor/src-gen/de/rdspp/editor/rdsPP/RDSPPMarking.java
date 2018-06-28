/**
 * generated by Xtext 2.12.0
 */
package de.rdspp.editor.rdsPP;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDSPP Marking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.rdspp.editor.rdsPP.RDSPPMarking#getGemeinsameZuordnung <em>Gemeinsame Zuordnung</em>}</li>
 *   <li>{@link de.rdspp.editor.rdsPP.RDSPPMarking#getFunktionsbezogeneKennzeichnung <em>Funktionsbezogene Kennzeichnung</em>}</li>
 *   <li>{@link de.rdspp.editor.rdsPP.RDSPPMarking#getFunktionaleZuordnung <em>Funktionale Zuordnung</em>}</li>
 *   <li>{@link de.rdspp.editor.rdsPP.RDSPPMarking#getEinbauortkennzeichnung <em>Einbauortkennzeichnung</em>}</li>
 *   <li>{@link de.rdspp.editor.rdsPP.RDSPPMarking#getAufstellungsortkennzeichnung <em>Aufstellungsortkennzeichnung</em>}</li>
 *   <li>{@link de.rdspp.editor.rdsPP.RDSPPMarking#getProduktbezogenekennzeichnung <em>Produktbezogenekennzeichnung</em>}</li>
 *   <li>{@link de.rdspp.editor.rdsPP.RDSPPMarking#getAnschlusskennzeichnung <em>Anschlusskennzeichnung</em>}</li>
 *   <li>{@link de.rdspp.editor.rdsPP.RDSPPMarking#getSignalkennzeichnung <em>Signalkennzeichnung</em>}</li>
 *   <li>{@link de.rdspp.editor.rdsPP.RDSPPMarking#getDokumentenkennzeichnung <em>Dokumentenkennzeichnung</em>}</li>
 * </ul>
 *
 * @see de.rdspp.editor.rdsPP.RdsPPPackage#getRDSPPMarking()
 * @model
 * @generated
 */
public interface RDSPPMarking extends Declaration
{
  /**
   * Returns the value of the '<em><b>Gemeinsame Zuordnung</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Gemeinsame Zuordnung</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Gemeinsame Zuordnung</em>' reference.
   * @see #setGemeinsameZuordnung(CommonAssignment)
   * @see de.rdspp.editor.rdsPP.RdsPPPackage#getRDSPPMarking_GemeinsameZuordnung()
   * @model
   * @generated
   */
  CommonAssignment getGemeinsameZuordnung();

  /**
   * Sets the value of the '{@link de.rdspp.editor.rdsPP.RDSPPMarking#getGemeinsameZuordnung <em>Gemeinsame Zuordnung</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Gemeinsame Zuordnung</em>' reference.
   * @see #getGemeinsameZuordnung()
   * @generated
   */
  void setGemeinsameZuordnung(CommonAssignment value);

  /**
   * Returns the value of the '<em><b>Funktionsbezogene Kennzeichnung</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Funktionsbezogene Kennzeichnung</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Funktionsbezogene Kennzeichnung</em>' reference.
   * @see #setFunktionsbezogeneKennzeichnung(FunctionalDesignation)
   * @see de.rdspp.editor.rdsPP.RdsPPPackage#getRDSPPMarking_FunktionsbezogeneKennzeichnung()
   * @model
   * @generated
   */
  FunctionalDesignation getFunktionsbezogeneKennzeichnung();

  /**
   * Sets the value of the '{@link de.rdspp.editor.rdsPP.RDSPPMarking#getFunktionsbezogeneKennzeichnung <em>Funktionsbezogene Kennzeichnung</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Funktionsbezogene Kennzeichnung</em>' reference.
   * @see #getFunktionsbezogeneKennzeichnung()
   * @generated
   */
  void setFunktionsbezogeneKennzeichnung(FunctionalDesignation value);

  /**
   * Returns the value of the '<em><b>Funktionale Zuordnung</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Funktionale Zuordnung</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Funktionale Zuordnung</em>' reference.
   * @see #setFunktionaleZuordnung(FunctionalAssignment)
   * @see de.rdspp.editor.rdsPP.RdsPPPackage#getRDSPPMarking_FunktionaleZuordnung()
   * @model
   * @generated
   */
  FunctionalAssignment getFunktionaleZuordnung();

  /**
   * Sets the value of the '{@link de.rdspp.editor.rdsPP.RDSPPMarking#getFunktionaleZuordnung <em>Funktionale Zuordnung</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Funktionale Zuordnung</em>' reference.
   * @see #getFunktionaleZuordnung()
   * @generated
   */
  void setFunktionaleZuordnung(FunctionalAssignment value);

  /**
   * Returns the value of the '<em><b>Einbauortkennzeichnung</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Einbauortkennzeichnung</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Einbauortkennzeichnung</em>' reference.
   * @see #setEinbauortkennzeichnung(InstallationLocationDescription)
   * @see de.rdspp.editor.rdsPP.RdsPPPackage#getRDSPPMarking_Einbauortkennzeichnung()
   * @model
   * @generated
   */
  InstallationLocationDescription getEinbauortkennzeichnung();

  /**
   * Sets the value of the '{@link de.rdspp.editor.rdsPP.RDSPPMarking#getEinbauortkennzeichnung <em>Einbauortkennzeichnung</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Einbauortkennzeichnung</em>' reference.
   * @see #getEinbauortkennzeichnung()
   * @generated
   */
  void setEinbauortkennzeichnung(InstallationLocationDescription value);

  /**
   * Returns the value of the '<em><b>Aufstellungsortkennzeichnung</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aufstellungsortkennzeichnung</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aufstellungsortkennzeichnung</em>' reference.
   * @see #setAufstellungsortkennzeichnung(LocationDescription)
   * @see de.rdspp.editor.rdsPP.RdsPPPackage#getRDSPPMarking_Aufstellungsortkennzeichnung()
   * @model
   * @generated
   */
  LocationDescription getAufstellungsortkennzeichnung();

  /**
   * Sets the value of the '{@link de.rdspp.editor.rdsPP.RDSPPMarking#getAufstellungsortkennzeichnung <em>Aufstellungsortkennzeichnung</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aufstellungsortkennzeichnung</em>' reference.
   * @see #getAufstellungsortkennzeichnung()
   * @generated
   */
  void setAufstellungsortkennzeichnung(LocationDescription value);

  /**
   * Returns the value of the '<em><b>Produktbezogenekennzeichnung</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Produktbezogenekennzeichnung</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Produktbezogenekennzeichnung</em>' reference.
   * @see #setProduktbezogenekennzeichnung(ProductDescription)
   * @see de.rdspp.editor.rdsPP.RdsPPPackage#getRDSPPMarking_Produktbezogenekennzeichnung()
   * @model
   * @generated
   */
  ProductDescription getProduktbezogenekennzeichnung();

  /**
   * Sets the value of the '{@link de.rdspp.editor.rdsPP.RDSPPMarking#getProduktbezogenekennzeichnung <em>Produktbezogenekennzeichnung</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Produktbezogenekennzeichnung</em>' reference.
   * @see #getProduktbezogenekennzeichnung()
   * @generated
   */
  void setProduktbezogenekennzeichnung(ProductDescription value);

  /**
   * Returns the value of the '<em><b>Anschlusskennzeichnung</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Anschlusskennzeichnung</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anschlusskennzeichnung</em>' reference.
   * @see #setAnschlusskennzeichnung(ConnectionIdentification)
   * @see de.rdspp.editor.rdsPP.RdsPPPackage#getRDSPPMarking_Anschlusskennzeichnung()
   * @model
   * @generated
   */
  ConnectionIdentification getAnschlusskennzeichnung();

  /**
   * Sets the value of the '{@link de.rdspp.editor.rdsPP.RDSPPMarking#getAnschlusskennzeichnung <em>Anschlusskennzeichnung</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Anschlusskennzeichnung</em>' reference.
   * @see #getAnschlusskennzeichnung()
   * @generated
   */
  void setAnschlusskennzeichnung(ConnectionIdentification value);

  /**
   * Returns the value of the '<em><b>Signalkennzeichnung</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signalkennzeichnung</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signalkennzeichnung</em>' reference.
   * @see #setSignalkennzeichnung(SignalIdentification)
   * @see de.rdspp.editor.rdsPP.RdsPPPackage#getRDSPPMarking_Signalkennzeichnung()
   * @model
   * @generated
   */
  SignalIdentification getSignalkennzeichnung();

  /**
   * Sets the value of the '{@link de.rdspp.editor.rdsPP.RDSPPMarking#getSignalkennzeichnung <em>Signalkennzeichnung</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signalkennzeichnung</em>' reference.
   * @see #getSignalkennzeichnung()
   * @generated
   */
  void setSignalkennzeichnung(SignalIdentification value);

  /**
   * Returns the value of the '<em><b>Dokumentenkennzeichnung</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dokumentenkennzeichnung</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dokumentenkennzeichnung</em>' reference.
   * @see #setDokumentenkennzeichnung(DocumentIdentification)
   * @see de.rdspp.editor.rdsPP.RdsPPPackage#getRDSPPMarking_Dokumentenkennzeichnung()
   * @model
   * @generated
   */
  DocumentIdentification getDokumentenkennzeichnung();

  /**
   * Sets the value of the '{@link de.rdspp.editor.rdsPP.RDSPPMarking#getDokumentenkennzeichnung <em>Dokumentenkennzeichnung</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dokumentenkennzeichnung</em>' reference.
   * @see #getDokumentenkennzeichnung()
   * @generated
   */
  void setDokumentenkennzeichnung(DocumentIdentification value);

} // RDSPPMarking