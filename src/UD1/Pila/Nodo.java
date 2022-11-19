package UD1.Pila;

/**
 *
 * @author Alvaro
 */
public class Nodo {

    public int valorPila; // VALOR DE LA PILA
    public Nodo siguientePila; // VARIABLE PARA AÑADIR DATOS A LA PILA

    public void Nodo() { // CONTRUCTOR VACIO
        valorPila = 0;
        siguientePila = null;
    }

    // GETTERS
    public int getValorPila() {
        return valorPila;
    }

    public Nodo getSiguientePila() {
        return siguientePila;
    }

    // SETTERS
    public void setValorPila(int x) {
        this.valorPila = x;
    }

    public void setSiguientePila(Nodo x) {
        this.siguientePila = x;
    }
}
