public class Main {
    public static void main(String[] args) {

        // Interface - Retornos Default
        // É possível retornar um valor default para um método
        // dentro de uma interface. Veja a classe Luxo

        Ferrari ferrari = new Ferrari();
        ferrari.ligarTurbo();

        ferrari.ligarAr();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();

        System.out.println(ferrari.velocidadeAtual);
        System.out.println("Ar condicionado: "+ferrari.getArCondicionado());

        System.out.println("Velocidade do ar: "+ferrari.velocidadeDoAr()); // Retorna o valor default

    }
}
