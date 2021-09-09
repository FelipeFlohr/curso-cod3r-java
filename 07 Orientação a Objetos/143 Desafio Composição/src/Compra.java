import java.util.ArrayList;

public class Compra {

    ArrayList<Item> itens = new ArrayList<>();
    
    void adicionarItem(Produto p, int qntde){
        this.itens.add(new Item(p, qntde));
    }

    double obterValorTotal() {
        double total = 0;

        for(Item item : itens){
            total += item.produto.preco * item.quantidade;
        }

        return total;
    }
}
