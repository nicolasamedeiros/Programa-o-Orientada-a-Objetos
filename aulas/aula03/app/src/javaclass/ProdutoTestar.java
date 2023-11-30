package javaclass;
public class ProdutoTestar {

    public static void main(String[] args)  {
        
        //construtor padrão
        Produto p1 = new Produto();
        p1.nome = "Apontador";
        p1.marca = "Faber";
        p1.valor = 3.99f;

        //construtor com 2 parâmetro
        Produto p2 = new Produto("Canteta", "Bic");
        p2.valor = 2.30f;

        //construtor com 3 parâmetro
        Produto p3 = new Produto("Borracha", "Faber", 1.50f);

        //objeto p1
        System.out.println("Nome: " +p1.nome + "\nMarca: " +p1.marca + "\nValor: " +p1.valor);

        //objeto p2
        System.out.println("Nome: " +p2.nome + "\nMarca: " +p2.marca + "\nValor: " +p2.valor);

        //objeto p3
        System.out.println("Nome: " +p3.nome + "\nMarca: " +p3.marca + "\nValor: " +p3.valor);
    }
}
