package ejercicio1;

public class Ejercicio3 {

	public static final double porcentajeADescontar = 0.95;

	public float reducirPrecio(float precio, int descuento) {
		if (descuento == 5) {
			precio *= porcentajeADescontar;
		}
		return precio;
	}
}
