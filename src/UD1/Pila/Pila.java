package UD1.Pila;

import java.util.Stack;

/**
 *
 * @author Alvaro
 */
public class Pila {

    public Nodo inicioPila; // INICIO DE LA PILA
    public int tamanoPila; // TAMAÑO DE LA PILA

    public void Pila() { // CONTRUCTOR VACIO
        this.inicioPila = null;
        this.tamanoPila = 0;
    }

    // GETTER
    public int getTamanoPila() {
        return tamanoPila;
    }

    // SETTER
    public void setTamanoPila(int x) {
        this.tamanoPila = x;
    }

    // OPERACIONES BÁSICAS
    public void apilar(int valor) { // PUSH
        Nodo nodo = new Nodo(); // NUEVO NODO
        nodo.setValorPila(valor); // ASIGNAMOS EL VALOR AL NODO

        if (esVacia()) { // COMPROBAMOS SI ESTÁ VACIA LA PILA
            inicioPila = nodo; // INICIAMOS PILA CON EL VALOR
        } else {
            nodo.setSiguientePila(inicioPila);
            inicioPila = nodo;
        }
        tamanoPila++; // INCREMENTAMOS TAMAÑO DE LA PILA
    }

    public void retirar() { // POP
        if (!esVacia()) { // COMPROBAMOS QUE NO ESTÉ VACIA LA PILA
            inicioPila = inicioPila.getSiguientePila(); // PISAMOS EL ULTIMO VALOR CON EL SIGUIENTE
        }
        tamanoPila--; // DECREMENTAMOS VALOR PORQUE HEMOS RETIRADO UN VALOR
    }

    public int cima() {
        return inicioPila.getValorPila(); // RETORNAMOS EL ULTIMO VALOR EN LA PILA (ULTIMO AÑADIDO)
    }

    public boolean esVacia() { // COMPROBAMOS SI LA PILA ESTÁ VACIA
        if (inicioPila == null) { // NO ESTÁ VACIA
            return true; // TRUE
        } else { // SI NO
            return false; // FALSE
        }
    }

    public boolean buscar(int valor) { // BUSCAR VALOR EN LA PILA
        Nodo pila = inicioPila; // CREAMOS NODO QUE SERÁ IGUAL A LA PILA, DESDE ESTE BUSCAREMOS EL VALOR
        boolean bandera = false; // CONTROLAREMOS SI EXISTE O NO

        do {
            if (valor == pila.getValorPila()) { // COMPROBAMOS SI EL VALOR EXISTE EN LA PILA
                bandera = true; // CAMBIAMOS BANDERA Y SALIMOS DEL BUCLE
            } else { // SI NO EXISTE
                pila = pila.getSiguientePila(); // PASAMOS AL SIGUIENTE
            }
        } while (bandera != true && pila != null);
        return bandera; // RETORNAMOS BANDERA
    }

    public void eliminar() { // ELIMINAMOS LA PILA
        inicioPila = null;
        tamanoPila = 0;
    }

    public void listar() { // IMPRIMIMOS ELEMENTOS
        Nodo pila = inicioPila;
        int contador = 1;

        do {
            System.out.println("Elemento " + contador + ": " + pila.getValorPila());
            pila = pila.getSiguientePila(); // PASAMOS AL SIGUIENTE VALOR
            contador++;
        } while (pila != null); // HASTA QUE LA PILA ESTÉ VACIA
    }
}
