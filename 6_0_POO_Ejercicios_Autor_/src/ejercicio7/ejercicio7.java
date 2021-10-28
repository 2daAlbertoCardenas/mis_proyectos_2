/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import ejercicio7.entidades.Persona;
import ejercicio7.servicio.Persona_Servicios;

/**
 *
 * @author Cristian
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona_Servicios datos = new Persona_Servicios();
        int mayores = 0, menores = 0, p_ideal = 0, p_bajo = 0, sobre_p = 0;
        Persona P1 = datos.datos();
        System.out.println(P1);
        datos.CalcularMC();
        datos.verificar();
        datos.MC_Edad();
        if (P1.getMC() == -1) {
            p_ideal += 1;
        }
        if (P1.getMC() == 0) {
            p_bajo += 1;
        }
        if (P1.getMC() == -1) {
            sobre_p += 1;
        }
        if (P1.getEdad() >= 18) {
            mayores += 1;
        } else {
            menores += 1;
        }

        Persona P2 = datos.datos();
        System.out.println(P2);
        datos.CalcularMC();
        datos.verificar();
        datos.MC_Edad();
        if (P2.getMC() == -1) {
            p_ideal += 1;
        }
        if (P2.getMC() == 0) {
            p_bajo += 1;
        }
        if (P2.getMC() == -1) {
            sobre_p += 1;
        }
        if (P2.getEdad() >= 18) {
            mayores += 1;
        } else {
            menores += 1;
        }
        
        Persona P3 = datos.datos();
        System.out.println(P3);
        datos.CalcularMC();
        datos.verificar();
        datos.MC_Edad();
        if (P3.getMC() == -1) {
            p_ideal += 1;
        }
        if (P3.getMC() == 0) {
            p_bajo += 1;
        }
        if (P3.getMC() == -1) {
            sobre_p += 1;
        }
        if (P3.getEdad() >= 18) {
            mayores += 1;
        } else {
            menores += 1;
        }

        
        Persona P4 = datos.datos();
        System.out.println(P4);
        datos.CalcularMC();
        datos.verificar();
        datos.MC_Edad();
        if (P4.getMC() == -1) {
            p_ideal += 1;
        }
        if (P4.getMC() == 0) {
            p_bajo += 1;
        }
        if (P4.getMC() == -1) {
            sobre_p += 1;
        }
        if (P4.getEdad() >= 18) {
            mayores += 1;
        } else {
            menores += 1;
        }
        
        System.out.println("% Mayores: " + (25 * mayores));
        System.out.println("% Menores: " + (25 * menores));
        System.out.println("% Peso Ideal: " + (25 * p_ideal));
        System.out.println("% Peso Bajo: " + (25 * p_bajo));
        System.out.println("% SobrePerso: " + sobre_p);
    }
}
