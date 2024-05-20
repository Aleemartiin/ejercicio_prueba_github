package ejercicio2examen;

public class Ejercicio2Pruebas {

	public static void main(String[] args) {
		
		BufferCircular b = new BufferCircular();
		
		b.insertar(9);
		b.insertar(5);
		b.insertar(4);
		b.insertar(8);
		b.insertar(3);
		b.mostrarBuffer();
		b.leer();
		b.leer();
		b.mostrarBuffer();
		System.out.println("El porcentaje del buffer es del " + b.estadoBuffer() +"%");
		b.insertar(0);
		b.insertar(8);
		b.insertar(5);
		b.insertar(6);
		b.insertar(1);
		b.insertar(2);
		b.mostrarBuffer();
		b.insertar(0);
		b.insertar(0);
		b.insertar(0);
		b.mostrarBuffer();
		System.out.println("El porcentaje del buffer es del " + b.estadoBuffer() +"%");
		b.leer();
		b.leer();
		b.insertar(3);
		b.mostrarBuffer();
	}

}
