package examen;

import java.io.Serializable;

public class Viaje implements Serializable {
	private static int numViaje = 1;
	private String ident;
	private Persona conductor;
	private String origen;
	private String destino;
	private FechaYHora fechaYHora;
	private double precio;
	private Persona[] ocupantes;
	private int plazaVacia;

	// Constructor con parámetros
	public Viaje(Persona conductor, String origen, String destino, FechaYHora fechaYHora, double precio) {
		this.ident = "viaje" + numViaje++;
		this.conductor = conductor;
		this.origen = origen.toUpperCase();
		this.destino = destino.toUpperCase();
		this.fechaYHora = fechaYHora;
		this.precio = precio;
		this.ocupantes = new Persona[4];
		this.plazaVacia = 0;
	}

	// Getters
	public String getIdent() {
		return ident;
	}

	public String getOrigen() {
		return origen;
	}

	public String getDestino() {
		return destino;
	}

	// Método para añadir una persona al viaje
	public boolean anyadirPersona() {
		if (plazaVacia < ocupantes.length) {
			Persona nuevoOcupante = new Persona();
			ocupantes[plazaVacia] = nuevoOcupante;
			plazaVacia++;
			return true;
		} else {
			return false;
		}
	}

	// Método para encontrar la posición de una persona en el array
	public int posicionPersonaEnVector(String identificador) {
		identificador = identificador.toUpperCase();
		for (int i = 0; i < plazaVacia; i++) {
			if (ocupantes[i].getIdent().equals(identificador)) {
				return i;
			}
		}
		return -1;
	}

	// Método para eliminar una persona del viaje
	public boolean eliminarPersonaEnViaje(String identificador) {
		int posicion = posicionPersonaEnVector(identificador);
		if (posicion != -1) {
			for (int i = posicion; i < plazaVacia - 1; i++) {
				ocupantes[i] = ocupantes[i + 1];
			}
			ocupantes[plazaVacia - 1] = null;
			plazaVacia--;
			return true;
		} else {
			return false;
		}
	}

	// Método para mostrar las personas del viaje
	public void muestraPersonasViaje() {
		for (int i = 0; i < plazaVacia; i++) {
			System.out.println(ocupantes[i]);
		}
	}

	// Método toString()
	@Override
	public String toString() {
		return "Identificador: " + ident + "\n" + "Conductor: " + conductor.getIdent() + "\n" + "Origen: " + origen
				+ "\n" + "Destino: " + destino + "\n" + fechaYHora.toString() + "\n" + "Precio: " + precio + "\n"
				+ "Plazas libres: " + (ocupantes.length - plazaVacia);
	}
}
