package UD2.Ejercicios;

public class Ejercicio2 {

    public static void main(String[] args) {
        Contador cont = new Contador(100);
        HiloA a = new HiloA("HiloA", cont);
        HiloB b = new HiloB("HiloB", cont);
        a.start();
        b.start();
    }

    static class Contador {

        private int c = 0;

        public Contador(int c) {
            this.c = c;
        }

        public void incrementa() {
            c = c + 1;
        }

        public void decrementa() {
            c = c - 1;
        }

        public int getValor() {
            return c;
        }
    }

    static class HiloA extends Thread {

        private Contador contador;

        public HiloA(String n, Contador c) {
            setName(n);
            contador = c;
        }

        @Override
        public void run() {
            for (int i = 0; i < 300; i++) {
                contador.incrementa();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
            }
            System.out.println(getName() + " contador vale " + contador.getValor());
        }

    }

    static class HiloB extends Thread {

        private Contador contador;

        public HiloB(String n, Contador c) {
            setName(n);
            contador = c;
        }

        @Override
        public void run() {
            for (int i = 0; i < 300; i++) {
                contador.decrementa();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
            }
            System.out.println(getName() + " contador vale " + contador.getValor());
        }

    }
}
