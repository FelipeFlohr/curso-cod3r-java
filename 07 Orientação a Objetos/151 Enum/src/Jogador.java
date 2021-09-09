public class Jogador {

    int x; // Posição x do jogador
    int y; // Posição y do jogador

    boolean andar(Direcao direcao) {
        switch(direcao){
            case LESTE: x++;
                break;
            case NORTE: y--;
                break;
            case OESTE: x--;
                break;
            case SUL: y++;
                break;
        }
        return true;
    }
    
}
