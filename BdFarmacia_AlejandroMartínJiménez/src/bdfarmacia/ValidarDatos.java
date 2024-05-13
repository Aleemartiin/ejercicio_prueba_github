package bdfarmacia;

import java.util.Scanner;

public class ValidarDatos {
	
	private static Scanner sn = new Scanner(System.in);

	public ValidarDatos() {
		// Constructor vacío
	}

	// Método para validar un NIF (Número de Identificación Fiscal)
	public static boolean validarNif(String nif) {
		if (nif.length() != 9) {
			return false;
		}

		int auxNumNif = Integer.parseInt(nif.substring(0, 8));
		String ultCaracter = nif.substring(8).toUpperCase();

		char letra = calcularLetraNif(auxNumNif);

		return letra == ultCaracter.charAt(0);
	}

	// Método para calcular la letra de un NIF
	private static char calcularLetraNif(int dni) {
		String letrasNif = "TRWAGMYFPDXBNJZSQVHLCKE";
		int resto = dni % 23;
		return letrasNif.charAt(resto);
	}
	
	// Función para validar si un String no está vacío
    public static String validarString(String cadena) {
        while (cadena == null || cadena.trim().isEmpty()) {
            System.out.println("Error: El valor no puede estar vacío.");
            System.out.print("Por favor, ingrese nuevamente: ");
            cadena = sn.nextLine();
        }
        return cadena;
    }

    // Función para validar si un Integer no está vacío y no es cero
    public static int validarInt(int numero) {
        while (numero <= 0) {
            System.out.print("Por favor, ingrese un valor positivo: ");
            numero = sn.nextInt();
            sn.nextLine(); // Consumir la nueva línea después de nextInt()
        }
        return numero;
    }
}