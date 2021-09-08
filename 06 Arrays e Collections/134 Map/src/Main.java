import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();
        
        // Adicionando elementos no mapa
        usuarios.put(1, "Ricardo"); // O put tanto adiciona como substitui valores
        usuarios.put(1, "Roberto");
        System.out.println("Lista de usuários: "+usuarios);

        usuarios.put(2, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println("Mapa: "+usuarios+"\nTamanho do mapa: "+usuarios.size());
        System.out.println("Conjunto das chaves: "+usuarios.keySet());
        System.out.println("Conjunto dos valroes: "+usuarios.values());
        System.out.println("Conjunto: "+usuarios.entrySet());

        System.out.println("Conjunto possui chave 20: "+usuarios.containsKey(20));

        System.out.println("Percorrendo chaves:");
        for(int chave: usuarios.keySet()){
            System.out.println(chave);
        }

        System.out.println("Percorrendo valores:");
        for(String valor: usuarios.values()){
            System.out.println(valor);
        }

        System.out.println("Percorrendo chaves e valores:");
        for(Entry<Integer, String> registro : usuarios.entrySet()){
            System.out.println(registro);
        }
    }
}
