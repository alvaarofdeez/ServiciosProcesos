package UD2.Ejercicios;

public class Ejercicio7 extends Thread {

    public Ejercicio7() {
        super();
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 20; i++) {
                System.out.print(" " + i + " ");
                sleep(1500);
            }
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Ejercicio7().start();
    }
}
