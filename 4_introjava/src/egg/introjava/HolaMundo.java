/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.introjava;//nos permiten empaquetar un conjunto de programas
                      //con un mismo fin, es decir organizar en carpetas 
                      //ej. paquetes de entidades, paquete de servicios, etc.
                      //es decir un conjunto de funcionalidades similares.
                      //Cabe aclarar para ingresar a la clase primero se debe 
                      //importar el paquete donde esta contenido la clase.

import java.util.Scanner;//"Scanner" es la clase del paquete "java.util"

public class HolaMundo {//
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//metodo main(lo primero que se
                                            //ejecta), el metodo es lo mismo
                                            //que un función. La diferencia 
                                            //radica que dentro de la clase se 
                                            //llama metodo.
                                            //"String[] args" son los parametros
                                            //que se reciben de la linea de
                                            //comandos.
    //--------------------------------------------------------------------------                                        
    //Se crea una varible Scanner que se utiliza para leer datos del usuario.
    //Se aclara que "Scanner" es una clase, que permite ingresar datos.
    //Dentro de la clase hay metodos y dependiendo que se quiera inglesar
    //se tomara cada metodo.
    Scanner leer =new Scanner(System.in);
    /*
     * El primer "Scanner" el tipo de la variable "leer".
     * Declarar nombre de la variable en este caso "leer".
     * Luego asigno con símbolo "=".
     * El metodo "Scanner (el segundo)" enviamos por el parametro 
     * (System.in)
    */
    //--------------------------------------------------------------------------
    //se crea uan variable cadena (String) que se útiliza para leer datos del 
    //usuario.
        String nombre;//tipo de dato equivalente a cadena.

        System.out.println("Ingrese tu nombre");//función "println", "System.out"
        //saca la variable.
        //Leemos el nombre de la persona en la variable nombre.
        nombre = leer.next();// Lo ingresado se asigna a la varable nombre.
        System.out.println("Hola mundo! Soy " + nombre + " y estoy programando en java");
        /*
        Dentro de una clase se colocan: datos, variables, información y todo el código
        que nos permite implementar lo que queresmos hacer.
        
        Los paquetes nos ayudan a organizar (se comporta como carpetas)
        los conjuntos de clases y también asistir en importar.
        Método: es un subprograma con un nuevo nombre. Los métodos se codifican
        dentro de las clases.
        Ide: entorno de desarrollo integrado IDE NetBeans.
         */
                             
    }
    
}
