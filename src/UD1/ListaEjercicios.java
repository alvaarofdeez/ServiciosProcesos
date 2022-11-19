/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UD1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class ListaEjercicios {

    public static void crearPiramide(int altura) throws IOException { // METODO PARA CREAR PIRAMIDE NORMAL
        for (int i = 1; i <= altura; i++) { // I, IRÁ DESDE 1 HASTA LA ALTURA
            for (int y = 1; y <= altura - i; y++) { // Y, IRÁ DESDE 1 HASTA LA ALTURA -1, MIENTRAS 'Y' SEA MENOR O IGUAL QUE 'ALTURA - I' PONDRÁ UN ESPACIO
                System.out.print(" "); // PINTAMOS ESPACIO
            }
            for (int p = 1; p <= (i * 2) - 1; p++) { // P, IRÁ DESDE 1 HASTA (I*2) -1, MIENTRAS 'P' SEA MENOR O IGUAL PONDRÁ UN ASTERISCO
                System.out.print("*"); // PINTAMOS ASTERISCO
            }
            System.out.println(); // SALTO DE LÍNEA PARA PINTAR LA SIGUIENTE ALTURA
        }
    }

    public static void crearPiramideInveritda(int altura) throws IOException { // METODO PARA CREAR PIRAMIDE INVERSA
        for (int i = altura; i >= 1; i--) { // I, IRÁ DESDE EL VALOR DE ALTURA HASTA 1
            for (int y = altura; y >= i + 1; y--) { // Y, IRÁ DESDE EL VALOR DE ALTURA HASTA I + 1, MIENTRAS 'Y' SEA MAYOR O IGUAL PONDRÁ UN ESPACIO
                System.out.print(" "); // PINTAMOS ESPACIO
            }
            for (int p = 1; p <= (i * 2) - 1; p++) { // P, IRÁ DESDE 1 HASTA (I*2) -1, MIENTRAS 'P' SEA MENOR O IGUAL PONDRÁ UN ASTERISCO
                System.out.print("*"); // PINTAMOS ASTERISCO
            }
            System.out.println(); // SALTO DE LÍNEA PARA PINTAR LA SIGUIENTE ALTURA
        }
    }

    public static void main(String[] args) throws IOException {
        int opcion = Integer.parseInt(args[0]); // RECOGEMOS OPCION
        int altura = Integer.parseInt(args[1]); // RECOGEMOS ALTURA

        switch (opcion) { // DEPENDIENDO DE LA OPCION
            case 1: // OPCION 1
                crearPiramide(altura); // PIRAMIDE NORMAL
                break; // SALIR
            case 2: // OPCION 2
                crearPiramideInveritda(altura); // PIRAMIDE INVERSA
                break; // SALIR
            default: // NIGUNA DE LAS ANTERIORES
                break; // SALIR
        }
    }
}
