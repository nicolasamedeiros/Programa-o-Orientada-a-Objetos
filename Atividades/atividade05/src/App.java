import javaclasses.cliente;
import javaclasses.gerente;
import javaclasses.vendedor;

public class App {
    public static void main(String[] args) {
        //criação do objeto cliente1
        
        cliente cliente1 = new cliente("Junior", 23, "Masculino");
        cliente1.setValorDivida(2000.00);
        cliente1.setAnoNascimento(2000);
        
        //criação do objeto gerente1
        
        gerente gerente1 = new gerente("Fernanda", 45, "Feminino", 5000.00, "000856", 500.00);
        gerente1.setNomeGerencia("Gerente de Loja");
        
        //criação do objeto vendedor1

        vendedor vendedor1 = new vendedor("Fábio", 30, "Masculino", 2500.00, "000555", 350.00);
        vendedor1.setValorVendas(4000);
        vendedor1.setQntVendas(10);

        //exibindo dados no terminal 
        
        //cliente
        System.out.println("Dados do Cliente:");
        System.out.println("Nome:" +cliente1.getNome() + "\nIdade:" +cliente1.getIdade() + "\nSexo:" +cliente1.getSexo() + "\nValor da Dívida:" +cliente1.getValorDivida() + "\nAno de Nascimento:" +cliente1.getAnoNascimento());

        //gerente
        System.out.println("\nDados do Gerente:");
        System.out.println("Nome: " +gerente1.getNome() + "\nIdade: " + gerente1.getIdade() + "\nMatricula: " +gerente1.getMatricula() + "\nNome gerencia: " +gerente1.getNomeGerencia() + "\nValor INSS: " +gerente1.getValorInss());

        //vendedor
        System.out.println("\nDados do Vendedor:");
        System.out.println("Nome: " +vendedor1.getNome() + "\nSalario: " +vendedor1.getSalario() + "\nValor das Vendas:" +vendedor1.getValorVendas() + "\nQuantidade de Vendas: " +vendedor1.getQntVendas());
    }
}
