package dk.sdu.mmmi.mdsd.ide.contentassist.antlr.internal;

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
import dk.sdu.mmmi.mdsd.services.X21GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalX21Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'string'", "'='", "'<'", "'>'", "'<='", "'>='", "'parameter'", "':'", "'function'", "'('", "')'", "'{'", "'}'", "'input'", "'node'", "'['", "']'", "'stream'", "','", "'to'", "'output'", "'data'", "'+'", "'-'", "'*'", "'/'", "'none'", "'let'", "'in'", "'end'", "'if'", "'then'", "'else'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalX21Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalX21Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalX21Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalX21.g"; }


    	private X21GrammarAccess grammarAccess;

    	public void setGrammarAccess(X21GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleX21"
    // InternalX21.g:53:1: entryRuleX21 : ruleX21 EOF ;
    public final void entryRuleX21() throws RecognitionException {
        try {
            // InternalX21.g:54:1: ( ruleX21 EOF )
            // InternalX21.g:55:1: ruleX21 EOF
            {
             before(grammarAccess.getX21Rule()); 
            pushFollow(FOLLOW_1);
            ruleX21();

            state._fsp--;

             after(grammarAccess.getX21Rule()); 
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
    // $ANTLR end "entryRuleX21"


    // $ANTLR start "ruleX21"
    // InternalX21.g:62:1: ruleX21 : ( ( rule__X21__Group__0 ) ) ;
    public final void ruleX21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:66:2: ( ( ( rule__X21__Group__0 ) ) )
            // InternalX21.g:67:2: ( ( rule__X21__Group__0 ) )
            {
            // InternalX21.g:67:2: ( ( rule__X21__Group__0 ) )
            // InternalX21.g:68:3: ( rule__X21__Group__0 )
            {
             before(grammarAccess.getX21Access().getGroup()); 
            // InternalX21.g:69:3: ( rule__X21__Group__0 )
            // InternalX21.g:69:4: rule__X21__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__X21__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getX21Access().getGroup()); 

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
    // $ANTLR end "ruleX21"


    // $ANTLR start "entryRuleDeclaration"
    // InternalX21.g:78:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalX21.g:79:1: ( ruleDeclaration EOF )
            // InternalX21.g:80:1: ruleDeclaration EOF
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
    // InternalX21.g:87:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:91:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // InternalX21.g:92:2: ( ( rule__Declaration__Alternatives ) )
            {
            // InternalX21.g:92:2: ( ( rule__Declaration__Alternatives ) )
            // InternalX21.g:93:3: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // InternalX21.g:94:3: ( rule__Declaration__Alternatives )
            // InternalX21.g:94:4: rule__Declaration__Alternatives
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


    // $ANTLR start "entryRuleParameter"
    // InternalX21.g:103:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalX21.g:104:1: ( ruleParameter EOF )
            // InternalX21.g:105:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalX21.g:112:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:116:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalX21.g:117:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalX21.g:117:2: ( ( rule__Parameter__Group__0 ) )
            // InternalX21.g:118:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalX21.g:119:3: ( rule__Parameter__Group__0 )
            // InternalX21.g:119:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleFunction"
    // InternalX21.g:128:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalX21.g:129:1: ( ruleFunction EOF )
            // InternalX21.g:130:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalX21.g:137:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:141:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalX21.g:142:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalX21.g:142:2: ( ( rule__Function__Group__0 ) )
            // InternalX21.g:143:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalX21.g:144:3: ( rule__Function__Group__0 )
            // InternalX21.g:144:4: rule__Function__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleLambda"
    // InternalX21.g:153:1: entryRuleLambda : ruleLambda EOF ;
    public final void entryRuleLambda() throws RecognitionException {
        try {
            // InternalX21.g:154:1: ( ruleLambda EOF )
            // InternalX21.g:155:1: ruleLambda EOF
            {
             before(grammarAccess.getLambdaRule()); 
            pushFollow(FOLLOW_1);
            ruleLambda();

            state._fsp--;

             after(grammarAccess.getLambdaRule()); 
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
    // $ANTLR end "entryRuleLambda"


    // $ANTLR start "ruleLambda"
    // InternalX21.g:162:1: ruleLambda : ( ( rule__Lambda__Group__0 ) ) ;
    public final void ruleLambda() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:166:2: ( ( ( rule__Lambda__Group__0 ) ) )
            // InternalX21.g:167:2: ( ( rule__Lambda__Group__0 ) )
            {
            // InternalX21.g:167:2: ( ( rule__Lambda__Group__0 ) )
            // InternalX21.g:168:3: ( rule__Lambda__Group__0 )
            {
             before(grammarAccess.getLambdaAccess().getGroup()); 
            // InternalX21.g:169:3: ( rule__Lambda__Group__0 )
            // InternalX21.g:169:4: rule__Lambda__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLambdaAccess().getGroup()); 

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
    // $ANTLR end "ruleLambda"


    // $ANTLR start "entryRuleInput"
    // InternalX21.g:178:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalX21.g:179:1: ( ruleInput EOF )
            // InternalX21.g:180:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalX21.g:187:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:191:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalX21.g:192:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalX21.g:192:2: ( ( rule__Input__Group__0 ) )
            // InternalX21.g:193:3: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalX21.g:194:3: ( rule__Input__Group__0 )
            // InternalX21.g:194:4: rule__Input__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGroup()); 

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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleNode"
    // InternalX21.g:203:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalX21.g:204:1: ( ruleNode EOF )
            // InternalX21.g:205:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalX21.g:212:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:216:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalX21.g:217:2: ( ( rule__Node__Group__0 ) )
            {
            // InternalX21.g:217:2: ( ( rule__Node__Group__0 ) )
            // InternalX21.g:218:3: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // InternalX21.g:219:3: ( rule__Node__Group__0 )
            // InternalX21.g:219:4: rule__Node__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getGroup()); 

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleStream"
    // InternalX21.g:228:1: entryRuleStream : ruleStream EOF ;
    public final void entryRuleStream() throws RecognitionException {
        try {
            // InternalX21.g:229:1: ( ruleStream EOF )
            // InternalX21.g:230:1: ruleStream EOF
            {
             before(grammarAccess.getStreamRule()); 
            pushFollow(FOLLOW_1);
            ruleStream();

            state._fsp--;

             after(grammarAccess.getStreamRule()); 
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
    // $ANTLR end "entryRuleStream"


    // $ANTLR start "ruleStream"
    // InternalX21.g:237:1: ruleStream : ( ( rule__Stream__Group__0 ) ) ;
    public final void ruleStream() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:241:2: ( ( ( rule__Stream__Group__0 ) ) )
            // InternalX21.g:242:2: ( ( rule__Stream__Group__0 ) )
            {
            // InternalX21.g:242:2: ( ( rule__Stream__Group__0 ) )
            // InternalX21.g:243:3: ( rule__Stream__Group__0 )
            {
             before(grammarAccess.getStreamAccess().getGroup()); 
            // InternalX21.g:244:3: ( rule__Stream__Group__0 )
            // InternalX21.g:244:4: rule__Stream__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Stream__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getGroup()); 

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
    // $ANTLR end "ruleStream"


    // $ANTLR start "entryRuleElement"
    // InternalX21.g:253:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalX21.g:254:1: ( ruleElement EOF )
            // InternalX21.g:255:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalX21.g:262:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:266:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalX21.g:267:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalX21.g:267:2: ( ( rule__Element__Alternatives ) )
            // InternalX21.g:268:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalX21.g:269:3: ( rule__Element__Alternatives )
            // InternalX21.g:269:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleDataDecl"
    // InternalX21.g:278:1: entryRuleDataDecl : ruleDataDecl EOF ;
    public final void entryRuleDataDecl() throws RecognitionException {
        try {
            // InternalX21.g:279:1: ( ruleDataDecl EOF )
            // InternalX21.g:280:1: ruleDataDecl EOF
            {
             before(grammarAccess.getDataDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleDataDecl();

            state._fsp--;

             after(grammarAccess.getDataDeclRule()); 
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
    // $ANTLR end "entryRuleDataDecl"


    // $ANTLR start "ruleDataDecl"
    // InternalX21.g:287:1: ruleDataDecl : ( ( rule__DataDecl__Group__0 ) ) ;
    public final void ruleDataDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:291:2: ( ( ( rule__DataDecl__Group__0 ) ) )
            // InternalX21.g:292:2: ( ( rule__DataDecl__Group__0 ) )
            {
            // InternalX21.g:292:2: ( ( rule__DataDecl__Group__0 ) )
            // InternalX21.g:293:3: ( rule__DataDecl__Group__0 )
            {
             before(grammarAccess.getDataDeclAccess().getGroup()); 
            // InternalX21.g:294:3: ( rule__DataDecl__Group__0 )
            // InternalX21.g:294:4: rule__DataDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataDeclAccess().getGroup()); 

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
    // $ANTLR end "ruleDataDecl"


    // $ANTLR start "entryRuleType"
    // InternalX21.g:303:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalX21.g:304:1: ( ruleType EOF )
            // InternalX21.g:305:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalX21.g:312:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:316:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalX21.g:317:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalX21.g:317:2: ( ( rule__Type__Alternatives ) )
            // InternalX21.g:318:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalX21.g:319:3: ( rule__Type__Alternatives )
            // InternalX21.g:319:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleExp"
    // InternalX21.g:328:1: entryRuleExp : ruleExp EOF ;
    public final void entryRuleExp() throws RecognitionException {
        try {
            // InternalX21.g:329:1: ( ruleExp EOF )
            // InternalX21.g:330:1: ruleExp EOF
            {
             before(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpRule()); 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalX21.g:337:1: ruleExp : ( rulePlusMinus ) ;
    public final void ruleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:341:2: ( ( rulePlusMinus ) )
            // InternalX21.g:342:2: ( rulePlusMinus )
            {
            // InternalX21.g:342:2: ( rulePlusMinus )
            // InternalX21.g:343:3: rulePlusMinus
            {
             before(grammarAccess.getExpAccess().getPlusMinusParserRuleCall()); 
            pushFollow(FOLLOW_2);
            rulePlusMinus();

            state._fsp--;

             after(grammarAccess.getExpAccess().getPlusMinusParserRuleCall()); 

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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRulePlusMinus"
    // InternalX21.g:353:1: entryRulePlusMinus : rulePlusMinus EOF ;
    public final void entryRulePlusMinus() throws RecognitionException {
        try {
            // InternalX21.g:354:1: ( rulePlusMinus EOF )
            // InternalX21.g:355:1: rulePlusMinus EOF
            {
             before(grammarAccess.getPlusMinusRule()); 
            pushFollow(FOLLOW_1);
            rulePlusMinus();

            state._fsp--;

             after(grammarAccess.getPlusMinusRule()); 
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
    // $ANTLR end "entryRulePlusMinus"


    // $ANTLR start "rulePlusMinus"
    // InternalX21.g:362:1: rulePlusMinus : ( ( rule__PlusMinus__Group__0 ) ) ;
    public final void rulePlusMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:366:2: ( ( ( rule__PlusMinus__Group__0 ) ) )
            // InternalX21.g:367:2: ( ( rule__PlusMinus__Group__0 ) )
            {
            // InternalX21.g:367:2: ( ( rule__PlusMinus__Group__0 ) )
            // InternalX21.g:368:3: ( rule__PlusMinus__Group__0 )
            {
             before(grammarAccess.getPlusMinusAccess().getGroup()); 
            // InternalX21.g:369:3: ( rule__PlusMinus__Group__0 )
            // InternalX21.g:369:4: rule__PlusMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusAccess().getGroup()); 

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
    // $ANTLR end "rulePlusMinus"


    // $ANTLR start "entryRuleMulDiv"
    // InternalX21.g:378:1: entryRuleMulDiv : ruleMulDiv EOF ;
    public final void entryRuleMulDiv() throws RecognitionException {
        try {
            // InternalX21.g:379:1: ( ruleMulDiv EOF )
            // InternalX21.g:380:1: ruleMulDiv EOF
            {
             before(grammarAccess.getMulDivRule()); 
            pushFollow(FOLLOW_1);
            ruleMulDiv();

            state._fsp--;

             after(grammarAccess.getMulDivRule()); 
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
    // $ANTLR end "entryRuleMulDiv"


    // $ANTLR start "ruleMulDiv"
    // InternalX21.g:387:1: ruleMulDiv : ( ( rule__MulDiv__Group__0 ) ) ;
    public final void ruleMulDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:391:2: ( ( ( rule__MulDiv__Group__0 ) ) )
            // InternalX21.g:392:2: ( ( rule__MulDiv__Group__0 ) )
            {
            // InternalX21.g:392:2: ( ( rule__MulDiv__Group__0 ) )
            // InternalX21.g:393:3: ( rule__MulDiv__Group__0 )
            {
             before(grammarAccess.getMulDivAccess().getGroup()); 
            // InternalX21.g:394:3: ( rule__MulDiv__Group__0 )
            // InternalX21.g:394:4: rule__MulDiv__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MulDiv__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMulDivAccess().getGroup()); 

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
    // $ANTLR end "ruleMulDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalX21.g:403:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalX21.g:404:1: ( rulePrimary EOF )
            // InternalX21.g:405:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalX21.g:412:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:416:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalX21.g:417:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalX21.g:417:2: ( ( rule__Primary__Alternatives ) )
            // InternalX21.g:418:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalX21.g:419:3: ( rule__Primary__Alternatives )
            // InternalX21.g:419:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalX21.g:428:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // InternalX21.g:429:1: ( ruleAtomic EOF )
            // InternalX21.g:430:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalX21.g:437:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:441:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // InternalX21.g:442:2: ( ( rule__Atomic__Alternatives ) )
            {
            // InternalX21.g:442:2: ( ( rule__Atomic__Alternatives ) )
            // InternalX21.g:443:3: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // InternalX21.g:444:3: ( rule__Atomic__Alternatives )
            // InternalX21.g:444:4: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleLetBinding"
    // InternalX21.g:453:1: entryRuleLetBinding : ruleLetBinding EOF ;
    public final void entryRuleLetBinding() throws RecognitionException {
        try {
            // InternalX21.g:454:1: ( ruleLetBinding EOF )
            // InternalX21.g:455:1: ruleLetBinding EOF
            {
             before(grammarAccess.getLetBindingRule()); 
            pushFollow(FOLLOW_1);
            ruleLetBinding();

            state._fsp--;

             after(grammarAccess.getLetBindingRule()); 
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
    // $ANTLR end "entryRuleLetBinding"


    // $ANTLR start "ruleLetBinding"
    // InternalX21.g:462:1: ruleLetBinding : ( ( rule__LetBinding__Group__0 ) ) ;
    public final void ruleLetBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:466:2: ( ( ( rule__LetBinding__Group__0 ) ) )
            // InternalX21.g:467:2: ( ( rule__LetBinding__Group__0 ) )
            {
            // InternalX21.g:467:2: ( ( rule__LetBinding__Group__0 ) )
            // InternalX21.g:468:3: ( rule__LetBinding__Group__0 )
            {
             before(grammarAccess.getLetBindingAccess().getGroup()); 
            // InternalX21.g:469:3: ( rule__LetBinding__Group__0 )
            // InternalX21.g:469:4: rule__LetBinding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLetBindingAccess().getGroup()); 

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
    // $ANTLR end "ruleLetBinding"


    // $ANTLR start "entryRuleIfStatement"
    // InternalX21.g:478:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // InternalX21.g:479:1: ( ruleIfStatement EOF )
            // InternalX21.g:480:1: ruleIfStatement EOF
            {
             before(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleIfStatement();

            state._fsp--;

             after(grammarAccess.getIfStatementRule()); 
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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalX21.g:487:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:491:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // InternalX21.g:492:2: ( ( rule__IfStatement__Group__0 ) )
            {
            // InternalX21.g:492:2: ( ( rule__IfStatement__Group__0 ) )
            // InternalX21.g:493:3: ( rule__IfStatement__Group__0 )
            {
             before(grammarAccess.getIfStatementAccess().getGroup()); 
            // InternalX21.g:494:3: ( rule__IfStatement__Group__0 )
            // InternalX21.g:494:4: rule__IfStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleLogicExp"
    // InternalX21.g:503:1: entryRuleLogicExp : ruleLogicExp EOF ;
    public final void entryRuleLogicExp() throws RecognitionException {
        try {
            // InternalX21.g:504:1: ( ruleLogicExp EOF )
            // InternalX21.g:505:1: ruleLogicExp EOF
            {
             before(grammarAccess.getLogicExpRule()); 
            pushFollow(FOLLOW_1);
            ruleLogicExp();

            state._fsp--;

             after(grammarAccess.getLogicExpRule()); 
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
    // $ANTLR end "entryRuleLogicExp"


    // $ANTLR start "ruleLogicExp"
    // InternalX21.g:512:1: ruleLogicExp : ( ( rule__LogicExp__Group__0 ) ) ;
    public final void ruleLogicExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:516:2: ( ( ( rule__LogicExp__Group__0 ) ) )
            // InternalX21.g:517:2: ( ( rule__LogicExp__Group__0 ) )
            {
            // InternalX21.g:517:2: ( ( rule__LogicExp__Group__0 ) )
            // InternalX21.g:518:3: ( rule__LogicExp__Group__0 )
            {
             before(grammarAccess.getLogicExpAccess().getGroup()); 
            // InternalX21.g:519:3: ( rule__LogicExp__Group__0 )
            // InternalX21.g:519:4: rule__LogicExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LogicExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicExpAccess().getGroup()); 

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
    // $ANTLR end "ruleLogicExp"


    // $ANTLR start "rule__Declaration__Alternatives"
    // InternalX21.g:527:1: rule__Declaration__Alternatives : ( ( ruleFunction ) | ( ruleInput ) | ( ruleNode ) | ( ruleStream ) | ( ruleDataDecl ) | ( ruleParameter ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:531:1: ( ( ruleFunction ) | ( ruleInput ) | ( ruleNode ) | ( ruleStream ) | ( ruleDataDecl ) | ( ruleParameter ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt1=1;
                }
                break;
            case 25:
                {
                alt1=2;
                }
                break;
            case 26:
                {
                alt1=3;
                }
                break;
            case 29:
                {
                alt1=4;
                }
                break;
            case 33:
                {
                alt1=5;
                }
                break;
            case 18:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalX21.g:532:2: ( ruleFunction )
                    {
                    // InternalX21.g:532:2: ( ruleFunction )
                    // InternalX21.g:533:3: ruleFunction
                    {
                     before(grammarAccess.getDeclarationAccess().getFunctionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFunction();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getFunctionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalX21.g:538:2: ( ruleInput )
                    {
                    // InternalX21.g:538:2: ( ruleInput )
                    // InternalX21.g:539:3: ruleInput
                    {
                     before(grammarAccess.getDeclarationAccess().getInputParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInput();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getInputParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalX21.g:544:2: ( ruleNode )
                    {
                    // InternalX21.g:544:2: ( ruleNode )
                    // InternalX21.g:545:3: ruleNode
                    {
                     before(grammarAccess.getDeclarationAccess().getNodeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNode();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getNodeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalX21.g:550:2: ( ruleStream )
                    {
                    // InternalX21.g:550:2: ( ruleStream )
                    // InternalX21.g:551:3: ruleStream
                    {
                     before(grammarAccess.getDeclarationAccess().getStreamParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleStream();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getStreamParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalX21.g:556:2: ( ruleDataDecl )
                    {
                    // InternalX21.g:556:2: ( ruleDataDecl )
                    // InternalX21.g:557:3: ruleDataDecl
                    {
                     before(grammarAccess.getDeclarationAccess().getDataDeclParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDataDecl();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getDataDeclParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalX21.g:562:2: ( ruleParameter )
                    {
                    // InternalX21.g:562:2: ( ruleParameter )
                    // InternalX21.g:563:3: ruleParameter
                    {
                     before(grammarAccess.getDeclarationAccess().getParameterParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleParameter();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getParameterParserRuleCall_5()); 

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


    // $ANTLR start "rule__Node__Alternatives_3"
    // InternalX21.g:572:1: rule__Node__Alternatives_3 : ( ( ( rule__Node__FunctionAssignment_3_0 ) ) | ( ( rule__Node__LambdaAssignment_3_1 ) ) );
    public final void rule__Node__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:576:1: ( ( ( rule__Node__FunctionAssignment_3_0 ) ) | ( ( rule__Node__LambdaAssignment_3_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==21) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalX21.g:577:2: ( ( rule__Node__FunctionAssignment_3_0 ) )
                    {
                    // InternalX21.g:577:2: ( ( rule__Node__FunctionAssignment_3_0 ) )
                    // InternalX21.g:578:3: ( rule__Node__FunctionAssignment_3_0 )
                    {
                     before(grammarAccess.getNodeAccess().getFunctionAssignment_3_0()); 
                    // InternalX21.g:579:3: ( rule__Node__FunctionAssignment_3_0 )
                    // InternalX21.g:579:4: rule__Node__FunctionAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__FunctionAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getFunctionAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalX21.g:583:2: ( ( rule__Node__LambdaAssignment_3_1 ) )
                    {
                    // InternalX21.g:583:2: ( ( rule__Node__LambdaAssignment_3_1 ) )
                    // InternalX21.g:584:3: ( rule__Node__LambdaAssignment_3_1 )
                    {
                     before(grammarAccess.getNodeAccess().getLambdaAssignment_3_1()); 
                    // InternalX21.g:585:3: ( rule__Node__LambdaAssignment_3_1 )
                    // InternalX21.g:585:4: rule__Node__LambdaAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__LambdaAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeAccess().getLambdaAssignment_3_1()); 

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
    // $ANTLR end "rule__Node__Alternatives_3"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalX21.g:593:1: rule__Element__Alternatives : ( ( ( rule__Element__NodeNameAssignment_0 ) ) | ( ( rule__Element__Group_1__0 ) ) | ( ( rule__Element__Group_2__0 ) ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:597:1: ( ( ( rule__Element__NodeNameAssignment_0 ) ) | ( ( rule__Element__Group_1__0 ) ) | ( ( rule__Element__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 27:
                {
                alt3=2;
                }
                break;
            case 32:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalX21.g:598:2: ( ( rule__Element__NodeNameAssignment_0 ) )
                    {
                    // InternalX21.g:598:2: ( ( rule__Element__NodeNameAssignment_0 ) )
                    // InternalX21.g:599:3: ( rule__Element__NodeNameAssignment_0 )
                    {
                     before(grammarAccess.getElementAccess().getNodeNameAssignment_0()); 
                    // InternalX21.g:600:3: ( rule__Element__NodeNameAssignment_0 )
                    // InternalX21.g:600:4: rule__Element__NodeNameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__NodeNameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getNodeNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalX21.g:604:2: ( ( rule__Element__Group_1__0 ) )
                    {
                    // InternalX21.g:604:2: ( ( rule__Element__Group_1__0 ) )
                    // InternalX21.g:605:3: ( rule__Element__Group_1__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_1()); 
                    // InternalX21.g:606:3: ( rule__Element__Group_1__0 )
                    // InternalX21.g:606:4: rule__Element__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalX21.g:610:2: ( ( rule__Element__Group_2__0 ) )
                    {
                    // InternalX21.g:610:2: ( ( rule__Element__Group_2__0 ) )
                    // InternalX21.g:611:3: ( rule__Element__Group_2__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_2()); 
                    // InternalX21.g:612:3: ( rule__Element__Group_2__0 )
                    // InternalX21.g:612:4: rule__Element__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Element__Alternatives_1_1"
    // InternalX21.g:620:1: rule__Element__Alternatives_1_1 : ( ( ( rule__Element__FunctionAssignment_1_1_0 ) ) | ( ( rule__Element__LambdaAssignment_1_1_1 ) ) );
    public final void rule__Element__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:624:1: ( ( ( rule__Element__FunctionAssignment_1_1_0 ) ) | ( ( rule__Element__LambdaAssignment_1_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalX21.g:625:2: ( ( rule__Element__FunctionAssignment_1_1_0 ) )
                    {
                    // InternalX21.g:625:2: ( ( rule__Element__FunctionAssignment_1_1_0 ) )
                    // InternalX21.g:626:3: ( rule__Element__FunctionAssignment_1_1_0 )
                    {
                     before(grammarAccess.getElementAccess().getFunctionAssignment_1_1_0()); 
                    // InternalX21.g:627:3: ( rule__Element__FunctionAssignment_1_1_0 )
                    // InternalX21.g:627:4: rule__Element__FunctionAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__FunctionAssignment_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getFunctionAssignment_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalX21.g:631:2: ( ( rule__Element__LambdaAssignment_1_1_1 ) )
                    {
                    // InternalX21.g:631:2: ( ( rule__Element__LambdaAssignment_1_1_1 ) )
                    // InternalX21.g:632:3: ( rule__Element__LambdaAssignment_1_1_1 )
                    {
                     before(grammarAccess.getElementAccess().getLambdaAssignment_1_1_1()); 
                    // InternalX21.g:633:3: ( rule__Element__LambdaAssignment_1_1_1 )
                    // InternalX21.g:633:4: rule__Element__LambdaAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Element__LambdaAssignment_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getLambdaAssignment_1_1_1()); 

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
    // $ANTLR end "rule__Element__Alternatives_1_1"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalX21.g:641:1: rule__Type__Alternatives : ( ( 'int' ) | ( 'string' ) | ( RULE_ID ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:645:1: ( ( 'int' ) | ( 'string' ) | ( RULE_ID ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case RULE_ID:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalX21.g:646:2: ( 'int' )
                    {
                    // InternalX21.g:646:2: ( 'int' )
                    // InternalX21.g:647:3: 'int'
                    {
                     before(grammarAccess.getTypeAccess().getIntKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getIntKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalX21.g:652:2: ( 'string' )
                    {
                    // InternalX21.g:652:2: ( 'string' )
                    // InternalX21.g:653:3: 'string'
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalX21.g:658:2: ( RULE_ID )
                    {
                    // InternalX21.g:658:2: ( RULE_ID )
                    // InternalX21.g:659:3: RULE_ID
                    {
                     before(grammarAccess.getTypeAccess().getIDTerminalRuleCall_2()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getIDTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__PlusMinus__Alternatives_1_0"
    // InternalX21.g:668:1: rule__PlusMinus__Alternatives_1_0 : ( ( ( rule__PlusMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:672:1: ( ( ( rule__PlusMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusMinus__Group_1_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==34) ) {
                alt6=1;
            }
            else if ( (LA6_0==35) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalX21.g:673:2: ( ( rule__PlusMinus__Group_1_0_0__0 ) )
                    {
                    // InternalX21.g:673:2: ( ( rule__PlusMinus__Group_1_0_0__0 ) )
                    // InternalX21.g:674:3: ( rule__PlusMinus__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getPlusMinusAccess().getGroup_1_0_0()); 
                    // InternalX21.g:675:3: ( rule__PlusMinus__Group_1_0_0__0 )
                    // InternalX21.g:675:4: rule__PlusMinus__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusMinus__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusMinusAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalX21.g:679:2: ( ( rule__PlusMinus__Group_1_0_1__0 ) )
                    {
                    // InternalX21.g:679:2: ( ( rule__PlusMinus__Group_1_0_1__0 ) )
                    // InternalX21.g:680:3: ( rule__PlusMinus__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getPlusMinusAccess().getGroup_1_0_1()); 
                    // InternalX21.g:681:3: ( rule__PlusMinus__Group_1_0_1__0 )
                    // InternalX21.g:681:4: rule__PlusMinus__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusMinus__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusMinusAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__PlusMinus__Alternatives_1_0"


    // $ANTLR start "rule__MulDiv__Alternatives_1_0"
    // InternalX21.g:689:1: rule__MulDiv__Alternatives_1_0 : ( ( ( rule__MulDiv__Group_1_0_0__0 ) ) | ( ( rule__MulDiv__Group_1_0_1__0 ) ) );
    public final void rule__MulDiv__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:693:1: ( ( ( rule__MulDiv__Group_1_0_0__0 ) ) | ( ( rule__MulDiv__Group_1_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==36) ) {
                alt7=1;
            }
            else if ( (LA7_0==37) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalX21.g:694:2: ( ( rule__MulDiv__Group_1_0_0__0 ) )
                    {
                    // InternalX21.g:694:2: ( ( rule__MulDiv__Group_1_0_0__0 ) )
                    // InternalX21.g:695:3: ( rule__MulDiv__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMulDivAccess().getGroup_1_0_0()); 
                    // InternalX21.g:696:3: ( rule__MulDiv__Group_1_0_0__0 )
                    // InternalX21.g:696:4: rule__MulDiv__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MulDiv__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMulDivAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalX21.g:700:2: ( ( rule__MulDiv__Group_1_0_1__0 ) )
                    {
                    // InternalX21.g:700:2: ( ( rule__MulDiv__Group_1_0_1__0 ) )
                    // InternalX21.g:701:3: ( rule__MulDiv__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMulDivAccess().getGroup_1_0_1()); 
                    // InternalX21.g:702:3: ( rule__MulDiv__Group_1_0_1__0 )
                    // InternalX21.g:702:4: rule__MulDiv__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MulDiv__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMulDivAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__MulDiv__Alternatives_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalX21.g:710:1: rule__Primary__Alternatives : ( ( ruleAtomic ) | ( ( rule__Primary__Group_1__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:714:1: ( ( ruleAtomic ) | ( ( rule__Primary__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT||(LA8_0>=38 && LA8_0<=39)||LA8_0==42) ) {
                alt8=1;
            }
            else if ( (LA8_0==21) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalX21.g:715:2: ( ruleAtomic )
                    {
                    // InternalX21.g:715:2: ( ruleAtomic )
                    // InternalX21.g:716:3: ruleAtomic
                    {
                     before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAtomic();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalX21.g:721:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalX21.g:721:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalX21.g:722:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalX21.g:723:3: ( rule__Primary__Group_1__0 )
                    // InternalX21.g:723:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Atomic__Alternatives"
    // InternalX21.g:731:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ruleLetBinding ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ruleIfStatement ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:735:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ruleLetBinding ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ruleIfStatement ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case 39:
                {
                alt9=2;
                }
                break;
            case 38:
                {
                alt9=3;
                }
                break;
            case 42:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalX21.g:736:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalX21.g:736:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalX21.g:737:3: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // InternalX21.g:738:3: ( rule__Atomic__Group_0__0 )
                    // InternalX21.g:738:4: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalX21.g:742:2: ( ruleLetBinding )
                    {
                    // InternalX21.g:742:2: ( ruleLetBinding )
                    // InternalX21.g:743:3: ruleLetBinding
                    {
                     before(grammarAccess.getAtomicAccess().getLetBindingParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLetBinding();

                    state._fsp--;

                     after(grammarAccess.getAtomicAccess().getLetBindingParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalX21.g:748:2: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // InternalX21.g:748:2: ( ( rule__Atomic__Group_2__0 ) )
                    // InternalX21.g:749:3: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // InternalX21.g:750:3: ( rule__Atomic__Group_2__0 )
                    // InternalX21.g:750:4: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalX21.g:754:2: ( ruleIfStatement )
                    {
                    // InternalX21.g:754:2: ( ruleIfStatement )
                    // InternalX21.g:755:3: ruleIfStatement
                    {
                     before(grammarAccess.getAtomicAccess().getIfStatementParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleIfStatement();

                    state._fsp--;

                     after(grammarAccess.getAtomicAccess().getIfStatementParserRuleCall_3()); 

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
    // $ANTLR end "rule__Atomic__Alternatives"


    // $ANTLR start "rule__LogicExp__OperatorAlternatives_1_0"
    // InternalX21.g:764:1: rule__LogicExp__OperatorAlternatives_1_0 : ( ( '=' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );
    public final void rule__LogicExp__OperatorAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:768:1: ( ( '=' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt10=1;
                }
                break;
            case 14:
                {
                alt10=2;
                }
                break;
            case 15:
                {
                alt10=3;
                }
                break;
            case 16:
                {
                alt10=4;
                }
                break;
            case 17:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalX21.g:769:2: ( '=' )
                    {
                    // InternalX21.g:769:2: ( '=' )
                    // InternalX21.g:770:3: '='
                    {
                     before(grammarAccess.getLogicExpAccess().getOperatorEqualsSignKeyword_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getOperatorEqualsSignKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalX21.g:775:2: ( '<' )
                    {
                    // InternalX21.g:775:2: ( '<' )
                    // InternalX21.g:776:3: '<'
                    {
                     before(grammarAccess.getLogicExpAccess().getOperatorLessThanSignKeyword_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getOperatorLessThanSignKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalX21.g:781:2: ( '>' )
                    {
                    // InternalX21.g:781:2: ( '>' )
                    // InternalX21.g:782:3: '>'
                    {
                     before(grammarAccess.getLogicExpAccess().getOperatorGreaterThanSignKeyword_1_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getOperatorGreaterThanSignKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalX21.g:787:2: ( '<=' )
                    {
                    // InternalX21.g:787:2: ( '<=' )
                    // InternalX21.g:788:3: '<='
                    {
                     before(grammarAccess.getLogicExpAccess().getOperatorLessThanSignEqualsSignKeyword_1_0_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getOperatorLessThanSignEqualsSignKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalX21.g:793:2: ( '>=' )
                    {
                    // InternalX21.g:793:2: ( '>=' )
                    // InternalX21.g:794:3: '>='
                    {
                     before(grammarAccess.getLogicExpAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_0_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_0_4()); 

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
    // $ANTLR end "rule__LogicExp__OperatorAlternatives_1_0"


    // $ANTLR start "rule__X21__Group__0"
    // InternalX21.g:803:1: rule__X21__Group__0 : rule__X21__Group__0__Impl rule__X21__Group__1 ;
    public final void rule__X21__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:807:1: ( rule__X21__Group__0__Impl rule__X21__Group__1 )
            // InternalX21.g:808:2: rule__X21__Group__0__Impl rule__X21__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__X21__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__X21__Group__1();

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
    // $ANTLR end "rule__X21__Group__0"


    // $ANTLR start "rule__X21__Group__0__Impl"
    // InternalX21.g:815:1: rule__X21__Group__0__Impl : ( ( rule__X21__NameAssignment_0 ) ) ;
    public final void rule__X21__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:819:1: ( ( ( rule__X21__NameAssignment_0 ) ) )
            // InternalX21.g:820:1: ( ( rule__X21__NameAssignment_0 ) )
            {
            // InternalX21.g:820:1: ( ( rule__X21__NameAssignment_0 ) )
            // InternalX21.g:821:2: ( rule__X21__NameAssignment_0 )
            {
             before(grammarAccess.getX21Access().getNameAssignment_0()); 
            // InternalX21.g:822:2: ( rule__X21__NameAssignment_0 )
            // InternalX21.g:822:3: rule__X21__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__X21__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getX21Access().getNameAssignment_0()); 

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
    // $ANTLR end "rule__X21__Group__0__Impl"


    // $ANTLR start "rule__X21__Group__1"
    // InternalX21.g:830:1: rule__X21__Group__1 : rule__X21__Group__1__Impl ;
    public final void rule__X21__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:834:1: ( rule__X21__Group__1__Impl )
            // InternalX21.g:835:2: rule__X21__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__X21__Group__1__Impl();

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
    // $ANTLR end "rule__X21__Group__1"


    // $ANTLR start "rule__X21__Group__1__Impl"
    // InternalX21.g:841:1: rule__X21__Group__1__Impl : ( ( rule__X21__DeclarationsAssignment_1 )* ) ;
    public final void rule__X21__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:845:1: ( ( ( rule__X21__DeclarationsAssignment_1 )* ) )
            // InternalX21.g:846:1: ( ( rule__X21__DeclarationsAssignment_1 )* )
            {
            // InternalX21.g:846:1: ( ( rule__X21__DeclarationsAssignment_1 )* )
            // InternalX21.g:847:2: ( rule__X21__DeclarationsAssignment_1 )*
            {
             before(grammarAccess.getX21Access().getDeclarationsAssignment_1()); 
            // InternalX21.g:848:2: ( rule__X21__DeclarationsAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18||LA11_0==20||(LA11_0>=25 && LA11_0<=26)||LA11_0==29||LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalX21.g:848:3: rule__X21__DeclarationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__X21__DeclarationsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getX21Access().getDeclarationsAssignment_1()); 

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
    // $ANTLR end "rule__X21__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalX21.g:857:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:861:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalX21.g:862:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalX21.g:869:1: rule__Parameter__Group__0__Impl : ( 'parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:873:1: ( ( 'parameter' ) )
            // InternalX21.g:874:1: ( 'parameter' )
            {
            // InternalX21.g:874:1: ( 'parameter' )
            // InternalX21.g:875:2: 'parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_0()); 

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
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalX21.g:884:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:888:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalX21.g:889:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalX21.g:896:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:900:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalX21.g:901:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalX21.g:901:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalX21.g:902:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalX21.g:903:2: ( rule__Parameter__NameAssignment_1 )
            // InternalX21.g:903:3: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalX21.g:911:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:915:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalX21.g:916:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalX21.g:923:1: rule__Parameter__Group__2__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:927:1: ( ( ':' ) )
            // InternalX21.g:928:1: ( ':' )
            {
            // InternalX21.g:928:1: ( ':' )
            // InternalX21.g:929:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalX21.g:938:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:942:1: ( rule__Parameter__Group__3__Impl )
            // InternalX21.g:943:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3__Impl();

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
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalX21.g:949:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__TypeAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:953:1: ( ( ( rule__Parameter__TypeAssignment_3 ) ) )
            // InternalX21.g:954:1: ( ( rule__Parameter__TypeAssignment_3 ) )
            {
            // InternalX21.g:954:1: ( ( rule__Parameter__TypeAssignment_3 ) )
            // InternalX21.g:955:2: ( rule__Parameter__TypeAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_3()); 
            // InternalX21.g:956:2: ( rule__Parameter__TypeAssignment_3 )
            // InternalX21.g:956:3: rule__Parameter__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // InternalX21.g:965:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:969:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalX21.g:970:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__1();

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
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // InternalX21.g:977:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:981:1: ( ( 'function' ) )
            // InternalX21.g:982:1: ( 'function' )
            {
            // InternalX21.g:982:1: ( 'function' )
            // InternalX21.g:983:2: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 

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
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalX21.g:992:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:996:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalX21.g:997:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__2();

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
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // InternalX21.g:1004:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1008:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // InternalX21.g:1009:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // InternalX21.g:1009:1: ( ( rule__Function__NameAssignment_1 ) )
            // InternalX21.g:1010:2: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // InternalX21.g:1011:2: ( rule__Function__NameAssignment_1 )
            // InternalX21.g:1011:3: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // InternalX21.g:1019:1: rule__Function__Group__2 : rule__Function__Group__2__Impl ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1023:1: ( rule__Function__Group__2__Impl )
            // InternalX21.g:1024:2: rule__Function__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__2__Impl();

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
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // InternalX21.g:1030:1: rule__Function__Group__2__Impl : ( ( rule__Function__LambdaAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1034:1: ( ( ( rule__Function__LambdaAssignment_2 ) ) )
            // InternalX21.g:1035:1: ( ( rule__Function__LambdaAssignment_2 ) )
            {
            // InternalX21.g:1035:1: ( ( rule__Function__LambdaAssignment_2 ) )
            // InternalX21.g:1036:2: ( rule__Function__LambdaAssignment_2 )
            {
             before(grammarAccess.getFunctionAccess().getLambdaAssignment_2()); 
            // InternalX21.g:1037:2: ( rule__Function__LambdaAssignment_2 )
            // InternalX21.g:1037:3: rule__Function__LambdaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Function__LambdaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getLambdaAssignment_2()); 

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
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Lambda__Group__0"
    // InternalX21.g:1046:1: rule__Lambda__Group__0 : rule__Lambda__Group__0__Impl rule__Lambda__Group__1 ;
    public final void rule__Lambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1050:1: ( rule__Lambda__Group__0__Impl rule__Lambda__Group__1 )
            // InternalX21.g:1051:2: rule__Lambda__Group__0__Impl rule__Lambda__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Lambda__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lambda__Group__1();

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
    // $ANTLR end "rule__Lambda__Group__0"


    // $ANTLR start "rule__Lambda__Group__0__Impl"
    // InternalX21.g:1058:1: rule__Lambda__Group__0__Impl : ( '(' ) ;
    public final void rule__Lambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1062:1: ( ( '(' ) )
            // InternalX21.g:1063:1: ( '(' )
            {
            // InternalX21.g:1063:1: ( '(' )
            // InternalX21.g:1064:2: '('
            {
             before(grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Lambda__Group__0__Impl"


    // $ANTLR start "rule__Lambda__Group__1"
    // InternalX21.g:1073:1: rule__Lambda__Group__1 : rule__Lambda__Group__1__Impl rule__Lambda__Group__2 ;
    public final void rule__Lambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1077:1: ( rule__Lambda__Group__1__Impl rule__Lambda__Group__2 )
            // InternalX21.g:1078:2: rule__Lambda__Group__1__Impl rule__Lambda__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Lambda__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lambda__Group__2();

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
    // $ANTLR end "rule__Lambda__Group__1"


    // $ANTLR start "rule__Lambda__Group__1__Impl"
    // InternalX21.g:1085:1: rule__Lambda__Group__1__Impl : ( ( rule__Lambda__NameAssignment_1 ) ) ;
    public final void rule__Lambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1089:1: ( ( ( rule__Lambda__NameAssignment_1 ) ) )
            // InternalX21.g:1090:1: ( ( rule__Lambda__NameAssignment_1 ) )
            {
            // InternalX21.g:1090:1: ( ( rule__Lambda__NameAssignment_1 ) )
            // InternalX21.g:1091:2: ( rule__Lambda__NameAssignment_1 )
            {
             before(grammarAccess.getLambdaAccess().getNameAssignment_1()); 
            // InternalX21.g:1092:2: ( rule__Lambda__NameAssignment_1 )
            // InternalX21.g:1092:3: rule__Lambda__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLambdaAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Lambda__Group__1__Impl"


    // $ANTLR start "rule__Lambda__Group__2"
    // InternalX21.g:1100:1: rule__Lambda__Group__2 : rule__Lambda__Group__2__Impl rule__Lambda__Group__3 ;
    public final void rule__Lambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1104:1: ( rule__Lambda__Group__2__Impl rule__Lambda__Group__3 )
            // InternalX21.g:1105:2: rule__Lambda__Group__2__Impl rule__Lambda__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Lambda__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lambda__Group__3();

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
    // $ANTLR end "rule__Lambda__Group__2"


    // $ANTLR start "rule__Lambda__Group__2__Impl"
    // InternalX21.g:1112:1: rule__Lambda__Group__2__Impl : ( ':' ) ;
    public final void rule__Lambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1116:1: ( ( ':' ) )
            // InternalX21.g:1117:1: ( ':' )
            {
            // InternalX21.g:1117:1: ( ':' )
            // InternalX21.g:1118:2: ':'
            {
             before(grammarAccess.getLambdaAccess().getColonKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Lambda__Group__2__Impl"


    // $ANTLR start "rule__Lambda__Group__3"
    // InternalX21.g:1127:1: rule__Lambda__Group__3 : rule__Lambda__Group__3__Impl rule__Lambda__Group__4 ;
    public final void rule__Lambda__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1131:1: ( rule__Lambda__Group__3__Impl rule__Lambda__Group__4 )
            // InternalX21.g:1132:2: rule__Lambda__Group__3__Impl rule__Lambda__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Lambda__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lambda__Group__4();

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
    // $ANTLR end "rule__Lambda__Group__3"


    // $ANTLR start "rule__Lambda__Group__3__Impl"
    // InternalX21.g:1139:1: rule__Lambda__Group__3__Impl : ( ( rule__Lambda__TypeAssignment_3 ) ) ;
    public final void rule__Lambda__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1143:1: ( ( ( rule__Lambda__TypeAssignment_3 ) ) )
            // InternalX21.g:1144:1: ( ( rule__Lambda__TypeAssignment_3 ) )
            {
            // InternalX21.g:1144:1: ( ( rule__Lambda__TypeAssignment_3 ) )
            // InternalX21.g:1145:2: ( rule__Lambda__TypeAssignment_3 )
            {
             before(grammarAccess.getLambdaAccess().getTypeAssignment_3()); 
            // InternalX21.g:1146:2: ( rule__Lambda__TypeAssignment_3 )
            // InternalX21.g:1146:3: rule__Lambda__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLambdaAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Lambda__Group__3__Impl"


    // $ANTLR start "rule__Lambda__Group__4"
    // InternalX21.g:1154:1: rule__Lambda__Group__4 : rule__Lambda__Group__4__Impl rule__Lambda__Group__5 ;
    public final void rule__Lambda__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1158:1: ( rule__Lambda__Group__4__Impl rule__Lambda__Group__5 )
            // InternalX21.g:1159:2: rule__Lambda__Group__4__Impl rule__Lambda__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Lambda__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lambda__Group__5();

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
    // $ANTLR end "rule__Lambda__Group__4"


    // $ANTLR start "rule__Lambda__Group__4__Impl"
    // InternalX21.g:1166:1: rule__Lambda__Group__4__Impl : ( ')' ) ;
    public final void rule__Lambda__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1170:1: ( ( ')' ) )
            // InternalX21.g:1171:1: ( ')' )
            {
            // InternalX21.g:1171:1: ( ')' )
            // InternalX21.g:1172:2: ')'
            {
             before(grammarAccess.getLambdaAccess().getRightParenthesisKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Lambda__Group__4__Impl"


    // $ANTLR start "rule__Lambda__Group__5"
    // InternalX21.g:1181:1: rule__Lambda__Group__5 : rule__Lambda__Group__5__Impl rule__Lambda__Group__6 ;
    public final void rule__Lambda__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1185:1: ( rule__Lambda__Group__5__Impl rule__Lambda__Group__6 )
            // InternalX21.g:1186:2: rule__Lambda__Group__5__Impl rule__Lambda__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Lambda__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lambda__Group__6();

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
    // $ANTLR end "rule__Lambda__Group__5"


    // $ANTLR start "rule__Lambda__Group__5__Impl"
    // InternalX21.g:1193:1: rule__Lambda__Group__5__Impl : ( '{' ) ;
    public final void rule__Lambda__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1197:1: ( ( '{' ) )
            // InternalX21.g:1198:1: ( '{' )
            {
            // InternalX21.g:1198:1: ( '{' )
            // InternalX21.g:1199:2: '{'
            {
             before(grammarAccess.getLambdaAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Lambda__Group__5__Impl"


    // $ANTLR start "rule__Lambda__Group__6"
    // InternalX21.g:1208:1: rule__Lambda__Group__6 : rule__Lambda__Group__6__Impl rule__Lambda__Group__7 ;
    public final void rule__Lambda__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1212:1: ( rule__Lambda__Group__6__Impl rule__Lambda__Group__7 )
            // InternalX21.g:1213:2: rule__Lambda__Group__6__Impl rule__Lambda__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Lambda__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lambda__Group__7();

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
    // $ANTLR end "rule__Lambda__Group__6"


    // $ANTLR start "rule__Lambda__Group__6__Impl"
    // InternalX21.g:1220:1: rule__Lambda__Group__6__Impl : ( ( rule__Lambda__ExpAssignment_6 ) ) ;
    public final void rule__Lambda__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1224:1: ( ( ( rule__Lambda__ExpAssignment_6 ) ) )
            // InternalX21.g:1225:1: ( ( rule__Lambda__ExpAssignment_6 ) )
            {
            // InternalX21.g:1225:1: ( ( rule__Lambda__ExpAssignment_6 ) )
            // InternalX21.g:1226:2: ( rule__Lambda__ExpAssignment_6 )
            {
             before(grammarAccess.getLambdaAccess().getExpAssignment_6()); 
            // InternalX21.g:1227:2: ( rule__Lambda__ExpAssignment_6 )
            // InternalX21.g:1227:3: rule__Lambda__ExpAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__ExpAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLambdaAccess().getExpAssignment_6()); 

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
    // $ANTLR end "rule__Lambda__Group__6__Impl"


    // $ANTLR start "rule__Lambda__Group__7"
    // InternalX21.g:1235:1: rule__Lambda__Group__7 : rule__Lambda__Group__7__Impl ;
    public final void rule__Lambda__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1239:1: ( rule__Lambda__Group__7__Impl )
            // InternalX21.g:1240:2: rule__Lambda__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lambda__Group__7__Impl();

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
    // $ANTLR end "rule__Lambda__Group__7"


    // $ANTLR start "rule__Lambda__Group__7__Impl"
    // InternalX21.g:1246:1: rule__Lambda__Group__7__Impl : ( '}' ) ;
    public final void rule__Lambda__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1250:1: ( ( '}' ) )
            // InternalX21.g:1251:1: ( '}' )
            {
            // InternalX21.g:1251:1: ( '}' )
            // InternalX21.g:1252:2: '}'
            {
             before(grammarAccess.getLambdaAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Lambda__Group__7__Impl"


    // $ANTLR start "rule__Input__Group__0"
    // InternalX21.g:1262:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1266:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalX21.g:1267:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__1();

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
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // InternalX21.g:1274:1: rule__Input__Group__0__Impl : ( 'input' ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1278:1: ( ( 'input' ) )
            // InternalX21.g:1279:1: ( 'input' )
            {
            // InternalX21.g:1279:1: ( 'input' )
            // InternalX21.g:1280:2: 'input'
            {
             before(grammarAccess.getInputAccess().getInputKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getInputKeyword_0()); 

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
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // InternalX21.g:1289:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1293:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalX21.g:1294:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Input__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__2();

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
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // InternalX21.g:1301:1: rule__Input__Group__1__Impl : ( ( rule__Input__NameAssignment_1 ) ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1305:1: ( ( ( rule__Input__NameAssignment_1 ) ) )
            // InternalX21.g:1306:1: ( ( rule__Input__NameAssignment_1 ) )
            {
            // InternalX21.g:1306:1: ( ( rule__Input__NameAssignment_1 ) )
            // InternalX21.g:1307:2: ( rule__Input__NameAssignment_1 )
            {
             before(grammarAccess.getInputAccess().getNameAssignment_1()); 
            // InternalX21.g:1308:2: ( rule__Input__NameAssignment_1 )
            // InternalX21.g:1308:3: rule__Input__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Input__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group__2"
    // InternalX21.g:1316:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1320:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalX21.g:1321:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Input__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__3();

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
    // $ANTLR end "rule__Input__Group__2"


    // $ANTLR start "rule__Input__Group__2__Impl"
    // InternalX21.g:1328:1: rule__Input__Group__2__Impl : ( ':' ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1332:1: ( ( ':' ) )
            // InternalX21.g:1333:1: ( ':' )
            {
            // InternalX21.g:1333:1: ( ':' )
            // InternalX21.g:1334:2: ':'
            {
             before(grammarAccess.getInputAccess().getColonKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Input__Group__2__Impl"


    // $ANTLR start "rule__Input__Group__3"
    // InternalX21.g:1343:1: rule__Input__Group__3 : rule__Input__Group__3__Impl ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1347:1: ( rule__Input__Group__3__Impl )
            // InternalX21.g:1348:2: rule__Input__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__3__Impl();

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
    // $ANTLR end "rule__Input__Group__3"


    // $ANTLR start "rule__Input__Group__3__Impl"
    // InternalX21.g:1354:1: rule__Input__Group__3__Impl : ( ( rule__Input__TypeAssignment_3 ) ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1358:1: ( ( ( rule__Input__TypeAssignment_3 ) ) )
            // InternalX21.g:1359:1: ( ( rule__Input__TypeAssignment_3 ) )
            {
            // InternalX21.g:1359:1: ( ( rule__Input__TypeAssignment_3 ) )
            // InternalX21.g:1360:2: ( rule__Input__TypeAssignment_3 )
            {
             before(grammarAccess.getInputAccess().getTypeAssignment_3()); 
            // InternalX21.g:1361:2: ( rule__Input__TypeAssignment_3 )
            // InternalX21.g:1361:3: rule__Input__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Input__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Input__Group__3__Impl"


    // $ANTLR start "rule__Node__Group__0"
    // InternalX21.g:1370:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1374:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalX21.g:1375:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Node__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__1();

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
    // $ANTLR end "rule__Node__Group__0"


    // $ANTLR start "rule__Node__Group__0__Impl"
    // InternalX21.g:1382:1: rule__Node__Group__0__Impl : ( 'node' ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1386:1: ( ( 'node' ) )
            // InternalX21.g:1387:1: ( 'node' )
            {
            // InternalX21.g:1387:1: ( 'node' )
            // InternalX21.g:1388:2: 'node'
            {
             before(grammarAccess.getNodeAccess().getNodeKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNodeKeyword_0()); 

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
    // $ANTLR end "rule__Node__Group__0__Impl"


    // $ANTLR start "rule__Node__Group__1"
    // InternalX21.g:1397:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1401:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalX21.g:1402:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Node__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__2();

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
    // $ANTLR end "rule__Node__Group__1"


    // $ANTLR start "rule__Node__Group__1__Impl"
    // InternalX21.g:1409:1: rule__Node__Group__1__Impl : ( ( rule__Node__NameAssignment_1 ) ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1413:1: ( ( ( rule__Node__NameAssignment_1 ) ) )
            // InternalX21.g:1414:1: ( ( rule__Node__NameAssignment_1 ) )
            {
            // InternalX21.g:1414:1: ( ( rule__Node__NameAssignment_1 ) )
            // InternalX21.g:1415:2: ( rule__Node__NameAssignment_1 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_1()); 
            // InternalX21.g:1416:2: ( rule__Node__NameAssignment_1 )
            // InternalX21.g:1416:3: rule__Node__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Node__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Node__Group__1__Impl"


    // $ANTLR start "rule__Node__Group__2"
    // InternalX21.g:1424:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1428:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // InternalX21.g:1429:2: rule__Node__Group__2__Impl rule__Node__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Node__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__3();

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
    // $ANTLR end "rule__Node__Group__2"


    // $ANTLR start "rule__Node__Group__2__Impl"
    // InternalX21.g:1436:1: rule__Node__Group__2__Impl : ( '[' ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1440:1: ( ( '[' ) )
            // InternalX21.g:1441:1: ( '[' )
            {
            // InternalX21.g:1441:1: ( '[' )
            // InternalX21.g:1442:2: '['
            {
             before(grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__Node__Group__2__Impl"


    // $ANTLR start "rule__Node__Group__3"
    // InternalX21.g:1451:1: rule__Node__Group__3 : rule__Node__Group__3__Impl rule__Node__Group__4 ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1455:1: ( rule__Node__Group__3__Impl rule__Node__Group__4 )
            // InternalX21.g:1456:2: rule__Node__Group__3__Impl rule__Node__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Node__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__4();

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
    // $ANTLR end "rule__Node__Group__3"


    // $ANTLR start "rule__Node__Group__3__Impl"
    // InternalX21.g:1463:1: rule__Node__Group__3__Impl : ( ( rule__Node__Alternatives_3 ) ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1467:1: ( ( ( rule__Node__Alternatives_3 ) ) )
            // InternalX21.g:1468:1: ( ( rule__Node__Alternatives_3 ) )
            {
            // InternalX21.g:1468:1: ( ( rule__Node__Alternatives_3 ) )
            // InternalX21.g:1469:2: ( rule__Node__Alternatives_3 )
            {
             before(grammarAccess.getNodeAccess().getAlternatives_3()); 
            // InternalX21.g:1470:2: ( rule__Node__Alternatives_3 )
            // InternalX21.g:1470:3: rule__Node__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Node__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__Node__Group__3__Impl"


    // $ANTLR start "rule__Node__Group__4"
    // InternalX21.g:1478:1: rule__Node__Group__4 : rule__Node__Group__4__Impl ;
    public final void rule__Node__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1482:1: ( rule__Node__Group__4__Impl )
            // InternalX21.g:1483:2: rule__Node__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__4__Impl();

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
    // $ANTLR end "rule__Node__Group__4"


    // $ANTLR start "rule__Node__Group__4__Impl"
    // InternalX21.g:1489:1: rule__Node__Group__4__Impl : ( ']' ) ;
    public final void rule__Node__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1493:1: ( ( ']' ) )
            // InternalX21.g:1494:1: ( ']' )
            {
            // InternalX21.g:1494:1: ( ']' )
            // InternalX21.g:1495:2: ']'
            {
             before(grammarAccess.getNodeAccess().getRightSquareBracketKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__Node__Group__4__Impl"


    // $ANTLR start "rule__Stream__Group__0"
    // InternalX21.g:1505:1: rule__Stream__Group__0 : rule__Stream__Group__0__Impl rule__Stream__Group__1 ;
    public final void rule__Stream__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1509:1: ( rule__Stream__Group__0__Impl rule__Stream__Group__1 )
            // InternalX21.g:1510:2: rule__Stream__Group__0__Impl rule__Stream__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Stream__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group__1();

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
    // $ANTLR end "rule__Stream__Group__0"


    // $ANTLR start "rule__Stream__Group__0__Impl"
    // InternalX21.g:1517:1: rule__Stream__Group__0__Impl : ( 'stream' ) ;
    public final void rule__Stream__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1521:1: ( ( 'stream' ) )
            // InternalX21.g:1522:1: ( 'stream' )
            {
            // InternalX21.g:1522:1: ( 'stream' )
            // InternalX21.g:1523:2: 'stream'
            {
             before(grammarAccess.getStreamAccess().getStreamKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getStreamKeyword_0()); 

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
    // $ANTLR end "rule__Stream__Group__0__Impl"


    // $ANTLR start "rule__Stream__Group__1"
    // InternalX21.g:1532:1: rule__Stream__Group__1 : rule__Stream__Group__1__Impl rule__Stream__Group__2 ;
    public final void rule__Stream__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1536:1: ( rule__Stream__Group__1__Impl rule__Stream__Group__2 )
            // InternalX21.g:1537:2: rule__Stream__Group__1__Impl rule__Stream__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Stream__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group__2();

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
    // $ANTLR end "rule__Stream__Group__1"


    // $ANTLR start "rule__Stream__Group__1__Impl"
    // InternalX21.g:1544:1: rule__Stream__Group__1__Impl : ( ( rule__Stream__NameAssignment_1 ) ) ;
    public final void rule__Stream__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1548:1: ( ( ( rule__Stream__NameAssignment_1 ) ) )
            // InternalX21.g:1549:1: ( ( rule__Stream__NameAssignment_1 ) )
            {
            // InternalX21.g:1549:1: ( ( rule__Stream__NameAssignment_1 ) )
            // InternalX21.g:1550:2: ( rule__Stream__NameAssignment_1 )
            {
             before(grammarAccess.getStreamAccess().getNameAssignment_1()); 
            // InternalX21.g:1551:2: ( rule__Stream__NameAssignment_1 )
            // InternalX21.g:1551:3: rule__Stream__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Stream__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Stream__Group__1__Impl"


    // $ANTLR start "rule__Stream__Group__2"
    // InternalX21.g:1559:1: rule__Stream__Group__2 : rule__Stream__Group__2__Impl rule__Stream__Group__3 ;
    public final void rule__Stream__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1563:1: ( rule__Stream__Group__2__Impl rule__Stream__Group__3 )
            // InternalX21.g:1564:2: rule__Stream__Group__2__Impl rule__Stream__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Stream__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group__3();

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
    // $ANTLR end "rule__Stream__Group__2"


    // $ANTLR start "rule__Stream__Group__2__Impl"
    // InternalX21.g:1571:1: rule__Stream__Group__2__Impl : ( ( rule__Stream__Group_2__0 )* ) ;
    public final void rule__Stream__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1575:1: ( ( ( rule__Stream__Group_2__0 )* ) )
            // InternalX21.g:1576:1: ( ( rule__Stream__Group_2__0 )* )
            {
            // InternalX21.g:1576:1: ( ( rule__Stream__Group_2__0 )* )
            // InternalX21.g:1577:2: ( rule__Stream__Group_2__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_2()); 
            // InternalX21.g:1578:2: ( rule__Stream__Group_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==30) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalX21.g:1578:3: rule__Stream__Group_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Stream__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getStreamAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Stream__Group__2__Impl"


    // $ANTLR start "rule__Stream__Group__3"
    // InternalX21.g:1586:1: rule__Stream__Group__3 : rule__Stream__Group__3__Impl ;
    public final void rule__Stream__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1590:1: ( rule__Stream__Group__3__Impl )
            // InternalX21.g:1591:2: rule__Stream__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stream__Group__3__Impl();

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
    // $ANTLR end "rule__Stream__Group__3"


    // $ANTLR start "rule__Stream__Group__3__Impl"
    // InternalX21.g:1597:1: rule__Stream__Group__3__Impl : ( ( ( rule__Stream__Group_3__0 ) ) ( ( rule__Stream__Group_3__0 )* ) ) ;
    public final void rule__Stream__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1601:1: ( ( ( ( rule__Stream__Group_3__0 ) ) ( ( rule__Stream__Group_3__0 )* ) ) )
            // InternalX21.g:1602:1: ( ( ( rule__Stream__Group_3__0 ) ) ( ( rule__Stream__Group_3__0 )* ) )
            {
            // InternalX21.g:1602:1: ( ( ( rule__Stream__Group_3__0 ) ) ( ( rule__Stream__Group_3__0 )* ) )
            // InternalX21.g:1603:2: ( ( rule__Stream__Group_3__0 ) ) ( ( rule__Stream__Group_3__0 )* )
            {
            // InternalX21.g:1603:2: ( ( rule__Stream__Group_3__0 ) )
            // InternalX21.g:1604:3: ( rule__Stream__Group_3__0 )
            {
             before(grammarAccess.getStreamAccess().getGroup_3()); 
            // InternalX21.g:1605:3: ( rule__Stream__Group_3__0 )
            // InternalX21.g:1605:4: rule__Stream__Group_3__0
            {
            pushFollow(FOLLOW_18);
            rule__Stream__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getGroup_3()); 

            }

            // InternalX21.g:1608:2: ( ( rule__Stream__Group_3__0 )* )
            // InternalX21.g:1609:3: ( rule__Stream__Group_3__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_3()); 
            // InternalX21.g:1610:3: ( rule__Stream__Group_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalX21.g:1610:4: rule__Stream__Group_3__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Stream__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getStreamAccess().getGroup_3()); 

            }


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
    // $ANTLR end "rule__Stream__Group__3__Impl"


    // $ANTLR start "rule__Stream__Group_2__0"
    // InternalX21.g:1620:1: rule__Stream__Group_2__0 : rule__Stream__Group_2__0__Impl rule__Stream__Group_2__1 ;
    public final void rule__Stream__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1624:1: ( rule__Stream__Group_2__0__Impl rule__Stream__Group_2__1 )
            // InternalX21.g:1625:2: rule__Stream__Group_2__0__Impl rule__Stream__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Stream__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group_2__1();

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
    // $ANTLR end "rule__Stream__Group_2__0"


    // $ANTLR start "rule__Stream__Group_2__0__Impl"
    // InternalX21.g:1632:1: rule__Stream__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Stream__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1636:1: ( ( ',' ) )
            // InternalX21.g:1637:1: ( ',' )
            {
            // InternalX21.g:1637:1: ( ',' )
            // InternalX21.g:1638:2: ','
            {
             before(grammarAccess.getStreamAccess().getCommaKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__Stream__Group_2__0__Impl"


    // $ANTLR start "rule__Stream__Group_2__1"
    // InternalX21.g:1647:1: rule__Stream__Group_2__1 : rule__Stream__Group_2__1__Impl ;
    public final void rule__Stream__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1651:1: ( rule__Stream__Group_2__1__Impl )
            // InternalX21.g:1652:2: rule__Stream__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stream__Group_2__1__Impl();

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
    // $ANTLR end "rule__Stream__Group_2__1"


    // $ANTLR start "rule__Stream__Group_2__1__Impl"
    // InternalX21.g:1658:1: rule__Stream__Group_2__1__Impl : ( ( rule__Stream__InputsAssignment_2_1 ) ) ;
    public final void rule__Stream__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1662:1: ( ( ( rule__Stream__InputsAssignment_2_1 ) ) )
            // InternalX21.g:1663:1: ( ( rule__Stream__InputsAssignment_2_1 ) )
            {
            // InternalX21.g:1663:1: ( ( rule__Stream__InputsAssignment_2_1 ) )
            // InternalX21.g:1664:2: ( rule__Stream__InputsAssignment_2_1 )
            {
             before(grammarAccess.getStreamAccess().getInputsAssignment_2_1()); 
            // InternalX21.g:1665:2: ( rule__Stream__InputsAssignment_2_1 )
            // InternalX21.g:1665:3: rule__Stream__InputsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Stream__InputsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getInputsAssignment_2_1()); 

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
    // $ANTLR end "rule__Stream__Group_2__1__Impl"


    // $ANTLR start "rule__Stream__Group_3__0"
    // InternalX21.g:1674:1: rule__Stream__Group_3__0 : rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1 ;
    public final void rule__Stream__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1678:1: ( rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1 )
            // InternalX21.g:1679:2: rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1
            {
            pushFollow(FOLLOW_19);
            rule__Stream__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group_3__1();

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
    // $ANTLR end "rule__Stream__Group_3__0"


    // $ANTLR start "rule__Stream__Group_3__0__Impl"
    // InternalX21.g:1686:1: rule__Stream__Group_3__0__Impl : ( 'to' ) ;
    public final void rule__Stream__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1690:1: ( ( 'to' ) )
            // InternalX21.g:1691:1: ( 'to' )
            {
            // InternalX21.g:1691:1: ( 'to' )
            // InternalX21.g:1692:2: 'to'
            {
             before(grammarAccess.getStreamAccess().getToKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getToKeyword_3_0()); 

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
    // $ANTLR end "rule__Stream__Group_3__0__Impl"


    // $ANTLR start "rule__Stream__Group_3__1"
    // InternalX21.g:1701:1: rule__Stream__Group_3__1 : rule__Stream__Group_3__1__Impl rule__Stream__Group_3__2 ;
    public final void rule__Stream__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1705:1: ( rule__Stream__Group_3__1__Impl rule__Stream__Group_3__2 )
            // InternalX21.g:1706:2: rule__Stream__Group_3__1__Impl rule__Stream__Group_3__2
            {
            pushFollow(FOLLOW_20);
            rule__Stream__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group_3__2();

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
    // $ANTLR end "rule__Stream__Group_3__1"


    // $ANTLR start "rule__Stream__Group_3__1__Impl"
    // InternalX21.g:1713:1: rule__Stream__Group_3__1__Impl : ( ( rule__Stream__ElementsAssignment_3_1 ) ) ;
    public final void rule__Stream__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1717:1: ( ( ( rule__Stream__ElementsAssignment_3_1 ) ) )
            // InternalX21.g:1718:1: ( ( rule__Stream__ElementsAssignment_3_1 ) )
            {
            // InternalX21.g:1718:1: ( ( rule__Stream__ElementsAssignment_3_1 ) )
            // InternalX21.g:1719:2: ( rule__Stream__ElementsAssignment_3_1 )
            {
             before(grammarAccess.getStreamAccess().getElementsAssignment_3_1()); 
            // InternalX21.g:1720:2: ( rule__Stream__ElementsAssignment_3_1 )
            // InternalX21.g:1720:3: rule__Stream__ElementsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Stream__ElementsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getElementsAssignment_3_1()); 

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
    // $ANTLR end "rule__Stream__Group_3__1__Impl"


    // $ANTLR start "rule__Stream__Group_3__2"
    // InternalX21.g:1728:1: rule__Stream__Group_3__2 : rule__Stream__Group_3__2__Impl ;
    public final void rule__Stream__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1732:1: ( rule__Stream__Group_3__2__Impl )
            // InternalX21.g:1733:2: rule__Stream__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stream__Group_3__2__Impl();

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
    // $ANTLR end "rule__Stream__Group_3__2"


    // $ANTLR start "rule__Stream__Group_3__2__Impl"
    // InternalX21.g:1739:1: rule__Stream__Group_3__2__Impl : ( ( rule__Stream__Group_3_2__0 )* ) ;
    public final void rule__Stream__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1743:1: ( ( ( rule__Stream__Group_3_2__0 )* ) )
            // InternalX21.g:1744:1: ( ( rule__Stream__Group_3_2__0 )* )
            {
            // InternalX21.g:1744:1: ( ( rule__Stream__Group_3_2__0 )* )
            // InternalX21.g:1745:2: ( rule__Stream__Group_3_2__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_3_2()); 
            // InternalX21.g:1746:2: ( rule__Stream__Group_3_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalX21.g:1746:3: rule__Stream__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Stream__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getStreamAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__Stream__Group_3__2__Impl"


    // $ANTLR start "rule__Stream__Group_3_2__0"
    // InternalX21.g:1755:1: rule__Stream__Group_3_2__0 : rule__Stream__Group_3_2__0__Impl rule__Stream__Group_3_2__1 ;
    public final void rule__Stream__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1759:1: ( rule__Stream__Group_3_2__0__Impl rule__Stream__Group_3_2__1 )
            // InternalX21.g:1760:2: rule__Stream__Group_3_2__0__Impl rule__Stream__Group_3_2__1
            {
            pushFollow(FOLLOW_19);
            rule__Stream__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stream__Group_3_2__1();

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
    // $ANTLR end "rule__Stream__Group_3_2__0"


    // $ANTLR start "rule__Stream__Group_3_2__0__Impl"
    // InternalX21.g:1767:1: rule__Stream__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Stream__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1771:1: ( ( ',' ) )
            // InternalX21.g:1772:1: ( ',' )
            {
            // InternalX21.g:1772:1: ( ',' )
            // InternalX21.g:1773:2: ','
            {
             before(grammarAccess.getStreamAccess().getCommaKeyword_3_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getCommaKeyword_3_2_0()); 

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
    // $ANTLR end "rule__Stream__Group_3_2__0__Impl"


    // $ANTLR start "rule__Stream__Group_3_2__1"
    // InternalX21.g:1782:1: rule__Stream__Group_3_2__1 : rule__Stream__Group_3_2__1__Impl ;
    public final void rule__Stream__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1786:1: ( rule__Stream__Group_3_2__1__Impl )
            // InternalX21.g:1787:2: rule__Stream__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stream__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__Stream__Group_3_2__1"


    // $ANTLR start "rule__Stream__Group_3_2__1__Impl"
    // InternalX21.g:1793:1: rule__Stream__Group_3_2__1__Impl : ( ( rule__Stream__ElementsAssignment_3_2_1 ) ) ;
    public final void rule__Stream__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1797:1: ( ( ( rule__Stream__ElementsAssignment_3_2_1 ) ) )
            // InternalX21.g:1798:1: ( ( rule__Stream__ElementsAssignment_3_2_1 ) )
            {
            // InternalX21.g:1798:1: ( ( rule__Stream__ElementsAssignment_3_2_1 ) )
            // InternalX21.g:1799:2: ( rule__Stream__ElementsAssignment_3_2_1 )
            {
             before(grammarAccess.getStreamAccess().getElementsAssignment_3_2_1()); 
            // InternalX21.g:1800:2: ( rule__Stream__ElementsAssignment_3_2_1 )
            // InternalX21.g:1800:3: rule__Stream__ElementsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Stream__ElementsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getElementsAssignment_3_2_1()); 

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
    // $ANTLR end "rule__Stream__Group_3_2__1__Impl"


    // $ANTLR start "rule__Element__Group_1__0"
    // InternalX21.g:1809:1: rule__Element__Group_1__0 : rule__Element__Group_1__0__Impl rule__Element__Group_1__1 ;
    public final void rule__Element__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1813:1: ( rule__Element__Group_1__0__Impl rule__Element__Group_1__1 )
            // InternalX21.g:1814:2: rule__Element__Group_1__0__Impl rule__Element__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Element__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group_1__1();

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
    // $ANTLR end "rule__Element__Group_1__0"


    // $ANTLR start "rule__Element__Group_1__0__Impl"
    // InternalX21.g:1821:1: rule__Element__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Element__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1825:1: ( ( '[' ) )
            // InternalX21.g:1826:1: ( '[' )
            {
            // InternalX21.g:1826:1: ( '[' )
            // InternalX21.g:1827:2: '['
            {
             before(grammarAccess.getElementAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getLeftSquareBracketKeyword_1_0()); 

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
    // $ANTLR end "rule__Element__Group_1__0__Impl"


    // $ANTLR start "rule__Element__Group_1__1"
    // InternalX21.g:1836:1: rule__Element__Group_1__1 : rule__Element__Group_1__1__Impl rule__Element__Group_1__2 ;
    public final void rule__Element__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1840:1: ( rule__Element__Group_1__1__Impl rule__Element__Group_1__2 )
            // InternalX21.g:1841:2: rule__Element__Group_1__1__Impl rule__Element__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__Element__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group_1__2();

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
    // $ANTLR end "rule__Element__Group_1__1"


    // $ANTLR start "rule__Element__Group_1__1__Impl"
    // InternalX21.g:1848:1: rule__Element__Group_1__1__Impl : ( ( rule__Element__Alternatives_1_1 ) ) ;
    public final void rule__Element__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1852:1: ( ( ( rule__Element__Alternatives_1_1 ) ) )
            // InternalX21.g:1853:1: ( ( rule__Element__Alternatives_1_1 ) )
            {
            // InternalX21.g:1853:1: ( ( rule__Element__Alternatives_1_1 ) )
            // InternalX21.g:1854:2: ( rule__Element__Alternatives_1_1 )
            {
             before(grammarAccess.getElementAccess().getAlternatives_1_1()); 
            // InternalX21.g:1855:2: ( rule__Element__Alternatives_1_1 )
            // InternalX21.g:1855:3: rule__Element__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives_1_1()); 

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
    // $ANTLR end "rule__Element__Group_1__1__Impl"


    // $ANTLR start "rule__Element__Group_1__2"
    // InternalX21.g:1863:1: rule__Element__Group_1__2 : rule__Element__Group_1__2__Impl ;
    public final void rule__Element__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1867:1: ( rule__Element__Group_1__2__Impl )
            // InternalX21.g:1868:2: rule__Element__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group_1__2__Impl();

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
    // $ANTLR end "rule__Element__Group_1__2"


    // $ANTLR start "rule__Element__Group_1__2__Impl"
    // InternalX21.g:1874:1: rule__Element__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Element__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1878:1: ( ( ']' ) )
            // InternalX21.g:1879:1: ( ']' )
            {
            // InternalX21.g:1879:1: ( ']' )
            // InternalX21.g:1880:2: ']'
            {
             before(grammarAccess.getElementAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getRightSquareBracketKeyword_1_2()); 

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
    // $ANTLR end "rule__Element__Group_1__2__Impl"


    // $ANTLR start "rule__Element__Group_2__0"
    // InternalX21.g:1890:1: rule__Element__Group_2__0 : rule__Element__Group_2__0__Impl rule__Element__Group_2__1 ;
    public final void rule__Element__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1894:1: ( rule__Element__Group_2__0__Impl rule__Element__Group_2__1 )
            // InternalX21.g:1895:2: rule__Element__Group_2__0__Impl rule__Element__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Element__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group_2__1();

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
    // $ANTLR end "rule__Element__Group_2__0"


    // $ANTLR start "rule__Element__Group_2__0__Impl"
    // InternalX21.g:1902:1: rule__Element__Group_2__0__Impl : ( 'output' ) ;
    public final void rule__Element__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1906:1: ( ( 'output' ) )
            // InternalX21.g:1907:1: ( 'output' )
            {
            // InternalX21.g:1907:1: ( 'output' )
            // InternalX21.g:1908:2: 'output'
            {
             before(grammarAccess.getElementAccess().getOutputKeyword_2_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getOutputKeyword_2_0()); 

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
    // $ANTLR end "rule__Element__Group_2__0__Impl"


    // $ANTLR start "rule__Element__Group_2__1"
    // InternalX21.g:1917:1: rule__Element__Group_2__1 : rule__Element__Group_2__1__Impl ;
    public final void rule__Element__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1921:1: ( rule__Element__Group_2__1__Impl )
            // InternalX21.g:1922:2: rule__Element__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group_2__1__Impl();

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
    // $ANTLR end "rule__Element__Group_2__1"


    // $ANTLR start "rule__Element__Group_2__1__Impl"
    // InternalX21.g:1928:1: rule__Element__Group_2__1__Impl : ( ( rule__Element__OutputNameAssignment_2_1 ) ) ;
    public final void rule__Element__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1932:1: ( ( ( rule__Element__OutputNameAssignment_2_1 ) ) )
            // InternalX21.g:1933:1: ( ( rule__Element__OutputNameAssignment_2_1 ) )
            {
            // InternalX21.g:1933:1: ( ( rule__Element__OutputNameAssignment_2_1 ) )
            // InternalX21.g:1934:2: ( rule__Element__OutputNameAssignment_2_1 )
            {
             before(grammarAccess.getElementAccess().getOutputNameAssignment_2_1()); 
            // InternalX21.g:1935:2: ( rule__Element__OutputNameAssignment_2_1 )
            // InternalX21.g:1935:3: rule__Element__OutputNameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Element__OutputNameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getOutputNameAssignment_2_1()); 

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
    // $ANTLR end "rule__Element__Group_2__1__Impl"


    // $ANTLR start "rule__DataDecl__Group__0"
    // InternalX21.g:1944:1: rule__DataDecl__Group__0 : rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1 ;
    public final void rule__DataDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1948:1: ( rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1 )
            // InternalX21.g:1949:2: rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DataDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group__1();

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
    // $ANTLR end "rule__DataDecl__Group__0"


    // $ANTLR start "rule__DataDecl__Group__0__Impl"
    // InternalX21.g:1956:1: rule__DataDecl__Group__0__Impl : ( 'data' ) ;
    public final void rule__DataDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1960:1: ( ( 'data' ) )
            // InternalX21.g:1961:1: ( 'data' )
            {
            // InternalX21.g:1961:1: ( 'data' )
            // InternalX21.g:1962:2: 'data'
            {
             before(grammarAccess.getDataDeclAccess().getDataKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getDataKeyword_0()); 

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
    // $ANTLR end "rule__DataDecl__Group__0__Impl"


    // $ANTLR start "rule__DataDecl__Group__1"
    // InternalX21.g:1971:1: rule__DataDecl__Group__1 : rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2 ;
    public final void rule__DataDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1975:1: ( rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2 )
            // InternalX21.g:1976:2: rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__DataDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group__2();

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
    // $ANTLR end "rule__DataDecl__Group__1"


    // $ANTLR start "rule__DataDecl__Group__1__Impl"
    // InternalX21.g:1983:1: rule__DataDecl__Group__1__Impl : ( ( rule__DataDecl__NameAssignment_1 ) ) ;
    public final void rule__DataDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1987:1: ( ( ( rule__DataDecl__NameAssignment_1 ) ) )
            // InternalX21.g:1988:1: ( ( rule__DataDecl__NameAssignment_1 ) )
            {
            // InternalX21.g:1988:1: ( ( rule__DataDecl__NameAssignment_1 ) )
            // InternalX21.g:1989:2: ( rule__DataDecl__NameAssignment_1 )
            {
             before(grammarAccess.getDataDeclAccess().getNameAssignment_1()); 
            // InternalX21.g:1990:2: ( rule__DataDecl__NameAssignment_1 )
            // InternalX21.g:1990:3: rule__DataDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataDecl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataDeclAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DataDecl__Group__1__Impl"


    // $ANTLR start "rule__DataDecl__Group__2"
    // InternalX21.g:1998:1: rule__DataDecl__Group__2 : rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3 ;
    public final void rule__DataDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2002:1: ( rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3 )
            // InternalX21.g:2003:2: rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__DataDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group__3();

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
    // $ANTLR end "rule__DataDecl__Group__2"


    // $ANTLR start "rule__DataDecl__Group__2__Impl"
    // InternalX21.g:2010:1: rule__DataDecl__Group__2__Impl : ( '{' ) ;
    public final void rule__DataDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2014:1: ( ( '{' ) )
            // InternalX21.g:2015:1: ( '{' )
            {
            // InternalX21.g:2015:1: ( '{' )
            // InternalX21.g:2016:2: '{'
            {
             before(grammarAccess.getDataDeclAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__DataDecl__Group__2__Impl"


    // $ANTLR start "rule__DataDecl__Group__3"
    // InternalX21.g:2025:1: rule__DataDecl__Group__3 : rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4 ;
    public final void rule__DataDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2029:1: ( rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4 )
            // InternalX21.g:2030:2: rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__DataDecl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group__4();

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
    // $ANTLR end "rule__DataDecl__Group__3"


    // $ANTLR start "rule__DataDecl__Group__3__Impl"
    // InternalX21.g:2037:1: rule__DataDecl__Group__3__Impl : ( ( rule__DataDecl__DeclNamesAssignment_3 ) ) ;
    public final void rule__DataDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2041:1: ( ( ( rule__DataDecl__DeclNamesAssignment_3 ) ) )
            // InternalX21.g:2042:1: ( ( rule__DataDecl__DeclNamesAssignment_3 ) )
            {
            // InternalX21.g:2042:1: ( ( rule__DataDecl__DeclNamesAssignment_3 ) )
            // InternalX21.g:2043:2: ( rule__DataDecl__DeclNamesAssignment_3 )
            {
             before(grammarAccess.getDataDeclAccess().getDeclNamesAssignment_3()); 
            // InternalX21.g:2044:2: ( rule__DataDecl__DeclNamesAssignment_3 )
            // InternalX21.g:2044:3: rule__DataDecl__DeclNamesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DataDecl__DeclNamesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataDeclAccess().getDeclNamesAssignment_3()); 

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
    // $ANTLR end "rule__DataDecl__Group__3__Impl"


    // $ANTLR start "rule__DataDecl__Group__4"
    // InternalX21.g:2052:1: rule__DataDecl__Group__4 : rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5 ;
    public final void rule__DataDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2056:1: ( rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5 )
            // InternalX21.g:2057:2: rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__DataDecl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group__5();

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
    // $ANTLR end "rule__DataDecl__Group__4"


    // $ANTLR start "rule__DataDecl__Group__4__Impl"
    // InternalX21.g:2064:1: rule__DataDecl__Group__4__Impl : ( ':' ) ;
    public final void rule__DataDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2068:1: ( ( ':' ) )
            // InternalX21.g:2069:1: ( ':' )
            {
            // InternalX21.g:2069:1: ( ':' )
            // InternalX21.g:2070:2: ':'
            {
             before(grammarAccess.getDataDeclAccess().getColonKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__DataDecl__Group__4__Impl"


    // $ANTLR start "rule__DataDecl__Group__5"
    // InternalX21.g:2079:1: rule__DataDecl__Group__5 : rule__DataDecl__Group__5__Impl rule__DataDecl__Group__6 ;
    public final void rule__DataDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2083:1: ( rule__DataDecl__Group__5__Impl rule__DataDecl__Group__6 )
            // InternalX21.g:2084:2: rule__DataDecl__Group__5__Impl rule__DataDecl__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__DataDecl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group__6();

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
    // $ANTLR end "rule__DataDecl__Group__5"


    // $ANTLR start "rule__DataDecl__Group__5__Impl"
    // InternalX21.g:2091:1: rule__DataDecl__Group__5__Impl : ( ( rule__DataDecl__TypesAssignment_5 ) ) ;
    public final void rule__DataDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2095:1: ( ( ( rule__DataDecl__TypesAssignment_5 ) ) )
            // InternalX21.g:2096:1: ( ( rule__DataDecl__TypesAssignment_5 ) )
            {
            // InternalX21.g:2096:1: ( ( rule__DataDecl__TypesAssignment_5 ) )
            // InternalX21.g:2097:2: ( rule__DataDecl__TypesAssignment_5 )
            {
             before(grammarAccess.getDataDeclAccess().getTypesAssignment_5()); 
            // InternalX21.g:2098:2: ( rule__DataDecl__TypesAssignment_5 )
            // InternalX21.g:2098:3: rule__DataDecl__TypesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DataDecl__TypesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDataDeclAccess().getTypesAssignment_5()); 

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
    // $ANTLR end "rule__DataDecl__Group__5__Impl"


    // $ANTLR start "rule__DataDecl__Group__6"
    // InternalX21.g:2106:1: rule__DataDecl__Group__6 : rule__DataDecl__Group__6__Impl rule__DataDecl__Group__7 ;
    public final void rule__DataDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2110:1: ( rule__DataDecl__Group__6__Impl rule__DataDecl__Group__7 )
            // InternalX21.g:2111:2: rule__DataDecl__Group__6__Impl rule__DataDecl__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__DataDecl__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group__7();

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
    // $ANTLR end "rule__DataDecl__Group__6"


    // $ANTLR start "rule__DataDecl__Group__6__Impl"
    // InternalX21.g:2118:1: rule__DataDecl__Group__6__Impl : ( ( rule__DataDecl__Group_6__0 )* ) ;
    public final void rule__DataDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2122:1: ( ( ( rule__DataDecl__Group_6__0 )* ) )
            // InternalX21.g:2123:1: ( ( rule__DataDecl__Group_6__0 )* )
            {
            // InternalX21.g:2123:1: ( ( rule__DataDecl__Group_6__0 )* )
            // InternalX21.g:2124:2: ( rule__DataDecl__Group_6__0 )*
            {
             before(grammarAccess.getDataDeclAccess().getGroup_6()); 
            // InternalX21.g:2125:2: ( rule__DataDecl__Group_6__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalX21.g:2125:3: rule__DataDecl__Group_6__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__DataDecl__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getDataDeclAccess().getGroup_6()); 

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
    // $ANTLR end "rule__DataDecl__Group__6__Impl"


    // $ANTLR start "rule__DataDecl__Group__7"
    // InternalX21.g:2133:1: rule__DataDecl__Group__7 : rule__DataDecl__Group__7__Impl ;
    public final void rule__DataDecl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2137:1: ( rule__DataDecl__Group__7__Impl )
            // InternalX21.g:2138:2: rule__DataDecl__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataDecl__Group__7__Impl();

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
    // $ANTLR end "rule__DataDecl__Group__7"


    // $ANTLR start "rule__DataDecl__Group__7__Impl"
    // InternalX21.g:2144:1: rule__DataDecl__Group__7__Impl : ( '}' ) ;
    public final void rule__DataDecl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2148:1: ( ( '}' ) )
            // InternalX21.g:2149:1: ( '}' )
            {
            // InternalX21.g:2149:1: ( '}' )
            // InternalX21.g:2150:2: '}'
            {
             before(grammarAccess.getDataDeclAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__DataDecl__Group__7__Impl"


    // $ANTLR start "rule__DataDecl__Group_6__0"
    // InternalX21.g:2160:1: rule__DataDecl__Group_6__0 : rule__DataDecl__Group_6__0__Impl rule__DataDecl__Group_6__1 ;
    public final void rule__DataDecl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2164:1: ( rule__DataDecl__Group_6__0__Impl rule__DataDecl__Group_6__1 )
            // InternalX21.g:2165:2: rule__DataDecl__Group_6__0__Impl rule__DataDecl__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__DataDecl__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group_6__1();

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
    // $ANTLR end "rule__DataDecl__Group_6__0"


    // $ANTLR start "rule__DataDecl__Group_6__0__Impl"
    // InternalX21.g:2172:1: rule__DataDecl__Group_6__0__Impl : ( ',' ) ;
    public final void rule__DataDecl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2176:1: ( ( ',' ) )
            // InternalX21.g:2177:1: ( ',' )
            {
            // InternalX21.g:2177:1: ( ',' )
            // InternalX21.g:2178:2: ','
            {
             before(grammarAccess.getDataDeclAccess().getCommaKeyword_6_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getCommaKeyword_6_0()); 

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
    // $ANTLR end "rule__DataDecl__Group_6__0__Impl"


    // $ANTLR start "rule__DataDecl__Group_6__1"
    // InternalX21.g:2187:1: rule__DataDecl__Group_6__1 : rule__DataDecl__Group_6__1__Impl rule__DataDecl__Group_6__2 ;
    public final void rule__DataDecl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2191:1: ( rule__DataDecl__Group_6__1__Impl rule__DataDecl__Group_6__2 )
            // InternalX21.g:2192:2: rule__DataDecl__Group_6__1__Impl rule__DataDecl__Group_6__2
            {
            pushFollow(FOLLOW_6);
            rule__DataDecl__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group_6__2();

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
    // $ANTLR end "rule__DataDecl__Group_6__1"


    // $ANTLR start "rule__DataDecl__Group_6__1__Impl"
    // InternalX21.g:2199:1: rule__DataDecl__Group_6__1__Impl : ( ( rule__DataDecl__DeclNamesAssignment_6_1 ) ) ;
    public final void rule__DataDecl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2203:1: ( ( ( rule__DataDecl__DeclNamesAssignment_6_1 ) ) )
            // InternalX21.g:2204:1: ( ( rule__DataDecl__DeclNamesAssignment_6_1 ) )
            {
            // InternalX21.g:2204:1: ( ( rule__DataDecl__DeclNamesAssignment_6_1 ) )
            // InternalX21.g:2205:2: ( rule__DataDecl__DeclNamesAssignment_6_1 )
            {
             before(grammarAccess.getDataDeclAccess().getDeclNamesAssignment_6_1()); 
            // InternalX21.g:2206:2: ( rule__DataDecl__DeclNamesAssignment_6_1 )
            // InternalX21.g:2206:3: rule__DataDecl__DeclNamesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__DataDecl__DeclNamesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getDataDeclAccess().getDeclNamesAssignment_6_1()); 

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
    // $ANTLR end "rule__DataDecl__Group_6__1__Impl"


    // $ANTLR start "rule__DataDecl__Group_6__2"
    // InternalX21.g:2214:1: rule__DataDecl__Group_6__2 : rule__DataDecl__Group_6__2__Impl rule__DataDecl__Group_6__3 ;
    public final void rule__DataDecl__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2218:1: ( rule__DataDecl__Group_6__2__Impl rule__DataDecl__Group_6__3 )
            // InternalX21.g:2219:2: rule__DataDecl__Group_6__2__Impl rule__DataDecl__Group_6__3
            {
            pushFollow(FOLLOW_7);
            rule__DataDecl__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDecl__Group_6__3();

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
    // $ANTLR end "rule__DataDecl__Group_6__2"


    // $ANTLR start "rule__DataDecl__Group_6__2__Impl"
    // InternalX21.g:2226:1: rule__DataDecl__Group_6__2__Impl : ( ':' ) ;
    public final void rule__DataDecl__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2230:1: ( ( ':' ) )
            // InternalX21.g:2231:1: ( ':' )
            {
            // InternalX21.g:2231:1: ( ':' )
            // InternalX21.g:2232:2: ':'
            {
             before(grammarAccess.getDataDeclAccess().getColonKeyword_6_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getColonKeyword_6_2()); 

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
    // $ANTLR end "rule__DataDecl__Group_6__2__Impl"


    // $ANTLR start "rule__DataDecl__Group_6__3"
    // InternalX21.g:2241:1: rule__DataDecl__Group_6__3 : rule__DataDecl__Group_6__3__Impl ;
    public final void rule__DataDecl__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2245:1: ( rule__DataDecl__Group_6__3__Impl )
            // InternalX21.g:2246:2: rule__DataDecl__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataDecl__Group_6__3__Impl();

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
    // $ANTLR end "rule__DataDecl__Group_6__3"


    // $ANTLR start "rule__DataDecl__Group_6__3__Impl"
    // InternalX21.g:2252:1: rule__DataDecl__Group_6__3__Impl : ( ( rule__DataDecl__TypesAssignment_6_3 ) ) ;
    public final void rule__DataDecl__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2256:1: ( ( ( rule__DataDecl__TypesAssignment_6_3 ) ) )
            // InternalX21.g:2257:1: ( ( rule__DataDecl__TypesAssignment_6_3 ) )
            {
            // InternalX21.g:2257:1: ( ( rule__DataDecl__TypesAssignment_6_3 ) )
            // InternalX21.g:2258:2: ( rule__DataDecl__TypesAssignment_6_3 )
            {
             before(grammarAccess.getDataDeclAccess().getTypesAssignment_6_3()); 
            // InternalX21.g:2259:2: ( rule__DataDecl__TypesAssignment_6_3 )
            // InternalX21.g:2259:3: rule__DataDecl__TypesAssignment_6_3
            {
            pushFollow(FOLLOW_2);
            rule__DataDecl__TypesAssignment_6_3();

            state._fsp--;


            }

             after(grammarAccess.getDataDeclAccess().getTypesAssignment_6_3()); 

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
    // $ANTLR end "rule__DataDecl__Group_6__3__Impl"


    // $ANTLR start "rule__PlusMinus__Group__0"
    // InternalX21.g:2268:1: rule__PlusMinus__Group__0 : rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1 ;
    public final void rule__PlusMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2272:1: ( rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1 )
            // InternalX21.g:2273:2: rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__PlusMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group__1();

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
    // $ANTLR end "rule__PlusMinus__Group__0"


    // $ANTLR start "rule__PlusMinus__Group__0__Impl"
    // InternalX21.g:2280:1: rule__PlusMinus__Group__0__Impl : ( ruleMulDiv ) ;
    public final void rule__PlusMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2284:1: ( ( ruleMulDiv ) )
            // InternalX21.g:2285:1: ( ruleMulDiv )
            {
            // InternalX21.g:2285:1: ( ruleMulDiv )
            // InternalX21.g:2286:2: ruleMulDiv
            {
             before(grammarAccess.getPlusMinusAccess().getMulDivParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMulDiv();

            state._fsp--;

             after(grammarAccess.getPlusMinusAccess().getMulDivParserRuleCall_0()); 

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
    // $ANTLR end "rule__PlusMinus__Group__0__Impl"


    // $ANTLR start "rule__PlusMinus__Group__1"
    // InternalX21.g:2295:1: rule__PlusMinus__Group__1 : rule__PlusMinus__Group__1__Impl ;
    public final void rule__PlusMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2299:1: ( rule__PlusMinus__Group__1__Impl )
            // InternalX21.g:2300:2: rule__PlusMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group__1__Impl();

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
    // $ANTLR end "rule__PlusMinus__Group__1"


    // $ANTLR start "rule__PlusMinus__Group__1__Impl"
    // InternalX21.g:2306:1: rule__PlusMinus__Group__1__Impl : ( ( rule__PlusMinus__Group_1__0 )* ) ;
    public final void rule__PlusMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2310:1: ( ( ( rule__PlusMinus__Group_1__0 )* ) )
            // InternalX21.g:2311:1: ( ( rule__PlusMinus__Group_1__0 )* )
            {
            // InternalX21.g:2311:1: ( ( rule__PlusMinus__Group_1__0 )* )
            // InternalX21.g:2312:2: ( rule__PlusMinus__Group_1__0 )*
            {
             before(grammarAccess.getPlusMinusAccess().getGroup_1()); 
            // InternalX21.g:2313:2: ( rule__PlusMinus__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=34 && LA16_0<=35)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalX21.g:2313:3: rule__PlusMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__PlusMinus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getPlusMinusAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PlusMinus__Group__1__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1__0"
    // InternalX21.g:2322:1: rule__PlusMinus__Group_1__0 : rule__PlusMinus__Group_1__0__Impl rule__PlusMinus__Group_1__1 ;
    public final void rule__PlusMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2326:1: ( rule__PlusMinus__Group_1__0__Impl rule__PlusMinus__Group_1__1 )
            // InternalX21.g:2327:2: rule__PlusMinus__Group_1__0__Impl rule__PlusMinus__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__PlusMinus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1__1();

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
    // $ANTLR end "rule__PlusMinus__Group_1__0"


    // $ANTLR start "rule__PlusMinus__Group_1__0__Impl"
    // InternalX21.g:2334:1: rule__PlusMinus__Group_1__0__Impl : ( ( rule__PlusMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2338:1: ( ( ( rule__PlusMinus__Alternatives_1_0 ) ) )
            // InternalX21.g:2339:1: ( ( rule__PlusMinus__Alternatives_1_0 ) )
            {
            // InternalX21.g:2339:1: ( ( rule__PlusMinus__Alternatives_1_0 ) )
            // InternalX21.g:2340:2: ( rule__PlusMinus__Alternatives_1_0 )
            {
             before(grammarAccess.getPlusMinusAccess().getAlternatives_1_0()); 
            // InternalX21.g:2341:2: ( rule__PlusMinus__Alternatives_1_0 )
            // InternalX21.g:2341:3: rule__PlusMinus__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__PlusMinus__Group_1__0__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1__1"
    // InternalX21.g:2349:1: rule__PlusMinus__Group_1__1 : rule__PlusMinus__Group_1__1__Impl ;
    public final void rule__PlusMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2353:1: ( rule__PlusMinus__Group_1__1__Impl )
            // InternalX21.g:2354:2: rule__PlusMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1__1__Impl();

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
    // $ANTLR end "rule__PlusMinus__Group_1__1"


    // $ANTLR start "rule__PlusMinus__Group_1__1__Impl"
    // InternalX21.g:2360:1: rule__PlusMinus__Group_1__1__Impl : ( ( rule__PlusMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2364:1: ( ( ( rule__PlusMinus__RightAssignment_1_1 ) ) )
            // InternalX21.g:2365:1: ( ( rule__PlusMinus__RightAssignment_1_1 ) )
            {
            // InternalX21.g:2365:1: ( ( rule__PlusMinus__RightAssignment_1_1 ) )
            // InternalX21.g:2366:2: ( rule__PlusMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusMinusAccess().getRightAssignment_1_1()); 
            // InternalX21.g:2367:2: ( rule__PlusMinus__RightAssignment_1_1 )
            // InternalX21.g:2367:3: rule__PlusMinus__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__PlusMinus__Group_1__1__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_0_0__0"
    // InternalX21.g:2376:1: rule__PlusMinus__Group_1_0_0__0 : rule__PlusMinus__Group_1_0_0__0__Impl rule__PlusMinus__Group_1_0_0__1 ;
    public final void rule__PlusMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2380:1: ( rule__PlusMinus__Group_1_0_0__0__Impl rule__PlusMinus__Group_1_0_0__1 )
            // InternalX21.g:2381:2: rule__PlusMinus__Group_1_0_0__0__Impl rule__PlusMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_24);
            rule__PlusMinus__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_0_0__1();

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
    // $ANTLR end "rule__PlusMinus__Group_1_0_0__0"


    // $ANTLR start "rule__PlusMinus__Group_1_0_0__0__Impl"
    // InternalX21.g:2388:1: rule__PlusMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2392:1: ( ( () ) )
            // InternalX21.g:2393:1: ( () )
            {
            // InternalX21.g:2393:1: ( () )
            // InternalX21.g:2394:2: ()
            {
             before(grammarAccess.getPlusMinusAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalX21.g:2395:2: ()
            // InternalX21.g:2395:3: 
            {
            }

             after(grammarAccess.getPlusMinusAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_0_0__1"
    // InternalX21.g:2403:1: rule__PlusMinus__Group_1_0_0__1 : rule__PlusMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2407:1: ( rule__PlusMinus__Group_1_0_0__1__Impl )
            // InternalX21.g:2408:2: rule__PlusMinus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__PlusMinus__Group_1_0_0__1"


    // $ANTLR start "rule__PlusMinus__Group_1_0_0__1__Impl"
    // InternalX21.g:2414:1: rule__PlusMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2418:1: ( ( '+' ) )
            // InternalX21.g:2419:1: ( '+' )
            {
            // InternalX21.g:2419:1: ( '+' )
            // InternalX21.g:2420:2: '+'
            {
             before(grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_0_1()); 

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
    // $ANTLR end "rule__PlusMinus__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_0_1__0"
    // InternalX21.g:2430:1: rule__PlusMinus__Group_1_0_1__0 : rule__PlusMinus__Group_1_0_1__0__Impl rule__PlusMinus__Group_1_0_1__1 ;
    public final void rule__PlusMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2434:1: ( rule__PlusMinus__Group_1_0_1__0__Impl rule__PlusMinus__Group_1_0_1__1 )
            // InternalX21.g:2435:2: rule__PlusMinus__Group_1_0_1__0__Impl rule__PlusMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_22);
            rule__PlusMinus__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_0_1__1();

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
    // $ANTLR end "rule__PlusMinus__Group_1_0_1__0"


    // $ANTLR start "rule__PlusMinus__Group_1_0_1__0__Impl"
    // InternalX21.g:2442:1: rule__PlusMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2446:1: ( ( () ) )
            // InternalX21.g:2447:1: ( () )
            {
            // InternalX21.g:2447:1: ( () )
            // InternalX21.g:2448:2: ()
            {
             before(grammarAccess.getPlusMinusAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalX21.g:2449:2: ()
            // InternalX21.g:2449:3: 
            {
            }

             after(grammarAccess.getPlusMinusAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_0_1__1"
    // InternalX21.g:2457:1: rule__PlusMinus__Group_1_0_1__1 : rule__PlusMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2461:1: ( rule__PlusMinus__Group_1_0_1__1__Impl )
            // InternalX21.g:2462:2: rule__PlusMinus__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__PlusMinus__Group_1_0_1__1"


    // $ANTLR start "rule__PlusMinus__Group_1_0_1__1__Impl"
    // InternalX21.g:2468:1: rule__PlusMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2472:1: ( ( '-' ) )
            // InternalX21.g:2473:1: ( '-' )
            {
            // InternalX21.g:2473:1: ( '-' )
            // InternalX21.g:2474:2: '-'
            {
             before(grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 

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
    // $ANTLR end "rule__PlusMinus__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__MulDiv__Group__0"
    // InternalX21.g:2484:1: rule__MulDiv__Group__0 : rule__MulDiv__Group__0__Impl rule__MulDiv__Group__1 ;
    public final void rule__MulDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2488:1: ( rule__MulDiv__Group__0__Impl rule__MulDiv__Group__1 )
            // InternalX21.g:2489:2: rule__MulDiv__Group__0__Impl rule__MulDiv__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__MulDiv__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulDiv__Group__1();

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
    // $ANTLR end "rule__MulDiv__Group__0"


    // $ANTLR start "rule__MulDiv__Group__0__Impl"
    // InternalX21.g:2496:1: rule__MulDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2500:1: ( ( rulePrimary ) )
            // InternalX21.g:2501:1: ( rulePrimary )
            {
            // InternalX21.g:2501:1: ( rulePrimary )
            // InternalX21.g:2502:2: rulePrimary
            {
             before(grammarAccess.getMulDivAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMulDivAccess().getPrimaryParserRuleCall_0()); 

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
    // $ANTLR end "rule__MulDiv__Group__0__Impl"


    // $ANTLR start "rule__MulDiv__Group__1"
    // InternalX21.g:2511:1: rule__MulDiv__Group__1 : rule__MulDiv__Group__1__Impl ;
    public final void rule__MulDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2515:1: ( rule__MulDiv__Group__1__Impl )
            // InternalX21.g:2516:2: rule__MulDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulDiv__Group__1__Impl();

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
    // $ANTLR end "rule__MulDiv__Group__1"


    // $ANTLR start "rule__MulDiv__Group__1__Impl"
    // InternalX21.g:2522:1: rule__MulDiv__Group__1__Impl : ( ( rule__MulDiv__Group_1__0 )* ) ;
    public final void rule__MulDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2526:1: ( ( ( rule__MulDiv__Group_1__0 )* ) )
            // InternalX21.g:2527:1: ( ( rule__MulDiv__Group_1__0 )* )
            {
            // InternalX21.g:2527:1: ( ( rule__MulDiv__Group_1__0 )* )
            // InternalX21.g:2528:2: ( rule__MulDiv__Group_1__0 )*
            {
             before(grammarAccess.getMulDivAccess().getGroup_1()); 
            // InternalX21.g:2529:2: ( rule__MulDiv__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=36 && LA17_0<=37)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalX21.g:2529:3: rule__MulDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__MulDiv__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getMulDivAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MulDiv__Group__1__Impl"


    // $ANTLR start "rule__MulDiv__Group_1__0"
    // InternalX21.g:2538:1: rule__MulDiv__Group_1__0 : rule__MulDiv__Group_1__0__Impl rule__MulDiv__Group_1__1 ;
    public final void rule__MulDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2542:1: ( rule__MulDiv__Group_1__0__Impl rule__MulDiv__Group_1__1 )
            // InternalX21.g:2543:2: rule__MulDiv__Group_1__0__Impl rule__MulDiv__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__MulDiv__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulDiv__Group_1__1();

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
    // $ANTLR end "rule__MulDiv__Group_1__0"


    // $ANTLR start "rule__MulDiv__Group_1__0__Impl"
    // InternalX21.g:2550:1: rule__MulDiv__Group_1__0__Impl : ( ( rule__MulDiv__Alternatives_1_0 ) ) ;
    public final void rule__MulDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2554:1: ( ( ( rule__MulDiv__Alternatives_1_0 ) ) )
            // InternalX21.g:2555:1: ( ( rule__MulDiv__Alternatives_1_0 ) )
            {
            // InternalX21.g:2555:1: ( ( rule__MulDiv__Alternatives_1_0 ) )
            // InternalX21.g:2556:2: ( rule__MulDiv__Alternatives_1_0 )
            {
             before(grammarAccess.getMulDivAccess().getAlternatives_1_0()); 
            // InternalX21.g:2557:2: ( rule__MulDiv__Alternatives_1_0 )
            // InternalX21.g:2557:3: rule__MulDiv__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MulDiv__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMulDivAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__MulDiv__Group_1__0__Impl"


    // $ANTLR start "rule__MulDiv__Group_1__1"
    // InternalX21.g:2565:1: rule__MulDiv__Group_1__1 : rule__MulDiv__Group_1__1__Impl ;
    public final void rule__MulDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2569:1: ( rule__MulDiv__Group_1__1__Impl )
            // InternalX21.g:2570:2: rule__MulDiv__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulDiv__Group_1__1__Impl();

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
    // $ANTLR end "rule__MulDiv__Group_1__1"


    // $ANTLR start "rule__MulDiv__Group_1__1__Impl"
    // InternalX21.g:2576:1: rule__MulDiv__Group_1__1__Impl : ( ( rule__MulDiv__RightAssignment_1_1 ) ) ;
    public final void rule__MulDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2580:1: ( ( ( rule__MulDiv__RightAssignment_1_1 ) ) )
            // InternalX21.g:2581:1: ( ( rule__MulDiv__RightAssignment_1_1 ) )
            {
            // InternalX21.g:2581:1: ( ( rule__MulDiv__RightAssignment_1_1 ) )
            // InternalX21.g:2582:2: ( rule__MulDiv__RightAssignment_1_1 )
            {
             before(grammarAccess.getMulDivAccess().getRightAssignment_1_1()); 
            // InternalX21.g:2583:2: ( rule__MulDiv__RightAssignment_1_1 )
            // InternalX21.g:2583:3: rule__MulDiv__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MulDiv__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMulDivAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__MulDiv__Group_1__1__Impl"


    // $ANTLR start "rule__MulDiv__Group_1_0_0__0"
    // InternalX21.g:2592:1: rule__MulDiv__Group_1_0_0__0 : rule__MulDiv__Group_1_0_0__0__Impl rule__MulDiv__Group_1_0_0__1 ;
    public final void rule__MulDiv__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2596:1: ( rule__MulDiv__Group_1_0_0__0__Impl rule__MulDiv__Group_1_0_0__1 )
            // InternalX21.g:2597:2: rule__MulDiv__Group_1_0_0__0__Impl rule__MulDiv__Group_1_0_0__1
            {
            pushFollow(FOLLOW_27);
            rule__MulDiv__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulDiv__Group_1_0_0__1();

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
    // $ANTLR end "rule__MulDiv__Group_1_0_0__0"


    // $ANTLR start "rule__MulDiv__Group_1_0_0__0__Impl"
    // InternalX21.g:2604:1: rule__MulDiv__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MulDiv__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2608:1: ( ( () ) )
            // InternalX21.g:2609:1: ( () )
            {
            // InternalX21.g:2609:1: ( () )
            // InternalX21.g:2610:2: ()
            {
             before(grammarAccess.getMulDivAccess().getMultLeftAction_1_0_0_0()); 
            // InternalX21.g:2611:2: ()
            // InternalX21.g:2611:3: 
            {
            }

             after(grammarAccess.getMulDivAccess().getMultLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__MulDiv__Group_1_0_0__1"
    // InternalX21.g:2619:1: rule__MulDiv__Group_1_0_0__1 : rule__MulDiv__Group_1_0_0__1__Impl ;
    public final void rule__MulDiv__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2623:1: ( rule__MulDiv__Group_1_0_0__1__Impl )
            // InternalX21.g:2624:2: rule__MulDiv__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulDiv__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__MulDiv__Group_1_0_0__1"


    // $ANTLR start "rule__MulDiv__Group_1_0_0__1__Impl"
    // InternalX21.g:2630:1: rule__MulDiv__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__MulDiv__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2634:1: ( ( '*' ) )
            // InternalX21.g:2635:1: ( '*' )
            {
            // InternalX21.g:2635:1: ( '*' )
            // InternalX21.g:2636:2: '*'
            {
             before(grammarAccess.getMulDivAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMulDivAccess().getAsteriskKeyword_1_0_0_1()); 

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
    // $ANTLR end "rule__MulDiv__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__MulDiv__Group_1_0_1__0"
    // InternalX21.g:2646:1: rule__MulDiv__Group_1_0_1__0 : rule__MulDiv__Group_1_0_1__0__Impl rule__MulDiv__Group_1_0_1__1 ;
    public final void rule__MulDiv__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2650:1: ( rule__MulDiv__Group_1_0_1__0__Impl rule__MulDiv__Group_1_0_1__1 )
            // InternalX21.g:2651:2: rule__MulDiv__Group_1_0_1__0__Impl rule__MulDiv__Group_1_0_1__1
            {
            pushFollow(FOLLOW_25);
            rule__MulDiv__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulDiv__Group_1_0_1__1();

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
    // $ANTLR end "rule__MulDiv__Group_1_0_1__0"


    // $ANTLR start "rule__MulDiv__Group_1_0_1__0__Impl"
    // InternalX21.g:2658:1: rule__MulDiv__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__MulDiv__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2662:1: ( ( () ) )
            // InternalX21.g:2663:1: ( () )
            {
            // InternalX21.g:2663:1: ( () )
            // InternalX21.g:2664:2: ()
            {
             before(grammarAccess.getMulDivAccess().getDivLeftAction_1_0_1_0()); 
            // InternalX21.g:2665:2: ()
            // InternalX21.g:2665:3: 
            {
            }

             after(grammarAccess.getMulDivAccess().getDivLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulDiv__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__MulDiv__Group_1_0_1__1"
    // InternalX21.g:2673:1: rule__MulDiv__Group_1_0_1__1 : rule__MulDiv__Group_1_0_1__1__Impl ;
    public final void rule__MulDiv__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2677:1: ( rule__MulDiv__Group_1_0_1__1__Impl )
            // InternalX21.g:2678:2: rule__MulDiv__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulDiv__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__MulDiv__Group_1_0_1__1"


    // $ANTLR start "rule__MulDiv__Group_1_0_1__1__Impl"
    // InternalX21.g:2684:1: rule__MulDiv__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__MulDiv__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2688:1: ( ( '/' ) )
            // InternalX21.g:2689:1: ( '/' )
            {
            // InternalX21.g:2689:1: ( '/' )
            // InternalX21.g:2690:2: '/'
            {
             before(grammarAccess.getMulDivAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMulDivAccess().getSolidusKeyword_1_0_1_1()); 

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
    // $ANTLR end "rule__MulDiv__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalX21.g:2700:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2704:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalX21.g:2705:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

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
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalX21.g:2712:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2716:1: ( ( () ) )
            // InternalX21.g:2717:1: ( () )
            {
            // InternalX21.g:2717:1: ( () )
            // InternalX21.g:2718:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getParenthesisAction_1_0()); 
            // InternalX21.g:2719:2: ()
            // InternalX21.g:2719:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getParenthesisAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalX21.g:2727:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2731:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalX21.g:2732:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2();

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
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalX21.g:2739:1: rule__Primary__Group_1__1__Impl : ( '(' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2743:1: ( ( '(' ) )
            // InternalX21.g:2744:1: ( '(' )
            {
            // InternalX21.g:2744:1: ( '(' )
            // InternalX21.g:2745:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_1()); 

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
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // InternalX21.g:2754:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl rule__Primary__Group_1__3 ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2758:1: ( rule__Primary__Group_1__2__Impl rule__Primary__Group_1__3 )
            // InternalX21.g:2759:2: rule__Primary__Group_1__2__Impl rule__Primary__Group_1__3
            {
            pushFollow(FOLLOW_9);
            rule__Primary__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__3();

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
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // InternalX21.g:2766:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2770:1: ( ( ( rule__Primary__ExpressionAssignment_1_2 ) ) )
            // InternalX21.g:2771:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            {
            // InternalX21.g:2771:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            // InternalX21.g:2772:2: ( rule__Primary__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            // InternalX21.g:2773:2: ( rule__Primary__ExpressionAssignment_1_2 )
            // InternalX21.g:2773:3: rule__Primary__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 

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
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_1__3"
    // InternalX21.g:2781:1: rule__Primary__Group_1__3 : rule__Primary__Group_1__3__Impl ;
    public final void rule__Primary__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2785:1: ( rule__Primary__Group_1__3__Impl )
            // InternalX21.g:2786:2: rule__Primary__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__3__Impl();

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
    // $ANTLR end "rule__Primary__Group_1__3"


    // $ANTLR start "rule__Primary__Group_1__3__Impl"
    // InternalX21.g:2792:1: rule__Primary__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Primary__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2796:1: ( ( ')' ) )
            // InternalX21.g:2797:1: ( ')' )
            {
            // InternalX21.g:2797:1: ( ')' )
            // InternalX21.g:2798:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_3()); 

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
    // $ANTLR end "rule__Primary__Group_1__3__Impl"


    // $ANTLR start "rule__Atomic__Group_0__0"
    // InternalX21.g:2808:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2812:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalX21.g:2813:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_28);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__1();

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
    // $ANTLR end "rule__Atomic__Group_0__0"


    // $ANTLR start "rule__Atomic__Group_0__0__Impl"
    // InternalX21.g:2820:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2824:1: ( ( () ) )
            // InternalX21.g:2825:1: ( () )
            {
            // InternalX21.g:2825:1: ( () )
            // InternalX21.g:2826:2: ()
            {
             before(grammarAccess.getAtomicAccess().getIntValueAction_0_0()); 
            // InternalX21.g:2827:2: ()
            // InternalX21.g:2827:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getIntValueAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0__Impl"


    // $ANTLR start "rule__Atomic__Group_0__1"
    // InternalX21.g:2835:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2839:1: ( rule__Atomic__Group_0__1__Impl )
            // InternalX21.g:2840:2: rule__Atomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_0__1"


    // $ANTLR start "rule__Atomic__Group_0__1__Impl"
    // InternalX21.g:2846:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2850:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // InternalX21.g:2851:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // InternalX21.g:2851:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // InternalX21.g:2852:2: ( rule__Atomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            // InternalX21.g:2853:2: ( rule__Atomic__ValueAssignment_0_1 )
            // InternalX21.g:2853:3: rule__Atomic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__Atomic__Group_0__1__Impl"


    // $ANTLR start "rule__Atomic__Group_2__0"
    // InternalX21.g:2862:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2866:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // InternalX21.g:2867:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_29);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__1();

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
    // $ANTLR end "rule__Atomic__Group_2__0"


    // $ANTLR start "rule__Atomic__Group_2__0__Impl"
    // InternalX21.g:2874:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2878:1: ( ( () ) )
            // InternalX21.g:2879:1: ( () )
            {
            // InternalX21.g:2879:1: ( () )
            // InternalX21.g:2880:2: ()
            {
             before(grammarAccess.getAtomicAccess().getNoneAction_2_0()); 
            // InternalX21.g:2881:2: ()
            // InternalX21.g:2881:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getNoneAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0__Impl"


    // $ANTLR start "rule__Atomic__Group_2__1"
    // InternalX21.g:2889:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2893:1: ( rule__Atomic__Group_2__1__Impl )
            // InternalX21.g:2894:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_2__1"


    // $ANTLR start "rule__Atomic__Group_2__1__Impl"
    // InternalX21.g:2900:1: rule__Atomic__Group_2__1__Impl : ( 'none' ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2904:1: ( ( 'none' ) )
            // InternalX21.g:2905:1: ( 'none' )
            {
            // InternalX21.g:2905:1: ( 'none' )
            // InternalX21.g:2906:2: 'none'
            {
             before(grammarAccess.getAtomicAccess().getNoneKeyword_2_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getNoneKeyword_2_1()); 

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
    // $ANTLR end "rule__Atomic__Group_2__1__Impl"


    // $ANTLR start "rule__LetBinding__Group__0"
    // InternalX21.g:2916:1: rule__LetBinding__Group__0 : rule__LetBinding__Group__0__Impl rule__LetBinding__Group__1 ;
    public final void rule__LetBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2920:1: ( rule__LetBinding__Group__0__Impl rule__LetBinding__Group__1 )
            // InternalX21.g:2921:2: rule__LetBinding__Group__0__Impl rule__LetBinding__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__LetBinding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__1();

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
    // $ANTLR end "rule__LetBinding__Group__0"


    // $ANTLR start "rule__LetBinding__Group__0__Impl"
    // InternalX21.g:2928:1: rule__LetBinding__Group__0__Impl : ( 'let' ) ;
    public final void rule__LetBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2932:1: ( ( 'let' ) )
            // InternalX21.g:2933:1: ( 'let' )
            {
            // InternalX21.g:2933:1: ( 'let' )
            // InternalX21.g:2934:2: 'let'
            {
             before(grammarAccess.getLetBindingAccess().getLetKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLetBindingAccess().getLetKeyword_0()); 

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
    // $ANTLR end "rule__LetBinding__Group__0__Impl"


    // $ANTLR start "rule__LetBinding__Group__1"
    // InternalX21.g:2943:1: rule__LetBinding__Group__1 : rule__LetBinding__Group__1__Impl rule__LetBinding__Group__2 ;
    public final void rule__LetBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2947:1: ( rule__LetBinding__Group__1__Impl rule__LetBinding__Group__2 )
            // InternalX21.g:2948:2: rule__LetBinding__Group__1__Impl rule__LetBinding__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__LetBinding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__2();

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
    // $ANTLR end "rule__LetBinding__Group__1"


    // $ANTLR start "rule__LetBinding__Group__1__Impl"
    // InternalX21.g:2955:1: rule__LetBinding__Group__1__Impl : ( ( rule__LetBinding__NameAssignment_1 ) ) ;
    public final void rule__LetBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2959:1: ( ( ( rule__LetBinding__NameAssignment_1 ) ) )
            // InternalX21.g:2960:1: ( ( rule__LetBinding__NameAssignment_1 ) )
            {
            // InternalX21.g:2960:1: ( ( rule__LetBinding__NameAssignment_1 ) )
            // InternalX21.g:2961:2: ( rule__LetBinding__NameAssignment_1 )
            {
             before(grammarAccess.getLetBindingAccess().getNameAssignment_1()); 
            // InternalX21.g:2962:2: ( rule__LetBinding__NameAssignment_1 )
            // InternalX21.g:2962:3: rule__LetBinding__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LetBinding__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLetBindingAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__LetBinding__Group__1__Impl"


    // $ANTLR start "rule__LetBinding__Group__2"
    // InternalX21.g:2970:1: rule__LetBinding__Group__2 : rule__LetBinding__Group__2__Impl rule__LetBinding__Group__3 ;
    public final void rule__LetBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2974:1: ( rule__LetBinding__Group__2__Impl rule__LetBinding__Group__3 )
            // InternalX21.g:2975:2: rule__LetBinding__Group__2__Impl rule__LetBinding__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__LetBinding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__3();

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
    // $ANTLR end "rule__LetBinding__Group__2"


    // $ANTLR start "rule__LetBinding__Group__2__Impl"
    // InternalX21.g:2982:1: rule__LetBinding__Group__2__Impl : ( '=' ) ;
    public final void rule__LetBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2986:1: ( ( '=' ) )
            // InternalX21.g:2987:1: ( '=' )
            {
            // InternalX21.g:2987:1: ( '=' )
            // InternalX21.g:2988:2: '='
            {
             before(grammarAccess.getLetBindingAccess().getEqualsSignKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLetBindingAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__LetBinding__Group__2__Impl"


    // $ANTLR start "rule__LetBinding__Group__3"
    // InternalX21.g:2997:1: rule__LetBinding__Group__3 : rule__LetBinding__Group__3__Impl rule__LetBinding__Group__4 ;
    public final void rule__LetBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3001:1: ( rule__LetBinding__Group__3__Impl rule__LetBinding__Group__4 )
            // InternalX21.g:3002:2: rule__LetBinding__Group__3__Impl rule__LetBinding__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__LetBinding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__4();

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
    // $ANTLR end "rule__LetBinding__Group__3"


    // $ANTLR start "rule__LetBinding__Group__3__Impl"
    // InternalX21.g:3009:1: rule__LetBinding__Group__3__Impl : ( ( rule__LetBinding__BindingAssignment_3 ) ) ;
    public final void rule__LetBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3013:1: ( ( ( rule__LetBinding__BindingAssignment_3 ) ) )
            // InternalX21.g:3014:1: ( ( rule__LetBinding__BindingAssignment_3 ) )
            {
            // InternalX21.g:3014:1: ( ( rule__LetBinding__BindingAssignment_3 ) )
            // InternalX21.g:3015:2: ( rule__LetBinding__BindingAssignment_3 )
            {
             before(grammarAccess.getLetBindingAccess().getBindingAssignment_3()); 
            // InternalX21.g:3016:2: ( rule__LetBinding__BindingAssignment_3 )
            // InternalX21.g:3016:3: rule__LetBinding__BindingAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LetBinding__BindingAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLetBindingAccess().getBindingAssignment_3()); 

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
    // $ANTLR end "rule__LetBinding__Group__3__Impl"


    // $ANTLR start "rule__LetBinding__Group__4"
    // InternalX21.g:3024:1: rule__LetBinding__Group__4 : rule__LetBinding__Group__4__Impl rule__LetBinding__Group__5 ;
    public final void rule__LetBinding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3028:1: ( rule__LetBinding__Group__4__Impl rule__LetBinding__Group__5 )
            // InternalX21.g:3029:2: rule__LetBinding__Group__4__Impl rule__LetBinding__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__LetBinding__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__5();

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
    // $ANTLR end "rule__LetBinding__Group__4"


    // $ANTLR start "rule__LetBinding__Group__4__Impl"
    // InternalX21.g:3036:1: rule__LetBinding__Group__4__Impl : ( 'in' ) ;
    public final void rule__LetBinding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3040:1: ( ( 'in' ) )
            // InternalX21.g:3041:1: ( 'in' )
            {
            // InternalX21.g:3041:1: ( 'in' )
            // InternalX21.g:3042:2: 'in'
            {
             before(grammarAccess.getLetBindingAccess().getInKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getLetBindingAccess().getInKeyword_4()); 

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
    // $ANTLR end "rule__LetBinding__Group__4__Impl"


    // $ANTLR start "rule__LetBinding__Group__5"
    // InternalX21.g:3051:1: rule__LetBinding__Group__5 : rule__LetBinding__Group__5__Impl rule__LetBinding__Group__6 ;
    public final void rule__LetBinding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3055:1: ( rule__LetBinding__Group__5__Impl rule__LetBinding__Group__6 )
            // InternalX21.g:3056:2: rule__LetBinding__Group__5__Impl rule__LetBinding__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__LetBinding__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__6();

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
    // $ANTLR end "rule__LetBinding__Group__5"


    // $ANTLR start "rule__LetBinding__Group__5__Impl"
    // InternalX21.g:3063:1: rule__LetBinding__Group__5__Impl : ( ( rule__LetBinding__BodyAssignment_5 ) ) ;
    public final void rule__LetBinding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3067:1: ( ( ( rule__LetBinding__BodyAssignment_5 ) ) )
            // InternalX21.g:3068:1: ( ( rule__LetBinding__BodyAssignment_5 ) )
            {
            // InternalX21.g:3068:1: ( ( rule__LetBinding__BodyAssignment_5 ) )
            // InternalX21.g:3069:2: ( rule__LetBinding__BodyAssignment_5 )
            {
             before(grammarAccess.getLetBindingAccess().getBodyAssignment_5()); 
            // InternalX21.g:3070:2: ( rule__LetBinding__BodyAssignment_5 )
            // InternalX21.g:3070:3: rule__LetBinding__BodyAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LetBinding__BodyAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLetBindingAccess().getBodyAssignment_5()); 

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
    // $ANTLR end "rule__LetBinding__Group__5__Impl"


    // $ANTLR start "rule__LetBinding__Group__6"
    // InternalX21.g:3078:1: rule__LetBinding__Group__6 : rule__LetBinding__Group__6__Impl ;
    public final void rule__LetBinding__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3082:1: ( rule__LetBinding__Group__6__Impl )
            // InternalX21.g:3083:2: rule__LetBinding__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LetBinding__Group__6__Impl();

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
    // $ANTLR end "rule__LetBinding__Group__6"


    // $ANTLR start "rule__LetBinding__Group__6__Impl"
    // InternalX21.g:3089:1: rule__LetBinding__Group__6__Impl : ( 'end' ) ;
    public final void rule__LetBinding__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3093:1: ( ( 'end' ) )
            // InternalX21.g:3094:1: ( 'end' )
            {
            // InternalX21.g:3094:1: ( 'end' )
            // InternalX21.g:3095:2: 'end'
            {
             before(grammarAccess.getLetBindingAccess().getEndKeyword_6()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getLetBindingAccess().getEndKeyword_6()); 

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
    // $ANTLR end "rule__LetBinding__Group__6__Impl"


    // $ANTLR start "rule__IfStatement__Group__0"
    // InternalX21.g:3105:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3109:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalX21.g:3110:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__IfStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__1();

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
    // $ANTLR end "rule__IfStatement__Group__0"


    // $ANTLR start "rule__IfStatement__Group__0__Impl"
    // InternalX21.g:3117:1: rule__IfStatement__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3121:1: ( ( 'if' ) )
            // InternalX21.g:3122:1: ( 'if' )
            {
            // InternalX21.g:3122:1: ( 'if' )
            // InternalX21.g:3123:2: 'if'
            {
             before(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 

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
    // $ANTLR end "rule__IfStatement__Group__0__Impl"


    // $ANTLR start "rule__IfStatement__Group__1"
    // InternalX21.g:3132:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3136:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalX21.g:3137:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__IfStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__2();

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
    // $ANTLR end "rule__IfStatement__Group__1"


    // $ANTLR start "rule__IfStatement__Group__1__Impl"
    // InternalX21.g:3144:1: rule__IfStatement__Group__1__Impl : ( ( rule__IfStatement__StatementAssignment_1 ) ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3148:1: ( ( ( rule__IfStatement__StatementAssignment_1 ) ) )
            // InternalX21.g:3149:1: ( ( rule__IfStatement__StatementAssignment_1 ) )
            {
            // InternalX21.g:3149:1: ( ( rule__IfStatement__StatementAssignment_1 ) )
            // InternalX21.g:3150:2: ( rule__IfStatement__StatementAssignment_1 )
            {
             before(grammarAccess.getIfStatementAccess().getStatementAssignment_1()); 
            // InternalX21.g:3151:2: ( rule__IfStatement__StatementAssignment_1 )
            // InternalX21.g:3151:3: rule__IfStatement__StatementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__StatementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getStatementAssignment_1()); 

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
    // $ANTLR end "rule__IfStatement__Group__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__2"
    // InternalX21.g:3159:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3163:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // InternalX21.g:3164:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__IfStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__3();

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
    // $ANTLR end "rule__IfStatement__Group__2"


    // $ANTLR start "rule__IfStatement__Group__2__Impl"
    // InternalX21.g:3171:1: rule__IfStatement__Group__2__Impl : ( 'then' ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3175:1: ( ( 'then' ) )
            // InternalX21.g:3176:1: ( 'then' )
            {
            // InternalX21.g:3176:1: ( 'then' )
            // InternalX21.g:3177:2: 'then'
            {
             before(grammarAccess.getIfStatementAccess().getThenKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getThenKeyword_2()); 

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
    // $ANTLR end "rule__IfStatement__Group__2__Impl"


    // $ANTLR start "rule__IfStatement__Group__3"
    // InternalX21.g:3186:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3190:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // InternalX21.g:3191:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__IfStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__4();

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
    // $ANTLR end "rule__IfStatement__Group__3"


    // $ANTLR start "rule__IfStatement__Group__3__Impl"
    // InternalX21.g:3198:1: rule__IfStatement__Group__3__Impl : ( ( rule__IfStatement__TrueExpressionAssignment_3 ) ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3202:1: ( ( ( rule__IfStatement__TrueExpressionAssignment_3 ) ) )
            // InternalX21.g:3203:1: ( ( rule__IfStatement__TrueExpressionAssignment_3 ) )
            {
            // InternalX21.g:3203:1: ( ( rule__IfStatement__TrueExpressionAssignment_3 ) )
            // InternalX21.g:3204:2: ( rule__IfStatement__TrueExpressionAssignment_3 )
            {
             before(grammarAccess.getIfStatementAccess().getTrueExpressionAssignment_3()); 
            // InternalX21.g:3205:2: ( rule__IfStatement__TrueExpressionAssignment_3 )
            // InternalX21.g:3205:3: rule__IfStatement__TrueExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__TrueExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getTrueExpressionAssignment_3()); 

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
    // $ANTLR end "rule__IfStatement__Group__3__Impl"


    // $ANTLR start "rule__IfStatement__Group__4"
    // InternalX21.g:3213:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3217:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // InternalX21.g:3218:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__IfStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__5();

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
    // $ANTLR end "rule__IfStatement__Group__4"


    // $ANTLR start "rule__IfStatement__Group__4__Impl"
    // InternalX21.g:3225:1: rule__IfStatement__Group__4__Impl : ( 'else' ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3229:1: ( ( 'else' ) )
            // InternalX21.g:3230:1: ( 'else' )
            {
            // InternalX21.g:3230:1: ( 'else' )
            // InternalX21.g:3231:2: 'else'
            {
             before(grammarAccess.getIfStatementAccess().getElseKeyword_4()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getElseKeyword_4()); 

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
    // $ANTLR end "rule__IfStatement__Group__4__Impl"


    // $ANTLR start "rule__IfStatement__Group__5"
    // InternalX21.g:3240:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3244:1: ( rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 )
            // InternalX21.g:3245:2: rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__IfStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__6();

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
    // $ANTLR end "rule__IfStatement__Group__5"


    // $ANTLR start "rule__IfStatement__Group__5__Impl"
    // InternalX21.g:3252:1: rule__IfStatement__Group__5__Impl : ( ( rule__IfStatement__FalseExpressionAssignment_5 ) ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3256:1: ( ( ( rule__IfStatement__FalseExpressionAssignment_5 ) ) )
            // InternalX21.g:3257:1: ( ( rule__IfStatement__FalseExpressionAssignment_5 ) )
            {
            // InternalX21.g:3257:1: ( ( rule__IfStatement__FalseExpressionAssignment_5 ) )
            // InternalX21.g:3258:2: ( rule__IfStatement__FalseExpressionAssignment_5 )
            {
             before(grammarAccess.getIfStatementAccess().getFalseExpressionAssignment_5()); 
            // InternalX21.g:3259:2: ( rule__IfStatement__FalseExpressionAssignment_5 )
            // InternalX21.g:3259:3: rule__IfStatement__FalseExpressionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__FalseExpressionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getFalseExpressionAssignment_5()); 

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
    // $ANTLR end "rule__IfStatement__Group__5__Impl"


    // $ANTLR start "rule__IfStatement__Group__6"
    // InternalX21.g:3267:1: rule__IfStatement__Group__6 : rule__IfStatement__Group__6__Impl ;
    public final void rule__IfStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3271:1: ( rule__IfStatement__Group__6__Impl )
            // InternalX21.g:3272:2: rule__IfStatement__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatement__Group__6__Impl();

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
    // $ANTLR end "rule__IfStatement__Group__6"


    // $ANTLR start "rule__IfStatement__Group__6__Impl"
    // InternalX21.g:3278:1: rule__IfStatement__Group__6__Impl : ( 'end' ) ;
    public final void rule__IfStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3282:1: ( ( 'end' ) )
            // InternalX21.g:3283:1: ( 'end' )
            {
            // InternalX21.g:3283:1: ( 'end' )
            // InternalX21.g:3284:2: 'end'
            {
             before(grammarAccess.getIfStatementAccess().getEndKeyword_6()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getEndKeyword_6()); 

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
    // $ANTLR end "rule__IfStatement__Group__6__Impl"


    // $ANTLR start "rule__LogicExp__Group__0"
    // InternalX21.g:3294:1: rule__LogicExp__Group__0 : rule__LogicExp__Group__0__Impl rule__LogicExp__Group__1 ;
    public final void rule__LogicExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3298:1: ( rule__LogicExp__Group__0__Impl rule__LogicExp__Group__1 )
            // InternalX21.g:3299:2: rule__LogicExp__Group__0__Impl rule__LogicExp__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__LogicExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicExp__Group__1();

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
    // $ANTLR end "rule__LogicExp__Group__0"


    // $ANTLR start "rule__LogicExp__Group__0__Impl"
    // InternalX21.g:3306:1: rule__LogicExp__Group__0__Impl : ( ( rule__LogicExp__LeftAssignment_0 ) ) ;
    public final void rule__LogicExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3310:1: ( ( ( rule__LogicExp__LeftAssignment_0 ) ) )
            // InternalX21.g:3311:1: ( ( rule__LogicExp__LeftAssignment_0 ) )
            {
            // InternalX21.g:3311:1: ( ( rule__LogicExp__LeftAssignment_0 ) )
            // InternalX21.g:3312:2: ( rule__LogicExp__LeftAssignment_0 )
            {
             before(grammarAccess.getLogicExpAccess().getLeftAssignment_0()); 
            // InternalX21.g:3313:2: ( rule__LogicExp__LeftAssignment_0 )
            // InternalX21.g:3313:3: rule__LogicExp__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LogicExp__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLogicExpAccess().getLeftAssignment_0()); 

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
    // $ANTLR end "rule__LogicExp__Group__0__Impl"


    // $ANTLR start "rule__LogicExp__Group__1"
    // InternalX21.g:3321:1: rule__LogicExp__Group__1 : rule__LogicExp__Group__1__Impl rule__LogicExp__Group__2 ;
    public final void rule__LogicExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3325:1: ( rule__LogicExp__Group__1__Impl rule__LogicExp__Group__2 )
            // InternalX21.g:3326:2: rule__LogicExp__Group__1__Impl rule__LogicExp__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__LogicExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogicExp__Group__2();

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
    // $ANTLR end "rule__LogicExp__Group__1"


    // $ANTLR start "rule__LogicExp__Group__1__Impl"
    // InternalX21.g:3333:1: rule__LogicExp__Group__1__Impl : ( ( rule__LogicExp__OperatorAssignment_1 ) ) ;
    public final void rule__LogicExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3337:1: ( ( ( rule__LogicExp__OperatorAssignment_1 ) ) )
            // InternalX21.g:3338:1: ( ( rule__LogicExp__OperatorAssignment_1 ) )
            {
            // InternalX21.g:3338:1: ( ( rule__LogicExp__OperatorAssignment_1 ) )
            // InternalX21.g:3339:2: ( rule__LogicExp__OperatorAssignment_1 )
            {
             before(grammarAccess.getLogicExpAccess().getOperatorAssignment_1()); 
            // InternalX21.g:3340:2: ( rule__LogicExp__OperatorAssignment_1 )
            // InternalX21.g:3340:3: rule__LogicExp__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LogicExp__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLogicExpAccess().getOperatorAssignment_1()); 

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
    // $ANTLR end "rule__LogicExp__Group__1__Impl"


    // $ANTLR start "rule__LogicExp__Group__2"
    // InternalX21.g:3348:1: rule__LogicExp__Group__2 : rule__LogicExp__Group__2__Impl ;
    public final void rule__LogicExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3352:1: ( rule__LogicExp__Group__2__Impl )
            // InternalX21.g:3353:2: rule__LogicExp__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogicExp__Group__2__Impl();

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
    // $ANTLR end "rule__LogicExp__Group__2"


    // $ANTLR start "rule__LogicExp__Group__2__Impl"
    // InternalX21.g:3359:1: rule__LogicExp__Group__2__Impl : ( ( rule__LogicExp__RightAssignment_2 ) ) ;
    public final void rule__LogicExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3363:1: ( ( ( rule__LogicExp__RightAssignment_2 ) ) )
            // InternalX21.g:3364:1: ( ( rule__LogicExp__RightAssignment_2 ) )
            {
            // InternalX21.g:3364:1: ( ( rule__LogicExp__RightAssignment_2 ) )
            // InternalX21.g:3365:2: ( rule__LogicExp__RightAssignment_2 )
            {
             before(grammarAccess.getLogicExpAccess().getRightAssignment_2()); 
            // InternalX21.g:3366:2: ( rule__LogicExp__RightAssignment_2 )
            // InternalX21.g:3366:3: rule__LogicExp__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LogicExp__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLogicExpAccess().getRightAssignment_2()); 

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
    // $ANTLR end "rule__LogicExp__Group__2__Impl"


    // $ANTLR start "rule__X21__NameAssignment_0"
    // InternalX21.g:3375:1: rule__X21__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__X21__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3379:1: ( ( RULE_ID ) )
            // InternalX21.g:3380:2: ( RULE_ID )
            {
            // InternalX21.g:3380:2: ( RULE_ID )
            // InternalX21.g:3381:3: RULE_ID
            {
             before(grammarAccess.getX21Access().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getX21Access().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__X21__NameAssignment_0"


    // $ANTLR start "rule__X21__DeclarationsAssignment_1"
    // InternalX21.g:3390:1: rule__X21__DeclarationsAssignment_1 : ( ruleDeclaration ) ;
    public final void rule__X21__DeclarationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3394:1: ( ( ruleDeclaration ) )
            // InternalX21.g:3395:2: ( ruleDeclaration )
            {
            // InternalX21.g:3395:2: ( ruleDeclaration )
            // InternalX21.g:3396:3: ruleDeclaration
            {
             before(grammarAccess.getX21Access().getDeclarationsDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getX21Access().getDeclarationsDeclarationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__X21__DeclarationsAssignment_1"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalX21.g:3405:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3409:1: ( ( RULE_ID ) )
            // InternalX21.g:3410:2: ( RULE_ID )
            {
            // InternalX21.g:3410:2: ( RULE_ID )
            // InternalX21.g:3411:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Parameter__TypeAssignment_3"
    // InternalX21.g:3420:1: rule__Parameter__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3424:1: ( ( ruleType ) )
            // InternalX21.g:3425:2: ( ruleType )
            {
            // InternalX21.g:3425:2: ( ruleType )
            // InternalX21.g:3426:3: ruleType
            {
             before(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Parameter__TypeAssignment_3"


    // $ANTLR start "rule__Function__NameAssignment_1"
    // InternalX21.g:3435:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3439:1: ( ( RULE_ID ) )
            // InternalX21.g:3440:2: ( RULE_ID )
            {
            // InternalX21.g:3440:2: ( RULE_ID )
            // InternalX21.g:3441:3: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Function__NameAssignment_1"


    // $ANTLR start "rule__Function__LambdaAssignment_2"
    // InternalX21.g:3450:1: rule__Function__LambdaAssignment_2 : ( ruleLambda ) ;
    public final void rule__Function__LambdaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3454:1: ( ( ruleLambda ) )
            // InternalX21.g:3455:2: ( ruleLambda )
            {
            // InternalX21.g:3455:2: ( ruleLambda )
            // InternalX21.g:3456:3: ruleLambda
            {
             before(grammarAccess.getFunctionAccess().getLambdaLambdaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLambda();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getLambdaLambdaParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Function__LambdaAssignment_2"


    // $ANTLR start "rule__Lambda__NameAssignment_1"
    // InternalX21.g:3465:1: rule__Lambda__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Lambda__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3469:1: ( ( RULE_ID ) )
            // InternalX21.g:3470:2: ( RULE_ID )
            {
            // InternalX21.g:3470:2: ( RULE_ID )
            // InternalX21.g:3471:3: RULE_ID
            {
             before(grammarAccess.getLambdaAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLambdaAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Lambda__NameAssignment_1"


    // $ANTLR start "rule__Lambda__TypeAssignment_3"
    // InternalX21.g:3480:1: rule__Lambda__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__Lambda__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3484:1: ( ( ruleType ) )
            // InternalX21.g:3485:2: ( ruleType )
            {
            // InternalX21.g:3485:2: ( ruleType )
            // InternalX21.g:3486:3: ruleType
            {
             before(grammarAccess.getLambdaAccess().getTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getLambdaAccess().getTypeTypeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Lambda__TypeAssignment_3"


    // $ANTLR start "rule__Lambda__ExpAssignment_6"
    // InternalX21.g:3495:1: rule__Lambda__ExpAssignment_6 : ( ruleExp ) ;
    public final void rule__Lambda__ExpAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3499:1: ( ( ruleExp ) )
            // InternalX21.g:3500:2: ( ruleExp )
            {
            // InternalX21.g:3500:2: ( ruleExp )
            // InternalX21.g:3501:3: ruleExp
            {
             before(grammarAccess.getLambdaAccess().getExpExpParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getLambdaAccess().getExpExpParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Lambda__ExpAssignment_6"


    // $ANTLR start "rule__Input__NameAssignment_1"
    // InternalX21.g:3510:1: rule__Input__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Input__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3514:1: ( ( RULE_ID ) )
            // InternalX21.g:3515:2: ( RULE_ID )
            {
            // InternalX21.g:3515:2: ( RULE_ID )
            // InternalX21.g:3516:3: RULE_ID
            {
             before(grammarAccess.getInputAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Input__NameAssignment_1"


    // $ANTLR start "rule__Input__TypeAssignment_3"
    // InternalX21.g:3525:1: rule__Input__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__Input__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3529:1: ( ( ruleType ) )
            // InternalX21.g:3530:2: ( ruleType )
            {
            // InternalX21.g:3530:2: ( ruleType )
            // InternalX21.g:3531:3: ruleType
            {
             before(grammarAccess.getInputAccess().getTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getInputAccess().getTypeTypeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Input__TypeAssignment_3"


    // $ANTLR start "rule__Node__NameAssignment_1"
    // InternalX21.g:3540:1: rule__Node__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3544:1: ( ( RULE_ID ) )
            // InternalX21.g:3545:2: ( RULE_ID )
            {
            // InternalX21.g:3545:2: ( RULE_ID )
            // InternalX21.g:3546:3: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Node__NameAssignment_1"


    // $ANTLR start "rule__Node__FunctionAssignment_3_0"
    // InternalX21.g:3555:1: rule__Node__FunctionAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__Node__FunctionAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3559:1: ( ( RULE_ID ) )
            // InternalX21.g:3560:2: ( RULE_ID )
            {
            // InternalX21.g:3560:2: ( RULE_ID )
            // InternalX21.g:3561:3: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getFunctionIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getFunctionIDTerminalRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Node__FunctionAssignment_3_0"


    // $ANTLR start "rule__Node__LambdaAssignment_3_1"
    // InternalX21.g:3570:1: rule__Node__LambdaAssignment_3_1 : ( ruleLambda ) ;
    public final void rule__Node__LambdaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3574:1: ( ( ruleLambda ) )
            // InternalX21.g:3575:2: ( ruleLambda )
            {
            // InternalX21.g:3575:2: ( ruleLambda )
            // InternalX21.g:3576:3: ruleLambda
            {
             before(grammarAccess.getNodeAccess().getLambdaLambdaParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLambda();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getLambdaLambdaParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Node__LambdaAssignment_3_1"


    // $ANTLR start "rule__Stream__NameAssignment_1"
    // InternalX21.g:3585:1: rule__Stream__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Stream__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3589:1: ( ( RULE_ID ) )
            // InternalX21.g:3590:2: ( RULE_ID )
            {
            // InternalX21.g:3590:2: ( RULE_ID )
            // InternalX21.g:3591:3: RULE_ID
            {
             before(grammarAccess.getStreamAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Stream__NameAssignment_1"


    // $ANTLR start "rule__Stream__InputsAssignment_2_1"
    // InternalX21.g:3600:1: rule__Stream__InputsAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Stream__InputsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3604:1: ( ( RULE_ID ) )
            // InternalX21.g:3605:2: ( RULE_ID )
            {
            // InternalX21.g:3605:2: ( RULE_ID )
            // InternalX21.g:3606:3: RULE_ID
            {
             before(grammarAccess.getStreamAccess().getInputsIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStreamAccess().getInputsIDTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Stream__InputsAssignment_2_1"


    // $ANTLR start "rule__Stream__ElementsAssignment_3_1"
    // InternalX21.g:3615:1: rule__Stream__ElementsAssignment_3_1 : ( ruleElement ) ;
    public final void rule__Stream__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3619:1: ( ( ruleElement ) )
            // InternalX21.g:3620:2: ( ruleElement )
            {
            // InternalX21.g:3620:2: ( ruleElement )
            // InternalX21.g:3621:3: ruleElement
            {
             before(grammarAccess.getStreamAccess().getElementsElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getStreamAccess().getElementsElementParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Stream__ElementsAssignment_3_1"


    // $ANTLR start "rule__Stream__ElementsAssignment_3_2_1"
    // InternalX21.g:3630:1: rule__Stream__ElementsAssignment_3_2_1 : ( ruleElement ) ;
    public final void rule__Stream__ElementsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3634:1: ( ( ruleElement ) )
            // InternalX21.g:3635:2: ( ruleElement )
            {
            // InternalX21.g:3635:2: ( ruleElement )
            // InternalX21.g:3636:3: ruleElement
            {
             before(grammarAccess.getStreamAccess().getElementsElementParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getStreamAccess().getElementsElementParserRuleCall_3_2_1_0()); 

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
    // $ANTLR end "rule__Stream__ElementsAssignment_3_2_1"


    // $ANTLR start "rule__Element__NodeNameAssignment_0"
    // InternalX21.g:3645:1: rule__Element__NodeNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Element__NodeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3649:1: ( ( RULE_ID ) )
            // InternalX21.g:3650:2: ( RULE_ID )
            {
            // InternalX21.g:3650:2: ( RULE_ID )
            // InternalX21.g:3651:3: RULE_ID
            {
             before(grammarAccess.getElementAccess().getNodeNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getNodeNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Element__NodeNameAssignment_0"


    // $ANTLR start "rule__Element__FunctionAssignment_1_1_0"
    // InternalX21.g:3660:1: rule__Element__FunctionAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__Element__FunctionAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3664:1: ( ( RULE_ID ) )
            // InternalX21.g:3665:2: ( RULE_ID )
            {
            // InternalX21.g:3665:2: ( RULE_ID )
            // InternalX21.g:3666:3: RULE_ID
            {
             before(grammarAccess.getElementAccess().getFunctionIDTerminalRuleCall_1_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getFunctionIDTerminalRuleCall_1_1_0_0()); 

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
    // $ANTLR end "rule__Element__FunctionAssignment_1_1_0"


    // $ANTLR start "rule__Element__LambdaAssignment_1_1_1"
    // InternalX21.g:3675:1: rule__Element__LambdaAssignment_1_1_1 : ( ruleLambda ) ;
    public final void rule__Element__LambdaAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3679:1: ( ( ruleLambda ) )
            // InternalX21.g:3680:2: ( ruleLambda )
            {
            // InternalX21.g:3680:2: ( ruleLambda )
            // InternalX21.g:3681:3: ruleLambda
            {
             before(grammarAccess.getElementAccess().getLambdaLambdaParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLambda();

            state._fsp--;

             after(grammarAccess.getElementAccess().getLambdaLambdaParserRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__Element__LambdaAssignment_1_1_1"


    // $ANTLR start "rule__Element__OutputNameAssignment_2_1"
    // InternalX21.g:3690:1: rule__Element__OutputNameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Element__OutputNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3694:1: ( ( RULE_ID ) )
            // InternalX21.g:3695:2: ( RULE_ID )
            {
            // InternalX21.g:3695:2: ( RULE_ID )
            // InternalX21.g:3696:3: RULE_ID
            {
             before(grammarAccess.getElementAccess().getOutputNameIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getOutputNameIDTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Element__OutputNameAssignment_2_1"


    // $ANTLR start "rule__DataDecl__NameAssignment_1"
    // InternalX21.g:3705:1: rule__DataDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3709:1: ( ( RULE_ID ) )
            // InternalX21.g:3710:2: ( RULE_ID )
            {
            // InternalX21.g:3710:2: ( RULE_ID )
            // InternalX21.g:3711:3: RULE_ID
            {
             before(grammarAccess.getDataDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DataDecl__NameAssignment_1"


    // $ANTLR start "rule__DataDecl__DeclNamesAssignment_3"
    // InternalX21.g:3720:1: rule__DataDecl__DeclNamesAssignment_3 : ( RULE_ID ) ;
    public final void rule__DataDecl__DeclNamesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3724:1: ( ( RULE_ID ) )
            // InternalX21.g:3725:2: ( RULE_ID )
            {
            // InternalX21.g:3725:2: ( RULE_ID )
            // InternalX21.g:3726:3: RULE_ID
            {
             before(grammarAccess.getDataDeclAccess().getDeclNamesIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getDeclNamesIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__DataDecl__DeclNamesAssignment_3"


    // $ANTLR start "rule__DataDecl__TypesAssignment_5"
    // InternalX21.g:3735:1: rule__DataDecl__TypesAssignment_5 : ( ruleType ) ;
    public final void rule__DataDecl__TypesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3739:1: ( ( ruleType ) )
            // InternalX21.g:3740:2: ( ruleType )
            {
            // InternalX21.g:3740:2: ( ruleType )
            // InternalX21.g:3741:3: ruleType
            {
             before(grammarAccess.getDataDeclAccess().getTypesTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDataDeclAccess().getTypesTypeParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__DataDecl__TypesAssignment_5"


    // $ANTLR start "rule__DataDecl__DeclNamesAssignment_6_1"
    // InternalX21.g:3750:1: rule__DataDecl__DeclNamesAssignment_6_1 : ( RULE_ID ) ;
    public final void rule__DataDecl__DeclNamesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3754:1: ( ( RULE_ID ) )
            // InternalX21.g:3755:2: ( RULE_ID )
            {
            // InternalX21.g:3755:2: ( RULE_ID )
            // InternalX21.g:3756:3: RULE_ID
            {
             before(grammarAccess.getDataDeclAccess().getDeclNamesIDTerminalRuleCall_6_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataDeclAccess().getDeclNamesIDTerminalRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__DataDecl__DeclNamesAssignment_6_1"


    // $ANTLR start "rule__DataDecl__TypesAssignment_6_3"
    // InternalX21.g:3765:1: rule__DataDecl__TypesAssignment_6_3 : ( ruleType ) ;
    public final void rule__DataDecl__TypesAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3769:1: ( ( ruleType ) )
            // InternalX21.g:3770:2: ( ruleType )
            {
            // InternalX21.g:3770:2: ( ruleType )
            // InternalX21.g:3771:3: ruleType
            {
             before(grammarAccess.getDataDeclAccess().getTypesTypeParserRuleCall_6_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDataDeclAccess().getTypesTypeParserRuleCall_6_3_0()); 

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
    // $ANTLR end "rule__DataDecl__TypesAssignment_6_3"


    // $ANTLR start "rule__PlusMinus__RightAssignment_1_1"
    // InternalX21.g:3780:1: rule__PlusMinus__RightAssignment_1_1 : ( ruleMulDiv ) ;
    public final void rule__PlusMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3784:1: ( ( ruleMulDiv ) )
            // InternalX21.g:3785:2: ( ruleMulDiv )
            {
            // InternalX21.g:3785:2: ( ruleMulDiv )
            // InternalX21.g:3786:3: ruleMulDiv
            {
             before(grammarAccess.getPlusMinusAccess().getRightMulDivParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMulDiv();

            state._fsp--;

             after(grammarAccess.getPlusMinusAccess().getRightMulDivParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__PlusMinus__RightAssignment_1_1"


    // $ANTLR start "rule__MulDiv__RightAssignment_1_1"
    // InternalX21.g:3795:1: rule__MulDiv__RightAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__MulDiv__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3799:1: ( ( rulePrimary ) )
            // InternalX21.g:3800:2: ( rulePrimary )
            {
            // InternalX21.g:3800:2: ( rulePrimary )
            // InternalX21.g:3801:3: rulePrimary
            {
             before(grammarAccess.getMulDivAccess().getRightPrimaryParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMulDivAccess().getRightPrimaryParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__MulDiv__RightAssignment_1_1"


    // $ANTLR start "rule__Primary__ExpressionAssignment_1_2"
    // InternalX21.g:3810:1: rule__Primary__ExpressionAssignment_1_2 : ( ruleExp ) ;
    public final void rule__Primary__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3814:1: ( ( ruleExp ) )
            // InternalX21.g:3815:2: ( ruleExp )
            {
            // InternalX21.g:3815:2: ( ruleExp )
            // InternalX21.g:3816:3: ruleExp
            {
             before(grammarAccess.getPrimaryAccess().getExpressionExpParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionExpParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Primary__ExpressionAssignment_1_2"


    // $ANTLR start "rule__Atomic__ValueAssignment_0_1"
    // InternalX21.g:3825:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3829:1: ( ( RULE_INT ) )
            // InternalX21.g:3830:2: ( RULE_INT )
            {
            // InternalX21.g:3830:2: ( RULE_INT )
            // InternalX21.g:3831:3: RULE_INT
            {
             before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Atomic__ValueAssignment_0_1"


    // $ANTLR start "rule__LetBinding__NameAssignment_1"
    // InternalX21.g:3840:1: rule__LetBinding__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LetBinding__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3844:1: ( ( RULE_ID ) )
            // InternalX21.g:3845:2: ( RULE_ID )
            {
            // InternalX21.g:3845:2: ( RULE_ID )
            // InternalX21.g:3846:3: RULE_ID
            {
             before(grammarAccess.getLetBindingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLetBindingAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__LetBinding__NameAssignment_1"


    // $ANTLR start "rule__LetBinding__BindingAssignment_3"
    // InternalX21.g:3855:1: rule__LetBinding__BindingAssignment_3 : ( ruleExp ) ;
    public final void rule__LetBinding__BindingAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3859:1: ( ( ruleExp ) )
            // InternalX21.g:3860:2: ( ruleExp )
            {
            // InternalX21.g:3860:2: ( ruleExp )
            // InternalX21.g:3861:3: ruleExp
            {
             before(grammarAccess.getLetBindingAccess().getBindingExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getLetBindingAccess().getBindingExpParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__LetBinding__BindingAssignment_3"


    // $ANTLR start "rule__LetBinding__BodyAssignment_5"
    // InternalX21.g:3870:1: rule__LetBinding__BodyAssignment_5 : ( ruleExp ) ;
    public final void rule__LetBinding__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3874:1: ( ( ruleExp ) )
            // InternalX21.g:3875:2: ( ruleExp )
            {
            // InternalX21.g:3875:2: ( ruleExp )
            // InternalX21.g:3876:3: ruleExp
            {
             before(grammarAccess.getLetBindingAccess().getBodyExpParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getLetBindingAccess().getBodyExpParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__LetBinding__BodyAssignment_5"


    // $ANTLR start "rule__IfStatement__StatementAssignment_1"
    // InternalX21.g:3885:1: rule__IfStatement__StatementAssignment_1 : ( ruleLogicExp ) ;
    public final void rule__IfStatement__StatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3889:1: ( ( ruleLogicExp ) )
            // InternalX21.g:3890:2: ( ruleLogicExp )
            {
            // InternalX21.g:3890:2: ( ruleLogicExp )
            // InternalX21.g:3891:3: ruleLogicExp
            {
             before(grammarAccess.getIfStatementAccess().getStatementLogicExpParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicExp();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getStatementLogicExpParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__IfStatement__StatementAssignment_1"


    // $ANTLR start "rule__IfStatement__TrueExpressionAssignment_3"
    // InternalX21.g:3900:1: rule__IfStatement__TrueExpressionAssignment_3 : ( ruleExp ) ;
    public final void rule__IfStatement__TrueExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3904:1: ( ( ruleExp ) )
            // InternalX21.g:3905:2: ( ruleExp )
            {
            // InternalX21.g:3905:2: ( ruleExp )
            // InternalX21.g:3906:3: ruleExp
            {
             before(grammarAccess.getIfStatementAccess().getTrueExpressionExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getTrueExpressionExpParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__IfStatement__TrueExpressionAssignment_3"


    // $ANTLR start "rule__IfStatement__FalseExpressionAssignment_5"
    // InternalX21.g:3915:1: rule__IfStatement__FalseExpressionAssignment_5 : ( ruleExp ) ;
    public final void rule__IfStatement__FalseExpressionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3919:1: ( ( ruleExp ) )
            // InternalX21.g:3920:2: ( ruleExp )
            {
            // InternalX21.g:3920:2: ( ruleExp )
            // InternalX21.g:3921:3: ruleExp
            {
             before(grammarAccess.getIfStatementAccess().getFalseExpressionExpParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getFalseExpressionExpParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__IfStatement__FalseExpressionAssignment_5"


    // $ANTLR start "rule__LogicExp__LeftAssignment_0"
    // InternalX21.g:3930:1: rule__LogicExp__LeftAssignment_0 : ( ruleExp ) ;
    public final void rule__LogicExp__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3934:1: ( ( ruleExp ) )
            // InternalX21.g:3935:2: ( ruleExp )
            {
            // InternalX21.g:3935:2: ( ruleExp )
            // InternalX21.g:3936:3: ruleExp
            {
             before(grammarAccess.getLogicExpAccess().getLeftExpParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getLogicExpAccess().getLeftExpParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__LogicExp__LeftAssignment_0"


    // $ANTLR start "rule__LogicExp__OperatorAssignment_1"
    // InternalX21.g:3945:1: rule__LogicExp__OperatorAssignment_1 : ( ( rule__LogicExp__OperatorAlternatives_1_0 ) ) ;
    public final void rule__LogicExp__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3949:1: ( ( ( rule__LogicExp__OperatorAlternatives_1_0 ) ) )
            // InternalX21.g:3950:2: ( ( rule__LogicExp__OperatorAlternatives_1_0 ) )
            {
            // InternalX21.g:3950:2: ( ( rule__LogicExp__OperatorAlternatives_1_0 ) )
            // InternalX21.g:3951:3: ( rule__LogicExp__OperatorAlternatives_1_0 )
            {
             before(grammarAccess.getLogicExpAccess().getOperatorAlternatives_1_0()); 
            // InternalX21.g:3952:3: ( rule__LogicExp__OperatorAlternatives_1_0 )
            // InternalX21.g:3952:4: rule__LogicExp__OperatorAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__LogicExp__OperatorAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getLogicExpAccess().getOperatorAlternatives_1_0()); 

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
    // $ANTLR end "rule__LogicExp__OperatorAssignment_1"


    // $ANTLR start "rule__LogicExp__RightAssignment_2"
    // InternalX21.g:3960:1: rule__LogicExp__RightAssignment_2 : ( ruleExp ) ;
    public final void rule__LogicExp__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3964:1: ( ( ruleExp ) )
            // InternalX21.g:3965:2: ( ruleExp )
            {
            // InternalX21.g:3965:2: ( ruleExp )
            // InternalX21.g:3966:3: ruleExp
            {
             before(grammarAccess.getLogicExpAccess().getRightExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getLogicExpAccess().getRightExpParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__LogicExp__RightAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000226140000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000226140002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000004C000200020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000108000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000041000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000000003E000L});

}