/* 2. Diseñar el juego acierta la contraseña. La mecánica del juego es la siguiente: 
 * el primer jugador introduce la contraseña; a continuación, el segundo jugador debe teclear 
 * palabras hasta que la acierte. Realizar dos versiones; en la primera las únicas pistas que 
 * se proporcionan son el número de caracteres y cuáles son el primer y el último carácter 
 * de la contraseña. En la segunda versión se facilita el juego indicando si 
 * la palabra introducida es mayor o menor, alfabéticamente, que la contraseña
 */

import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Scanner sc = new Scanner (System.in);
	        System.out.println("Introduce la contraseña a adivinar: ");
	        String pass = sc.nextLine();
	        boolean adivina = false;
	        
	        System.out.println("Pistas...");
	        
	        System.out.println("Numero de caracteres: " + pass.length());
	        System.out.println("Caracter inicial: " + pass.charAt(0));//c[0]);
	        System.out.println("Caracter final: " + pass.charAt(pass.length()-1));//c[c.length-1]);
	        
	        while (!adivina){
	            System.out.println("Adivina la contraseña: ...");
	            String intento = sc.nextLine();
	            
	            if (pass.equals(intento)){
	                adivina=true;
	            } else {
	                int r;
	                r=pass.compareTo(intento);
	                if(r>0){
	                    System.out.println("La contraseña es posterior alfabéticamente");
	                }else {
	                    System.out.println("La contraseña es anterior alfabéticamente");
	                }
	            }
	            
	        }
	        if(adivina) {
	        	System.out.println(" ¡Contraseña correcta!");
	        	
	        }
	      sc.close();  
	        
	    }

	}

