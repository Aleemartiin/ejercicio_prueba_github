package bdfarmacia;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {

	private String id;
	private String nombre;
	private String direccion;
	private String telefono;
	private boolean baja;
	private static Scanner sn = new Scanner(System.in);

	public Cliente(String id, String nombre, String direccion, String telefono) {
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.baja = false;
	}

	// Constructor copia
	public Cliente(Cliente copiaDeCliente) {
		this.id = copiaDeCliente.id;
		this.nombre = copiaDeCliente.nombre;
		this.direccion = copiaDeCliente.direccion;
		this.telefono = copiaDeCliente.telefono;
		this.baja = copiaDeCliente.baja;
	}

	// Métodos getters y setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setBaja(boolean baja) {
		this.baja = true;
	}

	// Método toString para representar el objeto como una cadena de texto
	@Override
	public String toString() {
		return "Cliente{" + "id='" + id + '\'' + ", nombre='" + nombre + '\'' + ", direccion='" + direccion + '\''
				+ ", telefono='" + telefono + '\'' + ", baja=" + baja + '}';
	}

	// Método para mostrar el menú y gestionar las opciones
	public static void gestionarClientes(ArrayList<Cliente> clientes) {
		int opcion;

		do {
			System.out.println("Menú de opciones:");
			System.out.println("1. Dar de alta un cliente nuevo.");
			System.out.println("2. Buscar cliente por DNI.");
			System.out.println("3. Dar de baja un cliente.");
			System.out.println("4. Modificar datos del cliente.");
			System.out.println("5. Listar clientes.");
			System.out.println("6. Salir.");
			System.out.print("Seleccione una opción: ");
			opcion = sn.nextInt();
			opcion = ValidarDatos.validarInt(opcion);
			sn.nextLine(); // Limpiar el buffer de entrada

			switch (opcion) {
			case 1:
				darDeAltaCliente(clientes);
				break;
			case 2:
				buscarClientePorDNI(clientes);
				break;
			case 3:
				darDeBajaCliente(clientes);
				break;
			case 4:
				modificarDatosCliente(clientes);
				break;
			case 5:
				listarClientes(clientes);
				break;
			case 6:
				System.out.println("Saliendo del menú...");
				break;
			default:
				System.out.println("Valor no válido.");
				opcion = ValidarDatos.validarInt(opcion);
			}
		} while (opcion != 6 );
	}

	// Método para dar de alta un cliente nuevo
	private static void darDeAltaCliente(ArrayList<Cliente> clientes) {
		System.out.println("Introduzca el ID del cliente:");
		String id = sn.nextLine();
		while (ValidarDatos.validarNif(id) == false) {
			System.out.println("Por favor, introduzca un ID válido: ");
			id = sn.nextLine();
		}
		System.out.println("Introduzca el nombre del cliente:");
		String nombre = sn.nextLine();
		nombre=ValidarDatos.validarString(nombre);
		System.out.println("Introduzca la dirección del cliente:");
		String direccion = sn.nextLine();
		direccion=ValidarDatos.validarString(direccion);
		System.out.println("Introduzca el teléfono del cliente:");
		String telefono = sn.nextLine();
		telefono=ValidarDatos.validarString(telefono);

		Cliente nuevoCliente = new Cliente(id, nombre, direccion, telefono);
		clientes.add(nuevoCliente);
		System.out.println("Cliente añadido correctamente.");
	}

	// Método para buscar un cliente por su ID (DNI)
	private static void buscarClientePorDNI(ArrayList<Cliente> clientes) {
		System.out.println("Introduzca el ID del cliente a buscar:");
		String idBuscar = sn.nextLine();
		while (ValidarDatos.validarNif(idBuscar) == false) {
			System.out.println("Por favor, introduzca un ID válido: ");
			idBuscar = sn.nextLine();
		}
		for (Cliente cliente : clientes) {
			if (cliente.getId().equals(idBuscar)) {
				System.out.println("Cliente encontrado:");
				System.out.println(cliente);
				return;
			}
		}
		System.out.println("Cliente no encontrado.");
	}

	// Método para dar de baja un cliente
	private static void darDeBajaCliente(ArrayList<Cliente> clientes) {
		System.out.println("Introduzca el ID del cliente a dar de baja:");
		String idBaja = sn.nextLine();
		while (ValidarDatos.validarNif(idBaja) == false) {
			System.out.println("Por favor, introduzca un ID válido: ");
			idBaja = sn.nextLine();
		}

		for (Cliente cliente : clientes) {
			if (cliente.getId().equals(idBaja)) {
				cliente.setBaja(true);
				System.out.println("Cliente dado de baja correctamente.");
				return;
			}
		}
		System.out.println("Cliente no encontrado.");
	}

	// Método para modificar los datos de un cliente
	private static void modificarDatosCliente(ArrayList<Cliente> clientes) {
		int aux;
		System.out.println("Introduzca el ID del cliente a modificar:");
		String idModificar = sn.nextLine();
		while (ValidarDatos.validarNif(idModificar) == false) {
			System.out.println("Por favor, introduzca un ID válido: ");
			idModificar = sn.nextLine();
		}
		for (Cliente cliente : clientes) {
			if (cliente.getId().equals(idModificar)) {
				System.out.println("¿Qué dato quiere modificar?");
				System.out.println("1.Nombre");
				System.out.println("2.Direccion");
				System.out.println("3.Telefono");
				aux = sn.nextInt();
				while (aux != 1 && aux != 2 && aux != 3) {
					switch (aux) {
					case 1:
						System.out.println("Introduzca el nuevo nombre del cliente:");
						cliente.setNombre(sn.nextLine());
						System.out.println("Datos del cliente modificados correctamente.");
					case 2:
						System.out.println("Introduzca la nueva dirección del cliente:");
						cliente.setDireccion(sn.nextLine());
						System.out.println("Datos del cliente modificados correctamente.");
					case 3:
						System.out.println("Introduzca el nuevo teléfono del cliente:");
						cliente.setTelefono(sn.nextLine());
						System.out.println("Datos del cliente modificados correctamente.");
					default:
						System.out.println("Introduce un dato válido:");
						aux = sn.nextInt();
					}
				}
			}
		}
		System.out.println("Cliente no encontrado.");
	}

	// Método para listar todos los clientes
	private static void listarClientes(ArrayList<Cliente> clientes) {
		if (clientes.isEmpty()) {
			System.out.println("No hay clientes registrados.");
		} else {
			System.out.println("Listado de clientes:");
			for (Cliente cliente : clientes) {
				System.out.println(cliente);
			}
		}
	}
}