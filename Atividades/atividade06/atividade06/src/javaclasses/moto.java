package javaclasses;

public class moto extends automovel {
    public moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    private int cilindradas;

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

}
