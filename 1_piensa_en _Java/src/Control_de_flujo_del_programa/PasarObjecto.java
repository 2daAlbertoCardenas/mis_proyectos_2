
package Control_de_flujo_del_programa;


public class PasarObjecto {

    static void f(Carta y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Carta x = new Carta();
        x.c = 'a';
        System.out.println("I: x.c: " + x.c);
        f(x);
        System.out.println("2: x.c: " + x.c);
    }

}