import java.util.HashSet;

public class Main {

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        // Set

        /* Set é um conjunto. O mesmo tem as seguintes características:
        - Pode ser heterogêneo (multiplos elementos, não é a forma ideal para ser trabalhada)
        - Pode ser homogêneo
        - Não aceita objetos duplicados
        - Pode ser ordenado
        - Não é indexado*/

        HashSet conjunto = new HashSet();
        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho do conjunto: "+conjunto.size());
        System.out.println("Conjunto removeu o valor 'x': "+conjunto.remove('x'));

        System.out.println("Tamanho do conjunto: "+conjunto.size());

        System.out.println("Conjunto possui 'x': "+conjunto.contains('x'));
        System.out.println("Conjunto possui 1: "+conjunto.contains(1));

        HashSet nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println("Conjunto nums: "+nums);
        System.out.println("Conjunto conjunto: "+conjunto);

        conjunto.addAll(nums);
        System.out.println("Intersecção dos dois conjuntos: "+conjunto);
    }
}
