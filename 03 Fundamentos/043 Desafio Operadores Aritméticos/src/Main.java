public class Main {

    public static void main(String[] args) {

        /*Desafio

        Realizar a seguinte operação:

        ( [6 * (3 + 2]²     ( (1 - 5) * (2 - 7) )²)³
        ( -------------  -  (-------------------) )
        (     3 * 2         (          2        ) )
        -------------------------------------------
                            10³
         */

        double conta1 = Math.pow((6 * (3 + 2)), 2) / (3 * 2);
        double conta2 = Math.pow( (double) ((1-5) * (2-7)) / 2, 2);
        double dividendo = Math.pow((conta1 - conta2), 3);
        double resultado = dividendo / Math.pow(10, 3);

        System.out.println("O resultado é: "+resultado);
    }

}
