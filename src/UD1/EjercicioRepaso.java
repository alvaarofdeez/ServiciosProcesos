package UD1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Alvaro
 */
public class EjercicioRepaso {

    static File archivo = null;
    static FileReader fr = null;
    static BufferedReader br = null;

    static PrintWriter pw = null;
    static FileWriter fw = null;

    static int contador = 1;

    public static void main(String[] args) {
        int opcion = Integer.parseInt(args[0]);
        String ruta = args[1];
        try {
            switch (opcion) {
                case 1:
                    archivo = new File(ruta + "\\Nuevo.txt");
                    fw = new FileWriter(archivo, true);
                    pw = new PrintWriter(fw);

                    String linea;
                    boolean bandera = true;

                    System.out.println("Introduce el texto que deseas añadir (-1 para dejar de añadir): ");
                    do {
                        System.out.print("Linea " + contador + ": ");
                        linea = br.readLine();

                        if (linea.equals("-1")) {
                            bandera = false;
                        }
                        contador++;
                    } while (bandera != false);
                    break;
                case 2:
                    archivo = new File(ruta + "\\Nuevo.txt");
                    fr = new FileReader(archivo);
                    //br = new BufferedReader(fr);

                    int caracter = fr.read();

                    do {
                        System.out.println("Letra " + contador + ": " + (char) caracter);
                        caracter = fr.read();

                        contador++;
                    } while (caracter != -1);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("NO LO HAS HECHO BIEN FULOP.");
                    break;
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
                if (null != pw) {
                    pw.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
