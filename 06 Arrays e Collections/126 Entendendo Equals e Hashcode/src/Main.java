public class Main {
    public static void main(String[] args) {

        // Entendendo Equals e Hashcode

        /* De início, é importante entender o seguinte conceito:
        int a = 2;
        int b = 2;
        a == b >> true

        Porém, se fizermos isso com objetos:
        Produto p1 = new Produto("Abacaxi", 5)
        Produto p2 = new Produto("Abacaxi", 5)
        p1 == p2 >> false

        Isso acontece pois p1 e p2 apontam para endereços dife-
        rentes na memória. Portanto, para comparar os valores
        entre dois objetos, usa-se o método equals(), na qual
        todas as classes possuem, porém, o mesmo sem ser sobres-
        crito também retornará false, veja:
        p1.equals(p2) >> false

        Isso acontece porque o equals precisa ser implementado.

        O equals também vem junto com outra função chamada
        hashcode. O método hashcode retorna um valor integer.
        Para demonstrar o uso do Hashcode, veja a seguinte
        situação

        Atributos de um Objeto -> Ana, Bia, Lia, Cid, Luna, Luca, Kiko... (Imagine que haja milhares de pessoas dentro desse conjunto)
        Para acharmos usuários dentro desse conjunto, utilizaremos
        como parâmetro o nome. Para isso, o equals é um método 
        lento, pois irá iterar sobre cada elemento do conjunto, 
        sendo assim, o hashcode serve como um método muito mais 
        rápido para separar objetos que tenham a possibilidade
        de ser igual. Sendo assim, para acharmos o usuário "Kiko"
        utilizaremos como base a quantidade de letras que têm o seu
        nome (4, no caso), e posteriormente será utilizado o equals
        no subconjunto do conjunto dos nomes.
        */
    }
}
