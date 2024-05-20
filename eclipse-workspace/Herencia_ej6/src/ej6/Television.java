package ej6;

public class Television extends Electrodomestico {

	private int resolucion;
	final private int RESOLUCION = 20;
	private boolean sintonizadorTDT;
	final private boolean SINTONIZADORTDT = false;

	// Contructor por defecto

	public Television() {
		super();
		this.resolucion = RESOLUCION;
		this.sintonizadorTDT = SINTONIZADORTDT;
	}

	// Constructor con precio y peso
	public Television(double precio, double peso) {
		super(precio, peso);
		this.resolucion = RESOLUCION;
		this.sintonizadorTDT = SINTONIZADORTDT;
	}

	//Constructor con todos los parámetros

	public Television(double precioBase, String color, char consumo, double peso, int resolucion, boolean sintonizadorTDT) {
		super(precioBase, color, consumo, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
		
	}

	public int getResolucion() {
		return resolucion;
	}

	
	public boolean getSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	//precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un 30% y si tiene un sintonizador TDT 
	//incorporado, aumentara 50 €. 
	
	public void precioFinal() {
		super.precioFinal();
		if (resolucion>=40)
		{
			precioBase=precioBase*1.3;
			
		}	
		if(sintonizadorTDT) {
			
			precioBase+=50;
		}
	}

	
	
	
	
	

}
