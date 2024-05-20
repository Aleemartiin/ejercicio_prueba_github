package Funciones_arrays;

public class Comprobar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Genera un array de 20 elementos aleatorios entre 0 y 1000
		int[] a = Varias.generaArrayInt(20,0,1000);
		
		//Muestra el array
		System.out.println("El array creado es el siguiente:");
		Varias.muestraArrayInt(a);
		
		//Muestra el valor mínimo del array
		System.out.println("Mínimo: " + Varias.minimoArrayInt(a));
		
	    //Muestra el valor máximo del array
		System.out.println("Máximo: " + Varias.maximoArrayInt(a));
	    
		//Muestra la media del array
	    System.out.println("Media: " + Varias.mediaArrayInt(a));
	    
	}

}
