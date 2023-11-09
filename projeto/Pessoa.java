import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private Endereco endereco;
    ArrayList<Telefone> telefones = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }
    
    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(ArrayList<Telefone> telefones) {
        this.telefones = telefones;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public void imprimir(){
        System.out.printf("Nome: %s\nCPF: %s\nEmail: %s\n", this.nome, this.cpf, this.email);
        endereco.imprimirEndereco();
        System.out.println("Telefones:");
        for(int i = 0; i < getTelefones().size(); i++){
            getTelefones().get(i).imprimirTelefone();
        }
    }

}
