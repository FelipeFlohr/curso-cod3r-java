public interface Luxo {

    public void ligarAr();
    public void desligarAr();

    default int velocidadeDoAr() {
        return 1;
    }

}
