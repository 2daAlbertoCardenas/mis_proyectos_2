/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.entidades;

/**
 *
 * @author Cristian
 */
public class Circunferencia {

    private double radio;
    private double A;
    public double P;


    public Circunferencia(double radio, double A, double P) {
        this.radio = radio;
        this.A = A;
        this.P = P;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getRadio() {
        return radio;
    }

    public double getA() {
        return A;
    }
    
    public double area(){
        A=3.1416*radio*radio;
        return A;
    }
    
    public double perimetro(){
        P=2*3.1416*radio;
        return P;
    }
    
}
