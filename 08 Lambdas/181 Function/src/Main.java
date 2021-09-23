import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        // Interface funcional: Function
        // Representa uma função que aceita um argumento e produz um resultado

        System.out.println("Par ou Ímpar:");
        Function<Integer, String> parOuImpar =
                numero -> numero % 2 == 0 ? "Par" : "Ímpar";
        System.out.println(parOuImpar.apply(50));

        System.out.println("\nO Resultado é:");
        Function<String, String> oResultadoE =
                valor -> "O resultado é: " + valor;
        System.out.println(oResultadoE.apply("50"));

        System.out.println("\nUtilizando as duas funções:");
        System.out.println(parOuImpar.andThen(oResultadoE).apply(50));

        System.out.println("\nUtilizando mais de duas funções:");
        Function<String, String> empolgado = valor -> valor + "!!!";
        // Fazendo uma composição de métodos
        System.out.println(parOuImpar
                .andThen(oResultadoE)
                .andThen(empolgado)
                .apply(50));
    }

}
