/*
 * Realizar la multiplicación de un vector por una matriz
dado un vector 1xN y una matriz NxM, el reusltado del producto
es 12xN.
Ej. vector 1x2*matriz*2x3=producto 1x3
v=|3,5|*m=|4,8,6|=|3*4+5*2,3*8+5*1,3*6+5*7| = |22,29,53|
          |2,1,7|
 */
package egg.introjava;

import java.util.Scanner;

public class productoVectorMatriz {

    public static void main(String[] args) {

        //Declaración y creación de un vector
        //tipo[] nombreVector=new tipo[Tamaño];
        //declarar un arreglo de una dimensión
        int[] vector;
        //crear en memoria (constructor/dimensionar) con el valor pro defecto
        //(cero para los enteros)
        vector = new int[2];
        //los dos pasos en una línea, tanto la creación como declaración
        //se realizan en una sola linea.
        int[] producto = new int[3];

        //Declaración y reación de arreglos con una matriz
        //tipo [][] nombreMatris =new tipo[filas][columnnas]}
        //declaración e inicialización con valores predeterminados
        int[][] matriz = {{4, 8, 6}, {2, 1, 7}};

        //Declaración y creación de arreglos genéricos
        //tipo[][].....[] nombreArreglo= new tipo[cardinalidad 1][cardinalidad 2]..........[cardinalidad N]
        System.out.println("Ingrese los valores del vector de tamaño " + vector.length + ":");
        Scanner leer = new Scanner(System.in);//Definimos leer aquel que toma los datos
                                              //por el metodo Scanner.
        //int=0, porque los subíces de los arreglos en Java inician n cero
        for (int i = 0; i < vector.length; i++) {//con la posición menor nos aseguramos
                                                 //que i=vector.length-1
                                                 //es decir i=longitud-1
            System.out.print("v[" + i + "]=");
            //acceder al valor i del vector
            vector[i] = leer.nextInt();
        }

        //Multiplicar vector por matriz
        int sum;
        //...recorro el vectro y multiplico
        for (int j = 0; j < matriz[0].length; j++) {
            sum = 0;
            //recorro el vector y multiplico
            for (int i = 0; i < vector.length; i++) {
                sum += vector[i] * matriz[i][j];

            }
            producto[j] = sum;
        }

        String aux = "";

        //Mostrar vector
        System.out.println("*Vector");
        //bucle for "mejorado"(enhanced)
        //for(tipo elemento: vector)
        //recorre se al vector o matriz sin necesidad de poner los subindicies
        for (int elemento : vector) {
            aux = aux + "_" + elemento;//aux es un caracter para su impresión.
                                       //De está forma se concatena cadenas,
                                       //para se impresas.
                                     
        }

        System.out.println(aux);

        //Mostrar matriz
        System.out.println("\n*Matriz: ");
        //para cada fila de la matriz
        for (int[] fila : matriz) {
            aux = "";
            //para cada elemento de la fila
            for(int elemento: fila){
                aux+=" "+elemento;
            }
            System.out.println(aux);
        }
        //Mostrar resultado
        aux="";
        System.out.println("\n* Vector x Matriz: ");
        for(int elemento: producto){
            aux+="  "+elemento;
        }
        System.out.println(aux);

    }
    
}
