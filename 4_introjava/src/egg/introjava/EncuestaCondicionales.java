
package egg.introjava;

import java.util.Scanner;
/*
 * Ejecución paso a paso o debug/depurador ejecución paso a paso.
 * identificar los puntos de interrupcioón/break-points.
 */

public class EncuestaCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Clasifique la peli de 1 a 5 estrellas");
        opinion = leer.nextInt();
        /*debug el archivo/file y previo pondo un breackpoint y con "new watch" 
        selecciono el variable para visualizar.*/
        if (opinion >= 1 && opinion <= 5) {
            switch (opinion) {
                case 1://Las opniones 1 y dos imprimen lo mismo.
                case 2://Las  opniones 1 y dos imprimen lo mismo.
                    System.out.println("nos sentimos apenados que ho hayas disfrutado la peli...");
                    break;//Detiene la ejecución y sale del switch.
                case 3:
                    System.out.println("has calificado la pelicula como buena.");
                    break;
                case 4:
                    System.out.println("has calificado la pelicula como muy buena.");
                    //break;
                case 5:
                    System.out.println("Fantasitico lo calificaste como excelente");
                    break;
                //El quivalente al caso del *de otro modo* es el *defaul*
                //default:
                // <acciones>         
                }

        }
        else 
            if(opinion <0){//"else if", es concatenar las palabras.
                System.out.println("Introducjo negativo");
            }
            else 
                if(opinion==0){
                    System.out.println("El valor "+opinion+" no es valido y no se tomara en cuenta.");
                }
                else{
                    System.out.println(opinion+" valores muy altos");
                }
        
    }

}
