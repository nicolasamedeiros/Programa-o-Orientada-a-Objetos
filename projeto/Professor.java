import java.util.ArrayList;

public class Professor extends Pessoa{
    private String titulacao;
    private double salario;
    private ArrayList<Curso> cursos = new ArrayList<>();

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.printf("Titulacao: %s\nSalario: %.2f\n", this.titulacao, this.salario);
        System.out.println("Cursos:");
        for(int i = 0; i < getCursos().size(); i++){
            getCursos().get(i).imprimirCurso();
        }
    }
}
