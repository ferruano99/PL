package Java;

public class Sentencia {
    private final String sent;
    private int indentado;

    public Sentencia(String sent, int indentado) {
        this.indentado = indentado;
        this.sent = sent;
    }

    public String getSent() {
        return sent;
    }

    public int getIndentado() {
        return indentado;
    }


    public void setIndentado(int indentado) {
        this.indentado = indentado;
    }

    public String imprimirSentencia(String sentencia, int indent) {
        return "    <DIV style=\"text-indent: " + (indent * 0.5) + "cm\">" + sentencia + "</DIV>\n"; //TODO

    }
}
