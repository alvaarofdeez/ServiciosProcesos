package UD1;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Alvaro
 */
public class LanzarEjercicio2 {

    public static void lanzarProceso(String ruta, String nombreFichero) {
        String clase = "Ejercicio2.java";

        File carpeta = new File("C:\\Users\\Alvaro\\Documents\\NetBeansProjects\\ServiciosYProcesos\\src\\UD1");

        ProcessBuilder pb;

        try {
            pb = new ProcessBuilder("java",
                    clase,
                    ruta);
            pb.directory(carpeta);
            pb.redirectError(new File("erroresEjercicio2.txt"));
            pb.redirectOutput(new File(nombreFichero));
            pb.start();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        lanzarProceso("C:\\Users\\Alvaro\\Documents\\NetBeansProjects\\ServiciosYProcesos", "resultadoEjercicio2.txt");
    }
}
