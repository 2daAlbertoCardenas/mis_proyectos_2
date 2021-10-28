package mascotapp.entidades;

public class Mascota {

    //Se ingresan los atributos/valores de instancia para Deitel.
    private String nombre;
    public String apodo;
    //Conejo, Gato, Perro, Loro, Carpincho.
    public String tipo;
    public String color;
    public int edad = 5;
    public boolean cola;
    public String raza;
    
    private int energia= 1000;

    //costructorer
    public Mascota() {
        this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;//asignamos this hace referencia al atributo/variable
        //variable de instacia, this hace refencia a está
        //clase por lo cuál toma valores solo de está clase.
        this.apodo = apodo;
        //Se puede poner en los constructores condicionales de control IMPORTANTE
        if (tipo.equals("Perro") || tipo.equals("Gato")) {
            this.tipo = tipo;
        }
        this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.energia = 1000;
    }
    public void setNombre(String nombre){
        if(nombre.length()>0){//longitud del nombre
    this.nombre=nombre;//lógica de validación.
        }
    
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }
    /**
     * Función destinada a pasear
     * 
     * 
     * @param energiaRestar
     * @return energia 
     */
    public int pasear(int energiaRestar){
       //this.energia= energia-energiaRestar;
        energia-=energiaRestar;
        
        return energia;
    }
    /**
     * 
     * @param energiaRestar
     * @param vueltas
     * @return energia
     */
    public int pasear(int energiaRestar, int vueltas){
        for (int i = 0; i < vueltas; i++) {
            energia-=energiaRestar;
        }
        
        return energia;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }
    
    
    
}
