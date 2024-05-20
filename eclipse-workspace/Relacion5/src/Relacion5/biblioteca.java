package Relacion5;

public class biblioteca {

	public static boolean esCapicua(int num) {

		int inverso = 0, cifra;
		boolean esCapicua;

		while (num != 0) {
			cifra = num % 10;
			inverso = inverso * 10 + cifra;
			num = num / 10;
		}

		if (num == inverso) {
			esCapicua = true;
		} else {
			esCapicua = false;
		}
		return esCapicua;
	}

	public static boolean esPrimo(int num) {
		int cont = 0;
		boolean esPrimo = true;

		if (num <= 1) {
			esPrimo = false;
		}
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				cont++;
			}
			if (cont > 1) {
				esPrimo = false;
			} else {
				esPrimo = true;
			}
		}
		return esPrimo;

	}

	public static int siguientePrimo(int num) {

		int candidato = num + 1;

		while (true) {
			if (esPrimo(candidato)) {
				return candidato;
			}
			candidato++;
		}
	}

	public static int potencia(int base, int exponente) {

		return (int) Math.pow(base, exponente);

	}

	public static int digitos(int num) {

		int cont = 0;

		while (num != 0) {
			num = num / 10;
			cont++;
		}
		return cont;
	}
	
	public static int voltea(int num) {

		int numeroInvertido = 0;

        while (num != 0) {
            int digito = num % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            num = num / 10;
        }

        return numeroInvertido;
	}
	
	public static int digitoN(int num) {

		int numeroInvertido = 0;

        while (num != 0) {
            int digito = num % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            num = num / 10;
        }
        

        return numeroInvertido;
	}

}
