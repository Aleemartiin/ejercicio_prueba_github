
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
	
	//constructor con par�metros
	
	public Empleado (String nombre) {
		this.nombre=nombre;
	}
	
	
	
	//m�todo toString
	
	@Override
	public String toString() {
		return "Empleado " + nombre  ;
	}
	
	
	

}
