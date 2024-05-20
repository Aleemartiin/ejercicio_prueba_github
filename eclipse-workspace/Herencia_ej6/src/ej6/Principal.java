package ej6;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Electrodomestico listaElectrodomesticos[] = new Electrodomestico[10];

		// Asignamos cada una de las posiciones como queramos
		listaElectrodomesticos[0] = new Electrodomestico(200, "verde", 'C', 60);
		listaElectrodomesticos[1] = new Lavadora(150, 30);
		listaElectrodomesticos[2] = new Television(500, "negro", 'E', 42, 40, false);
		listaElectrodomesticos[3] = new Electrodomestico();
		listaElectrodomesticos[4] = new Electrodomestico(600, "gris", 'D', 20);
		listaElectrodomesticos[5] = new Lavadora(300, "blanco", 'Z', 40, 7);
		listaElectrodomesticos[6] = new Television(250, 70);
		listaElectrodomesticos[7] = new Lavadora(400, "verde", 'A', 100, 15);
		listaElectrodomesticos[8] = new Television(200, "naranja", 'C', 60, 30, true);
		listaElectrodomesticos[9] = new Electrodomestico(50, 10);

		// Creamos las variables que usaremos para almacenar la suma de los precios
		double sumaElectrodomesticos = 0;
		double sumaTelevisiones = 0;
		double sumaLavadoras = 0;

		// Recorremos el array invocando el metodo precioFinal
		for (int i = 0; i < listaElectrodomesticos.length; i++) {
			/*
			 * Cuando una Television o una Lavadora este en la posicion del array actual,
			 * pasara por su clase y por la de electrodomestico, ya que una television es un
			 * electrodomestico. Ejecutamos en cada uno su propia version del metodo
			 * precioFinal y se actualiza su precio en el precio del objeto.
			 */
			listaElectrodomesticos[i].precioFinal();
			
			if (listaElectrodomesticos[i] instanceof Electrodomestico) {
			
				sumaElectrodomesticos += listaElectrodomesticos[i].getPrecioBase();
			}
			if (listaElectrodomesticos[i] instanceof Lavadora) {
				sumaLavadoras += listaElectrodomesticos[i].getPrecioBase();
			}
			if (listaElectrodomesticos[i] instanceof Television) {
				sumaTelevisiones += listaElectrodomesticos[i].getPrecioBase();;
			}
		}

		// Mostramos los resultados
		System.out.println("La suma del precio de los electrodomesticos es de " + sumaElectrodomesticos);
		System.out.println("La suma del precio de las lavadoras es de " + sumaLavadoras);
		System.out.println("La suma del precio de las televisiones es de " + sumaTelevisiones);

	}

}
