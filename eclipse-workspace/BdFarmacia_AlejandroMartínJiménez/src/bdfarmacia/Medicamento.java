package bdfarmacia;

import java.util.ArrayList;
import java.util.Scanner;

public class Medicamento extends Producto {
	private String comoTomar;
	private String efectosAdversos;
	private TipoMedicamento tipoMedicamento;
	private static Scanner sn = new Scanner(System.in);
	
	// Constructor
	public Medicamento(String codigo, String nombre, String descripcion, double precio, int unidades, String comoTomar,
			String efectosAdversos, TipoMedicamento tipoMedicamento) {
		super(codigo, nombre, descripcion, precio, unidades);
		this.comoTomar = comoTomar;
		this.efectosAdversos = efectosAdversos;
		this.tipoMedicamento = tipoMedicamento;
	}

	// Constructor copia
	public Medicamento(Medicamento medicamento) {
		super(medicamento);
		this.comoTomar = medicamento.comoTomar;
		this.efectosAdversos = medicamento.efectosAdversos;
		this.tipoMedicamento = medicamento.tipoMedicamento;
	}

	// Métodos getters y setters
	public TipoMedicamento getTipoMedicamento() {
		return tipoMedicamento;
	}

	public void setTipoMedicamento(TipoMedicamento tipoMedicamento) {
		this.tipoMedicamento = tipoMedicamento;
	}

	public String getComoTomar() {
		return comoTomar;
	}

	public void setComoTomar(String comoTomar) {
		this.comoTomar = comoTomar;
	}

	public String getEfectosAdversos() {
		return efectosAdversos;
	}

	public void setEfectosAdversos(String efectosAdversos) {
		this.efectosAdversos = efectosAdversos;
	}

	public static void darDeAltaMedicamento(ArrayList<Producto> productos) {
		
		int opcion;

		System.out.println("Introduzca el código del medicamento:");
		String codigo = sn.nextLine();
		for (Producto producto : productos) {
			if (producto.getCodigo().equals(codigo)) {
				// Si no está dado de baja, mostrar mensaje de que ya existe.
				System.out.println("El medicamento ya está registrado.");
				return;
			}
		}
		System.out.println("Introduzca el nombre del medicamento:");
		String nombre = sn.nextLine();
		nombre = ValidarDatos.validarString(nombre);
		System.out.println("Introduzca la descripción del medicamento:");
		String descripcion = sn.nextLine();
		descripcion = ValidarDatos.validarString(descripcion);
		System.out.println("Introduzca el precio del medicamento:");
		double precio = sn.nextDouble();
		precio = ValidarDatos.validarDouble(precio);
		System.out.println("Introduzca el número de unidades del medicamento:");
		int unidades = sn.nextInt();
		unidades = ValidarDatos.validarInt(unidades);
		sn.nextLine();
		System.out.println("Introduzca cómo tomar el medicamento:");
		String comoTomar = sn.nextLine();
		comoTomar = ValidarDatos.validarString(comoTomar);
		System.out.println("Introduzca los efectos adversos del medicamento:");
		String efectosAdversos = sn.nextLine();
		efectosAdversos = ValidarDatos.validarString(efectosAdversos);
		
        TipoMedicamento tipoMedicamento = TipoMedicamento.ANALGESICOS;
		do {
            System.out.println("Introduzca el tipo de medicamento:");
            System.out.println("1. ANALGESICOS");
            System.out.println("2. LAXANTES");
            System.out.println("3. ANTIINFECCIOSOS");
            System.out.println("4. ANTIDEPRESIVOS");
            System.out.println("5. ANTITUSIVOS");
            System.out.println("6. MUCOLITICOS");
            System.out.println("7. ANTIACIDOS");
            System.out.println("8. ANTIULCEROSOS");
            System.out.println("9. ANTIALERGICOS");
            System.out.println("10. ANTIFIARREICOS");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado Analgesicos");
                    tipoMedicamento = TipoMedicamento.ANALGESICOS;
                    break;
                case 2:
                    System.out.println("Has seleccionado Laxantes");
                    tipoMedicamento = TipoMedicamento.LAXANTES;
                    break;
                case 3:
                    System.out.println("Has seleccionado Antifecciosos");
                    tipoMedicamento = TipoMedicamento.ANTIINFECCIOSOS;
                    break;
                case 4:
                    System.out.println("Has seleccionado Antidepresivos");
                    tipoMedicamento = TipoMedicamento.ANTIDEPRESIVOS;
                    break;
                case 5:
                    System.out.println("Has seleccionado Antitusivos");
                    tipoMedicamento = TipoMedicamento.ANTITUSIVOS;
                    break;
                case 6:
                    System.out.println("Has seleccionado Mucoliticos");
                    tipoMedicamento = TipoMedicamento.MUCOLITICOS;
                    break;
                case 7:
                    System.out.println("Has seleccionado Antiacidos");
                    tipoMedicamento = TipoMedicamento.ANTIACIDOS;
                    break;
                case 8:
                    System.out.println("Has seleccionado Antiulcerosos");
                    tipoMedicamento = TipoMedicamento.ANTIULCEROSOS;
                    break;
                case 9:
                    System.out.println("Has seleccionado Antialergicos");
                    tipoMedicamento = TipoMedicamento.ANTIALERGICOS;
                    break;
                case 10:
                    System.out.println("Has seleccionado Antifiarreicos");
                    tipoMedicamento = TipoMedicamento.ANTIFIARREICOS;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 10.");
            }
        } while (opcion < 1 || opcion > 10);
		 
		// Crear un nuevo objeto Medicamento y agregarlo a la lista de medicamentos y
		// productos
		Medicamento nuevoMedicamento = new Medicamento(codigo, nombre, descripcion, precio, unidades, comoTomar,
				efectosAdversos, tipoMedicamento);
		productos.add(nuevoMedicamento);
		System.out.println("Medicamento añadido correctamente.");
	}

	// Método toString
	@Override
	public String toString() {
		return  super.toString() + "\n" + "Cómo tomar: " + comoTomar + "\n" + "Efectos Adversos: " + efectosAdversos
				+ "\n" + "Tipo Medicamento: " + tipoMedicamento + "\n" + "\n";
	}
}
