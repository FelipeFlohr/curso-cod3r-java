public class Main {

    public static void main(String[] args) {
        // Desafio Classe Data
        // Criar uma classe data na qual contém dia, mês e ano e instanciar
        // duas das mesmas atribuindo valores para cada variável

        Data data1 = new Data();
        data1.dia = 8;
        data1.mes = 7;
        data1.ano = 2003;

        Data data2 = new Data();
        data2.dia = 26;
        data2.mes = 8;
        data2.ano = 2021;

        System.out.printf("%d/%d/%d", data1.dia, data1.mes, data1.ano);
        System.out.printf("\n%d/%d/%d", data2.dia, data2.mes, data2.ano);

    }

}
