public class Main {

    int a = 3;
    public static void main(String[] args) {
        // Primeiro trauma como programador
        // Se declararmos uma variável "a" com o valor 3 e
        // printar este valor, o valor 3 será exibido no con-
        // sole, porém, se fizermos o seguinte:

        /*public class Main {

            int a = 3;
            public static void main(String[] args) {
                System.out.println(a);
            }
        }*/

        // Retornará um erro. O desafio é printar a variável "a"
        // sem retornar nenhum erro, sendo que somente o método
        // main poderá ser modificado.
        
        Main classeMain = new Main();
        System.out.println(classeMain.a);
    }
}
