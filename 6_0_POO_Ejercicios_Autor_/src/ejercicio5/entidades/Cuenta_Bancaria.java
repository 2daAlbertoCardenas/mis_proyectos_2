/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.entidades;

/**
 *
 * @author Cristian
 */
public class Cuenta_Bancaria {

    private int numeroCuenta;
    private long DNICliente;
    private double saldo;

    public Cuenta_Bancaria() {
        this.saldo = 5000;
    }

    public Cuenta_Bancaria(int numeroCuenta, long DNICliente) {
        this.numeroCuenta = numeroCuenta;
        this.DNICliente = DNICliente;
        this.saldo = 5000;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDNICliente(long DNICliente) {
        this.DNICliente = DNICliente;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDNICliente() {
        return DNICliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public double ingresar(double monto_i) {
        saldo += monto_i;
        return saldo;
    }

    public double retirar(double monto_r) {
        if (this.saldo < monto_r) {
            System.out.println("➪ Saldo Insufientes");
            return 0;
        } else {
            saldo -= monto_r;
            return saldo;
        }
    }

    public double extraccion_rapida(double monto_e) {
        if (monto_e <= (0.2 * this.saldo)) {
            this.saldo -= monto_e;
            return this.saldo;
        }
        System.out.println("➪ No puede extraer mas del 20% del saldo");
        return 0;
    }

    @Override
    public String toString() {
        return "Cuenta_Bancaria{" + "numeroCuenta=" + numeroCuenta + ", DNICliente=" + DNICliente + ", saldo=" + saldo + '}';
    }

}
