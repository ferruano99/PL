package Java;

public class Cabecera {
    private String cab;
    private String nombreFuncion;
    private String sentencia;

    public Cabecera(String cab, String nombreFuncion){
        this.cab = cab;
        this.nombreFuncion = nombreFuncion;
        this.sentencia = "";
    }

    public String getSentencia() {
        return sentencia;
    }

    public void setSentencia(String sentencia) {
        this.sentencia = sentencia;
    }

    public String getNombreFuncion() {
        return nombreFuncion;
    }

    public void setNombreFuncion(String nombreFuncion) {
        this.nombreFuncion = nombreFuncion;
    }

    public String getCab() {
        return cab;
    }

    public void setCab(String cab) {
        this.cab = cab;
    }

    public Cabecera formatCabecera(Cabecera cab){
        this.sentencia = "<LI><A HREF=\"#" + nombreFuncion + "\">" + cab.cab +"</A></LI>";
        return cab;
    }
}

