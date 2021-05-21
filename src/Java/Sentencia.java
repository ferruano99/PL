package Java;

public class Sentencia extends Reservadas{
    private String sent;

    public String getSent() {
        return sent;
    }

    public Sentencia(String sent){
        this.sent = sent;
    }

    public String imprimirSentencia(String sentencia){
        return "<DIV style=\"text-indent: 0.5cm\">"+sentencia+"</DIV>\n"; //TODO

    }
}
