package javaclasses;

public class Veiculos {
    private String modelo;
    private double preco;
    
    public Veiculos(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }
    
    public double getPreco(double preco){
        return this.preco;
    }

    public void printDados(){
        String.format("Modelo: %s\n Preco: %.2f", modelo, preco);
    }
    
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
