import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();
    private Professor professor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public void addCurso(Curso curso) {
        this.cursos.add(curso);
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void imprimirDisciplina() {
        System.out.println("Disciplina: " + this.nome);
        System.out.println("Alunos:");
        for (Aluno aluno : alunos) {
            aluno.imprimir();
        }
        System.out.println("Cursos:");
        for (Curso curso : cursos) {
            curso.imprimirCurso();
        }
        System.out.println("Professor:");
        if (professor != null) {
            professor.imprimir();
        } else {
            System.out.println("Nenhum professor atribuído.");
        }
    }
}
