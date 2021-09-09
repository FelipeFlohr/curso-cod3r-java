public class Main {
    public static void main(String[] args) {

        Jogador j1 = new Jogador();
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.LESTE);
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.LESTE);

        System.out.println(j1.x);
        System.out.println(j1.y);

    }
}
