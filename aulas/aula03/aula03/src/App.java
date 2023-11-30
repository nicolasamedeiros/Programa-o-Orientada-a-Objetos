import javaclasses.cadastro;

//metodos construtores

public class App {
    public static void main(String[] args) {
        //criação do objeto cadastro com o construtor padrão
        
        cadastro carro1 = new cadastro("123", "HAF777", "Prata", "Fusca", 1999);
        
        //atribuição de valores aos atributos
        
        /* 
        Construtor padrão
        carro1.chassi="123456789";
        carro1.placa="ABC1234";
        carro1.ano=2011;
        carro1.cor="preto";
        */

        cadastro carro2 = new cadastro("456", "AAA444", "Vermelho", "Gol", 2000);

        /*
        Construtor padrão 
        carro2.chassi="987654321";
        carro2.placa="DEF5678";
        carro2.ano=2012;
        carro2.cor="branco";
        */

        cadastro carro3 = new cadastro(2022);
        
        //adicionar mais uma parametro
        
        carro3.cor = "Azul";

        //impressão dos valores dos atributos
        System.out.println("carro 1: " + carro1.cor + "\ncarro 2: " + carro2.cor);

        System.out.println("Ano carro 3: " + carro3.ano
                            + "\nCor carro 3: " + carro3.cor);
                            
    }
}   
