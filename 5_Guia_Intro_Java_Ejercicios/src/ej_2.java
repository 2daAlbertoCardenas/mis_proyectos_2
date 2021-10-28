
import java.util.Scanner;

/*
 Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
 */

public class ej_2 {
    
    public static void main(String[] args) {
        int a,b;
        System.out.println("Ingrese dos numeros para la sumarlas.");
        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese nro A:");
        a=entrada.nextInt();
        System.out.print("Ingrese nro B:");
        b=entrada.nextInt();
        System.out.println("La suma es "+(a+b));
        
    }
    
}
