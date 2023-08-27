import java.util.Scanner;

import javax.swing.JOptionPane;

import javaclss.pessoa;

public class App {
    public static void main(String[] args) {
        //instanciar a classe
        pessoa p1 = new pessoa();
        
        p1.nome = "Maria";
        p1.idade = 20;

        p1.mostrarDados();

        pessoa p2 = new pessoa();
        
        p2.nome = "Nicolas";
        p2.idade = 22;

        p2.mostrarDados();

        pessoa p3 = new pessoa();
        
        //via input
        /* 
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome");
        p3.nome = sc.nextLine();
        System.out.println("Digite o idade");
        p3.idade = sc.nextInt();

        p3.mostrarDados();
        */

        //grafico
        //texto
        p3.nome = JOptionPane.showInputDialog("Digite o nome ");

        //numero trocar de string pra int 
                    //muda so o ex - Float.parseFloat(JOptionPane.showInputDialog("Digite a idade ")
        p3.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade "));

        JOptionPane.showMessageDialog(null, "Nome"+p3.nome
                                                            +"\nIdade "+p3.idade);
        
    }
}
