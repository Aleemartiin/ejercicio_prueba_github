package examen;

import java.io.Serializable;

public class FechaYHora implements Serializable {
	private int dia;
	private int mes;
	private int anio;
	private int hora;
	private int minuto;

	// Constructor con parámetros
	public FechaYHora(int dia, int mes, int anio, int hora, int minuto) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		this.hora = hora;
		this.minuto = minuto;
	}

	// Método para comprobar si un año es bisiesto
	private boolean esBisiesto(int anio) {
		return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
	}

	// Método para comprobar si una fecha es correcta
	public boolean esFechaCorrecta() {
		if (anio < 2024) {
			return false;
		} else if (anio == 2024) {
			if (mes < 5) {
				return false;
			} else if (mes == 5 && dia < 16) {
				return false;
			}
		}

		// Día, mes y año válidos
		if (mes < 1 || mes > 12) {
			return false;
		}
		int[] diasPorMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (esBisiesto(anio)) {
			diasPorMes[2] = 29;
		}
		return dia >= 1 && dia <= diasPorMes[mes];
	}

	// Comprobar hora correcta
	public boolean esHoraCorrecta() {
		return hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59;
	}

	// Método toString()
	@Override
	public String toString() {
		return "Fecha viaje: " + dia + "/" + mes + "/" + anio + "\n" + "Hora viaje: " + hora + ":" + minuto;
	}
}