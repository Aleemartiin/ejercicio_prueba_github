package ej7;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el coeficiente 'a':");
        double a = scanner.nextDouble();

        System.out.println("Ingrese el coeficiente 'b':");
        double b = scanner.nextDouble();

        System.out.println("Ingrese el coeficiente 'c':");
        double c = scanner.nextDouble();

        Raices ecuacion = new Raices(a, b, c);
        ecuacion.calcular();

        scanner.close();
    }
}
