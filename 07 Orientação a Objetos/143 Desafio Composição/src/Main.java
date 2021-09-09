public class Main {
    public static void main(String[] args) {

        // Desafio de Composição
        // Criar quatro classes: cliente, compra, item e produto
        // Um cliente vai ter n listas de compras, uma lista de
        // compras vai ter n números de itens, e um item vai ter
        // n números de produtos. No final, criar um método dentro
        // de cliente mostrando quanto o mesmo gastou na loja


        // Atributos das classes
        // Produto: preço, nome
        // Item: quantidade, produto
        // Compra: lista de itens
        // Cliente: nome, lista de compras

        Cliente cliente = new Cliente("Bênio");
        
        Compra c1 = new Compra();
        c1.adicionarItem(new Produto(1500, "Televisão"), 2);
        c1.adicionarItem(new Produto(100, "Controle remoto"), 2);

        Compra c2 = new Compra();
        c2.adicionarItem(new Produto(10, "Arroz"), 4);
        c2.adicionarItem(new Produto(5, "Sabonete"), 2);

        final Compra[] listaDeCompras = {c1, c2};
        cliente.adicionarCompras(listaDeCompras);
        
        System.out.println(cliente.toString());
    }
}
