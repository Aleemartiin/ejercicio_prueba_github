package sopadeletras;

import java.util.Scanner;

public class biblioteca {

	static final char esquinasupizq = '┌';
	static final char esquinasupdch = '┐';
	static final char esquinainfizq = '└';
	static final char esquinainfdch = '┘';
	static final char lineavertical = '│';
	static final char lineahorizontal = '─';

	public static char[][] GenerarSopa(char sopa[][]) {

		@SuppressWarnings("resource")
		Scanner sn = new Scanner(System.in);

		String palabra;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				sopa[i][j] = '-';
			}
		}

		for (int i = 0; i < 4; i++) {
			System.out.println("Ingrese una palabra: ");
			palabra = sn.nextLine().toUpperCase();
			if (palabra.length() <= 1 || palabra.length() > 10) {
				do {
					System.out.println("Palabra no válida. Ingrese una palabra de entre 2 y 10 crácteres: ");
					palabra = sn.nextLine().toUpperCase();
				} while (palabra.length() <= 1 || palabra.length() > 10);
			}

			boolean colocada = false;

			while (colocada == false) {
				switch (i) {
				case 0:
					colocada = colocarhorizontalnormal(sopa, palabra);
					break;
				case 1:
					colocada = colocarhorizontalinverso(sopa, palabra);
					break;
				case 2:
					colocada = colocarverticalnormal(sopa, palabra);
					break;
				case 3:
					colocada = colocarverticalinverso(sopa, palabra);
					break;
				}
			}
		}
		return sopa;
	}

	public static void visualizarsopa(char[][] sopa) {

		System.out.print(" "+esquinasupizq);
		for (int i = 0; i < 20; i++)
			System.out.print(lineahorizontal);
		System.out.println(esquinasupdch);

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 0)
					System.out.print(" "+lineavertical);
				System.out.print(sopa[i][j] + " ");
				if (j == 9)
					System.out.print(lineavertical);
			}
			System.out.println();
		}

		System.out.print(" "+esquinainfizq);
		for (int i = 0; i < 20; i++)
			System.out.print(lineahorizontal);
		System.out.println(esquinainfdch);
	}

	public static boolean colocarhorizontalnormal(char sopa[][], String palabra) {

		int fila = (int) (Math.random() * 10);
		int columna = (int) (Math.random() * 10);
		int j;
		char[] caracteres = palabra.toCharArray();

		if (columna + palabra.length() > 10) {
			return false;
		}
		for (j = columna; j < columna + palabra.length(); j++) {
			if (sopa[fila][j] != '-') {
				return false;
			}
		}
		for (j = columna; j < columna + palabra.length(); j++) {
			sopa[fila][j] = caracteres[j - columna];
		}
		return true;
	}

	public static boolean colocarhorizontalinverso(char sopa[][], String palabra) {

		int fila = (int) (Math.random() * 10);
		int columna = (int) (Math.random() * 10);
		int j, i = 0;
		char[] caracteres = palabra.toCharArray();

		if (columna - palabra.length() < 0) {
			return false;
		}
		for (j = columna; j > columna - palabra.length(); j--) {
			if (sopa[fila][j] != '-') {
				return false;
			}
		}
		for (j = columna; j > columna - palabra.length(); j--) {
			sopa[fila][j] = caracteres[i];
			i++;
		}
		return true;
	}

	public static boolean colocarverticalnormal(char sopa[][], String palabra) {

		int fila = (int) (Math.random() * 10);
		int columna = (int) (Math.random() * 10);
		int j;
		char[] caracteres = palabra.toCharArray();

		if (fila + palabra.length() > 10) {
			return false;
		}
		for (j = fila; j < fila + palabra.length(); j++) {
			if (sopa[j][columna] != '-') {
				return false;
			}
		}
		for (j = fila; j < fila + palabra.length(); j++) {
			sopa[j][columna] = caracteres[j - fila];
		}
		return true;
	}

	public static boolean colocarverticalinverso(char sopa[][], String palabra) {

		int fila = (int) (Math.random() * 10);
		int columna = (int) (Math.random() * 10);
		int j, i = 0;
		char[] caracteres = palabra.toCharArray();

		if (fila - palabra.length() < 0) {
			return false;
		}
		for (j = fila; j > fila - palabra.length(); j--) {
			if (sopa[j][columna] != '-') {
				return false;
			}
		}
		for (j = fila; j > fila - palabra.length(); j--) {
			sopa[j][columna] = caracteres[i];
			i++;
		}
		return true;
	}

	public static void rellenar(char sopa[][]) {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (sopa[i][j] == '-') {
					char letraAleatoria = (char) (Math.random() * 26 + 'A');
					sopa[i][j] = letraAleatoria;
				}
			}
		}
	}
}
