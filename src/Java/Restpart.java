package Java;

public class Restpart {

    private String nombreFuncion;
    private String rest;

    public Restpart(String nombreFuncion, String rest) {
        this.nombreFuncion = nombreFuncion;
        this.rest = rest;
    }


    public String getNombreFuncion() {
        return nombreFuncion;
    }

    public void setNombreFuncion(String nombreFuncion) {
        this.nombreFuncion = nombreFuncion;
    }

    public String getRest() {
        return rest;
    }

    public void setRest(String rest) {
        this.rest = rest;
    }
}
