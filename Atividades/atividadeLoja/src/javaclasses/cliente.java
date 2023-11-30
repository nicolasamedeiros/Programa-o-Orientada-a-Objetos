package javaclasses;

public class cliente extends pessoa {
    public cliente(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    private double valorDivida;
    private int anoNascimento;

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }
}
