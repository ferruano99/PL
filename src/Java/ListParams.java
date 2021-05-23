package Java;

public class ListParams {
    private String formateado;
    private String textoPlano;

    public ListParams(String formateado, String textoPlano) {
        this.formateado = formateado;
        this.textoPlano = textoPlano;
    }

    public String getFormateado() {
        return formateado;
    }

    public void setFormateado(String formateado) {
        this.formateado = formateado;
    }

    public String getTextoPlano() {
        return textoPlano;
    }

    public void setTextoPlano(String textoPlano) {
        this.textoPlano = textoPlano;
    }

}
