package ej3;

public class Repartidor extends Empleado {
	private String zona;
	
	//constructor
	public Repartidor(String nombre, int edad, double salario,String zona) {
		super(nombre,edad,salario);
		this.zona=zona;
		
		
	}
	
	//geters y seters

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}
	
//m�todo to string
	
	@Override
	public String toString() {
		
		return super.toString() + " zona= " + zona  ;
	}
	// m�todo plus
	
	
	public boolean plus() {
		
		if(super.getEdad()<25 && zona.equalsIgnoreCase("zona 3")) {
			
			//Si tiene menos de 25 y est� en la zona 3 recibe el plus
			//hay que modificar el salario
			double nuevoSalario=super.getSalario()+super.PLUS;
			super.setSalario(nuevoSalario);
			System.out.println("El repartidor "+super.getNombre()+" recibe el plus");
			return true;
		}
		else
			return false;
		
	}

    
	
	
	
	
	

}
