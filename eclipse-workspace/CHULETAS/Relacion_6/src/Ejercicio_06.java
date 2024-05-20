/* 6. Dise�ar una funci�n a la que se le pase una cadena de caracteres 
 * y la devuelva invertida. Un ejemplo, la cadena �Hola mundo� quedar�a �odnum aloH�
 */

import java.util.Scanner;

public class Ejercicio_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Introduzca una cadena");
		        String cadena = sc.nextLine();
		        System.out.println(invertir(cadena));
		        sc.close();
		    }
		    
		    public static String invertir(String cadena) {
		        String resultado = "";
		        for (int i = cadena.length() -1; i >= 0; i--) {
		            resultado += cadena.charAt(i);
		        }
		        return resultado;
		    }
	}

