package UD2.Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio13 extends Thread {

    private int numero = 0;
    private int saldo = 1000;
    private int banca = 50000;
    private int[] rojos = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};
    private int[] negros = {2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35};

    public Ejercicio13(int numero, int apuesta) {
        this.numero = numero;
        this.saldo = this.saldo - apuesta;
    }

    @Override
    public void run() {
        boolean banderaRojo = false;
        boolean banderaNegro = false;
        boolean banderaPar = false;
        boolean banderaImpar = false;
        boolean banderaCero = false;

        int numero = (int) (Math.random() * 36 + 0); // GENERAMOS NUMERO ALEATORIO, ES DECIR, GIRA LA RULETA

        // COMPROBAR SI ES PAR, IMPAR O CERO
        if (numero % 2 == 0) {
            banderaPar = true;
            banderaImpar = false;
            banderaCero = false;
        } else if (numero % 2 != 0) {
            banderaPar = false;
            banderaImpar = true;
            banderaCero = false;
        } else {
            banderaPar = false;
            banderaImpar = false;
            banderaCero = true;
        }

        for (int i = 0; i < rojos.length; i++) {
            if (numero == rojos[i]) {
                banderaRojo = true;
                banderaNegro = false;
            }
        }

        for (int i = 0; i < negros.length; i++) {
            if (numero == negros[i]) {
                banderaRojo = false;
                banderaNegro = true;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("***************************************************");
        System.out.println("****************** REGLAS DEL JUEGO ***************");
        System.out.println("***************************************************");
        System.out.println("LA BANCA ACEPTA TODAS LAS APUESTAS, PERO NUNCA PAGA");
        System.out.println("MAS DINERO DEL QUE TIENE.");
        System.out.println("***************************************************");
        System.out.println("SI SALE EL 0, TODO EL MUNDO PIERDE Y LA BANCA SE");
        System.out.println("QUEDA CON TODO EL DINERO.");
        System.out.println("***************************************************");
        System.out.println("¡ENTENDIDO! Pulsa Intro para continuar.");
        br.readLine();

        System.out.println("***************************************************");
        System.out.println("********************** MENU ***********************");
        System.out.println("***************************************************");
        System.out.println("1. JUGAR A NUMERO CONCRETO");
        System.out.println("2. JUGAR A PAR/IMPAR");
        System.out.println("3. JUGAR A LA 'MARTINGALA'");
        System.out.println("***************************************************");
        int opcion = Integer.parseInt(br.readLine());

        switch (opcion) {

        }
    }

}
