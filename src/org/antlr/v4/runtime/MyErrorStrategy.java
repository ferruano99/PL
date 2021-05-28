package org.antlr.v4.runtime;

import org.antlr.v4.runtime.misc.IntervalSet;
public class MyErrorStrategy extends DefaultErrorStrategy {
    private boolean error = false;

    public void setError(boolean error) {
        this.error = error;
    }

    @Override
    public void reportNoViableAlternative(Parser parser, NoViableAltException e)
    {
        String msg = "No hay alternativa viable para el input"; // nonstandard msg
        parser.notifyErrorListeners(e.getOffendingToken(), msg, e);
        setError(true);
    }

    @Override
    protected void reportInputMismatch(Parser recognizer,InputMismatchException e)
    {
        String msg = "Input erroneo "+getTokenErrorDisplay(e.getOffendingToken())+
                " cuando lo que se espera es "+e.getExpectedTokens().toString(recognizer.getVocabulary());
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }
    public boolean getError(){
        return error;
    }


    @Override
    public void reportUnwantedToken(Parser recognizer)
    {
        if (inErrorRecoveryMode(recognizer)) {
            return;
        }

        beginErrorCondition(recognizer);

        Token t = recognizer.getCurrentToken();
        String tokenName = getTokenErrorDisplay(t);
        IntervalSet expecting = getExpectedTokens(recognizer);
        String msg = "Caracter extraño "+tokenName+" cuando lo esperado es "+
                expecting.toString(recognizer.getVocabulary());
        recognizer.notifyErrorListeners(t, msg, null);
        setError(true);
    }

    @Override
    protected void reportMissingToken(Parser recognizer)
    {
        if (inErrorRecoveryMode(recognizer)) {
            return;
        }

        beginErrorCondition(recognizer);

        Token t = recognizer.getCurrentToken();
        IntervalSet expecting = getExpectedTokens(recognizer);
        String msg = "Falta "+expecting.toString(recognizer.getVocabulary())+
                " antes de "+getTokenErrorDisplay(t);

        recognizer.notifyErrorListeners(t, msg, null);
        setError(true);
    }

    @Override
    protected void reportFailedPredicate(Parser recognizer,
                                         FailedPredicateException e)
    {
        String ruleName = recognizer.getRuleNames()[recognizer._ctx.getRuleIndex()];
        String msg = "regla "+ruleName+" "+e.getMessage();
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
        setError(true);
    }

}