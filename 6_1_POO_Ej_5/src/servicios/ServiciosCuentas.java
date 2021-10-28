/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author luis
 */
public class ServiciosCuentas {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cuenta CrearCuenta(){
        System.out.print("Ingrese nro de cuenta: ");
        int nro_cuenta=leer.nextInt();
        System.out.print("Ingrese dni: ");
        long dni=leer.nextLong();
        System.out.print("Ingrese saldo: ");
        double saldo=leer.nextDouble();
        return new Cuenta(nro_cuenta,dni,saldo);
    }
    
    public void IngresoSaldo(Cuenta sujeto){
        System.out.print("ingrese dinero: ");
        sujeto.setSaldo(sujeto.getSaldo()+leer.nextDouble());
       
    }
    public void RetiroSaldo(Cuenta sujeto){
        System.out.print("Ingrese cantidad a retirar: ");
        double cantidad=leer.nextDouble();
        if (sujeto.getSaldo()<=cantidad) {
            sujeto.setSaldo(0.0);
        } else {
           
            sujeto.setSaldo(sujeto.getSaldo()-cantidad);
        } 
    }
//    public void consulta(Cuenta sujeto){
//        System.out.println("saldo actual: $"+sujeto.getSaldo());
//    }
    
}
