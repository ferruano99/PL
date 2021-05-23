package Java;

public class Reservadas {

    private String palabra;
    private String palHTML;
    public Reservadas(String palabra) {
        this.palabra = palabra;
        this.palHTML = palHTML;
    }

    public String getPalHTML() {
        return palHTML;
    }

    public void setPalHTML(String palHTML) {
        this.palHTML = palHTML;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra() {
        this.palabra = palabra;
    }

    public String formatIdentificadores (){
        this.palHTML = "<SPAN CLASS=\"ident\">" + palabra + "</SPAN>";
        return this.palHTML;
    }

    public String formatConstante() {
        this.palHTML = "<SPAN CLASS=\"cte\">" + palabra + "</SPAN>";
        return this.palHTML;
    }

    public String formatPalres(){
        this.palHTML = "<SPAN CLASS=\"palres\">" + palabra + "</SPAN>";
        return this.palHTML;
    }
}
