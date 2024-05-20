
public class Oficial extends Operario {
	//constructor por defecto
	public Oficial() {}
	
	//constructor con parámetros
	
	public Oficial( String nombre) {
		super(nombre);
		
	}
	
	//método toString sobreescrito
	
	public String toString () {
		
		return super.toString() +" -> Oficial";
	}

}
