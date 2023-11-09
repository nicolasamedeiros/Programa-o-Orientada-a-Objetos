import java.util.ArrayList;

public class Aluno extends Pessoa{
    private Curso curso;
    private ArrayList<Double> notas = new ArrayList<>();

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        curso.imprimirCurso();
        System.out.println("Notas:");
        for(int i = 0; i < getNotas().size(); i++){
            System.out.println(getNotas().get(i));
        }
    }

    
}
