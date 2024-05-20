package ej1;

public class empleado {
	
	private String nombre;

	public void setNombre(String nombre) {
		this.nombre=nombre;
	
	}
	public String getNombre () {
		return nombre;
	}
	
	
	public empleado() {
		
	}
	
	public empleado (String nombre) {
		this.nombre=nombre;
	}
	
	@Override
	public String toString() {
		return "Empleado " + nombre;
	}
	
}
