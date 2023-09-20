package javaclasses;

public class empregado extends pessoa {
    
    public empregado(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    public empregado(String nome, int idade, String sexo, double salario, String matricula, double valorInss) {
        super(nome, idade, sexo);
        this.salario = salario;
        this.matricula = matricula; 
        this.valorInss = valorInss;
    }

    private double salario;
    private String matricula;
    private double valorInss;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setValorInss(double valorInss) {
        this.valorInss = valorInss * 0.11;
    }

    public double getValorInss() {
        return valorInss;
    }
}
