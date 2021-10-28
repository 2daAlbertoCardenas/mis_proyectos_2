package video_collection_mascotapp;

import java.util.ArrayList;
import video_collection_mascotapp.servivios.ServicioMascota;

public class MascotaAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//------------------------------------------------------------------------------
//        
//          Array
//        String[] nombresArray=new String[5];
//        for (int i = 0; i < nombresArray.length; i++) {//array de forma dinamica.
//            nombresArray[i]="Chiquito "+(i+1);
//        }
//        for (String var : nombresArray) {
//            System.out.println(var);
//            
//        }
//        //Collection, está precisamente empieza con dimension cero.
//        ArrayList<String> nombresArrayList;
//        nombresArrayList = new ArrayList();
//        nombresArrayList.add("Chiquito ");
//        nombresArrayList.add("Chiquito ");
//        nombresArrayList.add("Chiquito ");
//        System.out.println("Tamaño "+nombresArrayList.size());
//        
//        nombresArrayList.remove("Chiquito ");
//        System.out.println("tamaño"+nombresArrayList.size());
//        
//        System.out.println(Integer.MAX_VALUE);
//-------------------------------------------------------------------------------
        ServicioMascota servMasc=new ServicioMascota();//se pueden hacer otro servio
                                                        //pero es para cuando haya varios
                                                        //serviores.
        //servMasc.fabricaChiquitos(40);
        servMasc.fabricaMascota(2);
        servMasc.mostrarMascotas();

    }

}
