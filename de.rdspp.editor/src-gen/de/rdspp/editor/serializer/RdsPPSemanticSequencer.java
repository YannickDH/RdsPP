/*
 * generated by Xtext 2.12.0
 */
package de.rdspp.editor.serializer;

import com.google.inject.Inject;
import de.rdspp.editor.rdsPP.CommonAssignment;
import de.rdspp.editor.rdsPP.ConnectionIdentification;
import de.rdspp.editor.rdsPP.DocumentIdentification;
import de.rdspp.editor.rdsPP.FunctionalAssignment;
import de.rdspp.editor.rdsPP.FunctionalDesignation;
import de.rdspp.editor.rdsPP.InstallationLocationDescription;
import de.rdspp.editor.rdsPP.LocationDescription;
import de.rdspp.editor.rdsPP.Model;
import de.rdspp.editor.rdsPP.ProductDescription;
import de.rdspp.editor.rdsPP.RDSPPMarking;
import de.rdspp.editor.rdsPP.RdsPPPackage;
import de.rdspp.editor.rdsPP.SignalIdentification;
import de.rdspp.editor.services.RdsPPGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class RdsPPSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RdsPPGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RdsPPPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RdsPPPackage.COMMON_ASSIGNMENT:
				sequence_CommonAssignment(context, (CommonAssignment) semanticObject); 
				return; 
			case RdsPPPackage.CONNECTION_IDENTIFICATION:
				sequence_ConnectionIdentification(context, (ConnectionIdentification) semanticObject); 
				return; 
			case RdsPPPackage.DOCUMENT_IDENTIFICATION:
				sequence_DocumentIdentification(context, (DocumentIdentification) semanticObject); 
				return; 
			case RdsPPPackage.FUNCTIONAL_ASSIGNMENT:
				sequence_FunctionalAssignment(context, (FunctionalAssignment) semanticObject); 
				return; 
			case RdsPPPackage.FUNCTIONAL_DESIGNATION:
				sequence_FunctionalDesignation(context, (FunctionalDesignation) semanticObject); 
				return; 
			case RdsPPPackage.INSTALLATION_LOCATION_DESCRIPTION:
				sequence_InstallationLocationDescription(context, (InstallationLocationDescription) semanticObject); 
				return; 
			case RdsPPPackage.LOCATION_DESCRIPTION:
				sequence_LocationDescription(context, (LocationDescription) semanticObject); 
				return; 
			case RdsPPPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case RdsPPPackage.PRODUCT_DESCRIPTION:
				sequence_ProductDescription(context, (ProductDescription) semanticObject); 
				return; 
			case RdsPPPackage.RDSPP_MARKING:
				sequence_RDSPPMarking(context, (RDSPPMarking) semanticObject); 
				return; 
			case RdsPPPackage.SIGNAL_IDENTIFICATION:
				sequence_SignalIdentification(context, (SignalIdentification) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Declaration returns CommonAssignment
	 *     RDSPPComponent returns CommonAssignment
	 *     CommonAssignment returns CommonAssignment
	 *
	 * Constraint:
	 *     (name=ID description=STRING?)
	 */
	protected void sequence_CommonAssignment(ISerializationContext context, CommonAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns ConnectionIdentification
	 *     RDSPPComponent returns ConnectionIdentification
	 *     ConnectionIdentification returns ConnectionIdentification
	 *
	 * Constraint:
	 *     (name=ID description=STRING?)
	 */
	protected void sequence_ConnectionIdentification(ISerializationContext context, ConnectionIdentification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns DocumentIdentification
	 *     RDSPPComponent returns DocumentIdentification
	 *     DocumentIdentification returns DocumentIdentification
	 *
	 * Constraint:
	 *     (name=ID description=STRING?)
	 */
	protected void sequence_DocumentIdentification(ISerializationContext context, DocumentIdentification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns FunctionalAssignment
	 *     RDSPPComponent returns FunctionalAssignment
	 *     FunctionalAssignment returns FunctionalAssignment
	 *
	 * Constraint:
	 *     (name=ID description=STRING?)
	 */
	protected void sequence_FunctionalAssignment(ISerializationContext context, FunctionalAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns FunctionalDesignation
	 *     RDSPPComponent returns FunctionalDesignation
	 *     FunctionalDesignation returns FunctionalDesignation
	 *
	 * Constraint:
	 *     (name=ID description=STRING?)
	 */
	protected void sequence_FunctionalDesignation(ISerializationContext context, FunctionalDesignation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns InstallationLocationDescription
	 *     RDSPPComponent returns InstallationLocationDescription
	 *     InstallationLocationDescription returns InstallationLocationDescription
	 *
	 * Constraint:
	 *     (name=ID description=STRING?)
	 */
	protected void sequence_InstallationLocationDescription(ISerializationContext context, InstallationLocationDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns LocationDescription
	 *     RDSPPComponent returns LocationDescription
	 *     LocationDescription returns LocationDescription
	 *
	 * Constraint:
	 *     (name=ID description=STRING?)
	 */
	protected void sequence_LocationDescription(ISerializationContext context, LocationDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     declarations+=Declaration+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns ProductDescription
	 *     RDSPPComponent returns ProductDescription
	 *     ProductDescription returns ProductDescription
	 *
	 * Constraint:
	 *     (name=ID description=STRING?)
	 */
	protected void sequence_ProductDescription(ISerializationContext context, ProductDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns RDSPPMarking
	 *     RDSPPMarking returns RDSPPMarking
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             gemeinsameZuordnung=[CommonAssignment|ID]? 
	 *             funktionsbezogeneKennzeichnung=[FunctionalDesignation|ID]? 
	 *             funktionaleZuordnung=[FunctionalAssignment|ID]? 
	 *             einbauortkennzeichnung=[InstallationLocationDescription|ID] 
	 *             aufstellungsortkennzeichnung=[LocationDescription|ID] 
	 *             (
	 *                 (
	 *                     produktbezogenekennzeichnung=[ProductDescription|ID] 
	 *                     (
	 *                         (anschlusskennzeichnung=[ConnectionIdentification|ID] dokumentenkennzeichnung=[DocumentIdentification|ID]) | 
	 *                         dokumentenkennzeichnung=[DocumentIdentification|ID]
	 *                     )
	 *                 ) | 
	 *                 (
	 *                     (
	 *                         (produktbezogenekennzeichnung=[ProductDescription|ID] anschlusskennzeichnung=[ConnectionIdentification|ID]) | 
	 *                         anschlusskennzeichnung=[ConnectionIdentification|ID]
	 *                     )? 
	 *                     signalkennzeichnung=[SignalIdentification|ID] 
	 *                     dokumentenkennzeichnung=[DocumentIdentification|ID]
	 *                 ) | 
	 *                 (anschlusskennzeichnung=[ConnectionIdentification|ID] dokumentenkennzeichnung=[DocumentIdentification|ID]) | 
	 *                 dokumentenkennzeichnung=[DocumentIdentification|ID]
	 *             )
	 *         ) | 
	 *         (
	 *             gemeinsameZuordnung=[CommonAssignment|ID]? 
	 *             funktionsbezogeneKennzeichnung=[FunctionalDesignation|ID]? 
	 *             funktionaleZuordnung=[FunctionalAssignment|ID]? 
	 *             einbauortkennzeichnung=[InstallationLocationDescription|ID] 
	 *             produktbezogenekennzeichnung=[ProductDescription|ID] 
	 *             (
	 *                 (
	 *                     anschlusskennzeichnung=[ConnectionIdentification|ID] 
	 *                     signalkennzeichnung=[SignalIdentification|ID] 
	 *                     dokumentenkennzeichnung=[DocumentIdentification|ID]
	 *                 ) | 
	 *                 (anschlusskennzeichnung=[ConnectionIdentification|ID] dokumentenkennzeichnung=[DocumentIdentification|ID]) | 
	 *                 dokumentenkennzeichnung=[DocumentIdentification|ID]
	 *             )
	 *         ) | 
	 *         (
	 *             gemeinsameZuordnung=[CommonAssignment|ID]? 
	 *             funktionsbezogeneKennzeichnung=[FunctionalDesignation|ID]? 
	 *             funktionaleZuordnung=[FunctionalAssignment|ID]? 
	 *             einbauortkennzeichnung=[InstallationLocationDescription|ID] 
	 *             anschlusskennzeichnung=[ConnectionIdentification|ID] 
	 *             (
	 *                 (signalkennzeichnung=[SignalIdentification|ID] dokumentenkennzeichnung=[DocumentIdentification|ID]) | 
	 *                 dokumentenkennzeichnung=[DocumentIdentification|ID]
	 *             )
	 *         ) | 
	 *         (gemeinsameZuordnung=[CommonAssignment|ID]? dokumentenkennzeichnung=[DocumentIdentification|ID]) | 
	 *         (
	 *             gemeinsameZuordnung=[CommonAssignment|ID]? 
	 *             (
	 *                 (funktionsbezogeneKennzeichnung=[FunctionalDesignation|ID]? dokumentenkennzeichnung=[DocumentIdentification|ID]) | 
	 *                 (
	 *                     funktionsbezogeneKennzeichnung=[FunctionalDesignation|ID]? 
	 *                     (
	 *                         (funktionaleZuordnung=[FunctionalAssignment|ID]? dokumentenkennzeichnung=[DocumentIdentification|ID]) | 
	 *                         (
	 *                             funktionaleZuordnung=[FunctionalAssignment|ID]? 
	 *                             einbauortkennzeichnung=[InstallationLocationDescription|ID] 
	 *                             dokumentenkennzeichnung=[DocumentIdentification|ID]
	 *                         )
	 *                     )
	 *                 )
	 *             )
	 *         ) | 
	 *         (
	 *             (
	 *                 (gemeinsameZuordnung=[CommonAssignment|ID]? einbauortkennzeichnung=[InstallationLocationDescription|ID]) | 
	 *                 (
	 *                     gemeinsameZuordnung=[CommonAssignment|ID]? 
	 *                     (
	 *                         (funktionsbezogeneKennzeichnung=[FunctionalDesignation|ID]? einbauortkennzeichnung=[InstallationLocationDescription|ID]) | 
	 *                         (
	 *                             funktionsbezogeneKennzeichnung=[FunctionalDesignation|ID]? 
	 *                             funktionaleZuordnung=[FunctionalAssignment|ID]? 
	 *                             einbauortkennzeichnung=[InstallationLocationDescription|ID]
	 *                         )
	 *                     )
	 *                 ) | 
	 *                 einbauortkennzeichnung=[InstallationLocationDescription|ID]
	 *             )? 
	 *             signalkennzeichnung=[SignalIdentification|ID] 
	 *             dokumentenkennzeichnung=[DocumentIdentification|ID]
	 *         ) | 
	 *         dokumentenkennzeichnung=[DocumentIdentification|ID]
	 *     )?
	 */
	protected void sequence_RDSPPMarking(ISerializationContext context, RDSPPMarking semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns SignalIdentification
	 *     RDSPPComponent returns SignalIdentification
	 *     SignalIdentification returns SignalIdentification
	 *
	 * Constraint:
	 *     (name=ID description=STRING?)
	 */
	protected void sequence_SignalIdentification(ISerializationContext context, SignalIdentification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
