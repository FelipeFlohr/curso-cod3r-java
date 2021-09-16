public class Main {
    public static void main(String[] args) {

        // Interfaces funcionais
        /* Interfaces funcionais limitam a quantidade total de
        métodos que uma interface pode comportar para um.
        Implementa-se através da notação @FunctionalInterface*/

        Calculo calc = (x, y) -> x * y;
        System.out.println(calc.executar(2, 2));

    }
}
