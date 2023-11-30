import javaclasses.livro;

public class App {
    public static void main(String[] args) {
        livro livro = new livro();

        System.out.println("Titulo: " +livro.titulo);
        System.out.println("Autor: " +livro.autor);
        System.out.println("Numero de paginas: " +livro.numPaginas);  
    }
}
