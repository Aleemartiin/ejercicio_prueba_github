package dbrusev;

// Clase CuentaCorriente.java
public class Cuenta {
    
    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public boolean retirar(double cantidad) {
        boolean retirado = false;
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            retirado = true;
        }
        return retirado;
    }

    public double getSaldo() {
        return saldo;
    }
}