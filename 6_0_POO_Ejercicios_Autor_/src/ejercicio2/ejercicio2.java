/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import ejercicio2.entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Circunferencia c1 = new Circunferencia(0,0,0);
        System.out.print("Ingrese radio:");
        c1.setRadio(leer.nextDouble());
        c1.area();
        c1.perimetro();
        System.out.println("AREA:\t"+c1.getA());
        System.out.println("PERIMETRO:\t"+c1.P);
        
    }
}
