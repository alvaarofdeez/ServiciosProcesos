package UD2.Ejercicios;

public class Ejercicio11 extends Thread {

    public Ejercicio11(String str) {
        super(str);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " ha comido " + i + " pan/es de queso.");
        }
        System.out.println(getName() + " termino de comer.");
    }

    public static void main(String[] args) {
        new Ejercicio11("Papa pitufo").start();
        new Ejercicio11("Pitufina").start();
        new Ejercicio11("Pitufo actor").start();
        new Ejercicio11("Pitufo alquimista ").start();
        new Ejercicio11("Pitufo arqueologo").start();
        new Ejercicio11("Pitufo arquitecto").start();
        new Ejercicio11("Pitufo armonia").start();
        new Ejercicio11("Bebe pitufo").start();
        new Ejercicio11("Pitufo barbero").start();
        new Ejercicio11("Pitufo bombero").start();
    }
}
