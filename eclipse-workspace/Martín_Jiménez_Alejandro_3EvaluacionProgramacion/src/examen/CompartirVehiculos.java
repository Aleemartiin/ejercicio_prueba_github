package examen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class CompartirVehiculos {
	private static ArrayList<Viaje> listaViajes = new ArrayList<>();
	private static final String NOMBRE_FICHERO = "viajes.txt";
	public static Scanner sn = new Scanner(System.in);

	public static void main(String[] args) {

		// Menú de opciones.
		int opcion;

		do {
			System.out.println("¿Qué desea hacer?");
			System.out.println("1.Crear viaje.");
			System.out.println("2.Mostrar todos los viajes.");
			System.out.println("3.Reservar plaza en un viaje.");
			System.out.println("4.Eliminar reserva en un viaje.");
			System.out.println("5.Mostrar ocupantes de un viaje.");
			System.out.println("6.Guardar viajes en fichero.");
			System.out.println("7.Recuperar fichero.");
			System.out.println("8.Salir.");
			opcion = sn.nextInt();
			switch (opcion) {
			case 1:
				crearViaje();
				break;
			case 2:
				mostrarTodosLosViajes();
				break;
			case 3:
				reservarPlaza();
				break;
			case 4:
				eliminarReserva();
				break;
			case 5:
				mostrarOcupantes();
				break;
			case 6:
				guardarViajes();
				break;
			case 7:
				recuperarViajes();
				break;
			case 8:
				System.out.println("Saliendo....");
				break;
			default:
				System.out.println("Opción no válida, introduce una válida.");
			}
		} while (opcion != 8);
		sn.close();
	}

	// Método para crear el viaje.
	private static void crearViaje() {
		Persona conductor = new Persona();
		sn.nextLine();
		System.out.print("Origen: ");
		String origen = sn.nextLine();
		System.out.print("Destino: ");
		String destino = sn.nextLine();
		FechaYHora fechaYHora;
		do {
			System.out.print("Día: ");
			int dia = sn.nextInt();
			System.out.print("Mes: ");
			int mes = sn.nextInt();
			System.out.print("Año: ");
			int anio = sn.nextInt();
			System.out.print("Hora: ");
			int hora = sn.nextInt();
			System.out.print("Minutos: ");
			int minuto = sn.nextInt();
			sn.nextLine();
			fechaYHora = new FechaYHora(dia, mes, anio, hora, minuto);
			if (!fechaYHora.esFechaCorrecta() || !fechaYHora.esHoraCorrecta()) {
				System.out.println("Fecha u hora incorrecta. Inténtalo de nuevo.");
			}
		} while (!fechaYHora.esFechaCorrecta() || !fechaYHora.esHoraCorrecta());

		System.out.print("Precio: ");
		double precio = sn.nextDouble();
		sn.nextLine();

		Viaje nuevoViaje = new Viaje(conductor, origen, destino, fechaYHora, precio);
		listaViajes.add(nuevoViaje);
		System.out.println("Viaje creado con éxito.");
	}

	// Método para mostrar todos los viajes.
	private static void mostrarTodosLosViajes() {
		System.out.println("Viajes:");
		if (listaViajes.isEmpty()) {
			System.out.println("No hay viajes.");
		} else {
			for (Viaje viaje : listaViajes) {
				System.out.println(viaje);
				System.out.println("--------------------" + "\n");
			}
		}
	}

	// Método para reservar plaza en un viaje una vez introducido su identificador.
	private static void reservarPlaza() {

		sn.nextLine();
		System.out.print("Introduce el identificador del viaje: ");
		String idViaje = sn.nextLine();

		Viaje viajeEncontrado = null;
		for (Viaje viaje : listaViajes) {
			if (viaje.getIdent().equalsIgnoreCase(idViaje)) {
				viajeEncontrado = viaje;
			}
		}

		if (viajeEncontrado == null) {
			System.out.println("No se encontró ningún viaje con ese identificador.");
			return;
		}

		if (viajeEncontrado.anyadirPersona()) {
			System.out.println("Reserva realizada correctamente.");
		} else {
			System.out.println("No hay plazas disponibles en ese viaje.");
		}
	}

	// Método para eliminar una reserva de una persona.
	private static void eliminarReserva() {

		sn.nextLine();
		System.out.print("Introduce el identificador del viaje: ");
		String idViaje = sn.nextLine();
		System.out.print("Identificador de la persona: ");
		String idPersona = sn.nextLine();

		Viaje viajeEncontrado = null;
		for (Viaje viaje : listaViajes) {
			if (viaje.getIdent().equalsIgnoreCase(idViaje)) {
				viajeEncontrado = viaje;
			}
		}

		if (viajeEncontrado == null) {
			System.out.println("No se encontró ningún viaje con ese identificador.");
			return;
		}

		if (viajeEncontrado.eliminarPersonaEnViaje(idPersona)) {
			System.out.println("Reserva eliminada correctamente.");
		} else {
			System.out.println("No se encontró ninguna reserva de esa persona en ese viaje.");
		}
	}

	// Método que muestra todos los ocupantes de un viaje.
	private static void mostrarOcupantes() {

		sn.nextLine();
		System.out.print("Identificador del viaje: ");
		String idViaje = sn.nextLine();

		Viaje viajeEncontrado = null;
		for (Viaje viaje : listaViajes) {
			if (viaje.getIdent().equalsIgnoreCase(idViaje)) {
				viajeEncontrado = viaje;
			}
		}

		if (viajeEncontrado == null) {
			System.out.println("No se encontró ningún viaje con ese identificador.");
			return;
		}

		// Mostrar los datos del viaje
		System.out.println("El viaje encontrado ha sido:");
		System.out.println(viajeEncontrado);
		System.out.println("");
		System.out.println("Ocupantes:");
		viajeEncontrado.muestraPersonasViaje();
	}

	// Método para guardar los viajes en el archivo de texto "viajes.txt".
	private static void guardarViajes() {
		File archivo = new File(NOMBRE_FICHERO);
		try {
			if (!archivo.exists()) {
				archivo.createNewFile();
				System.out.println("Archivo creado.");
			}
			try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))) {
				out.writeObject(listaViajes);
				System.out.println("Viajes guardados correctamente.");
			}
		} catch (IOException e) {
			System.out.println("Error al guardar los viajes: " + e.getMessage());
		}
		
		//ME DA UN ERROR A LA HORA DE CARGAR LOS DATOS EN EL ARCHIVO DE TEXTO DEBIDO AL SCANNER.
	}

	// Método para recuperar y cargar en en Arry los datos del archivo de texto.
	private static void recuperarViajes() {
		File archivo = new File(NOMBRE_FICHERO);
		if (archivo.exists()) {
			try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(archivo))) {
				listaViajes = (ArrayList<Viaje>) input.readObject();
				System.out.println("Viajes recuperados correctamente.");
			} catch (IOException e) {
				System.out.println("Error al recuperar los viajes: " + e.getMessage());
			} catch (ClassNotFoundException e) {
				System.out.println("Error al recuperar los viajes: " + e.getMessage());
				e.printStackTrace();
			}
		} else {
			System.out.println("El archivo no existe.");
		}
		//ME DA UN ERROR A LA HORA DE CARGAR LOS DATOS EN EL ARRAY DESDE EL ARCHIVO DE TEXTO DEBIDO AL SCANNER.
	}

}
