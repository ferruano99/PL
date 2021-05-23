package Java;

import java.util.ArrayList;
import java.util.List;

public class Sintesis { //La clase principal para guardar todo
    //TODO: Hacer ArrayList<String> para meter las fucniones y procedimientos que vea el programa
    //en el main imprimirlo con el método resumen
    private List<String> declaraciones; //Lista con todas las funciones

    private List<Sentencia> sentencias = new ArrayList<>();
    private List<Cabecera> cabeceras = new ArrayList<>();

    public Sintesis() {
        this.declaraciones = new ArrayList<>();
    }

    public String addSentencia(String sentencia) {
        Sentencia sent = new Sentencia(sentencia);
        sentencias.add(sent);
        return sent.imprimirSentencia(sent.getSent());
    }

    public void imprimirCabecera(String titulo){
        System.out.println(
                "<!DOCTYPE html>\n" +
                        "<HTML>\n" +
                        "   <head>\n" +
                        "       <title>" + titulo + "</title>\n" +
                        "       <style>\n" +
                        "           .cte {color:rgb(19,189,72);}\n" +
                        "           .ident {color:rgb(55,40,244);}\n" +
                        "           .palres {color:rgb(0,0,0);font-weight:bold;}\n" +
                        "       </style>\n" +
                        "   </head>\n" +
                        "   <body>\n" +
                        "       <a name=\"inicio\">\n" +
                        "       <h1>Programa: " + titulo + "</h1>\n" +
                        "       <h2>Funciones y procedimientos</h2>\n" +
                        "       <UL>");
        for (Cabecera cab : cabeceras) {
            System.out.println("            "+cab.getSentencia());
        }
        System.out.println("       </UL>\n");
    }
    public void addCabecera(String cabecera, String nombreFuncion) {
        Cabecera cab = new Cabecera(cabecera, nombreFuncion);
        cab = cab.formatCabecera(cab);
        cabeceras.add(cab);
    }

    public Reservadas constante(String entrada) {
        Reservadas pal = new Reservadas(entrada);
        return pal;
    }

    public Reservadas identificadores(String entrada) {
        Reservadas pal = new Reservadas(entrada);
        return pal;
    }

    public Reservadas palres(String entrada) {
        Reservadas pal = new Reservadas(entrada);
        return pal;
    }

    public ListParams listaPar(String conFormat,String sinFormat){
        ListParams lp = new ListParams(conFormat,sinFormat);
        return lp;
    }

    public void newDec(String declaracion) {
        declaraciones.add(declaracion);

    }


    public void resumen() { //habría que generar el código HTML
            for (String declaracion : declaraciones) {
                System.out.println("<HR/>");
                System.out.println(declaracion);
                System.out.println("<A HREF=\"#intercambioEntero\">Inicio de rutina</A><BR/>");
                System.out.println("<A HREF=\"#inicio\">Inicio de programa</A>");
            }
        System.out.println(
                "   </body>\n" +
                        "</html>");

    }
}
