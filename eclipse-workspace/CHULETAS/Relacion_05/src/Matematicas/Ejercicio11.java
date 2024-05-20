package Matematicas;

import java.util.Scanner;

/**
 * Funciones
 * 
 * 11. Escribe un programa que pase de binario a decimal.
 * 
 */


public class Ejercicio11 {
  
  public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);

    long decimal = 0;
    
    System.out.print("Introduzca un número binario: ");
    long binario = s.nextLong();
    
    int bits = Varias.digitos(binario);
    
    for(int i = 0; i < bits; i++) {
      decimal += Varias.digitoN(binario, bits - i - 1) *Varias.potencia(2, i);
    }
    
    System.out.println(binario + " en binario es " + decimal + " en decimal.");
    s.close();
  }
}