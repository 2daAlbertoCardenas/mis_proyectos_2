
import java.util.Scanner;

/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.*/
public class ej_14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un valor limite:");
        int limite = leer.nextInt(),suma=0,i=1;
        do {
            System.out.println("Ingrese valor n°" + i);
            suma += leer.nextInt();
            if(suma>limite){
            break;}
            i = i + 1;
        } while (true);
        System.out.println("Se supero el limite ingresado, la suma es: "+suma);
    }
    
}
