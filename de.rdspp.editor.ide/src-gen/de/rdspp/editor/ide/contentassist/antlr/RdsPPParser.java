/*
 * generated by Xtext 2.12.0
 */
package de.rdspp.editor.ide.contentassist.antlr;

import com.google.inject.Inject;
import de.rdspp.editor.ide.contentassist.antlr.internal.InternalRdsPPParser;
import de.rdspp.editor.services.RdsPPGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class RdsPPParser extends AbstractContentAssistParser {

	@Inject
	private RdsPPGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalRdsPPParser createParser() {
		InternalRdsPPParser result = new InternalRdsPPParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDeclarationAccess().getAlternatives(), "rule__Declaration__Alternatives");
					put(grammarAccess.getRDSPPComponentAccess().getAlternatives(), "rule__RDSPPComponent__Alternatives");
					put(grammarAccess.getRDSPPMarkingAccess().getGroup(), "rule__RDSPPMarking__Group__0");
					put(grammarAccess.getRDSPPMarkingAccess().getGroup_1(), "rule__RDSPPMarking__Group_1__0");
					put(grammarAccess.getRDSPPMarkingAccess().getGroup_2(), "rule__RDSPPMarking__Group_2__0");
					put(grammarAccess.getRDSPPMarkingAccess().getGroup_3(), "rule__RDSPPMarking__Group_3__0");
					put(grammarAccess.getRDSPPMarkingAccess().getGroup_4(), "rule__RDSPPMarking__Group_4__0");
					put(grammarAccess.getRDSPPMarkingAccess().getGroup_5(), "rule__RDSPPMarking__Group_5__0");
					put(grammarAccess.getRDSPPMarkingAccess().getGroup_6(), "rule__RDSPPMarking__Group_6__0");
					put(grammarAccess.getRDSPPMarkingAccess().getGroup_7(), "rule__RDSPPMarking__Group_7__0");
					put(grammarAccess.getRDSPPMarkingAccess().getGroup_8(), "rule__RDSPPMarking__Group_8__0");
					put(grammarAccess.getRDSPPMarkingAccess().getGroup_9(), "rule__RDSPPMarking__Group_9__0");
					put(grammarAccess.getSignalIdentificationAccess().getGroup(), "rule__SignalIdentification__Group__0");
					put(grammarAccess.getSignalIdentificationAccess().getGroup_3(), "rule__SignalIdentification__Group_3__0");
					put(grammarAccess.getDocumentIdentificationAccess().getGroup(), "rule__DocumentIdentification__Group__0");
					put(grammarAccess.getDocumentIdentificationAccess().getGroup_3(), "rule__DocumentIdentification__Group_3__0");
					put(grammarAccess.getFunctionalAssignmentAccess().getGroup(), "rule__FunctionalAssignment__Group__0");
					put(grammarAccess.getFunctionalAssignmentAccess().getGroup_3(), "rule__FunctionalAssignment__Group_3__0");
					put(grammarAccess.getFunctionalDesignationAccess().getGroup(), "rule__FunctionalDesignation__Group__0");
					put(grammarAccess.getFunctionalDesignationAccess().getGroup_3(), "rule__FunctionalDesignation__Group_3__0");
					put(grammarAccess.getInstallationLocationDescriptionAccess().getGroup(), "rule__InstallationLocationDescription__Group__0");
					put(grammarAccess.getInstallationLocationDescriptionAccess().getGroup_3(), "rule__InstallationLocationDescription__Group_3__0");
					put(grammarAccess.getLocationDescriptionAccess().getGroup(), "rule__LocationDescription__Group__0");
					put(grammarAccess.getLocationDescriptionAccess().getGroup_3(), "rule__LocationDescription__Group_3__0");
					put(grammarAccess.getConnectionIdentificationAccess().getGroup(), "rule__ConnectionIdentification__Group__0");
					put(grammarAccess.getConnectionIdentificationAccess().getGroup_3(), "rule__ConnectionIdentification__Group_3__0");
					put(grammarAccess.getCommonAssignmentAccess().getGroup(), "rule__CommonAssignment__Group__0");
					put(grammarAccess.getCommonAssignmentAccess().getGroup_3(), "rule__CommonAssignment__Group_3__0");
					put(grammarAccess.getProductDescriptionAccess().getGroup(), "rule__ProductDescription__Group__0");
					put(grammarAccess.getProductDescriptionAccess().getGroup_3(), "rule__ProductDescription__Group_3__0");
					put(grammarAccess.getModelAccess().getDeclarationsAssignment(), "rule__Model__DeclarationsAssignment");
					put(grammarAccess.getRDSPPMarkingAccess().getGemeinsameZuordnungAssignment_1_1(), "rule__RDSPPMarking__GemeinsameZuordnungAssignment_1_1");
					put(grammarAccess.getRDSPPMarkingAccess().getFunktionsbezogeneKennzeichnungAssignment_2_1(), "rule__RDSPPMarking__FunktionsbezogeneKennzeichnungAssignment_2_1");
					put(grammarAccess.getRDSPPMarkingAccess().getFunktionaleZuordnungAssignment_3_1(), "rule__RDSPPMarking__FunktionaleZuordnungAssignment_3_1");
					put(grammarAccess.getRDSPPMarkingAccess().getEinbauortkennzeichnungAssignment_4_1(), "rule__RDSPPMarking__EinbauortkennzeichnungAssignment_4_1");
					put(grammarAccess.getRDSPPMarkingAccess().getAufstellungsortkennzeichnungAssignment_5_1(), "rule__RDSPPMarking__AufstellungsortkennzeichnungAssignment_5_1");
					put(grammarAccess.getRDSPPMarkingAccess().getProduktbezogenekennzeichnungAssignment_6_1(), "rule__RDSPPMarking__ProduktbezogenekennzeichnungAssignment_6_1");
					put(grammarAccess.getRDSPPMarkingAccess().getAnschlusskennzeichnungAssignment_7_1(), "rule__RDSPPMarking__AnschlusskennzeichnungAssignment_7_1");
					put(grammarAccess.getRDSPPMarkingAccess().getSignalkennzeichnungAssignment_8_1(), "rule__RDSPPMarking__SignalkennzeichnungAssignment_8_1");
					put(grammarAccess.getRDSPPMarkingAccess().getDokumentenkennzeichnungAssignment_9_1(), "rule__RDSPPMarking__DokumentenkennzeichnungAssignment_9_1");
					put(grammarAccess.getSignalIdentificationAccess().getNameAssignment_2(), "rule__SignalIdentification__NameAssignment_2");
					put(grammarAccess.getSignalIdentificationAccess().getDescriptionAssignment_3_1(), "rule__SignalIdentification__DescriptionAssignment_3_1");
					put(grammarAccess.getDocumentIdentificationAccess().getNameAssignment_2(), "rule__DocumentIdentification__NameAssignment_2");
					put(grammarAccess.getDocumentIdentificationAccess().getDescriptionAssignment_3_1(), "rule__DocumentIdentification__DescriptionAssignment_3_1");
					put(grammarAccess.getFunctionalAssignmentAccess().getNameAssignment_2(), "rule__FunctionalAssignment__NameAssignment_2");
					put(grammarAccess.getFunctionalAssignmentAccess().getDescriptionAssignment_3_1(), "rule__FunctionalAssignment__DescriptionAssignment_3_1");
					put(grammarAccess.getFunctionalDesignationAccess().getNameAssignment_2(), "rule__FunctionalDesignation__NameAssignment_2");
					put(grammarAccess.getFunctionalDesignationAccess().getDescriptionAssignment_3_1(), "rule__FunctionalDesignation__DescriptionAssignment_3_1");
					put(grammarAccess.getInstallationLocationDescriptionAccess().getNameAssignment_2(), "rule__InstallationLocationDescription__NameAssignment_2");
					put(grammarAccess.getInstallationLocationDescriptionAccess().getDescriptionAssignment_3_1(), "rule__InstallationLocationDescription__DescriptionAssignment_3_1");
					put(grammarAccess.getLocationDescriptionAccess().getNameAssignment_2(), "rule__LocationDescription__NameAssignment_2");
					put(grammarAccess.getLocationDescriptionAccess().getDescriptionAssignment_3_1(), "rule__LocationDescription__DescriptionAssignment_3_1");
					put(grammarAccess.getConnectionIdentificationAccess().getNameAssignment_2(), "rule__ConnectionIdentification__NameAssignment_2");
					put(grammarAccess.getConnectionIdentificationAccess().getDescriptionAssignment_3_1(), "rule__ConnectionIdentification__DescriptionAssignment_3_1");
					put(grammarAccess.getCommonAssignmentAccess().getNameAssignment_2(), "rule__CommonAssignment__NameAssignment_2");
					put(grammarAccess.getCommonAssignmentAccess().getDescriptionAssignment_3_1(), "rule__CommonAssignment__DescriptionAssignment_3_1");
					put(grammarAccess.getProductDescriptionAccess().getNameAssignment_2(), "rule__ProductDescription__NameAssignment_2");
					put(grammarAccess.getProductDescriptionAccess().getDescriptionAssignment_3_1(), "rule__ProductDescription__DescriptionAssignment_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public RdsPPGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RdsPPGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
