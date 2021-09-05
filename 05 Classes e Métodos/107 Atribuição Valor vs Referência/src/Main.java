public class Main {
    public static void main(String[] args) {

        // Atribuição Valor vs Referência

        /* Vejamos a seguinte coisa:
        int a = 2;
        int b = a;

        Quando a variável "a" foi declarada, um espaço na me-
        mória foi criado indicando que a mesma recebe o valor
        2, e quando a variável "b" foi declarada, a mesma rece
        beu o valor 2, pois tipos primitivos são copiados entre
        si. Agora, se fizermos o seguinte:

        a++; <- a terá o valor de 3
        b--; <- b terá o valor de 2

        No cenário acima temos a atribuição por valor, porém, a 
        mesma situação muda quando forem objetos, veja o exemplo
        abaixo:

        Data d1 = new Data();
        Data d2 = d1;

        Assim, a instância "d1" têm um valor atribuído na memó-
        ria representado por um número hexadecimal e a instân-
        cia d2 apenas copia este endereço na memória e atribui
        para si, tanto que se alterarmos um valor de um, o valor
        altera para ambos. Veja:

        d2.dia = 3; <- Dessa maneira, tanto d1 como d2 terão o
                       valor "3" em "dia"
        d1.mes = 7; <- Dessa maneira, tanto d1 como d2 terão o
                       valor "7" em "mes"
        
        Assim, no cenário acima a atribuição é por referência.*/

        int a = 2;
        int b = a; // Atribuição por valor (Tipo primitivo)
        System.out.println(a++);
        System.out.println(b--);

        Data d1 = new Data(5, 9, 2021);
        Data d2 = d1; // Atribuição por referência (Objeto)

        d1.dia = 31;
        d2.mes = 12;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

    }

}
