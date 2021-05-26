package Clases;

import java.util.ArrayList;
import java.util.List;

public class Blq {
    private List<Sent> listSent = new ArrayList<>();
    private int sangriado;
    private String textoHTML;

    public Blq(List<Sent> listSent, int sangriado) {
        this.listSent = listSent;
        this.sangriado = sangriado;
    }

    public int getSangriado() {
        return sangriado;
    }

    public void setSangriado(int sangriado) {
        this.sangriado = sangriado;
    }

    public List<Sent> getListSent() {
        return listSent;
    }

    public void setListSent(List<Sent> listSent) {
        this.listSent = listSent;
    }
}
