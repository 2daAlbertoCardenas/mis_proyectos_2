
package Ejercicio3_1_Servicios;

import Ejercicio3_1_Entidades.Operacion;
import java.util.Scanner;


public class Operacion_Servicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Operacion crearOperacion(){
        System.out.println("Ingrese primer nro: ");
        int nro1=leer.nextInt();
        System.out.println("Ingrese seg. nro: ");
        int nro2=leer.nextInt();
        return new Operacion(nro1, nro2);
    }
    public int suma(int num1,int num2){
        return num1+num2;
    }
    public int resta(Operacion op1){
        return op1.getNum1()-op1.getNum2();
        
    }
    public float multiplicacion(Operacion op1) {
        return op1.getNum1() * op1.getNum2();
    }
    public float divicion(Operacion op1){
        if (op1.getNum2()==0) {
            System.out.println("divicion no resuelta por que la no se puede realizar la divición por cero");
            return '0';
        } else {
            float a=op1.getNum1(),b=op1.getNum2(),c=a/b;
            return c;
        }
    }
}
