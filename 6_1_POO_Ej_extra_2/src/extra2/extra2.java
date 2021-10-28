package extra2;
import extra2.entidades.Puntos;
/**
 *
 * @author Cristian
 */
public class extra2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Puntos P=new Puntos();
        P.Crear_Puntos();
        System.out.println("Las Distancia: "+P.Calcular_Distancia());
    }
}

