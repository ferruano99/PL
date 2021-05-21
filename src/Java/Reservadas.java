package Java;

public class Reservadas {


    public Reservadas() {
    }

    public String identificadores (String entrada){
        return "<SPAN CLASS=\"ident\">" + entrada + "</SPAN>";
    }

    public String constante(String entrada) {
        return "<SPAN CLASS=\"cte\">" + entrada + "</SPAN>";
    }

    public String palres(String entrada){
        return "<SPAN CLASS=\"palres\">" + entrada + "</SPAN>";
    }
}
