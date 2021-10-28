/*Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.*/
import java.util.Scanner;


public class ej_10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la frase:");
        String frase = leer.next();
        if (frase.length()==8) {
            System.out.println("Correcto");

        } else {
            System.out.println("incorrecto");
        }
    }

}
