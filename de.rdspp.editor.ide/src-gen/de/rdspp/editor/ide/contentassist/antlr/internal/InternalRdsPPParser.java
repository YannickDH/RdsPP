package de.rdspp.editor.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.rdspp.editor.services.RdsPPGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRdsPPParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RDS-PPKENNZEICHNUNG'", "'#'", "'='", "'=='", "'+'", "'++'", "'-'", "':'", "';'", "'&'", "'SIGNALKENNZEICHNUNG'", "'->'", "'DOKUMENTENKENNZEICHNUNG'", "'FUNKTIONALEZUORDNUNG'", "'FUNKTIONSBEZOGENEKENNZEICHNUNG'", "'EINBAUORTKENNZEICHNUNG'", "'AUFSTELLUNGSORTKENNZEICHNUNG'", "'ANSCHLUSSKENNZEICHNUNG'", "'GEMEINSAMEZUORDNUNG'", "'PRODUKTBEZOGENEKENNZEICHNUNG'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRdsPPParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRdsPPParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRdsPPParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRdsPP.g"; }


    	private RdsPPGrammarAccess grammarAccess;

    	public void setGrammarAccess(RdsPPGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalRdsPP.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalRdsPP.g:54:1: ( ruleModel EOF )
            // InternalRdsPP.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRdsPP.g:62:1: ruleModel : ( ( rule__Model__DeclarationsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:66:2: ( ( ( rule__Model__DeclarationsAssignment )* ) )
            // InternalRdsPP.g:67:2: ( ( rule__Model__DeclarationsAssignment )* )
            {
            // InternalRdsPP.g:67:2: ( ( rule__Model__DeclarationsAssignment )* )
            // InternalRdsPP.g:68:3: ( rule__Model__DeclarationsAssignment )*
            {
             before(grammarAccess.getModelAccess().getDeclarationsAssignment()); 
            // InternalRdsPP.g:69:3: ( rule__Model__DeclarationsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==21||(LA1_0>=23 && LA1_0<=30)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRdsPP.g:69:4: rule__Model__DeclarationsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__DeclarationsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDeclarationsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDeclaration"
    // InternalRdsPP.g:78:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalRdsPP.g:79:1: ( ruleDeclaration EOF )
            // InternalRdsPP.g:80:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalRdsPP.g:87:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:91:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // InternalRdsPP.g:92:2: ( ( rule__Declaration__Alternatives ) )
            {
            // InternalRdsPP.g:92:2: ( ( rule__Declaration__Alternatives ) )
            // InternalRdsPP.g:93:3: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // InternalRdsPP.g:94:3: ( rule__Declaration__Alternatives )
            // InternalRdsPP.g:94:4: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleRDSPPMarking"
    // InternalRdsPP.g:103:1: entryRuleRDSPPMarking : ruleRDSPPMarking EOF ;
    public final void entryRuleRDSPPMarking() throws RecognitionException {
        try {
            // InternalRdsPP.g:104:1: ( ruleRDSPPMarking EOF )
            // InternalRdsPP.g:105:1: ruleRDSPPMarking EOF
            {
             before(grammarAccess.getRDSPPMarkingRule()); 
            pushFollow(FOLLOW_1);
            ruleRDSPPMarking();

            state._fsp--;

             after(grammarAccess.getRDSPPMarkingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRDSPPMarking"


    // $ANTLR start "ruleRDSPPMarking"
    // InternalRdsPP.g:112:1: ruleRDSPPMarking : ( ( rule__RDSPPMarking__Group__0 ) ) ;
    public final void ruleRDSPPMarking() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:116:2: ( ( ( rule__RDSPPMarking__Group__0 ) ) )
            // InternalRdsPP.g:117:2: ( ( rule__RDSPPMarking__Group__0 ) )
            {
            // InternalRdsPP.g:117:2: ( ( rule__RDSPPMarking__Group__0 ) )
            // InternalRdsPP.g:118:3: ( rule__RDSPPMarking__Group__0 )
            {
             before(grammarAccess.getRDSPPMarkingAccess().getGroup()); 
            // InternalRdsPP.g:119:3: ( rule__RDSPPMarking__Group__0 )
            // InternalRdsPP.g:119:4: rule__RDSPPMarking__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRDSPPMarkingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRDSPPMarking"


    // $ANTLR start "entryRuleRDSPPComponent"
    // InternalRdsPP.g:128:1: entryRuleRDSPPComponent : ruleRDSPPComponent EOF ;
    public final void entryRuleRDSPPComponent() throws RecognitionException {
        try {
            // InternalRdsPP.g:129:1: ( ruleRDSPPComponent EOF )
            // InternalRdsPP.g:130:1: ruleRDSPPComponent EOF
            {
             before(grammarAccess.getRDSPPComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleRDSPPComponent();

            state._fsp--;

             after(grammarAccess.getRDSPPComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRDSPPComponent"


    // $ANTLR start "ruleRDSPPComponent"
    // InternalRdsPP.g:137:1: ruleRDSPPComponent : ( ( rule__RDSPPComponent__Alternatives ) ) ;
    public final void ruleRDSPPComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:141:2: ( ( ( rule__RDSPPComponent__Alternatives ) ) )
            // InternalRdsPP.g:142:2: ( ( rule__RDSPPComponent__Alternatives ) )
            {
            // InternalRdsPP.g:142:2: ( ( rule__RDSPPComponent__Alternatives ) )
            // InternalRdsPP.g:143:3: ( rule__RDSPPComponent__Alternatives )
            {
             before(grammarAccess.getRDSPPComponentAccess().getAlternatives()); 
            // InternalRdsPP.g:144:3: ( rule__RDSPPComponent__Alternatives )
            // InternalRdsPP.g:144:4: rule__RDSPPComponent__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RDSPPComponent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRDSPPComponentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRDSPPComponent"


    // $ANTLR start "entryRuleSignalIdentification"
    // InternalRdsPP.g:153:1: entryRuleSignalIdentification : ruleSignalIdentification EOF ;
    public final void entryRuleSignalIdentification() throws RecognitionException {
        try {
            // InternalRdsPP.g:154:1: ( ruleSignalIdentification EOF )
            // InternalRdsPP.g:155:1: ruleSignalIdentification EOF
            {
             before(grammarAccess.getSignalIdentificationRule()); 
            pushFollow(FOLLOW_1);
            ruleSignalIdentification();

            state._fsp--;

             after(grammarAccess.getSignalIdentificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSignalIdentification"


    // $ANTLR start "ruleSignalIdentification"
    // InternalRdsPP.g:162:1: ruleSignalIdentification : ( ( rule__SignalIdentification__Group__0 ) ) ;
    public final void ruleSignalIdentification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:166:2: ( ( ( rule__SignalIdentification__Group__0 ) ) )
            // InternalRdsPP.g:167:2: ( ( rule__SignalIdentification__Group__0 ) )
            {
            // InternalRdsPP.g:167:2: ( ( rule__SignalIdentification__Group__0 ) )
            // InternalRdsPP.g:168:3: ( rule__SignalIdentification__Group__0 )
            {
             before(grammarAccess.getSignalIdentificationAccess().getGroup()); 
            // InternalRdsPP.g:169:3: ( rule__SignalIdentification__Group__0 )
            // InternalRdsPP.g:169:4: rule__SignalIdentification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SignalIdentification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignalIdentificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignalIdentification"


    // $ANTLR start "entryRuleDocumentIdentification"
    // InternalRdsPP.g:178:1: entryRuleDocumentIdentification : ruleDocumentIdentification EOF ;
    public final void entryRuleDocumentIdentification() throws RecognitionException {
        try {
            // InternalRdsPP.g:179:1: ( ruleDocumentIdentification EOF )
            // InternalRdsPP.g:180:1: ruleDocumentIdentification EOF
            {
             before(grammarAccess.getDocumentIdentificationRule()); 
            pushFollow(FOLLOW_1);
            ruleDocumentIdentification();

            state._fsp--;

             after(grammarAccess.getDocumentIdentificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDocumentIdentification"


    // $ANTLR start "ruleDocumentIdentification"
    // InternalRdsPP.g:187:1: ruleDocumentIdentification : ( ( rule__DocumentIdentification__Group__0 ) ) ;
    public final void ruleDocumentIdentification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:191:2: ( ( ( rule__DocumentIdentification__Group__0 ) ) )
            // InternalRdsPP.g:192:2: ( ( rule__DocumentIdentification__Group__0 ) )
            {
            // InternalRdsPP.g:192:2: ( ( rule__DocumentIdentification__Group__0 ) )
            // InternalRdsPP.g:193:3: ( rule__DocumentIdentification__Group__0 )
            {
             before(grammarAccess.getDocumentIdentificationAccess().getGroup()); 
            // InternalRdsPP.g:194:3: ( rule__DocumentIdentification__Group__0 )
            // InternalRdsPP.g:194:4: rule__DocumentIdentification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DocumentIdentification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocumentIdentificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocumentIdentification"


    // $ANTLR start "entryRuleFunctionalAssignment"
    // InternalRdsPP.g:203:1: entryRuleFunctionalAssignment : ruleFunctionalAssignment EOF ;
    public final void entryRuleFunctionalAssignment() throws RecognitionException {
        try {
            // InternalRdsPP.g:204:1: ( ruleFunctionalAssignment EOF )
            // InternalRdsPP.g:205:1: ruleFunctionalAssignment EOF
            {
             before(grammarAccess.getFunctionalAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionalAssignment();

            state._fsp--;

             after(grammarAccess.getFunctionalAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionalAssignment"


    // $ANTLR start "ruleFunctionalAssignment"
    // InternalRdsPP.g:212:1: ruleFunctionalAssignment : ( ( rule__FunctionalAssignment__Group__0 ) ) ;
    public final void ruleFunctionalAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:216:2: ( ( ( rule__FunctionalAssignment__Group__0 ) ) )
            // InternalRdsPP.g:217:2: ( ( rule__FunctionalAssignment__Group__0 ) )
            {
            // InternalRdsPP.g:217:2: ( ( rule__FunctionalAssignment__Group__0 ) )
            // InternalRdsPP.g:218:3: ( rule__FunctionalAssignment__Group__0 )
            {
             before(grammarAccess.getFunctionalAssignmentAccess().getGroup()); 
            // InternalRdsPP.g:219:3: ( rule__FunctionalAssignment__Group__0 )
            // InternalRdsPP.g:219:4: rule__FunctionalAssignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionalAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionalAssignment"


    // $ANTLR start "entryRuleFunctionalDesignation"
    // InternalRdsPP.g:228:1: entryRuleFunctionalDesignation : ruleFunctionalDesignation EOF ;
    public final void entryRuleFunctionalDesignation() throws RecognitionException {
        try {
            // InternalRdsPP.g:229:1: ( ruleFunctionalDesignation EOF )
            // InternalRdsPP.g:230:1: ruleFunctionalDesignation EOF
            {
             before(grammarAccess.getFunctionalDesignationRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionalDesignation();

            state._fsp--;

             after(grammarAccess.getFunctionalDesignationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionalDesignation"


    // $ANTLR start "ruleFunctionalDesignation"
    // InternalRdsPP.g:237:1: ruleFunctionalDesignation : ( ( rule__FunctionalDesignation__Group__0 ) ) ;
    public final void ruleFunctionalDesignation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:241:2: ( ( ( rule__FunctionalDesignation__Group__0 ) ) )
            // InternalRdsPP.g:242:2: ( ( rule__FunctionalDesignation__Group__0 ) )
            {
            // InternalRdsPP.g:242:2: ( ( rule__FunctionalDesignation__Group__0 ) )
            // InternalRdsPP.g:243:3: ( rule__FunctionalDesignation__Group__0 )
            {
             before(grammarAccess.getFunctionalDesignationAccess().getGroup()); 
            // InternalRdsPP.g:244:3: ( rule__FunctionalDesignation__Group__0 )
            // InternalRdsPP.g:244:4: rule__FunctionalDesignation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionalDesignation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalDesignationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionalDesignation"


    // $ANTLR start "entryRuleInstallationLocationDescription"
    // InternalRdsPP.g:253:1: entryRuleInstallationLocationDescription : ruleInstallationLocationDescription EOF ;
    public final void entryRuleInstallationLocationDescription() throws RecognitionException {
        try {
            // InternalRdsPP.g:254:1: ( ruleInstallationLocationDescription EOF )
            // InternalRdsPP.g:255:1: ruleInstallationLocationDescription EOF
            {
             before(grammarAccess.getInstallationLocationDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleInstallationLocationDescription();

            state._fsp--;

             after(grammarAccess.getInstallationLocationDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstallationLocationDescription"


    // $ANTLR start "ruleInstallationLocationDescription"
    // InternalRdsPP.g:262:1: ruleInstallationLocationDescription : ( ( rule__InstallationLocationDescription__Group__0 ) ) ;
    public final void ruleInstallationLocationDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:266:2: ( ( ( rule__InstallationLocationDescription__Group__0 ) ) )
            // InternalRdsPP.g:267:2: ( ( rule__InstallationLocationDescription__Group__0 ) )
            {
            // InternalRdsPP.g:267:2: ( ( rule__InstallationLocationDescription__Group__0 ) )
            // InternalRdsPP.g:268:3: ( rule__InstallationLocationDescription__Group__0 )
            {
             before(grammarAccess.getInstallationLocationDescriptionAccess().getGroup()); 
            // InternalRdsPP.g:269:3: ( rule__InstallationLocationDescription__Group__0 )
            // InternalRdsPP.g:269:4: rule__InstallationLocationDescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InstallationLocationDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstallationLocationDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstallationLocationDescription"


    // $ANTLR start "entryRuleLocationDescription"
    // InternalRdsPP.g:278:1: entryRuleLocationDescription : ruleLocationDescription EOF ;
    public final void entryRuleLocationDescription() throws RecognitionException {
        try {
            // InternalRdsPP.g:279:1: ( ruleLocationDescription EOF )
            // InternalRdsPP.g:280:1: ruleLocationDescription EOF
            {
             before(grammarAccess.getLocationDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleLocationDescription();

            state._fsp--;

             after(grammarAccess.getLocationDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocationDescription"


    // $ANTLR start "ruleLocationDescription"
    // InternalRdsPP.g:287:1: ruleLocationDescription : ( ( rule__LocationDescription__Group__0 ) ) ;
    public final void ruleLocationDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:291:2: ( ( ( rule__LocationDescription__Group__0 ) ) )
            // InternalRdsPP.g:292:2: ( ( rule__LocationDescription__Group__0 ) )
            {
            // InternalRdsPP.g:292:2: ( ( rule__LocationDescription__Group__0 ) )
            // InternalRdsPP.g:293:3: ( rule__LocationDescription__Group__0 )
            {
             before(grammarAccess.getLocationDescriptionAccess().getGroup()); 
            // InternalRdsPP.g:294:3: ( rule__LocationDescription__Group__0 )
            // InternalRdsPP.g:294:4: rule__LocationDescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LocationDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocationDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocationDescription"


    // $ANTLR start "entryRuleConnectionIdentification"
    // InternalRdsPP.g:303:1: entryRuleConnectionIdentification : ruleConnectionIdentification EOF ;
    public final void entryRuleConnectionIdentification() throws RecognitionException {
        try {
            // InternalRdsPP.g:304:1: ( ruleConnectionIdentification EOF )
            // InternalRdsPP.g:305:1: ruleConnectionIdentification EOF
            {
             before(grammarAccess.getConnectionIdentificationRule()); 
            pushFollow(FOLLOW_1);
            ruleConnectionIdentification();

            state._fsp--;

             after(grammarAccess.getConnectionIdentificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConnectionIdentification"


    // $ANTLR start "ruleConnectionIdentification"
    // InternalRdsPP.g:312:1: ruleConnectionIdentification : ( ( rule__ConnectionIdentification__Group__0 ) ) ;
    public final void ruleConnectionIdentification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:316:2: ( ( ( rule__ConnectionIdentification__Group__0 ) ) )
            // InternalRdsPP.g:317:2: ( ( rule__ConnectionIdentification__Group__0 ) )
            {
            // InternalRdsPP.g:317:2: ( ( rule__ConnectionIdentification__Group__0 ) )
            // InternalRdsPP.g:318:3: ( rule__ConnectionIdentification__Group__0 )
            {
             before(grammarAccess.getConnectionIdentificationAccess().getGroup()); 
            // InternalRdsPP.g:319:3: ( rule__ConnectionIdentification__Group__0 )
            // InternalRdsPP.g:319:4: rule__ConnectionIdentification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionIdentification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectionIdentificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnectionIdentification"


    // $ANTLR start "entryRuleCommonAssignment"
    // InternalRdsPP.g:328:1: entryRuleCommonAssignment : ruleCommonAssignment EOF ;
    public final void entryRuleCommonAssignment() throws RecognitionException {
        try {
            // InternalRdsPP.g:329:1: ( ruleCommonAssignment EOF )
            // InternalRdsPP.g:330:1: ruleCommonAssignment EOF
            {
             before(grammarAccess.getCommonAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleCommonAssignment();

            state._fsp--;

             after(grammarAccess.getCommonAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommonAssignment"


    // $ANTLR start "ruleCommonAssignment"
    // InternalRdsPP.g:337:1: ruleCommonAssignment : ( ( rule__CommonAssignment__Group__0 ) ) ;
    public final void ruleCommonAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:341:2: ( ( ( rule__CommonAssignment__Group__0 ) ) )
            // InternalRdsPP.g:342:2: ( ( rule__CommonAssignment__Group__0 ) )
            {
            // InternalRdsPP.g:342:2: ( ( rule__CommonAssignment__Group__0 ) )
            // InternalRdsPP.g:343:3: ( rule__CommonAssignment__Group__0 )
            {
             before(grammarAccess.getCommonAssignmentAccess().getGroup()); 
            // InternalRdsPP.g:344:3: ( rule__CommonAssignment__Group__0 )
            // InternalRdsPP.g:344:4: rule__CommonAssignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CommonAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommonAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommonAssignment"


    // $ANTLR start "entryRuleProductDescription"
    // InternalRdsPP.g:353:1: entryRuleProductDescription : ruleProductDescription EOF ;
    public final void entryRuleProductDescription() throws RecognitionException {
        try {
            // InternalRdsPP.g:354:1: ( ruleProductDescription EOF )
            // InternalRdsPP.g:355:1: ruleProductDescription EOF
            {
             before(grammarAccess.getProductDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleProductDescription();

            state._fsp--;

             after(grammarAccess.getProductDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProductDescription"


    // $ANTLR start "ruleProductDescription"
    // InternalRdsPP.g:362:1: ruleProductDescription : ( ( rule__ProductDescription__Group__0 ) ) ;
    public final void ruleProductDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:366:2: ( ( ( rule__ProductDescription__Group__0 ) ) )
            // InternalRdsPP.g:367:2: ( ( rule__ProductDescription__Group__0 ) )
            {
            // InternalRdsPP.g:367:2: ( ( rule__ProductDescription__Group__0 ) )
            // InternalRdsPP.g:368:3: ( rule__ProductDescription__Group__0 )
            {
             before(grammarAccess.getProductDescriptionAccess().getGroup()); 
            // InternalRdsPP.g:369:3: ( rule__ProductDescription__Group__0 )
            // InternalRdsPP.g:369:4: rule__ProductDescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProductDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProductDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProductDescription"


    // $ANTLR start "rule__Declaration__Alternatives"
    // InternalRdsPP.g:377:1: rule__Declaration__Alternatives : ( ( ruleRDSPPComponent ) | ( ruleRDSPPMarking ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:381:1: ( ( ruleRDSPPComponent ) | ( ruleRDSPPMarking ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21||(LA2_0>=23 && LA2_0<=30)) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRdsPP.g:382:2: ( ruleRDSPPComponent )
                    {
                    // InternalRdsPP.g:382:2: ( ruleRDSPPComponent )
                    // InternalRdsPP.g:383:3: ruleRDSPPComponent
                    {
                     before(grammarAccess.getDeclarationAccess().getRDSPPComponentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRDSPPComponent();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getRDSPPComponentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRdsPP.g:388:2: ( ruleRDSPPMarking )
                    {
                    // InternalRdsPP.g:388:2: ( ruleRDSPPMarking )
                    // InternalRdsPP.g:389:3: ruleRDSPPMarking
                    {
                     before(grammarAccess.getDeclarationAccess().getRDSPPMarkingParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRDSPPMarking();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getRDSPPMarkingParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Alternatives"


    // $ANTLR start "rule__RDSPPComponent__Alternatives"
    // InternalRdsPP.g:398:1: rule__RDSPPComponent__Alternatives : ( ( ruleCommonAssignment ) | ( ruleLocationDescription ) | ( ruleInstallationLocationDescription ) | ( ruleFunctionalAssignment ) | ( ruleFunctionalDesignation ) | ( ruleProductDescription ) | ( ruleConnectionIdentification ) | ( ruleDocumentIdentification ) | ( ruleSignalIdentification ) );
    public final void rule__RDSPPComponent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:402:1: ( ( ruleCommonAssignment ) | ( ruleLocationDescription ) | ( ruleInstallationLocationDescription ) | ( ruleFunctionalAssignment ) | ( ruleFunctionalDesignation ) | ( ruleProductDescription ) | ( ruleConnectionIdentification ) | ( ruleDocumentIdentification ) | ( ruleSignalIdentification ) )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt3=1;
                }
                break;
            case 27:
                {
                alt3=2;
                }
                break;
            case 26:
                {
                alt3=3;
                }
                break;
            case 24:
                {
                alt3=4;
                }
                break;
            case 25:
                {
                alt3=5;
                }
                break;
            case 30:
                {
                alt3=6;
                }
                break;
            case 28:
                {
                alt3=7;
                }
                break;
            case 23:
                {
                alt3=8;
                }
                break;
            case 21:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRdsPP.g:403:2: ( ruleCommonAssignment )
                    {
                    // InternalRdsPP.g:403:2: ( ruleCommonAssignment )
                    // InternalRdsPP.g:404:3: ruleCommonAssignment
                    {
                     before(grammarAccess.getRDSPPComponentAccess().getCommonAssignmentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCommonAssignment();

                    state._fsp--;

                     after(grammarAccess.getRDSPPComponentAccess().getCommonAssignmentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRdsPP.g:409:2: ( ruleLocationDescription )
                    {
                    // InternalRdsPP.g:409:2: ( ruleLocationDescription )
                    // InternalRdsPP.g:410:3: ruleLocationDescription
                    {
                     before(grammarAccess.getRDSPPComponentAccess().getLocationDescriptionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLocationDescription();

                    state._fsp--;

                     after(grammarAccess.getRDSPPComponentAccess().getLocationDescriptionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRdsPP.g:415:2: ( ruleInstallationLocationDescription )
                    {
                    // InternalRdsPP.g:415:2: ( ruleInstallationLocationDescription )
                    // InternalRdsPP.g:416:3: ruleInstallationLocationDescription
                    {
                     before(grammarAccess.getRDSPPComponentAccess().getInstallationLocationDescriptionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInstallationLocationDescription();

                    state._fsp--;

                     after(grammarAccess.getRDSPPComponentAccess().getInstallationLocationDescriptionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRdsPP.g:421:2: ( ruleFunctionalAssignment )
                    {
                    // InternalRdsPP.g:421:2: ( ruleFunctionalAssignment )
                    // InternalRdsPP.g:422:3: ruleFunctionalAssignment
                    {
                     before(grammarAccess.getRDSPPComponentAccess().getFunctionalAssignmentParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionalAssignment();

                    state._fsp--;

                     after(grammarAccess.getRDSPPComponentAccess().getFunctionalAssignmentParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRdsPP.g:427:2: ( ruleFunctionalDesignation )
                    {
                    // InternalRdsPP.g:427:2: ( ruleFunctionalDesignation )
                    // InternalRdsPP.g:428:3: ruleFunctionalDesignation
                    {
                     before(grammarAccess.getRDSPPComponentAccess().getFunctionalDesignationParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionalDesignation();

                    state._fsp--;

                     after(grammarAccess.getRDSPPComponentAccess().getFunctionalDesignationParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRdsPP.g:433:2: ( ruleProductDescription )
                    {
                    // InternalRdsPP.g:433:2: ( ruleProductDescription )
                    // InternalRdsPP.g:434:3: ruleProductDescription
                    {
                     before(grammarAccess.getRDSPPComponentAccess().getProductDescriptionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleProductDescription();

                    state._fsp--;

                     after(grammarAccess.getRDSPPComponentAccess().getProductDescriptionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRdsPP.g:439:2: ( ruleConnectionIdentification )
                    {
                    // InternalRdsPP.g:439:2: ( ruleConnectionIdentification )
                    // InternalRdsPP.g:440:3: ruleConnectionIdentification
                    {
                     before(grammarAccess.getRDSPPComponentAccess().getConnectionIdentificationParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleConnectionIdentification();

                    state._fsp--;

                     after(grammarAccess.getRDSPPComponentAccess().getConnectionIdentificationParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRdsPP.g:445:2: ( ruleDocumentIdentification )
                    {
                    // InternalRdsPP.g:445:2: ( ruleDocumentIdentification )
                    // InternalRdsPP.g:446:3: ruleDocumentIdentification
                    {
                     before(grammarAccess.getRDSPPComponentAccess().getDocumentIdentificationParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleDocumentIdentification();

                    state._fsp--;

                     after(grammarAccess.getRDSPPComponentAccess().getDocumentIdentificationParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalRdsPP.g:451:2: ( ruleSignalIdentification )
                    {
                    // InternalRdsPP.g:451:2: ( ruleSignalIdentification )
                    // InternalRdsPP.g:452:3: ruleSignalIdentification
                    {
                     before(grammarAccess.getRDSPPComponentAccess().getSignalIdentificationParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleSignalIdentification();

                    state._fsp--;

                     after(grammarAccess.getRDSPPComponentAccess().getSignalIdentificationParserRuleCall_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPComponent__Alternatives"


    // $ANTLR start "rule__RDSPPMarking__Group__0"
    // InternalRdsPP.g:461:1: rule__RDSPPMarking__Group__0 : rule__RDSPPMarking__Group__0__Impl rule__RDSPPMarking__Group__1 ;
    public final void rule__RDSPPMarking__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:465:1: ( rule__RDSPPMarking__Group__0__Impl rule__RDSPPMarking__Group__1 )
            // InternalRdsPP.g:466:2: rule__RDSPPMarking__Group__0__Impl rule__RDSPPMarking__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RDSPPMarking__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group__0"


    // $ANTLR start "rule__RDSPPMarking__Group__0__Impl"
    // InternalRdsPP.g:473:1: rule__RDSPPMarking__Group__0__Impl : ( 'RDS-PPKENNZEICHNUNG' ) ;
    public final void rule__RDSPPMarking__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:477:1: ( ( 'RDS-PPKENNZEICHNUNG' ) )
            // InternalRdsPP.g:478:1: ( 'RDS-PPKENNZEICHNUNG' )
            {
            // InternalRdsPP.g:478:1: ( 'RDS-PPKENNZEICHNUNG' )
            // InternalRdsPP.g:479:2: 'RDS-PPKENNZEICHNUNG'
            {
             before(grammarAccess.getRDSPPMarkingAccess().getRDSPPKENNZEICHNUNGKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRDSPPMarkingAccess().getRDSPPKENNZEICHNUNGKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group__0__Impl"


    // $ANTLR start "rule__RDSPPMarking__Group__1"
    // InternalRdsPP.g:488:1: rule__RDSPPMarking__Group__1 : rule__RDSPPMarking__Group__1__Impl rule__RDSPPMarking__Group__2 ;
    public final void rule__RDSPPMarking__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:492:1: ( rule__RDSPPMarking__Group__1__Impl rule__RDSPPMarking__Group__2 )
            // InternalRdsPP.g:493:2: rule__RDSPPMarking__Group__1__Impl rule__RDSPPMarking__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RDSPPMarking__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group__1"


    // $ANTLR start "rule__RDSPPMarking__Group__1__Impl"
    // InternalRdsPP.g:500:1: rule__RDSPPMarking__Group__1__Impl : ( ( rule__RDSPPMarking__Group_1__0 )? ) ;
    public final void rule__RDSPPMarking__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:504:1: ( ( ( rule__RDSPPMarking__Group_1__0 )? ) )
            // InternalRdsPP.g:505:1: ( ( rule__RDSPPMarking__Group_1__0 )? )
            {
            // InternalRdsPP.g:505:1: ( ( rule__RDSPPMarking__Group_1__0 )? )
            // InternalRdsPP.g:506:2: ( rule__RDSPPMarking__Group_1__0 )?
            {
             before(grammarAccess.getRDSPPMarkingAccess().getGroup_1()); 
            // InternalRdsPP.g:507:2: ( rule__RDSPPMarking__Group_1__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRdsPP.g:507:3: rule__RDSPPMarking__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RDSPPMarking__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRDSPPMarkingAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group__1__Impl"


    // $ANTLR start "rule__RDSPPMarking__Group__2"
    // InternalRdsPP.g:515:1: rule__RDSPPMarking__Group__2 : rule__RDSPPMarking__Group__2__Impl rule__RDSPPMarking__Group__3 ;
    public final void rule__RDSPPMarking__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:519:1: ( rule__RDSPPMarking__Group__2__Impl rule__RDSPPMarking__Group__3 )
            // InternalRdsPP.g:520:2: rule__RDSPPMarking__Group__2__Impl rule__RDSPPMarking__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__RDSPPMarking__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group__2"


    // $ANTLR start "rule__RDSPPMarking__Group__2__Impl"
    // InternalRdsPP.g:527:1: rule__RDSPPMarking__Group__2__Impl : ( ( rule__RDSPPMarking__Group_2__0 )? ) ;
    public final void rule__RDSPPMarking__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:531:1: ( ( ( rule__RDSPPMarking__Group_2__0 )? ) )
            // InternalRdsPP.g:532:1: ( ( rule__RDSPPMarking__Group_2__0 )? )
            {
            // InternalRdsPP.g:532:1: ( ( rule__RDSPPMarking__Group_2__0 )? )
            // InternalRdsPP.g:533:2: ( rule__RDSPPMarking__Group_2__0 )?
            {
             before(grammarAccess.getRDSPPMarkingAccess().getGroup_2()); 
            // InternalRdsPP.g:534:2: ( rule__RDSPPMarking__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRdsPP.g:534:3: rule__RDSPPMarking__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RDSPPMarking__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRDSPPMarkingAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group__2__Impl"


    // $ANTLR start "rule__RDSPPMarking__Group__3"
    // InternalRdsPP.g:542:1: rule__RDSPPMarking__Group__3 : rule__RDSPPMarking__Group__3__Impl rule__RDSPPMarking__Group__4 ;
    public final void rule__RDSPPMarking__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:546:1: ( rule__RDSPPMarking__Group__3__Impl rule__RDSPPMarking__Group__4 )
            // InternalRdsPP.g:547:2: rule__RDSPPMarking__Group__3__Impl rule__RDSPPMarking__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__RDSPPMarking__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group__3"


    // $ANTLR start "rule__RDSPPMarking__Group__3__Impl"
    // InternalRdsPP.g:554:1: rule__RDSPPMarking__Group__3__Impl : ( ( rule__RDSPPMarking__Group_3__0 )? ) ;
    public final void rule__RDSPPMarking__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:558:1: ( ( ( rule__RDSPPMarking__Group_3__0 )? ) )
            // InternalRdsPP.g:559:1: ( ( rule__RDSPPMarking__Group_3__0 )? )
            {
            // InternalRdsPP.g:559:1: ( ( rule__RDSPPMarking__Group_3__0 )? )
            // InternalRdsPP.g:560:2: ( rule__RDSPPMarking__Group_3__0 )?
            {
             before(grammarAccess.getRDSPPMarkingAccess().getGroup_3()); 
            // InternalRdsPP.g:561:2: ( rule__RDSPPMarking__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRdsPP.g:561:3: rule__RDSPPMarking__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RDSPPMarking__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRDSPPMarkingAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group__3__Impl"


    // $ANTLR start "rule__RDSPPMarking__Group__4"
    // InternalRdsPP.g:569:1: rule__RDSPPMarking__Group__4 : rule__RDSPPMarking__Group__4__Impl rule__RDSPPMarking__Group__5 ;
    public final void rule__RDSPPMarking__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:573:1: ( rule__RDSPPMarking__Group__4__Impl rule__RDSPPMarking__Group__5 )
            // InternalRdsPP.g:574:2: rule__RDSPPMarking__Group__4__Impl rule__RDSPPMarking__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__RDSPPMarking__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group__4"


    // $ANTLR start "rule__RDSPPMarking__Group__4__Impl"
    // InternalRdsPP.g:581:1: rule__RDSPPMarking__Group__4__Impl : ( ( rule__RDSPPMarking__Group_4__0 )? ) ;
    public final void rule__RDSPPMarking__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:585:1: ( ( ( rule__RDSPPMarking__Group_4__0 )? ) )
            // InternalRdsPP.g:586:1: ( ( rule__RDSPPMarking__Group_4__0 )? )
            {
            // InternalRdsPP.g:586:1: ( ( rule__RDSPPMarking__Group_4__0 )? )
            // InternalRdsPP.g:587:2: ( rule__RDSPPMarking__Group_4__0 )?
            {
             before(grammarAccess.getRDSPPMarkingAccess().getGroup_4()); 
            // InternalRdsPP.g:588:2: ( rule__RDSPPMarking__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRdsPP.g:588:3: rule__RDSPPMarking__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RDSPPMarking__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRDSPPMarkingAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group__4__Impl"


    // $ANTLR start "rule__RDSPPMarking__Group__5"
    // InternalRdsPP.g:596:1: rule__RDSPPMarking__Group__5 : rule__RDSPPMarking__Group__5__Impl rule__RDSPPMarking__Group__6 ;
    public final void rule__RDSPPMarking__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:600:1: ( rule__RDSPPMarking__Group__5__Impl rule__RDSPPMarking__Group__6 )
            // InternalRdsPP.g:601:2: rule__RDSPPMarking__Group__5__Impl rule__RDSPPMarking__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__RDSPPMarking__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group__5"


    // $ANTLR start "rule__RDSPPMarking__Group__5__Impl"
    // InternalRdsPP.g:608:1: rule__RDSPPMarking__Group__5__Impl : ( ( rule__RDSPPMarking__Group_5__0 )? ) ;
    public final void rule__RDSPPMarking__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:612:1: ( ( ( rule__RDSPPMarking__Group_5__0 )? ) )
            // InternalRdsPP.g:613:1: ( ( rule__RDSPPMarking__Group_5__0 )? )
            {
            // InternalRdsPP.g:613:1: ( ( rule__RDSPPMarking__Group_5__0 )? )
            // InternalRdsPP.g:614:2: ( rule__RDSPPMarking__Group_5__0 )?
            {
             before(grammarAccess.getRDSPPMarkingAccess().getGroup_5()); 
            // InternalRdsPP.g:615:2: ( rule__RDSPPMarking__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRdsPP.g:615:3: rule__RDSPPMarking__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RDSPPMarking__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRDSPPMarkingAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group__5__Impl"


    // $ANTLR start "rule__RDSPPMarking__Group__6"
    // InternalRdsPP.g:623:1: rule__RDSPPMarking__Group__6 : rule__RDSPPMarking__Group__6__Impl rule__RDSPPMarking__Group__7 ;
    public final void rule__RDSPPMarking__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:627:1: ( rule__RDSPPMarking__Group__6__Impl rule__RDSPPMarking__Group__7 )
            // InternalRdsPP.g:628:2: rule__RDSPPMarking__Group__6__Impl rule__RDSPPMarking__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__RDSPPMarking__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group__6"


    // $ANTLR start "rule__RDSPPMarking__Group__6__Impl"
    // InternalRdsPP.g:635:1: rule__RDSPPMarking__Group__6__Impl : ( ( rule__RDSPPMarking__Group_6__0 )? ) ;
    public final void rule__RDSPPMarking__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:639:1: ( ( ( rule__RDSPPMarking__Group_6__0 )? ) )
            // InternalRdsPP.g:640:1: ( ( rule__RDSPPMarking__Group_6__0 )? )
            {
            // InternalRdsPP.g:640:1: ( ( rule__RDSPPMarking__Group_6__0 )? )
            // InternalRdsPP.g:641:2: ( rule__RDSPPMarking__Group_6__0 )?
            {
             before(grammarAccess.getRDSPPMarkingAccess().getGroup_6()); 
            // InternalRdsPP.g:642:2: ( rule__RDSPPMarking__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRdsPP.g:642:3: rule__RDSPPMarking__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RDSPPMarking__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRDSPPMarkingAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group__6__Impl"


    // $ANTLR start "rule__RDSPPMarking__Group__7"
    // InternalRdsPP.g:650:1: rule__RDSPPMarking__Group__7 : rule__RDSPPMarking__Group__7__Impl rule__RDSPPMarking__Group__8 ;
    public final void rule__RDSPPMarking__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:654:1: ( rule__RDSPPMarking__Group__7__Impl rule__RDSPPMarking__Group__8 )
            // InternalRdsPP.g:655:2: rule__RDSPPMarking__Group__7__Impl rule__RDSPPMarking__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__RDSPPMarking__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group__7"


    // $ANTLR start "rule__RDSPPMarking__Group__7__Impl"
    // InternalRdsPP.g:662:1: rule__RDSPPMarking__Group__7__Impl : ( ( rule__RDSPPMarking__Group_7__0 )? ) ;
    public final void rule__RDSPPMarking__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:666:1: ( ( ( rule__RDSPPMarking__Group_7__0 )? ) )
            // InternalRdsPP.g:667:1: ( ( rule__RDSPPMarking__Group_7__0 )? )
            {
            // InternalRdsPP.g:667:1: ( ( rule__RDSPPMarking__Group_7__0 )? )
            // InternalRdsPP.g:668:2: ( rule__RDSPPMarking__Group_7__0 )?
            {
             before(grammarAccess.getRDSPPMarkingAccess().getGroup_7()); 
            // InternalRdsPP.g:669:2: ( rule__RDSPPMarking__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRdsPP.g:669:3: rule__RDSPPMarking__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RDSPPMarking__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRDSPPMarkingAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group__7__Impl"


    // $ANTLR start "rule__RDSPPMarking__Group__8"
    // InternalRdsPP.g:677:1: rule__RDSPPMarking__Group__8 : rule__RDSPPMarking__Group__8__Impl rule__RDSPPMarking__Group__9 ;
    public final void rule__RDSPPMarking__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:681:1: ( rule__RDSPPMarking__Group__8__Impl rule__RDSPPMarking__Group__9 )
            // InternalRdsPP.g:682:2: rule__RDSPPMarking__Group__8__Impl rule__RDSPPMarking__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__RDSPPMarking__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group__8"


    // $ANTLR start "rule__RDSPPMarking__Group__8__Impl"
    // InternalRdsPP.g:689:1: rule__RDSPPMarking__Group__8__Impl : ( ( rule__RDSPPMarking__Group_8__0 )? ) ;
    public final void rule__RDSPPMarking__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:693:1: ( ( ( rule__RDSPPMarking__Group_8__0 )? ) )
            // InternalRdsPP.g:694:1: ( ( rule__RDSPPMarking__Group_8__0 )? )
            {
            // InternalRdsPP.g:694:1: ( ( rule__RDSPPMarking__Group_8__0 )? )
            // InternalRdsPP.g:695:2: ( rule__RDSPPMarking__Group_8__0 )?
            {
             before(grammarAccess.getRDSPPMarkingAccess().getGroup_8()); 
            // InternalRdsPP.g:696:2: ( rule__RDSPPMarking__Group_8__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRdsPP.g:696:3: rule__RDSPPMarking__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RDSPPMarking__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRDSPPMarkingAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group__8__Impl"


    // $ANTLR start "rule__RDSPPMarking__Group__9"
    // InternalRdsPP.g:704:1: rule__RDSPPMarking__Group__9 : rule__RDSPPMarking__Group__9__Impl ;
    public final void rule__RDSPPMarking__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:708:1: ( rule__RDSPPMarking__Group__9__Impl )
            // InternalRdsPP.g:709:2: rule__RDSPPMarking__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group__9"


    // $ANTLR start "rule__RDSPPMarking__Group__9__Impl"
    // InternalRdsPP.g:715:1: rule__RDSPPMarking__Group__9__Impl : ( ( rule__RDSPPMarking__Group_9__0 )? ) ;
    public final void rule__RDSPPMarking__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:719:1: ( ( ( rule__RDSPPMarking__Group_9__0 )? ) )
            // InternalRdsPP.g:720:1: ( ( rule__RDSPPMarking__Group_9__0 )? )
            {
            // InternalRdsPP.g:720:1: ( ( rule__RDSPPMarking__Group_9__0 )? )
            // InternalRdsPP.g:721:2: ( rule__RDSPPMarking__Group_9__0 )?
            {
             before(grammarAccess.getRDSPPMarkingAccess().getGroup_9()); 
            // InternalRdsPP.g:722:2: ( rule__RDSPPMarking__Group_9__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRdsPP.g:722:3: rule__RDSPPMarking__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RDSPPMarking__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRDSPPMarkingAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group__9__Impl"


    // $ANTLR start "rule__RDSPPMarking__Group_1__0"
    // InternalRdsPP.g:731:1: rule__RDSPPMarking__Group_1__0 : rule__RDSPPMarking__Group_1__0__Impl rule__RDSPPMarking__Group_1__1 ;
    public final void rule__RDSPPMarking__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:735:1: ( rule__RDSPPMarking__Group_1__0__Impl rule__RDSPPMarking__Group_1__1 )
            // InternalRdsPP.g:736:2: rule__RDSPPMarking__Group_1__0__Impl rule__RDSPPMarking__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__RDSPPMarking__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_1__0"


    // $ANTLR start "rule__RDSPPMarking__Group_1__0__Impl"
    // InternalRdsPP.g:743:1: rule__RDSPPMarking__Group_1__0__Impl : ( '#' ) ;
    public final void rule__RDSPPMarking__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:747:1: ( ( '#' ) )
            // InternalRdsPP.g:748:1: ( '#' )
            {
            // InternalRdsPP.g:748:1: ( '#' )
            // InternalRdsPP.g:749:2: '#'
            {
             before(grammarAccess.getRDSPPMarkingAccess().getNumberSignKeyword_1_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRDSPPMarkingAccess().getNumberSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_1__0__Impl"


    // $ANTLR start "rule__RDSPPMarking__Group_1__1"
    // InternalRdsPP.g:758:1: rule__RDSPPMarking__Group_1__1 : rule__RDSPPMarking__Group_1__1__Impl ;
    public final void rule__RDSPPMarking__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:762:1: ( rule__RDSPPMarking__Group_1__1__Impl )
            // InternalRdsPP.g:763:2: rule__RDSPPMarking__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_1__1"


    // $ANTLR start "rule__RDSPPMarking__Group_1__1__Impl"
    // InternalRdsPP.g:769:1: rule__RDSPPMarking__Group_1__1__Impl : ( ( rule__RDSPPMarking__GemeinsameZuordnungAssignment_1_1 ) ) ;
    public final void rule__RDSPPMarking__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:773:1: ( ( ( rule__RDSPPMarking__GemeinsameZuordnungAssignment_1_1 ) ) )
            // InternalRdsPP.g:774:1: ( ( rule__RDSPPMarking__GemeinsameZuordnungAssignment_1_1 ) )
            {
            // InternalRdsPP.g:774:1: ( ( rule__RDSPPMarking__GemeinsameZuordnungAssignment_1_1 ) )
            // InternalRdsPP.g:775:2: ( rule__RDSPPMarking__GemeinsameZuordnungAssignment_1_1 )
            {
             before(grammarAccess.getRDSPPMarkingAccess().getGemeinsameZuordnungAssignment_1_1()); 
            // InternalRdsPP.g:776:2: ( rule__RDSPPMarking__GemeinsameZuordnungAssignment_1_1 )
            // InternalRdsPP.g:776:3: rule__RDSPPMarking__GemeinsameZuordnungAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__GemeinsameZuordnungAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRDSPPMarkingAccess().getGemeinsameZuordnungAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_1__1__Impl"


    // $ANTLR start "rule__RDSPPMarking__Group_2__0"
    // InternalRdsPP.g:785:1: rule__RDSPPMarking__Group_2__0 : rule__RDSPPMarking__Group_2__0__Impl rule__RDSPPMarking__Group_2__1 ;
    public final void rule__RDSPPMarking__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:789:1: ( rule__RDSPPMarking__Group_2__0__Impl rule__RDSPPMarking__Group_2__1 )
            // InternalRdsPP.g:790:2: rule__RDSPPMarking__Group_2__0__Impl rule__RDSPPMarking__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__RDSPPMarking__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_2__0"


    // $ANTLR start "rule__RDSPPMarking__Group_2__0__Impl"
    // InternalRdsPP.g:797:1: rule__RDSPPMarking__Group_2__0__Impl : ( '=' ) ;
    public final void rule__RDSPPMarking__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:801:1: ( ( '=' ) )
            // InternalRdsPP.g:802:1: ( '=' )
            {
            // InternalRdsPP.g:802:1: ( '=' )
            // InternalRdsPP.g:803:2: '='
            {
             before(grammarAccess.getRDSPPMarkingAccess().getEqualsSignKeyword_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRDSPPMarkingAccess().getEqualsSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_2__0__Impl"


    // $ANTLR start "rule__RDSPPMarking__Group_2__1"
    // InternalRdsPP.g:812:1: rule__RDSPPMarking__Group_2__1 : rule__RDSPPMarking__Group_2__1__Impl ;
    public final void rule__RDSPPMarking__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:816:1: ( rule__RDSPPMarking__Group_2__1__Impl )
            // InternalRdsPP.g:817:2: rule__RDSPPMarking__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_2__1"


    // $ANTLR start "rule__RDSPPMarking__Group_2__1__Impl"
    // InternalRdsPP.g:823:1: rule__RDSPPMarking__Group_2__1__Impl : ( ( rule__RDSPPMarking__FunktionsbezogeneKennzeichnungAssignment_2_1 ) ) ;
    public final void rule__RDSPPMarking__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:827:1: ( ( ( rule__RDSPPMarking__FunktionsbezogeneKennzeichnungAssignment_2_1 ) ) )
            // InternalRdsPP.g:828:1: ( ( rule__RDSPPMarking__FunktionsbezogeneKennzeichnungAssignment_2_1 ) )
            {
            // InternalRdsPP.g:828:1: ( ( rule__RDSPPMarking__FunktionsbezogeneKennzeichnungAssignment_2_1 ) )
            // InternalRdsPP.g:829:2: ( rule__RDSPPMarking__FunktionsbezogeneKennzeichnungAssignment_2_1 )
            {
             before(grammarAccess.getRDSPPMarkingAccess().getFunktionsbezogeneKennzeichnungAssignment_2_1()); 
            // InternalRdsPP.g:830:2: ( rule__RDSPPMarking__FunktionsbezogeneKennzeichnungAssignment_2_1 )
            // InternalRdsPP.g:830:3: rule__RDSPPMarking__FunktionsbezogeneKennzeichnungAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__FunktionsbezogeneKennzeichnungAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRDSPPMarkingAccess().getFunktionsbezogeneKennzeichnungAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_2__1__Impl"


    // $ANTLR start "rule__RDSPPMarking__Group_3__0"
    // InternalRdsPP.g:839:1: rule__RDSPPMarking__Group_3__0 : rule__RDSPPMarking__Group_3__0__Impl rule__RDSPPMarking__Group_3__1 ;
    public final void rule__RDSPPMarking__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:843:1: ( rule__RDSPPMarking__Group_3__0__Impl rule__RDSPPMarking__Group_3__1 )
            // InternalRdsPP.g:844:2: rule__RDSPPMarking__Group_3__0__Impl rule__RDSPPMarking__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__RDSPPMarking__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_3__0"


    // $ANTLR start "rule__RDSPPMarking__Group_3__0__Impl"
    // InternalRdsPP.g:851:1: rule__RDSPPMarking__Group_3__0__Impl : ( '==' ) ;
    public final void rule__RDSPPMarking__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:855:1: ( ( '==' ) )
            // InternalRdsPP.g:856:1: ( '==' )
            {
            // InternalRdsPP.g:856:1: ( '==' )
            // InternalRdsPP.g:857:2: '=='
            {
             before(grammarAccess.getRDSPPMarkingAccess().getEqualsSignEqualsSignKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRDSPPMarkingAccess().getEqualsSignEqualsSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_3__0__Impl"


    // $ANTLR start "rule__RDSPPMarking__Group_3__1"
    // InternalRdsPP.g:866:1: rule__RDSPPMarking__Group_3__1 : rule__RDSPPMarking__Group_3__1__Impl ;
    public final void rule__RDSPPMarking__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:870:1: ( rule__RDSPPMarking__Group_3__1__Impl )
            // InternalRdsPP.g:871:2: rule__RDSPPMarking__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_3__1"


    // $ANTLR start "rule__RDSPPMarking__Group_3__1__Impl"
    // InternalRdsPP.g:877:1: rule__RDSPPMarking__Group_3__1__Impl : ( ( rule__RDSPPMarking__FunktionaleZuordnungAssignment_3_1 ) ) ;
    public final void rule__RDSPPMarking__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:881:1: ( ( ( rule__RDSPPMarking__FunktionaleZuordnungAssignment_3_1 ) ) )
            // InternalRdsPP.g:882:1: ( ( rule__RDSPPMarking__FunktionaleZuordnungAssignment_3_1 ) )
            {
            // InternalRdsPP.g:882:1: ( ( rule__RDSPPMarking__FunktionaleZuordnungAssignment_3_1 ) )
            // InternalRdsPP.g:883:2: ( rule__RDSPPMarking__FunktionaleZuordnungAssignment_3_1 )
            {
             before(grammarAccess.getRDSPPMarkingAccess().getFunktionaleZuordnungAssignment_3_1()); 
            // InternalRdsPP.g:884:2: ( rule__RDSPPMarking__FunktionaleZuordnungAssignment_3_1 )
            // InternalRdsPP.g:884:3: rule__RDSPPMarking__FunktionaleZuordnungAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__FunktionaleZuordnungAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRDSPPMarkingAccess().getFunktionaleZuordnungAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_3__1__Impl"


    // $ANTLR start "rule__RDSPPMarking__Group_4__0"
    // InternalRdsPP.g:893:1: rule__RDSPPMarking__Group_4__0 : rule__RDSPPMarking__Group_4__0__Impl rule__RDSPPMarking__Group_4__1 ;
    public final void rule__RDSPPMarking__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:897:1: ( rule__RDSPPMarking__Group_4__0__Impl rule__RDSPPMarking__Group_4__1 )
            // InternalRdsPP.g:898:2: rule__RDSPPMarking__Group_4__0__Impl rule__RDSPPMarking__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__RDSPPMarking__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_4__0"


    // $ANTLR start "rule__RDSPPMarking__Group_4__0__Impl"
    // InternalRdsPP.g:905:1: rule__RDSPPMarking__Group_4__0__Impl : ( '+' ) ;
    public final void rule__RDSPPMarking__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:909:1: ( ( '+' ) )
            // InternalRdsPP.g:910:1: ( '+' )
            {
            // InternalRdsPP.g:910:1: ( '+' )
            // InternalRdsPP.g:911:2: '+'
            {
             before(grammarAccess.getRDSPPMarkingAccess().getPlusSignKeyword_4_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRDSPPMarkingAccess().getPlusSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_4__0__Impl"


    // $ANTLR start "rule__RDSPPMarking__Group_4__1"
    // InternalRdsPP.g:920:1: rule__RDSPPMarking__Group_4__1 : rule__RDSPPMarking__Group_4__1__Impl ;
    public final void rule__RDSPPMarking__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:924:1: ( rule__RDSPPMarking__Group_4__1__Impl )
            // InternalRdsPP.g:925:2: rule__RDSPPMarking__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_4__1"


    // $ANTLR start "rule__RDSPPMarking__Group_4__1__Impl"
    // InternalRdsPP.g:931:1: rule__RDSPPMarking__Group_4__1__Impl : ( ( rule__RDSPPMarking__EinbauortkennzeichnungAssignment_4_1 ) ) ;
    public final void rule__RDSPPMarking__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:935:1: ( ( ( rule__RDSPPMarking__EinbauortkennzeichnungAssignment_4_1 ) ) )
            // InternalRdsPP.g:936:1: ( ( rule__RDSPPMarking__EinbauortkennzeichnungAssignment_4_1 ) )
            {
            // InternalRdsPP.g:936:1: ( ( rule__RDSPPMarking__EinbauortkennzeichnungAssignment_4_1 ) )
            // InternalRdsPP.g:937:2: ( rule__RDSPPMarking__EinbauortkennzeichnungAssignment_4_1 )
            {
             before(grammarAccess.getRDSPPMarkingAccess().getEinbauortkennzeichnungAssignment_4_1()); 
            // InternalRdsPP.g:938:2: ( rule__RDSPPMarking__EinbauortkennzeichnungAssignment_4_1 )
            // InternalRdsPP.g:938:3: rule__RDSPPMarking__EinbauortkennzeichnungAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__EinbauortkennzeichnungAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRDSPPMarkingAccess().getEinbauortkennzeichnungAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_4__1__Impl"


    // $ANTLR start "rule__RDSPPMarking__Group_5__0"
    // InternalRdsPP.g:947:1: rule__RDSPPMarking__Group_5__0 : rule__RDSPPMarking__Group_5__0__Impl rule__RDSPPMarking__Group_5__1 ;
    public final void rule__RDSPPMarking__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:951:1: ( rule__RDSPPMarking__Group_5__0__Impl rule__RDSPPMarking__Group_5__1 )
            // InternalRdsPP.g:952:2: rule__RDSPPMarking__Group_5__0__Impl rule__RDSPPMarking__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__RDSPPMarking__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_5__0"


    // $ANTLR start "rule__RDSPPMarking__Group_5__0__Impl"
    // InternalRdsPP.g:959:1: rule__RDSPPMarking__Group_5__0__Impl : ( '++' ) ;
    public final void rule__RDSPPMarking__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:963:1: ( ( '++' ) )
            // InternalRdsPP.g:964:1: ( '++' )
            {
            // InternalRdsPP.g:964:1: ( '++' )
            // InternalRdsPP.g:965:2: '++'
            {
             before(grammarAccess.getRDSPPMarkingAccess().getPlusSignPlusSignKeyword_5_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRDSPPMarkingAccess().getPlusSignPlusSignKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_5__0__Impl"


    // $ANTLR start "rule__RDSPPMarking__Group_5__1"
    // InternalRdsPP.g:974:1: rule__RDSPPMarking__Group_5__1 : rule__RDSPPMarking__Group_5__1__Impl ;
    public final void rule__RDSPPMarking__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:978:1: ( rule__RDSPPMarking__Group_5__1__Impl )
            // InternalRdsPP.g:979:2: rule__RDSPPMarking__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_5__1"


    // $ANTLR start "rule__RDSPPMarking__Group_5__1__Impl"
    // InternalRdsPP.g:985:1: rule__RDSPPMarking__Group_5__1__Impl : ( ( rule__RDSPPMarking__AufstellungsortkennzeichnungAssignment_5_1 ) ) ;
    public final void rule__RDSPPMarking__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:989:1: ( ( ( rule__RDSPPMarking__AufstellungsortkennzeichnungAssignment_5_1 ) ) )
            // InternalRdsPP.g:990:1: ( ( rule__RDSPPMarking__AufstellungsortkennzeichnungAssignment_5_1 ) )
            {
            // InternalRdsPP.g:990:1: ( ( rule__RDSPPMarking__AufstellungsortkennzeichnungAssignment_5_1 ) )
            // InternalRdsPP.g:991:2: ( rule__RDSPPMarking__AufstellungsortkennzeichnungAssignment_5_1 )
            {
             before(grammarAccess.getRDSPPMarkingAccess().getAufstellungsortkennzeichnungAssignment_5_1()); 
            // InternalRdsPP.g:992:2: ( rule__RDSPPMarking__AufstellungsortkennzeichnungAssignment_5_1 )
            // InternalRdsPP.g:992:3: rule__RDSPPMarking__AufstellungsortkennzeichnungAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__AufstellungsortkennzeichnungAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRDSPPMarkingAccess().getAufstellungsortkennzeichnungAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_5__1__Impl"


    // $ANTLR start "rule__RDSPPMarking__Group_6__0"
    // InternalRdsPP.g:1001:1: rule__RDSPPMarking__Group_6__0 : rule__RDSPPMarking__Group_6__0__Impl rule__RDSPPMarking__Group_6__1 ;
    public final void rule__RDSPPMarking__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1005:1: ( rule__RDSPPMarking__Group_6__0__Impl rule__RDSPPMarking__Group_6__1 )
            // InternalRdsPP.g:1006:2: rule__RDSPPMarking__Group_6__0__Impl rule__RDSPPMarking__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__RDSPPMarking__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_6__0"


    // $ANTLR start "rule__RDSPPMarking__Group_6__0__Impl"
    // InternalRdsPP.g:1013:1: rule__RDSPPMarking__Group_6__0__Impl : ( '-' ) ;
    public final void rule__RDSPPMarking__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1017:1: ( ( '-' ) )
            // InternalRdsPP.g:1018:1: ( '-' )
            {
            // InternalRdsPP.g:1018:1: ( '-' )
            // InternalRdsPP.g:1019:2: '-'
            {
             before(grammarAccess.getRDSPPMarkingAccess().getHyphenMinusKeyword_6_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRDSPPMarkingAccess().getHyphenMinusKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_6__0__Impl"


    // $ANTLR start "rule__RDSPPMarking__Group_6__1"
    // InternalRdsPP.g:1028:1: rule__RDSPPMarking__Group_6__1 : rule__RDSPPMarking__Group_6__1__Impl ;
    public final void rule__RDSPPMarking__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1032:1: ( rule__RDSPPMarking__Group_6__1__Impl )
            // InternalRdsPP.g:1033:2: rule__RDSPPMarking__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_6__1"


    // $ANTLR start "rule__RDSPPMarking__Group_6__1__Impl"
    // InternalRdsPP.g:1039:1: rule__RDSPPMarking__Group_6__1__Impl : ( ( rule__RDSPPMarking__ProduktbezogenekennzeichnungAssignment_6_1 ) ) ;
    public final void rule__RDSPPMarking__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1043:1: ( ( ( rule__RDSPPMarking__ProduktbezogenekennzeichnungAssignment_6_1 ) ) )
            // InternalRdsPP.g:1044:1: ( ( rule__RDSPPMarking__ProduktbezogenekennzeichnungAssignment_6_1 ) )
            {
            // InternalRdsPP.g:1044:1: ( ( rule__RDSPPMarking__ProduktbezogenekennzeichnungAssignment_6_1 ) )
            // InternalRdsPP.g:1045:2: ( rule__RDSPPMarking__ProduktbezogenekennzeichnungAssignment_6_1 )
            {
             before(grammarAccess.getRDSPPMarkingAccess().getProduktbezogenekennzeichnungAssignment_6_1()); 
            // InternalRdsPP.g:1046:2: ( rule__RDSPPMarking__ProduktbezogenekennzeichnungAssignment_6_1 )
            // InternalRdsPP.g:1046:3: rule__RDSPPMarking__ProduktbezogenekennzeichnungAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__ProduktbezogenekennzeichnungAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getRDSPPMarkingAccess().getProduktbezogenekennzeichnungAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_6__1__Impl"


    // $ANTLR start "rule__RDSPPMarking__Group_7__0"
    // InternalRdsPP.g:1055:1: rule__RDSPPMarking__Group_7__0 : rule__RDSPPMarking__Group_7__0__Impl rule__RDSPPMarking__Group_7__1 ;
    public final void rule__RDSPPMarking__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1059:1: ( rule__RDSPPMarking__Group_7__0__Impl rule__RDSPPMarking__Group_7__1 )
            // InternalRdsPP.g:1060:2: rule__RDSPPMarking__Group_7__0__Impl rule__RDSPPMarking__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__RDSPPMarking__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_7__0"


    // $ANTLR start "rule__RDSPPMarking__Group_7__0__Impl"
    // InternalRdsPP.g:1067:1: rule__RDSPPMarking__Group_7__0__Impl : ( ':' ) ;
    public final void rule__RDSPPMarking__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1071:1: ( ( ':' ) )
            // InternalRdsPP.g:1072:1: ( ':' )
            {
            // InternalRdsPP.g:1072:1: ( ':' )
            // InternalRdsPP.g:1073:2: ':'
            {
             before(grammarAccess.getRDSPPMarkingAccess().getColonKeyword_7_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRDSPPMarkingAccess().getColonKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_7__0__Impl"


    // $ANTLR start "rule__RDSPPMarking__Group_7__1"
    // InternalRdsPP.g:1082:1: rule__RDSPPMarking__Group_7__1 : rule__RDSPPMarking__Group_7__1__Impl ;
    public final void rule__RDSPPMarking__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1086:1: ( rule__RDSPPMarking__Group_7__1__Impl )
            // InternalRdsPP.g:1087:2: rule__RDSPPMarking__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_7__1"


    // $ANTLR start "rule__RDSPPMarking__Group_7__1__Impl"
    // InternalRdsPP.g:1093:1: rule__RDSPPMarking__Group_7__1__Impl : ( ( rule__RDSPPMarking__AnschlusskennzeichnungAssignment_7_1 ) ) ;
    public final void rule__RDSPPMarking__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1097:1: ( ( ( rule__RDSPPMarking__AnschlusskennzeichnungAssignment_7_1 ) ) )
            // InternalRdsPP.g:1098:1: ( ( rule__RDSPPMarking__AnschlusskennzeichnungAssignment_7_1 ) )
            {
            // InternalRdsPP.g:1098:1: ( ( rule__RDSPPMarking__AnschlusskennzeichnungAssignment_7_1 ) )
            // InternalRdsPP.g:1099:2: ( rule__RDSPPMarking__AnschlusskennzeichnungAssignment_7_1 )
            {
             before(grammarAccess.getRDSPPMarkingAccess().getAnschlusskennzeichnungAssignment_7_1()); 
            // InternalRdsPP.g:1100:2: ( rule__RDSPPMarking__AnschlusskennzeichnungAssignment_7_1 )
            // InternalRdsPP.g:1100:3: rule__RDSPPMarking__AnschlusskennzeichnungAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__AnschlusskennzeichnungAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getRDSPPMarkingAccess().getAnschlusskennzeichnungAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_7__1__Impl"


    // $ANTLR start "rule__RDSPPMarking__Group_8__0"
    // InternalRdsPP.g:1109:1: rule__RDSPPMarking__Group_8__0 : rule__RDSPPMarking__Group_8__0__Impl rule__RDSPPMarking__Group_8__1 ;
    public final void rule__RDSPPMarking__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1113:1: ( rule__RDSPPMarking__Group_8__0__Impl rule__RDSPPMarking__Group_8__1 )
            // InternalRdsPP.g:1114:2: rule__RDSPPMarking__Group_8__0__Impl rule__RDSPPMarking__Group_8__1
            {
            pushFollow(FOLLOW_5);
            rule__RDSPPMarking__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_8__0"


    // $ANTLR start "rule__RDSPPMarking__Group_8__0__Impl"
    // InternalRdsPP.g:1121:1: rule__RDSPPMarking__Group_8__0__Impl : ( ';' ) ;
    public final void rule__RDSPPMarking__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1125:1: ( ( ';' ) )
            // InternalRdsPP.g:1126:1: ( ';' )
            {
            // InternalRdsPP.g:1126:1: ( ';' )
            // InternalRdsPP.g:1127:2: ';'
            {
             before(grammarAccess.getRDSPPMarkingAccess().getSemicolonKeyword_8_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRDSPPMarkingAccess().getSemicolonKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_8__0__Impl"


    // $ANTLR start "rule__RDSPPMarking__Group_8__1"
    // InternalRdsPP.g:1136:1: rule__RDSPPMarking__Group_8__1 : rule__RDSPPMarking__Group_8__1__Impl ;
    public final void rule__RDSPPMarking__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1140:1: ( rule__RDSPPMarking__Group_8__1__Impl )
            // InternalRdsPP.g:1141:2: rule__RDSPPMarking__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_8__1"


    // $ANTLR start "rule__RDSPPMarking__Group_8__1__Impl"
    // InternalRdsPP.g:1147:1: rule__RDSPPMarking__Group_8__1__Impl : ( ( rule__RDSPPMarking__SignalkennzeichnungAssignment_8_1 ) ) ;
    public final void rule__RDSPPMarking__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1151:1: ( ( ( rule__RDSPPMarking__SignalkennzeichnungAssignment_8_1 ) ) )
            // InternalRdsPP.g:1152:1: ( ( rule__RDSPPMarking__SignalkennzeichnungAssignment_8_1 ) )
            {
            // InternalRdsPP.g:1152:1: ( ( rule__RDSPPMarking__SignalkennzeichnungAssignment_8_1 ) )
            // InternalRdsPP.g:1153:2: ( rule__RDSPPMarking__SignalkennzeichnungAssignment_8_1 )
            {
             before(grammarAccess.getRDSPPMarkingAccess().getSignalkennzeichnungAssignment_8_1()); 
            // InternalRdsPP.g:1154:2: ( rule__RDSPPMarking__SignalkennzeichnungAssignment_8_1 )
            // InternalRdsPP.g:1154:3: rule__RDSPPMarking__SignalkennzeichnungAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__SignalkennzeichnungAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getRDSPPMarkingAccess().getSignalkennzeichnungAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_8__1__Impl"


    // $ANTLR start "rule__RDSPPMarking__Group_9__0"
    // InternalRdsPP.g:1163:1: rule__RDSPPMarking__Group_9__0 : rule__RDSPPMarking__Group_9__0__Impl rule__RDSPPMarking__Group_9__1 ;
    public final void rule__RDSPPMarking__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1167:1: ( rule__RDSPPMarking__Group_9__0__Impl rule__RDSPPMarking__Group_9__1 )
            // InternalRdsPP.g:1168:2: rule__RDSPPMarking__Group_9__0__Impl rule__RDSPPMarking__Group_9__1
            {
            pushFollow(FOLLOW_5);
            rule__RDSPPMarking__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_9__0"


    // $ANTLR start "rule__RDSPPMarking__Group_9__0__Impl"
    // InternalRdsPP.g:1175:1: rule__RDSPPMarking__Group_9__0__Impl : ( '&' ) ;
    public final void rule__RDSPPMarking__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1179:1: ( ( '&' ) )
            // InternalRdsPP.g:1180:1: ( '&' )
            {
            // InternalRdsPP.g:1180:1: ( '&' )
            // InternalRdsPP.g:1181:2: '&'
            {
             before(grammarAccess.getRDSPPMarkingAccess().getAmpersandKeyword_9_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRDSPPMarkingAccess().getAmpersandKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_9__0__Impl"


    // $ANTLR start "rule__RDSPPMarking__Group_9__1"
    // InternalRdsPP.g:1190:1: rule__RDSPPMarking__Group_9__1 : rule__RDSPPMarking__Group_9__1__Impl ;
    public final void rule__RDSPPMarking__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1194:1: ( rule__RDSPPMarking__Group_9__1__Impl )
            // InternalRdsPP.g:1195:2: rule__RDSPPMarking__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_9__1"


    // $ANTLR start "rule__RDSPPMarking__Group_9__1__Impl"
    // InternalRdsPP.g:1201:1: rule__RDSPPMarking__Group_9__1__Impl : ( ( rule__RDSPPMarking__DokumentenkennzeichnungAssignment_9_1 ) ) ;
    public final void rule__RDSPPMarking__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1205:1: ( ( ( rule__RDSPPMarking__DokumentenkennzeichnungAssignment_9_1 ) ) )
            // InternalRdsPP.g:1206:1: ( ( rule__RDSPPMarking__DokumentenkennzeichnungAssignment_9_1 ) )
            {
            // InternalRdsPP.g:1206:1: ( ( rule__RDSPPMarking__DokumentenkennzeichnungAssignment_9_1 ) )
            // InternalRdsPP.g:1207:2: ( rule__RDSPPMarking__DokumentenkennzeichnungAssignment_9_1 )
            {
             before(grammarAccess.getRDSPPMarkingAccess().getDokumentenkennzeichnungAssignment_9_1()); 
            // InternalRdsPP.g:1208:2: ( rule__RDSPPMarking__DokumentenkennzeichnungAssignment_9_1 )
            // InternalRdsPP.g:1208:3: rule__RDSPPMarking__DokumentenkennzeichnungAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__RDSPPMarking__DokumentenkennzeichnungAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getRDSPPMarkingAccess().getDokumentenkennzeichnungAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__Group_9__1__Impl"


    // $ANTLR start "rule__SignalIdentification__Group__0"
    // InternalRdsPP.g:1217:1: rule__SignalIdentification__Group__0 : rule__SignalIdentification__Group__0__Impl rule__SignalIdentification__Group__1 ;
    public final void rule__SignalIdentification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1221:1: ( rule__SignalIdentification__Group__0__Impl rule__SignalIdentification__Group__1 )
            // InternalRdsPP.g:1222:2: rule__SignalIdentification__Group__0__Impl rule__SignalIdentification__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__SignalIdentification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SignalIdentification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignalIdentification__Group__0"


    // $ANTLR start "rule__SignalIdentification__Group__0__Impl"
    // InternalRdsPP.g:1229:1: rule__SignalIdentification__Group__0__Impl : ( 'SIGNALKENNZEICHNUNG' ) ;
    public final void rule__SignalIdentification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1233:1: ( ( 'SIGNALKENNZEICHNUNG' ) )
            // InternalRdsPP.g:1234:1: ( 'SIGNALKENNZEICHNUNG' )
            {
            // InternalRdsPP.g:1234:1: ( 'SIGNALKENNZEICHNUNG' )
            // InternalRdsPP.g:1235:2: 'SIGNALKENNZEICHNUNG'
            {
             before(grammarAccess.getSignalIdentificationAccess().getSIGNALKENNZEICHNUNGKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSignalIdentificationAccess().getSIGNALKENNZEICHNUNGKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignalIdentification__Group__0__Impl"


    // $ANTLR start "rule__SignalIdentification__Group__1"
    // InternalRdsPP.g:1244:1: rule__SignalIdentification__Group__1 : rule__SignalIdentification__Group__1__Impl rule__SignalIdentification__Group__2 ;
    public final void rule__SignalIdentification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1248:1: ( rule__SignalIdentification__Group__1__Impl rule__SignalIdentification__Group__2 )
            // InternalRdsPP.g:1249:2: rule__SignalIdentification__Group__1__Impl rule__SignalIdentification__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SignalIdentification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SignalIdentification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignalIdentification__Group__1"


    // $ANTLR start "rule__SignalIdentification__Group__1__Impl"
    // InternalRdsPP.g:1256:1: rule__SignalIdentification__Group__1__Impl : ( ';' ) ;
    public final void rule__SignalIdentification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1260:1: ( ( ';' ) )
            // InternalRdsPP.g:1261:1: ( ';' )
            {
            // InternalRdsPP.g:1261:1: ( ';' )
            // InternalRdsPP.g:1262:2: ';'
            {
             before(grammarAccess.getSignalIdentificationAccess().getSemicolonKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSignalIdentificationAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignalIdentification__Group__1__Impl"


    // $ANTLR start "rule__SignalIdentification__Group__2"
    // InternalRdsPP.g:1271:1: rule__SignalIdentification__Group__2 : rule__SignalIdentification__Group__2__Impl rule__SignalIdentification__Group__3 ;
    public final void rule__SignalIdentification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1275:1: ( rule__SignalIdentification__Group__2__Impl rule__SignalIdentification__Group__3 )
            // InternalRdsPP.g:1276:2: rule__SignalIdentification__Group__2__Impl rule__SignalIdentification__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__SignalIdentification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SignalIdentification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignalIdentification__Group__2"


    // $ANTLR start "rule__SignalIdentification__Group__2__Impl"
    // InternalRdsPP.g:1283:1: rule__SignalIdentification__Group__2__Impl : ( ( rule__SignalIdentification__NameAssignment_2 ) ) ;
    public final void rule__SignalIdentification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1287:1: ( ( ( rule__SignalIdentification__NameAssignment_2 ) ) )
            // InternalRdsPP.g:1288:1: ( ( rule__SignalIdentification__NameAssignment_2 ) )
            {
            // InternalRdsPP.g:1288:1: ( ( rule__SignalIdentification__NameAssignment_2 ) )
            // InternalRdsPP.g:1289:2: ( rule__SignalIdentification__NameAssignment_2 )
            {
             before(grammarAccess.getSignalIdentificationAccess().getNameAssignment_2()); 
            // InternalRdsPP.g:1290:2: ( rule__SignalIdentification__NameAssignment_2 )
            // InternalRdsPP.g:1290:3: rule__SignalIdentification__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SignalIdentification__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSignalIdentificationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignalIdentification__Group__2__Impl"


    // $ANTLR start "rule__SignalIdentification__Group__3"
    // InternalRdsPP.g:1298:1: rule__SignalIdentification__Group__3 : rule__SignalIdentification__Group__3__Impl ;
    public final void rule__SignalIdentification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1302:1: ( rule__SignalIdentification__Group__3__Impl )
            // InternalRdsPP.g:1303:2: rule__SignalIdentification__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SignalIdentification__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignalIdentification__Group__3"


    // $ANTLR start "rule__SignalIdentification__Group__3__Impl"
    // InternalRdsPP.g:1309:1: rule__SignalIdentification__Group__3__Impl : ( ( rule__SignalIdentification__Group_3__0 )? ) ;
    public final void rule__SignalIdentification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1313:1: ( ( ( rule__SignalIdentification__Group_3__0 )? ) )
            // InternalRdsPP.g:1314:1: ( ( rule__SignalIdentification__Group_3__0 )? )
            {
            // InternalRdsPP.g:1314:1: ( ( rule__SignalIdentification__Group_3__0 )? )
            // InternalRdsPP.g:1315:2: ( rule__SignalIdentification__Group_3__0 )?
            {
             before(grammarAccess.getSignalIdentificationAccess().getGroup_3()); 
            // InternalRdsPP.g:1316:2: ( rule__SignalIdentification__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRdsPP.g:1316:3: rule__SignalIdentification__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SignalIdentification__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSignalIdentificationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignalIdentification__Group__3__Impl"


    // $ANTLR start "rule__SignalIdentification__Group_3__0"
    // InternalRdsPP.g:1325:1: rule__SignalIdentification__Group_3__0 : rule__SignalIdentification__Group_3__0__Impl rule__SignalIdentification__Group_3__1 ;
    public final void rule__SignalIdentification__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1329:1: ( rule__SignalIdentification__Group_3__0__Impl rule__SignalIdentification__Group_3__1 )
            // InternalRdsPP.g:1330:2: rule__SignalIdentification__Group_3__0__Impl rule__SignalIdentification__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__SignalIdentification__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SignalIdentification__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignalIdentification__Group_3__0"


    // $ANTLR start "rule__SignalIdentification__Group_3__0__Impl"
    // InternalRdsPP.g:1337:1: rule__SignalIdentification__Group_3__0__Impl : ( '->' ) ;
    public final void rule__SignalIdentification__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1341:1: ( ( '->' ) )
            // InternalRdsPP.g:1342:1: ( '->' )
            {
            // InternalRdsPP.g:1342:1: ( '->' )
            // InternalRdsPP.g:1343:2: '->'
            {
             before(grammarAccess.getSignalIdentificationAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSignalIdentificationAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignalIdentification__Group_3__0__Impl"


    // $ANTLR start "rule__SignalIdentification__Group_3__1"
    // InternalRdsPP.g:1352:1: rule__SignalIdentification__Group_3__1 : rule__SignalIdentification__Group_3__1__Impl ;
    public final void rule__SignalIdentification__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1356:1: ( rule__SignalIdentification__Group_3__1__Impl )
            // InternalRdsPP.g:1357:2: rule__SignalIdentification__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SignalIdentification__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignalIdentification__Group_3__1"


    // $ANTLR start "rule__SignalIdentification__Group_3__1__Impl"
    // InternalRdsPP.g:1363:1: rule__SignalIdentification__Group_3__1__Impl : ( ( rule__SignalIdentification__DescriptionAssignment_3_1 ) ) ;
    public final void rule__SignalIdentification__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1367:1: ( ( ( rule__SignalIdentification__DescriptionAssignment_3_1 ) ) )
            // InternalRdsPP.g:1368:1: ( ( rule__SignalIdentification__DescriptionAssignment_3_1 ) )
            {
            // InternalRdsPP.g:1368:1: ( ( rule__SignalIdentification__DescriptionAssignment_3_1 ) )
            // InternalRdsPP.g:1369:2: ( rule__SignalIdentification__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getSignalIdentificationAccess().getDescriptionAssignment_3_1()); 
            // InternalRdsPP.g:1370:2: ( rule__SignalIdentification__DescriptionAssignment_3_1 )
            // InternalRdsPP.g:1370:3: rule__SignalIdentification__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SignalIdentification__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSignalIdentificationAccess().getDescriptionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignalIdentification__Group_3__1__Impl"


    // $ANTLR start "rule__DocumentIdentification__Group__0"
    // InternalRdsPP.g:1379:1: rule__DocumentIdentification__Group__0 : rule__DocumentIdentification__Group__0__Impl rule__DocumentIdentification__Group__1 ;
    public final void rule__DocumentIdentification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1383:1: ( rule__DocumentIdentification__Group__0__Impl rule__DocumentIdentification__Group__1 )
            // InternalRdsPP.g:1384:2: rule__DocumentIdentification__Group__0__Impl rule__DocumentIdentification__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__DocumentIdentification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocumentIdentification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentIdentification__Group__0"


    // $ANTLR start "rule__DocumentIdentification__Group__0__Impl"
    // InternalRdsPP.g:1391:1: rule__DocumentIdentification__Group__0__Impl : ( 'DOKUMENTENKENNZEICHNUNG' ) ;
    public final void rule__DocumentIdentification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1395:1: ( ( 'DOKUMENTENKENNZEICHNUNG' ) )
            // InternalRdsPP.g:1396:1: ( 'DOKUMENTENKENNZEICHNUNG' )
            {
            // InternalRdsPP.g:1396:1: ( 'DOKUMENTENKENNZEICHNUNG' )
            // InternalRdsPP.g:1397:2: 'DOKUMENTENKENNZEICHNUNG'
            {
             before(grammarAccess.getDocumentIdentificationAccess().getDOKUMENTENKENNZEICHNUNGKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDocumentIdentificationAccess().getDOKUMENTENKENNZEICHNUNGKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentIdentification__Group__0__Impl"


    // $ANTLR start "rule__DocumentIdentification__Group__1"
    // InternalRdsPP.g:1406:1: rule__DocumentIdentification__Group__1 : rule__DocumentIdentification__Group__1__Impl rule__DocumentIdentification__Group__2 ;
    public final void rule__DocumentIdentification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1410:1: ( rule__DocumentIdentification__Group__1__Impl rule__DocumentIdentification__Group__2 )
            // InternalRdsPP.g:1411:2: rule__DocumentIdentification__Group__1__Impl rule__DocumentIdentification__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DocumentIdentification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocumentIdentification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentIdentification__Group__1"


    // $ANTLR start "rule__DocumentIdentification__Group__1__Impl"
    // InternalRdsPP.g:1418:1: rule__DocumentIdentification__Group__1__Impl : ( '&' ) ;
    public final void rule__DocumentIdentification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1422:1: ( ( '&' ) )
            // InternalRdsPP.g:1423:1: ( '&' )
            {
            // InternalRdsPP.g:1423:1: ( '&' )
            // InternalRdsPP.g:1424:2: '&'
            {
             before(grammarAccess.getDocumentIdentificationAccess().getAmpersandKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDocumentIdentificationAccess().getAmpersandKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentIdentification__Group__1__Impl"


    // $ANTLR start "rule__DocumentIdentification__Group__2"
    // InternalRdsPP.g:1433:1: rule__DocumentIdentification__Group__2 : rule__DocumentIdentification__Group__2__Impl rule__DocumentIdentification__Group__3 ;
    public final void rule__DocumentIdentification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1437:1: ( rule__DocumentIdentification__Group__2__Impl rule__DocumentIdentification__Group__3 )
            // InternalRdsPP.g:1438:2: rule__DocumentIdentification__Group__2__Impl rule__DocumentIdentification__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__DocumentIdentification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocumentIdentification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentIdentification__Group__2"


    // $ANTLR start "rule__DocumentIdentification__Group__2__Impl"
    // InternalRdsPP.g:1445:1: rule__DocumentIdentification__Group__2__Impl : ( ( rule__DocumentIdentification__NameAssignment_2 ) ) ;
    public final void rule__DocumentIdentification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1449:1: ( ( ( rule__DocumentIdentification__NameAssignment_2 ) ) )
            // InternalRdsPP.g:1450:1: ( ( rule__DocumentIdentification__NameAssignment_2 ) )
            {
            // InternalRdsPP.g:1450:1: ( ( rule__DocumentIdentification__NameAssignment_2 ) )
            // InternalRdsPP.g:1451:2: ( rule__DocumentIdentification__NameAssignment_2 )
            {
             before(grammarAccess.getDocumentIdentificationAccess().getNameAssignment_2()); 
            // InternalRdsPP.g:1452:2: ( rule__DocumentIdentification__NameAssignment_2 )
            // InternalRdsPP.g:1452:3: rule__DocumentIdentification__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DocumentIdentification__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDocumentIdentificationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentIdentification__Group__2__Impl"


    // $ANTLR start "rule__DocumentIdentification__Group__3"
    // InternalRdsPP.g:1460:1: rule__DocumentIdentification__Group__3 : rule__DocumentIdentification__Group__3__Impl ;
    public final void rule__DocumentIdentification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1464:1: ( rule__DocumentIdentification__Group__3__Impl )
            // InternalRdsPP.g:1465:2: rule__DocumentIdentification__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DocumentIdentification__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentIdentification__Group__3"


    // $ANTLR start "rule__DocumentIdentification__Group__3__Impl"
    // InternalRdsPP.g:1471:1: rule__DocumentIdentification__Group__3__Impl : ( ( rule__DocumentIdentification__Group_3__0 )? ) ;
    public final void rule__DocumentIdentification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1475:1: ( ( ( rule__DocumentIdentification__Group_3__0 )? ) )
            // InternalRdsPP.g:1476:1: ( ( rule__DocumentIdentification__Group_3__0 )? )
            {
            // InternalRdsPP.g:1476:1: ( ( rule__DocumentIdentification__Group_3__0 )? )
            // InternalRdsPP.g:1477:2: ( rule__DocumentIdentification__Group_3__0 )?
            {
             before(grammarAccess.getDocumentIdentificationAccess().getGroup_3()); 
            // InternalRdsPP.g:1478:2: ( rule__DocumentIdentification__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRdsPP.g:1478:3: rule__DocumentIdentification__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DocumentIdentification__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDocumentIdentificationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentIdentification__Group__3__Impl"


    // $ANTLR start "rule__DocumentIdentification__Group_3__0"
    // InternalRdsPP.g:1487:1: rule__DocumentIdentification__Group_3__0 : rule__DocumentIdentification__Group_3__0__Impl rule__DocumentIdentification__Group_3__1 ;
    public final void rule__DocumentIdentification__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1491:1: ( rule__DocumentIdentification__Group_3__0__Impl rule__DocumentIdentification__Group_3__1 )
            // InternalRdsPP.g:1492:2: rule__DocumentIdentification__Group_3__0__Impl rule__DocumentIdentification__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__DocumentIdentification__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocumentIdentification__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentIdentification__Group_3__0"


    // $ANTLR start "rule__DocumentIdentification__Group_3__0__Impl"
    // InternalRdsPP.g:1499:1: rule__DocumentIdentification__Group_3__0__Impl : ( '->' ) ;
    public final void rule__DocumentIdentification__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1503:1: ( ( '->' ) )
            // InternalRdsPP.g:1504:1: ( '->' )
            {
            // InternalRdsPP.g:1504:1: ( '->' )
            // InternalRdsPP.g:1505:2: '->'
            {
             before(grammarAccess.getDocumentIdentificationAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDocumentIdentificationAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentIdentification__Group_3__0__Impl"


    // $ANTLR start "rule__DocumentIdentification__Group_3__1"
    // InternalRdsPP.g:1514:1: rule__DocumentIdentification__Group_3__1 : rule__DocumentIdentification__Group_3__1__Impl ;
    public final void rule__DocumentIdentification__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1518:1: ( rule__DocumentIdentification__Group_3__1__Impl )
            // InternalRdsPP.g:1519:2: rule__DocumentIdentification__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DocumentIdentification__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentIdentification__Group_3__1"


    // $ANTLR start "rule__DocumentIdentification__Group_3__1__Impl"
    // InternalRdsPP.g:1525:1: rule__DocumentIdentification__Group_3__1__Impl : ( ( rule__DocumentIdentification__DescriptionAssignment_3_1 ) ) ;
    public final void rule__DocumentIdentification__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1529:1: ( ( ( rule__DocumentIdentification__DescriptionAssignment_3_1 ) ) )
            // InternalRdsPP.g:1530:1: ( ( rule__DocumentIdentification__DescriptionAssignment_3_1 ) )
            {
            // InternalRdsPP.g:1530:1: ( ( rule__DocumentIdentification__DescriptionAssignment_3_1 ) )
            // InternalRdsPP.g:1531:2: ( rule__DocumentIdentification__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getDocumentIdentificationAccess().getDescriptionAssignment_3_1()); 
            // InternalRdsPP.g:1532:2: ( rule__DocumentIdentification__DescriptionAssignment_3_1 )
            // InternalRdsPP.g:1532:3: rule__DocumentIdentification__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DocumentIdentification__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDocumentIdentificationAccess().getDescriptionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentIdentification__Group_3__1__Impl"


    // $ANTLR start "rule__FunctionalAssignment__Group__0"
    // InternalRdsPP.g:1541:1: rule__FunctionalAssignment__Group__0 : rule__FunctionalAssignment__Group__0__Impl rule__FunctionalAssignment__Group__1 ;
    public final void rule__FunctionalAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1545:1: ( rule__FunctionalAssignment__Group__0__Impl rule__FunctionalAssignment__Group__1 )
            // InternalRdsPP.g:1546:2: rule__FunctionalAssignment__Group__0__Impl rule__FunctionalAssignment__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__FunctionalAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionalAssignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalAssignment__Group__0"


    // $ANTLR start "rule__FunctionalAssignment__Group__0__Impl"
    // InternalRdsPP.g:1553:1: rule__FunctionalAssignment__Group__0__Impl : ( 'FUNKTIONALEZUORDNUNG' ) ;
    public final void rule__FunctionalAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1557:1: ( ( 'FUNKTIONALEZUORDNUNG' ) )
            // InternalRdsPP.g:1558:1: ( 'FUNKTIONALEZUORDNUNG' )
            {
            // InternalRdsPP.g:1558:1: ( 'FUNKTIONALEZUORDNUNG' )
            // InternalRdsPP.g:1559:2: 'FUNKTIONALEZUORDNUNG'
            {
             before(grammarAccess.getFunctionalAssignmentAccess().getFUNKTIONALEZUORDNUNGKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFunctionalAssignmentAccess().getFUNKTIONALEZUORDNUNGKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalAssignment__Group__0__Impl"


    // $ANTLR start "rule__FunctionalAssignment__Group__1"
    // InternalRdsPP.g:1568:1: rule__FunctionalAssignment__Group__1 : rule__FunctionalAssignment__Group__1__Impl rule__FunctionalAssignment__Group__2 ;
    public final void rule__FunctionalAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1572:1: ( rule__FunctionalAssignment__Group__1__Impl rule__FunctionalAssignment__Group__2 )
            // InternalRdsPP.g:1573:2: rule__FunctionalAssignment__Group__1__Impl rule__FunctionalAssignment__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__FunctionalAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionalAssignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalAssignment__Group__1"


    // $ANTLR start "rule__FunctionalAssignment__Group__1__Impl"
    // InternalRdsPP.g:1580:1: rule__FunctionalAssignment__Group__1__Impl : ( '==' ) ;
    public final void rule__FunctionalAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1584:1: ( ( '==' ) )
            // InternalRdsPP.g:1585:1: ( '==' )
            {
            // InternalRdsPP.g:1585:1: ( '==' )
            // InternalRdsPP.g:1586:2: '=='
            {
             before(grammarAccess.getFunctionalAssignmentAccess().getEqualsSignEqualsSignKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFunctionalAssignmentAccess().getEqualsSignEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalAssignment__Group__1__Impl"


    // $ANTLR start "rule__FunctionalAssignment__Group__2"
    // InternalRdsPP.g:1595:1: rule__FunctionalAssignment__Group__2 : rule__FunctionalAssignment__Group__2__Impl rule__FunctionalAssignment__Group__3 ;
    public final void rule__FunctionalAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1599:1: ( rule__FunctionalAssignment__Group__2__Impl rule__FunctionalAssignment__Group__3 )
            // InternalRdsPP.g:1600:2: rule__FunctionalAssignment__Group__2__Impl rule__FunctionalAssignment__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__FunctionalAssignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionalAssignment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalAssignment__Group__2"


    // $ANTLR start "rule__FunctionalAssignment__Group__2__Impl"
    // InternalRdsPP.g:1607:1: rule__FunctionalAssignment__Group__2__Impl : ( ( rule__FunctionalAssignment__NameAssignment_2 ) ) ;
    public final void rule__FunctionalAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1611:1: ( ( ( rule__FunctionalAssignment__NameAssignment_2 ) ) )
            // InternalRdsPP.g:1612:1: ( ( rule__FunctionalAssignment__NameAssignment_2 ) )
            {
            // InternalRdsPP.g:1612:1: ( ( rule__FunctionalAssignment__NameAssignment_2 ) )
            // InternalRdsPP.g:1613:2: ( rule__FunctionalAssignment__NameAssignment_2 )
            {
             before(grammarAccess.getFunctionalAssignmentAccess().getNameAssignment_2()); 
            // InternalRdsPP.g:1614:2: ( rule__FunctionalAssignment__NameAssignment_2 )
            // InternalRdsPP.g:1614:3: rule__FunctionalAssignment__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FunctionalAssignment__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalAssignmentAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalAssignment__Group__2__Impl"


    // $ANTLR start "rule__FunctionalAssignment__Group__3"
    // InternalRdsPP.g:1622:1: rule__FunctionalAssignment__Group__3 : rule__FunctionalAssignment__Group__3__Impl ;
    public final void rule__FunctionalAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1626:1: ( rule__FunctionalAssignment__Group__3__Impl )
            // InternalRdsPP.g:1627:2: rule__FunctionalAssignment__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionalAssignment__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalAssignment__Group__3"


    // $ANTLR start "rule__FunctionalAssignment__Group__3__Impl"
    // InternalRdsPP.g:1633:1: rule__FunctionalAssignment__Group__3__Impl : ( ( rule__FunctionalAssignment__Group_3__0 )? ) ;
    public final void rule__FunctionalAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1637:1: ( ( ( rule__FunctionalAssignment__Group_3__0 )? ) )
            // InternalRdsPP.g:1638:1: ( ( rule__FunctionalAssignment__Group_3__0 )? )
            {
            // InternalRdsPP.g:1638:1: ( ( rule__FunctionalAssignment__Group_3__0 )? )
            // InternalRdsPP.g:1639:2: ( rule__FunctionalAssignment__Group_3__0 )?
            {
             before(grammarAccess.getFunctionalAssignmentAccess().getGroup_3()); 
            // InternalRdsPP.g:1640:2: ( rule__FunctionalAssignment__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRdsPP.g:1640:3: rule__FunctionalAssignment__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionalAssignment__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionalAssignmentAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalAssignment__Group__3__Impl"


    // $ANTLR start "rule__FunctionalAssignment__Group_3__0"
    // InternalRdsPP.g:1649:1: rule__FunctionalAssignment__Group_3__0 : rule__FunctionalAssignment__Group_3__0__Impl rule__FunctionalAssignment__Group_3__1 ;
    public final void rule__FunctionalAssignment__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1653:1: ( rule__FunctionalAssignment__Group_3__0__Impl rule__FunctionalAssignment__Group_3__1 )
            // InternalRdsPP.g:1654:2: rule__FunctionalAssignment__Group_3__0__Impl rule__FunctionalAssignment__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__FunctionalAssignment__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionalAssignment__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalAssignment__Group_3__0"


    // $ANTLR start "rule__FunctionalAssignment__Group_3__0__Impl"
    // InternalRdsPP.g:1661:1: rule__FunctionalAssignment__Group_3__0__Impl : ( '->' ) ;
    public final void rule__FunctionalAssignment__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1665:1: ( ( '->' ) )
            // InternalRdsPP.g:1666:1: ( '->' )
            {
            // InternalRdsPP.g:1666:1: ( '->' )
            // InternalRdsPP.g:1667:2: '->'
            {
             before(grammarAccess.getFunctionalAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFunctionalAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalAssignment__Group_3__0__Impl"


    // $ANTLR start "rule__FunctionalAssignment__Group_3__1"
    // InternalRdsPP.g:1676:1: rule__FunctionalAssignment__Group_3__1 : rule__FunctionalAssignment__Group_3__1__Impl ;
    public final void rule__FunctionalAssignment__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1680:1: ( rule__FunctionalAssignment__Group_3__1__Impl )
            // InternalRdsPP.g:1681:2: rule__FunctionalAssignment__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionalAssignment__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalAssignment__Group_3__1"


    // $ANTLR start "rule__FunctionalAssignment__Group_3__1__Impl"
    // InternalRdsPP.g:1687:1: rule__FunctionalAssignment__Group_3__1__Impl : ( ( rule__FunctionalAssignment__DescriptionAssignment_3_1 ) ) ;
    public final void rule__FunctionalAssignment__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1691:1: ( ( ( rule__FunctionalAssignment__DescriptionAssignment_3_1 ) ) )
            // InternalRdsPP.g:1692:1: ( ( rule__FunctionalAssignment__DescriptionAssignment_3_1 ) )
            {
            // InternalRdsPP.g:1692:1: ( ( rule__FunctionalAssignment__DescriptionAssignment_3_1 ) )
            // InternalRdsPP.g:1693:2: ( rule__FunctionalAssignment__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getFunctionalAssignmentAccess().getDescriptionAssignment_3_1()); 
            // InternalRdsPP.g:1694:2: ( rule__FunctionalAssignment__DescriptionAssignment_3_1 )
            // InternalRdsPP.g:1694:3: rule__FunctionalAssignment__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionalAssignment__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalAssignmentAccess().getDescriptionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalAssignment__Group_3__1__Impl"


    // $ANTLR start "rule__FunctionalDesignation__Group__0"
    // InternalRdsPP.g:1703:1: rule__FunctionalDesignation__Group__0 : rule__FunctionalDesignation__Group__0__Impl rule__FunctionalDesignation__Group__1 ;
    public final void rule__FunctionalDesignation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1707:1: ( rule__FunctionalDesignation__Group__0__Impl rule__FunctionalDesignation__Group__1 )
            // InternalRdsPP.g:1708:2: rule__FunctionalDesignation__Group__0__Impl rule__FunctionalDesignation__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__FunctionalDesignation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionalDesignation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalDesignation__Group__0"


    // $ANTLR start "rule__FunctionalDesignation__Group__0__Impl"
    // InternalRdsPP.g:1715:1: rule__FunctionalDesignation__Group__0__Impl : ( 'FUNKTIONSBEZOGENEKENNZEICHNUNG' ) ;
    public final void rule__FunctionalDesignation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1719:1: ( ( 'FUNKTIONSBEZOGENEKENNZEICHNUNG' ) )
            // InternalRdsPP.g:1720:1: ( 'FUNKTIONSBEZOGENEKENNZEICHNUNG' )
            {
            // InternalRdsPP.g:1720:1: ( 'FUNKTIONSBEZOGENEKENNZEICHNUNG' )
            // InternalRdsPP.g:1721:2: 'FUNKTIONSBEZOGENEKENNZEICHNUNG'
            {
             before(grammarAccess.getFunctionalDesignationAccess().getFUNKTIONSBEZOGENEKENNZEICHNUNGKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFunctionalDesignationAccess().getFUNKTIONSBEZOGENEKENNZEICHNUNGKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalDesignation__Group__0__Impl"


    // $ANTLR start "rule__FunctionalDesignation__Group__1"
    // InternalRdsPP.g:1730:1: rule__FunctionalDesignation__Group__1 : rule__FunctionalDesignation__Group__1__Impl rule__FunctionalDesignation__Group__2 ;
    public final void rule__FunctionalDesignation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1734:1: ( rule__FunctionalDesignation__Group__1__Impl rule__FunctionalDesignation__Group__2 )
            // InternalRdsPP.g:1735:2: rule__FunctionalDesignation__Group__1__Impl rule__FunctionalDesignation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__FunctionalDesignation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionalDesignation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalDesignation__Group__1"


    // $ANTLR start "rule__FunctionalDesignation__Group__1__Impl"
    // InternalRdsPP.g:1742:1: rule__FunctionalDesignation__Group__1__Impl : ( '=' ) ;
    public final void rule__FunctionalDesignation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1746:1: ( ( '=' ) )
            // InternalRdsPP.g:1747:1: ( '=' )
            {
            // InternalRdsPP.g:1747:1: ( '=' )
            // InternalRdsPP.g:1748:2: '='
            {
             before(grammarAccess.getFunctionalDesignationAccess().getEqualsSignKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFunctionalDesignationAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalDesignation__Group__1__Impl"


    // $ANTLR start "rule__FunctionalDesignation__Group__2"
    // InternalRdsPP.g:1757:1: rule__FunctionalDesignation__Group__2 : rule__FunctionalDesignation__Group__2__Impl rule__FunctionalDesignation__Group__3 ;
    public final void rule__FunctionalDesignation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1761:1: ( rule__FunctionalDesignation__Group__2__Impl rule__FunctionalDesignation__Group__3 )
            // InternalRdsPP.g:1762:2: rule__FunctionalDesignation__Group__2__Impl rule__FunctionalDesignation__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__FunctionalDesignation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionalDesignation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalDesignation__Group__2"


    // $ANTLR start "rule__FunctionalDesignation__Group__2__Impl"
    // InternalRdsPP.g:1769:1: rule__FunctionalDesignation__Group__2__Impl : ( ( rule__FunctionalDesignation__NameAssignment_2 ) ) ;
    public final void rule__FunctionalDesignation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1773:1: ( ( ( rule__FunctionalDesignation__NameAssignment_2 ) ) )
            // InternalRdsPP.g:1774:1: ( ( rule__FunctionalDesignation__NameAssignment_2 ) )
            {
            // InternalRdsPP.g:1774:1: ( ( rule__FunctionalDesignation__NameAssignment_2 ) )
            // InternalRdsPP.g:1775:2: ( rule__FunctionalDesignation__NameAssignment_2 )
            {
             before(grammarAccess.getFunctionalDesignationAccess().getNameAssignment_2()); 
            // InternalRdsPP.g:1776:2: ( rule__FunctionalDesignation__NameAssignment_2 )
            // InternalRdsPP.g:1776:3: rule__FunctionalDesignation__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FunctionalDesignation__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalDesignationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalDesignation__Group__2__Impl"


    // $ANTLR start "rule__FunctionalDesignation__Group__3"
    // InternalRdsPP.g:1784:1: rule__FunctionalDesignation__Group__3 : rule__FunctionalDesignation__Group__3__Impl ;
    public final void rule__FunctionalDesignation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1788:1: ( rule__FunctionalDesignation__Group__3__Impl )
            // InternalRdsPP.g:1789:2: rule__FunctionalDesignation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionalDesignation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalDesignation__Group__3"


    // $ANTLR start "rule__FunctionalDesignation__Group__3__Impl"
    // InternalRdsPP.g:1795:1: rule__FunctionalDesignation__Group__3__Impl : ( ( rule__FunctionalDesignation__Group_3__0 )? ) ;
    public final void rule__FunctionalDesignation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1799:1: ( ( ( rule__FunctionalDesignation__Group_3__0 )? ) )
            // InternalRdsPP.g:1800:1: ( ( rule__FunctionalDesignation__Group_3__0 )? )
            {
            // InternalRdsPP.g:1800:1: ( ( rule__FunctionalDesignation__Group_3__0 )? )
            // InternalRdsPP.g:1801:2: ( rule__FunctionalDesignation__Group_3__0 )?
            {
             before(grammarAccess.getFunctionalDesignationAccess().getGroup_3()); 
            // InternalRdsPP.g:1802:2: ( rule__FunctionalDesignation__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRdsPP.g:1802:3: rule__FunctionalDesignation__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionalDesignation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionalDesignationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalDesignation__Group__3__Impl"


    // $ANTLR start "rule__FunctionalDesignation__Group_3__0"
    // InternalRdsPP.g:1811:1: rule__FunctionalDesignation__Group_3__0 : rule__FunctionalDesignation__Group_3__0__Impl rule__FunctionalDesignation__Group_3__1 ;
    public final void rule__FunctionalDesignation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1815:1: ( rule__FunctionalDesignation__Group_3__0__Impl rule__FunctionalDesignation__Group_3__1 )
            // InternalRdsPP.g:1816:2: rule__FunctionalDesignation__Group_3__0__Impl rule__FunctionalDesignation__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__FunctionalDesignation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionalDesignation__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalDesignation__Group_3__0"


    // $ANTLR start "rule__FunctionalDesignation__Group_3__0__Impl"
    // InternalRdsPP.g:1823:1: rule__FunctionalDesignation__Group_3__0__Impl : ( '->' ) ;
    public final void rule__FunctionalDesignation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1827:1: ( ( '->' ) )
            // InternalRdsPP.g:1828:1: ( '->' )
            {
            // InternalRdsPP.g:1828:1: ( '->' )
            // InternalRdsPP.g:1829:2: '->'
            {
             before(grammarAccess.getFunctionalDesignationAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFunctionalDesignationAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalDesignation__Group_3__0__Impl"


    // $ANTLR start "rule__FunctionalDesignation__Group_3__1"
    // InternalRdsPP.g:1838:1: rule__FunctionalDesignation__Group_3__1 : rule__FunctionalDesignation__Group_3__1__Impl ;
    public final void rule__FunctionalDesignation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1842:1: ( rule__FunctionalDesignation__Group_3__1__Impl )
            // InternalRdsPP.g:1843:2: rule__FunctionalDesignation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionalDesignation__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalDesignation__Group_3__1"


    // $ANTLR start "rule__FunctionalDesignation__Group_3__1__Impl"
    // InternalRdsPP.g:1849:1: rule__FunctionalDesignation__Group_3__1__Impl : ( ( rule__FunctionalDesignation__DescriptionAssignment_3_1 ) ) ;
    public final void rule__FunctionalDesignation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1853:1: ( ( ( rule__FunctionalDesignation__DescriptionAssignment_3_1 ) ) )
            // InternalRdsPP.g:1854:1: ( ( rule__FunctionalDesignation__DescriptionAssignment_3_1 ) )
            {
            // InternalRdsPP.g:1854:1: ( ( rule__FunctionalDesignation__DescriptionAssignment_3_1 ) )
            // InternalRdsPP.g:1855:2: ( rule__FunctionalDesignation__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getFunctionalDesignationAccess().getDescriptionAssignment_3_1()); 
            // InternalRdsPP.g:1856:2: ( rule__FunctionalDesignation__DescriptionAssignment_3_1 )
            // InternalRdsPP.g:1856:3: rule__FunctionalDesignation__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionalDesignation__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionalDesignationAccess().getDescriptionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalDesignation__Group_3__1__Impl"


    // $ANTLR start "rule__InstallationLocationDescription__Group__0"
    // InternalRdsPP.g:1865:1: rule__InstallationLocationDescription__Group__0 : rule__InstallationLocationDescription__Group__0__Impl rule__InstallationLocationDescription__Group__1 ;
    public final void rule__InstallationLocationDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1869:1: ( rule__InstallationLocationDescription__Group__0__Impl rule__InstallationLocationDescription__Group__1 )
            // InternalRdsPP.g:1870:2: rule__InstallationLocationDescription__Group__0__Impl rule__InstallationLocationDescription__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__InstallationLocationDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstallationLocationDescription__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstallationLocationDescription__Group__0"


    // $ANTLR start "rule__InstallationLocationDescription__Group__0__Impl"
    // InternalRdsPP.g:1877:1: rule__InstallationLocationDescription__Group__0__Impl : ( 'EINBAUORTKENNZEICHNUNG' ) ;
    public final void rule__InstallationLocationDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1881:1: ( ( 'EINBAUORTKENNZEICHNUNG' ) )
            // InternalRdsPP.g:1882:1: ( 'EINBAUORTKENNZEICHNUNG' )
            {
            // InternalRdsPP.g:1882:1: ( 'EINBAUORTKENNZEICHNUNG' )
            // InternalRdsPP.g:1883:2: 'EINBAUORTKENNZEICHNUNG'
            {
             before(grammarAccess.getInstallationLocationDescriptionAccess().getEINBAUORTKENNZEICHNUNGKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getInstallationLocationDescriptionAccess().getEINBAUORTKENNZEICHNUNGKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstallationLocationDescription__Group__0__Impl"


    // $ANTLR start "rule__InstallationLocationDescription__Group__1"
    // InternalRdsPP.g:1892:1: rule__InstallationLocationDescription__Group__1 : rule__InstallationLocationDescription__Group__1__Impl rule__InstallationLocationDescription__Group__2 ;
    public final void rule__InstallationLocationDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1896:1: ( rule__InstallationLocationDescription__Group__1__Impl rule__InstallationLocationDescription__Group__2 )
            // InternalRdsPP.g:1897:2: rule__InstallationLocationDescription__Group__1__Impl rule__InstallationLocationDescription__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__InstallationLocationDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstallationLocationDescription__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstallationLocationDescription__Group__1"


    // $ANTLR start "rule__InstallationLocationDescription__Group__1__Impl"
    // InternalRdsPP.g:1904:1: rule__InstallationLocationDescription__Group__1__Impl : ( '+' ) ;
    public final void rule__InstallationLocationDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1908:1: ( ( '+' ) )
            // InternalRdsPP.g:1909:1: ( '+' )
            {
            // InternalRdsPP.g:1909:1: ( '+' )
            // InternalRdsPP.g:1910:2: '+'
            {
             before(grammarAccess.getInstallationLocationDescriptionAccess().getPlusSignKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getInstallationLocationDescriptionAccess().getPlusSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstallationLocationDescription__Group__1__Impl"


    // $ANTLR start "rule__InstallationLocationDescription__Group__2"
    // InternalRdsPP.g:1919:1: rule__InstallationLocationDescription__Group__2 : rule__InstallationLocationDescription__Group__2__Impl rule__InstallationLocationDescription__Group__3 ;
    public final void rule__InstallationLocationDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1923:1: ( rule__InstallationLocationDescription__Group__2__Impl rule__InstallationLocationDescription__Group__3 )
            // InternalRdsPP.g:1924:2: rule__InstallationLocationDescription__Group__2__Impl rule__InstallationLocationDescription__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__InstallationLocationDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstallationLocationDescription__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstallationLocationDescription__Group__2"


    // $ANTLR start "rule__InstallationLocationDescription__Group__2__Impl"
    // InternalRdsPP.g:1931:1: rule__InstallationLocationDescription__Group__2__Impl : ( ( rule__InstallationLocationDescription__NameAssignment_2 ) ) ;
    public final void rule__InstallationLocationDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1935:1: ( ( ( rule__InstallationLocationDescription__NameAssignment_2 ) ) )
            // InternalRdsPP.g:1936:1: ( ( rule__InstallationLocationDescription__NameAssignment_2 ) )
            {
            // InternalRdsPP.g:1936:1: ( ( rule__InstallationLocationDescription__NameAssignment_2 ) )
            // InternalRdsPP.g:1937:2: ( rule__InstallationLocationDescription__NameAssignment_2 )
            {
             before(grammarAccess.getInstallationLocationDescriptionAccess().getNameAssignment_2()); 
            // InternalRdsPP.g:1938:2: ( rule__InstallationLocationDescription__NameAssignment_2 )
            // InternalRdsPP.g:1938:3: rule__InstallationLocationDescription__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InstallationLocationDescription__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInstallationLocationDescriptionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstallationLocationDescription__Group__2__Impl"


    // $ANTLR start "rule__InstallationLocationDescription__Group__3"
    // InternalRdsPP.g:1946:1: rule__InstallationLocationDescription__Group__3 : rule__InstallationLocationDescription__Group__3__Impl ;
    public final void rule__InstallationLocationDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1950:1: ( rule__InstallationLocationDescription__Group__3__Impl )
            // InternalRdsPP.g:1951:2: rule__InstallationLocationDescription__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstallationLocationDescription__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstallationLocationDescription__Group__3"


    // $ANTLR start "rule__InstallationLocationDescription__Group__3__Impl"
    // InternalRdsPP.g:1957:1: rule__InstallationLocationDescription__Group__3__Impl : ( ( rule__InstallationLocationDescription__Group_3__0 )? ) ;
    public final void rule__InstallationLocationDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1961:1: ( ( ( rule__InstallationLocationDescription__Group_3__0 )? ) )
            // InternalRdsPP.g:1962:1: ( ( rule__InstallationLocationDescription__Group_3__0 )? )
            {
            // InternalRdsPP.g:1962:1: ( ( rule__InstallationLocationDescription__Group_3__0 )? )
            // InternalRdsPP.g:1963:2: ( rule__InstallationLocationDescription__Group_3__0 )?
            {
             before(grammarAccess.getInstallationLocationDescriptionAccess().getGroup_3()); 
            // InternalRdsPP.g:1964:2: ( rule__InstallationLocationDescription__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRdsPP.g:1964:3: rule__InstallationLocationDescription__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InstallationLocationDescription__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInstallationLocationDescriptionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstallationLocationDescription__Group__3__Impl"


    // $ANTLR start "rule__InstallationLocationDescription__Group_3__0"
    // InternalRdsPP.g:1973:1: rule__InstallationLocationDescription__Group_3__0 : rule__InstallationLocationDescription__Group_3__0__Impl rule__InstallationLocationDescription__Group_3__1 ;
    public final void rule__InstallationLocationDescription__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1977:1: ( rule__InstallationLocationDescription__Group_3__0__Impl rule__InstallationLocationDescription__Group_3__1 )
            // InternalRdsPP.g:1978:2: rule__InstallationLocationDescription__Group_3__0__Impl rule__InstallationLocationDescription__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__InstallationLocationDescription__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InstallationLocationDescription__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstallationLocationDescription__Group_3__0"


    // $ANTLR start "rule__InstallationLocationDescription__Group_3__0__Impl"
    // InternalRdsPP.g:1985:1: rule__InstallationLocationDescription__Group_3__0__Impl : ( '->' ) ;
    public final void rule__InstallationLocationDescription__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:1989:1: ( ( '->' ) )
            // InternalRdsPP.g:1990:1: ( '->' )
            {
            // InternalRdsPP.g:1990:1: ( '->' )
            // InternalRdsPP.g:1991:2: '->'
            {
             before(grammarAccess.getInstallationLocationDescriptionAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInstallationLocationDescriptionAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstallationLocationDescription__Group_3__0__Impl"


    // $ANTLR start "rule__InstallationLocationDescription__Group_3__1"
    // InternalRdsPP.g:2000:1: rule__InstallationLocationDescription__Group_3__1 : rule__InstallationLocationDescription__Group_3__1__Impl ;
    public final void rule__InstallationLocationDescription__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2004:1: ( rule__InstallationLocationDescription__Group_3__1__Impl )
            // InternalRdsPP.g:2005:2: rule__InstallationLocationDescription__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstallationLocationDescription__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstallationLocationDescription__Group_3__1"


    // $ANTLR start "rule__InstallationLocationDescription__Group_3__1__Impl"
    // InternalRdsPP.g:2011:1: rule__InstallationLocationDescription__Group_3__1__Impl : ( ( rule__InstallationLocationDescription__DescriptionAssignment_3_1 ) ) ;
    public final void rule__InstallationLocationDescription__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2015:1: ( ( ( rule__InstallationLocationDescription__DescriptionAssignment_3_1 ) ) )
            // InternalRdsPP.g:2016:1: ( ( rule__InstallationLocationDescription__DescriptionAssignment_3_1 ) )
            {
            // InternalRdsPP.g:2016:1: ( ( rule__InstallationLocationDescription__DescriptionAssignment_3_1 ) )
            // InternalRdsPP.g:2017:2: ( rule__InstallationLocationDescription__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getInstallationLocationDescriptionAccess().getDescriptionAssignment_3_1()); 
            // InternalRdsPP.g:2018:2: ( rule__InstallationLocationDescription__DescriptionAssignment_3_1 )
            // InternalRdsPP.g:2018:3: rule__InstallationLocationDescription__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__InstallationLocationDescription__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInstallationLocationDescriptionAccess().getDescriptionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstallationLocationDescription__Group_3__1__Impl"


    // $ANTLR start "rule__LocationDescription__Group__0"
    // InternalRdsPP.g:2027:1: rule__LocationDescription__Group__0 : rule__LocationDescription__Group__0__Impl rule__LocationDescription__Group__1 ;
    public final void rule__LocationDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2031:1: ( rule__LocationDescription__Group__0__Impl rule__LocationDescription__Group__1 )
            // InternalRdsPP.g:2032:2: rule__LocationDescription__Group__0__Impl rule__LocationDescription__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__LocationDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocationDescription__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationDescription__Group__0"


    // $ANTLR start "rule__LocationDescription__Group__0__Impl"
    // InternalRdsPP.g:2039:1: rule__LocationDescription__Group__0__Impl : ( 'AUFSTELLUNGSORTKENNZEICHNUNG' ) ;
    public final void rule__LocationDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2043:1: ( ( 'AUFSTELLUNGSORTKENNZEICHNUNG' ) )
            // InternalRdsPP.g:2044:1: ( 'AUFSTELLUNGSORTKENNZEICHNUNG' )
            {
            // InternalRdsPP.g:2044:1: ( 'AUFSTELLUNGSORTKENNZEICHNUNG' )
            // InternalRdsPP.g:2045:2: 'AUFSTELLUNGSORTKENNZEICHNUNG'
            {
             before(grammarAccess.getLocationDescriptionAccess().getAUFSTELLUNGSORTKENNZEICHNUNGKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLocationDescriptionAccess().getAUFSTELLUNGSORTKENNZEICHNUNGKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationDescription__Group__0__Impl"


    // $ANTLR start "rule__LocationDescription__Group__1"
    // InternalRdsPP.g:2054:1: rule__LocationDescription__Group__1 : rule__LocationDescription__Group__1__Impl rule__LocationDescription__Group__2 ;
    public final void rule__LocationDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2058:1: ( rule__LocationDescription__Group__1__Impl rule__LocationDescription__Group__2 )
            // InternalRdsPP.g:2059:2: rule__LocationDescription__Group__1__Impl rule__LocationDescription__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__LocationDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocationDescription__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationDescription__Group__1"


    // $ANTLR start "rule__LocationDescription__Group__1__Impl"
    // InternalRdsPP.g:2066:1: rule__LocationDescription__Group__1__Impl : ( '++' ) ;
    public final void rule__LocationDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2070:1: ( ( '++' ) )
            // InternalRdsPP.g:2071:1: ( '++' )
            {
            // InternalRdsPP.g:2071:1: ( '++' )
            // InternalRdsPP.g:2072:2: '++'
            {
             before(grammarAccess.getLocationDescriptionAccess().getPlusSignPlusSignKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLocationDescriptionAccess().getPlusSignPlusSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationDescription__Group__1__Impl"


    // $ANTLR start "rule__LocationDescription__Group__2"
    // InternalRdsPP.g:2081:1: rule__LocationDescription__Group__2 : rule__LocationDescription__Group__2__Impl rule__LocationDescription__Group__3 ;
    public final void rule__LocationDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2085:1: ( rule__LocationDescription__Group__2__Impl rule__LocationDescription__Group__3 )
            // InternalRdsPP.g:2086:2: rule__LocationDescription__Group__2__Impl rule__LocationDescription__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__LocationDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocationDescription__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationDescription__Group__2"


    // $ANTLR start "rule__LocationDescription__Group__2__Impl"
    // InternalRdsPP.g:2093:1: rule__LocationDescription__Group__2__Impl : ( ( rule__LocationDescription__NameAssignment_2 ) ) ;
    public final void rule__LocationDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2097:1: ( ( ( rule__LocationDescription__NameAssignment_2 ) ) )
            // InternalRdsPP.g:2098:1: ( ( rule__LocationDescription__NameAssignment_2 ) )
            {
            // InternalRdsPP.g:2098:1: ( ( rule__LocationDescription__NameAssignment_2 ) )
            // InternalRdsPP.g:2099:2: ( rule__LocationDescription__NameAssignment_2 )
            {
             before(grammarAccess.getLocationDescriptionAccess().getNameAssignment_2()); 
            // InternalRdsPP.g:2100:2: ( rule__LocationDescription__NameAssignment_2 )
            // InternalRdsPP.g:2100:3: rule__LocationDescription__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LocationDescription__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLocationDescriptionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationDescription__Group__2__Impl"


    // $ANTLR start "rule__LocationDescription__Group__3"
    // InternalRdsPP.g:2108:1: rule__LocationDescription__Group__3 : rule__LocationDescription__Group__3__Impl ;
    public final void rule__LocationDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2112:1: ( rule__LocationDescription__Group__3__Impl )
            // InternalRdsPP.g:2113:2: rule__LocationDescription__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocationDescription__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationDescription__Group__3"


    // $ANTLR start "rule__LocationDescription__Group__3__Impl"
    // InternalRdsPP.g:2119:1: rule__LocationDescription__Group__3__Impl : ( ( rule__LocationDescription__Group_3__0 )? ) ;
    public final void rule__LocationDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2123:1: ( ( ( rule__LocationDescription__Group_3__0 )? ) )
            // InternalRdsPP.g:2124:1: ( ( rule__LocationDescription__Group_3__0 )? )
            {
            // InternalRdsPP.g:2124:1: ( ( rule__LocationDescription__Group_3__0 )? )
            // InternalRdsPP.g:2125:2: ( rule__LocationDescription__Group_3__0 )?
            {
             before(grammarAccess.getLocationDescriptionAccess().getGroup_3()); 
            // InternalRdsPP.g:2126:2: ( rule__LocationDescription__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRdsPP.g:2126:3: rule__LocationDescription__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocationDescription__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLocationDescriptionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationDescription__Group__3__Impl"


    // $ANTLR start "rule__LocationDescription__Group_3__0"
    // InternalRdsPP.g:2135:1: rule__LocationDescription__Group_3__0 : rule__LocationDescription__Group_3__0__Impl rule__LocationDescription__Group_3__1 ;
    public final void rule__LocationDescription__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2139:1: ( rule__LocationDescription__Group_3__0__Impl rule__LocationDescription__Group_3__1 )
            // InternalRdsPP.g:2140:2: rule__LocationDescription__Group_3__0__Impl rule__LocationDescription__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__LocationDescription__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocationDescription__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationDescription__Group_3__0"


    // $ANTLR start "rule__LocationDescription__Group_3__0__Impl"
    // InternalRdsPP.g:2147:1: rule__LocationDescription__Group_3__0__Impl : ( '->' ) ;
    public final void rule__LocationDescription__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2151:1: ( ( '->' ) )
            // InternalRdsPP.g:2152:1: ( '->' )
            {
            // InternalRdsPP.g:2152:1: ( '->' )
            // InternalRdsPP.g:2153:2: '->'
            {
             before(grammarAccess.getLocationDescriptionAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLocationDescriptionAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationDescription__Group_3__0__Impl"


    // $ANTLR start "rule__LocationDescription__Group_3__1"
    // InternalRdsPP.g:2162:1: rule__LocationDescription__Group_3__1 : rule__LocationDescription__Group_3__1__Impl ;
    public final void rule__LocationDescription__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2166:1: ( rule__LocationDescription__Group_3__1__Impl )
            // InternalRdsPP.g:2167:2: rule__LocationDescription__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocationDescription__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationDescription__Group_3__1"


    // $ANTLR start "rule__LocationDescription__Group_3__1__Impl"
    // InternalRdsPP.g:2173:1: rule__LocationDescription__Group_3__1__Impl : ( ( rule__LocationDescription__DescriptionAssignment_3_1 ) ) ;
    public final void rule__LocationDescription__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2177:1: ( ( ( rule__LocationDescription__DescriptionAssignment_3_1 ) ) )
            // InternalRdsPP.g:2178:1: ( ( rule__LocationDescription__DescriptionAssignment_3_1 ) )
            {
            // InternalRdsPP.g:2178:1: ( ( rule__LocationDescription__DescriptionAssignment_3_1 ) )
            // InternalRdsPP.g:2179:2: ( rule__LocationDescription__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getLocationDescriptionAccess().getDescriptionAssignment_3_1()); 
            // InternalRdsPP.g:2180:2: ( rule__LocationDescription__DescriptionAssignment_3_1 )
            // InternalRdsPP.g:2180:3: rule__LocationDescription__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LocationDescription__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLocationDescriptionAccess().getDescriptionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationDescription__Group_3__1__Impl"


    // $ANTLR start "rule__ConnectionIdentification__Group__0"
    // InternalRdsPP.g:2189:1: rule__ConnectionIdentification__Group__0 : rule__ConnectionIdentification__Group__0__Impl rule__ConnectionIdentification__Group__1 ;
    public final void rule__ConnectionIdentification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2193:1: ( rule__ConnectionIdentification__Group__0__Impl rule__ConnectionIdentification__Group__1 )
            // InternalRdsPP.g:2194:2: rule__ConnectionIdentification__Group__0__Impl rule__ConnectionIdentification__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ConnectionIdentification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectionIdentification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionIdentification__Group__0"


    // $ANTLR start "rule__ConnectionIdentification__Group__0__Impl"
    // InternalRdsPP.g:2201:1: rule__ConnectionIdentification__Group__0__Impl : ( 'ANSCHLUSSKENNZEICHNUNG' ) ;
    public final void rule__ConnectionIdentification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2205:1: ( ( 'ANSCHLUSSKENNZEICHNUNG' ) )
            // InternalRdsPP.g:2206:1: ( 'ANSCHLUSSKENNZEICHNUNG' )
            {
            // InternalRdsPP.g:2206:1: ( 'ANSCHLUSSKENNZEICHNUNG' )
            // InternalRdsPP.g:2207:2: 'ANSCHLUSSKENNZEICHNUNG'
            {
             before(grammarAccess.getConnectionIdentificationAccess().getANSCHLUSSKENNZEICHNUNGKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getConnectionIdentificationAccess().getANSCHLUSSKENNZEICHNUNGKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionIdentification__Group__0__Impl"


    // $ANTLR start "rule__ConnectionIdentification__Group__1"
    // InternalRdsPP.g:2216:1: rule__ConnectionIdentification__Group__1 : rule__ConnectionIdentification__Group__1__Impl rule__ConnectionIdentification__Group__2 ;
    public final void rule__ConnectionIdentification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2220:1: ( rule__ConnectionIdentification__Group__1__Impl rule__ConnectionIdentification__Group__2 )
            // InternalRdsPP.g:2221:2: rule__ConnectionIdentification__Group__1__Impl rule__ConnectionIdentification__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ConnectionIdentification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectionIdentification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionIdentification__Group__1"


    // $ANTLR start "rule__ConnectionIdentification__Group__1__Impl"
    // InternalRdsPP.g:2228:1: rule__ConnectionIdentification__Group__1__Impl : ( ':' ) ;
    public final void rule__ConnectionIdentification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2232:1: ( ( ':' ) )
            // InternalRdsPP.g:2233:1: ( ':' )
            {
            // InternalRdsPP.g:2233:1: ( ':' )
            // InternalRdsPP.g:2234:2: ':'
            {
             before(grammarAccess.getConnectionIdentificationAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getConnectionIdentificationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionIdentification__Group__1__Impl"


    // $ANTLR start "rule__ConnectionIdentification__Group__2"
    // InternalRdsPP.g:2243:1: rule__ConnectionIdentification__Group__2 : rule__ConnectionIdentification__Group__2__Impl rule__ConnectionIdentification__Group__3 ;
    public final void rule__ConnectionIdentification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2247:1: ( rule__ConnectionIdentification__Group__2__Impl rule__ConnectionIdentification__Group__3 )
            // InternalRdsPP.g:2248:2: rule__ConnectionIdentification__Group__2__Impl rule__ConnectionIdentification__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ConnectionIdentification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectionIdentification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionIdentification__Group__2"


    // $ANTLR start "rule__ConnectionIdentification__Group__2__Impl"
    // InternalRdsPP.g:2255:1: rule__ConnectionIdentification__Group__2__Impl : ( ( rule__ConnectionIdentification__NameAssignment_2 ) ) ;
    public final void rule__ConnectionIdentification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2259:1: ( ( ( rule__ConnectionIdentification__NameAssignment_2 ) ) )
            // InternalRdsPP.g:2260:1: ( ( rule__ConnectionIdentification__NameAssignment_2 ) )
            {
            // InternalRdsPP.g:2260:1: ( ( rule__ConnectionIdentification__NameAssignment_2 ) )
            // InternalRdsPP.g:2261:2: ( rule__ConnectionIdentification__NameAssignment_2 )
            {
             before(grammarAccess.getConnectionIdentificationAccess().getNameAssignment_2()); 
            // InternalRdsPP.g:2262:2: ( rule__ConnectionIdentification__NameAssignment_2 )
            // InternalRdsPP.g:2262:3: rule__ConnectionIdentification__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionIdentification__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConnectionIdentificationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionIdentification__Group__2__Impl"


    // $ANTLR start "rule__ConnectionIdentification__Group__3"
    // InternalRdsPP.g:2270:1: rule__ConnectionIdentification__Group__3 : rule__ConnectionIdentification__Group__3__Impl ;
    public final void rule__ConnectionIdentification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2274:1: ( rule__ConnectionIdentification__Group__3__Impl )
            // InternalRdsPP.g:2275:2: rule__ConnectionIdentification__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionIdentification__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionIdentification__Group__3"


    // $ANTLR start "rule__ConnectionIdentification__Group__3__Impl"
    // InternalRdsPP.g:2281:1: rule__ConnectionIdentification__Group__3__Impl : ( ( rule__ConnectionIdentification__Group_3__0 )? ) ;
    public final void rule__ConnectionIdentification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2285:1: ( ( ( rule__ConnectionIdentification__Group_3__0 )? ) )
            // InternalRdsPP.g:2286:1: ( ( rule__ConnectionIdentification__Group_3__0 )? )
            {
            // InternalRdsPP.g:2286:1: ( ( rule__ConnectionIdentification__Group_3__0 )? )
            // InternalRdsPP.g:2287:2: ( rule__ConnectionIdentification__Group_3__0 )?
            {
             before(grammarAccess.getConnectionIdentificationAccess().getGroup_3()); 
            // InternalRdsPP.g:2288:2: ( rule__ConnectionIdentification__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRdsPP.g:2288:3: rule__ConnectionIdentification__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConnectionIdentification__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectionIdentificationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionIdentification__Group__3__Impl"


    // $ANTLR start "rule__ConnectionIdentification__Group_3__0"
    // InternalRdsPP.g:2297:1: rule__ConnectionIdentification__Group_3__0 : rule__ConnectionIdentification__Group_3__0__Impl rule__ConnectionIdentification__Group_3__1 ;
    public final void rule__ConnectionIdentification__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2301:1: ( rule__ConnectionIdentification__Group_3__0__Impl rule__ConnectionIdentification__Group_3__1 )
            // InternalRdsPP.g:2302:2: rule__ConnectionIdentification__Group_3__0__Impl rule__ConnectionIdentification__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__ConnectionIdentification__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConnectionIdentification__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionIdentification__Group_3__0"


    // $ANTLR start "rule__ConnectionIdentification__Group_3__0__Impl"
    // InternalRdsPP.g:2309:1: rule__ConnectionIdentification__Group_3__0__Impl : ( '->' ) ;
    public final void rule__ConnectionIdentification__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2313:1: ( ( '->' ) )
            // InternalRdsPP.g:2314:1: ( '->' )
            {
            // InternalRdsPP.g:2314:1: ( '->' )
            // InternalRdsPP.g:2315:2: '->'
            {
             before(grammarAccess.getConnectionIdentificationAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConnectionIdentificationAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionIdentification__Group_3__0__Impl"


    // $ANTLR start "rule__ConnectionIdentification__Group_3__1"
    // InternalRdsPP.g:2324:1: rule__ConnectionIdentification__Group_3__1 : rule__ConnectionIdentification__Group_3__1__Impl ;
    public final void rule__ConnectionIdentification__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2328:1: ( rule__ConnectionIdentification__Group_3__1__Impl )
            // InternalRdsPP.g:2329:2: rule__ConnectionIdentification__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionIdentification__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionIdentification__Group_3__1"


    // $ANTLR start "rule__ConnectionIdentification__Group_3__1__Impl"
    // InternalRdsPP.g:2335:1: rule__ConnectionIdentification__Group_3__1__Impl : ( ( rule__ConnectionIdentification__DescriptionAssignment_3_1 ) ) ;
    public final void rule__ConnectionIdentification__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2339:1: ( ( ( rule__ConnectionIdentification__DescriptionAssignment_3_1 ) ) )
            // InternalRdsPP.g:2340:1: ( ( rule__ConnectionIdentification__DescriptionAssignment_3_1 ) )
            {
            // InternalRdsPP.g:2340:1: ( ( rule__ConnectionIdentification__DescriptionAssignment_3_1 ) )
            // InternalRdsPP.g:2341:2: ( rule__ConnectionIdentification__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getConnectionIdentificationAccess().getDescriptionAssignment_3_1()); 
            // InternalRdsPP.g:2342:2: ( rule__ConnectionIdentification__DescriptionAssignment_3_1 )
            // InternalRdsPP.g:2342:3: rule__ConnectionIdentification__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionIdentification__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionIdentificationAccess().getDescriptionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionIdentification__Group_3__1__Impl"


    // $ANTLR start "rule__CommonAssignment__Group__0"
    // InternalRdsPP.g:2351:1: rule__CommonAssignment__Group__0 : rule__CommonAssignment__Group__0__Impl rule__CommonAssignment__Group__1 ;
    public final void rule__CommonAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2355:1: ( rule__CommonAssignment__Group__0__Impl rule__CommonAssignment__Group__1 )
            // InternalRdsPP.g:2356:2: rule__CommonAssignment__Group__0__Impl rule__CommonAssignment__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__CommonAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommonAssignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonAssignment__Group__0"


    // $ANTLR start "rule__CommonAssignment__Group__0__Impl"
    // InternalRdsPP.g:2363:1: rule__CommonAssignment__Group__0__Impl : ( 'GEMEINSAMEZUORDNUNG' ) ;
    public final void rule__CommonAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2367:1: ( ( 'GEMEINSAMEZUORDNUNG' ) )
            // InternalRdsPP.g:2368:1: ( 'GEMEINSAMEZUORDNUNG' )
            {
            // InternalRdsPP.g:2368:1: ( 'GEMEINSAMEZUORDNUNG' )
            // InternalRdsPP.g:2369:2: 'GEMEINSAMEZUORDNUNG'
            {
             before(grammarAccess.getCommonAssignmentAccess().getGEMEINSAMEZUORDNUNGKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCommonAssignmentAccess().getGEMEINSAMEZUORDNUNGKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonAssignment__Group__0__Impl"


    // $ANTLR start "rule__CommonAssignment__Group__1"
    // InternalRdsPP.g:2378:1: rule__CommonAssignment__Group__1 : rule__CommonAssignment__Group__1__Impl rule__CommonAssignment__Group__2 ;
    public final void rule__CommonAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2382:1: ( rule__CommonAssignment__Group__1__Impl rule__CommonAssignment__Group__2 )
            // InternalRdsPP.g:2383:2: rule__CommonAssignment__Group__1__Impl rule__CommonAssignment__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__CommonAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommonAssignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonAssignment__Group__1"


    // $ANTLR start "rule__CommonAssignment__Group__1__Impl"
    // InternalRdsPP.g:2390:1: rule__CommonAssignment__Group__1__Impl : ( '#' ) ;
    public final void rule__CommonAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2394:1: ( ( '#' ) )
            // InternalRdsPP.g:2395:1: ( '#' )
            {
            // InternalRdsPP.g:2395:1: ( '#' )
            // InternalRdsPP.g:2396:2: '#'
            {
             before(grammarAccess.getCommonAssignmentAccess().getNumberSignKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCommonAssignmentAccess().getNumberSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonAssignment__Group__1__Impl"


    // $ANTLR start "rule__CommonAssignment__Group__2"
    // InternalRdsPP.g:2405:1: rule__CommonAssignment__Group__2 : rule__CommonAssignment__Group__2__Impl rule__CommonAssignment__Group__3 ;
    public final void rule__CommonAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2409:1: ( rule__CommonAssignment__Group__2__Impl rule__CommonAssignment__Group__3 )
            // InternalRdsPP.g:2410:2: rule__CommonAssignment__Group__2__Impl rule__CommonAssignment__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__CommonAssignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommonAssignment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonAssignment__Group__2"


    // $ANTLR start "rule__CommonAssignment__Group__2__Impl"
    // InternalRdsPP.g:2417:1: rule__CommonAssignment__Group__2__Impl : ( ( rule__CommonAssignment__NameAssignment_2 ) ) ;
    public final void rule__CommonAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2421:1: ( ( ( rule__CommonAssignment__NameAssignment_2 ) ) )
            // InternalRdsPP.g:2422:1: ( ( rule__CommonAssignment__NameAssignment_2 ) )
            {
            // InternalRdsPP.g:2422:1: ( ( rule__CommonAssignment__NameAssignment_2 ) )
            // InternalRdsPP.g:2423:2: ( rule__CommonAssignment__NameAssignment_2 )
            {
             before(grammarAccess.getCommonAssignmentAccess().getNameAssignment_2()); 
            // InternalRdsPP.g:2424:2: ( rule__CommonAssignment__NameAssignment_2 )
            // InternalRdsPP.g:2424:3: rule__CommonAssignment__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CommonAssignment__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCommonAssignmentAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonAssignment__Group__2__Impl"


    // $ANTLR start "rule__CommonAssignment__Group__3"
    // InternalRdsPP.g:2432:1: rule__CommonAssignment__Group__3 : rule__CommonAssignment__Group__3__Impl ;
    public final void rule__CommonAssignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2436:1: ( rule__CommonAssignment__Group__3__Impl )
            // InternalRdsPP.g:2437:2: rule__CommonAssignment__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommonAssignment__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonAssignment__Group__3"


    // $ANTLR start "rule__CommonAssignment__Group__3__Impl"
    // InternalRdsPP.g:2443:1: rule__CommonAssignment__Group__3__Impl : ( ( rule__CommonAssignment__Group_3__0 )? ) ;
    public final void rule__CommonAssignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2447:1: ( ( ( rule__CommonAssignment__Group_3__0 )? ) )
            // InternalRdsPP.g:2448:1: ( ( rule__CommonAssignment__Group_3__0 )? )
            {
            // InternalRdsPP.g:2448:1: ( ( rule__CommonAssignment__Group_3__0 )? )
            // InternalRdsPP.g:2449:2: ( rule__CommonAssignment__Group_3__0 )?
            {
             before(grammarAccess.getCommonAssignmentAccess().getGroup_3()); 
            // InternalRdsPP.g:2450:2: ( rule__CommonAssignment__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRdsPP.g:2450:3: rule__CommonAssignment__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CommonAssignment__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommonAssignmentAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonAssignment__Group__3__Impl"


    // $ANTLR start "rule__CommonAssignment__Group_3__0"
    // InternalRdsPP.g:2459:1: rule__CommonAssignment__Group_3__0 : rule__CommonAssignment__Group_3__0__Impl rule__CommonAssignment__Group_3__1 ;
    public final void rule__CommonAssignment__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2463:1: ( rule__CommonAssignment__Group_3__0__Impl rule__CommonAssignment__Group_3__1 )
            // InternalRdsPP.g:2464:2: rule__CommonAssignment__Group_3__0__Impl rule__CommonAssignment__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__CommonAssignment__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommonAssignment__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonAssignment__Group_3__0"


    // $ANTLR start "rule__CommonAssignment__Group_3__0__Impl"
    // InternalRdsPP.g:2471:1: rule__CommonAssignment__Group_3__0__Impl : ( '->' ) ;
    public final void rule__CommonAssignment__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2475:1: ( ( '->' ) )
            // InternalRdsPP.g:2476:1: ( '->' )
            {
            // InternalRdsPP.g:2476:1: ( '->' )
            // InternalRdsPP.g:2477:2: '->'
            {
             before(grammarAccess.getCommonAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCommonAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonAssignment__Group_3__0__Impl"


    // $ANTLR start "rule__CommonAssignment__Group_3__1"
    // InternalRdsPP.g:2486:1: rule__CommonAssignment__Group_3__1 : rule__CommonAssignment__Group_3__1__Impl ;
    public final void rule__CommonAssignment__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2490:1: ( rule__CommonAssignment__Group_3__1__Impl )
            // InternalRdsPP.g:2491:2: rule__CommonAssignment__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommonAssignment__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonAssignment__Group_3__1"


    // $ANTLR start "rule__CommonAssignment__Group_3__1__Impl"
    // InternalRdsPP.g:2497:1: rule__CommonAssignment__Group_3__1__Impl : ( ( rule__CommonAssignment__DescriptionAssignment_3_1 ) ) ;
    public final void rule__CommonAssignment__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2501:1: ( ( ( rule__CommonAssignment__DescriptionAssignment_3_1 ) ) )
            // InternalRdsPP.g:2502:1: ( ( rule__CommonAssignment__DescriptionAssignment_3_1 ) )
            {
            // InternalRdsPP.g:2502:1: ( ( rule__CommonAssignment__DescriptionAssignment_3_1 ) )
            // InternalRdsPP.g:2503:2: ( rule__CommonAssignment__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getCommonAssignmentAccess().getDescriptionAssignment_3_1()); 
            // InternalRdsPP.g:2504:2: ( rule__CommonAssignment__DescriptionAssignment_3_1 )
            // InternalRdsPP.g:2504:3: rule__CommonAssignment__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CommonAssignment__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCommonAssignmentAccess().getDescriptionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonAssignment__Group_3__1__Impl"


    // $ANTLR start "rule__ProductDescription__Group__0"
    // InternalRdsPP.g:2513:1: rule__ProductDescription__Group__0 : rule__ProductDescription__Group__0__Impl rule__ProductDescription__Group__1 ;
    public final void rule__ProductDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2517:1: ( rule__ProductDescription__Group__0__Impl rule__ProductDescription__Group__1 )
            // InternalRdsPP.g:2518:2: rule__ProductDescription__Group__0__Impl rule__ProductDescription__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ProductDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProductDescription__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductDescription__Group__0"


    // $ANTLR start "rule__ProductDescription__Group__0__Impl"
    // InternalRdsPP.g:2525:1: rule__ProductDescription__Group__0__Impl : ( 'PRODUKTBEZOGENEKENNZEICHNUNG' ) ;
    public final void rule__ProductDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2529:1: ( ( 'PRODUKTBEZOGENEKENNZEICHNUNG' ) )
            // InternalRdsPP.g:2530:1: ( 'PRODUKTBEZOGENEKENNZEICHNUNG' )
            {
            // InternalRdsPP.g:2530:1: ( 'PRODUKTBEZOGENEKENNZEICHNUNG' )
            // InternalRdsPP.g:2531:2: 'PRODUKTBEZOGENEKENNZEICHNUNG'
            {
             before(grammarAccess.getProductDescriptionAccess().getPRODUKTBEZOGENEKENNZEICHNUNGKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProductDescriptionAccess().getPRODUKTBEZOGENEKENNZEICHNUNGKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductDescription__Group__0__Impl"


    // $ANTLR start "rule__ProductDescription__Group__1"
    // InternalRdsPP.g:2540:1: rule__ProductDescription__Group__1 : rule__ProductDescription__Group__1__Impl rule__ProductDescription__Group__2 ;
    public final void rule__ProductDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2544:1: ( rule__ProductDescription__Group__1__Impl rule__ProductDescription__Group__2 )
            // InternalRdsPP.g:2545:2: rule__ProductDescription__Group__1__Impl rule__ProductDescription__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ProductDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProductDescription__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductDescription__Group__1"


    // $ANTLR start "rule__ProductDescription__Group__1__Impl"
    // InternalRdsPP.g:2552:1: rule__ProductDescription__Group__1__Impl : ( '-' ) ;
    public final void rule__ProductDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2556:1: ( ( '-' ) )
            // InternalRdsPP.g:2557:1: ( '-' )
            {
            // InternalRdsPP.g:2557:1: ( '-' )
            // InternalRdsPP.g:2558:2: '-'
            {
             before(grammarAccess.getProductDescriptionAccess().getHyphenMinusKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProductDescriptionAccess().getHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductDescription__Group__1__Impl"


    // $ANTLR start "rule__ProductDescription__Group__2"
    // InternalRdsPP.g:2567:1: rule__ProductDescription__Group__2 : rule__ProductDescription__Group__2__Impl rule__ProductDescription__Group__3 ;
    public final void rule__ProductDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2571:1: ( rule__ProductDescription__Group__2__Impl rule__ProductDescription__Group__3 )
            // InternalRdsPP.g:2572:2: rule__ProductDescription__Group__2__Impl rule__ProductDescription__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ProductDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProductDescription__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductDescription__Group__2"


    // $ANTLR start "rule__ProductDescription__Group__2__Impl"
    // InternalRdsPP.g:2579:1: rule__ProductDescription__Group__2__Impl : ( ( rule__ProductDescription__NameAssignment_2 ) ) ;
    public final void rule__ProductDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2583:1: ( ( ( rule__ProductDescription__NameAssignment_2 ) ) )
            // InternalRdsPP.g:2584:1: ( ( rule__ProductDescription__NameAssignment_2 ) )
            {
            // InternalRdsPP.g:2584:1: ( ( rule__ProductDescription__NameAssignment_2 ) )
            // InternalRdsPP.g:2585:2: ( rule__ProductDescription__NameAssignment_2 )
            {
             before(grammarAccess.getProductDescriptionAccess().getNameAssignment_2()); 
            // InternalRdsPP.g:2586:2: ( rule__ProductDescription__NameAssignment_2 )
            // InternalRdsPP.g:2586:3: rule__ProductDescription__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ProductDescription__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProductDescriptionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductDescription__Group__2__Impl"


    // $ANTLR start "rule__ProductDescription__Group__3"
    // InternalRdsPP.g:2594:1: rule__ProductDescription__Group__3 : rule__ProductDescription__Group__3__Impl ;
    public final void rule__ProductDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2598:1: ( rule__ProductDescription__Group__3__Impl )
            // InternalRdsPP.g:2599:2: rule__ProductDescription__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProductDescription__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductDescription__Group__3"


    // $ANTLR start "rule__ProductDescription__Group__3__Impl"
    // InternalRdsPP.g:2605:1: rule__ProductDescription__Group__3__Impl : ( ( rule__ProductDescription__Group_3__0 )? ) ;
    public final void rule__ProductDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2609:1: ( ( ( rule__ProductDescription__Group_3__0 )? ) )
            // InternalRdsPP.g:2610:1: ( ( rule__ProductDescription__Group_3__0 )? )
            {
            // InternalRdsPP.g:2610:1: ( ( rule__ProductDescription__Group_3__0 )? )
            // InternalRdsPP.g:2611:2: ( rule__ProductDescription__Group_3__0 )?
            {
             before(grammarAccess.getProductDescriptionAccess().getGroup_3()); 
            // InternalRdsPP.g:2612:2: ( rule__ProductDescription__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==22) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRdsPP.g:2612:3: rule__ProductDescription__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProductDescription__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProductDescriptionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductDescription__Group__3__Impl"


    // $ANTLR start "rule__ProductDescription__Group_3__0"
    // InternalRdsPP.g:2621:1: rule__ProductDescription__Group_3__0 : rule__ProductDescription__Group_3__0__Impl rule__ProductDescription__Group_3__1 ;
    public final void rule__ProductDescription__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2625:1: ( rule__ProductDescription__Group_3__0__Impl rule__ProductDescription__Group_3__1 )
            // InternalRdsPP.g:2626:2: rule__ProductDescription__Group_3__0__Impl rule__ProductDescription__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__ProductDescription__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProductDescription__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductDescription__Group_3__0"


    // $ANTLR start "rule__ProductDescription__Group_3__0__Impl"
    // InternalRdsPP.g:2633:1: rule__ProductDescription__Group_3__0__Impl : ( '->' ) ;
    public final void rule__ProductDescription__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2637:1: ( ( '->' ) )
            // InternalRdsPP.g:2638:1: ( '->' )
            {
            // InternalRdsPP.g:2638:1: ( '->' )
            // InternalRdsPP.g:2639:2: '->'
            {
             before(grammarAccess.getProductDescriptionAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProductDescriptionAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductDescription__Group_3__0__Impl"


    // $ANTLR start "rule__ProductDescription__Group_3__1"
    // InternalRdsPP.g:2648:1: rule__ProductDescription__Group_3__1 : rule__ProductDescription__Group_3__1__Impl ;
    public final void rule__ProductDescription__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2652:1: ( rule__ProductDescription__Group_3__1__Impl )
            // InternalRdsPP.g:2653:2: rule__ProductDescription__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProductDescription__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductDescription__Group_3__1"


    // $ANTLR start "rule__ProductDescription__Group_3__1__Impl"
    // InternalRdsPP.g:2659:1: rule__ProductDescription__Group_3__1__Impl : ( ( rule__ProductDescription__DescriptionAssignment_3_1 ) ) ;
    public final void rule__ProductDescription__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2663:1: ( ( ( rule__ProductDescription__DescriptionAssignment_3_1 ) ) )
            // InternalRdsPP.g:2664:1: ( ( rule__ProductDescription__DescriptionAssignment_3_1 ) )
            {
            // InternalRdsPP.g:2664:1: ( ( rule__ProductDescription__DescriptionAssignment_3_1 ) )
            // InternalRdsPP.g:2665:2: ( rule__ProductDescription__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getProductDescriptionAccess().getDescriptionAssignment_3_1()); 
            // InternalRdsPP.g:2666:2: ( rule__ProductDescription__DescriptionAssignment_3_1 )
            // InternalRdsPP.g:2666:3: rule__ProductDescription__DescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ProductDescription__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProductDescriptionAccess().getDescriptionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductDescription__Group_3__1__Impl"


    // $ANTLR start "rule__Model__DeclarationsAssignment"
    // InternalRdsPP.g:2675:1: rule__Model__DeclarationsAssignment : ( ruleDeclaration ) ;
    public final void rule__Model__DeclarationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2679:1: ( ( ruleDeclaration ) )
            // InternalRdsPP.g:2680:2: ( ruleDeclaration )
            {
            // InternalRdsPP.g:2680:2: ( ruleDeclaration )
            // InternalRdsPP.g:2681:3: ruleDeclaration
            {
             before(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DeclarationsAssignment"


    // $ANTLR start "rule__RDSPPMarking__GemeinsameZuordnungAssignment_1_1"
    // InternalRdsPP.g:2690:1: rule__RDSPPMarking__GemeinsameZuordnungAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__RDSPPMarking__GemeinsameZuordnungAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2694:1: ( ( ( RULE_ID ) ) )
            // InternalRdsPP.g:2695:2: ( ( RULE_ID ) )
            {
            // InternalRdsPP.g:2695:2: ( ( RULE_ID ) )
            // InternalRdsPP.g:2696:3: ( RULE_ID )
            {
             before(grammarAccess.getRDSPPMarkingAccess().getGemeinsameZuordnungCommonAssignmentCrossReference_1_1_0()); 
            // InternalRdsPP.g:2697:3: ( RULE_ID )
            // InternalRdsPP.g:2698:4: RULE_ID
            {
             before(grammarAccess.getRDSPPMarkingAccess().getGemeinsameZuordnungCommonAssignmentIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRDSPPMarkingAccess().getGemeinsameZuordnungCommonAssignmentIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getRDSPPMarkingAccess().getGemeinsameZuordnungCommonAssignmentCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__GemeinsameZuordnungAssignment_1_1"


    // $ANTLR start "rule__RDSPPMarking__FunktionsbezogeneKennzeichnungAssignment_2_1"
    // InternalRdsPP.g:2709:1: rule__RDSPPMarking__FunktionsbezogeneKennzeichnungAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__RDSPPMarking__FunktionsbezogeneKennzeichnungAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2713:1: ( ( ( RULE_ID ) ) )
            // InternalRdsPP.g:2714:2: ( ( RULE_ID ) )
            {
            // InternalRdsPP.g:2714:2: ( ( RULE_ID ) )
            // InternalRdsPP.g:2715:3: ( RULE_ID )
            {
             before(grammarAccess.getRDSPPMarkingAccess().getFunktionsbezogeneKennzeichnungFunctionalDesignationCrossReference_2_1_0()); 
            // InternalRdsPP.g:2716:3: ( RULE_ID )
            // InternalRdsPP.g:2717:4: RULE_ID
            {
             before(grammarAccess.getRDSPPMarkingAccess().getFunktionsbezogeneKennzeichnungFunctionalDesignationIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRDSPPMarkingAccess().getFunktionsbezogeneKennzeichnungFunctionalDesignationIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getRDSPPMarkingAccess().getFunktionsbezogeneKennzeichnungFunctionalDesignationCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__FunktionsbezogeneKennzeichnungAssignment_2_1"


    // $ANTLR start "rule__RDSPPMarking__FunktionaleZuordnungAssignment_3_1"
    // InternalRdsPP.g:2728:1: rule__RDSPPMarking__FunktionaleZuordnungAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__RDSPPMarking__FunktionaleZuordnungAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2732:1: ( ( ( RULE_ID ) ) )
            // InternalRdsPP.g:2733:2: ( ( RULE_ID ) )
            {
            // InternalRdsPP.g:2733:2: ( ( RULE_ID ) )
            // InternalRdsPP.g:2734:3: ( RULE_ID )
            {
             before(grammarAccess.getRDSPPMarkingAccess().getFunktionaleZuordnungFunctionalAssignmentCrossReference_3_1_0()); 
            // InternalRdsPP.g:2735:3: ( RULE_ID )
            // InternalRdsPP.g:2736:4: RULE_ID
            {
             before(grammarAccess.getRDSPPMarkingAccess().getFunktionaleZuordnungFunctionalAssignmentIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRDSPPMarkingAccess().getFunktionaleZuordnungFunctionalAssignmentIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getRDSPPMarkingAccess().getFunktionaleZuordnungFunctionalAssignmentCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__FunktionaleZuordnungAssignment_3_1"


    // $ANTLR start "rule__RDSPPMarking__EinbauortkennzeichnungAssignment_4_1"
    // InternalRdsPP.g:2747:1: rule__RDSPPMarking__EinbauortkennzeichnungAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__RDSPPMarking__EinbauortkennzeichnungAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2751:1: ( ( ( RULE_ID ) ) )
            // InternalRdsPP.g:2752:2: ( ( RULE_ID ) )
            {
            // InternalRdsPP.g:2752:2: ( ( RULE_ID ) )
            // InternalRdsPP.g:2753:3: ( RULE_ID )
            {
             before(grammarAccess.getRDSPPMarkingAccess().getEinbauortkennzeichnungInstallationLocationDescriptionCrossReference_4_1_0()); 
            // InternalRdsPP.g:2754:3: ( RULE_ID )
            // InternalRdsPP.g:2755:4: RULE_ID
            {
             before(grammarAccess.getRDSPPMarkingAccess().getEinbauortkennzeichnungInstallationLocationDescriptionIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRDSPPMarkingAccess().getEinbauortkennzeichnungInstallationLocationDescriptionIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getRDSPPMarkingAccess().getEinbauortkennzeichnungInstallationLocationDescriptionCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__EinbauortkennzeichnungAssignment_4_1"


    // $ANTLR start "rule__RDSPPMarking__AufstellungsortkennzeichnungAssignment_5_1"
    // InternalRdsPP.g:2766:1: rule__RDSPPMarking__AufstellungsortkennzeichnungAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__RDSPPMarking__AufstellungsortkennzeichnungAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2770:1: ( ( ( RULE_ID ) ) )
            // InternalRdsPP.g:2771:2: ( ( RULE_ID ) )
            {
            // InternalRdsPP.g:2771:2: ( ( RULE_ID ) )
            // InternalRdsPP.g:2772:3: ( RULE_ID )
            {
             before(grammarAccess.getRDSPPMarkingAccess().getAufstellungsortkennzeichnungLocationDescriptionCrossReference_5_1_0()); 
            // InternalRdsPP.g:2773:3: ( RULE_ID )
            // InternalRdsPP.g:2774:4: RULE_ID
            {
             before(grammarAccess.getRDSPPMarkingAccess().getAufstellungsortkennzeichnungLocationDescriptionIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRDSPPMarkingAccess().getAufstellungsortkennzeichnungLocationDescriptionIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getRDSPPMarkingAccess().getAufstellungsortkennzeichnungLocationDescriptionCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__AufstellungsortkennzeichnungAssignment_5_1"


    // $ANTLR start "rule__RDSPPMarking__ProduktbezogenekennzeichnungAssignment_6_1"
    // InternalRdsPP.g:2785:1: rule__RDSPPMarking__ProduktbezogenekennzeichnungAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__RDSPPMarking__ProduktbezogenekennzeichnungAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2789:1: ( ( ( RULE_ID ) ) )
            // InternalRdsPP.g:2790:2: ( ( RULE_ID ) )
            {
            // InternalRdsPP.g:2790:2: ( ( RULE_ID ) )
            // InternalRdsPP.g:2791:3: ( RULE_ID )
            {
             before(grammarAccess.getRDSPPMarkingAccess().getProduktbezogenekennzeichnungProductDescriptionCrossReference_6_1_0()); 
            // InternalRdsPP.g:2792:3: ( RULE_ID )
            // InternalRdsPP.g:2793:4: RULE_ID
            {
             before(grammarAccess.getRDSPPMarkingAccess().getProduktbezogenekennzeichnungProductDescriptionIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRDSPPMarkingAccess().getProduktbezogenekennzeichnungProductDescriptionIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getRDSPPMarkingAccess().getProduktbezogenekennzeichnungProductDescriptionCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__ProduktbezogenekennzeichnungAssignment_6_1"


    // $ANTLR start "rule__RDSPPMarking__AnschlusskennzeichnungAssignment_7_1"
    // InternalRdsPP.g:2804:1: rule__RDSPPMarking__AnschlusskennzeichnungAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__RDSPPMarking__AnschlusskennzeichnungAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2808:1: ( ( ( RULE_ID ) ) )
            // InternalRdsPP.g:2809:2: ( ( RULE_ID ) )
            {
            // InternalRdsPP.g:2809:2: ( ( RULE_ID ) )
            // InternalRdsPP.g:2810:3: ( RULE_ID )
            {
             before(grammarAccess.getRDSPPMarkingAccess().getAnschlusskennzeichnungConnectionIdentificationCrossReference_7_1_0()); 
            // InternalRdsPP.g:2811:3: ( RULE_ID )
            // InternalRdsPP.g:2812:4: RULE_ID
            {
             before(grammarAccess.getRDSPPMarkingAccess().getAnschlusskennzeichnungConnectionIdentificationIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRDSPPMarkingAccess().getAnschlusskennzeichnungConnectionIdentificationIDTerminalRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getRDSPPMarkingAccess().getAnschlusskennzeichnungConnectionIdentificationCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__AnschlusskennzeichnungAssignment_7_1"


    // $ANTLR start "rule__RDSPPMarking__SignalkennzeichnungAssignment_8_1"
    // InternalRdsPP.g:2823:1: rule__RDSPPMarking__SignalkennzeichnungAssignment_8_1 : ( ( RULE_ID ) ) ;
    public final void rule__RDSPPMarking__SignalkennzeichnungAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2827:1: ( ( ( RULE_ID ) ) )
            // InternalRdsPP.g:2828:2: ( ( RULE_ID ) )
            {
            // InternalRdsPP.g:2828:2: ( ( RULE_ID ) )
            // InternalRdsPP.g:2829:3: ( RULE_ID )
            {
             before(grammarAccess.getRDSPPMarkingAccess().getSignalkennzeichnungSignalIdentificationCrossReference_8_1_0()); 
            // InternalRdsPP.g:2830:3: ( RULE_ID )
            // InternalRdsPP.g:2831:4: RULE_ID
            {
             before(grammarAccess.getRDSPPMarkingAccess().getSignalkennzeichnungSignalIdentificationIDTerminalRuleCall_8_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRDSPPMarkingAccess().getSignalkennzeichnungSignalIdentificationIDTerminalRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getRDSPPMarkingAccess().getSignalkennzeichnungSignalIdentificationCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__SignalkennzeichnungAssignment_8_1"


    // $ANTLR start "rule__RDSPPMarking__DokumentenkennzeichnungAssignment_9_1"
    // InternalRdsPP.g:2842:1: rule__RDSPPMarking__DokumentenkennzeichnungAssignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__RDSPPMarking__DokumentenkennzeichnungAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2846:1: ( ( ( RULE_ID ) ) )
            // InternalRdsPP.g:2847:2: ( ( RULE_ID ) )
            {
            // InternalRdsPP.g:2847:2: ( ( RULE_ID ) )
            // InternalRdsPP.g:2848:3: ( RULE_ID )
            {
             before(grammarAccess.getRDSPPMarkingAccess().getDokumentenkennzeichnungDocumentIdentificationCrossReference_9_1_0()); 
            // InternalRdsPP.g:2849:3: ( RULE_ID )
            // InternalRdsPP.g:2850:4: RULE_ID
            {
             before(grammarAccess.getRDSPPMarkingAccess().getDokumentenkennzeichnungDocumentIdentificationIDTerminalRuleCall_9_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRDSPPMarkingAccess().getDokumentenkennzeichnungDocumentIdentificationIDTerminalRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getRDSPPMarkingAccess().getDokumentenkennzeichnungDocumentIdentificationCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RDSPPMarking__DokumentenkennzeichnungAssignment_9_1"


    // $ANTLR start "rule__SignalIdentification__NameAssignment_2"
    // InternalRdsPP.g:2861:1: rule__SignalIdentification__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SignalIdentification__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2865:1: ( ( RULE_ID ) )
            // InternalRdsPP.g:2866:2: ( RULE_ID )
            {
            // InternalRdsPP.g:2866:2: ( RULE_ID )
            // InternalRdsPP.g:2867:3: RULE_ID
            {
             before(grammarAccess.getSignalIdentificationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSignalIdentificationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignalIdentification__NameAssignment_2"


    // $ANTLR start "rule__SignalIdentification__DescriptionAssignment_3_1"
    // InternalRdsPP.g:2876:1: rule__SignalIdentification__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SignalIdentification__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2880:1: ( ( RULE_STRING ) )
            // InternalRdsPP.g:2881:2: ( RULE_STRING )
            {
            // InternalRdsPP.g:2881:2: ( RULE_STRING )
            // InternalRdsPP.g:2882:3: RULE_STRING
            {
             before(grammarAccess.getSignalIdentificationAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSignalIdentificationAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignalIdentification__DescriptionAssignment_3_1"


    // $ANTLR start "rule__DocumentIdentification__NameAssignment_2"
    // InternalRdsPP.g:2891:1: rule__DocumentIdentification__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DocumentIdentification__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2895:1: ( ( RULE_ID ) )
            // InternalRdsPP.g:2896:2: ( RULE_ID )
            {
            // InternalRdsPP.g:2896:2: ( RULE_ID )
            // InternalRdsPP.g:2897:3: RULE_ID
            {
             before(grammarAccess.getDocumentIdentificationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDocumentIdentificationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentIdentification__NameAssignment_2"


    // $ANTLR start "rule__DocumentIdentification__DescriptionAssignment_3_1"
    // InternalRdsPP.g:2906:1: rule__DocumentIdentification__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__DocumentIdentification__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2910:1: ( ( RULE_STRING ) )
            // InternalRdsPP.g:2911:2: ( RULE_STRING )
            {
            // InternalRdsPP.g:2911:2: ( RULE_STRING )
            // InternalRdsPP.g:2912:3: RULE_STRING
            {
             before(grammarAccess.getDocumentIdentificationAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDocumentIdentificationAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocumentIdentification__DescriptionAssignment_3_1"


    // $ANTLR start "rule__FunctionalAssignment__NameAssignment_2"
    // InternalRdsPP.g:2921:1: rule__FunctionalAssignment__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FunctionalAssignment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2925:1: ( ( RULE_ID ) )
            // InternalRdsPP.g:2926:2: ( RULE_ID )
            {
            // InternalRdsPP.g:2926:2: ( RULE_ID )
            // InternalRdsPP.g:2927:3: RULE_ID
            {
             before(grammarAccess.getFunctionalAssignmentAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionalAssignmentAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalAssignment__NameAssignment_2"


    // $ANTLR start "rule__FunctionalAssignment__DescriptionAssignment_3_1"
    // InternalRdsPP.g:2936:1: rule__FunctionalAssignment__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__FunctionalAssignment__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2940:1: ( ( RULE_STRING ) )
            // InternalRdsPP.g:2941:2: ( RULE_STRING )
            {
            // InternalRdsPP.g:2941:2: ( RULE_STRING )
            // InternalRdsPP.g:2942:3: RULE_STRING
            {
             before(grammarAccess.getFunctionalAssignmentAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFunctionalAssignmentAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalAssignment__DescriptionAssignment_3_1"


    // $ANTLR start "rule__FunctionalDesignation__NameAssignment_2"
    // InternalRdsPP.g:2951:1: rule__FunctionalDesignation__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FunctionalDesignation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2955:1: ( ( RULE_ID ) )
            // InternalRdsPP.g:2956:2: ( RULE_ID )
            {
            // InternalRdsPP.g:2956:2: ( RULE_ID )
            // InternalRdsPP.g:2957:3: RULE_ID
            {
             before(grammarAccess.getFunctionalDesignationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionalDesignationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalDesignation__NameAssignment_2"


    // $ANTLR start "rule__FunctionalDesignation__DescriptionAssignment_3_1"
    // InternalRdsPP.g:2966:1: rule__FunctionalDesignation__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__FunctionalDesignation__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2970:1: ( ( RULE_STRING ) )
            // InternalRdsPP.g:2971:2: ( RULE_STRING )
            {
            // InternalRdsPP.g:2971:2: ( RULE_STRING )
            // InternalRdsPP.g:2972:3: RULE_STRING
            {
             before(grammarAccess.getFunctionalDesignationAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFunctionalDesignationAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionalDesignation__DescriptionAssignment_3_1"


    // $ANTLR start "rule__InstallationLocationDescription__NameAssignment_2"
    // InternalRdsPP.g:2981:1: rule__InstallationLocationDescription__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__InstallationLocationDescription__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:2985:1: ( ( RULE_ID ) )
            // InternalRdsPP.g:2986:2: ( RULE_ID )
            {
            // InternalRdsPP.g:2986:2: ( RULE_ID )
            // InternalRdsPP.g:2987:3: RULE_ID
            {
             before(grammarAccess.getInstallationLocationDescriptionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstallationLocationDescriptionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstallationLocationDescription__NameAssignment_2"


    // $ANTLR start "rule__InstallationLocationDescription__DescriptionAssignment_3_1"
    // InternalRdsPP.g:2996:1: rule__InstallationLocationDescription__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__InstallationLocationDescription__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:3000:1: ( ( RULE_STRING ) )
            // InternalRdsPP.g:3001:2: ( RULE_STRING )
            {
            // InternalRdsPP.g:3001:2: ( RULE_STRING )
            // InternalRdsPP.g:3002:3: RULE_STRING
            {
             before(grammarAccess.getInstallationLocationDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInstallationLocationDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstallationLocationDescription__DescriptionAssignment_3_1"


    // $ANTLR start "rule__LocationDescription__NameAssignment_2"
    // InternalRdsPP.g:3011:1: rule__LocationDescription__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LocationDescription__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:3015:1: ( ( RULE_ID ) )
            // InternalRdsPP.g:3016:2: ( RULE_ID )
            {
            // InternalRdsPP.g:3016:2: ( RULE_ID )
            // InternalRdsPP.g:3017:3: RULE_ID
            {
             before(grammarAccess.getLocationDescriptionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLocationDescriptionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationDescription__NameAssignment_2"


    // $ANTLR start "rule__LocationDescription__DescriptionAssignment_3_1"
    // InternalRdsPP.g:3026:1: rule__LocationDescription__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__LocationDescription__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:3030:1: ( ( RULE_STRING ) )
            // InternalRdsPP.g:3031:2: ( RULE_STRING )
            {
            // InternalRdsPP.g:3031:2: ( RULE_STRING )
            // InternalRdsPP.g:3032:3: RULE_STRING
            {
             before(grammarAccess.getLocationDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLocationDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationDescription__DescriptionAssignment_3_1"


    // $ANTLR start "rule__ConnectionIdentification__NameAssignment_2"
    // InternalRdsPP.g:3041:1: rule__ConnectionIdentification__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ConnectionIdentification__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:3045:1: ( ( RULE_ID ) )
            // InternalRdsPP.g:3046:2: ( RULE_ID )
            {
            // InternalRdsPP.g:3046:2: ( RULE_ID )
            // InternalRdsPP.g:3047:3: RULE_ID
            {
             before(grammarAccess.getConnectionIdentificationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnectionIdentificationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionIdentification__NameAssignment_2"


    // $ANTLR start "rule__ConnectionIdentification__DescriptionAssignment_3_1"
    // InternalRdsPP.g:3056:1: rule__ConnectionIdentification__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__ConnectionIdentification__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:3060:1: ( ( RULE_STRING ) )
            // InternalRdsPP.g:3061:2: ( RULE_STRING )
            {
            // InternalRdsPP.g:3061:2: ( RULE_STRING )
            // InternalRdsPP.g:3062:3: RULE_STRING
            {
             before(grammarAccess.getConnectionIdentificationAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConnectionIdentificationAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConnectionIdentification__DescriptionAssignment_3_1"


    // $ANTLR start "rule__CommonAssignment__NameAssignment_2"
    // InternalRdsPP.g:3071:1: rule__CommonAssignment__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CommonAssignment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:3075:1: ( ( RULE_ID ) )
            // InternalRdsPP.g:3076:2: ( RULE_ID )
            {
            // InternalRdsPP.g:3076:2: ( RULE_ID )
            // InternalRdsPP.g:3077:3: RULE_ID
            {
             before(grammarAccess.getCommonAssignmentAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCommonAssignmentAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonAssignment__NameAssignment_2"


    // $ANTLR start "rule__CommonAssignment__DescriptionAssignment_3_1"
    // InternalRdsPP.g:3086:1: rule__CommonAssignment__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__CommonAssignment__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:3090:1: ( ( RULE_STRING ) )
            // InternalRdsPP.g:3091:2: ( RULE_STRING )
            {
            // InternalRdsPP.g:3091:2: ( RULE_STRING )
            // InternalRdsPP.g:3092:3: RULE_STRING
            {
             before(grammarAccess.getCommonAssignmentAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCommonAssignmentAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommonAssignment__DescriptionAssignment_3_1"


    // $ANTLR start "rule__ProductDescription__NameAssignment_2"
    // InternalRdsPP.g:3101:1: rule__ProductDescription__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ProductDescription__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:3105:1: ( ( RULE_ID ) )
            // InternalRdsPP.g:3106:2: ( RULE_ID )
            {
            // InternalRdsPP.g:3106:2: ( RULE_ID )
            // InternalRdsPP.g:3107:3: RULE_ID
            {
             before(grammarAccess.getProductDescriptionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProductDescriptionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductDescription__NameAssignment_2"


    // $ANTLR start "rule__ProductDescription__DescriptionAssignment_3_1"
    // InternalRdsPP.g:3116:1: rule__ProductDescription__DescriptionAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__ProductDescription__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRdsPP.g:3120:1: ( ( RULE_STRING ) )
            // InternalRdsPP.g:3121:2: ( RULE_STRING )
            {
            // InternalRdsPP.g:3121:2: ( RULE_STRING )
            // InternalRdsPP.g:3122:3: RULE_STRING
            {
             before(grammarAccess.getProductDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getProductDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductDescription__DescriptionAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000007FA00802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000001FF000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});

}