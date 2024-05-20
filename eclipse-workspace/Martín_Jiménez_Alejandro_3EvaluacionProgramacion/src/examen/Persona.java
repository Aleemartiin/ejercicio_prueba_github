package examen;

import java.io.Serializable;
import java.util.Scanner;

public class Persona implements Serializable {

	Scanner sn = new Scanner(System.in);

	private String ident;
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean mascota;
	private String aux;

	// Constructor vacío
	public Persona() {

		System.out.print("DNI: ");
		dni = sn.nextLine();

		System.out.print("Nombre: ");
		nombre = sn.nextLine().toUpperCase();

		System.out.print("Apellidos: ");
		apellidos = sn.nextLine().toUpperCase();

		System.out.print("Edad: ");
		edad = sn.nextInt();
		sn.nextLine();

		int MascotaLleva;
		do {
			System.out.println("¿Lleva mascota?: ");
			System.out.println("1.Si ");
			System.out.println("2.No");
			MascotaLleva = sn.nextInt();
			if (MascotaLleva == 1) {
				mascota = true;
				aux = "SÍ";
			} else {
				mascota = false;
				aux = "NO";
			}
		} while (MascotaLleva != 1 && MascotaLleva != 2);

		ident = nombre.substring(0, 2) + apellidos.substring(0, 2) + dni.substring(0, 2);
	}

	// Getter
	public String getIdent() {
		return ident;
	}

	// Método toString()
	@Override
	public String toString() {
		return "Identificador: " + ident + "\n" + "Nombre: " + nombre + "\n" + "Apellidos: " + apellidos + "\n"
				+ "Edad: " + edad + "\n" + "Mascota: " + aux;
	}
}
