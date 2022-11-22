package UD2.Ejercicios;

public class Ejercicio9 extends Thread {

    public Ejercicio9(String str) {
        super(str);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 30; i++) {
            System.out.println(i + " m ");
        }
        System.out.println("Llego a la meta " + getName());
    }

    public static void main(String[] args) {
        new Ejercicio9("Rocket").start();
        new Ejercicio9("Bobby").start();
        new Ejercicio9("Paquito").start();
    }
}
