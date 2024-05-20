package bingo;

import java.util.Scanner;

public class bingo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sn = new Scanner(System.in);
		int checklinea = 0;
		int checkbingo = 0;
//BIENVENIDA
		metodosyfunciones.bienvenida();
		System.out.println("Pulsa ENTER para continuar");
		String enter = sn.nextLine();
		/* PULSA ENTER PARA CONTINUAR */
		if (enter == "") {
//GENERAR CARTON PLAYER1
			metodosyfunciones.generarcartones();
			int[][] carton1 = metodosyfunciones.generarcartones();
			System.out.println("-------------------------");
			System.out.println("");
			System.out.println("Cartón del jugador 1");
			System.out.println("");
			System.out.println("-------------------------");
//PINTAR CARTON PLAYER1
			metodosyfunciones.pintarcarton(carton1);
//GENERAR CARTON PLAYER2
			metodosyfunciones.generarcartones();
			int[][] carton2 = metodosyfunciones.generarcartones();
			System.out.println("-------------------------");
			System.out.println("");
			System.out.println("Cartón del jugador 2");
			System.out.println("");
			System.out.println("-------------------------");
//PINTAR CARTON PLAYER1
			metodosyfunciones.pintarcarton(carton2);
			System.out.println("-------------------------");
//GENERAR NUMERO ALEATORIO
			int[] numero = new int[49];
			int i;
			int j;
			boolean repetido;
			for (i = 0; i < numero.length; i++) {
				if (checkbingo == 0) {
					do {
						repetido = false;
						numero[i] = (int) (Math.random() * 49 + 1);
						for (j = 0; j < i; j++) {
							if (numero[i] == numero[j] && i != j) {
								repetido = true;
							}
						}
					} while (repetido == true);
					System.out.println("Presiona ENTER para mostrar el siguiente número.");
					String enter2 = sn.nextLine();
					if (enter2 == "") {
						System.out.println("Ha salido el número " + numero[i]);
						int aux = numero[i];
						System.out.println("");
//COMPROBAR SI EL JUGADOR TIENE ESE NÚMERO/LÍNEA/BINGO
						metodosyfunciones.comprobarnumero(carton1, carton2, aux);
						System.out.println("Cartón del jugador 1");
						metodosyfunciones.pintarcarton(carton1);
						System.out.println("");
						System.out.println("Cartón del jugador 2");
						metodosyfunciones.pintarcarton(carton2);
						System.out.println("");
						checklinea = metodosyfunciones.comprobarlinea(carton1, carton2, checklinea);
						metodosyfunciones.comprobarlinea(carton1, carton2, checklinea);
						checkbingo = metodosyfunciones.comprobarbingo(carton1, carton2, checkbingo);
						metodosyfunciones.comprobarbingo(carton1, carton2, checkbingo);
					}
				}
			}
//RESUMEN PARTIDA
			if (checkbingo != 0) {
				metodosyfunciones.resumen(checkbingo, checklinea, carton1, carton2);
			}
		}
	}
}