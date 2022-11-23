package UD2.Ejercicios;

public class Ejercicio10 {

    static class Pares extends Thread {

        public Pares() {
            super();
        }

        @Override
        public void run() {
            int suma = 0;
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    suma = suma + i;
                }
            }
            System.out.println("La suma de los pares es: " + suma);
        }
    }

    static class Impares extends Thread {

        public Impares() {
            super();
        }

        @Override
        public void run() {
            int suma = 0;
            for (int i = 1; i <= 10; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                    suma = suma + i;
                }
            }
            System.out.println("La suma de los impares es: " + suma);
        }
    }

    public static void main(String[] args) {
        try {
            Pares pares = new Pares();
            pares.start();
            pares.join();

            Impares impares = new Impares();
            impares.start();
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
