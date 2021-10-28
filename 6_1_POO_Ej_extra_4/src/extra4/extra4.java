package extra4;
import extra4.servicio.NIF_Servicios;
/**
 *
 * @author Cristian
 */
public class extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIF_Servicios datos=new NIF_Servicios();
        datos.crear_NIF();
        datos.Mostrar();
    }
}

