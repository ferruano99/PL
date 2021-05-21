package Java;

public class Cabecera {
    private String cab;
    private String nombreFuncion;
    public Cabecera(String cab, String nombreFuncion){
        this.cab = cab;
        this.nombreFuncion = nombreFuncion;
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

    public String formatCabecera(Cabecera cab){
        return "<LI><A HREF=\"#" + nombreFuncion + "\">" + cab.nombreFuncion +"</A></LI>";
    }
}

