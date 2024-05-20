package ejercicio5;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;

	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public boolean validarFecha() {
		return esDiaValido() && esMesValido() && esAnioValido();
	}

	public boolean esDiaValido() {
		
//		if (dia >= 1 && dia <= diasDelMes()){
//			return true;
//		}
		
		return dia >= 1 && dia <= diasDelMes();
	}

	public boolean esMesValido() {
		return mes >= 1 && mes <= 12;
	}

	public boolean esAnioValido() {
		return anio > 0;
	}

	public int diasDelMes() {
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			return 31;
		case 4, 6, 9, 11:
			return 30;
		case 2:
			if (esAnioBisiesto()) {
				return 29;
			} else {
				return 28;
			}
		default:
			return 0;
		}
	}

	public boolean esAnioBisiesto() {
		return (anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0));
	}
}