package ej1;

public class Operario extends empleado {

	public Operario(){
		
	}
	
	public Operario (String nombre) {
		
		super(nombre);
		
	}
	
	public String toString() {
	
		return super.toString() +"-> Operario";
		
	}
	
}
