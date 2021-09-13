public class Jantar {
    public static void main(String[] args) {

        // Polimorfismo
        // Desafio: utilizar-se de polimorfismo dinâmico para
        // instânciar as classes.
        // Isso será feito através da classe comida
        
        Pessoa convidado = new Pessoa(99.65);

        Comida ingrediente1 = new Arroz(0.2); // Polimorfismo no tipo da instância
        Comida ingrediente2 = new Feijao(0.1); // Polimorfismo no tipo da instância

        System.out.println(convidado.getPeso());

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);

        System.out.println(convidado.getPeso());

    }
}
