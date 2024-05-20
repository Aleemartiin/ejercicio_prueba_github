import java.util.Arrays;
import java.util.Scanner;

/* 12. Un anagrama es un palabra, o frase, que resulta de la transposición de otra palabra 
 * o frase. Ejemplos de anagramas para la palabra roma son: amor, ramo o mora. 
 * Construir un programa que solicite al usuario dos palabras e indique si son anagramas 
 * una de otra.
 */

public class Ejercicio_12 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la primera palabra");
        String palabra1 = sc.nextLine();
        System.out.println("Introduzca la segunda palabra");
        String palabra2 = sc.nextLine();
        if (sonAnagramas(palabra1, palabra2)) {
        	  System.out.println("Las palabras son anagramas");
        	
        }else {
        	System.out.println("Las palabras no son anagramas");
        }
        sc.close();
        
    }
    
    
    //método que comprueba si los strings son anagramas
    
    public static boolean sonAnagramas(String palabra1, String palabra2) {
        boolean resultado;
        if (palabra1.length() != palabra2.length()) {
            resultado = false;
        } else {
            char[] p1 = palabra1.toCharArray();//paso las palabras a arrays
            char[] p2 = palabra2.toCharArray();
            Arrays.sort(p1);//ordeno los arrays
            Arrays.sort(p2);
            resultado = Arrays.equals(p1, p2);//comparo los arrays
        }
        return resultado;
    }
    
}