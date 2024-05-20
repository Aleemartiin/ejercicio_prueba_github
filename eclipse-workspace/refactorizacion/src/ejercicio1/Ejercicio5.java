package ejercicio1;

public class Ejercicio5 {

	private float tarifa;

	public float calcularTarifa(String tipoUsuario, int edad) {
		
		if (tipoUsuario.equals("alumno") || (edad < 18)) {
			tarifa = 4.5f;
		} else {
			tarifa = 8.5f;
		}
		return tarifa;
	}
}
