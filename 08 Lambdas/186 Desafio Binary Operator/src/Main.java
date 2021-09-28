import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        // Desafio Binary Operator
        /*
        Criar uma classe produto e:
        1. A partir do produto calcular o preço real (com desconto)
        2. Imposto Municipal: >= 2500 (8,5%) | < 2500 (Isento)
        3. Frete: >= 3000 (100) | < 3000 (50)
        4. Arredondar: deixar duas casas decimais
        5. Formatar: R$1234,56
         */

        Produto p = new Produto("Celular", 3702.54, 0.10);

        UnaryOperator<Double> aplicarImposto = preco -> preco >= 2500 ? preco + ((preco / 100) * 8.5) : preco;
        UnaryOperator<Double> aplicarFrete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar = preco -> (double) Math.round(preco);
        Consumer<Double> imprimirPreco = preco -> System.out.println("Preço final: R$" + preco
                .toString()
                .replace('.', ','));

        Double precoDoProduto = p.preco * (1 - p.desconto);
        precoDoProduto = aplicarImposto.apply(precoDoProduto); // Aplicando imposto
        precoDoProduto = aplicarFrete.apply(precoDoProduto); // Aplicando frete
        precoDoProduto = arredondar.apply(precoDoProduto); // Arredondando
        imprimirPreco.accept(precoDoProduto);
    }
}
