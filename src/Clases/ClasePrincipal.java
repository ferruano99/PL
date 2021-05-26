package Clases;

import java.util.ArrayList;
import java.util.List;

public class ClasePrincipal {

    private List<Part> partList = new ArrayList<>();
    private String nombrePrograma;

    public ClasePrincipal(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public List<Part> getPartList() {
        return partList;
    }

    public void setPartList(List<Part> partList) {
        this.partList = partList;
    }


    public void imprimirListaFuncionesyProcedimientos(){
        System.out.println("<!DOCTYPE html>\n" +
                "<HTML>\n" +
                "   <head>\n" +
                "       <title>" + this.getNombrePrograma() + "</title>\n" +
                "       <style>\n" +
                "           .cte {color:rgb(19,189,72);}\n" +
                "           .ident {color:rgb(55,40,244);}\n" +
                "           .palres {color:rgb(0,0,0);font-weight:bold;}\n" +
                "       </style>\n" +
                "   </head>\n" +
                "   <body>\n" +
                "       <a name=\"inicio\">\n" +
                "       <h1>Programa: " + this.getNombrePrograma() +"</h1>\n" +
                "       <h2>Funciones y procedimientos</h2>\n" +
                "       <UL>");
        for (Part part : partList) {
            System.out.println("A NAME=\""+ part.getNombreFuncion() +"\""+part.getTextoNormal()+"</A>");
        }
    }
    public void imprimirSubprogramas(){
        for (Part part : partList) {
            System.out.println(part.getTextoHTML());
        }
        System.out.println("</body>\n</html>");
    }


}
