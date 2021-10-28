/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razas_perros.servicios;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import razas_perros.entidades.Raza;

/**
 *
 * @author luis
 */
public class Servicios {
    private Scanner leer;
    private List<Raza> raza_perro;

    public Servicios() {
        this.leer=new Scanner(System.in).useDelimiter("\n");
        this.raza_perro=new ArrayList();
    } 
    
    public void introducir_dato(){
        String caracter="s";
        
        do { 
            System.out.print("Introduce una raza de perro:");
            Raza r1=new Raza();
            r1.setNombre_raza(leer.next());
            raza_perro.add(r1);
            System.out.println("Desea introducir otra raza?,elija (n)para salir");
            caracter=leer.next();
            if("n".equals(caracter)){
                break;
            }
        } while (true);
        
    }
    public void mostrar_razas(){
        System.out.println("Las razas actuales en la lista:");
        for (Raza object : raza_perro) {
            System.out.println(object.toString());
        }
        System.out.println("cantidad= "+raza_perro.size());
    }
}
