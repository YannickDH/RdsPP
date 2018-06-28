package de.rdspp.editor.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.rdspp.editor.services.RdsPPGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRdsPPParser extends AbstractInternalAntlrParser {
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

        public InternalRdsPPParser(TokenStream input, RdsPPGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected RdsPPGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalRdsPP.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalRdsPP.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalRdsPP.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRdsPP.g:71:1: ruleModel returns [EObject current=null] : ( (lv_declarations_0_0= ruleDeclaration ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_declarations_0_0 = null;



        	enterRule();

        try {
            // InternalRdsPP.g:77:2: ( ( (lv_declarations_0_0= ruleDeclaration ) )* )
            // InternalRdsPP.g:78:2: ( (lv_declarations_0_0= ruleDeclaration ) )*
            {
            // InternalRdsPP.g:78:2: ( (lv_declarations_0_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==21||(LA1_0>=23 && LA1_0<=30)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRdsPP.g:79:3: (lv_declarations_0_0= ruleDeclaration )
            	    {
            	    // InternalRdsPP.g:79:3: (lv_declarations_0_0= ruleDeclaration )
            	    // InternalRdsPP.g:80:4: lv_declarations_0_0= ruleDeclaration
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_declarations_0_0=ruleDeclaration();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"declarations",
            	    					lv_declarations_0_0,
            	    					"de.rdspp.editor.RdsPP.Declaration");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDeclaration"
    // InternalRdsPP.g:100:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalRdsPP.g:100:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalRdsPP.g:101:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalRdsPP.g:107:1: ruleDeclaration returns [EObject current=null] : (this_RDSPPComponent_0= ruleRDSPPComponent | this_RDSPPMarking_1= ruleRDSPPMarking ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_RDSPPComponent_0 = null;

        EObject this_RDSPPMarking_1 = null;



        	enterRule();

        try {
            // InternalRdsPP.g:113:2: ( (this_RDSPPComponent_0= ruleRDSPPComponent | this_RDSPPMarking_1= ruleRDSPPMarking ) )
            // InternalRdsPP.g:114:2: (this_RDSPPComponent_0= ruleRDSPPComponent | this_RDSPPMarking_1= ruleRDSPPMarking )
            {
            // InternalRdsPP.g:114:2: (this_RDSPPComponent_0= ruleRDSPPComponent | this_RDSPPMarking_1= ruleRDSPPMarking )
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
                    // InternalRdsPP.g:115:3: this_RDSPPComponent_0= ruleRDSPPComponent
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getRDSPPComponentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RDSPPComponent_0=ruleRDSPPComponent();

                    state._fsp--;


                    			current = this_RDSPPComponent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRdsPP.g:124:3: this_RDSPPMarking_1= ruleRDSPPMarking
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getRDSPPMarkingParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RDSPPMarking_1=ruleRDSPPMarking();

                    state._fsp--;


                    			current = this_RDSPPMarking_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleRDSPPMarking"
    // InternalRdsPP.g:136:1: entryRuleRDSPPMarking returns [EObject current=null] : iv_ruleRDSPPMarking= ruleRDSPPMarking EOF ;
    public final EObject entryRuleRDSPPMarking() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRDSPPMarking = null;


        try {
            // InternalRdsPP.g:136:53: (iv_ruleRDSPPMarking= ruleRDSPPMarking EOF )
            // InternalRdsPP.g:137:2: iv_ruleRDSPPMarking= ruleRDSPPMarking EOF
            {
             newCompositeNode(grammarAccess.getRDSPPMarkingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRDSPPMarking=ruleRDSPPMarking();

            state._fsp--;

             current =iv_ruleRDSPPMarking; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRDSPPMarking"


    // $ANTLR start "ruleRDSPPMarking"
    // InternalRdsPP.g:143:1: ruleRDSPPMarking returns [EObject current=null] : (otherlv_0= 'RDS-PPKENNZEICHNUNG' (otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) )? (otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '==' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '+' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= '++' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= '-' ( (otherlv_12= RULE_ID ) ) )? (otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= ';' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= '&' ( (otherlv_18= RULE_ID ) ) )? ) ;
    public final EObject ruleRDSPPMarking() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;


        	enterRule();

        try {
            // InternalRdsPP.g:149:2: ( (otherlv_0= 'RDS-PPKENNZEICHNUNG' (otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) )? (otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '==' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '+' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= '++' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= '-' ( (otherlv_12= RULE_ID ) ) )? (otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= ';' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= '&' ( (otherlv_18= RULE_ID ) ) )? ) )
            // InternalRdsPP.g:150:2: (otherlv_0= 'RDS-PPKENNZEICHNUNG' (otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) )? (otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '==' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '+' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= '++' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= '-' ( (otherlv_12= RULE_ID ) ) )? (otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= ';' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= '&' ( (otherlv_18= RULE_ID ) ) )? )
            {
            // InternalRdsPP.g:150:2: (otherlv_0= 'RDS-PPKENNZEICHNUNG' (otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) )? (otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '==' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '+' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= '++' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= '-' ( (otherlv_12= RULE_ID ) ) )? (otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= ';' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= '&' ( (otherlv_18= RULE_ID ) ) )? )
            // InternalRdsPP.g:151:3: otherlv_0= 'RDS-PPKENNZEICHNUNG' (otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) )? (otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= '==' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= '+' ( (otherlv_8= RULE_ID ) ) )? (otherlv_9= '++' ( (otherlv_10= RULE_ID ) ) )? (otherlv_11= '-' ( (otherlv_12= RULE_ID ) ) )? (otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )? (otherlv_15= ';' ( (otherlv_16= RULE_ID ) ) )? (otherlv_17= '&' ( (otherlv_18= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRDSPPMarkingAccess().getRDSPPKENNZEICHNUNGKeyword_0());
            		
            // InternalRdsPP.g:155:3: (otherlv_1= '#' ( (otherlv_2= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRdsPP.g:156:4: otherlv_1= '#' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getRDSPPMarkingAccess().getNumberSignKeyword_1_0());
                    			
                    // InternalRdsPP.g:160:4: ( (otherlv_2= RULE_ID ) )
                    // InternalRdsPP.g:161:5: (otherlv_2= RULE_ID )
                    {
                    // InternalRdsPP.g:161:5: (otherlv_2= RULE_ID )
                    // InternalRdsPP.g:162:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRDSPPMarkingRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_2, grammarAccess.getRDSPPMarkingAccess().getGemeinsameZuordnungCommonAssignmentCrossReference_1_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRdsPP.g:174:3: (otherlv_3= '=' ( (otherlv_4= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRdsPP.g:175:4: otherlv_3= '=' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getRDSPPMarkingAccess().getEqualsSignKeyword_2_0());
                    			
                    // InternalRdsPP.g:179:4: ( (otherlv_4= RULE_ID ) )
                    // InternalRdsPP.g:180:5: (otherlv_4= RULE_ID )
                    {
                    // InternalRdsPP.g:180:5: (otherlv_4= RULE_ID )
                    // InternalRdsPP.g:181:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRDSPPMarkingRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_4, grammarAccess.getRDSPPMarkingAccess().getFunktionsbezogeneKennzeichnungFunctionalDesignationCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRdsPP.g:193:3: (otherlv_5= '==' ( (otherlv_6= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRdsPP.g:194:4: otherlv_5= '==' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getRDSPPMarkingAccess().getEqualsSignEqualsSignKeyword_3_0());
                    			
                    // InternalRdsPP.g:198:4: ( (otherlv_6= RULE_ID ) )
                    // InternalRdsPP.g:199:5: (otherlv_6= RULE_ID )
                    {
                    // InternalRdsPP.g:199:5: (otherlv_6= RULE_ID )
                    // InternalRdsPP.g:200:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRDSPPMarkingRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_6, grammarAccess.getRDSPPMarkingAccess().getFunktionaleZuordnungFunctionalAssignmentCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRdsPP.g:212:3: (otherlv_7= '+' ( (otherlv_8= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRdsPP.g:213:4: otherlv_7= '+' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getRDSPPMarkingAccess().getPlusSignKeyword_4_0());
                    			
                    // InternalRdsPP.g:217:4: ( (otherlv_8= RULE_ID ) )
                    // InternalRdsPP.g:218:5: (otherlv_8= RULE_ID )
                    {
                    // InternalRdsPP.g:218:5: (otherlv_8= RULE_ID )
                    // InternalRdsPP.g:219:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRDSPPMarkingRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_8, grammarAccess.getRDSPPMarkingAccess().getEinbauortkennzeichnungInstallationLocationDescriptionCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRdsPP.g:231:3: (otherlv_9= '++' ( (otherlv_10= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRdsPP.g:232:4: otherlv_9= '++' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getRDSPPMarkingAccess().getPlusSignPlusSignKeyword_5_0());
                    			
                    // InternalRdsPP.g:236:4: ( (otherlv_10= RULE_ID ) )
                    // InternalRdsPP.g:237:5: (otherlv_10= RULE_ID )
                    {
                    // InternalRdsPP.g:237:5: (otherlv_10= RULE_ID )
                    // InternalRdsPP.g:238:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRDSPPMarkingRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_10, grammarAccess.getRDSPPMarkingAccess().getAufstellungsortkennzeichnungLocationDescriptionCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRdsPP.g:250:3: (otherlv_11= '-' ( (otherlv_12= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRdsPP.g:251:4: otherlv_11= '-' ( (otherlv_12= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_11, grammarAccess.getRDSPPMarkingAccess().getHyphenMinusKeyword_6_0());
                    			
                    // InternalRdsPP.g:255:4: ( (otherlv_12= RULE_ID ) )
                    // InternalRdsPP.g:256:5: (otherlv_12= RULE_ID )
                    {
                    // InternalRdsPP.g:256:5: (otherlv_12= RULE_ID )
                    // InternalRdsPP.g:257:6: otherlv_12= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRDSPPMarkingRule());
                    						}
                    					
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_12, grammarAccess.getRDSPPMarkingAccess().getProduktbezogenekennzeichnungProductDescriptionCrossReference_6_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRdsPP.g:269:3: (otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRdsPP.g:270:4: otherlv_13= ':' ( (otherlv_14= RULE_ID ) )
                    {
                    otherlv_13=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getRDSPPMarkingAccess().getColonKeyword_7_0());
                    			
                    // InternalRdsPP.g:274:4: ( (otherlv_14= RULE_ID ) )
                    // InternalRdsPP.g:275:5: (otherlv_14= RULE_ID )
                    {
                    // InternalRdsPP.g:275:5: (otherlv_14= RULE_ID )
                    // InternalRdsPP.g:276:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRDSPPMarkingRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(otherlv_14, grammarAccess.getRDSPPMarkingAccess().getAnschlusskennzeichnungConnectionIdentificationCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRdsPP.g:288:3: (otherlv_15= ';' ( (otherlv_16= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRdsPP.g:289:4: otherlv_15= ';' ( (otherlv_16= RULE_ID ) )
                    {
                    otherlv_15=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_15, grammarAccess.getRDSPPMarkingAccess().getSemicolonKeyword_8_0());
                    			
                    // InternalRdsPP.g:293:4: ( (otherlv_16= RULE_ID ) )
                    // InternalRdsPP.g:294:5: (otherlv_16= RULE_ID )
                    {
                    // InternalRdsPP.g:294:5: (otherlv_16= RULE_ID )
                    // InternalRdsPP.g:295:6: otherlv_16= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRDSPPMarkingRule());
                    						}
                    					
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_16, grammarAccess.getRDSPPMarkingAccess().getSignalkennzeichnungSignalIdentificationCrossReference_8_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRdsPP.g:307:3: (otherlv_17= '&' ( (otherlv_18= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRdsPP.g:308:4: otherlv_17= '&' ( (otherlv_18= RULE_ID ) )
                    {
                    otherlv_17=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_17, grammarAccess.getRDSPPMarkingAccess().getAmpersandKeyword_9_0());
                    			
                    // InternalRdsPP.g:312:4: ( (otherlv_18= RULE_ID ) )
                    // InternalRdsPP.g:313:5: (otherlv_18= RULE_ID )
                    {
                    // InternalRdsPP.g:313:5: (otherlv_18= RULE_ID )
                    // InternalRdsPP.g:314:6: otherlv_18= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRDSPPMarkingRule());
                    						}
                    					
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_18, grammarAccess.getRDSPPMarkingAccess().getDokumentenkennzeichnungDocumentIdentificationCrossReference_9_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRDSPPMarking"


    // $ANTLR start "entryRuleRDSPPComponent"
    // InternalRdsPP.g:330:1: entryRuleRDSPPComponent returns [EObject current=null] : iv_ruleRDSPPComponent= ruleRDSPPComponent EOF ;
    public final EObject entryRuleRDSPPComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRDSPPComponent = null;


        try {
            // InternalRdsPP.g:330:55: (iv_ruleRDSPPComponent= ruleRDSPPComponent EOF )
            // InternalRdsPP.g:331:2: iv_ruleRDSPPComponent= ruleRDSPPComponent EOF
            {
             newCompositeNode(grammarAccess.getRDSPPComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRDSPPComponent=ruleRDSPPComponent();

            state._fsp--;

             current =iv_ruleRDSPPComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRDSPPComponent"


    // $ANTLR start "ruleRDSPPComponent"
    // InternalRdsPP.g:337:1: ruleRDSPPComponent returns [EObject current=null] : (this_CommonAssignment_0= ruleCommonAssignment | this_LocationDescription_1= ruleLocationDescription | this_InstallationLocationDescription_2= ruleInstallationLocationDescription | this_FunctionalAssignment_3= ruleFunctionalAssignment | this_FunctionalDesignation_4= ruleFunctionalDesignation | this_ProductDescription_5= ruleProductDescription | this_ConnectionIdentification_6= ruleConnectionIdentification | this_DocumentIdentification_7= ruleDocumentIdentification | this_SignalIdentification_8= ruleSignalIdentification ) ;
    public final EObject ruleRDSPPComponent() throws RecognitionException {
        EObject current = null;

        EObject this_CommonAssignment_0 = null;

        EObject this_LocationDescription_1 = null;

        EObject this_InstallationLocationDescription_2 = null;

        EObject this_FunctionalAssignment_3 = null;

        EObject this_FunctionalDesignation_4 = null;

        EObject this_ProductDescription_5 = null;

        EObject this_ConnectionIdentification_6 = null;

        EObject this_DocumentIdentification_7 = null;

        EObject this_SignalIdentification_8 = null;



        	enterRule();

        try {
            // InternalRdsPP.g:343:2: ( (this_CommonAssignment_0= ruleCommonAssignment | this_LocationDescription_1= ruleLocationDescription | this_InstallationLocationDescription_2= ruleInstallationLocationDescription | this_FunctionalAssignment_3= ruleFunctionalAssignment | this_FunctionalDesignation_4= ruleFunctionalDesignation | this_ProductDescription_5= ruleProductDescription | this_ConnectionIdentification_6= ruleConnectionIdentification | this_DocumentIdentification_7= ruleDocumentIdentification | this_SignalIdentification_8= ruleSignalIdentification ) )
            // InternalRdsPP.g:344:2: (this_CommonAssignment_0= ruleCommonAssignment | this_LocationDescription_1= ruleLocationDescription | this_InstallationLocationDescription_2= ruleInstallationLocationDescription | this_FunctionalAssignment_3= ruleFunctionalAssignment | this_FunctionalDesignation_4= ruleFunctionalDesignation | this_ProductDescription_5= ruleProductDescription | this_ConnectionIdentification_6= ruleConnectionIdentification | this_DocumentIdentification_7= ruleDocumentIdentification | this_SignalIdentification_8= ruleSignalIdentification )
            {
            // InternalRdsPP.g:344:2: (this_CommonAssignment_0= ruleCommonAssignment | this_LocationDescription_1= ruleLocationDescription | this_InstallationLocationDescription_2= ruleInstallationLocationDescription | this_FunctionalAssignment_3= ruleFunctionalAssignment | this_FunctionalDesignation_4= ruleFunctionalDesignation | this_ProductDescription_5= ruleProductDescription | this_ConnectionIdentification_6= ruleConnectionIdentification | this_DocumentIdentification_7= ruleDocumentIdentification | this_SignalIdentification_8= ruleSignalIdentification )
            int alt12=9;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt12=1;
                }
                break;
            case 27:
                {
                alt12=2;
                }
                break;
            case 26:
                {
                alt12=3;
                }
                break;
            case 24:
                {
                alt12=4;
                }
                break;
            case 25:
                {
                alt12=5;
                }
                break;
            case 30:
                {
                alt12=6;
                }
                break;
            case 28:
                {
                alt12=7;
                }
                break;
            case 23:
                {
                alt12=8;
                }
                break;
            case 21:
                {
                alt12=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalRdsPP.g:345:3: this_CommonAssignment_0= ruleCommonAssignment
                    {

                    			newCompositeNode(grammarAccess.getRDSPPComponentAccess().getCommonAssignmentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommonAssignment_0=ruleCommonAssignment();

                    state._fsp--;


                    			current = this_CommonAssignment_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRdsPP.g:354:3: this_LocationDescription_1= ruleLocationDescription
                    {

                    			newCompositeNode(grammarAccess.getRDSPPComponentAccess().getLocationDescriptionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LocationDescription_1=ruleLocationDescription();

                    state._fsp--;


                    			current = this_LocationDescription_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRdsPP.g:363:3: this_InstallationLocationDescription_2= ruleInstallationLocationDescription
                    {

                    			newCompositeNode(grammarAccess.getRDSPPComponentAccess().getInstallationLocationDescriptionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_InstallationLocationDescription_2=ruleInstallationLocationDescription();

                    state._fsp--;


                    			current = this_InstallationLocationDescription_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRdsPP.g:372:3: this_FunctionalAssignment_3= ruleFunctionalAssignment
                    {

                    			newCompositeNode(grammarAccess.getRDSPPComponentAccess().getFunctionalAssignmentParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionalAssignment_3=ruleFunctionalAssignment();

                    state._fsp--;


                    			current = this_FunctionalAssignment_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRdsPP.g:381:3: this_FunctionalDesignation_4= ruleFunctionalDesignation
                    {

                    			newCompositeNode(grammarAccess.getRDSPPComponentAccess().getFunctionalDesignationParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionalDesignation_4=ruleFunctionalDesignation();

                    state._fsp--;


                    			current = this_FunctionalDesignation_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRdsPP.g:390:3: this_ProductDescription_5= ruleProductDescription
                    {

                    			newCompositeNode(grammarAccess.getRDSPPComponentAccess().getProductDescriptionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProductDescription_5=ruleProductDescription();

                    state._fsp--;


                    			current = this_ProductDescription_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRdsPP.g:399:3: this_ConnectionIdentification_6= ruleConnectionIdentification
                    {

                    			newCompositeNode(grammarAccess.getRDSPPComponentAccess().getConnectionIdentificationParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConnectionIdentification_6=ruleConnectionIdentification();

                    state._fsp--;


                    			current = this_ConnectionIdentification_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRdsPP.g:408:3: this_DocumentIdentification_7= ruleDocumentIdentification
                    {

                    			newCompositeNode(grammarAccess.getRDSPPComponentAccess().getDocumentIdentificationParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_DocumentIdentification_7=ruleDocumentIdentification();

                    state._fsp--;


                    			current = this_DocumentIdentification_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRdsPP.g:417:3: this_SignalIdentification_8= ruleSignalIdentification
                    {

                    			newCompositeNode(grammarAccess.getRDSPPComponentAccess().getSignalIdentificationParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_SignalIdentification_8=ruleSignalIdentification();

                    state._fsp--;


                    			current = this_SignalIdentification_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRDSPPComponent"


    // $ANTLR start "entryRuleSignalIdentification"
    // InternalRdsPP.g:429:1: entryRuleSignalIdentification returns [EObject current=null] : iv_ruleSignalIdentification= ruleSignalIdentification EOF ;
    public final EObject entryRuleSignalIdentification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalIdentification = null;


        try {
            // InternalRdsPP.g:429:61: (iv_ruleSignalIdentification= ruleSignalIdentification EOF )
            // InternalRdsPP.g:430:2: iv_ruleSignalIdentification= ruleSignalIdentification EOF
            {
             newCompositeNode(grammarAccess.getSignalIdentificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignalIdentification=ruleSignalIdentification();

            state._fsp--;

             current =iv_ruleSignalIdentification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignalIdentification"


    // $ANTLR start "ruleSignalIdentification"
    // InternalRdsPP.g:436:1: ruleSignalIdentification returns [EObject current=null] : (otherlv_0= 'SIGNALKENNZEICHNUNG' otherlv_1= ';' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleSignalIdentification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;


        	enterRule();

        try {
            // InternalRdsPP.g:442:2: ( (otherlv_0= 'SIGNALKENNZEICHNUNG' otherlv_1= ';' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? ) )
            // InternalRdsPP.g:443:2: (otherlv_0= 'SIGNALKENNZEICHNUNG' otherlv_1= ';' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? )
            {
            // InternalRdsPP.g:443:2: (otherlv_0= 'SIGNALKENNZEICHNUNG' otherlv_1= ';' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? )
            // InternalRdsPP.g:444:3: otherlv_0= 'SIGNALKENNZEICHNUNG' otherlv_1= ';' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSignalIdentificationAccess().getSIGNALKENNZEICHNUNGKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSignalIdentificationAccess().getSemicolonKeyword_1());
            		
            // InternalRdsPP.g:452:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRdsPP.g:453:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRdsPP.g:453:4: (lv_name_2_0= RULE_ID )
            // InternalRdsPP.g:454:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSignalIdentificationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignalIdentificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.rdspp.editor.RdsPP.ID");
            				

            }


            }

            // InternalRdsPP.g:470:3: (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRdsPP.g:471:4: otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getSignalIdentificationAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                    			
                    // InternalRdsPP.g:475:4: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalRdsPP.g:476:5: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalRdsPP.g:476:5: (lv_description_4_0= RULE_STRING )
                    // InternalRdsPP.g:477:6: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_description_4_0, grammarAccess.getSignalIdentificationAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSignalIdentificationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignalIdentification"


    // $ANTLR start "entryRuleDocumentIdentification"
    // InternalRdsPP.g:498:1: entryRuleDocumentIdentification returns [EObject current=null] : iv_ruleDocumentIdentification= ruleDocumentIdentification EOF ;
    public final EObject entryRuleDocumentIdentification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentIdentification = null;


        try {
            // InternalRdsPP.g:498:63: (iv_ruleDocumentIdentification= ruleDocumentIdentification EOF )
            // InternalRdsPP.g:499:2: iv_ruleDocumentIdentification= ruleDocumentIdentification EOF
            {
             newCompositeNode(grammarAccess.getDocumentIdentificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocumentIdentification=ruleDocumentIdentification();

            state._fsp--;

             current =iv_ruleDocumentIdentification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocumentIdentification"


    // $ANTLR start "ruleDocumentIdentification"
    // InternalRdsPP.g:505:1: ruleDocumentIdentification returns [EObject current=null] : (otherlv_0= 'DOKUMENTENKENNZEICHNUNG' otherlv_1= '&' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleDocumentIdentification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;


        	enterRule();

        try {
            // InternalRdsPP.g:511:2: ( (otherlv_0= 'DOKUMENTENKENNZEICHNUNG' otherlv_1= '&' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? ) )
            // InternalRdsPP.g:512:2: (otherlv_0= 'DOKUMENTENKENNZEICHNUNG' otherlv_1= '&' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? )
            {
            // InternalRdsPP.g:512:2: (otherlv_0= 'DOKUMENTENKENNZEICHNUNG' otherlv_1= '&' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? )
            // InternalRdsPP.g:513:3: otherlv_0= 'DOKUMENTENKENNZEICHNUNG' otherlv_1= '&' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getDocumentIdentificationAccess().getDOKUMENTENKENNZEICHNUNGKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDocumentIdentificationAccess().getAmpersandKeyword_1());
            		
            // InternalRdsPP.g:521:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRdsPP.g:522:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRdsPP.g:522:4: (lv_name_2_0= RULE_ID )
            // InternalRdsPP.g:523:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDocumentIdentificationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDocumentIdentificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.rdspp.editor.RdsPP.ID");
            				

            }


            }

            // InternalRdsPP.g:539:3: (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRdsPP.g:540:4: otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getDocumentIdentificationAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                    			
                    // InternalRdsPP.g:544:4: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalRdsPP.g:545:5: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalRdsPP.g:545:5: (lv_description_4_0= RULE_STRING )
                    // InternalRdsPP.g:546:6: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_description_4_0, grammarAccess.getDocumentIdentificationAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDocumentIdentificationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocumentIdentification"


    // $ANTLR start "entryRuleFunctionalAssignment"
    // InternalRdsPP.g:567:1: entryRuleFunctionalAssignment returns [EObject current=null] : iv_ruleFunctionalAssignment= ruleFunctionalAssignment EOF ;
    public final EObject entryRuleFunctionalAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionalAssignment = null;


        try {
            // InternalRdsPP.g:567:61: (iv_ruleFunctionalAssignment= ruleFunctionalAssignment EOF )
            // InternalRdsPP.g:568:2: iv_ruleFunctionalAssignment= ruleFunctionalAssignment EOF
            {
             newCompositeNode(grammarAccess.getFunctionalAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionalAssignment=ruleFunctionalAssignment();

            state._fsp--;

             current =iv_ruleFunctionalAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionalAssignment"


    // $ANTLR start "ruleFunctionalAssignment"
    // InternalRdsPP.g:574:1: ruleFunctionalAssignment returns [EObject current=null] : (otherlv_0= 'FUNKTIONALEZUORDNUNG' otherlv_1= '==' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleFunctionalAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;


        	enterRule();

        try {
            // InternalRdsPP.g:580:2: ( (otherlv_0= 'FUNKTIONALEZUORDNUNG' otherlv_1= '==' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? ) )
            // InternalRdsPP.g:581:2: (otherlv_0= 'FUNKTIONALEZUORDNUNG' otherlv_1= '==' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? )
            {
            // InternalRdsPP.g:581:2: (otherlv_0= 'FUNKTIONALEZUORDNUNG' otherlv_1= '==' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? )
            // InternalRdsPP.g:582:3: otherlv_0= 'FUNKTIONALEZUORDNUNG' otherlv_1= '==' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionalAssignmentAccess().getFUNKTIONALEZUORDNUNGKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionalAssignmentAccess().getEqualsSignEqualsSignKeyword_1());
            		
            // InternalRdsPP.g:590:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRdsPP.g:591:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRdsPP.g:591:4: (lv_name_2_0= RULE_ID )
            // InternalRdsPP.g:592:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFunctionalAssignmentAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionalAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.rdspp.editor.RdsPP.ID");
            				

            }


            }

            // InternalRdsPP.g:608:3: (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRdsPP.g:609:4: otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getFunctionalAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                    			
                    // InternalRdsPP.g:613:4: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalRdsPP.g:614:5: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalRdsPP.g:614:5: (lv_description_4_0= RULE_STRING )
                    // InternalRdsPP.g:615:6: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_description_4_0, grammarAccess.getFunctionalAssignmentAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionalAssignmentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionalAssignment"


    // $ANTLR start "entryRuleFunctionalDesignation"
    // InternalRdsPP.g:636:1: entryRuleFunctionalDesignation returns [EObject current=null] : iv_ruleFunctionalDesignation= ruleFunctionalDesignation EOF ;
    public final EObject entryRuleFunctionalDesignation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionalDesignation = null;


        try {
            // InternalRdsPP.g:636:62: (iv_ruleFunctionalDesignation= ruleFunctionalDesignation EOF )
            // InternalRdsPP.g:637:2: iv_ruleFunctionalDesignation= ruleFunctionalDesignation EOF
            {
             newCompositeNode(grammarAccess.getFunctionalDesignationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionalDesignation=ruleFunctionalDesignation();

            state._fsp--;

             current =iv_ruleFunctionalDesignation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionalDesignation"


    // $ANTLR start "ruleFunctionalDesignation"
    // InternalRdsPP.g:643:1: ruleFunctionalDesignation returns [EObject current=null] : (otherlv_0= 'FUNKTIONSBEZOGENEKENNZEICHNUNG' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleFunctionalDesignation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;


        	enterRule();

        try {
            // InternalRdsPP.g:649:2: ( (otherlv_0= 'FUNKTIONSBEZOGENEKENNZEICHNUNG' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? ) )
            // InternalRdsPP.g:650:2: (otherlv_0= 'FUNKTIONSBEZOGENEKENNZEICHNUNG' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? )
            {
            // InternalRdsPP.g:650:2: (otherlv_0= 'FUNKTIONSBEZOGENEKENNZEICHNUNG' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? )
            // InternalRdsPP.g:651:3: otherlv_0= 'FUNKTIONSBEZOGENEKENNZEICHNUNG' otherlv_1= '=' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionalDesignationAccess().getFUNKTIONSBEZOGENEKENNZEICHNUNGKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionalDesignationAccess().getEqualsSignKeyword_1());
            		
            // InternalRdsPP.g:659:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRdsPP.g:660:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRdsPP.g:660:4: (lv_name_2_0= RULE_ID )
            // InternalRdsPP.g:661:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFunctionalDesignationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionalDesignationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.rdspp.editor.RdsPP.ID");
            				

            }


            }

            // InternalRdsPP.g:677:3: (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRdsPP.g:678:4: otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getFunctionalDesignationAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                    			
                    // InternalRdsPP.g:682:4: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalRdsPP.g:683:5: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalRdsPP.g:683:5: (lv_description_4_0= RULE_STRING )
                    // InternalRdsPP.g:684:6: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_description_4_0, grammarAccess.getFunctionalDesignationAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionalDesignationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionalDesignation"


    // $ANTLR start "entryRuleInstallationLocationDescription"
    // InternalRdsPP.g:705:1: entryRuleInstallationLocationDescription returns [EObject current=null] : iv_ruleInstallationLocationDescription= ruleInstallationLocationDescription EOF ;
    public final EObject entryRuleInstallationLocationDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstallationLocationDescription = null;


        try {
            // InternalRdsPP.g:705:72: (iv_ruleInstallationLocationDescription= ruleInstallationLocationDescription EOF )
            // InternalRdsPP.g:706:2: iv_ruleInstallationLocationDescription= ruleInstallationLocationDescription EOF
            {
             newCompositeNode(grammarAccess.getInstallationLocationDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstallationLocationDescription=ruleInstallationLocationDescription();

            state._fsp--;

             current =iv_ruleInstallationLocationDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstallationLocationDescription"


    // $ANTLR start "ruleInstallationLocationDescription"
    // InternalRdsPP.g:712:1: ruleInstallationLocationDescription returns [EObject current=null] : (otherlv_0= 'EINBAUORTKENNZEICHNUNG' otherlv_1= '+' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleInstallationLocationDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;


        	enterRule();

        try {
            // InternalRdsPP.g:718:2: ( (otherlv_0= 'EINBAUORTKENNZEICHNUNG' otherlv_1= '+' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? ) )
            // InternalRdsPP.g:719:2: (otherlv_0= 'EINBAUORTKENNZEICHNUNG' otherlv_1= '+' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? )
            {
            // InternalRdsPP.g:719:2: (otherlv_0= 'EINBAUORTKENNZEICHNUNG' otherlv_1= '+' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? )
            // InternalRdsPP.g:720:3: otherlv_0= 'EINBAUORTKENNZEICHNUNG' otherlv_1= '+' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getInstallationLocationDescriptionAccess().getEINBAUORTKENNZEICHNUNGKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getInstallationLocationDescriptionAccess().getPlusSignKeyword_1());
            		
            // InternalRdsPP.g:728:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRdsPP.g:729:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRdsPP.g:729:4: (lv_name_2_0= RULE_ID )
            // InternalRdsPP.g:730:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_2_0, grammarAccess.getInstallationLocationDescriptionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstallationLocationDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.rdspp.editor.RdsPP.ID");
            				

            }


            }

            // InternalRdsPP.g:746:3: (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRdsPP.g:747:4: otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getInstallationLocationDescriptionAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                    			
                    // InternalRdsPP.g:751:4: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalRdsPP.g:752:5: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalRdsPP.g:752:5: (lv_description_4_0= RULE_STRING )
                    // InternalRdsPP.g:753:6: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_description_4_0, grammarAccess.getInstallationLocationDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInstallationLocationDescriptionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstallationLocationDescription"


    // $ANTLR start "entryRuleLocationDescription"
    // InternalRdsPP.g:774:1: entryRuleLocationDescription returns [EObject current=null] : iv_ruleLocationDescription= ruleLocationDescription EOF ;
    public final EObject entryRuleLocationDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationDescription = null;


        try {
            // InternalRdsPP.g:774:60: (iv_ruleLocationDescription= ruleLocationDescription EOF )
            // InternalRdsPP.g:775:2: iv_ruleLocationDescription= ruleLocationDescription EOF
            {
             newCompositeNode(grammarAccess.getLocationDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocationDescription=ruleLocationDescription();

            state._fsp--;

             current =iv_ruleLocationDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocationDescription"


    // $ANTLR start "ruleLocationDescription"
    // InternalRdsPP.g:781:1: ruleLocationDescription returns [EObject current=null] : (otherlv_0= 'AUFSTELLUNGSORTKENNZEICHNUNG' otherlv_1= '++' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleLocationDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;


        	enterRule();

        try {
            // InternalRdsPP.g:787:2: ( (otherlv_0= 'AUFSTELLUNGSORTKENNZEICHNUNG' otherlv_1= '++' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? ) )
            // InternalRdsPP.g:788:2: (otherlv_0= 'AUFSTELLUNGSORTKENNZEICHNUNG' otherlv_1= '++' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? )
            {
            // InternalRdsPP.g:788:2: (otherlv_0= 'AUFSTELLUNGSORTKENNZEICHNUNG' otherlv_1= '++' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? )
            // InternalRdsPP.g:789:3: otherlv_0= 'AUFSTELLUNGSORTKENNZEICHNUNG' otherlv_1= '++' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getLocationDescriptionAccess().getAUFSTELLUNGSORTKENNZEICHNUNGKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getLocationDescriptionAccess().getPlusSignPlusSignKeyword_1());
            		
            // InternalRdsPP.g:797:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRdsPP.g:798:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRdsPP.g:798:4: (lv_name_2_0= RULE_ID )
            // InternalRdsPP.g:799:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_2_0, grammarAccess.getLocationDescriptionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocationDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.rdspp.editor.RdsPP.ID");
            				

            }


            }

            // InternalRdsPP.g:815:3: (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRdsPP.g:816:4: otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getLocationDescriptionAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                    			
                    // InternalRdsPP.g:820:4: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalRdsPP.g:821:5: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalRdsPP.g:821:5: (lv_description_4_0= RULE_STRING )
                    // InternalRdsPP.g:822:6: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_description_4_0, grammarAccess.getLocationDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLocationDescriptionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocationDescription"


    // $ANTLR start "entryRuleConnectionIdentification"
    // InternalRdsPP.g:843:1: entryRuleConnectionIdentification returns [EObject current=null] : iv_ruleConnectionIdentification= ruleConnectionIdentification EOF ;
    public final EObject entryRuleConnectionIdentification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionIdentification = null;


        try {
            // InternalRdsPP.g:843:65: (iv_ruleConnectionIdentification= ruleConnectionIdentification EOF )
            // InternalRdsPP.g:844:2: iv_ruleConnectionIdentification= ruleConnectionIdentification EOF
            {
             newCompositeNode(grammarAccess.getConnectionIdentificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectionIdentification=ruleConnectionIdentification();

            state._fsp--;

             current =iv_ruleConnectionIdentification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnectionIdentification"


    // $ANTLR start "ruleConnectionIdentification"
    // InternalRdsPP.g:850:1: ruleConnectionIdentification returns [EObject current=null] : (otherlv_0= 'ANSCHLUSSKENNZEICHNUNG' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleConnectionIdentification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;


        	enterRule();

        try {
            // InternalRdsPP.g:856:2: ( (otherlv_0= 'ANSCHLUSSKENNZEICHNUNG' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? ) )
            // InternalRdsPP.g:857:2: (otherlv_0= 'ANSCHLUSSKENNZEICHNUNG' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? )
            {
            // InternalRdsPP.g:857:2: (otherlv_0= 'ANSCHLUSSKENNZEICHNUNG' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? )
            // InternalRdsPP.g:858:3: otherlv_0= 'ANSCHLUSSKENNZEICHNUNG' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectionIdentificationAccess().getANSCHLUSSKENNZEICHNUNGKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectionIdentificationAccess().getColonKeyword_1());
            		
            // InternalRdsPP.g:866:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRdsPP.g:867:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRdsPP.g:867:4: (lv_name_2_0= RULE_ID )
            // InternalRdsPP.g:868:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_2_0, grammarAccess.getConnectionIdentificationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectionIdentificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.rdspp.editor.RdsPP.ID");
            				

            }


            }

            // InternalRdsPP.g:884:3: (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRdsPP.g:885:4: otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getConnectionIdentificationAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                    			
                    // InternalRdsPP.g:889:4: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalRdsPP.g:890:5: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalRdsPP.g:890:5: (lv_description_4_0= RULE_STRING )
                    // InternalRdsPP.g:891:6: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_description_4_0, grammarAccess.getConnectionIdentificationAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConnectionIdentificationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnectionIdentification"


    // $ANTLR start "entryRuleCommonAssignment"
    // InternalRdsPP.g:912:1: entryRuleCommonAssignment returns [EObject current=null] : iv_ruleCommonAssignment= ruleCommonAssignment EOF ;
    public final EObject entryRuleCommonAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonAssignment = null;


        try {
            // InternalRdsPP.g:912:57: (iv_ruleCommonAssignment= ruleCommonAssignment EOF )
            // InternalRdsPP.g:913:2: iv_ruleCommonAssignment= ruleCommonAssignment EOF
            {
             newCompositeNode(grammarAccess.getCommonAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommonAssignment=ruleCommonAssignment();

            state._fsp--;

             current =iv_ruleCommonAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommonAssignment"


    // $ANTLR start "ruleCommonAssignment"
    // InternalRdsPP.g:919:1: ruleCommonAssignment returns [EObject current=null] : (otherlv_0= 'GEMEINSAMEZUORDNUNG' otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleCommonAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;


        	enterRule();

        try {
            // InternalRdsPP.g:925:2: ( (otherlv_0= 'GEMEINSAMEZUORDNUNG' otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? ) )
            // InternalRdsPP.g:926:2: (otherlv_0= 'GEMEINSAMEZUORDNUNG' otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? )
            {
            // InternalRdsPP.g:926:2: (otherlv_0= 'GEMEINSAMEZUORDNUNG' otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? )
            // InternalRdsPP.g:927:3: otherlv_0= 'GEMEINSAMEZUORDNUNG' otherlv_1= '#' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getCommonAssignmentAccess().getGEMEINSAMEZUORDNUNGKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCommonAssignmentAccess().getNumberSignKeyword_1());
            		
            // InternalRdsPP.g:935:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRdsPP.g:936:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRdsPP.g:936:4: (lv_name_2_0= RULE_ID )
            // InternalRdsPP.g:937:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCommonAssignmentAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommonAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.rdspp.editor.RdsPP.ID");
            				

            }


            }

            // InternalRdsPP.g:953:3: (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRdsPP.g:954:4: otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getCommonAssignmentAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                    			
                    // InternalRdsPP.g:958:4: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalRdsPP.g:959:5: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalRdsPP.g:959:5: (lv_description_4_0= RULE_STRING )
                    // InternalRdsPP.g:960:6: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_description_4_0, grammarAccess.getCommonAssignmentAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCommonAssignmentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommonAssignment"


    // $ANTLR start "entryRuleProductDescription"
    // InternalRdsPP.g:981:1: entryRuleProductDescription returns [EObject current=null] : iv_ruleProductDescription= ruleProductDescription EOF ;
    public final EObject entryRuleProductDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductDescription = null;


        try {
            // InternalRdsPP.g:981:59: (iv_ruleProductDescription= ruleProductDescription EOF )
            // InternalRdsPP.g:982:2: iv_ruleProductDescription= ruleProductDescription EOF
            {
             newCompositeNode(grammarAccess.getProductDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProductDescription=ruleProductDescription();

            state._fsp--;

             current =iv_ruleProductDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProductDescription"


    // $ANTLR start "ruleProductDescription"
    // InternalRdsPP.g:988:1: ruleProductDescription returns [EObject current=null] : (otherlv_0= 'PRODUKTBEZOGENEKENNZEICHNUNG' otherlv_1= '-' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleProductDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;


        	enterRule();

        try {
            // InternalRdsPP.g:994:2: ( (otherlv_0= 'PRODUKTBEZOGENEKENNZEICHNUNG' otherlv_1= '-' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? ) )
            // InternalRdsPP.g:995:2: (otherlv_0= 'PRODUKTBEZOGENEKENNZEICHNUNG' otherlv_1= '-' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? )
            {
            // InternalRdsPP.g:995:2: (otherlv_0= 'PRODUKTBEZOGENEKENNZEICHNUNG' otherlv_1= '-' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )? )
            // InternalRdsPP.g:996:3: otherlv_0= 'PRODUKTBEZOGENEKENNZEICHNUNG' otherlv_1= '-' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getProductDescriptionAccess().getPRODUKTBEZOGENEKENNZEICHNUNGKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getProductDescriptionAccess().getHyphenMinusKeyword_1());
            		
            // InternalRdsPP.g:1004:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRdsPP.g:1005:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRdsPP.g:1005:4: (lv_name_2_0= RULE_ID )
            // InternalRdsPP.g:1006:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_2_0, grammarAccess.getProductDescriptionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.rdspp.editor.RdsPP.ID");
            				

            }


            }

            // InternalRdsPP.g:1022:3: (otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==22) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRdsPP.g:1023:4: otherlv_3= '->' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getProductDescriptionAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                    			
                    // InternalRdsPP.g:1027:4: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalRdsPP.g:1028:5: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalRdsPP.g:1028:5: (lv_description_4_0= RULE_STRING )
                    // InternalRdsPP.g:1029:6: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_description_4_0, grammarAccess.getProductDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProductDescriptionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProductDescription"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000007FA00802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000001FF002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001FE002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001FC002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001F8002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001F0002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000020000L});

}