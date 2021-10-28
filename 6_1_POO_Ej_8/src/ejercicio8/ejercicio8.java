package ejercicio8;
import ejercicio8.servicio.Cadena_Servicio;
import java.util.Scanner;
/**
 *
 * @author Cristian
 */
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena_Servicio datos = new Cadena_Servicio();
        System.out.print("Ingrese frase o palabra:");
        datos.cargar(leer.next()); 
        datos.invertir_frase();
        System.out.println("La cantidad de vocales es : "+datos.Mostrar_Vocales());
        
        System.out.print("Ingrese el caracter a buscar:");
        System.out.println("El caracter se repite "+datos.Veces_Repetido(leer.next().toUpperCase()));
        
        System.out.println("Ingrese una nueva frase a comparar");
        datos.Comparar_Longitud(leer.next());
        
        System.out.println("Ingrese una nueva frase a unir ");
        datos.Unir_Frase(leer.next());
        
        System.out.print("Ingrese el caracter para remplazar las 'a':");
        datos.Reemplazar(leer.next());
        
        System.out.print("Ingrese el caracter a buscar:");
        datos.Contiene(leer.next());      
    }
}

