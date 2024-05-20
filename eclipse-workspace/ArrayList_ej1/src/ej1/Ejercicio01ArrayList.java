package ej1;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01ArrayList {

	public static Scanner sn = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Double> alturas = new ArrayList<Double>();

		int numeroAl = numeroAlumnos();


		leerAlturas(alturas, numeroAl);
		
		
		System.out.println(alturas);
		

		System.out.println("La media de la alturas es: " + calcularMedias(alturas));
		
		
		mostrarResultados(alturas);
		
		

	}

	public static void leerAlturas(ArrayList<Double> array, int numAl) {

		double alt;

		for (int i = 0; i < numAl; i++) {
			System.out.println("Introduce la altura del alumno " + (i + 1));
			alt = sn.nextDouble();
			array.add(alt);

		}

	}

	public static int numeroAlumnos() {

		int n = 0;

		System.out.println("Introduce el n�mero de alumnos ");
		n = sn.nextInt();

		return n;

	}

	public static double calcularMedias(ArrayList<Double> array) {

		double suma = 0;
		for (int i = 0; i < array.size(); i++) {
			suma = suma + array.get(i);
		}

		return suma / array.size();
	}
	
	public static void mostrarResultados(ArrayList<Double> array) {
		
		double media=calcularMedias(array);
		int encimaMedia=0;
		int debajoMedia=0;
		int igualMedia=0;
		
		for (int i = 0; i < array.size(); i++) {
			
			if (array.get(i)==media) {
				igualMedia++;
				
			}else if(array.get(i)>media)
			{
				
				encimaMedia++;
			}else {
				debajoMedia++;
			}
		}
		
		System.out.println(" El n�mero de alunmos igual a la media es : "+igualMedia);
		System.out.println(" El n�mero de alunmos debajo de la media es : "+debajoMedia);
		System.out.println(" El n�mero de alunmos encima de la media es : "+encimaMedia);
		
		
	}

}
