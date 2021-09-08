import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<String>();

        livros.add("O Pequeno Príncipe"); // Retorna um booleano indicando se conseguiu adicionar
        livros.push("Don Quixote"); // Retorna um erro caso não tenha conseguido adicionar
        livros.push("O Hobbit");

        // Obtendo elementos
        System.out.println("Obtendo o primeiro elemento da pilha: "+livros.peek());
        System.out.println("Obtendo o primeiro elemento da pilha: "+livros.element());

        // Removendo elementos
        System.out.println("Removendo o primeiro elemento da pilha: "+livros.poll()); // Retorna nulo caso não tenha conseguido remover um elemento
        System.out.println("Removendo o primeiro elemento da pilha: "+livros.poll());
        System.out.println("Removendo o primeiro elemento da pilha: "+livros.remove()); // Lança uma exceção caso não tenha conseguido remover um elemento

    }
}
