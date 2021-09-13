public class Ferrari extends Carro implements Esportivo, Luxo { // Usa-se implements para implementar uma classe

    private boolean arCondicionado;

    Ferrari(){
        super(100);
        this.delta = 15;
    }

    Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
        this.delta = 15;
    }

    @Override
    public void ligarTurbo() {
        this.delta = 35;
    }

    @Override
    public void desligarTurbo() {
        this.delta = 15;
    }

    @Override
    public void ligarAr() {
        arCondicionado = true;
    }

    @Override
    public void desligarAr() {
        arCondicionado = false;
    }

    public boolean getArCondicionado() {
        return arCondicionado;
    }

}