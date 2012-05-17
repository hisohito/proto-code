// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 grammar\\proto.g 2012-05-17 13:39:30

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class protoLexer extends Lexer {
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
    public static final int T__19=19;
    public static final int T__56=56;
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
    public static final int T__33=33;
    public static final int WS=8;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int STRING=6;

    // delegates
    // delegators

    public protoLexer() {;} 
    public protoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public protoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "grammar\\proto.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:3:7: ( 'prototype' )
            // grammar\\proto.g:3:9: 'prototype'
            {
            match("prototype"); 


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
            // grammar\\proto.g:4:7: ( '(' )
            // grammar\\proto.g:4:9: '('
            {
            match('('); 

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
            // grammar\\proto.g:5:7: ( ')' )
            // grammar\\proto.g:5:9: ')'
            {
            match(')'); 

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
            // grammar\\proto.g:6:7: ( '{' )
            // grammar\\proto.g:6:9: '{'
            {
            match('{'); 

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
            // grammar\\proto.g:7:7: ( '}' )
            // grammar\\proto.g:7:9: '}'
            {
            match('}'); 

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
            // grammar\\proto.g:8:7: ( 'finally' )
            // grammar\\proto.g:8:9: 'finally'
            {
            match("finally"); 


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
            // grammar\\proto.g:9:7: ( 'globally' )
            // grammar\\proto.g:9:9: 'globally'
            {
            match("globally"); 


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
            // grammar\\proto.g:10:7: ( ';' )
            // grammar\\proto.g:10:9: ';'
            {
            match(';'); 

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
            // grammar\\proto.g:11:7: ( 'until' )
            // grammar\\proto.g:11:9: 'until'
            {
            match("until"); 


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
            // grammar\\proto.g:12:7: ( 'release' )
            // grammar\\proto.g:12:9: 'release'
            {
            match("release"); 


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
            // grammar\\proto.g:13:7: ( 'if' )
            // grammar\\proto.g:13:9: 'if'
            {
            match("if"); 


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
            // grammar\\proto.g:14:7: ( 'or' )
            // grammar\\proto.g:14:9: 'or'
            {
            match("or"); 


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
            // grammar\\proto.g:15:7: ( 'and' )
            // grammar\\proto.g:15:9: 'and'
            {
            match("and"); 


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
            // grammar\\proto.g:16:7: ( 'not' )
            // grammar\\proto.g:16:9: 'not'
            {
            match("not"); 


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
            // grammar\\proto.g:17:7: ( '==' )
            // grammar\\proto.g:17:9: '=='
            {
            match("=="); 


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
            // grammar\\proto.g:18:7: ( '!=' )
            // grammar\\proto.g:18:9: '!='
            {
            match("!="); 


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
            // grammar\\proto.g:19:7: ( 'interface' )
            // grammar\\proto.g:19:9: 'interface'
            {
            match("interface"); 


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
            // grammar\\proto.g:20:7: ( ',' )
            // grammar\\proto.g:20:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:21:7: ( 'void' )
            // grammar\\proto.g:21:9: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:22:7: ( 'state' )
            // grammar\\proto.g:22:9: 'state'
            {
            match("state"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:23:7: ( 'number' )
            // grammar\\proto.g:23:9: 'number'
            {
            match("number"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:24:7: ( 'bool' )
            // grammar\\proto.g:24:9: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:25:7: ( 'string' )
            // grammar\\proto.g:25:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:26:7: ( 'object' )
            // grammar\\proto.g:26:9: 'object'
            {
            match("object"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:27:7: ( '[' )
            // grammar\\proto.g:27:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:28:7: ( ']' )
            // grammar\\proto.g:28:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:29:7: ( 'class' )
            // grammar\\proto.g:29:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:30:7: ( '<' )
            // grammar\\proto.g:30:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:31:7: ( '<<' )
            // grammar\\proto.g:31:9: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:32:7: ( '=' )
            // grammar\\proto.g:32:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:33:7: ( 'die' )
            // grammar\\proto.g:33:9: 'die'
            {
            match("die"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:34:7: ( 'print' )
            // grammar\\proto.g:34:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:35:7: ( 'return' )
            // grammar\\proto.g:35:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:36:7: ( '>' )
            // grammar\\proto.g:36:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:37:7: ( '<=' )
            // grammar\\proto.g:37:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:38:7: ( '>=' )
            // grammar\\proto.g:38:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:39:7: ( '+' )
            // grammar\\proto.g:39:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:40:7: ( '-' )
            // grammar\\proto.g:40:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:41:7: ( '*' )
            // grammar\\proto.g:41:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:42:7: ( '/' )
            // grammar\\proto.g:42:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:43:7: ( 'nan' )
            // grammar\\proto.g:43:9: 'nan'
            {
            match("nan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:44:7: ( 'nil' )
            // grammar\\proto.g:44:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:45:7: ( 'new' )
            // grammar\\proto.g:45:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:46:7: ( 'else' )
            // grammar\\proto.g:46:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:47:7: ( 'for' )
            // grammar\\proto.g:47:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:48:7: ( 'while' )
            // grammar\\proto.g:48:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:49:7: ( 'do' )
            // grammar\\proto.g:49:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:158:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // grammar\\proto.g:158:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // grammar\\proto.g:158:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // grammar\\proto.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:161:5: ( ( '0' .. '9' )+ )
            // grammar\\proto.g:161:7: ( '0' .. '9' )+
            {
            // grammar\\proto.g:161:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // grammar\\proto.g:161:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:165:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='/') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='/') ) {
                    alt6=1;
                }
                else if ( (LA6_1=='*') ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // grammar\\proto.g:165:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // grammar\\proto.g:165:14: (~ ( '\\n' | '\\r' ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // grammar\\proto.g:165:14: ~ ( '\\n' | '\\r' )
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
                    	    break loop3;
                        }
                    } while (true);

                    // grammar\\proto.g:165:28: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // grammar\\proto.g:165:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // grammar\\proto.g:166:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // grammar\\proto.g:166:14: ( options {greedy=false; } : . )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='*') ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1=='/') ) {
                                alt5=2;
                            }
                            else if ( ((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // grammar\\proto.g:166:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match("*/"); 

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:169:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // grammar\\proto.g:169:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammar\\proto.g:177:5: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // grammar\\proto.g:177:8: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // grammar\\proto.g:177:12: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\\') ) {
                    alt7=1;
                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // grammar\\proto.g:177:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // grammar\\proto.g:177:24: ~ ( '\\\\' | '\"' )
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
            	    break loop7;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // grammar\\proto.g:181:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // grammar\\proto.g:181:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // grammar\\proto.g:185:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt8=1;
                    }
                    break;
                case 'u':
                    {
                    alt8=2;
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
                    {
                    alt8=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // grammar\\proto.g:185:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // grammar\\proto.g:186:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // grammar\\proto.g:187:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // grammar\\proto.g:192:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\\') ) {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>='0' && LA9_1<='3')) ) {
                    int LA9_2 = input.LA(3);

                    if ( ((LA9_2>='0' && LA9_2<='7')) ) {
                        int LA9_5 = input.LA(4);

                        if ( ((LA9_5>='0' && LA9_5<='7')) ) {
                            alt9=1;
                        }
                        else {
                            alt9=2;}
                    }
                    else {
                        alt9=3;}
                }
                else if ( ((LA9_1>='4' && LA9_1<='7')) ) {
                    int LA9_3 = input.LA(3);

                    if ( ((LA9_3>='0' && LA9_3<='7')) ) {
                        alt9=2;
                    }
                    else {
                        alt9=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // grammar\\proto.g:192:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // grammar\\proto.g:192:14: ( '0' .. '3' )
                    // grammar\\proto.g:192:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // grammar\\proto.g:192:25: ( '0' .. '7' )
                    // grammar\\proto.g:192:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // grammar\\proto.g:192:36: ( '0' .. '7' )
                    // grammar\\proto.g:192:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // grammar\\proto.g:193:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // grammar\\proto.g:193:14: ( '0' .. '7' )
                    // grammar\\proto.g:193:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // grammar\\proto.g:193:25: ( '0' .. '7' )
                    // grammar\\proto.g:193:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // grammar\\proto.g:194:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // grammar\\proto.g:194:14: ( '0' .. '7' )
                    // grammar\\proto.g:194:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // grammar\\proto.g:199:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // grammar\\proto.g:199:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // grammar\\proto.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | ID | INT | COMMENT | WS | STRING )
        int alt10=52;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // grammar\\proto.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // grammar\\proto.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // grammar\\proto.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // grammar\\proto.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // grammar\\proto.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // grammar\\proto.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // grammar\\proto.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // grammar\\proto.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // grammar\\proto.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // grammar\\proto.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // grammar\\proto.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // grammar\\proto.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // grammar\\proto.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // grammar\\proto.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // grammar\\proto.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // grammar\\proto.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // grammar\\proto.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // grammar\\proto.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // grammar\\proto.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // grammar\\proto.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // grammar\\proto.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // grammar\\proto.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // grammar\\proto.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // grammar\\proto.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // grammar\\proto.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // grammar\\proto.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // grammar\\proto.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // grammar\\proto.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // grammar\\proto.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // grammar\\proto.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // grammar\\proto.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // grammar\\proto.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // grammar\\proto.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // grammar\\proto.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // grammar\\proto.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // grammar\\proto.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // grammar\\proto.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // grammar\\proto.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // grammar\\proto.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // grammar\\proto.g:1:244: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // grammar\\proto.g:1:250: T__53
                {
                mT__53(); 

                }
                break;
            case 42 :
                // grammar\\proto.g:1:256: T__54
                {
                mT__54(); 

                }
                break;
            case 43 :
                // grammar\\proto.g:1:262: T__55
                {
                mT__55(); 

                }
                break;
            case 44 :
                // grammar\\proto.g:1:268: T__56
                {
                mT__56(); 

                }
                break;
            case 45 :
                // grammar\\proto.g:1:274: T__57
                {
                mT__57(); 

                }
                break;
            case 46 :
                // grammar\\proto.g:1:280: T__58
                {
                mT__58(); 

                }
                break;
            case 47 :
                // grammar\\proto.g:1:286: T__59
                {
                mT__59(); 

                }
                break;
            case 48 :
                // grammar\\proto.g:1:292: ID
                {
                mID(); 

                }
                break;
            case 49 :
                // grammar\\proto.g:1:295: INT
                {
                mINT(); 

                }
                break;
            case 50 :
                // grammar\\proto.g:1:299: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 51 :
                // grammar\\proto.g:1:307: WS
                {
                mWS(); 

                }
                break;
            case 52 :
                // grammar\\proto.g:1:310: STRING
                {
                mSTRING(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\1\41\4\uffff\2\41\1\uffff\6\41\1\66\2\uffff\3\41\2\uffff"+
        "\1\41\1\75\1\41\1\101\3\uffff\1\103\2\41\4\uffff\6\41\1\116\1\41"+
        "\1\120\7\41\2\uffff\4\41\3\uffff\1\41\1\136\4\uffff\5\41\1\144\4"+
        "\41\1\uffff\1\41\1\uffff\1\41\1\153\1\154\1\41\1\156\1\157\1\160"+
        "\5\41\1\166\1\uffff\5\41\1\uffff\6\41\2\uffff\1\41\3\uffff\1\u0083"+
        "\2\41\1\u0086\1\41\1\uffff\1\u0088\2\41\1\u008b\2\41\1\u008e\5\41"+
        "\1\uffff\1\u0094\1\41\1\uffff\1\u0096\1\uffff\1\u0097\1\41\1\uffff"+
        "\2\41\1\uffff\1\41\1\u009c\1\41\1\u009e\1\u009f\1\uffff\1\u00a0"+
        "\2\uffff\1\41\1\u00a2\1\41\1\u00a4\1\uffff\1\41\3\uffff\1\41\1\uffff"+
        "\1\u00a7\1\uffff\1\41\1\u00a9\1\uffff\1\u00aa\2\uffff";
    static final String DFA10_eofS =
        "\u00ab\uffff";
    static final String DFA10_minS =
        "\1\11\1\162\4\uffff\1\151\1\154\1\uffff\1\156\1\145\1\146\1\142"+
        "\1\156\1\141\1\75\2\uffff\1\157\1\164\1\157\2\uffff\1\154\1\74\1"+
        "\151\1\75\3\uffff\1\52\1\154\1\150\4\uffff\1\151\1\156\1\162\1\157"+
        "\1\164\1\154\1\60\1\164\1\60\1\152\1\144\1\164\1\155\1\156\1\154"+
        "\1\167\2\uffff\1\151\1\141\1\157\1\141\3\uffff\1\145\1\60\4\uffff"+
        "\1\163\1\151\1\164\1\156\1\141\1\60\1\142\1\151\1\145\1\165\1\uffff"+
        "\1\145\1\uffff\1\145\2\60\1\142\3\60\1\144\1\164\1\151\1\154\1\163"+
        "\1\60\1\uffff\1\145\1\154\1\157\1\164\1\154\1\uffff\1\141\1\154"+
        "\1\141\2\162\1\143\2\uffff\1\145\3\uffff\1\60\1\145\1\156\1\60\1"+
        "\163\1\uffff\1\60\1\145\1\164\1\60\2\154\1\60\1\163\1\156\1\146"+
        "\1\164\1\162\1\uffff\1\60\1\147\1\uffff\1\60\1\uffff\1\60\1\171"+
        "\1\uffff\1\171\1\154\1\uffff\1\145\1\60\1\141\2\60\1\uffff\1\60"+
        "\2\uffff\1\160\1\60\1\171\1\60\1\uffff\1\143\3\uffff\1\145\1\uffff"+
        "\1\60\1\uffff\1\145\1\60\1\uffff\1\60\2\uffff";
    static final String DFA10_maxS =
        "\1\175\1\162\4\uffff\1\157\1\154\1\uffff\1\156\1\145\1\156\1\162"+
        "\1\156\1\165\1\75\2\uffff\1\157\1\164\1\157\2\uffff\1\154\1\75\1"+
        "\157\1\75\3\uffff\1\57\1\154\1\150\4\uffff\1\157\1\156\1\162\1\157"+
        "\2\164\1\172\1\164\1\172\1\152\1\144\1\164\1\155\1\156\1\154\1\167"+
        "\2\uffff\1\151\1\162\1\157\1\141\3\uffff\1\145\1\172\4\uffff\1\163"+
        "\1\151\1\164\1\156\1\141\1\172\1\142\1\151\1\145\1\165\1\uffff\1"+
        "\145\1\uffff\1\145\2\172\1\142\3\172\1\144\1\164\1\151\1\154\1\163"+
        "\1\172\1\uffff\1\145\1\154\1\157\1\164\1\154\1\uffff\1\141\1\154"+
        "\1\141\2\162\1\143\2\uffff\1\145\3\uffff\1\172\1\145\1\156\1\172"+
        "\1\163\1\uffff\1\172\1\145\1\164\1\172\2\154\1\172\1\163\1\156\1"+
        "\146\1\164\1\162\1\uffff\1\172\1\147\1\uffff\1\172\1\uffff\1\172"+
        "\1\171\1\uffff\1\171\1\154\1\uffff\1\145\1\172\1\141\2\172\1\uffff"+
        "\1\172\2\uffff\1\160\1\172\1\171\1\172\1\uffff\1\143\3\uffff\1\145"+
        "\1\uffff\1\172\1\uffff\1\145\1\172\1\uffff\1\172\2\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\2\uffff\1\10\7\uffff\1\20\1\22\3\uffff"+
        "\1\31\1\32\4\uffff\1\45\1\46\1\47\3\uffff\1\60\1\61\1\63\1\64\20"+
        "\uffff\1\17\1\36\4\uffff\1\35\1\43\1\34\2\uffff\1\44\1\42\1\62\1"+
        "\50\12\uffff\1\13\1\uffff\1\14\15\uffff\1\57\5\uffff\1\55\6\uffff"+
        "\1\15\1\16\1\uffff\1\51\1\52\1\53\5\uffff\1\37\14\uffff\1\23\2\uffff"+
        "\1\26\1\uffff\1\54\2\uffff\1\40\2\uffff\1\11\5\uffff\1\24\1\uffff"+
        "\1\33\1\56\4\uffff\1\41\1\uffff\1\30\1\25\1\27\1\uffff\1\6\1\uffff"+
        "\1\12\2\uffff\1\7\1\uffff\1\1\1\21";
    static final String DFA10_specialS =
        "\u00ab\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\43\2\uffff\1\43\22\uffff\1\43\1\20\1\44\5\uffff\1\2\1\3"+
            "\1\35\1\33\1\21\1\34\1\uffff\1\36\12\42\1\uffff\1\10\1\30\1"+
            "\17\1\32\2\uffff\32\41\1\25\1\uffff\1\26\1\uffff\1\41\1\uffff"+
            "\1\15\1\24\1\27\1\31\1\37\1\6\1\7\1\41\1\13\4\41\1\16\1\14\1"+
            "\1\1\41\1\12\1\23\1\41\1\11\1\22\1\40\3\41\1\4\1\uffff\1\5",
            "\1\45",
            "",
            "",
            "",
            "",
            "\1\46\5\uffff\1\47",
            "\1\50",
            "",
            "\1\51",
            "\1\52",
            "\1\53\7\uffff\1\54",
            "\1\56\17\uffff\1\55",
            "\1\57",
            "\1\62\3\uffff\1\64\3\uffff\1\63\5\uffff\1\60\5\uffff\1\61",
            "\1\65",
            "",
            "",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "",
            "\1\72",
            "\1\73\1\74",
            "\1\76\5\uffff\1\77",
            "\1\100",
            "",
            "",
            "",
            "\1\102\4\uffff\1\102",
            "\1\104",
            "\1\105",
            "",
            "",
            "",
            "",
            "\1\107\5\uffff\1\106",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114\7\uffff\1\115",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\117",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "",
            "\1\130",
            "\1\131\20\uffff\1\132",
            "\1\133",
            "\1\134",
            "",
            "",
            "",
            "\1\135",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "\1\151",
            "",
            "\1\152",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\155",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "",
            "",
            "\1\u0082",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0084",
            "\1\u0085",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0087",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0089",
            "\1\u008a",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u008c",
            "\1\u008d",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0095",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0098",
            "",
            "\1\u0099",
            "\1\u009a",
            "",
            "\1\u009b",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u009d",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\u00a1",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00a3",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00a5",
            "",
            "",
            "",
            "\1\u00a6",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00a8",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | ID | INT | COMMENT | WS | STRING );";
        }
    }
 

}