package javaclasses;

import java.util.Scanner;

public class livro {
    
    public String titulo;
    public String autor;
    public int numPaginas;

    public livro() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o titulo do livro: ");
        this.titulo = sc.nextLine();

        System.out.println("Digite o autor do livro: ");
        this.autor = sc.nextLine();

        System.out.println("Digite o numero de paginas do livro: ");
        this.numPaginas = sc.nextInt();
    }

    public void imprimirInfo(){
        System.out.println("Titulo: " +titulo + "\nAutor: " +autor + "\nNumero de paginas: " +numPaginas);
    }
}

