package Clases;

public class Restpart {
    private String nombreFuncion;
    private String textoHTML;
    private String textoNormal;


    public Restpart(String nombreFuncion, String textoHTML, String textoNormal) {
        this.nombreFuncion = nombreFuncion;
        this.textoHTML = textoHTML;
        this.textoNormal = textoNormal;
    }

    public String getNombreFuncion() {
        return nombreFuncion;
    }

    public void setNombreFuncion(String nombreFuncion) {
        this.nombreFuncion = nombreFuncion;
    }

    public String getTextoHTML() {
        return textoHTML;
    }

    public void setTextoHTML(String textoHTML) {
        this.textoHTML = textoHTML;
    }

    public String getTextoNormal() {
        return textoNormal;
    }

    public void setTextoNormal(String textoNormal) {
        this.textoNormal = textoNormal;
    }
}
