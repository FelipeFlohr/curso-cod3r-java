import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Desafio:
        Usar o Scanner e pegar 3 Strings usando o nextLine. Estas 3 Strings
        receberão 3 salários porém terão a capacidade de receber valores
        flutuantes tanto com vírgula como com ponto. No final, realizar a
        média salárial dos três funcionários
         */

        Scanner scanner = new Scanner(System.in);

        // Salário 1
        System.out.print("Digite a quatia do salário 1: ");
        float salario1 = Float.parseFloat(scanner.nextLine().replace(',', '.'));

        // Salário 2
        System.out.print("Digite a quatia do salário 2: ");
        float salario2 = Float.parseFloat(scanner.nextLine().replace(',', '.'));

        // Salário 3
        System.out.print("Digite a quatia do salário 3: ");
        float salario3 = Float.parseFloat(scanner.nextLine().replace(',', '.'));

        scanner.close();

        System.out.println("Salário 1: "+salario1);
        System.out.println("Salário 2: "+salario2);
        System.out.println("Salário 3: "+salario3);
        System.out.println("Média:     "+((salario1 + salario2 + salario3) / 3));

    }

}
