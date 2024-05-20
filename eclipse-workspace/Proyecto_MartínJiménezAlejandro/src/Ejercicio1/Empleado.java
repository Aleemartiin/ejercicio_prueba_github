package Ejercicio1;
public class Empleado {

    private String nombre;
    private int aniosServicio;
    private int edad;
    
    public void imprimirDatosEmpleado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
        System.out.println("Años de Servicio: " + aniosServicio);
    }
    
    public Empleado(String a, double b, int c, int d) {
        this.nombre = a;
        this.salario = b;
        this.aniosServicio = c;
        this.edad = d;
    }

    public double calcular(double bonus) {
        bonus = 1.0;
        if (this.aniosServicio >= 10 && this.edad >60){
            bonus = salario *  1.5 * bonus;
        } else {
            bonus = salario * bonus;
        }
        return bonus;
    }
    
    public void COPIAR_DATOSEMPLEADO(Empleado E, boolean MODIFICAR_NOMBRE) {
        if (MODIFICAR_NOMBRE){
            this.salario = E.salario;
            this.aniosServicio = E.aniosServicio;
            this.edad = E.edad;
            this.nombre = E.nombre;
        } else {
            this.salario = E.salario;
            this.aniosServicio = E.aniosServicio;
            this.edad = E.edad;
        }  
    }
    
    
    private double salario;
    
    public int calcularDiasVacaciones() {
        if (this.aniosServicio >= 10 && this.edad >60) {
            return 25;
        } else {
            return 22;
        }
    }
    
    public boolean tieneReduccionJornada(){
         if (this.edad >60) {
            return true;
        } else {
            return false;
        }
    }
    
    public void imprimirDatosEmpleadoDetallado(double bonus) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
        System.out.println("Años de Servicio: " + aniosServicio);
        System.out.println("Salario con Bonificación: $" + calcular(bonus));
        System.out.println("Dias de Vacaciones: $" + calcularDiasVacaciones());
        if (tieneReduccionJornada()){
            System.out.println("El empleado tiene derecho a reducción de jornada");
        }else{
            System.out.println("El empleado no tiene derecho a reducción de jornada");
        }
        
       }
    
    public int calcularDiasAsuntosPropios(String estacion) {
        int x = 0; 
        if (estacion.equals("Verano")) {
            x =calcularDiasVacaciones();
            return x - 20 + 5;
        } else if (estacion.equals("Invierno")) {
            x =calcularDiasVacaciones();
            return x - 20 + 4;
        } else if (estacion.equals("Primavera")) {
            x =calcularDiasVacaciones();
            return x - 20 + 3;
        } else if (estacion.equals("Otoño")) {
            x =calcularDiasVacaciones();
            return x - 20 + 3;
        }
        return 0;
    }
    
}