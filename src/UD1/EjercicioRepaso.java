package UD1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alvaro
 */
public class EjercicioRepaso {
    
    public String leerTexto() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Inserta cadena de texto: ");
        String texto = br.readLine();
        return texto;
    }
    
    public static void recorrerTexto(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.println("Letra " + (i + 1) + ": " + texto.substring(i, (i + 1)));
        }
    }
    
    public static void main(String[] args) {
        String opcion = args[0];
        String texto = args[1];
        
        if (texto.equals("")){
            System.out.println("No existe texto.");
        }else{
            recorrerTexto(texto);
        }
    }
}
