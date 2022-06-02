package dk.sdu.mmmi.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.mdsd.services.X21GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalX21Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'parameter'", "':'", "'function'", "'('", "')'", "'{'", "'}'", "'input'", "'node'", "'['", "']'", "'stream'", "','", "'to'", "'output'", "'data'", "'int'", "'string'", "'+'", "'-'", "'*'", "'/'", "'none'", "'let'", "'='", "'in'", "'end'", "'if'", "'then'", "'else'", "'<'", "'>'", "'<='", "'>='", "'.'", "'new'"
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

        public InternalX21Parser(TokenStream input, X21GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "X21";
       	}

       	@Override
       	protected X21GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleX21"
    // InternalX21.g:64:1: entryRuleX21 returns [EObject current=null] : iv_ruleX21= ruleX21 EOF ;
    public final EObject entryRuleX21() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleX21 = null;


        try {
            // InternalX21.g:64:44: (iv_ruleX21= ruleX21 EOF )
            // InternalX21.g:65:2: iv_ruleX21= ruleX21 EOF
            {
             newCompositeNode(grammarAccess.getX21Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleX21=ruleX21();

            state._fsp--;

             current =iv_ruleX21; 
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
    // $ANTLR end "entryRuleX21"


    // $ANTLR start "ruleX21"
    // InternalX21.g:71:1: ruleX21 returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* ) ;
    public final EObject ruleX21() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_declarations_2_0 = null;



        	enterRule();

        try {
            // InternalX21.g:77:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* ) )
            // InternalX21.g:78:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* )
            {
            // InternalX21.g:78:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* )
            // InternalX21.g:79:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getX21Access().getProgramKeyword_0());
            		
            // InternalX21.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalX21.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalX21.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalX21.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getX21Access().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getX21Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalX21.g:101:3: ( (lv_declarations_2_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==14||(LA1_0>=19 && LA1_0<=20)||LA1_0==23||LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalX21.g:102:4: (lv_declarations_2_0= ruleDeclaration )
            	    {
            	    // InternalX21.g:102:4: (lv_declarations_2_0= ruleDeclaration )
            	    // InternalX21.g:103:5: lv_declarations_2_0= ruleDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getX21Access().getDeclarationsDeclarationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_declarations_2_0=ruleDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getX21Rule());
            	    					}
            	    					add(
            	    						current,
            	    						"declarations",
            	    						lv_declarations_2_0,
            	    						"dk.sdu.mmmi.mdsd.X21.Declaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleX21"


    // $ANTLR start "entryRuleDeclaration"
    // InternalX21.g:124:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalX21.g:124:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalX21.g:125:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalX21.g:131:1: ruleDeclaration returns [EObject current=null] : (this_Function_0= ruleFunction | this_Input_1= ruleInput | this_Node_2= ruleNode | this_Stream_3= ruleStream | this_DataDecl_4= ruleDataDecl | this_Parameter_5= ruleParameter ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Function_0 = null;

        EObject this_Input_1 = null;

        EObject this_Node_2 = null;

        EObject this_Stream_3 = null;

        EObject this_DataDecl_4 = null;

        EObject this_Parameter_5 = null;



        	enterRule();

        try {
            // InternalX21.g:137:2: ( (this_Function_0= ruleFunction | this_Input_1= ruleInput | this_Node_2= ruleNode | this_Stream_3= ruleStream | this_DataDecl_4= ruleDataDecl | this_Parameter_5= ruleParameter ) )
            // InternalX21.g:138:2: (this_Function_0= ruleFunction | this_Input_1= ruleInput | this_Node_2= ruleNode | this_Stream_3= ruleStream | this_DataDecl_4= ruleDataDecl | this_Parameter_5= ruleParameter )
            {
            // InternalX21.g:138:2: (this_Function_0= ruleFunction | this_Input_1= ruleInput | this_Node_2= ruleNode | this_Stream_3= ruleStream | this_DataDecl_4= ruleDataDecl | this_Parameter_5= ruleParameter )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 23:
                {
                alt2=4;
                }
                break;
            case 27:
                {
                alt2=5;
                }
                break;
            case 12:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalX21.g:139:3: this_Function_0= ruleFunction
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getFunctionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Function_0=ruleFunction();

                    state._fsp--;


                    			current = this_Function_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalX21.g:148:3: this_Input_1= ruleInput
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getInputParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Input_1=ruleInput();

                    state._fsp--;


                    			current = this_Input_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalX21.g:157:3: this_Node_2= ruleNode
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getNodeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Node_2=ruleNode();

                    state._fsp--;


                    			current = this_Node_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalX21.g:166:3: this_Stream_3= ruleStream
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getStreamParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Stream_3=ruleStream();

                    state._fsp--;


                    			current = this_Stream_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalX21.g:175:3: this_DataDecl_4= ruleDataDecl
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getDataDeclParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataDecl_4=ruleDataDecl();

                    state._fsp--;


                    			current = this_DataDecl_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalX21.g:184:3: this_Parameter_5= ruleParameter
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getParameterParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parameter_5=ruleParameter();

                    state._fsp--;


                    			current = this_Parameter_5;
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


    // $ANTLR start "entryRuleParameter"
    // InternalX21.g:196:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalX21.g:196:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalX21.g:197:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalX21.g:203:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalX21.g:209:2: ( (otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // InternalX21.g:210:2: (otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // InternalX21.g:210:2: (otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // InternalX21.g:211:3: otherlv_0= 'parameter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            // InternalX21.g:215:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalX21.g:216:4: (lv_name_1_0= RULE_ID )
            {
            // InternalX21.g:216:4: (lv_name_1_0= RULE_ID )
            // InternalX21.g:217:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getColonKeyword_2());
            		
            // InternalX21.g:237:3: ( (lv_type_3_0= ruleType ) )
            // InternalX21.g:238:4: (lv_type_3_0= ruleType )
            {
            // InternalX21.g:238:4: (lv_type_3_0= ruleType )
            // InternalX21.g:239:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"dk.sdu.mmmi.mdsd.X21.Type");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleFunction"
    // InternalX21.g:260:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalX21.g:260:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalX21.g:261:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalX21.g:267:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_lambda_2_0= ruleLambda ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_lambda_2_0 = null;



        	enterRule();

        try {
            // InternalX21.g:273:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_lambda_2_0= ruleLambda ) ) ) )
            // InternalX21.g:274:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_lambda_2_0= ruleLambda ) ) )
            {
            // InternalX21.g:274:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_lambda_2_0= ruleLambda ) ) )
            // InternalX21.g:275:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) ( (lv_lambda_2_0= ruleLambda ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalX21.g:279:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalX21.g:280:4: (lv_name_1_0= RULE_ID )
            {
            // InternalX21.g:280:4: (lv_name_1_0= RULE_ID )
            // InternalX21.g:281:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalX21.g:297:3: ( (lv_lambda_2_0= ruleLambda ) )
            // InternalX21.g:298:4: (lv_lambda_2_0= ruleLambda )
            {
            // InternalX21.g:298:4: (lv_lambda_2_0= ruleLambda )
            // InternalX21.g:299:5: lv_lambda_2_0= ruleLambda
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getLambdaLambdaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_lambda_2_0=ruleLambda();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					set(
            						current,
            						"lambda",
            						lv_lambda_2_0,
            						"dk.sdu.mmmi.mdsd.X21.Lambda");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleLambda"
    // InternalX21.g:320:1: entryRuleLambda returns [EObject current=null] : iv_ruleLambda= ruleLambda EOF ;
    public final EObject entryRuleLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambda = null;


        try {
            // InternalX21.g:320:47: (iv_ruleLambda= ruleLambda EOF )
            // InternalX21.g:321:2: iv_ruleLambda= ruleLambda EOF
            {
             newCompositeNode(grammarAccess.getLambdaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLambda=ruleLambda();

            state._fsp--;

             current =iv_ruleLambda; 
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
    // $ANTLR end "entryRuleLambda"


    // $ANTLR start "ruleLambda"
    // InternalX21.g:327:1: ruleLambda returns [EObject current=null] : (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_exp_6_0= ruleExp ) ) otherlv_7= '}' ) ;
    public final EObject ruleLambda() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;

        EObject lv_exp_6_0 = null;



        	enterRule();

        try {
            // InternalX21.g:333:2: ( (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_exp_6_0= ruleExp ) ) otherlv_7= '}' ) )
            // InternalX21.g:334:2: (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_exp_6_0= ruleExp ) ) otherlv_7= '}' )
            {
            // InternalX21.g:334:2: (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_exp_6_0= ruleExp ) ) otherlv_7= '}' )
            // InternalX21.g:335:3: otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_exp_6_0= ruleExp ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLambdaAccess().getLeftParenthesisKeyword_0());
            		
            // InternalX21.g:339:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalX21.g:340:4: (lv_name_1_0= RULE_ID )
            {
            // InternalX21.g:340:4: (lv_name_1_0= RULE_ID )
            // InternalX21.g:341:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLambdaAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLambdaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLambdaAccess().getColonKeyword_2());
            		
            // InternalX21.g:361:3: ( (lv_type_3_0= ruleType ) )
            // InternalX21.g:362:4: (lv_type_3_0= ruleType )
            {
            // InternalX21.g:362:4: (lv_type_3_0= ruleType )
            // InternalX21.g:363:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getLambdaAccess().getTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLambdaRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"dk.sdu.mmmi.mdsd.X21.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getLambdaAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getLambdaAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalX21.g:388:3: ( (lv_exp_6_0= ruleExp ) )
            // InternalX21.g:389:4: (lv_exp_6_0= ruleExp )
            {
            // InternalX21.g:389:4: (lv_exp_6_0= ruleExp )
            // InternalX21.g:390:5: lv_exp_6_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLambdaAccess().getExpExpParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_exp_6_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLambdaRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_6_0,
            						"dk.sdu.mmmi.mdsd.X21.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLambdaAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleLambda"


    // $ANTLR start "entryRuleInput"
    // InternalX21.g:415:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalX21.g:415:46: (iv_ruleInput= ruleInput EOF )
            // InternalX21.g:416:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalX21.g:422:1: ruleInput returns [EObject current=null] : (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalX21.g:428:2: ( (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // InternalX21.g:429:2: (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // InternalX21.g:429:2: (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // InternalX21.g:430:3: otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInputAccess().getInputKeyword_0());
            		
            // InternalX21.g:434:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalX21.g:435:4: (lv_name_1_0= RULE_ID )
            {
            // InternalX21.g:435:4: (lv_name_1_0= RULE_ID )
            // InternalX21.g:436:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInputAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getInputAccess().getColonKeyword_2());
            		
            // InternalX21.g:456:3: ( (lv_type_3_0= ruleType ) )
            // InternalX21.g:457:4: (lv_type_3_0= ruleType )
            {
            // InternalX21.g:457:4: (lv_type_3_0= ruleType )
            // InternalX21.g:458:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getInputAccess().getTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"dk.sdu.mmmi.mdsd.X21.Type");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleNode"
    // InternalX21.g:479:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalX21.g:479:45: (iv_ruleNode= ruleNode EOF )
            // InternalX21.g:480:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalX21.g:486:1: ruleNode returns [EObject current=null] : (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_function_3_0= RULE_ID ) ) | ( (lv_lambda_4_0= ruleLambda ) ) ) otherlv_5= ']' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_function_3_0=null;
        Token otherlv_5=null;
        EObject lv_lambda_4_0 = null;



        	enterRule();

        try {
            // InternalX21.g:492:2: ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_function_3_0= RULE_ID ) ) | ( (lv_lambda_4_0= ruleLambda ) ) ) otherlv_5= ']' ) )
            // InternalX21.g:493:2: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_function_3_0= RULE_ID ) ) | ( (lv_lambda_4_0= ruleLambda ) ) ) otherlv_5= ']' )
            {
            // InternalX21.g:493:2: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_function_3_0= RULE_ID ) ) | ( (lv_lambda_4_0= ruleLambda ) ) ) otherlv_5= ']' )
            // InternalX21.g:494:3: otherlv_0= 'node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_function_3_0= RULE_ID ) ) | ( (lv_lambda_4_0= ruleLambda ) ) ) otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
            		
            // InternalX21.g:498:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalX21.g:499:4: (lv_name_1_0= RULE_ID )
            {
            // InternalX21.g:499:4: (lv_name_1_0= RULE_ID )
            // InternalX21.g:500:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalX21.g:520:3: ( ( (lv_function_3_0= RULE_ID ) ) | ( (lv_lambda_4_0= ruleLambda ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalX21.g:521:4: ( (lv_function_3_0= RULE_ID ) )
                    {
                    // InternalX21.g:521:4: ( (lv_function_3_0= RULE_ID ) )
                    // InternalX21.g:522:5: (lv_function_3_0= RULE_ID )
                    {
                    // InternalX21.g:522:5: (lv_function_3_0= RULE_ID )
                    // InternalX21.g:523:6: lv_function_3_0= RULE_ID
                    {
                    lv_function_3_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(lv_function_3_0, grammarAccess.getNodeAccess().getFunctionIDTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNodeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"function",
                    							lv_function_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalX21.g:540:4: ( (lv_lambda_4_0= ruleLambda ) )
                    {
                    // InternalX21.g:540:4: ( (lv_lambda_4_0= ruleLambda ) )
                    // InternalX21.g:541:5: (lv_lambda_4_0= ruleLambda )
                    {
                    // InternalX21.g:541:5: (lv_lambda_4_0= ruleLambda )
                    // InternalX21.g:542:6: lv_lambda_4_0= ruleLambda
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getLambdaLambdaParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_lambda_4_0=ruleLambda();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						set(
                    							current,
                    							"lambda",
                    							lv_lambda_4_0,
                    							"dk.sdu.mmmi.mdsd.X21.Lambda");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getNodeAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleStream"
    // InternalX21.g:568:1: entryRuleStream returns [EObject current=null] : iv_ruleStream= ruleStream EOF ;
    public final EObject entryRuleStream() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStream = null;


        try {
            // InternalX21.g:568:47: (iv_ruleStream= ruleStream EOF )
            // InternalX21.g:569:2: iv_ruleStream= ruleStream EOF
            {
             newCompositeNode(grammarAccess.getStreamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStream=ruleStream();

            state._fsp--;

             current =iv_ruleStream; 
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
    // $ANTLR end "entryRuleStream"


    // $ANTLR start "ruleStream"
    // InternalX21.g:575:1: ruleStream returns [EObject current=null] : (otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_inputs_3_0= RULE_ID ) ) )* (otherlv_4= 'to' ( (lv_elements_5_0= ruleElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleElement ) ) )* )+ ) ;
    public final EObject ruleStream() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_inputs_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_elements_5_0 = null;

        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalX21.g:581:2: ( (otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_inputs_3_0= RULE_ID ) ) )* (otherlv_4= 'to' ( (lv_elements_5_0= ruleElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleElement ) ) )* )+ ) )
            // InternalX21.g:582:2: (otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_inputs_3_0= RULE_ID ) ) )* (otherlv_4= 'to' ( (lv_elements_5_0= ruleElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleElement ) ) )* )+ )
            {
            // InternalX21.g:582:2: (otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_inputs_3_0= RULE_ID ) ) )* (otherlv_4= 'to' ( (lv_elements_5_0= ruleElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleElement ) ) )* )+ )
            // InternalX21.g:583:3: otherlv_0= 'stream' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' ( (lv_inputs_3_0= RULE_ID ) ) )* (otherlv_4= 'to' ( (lv_elements_5_0= ruleElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleElement ) ) )* )+
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStreamAccess().getStreamKeyword_0());
            		
            // InternalX21.g:587:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalX21.g:588:4: (lv_name_1_0= RULE_ID )
            {
            // InternalX21.g:588:4: (lv_name_1_0= RULE_ID )
            // InternalX21.g:589:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStreamAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStreamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalX21.g:605:3: (otherlv_2= ',' ( (lv_inputs_3_0= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalX21.g:606:4: otherlv_2= ',' ( (lv_inputs_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getStreamAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalX21.g:610:4: ( (lv_inputs_3_0= RULE_ID ) )
            	    // InternalX21.g:611:5: (lv_inputs_3_0= RULE_ID )
            	    {
            	    // InternalX21.g:611:5: (lv_inputs_3_0= RULE_ID )
            	    // InternalX21.g:612:6: lv_inputs_3_0= RULE_ID
            	    {
            	    lv_inputs_3_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    						newLeafNode(lv_inputs_3_0, grammarAccess.getStreamAccess().getInputsIDTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getStreamRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"inputs",
            	    							lv_inputs_3_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalX21.g:629:3: (otherlv_4= 'to' ( (lv_elements_5_0= ruleElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleElement ) ) )* )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalX21.g:630:4: otherlv_4= 'to' ( (lv_elements_5_0= ruleElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleElement ) ) )*
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_16); 

            	    				newLeafNode(otherlv_4, grammarAccess.getStreamAccess().getToKeyword_3_0());
            	    			
            	    // InternalX21.g:634:4: ( (lv_elements_5_0= ruleElement ) )
            	    // InternalX21.g:635:5: (lv_elements_5_0= ruleElement )
            	    {
            	    // InternalX21.g:635:5: (lv_elements_5_0= ruleElement )
            	    // InternalX21.g:636:6: lv_elements_5_0= ruleElement
            	    {

            	    						newCompositeNode(grammarAccess.getStreamAccess().getElementsElementParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_elements_5_0=ruleElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStreamRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_5_0,
            	    							"dk.sdu.mmmi.mdsd.X21.Element");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalX21.g:653:4: (otherlv_6= ',' ( (lv_elements_7_0= ruleElement ) ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==24) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalX21.g:654:5: otherlv_6= ',' ( (lv_elements_7_0= ruleElement ) )
            	    	    {
            	    	    otherlv_6=(Token)match(input,24,FOLLOW_16); 

            	    	    					newLeafNode(otherlv_6, grammarAccess.getStreamAccess().getCommaKeyword_3_2_0());
            	    	    				
            	    	    // InternalX21.g:658:5: ( (lv_elements_7_0= ruleElement ) )
            	    	    // InternalX21.g:659:6: (lv_elements_7_0= ruleElement )
            	    	    {
            	    	    // InternalX21.g:659:6: (lv_elements_7_0= ruleElement )
            	    	    // InternalX21.g:660:7: lv_elements_7_0= ruleElement
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getStreamAccess().getElementsElementParserRuleCall_3_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_elements_7_0=ruleElement();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getStreamRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"elements",
            	    	    								lv_elements_7_0,
            	    	    								"dk.sdu.mmmi.mdsd.X21.Element");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


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
    // $ANTLR end "ruleStream"


    // $ANTLR start "entryRuleElement"
    // InternalX21.g:683:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalX21.g:683:48: (iv_ruleElement= ruleElement EOF )
            // InternalX21.g:684:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalX21.g:690:1: ruleElement returns [EObject current=null] : ( ( (lv_nodeName_0_0= RULE_ID ) ) | (otherlv_1= '[' ( ( (lv_function_2_0= RULE_ID ) ) | ( (lv_Lambda_3_0= ruleLambda ) ) ) otherlv_4= ']' ) | (otherlv_5= 'output' ( (lv_outputName_6_0= RULE_ID ) ) ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token lv_nodeName_0_0=null;
        Token otherlv_1=null;
        Token lv_function_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_outputName_6_0=null;
        EObject lv_Lambda_3_0 = null;



        	enterRule();

        try {
            // InternalX21.g:696:2: ( ( ( (lv_nodeName_0_0= RULE_ID ) ) | (otherlv_1= '[' ( ( (lv_function_2_0= RULE_ID ) ) | ( (lv_Lambda_3_0= ruleLambda ) ) ) otherlv_4= ']' ) | (otherlv_5= 'output' ( (lv_outputName_6_0= RULE_ID ) ) ) ) )
            // InternalX21.g:697:2: ( ( (lv_nodeName_0_0= RULE_ID ) ) | (otherlv_1= '[' ( ( (lv_function_2_0= RULE_ID ) ) | ( (lv_Lambda_3_0= ruleLambda ) ) ) otherlv_4= ']' ) | (otherlv_5= 'output' ( (lv_outputName_6_0= RULE_ID ) ) ) )
            {
            // InternalX21.g:697:2: ( ( (lv_nodeName_0_0= RULE_ID ) ) | (otherlv_1= '[' ( ( (lv_function_2_0= RULE_ID ) ) | ( (lv_Lambda_3_0= ruleLambda ) ) ) otherlv_4= ']' ) | (otherlv_5= 'output' ( (lv_outputName_6_0= RULE_ID ) ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 26:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalX21.g:698:3: ( (lv_nodeName_0_0= RULE_ID ) )
                    {
                    // InternalX21.g:698:3: ( (lv_nodeName_0_0= RULE_ID ) )
                    // InternalX21.g:699:4: (lv_nodeName_0_0= RULE_ID )
                    {
                    // InternalX21.g:699:4: (lv_nodeName_0_0= RULE_ID )
                    // InternalX21.g:700:5: lv_nodeName_0_0= RULE_ID
                    {
                    lv_nodeName_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_nodeName_0_0, grammarAccess.getElementAccess().getNodeNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getElementRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"nodeName",
                    						lv_nodeName_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalX21.g:717:3: (otherlv_1= '[' ( ( (lv_function_2_0= RULE_ID ) ) | ( (lv_Lambda_3_0= ruleLambda ) ) ) otherlv_4= ']' )
                    {
                    // InternalX21.g:717:3: (otherlv_1= '[' ( ( (lv_function_2_0= RULE_ID ) ) | ( (lv_Lambda_3_0= ruleLambda ) ) ) otherlv_4= ']' )
                    // InternalX21.g:718:4: otherlv_1= '[' ( ( (lv_function_2_0= RULE_ID ) ) | ( (lv_Lambda_3_0= ruleLambda ) ) ) otherlv_4= ']'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getElementAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalX21.g:722:4: ( ( (lv_function_2_0= RULE_ID ) ) | ( (lv_Lambda_3_0= ruleLambda ) ) )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_ID) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==15) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalX21.g:723:5: ( (lv_function_2_0= RULE_ID ) )
                            {
                            // InternalX21.g:723:5: ( (lv_function_2_0= RULE_ID ) )
                            // InternalX21.g:724:6: (lv_function_2_0= RULE_ID )
                            {
                            // InternalX21.g:724:6: (lv_function_2_0= RULE_ID )
                            // InternalX21.g:725:7: lv_function_2_0= RULE_ID
                            {
                            lv_function_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

                            							newLeafNode(lv_function_2_0, grammarAccess.getElementAccess().getFunctionIDTerminalRuleCall_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getElementRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"function",
                            								lv_function_2_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalX21.g:742:5: ( (lv_Lambda_3_0= ruleLambda ) )
                            {
                            // InternalX21.g:742:5: ( (lv_Lambda_3_0= ruleLambda ) )
                            // InternalX21.g:743:6: (lv_Lambda_3_0= ruleLambda )
                            {
                            // InternalX21.g:743:6: (lv_Lambda_3_0= ruleLambda )
                            // InternalX21.g:744:7: lv_Lambda_3_0= ruleLambda
                            {

                            							newCompositeNode(grammarAccess.getElementAccess().getLambdaLambdaParserRuleCall_1_1_1_0());
                            						
                            pushFollow(FOLLOW_14);
                            lv_Lambda_3_0=ruleLambda();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getElementRule());
                            							}
                            							set(
                            								current,
                            								"Lambda",
                            								lv_Lambda_3_0,
                            								"dk.sdu.mmmi.mdsd.X21.Lambda");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getElementAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalX21.g:768:3: (otherlv_5= 'output' ( (lv_outputName_6_0= RULE_ID ) ) )
                    {
                    // InternalX21.g:768:3: (otherlv_5= 'output' ( (lv_outputName_6_0= RULE_ID ) ) )
                    // InternalX21.g:769:4: otherlv_5= 'output' ( (lv_outputName_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getElementAccess().getOutputKeyword_2_0());
                    			
                    // InternalX21.g:773:4: ( (lv_outputName_6_0= RULE_ID ) )
                    // InternalX21.g:774:5: (lv_outputName_6_0= RULE_ID )
                    {
                    // InternalX21.g:774:5: (lv_outputName_6_0= RULE_ID )
                    // InternalX21.g:775:6: lv_outputName_6_0= RULE_ID
                    {
                    lv_outputName_6_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_outputName_6_0, grammarAccess.getElementAccess().getOutputNameIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"outputName",
                    							lv_outputName_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleDataDecl"
    // InternalX21.g:796:1: entryRuleDataDecl returns [EObject current=null] : iv_ruleDataDecl= ruleDataDecl EOF ;
    public final EObject entryRuleDataDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDecl = null;


        try {
            // InternalX21.g:796:49: (iv_ruleDataDecl= ruleDataDecl EOF )
            // InternalX21.g:797:2: iv_ruleDataDecl= ruleDataDecl EOF
            {
             newCompositeNode(grammarAccess.getDataDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataDecl=ruleDataDecl();

            state._fsp--;

             current =iv_ruleDataDecl; 
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
    // $ANTLR end "entryRuleDataDecl"


    // $ANTLR start "ruleDataDecl"
    // InternalX21.g:803:1: ruleDataDecl returns [EObject current=null] : (otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declNames_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_types_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_declNames_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_types_9_0= ruleType ) ) )* otherlv_10= '}' ) ;
    public final EObject ruleDataDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_declNames_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_declNames_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_types_5_0 = null;

        AntlrDatatypeRuleToken lv_types_9_0 = null;



        	enterRule();

        try {
            // InternalX21.g:809:2: ( (otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declNames_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_types_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_declNames_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_types_9_0= ruleType ) ) )* otherlv_10= '}' ) )
            // InternalX21.g:810:2: (otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declNames_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_types_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_declNames_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_types_9_0= ruleType ) ) )* otherlv_10= '}' )
            {
            // InternalX21.g:810:2: (otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declNames_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_types_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_declNames_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_types_9_0= ruleType ) ) )* otherlv_10= '}' )
            // InternalX21.g:811:3: otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_declNames_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_types_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_declNames_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_types_9_0= ruleType ) ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDataDeclAccess().getDataKeyword_0());
            		
            // InternalX21.g:815:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalX21.g:816:4: (lv_name_1_0= RULE_ID )
            {
            // InternalX21.g:816:4: (lv_name_1_0= RULE_ID )
            // InternalX21.g:817:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataDeclAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getDataDeclAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalX21.g:837:3: ( (lv_declNames_3_0= RULE_ID ) )
            // InternalX21.g:838:4: (lv_declNames_3_0= RULE_ID )
            {
            // InternalX21.g:838:4: (lv_declNames_3_0= RULE_ID )
            // InternalX21.g:839:5: lv_declNames_3_0= RULE_ID
            {
            lv_declNames_3_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_declNames_3_0, grammarAccess.getDataDeclAccess().getDeclNamesIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataDeclRule());
            					}
            					addWithLastConsumed(
            						current,
            						"declNames",
            						lv_declNames_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getDataDeclAccess().getColonKeyword_4());
            		
            // InternalX21.g:859:3: ( (lv_types_5_0= ruleType ) )
            // InternalX21.g:860:4: (lv_types_5_0= ruleType )
            {
            // InternalX21.g:860:4: (lv_types_5_0= ruleType )
            // InternalX21.g:861:5: lv_types_5_0= ruleType
            {

            					newCompositeNode(grammarAccess.getDataDeclAccess().getTypesTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_18);
            lv_types_5_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataDeclRule());
            					}
            					add(
            						current,
            						"types",
            						lv_types_5_0,
            						"dk.sdu.mmmi.mdsd.X21.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalX21.g:878:3: (otherlv_6= ',' ( (lv_declNames_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_types_9_0= ruleType ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalX21.g:879:4: otherlv_6= ',' ( (lv_declNames_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_types_9_0= ruleType ) )
            	    {
            	    otherlv_6=(Token)match(input,24,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getDataDeclAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalX21.g:883:4: ( (lv_declNames_7_0= RULE_ID ) )
            	    // InternalX21.g:884:5: (lv_declNames_7_0= RULE_ID )
            	    {
            	    // InternalX21.g:884:5: (lv_declNames_7_0= RULE_ID )
            	    // InternalX21.g:885:6: lv_declNames_7_0= RULE_ID
            	    {
            	    lv_declNames_7_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    						newLeafNode(lv_declNames_7_0, grammarAccess.getDataDeclAccess().getDeclNamesIDTerminalRuleCall_6_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDataDeclRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"declNames",
            	    							lv_declNames_7_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    otherlv_8=(Token)match(input,13,FOLLOW_6); 

            	    				newLeafNode(otherlv_8, grammarAccess.getDataDeclAccess().getColonKeyword_6_2());
            	    			
            	    // InternalX21.g:905:4: ( (lv_types_9_0= ruleType ) )
            	    // InternalX21.g:906:5: (lv_types_9_0= ruleType )
            	    {
            	    // InternalX21.g:906:5: (lv_types_9_0= ruleType )
            	    // InternalX21.g:907:6: lv_types_9_0= ruleType
            	    {

            	    						newCompositeNode(grammarAccess.getDataDeclAccess().getTypesTypeParserRuleCall_6_3_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_types_9_0=ruleType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDataDeclRule());
            	    						}
            	    						add(
            	    							current,
            	    							"types",
            	    							lv_types_9_0,
            	    							"dk.sdu.mmmi.mdsd.X21.Type");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_10=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDataDeclAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleDataDecl"


    // $ANTLR start "entryRuleType"
    // InternalX21.g:933:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalX21.g:933:44: (iv_ruleType= ruleType EOF )
            // InternalX21.g:934:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalX21.g:940:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'string' | this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalX21.g:946:2: ( (kw= 'int' | kw= 'string' | this_ID_2= RULE_ID ) )
            // InternalX21.g:947:2: (kw= 'int' | kw= 'string' | this_ID_2= RULE_ID )
            {
            // InternalX21.g:947:2: (kw= 'int' | kw= 'string' | this_ID_2= RULE_ID )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt10=1;
                }
                break;
            case 29:
                {
                alt10=2;
                }
                break;
            case RULE_ID:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalX21.g:948:3: kw= 'int'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalX21.g:954:3: kw= 'string'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalX21.g:960:3: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_2);
                    		

                    			newLeafNode(this_ID_2, grammarAccess.getTypeAccess().getIDTerminalRuleCall_2());
                    		

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleExp"
    // InternalX21.g:971:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalX21.g:971:44: (iv_ruleExp= ruleExp EOF )
            // InternalX21.g:972:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalX21.g:978:1: ruleExp returns [EObject current=null] : this_PlusMinus_0= rulePlusMinus ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        EObject this_PlusMinus_0 = null;



        	enterRule();

        try {
            // InternalX21.g:984:2: (this_PlusMinus_0= rulePlusMinus )
            // InternalX21.g:985:2: this_PlusMinus_0= rulePlusMinus
            {

            		newCompositeNode(grammarAccess.getExpAccess().getPlusMinusParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_PlusMinus_0=rulePlusMinus();

            state._fsp--;


            		current = this_PlusMinus_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRulePlusMinus"
    // InternalX21.g:996:1: entryRulePlusMinus returns [EObject current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final EObject entryRulePlusMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusMinus = null;


        try {
            // InternalX21.g:996:50: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalX21.g:997:2: iv_rulePlusMinus= rulePlusMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusMinus=rulePlusMinus();

            state._fsp--;

             current =iv_rulePlusMinus; 
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
    // $ANTLR end "entryRulePlusMinus"


    // $ANTLR start "rulePlusMinus"
    // InternalX21.g:1003:1: rulePlusMinus returns [EObject current=null] : (this_MulDiv_0= ruleMulDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulDiv ) ) )* ) ;
    public final EObject rulePlusMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalX21.g:1009:2: ( (this_MulDiv_0= ruleMulDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulDiv ) ) )* ) )
            // InternalX21.g:1010:2: (this_MulDiv_0= ruleMulDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulDiv ) ) )* )
            {
            // InternalX21.g:1010:2: (this_MulDiv_0= ruleMulDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulDiv ) ) )* )
            // InternalX21.g:1011:3: this_MulDiv_0= ruleMulDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusMinusAccess().getMulDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_MulDiv_0=ruleMulDiv();

            state._fsp--;


            			current = this_MulDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalX21.g:1019:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulDiv ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=30 && LA12_0<=31)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalX21.g:1020:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulDiv ) )
            	    {
            	    // InternalX21.g:1020:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==30) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==31) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalX21.g:1021:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalX21.g:1021:5: ( () otherlv_2= '+' )
            	            // InternalX21.g:1022:6: () otherlv_2= '+'
            	            {
            	            // InternalX21.g:1022:6: ()
            	            // InternalX21.g:1023:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusMinusAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,30,FOLLOW_10); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalX21.g:1035:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalX21.g:1035:5: ( () otherlv_4= '-' )
            	            // InternalX21.g:1036:6: () otherlv_4= '-'
            	            {
            	            // InternalX21.g:1036:6: ()
            	            // InternalX21.g:1037:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusMinusAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,31,FOLLOW_10); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalX21.g:1049:4: ( (lv_right_5_0= ruleMulDiv ) )
            	    // InternalX21.g:1050:5: (lv_right_5_0= ruleMulDiv )
            	    {
            	    // InternalX21.g:1050:5: (lv_right_5_0= ruleMulDiv )
            	    // InternalX21.g:1051:6: lv_right_5_0= ruleMulDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusMinusAccess().getRightMulDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_right_5_0=ruleMulDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.X21.MulDiv");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


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
    // $ANTLR end "rulePlusMinus"


    // $ANTLR start "entryRuleMulDiv"
    // InternalX21.g:1073:1: entryRuleMulDiv returns [EObject current=null] : iv_ruleMulDiv= ruleMulDiv EOF ;
    public final EObject entryRuleMulDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulDiv = null;


        try {
            // InternalX21.g:1073:47: (iv_ruleMulDiv= ruleMulDiv EOF )
            // InternalX21.g:1074:2: iv_ruleMulDiv= ruleMulDiv EOF
            {
             newCompositeNode(grammarAccess.getMulDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulDiv=ruleMulDiv();

            state._fsp--;

             current =iv_ruleMulDiv; 
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
    // $ANTLR end "entryRuleMulDiv"


    // $ANTLR start "ruleMulDiv"
    // InternalX21.g:1080:1: ruleMulDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalX21.g:1086:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalX21.g:1087:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalX21.g:1087:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalX21.g:1088:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalX21.g:1096:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=32 && LA14_0<=33)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalX21.g:1097:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalX21.g:1097:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==32) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==33) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalX21.g:1098:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalX21.g:1098:5: ( () otherlv_2= '*' )
            	            // InternalX21.g:1099:6: () otherlv_2= '*'
            	            {
            	            // InternalX21.g:1099:6: ()
            	            // InternalX21.g:1100:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMulDivAccess().getMultLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,32,FOLLOW_10); 

            	            						newLeafNode(otherlv_2, grammarAccess.getMulDivAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalX21.g:1112:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalX21.g:1112:5: ( () otherlv_4= '/' )
            	            // InternalX21.g:1113:6: () otherlv_4= '/'
            	            {
            	            // InternalX21.g:1113:6: ()
            	            // InternalX21.g:1114:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMulDivAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,33,FOLLOW_10); 

            	            						newLeafNode(otherlv_4, grammarAccess.getMulDivAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalX21.g:1126:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalX21.g:1127:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalX21.g:1127:5: (lv_right_5_0= rulePrimary )
            	    // InternalX21.g:1128:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMulDivAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.X21.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


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
    // $ANTLR end "ruleMulDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalX21.g:1150:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalX21.g:1150:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalX21.g:1151:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalX21.g:1157:1: rulePrimary returns [EObject current=null] : (this_Atomic_0= ruleAtomic | ( () otherlv_2= '(' ( (lv_expression_3_0= ruleExp ) ) otherlv_4= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Atomic_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalX21.g:1163:2: ( (this_Atomic_0= ruleAtomic | ( () otherlv_2= '(' ( (lv_expression_3_0= ruleExp ) ) otherlv_4= ')' ) ) )
            // InternalX21.g:1164:2: (this_Atomic_0= ruleAtomic | ( () otherlv_2= '(' ( (lv_expression_3_0= ruleExp ) ) otherlv_4= ')' ) )
            {
            // InternalX21.g:1164:2: (this_Atomic_0= ruleAtomic | ( () otherlv_2= '(' ( (lv_expression_3_0= ruleExp ) ) otherlv_4= ')' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_INT)||(LA15_0>=34 && LA15_0<=35)||LA15_0==39||LA15_0==47) ) {
                alt15=1;
            }
            else if ( (LA15_0==15) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalX21.g:1165:3: this_Atomic_0= ruleAtomic
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atomic_0=ruleAtomic();

                    state._fsp--;


                    			current = this_Atomic_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalX21.g:1174:3: ( () otherlv_2= '(' ( (lv_expression_3_0= ruleExp ) ) otherlv_4= ')' )
                    {
                    // InternalX21.g:1174:3: ( () otherlv_2= '(' ( (lv_expression_3_0= ruleExp ) ) otherlv_4= ')' )
                    // InternalX21.g:1175:4: () otherlv_2= '(' ( (lv_expression_3_0= ruleExp ) ) otherlv_4= ')'
                    {
                    // InternalX21.g:1175:4: ()
                    // InternalX21.g:1176:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getParenthesisAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalX21.g:1186:4: ( (lv_expression_3_0= ruleExp ) )
                    // InternalX21.g:1187:5: (lv_expression_3_0= ruleExp )
                    {
                    // InternalX21.g:1187:5: (lv_expression_3_0= ruleExp )
                    // InternalX21.g:1188:6: lv_expression_3_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionExpParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_expression_3_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_3_0,
                    							"dk.sdu.mmmi.mdsd.X21.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalX21.g:1214:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalX21.g:1214:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalX21.g:1215:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalX21.g:1221:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_LetBinding_2= ruleLetBinding | ( () otherlv_4= 'none' ) | this_IfStatement_5= ruleIfStatement | this_NewStatement_6= ruleNewStatement | this_ParameterStatement_7= ruleParameterStatement ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_4=null;
        EObject this_LetBinding_2 = null;

        EObject this_IfStatement_5 = null;

        EObject this_NewStatement_6 = null;

        EObject this_ParameterStatement_7 = null;



        	enterRule();

        try {
            // InternalX21.g:1227:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_LetBinding_2= ruleLetBinding | ( () otherlv_4= 'none' ) | this_IfStatement_5= ruleIfStatement | this_NewStatement_6= ruleNewStatement | this_ParameterStatement_7= ruleParameterStatement ) )
            // InternalX21.g:1228:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_LetBinding_2= ruleLetBinding | ( () otherlv_4= 'none' ) | this_IfStatement_5= ruleIfStatement | this_NewStatement_6= ruleNewStatement | this_ParameterStatement_7= ruleParameterStatement )
            {
            // InternalX21.g:1228:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_LetBinding_2= ruleLetBinding | ( () otherlv_4= 'none' ) | this_IfStatement_5= ruleIfStatement | this_NewStatement_6= ruleNewStatement | this_ParameterStatement_7= ruleParameterStatement )
            int alt16=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt16=1;
                }
                break;
            case 35:
                {
                alt16=2;
                }
                break;
            case 34:
                {
                alt16=3;
                }
                break;
            case 39:
                {
                alt16=4;
                }
                break;
            case 47:
                {
                alt16=5;
                }
                break;
            case RULE_ID:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalX21.g:1229:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalX21.g:1229:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalX21.g:1230:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalX21.g:1230:4: ()
                    // InternalX21.g:1231:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getIntValueAction_0_0(),
                    						current);
                    				

                    }

                    // InternalX21.g:1237:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalX21.g:1238:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalX21.g:1238:5: (lv_value_1_0= RULE_INT )
                    // InternalX21.g:1239:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalX21.g:1257:3: this_LetBinding_2= ruleLetBinding
                    {

                    			newCompositeNode(grammarAccess.getAtomicAccess().getLetBindingParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LetBinding_2=ruleLetBinding();

                    state._fsp--;


                    			current = this_LetBinding_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalX21.g:1266:3: ( () otherlv_4= 'none' )
                    {
                    // InternalX21.g:1266:3: ( () otherlv_4= 'none' )
                    // InternalX21.g:1267:4: () otherlv_4= 'none'
                    {
                    // InternalX21.g:1267:4: ()
                    // InternalX21.g:1268:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getNoneAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getAtomicAccess().getNoneKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalX21.g:1280:3: this_IfStatement_5= ruleIfStatement
                    {

                    			newCompositeNode(grammarAccess.getAtomicAccess().getIfStatementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfStatement_5=ruleIfStatement();

                    state._fsp--;


                    			current = this_IfStatement_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalX21.g:1289:3: this_NewStatement_6= ruleNewStatement
                    {

                    			newCompositeNode(grammarAccess.getAtomicAccess().getNewStatementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_NewStatement_6=ruleNewStatement();

                    state._fsp--;


                    			current = this_NewStatement_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalX21.g:1298:3: this_ParameterStatement_7= ruleParameterStatement
                    {

                    			newCompositeNode(grammarAccess.getAtomicAccess().getParameterStatementParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterStatement_7=ruleParameterStatement();

                    state._fsp--;


                    			current = this_ParameterStatement_7;
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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleLetBinding"
    // InternalX21.g:1310:1: entryRuleLetBinding returns [EObject current=null] : iv_ruleLetBinding= ruleLetBinding EOF ;
    public final EObject entryRuleLetBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetBinding = null;


        try {
            // InternalX21.g:1310:51: (iv_ruleLetBinding= ruleLetBinding EOF )
            // InternalX21.g:1311:2: iv_ruleLetBinding= ruleLetBinding EOF
            {
             newCompositeNode(grammarAccess.getLetBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLetBinding=ruleLetBinding();

            state._fsp--;

             current =iv_ruleLetBinding; 
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
    // $ANTLR end "entryRuleLetBinding"


    // $ANTLR start "ruleLetBinding"
    // InternalX21.g:1317:1: ruleLetBinding returns [EObject current=null] : (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' ) ;
    public final EObject ruleLetBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_binding_3_0 = null;

        EObject lv_body_5_0 = null;



        	enterRule();

        try {
            // InternalX21.g:1323:2: ( (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' ) )
            // InternalX21.g:1324:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' )
            {
            // InternalX21.g:1324:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' )
            // InternalX21.g:1325:3: otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLetBindingAccess().getLetKeyword_0());
            		
            // InternalX21.g:1329:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalX21.g:1330:4: (lv_name_1_0= RULE_ID )
            {
            // InternalX21.g:1330:4: (lv_name_1_0= RULE_ID )
            // InternalX21.g:1331:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLetBindingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLetBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getLetBindingAccess().getEqualsSignKeyword_2());
            		
            // InternalX21.g:1351:3: ( (lv_binding_3_0= ruleExp ) )
            // InternalX21.g:1352:4: (lv_binding_3_0= ruleExp )
            {
            // InternalX21.g:1352:4: (lv_binding_3_0= ruleExp )
            // InternalX21.g:1353:5: lv_binding_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getBindingExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_binding_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"binding",
            						lv_binding_3_0,
            						"dk.sdu.mmmi.mdsd.X21.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,37,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getLetBindingAccess().getInKeyword_4());
            		
            // InternalX21.g:1374:3: ( (lv_body_5_0= ruleExp ) )
            // InternalX21.g:1375:4: (lv_body_5_0= ruleExp )
            {
            // InternalX21.g:1375:4: (lv_body_5_0= ruleExp )
            // InternalX21.g:1376:5: lv_body_5_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getBodyExpParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_23);
            lv_body_5_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_5_0,
            						"dk.sdu.mmmi.mdsd.X21.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLetBindingAccess().getEndKeyword_6());
            		

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
    // $ANTLR end "ruleLetBinding"


    // $ANTLR start "entryRuleIfStatement"
    // InternalX21.g:1401:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalX21.g:1401:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalX21.g:1402:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             newCompositeNode(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;

             current =iv_ruleIfStatement; 
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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalX21.g:1408:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' ( (lv_statement_1_0= ruleLogicExp ) ) otherlv_2= 'then' ( (lv_trueExpression_3_0= ruleExp ) ) otherlv_4= 'else' ( (lv_falseExpression_5_0= ruleExp ) ) otherlv_6= 'end' ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_statement_1_0 = null;

        EObject lv_trueExpression_3_0 = null;

        EObject lv_falseExpression_5_0 = null;



        	enterRule();

        try {
            // InternalX21.g:1414:2: ( (otherlv_0= 'if' ( (lv_statement_1_0= ruleLogicExp ) ) otherlv_2= 'then' ( (lv_trueExpression_3_0= ruleExp ) ) otherlv_4= 'else' ( (lv_falseExpression_5_0= ruleExp ) ) otherlv_6= 'end' ) )
            // InternalX21.g:1415:2: (otherlv_0= 'if' ( (lv_statement_1_0= ruleLogicExp ) ) otherlv_2= 'then' ( (lv_trueExpression_3_0= ruleExp ) ) otherlv_4= 'else' ( (lv_falseExpression_5_0= ruleExp ) ) otherlv_6= 'end' )
            {
            // InternalX21.g:1415:2: (otherlv_0= 'if' ( (lv_statement_1_0= ruleLogicExp ) ) otherlv_2= 'then' ( (lv_trueExpression_3_0= ruleExp ) ) otherlv_4= 'else' ( (lv_falseExpression_5_0= ruleExp ) ) otherlv_6= 'end' )
            // InternalX21.g:1416:3: otherlv_0= 'if' ( (lv_statement_1_0= ruleLogicExp ) ) otherlv_2= 'then' ( (lv_trueExpression_3_0= ruleExp ) ) otherlv_4= 'else' ( (lv_falseExpression_5_0= ruleExp ) ) otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
            		
            // InternalX21.g:1420:3: ( (lv_statement_1_0= ruleLogicExp ) )
            // InternalX21.g:1421:4: (lv_statement_1_0= ruleLogicExp )
            {
            // InternalX21.g:1421:4: (lv_statement_1_0= ruleLogicExp )
            // InternalX21.g:1422:5: lv_statement_1_0= ruleLogicExp
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getStatementLogicExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_statement_1_0=ruleLogicExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_1_0,
            						"dk.sdu.mmmi.mdsd.X21.LogicExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getThenKeyword_2());
            		
            // InternalX21.g:1443:3: ( (lv_trueExpression_3_0= ruleExp ) )
            // InternalX21.g:1444:4: (lv_trueExpression_3_0= ruleExp )
            {
            // InternalX21.g:1444:4: (lv_trueExpression_3_0= ruleExp )
            // InternalX21.g:1445:5: lv_trueExpression_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getTrueExpressionExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_trueExpression_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            					}
            					set(
            						current,
            						"trueExpression",
            						lv_trueExpression_3_0,
            						"dk.sdu.mmmi.mdsd.X21.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getIfStatementAccess().getElseKeyword_4());
            		
            // InternalX21.g:1466:3: ( (lv_falseExpression_5_0= ruleExp ) )
            // InternalX21.g:1467:4: (lv_falseExpression_5_0= ruleExp )
            {
            // InternalX21.g:1467:4: (lv_falseExpression_5_0= ruleExp )
            // InternalX21.g:1468:5: lv_falseExpression_5_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getFalseExpressionExpParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_23);
            lv_falseExpression_5_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            					}
            					set(
            						current,
            						"falseExpression",
            						lv_falseExpression_5_0,
            						"dk.sdu.mmmi.mdsd.X21.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getIfStatementAccess().getEndKeyword_6());
            		

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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleLogicExp"
    // InternalX21.g:1493:1: entryRuleLogicExp returns [EObject current=null] : iv_ruleLogicExp= ruleLogicExp EOF ;
    public final EObject entryRuleLogicExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicExp = null;


        try {
            // InternalX21.g:1493:49: (iv_ruleLogicExp= ruleLogicExp EOF )
            // InternalX21.g:1494:2: iv_ruleLogicExp= ruleLogicExp EOF
            {
             newCompositeNode(grammarAccess.getLogicExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicExp=ruleLogicExp();

            state._fsp--;

             current =iv_ruleLogicExp; 
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
    // $ANTLR end "entryRuleLogicExp"


    // $ANTLR start "ruleLogicExp"
    // InternalX21.g:1500:1: ruleLogicExp returns [EObject current=null] : ( ( (lv_left_0_0= ruleExp ) ) ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<' | lv_operator_1_3= '>' | lv_operator_1_4= '<=' | lv_operator_1_5= '>=' ) ) ) ( (lv_right_2_0= ruleExp ) ) ) ;
    public final EObject ruleLogicExp() throws RecognitionException {
        EObject current = null;

        Token lv_operator_1_1=null;
        Token lv_operator_1_2=null;
        Token lv_operator_1_3=null;
        Token lv_operator_1_4=null;
        Token lv_operator_1_5=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalX21.g:1506:2: ( ( ( (lv_left_0_0= ruleExp ) ) ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<' | lv_operator_1_3= '>' | lv_operator_1_4= '<=' | lv_operator_1_5= '>=' ) ) ) ( (lv_right_2_0= ruleExp ) ) ) )
            // InternalX21.g:1507:2: ( ( (lv_left_0_0= ruleExp ) ) ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<' | lv_operator_1_3= '>' | lv_operator_1_4= '<=' | lv_operator_1_5= '>=' ) ) ) ( (lv_right_2_0= ruleExp ) ) )
            {
            // InternalX21.g:1507:2: ( ( (lv_left_0_0= ruleExp ) ) ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<' | lv_operator_1_3= '>' | lv_operator_1_4= '<=' | lv_operator_1_5= '>=' ) ) ) ( (lv_right_2_0= ruleExp ) ) )
            // InternalX21.g:1508:3: ( (lv_left_0_0= ruleExp ) ) ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<' | lv_operator_1_3= '>' | lv_operator_1_4= '<=' | lv_operator_1_5= '>=' ) ) ) ( (lv_right_2_0= ruleExp ) )
            {
            // InternalX21.g:1508:3: ( (lv_left_0_0= ruleExp ) )
            // InternalX21.g:1509:4: (lv_left_0_0= ruleExp )
            {
            // InternalX21.g:1509:4: (lv_left_0_0= ruleExp )
            // InternalX21.g:1510:5: lv_left_0_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLogicExpAccess().getLeftExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_left_0_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicExpRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"dk.sdu.mmmi.mdsd.X21.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalX21.g:1527:3: ( ( (lv_operator_1_1= '=' | lv_operator_1_2= '<' | lv_operator_1_3= '>' | lv_operator_1_4= '<=' | lv_operator_1_5= '>=' ) ) )
            // InternalX21.g:1528:4: ( (lv_operator_1_1= '=' | lv_operator_1_2= '<' | lv_operator_1_3= '>' | lv_operator_1_4= '<=' | lv_operator_1_5= '>=' ) )
            {
            // InternalX21.g:1528:4: ( (lv_operator_1_1= '=' | lv_operator_1_2= '<' | lv_operator_1_3= '>' | lv_operator_1_4= '<=' | lv_operator_1_5= '>=' ) )
            // InternalX21.g:1529:5: (lv_operator_1_1= '=' | lv_operator_1_2= '<' | lv_operator_1_3= '>' | lv_operator_1_4= '<=' | lv_operator_1_5= '>=' )
            {
            // InternalX21.g:1529:5: (lv_operator_1_1= '=' | lv_operator_1_2= '<' | lv_operator_1_3= '>' | lv_operator_1_4= '<=' | lv_operator_1_5= '>=' )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt17=1;
                }
                break;
            case 42:
                {
                alt17=2;
                }
                break;
            case 43:
                {
                alt17=3;
                }
                break;
            case 44:
                {
                alt17=4;
                }
                break;
            case 45:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalX21.g:1530:6: lv_operator_1_1= '='
                    {
                    lv_operator_1_1=(Token)match(input,36,FOLLOW_10); 

                    						newLeafNode(lv_operator_1_1, grammarAccess.getLogicExpAccess().getOperatorEqualsSignKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicExpRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalX21.g:1541:6: lv_operator_1_2= '<'
                    {
                    lv_operator_1_2=(Token)match(input,42,FOLLOW_10); 

                    						newLeafNode(lv_operator_1_2, grammarAccess.getLogicExpAccess().getOperatorLessThanSignKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicExpRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalX21.g:1552:6: lv_operator_1_3= '>'
                    {
                    lv_operator_1_3=(Token)match(input,43,FOLLOW_10); 

                    						newLeafNode(lv_operator_1_3, grammarAccess.getLogicExpAccess().getOperatorGreaterThanSignKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicExpRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalX21.g:1563:6: lv_operator_1_4= '<='
                    {
                    lv_operator_1_4=(Token)match(input,44,FOLLOW_10); 

                    						newLeafNode(lv_operator_1_4, grammarAccess.getLogicExpAccess().getOperatorLessThanSignEqualsSignKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicExpRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_1_4, null);
                    					

                    }
                    break;
                case 5 :
                    // InternalX21.g:1574:6: lv_operator_1_5= '>='
                    {
                    lv_operator_1_5=(Token)match(input,45,FOLLOW_10); 

                    						newLeafNode(lv_operator_1_5, grammarAccess.getLogicExpAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_0_4());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogicExpRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_1_5, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalX21.g:1587:3: ( (lv_right_2_0= ruleExp ) )
            // InternalX21.g:1588:4: (lv_right_2_0= ruleExp )
            {
            // InternalX21.g:1588:4: (lv_right_2_0= ruleExp )
            // InternalX21.g:1589:5: lv_right_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLogicExpAccess().getRightExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLogicExpRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"dk.sdu.mmmi.mdsd.X21.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleLogicExp"


    // $ANTLR start "entryRuleParameterStatement"
    // InternalX21.g:1610:1: entryRuleParameterStatement returns [EObject current=null] : iv_ruleParameterStatement= ruleParameterStatement EOF ;
    public final EObject entryRuleParameterStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStatement = null;


        try {
            // InternalX21.g:1610:59: (iv_ruleParameterStatement= ruleParameterStatement EOF )
            // InternalX21.g:1611:2: iv_ruleParameterStatement= ruleParameterStatement EOF
            {
             newCompositeNode(grammarAccess.getParameterStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterStatement=ruleParameterStatement();

            state._fsp--;

             current =iv_ruleParameterStatement; 
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
    // $ANTLR end "entryRuleParameterStatement"


    // $ANTLR start "ruleParameterStatement"
    // InternalX21.g:1617:1: ruleParameterStatement returns [EObject current=null] : ( ( (lv_objName_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_paramNames_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleParameterStatement() throws RecognitionException {
        EObject current = null;

        Token lv_objName_0_0=null;
        Token otherlv_1=null;
        Token lv_paramNames_2_0=null;


        	enterRule();

        try {
            // InternalX21.g:1623:2: ( ( ( (lv_objName_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_paramNames_2_0= RULE_ID ) ) )* ) )
            // InternalX21.g:1624:2: ( ( (lv_objName_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_paramNames_2_0= RULE_ID ) ) )* )
            {
            // InternalX21.g:1624:2: ( ( (lv_objName_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_paramNames_2_0= RULE_ID ) ) )* )
            // InternalX21.g:1625:3: ( (lv_objName_0_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_paramNames_2_0= RULE_ID ) ) )*
            {
            // InternalX21.g:1625:3: ( (lv_objName_0_0= RULE_ID ) )
            // InternalX21.g:1626:4: (lv_objName_0_0= RULE_ID )
            {
            // InternalX21.g:1626:4: (lv_objName_0_0= RULE_ID )
            // InternalX21.g:1627:5: lv_objName_0_0= RULE_ID
            {
            lv_objName_0_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_objName_0_0, grammarAccess.getParameterStatementAccess().getObjNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"objName",
            						lv_objName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalX21.g:1643:3: (otherlv_1= '.' ( (lv_paramNames_2_0= RULE_ID ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==46) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalX21.g:1644:4: otherlv_1= '.' ( (lv_paramNames_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,46,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getParameterStatementAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalX21.g:1648:4: ( (lv_paramNames_2_0= RULE_ID ) )
            	    // InternalX21.g:1649:5: (lv_paramNames_2_0= RULE_ID )
            	    {
            	    // InternalX21.g:1649:5: (lv_paramNames_2_0= RULE_ID )
            	    // InternalX21.g:1650:6: lv_paramNames_2_0= RULE_ID
            	    {
            	    lv_paramNames_2_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            	    						newLeafNode(lv_paramNames_2_0, grammarAccess.getParameterStatementAccess().getParamNamesIDTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getParameterStatementRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"paramNames",
            	    							lv_paramNames_2_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


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
    // $ANTLR end "ruleParameterStatement"


    // $ANTLR start "entryRuleNewStatement"
    // InternalX21.g:1671:1: entryRuleNewStatement returns [EObject current=null] : iv_ruleNewStatement= ruleNewStatement EOF ;
    public final EObject entryRuleNewStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewStatement = null;


        try {
            // InternalX21.g:1671:53: (iv_ruleNewStatement= ruleNewStatement EOF )
            // InternalX21.g:1672:2: iv_ruleNewStatement= ruleNewStatement EOF
            {
             newCompositeNode(grammarAccess.getNewStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNewStatement=ruleNewStatement();

            state._fsp--;

             current =iv_ruleNewStatement; 
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
    // $ANTLR end "entryRuleNewStatement"


    // $ANTLR start "ruleNewStatement"
    // InternalX21.g:1678:1: ruleNewStatement returns [EObject current=null] : (otherlv_0= 'new' ( (lv_customName_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_paramNames_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_paramValues_5_0= ruleExp ) ) (otherlv_6= ',' ( (lv_paramNames_7_0= RULE_ID ) ) otherlv_8= '=' ( (lv_paramValues_9_0= ruleExp ) ) )* otherlv_10= ']' ) ;
    public final EObject ruleNewStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_customName_1_0=null;
        Token otherlv_2=null;
        Token lv_paramNames_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_paramNames_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_paramValues_5_0 = null;

        EObject lv_paramValues_9_0 = null;



        	enterRule();

        try {
            // InternalX21.g:1684:2: ( (otherlv_0= 'new' ( (lv_customName_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_paramNames_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_paramValues_5_0= ruleExp ) ) (otherlv_6= ',' ( (lv_paramNames_7_0= RULE_ID ) ) otherlv_8= '=' ( (lv_paramValues_9_0= ruleExp ) ) )* otherlv_10= ']' ) )
            // InternalX21.g:1685:2: (otherlv_0= 'new' ( (lv_customName_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_paramNames_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_paramValues_5_0= ruleExp ) ) (otherlv_6= ',' ( (lv_paramNames_7_0= RULE_ID ) ) otherlv_8= '=' ( (lv_paramValues_9_0= ruleExp ) ) )* otherlv_10= ']' )
            {
            // InternalX21.g:1685:2: (otherlv_0= 'new' ( (lv_customName_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_paramNames_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_paramValues_5_0= ruleExp ) ) (otherlv_6= ',' ( (lv_paramNames_7_0= RULE_ID ) ) otherlv_8= '=' ( (lv_paramValues_9_0= ruleExp ) ) )* otherlv_10= ']' )
            // InternalX21.g:1686:3: otherlv_0= 'new' ( (lv_customName_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_paramNames_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_paramValues_5_0= ruleExp ) ) (otherlv_6= ',' ( (lv_paramNames_7_0= RULE_ID ) ) otherlv_8= '=' ( (lv_paramValues_9_0= ruleExp ) ) )* otherlv_10= ']'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNewStatementAccess().getNewKeyword_0());
            		
            // InternalX21.g:1690:3: ( (lv_customName_1_0= RULE_ID ) )
            // InternalX21.g:1691:4: (lv_customName_1_0= RULE_ID )
            {
            // InternalX21.g:1691:4: (lv_customName_1_0= RULE_ID )
            // InternalX21.g:1692:5: lv_customName_1_0= RULE_ID
            {
            lv_customName_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_customName_1_0, grammarAccess.getNewStatementAccess().getCustomNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNewStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"customName",
            						lv_customName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getNewStatementAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalX21.g:1712:3: ( (lv_paramNames_3_0= RULE_ID ) )
            // InternalX21.g:1713:4: (lv_paramNames_3_0= RULE_ID )
            {
            // InternalX21.g:1713:4: (lv_paramNames_3_0= RULE_ID )
            // InternalX21.g:1714:5: lv_paramNames_3_0= RULE_ID
            {
            lv_paramNames_3_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_paramNames_3_0, grammarAccess.getNewStatementAccess().getParamNamesIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNewStatementRule());
            					}
            					addWithLastConsumed(
            						current,
            						"paramNames",
            						lv_paramNames_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getNewStatementAccess().getEqualsSignKeyword_4());
            		
            // InternalX21.g:1734:3: ( (lv_paramValues_5_0= ruleExp ) )
            // InternalX21.g:1735:4: (lv_paramValues_5_0= ruleExp )
            {
            // InternalX21.g:1735:4: (lv_paramValues_5_0= ruleExp )
            // InternalX21.g:1736:5: lv_paramValues_5_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getNewStatementAccess().getParamValuesExpParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_28);
            lv_paramValues_5_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNewStatementRule());
            					}
            					add(
            						current,
            						"paramValues",
            						lv_paramValues_5_0,
            						"dk.sdu.mmmi.mdsd.X21.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalX21.g:1753:3: (otherlv_6= ',' ( (lv_paramNames_7_0= RULE_ID ) ) otherlv_8= '=' ( (lv_paramValues_9_0= ruleExp ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==24) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalX21.g:1754:4: otherlv_6= ',' ( (lv_paramNames_7_0= RULE_ID ) ) otherlv_8= '=' ( (lv_paramValues_9_0= ruleExp ) )
            	    {
            	    otherlv_6=(Token)match(input,24,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getNewStatementAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalX21.g:1758:4: ( (lv_paramNames_7_0= RULE_ID ) )
            	    // InternalX21.g:1759:5: (lv_paramNames_7_0= RULE_ID )
            	    {
            	    // InternalX21.g:1759:5: (lv_paramNames_7_0= RULE_ID )
            	    // InternalX21.g:1760:6: lv_paramNames_7_0= RULE_ID
            	    {
            	    lv_paramNames_7_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    						newLeafNode(lv_paramNames_7_0, grammarAccess.getNewStatementAccess().getParamNamesIDTerminalRuleCall_6_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getNewStatementRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"paramNames",
            	    							lv_paramNames_7_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    otherlv_8=(Token)match(input,36,FOLLOW_10); 

            	    				newLeafNode(otherlv_8, grammarAccess.getNewStatementAccess().getEqualsSignKeyword_6_2());
            	    			
            	    // InternalX21.g:1780:4: ( (lv_paramValues_9_0= ruleExp ) )
            	    // InternalX21.g:1781:5: (lv_paramValues_9_0= ruleExp )
            	    {
            	    // InternalX21.g:1781:5: (lv_paramValues_9_0= ruleExp )
            	    // InternalX21.g:1782:6: lv_paramValues_9_0= ruleExp
            	    {

            	    						newCompositeNode(grammarAccess.getNewStatementAccess().getParamValuesExpParserRuleCall_6_3_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_paramValues_9_0=ruleExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNewStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"paramValues",
            	    							lv_paramValues_9_0,
            	    							"dk.sdu.mmmi.mdsd.X21.Exp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getNewStatementAccess().getRightSquareBracketKeyword_7());
            		

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
    // $ANTLR end "ruleNewStatement"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008985002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000030000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000808C00008030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004200010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00003C1000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000001400000L});

}