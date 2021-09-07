import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // List
        /* A coleção List tem as seguintes características:
        - Pode ser heterogêneo (não recomendado)
        - Pode ser homogêneo
        - Aceita objetos duplicados
        - É ordenado
        - É indexado*/

        // Criando um List
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");

        lista.add(u1); // Adicionando o objeto da classe
        lista.add(new Usuario("Carlos")); // Adicionando a criação da classe
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Pedro"));

        for(Usuario u: lista){
            System.out.println(u.toString());
        }

        System.out.println("Nome do índice 3 da lista: "+lista.get(3).nome);

        // Removendo itens da lista
        System.out.println("Lista normal: "+lista);

        System.out.println("\nItem 1 da lista removido: "+lista.remove(1));
        System.out.println("Lista: "+lista);

        System.out.println("\nRemovendo o Pedro da lista: "+lista.remove(new Usuario("Pedro")));
        System.out.println("Lista: "+lista);

        // Verificando itens na lista
        System.out.println("A lista possui a usuária 'Lia'? "+lista.contains(new Usuario("Lia")));

    }

}
