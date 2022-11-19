package UD1.Cola;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alvaro
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Cola cola = new Cola();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion;

        do {
            System.out.println("*************************************************************************");
            System.out.println("******************************** MENÚ COLA ******************************");
            System.out.println("*************************************************************************");
            System.out.println("************************** 1. CREAR COLA VACIA **************************");
            System.out.println("********************** 2. INSERTAR VALOR EN LA COLA *********************");
            System.out.println("********************* 3. RECUPERAR VALOR DE LA COLA *********************");
            System.out.println("****************** 4. COMPROBAR SI LA COLA ESTA VACIA *******************");
            System.out.println("************** 5. NUMERO DE ELEMENTOS QUE CONTIENE LA COLA **************");
            System.out.println("*************************************************************************");
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(br.readLine());
            System.out.println("*************************************************************************");

            switch (opcion) {
                case 1:
                    cola.crearCola();
                    System.out.println("Cola creada.");
                    break;
                case 2:
                    System.out.println("Introduce el valor a introducir: ");
                    int valor = Integer.parseInt(br.readLine());
                    cola.encolar(valor);
                    System.out.println("Valor añadido.");
                    break;
                case 3:
                    System.out.println("Recuperando el primer elemento de la cola...");
                    System.out.println("Valor: " + cola.desencolar());
                    break;
                case 4:
                    if (cola.estaVacia() == true) {
                        System.out.println("La cola esta vacia.");
                    } else {
                        System.out.println("La cola no esta vacia.");
                    }
                    break;
                case 5:
                    System.out.println("Numero de elementos: " + cola.numElemento());
                    break;
                default:
                    System.out.println("Saliendo...");
                    System.exit(0);

            }
        } while (opcion > 0 || opcion <= 5);
    }
}
