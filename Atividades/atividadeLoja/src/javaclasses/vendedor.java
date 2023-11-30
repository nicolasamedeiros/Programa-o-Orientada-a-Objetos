package javaclasses;

public class vendedor extends empregado {
    public vendedor(String nome, int idade, String sexo, double salario, String matricula, double valorInss) {
        super(nome, idade, sexo, salario, matricula,valorInss);
    }

    private double valorVendas;
    private int qntVendas;

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }

    public int getQntVendas() {
        return qntVendas;
    }
}
