package ej4;

public class NoPerecedero extends Producto{
	private String tipo;
	
	//constructor
	
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre,precio);
		this.tipo=tipo;
	}

	//getters y setters
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	// toString
	
	@Override
	public String toString() {
		return super.toString()+" tipo= " + tipo ;
	}
	
	
	
	
	

}
