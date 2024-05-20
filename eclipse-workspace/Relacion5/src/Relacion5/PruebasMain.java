package Relacion5;

import java.util.Scanner;

public class PruebasMain {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sn = new Scanner(System.in);
		
		int num, siguientePrimo;
		boolean esCapicua, esPrimo;
		
		System.out.println("Introduce un número: ");
		num = sn.nextInt();
		
		esCapicua=biblioteca.esCapicua(num);
		
		esPrimo=biblioteca.esPrimo(num);
		
		siguientePrimo=biblioteca.siguientePrimo(num);

		

	}

}
