package Ejercicio2;

public class Parando extends Estado {
	
	public int miEstado() {
		return Metro.PARANDO;
		}
	public void siguienteEstado(Metro metro) {
		metro.setEstado(Metro.PARADO);
		}

}
