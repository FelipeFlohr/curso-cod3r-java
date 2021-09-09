import java.util.ArrayList;

public class Cliente {

    String nome;
    ArrayList<Compra> compras = new ArrayList<>();

    Cliente(String nome){
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "Valor total gasto: "+obterValorTotalGasto();
    }

    double obterValorTotalGasto(){
        double total = 0;

        for(Compra compra : compras){
            total += compra.obterValorTotal();
        }

        return total;
    }

    void adicionarCompras(Compra[] compralist){
        for (Compra compra : compralist) {
            compras.add(compra);
        }
    }
    
}
