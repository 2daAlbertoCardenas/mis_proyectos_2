/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.servicios;

import ejercicio5.entidades.Cuenta_Bancaria;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Cuenta_Bancaria_Servicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Cuenta_Bancaria datoscliente (){
        System.out.println("BIENVENIDO AL BANCO EGG");
        System.out.println("Para iniciar sesion ingrese los siguentes datos");
        System.out.println("Ingrese numero de cuenta: ");
        int numeroCuenta=leer.nextInt();
        
        System.out.println("Ingrese el DNI: ");
        long DNICliente=leer.nextLong();
        return new Cuenta_Bancaria(numeroCuenta, DNICliente);
    }
}
