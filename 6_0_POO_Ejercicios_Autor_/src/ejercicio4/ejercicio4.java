/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import ejercicio4.entidades.rectangulo;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        rectangulo r1=new rectangulo(0,0);
        System.out.print("Ingrese la Base: ");
        r1.setBase(leer.nextDouble());
        System.out.print("Ingrese la Altura: ");
        r1.setAltura(leer.nextDouble());
        System.out.println("La superficie: "+r1.superficie());
        System.out.println("El perimetro: "+r1.perimetro());
        System.out.println("\nRectangulo");
        dibujar(r1);
    }
    public static void dibujar(rectangulo r1){
        for (int i = 0; i < r1.getAltura(); i++) {
            for (int j = 0; j < r1.getBase(); j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
