public class Carro {

    protected final int VELOCIDADE_MAXIMA;
    protected double velocidadeAtual = 0;
    protected int delta = 5;

    protected Carro(int velocidadeMaxima){
       VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    protected void acelerar(){
        if((VELOCIDADE_MAXIMA - delta) > velocidadeAtual){
            velocidadeAtual += delta;
        }
    }

    protected void frear(){
        if(velocidadeAtual >= delta){
            velocidadeAtual -= delta;
        }
    }
    
}