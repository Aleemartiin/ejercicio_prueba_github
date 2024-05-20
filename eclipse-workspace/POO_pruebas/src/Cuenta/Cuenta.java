package Cuenta;

public class Cuenta {

	// atributos
	private String nombre;
	private String numCuenta;
	private double interes;
	private double saldo;

	// metodos

	// constructor
	public Cuenta() {

	}

	// constructor con todos los parametros
	public Cuenta(String nombre, String numCuenta, double interes, double saldo) {

		this.nombre = nombre;
		this.numCuenta = numCuenta;
		this.interes = interes;
		this.saldo = saldo;

	}

	// getter and setter
	public void setNombre(String nombre) {

		this.nombre = nombre;
	}

	public String getNombre() {

		return nombre;
	}

	public void setnumCuenta(String numCuenta) {

		this.numCuenta = numCuenta;
	}

	public String getnumCuenta() {

		return numCuenta;
	}

	public void setInteres(double interes) {

		this.interes = interes;
	}

	public double getInteres() {

		return interes;
	}

	public void setSaldo(double saldo) {

		this.saldo = saldo;
	}

	public double getSaldo() {

		return saldo;
	}

	public void ingreso(double cantidad) {

		saldo = saldo + cantidad;

	}
	
	public void transferencia(double importedado, Cuenta cuentadestino) {

		cuentadestino.saldo = cuentadestino.saldo + importedado;
		saldo=saldo-importedado;
		
				
	}

	@Override
	public String toString() {
		return "Cuenta [nombre=" + nombre + ", numCuenta=" + numCuenta + ", interes=" + interes + ", saldo=" + saldo
				+ "]";
	}

}
