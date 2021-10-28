
import java.util.Scanner;

/*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.*/
public class ej_13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese nota del 0 al 10:");
        int nota=leer.nextInt();
        do {
            if (nota>=0&&nota<=10) {
                break;
            } else {
                System.out.print("ingrese nota valida de 1 al 10:");
                nota=leer.nextInt();
            }
            //System.out.println(nota>=0&&nota<=10?break;:"ingrese nota"+nota=leer.nextInt(););
        } while (true);
        System.out.println("La nota es "+nota+" es valida, gracias.");
    }
    
}
