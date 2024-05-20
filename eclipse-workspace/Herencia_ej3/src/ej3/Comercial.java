package ej3;

public class Comercial extends Empleado {
	private double comision;

	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;

	}


	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		return super.toString() + "comision=" + comision;
	}

	public boolean plus() {
		if (super.getEdad() > 30 && this.comision > 200) {

			double nuevoSalario = super.getSalario() + super.PLUS;
			super.setSalario(nuevoSalario);
			System.out.println("El comercial " + super.getNombre() + " recibe el Plus");
			return true;
			
		} else
			return false;
	}

}
