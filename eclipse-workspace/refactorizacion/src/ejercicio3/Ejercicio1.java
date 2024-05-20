package ejercicio3;

public class Ejercicio1 {

	public void calcularEnvio(float precio) {
		if (esPrecioEspecial(precio)) {
			precio *= 0.95;
		} else {
			precio *= 0.98;
		}
		enviar(precio);
	}

}
