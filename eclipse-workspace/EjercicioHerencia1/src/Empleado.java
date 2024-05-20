
public class Empleado {
	private String nombre;
	//getters y setters
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	
	}
	public String getNombre () {
		return nombre;
	}
	
	// contrctor por defecto
	
	public Empleado() {}
	
	//constructor con parámetros
	
	public Empleado (String nombre) {
		this.nombre=nombre;
	}
	
	
	
	//método toString
	
	@Override
	public String toString() {
		return "Empleado " + nombre  ;
	}
	
	
	

}
