package extra1;
import extra1.entidades.Cancion;
/**
 *
 * @author Cristian
 */
public class extra1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion cn=new Cancion();
        cn.cargar();
        System.out.println(cn);
    }
}
