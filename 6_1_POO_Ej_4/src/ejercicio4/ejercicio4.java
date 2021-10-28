package ejercicio4;

import ejercicio4.entidades.rectangulo;
import servicios.servicios_ejercicio4;
//import java.util.Scanner;

public class ejercicio4 {

    /*Se pueden colocar atributos o bien declaraciones de objetos primitivos o 
    definidos.*/
    public static void main(String[] args) {
        servicios_ejercicio4 rec_servicio=new servicios_ejercicio4();
        rectangulo rec1=rec_servicio.CrearRectangulo();

        System.out.println("La superficie: " + rec_servicio.superficie(rec1));
        System.out.println("El perimetro: " + rec_servicio.perimetro(rec1));
        System.out.println("\nRectangulo");
        rec_servicio.dibujar(rec1);
    }
}
