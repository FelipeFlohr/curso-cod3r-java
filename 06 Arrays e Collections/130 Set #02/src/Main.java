import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // Para definir um tipo para o set, usa-se:
        Set<String> lista = new HashSet<>();
        lista.add("Benio");
        lista.add("Bruh");
        lista.add("Ueró");
        lista.add("Between Dirt");
        
        // Para set ordenado por ordem de inserção, temos:
        Set<String> lista2 = new TreeSet<>();
        lista2.add("Benio");
        lista2.add("Bruh");
        lista2.add("Ueró");
        lista2.add("Between Dirt");

        System.out.println("HashSet: ");
        for(String nome: lista){
            System.out.println("Nome: "+nome);
        }

        System.out.println("\nTreeSet");
        for(String nome: lista2){
            System.out.println("Nome: "+nome);
        }
    }
}
