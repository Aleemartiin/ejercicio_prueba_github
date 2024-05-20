package Matematicas;

public class Ejercicio10 {
	
	/**
	 * Funciones
	 * 
	 * 10. Muestra los números capicúa que hay entre 1 y 99999.
	 * 
	 */

	  public static void main(String[] args) {

	    for(int i = 1; i < 99999; i++) {
	      if (Varias.esCapicua(i)) {
	        System.out.print(i + "  ");
	      }
	    }
	  }
	}
