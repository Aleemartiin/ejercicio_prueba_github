package relacion3;

import java.util.Scanner;

public class contador_main {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);

		Contador contador1 = new Contador();

		int n;
		System.out.println("Introduce valor para inicializar el contador: ");
		n = sn.nextInt();

		contador1.setCont(n);
		contador1.incrementar();
		System.out.println(contador1.getCont());

		contador1.incrementar();
		contador1.incrementar();
		System.out.println(contador1.getCont());

		contador1.decrementar();
		System.out.println(contador1.getCont());

		Contador contador2 = new Contador(10);

		contador2.incrementar();
		System.out.println(contador2.getCont());
		contador2.decrementar();
		System.out.println(contador2.getCont());

		Contador contador3 = new Contador(contador2);

		System.out.println(contador3.getCont());

		sn.close();
	}

}
