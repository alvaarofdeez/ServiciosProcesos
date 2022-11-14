package UD1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alvaro
 */
public class LanzarCalculadoraPB {

    public int menu() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean bandera = true;
        int opcion = 0;
        do {
            System.out.println("**************************");
            System.out.println("* MENU DE LA CALCULADORA *");
            System.out.println("**************************");
            System.out.println("******** 1. SUMA *********");
            System.out.println("******** 2. RESTA ********");
            System.out.println("**** 3. MULTIPLICACION ***");
            System.out.println("******* 4. DIVISION ******");
            System.out.println("**************************");
            System.out.print("Elige una opcion: ");
            opcion = Integer.parseInt(br.readLine());
            if (opcion >= 1 && opcion <= 4) {
                bandera = false;
            } else {
                bandera = true;
            }
        } while (bandera != false);

        return opcion;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LanzarCalculadoraPB calc = new LanzarCalculadoraPB();

        int opcion = calc.menu();
        System.out.print("Numero 1: ");
        int num1 = Integer.parseInt(br.readLine());
        System.out.print("Numero 2: ");
        int num2 = Integer.parseInt(br.readLine());

        String clase = "Calculadora.java";
        File carpeta = new File("C:\\Users\\Alvaro\\Documents\\NetBeansProjects\\ServiciosYProcesos\\src\\UD1\\");

        ProcessBuilder pb;
        try {
            pb = new ProcessBuilder("java",
                    clase,
                    Integer.toString(opcion),
                    Integer.toString(num1),
                    Integer.toString(num2));
            pb.directory(carpeta);
            pb.redirectError(new File("errores.txt"));
            pb.redirectOutput(new File("Resultado.txt"));
            pb.start();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
