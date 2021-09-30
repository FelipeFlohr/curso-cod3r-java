import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        // Map
        /* Map serve para operar com itens dentro de um array, por exemplo:
        digamos que haja um array de nove elementos, sendo: { 3, 1, 7, 4, 6, 5,
        8, 10, 9 }, com isso, passa-se a interface Map com uma expressão Lambda,
        como, por exemplo: elemento -> elemento * 2. Seguindo esse exemplo, o re-
        sultado do map será { 6, 2, 14, 8, 12, 10, 16, 20, 18 }
         */

        Consumer<String> print = System.out::println;

        List<String> marcas = Arrays.asList("BMW", "Audi", "Honda\n");
        marcas.stream().map(m -> m.toUpperCase()).forEach(print); // Usando o map

        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> String.valueOf(n.charAt(0));
        UnaryOperator<String> grito = n -> n + "!!!"; // Bem pintowski eu diria

        marcas.stream().map(maiuscula).map(primeiraLetra).map(grito).forEach(print);
    }
}
