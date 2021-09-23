import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        // Interface funcional: Predicate

        Predicate<Produto> isCaro = produto -> (produto.preco * (1 -
        produto.desconto)) >= 750; // Irá retornar true se o valor do produto for maior que 750

        Produto produto = new Produto("Notebook", 3800, 0.5);
        System.out.printf("Valor do produto sem desconto: %f\nO produto é caro: %b\n", produto.preco,
                isCaro.test(produto));
    }
}
