
import java.util.Scanner;

/*Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.*/
public class ej_7 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese 2 nros:");
        int nro1 = leer.nextInt(), nro2 = leer.nextInt();
        System.out.println("El mayor es: " + Math.max(nro2, nro1));
    }
    
}
