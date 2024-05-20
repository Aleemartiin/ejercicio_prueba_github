package ejercicio1examen;

import java.util.Scanner;

public class Prueba_catalogo {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Catalogo catalogo = new Catalogo();

		for (int i = 0; i < 3; i++) {
			Pelicula pelicula = new Pelicula("", "", 1900, "");
			catalogo.agregarPelicula(pelicula);
		}

		catalogo.listarPeliculas();

		System.out.println("\nBuscar películas:");
		System.out.println("1. Por título");
		System.out.println("2. Por director");
		System.out.println("3. Por género");
		System.out.println("4. Por año");
		System.out.print("Elige una opción (1,2,3,4): ");
		int opcion = sn.nextInt();
		sn.nextLine();

		String cadenaABuscar;
		String campo = "";

		switch (opcion) {
		case 1:
			System.out.print("Introduce el título a buscar: ");
			cadenaABuscar = sn.nextLine();
			campo = "TIT";
			break;
		case 2:
			System.out.print("Introduce el director a buscar: ");
			cadenaABuscar = sn.nextLine();
			campo = "DIR";
			break;
		case 3:
			System.out.print("Introduce el género a buscar: ");
			cadenaABuscar = sn.nextLine();
			campo = "GEN";
			break;
		case 4:
			System.out.print("Introduce el año a buscar: ");
			cadenaABuscar = sn.nextLine();
			campo = "ANO";
			break;
		default:
			System.out.println("Opción no válida.");

			sn.close();

			return;
		}

		Pelicula[] peliculasEncontradas = catalogo.buscarPeliculas(cadenaABuscar, campo);

		System.out.println("\nPelículas encontradas:");

		for (int i = 0; i < peliculasEncontradas.length; i++) {

			if (peliculasEncontradas[i] != null) {

				System.out.println("Título: " + peliculasEncontradas[i].getTitulo());
				System.out.println("Director: " + peliculasEncontradas[i].getDirector());
				System.out.println("Año de lanzamiento: " + peliculasEncontradas[i].getAnio());
				System.out.println("Género: " + peliculasEncontradas[i].getGenero());
				System.out.println("");

			}
		}

		sn.close();

	}
}