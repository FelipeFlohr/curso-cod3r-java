import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        // Interface funcional: Unary Operator
        // O tipo do parâmetro que é dado como entrada é do mesmo tipo que é
        // retornado

        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        int resultado1 = maisDois
                .andThen(vezesDois)
                .andThen(aoQuadrado)
                .apply(0);

        // O compose irá realizar as ações começando do último para o primeiro;
        int resultado2 = aoQuadrado
                .compose(vezesDois)
                .compose(maisDois)
                .apply(0);

        System.out.println("Resultado 1: "+resultado1);
        System.out.println("Resultado 2: "+resultado2);
    }
}
