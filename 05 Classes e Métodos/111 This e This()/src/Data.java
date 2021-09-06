public class Data {

    int dia;
    int mes;
    int ano;

    Data(){
        this(1, 1, 1970); // O método this() só pode ser acessado dentro de construtores
    }

    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }

    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }

}