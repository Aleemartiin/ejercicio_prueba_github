package ej1;

public class Directivo extends empleado {
	
	public Directivo () {
		
	}
	
	public Directivo (String nombre) {
		
		super(nombre);
		
	}
	
	public String toString() {
	
		return super.toString() +"-> Directivo";
		
	}

}
