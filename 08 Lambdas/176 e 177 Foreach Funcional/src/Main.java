import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Foreach funcional

        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
        
        // Usando o Foreach normal
        System.out.println("Usando o Foreach normal:");
        for(String nome: aprovados){
            System.out.println(nome);
        }

        // Usando o Foreach funcional
        System.out.println("\nUsando o Foreach funcional:");
        aprovados.forEach((nome) -> { System.out.println(nome); }); // Uma função Lambda é passada como argumento

        // Usando o Method Reference
        System.out.println("\nUsando o Method Reference:");
        aprovados.forEach(System.out::println);

        // Usando o Foreach funcional com o método
        System.out.println("\nUsando o Foreach funcional com o método:");
        aprovados.forEach(nome -> meuImprimir(nome));

        // Usando o Method Reference com o método
        System.out.println("\nUsando o Method Reference com o método:");
        aprovados.forEach(Main::meuImprimir);

    }

    static void meuImprimir(String nome) {
        System.out.println("Oi! Meu nome é " + nome);
    }

}
