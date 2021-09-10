public class Main {
    public static void main(String[] args) {

        // Desafio Herança #02
        /* Definir uma nova constante em carro "VELOCIDADE_MA-
        XIMA e criar um construtor para a mesma classe relacio-
        nando este atributo. Com isso, o método acelerar() não
        poderá ultrapassar a velocidade máxima*/

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
