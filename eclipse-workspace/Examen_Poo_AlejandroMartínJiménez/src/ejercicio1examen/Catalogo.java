package ejercicio1examen;

import java.util.Scanner;

public class Catalogo {
	private Pelicula[] peliculas;
	private int contador;

	public Catalogo() {
		this.peliculas = new Pelicula[3];
		this.contador = 0;
	}

	public boolean agregarPelicula(Pelicula p) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Agregar nueva película:");
		System.out.print("Título: ");
		String titulo = sn.nextLine();
		System.out.print("Director: ");
		String director = sn.nextLine();
		System.out.print("Año de lanzamiento: ");
		int anio = sn.nextInt();
		sn.nextLine();
		System.out.print("Género: ");
		String genero = sn.nextLine();

		p = new Pelicula(titulo, director, anio, genero);
		
		peliculas[contador] = p;
		contador++;
		System.out.println("Película agregada con éxito.");
		System.out.println("");

		sn.close();

		return true;
	}

	public void listarPeliculas() {
		System.out.println("Listado de películas:");
		for (int i = 0; i < contador; i++) {
			System.out.println("Película #" + (i + 1) + ":");
			System.out.println("Título: " + peliculas[i].getTitulo());
			System.out.println("Director: " + peliculas[i].getDirector());
			System.out.println("Año de lanzamiento: " + peliculas[i].getAnio());
			System.out.println("Género: " + peliculas[i].getGenero());
			System.out.println("");
		}
	}

	public Pelicula[] buscarPeliculas(String cadenaABuscar, String campo) {
		Pelicula[] peliculasEncontradas = new Pelicula[3];
		int indice = 0;

		for (int i = 0; i < contador; i++) {
			switch (campo) {
			case "DIR":
				if (peliculas[i].getDirector().toLowerCase().contains(cadenaABuscar.toLowerCase())) {
					peliculasEncontradas[indice] = peliculas[i];
					indice++;
				}
				break;
			case "TIT":
				if (peliculas[i].getTitulo().toLowerCase().contains(cadenaABuscar.toLowerCase())) {
					peliculasEncontradas[indice] = peliculas[i];
					indice++;
				}
				break;
			case "GEN":
				if (peliculas[i].getGenero().equalsIgnoreCase(cadenaABuscar)) {
					peliculasEncontradas[indice] = peliculas[i];
					indice++;
				}
				break;
			case "ANO":
				if (peliculas[i].getAnio() == Integer.parseInt(cadenaABuscar)) {
					peliculasEncontradas[indice] = peliculas[i];
					indice++;
				}
				break;
			}
		}
		return peliculasEncontradas;
	}

}