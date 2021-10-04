public class Produto {

    private String nome;
    private double preco;
    private double desconto;
    private boolean freteGratis;

    Produto(String nome, double preco, double desconto, boolean freteGratis){
        setNome(nome);
        setPreco(preco);
        setDesconto(desconto);
        setFreteGratis(freteGratis);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public boolean isFreteGratis() {
        return freteGratis;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public void setPreco(double p){
        this.preco = p;
    }

    public void setDesconto(double d){
        this.desconto = d;
    }

    public void setFreteGratis(boolean fG){
        this.freteGratis = fG;
    }

}
