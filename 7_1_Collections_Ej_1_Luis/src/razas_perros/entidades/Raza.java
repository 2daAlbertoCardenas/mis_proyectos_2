/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razas_perros.entidades;

/**
 *
 * @author luis
 */
public class Raza {
    private String nombre_raza;

    public Raza() {
    }

    public Raza(String nombre_raza) {
        this.nombre_raza = nombre_raza;
    }

    public String getNombre_raza() {
        return nombre_raza;
    }

    public void setNombre_raza(String nombre_raza) {
        this.nombre_raza = nombre_raza;
    }

    @Override
    public String toString() {
        return "Raza{" + "nombre_raza=" + nombre_raza + '}';
    }
 
}
