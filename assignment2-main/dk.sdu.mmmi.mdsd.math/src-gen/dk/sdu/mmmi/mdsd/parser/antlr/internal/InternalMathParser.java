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
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'let'", "'in'", "'end'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMath.g"; }



     	private MathGrammarAccess grammarAccess;

        public InternalMathParser(TokenStream input, MathGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "OriginExp";
       	}

       	@Override
       	protected MathGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleOriginExp"
    // InternalMath.g:64:1: entryRuleOriginExp returns [EObject current=null] : iv_ruleOriginExp= ruleOriginExp EOF ;
    public final EObject entryRuleOriginExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOriginExp = null;


        try {
            // InternalMath.g:64:50: (iv_ruleOriginExp= ruleOriginExp EOF )
            // InternalMath.g:65:2: iv_ruleOriginExp= ruleOriginExp EOF
            {
             newCompositeNode(grammarAccess.getOriginExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOriginExp=ruleOriginExp();

            state._fsp--;

             current =iv_ruleOriginExp; 
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
    // $ANTLR end "entryRuleOriginExp"


    // $ANTLR start "ruleOriginExp"
    // InternalMath.g:71:1: ruleOriginExp returns [EObject current=null] : ( (lv_expressions_0_0= ruleMathExp ) )* ;
    public final EObject ruleOriginExp() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_0_0 = null;



        	enterRule();

        try {
            // InternalMath.g:77:2: ( ( (lv_expressions_0_0= ruleMathExp ) )* )
            // InternalMath.g:78:2: ( (lv_expressions_0_0= ruleMathExp ) )*
            {
            // InternalMath.g:78:2: ( (lv_expressions_0_0= ruleMathExp ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMath.g:79:3: (lv_expressions_0_0= ruleMathExp )
            	    {
            	    // InternalMath.g:79:3: (lv_expressions_0_0= ruleMathExp )
            	    // InternalMath.g:80:4: lv_expressions_0_0= ruleMathExp
            	    {

            	    				newCompositeNode(grammarAccess.getOriginExpAccess().getExpressionsMathExpParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_expressions_0_0=ruleMathExp();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getOriginExpRule());
            	    				}
            	    				add(
            	    					current,
            	    					"expressions",
            	    					lv_expressions_0_0,
            	    					"dk.sdu.mmmi.mdsd.Math.MathExp");
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
    // $ANTLR end "ruleOriginExp"


    // $ANTLR start "entryRuleMathExp"
    // InternalMath.g:100:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMath.g:100:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMath.g:101:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMath.g:107:1: ruleMathExp returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:113:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) ) )
            // InternalMath.g:114:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) )
            {
            // InternalMath.g:114:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) )
            // InternalMath.g:115:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMathExpAccess().getVarKeyword_0());
            		
            // InternalMath.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMathExpAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMathExpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMathExpAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:141:3: ( (lv_exp_3_0= ruleExp ) )
            // InternalMath.g:142:4: (lv_exp_3_0= ruleExp )
            {
            // InternalMath.g:142:4: (lv_exp_3_0= ruleExp )
            // InternalMath.g:143:5: lv_exp_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathExpRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
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
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExp"
    // InternalMath.g:164:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMath.g:164:44: (iv_ruleExp= ruleExp EOF )
            // InternalMath.g:165:2: iv_ruleExp= ruleExp EOF
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
    // InternalMath.g:171:1: ruleExp returns [EObject current=null] : ( ( (lv_left_0_0= rulePrimary ) ) ( ( (lv_operator_1_0= ruleExpOp ) ) ( (lv_right_2_0= ruleExp ) ) )? ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_operator_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalMath.g:177:2: ( ( ( (lv_left_0_0= rulePrimary ) ) ( ( (lv_operator_1_0= ruleExpOp ) ) ( (lv_right_2_0= ruleExp ) ) )? ) )
            // InternalMath.g:178:2: ( ( (lv_left_0_0= rulePrimary ) ) ( ( (lv_operator_1_0= ruleExpOp ) ) ( (lv_right_2_0= ruleExp ) ) )? )
            {
            // InternalMath.g:178:2: ( ( (lv_left_0_0= rulePrimary ) ) ( ( (lv_operator_1_0= ruleExpOp ) ) ( (lv_right_2_0= ruleExp ) ) )? )
            // InternalMath.g:179:3: ( (lv_left_0_0= rulePrimary ) ) ( ( (lv_operator_1_0= ruleExpOp ) ) ( (lv_right_2_0= ruleExp ) ) )?
            {
            // InternalMath.g:179:3: ( (lv_left_0_0= rulePrimary ) )
            // InternalMath.g:180:4: (lv_left_0_0= rulePrimary )
            {
            // InternalMath.g:180:4: (lv_left_0_0= rulePrimary )
            // InternalMath.g:181:5: lv_left_0_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getExpAccess().getLeftPrimaryParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_left_0_0=rulePrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"dk.sdu.mmmi.mdsd.Math.Primary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMath.g:198:3: ( ( (lv_operator_1_0= ruleExpOp ) ) ( (lv_right_2_0= ruleExp ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=13 && LA2_0<=16)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMath.g:199:4: ( (lv_operator_1_0= ruleExpOp ) ) ( (lv_right_2_0= ruleExp ) )
                    {
                    // InternalMath.g:199:4: ( (lv_operator_1_0= ruleExpOp ) )
                    // InternalMath.g:200:5: (lv_operator_1_0= ruleExpOp )
                    {
                    // InternalMath.g:200:5: (lv_operator_1_0= ruleExpOp )
                    // InternalMath.g:201:6: lv_operator_1_0= ruleExpOp
                    {

                    						newCompositeNode(grammarAccess.getExpAccess().getOperatorExpOpParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_operator_1_0=ruleExpOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_1_0,
                    							"dk.sdu.mmmi.mdsd.Math.ExpOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMath.g:218:4: ( (lv_right_2_0= ruleExp ) )
                    // InternalMath.g:219:5: (lv_right_2_0= ruleExp )
                    {
                    // InternalMath.g:219:5: (lv_right_2_0= ruleExp )
                    // InternalMath.g:220:6: lv_right_2_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getExpAccess().getRightExpParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"dk.sdu.mmmi.mdsd.Math.Exp");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleExpOp"
    // InternalMath.g:242:1: entryRuleExpOp returns [EObject current=null] : iv_ruleExpOp= ruleExpOp EOF ;
    public final EObject entryRuleExpOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpOp = null;


        try {
            // InternalMath.g:242:46: (iv_ruleExpOp= ruleExpOp EOF )
            // InternalMath.g:243:2: iv_ruleExpOp= ruleExpOp EOF
            {
             newCompositeNode(grammarAccess.getExpOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpOp=ruleExpOp();

            state._fsp--;

             current =iv_ruleExpOp; 
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
    // $ANTLR end "entryRuleExpOp"


    // $ANTLR start "ruleExpOp"
    // InternalMath.g:249:1: ruleExpOp returns [EObject current=null] : ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) | ( () otherlv_5= '*' ) | ( () otherlv_7= '/' ) ) ;
    public final EObject ruleExpOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMath.g:255:2: ( ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) | ( () otherlv_5= '*' ) | ( () otherlv_7= '/' ) ) )
            // InternalMath.g:256:2: ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) | ( () otherlv_5= '*' ) | ( () otherlv_7= '/' ) )
            {
            // InternalMath.g:256:2: ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) | ( () otherlv_5= '*' ) | ( () otherlv_7= '/' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMath.g:257:3: ( () otherlv_1= '+' )
                    {
                    // InternalMath.g:257:3: ( () otherlv_1= '+' )
                    // InternalMath.g:258:4: () otherlv_1= '+'
                    {
                    // InternalMath.g:258:4: ()
                    // InternalMath.g:259:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpOpAccess().getPlusAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpOpAccess().getPlusSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:271:3: ( () otherlv_3= '-' )
                    {
                    // InternalMath.g:271:3: ( () otherlv_3= '-' )
                    // InternalMath.g:272:4: () otherlv_3= '-'
                    {
                    // InternalMath.g:272:4: ()
                    // InternalMath.g:273:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpOpAccess().getMinusAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpOpAccess().getHyphenMinusKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMath.g:285:3: ( () otherlv_5= '*' )
                    {
                    // InternalMath.g:285:3: ( () otherlv_5= '*' )
                    // InternalMath.g:286:4: () otherlv_5= '*'
                    {
                    // InternalMath.g:286:4: ()
                    // InternalMath.g:287:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpOpAccess().getMultAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getExpOpAccess().getAsteriskKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMath.g:299:3: ( () otherlv_7= '/' )
                    {
                    // InternalMath.g:299:3: ( () otherlv_7= '/' )
                    // InternalMath.g:300:4: () otherlv_7= '/'
                    {
                    // InternalMath.g:300:4: ()
                    // InternalMath.g:301:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpOpAccess().getDivAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getExpOpAccess().getSolidusKeyword_3_1());
                    			

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
    // $ANTLR end "ruleExpOp"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:316:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMath.g:316:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMath.g:317:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalMath.g:323:1: rulePrimary returns [EObject current=null] : (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_Letend_3= ruleLetend ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_Parenthesis_1 = null;

        EObject this_VariableUse_2 = null;

        EObject this_Letend_3 = null;



        	enterRule();

        try {
            // InternalMath.g:329:2: ( (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_Letend_3= ruleLetend ) )
            // InternalMath.g:330:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_Letend_3= ruleLetend )
            {
            // InternalMath.g:330:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse | this_Letend_3= ruleLetend )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
                {
                alt4=3;
                }
                break;
            case 19:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMath.g:331:3: this_Number_0= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_0=ruleNumber();

                    state._fsp--;


                    			current = this_Number_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMath.g:340:3: this_Parenthesis_1= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_1=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMath.g:349:3: this_VariableUse_2= ruleVariableUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableUse_2=ruleVariableUse();

                    state._fsp--;


                    			current = this_VariableUse_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMath.g:358:3: this_Letend_3= ruleLetend
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLetendParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Letend_3=ruleLetend();

                    state._fsp--;


                    			current = this_Letend_3;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMath.g:370:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalMath.g:370:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalMath.g:371:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMath.g:377:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalMath.g:383:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) )
            // InternalMath.g:384:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            {
            // InternalMath.g:384:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            // InternalMath.g:385:3: otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMath.g:389:3: ( (lv_exp_1_0= ruleExp ) )
            // InternalMath.g:390:4: (lv_exp_1_0= ruleExp )
            {
            // InternalMath.g:390:4: (lv_exp_1_0= ruleExp )
            // InternalMath.g:391:5: lv_exp_1_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_exp_1_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParenthesisRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleLetend"
    // InternalMath.g:416:1: entryRuleLetend returns [EObject current=null] : iv_ruleLetend= ruleLetend EOF ;
    public final EObject entryRuleLetend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetend = null;


        try {
            // InternalMath.g:416:47: (iv_ruleLetend= ruleLetend EOF )
            // InternalMath.g:417:2: iv_ruleLetend= ruleLetend EOF
            {
             newCompositeNode(grammarAccess.getLetendRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLetend=ruleLetend();

            state._fsp--;

             current =iv_ruleLetend; 
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
    // $ANTLR end "entryRuleLetend"


    // $ANTLR start "ruleLetend"
    // InternalMath.g:423:1: ruleLetend returns [EObject current=null] : (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_exp_5_0= ruleExp ) ) otherlv_6= 'end' ) ;
    public final EObject ruleLetend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_val_3_0 = null;

        EObject lv_exp_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:429:2: ( (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_exp_5_0= ruleExp ) ) otherlv_6= 'end' ) )
            // InternalMath.g:430:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_exp_5_0= ruleExp ) ) otherlv_6= 'end' )
            {
            // InternalMath.g:430:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_exp_5_0= ruleExp ) ) otherlv_6= 'end' )
            // InternalMath.g:431:3: otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_exp_5_0= ruleExp ) ) otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLetendAccess().getLetKeyword_0());
            		
            // InternalMath.g:435:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:436:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:436:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:437:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLetendAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLetendRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLetendAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:457:3: ( (lv_val_3_0= ruleExp ) )
            // InternalMath.g:458:4: (lv_val_3_0= ruleExp )
            {
            // InternalMath.g:458:4: (lv_val_3_0= ruleExp )
            // InternalMath.g:459:5: lv_val_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetendAccess().getValExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_val_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetendRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_3_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getLetendAccess().getInKeyword_4());
            		
            // InternalMath.g:480:3: ( (lv_exp_5_0= ruleExp ) )
            // InternalMath.g:481:4: (lv_exp_5_0= ruleExp )
            {
            // InternalMath.g:481:4: (lv_exp_5_0= ruleExp )
            // InternalMath.g:482:5: lv_exp_5_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetendAccess().getExpExpParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_exp_5_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetendRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_5_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLetendAccess().getEndKeyword_6());
            		

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
    // $ANTLR end "ruleLetend"


    // $ANTLR start "entryRuleNumber"
    // InternalMath.g:507:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalMath.g:507:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalMath.g:508:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMath.g:514:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMath.g:520:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalMath.g:521:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalMath.g:521:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalMath.g:522:3: (lv_value_0_0= RULE_INT )
            {
            // InternalMath.g:522:3: (lv_value_0_0= RULE_INT )
            // InternalMath.g:523:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumberRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMath.g:542:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalMath.g:542:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalMath.g:543:2: iv_ruleVariableUse= ruleVariableUse EOF
            {
             newCompositeNode(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableUse=ruleVariableUse();

            state._fsp--;

             current =iv_ruleVariableUse; 
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
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMath.g:549:1: ruleVariableUse returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMath.g:555:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMath.g:556:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMath.g:556:2: ( (otherlv_0= RULE_ID ) )
            // InternalMath.g:557:3: (otherlv_0= RULE_ID )
            {
            // InternalMath.g:557:3: (otherlv_0= RULE_ID )
            // InternalMath.g:558:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableUseRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVariableUseAccess().getRefLetMathCrossReference_0());
            			

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
    // $ANTLR end "ruleVariableUse"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000A0030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});

}