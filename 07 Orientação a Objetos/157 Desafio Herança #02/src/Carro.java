public class Carro {

    final int VELOCIDADE_MAXIMA;
    double velocidadeAtual = 0;
    int delta = 5;

    Carro(int velocidadeMaxima){
       VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar(){
        if((VELOCIDADE_MAXIMA - delta) > velocidadeAtual){
            velocidadeAtual += delta;
        }
    }

    void frear(){
        if(velocidadeAtual >= delta){
            velocidadeAtual -= delta;
        }
    }
    
}
