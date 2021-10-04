import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {
        // Reduce
        /* Enquanto o Map transforma uma Stream em outra de mesmo tamanho e o
        filter transforma uma Stream através de filtragem, o Reduce transforma
        uma stream em qualquer outra coisa (exemplo: utilizar uma stream para
        retornar a média de notas de um grupo de alunos).

        Exemplo de Reduce:
        { 7, 3, 4, 2, 8, 1, 2, 8 }
        Para aplicar um Reduce nessa Stream, é necessário definir um acumulador
        (na qual será utilizado em cada iteração) e um elemento "n" (que repre-
        senta cada elemento da Stream. Utilizando esse exemplo, podemos criar
        uma função de somar todos os elementos da Stream, veja:

        Iteração 1:
        Acumulador = 0; n = 7;

        Iteração 2:
        Acumulador = 7; n = 3;

        Iteração 3:
        Acumulador = 10; n = 4.
        e assim por diante...
         */

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma  = (acumulador, n) -> acumulador + n;

        // Total #01
        int total1 = numeros.stream()
                           .reduce(soma)
                           .get();
        System.out.println("Total 1 = " + total1);

        // Total #02
        int total2 = numeros
                .stream()
                .reduce(100, soma);
        System.out.println("Total 2 = " + total2);

        // Total #03. O resultado será 945 pois as chamadas são paralelas
        int total3 = numeros
                .parallelStream()
                .reduce(100, soma);
        System.out.println("Total 3 = " + total3);

        // Total #04
        System.out.print("Total 4 = ");
        numeros.stream()
                .filter(n -> n > 5) // Irá selecionar apenas elementos > 5
                .reduce(soma)
                .ifPresent(System.out::println);
    }
}
