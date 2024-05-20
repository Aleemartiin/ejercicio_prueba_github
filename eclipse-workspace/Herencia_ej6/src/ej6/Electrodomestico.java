package ej6;

public class Electrodomestico {

	// Atributos que se pueden heredar

	protected double precioBase;
	protected String color;
	protected char consumo;
	protected double peso;

	// Usar constantes para los valores por defecto

	final protected double PRECIOBASE = 100;
	final protected String COLOR = "blanco";
	final protected char CONSUMO = 'F';
	final protected double PESO = 5;

	// Constructor por defecto.
	// Si no le doy valores toma como valores iniciales las constantes definidas en
	// la clase

	public Electrodomestico() {
		this.precioBase = PRECIOBASE;
		this.color = COLOR;
		this.consumo = CONSUMO;
		this.peso = PESO;
	}

	// Constructor con precio y peso. El resto por defecto

	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLOR;
		this.consumo = CONSUMO;
		this.peso = peso;
	}

	// Constructor con par�metros

	public Electrodomestico(double precioBase, String color, char consumo, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
		comprobarColor(color);
		comprobarConsumoEnergetico(consumo);
	}

	// Getter y setters de todos los atributos
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	// m�todo comprobarConsumoEnerg�tico

	private void comprobarConsumoEnergetico(char letra) {
		if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {

			consumo=letra;
		} else {
			consumo= CONSUMO;
		}
	}

	// m�todocomprobarColor(String color): comprueba que el color es correcto,
	// sino lo es usa el color por defecto. Se invocara al crear el objeto y no sera
	// visible.
	// colores:blanco, negro, rojo, azul y gris

	private void comprobarColor(String color) {

		String aux = color.toLowerCase();
		switch (aux) {
		case "negro":
		case "rojo":
		case "azul":
		case "gris":
			this.color= color;
		default:
			this.color= COLOR;
		}
	}

	// m�todo precioFinal(): seg�n el consumo energ�tico, aumentara su precio,
	// y seg�n su tama�o, tambi�n. Esta es la lista de precios:

	public void precioFinal() {

		switch (consumo) {
		case 'A':
			precioBase += 100;
			break;
		case 'B':
			precioBase += 80;
			break;
		case 'C':
			precioBase += 60;
			break;
		case 'D':
			precioBase += 50;
			break;
		case 'E':
			precioBase += 30;
			break;
		case 'F':
			precioBase += 10;
			break;

		}

		if (peso > 0 && peso <= 19) {

			precioBase += 10;
		}
		if (peso > 19 && peso <= 49) {

			precioBase += 50;
		}
		if (peso > 49 && peso <= 799) {

			precioBase += 80;
		}
		if (peso >=80 ) {

			precioBase += 100;
		}

	}

}
