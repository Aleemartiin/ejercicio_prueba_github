package Ejercicio2;

public class Metro {
	private Estado estado;
	protected static final int PARADO = 0;
	protected static final int ARRANCANDO = 1;
	protected static final int EN_MARCHA = 2;
	protected static final int PARANDO = 3;
	protected static final int COMPLETO = 4;
	protected static final int max = 50;

	public void siguienteEstado() {
		estado.siguienteEstado(this);
	}

	public void setEstado(int estado) {
		switch (estado) {

		case ARRANCANDO:
			this.estado = new Arrancando();
			break;
		case PARANDO:
			this.estado = new Parando();
			break;
		case EN_MARCHA:
			this.estado = new EnMarcha();
			break;
		case PARADO:
			this.estado = new Parado();
			break;
		case COMPLETO:
			this.estado = new Completo();
			break;
		default:
			this.estado = null;
			break;
		}
	}

	public int getEstado() {
		return estado.miEstado();
	}
	
	public boolean subirPersonas(int numPersonas, Metro m) {
		return (numPersonas<max && m.getEstado()==PARADO);
	}/*Creo la función subirPersonas que devuelve true en caso de que puedan subir personas y que el metro esté en el estado que lo permite (parado).*/

}
