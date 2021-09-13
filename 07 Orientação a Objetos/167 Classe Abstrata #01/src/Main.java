public class Main {
    public static void main(String[] args) {
        // Classe abstrata

        // Uma classe abstrata tem a possibilidade de ter mé-
        // todos não definidos (sem corpo) como também tem a
        // possibilidade de ter métodos definidos (com corpo).
        // Uma classe abstrata também não pode ser instanciada,
        // ou seja, só pode ser usada através de herança.

        Cachorro c = new Cachorro();
        System.out.println(c.mamar());

    }
}
