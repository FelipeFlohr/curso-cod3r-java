import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Desafio Array
        // Calcular a média de notas de um aluno. O usuário de-
        // verá informar a quantidade de notas que deseja pas-
        // sar, e consequentemente deverá ser criado um array
        // cujo tamanho é a quantidade de notas específicado.

        Scanner scanner = new Scanner(System.in);
        double[] notas;
        double acumuladoNotas = 0;
        
        System.out.println("Digite a quantidade de notas que deseja passar: ");
        int qntNotas = scanner.nextInt();
        notas = new double[qntNotas];

        for(int i = 0; i < qntNotas; i++){
            System.out.print("Digite a nota #"+(i+1)+": ");
            notas[i] = scanner.nextDouble();
        }
        scanner.close();

        for (double nota : notas) {
            acumuladoNotas += nota;
        }

        double media = acumuladoNotas / qntNotas;
        System.out.println("Média final: "+media);

    }
}
