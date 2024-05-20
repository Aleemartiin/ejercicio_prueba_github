package ej6;

public class Lavadora extends Electrodomestico {

	private int carga;

	final private int CARGA = 5;// Constante para la carga

	// Contructor por defecto

	public Lavadora() {
		super();
		this.carga = CARGA;
	}

	// Constructor con precio y peso

	public Lavadora(double precio, double peso) {
		super(precio, peso);
		this.carga = CARGA;
	}

	// Constructor con parámetros
	public Lavadora(double precioBase, String color, char consumo, double peso, int carga) {
		super(precioBase, color, consumo, peso);
		this.carga = carga;

	}

	// método get carga
	public int getCarga() {
		return carga;
	}

	// método precioFinal():si tiene una carga mayor de 30 kg,
	// aumentara el precio 50 €, sino es así no se incrementara el precio.

	public void precioFinal() {
		super.precioFinal();

		if (carga >= 30) {

			precioBase += 50;
		}
	}

}
