package UD1;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        String[] archivos = {"informatica.txt", "gerencia.txt", "contabilidad.txt", "comercio.txt", "rrhh.txt"};
        int num = 0, suma = 0;
        Scanner archivo = null;
        try {
            for (int i = 0; i < archivos.length; i++) {
                archivo = new Scanner(new File(archivos[i]));

                while (archivo.hasNext()) {
                    num = archivo.nextInt();
                    suma = suma + num;
                }
            }
        } catch (Exception e) {
        }

        ProcessBuilder pb;
        File carpeta = new File("C:\\Users\\Alvaro\\Documents\\NetBeansProjects\\ServiciosYProcesos\\src\\UD1\\");
        String clase = "Ejercicio2.java";
        try {
            pb = new ProcessBuilder("java",
                    clase,
                    Integer.toString(res));
            pb.directory(carpeta);
            pb.redirectError(new File("errores.txt"));
            pb.redirectOutput(new File("ResultadoEJ2.txt"));
            pb.start();
        } catch (Exception e) {
        }
    }
}
