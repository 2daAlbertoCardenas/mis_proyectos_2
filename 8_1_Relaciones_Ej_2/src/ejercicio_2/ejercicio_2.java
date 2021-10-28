package ejercicio_2;

import ejercicio_2.entidades.Juego;
import ejercicio_2.entidades.Jugador;
import ejercicio_2.entidades.Revolver_de_agua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Revolver_de_agua datos_1 = new Revolver_de_agua();

        Integer cantidad_jugador = 0;
        do {
            System.out.print("Ingrese la cantidad de jugador (1 a 6):");
            cantidad_jugador = leer.nextInt();
        } while (cantidad_jugador < 1 || cantidad_jugador > 6);

        Revolver_de_agua Usar_Jugador = datos_1.llenarRevolver();
        System.out.println(Usar_Jugador.toString());
        
        System.out.println("");

        ArrayList<Jugador> Pasar = new ArrayList();
        for (int i = 0; i < cantidad_jugador; i++) {
            Jugador datos_2 = new Jugador();
            datos_2.setNombre("Jugador");
            datos_2.setId(i + 1);
            Pasar.add(datos_2);
        }
        
        Juego datos_3=new Juego();
        datos_3.llenarJuego(Pasar, Usar_Jugador);
        System.out.println("\t\t<<<<< COMIENZA EL JUEGO >>>>>");
        datos_3.ronda(Usar_Jugador);
    }
}

