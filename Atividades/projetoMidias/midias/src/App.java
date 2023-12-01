import javaclasses.*;

public class App {
    public static void main(String[] args) throws Exception {
        //Criando um objeto do tipo Dvd
        Dvd dvd1 = new Dvd();
        dvd1.inserirDados();
        System.out.println(dvd1.getDetalhes());
        
        //Criando um objeto do tipo Cd
        Cd cd1 = new Cd();
        cd1.inserirDados();
        System.out.println(cd1.getDetalhes());
    }
}
