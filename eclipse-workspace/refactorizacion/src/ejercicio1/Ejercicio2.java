package ejercicio1;

public class Ejercicio2 {

	float descuento(float valor, int cantidad) {
		float res = valor;
		if (cantidad > 50) {
			res = res * 0.10f;
		}

		return res;
	}

}
