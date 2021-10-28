package ejercicio_1.entidades;

/**
 *
 * @author Cristian
 */
public class Animal {

    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String Raza;

    public Animal(String nombre, String alimento, Integer edad, String Raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.Raza = Raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }
    
    public void alimentarse(){
        System.out.println(this.nombre+" se alimenta de "+this.alimento);
    }
    
}

