package ej2;

public abstract class Polígono {

	public abstract double area();
	int numlados;

	public Polígono() {
		
	}
	
	public Polígono(int numlados) {
		this.numlados = numlados;
	}

	public double getnumlados() {
		return numlados;
	}

	public void setArea(int numlados) {
		this.numlados = numlados;
	}

	@Override
	public String toString() {
		return "Polígono [numlados=" + numlados + "]";
	}

}
