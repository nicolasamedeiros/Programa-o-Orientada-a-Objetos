package javaclasses;

public class carro extends automovel {
    public carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    private int cavalos;
    

    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }

    public int getCavalos() {
        return cavalos;
    }

    
}
