package javaclasses;

public class caminhao extends automovel {
    public caminhao(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }
    
    private int capacidade;

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }
}
