package bdfarmacia;

public class ParaFarmacia extends Producto {
	private int dosisUnidades;
	private double descuento;
	private Categoria categoria;

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

	// Métodos getters y setters específicos para ParaFarmacia
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

	// Método toString para representar el objeto como una cadena de texto
	@Override
	public String toString() {
		return "ParaFarmacia{" + "dosisUnidades=" + dosisUnidades + ", descuento=" + descuento + ", categoria="
				+ categoria + ", " + super.toString() + '}';
	}
}