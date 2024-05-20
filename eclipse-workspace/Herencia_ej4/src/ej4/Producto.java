package ej4;

public class Producto {
	private String nombre;
	private double precio;
	
	//constructor con par�metros
	
	public  Producto(String nombre,double precio) {
		this.nombre=nombre;
		this.precio=precio;
		
	}
	//Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Producto: nombre=" + nombre + ", precio=" + precio ;
	}
	
	//m�todo calcular
	//indica la cantidad a deber segun la cantidad de producto:
	
	public double calcular(int cantidad) {
		return precio*cantidad;
	}
	
	

	
	

}
