package sopadeletras;
import java.util.Scanner;
public class sopadeletras {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sn = new Scanner(System.in);
		char[][] sopa = new char[10][10];
		String[] palabras = new String[4];
		String comprobar;
		String aux;
		
		System.out.println(
				"\r\n" + "██████╗░██╗░░░██╗░█████╗░██╗░░██╗███████╗██████╗░░█████╗░      ██████╗░███████╗  \r\n"
						+ "██╔══██╗██║░░░██║██╔══██╗██║░░██║██╔════╝██╔══██╗██╔══██╗      ██╔══██╗██╔════╝  \r\n"
						+ "██████╔╝██║░░░██║██║░░╚═╝███████║█████╗░░██████╔╝██║░░██║      ██║░░██║█████╗░░  \r\n"
						+ "██╔═══╝░██║░░░██║██║░░██╗██╔══██║██╔══╝░░██╔══██╗██║░░██║      ██║░░██║██╔══╝░░  \r\n"
						+ "██║░░░░░╚██████╔╝╚█████╔╝██║░░██║███████╗██║░░██║╚█████╔╝      ██████╔╝███████╗  \r\n"
						+ "╚═╝░░░░░░╚═════╝░░╚════╝░╚═╝░░╚═╝╚══════╝╚═╝░░╚═╝░╚════╝░      ╚═════╝░╚══════╝  \r\n"
						+ "\r\n" + "██╗░░░░░███████╗████████╗██████╗░░█████╗░░██████╗\r\n"
						+ "██║░░░░░██╔════╝╚══██╔══╝██╔══██╗██╔══██╗██╔════╝\r\n"
						+ "██║░░░░░█████╗░░░░░██║░░░██████╔╝███████║╚█████╗░\r\n"
						+ "██║░░░░░██╔══╝░░░░░██║░░░██╔══██╗██╔══██║░╚═══██╗\r\n"
						+ "███████╗███████╗░░░██║░░░██║░░██║██║░░██║██████╔╝\r\n"
						+ "╚══════╝╚══════╝░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚═╝╚═════╝░");
		System.out.println("");
		System.out.println("Pulsa ENTER para comenzar");
		comprobar = sn.nextLine();
		if (comprobar == "") {
			
			
			
		int i=0;
		for (i = 0; i < 10; i++) {
	           for (int j = 0; j < 10; j++) {
	               sopa[i][j] = '-';
	           }
	       }
			 for (i = 0; i < 4; i++) {
		            System.out.println("Ingrese una palabra: ");
		            String palabra = sn.nextLine().toUpperCase();
		           
		            while (palabra.length() <= 2 || palabra.length() > 10) {
		                System.out.println("Palabra no válida. Ingrese una palabra de entre 3 y 10 caracteres: ");
		                palabra = sn.nextLine().toUpperCase();
		            }
		           
		            
		            aux = palabra;
		            palabras[i] = aux;

			biblioteca.GenerarSopa(sopa, palabra, i);
			
			 }
			 
			 
			biblioteca.visualizarsopa(sopa);
			
			
			System.out.println("Pulsa ENTER para rellenar la sopa de letras.");
			comprobar = sn.nextLine();
			
			if (comprobar == "") {
				biblioteca.rellenar(sopa);
				biblioteca.visualizarsopa(sopa);
			}
			
			
			int contador = 0;
          

            while (contador < 4) {

                System.out.print("Introduce una palabra que creas que está en la sopa de letras: ");
                String palabraComprobar = sn.nextLine().toUpperCase();
                
                contador = biblioteca.comprobarPalabra(sopa, palabras, palabraComprobar, contador);
                
                if (contador==4) {
                	System.out.println("Enhorabuena has encontrado todas las palabras!");
                }
                
            }
		}
	}
}



