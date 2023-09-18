package javaclasses;

public class peixe extends animal{
    
    public peixe(String nome, double peso) {
        super(nome, peso);
    }

    private String tipoHabitat;

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    public String getTipoHabitat() {
        return tipoHabitat;
    }
}
