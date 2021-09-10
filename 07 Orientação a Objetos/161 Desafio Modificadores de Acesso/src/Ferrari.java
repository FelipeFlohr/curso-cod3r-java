public class Ferrari extends Carro {

    Ferrari(){
        super(100);
        this.delta = 15;
    }

    Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
        this.delta = 15;
    }

    @Override
    protected void acelerar(){
        if((VELOCIDADE_MAXIMA - delta) > velocidadeAtual){
            this.velocidadeAtual += delta;
        }
    }

    @Override
    protected void frear(){
        if(velocidadeAtual >= delta){
            this.velocidadeAtual -= delta;
        }
    }

}
