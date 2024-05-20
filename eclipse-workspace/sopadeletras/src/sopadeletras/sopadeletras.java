package sopadeletras;

import java.util.Scanner;

public class sopadeletras {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sn = new Scanner(System.in);

		char[][] sopa = new char[10][10];
		String comprobar;

		System.out.println(
				"\r\n" + "██████╗░██╗░░░██╗░█████╗░██╗░░██╗███████╗██████╗░░█████╗░      ██████╗░███████╗  \r\n"
						+ "██╔══██╗██║░░░██║██╔══██╗██║░░██║██╔════╝██╔══██╗██╔══██╗      ██╔══██╗██╔════╝  \r\n"
						+ "██████╔╝██║░░░██║██║░░╚═╝███████║█████╗░░██████╔╝██║░░██║      ██║░░██║█████╗░░  \r\n"
						+ "██╔═══╝░██║░░░██║██║░░██╗██╔══██║██╔══╝░░██╔══██╗██║░░██║      ██║░░██║██╔══╝░░  \r\n"
						+ "██║░░░░░╚██████╔╝╚█████╔╝██║░░██║███████╗██║░░██║╚█████╔╝      ██████╔╝███████╗  \r\n"
						+ "╚═╝░░░░░░╚═════╝░░╚════╝░╚═╝░░╚═╝╚══════╝╚═╝░░╚═╝░╚════╝░      ╚═════╝░╚══════╝  \r\n"
						+ "\r\n" + "██╗░░░░░███████╗████████╗██████╗░░█████╗░░██████╗\r\n"
						+ "██║░░░░░██╔════╝╚══██╔══╝██╔══██╗██╔══██╗██╔════╝\r\n"
						+ "██║░░░░░█████╗░░░░░██║░░░██████╔╝███████║╚█████╗░\r\n"
						+ "██║░░░░░██╔══╝░░░░░██║░░░██╔══██╗██╔══██║░╚═══██╗\r\n"
						+ "███████╗███████╗░░░██║░░░██║░░██║██║░░██║██████╔╝\r\n"
						+ "╚══════╝╚══════╝░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚═╝╚═════╝░");
		System.out.println("");
		System.out.println("Pulsa ENTER para comenzar");
		comprobar = sn.nextLine();
		if (comprobar == "") {

			biblioteca.GenerarSopa(sopa);
			biblioteca.visualizarsopa(sopa);
			System.out.println("Pulsa ENTER para rellenar la sopa de letras.");
			comprobar = sn.nextLine();
			if (comprobar == "") {
				biblioteca.rellenar(sopa);
				biblioteca.visualizarsopa(sopa);
			}
			

		}
	}
}
