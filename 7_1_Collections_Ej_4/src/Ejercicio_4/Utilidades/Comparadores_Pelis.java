package Ejercicio_4.Utilidades;

import Ejercicio_4.entidades.Peliculas;
import java.util.Comparator;

/**
 *
 * @author Cristian
 */
public class Comparadores_Pelis {
    public static Comparator<Peliculas>OrdDurAsc= new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
    
    public static Comparator<Peliculas>OrdDurDesc= new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    
    public static Comparator<Peliculas>Ord_Tit= new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t.getTitulos().compareTo(t1.getTitulos());
        }
    };
    
    public static Comparator<Peliculas>Ord_Direct= new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas t, Peliculas t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
}





