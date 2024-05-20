
public class Operario extends Empleado{
	
	//contructor por defecto
	public Operario() {}
	
	//sobreescribir el método constructor:
	public Operario(String nombre) {
		super(nombre);
		
	}

	@Override
	public String toString() {
		return super.toString()+" -> Operario ";
	}
	//metodo toString
	

}
