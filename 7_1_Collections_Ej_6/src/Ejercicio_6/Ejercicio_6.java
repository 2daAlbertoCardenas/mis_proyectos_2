package Ejercicio_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashMap<String, String> Productos = new HashMap();
        String Prod = "", Prec = "", dato = "S";

        do {
            System.out.println("<<<<< MENU >>>>>");
            System.out.println("1-Agregar Producto");
            System.out.println("2-Modificar Precio Producto");
            System.out.println("3-Borrar Producto");
            System.out.println("4-Mostrar todos los Produsctos");
            System.out.println("5-Salir");
            switch (leer.nextInt()) {
                case 1:
                    System.out.print("Nombre Producto:");
                    Prod = leer.next();
                    System.out.print("Precio Producto");
                    Prec = leer.next();
                    Productos.put(Prod, Prec);
                    break;
                case 2:
                    System.out.print("Nombre Producto:");
                    Prod = leer.next();
                    if (Productos.containsValue(Prod)) {
                        System.out.print("Precio Producto");
                        Prec = leer.next();
                        Productos.put(Prod, Prec);
                    } else {
                        System.out.println("El producto no se encuentra cargado");
                    }
                    break;

                case 3:
                    System.out.print("Nombre Producto:");
                    Prod = leer.next();
                    if (Productos.containsKey(Prod)) {
                        Productos.remove(Prod);
                    } else {
                        System.out.println("El producto no se encuentra cargado");
                    }
                    break;
                case 4:
                    for (Map.Entry<String, String> aux : Productos.entrySet()) {
                        String Producto = aux.getKey();
                        String Precio = aux.getValue();
                        System.out.println("Producto: " + Producto + " Precio: " + Precio);
                    }
                    break;
                case 5:
                    System.out.println("¿Desea realizar otro Operacion?(S/N)");
                    dato = leer.next();
                    break;
                default:
                    System.out.println("Opcion Erronea");
            }

        } while (dato.equals("S"));

    }

}



