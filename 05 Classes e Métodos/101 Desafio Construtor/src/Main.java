public class Main {
    public static void main(String[] args) {

        // Desafio Construtor
        // Criar um construtor padrão e um construtor contendo
        // o dia, mês e ano. Se o construtor padrão for chamado
        // sem nenhum parâmetro, a data padrão é pra ser 01/01/78,
        // tendo em vista que esta é a data início do UNIX

        Data data1 = new Data();
        Data data2 = new Data(8, 7, 2003);

        data1.imprimirDataFormatada();
        data2.imprimirDataFormatada();

    }
}
