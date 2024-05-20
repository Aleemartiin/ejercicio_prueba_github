package Cuenta;

import java.util.Scanner;

public class uso_cuenta {

	public static void main(String[] args) {

		Cuenta miCuenta = new Cuenta();
		Cuenta tuCuenta = new Cuenta("Juan", "123456789", 4.8, 1000);

		System.out.println("Cuenta compartida de Manolo el del Bombo y del Churumbel:");
		System.out.println("Nombre: " + tuCuenta.getNombre());
		System.out.println("Numero: " + tuCuenta.getnumCuenta());
		System.out.println("Interes: " + tuCuenta.getInteres());
		System.out.println("Saldo: " + tuCuenta.getSaldo());
		System.out.println("");

		miCuenta.setNombre("Masones");
		miCuenta.setnumCuenta("987654321");
		miCuenta.setInteres(1.0);
		miCuenta.setSaldo(3543);

		System.out.println("Cuenta compartida de Masones twitcheros de tartaria y Andorranos:");
		System.out.println("Nombre: " + miCuenta.getNombre());
		System.out.println("Numero: " + miCuenta.getnumCuenta());
		System.out.println("Interes: " + miCuenta.getInteres());
		System.out.println("Saldo: " + miCuenta.getSaldo());

		// CUENTA DE DATOS POR TECLADO
		System.out.println("");
		Scanner sn = new Scanner(System.in);

		Cuenta cuentaNueva = new Cuenta();
		System.out.println("Introduce el nombre de la nueva cuenta:");
		String nombre = sn.nextLine();
		cuentaNueva.setNombre(nombre);
		System.out.println("Introduce el numero de la nueva cuenta:");
		String numero = sn.nextLine();
		cuentaNueva.setnumCuenta(numero);
		System.out.println("Introduce el interes de la nueva cuenta:");
		Double interes = sn.nextDouble();
		cuentaNueva.setInteres(interes);
		System.out.println("Introduce el saldo de la nueva cuenta:");
		Double saldo = sn.nextDouble();
		cuentaNueva.setSaldo(saldo);

		System.out.println("Cuenta Nueva de Paul Thin:");
		System.out.println("Nombre: " + cuentaNueva.getNombre());
		System.out.println("Numero: " + cuentaNueva.getnumCuenta());
		System.out.println("Interes: " + cuentaNueva.getInteres());
		System.out.println("Saldo: " + cuentaNueva.getSaldo());

		cuentaNueva.ingreso(5090);

		System.out.println(cuentaNueva.toString());
		System.out.println(miCuenta.toString());
		System.out.println("");
		
		cuentaNueva.transferencia(400, miCuenta);
		
		System.out.println(cuentaNueva.toString());
		System.out.println(miCuenta.toString());

		sn.close();
	}

}
