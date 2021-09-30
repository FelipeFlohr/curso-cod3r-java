import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Consumer<String> print = System.out::println;

        Stream<String> linguagens = Stream.of("Java", "Lua", "JavaScript\n");
        linguagens.forEach(print);

        String[] maisLinguagens = { "Python", "Lisp", "Perl", "Go\n" };

        Stream.of(maisLinguagens).forEach(print); // Usando Stream of
        Arrays.stream(maisLinguagens).forEach(print); // Usando a classe Arrays
        Arrays.stream(maisLinguagens, 1, 2).forEach(print); // Usando a classe Arrays utilizando índices

        List<String> outrasLinguagens = Arrays.asList("C", "PHP", "Kotlin\n");
        outrasLinguagens.stream().forEach(print); // Gerando uma stream a partir de uma lista
        outrasLinguagens.parallelStream().forEach(print); // Gerando uma stream paralela a partir de uma lista
    }
}
