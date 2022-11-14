package UD1;

/**
 *
 * @author Alvaro
 */
public class Calculadora {

    public int suma(int a, int b) {
        return a + b;
    }

    public int resta(int a, int b) {
        return a - b;
    }

    public int producto(int a, int b) {
        return a * b;
    }

    public int cociente(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        int operacion = Integer.parseInt(args[0]);
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);

        Calculadora calc = new Calculadora();

        switch (operacion) {
            case 1:
                System.out.println("El resultado es: " + calc.suma(num1, num2));
                break;
            case 2:
                System.out.println("El resultado es: " + calc.resta(num1, num2));
                break;
            case 3:
                System.out.println("El resultado es: " + calc.producto(num1, num2));
                break;
            case 4:
                System.out.println("El resultado es: " + calc.cociente(num1, num2));
                break;
            default:
                System.out.println("NO LO HAS HECHO BIEN FULOP.");
                break;
        }
    }
}
