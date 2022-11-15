package UD1;

/**
 *
 * @author Alvaro
 */
public class Ejercicio2 {
    
    public int mostrar(int a) {
        return a;
    }
    
    public static void main(String[] args) {
        int res = Integer.parseInt(args[0]);
        
        Ejercicio2 ej2 = new Ejercicio2();
        
        System.out.println("El resultado es: " + ej2.mostrar(res));
    }
}
