import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        // Desafio Filter
        /* O desafio deverá ser criado por mim, na qual deverá seguir os seguin-
        tes critérios:
        - Possuir 2 filters
        - Possuir um map
         */

        Veiculo v1 = new Carro("vermelho", 10800, "Gol G2");
        Veiculo v2 = new Motocicleta("preto", 4560.82, "Biz 2008");
        Veiculo v3 = new Motocicleta("laranja", 7650.94, "Pop 100");
        Veiculo v4 = new Carro("prata", 12340.99, "Clio 2004");
        Veiculo v5 = new Carro("preto", 32870.54, "Civic 2010");
        Veiculo v6 = new Motocicleta("preto", 45000, "Harley Davidson 2004");
        Veiculo v7 = new Motocicleta("prata escuro", 82000, "Harley Davidson 2019");
        Veiculo v8 = new Carro("azul", 2100.88, "Fusca 68");

        List<Veiculo> veiculos = Arrays.asList(v1, v2, v3, v4, v5, v6, v7, v8);

        Consumer<String> print = System.out::println;
        Function<Veiculo, String> formatarVeiculo = veiculo -> "O veículo " + veiculo.nome + " custa mais que R$5000.";

        veiculos.stream()
                .filter(veiculo -> veiculo.preco > 5000)
                .filter(veiculo -> veiculo.numRodas < 4)
                .map(formatarVeiculo)
                .forEach(print);
    }
}
