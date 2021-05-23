package Java;

public class Sentencia {
    private String sent;
    private String nombreFuncion;

    public String getSent() {
        return sent;
    }

    public String getNombreFuncion() {
        return nombreFuncion;
    }

    public void setNombreFuncion(String nombreFuncion) {
        this.nombreFuncion = nombreFuncion;
    }

    public Sentencia(String sent){
        this.nombreFuncion = "";
        this.sent = sent;
    }

    public String imprimirSentencia(String sentencia){
        return "    <DIV style=\"text-indent: 0.5cm\">"+sentencia+"</DIV>\n"; //TODO

    }
}
