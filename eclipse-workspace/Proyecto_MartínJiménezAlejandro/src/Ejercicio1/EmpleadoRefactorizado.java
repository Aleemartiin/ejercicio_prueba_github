package Ejercicio1;

public class EmpleadoRefactorizado {

	private String nombre;
	private int aniosServicio;
	private int edad;
	private double salario; /* Declaramos la variable al principio de la clase. */

	public void imprimirDatosEmpleado() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Salario: $" + salario);
		System.out.println("Años de Servicio: " + aniosServicio);
	}

	public EmpleadoRefactorizado(String a, double b, int c, int d) {
		this.nombre = a;
		this.salario = b;
		this.aniosServicio = c;
		this.edad = d;
	}

	public double calcular(double bonus) {
		bonus *= salario; /*Como el bonus solo se modifica en caso de que se cumpla la condición del if, inicializamos la variable de esta forma para ahorrarnos el else. Además usamos el "*=" para ahorrar código.*/
		if (this.aniosServicio >= 10 && this.edad > 60) {
			bonus *= 1.5;
		}
		return bonus;
	}

	public void copiarDatosEmpleado(EmpleadoRefactorizado E, boolean modificarNombre) { /*El nombre del método COPIAR_DATOSEMPLEADO y MODIFICAR_NOMBRE no es correcto.*/

		this.salario = E.salario;
		this.aniosServicio = E.aniosServicio;
		this.edad = E.edad;
		if (modificarNombre) {
			this.nombre = E.nombre;
		}
		/*Hay repetición del código, podemos sacar fuera los que se repiten tanto en el if como en el else.*/
	}

	public int calcularDiasVacaciones() {
		int aux=22;
		if (this.aniosServicio >= 10 && this.edad > 60) {
			aux=25;
		}
		return aux;
	} /*Inicializamos una variable a la cual le damos el valor por defecto que se le daba en el else anteriormente, ese valor es el que vamos a devolver y en caso de que se cumpla la condición del if, lo que modificamos es la variable.*/

	public boolean tieneReduccionJornada() {
		boolean reduccion = false;
		if (this.edad > 60) {
			reduccion = true;
			System.out.println("El empleado tiene derecho a reducción de jornada");
		}
		return reduccion;		
	}/*Al igual que en la función anterior, Inicializamos una variable a la cual le damos el valor por defecto de falso, ese valor es el que vamos a devolver y en caso de que se cumpla la condición del if, lo que modificamos es la variable poniéndola true.*/

	public void imprimirDatosEmpleadoDetallado(double bonus) {
		imprimirDatosEmpleado(); /* Utilizamos el método que está ya creado en vez de repetir código. */
		System.out.println("Salario con Bonificación: $" + calcular(bonus));
		System.out.println("Dias de Vacaciones: $" + calcularDiasVacaciones());
		if (!tieneReduccionJornada()) {
			System.out.println("El empleado no tiene derecho a reducción de jornada");
		}/*Simplificamos y en caso de que el empleado tenga reducción de jornada, lo imprime en el método que lo comprueba, y en caso de que no, lo comprueba y lo imprime.*/
	}

	public int calcularDiasAsuntosPropios(String estacion) {
		int x = calcularDiasVacaciones() - 20;
		if (estacion.equals("Verano")) {
			x += 5;
		} else if (estacion.equals("Invierno")) {
			x += 4;
		} else if (estacion.equals("Primavera") || estacion.equals("Otoño")) {
			x += 3;
		}else {
			x=0;
		}
		return x;
	}/*Simplificamos el código estableciendo un valor a x que anteriormente era común en todos las condiciones if. Y devolvemos el valor de la variable x según el caso que corresponda. Además, agrupamos las condiciones en las que se haga lo mismo (otoño y primavera)*/

}
