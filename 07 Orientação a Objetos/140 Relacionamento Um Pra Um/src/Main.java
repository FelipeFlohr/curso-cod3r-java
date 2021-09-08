public class Main {

    public static void main(String[] args) {
        
        Carro c1 = new Carro();
        System.out.println("Carro 1 está ligado: "+c1.estaLigado());

        c1.ligar();
        System.out.println("Carro 1 está ligado: "+c1.estaLigado());

        System.out.println("Giros do motor: "+c1.motor.giros());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println("Giros do motor: "+c1.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();

        System.out.println("Giros do motor: "+c1.motor.giros());

        // Tanto a classe Carro como Motor estão se relacionando
        // entre si de um pra um, e também possuem uma relação bi-
        // direcional

    }

}
