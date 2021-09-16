import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {

        // Usando Interfaces Funcionais
        // Uma das interfaces funcionais que vem com o Java é
        // a BinaryOperator, veja:

        BinaryOperator<Double> calculo = (x, y) -> x * y;
        System.out.println(calculo.apply(2.0, 3.0)); // As interfaces funcionais não suportam cast direto, é necessário adicionar casas decimais para tipos não-inteiros

    }
}
