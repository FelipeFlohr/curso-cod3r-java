public class Main {
    public static void main(String[] args) {
        
        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@email.com.br";

        Usuario u2 = new Usuario();
        u2.nome = "Pedro Silva";
        u2.email = "pedro.silva@email.com.br";

        // Repare acima que os dois objetos possuem os mesmos
        // valores

        System.out.println("u1 e u2 possuem o mesmo endereço na memória: "+(u1 == u2));
        System.out.println("u1.equals(u2): "+(u1.equals(u2)));

    }
}
