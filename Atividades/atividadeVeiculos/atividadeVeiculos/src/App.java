import javaclasses.carro;
import javaclasses.moto;
import javaclasses.caminhao;

public class App {
    public static void main(String[] args) {
        //carro
        carro carro1 = new carro("Honda", "Civic", 2020);

        carro1.setCavalos(208);

        //moto 
        moto moto1 = new moto("Yamaha", "MT-03", 2021);

        moto1.setCilindradas(321);

        //caminhao
        caminhao caminhao1 = new caminhao("Volvo", "FH", 2023);
        
        caminhao1.setCapacidade(74);

        //exibindo dados
        System.out.println("Carro: ");
        System.out.println("Marca: " +carro1.getMarca() + "\nModelo: " +carro1.getModelo() + "\nAno: " +carro1.getAno() + "\nCavalos: " +carro1.getCavalos());

        System.out.println("\nMoto: ");
        System.out.println("Marca: " +moto1.getMarca() + "\nModelo: " +moto1.getModelo() + "\nAno: " +moto1.getAno() + "\nCilindradas: " +moto1.getCilindradas());

        System.out.println("\nCaminhão: ");
        System.out.println("Marca: " +caminhao1.getMarca() + "\nModelo: " +caminhao1.getModelo() + "\nAno: " +caminhao1.getAno() + "\nCapacidade: " +caminhao1.getCapacidade());
    }
}
