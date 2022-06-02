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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'string'", "'='", "'<'", "'>'", "'<='", "'>='", "'program'", "'parameter'", "':'", "'function'", "'('", "')'", "'{'", "'}'", "'input'", "'node'", "'['", "']'", "'stream'", "','", "'to'", "'output'", "'data'", "'+'", "'-'", "'*'", "'/'", "'none'", "'let'", "'in'", "'end'", "'if'", "'then'", "'else'", "'.'", "'new'"
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
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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


    // $ANTLR start "entryRuleParameterStatement"
    // InternalX21.g:528:1: entryRuleParameterStatement : ruleParameterStatement EOF ;
    public final void entryRuleParameterStatement() throws RecognitionException {
        try {
            // InternalX21.g:529:1: ( ruleParameterStatement EOF )
            // InternalX21.g:530:1: ruleParameterStatement EOF
            {
             before(grammarAccess.getParameterStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterStatement();

            state._fsp--;

             after(grammarAccess.getParameterStatementRule()); 
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
    // $ANTLR end "entryRuleParameterStatement"


    // $ANTLR start "ruleParameterStatement"
    // InternalX21.g:537:1: ruleParameterStatement : ( ( rule__ParameterStatement__Group__0 ) ) ;
    public final void ruleParameterStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:541:2: ( ( ( rule__ParameterStatement__Group__0 ) ) )
            // InternalX21.g:542:2: ( ( rule__ParameterStatement__Group__0 ) )
            {
            // InternalX21.g:542:2: ( ( rule__ParameterStatement__Group__0 ) )
            // InternalX21.g:543:3: ( rule__ParameterStatement__Group__0 )
            {
             before(grammarAccess.getParameterStatementAccess().getGroup()); 
            // InternalX21.g:544:3: ( rule__ParameterStatement__Group__0 )
            // InternalX21.g:544:4: rule__ParameterStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterStatement"


    // $ANTLR start "entryRuleNewStatement"
    // InternalX21.g:553:1: entryRuleNewStatement : ruleNewStatement EOF ;
    public final void entryRuleNewStatement() throws RecognitionException {
        try {
            // InternalX21.g:554:1: ( ruleNewStatement EOF )
            // InternalX21.g:555:1: ruleNewStatement EOF
            {
             before(grammarAccess.getNewStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleNewStatement();

            state._fsp--;

             after(grammarAccess.getNewStatementRule()); 
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
    // $ANTLR end "entryRuleNewStatement"


    // $ANTLR start "ruleNewStatement"
    // InternalX21.g:562:1: ruleNewStatement : ( ( rule__NewStatement__Group__0 ) ) ;
    public final void ruleNewStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:566:2: ( ( ( rule__NewStatement__Group__0 ) ) )
            // InternalX21.g:567:2: ( ( rule__NewStatement__Group__0 ) )
            {
            // InternalX21.g:567:2: ( ( rule__NewStatement__Group__0 ) )
            // InternalX21.g:568:3: ( rule__NewStatement__Group__0 )
            {
             before(grammarAccess.getNewStatementAccess().getGroup()); 
            // InternalX21.g:569:3: ( rule__NewStatement__Group__0 )
            // InternalX21.g:569:4: rule__NewStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NewStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNewStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNewStatement"


    // $ANTLR start "rule__Declaration__Alternatives"
    // InternalX21.g:577:1: rule__Declaration__Alternatives : ( ( ruleFunction ) | ( ruleInput ) | ( ruleNode ) | ( ruleStream ) | ( ruleDataDecl ) | ( ruleParameter ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:581:1: ( ( ruleFunction ) | ( ruleInput ) | ( ruleNode ) | ( ruleStream ) | ( ruleDataDecl ) | ( ruleParameter ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt1=1;
                }
                break;
            case 26:
                {
                alt1=2;
                }
                break;
            case 27:
                {
                alt1=3;
                }
                break;
            case 30:
                {
                alt1=4;
                }
                break;
            case 34:
                {
                alt1=5;
                }
                break;
            case 19:
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
                    // InternalX21.g:582:2: ( ruleFunction )
                    {
                    // InternalX21.g:582:2: ( ruleFunction )
                    // InternalX21.g:583:3: ruleFunction
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
                    // InternalX21.g:588:2: ( ruleInput )
                    {
                    // InternalX21.g:588:2: ( ruleInput )
                    // InternalX21.g:589:3: ruleInput
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
                    // InternalX21.g:594:2: ( ruleNode )
                    {
                    // InternalX21.g:594:2: ( ruleNode )
                    // InternalX21.g:595:3: ruleNode
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
                    // InternalX21.g:600:2: ( ruleStream )
                    {
                    // InternalX21.g:600:2: ( ruleStream )
                    // InternalX21.g:601:3: ruleStream
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
                    // InternalX21.g:606:2: ( ruleDataDecl )
                    {
                    // InternalX21.g:606:2: ( ruleDataDecl )
                    // InternalX21.g:607:3: ruleDataDecl
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
                    // InternalX21.g:612:2: ( ruleParameter )
                    {
                    // InternalX21.g:612:2: ( ruleParameter )
                    // InternalX21.g:613:3: ruleParameter
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
    // InternalX21.g:622:1: rule__Node__Alternatives_3 : ( ( ( rule__Node__FunctionAssignment_3_0 ) ) | ( ( rule__Node__LambdaAssignment_3_1 ) ) );
    public final void rule__Node__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:626:1: ( ( ( rule__Node__FunctionAssignment_3_0 ) ) | ( ( rule__Node__LambdaAssignment_3_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==22) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalX21.g:627:2: ( ( rule__Node__FunctionAssignment_3_0 ) )
                    {
                    // InternalX21.g:627:2: ( ( rule__Node__FunctionAssignment_3_0 ) )
                    // InternalX21.g:628:3: ( rule__Node__FunctionAssignment_3_0 )
                    {
                     before(grammarAccess.getNodeAccess().getFunctionAssignment_3_0()); 
                    // InternalX21.g:629:3: ( rule__Node__FunctionAssignment_3_0 )
                    // InternalX21.g:629:4: rule__Node__FunctionAssignment_3_0
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
                    // InternalX21.g:633:2: ( ( rule__Node__LambdaAssignment_3_1 ) )
                    {
                    // InternalX21.g:633:2: ( ( rule__Node__LambdaAssignment_3_1 ) )
                    // InternalX21.g:634:3: ( rule__Node__LambdaAssignment_3_1 )
                    {
                     before(grammarAccess.getNodeAccess().getLambdaAssignment_3_1()); 
                    // InternalX21.g:635:3: ( rule__Node__LambdaAssignment_3_1 )
                    // InternalX21.g:635:4: rule__Node__LambdaAssignment_3_1
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
    // InternalX21.g:643:1: rule__Element__Alternatives : ( ( ( rule__Element__NodeNameAssignment_0 ) ) | ( ( rule__Element__Group_1__0 ) ) | ( ( rule__Element__Group_2__0 ) ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:647:1: ( ( ( rule__Element__NodeNameAssignment_0 ) ) | ( ( rule__Element__Group_1__0 ) ) | ( ( rule__Element__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 28:
                {
                alt3=2;
                }
                break;
            case 33:
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
                    // InternalX21.g:648:2: ( ( rule__Element__NodeNameAssignment_0 ) )
                    {
                    // InternalX21.g:648:2: ( ( rule__Element__NodeNameAssignment_0 ) )
                    // InternalX21.g:649:3: ( rule__Element__NodeNameAssignment_0 )
                    {
                     before(grammarAccess.getElementAccess().getNodeNameAssignment_0()); 
                    // InternalX21.g:650:3: ( rule__Element__NodeNameAssignment_0 )
                    // InternalX21.g:650:4: rule__Element__NodeNameAssignment_0
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
                    // InternalX21.g:654:2: ( ( rule__Element__Group_1__0 ) )
                    {
                    // InternalX21.g:654:2: ( ( rule__Element__Group_1__0 ) )
                    // InternalX21.g:655:3: ( rule__Element__Group_1__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_1()); 
                    // InternalX21.g:656:3: ( rule__Element__Group_1__0 )
                    // InternalX21.g:656:4: rule__Element__Group_1__0
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
                    // InternalX21.g:660:2: ( ( rule__Element__Group_2__0 ) )
                    {
                    // InternalX21.g:660:2: ( ( rule__Element__Group_2__0 ) )
                    // InternalX21.g:661:3: ( rule__Element__Group_2__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_2()); 
                    // InternalX21.g:662:3: ( rule__Element__Group_2__0 )
                    // InternalX21.g:662:4: rule__Element__Group_2__0
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
    // InternalX21.g:670:1: rule__Element__Alternatives_1_1 : ( ( ( rule__Element__FunctionAssignment_1_1_0 ) ) | ( ( rule__Element__LambdaAssignment_1_1_1 ) ) );
    public final void rule__Element__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:674:1: ( ( ( rule__Element__FunctionAssignment_1_1_0 ) ) | ( ( rule__Element__LambdaAssignment_1_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==22) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalX21.g:675:2: ( ( rule__Element__FunctionAssignment_1_1_0 ) )
                    {
                    // InternalX21.g:675:2: ( ( rule__Element__FunctionAssignment_1_1_0 ) )
                    // InternalX21.g:676:3: ( rule__Element__FunctionAssignment_1_1_0 )
                    {
                     before(grammarAccess.getElementAccess().getFunctionAssignment_1_1_0()); 
                    // InternalX21.g:677:3: ( rule__Element__FunctionAssignment_1_1_0 )
                    // InternalX21.g:677:4: rule__Element__FunctionAssignment_1_1_0
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
                    // InternalX21.g:681:2: ( ( rule__Element__LambdaAssignment_1_1_1 ) )
                    {
                    // InternalX21.g:681:2: ( ( rule__Element__LambdaAssignment_1_1_1 ) )
                    // InternalX21.g:682:3: ( rule__Element__LambdaAssignment_1_1_1 )
                    {
                     before(grammarAccess.getElementAccess().getLambdaAssignment_1_1_1()); 
                    // InternalX21.g:683:3: ( rule__Element__LambdaAssignment_1_1_1 )
                    // InternalX21.g:683:4: rule__Element__LambdaAssignment_1_1_1
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
    // InternalX21.g:691:1: rule__Type__Alternatives : ( ( 'int' ) | ( 'string' ) | ( RULE_ID ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:695:1: ( ( 'int' ) | ( 'string' ) | ( RULE_ID ) )
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
                    // InternalX21.g:696:2: ( 'int' )
                    {
                    // InternalX21.g:696:2: ( 'int' )
                    // InternalX21.g:697:3: 'int'
                    {
                     before(grammarAccess.getTypeAccess().getIntKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getIntKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalX21.g:702:2: ( 'string' )
                    {
                    // InternalX21.g:702:2: ( 'string' )
                    // InternalX21.g:703:3: 'string'
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalX21.g:708:2: ( RULE_ID )
                    {
                    // InternalX21.g:708:2: ( RULE_ID )
                    // InternalX21.g:709:3: RULE_ID
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
    // InternalX21.g:718:1: rule__PlusMinus__Alternatives_1_0 : ( ( ( rule__PlusMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:722:1: ( ( ( rule__PlusMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusMinus__Group_1_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==35) ) {
                alt6=1;
            }
            else if ( (LA6_0==36) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalX21.g:723:2: ( ( rule__PlusMinus__Group_1_0_0__0 ) )
                    {
                    // InternalX21.g:723:2: ( ( rule__PlusMinus__Group_1_0_0__0 ) )
                    // InternalX21.g:724:3: ( rule__PlusMinus__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getPlusMinusAccess().getGroup_1_0_0()); 
                    // InternalX21.g:725:3: ( rule__PlusMinus__Group_1_0_0__0 )
                    // InternalX21.g:725:4: rule__PlusMinus__Group_1_0_0__0
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
                    // InternalX21.g:729:2: ( ( rule__PlusMinus__Group_1_0_1__0 ) )
                    {
                    // InternalX21.g:729:2: ( ( rule__PlusMinus__Group_1_0_1__0 ) )
                    // InternalX21.g:730:3: ( rule__PlusMinus__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getPlusMinusAccess().getGroup_1_0_1()); 
                    // InternalX21.g:731:3: ( rule__PlusMinus__Group_1_0_1__0 )
                    // InternalX21.g:731:4: rule__PlusMinus__Group_1_0_1__0
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
    // InternalX21.g:739:1: rule__MulDiv__Alternatives_1_0 : ( ( ( rule__MulDiv__Group_1_0_0__0 ) ) | ( ( rule__MulDiv__Group_1_0_1__0 ) ) );
    public final void rule__MulDiv__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:743:1: ( ( ( rule__MulDiv__Group_1_0_0__0 ) ) | ( ( rule__MulDiv__Group_1_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==37) ) {
                alt7=1;
            }
            else if ( (LA7_0==38) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalX21.g:744:2: ( ( rule__MulDiv__Group_1_0_0__0 ) )
                    {
                    // InternalX21.g:744:2: ( ( rule__MulDiv__Group_1_0_0__0 ) )
                    // InternalX21.g:745:3: ( rule__MulDiv__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMulDivAccess().getGroup_1_0_0()); 
                    // InternalX21.g:746:3: ( rule__MulDiv__Group_1_0_0__0 )
                    // InternalX21.g:746:4: rule__MulDiv__Group_1_0_0__0
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
                    // InternalX21.g:750:2: ( ( rule__MulDiv__Group_1_0_1__0 ) )
                    {
                    // InternalX21.g:750:2: ( ( rule__MulDiv__Group_1_0_1__0 ) )
                    // InternalX21.g:751:3: ( rule__MulDiv__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMulDivAccess().getGroup_1_0_1()); 
                    // InternalX21.g:752:3: ( rule__MulDiv__Group_1_0_1__0 )
                    // InternalX21.g:752:4: rule__MulDiv__Group_1_0_1__0
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
    // InternalX21.g:760:1: rule__Primary__Alternatives : ( ( ruleAtomic ) | ( ( rule__Primary__Group_1__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:764:1: ( ( ruleAtomic ) | ( ( rule__Primary__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_INT)||(LA8_0>=39 && LA8_0<=40)||LA8_0==43||LA8_0==47) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalX21.g:765:2: ( ruleAtomic )
                    {
                    // InternalX21.g:765:2: ( ruleAtomic )
                    // InternalX21.g:766:3: ruleAtomic
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
                    // InternalX21.g:771:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalX21.g:771:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalX21.g:772:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalX21.g:773:3: ( rule__Primary__Group_1__0 )
                    // InternalX21.g:773:4: rule__Primary__Group_1__0
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
    // InternalX21.g:781:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ruleLetBinding ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ruleIfStatement ) | ( ruleNewStatement ) | ( ruleParameterStatement ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:785:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ruleLetBinding ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ruleIfStatement ) | ( ruleNewStatement ) | ( ruleParameterStatement ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case 40:
                {
                alt9=2;
                }
                break;
            case 39:
                {
                alt9=3;
                }
                break;
            case 43:
                {
                alt9=4;
                }
                break;
            case 47:
                {
                alt9=5;
                }
                break;
            case RULE_ID:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalX21.g:786:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalX21.g:786:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalX21.g:787:3: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // InternalX21.g:788:3: ( rule__Atomic__Group_0__0 )
                    // InternalX21.g:788:4: rule__Atomic__Group_0__0
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
                    // InternalX21.g:792:2: ( ruleLetBinding )
                    {
                    // InternalX21.g:792:2: ( ruleLetBinding )
                    // InternalX21.g:793:3: ruleLetBinding
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
                    // InternalX21.g:798:2: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // InternalX21.g:798:2: ( ( rule__Atomic__Group_2__0 ) )
                    // InternalX21.g:799:3: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // InternalX21.g:800:3: ( rule__Atomic__Group_2__0 )
                    // InternalX21.g:800:4: rule__Atomic__Group_2__0
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
                    // InternalX21.g:804:2: ( ruleIfStatement )
                    {
                    // InternalX21.g:804:2: ( ruleIfStatement )
                    // InternalX21.g:805:3: ruleIfStatement
                    {
                     before(grammarAccess.getAtomicAccess().getIfStatementParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleIfStatement();

                    state._fsp--;

                     after(grammarAccess.getAtomicAccess().getIfStatementParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalX21.g:810:2: ( ruleNewStatement )
                    {
                    // InternalX21.g:810:2: ( ruleNewStatement )
                    // InternalX21.g:811:3: ruleNewStatement
                    {
                     before(grammarAccess.getAtomicAccess().getNewStatementParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleNewStatement();

                    state._fsp--;

                     after(grammarAccess.getAtomicAccess().getNewStatementParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalX21.g:816:2: ( ruleParameterStatement )
                    {
                    // InternalX21.g:816:2: ( ruleParameterStatement )
                    // InternalX21.g:817:3: ruleParameterStatement
                    {
                     before(grammarAccess.getAtomicAccess().getParameterStatementParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterStatement();

                    state._fsp--;

                     after(grammarAccess.getAtomicAccess().getParameterStatementParserRuleCall_5()); 

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
    // InternalX21.g:826:1: rule__LogicExp__OperatorAlternatives_1_0 : ( ( '=' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );
    public final void rule__LogicExp__OperatorAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:830:1: ( ( '=' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) )
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
                    // InternalX21.g:831:2: ( '=' )
                    {
                    // InternalX21.g:831:2: ( '=' )
                    // InternalX21.g:832:3: '='
                    {
                     before(grammarAccess.getLogicExpAccess().getOperatorEqualsSignKeyword_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getOperatorEqualsSignKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalX21.g:837:2: ( '<' )
                    {
                    // InternalX21.g:837:2: ( '<' )
                    // InternalX21.g:838:3: '<'
                    {
                     before(grammarAccess.getLogicExpAccess().getOperatorLessThanSignKeyword_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getOperatorLessThanSignKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalX21.g:843:2: ( '>' )
                    {
                    // InternalX21.g:843:2: ( '>' )
                    // InternalX21.g:844:3: '>'
                    {
                     before(grammarAccess.getLogicExpAccess().getOperatorGreaterThanSignKeyword_1_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getOperatorGreaterThanSignKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalX21.g:849:2: ( '<=' )
                    {
                    // InternalX21.g:849:2: ( '<=' )
                    // InternalX21.g:850:3: '<='
                    {
                     before(grammarAccess.getLogicExpAccess().getOperatorLessThanSignEqualsSignKeyword_1_0_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getLogicExpAccess().getOperatorLessThanSignEqualsSignKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalX21.g:855:2: ( '>=' )
                    {
                    // InternalX21.g:855:2: ( '>=' )
                    // InternalX21.g:856:3: '>='
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
    // InternalX21.g:865:1: rule__X21__Group__0 : rule__X21__Group__0__Impl rule__X21__Group__1 ;
    public final void rule__X21__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:869:1: ( rule__X21__Group__0__Impl rule__X21__Group__1 )
            // InternalX21.g:870:2: rule__X21__Group__0__Impl rule__X21__Group__1
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
    // InternalX21.g:877:1: rule__X21__Group__0__Impl : ( 'program' ) ;
    public final void rule__X21__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:881:1: ( ( 'program' ) )
            // InternalX21.g:882:1: ( 'program' )
            {
            // InternalX21.g:882:1: ( 'program' )
            // InternalX21.g:883:2: 'program'
            {
             before(grammarAccess.getX21Access().getProgramKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getX21Access().getProgramKeyword_0()); 

            }


            }

        }
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
    // InternalX21.g:892:1: rule__X21__Group__1 : rule__X21__Group__1__Impl rule__X21__Group__2 ;
    public final void rule__X21__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:896:1: ( rule__X21__Group__1__Impl rule__X21__Group__2 )
            // InternalX21.g:897:2: rule__X21__Group__1__Impl rule__X21__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__X21__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__X21__Group__2();

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
    // InternalX21.g:904:1: rule__X21__Group__1__Impl : ( ( rule__X21__NameAssignment_1 ) ) ;
    public final void rule__X21__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:908:1: ( ( ( rule__X21__NameAssignment_1 ) ) )
            // InternalX21.g:909:1: ( ( rule__X21__NameAssignment_1 ) )
            {
            // InternalX21.g:909:1: ( ( rule__X21__NameAssignment_1 ) )
            // InternalX21.g:910:2: ( rule__X21__NameAssignment_1 )
            {
             before(grammarAccess.getX21Access().getNameAssignment_1()); 
            // InternalX21.g:911:2: ( rule__X21__NameAssignment_1 )
            // InternalX21.g:911:3: rule__X21__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__X21__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getX21Access().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__X21__Group__2"
    // InternalX21.g:919:1: rule__X21__Group__2 : rule__X21__Group__2__Impl ;
    public final void rule__X21__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:923:1: ( rule__X21__Group__2__Impl )
            // InternalX21.g:924:2: rule__X21__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__X21__Group__2__Impl();

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
    // $ANTLR end "rule__X21__Group__2"


    // $ANTLR start "rule__X21__Group__2__Impl"
    // InternalX21.g:930:1: rule__X21__Group__2__Impl : ( ( rule__X21__DeclarationsAssignment_2 )* ) ;
    public final void rule__X21__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:934:1: ( ( ( rule__X21__DeclarationsAssignment_2 )* ) )
            // InternalX21.g:935:1: ( ( rule__X21__DeclarationsAssignment_2 )* )
            {
            // InternalX21.g:935:1: ( ( rule__X21__DeclarationsAssignment_2 )* )
            // InternalX21.g:936:2: ( rule__X21__DeclarationsAssignment_2 )*
            {
             before(grammarAccess.getX21Access().getDeclarationsAssignment_2()); 
            // InternalX21.g:937:2: ( rule__X21__DeclarationsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19||LA11_0==21||(LA11_0>=26 && LA11_0<=27)||LA11_0==30||LA11_0==34) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalX21.g:937:3: rule__X21__DeclarationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__X21__DeclarationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getX21Access().getDeclarationsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X21__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalX21.g:946:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:950:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalX21.g:951:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalX21.g:958:1: rule__Parameter__Group__0__Impl : ( 'parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:962:1: ( ( 'parameter' ) )
            // InternalX21.g:963:1: ( 'parameter' )
            {
            // InternalX21.g:963:1: ( 'parameter' )
            // InternalX21.g:964:2: 'parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalX21.g:973:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:977:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalX21.g:978:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalX21.g:985:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:989:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalX21.g:990:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalX21.g:990:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalX21.g:991:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalX21.g:992:2: ( rule__Parameter__NameAssignment_1 )
            // InternalX21.g:992:3: rule__Parameter__NameAssignment_1
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
    // InternalX21.g:1000:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1004:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalX21.g:1005:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
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
    // InternalX21.g:1012:1: rule__Parameter__Group__2__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1016:1: ( ( ':' ) )
            // InternalX21.g:1017:1: ( ':' )
            {
            // InternalX21.g:1017:1: ( ':' )
            // InternalX21.g:1018:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalX21.g:1027:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1031:1: ( rule__Parameter__Group__3__Impl )
            // InternalX21.g:1032:2: rule__Parameter__Group__3__Impl
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
    // InternalX21.g:1038:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__TypeAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1042:1: ( ( ( rule__Parameter__TypeAssignment_3 ) ) )
            // InternalX21.g:1043:1: ( ( rule__Parameter__TypeAssignment_3 ) )
            {
            // InternalX21.g:1043:1: ( ( rule__Parameter__TypeAssignment_3 ) )
            // InternalX21.g:1044:2: ( rule__Parameter__TypeAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_3()); 
            // InternalX21.g:1045:2: ( rule__Parameter__TypeAssignment_3 )
            // InternalX21.g:1045:3: rule__Parameter__TypeAssignment_3
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
    // InternalX21.g:1054:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1058:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalX21.g:1059:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalX21.g:1066:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1070:1: ( ( 'function' ) )
            // InternalX21.g:1071:1: ( 'function' )
            {
            // InternalX21.g:1071:1: ( 'function' )
            // InternalX21.g:1072:2: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalX21.g:1081:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1085:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalX21.g:1086:2: rule__Function__Group__1__Impl rule__Function__Group__2
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
    // InternalX21.g:1093:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1097:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // InternalX21.g:1098:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // InternalX21.g:1098:1: ( ( rule__Function__NameAssignment_1 ) )
            // InternalX21.g:1099:2: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // InternalX21.g:1100:2: ( rule__Function__NameAssignment_1 )
            // InternalX21.g:1100:3: rule__Function__NameAssignment_1
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
    // InternalX21.g:1108:1: rule__Function__Group__2 : rule__Function__Group__2__Impl ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1112:1: ( rule__Function__Group__2__Impl )
            // InternalX21.g:1113:2: rule__Function__Group__2__Impl
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
    // InternalX21.g:1119:1: rule__Function__Group__2__Impl : ( ( rule__Function__LambdaAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1123:1: ( ( ( rule__Function__LambdaAssignment_2 ) ) )
            // InternalX21.g:1124:1: ( ( rule__Function__LambdaAssignment_2 ) )
            {
            // InternalX21.g:1124:1: ( ( rule__Function__LambdaAssignment_2 ) )
            // InternalX21.g:1125:2: ( rule__Function__LambdaAssignment_2 )
            {
             before(grammarAccess.getFunctionAccess().getLambdaAssignment_2()); 
            // InternalX21.g:1126:2: ( rule__Function__LambdaAssignment_2 )
            // InternalX21.g:1126:3: rule__Function__LambdaAssignment_2
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
    // InternalX21.g:1135:1: rule__Lambda__Group__0 : rule__Lambda__Group__0__Impl rule__Lambda__Group__1 ;
    public final void rule__Lambda__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1139:1: ( rule__Lambda__Group__0__Impl rule__Lambda__Group__1 )
            // InternalX21.g:1140:2: rule__Lambda__Group__0__Impl rule__Lambda__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalX21.g:1147:1: rule__Lambda__Group__0__Impl : ( '(' ) ;
    public final void rule__Lambda__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1151:1: ( ( '(' ) )
            // InternalX21.g:1152:1: ( '(' )
            {
            // InternalX21.g:1152:1: ( '(' )
            // InternalX21.g:1153:2: '('
            {
             before(grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalX21.g:1162:1: rule__Lambda__Group__1 : rule__Lambda__Group__1__Impl rule__Lambda__Group__2 ;
    public final void rule__Lambda__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1166:1: ( rule__Lambda__Group__1__Impl rule__Lambda__Group__2 )
            // InternalX21.g:1167:2: rule__Lambda__Group__1__Impl rule__Lambda__Group__2
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
    // InternalX21.g:1174:1: rule__Lambda__Group__1__Impl : ( ( rule__Lambda__NameAssignment_1 ) ) ;
    public final void rule__Lambda__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1178:1: ( ( ( rule__Lambda__NameAssignment_1 ) ) )
            // InternalX21.g:1179:1: ( ( rule__Lambda__NameAssignment_1 ) )
            {
            // InternalX21.g:1179:1: ( ( rule__Lambda__NameAssignment_1 ) )
            // InternalX21.g:1180:2: ( rule__Lambda__NameAssignment_1 )
            {
             before(grammarAccess.getLambdaAccess().getNameAssignment_1()); 
            // InternalX21.g:1181:2: ( rule__Lambda__NameAssignment_1 )
            // InternalX21.g:1181:3: rule__Lambda__NameAssignment_1
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
    // InternalX21.g:1189:1: rule__Lambda__Group__2 : rule__Lambda__Group__2__Impl rule__Lambda__Group__3 ;
    public final void rule__Lambda__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1193:1: ( rule__Lambda__Group__2__Impl rule__Lambda__Group__3 )
            // InternalX21.g:1194:2: rule__Lambda__Group__2__Impl rule__Lambda__Group__3
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
    // InternalX21.g:1201:1: rule__Lambda__Group__2__Impl : ( ':' ) ;
    public final void rule__Lambda__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1205:1: ( ( ':' ) )
            // InternalX21.g:1206:1: ( ':' )
            {
            // InternalX21.g:1206:1: ( ':' )
            // InternalX21.g:1207:2: ':'
            {
             before(grammarAccess.getLambdaAccess().getColonKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalX21.g:1216:1: rule__Lambda__Group__3 : rule__Lambda__Group__3__Impl rule__Lambda__Group__4 ;
    public final void rule__Lambda__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1220:1: ( rule__Lambda__Group__3__Impl rule__Lambda__Group__4 )
            // InternalX21.g:1221:2: rule__Lambda__Group__3__Impl rule__Lambda__Group__4
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
    // InternalX21.g:1228:1: rule__Lambda__Group__3__Impl : ( ( rule__Lambda__TypeAssignment_3 ) ) ;
    public final void rule__Lambda__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1232:1: ( ( ( rule__Lambda__TypeAssignment_3 ) ) )
            // InternalX21.g:1233:1: ( ( rule__Lambda__TypeAssignment_3 ) )
            {
            // InternalX21.g:1233:1: ( ( rule__Lambda__TypeAssignment_3 ) )
            // InternalX21.g:1234:2: ( rule__Lambda__TypeAssignment_3 )
            {
             before(grammarAccess.getLambdaAccess().getTypeAssignment_3()); 
            // InternalX21.g:1235:2: ( rule__Lambda__TypeAssignment_3 )
            // InternalX21.g:1235:3: rule__Lambda__TypeAssignment_3
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
    // InternalX21.g:1243:1: rule__Lambda__Group__4 : rule__Lambda__Group__4__Impl rule__Lambda__Group__5 ;
    public final void rule__Lambda__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1247:1: ( rule__Lambda__Group__4__Impl rule__Lambda__Group__5 )
            // InternalX21.g:1248:2: rule__Lambda__Group__4__Impl rule__Lambda__Group__5
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
    // InternalX21.g:1255:1: rule__Lambda__Group__4__Impl : ( ')' ) ;
    public final void rule__Lambda__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1259:1: ( ( ')' ) )
            // InternalX21.g:1260:1: ( ')' )
            {
            // InternalX21.g:1260:1: ( ')' )
            // InternalX21.g:1261:2: ')'
            {
             before(grammarAccess.getLambdaAccess().getRightParenthesisKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalX21.g:1270:1: rule__Lambda__Group__5 : rule__Lambda__Group__5__Impl rule__Lambda__Group__6 ;
    public final void rule__Lambda__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1274:1: ( rule__Lambda__Group__5__Impl rule__Lambda__Group__6 )
            // InternalX21.g:1275:2: rule__Lambda__Group__5__Impl rule__Lambda__Group__6
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
    // InternalX21.g:1282:1: rule__Lambda__Group__5__Impl : ( '{' ) ;
    public final void rule__Lambda__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1286:1: ( ( '{' ) )
            // InternalX21.g:1287:1: ( '{' )
            {
            // InternalX21.g:1287:1: ( '{' )
            // InternalX21.g:1288:2: '{'
            {
             before(grammarAccess.getLambdaAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
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
    // InternalX21.g:1297:1: rule__Lambda__Group__6 : rule__Lambda__Group__6__Impl rule__Lambda__Group__7 ;
    public final void rule__Lambda__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1301:1: ( rule__Lambda__Group__6__Impl rule__Lambda__Group__7 )
            // InternalX21.g:1302:2: rule__Lambda__Group__6__Impl rule__Lambda__Group__7
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
    // InternalX21.g:1309:1: rule__Lambda__Group__6__Impl : ( ( rule__Lambda__ExpAssignment_6 ) ) ;
    public final void rule__Lambda__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1313:1: ( ( ( rule__Lambda__ExpAssignment_6 ) ) )
            // InternalX21.g:1314:1: ( ( rule__Lambda__ExpAssignment_6 ) )
            {
            // InternalX21.g:1314:1: ( ( rule__Lambda__ExpAssignment_6 ) )
            // InternalX21.g:1315:2: ( rule__Lambda__ExpAssignment_6 )
            {
             before(grammarAccess.getLambdaAccess().getExpAssignment_6()); 
            // InternalX21.g:1316:2: ( rule__Lambda__ExpAssignment_6 )
            // InternalX21.g:1316:3: rule__Lambda__ExpAssignment_6
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
    // InternalX21.g:1324:1: rule__Lambda__Group__7 : rule__Lambda__Group__7__Impl ;
    public final void rule__Lambda__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1328:1: ( rule__Lambda__Group__7__Impl )
            // InternalX21.g:1329:2: rule__Lambda__Group__7__Impl
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
    // InternalX21.g:1335:1: rule__Lambda__Group__7__Impl : ( '}' ) ;
    public final void rule__Lambda__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1339:1: ( ( '}' ) )
            // InternalX21.g:1340:1: ( '}' )
            {
            // InternalX21.g:1340:1: ( '}' )
            // InternalX21.g:1341:2: '}'
            {
             before(grammarAccess.getLambdaAccess().getRightCurlyBracketKeyword_7()); 
            match(input,25,FOLLOW_2); 
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
    // InternalX21.g:1351:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1355:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalX21.g:1356:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalX21.g:1363:1: rule__Input__Group__0__Impl : ( 'input' ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1367:1: ( ( 'input' ) )
            // InternalX21.g:1368:1: ( 'input' )
            {
            // InternalX21.g:1368:1: ( 'input' )
            // InternalX21.g:1369:2: 'input'
            {
             before(grammarAccess.getInputAccess().getInputKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalX21.g:1378:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1382:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalX21.g:1383:2: rule__Input__Group__1__Impl rule__Input__Group__2
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
    // InternalX21.g:1390:1: rule__Input__Group__1__Impl : ( ( rule__Input__NameAssignment_1 ) ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1394:1: ( ( ( rule__Input__NameAssignment_1 ) ) )
            // InternalX21.g:1395:1: ( ( rule__Input__NameAssignment_1 ) )
            {
            // InternalX21.g:1395:1: ( ( rule__Input__NameAssignment_1 ) )
            // InternalX21.g:1396:2: ( rule__Input__NameAssignment_1 )
            {
             before(grammarAccess.getInputAccess().getNameAssignment_1()); 
            // InternalX21.g:1397:2: ( rule__Input__NameAssignment_1 )
            // InternalX21.g:1397:3: rule__Input__NameAssignment_1
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
    // InternalX21.g:1405:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1409:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // InternalX21.g:1410:2: rule__Input__Group__2__Impl rule__Input__Group__3
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
    // InternalX21.g:1417:1: rule__Input__Group__2__Impl : ( ':' ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1421:1: ( ( ':' ) )
            // InternalX21.g:1422:1: ( ':' )
            {
            // InternalX21.g:1422:1: ( ':' )
            // InternalX21.g:1423:2: ':'
            {
             before(grammarAccess.getInputAccess().getColonKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalX21.g:1432:1: rule__Input__Group__3 : rule__Input__Group__3__Impl ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1436:1: ( rule__Input__Group__3__Impl )
            // InternalX21.g:1437:2: rule__Input__Group__3__Impl
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
    // InternalX21.g:1443:1: rule__Input__Group__3__Impl : ( ( rule__Input__TypeAssignment_3 ) ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1447:1: ( ( ( rule__Input__TypeAssignment_3 ) ) )
            // InternalX21.g:1448:1: ( ( rule__Input__TypeAssignment_3 ) )
            {
            // InternalX21.g:1448:1: ( ( rule__Input__TypeAssignment_3 ) )
            // InternalX21.g:1449:2: ( rule__Input__TypeAssignment_3 )
            {
             before(grammarAccess.getInputAccess().getTypeAssignment_3()); 
            // InternalX21.g:1450:2: ( rule__Input__TypeAssignment_3 )
            // InternalX21.g:1450:3: rule__Input__TypeAssignment_3
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
    // InternalX21.g:1459:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1463:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalX21.g:1464:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalX21.g:1471:1: rule__Node__Group__0__Impl : ( 'node' ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1475:1: ( ( 'node' ) )
            // InternalX21.g:1476:1: ( 'node' )
            {
            // InternalX21.g:1476:1: ( 'node' )
            // InternalX21.g:1477:2: 'node'
            {
             before(grammarAccess.getNodeAccess().getNodeKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalX21.g:1486:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1490:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalX21.g:1491:2: rule__Node__Group__1__Impl rule__Node__Group__2
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
    // InternalX21.g:1498:1: rule__Node__Group__1__Impl : ( ( rule__Node__NameAssignment_1 ) ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1502:1: ( ( ( rule__Node__NameAssignment_1 ) ) )
            // InternalX21.g:1503:1: ( ( rule__Node__NameAssignment_1 ) )
            {
            // InternalX21.g:1503:1: ( ( rule__Node__NameAssignment_1 ) )
            // InternalX21.g:1504:2: ( rule__Node__NameAssignment_1 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_1()); 
            // InternalX21.g:1505:2: ( rule__Node__NameAssignment_1 )
            // InternalX21.g:1505:3: rule__Node__NameAssignment_1
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
    // InternalX21.g:1513:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1517:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // InternalX21.g:1518:2: rule__Node__Group__2__Impl rule__Node__Group__3
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
    // InternalX21.g:1525:1: rule__Node__Group__2__Impl : ( '[' ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1529:1: ( ( '[' ) )
            // InternalX21.g:1530:1: ( '[' )
            {
            // InternalX21.g:1530:1: ( '[' )
            // InternalX21.g:1531:2: '['
            {
             before(grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalX21.g:1540:1: rule__Node__Group__3 : rule__Node__Group__3__Impl rule__Node__Group__4 ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1544:1: ( rule__Node__Group__3__Impl rule__Node__Group__4 )
            // InternalX21.g:1545:2: rule__Node__Group__3__Impl rule__Node__Group__4
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
    // InternalX21.g:1552:1: rule__Node__Group__3__Impl : ( ( rule__Node__Alternatives_3 ) ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1556:1: ( ( ( rule__Node__Alternatives_3 ) ) )
            // InternalX21.g:1557:1: ( ( rule__Node__Alternatives_3 ) )
            {
            // InternalX21.g:1557:1: ( ( rule__Node__Alternatives_3 ) )
            // InternalX21.g:1558:2: ( rule__Node__Alternatives_3 )
            {
             before(grammarAccess.getNodeAccess().getAlternatives_3()); 
            // InternalX21.g:1559:2: ( rule__Node__Alternatives_3 )
            // InternalX21.g:1559:3: rule__Node__Alternatives_3
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
    // InternalX21.g:1567:1: rule__Node__Group__4 : rule__Node__Group__4__Impl ;
    public final void rule__Node__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1571:1: ( rule__Node__Group__4__Impl )
            // InternalX21.g:1572:2: rule__Node__Group__4__Impl
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
    // InternalX21.g:1578:1: rule__Node__Group__4__Impl : ( ']' ) ;
    public final void rule__Node__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1582:1: ( ( ']' ) )
            // InternalX21.g:1583:1: ( ']' )
            {
            // InternalX21.g:1583:1: ( ']' )
            // InternalX21.g:1584:2: ']'
            {
             before(grammarAccess.getNodeAccess().getRightSquareBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalX21.g:1594:1: rule__Stream__Group__0 : rule__Stream__Group__0__Impl rule__Stream__Group__1 ;
    public final void rule__Stream__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1598:1: ( rule__Stream__Group__0__Impl rule__Stream__Group__1 )
            // InternalX21.g:1599:2: rule__Stream__Group__0__Impl rule__Stream__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalX21.g:1606:1: rule__Stream__Group__0__Impl : ( 'stream' ) ;
    public final void rule__Stream__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1610:1: ( ( 'stream' ) )
            // InternalX21.g:1611:1: ( 'stream' )
            {
            // InternalX21.g:1611:1: ( 'stream' )
            // InternalX21.g:1612:2: 'stream'
            {
             before(grammarAccess.getStreamAccess().getStreamKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalX21.g:1621:1: rule__Stream__Group__1 : rule__Stream__Group__1__Impl rule__Stream__Group__2 ;
    public final void rule__Stream__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1625:1: ( rule__Stream__Group__1__Impl rule__Stream__Group__2 )
            // InternalX21.g:1626:2: rule__Stream__Group__1__Impl rule__Stream__Group__2
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
    // InternalX21.g:1633:1: rule__Stream__Group__1__Impl : ( ( rule__Stream__NameAssignment_1 ) ) ;
    public final void rule__Stream__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1637:1: ( ( ( rule__Stream__NameAssignment_1 ) ) )
            // InternalX21.g:1638:1: ( ( rule__Stream__NameAssignment_1 ) )
            {
            // InternalX21.g:1638:1: ( ( rule__Stream__NameAssignment_1 ) )
            // InternalX21.g:1639:2: ( rule__Stream__NameAssignment_1 )
            {
             before(grammarAccess.getStreamAccess().getNameAssignment_1()); 
            // InternalX21.g:1640:2: ( rule__Stream__NameAssignment_1 )
            // InternalX21.g:1640:3: rule__Stream__NameAssignment_1
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
    // InternalX21.g:1648:1: rule__Stream__Group__2 : rule__Stream__Group__2__Impl rule__Stream__Group__3 ;
    public final void rule__Stream__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1652:1: ( rule__Stream__Group__2__Impl rule__Stream__Group__3 )
            // InternalX21.g:1653:2: rule__Stream__Group__2__Impl rule__Stream__Group__3
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
    // InternalX21.g:1660:1: rule__Stream__Group__2__Impl : ( ( rule__Stream__Group_2__0 )* ) ;
    public final void rule__Stream__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1664:1: ( ( ( rule__Stream__Group_2__0 )* ) )
            // InternalX21.g:1665:1: ( ( rule__Stream__Group_2__0 )* )
            {
            // InternalX21.g:1665:1: ( ( rule__Stream__Group_2__0 )* )
            // InternalX21.g:1666:2: ( rule__Stream__Group_2__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_2()); 
            // InternalX21.g:1667:2: ( rule__Stream__Group_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==31) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalX21.g:1667:3: rule__Stream__Group_2__0
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
    // InternalX21.g:1675:1: rule__Stream__Group__3 : rule__Stream__Group__3__Impl ;
    public final void rule__Stream__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1679:1: ( rule__Stream__Group__3__Impl )
            // InternalX21.g:1680:2: rule__Stream__Group__3__Impl
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
    // InternalX21.g:1686:1: rule__Stream__Group__3__Impl : ( ( ( rule__Stream__Group_3__0 ) ) ( ( rule__Stream__Group_3__0 )* ) ) ;
    public final void rule__Stream__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1690:1: ( ( ( ( rule__Stream__Group_3__0 ) ) ( ( rule__Stream__Group_3__0 )* ) ) )
            // InternalX21.g:1691:1: ( ( ( rule__Stream__Group_3__0 ) ) ( ( rule__Stream__Group_3__0 )* ) )
            {
            // InternalX21.g:1691:1: ( ( ( rule__Stream__Group_3__0 ) ) ( ( rule__Stream__Group_3__0 )* ) )
            // InternalX21.g:1692:2: ( ( rule__Stream__Group_3__0 ) ) ( ( rule__Stream__Group_3__0 )* )
            {
            // InternalX21.g:1692:2: ( ( rule__Stream__Group_3__0 ) )
            // InternalX21.g:1693:3: ( rule__Stream__Group_3__0 )
            {
             before(grammarAccess.getStreamAccess().getGroup_3()); 
            // InternalX21.g:1694:3: ( rule__Stream__Group_3__0 )
            // InternalX21.g:1694:4: rule__Stream__Group_3__0
            {
            pushFollow(FOLLOW_18);
            rule__Stream__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getGroup_3()); 

            }

            // InternalX21.g:1697:2: ( ( rule__Stream__Group_3__0 )* )
            // InternalX21.g:1698:3: ( rule__Stream__Group_3__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_3()); 
            // InternalX21.g:1699:3: ( rule__Stream__Group_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==32) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalX21.g:1699:4: rule__Stream__Group_3__0
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
    // InternalX21.g:1709:1: rule__Stream__Group_2__0 : rule__Stream__Group_2__0__Impl rule__Stream__Group_2__1 ;
    public final void rule__Stream__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1713:1: ( rule__Stream__Group_2__0__Impl rule__Stream__Group_2__1 )
            // InternalX21.g:1714:2: rule__Stream__Group_2__0__Impl rule__Stream__Group_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalX21.g:1721:1: rule__Stream__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Stream__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1725:1: ( ( ',' ) )
            // InternalX21.g:1726:1: ( ',' )
            {
            // InternalX21.g:1726:1: ( ',' )
            // InternalX21.g:1727:2: ','
            {
             before(grammarAccess.getStreamAccess().getCommaKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalX21.g:1736:1: rule__Stream__Group_2__1 : rule__Stream__Group_2__1__Impl ;
    public final void rule__Stream__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1740:1: ( rule__Stream__Group_2__1__Impl )
            // InternalX21.g:1741:2: rule__Stream__Group_2__1__Impl
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
    // InternalX21.g:1747:1: rule__Stream__Group_2__1__Impl : ( ( rule__Stream__InputsAssignment_2_1 ) ) ;
    public final void rule__Stream__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1751:1: ( ( ( rule__Stream__InputsAssignment_2_1 ) ) )
            // InternalX21.g:1752:1: ( ( rule__Stream__InputsAssignment_2_1 ) )
            {
            // InternalX21.g:1752:1: ( ( rule__Stream__InputsAssignment_2_1 ) )
            // InternalX21.g:1753:2: ( rule__Stream__InputsAssignment_2_1 )
            {
             before(grammarAccess.getStreamAccess().getInputsAssignment_2_1()); 
            // InternalX21.g:1754:2: ( rule__Stream__InputsAssignment_2_1 )
            // InternalX21.g:1754:3: rule__Stream__InputsAssignment_2_1
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
    // InternalX21.g:1763:1: rule__Stream__Group_3__0 : rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1 ;
    public final void rule__Stream__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1767:1: ( rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1 )
            // InternalX21.g:1768:2: rule__Stream__Group_3__0__Impl rule__Stream__Group_3__1
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
    // InternalX21.g:1775:1: rule__Stream__Group_3__0__Impl : ( 'to' ) ;
    public final void rule__Stream__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1779:1: ( ( 'to' ) )
            // InternalX21.g:1780:1: ( 'to' )
            {
            // InternalX21.g:1780:1: ( 'to' )
            // InternalX21.g:1781:2: 'to'
            {
             before(grammarAccess.getStreamAccess().getToKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalX21.g:1790:1: rule__Stream__Group_3__1 : rule__Stream__Group_3__1__Impl rule__Stream__Group_3__2 ;
    public final void rule__Stream__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1794:1: ( rule__Stream__Group_3__1__Impl rule__Stream__Group_3__2 )
            // InternalX21.g:1795:2: rule__Stream__Group_3__1__Impl rule__Stream__Group_3__2
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
    // InternalX21.g:1802:1: rule__Stream__Group_3__1__Impl : ( ( rule__Stream__ElementsAssignment_3_1 ) ) ;
    public final void rule__Stream__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1806:1: ( ( ( rule__Stream__ElementsAssignment_3_1 ) ) )
            // InternalX21.g:1807:1: ( ( rule__Stream__ElementsAssignment_3_1 ) )
            {
            // InternalX21.g:1807:1: ( ( rule__Stream__ElementsAssignment_3_1 ) )
            // InternalX21.g:1808:2: ( rule__Stream__ElementsAssignment_3_1 )
            {
             before(grammarAccess.getStreamAccess().getElementsAssignment_3_1()); 
            // InternalX21.g:1809:2: ( rule__Stream__ElementsAssignment_3_1 )
            // InternalX21.g:1809:3: rule__Stream__ElementsAssignment_3_1
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
    // InternalX21.g:1817:1: rule__Stream__Group_3__2 : rule__Stream__Group_3__2__Impl ;
    public final void rule__Stream__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1821:1: ( rule__Stream__Group_3__2__Impl )
            // InternalX21.g:1822:2: rule__Stream__Group_3__2__Impl
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
    // InternalX21.g:1828:1: rule__Stream__Group_3__2__Impl : ( ( rule__Stream__Group_3_2__0 )* ) ;
    public final void rule__Stream__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1832:1: ( ( ( rule__Stream__Group_3_2__0 )* ) )
            // InternalX21.g:1833:1: ( ( rule__Stream__Group_3_2__0 )* )
            {
            // InternalX21.g:1833:1: ( ( rule__Stream__Group_3_2__0 )* )
            // InternalX21.g:1834:2: ( rule__Stream__Group_3_2__0 )*
            {
             before(grammarAccess.getStreamAccess().getGroup_3_2()); 
            // InternalX21.g:1835:2: ( rule__Stream__Group_3_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalX21.g:1835:3: rule__Stream__Group_3_2__0
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
    // InternalX21.g:1844:1: rule__Stream__Group_3_2__0 : rule__Stream__Group_3_2__0__Impl rule__Stream__Group_3_2__1 ;
    public final void rule__Stream__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1848:1: ( rule__Stream__Group_3_2__0__Impl rule__Stream__Group_3_2__1 )
            // InternalX21.g:1849:2: rule__Stream__Group_3_2__0__Impl rule__Stream__Group_3_2__1
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
    // InternalX21.g:1856:1: rule__Stream__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Stream__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1860:1: ( ( ',' ) )
            // InternalX21.g:1861:1: ( ',' )
            {
            // InternalX21.g:1861:1: ( ',' )
            // InternalX21.g:1862:2: ','
            {
             before(grammarAccess.getStreamAccess().getCommaKeyword_3_2_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalX21.g:1871:1: rule__Stream__Group_3_2__1 : rule__Stream__Group_3_2__1__Impl ;
    public final void rule__Stream__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1875:1: ( rule__Stream__Group_3_2__1__Impl )
            // InternalX21.g:1876:2: rule__Stream__Group_3_2__1__Impl
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
    // InternalX21.g:1882:1: rule__Stream__Group_3_2__1__Impl : ( ( rule__Stream__ElementsAssignment_3_2_1 ) ) ;
    public final void rule__Stream__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1886:1: ( ( ( rule__Stream__ElementsAssignment_3_2_1 ) ) )
            // InternalX21.g:1887:1: ( ( rule__Stream__ElementsAssignment_3_2_1 ) )
            {
            // InternalX21.g:1887:1: ( ( rule__Stream__ElementsAssignment_3_2_1 ) )
            // InternalX21.g:1888:2: ( rule__Stream__ElementsAssignment_3_2_1 )
            {
             before(grammarAccess.getStreamAccess().getElementsAssignment_3_2_1()); 
            // InternalX21.g:1889:2: ( rule__Stream__ElementsAssignment_3_2_1 )
            // InternalX21.g:1889:3: rule__Stream__ElementsAssignment_3_2_1
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
    // InternalX21.g:1898:1: rule__Element__Group_1__0 : rule__Element__Group_1__0__Impl rule__Element__Group_1__1 ;
    public final void rule__Element__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1902:1: ( rule__Element__Group_1__0__Impl rule__Element__Group_1__1 )
            // InternalX21.g:1903:2: rule__Element__Group_1__0__Impl rule__Element__Group_1__1
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
    // InternalX21.g:1910:1: rule__Element__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Element__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1914:1: ( ( '[' ) )
            // InternalX21.g:1915:1: ( '[' )
            {
            // InternalX21.g:1915:1: ( '[' )
            // InternalX21.g:1916:2: '['
            {
             before(grammarAccess.getElementAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalX21.g:1925:1: rule__Element__Group_1__1 : rule__Element__Group_1__1__Impl rule__Element__Group_1__2 ;
    public final void rule__Element__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1929:1: ( rule__Element__Group_1__1__Impl rule__Element__Group_1__2 )
            // InternalX21.g:1930:2: rule__Element__Group_1__1__Impl rule__Element__Group_1__2
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
    // InternalX21.g:1937:1: rule__Element__Group_1__1__Impl : ( ( rule__Element__Alternatives_1_1 ) ) ;
    public final void rule__Element__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1941:1: ( ( ( rule__Element__Alternatives_1_1 ) ) )
            // InternalX21.g:1942:1: ( ( rule__Element__Alternatives_1_1 ) )
            {
            // InternalX21.g:1942:1: ( ( rule__Element__Alternatives_1_1 ) )
            // InternalX21.g:1943:2: ( rule__Element__Alternatives_1_1 )
            {
             before(grammarAccess.getElementAccess().getAlternatives_1_1()); 
            // InternalX21.g:1944:2: ( rule__Element__Alternatives_1_1 )
            // InternalX21.g:1944:3: rule__Element__Alternatives_1_1
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
    // InternalX21.g:1952:1: rule__Element__Group_1__2 : rule__Element__Group_1__2__Impl ;
    public final void rule__Element__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1956:1: ( rule__Element__Group_1__2__Impl )
            // InternalX21.g:1957:2: rule__Element__Group_1__2__Impl
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
    // InternalX21.g:1963:1: rule__Element__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Element__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1967:1: ( ( ']' ) )
            // InternalX21.g:1968:1: ( ']' )
            {
            // InternalX21.g:1968:1: ( ']' )
            // InternalX21.g:1969:2: ']'
            {
             before(grammarAccess.getElementAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalX21.g:1979:1: rule__Element__Group_2__0 : rule__Element__Group_2__0__Impl rule__Element__Group_2__1 ;
    public final void rule__Element__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1983:1: ( rule__Element__Group_2__0__Impl rule__Element__Group_2__1 )
            // InternalX21.g:1984:2: rule__Element__Group_2__0__Impl rule__Element__Group_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalX21.g:1991:1: rule__Element__Group_2__0__Impl : ( 'output' ) ;
    public final void rule__Element__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:1995:1: ( ( 'output' ) )
            // InternalX21.g:1996:1: ( 'output' )
            {
            // InternalX21.g:1996:1: ( 'output' )
            // InternalX21.g:1997:2: 'output'
            {
             before(grammarAccess.getElementAccess().getOutputKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalX21.g:2006:1: rule__Element__Group_2__1 : rule__Element__Group_2__1__Impl ;
    public final void rule__Element__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2010:1: ( rule__Element__Group_2__1__Impl )
            // InternalX21.g:2011:2: rule__Element__Group_2__1__Impl
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
    // InternalX21.g:2017:1: rule__Element__Group_2__1__Impl : ( ( rule__Element__OutputNameAssignment_2_1 ) ) ;
    public final void rule__Element__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2021:1: ( ( ( rule__Element__OutputNameAssignment_2_1 ) ) )
            // InternalX21.g:2022:1: ( ( rule__Element__OutputNameAssignment_2_1 ) )
            {
            // InternalX21.g:2022:1: ( ( rule__Element__OutputNameAssignment_2_1 ) )
            // InternalX21.g:2023:2: ( rule__Element__OutputNameAssignment_2_1 )
            {
             before(grammarAccess.getElementAccess().getOutputNameAssignment_2_1()); 
            // InternalX21.g:2024:2: ( rule__Element__OutputNameAssignment_2_1 )
            // InternalX21.g:2024:3: rule__Element__OutputNameAssignment_2_1
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
    // InternalX21.g:2033:1: rule__DataDecl__Group__0 : rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1 ;
    public final void rule__DataDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2037:1: ( rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1 )
            // InternalX21.g:2038:2: rule__DataDecl__Group__0__Impl rule__DataDecl__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalX21.g:2045:1: rule__DataDecl__Group__0__Impl : ( 'data' ) ;
    public final void rule__DataDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2049:1: ( ( 'data' ) )
            // InternalX21.g:2050:1: ( 'data' )
            {
            // InternalX21.g:2050:1: ( 'data' )
            // InternalX21.g:2051:2: 'data'
            {
             before(grammarAccess.getDataDeclAccess().getDataKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalX21.g:2060:1: rule__DataDecl__Group__1 : rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2 ;
    public final void rule__DataDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2064:1: ( rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2 )
            // InternalX21.g:2065:2: rule__DataDecl__Group__1__Impl rule__DataDecl__Group__2
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
    // InternalX21.g:2072:1: rule__DataDecl__Group__1__Impl : ( ( rule__DataDecl__NameAssignment_1 ) ) ;
    public final void rule__DataDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2076:1: ( ( ( rule__DataDecl__NameAssignment_1 ) ) )
            // InternalX21.g:2077:1: ( ( rule__DataDecl__NameAssignment_1 ) )
            {
            // InternalX21.g:2077:1: ( ( rule__DataDecl__NameAssignment_1 ) )
            // InternalX21.g:2078:2: ( rule__DataDecl__NameAssignment_1 )
            {
             before(grammarAccess.getDataDeclAccess().getNameAssignment_1()); 
            // InternalX21.g:2079:2: ( rule__DataDecl__NameAssignment_1 )
            // InternalX21.g:2079:3: rule__DataDecl__NameAssignment_1
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
    // InternalX21.g:2087:1: rule__DataDecl__Group__2 : rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3 ;
    public final void rule__DataDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2091:1: ( rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3 )
            // InternalX21.g:2092:2: rule__DataDecl__Group__2__Impl rule__DataDecl__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalX21.g:2099:1: rule__DataDecl__Group__2__Impl : ( '{' ) ;
    public final void rule__DataDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2103:1: ( ( '{' ) )
            // InternalX21.g:2104:1: ( '{' )
            {
            // InternalX21.g:2104:1: ( '{' )
            // InternalX21.g:2105:2: '{'
            {
             before(grammarAccess.getDataDeclAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalX21.g:2114:1: rule__DataDecl__Group__3 : rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4 ;
    public final void rule__DataDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2118:1: ( rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4 )
            // InternalX21.g:2119:2: rule__DataDecl__Group__3__Impl rule__DataDecl__Group__4
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
    // InternalX21.g:2126:1: rule__DataDecl__Group__3__Impl : ( ( rule__DataDecl__DeclNamesAssignment_3 ) ) ;
    public final void rule__DataDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2130:1: ( ( ( rule__DataDecl__DeclNamesAssignment_3 ) ) )
            // InternalX21.g:2131:1: ( ( rule__DataDecl__DeclNamesAssignment_3 ) )
            {
            // InternalX21.g:2131:1: ( ( rule__DataDecl__DeclNamesAssignment_3 ) )
            // InternalX21.g:2132:2: ( rule__DataDecl__DeclNamesAssignment_3 )
            {
             before(grammarAccess.getDataDeclAccess().getDeclNamesAssignment_3()); 
            // InternalX21.g:2133:2: ( rule__DataDecl__DeclNamesAssignment_3 )
            // InternalX21.g:2133:3: rule__DataDecl__DeclNamesAssignment_3
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
    // InternalX21.g:2141:1: rule__DataDecl__Group__4 : rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5 ;
    public final void rule__DataDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2145:1: ( rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5 )
            // InternalX21.g:2146:2: rule__DataDecl__Group__4__Impl rule__DataDecl__Group__5
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
    // InternalX21.g:2153:1: rule__DataDecl__Group__4__Impl : ( ':' ) ;
    public final void rule__DataDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2157:1: ( ( ':' ) )
            // InternalX21.g:2158:1: ( ':' )
            {
            // InternalX21.g:2158:1: ( ':' )
            // InternalX21.g:2159:2: ':'
            {
             before(grammarAccess.getDataDeclAccess().getColonKeyword_4()); 
            match(input,20,FOLLOW_2); 
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
    // InternalX21.g:2168:1: rule__DataDecl__Group__5 : rule__DataDecl__Group__5__Impl rule__DataDecl__Group__6 ;
    public final void rule__DataDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2172:1: ( rule__DataDecl__Group__5__Impl rule__DataDecl__Group__6 )
            // InternalX21.g:2173:2: rule__DataDecl__Group__5__Impl rule__DataDecl__Group__6
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
    // InternalX21.g:2180:1: rule__DataDecl__Group__5__Impl : ( ( rule__DataDecl__TypesAssignment_5 ) ) ;
    public final void rule__DataDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2184:1: ( ( ( rule__DataDecl__TypesAssignment_5 ) ) )
            // InternalX21.g:2185:1: ( ( rule__DataDecl__TypesAssignment_5 ) )
            {
            // InternalX21.g:2185:1: ( ( rule__DataDecl__TypesAssignment_5 ) )
            // InternalX21.g:2186:2: ( rule__DataDecl__TypesAssignment_5 )
            {
             before(grammarAccess.getDataDeclAccess().getTypesAssignment_5()); 
            // InternalX21.g:2187:2: ( rule__DataDecl__TypesAssignment_5 )
            // InternalX21.g:2187:3: rule__DataDecl__TypesAssignment_5
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
    // InternalX21.g:2195:1: rule__DataDecl__Group__6 : rule__DataDecl__Group__6__Impl rule__DataDecl__Group__7 ;
    public final void rule__DataDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2199:1: ( rule__DataDecl__Group__6__Impl rule__DataDecl__Group__7 )
            // InternalX21.g:2200:2: rule__DataDecl__Group__6__Impl rule__DataDecl__Group__7
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
    // InternalX21.g:2207:1: rule__DataDecl__Group__6__Impl : ( ( rule__DataDecl__Group_6__0 )* ) ;
    public final void rule__DataDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2211:1: ( ( ( rule__DataDecl__Group_6__0 )* ) )
            // InternalX21.g:2212:1: ( ( rule__DataDecl__Group_6__0 )* )
            {
            // InternalX21.g:2212:1: ( ( rule__DataDecl__Group_6__0 )* )
            // InternalX21.g:2213:2: ( rule__DataDecl__Group_6__0 )*
            {
             before(grammarAccess.getDataDeclAccess().getGroup_6()); 
            // InternalX21.g:2214:2: ( rule__DataDecl__Group_6__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalX21.g:2214:3: rule__DataDecl__Group_6__0
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
    // InternalX21.g:2222:1: rule__DataDecl__Group__7 : rule__DataDecl__Group__7__Impl ;
    public final void rule__DataDecl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2226:1: ( rule__DataDecl__Group__7__Impl )
            // InternalX21.g:2227:2: rule__DataDecl__Group__7__Impl
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
    // InternalX21.g:2233:1: rule__DataDecl__Group__7__Impl : ( '}' ) ;
    public final void rule__DataDecl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2237:1: ( ( '}' ) )
            // InternalX21.g:2238:1: ( '}' )
            {
            // InternalX21.g:2238:1: ( '}' )
            // InternalX21.g:2239:2: '}'
            {
             before(grammarAccess.getDataDeclAccess().getRightCurlyBracketKeyword_7()); 
            match(input,25,FOLLOW_2); 
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
    // InternalX21.g:2249:1: rule__DataDecl__Group_6__0 : rule__DataDecl__Group_6__0__Impl rule__DataDecl__Group_6__1 ;
    public final void rule__DataDecl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2253:1: ( rule__DataDecl__Group_6__0__Impl rule__DataDecl__Group_6__1 )
            // InternalX21.g:2254:2: rule__DataDecl__Group_6__0__Impl rule__DataDecl__Group_6__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalX21.g:2261:1: rule__DataDecl__Group_6__0__Impl : ( ',' ) ;
    public final void rule__DataDecl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2265:1: ( ( ',' ) )
            // InternalX21.g:2266:1: ( ',' )
            {
            // InternalX21.g:2266:1: ( ',' )
            // InternalX21.g:2267:2: ','
            {
             before(grammarAccess.getDataDeclAccess().getCommaKeyword_6_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalX21.g:2276:1: rule__DataDecl__Group_6__1 : rule__DataDecl__Group_6__1__Impl rule__DataDecl__Group_6__2 ;
    public final void rule__DataDecl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2280:1: ( rule__DataDecl__Group_6__1__Impl rule__DataDecl__Group_6__2 )
            // InternalX21.g:2281:2: rule__DataDecl__Group_6__1__Impl rule__DataDecl__Group_6__2
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
    // InternalX21.g:2288:1: rule__DataDecl__Group_6__1__Impl : ( ( rule__DataDecl__DeclNamesAssignment_6_1 ) ) ;
    public final void rule__DataDecl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2292:1: ( ( ( rule__DataDecl__DeclNamesAssignment_6_1 ) ) )
            // InternalX21.g:2293:1: ( ( rule__DataDecl__DeclNamesAssignment_6_1 ) )
            {
            // InternalX21.g:2293:1: ( ( rule__DataDecl__DeclNamesAssignment_6_1 ) )
            // InternalX21.g:2294:2: ( rule__DataDecl__DeclNamesAssignment_6_1 )
            {
             before(grammarAccess.getDataDeclAccess().getDeclNamesAssignment_6_1()); 
            // InternalX21.g:2295:2: ( rule__DataDecl__DeclNamesAssignment_6_1 )
            // InternalX21.g:2295:3: rule__DataDecl__DeclNamesAssignment_6_1
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
    // InternalX21.g:2303:1: rule__DataDecl__Group_6__2 : rule__DataDecl__Group_6__2__Impl rule__DataDecl__Group_6__3 ;
    public final void rule__DataDecl__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2307:1: ( rule__DataDecl__Group_6__2__Impl rule__DataDecl__Group_6__3 )
            // InternalX21.g:2308:2: rule__DataDecl__Group_6__2__Impl rule__DataDecl__Group_6__3
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
    // InternalX21.g:2315:1: rule__DataDecl__Group_6__2__Impl : ( ':' ) ;
    public final void rule__DataDecl__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2319:1: ( ( ':' ) )
            // InternalX21.g:2320:1: ( ':' )
            {
            // InternalX21.g:2320:1: ( ':' )
            // InternalX21.g:2321:2: ':'
            {
             before(grammarAccess.getDataDeclAccess().getColonKeyword_6_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalX21.g:2330:1: rule__DataDecl__Group_6__3 : rule__DataDecl__Group_6__3__Impl ;
    public final void rule__DataDecl__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2334:1: ( rule__DataDecl__Group_6__3__Impl )
            // InternalX21.g:2335:2: rule__DataDecl__Group_6__3__Impl
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
    // InternalX21.g:2341:1: rule__DataDecl__Group_6__3__Impl : ( ( rule__DataDecl__TypesAssignment_6_3 ) ) ;
    public final void rule__DataDecl__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2345:1: ( ( ( rule__DataDecl__TypesAssignment_6_3 ) ) )
            // InternalX21.g:2346:1: ( ( rule__DataDecl__TypesAssignment_6_3 ) )
            {
            // InternalX21.g:2346:1: ( ( rule__DataDecl__TypesAssignment_6_3 ) )
            // InternalX21.g:2347:2: ( rule__DataDecl__TypesAssignment_6_3 )
            {
             before(grammarAccess.getDataDeclAccess().getTypesAssignment_6_3()); 
            // InternalX21.g:2348:2: ( rule__DataDecl__TypesAssignment_6_3 )
            // InternalX21.g:2348:3: rule__DataDecl__TypesAssignment_6_3
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
    // InternalX21.g:2357:1: rule__PlusMinus__Group__0 : rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1 ;
    public final void rule__PlusMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2361:1: ( rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1 )
            // InternalX21.g:2362:2: rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1
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
    // InternalX21.g:2369:1: rule__PlusMinus__Group__0__Impl : ( ruleMulDiv ) ;
    public final void rule__PlusMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2373:1: ( ( ruleMulDiv ) )
            // InternalX21.g:2374:1: ( ruleMulDiv )
            {
            // InternalX21.g:2374:1: ( ruleMulDiv )
            // InternalX21.g:2375:2: ruleMulDiv
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
    // InternalX21.g:2384:1: rule__PlusMinus__Group__1 : rule__PlusMinus__Group__1__Impl ;
    public final void rule__PlusMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2388:1: ( rule__PlusMinus__Group__1__Impl )
            // InternalX21.g:2389:2: rule__PlusMinus__Group__1__Impl
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
    // InternalX21.g:2395:1: rule__PlusMinus__Group__1__Impl : ( ( rule__PlusMinus__Group_1__0 )* ) ;
    public final void rule__PlusMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2399:1: ( ( ( rule__PlusMinus__Group_1__0 )* ) )
            // InternalX21.g:2400:1: ( ( rule__PlusMinus__Group_1__0 )* )
            {
            // InternalX21.g:2400:1: ( ( rule__PlusMinus__Group_1__0 )* )
            // InternalX21.g:2401:2: ( rule__PlusMinus__Group_1__0 )*
            {
             before(grammarAccess.getPlusMinusAccess().getGroup_1()); 
            // InternalX21.g:2402:2: ( rule__PlusMinus__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=35 && LA16_0<=36)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalX21.g:2402:3: rule__PlusMinus__Group_1__0
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
    // InternalX21.g:2411:1: rule__PlusMinus__Group_1__0 : rule__PlusMinus__Group_1__0__Impl rule__PlusMinus__Group_1__1 ;
    public final void rule__PlusMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2415:1: ( rule__PlusMinus__Group_1__0__Impl rule__PlusMinus__Group_1__1 )
            // InternalX21.g:2416:2: rule__PlusMinus__Group_1__0__Impl rule__PlusMinus__Group_1__1
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
    // InternalX21.g:2423:1: rule__PlusMinus__Group_1__0__Impl : ( ( rule__PlusMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2427:1: ( ( ( rule__PlusMinus__Alternatives_1_0 ) ) )
            // InternalX21.g:2428:1: ( ( rule__PlusMinus__Alternatives_1_0 ) )
            {
            // InternalX21.g:2428:1: ( ( rule__PlusMinus__Alternatives_1_0 ) )
            // InternalX21.g:2429:2: ( rule__PlusMinus__Alternatives_1_0 )
            {
             before(grammarAccess.getPlusMinusAccess().getAlternatives_1_0()); 
            // InternalX21.g:2430:2: ( rule__PlusMinus__Alternatives_1_0 )
            // InternalX21.g:2430:3: rule__PlusMinus__Alternatives_1_0
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
    // InternalX21.g:2438:1: rule__PlusMinus__Group_1__1 : rule__PlusMinus__Group_1__1__Impl ;
    public final void rule__PlusMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2442:1: ( rule__PlusMinus__Group_1__1__Impl )
            // InternalX21.g:2443:2: rule__PlusMinus__Group_1__1__Impl
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
    // InternalX21.g:2449:1: rule__PlusMinus__Group_1__1__Impl : ( ( rule__PlusMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2453:1: ( ( ( rule__PlusMinus__RightAssignment_1_1 ) ) )
            // InternalX21.g:2454:1: ( ( rule__PlusMinus__RightAssignment_1_1 ) )
            {
            // InternalX21.g:2454:1: ( ( rule__PlusMinus__RightAssignment_1_1 ) )
            // InternalX21.g:2455:2: ( rule__PlusMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusMinusAccess().getRightAssignment_1_1()); 
            // InternalX21.g:2456:2: ( rule__PlusMinus__RightAssignment_1_1 )
            // InternalX21.g:2456:3: rule__PlusMinus__RightAssignment_1_1
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
    // InternalX21.g:2465:1: rule__PlusMinus__Group_1_0_0__0 : rule__PlusMinus__Group_1_0_0__0__Impl rule__PlusMinus__Group_1_0_0__1 ;
    public final void rule__PlusMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2469:1: ( rule__PlusMinus__Group_1_0_0__0__Impl rule__PlusMinus__Group_1_0_0__1 )
            // InternalX21.g:2470:2: rule__PlusMinus__Group_1_0_0__0__Impl rule__PlusMinus__Group_1_0_0__1
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
    // InternalX21.g:2477:1: rule__PlusMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2481:1: ( ( () ) )
            // InternalX21.g:2482:1: ( () )
            {
            // InternalX21.g:2482:1: ( () )
            // InternalX21.g:2483:2: ()
            {
             before(grammarAccess.getPlusMinusAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalX21.g:2484:2: ()
            // InternalX21.g:2484:3: 
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
    // InternalX21.g:2492:1: rule__PlusMinus__Group_1_0_0__1 : rule__PlusMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2496:1: ( rule__PlusMinus__Group_1_0_0__1__Impl )
            // InternalX21.g:2497:2: rule__PlusMinus__Group_1_0_0__1__Impl
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
    // InternalX21.g:2503:1: rule__PlusMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2507:1: ( ( '+' ) )
            // InternalX21.g:2508:1: ( '+' )
            {
            // InternalX21.g:2508:1: ( '+' )
            // InternalX21.g:2509:2: '+'
            {
             before(grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalX21.g:2519:1: rule__PlusMinus__Group_1_0_1__0 : rule__PlusMinus__Group_1_0_1__0__Impl rule__PlusMinus__Group_1_0_1__1 ;
    public final void rule__PlusMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2523:1: ( rule__PlusMinus__Group_1_0_1__0__Impl rule__PlusMinus__Group_1_0_1__1 )
            // InternalX21.g:2524:2: rule__PlusMinus__Group_1_0_1__0__Impl rule__PlusMinus__Group_1_0_1__1
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
    // InternalX21.g:2531:1: rule__PlusMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2535:1: ( ( () ) )
            // InternalX21.g:2536:1: ( () )
            {
            // InternalX21.g:2536:1: ( () )
            // InternalX21.g:2537:2: ()
            {
             before(grammarAccess.getPlusMinusAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalX21.g:2538:2: ()
            // InternalX21.g:2538:3: 
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
    // InternalX21.g:2546:1: rule__PlusMinus__Group_1_0_1__1 : rule__PlusMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2550:1: ( rule__PlusMinus__Group_1_0_1__1__Impl )
            // InternalX21.g:2551:2: rule__PlusMinus__Group_1_0_1__1__Impl
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
    // InternalX21.g:2557:1: rule__PlusMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2561:1: ( ( '-' ) )
            // InternalX21.g:2562:1: ( '-' )
            {
            // InternalX21.g:2562:1: ( '-' )
            // InternalX21.g:2563:2: '-'
            {
             before(grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalX21.g:2573:1: rule__MulDiv__Group__0 : rule__MulDiv__Group__0__Impl rule__MulDiv__Group__1 ;
    public final void rule__MulDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2577:1: ( rule__MulDiv__Group__0__Impl rule__MulDiv__Group__1 )
            // InternalX21.g:2578:2: rule__MulDiv__Group__0__Impl rule__MulDiv__Group__1
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
    // InternalX21.g:2585:1: rule__MulDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2589:1: ( ( rulePrimary ) )
            // InternalX21.g:2590:1: ( rulePrimary )
            {
            // InternalX21.g:2590:1: ( rulePrimary )
            // InternalX21.g:2591:2: rulePrimary
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
    // InternalX21.g:2600:1: rule__MulDiv__Group__1 : rule__MulDiv__Group__1__Impl ;
    public final void rule__MulDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2604:1: ( rule__MulDiv__Group__1__Impl )
            // InternalX21.g:2605:2: rule__MulDiv__Group__1__Impl
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
    // InternalX21.g:2611:1: rule__MulDiv__Group__1__Impl : ( ( rule__MulDiv__Group_1__0 )* ) ;
    public final void rule__MulDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2615:1: ( ( ( rule__MulDiv__Group_1__0 )* ) )
            // InternalX21.g:2616:1: ( ( rule__MulDiv__Group_1__0 )* )
            {
            // InternalX21.g:2616:1: ( ( rule__MulDiv__Group_1__0 )* )
            // InternalX21.g:2617:2: ( rule__MulDiv__Group_1__0 )*
            {
             before(grammarAccess.getMulDivAccess().getGroup_1()); 
            // InternalX21.g:2618:2: ( rule__MulDiv__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=37 && LA17_0<=38)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalX21.g:2618:3: rule__MulDiv__Group_1__0
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
    // InternalX21.g:2627:1: rule__MulDiv__Group_1__0 : rule__MulDiv__Group_1__0__Impl rule__MulDiv__Group_1__1 ;
    public final void rule__MulDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2631:1: ( rule__MulDiv__Group_1__0__Impl rule__MulDiv__Group_1__1 )
            // InternalX21.g:2632:2: rule__MulDiv__Group_1__0__Impl rule__MulDiv__Group_1__1
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
    // InternalX21.g:2639:1: rule__MulDiv__Group_1__0__Impl : ( ( rule__MulDiv__Alternatives_1_0 ) ) ;
    public final void rule__MulDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2643:1: ( ( ( rule__MulDiv__Alternatives_1_0 ) ) )
            // InternalX21.g:2644:1: ( ( rule__MulDiv__Alternatives_1_0 ) )
            {
            // InternalX21.g:2644:1: ( ( rule__MulDiv__Alternatives_1_0 ) )
            // InternalX21.g:2645:2: ( rule__MulDiv__Alternatives_1_0 )
            {
             before(grammarAccess.getMulDivAccess().getAlternatives_1_0()); 
            // InternalX21.g:2646:2: ( rule__MulDiv__Alternatives_1_0 )
            // InternalX21.g:2646:3: rule__MulDiv__Alternatives_1_0
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
    // InternalX21.g:2654:1: rule__MulDiv__Group_1__1 : rule__MulDiv__Group_1__1__Impl ;
    public final void rule__MulDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2658:1: ( rule__MulDiv__Group_1__1__Impl )
            // InternalX21.g:2659:2: rule__MulDiv__Group_1__1__Impl
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
    // InternalX21.g:2665:1: rule__MulDiv__Group_1__1__Impl : ( ( rule__MulDiv__RightAssignment_1_1 ) ) ;
    public final void rule__MulDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2669:1: ( ( ( rule__MulDiv__RightAssignment_1_1 ) ) )
            // InternalX21.g:2670:1: ( ( rule__MulDiv__RightAssignment_1_1 ) )
            {
            // InternalX21.g:2670:1: ( ( rule__MulDiv__RightAssignment_1_1 ) )
            // InternalX21.g:2671:2: ( rule__MulDiv__RightAssignment_1_1 )
            {
             before(grammarAccess.getMulDivAccess().getRightAssignment_1_1()); 
            // InternalX21.g:2672:2: ( rule__MulDiv__RightAssignment_1_1 )
            // InternalX21.g:2672:3: rule__MulDiv__RightAssignment_1_1
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
    // InternalX21.g:2681:1: rule__MulDiv__Group_1_0_0__0 : rule__MulDiv__Group_1_0_0__0__Impl rule__MulDiv__Group_1_0_0__1 ;
    public final void rule__MulDiv__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2685:1: ( rule__MulDiv__Group_1_0_0__0__Impl rule__MulDiv__Group_1_0_0__1 )
            // InternalX21.g:2686:2: rule__MulDiv__Group_1_0_0__0__Impl rule__MulDiv__Group_1_0_0__1
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
    // InternalX21.g:2693:1: rule__MulDiv__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__MulDiv__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2697:1: ( ( () ) )
            // InternalX21.g:2698:1: ( () )
            {
            // InternalX21.g:2698:1: ( () )
            // InternalX21.g:2699:2: ()
            {
             before(grammarAccess.getMulDivAccess().getMultLeftAction_1_0_0_0()); 
            // InternalX21.g:2700:2: ()
            // InternalX21.g:2700:3: 
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
    // InternalX21.g:2708:1: rule__MulDiv__Group_1_0_0__1 : rule__MulDiv__Group_1_0_0__1__Impl ;
    public final void rule__MulDiv__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2712:1: ( rule__MulDiv__Group_1_0_0__1__Impl )
            // InternalX21.g:2713:2: rule__MulDiv__Group_1_0_0__1__Impl
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
    // InternalX21.g:2719:1: rule__MulDiv__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__MulDiv__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2723:1: ( ( '*' ) )
            // InternalX21.g:2724:1: ( '*' )
            {
            // InternalX21.g:2724:1: ( '*' )
            // InternalX21.g:2725:2: '*'
            {
             before(grammarAccess.getMulDivAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalX21.g:2735:1: rule__MulDiv__Group_1_0_1__0 : rule__MulDiv__Group_1_0_1__0__Impl rule__MulDiv__Group_1_0_1__1 ;
    public final void rule__MulDiv__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2739:1: ( rule__MulDiv__Group_1_0_1__0__Impl rule__MulDiv__Group_1_0_1__1 )
            // InternalX21.g:2740:2: rule__MulDiv__Group_1_0_1__0__Impl rule__MulDiv__Group_1_0_1__1
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
    // InternalX21.g:2747:1: rule__MulDiv__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__MulDiv__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2751:1: ( ( () ) )
            // InternalX21.g:2752:1: ( () )
            {
            // InternalX21.g:2752:1: ( () )
            // InternalX21.g:2753:2: ()
            {
             before(grammarAccess.getMulDivAccess().getDivLeftAction_1_0_1_0()); 
            // InternalX21.g:2754:2: ()
            // InternalX21.g:2754:3: 
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
    // InternalX21.g:2762:1: rule__MulDiv__Group_1_0_1__1 : rule__MulDiv__Group_1_0_1__1__Impl ;
    public final void rule__MulDiv__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2766:1: ( rule__MulDiv__Group_1_0_1__1__Impl )
            // InternalX21.g:2767:2: rule__MulDiv__Group_1_0_1__1__Impl
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
    // InternalX21.g:2773:1: rule__MulDiv__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__MulDiv__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2777:1: ( ( '/' ) )
            // InternalX21.g:2778:1: ( '/' )
            {
            // InternalX21.g:2778:1: ( '/' )
            // InternalX21.g:2779:2: '/'
            {
             before(grammarAccess.getMulDivAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalX21.g:2789:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2793:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalX21.g:2794:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
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
    // InternalX21.g:2801:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2805:1: ( ( () ) )
            // InternalX21.g:2806:1: ( () )
            {
            // InternalX21.g:2806:1: ( () )
            // InternalX21.g:2807:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getParenthesisAction_1_0()); 
            // InternalX21.g:2808:2: ()
            // InternalX21.g:2808:3: 
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
    // InternalX21.g:2816:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2820:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalX21.g:2821:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
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
    // InternalX21.g:2828:1: rule__Primary__Group_1__1__Impl : ( '(' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2832:1: ( ( '(' ) )
            // InternalX21.g:2833:1: ( '(' )
            {
            // InternalX21.g:2833:1: ( '(' )
            // InternalX21.g:2834:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalX21.g:2843:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl rule__Primary__Group_1__3 ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2847:1: ( rule__Primary__Group_1__2__Impl rule__Primary__Group_1__3 )
            // InternalX21.g:2848:2: rule__Primary__Group_1__2__Impl rule__Primary__Group_1__3
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
    // InternalX21.g:2855:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2859:1: ( ( ( rule__Primary__ExpressionAssignment_1_2 ) ) )
            // InternalX21.g:2860:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            {
            // InternalX21.g:2860:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            // InternalX21.g:2861:2: ( rule__Primary__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            // InternalX21.g:2862:2: ( rule__Primary__ExpressionAssignment_1_2 )
            // InternalX21.g:2862:3: rule__Primary__ExpressionAssignment_1_2
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
    // InternalX21.g:2870:1: rule__Primary__Group_1__3 : rule__Primary__Group_1__3__Impl ;
    public final void rule__Primary__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2874:1: ( rule__Primary__Group_1__3__Impl )
            // InternalX21.g:2875:2: rule__Primary__Group_1__3__Impl
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
    // InternalX21.g:2881:1: rule__Primary__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Primary__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2885:1: ( ( ')' ) )
            // InternalX21.g:2886:1: ( ')' )
            {
            // InternalX21.g:2886:1: ( ')' )
            // InternalX21.g:2887:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalX21.g:2897:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2901:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalX21.g:2902:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
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
    // InternalX21.g:2909:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2913:1: ( ( () ) )
            // InternalX21.g:2914:1: ( () )
            {
            // InternalX21.g:2914:1: ( () )
            // InternalX21.g:2915:2: ()
            {
             before(grammarAccess.getAtomicAccess().getIntValueAction_0_0()); 
            // InternalX21.g:2916:2: ()
            // InternalX21.g:2916:3: 
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
    // InternalX21.g:2924:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2928:1: ( rule__Atomic__Group_0__1__Impl )
            // InternalX21.g:2929:2: rule__Atomic__Group_0__1__Impl
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
    // InternalX21.g:2935:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2939:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // InternalX21.g:2940:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // InternalX21.g:2940:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // InternalX21.g:2941:2: ( rule__Atomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            // InternalX21.g:2942:2: ( rule__Atomic__ValueAssignment_0_1 )
            // InternalX21.g:2942:3: rule__Atomic__ValueAssignment_0_1
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
    // InternalX21.g:2951:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2955:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // InternalX21.g:2956:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
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
    // InternalX21.g:2963:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2967:1: ( ( () ) )
            // InternalX21.g:2968:1: ( () )
            {
            // InternalX21.g:2968:1: ( () )
            // InternalX21.g:2969:2: ()
            {
             before(grammarAccess.getAtomicAccess().getNoneAction_2_0()); 
            // InternalX21.g:2970:2: ()
            // InternalX21.g:2970:3: 
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
    // InternalX21.g:2978:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2982:1: ( rule__Atomic__Group_2__1__Impl )
            // InternalX21.g:2983:2: rule__Atomic__Group_2__1__Impl
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
    // InternalX21.g:2989:1: rule__Atomic__Group_2__1__Impl : ( 'none' ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:2993:1: ( ( 'none' ) )
            // InternalX21.g:2994:1: ( 'none' )
            {
            // InternalX21.g:2994:1: ( 'none' )
            // InternalX21.g:2995:2: 'none'
            {
             before(grammarAccess.getAtomicAccess().getNoneKeyword_2_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalX21.g:3005:1: rule__LetBinding__Group__0 : rule__LetBinding__Group__0__Impl rule__LetBinding__Group__1 ;
    public final void rule__LetBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3009:1: ( rule__LetBinding__Group__0__Impl rule__LetBinding__Group__1 )
            // InternalX21.g:3010:2: rule__LetBinding__Group__0__Impl rule__LetBinding__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalX21.g:3017:1: rule__LetBinding__Group__0__Impl : ( 'let' ) ;
    public final void rule__LetBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3021:1: ( ( 'let' ) )
            // InternalX21.g:3022:1: ( 'let' )
            {
            // InternalX21.g:3022:1: ( 'let' )
            // InternalX21.g:3023:2: 'let'
            {
             before(grammarAccess.getLetBindingAccess().getLetKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalX21.g:3032:1: rule__LetBinding__Group__1 : rule__LetBinding__Group__1__Impl rule__LetBinding__Group__2 ;
    public final void rule__LetBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3036:1: ( rule__LetBinding__Group__1__Impl rule__LetBinding__Group__2 )
            // InternalX21.g:3037:2: rule__LetBinding__Group__1__Impl rule__LetBinding__Group__2
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
    // InternalX21.g:3044:1: rule__LetBinding__Group__1__Impl : ( ( rule__LetBinding__NameAssignment_1 ) ) ;
    public final void rule__LetBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3048:1: ( ( ( rule__LetBinding__NameAssignment_1 ) ) )
            // InternalX21.g:3049:1: ( ( rule__LetBinding__NameAssignment_1 ) )
            {
            // InternalX21.g:3049:1: ( ( rule__LetBinding__NameAssignment_1 ) )
            // InternalX21.g:3050:2: ( rule__LetBinding__NameAssignment_1 )
            {
             before(grammarAccess.getLetBindingAccess().getNameAssignment_1()); 
            // InternalX21.g:3051:2: ( rule__LetBinding__NameAssignment_1 )
            // InternalX21.g:3051:3: rule__LetBinding__NameAssignment_1
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
    // InternalX21.g:3059:1: rule__LetBinding__Group__2 : rule__LetBinding__Group__2__Impl rule__LetBinding__Group__3 ;
    public final void rule__LetBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3063:1: ( rule__LetBinding__Group__2__Impl rule__LetBinding__Group__3 )
            // InternalX21.g:3064:2: rule__LetBinding__Group__2__Impl rule__LetBinding__Group__3
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
    // InternalX21.g:3071:1: rule__LetBinding__Group__2__Impl : ( '=' ) ;
    public final void rule__LetBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3075:1: ( ( '=' ) )
            // InternalX21.g:3076:1: ( '=' )
            {
            // InternalX21.g:3076:1: ( '=' )
            // InternalX21.g:3077:2: '='
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
    // InternalX21.g:3086:1: rule__LetBinding__Group__3 : rule__LetBinding__Group__3__Impl rule__LetBinding__Group__4 ;
    public final void rule__LetBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3090:1: ( rule__LetBinding__Group__3__Impl rule__LetBinding__Group__4 )
            // InternalX21.g:3091:2: rule__LetBinding__Group__3__Impl rule__LetBinding__Group__4
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
    // InternalX21.g:3098:1: rule__LetBinding__Group__3__Impl : ( ( rule__LetBinding__BindingAssignment_3 ) ) ;
    public final void rule__LetBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3102:1: ( ( ( rule__LetBinding__BindingAssignment_3 ) ) )
            // InternalX21.g:3103:1: ( ( rule__LetBinding__BindingAssignment_3 ) )
            {
            // InternalX21.g:3103:1: ( ( rule__LetBinding__BindingAssignment_3 ) )
            // InternalX21.g:3104:2: ( rule__LetBinding__BindingAssignment_3 )
            {
             before(grammarAccess.getLetBindingAccess().getBindingAssignment_3()); 
            // InternalX21.g:3105:2: ( rule__LetBinding__BindingAssignment_3 )
            // InternalX21.g:3105:3: rule__LetBinding__BindingAssignment_3
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
    // InternalX21.g:3113:1: rule__LetBinding__Group__4 : rule__LetBinding__Group__4__Impl rule__LetBinding__Group__5 ;
    public final void rule__LetBinding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3117:1: ( rule__LetBinding__Group__4__Impl rule__LetBinding__Group__5 )
            // InternalX21.g:3118:2: rule__LetBinding__Group__4__Impl rule__LetBinding__Group__5
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
    // InternalX21.g:3125:1: rule__LetBinding__Group__4__Impl : ( 'in' ) ;
    public final void rule__LetBinding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3129:1: ( ( 'in' ) )
            // InternalX21.g:3130:1: ( 'in' )
            {
            // InternalX21.g:3130:1: ( 'in' )
            // InternalX21.g:3131:2: 'in'
            {
             before(grammarAccess.getLetBindingAccess().getInKeyword_4()); 
            match(input,41,FOLLOW_2); 
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
    // InternalX21.g:3140:1: rule__LetBinding__Group__5 : rule__LetBinding__Group__5__Impl rule__LetBinding__Group__6 ;
    public final void rule__LetBinding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3144:1: ( rule__LetBinding__Group__5__Impl rule__LetBinding__Group__6 )
            // InternalX21.g:3145:2: rule__LetBinding__Group__5__Impl rule__LetBinding__Group__6
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
    // InternalX21.g:3152:1: rule__LetBinding__Group__5__Impl : ( ( rule__LetBinding__BodyAssignment_5 ) ) ;
    public final void rule__LetBinding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3156:1: ( ( ( rule__LetBinding__BodyAssignment_5 ) ) )
            // InternalX21.g:3157:1: ( ( rule__LetBinding__BodyAssignment_5 ) )
            {
            // InternalX21.g:3157:1: ( ( rule__LetBinding__BodyAssignment_5 ) )
            // InternalX21.g:3158:2: ( rule__LetBinding__BodyAssignment_5 )
            {
             before(grammarAccess.getLetBindingAccess().getBodyAssignment_5()); 
            // InternalX21.g:3159:2: ( rule__LetBinding__BodyAssignment_5 )
            // InternalX21.g:3159:3: rule__LetBinding__BodyAssignment_5
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
    // InternalX21.g:3167:1: rule__LetBinding__Group__6 : rule__LetBinding__Group__6__Impl ;
    public final void rule__LetBinding__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3171:1: ( rule__LetBinding__Group__6__Impl )
            // InternalX21.g:3172:2: rule__LetBinding__Group__6__Impl
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
    // InternalX21.g:3178:1: rule__LetBinding__Group__6__Impl : ( 'end' ) ;
    public final void rule__LetBinding__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3182:1: ( ( 'end' ) )
            // InternalX21.g:3183:1: ( 'end' )
            {
            // InternalX21.g:3183:1: ( 'end' )
            // InternalX21.g:3184:2: 'end'
            {
             before(grammarAccess.getLetBindingAccess().getEndKeyword_6()); 
            match(input,42,FOLLOW_2); 
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
    // InternalX21.g:3194:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3198:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalX21.g:3199:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
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
    // InternalX21.g:3206:1: rule__IfStatement__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3210:1: ( ( 'if' ) )
            // InternalX21.g:3211:1: ( 'if' )
            {
            // InternalX21.g:3211:1: ( 'if' )
            // InternalX21.g:3212:2: 'if'
            {
             before(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalX21.g:3221:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3225:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalX21.g:3226:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
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
    // InternalX21.g:3233:1: rule__IfStatement__Group__1__Impl : ( ( rule__IfStatement__StatementAssignment_1 ) ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3237:1: ( ( ( rule__IfStatement__StatementAssignment_1 ) ) )
            // InternalX21.g:3238:1: ( ( rule__IfStatement__StatementAssignment_1 ) )
            {
            // InternalX21.g:3238:1: ( ( rule__IfStatement__StatementAssignment_1 ) )
            // InternalX21.g:3239:2: ( rule__IfStatement__StatementAssignment_1 )
            {
             before(grammarAccess.getIfStatementAccess().getStatementAssignment_1()); 
            // InternalX21.g:3240:2: ( rule__IfStatement__StatementAssignment_1 )
            // InternalX21.g:3240:3: rule__IfStatement__StatementAssignment_1
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
    // InternalX21.g:3248:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3252:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // InternalX21.g:3253:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
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
    // InternalX21.g:3260:1: rule__IfStatement__Group__2__Impl : ( 'then' ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3264:1: ( ( 'then' ) )
            // InternalX21.g:3265:1: ( 'then' )
            {
            // InternalX21.g:3265:1: ( 'then' )
            // InternalX21.g:3266:2: 'then'
            {
             before(grammarAccess.getIfStatementAccess().getThenKeyword_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalX21.g:3275:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3279:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // InternalX21.g:3280:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
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
    // InternalX21.g:3287:1: rule__IfStatement__Group__3__Impl : ( ( rule__IfStatement__TrueExpressionAssignment_3 ) ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3291:1: ( ( ( rule__IfStatement__TrueExpressionAssignment_3 ) ) )
            // InternalX21.g:3292:1: ( ( rule__IfStatement__TrueExpressionAssignment_3 ) )
            {
            // InternalX21.g:3292:1: ( ( rule__IfStatement__TrueExpressionAssignment_3 ) )
            // InternalX21.g:3293:2: ( rule__IfStatement__TrueExpressionAssignment_3 )
            {
             before(grammarAccess.getIfStatementAccess().getTrueExpressionAssignment_3()); 
            // InternalX21.g:3294:2: ( rule__IfStatement__TrueExpressionAssignment_3 )
            // InternalX21.g:3294:3: rule__IfStatement__TrueExpressionAssignment_3
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
    // InternalX21.g:3302:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3306:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // InternalX21.g:3307:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
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
    // InternalX21.g:3314:1: rule__IfStatement__Group__4__Impl : ( 'else' ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3318:1: ( ( 'else' ) )
            // InternalX21.g:3319:1: ( 'else' )
            {
            // InternalX21.g:3319:1: ( 'else' )
            // InternalX21.g:3320:2: 'else'
            {
             before(grammarAccess.getIfStatementAccess().getElseKeyword_4()); 
            match(input,45,FOLLOW_2); 
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
    // InternalX21.g:3329:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3333:1: ( rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 )
            // InternalX21.g:3334:2: rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6
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
    // InternalX21.g:3341:1: rule__IfStatement__Group__5__Impl : ( ( rule__IfStatement__FalseExpressionAssignment_5 ) ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3345:1: ( ( ( rule__IfStatement__FalseExpressionAssignment_5 ) ) )
            // InternalX21.g:3346:1: ( ( rule__IfStatement__FalseExpressionAssignment_5 ) )
            {
            // InternalX21.g:3346:1: ( ( rule__IfStatement__FalseExpressionAssignment_5 ) )
            // InternalX21.g:3347:2: ( rule__IfStatement__FalseExpressionAssignment_5 )
            {
             before(grammarAccess.getIfStatementAccess().getFalseExpressionAssignment_5()); 
            // InternalX21.g:3348:2: ( rule__IfStatement__FalseExpressionAssignment_5 )
            // InternalX21.g:3348:3: rule__IfStatement__FalseExpressionAssignment_5
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
    // InternalX21.g:3356:1: rule__IfStatement__Group__6 : rule__IfStatement__Group__6__Impl ;
    public final void rule__IfStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3360:1: ( rule__IfStatement__Group__6__Impl )
            // InternalX21.g:3361:2: rule__IfStatement__Group__6__Impl
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
    // InternalX21.g:3367:1: rule__IfStatement__Group__6__Impl : ( 'end' ) ;
    public final void rule__IfStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3371:1: ( ( 'end' ) )
            // InternalX21.g:3372:1: ( 'end' )
            {
            // InternalX21.g:3372:1: ( 'end' )
            // InternalX21.g:3373:2: 'end'
            {
             before(grammarAccess.getIfStatementAccess().getEndKeyword_6()); 
            match(input,42,FOLLOW_2); 
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
    // InternalX21.g:3383:1: rule__LogicExp__Group__0 : rule__LogicExp__Group__0__Impl rule__LogicExp__Group__1 ;
    public final void rule__LogicExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3387:1: ( rule__LogicExp__Group__0__Impl rule__LogicExp__Group__1 )
            // InternalX21.g:3388:2: rule__LogicExp__Group__0__Impl rule__LogicExp__Group__1
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
    // InternalX21.g:3395:1: rule__LogicExp__Group__0__Impl : ( ( rule__LogicExp__LeftAssignment_0 ) ) ;
    public final void rule__LogicExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3399:1: ( ( ( rule__LogicExp__LeftAssignment_0 ) ) )
            // InternalX21.g:3400:1: ( ( rule__LogicExp__LeftAssignment_0 ) )
            {
            // InternalX21.g:3400:1: ( ( rule__LogicExp__LeftAssignment_0 ) )
            // InternalX21.g:3401:2: ( rule__LogicExp__LeftAssignment_0 )
            {
             before(grammarAccess.getLogicExpAccess().getLeftAssignment_0()); 
            // InternalX21.g:3402:2: ( rule__LogicExp__LeftAssignment_0 )
            // InternalX21.g:3402:3: rule__LogicExp__LeftAssignment_0
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
    // InternalX21.g:3410:1: rule__LogicExp__Group__1 : rule__LogicExp__Group__1__Impl rule__LogicExp__Group__2 ;
    public final void rule__LogicExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3414:1: ( rule__LogicExp__Group__1__Impl rule__LogicExp__Group__2 )
            // InternalX21.g:3415:2: rule__LogicExp__Group__1__Impl rule__LogicExp__Group__2
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
    // InternalX21.g:3422:1: rule__LogicExp__Group__1__Impl : ( ( rule__LogicExp__OperatorAssignment_1 ) ) ;
    public final void rule__LogicExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3426:1: ( ( ( rule__LogicExp__OperatorAssignment_1 ) ) )
            // InternalX21.g:3427:1: ( ( rule__LogicExp__OperatorAssignment_1 ) )
            {
            // InternalX21.g:3427:1: ( ( rule__LogicExp__OperatorAssignment_1 ) )
            // InternalX21.g:3428:2: ( rule__LogicExp__OperatorAssignment_1 )
            {
             before(grammarAccess.getLogicExpAccess().getOperatorAssignment_1()); 
            // InternalX21.g:3429:2: ( rule__LogicExp__OperatorAssignment_1 )
            // InternalX21.g:3429:3: rule__LogicExp__OperatorAssignment_1
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
    // InternalX21.g:3437:1: rule__LogicExp__Group__2 : rule__LogicExp__Group__2__Impl ;
    public final void rule__LogicExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3441:1: ( rule__LogicExp__Group__2__Impl )
            // InternalX21.g:3442:2: rule__LogicExp__Group__2__Impl
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
    // InternalX21.g:3448:1: rule__LogicExp__Group__2__Impl : ( ( rule__LogicExp__RightAssignment_2 ) ) ;
    public final void rule__LogicExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3452:1: ( ( ( rule__LogicExp__RightAssignment_2 ) ) )
            // InternalX21.g:3453:1: ( ( rule__LogicExp__RightAssignment_2 ) )
            {
            // InternalX21.g:3453:1: ( ( rule__LogicExp__RightAssignment_2 ) )
            // InternalX21.g:3454:2: ( rule__LogicExp__RightAssignment_2 )
            {
             before(grammarAccess.getLogicExpAccess().getRightAssignment_2()); 
            // InternalX21.g:3455:2: ( rule__LogicExp__RightAssignment_2 )
            // InternalX21.g:3455:3: rule__LogicExp__RightAssignment_2
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


    // $ANTLR start "rule__ParameterStatement__Group__0"
    // InternalX21.g:3464:1: rule__ParameterStatement__Group__0 : rule__ParameterStatement__Group__0__Impl rule__ParameterStatement__Group__1 ;
    public final void rule__ParameterStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3468:1: ( rule__ParameterStatement__Group__0__Impl rule__ParameterStatement__Group__1 )
            // InternalX21.g:3469:2: rule__ParameterStatement__Group__0__Impl rule__ParameterStatement__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__ParameterStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStatement__Group__1();

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
    // $ANTLR end "rule__ParameterStatement__Group__0"


    // $ANTLR start "rule__ParameterStatement__Group__0__Impl"
    // InternalX21.g:3476:1: rule__ParameterStatement__Group__0__Impl : ( ( rule__ParameterStatement__ObjNameAssignment_0 ) ) ;
    public final void rule__ParameterStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3480:1: ( ( ( rule__ParameterStatement__ObjNameAssignment_0 ) ) )
            // InternalX21.g:3481:1: ( ( rule__ParameterStatement__ObjNameAssignment_0 ) )
            {
            // InternalX21.g:3481:1: ( ( rule__ParameterStatement__ObjNameAssignment_0 ) )
            // InternalX21.g:3482:2: ( rule__ParameterStatement__ObjNameAssignment_0 )
            {
             before(grammarAccess.getParameterStatementAccess().getObjNameAssignment_0()); 
            // InternalX21.g:3483:2: ( rule__ParameterStatement__ObjNameAssignment_0 )
            // InternalX21.g:3483:3: rule__ParameterStatement__ObjNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStatement__ObjNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStatementAccess().getObjNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStatement__Group__0__Impl"


    // $ANTLR start "rule__ParameterStatement__Group__1"
    // InternalX21.g:3491:1: rule__ParameterStatement__Group__1 : rule__ParameterStatement__Group__1__Impl ;
    public final void rule__ParameterStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3495:1: ( rule__ParameterStatement__Group__1__Impl )
            // InternalX21.g:3496:2: rule__ParameterStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStatement__Group__1__Impl();

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
    // $ANTLR end "rule__ParameterStatement__Group__1"


    // $ANTLR start "rule__ParameterStatement__Group__1__Impl"
    // InternalX21.g:3502:1: rule__ParameterStatement__Group__1__Impl : ( ( rule__ParameterStatement__Group_1__0 )* ) ;
    public final void rule__ParameterStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3506:1: ( ( ( rule__ParameterStatement__Group_1__0 )* ) )
            // InternalX21.g:3507:1: ( ( rule__ParameterStatement__Group_1__0 )* )
            {
            // InternalX21.g:3507:1: ( ( rule__ParameterStatement__Group_1__0 )* )
            // InternalX21.g:3508:2: ( rule__ParameterStatement__Group_1__0 )*
            {
             before(grammarAccess.getParameterStatementAccess().getGroup_1()); 
            // InternalX21.g:3509:2: ( rule__ParameterStatement__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==46) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalX21.g:3509:3: rule__ParameterStatement__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__ParameterStatement__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getParameterStatementAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStatement__Group__1__Impl"


    // $ANTLR start "rule__ParameterStatement__Group_1__0"
    // InternalX21.g:3518:1: rule__ParameterStatement__Group_1__0 : rule__ParameterStatement__Group_1__0__Impl rule__ParameterStatement__Group_1__1 ;
    public final void rule__ParameterStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3522:1: ( rule__ParameterStatement__Group_1__0__Impl rule__ParameterStatement__Group_1__1 )
            // InternalX21.g:3523:2: rule__ParameterStatement__Group_1__0__Impl rule__ParameterStatement__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ParameterStatement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStatement__Group_1__1();

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
    // $ANTLR end "rule__ParameterStatement__Group_1__0"


    // $ANTLR start "rule__ParameterStatement__Group_1__0__Impl"
    // InternalX21.g:3530:1: rule__ParameterStatement__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ParameterStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3534:1: ( ( '.' ) )
            // InternalX21.g:3535:1: ( '.' )
            {
            // InternalX21.g:3535:1: ( '.' )
            // InternalX21.g:3536:2: '.'
            {
             before(grammarAccess.getParameterStatementAccess().getFullStopKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getParameterStatementAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStatement__Group_1__0__Impl"


    // $ANTLR start "rule__ParameterStatement__Group_1__1"
    // InternalX21.g:3545:1: rule__ParameterStatement__Group_1__1 : rule__ParameterStatement__Group_1__1__Impl ;
    public final void rule__ParameterStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3549:1: ( rule__ParameterStatement__Group_1__1__Impl )
            // InternalX21.g:3550:2: rule__ParameterStatement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStatement__Group_1__1__Impl();

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
    // $ANTLR end "rule__ParameterStatement__Group_1__1"


    // $ANTLR start "rule__ParameterStatement__Group_1__1__Impl"
    // InternalX21.g:3556:1: rule__ParameterStatement__Group_1__1__Impl : ( ( rule__ParameterStatement__ParamNamesAssignment_1_1 ) ) ;
    public final void rule__ParameterStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3560:1: ( ( ( rule__ParameterStatement__ParamNamesAssignment_1_1 ) ) )
            // InternalX21.g:3561:1: ( ( rule__ParameterStatement__ParamNamesAssignment_1_1 ) )
            {
            // InternalX21.g:3561:1: ( ( rule__ParameterStatement__ParamNamesAssignment_1_1 ) )
            // InternalX21.g:3562:2: ( rule__ParameterStatement__ParamNamesAssignment_1_1 )
            {
             before(grammarAccess.getParameterStatementAccess().getParamNamesAssignment_1_1()); 
            // InternalX21.g:3563:2: ( rule__ParameterStatement__ParamNamesAssignment_1_1 )
            // InternalX21.g:3563:3: rule__ParameterStatement__ParamNamesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStatement__ParamNamesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterStatementAccess().getParamNamesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStatement__Group_1__1__Impl"


    // $ANTLR start "rule__NewStatement__Group__0"
    // InternalX21.g:3572:1: rule__NewStatement__Group__0 : rule__NewStatement__Group__0__Impl rule__NewStatement__Group__1 ;
    public final void rule__NewStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3576:1: ( rule__NewStatement__Group__0__Impl rule__NewStatement__Group__1 )
            // InternalX21.g:3577:2: rule__NewStatement__Group__0__Impl rule__NewStatement__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__NewStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewStatement__Group__1();

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
    // $ANTLR end "rule__NewStatement__Group__0"


    // $ANTLR start "rule__NewStatement__Group__0__Impl"
    // InternalX21.g:3584:1: rule__NewStatement__Group__0__Impl : ( 'new' ) ;
    public final void rule__NewStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3588:1: ( ( 'new' ) )
            // InternalX21.g:3589:1: ( 'new' )
            {
            // InternalX21.g:3589:1: ( 'new' )
            // InternalX21.g:3590:2: 'new'
            {
             before(grammarAccess.getNewStatementAccess().getNewKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getNewStatementAccess().getNewKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__Group__0__Impl"


    // $ANTLR start "rule__NewStatement__Group__1"
    // InternalX21.g:3599:1: rule__NewStatement__Group__1 : rule__NewStatement__Group__1__Impl rule__NewStatement__Group__2 ;
    public final void rule__NewStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3603:1: ( rule__NewStatement__Group__1__Impl rule__NewStatement__Group__2 )
            // InternalX21.g:3604:2: rule__NewStatement__Group__1__Impl rule__NewStatement__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__NewStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewStatement__Group__2();

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
    // $ANTLR end "rule__NewStatement__Group__1"


    // $ANTLR start "rule__NewStatement__Group__1__Impl"
    // InternalX21.g:3611:1: rule__NewStatement__Group__1__Impl : ( ( rule__NewStatement__CustomNameAssignment_1 ) ) ;
    public final void rule__NewStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3615:1: ( ( ( rule__NewStatement__CustomNameAssignment_1 ) ) )
            // InternalX21.g:3616:1: ( ( rule__NewStatement__CustomNameAssignment_1 ) )
            {
            // InternalX21.g:3616:1: ( ( rule__NewStatement__CustomNameAssignment_1 ) )
            // InternalX21.g:3617:2: ( rule__NewStatement__CustomNameAssignment_1 )
            {
             before(grammarAccess.getNewStatementAccess().getCustomNameAssignment_1()); 
            // InternalX21.g:3618:2: ( rule__NewStatement__CustomNameAssignment_1 )
            // InternalX21.g:3618:3: rule__NewStatement__CustomNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NewStatement__CustomNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNewStatementAccess().getCustomNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__Group__1__Impl"


    // $ANTLR start "rule__NewStatement__Group__2"
    // InternalX21.g:3626:1: rule__NewStatement__Group__2 : rule__NewStatement__Group__2__Impl rule__NewStatement__Group__3 ;
    public final void rule__NewStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3630:1: ( rule__NewStatement__Group__2__Impl rule__NewStatement__Group__3 )
            // InternalX21.g:3631:2: rule__NewStatement__Group__2__Impl rule__NewStatement__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__NewStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewStatement__Group__3();

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
    // $ANTLR end "rule__NewStatement__Group__2"


    // $ANTLR start "rule__NewStatement__Group__2__Impl"
    // InternalX21.g:3638:1: rule__NewStatement__Group__2__Impl : ( '[' ) ;
    public final void rule__NewStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3642:1: ( ( '[' ) )
            // InternalX21.g:3643:1: ( '[' )
            {
            // InternalX21.g:3643:1: ( '[' )
            // InternalX21.g:3644:2: '['
            {
             before(grammarAccess.getNewStatementAccess().getLeftSquareBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getNewStatementAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__Group__2__Impl"


    // $ANTLR start "rule__NewStatement__Group__3"
    // InternalX21.g:3653:1: rule__NewStatement__Group__3 : rule__NewStatement__Group__3__Impl rule__NewStatement__Group__4 ;
    public final void rule__NewStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3657:1: ( rule__NewStatement__Group__3__Impl rule__NewStatement__Group__4 )
            // InternalX21.g:3658:2: rule__NewStatement__Group__3__Impl rule__NewStatement__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__NewStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewStatement__Group__4();

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
    // $ANTLR end "rule__NewStatement__Group__3"


    // $ANTLR start "rule__NewStatement__Group__3__Impl"
    // InternalX21.g:3665:1: rule__NewStatement__Group__3__Impl : ( ( rule__NewStatement__ParamNamesAssignment_3 ) ) ;
    public final void rule__NewStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3669:1: ( ( ( rule__NewStatement__ParamNamesAssignment_3 ) ) )
            // InternalX21.g:3670:1: ( ( rule__NewStatement__ParamNamesAssignment_3 ) )
            {
            // InternalX21.g:3670:1: ( ( rule__NewStatement__ParamNamesAssignment_3 ) )
            // InternalX21.g:3671:2: ( rule__NewStatement__ParamNamesAssignment_3 )
            {
             before(grammarAccess.getNewStatementAccess().getParamNamesAssignment_3()); 
            // InternalX21.g:3672:2: ( rule__NewStatement__ParamNamesAssignment_3 )
            // InternalX21.g:3672:3: rule__NewStatement__ParamNamesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__NewStatement__ParamNamesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNewStatementAccess().getParamNamesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__Group__3__Impl"


    // $ANTLR start "rule__NewStatement__Group__4"
    // InternalX21.g:3680:1: rule__NewStatement__Group__4 : rule__NewStatement__Group__4__Impl rule__NewStatement__Group__5 ;
    public final void rule__NewStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3684:1: ( rule__NewStatement__Group__4__Impl rule__NewStatement__Group__5 )
            // InternalX21.g:3685:2: rule__NewStatement__Group__4__Impl rule__NewStatement__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__NewStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewStatement__Group__5();

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
    // $ANTLR end "rule__NewStatement__Group__4"


    // $ANTLR start "rule__NewStatement__Group__4__Impl"
    // InternalX21.g:3692:1: rule__NewStatement__Group__4__Impl : ( '=' ) ;
    public final void rule__NewStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3696:1: ( ( '=' ) )
            // InternalX21.g:3697:1: ( '=' )
            {
            // InternalX21.g:3697:1: ( '=' )
            // InternalX21.g:3698:2: '='
            {
             before(grammarAccess.getNewStatementAccess().getEqualsSignKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNewStatementAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__Group__4__Impl"


    // $ANTLR start "rule__NewStatement__Group__5"
    // InternalX21.g:3707:1: rule__NewStatement__Group__5 : rule__NewStatement__Group__5__Impl rule__NewStatement__Group__6 ;
    public final void rule__NewStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3711:1: ( rule__NewStatement__Group__5__Impl rule__NewStatement__Group__6 )
            // InternalX21.g:3712:2: rule__NewStatement__Group__5__Impl rule__NewStatement__Group__6
            {
            pushFollow(FOLLOW_38);
            rule__NewStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewStatement__Group__6();

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
    // $ANTLR end "rule__NewStatement__Group__5"


    // $ANTLR start "rule__NewStatement__Group__5__Impl"
    // InternalX21.g:3719:1: rule__NewStatement__Group__5__Impl : ( ( rule__NewStatement__ParamValuesAssignment_5 ) ) ;
    public final void rule__NewStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3723:1: ( ( ( rule__NewStatement__ParamValuesAssignment_5 ) ) )
            // InternalX21.g:3724:1: ( ( rule__NewStatement__ParamValuesAssignment_5 ) )
            {
            // InternalX21.g:3724:1: ( ( rule__NewStatement__ParamValuesAssignment_5 ) )
            // InternalX21.g:3725:2: ( rule__NewStatement__ParamValuesAssignment_5 )
            {
             before(grammarAccess.getNewStatementAccess().getParamValuesAssignment_5()); 
            // InternalX21.g:3726:2: ( rule__NewStatement__ParamValuesAssignment_5 )
            // InternalX21.g:3726:3: rule__NewStatement__ParamValuesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__NewStatement__ParamValuesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getNewStatementAccess().getParamValuesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__Group__5__Impl"


    // $ANTLR start "rule__NewStatement__Group__6"
    // InternalX21.g:3734:1: rule__NewStatement__Group__6 : rule__NewStatement__Group__6__Impl rule__NewStatement__Group__7 ;
    public final void rule__NewStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3738:1: ( rule__NewStatement__Group__6__Impl rule__NewStatement__Group__7 )
            // InternalX21.g:3739:2: rule__NewStatement__Group__6__Impl rule__NewStatement__Group__7
            {
            pushFollow(FOLLOW_38);
            rule__NewStatement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewStatement__Group__7();

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
    // $ANTLR end "rule__NewStatement__Group__6"


    // $ANTLR start "rule__NewStatement__Group__6__Impl"
    // InternalX21.g:3746:1: rule__NewStatement__Group__6__Impl : ( ( rule__NewStatement__Group_6__0 )* ) ;
    public final void rule__NewStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3750:1: ( ( ( rule__NewStatement__Group_6__0 )* ) )
            // InternalX21.g:3751:1: ( ( rule__NewStatement__Group_6__0 )* )
            {
            // InternalX21.g:3751:1: ( ( rule__NewStatement__Group_6__0 )* )
            // InternalX21.g:3752:2: ( rule__NewStatement__Group_6__0 )*
            {
             before(grammarAccess.getNewStatementAccess().getGroup_6()); 
            // InternalX21.g:3753:2: ( rule__NewStatement__Group_6__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==31) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalX21.g:3753:3: rule__NewStatement__Group_6__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__NewStatement__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getNewStatementAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__Group__6__Impl"


    // $ANTLR start "rule__NewStatement__Group__7"
    // InternalX21.g:3761:1: rule__NewStatement__Group__7 : rule__NewStatement__Group__7__Impl ;
    public final void rule__NewStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3765:1: ( rule__NewStatement__Group__7__Impl )
            // InternalX21.g:3766:2: rule__NewStatement__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewStatement__Group__7__Impl();

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
    // $ANTLR end "rule__NewStatement__Group__7"


    // $ANTLR start "rule__NewStatement__Group__7__Impl"
    // InternalX21.g:3772:1: rule__NewStatement__Group__7__Impl : ( ']' ) ;
    public final void rule__NewStatement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3776:1: ( ( ']' ) )
            // InternalX21.g:3777:1: ( ']' )
            {
            // InternalX21.g:3777:1: ( ']' )
            // InternalX21.g:3778:2: ']'
            {
             before(grammarAccess.getNewStatementAccess().getRightSquareBracketKeyword_7()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getNewStatementAccess().getRightSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__Group__7__Impl"


    // $ANTLR start "rule__NewStatement__Group_6__0"
    // InternalX21.g:3788:1: rule__NewStatement__Group_6__0 : rule__NewStatement__Group_6__0__Impl rule__NewStatement__Group_6__1 ;
    public final void rule__NewStatement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3792:1: ( rule__NewStatement__Group_6__0__Impl rule__NewStatement__Group_6__1 )
            // InternalX21.g:3793:2: rule__NewStatement__Group_6__0__Impl rule__NewStatement__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__NewStatement__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewStatement__Group_6__1();

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
    // $ANTLR end "rule__NewStatement__Group_6__0"


    // $ANTLR start "rule__NewStatement__Group_6__0__Impl"
    // InternalX21.g:3800:1: rule__NewStatement__Group_6__0__Impl : ( ',' ) ;
    public final void rule__NewStatement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3804:1: ( ( ',' ) )
            // InternalX21.g:3805:1: ( ',' )
            {
            // InternalX21.g:3805:1: ( ',' )
            // InternalX21.g:3806:2: ','
            {
             before(grammarAccess.getNewStatementAccess().getCommaKeyword_6_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getNewStatementAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__Group_6__0__Impl"


    // $ANTLR start "rule__NewStatement__Group_6__1"
    // InternalX21.g:3815:1: rule__NewStatement__Group_6__1 : rule__NewStatement__Group_6__1__Impl rule__NewStatement__Group_6__2 ;
    public final void rule__NewStatement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3819:1: ( rule__NewStatement__Group_6__1__Impl rule__NewStatement__Group_6__2 )
            // InternalX21.g:3820:2: rule__NewStatement__Group_6__1__Impl rule__NewStatement__Group_6__2
            {
            pushFollow(FOLLOW_30);
            rule__NewStatement__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewStatement__Group_6__2();

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
    // $ANTLR end "rule__NewStatement__Group_6__1"


    // $ANTLR start "rule__NewStatement__Group_6__1__Impl"
    // InternalX21.g:3827:1: rule__NewStatement__Group_6__1__Impl : ( ( rule__NewStatement__ParamNamesAssignment_6_1 ) ) ;
    public final void rule__NewStatement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3831:1: ( ( ( rule__NewStatement__ParamNamesAssignment_6_1 ) ) )
            // InternalX21.g:3832:1: ( ( rule__NewStatement__ParamNamesAssignment_6_1 ) )
            {
            // InternalX21.g:3832:1: ( ( rule__NewStatement__ParamNamesAssignment_6_1 ) )
            // InternalX21.g:3833:2: ( rule__NewStatement__ParamNamesAssignment_6_1 )
            {
             before(grammarAccess.getNewStatementAccess().getParamNamesAssignment_6_1()); 
            // InternalX21.g:3834:2: ( rule__NewStatement__ParamNamesAssignment_6_1 )
            // InternalX21.g:3834:3: rule__NewStatement__ParamNamesAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__NewStatement__ParamNamesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getNewStatementAccess().getParamNamesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__Group_6__1__Impl"


    // $ANTLR start "rule__NewStatement__Group_6__2"
    // InternalX21.g:3842:1: rule__NewStatement__Group_6__2 : rule__NewStatement__Group_6__2__Impl rule__NewStatement__Group_6__3 ;
    public final void rule__NewStatement__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3846:1: ( rule__NewStatement__Group_6__2__Impl rule__NewStatement__Group_6__3 )
            // InternalX21.g:3847:2: rule__NewStatement__Group_6__2__Impl rule__NewStatement__Group_6__3
            {
            pushFollow(FOLLOW_11);
            rule__NewStatement__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewStatement__Group_6__3();

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
    // $ANTLR end "rule__NewStatement__Group_6__2"


    // $ANTLR start "rule__NewStatement__Group_6__2__Impl"
    // InternalX21.g:3854:1: rule__NewStatement__Group_6__2__Impl : ( '=' ) ;
    public final void rule__NewStatement__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3858:1: ( ( '=' ) )
            // InternalX21.g:3859:1: ( '=' )
            {
            // InternalX21.g:3859:1: ( '=' )
            // InternalX21.g:3860:2: '='
            {
             before(grammarAccess.getNewStatementAccess().getEqualsSignKeyword_6_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNewStatementAccess().getEqualsSignKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__Group_6__2__Impl"


    // $ANTLR start "rule__NewStatement__Group_6__3"
    // InternalX21.g:3869:1: rule__NewStatement__Group_6__3 : rule__NewStatement__Group_6__3__Impl ;
    public final void rule__NewStatement__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3873:1: ( rule__NewStatement__Group_6__3__Impl )
            // InternalX21.g:3874:2: rule__NewStatement__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewStatement__Group_6__3__Impl();

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
    // $ANTLR end "rule__NewStatement__Group_6__3"


    // $ANTLR start "rule__NewStatement__Group_6__3__Impl"
    // InternalX21.g:3880:1: rule__NewStatement__Group_6__3__Impl : ( ( rule__NewStatement__ParamValuesAssignment_6_3 ) ) ;
    public final void rule__NewStatement__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3884:1: ( ( ( rule__NewStatement__ParamValuesAssignment_6_3 ) ) )
            // InternalX21.g:3885:1: ( ( rule__NewStatement__ParamValuesAssignment_6_3 ) )
            {
            // InternalX21.g:3885:1: ( ( rule__NewStatement__ParamValuesAssignment_6_3 ) )
            // InternalX21.g:3886:2: ( rule__NewStatement__ParamValuesAssignment_6_3 )
            {
             before(grammarAccess.getNewStatementAccess().getParamValuesAssignment_6_3()); 
            // InternalX21.g:3887:2: ( rule__NewStatement__ParamValuesAssignment_6_3 )
            // InternalX21.g:3887:3: rule__NewStatement__ParamValuesAssignment_6_3
            {
            pushFollow(FOLLOW_2);
            rule__NewStatement__ParamValuesAssignment_6_3();

            state._fsp--;


            }

             after(grammarAccess.getNewStatementAccess().getParamValuesAssignment_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__Group_6__3__Impl"


    // $ANTLR start "rule__X21__NameAssignment_1"
    // InternalX21.g:3896:1: rule__X21__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__X21__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3900:1: ( ( RULE_ID ) )
            // InternalX21.g:3901:2: ( RULE_ID )
            {
            // InternalX21.g:3901:2: ( RULE_ID )
            // InternalX21.g:3902:3: RULE_ID
            {
             before(grammarAccess.getX21Access().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getX21Access().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X21__NameAssignment_1"


    // $ANTLR start "rule__X21__DeclarationsAssignment_2"
    // InternalX21.g:3911:1: rule__X21__DeclarationsAssignment_2 : ( ruleDeclaration ) ;
    public final void rule__X21__DeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3915:1: ( ( ruleDeclaration ) )
            // InternalX21.g:3916:2: ( ruleDeclaration )
            {
            // InternalX21.g:3916:2: ( ruleDeclaration )
            // InternalX21.g:3917:3: ruleDeclaration
            {
             before(grammarAccess.getX21Access().getDeclarationsDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getX21Access().getDeclarationsDeclarationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__X21__DeclarationsAssignment_2"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalX21.g:3926:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3930:1: ( ( RULE_ID ) )
            // InternalX21.g:3931:2: ( RULE_ID )
            {
            // InternalX21.g:3931:2: ( RULE_ID )
            // InternalX21.g:3932:3: RULE_ID
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
    // InternalX21.g:3941:1: rule__Parameter__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3945:1: ( ( ruleType ) )
            // InternalX21.g:3946:2: ( ruleType )
            {
            // InternalX21.g:3946:2: ( ruleType )
            // InternalX21.g:3947:3: ruleType
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
    // InternalX21.g:3956:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3960:1: ( ( RULE_ID ) )
            // InternalX21.g:3961:2: ( RULE_ID )
            {
            // InternalX21.g:3961:2: ( RULE_ID )
            // InternalX21.g:3962:3: RULE_ID
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
    // InternalX21.g:3971:1: rule__Function__LambdaAssignment_2 : ( ruleLambda ) ;
    public final void rule__Function__LambdaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3975:1: ( ( ruleLambda ) )
            // InternalX21.g:3976:2: ( ruleLambda )
            {
            // InternalX21.g:3976:2: ( ruleLambda )
            // InternalX21.g:3977:3: ruleLambda
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
    // InternalX21.g:3986:1: rule__Lambda__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Lambda__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:3990:1: ( ( RULE_ID ) )
            // InternalX21.g:3991:2: ( RULE_ID )
            {
            // InternalX21.g:3991:2: ( RULE_ID )
            // InternalX21.g:3992:3: RULE_ID
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
    // InternalX21.g:4001:1: rule__Lambda__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__Lambda__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4005:1: ( ( ruleType ) )
            // InternalX21.g:4006:2: ( ruleType )
            {
            // InternalX21.g:4006:2: ( ruleType )
            // InternalX21.g:4007:3: ruleType
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
    // InternalX21.g:4016:1: rule__Lambda__ExpAssignment_6 : ( ruleExp ) ;
    public final void rule__Lambda__ExpAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4020:1: ( ( ruleExp ) )
            // InternalX21.g:4021:2: ( ruleExp )
            {
            // InternalX21.g:4021:2: ( ruleExp )
            // InternalX21.g:4022:3: ruleExp
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
    // InternalX21.g:4031:1: rule__Input__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Input__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4035:1: ( ( RULE_ID ) )
            // InternalX21.g:4036:2: ( RULE_ID )
            {
            // InternalX21.g:4036:2: ( RULE_ID )
            // InternalX21.g:4037:3: RULE_ID
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
    // InternalX21.g:4046:1: rule__Input__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__Input__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4050:1: ( ( ruleType ) )
            // InternalX21.g:4051:2: ( ruleType )
            {
            // InternalX21.g:4051:2: ( ruleType )
            // InternalX21.g:4052:3: ruleType
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
    // InternalX21.g:4061:1: rule__Node__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4065:1: ( ( RULE_ID ) )
            // InternalX21.g:4066:2: ( RULE_ID )
            {
            // InternalX21.g:4066:2: ( RULE_ID )
            // InternalX21.g:4067:3: RULE_ID
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
    // InternalX21.g:4076:1: rule__Node__FunctionAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__Node__FunctionAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4080:1: ( ( RULE_ID ) )
            // InternalX21.g:4081:2: ( RULE_ID )
            {
            // InternalX21.g:4081:2: ( RULE_ID )
            // InternalX21.g:4082:3: RULE_ID
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
    // InternalX21.g:4091:1: rule__Node__LambdaAssignment_3_1 : ( ruleLambda ) ;
    public final void rule__Node__LambdaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4095:1: ( ( ruleLambda ) )
            // InternalX21.g:4096:2: ( ruleLambda )
            {
            // InternalX21.g:4096:2: ( ruleLambda )
            // InternalX21.g:4097:3: ruleLambda
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
    // InternalX21.g:4106:1: rule__Stream__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Stream__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4110:1: ( ( RULE_ID ) )
            // InternalX21.g:4111:2: ( RULE_ID )
            {
            // InternalX21.g:4111:2: ( RULE_ID )
            // InternalX21.g:4112:3: RULE_ID
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
    // InternalX21.g:4121:1: rule__Stream__InputsAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Stream__InputsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4125:1: ( ( RULE_ID ) )
            // InternalX21.g:4126:2: ( RULE_ID )
            {
            // InternalX21.g:4126:2: ( RULE_ID )
            // InternalX21.g:4127:3: RULE_ID
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
    // InternalX21.g:4136:1: rule__Stream__ElementsAssignment_3_1 : ( ruleElement ) ;
    public final void rule__Stream__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4140:1: ( ( ruleElement ) )
            // InternalX21.g:4141:2: ( ruleElement )
            {
            // InternalX21.g:4141:2: ( ruleElement )
            // InternalX21.g:4142:3: ruleElement
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
    // InternalX21.g:4151:1: rule__Stream__ElementsAssignment_3_2_1 : ( ruleElement ) ;
    public final void rule__Stream__ElementsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4155:1: ( ( ruleElement ) )
            // InternalX21.g:4156:2: ( ruleElement )
            {
            // InternalX21.g:4156:2: ( ruleElement )
            // InternalX21.g:4157:3: ruleElement
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
    // InternalX21.g:4166:1: rule__Element__NodeNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Element__NodeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4170:1: ( ( RULE_ID ) )
            // InternalX21.g:4171:2: ( RULE_ID )
            {
            // InternalX21.g:4171:2: ( RULE_ID )
            // InternalX21.g:4172:3: RULE_ID
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
    // InternalX21.g:4181:1: rule__Element__FunctionAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__Element__FunctionAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4185:1: ( ( RULE_ID ) )
            // InternalX21.g:4186:2: ( RULE_ID )
            {
            // InternalX21.g:4186:2: ( RULE_ID )
            // InternalX21.g:4187:3: RULE_ID
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
    // InternalX21.g:4196:1: rule__Element__LambdaAssignment_1_1_1 : ( ruleLambda ) ;
    public final void rule__Element__LambdaAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4200:1: ( ( ruleLambda ) )
            // InternalX21.g:4201:2: ( ruleLambda )
            {
            // InternalX21.g:4201:2: ( ruleLambda )
            // InternalX21.g:4202:3: ruleLambda
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
    // InternalX21.g:4211:1: rule__Element__OutputNameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Element__OutputNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4215:1: ( ( RULE_ID ) )
            // InternalX21.g:4216:2: ( RULE_ID )
            {
            // InternalX21.g:4216:2: ( RULE_ID )
            // InternalX21.g:4217:3: RULE_ID
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
    // InternalX21.g:4226:1: rule__DataDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4230:1: ( ( RULE_ID ) )
            // InternalX21.g:4231:2: ( RULE_ID )
            {
            // InternalX21.g:4231:2: ( RULE_ID )
            // InternalX21.g:4232:3: RULE_ID
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
    // InternalX21.g:4241:1: rule__DataDecl__DeclNamesAssignment_3 : ( RULE_ID ) ;
    public final void rule__DataDecl__DeclNamesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4245:1: ( ( RULE_ID ) )
            // InternalX21.g:4246:2: ( RULE_ID )
            {
            // InternalX21.g:4246:2: ( RULE_ID )
            // InternalX21.g:4247:3: RULE_ID
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
    // InternalX21.g:4256:1: rule__DataDecl__TypesAssignment_5 : ( ruleType ) ;
    public final void rule__DataDecl__TypesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4260:1: ( ( ruleType ) )
            // InternalX21.g:4261:2: ( ruleType )
            {
            // InternalX21.g:4261:2: ( ruleType )
            // InternalX21.g:4262:3: ruleType
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
    // InternalX21.g:4271:1: rule__DataDecl__DeclNamesAssignment_6_1 : ( RULE_ID ) ;
    public final void rule__DataDecl__DeclNamesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4275:1: ( ( RULE_ID ) )
            // InternalX21.g:4276:2: ( RULE_ID )
            {
            // InternalX21.g:4276:2: ( RULE_ID )
            // InternalX21.g:4277:3: RULE_ID
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
    // InternalX21.g:4286:1: rule__DataDecl__TypesAssignment_6_3 : ( ruleType ) ;
    public final void rule__DataDecl__TypesAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4290:1: ( ( ruleType ) )
            // InternalX21.g:4291:2: ( ruleType )
            {
            // InternalX21.g:4291:2: ( ruleType )
            // InternalX21.g:4292:3: ruleType
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
    // InternalX21.g:4301:1: rule__PlusMinus__RightAssignment_1_1 : ( ruleMulDiv ) ;
    public final void rule__PlusMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4305:1: ( ( ruleMulDiv ) )
            // InternalX21.g:4306:2: ( ruleMulDiv )
            {
            // InternalX21.g:4306:2: ( ruleMulDiv )
            // InternalX21.g:4307:3: ruleMulDiv
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
    // InternalX21.g:4316:1: rule__MulDiv__RightAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__MulDiv__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4320:1: ( ( rulePrimary ) )
            // InternalX21.g:4321:2: ( rulePrimary )
            {
            // InternalX21.g:4321:2: ( rulePrimary )
            // InternalX21.g:4322:3: rulePrimary
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
    // InternalX21.g:4331:1: rule__Primary__ExpressionAssignment_1_2 : ( ruleExp ) ;
    public final void rule__Primary__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4335:1: ( ( ruleExp ) )
            // InternalX21.g:4336:2: ( ruleExp )
            {
            // InternalX21.g:4336:2: ( ruleExp )
            // InternalX21.g:4337:3: ruleExp
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
    // InternalX21.g:4346:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4350:1: ( ( RULE_INT ) )
            // InternalX21.g:4351:2: ( RULE_INT )
            {
            // InternalX21.g:4351:2: ( RULE_INT )
            // InternalX21.g:4352:3: RULE_INT
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
    // InternalX21.g:4361:1: rule__LetBinding__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LetBinding__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4365:1: ( ( RULE_ID ) )
            // InternalX21.g:4366:2: ( RULE_ID )
            {
            // InternalX21.g:4366:2: ( RULE_ID )
            // InternalX21.g:4367:3: RULE_ID
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
    // InternalX21.g:4376:1: rule__LetBinding__BindingAssignment_3 : ( ruleExp ) ;
    public final void rule__LetBinding__BindingAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4380:1: ( ( ruleExp ) )
            // InternalX21.g:4381:2: ( ruleExp )
            {
            // InternalX21.g:4381:2: ( ruleExp )
            // InternalX21.g:4382:3: ruleExp
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
    // InternalX21.g:4391:1: rule__LetBinding__BodyAssignment_5 : ( ruleExp ) ;
    public final void rule__LetBinding__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4395:1: ( ( ruleExp ) )
            // InternalX21.g:4396:2: ( ruleExp )
            {
            // InternalX21.g:4396:2: ( ruleExp )
            // InternalX21.g:4397:3: ruleExp
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
    // InternalX21.g:4406:1: rule__IfStatement__StatementAssignment_1 : ( ruleLogicExp ) ;
    public final void rule__IfStatement__StatementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4410:1: ( ( ruleLogicExp ) )
            // InternalX21.g:4411:2: ( ruleLogicExp )
            {
            // InternalX21.g:4411:2: ( ruleLogicExp )
            // InternalX21.g:4412:3: ruleLogicExp
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
    // InternalX21.g:4421:1: rule__IfStatement__TrueExpressionAssignment_3 : ( ruleExp ) ;
    public final void rule__IfStatement__TrueExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4425:1: ( ( ruleExp ) )
            // InternalX21.g:4426:2: ( ruleExp )
            {
            // InternalX21.g:4426:2: ( ruleExp )
            // InternalX21.g:4427:3: ruleExp
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
    // InternalX21.g:4436:1: rule__IfStatement__FalseExpressionAssignment_5 : ( ruleExp ) ;
    public final void rule__IfStatement__FalseExpressionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4440:1: ( ( ruleExp ) )
            // InternalX21.g:4441:2: ( ruleExp )
            {
            // InternalX21.g:4441:2: ( ruleExp )
            // InternalX21.g:4442:3: ruleExp
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
    // InternalX21.g:4451:1: rule__LogicExp__LeftAssignment_0 : ( ruleExp ) ;
    public final void rule__LogicExp__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4455:1: ( ( ruleExp ) )
            // InternalX21.g:4456:2: ( ruleExp )
            {
            // InternalX21.g:4456:2: ( ruleExp )
            // InternalX21.g:4457:3: ruleExp
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
    // InternalX21.g:4466:1: rule__LogicExp__OperatorAssignment_1 : ( ( rule__LogicExp__OperatorAlternatives_1_0 ) ) ;
    public final void rule__LogicExp__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4470:1: ( ( ( rule__LogicExp__OperatorAlternatives_1_0 ) ) )
            // InternalX21.g:4471:2: ( ( rule__LogicExp__OperatorAlternatives_1_0 ) )
            {
            // InternalX21.g:4471:2: ( ( rule__LogicExp__OperatorAlternatives_1_0 ) )
            // InternalX21.g:4472:3: ( rule__LogicExp__OperatorAlternatives_1_0 )
            {
             before(grammarAccess.getLogicExpAccess().getOperatorAlternatives_1_0()); 
            // InternalX21.g:4473:3: ( rule__LogicExp__OperatorAlternatives_1_0 )
            // InternalX21.g:4473:4: rule__LogicExp__OperatorAlternatives_1_0
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
    // InternalX21.g:4481:1: rule__LogicExp__RightAssignment_2 : ( ruleExp ) ;
    public final void rule__LogicExp__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4485:1: ( ( ruleExp ) )
            // InternalX21.g:4486:2: ( ruleExp )
            {
            // InternalX21.g:4486:2: ( ruleExp )
            // InternalX21.g:4487:3: ruleExp
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


    // $ANTLR start "rule__ParameterStatement__ObjNameAssignment_0"
    // InternalX21.g:4496:1: rule__ParameterStatement__ObjNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ParameterStatement__ObjNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4500:1: ( ( RULE_ID ) )
            // InternalX21.g:4501:2: ( RULE_ID )
            {
            // InternalX21.g:4501:2: ( RULE_ID )
            // InternalX21.g:4502:3: RULE_ID
            {
             before(grammarAccess.getParameterStatementAccess().getObjNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterStatementAccess().getObjNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStatement__ObjNameAssignment_0"


    // $ANTLR start "rule__ParameterStatement__ParamNamesAssignment_1_1"
    // InternalX21.g:4511:1: rule__ParameterStatement__ParamNamesAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__ParameterStatement__ParamNamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4515:1: ( ( RULE_ID ) )
            // InternalX21.g:4516:2: ( RULE_ID )
            {
            // InternalX21.g:4516:2: ( RULE_ID )
            // InternalX21.g:4517:3: RULE_ID
            {
             before(grammarAccess.getParameterStatementAccess().getParamNamesIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterStatementAccess().getParamNamesIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStatement__ParamNamesAssignment_1_1"


    // $ANTLR start "rule__NewStatement__CustomNameAssignment_1"
    // InternalX21.g:4526:1: rule__NewStatement__CustomNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NewStatement__CustomNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4530:1: ( ( RULE_ID ) )
            // InternalX21.g:4531:2: ( RULE_ID )
            {
            // InternalX21.g:4531:2: ( RULE_ID )
            // InternalX21.g:4532:3: RULE_ID
            {
             before(grammarAccess.getNewStatementAccess().getCustomNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNewStatementAccess().getCustomNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__CustomNameAssignment_1"


    // $ANTLR start "rule__NewStatement__ParamNamesAssignment_3"
    // InternalX21.g:4541:1: rule__NewStatement__ParamNamesAssignment_3 : ( RULE_ID ) ;
    public final void rule__NewStatement__ParamNamesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4545:1: ( ( RULE_ID ) )
            // InternalX21.g:4546:2: ( RULE_ID )
            {
            // InternalX21.g:4546:2: ( RULE_ID )
            // InternalX21.g:4547:3: RULE_ID
            {
             before(grammarAccess.getNewStatementAccess().getParamNamesIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNewStatementAccess().getParamNamesIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__ParamNamesAssignment_3"


    // $ANTLR start "rule__NewStatement__ParamValuesAssignment_5"
    // InternalX21.g:4556:1: rule__NewStatement__ParamValuesAssignment_5 : ( ruleExp ) ;
    public final void rule__NewStatement__ParamValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4560:1: ( ( ruleExp ) )
            // InternalX21.g:4561:2: ( ruleExp )
            {
            // InternalX21.g:4561:2: ( ruleExp )
            // InternalX21.g:4562:3: ruleExp
            {
             before(grammarAccess.getNewStatementAccess().getParamValuesExpParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getNewStatementAccess().getParamValuesExpParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__ParamValuesAssignment_5"


    // $ANTLR start "rule__NewStatement__ParamNamesAssignment_6_1"
    // InternalX21.g:4571:1: rule__NewStatement__ParamNamesAssignment_6_1 : ( RULE_ID ) ;
    public final void rule__NewStatement__ParamNamesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4575:1: ( ( RULE_ID ) )
            // InternalX21.g:4576:2: ( RULE_ID )
            {
            // InternalX21.g:4576:2: ( RULE_ID )
            // InternalX21.g:4577:3: RULE_ID
            {
             before(grammarAccess.getNewStatementAccess().getParamNamesIDTerminalRuleCall_6_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNewStatementAccess().getParamNamesIDTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__ParamNamesAssignment_6_1"


    // $ANTLR start "rule__NewStatement__ParamValuesAssignment_6_3"
    // InternalX21.g:4586:1: rule__NewStatement__ParamValuesAssignment_6_3 : ( ruleExp ) ;
    public final void rule__NewStatement__ParamValuesAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalX21.g:4590:1: ( ( ruleExp ) )
            // InternalX21.g:4591:2: ( ruleExp )
            {
            // InternalX21.g:4591:2: ( ruleExp )
            // InternalX21.g:4592:3: ruleExp
            {
             before(grammarAccess.getNewStatementAccess().getParamValuesExpParserRuleCall_6_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getNewStatementAccess().getParamValuesExpParserRuleCall_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewStatement__ParamValuesAssignment_6_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000044C280000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000044C280002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000898000400030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000210000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000000A0000000L});

}