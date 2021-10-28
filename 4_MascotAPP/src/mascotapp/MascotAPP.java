
package mascotapp;

//import mascotapp.entidades.Perro; (ejemplo)

import java.util.Scanner;
import mascotapp.entidades.Mascota; //Alt+ enter se importa si estoy sobre la linea de codigo
import mascotapp.servicios.ServicioMascota;

/*Se considerá que tiene dos clases uno el principal de donde parte y la otra el
molde.
Clase principal "mascotapp, y el molde "Perro".*/

public class MascotAPP {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        //-------------------------------------------------------------------
        //                  Primera etapa(tiempo)
       /*
        Perro pl=new Perro();//estoy llamando a la clase "Perro". Asignandole 
                             //pl=perro.
                              //El foquito que me marca java no reconoce como 
                              //una clase predefinida en java. 
                              
        Perro p2=new Perro();//Todavía no tiene valores.
       */ 
       //---------------------------------------------------------------------
       //                       Segunda etapa(tiempo)
       /*
       Mascota m1=new Mascota();//Se intancia un objeto
                                //Mascota(Se asigna) m1=new Mascota();(se llama 
                                //a la clase que da inicio al olbjeto Mascota.)
                                
      m1.apodo="chiquito"; //Con (.) puedo acceder al los 
                            //atributos/caracteristicas.
       */
      /*Se hace mención de que se accede de forma directa, es decir eque el tipo
      tipo de acceso el publico "public", es un modificador/modificador de 
      acceso.*/
     // m1.nombre=leer.next();//next me devuelve un string de lo que teclee en 
                            //el teclado y se asigna a la variable "m1".
     /* m1.tipo="Perro";
      m1.edad= 14;
      m1.raza="Beagle";
      m1.cola=true;
      m1.color= "Tricolor";
      */
     /* Aclaracion "m2=new Mascota;" se crea otro objetos 
      que en el clase principal se llama variable y que está en referencia 
      al la dirección de la plantilla "clase Mascota;"
      */
     //             Hata aquí, esto se útilizo antes de concepto "CONSTRUCTOR"
     //-------------------------------------------------------------------------
     Mascota m1=new Mascota("Fernado vetdo","cholito", "Perrro");
       // System.out.println("Nombre: "+m1.nombre+" Apodo: "+m1.apodo+" Edad: "+m1.edad+" Tipo: "+m1.tipo);
      m1.setNombre("Pepon");
        System.out.print("nombre: ");
        System.out.println(m1.getNombre());
        System.out.println("Se obtiene aplicando un setNombre para cambiar el private");
        System.out.println(m1);//El espacio de memoria donde esta asignada está 
                               //variable.
        System.out.println(m1.toString());//otra forma de 
        //poner toString()
        System.out.println("-------------------------------");
        System.out.println("");
        m1.pasear(100);
        System.out.println(m1.toString());
     //--------------------------------------------------------------------------
     //----------------------conectado de servicioMascota----------------------
        System.out.println("--------Se aplica el concepto de servicios----------");
     
     //Creo un servicio desde el main un objeto correspontidnte a servicioMascota

     ServicioMascota sm=new ServicioMascota();//TEngo acceso a los metodos que 
                                              //tiene esté servicio.
     Mascota m2=sm.crearMascota();
     
        System.out.println(m2.toString());
        
        //Un objeto no se crea a si mismo según la logica
        
        m2= null;//eso se aplica a otras pero tambien a java es opcional.
        
    }
    
    
}
    