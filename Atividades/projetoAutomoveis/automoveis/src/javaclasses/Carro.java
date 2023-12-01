package javaclasses;

public class Carro extends Veiculos {
    private double km;
    
    public Carro(String modelo, double preco, double km) {
        super(modelo, preco);
        this.km = km;
    }

    public double getPreco(double preco) {
        if (getKm() > 100000) {
            return preco * 0.92; //desconto de 8%
        } else {
            return preco;
        }
    }

    public void printDados() {
        System.out.println("Dados do carro");
        System.out.println(String.format("Modelo: %s\nPreco: %.2f\nKm: %.2f", getModelo(), getPreco(getPreco()), getKm()));
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getKm() {
        return km;
    }  
}
