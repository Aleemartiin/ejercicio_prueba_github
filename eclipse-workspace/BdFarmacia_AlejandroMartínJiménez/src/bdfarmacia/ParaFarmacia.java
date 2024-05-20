package bdfarmacia;

import java.util.ArrayList;
import java.util.Scanner;

public class ParaFarmacia extends Producto {
	private int dosisUnidades;
	private double descuento;
	private Categoria categoria;

	private static Scanner sn = new Scanner(System.in);
	
	// Constructor
	public ParaFarmacia(String codigo, String nombre, String descripcion, double precio, int unidades,
			int dosisUnidades, double descuento, Categoria categoria) {
		super(codigo, nombre, descripcion, precio, unidades);
		this.dosisUnidades = dosisUnidades;
		this.descuento = descuento;
		this.categoria = categoria;
	}

	// Constructor copia
	public ParaFarmacia(ParaFarmacia paraFarmacia) {
		super(paraFarmacia);
		this.dosisUnidades = paraFarmacia.dosisUnidades;
		this.descuento = paraFarmacia.descuento;
		this.categoria = paraFarmacia.categoria;
	}

	// Métodos getters y setters
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getDosisUnidades() {
		return dosisUnidades;
	}

	public void setDosisUnidades(int dosisUnidades) {
		this.dosisUnidades = dosisUnidades;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	public static void darDeAltaParaFarmacia(ArrayList<Producto> productos) {

		int opcion;
	    System.out.println("Introduzca el código del producto para farmacia:");
	    String codigo = sn.nextLine();
	    for (Producto producto : productos) {
	        if (producto.getCodigo().equals(codigo)) {
	            // Si no está dado de baja, mostrar mensaje de que ya existe.
	            System.out.println("El producto para farmacia ya está registrado.");
	            return;
	        }
	    }
	    System.out.println("Introduzca el nombre del producto:");
	    String nombre = sn.nextLine();
	    nombre = ValidarDatos.validarString(nombre);
	    System.out.println("Introduzca la descripción del producto:");
	    String descripcion = sn.nextLine();
	    descripcion = ValidarDatos.validarString(descripcion);
	    System.out.println("Introduzca el precio del producto:");
	    double precio = sn.nextDouble();
	    precio = ValidarDatos.validarDouble(precio);
	    System.out.println("Introduzca el número de unidades del producto:");
	    int unidades = sn.nextInt();
	    unidades = ValidarDatos.validarInt(unidades);
	    sn.nextLine();

	    System.out.println("Introduzca la dosis del producto:");
	    int dosisUnidades = sn.nextInt();
	    dosisUnidades = ValidarDatos.validarInt(dosisUnidades);
	    System.out.println("Introduzca el descuento del producto:");
	    double descuento = sn.nextDouble();
	    descuento = ValidarDatos.validarDouble(descuento);
	    sn.nextLine();
	    System.out.println("Introduzca la categoría del producto:");
	    Categoria categoria = Categoria.DENTAL;
		do {
            System.out.println("Introduzca la categoría:");
            System.out.println("1. DENTAL");
            System.out.println("2. FACIAL");
            System.out.println("3. GELES");
            System.out.println("4. CORPORAL");
            System.out.println("5. CABELLO");
            System.out.println("6. ANTIMOSQUITOS");
            System.out.println("7. INTIMA");
            System.out.println("8. NASAL");
            System.out.println("9. OCULAR");
            System.out.println("10. BOTIQUIN");
            System.out.println("11. OIDOS");
            System.out.println("12. TOALLITAS");
            System.out.println("13. LIMPIEZA");
            System.out.println("14. HOGAR");
            System.out.println("15. MASCARILLAS");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado Dental");
                    categoria = Categoria.DENTAL;
                    break;
                case 2:
                    System.out.println("Has seleccionado Laxantes");
                    categoria = Categoria.FACIAL;
                    break;
                case 3:
                    System.out.println("Has seleccionado Geles");
                    categoria = Categoria.GELES;
                    break;
                case 4:
                    System.out.println("Has seleccionado Corporal");
                    categoria = Categoria.CORPORAL;
                    break;
                case 5:
                    System.out.println("Has seleccionado Cabello");
                    categoria = Categoria.CABELLO;
                    break;
                case 6:
                    System.out.println("Has seleccionado Antimosquitos");
                    categoria = Categoria.ANTIMOSQUITOS;
                    break;
                case 7:
                    System.out.println("Has seleccionado Intima");
                    categoria = Categoria.INTIMA;
                    break;
                case 8:
                    System.out.println("Has seleccionado Nasal");
                    categoria = Categoria.NASAL;
                    break;
                case 9:
                    System.out.println("Has seleccionado Ocular");
                    categoria = Categoria.OCULAR;
                    break;
                case 10:
                    System.out.println("Has seleccionado Botiquin");
                    categoria = Categoria.BOTIQUIN;
                    break;
                case 11:
                    System.out.println("Has seleccionado Oidos");
                    categoria = Categoria.OIDOS;
                    break;
                case 12:
                    System.out.println("Has seleccionado Toallitas");
                    categoria = Categoria.TOALLITAS;
                    break;
                case 13:
                    System.out.println("Has seleccionado Limpieza");
                    categoria = Categoria.LIMPIEZA;
                    break;
                case 14:
                    System.out.println("Has seleccionado Hogar");
                    categoria = Categoria.HOGAR;
                    break;
                case 15:
                    System.out.println("Has seleccionado Mascarillas");
                    categoria = Categoria.MASCARILLAS;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 15.");
            }
        } while (opcion < 1 || opcion > 15);
	    

	    // Crear un nuevo objeto ParaFarmacia y agregarlo a la lista de productos
	    ParaFarmacia nuevoProducto = new ParaFarmacia(codigo, nombre, descripcion, precio, unidades, dosisUnidades, descuento, categoria);
	    productos.add(nuevoProducto);
	    System.out.println("Producto para farmacia añadido correctamente.");
	}


	// Método toString
	@Override
	public String toString() {
		return 	super.toString() + "\n" + "Dosis Unidades: " + dosisUnidades + "\n" + "Descuento: " + descuento
		+ "\n" + "Categoria: " + categoria + "\n" + "\n";
	}
}