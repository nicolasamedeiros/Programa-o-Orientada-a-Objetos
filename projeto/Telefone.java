public class Telefone {
    private String tipo;
    private String ddd;
    private String numero;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public void imprimirTelefone(){
        System.out.printf("Telefone (%s): (%s)(%s)\n", this.tipo, this.ddd, this.numero);
    }
}
