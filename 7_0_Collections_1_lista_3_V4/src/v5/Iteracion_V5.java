package v5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.lang.model.element.NestingKind;
import video_collection_mascotapp.servivios.ServicioMascota;

public class Iteracion_V5 {

    public static void main(String[] args) {
//        List<String> nombres = new ArrayList();
//        nombres.add("Lola");
//        nombres.add("Rodman");
//        nombres.add("Chiquito");
//-------------------------------------------------------------------
//                          Para mostrar
//        for(String aux:nombres){
//            System.out.println(aux);
//        }
//        for (int i = 0; i < nombres.size(); i++) {
//            System.out.println(nombres.get(i));
//        }
//---------------------------------------------------------------
//        Buscar para entender como mostrar
//        En este caso e= variable auxiliar.
//        nombres.forEach((e) -> System.out.println(e));
//-----------------------------------------------------------------
//        Averiguar las demas funcionalidades.
//        nombres.stream().flatMap(fnctn);
//-----------------------------------------------------------------
//        para eliminar.Error no se puede eliminar por que se reduce idex.
//        for (String aux : nombres) {
//            if (aux.equals("Lola")) {
//                nombres.remove(aux);
//                  
//            }
//        }
//-------------------------------------------------------------------------
//        //Nota mantener todo atado de forma dinamica.
//        for (int i = 0; i < nombres.size(); i++) {
//            String m=nombres.get(i);
//            if (m.equals("Lola")) {
//                nombres.remove(m);
//            }
//        }
//        System.out.println("___________________________");
//---------------------------------------------------------------------------
//                  Uso de Iterator se uso para lista enlazadas.
        //Iterator<String> it=nombres.iterator();
        //1ro
//        while (it.hasNext()) {
//            String next = it.next();
//            System.out.println(next);
//            
//        }
        //2do
//        while (it.hasNext()) {
//            String aux = it.next();
//            if(aux.equals("Rodman")){
//                it.remove();
//            }
//        }
//        nombres.forEach((e) -> System.out.println(e));
//----------------------------------------------------------
        ServicioMascota servMasc=new ServicioMascota();
        servMasc.fabricaMascota(1);
        servMasc.eliminarMascotaPorNombre("Lola");
        servMasc.mostrarMascotas();
    }

}
