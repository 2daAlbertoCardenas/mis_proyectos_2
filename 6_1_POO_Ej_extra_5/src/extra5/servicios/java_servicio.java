package extra5.servicios;
import extra5.entidades.java;
import java.util.Scanner;
/**
 *
 * @author Cristian
 */
public class java_servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    java datos = new java();

    public void adivina() {
        String aux[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "setiembre", "octubre", "noviembre", "diciembre"};
        datos.setMeses(aux);
        String meses[] = datos.getMeses();
        String mes_secreto = meses[1];
        String adivinar="";
        do {
            System.out.print("Introduzca el nombre del mes en minúsculas:");
            adivinar = leer.next();
            if (adivinar.equals(mes_secreto)) {
                System.out.print("¡Ha acertado! ");
            } else {
                System.out.print("No ha acertado ");
            }
        } while (!adivinar.equals(mes_secreto));
    }
}

