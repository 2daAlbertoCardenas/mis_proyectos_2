/*
 * En está clase se realizan los calculos lógicos para las clases,
 * o bien solo es destinado para la clase que se destina para la cuál 
 * se realiza la aplicación.
 */
package mascotapp.servicios;
//la parte de "macotapp.entidaddes" es el paquete de donde se saca,
//la parte de ".Mascota" es la clase.
import java.util.Scanner;
import mascotapp.entidades.Mascota;//Se importa los objetos de tipo Mascota.

public class ServicioMascota { //Este es un metodo/funciones que destinan a 
                               // realizar dicho proceso que quiero realizar
                               //calculos, lógica, etc.
    private Scanner leer =new Scanner(System.in).useDelimiter("\n");//atributo/varible global/variable de 
                                        //instanciación.
    public Mascota crearMascota(){//Llamada a un clase/objeto iniciaizado. 
                                  //Esta es una función.
                                  //Esté es un metodo especifico para crear 
                                  //Mascota.
        /*
         * Acá se piden los datos para cargarse en los distitos objetos 
         * que desarrollo.
         */
        System.out.println("Introducir nombre");
        String nombre= leer.next();//ingreso de variable nombre.
        System.out.println("INgrese apodo: ");
        String apodo= leer.next();
        System.out.println("Ingrese tipo: ");
        String tipo= leer.next();
        //------------------UNA FORMA DE HACERLO-------------------------------
        /*Mascota m=new Mascota(nombre, apodo,tipo);//Uso de constructor para la 
                                                  //creacción del objeto m(valor
                                                  //valor de referencia).
        return m; */
        //----------------OTRA FORMA DE HACERLO--------------------------------
        return new Mascota(nombre,apodo,tipo);//Devuelvo el nacimiento
                                            //de una "Mascota", que va ha tener
                                            //tales caracteristica nombre,apodo,
                                            //tipo,etc.
        //--------------------------------------------------------------------
        /*
        Las colecciones respecto a las matriz o vectore son dinaamicos 
        permitiendome redimendiciona, es decir tienen dimencion dinamica*/
        
    }
}
