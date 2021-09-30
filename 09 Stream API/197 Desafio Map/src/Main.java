import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // Desafio Map
        /*
        1. Criar um Array com os seguintes valores: { 1, 2, 3, 4, 5, 6, 7, 8, 9 }
        2. Número para String binária: 6 -> 110
        3. Reverter a String: 110 -> 011
        4. Converter de volta para inteiro: -> 011 => 3
         */

        List<Integer> valores = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Convertendo número para binário
        var listaBinaria = valores.stream().map(num -> {
            // Transformando em binário
            String numBinario = Integer.toBinaryString(num);

            // Revertendo os binários
            byte[] stringParaBytes = numBinario.getBytes();
            byte[] resultado = new byte[stringParaBytes.length];

            for (int i = 0; i < stringParaBytes.length; i++) {
                resultado[i] = stringParaBytes[stringParaBytes.length - i - 1];
            }
            String binarioInvertido = new String(resultado);

            // Convertendo os binários novamente para números
            return Integer.parseInt(binarioInvertido, 2);
        });
        System.out.println("Resultado:\n");
        listaBinaria.forEach(System.out::println);
    }
}
