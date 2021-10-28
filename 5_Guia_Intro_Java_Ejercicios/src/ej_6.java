
import java.util.Scanner;

/**/
public class ej_6 {
    public static void main(String[] args) {
        int nro;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese numero eentero: ");
        nro=entrada.nextInt();
        System.out.println("el doble es "+(nro*2));
        System.out.println("El triple es "+(nro*3));
        System.out.println("El cuadrado es "+(Math.sqrt(nro)));
    }
    
}
