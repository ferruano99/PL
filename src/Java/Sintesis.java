package Java;

import java.util.ArrayList;
import java.util.List;

public class Sintesis { //La clase principal para guardar todo
    //TODO: Hacer ArrayList<String> para meter las fucniones y procedimientos que vea el programa
    //en el main imprimirlo con el método resumen
    private List<String> declaraciones; //Lista con todas las funciones

    public Sintesis() {
        this.declaraciones = new ArrayList<>();
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

    }
}
