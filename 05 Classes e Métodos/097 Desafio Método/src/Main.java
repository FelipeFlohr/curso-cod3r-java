public class Main {

    public static void main(String[] args) {

        // Desafio Método
        // Criar uma classe "Data" na qual contenha as variáveis dia, mês
        // e ano, e em seguida criar um método que retorne a data formatada

        Data data1 = new Data();
        data1.dia = 8;
        data1.mes = 7;
        data1.ano = 2003;

        Data data2 = new Data();
        data2.dia = 26;
        data2.mes = 8;
        data2.ano = 2021;

        System.out.println(data1.obterDataFormatada());
        System.out.println(data2.obterDataFormatada());

    }

}
