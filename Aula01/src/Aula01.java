import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {
        int numero = 10;
        double numero2 = 1.2;
        float numero3;
        String nome;

        try (//instanciar uma classe
        Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o nome: ");
            nome = sc.nextLine();
            System.out.println("Digite um numero: ");
            numero3 = sc.nextFloat();
        }

        //comentario
        System.out.println("Numero Inteiro: " +numero
        +"\nNumero2: " +numero2
        +"\nNumero3: " +numero3
        +"\nNome: " +nome);

        System.out.println("Nome: " +nome);
        System.out.println("Numero3: " +numero3);
    }
}
