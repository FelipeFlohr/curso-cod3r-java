public class Main {
    public static void main(String[] args) {

        // Membros de classe vs Membros de instância

        /*Membros da classe podem ser acessados sem serem
        instânciados através da palavra-chave "static", já
        os membros de instância precisam de um objeto para
        serem acessados. Partindo disso utilizando-se da
        classe Data criada na aula anterior, vemos:

        Atributos:
        - dia -> Membro de instância
        - mes -> Membro de instância
        - ano -> Membro de instância

        Agora, se declararmos "dia" como static, temos:
        - dia -> Membro da classe
        - mes -> Membro de instância
        - ano -> Membro de instância

        Outro exemplo de static:
        class Math{
        static double PI = 3.14;
        }

        Com isso, a variável PI pode ser acessada sem ser ins-
        tânciada através de: Math.PI
        */

        AreaCirc a1 = new AreaCirc(10);
        System.out.println(a1.area()); // Membro da instância

        AreaCirc a2 = new AreaCirc(5);
        System.out.println(a2.area()); // Membro da instância

        System.out.println(AreaCirc.area(7)); // Membro da classe

    }

}
