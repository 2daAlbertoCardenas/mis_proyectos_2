/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author luis
 */
public class Cuenta {
    private int nro_cuenta;
    private long dni;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(int nro_cuenta, long dni, double saldo) {
        this.nro_cuenta = nro_cuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    public int getNro_cuenta() {
        return nro_cuenta;
    }

    public long getDni() {
        return dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNro_cuenta(int nro_cuenta) {
        this.nro_cuenta = nro_cuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Cuenta{" + "nro_cuenta=" + nro_cuenta + ", dni=" + dni + ", saldo=" + saldo + '}';
    }
    
    
    
}
