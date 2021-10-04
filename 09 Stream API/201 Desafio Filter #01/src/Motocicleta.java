public class Motocicleta extends Veiculo{

    final String cor;
    final double preco;
    final String nome;

    Motocicleta(String cor, double preco, String nome) {
        super(cor, 2, preco, nome);
        this.cor = cor;
        this.preco = preco;
        this.nome = nome;
    }
}
