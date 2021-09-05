public class Main {

    public static void main(String[] args) {
        Integer num1 = 10000;
        System.out.println(num1);

        // Transformando a variável "num1" em String
        String num1String = num1.toString();
        System.out.println(num1String);

        // Dessa maneira podemos usar métodos da classe String
        System.out.println(num1String.length());
    }

}
