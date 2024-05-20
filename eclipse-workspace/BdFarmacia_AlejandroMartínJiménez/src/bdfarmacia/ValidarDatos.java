package bdfarmacia;

import java.util.ArrayList;
import java.util.Scanner;

public class ValidarDatos {
	
	private static Scanner sn = new Scanner(System.in);

	public ValidarDatos() {
		// Constructor vacío
	}

	// Método para validar un DNI
	public static boolean validarNif(String nif) {
		if (nif.length() != 9) {
			return false;
		}

		int auxNumNif = Integer.parseInt(nif.substring(0, 8));
		String ultCaracter = nif.substring(8).toUpperCase();

		char letra = calcularLetraNif(auxNumNif);

		return letra == ultCaracter.charAt(0);
	}
	
	public static boolean clienteRepetido(String id, ArrayList<Cliente> clientes) {
	    for (Cliente cliente : clientes) {
	        if (cliente.getId().equalsIgnoreCase(id)) {
	            return true;
	        }
	    }
	    return false;
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
            System.out.println("El valor no puede estar vacío.");
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
                sn.nextLine();
            }
            return numero;
        }
    
    public static double validarDouble(double numero) {
        while (numero <= 0) {
            System.out.print("Por favor, ingrese un valor positivo: ");
            numero = sn.nextDouble();
            sn.nextLine();
        }
        return numero;
    }
}