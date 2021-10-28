package video_collection_mascotapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import video_collection_mascotapp.servivios.ServicioMascota;

public class MascotaAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ServicioMascota servMasc = new ServicioMascota();//se pueden hacer otro servio
        //pero es para cuando haya varios
        //serviores.
        //servMasc.fabricaChiquitos(40);
        /*
          servMasc.fabricaMascota(2);
          servMasc.mostrarMascotas();
          servMasc.actualizarMascota(0);
          servMasc.mostrarMascotas();
          servMasc.eliminarMas(6);
         */
        String[] nombres={"Pepe","Pepa"};
        List <String> nombresList=new ArrayList(Arrays.asList(args));
        
        List <String> nombresList2=new ArrayList();
        nombresList2.addAll(nombresList);
    }

}
