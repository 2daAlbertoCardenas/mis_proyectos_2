package extra4.entidades;
/**
 *
 * @author Cristian
 */
public class NIF {
    private long DNI;
    private String letra;
    private long aux;

    public NIF() {
    }

    public NIF(long DNI, String letra, long aux) {
        this.DNI = DNI;
        this.letra = letra;
        this.aux = aux;
    }
    
    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }

    public String getLetra() {
        return letra;
    }

    public long getAux() {
        return aux;
    }

    public void setAux(long aux) {
        this.aux = aux;
    }
}

