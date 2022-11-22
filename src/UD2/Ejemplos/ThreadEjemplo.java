/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD2.Ejemplos;

/**
 * Clase que sirve de ejemplo de un Thread
 *
 * @author juans
 */
public class ThreadEjemplo extends Thread {

    /**
     * Constructor de la clase ThreadEjemplo
     *
     * @param Texto para insertar en variable del constuctor padre
     * @return true si el primer nodo (inicio), no apunta a otro nodo.
     */
    public ThreadEjemplo(String str) {
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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ThreadEjemplo("Pepe").start();
        new ThreadEjemplo("Juan").start();
        System.out.println("Termina thread main");
    }
}
