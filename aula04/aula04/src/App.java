import javaclasses.aluno;
import javaclasses.edInfantil; 

public class App {
    public static void main(String[] args) {
        //criando aluno
        aluno aluno1 = new aluno("Junior", "123456", 0);
        aluno1.setIdade(20); 

        //criando aluno de educação infantil
        edInfantil aluno2 = new edInfantil("Maria", "654321", 0);
        aluno2.setIdade(5);

        System.out.println("DADOS ALUNO 1");
        System.out.println("Nome: " + aluno1.getNome() + "\nMatrícula: " + aluno1.getMatricula() + "\nIdade: " + aluno1.getIdade());

        System.out.println("\nDADOS ALUNO2");
        System.out.println("Nome: " + aluno2.getNome() + "\nMatrícula: " + aluno2.getMatricula() + "\nIdade: " + aluno2.getIdade());
    }
}
