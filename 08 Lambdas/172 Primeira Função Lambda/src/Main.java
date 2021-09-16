public class Main {
    public static void main(String[] args) {

        // Lambda

        /* Uma expressão Lambda é um bloco curto de texto na
        qual leva parâmetros e retorna um valor. Expressões
        Lambdas são similares á métodos, porém não precisam
        de um nome e podem ser implementadas logo no corpo
        do método*/

        System.out.println("Sem funções Lambda:");
        Calculo calculo = new Somar();
        System.out.println(calculo.executar(2, 3));

        calculo = new Multiplicar();
        System.out.println(calculo.executar(2, 3));

        // Criando uma função Lambda
        Calculo soma = (x, y) -> {
            return x + y;
        };

        // Como a classe Calculo possui apenas uma função, o
        // Java irá automaticamente associar a Lambda á esta
        // função
        System.out.println("\nCom funções Lambda:");
        System.out.println(soma.executar(2, 3));

        // Em funções sem corpo (isto é, as chaves) o return
        // não é necessário, veja:
        soma = (x, y) -> x * y;
        System.out.println(soma.executar(2, 3));
 
    }
}
