package ejercicio_1;
import ejercicio_1.entidades.Perro;
import ejercicio_1.entidades.Persona;

/**
 *
 * @author Cristian
 */
public class ejercicio_1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro m1 = new Perro("Fer", "Beagle", 6, "Mediano");
        Perro m2 = new Perro("Pepa", "Ovejero", 8, "Grande");
        
        Persona p1=new Persona("Cristian", "Condori", 25, 39086894, m2);
        Persona p2=new Persona("Lucia", "Sanchez", 23, 40764908, m1);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }   
}

