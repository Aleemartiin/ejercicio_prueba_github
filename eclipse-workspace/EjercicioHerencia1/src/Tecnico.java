
public class Tecnico extends Operario {
	//constructor sin par�metros
	
	public Tecnico() {}
	
	//Constructor con par�metros
	
	public Tecnico(String nombre) {
		super(nombre);
	}
	
	//Sobreescritura de toString
	
	public String toString() {
		return super.toString()+" -> T�cnico";
	}
	
	

}
