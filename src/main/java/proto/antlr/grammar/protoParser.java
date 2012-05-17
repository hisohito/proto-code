// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 grammar\\proto.g 2012-05-17 13:39:29

	package grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class protoParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "STRING", "COMMENT", "WS", "ESC_SEQ", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'prototype'", "'('", "')'", "'{'", "'}'", "'finally'", "'globally'", "';'", "'until'", "'release'", "'if'", "'or'", "'and'", "'not'", "'=='", "'!='", "'interface'", "','", "'void'", "'state'", "'number'", "'bool'", "'string'", "'object'", "'['", "']'", "'class'", "'<'", "'<<'", "'='", "'die'", "'print'", "'return'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'nan'", "'nil'", "'new'", "'else'", "'for'", "'while'", "'do'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int OCTAL_ESC=12;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int ESC_SEQ=9;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int COMMENT=7;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int UNICODE_ESC=11;
    public static final int HEX_DIGIT=10;
    public static final int INT=5;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=8;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int STRING=6;

    // delegates
    // delegators


        public protoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public protoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return protoParser.tokenNames; }
    public String getGrammarFileName() { return "grammar\\proto.g"; }



    // $ANTLR start "program"
    // grammar\\proto.g:7:1: program : ( statement )* ;
    public final void program() throws RecognitionException {
        try {
            // grammar\\proto.g:8:5: ( ( statement )* )
            // grammar\\proto.g:8:7: ( statement )*
            {
            // grammar\\proto.g:8:7: ( statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==29||LA1_0==39) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // grammar\\proto.g:8:9: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_program29);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "program"


    // $ANTLR start "statement"
    // grammar\\proto.g:11:1: statement : ( interface_decl | class_decl | proto_decl );
    public final void statement() throws RecognitionException {
        try {
            // grammar\\proto.g:12:5: ( interface_decl | class_decl | proto_decl )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt2=1;
                }
                break;
            case 39:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // grammar\\proto.g:12:7: interface_decl
                    {
                    pushFollow(FOLLOW_interface_decl_in_statement54);
                    interface_decl();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // grammar\\proto.g:12:24: class_decl
                    {
                    pushFollow(FOLLOW_class_decl_in_statement58);
                    class_decl();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // grammar\\proto.g:12:37: proto_decl
                    {
                    pushFollow(FOLLOW_proto_decl_in_statement62);
                    proto_decl();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "statement"


    // $ANTLR start "proto_decl"
    // grammar\\proto.g:15:1: proto_decl : 'prototype' ID '(' parameters ')' '{' ( spec_decl )* '}' ;
    public final void proto_decl() throws RecognitionException {
        try {
            // grammar\\proto.g:16:5: ( 'prototype' ID '(' parameters ')' '{' ( spec_decl )* '}' )
            // grammar\\proto.g:16:7: 'prototype' ID '(' parameters ')' '{' ( spec_decl )* '}'
            {
            match(input,13,FOLLOW_13_in_proto_decl84); 
            match(input,ID,FOLLOW_ID_in_proto_decl86); 
            match(input,14,FOLLOW_14_in_proto_decl88); 
            pushFollow(FOLLOW_parameters_in_proto_decl90);
            parameters();

            state._fsp--;

            match(input,15,FOLLOW_15_in_proto_decl92); 
            match(input,16,FOLLOW_16_in_proto_decl94); 
            // grammar\\proto.g:16:45: ( spec_decl )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID||LA3_0==14||(LA3_0>=18 && LA3_0<=19)||LA3_0==26) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // grammar\\proto.g:16:47: spec_decl
            	    {
            	    pushFollow(FOLLOW_spec_decl_in_proto_decl98);
            	    spec_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_proto_decl103); 

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
    // $ANTLR end "proto_decl"


    // $ANTLR start "spec_decl"
    // grammar\\proto.g:19:1: spec_decl : ( ( 'finally' | 'globally' ) spec_expression ';' | spec_expression ( 'until' | 'release' | 'if' ) spec_expression ';' );
    public final void spec_decl() throws RecognitionException {
        try {
            // grammar\\proto.g:20:5: ( ( 'finally' | 'globally' ) spec_expression ';' | spec_expression ( 'until' | 'release' | 'if' ) spec_expression ';' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=18 && LA4_0<=19)) ) {
                alt4=1;
            }
            else if ( (LA4_0==ID||LA4_0==14||LA4_0==26) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // grammar\\proto.g:20:7: ( 'finally' | 'globally' ) spec_expression ';'
                    {
                    if ( (input.LA(1)>=18 && input.LA(1)<=19) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_spec_expression_in_spec_decl128);
                    spec_expression();

                    state._fsp--;

                    match(input,20,FOLLOW_20_in_spec_decl130); 

                    }
                    break;
                case 2 :
                    // grammar\\proto.g:20:54: spec_expression ( 'until' | 'release' | 'if' ) spec_expression ';'
                    {
                    pushFollow(FOLLOW_spec_expression_in_spec_decl134);
                    spec_expression();

                    state._fsp--;

                    if ( (input.LA(1)>=21 && input.LA(1)<=23) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_spec_expression_in_spec_decl150);
                    spec_expression();

                    state._fsp--;

                    match(input,20,FOLLOW_20_in_spec_decl152); 

                    }
                    break;

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
    // $ANTLR end "spec_decl"


    // $ANTLR start "spec_expression"
    // grammar\\proto.g:23:1: spec_expression : ( ( '(' or_spec ')' ) | ( or_spec ) );
    public final void spec_expression() throws RecognitionException {
        try {
            // grammar\\proto.g:24:5: ( ( '(' or_spec ')' ) | ( or_spec ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==ID||LA5_0==26) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // grammar\\proto.g:24:7: ( '(' or_spec ')' )
                    {
                    // grammar\\proto.g:24:7: ( '(' or_spec ')' )
                    // grammar\\proto.g:24:9: '(' or_spec ')'
                    {
                    match(input,14,FOLLOW_14_in_spec_expression175); 
                    pushFollow(FOLLOW_or_spec_in_spec_expression177);
                    or_spec();

                    state._fsp--;

                    match(input,15,FOLLOW_15_in_spec_expression179); 

                    }


                    }
                    break;
                case 2 :
                    // grammar\\proto.g:24:29: ( or_spec )
                    {
                    // grammar\\proto.g:24:29: ( or_spec )
                    // grammar\\proto.g:24:31: or_spec
                    {
                    pushFollow(FOLLOW_or_spec_in_spec_expression187);
                    or_spec();

                    state._fsp--;


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
        }
        return ;
    }
    // $ANTLR end "spec_expression"


    // $ANTLR start "or_spec"
    // grammar\\proto.g:27:1: or_spec : and_spec ( 'or' and_spec )? ;
    public final void or_spec() throws RecognitionException {
        try {
            // grammar\\proto.g:28:5: ( and_spec ( 'or' and_spec )? )
            // grammar\\proto.g:28:7: and_spec ( 'or' and_spec )?
            {
            pushFollow(FOLLOW_and_spec_in_or_spec210);
            and_spec();

            state._fsp--;

            // grammar\\proto.g:28:16: ( 'or' and_spec )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // grammar\\proto.g:28:18: 'or' and_spec
                    {
                    match(input,24,FOLLOW_24_in_or_spec214); 
                    pushFollow(FOLLOW_and_spec_in_or_spec216);
                    and_spec();

                    state._fsp--;


                    }
                    break;

            }


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
    // $ANTLR end "or_spec"


    // $ANTLR start "and_spec"
    // grammar\\proto.g:30:1: and_spec : not_spec ( 'and' not_spec )? ;
    public final void and_spec() throws RecognitionException {
        try {
            // grammar\\proto.g:31:5: ( not_spec ( 'and' not_spec )? )
            // grammar\\proto.g:31:7: not_spec ( 'and' not_spec )?
            {
            pushFollow(FOLLOW_not_spec_in_and_spec235);
            not_spec();

            state._fsp--;

            // grammar\\proto.g:31:16: ( 'and' not_spec )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // grammar\\proto.g:31:18: 'and' not_spec
                    {
                    match(input,25,FOLLOW_25_in_and_spec239); 
                    pushFollow(FOLLOW_not_spec_in_and_spec241);
                    not_spec();

                    state._fsp--;


                    }
                    break;

            }


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
    // $ANTLR end "and_spec"


    // $ANTLR start "not_spec"
    // grammar\\proto.g:34:1: not_spec : ( 'not' )? spec ;
    public final void not_spec() throws RecognitionException {
        try {
            // grammar\\proto.g:35:5: ( ( 'not' )? spec )
            // grammar\\proto.g:35:7: ( 'not' )? spec
            {
            // grammar\\proto.g:35:7: ( 'not' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // grammar\\proto.g:35:9: 'not'
                    {
                    match(input,26,FOLLOW_26_in_not_spec267); 

                    }
                    break;

            }

            pushFollow(FOLLOW_spec_in_not_spec272);
            spec();

            state._fsp--;


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
    // $ANTLR end "not_spec"


    // $ANTLR start "spec"
    // grammar\\proto.g:38:1: spec : ID ( '==' ID | '!=' ID )* ;
    public final void spec() throws RecognitionException {
        try {
            // grammar\\proto.g:39:5: ( ID ( '==' ID | '!=' ID )* )
            // grammar\\proto.g:39:7: ID ( '==' ID | '!=' ID )*
            {
            match(input,ID,FOLLOW_ID_in_spec293); 
            // grammar\\proto.g:39:10: ( '==' ID | '!=' ID )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }
                else if ( (LA9_0==28) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // grammar\\proto.g:39:12: '==' ID
            	    {
            	    match(input,27,FOLLOW_27_in_spec297); 
            	    match(input,ID,FOLLOW_ID_in_spec299); 

            	    }
            	    break;
            	case 2 :
            	    // grammar\\proto.g:39:22: '!=' ID
            	    {
            	    match(input,28,FOLLOW_28_in_spec303); 
            	    match(input,ID,FOLLOW_ID_in_spec305); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


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
    // $ANTLR end "spec"


    // $ANTLR start "interface_decl"
    // grammar\\proto.g:42:1: interface_decl : 'interface' ID '{' ( method_decl )* '}' ;
    public final void interface_decl() throws RecognitionException {
        try {
            // grammar\\proto.g:43:5: ( 'interface' ID '{' ( method_decl )* '}' )
            // grammar\\proto.g:43:7: 'interface' ID '{' ( method_decl )* '}'
            {
            match(input,29,FOLLOW_29_in_interface_decl326); 
            match(input,ID,FOLLOW_ID_in_interface_decl328); 
            match(input,16,FOLLOW_16_in_interface_decl330); 
            // grammar\\proto.g:43:26: ( method_decl )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=31 && LA10_0<=36)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // grammar\\proto.g:43:28: method_decl
            	    {
            	    pushFollow(FOLLOW_method_decl_in_interface_decl334);
            	    method_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_interface_decl339); 

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
    // $ANTLR end "interface_decl"


    // $ANTLR start "method_decl"
    // grammar\\proto.g:46:1: method_decl : type ID '(' arguments ')' ';' ;
    public final void method_decl() throws RecognitionException {
        try {
            // grammar\\proto.g:47:5: ( type ID '(' arguments ')' ';' )
            // grammar\\proto.g:47:7: type ID '(' arguments ')' ';'
            {
            pushFollow(FOLLOW_type_in_method_decl360);
            type();

            state._fsp--;

            match(input,ID,FOLLOW_ID_in_method_decl362); 
            match(input,14,FOLLOW_14_in_method_decl364); 
            pushFollow(FOLLOW_arguments_in_method_decl366);
            arguments();

            state._fsp--;

            match(input,15,FOLLOW_15_in_method_decl368); 
            match(input,20,FOLLOW_20_in_method_decl370); 

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
    // $ANTLR end "method_decl"


    // $ANTLR start "arguments"
    // grammar\\proto.g:50:1: arguments : ( type ID ( ',' type ID )* )? ;
    public final void arguments() throws RecognitionException {
        try {
            // grammar\\proto.g:51:5: ( ( type ID ( ',' type ID )* )? )
            // grammar\\proto.g:51:7: ( type ID ( ',' type ID )* )?
            {
            // grammar\\proto.g:51:7: ( type ID ( ',' type ID )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=31 && LA12_0<=36)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // grammar\\proto.g:51:9: type ID ( ',' type ID )*
                    {
                    pushFollow(FOLLOW_type_in_arguments393);
                    type();

                    state._fsp--;

                    match(input,ID,FOLLOW_ID_in_arguments395); 
                    // grammar\\proto.g:51:17: ( ',' type ID )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==30) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // grammar\\proto.g:51:19: ',' type ID
                    	    {
                    	    match(input,30,FOLLOW_30_in_arguments399); 
                    	    pushFollow(FOLLOW_type_in_arguments401);
                    	    type();

                    	    state._fsp--;

                    	    match(input,ID,FOLLOW_ID_in_arguments403); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }


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
    // $ANTLR end "arguments"


    // $ANTLR start "parameters"
    // grammar\\proto.g:54:1: parameters : ( big_expression ( ',' big_expression )* )? ;
    public final void parameters() throws RecognitionException {
        try {
            // grammar\\proto.g:55:5: ( ( big_expression ( ',' big_expression )* )? )
            // grammar\\proto.g:55:7: ( big_expression ( ',' big_expression )* )?
            {
            // grammar\\proto.g:55:7: ( big_expression ( ',' big_expression )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=ID && LA14_0<=STRING)||LA14_0==14||LA14_0==26||LA14_0==37||(LA14_0>=53 && LA14_0<=55)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // grammar\\proto.g:55:9: big_expression ( ',' big_expression )*
                    {
                    pushFollow(FOLLOW_big_expression_in_parameters432);
                    big_expression();

                    state._fsp--;

                    // grammar\\proto.g:55:24: ( ',' big_expression )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==30) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // grammar\\proto.g:55:26: ',' big_expression
                    	    {
                    	    match(input,30,FOLLOW_30_in_parameters436); 
                    	    pushFollow(FOLLOW_big_expression_in_parameters438);
                    	    big_expression();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }


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
    // $ANTLR end "parameters"


    // $ANTLR start "type"
    // grammar\\proto.g:58:1: type : ( 'void' | 'state' array | 'number' array | 'bool' array | 'string' array | 'object' array );
    public final void type() throws RecognitionException {
        try {
            // grammar\\proto.g:59:5: ( 'void' | 'state' array | 'number' array | 'bool' array | 'string' array | 'object' array )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt15=1;
                }
                break;
            case 32:
                {
                alt15=2;
                }
                break;
            case 33:
                {
                alt15=3;
                }
                break;
            case 34:
                {
                alt15=4;
                }
                break;
            case 35:
                {
                alt15=5;
                }
                break;
            case 36:
                {
                alt15=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // grammar\\proto.g:59:7: 'void'
                    {
                    match(input,31,FOLLOW_31_in_type465); 

                    }
                    break;
                case 2 :
                    // grammar\\proto.g:59:16: 'state' array
                    {
                    match(input,32,FOLLOW_32_in_type469); 
                    pushFollow(FOLLOW_array_in_type471);
                    array();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // grammar\\proto.g:59:32: 'number' array
                    {
                    match(input,33,FOLLOW_33_in_type475); 
                    pushFollow(FOLLOW_array_in_type477);
                    array();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // grammar\\proto.g:59:49: 'bool' array
                    {
                    match(input,34,FOLLOW_34_in_type481); 
                    pushFollow(FOLLOW_array_in_type483);
                    array();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // grammar\\proto.g:59:64: 'string' array
                    {
                    match(input,35,FOLLOW_35_in_type487); 
                    pushFollow(FOLLOW_array_in_type489);
                    array();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // grammar\\proto.g:59:81: 'object' array
                    {
                    match(input,36,FOLLOW_36_in_type493); 
                    pushFollow(FOLLOW_array_in_type495);
                    array();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "type"


    // $ANTLR start "array"
    // grammar\\proto.g:62:1: array : ( '[' ']' )* ;
    public final void array() throws RecognitionException {
        try {
            // grammar\\proto.g:63:5: ( ( '[' ']' )* )
            // grammar\\proto.g:63:7: ( '[' ']' )*
            {
            // grammar\\proto.g:63:7: ( '[' ']' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==37) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // grammar\\proto.g:63:9: '[' ']'
            	    {
            	    match(input,37,FOLLOW_37_in_array518); 
            	    match(input,38,FOLLOW_38_in_array520); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


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
    // $ANTLR end "array"


    // $ANTLR start "class_decl"
    // grammar\\proto.g:66:1: class_decl : 'class' ID ( '<' ID ( ',' ID )* )? ( '<<' ID )? '{' ( ( method | field ) )* '}' ;
    public final void class_decl() throws RecognitionException {
        try {
            // grammar\\proto.g:67:5: ( 'class' ID ( '<' ID ( ',' ID )* )? ( '<<' ID )? '{' ( ( method | field ) )* '}' )
            // grammar\\proto.g:67:7: 'class' ID ( '<' ID ( ',' ID )* )? ( '<<' ID )? '{' ( ( method | field ) )* '}'
            {
            match(input,39,FOLLOW_39_in_class_decl544); 
            match(input,ID,FOLLOW_ID_in_class_decl546); 
            // grammar\\proto.g:67:18: ( '<' ID ( ',' ID )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==40) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // grammar\\proto.g:67:20: '<' ID ( ',' ID )*
                    {
                    match(input,40,FOLLOW_40_in_class_decl550); 
                    match(input,ID,FOLLOW_ID_in_class_decl552); 
                    // grammar\\proto.g:67:27: ( ',' ID )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==30) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // grammar\\proto.g:67:29: ',' ID
                    	    {
                    	    match(input,30,FOLLOW_30_in_class_decl556); 
                    	    match(input,ID,FOLLOW_ID_in_class_decl558); 

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            // grammar\\proto.g:67:42: ( '<<' ID )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==41) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // grammar\\proto.g:67:44: '<<' ID
                    {
                    match(input,41,FOLLOW_41_in_class_decl568); 
                    match(input,ID,FOLLOW_ID_in_class_decl570); 

                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_class_decl575); 
            // grammar\\proto.g:67:59: ( ( method | field ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=31 && LA21_0<=36)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // grammar\\proto.g:67:61: ( method | field )
            	    {
            	    // grammar\\proto.g:67:61: ( method | field )
            	    int alt20=2;
            	    alt20 = dfa20.predict(input);
            	    switch (alt20) {
            	        case 1 :
            	            // grammar\\proto.g:67:63: method
            	            {
            	            pushFollow(FOLLOW_method_in_class_decl581);
            	            method();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // grammar\\proto.g:67:72: field
            	            {
            	            pushFollow(FOLLOW_field_in_class_decl585);
            	            field();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_class_decl592); 

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
    // $ANTLR end "class_decl"


    // $ANTLR start "method"
    // grammar\\proto.g:70:1: method : type ID '(' arguments ')' '{' ( operator )* '}' ;
    public final void method() throws RecognitionException {
        try {
            // grammar\\proto.g:71:5: ( type ID '(' arguments ')' '{' ( operator )* '}' )
            // grammar\\proto.g:71:7: type ID '(' arguments ')' '{' ( operator )* '}'
            {
            pushFollow(FOLLOW_type_in_method613);
            type();

            state._fsp--;

            match(input,ID,FOLLOW_ID_in_method615); 
            match(input,14,FOLLOW_14_in_method617); 
            pushFollow(FOLLOW_arguments_in_method619);
            arguments();

            state._fsp--;

            match(input,15,FOLLOW_15_in_method621); 
            match(input,16,FOLLOW_16_in_method623); 
            // grammar\\proto.g:71:37: ( operator )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==ID||LA22_0==16||LA22_0==23||(LA22_0>=43 && LA22_0<=45)||(LA22_0>=57 && LA22_0<=59)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // grammar\\proto.g:71:39: operator
            	    {
            	    pushFollow(FOLLOW_operator_in_method627);
            	    operator();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_method632); 

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
    // $ANTLR end "method"


    // $ANTLR start "field"
    // grammar\\proto.g:74:1: field : type ID ( '=' big_expression )? ';' ;
    public final void field() throws RecognitionException {
        try {
            // grammar\\proto.g:75:5: ( type ID ( '=' big_expression )? ';' )
            // grammar\\proto.g:75:7: type ID ( '=' big_expression )? ';'
            {
            pushFollow(FOLLOW_type_in_field653);
            type();

            state._fsp--;

            match(input,ID,FOLLOW_ID_in_field655); 
            // grammar\\proto.g:75:15: ( '=' big_expression )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // grammar\\proto.g:75:17: '=' big_expression
                    {
                    match(input,42,FOLLOW_42_in_field659); 
                    pushFollow(FOLLOW_big_expression_in_field661);
                    big_expression();

                    state._fsp--;


                    }
                    break;

            }

            match(input,20,FOLLOW_20_in_field666); 

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
    // $ANTLR end "field"


    // $ANTLR start "operator"
    // grammar\\proto.g:78:1: operator : ( assignment ';' | buildin_operator | call ';' | if_operator | for_operator | while_operator | do_operator | '{' operator '}' );
    public final void operator() throws RecognitionException {
        try {
            // grammar\\proto.g:79:5: ( assignment ';' | buildin_operator | call ';' | if_operator | for_operator | while_operator | do_operator | '{' operator '}' )
            int alt24=8;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // grammar\\proto.g:79:7: assignment ';'
                    {
                    pushFollow(FOLLOW_assignment_in_operator687);
                    assignment();

                    state._fsp--;

                    match(input,20,FOLLOW_20_in_operator689); 

                    }
                    break;
                case 2 :
                    // grammar\\proto.g:79:24: buildin_operator
                    {
                    pushFollow(FOLLOW_buildin_operator_in_operator693);
                    buildin_operator();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // grammar\\proto.g:79:43: call ';'
                    {
                    pushFollow(FOLLOW_call_in_operator697);
                    call();

                    state._fsp--;

                    match(input,20,FOLLOW_20_in_operator699); 

                    }
                    break;
                case 4 :
                    // grammar\\proto.g:79:54: if_operator
                    {
                    pushFollow(FOLLOW_if_operator_in_operator703);
                    if_operator();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // grammar\\proto.g:79:68: for_operator
                    {
                    pushFollow(FOLLOW_for_operator_in_operator707);
                    for_operator();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // grammar\\proto.g:79:83: while_operator
                    {
                    pushFollow(FOLLOW_while_operator_in_operator711);
                    while_operator();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // grammar\\proto.g:79:100: do_operator
                    {
                    pushFollow(FOLLOW_do_operator_in_operator715);
                    do_operator();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // grammar\\proto.g:79:114: '{' operator '}'
                    {
                    match(input,16,FOLLOW_16_in_operator719); 
                    pushFollow(FOLLOW_operator_in_operator721);
                    operator();

                    state._fsp--;

                    match(input,17,FOLLOW_17_in_operator723); 

                    }
                    break;

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
    // $ANTLR end "operator"


    // $ANTLR start "buildin_operator"
    // grammar\\proto.g:82:1: buildin_operator : ( print | die | return_operator );
    public final void buildin_operator() throws RecognitionException {
        try {
            // grammar\\proto.g:83:5: ( print | die | return_operator )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt25=1;
                }
                break;
            case 43:
                {
                alt25=2;
                }
                break;
            case 45:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // grammar\\proto.g:83:7: print
                    {
                    pushFollow(FOLLOW_print_in_buildin_operator744);
                    print();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // grammar\\proto.g:83:15: die
                    {
                    pushFollow(FOLLOW_die_in_buildin_operator748);
                    die();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // grammar\\proto.g:83:21: return_operator
                    {
                    pushFollow(FOLLOW_return_operator_in_buildin_operator752);
                    return_operator();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "buildin_operator"


    // $ANTLR start "die"
    // grammar\\proto.g:86:1: die : 'die' big_expression ';' ;
    public final void die() throws RecognitionException {
        try {
            // grammar\\proto.g:87:5: ( 'die' big_expression ';' )
            // grammar\\proto.g:87:7: 'die' big_expression ';'
            {
            match(input,43,FOLLOW_43_in_die773); 
            pushFollow(FOLLOW_big_expression_in_die775);
            big_expression();

            state._fsp--;

            match(input,20,FOLLOW_20_in_die777); 

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
    // $ANTLR end "die"


    // $ANTLR start "print"
    // grammar\\proto.g:90:1: print : 'print' big_expression ';' ;
    public final void print() throws RecognitionException {
        try {
            // grammar\\proto.g:91:5: ( 'print' big_expression ';' )
            // grammar\\proto.g:91:7: 'print' big_expression ';'
            {
            match(input,44,FOLLOW_44_in_print798); 
            pushFollow(FOLLOW_big_expression_in_print800);
            big_expression();

            state._fsp--;

            match(input,20,FOLLOW_20_in_print802); 

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
    // $ANTLR end "print"


    // $ANTLR start "return_operator"
    // grammar\\proto.g:94:1: return_operator : 'return' big_expression ';' ;
    public final void return_operator() throws RecognitionException {
        try {
            // grammar\\proto.g:95:5: ( 'return' big_expression ';' )
            // grammar\\proto.g:95:7: 'return' big_expression ';'
            {
            match(input,45,FOLLOW_45_in_return_operator823); 
            pushFollow(FOLLOW_big_expression_in_return_operator825);
            big_expression();

            state._fsp--;

            match(input,20,FOLLOW_20_in_return_operator827); 

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
    // $ANTLR end "return_operator"


    // $ANTLR start "assignment"
    // grammar\\proto.g:98:1: assignment : ID ( '[' big_expression ']' )* '=' big_expression ;
    public final void assignment() throws RecognitionException {
        try {
            // grammar\\proto.g:99:5: ( ID ( '[' big_expression ']' )* '=' big_expression )
            // grammar\\proto.g:99:7: ID ( '[' big_expression ']' )* '=' big_expression
            {
            match(input,ID,FOLLOW_ID_in_assignment848); 
            // grammar\\proto.g:99:10: ( '[' big_expression ']' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==37) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // grammar\\proto.g:99:12: '[' big_expression ']'
            	    {
            	    match(input,37,FOLLOW_37_in_assignment852); 
            	    pushFollow(FOLLOW_big_expression_in_assignment854);
            	    big_expression();

            	    state._fsp--;

            	    match(input,38,FOLLOW_38_in_assignment856); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            match(input,42,FOLLOW_42_in_assignment861); 
            pushFollow(FOLLOW_big_expression_in_assignment863);
            big_expression();

            state._fsp--;


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
    // $ANTLR end "assignment"


    // $ANTLR start "call"
    // grammar\\proto.g:102:1: call : ID '(' parameters ')' ;
    public final void call() throws RecognitionException {
        try {
            // grammar\\proto.g:103:5: ( ID '(' parameters ')' )
            // grammar\\proto.g:103:7: ID '(' parameters ')'
            {
            match(input,ID,FOLLOW_ID_in_call884); 
            match(input,14,FOLLOW_14_in_call886); 
            pushFollow(FOLLOW_parameters_in_call888);
            parameters();

            state._fsp--;

            match(input,15,FOLLOW_15_in_call890); 

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
    // $ANTLR end "call"


    // $ANTLR start "big_expression"
    // grammar\\proto.g:106:1: big_expression : or_expression ;
    public final void big_expression() throws RecognitionException {
        try {
            // grammar\\proto.g:107:5: ( or_expression )
            // grammar\\proto.g:107:7: or_expression
            {
            pushFollow(FOLLOW_or_expression_in_big_expression907);
            or_expression();

            state._fsp--;


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
    // $ANTLR end "big_expression"


    // $ANTLR start "or_expression"
    // grammar\\proto.g:110:1: or_expression : and_expression ( 'or' and_expression )? ;
    public final void or_expression() throws RecognitionException {
        try {
            // grammar\\proto.g:111:5: ( and_expression ( 'or' and_expression )? )
            // grammar\\proto.g:111:7: and_expression ( 'or' and_expression )?
            {
            pushFollow(FOLLOW_and_expression_in_or_expression928);
            and_expression();

            state._fsp--;

            // grammar\\proto.g:111:22: ( 'or' and_expression )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==24) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // grammar\\proto.g:111:24: 'or' and_expression
                    {
                    match(input,24,FOLLOW_24_in_or_expression932); 
                    pushFollow(FOLLOW_and_expression_in_or_expression934);
                    and_expression();

                    state._fsp--;


                    }
                    break;

            }


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
    // $ANTLR end "or_expression"


    // $ANTLR start "and_expression"
    // grammar\\proto.g:114:1: and_expression : not_expression ( 'and' not_expression )? ;
    public final void and_expression() throws RecognitionException {
        try {
            // grammar\\proto.g:115:5: ( not_expression ( 'and' not_expression )? )
            // grammar\\proto.g:115:7: not_expression ( 'and' not_expression )?
            {
            pushFollow(FOLLOW_not_expression_in_and_expression958);
            not_expression();

            state._fsp--;

            // grammar\\proto.g:115:22: ( 'and' not_expression )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==25) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // grammar\\proto.g:115:24: 'and' not_expression
                    {
                    match(input,25,FOLLOW_25_in_and_expression962); 
                    pushFollow(FOLLOW_not_expression_in_and_expression964);
                    not_expression();

                    state._fsp--;


                    }
                    break;

            }


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
    // $ANTLR end "and_expression"


    // $ANTLR start "not_expression"
    // grammar\\proto.g:118:1: not_expression : ( 'not' )? expression ;
    public final void not_expression() throws RecognitionException {
        try {
            // grammar\\proto.g:119:5: ( ( 'not' )? expression )
            // grammar\\proto.g:119:7: ( 'not' )? expression
            {
            // grammar\\proto.g:119:7: ( 'not' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // grammar\\proto.g:119:9: 'not'
                    {
                    match(input,26,FOLLOW_26_in_not_expression994); 

                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_not_expression999);
            expression();

            state._fsp--;


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
    // $ANTLR end "not_expression"


    // $ANTLR start "expression"
    // grammar\\proto.g:122:1: expression : relation ( ( '==' | '!=' ) relation )* ;
    public final void expression() throws RecognitionException {
        try {
            // grammar\\proto.g:123:5: ( relation ( ( '==' | '!=' ) relation )* )
            // grammar\\proto.g:123:7: relation ( ( '==' | '!=' ) relation )*
            {
            pushFollow(FOLLOW_relation_in_expression1020);
            relation();

            state._fsp--;

            // grammar\\proto.g:123:16: ( ( '==' | '!=' ) relation )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=27 && LA30_0<=28)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // grammar\\proto.g:123:18: ( '==' | '!=' ) relation
            	    {
            	    if ( (input.LA(1)>=27 && input.LA(1)<=28) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relation_in_expression1034);
            	    relation();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


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
    // $ANTLR end "expression"


    // $ANTLR start "relation"
    // grammar\\proto.g:126:1: relation : summand ( ( '>' | '<' | '<=' | '>=' ) summand )* ;
    public final void relation() throws RecognitionException {
        try {
            // grammar\\proto.g:127:5: ( summand ( ( '>' | '<' | '<=' | '>=' ) summand )* )
            // grammar\\proto.g:127:7: summand ( ( '>' | '<' | '<=' | '>=' ) summand )*
            {
            pushFollow(FOLLOW_summand_in_relation1054);
            summand();

            state._fsp--;

            // grammar\\proto.g:127:15: ( ( '>' | '<' | '<=' | '>=' ) summand )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==40||(LA31_0>=46 && LA31_0<=48)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // grammar\\proto.g:127:17: ( '>' | '<' | '<=' | '>=' ) summand
            	    {
            	    if ( input.LA(1)==40||(input.LA(1)>=46 && input.LA(1)<=48) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_summand_in_relation1074);
            	    summand();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


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
    // $ANTLR end "relation"


    // $ANTLR start "summand"
    // grammar\\proto.g:130:1: summand : multiplier ( '+' multiplier | '-' multiplier )* ;
    public final void summand() throws RecognitionException {
        try {
            // grammar\\proto.g:131:5: ( multiplier ( '+' multiplier | '-' multiplier )* )
            // grammar\\proto.g:131:7: multiplier ( '+' multiplier | '-' multiplier )*
            {
            pushFollow(FOLLOW_multiplier_in_summand1098);
            multiplier();

            state._fsp--;

            // grammar\\proto.g:131:18: ( '+' multiplier | '-' multiplier )*
            loop32:
            do {
                int alt32=3;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==49) ) {
                    alt32=1;
                }
                else if ( (LA32_0==50) ) {
                    alt32=2;
                }


                switch (alt32) {
            	case 1 :
            	    // grammar\\proto.g:131:20: '+' multiplier
            	    {
            	    match(input,49,FOLLOW_49_in_summand1102); 
            	    pushFollow(FOLLOW_multiplier_in_summand1104);
            	    multiplier();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // grammar\\proto.g:131:37: '-' multiplier
            	    {
            	    match(input,50,FOLLOW_50_in_summand1108); 
            	    pushFollow(FOLLOW_multiplier_in_summand1110);
            	    multiplier();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


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
    // $ANTLR end "summand"


    // $ANTLR start "multiplier"
    // grammar\\proto.g:134:1: multiplier : simple_expression ( '*' simple_expression | '/' simple_expression )* ;
    public final void multiplier() throws RecognitionException {
        try {
            // grammar\\proto.g:135:5: ( simple_expression ( '*' simple_expression | '/' simple_expression )* )
            // grammar\\proto.g:135:7: simple_expression ( '*' simple_expression | '/' simple_expression )*
            {
            pushFollow(FOLLOW_simple_expression_in_multiplier1134);
            simple_expression();

            state._fsp--;

            // grammar\\proto.g:135:25: ( '*' simple_expression | '/' simple_expression )*
            loop33:
            do {
                int alt33=3;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==51) ) {
                    alt33=1;
                }
                else if ( (LA33_0==52) ) {
                    alt33=2;
                }


                switch (alt33) {
            	case 1 :
            	    // grammar\\proto.g:135:27: '*' simple_expression
            	    {
            	    match(input,51,FOLLOW_51_in_multiplier1138); 
            	    pushFollow(FOLLOW_simple_expression_in_multiplier1140);
            	    simple_expression();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // grammar\\proto.g:135:51: '/' simple_expression
            	    {
            	    match(input,52,FOLLOW_52_in_multiplier1144); 
            	    pushFollow(FOLLOW_simple_expression_in_multiplier1146);
            	    simple_expression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


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
    // $ANTLR end "multiplier"


    // $ANTLR start "simple_expression"
    // grammar\\proto.g:138:1: simple_expression : ( ID ( '[' expression ']' )* | INT | STRING | call | '[' parameters ']' | '(' expression ')' | 'nan' | 'nil' | 'new' ID '(' parameters ')' );
    public final void simple_expression() throws RecognitionException {
        try {
            // grammar\\proto.g:139:5: ( ID ( '[' expression ']' )* | INT | STRING | call | '[' parameters ']' | '(' expression ')' | 'nan' | 'nil' | 'new' ID '(' parameters ')' )
            int alt35=9;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // grammar\\proto.g:139:7: ID ( '[' expression ']' )*
                    {
                    match(input,ID,FOLLOW_ID_in_simple_expression1170); 
                    // grammar\\proto.g:139:10: ( '[' expression ']' )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==37) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // grammar\\proto.g:139:12: '[' expression ']'
                    	    {
                    	    match(input,37,FOLLOW_37_in_simple_expression1174); 
                    	    pushFollow(FOLLOW_expression_in_simple_expression1176);
                    	    expression();

                    	    state._fsp--;

                    	    match(input,38,FOLLOW_38_in_simple_expression1178); 

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // grammar\\proto.g:139:36: INT
                    {
                    match(input,INT,FOLLOW_INT_in_simple_expression1185); 

                    }
                    break;
                case 3 :
                    // grammar\\proto.g:139:42: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_simple_expression1189); 

                    }
                    break;
                case 4 :
                    // grammar\\proto.g:139:51: call
                    {
                    pushFollow(FOLLOW_call_in_simple_expression1193);
                    call();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // grammar\\proto.g:139:58: '[' parameters ']'
                    {
                    match(input,37,FOLLOW_37_in_simple_expression1197); 
                    pushFollow(FOLLOW_parameters_in_simple_expression1199);
                    parameters();

                    state._fsp--;

                    match(input,38,FOLLOW_38_in_simple_expression1201); 

                    }
                    break;
                case 6 :
                    // grammar\\proto.g:139:79: '(' expression ')'
                    {
                    match(input,14,FOLLOW_14_in_simple_expression1205); 
                    pushFollow(FOLLOW_expression_in_simple_expression1207);
                    expression();

                    state._fsp--;

                    match(input,15,FOLLOW_15_in_simple_expression1209); 

                    }
                    break;
                case 7 :
                    // grammar\\proto.g:139:100: 'nan'
                    {
                    match(input,53,FOLLOW_53_in_simple_expression1213); 

                    }
                    break;
                case 8 :
                    // grammar\\proto.g:139:108: 'nil'
                    {
                    match(input,54,FOLLOW_54_in_simple_expression1217); 

                    }
                    break;
                case 9 :
                    // grammar\\proto.g:139:116: 'new' ID '(' parameters ')'
                    {
                    match(input,55,FOLLOW_55_in_simple_expression1221); 
                    match(input,ID,FOLLOW_ID_in_simple_expression1223); 
                    match(input,14,FOLLOW_14_in_simple_expression1225); 
                    pushFollow(FOLLOW_parameters_in_simple_expression1227);
                    parameters();

                    state._fsp--;

                    match(input,15,FOLLOW_15_in_simple_expression1229); 

                    }
                    break;

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
    // $ANTLR end "simple_expression"


    // $ANTLR start "if_operator"
    // grammar\\proto.g:142:1: if_operator : 'if' '(' expression ')' operator ( 'else' operator )? ;
    public final void if_operator() throws RecognitionException {
        try {
            // grammar\\proto.g:143:5: ( 'if' '(' expression ')' operator ( 'else' operator )? )
            // grammar\\proto.g:143:7: 'if' '(' expression ')' operator ( 'else' operator )?
            {
            match(input,23,FOLLOW_23_in_if_operator1250); 
            match(input,14,FOLLOW_14_in_if_operator1252); 
            pushFollow(FOLLOW_expression_in_if_operator1254);
            expression();

            state._fsp--;

            match(input,15,FOLLOW_15_in_if_operator1256); 
            pushFollow(FOLLOW_operator_in_if_operator1258);
            operator();

            state._fsp--;

            // grammar\\proto.g:143:40: ( 'else' operator )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==56) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // grammar\\proto.g:143:42: 'else' operator
                    {
                    match(input,56,FOLLOW_56_in_if_operator1262); 
                    pushFollow(FOLLOW_operator_in_if_operator1264);
                    operator();

                    state._fsp--;


                    }
                    break;

            }


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
    // $ANTLR end "if_operator"


    // $ANTLR start "for_operator"
    // grammar\\proto.g:146:1: for_operator : 'for' '(' assignment ';' expression ';' assignment ')' operator ;
    public final void for_operator() throws RecognitionException {
        try {
            // grammar\\proto.g:147:5: ( 'for' '(' assignment ';' expression ';' assignment ')' operator )
            // grammar\\proto.g:147:7: 'for' '(' assignment ';' expression ';' assignment ')' operator
            {
            match(input,57,FOLLOW_57_in_for_operator1288); 
            match(input,14,FOLLOW_14_in_for_operator1290); 
            pushFollow(FOLLOW_assignment_in_for_operator1292);
            assignment();

            state._fsp--;

            match(input,20,FOLLOW_20_in_for_operator1294); 
            pushFollow(FOLLOW_expression_in_for_operator1296);
            expression();

            state._fsp--;

            match(input,20,FOLLOW_20_in_for_operator1298); 
            pushFollow(FOLLOW_assignment_in_for_operator1301);
            assignment();

            state._fsp--;

            match(input,15,FOLLOW_15_in_for_operator1303); 
            pushFollow(FOLLOW_operator_in_for_operator1305);
            operator();

            state._fsp--;


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
    // $ANTLR end "for_operator"


    // $ANTLR start "while_operator"
    // grammar\\proto.g:150:1: while_operator : 'while' '(' expression ')' operator ;
    public final void while_operator() throws RecognitionException {
        try {
            // grammar\\proto.g:151:5: ( 'while' '(' expression ')' operator )
            // grammar\\proto.g:151:7: 'while' '(' expression ')' operator
            {
            match(input,58,FOLLOW_58_in_while_operator1326); 
            match(input,14,FOLLOW_14_in_while_operator1328); 
            pushFollow(FOLLOW_expression_in_while_operator1330);
            expression();

            state._fsp--;

            match(input,15,FOLLOW_15_in_while_operator1332); 
            pushFollow(FOLLOW_operator_in_while_operator1334);
            operator();

            state._fsp--;


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
    // $ANTLR end "while_operator"


    // $ANTLR start "do_operator"
    // grammar\\proto.g:154:1: do_operator : 'do' '{' operator '}' 'while' '(' expression ')' ';' ;
    public final void do_operator() throws RecognitionException {
        try {
            // grammar\\proto.g:155:5: ( 'do' '{' operator '}' 'while' '(' expression ')' ';' )
            // grammar\\proto.g:155:7: 'do' '{' operator '}' 'while' '(' expression ')' ';'
            {
            match(input,59,FOLLOW_59_in_do_operator1355); 
            match(input,16,FOLLOW_16_in_do_operator1357); 
            pushFollow(FOLLOW_operator_in_do_operator1359);
            operator();

            state._fsp--;

            match(input,17,FOLLOW_17_in_do_operator1361); 
            match(input,58,FOLLOW_58_in_do_operator1363); 
            match(input,14,FOLLOW_14_in_do_operator1365); 
            pushFollow(FOLLOW_expression_in_do_operator1367);
            expression();

            state._fsp--;

            match(input,15,FOLLOW_15_in_do_operator1369); 
            match(input,20,FOLLOW_20_in_do_operator1371); 

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
    // $ANTLR end "do_operator"

    // Delegated rules


    protected DFA20 dfa20 = new DFA20(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA35 dfa35 = new DFA35(this);
    static final String DFA20_eotS =
        "\24\uffff";
    static final String DFA20_eofS =
        "\24\uffff";
    static final String DFA20_minS =
        "\1\37\6\4\1\16\5\46\2\uffff\5\4";
    static final String DFA20_maxS =
        "\1\44\1\4\5\45\1\52\5\46\2\uffff\5\45";
    static final String DFA20_acceptS =
        "\15\uffff\1\1\1\2\5\uffff";
    static final String DFA20_specialS =
        "\24\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6",
            "\1\7",
            "\1\7\40\uffff\1\10",
            "\1\7\40\uffff\1\11",
            "\1\7\40\uffff\1\12",
            "\1\7\40\uffff\1\13",
            "\1\7\40\uffff\1\14",
            "\1\15\5\uffff\1\16\25\uffff\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "",
            "",
            "\1\7\40\uffff\1\10",
            "\1\7\40\uffff\1\11",
            "\1\7\40\uffff\1\12",
            "\1\7\40\uffff\1\13",
            "\1\7\40\uffff\1\14"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "67:61: ( method | field )";
        }
    }
    static final String DFA24_eotS =
        "\12\uffff";
    static final String DFA24_eofS =
        "\12\uffff";
    static final String DFA24_minS =
        "\1\4\1\16\10\uffff";
    static final String DFA24_maxS =
        "\1\73\1\52\10\uffff";
    static final String DFA24_acceptS =
        "\2\uffff\1\2\1\4\1\5\1\6\1\7\1\10\1\3\1\1";
    static final String DFA24_specialS =
        "\12\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\1\13\uffff\1\7\6\uffff\1\3\23\uffff\3\2\13\uffff\1\4\1\5"+
            "\1\6",
            "\1\10\26\uffff\1\11\4\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "78:1: operator : ( assignment ';' | buildin_operator | call ';' | if_operator | for_operator | while_operator | do_operator | '{' operator '}' );";
        }
    }
    static final String DFA35_eotS =
        "\13\uffff";
    static final String DFA35_eofS =
        "\13\uffff";
    static final String DFA35_minS =
        "\1\4\1\16\11\uffff";
    static final String DFA35_maxS =
        "\1\67\1\64\11\uffff";
    static final String DFA35_acceptS =
        "\2\uffff\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\4\1\1";
    static final String DFA35_specialS =
        "\13\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\1\1\2\1\3\7\uffff\1\5\26\uffff\1\4\17\uffff\1\6\1\7\1\10",
            "\1\11\1\12\4\uffff\1\12\3\uffff\2\12\1\uffff\2\12\1\uffff"+
            "\1\12\6\uffff\2\12\1\uffff\1\12\5\uffff\7\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "138:1: simple_expression : ( ID ( '[' expression ']' )* | INT | STRING | call | '[' parameters ']' | '(' expression ')' | 'nan' | 'nil' | 'new' ID '(' parameters ')' );";
        }
    }
 

    public static final BitSet FOLLOW_statement_in_program29 = new BitSet(new long[]{0x0000008020002002L});
    public static final BitSet FOLLOW_interface_decl_in_statement54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_decl_in_statement58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_proto_decl_in_statement62 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_proto_decl84 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_proto_decl86 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_proto_decl88 = new BitSet(new long[]{0x00E000200400C070L});
    public static final BitSet FOLLOW_parameters_in_proto_decl90 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_proto_decl92 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_proto_decl94 = new BitSet(new long[]{0x00000000040E4010L});
    public static final BitSet FOLLOW_spec_decl_in_proto_decl98 = new BitSet(new long[]{0x00000000040E4010L});
    public static final BitSet FOLLOW_17_in_proto_decl103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_spec_decl120 = new BitSet(new long[]{0x00000000040C4010L});
    public static final BitSet FOLLOW_spec_expression_in_spec_decl128 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_spec_decl130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spec_expression_in_spec_decl134 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_set_in_spec_decl136 = new BitSet(new long[]{0x00000000040C4010L});
    public static final BitSet FOLLOW_spec_expression_in_spec_decl150 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_spec_decl152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_spec_expression175 = new BitSet(new long[]{0x00000000040C4010L});
    public static final BitSet FOLLOW_or_spec_in_spec_expression177 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_spec_expression179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_spec_in_spec_expression187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_spec_in_or_spec210 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_or_spec214 = new BitSet(new long[]{0x00000000040C4010L});
    public static final BitSet FOLLOW_and_spec_in_or_spec216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_spec_in_and_spec235 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_and_spec239 = new BitSet(new long[]{0x00000000040C4010L});
    public static final BitSet FOLLOW_not_spec_in_and_spec241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_not_spec267 = new BitSet(new long[]{0x00000000040C4010L});
    public static final BitSet FOLLOW_spec_in_not_spec272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_spec293 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_27_in_spec297 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_spec299 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_28_in_spec303 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_spec305 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_29_in_interface_decl326 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_interface_decl328 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_interface_decl330 = new BitSet(new long[]{0x0000001F80020000L});
    public static final BitSet FOLLOW_method_decl_in_interface_decl334 = new BitSet(new long[]{0x0000001F80020000L});
    public static final BitSet FOLLOW_17_in_interface_decl339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_method_decl360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_method_decl362 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_method_decl364 = new BitSet(new long[]{0x0000001F80008000L});
    public static final BitSet FOLLOW_arguments_in_method_decl366 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_method_decl368 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_method_decl370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_arguments393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_arguments395 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_arguments399 = new BitSet(new long[]{0x0000001F80000000L});
    public static final BitSet FOLLOW_type_in_arguments401 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_arguments403 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_big_expression_in_parameters432 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_parameters436 = new BitSet(new long[]{0x00E0002004004070L});
    public static final BitSet FOLLOW_big_expression_in_parameters438 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_31_in_type465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_type469 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_array_in_type471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_type475 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_array_in_type477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_type481 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_array_in_type483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_type487 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_array_in_type489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_type493 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_array_in_type495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_array518 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_array520 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_39_in_class_decl544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_class_decl546 = new BitSet(new long[]{0x0000030000010000L});
    public static final BitSet FOLLOW_40_in_class_decl550 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_class_decl552 = new BitSet(new long[]{0x0000020040010000L});
    public static final BitSet FOLLOW_30_in_class_decl556 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_class_decl558 = new BitSet(new long[]{0x0000020040010000L});
    public static final BitSet FOLLOW_41_in_class_decl568 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_class_decl570 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_class_decl575 = new BitSet(new long[]{0x0000001F80020000L});
    public static final BitSet FOLLOW_method_in_class_decl581 = new BitSet(new long[]{0x0000001F80020000L});
    public static final BitSet FOLLOW_field_in_class_decl585 = new BitSet(new long[]{0x0000001F80020000L});
    public static final BitSet FOLLOW_17_in_class_decl592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_method613 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_method615 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_method617 = new BitSet(new long[]{0x0000001F80008000L});
    public static final BitSet FOLLOW_arguments_in_method619 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_method621 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_method623 = new BitSet(new long[]{0x0E00380000830010L});
    public static final BitSet FOLLOW_operator_in_method627 = new BitSet(new long[]{0x0E00380000830010L});
    public static final BitSet FOLLOW_17_in_method632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_field653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_field655 = new BitSet(new long[]{0x0000040000100000L});
    public static final BitSet FOLLOW_42_in_field659 = new BitSet(new long[]{0x00E0002004004070L});
    public static final BitSet FOLLOW_big_expression_in_field661 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_field666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_operator687 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_operator689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_buildin_operator_in_operator693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_operator697 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_operator699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_operator_in_operator703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_operator_in_operator707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_operator_in_operator711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_do_operator_in_operator715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_operator719 = new BitSet(new long[]{0x0E00380000810010L});
    public static final BitSet FOLLOW_operator_in_operator721 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_operator723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_buildin_operator744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_die_in_buildin_operator748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_operator_in_buildin_operator752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_die773 = new BitSet(new long[]{0x00E0002004004070L});
    public static final BitSet FOLLOW_big_expression_in_die775 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_die777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_print798 = new BitSet(new long[]{0x00E0002004004070L});
    public static final BitSet FOLLOW_big_expression_in_print800 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_print802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_return_operator823 = new BitSet(new long[]{0x00E0002004004070L});
    public static final BitSet FOLLOW_big_expression_in_return_operator825 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_return_operator827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment848 = new BitSet(new long[]{0x0000042000000000L});
    public static final BitSet FOLLOW_37_in_assignment852 = new BitSet(new long[]{0x00E0002004004070L});
    public static final BitSet FOLLOW_big_expression_in_assignment854 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_assignment856 = new BitSet(new long[]{0x0000042000000000L});
    public static final BitSet FOLLOW_42_in_assignment861 = new BitSet(new long[]{0x00E0002004004070L});
    public static final BitSet FOLLOW_big_expression_in_assignment863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_call884 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_call886 = new BitSet(new long[]{0x00E000200400C070L});
    public static final BitSet FOLLOW_parameters_in_call888 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_call890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_expression_in_big_expression907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_expression_in_or_expression928 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_or_expression932 = new BitSet(new long[]{0x00E0002004004070L});
    public static final BitSet FOLLOW_and_expression_in_or_expression934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_expression_in_and_expression958 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_and_expression962 = new BitSet(new long[]{0x00E0002004004070L});
    public static final BitSet FOLLOW_not_expression_in_and_expression964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_not_expression994 = new BitSet(new long[]{0x00E0002004004070L});
    public static final BitSet FOLLOW_expression_in_not_expression999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relation_in_expression1020 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_set_in_expression1024 = new BitSet(new long[]{0x00E0002004004070L});
    public static final BitSet FOLLOW_relation_in_expression1034 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_summand_in_relation1054 = new BitSet(new long[]{0x0001C10000000002L});
    public static final BitSet FOLLOW_set_in_relation1058 = new BitSet(new long[]{0x00E0002004004070L});
    public static final BitSet FOLLOW_summand_in_relation1074 = new BitSet(new long[]{0x0001C10000000002L});
    public static final BitSet FOLLOW_multiplier_in_summand1098 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_49_in_summand1102 = new BitSet(new long[]{0x00E0002004004070L});
    public static final BitSet FOLLOW_multiplier_in_summand1104 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_50_in_summand1108 = new BitSet(new long[]{0x00E0002004004070L});
    public static final BitSet FOLLOW_multiplier_in_summand1110 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_simple_expression_in_multiplier1134 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_51_in_multiplier1138 = new BitSet(new long[]{0x00E0002004004070L});
    public static final BitSet FOLLOW_simple_expression_in_multiplier1140 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_52_in_multiplier1144 = new BitSet(new long[]{0x00E0002004004070L});
    public static final BitSet FOLLOW_simple_expression_in_multiplier1146 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_ID_in_simple_expression1170 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_simple_expression1174 = new BitSet(new long[]{0x00E0002004004070L});
    public static final BitSet FOLLOW_expression_in_simple_expression1176 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_simple_expression1178 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_INT_in_simple_expression1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_simple_expression1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_simple_expression1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_simple_expression1197 = new BitSet(new long[]{0x00E0006004004070L});
    public static final BitSet FOLLOW_parameters_in_simple_expression1199 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_simple_expression1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_simple_expression1205 = new BitSet(new long[]{0x00E0002004004070L});
    public static final BitSet FOLLOW_expression_in_simple_expression1207 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_simple_expression1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_simple_expression1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_simple_expression1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_simple_expression1221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_simple_expression1223 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_simple_expression1225 = new BitSet(new long[]{0x00E000200400C070L});
    public static final BitSet FOLLOW_parameters_in_simple_expression1227 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_simple_expression1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_if_operator1250 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_if_operator1252 = new BitSet(new long[]{0x00E0002004004070L});
    public static final BitSet FOLLOW_expression_in_if_operator1254 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_if_operator1256 = new BitSet(new long[]{0x0E00380000810010L});
    public static final BitSet FOLLOW_operator_in_if_operator1258 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_if_operator1262 = new BitSet(new long[]{0x0E00380000810010L});
    public static final BitSet FOLLOW_operator_in_if_operator1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_for_operator1288 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_for_operator1290 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_assignment_in_for_operator1292 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_for_operator1294 = new BitSet(new long[]{0x00E0002004004070L});
    public static final BitSet FOLLOW_expression_in_for_operator1296 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_for_operator1298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_assignment_in_for_operator1301 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_for_operator1303 = new BitSet(new long[]{0x0E00380000810010L});
    public static final BitSet FOLLOW_operator_in_for_operator1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_while_operator1326 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_while_operator1328 = new BitSet(new long[]{0x00E0002004004070L});
    public static final BitSet FOLLOW_expression_in_while_operator1330 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_while_operator1332 = new BitSet(new long[]{0x0E00380000810010L});
    public static final BitSet FOLLOW_operator_in_while_operator1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_do_operator1355 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_do_operator1357 = new BitSet(new long[]{0x0E00380000810010L});
    public static final BitSet FOLLOW_operator_in_do_operator1359 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_do_operator1361 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_do_operator1363 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_do_operator1365 = new BitSet(new long[]{0x00E0002004004070L});
    public static final BitSet FOLLOW_expression_in_do_operator1367 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_do_operator1369 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_do_operator1371 = new BitSet(new long[]{0x0000000000000002L});

}