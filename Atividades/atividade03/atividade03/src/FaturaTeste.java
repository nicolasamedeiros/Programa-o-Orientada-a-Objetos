import javaclasses.fatura;

public class FaturaTeste {
    public static void main(String[] args) {
        
        javaclasses.fatura fatura = new fatura("67890", "Teclado Mecânico", 10, 55.50);

        System.out.println("Numero da Fatura: " +fatura.getNumero());
        System.out.println("Descrição: " +fatura.getDescricao());
        System.out.println("Quantidade Comprada: " +fatura.qntComprada);
        System.out.println("Preço por item: " +fatura.getPrecoItem());
        System.out.println("Total da Fatura: " +fatura.getTotalFatura());
    }
}
