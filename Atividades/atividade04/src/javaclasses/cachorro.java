package javaclasses;

public class cachorro extends animal {
    
    public cachorro(String nome, double peso){
        super(nome, peso);
    }

    private String raca;

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }
}
