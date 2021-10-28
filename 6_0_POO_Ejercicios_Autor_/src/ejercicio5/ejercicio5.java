/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import ejercicio5.entidades.Cuenta_Bancaria;
import ejercicio5.servicios.Cuenta_Bancaria_Servicio;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cuenta_Bancaria_Servicio CBD = new Cuenta_Bancaria_Servicio();
        Cuenta_Bancaria CBO = CBD.datoscliente();
        Menu();
        Operaciones(CBO);

    }

    public static void Menu() {
        System.out.println("MENU");
        System.out.println("1-Ingresar dinero");
        System.out.println("2-Retirar dinero");
        System.out.println("3.Extraccion Rapida");
        System.out.println("4-Consultar Saldo");
        System.out.println("5-Consultar Mis Datos");
        System.out.println("6-Salir");
    }

    public static void Operaciones(Cuenta_Bancaria CBO) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opc;
        String verificacion = "";
        do {
            System.out.print("opc ➤");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.print("Ingrese monto: $");
                    CBO.ingresar(leer.nextDouble());
                    break;
                case 2:
                    System.out.print("Ingrese monto: $");
                    CBO.retirar(leer.nextDouble());
                    break;
                case 3:
                    System.out.print("Ingrese monto: $");
                    CBO.extraccion_rapida(leer.nextDouble());
                    break;
                case 4:
                    System.out.print("Su saldo es: $" + CBO.getSaldo() + "\n");
                    break;
                case 5:
                    System.out.println("Datos de la cuenta:");
                    System.out.println(CBO.toString());
                    break;
                case 6:
                    System.out.println("¿Desea terminar la operacion (S/N)?");
                    verificacion = leer.next();
                default:
                    if (!verificacion.equals("S")) {
                        System.out.println("La opccion elegida es incorrecta.");
                    }
            }
        } while (opc < 6 || !verificacion.equals("S"));
    }
}
