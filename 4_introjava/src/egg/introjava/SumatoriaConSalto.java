/*
SEntencia de salto.
Muestr n sumatorias de los primeros enteros partiendo desde 1, siendo N par
de un aviso si el usuario identifica un valor de N superior a 100 por 
ejecución lenta.
*/
package egg.introjava;

import java.util.Scanner;


public class SumatoriaConSalto {

   
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese un número entero positivo");
            num = leer.nextInt();
            if (num > 1000) {
                System.out.println("Este program podría tardar, ¿está seguro? (s/n)");
                String confirma = leer.next();
                if (confirma.equals("s")) {
                    break;//detiene el bucle y continúa con el próximo bloque.
                }
            }
        } while (num <= 0 || num > 1000);
        /*
        for(<inicialización>;<expresión_terminación>;<paso/incremento/decremento)*/
        int j, suma;
        System.out.println(num);

        for (int i = 1; i <= num; i++) {

            if (i % 2 != 0) 
            { continue;}  //detiene la iteración y salta a la siguiente.
            
            //System.out.println(i);
            suma = 0;
            j = 1;
            while (j <= i) {
                suma += j;
                j++;

            }
            System.out.println("La suma de los "+i+" números naturales es: " + suma);
        }

    }

}
