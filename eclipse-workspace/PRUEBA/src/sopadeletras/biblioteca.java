package sopadeletras;
//import java.util.Scanner;
public class biblioteca {
	static final char esquinasupizq = '┌';
	static final char esquinasupdch = '┐';
	static final char esquinainfizq = '└';
	static final char esquinainfdch = '┘';
	static final char lineavertical = '│';
	static final char lineahorizontal = '─';
	
	
	
	
	public static char[][] GenerarSopa(char sopa[][], String palabra, int i) {
//		@SuppressWarnings("resource")
//		Scanner sn = new Scanner(System.in);
      
      

      
          
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
	
	
	
	
	
	
	
	
	
		public static int comprobarPalabra(char[][] sopa, String palabras[], String palabraComprobar, int contador) {
			for (int e=0 ; e<4; e++) {
	       
			if (palabras[e].equals(palabraComprobar)) {

				contador++;
				
				System.out.println("Correcto! La palabra introducida si está en la sopa");
				

				char [] palabracomprobarchar=palabraComprobar.toCharArray();
			
				comprobarPalabraHorizontalNormal(sopa, palabracomprobarchar);
				comprobarPalabraHorizontalInversa(sopa, palabracomprobarchar);
				comprobarPalabraVerticalNormal(sopa, palabracomprobarchar);
				comprobarPalabraVerticalInversa(sopa, palabracomprobarchar);
				
				biblioteca.visualizarsopa(sopa);
				
			}
			else {
				System.out.println("Esa palabra no se encuentra en la sopa.");
			}
				
			}
			return contador;
				
			}
		
		public static char [][] comprobarPalabraHorizontalNormal(char[][] sopa, char [] palabracomprobarchar) {
			
			for (int i = 0; i < sopa.length; i++) {
				for (int j = 0; j < sopa[0].length - 1; j++) {
					if (sopa[i][j] == palabracomprobarchar[0] && sopa[i][j + 1] == palabracomprobarchar[1]
							&& sopa[i][j + 2] == palabracomprobarchar[2]) {
						for (int k = j; k < (j+ palabracomprobarchar.length) && k < (sopa[0].length-1); k++) {
							sopa[i][k] = '-';
						}
					}
				}
			}
			return sopa;
			
	    }
  
		public static char [][] comprobarPalabraHorizontalInversa(char[][] sopa, char [] palabracomprobarchar) {
			
			for (int i = 0; i<sopa.length; i++) {
				for (int j = sopa[0].length-1; j >= 1; j--) {
					if (sopa[i][j] == palabracomprobarchar[0] && sopa[i][j - 1] == palabracomprobarchar[1]
							&& sopa[i][j - 2] == palabracomprobarchar[2]) {
						for (int k = j; k >= (j-palabracomprobarchar.length+1) && k >= 0; k--) {
							sopa[i][k] = '-';
						}

					}
				}
			}
			return sopa;
			
	    }
	
		public static char [][] comprobarPalabraVerticalNormal(char[][] sopa, char [] palabracomprobarchar) {
			
			for (int j = 0; j < sopa[0].length; j++) {
				for (int i = 0; i < sopa.length-1; i++) {
					if (sopa[i][j] == palabracomprobarchar[0] && sopa[i + 1][j] == palabracomprobarchar[1]
						&& sopa[i + 2][j] == palabracomprobarchar[2]) {
						for (int k = i; k < (i+palabracomprobarchar.length) && k < (sopa.length-1); k++) {
							sopa[k][j] = '-';
						}
					}
				}
			}
			return sopa;
			
	    }
		
		public static char [][] comprobarPalabraVerticalInversa(char[][] sopa, char [] palabracomprobarchar) {
			
			for (int j = 0; j < sopa[0].length; j++) {
				for (int i = sopa.length - 1; i >= 1; i--) {
					if (sopa[i][j] == palabracomprobarchar[0] && sopa[i - 1][j] == palabracomprobarchar[1]
							&& sopa[i - 2][j] == palabracomprobarchar[2]) {
						for (int k = i; k > (i-palabracomprobarchar.length) && k >= 0; k--) {
							sopa[k][j] = '-';
						}
					}
				}
			}
			return sopa;
			
	    }
	
	
	
	
	
	
	
	
	
}
