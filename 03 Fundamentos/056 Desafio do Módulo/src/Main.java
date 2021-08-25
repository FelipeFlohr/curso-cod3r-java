import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Desafio do módulo
        // O usuário deverá digitar algum símbolo dentre "+ - * / %"
        // e inserir dois valores. O programa em sequência deverá ler
        // e realizar a operação conforme o símbolo escolhido pelo usuário

        Scanner scanner = new Scanner(System.in);

        double resultado = 0;

        System.out.print("Digite um operador (+ - * / %): ");
        char operador = scanner.next().charAt(0);

        System.out.print("Digite o valor 1: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o valor 2: ");
        double valor2 = scanner.nextDouble();

        resultado = operador == '+' ? (valor1 + valor2) : resultado;
        resultado = operador == '-' ? (valor1 - valor2) : resultado;
        resultado = operador == '*' ? (valor1 * valor2) : resultado;
        resultado = operador == '/' ? (valor1 / valor2) : resultado;
        resultado = operador == '%' ? (valor1 % valor2) : resultado;

        System.out.println("O resultado é: "+resultado);

    }

}
