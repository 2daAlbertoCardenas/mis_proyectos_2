package ejercicio11;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author Cristian
 */
public class ejercicio11 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Date fecha_actual=new Date();
        
        System.out.print("Ingrese año:");
        int year=leer.nextInt();
        year-=1900;
        System.out.print("Ingrese el mes:");
        int mes=leer.nextInt();
        mes-=1;
        System.out.print("Ingrese dia:");
        int dia=leer.nextInt();
        System.out.print("Ingrese hora:");
        int hora=leer.nextInt();
        System.out.print("Ingrese minutos:");
        int min=leer.nextInt();
        System.out.print("Ingrese segundos:");
        int seg=leer.nextInt();
        Date fecha_usuario=new Date(year,mes,dia,hora,min,seg);
        System.out.println("<<<< FECHA ACTUAL >>>\n"+fecha_actual);
        System.out.println("<<<< FECHA USUARIO >>>\n"+fecha_usuario);
        int diferencia_year=fecha_actual.getYear()-fecha_usuario.getYear();
        System.out.println("Hay "+diferencia_year+" de la fecha actual");
    } 
}

