package UD2.Ejercicios;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio1 extends Thread {

    public Ejercicio1(String str) {
        super(str);
    }

    @Override
    public void run() {
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        Date d = new Date();

        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + " - " + df.format(d));
        }
        System.out.println("Termina thread " + getName());
    }

    public static void main(String[] args) {
        new Ejercicio1("Hilo 1").start();
        new Ejercicio1("Hilo 2").start();
        new Ejercicio1("Hilo 3").start();
        System.out.println("Termina thread main");
    }
}
