//Collection video V1
package mascotapp;

//import mascotapp.entidades.Perro; (ejemplo)

import java.util.ArrayList;
import java.util.Scanner;

public class MascotAPP {

    public static void main(String[] args) {
        String[] nombresArray=new String[5];
        
        for(int i=0;i<nombresArray.length;i++){
            nombresArray[i] = "chiquito" + (i + 1);
        }
        for (String var : nombresArray) {
            System.out.println(var);
        }
        //Collection
        /*Tiene que hacer nacer a nombresArrayList
        con la palabra "new".*/
        ArrayList<String> nombresArrayList = new ArrayList();
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        System.out.println(nombresArrayList.size());
        
        nombresArrayList.remove("Chiquito");
        
        System.out.println(nombresArrayList.size() );


    }
    
    
}
    