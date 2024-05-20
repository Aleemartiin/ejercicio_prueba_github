/*10. Disponemos de la siguiente relaci�n de letras:
conjunto 1:"eikmpqrstuv"
conjunto 2:"pviumterkqs"

mediante la cual es posible codificar un texto, convirtiendo cada letra del conjunto 1, en su correspondiente del conjunto 2. El resto de las letras no se modifican. Los conjuntos
se utilizan tanto para codificar may�sculas como min�sculas, mostrando siempre la codificaci�n en min�sculas.
Un ejemplo: la palabra �PaquiTo� se codifica como �matqvko�.
Se pide realizar un programa codificador, en el que se implemente la funci�n,
char codifica(char conjunto1[],char conjunto2[], char c)
que devuelve el car�cter c codificado seg�n los conjuntos 1 y 2 que se le pasan.
*/

import java.util.Scanner;


public class Ejercicio_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] tabla1 = "eikmpqrstuv".toCharArray();
        char[] tabla2 = "pviumterkqs".toCharArray();
        System.out.println("Introduzca la cadena a codificar");
        String cadena = sc.nextLine();
        // Codificamos la cadena original
        String codificada = codificaCadena(tabla1, tabla2, cadena);
        // La mostramos codificada
        System.out.println("La cadena codificada es: " + codificada);
        // Decodificamos la cadena codificada (invirtiendo las tablas)
        String decodificada = codificaCadena(tabla2, tabla1, codificada);
        // Y la mostramos
        System.out.println("La cadena decodificada es " + decodificada);
        sc.close();
        
    }
    
    // si un car�cter est� en el array 1 lo pasa al array 2 de la misma posici�n
    
    public static char codifica(char[] conjunto1, char[] conjunto2, char c) {
        char resultado = Character.toLowerCase(c);
        boolean encontrado = false;
        for (int i = 0; i < conjunto1.length && !encontrado; i++) {
            if (resultado == conjunto1[i]) {
                resultado = conjunto2[i];
                encontrado = true;
            }
        }
        return resultado;
    }
    
    //pasa un string a otro string usando la codificaci�n
    
    public static String codificaCadena(char[] conjunto1, char[] conjunto2,
            String cadena) {
        String codificada = "";
        for (int i = 0; i < cadena.length(); i++) {
            codificada += codifica(conjunto1, conjunto2, cadena.charAt(i));
        }
        return codificada;
    }
}