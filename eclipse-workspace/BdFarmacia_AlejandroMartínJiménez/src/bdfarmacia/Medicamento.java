package bdfarmacia;

public class Medicamento extends Producto {
	private String comoTomar;
	private String efectosAdversos;
	private TipoMedicamento tipoMedicamento;

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
	
	

	// Métodos getters y setters específicos para Medicamento
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

	// Método toString para representar el objeto como una cadena de texto
	@Override
	public String toString() {
		return "Medicamento{" + "comoTomar='" + comoTomar + '\'' + ", efectosAdversos='" + efectosAdversos + '\''
				+ ", tipoMedicamento=" + tipoMedicamento + ", " + super.toString() + '}';
	}
}
