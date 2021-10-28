
package Ejercicio3_1_Principal;

import Ejercicio3_1_Entidades.Operacion;
import Ejercicio3_1_Servicios.Operacion_Servicios;

public class Main {

    public static void main(String[] args) {
        Operacion_Servicios serv1=new Operacion_Servicios();//Al paq. de servicios.
        Operacion op1=serv1.crearOperacion();//pertence a la paquete de entidades.
        /*El return "new Operacion(nro1, nro2)" del paquete "Ejercicio3_1_Servicios"
        , que en ella se encutra la clase "Operacion_Servicios" y el metodo
        "public Operacion crearOperacion()" me devuelve un nuevo objeto que se 
        asigna a "op1".*/
        
        System.out.println("suma: "+serv1.suma(op1.getNum1(),op1.getNum2()));
        System.out.println("resta:"+serv1.resta(op1));
        System.out.println("multiplicación: "+serv1.multiplicacion(op1));
        System.out.println("divición: "+serv1.divicion(op1));
    }
    
}
