public class Data {

    byte dia;
    byte mes;
    short ano;

    String obterDataFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }

}
