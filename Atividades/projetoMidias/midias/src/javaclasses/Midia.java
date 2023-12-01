package javaclasses;

public class Midia {
    private int codigo;
    private double preco;
    private String nome;

    public Midia() {
        this.codigo = 0;
        this.preco = 0.0;
        this.nome = "";
    }

    public Midia(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    public String getTipo() {
        return "Midia";
    }

    public String getDetalhes() {
        System.out.println("Dados cadastrados");
        return String.format(" Codigo: %d\n Preco: %.2f\n Nome: %s\n", codigo, preco, nome);
    }

    public void printDados() {
        System.out.printf("%s Tipo: %s\n", getDetalhes(), getTipo());
    }
    
    public void inserirDados() {
        System.out.println("Digite o codigo: ");
        this.codigo = Integer.parseInt(System.console().readLine());
        System.out.println("Digite o preco: ");
        this.preco = Double.parseDouble(System.console().readLine());
        System.out.println("Digite o nome: ");
        this.nome = System.console().readLine();
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
