package UD1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Alvaro
 */
public class Ejercicio2 {

    static FileReader fr = null;
    static BufferedReader br = null;
    static File archivo = null;
    static int suma = 0;

    public static void leerFicheros(String ruta) {
        File carpeta = new File(ruta);

        String[] ficheros = carpeta.list();

        if (ficheros.length == 0) {
            System.out.println("Este fichero está vacio.");
            System.exit(0);
        } else {
            for (int i = 0; i < ficheros.length; i++) {
                if (ficheros[i].contains(".txt")) {
                    try {
                        archivo = new File(ruta + "\\" + ficheros[i]);
                        fr = new FileReader(archivo);
                        br = new BufferedReader(fr);

                        String linea;

                        while ((linea = br.readLine()) != null) {
                            suma = suma + Integer.parseInt(linea);
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    } finally {
                        try {
                            if (null != fr) {
                                fr.close();
                            }
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        String ruta = args[0];

        leerFicheros(ruta);

        System.out.println("La suma de todos los ficheros es: " + suma);
    }
}
