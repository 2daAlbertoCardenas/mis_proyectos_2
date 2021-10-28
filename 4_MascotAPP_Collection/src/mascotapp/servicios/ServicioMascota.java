/*Ejercicio de list1*/
package mascotapp.servicios;
//la parte de "macotapp.entidaddes" es el paquete de donde se saca,
//la parte de ".Mascota" es la clase.
import java.util.ArrayList;
import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class ServicioMascota { //Este es un metodo/funciones que destinan a 
                               // realizar dicho proceso que quiero realizar
                               //calculos, lógica, etc.
    private Scanner leer =new Scanner(System.in).useDelimiter("\n");//atributo/varible global/variable de 
                                        //instanciación.
    private ArrayList<String> mascotas;
    //"private List<String> mascotas;" también se puede hacer el objeto y 
    //después lo puedo hacer que nazca como ArrayList eso sería herencia.
    /*Cada ves que llamemos al servicio nuetro ArrayList va ha nacer*/ 
    
    
    public ServicioMascota(ArrayList<String> mascotas) {//Esta sería nuestro 
                                                        //constructor.
         this.leer =new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
        
    }

   
    public void crearMascota(){//Llamada a un clase/objeto iniciaizado. 
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
        
        String mascota=nombre+" "+apodo+" "+tipo;
        
        mascotas.add(mascota);// El String "Mascota" se guarda en el 
                              //Array mascota.
        //------------------UNA FORMA DE HACERLO-------------------------------
        /*Mascota m=new Mascota(nombre, apodo,tipo);//Uso de constructor para la 
                                                  //creacción del objeto m(valor
                                                  //valor de referencia).
        return m; */
        //----------------OTRA FORMA DE HACERLO--------------------------------
       // return new Mascota(nombre,apodo,tipo);//Devuelvo el nacimiento
                                            //de una "Mascota", que va ha tener
                                            //tales caracteristica nombre,apodo,
                                            //tipo,etc.
        //--------------------------------------------------------------------
        /*
        Las colecciones respecto a las matriz o vectore son dinaamicos 
        permitiendome redimendiciona, es decir tienen dimencion dinamica*/
        
    }
    public void mostrarMascota(){
        System.out.println("Las mascotas actuales de la Lista Mascota son ");         
        for(String aux:mascotas){
            System.out.println(aux);
        }
        System.out.println("cantidad= "+mascotas.size());
    }
}
