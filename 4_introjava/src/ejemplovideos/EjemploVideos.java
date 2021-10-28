package ejemplovideos;

import java.util.Scanner;

public class EjemploVideos {

    public static void main(String[] args) {
        
        int resultado=suma(10,10);// se captura y se almacena en una varible
                                  //en esté caso variable "resultado".
                                  //La variable es local por lo que no se 
                                  //ve afectada otras variables del mismo nombre
                                  //en otros metodos/funciones.
        
        System.out.println(resultado);                          
        saludoPersonilizado("Chiquito");
        
        Scanner leer=new Scanner(System.in);
        
        String nombre=leer.next();
        
        saludoPersonilizado(nombre);
        saludoPersonilizado(leer.next());//fomar de tomar datos.
    }
    /*
        El valor de Int (valor primitivo, solo guarda valores), que a diferencia
    de la clase alverga metodos y funcionanalidades.
    */
    public static int suma(int a,int b){ //Accesibilidad "public".
                                         //Donde el progama puede encontrar
                                         //a está función "static", también
                                         //se dice que esta no necesita ser
                                         //instaciador por un objeto sino que 
                                         //se encuentra de forma estatica en la
                                         //memoria.
                                         //Tipo de dato "int" al que devuelve.
                                         //Nombre de la función "suma".
                                         //Entre parentesis estan los 
                                         //parametros y que en estás se colocan
                                         //previamente el tipo del parametro
                                         //"a" y "b".
                                         //Si en vez de int/void estó quiere 
                                         //decir que no devuelve nada. 
        //Logica
        int resultado=a+b;
        return resultado;
    }
    
    
    public static void saludoPersonilizado(String nombre) {
        System.out.println("Hola "+nombre+" como estas?");
    }
}
