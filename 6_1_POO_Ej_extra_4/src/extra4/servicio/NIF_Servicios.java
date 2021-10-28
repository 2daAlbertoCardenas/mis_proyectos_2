package extra4.servicio;

import extra4.entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class NIF_Servicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    NIF datos= new NIF();
    
    public void crear_NIF(){
        System.out.print("INGRESE DNI (SIN PUNTOS):");
        datos.setDNI(leer.nextLong());
        datos.setAux(datos.getDNI()%23);
    }
    
    public void Mostrar(){
        String cadena[] = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E" };
        int posicion=(int)datos.getAux();
        System.out.println("<<< NIF >>>");
        System.out.println(datos.getDNI()+"-"+cadena[posicion]);  
    }
    
}

