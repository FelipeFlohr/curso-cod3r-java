public class Main {
    public static void main(String[] args) {

        // Interface
        // Uma interface servirá como template para métodos e atri-
        // butos que podem ser implementadas em uma classe. Os mé-
        // todos não têm corpo

        Ferrari ferrari = new Ferrari();
        ferrari.ligarTurbo();

        ferrari.ligarAr();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();

        System.out.println(ferrari.velocidadeAtual);
        System.out.println("Ar condicionado: "+ferrari.getArCondicionado());

    }
}
