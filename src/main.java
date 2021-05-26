import ANTLR.scriptsLexer;
import ANTLR.scriptsParser;
import Java.Sintesis;
import org.antlr.v4.runtime.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class main {

    public static class UnderlineListener extends BaseErrorListener {
        public void syntaxError(Recognizer<?, ?> recognizer,
                                Object offendingSymbol,
                                int line, int charPositionInLine,
                                String msg,
                                RecognitionException e)
        {
            System.err.println("line "+line+":"+charPositionInLine+" "+msg);
            underlineError(recognizer,(Token)offendingSymbol,
                    line, charPositionInLine);
        }

        protected void underlineError(Recognizer recognizer,
                                      Token offendingToken, int line,
                                      int charPositionInLine) {
            CommonTokenStream tokens =
                    (CommonTokenStream)recognizer.getInputStream();
            String input = tokens.getTokenSource().getInputStream().toString();
            String[] lines = input.split("\n");
            String errorLine = lines[line - 1];
            System.err.println(errorLine);
            for (int i=0; i<charPositionInLine; i++) System.err.print(" ");
            int start = offendingToken.getStartIndex();
            int stop = offendingToken.getStopIndex();
            if ( start>=0 && stop>=0 ) {
                for (int i=start; i<=stop; i++) System.err.print("^");
            }
            System.err.println();
        }
    }



    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromFileName(args[0]);
            //genera un fichero d salida
            FileOutputStream f = new FileOutputStream(args[0] + ".html");
            System.setOut(new PrintStream(f));

            scriptsLexer analex = new scriptsLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(analex);
            //Creamos el objeto correspondiente
            Sintesis datos = new Sintesis();
            scriptsParser anasint = new scriptsParser(tokens,datos);
            anasint.removeErrorListeners();
            anasint._errHandler = new MyErrorStrategy();
            anasint.addErrorListener(new UnderlineListener());


            anasint.program();
            // Lo de funciones y procedimientos
            datos.imprimirCabecera(args[0]);
            datos.resumen(); // el código tocho


        } catch (org.antlr.v4.runtime.RecognitionException e) {
            //entrada
            System.err.println("REC " + e.getMessage());
        } catch (
                IOException e) {
            //entrada/salida
            System.err.println("IO " + e.getMessage());
        } catch (java.lang.RuntimeException e) {
            //error random
            System.err.println("RUN " + e.getMessage());
        }
    }

}
