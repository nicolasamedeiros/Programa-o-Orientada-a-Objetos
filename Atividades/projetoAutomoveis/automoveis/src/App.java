import javaclasses.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        //criando um objeto da classe carro
        Carro carro = new Carro("Ford ka", 50000, 150000);   
        carro.printDados(); 
        
        //criando um objeto da classe moto
        Moto moto = new Moto("Honda Biz", 10000, 2020);
        moto.printDados();
    }
}
