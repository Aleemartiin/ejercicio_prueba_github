package ej3;

public class prueba_ej3 {

	public static void main(String[] args) {

		// Creamos dos repartidores
		Repartidor r1 = new Repartidor("Pepe", 25, 2100, "zona 1");
		Repartidor r2 = new Repartidor("Juan", 20, 2000, "zona 3"); // cumple las caracter�sticas para recibir un plus

		// llamamos al método plus
		System.out.println("\nRepartidores:");

		r1.plus();
		r2.plus();

		// Mostramos los resultados
		System.out.println(r1);
		System.out.println(r2);

		// Creamos dos comerciales
		Comercial c1 = new Comercial("Marta", 25, 2200, 100);
		Comercial c2 = new Comercial("Paula", 36, 2500, 300);

		// llamamos al método plus
		System.out.println("\nComerciales:");
		c1.plus();
		c2.plus();

		// Mostramos los resultados
		System.out.println(c1);
		System.out.println(c2);

	}

}
