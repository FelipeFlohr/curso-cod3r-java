public class Jantar {
    public static void main(String[] args) {

        // Desafio do módulo
        // 1. Criar três classes: pessoa, comida, jantar
        // A classe Jantar terá o método main. A classe comida
        // e pessoa deverão contar com o nome e o peso. No geral,
        // deverá haver um método "comer", na qual acrescentará
        // ao peso da pessoa instanciada o peso da comida.

        Pessoa pessoa = new Pessoa("Bênio", 75);
        Comida c1 = new Comida("Arroz", 0.2);
        Comida c2 = new Comida("Bacon", 0.7);

        System.out.println("Peso inicial de "+pessoa.nome+": "+pessoa.peso);

        pessoa.comer(c1);
        pessoa.comer(c2);
        System.out.println("Peso final de "+pessoa.nome+": "+pessoa.peso);


    }

}
