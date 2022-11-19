package UD1.Examen;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class LanzadorListaEjercicios {

    public static int menu() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean bandera = true;
        int opcion = 0;

        do {
            System.out.println("******************************************************************************");
            System.out.println("************************************ MENU ************************************");
            System.out.println("******************************************************************************");
            System.out.println("Ejercicio 1");
            System.out.println("Crea una aplicacion que dibuje una piramide de asteriscos mediante bucles for.");
            System.out.println("Nosotros le pasamos la altura de la piramide por teclado.");
            System.out.println("Ejercicio 2");
            System.out.println("Crea una aplicacion que dibuje una piramide invertida de asteriscos mediante");
            System.out.println("bucles for. Nosotros le pasamos la altura de la piramide por teclado.");
            System.out.println("******************************************************************************");
            System.out.print("Elige una opcion: ");
            opcion = Integer.parseInt(br.readLine());

            if (opcion <= 0 || opcion <= 3) {
                bandera = false;
            }
        } while (bandera != false);

        return opcion;
    }

    public static void lanzarProceso(int opcion, int altura, String nombreFichero) {
        String clase = "ListaEjercicios.java"; //CLASE CON LA QUE VAMOS A TRABJAR
        File carpeta = new File("C:\\Users\\Alvaro\\Documents\\NetBeansProjects\\ServiciosYProcesos\\src\\UD1"); // FICHERO EN EL QUE SE CREARAN LOS LOG DE ERROR O RESULTADO

        ProcessBuilder pb;

        try {
            pb = new ProcessBuilder("java",
                    clase,
                    Integer.toString(opcion),
                    Integer.toString(altura));
            pb.directory(carpeta); // CARPETA DE TRABAJO
            pb.redirectError(new File("errores.txt")); // FICHERO ERROR
            pb.redirectOutput(new File(nombreFichero)); // FICHERO RESULTADO

            pb.start(); // LANZAMOS PROCESS BUILDER
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opcion = menu(); // PASAMOS OPCION

        System.out.println("************************************");
        System.out.println("Ejercicio " + opcion);
        System.out.println("Por favor introduce la altura de la piramide: ");
        int altura = Integer.parseInt(br.readLine()); // RECOGEMOS ALTURA DE PIRAMIDE

        String nombreFichero = "Ejercicio " + opcion + ".txt"; // CREAMOS NOMBRE DE FICHERO

        lanzarProceso(opcion, altura, nombreFichero); // LLAMAMOS A LA FUNCIÓN

        System.out.println("Ejercicio realizado, podras ver el resultado en el siguiente directorio:\nC:\\Users\\Alvaro\\Documents\\NetBeansProjects\\ServiciosYProcesos\\" + nombreFichero); // MENSAJE DE PROGRAMA ACABADO
    }
}
