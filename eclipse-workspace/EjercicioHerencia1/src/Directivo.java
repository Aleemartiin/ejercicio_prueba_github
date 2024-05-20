
public class Directivo extends Empleado {
	
	//constructor por defecto
	
	public Directivo () {}
	
	//constructor con parámetros.
	
	public Directivo (String nombre) {
		
		super(nombre);
		
	}
	
	//sobreescribo el método toString
	
	public String toString() {
	
	return super.toString() +"-> Directivo";
	}

}
