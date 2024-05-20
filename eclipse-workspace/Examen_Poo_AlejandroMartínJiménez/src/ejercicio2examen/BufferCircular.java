package ejercicio2examen;

public class BufferCircular {

	private Integer[] buffer;
	private int primero;
	private int ultimo;
	private int cantidad;

	public BufferCircular() {
		this.buffer = new Integer[10];
		this.primero = 0;
		this.ultimo = 0;
		this.cantidad = 0;
	}

	public boolean insertar(Integer num) {
		if (cantidad == 10) {
			return false;
		}
		buffer[ultimo] = num;
		ultimo++;
		if (ultimo >= 10) {
			ultimo = 0;
		}
		cantidad++;
		return true;
	}

	public Integer leer() {
		if (cantidad == 0) {
			return null;
		}
		Integer valor = buffer[primero];
		buffer[primero] = null;
		primero++;
		if (primero == 10) {
			primero = 0;
		}
		cantidad--;
		return valor;
	}

	public void mostrarBuffer() {
		System.out.println("");
		for (int i = 0; i < buffer.length; i++) {

			if (buffer[i] == null) {
				System.out.print("|   ");
			} else {
				System.out.print("| " + buffer[i] + " ");
			}
			if (i == 9) {
				System.out.println("|");
			}
		}
		System.out.println("");
	}

	public int estadoBuffer() {
		return (cantidad * 100) / 10;
	}
}