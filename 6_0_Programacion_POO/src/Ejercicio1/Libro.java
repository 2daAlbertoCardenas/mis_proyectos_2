package Ejercicio1;

public class Libro {
    protected int ISBN;
    protected String titulo;
    protected int numero_de_paginas;
    protected String autor;

    public Libro(int ISBN, String titulo, int numero_de_paginas,String autor) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.numero_de_paginas = numero_de_paginas;
        this.autor=autor;
    }

    public Libro() {
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumero_de_paginas() {
        return numero_de_paginas;
    }

    public String getAutor() {
        return autor;
    }
    
  
}
