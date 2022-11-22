package UD2.Ejemplos;

/**
 *
 * @author Alvaro
 */
public class EjemploThread extends Thread {

    /**
     * Constructor de la clase ThreadEjemplo
     *
     * @param Texto para insertar en variable del constuctor padre
     * @return true sin el primer nodo, no apunta a otro
     */
    public EjemploThread(String str) {
        super(str);
    }

    /**
     * Metodo run para ejecutar dentro del hilo
     *
     * @param Vacio
     * @return Vacio
     */
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName());
        }
        System.out.println("Termina thread " + getName());
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        new EjemploThread("Alvaro").start();
        new EjemploThread("SuCoelgaJuanito").start();
        System.out.println("Termina thread main.");
    }
}
