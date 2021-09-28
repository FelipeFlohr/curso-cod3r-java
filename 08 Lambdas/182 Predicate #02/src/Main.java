import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTresDigitos = num-> num >= 100 && num <= 999;

        // Composição de duas funções para saber de o resultado é verdadeiro
        // ou falso
        System.out.println(isPar.and(isTresDigitos).test(122));

    }

}
