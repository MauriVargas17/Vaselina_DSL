/*
 * generated by Xtext 2.27.0-SNAPSHOT
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.VaselinaGrammarAccess;

@SuppressWarnings("all")
public class VaselinaSyntacticSequencer extends AbstractSyntacticSequencer {

	protected VaselinaGrammarAccess grammarAccess;
	protected AbstractElementAlias match_IfExpression___LessThanSignHyphenMinusKeyword_10_0_NoKeyword_10_1_HyphenMinusGreaterThanSignKeyword_10_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (VaselinaGrammarAccess) access;
		match_IfExpression___LessThanSignHyphenMinusKeyword_10_0_NoKeyword_10_1_HyphenMinusGreaterThanSignKeyword_10_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getIfExpressionAccess().getLessThanSignHyphenMinusKeyword_10_0()), new TokenAlias(false, false, grammarAccess.getIfExpressionAccess().getNoKeyword_10_1()), new TokenAlias(false, false, grammarAccess.getIfExpressionAccess().getHyphenMinusGreaterThanSignKeyword_10_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_IfExpression___LessThanSignHyphenMinusKeyword_10_0_NoKeyword_10_1_HyphenMinusGreaterThanSignKeyword_10_2__q.equals(syntax))
				emit_IfExpression___LessThanSignHyphenMinusKeyword_10_0_NoKeyword_10_1_HyphenMinusGreaterThanSignKeyword_10_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('&lt;-' 'no' '-&gt;')?
	 *
	 * This ambiguous syntax occurs at:
	 *     ifconditon=varExpression ':' 'yes' '-&gt;' (ambiguity) '&lt;-' (rule end)
	 *     then+=BodyStatement (ambiguity) '&lt;-' (rule end)
	 
	 * </pre>
	 */
	protected void emit_IfExpression___LessThanSignHyphenMinusKeyword_10_0_NoKeyword_10_1_HyphenMinusGreaterThanSignKeyword_10_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}