public class Main {

    public static void main(String[] args) {
        // Conversão de Tipos Primitivos

        // Conversões implicitas: conversão de um byte para um short, pois não há perigo de perder informação
        // Conversões explicitas: conversão de um short para um byte, pois há risco de informação ser perdida

        double a = 1; // Implícita
        System.out.println(a);

        float b = (float) 1.123456788888; // Explícita (CAST)
        System.out.println(b);

        int c = 130;
        byte d = (byte) c; // Explícita (CAST)
        System.out.println(d); // O resultado será um valor truncado
    }

}
