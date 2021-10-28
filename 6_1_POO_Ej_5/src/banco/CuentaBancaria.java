
package banco;

import Entidades.Cuenta;
import servicios.ServiciosCuentas;

public class CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosCuentas c=new ServiciosCuentas();
        Cuenta usuario=c.CrearCuenta();
        c.IngresoSaldo(usuario);
        c.RetiroSaldo(usuario);
        //c.consulta(usuario);
        System.out.println(usuario.toString());
            
    }
    
}
