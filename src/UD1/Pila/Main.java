package UD1.Pila;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alvaro
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Pila pila = new Pila();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion;

        do {
            System.out.println("********************************************");
            System.out.println("***************** MENÚ PILA ****************");
            System.out.println("********************************************");
            System.out.println("******** 1. AGREGAR VALOR A LA PILA ********");
            System.out.println("******** 2. RETIRAR VALOR A LA PILA ********");
            System.out.println("******* 3. DEVOLVER VALOR DE LA CIMA *******");
            System.out.println("******** 4. BUSCAR VALOR EN LA PILA ********");
            System.out.println("************** 5. LISTAR PILA **************");
            System.out.println("**** 6. COMPROBAR SI LA PILA ESTA VACIA ****");
            System.out.println("************* 7. ELIMINAR LISTA ************");
            System.out.println("********************************************");
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(br.readLine());
            System.out.println("********************************************");

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el valor a añadir: ");
                    int valor = Integer.parseInt(br.readLine());

                    pila.apilar(valor);

                    System.out.println("Valor añadido con existo.");
                    System.out.println("Tamaño de la pila: " + pila.getTamanoPila());
                    break;
                case 2:
                    pila.retirar();
                    System.out.println("Valor retirado con exito.");
                    System.out.println("Tamaño de la pila: " + pila.getTamanoPila());
                    break;
                case 3:
                    System.out.println(Integer.toString(pila.cima()));
                    break;
                case 4:
                    System.out.println("Introduce el valor a buscar: ");
                    valor = Integer.parseInt(br.readLine());

                    if (pila.buscar(valor) == true) {
                        System.out.println("El valor " + valor + " SI existe en la pila.");
                    } else {
                        System.out.println("El valor " + valor + " NO existe en la pila.");
                    }
                    break;
                case 5:
                    System.out.println("Listando pila...");

                    pila.listar();

                    System.out.println("Pila listada.");
                    break;
                case 6:
                    if (pila.esVacia() == true) {
                        System.out.println("La pila está vacia.");
                    } else {
                        System.out.println("La pila no está vacia.");
                    }
                    break;
                case 7:
                    System.out.println("Eliminando pila...");

                    pila.eliminar();

                    System.out.println("Pila eliminada.");
                    break;
                default:
                    System.out.println("Saliendo...");
                    System.exit(0);
            }
        } while (opcion > 0 || opcion <= 7);
    }
}
