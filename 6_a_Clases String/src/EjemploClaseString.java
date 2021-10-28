
public class EjemploClaseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Constructores
        //String nombre=new String("ALEJANDRO");

        //Asignación
        String nombre1 = "LEANDRO";
        String nombre2 = "PABLO";
        String nombre3 = "LEANDRO";
        String apellido = "                           SPADARO         v";

        //Metodo equal= retorna verdadero si la cadena es igual al objeto del parámetro
        if (nombre1.equals("LEANDRO")) {
            System.out.println("Nombre1= " + nombre1);
        }
        if (nombre1.equals(nombre2)) {
            System.out.println("nombre1 es igula a nombre2");

        } else {
            System.out.println("Nombre1 no es igual");
        }

        //Metodo length -Retorna la sub cadena desde el carácter del primer 
        //parámetro hasta el carácter del segundo parámetro.
        int longitud = nombre1.length();
        System.out.println("longitud " + longitud);

        //Metodo substring- Retorna la buacadena desde el carácter del primer
        //parámetro hasta el carácter del segundo parámetro.
        String parte = nombre1.substring(0, 3);//DICE DE la posicion 0 a la 2
        System.out.println("Nombre completo: " + nombre1);
        System.out.println("Parte del nombre: " + parte);

        //Método valueOf- Convierte en cadena el dato del parámetro.
        int valorEdad = 10;
        String edad = String.valueOf(valorEdad);
        System.out.println("La edad es: " + edad);

        //Método trin. Saca los espacios en blanco en los extremos de la cadena
        System.out.println("Apellido con espacios:" + apellido);
        apellido = apellido.trim();
        System.out.println("Apellido sin escapcios:" + apellido);

        //Método toLowCase-Retorna la cadena en minúscula.
        System.out.println("Cadena en mayúsculas: " + nombre1);
        String nombreEnMinusculas = nombre1.toLowerCase();
        System.out.println("Nombre en minúsculas: " + nombreEnMinusculas);

        //Método toUpperCase = Retorna la cadena en mayúsculas.
        String nombre4 = "sdfsfsa";
        System.out.println("cadena en minúsculas : " + nombre4);
        System.out.println("nombre en mayúscula: " + nombre4.toUpperCase());

        //Método indexOf = Retorna el indice de la primeta ocurrencia de la cadena del parámetro.
        String nombreApellido = "LEANDRO SPADARO";
        int posicion = nombreApellido.indexOf('E');
        System.out.println("posición de la letra E: " + posicion);
        System.out.println("Posición de la letra O: " + nombreApellido.indexOf('O'));
        System.out.println("Posicion de la letra Z: " + nombreApellido.indexOf('Z'));
    }
}

