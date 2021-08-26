package classe;

public class Main {

    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.nome = "Notebook";
        produto1.preco = 4356.89;
        produto1.desconto = 0.25;

        var produto2 = new Produto();
        produto2.nome = "Caneta Preta";
        produto2.preco = 12.56;
        produto2.desconto = 0.29;

        System.out.println(produto1.nome);
        System.out.println(produto2.nome);

        double precoFinal1 = produto1.preco * (1 - produto1.desconto);
        double precoFinal2 = produto2.preco * (1 - produto2.desconto);
        System.out.println(precoFinal1);
        System.out.println(precoFinal2);

        System.out.printf("\nMédia do carrinho = R$%.2f.", ((precoFinal1 + precoFinal2) / 2));

    }

}
