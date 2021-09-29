public class Main {

    public static void main(String[] args) {
        // As interfaces funcionais foram introduzidas a partir do Java 8, po-
        // rém antes disso também era possível realizar operações semelhantes.

        Runnable trabalho1 = new Trabalho1(); // Utilizando uma classe
        Runnable trabalho2 = new Runnable() { // Utilizando uma classe anônima
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Tarefa 2. Iteração #" + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Runnable trabalho3 = () -> { // Utilizando função Lambda
            for (int i = 0; i < 100; i++) {
                System.out.println("Tarefa 3. Iteração #" + i);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(trabalho1);
        Thread t2 = new Thread(trabalho2);
        Thread t3 = new Thread(trabalho3);

        t1.start();
        t2.start();
        t3.start();
    }
}
