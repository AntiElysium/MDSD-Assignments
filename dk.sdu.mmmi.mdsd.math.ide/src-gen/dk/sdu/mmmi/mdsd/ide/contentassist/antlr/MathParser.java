/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import dk.sdu.mmmi.mdsd.ide.contentassist.antlr.internal.InternalMathParser;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class MathParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MathGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MathGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getExpOpAccess().getAlternatives(), "rule__ExpOp__Alternatives");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getLetMathAccess().getAlternatives(), "rule__LetMath__Alternatives");
			builder.put(grammarAccess.getMathExpAccess().getGroup(), "rule__MathExp__Group__0");
			builder.put(grammarAccess.getExpAccess().getGroup(), "rule__Exp__Group__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1(), "rule__Exp__Group_1__0");
			builder.put(grammarAccess.getExpOpAccess().getGroup_0(), "rule__ExpOp__Group_0__0");
			builder.put(grammarAccess.getExpOpAccess().getGroup_1(), "rule__ExpOp__Group_1__0");
			builder.put(grammarAccess.getExpOpAccess().getGroup_2(), "rule__ExpOp__Group_2__0");
			builder.put(grammarAccess.getExpOpAccess().getGroup_3(), "rule__ExpOp__Group_3__0");
			builder.put(grammarAccess.getParenthesisAccess().getGroup(), "rule__Parenthesis__Group__0");
			builder.put(grammarAccess.getLetendAccess().getGroup(), "rule__Letend__Group__0");
			builder.put(grammarAccess.getOriginExpAccess().getExpressionsAssignment(), "rule__OriginExp__ExpressionsAssignment");
			builder.put(grammarAccess.getMathExpAccess().getNameAssignment_1(), "rule__MathExp__NameAssignment_1");
			builder.put(grammarAccess.getMathExpAccess().getExpAssignment_3(), "rule__MathExp__ExpAssignment_3");
			builder.put(grammarAccess.getExpAccess().getLeftAssignment_0(), "rule__Exp__LeftAssignment_0");
			builder.put(grammarAccess.getExpAccess().getOperatorAssignment_1_0(), "rule__Exp__OperatorAssignment_1_0");
			builder.put(grammarAccess.getExpAccess().getRightAssignment_1_1(), "rule__Exp__RightAssignment_1_1");
			builder.put(grammarAccess.getParenthesisAccess().getExpAssignment_1(), "rule__Parenthesis__ExpAssignment_1");
			builder.put(grammarAccess.getLetendAccess().getNameAssignment_1(), "rule__Letend__NameAssignment_1");
			builder.put(grammarAccess.getLetendAccess().getValAssignment_3(), "rule__Letend__ValAssignment_3");
			builder.put(grammarAccess.getLetendAccess().getExpAssignment_5(), "rule__Letend__ExpAssignment_5");
			builder.put(grammarAccess.getNumberAccess().getValueAssignment(), "rule__Number__ValueAssignment");
			builder.put(grammarAccess.getVariableUseAccess().getRefAssignment(), "rule__VariableUse__RefAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MathGrammarAccess grammarAccess;

	@Override
	protected InternalMathParser createParser() {
		InternalMathParser result = new InternalMathParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MathGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MathGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
