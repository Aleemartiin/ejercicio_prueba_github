
public class Directivo extends Empleado {
	
	//constructor por defecto
	
	public Directivo () {}
	
	//constructor con par�metros.
	
	public Directivo (String nombre) {
		
		super(nombre);
		
	}
	
	//sobreescribo el m�todo toString
	
	public String toString() {
	
	return super.toString() +"-> Directivo";
	}

}
