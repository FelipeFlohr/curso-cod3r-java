public class Ferrari extends Carro {

    @Override
    void acelerar(){
        velocidadeAtual += 15;
    }

    @Override
    void frear(){
        if(velocidadeAtual >= 15){
            velocidadeAtual -= 15;
        }
    }

}
