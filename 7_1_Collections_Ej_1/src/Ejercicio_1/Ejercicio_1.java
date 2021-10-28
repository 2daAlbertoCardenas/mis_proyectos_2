package Ejercicio_1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList <String> raza= new ArrayList();
        String dato;
        do{
            System.out.print("Ingrese la raza del perro:");
            raza.add(leer.next());
            System.out.println("¿Desea guardar otro perro?(S/N)");
            dato=leer.next();
        }while(dato.equals("S"));
        
        System.out.println("<<<<< Perros Guardados >>>>>");
        System.out.println("Cantidad: "+raza.size());
        System.out.println(raza.toString());       
    }   
}

