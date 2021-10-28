
package ejemplovideos;

import java.util.Scanner;

public class EjemploVideosV6Errores {

   public static void main(String[] args) {
        
        int resultado=suma(10,10);
        int acumulador=0;

        for(int i=0;i<10;i++){
            acumulador=acumulador+i;//En este caso se insita al alumno al uso de
                                    //Debug para encontrar errores de lógica de 
                                    //programación.
            //System.out.println(acumulador);
            
        }
        System.out.println(acumulador);
        
    }
    
    public static int suma(int a,int b){
        //Logica
        int c=a+b;//reemplazo de "int" por "double".
                     //con el fín de corroborar los errores 
                     //que si son visibles y cuáles no.
        return c;
    }
    
    
    public static void saludoPersonilizado(String nombre) {
        System.out.println("Hola "+nombre+" como estas?");
    }
    
}
