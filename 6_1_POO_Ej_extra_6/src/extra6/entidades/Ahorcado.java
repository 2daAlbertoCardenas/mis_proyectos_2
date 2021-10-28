package extra6.entidades;
/**
 *
 * @author Cristian
 */
public class Ahorcado {
   private String palabra_a_burcar[],letra;
   private int cantidad_de_letras_encontradas,cantidad_de_jugadas_max,longitud_palabra;

    public Ahorcado() {  
    }

    public Ahorcado(String[] palabra_a_burcar, String letra, int cantidad_de_letras_encontradas, int cantidad_de_jugadas_max, int longitud_palabra) {
        this.palabra_a_burcar = palabra_a_burcar;
        this.letra = letra;
        this.cantidad_de_letras_encontradas = cantidad_de_letras_encontradas;
        this.cantidad_de_jugadas_max = cantidad_de_jugadas_max;
        this.longitud_palabra = longitud_palabra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getLetra() {
        return letra;
    }

    public int getLongitud_palabra() {
        return longitud_palabra;
    }

    public void setLongitud_palabra(int longitud_palabra) {
        this.longitud_palabra = longitud_palabra;
    }

    public String[] getPalabra_a_burcar() {
        return palabra_a_burcar;
    }

    public int getCantidad_de_letras_encontradas() {
        return cantidad_de_letras_encontradas;
    }

    public int getCantidad_de_jugadas_max() {
        return cantidad_de_jugadas_max;
    }

    public void setPalabra_a_burcar(String[] palabra_a_burcar) {
        this.palabra_a_burcar = palabra_a_burcar;
    }

    public void setCantidad_de_letras_encontradas(int cantidad_de_letras_encontradas) {
        this.cantidad_de_letras_encontradas = cantidad_de_letras_encontradas;
    }

    public void setCantidad_de_jugadas_max(int cantidad_de_jugadas_max) {
        this.cantidad_de_jugadas_max = cantidad_de_jugadas_max;
    } 
}

