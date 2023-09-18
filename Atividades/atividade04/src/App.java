import javaclasses.peixe;
import javaclasses.cachorro;

public class App {
    public static void main(String[] args) {

        // Criando o objeto peixe1 sendo peixe Dourado
        peixe peixe1 = new peixe("peixe Dourado", 10.10);
        peixe1.setTipoHabitat("Água doce");

        System.out.println("Dados do Peixe:");
        System.out.println(peixe1.getNome());
        System.out.println(peixe1.getPeso());
        System.out.println(peixe1.getTipoHabitat());

        //criando objeto cachorro1 sendo vira-lata
        cachorro cachorro1 = new cachorro("vira-lata",25.30);
        cachorro1.setRaca("vira-lata");

        System.out.println("Dados do cachorro:");
        System.out.println(cachorro1.getNome());
        System.out.println(cachorro1.getPeso());
        System.out.println(cachorro1.getRaca());
    }
}
