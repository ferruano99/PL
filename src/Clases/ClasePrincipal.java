package Clases;

import java.util.ArrayList;
import java.util.List;

public class ClasePrincipal {

    private List<Part> partList = new ArrayList<>();

    public ClasePrincipal(){

    }

    public Part nuevaPart(String nombreFuncion, String partesHTML, String partesNormal){
        Part p = new Part(nombreFuncion, partesHTML, partesNormal);
        partList.add(p);
        return p;
    }

    public Restpart nuevaRestpart(String nombreFuncion, String textoHTML, String textoNormal){
        Restpart rp = new Restpart(nombreFuncion, textoHTML, textoNormal);
        return rp;
    }

    public Listparam nuevolistparam(String idParam)
    public void imprimirListaFuncionesyProcedimientos(){
        for (Part part : partList) {
            System.out.println(part.getTextoNormal());
        }
    }
    public void imprimirSubprogramas(){
        for (Part part : partList) {
            System.out.println(part.getTextoHTML());
        }
    }


}
