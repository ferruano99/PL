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
            System.out.println(
                    "<!DOCTYPE html>\n" +
                    "<HTML>\n" +
                    "   <head>\n" +
                    "       <title>"+args[0]+"</title>\n" +
                    "       <style>\n" +
                    "           .cte {color:rgb(19,189,72);}\n" +
                    "           .ident {color:rgb(55,40,244);}\n" +
                    "           .palres {color:rgb(0,0,0);font-weight:bold;}\n" +
                    "       </style>\n" +
                    "   </head>\n" +
                    "   <body>\n" +
                    "       <a name=\"inicio\">\n" +
                    "       <h1>Programa: " + args[0] + "</h1>\n" +
                    "       <h2>Funciones y procedimientos</h2>\n" +
                    "       <UL>\n");

            anasint.program();
            // Lo de funciones y procedimientos
            datos.resumen(); // el código tocho

            System.out.println(
                    "   </body>\n"+
                    "</html>");

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
