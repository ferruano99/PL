import ANTLR.scriptsLexer;
import ANTLR.scriptsParser;
import Java.Sintesis;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class main {

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

            anasint.program();
            // Lo de funciones y procedimientos
            datos.imprimirCabecera();
            datos.resumen(args[0]); // el código tocho


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
