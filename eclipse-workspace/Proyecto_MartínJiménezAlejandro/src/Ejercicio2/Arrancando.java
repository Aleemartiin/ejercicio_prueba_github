package Ejercicio2;

public class Arrancando extends Estado {
	public int miEstado() {
		return Metro.ARRANCANDO;
		}
	public void siguienteEstado(Metro metro) {
		metro.setEstado(Metro.EN_MARCHA);
		}
}
