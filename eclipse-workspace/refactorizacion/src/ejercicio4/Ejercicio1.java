package ejercicio4;

import java.util.Random;

public class Ejercicio1 {
	private static int aleatorio;
	public static Object temporal;
	public static final int MAX = 0;

	public void mezclar() {
		Random random = new Random();
		int i = lista.length - 1;
		while (i > 0) {
			int aleatorio;
			if (i % 2 == 0) {
				aleatorio = generarNumeroAleatorio(random, i);
			} else {
				aleatorio = generarNumeroAleatorio(random, i + 1);
			}
			Object tmp = lista[i];
			lista[i] = lista[aleatorio];
			lista[aleatorio] = tmp;
			i--;
		}
		for (Object elemento : lista) {
			if (elemento != null)
				System.out.print(elemento + " ");
			else
				System.out.print(elemento + " ");
		}
	}

	private int generarNumeroAleatorio(Random random, int limite) {
		return random.nextInt(limite);
	}
}
