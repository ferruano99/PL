package Clases;

public class Param {

    private String id;
    private Constantes type;

    public Param(String id, Constantes type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Constantes getType() {
        return type;
    }

    public void setType(Constantes type) {
        this.type = type;
    }
}
