package de.rdspp.editor.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRdsPPLexer extends Lexer {
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

    public InternalRdsPPLexer() {;} 
    public InternalRdsPPLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRdsPPLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRdsPP.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRdsPP.g:11:7: ( 'RDS-PPKENNZEICHNUNG' )
            // InternalRdsPP.g:11:9: 'RDS-PPKENNZEICHNUNG'
            {
            match("RDS-PPKENNZEICHNUNG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRdsPP.g:12:7: ( '#' )
            // InternalRdsPP.g:12:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRdsPP.g:13:7: ( '=' )
            // InternalRdsPP.g:13:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRdsPP.g:14:7: ( '==' )
            // InternalRdsPP.g:14:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRdsPP.g:15:7: ( '+' )
            // InternalRdsPP.g:15:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRdsPP.g:16:7: ( '++' )
            // InternalRdsPP.g:16:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRdsPP.g:17:7: ( '-' )
            // InternalRdsPP.g:17:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRdsPP.g:18:7: ( ':' )
            // InternalRdsPP.g:18:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRdsPP.g:19:7: ( ';' )
            // InternalRdsPP.g:19:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRdsPP.g:20:7: ( '&' )
            // InternalRdsPP.g:20:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRdsPP.g:21:7: ( 'SIGNALKENNZEICHNUNG' )
            // InternalRdsPP.g:21:9: 'SIGNALKENNZEICHNUNG'
            {
            match("SIGNALKENNZEICHNUNG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRdsPP.g:22:7: ( '->' )
            // InternalRdsPP.g:22:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRdsPP.g:23:7: ( 'DOKUMENTENKENNZEICHNUNG' )
            // InternalRdsPP.g:23:9: 'DOKUMENTENKENNZEICHNUNG'
            {
            match("DOKUMENTENKENNZEICHNUNG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRdsPP.g:24:7: ( 'FUNKTIONALEZUORDNUNG' )
            // InternalRdsPP.g:24:9: 'FUNKTIONALEZUORDNUNG'
            {
            match("FUNKTIONALEZUORDNUNG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRdsPP.g:25:7: ( 'FUNKTIONSBEZOGENEKENNZEICHNUNG' )
            // InternalRdsPP.g:25:9: 'FUNKTIONSBEZOGENEKENNZEICHNUNG'
            {
            match("FUNKTIONSBEZOGENEKENNZEICHNUNG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRdsPP.g:26:7: ( 'EINBAUORTKENNZEICHNUNG' )
            // InternalRdsPP.g:26:9: 'EINBAUORTKENNZEICHNUNG'
            {
            match("EINBAUORTKENNZEICHNUNG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRdsPP.g:27:7: ( 'AUFSTELLUNGSORTKENNZEICHNUNG' )
            // InternalRdsPP.g:27:9: 'AUFSTELLUNGSORTKENNZEICHNUNG'
            {
            match("AUFSTELLUNGSORTKENNZEICHNUNG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRdsPP.g:28:7: ( 'ANSCHLUSSKENNZEICHNUNG' )
            // InternalRdsPP.g:28:9: 'ANSCHLUSSKENNZEICHNUNG'
            {
            match("ANSCHLUSSKENNZEICHNUNG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRdsPP.g:29:7: ( 'GEMEINSAMEZUORDNUNG' )
            // InternalRdsPP.g:29:9: 'GEMEINSAMEZUORDNUNG'
            {
            match("GEMEINSAMEZUORDNUNG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRdsPP.g:30:7: ( 'PRODUKTBEZOGENEKENNZEICHNUNG' )
            // InternalRdsPP.g:30:9: 'PRODUKTBEZOGENEKENNZEICHNUNG'
            {
            match("PRODUKTBEZOGENEKENNZEICHNUNG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRdsPP.g:1049:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT ) ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT | '.' | '/' | '_' )* )
            // InternalRdsPP.g:1049:11: ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT ) ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT | '.' | '/' | '_' )*
            {
            // InternalRdsPP.g:1049:11: ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt1=1;
                }
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                {
                alt1=2;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRdsPP.g:1049:12: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 2 :
                    // InternalRdsPP.g:1049:21: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;
                case 3 :
                    // InternalRdsPP.g:1049:30: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;

            }

            // InternalRdsPP.g:1049:40: ( 'a' .. 'z' | 'A' .. 'Z' | RULE_INT | '.' | '/' | '_' )*
            loop2:
            do {
                int alt2=7;
                switch ( input.LA(1) ) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt2=1;
                    }
                    break;
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    {
                    alt2=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt2=3;
                    }
                    break;
                case '.':
                    {
                    alt2=4;
                    }
                    break;
                case '/':
                    {
                    alt2=5;
                    }
                    break;
                case '_':
                    {
                    alt2=6;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalRdsPP.g:1049:41: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // InternalRdsPP.g:1049:50: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalRdsPP.g:1049:59: RULE_INT
            	    {
            	    mRULE_INT(); 

            	    }
            	    break;
            	case 4 :
            	    // InternalRdsPP.g:1049:68: '.'
            	    {
            	    match('.'); 

            	    }
            	    break;
            	case 5 :
            	    // InternalRdsPP.g:1049:72: '/'
            	    {
            	    match('/'); 

            	    }
            	    break;
            	case 6 :
            	    // InternalRdsPP.g:1049:76: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalRdsPP.g:1051:19: ( ( '0' .. '9' )+ )
            // InternalRdsPP.g:1051:21: ( '0' .. '9' )+
            {
            // InternalRdsPP.g:1051:21: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRdsPP.g:1051:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRdsPP.g:1053:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRdsPP.g:1053:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRdsPP.g:1053:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRdsPP.g:1053:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRdsPP.g:1053:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRdsPP.g:1053:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRdsPP.g:1053:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalRdsPP.g:1053:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRdsPP.g:1053:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRdsPP.g:1053:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRdsPP.g:1053:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRdsPP.g:1055:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRdsPP.g:1055:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRdsPP.g:1055:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRdsPP.g:1055:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRdsPP.g:1057:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalRdsPP.g:1057:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalRdsPP.g:1057:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRdsPP.g:1057:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalRdsPP.g:1057:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRdsPP.g:1057:41: ( '\\r' )? '\\n'
                    {
                    // InternalRdsPP.g:1057:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalRdsPP.g:1057:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRdsPP.g:1059:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRdsPP.g:1059:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRdsPP.g:1059:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRdsPP.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRdsPP.g:1061:16: ( . )
            // InternalRdsPP.g:1061:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalRdsPP.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=26;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalRdsPP.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalRdsPP.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalRdsPP.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalRdsPP.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalRdsPP.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalRdsPP.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalRdsPP.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalRdsPP.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalRdsPP.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalRdsPP.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalRdsPP.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalRdsPP.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalRdsPP.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalRdsPP.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalRdsPP.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalRdsPP.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalRdsPP.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalRdsPP.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalRdsPP.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalRdsPP.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalRdsPP.g:1:130: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 22 :
                // InternalRdsPP.g:1:138: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 23 :
                // InternalRdsPP.g:1:150: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 24 :
                // InternalRdsPP.g:1:166: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 25 :
                // InternalRdsPP.g:1:182: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 26 :
                // InternalRdsPP.g:1:190: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\31\1\uffff\1\34\1\36\1\40\3\uffff\7\31\3\uffff\3\27\2\uffff\1\31\13\uffff\10\31\4\uffff\11\31\1\uffff\u0082\31\1\u00c5\6\31\1\u00cc\1\31\1\uffff\1\31\1\u00cf\4\31\1\uffff\2\31\1\uffff\7\31\1\u00dd\1\31\1\u00df\1\31\1\u00e1\1\31\1\uffff\1\31\1\uffff\1\31\1\uffff\15\31\1\u00f2\1\u00f3\1\31\2\uffff\1\u00f5\1\uffff";
    static final String DFA12_eofS =
        "\u00f6\uffff";
    static final String DFA12_minS =
        "\1\0\1\104\1\uffff\1\75\1\53\1\76\3\uffff\1\111\1\117\1\125\1\111\1\116\1\105\1\122\3\uffff\2\0\1\52\2\uffff\1\123\13\uffff\1\107\1\113\2\116\1\106\1\123\1\115\1\117\4\uffff\1\55\1\116\1\125\1\113\1\102\1\123\1\103\1\105\1\104\1\uffff\1\101\1\115\1\124\1\101\1\124\1\110\1\111\1\125\1\114\1\105\1\111\1\125\1\105\1\114\1\116\2\113\1\116\2\117\1\114\1\125\1\123\1\124\1\105\1\124\1\116\1\122\1\114\1\123\1\101\1\102\1\116\1\105\1\101\1\124\1\125\1\123\1\115\1\105\2\116\1\114\1\102\1\113\1\116\1\113\1\105\2\132\1\113\3\105\1\107\1\105\1\132\1\117\2\105\2\132\1\116\1\123\1\116\1\125\1\107\1\111\1\116\1\125\1\117\1\116\1\117\1\116\1\117\1\105\1\103\1\116\1\117\1\107\1\132\1\122\1\132\1\122\1\116\1\110\1\132\1\122\2\105\1\124\1\105\1\104\1\105\1\116\1\105\1\104\1\116\1\111\1\113\1\111\1\116\1\113\1\125\1\111\1\116\1\105\1\103\1\105\1\103\1\125\1\105\1\116\1\103\1\125\1\113\1\110\1\116\1\110\2\116\1\107\1\110\1\116\1\105\3\116\1\107\1\116\1\56\1\116\1\107\1\116\1\125\1\132\1\125\1\56\1\132\1\uffff\1\125\1\56\2\116\1\105\1\116\1\uffff\1\105\1\116\1\uffff\1\132\1\107\1\111\1\107\1\111\1\107\1\105\1\56\1\103\1\56\1\103\1\56\1\111\1\uffff\1\110\1\uffff\1\110\1\uffff\1\103\2\116\1\110\2\125\3\116\1\125\2\107\1\116\2\56\1\107\2\uffff\1\56\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\104\1\uffff\1\75\1\53\1\76\3\uffff\1\111\1\117\1\125\1\111\1\125\1\105\1\122\3\uffff\2\uffff\1\57\2\uffff\1\123\13\uffff\1\107\1\113\2\116\1\106\1\123\1\115\1\117\4\uffff\1\55\1\116\1\125\1\113\1\102\1\123\1\103\1\105\1\104\1\uffff\1\101\1\115\1\124\1\101\1\124\1\110\1\111\1\125\1\114\1\105\1\111\1\125\1\105\1\114\1\116\2\113\1\116\2\117\1\114\1\125\1\123\1\124\1\105\1\124\1\116\1\122\1\114\1\123\1\101\1\102\1\116\1\105\1\123\1\124\1\125\1\123\1\115\1\105\2\116\1\114\1\102\1\113\1\116\1\113\1\105\2\132\1\113\3\105\1\107\1\105\1\132\1\117\2\105\2\132\1\116\1\123\1\116\1\125\1\107\1\111\1\116\1\125\1\117\1\116\1\117\1\116\1\117\1\105\1\103\1\116\1\117\1\107\1\132\1\122\1\132\1\122\1\116\1\110\1\132\1\122\2\105\1\124\1\105\1\104\1\105\1\116\1\105\1\104\1\116\1\111\1\113\1\111\1\116\1\113\1\125\1\111\1\116\1\105\1\103\1\105\1\103\1\125\1\105\1\116\1\103\1\125\1\113\1\110\1\116\1\110\2\116\1\107\1\110\1\116\1\105\3\116\1\107\1\116\1\172\1\116\1\107\1\116\1\125\1\132\1\125\1\172\1\132\1\uffff\1\125\1\172\2\116\1\105\1\116\1\uffff\1\105\1\116\1\uffff\1\132\1\107\1\111\1\107\1\111\1\107\1\105\1\172\1\103\1\172\1\103\1\172\1\111\1\uffff\1\110\1\uffff\1\110\1\uffff\1\103\2\116\1\110\2\125\3\116\1\125\2\107\1\116\2\172\1\107\2\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\3\uffff\1\10\1\11\1\12\7\uffff\3\25\3\uffff\1\31\1\32\1\uffff\1\25\1\2\1\4\1\3\1\6\1\5\1\14\1\7\1\10\1\11\1\12\10\uffff\1\26\1\27\1\30\1\31\11\uffff\1\1\u008b\uffff\1\13\6\uffff\1\23\2\uffff\1\16\15\uffff\1\20\1\uffff\1\22\1\uffff\1\15\20\uffff\1\21\1\24\1\uffff\1\17";
    static final String DFA12_specialS =
        "\1\0\22\uffff\1\2\1\1\u00e1\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\27\1\23\1\2\2\27\1\10\1\24\3\27\1\4\1\27\1\5\1\27\1\25\12\22\1\6\1\7\1\27\1\3\3\27\1\15\2\21\1\12\1\14\1\13\1\16\10\21\1\17\1\21\1\1\1\11\7\21\6\27\32\20\uff85\27",
            "\1\30",
            "",
            "\1\33",
            "\1\35",
            "\1\37",
            "",
            "",
            "",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\51\6\uffff\1\50",
            "\1\52",
            "\1\53",
            "",
            "",
            "",
            "\0\54",
            "\0\54",
            "\1\55\4\uffff\1\56",
            "",
            "",
            "\1\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "",
            "",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144\21\uffff\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\14\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\14\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "\14\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\14\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u00de",
            "\14\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u00e0",
            "\14\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u00e2",
            "",
            "\1\u00e3",
            "",
            "\1\u00e4",
            "",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\14\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\14\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u00f4",
            "",
            "",
            "\14\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='R') ) {s = 1;}

                        else if ( (LA12_0=='#') ) {s = 2;}

                        else if ( (LA12_0=='=') ) {s = 3;}

                        else if ( (LA12_0=='+') ) {s = 4;}

                        else if ( (LA12_0=='-') ) {s = 5;}

                        else if ( (LA12_0==':') ) {s = 6;}

                        else if ( (LA12_0==';') ) {s = 7;}

                        else if ( (LA12_0=='&') ) {s = 8;}

                        else if ( (LA12_0=='S') ) {s = 9;}

                        else if ( (LA12_0=='D') ) {s = 10;}

                        else if ( (LA12_0=='F') ) {s = 11;}

                        else if ( (LA12_0=='E') ) {s = 12;}

                        else if ( (LA12_0=='A') ) {s = 13;}

                        else if ( (LA12_0=='G') ) {s = 14;}

                        else if ( (LA12_0=='P') ) {s = 15;}

                        else if ( ((LA12_0>='a' && LA12_0<='z')) ) {s = 16;}

                        else if ( ((LA12_0>='B' && LA12_0<='C')||(LA12_0>='H' && LA12_0<='O')||LA12_0=='Q'||(LA12_0>='T' && LA12_0<='Z')) ) {s = 17;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 18;}

                        else if ( (LA12_0=='\"') ) {s = 19;}

                        else if ( (LA12_0=='\'') ) {s = 20;}

                        else if ( (LA12_0=='/') ) {s = 21;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 22;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='$' && LA12_0<='%')||(LA12_0>='(' && LA12_0<='*')||LA12_0==','||LA12_0=='.'||LA12_0=='<'||(LA12_0>='>' && LA12_0<='@')||(LA12_0>='[' && LA12_0<='`')||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_20 = input.LA(1);

                        s = -1;
                        if ( ((LA12_20>='\u0000' && LA12_20<='\uFFFF')) ) {s = 44;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_19 = input.LA(1);

                        s = -1;
                        if ( ((LA12_19>='\u0000' && LA12_19<='\uFFFF')) ) {s = 44;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}