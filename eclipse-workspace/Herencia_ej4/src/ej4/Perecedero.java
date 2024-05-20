package ej4;

public class Perecedero extends Producto {
	private int diasACaducar;
	
	//constructor
	
	public Perecedero(String nombre, double precio, int diasACaducar) {
		super(nombre,precio);
		this.diasACaducar=diasACaducar;
			
	}
	
	//geters y setters

	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int dias_a_caducar) {
		this.diasACaducar = dias_a_caducar;
	}
	
	//to String

	@Override
	public String toString() {
		return super.toString()+ " dias a caducar= " + diasACaducar ;
	}

	// m�todo calcular:
	// Calcula el precio segun una cantidad,
    // tambien segun los dias que le queden al producto
    // se reducira el precio
    //1 d�a : 4 veces menos
    //2 d�as: 3 veces menos
    //3 d�as: 2 veces menos
    
	
	@Override
	public double calcular(int cantidad) {
		
		double precioFinal=super.calcular(cantidad);
		
		switch (diasACaducar) {
			case 1: 
				precioFinal=precioFinal/4;
				break;
			case 2: 
				precioFinal=precioFinal/3;
				break;
			case 3: 
				precioFinal=precioFinal/2;
				break;
					
		}
	
		
		return precioFinal;
	}
	
	
	
	
	
	
	
	
	
	

}
