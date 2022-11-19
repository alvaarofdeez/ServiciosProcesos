package UD1.Cola;

/**
 *
 * @author Alvaro
 *
 */
public class Cola {

    public Nodo parteInicial; // INICIO DE LA COLA
    public Nodo parteFinal; // FIN DE LA COLA

    public void Cola() { // CONSTRUCTOR VACIO
        this.parteFinal = null;
        this.parteFinal = null;
    }

    public void crearCola() { // CREAR COLA VACIA
        this.parteFinal = null;
        this.parteFinal = null;
    }

    public void encolar(int valor) { // PUSH
        Nodo nodo = new Nodo(); // NUEVO NODO

        nodo.setValorCola(valor); // ASIGNAMOS VALOR AL NODO
        nodo.setSiguienteCola(null);

        if (estaVacia()) { // SI LA COLA ESTA VACIA
            parteInicial = nodo; // ASIGNAMOS EL VALOR A INICIO Y A FIN
            parteFinal = nodo;
        } else { // SI NO
            parteFinal.setSiguienteCola(nodo); // LO ASIGNAMOS AL SIGUIENTE VALOR
            parteFinal = parteFinal.getSiguienteCola(); // Y ASIGNAMOS ESE VALOR AL FINAL DE LA COLA
        }
    }

    public int desencolar() { // POP
        return parteInicial.getValorCola(); // RETORNAMOS EL PRIMER VALOR DE LA COLA
    }

    public boolean estaVacia() { // COMPROBAMOS SI LA COLA ESTA VACIA
        if (parteInicial == null && parteFinal == null) {
            return true;
        } else {
            return false;
        }
    }

    public int numElemento() {
        int contador = 0;
        Nodo nodo = parteInicial;

        do {
            contador++;
            nodo = nodo.getSiguienteCola();
        } while (nodo != null); // HASTA QUE LA COLA QUEDE NULA
        return contador; // RETORNAMOS EL CONTADOR, ES DECIR, EL NUMERO DE ELEMENTOS DE LA COLA
    }
}
