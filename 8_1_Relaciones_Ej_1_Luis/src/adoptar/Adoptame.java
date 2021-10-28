/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adoptar;

import adoptar.entidades.Perro;
import adoptar.entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Adoptame {

    
    public static void main(String[] args) {
        Persona individuo1=new Persona();
        Persona individuo2=new Persona();
        Perro can=new Perro();
        Perro can2=new Perro();
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        System.out.println("Perro 1");
        System.out.print("Ingrese nobmre de perro:");
        can.setNombre(leer.next());
        System.out.print("Ingrese raza de perro:");
        can.setRaza(leer.next());
        System.out.print("Ingrese edad : ");
        can.setEdad(leer.nextInt());
        System.out.print("Ingrese tamaño:");
        can.setTamaño(leer.nextInt());
        System.out.println("Perro 2");
        System.out.print("Ingrese nobmre de perro:");
        can2.setNombre(leer.next());
        System.out.print("Ingrese raza de perro:");
        can2.setRaza(leer.next());
        System.out.print("Ingrese edad : ");
        can2.setEdad(leer.nextInt());
        System.out.print("Ingrese tamaño:");
        can2.setTamaño(leer.nextInt());
        
        individuo1.setCanino(can);
        individuo2.setCanino(can2);
        System.out.println("nombre del dueño: ");
        individuo1.setNombre(leer.next());
        System.out.println("Apelldo: ");
        individuo1.setApellido(leer.next());
        System.out.println("Edad:");
        individuo1.setApellido(leer.next());
        System.out.println("DNI:");
        individuo1.setDocumento(leer.nextInt());
        
        
        System.out.println("Individuo 1:");
        System.out.println(individuo1.toString());
        System.out.println("Individuo 2: ");
        System.out.println(individuo2.toString());
        System.out.println("Canino 1:");
        System.out.println(can.toString());
        System.out.println("Canino 2:");
        System.out.println(can2.toString());
        
    }
    
}
