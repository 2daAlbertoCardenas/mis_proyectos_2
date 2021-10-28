
import java.util.Scanner;

/* Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.*/
public class ej_4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la frase:");
        String frase=leer.next();
        System.out.println("Frase en mayuscula:"+frase.toUpperCase());
        System.out.println("Frase en minuscula:"+frase.toLowerCase());
    }
    
}
