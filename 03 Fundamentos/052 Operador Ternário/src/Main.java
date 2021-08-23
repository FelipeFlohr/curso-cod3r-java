import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Operador ternário
        // Serve para realizar processos condicionais

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua média: ");
        double media = scanner.nextDouble();
        scanner.close();

        String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado";
        String resultadoFinal = media >= 7.0 ? "aprovado" : resultadoParcial;
        System.out.println("Situação do aluno: "+resultadoFinal);

    }

}
