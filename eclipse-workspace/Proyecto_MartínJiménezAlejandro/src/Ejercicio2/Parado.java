package Ejercicio2;

public class Parado extends Estado {

	public int miEstado() {
		return Metro.PARADO;
	}

	public void siguienteEstado(Metro metro) {
		metro.setEstado(Metro.COMPLETO);
	}

}
