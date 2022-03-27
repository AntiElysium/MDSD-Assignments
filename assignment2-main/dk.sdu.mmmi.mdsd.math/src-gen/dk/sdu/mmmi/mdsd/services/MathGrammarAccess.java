/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MathGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class OriginExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.OriginExp");
		private final Assignment cExpressionsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cExpressionsMathExpParserRuleCall_0 = (RuleCall)cExpressionsAssignment.eContents().get(0);
		
		//OriginExp:
		//    expressions+=MathExp*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//expressions+=MathExp*
		public Assignment getExpressionsAssignment() { return cExpressionsAssignment; }
		
		//MathExp
		public RuleCall getExpressionsMathExpParserRuleCall_0() { return cExpressionsMathExpParserRuleCall_0; }
	}
	public class MathExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.MathExp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExpAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExpExpParserRuleCall_3_0 = (RuleCall)cExpAssignment_3.eContents().get(0);
		
		//MathExp:
		//    'var' name=ID '=' exp=Exp
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'var' name=ID '=' exp=Exp
		public Group getGroup() { return cGroup; }
		
		//'var'
		public Keyword getVarKeyword_0() { return cVarKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//exp=Exp
		public Assignment getExpAssignment_3() { return cExpAssignment_3; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_3_0() { return cExpExpParserRuleCall_3_0; }
	}
	public class ExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Exp");
		private final RuleCall cPlusOrMinusParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Exp:
		//    PlusOrMinus
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//PlusOrMinus
		public RuleCall getPlusOrMinusParserRuleCall() { return cPlusOrMinusParserRuleCall; }
	}
	public class PlusOrMinusElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.PlusOrMinus");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMulOrDivParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Action cPlusLeftAction_1_0_0 = (Action)cGroup_1_0.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_0_1 = (Keyword)cGroup_1_0.eContents().get(1);
		private final Assignment cRightAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final RuleCall cRightMulOrDivParserRuleCall_1_0_2_0 = (RuleCall)cRightAssignment_1_0_2.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Action cMinusLeftAction_1_1_0 = (Action)cGroup_1_1.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1_1_1 = (Keyword)cGroup_1_1.eContents().get(1);
		private final Assignment cRightAssignment_1_1_2 = (Assignment)cGroup_1_1.eContents().get(2);
		private final RuleCall cRightMulOrDivParserRuleCall_1_1_2_0 = (RuleCall)cRightAssignment_1_1_2.eContents().get(0);
		
		//PlusOrMinus returns Exp:
		//    MulOrDiv ({Plus.left=current} '+' right=MulOrDiv | {Minus.left=current} '-' right=MulOrDiv)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//MulOrDiv ({Plus.left=current} '+' right=MulOrDiv | {Minus.left=current} '-' right=MulOrDiv)*
		public Group getGroup() { return cGroup; }
		
		//MulOrDiv
		public RuleCall getMulOrDivParserRuleCall_0() { return cMulOrDivParserRuleCall_0; }
		
		//({Plus.left=current} '+' right=MulOrDiv | {Minus.left=current} '-' right=MulOrDiv)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//{Plus.left=current} '+' right=MulOrDiv
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{Plus.left=current}
		public Action getPlusLeftAction_1_0_0() { return cPlusLeftAction_1_0_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_1_0_1() { return cPlusSignKeyword_1_0_1; }
		
		//right=MulOrDiv
		public Assignment getRightAssignment_1_0_2() { return cRightAssignment_1_0_2; }
		
		//MulOrDiv
		public RuleCall getRightMulOrDivParserRuleCall_1_0_2_0() { return cRightMulOrDivParserRuleCall_1_0_2_0; }
		
		//{Minus.left=current} '-' right=MulOrDiv
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//{Minus.left=current}
		public Action getMinusLeftAction_1_1_0() { return cMinusLeftAction_1_1_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1_1_1() { return cHyphenMinusKeyword_1_1_1; }
		
		//right=MulOrDiv
		public Assignment getRightAssignment_1_1_2() { return cRightAssignment_1_1_2; }
		
		//MulOrDiv
		public RuleCall getRightMulOrDivParserRuleCall_1_1_2_0() { return cRightMulOrDivParserRuleCall_1_1_2_0; }
	}
	public class MulOrDivElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.MulOrDiv");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPrimaryParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Action cMultiplyLeftAction_1_0_0 = (Action)cGroup_1_0.eContents().get(0);
		private final Keyword cAsteriskKeyword_1_0_1 = (Keyword)cGroup_1_0.eContents().get(1);
		private final Assignment cRightAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final RuleCall cRightPrimaryParserRuleCall_1_0_2_0 = (RuleCall)cRightAssignment_1_0_2.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Action cDivideLeftAction_1_1_0 = (Action)cGroup_1_1.eContents().get(0);
		private final Keyword cSolidusKeyword_1_1_1 = (Keyword)cGroup_1_1.eContents().get(1);
		private final Assignment cRightAssignment_1_1_2 = (Assignment)cGroup_1_1.eContents().get(2);
		private final RuleCall cRightPrimaryParserRuleCall_1_1_2_0 = (RuleCall)cRightAssignment_1_1_2.eContents().get(0);
		
		//MulOrDiv returns Exp:
		//    Primary ({Multiply.left=current} '*' right=Primary | {Divide.left=current} '/' right=Primary)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Primary ({Multiply.left=current} '*' right=Primary | {Divide.left=current} '/' right=Primary)*
		public Group getGroup() { return cGroup; }
		
		//Primary
		public RuleCall getPrimaryParserRuleCall_0() { return cPrimaryParserRuleCall_0; }
		
		//({Multiply.left=current} '*' right=Primary | {Divide.left=current} '/' right=Primary)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//{Multiply.left=current} '*' right=Primary
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{Multiply.left=current}
		public Action getMultiplyLeftAction_1_0_0() { return cMultiplyLeftAction_1_0_0; }
		
		//'*'
		public Keyword getAsteriskKeyword_1_0_1() { return cAsteriskKeyword_1_0_1; }
		
		//right=Primary
		public Assignment getRightAssignment_1_0_2() { return cRightAssignment_1_0_2; }
		
		//Primary
		public RuleCall getRightPrimaryParserRuleCall_1_0_2_0() { return cRightPrimaryParserRuleCall_1_0_2_0; }
		
		//{Divide.left=current} '/' right=Primary
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//{Divide.left=current}
		public Action getDivideLeftAction_1_1_0() { return cDivideLeftAction_1_1_0; }
		
		//'/'
		public Keyword getSolidusKeyword_1_1_1() { return cSolidusKeyword_1_1_1; }
		
		//right=Primary
		public Assignment getRightAssignment_1_1_2() { return cRightAssignment_1_1_2; }
		
		//Primary
		public RuleCall getRightPrimaryParserRuleCall_1_1_2_0() { return cRightPrimaryParserRuleCall_1_1_2_0; }
	}
	public class PrimaryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Primary");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNumberParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cParenthesisParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cVariableUseParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cLetendParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Primary:
		//    Number | Parenthesis | VariableUse | Letend
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Number | Parenthesis | VariableUse | Letend
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Number
		public RuleCall getNumberParserRuleCall_0() { return cNumberParserRuleCall_0; }
		
		//Parenthesis
		public RuleCall getParenthesisParserRuleCall_1() { return cParenthesisParserRuleCall_1; }
		
		//VariableUse
		public RuleCall getVariableUseParserRuleCall_2() { return cVariableUseParserRuleCall_2; }
		
		//Letend
		public RuleCall getLetendParserRuleCall_3() { return cLetendParserRuleCall_3; }
	}
	public class ParenthesisElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Parenthesis");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpExpParserRuleCall_1_0 = (RuleCall)cExpAssignment_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Parenthesis:
		//    '(' exp=Exp ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' exp=Exp ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//exp=Exp
		public Assignment getExpAssignment_1() { return cExpAssignment_1; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_1_0() { return cExpExpParserRuleCall_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class LetendElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Letend");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValExpParserRuleCall_3_0 = (RuleCall)cValAssignment_3.eContents().get(0);
		private final Keyword cInKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cExpAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cExpExpParserRuleCall_5_0 = (RuleCall)cExpAssignment_5.eContents().get(0);
		private final Keyword cEndKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Letend:
		//    'let' name=ID '=' val=Exp 'in' exp=Exp 'end'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'let' name=ID '=' val=Exp 'in' exp=Exp 'end'
		public Group getGroup() { return cGroup; }
		
		//'let'
		public Keyword getLetKeyword_0() { return cLetKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//val=Exp
		public Assignment getValAssignment_3() { return cValAssignment_3; }
		
		//Exp
		public RuleCall getValExpParserRuleCall_3_0() { return cValExpParserRuleCall_3_0; }
		
		//'in'
		public Keyword getInKeyword_4() { return cInKeyword_4; }
		
		//exp=Exp
		public Assignment getExpAssignment_5() { return cExpAssignment_5; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_5_0() { return cExpExpParserRuleCall_5_0; }
		
		//'end'
		public Keyword getEndKeyword_6() { return cEndKeyword_6; }
	}
	public class NumberElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Number");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//Number:
		//    value=INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//value=INT
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_0() { return cValueINTTerminalRuleCall_0; }
	}
	public class LetMathElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.LetMath");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMathExpParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLetendParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//LetMath:
		//    MathExp | Letend
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//MathExp | Letend
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MathExp
		public RuleCall getMathExpParserRuleCall_0() { return cMathExpParserRuleCall_0; }
		
		//Letend
		public RuleCall getLetendParserRuleCall_1() { return cLetendParserRuleCall_1; }
	}
	public class VariableUseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.VariableUse");
		private final Assignment cRefAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cRefLetMathCrossReference_0 = (CrossReference)cRefAssignment.eContents().get(0);
		private final RuleCall cRefLetMathIDTerminalRuleCall_0_1 = (RuleCall)cRefLetMathCrossReference_0.eContents().get(1);
		
		//VariableUse:
		//    ref = [LetMath]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ref = [LetMath]
		public Assignment getRefAssignment() { return cRefAssignment; }
		
		//[LetMath]
		public CrossReference getRefLetMathCrossReference_0() { return cRefLetMathCrossReference_0; }
		
		//ID
		public RuleCall getRefLetMathIDTerminalRuleCall_0_1() { return cRefLetMathIDTerminalRuleCall_0_1; }
	}
	
	
	private final OriginExpElements pOriginExp;
	private final MathExpElements pMathExp;
	private final ExpElements pExp;
	private final PlusOrMinusElements pPlusOrMinus;
	private final MulOrDivElements pMulOrDiv;
	private final PrimaryElements pPrimary;
	private final ParenthesisElements pParenthesis;
	private final LetendElements pLetend;
	private final NumberElements pNumber;
	private final LetMathElements pLetMath;
	private final VariableUseElements pVariableUse;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MathGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pOriginExp = new OriginExpElements();
		this.pMathExp = new MathExpElements();
		this.pExp = new ExpElements();
		this.pPlusOrMinus = new PlusOrMinusElements();
		this.pMulOrDiv = new MulOrDivElements();
		this.pPrimary = new PrimaryElements();
		this.pParenthesis = new ParenthesisElements();
		this.pLetend = new LetendElements();
		this.pNumber = new NumberElements();
		this.pLetMath = new LetMathElements();
		this.pVariableUse = new VariableUseElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("dk.sdu.mmmi.mdsd.Math".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//OriginExp:
	//    expressions+=MathExp*
	//;
	public OriginExpElements getOriginExpAccess() {
		return pOriginExp;
	}
	
	public ParserRule getOriginExpRule() {
		return getOriginExpAccess().getRule();
	}
	
	//MathExp:
	//    'var' name=ID '=' exp=Exp
	//;
	public MathExpElements getMathExpAccess() {
		return pMathExp;
	}
	
	public ParserRule getMathExpRule() {
		return getMathExpAccess().getRule();
	}
	
	//Exp:
	//    PlusOrMinus
	//;
	public ExpElements getExpAccess() {
		return pExp;
	}
	
	public ParserRule getExpRule() {
		return getExpAccess().getRule();
	}
	
	//PlusOrMinus returns Exp:
	//    MulOrDiv ({Plus.left=current} '+' right=MulOrDiv | {Minus.left=current} '-' right=MulOrDiv)*
	//;
	public PlusOrMinusElements getPlusOrMinusAccess() {
		return pPlusOrMinus;
	}
	
	public ParserRule getPlusOrMinusRule() {
		return getPlusOrMinusAccess().getRule();
	}
	
	//MulOrDiv returns Exp:
	//    Primary ({Multiply.left=current} '*' right=Primary | {Divide.left=current} '/' right=Primary)*
	//;
	public MulOrDivElements getMulOrDivAccess() {
		return pMulOrDiv;
	}
	
	public ParserRule getMulOrDivRule() {
		return getMulOrDivAccess().getRule();
	}
	
	//Primary:
	//    Number | Parenthesis | VariableUse | Letend
	//;
	public PrimaryElements getPrimaryAccess() {
		return pPrimary;
	}
	
	public ParserRule getPrimaryRule() {
		return getPrimaryAccess().getRule();
	}
	
	//Parenthesis:
	//    '(' exp=Exp ')'
	//;
	public ParenthesisElements getParenthesisAccess() {
		return pParenthesis;
	}
	
	public ParserRule getParenthesisRule() {
		return getParenthesisAccess().getRule();
	}
	
	//Letend:
	//    'let' name=ID '=' val=Exp 'in' exp=Exp 'end'
	//;
	public LetendElements getLetendAccess() {
		return pLetend;
	}
	
	public ParserRule getLetendRule() {
		return getLetendAccess().getRule();
	}
	
	//Number:
	//    value=INT
	//;
	public NumberElements getNumberAccess() {
		return pNumber;
	}
	
	public ParserRule getNumberRule() {
		return getNumberAccess().getRule();
	}
	
	//LetMath:
	//    MathExp | Letend
	//;
	public LetMathElements getLetMathAccess() {
		return pLetMath;
	}
	
	public ParserRule getLetMathRule() {
		return getLetMathAccess().getRule();
	}
	
	//VariableUse:
	//    ref = [LetMath]
	//;
	public VariableUseElements getVariableUseAccess() {
		return pVariableUse;
	}
	
	public ParserRule getVariableUseRule() {
		return getVariableUseAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
