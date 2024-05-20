package pasapalabra;

import java.util.Scanner;

public class pasapalabra {

	public static void main(String[] args) {

		String[][] palabras = new String[5][3];
		String[][] definiciones = new String[5][3];
		String[][] juego = new String[5][2];
		Scanner sn = new Scanner(System.in);
		String respuesta;
		int devolv, i = 0;
		boolean fin = false, win = false;

		palabras[0] = new String[] { "arbol", "asturias", "austero" };
		palabras[1] = new String[] { "elemental", "elenco", "estuche" };
		palabras[2] = new String[] { "ion", "instancia", "ilogico" };
		palabras[3] = new String[] { "ovalado", "obsesion", "oscuro" };
		palabras[4] = new String[] { "union", "ukelele", "usted" };

		definiciones[0] = new String[] { "planta perenne, de tronco leñoso y elevado",
				"region del norte de España cuya capital es Oviedo", "sobrio, sin excesos" };
		definiciones[1] = new String[] { "fundamental, primordial", "conjunto de actores que actúan en una obra",
				"caja para guardar ordenadamente un objeto o varios" };
		definiciones[2] = new String[] { "átomo que por pérdida o ganancia de electrones adquiere carga eléctrica",
				"acción y efecto de instar", "que es contrario a la lógica" };
		definiciones[3] = new String[] { "de forma de óvalo", "no es amor, es una...", "que carece de luz o claridad" };
		definiciones[4] = new String[] { "acción y efecto de unir o unirse",
				"instrumento musical de cuerda originario de Hawaii", "tú, pero con tratamiento de cortesía" };

		juego = biblioteca.generaMatrizJuego(palabras, definiciones);
		System.out.println("-------------------------------------BIENVENDIO A PASAPALABRA VOCALES-------------------------------------");

		do{

			for (i = 0; i < 5; i++) {
				if (!(juego[i][0].equalsIgnoreCase("acierto")) && !(juego[i][0].equalsIgnoreCase("fallo"))) {
					switch (i) {
					case 0:
						System.out.println("Con la a:");
						break;
					case 1:
						System.out.println("Con la e:");
						break;
					case 2:
						System.out.println("Con la i:");
						break;
					case 3:
						System.out.println("Con la o:");
						break;
					case 4:
						System.out.println("Con la u:");
						break;

					}
					System.out.println(juego[i][1]);
					respuesta = sn.nextLine();

					devolv = biblioteca.tipoRespuesta(juego, respuesta, i);

					if (devolv == 1) {
						juego[i][0] = "acierto";
					} else if (devolv == -1) {
						juego[i][0] = "fallo";
					} else if (devolv == 0) {

					}
					biblioteca.puntuacion(juego);
					System.out.println("");

				}

			}
			fin = biblioteca.finDeJuego(juego);
		}while (fin == false) ;

		win = biblioteca.haGanado(juego);
		if (win == true) {
			System.out.println("ENHORABUENA, HAS GANADO!!!!");
		} else {
			System.out.println("LO SIENTO, HAS PERDIDO.....");
		}

		sn.close();
	}

}
