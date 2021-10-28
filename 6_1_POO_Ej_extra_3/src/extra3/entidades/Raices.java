package extra3.entidades;
/**
 *
 * @author Cristian
 */
public class Raices {
    private double a,b,c,aux;

    public Raices() {
    }
    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setAux(double aux) {
        this.aux = aux;
    }

    public double getAux() {
        return aux;
    }

    @Override
    public String toString() {
        return "Raices{" + "a=" + a + ", b=" + b + ", c=" + c + ", aux=" + aux + '}';
    }
}

