
public class Oficial extends Operario {
	//constructor por defecto
	public Oficial() {}
	
	//constructor con par�metros
	
	public Oficial( String nombre) {
		super(nombre);
		
	}
	
	//m�todo toString sobreescrito
	
	public String toString () {
		
		return super.toString() +" -> Oficial";
	}

}
