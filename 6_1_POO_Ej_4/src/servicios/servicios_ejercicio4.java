
package servicios;

import ejercicio4.entidades.rectangulo;
import java.util.Scanner;

public class servicios_ejercicio4 {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public rectangulo CrearRectangulo() {
        System.out.println("Ingrese base: ");
        int base = leer.nextInt();
        System.out.println("Ingrese altura: ");
        int altura = leer.nextInt();
        return new rectangulo(base, altura);
    }

    public double superficie(rectangulo rec1) {
        return rec1.getBase() * rec1.getAltura();
    }

    public double perimetro(rectangulo rec1) {
        return (rec1.getAltura() + rec1.getBase()) / 2;
    }

    public void dibujar(rectangulo r1) {
        for (int i = 0; i < r1.getAltura(); i++) {
            for (int j = 0; j < r1.getBase(); j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
      
    }
}
