package Ejercicio1;


import java.util.Scanner;

public class CargarLibro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Libro priLibro= new Libro();
        System.out.println("Ingrese Título: ");
        priLibro.titulo=leer.next();
        System.out.println("ingres ISBN: ");
        priLibro.ISBN=leer.nextInt();
        System.out.println("Ingrese paginas: ");
        priLibro.numero_de_paginas=leer.nextInt();
        System.out.println("ingrese autor: ");
        priLibro.autor=leer.next();
        mostrar(priLibro);
    }
        
        static void mostrar(Libro book) {

        System.out.println("autor: " + book.getAutor());
        System.out.println("ISBN: " + book.getISBN());
        System.out.println("Paginas: " + book.getNumero_de_paginas());
        System.out.println("titulo: " + book.getTitulo());
    }
        
    
    
    
}
