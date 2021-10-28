package ejercicio12;
import ejercicio12.servicio.Pers_Serv;
import java.util.Scanner;
/**
 *
 * @author Cristian
 */
public class ejercicio12 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Pers_Serv datos=new Pers_Serv();
        datos.Crear_Persona();
        datos.Calcular_Edad();
        System.out.print("<<<<< USUARIO 2 >>>>>\n"+"*Edad:");
        datos.Menor_Que(leer.nextInt());   
        datos.Mostrar_Personal();
    } 
}

