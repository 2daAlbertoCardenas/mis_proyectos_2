
package video_collection_mascotapp.servivios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import video_collection_mascotapp.entidades.Mascota;

public class ServicioMascota {
    private final Scanner leer;
    
    private List<Mascota> lista;
    
    /**
     * Servicio mascota es el contructor que me permite inicializar esta Lsit con 
     * tipo primitilvo String la lista mascota.
     */
    
    public ServicioMascota(){
        this.leer=new Scanner(System.in).useDelimiter("\n");
        this.lista=new ArrayList();
    }
    public Mascota CrearMascota(){//Metodo.
        System.out.println("Introducir nombre");
        String nombre= leer.next();
        System.out.println("Ingrese apodo ");
        String apodo=leer.next();
        
        System.out.println("Introducir tipo");
        String tipo=leer.next();
        
        Mascota m=new Mascota(nombre, apodo, tipo);
        
        lista.add(m);
        lista.
        //Se guarda un cadena String que es la suma de nombre +
        //apodo + tipo y esté conjuto se guarda en una ArrayList.
        //mascotas.add(nombre+" "+apodo+" "+tipo);
        return m; 
        
    }
    public void mostrarMascotas(){
        System.out.println("Las mascotas de la Lista Mascotas son ");
        //Se recorre sobre la lista "mascotas" y este forma de aplicación
        //me permite de forma dinamica mostrar los valores de la ArratList.
        for (Mascota aux : lista) {
            System.out.println(aux.toString());
        }
        System.out.println("cantidad=  " + lista.size());
    }
    /**
     * 
     * @param cantidad equivale a la cantidad de mascotas a crear y 
     * añadir a la lista.
     */
    public void fabricaChiquitos(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            lista.add(new Mascota("JAC","Chiqui","Beagle"));
        }
 
    }
    
    
    /**
     * Crea mascota pideindo por tecldo
     * @param cantidad 
     */
    public void fabricaMascota(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            Mascota pichichusCreatus=CrearMascota();
            System.out.println(pichichusCreatus.toString());
        }
    }
}
