package ej3;

public abstract class Empleado {
	private String nombre;
	private int edad;
	private double salario;
	protected final double PLUS = 300;

	// constructores

	// Constructor por defecto
	public Empleado() {

	}

	// Constructor con parámetros
	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	// Constructor copia
	public Empleado(final Empleado e) {
		nombre = e.nombre;
		edad = e.edad;
		salario = e.salario;
	}

	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// método toString
	@Override
	public String toString() {
		return "Empleado nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + ", PLUS=" + PLUS;
	}

	// método plus, es abstarcto, obliga a la clases hijas a implementar este método
	public abstract boolean plus();

}
