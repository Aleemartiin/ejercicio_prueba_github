package ej7;

public class Raices {
    private double a;
    private double b;
    private double c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void obtenerRaices() {
        double discriminante = getDiscriminante();
        if (discriminante >= 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las raíces son: " + raiz1 + " y " + raiz2);
        } else {
            System.out.println("No hay raíces reales.");
        }
    }

    public void obtenerRaiz() {
        double discriminante = getDiscriminante();
        if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("La única raíz es: " + raiz);
        } else {
            System.out.println("No hay una única raíz real.");
        }
    }

    public double getDiscriminante() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public boolean tieneRaices() {
        return getDiscriminante() >= 0;
    }

    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }

    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No hay raíces reales.");
        }
    }

}
