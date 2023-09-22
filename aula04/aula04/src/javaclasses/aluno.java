package javaclasses;

public class aluno {
    private String nome;
    private String matricula;
    private int idade;

    public aluno(String nome, String matricula, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }
        else {
            System.out.println("Idade inválida");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getIdade() {
        return idade;
    }

}
