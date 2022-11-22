package UD2.Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio4 extends Thread {

    public Ejercicio4(String str) {
        super(str);
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(getName());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce el número de hilos a crear: ");
        int hilos = Integer.parseInt(br.readLine());

        for (int i = 1; i <= hilos; i++) {
            new Ejercicio4("Hilo " + i).start();
        }
    }
}
