
import java.util.Scanner;

/* Crear un programa que dado un numero determine si es par o impar.*/
public class ej_8 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero entero:");
        int n=leer.nextInt();
        
        if(n%2==0)
        {
            System.out.println("El numero "+n+" es Par");
        }
        else
        {
            System.out.println("El numero "+n+" es Impar");
        }
        
    }
    
}
