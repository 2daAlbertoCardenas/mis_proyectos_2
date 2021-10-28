/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import ejercicio1.entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro l1=new Libro(null,null,null,0);
        DatosLibro(l1);
        System.out.println("\nDatos del LIbro\t");
        MostrarDatos(l1);
        
    }
    /**
     * Cargamos los datas de los atributos(ISBN,autor,titulo y numpag)
     * @param l1 
     */
    public static void DatosLibro(Libro l1){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el codigo ISBN:");
        l1.ISBN=leer.next();
        System.out.print("Ingrese el Autor:");
        l1.autor=leer.next();
        System.out.print("Ingrese el Titulo:");
        l1.titulo=leer.next();
        System.out.print("Ingrese el Numero de paginas:");
        l1.numpag=leer.nextInt();
    }
    /**
     * Mostramos los valores cargado en el metodo anterior
     * @param l1 
     */
    public static void MostrarDatos(Libro l1){
        System.out.println("ISBN: \t"+l1.ISBN);
        System.out.println("Autor: \t"+l1.autor);
        System.out.println("Titulo: \t"+l1.titulo);
        System.out.println("Num de Pag: \t"+l1.numpag);
    }
}
