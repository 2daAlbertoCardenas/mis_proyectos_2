package extra3.servicios;
import extra3.entidades.Raices;
import java.util.Scanner;
/**
 *
 * @author Cristian
 */
public class Raices_Servicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Raices datos = new Raices();

    public Raices cargar_valores() {
        System.out.println("<<< VALORES >>>");
        System.out.print("a:");
        datos.setA(leer.nextDouble());
        double a = datos.getA();
        System.out.print("b:");
        datos.setB(leer.nextDouble());
        double b = datos.getB();
        System.out.print("c:");
        datos.setC(leer.nextDouble());
        double c = datos.getC();
        return new Raices(a, b, c);
    }

    public double Descriminante() {
        double descr = ((double) Math.pow(datos.getB(), 2)) - 4 * datos.getA() * datos.getC();
        datos.setAux(descr);
        return descr;
    }

    public boolean Tiene_Raices() {
        if (datos.getAux() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Tiene_Raiz() {
        if (datos.getAux() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void Obtener_Raices() {
        double a = datos.getA();
        double b = datos.getB();
        double c = datos.getC();
        double b2= Math.pow(b, 2);
        if(Tiene_Raices()){
            double Raiz1= (-b-Math.sqrt(b2-4*a*c))/(2*a);
            double Raiz2= (-b+Math.sqrt(b2-4*a*c))/(2*a);
            System.out.println("Raiz 1: "+Raiz1);
            System.out.println("Raiz 2: "+Raiz2);
        }else{
            System.out.println("No tiene raices o solo tiene una raiz");
        }
    }
    
    public void Obtener_Raiz() {
        double a = datos.getA();
        double b = datos.getB();
        double c = datos.getC();
        double b2= Math.pow(b, 2);
        if(Tiene_Raiz()){
            double Raiz= (-b)/(2*a);
            System.out.println("Raiz: "+Raiz);   
        }else{
            System.out.println("No tiene raices o tiene 2 raiz");
        }
    }
    
    public void Calcular(){
        if(Tiene_Raices()){
            Obtener_Raices();
        }else{
            if(Tiene_Raiz()){
                Obtener_Raiz();
            }else{
                System.out.println("No tiene solucion de raices");
            }
        }
    }
}

