package UD2.Ejercicios;

import static java.lang.Thread.sleep;

public class Ejercicio5 {

    static class Primero extends Thread {

        Primero(String str) {
            setName(str);
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < 15; i++) {
                    System.out.println(getName());
                    sleep(100);
                }
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    static class Segundo extends Thread {

        public Segundo(String str) {
            setName(str);
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < 15; i++) {
                    System.out.println(getName());
                    sleep(200);
                }
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new Primero("Primero").start();
        new Segundo("Segundo").start();
    }

}
