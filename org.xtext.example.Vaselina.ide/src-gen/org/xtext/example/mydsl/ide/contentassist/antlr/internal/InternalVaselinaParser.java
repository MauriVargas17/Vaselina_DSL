package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.VaselinaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalVaselinaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_NUM", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'numb'", "'strange'", "'bull'", "'dribble'", "'air'", "'display'", "'printstr'", "'strjoin'", "'strsplit'", "'anytostr'", "'getargs'", "'equals'", "'length'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'true...'", "'false...'", "'Vaselinator'", "'->'", "'<-'", "'keep'", "':'", "'holds'", "'['", "']'", "'using'", "','", "'braze'", "'with'", "'and'", "'vaselina'", "'is'", "'this'", "'true?'", "'yes'", "'no'", "'as'", "'long'", "'repeat'", "'type'", "'keeping'", "'.'", "'('", "')'", "'!'", "'box'", "'boxes'", "'break'", "'||'", "'&&'", "'%'"
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
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(VaselinaGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleVaselinaProgram"
    // InternalVaselina.g:54:1: entryRuleVaselinaProgram : ruleVaselinaProgram EOF ;
    public final void entryRuleVaselinaProgram() throws RecognitionException {
        try {
            // InternalVaselina.g:55:1: ( ruleVaselinaProgram EOF )
            // InternalVaselina.g:56:1: ruleVaselinaProgram EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVaselinaProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVaselinaProgram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVaselinaProgramRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVaselinaProgram"


    // $ANTLR start "ruleVaselinaProgram"
    // InternalVaselina.g:63:1: ruleVaselinaProgram : ( ( rule__VaselinaProgram__Group__0 ) ) ;
    public final void ruleVaselinaProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:67:2: ( ( ( rule__VaselinaProgram__Group__0 ) ) )
            // InternalVaselina.g:68:2: ( ( rule__VaselinaProgram__Group__0 ) )
            {
            // InternalVaselina.g:68:2: ( ( rule__VaselinaProgram__Group__0 ) )
            // InternalVaselina.g:69:3: ( rule__VaselinaProgram__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVaselinaProgramAccess().getGroup()); 
            }
            // InternalVaselina.g:70:3: ( rule__VaselinaProgram__Group__0 )
            // InternalVaselina.g:70:4: rule__VaselinaProgram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VaselinaProgram__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVaselinaProgramAccess().getGroup()); 
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
    // $ANTLR end "ruleVaselinaProgram"


    // $ANTLR start "entryRulemainDeclared"
    // InternalVaselina.g:79:1: entryRulemainDeclared : rulemainDeclared EOF ;
    public final void entryRulemainDeclared() throws RecognitionException {
        try {
            // InternalVaselina.g:80:1: ( rulemainDeclared EOF )
            // InternalVaselina.g:81:1: rulemainDeclared EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainDeclaredRule()); 
            }
            pushFollow(FOLLOW_1);
            rulemainDeclared();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainDeclaredRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulemainDeclared"


    // $ANTLR start "rulemainDeclared"
    // InternalVaselina.g:88:1: rulemainDeclared : ( ( rule__MainDeclared__Group__0 ) ) ;
    public final void rulemainDeclared() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:92:2: ( ( ( rule__MainDeclared__Group__0 ) ) )
            // InternalVaselina.g:93:2: ( ( rule__MainDeclared__Group__0 ) )
            {
            // InternalVaselina.g:93:2: ( ( rule__MainDeclared__Group__0 ) )
            // InternalVaselina.g:94:3: ( rule__MainDeclared__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainDeclaredAccess().getGroup()); 
            }
            // InternalVaselina.g:95:3: ( rule__MainDeclared__Group__0 )
            // InternalVaselina.g:95:4: rule__MainDeclared__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MainDeclared__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainDeclaredAccess().getGroup()); 
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
    // $ANTLR end "rulemainDeclared"


    // $ANTLR start "entryRuleBodyStatement"
    // InternalVaselina.g:104:1: entryRuleBodyStatement : ruleBodyStatement EOF ;
    public final void entryRuleBodyStatement() throws RecognitionException {
        try {
            // InternalVaselina.g:105:1: ( ruleBodyStatement EOF )
            // InternalVaselina.g:106:1: ruleBodyStatement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBodyStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyStatementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBodyStatement"


    // $ANTLR start "ruleBodyStatement"
    // InternalVaselina.g:113:1: ruleBodyStatement : ( ( rule__BodyStatement__Alternatives ) ) ;
    public final void ruleBodyStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:117:2: ( ( ( rule__BodyStatement__Alternatives ) ) )
            // InternalVaselina.g:118:2: ( ( rule__BodyStatement__Alternatives ) )
            {
            // InternalVaselina.g:118:2: ( ( rule__BodyStatement__Alternatives ) )
            // InternalVaselina.g:119:3: ( rule__BodyStatement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBodyStatementAccess().getAlternatives()); 
            }
            // InternalVaselina.g:120:3: ( rule__BodyStatement__Alternatives )
            // InternalVaselina.g:120:4: rule__BodyStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BodyStatement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBodyStatementAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBodyStatement"


    // $ANTLR start "entryRulevarReturn"
    // InternalVaselina.g:129:1: entryRulevarReturn : rulevarReturn EOF ;
    public final void entryRulevarReturn() throws RecognitionException {
        try {
            // InternalVaselina.g:130:1: ( rulevarReturn EOF )
            // InternalVaselina.g:131:1: rulevarReturn EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarReturnRule()); 
            }
            pushFollow(FOLLOW_1);
            rulevarReturn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarReturnRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulevarReturn"


    // $ANTLR start "rulevarReturn"
    // InternalVaselina.g:138:1: rulevarReturn : ( ( rule__VarReturn__Group__0 ) ) ;
    public final void rulevarReturn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:142:2: ( ( ( rule__VarReturn__Group__0 ) ) )
            // InternalVaselina.g:143:2: ( ( rule__VarReturn__Group__0 ) )
            {
            // InternalVaselina.g:143:2: ( ( rule__VarReturn__Group__0 ) )
            // InternalVaselina.g:144:3: ( rule__VarReturn__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarReturnAccess().getGroup()); 
            }
            // InternalVaselina.g:145:3: ( rule__VarReturn__Group__0 )
            // InternalVaselina.g:145:4: rule__VarReturn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarReturn__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarReturnAccess().getGroup()); 
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
    // $ANTLR end "rulevarReturn"


    // $ANTLR start "entryRulevarTypeLiteral"
    // InternalVaselina.g:154:1: entryRulevarTypeLiteral : rulevarTypeLiteral EOF ;
    public final void entryRulevarTypeLiteral() throws RecognitionException {
        try {
            // InternalVaselina.g:155:1: ( rulevarTypeLiteral EOF )
            // InternalVaselina.g:156:1: rulevarTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            rulevarTypeLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarTypeLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulevarTypeLiteral"


    // $ANTLR start "rulevarTypeLiteral"
    // InternalVaselina.g:163:1: rulevarTypeLiteral : ( ( rule__VarTypeLiteral__Alternatives ) ) ;
    public final void rulevarTypeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:167:2: ( ( ( rule__VarTypeLiteral__Alternatives ) ) )
            // InternalVaselina.g:168:2: ( ( rule__VarTypeLiteral__Alternatives ) )
            {
            // InternalVaselina.g:168:2: ( ( rule__VarTypeLiteral__Alternatives ) )
            // InternalVaselina.g:169:3: ( rule__VarTypeLiteral__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarTypeLiteralAccess().getAlternatives()); 
            }
            // InternalVaselina.g:170:3: ( rule__VarTypeLiteral__Alternatives )
            // InternalVaselina.g:170:4: rule__VarTypeLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VarTypeLiteral__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarTypeLiteralAccess().getAlternatives()); 
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
    // $ANTLR end "rulevarTypeLiteral"


    // $ANTLR start "entryRulevarDeclared"
    // InternalVaselina.g:179:1: entryRulevarDeclared : rulevarDeclared EOF ;
    public final void entryRulevarDeclared() throws RecognitionException {
        try {
            // InternalVaselina.g:180:1: ( rulevarDeclared EOF )
            // InternalVaselina.g:181:1: rulevarDeclared EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclaredRule()); 
            }
            pushFollow(FOLLOW_1);
            rulevarDeclared();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclaredRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulevarDeclared"


    // $ANTLR start "rulevarDeclared"
    // InternalVaselina.g:188:1: rulevarDeclared : ( ( rule__VarDeclared__Group__0 ) ) ;
    public final void rulevarDeclared() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:192:2: ( ( ( rule__VarDeclared__Group__0 ) ) )
            // InternalVaselina.g:193:2: ( ( rule__VarDeclared__Group__0 ) )
            {
            // InternalVaselina.g:193:2: ( ( rule__VarDeclared__Group__0 ) )
            // InternalVaselina.g:194:3: ( rule__VarDeclared__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclaredAccess().getGroup()); 
            }
            // InternalVaselina.g:195:3: ( rule__VarDeclared__Group__0 )
            // InternalVaselina.g:195:4: rule__VarDeclared__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclared__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclaredAccess().getGroup()); 
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
    // $ANTLR end "rulevarDeclared"


    // $ANTLR start "entryRulevarAssignment"
    // InternalVaselina.g:204:1: entryRulevarAssignment : rulevarAssignment EOF ;
    public final void entryRulevarAssignment() throws RecognitionException {
        try {
            // InternalVaselina.g:205:1: ( rulevarAssignment EOF )
            // InternalVaselina.g:206:1: rulevarAssignment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            rulevarAssignment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulevarAssignment"


    // $ANTLR start "rulevarAssignment"
    // InternalVaselina.g:213:1: rulevarAssignment : ( ( rule__VarAssignment__Group__0 ) ) ;
    public final void rulevarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:217:2: ( ( ( rule__VarAssignment__Group__0 ) ) )
            // InternalVaselina.g:218:2: ( ( rule__VarAssignment__Group__0 ) )
            {
            // InternalVaselina.g:218:2: ( ( rule__VarAssignment__Group__0 ) )
            // InternalVaselina.g:219:3: ( rule__VarAssignment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignmentAccess().getGroup()); 
            }
            // InternalVaselina.g:220:3: ( rule__VarAssignment__Group__0 )
            // InternalVaselina.g:220:4: rule__VarAssignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarAssignment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignmentAccess().getGroup()); 
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
    // $ANTLR end "rulevarAssignment"


    // $ANTLR start "entryRuleVariable"
    // InternalVaselina.g:229:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalVaselina.g:230:1: ( ruleVariable EOF )
            // InternalVaselina.g:231:1: ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalVaselina.g:238:1: ruleVariable : ( ( rule__Variable__Alternatives ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:242:2: ( ( ( rule__Variable__Alternatives ) ) )
            // InternalVaselina.g:243:2: ( ( rule__Variable__Alternatives ) )
            {
            // InternalVaselina.g:243:2: ( ( rule__Variable__Alternatives ) )
            // InternalVaselina.g:244:3: ( rule__Variable__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getAlternatives()); 
            }
            // InternalVaselina.g:245:3: ( rule__Variable__Alternatives )
            // InternalVaselina.g:245:4: rule__Variable__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getAlternatives()); 
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRulearrayRefs"
    // InternalVaselina.g:254:1: entryRulearrayRefs : rulearrayRefs EOF ;
    public final void entryRulearrayRefs() throws RecognitionException {
        try {
            // InternalVaselina.g:255:1: ( rulearrayRefs EOF )
            // InternalVaselina.g:256:1: rulearrayRefs EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayRefsRule()); 
            }
            pushFollow(FOLLOW_1);
            rulearrayRefs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayRefsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulearrayRefs"


    // $ANTLR start "rulearrayRefs"
    // InternalVaselina.g:263:1: rulearrayRefs : ( ( rule__ArrayRefs__Group__0 ) ) ;
    public final void rulearrayRefs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:267:2: ( ( ( rule__ArrayRefs__Group__0 ) ) )
            // InternalVaselina.g:268:2: ( ( rule__ArrayRefs__Group__0 ) )
            {
            // InternalVaselina.g:268:2: ( ( rule__ArrayRefs__Group__0 ) )
            // InternalVaselina.g:269:3: ( rule__ArrayRefs__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayRefsAccess().getGroup()); 
            }
            // InternalVaselina.g:270:3: ( rule__ArrayRefs__Group__0 )
            // InternalVaselina.g:270:4: rule__ArrayRefs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayRefs__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayRefsAccess().getGroup()); 
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
    // $ANTLR end "rulearrayRefs"


    // $ANTLR start "entryRulevarRefs"
    // InternalVaselina.g:279:1: entryRulevarRefs : rulevarRefs EOF ;
    public final void entryRulevarRefs() throws RecognitionException {
        try {
            // InternalVaselina.g:280:1: ( rulevarRefs EOF )
            // InternalVaselina.g:281:1: rulevarRefs EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarRefsRule()); 
            }
            pushFollow(FOLLOW_1);
            rulevarRefs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarRefsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulevarRefs"


    // $ANTLR start "rulevarRefs"
    // InternalVaselina.g:288:1: rulevarRefs : ( ( rule__VarRefs__Group__0 ) ) ;
    public final void rulevarRefs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:292:2: ( ( ( rule__VarRefs__Group__0 ) ) )
            // InternalVaselina.g:293:2: ( ( rule__VarRefs__Group__0 ) )
            {
            // InternalVaselina.g:293:2: ( ( rule__VarRefs__Group__0 ) )
            // InternalVaselina.g:294:3: ( rule__VarRefs__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarRefsAccess().getGroup()); 
            }
            // InternalVaselina.g:295:3: ( rule__VarRefs__Group__0 )
            // InternalVaselina.g:295:4: rule__VarRefs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarRefs__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarRefsAccess().getGroup()); 
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
    // $ANTLR end "rulevarRefs"


    // $ANTLR start "entryRulearrayDimension"
    // InternalVaselina.g:304:1: entryRulearrayDimension : rulearrayDimension EOF ;
    public final void entryRulearrayDimension() throws RecognitionException {
        try {
            // InternalVaselina.g:305:1: ( rulearrayDimension EOF )
            // InternalVaselina.g:306:1: rulearrayDimension EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayDimensionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulearrayDimension();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayDimensionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulearrayDimension"


    // $ANTLR start "rulearrayDimension"
    // InternalVaselina.g:313:1: rulearrayDimension : ( ( rule__ArrayDimension__Group__0 ) ) ;
    public final void rulearrayDimension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:317:2: ( ( ( rule__ArrayDimension__Group__0 ) ) )
            // InternalVaselina.g:318:2: ( ( rule__ArrayDimension__Group__0 ) )
            {
            // InternalVaselina.g:318:2: ( ( rule__ArrayDimension__Group__0 ) )
            // InternalVaselina.g:319:3: ( rule__ArrayDimension__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayDimensionAccess().getGroup()); 
            }
            // InternalVaselina.g:320:3: ( rule__ArrayDimension__Group__0 )
            // InternalVaselina.g:320:4: rule__ArrayDimension__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayDimension__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayDimensionAccess().getGroup()); 
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
    // $ANTLR end "rulearrayDimension"


    // $ANTLR start "entryRuleFuncCall"
    // InternalVaselina.g:329:1: entryRuleFuncCall : ruleFuncCall EOF ;
    public final void entryRuleFuncCall() throws RecognitionException {
        try {
            // InternalVaselina.g:330:1: ( ruleFuncCall EOF )
            // InternalVaselina.g:331:1: ruleFuncCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFuncCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFuncCall"


    // $ANTLR start "ruleFuncCall"
    // InternalVaselina.g:338:1: ruleFuncCall : ( ( rule__FuncCall__Group__0 ) ) ;
    public final void ruleFuncCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:342:2: ( ( ( rule__FuncCall__Group__0 ) ) )
            // InternalVaselina.g:343:2: ( ( rule__FuncCall__Group__0 ) )
            {
            // InternalVaselina.g:343:2: ( ( rule__FuncCall__Group__0 ) )
            // InternalVaselina.g:344:3: ( rule__FuncCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallAccess().getGroup()); 
            }
            // InternalVaselina.g:345:3: ( rule__FuncCall__Group__0 )
            // InternalVaselina.g:345:4: rule__FuncCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FuncCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallAccess().getGroup()); 
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
    // $ANTLR end "ruleFuncCall"


    // $ANTLR start "entryRuleFuncParameter"
    // InternalVaselina.g:354:1: entryRuleFuncParameter : ruleFuncParameter EOF ;
    public final void entryRuleFuncParameter() throws RecognitionException {
        try {
            // InternalVaselina.g:355:1: ( ruleFuncParameter EOF )
            // InternalVaselina.g:356:1: ruleFuncParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFuncParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncParameterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFuncParameter"


    // $ANTLR start "ruleFuncParameter"
    // InternalVaselina.g:363:1: ruleFuncParameter : ( ruleFuncTypedDeclaration ) ;
    public final void ruleFuncParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:367:2: ( ( ruleFuncTypedDeclaration ) )
            // InternalVaselina.g:368:2: ( ruleFuncTypedDeclaration )
            {
            // InternalVaselina.g:368:2: ( ruleFuncTypedDeclaration )
            // InternalVaselina.g:369:3: ruleFuncTypedDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncParameterAccess().getFuncTypedDeclarationParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleFuncTypedDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncParameterAccess().getFuncTypedDeclarationParserRuleCall()); 
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
    // $ANTLR end "ruleFuncParameter"


    // $ANTLR start "entryRuleFuncDefinition"
    // InternalVaselina.g:379:1: entryRuleFuncDefinition : ruleFuncDefinition EOF ;
    public final void entryRuleFuncDefinition() throws RecognitionException {
        try {
            // InternalVaselina.g:380:1: ( ruleFuncDefinition EOF )
            // InternalVaselina.g:381:1: ruleFuncDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFuncDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFuncDefinition"


    // $ANTLR start "ruleFuncDefinition"
    // InternalVaselina.g:388:1: ruleFuncDefinition : ( ( rule__FuncDefinition__Group__0 ) ) ;
    public final void ruleFuncDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:392:2: ( ( ( rule__FuncDefinition__Group__0 ) ) )
            // InternalVaselina.g:393:2: ( ( rule__FuncDefinition__Group__0 ) )
            {
            // InternalVaselina.g:393:2: ( ( rule__FuncDefinition__Group__0 ) )
            // InternalVaselina.g:394:3: ( rule__FuncDefinition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncDefinitionAccess().getGroup()); 
            }
            // InternalVaselina.g:395:3: ( rule__FuncDefinition__Group__0 )
            // InternalVaselina.g:395:4: rule__FuncDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FuncDefinition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncDefinitionAccess().getGroup()); 
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
    // $ANTLR end "ruleFuncDefinition"


    // $ANTLR start "ruleFuncTypedDeclaration"
    // InternalVaselina.g:405:1: ruleFuncTypedDeclaration : ( ( rule__FuncTypedDeclaration__Group__0 ) ) ;
    public final void ruleFuncTypedDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:409:2: ( ( ( rule__FuncTypedDeclaration__Group__0 ) ) )
            // InternalVaselina.g:410:2: ( ( rule__FuncTypedDeclaration__Group__0 ) )
            {
            // InternalVaselina.g:410:2: ( ( rule__FuncTypedDeclaration__Group__0 ) )
            // InternalVaselina.g:411:3: ( rule__FuncTypedDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncTypedDeclarationAccess().getGroup()); 
            }
            // InternalVaselina.g:412:3: ( rule__FuncTypedDeclaration__Group__0 )
            // InternalVaselina.g:412:4: rule__FuncTypedDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FuncTypedDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncTypedDeclarationAccess().getGroup()); 
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
    // $ANTLR end "ruleFuncTypedDeclaration"


    // $ANTLR start "entryRuleAbstractMethodCall"
    // InternalVaselina.g:421:1: entryRuleAbstractMethodCall : ruleAbstractMethodCall EOF ;
    public final void entryRuleAbstractMethodCall() throws RecognitionException {
        try {
            // InternalVaselina.g:422:1: ( ruleAbstractMethodCall EOF )
            // InternalVaselina.g:423:1: ruleAbstractMethodCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractMethodCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAbstractMethodCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractMethodCallRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAbstractMethodCall"


    // $ANTLR start "ruleAbstractMethodCall"
    // InternalVaselina.g:430:1: ruleAbstractMethodCall : ( ( rule__AbstractMethodCall__Alternatives ) ) ;
    public final void ruleAbstractMethodCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:434:2: ( ( ( rule__AbstractMethodCall__Alternatives ) ) )
            // InternalVaselina.g:435:2: ( ( rule__AbstractMethodCall__Alternatives ) )
            {
            // InternalVaselina.g:435:2: ( ( rule__AbstractMethodCall__Alternatives ) )
            // InternalVaselina.g:436:3: ( rule__AbstractMethodCall__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractMethodCallAccess().getAlternatives()); 
            }
            // InternalVaselina.g:437:3: ( rule__AbstractMethodCall__Alternatives )
            // InternalVaselina.g:437:4: rule__AbstractMethodCall__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractMethodCall__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractMethodCallAccess().getAlternatives()); 
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
    // $ANTLR end "ruleAbstractMethodCall"


    // $ANTLR start "entryRuleStdfunctionList"
    // InternalVaselina.g:446:1: entryRuleStdfunctionList : ruleStdfunctionList EOF ;
    public final void entryRuleStdfunctionList() throws RecognitionException {
        try {
            // InternalVaselina.g:447:1: ( ruleStdfunctionList EOF )
            // InternalVaselina.g:448:1: ruleStdfunctionList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStdfunctionListRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStdfunctionList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStdfunctionListRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStdfunctionList"


    // $ANTLR start "ruleStdfunctionList"
    // InternalVaselina.g:455:1: ruleStdfunctionList : ( ( rule__StdfunctionList__Alternatives ) ) ;
    public final void ruleStdfunctionList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:459:2: ( ( ( rule__StdfunctionList__Alternatives ) ) )
            // InternalVaselina.g:460:2: ( ( rule__StdfunctionList__Alternatives ) )
            {
            // InternalVaselina.g:460:2: ( ( rule__StdfunctionList__Alternatives ) )
            // InternalVaselina.g:461:3: ( rule__StdfunctionList__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStdfunctionListAccess().getAlternatives()); 
            }
            // InternalVaselina.g:462:3: ( rule__StdfunctionList__Alternatives )
            // InternalVaselina.g:462:4: rule__StdfunctionList__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StdfunctionList__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStdfunctionListAccess().getAlternatives()); 
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
    // $ANTLR end "ruleStdfunctionList"


    // $ANTLR start "entryRuleStdFunction"
    // InternalVaselina.g:471:1: entryRuleStdFunction : ruleStdFunction EOF ;
    public final void entryRuleStdFunction() throws RecognitionException {
        try {
            // InternalVaselina.g:472:1: ( ruleStdFunction EOF )
            // InternalVaselina.g:473:1: ruleStdFunction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStdFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStdFunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStdFunctionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStdFunction"


    // $ANTLR start "ruleStdFunction"
    // InternalVaselina.g:480:1: ruleStdFunction : ( ( rule__StdFunction__Group__0 ) ) ;
    public final void ruleStdFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:484:2: ( ( ( rule__StdFunction__Group__0 ) ) )
            // InternalVaselina.g:485:2: ( ( rule__StdFunction__Group__0 ) )
            {
            // InternalVaselina.g:485:2: ( ( rule__StdFunction__Group__0 ) )
            // InternalVaselina.g:486:3: ( rule__StdFunction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStdFunctionAccess().getGroup()); 
            }
            // InternalVaselina.g:487:3: ( rule__StdFunction__Group__0 )
            // InternalVaselina.g:487:4: rule__StdFunction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StdFunction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStdFunctionAccess().getGroup()); 
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
    // $ANTLR end "ruleStdFunction"


    // $ANTLR start "entryRuleIfExpression"
    // InternalVaselina.g:496:1: entryRuleIfExpression : ruleIfExpression EOF ;
    public final void entryRuleIfExpression() throws RecognitionException {
        try {
            // InternalVaselina.g:497:1: ( ruleIfExpression EOF )
            // InternalVaselina.g:498:1: ruleIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIfExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIfExpression"


    // $ANTLR start "ruleIfExpression"
    // InternalVaselina.g:505:1: ruleIfExpression : ( ( rule__IfExpression__Group__0 ) ) ;
    public final void ruleIfExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:509:2: ( ( ( rule__IfExpression__Group__0 ) ) )
            // InternalVaselina.g:510:2: ( ( rule__IfExpression__Group__0 ) )
            {
            // InternalVaselina.g:510:2: ( ( rule__IfExpression__Group__0 ) )
            // InternalVaselina.g:511:3: ( rule__IfExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpressionAccess().getGroup()); 
            }
            // InternalVaselina.g:512:3: ( rule__IfExpression__Group__0 )
            // InternalVaselina.g:512:4: rule__IfExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleIfExpression"


    // $ANTLR start "entryRuleDoWhileExpression"
    // InternalVaselina.g:521:1: entryRuleDoWhileExpression : ruleDoWhileExpression EOF ;
    public final void entryRuleDoWhileExpression() throws RecognitionException {
        try {
            // InternalVaselina.g:522:1: ( ruleDoWhileExpression EOF )
            // InternalVaselina.g:523:1: ruleDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDoWhileExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoWhileExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDoWhileExpression"


    // $ANTLR start "ruleDoWhileExpression"
    // InternalVaselina.g:530:1: ruleDoWhileExpression : ( ( rule__DoWhileExpression__Group__0 ) ) ;
    public final void ruleDoWhileExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:534:2: ( ( ( rule__DoWhileExpression__Group__0 ) ) )
            // InternalVaselina.g:535:2: ( ( rule__DoWhileExpression__Group__0 ) )
            {
            // InternalVaselina.g:535:2: ( ( rule__DoWhileExpression__Group__0 ) )
            // InternalVaselina.g:536:3: ( rule__DoWhileExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoWhileExpressionAccess().getGroup()); 
            }
            // InternalVaselina.g:537:3: ( rule__DoWhileExpression__Group__0 )
            // InternalVaselina.g:537:4: rule__DoWhileExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DoWhileExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoWhileExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleDoWhileExpression"


    // $ANTLR start "entryRuleBrkStr"
    // InternalVaselina.g:546:1: entryRuleBrkStr : ruleBrkStr EOF ;
    public final void entryRuleBrkStr() throws RecognitionException {
        try {
            // InternalVaselina.g:547:1: ( ruleBrkStr EOF )
            // InternalVaselina.g:548:1: ruleBrkStr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrkStrRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBrkStr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBrkStrRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBrkStr"


    // $ANTLR start "ruleBrkStr"
    // InternalVaselina.g:555:1: ruleBrkStr : ( ( rule__BrkStr__Group__0 ) ) ;
    public final void ruleBrkStr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:559:2: ( ( ( rule__BrkStr__Group__0 ) ) )
            // InternalVaselina.g:560:2: ( ( rule__BrkStr__Group__0 ) )
            {
            // InternalVaselina.g:560:2: ( ( rule__BrkStr__Group__0 ) )
            // InternalVaselina.g:561:3: ( rule__BrkStr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrkStrAccess().getGroup()); 
            }
            // InternalVaselina.g:562:3: ( rule__BrkStr__Group__0 )
            // InternalVaselina.g:562:4: rule__BrkStr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BrkStr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBrkStrAccess().getGroup()); 
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
    // $ANTLR end "ruleBrkStr"


    // $ANTLR start "entryRuleReturnDeclaration"
    // InternalVaselina.g:571:1: entryRuleReturnDeclaration : ruleReturnDeclaration EOF ;
    public final void entryRuleReturnDeclaration() throws RecognitionException {
        try {
            // InternalVaselina.g:572:1: ( ruleReturnDeclaration EOF )
            // InternalVaselina.g:573:1: ruleReturnDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleReturnDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleReturnDeclaration"


    // $ANTLR start "ruleReturnDeclaration"
    // InternalVaselina.g:580:1: ruleReturnDeclaration : ( ( rule__ReturnDeclaration__Group__0 ) ) ;
    public final void ruleReturnDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:584:2: ( ( ( rule__ReturnDeclaration__Group__0 ) ) )
            // InternalVaselina.g:585:2: ( ( rule__ReturnDeclaration__Group__0 ) )
            {
            // InternalVaselina.g:585:2: ( ( rule__ReturnDeclaration__Group__0 ) )
            // InternalVaselina.g:586:3: ( rule__ReturnDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnDeclarationAccess().getGroup()); 
            }
            // InternalVaselina.g:587:3: ( rule__ReturnDeclaration__Group__0 )
            // InternalVaselina.g:587:4: rule__ReturnDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReturnDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnDeclarationAccess().getGroup()); 
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
    // $ANTLR end "ruleReturnDeclaration"


    // $ANTLR start "entryRuleDOUBLE"
    // InternalVaselina.g:596:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // InternalVaselina.g:597:1: ( ruleDOUBLE EOF )
            // InternalVaselina.g:598:1: ruleDOUBLE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOUBLERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDOUBLE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOUBLERule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // InternalVaselina.g:605:1: ruleDOUBLE : ( ( rule__DOUBLE__Group__0 ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:609:2: ( ( ( rule__DOUBLE__Group__0 ) ) )
            // InternalVaselina.g:610:2: ( ( rule__DOUBLE__Group__0 ) )
            {
            // InternalVaselina.g:610:2: ( ( rule__DOUBLE__Group__0 ) )
            // InternalVaselina.g:611:3: ( rule__DOUBLE__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOUBLEAccess().getGroup()); 
            }
            // InternalVaselina.g:612:3: ( rule__DOUBLE__Group__0 )
            // InternalVaselina.g:612:4: rule__DOUBLE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOUBLEAccess().getGroup()); 
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
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRulevarExpression"
    // InternalVaselina.g:621:1: entryRulevarExpression : rulevarExpression EOF ;
    public final void entryRulevarExpression() throws RecognitionException {
        try {
            // InternalVaselina.g:622:1: ( rulevarExpression EOF )
            // InternalVaselina.g:623:1: rulevarExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulevarExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulevarExpression"


    // $ANTLR start "rulevarExpression"
    // InternalVaselina.g:630:1: rulevarExpression : ( ruleOr ) ;
    public final void rulevarExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:634:2: ( ( ruleOr ) )
            // InternalVaselina.g:635:2: ( ruleOr )
            {
            // InternalVaselina.g:635:2: ( ruleOr )
            // InternalVaselina.g:636:3: ruleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarExpressionAccess().getOrParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarExpressionAccess().getOrParserRuleCall()); 
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
    // $ANTLR end "rulevarExpression"


    // $ANTLR start "entryRuleOr"
    // InternalVaselina.g:646:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalVaselina.g:647:1: ( ruleOr EOF )
            // InternalVaselina.g:648:1: ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalVaselina.g:655:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:659:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalVaselina.g:660:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalVaselina.g:660:2: ( ( rule__Or__Group__0 ) )
            // InternalVaselina.g:661:3: ( rule__Or__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup()); 
            }
            // InternalVaselina.g:662:3: ( rule__Or__Group__0 )
            // InternalVaselina.g:662:4: rule__Or__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup()); 
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalVaselina.g:671:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalVaselina.g:672:1: ( ruleAnd EOF )
            // InternalVaselina.g:673:1: ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalVaselina.g:680:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:684:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalVaselina.g:685:2: ( ( rule__And__Group__0 ) )
            {
            // InternalVaselina.g:685:2: ( ( rule__And__Group__0 ) )
            // InternalVaselina.g:686:3: ( rule__And__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup()); 
            }
            // InternalVaselina.g:687:3: ( rule__And__Group__0 )
            // InternalVaselina.g:687:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup()); 
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalVaselina.g:696:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // InternalVaselina.g:697:1: ( ruleEquality EOF )
            // InternalVaselina.g:698:1: ruleEquality EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEquality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalVaselina.g:705:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:709:2: ( ( ( rule__Equality__Group__0 ) ) )
            // InternalVaselina.g:710:2: ( ( rule__Equality__Group__0 ) )
            {
            // InternalVaselina.g:710:2: ( ( rule__Equality__Group__0 ) )
            // InternalVaselina.g:711:3: ( rule__Equality__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getGroup()); 
            }
            // InternalVaselina.g:712:3: ( rule__Equality__Group__0 )
            // InternalVaselina.g:712:4: rule__Equality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getGroup()); 
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalVaselina.g:721:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalVaselina.g:722:1: ( ruleComparison EOF )
            // InternalVaselina.g:723:1: ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalVaselina.g:730:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:734:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalVaselina.g:735:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalVaselina.g:735:2: ( ( rule__Comparison__Group__0 ) )
            // InternalVaselina.g:736:3: ( rule__Comparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup()); 
            }
            // InternalVaselina.g:737:3: ( rule__Comparison__Group__0 )
            // InternalVaselina.g:737:4: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGroup()); 
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalVaselina.g:746:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // InternalVaselina.g:747:1: ( rulePlusOrMinus EOF )
            // InternalVaselina.g:748:1: rulePlusOrMinus EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalVaselina.g:755:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:759:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // InternalVaselina.g:760:2: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // InternalVaselina.g:760:2: ( ( rule__PlusOrMinus__Group__0 ) )
            // InternalVaselina.g:761:3: ( rule__PlusOrMinus__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            }
            // InternalVaselina.g:762:3: ( rule__PlusOrMinus__Group__0 )
            // InternalVaselina.g:762:4: rule__PlusOrMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getGroup()); 
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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalVaselina.g:771:1: entryRuleMulOrDiv : ruleMulOrDiv EOF ;
    public final void entryRuleMulOrDiv() throws RecognitionException {
        try {
            // InternalVaselina.g:772:1: ( ruleMulOrDiv EOF )
            // InternalVaselina.g:773:1: ruleMulOrDiv EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalVaselina.g:780:1: ruleMulOrDiv : ( ( rule__MulOrDiv__Group__0 ) ) ;
    public final void ruleMulOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:784:2: ( ( ( rule__MulOrDiv__Group__0 ) ) )
            // InternalVaselina.g:785:2: ( ( rule__MulOrDiv__Group__0 ) )
            {
            // InternalVaselina.g:785:2: ( ( rule__MulOrDiv__Group__0 ) )
            // InternalVaselina.g:786:3: ( rule__MulOrDiv__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getGroup()); 
            }
            // InternalVaselina.g:787:3: ( rule__MulOrDiv__Group__0 )
            // InternalVaselina.g:787:4: rule__MulOrDiv__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getGroup()); 
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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRuleModule"
    // InternalVaselina.g:796:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // InternalVaselina.g:797:1: ( ruleModule EOF )
            // InternalVaselina.g:798:1: ruleModule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalVaselina.g:805:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:809:2: ( ( ( rule__Module__Group__0 ) ) )
            // InternalVaselina.g:810:2: ( ( rule__Module__Group__0 ) )
            {
            // InternalVaselina.g:810:2: ( ( rule__Module__Group__0 ) )
            // InternalVaselina.g:811:3: ( rule__Module__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getGroup()); 
            }
            // InternalVaselina.g:812:3: ( rule__Module__Group__0 )
            // InternalVaselina.g:812:4: rule__Module__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Module__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getGroup()); 
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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRulePrimary"
    // InternalVaselina.g:821:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalVaselina.g:822:1: ( rulePrimary EOF )
            // InternalVaselina.g:823:1: rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalVaselina.g:830:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:834:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalVaselina.g:835:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalVaselina.g:835:2: ( ( rule__Primary__Alternatives ) )
            // InternalVaselina.g:836:3: ( rule__Primary__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            }
            // InternalVaselina.g:837:3: ( rule__Primary__Alternatives )
            // InternalVaselina.g:837:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getAlternatives()); 
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleTerminal"
    // InternalVaselina.g:846:1: entryRuleTerminal : ruleTerminal EOF ;
    public final void entryRuleTerminal() throws RecognitionException {
        try {
            // InternalVaselina.g:847:1: ( ruleTerminal EOF )
            // InternalVaselina.g:848:1: ruleTerminal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTerminal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTerminal"


    // $ANTLR start "ruleTerminal"
    // InternalVaselina.g:855:1: ruleTerminal : ( ( rule__Terminal__Alternatives ) ) ;
    public final void ruleTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:859:2: ( ( ( rule__Terminal__Alternatives ) ) )
            // InternalVaselina.g:860:2: ( ( rule__Terminal__Alternatives ) )
            {
            // InternalVaselina.g:860:2: ( ( rule__Terminal__Alternatives ) )
            // InternalVaselina.g:861:3: ( rule__Terminal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getAlternatives()); 
            }
            // InternalVaselina.g:862:3: ( rule__Terminal__Alternatives )
            // InternalVaselina.g:862:4: rule__Terminal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Terminal__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTerminal"


    // $ANTLR start "rule__BodyStatement__Alternatives"
    // InternalVaselina.g:870:1: rule__BodyStatement__Alternatives : ( ( rulevarAssignment ) | ( rulevarReturn ) | ( rulevarDeclared ) | ( ruleIfExpression ) | ( ruleDoWhileExpression ) | ( ruleBrkStr ) | ( ruleAbstractMethodCall ) | ( ruleReturnDeclaration ) );
    public final void rule__BodyStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:874:1: ( ( rulevarAssignment ) | ( rulevarReturn ) | ( rulevarDeclared ) | ( ruleIfExpression ) | ( ruleDoWhileExpression ) | ( ruleBrkStr ) | ( ruleAbstractMethodCall ) | ( ruleReturnDeclaration ) )
            int alt1=8;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalVaselina.g:875:2: ( rulevarAssignment )
                    {
                    // InternalVaselina.g:875:2: ( rulevarAssignment )
                    // InternalVaselina.g:876:3: rulevarAssignment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBodyStatementAccess().getVarAssignmentParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulevarAssignment();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBodyStatementAccess().getVarAssignmentParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVaselina.g:881:2: ( rulevarReturn )
                    {
                    // InternalVaselina.g:881:2: ( rulevarReturn )
                    // InternalVaselina.g:882:3: rulevarReturn
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBodyStatementAccess().getVarReturnParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulevarReturn();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBodyStatementAccess().getVarReturnParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalVaselina.g:887:2: ( rulevarDeclared )
                    {
                    // InternalVaselina.g:887:2: ( rulevarDeclared )
                    // InternalVaselina.g:888:3: rulevarDeclared
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBodyStatementAccess().getVarDeclaredParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulevarDeclared();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBodyStatementAccess().getVarDeclaredParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalVaselina.g:893:2: ( ruleIfExpression )
                    {
                    // InternalVaselina.g:893:2: ( ruleIfExpression )
                    // InternalVaselina.g:894:3: ruleIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBodyStatementAccess().getIfExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIfExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBodyStatementAccess().getIfExpressionParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalVaselina.g:899:2: ( ruleDoWhileExpression )
                    {
                    // InternalVaselina.g:899:2: ( ruleDoWhileExpression )
                    // InternalVaselina.g:900:3: ruleDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBodyStatementAccess().getDoWhileExpressionParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBodyStatementAccess().getDoWhileExpressionParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalVaselina.g:905:2: ( ruleBrkStr )
                    {
                    // InternalVaselina.g:905:2: ( ruleBrkStr )
                    // InternalVaselina.g:906:3: ruleBrkStr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBodyStatementAccess().getBrkStrParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBrkStr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBodyStatementAccess().getBrkStrParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalVaselina.g:911:2: ( ruleAbstractMethodCall )
                    {
                    // InternalVaselina.g:911:2: ( ruleAbstractMethodCall )
                    // InternalVaselina.g:912:3: ruleAbstractMethodCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBodyStatementAccess().getAbstractMethodCallParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAbstractMethodCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBodyStatementAccess().getAbstractMethodCallParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalVaselina.g:917:2: ( ruleReturnDeclaration )
                    {
                    // InternalVaselina.g:917:2: ( ruleReturnDeclaration )
                    // InternalVaselina.g:918:3: ruleReturnDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBodyStatementAccess().getReturnDeclarationParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleReturnDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBodyStatementAccess().getReturnDeclarationParserRuleCall_7()); 
                    }

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
    // $ANTLR end "rule__BodyStatement__Alternatives"


    // $ANTLR start "rule__VarTypeLiteral__Alternatives"
    // InternalVaselina.g:927:1: rule__VarTypeLiteral__Alternatives : ( ( 'numb' ) | ( 'strange' ) | ( 'bull' ) | ( 'dribble' ) );
    public final void rule__VarTypeLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:931:1: ( ( 'numb' ) | ( 'strange' ) | ( 'bull' ) | ( 'dribble' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalVaselina.g:932:2: ( 'numb' )
                    {
                    // InternalVaselina.g:932:2: ( 'numb' )
                    // InternalVaselina.g:933:3: 'numb'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarTypeLiteralAccess().getNumbKeyword_0()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarTypeLiteralAccess().getNumbKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVaselina.g:938:2: ( 'strange' )
                    {
                    // InternalVaselina.g:938:2: ( 'strange' )
                    // InternalVaselina.g:939:3: 'strange'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarTypeLiteralAccess().getStrangeKeyword_1()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarTypeLiteralAccess().getStrangeKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalVaselina.g:944:2: ( 'bull' )
                    {
                    // InternalVaselina.g:944:2: ( 'bull' )
                    // InternalVaselina.g:945:3: 'bull'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarTypeLiteralAccess().getBullKeyword_2()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarTypeLiteralAccess().getBullKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalVaselina.g:950:2: ( 'dribble' )
                    {
                    // InternalVaselina.g:950:2: ( 'dribble' )
                    // InternalVaselina.g:951:3: 'dribble'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarTypeLiteralAccess().getDribbleKeyword_3()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarTypeLiteralAccess().getDribbleKeyword_3()); 
                    }

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
    // $ANTLR end "rule__VarTypeLiteral__Alternatives"


    // $ANTLR start "rule__VarDeclared__Alternatives_1"
    // InternalVaselina.g:960:1: rule__VarDeclared__Alternatives_1 : ( ( ( rule__VarDeclared__Group_1_0__0 ) ) | ( ( rule__VarDeclared__Group_1_1__0 ) ) );
    public final void rule__VarDeclared__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:964:1: ( ( ( rule__VarDeclared__Group_1_0__0 ) ) | ( ( rule__VarDeclared__Group_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==65) ) {
                alt3=1;
            }
            else if ( (LA3_0==66) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalVaselina.g:965:2: ( ( rule__VarDeclared__Group_1_0__0 ) )
                    {
                    // InternalVaselina.g:965:2: ( ( rule__VarDeclared__Group_1_0__0 ) )
                    // InternalVaselina.g:966:3: ( rule__VarDeclared__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarDeclaredAccess().getGroup_1_0()); 
                    }
                    // InternalVaselina.g:967:3: ( rule__VarDeclared__Group_1_0__0 )
                    // InternalVaselina.g:967:4: rule__VarDeclared__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VarDeclared__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarDeclaredAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVaselina.g:971:2: ( ( rule__VarDeclared__Group_1_1__0 ) )
                    {
                    // InternalVaselina.g:971:2: ( ( rule__VarDeclared__Group_1_1__0 ) )
                    // InternalVaselina.g:972:3: ( rule__VarDeclared__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVarDeclaredAccess().getGroup_1_1()); 
                    }
                    // InternalVaselina.g:973:3: ( rule__VarDeclared__Group_1_1__0 )
                    // InternalVaselina.g:973:4: rule__VarDeclared__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VarDeclared__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVarDeclaredAccess().getGroup_1_1()); 
                    }

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
    // $ANTLR end "rule__VarDeclared__Alternatives_1"


    // $ANTLR start "rule__Variable__Alternatives"
    // InternalVaselina.g:981:1: rule__Variable__Alternatives : ( ( rulearrayRefs ) | ( rulevarRefs ) );
    public final void rule__Variable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:985:1: ( ( rulearrayRefs ) | ( rulevarRefs ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==42) ) {
                    alt4=2;
                }
                else if ( (LA4_1==43) ) {
                    alt4=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalVaselina.g:986:2: ( rulearrayRefs )
                    {
                    // InternalVaselina.g:986:2: ( rulearrayRefs )
                    // InternalVaselina.g:987:3: rulearrayRefs
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableAccess().getArrayRefsParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulearrayRefs();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariableAccess().getArrayRefsParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVaselina.g:992:2: ( rulevarRefs )
                    {
                    // InternalVaselina.g:992:2: ( rulevarRefs )
                    // InternalVaselina.g:993:3: rulevarRefs
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVariableAccess().getVarRefsParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulevarRefs();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVariableAccess().getVarRefsParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Variable__Alternatives"


    // $ANTLR start "rule__FuncDefinition__Alternatives_3"
    // InternalVaselina.g:1002:1: rule__FuncDefinition__Alternatives_3 : ( ( ( rule__FuncDefinition__Group_3_0__0 ) ) | ( 'air' ) );
    public final void rule__FuncDefinition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1006:1: ( ( ( rule__FuncDefinition__Group_3_0__0 ) ) | ( 'air' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=12 && LA5_0<=15)) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalVaselina.g:1007:2: ( ( rule__FuncDefinition__Group_3_0__0 ) )
                    {
                    // InternalVaselina.g:1007:2: ( ( rule__FuncDefinition__Group_3_0__0 ) )
                    // InternalVaselina.g:1008:3: ( rule__FuncDefinition__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFuncDefinitionAccess().getGroup_3_0()); 
                    }
                    // InternalVaselina.g:1009:3: ( rule__FuncDefinition__Group_3_0__0 )
                    // InternalVaselina.g:1009:4: rule__FuncDefinition__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FuncDefinition__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFuncDefinitionAccess().getGroup_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVaselina.g:1013:2: ( 'air' )
                    {
                    // InternalVaselina.g:1013:2: ( 'air' )
                    // InternalVaselina.g:1014:3: 'air'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFuncDefinitionAccess().getAirKeyword_3_1()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFuncDefinitionAccess().getAirKeyword_3_1()); 
                    }

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
    // $ANTLR end "rule__FuncDefinition__Alternatives_3"


    // $ANTLR start "rule__AbstractMethodCall__Alternatives"
    // InternalVaselina.g:1023:1: rule__AbstractMethodCall__Alternatives : ( ( ruleFuncCall ) | ( ruleStdFunction ) );
    public final void rule__AbstractMethodCall__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1027:1: ( ( ruleFuncCall ) | ( ruleStdFunction ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=17 && LA6_0<=24)) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalVaselina.g:1028:2: ( ruleFuncCall )
                    {
                    // InternalVaselina.g:1028:2: ( ruleFuncCall )
                    // InternalVaselina.g:1029:3: ruleFuncCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractMethodCallAccess().getFuncCallParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFuncCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractMethodCallAccess().getFuncCallParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVaselina.g:1034:2: ( ruleStdFunction )
                    {
                    // InternalVaselina.g:1034:2: ( ruleStdFunction )
                    // InternalVaselina.g:1035:3: ruleStdFunction
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractMethodCallAccess().getStdFunctionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleStdFunction();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractMethodCallAccess().getStdFunctionParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__AbstractMethodCall__Alternatives"


    // $ANTLR start "rule__StdfunctionList__Alternatives"
    // InternalVaselina.g:1044:1: rule__StdfunctionList__Alternatives : ( ( 'display' ) | ( 'printstr' ) | ( 'strjoin' ) | ( 'strsplit' ) | ( 'anytostr' ) | ( 'getargs' ) | ( 'equals' ) | ( 'length' ) );
    public final void rule__StdfunctionList__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1048:1: ( ( 'display' ) | ( 'printstr' ) | ( 'strjoin' ) | ( 'strsplit' ) | ( 'anytostr' ) | ( 'getargs' ) | ( 'equals' ) | ( 'length' ) )
            int alt7=8;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 20:
                {
                alt7=4;
                }
                break;
            case 21:
                {
                alt7=5;
                }
                break;
            case 22:
                {
                alt7=6;
                }
                break;
            case 23:
                {
                alt7=7;
                }
                break;
            case 24:
                {
                alt7=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalVaselina.g:1049:2: ( 'display' )
                    {
                    // InternalVaselina.g:1049:2: ( 'display' )
                    // InternalVaselina.g:1050:3: 'display'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStdfunctionListAccess().getDisplayKeyword_0()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStdfunctionListAccess().getDisplayKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVaselina.g:1055:2: ( 'printstr' )
                    {
                    // InternalVaselina.g:1055:2: ( 'printstr' )
                    // InternalVaselina.g:1056:3: 'printstr'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStdfunctionListAccess().getPrintstrKeyword_1()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStdfunctionListAccess().getPrintstrKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalVaselina.g:1061:2: ( 'strjoin' )
                    {
                    // InternalVaselina.g:1061:2: ( 'strjoin' )
                    // InternalVaselina.g:1062:3: 'strjoin'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStdfunctionListAccess().getStrjoinKeyword_2()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStdfunctionListAccess().getStrjoinKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalVaselina.g:1067:2: ( 'strsplit' )
                    {
                    // InternalVaselina.g:1067:2: ( 'strsplit' )
                    // InternalVaselina.g:1068:3: 'strsplit'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStdfunctionListAccess().getStrsplitKeyword_3()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStdfunctionListAccess().getStrsplitKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalVaselina.g:1073:2: ( 'anytostr' )
                    {
                    // InternalVaselina.g:1073:2: ( 'anytostr' )
                    // InternalVaselina.g:1074:3: 'anytostr'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStdfunctionListAccess().getAnytostrKeyword_4()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStdfunctionListAccess().getAnytostrKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalVaselina.g:1079:2: ( 'getargs' )
                    {
                    // InternalVaselina.g:1079:2: ( 'getargs' )
                    // InternalVaselina.g:1080:3: 'getargs'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStdfunctionListAccess().getGetargsKeyword_5()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStdfunctionListAccess().getGetargsKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalVaselina.g:1085:2: ( 'equals' )
                    {
                    // InternalVaselina.g:1085:2: ( 'equals' )
                    // InternalVaselina.g:1086:3: 'equals'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStdfunctionListAccess().getEqualsKeyword_6()); 
                    }
                    match(input,23,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStdfunctionListAccess().getEqualsKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalVaselina.g:1091:2: ( 'length' )
                    {
                    // InternalVaselina.g:1091:2: ( 'length' )
                    // InternalVaselina.g:1092:3: 'length'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStdfunctionListAccess().getLengthKeyword_7()); 
                    }
                    match(input,24,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStdfunctionListAccess().getLengthKeyword_7()); 
                    }

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
    // $ANTLR end "rule__StdfunctionList__Alternatives"


    // $ANTLR start "rule__DOUBLE__DecimalAlternatives_2_0"
    // InternalVaselina.g:1101:1: rule__DOUBLE__DecimalAlternatives_2_0 : ( ( RULE_INT ) | ( RULE_NUM ) );
    public final void rule__DOUBLE__DecimalAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1105:1: ( ( RULE_INT ) | ( RULE_NUM ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_NUM) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalVaselina.g:1106:2: ( RULE_INT )
                    {
                    // InternalVaselina.g:1106:2: ( RULE_INT )
                    // InternalVaselina.g:1107:3: RULE_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDOUBLEAccess().getDecimalINTTerminalRuleCall_2_0_0()); 
                    }
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDOUBLEAccess().getDecimalINTTerminalRuleCall_2_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVaselina.g:1112:2: ( RULE_NUM )
                    {
                    // InternalVaselina.g:1112:2: ( RULE_NUM )
                    // InternalVaselina.g:1113:3: RULE_NUM
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDOUBLEAccess().getDecimalNUMTerminalRuleCall_2_0_1()); 
                    }
                    match(input,RULE_NUM,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDOUBLEAccess().getDecimalNUMTerminalRuleCall_2_0_1()); 
                    }

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
    // $ANTLR end "rule__DOUBLE__DecimalAlternatives_2_0"


    // $ANTLR start "rule__Equality__OpAlternatives_1_1_0"
    // InternalVaselina.g:1122:1: rule__Equality__OpAlternatives_1_1_0 : ( ( '==' ) | ( '!=' ) );
    public final void rule__Equality__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1126:1: ( ( '==' ) | ( '!=' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalVaselina.g:1127:2: ( '==' )
                    {
                    // InternalVaselina.g:1127:2: ( '==' )
                    // InternalVaselina.g:1128:3: '=='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    }
                    match(input,25,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVaselina.g:1133:2: ( '!=' )
                    {
                    // InternalVaselina.g:1133:2: ( '!=' )
                    // InternalVaselina.g:1134:3: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    }
                    match(input,26,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    }

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
    // $ANTLR end "rule__Equality__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Comparison__OpAlternatives_1_1_0"
    // InternalVaselina.g:1143:1: rule__Comparison__OpAlternatives_1_1_0 : ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) );
    public final void rule__Comparison__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1147:1: ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt10=1;
                }
                break;
            case 28:
                {
                alt10=2;
                }
                break;
            case 29:
                {
                alt10=3;
                }
                break;
            case 30:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalVaselina.g:1148:2: ( '>=' )
                    {
                    // InternalVaselina.g:1148:2: ( '>=' )
                    // InternalVaselina.g:1149:3: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 
                    }
                    match(input,27,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVaselina.g:1154:2: ( '<=' )
                    {
                    // InternalVaselina.g:1154:2: ( '<=' )
                    // InternalVaselina.g:1155:3: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    }
                    match(input,28,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalVaselina.g:1160:2: ( '>' )
                    {
                    // InternalVaselina.g:1160:2: ( '>' )
                    // InternalVaselina.g:1161:3: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 
                    }
                    match(input,29,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalVaselina.g:1166:2: ( '<' )
                    {
                    // InternalVaselina.g:1166:2: ( '<' )
                    // InternalVaselina.g:1167:3: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 
                    }
                    match(input,30,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 
                    }

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
    // $ANTLR end "rule__Comparison__OpAlternatives_1_1_0"


    // $ANTLR start "rule__PlusOrMinus__OpAlternatives_1_1_0"
    // InternalVaselina.g:1176:1: rule__PlusOrMinus__OpAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__PlusOrMinus__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1180:1: ( ( '+' ) | ( '-' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            else if ( (LA11_0==32) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalVaselina.g:1181:2: ( '+' )
                    {
                    // InternalVaselina.g:1181:2: ( '+' )
                    // InternalVaselina.g:1182:3: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusOrMinusAccess().getOpPlusSignKeyword_1_1_0_0()); 
                    }
                    match(input,31,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPlusOrMinusAccess().getOpPlusSignKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVaselina.g:1187:2: ( '-' )
                    {
                    // InternalVaselina.g:1187:2: ( '-' )
                    // InternalVaselina.g:1188:3: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPlusOrMinusAccess().getOpHyphenMinusKeyword_1_1_0_1()); 
                    }
                    match(input,32,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPlusOrMinusAccess().getOpHyphenMinusKeyword_1_1_0_1()); 
                    }

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
    // $ANTLR end "rule__PlusOrMinus__OpAlternatives_1_1_0"


    // $ANTLR start "rule__MulOrDiv__OpAlternatives_1_1_0"
    // InternalVaselina.g:1197:1: rule__MulOrDiv__OpAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__MulOrDiv__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1201:1: ( ( '*' ) | ( '/' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            else if ( (LA12_0==34) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalVaselina.g:1202:2: ( '*' )
                    {
                    // InternalVaselina.g:1202:2: ( '*' )
                    // InternalVaselina.g:1203:3: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    }
                    match(input,33,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVaselina.g:1208:2: ( '/' )
                    {
                    // InternalVaselina.g:1208:2: ( '/' )
                    // InternalVaselina.g:1209:3: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 
                    }
                    match(input,34,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 
                    }

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
    // $ANTLR end "rule__MulOrDiv__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalVaselina.g:1218:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAbstractMethodCall ) | ( ruleTerminal ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1222:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAbstractMethodCall ) | ( ruleTerminal ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt13=1;
                }
                break;
            case 64:
                {
                alt13=2;
                }
                break;
            case RULE_ID:
                {
                int LA13_3 = input.LA(2);

                if ( (LA13_3==EOF||LA13_3==RULE_ID||(LA13_3>=17 && LA13_3<=34)||(LA13_3>=39 && LA13_3<=41)||LA13_3==43||LA13_3==46||LA13_3==49||LA13_3==51||LA13_3==56||LA13_3==59||LA13_3==63||(LA13_3>=65 && LA13_3<=70)) ) {
                    alt13=4;
                }
                else if ( (LA13_3==45) ) {
                    alt13=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;
                }
                }
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                {
                alt13=3;
                }
                break;
            case RULE_NUM:
            case RULE_STRING:
            case 35:
            case 36:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalVaselina.g:1223:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalVaselina.g:1223:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalVaselina.g:1224:3: ( rule__Primary__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    }
                    // InternalVaselina.g:1225:3: ( rule__Primary__Group_0__0 )
                    // InternalVaselina.g:1225:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVaselina.g:1229:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalVaselina.g:1229:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalVaselina.g:1230:3: ( rule__Primary__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    }
                    // InternalVaselina.g:1231:3: ( rule__Primary__Group_1__0 )
                    // InternalVaselina.g:1231:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalVaselina.g:1235:2: ( ruleAbstractMethodCall )
                    {
                    // InternalVaselina.g:1235:2: ( ruleAbstractMethodCall )
                    // InternalVaselina.g:1236:3: ruleAbstractMethodCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getAbstractMethodCallParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAbstractMethodCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getAbstractMethodCallParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalVaselina.g:1241:2: ( ruleTerminal )
                    {
                    // InternalVaselina.g:1241:2: ( ruleTerminal )
                    // InternalVaselina.g:1242:3: ruleTerminal
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getTerminalParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTerminal();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getTerminalParserRuleCall_3()); 
                    }

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


    // $ANTLR start "rule__Terminal__Alternatives"
    // InternalVaselina.g:1251:1: rule__Terminal__Alternatives : ( ( ( rule__Terminal__Group_0__0 ) ) | ( ( rule__Terminal__Group_1__0 ) ) | ( ( rule__Terminal__Group_2__0 ) ) | ( ( rule__Terminal__Group_3__0 ) ) | ( ( rule__Terminal__Group_4__0 ) ) | ( ( rule__Terminal__Group_5__0 ) ) );
    public final void rule__Terminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1255:1: ( ( ( rule__Terminal__Group_0__0 ) ) | ( ( rule__Terminal__Group_1__0 ) ) | ( ( rule__Terminal__Group_2__0 ) ) | ( ( rule__Terminal__Group_3__0 ) ) | ( ( rule__Terminal__Group_4__0 ) ) | ( ( rule__Terminal__Group_5__0 ) ) )
            int alt14=6;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt14=1;
                }
                break;
            case RULE_NUM:
                {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==61) ) {
                    alt14=3;
                }
                else if ( (LA14_2==EOF||LA14_2==RULE_ID||(LA14_2>=17 && LA14_2<=34)||(LA14_2>=39 && LA14_2<=41)||LA14_2==44||LA14_2==46||LA14_2==49||LA14_2==51||LA14_2==56||LA14_2==59||LA14_2==63||(LA14_2>=65 && LA14_2<=70)) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }
                }
                break;
            case 35:
            case 36:
                {
                alt14=4;
                }
                break;
            case RULE_ID:
                {
                int LA14_4 = input.LA(2);

                if ( (LA14_4==43) ) {
                    alt14=6;
                }
                else if ( (LA14_4==EOF||LA14_4==RULE_ID||(LA14_4>=17 && LA14_4<=34)||(LA14_4>=39 && LA14_4<=41)||LA14_4==44||LA14_4==46||LA14_4==49||LA14_4==51||LA14_4==56||LA14_4==59||LA14_4==63||(LA14_4>=65 && LA14_4<=70)) ) {
                    alt14=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalVaselina.g:1256:2: ( ( rule__Terminal__Group_0__0 ) )
                    {
                    // InternalVaselina.g:1256:2: ( ( rule__Terminal__Group_0__0 ) )
                    // InternalVaselina.g:1257:3: ( rule__Terminal__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalAccess().getGroup_0()); 
                    }
                    // InternalVaselina.g:1258:3: ( rule__Terminal__Group_0__0 )
                    // InternalVaselina.g:1258:4: rule__Terminal__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Terminal__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVaselina.g:1262:2: ( ( rule__Terminal__Group_1__0 ) )
                    {
                    // InternalVaselina.g:1262:2: ( ( rule__Terminal__Group_1__0 ) )
                    // InternalVaselina.g:1263:3: ( rule__Terminal__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalAccess().getGroup_1()); 
                    }
                    // InternalVaselina.g:1264:3: ( rule__Terminal__Group_1__0 )
                    // InternalVaselina.g:1264:4: rule__Terminal__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Terminal__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalVaselina.g:1268:2: ( ( rule__Terminal__Group_2__0 ) )
                    {
                    // InternalVaselina.g:1268:2: ( ( rule__Terminal__Group_2__0 ) )
                    // InternalVaselina.g:1269:3: ( rule__Terminal__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalAccess().getGroup_2()); 
                    }
                    // InternalVaselina.g:1270:3: ( rule__Terminal__Group_2__0 )
                    // InternalVaselina.g:1270:4: rule__Terminal__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Terminal__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalVaselina.g:1274:2: ( ( rule__Terminal__Group_3__0 ) )
                    {
                    // InternalVaselina.g:1274:2: ( ( rule__Terminal__Group_3__0 ) )
                    // InternalVaselina.g:1275:3: ( rule__Terminal__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalAccess().getGroup_3()); 
                    }
                    // InternalVaselina.g:1276:3: ( rule__Terminal__Group_3__0 )
                    // InternalVaselina.g:1276:4: rule__Terminal__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Terminal__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalVaselina.g:1280:2: ( ( rule__Terminal__Group_4__0 ) )
                    {
                    // InternalVaselina.g:1280:2: ( ( rule__Terminal__Group_4__0 ) )
                    // InternalVaselina.g:1281:3: ( rule__Terminal__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalAccess().getGroup_4()); 
                    }
                    // InternalVaselina.g:1282:3: ( rule__Terminal__Group_4__0 )
                    // InternalVaselina.g:1282:4: rule__Terminal__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Terminal__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalVaselina.g:1286:2: ( ( rule__Terminal__Group_5__0 ) )
                    {
                    // InternalVaselina.g:1286:2: ( ( rule__Terminal__Group_5__0 ) )
                    // InternalVaselina.g:1287:3: ( rule__Terminal__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalAccess().getGroup_5()); 
                    }
                    // InternalVaselina.g:1288:3: ( rule__Terminal__Group_5__0 )
                    // InternalVaselina.g:1288:4: rule__Terminal__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Terminal__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalAccess().getGroup_5()); 
                    }

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
    // $ANTLR end "rule__Terminal__Alternatives"


    // $ANTLR start "rule__Terminal__VarRefAlternatives_3_1_0"
    // InternalVaselina.g:1296:1: rule__Terminal__VarRefAlternatives_3_1_0 : ( ( 'true...' ) | ( 'false...' ) );
    public final void rule__Terminal__VarRefAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1300:1: ( ( 'true...' ) | ( 'false...' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            else if ( (LA15_0==36) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalVaselina.g:1301:2: ( 'true...' )
                    {
                    // InternalVaselina.g:1301:2: ( 'true...' )
                    // InternalVaselina.g:1302:3: 'true...'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalAccess().getVarRefTrueKeyword_3_1_0_0()); 
                    }
                    match(input,35,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalAccess().getVarRefTrueKeyword_3_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVaselina.g:1307:2: ( 'false...' )
                    {
                    // InternalVaselina.g:1307:2: ( 'false...' )
                    // InternalVaselina.g:1308:3: 'false...'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalAccess().getVarRefFalseKeyword_3_1_0_1()); 
                    }
                    match(input,36,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalAccess().getVarRefFalseKeyword_3_1_0_1()); 
                    }

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
    // $ANTLR end "rule__Terminal__VarRefAlternatives_3_1_0"


    // $ANTLR start "rule__VaselinaProgram__Group__0"
    // InternalVaselina.g:1317:1: rule__VaselinaProgram__Group__0 : rule__VaselinaProgram__Group__0__Impl rule__VaselinaProgram__Group__1 ;
    public final void rule__VaselinaProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1321:1: ( rule__VaselinaProgram__Group__0__Impl rule__VaselinaProgram__Group__1 )
            // InternalVaselina.g:1322:2: rule__VaselinaProgram__Group__0__Impl rule__VaselinaProgram__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__VaselinaProgram__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VaselinaProgram__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VaselinaProgram__Group__0"


    // $ANTLR start "rule__VaselinaProgram__Group__0__Impl"
    // InternalVaselina.g:1329:1: rule__VaselinaProgram__Group__0__Impl : ( ( rule__VaselinaProgram__GlobalAssignment_0 )* ) ;
    public final void rule__VaselinaProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1333:1: ( ( ( rule__VaselinaProgram__GlobalAssignment_0 )* ) )
            // InternalVaselina.g:1334:1: ( ( rule__VaselinaProgram__GlobalAssignment_0 )* )
            {
            // InternalVaselina.g:1334:1: ( ( rule__VaselinaProgram__GlobalAssignment_0 )* )
            // InternalVaselina.g:1335:2: ( rule__VaselinaProgram__GlobalAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVaselinaProgramAccess().getGlobalAssignment_0()); 
            }
            // InternalVaselina.g:1336:2: ( rule__VaselinaProgram__GlobalAssignment_0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=65 && LA16_0<=66)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalVaselina.g:1336:3: rule__VaselinaProgram__GlobalAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__VaselinaProgram__GlobalAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVaselinaProgramAccess().getGlobalAssignment_0()); 
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
    // $ANTLR end "rule__VaselinaProgram__Group__0__Impl"


    // $ANTLR start "rule__VaselinaProgram__Group__1"
    // InternalVaselina.g:1344:1: rule__VaselinaProgram__Group__1 : rule__VaselinaProgram__Group__1__Impl rule__VaselinaProgram__Group__2 ;
    public final void rule__VaselinaProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1348:1: ( rule__VaselinaProgram__Group__1__Impl rule__VaselinaProgram__Group__2 )
            // InternalVaselina.g:1349:2: rule__VaselinaProgram__Group__1__Impl rule__VaselinaProgram__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__VaselinaProgram__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VaselinaProgram__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VaselinaProgram__Group__1"


    // $ANTLR start "rule__VaselinaProgram__Group__1__Impl"
    // InternalVaselina.g:1356:1: rule__VaselinaProgram__Group__1__Impl : ( ( rule__VaselinaProgram__FuncAssignment_1 )* ) ;
    public final void rule__VaselinaProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1360:1: ( ( ( rule__VaselinaProgram__FuncAssignment_1 )* ) )
            // InternalVaselina.g:1361:1: ( ( rule__VaselinaProgram__FuncAssignment_1 )* )
            {
            // InternalVaselina.g:1361:1: ( ( rule__VaselinaProgram__FuncAssignment_1 )* )
            // InternalVaselina.g:1362:2: ( rule__VaselinaProgram__FuncAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVaselinaProgramAccess().getFuncAssignment_1()); 
            }
            // InternalVaselina.g:1363:2: ( rule__VaselinaProgram__FuncAssignment_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==47) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalVaselina.g:1363:3: rule__VaselinaProgram__FuncAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__VaselinaProgram__FuncAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVaselinaProgramAccess().getFuncAssignment_1()); 
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
    // $ANTLR end "rule__VaselinaProgram__Group__1__Impl"


    // $ANTLR start "rule__VaselinaProgram__Group__2"
    // InternalVaselina.g:1371:1: rule__VaselinaProgram__Group__2 : rule__VaselinaProgram__Group__2__Impl ;
    public final void rule__VaselinaProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1375:1: ( rule__VaselinaProgram__Group__2__Impl )
            // InternalVaselina.g:1376:2: rule__VaselinaProgram__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VaselinaProgram__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VaselinaProgram__Group__2"


    // $ANTLR start "rule__VaselinaProgram__Group__2__Impl"
    // InternalVaselina.g:1382:1: rule__VaselinaProgram__Group__2__Impl : ( ( rule__VaselinaProgram__MainAssignment_2 ) ) ;
    public final void rule__VaselinaProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1386:1: ( ( ( rule__VaselinaProgram__MainAssignment_2 ) ) )
            // InternalVaselina.g:1387:1: ( ( rule__VaselinaProgram__MainAssignment_2 ) )
            {
            // InternalVaselina.g:1387:1: ( ( rule__VaselinaProgram__MainAssignment_2 ) )
            // InternalVaselina.g:1388:2: ( rule__VaselinaProgram__MainAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVaselinaProgramAccess().getMainAssignment_2()); 
            }
            // InternalVaselina.g:1389:2: ( rule__VaselinaProgram__MainAssignment_2 )
            // InternalVaselina.g:1389:3: rule__VaselinaProgram__MainAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VaselinaProgram__MainAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVaselinaProgramAccess().getMainAssignment_2()); 
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
    // $ANTLR end "rule__VaselinaProgram__Group__2__Impl"


    // $ANTLR start "rule__MainDeclared__Group__0"
    // InternalVaselina.g:1398:1: rule__MainDeclared__Group__0 : rule__MainDeclared__Group__0__Impl rule__MainDeclared__Group__1 ;
    public final void rule__MainDeclared__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1402:1: ( rule__MainDeclared__Group__0__Impl rule__MainDeclared__Group__1 )
            // InternalVaselina.g:1403:2: rule__MainDeclared__Group__0__Impl rule__MainDeclared__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MainDeclared__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainDeclared__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainDeclared__Group__0"


    // $ANTLR start "rule__MainDeclared__Group__0__Impl"
    // InternalVaselina.g:1410:1: rule__MainDeclared__Group__0__Impl : ( () ) ;
    public final void rule__MainDeclared__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1414:1: ( ( () ) )
            // InternalVaselina.g:1415:1: ( () )
            {
            // InternalVaselina.g:1415:1: ( () )
            // InternalVaselina.g:1416:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainDeclaredAccess().getMainDeclaredAction_0()); 
            }
            // InternalVaselina.g:1417:2: ()
            // InternalVaselina.g:1417:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainDeclaredAccess().getMainDeclaredAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainDeclared__Group__0__Impl"


    // $ANTLR start "rule__MainDeclared__Group__1"
    // InternalVaselina.g:1425:1: rule__MainDeclared__Group__1 : rule__MainDeclared__Group__1__Impl rule__MainDeclared__Group__2 ;
    public final void rule__MainDeclared__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1429:1: ( rule__MainDeclared__Group__1__Impl rule__MainDeclared__Group__2 )
            // InternalVaselina.g:1430:2: rule__MainDeclared__Group__1__Impl rule__MainDeclared__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__MainDeclared__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainDeclared__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainDeclared__Group__1"


    // $ANTLR start "rule__MainDeclared__Group__1__Impl"
    // InternalVaselina.g:1437:1: rule__MainDeclared__Group__1__Impl : ( 'Vaselinator' ) ;
    public final void rule__MainDeclared__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1441:1: ( ( 'Vaselinator' ) )
            // InternalVaselina.g:1442:1: ( 'Vaselinator' )
            {
            // InternalVaselina.g:1442:1: ( 'Vaselinator' )
            // InternalVaselina.g:1443:2: 'Vaselinator'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainDeclaredAccess().getVaselinatorKeyword_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainDeclaredAccess().getVaselinatorKeyword_1()); 
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
    // $ANTLR end "rule__MainDeclared__Group__1__Impl"


    // $ANTLR start "rule__MainDeclared__Group__2"
    // InternalVaselina.g:1452:1: rule__MainDeclared__Group__2 : rule__MainDeclared__Group__2__Impl rule__MainDeclared__Group__3 ;
    public final void rule__MainDeclared__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1456:1: ( rule__MainDeclared__Group__2__Impl rule__MainDeclared__Group__3 )
            // InternalVaselina.g:1457:2: rule__MainDeclared__Group__2__Impl rule__MainDeclared__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__MainDeclared__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainDeclared__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainDeclared__Group__2"


    // $ANTLR start "rule__MainDeclared__Group__2__Impl"
    // InternalVaselina.g:1464:1: rule__MainDeclared__Group__2__Impl : ( '->' ) ;
    public final void rule__MainDeclared__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1468:1: ( ( '->' ) )
            // InternalVaselina.g:1469:1: ( '->' )
            {
            // InternalVaselina.g:1469:1: ( '->' )
            // InternalVaselina.g:1470:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainDeclaredAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainDeclaredAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
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
    // $ANTLR end "rule__MainDeclared__Group__2__Impl"


    // $ANTLR start "rule__MainDeclared__Group__3"
    // InternalVaselina.g:1479:1: rule__MainDeclared__Group__3 : rule__MainDeclared__Group__3__Impl rule__MainDeclared__Group__4 ;
    public final void rule__MainDeclared__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1483:1: ( rule__MainDeclared__Group__3__Impl rule__MainDeclared__Group__4 )
            // InternalVaselina.g:1484:2: rule__MainDeclared__Group__3__Impl rule__MainDeclared__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__MainDeclared__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MainDeclared__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainDeclared__Group__3"


    // $ANTLR start "rule__MainDeclared__Group__3__Impl"
    // InternalVaselina.g:1491:1: rule__MainDeclared__Group__3__Impl : ( ( rule__MainDeclared__BodyAssignment_3 )* ) ;
    public final void rule__MainDeclared__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1495:1: ( ( ( rule__MainDeclared__BodyAssignment_3 )* ) )
            // InternalVaselina.g:1496:1: ( ( rule__MainDeclared__BodyAssignment_3 )* )
            {
            // InternalVaselina.g:1496:1: ( ( rule__MainDeclared__BodyAssignment_3 )* )
            // InternalVaselina.g:1497:2: ( rule__MainDeclared__BodyAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainDeclaredAccess().getBodyAssignment_3()); 
            }
            // InternalVaselina.g:1498:2: ( rule__MainDeclared__BodyAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||(LA18_0>=17 && LA18_0<=24)||LA18_0==40||LA18_0==51||LA18_0==56||LA18_0==59||(LA18_0>=65 && LA18_0<=67)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalVaselina.g:1498:3: rule__MainDeclared__BodyAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__MainDeclared__BodyAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainDeclaredAccess().getBodyAssignment_3()); 
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
    // $ANTLR end "rule__MainDeclared__Group__3__Impl"


    // $ANTLR start "rule__MainDeclared__Group__4"
    // InternalVaselina.g:1506:1: rule__MainDeclared__Group__4 : rule__MainDeclared__Group__4__Impl ;
    public final void rule__MainDeclared__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1510:1: ( rule__MainDeclared__Group__4__Impl )
            // InternalVaselina.g:1511:2: rule__MainDeclared__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainDeclared__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainDeclared__Group__4"


    // $ANTLR start "rule__MainDeclared__Group__4__Impl"
    // InternalVaselina.g:1517:1: rule__MainDeclared__Group__4__Impl : ( '<-' ) ;
    public final void rule__MainDeclared__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1521:1: ( ( '<-' ) )
            // InternalVaselina.g:1522:1: ( '<-' )
            {
            // InternalVaselina.g:1522:1: ( '<-' )
            // InternalVaselina.g:1523:2: '<-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainDeclaredAccess().getLessThanSignHyphenMinusKeyword_4()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainDeclaredAccess().getLessThanSignHyphenMinusKeyword_4()); 
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
    // $ANTLR end "rule__MainDeclared__Group__4__Impl"


    // $ANTLR start "rule__VarReturn__Group__0"
    // InternalVaselina.g:1533:1: rule__VarReturn__Group__0 : rule__VarReturn__Group__0__Impl rule__VarReturn__Group__1 ;
    public final void rule__VarReturn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1537:1: ( rule__VarReturn__Group__0__Impl rule__VarReturn__Group__1 )
            // InternalVaselina.g:1538:2: rule__VarReturn__Group__0__Impl rule__VarReturn__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__VarReturn__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarReturn__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarReturn__Group__0"


    // $ANTLR start "rule__VarReturn__Group__0__Impl"
    // InternalVaselina.g:1545:1: rule__VarReturn__Group__0__Impl : ( 'keep' ) ;
    public final void rule__VarReturn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1549:1: ( ( 'keep' ) )
            // InternalVaselina.g:1550:1: ( 'keep' )
            {
            // InternalVaselina.g:1550:1: ( 'keep' )
            // InternalVaselina.g:1551:2: 'keep'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarReturnAccess().getKeepKeyword_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarReturnAccess().getKeepKeyword_0()); 
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
    // $ANTLR end "rule__VarReturn__Group__0__Impl"


    // $ANTLR start "rule__VarReturn__Group__1"
    // InternalVaselina.g:1560:1: rule__VarReturn__Group__1 : rule__VarReturn__Group__1__Impl ;
    public final void rule__VarReturn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1564:1: ( rule__VarReturn__Group__1__Impl )
            // InternalVaselina.g:1565:2: rule__VarReturn__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarReturn__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarReturn__Group__1"


    // $ANTLR start "rule__VarReturn__Group__1__Impl"
    // InternalVaselina.g:1571:1: rule__VarReturn__Group__1__Impl : ( ( rule__VarReturn__RtnAssignment_1 ) ) ;
    public final void rule__VarReturn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1575:1: ( ( ( rule__VarReturn__RtnAssignment_1 ) ) )
            // InternalVaselina.g:1576:1: ( ( rule__VarReturn__RtnAssignment_1 ) )
            {
            // InternalVaselina.g:1576:1: ( ( rule__VarReturn__RtnAssignment_1 ) )
            // InternalVaselina.g:1577:2: ( rule__VarReturn__RtnAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarReturnAccess().getRtnAssignment_1()); 
            }
            // InternalVaselina.g:1578:2: ( rule__VarReturn__RtnAssignment_1 )
            // InternalVaselina.g:1578:3: rule__VarReturn__RtnAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VarReturn__RtnAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarReturnAccess().getRtnAssignment_1()); 
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
    // $ANTLR end "rule__VarReturn__Group__1__Impl"


    // $ANTLR start "rule__VarDeclared__Group__0"
    // InternalVaselina.g:1587:1: rule__VarDeclared__Group__0 : rule__VarDeclared__Group__0__Impl rule__VarDeclared__Group__1 ;
    public final void rule__VarDeclared__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1591:1: ( rule__VarDeclared__Group__0__Impl rule__VarDeclared__Group__1 )
            // InternalVaselina.g:1592:2: rule__VarDeclared__Group__0__Impl rule__VarDeclared__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__VarDeclared__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarDeclared__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclared__Group__0"


    // $ANTLR start "rule__VarDeclared__Group__0__Impl"
    // InternalVaselina.g:1599:1: rule__VarDeclared__Group__0__Impl : ( () ) ;
    public final void rule__VarDeclared__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1603:1: ( ( () ) )
            // InternalVaselina.g:1604:1: ( () )
            {
            // InternalVaselina.g:1604:1: ( () )
            // InternalVaselina.g:1605:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclaredAccess().getVarDeclaredAction_0()); 
            }
            // InternalVaselina.g:1606:2: ()
            // InternalVaselina.g:1606:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclaredAccess().getVarDeclaredAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclared__Group__0__Impl"


    // $ANTLR start "rule__VarDeclared__Group__1"
    // InternalVaselina.g:1614:1: rule__VarDeclared__Group__1 : rule__VarDeclared__Group__1__Impl rule__VarDeclared__Group__2 ;
    public final void rule__VarDeclared__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1618:1: ( rule__VarDeclared__Group__1__Impl rule__VarDeclared__Group__2 )
            // InternalVaselina.g:1619:2: rule__VarDeclared__Group__1__Impl rule__VarDeclared__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__VarDeclared__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarDeclared__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclared__Group__1"


    // $ANTLR start "rule__VarDeclared__Group__1__Impl"
    // InternalVaselina.g:1626:1: rule__VarDeclared__Group__1__Impl : ( ( rule__VarDeclared__Alternatives_1 ) ) ;
    public final void rule__VarDeclared__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1630:1: ( ( ( rule__VarDeclared__Alternatives_1 ) ) )
            // InternalVaselina.g:1631:1: ( ( rule__VarDeclared__Alternatives_1 ) )
            {
            // InternalVaselina.g:1631:1: ( ( rule__VarDeclared__Alternatives_1 ) )
            // InternalVaselina.g:1632:2: ( rule__VarDeclared__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclaredAccess().getAlternatives_1()); 
            }
            // InternalVaselina.g:1633:2: ( rule__VarDeclared__Alternatives_1 )
            // InternalVaselina.g:1633:3: rule__VarDeclared__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclared__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclaredAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__VarDeclared__Group__1__Impl"


    // $ANTLR start "rule__VarDeclared__Group__2"
    // InternalVaselina.g:1641:1: rule__VarDeclared__Group__2 : rule__VarDeclared__Group__2__Impl rule__VarDeclared__Group__3 ;
    public final void rule__VarDeclared__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1645:1: ( rule__VarDeclared__Group__2__Impl rule__VarDeclared__Group__3 )
            // InternalVaselina.g:1646:2: rule__VarDeclared__Group__2__Impl rule__VarDeclared__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__VarDeclared__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarDeclared__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclared__Group__2"


    // $ANTLR start "rule__VarDeclared__Group__2__Impl"
    // InternalVaselina.g:1653:1: rule__VarDeclared__Group__2__Impl : ( ':' ) ;
    public final void rule__VarDeclared__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1657:1: ( ( ':' ) )
            // InternalVaselina.g:1658:1: ( ':' )
            {
            // InternalVaselina.g:1658:1: ( ':' )
            // InternalVaselina.g:1659:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclaredAccess().getColonKeyword_2()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclaredAccess().getColonKeyword_2()); 
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
    // $ANTLR end "rule__VarDeclared__Group__2__Impl"


    // $ANTLR start "rule__VarDeclared__Group__3"
    // InternalVaselina.g:1668:1: rule__VarDeclared__Group__3 : rule__VarDeclared__Group__3__Impl ;
    public final void rule__VarDeclared__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1672:1: ( rule__VarDeclared__Group__3__Impl )
            // InternalVaselina.g:1673:2: rule__VarDeclared__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclared__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclared__Group__3"


    // $ANTLR start "rule__VarDeclared__Group__3__Impl"
    // InternalVaselina.g:1679:1: rule__VarDeclared__Group__3__Impl : ( ( rule__VarDeclared__TypeAssignment_3 ) ) ;
    public final void rule__VarDeclared__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1683:1: ( ( ( rule__VarDeclared__TypeAssignment_3 ) ) )
            // InternalVaselina.g:1684:1: ( ( rule__VarDeclared__TypeAssignment_3 ) )
            {
            // InternalVaselina.g:1684:1: ( ( rule__VarDeclared__TypeAssignment_3 ) )
            // InternalVaselina.g:1685:2: ( rule__VarDeclared__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclaredAccess().getTypeAssignment_3()); 
            }
            // InternalVaselina.g:1686:2: ( rule__VarDeclared__TypeAssignment_3 )
            // InternalVaselina.g:1686:3: rule__VarDeclared__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclared__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclaredAccess().getTypeAssignment_3()); 
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
    // $ANTLR end "rule__VarDeclared__Group__3__Impl"


    // $ANTLR start "rule__VarDeclared__Group_1_0__0"
    // InternalVaselina.g:1695:1: rule__VarDeclared__Group_1_0__0 : rule__VarDeclared__Group_1_0__0__Impl rule__VarDeclared__Group_1_0__1 ;
    public final void rule__VarDeclared__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1699:1: ( rule__VarDeclared__Group_1_0__0__Impl rule__VarDeclared__Group_1_0__1 )
            // InternalVaselina.g:1700:2: rule__VarDeclared__Group_1_0__0__Impl rule__VarDeclared__Group_1_0__1
            {
            pushFollow(FOLLOW_13);
            rule__VarDeclared__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarDeclared__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclared__Group_1_0__0"


    // $ANTLR start "rule__VarDeclared__Group_1_0__0__Impl"
    // InternalVaselina.g:1707:1: rule__VarDeclared__Group_1_0__0__Impl : ( ( rule__VarDeclared__ScopeAssignment_1_0_0 ) ) ;
    public final void rule__VarDeclared__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1711:1: ( ( ( rule__VarDeclared__ScopeAssignment_1_0_0 ) ) )
            // InternalVaselina.g:1712:1: ( ( rule__VarDeclared__ScopeAssignment_1_0_0 ) )
            {
            // InternalVaselina.g:1712:1: ( ( rule__VarDeclared__ScopeAssignment_1_0_0 ) )
            // InternalVaselina.g:1713:2: ( rule__VarDeclared__ScopeAssignment_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclaredAccess().getScopeAssignment_1_0_0()); 
            }
            // InternalVaselina.g:1714:2: ( rule__VarDeclared__ScopeAssignment_1_0_0 )
            // InternalVaselina.g:1714:3: rule__VarDeclared__ScopeAssignment_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclared__ScopeAssignment_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclaredAccess().getScopeAssignment_1_0_0()); 
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
    // $ANTLR end "rule__VarDeclared__Group_1_0__0__Impl"


    // $ANTLR start "rule__VarDeclared__Group_1_0__1"
    // InternalVaselina.g:1722:1: rule__VarDeclared__Group_1_0__1 : rule__VarDeclared__Group_1_0__1__Impl ;
    public final void rule__VarDeclared__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1726:1: ( rule__VarDeclared__Group_1_0__1__Impl )
            // InternalVaselina.g:1727:2: rule__VarDeclared__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclared__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclared__Group_1_0__1"


    // $ANTLR start "rule__VarDeclared__Group_1_0__1__Impl"
    // InternalVaselina.g:1733:1: rule__VarDeclared__Group_1_0__1__Impl : ( ( rule__VarDeclared__NameAssignment_1_0_1 ) ) ;
    public final void rule__VarDeclared__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1737:1: ( ( ( rule__VarDeclared__NameAssignment_1_0_1 ) ) )
            // InternalVaselina.g:1738:1: ( ( rule__VarDeclared__NameAssignment_1_0_1 ) )
            {
            // InternalVaselina.g:1738:1: ( ( rule__VarDeclared__NameAssignment_1_0_1 ) )
            // InternalVaselina.g:1739:2: ( rule__VarDeclared__NameAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclaredAccess().getNameAssignment_1_0_1()); 
            }
            // InternalVaselina.g:1740:2: ( rule__VarDeclared__NameAssignment_1_0_1 )
            // InternalVaselina.g:1740:3: rule__VarDeclared__NameAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclared__NameAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclaredAccess().getNameAssignment_1_0_1()); 
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
    // $ANTLR end "rule__VarDeclared__Group_1_0__1__Impl"


    // $ANTLR start "rule__VarDeclared__Group_1_1__0"
    // InternalVaselina.g:1749:1: rule__VarDeclared__Group_1_1__0 : rule__VarDeclared__Group_1_1__0__Impl rule__VarDeclared__Group_1_1__1 ;
    public final void rule__VarDeclared__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1753:1: ( rule__VarDeclared__Group_1_1__0__Impl rule__VarDeclared__Group_1_1__1 )
            // InternalVaselina.g:1754:2: rule__VarDeclared__Group_1_1__0__Impl rule__VarDeclared__Group_1_1__1
            {
            pushFollow(FOLLOW_13);
            rule__VarDeclared__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarDeclared__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclared__Group_1_1__0"


    // $ANTLR start "rule__VarDeclared__Group_1_1__0__Impl"
    // InternalVaselina.g:1761:1: rule__VarDeclared__Group_1_1__0__Impl : ( ( rule__VarDeclared__ScopeAssignment_1_1_0 ) ) ;
    public final void rule__VarDeclared__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1765:1: ( ( ( rule__VarDeclared__ScopeAssignment_1_1_0 ) ) )
            // InternalVaselina.g:1766:1: ( ( rule__VarDeclared__ScopeAssignment_1_1_0 ) )
            {
            // InternalVaselina.g:1766:1: ( ( rule__VarDeclared__ScopeAssignment_1_1_0 ) )
            // InternalVaselina.g:1767:2: ( rule__VarDeclared__ScopeAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclaredAccess().getScopeAssignment_1_1_0()); 
            }
            // InternalVaselina.g:1768:2: ( rule__VarDeclared__ScopeAssignment_1_1_0 )
            // InternalVaselina.g:1768:3: rule__VarDeclared__ScopeAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclared__ScopeAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclaredAccess().getScopeAssignment_1_1_0()); 
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
    // $ANTLR end "rule__VarDeclared__Group_1_1__0__Impl"


    // $ANTLR start "rule__VarDeclared__Group_1_1__1"
    // InternalVaselina.g:1776:1: rule__VarDeclared__Group_1_1__1 : rule__VarDeclared__Group_1_1__1__Impl rule__VarDeclared__Group_1_1__2 ;
    public final void rule__VarDeclared__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1780:1: ( rule__VarDeclared__Group_1_1__1__Impl rule__VarDeclared__Group_1_1__2 )
            // InternalVaselina.g:1781:2: rule__VarDeclared__Group_1_1__1__Impl rule__VarDeclared__Group_1_1__2
            {
            pushFollow(FOLLOW_14);
            rule__VarDeclared__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarDeclared__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclared__Group_1_1__1"


    // $ANTLR start "rule__VarDeclared__Group_1_1__1__Impl"
    // InternalVaselina.g:1788:1: rule__VarDeclared__Group_1_1__1__Impl : ( ( rule__VarDeclared__NameAssignment_1_1_1 ) ) ;
    public final void rule__VarDeclared__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1792:1: ( ( ( rule__VarDeclared__NameAssignment_1_1_1 ) ) )
            // InternalVaselina.g:1793:1: ( ( rule__VarDeclared__NameAssignment_1_1_1 ) )
            {
            // InternalVaselina.g:1793:1: ( ( rule__VarDeclared__NameAssignment_1_1_1 ) )
            // InternalVaselina.g:1794:2: ( rule__VarDeclared__NameAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclaredAccess().getNameAssignment_1_1_1()); 
            }
            // InternalVaselina.g:1795:2: ( rule__VarDeclared__NameAssignment_1_1_1 )
            // InternalVaselina.g:1795:3: rule__VarDeclared__NameAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclared__NameAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclaredAccess().getNameAssignment_1_1_1()); 
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
    // $ANTLR end "rule__VarDeclared__Group_1_1__1__Impl"


    // $ANTLR start "rule__VarDeclared__Group_1_1__2"
    // InternalVaselina.g:1803:1: rule__VarDeclared__Group_1_1__2 : rule__VarDeclared__Group_1_1__2__Impl ;
    public final void rule__VarDeclared__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1807:1: ( rule__VarDeclared__Group_1_1__2__Impl )
            // InternalVaselina.g:1808:2: rule__VarDeclared__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDeclared__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDeclared__Group_1_1__2"


    // $ANTLR start "rule__VarDeclared__Group_1_1__2__Impl"
    // InternalVaselina.g:1814:1: rule__VarDeclared__Group_1_1__2__Impl : ( ( ( rule__VarDeclared__DimAssignment_1_1_2 ) ) ( ( rule__VarDeclared__DimAssignment_1_1_2 )* ) ) ;
    public final void rule__VarDeclared__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1818:1: ( ( ( ( rule__VarDeclared__DimAssignment_1_1_2 ) ) ( ( rule__VarDeclared__DimAssignment_1_1_2 )* ) ) )
            // InternalVaselina.g:1819:1: ( ( ( rule__VarDeclared__DimAssignment_1_1_2 ) ) ( ( rule__VarDeclared__DimAssignment_1_1_2 )* ) )
            {
            // InternalVaselina.g:1819:1: ( ( ( rule__VarDeclared__DimAssignment_1_1_2 ) ) ( ( rule__VarDeclared__DimAssignment_1_1_2 )* ) )
            // InternalVaselina.g:1820:2: ( ( rule__VarDeclared__DimAssignment_1_1_2 ) ) ( ( rule__VarDeclared__DimAssignment_1_1_2 )* )
            {
            // InternalVaselina.g:1820:2: ( ( rule__VarDeclared__DimAssignment_1_1_2 ) )
            // InternalVaselina.g:1821:3: ( rule__VarDeclared__DimAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclaredAccess().getDimAssignment_1_1_2()); 
            }
            // InternalVaselina.g:1822:3: ( rule__VarDeclared__DimAssignment_1_1_2 )
            // InternalVaselina.g:1822:4: rule__VarDeclared__DimAssignment_1_1_2
            {
            pushFollow(FOLLOW_15);
            rule__VarDeclared__DimAssignment_1_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclaredAccess().getDimAssignment_1_1_2()); 
            }

            }

            // InternalVaselina.g:1825:2: ( ( rule__VarDeclared__DimAssignment_1_1_2 )* )
            // InternalVaselina.g:1826:3: ( rule__VarDeclared__DimAssignment_1_1_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclaredAccess().getDimAssignment_1_1_2()); 
            }
            // InternalVaselina.g:1827:3: ( rule__VarDeclared__DimAssignment_1_1_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==43) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalVaselina.g:1827:4: rule__VarDeclared__DimAssignment_1_1_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__VarDeclared__DimAssignment_1_1_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclaredAccess().getDimAssignment_1_1_2()); 
            }

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
    // $ANTLR end "rule__VarDeclared__Group_1_1__2__Impl"


    // $ANTLR start "rule__VarAssignment__Group__0"
    // InternalVaselina.g:1837:1: rule__VarAssignment__Group__0 : rule__VarAssignment__Group__0__Impl rule__VarAssignment__Group__1 ;
    public final void rule__VarAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1841:1: ( rule__VarAssignment__Group__0__Impl rule__VarAssignment__Group__1 )
            // InternalVaselina.g:1842:2: rule__VarAssignment__Group__0__Impl rule__VarAssignment__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__VarAssignment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarAssignment__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssignment__Group__0"


    // $ANTLR start "rule__VarAssignment__Group__0__Impl"
    // InternalVaselina.g:1849:1: rule__VarAssignment__Group__0__Impl : ( ( rule__VarAssignment__VariableAssignment_0 ) ) ;
    public final void rule__VarAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1853:1: ( ( ( rule__VarAssignment__VariableAssignment_0 ) ) )
            // InternalVaselina.g:1854:1: ( ( rule__VarAssignment__VariableAssignment_0 ) )
            {
            // InternalVaselina.g:1854:1: ( ( rule__VarAssignment__VariableAssignment_0 ) )
            // InternalVaselina.g:1855:2: ( rule__VarAssignment__VariableAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignmentAccess().getVariableAssignment_0()); 
            }
            // InternalVaselina.g:1856:2: ( rule__VarAssignment__VariableAssignment_0 )
            // InternalVaselina.g:1856:3: rule__VarAssignment__VariableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VarAssignment__VariableAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignmentAccess().getVariableAssignment_0()); 
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
    // $ANTLR end "rule__VarAssignment__Group__0__Impl"


    // $ANTLR start "rule__VarAssignment__Group__1"
    // InternalVaselina.g:1864:1: rule__VarAssignment__Group__1 : rule__VarAssignment__Group__1__Impl rule__VarAssignment__Group__2 ;
    public final void rule__VarAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1868:1: ( rule__VarAssignment__Group__1__Impl rule__VarAssignment__Group__2 )
            // InternalVaselina.g:1869:2: rule__VarAssignment__Group__1__Impl rule__VarAssignment__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__VarAssignment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarAssignment__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssignment__Group__1"


    // $ANTLR start "rule__VarAssignment__Group__1__Impl"
    // InternalVaselina.g:1876:1: rule__VarAssignment__Group__1__Impl : ( 'holds' ) ;
    public final void rule__VarAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1880:1: ( ( 'holds' ) )
            // InternalVaselina.g:1881:1: ( 'holds' )
            {
            // InternalVaselina.g:1881:1: ( 'holds' )
            // InternalVaselina.g:1882:2: 'holds'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignmentAccess().getHoldsKeyword_1()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignmentAccess().getHoldsKeyword_1()); 
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
    // $ANTLR end "rule__VarAssignment__Group__1__Impl"


    // $ANTLR start "rule__VarAssignment__Group__2"
    // InternalVaselina.g:1891:1: rule__VarAssignment__Group__2 : rule__VarAssignment__Group__2__Impl ;
    public final void rule__VarAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1895:1: ( rule__VarAssignment__Group__2__Impl )
            // InternalVaselina.g:1896:2: rule__VarAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarAssignment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarAssignment__Group__2"


    // $ANTLR start "rule__VarAssignment__Group__2__Impl"
    // InternalVaselina.g:1902:1: rule__VarAssignment__Group__2__Impl : ( ( rule__VarAssignment__ExprAssignment_2 ) ) ;
    public final void rule__VarAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1906:1: ( ( ( rule__VarAssignment__ExprAssignment_2 ) ) )
            // InternalVaselina.g:1907:1: ( ( rule__VarAssignment__ExprAssignment_2 ) )
            {
            // InternalVaselina.g:1907:1: ( ( rule__VarAssignment__ExprAssignment_2 ) )
            // InternalVaselina.g:1908:2: ( rule__VarAssignment__ExprAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignmentAccess().getExprAssignment_2()); 
            }
            // InternalVaselina.g:1909:2: ( rule__VarAssignment__ExprAssignment_2 )
            // InternalVaselina.g:1909:3: rule__VarAssignment__ExprAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VarAssignment__ExprAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignmentAccess().getExprAssignment_2()); 
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
    // $ANTLR end "rule__VarAssignment__Group__2__Impl"


    // $ANTLR start "rule__ArrayRefs__Group__0"
    // InternalVaselina.g:1918:1: rule__ArrayRefs__Group__0 : rule__ArrayRefs__Group__0__Impl rule__ArrayRefs__Group__1 ;
    public final void rule__ArrayRefs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1922:1: ( rule__ArrayRefs__Group__0__Impl rule__ArrayRefs__Group__1 )
            // InternalVaselina.g:1923:2: rule__ArrayRefs__Group__0__Impl rule__ArrayRefs__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ArrayRefs__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayRefs__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayRefs__Group__0"


    // $ANTLR start "rule__ArrayRefs__Group__0__Impl"
    // InternalVaselina.g:1930:1: rule__ArrayRefs__Group__0__Impl : ( () ) ;
    public final void rule__ArrayRefs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1934:1: ( ( () ) )
            // InternalVaselina.g:1935:1: ( () )
            {
            // InternalVaselina.g:1935:1: ( () )
            // InternalVaselina.g:1936:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayRefsAccess().getArrayRefsAction_0()); 
            }
            // InternalVaselina.g:1937:2: ()
            // InternalVaselina.g:1937:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayRefsAccess().getArrayRefsAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayRefs__Group__0__Impl"


    // $ANTLR start "rule__ArrayRefs__Group__1"
    // InternalVaselina.g:1945:1: rule__ArrayRefs__Group__1 : rule__ArrayRefs__Group__1__Impl rule__ArrayRefs__Group__2 ;
    public final void rule__ArrayRefs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1949:1: ( rule__ArrayRefs__Group__1__Impl rule__ArrayRefs__Group__2 )
            // InternalVaselina.g:1950:2: rule__ArrayRefs__Group__1__Impl rule__ArrayRefs__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ArrayRefs__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayRefs__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayRefs__Group__1"


    // $ANTLR start "rule__ArrayRefs__Group__1__Impl"
    // InternalVaselina.g:1957:1: rule__ArrayRefs__Group__1__Impl : ( ( rule__ArrayRefs__ArrRefsAssignment_1 ) ) ;
    public final void rule__ArrayRefs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1961:1: ( ( ( rule__ArrayRefs__ArrRefsAssignment_1 ) ) )
            // InternalVaselina.g:1962:1: ( ( rule__ArrayRefs__ArrRefsAssignment_1 ) )
            {
            // InternalVaselina.g:1962:1: ( ( rule__ArrayRefs__ArrRefsAssignment_1 ) )
            // InternalVaselina.g:1963:2: ( rule__ArrayRefs__ArrRefsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayRefsAccess().getArrRefsAssignment_1()); 
            }
            // InternalVaselina.g:1964:2: ( rule__ArrayRefs__ArrRefsAssignment_1 )
            // InternalVaselina.g:1964:3: rule__ArrayRefs__ArrRefsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ArrayRefs__ArrRefsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayRefsAccess().getArrRefsAssignment_1()); 
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
    // $ANTLR end "rule__ArrayRefs__Group__1__Impl"


    // $ANTLR start "rule__ArrayRefs__Group__2"
    // InternalVaselina.g:1972:1: rule__ArrayRefs__Group__2 : rule__ArrayRefs__Group__2__Impl ;
    public final void rule__ArrayRefs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1976:1: ( rule__ArrayRefs__Group__2__Impl )
            // InternalVaselina.g:1977:2: rule__ArrayRefs__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayRefs__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayRefs__Group__2"


    // $ANTLR start "rule__ArrayRefs__Group__2__Impl"
    // InternalVaselina.g:1983:1: rule__ArrayRefs__Group__2__Impl : ( ( ( rule__ArrayRefs__DimsAssignment_2 ) ) ( ( rule__ArrayRefs__DimsAssignment_2 )* ) ) ;
    public final void rule__ArrayRefs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:1987:1: ( ( ( ( rule__ArrayRefs__DimsAssignment_2 ) ) ( ( rule__ArrayRefs__DimsAssignment_2 )* ) ) )
            // InternalVaselina.g:1988:1: ( ( ( rule__ArrayRefs__DimsAssignment_2 ) ) ( ( rule__ArrayRefs__DimsAssignment_2 )* ) )
            {
            // InternalVaselina.g:1988:1: ( ( ( rule__ArrayRefs__DimsAssignment_2 ) ) ( ( rule__ArrayRefs__DimsAssignment_2 )* ) )
            // InternalVaselina.g:1989:2: ( ( rule__ArrayRefs__DimsAssignment_2 ) ) ( ( rule__ArrayRefs__DimsAssignment_2 )* )
            {
            // InternalVaselina.g:1989:2: ( ( rule__ArrayRefs__DimsAssignment_2 ) )
            // InternalVaselina.g:1990:3: ( rule__ArrayRefs__DimsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayRefsAccess().getDimsAssignment_2()); 
            }
            // InternalVaselina.g:1991:3: ( rule__ArrayRefs__DimsAssignment_2 )
            // InternalVaselina.g:1991:4: rule__ArrayRefs__DimsAssignment_2
            {
            pushFollow(FOLLOW_15);
            rule__ArrayRefs__DimsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayRefsAccess().getDimsAssignment_2()); 
            }

            }

            // InternalVaselina.g:1994:2: ( ( rule__ArrayRefs__DimsAssignment_2 )* )
            // InternalVaselina.g:1995:3: ( rule__ArrayRefs__DimsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayRefsAccess().getDimsAssignment_2()); 
            }
            // InternalVaselina.g:1996:3: ( rule__ArrayRefs__DimsAssignment_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==43) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalVaselina.g:1996:4: rule__ArrayRefs__DimsAssignment_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ArrayRefs__DimsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayRefsAccess().getDimsAssignment_2()); 
            }

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
    // $ANTLR end "rule__ArrayRefs__Group__2__Impl"


    // $ANTLR start "rule__VarRefs__Group__0"
    // InternalVaselina.g:2006:1: rule__VarRefs__Group__0 : rule__VarRefs__Group__0__Impl rule__VarRefs__Group__1 ;
    public final void rule__VarRefs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2010:1: ( rule__VarRefs__Group__0__Impl rule__VarRefs__Group__1 )
            // InternalVaselina.g:2011:2: rule__VarRefs__Group__0__Impl rule__VarRefs__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__VarRefs__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VarRefs__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarRefs__Group__0"


    // $ANTLR start "rule__VarRefs__Group__0__Impl"
    // InternalVaselina.g:2018:1: rule__VarRefs__Group__0__Impl : ( () ) ;
    public final void rule__VarRefs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2022:1: ( ( () ) )
            // InternalVaselina.g:2023:1: ( () )
            {
            // InternalVaselina.g:2023:1: ( () )
            // InternalVaselina.g:2024:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarRefsAccess().getVarRefsAction_0()); 
            }
            // InternalVaselina.g:2025:2: ()
            // InternalVaselina.g:2025:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarRefsAccess().getVarRefsAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarRefs__Group__0__Impl"


    // $ANTLR start "rule__VarRefs__Group__1"
    // InternalVaselina.g:2033:1: rule__VarRefs__Group__1 : rule__VarRefs__Group__1__Impl ;
    public final void rule__VarRefs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2037:1: ( rule__VarRefs__Group__1__Impl )
            // InternalVaselina.g:2038:2: rule__VarRefs__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarRefs__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarRefs__Group__1"


    // $ANTLR start "rule__VarRefs__Group__1__Impl"
    // InternalVaselina.g:2044:1: rule__VarRefs__Group__1__Impl : ( ( rule__VarRefs__VaRefsAssignment_1 ) ) ;
    public final void rule__VarRefs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2048:1: ( ( ( rule__VarRefs__VaRefsAssignment_1 ) ) )
            // InternalVaselina.g:2049:1: ( ( rule__VarRefs__VaRefsAssignment_1 ) )
            {
            // InternalVaselina.g:2049:1: ( ( rule__VarRefs__VaRefsAssignment_1 ) )
            // InternalVaselina.g:2050:2: ( rule__VarRefs__VaRefsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarRefsAccess().getVaRefsAssignment_1()); 
            }
            // InternalVaselina.g:2051:2: ( rule__VarRefs__VaRefsAssignment_1 )
            // InternalVaselina.g:2051:3: rule__VarRefs__VaRefsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VarRefs__VaRefsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarRefsAccess().getVaRefsAssignment_1()); 
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
    // $ANTLR end "rule__VarRefs__Group__1__Impl"


    // $ANTLR start "rule__ArrayDimension__Group__0"
    // InternalVaselina.g:2060:1: rule__ArrayDimension__Group__0 : rule__ArrayDimension__Group__0__Impl rule__ArrayDimension__Group__1 ;
    public final void rule__ArrayDimension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2064:1: ( rule__ArrayDimension__Group__0__Impl rule__ArrayDimension__Group__1 )
            // InternalVaselina.g:2065:2: rule__ArrayDimension__Group__0__Impl rule__ArrayDimension__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ArrayDimension__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayDimension__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayDimension__Group__0"


    // $ANTLR start "rule__ArrayDimension__Group__0__Impl"
    // InternalVaselina.g:2072:1: rule__ArrayDimension__Group__0__Impl : ( () ) ;
    public final void rule__ArrayDimension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2076:1: ( ( () ) )
            // InternalVaselina.g:2077:1: ( () )
            {
            // InternalVaselina.g:2077:1: ( () )
            // InternalVaselina.g:2078:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayDimensionAccess().getArrayDimensionAction_0()); 
            }
            // InternalVaselina.g:2079:2: ()
            // InternalVaselina.g:2079:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayDimensionAccess().getArrayDimensionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayDimension__Group__0__Impl"


    // $ANTLR start "rule__ArrayDimension__Group__1"
    // InternalVaselina.g:2087:1: rule__ArrayDimension__Group__1 : rule__ArrayDimension__Group__1__Impl rule__ArrayDimension__Group__2 ;
    public final void rule__ArrayDimension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2091:1: ( rule__ArrayDimension__Group__1__Impl rule__ArrayDimension__Group__2 )
            // InternalVaselina.g:2092:2: rule__ArrayDimension__Group__1__Impl rule__ArrayDimension__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ArrayDimension__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayDimension__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayDimension__Group__1"


    // $ANTLR start "rule__ArrayDimension__Group__1__Impl"
    // InternalVaselina.g:2099:1: rule__ArrayDimension__Group__1__Impl : ( '[' ) ;
    public final void rule__ArrayDimension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2103:1: ( ( '[' ) )
            // InternalVaselina.g:2104:1: ( '[' )
            {
            // InternalVaselina.g:2104:1: ( '[' )
            // InternalVaselina.g:2105:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayDimensionAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayDimensionAccess().getLeftSquareBracketKeyword_1()); 
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
    // $ANTLR end "rule__ArrayDimension__Group__1__Impl"


    // $ANTLR start "rule__ArrayDimension__Group__2"
    // InternalVaselina.g:2114:1: rule__ArrayDimension__Group__2 : rule__ArrayDimension__Group__2__Impl rule__ArrayDimension__Group__3 ;
    public final void rule__ArrayDimension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2118:1: ( rule__ArrayDimension__Group__2__Impl rule__ArrayDimension__Group__3 )
            // InternalVaselina.g:2119:2: rule__ArrayDimension__Group__2__Impl rule__ArrayDimension__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__ArrayDimension__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ArrayDimension__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayDimension__Group__2"


    // $ANTLR start "rule__ArrayDimension__Group__2__Impl"
    // InternalVaselina.g:2126:1: rule__ArrayDimension__Group__2__Impl : ( ( rule__ArrayDimension__IndexAssignment_2 ) ) ;
    public final void rule__ArrayDimension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2130:1: ( ( ( rule__ArrayDimension__IndexAssignment_2 ) ) )
            // InternalVaselina.g:2131:1: ( ( rule__ArrayDimension__IndexAssignment_2 ) )
            {
            // InternalVaselina.g:2131:1: ( ( rule__ArrayDimension__IndexAssignment_2 ) )
            // InternalVaselina.g:2132:2: ( rule__ArrayDimension__IndexAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayDimensionAccess().getIndexAssignment_2()); 
            }
            // InternalVaselina.g:2133:2: ( rule__ArrayDimension__IndexAssignment_2 )
            // InternalVaselina.g:2133:3: rule__ArrayDimension__IndexAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ArrayDimension__IndexAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayDimensionAccess().getIndexAssignment_2()); 
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
    // $ANTLR end "rule__ArrayDimension__Group__2__Impl"


    // $ANTLR start "rule__ArrayDimension__Group__3"
    // InternalVaselina.g:2141:1: rule__ArrayDimension__Group__3 : rule__ArrayDimension__Group__3__Impl ;
    public final void rule__ArrayDimension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2145:1: ( rule__ArrayDimension__Group__3__Impl )
            // InternalVaselina.g:2146:2: rule__ArrayDimension__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayDimension__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayDimension__Group__3"


    // $ANTLR start "rule__ArrayDimension__Group__3__Impl"
    // InternalVaselina.g:2152:1: rule__ArrayDimension__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayDimension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2156:1: ( ( ']' ) )
            // InternalVaselina.g:2157:1: ( ']' )
            {
            // InternalVaselina.g:2157:1: ( ']' )
            // InternalVaselina.g:2158:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayDimensionAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayDimensionAccess().getRightSquareBracketKeyword_3()); 
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
    // $ANTLR end "rule__ArrayDimension__Group__3__Impl"


    // $ANTLR start "rule__FuncCall__Group__0"
    // InternalVaselina.g:2168:1: rule__FuncCall__Group__0 : rule__FuncCall__Group__0__Impl rule__FuncCall__Group__1 ;
    public final void rule__FuncCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2172:1: ( rule__FuncCall__Group__0__Impl rule__FuncCall__Group__1 )
            // InternalVaselina.g:2173:2: rule__FuncCall__Group__0__Impl rule__FuncCall__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__FuncCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FuncCall__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCall__Group__0"


    // $ANTLR start "rule__FuncCall__Group__0__Impl"
    // InternalVaselina.g:2180:1: rule__FuncCall__Group__0__Impl : ( () ) ;
    public final void rule__FuncCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2184:1: ( ( () ) )
            // InternalVaselina.g:2185:1: ( () )
            {
            // InternalVaselina.g:2185:1: ( () )
            // InternalVaselina.g:2186:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallAccess().getFuncCallAction_0()); 
            }
            // InternalVaselina.g:2187:2: ()
            // InternalVaselina.g:2187:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallAccess().getFuncCallAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCall__Group__0__Impl"


    // $ANTLR start "rule__FuncCall__Group__1"
    // InternalVaselina.g:2195:1: rule__FuncCall__Group__1 : rule__FuncCall__Group__1__Impl rule__FuncCall__Group__2 ;
    public final void rule__FuncCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2199:1: ( rule__FuncCall__Group__1__Impl rule__FuncCall__Group__2 )
            // InternalVaselina.g:2200:2: rule__FuncCall__Group__1__Impl rule__FuncCall__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__FuncCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FuncCall__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCall__Group__1"


    // $ANTLR start "rule__FuncCall__Group__1__Impl"
    // InternalVaselina.g:2207:1: rule__FuncCall__Group__1__Impl : ( ( rule__FuncCall__FuncAssignment_1 ) ) ;
    public final void rule__FuncCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2211:1: ( ( ( rule__FuncCall__FuncAssignment_1 ) ) )
            // InternalVaselina.g:2212:1: ( ( rule__FuncCall__FuncAssignment_1 ) )
            {
            // InternalVaselina.g:2212:1: ( ( rule__FuncCall__FuncAssignment_1 ) )
            // InternalVaselina.g:2213:2: ( rule__FuncCall__FuncAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallAccess().getFuncAssignment_1()); 
            }
            // InternalVaselina.g:2214:2: ( rule__FuncCall__FuncAssignment_1 )
            // InternalVaselina.g:2214:3: rule__FuncCall__FuncAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FuncCall__FuncAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallAccess().getFuncAssignment_1()); 
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
    // $ANTLR end "rule__FuncCall__Group__1__Impl"


    // $ANTLR start "rule__FuncCall__Group__2"
    // InternalVaselina.g:2222:1: rule__FuncCall__Group__2 : rule__FuncCall__Group__2__Impl rule__FuncCall__Group__3 ;
    public final void rule__FuncCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2226:1: ( rule__FuncCall__Group__2__Impl rule__FuncCall__Group__3 )
            // InternalVaselina.g:2227:2: rule__FuncCall__Group__2__Impl rule__FuncCall__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__FuncCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FuncCall__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCall__Group__2"


    // $ANTLR start "rule__FuncCall__Group__2__Impl"
    // InternalVaselina.g:2234:1: rule__FuncCall__Group__2__Impl : ( 'using' ) ;
    public final void rule__FuncCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2238:1: ( ( 'using' ) )
            // InternalVaselina.g:2239:1: ( 'using' )
            {
            // InternalVaselina.g:2239:1: ( 'using' )
            // InternalVaselina.g:2240:2: 'using'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallAccess().getUsingKeyword_2()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallAccess().getUsingKeyword_2()); 
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
    // $ANTLR end "rule__FuncCall__Group__2__Impl"


    // $ANTLR start "rule__FuncCall__Group__3"
    // InternalVaselina.g:2249:1: rule__FuncCall__Group__3 : rule__FuncCall__Group__3__Impl rule__FuncCall__Group__4 ;
    public final void rule__FuncCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2253:1: ( rule__FuncCall__Group__3__Impl rule__FuncCall__Group__4 )
            // InternalVaselina.g:2254:2: rule__FuncCall__Group__3__Impl rule__FuncCall__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__FuncCall__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FuncCall__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCall__Group__3"


    // $ANTLR start "rule__FuncCall__Group__3__Impl"
    // InternalVaselina.g:2261:1: rule__FuncCall__Group__3__Impl : ( ':' ) ;
    public final void rule__FuncCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2265:1: ( ( ':' ) )
            // InternalVaselina.g:2266:1: ( ':' )
            {
            // InternalVaselina.g:2266:1: ( ':' )
            // InternalVaselina.g:2267:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallAccess().getColonKeyword_3()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallAccess().getColonKeyword_3()); 
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
    // $ANTLR end "rule__FuncCall__Group__3__Impl"


    // $ANTLR start "rule__FuncCall__Group__4"
    // InternalVaselina.g:2276:1: rule__FuncCall__Group__4 : rule__FuncCall__Group__4__Impl rule__FuncCall__Group__5 ;
    public final void rule__FuncCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2280:1: ( rule__FuncCall__Group__4__Impl rule__FuncCall__Group__5 )
            // InternalVaselina.g:2281:2: rule__FuncCall__Group__4__Impl rule__FuncCall__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__FuncCall__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FuncCall__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCall__Group__4"


    // $ANTLR start "rule__FuncCall__Group__4__Impl"
    // InternalVaselina.g:2288:1: rule__FuncCall__Group__4__Impl : ( ( rule__FuncCall__Group_4__0 )? ) ;
    public final void rule__FuncCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2292:1: ( ( ( rule__FuncCall__Group_4__0 )? ) )
            // InternalVaselina.g:2293:1: ( ( rule__FuncCall__Group_4__0 )? )
            {
            // InternalVaselina.g:2293:1: ( ( rule__FuncCall__Group_4__0 )? )
            // InternalVaselina.g:2294:2: ( rule__FuncCall__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallAccess().getGroup_4()); 
            }
            // InternalVaselina.g:2295:2: ( rule__FuncCall__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_NUM && LA21_0<=RULE_STRING)||(LA21_0>=17 && LA21_0<=24)||(LA21_0>=35 && LA21_0<=36)||LA21_0==62||LA21_0==64) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalVaselina.g:2295:3: rule__FuncCall__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FuncCall__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallAccess().getGroup_4()); 
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
    // $ANTLR end "rule__FuncCall__Group__4__Impl"


    // $ANTLR start "rule__FuncCall__Group__5"
    // InternalVaselina.g:2303:1: rule__FuncCall__Group__5 : rule__FuncCall__Group__5__Impl ;
    public final void rule__FuncCall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2307:1: ( rule__FuncCall__Group__5__Impl )
            // InternalVaselina.g:2308:2: rule__FuncCall__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncCall__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCall__Group__5"


    // $ANTLR start "rule__FuncCall__Group__5__Impl"
    // InternalVaselina.g:2314:1: rule__FuncCall__Group__5__Impl : ( ':' ) ;
    public final void rule__FuncCall__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2318:1: ( ( ':' ) )
            // InternalVaselina.g:2319:1: ( ':' )
            {
            // InternalVaselina.g:2319:1: ( ':' )
            // InternalVaselina.g:2320:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallAccess().getColonKeyword_5()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallAccess().getColonKeyword_5()); 
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
    // $ANTLR end "rule__FuncCall__Group__5__Impl"


    // $ANTLR start "rule__FuncCall__Group_4__0"
    // InternalVaselina.g:2330:1: rule__FuncCall__Group_4__0 : rule__FuncCall__Group_4__0__Impl rule__FuncCall__Group_4__1 ;
    public final void rule__FuncCall__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2334:1: ( rule__FuncCall__Group_4__0__Impl rule__FuncCall__Group_4__1 )
            // InternalVaselina.g:2335:2: rule__FuncCall__Group_4__0__Impl rule__FuncCall__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__FuncCall__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FuncCall__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCall__Group_4__0"


    // $ANTLR start "rule__FuncCall__Group_4__0__Impl"
    // InternalVaselina.g:2342:1: rule__FuncCall__Group_4__0__Impl : ( ( rule__FuncCall__ArgsAssignment_4_0 ) ) ;
    public final void rule__FuncCall__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2346:1: ( ( ( rule__FuncCall__ArgsAssignment_4_0 ) ) )
            // InternalVaselina.g:2347:1: ( ( rule__FuncCall__ArgsAssignment_4_0 ) )
            {
            // InternalVaselina.g:2347:1: ( ( rule__FuncCall__ArgsAssignment_4_0 ) )
            // InternalVaselina.g:2348:2: ( rule__FuncCall__ArgsAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallAccess().getArgsAssignment_4_0()); 
            }
            // InternalVaselina.g:2349:2: ( rule__FuncCall__ArgsAssignment_4_0 )
            // InternalVaselina.g:2349:3: rule__FuncCall__ArgsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__FuncCall__ArgsAssignment_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallAccess().getArgsAssignment_4_0()); 
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
    // $ANTLR end "rule__FuncCall__Group_4__0__Impl"


    // $ANTLR start "rule__FuncCall__Group_4__1"
    // InternalVaselina.g:2357:1: rule__FuncCall__Group_4__1 : rule__FuncCall__Group_4__1__Impl ;
    public final void rule__FuncCall__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2361:1: ( rule__FuncCall__Group_4__1__Impl )
            // InternalVaselina.g:2362:2: rule__FuncCall__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncCall__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCall__Group_4__1"


    // $ANTLR start "rule__FuncCall__Group_4__1__Impl"
    // InternalVaselina.g:2368:1: rule__FuncCall__Group_4__1__Impl : ( ( rule__FuncCall__Group_4_1__0 )* ) ;
    public final void rule__FuncCall__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2372:1: ( ( ( rule__FuncCall__Group_4_1__0 )* ) )
            // InternalVaselina.g:2373:1: ( ( rule__FuncCall__Group_4_1__0 )* )
            {
            // InternalVaselina.g:2373:1: ( ( rule__FuncCall__Group_4_1__0 )* )
            // InternalVaselina.g:2374:2: ( rule__FuncCall__Group_4_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallAccess().getGroup_4_1()); 
            }
            // InternalVaselina.g:2375:2: ( rule__FuncCall__Group_4_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==46) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalVaselina.g:2375:3: rule__FuncCall__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__FuncCall__Group_4_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallAccess().getGroup_4_1()); 
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
    // $ANTLR end "rule__FuncCall__Group_4__1__Impl"


    // $ANTLR start "rule__FuncCall__Group_4_1__0"
    // InternalVaselina.g:2384:1: rule__FuncCall__Group_4_1__0 : rule__FuncCall__Group_4_1__0__Impl rule__FuncCall__Group_4_1__1 ;
    public final void rule__FuncCall__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2388:1: ( rule__FuncCall__Group_4_1__0__Impl rule__FuncCall__Group_4_1__1 )
            // InternalVaselina.g:2389:2: rule__FuncCall__Group_4_1__0__Impl rule__FuncCall__Group_4_1__1
            {
            pushFollow(FOLLOW_9);
            rule__FuncCall__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FuncCall__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCall__Group_4_1__0"


    // $ANTLR start "rule__FuncCall__Group_4_1__0__Impl"
    // InternalVaselina.g:2396:1: rule__FuncCall__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__FuncCall__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2400:1: ( ( ',' ) )
            // InternalVaselina.g:2401:1: ( ',' )
            {
            // InternalVaselina.g:2401:1: ( ',' )
            // InternalVaselina.g:2402:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallAccess().getCommaKeyword_4_1_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallAccess().getCommaKeyword_4_1_0()); 
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
    // $ANTLR end "rule__FuncCall__Group_4_1__0__Impl"


    // $ANTLR start "rule__FuncCall__Group_4_1__1"
    // InternalVaselina.g:2411:1: rule__FuncCall__Group_4_1__1 : rule__FuncCall__Group_4_1__1__Impl ;
    public final void rule__FuncCall__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2415:1: ( rule__FuncCall__Group_4_1__1__Impl )
            // InternalVaselina.g:2416:2: rule__FuncCall__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncCall__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncCall__Group_4_1__1"


    // $ANTLR start "rule__FuncCall__Group_4_1__1__Impl"
    // InternalVaselina.g:2422:1: rule__FuncCall__Group_4_1__1__Impl : ( ( rule__FuncCall__ArgsAssignment_4_1_1 ) ) ;
    public final void rule__FuncCall__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2426:1: ( ( ( rule__FuncCall__ArgsAssignment_4_1_1 ) ) )
            // InternalVaselina.g:2427:1: ( ( rule__FuncCall__ArgsAssignment_4_1_1 ) )
            {
            // InternalVaselina.g:2427:1: ( ( rule__FuncCall__ArgsAssignment_4_1_1 ) )
            // InternalVaselina.g:2428:2: ( rule__FuncCall__ArgsAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallAccess().getArgsAssignment_4_1_1()); 
            }
            // InternalVaselina.g:2429:2: ( rule__FuncCall__ArgsAssignment_4_1_1 )
            // InternalVaselina.g:2429:3: rule__FuncCall__ArgsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FuncCall__ArgsAssignment_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallAccess().getArgsAssignment_4_1_1()); 
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
    // $ANTLR end "rule__FuncCall__Group_4_1__1__Impl"


    // $ANTLR start "rule__FuncDefinition__Group__0"
    // InternalVaselina.g:2438:1: rule__FuncDefinition__Group__0 : rule__FuncDefinition__Group__0__Impl rule__FuncDefinition__Group__1 ;
    public final void rule__FuncDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2442:1: ( rule__FuncDefinition__Group__0__Impl rule__FuncDefinition__Group__1 )
            // InternalVaselina.g:2443:2: rule__FuncDefinition__Group__0__Impl rule__FuncDefinition__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__FuncDefinition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FuncDefinition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncDefinition__Group__0"


    // $ANTLR start "rule__FuncDefinition__Group__0__Impl"
    // InternalVaselina.g:2450:1: rule__FuncDefinition__Group__0__Impl : ( 'braze' ) ;
    public final void rule__FuncDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2454:1: ( ( 'braze' ) )
            // InternalVaselina.g:2455:1: ( 'braze' )
            {
            // InternalVaselina.g:2455:1: ( 'braze' )
            // InternalVaselina.g:2456:2: 'braze'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncDefinitionAccess().getBrazeKeyword_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncDefinitionAccess().getBrazeKeyword_0()); 
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
    // $ANTLR end "rule__FuncDefinition__Group__0__Impl"


    // $ANTLR start "rule__FuncDefinition__Group__1"
    // InternalVaselina.g:2465:1: rule__FuncDefinition__Group__1 : rule__FuncDefinition__Group__1__Impl rule__FuncDefinition__Group__2 ;
    public final void rule__FuncDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2469:1: ( rule__FuncDefinition__Group__1__Impl rule__FuncDefinition__Group__2 )
            // InternalVaselina.g:2470:2: rule__FuncDefinition__Group__1__Impl rule__FuncDefinition__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__FuncDefinition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FuncDefinition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncDefinition__Group__1"


    // $ANTLR start "rule__FuncDefinition__Group__1__Impl"
    // InternalVaselina.g:2477:1: rule__FuncDefinition__Group__1__Impl : ( ( rule__FuncDefinition__NameAssignment_1 ) ) ;
    public final void rule__FuncDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2481:1: ( ( ( rule__FuncDefinition__NameAssignment_1 ) ) )
            // InternalVaselina.g:2482:1: ( ( rule__FuncDefinition__NameAssignment_1 ) )
            {
            // InternalVaselina.g:2482:1: ( ( rule__FuncDefinition__NameAssignment_1 ) )
            // InternalVaselina.g:2483:2: ( rule__FuncDefinition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncDefinitionAccess().getNameAssignment_1()); 
            }
            // InternalVaselina.g:2484:2: ( rule__FuncDefinition__NameAssignment_1 )
            // InternalVaselina.g:2484:3: rule__FuncDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FuncDefinition__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncDefinitionAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__FuncDefinition__Group__1__Impl"


    // $ANTLR start "rule__FuncDefinition__Group__2"
    // InternalVaselina.g:2492:1: rule__FuncDefinition__Group__2 : rule__FuncDefinition__Group__2__Impl rule__FuncDefinition__Group__3 ;
    public final void rule__FuncDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2496:1: ( rule__FuncDefinition__Group__2__Impl rule__FuncDefinition__Group__3 )
            // InternalVaselina.g:2497:2: rule__FuncDefinition__Group__2__Impl rule__FuncDefinition__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__FuncDefinition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FuncDefinition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncDefinition__Group__2"


    // $ANTLR start "rule__FuncDefinition__Group__2__Impl"
    // InternalVaselina.g:2504:1: rule__FuncDefinition__Group__2__Impl : ( 'with' ) ;
    public final void rule__FuncDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2508:1: ( ( 'with' ) )
            // InternalVaselina.g:2509:1: ( 'with' )
            {
            // InternalVaselina.g:2509:1: ( 'with' )
            // InternalVaselina.g:2510:2: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncDefinitionAccess().getWithKeyword_2()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncDefinitionAccess().getWithKeyword_2()); 
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
    // $ANTLR end "rule__FuncDefinition__Group__2__Impl"


    // $ANTLR start "rule__FuncDefinition__Group__3"
    // InternalVaselina.g:2519:1: rule__FuncDefinition__Group__3 : rule__FuncDefinition__Group__3__Impl rule__FuncDefinition__Group__4 ;
    public final void rule__FuncDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2523:1: ( rule__FuncDefinition__Group__3__Impl rule__FuncDefinition__Group__4 )
            // InternalVaselina.g:2524:2: rule__FuncDefinition__Group__3__Impl rule__FuncDefinition__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__FuncDefinition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FuncDefinition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncDefinition__Group__3"


    // $ANTLR start "rule__FuncDefinition__Group__3__Impl"
    // InternalVaselina.g:2531:1: rule__FuncDefinition__Group__3__Impl : ( ( rule__FuncDefinition__Alternatives_3 ) ) ;
    public final void rule__FuncDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2535:1: ( ( ( rule__FuncDefinition__Alternatives_3 ) ) )
            // InternalVaselina.g:2536:1: ( ( rule__FuncDefinition__Alternatives_3 ) )
            {
            // InternalVaselina.g:2536:1: ( ( rule__FuncDefinition__Alternatives_3 ) )
            // InternalVaselina.g:2537:2: ( rule__FuncDefinition__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncDefinitionAccess().getAlternatives_3()); 
            }
            // InternalVaselina.g:2538:2: ( rule__FuncDefinition__Alternatives_3 )
            // InternalVaselina.g:2538:3: rule__FuncDefinition__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__FuncDefinition__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncDefinitionAccess().getAlternatives_3()); 
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
    // $ANTLR end "rule__FuncDefinition__Group__3__Impl"


    // $ANTLR start "rule__FuncDefinition__Group__4"
    // InternalVaselina.g:2546:1: rule__FuncDefinition__Group__4 : rule__FuncDefinition__Group__4__Impl rule__FuncDefinition__Group__5 ;
    public final void rule__FuncDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2550:1: ( rule__FuncDefinition__Group__4__Impl rule__FuncDefinition__Group__5 )
            // InternalVaselina.g:2551:2: rule__FuncDefinition__Group__4__Impl rule__FuncDefinition__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__FuncDefinition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FuncDefinition__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncDefinition__Group__4"


    // $ANTLR start "rule__FuncDefinition__Group__4__Impl"
    // InternalVaselina.g:2558:1: rule__FuncDefinition__Group__4__Impl : ( '->' ) ;
    public final void rule__FuncDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2562:1: ( ( '->' ) )
            // InternalVaselina.g:2563:1: ( '->' )
            {
            // InternalVaselina.g:2563:1: ( '->' )
            // InternalVaselina.g:2564:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
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
    // $ANTLR end "rule__FuncDefinition__Group__4__Impl"


    // $ANTLR start "rule__FuncDefinition__Group__5"
    // InternalVaselina.g:2573:1: rule__FuncDefinition__Group__5 : rule__FuncDefinition__Group__5__Impl rule__FuncDefinition__Group__6 ;
    public final void rule__FuncDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2577:1: ( rule__FuncDefinition__Group__5__Impl rule__FuncDefinition__Group__6 )
            // InternalVaselina.g:2578:2: rule__FuncDefinition__Group__5__Impl rule__FuncDefinition__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__FuncDefinition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FuncDefinition__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncDefinition__Group__5"


    // $ANTLR start "rule__FuncDefinition__Group__5__Impl"
    // InternalVaselina.g:2585:1: rule__FuncDefinition__Group__5__Impl : ( ( rule__FuncDefinition__BodyAssignment_5 )* ) ;
    public final void rule__FuncDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2589:1: ( ( ( rule__FuncDefinition__BodyAssignment_5 )* ) )
            // InternalVaselina.g:2590:1: ( ( rule__FuncDefinition__BodyAssignment_5 )* )
            {
            // InternalVaselina.g:2590:1: ( ( rule__FuncDefinition__BodyAssignment_5 )* )
            // InternalVaselina.g:2591:2: ( rule__FuncDefinition__BodyAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncDefinitionAccess().getBodyAssignment_5()); 
            }
            // InternalVaselina.g:2592:2: ( rule__FuncDefinition__BodyAssignment_5 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||(LA23_0>=17 && LA23_0<=24)||LA23_0==40||LA23_0==51||LA23_0==56||LA23_0==59||(LA23_0>=65 && LA23_0<=67)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalVaselina.g:2592:3: rule__FuncDefinition__BodyAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__FuncDefinition__BodyAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncDefinitionAccess().getBodyAssignment_5()); 
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
    // $ANTLR end "rule__FuncDefinition__Group__5__Impl"


    // $ANTLR start "rule__FuncDefinition__Group__6"
    // InternalVaselina.g:2600:1: rule__FuncDefinition__Group__6 : rule__FuncDefinition__Group__6__Impl rule__FuncDefinition__Group__7 ;
    public final void rule__FuncDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2604:1: ( rule__FuncDefinition__Group__6__Impl rule__FuncDefinition__Group__7 )
            // InternalVaselina.g:2605:2: rule__FuncDefinition__Group__6__Impl rule__FuncDefinition__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__FuncDefinition__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FuncDefinition__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncDefinition__Group__6"


    // $ANTLR start "rule__FuncDefinition__Group__6__Impl"
    // InternalVaselina.g:2612:1: rule__FuncDefinition__Group__6__Impl : ( 'and' ) ;
    public final void rule__FuncDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2616:1: ( ( 'and' ) )
            // InternalVaselina.g:2617:1: ( 'and' )
            {
            // InternalVaselina.g:2617:1: ( 'and' )
            // InternalVaselina.g:2618:2: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncDefinitionAccess().getAndKeyword_6()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncDefinitionAccess().getAndKeyword_6()); 
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
    // $ANTLR end "rule__FuncDefinition__Group__6__Impl"


    // $ANTLR start "rule__FuncDefinition__Group__7"
    // InternalVaselina.g:2627:1: rule__FuncDefinition__Group__7 : rule__FuncDefinition__Group__7__Impl ;
    public final void rule__FuncDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2631:1: ( rule__FuncDefinition__Group__7__Impl )
            // InternalVaselina.g:2632:2: rule__FuncDefinition__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncDefinition__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncDefinition__Group__7"


    // $ANTLR start "rule__FuncDefinition__Group__7__Impl"
    // InternalVaselina.g:2638:1: rule__FuncDefinition__Group__7__Impl : ( 'vaselina' ) ;
    public final void rule__FuncDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2642:1: ( ( 'vaselina' ) )
            // InternalVaselina.g:2643:1: ( 'vaselina' )
            {
            // InternalVaselina.g:2643:1: ( 'vaselina' )
            // InternalVaselina.g:2644:2: 'vaselina'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncDefinitionAccess().getVaselinaKeyword_7()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncDefinitionAccess().getVaselinaKeyword_7()); 
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
    // $ANTLR end "rule__FuncDefinition__Group__7__Impl"


    // $ANTLR start "rule__FuncDefinition__Group_3_0__0"
    // InternalVaselina.g:2654:1: rule__FuncDefinition__Group_3_0__0 : rule__FuncDefinition__Group_3_0__0__Impl rule__FuncDefinition__Group_3_0__1 ;
    public final void rule__FuncDefinition__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2658:1: ( rule__FuncDefinition__Group_3_0__0__Impl rule__FuncDefinition__Group_3_0__1 )
            // InternalVaselina.g:2659:2: rule__FuncDefinition__Group_3_0__0__Impl rule__FuncDefinition__Group_3_0__1
            {
            pushFollow(FOLLOW_20);
            rule__FuncDefinition__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FuncDefinition__Group_3_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncDefinition__Group_3_0__0"


    // $ANTLR start "rule__FuncDefinition__Group_3_0__0__Impl"
    // InternalVaselina.g:2666:1: rule__FuncDefinition__Group_3_0__0__Impl : ( ( rule__FuncDefinition__ArgsAssignment_3_0_0 ) ) ;
    public final void rule__FuncDefinition__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2670:1: ( ( ( rule__FuncDefinition__ArgsAssignment_3_0_0 ) ) )
            // InternalVaselina.g:2671:1: ( ( rule__FuncDefinition__ArgsAssignment_3_0_0 ) )
            {
            // InternalVaselina.g:2671:1: ( ( rule__FuncDefinition__ArgsAssignment_3_0_0 ) )
            // InternalVaselina.g:2672:2: ( rule__FuncDefinition__ArgsAssignment_3_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncDefinitionAccess().getArgsAssignment_3_0_0()); 
            }
            // InternalVaselina.g:2673:2: ( rule__FuncDefinition__ArgsAssignment_3_0_0 )
            // InternalVaselina.g:2673:3: rule__FuncDefinition__ArgsAssignment_3_0_0
            {
            pushFollow(FOLLOW_2);
            rule__FuncDefinition__ArgsAssignment_3_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncDefinitionAccess().getArgsAssignment_3_0_0()); 
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
    // $ANTLR end "rule__FuncDefinition__Group_3_0__0__Impl"


    // $ANTLR start "rule__FuncDefinition__Group_3_0__1"
    // InternalVaselina.g:2681:1: rule__FuncDefinition__Group_3_0__1 : rule__FuncDefinition__Group_3_0__1__Impl ;
    public final void rule__FuncDefinition__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2685:1: ( rule__FuncDefinition__Group_3_0__1__Impl )
            // InternalVaselina.g:2686:2: rule__FuncDefinition__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncDefinition__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncDefinition__Group_3_0__1"


    // $ANTLR start "rule__FuncDefinition__Group_3_0__1__Impl"
    // InternalVaselina.g:2692:1: rule__FuncDefinition__Group_3_0__1__Impl : ( ( rule__FuncDefinition__Group_3_0_1__0 )* ) ;
    public final void rule__FuncDefinition__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2696:1: ( ( ( rule__FuncDefinition__Group_3_0_1__0 )* ) )
            // InternalVaselina.g:2697:1: ( ( rule__FuncDefinition__Group_3_0_1__0 )* )
            {
            // InternalVaselina.g:2697:1: ( ( rule__FuncDefinition__Group_3_0_1__0 )* )
            // InternalVaselina.g:2698:2: ( rule__FuncDefinition__Group_3_0_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncDefinitionAccess().getGroup_3_0_1()); 
            }
            // InternalVaselina.g:2699:2: ( rule__FuncDefinition__Group_3_0_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==46) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalVaselina.g:2699:3: rule__FuncDefinition__Group_3_0_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__FuncDefinition__Group_3_0_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncDefinitionAccess().getGroup_3_0_1()); 
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
    // $ANTLR end "rule__FuncDefinition__Group_3_0__1__Impl"


    // $ANTLR start "rule__FuncDefinition__Group_3_0_1__0"
    // InternalVaselina.g:2708:1: rule__FuncDefinition__Group_3_0_1__0 : rule__FuncDefinition__Group_3_0_1__0__Impl rule__FuncDefinition__Group_3_0_1__1 ;
    public final void rule__FuncDefinition__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2712:1: ( rule__FuncDefinition__Group_3_0_1__0__Impl rule__FuncDefinition__Group_3_0_1__1 )
            // InternalVaselina.g:2713:2: rule__FuncDefinition__Group_3_0_1__0__Impl rule__FuncDefinition__Group_3_0_1__1
            {
            pushFollow(FOLLOW_12);
            rule__FuncDefinition__Group_3_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FuncDefinition__Group_3_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncDefinition__Group_3_0_1__0"


    // $ANTLR start "rule__FuncDefinition__Group_3_0_1__0__Impl"
    // InternalVaselina.g:2720:1: rule__FuncDefinition__Group_3_0_1__0__Impl : ( ',' ) ;
    public final void rule__FuncDefinition__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2724:1: ( ( ',' ) )
            // InternalVaselina.g:2725:1: ( ',' )
            {
            // InternalVaselina.g:2725:1: ( ',' )
            // InternalVaselina.g:2726:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncDefinitionAccess().getCommaKeyword_3_0_1_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncDefinitionAccess().getCommaKeyword_3_0_1_0()); 
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
    // $ANTLR end "rule__FuncDefinition__Group_3_0_1__0__Impl"


    // $ANTLR start "rule__FuncDefinition__Group_3_0_1__1"
    // InternalVaselina.g:2735:1: rule__FuncDefinition__Group_3_0_1__1 : rule__FuncDefinition__Group_3_0_1__1__Impl ;
    public final void rule__FuncDefinition__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2739:1: ( rule__FuncDefinition__Group_3_0_1__1__Impl )
            // InternalVaselina.g:2740:2: rule__FuncDefinition__Group_3_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncDefinition__Group_3_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncDefinition__Group_3_0_1__1"


    // $ANTLR start "rule__FuncDefinition__Group_3_0_1__1__Impl"
    // InternalVaselina.g:2746:1: rule__FuncDefinition__Group_3_0_1__1__Impl : ( ( rule__FuncDefinition__ArgsAssignment_3_0_1_1 ) ) ;
    public final void rule__FuncDefinition__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2750:1: ( ( ( rule__FuncDefinition__ArgsAssignment_3_0_1_1 ) ) )
            // InternalVaselina.g:2751:1: ( ( rule__FuncDefinition__ArgsAssignment_3_0_1_1 ) )
            {
            // InternalVaselina.g:2751:1: ( ( rule__FuncDefinition__ArgsAssignment_3_0_1_1 ) )
            // InternalVaselina.g:2752:2: ( rule__FuncDefinition__ArgsAssignment_3_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncDefinitionAccess().getArgsAssignment_3_0_1_1()); 
            }
            // InternalVaselina.g:2753:2: ( rule__FuncDefinition__ArgsAssignment_3_0_1_1 )
            // InternalVaselina.g:2753:3: rule__FuncDefinition__ArgsAssignment_3_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FuncDefinition__ArgsAssignment_3_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncDefinitionAccess().getArgsAssignment_3_0_1_1()); 
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
    // $ANTLR end "rule__FuncDefinition__Group_3_0_1__1__Impl"


    // $ANTLR start "rule__FuncTypedDeclaration__Group__0"
    // InternalVaselina.g:2762:1: rule__FuncTypedDeclaration__Group__0 : rule__FuncTypedDeclaration__Group__0__Impl rule__FuncTypedDeclaration__Group__1 ;
    public final void rule__FuncTypedDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2766:1: ( rule__FuncTypedDeclaration__Group__0__Impl rule__FuncTypedDeclaration__Group__1 )
            // InternalVaselina.g:2767:2: rule__FuncTypedDeclaration__Group__0__Impl rule__FuncTypedDeclaration__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__FuncTypedDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FuncTypedDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncTypedDeclaration__Group__0"


    // $ANTLR start "rule__FuncTypedDeclaration__Group__0__Impl"
    // InternalVaselina.g:2774:1: rule__FuncTypedDeclaration__Group__0__Impl : ( ( rule__FuncTypedDeclaration__TypeAssignment_0 ) ) ;
    public final void rule__FuncTypedDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2778:1: ( ( ( rule__FuncTypedDeclaration__TypeAssignment_0 ) ) )
            // InternalVaselina.g:2779:1: ( ( rule__FuncTypedDeclaration__TypeAssignment_0 ) )
            {
            // InternalVaselina.g:2779:1: ( ( rule__FuncTypedDeclaration__TypeAssignment_0 ) )
            // InternalVaselina.g:2780:2: ( rule__FuncTypedDeclaration__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncTypedDeclarationAccess().getTypeAssignment_0()); 
            }
            // InternalVaselina.g:2781:2: ( rule__FuncTypedDeclaration__TypeAssignment_0 )
            // InternalVaselina.g:2781:3: rule__FuncTypedDeclaration__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FuncTypedDeclaration__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncTypedDeclarationAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__FuncTypedDeclaration__Group__0__Impl"


    // $ANTLR start "rule__FuncTypedDeclaration__Group__1"
    // InternalVaselina.g:2789:1: rule__FuncTypedDeclaration__Group__1 : rule__FuncTypedDeclaration__Group__1__Impl ;
    public final void rule__FuncTypedDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2793:1: ( rule__FuncTypedDeclaration__Group__1__Impl )
            // InternalVaselina.g:2794:2: rule__FuncTypedDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncTypedDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncTypedDeclaration__Group__1"


    // $ANTLR start "rule__FuncTypedDeclaration__Group__1__Impl"
    // InternalVaselina.g:2800:1: rule__FuncTypedDeclaration__Group__1__Impl : ( ( rule__FuncTypedDeclaration__NameAssignment_1 ) ) ;
    public final void rule__FuncTypedDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2804:1: ( ( ( rule__FuncTypedDeclaration__NameAssignment_1 ) ) )
            // InternalVaselina.g:2805:1: ( ( rule__FuncTypedDeclaration__NameAssignment_1 ) )
            {
            // InternalVaselina.g:2805:1: ( ( rule__FuncTypedDeclaration__NameAssignment_1 ) )
            // InternalVaselina.g:2806:2: ( rule__FuncTypedDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncTypedDeclarationAccess().getNameAssignment_1()); 
            }
            // InternalVaselina.g:2807:2: ( rule__FuncTypedDeclaration__NameAssignment_1 )
            // InternalVaselina.g:2807:3: rule__FuncTypedDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FuncTypedDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncTypedDeclarationAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__FuncTypedDeclaration__Group__1__Impl"


    // $ANTLR start "rule__StdFunction__Group__0"
    // InternalVaselina.g:2816:1: rule__StdFunction__Group__0 : rule__StdFunction__Group__0__Impl rule__StdFunction__Group__1 ;
    public final void rule__StdFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2820:1: ( rule__StdFunction__Group__0__Impl rule__StdFunction__Group__1 )
            // InternalVaselina.g:2821:2: rule__StdFunction__Group__0__Impl rule__StdFunction__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__StdFunction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StdFunction__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StdFunction__Group__0"


    // $ANTLR start "rule__StdFunction__Group__0__Impl"
    // InternalVaselina.g:2828:1: rule__StdFunction__Group__0__Impl : ( () ) ;
    public final void rule__StdFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2832:1: ( ( () ) )
            // InternalVaselina.g:2833:1: ( () )
            {
            // InternalVaselina.g:2833:1: ( () )
            // InternalVaselina.g:2834:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStdFunctionAccess().getStdFunctionAction_0()); 
            }
            // InternalVaselina.g:2835:2: ()
            // InternalVaselina.g:2835:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStdFunctionAccess().getStdFunctionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StdFunction__Group__0__Impl"


    // $ANTLR start "rule__StdFunction__Group__1"
    // InternalVaselina.g:2843:1: rule__StdFunction__Group__1 : rule__StdFunction__Group__1__Impl rule__StdFunction__Group__2 ;
    public final void rule__StdFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2847:1: ( rule__StdFunction__Group__1__Impl rule__StdFunction__Group__2 )
            // InternalVaselina.g:2848:2: rule__StdFunction__Group__1__Impl rule__StdFunction__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__StdFunction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StdFunction__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StdFunction__Group__1"


    // $ANTLR start "rule__StdFunction__Group__1__Impl"
    // InternalVaselina.g:2855:1: rule__StdFunction__Group__1__Impl : ( ( rule__StdFunction__NameAssignment_1 ) ) ;
    public final void rule__StdFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2859:1: ( ( ( rule__StdFunction__NameAssignment_1 ) ) )
            // InternalVaselina.g:2860:1: ( ( rule__StdFunction__NameAssignment_1 ) )
            {
            // InternalVaselina.g:2860:1: ( ( rule__StdFunction__NameAssignment_1 ) )
            // InternalVaselina.g:2861:2: ( rule__StdFunction__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStdFunctionAccess().getNameAssignment_1()); 
            }
            // InternalVaselina.g:2862:2: ( rule__StdFunction__NameAssignment_1 )
            // InternalVaselina.g:2862:3: rule__StdFunction__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StdFunction__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStdFunctionAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__StdFunction__Group__1__Impl"


    // $ANTLR start "rule__StdFunction__Group__2"
    // InternalVaselina.g:2870:1: rule__StdFunction__Group__2 : rule__StdFunction__Group__2__Impl rule__StdFunction__Group__3 ;
    public final void rule__StdFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2874:1: ( rule__StdFunction__Group__2__Impl rule__StdFunction__Group__3 )
            // InternalVaselina.g:2875:2: rule__StdFunction__Group__2__Impl rule__StdFunction__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__StdFunction__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StdFunction__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StdFunction__Group__2"


    // $ANTLR start "rule__StdFunction__Group__2__Impl"
    // InternalVaselina.g:2882:1: rule__StdFunction__Group__2__Impl : ( 'using' ) ;
    public final void rule__StdFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2886:1: ( ( 'using' ) )
            // InternalVaselina.g:2887:1: ( 'using' )
            {
            // InternalVaselina.g:2887:1: ( 'using' )
            // InternalVaselina.g:2888:2: 'using'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStdFunctionAccess().getUsingKeyword_2()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStdFunctionAccess().getUsingKeyword_2()); 
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
    // $ANTLR end "rule__StdFunction__Group__2__Impl"


    // $ANTLR start "rule__StdFunction__Group__3"
    // InternalVaselina.g:2897:1: rule__StdFunction__Group__3 : rule__StdFunction__Group__3__Impl rule__StdFunction__Group__4 ;
    public final void rule__StdFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2901:1: ( rule__StdFunction__Group__3__Impl rule__StdFunction__Group__4 )
            // InternalVaselina.g:2902:2: rule__StdFunction__Group__3__Impl rule__StdFunction__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__StdFunction__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StdFunction__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StdFunction__Group__3"


    // $ANTLR start "rule__StdFunction__Group__3__Impl"
    // InternalVaselina.g:2909:1: rule__StdFunction__Group__3__Impl : ( ':' ) ;
    public final void rule__StdFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2913:1: ( ( ':' ) )
            // InternalVaselina.g:2914:1: ( ':' )
            {
            // InternalVaselina.g:2914:1: ( ':' )
            // InternalVaselina.g:2915:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStdFunctionAccess().getColonKeyword_3()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStdFunctionAccess().getColonKeyword_3()); 
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
    // $ANTLR end "rule__StdFunction__Group__3__Impl"


    // $ANTLR start "rule__StdFunction__Group__4"
    // InternalVaselina.g:2924:1: rule__StdFunction__Group__4 : rule__StdFunction__Group__4__Impl rule__StdFunction__Group__5 ;
    public final void rule__StdFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2928:1: ( rule__StdFunction__Group__4__Impl rule__StdFunction__Group__5 )
            // InternalVaselina.g:2929:2: rule__StdFunction__Group__4__Impl rule__StdFunction__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__StdFunction__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StdFunction__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StdFunction__Group__4"


    // $ANTLR start "rule__StdFunction__Group__4__Impl"
    // InternalVaselina.g:2936:1: rule__StdFunction__Group__4__Impl : ( ( rule__StdFunction__Group_4__0 )? ) ;
    public final void rule__StdFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2940:1: ( ( ( rule__StdFunction__Group_4__0 )? ) )
            // InternalVaselina.g:2941:1: ( ( rule__StdFunction__Group_4__0 )? )
            {
            // InternalVaselina.g:2941:1: ( ( rule__StdFunction__Group_4__0 )? )
            // InternalVaselina.g:2942:2: ( rule__StdFunction__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStdFunctionAccess().getGroup_4()); 
            }
            // InternalVaselina.g:2943:2: ( rule__StdFunction__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_NUM && LA25_0<=RULE_STRING)||(LA25_0>=17 && LA25_0<=24)||(LA25_0>=35 && LA25_0<=36)||LA25_0==62||LA25_0==64) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalVaselina.g:2943:3: rule__StdFunction__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StdFunction__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStdFunctionAccess().getGroup_4()); 
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
    // $ANTLR end "rule__StdFunction__Group__4__Impl"


    // $ANTLR start "rule__StdFunction__Group__5"
    // InternalVaselina.g:2951:1: rule__StdFunction__Group__5 : rule__StdFunction__Group__5__Impl ;
    public final void rule__StdFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2955:1: ( rule__StdFunction__Group__5__Impl )
            // InternalVaselina.g:2956:2: rule__StdFunction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StdFunction__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StdFunction__Group__5"


    // $ANTLR start "rule__StdFunction__Group__5__Impl"
    // InternalVaselina.g:2962:1: rule__StdFunction__Group__5__Impl : ( ':' ) ;
    public final void rule__StdFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2966:1: ( ( ':' ) )
            // InternalVaselina.g:2967:1: ( ':' )
            {
            // InternalVaselina.g:2967:1: ( ':' )
            // InternalVaselina.g:2968:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStdFunctionAccess().getColonKeyword_5()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStdFunctionAccess().getColonKeyword_5()); 
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
    // $ANTLR end "rule__StdFunction__Group__5__Impl"


    // $ANTLR start "rule__StdFunction__Group_4__0"
    // InternalVaselina.g:2978:1: rule__StdFunction__Group_4__0 : rule__StdFunction__Group_4__0__Impl rule__StdFunction__Group_4__1 ;
    public final void rule__StdFunction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2982:1: ( rule__StdFunction__Group_4__0__Impl rule__StdFunction__Group_4__1 )
            // InternalVaselina.g:2983:2: rule__StdFunction__Group_4__0__Impl rule__StdFunction__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__StdFunction__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StdFunction__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StdFunction__Group_4__0"


    // $ANTLR start "rule__StdFunction__Group_4__0__Impl"
    // InternalVaselina.g:2990:1: rule__StdFunction__Group_4__0__Impl : ( ( rule__StdFunction__ArgsAssignment_4_0 ) ) ;
    public final void rule__StdFunction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:2994:1: ( ( ( rule__StdFunction__ArgsAssignment_4_0 ) ) )
            // InternalVaselina.g:2995:1: ( ( rule__StdFunction__ArgsAssignment_4_0 ) )
            {
            // InternalVaselina.g:2995:1: ( ( rule__StdFunction__ArgsAssignment_4_0 ) )
            // InternalVaselina.g:2996:2: ( rule__StdFunction__ArgsAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStdFunctionAccess().getArgsAssignment_4_0()); 
            }
            // InternalVaselina.g:2997:2: ( rule__StdFunction__ArgsAssignment_4_0 )
            // InternalVaselina.g:2997:3: rule__StdFunction__ArgsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__StdFunction__ArgsAssignment_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStdFunctionAccess().getArgsAssignment_4_0()); 
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
    // $ANTLR end "rule__StdFunction__Group_4__0__Impl"


    // $ANTLR start "rule__StdFunction__Group_4__1"
    // InternalVaselina.g:3005:1: rule__StdFunction__Group_4__1 : rule__StdFunction__Group_4__1__Impl ;
    public final void rule__StdFunction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3009:1: ( rule__StdFunction__Group_4__1__Impl )
            // InternalVaselina.g:3010:2: rule__StdFunction__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StdFunction__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StdFunction__Group_4__1"


    // $ANTLR start "rule__StdFunction__Group_4__1__Impl"
    // InternalVaselina.g:3016:1: rule__StdFunction__Group_4__1__Impl : ( ( rule__StdFunction__Group_4_1__0 )* ) ;
    public final void rule__StdFunction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3020:1: ( ( ( rule__StdFunction__Group_4_1__0 )* ) )
            // InternalVaselina.g:3021:1: ( ( rule__StdFunction__Group_4_1__0 )* )
            {
            // InternalVaselina.g:3021:1: ( ( rule__StdFunction__Group_4_1__0 )* )
            // InternalVaselina.g:3022:2: ( rule__StdFunction__Group_4_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStdFunctionAccess().getGroup_4_1()); 
            }
            // InternalVaselina.g:3023:2: ( rule__StdFunction__Group_4_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==46) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalVaselina.g:3023:3: rule__StdFunction__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__StdFunction__Group_4_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStdFunctionAccess().getGroup_4_1()); 
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
    // $ANTLR end "rule__StdFunction__Group_4__1__Impl"


    // $ANTLR start "rule__StdFunction__Group_4_1__0"
    // InternalVaselina.g:3032:1: rule__StdFunction__Group_4_1__0 : rule__StdFunction__Group_4_1__0__Impl rule__StdFunction__Group_4_1__1 ;
    public final void rule__StdFunction__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3036:1: ( rule__StdFunction__Group_4_1__0__Impl rule__StdFunction__Group_4_1__1 )
            // InternalVaselina.g:3037:2: rule__StdFunction__Group_4_1__0__Impl rule__StdFunction__Group_4_1__1
            {
            pushFollow(FOLLOW_9);
            rule__StdFunction__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StdFunction__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StdFunction__Group_4_1__0"


    // $ANTLR start "rule__StdFunction__Group_4_1__0__Impl"
    // InternalVaselina.g:3044:1: rule__StdFunction__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__StdFunction__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3048:1: ( ( ',' ) )
            // InternalVaselina.g:3049:1: ( ',' )
            {
            // InternalVaselina.g:3049:1: ( ',' )
            // InternalVaselina.g:3050:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStdFunctionAccess().getCommaKeyword_4_1_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStdFunctionAccess().getCommaKeyword_4_1_0()); 
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
    // $ANTLR end "rule__StdFunction__Group_4_1__0__Impl"


    // $ANTLR start "rule__StdFunction__Group_4_1__1"
    // InternalVaselina.g:3059:1: rule__StdFunction__Group_4_1__1 : rule__StdFunction__Group_4_1__1__Impl ;
    public final void rule__StdFunction__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3063:1: ( rule__StdFunction__Group_4_1__1__Impl )
            // InternalVaselina.g:3064:2: rule__StdFunction__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StdFunction__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StdFunction__Group_4_1__1"


    // $ANTLR start "rule__StdFunction__Group_4_1__1__Impl"
    // InternalVaselina.g:3070:1: rule__StdFunction__Group_4_1__1__Impl : ( ( rule__StdFunction__ArgsAssignment_4_1_1 ) ) ;
    public final void rule__StdFunction__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3074:1: ( ( ( rule__StdFunction__ArgsAssignment_4_1_1 ) ) )
            // InternalVaselina.g:3075:1: ( ( rule__StdFunction__ArgsAssignment_4_1_1 ) )
            {
            // InternalVaselina.g:3075:1: ( ( rule__StdFunction__ArgsAssignment_4_1_1 ) )
            // InternalVaselina.g:3076:2: ( rule__StdFunction__ArgsAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStdFunctionAccess().getArgsAssignment_4_1_1()); 
            }
            // InternalVaselina.g:3077:2: ( rule__StdFunction__ArgsAssignment_4_1_1 )
            // InternalVaselina.g:3077:3: rule__StdFunction__ArgsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__StdFunction__ArgsAssignment_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStdFunctionAccess().getArgsAssignment_4_1_1()); 
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
    // $ANTLR end "rule__StdFunction__Group_4_1__1__Impl"


    // $ANTLR start "rule__IfExpression__Group__0"
    // InternalVaselina.g:3086:1: rule__IfExpression__Group__0 : rule__IfExpression__Group__0__Impl rule__IfExpression__Group__1 ;
    public final void rule__IfExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3090:1: ( rule__IfExpression__Group__0__Impl rule__IfExpression__Group__1 )
            // InternalVaselina.g:3091:2: rule__IfExpression__Group__0__Impl rule__IfExpression__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__IfExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__0"


    // $ANTLR start "rule__IfExpression__Group__0__Impl"
    // InternalVaselina.g:3098:1: rule__IfExpression__Group__0__Impl : ( () ) ;
    public final void rule__IfExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3102:1: ( ( () ) )
            // InternalVaselina.g:3103:1: ( () )
            {
            // InternalVaselina.g:3103:1: ( () )
            // InternalVaselina.g:3104:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpressionAccess().getIfExpressionAction_0()); 
            }
            // InternalVaselina.g:3105:2: ()
            // InternalVaselina.g:3105:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpressionAccess().getIfExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__0__Impl"


    // $ANTLR start "rule__IfExpression__Group__1"
    // InternalVaselina.g:3113:1: rule__IfExpression__Group__1 : rule__IfExpression__Group__1__Impl rule__IfExpression__Group__2 ;
    public final void rule__IfExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3117:1: ( rule__IfExpression__Group__1__Impl rule__IfExpression__Group__2 )
            // InternalVaselina.g:3118:2: rule__IfExpression__Group__1__Impl rule__IfExpression__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__IfExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__1"


    // $ANTLR start "rule__IfExpression__Group__1__Impl"
    // InternalVaselina.g:3125:1: rule__IfExpression__Group__1__Impl : ( 'is' ) ;
    public final void rule__IfExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3129:1: ( ( 'is' ) )
            // InternalVaselina.g:3130:1: ( 'is' )
            {
            // InternalVaselina.g:3130:1: ( 'is' )
            // InternalVaselina.g:3131:2: 'is'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpressionAccess().getIsKeyword_1()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpressionAccess().getIsKeyword_1()); 
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
    // $ANTLR end "rule__IfExpression__Group__1__Impl"


    // $ANTLR start "rule__IfExpression__Group__2"
    // InternalVaselina.g:3140:1: rule__IfExpression__Group__2 : rule__IfExpression__Group__2__Impl rule__IfExpression__Group__3 ;
    public final void rule__IfExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3144:1: ( rule__IfExpression__Group__2__Impl rule__IfExpression__Group__3 )
            // InternalVaselina.g:3145:2: rule__IfExpression__Group__2__Impl rule__IfExpression__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__IfExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__2"


    // $ANTLR start "rule__IfExpression__Group__2__Impl"
    // InternalVaselina.g:3152:1: rule__IfExpression__Group__2__Impl : ( 'this' ) ;
    public final void rule__IfExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3156:1: ( ( 'this' ) )
            // InternalVaselina.g:3157:1: ( 'this' )
            {
            // InternalVaselina.g:3157:1: ( 'this' )
            // InternalVaselina.g:3158:2: 'this'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpressionAccess().getThisKeyword_2()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpressionAccess().getThisKeyword_2()); 
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
    // $ANTLR end "rule__IfExpression__Group__2__Impl"


    // $ANTLR start "rule__IfExpression__Group__3"
    // InternalVaselina.g:3167:1: rule__IfExpression__Group__3 : rule__IfExpression__Group__3__Impl rule__IfExpression__Group__4 ;
    public final void rule__IfExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3171:1: ( rule__IfExpression__Group__3__Impl rule__IfExpression__Group__4 )
            // InternalVaselina.g:3172:2: rule__IfExpression__Group__3__Impl rule__IfExpression__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__IfExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__3"


    // $ANTLR start "rule__IfExpression__Group__3__Impl"
    // InternalVaselina.g:3179:1: rule__IfExpression__Group__3__Impl : ( 'true?' ) ;
    public final void rule__IfExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3183:1: ( ( 'true?' ) )
            // InternalVaselina.g:3184:1: ( 'true?' )
            {
            // InternalVaselina.g:3184:1: ( 'true?' )
            // InternalVaselina.g:3185:2: 'true?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpressionAccess().getTrueKeyword_3()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpressionAccess().getTrueKeyword_3()); 
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
    // $ANTLR end "rule__IfExpression__Group__3__Impl"


    // $ANTLR start "rule__IfExpression__Group__4"
    // InternalVaselina.g:3194:1: rule__IfExpression__Group__4 : rule__IfExpression__Group__4__Impl rule__IfExpression__Group__5 ;
    public final void rule__IfExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3198:1: ( rule__IfExpression__Group__4__Impl rule__IfExpression__Group__5 )
            // InternalVaselina.g:3199:2: rule__IfExpression__Group__4__Impl rule__IfExpression__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__IfExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__4"


    // $ANTLR start "rule__IfExpression__Group__4__Impl"
    // InternalVaselina.g:3206:1: rule__IfExpression__Group__4__Impl : ( ':' ) ;
    public final void rule__IfExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3210:1: ( ( ':' ) )
            // InternalVaselina.g:3211:1: ( ':' )
            {
            // InternalVaselina.g:3211:1: ( ':' )
            // InternalVaselina.g:3212:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpressionAccess().getColonKeyword_4()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpressionAccess().getColonKeyword_4()); 
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
    // $ANTLR end "rule__IfExpression__Group__4__Impl"


    // $ANTLR start "rule__IfExpression__Group__5"
    // InternalVaselina.g:3221:1: rule__IfExpression__Group__5 : rule__IfExpression__Group__5__Impl rule__IfExpression__Group__6 ;
    public final void rule__IfExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3225:1: ( rule__IfExpression__Group__5__Impl rule__IfExpression__Group__6 )
            // InternalVaselina.g:3226:2: rule__IfExpression__Group__5__Impl rule__IfExpression__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__IfExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__5"


    // $ANTLR start "rule__IfExpression__Group__5__Impl"
    // InternalVaselina.g:3233:1: rule__IfExpression__Group__5__Impl : ( ( rule__IfExpression__IfconditonAssignment_5 ) ) ;
    public final void rule__IfExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3237:1: ( ( ( rule__IfExpression__IfconditonAssignment_5 ) ) )
            // InternalVaselina.g:3238:1: ( ( rule__IfExpression__IfconditonAssignment_5 ) )
            {
            // InternalVaselina.g:3238:1: ( ( rule__IfExpression__IfconditonAssignment_5 ) )
            // InternalVaselina.g:3239:2: ( rule__IfExpression__IfconditonAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpressionAccess().getIfconditonAssignment_5()); 
            }
            // InternalVaselina.g:3240:2: ( rule__IfExpression__IfconditonAssignment_5 )
            // InternalVaselina.g:3240:3: rule__IfExpression__IfconditonAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__IfExpression__IfconditonAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpressionAccess().getIfconditonAssignment_5()); 
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
    // $ANTLR end "rule__IfExpression__Group__5__Impl"


    // $ANTLR start "rule__IfExpression__Group__6"
    // InternalVaselina.g:3248:1: rule__IfExpression__Group__6 : rule__IfExpression__Group__6__Impl rule__IfExpression__Group__7 ;
    public final void rule__IfExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3252:1: ( rule__IfExpression__Group__6__Impl rule__IfExpression__Group__7 )
            // InternalVaselina.g:3253:2: rule__IfExpression__Group__6__Impl rule__IfExpression__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__IfExpression__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__6"


    // $ANTLR start "rule__IfExpression__Group__6__Impl"
    // InternalVaselina.g:3260:1: rule__IfExpression__Group__6__Impl : ( ':' ) ;
    public final void rule__IfExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3264:1: ( ( ':' ) )
            // InternalVaselina.g:3265:1: ( ':' )
            {
            // InternalVaselina.g:3265:1: ( ':' )
            // InternalVaselina.g:3266:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpressionAccess().getColonKeyword_6()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpressionAccess().getColonKeyword_6()); 
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
    // $ANTLR end "rule__IfExpression__Group__6__Impl"


    // $ANTLR start "rule__IfExpression__Group__7"
    // InternalVaselina.g:3275:1: rule__IfExpression__Group__7 : rule__IfExpression__Group__7__Impl rule__IfExpression__Group__8 ;
    public final void rule__IfExpression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3279:1: ( rule__IfExpression__Group__7__Impl rule__IfExpression__Group__8 )
            // InternalVaselina.g:3280:2: rule__IfExpression__Group__7__Impl rule__IfExpression__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__IfExpression__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__7"


    // $ANTLR start "rule__IfExpression__Group__7__Impl"
    // InternalVaselina.g:3287:1: rule__IfExpression__Group__7__Impl : ( 'yes' ) ;
    public final void rule__IfExpression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3291:1: ( ( 'yes' ) )
            // InternalVaselina.g:3292:1: ( 'yes' )
            {
            // InternalVaselina.g:3292:1: ( 'yes' )
            // InternalVaselina.g:3293:2: 'yes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpressionAccess().getYesKeyword_7()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpressionAccess().getYesKeyword_7()); 
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
    // $ANTLR end "rule__IfExpression__Group__7__Impl"


    // $ANTLR start "rule__IfExpression__Group__8"
    // InternalVaselina.g:3302:1: rule__IfExpression__Group__8 : rule__IfExpression__Group__8__Impl rule__IfExpression__Group__9 ;
    public final void rule__IfExpression__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3306:1: ( rule__IfExpression__Group__8__Impl rule__IfExpression__Group__9 )
            // InternalVaselina.g:3307:2: rule__IfExpression__Group__8__Impl rule__IfExpression__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__IfExpression__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__8"


    // $ANTLR start "rule__IfExpression__Group__8__Impl"
    // InternalVaselina.g:3314:1: rule__IfExpression__Group__8__Impl : ( '->' ) ;
    public final void rule__IfExpression__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3318:1: ( ( '->' ) )
            // InternalVaselina.g:3319:1: ( '->' )
            {
            // InternalVaselina.g:3319:1: ( '->' )
            // InternalVaselina.g:3320:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpressionAccess().getHyphenMinusGreaterThanSignKeyword_8()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpressionAccess().getHyphenMinusGreaterThanSignKeyword_8()); 
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
    // $ANTLR end "rule__IfExpression__Group__8__Impl"


    // $ANTLR start "rule__IfExpression__Group__9"
    // InternalVaselina.g:3329:1: rule__IfExpression__Group__9 : rule__IfExpression__Group__9__Impl rule__IfExpression__Group__10 ;
    public final void rule__IfExpression__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3333:1: ( rule__IfExpression__Group__9__Impl rule__IfExpression__Group__10 )
            // InternalVaselina.g:3334:2: rule__IfExpression__Group__9__Impl rule__IfExpression__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__IfExpression__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__9"


    // $ANTLR start "rule__IfExpression__Group__9__Impl"
    // InternalVaselina.g:3341:1: rule__IfExpression__Group__9__Impl : ( ( rule__IfExpression__ThenAssignment_9 )* ) ;
    public final void rule__IfExpression__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3345:1: ( ( ( rule__IfExpression__ThenAssignment_9 )* ) )
            // InternalVaselina.g:3346:1: ( ( rule__IfExpression__ThenAssignment_9 )* )
            {
            // InternalVaselina.g:3346:1: ( ( rule__IfExpression__ThenAssignment_9 )* )
            // InternalVaselina.g:3347:2: ( rule__IfExpression__ThenAssignment_9 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpressionAccess().getThenAssignment_9()); 
            }
            // InternalVaselina.g:3348:2: ( rule__IfExpression__ThenAssignment_9 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||(LA27_0>=17 && LA27_0<=24)||LA27_0==40||LA27_0==51||LA27_0==56||LA27_0==59||(LA27_0>=65 && LA27_0<=67)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalVaselina.g:3348:3: rule__IfExpression__ThenAssignment_9
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__IfExpression__ThenAssignment_9();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpressionAccess().getThenAssignment_9()); 
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
    // $ANTLR end "rule__IfExpression__Group__9__Impl"


    // $ANTLR start "rule__IfExpression__Group__10"
    // InternalVaselina.g:3356:1: rule__IfExpression__Group__10 : rule__IfExpression__Group__10__Impl rule__IfExpression__Group__11 ;
    public final void rule__IfExpression__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3360:1: ( rule__IfExpression__Group__10__Impl rule__IfExpression__Group__11 )
            // InternalVaselina.g:3361:2: rule__IfExpression__Group__10__Impl rule__IfExpression__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__IfExpression__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__10"


    // $ANTLR start "rule__IfExpression__Group__10__Impl"
    // InternalVaselina.g:3368:1: rule__IfExpression__Group__10__Impl : ( ( rule__IfExpression__Group_10__0 )? ) ;
    public final void rule__IfExpression__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3372:1: ( ( ( rule__IfExpression__Group_10__0 )? ) )
            // InternalVaselina.g:3373:1: ( ( rule__IfExpression__Group_10__0 )? )
            {
            // InternalVaselina.g:3373:1: ( ( rule__IfExpression__Group_10__0 )? )
            // InternalVaselina.g:3374:2: ( rule__IfExpression__Group_10__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpressionAccess().getGroup_10()); 
            }
            // InternalVaselina.g:3375:2: ( rule__IfExpression__Group_10__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==39) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==55) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // InternalVaselina.g:3375:3: rule__IfExpression__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfExpression__Group_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpressionAccess().getGroup_10()); 
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
    // $ANTLR end "rule__IfExpression__Group__10__Impl"


    // $ANTLR start "rule__IfExpression__Group__11"
    // InternalVaselina.g:3383:1: rule__IfExpression__Group__11 : rule__IfExpression__Group__11__Impl ;
    public final void rule__IfExpression__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3387:1: ( rule__IfExpression__Group__11__Impl )
            // InternalVaselina.g:3388:2: rule__IfExpression__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfExpression__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group__11"


    // $ANTLR start "rule__IfExpression__Group__11__Impl"
    // InternalVaselina.g:3394:1: rule__IfExpression__Group__11__Impl : ( ( '<-' ) ) ;
    public final void rule__IfExpression__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3398:1: ( ( ( '<-' ) ) )
            // InternalVaselina.g:3399:1: ( ( '<-' ) )
            {
            // InternalVaselina.g:3399:1: ( ( '<-' ) )
            // InternalVaselina.g:3400:2: ( '<-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpressionAccess().getLessThanSignHyphenMinusKeyword_11()); 
            }
            // InternalVaselina.g:3401:2: ( '<-' )
            // InternalVaselina.g:3401:3: '<-'
            {
            match(input,39,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpressionAccess().getLessThanSignHyphenMinusKeyword_11()); 
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
    // $ANTLR end "rule__IfExpression__Group__11__Impl"


    // $ANTLR start "rule__IfExpression__Group_10__0"
    // InternalVaselina.g:3410:1: rule__IfExpression__Group_10__0 : rule__IfExpression__Group_10__0__Impl rule__IfExpression__Group_10__1 ;
    public final void rule__IfExpression__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3414:1: ( rule__IfExpression__Group_10__0__Impl rule__IfExpression__Group_10__1 )
            // InternalVaselina.g:3415:2: rule__IfExpression__Group_10__0__Impl rule__IfExpression__Group_10__1
            {
            pushFollow(FOLLOW_31);
            rule__IfExpression__Group_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfExpression__Group_10__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group_10__0"


    // $ANTLR start "rule__IfExpression__Group_10__0__Impl"
    // InternalVaselina.g:3422:1: rule__IfExpression__Group_10__0__Impl : ( ( '<-' ) ) ;
    public final void rule__IfExpression__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3426:1: ( ( ( '<-' ) ) )
            // InternalVaselina.g:3427:1: ( ( '<-' ) )
            {
            // InternalVaselina.g:3427:1: ( ( '<-' ) )
            // InternalVaselina.g:3428:2: ( '<-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpressionAccess().getLessThanSignHyphenMinusKeyword_10_0()); 
            }
            // InternalVaselina.g:3429:2: ( '<-' )
            // InternalVaselina.g:3429:3: '<-'
            {
            match(input,39,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpressionAccess().getLessThanSignHyphenMinusKeyword_10_0()); 
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
    // $ANTLR end "rule__IfExpression__Group_10__0__Impl"


    // $ANTLR start "rule__IfExpression__Group_10__1"
    // InternalVaselina.g:3437:1: rule__IfExpression__Group_10__1 : rule__IfExpression__Group_10__1__Impl rule__IfExpression__Group_10__2 ;
    public final void rule__IfExpression__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3441:1: ( rule__IfExpression__Group_10__1__Impl rule__IfExpression__Group_10__2 )
            // InternalVaselina.g:3442:2: rule__IfExpression__Group_10__1__Impl rule__IfExpression__Group_10__2
            {
            pushFollow(FOLLOW_6);
            rule__IfExpression__Group_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfExpression__Group_10__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group_10__1"


    // $ANTLR start "rule__IfExpression__Group_10__1__Impl"
    // InternalVaselina.g:3449:1: rule__IfExpression__Group_10__1__Impl : ( 'no' ) ;
    public final void rule__IfExpression__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3453:1: ( ( 'no' ) )
            // InternalVaselina.g:3454:1: ( 'no' )
            {
            // InternalVaselina.g:3454:1: ( 'no' )
            // InternalVaselina.g:3455:2: 'no'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpressionAccess().getNoKeyword_10_1()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpressionAccess().getNoKeyword_10_1()); 
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
    // $ANTLR end "rule__IfExpression__Group_10__1__Impl"


    // $ANTLR start "rule__IfExpression__Group_10__2"
    // InternalVaselina.g:3464:1: rule__IfExpression__Group_10__2 : rule__IfExpression__Group_10__2__Impl rule__IfExpression__Group_10__3 ;
    public final void rule__IfExpression__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3468:1: ( rule__IfExpression__Group_10__2__Impl rule__IfExpression__Group_10__3 )
            // InternalVaselina.g:3469:2: rule__IfExpression__Group_10__2__Impl rule__IfExpression__Group_10__3
            {
            pushFollow(FOLLOW_32);
            rule__IfExpression__Group_10__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__IfExpression__Group_10__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group_10__2"


    // $ANTLR start "rule__IfExpression__Group_10__2__Impl"
    // InternalVaselina.g:3476:1: rule__IfExpression__Group_10__2__Impl : ( '->' ) ;
    public final void rule__IfExpression__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3480:1: ( ( '->' ) )
            // InternalVaselina.g:3481:1: ( '->' )
            {
            // InternalVaselina.g:3481:1: ( '->' )
            // InternalVaselina.g:3482:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpressionAccess().getHyphenMinusGreaterThanSignKeyword_10_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpressionAccess().getHyphenMinusGreaterThanSignKeyword_10_2()); 
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
    // $ANTLR end "rule__IfExpression__Group_10__2__Impl"


    // $ANTLR start "rule__IfExpression__Group_10__3"
    // InternalVaselina.g:3491:1: rule__IfExpression__Group_10__3 : rule__IfExpression__Group_10__3__Impl ;
    public final void rule__IfExpression__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3495:1: ( rule__IfExpression__Group_10__3__Impl )
            // InternalVaselina.g:3496:2: rule__IfExpression__Group_10__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfExpression__Group_10__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfExpression__Group_10__3"


    // $ANTLR start "rule__IfExpression__Group_10__3__Impl"
    // InternalVaselina.g:3502:1: rule__IfExpression__Group_10__3__Impl : ( ( rule__IfExpression__ElseAssignment_10_3 )* ) ;
    public final void rule__IfExpression__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3506:1: ( ( ( rule__IfExpression__ElseAssignment_10_3 )* ) )
            // InternalVaselina.g:3507:1: ( ( rule__IfExpression__ElseAssignment_10_3 )* )
            {
            // InternalVaselina.g:3507:1: ( ( rule__IfExpression__ElseAssignment_10_3 )* )
            // InternalVaselina.g:3508:2: ( rule__IfExpression__ElseAssignment_10_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpressionAccess().getElseAssignment_10_3()); 
            }
            // InternalVaselina.g:3509:2: ( rule__IfExpression__ElseAssignment_10_3 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID||(LA29_0>=17 && LA29_0<=24)||LA29_0==40||LA29_0==51||LA29_0==56||LA29_0==59||(LA29_0>=65 && LA29_0<=67)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalVaselina.g:3509:3: rule__IfExpression__ElseAssignment_10_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__IfExpression__ElseAssignment_10_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpressionAccess().getElseAssignment_10_3()); 
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
    // $ANTLR end "rule__IfExpression__Group_10__3__Impl"


    // $ANTLR start "rule__DoWhileExpression__Group__0"
    // InternalVaselina.g:3518:1: rule__DoWhileExpression__Group__0 : rule__DoWhileExpression__Group__0__Impl rule__DoWhileExpression__Group__1 ;
    public final void rule__DoWhileExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3522:1: ( rule__DoWhileExpression__Group__0__Impl rule__DoWhileExpression__Group__1 )
            // InternalVaselina.g:3523:2: rule__DoWhileExpression__Group__0__Impl rule__DoWhileExpression__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__DoWhileExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DoWhileExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileExpression__Group__0"


    // $ANTLR start "rule__DoWhileExpression__Group__0__Impl"
    // InternalVaselina.g:3530:1: rule__DoWhileExpression__Group__0__Impl : ( () ) ;
    public final void rule__DoWhileExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3534:1: ( ( () ) )
            // InternalVaselina.g:3535:1: ( () )
            {
            // InternalVaselina.g:3535:1: ( () )
            // InternalVaselina.g:3536:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoWhileExpressionAccess().getDoWhileExpressionAction_0()); 
            }
            // InternalVaselina.g:3537:2: ()
            // InternalVaselina.g:3537:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoWhileExpressionAccess().getDoWhileExpressionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileExpression__Group__0__Impl"


    // $ANTLR start "rule__DoWhileExpression__Group__1"
    // InternalVaselina.g:3545:1: rule__DoWhileExpression__Group__1 : rule__DoWhileExpression__Group__1__Impl rule__DoWhileExpression__Group__2 ;
    public final void rule__DoWhileExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3549:1: ( rule__DoWhileExpression__Group__1__Impl rule__DoWhileExpression__Group__2 )
            // InternalVaselina.g:3550:2: rule__DoWhileExpression__Group__1__Impl rule__DoWhileExpression__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__DoWhileExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DoWhileExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileExpression__Group__1"


    // $ANTLR start "rule__DoWhileExpression__Group__1__Impl"
    // InternalVaselina.g:3557:1: rule__DoWhileExpression__Group__1__Impl : ( 'as' ) ;
    public final void rule__DoWhileExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3561:1: ( ( 'as' ) )
            // InternalVaselina.g:3562:1: ( 'as' )
            {
            // InternalVaselina.g:3562:1: ( 'as' )
            // InternalVaselina.g:3563:2: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoWhileExpressionAccess().getAsKeyword_1()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoWhileExpressionAccess().getAsKeyword_1()); 
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
    // $ANTLR end "rule__DoWhileExpression__Group__1__Impl"


    // $ANTLR start "rule__DoWhileExpression__Group__2"
    // InternalVaselina.g:3572:1: rule__DoWhileExpression__Group__2 : rule__DoWhileExpression__Group__2__Impl rule__DoWhileExpression__Group__3 ;
    public final void rule__DoWhileExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3576:1: ( rule__DoWhileExpression__Group__2__Impl rule__DoWhileExpression__Group__3 )
            // InternalVaselina.g:3577:2: rule__DoWhileExpression__Group__2__Impl rule__DoWhileExpression__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__DoWhileExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DoWhileExpression__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileExpression__Group__2"


    // $ANTLR start "rule__DoWhileExpression__Group__2__Impl"
    // InternalVaselina.g:3584:1: rule__DoWhileExpression__Group__2__Impl : ( 'long' ) ;
    public final void rule__DoWhileExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3588:1: ( ( 'long' ) )
            // InternalVaselina.g:3589:1: ( 'long' )
            {
            // InternalVaselina.g:3589:1: ( 'long' )
            // InternalVaselina.g:3590:2: 'long'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoWhileExpressionAccess().getLongKeyword_2()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoWhileExpressionAccess().getLongKeyword_2()); 
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
    // $ANTLR end "rule__DoWhileExpression__Group__2__Impl"


    // $ANTLR start "rule__DoWhileExpression__Group__3"
    // InternalVaselina.g:3599:1: rule__DoWhileExpression__Group__3 : rule__DoWhileExpression__Group__3__Impl rule__DoWhileExpression__Group__4 ;
    public final void rule__DoWhileExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3603:1: ( rule__DoWhileExpression__Group__3__Impl rule__DoWhileExpression__Group__4 )
            // InternalVaselina.g:3604:2: rule__DoWhileExpression__Group__3__Impl rule__DoWhileExpression__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__DoWhileExpression__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DoWhileExpression__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileExpression__Group__3"


    // $ANTLR start "rule__DoWhileExpression__Group__3__Impl"
    // InternalVaselina.g:3611:1: rule__DoWhileExpression__Group__3__Impl : ( 'as' ) ;
    public final void rule__DoWhileExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3615:1: ( ( 'as' ) )
            // InternalVaselina.g:3616:1: ( 'as' )
            {
            // InternalVaselina.g:3616:1: ( 'as' )
            // InternalVaselina.g:3617:2: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoWhileExpressionAccess().getAsKeyword_3()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoWhileExpressionAccess().getAsKeyword_3()); 
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
    // $ANTLR end "rule__DoWhileExpression__Group__3__Impl"


    // $ANTLR start "rule__DoWhileExpression__Group__4"
    // InternalVaselina.g:3626:1: rule__DoWhileExpression__Group__4 : rule__DoWhileExpression__Group__4__Impl rule__DoWhileExpression__Group__5 ;
    public final void rule__DoWhileExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3630:1: ( rule__DoWhileExpression__Group__4__Impl rule__DoWhileExpression__Group__5 )
            // InternalVaselina.g:3631:2: rule__DoWhileExpression__Group__4__Impl rule__DoWhileExpression__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__DoWhileExpression__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DoWhileExpression__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileExpression__Group__4"


    // $ANTLR start "rule__DoWhileExpression__Group__4__Impl"
    // InternalVaselina.g:3638:1: rule__DoWhileExpression__Group__4__Impl : ( ':' ) ;
    public final void rule__DoWhileExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3642:1: ( ( ':' ) )
            // InternalVaselina.g:3643:1: ( ':' )
            {
            // InternalVaselina.g:3643:1: ( ':' )
            // InternalVaselina.g:3644:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoWhileExpressionAccess().getColonKeyword_4()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoWhileExpressionAccess().getColonKeyword_4()); 
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
    // $ANTLR end "rule__DoWhileExpression__Group__4__Impl"


    // $ANTLR start "rule__DoWhileExpression__Group__5"
    // InternalVaselina.g:3653:1: rule__DoWhileExpression__Group__5 : rule__DoWhileExpression__Group__5__Impl rule__DoWhileExpression__Group__6 ;
    public final void rule__DoWhileExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3657:1: ( rule__DoWhileExpression__Group__5__Impl rule__DoWhileExpression__Group__6 )
            // InternalVaselina.g:3658:2: rule__DoWhileExpression__Group__5__Impl rule__DoWhileExpression__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__DoWhileExpression__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DoWhileExpression__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileExpression__Group__5"


    // $ANTLR start "rule__DoWhileExpression__Group__5__Impl"
    // InternalVaselina.g:3665:1: rule__DoWhileExpression__Group__5__Impl : ( ( rule__DoWhileExpression__LoopConditonAssignment_5 ) ) ;
    public final void rule__DoWhileExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3669:1: ( ( ( rule__DoWhileExpression__LoopConditonAssignment_5 ) ) )
            // InternalVaselina.g:3670:1: ( ( rule__DoWhileExpression__LoopConditonAssignment_5 ) )
            {
            // InternalVaselina.g:3670:1: ( ( rule__DoWhileExpression__LoopConditonAssignment_5 ) )
            // InternalVaselina.g:3671:2: ( rule__DoWhileExpression__LoopConditonAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoWhileExpressionAccess().getLoopConditonAssignment_5()); 
            }
            // InternalVaselina.g:3672:2: ( rule__DoWhileExpression__LoopConditonAssignment_5 )
            // InternalVaselina.g:3672:3: rule__DoWhileExpression__LoopConditonAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DoWhileExpression__LoopConditonAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoWhileExpressionAccess().getLoopConditonAssignment_5()); 
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
    // $ANTLR end "rule__DoWhileExpression__Group__5__Impl"


    // $ANTLR start "rule__DoWhileExpression__Group__6"
    // InternalVaselina.g:3680:1: rule__DoWhileExpression__Group__6 : rule__DoWhileExpression__Group__6__Impl rule__DoWhileExpression__Group__7 ;
    public final void rule__DoWhileExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3684:1: ( rule__DoWhileExpression__Group__6__Impl rule__DoWhileExpression__Group__7 )
            // InternalVaselina.g:3685:2: rule__DoWhileExpression__Group__6__Impl rule__DoWhileExpression__Group__7
            {
            pushFollow(FOLLOW_35);
            rule__DoWhileExpression__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DoWhileExpression__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileExpression__Group__6"


    // $ANTLR start "rule__DoWhileExpression__Group__6__Impl"
    // InternalVaselina.g:3692:1: rule__DoWhileExpression__Group__6__Impl : ( ':' ) ;
    public final void rule__DoWhileExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3696:1: ( ( ':' ) )
            // InternalVaselina.g:3697:1: ( ':' )
            {
            // InternalVaselina.g:3697:1: ( ':' )
            // InternalVaselina.g:3698:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoWhileExpressionAccess().getColonKeyword_6()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoWhileExpressionAccess().getColonKeyword_6()); 
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
    // $ANTLR end "rule__DoWhileExpression__Group__6__Impl"


    // $ANTLR start "rule__DoWhileExpression__Group__7"
    // InternalVaselina.g:3707:1: rule__DoWhileExpression__Group__7 : rule__DoWhileExpression__Group__7__Impl rule__DoWhileExpression__Group__8 ;
    public final void rule__DoWhileExpression__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3711:1: ( rule__DoWhileExpression__Group__7__Impl rule__DoWhileExpression__Group__8 )
            // InternalVaselina.g:3712:2: rule__DoWhileExpression__Group__7__Impl rule__DoWhileExpression__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__DoWhileExpression__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DoWhileExpression__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileExpression__Group__7"


    // $ANTLR start "rule__DoWhileExpression__Group__7__Impl"
    // InternalVaselina.g:3719:1: rule__DoWhileExpression__Group__7__Impl : ( 'repeat' ) ;
    public final void rule__DoWhileExpression__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3723:1: ( ( 'repeat' ) )
            // InternalVaselina.g:3724:1: ( 'repeat' )
            {
            // InternalVaselina.g:3724:1: ( 'repeat' )
            // InternalVaselina.g:3725:2: 'repeat'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoWhileExpressionAccess().getRepeatKeyword_7()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoWhileExpressionAccess().getRepeatKeyword_7()); 
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
    // $ANTLR end "rule__DoWhileExpression__Group__7__Impl"


    // $ANTLR start "rule__DoWhileExpression__Group__8"
    // InternalVaselina.g:3734:1: rule__DoWhileExpression__Group__8 : rule__DoWhileExpression__Group__8__Impl rule__DoWhileExpression__Group__9 ;
    public final void rule__DoWhileExpression__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3738:1: ( rule__DoWhileExpression__Group__8__Impl rule__DoWhileExpression__Group__9 )
            // InternalVaselina.g:3739:2: rule__DoWhileExpression__Group__8__Impl rule__DoWhileExpression__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__DoWhileExpression__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DoWhileExpression__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileExpression__Group__8"


    // $ANTLR start "rule__DoWhileExpression__Group__8__Impl"
    // InternalVaselina.g:3746:1: rule__DoWhileExpression__Group__8__Impl : ( '->' ) ;
    public final void rule__DoWhileExpression__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3750:1: ( ( '->' ) )
            // InternalVaselina.g:3751:1: ( '->' )
            {
            // InternalVaselina.g:3751:1: ( '->' )
            // InternalVaselina.g:3752:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoWhileExpressionAccess().getHyphenMinusGreaterThanSignKeyword_8()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoWhileExpressionAccess().getHyphenMinusGreaterThanSignKeyword_8()); 
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
    // $ANTLR end "rule__DoWhileExpression__Group__8__Impl"


    // $ANTLR start "rule__DoWhileExpression__Group__9"
    // InternalVaselina.g:3761:1: rule__DoWhileExpression__Group__9 : rule__DoWhileExpression__Group__9__Impl rule__DoWhileExpression__Group__10 ;
    public final void rule__DoWhileExpression__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3765:1: ( rule__DoWhileExpression__Group__9__Impl rule__DoWhileExpression__Group__10 )
            // InternalVaselina.g:3766:2: rule__DoWhileExpression__Group__9__Impl rule__DoWhileExpression__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__DoWhileExpression__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DoWhileExpression__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileExpression__Group__9"


    // $ANTLR start "rule__DoWhileExpression__Group__9__Impl"
    // InternalVaselina.g:3773:1: rule__DoWhileExpression__Group__9__Impl : ( ( rule__DoWhileExpression__BodyAssignment_9 )* ) ;
    public final void rule__DoWhileExpression__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3777:1: ( ( ( rule__DoWhileExpression__BodyAssignment_9 )* ) )
            // InternalVaselina.g:3778:1: ( ( rule__DoWhileExpression__BodyAssignment_9 )* )
            {
            // InternalVaselina.g:3778:1: ( ( rule__DoWhileExpression__BodyAssignment_9 )* )
            // InternalVaselina.g:3779:2: ( rule__DoWhileExpression__BodyAssignment_9 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoWhileExpressionAccess().getBodyAssignment_9()); 
            }
            // InternalVaselina.g:3780:2: ( rule__DoWhileExpression__BodyAssignment_9 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||(LA30_0>=17 && LA30_0<=24)||LA30_0==40||LA30_0==51||LA30_0==56||LA30_0==59||(LA30_0>=65 && LA30_0<=67)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalVaselina.g:3780:3: rule__DoWhileExpression__BodyAssignment_9
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__DoWhileExpression__BodyAssignment_9();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoWhileExpressionAccess().getBodyAssignment_9()); 
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
    // $ANTLR end "rule__DoWhileExpression__Group__9__Impl"


    // $ANTLR start "rule__DoWhileExpression__Group__10"
    // InternalVaselina.g:3788:1: rule__DoWhileExpression__Group__10 : rule__DoWhileExpression__Group__10__Impl ;
    public final void rule__DoWhileExpression__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3792:1: ( rule__DoWhileExpression__Group__10__Impl )
            // InternalVaselina.g:3793:2: rule__DoWhileExpression__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoWhileExpression__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileExpression__Group__10"


    // $ANTLR start "rule__DoWhileExpression__Group__10__Impl"
    // InternalVaselina.g:3799:1: rule__DoWhileExpression__Group__10__Impl : ( ( '<-' ) ) ;
    public final void rule__DoWhileExpression__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3803:1: ( ( ( '<-' ) ) )
            // InternalVaselina.g:3804:1: ( ( '<-' ) )
            {
            // InternalVaselina.g:3804:1: ( ( '<-' ) )
            // InternalVaselina.g:3805:2: ( '<-' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoWhileExpressionAccess().getLessThanSignHyphenMinusKeyword_10()); 
            }
            // InternalVaselina.g:3806:2: ( '<-' )
            // InternalVaselina.g:3806:3: '<-'
            {
            match(input,39,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoWhileExpressionAccess().getLessThanSignHyphenMinusKeyword_10()); 
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
    // $ANTLR end "rule__DoWhileExpression__Group__10__Impl"


    // $ANTLR start "rule__BrkStr__Group__0"
    // InternalVaselina.g:3815:1: rule__BrkStr__Group__0 : rule__BrkStr__Group__0__Impl rule__BrkStr__Group__1 ;
    public final void rule__BrkStr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3819:1: ( rule__BrkStr__Group__0__Impl rule__BrkStr__Group__1 )
            // InternalVaselina.g:3820:2: rule__BrkStr__Group__0__Impl rule__BrkStr__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__BrkStr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BrkStr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrkStr__Group__0"


    // $ANTLR start "rule__BrkStr__Group__0__Impl"
    // InternalVaselina.g:3827:1: rule__BrkStr__Group__0__Impl : ( () ) ;
    public final void rule__BrkStr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3831:1: ( ( () ) )
            // InternalVaselina.g:3832:1: ( () )
            {
            // InternalVaselina.g:3832:1: ( () )
            // InternalVaselina.g:3833:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrkStrAccess().getBrkStrAction_0()); 
            }
            // InternalVaselina.g:3834:2: ()
            // InternalVaselina.g:3834:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBrkStrAccess().getBrkStrAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrkStr__Group__0__Impl"


    // $ANTLR start "rule__BrkStr__Group__1"
    // InternalVaselina.g:3842:1: rule__BrkStr__Group__1 : rule__BrkStr__Group__1__Impl ;
    public final void rule__BrkStr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3846:1: ( rule__BrkStr__Group__1__Impl )
            // InternalVaselina.g:3847:2: rule__BrkStr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BrkStr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BrkStr__Group__1"


    // $ANTLR start "rule__BrkStr__Group__1__Impl"
    // InternalVaselina.g:3853:1: rule__BrkStr__Group__1__Impl : ( ( rule__BrkStr__BrkAssignment_1 ) ) ;
    public final void rule__BrkStr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3857:1: ( ( ( rule__BrkStr__BrkAssignment_1 ) ) )
            // InternalVaselina.g:3858:1: ( ( rule__BrkStr__BrkAssignment_1 ) )
            {
            // InternalVaselina.g:3858:1: ( ( rule__BrkStr__BrkAssignment_1 ) )
            // InternalVaselina.g:3859:2: ( rule__BrkStr__BrkAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrkStrAccess().getBrkAssignment_1()); 
            }
            // InternalVaselina.g:3860:2: ( rule__BrkStr__BrkAssignment_1 )
            // InternalVaselina.g:3860:3: rule__BrkStr__BrkAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BrkStr__BrkAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBrkStrAccess().getBrkAssignment_1()); 
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
    // $ANTLR end "rule__BrkStr__Group__1__Impl"


    // $ANTLR start "rule__ReturnDeclaration__Group__0"
    // InternalVaselina.g:3869:1: rule__ReturnDeclaration__Group__0 : rule__ReturnDeclaration__Group__0__Impl rule__ReturnDeclaration__Group__1 ;
    public final void rule__ReturnDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3873:1: ( rule__ReturnDeclaration__Group__0__Impl rule__ReturnDeclaration__Group__1 )
            // InternalVaselina.g:3874:2: rule__ReturnDeclaration__Group__0__Impl rule__ReturnDeclaration__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__ReturnDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReturnDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnDeclaration__Group__0"


    // $ANTLR start "rule__ReturnDeclaration__Group__0__Impl"
    // InternalVaselina.g:3881:1: rule__ReturnDeclaration__Group__0__Impl : ( 'type' ) ;
    public final void rule__ReturnDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3885:1: ( ( 'type' ) )
            // InternalVaselina.g:3886:1: ( 'type' )
            {
            // InternalVaselina.g:3886:1: ( 'type' )
            // InternalVaselina.g:3887:2: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnDeclarationAccess().getTypeKeyword_0()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnDeclarationAccess().getTypeKeyword_0()); 
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
    // $ANTLR end "rule__ReturnDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ReturnDeclaration__Group__1"
    // InternalVaselina.g:3896:1: rule__ReturnDeclaration__Group__1 : rule__ReturnDeclaration__Group__1__Impl rule__ReturnDeclaration__Group__2 ;
    public final void rule__ReturnDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3900:1: ( rule__ReturnDeclaration__Group__1__Impl rule__ReturnDeclaration__Group__2 )
            // InternalVaselina.g:3901:2: rule__ReturnDeclaration__Group__1__Impl rule__ReturnDeclaration__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ReturnDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ReturnDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnDeclaration__Group__1"


    // $ANTLR start "rule__ReturnDeclaration__Group__1__Impl"
    // InternalVaselina.g:3908:1: rule__ReturnDeclaration__Group__1__Impl : ( 'keeping' ) ;
    public final void rule__ReturnDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3912:1: ( ( 'keeping' ) )
            // InternalVaselina.g:3913:1: ( 'keeping' )
            {
            // InternalVaselina.g:3913:1: ( 'keeping' )
            // InternalVaselina.g:3914:2: 'keeping'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnDeclarationAccess().getKeepingKeyword_1()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnDeclarationAccess().getKeepingKeyword_1()); 
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
    // $ANTLR end "rule__ReturnDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ReturnDeclaration__Group__2"
    // InternalVaselina.g:3923:1: rule__ReturnDeclaration__Group__2 : rule__ReturnDeclaration__Group__2__Impl ;
    public final void rule__ReturnDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3927:1: ( rule__ReturnDeclaration__Group__2__Impl )
            // InternalVaselina.g:3928:2: rule__ReturnDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReturnDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnDeclaration__Group__2"


    // $ANTLR start "rule__ReturnDeclaration__Group__2__Impl"
    // InternalVaselina.g:3934:1: rule__ReturnDeclaration__Group__2__Impl : ( ( rule__ReturnDeclaration__RtnTypeAssignment_2 ) ) ;
    public final void rule__ReturnDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3938:1: ( ( ( rule__ReturnDeclaration__RtnTypeAssignment_2 ) ) )
            // InternalVaselina.g:3939:1: ( ( rule__ReturnDeclaration__RtnTypeAssignment_2 ) )
            {
            // InternalVaselina.g:3939:1: ( ( rule__ReturnDeclaration__RtnTypeAssignment_2 ) )
            // InternalVaselina.g:3940:2: ( rule__ReturnDeclaration__RtnTypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnDeclarationAccess().getRtnTypeAssignment_2()); 
            }
            // InternalVaselina.g:3941:2: ( rule__ReturnDeclaration__RtnTypeAssignment_2 )
            // InternalVaselina.g:3941:3: rule__ReturnDeclaration__RtnTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ReturnDeclaration__RtnTypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnDeclarationAccess().getRtnTypeAssignment_2()); 
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
    // $ANTLR end "rule__ReturnDeclaration__Group__2__Impl"


    // $ANTLR start "rule__DOUBLE__Group__0"
    // InternalVaselina.g:3950:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3954:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // InternalVaselina.g:3955:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__DOUBLE__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group__0"


    // $ANTLR start "rule__DOUBLE__Group__0__Impl"
    // InternalVaselina.g:3962:1: rule__DOUBLE__Group__0__Impl : ( ( rule__DOUBLE__IntegerAssignment_0 ) ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3966:1: ( ( ( rule__DOUBLE__IntegerAssignment_0 ) ) )
            // InternalVaselina.g:3967:1: ( ( rule__DOUBLE__IntegerAssignment_0 ) )
            {
            // InternalVaselina.g:3967:1: ( ( rule__DOUBLE__IntegerAssignment_0 ) )
            // InternalVaselina.g:3968:2: ( rule__DOUBLE__IntegerAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOUBLEAccess().getIntegerAssignment_0()); 
            }
            // InternalVaselina.g:3969:2: ( rule__DOUBLE__IntegerAssignment_0 )
            // InternalVaselina.g:3969:3: rule__DOUBLE__IntegerAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__IntegerAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOUBLEAccess().getIntegerAssignment_0()); 
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
    // $ANTLR end "rule__DOUBLE__Group__0__Impl"


    // $ANTLR start "rule__DOUBLE__Group__1"
    // InternalVaselina.g:3977:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3981:1: ( rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 )
            // InternalVaselina.g:3982:2: rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__DOUBLE__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group__1"


    // $ANTLR start "rule__DOUBLE__Group__1__Impl"
    // InternalVaselina.g:3989:1: rule__DOUBLE__Group__1__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:3993:1: ( ( '.' ) )
            // InternalVaselina.g:3994:1: ( '.' )
            {
            // InternalVaselina.g:3994:1: ( '.' )
            // InternalVaselina.g:3995:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1()); 
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
    // $ANTLR end "rule__DOUBLE__Group__1__Impl"


    // $ANTLR start "rule__DOUBLE__Group__2"
    // InternalVaselina.g:4004:1: rule__DOUBLE__Group__2 : rule__DOUBLE__Group__2__Impl ;
    public final void rule__DOUBLE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4008:1: ( rule__DOUBLE__Group__2__Impl )
            // InternalVaselina.g:4009:2: rule__DOUBLE__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group__2"


    // $ANTLR start "rule__DOUBLE__Group__2__Impl"
    // InternalVaselina.g:4015:1: rule__DOUBLE__Group__2__Impl : ( ( rule__DOUBLE__DecimalAssignment_2 ) ) ;
    public final void rule__DOUBLE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4019:1: ( ( ( rule__DOUBLE__DecimalAssignment_2 ) ) )
            // InternalVaselina.g:4020:1: ( ( rule__DOUBLE__DecimalAssignment_2 ) )
            {
            // InternalVaselina.g:4020:1: ( ( rule__DOUBLE__DecimalAssignment_2 ) )
            // InternalVaselina.g:4021:2: ( rule__DOUBLE__DecimalAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOUBLEAccess().getDecimalAssignment_2()); 
            }
            // InternalVaselina.g:4022:2: ( rule__DOUBLE__DecimalAssignment_2 )
            // InternalVaselina.g:4022:3: rule__DOUBLE__DecimalAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__DecimalAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOUBLEAccess().getDecimalAssignment_2()); 
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
    // $ANTLR end "rule__DOUBLE__Group__2__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalVaselina.g:4031:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4035:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalVaselina.g:4036:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__Or__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // InternalVaselina.g:4043:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4047:1: ( ( ruleAnd ) )
            // InternalVaselina.g:4048:1: ( ruleAnd )
            {
            // InternalVaselina.g:4048:1: ( ruleAnd )
            // InternalVaselina.g:4049:2: ruleAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
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
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // InternalVaselina.g:4058:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4062:1: ( rule__Or__Group__1__Impl )
            // InternalVaselina.g:4063:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // InternalVaselina.g:4069:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4073:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalVaselina.g:4074:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalVaselina.g:4074:1: ( ( rule__Or__Group_1__0 )* )
            // InternalVaselina.g:4075:2: ( rule__Or__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_1()); 
            }
            // InternalVaselina.g:4076:2: ( rule__Or__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==68) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalVaselina.g:4076:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__Or__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // InternalVaselina.g:4085:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4089:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalVaselina.g:4090:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_40);
            rule__Or__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // InternalVaselina.g:4097:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4101:1: ( ( () ) )
            // InternalVaselina.g:4102:1: ( () )
            {
            // InternalVaselina.g:4102:1: ( () )
            // InternalVaselina.g:4103:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            }
            // InternalVaselina.g:4104:2: ()
            // InternalVaselina.g:4104:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // InternalVaselina.g:4112:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4116:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalVaselina.g:4117:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Or__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // InternalVaselina.g:4124:1: rule__Or__Group_1__1__Impl : ( ( rule__Or__OpAssignment_1_1 ) ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4128:1: ( ( ( rule__Or__OpAssignment_1_1 ) ) )
            // InternalVaselina.g:4129:1: ( ( rule__Or__OpAssignment_1_1 ) )
            {
            // InternalVaselina.g:4129:1: ( ( rule__Or__OpAssignment_1_1 ) )
            // InternalVaselina.g:4130:2: ( rule__Or__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOpAssignment_1_1()); 
            }
            // InternalVaselina.g:4131:2: ( rule__Or__OpAssignment_1_1 )
            // InternalVaselina.g:4131:3: rule__Or__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Or__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getOpAssignment_1_1()); 
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
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // InternalVaselina.g:4139:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4143:1: ( rule__Or__Group_1__2__Impl )
            // InternalVaselina.g:4144:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // InternalVaselina.g:4150:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4154:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalVaselina.g:4155:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalVaselina.g:4155:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalVaselina.g:4156:2: ( rule__Or__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            }
            // InternalVaselina.g:4157:2: ( rule__Or__RightAssignment_1_2 )
            // InternalVaselina.g:4157:3: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Or__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalVaselina.g:4166:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4170:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalVaselina.g:4171:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__And__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalVaselina.g:4178:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4182:1: ( ( ruleEquality ) )
            // InternalVaselina.g:4183:1: ( ruleEquality )
            {
            // InternalVaselina.g:4183:1: ( ruleEquality )
            // InternalVaselina.g:4184:2: ruleEquality
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
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
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalVaselina.g:4193:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4197:1: ( rule__And__Group__1__Impl )
            // InternalVaselina.g:4198:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalVaselina.g:4204:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4208:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalVaselina.g:4209:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalVaselina.g:4209:1: ( ( rule__And__Group_1__0 )* )
            // InternalVaselina.g:4210:2: ( rule__And__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_1()); 
            }
            // InternalVaselina.g:4211:2: ( rule__And__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==69) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalVaselina.g:4211:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__And__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup_1()); 
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
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // InternalVaselina.g:4220:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4224:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalVaselina.g:4225:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_42);
            rule__And__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // InternalVaselina.g:4232:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4236:1: ( ( () ) )
            // InternalVaselina.g:4237:1: ( () )
            {
            // InternalVaselina.g:4237:1: ( () )
            // InternalVaselina.g:4238:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            }
            // InternalVaselina.g:4239:2: ()
            // InternalVaselina.g:4239:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // InternalVaselina.g:4247:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4251:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalVaselina.g:4252:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__And__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // InternalVaselina.g:4259:1: rule__And__Group_1__1__Impl : ( ( rule__And__OpAssignment_1_1 ) ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4263:1: ( ( ( rule__And__OpAssignment_1_1 ) ) )
            // InternalVaselina.g:4264:1: ( ( rule__And__OpAssignment_1_1 ) )
            {
            // InternalVaselina.g:4264:1: ( ( rule__And__OpAssignment_1_1 ) )
            // InternalVaselina.g:4265:2: ( rule__And__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getOpAssignment_1_1()); 
            }
            // InternalVaselina.g:4266:2: ( rule__And__OpAssignment_1_1 )
            // InternalVaselina.g:4266:3: rule__And__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__And__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getOpAssignment_1_1()); 
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
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // InternalVaselina.g:4274:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4278:1: ( rule__And__Group_1__2__Impl )
            // InternalVaselina.g:4279:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // InternalVaselina.g:4285:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4289:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalVaselina.g:4290:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalVaselina.g:4290:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalVaselina.g:4291:2: ( rule__And__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            }
            // InternalVaselina.g:4292:2: ( rule__And__RightAssignment_1_2 )
            // InternalVaselina.g:4292:3: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__And__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__Equality__Group__0"
    // InternalVaselina.g:4301:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4305:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalVaselina.g:4306:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__Equality__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equality__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__0"


    // $ANTLR start "rule__Equality__Group__0__Impl"
    // InternalVaselina.g:4313:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4317:1: ( ( ruleComparison ) )
            // InternalVaselina.g:4318:1: ( ruleComparison )
            {
            // InternalVaselina.g:4318:1: ( ruleComparison )
            // InternalVaselina.g:4319:2: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
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
    // $ANTLR end "rule__Equality__Group__0__Impl"


    // $ANTLR start "rule__Equality__Group__1"
    // InternalVaselina.g:4328:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4332:1: ( rule__Equality__Group__1__Impl )
            // InternalVaselina.g:4333:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__1"


    // $ANTLR start "rule__Equality__Group__1__Impl"
    // InternalVaselina.g:4339:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4343:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // InternalVaselina.g:4344:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // InternalVaselina.g:4344:1: ( ( rule__Equality__Group_1__0 )* )
            // InternalVaselina.g:4345:2: ( rule__Equality__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getGroup_1()); 
            }
            // InternalVaselina.g:4346:2: ( rule__Equality__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=25 && LA33_0<=26)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalVaselina.g:4346:3: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Equality__Group__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__0"
    // InternalVaselina.g:4355:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4359:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalVaselina.g:4360:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_44);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0"


    // $ANTLR start "rule__Equality__Group_1__0__Impl"
    // InternalVaselina.g:4367:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4371:1: ( ( () ) )
            // InternalVaselina.g:4372:1: ( () )
            {
            // InternalVaselina.g:4372:1: ( () )
            // InternalVaselina.g:4373:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 
            }
            // InternalVaselina.g:4374:2: ()
            // InternalVaselina.g:4374:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1__1"
    // InternalVaselina.g:4382:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4386:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // InternalVaselina.g:4387:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__1"


    // $ANTLR start "rule__Equality__Group_1__1__Impl"
    // InternalVaselina.g:4394:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OpAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4398:1: ( ( ( rule__Equality__OpAssignment_1_1 ) ) )
            // InternalVaselina.g:4399:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            {
            // InternalVaselina.g:4399:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            // InternalVaselina.g:4400:2: ( rule__Equality__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 
            }
            // InternalVaselina.g:4401:2: ( rule__Equality__OpAssignment_1_1 )
            // InternalVaselina.g:4401:3: rule__Equality__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Equality__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 
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
    // $ANTLR end "rule__Equality__Group_1__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__2"
    // InternalVaselina.g:4409:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4413:1: ( rule__Equality__Group_1__2__Impl )
            // InternalVaselina.g:4414:2: rule__Equality__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__2"


    // $ANTLR start "rule__Equality__Group_1__2__Impl"
    // InternalVaselina.g:4420:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4424:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // InternalVaselina.g:4425:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // InternalVaselina.g:4425:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // InternalVaselina.g:4426:2: ( rule__Equality__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            }
            // InternalVaselina.g:4427:2: ( rule__Equality__RightAssignment_1_2 )
            // InternalVaselina.g:4427:3: rule__Equality__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Equality__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__Equality__Group_1__2__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalVaselina.g:4436:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4440:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalVaselina.g:4441:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__Comparison__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalVaselina.g:4448:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4452:1: ( ( rulePlusOrMinus ) )
            // InternalVaselina.g:4453:1: ( rulePlusOrMinus )
            {
            // InternalVaselina.g:4453:1: ( rulePlusOrMinus )
            // InternalVaselina.g:4454:2: rulePlusOrMinus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
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
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalVaselina.g:4463:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4467:1: ( rule__Comparison__Group__1__Impl )
            // InternalVaselina.g:4468:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalVaselina.g:4474:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4478:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalVaselina.g:4479:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalVaselina.g:4479:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalVaselina.g:4480:2: ( rule__Comparison__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup_1()); 
            }
            // InternalVaselina.g:4481:2: ( rule__Comparison__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=27 && LA34_0<=30)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalVaselina.g:4481:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__0"
    // InternalVaselina.g:4490:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4494:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalVaselina.g:4495:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_46);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0"


    // $ANTLR start "rule__Comparison__Group_1__0__Impl"
    // InternalVaselina.g:4502:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4506:1: ( ( () ) )
            // InternalVaselina.g:4507:1: ( () )
            {
            // InternalVaselina.g:4507:1: ( () )
            // InternalVaselina.g:4508:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            }
            // InternalVaselina.g:4509:2: ()
            // InternalVaselina.g:4509:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1__1"
    // InternalVaselina.g:4517:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4521:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // InternalVaselina.g:4522:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1"


    // $ANTLR start "rule__Comparison__Group_1__1__Impl"
    // InternalVaselina.g:4529:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OpAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4533:1: ( ( ( rule__Comparison__OpAssignment_1_1 ) ) )
            // InternalVaselina.g:4534:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            {
            // InternalVaselina.g:4534:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            // InternalVaselina.g:4535:2: ( rule__Comparison__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 
            }
            // InternalVaselina.g:4536:2: ( rule__Comparison__OpAssignment_1_1 )
            // InternalVaselina.g:4536:3: rule__Comparison__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 
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
    // $ANTLR end "rule__Comparison__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__2"
    // InternalVaselina.g:4544:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4548:1: ( rule__Comparison__Group_1__2__Impl )
            // InternalVaselina.g:4549:2: rule__Comparison__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__2"


    // $ANTLR start "rule__Comparison__Group_1__2__Impl"
    // InternalVaselina.g:4555:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4559:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // InternalVaselina.g:4560:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // InternalVaselina.g:4560:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // InternalVaselina.g:4561:2: ( rule__Comparison__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            }
            // InternalVaselina.g:4562:2: ( rule__Comparison__RightAssignment_1_2 )
            // InternalVaselina.g:4562:3: rule__Comparison__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__Comparison__Group_1__2__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__0"
    // InternalVaselina.g:4571:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4575:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalVaselina.g:4576:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__PlusOrMinus__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__0"


    // $ANTLR start "rule__PlusOrMinus__Group__0__Impl"
    // InternalVaselina.g:4583:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4587:1: ( ( ruleMulOrDiv ) )
            // InternalVaselina.g:4588:1: ( ruleMulOrDiv )
            {
            // InternalVaselina.g:4588:1: ( ruleMulOrDiv )
            // InternalVaselina.g:4589:2: ruleMulOrDiv
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
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
    // $ANTLR end "rule__PlusOrMinus__Group__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__1"
    // InternalVaselina.g:4598:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4602:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalVaselina.g:4603:2: rule__PlusOrMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__1"


    // $ANTLR start "rule__PlusOrMinus__Group__1__Impl"
    // InternalVaselina.g:4609:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4613:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // InternalVaselina.g:4614:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // InternalVaselina.g:4614:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // InternalVaselina.g:4615:2: ( rule__PlusOrMinus__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            }
            // InternalVaselina.g:4616:2: ( rule__PlusOrMinus__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=31 && LA35_0<=32)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalVaselina.g:4616:3: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
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
    // $ANTLR end "rule__PlusOrMinus__Group__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0"
    // InternalVaselina.g:4625:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4629:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalVaselina.g:4630:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_48);
            rule__PlusOrMinus__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0__Impl"
    // InternalVaselina.g:4637:1: rule__PlusOrMinus__Group_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4641:1: ( ( () ) )
            // InternalVaselina.g:4642:1: ( () )
            {
            // InternalVaselina.g:4642:1: ( () )
            // InternalVaselina.g:4643:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getPlusOrMinusLeftAction_1_0()); 
            }
            // InternalVaselina.g:4644:2: ()
            // InternalVaselina.g:4644:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getPlusOrMinusLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1"
    // InternalVaselina.g:4652:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl rule__PlusOrMinus__Group_1__2 ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4656:1: ( rule__PlusOrMinus__Group_1__1__Impl rule__PlusOrMinus__Group_1__2 )
            // InternalVaselina.g:4657:2: rule__PlusOrMinus__Group_1__1__Impl rule__PlusOrMinus__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__PlusOrMinus__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1__Impl"
    // InternalVaselina.g:4664:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__OpAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4668:1: ( ( ( rule__PlusOrMinus__OpAssignment_1_1 ) ) )
            // InternalVaselina.g:4669:1: ( ( rule__PlusOrMinus__OpAssignment_1_1 ) )
            {
            // InternalVaselina.g:4669:1: ( ( rule__PlusOrMinus__OpAssignment_1_1 ) )
            // InternalVaselina.g:4670:2: ( rule__PlusOrMinus__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getOpAssignment_1_1()); 
            }
            // InternalVaselina.g:4671:2: ( rule__PlusOrMinus__OpAssignment_1_1 )
            // InternalVaselina.g:4671:3: rule__PlusOrMinus__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getOpAssignment_1_1()); 
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
    // $ANTLR end "rule__PlusOrMinus__Group_1__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__2"
    // InternalVaselina.g:4679:1: rule__PlusOrMinus__Group_1__2 : rule__PlusOrMinus__Group_1__2__Impl ;
    public final void rule__PlusOrMinus__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4683:1: ( rule__PlusOrMinus__Group_1__2__Impl )
            // InternalVaselina.g:4684:2: rule__PlusOrMinus__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__2"


    // $ANTLR start "rule__PlusOrMinus__Group_1__2__Impl"
    // InternalVaselina.g:4690:1: rule__PlusOrMinus__Group_1__2__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_2 ) ) ;
    public final void rule__PlusOrMinus__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4694:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_2 ) ) )
            // InternalVaselina.g:4695:1: ( ( rule__PlusOrMinus__RightAssignment_1_2 ) )
            {
            // InternalVaselina.g:4695:1: ( ( rule__PlusOrMinus__RightAssignment_1_2 ) )
            // InternalVaselina.g:4696:2: ( rule__PlusOrMinus__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_2()); 
            }
            // InternalVaselina.g:4697:2: ( rule__PlusOrMinus__RightAssignment_1_2 )
            // InternalVaselina.g:4697:3: rule__PlusOrMinus__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__PlusOrMinus__Group_1__2__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__0"
    // InternalVaselina.g:4706:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4710:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // InternalVaselina.g:4711:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__MulOrDiv__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__0"


    // $ANTLR start "rule__MulOrDiv__Group__0__Impl"
    // InternalVaselina.g:4718:1: rule__MulOrDiv__Group__0__Impl : ( ruleModule ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4722:1: ( ( ruleModule ) )
            // InternalVaselina.g:4723:1: ( ruleModule )
            {
            // InternalVaselina.g:4723:1: ( ruleModule )
            // InternalVaselina.g:4724:2: ruleModule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getModuleParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleModule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getModuleParserRuleCall_0()); 
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
    // $ANTLR end "rule__MulOrDiv__Group__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__1"
    // InternalVaselina.g:4733:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4737:1: ( rule__MulOrDiv__Group__1__Impl )
            // InternalVaselina.g:4738:2: rule__MulOrDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__1"


    // $ANTLR start "rule__MulOrDiv__Group__1__Impl"
    // InternalVaselina.g:4744:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4748:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // InternalVaselina.g:4749:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // InternalVaselina.g:4749:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // InternalVaselina.g:4750:2: ( rule__MulOrDiv__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            }
            // InternalVaselina.g:4751:2: ( rule__MulOrDiv__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=33 && LA36_0<=34)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalVaselina.g:4751:3: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__MulOrDiv__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getGroup_1()); 
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
    // $ANTLR end "rule__MulOrDiv__Group__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__0"
    // InternalVaselina.g:4760:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4764:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // InternalVaselina.g:4765:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_50);
            rule__MulOrDiv__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__0"


    // $ANTLR start "rule__MulOrDiv__Group_1__0__Impl"
    // InternalVaselina.g:4772:1: rule__MulOrDiv__Group_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4776:1: ( ( () ) )
            // InternalVaselina.g:4777:1: ( () )
            {
            // InternalVaselina.g:4777:1: ( () )
            // InternalVaselina.g:4778:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 
            }
            // InternalVaselina.g:4779:2: ()
            // InternalVaselina.g:4779:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__1"
    // InternalVaselina.g:4787:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4791:1: ( rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 )
            // InternalVaselina.g:4792:2: rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__MulOrDiv__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__1"


    // $ANTLR start "rule__MulOrDiv__Group_1__1__Impl"
    // InternalVaselina.g:4799:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4803:1: ( ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) )
            // InternalVaselina.g:4804:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            {
            // InternalVaselina.g:4804:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            // InternalVaselina.g:4805:2: ( rule__MulOrDiv__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 
            }
            // InternalVaselina.g:4806:2: ( rule__MulOrDiv__OpAssignment_1_1 )
            // InternalVaselina.g:4806:3: rule__MulOrDiv__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 
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
    // $ANTLR end "rule__MulOrDiv__Group_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__2"
    // InternalVaselina.g:4814:1: rule__MulOrDiv__Group_1__2 : rule__MulOrDiv__Group_1__2__Impl ;
    public final void rule__MulOrDiv__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4818:1: ( rule__MulOrDiv__Group_1__2__Impl )
            // InternalVaselina.g:4819:2: rule__MulOrDiv__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__2"


    // $ANTLR start "rule__MulOrDiv__Group_1__2__Impl"
    // InternalVaselina.g:4825:1: rule__MulOrDiv__Group_1__2__Impl : ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) ;
    public final void rule__MulOrDiv__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4829:1: ( ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) )
            // InternalVaselina.g:4830:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            {
            // InternalVaselina.g:4830:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            // InternalVaselina.g:4831:2: ( rule__MulOrDiv__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 
            }
            // InternalVaselina.g:4832:2: ( rule__MulOrDiv__RightAssignment_1_2 )
            // InternalVaselina.g:4832:3: rule__MulOrDiv__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__MulOrDiv__Group_1__2__Impl"


    // $ANTLR start "rule__Module__Group__0"
    // InternalVaselina.g:4841:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4845:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // InternalVaselina.g:4846:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_52);
            rule__Module__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Module__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0"


    // $ANTLR start "rule__Module__Group__0__Impl"
    // InternalVaselina.g:4853:1: rule__Module__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4857:1: ( ( rulePrimary ) )
            // InternalVaselina.g:4858:1: ( rulePrimary )
            {
            // InternalVaselina.g:4858:1: ( rulePrimary )
            // InternalVaselina.g:4859:2: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getPrimaryParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getPrimaryParserRuleCall_0()); 
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
    // $ANTLR end "rule__Module__Group__0__Impl"


    // $ANTLR start "rule__Module__Group__1"
    // InternalVaselina.g:4868:1: rule__Module__Group__1 : rule__Module__Group__1__Impl ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4872:1: ( rule__Module__Group__1__Impl )
            // InternalVaselina.g:4873:2: rule__Module__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Module__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1"


    // $ANTLR start "rule__Module__Group__1__Impl"
    // InternalVaselina.g:4879:1: rule__Module__Group__1__Impl : ( ( rule__Module__Group_1__0 )* ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4883:1: ( ( ( rule__Module__Group_1__0 )* ) )
            // InternalVaselina.g:4884:1: ( ( rule__Module__Group_1__0 )* )
            {
            // InternalVaselina.g:4884:1: ( ( rule__Module__Group_1__0 )* )
            // InternalVaselina.g:4885:2: ( rule__Module__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getGroup_1()); 
            }
            // InternalVaselina.g:4886:2: ( rule__Module__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==70) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalVaselina.g:4886:3: rule__Module__Group_1__0
            	    {
            	    pushFollow(FOLLOW_53);
            	    rule__Module__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Module__Group__1__Impl"


    // $ANTLR start "rule__Module__Group_1__0"
    // InternalVaselina.g:4895:1: rule__Module__Group_1__0 : rule__Module__Group_1__0__Impl rule__Module__Group_1__1 ;
    public final void rule__Module__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4899:1: ( rule__Module__Group_1__0__Impl rule__Module__Group_1__1 )
            // InternalVaselina.g:4900:2: rule__Module__Group_1__0__Impl rule__Module__Group_1__1
            {
            pushFollow(FOLLOW_52);
            rule__Module__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Module__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_1__0"


    // $ANTLR start "rule__Module__Group_1__0__Impl"
    // InternalVaselina.g:4907:1: rule__Module__Group_1__0__Impl : ( () ) ;
    public final void rule__Module__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4911:1: ( ( () ) )
            // InternalVaselina.g:4912:1: ( () )
            {
            // InternalVaselina.g:4912:1: ( () )
            // InternalVaselina.g:4913:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getModuleLeftAction_1_0()); 
            }
            // InternalVaselina.g:4914:2: ()
            // InternalVaselina.g:4914:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getModuleLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_1__0__Impl"


    // $ANTLR start "rule__Module__Group_1__1"
    // InternalVaselina.g:4922:1: rule__Module__Group_1__1 : rule__Module__Group_1__1__Impl rule__Module__Group_1__2 ;
    public final void rule__Module__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4926:1: ( rule__Module__Group_1__1__Impl rule__Module__Group_1__2 )
            // InternalVaselina.g:4927:2: rule__Module__Group_1__1__Impl rule__Module__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Module__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Module__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_1__1"


    // $ANTLR start "rule__Module__Group_1__1__Impl"
    // InternalVaselina.g:4934:1: rule__Module__Group_1__1__Impl : ( ( rule__Module__OpAssignment_1_1 ) ) ;
    public final void rule__Module__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4938:1: ( ( ( rule__Module__OpAssignment_1_1 ) ) )
            // InternalVaselina.g:4939:1: ( ( rule__Module__OpAssignment_1_1 ) )
            {
            // InternalVaselina.g:4939:1: ( ( rule__Module__OpAssignment_1_1 ) )
            // InternalVaselina.g:4940:2: ( rule__Module__OpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getOpAssignment_1_1()); 
            }
            // InternalVaselina.g:4941:2: ( rule__Module__OpAssignment_1_1 )
            // InternalVaselina.g:4941:3: rule__Module__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Module__OpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getOpAssignment_1_1()); 
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
    // $ANTLR end "rule__Module__Group_1__1__Impl"


    // $ANTLR start "rule__Module__Group_1__2"
    // InternalVaselina.g:4949:1: rule__Module__Group_1__2 : rule__Module__Group_1__2__Impl ;
    public final void rule__Module__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4953:1: ( rule__Module__Group_1__2__Impl )
            // InternalVaselina.g:4954:2: rule__Module__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Module__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_1__2"


    // $ANTLR start "rule__Module__Group_1__2__Impl"
    // InternalVaselina.g:4960:1: rule__Module__Group_1__2__Impl : ( ( rule__Module__RightAssignment_1_2 ) ) ;
    public final void rule__Module__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4964:1: ( ( ( rule__Module__RightAssignment_1_2 ) ) )
            // InternalVaselina.g:4965:1: ( ( rule__Module__RightAssignment_1_2 ) )
            {
            // InternalVaselina.g:4965:1: ( ( rule__Module__RightAssignment_1_2 ) )
            // InternalVaselina.g:4966:2: ( rule__Module__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getRightAssignment_1_2()); 
            }
            // InternalVaselina.g:4967:2: ( rule__Module__RightAssignment_1_2 )
            // InternalVaselina.g:4967:3: rule__Module__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Module__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__Module__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalVaselina.g:4976:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4980:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalVaselina.g:4981:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalVaselina.g:4988:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:4992:1: ( ( '(' ) )
            // InternalVaselina.g:4993:1: ( '(' )
            {
            // InternalVaselina.g:4993:1: ( '(' )
            // InternalVaselina.g:4994:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
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
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalVaselina.g:5003:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5007:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalVaselina.g:5008:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_9);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalVaselina.g:5015:1: rule__Primary__Group_0__1__Impl : ( () ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5019:1: ( ( () ) )
            // InternalVaselina.g:5020:1: ( () )
            {
            // InternalVaselina.g:5020:1: ( () )
            // InternalVaselina.g:5021:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getInsideAction_0_1()); 
            }
            // InternalVaselina.g:5022:2: ()
            // InternalVaselina.g:5022:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getInsideAction_0_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__2"
    // InternalVaselina.g:5030:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl rule__Primary__Group_0__3 ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5034:1: ( rule__Primary__Group_0__2__Impl rule__Primary__Group_0__3 )
            // InternalVaselina.g:5035:2: rule__Primary__Group_0__2__Impl rule__Primary__Group_0__3
            {
            pushFollow(FOLLOW_54);
            rule__Primary__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2"


    // $ANTLR start "rule__Primary__Group_0__2__Impl"
    // InternalVaselina.g:5042:1: rule__Primary__Group_0__2__Impl : ( ( rule__Primary__InsideAssignment_0_2 ) ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5046:1: ( ( ( rule__Primary__InsideAssignment_0_2 ) ) )
            // InternalVaselina.g:5047:1: ( ( rule__Primary__InsideAssignment_0_2 ) )
            {
            // InternalVaselina.g:5047:1: ( ( rule__Primary__InsideAssignment_0_2 ) )
            // InternalVaselina.g:5048:2: ( rule__Primary__InsideAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getInsideAssignment_0_2()); 
            }
            // InternalVaselina.g:5049:2: ( rule__Primary__InsideAssignment_0_2 )
            // InternalVaselina.g:5049:3: rule__Primary__InsideAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__InsideAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getInsideAssignment_0_2()); 
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
    // $ANTLR end "rule__Primary__Group_0__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__3"
    // InternalVaselina.g:5057:1: rule__Primary__Group_0__3 : rule__Primary__Group_0__3__Impl ;
    public final void rule__Primary__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5061:1: ( rule__Primary__Group_0__3__Impl )
            // InternalVaselina.g:5062:2: rule__Primary__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__3"


    // $ANTLR start "rule__Primary__Group_0__3__Impl"
    // InternalVaselina.g:5068:1: rule__Primary__Group_0__3__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5072:1: ( ( ')' ) )
            // InternalVaselina.g:5073:1: ( ')' )
            {
            // InternalVaselina.g:5073:1: ( ')' )
            // InternalVaselina.g:5074:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_3()); 
            }
            match(input,63,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_3()); 
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
    // $ANTLR end "rule__Primary__Group_0__3__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalVaselina.g:5084:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5088:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalVaselina.g:5089:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_55);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalVaselina.g:5096:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5100:1: ( ( () ) )
            // InternalVaselina.g:5101:1: ( () )
            {
            // InternalVaselina.g:5101:1: ( () )
            // InternalVaselina.g:5102:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            }
            // InternalVaselina.g:5103:2: ()
            // InternalVaselina.g:5103:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            }

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
    // InternalVaselina.g:5111:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5115:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalVaselina.g:5116:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalVaselina.g:5123:1: rule__Primary__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5127:1: ( ( '!' ) )
            // InternalVaselina.g:5128:1: ( '!' )
            {
            // InternalVaselina.g:5128:1: ( '!' )
            // InternalVaselina.g:5129:2: '!'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
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
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // InternalVaselina.g:5138:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5142:1: ( rule__Primary__Group_1__2__Impl )
            // InternalVaselina.g:5143:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalVaselina.g:5149:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5153:1: ( ( ( rule__Primary__ExpressionAssignment_1_2 ) ) )
            // InternalVaselina.g:5154:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            {
            // InternalVaselina.g:5154:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            // InternalVaselina.g:5155:2: ( rule__Primary__ExpressionAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            }
            // InternalVaselina.g:5156:2: ( rule__Primary__ExpressionAssignment_1_2 )
            // InternalVaselina.g:5156:3: rule__Primary__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
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
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__Terminal__Group_0__0"
    // InternalVaselina.g:5165:1: rule__Terminal__Group_0__0 : rule__Terminal__Group_0__0__Impl rule__Terminal__Group_0__1 ;
    public final void rule__Terminal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5169:1: ( rule__Terminal__Group_0__0__Impl rule__Terminal__Group_0__1 )
            // InternalVaselina.g:5170:2: rule__Terminal__Group_0__0__Impl rule__Terminal__Group_0__1
            {
            pushFollow(FOLLOW_56);
            rule__Terminal__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Terminal__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_0__0"


    // $ANTLR start "rule__Terminal__Group_0__0__Impl"
    // InternalVaselina.g:5177:1: rule__Terminal__Group_0__0__Impl : ( () ) ;
    public final void rule__Terminal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5181:1: ( ( () ) )
            // InternalVaselina.g:5182:1: ( () )
            {
            // InternalVaselina.g:5182:1: ( () )
            // InternalVaselina.g:5183:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getStringRefAction_0_0()); 
            }
            // InternalVaselina.g:5184:2: ()
            // InternalVaselina.g:5184:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getStringRefAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_0__0__Impl"


    // $ANTLR start "rule__Terminal__Group_0__1"
    // InternalVaselina.g:5192:1: rule__Terminal__Group_0__1 : rule__Terminal__Group_0__1__Impl ;
    public final void rule__Terminal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5196:1: ( rule__Terminal__Group_0__1__Impl )
            // InternalVaselina.g:5197:2: rule__Terminal__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Terminal__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_0__1"


    // $ANTLR start "rule__Terminal__Group_0__1__Impl"
    // InternalVaselina.g:5203:1: rule__Terminal__Group_0__1__Impl : ( ( rule__Terminal__ValueAssignment_0_1 ) ) ;
    public final void rule__Terminal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5207:1: ( ( ( rule__Terminal__ValueAssignment_0_1 ) ) )
            // InternalVaselina.g:5208:1: ( ( rule__Terminal__ValueAssignment_0_1 ) )
            {
            // InternalVaselina.g:5208:1: ( ( rule__Terminal__ValueAssignment_0_1 ) )
            // InternalVaselina.g:5209:2: ( rule__Terminal__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getValueAssignment_0_1()); 
            }
            // InternalVaselina.g:5210:2: ( rule__Terminal__ValueAssignment_0_1 )
            // InternalVaselina.g:5210:3: rule__Terminal__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Terminal__ValueAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getValueAssignment_0_1()); 
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
    // $ANTLR end "rule__Terminal__Group_0__1__Impl"


    // $ANTLR start "rule__Terminal__Group_1__0"
    // InternalVaselina.g:5219:1: rule__Terminal__Group_1__0 : rule__Terminal__Group_1__0__Impl rule__Terminal__Group_1__1 ;
    public final void rule__Terminal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5223:1: ( rule__Terminal__Group_1__0__Impl rule__Terminal__Group_1__1 )
            // InternalVaselina.g:5224:2: rule__Terminal__Group_1__0__Impl rule__Terminal__Group_1__1
            {
            pushFollow(FOLLOW_57);
            rule__Terminal__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Terminal__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_1__0"


    // $ANTLR start "rule__Terminal__Group_1__0__Impl"
    // InternalVaselina.g:5231:1: rule__Terminal__Group_1__0__Impl : ( () ) ;
    public final void rule__Terminal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5235:1: ( ( () ) )
            // InternalVaselina.g:5236:1: ( () )
            {
            // InternalVaselina.g:5236:1: ( () )
            // InternalVaselina.g:5237:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getNumRefAction_1_0()); 
            }
            // InternalVaselina.g:5238:2: ()
            // InternalVaselina.g:5238:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getNumRefAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_1__0__Impl"


    // $ANTLR start "rule__Terminal__Group_1__1"
    // InternalVaselina.g:5246:1: rule__Terminal__Group_1__1 : rule__Terminal__Group_1__1__Impl ;
    public final void rule__Terminal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5250:1: ( rule__Terminal__Group_1__1__Impl )
            // InternalVaselina.g:5251:2: rule__Terminal__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Terminal__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_1__1"


    // $ANTLR start "rule__Terminal__Group_1__1__Impl"
    // InternalVaselina.g:5257:1: rule__Terminal__Group_1__1__Impl : ( ( rule__Terminal__ValueAssignment_1_1 ) ) ;
    public final void rule__Terminal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5261:1: ( ( ( rule__Terminal__ValueAssignment_1_1 ) ) )
            // InternalVaselina.g:5262:1: ( ( rule__Terminal__ValueAssignment_1_1 ) )
            {
            // InternalVaselina.g:5262:1: ( ( rule__Terminal__ValueAssignment_1_1 ) )
            // InternalVaselina.g:5263:2: ( rule__Terminal__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getValueAssignment_1_1()); 
            }
            // InternalVaselina.g:5264:2: ( rule__Terminal__ValueAssignment_1_1 )
            // InternalVaselina.g:5264:3: rule__Terminal__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Terminal__ValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getValueAssignment_1_1()); 
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
    // $ANTLR end "rule__Terminal__Group_1__1__Impl"


    // $ANTLR start "rule__Terminal__Group_2__0"
    // InternalVaselina.g:5273:1: rule__Terminal__Group_2__0 : rule__Terminal__Group_2__0__Impl rule__Terminal__Group_2__1 ;
    public final void rule__Terminal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5277:1: ( rule__Terminal__Group_2__0__Impl rule__Terminal__Group_2__1 )
            // InternalVaselina.g:5278:2: rule__Terminal__Group_2__0__Impl rule__Terminal__Group_2__1
            {
            pushFollow(FOLLOW_57);
            rule__Terminal__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Terminal__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_2__0"


    // $ANTLR start "rule__Terminal__Group_2__0__Impl"
    // InternalVaselina.g:5285:1: rule__Terminal__Group_2__0__Impl : ( () ) ;
    public final void rule__Terminal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5289:1: ( ( () ) )
            // InternalVaselina.g:5290:1: ( () )
            {
            // InternalVaselina.g:5290:1: ( () )
            // InternalVaselina.g:5291:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getDoubleRefAction_2_0()); 
            }
            // InternalVaselina.g:5292:2: ()
            // InternalVaselina.g:5292:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getDoubleRefAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_2__0__Impl"


    // $ANTLR start "rule__Terminal__Group_2__1"
    // InternalVaselina.g:5300:1: rule__Terminal__Group_2__1 : rule__Terminal__Group_2__1__Impl ;
    public final void rule__Terminal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5304:1: ( rule__Terminal__Group_2__1__Impl )
            // InternalVaselina.g:5305:2: rule__Terminal__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Terminal__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_2__1"


    // $ANTLR start "rule__Terminal__Group_2__1__Impl"
    // InternalVaselina.g:5311:1: rule__Terminal__Group_2__1__Impl : ( ( rule__Terminal__ValueAssignment_2_1 ) ) ;
    public final void rule__Terminal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5315:1: ( ( ( rule__Terminal__ValueAssignment_2_1 ) ) )
            // InternalVaselina.g:5316:1: ( ( rule__Terminal__ValueAssignment_2_1 ) )
            {
            // InternalVaselina.g:5316:1: ( ( rule__Terminal__ValueAssignment_2_1 ) )
            // InternalVaselina.g:5317:2: ( rule__Terminal__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getValueAssignment_2_1()); 
            }
            // InternalVaselina.g:5318:2: ( rule__Terminal__ValueAssignment_2_1 )
            // InternalVaselina.g:5318:3: rule__Terminal__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Terminal__ValueAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getValueAssignment_2_1()); 
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
    // $ANTLR end "rule__Terminal__Group_2__1__Impl"


    // $ANTLR start "rule__Terminal__Group_3__0"
    // InternalVaselina.g:5327:1: rule__Terminal__Group_3__0 : rule__Terminal__Group_3__0__Impl rule__Terminal__Group_3__1 ;
    public final void rule__Terminal__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5331:1: ( rule__Terminal__Group_3__0__Impl rule__Terminal__Group_3__1 )
            // InternalVaselina.g:5332:2: rule__Terminal__Group_3__0__Impl rule__Terminal__Group_3__1
            {
            pushFollow(FOLLOW_58);
            rule__Terminal__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Terminal__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_3__0"


    // $ANTLR start "rule__Terminal__Group_3__0__Impl"
    // InternalVaselina.g:5339:1: rule__Terminal__Group_3__0__Impl : ( () ) ;
    public final void rule__Terminal__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5343:1: ( ( () ) )
            // InternalVaselina.g:5344:1: ( () )
            {
            // InternalVaselina.g:5344:1: ( () )
            // InternalVaselina.g:5345:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getBoolRefAction_3_0()); 
            }
            // InternalVaselina.g:5346:2: ()
            // InternalVaselina.g:5346:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getBoolRefAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_3__0__Impl"


    // $ANTLR start "rule__Terminal__Group_3__1"
    // InternalVaselina.g:5354:1: rule__Terminal__Group_3__1 : rule__Terminal__Group_3__1__Impl ;
    public final void rule__Terminal__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5358:1: ( rule__Terminal__Group_3__1__Impl )
            // InternalVaselina.g:5359:2: rule__Terminal__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Terminal__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_3__1"


    // $ANTLR start "rule__Terminal__Group_3__1__Impl"
    // InternalVaselina.g:5365:1: rule__Terminal__Group_3__1__Impl : ( ( rule__Terminal__VarRefAssignment_3_1 ) ) ;
    public final void rule__Terminal__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5369:1: ( ( ( rule__Terminal__VarRefAssignment_3_1 ) ) )
            // InternalVaselina.g:5370:1: ( ( rule__Terminal__VarRefAssignment_3_1 ) )
            {
            // InternalVaselina.g:5370:1: ( ( rule__Terminal__VarRefAssignment_3_1 ) )
            // InternalVaselina.g:5371:2: ( rule__Terminal__VarRefAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getVarRefAssignment_3_1()); 
            }
            // InternalVaselina.g:5372:2: ( rule__Terminal__VarRefAssignment_3_1 )
            // InternalVaselina.g:5372:3: rule__Terminal__VarRefAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Terminal__VarRefAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getVarRefAssignment_3_1()); 
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
    // $ANTLR end "rule__Terminal__Group_3__1__Impl"


    // $ANTLR start "rule__Terminal__Group_4__0"
    // InternalVaselina.g:5381:1: rule__Terminal__Group_4__0 : rule__Terminal__Group_4__0__Impl rule__Terminal__Group_4__1 ;
    public final void rule__Terminal__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5385:1: ( rule__Terminal__Group_4__0__Impl rule__Terminal__Group_4__1 )
            // InternalVaselina.g:5386:2: rule__Terminal__Group_4__0__Impl rule__Terminal__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Terminal__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Terminal__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_4__0"


    // $ANTLR start "rule__Terminal__Group_4__0__Impl"
    // InternalVaselina.g:5393:1: rule__Terminal__Group_4__0__Impl : ( () ) ;
    public final void rule__Terminal__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5397:1: ( ( () ) )
            // InternalVaselina.g:5398:1: ( () )
            {
            // InternalVaselina.g:5398:1: ( () )
            // InternalVaselina.g:5399:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getVarRefAction_4_0()); 
            }
            // InternalVaselina.g:5400:2: ()
            // InternalVaselina.g:5400:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getVarRefAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_4__0__Impl"


    // $ANTLR start "rule__Terminal__Group_4__1"
    // InternalVaselina.g:5408:1: rule__Terminal__Group_4__1 : rule__Terminal__Group_4__1__Impl ;
    public final void rule__Terminal__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5412:1: ( rule__Terminal__Group_4__1__Impl )
            // InternalVaselina.g:5413:2: rule__Terminal__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Terminal__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_4__1"


    // $ANTLR start "rule__Terminal__Group_4__1__Impl"
    // InternalVaselina.g:5419:1: rule__Terminal__Group_4__1__Impl : ( ( rule__Terminal__VarRefAssignment_4_1 ) ) ;
    public final void rule__Terminal__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5423:1: ( ( ( rule__Terminal__VarRefAssignment_4_1 ) ) )
            // InternalVaselina.g:5424:1: ( ( rule__Terminal__VarRefAssignment_4_1 ) )
            {
            // InternalVaselina.g:5424:1: ( ( rule__Terminal__VarRefAssignment_4_1 ) )
            // InternalVaselina.g:5425:2: ( rule__Terminal__VarRefAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getVarRefAssignment_4_1()); 
            }
            // InternalVaselina.g:5426:2: ( rule__Terminal__VarRefAssignment_4_1 )
            // InternalVaselina.g:5426:3: rule__Terminal__VarRefAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Terminal__VarRefAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getVarRefAssignment_4_1()); 
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
    // $ANTLR end "rule__Terminal__Group_4__1__Impl"


    // $ANTLR start "rule__Terminal__Group_5__0"
    // InternalVaselina.g:5435:1: rule__Terminal__Group_5__0 : rule__Terminal__Group_5__0__Impl rule__Terminal__Group_5__1 ;
    public final void rule__Terminal__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5439:1: ( rule__Terminal__Group_5__0__Impl rule__Terminal__Group_5__1 )
            // InternalVaselina.g:5440:2: rule__Terminal__Group_5__0__Impl rule__Terminal__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__Terminal__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Terminal__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_5__0"


    // $ANTLR start "rule__Terminal__Group_5__0__Impl"
    // InternalVaselina.g:5447:1: rule__Terminal__Group_5__0__Impl : ( () ) ;
    public final void rule__Terminal__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5451:1: ( ( () ) )
            // InternalVaselina.g:5452:1: ( () )
            {
            // InternalVaselina.g:5452:1: ( () )
            // InternalVaselina.g:5453:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getArrayRefAction_5_0()); 
            }
            // InternalVaselina.g:5454:2: ()
            // InternalVaselina.g:5454:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getArrayRefAction_5_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_5__0__Impl"


    // $ANTLR start "rule__Terminal__Group_5__1"
    // InternalVaselina.g:5462:1: rule__Terminal__Group_5__1 : rule__Terminal__Group_5__1__Impl rule__Terminal__Group_5__2 ;
    public final void rule__Terminal__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5466:1: ( rule__Terminal__Group_5__1__Impl rule__Terminal__Group_5__2 )
            // InternalVaselina.g:5467:2: rule__Terminal__Group_5__1__Impl rule__Terminal__Group_5__2
            {
            pushFollow(FOLLOW_14);
            rule__Terminal__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Terminal__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_5__1"


    // $ANTLR start "rule__Terminal__Group_5__1__Impl"
    // InternalVaselina.g:5474:1: rule__Terminal__Group_5__1__Impl : ( ( rule__Terminal__VarRefAssignment_5_1 ) ) ;
    public final void rule__Terminal__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5478:1: ( ( ( rule__Terminal__VarRefAssignment_5_1 ) ) )
            // InternalVaselina.g:5479:1: ( ( rule__Terminal__VarRefAssignment_5_1 ) )
            {
            // InternalVaselina.g:5479:1: ( ( rule__Terminal__VarRefAssignment_5_1 ) )
            // InternalVaselina.g:5480:2: ( rule__Terminal__VarRefAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getVarRefAssignment_5_1()); 
            }
            // InternalVaselina.g:5481:2: ( rule__Terminal__VarRefAssignment_5_1 )
            // InternalVaselina.g:5481:3: rule__Terminal__VarRefAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Terminal__VarRefAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getVarRefAssignment_5_1()); 
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
    // $ANTLR end "rule__Terminal__Group_5__1__Impl"


    // $ANTLR start "rule__Terminal__Group_5__2"
    // InternalVaselina.g:5489:1: rule__Terminal__Group_5__2 : rule__Terminal__Group_5__2__Impl ;
    public final void rule__Terminal__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5493:1: ( rule__Terminal__Group_5__2__Impl )
            // InternalVaselina.g:5494:2: rule__Terminal__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Terminal__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_5__2"


    // $ANTLR start "rule__Terminal__Group_5__2__Impl"
    // InternalVaselina.g:5500:1: rule__Terminal__Group_5__2__Impl : ( ( ( rule__Terminal__DimAssignment_5_2 ) ) ( ( rule__Terminal__DimAssignment_5_2 )* ) ) ;
    public final void rule__Terminal__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5504:1: ( ( ( ( rule__Terminal__DimAssignment_5_2 ) ) ( ( rule__Terminal__DimAssignment_5_2 )* ) ) )
            // InternalVaselina.g:5505:1: ( ( ( rule__Terminal__DimAssignment_5_2 ) ) ( ( rule__Terminal__DimAssignment_5_2 )* ) )
            {
            // InternalVaselina.g:5505:1: ( ( ( rule__Terminal__DimAssignment_5_2 ) ) ( ( rule__Terminal__DimAssignment_5_2 )* ) )
            // InternalVaselina.g:5506:2: ( ( rule__Terminal__DimAssignment_5_2 ) ) ( ( rule__Terminal__DimAssignment_5_2 )* )
            {
            // InternalVaselina.g:5506:2: ( ( rule__Terminal__DimAssignment_5_2 ) )
            // InternalVaselina.g:5507:3: ( rule__Terminal__DimAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getDimAssignment_5_2()); 
            }
            // InternalVaselina.g:5508:3: ( rule__Terminal__DimAssignment_5_2 )
            // InternalVaselina.g:5508:4: rule__Terminal__DimAssignment_5_2
            {
            pushFollow(FOLLOW_15);
            rule__Terminal__DimAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getDimAssignment_5_2()); 
            }

            }

            // InternalVaselina.g:5511:2: ( ( rule__Terminal__DimAssignment_5_2 )* )
            // InternalVaselina.g:5512:3: ( rule__Terminal__DimAssignment_5_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getDimAssignment_5_2()); 
            }
            // InternalVaselina.g:5513:3: ( rule__Terminal__DimAssignment_5_2 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==43) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalVaselina.g:5513:4: rule__Terminal__DimAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Terminal__DimAssignment_5_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getDimAssignment_5_2()); 
            }

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
    // $ANTLR end "rule__Terminal__Group_5__2__Impl"


    // $ANTLR start "rule__VaselinaProgram__GlobalAssignment_0"
    // InternalVaselina.g:5523:1: rule__VaselinaProgram__GlobalAssignment_0 : ( rulevarDeclared ) ;
    public final void rule__VaselinaProgram__GlobalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5527:1: ( ( rulevarDeclared ) )
            // InternalVaselina.g:5528:2: ( rulevarDeclared )
            {
            // InternalVaselina.g:5528:2: ( rulevarDeclared )
            // InternalVaselina.g:5529:3: rulevarDeclared
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVaselinaProgramAccess().getGlobalVarDeclaredParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevarDeclared();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVaselinaProgramAccess().getGlobalVarDeclaredParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__VaselinaProgram__GlobalAssignment_0"


    // $ANTLR start "rule__VaselinaProgram__FuncAssignment_1"
    // InternalVaselina.g:5538:1: rule__VaselinaProgram__FuncAssignment_1 : ( ruleFuncDefinition ) ;
    public final void rule__VaselinaProgram__FuncAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5542:1: ( ( ruleFuncDefinition ) )
            // InternalVaselina.g:5543:2: ( ruleFuncDefinition )
            {
            // InternalVaselina.g:5543:2: ( ruleFuncDefinition )
            // InternalVaselina.g:5544:3: ruleFuncDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVaselinaProgramAccess().getFuncFuncDefinitionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFuncDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVaselinaProgramAccess().getFuncFuncDefinitionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__VaselinaProgram__FuncAssignment_1"


    // $ANTLR start "rule__VaselinaProgram__MainAssignment_2"
    // InternalVaselina.g:5553:1: rule__VaselinaProgram__MainAssignment_2 : ( rulemainDeclared ) ;
    public final void rule__VaselinaProgram__MainAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5557:1: ( ( rulemainDeclared ) )
            // InternalVaselina.g:5558:2: ( rulemainDeclared )
            {
            // InternalVaselina.g:5558:2: ( rulemainDeclared )
            // InternalVaselina.g:5559:3: rulemainDeclared
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVaselinaProgramAccess().getMainMainDeclaredParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulemainDeclared();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVaselinaProgramAccess().getMainMainDeclaredParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__VaselinaProgram__MainAssignment_2"


    // $ANTLR start "rule__MainDeclared__BodyAssignment_3"
    // InternalVaselina.g:5568:1: rule__MainDeclared__BodyAssignment_3 : ( ruleBodyStatement ) ;
    public final void rule__MainDeclared__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5572:1: ( ( ruleBodyStatement ) )
            // InternalVaselina.g:5573:2: ( ruleBodyStatement )
            {
            // InternalVaselina.g:5573:2: ( ruleBodyStatement )
            // InternalVaselina.g:5574:3: ruleBodyStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMainDeclaredAccess().getBodyBodyStatementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBodyStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMainDeclaredAccess().getBodyBodyStatementParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__MainDeclared__BodyAssignment_3"


    // $ANTLR start "rule__VarReturn__RtnAssignment_1"
    // InternalVaselina.g:5583:1: rule__VarReturn__RtnAssignment_1 : ( rulevarExpression ) ;
    public final void rule__VarReturn__RtnAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5587:1: ( ( rulevarExpression ) )
            // InternalVaselina.g:5588:2: ( rulevarExpression )
            {
            // InternalVaselina.g:5588:2: ( rulevarExpression )
            // InternalVaselina.g:5589:3: rulevarExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarReturnAccess().getRtnVarExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevarExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarReturnAccess().getRtnVarExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__VarReturn__RtnAssignment_1"


    // $ANTLR start "rule__VarDeclared__ScopeAssignment_1_0_0"
    // InternalVaselina.g:5598:1: rule__VarDeclared__ScopeAssignment_1_0_0 : ( ( 'box' ) ) ;
    public final void rule__VarDeclared__ScopeAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5602:1: ( ( ( 'box' ) ) )
            // InternalVaselina.g:5603:2: ( ( 'box' ) )
            {
            // InternalVaselina.g:5603:2: ( ( 'box' ) )
            // InternalVaselina.g:5604:3: ( 'box' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclaredAccess().getScopeBoxKeyword_1_0_0_0()); 
            }
            // InternalVaselina.g:5605:3: ( 'box' )
            // InternalVaselina.g:5606:4: 'box'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclaredAccess().getScopeBoxKeyword_1_0_0_0()); 
            }
            match(input,65,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclaredAccess().getScopeBoxKeyword_1_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclaredAccess().getScopeBoxKeyword_1_0_0_0()); 
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
    // $ANTLR end "rule__VarDeclared__ScopeAssignment_1_0_0"


    // $ANTLR start "rule__VarDeclared__NameAssignment_1_0_1"
    // InternalVaselina.g:5617:1: rule__VarDeclared__NameAssignment_1_0_1 : ( RULE_ID ) ;
    public final void rule__VarDeclared__NameAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5621:1: ( ( RULE_ID ) )
            // InternalVaselina.g:5622:2: ( RULE_ID )
            {
            // InternalVaselina.g:5622:2: ( RULE_ID )
            // InternalVaselina.g:5623:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclaredAccess().getNameIDTerminalRuleCall_1_0_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclaredAccess().getNameIDTerminalRuleCall_1_0_1_0()); 
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
    // $ANTLR end "rule__VarDeclared__NameAssignment_1_0_1"


    // $ANTLR start "rule__VarDeclared__ScopeAssignment_1_1_0"
    // InternalVaselina.g:5632:1: rule__VarDeclared__ScopeAssignment_1_1_0 : ( ( 'boxes' ) ) ;
    public final void rule__VarDeclared__ScopeAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5636:1: ( ( ( 'boxes' ) ) )
            // InternalVaselina.g:5637:2: ( ( 'boxes' ) )
            {
            // InternalVaselina.g:5637:2: ( ( 'boxes' ) )
            // InternalVaselina.g:5638:3: ( 'boxes' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclaredAccess().getScopeBoxesKeyword_1_1_0_0()); 
            }
            // InternalVaselina.g:5639:3: ( 'boxes' )
            // InternalVaselina.g:5640:4: 'boxes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclaredAccess().getScopeBoxesKeyword_1_1_0_0()); 
            }
            match(input,66,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclaredAccess().getScopeBoxesKeyword_1_1_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclaredAccess().getScopeBoxesKeyword_1_1_0_0()); 
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
    // $ANTLR end "rule__VarDeclared__ScopeAssignment_1_1_0"


    // $ANTLR start "rule__VarDeclared__NameAssignment_1_1_1"
    // InternalVaselina.g:5651:1: rule__VarDeclared__NameAssignment_1_1_1 : ( RULE_ID ) ;
    public final void rule__VarDeclared__NameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5655:1: ( ( RULE_ID ) )
            // InternalVaselina.g:5656:2: ( RULE_ID )
            {
            // InternalVaselina.g:5656:2: ( RULE_ID )
            // InternalVaselina.g:5657:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclaredAccess().getNameIDTerminalRuleCall_1_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclaredAccess().getNameIDTerminalRuleCall_1_1_1_0()); 
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
    // $ANTLR end "rule__VarDeclared__NameAssignment_1_1_1"


    // $ANTLR start "rule__VarDeclared__DimAssignment_1_1_2"
    // InternalVaselina.g:5666:1: rule__VarDeclared__DimAssignment_1_1_2 : ( rulearrayDimension ) ;
    public final void rule__VarDeclared__DimAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5670:1: ( ( rulearrayDimension ) )
            // InternalVaselina.g:5671:2: ( rulearrayDimension )
            {
            // InternalVaselina.g:5671:2: ( rulearrayDimension )
            // InternalVaselina.g:5672:3: rulearrayDimension
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclaredAccess().getDimArrayDimensionParserRuleCall_1_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulearrayDimension();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclaredAccess().getDimArrayDimensionParserRuleCall_1_1_2_0()); 
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
    // $ANTLR end "rule__VarDeclared__DimAssignment_1_1_2"


    // $ANTLR start "rule__VarDeclared__TypeAssignment_3"
    // InternalVaselina.g:5681:1: rule__VarDeclared__TypeAssignment_3 : ( rulevarTypeLiteral ) ;
    public final void rule__VarDeclared__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5685:1: ( ( rulevarTypeLiteral ) )
            // InternalVaselina.g:5686:2: ( rulevarTypeLiteral )
            {
            // InternalVaselina.g:5686:2: ( rulevarTypeLiteral )
            // InternalVaselina.g:5687:3: rulevarTypeLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarDeclaredAccess().getTypeVarTypeLiteralParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevarTypeLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarDeclaredAccess().getTypeVarTypeLiteralParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__VarDeclared__TypeAssignment_3"


    // $ANTLR start "rule__VarAssignment__VariableAssignment_0"
    // InternalVaselina.g:5696:1: rule__VarAssignment__VariableAssignment_0 : ( ruleVariable ) ;
    public final void rule__VarAssignment__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5700:1: ( ( ruleVariable ) )
            // InternalVaselina.g:5701:2: ( ruleVariable )
            {
            // InternalVaselina.g:5701:2: ( ruleVariable )
            // InternalVaselina.g:5702:3: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignmentAccess().getVariableVariableParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignmentAccess().getVariableVariableParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__VarAssignment__VariableAssignment_0"


    // $ANTLR start "rule__VarAssignment__ExprAssignment_2"
    // InternalVaselina.g:5711:1: rule__VarAssignment__ExprAssignment_2 : ( rulevarExpression ) ;
    public final void rule__VarAssignment__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5715:1: ( ( rulevarExpression ) )
            // InternalVaselina.g:5716:2: ( rulevarExpression )
            {
            // InternalVaselina.g:5716:2: ( rulevarExpression )
            // InternalVaselina.g:5717:3: rulevarExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarAssignmentAccess().getExprVarExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevarExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarAssignmentAccess().getExprVarExpressionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__VarAssignment__ExprAssignment_2"


    // $ANTLR start "rule__ArrayRefs__ArrRefsAssignment_1"
    // InternalVaselina.g:5726:1: rule__ArrayRefs__ArrRefsAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ArrayRefs__ArrRefsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5730:1: ( ( ( RULE_ID ) ) )
            // InternalVaselina.g:5731:2: ( ( RULE_ID ) )
            {
            // InternalVaselina.g:5731:2: ( ( RULE_ID ) )
            // InternalVaselina.g:5732:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayRefsAccess().getArrRefsVarSymbolCrossReference_1_0()); 
            }
            // InternalVaselina.g:5733:3: ( RULE_ID )
            // InternalVaselina.g:5734:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayRefsAccess().getArrRefsVarSymbolIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayRefsAccess().getArrRefsVarSymbolIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayRefsAccess().getArrRefsVarSymbolCrossReference_1_0()); 
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
    // $ANTLR end "rule__ArrayRefs__ArrRefsAssignment_1"


    // $ANTLR start "rule__ArrayRefs__DimsAssignment_2"
    // InternalVaselina.g:5745:1: rule__ArrayRefs__DimsAssignment_2 : ( rulearrayDimension ) ;
    public final void rule__ArrayRefs__DimsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5749:1: ( ( rulearrayDimension ) )
            // InternalVaselina.g:5750:2: ( rulearrayDimension )
            {
            // InternalVaselina.g:5750:2: ( rulearrayDimension )
            // InternalVaselina.g:5751:3: rulearrayDimension
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayRefsAccess().getDimsArrayDimensionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulearrayDimension();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayRefsAccess().getDimsArrayDimensionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ArrayRefs__DimsAssignment_2"


    // $ANTLR start "rule__VarRefs__VaRefsAssignment_1"
    // InternalVaselina.g:5760:1: rule__VarRefs__VaRefsAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__VarRefs__VaRefsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5764:1: ( ( ( RULE_ID ) ) )
            // InternalVaselina.g:5765:2: ( ( RULE_ID ) )
            {
            // InternalVaselina.g:5765:2: ( ( RULE_ID ) )
            // InternalVaselina.g:5766:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarRefsAccess().getVaRefsVarSymbolCrossReference_1_0()); 
            }
            // InternalVaselina.g:5767:3: ( RULE_ID )
            // InternalVaselina.g:5768:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarRefsAccess().getVaRefsVarSymbolIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarRefsAccess().getVaRefsVarSymbolIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarRefsAccess().getVaRefsVarSymbolCrossReference_1_0()); 
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
    // $ANTLR end "rule__VarRefs__VaRefsAssignment_1"


    // $ANTLR start "rule__ArrayDimension__IndexAssignment_2"
    // InternalVaselina.g:5779:1: rule__ArrayDimension__IndexAssignment_2 : ( ruleTerminal ) ;
    public final void rule__ArrayDimension__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5783:1: ( ( ruleTerminal ) )
            // InternalVaselina.g:5784:2: ( ruleTerminal )
            {
            // InternalVaselina.g:5784:2: ( ruleTerminal )
            // InternalVaselina.g:5785:3: ruleTerminal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayDimensionAccess().getIndexTerminalParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerminal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayDimensionAccess().getIndexTerminalParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ArrayDimension__IndexAssignment_2"


    // $ANTLR start "rule__FuncCall__FuncAssignment_1"
    // InternalVaselina.g:5794:1: rule__FuncCall__FuncAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FuncCall__FuncAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5798:1: ( ( ( RULE_ID ) ) )
            // InternalVaselina.g:5799:2: ( ( RULE_ID ) )
            {
            // InternalVaselina.g:5799:2: ( ( RULE_ID ) )
            // InternalVaselina.g:5800:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallAccess().getFuncFuncDefinitionCrossReference_1_0()); 
            }
            // InternalVaselina.g:5801:3: ( RULE_ID )
            // InternalVaselina.g:5802:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallAccess().getFuncFuncDefinitionIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallAccess().getFuncFuncDefinitionIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallAccess().getFuncFuncDefinitionCrossReference_1_0()); 
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
    // $ANTLR end "rule__FuncCall__FuncAssignment_1"


    // $ANTLR start "rule__FuncCall__ArgsAssignment_4_0"
    // InternalVaselina.g:5813:1: rule__FuncCall__ArgsAssignment_4_0 : ( rulevarExpression ) ;
    public final void rule__FuncCall__ArgsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5817:1: ( ( rulevarExpression ) )
            // InternalVaselina.g:5818:2: ( rulevarExpression )
            {
            // InternalVaselina.g:5818:2: ( rulevarExpression )
            // InternalVaselina.g:5819:3: rulevarExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallAccess().getArgsVarExpressionParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevarExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallAccess().getArgsVarExpressionParserRuleCall_4_0_0()); 
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
    // $ANTLR end "rule__FuncCall__ArgsAssignment_4_0"


    // $ANTLR start "rule__FuncCall__ArgsAssignment_4_1_1"
    // InternalVaselina.g:5828:1: rule__FuncCall__ArgsAssignment_4_1_1 : ( rulevarExpression ) ;
    public final void rule__FuncCall__ArgsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5832:1: ( ( rulevarExpression ) )
            // InternalVaselina.g:5833:2: ( rulevarExpression )
            {
            // InternalVaselina.g:5833:2: ( rulevarExpression )
            // InternalVaselina.g:5834:3: rulevarExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncCallAccess().getArgsVarExpressionParserRuleCall_4_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevarExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncCallAccess().getArgsVarExpressionParserRuleCall_4_1_1_0()); 
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
    // $ANTLR end "rule__FuncCall__ArgsAssignment_4_1_1"


    // $ANTLR start "rule__FuncDefinition__NameAssignment_1"
    // InternalVaselina.g:5843:1: rule__FuncDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FuncDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5847:1: ( ( RULE_ID ) )
            // InternalVaselina.g:5848:2: ( RULE_ID )
            {
            // InternalVaselina.g:5848:2: ( RULE_ID )
            // InternalVaselina.g:5849:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__FuncDefinition__NameAssignment_1"


    // $ANTLR start "rule__FuncDefinition__ArgsAssignment_3_0_0"
    // InternalVaselina.g:5858:1: rule__FuncDefinition__ArgsAssignment_3_0_0 : ( ruleFuncParameter ) ;
    public final void rule__FuncDefinition__ArgsAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5862:1: ( ( ruleFuncParameter ) )
            // InternalVaselina.g:5863:2: ( ruleFuncParameter )
            {
            // InternalVaselina.g:5863:2: ( ruleFuncParameter )
            // InternalVaselina.g:5864:3: ruleFuncParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncDefinitionAccess().getArgsFuncParameterParserRuleCall_3_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFuncParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncDefinitionAccess().getArgsFuncParameterParserRuleCall_3_0_0_0()); 
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
    // $ANTLR end "rule__FuncDefinition__ArgsAssignment_3_0_0"


    // $ANTLR start "rule__FuncDefinition__ArgsAssignment_3_0_1_1"
    // InternalVaselina.g:5873:1: rule__FuncDefinition__ArgsAssignment_3_0_1_1 : ( ruleFuncParameter ) ;
    public final void rule__FuncDefinition__ArgsAssignment_3_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5877:1: ( ( ruleFuncParameter ) )
            // InternalVaselina.g:5878:2: ( ruleFuncParameter )
            {
            // InternalVaselina.g:5878:2: ( ruleFuncParameter )
            // InternalVaselina.g:5879:3: ruleFuncParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncDefinitionAccess().getArgsFuncParameterParserRuleCall_3_0_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFuncParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncDefinitionAccess().getArgsFuncParameterParserRuleCall_3_0_1_1_0()); 
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
    // $ANTLR end "rule__FuncDefinition__ArgsAssignment_3_0_1_1"


    // $ANTLR start "rule__FuncDefinition__BodyAssignment_5"
    // InternalVaselina.g:5888:1: rule__FuncDefinition__BodyAssignment_5 : ( ruleBodyStatement ) ;
    public final void rule__FuncDefinition__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5892:1: ( ( ruleBodyStatement ) )
            // InternalVaselina.g:5893:2: ( ruleBodyStatement )
            {
            // InternalVaselina.g:5893:2: ( ruleBodyStatement )
            // InternalVaselina.g:5894:3: ruleBodyStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncDefinitionAccess().getBodyBodyStatementParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBodyStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncDefinitionAccess().getBodyBodyStatementParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__FuncDefinition__BodyAssignment_5"


    // $ANTLR start "rule__FuncTypedDeclaration__TypeAssignment_0"
    // InternalVaselina.g:5903:1: rule__FuncTypedDeclaration__TypeAssignment_0 : ( rulevarTypeLiteral ) ;
    public final void rule__FuncTypedDeclaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5907:1: ( ( rulevarTypeLiteral ) )
            // InternalVaselina.g:5908:2: ( rulevarTypeLiteral )
            {
            // InternalVaselina.g:5908:2: ( rulevarTypeLiteral )
            // InternalVaselina.g:5909:3: rulevarTypeLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncTypedDeclarationAccess().getTypeVarTypeLiteralParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevarTypeLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncTypedDeclarationAccess().getTypeVarTypeLiteralParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__FuncTypedDeclaration__TypeAssignment_0"


    // $ANTLR start "rule__FuncTypedDeclaration__NameAssignment_1"
    // InternalVaselina.g:5918:1: rule__FuncTypedDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FuncTypedDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5922:1: ( ( RULE_ID ) )
            // InternalVaselina.g:5923:2: ( RULE_ID )
            {
            // InternalVaselina.g:5923:2: ( RULE_ID )
            // InternalVaselina.g:5924:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFuncTypedDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFuncTypedDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__FuncTypedDeclaration__NameAssignment_1"


    // $ANTLR start "rule__StdFunction__NameAssignment_1"
    // InternalVaselina.g:5933:1: rule__StdFunction__NameAssignment_1 : ( ruleStdfunctionList ) ;
    public final void rule__StdFunction__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5937:1: ( ( ruleStdfunctionList ) )
            // InternalVaselina.g:5938:2: ( ruleStdfunctionList )
            {
            // InternalVaselina.g:5938:2: ( ruleStdfunctionList )
            // InternalVaselina.g:5939:3: ruleStdfunctionList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStdFunctionAccess().getNameStdfunctionListParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStdfunctionList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStdFunctionAccess().getNameStdfunctionListParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__StdFunction__NameAssignment_1"


    // $ANTLR start "rule__StdFunction__ArgsAssignment_4_0"
    // InternalVaselina.g:5948:1: rule__StdFunction__ArgsAssignment_4_0 : ( rulevarExpression ) ;
    public final void rule__StdFunction__ArgsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5952:1: ( ( rulevarExpression ) )
            // InternalVaselina.g:5953:2: ( rulevarExpression )
            {
            // InternalVaselina.g:5953:2: ( rulevarExpression )
            // InternalVaselina.g:5954:3: rulevarExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStdFunctionAccess().getArgsVarExpressionParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevarExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStdFunctionAccess().getArgsVarExpressionParserRuleCall_4_0_0()); 
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
    // $ANTLR end "rule__StdFunction__ArgsAssignment_4_0"


    // $ANTLR start "rule__StdFunction__ArgsAssignment_4_1_1"
    // InternalVaselina.g:5963:1: rule__StdFunction__ArgsAssignment_4_1_1 : ( rulevarExpression ) ;
    public final void rule__StdFunction__ArgsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5967:1: ( ( rulevarExpression ) )
            // InternalVaselina.g:5968:2: ( rulevarExpression )
            {
            // InternalVaselina.g:5968:2: ( rulevarExpression )
            // InternalVaselina.g:5969:3: rulevarExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStdFunctionAccess().getArgsVarExpressionParserRuleCall_4_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevarExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStdFunctionAccess().getArgsVarExpressionParserRuleCall_4_1_1_0()); 
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
    // $ANTLR end "rule__StdFunction__ArgsAssignment_4_1_1"


    // $ANTLR start "rule__IfExpression__IfconditonAssignment_5"
    // InternalVaselina.g:5978:1: rule__IfExpression__IfconditonAssignment_5 : ( rulevarExpression ) ;
    public final void rule__IfExpression__IfconditonAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5982:1: ( ( rulevarExpression ) )
            // InternalVaselina.g:5983:2: ( rulevarExpression )
            {
            // InternalVaselina.g:5983:2: ( rulevarExpression )
            // InternalVaselina.g:5984:3: rulevarExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpressionAccess().getIfconditonVarExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevarExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpressionAccess().getIfconditonVarExpressionParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__IfExpression__IfconditonAssignment_5"


    // $ANTLR start "rule__IfExpression__ThenAssignment_9"
    // InternalVaselina.g:5993:1: rule__IfExpression__ThenAssignment_9 : ( ruleBodyStatement ) ;
    public final void rule__IfExpression__ThenAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:5997:1: ( ( ruleBodyStatement ) )
            // InternalVaselina.g:5998:2: ( ruleBodyStatement )
            {
            // InternalVaselina.g:5998:2: ( ruleBodyStatement )
            // InternalVaselina.g:5999:3: ruleBodyStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpressionAccess().getThenBodyStatementParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBodyStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpressionAccess().getThenBodyStatementParserRuleCall_9_0()); 
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
    // $ANTLR end "rule__IfExpression__ThenAssignment_9"


    // $ANTLR start "rule__IfExpression__ElseAssignment_10_3"
    // InternalVaselina.g:6008:1: rule__IfExpression__ElseAssignment_10_3 : ( ruleBodyStatement ) ;
    public final void rule__IfExpression__ElseAssignment_10_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6012:1: ( ( ruleBodyStatement ) )
            // InternalVaselina.g:6013:2: ( ruleBodyStatement )
            {
            // InternalVaselina.g:6013:2: ( ruleBodyStatement )
            // InternalVaselina.g:6014:3: ruleBodyStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfExpressionAccess().getElseBodyStatementParserRuleCall_10_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBodyStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfExpressionAccess().getElseBodyStatementParserRuleCall_10_3_0()); 
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
    // $ANTLR end "rule__IfExpression__ElseAssignment_10_3"


    // $ANTLR start "rule__DoWhileExpression__LoopConditonAssignment_5"
    // InternalVaselina.g:6023:1: rule__DoWhileExpression__LoopConditonAssignment_5 : ( rulevarExpression ) ;
    public final void rule__DoWhileExpression__LoopConditonAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6027:1: ( ( rulevarExpression ) )
            // InternalVaselina.g:6028:2: ( rulevarExpression )
            {
            // InternalVaselina.g:6028:2: ( rulevarExpression )
            // InternalVaselina.g:6029:3: rulevarExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoWhileExpressionAccess().getLoopConditonVarExpressionParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevarExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoWhileExpressionAccess().getLoopConditonVarExpressionParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__DoWhileExpression__LoopConditonAssignment_5"


    // $ANTLR start "rule__DoWhileExpression__BodyAssignment_9"
    // InternalVaselina.g:6038:1: rule__DoWhileExpression__BodyAssignment_9 : ( ruleBodyStatement ) ;
    public final void rule__DoWhileExpression__BodyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6042:1: ( ( ruleBodyStatement ) )
            // InternalVaselina.g:6043:2: ( ruleBodyStatement )
            {
            // InternalVaselina.g:6043:2: ( ruleBodyStatement )
            // InternalVaselina.g:6044:3: ruleBodyStatement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoWhileExpressionAccess().getBodyBodyStatementParserRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBodyStatement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoWhileExpressionAccess().getBodyBodyStatementParserRuleCall_9_0()); 
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
    // $ANTLR end "rule__DoWhileExpression__BodyAssignment_9"


    // $ANTLR start "rule__BrkStr__BrkAssignment_1"
    // InternalVaselina.g:6053:1: rule__BrkStr__BrkAssignment_1 : ( ( 'break' ) ) ;
    public final void rule__BrkStr__BrkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6057:1: ( ( ( 'break' ) ) )
            // InternalVaselina.g:6058:2: ( ( 'break' ) )
            {
            // InternalVaselina.g:6058:2: ( ( 'break' ) )
            // InternalVaselina.g:6059:3: ( 'break' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrkStrAccess().getBrkBreakKeyword_1_0()); 
            }
            // InternalVaselina.g:6060:3: ( 'break' )
            // InternalVaselina.g:6061:4: 'break'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBrkStrAccess().getBrkBreakKeyword_1_0()); 
            }
            match(input,67,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBrkStrAccess().getBrkBreakKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBrkStrAccess().getBrkBreakKeyword_1_0()); 
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
    // $ANTLR end "rule__BrkStr__BrkAssignment_1"


    // $ANTLR start "rule__ReturnDeclaration__RtnTypeAssignment_2"
    // InternalVaselina.g:6072:1: rule__ReturnDeclaration__RtnTypeAssignment_2 : ( rulevarTypeLiteral ) ;
    public final void rule__ReturnDeclaration__RtnTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6076:1: ( ( rulevarTypeLiteral ) )
            // InternalVaselina.g:6077:2: ( rulevarTypeLiteral )
            {
            // InternalVaselina.g:6077:2: ( rulevarTypeLiteral )
            // InternalVaselina.g:6078:3: rulevarTypeLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnDeclarationAccess().getRtnTypeVarTypeLiteralParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevarTypeLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnDeclarationAccess().getRtnTypeVarTypeLiteralParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__ReturnDeclaration__RtnTypeAssignment_2"


    // $ANTLR start "rule__DOUBLE__IntegerAssignment_0"
    // InternalVaselina.g:6087:1: rule__DOUBLE__IntegerAssignment_0 : ( RULE_NUM ) ;
    public final void rule__DOUBLE__IntegerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6091:1: ( ( RULE_NUM ) )
            // InternalVaselina.g:6092:2: ( RULE_NUM )
            {
            // InternalVaselina.g:6092:2: ( RULE_NUM )
            // InternalVaselina.g:6093:3: RULE_NUM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOUBLEAccess().getIntegerNUMTerminalRuleCall_0_0()); 
            }
            match(input,RULE_NUM,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOUBLEAccess().getIntegerNUMTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__DOUBLE__IntegerAssignment_0"


    // $ANTLR start "rule__DOUBLE__DecimalAssignment_2"
    // InternalVaselina.g:6102:1: rule__DOUBLE__DecimalAssignment_2 : ( ( rule__DOUBLE__DecimalAlternatives_2_0 ) ) ;
    public final void rule__DOUBLE__DecimalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6106:1: ( ( ( rule__DOUBLE__DecimalAlternatives_2_0 ) ) )
            // InternalVaselina.g:6107:2: ( ( rule__DOUBLE__DecimalAlternatives_2_0 ) )
            {
            // InternalVaselina.g:6107:2: ( ( rule__DOUBLE__DecimalAlternatives_2_0 ) )
            // InternalVaselina.g:6108:3: ( rule__DOUBLE__DecimalAlternatives_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDOUBLEAccess().getDecimalAlternatives_2_0()); 
            }
            // InternalVaselina.g:6109:3: ( rule__DOUBLE__DecimalAlternatives_2_0 )
            // InternalVaselina.g:6109:4: rule__DOUBLE__DecimalAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__DecimalAlternatives_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDOUBLEAccess().getDecimalAlternatives_2_0()); 
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
    // $ANTLR end "rule__DOUBLE__DecimalAssignment_2"


    // $ANTLR start "rule__Or__OpAssignment_1_1"
    // InternalVaselina.g:6117:1: rule__Or__OpAssignment_1_1 : ( ( '||' ) ) ;
    public final void rule__Or__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6121:1: ( ( ( '||' ) ) )
            // InternalVaselina.g:6122:2: ( ( '||' ) )
            {
            // InternalVaselina.g:6122:2: ( ( '||' ) )
            // InternalVaselina.g:6123:3: ( '||' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOpVerticalLineVerticalLineKeyword_1_1_0()); 
            }
            // InternalVaselina.g:6124:3: ( '||' )
            // InternalVaselina.g:6125:4: '||'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOpVerticalLineVerticalLineKeyword_1_1_0()); 
            }
            match(input,68,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getOpVerticalLineVerticalLineKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getOpVerticalLineVerticalLineKeyword_1_1_0()); 
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
    // $ANTLR end "rule__Or__OpAssignment_1_1"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // InternalVaselina.g:6136:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6140:1: ( ( ruleAnd ) )
            // InternalVaselina.g:6141:2: ( ruleAnd )
            {
            // InternalVaselina.g:6141:2: ( ruleAnd )
            // InternalVaselina.g:6142:3: ruleAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Or__RightAssignment_1_2"


    // $ANTLR start "rule__And__OpAssignment_1_1"
    // InternalVaselina.g:6151:1: rule__And__OpAssignment_1_1 : ( ( '&&' ) ) ;
    public final void rule__And__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6155:1: ( ( ( '&&' ) ) )
            // InternalVaselina.g:6156:2: ( ( '&&' ) )
            {
            // InternalVaselina.g:6156:2: ( ( '&&' ) )
            // InternalVaselina.g:6157:3: ( '&&' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getOpAmpersandAmpersandKeyword_1_1_0()); 
            }
            // InternalVaselina.g:6158:3: ( '&&' )
            // InternalVaselina.g:6159:4: '&&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getOpAmpersandAmpersandKeyword_1_1_0()); 
            }
            match(input,69,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getOpAmpersandAmpersandKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getOpAmpersandAmpersandKeyword_1_1_0()); 
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
    // $ANTLR end "rule__And__OpAssignment_1_1"


    // $ANTLR start "rule__And__RightAssignment_1_2"
    // InternalVaselina.g:6170:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6174:1: ( ( ruleEquality ) )
            // InternalVaselina.g:6175:2: ( ruleEquality )
            {
            // InternalVaselina.g:6175:2: ( ruleEquality )
            // InternalVaselina.g:6176:3: ruleEquality
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__And__RightAssignment_1_2"


    // $ANTLR start "rule__Equality__OpAssignment_1_1"
    // InternalVaselina.g:6185:1: rule__Equality__OpAssignment_1_1 : ( ( rule__Equality__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Equality__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6189:1: ( ( ( rule__Equality__OpAlternatives_1_1_0 ) ) )
            // InternalVaselina.g:6190:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            {
            // InternalVaselina.g:6190:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            // InternalVaselina.g:6191:3: ( rule__Equality__OpAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 
            }
            // InternalVaselina.g:6192:3: ( rule__Equality__OpAlternatives_1_1_0 )
            // InternalVaselina.g:6192:4: rule__Equality__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__OpAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 
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
    // $ANTLR end "rule__Equality__OpAssignment_1_1"


    // $ANTLR start "rule__Equality__RightAssignment_1_2"
    // InternalVaselina.g:6200:1: rule__Equality__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6204:1: ( ( ruleComparison ) )
            // InternalVaselina.g:6205:2: ( ruleComparison )
            {
            // InternalVaselina.g:6205:2: ( ruleComparison )
            // InternalVaselina.g:6206:3: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Equality__RightAssignment_1_2"


    // $ANTLR start "rule__Comparison__OpAssignment_1_1"
    // InternalVaselina.g:6215:1: rule__Comparison__OpAssignment_1_1 : ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6219:1: ( ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) )
            // InternalVaselina.g:6220:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            {
            // InternalVaselina.g:6220:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            // InternalVaselina.g:6221:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 
            }
            // InternalVaselina.g:6222:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            // InternalVaselina.g:6222:4: rule__Comparison__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OpAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 
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
    // $ANTLR end "rule__Comparison__OpAssignment_1_1"


    // $ANTLR start "rule__Comparison__RightAssignment_1_2"
    // InternalVaselina.g:6230:1: rule__Comparison__RightAssignment_1_2 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6234:1: ( ( rulePlusOrMinus ) )
            // InternalVaselina.g:6235:2: ( rulePlusOrMinus )
            {
            // InternalVaselina.g:6235:2: ( rulePlusOrMinus )
            // InternalVaselina.g:6236:3: rulePlusOrMinus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Comparison__RightAssignment_1_2"


    // $ANTLR start "rule__PlusOrMinus__OpAssignment_1_1"
    // InternalVaselina.g:6245:1: rule__PlusOrMinus__OpAssignment_1_1 : ( ( rule__PlusOrMinus__OpAlternatives_1_1_0 ) ) ;
    public final void rule__PlusOrMinus__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6249:1: ( ( ( rule__PlusOrMinus__OpAlternatives_1_1_0 ) ) )
            // InternalVaselina.g:6250:2: ( ( rule__PlusOrMinus__OpAlternatives_1_1_0 ) )
            {
            // InternalVaselina.g:6250:2: ( ( rule__PlusOrMinus__OpAlternatives_1_1_0 ) )
            // InternalVaselina.g:6251:3: ( rule__PlusOrMinus__OpAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getOpAlternatives_1_1_0()); 
            }
            // InternalVaselina.g:6252:3: ( rule__PlusOrMinus__OpAlternatives_1_1_0 )
            // InternalVaselina.g:6252:4: rule__PlusOrMinus__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__OpAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getOpAlternatives_1_1_0()); 
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
    // $ANTLR end "rule__PlusOrMinus__OpAssignment_1_1"


    // $ANTLR start "rule__PlusOrMinus__RightAssignment_1_2"
    // InternalVaselina.g:6260:1: rule__PlusOrMinus__RightAssignment_1_2 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6264:1: ( ( ruleMulOrDiv ) )
            // InternalVaselina.g:6265:2: ( ruleMulOrDiv )
            {
            // InternalVaselina.g:6265:2: ( ruleMulOrDiv )
            // InternalVaselina.g:6266:3: ruleMulOrDiv
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__PlusOrMinus__RightAssignment_1_2"


    // $ANTLR start "rule__MulOrDiv__OpAssignment_1_1"
    // InternalVaselina.g:6275:1: rule__MulOrDiv__OpAssignment_1_1 : ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) ;
    public final void rule__MulOrDiv__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6279:1: ( ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) )
            // InternalVaselina.g:6280:2: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            {
            // InternalVaselina.g:6280:2: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            // InternalVaselina.g:6281:3: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 
            }
            // InternalVaselina.g:6282:3: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            // InternalVaselina.g:6282:4: rule__MulOrDiv__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__OpAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 
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
    // $ANTLR end "rule__MulOrDiv__OpAssignment_1_1"


    // $ANTLR start "rule__MulOrDiv__RightAssignment_1_2"
    // InternalVaselina.g:6290:1: rule__MulOrDiv__RightAssignment_1_2 : ( ruleModule ) ;
    public final void rule__MulOrDiv__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6294:1: ( ( ruleModule ) )
            // InternalVaselina.g:6295:2: ( ruleModule )
            {
            // InternalVaselina.g:6295:2: ( ruleModule )
            // InternalVaselina.g:6296:3: ruleModule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulOrDivAccess().getRightModuleParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleModule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulOrDivAccess().getRightModuleParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__MulOrDiv__RightAssignment_1_2"


    // $ANTLR start "rule__Module__OpAssignment_1_1"
    // InternalVaselina.g:6305:1: rule__Module__OpAssignment_1_1 : ( ( '%' ) ) ;
    public final void rule__Module__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6309:1: ( ( ( '%' ) ) )
            // InternalVaselina.g:6310:2: ( ( '%' ) )
            {
            // InternalVaselina.g:6310:2: ( ( '%' ) )
            // InternalVaselina.g:6311:3: ( '%' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getOpPercentSignKeyword_1_1_0()); 
            }
            // InternalVaselina.g:6312:3: ( '%' )
            // InternalVaselina.g:6313:4: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getOpPercentSignKeyword_1_1_0()); 
            }
            match(input,70,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getOpPercentSignKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getOpPercentSignKeyword_1_1_0()); 
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
    // $ANTLR end "rule__Module__OpAssignment_1_1"


    // $ANTLR start "rule__Module__RightAssignment_1_2"
    // InternalVaselina.g:6324:1: rule__Module__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Module__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6328:1: ( ( rulePrimary ) )
            // InternalVaselina.g:6329:2: ( rulePrimary )
            {
            // InternalVaselina.g:6329:2: ( rulePrimary )
            // InternalVaselina.g:6330:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModuleAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModuleAccess().getRightPrimaryParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Module__RightAssignment_1_2"


    // $ANTLR start "rule__Primary__InsideAssignment_0_2"
    // InternalVaselina.g:6339:1: rule__Primary__InsideAssignment_0_2 : ( rulevarExpression ) ;
    public final void rule__Primary__InsideAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6343:1: ( ( rulevarExpression ) )
            // InternalVaselina.g:6344:2: ( rulevarExpression )
            {
            // InternalVaselina.g:6344:2: ( rulevarExpression )
            // InternalVaselina.g:6345:3: rulevarExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getInsideVarExpressionParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulevarExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getInsideVarExpressionParserRuleCall_0_2_0()); 
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
    // $ANTLR end "rule__Primary__InsideAssignment_0_2"


    // $ANTLR start "rule__Primary__ExpressionAssignment_1_2"
    // InternalVaselina.g:6354:1: rule__Primary__ExpressionAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6358:1: ( ( rulePrimary ) )
            // InternalVaselina.g:6359:2: ( rulePrimary )
            {
            // InternalVaselina.g:6359:2: ( rulePrimary )
            // InternalVaselina.g:6360:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Primary__ExpressionAssignment_1_2"


    // $ANTLR start "rule__Terminal__ValueAssignment_0_1"
    // InternalVaselina.g:6369:1: rule__Terminal__ValueAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__Terminal__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6373:1: ( ( RULE_STRING ) )
            // InternalVaselina.g:6374:2: ( RULE_STRING )
            {
            // InternalVaselina.g:6374:2: ( RULE_STRING )
            // InternalVaselina.g:6375:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__Terminal__ValueAssignment_0_1"


    // $ANTLR start "rule__Terminal__ValueAssignment_1_1"
    // InternalVaselina.g:6384:1: rule__Terminal__ValueAssignment_1_1 : ( RULE_NUM ) ;
    public final void rule__Terminal__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6388:1: ( ( RULE_NUM ) )
            // InternalVaselina.g:6389:2: ( RULE_NUM )
            {
            // InternalVaselina.g:6389:2: ( RULE_NUM )
            // InternalVaselina.g:6390:3: RULE_NUM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getValueNUMTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_NUM,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getValueNUMTerminalRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Terminal__ValueAssignment_1_1"


    // $ANTLR start "rule__Terminal__ValueAssignment_2_1"
    // InternalVaselina.g:6399:1: rule__Terminal__ValueAssignment_2_1 : ( ruleDOUBLE ) ;
    public final void rule__Terminal__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6403:1: ( ( ruleDOUBLE ) )
            // InternalVaselina.g:6404:2: ( ruleDOUBLE )
            {
            // InternalVaselina.g:6404:2: ( ruleDOUBLE )
            // InternalVaselina.g:6405:3: ruleDOUBLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getValueDOUBLEParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getValueDOUBLEParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__Terminal__ValueAssignment_2_1"


    // $ANTLR start "rule__Terminal__VarRefAssignment_3_1"
    // InternalVaselina.g:6414:1: rule__Terminal__VarRefAssignment_3_1 : ( ( rule__Terminal__VarRefAlternatives_3_1_0 ) ) ;
    public final void rule__Terminal__VarRefAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6418:1: ( ( ( rule__Terminal__VarRefAlternatives_3_1_0 ) ) )
            // InternalVaselina.g:6419:2: ( ( rule__Terminal__VarRefAlternatives_3_1_0 ) )
            {
            // InternalVaselina.g:6419:2: ( ( rule__Terminal__VarRefAlternatives_3_1_0 ) )
            // InternalVaselina.g:6420:3: ( rule__Terminal__VarRefAlternatives_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getVarRefAlternatives_3_1_0()); 
            }
            // InternalVaselina.g:6421:3: ( rule__Terminal__VarRefAlternatives_3_1_0 )
            // InternalVaselina.g:6421:4: rule__Terminal__VarRefAlternatives_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Terminal__VarRefAlternatives_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getVarRefAlternatives_3_1_0()); 
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
    // $ANTLR end "rule__Terminal__VarRefAssignment_3_1"


    // $ANTLR start "rule__Terminal__VarRefAssignment_4_1"
    // InternalVaselina.g:6429:1: rule__Terminal__VarRefAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Terminal__VarRefAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6433:1: ( ( ( RULE_ID ) ) )
            // InternalVaselina.g:6434:2: ( ( RULE_ID ) )
            {
            // InternalVaselina.g:6434:2: ( ( RULE_ID ) )
            // InternalVaselina.g:6435:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getVarRefVarSymbolCrossReference_4_1_0()); 
            }
            // InternalVaselina.g:6436:3: ( RULE_ID )
            // InternalVaselina.g:6437:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getVarRefVarSymbolIDTerminalRuleCall_4_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getVarRefVarSymbolIDTerminalRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getVarRefVarSymbolCrossReference_4_1_0()); 
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
    // $ANTLR end "rule__Terminal__VarRefAssignment_4_1"


    // $ANTLR start "rule__Terminal__VarRefAssignment_5_1"
    // InternalVaselina.g:6448:1: rule__Terminal__VarRefAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Terminal__VarRefAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6452:1: ( ( ( RULE_ID ) ) )
            // InternalVaselina.g:6453:2: ( ( RULE_ID ) )
            {
            // InternalVaselina.g:6453:2: ( ( RULE_ID ) )
            // InternalVaselina.g:6454:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getVarRefVarSymbolCrossReference_5_1_0()); 
            }
            // InternalVaselina.g:6455:3: ( RULE_ID )
            // InternalVaselina.g:6456:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getVarRefVarSymbolIDTerminalRuleCall_5_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getVarRefVarSymbolIDTerminalRuleCall_5_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getVarRefVarSymbolCrossReference_5_1_0()); 
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
    // $ANTLR end "rule__Terminal__VarRefAssignment_5_1"


    // $ANTLR start "rule__Terminal__DimAssignment_5_2"
    // InternalVaselina.g:6467:1: rule__Terminal__DimAssignment_5_2 : ( rulearrayDimension ) ;
    public final void rule__Terminal__DimAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVaselina.g:6471:1: ( ( rulearrayDimension ) )
            // InternalVaselina.g:6472:2: ( rulearrayDimension )
            {
            // InternalVaselina.g:6472:2: ( rulearrayDimension )
            // InternalVaselina.g:6473:3: rulearrayDimension
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getDimArrayDimensionParserRuleCall_5_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulearrayDimension();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getDimArrayDimensionParserRuleCall_5_2_0()); 
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
    // $ANTLR end "rule__Terminal__DimAssignment_5_2"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\6\1\52\10\uffff";
    static final String dfa_3s = "\1\103\1\55\10\uffff";
    static final String dfa_4s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\1";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\12\uffff\10\7\17\uffff\1\2\12\uffff\1\4\4\uffff\1\5\2\uffff\1\10\5\uffff\2\3\1\6",
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

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "870:1: rule__BodyStatement__Alternatives : ( ( rulevarAssignment ) | ( rulevarReturn ) | ( rulevarDeclared ) | ( ruleIfExpression ) | ( ruleDoWhileExpression ) | ( ruleBrkStr ) | ( ruleAbstractMethodCall ) | ( ruleReturnDeclaration ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000802000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0908018001FE0040L,0x000000000000000EL});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0908010001FE0042L,0x000000000000000EL});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x4000001801FE00E0L,0x0000000000000001L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x4000021801FE00E0L,0x0000000000000001L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x090A010001FE0040L,0x000000000000000EL});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001FE0040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0908010001FE0040L,0x000000000000000EL});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000001800000000L});

}