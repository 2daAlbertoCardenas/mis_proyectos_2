/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razas_perros;


import razas_perros.servicios.Servicios;

/*
 *
 * @author luis
 */
public class ListarPerros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Servicios serv=new Servicios();
      serv.introducir_dato();
      serv.mostrar_razas();
      
    }

}
