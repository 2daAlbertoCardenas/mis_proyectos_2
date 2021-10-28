package Ejercicio_4;

import Ejercicio_4.Utilidades.Comparadores_Pelis;
import Ejercicio_4.entidades.Peliculas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Peliculas datos = new Peliculas();
        ArrayList<Peliculas> unificar = new ArrayList();
        String verif;
        
        do{
            Peliculas Datos_Creados=datos.Crear();
            unificar.add(Datos_Creados);
            System.out.println("¿Desea guardar otro perro?(S/N)");
            verif = leer.next();
        }while(verif.equals("S"));
        
        System.out.println("\n<<<<< DATOS PELICULAS >>>>>");
        unificar.forEach((a)->System.out.println(a));
        
        System.out.println("\n<<<<< PELICULAS MAYOR 1HORAS >>>>>");
        for (Peliculas aux : unificar) {
            if(aux.getDuracion()>1){
                 System.out.println("Titulo: "+aux.getTitulos()+" Director: "+aux.getDirector()+" Duración: "+aux.getDuracion()+" horas");
            }
        }
        
        System.out.println("\n<<<<< DURACION MAYOR A MENOR >>>>>");
        Collections.sort(unificar, Comparadores_Pelis.OrdDurDesc);
        unificar.forEach((a)->System.out.println(a));
        
        System.out.println("\n<<<<< DURACION MENOR A MAYOR >>>>>");
        Collections.sort(unificar, Comparadores_Pelis.OrdDurAsc);
        unificar.forEach((a)->System.out.println(a));
        
        System.out.println("\n<<<<< ORDEN ALFABETICO TITULOS >>>>>");
        Collections.sort(unificar, Comparadores_Pelis.Ord_Tit);
        unificar.forEach((a)->System.out.println(a));
        
        System.out.println("\n<<<<< ORDEN ALFABETICO DIRECTORES >>>>>");
        Collections.sort(unificar, Comparadores_Pelis.Ord_Direct);
        unificar.forEach((a)->System.out.println(a));
    }
    
}




