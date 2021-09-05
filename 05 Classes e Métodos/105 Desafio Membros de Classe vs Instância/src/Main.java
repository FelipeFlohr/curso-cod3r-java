public class Main {
    public static void main(String[] args) {
        // Desafio: Membros de classe vs Instância

        // Criar um sistema para uma loja utilizando-se da clas-
        // se "Produto" criada nas aulas anteriores. A loja se
        // chama "25% de desconto", e nessa loja o desconto se
        // aplica em todos os itens, havendo capacidade para
        // diferentes tipos de valores para o desconto

        Produto produto1 = new Produto();
        produto1.nome = "Bruh";
        produto1.preco = 2000;

        System.out.println("Produto 1 com desconto normal: "+produto1.precoComDesconto());

        Produto produto2 = new Produto("Benio", 1500);
        System.out.println("Produto 2 com desconto de 30%: "+produto2.precoComDesconto(0.05));

    }

}
