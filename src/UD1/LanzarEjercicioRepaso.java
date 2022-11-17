package UD1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alvaro
 */
public class LanzarEjercicioRepaso {

    public static String leerTexto() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Inserta cadena de texto: ");
        String texto = br.readLine();
        return texto;
    }

    public static int menu() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean bandera = true;
        int opcion = 0;
        do {
            System.out.println("**********************************");
            System.out.println("************** MENU **************");
            System.out.println("**********************************");
            System.out.println("******* 1. INTRODUCIR TEXTO ******");
            System.out.println("* 2. MOSTRAR CARACTER A CARACTER *");
            System.out.println("************ 3. SALIR ************");
            System.out.println("**********************************");
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

    public static void lanzarProceso(int opcion, String txt, String nombreFichero) throws IOException {
        String clase = "EjercicioRepaso.java";
        File carpeta = new File("C:\\Users\\Alvaro\\Documents\\NetBeansProjects\\ServiciosYProcesos\\src\\UD1");

        ProcessBuilder pb;
        try {
            pb = new ProcessBuilder("java",
                    clase,
                    Integer.toString(opcion),
                    txt);
            pb.directory(carpeta);
            pb.redirectError(new File("errores.txt"));
            pb.redirectOutput(new File(nombreFichero));
            
            pb.start();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        int opcion = 0;
        String texto = "";

        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    texto = leerTexto();
                    opcion = 0;
                    break;
                case 2:
                    if (texto.equals("")) {
                        System.out.println("No existe texto.");
                        opcion = 0;
                    } else {
                        lanzarProceso(opcion, texto, "resultado.txt");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Saliendo...");
                    break;
            }
        } while (opcion == 0);
    }
}
