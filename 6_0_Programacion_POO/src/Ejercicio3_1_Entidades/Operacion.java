
package Ejercicio3_1_Entidades;


public class Operacion {
    private int num1;
    private int num2;

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {//a mis atributos los inicializa con valores "null".
                        //sin este constructor es la clase me pedira que asigne
                        //valres. Esto esta implicito.
    }

  
    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    
    
}
