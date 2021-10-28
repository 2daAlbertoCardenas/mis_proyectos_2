package mascotapp.entidades;

import java.util.Date;//importado "Date".

public class Usuario {
//SE ingresan atributos/ valores de intanciación para Deitel.
    public String nombre;
    public String apellido;
    public int dni;
    public Date nacimiento;
    public String pais;

    public Usuario(String nombre, String apellido, int dni, Date nacimiento, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }

    public Usuario() {
    }
    
    
}
