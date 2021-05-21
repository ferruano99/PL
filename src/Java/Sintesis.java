package Java;

import java.util.ArrayList;
import java.util.List;

public class Sintesis { //La clase principal para guardar todo
    //TODO: Hacer ArrayList<String> para meter las fucniones y procedimientos que vea el programa
    //en el main imprimirlo con el método resumen
    private List<String> declaraciones; //Lista con todas las funciones

    private Reservadas reservadas = new Reservadas();

    private List<Sentencia> sentencias = new ArrayList<>();
    private List<String> cabeceras = new ArrayList<>();

    public Sintesis() {
        this.declaraciones = new ArrayList<>();
    }

    public String addSentencia(String sentencia) {
        Sentencia sent = new Sentencia(sentencia);
        sentencias.add(sent);
        return sent.imprimirSentencia(sent.getSent());
    }

    public void imprimirCabecera(){
        System.out.println("<UL>\n");
        for (String cab : cabeceras) {
            System.out.println(cab);
        }
        System.out.println("</UL>\n");
    }
    public void addCabecera(String cabecera, String nombreFuncion) {
        Cabecera cab = new Cabecera(cabecera, nombreFuncion);
        String format = cab.formatCabecera(cab);
        cabeceras.add(format);
    }

    public String constante(String entrada) {
        return this.reservadas.constante(entrada);
    }

    public String identificadores(String entrada) {
        return this.reservadas.identificadores(entrada);
    }

    public String palres(String entrada) {
        return this.reservadas.palres(entrada);
    }

    public void newDec(String declaracion) {
        declaraciones.add(declaracion);

    }


    public void resumen() { //habría que generar el código HTML
        if (declaraciones.size() != 0) {
            for (String declaracion : declaraciones) {
                System.out.println(declaracion);
                System.out.println();

            }
        } else {
            System.out.println("nada");
        }
        System.out.println(
                "   </body>\n" +
                        "</html>");

    }
}
