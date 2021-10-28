package extra3;
import extra3.entidades.Raices;
import extra3.servicios.Raices_Servicios;

/**
 *
 * @author Cristian
 */
public class extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Raices_Servicios datos=new Raices_Servicios();
        Raices R = datos.cargar_valores();
        System.out.println(R);
        System.out.println("Valor Descriminante: "+datos.Descriminante());
        System.out.println("Tiene Raices?: "+datos.Tiene_Raices());
        System.out.println("Tiene Raiz?: "+datos.Tiene_Raiz());
        datos.Obtener_Raices();
        datos.Obtener_Raiz();
        datos.Calcular();
    }   
}

