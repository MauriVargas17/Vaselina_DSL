/*
 * generated by Xtext 2.27.0-SNAPSHOT
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.services.VaselinaGrammarAccess;
import org.xtext.example.mydsl.vaselina.And;
import org.xtext.example.mydsl.vaselina.BrkStr;
import org.xtext.example.mydsl.vaselina.Comparison;
import org.xtext.example.mydsl.vaselina.DOUBLE;
import org.xtext.example.mydsl.vaselina.DoWhileExpression;
import org.xtext.example.mydsl.vaselina.Equality;
import org.xtext.example.mydsl.vaselina.FuncCall;
import org.xtext.example.mydsl.vaselina.FuncDefinition;
import org.xtext.example.mydsl.vaselina.FuncParameter;
import org.xtext.example.mydsl.vaselina.IfExpression;
import org.xtext.example.mydsl.vaselina.Inside;
import org.xtext.example.mydsl.vaselina.MulOrDiv;
import org.xtext.example.mydsl.vaselina.Not;
import org.xtext.example.mydsl.vaselina.Or;
import org.xtext.example.mydsl.vaselina.PlusOrMinus;
import org.xtext.example.mydsl.vaselina.ReturnDeclaration;
import org.xtext.example.mydsl.vaselina.StdFunction;
import org.xtext.example.mydsl.vaselina.StringRef;
import org.xtext.example.mydsl.vaselina.VaselinaPackage;
import org.xtext.example.mydsl.vaselina.VaselinaProgram;
import org.xtext.example.mydsl.vaselina.arrayDimension;
import org.xtext.example.mydsl.vaselina.arrayRef;
import org.xtext.example.mydsl.vaselina.arrayRefs;
import org.xtext.example.mydsl.vaselina.boolRef;
import org.xtext.example.mydsl.vaselina.doubleRef;
import org.xtext.example.mydsl.vaselina.mainDeclared;
import org.xtext.example.mydsl.vaselina.numRef;
import org.xtext.example.mydsl.vaselina.varAssignment;
import org.xtext.example.mydsl.vaselina.varDeclared;
import org.xtext.example.mydsl.vaselina.varRef;
import org.xtext.example.mydsl.vaselina.varRefs;
import org.xtext.example.mydsl.vaselina.varReturn;

@SuppressWarnings("all")
public class VaselinaSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private VaselinaGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == VaselinaPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case VaselinaPackage.AND:
				sequence_And(context, (And) semanticObject); 
				return; 
			case VaselinaPackage.BRK_STR:
				sequence_BrkStr(context, (BrkStr) semanticObject); 
				return; 
			case VaselinaPackage.COMPARISON:
				sequence_Comparison(context, (Comparison) semanticObject); 
				return; 
			case VaselinaPackage.DOUBLE:
				sequence_DOUBLE(context, (DOUBLE) semanticObject); 
				return; 
			case VaselinaPackage.DO_WHILE_EXPRESSION:
				sequence_DoWhileExpression(context, (DoWhileExpression) semanticObject); 
				return; 
			case VaselinaPackage.EQUALITY:
				sequence_Equality(context, (Equality) semanticObject); 
				return; 
			case VaselinaPackage.FUNC_CALL:
				sequence_FuncCall(context, (FuncCall) semanticObject); 
				return; 
			case VaselinaPackage.FUNC_DEFINITION:
				sequence_FuncDefinition(context, (FuncDefinition) semanticObject); 
				return; 
			case VaselinaPackage.FUNC_PARAMETER:
				sequence_FuncTypedDeclaration(context, (FuncParameter) semanticObject); 
				return; 
			case VaselinaPackage.IF_EXPRESSION:
				sequence_IfExpression(context, (IfExpression) semanticObject); 
				return; 
			case VaselinaPackage.INSIDE:
				sequence_Primary(context, (Inside) semanticObject); 
				return; 
			case VaselinaPackage.MODULE:
				sequence_Module(context, (org.xtext.example.mydsl.vaselina.Module) semanticObject); 
				return; 
			case VaselinaPackage.MUL_OR_DIV:
				sequence_MulOrDiv(context, (MulOrDiv) semanticObject); 
				return; 
			case VaselinaPackage.NOT:
				sequence_Primary(context, (Not) semanticObject); 
				return; 
			case VaselinaPackage.OR:
				sequence_Or(context, (Or) semanticObject); 
				return; 
			case VaselinaPackage.PLUS_OR_MINUS:
				sequence_PlusOrMinus(context, (PlusOrMinus) semanticObject); 
				return; 
			case VaselinaPackage.RETURN_DECLARATION:
				sequence_ReturnDeclaration(context, (ReturnDeclaration) semanticObject); 
				return; 
			case VaselinaPackage.STD_FUNCTION:
				sequence_StdFunction(context, (StdFunction) semanticObject); 
				return; 
			case VaselinaPackage.STRING_REF:
				sequence_Terminal(context, (StringRef) semanticObject); 
				return; 
			case VaselinaPackage.VASELINA_PROGRAM:
				sequence_VaselinaProgram(context, (VaselinaProgram) semanticObject); 
				return; 
			case VaselinaPackage.ARRAY_DIMENSION:
				sequence_arrayDimension(context, (arrayDimension) semanticObject); 
				return; 
			case VaselinaPackage.ARRAY_REF:
				sequence_Terminal(context, (arrayRef) semanticObject); 
				return; 
			case VaselinaPackage.ARRAY_REFS:
				sequence_Variable(context, (arrayRefs) semanticObject); 
				return; 
			case VaselinaPackage.BOOL_REF:
				sequence_Terminal(context, (boolRef) semanticObject); 
				return; 
			case VaselinaPackage.DOUBLE_REF:
				sequence_Terminal(context, (doubleRef) semanticObject); 
				return; 
			case VaselinaPackage.MAIN_DECLARED:
				sequence_mainDeclared(context, (mainDeclared) semanticObject); 
				return; 
			case VaselinaPackage.NUM_REF:
				sequence_Terminal(context, (numRef) semanticObject); 
				return; 
			case VaselinaPackage.VAR_ASSIGNMENT:
				sequence_varAssignment(context, (varAssignment) semanticObject); 
				return; 
			case VaselinaPackage.VAR_DECLARED:
				sequence_varDeclared(context, (varDeclared) semanticObject); 
				return; 
			case VaselinaPackage.VAR_REF:
				sequence_Terminal(context, (varRef) semanticObject); 
				return; 
			case VaselinaPackage.VAR_REFS:
				sequence_Variable(context, (varRefs) semanticObject); 
				return; 
			case VaselinaPackage.VAR_RETURN:
				sequence_varReturn(context, (varReturn) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     varExpression returns And
	 *     Or returns And
	 *     Or.Or_1_0 returns And
	 *     And returns And
	 *     And.And_1_0 returns And
	 *
	 * Constraint:
	 *     (left=And_And_1_0 op='&&' right=Equality)
	 * </pre>
	 */
	protected void sequence_And(ISerializationContext context, And semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VaselinaPackage.Literals.AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VaselinaPackage.Literals.AND__LEFT));
			if (transientValues.isValueTransient(semanticObject, VaselinaPackage.Literals.AND__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VaselinaPackage.Literals.AND__OP));
			if (transientValues.isValueTransient(semanticObject, VaselinaPackage.Literals.AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VaselinaPackage.Literals.AND__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAndAccess().getAndLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndAccess().getOpAmpersandAmpersandKeyword_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     BodyStatement returns BrkStr
	 *     BrkStr returns BrkStr
	 *
	 * Constraint:
	 *     brk='break'
	 * </pre>
	 */
	protected void sequence_BrkStr(ISerializationContext context, BrkStr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VaselinaPackage.Literals.BRK_STR__BRK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VaselinaPackage.Literals.BRK_STR__BRK));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBrkStrAccess().getBrkBreakKeyword_1_0(), semanticObject.getBrk());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     varExpression returns Comparison
	 *     Or returns Comparison
	 *     Or.Or_1_0 returns Comparison
	 *     And returns Comparison
	 *     And.And_1_0 returns Comparison
	 *     Equality returns Comparison
	 *     Equality.Equality_1_0 returns Comparison
	 *     Comparison returns Comparison
	 *     Comparison.Comparison_1_0 returns Comparison
	 *
	 * Constraint:
	 *     (left=Comparison_Comparison_1_0 (op='&gt;=' | op='&lt;=' | op='&gt;' | op='&lt;') right=PlusOrMinus)
	 * </pre>
	 */
	protected void sequence_Comparison(ISerializationContext context, Comparison semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DOUBLE returns DOUBLE
	 *
	 * Constraint:
	 *     (integer=NUM (decimal=INT | decimal=NUM))
	 * </pre>
	 */
	protected void sequence_DOUBLE(ISerializationContext context, DOUBLE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     BodyStatement returns DoWhileExpression
	 *     DoWhileExpression returns DoWhileExpression
	 *
	 * Constraint:
	 *     (loopConditon=varExpression body+=BodyStatement*)
	 * </pre>
	 */
	protected void sequence_DoWhileExpression(ISerializationContext context, DoWhileExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     varExpression returns Equality
	 *     Or returns Equality
	 *     Or.Or_1_0 returns Equality
	 *     And returns Equality
	 *     And.And_1_0 returns Equality
	 *     Equality returns Equality
	 *     Equality.Equality_1_0 returns Equality
	 *
	 * Constraint:
	 *     (left=Equality_Equality_1_0 (op='==' | op='!=') right=Comparison)
	 * </pre>
	 */
	protected void sequence_Equality(ISerializationContext context, Equality semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     BodyStatement returns FuncCall
	 *     FuncCall returns FuncCall
	 *     AbstractMethodCall returns FuncCall
	 *     varExpression returns FuncCall
	 *     Or returns FuncCall
	 *     Or.Or_1_0 returns FuncCall
	 *     And returns FuncCall
	 *     And.And_1_0 returns FuncCall
	 *     Equality returns FuncCall
	 *     Equality.Equality_1_0 returns FuncCall
	 *     Comparison returns FuncCall
	 *     Comparison.Comparison_1_0 returns FuncCall
	 *     PlusOrMinus returns FuncCall
	 *     PlusOrMinus.PlusOrMinus_1_0 returns FuncCall
	 *     MulOrDiv returns FuncCall
	 *     MulOrDiv.MulOrDiv_1_0 returns FuncCall
	 *     Module returns FuncCall
	 *     Module.Module_1_0 returns FuncCall
	 *     Primary returns FuncCall
	 *
	 * Constraint:
	 *     (func=[FuncDefinition|ID] (args+=varExpression args+=varExpression*)?)
	 * </pre>
	 */
	protected void sequence_FuncCall(ISerializationContext context, FuncCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FuncDefinition returns FuncDefinition
	 *
	 * Constraint:
	 *     (name=ID (args+=FuncParameter args+=FuncParameter*)? body+=BodyStatement*)
	 * </pre>
	 */
	protected void sequence_FuncDefinition(ISerializationContext context, FuncDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     varSymbol returns FuncParameter
	 *     FuncParameter returns FuncParameter
	 *
	 * Constraint:
	 *     (type=varTypeLiteral name=ID)
	 * </pre>
	 */
	protected void sequence_FuncTypedDeclaration(ISerializationContext context, FuncParameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VaselinaPackage.Literals.VAR_SYMBOL__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VaselinaPackage.Literals.VAR_SYMBOL__TYPE));
			if (transientValues.isValueTransient(semanticObject, VaselinaPackage.Literals.VAR_SYMBOL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VaselinaPackage.Literals.VAR_SYMBOL__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFuncTypedDeclarationAccess().getTypeVarTypeLiteralParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getFuncTypedDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     BodyStatement returns IfExpression
	 *     IfExpression returns IfExpression
	 *
	 * Constraint:
	 *     (ifconditon=varExpression then+=BodyStatement* else+=BodyStatement*)
	 * </pre>
	 */
	protected void sequence_IfExpression(ISerializationContext context, IfExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     varExpression returns Module
	 *     Or returns Module
	 *     Or.Or_1_0 returns Module
	 *     And returns Module
	 *     And.And_1_0 returns Module
	 *     Equality returns Module
	 *     Equality.Equality_1_0 returns Module
	 *     Comparison returns Module
	 *     Comparison.Comparison_1_0 returns Module
	 *     PlusOrMinus returns Module
	 *     PlusOrMinus.PlusOrMinus_1_0 returns Module
	 *     MulOrDiv returns Module
	 *     MulOrDiv.MulOrDiv_1_0 returns Module
	 *     Module returns Module
	 *     Module.Module_1_0 returns Module
	 *
	 * Constraint:
	 *     (left=Module_Module_1_0 op='%' right=Primary)
	 * </pre>
	 */
	protected void sequence_Module(ISerializationContext context, org.xtext.example.mydsl.vaselina.Module semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VaselinaPackage.Literals.MODULE__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VaselinaPackage.Literals.MODULE__LEFT));
			if (transientValues.isValueTransient(semanticObject, VaselinaPackage.Literals.MODULE__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VaselinaPackage.Literals.MODULE__OP));
			if (transientValues.isValueTransient(semanticObject, VaselinaPackage.Literals.MODULE__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VaselinaPackage.Literals.MODULE__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModuleAccess().getModuleLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getModuleAccess().getOpPercentSignKeyword_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getModuleAccess().getRightPrimaryParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     varExpression returns MulOrDiv
	 *     Or returns MulOrDiv
	 *     Or.Or_1_0 returns MulOrDiv
	 *     And returns MulOrDiv
	 *     And.And_1_0 returns MulOrDiv
	 *     Equality returns MulOrDiv
	 *     Equality.Equality_1_0 returns MulOrDiv
	 *     Comparison returns MulOrDiv
	 *     Comparison.Comparison_1_0 returns MulOrDiv
	 *     PlusOrMinus returns MulOrDiv
	 *     PlusOrMinus.PlusOrMinus_1_0 returns MulOrDiv
	 *     MulOrDiv returns MulOrDiv
	 *     MulOrDiv.MulOrDiv_1_0 returns MulOrDiv
	 *
	 * Constraint:
	 *     (left=MulOrDiv_MulOrDiv_1_0 (op='*' | op='/') right=Module)
	 * </pre>
	 */
	protected void sequence_MulOrDiv(ISerializationContext context, MulOrDiv semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     varExpression returns Or
	 *     Or returns Or
	 *     Or.Or_1_0 returns Or
	 *
	 * Constraint:
	 *     (left=Or_Or_1_0 op='||' right=And)
	 * </pre>
	 */
	protected void sequence_Or(ISerializationContext context, Or semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VaselinaPackage.Literals.OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VaselinaPackage.Literals.OR__LEFT));
			if (transientValues.isValueTransient(semanticObject, VaselinaPackage.Literals.OR__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VaselinaPackage.Literals.OR__OP));
			if (transientValues.isValueTransient(semanticObject, VaselinaPackage.Literals.OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VaselinaPackage.Literals.OR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOrAccess().getOrLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrAccess().getOpVerticalLineVerticalLineKeyword_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     varExpression returns PlusOrMinus
	 *     Or returns PlusOrMinus
	 *     Or.Or_1_0 returns PlusOrMinus
	 *     And returns PlusOrMinus
	 *     And.And_1_0 returns PlusOrMinus
	 *     Equality returns PlusOrMinus
	 *     Equality.Equality_1_0 returns PlusOrMinus
	 *     Comparison returns PlusOrMinus
	 *     Comparison.Comparison_1_0 returns PlusOrMinus
	 *     PlusOrMinus returns PlusOrMinus
	 *     PlusOrMinus.PlusOrMinus_1_0 returns PlusOrMinus
	 *
	 * Constraint:
	 *     (left=PlusOrMinus_PlusOrMinus_1_0 (op='+' | op='-') right=MulOrDiv)
	 * </pre>
	 */
	protected void sequence_PlusOrMinus(ISerializationContext context, PlusOrMinus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     varExpression returns Inside
	 *     Or returns Inside
	 *     Or.Or_1_0 returns Inside
	 *     And returns Inside
	 *     And.And_1_0 returns Inside
	 *     Equality returns Inside
	 *     Equality.Equality_1_0 returns Inside
	 *     Comparison returns Inside
	 *     Comparison.Comparison_1_0 returns Inside
	 *     PlusOrMinus returns Inside
	 *     PlusOrMinus.PlusOrMinus_1_0 returns Inside
	 *     MulOrDiv returns Inside
	 *     MulOrDiv.MulOrDiv_1_0 returns Inside
	 *     Module returns Inside
	 *     Module.Module_1_0 returns Inside
	 *     Primary returns Inside
	 *
	 * Constraint:
	 *     inside=varExpression
	 * </pre>
	 */
	protected void sequence_Primary(ISerializationContext context, Inside semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VaselinaPackage.Literals.INSIDE__INSIDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VaselinaPackage.Literals.INSIDE__INSIDE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryAccess().getInsideVarExpressionParserRuleCall_0_2_0(), semanticObject.getInside());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     varExpression returns Not
	 *     Or returns Not
	 *     Or.Or_1_0 returns Not
	 *     And returns Not
	 *     And.And_1_0 returns Not
	 *     Equality returns Not
	 *     Equality.Equality_1_0 returns Not
	 *     Comparison returns Not
	 *     Comparison.Comparison_1_0 returns Not
	 *     PlusOrMinus returns Not
	 *     PlusOrMinus.PlusOrMinus_1_0 returns Not
	 *     MulOrDiv returns Not
	 *     MulOrDiv.MulOrDiv_1_0 returns Not
	 *     Module returns Not
	 *     Module.Module_1_0 returns Not
	 *     Primary returns Not
	 *
	 * Constraint:
	 *     expression=Primary
	 * </pre>
	 */
	protected void sequence_Primary(ISerializationContext context, Not semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VaselinaPackage.Literals.NOT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VaselinaPackage.Literals.NOT__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     BodyStatement returns ReturnDeclaration
	 *     ReturnDeclaration returns ReturnDeclaration
	 *
	 * Constraint:
	 *     rtnType=varTypeLiteral
	 * </pre>
	 */
	protected void sequence_ReturnDeclaration(ISerializationContext context, ReturnDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VaselinaPackage.Literals.RETURN_DECLARATION__RTN_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VaselinaPackage.Literals.RETURN_DECLARATION__RTN_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReturnDeclarationAccess().getRtnTypeVarTypeLiteralParserRuleCall_2_0(), semanticObject.getRtnType());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     BodyStatement returns StdFunction
	 *     AbstractMethodCall returns StdFunction
	 *     StdFunction returns StdFunction
	 *     varExpression returns StdFunction
	 *     Or returns StdFunction
	 *     Or.Or_1_0 returns StdFunction
	 *     And returns StdFunction
	 *     And.And_1_0 returns StdFunction
	 *     Equality returns StdFunction
	 *     Equality.Equality_1_0 returns StdFunction
	 *     Comparison returns StdFunction
	 *     Comparison.Comparison_1_0 returns StdFunction
	 *     PlusOrMinus returns StdFunction
	 *     PlusOrMinus.PlusOrMinus_1_0 returns StdFunction
	 *     MulOrDiv returns StdFunction
	 *     MulOrDiv.MulOrDiv_1_0 returns StdFunction
	 *     Module returns StdFunction
	 *     Module.Module_1_0 returns StdFunction
	 *     Primary returns StdFunction
	 *
	 * Constraint:
	 *     (name=StdfunctionList (args+=varExpression args+=varExpression*)?)
	 * </pre>
	 */
	protected void sequence_StdFunction(ISerializationContext context, StdFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     varExpression returns StringRef
	 *     Or returns StringRef
	 *     Or.Or_1_0 returns StringRef
	 *     And returns StringRef
	 *     And.And_1_0 returns StringRef
	 *     Equality returns StringRef
	 *     Equality.Equality_1_0 returns StringRef
	 *     Comparison returns StringRef
	 *     Comparison.Comparison_1_0 returns StringRef
	 *     PlusOrMinus returns StringRef
	 *     PlusOrMinus.PlusOrMinus_1_0 returns StringRef
	 *     MulOrDiv returns StringRef
	 *     MulOrDiv.MulOrDiv_1_0 returns StringRef
	 *     Module returns StringRef
	 *     Module.Module_1_0 returns StringRef
	 *     Primary returns StringRef
	 *     Terminal returns StringRef
	 *
	 * Constraint:
	 *     value=STRING
	 * </pre>
	 */
	protected void sequence_Terminal(ISerializationContext context, StringRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VaselinaPackage.Literals.STRING_REF__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VaselinaPackage.Literals.STRING_REF__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTerminalAccess().getValueSTRINGTerminalRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     varExpression returns arrayRef
	 *     Or returns arrayRef
	 *     Or.Or_1_0 returns arrayRef
	 *     And returns arrayRef
	 *     And.And_1_0 returns arrayRef
	 *     Equality returns arrayRef
	 *     Equality.Equality_1_0 returns arrayRef
	 *     Comparison returns arrayRef
	 *     Comparison.Comparison_1_0 returns arrayRef
	 *     PlusOrMinus returns arrayRef
	 *     PlusOrMinus.PlusOrMinus_1_0 returns arrayRef
	 *     MulOrDiv returns arrayRef
	 *     MulOrDiv.MulOrDiv_1_0 returns arrayRef
	 *     Module returns arrayRef
	 *     Module.Module_1_0 returns arrayRef
	 *     Primary returns arrayRef
	 *     Terminal returns arrayRef
	 *
	 * Constraint:
	 *     (varRef=[varSymbol|ID] dim+=arrayDimension+)
	 * </pre>
	 */
	protected void sequence_Terminal(ISerializationContext context, arrayRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     varExpression returns boolRef
	 *     Or returns boolRef
	 *     Or.Or_1_0 returns boolRef
	 *     And returns boolRef
	 *     And.And_1_0 returns boolRef
	 *     Equality returns boolRef
	 *     Equality.Equality_1_0 returns boolRef
	 *     Comparison returns boolRef
	 *     Comparison.Comparison_1_0 returns boolRef
	 *     PlusOrMinus returns boolRef
	 *     PlusOrMinus.PlusOrMinus_1_0 returns boolRef
	 *     MulOrDiv returns boolRef
	 *     MulOrDiv.MulOrDiv_1_0 returns boolRef
	 *     Module returns boolRef
	 *     Module.Module_1_0 returns boolRef
	 *     Primary returns boolRef
	 *     Terminal returns boolRef
	 *
	 * Constraint:
	 *     (varRef='true...' | varRef='false...')
	 * </pre>
	 */
	protected void sequence_Terminal(ISerializationContext context, boolRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     varExpression returns doubleRef
	 *     Or returns doubleRef
	 *     Or.Or_1_0 returns doubleRef
	 *     And returns doubleRef
	 *     And.And_1_0 returns doubleRef
	 *     Equality returns doubleRef
	 *     Equality.Equality_1_0 returns doubleRef
	 *     Comparison returns doubleRef
	 *     Comparison.Comparison_1_0 returns doubleRef
	 *     PlusOrMinus returns doubleRef
	 *     PlusOrMinus.PlusOrMinus_1_0 returns doubleRef
	 *     MulOrDiv returns doubleRef
	 *     MulOrDiv.MulOrDiv_1_0 returns doubleRef
	 *     Module returns doubleRef
	 *     Module.Module_1_0 returns doubleRef
	 *     Primary returns doubleRef
	 *     Terminal returns doubleRef
	 *
	 * Constraint:
	 *     value=DOUBLE
	 * </pre>
	 */
	protected void sequence_Terminal(ISerializationContext context, doubleRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VaselinaPackage.Literals.DOUBLE_REF__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VaselinaPackage.Literals.DOUBLE_REF__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTerminalAccess().getValueDOUBLEParserRuleCall_2_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     varExpression returns numRef
	 *     Or returns numRef
	 *     Or.Or_1_0 returns numRef
	 *     And returns numRef
	 *     And.And_1_0 returns numRef
	 *     Equality returns numRef
	 *     Equality.Equality_1_0 returns numRef
	 *     Comparison returns numRef
	 *     Comparison.Comparison_1_0 returns numRef
	 *     PlusOrMinus returns numRef
	 *     PlusOrMinus.PlusOrMinus_1_0 returns numRef
	 *     MulOrDiv returns numRef
	 *     MulOrDiv.MulOrDiv_1_0 returns numRef
	 *     Module returns numRef
	 *     Module.Module_1_0 returns numRef
	 *     Primary returns numRef
	 *     Terminal returns numRef
	 *
	 * Constraint:
	 *     value=NUM
	 * </pre>
	 */
	protected void sequence_Terminal(ISerializationContext context, numRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VaselinaPackage.Literals.NUM_REF__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VaselinaPackage.Literals.NUM_REF__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTerminalAccess().getValueNUMTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     varExpression returns varRef
	 *     Or returns varRef
	 *     Or.Or_1_0 returns varRef
	 *     And returns varRef
	 *     And.And_1_0 returns varRef
	 *     Equality returns varRef
	 *     Equality.Equality_1_0 returns varRef
	 *     Comparison returns varRef
	 *     Comparison.Comparison_1_0 returns varRef
	 *     PlusOrMinus returns varRef
	 *     PlusOrMinus.PlusOrMinus_1_0 returns varRef
	 *     MulOrDiv returns varRef
	 *     MulOrDiv.MulOrDiv_1_0 returns varRef
	 *     Module returns varRef
	 *     Module.Module_1_0 returns varRef
	 *     Primary returns varRef
	 *     Terminal returns varRef
	 *
	 * Constraint:
	 *     varRef=[varSymbol|ID]
	 * </pre>
	 */
	protected void sequence_Terminal(ISerializationContext context, varRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VaselinaPackage.Literals.VAR_REF__VAR_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VaselinaPackage.Literals.VAR_REF__VAR_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTerminalAccess().getVarRefVarSymbolIDTerminalRuleCall_4_1_0_1(), semanticObject.eGet(VaselinaPackage.Literals.VAR_REF__VAR_REF, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Variable returns arrayRefs
	 *
	 * Constraint:
	 *     (varRefs=[varSymbol|ID] dim+=arrayDimension+)
	 * </pre>
	 */
	protected void sequence_Variable(ISerializationContext context, arrayRefs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Variable returns varRefs
	 *
	 * Constraint:
	 *     varRefs=[varSymbol|ID]
	 * </pre>
	 */
	protected void sequence_Variable(ISerializationContext context, varRefs semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VaselinaPackage.Literals.VARIABLE__VAR_REFS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VaselinaPackage.Literals.VARIABLE__VAR_REFS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAccess().getVarRefsVarSymbolIDTerminalRuleCall_1_1_0_1(), semanticObject.eGet(VaselinaPackage.Literals.VARIABLE__VAR_REFS, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     VaselinaProgram returns VaselinaProgram
	 *
	 * Constraint:
	 *     (global+=varDeclared* func+=FuncDefinition* main=mainDeclared)
	 * </pre>
	 */
	protected void sequence_VaselinaProgram(ISerializationContext context, VaselinaProgram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     arrayDimension returns arrayDimension
	 *
	 * Constraint:
	 *     (index=[varSymbol|ID] | size=NUM)
	 * </pre>
	 */
	protected void sequence_arrayDimension(ISerializationContext context, arrayDimension semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     mainDeclared returns mainDeclared
	 *
	 * Constraint:
	 *     body+=BodyStatement*
	 * </pre>
	 */
	protected void sequence_mainDeclared(ISerializationContext context, mainDeclared semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     BodyStatement returns varAssignment
	 *     varAssignment returns varAssignment
	 *
	 * Constraint:
	 *     (variable=Variable expr=varExpression)
	 * </pre>
	 */
	protected void sequence_varAssignment(ISerializationContext context, varAssignment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VaselinaPackage.Literals.VAR_ASSIGNMENT__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VaselinaPackage.Literals.VAR_ASSIGNMENT__VARIABLE));
			if (transientValues.isValueTransient(semanticObject, VaselinaPackage.Literals.VAR_ASSIGNMENT__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VaselinaPackage.Literals.VAR_ASSIGNMENT__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVarAssignmentAccess().getVariableVariableParserRuleCall_0_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getVarAssignmentAccess().getExprVarExpressionParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     BodyStatement returns varDeclared
	 *     varDeclared returns varDeclared
	 *     varSymbol returns varDeclared
	 *
	 * Constraint:
	 *     (scope='box' (name=ID | (name=ID dim+=arrayDimension+)) type=varTypeLiteral)
	 * </pre>
	 */
	protected void sequence_varDeclared(ISerializationContext context, varDeclared semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     BodyStatement returns varReturn
	 *     varReturn returns varReturn
	 *
	 * Constraint:
	 *     rtn=varExpression
	 * </pre>
	 */
	protected void sequence_varReturn(ISerializationContext context, varReturn semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, VaselinaPackage.Literals.VAR_RETURN__RTN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VaselinaPackage.Literals.VAR_RETURN__RTN));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVarReturnAccess().getRtnVarExpressionParserRuleCall_1_0(), semanticObject.getRtn());
		feeder.finish();
	}
	
	
}
