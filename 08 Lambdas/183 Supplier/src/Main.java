import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        // Interface funcional: Supplier
        // Essa interface não recebe nenhum parâmetro porém retorna algo

        // Como parâmetro da classe, deve-se colocar o tipo do retorno.
        // E como
        Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Bia", "Gui");

        System.out.println(umaLista.get());

    }
}
