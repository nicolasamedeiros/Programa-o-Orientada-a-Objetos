import javax.swing.JOptionPane;

import javaclasses.cadastro;

public class App {
    public static void main(String[] args)  {
        
        cadastro p1 = new cadastro();

        p1.nome = JOptionPane.showInputDialog("Digite seu nome:");

        p1.sobrenmome = JOptionPane.showInputDialog("Digite seu sobrenome:");

        p1.cpf = JOptionPane.showInputDialog("Digite seu CPF: ");

        p1.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));

        JOptionPane.showMessageDialog(null, "Nome: " + p1.nome + "\nSobrenome: " + p1.sobrenmome + "\nCPF: " + p1.cpf + "\nIdade: " + p1.idade);
    }
}
