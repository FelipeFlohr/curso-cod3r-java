import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Guilherme"));

        boolean resultado = usuarios.contains(new Usuario("Guilherme"));
        System.out.println("O hashset contém o usuário Guilherme: "+resultado);

        // Se deletarmos a função hashset, o resultado acima sempre
        // será false. Isso acontece pois o método utiliza-se de
        // Hashset para verificar elementos.

    }
}
