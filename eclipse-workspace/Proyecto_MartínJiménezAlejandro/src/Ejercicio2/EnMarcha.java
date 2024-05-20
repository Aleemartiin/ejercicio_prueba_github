package Ejercicio2;

public class EnMarcha extends Estado{
	public int miEstado() {
		return Metro.EN_MARCHA;
		}
	public void siguienteEstado(Metro metro) {
		metro.setEstado(Metro.PARANDO);
		}

}
