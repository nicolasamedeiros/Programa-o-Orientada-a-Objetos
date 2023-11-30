package javaclasses;

public class edInfantil extends aluno {

    public edInfantil(String nome, String matricula, int idade) {
        super(nome, matricula, idade);
    }

    public void setIdade(int idade) {
        if (idade >= 4 && idade < 7) {
            super.setIdade(idade);
        }
        else{
            System.out.println("Idade inválida");
        }
    }

    private String responsavel;

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getResponsavel() {
        return responsavel;
    }
}
