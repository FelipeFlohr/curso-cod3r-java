import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Exercícios
        /*
        1. Criar um programa que leia a temperatura em Fahrenheit e con-
        verta para Celsius
        2. Criar um programa que leia a temperatura em Celsius e converta para
        Fahrenheit
        3. Criar um programa que leia o peso e a altura do usuário e imprima
        no console o IMC
        4. Criar um programa que leia um valor e apresente os resultados ao
        quadrado e ao cubo do valor
        5. Criar um programa que leia o valor da base e da altura de um triângulo
        e calcule a área
        6. Criar um programa que resolve equações do segundo grau (ax2 + bx
        + c = 0) utilizando a fórmula de Bhaskara. Use como exemplo a = 1,
        b = 12 e c = -13. Encontrar o delta
         */

        Locale.setDefault(new Locale("en", "US"));
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa 1:");
        System.out.print("Digite a temperatura em Fahrenheit: ");
        float temperature1 = (scanner.nextFloat() - 32) * (5f / 9f);
        System.out.println("A temperatura em celsius é: "+temperature1);

        System.out.println("\nPrograma 2:");
        System.out.print("Digite a temperatura em Celsius: ");
        float temperature2 = (scanner.nextFloat() * (9f / 5)) + 32;
        System.out.println("A temperatura em Fahrenheit é: "+temperature2);

        System.out.println("\nPrograma 3:");
        System.out.print("Digite a altura: ");
        float altura = scanner.nextFloat();
        System.out.print("Digite o peso: ");
        float peso = scanner.nextFloat();
        float imc = peso / (altura * altura);
        String resultadoParcial = imc < 18.4 ? "Abaixo do peso" : "Normal";
        String resultadoNormal = imc >= 25 ? "Sobrepeso" : resultadoParcial;
        String resultado = imc >= 30 ? "Obesidade" : resultadoNormal;
        System.out.println("IMC: "+imc+" Resultado: "+resultado);

        System.out.println("\nPrograma 4:");
        System.out.print("Digite um valor: ");
        double valor = scanner.nextDouble();
        System.out.println("Valor ao quadrado: "+Math.pow(valor, 2));
        System.out.println("Valor ao cubo: "+Math.pow(valor, 3));

        System.out.println("\nPrograma 5:");
        System.out.println("Digite a base do triângulo: ");
        float trianguloBase = scanner.nextFloat();
        System.out.println("Digite a alutra do triângulo: ");
        float trianguloAltura = scanner.nextFloat();
        float areaTriangulo = (trianguloBase * trianguloAltura) / 2;
        System.out.println("Área do triângulo = "+areaTriangulo);

        System.out.println("\nPrograma 6:");
        System.out.print("Digite o 'a' da equação: ");
        float a = scanner.nextFloat();
        System.out.print("Digite o 'b' da equação: ");
        float b = scanner.nextFloat();
        System.out.print("Digite o 'c' da equação: ");
        float c = scanner.nextFloat();
        float raiz = (float) Math.sqrt((Math.pow(b, 2) - (4 * (a * c))));
        float x1 = ((b * -1) + raiz) / (2 * a);
        float x2 = ((b * -1) - raiz) / (2 * a);
        System.out.println("x1 = "+x1+"\nx2 = "+x2);

    }

}
