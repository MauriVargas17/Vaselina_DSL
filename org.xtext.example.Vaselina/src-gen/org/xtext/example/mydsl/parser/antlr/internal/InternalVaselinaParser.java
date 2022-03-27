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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUM", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Vaselinator'", "'->'", "'<-'", "'keep'", "'numb'", "'strange'", "'bull'", "'dribble'", "'box'", "':'", "'holds'", "'['", "']'", "'using'", "','", "'braze'", "'with'", "'air'", "'and'", "'vaselina'", "'printstr'", "'strjoin'", "'strsplit'", "'numtostr'", "'getargs'", "'is'", "'this'", "'true?'", "'yes'", "'no'", "'as'", "'long'", "'repeat'", "'break'", "'type'", "'keeping'", "'.'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'!'", "'true...'", "'false...'"
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
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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

                if ( (LA1_0==20) ) {
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

                if ( (LA2_0==27) ) {
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

                if ( (LA3_0==RULE_ID||LA3_0==15||LA3_0==20||(LA3_0>=32 && LA3_0<=37)||LA3_0==42||(LA3_0>=45 && LA3_0<=46)) ) {
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
    // InternalVaselina.g:378:1: rulevarDeclared returns [EObject current=null] : ( () ( (lv_scope_1_0= 'box' ) ) ( ( (lv_name_2_0= RULE_ID ) ) | ( ( (lv_name_3_0= RULE_ID ) ) ( (lv_dim_4_0= rulearrayDimension ) )+ ) ) otherlv_5= ':' ( (lv_type_6_0= rulevarTypeLiteral ) ) ) ;
    public final EObject rulevarDeclared() throws RecognitionException {
        EObject current = null;

        Token lv_scope_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_5=null;
        EObject lv_dim_4_0 = null;

        AntlrDatatypeRuleToken lv_type_6_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:384:2: ( ( () ( (lv_scope_1_0= 'box' ) ) ( ( (lv_name_2_0= RULE_ID ) ) | ( ( (lv_name_3_0= RULE_ID ) ) ( (lv_dim_4_0= rulearrayDimension ) )+ ) ) otherlv_5= ':' ( (lv_type_6_0= rulevarTypeLiteral ) ) ) )
            // InternalVaselina.g:385:2: ( () ( (lv_scope_1_0= 'box' ) ) ( ( (lv_name_2_0= RULE_ID ) ) | ( ( (lv_name_3_0= RULE_ID ) ) ( (lv_dim_4_0= rulearrayDimension ) )+ ) ) otherlv_5= ':' ( (lv_type_6_0= rulevarTypeLiteral ) ) )
            {
            // InternalVaselina.g:385:2: ( () ( (lv_scope_1_0= 'box' ) ) ( ( (lv_name_2_0= RULE_ID ) ) | ( ( (lv_name_3_0= RULE_ID ) ) ( (lv_dim_4_0= rulearrayDimension ) )+ ) ) otherlv_5= ':' ( (lv_type_6_0= rulevarTypeLiteral ) ) )
            // InternalVaselina.g:386:3: () ( (lv_scope_1_0= 'box' ) ) ( ( (lv_name_2_0= RULE_ID ) ) | ( ( (lv_name_3_0= RULE_ID ) ) ( (lv_dim_4_0= rulearrayDimension ) )+ ) ) otherlv_5= ':' ( (lv_type_6_0= rulevarTypeLiteral ) )
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

            // InternalVaselina.g:393:3: ( (lv_scope_1_0= 'box' ) )
            // InternalVaselina.g:394:4: (lv_scope_1_0= 'box' )
            {
            // InternalVaselina.g:394:4: (lv_scope_1_0= 'box' )
            // InternalVaselina.g:395:5: lv_scope_1_0= 'box'
            {
            lv_scope_1_0=(Token)match(input,20,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_scope_1_0, grammarAccess.getVarDeclaredAccess().getScopeBoxKeyword_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVarDeclaredRule());
              					}
              					setWithLastConsumed(current, "scope", lv_scope_1_0, "box");
              				
            }

            }


            }

            // InternalVaselina.g:407:3: ( ( (lv_name_2_0= RULE_ID ) ) | ( ( (lv_name_3_0= RULE_ID ) ) ( (lv_dim_4_0= rulearrayDimension ) )+ ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==21) ) {
                    alt7=1;
                }
                else if ( (LA7_1==23) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalVaselina.g:408:4: ( (lv_name_2_0= RULE_ID ) )
                    {
                    // InternalVaselina.g:408:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalVaselina.g:409:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalVaselina.g:409:5: (lv_name_2_0= RULE_ID )
                    // InternalVaselina.g:410:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_2_0, grammarAccess.getVarDeclaredAccess().getNameIDTerminalRuleCall_2_0_0());
                      					
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
                    break;
                case 2 :
                    // InternalVaselina.g:427:4: ( ( (lv_name_3_0= RULE_ID ) ) ( (lv_dim_4_0= rulearrayDimension ) )+ )
                    {
                    // InternalVaselina.g:427:4: ( ( (lv_name_3_0= RULE_ID ) ) ( (lv_dim_4_0= rulearrayDimension ) )+ )
                    // InternalVaselina.g:428:5: ( (lv_name_3_0= RULE_ID ) ) ( (lv_dim_4_0= rulearrayDimension ) )+
                    {
                    // InternalVaselina.g:428:5: ( (lv_name_3_0= RULE_ID ) )
                    // InternalVaselina.g:429:6: (lv_name_3_0= RULE_ID )
                    {
                    // InternalVaselina.g:429:6: (lv_name_3_0= RULE_ID )
                    // InternalVaselina.g:430:7: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_name_3_0, grammarAccess.getVarDeclaredAccess().getNameIDTerminalRuleCall_2_1_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getVarDeclaredRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"name",
                      								lv_name_3_0,
                      								"org.eclipse.xtext.common.Terminals.ID");
                      						
                    }

                    }


                    }

                    // InternalVaselina.g:446:5: ( (lv_dim_4_0= rulearrayDimension ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==23) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalVaselina.g:447:6: (lv_dim_4_0= rulearrayDimension )
                    	    {
                    	    // InternalVaselina.g:447:6: (lv_dim_4_0= rulearrayDimension )
                    	    // InternalVaselina.g:448:7: lv_dim_4_0= rulearrayDimension
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getVarDeclaredAccess().getDimArrayDimensionParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_11);
                    	    lv_dim_4_0=rulearrayDimension();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getVarDeclaredRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"dim",
                    	      								lv_dim_4_0,
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

            otherlv_5=(Token)match(input,21,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getVarDeclaredAccess().getColonKeyword_3());
              		
            }
            // InternalVaselina.g:471:3: ( (lv_type_6_0= rulevarTypeLiteral ) )
            // InternalVaselina.g:472:4: (lv_type_6_0= rulevarTypeLiteral )
            {
            // InternalVaselina.g:472:4: (lv_type_6_0= rulevarTypeLiteral )
            // InternalVaselina.g:473:5: lv_type_6_0= rulevarTypeLiteral
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarDeclaredAccess().getTypeVarTypeLiteralParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_6_0=rulevarTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarDeclaredRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_6_0,
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
    // InternalVaselina.g:494:1: entryRulevarAssignment returns [EObject current=null] : iv_rulevarAssignment= rulevarAssignment EOF ;
    public final EObject entryRulevarAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevarAssignment = null;


        try {
            // InternalVaselina.g:494:54: (iv_rulevarAssignment= rulevarAssignment EOF )
            // InternalVaselina.g:495:2: iv_rulevarAssignment= rulevarAssignment EOF
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
    // InternalVaselina.g:501:1: rulevarAssignment returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= 'holds' ( (lv_expr_2_0= rulevarExpression ) ) ) ;
    public final EObject rulevarAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:507:2: ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= 'holds' ( (lv_expr_2_0= rulevarExpression ) ) ) )
            // InternalVaselina.g:508:2: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= 'holds' ( (lv_expr_2_0= rulevarExpression ) ) )
            {
            // InternalVaselina.g:508:2: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= 'holds' ( (lv_expr_2_0= rulevarExpression ) ) )
            // InternalVaselina.g:509:3: ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= 'holds' ( (lv_expr_2_0= rulevarExpression ) )
            {
            // InternalVaselina.g:509:3: ( (lv_variable_0_0= ruleVariable ) )
            // InternalVaselina.g:510:4: (lv_variable_0_0= ruleVariable )
            {
            // InternalVaselina.g:510:4: (lv_variable_0_0= ruleVariable )
            // InternalVaselina.g:511:5: lv_variable_0_0= ruleVariable
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

            otherlv_1=(Token)match(input,22,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVarAssignmentAccess().getHoldsKeyword_1());
              		
            }
            // InternalVaselina.g:532:3: ( (lv_expr_2_0= rulevarExpression ) )
            // InternalVaselina.g:533:4: (lv_expr_2_0= rulevarExpression )
            {
            // InternalVaselina.g:533:4: (lv_expr_2_0= rulevarExpression )
            // InternalVaselina.g:534:5: lv_expr_2_0= rulevarExpression
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
    // InternalVaselina.g:555:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalVaselina.g:555:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalVaselina.g:556:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalVaselina.g:562:1: ruleVariable returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ( (lv_dim_2_0= rulearrayDimension ) )+ ) | ( () ( (otherlv_4= RULE_ID ) ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_dim_2_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:568:2: ( ( ( () ( (otherlv_1= RULE_ID ) ) ( (lv_dim_2_0= rulearrayDimension ) )+ ) | ( () ( (otherlv_4= RULE_ID ) ) ) ) )
            // InternalVaselina.g:569:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( (lv_dim_2_0= rulearrayDimension ) )+ ) | ( () ( (otherlv_4= RULE_ID ) ) ) )
            {
            // InternalVaselina.g:569:2: ( ( () ( (otherlv_1= RULE_ID ) ) ( (lv_dim_2_0= rulearrayDimension ) )+ ) | ( () ( (otherlv_4= RULE_ID ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EOF||LA9_1==22) ) {
                    alt9=2;
                }
                else if ( (LA9_1==23) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalVaselina.g:570:3: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_dim_2_0= rulearrayDimension ) )+ )
                    {
                    // InternalVaselina.g:570:3: ( () ( (otherlv_1= RULE_ID ) ) ( (lv_dim_2_0= rulearrayDimension ) )+ )
                    // InternalVaselina.g:571:4: () ( (otherlv_1= RULE_ID ) ) ( (lv_dim_2_0= rulearrayDimension ) )+
                    {
                    // InternalVaselina.g:571:4: ()
                    // InternalVaselina.g:572:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getVariableAccess().getArrayRefsAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVaselina.g:578:4: ( (otherlv_1= RULE_ID ) )
                    // InternalVaselina.g:579:5: (otherlv_1= RULE_ID )
                    {
                    // InternalVaselina.g:579:5: (otherlv_1= RULE_ID )
                    // InternalVaselina.g:580:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVariableRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getVarRefsVarSymbolCrossReference_0_1_0());
                      					
                    }

                    }


                    }

                    // InternalVaselina.g:591:4: ( (lv_dim_2_0= rulearrayDimension ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==23) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalVaselina.g:592:5: (lv_dim_2_0= rulearrayDimension )
                    	    {
                    	    // InternalVaselina.g:592:5: (lv_dim_2_0= rulearrayDimension )
                    	    // InternalVaselina.g:593:6: lv_dim_2_0= rulearrayDimension
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getVariableAccess().getDimArrayDimensionParserRuleCall_0_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_dim_2_0=rulearrayDimension();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getVariableRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"dim",
                    	      							lv_dim_2_0,
                    	      							"org.xtext.example.mydsl.Vaselina.arrayDimension");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalVaselina.g:612:3: ( () ( (otherlv_4= RULE_ID ) ) )
                    {
                    // InternalVaselina.g:612:3: ( () ( (otherlv_4= RULE_ID ) ) )
                    // InternalVaselina.g:613:4: () ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalVaselina.g:613:4: ()
                    // InternalVaselina.g:614:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getVariableAccess().getVarRefsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVaselina.g:620:4: ( (otherlv_4= RULE_ID ) )
                    // InternalVaselina.g:621:5: (otherlv_4= RULE_ID )
                    {
                    // InternalVaselina.g:621:5: (otherlv_4= RULE_ID )
                    // InternalVaselina.g:622:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getVariableRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getVarRefsVarSymbolCrossReference_1_1_0());
                      					
                    }

                    }


                    }


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


    // $ANTLR start "entryRulearrayDimension"
    // InternalVaselina.g:638:1: entryRulearrayDimension returns [EObject current=null] : iv_rulearrayDimension= rulearrayDimension EOF ;
    public final EObject entryRulearrayDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_rulearrayDimension = null;


        try {
            // InternalVaselina.g:638:55: (iv_rulearrayDimension= rulearrayDimension EOF )
            // InternalVaselina.g:639:2: iv_rulearrayDimension= rulearrayDimension EOF
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
    // InternalVaselina.g:645:1: rulearrayDimension returns [EObject current=null] : ( () otherlv_1= '[' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_size_3_0= RULE_NUM ) ) ) otherlv_4= ']' ) ;
    public final EObject rulearrayDimension() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_size_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalVaselina.g:651:2: ( ( () otherlv_1= '[' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_size_3_0= RULE_NUM ) ) ) otherlv_4= ']' ) )
            // InternalVaselina.g:652:2: ( () otherlv_1= '[' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_size_3_0= RULE_NUM ) ) ) otherlv_4= ']' )
            {
            // InternalVaselina.g:652:2: ( () otherlv_1= '[' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_size_3_0= RULE_NUM ) ) ) otherlv_4= ']' )
            // InternalVaselina.g:653:3: () otherlv_1= '[' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_size_3_0= RULE_NUM ) ) ) otherlv_4= ']'
            {
            // InternalVaselina.g:653:3: ()
            // InternalVaselina.g:654:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayDimensionAccess().getArrayDimensionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArrayDimensionAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalVaselina.g:664:3: ( ( (otherlv_2= RULE_ID ) ) | ( (lv_size_3_0= RULE_NUM ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_NUM) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalVaselina.g:665:4: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalVaselina.g:665:4: ( (otherlv_2= RULE_ID ) )
                    // InternalVaselina.g:666:5: (otherlv_2= RULE_ID )
                    {
                    // InternalVaselina.g:666:5: (otherlv_2= RULE_ID )
                    // InternalVaselina.g:667:6: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getArrayDimensionRule());
                      						}
                      					
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getArrayDimensionAccess().getIndexVarSymbolCrossReference_2_0_0());
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVaselina.g:679:4: ( (lv_size_3_0= RULE_NUM ) )
                    {
                    // InternalVaselina.g:679:4: ( (lv_size_3_0= RULE_NUM ) )
                    // InternalVaselina.g:680:5: (lv_size_3_0= RULE_NUM )
                    {
                    // InternalVaselina.g:680:5: (lv_size_3_0= RULE_NUM )
                    // InternalVaselina.g:681:6: lv_size_3_0= RULE_NUM
                    {
                    lv_size_3_0=(Token)match(input,RULE_NUM,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_size_3_0, grammarAccess.getArrayDimensionAccess().getSizeNUMTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getArrayDimensionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"size",
                      							lv_size_3_0,
                      							"org.xtext.example.mydsl.Vaselina.NUM");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getArrayDimensionAccess().getRightSquareBracketKeyword_3());
              		
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
    // InternalVaselina.g:706:1: entryRuleFuncCall returns [EObject current=null] : iv_ruleFuncCall= ruleFuncCall EOF ;
    public final EObject entryRuleFuncCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncCall = null;


        try {
            // InternalVaselina.g:706:49: (iv_ruleFuncCall= ruleFuncCall EOF )
            // InternalVaselina.g:707:2: iv_ruleFuncCall= ruleFuncCall EOF
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
    // InternalVaselina.g:713:1: ruleFuncCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'using' otherlv_3= ':' ( ( (lv_args_4_0= rulevarExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )* )? otherlv_7= ':' ) ;
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
            // InternalVaselina.g:719:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'using' otherlv_3= ':' ( ( (lv_args_4_0= rulevarExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )* )? otherlv_7= ':' ) )
            // InternalVaselina.g:720:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'using' otherlv_3= ':' ( ( (lv_args_4_0= rulevarExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )* )? otherlv_7= ':' )
            {
            // InternalVaselina.g:720:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'using' otherlv_3= ':' ( ( (lv_args_4_0= rulevarExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )* )? otherlv_7= ':' )
            // InternalVaselina.g:721:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= 'using' otherlv_3= ':' ( ( (lv_args_4_0= rulevarExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )* )? otherlv_7= ':'
            {
            // InternalVaselina.g:721:3: ()
            // InternalVaselina.g:722:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFuncCallAccess().getFuncCallAction_0(),
              					current);
              			
            }

            }

            // InternalVaselina.g:728:3: ( (otherlv_1= RULE_ID ) )
            // InternalVaselina.g:729:4: (otherlv_1= RULE_ID )
            {
            // InternalVaselina.g:729:4: (otherlv_1= RULE_ID )
            // InternalVaselina.g:730:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFuncCallRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getFuncCallAccess().getFuncFuncDefinitionCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFuncCallAccess().getUsingKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,21,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getFuncCallAccess().getColonKeyword_3());
              		
            }
            // InternalVaselina.g:749:3: ( ( (lv_args_4_0= rulevarExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_NUM)||LA12_0==RULE_STRING||(LA12_0>=32 && LA12_0<=36)||LA12_0==62||(LA12_0>=64 && LA12_0<=66)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalVaselina.g:750:4: ( (lv_args_4_0= rulevarExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )*
                    {
                    // InternalVaselina.g:750:4: ( (lv_args_4_0= rulevarExpression ) )
                    // InternalVaselina.g:751:5: (lv_args_4_0= rulevarExpression )
                    {
                    // InternalVaselina.g:751:5: (lv_args_4_0= rulevarExpression )
                    // InternalVaselina.g:752:6: lv_args_4_0= rulevarExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFuncCallAccess().getArgsVarExpressionParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
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

                    // InternalVaselina.g:769:4: (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==26) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalVaselina.g:770:5: otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,26,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getFuncCallAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalVaselina.g:774:5: ( (lv_args_6_0= rulevarExpression ) )
                    	    // InternalVaselina.g:775:6: (lv_args_6_0= rulevarExpression )
                    	    {
                    	    // InternalVaselina.g:775:6: (lv_args_6_0= rulevarExpression )
                    	    // InternalVaselina.g:776:7: lv_args_6_0= rulevarExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFuncCallAccess().getArgsVarExpressionParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_19);
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
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalVaselina.g:803:1: entryRuleFuncParameter returns [EObject current=null] : iv_ruleFuncParameter= ruleFuncParameter EOF ;
    public final EObject entryRuleFuncParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncParameter = null;


        try {
            // InternalVaselina.g:803:54: (iv_ruleFuncParameter= ruleFuncParameter EOF )
            // InternalVaselina.g:804:2: iv_ruleFuncParameter= ruleFuncParameter EOF
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
    // InternalVaselina.g:810:1: ruleFuncParameter returns [EObject current=null] : this_FuncTypedDeclaration_0= ruleFuncTypedDeclaration[$current] ;
    public final EObject ruleFuncParameter() throws RecognitionException {
        EObject current = null;

        EObject this_FuncTypedDeclaration_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:816:2: (this_FuncTypedDeclaration_0= ruleFuncTypedDeclaration[$current] )
            // InternalVaselina.g:817:2: this_FuncTypedDeclaration_0= ruleFuncTypedDeclaration[$current]
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
    // InternalVaselina.g:831:1: entryRuleFuncDefinition returns [EObject current=null] : iv_ruleFuncDefinition= ruleFuncDefinition EOF ;
    public final EObject entryRuleFuncDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncDefinition = null;


        try {
            // InternalVaselina.g:831:55: (iv_ruleFuncDefinition= ruleFuncDefinition EOF )
            // InternalVaselina.g:832:2: iv_ruleFuncDefinition= ruleFuncDefinition EOF
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
    // InternalVaselina.g:838:1: ruleFuncDefinition returns [EObject current=null] : (otherlv_0= 'braze' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' ( ( ( (lv_args_3_0= ruleFuncParameter ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFuncParameter ) ) )* ) | otherlv_6= 'air' ) otherlv_7= '->' ( (lv_body_8_0= ruleBodyStatement ) )* otherlv_9= 'and' otherlv_10= 'vaselina' ) ;
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
            // InternalVaselina.g:844:2: ( (otherlv_0= 'braze' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' ( ( ( (lv_args_3_0= ruleFuncParameter ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFuncParameter ) ) )* ) | otherlv_6= 'air' ) otherlv_7= '->' ( (lv_body_8_0= ruleBodyStatement ) )* otherlv_9= 'and' otherlv_10= 'vaselina' ) )
            // InternalVaselina.g:845:2: (otherlv_0= 'braze' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' ( ( ( (lv_args_3_0= ruleFuncParameter ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFuncParameter ) ) )* ) | otherlv_6= 'air' ) otherlv_7= '->' ( (lv_body_8_0= ruleBodyStatement ) )* otherlv_9= 'and' otherlv_10= 'vaselina' )
            {
            // InternalVaselina.g:845:2: (otherlv_0= 'braze' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' ( ( ( (lv_args_3_0= ruleFuncParameter ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFuncParameter ) ) )* ) | otherlv_6= 'air' ) otherlv_7= '->' ( (lv_body_8_0= ruleBodyStatement ) )* otherlv_9= 'and' otherlv_10= 'vaselina' )
            // InternalVaselina.g:846:3: otherlv_0= 'braze' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' ( ( ( (lv_args_3_0= ruleFuncParameter ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFuncParameter ) ) )* ) | otherlv_6= 'air' ) otherlv_7= '->' ( (lv_body_8_0= ruleBodyStatement ) )* otherlv_9= 'and' otherlv_10= 'vaselina'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFuncDefinitionAccess().getBrazeKeyword_0());
              		
            }
            // InternalVaselina.g:850:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVaselina.g:851:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVaselina.g:851:4: (lv_name_1_0= RULE_ID )
            // InternalVaselina.g:852:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,28,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFuncDefinitionAccess().getWithKeyword_2());
              		
            }
            // InternalVaselina.g:872:3: ( ( ( (lv_args_3_0= ruleFuncParameter ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFuncParameter ) ) )* ) | otherlv_6= 'air' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=16 && LA14_0<=19)) ) {
                alt14=1;
            }
            else if ( (LA14_0==29) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalVaselina.g:873:4: ( ( (lv_args_3_0= ruleFuncParameter ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFuncParameter ) ) )* )
                    {
                    // InternalVaselina.g:873:4: ( ( (lv_args_3_0= ruleFuncParameter ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFuncParameter ) ) )* )
                    // InternalVaselina.g:874:5: ( (lv_args_3_0= ruleFuncParameter ) ) (otherlv_4= ',' ( (lv_args_5_0= ruleFuncParameter ) ) )*
                    {
                    // InternalVaselina.g:874:5: ( (lv_args_3_0= ruleFuncParameter ) )
                    // InternalVaselina.g:875:6: (lv_args_3_0= ruleFuncParameter )
                    {
                    // InternalVaselina.g:875:6: (lv_args_3_0= ruleFuncParameter )
                    // InternalVaselina.g:876:7: lv_args_3_0= ruleFuncParameter
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getFuncDefinitionAccess().getArgsFuncParameterParserRuleCall_3_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_22);
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

                    // InternalVaselina.g:893:5: (otherlv_4= ',' ( (lv_args_5_0= ruleFuncParameter ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==26) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalVaselina.g:894:6: otherlv_4= ',' ( (lv_args_5_0= ruleFuncParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,26,FOLLOW_12); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getFuncDefinitionAccess().getCommaKeyword_3_0_1_0());
                    	      					
                    	    }
                    	    // InternalVaselina.g:898:6: ( (lv_args_5_0= ruleFuncParameter ) )
                    	    // InternalVaselina.g:899:7: (lv_args_5_0= ruleFuncParameter )
                    	    {
                    	    // InternalVaselina.g:899:7: (lv_args_5_0= ruleFuncParameter )
                    	    // InternalVaselina.g:900:8: lv_args_5_0= ruleFuncParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getFuncDefinitionAccess().getArgsFuncParameterParserRuleCall_3_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_22);
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
                    	    break loop13;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalVaselina.g:920:4: otherlv_6= 'air'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getFuncDefinitionAccess().getAirKeyword_3_1());
                      			
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getFuncDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_4());
              		
            }
            // InternalVaselina.g:929:3: ( (lv_body_8_0= ruleBodyStatement ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==15||LA15_0==20||(LA15_0>=32 && LA15_0<=37)||LA15_0==42||(LA15_0>=45 && LA15_0<=46)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalVaselina.g:930:4: (lv_body_8_0= ruleBodyStatement )
            	    {
            	    // InternalVaselina.g:930:4: (lv_body_8_0= ruleBodyStatement )
            	    // InternalVaselina.g:931:5: lv_body_8_0= ruleBodyStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFuncDefinitionAccess().getBodyBodyStatementParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_23);
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
            	    break loop15;
                }
            } while (true);

            otherlv_9=(Token)match(input,30,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getFuncDefinitionAccess().getAndKeyword_6());
              		
            }
            otherlv_10=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
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
    // InternalVaselina.g:961:1: ruleFuncTypedDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_type_0_0= rulevarTypeLiteral ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFuncTypedDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:967:2: ( ( ( (lv_type_0_0= rulevarTypeLiteral ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalVaselina.g:968:2: ( ( (lv_type_0_0= rulevarTypeLiteral ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalVaselina.g:968:2: ( ( (lv_type_0_0= rulevarTypeLiteral ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalVaselina.g:969:3: ( (lv_type_0_0= rulevarTypeLiteral ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalVaselina.g:969:3: ( (lv_type_0_0= rulevarTypeLiteral ) )
            // InternalVaselina.g:970:4: (lv_type_0_0= rulevarTypeLiteral )
            {
            // InternalVaselina.g:970:4: (lv_type_0_0= rulevarTypeLiteral )
            // InternalVaselina.g:971:5: lv_type_0_0= rulevarTypeLiteral
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

            // InternalVaselina.g:988:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalVaselina.g:989:4: (lv_name_1_0= RULE_ID )
            {
            // InternalVaselina.g:989:4: (lv_name_1_0= RULE_ID )
            // InternalVaselina.g:990:5: lv_name_1_0= RULE_ID
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
    // InternalVaselina.g:1010:1: entryRuleAbstractMethodCall returns [EObject current=null] : iv_ruleAbstractMethodCall= ruleAbstractMethodCall EOF ;
    public final EObject entryRuleAbstractMethodCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMethodCall = null;


        try {
            // InternalVaselina.g:1010:59: (iv_ruleAbstractMethodCall= ruleAbstractMethodCall EOF )
            // InternalVaselina.g:1011:2: iv_ruleAbstractMethodCall= ruleAbstractMethodCall EOF
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
    // InternalVaselina.g:1017:1: ruleAbstractMethodCall returns [EObject current=null] : (this_FuncCall_0= ruleFuncCall | this_StdFunction_1= ruleStdFunction ) ;
    public final EObject ruleAbstractMethodCall() throws RecognitionException {
        EObject current = null;

        EObject this_FuncCall_0 = null;

        EObject this_StdFunction_1 = null;



        	enterRule();

        try {
            // InternalVaselina.g:1023:2: ( (this_FuncCall_0= ruleFuncCall | this_StdFunction_1= ruleStdFunction ) )
            // InternalVaselina.g:1024:2: (this_FuncCall_0= ruleFuncCall | this_StdFunction_1= ruleStdFunction )
            {
            // InternalVaselina.g:1024:2: (this_FuncCall_0= ruleFuncCall | this_StdFunction_1= ruleStdFunction )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=32 && LA16_0<=36)) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalVaselina.g:1025:3: this_FuncCall_0= ruleFuncCall
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
                    // InternalVaselina.g:1034:3: this_StdFunction_1= ruleStdFunction
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
    // InternalVaselina.g:1046:1: entryRuleStdfunctionList returns [String current=null] : iv_ruleStdfunctionList= ruleStdfunctionList EOF ;
    public final String entryRuleStdfunctionList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStdfunctionList = null;


        try {
            // InternalVaselina.g:1046:55: (iv_ruleStdfunctionList= ruleStdfunctionList EOF )
            // InternalVaselina.g:1047:2: iv_ruleStdfunctionList= ruleStdfunctionList EOF
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
    // InternalVaselina.g:1053:1: ruleStdfunctionList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'printstr' | kw= 'strjoin' | kw= 'strsplit' | kw= 'numtostr' | kw= 'getargs' ) ;
    public final AntlrDatatypeRuleToken ruleStdfunctionList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVaselina.g:1059:2: ( (kw= 'printstr' | kw= 'strjoin' | kw= 'strsplit' | kw= 'numtostr' | kw= 'getargs' ) )
            // InternalVaselina.g:1060:2: (kw= 'printstr' | kw= 'strjoin' | kw= 'strsplit' | kw= 'numtostr' | kw= 'getargs' )
            {
            // InternalVaselina.g:1060:2: (kw= 'printstr' | kw= 'strjoin' | kw= 'strsplit' | kw= 'numtostr' | kw= 'getargs' )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt17=1;
                }
                break;
            case 33:
                {
                alt17=2;
                }
                break;
            case 34:
                {
                alt17=3;
                }
                break;
            case 35:
                {
                alt17=4;
                }
                break;
            case 36:
                {
                alt17=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalVaselina.g:1061:3: kw= 'printstr'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getStdfunctionListAccess().getPrintstrKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalVaselina.g:1067:3: kw= 'strjoin'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getStdfunctionListAccess().getStrjoinKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalVaselina.g:1073:3: kw= 'strsplit'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getStdfunctionListAccess().getStrsplitKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalVaselina.g:1079:3: kw= 'numtostr'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getStdfunctionListAccess().getNumtostrKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalVaselina.g:1085:3: kw= 'getargs'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getStdfunctionListAccess().getGetargsKeyword_4());
                      		
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
    // InternalVaselina.g:1094:1: entryRuleStdFunction returns [EObject current=null] : iv_ruleStdFunction= ruleStdFunction EOF ;
    public final EObject entryRuleStdFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStdFunction = null;


        try {
            // InternalVaselina.g:1094:52: (iv_ruleStdFunction= ruleStdFunction EOF )
            // InternalVaselina.g:1095:2: iv_ruleStdFunction= ruleStdFunction EOF
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
    // InternalVaselina.g:1101:1: ruleStdFunction returns [EObject current=null] : ( () ( (lv_name_1_0= ruleStdfunctionList ) ) otherlv_2= 'using' otherlv_3= ':' ( ( (lv_args_4_0= rulevarExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )* )? otherlv_7= ':' ) ;
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
            // InternalVaselina.g:1107:2: ( ( () ( (lv_name_1_0= ruleStdfunctionList ) ) otherlv_2= 'using' otherlv_3= ':' ( ( (lv_args_4_0= rulevarExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )* )? otherlv_7= ':' ) )
            // InternalVaselina.g:1108:2: ( () ( (lv_name_1_0= ruleStdfunctionList ) ) otherlv_2= 'using' otherlv_3= ':' ( ( (lv_args_4_0= rulevarExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )* )? otherlv_7= ':' )
            {
            // InternalVaselina.g:1108:2: ( () ( (lv_name_1_0= ruleStdfunctionList ) ) otherlv_2= 'using' otherlv_3= ':' ( ( (lv_args_4_0= rulevarExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )* )? otherlv_7= ':' )
            // InternalVaselina.g:1109:3: () ( (lv_name_1_0= ruleStdfunctionList ) ) otherlv_2= 'using' otherlv_3= ':' ( ( (lv_args_4_0= rulevarExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )* )? otherlv_7= ':'
            {
            // InternalVaselina.g:1109:3: ()
            // InternalVaselina.g:1110:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getStdFunctionAccess().getStdFunctionAction_0(),
              					current);
              			
            }

            }

            // InternalVaselina.g:1116:3: ( (lv_name_1_0= ruleStdfunctionList ) )
            // InternalVaselina.g:1117:4: (lv_name_1_0= ruleStdfunctionList )
            {
            // InternalVaselina.g:1117:4: (lv_name_1_0= ruleStdfunctionList )
            // InternalVaselina.g:1118:5: lv_name_1_0= ruleStdfunctionList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStdFunctionAccess().getNameStdfunctionListParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_17);
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

            otherlv_2=(Token)match(input,25,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getStdFunctionAccess().getUsingKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,21,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getStdFunctionAccess().getColonKeyword_3());
              		
            }
            // InternalVaselina.g:1143:3: ( ( (lv_args_4_0= rulevarExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_NUM)||LA19_0==RULE_STRING||(LA19_0>=32 && LA19_0<=36)||LA19_0==62||(LA19_0>=64 && LA19_0<=66)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalVaselina.g:1144:4: ( (lv_args_4_0= rulevarExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )*
                    {
                    // InternalVaselina.g:1144:4: ( (lv_args_4_0= rulevarExpression ) )
                    // InternalVaselina.g:1145:5: (lv_args_4_0= rulevarExpression )
                    {
                    // InternalVaselina.g:1145:5: (lv_args_4_0= rulevarExpression )
                    // InternalVaselina.g:1146:6: lv_args_4_0= rulevarExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStdFunctionAccess().getArgsVarExpressionParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
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

                    // InternalVaselina.g:1163:4: (otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==26) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalVaselina.g:1164:5: otherlv_5= ',' ( (lv_args_6_0= rulevarExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,26,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getStdFunctionAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalVaselina.g:1168:5: ( (lv_args_6_0= rulevarExpression ) )
                    	    // InternalVaselina.g:1169:6: (lv_args_6_0= rulevarExpression )
                    	    {
                    	    // InternalVaselina.g:1169:6: (lv_args_6_0= rulevarExpression )
                    	    // InternalVaselina.g:1170:7: lv_args_6_0= rulevarExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getStdFunctionAccess().getArgsVarExpressionParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_19);
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
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
    // InternalVaselina.g:1197:1: entryRuleIfExpression returns [EObject current=null] : iv_ruleIfExpression= ruleIfExpression EOF ;
    public final EObject entryRuleIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpression = null;


        try {
            // InternalVaselina.g:1197:53: (iv_ruleIfExpression= ruleIfExpression EOF )
            // InternalVaselina.g:1198:2: iv_ruleIfExpression= ruleIfExpression EOF
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
    // InternalVaselina.g:1204:1: ruleIfExpression returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'this' otherlv_3= 'true?' otherlv_4= ':' ( (lv_ifconditon_5_0= rulevarExpression ) ) otherlv_6= ':' otherlv_7= 'yes' otherlv_8= '->' ( (lv_then_9_0= ruleBodyStatement ) )* ( ( ( '<-' )=>otherlv_10= '<-' ) otherlv_11= 'no' otherlv_12= '->' ( (lv_else_13_0= ruleBodyStatement ) )* )? ( ( '<-' )=>otherlv_14= '<-' ) ) ;
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
            // InternalVaselina.g:1210:2: ( ( () otherlv_1= 'is' otherlv_2= 'this' otherlv_3= 'true?' otherlv_4= ':' ( (lv_ifconditon_5_0= rulevarExpression ) ) otherlv_6= ':' otherlv_7= 'yes' otherlv_8= '->' ( (lv_then_9_0= ruleBodyStatement ) )* ( ( ( '<-' )=>otherlv_10= '<-' ) otherlv_11= 'no' otherlv_12= '->' ( (lv_else_13_0= ruleBodyStatement ) )* )? ( ( '<-' )=>otherlv_14= '<-' ) ) )
            // InternalVaselina.g:1211:2: ( () otherlv_1= 'is' otherlv_2= 'this' otherlv_3= 'true?' otherlv_4= ':' ( (lv_ifconditon_5_0= rulevarExpression ) ) otherlv_6= ':' otherlv_7= 'yes' otherlv_8= '->' ( (lv_then_9_0= ruleBodyStatement ) )* ( ( ( '<-' )=>otherlv_10= '<-' ) otherlv_11= 'no' otherlv_12= '->' ( (lv_else_13_0= ruleBodyStatement ) )* )? ( ( '<-' )=>otherlv_14= '<-' ) )
            {
            // InternalVaselina.g:1211:2: ( () otherlv_1= 'is' otherlv_2= 'this' otherlv_3= 'true?' otherlv_4= ':' ( (lv_ifconditon_5_0= rulevarExpression ) ) otherlv_6= ':' otherlv_7= 'yes' otherlv_8= '->' ( (lv_then_9_0= ruleBodyStatement ) )* ( ( ( '<-' )=>otherlv_10= '<-' ) otherlv_11= 'no' otherlv_12= '->' ( (lv_else_13_0= ruleBodyStatement ) )* )? ( ( '<-' )=>otherlv_14= '<-' ) )
            // InternalVaselina.g:1212:3: () otherlv_1= 'is' otherlv_2= 'this' otherlv_3= 'true?' otherlv_4= ':' ( (lv_ifconditon_5_0= rulevarExpression ) ) otherlv_6= ':' otherlv_7= 'yes' otherlv_8= '->' ( (lv_then_9_0= ruleBodyStatement ) )* ( ( ( '<-' )=>otherlv_10= '<-' ) otherlv_11= 'no' otherlv_12= '->' ( (lv_else_13_0= ruleBodyStatement ) )* )? ( ( '<-' )=>otherlv_14= '<-' )
            {
            // InternalVaselina.g:1212:3: ()
            // InternalVaselina.g:1213:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIfExpressionAccess().getIfExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfExpressionAccess().getIsKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,38,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfExpressionAccess().getThisKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,39,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getIfExpressionAccess().getTrueKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,21,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getIfExpressionAccess().getColonKeyword_4());
              		
            }
            // InternalVaselina.g:1235:3: ( (lv_ifconditon_5_0= rulevarExpression ) )
            // InternalVaselina.g:1236:4: (lv_ifconditon_5_0= rulevarExpression )
            {
            // InternalVaselina.g:1236:4: (lv_ifconditon_5_0= rulevarExpression )
            // InternalVaselina.g:1237:5: lv_ifconditon_5_0= rulevarExpression
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

            otherlv_6=(Token)match(input,21,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getIfExpressionAccess().getColonKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,40,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getIfExpressionAccess().getYesKeyword_7());
              		
            }
            otherlv_8=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getIfExpressionAccess().getHyphenMinusGreaterThanSignKeyword_8());
              		
            }
            // InternalVaselina.g:1266:3: ( (lv_then_9_0= ruleBodyStatement ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==15||LA20_0==20||(LA20_0>=32 && LA20_0<=37)||LA20_0==42||(LA20_0>=45 && LA20_0<=46)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalVaselina.g:1267:4: (lv_then_9_0= ruleBodyStatement )
            	    {
            	    // InternalVaselina.g:1267:4: (lv_then_9_0= ruleBodyStatement )
            	    // InternalVaselina.g:1268:5: lv_then_9_0= ruleBodyStatement
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
            	    break loop20;
                }
            } while (true);

            // InternalVaselina.g:1285:3: ( ( ( '<-' )=>otherlv_10= '<-' ) otherlv_11= 'no' otherlv_12= '->' ( (lv_else_13_0= ruleBodyStatement ) )* )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalVaselina.g:1286:4: ( ( '<-' )=>otherlv_10= '<-' ) otherlv_11= 'no' otherlv_12= '->' ( (lv_else_13_0= ruleBodyStatement ) )*
                    {
                    // InternalVaselina.g:1286:4: ( ( '<-' )=>otherlv_10= '<-' )
                    // InternalVaselina.g:1287:5: ( '<-' )=>otherlv_10= '<-'
                    {
                    otherlv_10=(Token)match(input,14,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_10, grammarAccess.getIfExpressionAccess().getLessThanSignHyphenMinusKeyword_10_0());
                      				
                    }

                    }

                    otherlv_11=(Token)match(input,41,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getIfExpressionAccess().getNoKeyword_10_1());
                      			
                    }
                    otherlv_12=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getIfExpressionAccess().getHyphenMinusGreaterThanSignKeyword_10_2());
                      			
                    }
                    // InternalVaselina.g:1301:4: ( (lv_else_13_0= ruleBodyStatement ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_ID||LA21_0==15||LA21_0==20||(LA21_0>=32 && LA21_0<=37)||LA21_0==42||(LA21_0>=45 && LA21_0<=46)) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalVaselina.g:1302:5: (lv_else_13_0= ruleBodyStatement )
                    	    {
                    	    // InternalVaselina.g:1302:5: (lv_else_13_0= ruleBodyStatement )
                    	    // InternalVaselina.g:1303:6: lv_else_13_0= ruleBodyStatement
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
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalVaselina.g:1321:3: ( ( '<-' )=>otherlv_14= '<-' )
            // InternalVaselina.g:1322:4: ( '<-' )=>otherlv_14= '<-'
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
    // InternalVaselina.g:1332:1: entryRuleDoWhileExpression returns [EObject current=null] : iv_ruleDoWhileExpression= ruleDoWhileExpression EOF ;
    public final EObject entryRuleDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoWhileExpression = null;


        try {
            // InternalVaselina.g:1332:58: (iv_ruleDoWhileExpression= ruleDoWhileExpression EOF )
            // InternalVaselina.g:1333:2: iv_ruleDoWhileExpression= ruleDoWhileExpression EOF
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
    // InternalVaselina.g:1339:1: ruleDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'as' otherlv_2= 'long' otherlv_3= 'as' otherlv_4= ':' ( (lv_loopConditon_5_0= rulevarExpression ) ) otherlv_6= ':' otherlv_7= 'repeat' otherlv_8= '->' ( (lv_body_9_0= ruleBodyStatement ) )* ( ( '<-' )=>otherlv_10= '<-' ) ) ;
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
            // InternalVaselina.g:1345:2: ( ( () otherlv_1= 'as' otherlv_2= 'long' otherlv_3= 'as' otherlv_4= ':' ( (lv_loopConditon_5_0= rulevarExpression ) ) otherlv_6= ':' otherlv_7= 'repeat' otherlv_8= '->' ( (lv_body_9_0= ruleBodyStatement ) )* ( ( '<-' )=>otherlv_10= '<-' ) ) )
            // InternalVaselina.g:1346:2: ( () otherlv_1= 'as' otherlv_2= 'long' otherlv_3= 'as' otherlv_4= ':' ( (lv_loopConditon_5_0= rulevarExpression ) ) otherlv_6= ':' otherlv_7= 'repeat' otherlv_8= '->' ( (lv_body_9_0= ruleBodyStatement ) )* ( ( '<-' )=>otherlv_10= '<-' ) )
            {
            // InternalVaselina.g:1346:2: ( () otherlv_1= 'as' otherlv_2= 'long' otherlv_3= 'as' otherlv_4= ':' ( (lv_loopConditon_5_0= rulevarExpression ) ) otherlv_6= ':' otherlv_7= 'repeat' otherlv_8= '->' ( (lv_body_9_0= ruleBodyStatement ) )* ( ( '<-' )=>otherlv_10= '<-' ) )
            // InternalVaselina.g:1347:3: () otherlv_1= 'as' otherlv_2= 'long' otherlv_3= 'as' otherlv_4= ':' ( (lv_loopConditon_5_0= rulevarExpression ) ) otherlv_6= ':' otherlv_7= 'repeat' otherlv_8= '->' ( (lv_body_9_0= ruleBodyStatement ) )* ( ( '<-' )=>otherlv_10= '<-' )
            {
            // InternalVaselina.g:1347:3: ()
            // InternalVaselina.g:1348:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDoWhileExpressionAccess().getDoWhileExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDoWhileExpressionAccess().getAsKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,43,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDoWhileExpressionAccess().getLongKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,42,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDoWhileExpressionAccess().getAsKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,21,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDoWhileExpressionAccess().getColonKeyword_4());
              		
            }
            // InternalVaselina.g:1370:3: ( (lv_loopConditon_5_0= rulevarExpression ) )
            // InternalVaselina.g:1371:4: (lv_loopConditon_5_0= rulevarExpression )
            {
            // InternalVaselina.g:1371:4: (lv_loopConditon_5_0= rulevarExpression )
            // InternalVaselina.g:1372:5: lv_loopConditon_5_0= rulevarExpression
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

            otherlv_6=(Token)match(input,21,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getDoWhileExpressionAccess().getColonKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,44,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDoWhileExpressionAccess().getRepeatKeyword_7());
              		
            }
            otherlv_8=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getDoWhileExpressionAccess().getHyphenMinusGreaterThanSignKeyword_8());
              		
            }
            // InternalVaselina.g:1401:3: ( (lv_body_9_0= ruleBodyStatement ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||LA23_0==15||LA23_0==20||(LA23_0>=32 && LA23_0<=37)||LA23_0==42||(LA23_0>=45 && LA23_0<=46)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalVaselina.g:1402:4: (lv_body_9_0= ruleBodyStatement )
            	    {
            	    // InternalVaselina.g:1402:4: (lv_body_9_0= ruleBodyStatement )
            	    // InternalVaselina.g:1403:5: lv_body_9_0= ruleBodyStatement
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
            	    break loop23;
                }
            } while (true);

            // InternalVaselina.g:1420:3: ( ( '<-' )=>otherlv_10= '<-' )
            // InternalVaselina.g:1421:4: ( '<-' )=>otherlv_10= '<-'
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
    // InternalVaselina.g:1431:1: entryRuleBrkStr returns [EObject current=null] : iv_ruleBrkStr= ruleBrkStr EOF ;
    public final EObject entryRuleBrkStr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrkStr = null;


        try {
            // InternalVaselina.g:1431:47: (iv_ruleBrkStr= ruleBrkStr EOF )
            // InternalVaselina.g:1432:2: iv_ruleBrkStr= ruleBrkStr EOF
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
    // InternalVaselina.g:1438:1: ruleBrkStr returns [EObject current=null] : ( () ( (lv_brk_1_0= 'break' ) ) ) ;
    public final EObject ruleBrkStr() throws RecognitionException {
        EObject current = null;

        Token lv_brk_1_0=null;


        	enterRule();

        try {
            // InternalVaselina.g:1444:2: ( ( () ( (lv_brk_1_0= 'break' ) ) ) )
            // InternalVaselina.g:1445:2: ( () ( (lv_brk_1_0= 'break' ) ) )
            {
            // InternalVaselina.g:1445:2: ( () ( (lv_brk_1_0= 'break' ) ) )
            // InternalVaselina.g:1446:3: () ( (lv_brk_1_0= 'break' ) )
            {
            // InternalVaselina.g:1446:3: ()
            // InternalVaselina.g:1447:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBrkStrAccess().getBrkStrAction_0(),
              					current);
              			
            }

            }

            // InternalVaselina.g:1453:3: ( (lv_brk_1_0= 'break' ) )
            // InternalVaselina.g:1454:4: (lv_brk_1_0= 'break' )
            {
            // InternalVaselina.g:1454:4: (lv_brk_1_0= 'break' )
            // InternalVaselina.g:1455:5: lv_brk_1_0= 'break'
            {
            lv_brk_1_0=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
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
    // InternalVaselina.g:1471:1: entryRuleReturnDeclaration returns [EObject current=null] : iv_ruleReturnDeclaration= ruleReturnDeclaration EOF ;
    public final EObject entryRuleReturnDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnDeclaration = null;


        try {
            // InternalVaselina.g:1471:58: (iv_ruleReturnDeclaration= ruleReturnDeclaration EOF )
            // InternalVaselina.g:1472:2: iv_ruleReturnDeclaration= ruleReturnDeclaration EOF
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
    // InternalVaselina.g:1478:1: ruleReturnDeclaration returns [EObject current=null] : (otherlv_0= 'type' otherlv_1= 'keeping' ( (lv_rtnType_2_0= rulevarTypeLiteral ) ) ) ;
    public final EObject ruleReturnDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_rtnType_2_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:1484:2: ( (otherlv_0= 'type' otherlv_1= 'keeping' ( (lv_rtnType_2_0= rulevarTypeLiteral ) ) ) )
            // InternalVaselina.g:1485:2: (otherlv_0= 'type' otherlv_1= 'keeping' ( (lv_rtnType_2_0= rulevarTypeLiteral ) ) )
            {
            // InternalVaselina.g:1485:2: (otherlv_0= 'type' otherlv_1= 'keeping' ( (lv_rtnType_2_0= rulevarTypeLiteral ) ) )
            // InternalVaselina.g:1486:3: otherlv_0= 'type' otherlv_1= 'keeping' ( (lv_rtnType_2_0= rulevarTypeLiteral ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReturnDeclarationAccess().getTypeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,47,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReturnDeclarationAccess().getKeepingKeyword_1());
              		
            }
            // InternalVaselina.g:1494:3: ( (lv_rtnType_2_0= rulevarTypeLiteral ) )
            // InternalVaselina.g:1495:4: (lv_rtnType_2_0= rulevarTypeLiteral )
            {
            // InternalVaselina.g:1495:4: (lv_rtnType_2_0= rulevarTypeLiteral )
            // InternalVaselina.g:1496:5: lv_rtnType_2_0= rulevarTypeLiteral
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
    // InternalVaselina.g:1517:1: entryRuleDOUBLE returns [EObject current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final EObject entryRuleDOUBLE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOUBLE = null;


        try {
            // InternalVaselina.g:1517:47: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalVaselina.g:1518:2: iv_ruleDOUBLE= ruleDOUBLE EOF
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
    // InternalVaselina.g:1524:1: ruleDOUBLE returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_NUM ) ) otherlv_1= '.' ( ( (lv_decimal_2_1= RULE_INT | lv_decimal_2_2= RULE_NUM ) ) ) ) ;
    public final EObject ruleDOUBLE() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token otherlv_1=null;
        Token lv_decimal_2_1=null;
        Token lv_decimal_2_2=null;


        	enterRule();

        try {
            // InternalVaselina.g:1530:2: ( ( ( (lv_integer_0_0= RULE_NUM ) ) otherlv_1= '.' ( ( (lv_decimal_2_1= RULE_INT | lv_decimal_2_2= RULE_NUM ) ) ) ) )
            // InternalVaselina.g:1531:2: ( ( (lv_integer_0_0= RULE_NUM ) ) otherlv_1= '.' ( ( (lv_decimal_2_1= RULE_INT | lv_decimal_2_2= RULE_NUM ) ) ) )
            {
            // InternalVaselina.g:1531:2: ( ( (lv_integer_0_0= RULE_NUM ) ) otherlv_1= '.' ( ( (lv_decimal_2_1= RULE_INT | lv_decimal_2_2= RULE_NUM ) ) ) )
            // InternalVaselina.g:1532:3: ( (lv_integer_0_0= RULE_NUM ) ) otherlv_1= '.' ( ( (lv_decimal_2_1= RULE_INT | lv_decimal_2_2= RULE_NUM ) ) )
            {
            // InternalVaselina.g:1532:3: ( (lv_integer_0_0= RULE_NUM ) )
            // InternalVaselina.g:1533:4: (lv_integer_0_0= RULE_NUM )
            {
            // InternalVaselina.g:1533:4: (lv_integer_0_0= RULE_NUM )
            // InternalVaselina.g:1534:5: lv_integer_0_0= RULE_NUM
            {
            lv_integer_0_0=(Token)match(input,RULE_NUM,FOLLOW_33); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,48,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1());
              		
            }
            // InternalVaselina.g:1554:3: ( ( (lv_decimal_2_1= RULE_INT | lv_decimal_2_2= RULE_NUM ) ) )
            // InternalVaselina.g:1555:4: ( (lv_decimal_2_1= RULE_INT | lv_decimal_2_2= RULE_NUM ) )
            {
            // InternalVaselina.g:1555:4: ( (lv_decimal_2_1= RULE_INT | lv_decimal_2_2= RULE_NUM ) )
            // InternalVaselina.g:1556:5: (lv_decimal_2_1= RULE_INT | lv_decimal_2_2= RULE_NUM )
            {
            // InternalVaselina.g:1556:5: (lv_decimal_2_1= RULE_INT | lv_decimal_2_2= RULE_NUM )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_NUM) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalVaselina.g:1557:6: lv_decimal_2_1= RULE_INT
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
                    // InternalVaselina.g:1572:6: lv_decimal_2_2= RULE_NUM
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
    // InternalVaselina.g:1593:1: entryRulevarExpression returns [EObject current=null] : iv_rulevarExpression= rulevarExpression EOF ;
    public final EObject entryRulevarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevarExpression = null;


        try {
            // InternalVaselina.g:1593:54: (iv_rulevarExpression= rulevarExpression EOF )
            // InternalVaselina.g:1594:2: iv_rulevarExpression= rulevarExpression EOF
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
    // InternalVaselina.g:1600:1: rulevarExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject rulevarExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:1606:2: (this_Or_0= ruleOr )
            // InternalVaselina.g:1607:2: this_Or_0= ruleOr
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
    // InternalVaselina.g:1618:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalVaselina.g:1618:43: (iv_ruleOr= ruleOr EOF )
            // InternalVaselina.g:1619:2: iv_ruleOr= ruleOr EOF
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
    // InternalVaselina.g:1625:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:1631:2: ( (this_And_0= ruleAnd ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalVaselina.g:1632:2: (this_And_0= ruleAnd ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalVaselina.g:1632:2: (this_And_0= ruleAnd ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalVaselina.g:1633:3: this_And_0= ruleAnd ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_35);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_And_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalVaselina.g:1641:3: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==49) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalVaselina.g:1642:4: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalVaselina.g:1642:4: ()
            	    // InternalVaselina.g:1643:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalVaselina.g:1649:4: ( (lv_op_2_0= '||' ) )
            	    // InternalVaselina.g:1650:5: (lv_op_2_0= '||' )
            	    {
            	    // InternalVaselina.g:1650:5: (lv_op_2_0= '||' )
            	    // InternalVaselina.g:1651:6: lv_op_2_0= '||'
            	    {
            	    lv_op_2_0=(Token)match(input,49,FOLLOW_7); if (state.failed) return current;
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

            	    // InternalVaselina.g:1663:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalVaselina.g:1664:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalVaselina.g:1664:5: (lv_right_3_0= ruleAnd )
            	    // InternalVaselina.g:1665:6: lv_right_3_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_35);
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalVaselina.g:1687:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalVaselina.g:1687:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalVaselina.g:1688:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalVaselina.g:1694:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:1700:2: ( (this_Equality_0= ruleEquality ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalVaselina.g:1701:2: (this_Equality_0= ruleEquality ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalVaselina.g:1701:2: (this_Equality_0= ruleEquality ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalVaselina.g:1702:3: this_Equality_0= ruleEquality ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_36);
            this_Equality_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equality_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalVaselina.g:1710:3: ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==50) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalVaselina.g:1711:4: () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalVaselina.g:1711:4: ()
            	    // InternalVaselina.g:1712:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalVaselina.g:1718:4: ( (lv_op_2_0= '&&' ) )
            	    // InternalVaselina.g:1719:5: (lv_op_2_0= '&&' )
            	    {
            	    // InternalVaselina.g:1719:5: (lv_op_2_0= '&&' )
            	    // InternalVaselina.g:1720:6: lv_op_2_0= '&&'
            	    {
            	    lv_op_2_0=(Token)match(input,50,FOLLOW_7); if (state.failed) return current;
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

            	    // InternalVaselina.g:1732:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalVaselina.g:1733:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalVaselina.g:1733:5: (lv_right_3_0= ruleEquality )
            	    // InternalVaselina.g:1734:6: lv_right_3_0= ruleEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
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
            	    break loop26;
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
    // InternalVaselina.g:1756:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalVaselina.g:1756:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalVaselina.g:1757:2: iv_ruleEquality= ruleEquality EOF
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
    // InternalVaselina.g:1763:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:1769:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalVaselina.g:1770:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalVaselina.g:1770:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalVaselina.g:1771:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalVaselina.g:1779:3: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=51 && LA28_0<=52)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalVaselina.g:1780:4: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalVaselina.g:1780:4: ()
            	    // InternalVaselina.g:1781:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalVaselina.g:1787:4: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // InternalVaselina.g:1788:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalVaselina.g:1788:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // InternalVaselina.g:1789:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // InternalVaselina.g:1789:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==51) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==52) ) {
            	        alt27=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalVaselina.g:1790:7: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,51,FOLLOW_7); if (state.failed) return current;
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
            	            // InternalVaselina.g:1801:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,52,FOLLOW_7); if (state.failed) return current;
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

            	    // InternalVaselina.g:1814:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalVaselina.g:1815:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalVaselina.g:1815:5: (lv_right_3_0= ruleComparison )
            	    // InternalVaselina.g:1816:6: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_37);
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
            	    break loop28;
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
    // InternalVaselina.g:1838:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalVaselina.g:1838:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalVaselina.g:1839:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalVaselina.g:1845:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
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
            // InternalVaselina.g:1851:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalVaselina.g:1852:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalVaselina.g:1852:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalVaselina.g:1853:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_38);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PlusOrMinus_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalVaselina.g:1861:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=53 && LA30_0<=56)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalVaselina.g:1862:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalVaselina.g:1862:4: ()
            	    // InternalVaselina.g:1863:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalVaselina.g:1869:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalVaselina.g:1870:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalVaselina.g:1870:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalVaselina.g:1871:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalVaselina.g:1871:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt29=4;
            	    switch ( input.LA(1) ) {
            	    case 53:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case 55:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    case 56:
            	        {
            	        alt29=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt29) {
            	        case 1 :
            	            // InternalVaselina.g:1872:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,53,FOLLOW_7); if (state.failed) return current;
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
            	            // InternalVaselina.g:1883:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,54,FOLLOW_7); if (state.failed) return current;
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
            	            // InternalVaselina.g:1894:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,55,FOLLOW_7); if (state.failed) return current;
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
            	            // InternalVaselina.g:1905:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,56,FOLLOW_7); if (state.failed) return current;
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

            	    // InternalVaselina.g:1918:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalVaselina.g:1919:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalVaselina.g:1919:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalVaselina.g:1920:6: lv_right_3_0= rulePlusOrMinus
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
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
            	    break loop30;
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
    // InternalVaselina.g:1942:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalVaselina.g:1942:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalVaselina.g:1943:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
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
    // InternalVaselina.g:1949:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:1955:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )* ) )
            // InternalVaselina.g:1956:2: (this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )* )
            {
            // InternalVaselina.g:1956:2: (this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )* )
            // InternalVaselina.g:1957:3: this_MulOrDiv_0= ruleMulOrDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_39);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MulOrDiv_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalVaselina.g:1965:3: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=57 && LA32_0<=58)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalVaselina.g:1966:4: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMulOrDiv ) )
            	    {
            	    // InternalVaselina.g:1966:4: ()
            	    // InternalVaselina.g:1967:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getPlusOrMinusAccess().getPlusOrMinusLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalVaselina.g:1973:4: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // InternalVaselina.g:1974:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // InternalVaselina.g:1974:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // InternalVaselina.g:1975:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // InternalVaselina.g:1975:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==57) ) {
            	        alt31=1;
            	    }
            	    else if ( (LA31_0==58) ) {
            	        alt31=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalVaselina.g:1976:7: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,57,FOLLOW_7); if (state.failed) return current;
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
            	            // InternalVaselina.g:1987:7: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,58,FOLLOW_7); if (state.failed) return current;
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

            	    // InternalVaselina.g:2000:4: ( (lv_right_3_0= ruleMulOrDiv ) )
            	    // InternalVaselina.g:2001:5: (lv_right_3_0= ruleMulOrDiv )
            	    {
            	    // InternalVaselina.g:2001:5: (lv_right_3_0= ruleMulOrDiv )
            	    // InternalVaselina.g:2002:6: lv_right_3_0= ruleMulOrDiv
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
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
            	    break loop32;
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
    // InternalVaselina.g:2024:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalVaselina.g:2024:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalVaselina.g:2025:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
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
    // InternalVaselina.g:2031:1: ruleMulOrDiv returns [EObject current=null] : (this_Module_0= ruleModule ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleModule ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Module_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:2037:2: ( (this_Module_0= ruleModule ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleModule ) ) )* ) )
            // InternalVaselina.g:2038:2: (this_Module_0= ruleModule ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleModule ) ) )* )
            {
            // InternalVaselina.g:2038:2: (this_Module_0= ruleModule ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleModule ) ) )* )
            // InternalVaselina.g:2039:3: this_Module_0= ruleModule ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleModule ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMulOrDivAccess().getModuleParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_40);
            this_Module_0=ruleModule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Module_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalVaselina.g:2047:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleModule ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=59 && LA34_0<=60)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalVaselina.g:2048:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleModule ) )
            	    {
            	    // InternalVaselina.g:2048:4: ()
            	    // InternalVaselina.g:2049:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalVaselina.g:2055:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // InternalVaselina.g:2056:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // InternalVaselina.g:2056:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // InternalVaselina.g:2057:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // InternalVaselina.g:2057:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==59) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==60) ) {
            	        alt33=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalVaselina.g:2058:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,59,FOLLOW_7); if (state.failed) return current;
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
            	            // InternalVaselina.g:2069:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,60,FOLLOW_7); if (state.failed) return current;
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

            	    // InternalVaselina.g:2082:4: ( (lv_right_3_0= ruleModule ) )
            	    // InternalVaselina.g:2083:5: (lv_right_3_0= ruleModule )
            	    {
            	    // InternalVaselina.g:2083:5: (lv_right_3_0= ruleModule )
            	    // InternalVaselina.g:2084:6: lv_right_3_0= ruleModule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightModuleParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRuleModule"
    // InternalVaselina.g:2106:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalVaselina.g:2106:47: (iv_ruleModule= ruleModule EOF )
            // InternalVaselina.g:2107:2: iv_ruleModule= ruleModule EOF
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
    // InternalVaselina.g:2113:1: ruleModule returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( (lv_op_2_0= '%' ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalVaselina.g:2119:2: ( (this_Primary_0= rulePrimary ( () ( (lv_op_2_0= '%' ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalVaselina.g:2120:2: (this_Primary_0= rulePrimary ( () ( (lv_op_2_0= '%' ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalVaselina.g:2120:2: (this_Primary_0= rulePrimary ( () ( (lv_op_2_0= '%' ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalVaselina.g:2121:3: this_Primary_0= rulePrimary ( () ( (lv_op_2_0= '%' ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getModuleAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_41);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Primary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalVaselina.g:2129:3: ( () ( (lv_op_2_0= '%' ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==61) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalVaselina.g:2130:4: () ( (lv_op_2_0= '%' ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalVaselina.g:2130:4: ()
            	    // InternalVaselina.g:2131:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getModuleAccess().getModuleLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalVaselina.g:2137:4: ( (lv_op_2_0= '%' ) )
            	    // InternalVaselina.g:2138:5: (lv_op_2_0= '%' )
            	    {
            	    // InternalVaselina.g:2138:5: (lv_op_2_0= '%' )
            	    // InternalVaselina.g:2139:6: lv_op_2_0= '%'
            	    {
            	    lv_op_2_0=(Token)match(input,61,FOLLOW_7); if (state.failed) return current;
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

            	    // InternalVaselina.g:2151:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalVaselina.g:2152:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalVaselina.g:2152:5: (lv_right_3_0= rulePrimary )
            	    // InternalVaselina.g:2153:6: lv_right_3_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getModuleAccess().getRightPrimaryParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_41);
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
            	    break loop35;
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
    // InternalVaselina.g:2175:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalVaselina.g:2175:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalVaselina.g:2176:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalVaselina.g:2182:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' () ( (lv_inside_2_0= rulevarExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= '!' ( (lv_expression_6_0= rulePrimary ) ) ) | this_AbstractMethodCall_7= ruleAbstractMethodCall | this_Terminal_8= ruleTerminal ) ;
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
            // InternalVaselina.g:2188:2: ( ( (otherlv_0= '(' () ( (lv_inside_2_0= rulevarExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= '!' ( (lv_expression_6_0= rulePrimary ) ) ) | this_AbstractMethodCall_7= ruleAbstractMethodCall | this_Terminal_8= ruleTerminal ) )
            // InternalVaselina.g:2189:2: ( (otherlv_0= '(' () ( (lv_inside_2_0= rulevarExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= '!' ( (lv_expression_6_0= rulePrimary ) ) ) | this_AbstractMethodCall_7= ruleAbstractMethodCall | this_Terminal_8= ruleTerminal )
            {
            // InternalVaselina.g:2189:2: ( (otherlv_0= '(' () ( (lv_inside_2_0= rulevarExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= '!' ( (lv_expression_6_0= rulePrimary ) ) ) | this_AbstractMethodCall_7= ruleAbstractMethodCall | this_Terminal_8= ruleTerminal )
            int alt36=4;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt36=1;
                }
                break;
            case 64:
                {
                alt36=2;
                }
                break;
            case RULE_ID:
                {
                int LA36_3 = input.LA(2);

                if ( (LA36_3==EOF||LA36_3==RULE_ID||(LA36_3>=14 && LA36_3<=15)||(LA36_3>=20 && LA36_3<=21)||LA36_3==23||LA36_3==26||LA36_3==30||(LA36_3>=32 && LA36_3<=37)||LA36_3==42||(LA36_3>=45 && LA36_3<=46)||(LA36_3>=49 && LA36_3<=61)||LA36_3==63) ) {
                    alt36=4;
                }
                else if ( (LA36_3==25) ) {
                    alt36=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 3, input);

                    throw nvae;
                }
                }
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
                {
                alt36=3;
                }
                break;
            case RULE_NUM:
            case RULE_STRING:
            case 65:
            case 66:
                {
                alt36=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalVaselina.g:2190:3: (otherlv_0= '(' () ( (lv_inside_2_0= rulevarExpression ) ) otherlv_3= ')' )
                    {
                    // InternalVaselina.g:2190:3: (otherlv_0= '(' () ( (lv_inside_2_0= rulevarExpression ) ) otherlv_3= ')' )
                    // InternalVaselina.g:2191:4: otherlv_0= '(' () ( (lv_inside_2_0= rulevarExpression ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,62,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    // InternalVaselina.g:2195:4: ()
                    // InternalVaselina.g:2196:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getInsideAction_0_1(),
                      						current);
                      				
                    }

                    }

                    // InternalVaselina.g:2202:4: ( (lv_inside_2_0= rulevarExpression ) )
                    // InternalVaselina.g:2203:5: (lv_inside_2_0= rulevarExpression )
                    {
                    // InternalVaselina.g:2203:5: (lv_inside_2_0= rulevarExpression )
                    // InternalVaselina.g:2204:6: lv_inside_2_0= rulevarExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getInsideVarExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_42);
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

                    otherlv_3=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVaselina.g:2227:3: ( () otherlv_5= '!' ( (lv_expression_6_0= rulePrimary ) ) )
                    {
                    // InternalVaselina.g:2227:3: ( () otherlv_5= '!' ( (lv_expression_6_0= rulePrimary ) ) )
                    // InternalVaselina.g:2228:4: () otherlv_5= '!' ( (lv_expression_6_0= rulePrimary ) )
                    {
                    // InternalVaselina.g:2228:4: ()
                    // InternalVaselina.g:2229:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_5=(Token)match(input,64,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                      			
                    }
                    // InternalVaselina.g:2239:4: ( (lv_expression_6_0= rulePrimary ) )
                    // InternalVaselina.g:2240:5: (lv_expression_6_0= rulePrimary )
                    {
                    // InternalVaselina.g:2240:5: (lv_expression_6_0= rulePrimary )
                    // InternalVaselina.g:2241:6: lv_expression_6_0= rulePrimary
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
                    // InternalVaselina.g:2260:3: this_AbstractMethodCall_7= ruleAbstractMethodCall
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
                    // InternalVaselina.g:2269:3: this_Terminal_8= ruleTerminal
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
    // InternalVaselina.g:2281:1: entryRuleTerminal returns [EObject current=null] : iv_ruleTerminal= ruleTerminal EOF ;
    public final EObject entryRuleTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminal = null;


        try {
            // InternalVaselina.g:2281:49: (iv_ruleTerminal= ruleTerminal EOF )
            // InternalVaselina.g:2282:2: iv_ruleTerminal= ruleTerminal EOF
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
    // InternalVaselina.g:2288:1: ruleTerminal returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_NUM ) ) ) | ( () ( (lv_value_5_0= ruleDOUBLE ) ) ) | ( () ( ( (lv_varRef_7_1= 'true...' | lv_varRef_7_2= 'false...' ) ) ) ) | ( () ( (otherlv_9= RULE_ID ) ) ) | ( () ( (otherlv_11= RULE_ID ) ) ( (lv_dim_12_0= rulearrayDimension ) )+ ) ) ;
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
            // InternalVaselina.g:2294:2: ( ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_NUM ) ) ) | ( () ( (lv_value_5_0= ruleDOUBLE ) ) ) | ( () ( ( (lv_varRef_7_1= 'true...' | lv_varRef_7_2= 'false...' ) ) ) ) | ( () ( (otherlv_9= RULE_ID ) ) ) | ( () ( (otherlv_11= RULE_ID ) ) ( (lv_dim_12_0= rulearrayDimension ) )+ ) ) )
            // InternalVaselina.g:2295:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_NUM ) ) ) | ( () ( (lv_value_5_0= ruleDOUBLE ) ) ) | ( () ( ( (lv_varRef_7_1= 'true...' | lv_varRef_7_2= 'false...' ) ) ) ) | ( () ( (otherlv_9= RULE_ID ) ) ) | ( () ( (otherlv_11= RULE_ID ) ) ( (lv_dim_12_0= rulearrayDimension ) )+ ) )
            {
            // InternalVaselina.g:2295:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_NUM ) ) ) | ( () ( (lv_value_5_0= ruleDOUBLE ) ) ) | ( () ( ( (lv_varRef_7_1= 'true...' | lv_varRef_7_2= 'false...' ) ) ) ) | ( () ( (otherlv_9= RULE_ID ) ) ) | ( () ( (otherlv_11= RULE_ID ) ) ( (lv_dim_12_0= rulearrayDimension ) )+ ) )
            int alt39=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt39=1;
                }
                break;
            case RULE_NUM:
                {
                int LA39_2 = input.LA(2);

                if ( (LA39_2==EOF||LA39_2==RULE_ID||(LA39_2>=14 && LA39_2<=15)||(LA39_2>=20 && LA39_2<=21)||LA39_2==26||LA39_2==30||(LA39_2>=32 && LA39_2<=37)||LA39_2==42||(LA39_2>=45 && LA39_2<=46)||(LA39_2>=49 && LA39_2<=61)||LA39_2==63) ) {
                    alt39=2;
                }
                else if ( (LA39_2==48) ) {
                    alt39=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 2, input);

                    throw nvae;
                }
                }
                break;
            case 65:
            case 66:
                {
                alt39=4;
                }
                break;
            case RULE_ID:
                {
                int LA39_4 = input.LA(2);

                if ( (LA39_4==23) ) {
                    alt39=6;
                }
                else if ( (LA39_4==EOF||LA39_4==RULE_ID||(LA39_4>=14 && LA39_4<=15)||(LA39_4>=20 && LA39_4<=21)||LA39_4==26||LA39_4==30||(LA39_4>=32 && LA39_4<=37)||LA39_4==42||(LA39_4>=45 && LA39_4<=46)||(LA39_4>=49 && LA39_4<=61)||LA39_4==63) ) {
                    alt39=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalVaselina.g:2296:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    {
                    // InternalVaselina.g:2296:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    // InternalVaselina.g:2297:4: () ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // InternalVaselina.g:2297:4: ()
                    // InternalVaselina.g:2298:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalAccess().getStringRefAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVaselina.g:2304:4: ( (lv_value_1_0= RULE_STRING ) )
                    // InternalVaselina.g:2305:5: (lv_value_1_0= RULE_STRING )
                    {
                    // InternalVaselina.g:2305:5: (lv_value_1_0= RULE_STRING )
                    // InternalVaselina.g:2306:6: lv_value_1_0= RULE_STRING
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
                    // InternalVaselina.g:2324:3: ( () ( (lv_value_3_0= RULE_NUM ) ) )
                    {
                    // InternalVaselina.g:2324:3: ( () ( (lv_value_3_0= RULE_NUM ) ) )
                    // InternalVaselina.g:2325:4: () ( (lv_value_3_0= RULE_NUM ) )
                    {
                    // InternalVaselina.g:2325:4: ()
                    // InternalVaselina.g:2326:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalAccess().getNumRefAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVaselina.g:2332:4: ( (lv_value_3_0= RULE_NUM ) )
                    // InternalVaselina.g:2333:5: (lv_value_3_0= RULE_NUM )
                    {
                    // InternalVaselina.g:2333:5: (lv_value_3_0= RULE_NUM )
                    // InternalVaselina.g:2334:6: lv_value_3_0= RULE_NUM
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
                    // InternalVaselina.g:2352:3: ( () ( (lv_value_5_0= ruleDOUBLE ) ) )
                    {
                    // InternalVaselina.g:2352:3: ( () ( (lv_value_5_0= ruleDOUBLE ) ) )
                    // InternalVaselina.g:2353:4: () ( (lv_value_5_0= ruleDOUBLE ) )
                    {
                    // InternalVaselina.g:2353:4: ()
                    // InternalVaselina.g:2354:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalAccess().getDoubleRefAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVaselina.g:2360:4: ( (lv_value_5_0= ruleDOUBLE ) )
                    // InternalVaselina.g:2361:5: (lv_value_5_0= ruleDOUBLE )
                    {
                    // InternalVaselina.g:2361:5: (lv_value_5_0= ruleDOUBLE )
                    // InternalVaselina.g:2362:6: lv_value_5_0= ruleDOUBLE
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
                    // InternalVaselina.g:2381:3: ( () ( ( (lv_varRef_7_1= 'true...' | lv_varRef_7_2= 'false...' ) ) ) )
                    {
                    // InternalVaselina.g:2381:3: ( () ( ( (lv_varRef_7_1= 'true...' | lv_varRef_7_2= 'false...' ) ) ) )
                    // InternalVaselina.g:2382:4: () ( ( (lv_varRef_7_1= 'true...' | lv_varRef_7_2= 'false...' ) ) )
                    {
                    // InternalVaselina.g:2382:4: ()
                    // InternalVaselina.g:2383:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalAccess().getBoolRefAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVaselina.g:2389:4: ( ( (lv_varRef_7_1= 'true...' | lv_varRef_7_2= 'false...' ) ) )
                    // InternalVaselina.g:2390:5: ( (lv_varRef_7_1= 'true...' | lv_varRef_7_2= 'false...' ) )
                    {
                    // InternalVaselina.g:2390:5: ( (lv_varRef_7_1= 'true...' | lv_varRef_7_2= 'false...' ) )
                    // InternalVaselina.g:2391:6: (lv_varRef_7_1= 'true...' | lv_varRef_7_2= 'false...' )
                    {
                    // InternalVaselina.g:2391:6: (lv_varRef_7_1= 'true...' | lv_varRef_7_2= 'false...' )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==65) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==66) ) {
                        alt37=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalVaselina.g:2392:7: lv_varRef_7_1= 'true...'
                            {
                            lv_varRef_7_1=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
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
                            // InternalVaselina.g:2403:7: lv_varRef_7_2= 'false...'
                            {
                            lv_varRef_7_2=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
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
                    // InternalVaselina.g:2418:3: ( () ( (otherlv_9= RULE_ID ) ) )
                    {
                    // InternalVaselina.g:2418:3: ( () ( (otherlv_9= RULE_ID ) ) )
                    // InternalVaselina.g:2419:4: () ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalVaselina.g:2419:4: ()
                    // InternalVaselina.g:2420:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalAccess().getVarRefAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVaselina.g:2426:4: ( (otherlv_9= RULE_ID ) )
                    // InternalVaselina.g:2427:5: (otherlv_9= RULE_ID )
                    {
                    // InternalVaselina.g:2427:5: (otherlv_9= RULE_ID )
                    // InternalVaselina.g:2428:6: otherlv_9= RULE_ID
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
                    // InternalVaselina.g:2441:3: ( () ( (otherlv_11= RULE_ID ) ) ( (lv_dim_12_0= rulearrayDimension ) )+ )
                    {
                    // InternalVaselina.g:2441:3: ( () ( (otherlv_11= RULE_ID ) ) ( (lv_dim_12_0= rulearrayDimension ) )+ )
                    // InternalVaselina.g:2442:4: () ( (otherlv_11= RULE_ID ) ) ( (lv_dim_12_0= rulearrayDimension ) )+
                    {
                    // InternalVaselina.g:2442:4: ()
                    // InternalVaselina.g:2443:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalAccess().getArrayRefAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalVaselina.g:2449:4: ( (otherlv_11= RULE_ID ) )
                    // InternalVaselina.g:2450:5: (otherlv_11= RULE_ID )
                    {
                    // InternalVaselina.g:2450:5: (otherlv_11= RULE_ID )
                    // InternalVaselina.g:2451:6: otherlv_11= RULE_ID
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

                    // InternalVaselina.g:2462:4: ( (lv_dim_12_0= rulearrayDimension ) )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==23) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalVaselina.g:2463:5: (lv_dim_12_0= rulearrayDimension )
                    	    {
                    	    // InternalVaselina.g:2463:5: (lv_dim_12_0= rulearrayDimension )
                    	    // InternalVaselina.g:2464:6: lv_dim_12_0= rulearrayDimension
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
                    	    if ( cnt38 >= 1 ) break loop38;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(38, input);
                                throw eee;
                        }
                        cnt38++;
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
        // InternalVaselina.g:1287:5: ( '<-' )
        // InternalVaselina.g:1287:6: '<-'
        {
        match(input,14,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalVaselina

    // $ANTLR start synpred2_InternalVaselina
    public final void synpred2_InternalVaselina_fragment() throws RecognitionException {   
        // InternalVaselina.g:1322:4: ( '<-' )
        // InternalVaselina.g:1322:5: '<-'
        {
        match(input,14,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalVaselina

    // $ANTLR start synpred3_InternalVaselina
    public final void synpred3_InternalVaselina_fragment() throws RecognitionException {   
        // InternalVaselina.g:1421:4: ( '<-' )
        // InternalVaselina.g:1421:5: '<-'
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
    protected DFA22 dfa22 = new DFA22(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\1\26\10\uffff";
    static final String dfa_3s = "\1\56\1\31\10\uffff";
    static final String dfa_4s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\1";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\12\uffff\1\2\4\uffff\1\3\13\uffff\5\7\1\4\4\uffff\1\5\2\uffff\1\6\1\10",
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
    static final String dfa_7s = "\22\uffff";
    static final String dfa_8s = "\1\uffff\1\17\20\uffff";
    static final String dfa_9s = "\1\16\1\4\20\uffff";
    static final String dfa_10s = "\1\16\1\56\20\uffff";
    static final String dfa_11s = "\2\uffff\17\2\1\1";
    static final String dfa_12s = "\1\uffff\1\0\20\uffff}>";
    static final String[] dfa_13s = {
            "\1\1",
            "\1\3\11\uffff\1\2\1\4\4\uffff\1\5\11\uffff\1\20\1\uffff\1\11\1\12\1\13\1\14\1\15\1\6\3\uffff\1\21\1\7\2\uffff\1\10\1\16",
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

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1285:3: ( ( ( '<-' )=>otherlv_10= '<-' ) otherlv_11= 'no' otherlv_12= '->' ( (lv_else_13_0= ruleBodyStatement ) )* )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_1 = input.LA(1);

                         
                        int index22_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA22_1==14) && (synpred2_InternalVaselina())) {s = 2;}

                        else if ( (LA22_1==RULE_ID) && (synpred2_InternalVaselina())) {s = 3;}

                        else if ( (LA22_1==15) && (synpred2_InternalVaselina())) {s = 4;}

                        else if ( (LA22_1==20) && (synpred2_InternalVaselina())) {s = 5;}

                        else if ( (LA22_1==37) && (synpred2_InternalVaselina())) {s = 6;}

                        else if ( (LA22_1==42) && (synpred2_InternalVaselina())) {s = 7;}

                        else if ( (LA22_1==45) && (synpred2_InternalVaselina())) {s = 8;}

                        else if ( (LA22_1==32) && (synpred2_InternalVaselina())) {s = 9;}

                        else if ( (LA22_1==33) && (synpred2_InternalVaselina())) {s = 10;}

                        else if ( (LA22_1==34) && (synpred2_InternalVaselina())) {s = 11;}

                        else if ( (LA22_1==35) && (synpred2_InternalVaselina())) {s = 12;}

                        else if ( (LA22_1==36) && (synpred2_InternalVaselina())) {s = 13;}

                        else if ( (LA22_1==46) && (synpred2_InternalVaselina())) {s = 14;}

                        else if ( (LA22_1==EOF) && (synpred2_InternalVaselina())) {s = 15;}

                        else if ( (LA22_1==30) && (synpred2_InternalVaselina())) {s = 16;}

                        else if ( (LA22_1==41) && (synpred1_InternalVaselina())) {s = 17;}

                         
                        input.seek(index22_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008101000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000643F0810D010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x4000001F000000B0L,0x0000000000000007L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x4000001F002000B0L,0x0000000000000007L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000200F0000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000643F48109010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x01E0000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x8000000000000000L});

}