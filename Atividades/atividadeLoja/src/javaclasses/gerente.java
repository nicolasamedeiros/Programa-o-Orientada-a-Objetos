package javaclasses;

public class gerente extends empregado {
    public gerente(String nome, int idade, String sexo, double salario, String matricula, double valorInss) {
        super(nome, idade, sexo, salario, matricula, valorInss);
    }

    private String nomeGerencia;
    

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    public String getNomeGerencia() {
        return nomeGerencia;
    }

}
