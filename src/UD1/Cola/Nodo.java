package UD1.Cola;

/**
 *
 * @author Alvaro
 */
public class Nodo {

    public int valorCola; // VALOR DE LA COLA
    public Nodo siguienteCola; // VARIABLE PARA AÑADIR DATOS A LA COLA

    public void Nodo() { // CONSTRUCTOR VACIO
        this.valorCola = 0;
        this.siguienteCola = null;
    }

    // GETTERS
    public int getValorCola() {
        return valorCola;
    }

    public Nodo getSiguienteCola() {
        return siguienteCola;
    }

    // SETTERS
    public void setValorCola(int x) {
        this.valorCola = x;
    }

    public void setSiguienteCola(Nodo x) {
        this.siguienteCola = x;
    }
}
