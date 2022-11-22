package UD2.Ejercicios;

public class Ejercicio3 extends Thread {

    public Ejercicio3(String str, int nivel) {
        super(str);
        setPriority(nivel);
    }

    @Override
    public void run() {
        System.out.println("El nombre del hilo es " + getName() + " y tiene la prioridad " + getPriority());
        setName("SUPER-HILO-DM2");
        setPriority(6);
        System.out.println("Ahora el nombre del hilo es " + getName() + " y tiene la prioridad " + getPriority());
        System.out.println("Final programa");
    }

    public static void main(String[] args) {
        new Ejercicio3("Thread-0", 5).start();
    }
}
