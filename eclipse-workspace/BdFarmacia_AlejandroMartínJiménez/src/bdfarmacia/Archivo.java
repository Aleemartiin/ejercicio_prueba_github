package bdfarmacia;

import java.io.*;
import java.util.ArrayList;

public class Archivo {

	public static void guardarClientesEnArchivo(ArrayList<Cliente> clientes, String archivo) {
		try (FileWriter escritor = new FileWriter(archivo)) {
			for (Cliente cliente : clientes) {
				String linea = cliente.getId() + "," + cliente.getNombre() + "," + cliente.getDireccion() + ","
						+ cliente.getTelefono() + "," + (cliente.getBaja() ? "Baja" : "Alta") + "\n";
				escritor.write(linea);
			}
		} catch (IOException e) {
			System.err.println("Error al guardar los clientes: " + e.getMessage());
		}
	}

	public static void cargarClientesEnArray(ArrayList<Cliente> clientes, String archivo) {
		try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
			String linea;
			while ((linea = lector.readLine()) != null) {
				String[] datos = linea.split(",");
				Cliente cliente = new Cliente(datos[0], datos[1], datos[2], datos[3]);
				cliente.setBaja(datos[4].equals("Baja"));
				clientes.add(cliente);
			}
		} catch (IOException e) {
			System.err.println("Error al cargar clientes del archivo: " + e.getMessage());
		}
	}

	public static void guardarProductosEnArchivo(ArrayList<Producto> productos, String archivo) {
		try (FileWriter escritor = new FileWriter(archivo)) {
			for (Producto producto : productos) {
				String linea = producto.getCodigo() + "," + producto.getNombre() + "," + producto.getDescripcion() + ","
						+ producto.getPrecio() + "," + producto.getUnidades() + ",";

				if (producto instanceof Medicamento) {
					Medicamento medicamento = (Medicamento) producto;
					linea += "Medicamento," + medicamento.getComoTomar() + "," + medicamento.getEfectosAdversos() + ","
							+ medicamento.getTipoMedicamento() + "\n";
				} else if (producto instanceof ParaFarmacia) {
					ParaFarmacia paraFarmacia = (ParaFarmacia) producto;
					linea += "ParaFarmacia," + paraFarmacia.getDosisUnidades() + "," + paraFarmacia.getDescuento() + ","
							+ paraFarmacia.getCategoria() + "\n";
				}
				escritor.write(linea);
			}
		} catch (IOException e) {
			System.err.println("Error al guardar los productos: " + e.getMessage());
		}
	}

	public static void cargarProductosEnArray(ArrayList<Producto> productos, String nombreArchivo) {
		try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
			String linea;
			while ((linea = lector.readLine()) != null) {
				String[] datos = linea.split(",");
				if (datos[5].equals("Medicamento")) {
					Medicamento medicamento = new Medicamento(datos[0], datos[1], datos[2],
							Double.parseDouble(datos[3]), Integer.parseInt(datos[4]), datos[6], datos[7],
							TipoMedicamento.valueOf(datos[8]));
					productos.add(medicamento);
				} else if (datos[5].equals("ParaFarmacia")) {
					ParaFarmacia paraFarmacia = new ParaFarmacia(datos[0], datos[1], datos[2],
							Double.parseDouble(datos[3]), Integer.parseInt(datos[4]), Integer.parseInt(datos[6]),
							Double.parseDouble(datos[7]), Categoria.valueOf(datos[8]));
					productos.add(paraFarmacia);
				}
			}
		} catch (IOException e) {
			System.err.println("Error al cargar productos del archivo: " + e.getMessage());
		}
	}
}