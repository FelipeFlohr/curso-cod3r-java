public class Main {
    public static void main(String[] args) {

        // Desafio Herança #01
        /* Criar uma classe chamada "Carro" e duas classes espe-
        cíficas (ex: Fusca e Celta, Ferrari e Lamborghini, etc).
        Dentro da classe genérica criar um método acelerar e um
        método frear de tal forma que a velocidade do carro nun-
        ca poderá ser menor do que 0. Tanto a aceleração como o
        freio deverão reduzir ou aumentar a velocidade em 5. Em
        uma classe específica (exemplo: Ferrari), esse fator de
        aumento ou redução deverá ser alterado para 15.*/

        Carro fusca = new Fusca();
        Carro ferrari = new Ferrari();

        fusca.acelerar();
        ferrari.acelerar();

        System.out.println("Velocidade do Fusca: "+fusca.velocidadeAtual+"\nVelocidade da Ferrari: "+ferrari.velocidadeAtual);

        fusca.acelerar();
        ferrari.acelerar();

        System.out.println("\nVelocidade do Fusca: "+fusca.velocidadeAtual+"\nVelocidade da Ferrari: "+ferrari.velocidadeAtual);

        fusca.frear();
        ferrari.frear();

        System.out.println("\nVelocidade do Fusca: "+fusca.velocidadeAtual+"\nVelocidade da Ferrari: "+ferrari.velocidadeAtual);

    }
}
