
package v6;

import java.util.ArrayList;
import java.util.Collections;
import v6.utilidades.Comparadores;
import video_collection_mascotapp.entidades.Mascota;

public class v6 {

    public static void main(String[] args) {
        //Como se crea un arreglo dentro de otro arreglo.
        //ArrayList<ArrayList<String>> matriz=new ArrayList();
        //El primer array es de columnas y el segundo que esta adentro es de filas.
        //-----------------------------------------------------
        ArrayList<Mascota> mascotas=new ArrayList();
        
        mascotas.add(new Mascota("Fer","Chiquito","Perro"));
        mascotas.add(new Mascota("Mariela","Chiquito","Perro"));
        mascotas.add(new Mascota("Fer","Chiquito","Perro"));
        mascotas.add(new Mascota("Fer","Chiquito","Perro"));
        mascotas.add(new Mascota("Pepa","Lola","Gato"));
        mascotas.add(new Mascota("Lucas","Lola","Gato"));
        mascotas.add(new Mascota("Pepa","Lola","Gato"));
        Collections.sort(mascotas,Comparadores.ordenarPorNombreDesc );
        
        
        Collections.shuffle(mascotas);
        for (Mascota mascota : mascotas) {
            System.out.println(mascota);
        }
    }
    
}
