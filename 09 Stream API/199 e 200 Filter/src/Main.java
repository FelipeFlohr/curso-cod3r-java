import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        // Filter
        /* Como o próprio nome diz, Filter serve para filtrar os resultados,
        diferentemente do Map, aonde iterava sobre todos os itens sem destinção.
        Por exemplo, pode-se aplicar um filtro de par: (n -> n % 2 == 0)
         */

        Aluno a1 = new Aluno("Ana", 7.8);
        Aluno a2 = new Aluno("Bia", 5.8);
        Aluno a3 = new Aluno("Daniel", 9.8);
        Aluno a4 = new Aluno("Gui", 6.8);
        Aluno a5 = new Aluno("Rebeca", 7.1);
        Aluno a6 = new Aluno("Pedro", 8.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        // Aplicando o Filter
        alunos.stream()
                .filter(a -> a.nota >= 7)
                .map(a -> "Parabéns " + a.nome + "! Você foi aprovado(a).")
                .forEach(System.out::println);

        System.out.println("\nUtilizando o Filter com interfaces funcionais:");
        // Aplicando o Filter utilizando outras interfaces funcionais
        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
        Function<Aluno, String> parabenizacao = aluno -> "Parabéns " + aluno.nome + "! Você foi aprovado(a)!";

        alunos.stream()
                .filter(aprovado) // Utilizando o Predicate como Filter
                .map(parabenizacao) // Utilizando a Function como Map
                .forEach(System.out::println);
    }
}
