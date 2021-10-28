package ejercicio8.servicio;
import ejercicio8.entidades.Cadena;
/**
 *
 * @author Cristian
 */
public class Cadena_Servicio {
    Cadena datos = new Cadena();
    public void cargar(String Fr_o_Pal) {
        datos.setFraseopalabra(Fr_o_Pal);
        datos.setLong_frase(Fr_o_Pal.length());
        System.out.print("La longitud de la Frase es: " + datos.getLong_frase() + "\n");
    }

    public int Mostrar_Vocales() {
        int vocales = 0;
        String fraseopalabra = datos.getFraseopalabra().toUpperCase();
        for (int i = 0; i < datos.getLong_frase(); i++) {
            switch (fraseopalabra.substring(i, i + 1)) {
                case "A":
                    vocales++;
                    break;
                case "E":
                    vocales++;
                    break;
                case "I":
                    vocales++;
                    break;
                case "O":
                    vocales++;
                    break;
                case "U":
                    vocales++;
                    break;
            }
        }
        return vocales;
    }
    
    public void invertir_frase(){
        String invertido="";
        for (int i = datos.getLong_frase(); i > 0; i--) {
            invertido=invertido.concat(datos.getFraseopalabra().substring(i-1, i));
        }
        System.out.println("La frase invertida:"+invertido);
    }
    
    
    
    public int Veces_Repetido(String Caracter){
        int repetido=0;
        String fraseopalabra = datos.getFraseopalabra().toUpperCase();
        for (int i = 0; i < datos.getLong_frase(); i++) {
            if(fraseopalabra.substring(i, i+1).equals(Caracter.toUpperCase())){
                repetido++;
            }   
        }
        return repetido;
    }

   public void Comparar_Longitud(String newfrase){
       int frase1 = datos.getFraseopalabra().length();
       int frase2= newfrase.length();
       if(frase1==frase2){
           System.out.println("Las 2 frases tiene la misma longitud");
       }else{
           System.out.println("Las 2 frases no tiene la misma longitud");
       }
   }
   
   public void Unir_Frase(String frase2){
       String Aux= datos.getFraseopalabra()+" "+frase2;
       System.out.println("La frase queda: "+Aux);
   }
    
   public void Reemplazar(String simbolo){
       String fraseopalabra=datos.getFraseopalabra().toUpperCase().replace("A", simbolo);
       System.out.println("La frase resultante: "+fraseopalabra);
   }
   
   public void Contiene(String Letra){
       int verificador=0;
       String fraseopalabra=datos.getFraseopalabra().toUpperCase();
       System.out.println(datos.getFraseopalabra());
       for (int i = 0; i < datos.getLong_frase(); i++) {
           if(fraseopalabra.substring(i, i+1).equals(Letra.toUpperCase())){
               System.out.println("La frase contiene la letra?: "+true);
               verificador=1;
               break;
             }   
       }
       if(verificador==0){
           System.out.println("La frase contiene la letra?: "+false);
       }
   }
}
