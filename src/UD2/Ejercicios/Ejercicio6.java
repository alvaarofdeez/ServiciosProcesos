package UD2.Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio6 extends Thread {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Ejercicio6() {
        super();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 2; i++) {
                System.out.println("Introduce el nombre del empleado: ");
                String nombre = br.readLine();
                System.out.println("Introduce el dia: ");
                String dia = br.readLine();
                System.out.println("Introduce la hora: ");
                Double hora = Double.parseDouble(br.readLine());

                if (hora >= 8.00) {
                    System.out.println(nombre + " llego tarde el dia " + dia);
                } else if (hora == 8.00) {
                    System.out.println(nombre + " llego a su hora el dia " + dia);
                } else {
                    System.out.println(nombre + " llego temprano el dia " + dia);
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Ejercicio6().start();
    }
}
