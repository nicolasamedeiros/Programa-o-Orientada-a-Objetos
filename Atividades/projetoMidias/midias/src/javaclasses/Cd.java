package javaclasses;

public class Cd extends Midia{
    private int nMusicas;

    public Cd() {
        super();
        this.nMusicas = 0;
    }         
    
    public Cd(int codigo, double preco, String nome, int nMusicas) {
        super(codigo, preco, nome);
        this.nMusicas = nMusicas;
    }
    
    public String getTipo() {
        return "CD";
    }

    public String getDetalhes() {
        return String.format("%s Numero de Musicas: %d", super.getDetalhes(), nMusicas);
    }

    public void setMusica(int nMusicas) {
        this.nMusicas = nMusicas;
    }

    public void inserirDados() {
        super.inserirDados();
        System.out.println("Digite o numero de musicas: ");
        this.nMusicas = Integer.parseInt(System.console().readLine());
    }
    
    public int getnMusicas() {
        return nMusicas;
    }

    public void setnMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }
}
