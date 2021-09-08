import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // Adicionando elementos na fila
        fila.add("Ana"); // O add retorna um erro caso não consiga adicionar
        fila.offer("Bia"); // O offer retorna falso caso não consiga adicionar
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // Obtem os primeiros elementos sem removê-los
        System.out.println("Primeiro elemento da fila: "+fila.peek()); // Se não houver nenhum elemento na lista, o retorno é nulo
        System.out.println("Primeiro elemento da fila: "+fila.element()); // Se não houver nenhum elemento na lista, retornará um erro

        // Obtendo os elementos e removendo-os
        System.out.println("Pegando e removendo o primeiro elemento da fila: "+fila.poll()); // Retorna null quando a lista está vazia
        System.out.println("Pegando e removendo o primeiro elemento da fila: "+fila.remove()); // Lança uma exceção se a lista estiver vazia

        System.out.println("Quantidade de elementos na fila: "+fila.size());
        System.out.println("A fila está vazia? "+fila.isEmpty());
    }
}
