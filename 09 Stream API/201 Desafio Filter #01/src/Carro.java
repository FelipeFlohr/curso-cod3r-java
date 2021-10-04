public class Carro extends Veiculo {

    final String cor;
    final double preco;
    final String nome;

    Carro(String cor, double preco, String nome) {
        super(cor, 4, preco, nome);
        this.cor = cor;
        this.preco = preco;
        this.nome = nome;
    }
}
