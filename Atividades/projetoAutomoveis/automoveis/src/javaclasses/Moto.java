package javaclasses;

public class Moto extends Veiculos {
    private int ano;

    public Moto(String modelo, double preco, int ano) {
        super(modelo, preco);
        this.ano = ano;
    }

    public double getPreco(double preco) {
        if (getAno() >= 2008) {
            return preco * 1.10; //aumento de 10%
        } else {
            return preco;
        }
    }   

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void printDados() {
        System.out.println("Dados da Moto");
        System.out.println(String.format("Modelo: %s\nPreco: %.2f\nAno: %d", getModelo(), getPreco(getPreco()), getAno()));
    }

    public int getAno() {
        return ano;
    }

}
