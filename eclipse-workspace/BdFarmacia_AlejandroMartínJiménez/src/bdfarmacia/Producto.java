package bdfarmacia;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Producto {
	// Atributos
	private static Scanner sn = new Scanner(System.in);
	private String codigo;
	private String nombre;
	private String descripcion;
	private double precio;
	private int unidades;

	// Constructores
	public Producto(String codigo, String nombre, String descripcion, double precio, int unidades) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.unidades = unidades;
	}

	public Producto(Producto producto) {
		this.codigo = producto.codigo;
		this.nombre = producto.nombre;
		this.descripcion = producto.descripcion;
		this.precio = producto.precio;
		this.unidades = producto.unidades;
	}

	// Métodos y funciones
	public static void gestionarProductos(ArrayList<Producto> productos) {
		int opc2;
		int opcion;
		do {
			System.out.println("1. Dar de alta un producto");
			System.out.println("2. Buscar producto");
			System.out.println("3. Dar de baja un producto");
			System.out.println("4. Modificar datos del producto");
			System.out.println("5. Listar productos");
			System.out.println("6. Salir");
			System.out.print("Seleccione una opción: ");
			opcion = sn.nextInt();
			sn.nextLine();

			switch (opcion) {
			case 1:
				do {
					System.out.println("¿Qué producto quieres dar de alta?");
					System.out.println("1. ParaFarmacia");
					System.out.println("2. Medicamento");
					opc2 = sn.nextInt();
					switch (opc2) {
					case 1:
						ParaFarmacia.darDeAltaParaFarmacia(productos);
						break;
					case 2:
						Medicamento.darDeAltaMedicamento(productos);
						break;
					default:
						System.out.println("Opción no válida. Introduzca de nuevo:");
						opc2 = sn.nextInt();
					}
				} while (opc2 != 1 && opc2 != 2);
				break;
			case 2:
				buscarProducto(productos);
				break;
			case 3:
				darDeBajaProducto(productos);
				break;
			case 4:
				modificarProducto(productos);
				break;
			case 5:
				listarProductos(productos);
				break;
			case 6:
				System.out.println("Saliendo del gestor de productos...");
				break;
			default:
				System.out.println("Opción no válida. Inténtelo de nuevo.");
			}
		} while (opcion != 6);
	}

	private static void buscarProducto(ArrayList<Producto> productos) {
		System.out.print("Introduzca el código del producto a buscar: ");
		String codigo = sn.nextLine();

		for (Producto producto : productos) {
			if (producto.comprobarCodigo(codigo)) {
				System.out.println("Producto encontrado:");
				System.out.println(producto);
				return;
			}
		}
		System.out.println("Producto no encontrado.");
	}

	private static void darDeBajaProducto(ArrayList<Producto> productos) {
	    System.out.print("Introduzca el código del producto a dar de baja: ");
	    String codigo = sn.nextLine();
	    for (Producto producto : productos) {
	        if (producto.comprobarCodigo(codigo)) {
	            productos.remove(producto);
	            System.out.println("Producto eliminado correctamente.");
	            return;
	        }
	    }
	    System.out.println("Producto no encontrado.");
	}

	private static void modificarProducto(ArrayList<Producto> productos) {
		int opcion;
		System.out.print("Introduzca el código del producto a modificar: ");
		String codigo = sn.nextLine();
		for (Producto producto : productos) {
			if (producto.comprobarCodigo(codigo)) {

				do {
					System.out.println("¿Qué dato quiere modificar?");
					System.out.println("1. Nombre");
					System.out.println("2. Descripción");
					System.out.println("3. Precio");
					opcion = sn.nextInt();

					switch (opcion) {
					case 1:
						System.out.print("Nombre: ");
						producto.setNombre(sn.nextLine());
						System.out.println("Producto modificado correctamente.");
						break;
					case 2:
						System.out.print("Descripción: ");
						producto.setDescripcion(sn.nextLine());
						System.out.println("Producto modificado correctamente.");
						break;
					case 3:
						System.out.print("Precio: ");
						producto.setPrecio(sn.nextDouble());
						System.out.println("Producto modificado correctamente.");
						break;
					default:
						System.out.println("Introduce un dato válido:");
						sn.nextLine();
					}
				} while (opcion != 1 && opcion != 2 && opcion != 3);

			} else {
				System.out.println("Producto no encontrado.");
			}
		}

	}

	private static void listarProductos(ArrayList<Producto> productos) {
		if (productos.isEmpty()) {
			System.out.println("No hay productos en la lista.");
		} else {
			System.out.println("Lista de productos:");
			for (Producto producto : productos) {
				System.out.println(producto);
			}
		}
	}

	public boolean comprobarCodigo(String codigo) {
		return this.codigo.equals(codigo);
	}

	public boolean anadirUnidades(int unidades) {
		if (unidades > 0) {
			this.unidades += unidades;
			return true;
		} else {
			return false;
		}
	}

	public boolean quitarUnidades(int unidades) {
		if (unidades > 0 && unidades <= this.unidades) {
			this.unidades -= unidades;
			return true;
		} else {
			return false;
		}
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getUnidades() {
		return unidades;
	}

	@Override
	public String toString() {
		return "Producto " + "\n" + "ID: " + codigo + "\n" + "Nombre: " + nombre + "\n" + "Descripción: " + descripcion
				+ "\n" + "Precio: " + precio + "\n" + "Stock: " + unidades;
	}

}