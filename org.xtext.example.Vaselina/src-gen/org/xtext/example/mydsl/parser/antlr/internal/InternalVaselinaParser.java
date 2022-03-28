package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.VaselinaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalVaselinaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUM", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Vaselinator'", "'->'", "'<-'", "'keep'", "'numb'", "'strange'", "'bull'", "'dribble'", "'box'", "'boxes'", "':'", "'holds'", "'['", "']'", "'using'", "','", "'braze'", "'with'", "'air'", "'and'", "'vaselina'", "'display'", "'printstr'", "'strjoin'", "'strsplit'", "'anytostr'", "'getargs'", "'equals'", "'length'", "'is'", "'this'", "'true?'", "'yes'", "'no'", "'as'", "'long'", "'repeat'", "'break'", "'type'", "'keeping'", "'.'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'!'", "'true...'", "'false...'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int RULE_NUM=5;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
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


        public InternalVaselinaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVaselinaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVaselinaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVaselina.g"; }



     	private VaselinaGrammarAccess grammarAccess;

        public InternalVaselinaParser(TokenStream input, VaselinaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "VaselinaProgram";
       	}

       	@Override
       	protected VaselinaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleVaselinaProgram"
    // InternalVaselina.g:64:1: entryRuleVaselinaProgram returns [EObject current=null] : iv_ruleVaselinaProgram= ruleVaselinaProgram EOF ;
    public final EObject entryRuleVaselinaProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVaselinaProgram = null;


        try {
            // InternalVaselina.g:64:56: (iv_ruleVaselinaProgram= ruleVaselinaProgram EOF )
            // InternalVaselina.g:65:2: iv_ruleVaselinaProgram= ruleVaselinaProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVaselinaProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVaselinaProgram=ruleVaselinaProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVaselinaProgram; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVaselinaProgram"


    // $ANTLR start "ruleVaselinaProgram"
    // InternalVaselina.g:71:1: ruleVaselinaProgram returns [EObject current=null] : ( ( (lv_global_0_0= rulevarDeclared ) )* ( (lv_func_1_0= ruleFuncDefinition ) )* ( (lv_main_2_0= rulemainDeclared ) ) ) ;
    public final EObject ruleVaselinaProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_global_0_0 = null;

        EObject lv_func_1_0 = null;

        EObject lv_main_2_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:77:2: ( ( ( (lv_global_0_0= rulevarDeclared ) )* ( (lv_func_1_0= ruleFuncDefinition ) )* ( (lv_main_2_0= rulemainDeclared ) ) ) )
            // InternalVaselina.g:78:2: ( ( (lv_global_0_0= rulevarDeclared ) )* ( (lv_func_1_0= ruleFuncDefinition ) )* ( (lv_main_2_0= rulemainDeclared ) ) )
            {
            // InternalVaselina.g:78:2: ( ( (lv_global_0_0= rulevarDeclared ) )* ( (lv_func_1_0= ruleFuncDefinition ) )* ( (lv_main_2_0= rulemainDeclared ) ) )
            // InternalVaselina.g:79:3: ( (lv_global_0_0= rulevarDeclared ) )* ( (lv_func_1_0= ruleFuncDefinition ) )* ( (lv_main_2_0= rulemainDeclared ) )
            {
            // InternalVaselina.g:79:3: ( (lv_global_0_0= rulevarDeclared ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=20 && LA1_0<=21)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVaselina.g:80:4: (lv_global_0_0= rulevarDeclared )
            	    {
            	    // InternalVaselina.g:80:4: (lv_global_0_0= rulevarDeclared )
            	    // InternalVaselina.g:81:5: lv_global_0_0= rulevarDeclared
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVaselinaProgramAccess().getGlobalVarDeclaredParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_global_0_0=rulevarDeclared();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVaselinaProgramRule());
            	      					}
            	      					add(
            	      						current,
            	      						"global",
            	      						lv_global_0_0,
            	      						"org.xtext.example.mydsl.Vaselina.varDeclared");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalVaselina.g:98:3: ( (lv_func_1_0= ruleFuncDefinition ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==28) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalVaselina.g:99:4: (lv_func_1_0= ruleFuncDefinition )
            	    {
            	    // InternalVaselina.g:99:4: (lv_func_1_0= ruleFuncDefinition )
            	    // InternalVaselina.g:100:5: lv_func_1_0= ruleFuncDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getVaselinaProgramAccess().getFuncFuncDefinitionParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_func_1_0=ruleFuncDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getVaselinaProgramRule());
            	      					}
            	      					add(
            	      						current,
            	      						"func",
            	      						lv_func_1_0,
            	      						"org.xtext.example.mydsl.Vaselina.FuncDefinition");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalVaselina.g:117:3: ( (lv_main_2_0= rulemainDeclared ) )
            // InternalVaselina.g:118:4: (lv_main_2_0= rulemainDeclared )
            {
            // InternalVaselina.g:118:4: (lv_main_2_0= rulemainDeclared )
            // InternalVaselina.g:119:5: lv_main_2_0= rulemainDeclared
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVaselinaProgramAccess().getMainMainDeclaredParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_main_2_0=rulemainDeclared();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVaselinaProgramRule());
              					}
              					set(
              						current,
              						"main",
              						lv_main_2_0,
              						"org.xtext.example.mydsl.Vaselina.mainDeclared");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVaselinaProgram"


    // $ANTLR start "entryRulemainDeclared"
    // InternalVaselina.g:140:1: entryRulemainDeclared returns [EObject current=null] : iv_rulemainDeclared= rulemainDeclared EOF ;
    public final EObject entryRulemainDeclared() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemainDeclared = null;


        try {
            // InternalVaselina.g:140:53: (iv_rulemainDeclared= rulemainDeclared EOF )
            // InternalVaselina.g:141:2: iv_rulemainDeclared= rulemainDeclared EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMainDeclaredRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulemainDeclared=rulemainDeclared();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemainDeclared; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulemainDeclared"


    // $ANTLR start "rulemainDeclared"
    // InternalVaselina.g:147:1: rulemainDeclared returns [EObject current=null] : ( () otherlv_1= 'Vaselinator' otherlv_2= '->' ( (lv_body_3_0= ruleBodyStatement ) )* otherlv_4= '<-' ) ;
    public final EObject rulemainDeclared() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:153:2: ( ( () otherlv_1= 'Vaselinator' otherlv_2= '->' ( (lv_body_3_0= ruleBodyStatement ) )* otherlv_4= '<-' ) )
            // InternalVaselina.g:154:2: ( () otherlv_1= 'Vaselinator' otherlv_2= '->' ( (lv_body_3_0= ruleBodyStatement ) )* otherlv_4= '<-' )
            {
            // InternalVaselina.g:154:2: ( () otherlv_1= 'Vaselinator' otherlv_2= '->' ( (lv_body_3_0= ruleBodyStatement ) )* otherlv_4= '<-' )
            // InternalVaselina.g:155:3: () otherlv_1= 'Vaselinator' otherlv_2= '->' ( (lv_body_3_0= ruleBodyStatement ) )* otherlv_4= '<-'
            {
            // InternalVaselina.g:155:3: ()
            // InternalVaselina.g:156:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMainDeclaredAccess().getMainDeclaredAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMainDeclaredAccess().getVaselinatorKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMainDeclaredAccess().getHyphenMinusGreaterThanSignKeyword_2());
              		
            }
            // InternalVaselina.g:170:3: ( (lv_body_3_0= ruleBodyStatement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==15||(LA3_0>=20 && LA3_0<=21)||(LA3_0>=33 && LA3_0<=41)||LA3_0==46||(LA3_0>=49 && LA3_0<=50)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalVaselina.g:171:4: (lv_body_3_0= ruleBodyStatement )
            	    {
            	    // InternalVaselina.g:171:4: (lv_body_3_0= ruleBodyStatement )
            	    // InternalVaselina.g:172:5: lv_body_3_0= ruleBodyStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMainDeclaredAccess().getBodyBodyStatementParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_body_3_0=ruleBodyStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMainDeclaredRule());
            	      					}
            	      					add(
            	      						current,
            	      						"body",
            	      						lv_body_3_0,
            	      						"org.xtext.example.mydsl.Vaselina.BodyStatement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMainDeclaredAccess().getLessThanSignHyphenMinusKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulemainDeclared"


    // $ANTLR start "entryRuleBodyStatement"
    // InternalVaselina.g:197:1: entryRuleBodyStatement returns [EObject current=null] : iv_ruleBodyStatement= ruleBodyStatement EOF ;
    public final EObject entryRuleBodyStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBodyStatement = null;


        try {
            // InternalVaselina.g:197:54: (iv_ruleBodyStatement= ruleBodyStatement EOF )
            // InternalVaselina.g:198:2: iv_ruleBodyStatement= ruleBodyStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBodyStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBodyStatement=ruleBodyStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBodyStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBodyStatement"


    // $ANTLR start "ruleBodyStatement"
    // InternalVaselina.g:204:1: ruleBodyStatement returns [EObject current=null] : (this_varAssignment_0= rulevarAssignment | this_varReturn_1= rulevarReturn | this_varDeclared_2= rulevarDeclared | this_IfExpression_3= ruleIfExpression | this_DoWhileExpression_4= ruleDoWhileExpression | this_BrkStr_5= ruleBrkStr | this_AbstractMethodCall_6= ruleAbstractMethodCall | this_ReturnDeclaration_7= ruleReturnDeclaration ) ;
    public final EObject ruleBodyStatement() throws RecognitionException {
        EObject current = null;

        EObject this_varAssignment_0 = null;

        EObject this_varReturn_1 = null;

        EObject this_varDeclared_2 = null;

        EObject this_IfExpression_3 = null;

        EObject this_DoWhileExpression_4 = null;

        EObject this_BrkStr_5 = null;

        EObject this_AbstractMethodCall_6 = null;

        EObject this_ReturnDeclaration_7 = null;



        	enterRule();

        try {
            // InternalVaselina.g:210:2: ( (this_varAssignment_0= rulevarAssignment | this_varReturn_1= rulevarReturn | this_varDeclared_2= rulevarDeclared | this_IfExpression_3= ruleIfExpression | this_DoWhileExpression_4= ruleDoWhileExpression | this_BrkStr_5= ruleBrkStr | this_AbstractMethodCall_6= ruleAbstractMethodCall | this_ReturnDeclaration_7= ruleReturnDeclaration ) )
            // InternalVaselina.g:211:2: (this_varAssignment_0= rulevarAssignment | this_varReturn_1= rulevarReturn | this_varDeclared_2= rulevarDeclared | this_IfExpression_3= ruleIfExpression | this_DoWhileExpression_4= ruleDoWhileExpression | this_BrkStr_5= ruleBrkStr | this_AbstractMethodCall_6= ruleAbstractMethodCall | this_ReturnDeclaration_7= ruleReturnDeclaration )
            {
            // InternalVaselina.g:211:2: (this_varAssignment_0= rulevarAssignment | this_varReturn_1= rulevarReturn | this_varDeclared_2= rulevarDeclared | this_IfExpression_3= ruleIfExpression | this_DoWhileExpression_4= ruleDoWhileExpression | this_BrkStr_5= ruleBrkStr | this_AbstractMethodCall_6= ruleAbstractMethodCall | this_ReturnDeclaration_7= ruleReturnDeclaration )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalVaselina.g:212:3: this_varAssignment_0= rulevarAssignment
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBodyStatementAccess().getVarAssignmentParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_varAssignment_0=rulevarAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_varAssignment_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalVaselina.g:221:3: this_varReturn_1= rulevarReturn
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBodyStatementAccess().getVarReturnParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_varReturn_1=rulevarReturn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_varReturn_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalVaselina.g:230:3: this_varDeclared_2= rulevarDeclared
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBodyStatementAccess().getVarDeclaredParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_varDeclared_2=rulevarDeclared();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_varDeclared_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalVaselina.g:239:3: this_IfExpression_3= ruleIfExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBodyStatementAccess().getIfExpressionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfExpression_3=ruleIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalVaselina.g:248:3: this_DoWhileExpression_4= ruleDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBodyStatementAccess().getDoWhileExpressionParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DoWhileExpression_4=ruleDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DoWhileExpression_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalVaselina.g:257:3: this_BrkStr_5= ruleBrkStr
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBodyStatementAccess().getBrkStrParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BrkStr_5=ruleBrkStr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BrkStr_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalVaselina.g:266:3: this_AbstractMethodCall_6= ruleAbstractMethodCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBodyStatementAccess().getAbstractMethodCallParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AbstractMethodCall_6=ruleAbstractMethodCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AbstractMethodCall_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalVaselina.g:275:3: this_ReturnDeclaration_7= ruleReturnDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBodyStatementAccess().getReturnDeclarationParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ReturnDeclaration_7=ruleReturnDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReturnDeclaration_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBodyStatement"


    // $ANTLR start "entryRulevarReturn"
    // InternalVaselina.g:287:1: entryRulevarReturn returns [EObject current=null] : iv_rulevarReturn= rulevarReturn EOF ;
    public final EObject entryRulevarReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevarReturn = null;


        try {
            // InternalVaselina.g:287:50: (iv_rulevarReturn= rulevarReturn EOF )
            // InternalVaselina.g:288:2: iv_rulevarReturn= rulevarReturn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarReturnRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevarReturn=rulevarReturn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevarReturn; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulevarReturn"


    // $ANTLR start "rulevarReturn"
    // InternalVaselina.g:294:1: rulevarReturn returns [EObject current=null] : (otherlv_0= 'keep' ( (lv_rtn_1_0= rulevarExpression ) ) ) ;
    public final EObject rulevarReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_rtn_1_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:300:2: ( (otherlv_0= 'keep' ( (lv_rtn_1_0= rulevarExpression ) ) ) )
            // InternalVaselina.g:301:2: (otherlv_0= 'keep' ( (lv_rtn_1_0= rulevarExpression ) ) )
            {
            // InternalVaselina.g:301:2: (otherlv_0= 'keep' ( (lv_rtn_1_0= rulevarExpression ) ) )
            // InternalVaselina.g:302:3: otherlv_0= 'keep' ( (lv_rtn_1_0= rulevarExpression ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVarReturnAccess().getKeepKeyword_0());
              		
            }
            // InternalVaselina.g:306:3: ( (lv_rtn_1_0= rulevarExpression ) )
            // InternalVaselina.g:307:4: (lv_rtn_1_0= rulevarExpression )
            {
            // InternalVaselina.g:307:4: (lv_rtn_1_0= rulevarExpression )
            // InternalVaselina.g:308:5: lv_rtn_1_0= rulevarExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarReturnAccess().getRtnVarExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_rtn_1_0=rulevarExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarReturnRule());
              					}
              					set(
              						current,
              						"rtn",
              						lv_rtn_1_0,
              						"org.xtext.example.mydsl.Vaselina.varExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulevarReturn"


    // $ANTLR start "entryRulevarTypeLiteral"
    // InternalVaselina.g:329:1: entryRulevarTypeLiteral returns [String current=null] : iv_rulevarTypeLiteral= rulevarTypeLiteral EOF ;
    public final String entryRulevarTypeLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulevarTypeLiteral = null;


        try {
            // InternalVaselina.g:329:54: (iv_rulevarTypeLiteral= rulevarTypeLiteral EOF )
            // InternalVaselina.g:330:2: iv_rulevarTypeLiteral= rulevarTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevarTypeLiteral=rulevarTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevarTypeLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulevarTypeLiteral"


    // $ANTLR start "rulevarTypeLiteral"
    // InternalVaselina.g:336:1: rulevarTypeLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'numb' | kw= 'strange' | kw= 'bull' | kw= 'dribble' ) ;
    public final AntlrDatatypeRuleToken rulevarTypeLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVaselina.g:342:2: ( (kw= 'numb' | kw= 'strange' | kw= 'bull' | kw= 'dribble' ) )
            // InternalVaselina.g:343:2: (kw= 'numb' | kw= 'strange' | kw= 'bull' | kw= 'dribble' )
            {
            // InternalVaselina.g:343:2: (kw= 'numb' | kw= 'strange' | kw= 'bull' | kw= 'dribble' )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            case 19:
                {
                alt5=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalVaselina.g:344:3: kw= 'numb'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getVarTypeLiteralAccess().getNumbKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalVaselina.g:350:3: kw= 'strange'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getVarTypeLiteralAccess().getStrangeKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalVaselina.g:356:3: kw= 'bull'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getVarTypeLiteralAccess().getBullKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalVaselina.g:362:3: kw= 'dribble'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getVarTypeLiteralAccess().getDribbleKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulevarTypeLiteral"


    // $ANTLR start "entryRulevarDeclared"
    // InternalVaselina.g:371:1: entryRulevarDeclared returns [EObject current=null] : iv_rulevarDeclared= rulevarDeclared EOF ;
    public final EObject entryRulevarDeclared() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevarDeclared = null;


        try {
            // InternalVaselina.g:371:52: (iv_rulevarDeclared= rulevarDeclared EOF )
            // InternalVaselina.g:372:2: iv_rulevarDeclared= rulevarDeclared EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarDeclaredRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevarDeclared=rulevarDeclared();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevarDeclared; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulevarDeclared"


    // $ANTLR start "rulevarDeclared"
    // InternalVaselina.g:378:1: rulevarDeclared returns [EObject current=null] : ( () ( ( ( (lv_scope_1_0= 'box' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_scope_3_0= 'boxes' ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_dim_5_0= rulearrayDimension ) )+ ) ) otherlv_6= ':' ( (lv_type_7_0= rulevarTypeLiteral ) ) ) ;
    public final EObject rulevarDeclared() throws RecognitionException {
        EObject current = null;

        Token lv_scope_1_0=null;
        Token lv_name_2_0=null;
        Token lv_scope_3_0=null;
        Token lv_name_4_0=null;
        Token otherlv_6=null;
        EObject lv_dim_5_0 = null;

        AntlrDatatypeRuleToken lv_type_7_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:384:2: ( ( () ( ( ( (lv_scope_1_0= 'box' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_scope_3_0= 'boxes' ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_dim_5_0= rulearrayDimension ) )+ ) ) otherlv_6= ':' ( (lv_type_7_0= rulevarTypeLiteral ) ) ) )
            // InternalVaselina.g:385:2: ( () ( ( ( (lv_scope_1_0= 'box' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_scope_3_0= 'boxes' ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_dim_5_0= rulearrayDimension ) )+ ) ) otherlv_6= ':' ( (lv_type_7_0= rulevarTypeLiteral ) ) )
            {
            // InternalVaselina.g:385:2: ( () ( ( ( (lv_scope_1_0= 'box' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_scope_3_0= 'boxes' ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_dim_5_0= rulearrayDimension ) )+ ) ) otherlv_6= ':' ( (lv_type_7_0= rulevarTypeLiteral ) ) )
            // InternalVaselina.g:386:3: () ( ( ( (lv_scope_1_0= 'box' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_scope_3_0= 'boxes' ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_dim_5_0= rulearrayDimension ) )+ ) ) otherlv_6= ':' ( (lv_type_7_0= rulevarTypeLiteral ) )
            {
            // InternalVaselina.g:386:3: ()
            // InternalVaselina.g:387:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVarDeclaredAccess().getVarDeclaredAction_0(),
              					current);
              			
            }

            }

            // InternalVaselina.g:393:3: ( ( ( (lv_scope_1_0= 'box' ) ) ( (lv_name_2_0= RULE_ID ) ) ) | ( ( (lv_scope_3_0= 'boxes' ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_dim_5_0= rulearrayDimension ) )+ ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalVaselina.g:394:4: ( ( (lv_scope_1_0= 'box' ) ) ( (lv_name_2_0= RULE_ID ) ) )
                    {
                    // InternalVaselina.g:394:4: ( ( (lv_scope_1_0= 'box' ) ) ( (lv_name_2_0= RULE_ID ) ) )
                    // InternalVaselina.g:395:5: ( (lv_scope_1_0= 'box' ) ) ( (lv_name_2_0= RULE_ID ) )
                    {
                    // InternalVaselina.g:395:5: ( (lv_scope_1_0= 'box' ) )
                    // InternalVaselina.g:396:6: (lv_scope_1_0= 'box' )
                    {
                    // InternalVaselina.g:396:6: (lv_scope_1_0= 'box' )
                    // InternalVaselina.g:397:7: lv_scope_1_0= 'box'
                    {
                    lv_scope_1_0=(Token)match(input,20,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_scope_1_0, grammarAccess.getVarDeclaredAccess().getScopeBoxKeyword_1_0_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getVarDeclaredRule());
                      							}
                      							setWithLastConsumed(current, "scope", lv_scope_1_0, "box");
                      						
                    }

                    }


                    }

                    // InternalVaselina.g:409:5: ( (lv_name_2_0= RULE_ID ) )
                    // InternalVaselina.g:410:6: (lv_name_2_0= RULE_ID )
                    {
                    // InternalVaselina.g:410:6: (lv_name_2_0= RULE_ID )
                    // InternalVaselina.g:411:7: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_name_2_0, grammarAccess.getVarDeclaredAccess().getNameIDTerminalRuleCall_1_0_1_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getVarDeclaredRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"name",
                      								lv_name_2_0,
                      								"org.eclipse.xtext.common.Terminals.ID");
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVaselina.g:429:4: ( ( (lv_scope_3_0= 'boxes' ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_dim_5_0= rulearrayDimension ) )+ )
                    {
                    // InternalVaselina.g:429:4: ( ( (lv_scope_3_0= 'boxes' ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_dim_5_0= rulearrayDimension ) )+ )
                    // InternalVaselina.g:430:5: ( (lv_scope_3_0= 'boxes' ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_dim_5_0= rulearrayDimension ) )+
                    {
                    // InternalVaselina.g:430:5: ( (lv_scope_3_0= 'boxes' ) )
                    // InternalVaselina.g:431:6: (lv_scope_3_0= 'boxes' )
                    {
                    // InternalVaselina.g:431:6: (lv_scope_3_0= 'boxes' )
                    // InternalVaselina.g:432:7: lv_scope_3_0= 'boxes'
                    {
                    lv_scope_3_0=(Token)match(input,21,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_scope_3_0, grammarAccess.getVarDeclaredAccess().getScopeBoxesKeyword_1_1_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getVarDeclaredRule());
                      							}
                      							setWithLastConsumed(current, "scope", lv_scope_3_0, "boxes");
                      						
                    }

                    }


                    }

                    // InternalVaselina.g:444:5: ( (lv_name_4_0= RULE_ID ) )
                    // InternalVaselina.g:445:6: (lv_name_4_0= RULE_ID )
                    {
                    // InternalVaselina.g:445:6: (lv_name_4_0= RULE_ID )
                    // InternalVaselina.g:446:7: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_name_4_0, grammarAccess.getVarDeclaredAccess().getNameIDTerminalRuleCall_1_1_1_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getVarDeclaredRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"name",
                      								lv_name_4_0,
                      								"org.eclipse.xtext.common.Terminals.ID");
                      						
                    }

                    }


                    }

                    // InternalVaselina.g:462:5: ( (lv_dim_5_0= rulearrayDimension ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==24) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalVaselina.g:463:6: (lv_dim_5_0= rulearrayDimension )
                    	    {
                    	    // InternalVaselina.g:463:6: (lv_dim_5_0= rulearrayDimension )
                    	    // InternalVaselina.g:464:7: lv_dim_5_0= rulearrayDimension
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getVarDeclaredAccess().getDimArrayDimensionParserRuleCall_1_1_2_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_11);
                    	    lv_dim_5_0=rulearrayDimension();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getVarDeclaredRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"dim",
                    	      								lv_dim_5_0,
                    	      								"org.xtext.example.mydsl.Vaselina.arrayDimension");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getVarDeclaredAccess().getColonKeyword_2());
              		
            }
            // InternalVaselina.g:487:3: ( (lv_type_7_0= rulevarTypeLiteral ) )
            // InternalVaselina.g:488:4: (lv_type_7_0= rulevarTypeLiteral )
            {
            // InternalVaselina.g:488:4: (lv_type_7_0= rulevarTypeLiteral )
            // InternalVaselina.g:489:5: lv_type_7_0= rulevarTypeLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarDeclaredAccess().getTypeVarTypeLiteralParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_7_0=rulevarTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarDeclaredRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_7_0,
              						"org.xtext.example.mydsl.Vaselina.varTypeLiteral");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulevarDeclared"


    // $ANTLR start "entryRulevarAssignment"
    // InternalVaselina.g:510:1: entryRulevarAssignment returns [EObject current=null] : iv_rulevarAssignment= rulevarAssignment EOF ;
    public final EObject entryRulevarAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevarAssignment = null;


        try {
            // InternalVaselina.g:510:54: (iv_rulevarAssignment= rulevarAssignment EOF )
            // InternalVaselina.g:511:2: iv_rulevarAssignment= rulevarAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevarAssignment=rulevarAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevarAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulevarAssignment"


    // $ANTLR start "rulevarAssignment"
    // InternalVaselina.g:517:1: rulevarAssignment returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= 'holds' ( (lv_expr_2_0= rulevarExpression ) ) ) ;
    public final EObject rulevarAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:523:2: ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= 'holds' ( (lv_expr_2_0= rulevarExpression ) ) ) )
            // InternalVaselina.g:524:2: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= 'holds' ( (lv_expr_2_0= rulevarExpression ) ) )
            {
            // InternalVaselina.g:524:2: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= 'holds' ( (lv_expr_2_0= rulevarExpression ) ) )
            // InternalVaselina.g:525:3: ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= 'holds' ( (lv_expr_2_0= rulevarExpression ) )
            {
            // InternalVaselina.g:525:3: ( (lv_variable_0_0= ruleVariable ) )
            // InternalVaselina.g:526:4: (lv_variable_0_0= ruleVariable )
            {
            // InternalVaselina.g:526:4: (lv_variable_0_0= ruleVariable )
            // InternalVaselina.g:527:5: lv_variable_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarAssignmentAccess().getVariableVariableParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_variable_0_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarAssignmentRule());
              					}
              					set(
              						current,
              						"variable",
              						lv_variable_0_0,
              						"org.xtext.example.mydsl.Vaselina.Variable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVarAssignmentAccess().getHoldsKeyword_1());
              		
            }
            // InternalVaselina.g:548:3: ( (lv_expr_2_0= rulevarExpression ) )
            // InternalVaselina.g:549:4: (lv_expr_2_0= rulevarExpression )
            {
            // InternalVaselina.g:549:4: (lv_expr_2_0= rulevarExpression )
            // InternalVaselina.g:550:5: lv_expr_2_0= rulevarExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarAssignmentAccess().getExprVarExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expr_2_0=rulevarExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarAssignmentRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_2_0,
              						"org.xtext.example.mydsl.Vaselina.varExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulevarAssignment"


    // $ANTLR start "entryRuleVariable"
    // InternalVaselina.g:571:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalVaselina.g:571:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalVaselina.g:572:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalVaselina.g:578:1: ruleVariable returns [EObject current=null] : (this_arrayRefs_0= rulearrayRefs | this_varRefs_1= rulevarRefs ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_arrayRefs_0 = null;

        EObject this_varRefs_1 = null;



        	enterRule();

        try {
            // InternalVaselina.g:584:2: ( (this_arrayRefs_0= rulearrayRefs | this_varRefs_1= rulevarRefs ) )
            // InternalVaselina.g:585:2: (this_arrayRefs_0= rulearrayRefs | this_varRefs_1= rulevarRefs )
            {
            // InternalVaselina.g:585:2: (this_arrayRefs_0= rulearrayRefs | this_varRefs_1= rulevarRefs )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==24) ) {
                    alt8=1;
                }
                else if ( (LA8_1==EOF||LA8_1==23) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalVaselina.g:586:3: this_arrayRefs_0= rulearrayRefs
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVariableAccess().getArrayRefsParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_arrayRefs_0=rulearrayRefs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_arrayRefs_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalVaselina.g:595:3: this_varRefs_1= rulevarRefs
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getVariableAccess().getVarRefsParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_varRefs_1=rulevarRefs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_varRefs_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRulearrayRefs"
    // InternalVaselina.g:607:1: entryRulearrayRefs returns [EObject current=null] : iv_rulearrayRefs= rulearrayRefs EOF ;
    public final EObject entryRulearrayRefs() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearrayRefs = null;


        try {
            // InternalVaselina.g:607:50: (iv_rulearrayRefs= rulearrayRefs EOF )
            // InternalVaselina.g:608:2: iv_rulearrayRefs= rulearrayRefs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayRefsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulearrayRefs=rulearrayRefs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulearrayRefs; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulearrayRefs"


    // $ANTLR start "rulearrayRefs"
    // InternalVaselina.g:614:1: rulearrayRefs returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ( (lv_dims_2_0= rulearrayDimension ) )+ ) ;
    public final EObject rulearrayRefs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_dims_2_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:620:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( (lv_dims_2_0= rulearrayDimension ) )+ ) )
            // InternalVaselina.g:621:2: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_dims_2_0= rulearrayDimension ) )+ )
            {
            // InternalVaselina.g:621:2: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_dims_2_0= rulearrayDimension ) )+ )
            // InternalVaselina.g:622:3: () ( (otherlv_1= RULE_ID ) ) ( (lv_dims_2_0= rulearrayDimension ) )+
            {
            // InternalVaselina.g:622:3: ()
            // InternalVaselina.g:623:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayRefsAccess().getArrayRefsAction_0(),
              					current);
              			
            }

            }

            // InternalVaselina.g:629:3: ( (otherlv_1= RULE_ID ) )
            // InternalVaselina.g:630:4: (otherlv_1= RULE_ID )
            {
            // InternalVaselina.g:630:4: (otherlv_1= RULE_ID )
            // InternalVaselina.g:631:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getArrayRefsRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getArrayRefsAccess().getArrRefsVarSymbolCrossReference_1_0());
              				
            }

            }


            }

            // InternalVaselina.g:642:3: ( (lv_dims_2_0= rulearrayDimension ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalVaselina.g:643:4: (lv_dims_2_0= rulearrayDimension )
            	    {
            	    // InternalVaselina.g:643:4: (lv_dims_2_0= rulearrayDimension )
            	    // InternalVaselina.g:644:5: lv_dims_2_0= rulearrayDimension
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getArrayRefsAccess().getDimsArrayDimensionParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_dims_2_0=rulearrayDimension();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getArrayRefsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"dims",
            	      						lv_dims_2_0,
            	      						"org.xtext.example.mydsl.Vaselina.arrayDimension");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulearrayRefs"


    // $ANTLR start "entryRulevarRefs"
    // InternalVaselina.g:665:1: entryRulevarRefs returns [EObject current=null] : iv_rulevarRefs= rulevarRefs EOF ;
    public final EObject entryRulevarRefs() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevarRefs = null;


        try {
            // InternalVaselina.g:665:48: (iv_rulevarRefs= rulevarRefs EOF )
            // InternalVaselina.g:666:2: iv_rulevarRefs= rulevarRefs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarRefsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevarRefs=rulevarRefs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevarRefs; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulevarRefs"


    // $ANTLR start "rulevarRefs"
    // InternalVaselina.g:672:1: rulevarRefs returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject rulevarRefs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVaselina.g:678:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalVaselina.g:679:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalVaselina.g:679:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalVaselina.g:680:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalVaselina.g:680:3: ()
            // InternalVaselina.g:681:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVarRefsAccess().getVarRefsAction_0(),
              					current);
              			
            }

            }

            // InternalVaselina.g:687:3: ( (otherlv_1= RULE_ID ) )
            // InternalVaselina.g:688:4: (otherlv_1= RULE_ID )
            {
            // InternalVaselina.g:688:4: (otherlv_1= RULE_ID )
            // InternalVaselina.g:689:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVarRefsRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getVarRefsAccess().getVaRefsVarSymbolCrossReference_1_0());
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulevarRefs"


    // $ANTLR start "entryRulearrayDimension"
    // InternalVaselina.g:704:1: entryRulearrayDimension returns [EObject current=null] : iv_rulearrayDimension= rulearrayDimension EOF ;
    public final EObject entryRulearrayDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearrayDimension = null;


        try {
            // InternalVaselina.g:704:55: (iv_rulearrayDimension= rulearrayDimension EOF )
            // InternalVaselina.g:705:2: iv_rulearrayDimension= rulearrayDimension EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayDimensionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulearrayDimension=rulearrayDimension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulearrayDimension; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulearrayDimension"


    // $ANTLR start "rulearrayDimension"
    // InternalVaselina.g:711:1: rulearrayDimension returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_index_2_0= ruleTerminal ) ) otherlv_3= ']' ) ;
    public final EObject rulearrayDimension() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_index_2_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:717:2: ( ( () otherlv_1= '[' ( (lv_index_2_0= ruleTerminal ) ) otherlv_3= ']' ) )
            // InternalVaselina.g:718:2: ( () otherlv_1= '[' ( (lv_index_2_0= ruleTerminal ) ) otherlv_3= ']' )
            {
            // InternalVaselina.g:718:2: ( () otherlv_1= '[' ( (lv_index_2_0= ruleTerminal ) ) otherlv_3= ']' )
            // InternalVaselina.g:719:3: () otherlv_1= '[' ( (lv_index_2_0= ruleTerminal ) ) otherlv_3= ']'
            {
            // InternalVaselina.g:719:3: ()
            // InternalVaselina.g:720:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayDimensionAccess().getArrayDimensionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,24,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArrayDimensionAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalVaselina.g:730:3: ( (lv_index_2_0= ruleTerminal ) )
            // InternalVaselina.g:731:4: (lv_index_2_0= ruleTerminal )
            {
            // InternalVaselina.g:731:4: (lv_index_2_0= ruleTerminal )
            // InternalVaselina.g:732:5: lv_index_2_0= ruleTerminal
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArrayDimensionAccess().getIndexTerminalParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_index_2_0=ruleTerminal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArrayDimensionRule());
              					}
              					set(
              						current,
              						"index",
              						lv_index_2_0,
              						"org.xtext.example.mydsl.Vaselina.Terminal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getArrayDimensionAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulearrayDimension"


    // $ANTLR start "entryRuleFuncCall"
    // InternalVaselina.g:757:1: entryRuleFuncCall returns [EObject current=null] : iv_ruleFuncCall= ruleFuncCall EOF ;
    public final EObject entryRuleFuncCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncCall = null;


        try {
            // InternalVaselina.g:757:49: (iv_ruleFuncCall= ruleFuncCall EOF )
            // InternalVaselina.g:758:2: iv_ruleFuncCall= ruleFuncCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFuncCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFuncCall=ruleFuncCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFuncCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFuncCall"


    // $ANTLR start "ruleFuncCall"
    // InternalVaselina.g:764:1: ruleFuncCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'using' otherlv_3= ':' ( ( (lv_args_4_0= rulevarExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )* )? otherlv_7= ':' ) ;
    public final EObject ruleFuncCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_args_4_0 = null;

        EObject lv_args_6_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:770:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'using' otherlv_3= ':' ( ( (lv_args_4_0= rulevarExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )* )? otherlv_7= ':' ) )
            // InternalVaselina.g:771:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'using' otherlv_3= ':' ( ( (lv_args_4_0= rulevarExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )* )? otherlv_7= ':' )
            {
            // InternalVaselina.g:771:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'using' otherlv_3= ':' ( ( (lv_args_4_0= rulevarExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )* )? otherlv_7= ':' )
            // InternalVaselina.g:772:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'using' otherlv_3= ':' ( ( (lv_args_4_0= rulevarExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )* )? otherlv_7= ':'
            {
            // InternalVaselina.g:772:3: ()
            // InternalVaselina.g:773:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFuncCallAccess().getFuncCallAction_0(),
              					current);
              			
            }

            }

            // InternalVaselina.g:779:3: ( (otherlv_1= RULE_ID ) )
            // InternalVaselina.g:780:4: (otherlv_1= RULE_ID )
            {
            // InternalVaselina.g:780:4: (otherlv_1= RULE_ID )
            // InternalVaselina.g:781:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFuncCallRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getFuncCallAccess().getFuncFuncDefinitionCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFuncCallAccess().getUsingKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getFuncCallAccess().getColonKeyword_3());
              		
            }
            // InternalVaselina.g:800:3: ( ( (lv_args_4_0= rulevarExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_NUM)||LA11_0==RULE_STRING||(LA11_0>=33 && LA11_0<=40)||LA11_0==66||(LA11_0>=68 && LA11_0<=70)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalVaselina.g:801:4: ( (lv_args_4_0= rulevarExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )*
                    {
                    // InternalVaselina.g:801:4: ( (lv_args_4_0= rulevarExpression ) )
                    // InternalVaselina.g:802:5: (lv_args_4_0= rulevarExpression )
                    {
                    // InternalVaselina.g:802:5: (lv_args_4_0= rulevarExpression )
                    // InternalVaselina.g:803:6: lv_args_4_0= rulevarExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFuncCallAccess().getArgsVarExpressionParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_args_4_0=rulevarExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFuncCallRule());
                      						}
                      						add(
                      							current,
                      							"args",
                      							lv_args_4_0,
                      							"org.xtext.example.mydsl.Vaselina.varExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalVaselina.g:820:4: (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==27) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalVaselina.g:821:5: otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,27,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getFuncCallAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalVaselina.g:825:5: ( (lv_args_6_0= rulevarExpression ) )
                    	    // InternalVaselina.g:826:6: (lv_args_6_0= rulevarExpression )
                    	    {
                    	    // InternalVaselina.g:826:6: (lv_args_6_0= rulevarExpression )
                    	    // InternalVaselina.g:827:7: lv_args_6_0= rulevarExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFuncCallAccess().getArgsVarExpressionParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    lv_args_6_0=rulevarExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFuncCallRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"args",
                    	      								lv_args_6_0,
                    	      								"org.xtext.example.mydsl.Vaselina.varExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getFuncCallAccess().getColonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFuncCall"


    // $ANTLR start "entryRuleFuncParameter"
    // InternalVaselina.g:854:1: entryRuleFuncParameter returns [EObject current=null] : iv_ruleFuncParameter= ruleFuncParameter EOF ;
    public final EObject entryRuleFuncParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncParameter = null;


        try {
            // InternalVaselina.g:854:54: (iv_ruleFuncParameter= ruleFuncParameter EOF )
            // InternalVaselina.g:855:2: iv_ruleFuncParameter= ruleFuncParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFuncParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFuncParameter=ruleFuncParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFuncParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFuncParameter"


    // $ANTLR start "ruleFuncParameter"
    // InternalVaselina.g:861:1: ruleFuncParameter returns [EObject current=null] : this_FuncTypedDeclaration_0= ruleFuncTypedDeclaration[$current] ;
    public final EObject ruleFuncParameter() throws RecognitionException {
        EObject current = null;

        EObject this_FuncTypedDeclaration_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:867:2: (this_FuncTypedDeclaration_0= ruleFuncTypedDeclaration[$current] )
            // InternalVaselina.g:868:2: this_FuncTypedDeclaration_0= ruleFuncTypedDeclaration[$current]
            {
            if ( state.backtracking==0 ) {

              		if (current==null) {
              			current = createModelElement(grammarAccess.getFuncParameterRule());
              		}
              		newCompositeNode(grammarAccess.getFuncParameterAccess().getFuncTypedDeclarationParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_FuncTypedDeclaration_0=ruleFuncTypedDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_FuncTypedDeclaration_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFuncParameter"


    // $ANTLR start "entryRuleFuncDefinition"
    // InternalVaselina.g:882:1: entryRuleFuncDefinition returns [EObject current=null] : iv_ruleFuncDefinition= ruleFuncDefinition EOF ;
    public final EObject entryRuleFuncDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncDefinition = null;


        try {
            // InternalVaselina.g:882:55: (iv_ruleFuncDefinition= ruleFuncDefinition EOF )
            // InternalVaselina.g:883:2: iv_ruleFuncDefinition= ruleFuncDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFuncDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFuncDefinition=ruleFuncDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFuncDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFuncDefinition"


    // $ANTLR start "ruleFuncDefinition"
    // InternalVaselina.g:889:1: ruleFuncDefinition returns [EObject current=null] : (otherlv_0= 'braze' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' ( ( ( (lv_args_3_0= ruleFuncParameter ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFuncParameter ) ) )* ) | otherlv_6= 'air' ) otherlv_7= '->' ( (lv_body_8_0= ruleBodyStatement ) )* otherlv_9= 'and' otherlv_10= 'vaselina' ) ;
    public final EObject ruleFuncDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_args_3_0 = null;

        EObject lv_args_5_0 = null;

        EObject lv_body_8_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:895:2: ( (otherlv_0= 'braze' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' ( ( ( (lv_args_3_0= ruleFuncParameter ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFuncParameter ) ) )* ) | otherlv_6= 'air' ) otherlv_7= '->' ( (lv_body_8_0= ruleBodyStatement ) )* otherlv_9= 'and' otherlv_10= 'vaselina' ) )
            // InternalVaselina.g:896:2: (otherlv_0= 'braze' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' ( ( ( (lv_args_3_0= ruleFuncParameter ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFuncParameter ) ) )* ) | otherlv_6= 'air' ) otherlv_7= '->' ( (lv_body_8_0= ruleBodyStatement ) )* otherlv_9= 'and' otherlv_10= 'vaselina' )
            {
            // InternalVaselina.g:896:2: (otherlv_0= 'braze' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' ( ( ( (lv_args_3_0= ruleFuncParameter ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFuncParameter ) ) )* ) | otherlv_6= 'air' ) otherlv_7= '->' ( (lv_body_8_0= ruleBodyStatement ) )* otherlv_9= 'and' otherlv_10= 'vaselina' )
            // InternalVaselina.g:897:3: otherlv_0= 'braze' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' ( ( ( (lv_args_3_0= ruleFuncParameter ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFuncParameter ) ) )* ) | otherlv_6= 'air' ) otherlv_7= '->' ( (lv_body_8_0= ruleBodyStatement ) )* otherlv_9= 'and' otherlv_10= 'vaselina'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFuncDefinitionAccess().getBrazeKeyword_0());
              		
            }
            // InternalVaselina.g:901:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVaselina.g:902:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVaselina.g:902:4: (lv_name_1_0= RULE_ID )
            // InternalVaselina.g:903:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getFuncDefinitionAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFuncDefinitionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFuncDefinitionAccess().getWithKeyword_2());
              		
            }
            // InternalVaselina.g:923:3: ( ( ( (lv_args_3_0= ruleFuncParameter ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFuncParameter ) ) )* ) | otherlv_6= 'air' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=16 && LA13_0<=19)) ) {
                alt13=1;
            }
            else if ( (LA13_0==30) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalVaselina.g:924:4: ( ( (lv_args_3_0= ruleFuncParameter ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFuncParameter ) ) )* )
                    {
                    // InternalVaselina.g:924:4: ( ( (lv_args_3_0= ruleFuncParameter ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFuncParameter ) ) )* )
                    // InternalVaselina.g:925:5: ( (lv_args_3_0= ruleFuncParameter ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFuncParameter ) ) )*
                    {
                    // InternalVaselina.g:925:5: ( (lv_args_3_0= ruleFuncParameter ) )
                    // InternalVaselina.g:926:6: (lv_args_3_0= ruleFuncParameter )
                    {
                    // InternalVaselina.g:926:6: (lv_args_3_0= ruleFuncParameter )
                    // InternalVaselina.g:927:7: lv_args_3_0= ruleFuncParameter
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getFuncDefinitionAccess().getArgsFuncParameterParserRuleCall_3_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_21);
                    lv_args_3_0=ruleFuncParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getFuncDefinitionRule());
                      							}
                      							add(
                      								current,
                      								"args",
                      								lv_args_3_0,
                      								"org.xtext.example.mydsl.Vaselina.FuncParameter");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalVaselina.g:944:5: (otherlv_4= ',' ( (lv_args_5_0= ruleFuncParameter ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==27) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalVaselina.g:945:6: otherlv_4= ',' ( (lv_args_5_0= ruleFuncParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,27,FOLLOW_12); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getFuncDefinitionAccess().getCommaKeyword_3_0_1_0());
                    	      					
                    	    }
                    	    // InternalVaselina.g:949:6: ( (lv_args_5_0= ruleFuncParameter ) )
                    	    // InternalVaselina.g:950:7: (lv_args_5_0= ruleFuncParameter )
                    	    {
                    	    // InternalVaselina.g:950:7: (lv_args_5_0= ruleFuncParameter )
                    	    // InternalVaselina.g:951:8: lv_args_5_0= ruleFuncParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getFuncDefinitionAccess().getArgsFuncParameterParserRuleCall_3_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_21);
                    	    lv_args_5_0=ruleFuncParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getFuncDefinitionRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"args",
                    	      									lv_args_5_0,
                    	      									"org.xtext.example.mydsl.Vaselina.FuncParameter");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

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
                    break;
                case 2 :
                    // InternalVaselina.g:971:4: otherlv_6= 'air'
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getFuncDefinitionAccess().getAirKeyword_3_1());
                      			
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getFuncDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_4());
              		
            }
            // InternalVaselina.g:980:3: ( (lv_body_8_0= ruleBodyStatement ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==15||(LA14_0>=20 && LA14_0<=21)||(LA14_0>=33 && LA14_0<=41)||LA14_0==46||(LA14_0>=49 && LA14_0<=50)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalVaselina.g:981:4: (lv_body_8_0= ruleBodyStatement )
            	    {
            	    // InternalVaselina.g:981:4: (lv_body_8_0= ruleBodyStatement )
            	    // InternalVaselina.g:982:5: lv_body_8_0= ruleBodyStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFuncDefinitionAccess().getBodyBodyStatementParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_body_8_0=ruleBodyStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getFuncDefinitionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"body",
            	      						lv_body_8_0,
            	      						"org.xtext.example.mydsl.Vaselina.BodyStatement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_9=(Token)match(input,31,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getFuncDefinitionAccess().getAndKeyword_6());
              		
            }
            otherlv_10=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getFuncDefinitionAccess().getVaselinaKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFuncDefinition"


    // $ANTLR start "ruleFuncTypedDeclaration"
    // InternalVaselina.g:1012:1: ruleFuncTypedDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_type_0_0= rulevarTypeLiteral ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFuncTypedDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:1018:2: ( ( ( (lv_type_0_0= rulevarTypeLiteral ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalVaselina.g:1019:2: ( ( (lv_type_0_0= rulevarTypeLiteral ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalVaselina.g:1019:2: ( ( (lv_type_0_0= rulevarTypeLiteral ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalVaselina.g:1020:3: ( (lv_type_0_0= rulevarTypeLiteral ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalVaselina.g:1020:3: ( (lv_type_0_0= rulevarTypeLiteral ) )
            // InternalVaselina.g:1021:4: (lv_type_0_0= rulevarTypeLiteral )
            {
            // InternalVaselina.g:1021:4: (lv_type_0_0= rulevarTypeLiteral )
            // InternalVaselina.g:1022:5: lv_type_0_0= rulevarTypeLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFuncTypedDeclarationAccess().getTypeVarTypeLiteralParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_type_0_0=rulevarTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFuncTypedDeclarationRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_0_0,
              						"org.xtext.example.mydsl.Vaselina.varTypeLiteral");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalVaselina.g:1039:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVaselina.g:1040:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVaselina.g:1040:4: (lv_name_1_0= RULE_ID )
            // InternalVaselina.g:1041:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getFuncTypedDeclarationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFuncTypedDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFuncTypedDeclaration"


    // $ANTLR start "entryRuleAbstractMethodCall"
    // InternalVaselina.g:1061:1: entryRuleAbstractMethodCall returns [EObject current=null] : iv_ruleAbstractMethodCall= ruleAbstractMethodCall EOF ;
    public final EObject entryRuleAbstractMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMethodCall = null;


        try {
            // InternalVaselina.g:1061:59: (iv_ruleAbstractMethodCall= ruleAbstractMethodCall EOF )
            // InternalVaselina.g:1062:2: iv_ruleAbstractMethodCall= ruleAbstractMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractMethodCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAbstractMethodCall=ruleAbstractMethodCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractMethodCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAbstractMethodCall"


    // $ANTLR start "ruleAbstractMethodCall"
    // InternalVaselina.g:1068:1: ruleAbstractMethodCall returns [EObject current=null] : (this_FuncCall_0= ruleFuncCall | this_StdFunction_1= ruleStdFunction ) ;
    public final EObject ruleAbstractMethodCall() throws RecognitionException {
        EObject current = null;

        EObject this_FuncCall_0 = null;

        EObject this_StdFunction_1 = null;



        	enterRule();

        try {
            // InternalVaselina.g:1074:2: ( (this_FuncCall_0= ruleFuncCall | this_StdFunction_1= ruleStdFunction ) )
            // InternalVaselina.g:1075:2: (this_FuncCall_0= ruleFuncCall | this_StdFunction_1= ruleStdFunction )
            {
            // InternalVaselina.g:1075:2: (this_FuncCall_0= ruleFuncCall | this_StdFunction_1= ruleStdFunction )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=33 && LA15_0<=40)) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalVaselina.g:1076:3: this_FuncCall_0= ruleFuncCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractMethodCallAccess().getFuncCallParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FuncCall_0=ruleFuncCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FuncCall_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalVaselina.g:1085:3: this_StdFunction_1= ruleStdFunction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractMethodCallAccess().getStdFunctionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StdFunction_1=ruleStdFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StdFunction_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAbstractMethodCall"


    // $ANTLR start "entryRuleStdfunctionList"
    // InternalVaselina.g:1097:1: entryRuleStdfunctionList returns [String current=null] : iv_ruleStdfunctionList= ruleStdfunctionList EOF ;
    public final String entryRuleStdfunctionList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStdfunctionList = null;


        try {
            // InternalVaselina.g:1097:55: (iv_ruleStdfunctionList= ruleStdfunctionList EOF )
            // InternalVaselina.g:1098:2: iv_ruleStdfunctionList= ruleStdfunctionList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStdfunctionListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStdfunctionList=ruleStdfunctionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStdfunctionList.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStdfunctionList"


    // $ANTLR start "ruleStdfunctionList"
    // InternalVaselina.g:1104:1: ruleStdfunctionList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'display' | kw= 'printstr' | kw= 'strjoin' | kw= 'strsplit' | kw= 'anytostr' | kw= 'getargs' | kw= 'equals' | kw= 'length' ) ;
    public final AntlrDatatypeRuleToken ruleStdfunctionList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVaselina.g:1110:2: ( (kw= 'display' | kw= 'printstr' | kw= 'strjoin' | kw= 'strsplit' | kw= 'anytostr' | kw= 'getargs' | kw= 'equals' | kw= 'length' ) )
            // InternalVaselina.g:1111:2: (kw= 'display' | kw= 'printstr' | kw= 'strjoin' | kw= 'strsplit' | kw= 'anytostr' | kw= 'getargs' | kw= 'equals' | kw= 'length' )
            {
            // InternalVaselina.g:1111:2: (kw= 'display' | kw= 'printstr' | kw= 'strjoin' | kw= 'strsplit' | kw= 'anytostr' | kw= 'getargs' | kw= 'equals' | kw= 'length' )
            int alt16=8;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt16=1;
                }
                break;
            case 34:
                {
                alt16=2;
                }
                break;
            case 35:
                {
                alt16=3;
                }
                break;
            case 36:
                {
                alt16=4;
                }
                break;
            case 37:
                {
                alt16=5;
                }
                break;
            case 38:
                {
                alt16=6;
                }
                break;
            case 39:
                {
                alt16=7;
                }
                break;
            case 40:
                {
                alt16=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalVaselina.g:1112:3: kw= 'display'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getStdfunctionListAccess().getDisplayKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalVaselina.g:1118:3: kw= 'printstr'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getStdfunctionListAccess().getPrintstrKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalVaselina.g:1124:3: kw= 'strjoin'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getStdfunctionListAccess().getStrjoinKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalVaselina.g:1130:3: kw= 'strsplit'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getStdfunctionListAccess().getStrsplitKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalVaselina.g:1136:3: kw= 'anytostr'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getStdfunctionListAccess().getAnytostrKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalVaselina.g:1142:3: kw= 'getargs'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getStdfunctionListAccess().getGetargsKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalVaselina.g:1148:3: kw= 'equals'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getStdfunctionListAccess().getEqualsKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalVaselina.g:1154:3: kw= 'length'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getStdfunctionListAccess().getLengthKeyword_7());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStdfunctionList"


    // $ANTLR start "entryRuleStdFunction"
    // InternalVaselina.g:1163:1: entryRuleStdFunction returns [EObject current=null] : iv_ruleStdFunction= ruleStdFunction EOF ;
    public final EObject entryRuleStdFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStdFunction = null;


        try {
            // InternalVaselina.g:1163:52: (iv_ruleStdFunction= ruleStdFunction EOF )
            // InternalVaselina.g:1164:2: iv_ruleStdFunction= ruleStdFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStdFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStdFunction=ruleStdFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStdFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStdFunction"


    // $ANTLR start "ruleStdFunction"
    // InternalVaselina.g:1170:1: ruleStdFunction returns [EObject current=null] : ( () ( (lv_name_1_0= ruleStdfunctionList ) ) otherlv_2= 'using' otherlv_3= ':' ( ( (lv_args_4_0= rulevarExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )* )? otherlv_7= ':' ) ;
    public final EObject ruleStdFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_args_4_0 = null;

        EObject lv_args_6_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:1176:2: ( ( () ( (lv_name_1_0= ruleStdfunctionList ) ) otherlv_2= 'using' otherlv_3= ':' ( ( (lv_args_4_0= rulevarExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )* )? otherlv_7= ':' ) )
            // InternalVaselina.g:1177:2: ( () ( (lv_name_1_0= ruleStdfunctionList ) ) otherlv_2= 'using' otherlv_3= ':' ( ( (lv_args_4_0= rulevarExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )* )? otherlv_7= ':' )
            {
            // InternalVaselina.g:1177:2: ( () ( (lv_name_1_0= ruleStdfunctionList ) ) otherlv_2= 'using' otherlv_3= ':' ( ( (lv_args_4_0= rulevarExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )* )? otherlv_7= ':' )
            // InternalVaselina.g:1178:3: () ( (lv_name_1_0= ruleStdfunctionList ) ) otherlv_2= 'using' otherlv_3= ':' ( ( (lv_args_4_0= rulevarExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )* )? otherlv_7= ':'
            {
            // InternalVaselina.g:1178:3: ()
            // InternalVaselina.g:1179:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStdFunctionAccess().getStdFunctionAction_0(),
              					current);
              			
            }

            }

            // InternalVaselina.g:1185:3: ( (lv_name_1_0= ruleStdfunctionList ) )
            // InternalVaselina.g:1186:4: (lv_name_1_0= ruleStdfunctionList )
            {
            // InternalVaselina.g:1186:4: (lv_name_1_0= ruleStdfunctionList )
            // InternalVaselina.g:1187:5: lv_name_1_0= ruleStdfunctionList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStdFunctionAccess().getNameStdfunctionListParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_name_1_0=ruleStdfunctionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStdFunctionRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.xtext.example.mydsl.Vaselina.StdfunctionList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getStdFunctionAccess().getUsingKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getStdFunctionAccess().getColonKeyword_3());
              		
            }
            // InternalVaselina.g:1212:3: ( ( (lv_args_4_0= rulevarExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_NUM)||LA18_0==RULE_STRING||(LA18_0>=33 && LA18_0<=40)||LA18_0==66||(LA18_0>=68 && LA18_0<=70)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalVaselina.g:1213:4: ( (lv_args_4_0= rulevarExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )*
                    {
                    // InternalVaselina.g:1213:4: ( (lv_args_4_0= rulevarExpression ) )
                    // InternalVaselina.g:1214:5: (lv_args_4_0= rulevarExpression )
                    {
                    // InternalVaselina.g:1214:5: (lv_args_4_0= rulevarExpression )
                    // InternalVaselina.g:1215:6: lv_args_4_0= rulevarExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStdFunctionAccess().getArgsVarExpressionParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_args_4_0=rulevarExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStdFunctionRule());
                      						}
                      						add(
                      							current,
                      							"args",
                      							lv_args_4_0,
                      							"org.xtext.example.mydsl.Vaselina.varExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalVaselina.g:1232:4: (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==27) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalVaselina.g:1233:5: otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,27,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getStdFunctionAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalVaselina.g:1237:5: ( (lv_args_6_0= rulevarExpression ) )
                    	    // InternalVaselina.g:1238:6: (lv_args_6_0= rulevarExpression )
                    	    {
                    	    // InternalVaselina.g:1238:6: (lv_args_6_0= rulevarExpression )
                    	    // InternalVaselina.g:1239:7: lv_args_6_0= rulevarExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getStdFunctionAccess().getArgsVarExpressionParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    lv_args_6_0=rulevarExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getStdFunctionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"args",
                    	      								lv_args_6_0,
                    	      								"org.xtext.example.mydsl.Vaselina.varExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getStdFunctionAccess().getColonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStdFunction"


    // $ANTLR start "entryRuleIfExpression"
    // InternalVaselina.g:1266:1: entryRuleIfExpression returns [EObject current=null] : iv_ruleIfExpression= ruleIfExpression EOF ;
    public final EObject entryRuleIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpression = null;


        try {
            // InternalVaselina.g:1266:53: (iv_ruleIfExpression= ruleIfExpression EOF )
            // InternalVaselina.g:1267:2: iv_ruleIfExpression= ruleIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfExpression=ruleIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIfExpression"


    // $ANTLR start "ruleIfExpression"
    // InternalVaselina.g:1273:1: ruleIfExpression returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'this' otherlv_3= 'true?' otherlv_4= ':' ( (lv_ifconditon_5_0= rulevarExpression ) ) otherlv_6= ':' otherlv_7= 'yes' otherlv_8= '->' ( (lv_then_9_0= ruleBodyStatement ) )* ( ( ( '<-' )=>otherlv_10= '<-' ) otherlv_11= 'no' otherlv_12= '->' ( (lv_else_13_0= ruleBodyStatement ) )* )? ( ( '<-' )=>otherlv_14= '<-' ) ) ;
    public final EObject ruleIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_ifconditon_5_0 = null;

        EObject lv_then_9_0 = null;

        EObject lv_else_13_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:1279:2: ( ( () otherlv_1= 'is' otherlv_2= 'this' otherlv_3= 'true?' otherlv_4= ':' ( (lv_ifconditon_5_0= rulevarExpression ) ) otherlv_6= ':' otherlv_7= 'yes' otherlv_8= '->' ( (lv_then_9_0= ruleBodyStatement ) )* ( ( ( '<-' )=>otherlv_10= '<-' ) otherlv_11= 'no' otherlv_12= '->' ( (lv_else_13_0= ruleBodyStatement ) )* )? ( ( '<-' )=>otherlv_14= '<-' ) ) )
            // InternalVaselina.g:1280:2: ( () otherlv_1= 'is' otherlv_2= 'this' otherlv_3= 'true?' otherlv_4= ':' ( (lv_ifconditon_5_0= rulevarExpression ) ) otherlv_6= ':' otherlv_7= 'yes' otherlv_8= '->' ( (lv_then_9_0= ruleBodyStatement ) )* ( ( ( '<-' )=>otherlv_10= '<-' ) otherlv_11= 'no' otherlv_12= '->' ( (lv_else_13_0= ruleBodyStatement ) )* )? ( ( '<-' )=>otherlv_14= '<-' ) )
            {
            // InternalVaselina.g:1280:2: ( () otherlv_1= 'is' otherlv_2= 'this' otherlv_3= 'true?' otherlv_4= ':' ( (lv_ifconditon_5_0= rulevarExpression ) ) otherlv_6= ':' otherlv_7= 'yes' otherlv_8= '->' ( (lv_then_9_0= ruleBodyStatement ) )* ( ( ( '<-' )=>otherlv_10= '<-' ) otherlv_11= 'no' otherlv_12= '->' ( (lv_else_13_0= ruleBodyStatement ) )* )? ( ( '<-' )=>otherlv_14= '<-' ) )
            // InternalVaselina.g:1281:3: () otherlv_1= 'is' otherlv_2= 'this' otherlv_3= 'true?' otherlv_4= ':' ( (lv_ifconditon_5_0= rulevarExpression ) ) otherlv_6= ':' otherlv_7= 'yes' otherlv_8= '->' ( (lv_then_9_0= ruleBodyStatement ) )* ( ( ( '<-' )=>otherlv_10= '<-' ) otherlv_11= 'no' otherlv_12= '->' ( (lv_else_13_0= ruleBodyStatement ) )* )? ( ( '<-' )=>otherlv_14= '<-' )
            {
            // InternalVaselina.g:1281:3: ()
            // InternalVaselina.g:1282:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIfExpressionAccess().getIfExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfExpressionAccess().getIsKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,42,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfExpressionAccess().getThisKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,43,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getIfExpressionAccess().getTrueKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,22,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getIfExpressionAccess().getColonKeyword_4());
              		
            }
            // InternalVaselina.g:1304:3: ( (lv_ifconditon_5_0= rulevarExpression ) )
            // InternalVaselina.g:1305:4: (lv_ifconditon_5_0= rulevarExpression )
            {
            // InternalVaselina.g:1305:4: (lv_ifconditon_5_0= rulevarExpression )
            // InternalVaselina.g:1306:5: lv_ifconditon_5_0= rulevarExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpressionAccess().getIfconditonVarExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_ifconditon_5_0=rulevarExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfExpressionRule());
              					}
              					set(
              						current,
              						"ifconditon",
              						lv_ifconditon_5_0,
              						"org.xtext.example.mydsl.Vaselina.varExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getIfExpressionAccess().getColonKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,44,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getIfExpressionAccess().getYesKeyword_7());
              		
            }
            otherlv_8=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getIfExpressionAccess().getHyphenMinusGreaterThanSignKeyword_8());
              		
            }
            // InternalVaselina.g:1335:3: ( (lv_then_9_0= ruleBodyStatement ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||LA19_0==15||(LA19_0>=20 && LA19_0<=21)||(LA19_0>=33 && LA19_0<=41)||LA19_0==46||(LA19_0>=49 && LA19_0<=50)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalVaselina.g:1336:4: (lv_then_9_0= ruleBodyStatement )
            	    {
            	    // InternalVaselina.g:1336:4: (lv_then_9_0= ruleBodyStatement )
            	    // InternalVaselina.g:1337:5: lv_then_9_0= ruleBodyStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfExpressionAccess().getThenBodyStatementParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_then_9_0=ruleBodyStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getIfExpressionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"then",
            	      						lv_then_9_0,
            	      						"org.xtext.example.mydsl.Vaselina.BodyStatement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalVaselina.g:1354:3: ( ( ( '<-' )=>otherlv_10= '<-' ) otherlv_11= 'no' otherlv_12= '->' ( (lv_else_13_0= ruleBodyStatement ) )* )?
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalVaselina.g:1355:4: ( ( '<-' )=>otherlv_10= '<-' ) otherlv_11= 'no' otherlv_12= '->' ( (lv_else_13_0= ruleBodyStatement ) )*
                    {
                    // InternalVaselina.g:1355:4: ( ( '<-' )=>otherlv_10= '<-' )
                    // InternalVaselina.g:1356:5: ( '<-' )=>otherlv_10= '<-'
                    {
                    otherlv_10=(Token)match(input,14,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_10, grammarAccess.getIfExpressionAccess().getLessThanSignHyphenMinusKeyword_10_0());
                      				
                    }

                    }

                    otherlv_11=(Token)match(input,45,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getIfExpressionAccess().getNoKeyword_10_1());
                      			
                    }
                    otherlv_12=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getIfExpressionAccess().getHyphenMinusGreaterThanSignKeyword_10_2());
                      			
                    }
                    // InternalVaselina.g:1370:4: ( (lv_else_13_0= ruleBodyStatement ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==RULE_ID||LA20_0==15||(LA20_0>=20 && LA20_0<=21)||(LA20_0>=33 && LA20_0<=41)||LA20_0==46||(LA20_0>=49 && LA20_0<=50)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalVaselina.g:1371:5: (lv_else_13_0= ruleBodyStatement )
                    	    {
                    	    // InternalVaselina.g:1371:5: (lv_else_13_0= ruleBodyStatement )
                    	    // InternalVaselina.g:1372:6: lv_else_13_0= ruleBodyStatement
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getIfExpressionAccess().getElseBodyStatementParserRuleCall_10_3_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_else_13_0=ruleBodyStatement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getIfExpressionRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"else",
                    	      							lv_else_13_0,
                    	      							"org.xtext.example.mydsl.Vaselina.BodyStatement");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalVaselina.g:1390:3: ( ( '<-' )=>otherlv_14= '<-' )
            // InternalVaselina.g:1391:4: ( '<-' )=>otherlv_14= '<-'
            {
            otherlv_14=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_14, grammarAccess.getIfExpressionAccess().getLessThanSignHyphenMinusKeyword_11());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIfExpression"


    // $ANTLR start "entryRuleDoWhileExpression"
    // InternalVaselina.g:1401:1: entryRuleDoWhileExpression returns [EObject current=null] : iv_ruleDoWhileExpression= ruleDoWhileExpression EOF ;
    public final EObject entryRuleDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoWhileExpression = null;


        try {
            // InternalVaselina.g:1401:58: (iv_ruleDoWhileExpression= ruleDoWhileExpression EOF )
            // InternalVaselina.g:1402:2: iv_ruleDoWhileExpression= ruleDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDoWhileExpression=ruleDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDoWhileExpression"


    // $ANTLR start "ruleDoWhileExpression"
    // InternalVaselina.g:1408:1: ruleDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'as' otherlv_2= 'long' otherlv_3= 'as' otherlv_4= ':' ( (lv_loopConditon_5_0= rulevarExpression ) ) otherlv_6= ':' otherlv_7= 'repeat' otherlv_8= '->' ( (lv_body_9_0= ruleBodyStatement ) )* ( ( '<-' )=>otherlv_10= '<-' ) ) ;
    public final EObject ruleDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_loopConditon_5_0 = null;

        EObject lv_body_9_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:1414:2: ( ( () otherlv_1= 'as' otherlv_2= 'long' otherlv_3= 'as' otherlv_4= ':' ( (lv_loopConditon_5_0= rulevarExpression ) ) otherlv_6= ':' otherlv_7= 'repeat' otherlv_8= '->' ( (lv_body_9_0= ruleBodyStatement ) )* ( ( '<-' )=>otherlv_10= '<-' ) ) )
            // InternalVaselina.g:1415:2: ( () otherlv_1= 'as' otherlv_2= 'long' otherlv_3= 'as' otherlv_4= ':' ( (lv_loopConditon_5_0= rulevarExpression ) ) otherlv_6= ':' otherlv_7= 'repeat' otherlv_8= '->' ( (lv_body_9_0= ruleBodyStatement ) )* ( ( '<-' )=>otherlv_10= '<-' ) )
            {
            // InternalVaselina.g:1415:2: ( () otherlv_1= 'as' otherlv_2= 'long' otherlv_3= 'as' otherlv_4= ':' ( (lv_loopConditon_5_0= rulevarExpression ) ) otherlv_6= ':' otherlv_7= 'repeat' otherlv_8= '->' ( (lv_body_9_0= ruleBodyStatement ) )* ( ( '<-' )=>otherlv_10= '<-' ) )
            // InternalVaselina.g:1416:3: () otherlv_1= 'as' otherlv_2= 'long' otherlv_3= 'as' otherlv_4= ':' ( (lv_loopConditon_5_0= rulevarExpression ) ) otherlv_6= ':' otherlv_7= 'repeat' otherlv_8= '->' ( (lv_body_9_0= ruleBodyStatement ) )* ( ( '<-' )=>otherlv_10= '<-' )
            {
            // InternalVaselina.g:1416:3: ()
            // InternalVaselina.g:1417:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDoWhileExpressionAccess().getDoWhileExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDoWhileExpressionAccess().getAsKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDoWhileExpressionAccess().getLongKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,46,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDoWhileExpressionAccess().getAsKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,22,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDoWhileExpressionAccess().getColonKeyword_4());
              		
            }
            // InternalVaselina.g:1439:3: ( (lv_loopConditon_5_0= rulevarExpression ) )
            // InternalVaselina.g:1440:4: (lv_loopConditon_5_0= rulevarExpression )
            {
            // InternalVaselina.g:1440:4: (lv_loopConditon_5_0= rulevarExpression )
            // InternalVaselina.g:1441:5: lv_loopConditon_5_0= rulevarExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDoWhileExpressionAccess().getLoopConditonVarExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_loopConditon_5_0=rulevarExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDoWhileExpressionRule());
              					}
              					set(
              						current,
              						"loopConditon",
              						lv_loopConditon_5_0,
              						"org.xtext.example.mydsl.Vaselina.varExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDoWhileExpressionAccess().getColonKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,48,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDoWhileExpressionAccess().getRepeatKeyword_7());
              		
            }
            otherlv_8=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getDoWhileExpressionAccess().getHyphenMinusGreaterThanSignKeyword_8());
              		
            }
            // InternalVaselina.g:1470:3: ( (lv_body_9_0= ruleBodyStatement ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||LA22_0==15||(LA22_0>=20 && LA22_0<=21)||(LA22_0>=33 && LA22_0<=41)||LA22_0==46||(LA22_0>=49 && LA22_0<=50)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalVaselina.g:1471:4: (lv_body_9_0= ruleBodyStatement )
            	    {
            	    // InternalVaselina.g:1471:4: (lv_body_9_0= ruleBodyStatement )
            	    // InternalVaselina.g:1472:5: lv_body_9_0= ruleBodyStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDoWhileExpressionAccess().getBodyBodyStatementParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_body_9_0=ruleBodyStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDoWhileExpressionRule());
            	      					}
            	      					add(
            	      						current,
            	      						"body",
            	      						lv_body_9_0,
            	      						"org.xtext.example.mydsl.Vaselina.BodyStatement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalVaselina.g:1489:3: ( ( '<-' )=>otherlv_10= '<-' )
            // InternalVaselina.g:1490:4: ( '<-' )=>otherlv_10= '<-'
            {
            otherlv_10=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_10, grammarAccess.getDoWhileExpressionAccess().getLessThanSignHyphenMinusKeyword_10());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDoWhileExpression"


    // $ANTLR start "entryRuleBrkStr"
    // InternalVaselina.g:1500:1: entryRuleBrkStr returns [EObject current=null] : iv_ruleBrkStr= ruleBrkStr EOF ;
    public final EObject entryRuleBrkStr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrkStr = null;


        try {
            // InternalVaselina.g:1500:47: (iv_ruleBrkStr= ruleBrkStr EOF )
            // InternalVaselina.g:1501:2: iv_ruleBrkStr= ruleBrkStr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBrkStrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBrkStr=ruleBrkStr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBrkStr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBrkStr"


    // $ANTLR start "ruleBrkStr"
    // InternalVaselina.g:1507:1: ruleBrkStr returns [EObject current=null] : ( () ( (lv_brk_1_0= 'break' ) ) ) ;
    public final EObject ruleBrkStr() throws RecognitionException {
        EObject current = null;

        Token lv_brk_1_0=null;


        	enterRule();

        try {
            // InternalVaselina.g:1513:2: ( ( () ( (lv_brk_1_0= 'break' ) ) ) )
            // InternalVaselina.g:1514:2: ( () ( (lv_brk_1_0= 'break' ) ) )
            {
            // InternalVaselina.g:1514:2: ( () ( (lv_brk_1_0= 'break' ) ) )
            // InternalVaselina.g:1515:3: () ( (lv_brk_1_0= 'break' ) )
            {
            // InternalVaselina.g:1515:3: ()
            // InternalVaselina.g:1516:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBrkStrAccess().getBrkStrAction_0(),
              					current);
              			
            }

            }

            // InternalVaselina.g:1522:3: ( (lv_brk_1_0= 'break' ) )
            // InternalVaselina.g:1523:4: (lv_brk_1_0= 'break' )
            {
            // InternalVaselina.g:1523:4: (lv_brk_1_0= 'break' )
            // InternalVaselina.g:1524:5: lv_brk_1_0= 'break'
            {
            lv_brk_1_0=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_brk_1_0, grammarAccess.getBrkStrAccess().getBrkBreakKeyword_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBrkStrRule());
              					}
              					setWithLastConsumed(current, "brk", lv_brk_1_0, "break");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBrkStr"


    // $ANTLR start "entryRuleReturnDeclaration"
    // InternalVaselina.g:1540:1: entryRuleReturnDeclaration returns [EObject current=null] : iv_ruleReturnDeclaration= ruleReturnDeclaration EOF ;
    public final EObject entryRuleReturnDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnDeclaration = null;


        try {
            // InternalVaselina.g:1540:58: (iv_ruleReturnDeclaration= ruleReturnDeclaration EOF )
            // InternalVaselina.g:1541:2: iv_ruleReturnDeclaration= ruleReturnDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReturnDeclaration=ruleReturnDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleReturnDeclaration"


    // $ANTLR start "ruleReturnDeclaration"
    // InternalVaselina.g:1547:1: ruleReturnDeclaration returns [EObject current=null] : (otherlv_0= 'type' otherlv_1= 'keeping' ( (lv_rtnType_2_0= rulevarTypeLiteral ) ) ) ;
    public final EObject ruleReturnDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_rtnType_2_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:1553:2: ( (otherlv_0= 'type' otherlv_1= 'keeping' ( (lv_rtnType_2_0= rulevarTypeLiteral ) ) ) )
            // InternalVaselina.g:1554:2: (otherlv_0= 'type' otherlv_1= 'keeping' ( (lv_rtnType_2_0= rulevarTypeLiteral ) ) )
            {
            // InternalVaselina.g:1554:2: (otherlv_0= 'type' otherlv_1= 'keeping' ( (lv_rtnType_2_0= rulevarTypeLiteral ) ) )
            // InternalVaselina.g:1555:3: otherlv_0= 'type' otherlv_1= 'keeping' ( (lv_rtnType_2_0= rulevarTypeLiteral ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReturnDeclarationAccess().getTypeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,51,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReturnDeclarationAccess().getKeepingKeyword_1());
              		
            }
            // InternalVaselina.g:1563:3: ( (lv_rtnType_2_0= rulevarTypeLiteral ) )
            // InternalVaselina.g:1564:4: (lv_rtnType_2_0= rulevarTypeLiteral )
            {
            // InternalVaselina.g:1564:4: (lv_rtnType_2_0= rulevarTypeLiteral )
            // InternalVaselina.g:1565:5: lv_rtnType_2_0= rulevarTypeLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReturnDeclarationAccess().getRtnTypeVarTypeLiteralParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_rtnType_2_0=rulevarTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getReturnDeclarationRule());
              					}
              					set(
              						current,
              						"rtnType",
              						lv_rtnType_2_0,
              						"org.xtext.example.mydsl.Vaselina.varTypeLiteral");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleReturnDeclaration"


    // $ANTLR start "entryRuleDOUBLE"
    // InternalVaselina.g:1586:1: entryRuleDOUBLE returns [EObject current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final EObject entryRuleDOUBLE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOUBLE = null;


        try {
            // InternalVaselina.g:1586:47: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalVaselina.g:1587:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDOUBLERule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDOUBLE; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // InternalVaselina.g:1593:1: ruleDOUBLE returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_NUM ) ) otherlv_1= '.' ( ( (lv_decimal_2_1= RULE_INT | lv_decimal_2_2= RULE_NUM ) ) ) ) ;
    public final EObject ruleDOUBLE() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token otherlv_1=null;
        Token lv_decimal_2_1=null;
        Token lv_decimal_2_2=null;


        	enterRule();

        try {
            // InternalVaselina.g:1599:2: ( ( ( (lv_integer_0_0= RULE_NUM ) ) otherlv_1= '.' ( ( (lv_decimal_2_1= RULE_INT | lv_decimal_2_2= RULE_NUM ) ) ) ) )
            // InternalVaselina.g:1600:2: ( ( (lv_integer_0_0= RULE_NUM ) ) otherlv_1= '.' ( ( (lv_decimal_2_1= RULE_INT | lv_decimal_2_2= RULE_NUM ) ) ) )
            {
            // InternalVaselina.g:1600:2: ( ( (lv_integer_0_0= RULE_NUM ) ) otherlv_1= '.' ( ( (lv_decimal_2_1= RULE_INT | lv_decimal_2_2= RULE_NUM ) ) ) )
            // InternalVaselina.g:1601:3: ( (lv_integer_0_0= RULE_NUM ) ) otherlv_1= '.' ( ( (lv_decimal_2_1= RULE_INT | lv_decimal_2_2= RULE_NUM ) ) )
            {
            // InternalVaselina.g:1601:3: ( (lv_integer_0_0= RULE_NUM ) )
            // InternalVaselina.g:1602:4: (lv_integer_0_0= RULE_NUM )
            {
            // InternalVaselina.g:1602:4: (lv_integer_0_0= RULE_NUM )
            // InternalVaselina.g:1603:5: lv_integer_0_0= RULE_NUM
            {
            lv_integer_0_0=(Token)match(input,RULE_NUM,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_integer_0_0, grammarAccess.getDOUBLEAccess().getIntegerNUMTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDOUBLERule());
              					}
              					setWithLastConsumed(
              						current,
              						"integer",
              						lv_integer_0_0,
              						"org.xtext.example.mydsl.Vaselina.NUM");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,52,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1());
              		
            }
            // InternalVaselina.g:1623:3: ( ( (lv_decimal_2_1= RULE_INT | lv_decimal_2_2= RULE_NUM ) ) )
            // InternalVaselina.g:1624:4: ( (lv_decimal_2_1= RULE_INT | lv_decimal_2_2= RULE_NUM ) )
            {
            // InternalVaselina.g:1624:4: ( (lv_decimal_2_1= RULE_INT | lv_decimal_2_2= RULE_NUM ) )
            // InternalVaselina.g:1625:5: (lv_decimal_2_1= RULE_INT | lv_decimal_2_2= RULE_NUM )
            {
            // InternalVaselina.g:1625:5: (lv_decimal_2_1= RULE_INT | lv_decimal_2_2= RULE_NUM )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_NUM) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalVaselina.g:1626:6: lv_decimal_2_1= RULE_INT
                    {
                    lv_decimal_2_1=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_decimal_2_1, grammarAccess.getDOUBLEAccess().getDecimalINTTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDOUBLERule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"decimal",
                      							lv_decimal_2_1,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalVaselina.g:1641:6: lv_decimal_2_2= RULE_NUM
                    {
                    lv_decimal_2_2=(Token)match(input,RULE_NUM,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_decimal_2_2, grammarAccess.getDOUBLEAccess().getDecimalNUMTerminalRuleCall_2_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getDOUBLERule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"decimal",
                      							lv_decimal_2_2,
                      							"org.xtext.example.mydsl.Vaselina.NUM");
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRulevarExpression"
    // InternalVaselina.g:1662:1: entryRulevarExpression returns [EObject current=null] : iv_rulevarExpression= rulevarExpression EOF ;
    public final EObject entryRulevarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevarExpression = null;


        try {
            // InternalVaselina.g:1662:54: (iv_rulevarExpression= rulevarExpression EOF )
            // InternalVaselina.g:1663:2: iv_rulevarExpression= rulevarExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulevarExpression=rulevarExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulevarExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulevarExpression"


    // $ANTLR start "rulevarExpression"
    // InternalVaselina.g:1669:1: rulevarExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject rulevarExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:1675:2: (this_Or_0= ruleOr )
            // InternalVaselina.g:1676:2: this_Or_0= ruleOr
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getVarExpressionAccess().getOrParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Or_0=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Or_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulevarExpression"


    // $ANTLR start "entryRuleOr"
    // InternalVaselina.g:1687:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalVaselina.g:1687:43: (iv_ruleOr= ruleOr EOF )
            // InternalVaselina.g:1688:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalVaselina.g:1694:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:1700:2: ( (this_And_0= ruleAnd ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalVaselina.g:1701:2: (this_And_0= ruleAnd ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalVaselina.g:1701:2: (this_And_0= ruleAnd ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalVaselina.g:1702:3: this_And_0= ruleAnd ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_34);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_And_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalVaselina.g:1710:3: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==53) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalVaselina.g:1711:4: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalVaselina.g:1711:4: ()
            	    // InternalVaselina.g:1712:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalVaselina.g:1718:4: ( (lv_op_2_0= '||' ) )
            	    // InternalVaselina.g:1719:5: (lv_op_2_0= '||' )
            	    {
            	    // InternalVaselina.g:1719:5: (lv_op_2_0= '||' )
            	    // InternalVaselina.g:1720:6: lv_op_2_0= '||'
            	    {
            	    lv_op_2_0=(Token)match(input,53,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getOrAccess().getOpVerticalLineVerticalLineKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getOrRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "||");
            	      					
            	    }

            	    }


            	    }

            	    // InternalVaselina.g:1732:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalVaselina.g:1733:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalVaselina.g:1733:5: (lv_right_3_0= ruleAnd )
            	    // InternalVaselina.g:1734:6: lv_right_3_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_34);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.example.mydsl.Vaselina.And");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalVaselina.g:1756:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalVaselina.g:1756:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalVaselina.g:1757:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalVaselina.g:1763:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:1769:2: ( (this_Equality_0= ruleEquality ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalVaselina.g:1770:2: (this_Equality_0= ruleEquality ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalVaselina.g:1770:2: (this_Equality_0= ruleEquality ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalVaselina.g:1771:3: this_Equality_0= ruleEquality ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_35);
            this_Equality_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equality_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalVaselina.g:1779:3: ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==54) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalVaselina.g:1780:4: () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalVaselina.g:1780:4: ()
            	    // InternalVaselina.g:1781:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalVaselina.g:1787:4: ( (lv_op_2_0= '&&' ) )
            	    // InternalVaselina.g:1788:5: (lv_op_2_0= '&&' )
            	    {
            	    // InternalVaselina.g:1788:5: (lv_op_2_0= '&&' )
            	    // InternalVaselina.g:1789:6: lv_op_2_0= '&&'
            	    {
            	    lv_op_2_0=(Token)match(input,54,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getAndAccess().getOpAmpersandAmpersandKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getAndRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "&&");
            	      					
            	    }

            	    }


            	    }

            	    // InternalVaselina.g:1801:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalVaselina.g:1802:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalVaselina.g:1802:5: (lv_right_3_0= ruleEquality )
            	    // InternalVaselina.g:1803:6: lv_right_3_0= ruleEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_35);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.example.mydsl.Vaselina.Equality");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalVaselina.g:1825:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalVaselina.g:1825:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalVaselina.g:1826:2: iv_ruleEquality= ruleEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquality; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalVaselina.g:1832:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:1838:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalVaselina.g:1839:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalVaselina.g:1839:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalVaselina.g:1840:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_36);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalVaselina.g:1848:3: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=55 && LA27_0<=56)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalVaselina.g:1849:4: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalVaselina.g:1849:4: ()
            	    // InternalVaselina.g:1850:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalVaselina.g:1856:4: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // InternalVaselina.g:1857:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalVaselina.g:1857:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // InternalVaselina.g:1858:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // InternalVaselina.g:1858:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==55) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==56) ) {
            	        alt26=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalVaselina.g:1859:7: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,55,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getEqualityRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalVaselina.g:1870:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,56,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getEqualityRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalVaselina.g:1883:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalVaselina.g:1884:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalVaselina.g:1884:5: (lv_right_3_0= ruleComparison )
            	    // InternalVaselina.g:1885:6: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.example.mydsl.Vaselina.Comparison");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalVaselina.g:1907:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalVaselina.g:1907:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalVaselina.g:1908:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalVaselina.g:1914:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:1920:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalVaselina.g:1921:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalVaselina.g:1921:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalVaselina.g:1922:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PlusOrMinus_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalVaselina.g:1930:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=57 && LA29_0<=60)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalVaselina.g:1931:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalVaselina.g:1931:4: ()
            	    // InternalVaselina.g:1932:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalVaselina.g:1938:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalVaselina.g:1939:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalVaselina.g:1939:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalVaselina.g:1940:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalVaselina.g:1940:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt28=4;
            	    switch ( input.LA(1) ) {
            	    case 57:
            	        {
            	        alt28=1;
            	        }
            	        break;
            	    case 58:
            	        {
            	        alt28=2;
            	        }
            	        break;
            	    case 59:
            	        {
            	        alt28=3;
            	        }
            	        break;
            	    case 60:
            	        {
            	        alt28=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt28) {
            	        case 1 :
            	            // InternalVaselina.g:1941:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,57,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalVaselina.g:1952:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,58,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalVaselina.g:1963:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,59,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalVaselina.g:1974:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,60,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalVaselina.g:1987:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalVaselina.g:1988:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalVaselina.g:1988:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalVaselina.g:1989:6: lv_right_3_0= rulePlusOrMinus
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_37);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.example.mydsl.Vaselina.PlusOrMinus");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalVaselina.g:2011:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalVaselina.g:2011:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalVaselina.g:2012:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusOrMinus; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalVaselina.g:2018:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:2024:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )* ) )
            // InternalVaselina.g:2025:2: (this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )* )
            {
            // InternalVaselina.g:2025:2: (this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )* )
            // InternalVaselina.g:2026:3: this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_38);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MulOrDiv_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalVaselina.g:2034:3: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=61 && LA31_0<=62)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalVaselina.g:2035:4: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) )
            	    {
            	    // InternalVaselina.g:2035:4: ()
            	    // InternalVaselina.g:2036:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getPlusOrMinusAccess().getPlusOrMinusLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalVaselina.g:2042:4: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // InternalVaselina.g:2043:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // InternalVaselina.g:2043:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // InternalVaselina.g:2044:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // InternalVaselina.g:2044:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==61) ) {
            	        alt30=1;
            	    }
            	    else if ( (LA30_0==62) ) {
            	        alt30=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // InternalVaselina.g:2045:7: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,61,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getPlusOrMinusAccess().getOpPlusSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getPlusOrMinusRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalVaselina.g:2056:7: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,62,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getPlusOrMinusAccess().getOpHyphenMinusKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getPlusOrMinusRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalVaselina.g:2069:4: ( (lv_right_3_0= ruleMulOrDiv ) )
            	    // InternalVaselina.g:2070:5: (lv_right_3_0= ruleMulOrDiv )
            	    {
            	    // InternalVaselina.g:2070:5: (lv_right_3_0= ruleMulOrDiv )
            	    // InternalVaselina.g:2071:6: lv_right_3_0= ruleMulOrDiv
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
            	    lv_right_3_0=ruleMulOrDiv();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.example.mydsl.Vaselina.MulOrDiv");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalVaselina.g:2093:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalVaselina.g:2093:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalVaselina.g:2094:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulOrDivRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulOrDiv; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalVaselina.g:2100:1: ruleMulOrDiv returns [EObject current=null] : (this_Module_0= ruleModule ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleModule ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Module_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:2106:2: ( (this_Module_0= ruleModule ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleModule ) ) )* ) )
            // InternalVaselina.g:2107:2: (this_Module_0= ruleModule ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleModule ) ) )* )
            {
            // InternalVaselina.g:2107:2: (this_Module_0= ruleModule ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleModule ) ) )* )
            // InternalVaselina.g:2108:3: this_Module_0= ruleModule ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleModule ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMulOrDivAccess().getModuleParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_39);
            this_Module_0=ruleModule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Module_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalVaselina.g:2116:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleModule ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=63 && LA33_0<=64)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalVaselina.g:2117:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleModule ) )
            	    {
            	    // InternalVaselina.g:2117:4: ()
            	    // InternalVaselina.g:2118:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalVaselina.g:2124:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // InternalVaselina.g:2125:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // InternalVaselina.g:2125:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // InternalVaselina.g:2126:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // InternalVaselina.g:2126:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==63) ) {
            	        alt32=1;
            	    }
            	    else if ( (LA32_0==64) ) {
            	        alt32=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // InternalVaselina.g:2127:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,63,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getMulOrDivRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalVaselina.g:2138:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,64,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getMulOrDivRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalVaselina.g:2151:4: ( (lv_right_3_0= ruleModule ) )
            	    // InternalVaselina.g:2152:5: (lv_right_3_0= ruleModule )
            	    {
            	    // InternalVaselina.g:2152:5: (lv_right_3_0= ruleModule )
            	    // InternalVaselina.g:2153:6: lv_right_3_0= ruleModule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightModuleParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
            	    lv_right_3_0=ruleModule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.example.mydsl.Vaselina.Module");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRuleModule"
    // InternalVaselina.g:2175:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalVaselina.g:2175:47: (iv_ruleModule= ruleModule EOF )
            // InternalVaselina.g:2176:2: iv_ruleModule= ruleModule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModule=ruleModule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalVaselina.g:2182:1: ruleModule returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( (lv_op_2_0= '%' ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:2188:2: ( (this_Primary_0= rulePrimary ( () ( (lv_op_2_0= '%' ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalVaselina.g:2189:2: (this_Primary_0= rulePrimary ( () ( (lv_op_2_0= '%' ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalVaselina.g:2189:2: (this_Primary_0= rulePrimary ( () ( (lv_op_2_0= '%' ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalVaselina.g:2190:3: this_Primary_0= rulePrimary ( () ( (lv_op_2_0= '%' ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getModuleAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_40);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Primary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalVaselina.g:2198:3: ( () ( (lv_op_2_0= '%' ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==65) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalVaselina.g:2199:4: () ( (lv_op_2_0= '%' ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalVaselina.g:2199:4: ()
            	    // InternalVaselina.g:2200:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getModuleAccess().getModuleLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalVaselina.g:2206:4: ( (lv_op_2_0= '%' ) )
            	    // InternalVaselina.g:2207:5: (lv_op_2_0= '%' )
            	    {
            	    // InternalVaselina.g:2207:5: (lv_op_2_0= '%' )
            	    // InternalVaselina.g:2208:6: lv_op_2_0= '%'
            	    {
            	    lv_op_2_0=(Token)match(input,65,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getModuleAccess().getOpPercentSignKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getModuleRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "%");
            	      					
            	    }

            	    }


            	    }

            	    // InternalVaselina.g:2220:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalVaselina.g:2221:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalVaselina.g:2221:5: (lv_right_3_0= rulePrimary )
            	    // InternalVaselina.g:2222:6: lv_right_3_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getModuleAccess().getRightPrimaryParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getModuleRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.example.mydsl.Vaselina.Primary");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRulePrimary"
    // InternalVaselina.g:2244:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalVaselina.g:2244:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalVaselina.g:2245:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalVaselina.g:2251:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' () ( (lv_inside_2_0= rulevarExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= '!' ( (lv_expression_6_0= rulePrimary ) ) ) | this_AbstractMethodCall_7= ruleAbstractMethodCall | this_Terminal_8= ruleTerminal ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_inside_2_0 = null;

        EObject lv_expression_6_0 = null;

        EObject this_AbstractMethodCall_7 = null;

        EObject this_Terminal_8 = null;



        	enterRule();

        try {
            // InternalVaselina.g:2257:2: ( ( (otherlv_0= '(' () ( (lv_inside_2_0= rulevarExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= '!' ( (lv_expression_6_0= rulePrimary ) ) ) | this_AbstractMethodCall_7= ruleAbstractMethodCall | this_Terminal_8= ruleTerminal ) )
            // InternalVaselina.g:2258:2: ( (otherlv_0= '(' () ( (lv_inside_2_0= rulevarExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= '!' ( (lv_expression_6_0= rulePrimary ) ) ) | this_AbstractMethodCall_7= ruleAbstractMethodCall | this_Terminal_8= ruleTerminal )
            {
            // InternalVaselina.g:2258:2: ( (otherlv_0= '(' () ( (lv_inside_2_0= rulevarExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= '!' ( (lv_expression_6_0= rulePrimary ) ) ) | this_AbstractMethodCall_7= ruleAbstractMethodCall | this_Terminal_8= ruleTerminal )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt35=1;
                }
                break;
            case 68:
                {
                alt35=2;
                }
                break;
            case RULE_ID:
                {
                int LA35_3 = input.LA(2);

                if ( (LA35_3==26) ) {
                    alt35=3;
                }
                else if ( (LA35_3==EOF||LA35_3==RULE_ID||(LA35_3>=14 && LA35_3<=15)||(LA35_3>=20 && LA35_3<=22)||LA35_3==24||LA35_3==27||LA35_3==31||(LA35_3>=33 && LA35_3<=41)||LA35_3==46||(LA35_3>=49 && LA35_3<=50)||(LA35_3>=53 && LA35_3<=65)||LA35_3==67) ) {
                    alt35=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 3, input);

                    throw nvae;
                }
                }
                break;
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
                {
                alt35=3;
                }
                break;
            case RULE_NUM:
            case RULE_STRING:
            case 69:
            case 70:
                {
                alt35=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalVaselina.g:2259:3: (otherlv_0= '(' () ( (lv_inside_2_0= rulevarExpression ) ) otherlv_3= ')' )
                    {
                    // InternalVaselina.g:2259:3: (otherlv_0= '(' () ( (lv_inside_2_0= rulevarExpression ) ) otherlv_3= ')' )
                    // InternalVaselina.g:2260:4: otherlv_0= '(' () ( (lv_inside_2_0= rulevarExpression ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,66,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    // InternalVaselina.g:2264:4: ()
                    // InternalVaselina.g:2265:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getInsideAction_0_1(),
                      						current);
                      				
                    }

                    }

                    // InternalVaselina.g:2271:4: ( (lv_inside_2_0= rulevarExpression ) )
                    // InternalVaselina.g:2272:5: (lv_inside_2_0= rulevarExpression )
                    {
                    // InternalVaselina.g:2272:5: (lv_inside_2_0= rulevarExpression )
                    // InternalVaselina.g:2273:6: lv_inside_2_0= rulevarExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getInsideVarExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_41);
                    lv_inside_2_0=rulevarExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"inside",
                      							lv_inside_2_0,
                      							"org.xtext.example.mydsl.Vaselina.varExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVaselina.g:2296:3: ( () otherlv_5= '!' ( (lv_expression_6_0= rulePrimary ) ) )
                    {
                    // InternalVaselina.g:2296:3: ( () otherlv_5= '!' ( (lv_expression_6_0= rulePrimary ) ) )
                    // InternalVaselina.g:2297:4: () otherlv_5= '!' ( (lv_expression_6_0= rulePrimary ) )
                    {
                    // InternalVaselina.g:2297:4: ()
                    // InternalVaselina.g:2298:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_5=(Token)match(input,68,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                      			
                    }
                    // InternalVaselina.g:2308:4: ( (lv_expression_6_0= rulePrimary ) )
                    // InternalVaselina.g:2309:5: (lv_expression_6_0= rulePrimary )
                    {
                    // InternalVaselina.g:2309:5: (lv_expression_6_0= rulePrimary )
                    // InternalVaselina.g:2310:6: lv_expression_6_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_6_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_6_0,
                      							"org.xtext.example.mydsl.Vaselina.Primary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalVaselina.g:2329:3: this_AbstractMethodCall_7= ruleAbstractMethodCall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryAccess().getAbstractMethodCallParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AbstractMethodCall_7=ruleAbstractMethodCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AbstractMethodCall_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalVaselina.g:2338:3: this_Terminal_8= ruleTerminal
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryAccess().getTerminalParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Terminal_8=ruleTerminal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Terminal_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleTerminal"
    // InternalVaselina.g:2350:1: entryRuleTerminal returns [EObject current=null] : iv_ruleTerminal= ruleTerminal EOF ;
    public final EObject entryRuleTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminal = null;


        try {
            // InternalVaselina.g:2350:49: (iv_ruleTerminal= ruleTerminal EOF )
            // InternalVaselina.g:2351:2: iv_ruleTerminal= ruleTerminal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerminal=ruleTerminal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminal; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTerminal"


    // $ANTLR start "ruleTerminal"
    // InternalVaselina.g:2357:1: ruleTerminal returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_NUM ) ) ) | ( () ( (lv_value_5_0= ruleDOUBLE ) ) ) | ( () ( ( (lv_varRef_7_1= 'true...' | lv_varRef_7_2= 'false...' ) ) ) ) | ( () ( (otherlv_9= RULE_ID ) ) ) | ( () ( (otherlv_11= RULE_ID ) ) ( (lv_dim_12_0= rulearrayDimension ) )+ ) ) ;
    public final EObject ruleTerminal() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_varRef_7_1=null;
        Token lv_varRef_7_2=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_value_5_0 = null;

        EObject lv_dim_12_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:2363:2: ( ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_NUM ) ) ) | ( () ( (lv_value_5_0= ruleDOUBLE ) ) ) | ( () ( ( (lv_varRef_7_1= 'true...' | lv_varRef_7_2= 'false...' ) ) ) ) | ( () ( (otherlv_9= RULE_ID ) ) ) | ( () ( (otherlv_11= RULE_ID ) ) ( (lv_dim_12_0= rulearrayDimension ) )+ ) ) )
            // InternalVaselina.g:2364:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_NUM ) ) ) | ( () ( (lv_value_5_0= ruleDOUBLE ) ) ) | ( () ( ( (lv_varRef_7_1= 'true...' | lv_varRef_7_2= 'false...' ) ) ) ) | ( () ( (otherlv_9= RULE_ID ) ) ) | ( () ( (otherlv_11= RULE_ID ) ) ( (lv_dim_12_0= rulearrayDimension ) )+ ) )
            {
            // InternalVaselina.g:2364:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_NUM ) ) ) | ( () ( (lv_value_5_0= ruleDOUBLE ) ) ) | ( () ( ( (lv_varRef_7_1= 'true...' | lv_varRef_7_2= 'false...' ) ) ) ) | ( () ( (otherlv_9= RULE_ID ) ) ) | ( () ( (otherlv_11= RULE_ID ) ) ( (lv_dim_12_0= rulearrayDimension ) )+ ) )
            int alt38=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt38=1;
                }
                break;
            case RULE_NUM:
                {
                int LA38_2 = input.LA(2);

                if ( (LA38_2==52) ) {
                    alt38=3;
                }
                else if ( (LA38_2==EOF||LA38_2==RULE_ID||(LA38_2>=14 && LA38_2<=15)||(LA38_2>=20 && LA38_2<=22)||LA38_2==25||LA38_2==27||LA38_2==31||(LA38_2>=33 && LA38_2<=41)||LA38_2==46||(LA38_2>=49 && LA38_2<=50)||(LA38_2>=53 && LA38_2<=65)||LA38_2==67) ) {
                    alt38=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 2, input);

                    throw nvae;
                }
                }
                break;
            case 69:
            case 70:
                {
                alt38=4;
                }
                break;
            case RULE_ID:
                {
                int LA38_4 = input.LA(2);

                if ( (LA38_4==24) ) {
                    alt38=6;
                }
                else if ( (LA38_4==EOF||LA38_4==RULE_ID||(LA38_4>=14 && LA38_4<=15)||(LA38_4>=20 && LA38_4<=22)||LA38_4==25||LA38_4==27||LA38_4==31||(LA38_4>=33 && LA38_4<=41)||LA38_4==46||(LA38_4>=49 && LA38_4<=50)||(LA38_4>=53 && LA38_4<=65)||LA38_4==67) ) {
                    alt38=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalVaselina.g:2365:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    {
                    // InternalVaselina.g:2365:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    // InternalVaselina.g:2366:4: () ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // InternalVaselina.g:2366:4: ()
                    // InternalVaselina.g:2367:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalAccess().getStringRefAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVaselina.g:2373:4: ( (lv_value_1_0= RULE_STRING ) )
                    // InternalVaselina.g:2374:5: (lv_value_1_0= RULE_STRING )
                    {
                    // InternalVaselina.g:2374:5: (lv_value_1_0= RULE_STRING )
                    // InternalVaselina.g:2375:6: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getTerminalAccess().getValueSTRINGTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVaselina.g:2393:3: ( () ( (lv_value_3_0= RULE_NUM ) ) )
                    {
                    // InternalVaselina.g:2393:3: ( () ( (lv_value_3_0= RULE_NUM ) ) )
                    // InternalVaselina.g:2394:4: () ( (lv_value_3_0= RULE_NUM ) )
                    {
                    // InternalVaselina.g:2394:4: ()
                    // InternalVaselina.g:2395:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalAccess().getNumRefAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVaselina.g:2401:4: ( (lv_value_3_0= RULE_NUM ) )
                    // InternalVaselina.g:2402:5: (lv_value_3_0= RULE_NUM )
                    {
                    // InternalVaselina.g:2402:5: (lv_value_3_0= RULE_NUM )
                    // InternalVaselina.g:2403:6: lv_value_3_0= RULE_NUM
                    {
                    lv_value_3_0=(Token)match(input,RULE_NUM,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_3_0, grammarAccess.getTerminalAccess().getValueNUMTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_3_0,
                      							"org.xtext.example.mydsl.Vaselina.NUM");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalVaselina.g:2421:3: ( () ( (lv_value_5_0= ruleDOUBLE ) ) )
                    {
                    // InternalVaselina.g:2421:3: ( () ( (lv_value_5_0= ruleDOUBLE ) ) )
                    // InternalVaselina.g:2422:4: () ( (lv_value_5_0= ruleDOUBLE ) )
                    {
                    // InternalVaselina.g:2422:4: ()
                    // InternalVaselina.g:2423:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalAccess().getDoubleRefAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVaselina.g:2429:4: ( (lv_value_5_0= ruleDOUBLE ) )
                    // InternalVaselina.g:2430:5: (lv_value_5_0= ruleDOUBLE )
                    {
                    // InternalVaselina.g:2430:5: (lv_value_5_0= ruleDOUBLE )
                    // InternalVaselina.g:2431:6: lv_value_5_0= ruleDOUBLE
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalAccess().getValueDOUBLEParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_5_0=ruleDOUBLE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_5_0,
                      							"org.xtext.example.mydsl.Vaselina.DOUBLE");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalVaselina.g:2450:3: ( () ( ( (lv_varRef_7_1= 'true...' | lv_varRef_7_2= 'false...' ) ) ) )
                    {
                    // InternalVaselina.g:2450:3: ( () ( ( (lv_varRef_7_1= 'true...' | lv_varRef_7_2= 'false...' ) ) ) )
                    // InternalVaselina.g:2451:4: () ( ( (lv_varRef_7_1= 'true...' | lv_varRef_7_2= 'false...' ) ) )
                    {
                    // InternalVaselina.g:2451:4: ()
                    // InternalVaselina.g:2452:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalAccess().getBoolRefAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVaselina.g:2458:4: ( ( (lv_varRef_7_1= 'true...' | lv_varRef_7_2= 'false...' ) ) )
                    // InternalVaselina.g:2459:5: ( (lv_varRef_7_1= 'true...' | lv_varRef_7_2= 'false...' ) )
                    {
                    // InternalVaselina.g:2459:5: ( (lv_varRef_7_1= 'true...' | lv_varRef_7_2= 'false...' ) )
                    // InternalVaselina.g:2460:6: (lv_varRef_7_1= 'true...' | lv_varRef_7_2= 'false...' )
                    {
                    // InternalVaselina.g:2460:6: (lv_varRef_7_1= 'true...' | lv_varRef_7_2= 'false...' )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==69) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==70) ) {
                        alt36=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalVaselina.g:2461:7: lv_varRef_7_1= 'true...'
                            {
                            lv_varRef_7_1=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_varRef_7_1, grammarAccess.getTerminalAccess().getVarRefTrueKeyword_3_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTerminalRule());
                              							}
                              							setWithLastConsumed(current, "varRef", lv_varRef_7_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalVaselina.g:2472:7: lv_varRef_7_2= 'false...'
                            {
                            lv_varRef_7_2=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_varRef_7_2, grammarAccess.getTerminalAccess().getVarRefFalseKeyword_3_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTerminalRule());
                              							}
                              							setWithLastConsumed(current, "varRef", lv_varRef_7_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalVaselina.g:2487:3: ( () ( (otherlv_9= RULE_ID ) ) )
                    {
                    // InternalVaselina.g:2487:3: ( () ( (otherlv_9= RULE_ID ) ) )
                    // InternalVaselina.g:2488:4: () ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalVaselina.g:2488:4: ()
                    // InternalVaselina.g:2489:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalAccess().getVarRefAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVaselina.g:2495:4: ( (otherlv_9= RULE_ID ) )
                    // InternalVaselina.g:2496:5: (otherlv_9= RULE_ID )
                    {
                    // InternalVaselina.g:2496:5: (otherlv_9= RULE_ID )
                    // InternalVaselina.g:2497:6: otherlv_9= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalRule());
                      						}
                      					
                    }
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_9, grammarAccess.getTerminalAccess().getVarRefVarSymbolCrossReference_4_1_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalVaselina.g:2510:3: ( () ( (otherlv_11= RULE_ID ) ) ( (lv_dim_12_0= rulearrayDimension ) )+ )
                    {
                    // InternalVaselina.g:2510:3: ( () ( (otherlv_11= RULE_ID ) ) ( (lv_dim_12_0= rulearrayDimension ) )+ )
                    // InternalVaselina.g:2511:4: () ( (otherlv_11= RULE_ID ) ) ( (lv_dim_12_0= rulearrayDimension ) )+
                    {
                    // InternalVaselina.g:2511:4: ()
                    // InternalVaselina.g:2512:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalAccess().getArrayRefAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVaselina.g:2518:4: ( (otherlv_11= RULE_ID ) )
                    // InternalVaselina.g:2519:5: (otherlv_11= RULE_ID )
                    {
                    // InternalVaselina.g:2519:5: (otherlv_11= RULE_ID )
                    // InternalVaselina.g:2520:6: otherlv_11= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTerminalRule());
                      						}
                      					
                    }
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_11, grammarAccess.getTerminalAccess().getVarRefVarSymbolCrossReference_5_1_0());
                      					
                    }

                    }


                    }

                    // InternalVaselina.g:2531:4: ( (lv_dim_12_0= rulearrayDimension ) )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==24) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalVaselina.g:2532:5: (lv_dim_12_0= rulearrayDimension )
                    	    {
                    	    // InternalVaselina.g:2532:5: (lv_dim_12_0= rulearrayDimension )
                    	    // InternalVaselina.g:2533:6: lv_dim_12_0= rulearrayDimension
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getTerminalAccess().getDimArrayDimensionParserRuleCall_5_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_dim_12_0=rulearrayDimension();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getTerminalRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"dim",
                    	      							lv_dim_12_0,
                    	      							"org.xtext.example.mydsl.Vaselina.arrayDimension");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt37 >= 1 ) break loop37;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTerminal"

    // $ANTLR start synpred1_InternalVaselina
    public final void synpred1_InternalVaselina_fragment() throws RecognitionException {   
        // InternalVaselina.g:1356:5: ( '<-' )
        // InternalVaselina.g:1356:6: '<-'
        {
        match(input,14,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalVaselina

    // $ANTLR start synpred2_InternalVaselina
    public final void synpred2_InternalVaselina_fragment() throws RecognitionException {   
        // InternalVaselina.g:1391:4: ( '<-' )
        // InternalVaselina.g:1391:5: '<-'
        {
        match(input,14,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalVaselina

    // $ANTLR start synpred3_InternalVaselina
    public final void synpred3_InternalVaselina_fragment() throws RecognitionException {   
        // InternalVaselina.g:1490:4: ( '<-' )
        // InternalVaselina.g:1490:5: '<-'
        {
        match(input,14,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalVaselina

    // Delegated rules

    public final boolean synpred1_InternalVaselina() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalVaselina_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalVaselina() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalVaselina_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalVaselina() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalVaselina_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\1\27\10\uffff";
    static final String dfa_3s = "\1\62\1\32\10\uffff";
    static final String dfa_4s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\1";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\12\uffff\1\2\4\uffff\2\3\13\uffff\10\7\1\4\4\uffff\1\5\2\uffff\1\6\1\10",
            "\2\11\1\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "211:2: (this_varAssignment_0= rulevarAssignment | this_varReturn_1= rulevarReturn | this_varDeclared_2= rulevarDeclared | this_IfExpression_3= ruleIfExpression | this_DoWhileExpression_4= ruleDoWhileExpression | this_BrkStr_5= ruleBrkStr | this_AbstractMethodCall_6= ruleAbstractMethodCall | this_ReturnDeclaration_7= ruleReturnDeclaration )";
        }
    }
    static final String dfa_7s = "\26\uffff";
    static final String dfa_8s = "\1\uffff\1\23\24\uffff";
    static final String dfa_9s = "\1\16\1\4\24\uffff";
    static final String dfa_10s = "\1\16\1\62\24\uffff";
    static final String dfa_11s = "\2\uffff\23\2\1\1";
    static final String dfa_12s = "\1\uffff\1\0\24\uffff}>";
    static final String[] dfa_13s = {
            "\1\1",
            "\1\3\11\uffff\1\2\1\4\4\uffff\1\5\1\6\11\uffff\1\24\1\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\7\3\uffff\1\25\1\10\2\uffff\1\11\1\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1354:3: ( ( ( '<-' )=>otherlv_10= '<-' ) otherlv_11= 'no' otherlv_12= '->' ( (lv_else_13_0= ruleBodyStatement ) )* )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_1 = input.LA(1);

                         
                        int index21_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_1==14) && (synpred2_InternalVaselina())) {s = 2;}

                        else if ( (LA21_1==RULE_ID) && (synpred2_InternalVaselina())) {s = 3;}

                        else if ( (LA21_1==15) && (synpred2_InternalVaselina())) {s = 4;}

                        else if ( (LA21_1==20) && (synpred2_InternalVaselina())) {s = 5;}

                        else if ( (LA21_1==21) && (synpred2_InternalVaselina())) {s = 6;}

                        else if ( (LA21_1==41) && (synpred2_InternalVaselina())) {s = 7;}

                        else if ( (LA21_1==46) && (synpred2_InternalVaselina())) {s = 8;}

                        else if ( (LA21_1==49) && (synpred2_InternalVaselina())) {s = 9;}

                        else if ( (LA21_1==33) && (synpred2_InternalVaselina())) {s = 10;}

                        else if ( (LA21_1==34) && (synpred2_InternalVaselina())) {s = 11;}

                        else if ( (LA21_1==35) && (synpred2_InternalVaselina())) {s = 12;}

                        else if ( (LA21_1==36) && (synpred2_InternalVaselina())) {s = 13;}

                        else if ( (LA21_1==37) && (synpred2_InternalVaselina())) {s = 14;}

                        else if ( (LA21_1==38) && (synpred2_InternalVaselina())) {s = 15;}

                        else if ( (LA21_1==39) && (synpred2_InternalVaselina())) {s = 16;}

                        else if ( (LA21_1==40) && (synpred2_InternalVaselina())) {s = 17;}

                        else if ( (LA21_1==50) && (synpred2_InternalVaselina())) {s = 18;}

                        else if ( (LA21_1==EOF) && (synpred2_InternalVaselina())) {s = 19;}

                        else if ( (LA21_1==31) && (synpred2_InternalVaselina())) {s = 20;}

                        else if ( (LA21_1==45) && (synpred1_InternalVaselina())) {s = 21;}

                         
                        input.seek(index21_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010301000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000010001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000643FE1030D010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000001FE000000B0L,0x0000000000000074L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000001FE004000B0L,0x0000000000000074L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000400F0000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000643FE90309010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x1E00000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});

}