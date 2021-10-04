import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        // Desafio Filter #02
        /* Criar vários produtos e filtra-los com as seguintes características:
        - Ter desconto maior ou igual a 30%
        - Ter frete grátis
        Após, aplicar o map mostrando o preço final dos produtos filtrados.
         */

        Produto p1 = new Produto("Notebook", 3600, 0.20, true);
        Produto p2 = new Produto("Caneta", 10, 0.50, true);
        Produto p3 = new Produto("Máquina de lavar roupa", 2530.50, 0.30, false);
        Produto p4 = new Produto("Bicicleta", 1590.99, 0.35, true);
        Produto p5 = new Produto("Carro", 35680.40, 0.10, true);
        Produto p6 = new Produto("Camisa", 80.99, 0.50, true);
        Produto p7 = new Produto("Ferro de passar roupa", 99.99, 0.80, true);
        Produto p8 = new Produto("Refrigerante 2L", 7.99, 0.45, false);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8);

        Consumer<String> print = System.out::println;
        Function<Produto, String> formatarPreco = produto -> {
            double preco = produto.getPreco() * (1 - produto.getDesconto());
            return "O produto " + produto.getNome() + " está com uma super promoção! Apenas R$" + preco +
                    " e frete grátis.";
        };

        produtos.stream()
                .filter(produto -> produto.getDesconto() >= 0.30)
                .filter(Produto::isFreteGratis)
                .map(formatarPreco)
                .forEach(print);
    }
}
