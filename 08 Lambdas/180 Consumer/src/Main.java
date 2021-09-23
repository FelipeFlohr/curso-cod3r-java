import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        // Interface funcional: Consumer

        Consumer<Produto> imprimir = p -> System.out.println(p.nome);

        Produto p1 = new Produto("Caneta", 3.89, 0.09);
        Produto p2 = new Produto("Notebook", 3543.22, 0.1);
        Produto p3 = new Produto("Caderno", 15.89, 0.5);
        Produto p4 = new Produto("Borracha", 2.89, 0.03);
        Produto p5 = new Produto("Lápis", 1.50, 0.15);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        produtos.forEach(imprimir);
        System.out.println("\nNovamente implementando o print como argumento e utilizando toString():");
        produtos.forEach(System.out::println);
    }

}
