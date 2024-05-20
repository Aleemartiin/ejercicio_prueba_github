package Matematicas;

public class Ejercicio09 {
	/**
	 * Funciones
	 *
	 * 9. Muestra los números primos que hay entre 1 y 1000.
	 *
	 */

public static void main(String[] args) {

	    for(int i = 1; i < 1001; i++) {
	      if (Varias.esPrimo(i)) {
	        System.out.print(i + "  ");
	      }
	    }
	  }
	}
