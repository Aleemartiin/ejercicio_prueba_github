package Ejercicio2;

public class Completo extends Estado {

	public int miEstado() {
		return Metro.COMPLETO;
	}

	public void siguienteEstado(Metro metro) {
		metro.setEstado(Metro.ARRANCANDO);
	}

}
/*Creo la clase Completo al igual que el resto de estados.*/