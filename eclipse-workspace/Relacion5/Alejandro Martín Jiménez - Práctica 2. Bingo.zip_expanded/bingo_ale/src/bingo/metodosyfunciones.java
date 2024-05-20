package bingo;

public class metodosyfunciones {

//BIENVENIDA
	public static void bienvenida() {
		System.out.println("Bienvenido al Bingo!");
		System.out.println("----------PREMIOS---------");
		System.out.println("LÍNEA: 100$");
		System.out.println("BINGO: 500$");
		System.out.println("--------------------------");
	}

// GENERAR CARTON
	public static int[][] generarcartones() {
		int[][] carton = new int[3][5];
		int i;
		for (i = 0; i < 3; i++) {
			carton[i][0] = (int) (Math.random() * 9 + 1);
		}
		for (i = 0; i < 3; i++) {
			carton[i][1] = (int) (Math.random() * 9 + 10);
		}
		for (i = 0; i < 3; i++) {
			carton[i][2] = (int) (Math.random() * 9 + 20);
		}
		for (i = 0; i < 3; i++) {
			carton[i][3] = (int) (Math.random() * 9 + 30);
		}
		for (i = 0; i < 3; i++) {
			carton[i][4] = (int) (Math.random() * 9 + 40);
		}
		return carton;
	}

// PINTAR CARTON
	public static void pintarcarton(int[][] carton) {
		for (int fila = 0; fila < 3; fila++) {
			for (int columna = 0; columna < 5; columna++) {
				if (columna == 0) {
					if (carton[fila][columna] == 0) {
						System.out.printf("|%2s ", "X");
					} else {
						System.out.printf("|%2d ", carton[fila][columna]);
					}
				} else {
					if (carton[fila][columna] == 0) {
						System.out.printf("| %2s ", "X");
					} else {
						System.out.printf("| %2d ", carton[fila][columna]);
					}
				}
			}
			System.out.println("|");
		}
	}

// COMPROBAR SI ESTÁ EL NÚMERO
	public static void comprobarnumero(int[][] carton1, int[][] carton2, int aux) {
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 5; y++) {
				if (aux == carton1[x][y]) {
					carton1[x][y] = 0;
				}
				if (aux == carton2[x][y]) {
					carton2[x][y] = 0;
				}
			}
		}
	}

//COMPROBAR LÍNEA
	public static int comprobarlinea(int[][] carton1, int[][] carton2, int checklinea) {
		int cont1 = 0, cont2 = 0, cont3 = 0, y1 = 0, y2 = 0, y3 = 0;

		for (int i = 0; i < 5; i++) {
			if (carton1[0][i] == 0) {
				cont1++;
			}
			if (carton1[1][i] == 0) {
				cont2++;
			}
			if (carton1[2][i] == 0) {
				cont3++;
			}
		}
		for (int i = 0; i < 5; i++) {
			if (carton2[0][i] == 0) {
				y1++;
			}
			if (carton2[1][i] == 0) {
				y2++;
			}
			if (carton2[2][i] == 0) {
				y3++;
			}
		}
		if (cont1 == 5 | cont2 == 5 | cont3 == 5 && y1 == 5 | y2 == 5 | y3 == 5 && checklinea == 0) {
			System.out.println("EMPATE! La línea se ha conseguido a la vez.");
			System.out.println("Cada jugador obtiene un premio de 50$");
			System.out.println("");
			System.out.println("");
			checklinea = 3;
		} else {
			if (cont1 == 5 | cont2 == 5 | cont3 == 5 && checklinea == 0) {
				System.out.println("ENHORABUENA! EL JUGADOR 1 HA LOGRADO LA LÍNEA!");
				System.out.println("Obtiene un premio de 100$");
				System.out.println("");
				System.out.println("");
				checklinea = 1;
			}
			if (y1 == 5 | y2 == 5 | y3 == 5 && checklinea == 0) {
				System.out.println("ENHORABUENA! EL JUGADOR 2 HA LOGRADO LA LÍNEA!");
				System.out.println("Obtiene un premio de 100$");
				System.out.println("");
				System.out.println("");
				checklinea = 2;
			}
		}
		return checklinea;
	}

	public static int comprobarbingo(int[][] carton1, int[][] carton2, int checkbingo) {
		int contjugador1 = 0;
		int contjugador2 = 0;
		int i, j;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 5; j++) {
				if (carton1[i][j] == 0) {
					contjugador1++;
				}
			}
		}
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 5; j++) {
				if (carton2[i][j] == 0) {
					contjugador2++;
				}
			}
		}
		if (contjugador1 == 15 && contjugador2 == 15 && checkbingo == 0) {
			System.out.println("EMPATE! El Bingo se ha conseguido a la vez.");
			System.out.println("Cada jugador obtiene un premio de 250$");
			System.out.println("");
			System.out.println("");
			checkbingo = 3;
		} else {
			if (contjugador1 == 15 && checkbingo == 0) {
				System.out.println("ENHORABUENA! EL JUGADOR 1 HA LOGRADO EL BINGO!");
				System.out.println("Obtiene un premio de 500$");
				System.out.println("");
				System.out.println("");
				checkbingo = 1;
			}
			if (contjugador2 == 15 && checkbingo == 0) {
				System.out.println("ENHORABUENA! EL JUGADOR 2 HA LOGRADO EL BINGO!");
				System.out.println("Obtiene un premio de 500$");
				System.out.println("");
				System.out.println("");
				checkbingo = 2;
			}
		}
		return checkbingo;
	}

	public static void resumen(int checkbingo, int checklinea, int[][] carton1, int[][] carton2) {
		int premiojug1 = 0, premiojug2 = 0;
		if (checklinea == 1) {
			premiojug1 = premiojug1 + 100;
		} else if (checklinea == 2) {
			premiojug2 = premiojug2 + 100;
		} else if (checklinea == 3) {
			premiojug1 = premiojug1 + 50;
			premiojug2 = premiojug2 + 50;
		}
		if (checkbingo == 1) {
			premiojug1 = premiojug1 + 500;
		} else if (checkbingo == 2) {
			premiojug2 = premiojug2 + 500;
		} else if (checkbingo == 3) {
			premiojug1 = premiojug1 + 250;
			premiojug2 = premiojug2 + 250;
		}
		System.out.println("El juego ha terminado, esto son los premios acumulados:");
		System.out.println("----------------------------");
		System.out.println("     JUGADOR 1: " + premiojug1 + "$");
		metodosyfunciones.pintarcarton(carton1);
		System.out.println("----------------------------");
		System.out.println("     JUGADOR 2: " + premiojug2 + "$");
		metodosyfunciones.pintarcarton(carton2);
		System.out.println("----------------------------");

	}
}