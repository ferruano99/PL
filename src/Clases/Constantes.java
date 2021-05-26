package Clases;

public class Constantes {
    private String textoHTML;
    private String textoNormal;
    private int tipo;

    public Constantes(String textoNormal, int tipo) {
        this.textoNormal = textoNormal;
        switch (tipo){
            case 0:
                this.textoHTML = "<SPAN CLASS=\"palres\">" + textoNormal + "</SPAN>";
                break;
            case 1:
                this.textoHTML = "<SPAN CLASS=\"cte\">" + textoNormal + "</SPAN>";
                break;
            case 2:
                this.textoHTML = "<SPAN CLASS=\"ident\">" + textoNormal + "</SPAN>";
                break;
        }
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
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
