public class Main {
    public static void main(String[] args) {

        // Desafio Herança #02
        /* Aplicar os modificadores de acesso no Exercício.*/

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
