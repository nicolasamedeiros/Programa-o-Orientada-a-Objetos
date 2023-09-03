package javaclasses;

public class cadastro {
    //atributos
   
    public String chassi;
    public String placa;
    public String cor;
    public String modelo;
    public int ano;

    //construtor com argumentos

    public cadastro(int ano){
        this.ano = ano;
    }

    public cadastro(String chassi, String placa, String cor, String modelo, int ano){
        this.chassi = chassi;
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
    }

    public cadastro(){
        //construtor padrão
    }
}
