package bdfarmacia;

import java.util.ArrayList;
import java.util.Scanner;

public class CPrincipal {

	public static ArrayList<Cliente> clientes = new ArrayList<>();
	public static ArrayList<Producto> productos = new ArrayList<>();
	private static Scanner sn = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion;

		do {
			System.out.println("Menú Principal:");
			System.out.println("1. Gestionar Clientes");
			System.out.println("2. Gestionar Productos");
			System.out.println("3. Salir");
			System.out.print("Seleccione una opción: ");
			opcion = sn.nextInt();
			sn.nextLine(); // Limpiar el buffer de entrada

			switch (opcion) {
			case 1:
				Cliente.gestionarClientes(clientes);
				break;
			case 2:
				Producto.gestionarProductos();
				break;
			case 3:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no válida.");
				opcion = ValidarDatos.validarInt(opcion);
			}
		} while (opcion != 3);

		sn.close(); // Cerrar el scanner al salir del programa
	}
}