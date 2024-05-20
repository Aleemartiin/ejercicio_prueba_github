package crud;

import java.util.Scanner;

public class Main {
	
	/*
	 * https://codeshare.io/r9pzKv
	 */
	
	private static Scanner SCANNER_ENTEROS = new Scanner(System.in);
	private static Scanner SCANNER = new Scanner(System.in);
	private static Disco[] COLECCION = new Disco[10];
	private static int CONTADOR = 0;
	
	public static void main(String[] args) {
		// Rellenar el array con discos libres
		for (int i = 0; i < COLECCION.length; i++) {
			COLECCION[i] = new Disco();
		}
		mostrarMenu();
	}
	
	public static void mostrarMenu() {
		
		int opcion = 0;
		
		while (opcion != 5) {
			
			opcion = 0;
			
			while(opcion < 1 || opcion > 5) {
				System.out.println("COLECCIÓN DE DISCOS\r\n"
						+ "===================\r\n"
						+ "1.  Listado.\r\n"
						+ "2.  Nuevo Disco.\r\n"
						+ "3.  Modificar.\r\n"
						+ "4.  Borrar.\r\n"
						+ "5.  Salir.");
				
				System.out.print("Opcion (1-5): ");
				opcion = SCANNER_ENTEROS.nextInt();
			}
			
			switch(opcion) {
				case 1:
					listarColeccion();
					break;
				case 2:
					nuevoDisco();
					break;
				case 3:
					modificarDisco();
					break;
				case 4:
					borrarDisco();
					break;
			}
		}
	}
	
	public static void listarColeccion() {
		System.out.println("\nDiscos en la colección:");
		for (int i = 0; i < COLECCION.length; i++) {
			if (!COLECCION[i].getCodigo().equals("LIBRE")) {
				System.out.println("- "+ COLECCION[i].toString());
			}
		}
		System.out.println();
	}
	
	public static void nuevoDisco() {
		
		System.out.print("\nCodigo: ");
		String codigo = SCANNER.nextLine();
		
		System.out.print("Autor: ");
		String autor = SCANNER.nextLine();
	
		System.out.print("Titulo: ");
		String titulo = SCANNER.nextLine();
		
		System.out.print("Genero: ");
		String genero = SCANNER.nextLine();
		
		System.out.print("Duracion: ");
		int duracion = SCANNER_ENTEROS.nextInt();
		
		Disco nuevoDisco = new Disco(codigo, autor, titulo, genero, duracion);
		
		COLECCION[CONTADOR] = nuevoDisco;
		CONTADOR++;
		System.out.println("Disco "+ nuevoDisco.getTitulo()+ " añadido.");
	}
	
	public static Disco buscar(String codigo) {
		for (int i = 0; i < COLECCION.length; i++) {
			if (COLECCION[i].getCodigo().equals(codigo)) {
				return COLECCION[i];
			}
		}
		
		return null;
	}
	
	public static void borrarDisco() {
		System.out.print("Introduce el codigo del disco a borrar: ");
		String codigo = SCANNER.nextLine();
		
		Disco discoBorrar = buscar(codigo);
		if (discoBorrar == null) {
			System.out.println("No se ha podido encontrar el disco.\n");
		} else {
			discoBorrar.setCodigo("LIBRE");
			discoBorrar.setAutor(null);
			discoBorrar.setDuracion(0);
			discoBorrar.setTitulo(null);
			discoBorrar.setGenero(null);
			System.out.println("Se ha borrado el disco con codigo "+codigo+".\n");
		}
		
	}
	
	public static void modificarDisco() {	
		System.out.println("Introduce el codigo del disco a modificar:");
		String codigo = SCANNER.nextLine();
		
		Disco discoModificar = buscar(codigo);
		if (discoModificar == null) {
			System.out.println("No se ha podido encontrar el disco.\n");
		} else {
			System.out.println("Introduce los nuevos datos del disco:");
			
			System.out.print("Autor:");
			String autor = SCANNER.nextLine();
			
			System.out.println("Titulo:");
			String titulo = SCANNER.nextLine();
			
			System.out.println("Genero:");
			String genero = SCANNER.nextLine();
			
			System.out.println("Duracion:");
			int duracion = SCANNER_ENTEROS.nextInt();
			
			discoModificar.setAutor(autor);
			discoModificar.setTitulo(titulo);
			discoModificar.setGenero(genero);
			discoModificar.setDuracion(duracion);
			
			System.out.println("Se ha modificado el disco " + codigo+ ".\n");
			
		}
	}

}
