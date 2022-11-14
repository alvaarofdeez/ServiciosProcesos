package UD1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Alvaro
 */
public class LanzarCalculadoraRT {

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
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        LanzarCalculadoraRT calc = new LanzarCalculadoraRT();

        int opcion = calc.menu();
        System.out.print("Numero 1: ");
        int num1 = Integer.parseInt(br.readLine());
        System.out.print("Numero 2: ");
        int num2 = Integer.parseInt(br.readLine());

        String clase = "Calculadora.java";

        Runtime rt = Runtime.getRuntime();
        try {
            Process process = rt.exec("java C:\\Users\\Alvaro\\Documents\\NetBeansProjects\\ServiciosYProcesos\\src\\UD1\\"
                    + clase
                    + " " + Integer.toString(opcion)
                    + " " + Integer.toString(num1)
                    + " " + Integer.toString(num2));

            InputStream is = process.getInputStream();
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            String linea = br.readLine();
            System.out.println("Linea: " + linea);
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
