import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {
        // Interface funcional: Binary Operator e BiFunction

        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        System.out.println("Média: " + media.apply(9.8, 5.7));

        // Com o BiFunction pode-se ter um controle maior do resultado
        BiFunction<Double, Double, String> resultado = (n1, n2) -> ((n1 + n2) / 2) >= 6 ? "Aprovado" : "Reprovado";
        System.out.println("Resultado da média: " + resultado.apply(9.8, 5.7));

    }
}
