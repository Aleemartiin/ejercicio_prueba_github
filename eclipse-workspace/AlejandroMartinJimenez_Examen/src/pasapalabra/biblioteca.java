package pasapalabra;

public class biblioteca {

	public static String[][] generaMatrizJuego(String[][] palabras, String[][] definiciones) {

		String[][] juego = new String[5][2];
		int j = (int) (Math.random() * 3);

		for (int x = 0; x < 5; x++) {
			juego[x][0] = palabras[x][j];
			juego[x][1] = definiciones[x][j];
		}
		return juego;
	}

	public static int tipoRespuesta(String[][] juego, String respuesta, int i) {
		int devolv = 0;

		if (respuesta.equalsIgnoreCase(juego[i][0])) {
			System.out.println("PALABRA CORRECTA, +1 acierto");
			devolv = 1;
		} else if (respuesta.equalsIgnoreCase("pasapalabra")) {
			System.out.println("Pasapalabra, la dejamos para más adelante");
			devolv = 0;
		} else {
			System.out.println("PALABRA INCORRECTA, +1 fallo");
			juego[i][0] = "fallo";
			devolv = -1;
		}

		return devolv;
	}

	public static void puntuacion(String[][] juego) {

		int contaciertos = 0;
		int contfallos = 0;
		int contpasapalabra = 5;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {
				if (juego[i][j].equalsIgnoreCase("acierto")) {
					contaciertos++;
					contpasapalabra--;
				} else if (juego[i][j].equalsIgnoreCase("fallo")) {
					contfallos++;
					contpasapalabra--;
				}
			}
		}

		System.out.println("Llevas " + contaciertos + " aciertos, " + contfallos + " fallos y " + contpasapalabra
				+ " sin contestar.");

	}

	public static boolean finDeJuego(String[][] juego) {

		boolean fin = false;
		int contaciertos=0;
		int contfallos=0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {
				if (juego[i][j].equalsIgnoreCase("acierto")) {
					contaciertos++;
				}else if (juego[i][j].equalsIgnoreCase("fallo")) {
					contfallos++;
				}
			}
		}
		if (contaciertos+contfallos==5) {
			fin=true;
		}else {
			fin=false;
		}
		return fin;
	}

	public static boolean haGanado(String[][] juego) {

		boolean win = false;
		int contaciertos=0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {
				if (juego[i][j].equalsIgnoreCase("acierto")) {
					contaciertos++;
				}
			}
		}
		if (contaciertos==5) {
			win=true;
		}else {
			win=false;
		}
		return win;
	}
}
