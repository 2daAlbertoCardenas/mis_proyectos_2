package Ejercicio_2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class simple {

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
        
        System.out.println("\nIngrese el nombre a eliminar:");
        String eliminar=leer.next();
        boolean valor=false;
        Iterator<String>it=raza.iterator();
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equals(eliminar)) {
                it.remove();
                valor=true;
            }
        }
        if(valor){
            Collections.sort(raza);
            System.out.println(raza.toString());
        }else{
            System.out.println("\nNo se encontro el nombre de la raza de perro");
            Collections.sort(raza);
            System.out.println(raza.toString());
        }
    }
    
}



