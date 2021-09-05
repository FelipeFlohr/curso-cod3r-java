public class Data {

    int dia = 1;
    int mes = 1;
    int ano = 1970;

    Data(){

    }

    Data(int diaConstrutor, int mesConstrutor, int anoConstrutor){
        dia = diaConstrutor;
        mes = mesConstrutor;
        ano = anoConstrutor;
    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }

    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }
    
}
