package extra6.servicio;
import extra6.entidades.Ahorcado;
import java.util.Scanner;
/**
 *
 * @author Cristian
 */
public class Ahorcado_Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ahorcado datos = new Ahorcado();

    public void Crear_Juego() {
        System.out.println("<<< MODO CREADOR >>>");
        System.out.print("➤Ingrese Palabra:");
        String Palab = leer.next();
        String aux[] = new String[Palab.length()];
        for (int i = 0; i < Palab.length(); i++) {
            aux[i] = Palab.substring(i, i + 1);
        }
        datos.setPalabra_a_burcar(aux);
        System.out.print("➤Ingrese la cantidad de intentos:");
        datos.setCantidad_de_jugadas_max(leer.nextInt());
        datos.setCantidad_de_letras_encontradas(0);
        datos.setLongitud_palabra(datos.getPalabra_a_burcar().length);
        System.out.println("➤Longitud de la palabra: " + datos.getLongitud_palabra());
//        System.out.println("es:"+Arrays.toString(datos.getPalabra_a_burcar()));
    }

    public void longitud() {
        datos.setLongitud_palabra(datos.getPalabra_a_burcar().length);
        System.out.println("Longitud de la palabra:: " + datos.getLongitud_palabra());
    }

    public void buscar_letra() {
        System.out.println("\n<<< JUEGO EGG - AHORCADO >>>");
        System.out.println("Ingrese una letra:");
        datos.setLetra(leer.next());
        boolean valor = false;
        longitud();
        String palabra_a_burcar[] = datos.getPalabra_a_burcar();
        for (int i = 0; i < datos.getLongitud_palabra(); i++) {
            if (palabra_a_burcar[i].equals(datos.getLetra())) {
                valor = true;
            }
        }
        if (valor == true) {
            System.out.println("Mensaje: La letra pertenece a la palabra");
        } else {
            System.out.println("Mensaje: La letra no pertenece a la palabra");
        }
    }

    public boolean Encontradas() {
        String palabra_a_burcar[] = datos.getPalabra_a_burcar();
        boolean estado = false;
        for (int i = 0; i < datos.getLongitud_palabra(); i++) {
            if (palabra_a_burcar[i].equals(datos.getLetra())) {
                datos.setCantidad_de_letras_encontradas(datos.getCantidad_de_letras_encontradas() + 1);
                estado = true;
            } else {
                estado = false;
            }
        }
        System.out.println("Número de letras (encontradas, faltantes): (" + datos.getCantidad_de_letras_encontradas() + "," + (datos.getLongitud_palabra() - datos.getCantidad_de_letras_encontradas()) + ")");
        return estado;
    }

    public void Intentos() {
        int intentos = datos.getCantidad_de_jugadas_max();
        datos.setCantidad_de_jugadas_max(intentos - 1);
        System.out.println("Número de oportunidades restantes: " + datos.getCantidad_de_jugadas_max());
    }

    public void juego() {
        Crear_Juego();
        do {
            buscar_letra();
            Encontradas();
            Intentos();
        }while(datos.getCantidad_de_jugadas_max()!=0 && (datos.getLongitud_palabra() - datos.getCantidad_de_letras_encontradas())!=0 );
        if(datos.getCantidad_de_jugadas_max()==0){
            System.out.println("➤Mensaje: Lo sentimos, no hay más oportunidades");
        }else{
            System.out.println("➤Mensaje: ¡Felicidades! Gano el juego");
        }
    }
}

