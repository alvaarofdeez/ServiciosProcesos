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

    final static LanzarEjercicioRepaso objUno = new LanzarEjercicioRepaso();

    public int menu() throws IOException {
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

    public static void lanzarProceso(String ruta) throws IOException {
        int opcion = objUno.menu();

        String clase = "EjercicioRepaso.java";
        File carpeta = new File("C:\\Users\\Alvaro\\Documents\\NetBeansProjects\\ServiciosYProcesos\\src\\UD1");

        ProcessBuilder pb;
        try {
            pb = new ProcessBuilder("java",
                    clase,
                    Integer.toString(opcion),
                    ruta);
            pb.directory(carpeta);
            pb.redirectError(new File("errores.txt"));
            pb.redirectOutput(new File("resultadoEjercicioRepaso.txt"));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        lanzarProceso("C:\\Users\\Alvaro\\Desktop");
    }
}
