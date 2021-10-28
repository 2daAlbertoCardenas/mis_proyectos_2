/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        operacion op1 = new operacion(0, 0);

        System.out.print("Ingrese numero 1:");
        op1.setNumero1(leer.nextInt());

        System.out.print("Ingrese numero 1:");
        op1.setNumero2(leer.nextInt());

        System.out.println("\nResultado");
        System.out.println("Suma: " + op1.suma());
        System.out.println("Resta: " + op1.resta());
        
        if (op1.multiplicacion() != 0) {
            System.out.println("Multiplicacion:" + op1.multiplicacion());
        } else {
            System.out.println("Multiplicacion: " + op1.multiplicacion() + " ➤Error al ingresar los numeros");
        }
        if (op1.division() != 0) {
            System.out.println("Division: " + op1.division());
        } else {
            System.out.println("Division: " + op1.division() + " ➤Error al ingresar los numeros");
        }

    }
}


    
    

