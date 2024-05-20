
public class Tecnico extends Operario {
	//constructor sin parámetros
	
	public Tecnico() {}
	
	//Constructor con parámetros
	
	public Tecnico(String nombre) {
		super(nombre);
	}
	
	//Sobreescritura de toString
	
	public String toString() {
		return super.toString()+" -> Técnico";
	}
	
	

}
