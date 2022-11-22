package UD2.Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio8 extends Thread {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Ejercicio8() {
        super();
    }

    @Override
    public void run() {
        try {
            System.out.println("Ingrese el nombre del atleta: ");
            String nombre = br.readLine();

            for (int i = 1; i <= 30; i++) {
                System.out.print(i + " km ");
            }
            System.out.println();
            System.out.println("Llego a la meta " + nombre);

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Ejercicio8().start();
    }
}
